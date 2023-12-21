package kr.re.kitech.biz.xom.core.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.AbstractContextMapper;
import org.springframework.ldap.query.LdapQueryBuilder;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.xom.base.enums.Attaches;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.model.SessionUserHeader;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AttachService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachListVo;
import kr.re.kitech.biz.xom.core.vo.AttachVo;


/**  
 * @ClassSubJect 공통첨부파일테이블 관련 처리를 담당하는 MyBatis Impl
 * @Class Name AttachServiceImpl.java
 * @Description 공통첨부파일테이블  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/18   박정일             최초생성
 * 
 * @author 박정일
 * @since 2022/03/18
 * @version 1.0
 * @see
 * 
 */
@Service("attachServiceImpl")
public class AttachServiceImpl  extends EgovAbstractServiceImpl implements AttachService {

    @Resource(name="attachDAO")
    private AttachDAO attachDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Autowired
	private LdapTemplate template;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#selectListAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public List<AttachVo> selectListAttach(String fileNo) {
		return attachDAO.selectListAttach(fileNo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#selectListCountAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public long selectListCountAttach(AttachVo attachVo) {
		return attachDAO.selectListCountAttach(attachVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#selectAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public AttachVo selectAttach(AttachVo attachVo) {
		AttachVo resultVO = attachDAO.selectAttach(attachVo);			
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#insertAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public int insertAttach(AttachVo attachVo) {
		return attachDAO.insertAttach(attachVo);	
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#updateAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public int updateAttach(AttachVo attachVo) {				
		return attachDAO.updateAttach(attachVo);	   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#deleteAttach(kr.re.kitech.biz.xom.core.vo.AttachVo)
	 */
	public boolean deleteAttaches(AttachListVo attachListVo) {
		List<Boolean> results = new ArrayList<>();
		List<AttachVo> attaches = attachListVo.getAttachVoList();
		attaches.forEach((attach) -> {
			// RDB 삭제
			if (0 < attachDAO.deleteAttach(attach)) {
				String path = Attaches.WHICH_IPMS.getCode().equals(attach.getWhich()) ? Attaches.PAT_STORAGE_ROOT.getCode() : Attaches.BIZ_STORAGE_ROOT.getCode();
				AppLog.info("스토리지에서 삭제 ==> [" + path + attach.getFileKey() + "]");
				
				File storedFile = new File(path + attach.getFileKey());
				if (storedFile.exists()) {
					// 스토리지 삭제
					results.add(storedFile.delete());	
				}
			}
		});
		
		// 하나라도 삭제되었다면 true
		return results.stream().anyMatch( result -> {
			return result;
		});
	}

	@Override
	public AttachVo getRealAttach(String fileName, String orgName, Business business, HttpServletRequest request) {
		// TODO: EIP2.0 비즈니스 로직 필요: /kitech/com/jsp/FileDownloadProcess.jsp
		AttachVo attach = new AttachVo();
		try {
			if (business.getName().equalsIgnoreCase("IMG")) {
				// 이미지 파일 다운로드
				if (fileName.equals("")) {
					throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류: fileName 파라미터가 올바르지 않습니다.");
				}
				String[] realName = fileName.substring(fileName.lastIndexOf("/")+1).split("[.]");
				
				attach.setPath("");
				attach.setFile_nm(realName[0]);
				attach.setExtens_nm(realName[1]);
				attach.setAttachFullPath(fileName);
				attach.setOrgFile(realName[0] + "." + realName[1]);
			} else if (business.getName().equalsIgnoreCase("OLD")) {
				// 업무별 저장 파일 다운로드
				String realNameParam = request.getParameter("realName");
				
				if (realNameParam == null) {
					throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류4: 암호화 전 첨부파일명이 올바르지 않습니다.");
				}
				
				String[] realName = realNameParam.split("[.]");
				AppLog.debug("realNameParam------------------"+realNameParam);
				
				
				attach.setPath("");
				attach.setFile_nm(realName[0]);
				attach.setExtens_nm(realName[1]);
				attach.setOrgFile(realName[0] + "." + realName[1]);
				attach.setAttachFullPath(fileName);
			} else {
				if (fileName.equals("")) {
					throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류: fileName 파라미터가 올바르지 않습니다.");
				}
			
				if (business.getName().equalsIgnoreCase("EPU")) {
					attach.setAttach_file_no(getEpuAttachFileNo(fileName));
					attach.setSeq(getEpuAttachFileSeq(fileName));
					attach = attachDAO.selectEpuAttach(attach);
				} else {
					attach.setAttach_file_no(getAttachFileNo(fileName));
					attach.setSeq(getAttachFileSeq(fileName));
					attach = attachDAO.selectAttach(attach);
				}
			}
			attach.setAttachFullPath(getFileRoot(fileName, business.getName(), request) + attach.getAttachFullPath());
		} catch (NullPointerException nullException) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류: 파라미터 값이 올바르지 않습니다.");
		} catch (IndexOutOfBoundsException outofBound) {
			throw new KitechException(Exceptions.ERROR, Business.XOM, "파라미터 오류: 파라미터 값이 올바르지 않습니다.");
		}
		return attach;
	}
	
	/**
	 * 첨부파일번호 추출
	 */
	private String getEpuAttachFileNo(String fileName){
	    return fileName.substring(0,12);
	}
	
	/**
	 * 첨부파일시퀀스 추출
	 */
	private String getEpuAttachFileSeq(String fileName){
	    return fileName.substring(12,fileName.length());
	}
	
	/**
	 * 첨부파일번호 추출
	 */
	private String getAttachFileNo(String fileName){
	    return fileName.substring(0,13);
	}
	
	/**
	 * 첨부파일시퀀스 추출
	 */
	private String getAttachFileSeq(String fileName){
	    return fileName.substring(13,fileName.length());
	}
	
	private String getFileRoot(String fileName, String bizKind, HttpServletRequest request) {
		// 0. 디폴트: 구매조달/지재권이 아닌 모든 경우
		String root = Attaches.BIZ_STORAGE_ROOT.getCode();
//		HttpSession session = request.getSession();
		SessionUserHeader session = KitechContextUtil.getSession();
		try {
			bizKind = bizKind == null ? "" : bizKind.trim();
			
			if (Business.IMG.getName().equals(bizKind)) {
				root += Attaches.IMG_STORAGE_ROOT.getCode();	// 1. 이미지파일의 경우.(IMG)
			} else if (Business.OLD.getName().equals(bizKind)) {
				root = Attaches.OLD_STORAGE_ROOT.getCode();		// 2. 암호화 이전 파일의 경우.(OLD)
			} else if (Business.EPU.getName().equals(bizKind)) {
				root = Attaches.EPU_STORAGE_ROOT.getCode();		// 3. 구매조달인 경우.(NAS)
			} else if (Business.PAT.getName().equals(bizKind)) {
				root = Attaches.PAT_STORAGE_ROOT.getCode();		// 4. 지재권 스냅샷에서 호출되는 경우(IPMS)
			} else { // 5. 기타
				String serviceId = session.getServiceId();
				AppLog.debug("ServiceId = " + serviceId);
				if (serviceId == null || "".equals(serviceId) || "X000".equals(serviceId)) {
					throw new KitechException(Exceptions.ERROR, Business.XOM, "세션만료");
				}
				
				if (serviceId != null && serviceId.indexOf("R23") == 0 && fileName.indexOf("I") == 0) {
					// 연구관리 소연심의안건산정 예외처리.
					root = Attaches.PAT_STORAGE_ROOT.getCode();
				}
			
				if (serviceId != null) {
					// Ldap 에서 서비스 검색
					List<Map<String,String>> serviceList = template.search(LdapQueryBuilder.query().where("serviceId").is(serviceId), serviceMapper());
					
					if (serviceList != null && serviceList.size() == 1) {
						Map<String,String> map = serviceList.get(0);
						String topDivCode = map.get("topDivCode");
						String middleDivCode = map.get("middleDivCode");
						if ( (topDivCode != null && topDivCode.equals("1070000000")) ||			// IPMS 스토리지 사용 중메뉴 코드(지재권 관련 메뉴)
							 (middleDivCode != null & middleDivCode.equals("1016330000")) ) {
							 	// 4. 지재권 업무단의 경우. (IPMS)
							 	if (fileName.indexOf("I") == 0) {
							 		root = Attaches.PAT_STORAGE_ROOT.getCode();
								}
						}
					}
				}
			}
		} catch (Exception e) {
			// 세션 만료 혹은 수행중 에러 발생 시 업무 기본 파일 저장 경로 반환
			root = Attaches.BIZ_STORAGE_ROOT.getCode();
			e.printStackTrace();
		}
		return root + (!(Business.EPU.getName().equals(bizKind)) ? File.separator : "");
	}
	
	private AbstractContextMapper<Map<String,String>> serviceMapper() {
		return new AbstractContextMapper<Map<String,String>>() {			
			@Override
			protected Map<String,String> doMapFromContext(DirContextOperations ctx) {
				Map<String,String> service = new HashMap<>();
				service.put("cn", ctx.getStringAttribute("cn"));
				service.put("topDivCode", ctx.getStringAttribute("topDivCode"));
				service.put("middleDivCode", ctx.getStringAttribute("middleDivCode"));
				return service;
			}
		};
	}
	
	/**
	 * 첨부파일 번호에 해당하는 MAX SEQ 를 조회한다.
	 * @param attachVo
	 * @return
	 * @throws Exception
	 */
	public String selectMaxSeq(AttachVo attachVo) {
		AttachVo resultVO = attachDAO.selectMaxSeq(attachVo);
        return (null == resultVO ? "01" : resultVO.getSeq());
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.xom.core.service.AttachService#updateAttachForValid(java.util.List)
	 */
	@Override
	public int updateAttachForValid(List<String> attachNos) {
		return attachDAO.updateAttachForValid(attachNos);
	}
	
	/** 
	 *
	 *
	 *	모바일 용 첨부파일 저장
	 * @throws Exception 
	 *
	 *
	 */
	@Override
	public void saveMobileAttachFile(AttachVo vo) throws Exception {
		try {
			String urlStr = vo.getFileUrl();
			String fileFullName = vo.getFileName();
			String fileExt = fileFullName.substring(fileFullName.lastIndexOf(".") + 1);
			String fileName = fileFullName.substring(0, fileFullName.lastIndexOf("."));
			String seq = ( null != vo.getSeq() && !"".equals(vo.getSeq()) ) ? vo.getSeq() : this.selectMaxSeq(vo);
			String path = DateUtil.getCurrentDate(DateUtil.yyyyMMdd, "/") + "/";
			String fileFullPath = path + vo.getAttach_file_no() + seq;
			
			if (vo.getEtc().equals("N")) {	
				URL url = new URL(urlStr);
				
				System.out.println("fileFullName : " + fileFullName);
				System.out.println("FileName : " + fileName);
				System.out.println("FileExt : " + fileExt);
				
	//			BufferedInputStream in = new BufferedInputStream(url.openStream());
				
				ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
				File dir = new File(Attaches.BIZ_STORAGE_ROOT.getCode() + "/" + path);
				if (!dir.exists()) {
					dir.mkdirs();
				}
				FileOutputStream fileStream = new FileOutputStream(Attaches.BIZ_STORAGE_ROOT.getCode() + "/" + fileFullPath);
				
				long size = fileStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
				fileStream.close();
				String sizeStr = getSize(size);
				System.out.println("Download Done. Downloaded Size => " + sizeStr);
	//			byte bytes[] = new byte[1024];
	//			int bytesRead;
	//			while ((bytesRead = in.read(bytes, 0, 1024)) != -1) {
	//				fileStream.write(bytes, 0, bytesRead);
	//			}
	//			fileStream.close();
				vo.setSeq(seq);
				vo.setFile_size(sizeStr);
				vo.setFile_nm(fileName);
				vo.setExtens_nm(fileExt);
				vo.setPath(path);
				vo.setEtc("");
				
				attachDAO.insertAttach(vo);
			} else {
				System.out.println("fileFullName : " + fileFullName);
				System.out.println("FileName : " + fileName);
				System.out.println("FileExt : " + fileExt);
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	private String getSize(long size) {
		double retSize = size;
		int i = 0;
		String byteStr[] = {"Bytes","KB","MB","GB","TB"};
		
		while(retSize > 1000) {
			retSize = (retSize / 1024);
			++i;
		}
		
		return String.format("%g %s", retSize, byteStr[i]);
	}
	
}
