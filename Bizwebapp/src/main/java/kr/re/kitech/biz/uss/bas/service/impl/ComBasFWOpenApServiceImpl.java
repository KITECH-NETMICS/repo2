package kr.re.kitech.biz.uss.bas.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.uss.bas.dao.ComBasFWOpenApDAO;
import kr.re.kitech.biz.uss.bas.service.ComBasFWOpenApService;
import kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.UserVo;
/**
 * @ClassSubJect 
 * @ClassName : ComBasFWOpenApServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.19.      작업자    최초생성
 * 
 * @author 
 * @since 2023.09.19.
 * @version 1.0
 * @see
 * 
 */
@Service("comBasFWOpenApServiceImpl")
public class ComBasFWOpenApServiceImpl extends EgovAbstractServiceImpl implements ComBasFWOpenApService {
	@Resource(name="comBasFWOpenApDAO")
	private ComBasFWOpenApDAO basDAO;
    
    @Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="accntServiceImpl")
	private AccntService accntServiceImpl;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	
			
	/**
	 * 방화벽오픈신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return List<ComBasFWOpenInfoVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
	 */   
	@Override
	public List<ComBasFWOpenInfoVo> selectList(ComBasFWOpenInfoVo basVo) throws KitechException {
		List<ComBasFWOpenInfoVo> res = basDAO.selectList(basVo);
		return res;
	}

    /**
	 * 방화벽오픈신청 정보 조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public ComBasFWOpenInfoVo select(ComBasFWOpenInfoVo vo) throws KitechException {
		ComBasFWOpenInfoVo resVo = basDAO.select(vo);
		if (resVo != null) {
			if (AprState.isIng(resVo.getApr_state())) { //결재진행중일 때 담당책임자 정보 조회
			    String syspayno = KitechContextUtil.getSyspayno(); 
			    UserVo user = accntServiceImpl.findDirectSupervisorBySyspaynoInDB(syspayno);
			    
			    if(user != null){
			    	resVo.setSupervisor_uid(user.getUid());
			    }
		    }		
		}
		return resVo;
	}

    /**
	 * LDAP담당자 정보조회
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenAprVo
	 * @return List<UserVo>
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public List<UserVo> selectManagerList(ComBasFWOpenInfoVo vo) throws KitechException {
		// 네트워크관리담당자 조회
		List<UserVo> users = accntServiceImpl.findUsersByRoleCodes(new String[]{"1010211"});
		return users;
	}

    /**
	 * 방화벽오픈신청  정보 등록/결재요청
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @return ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public ComBasFWOpenInfoVo save(ComBasFWOpenInfoVo vo) throws KitechException {
		ComBasFWOpenInfoVo resVo = new ComBasFWOpenInfoVo();
		String aply_no = vo.getAply_no();
		
		if (aply_no.equals("")) { //신규 등록
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDoc_id());
			
			vo.setAply_no(gen);	
			basDAO.insert(vo);
			apprFuncService.formInit(gen, vo.getService_id(), KitechContextUtil.getUserId());	
			basDAO.insertComBasAplyDoc(vo);		
		} else { //변경 저장
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(vo.getService_id(), vo.getAply_no());
			} catch (KitechException ex) {
			    throw ex;
			}
				
			basDAO.update(vo);
			ComBasFWOpenInfoVo aplyDoc =  basDAO.selectComBasAplyDoc(vo);
			if (aplyDoc != null && !aplyDoc.getAply_no().equals("")){
				basDAO.updateComBasAplyDoc(vo);
			}else{
				basDAO.insertComBasAplyDoc(vo);
			}
					
			if(vo.isApproval()){
				//신청서
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(vo.getAply_no());
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setUiId(vo.getService_id());	
				aprVo.setInfoCd(vo.getInfo_cd());			
				apprFuncService.approvalScreen(aprVo);						
			}
		}
		
		resVo.setAply_no(vo.getAply_no());		
		return resVo;
	}

    /**
	 * 방화벽오픈신청 정보 삭제
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public void delete(ComBasFWOpenInfoVo vo) throws KitechException {
		basDAO.delete(vo);
		basDAO.deleteComBasAplyDoc(vo);
		apprFuncService.formRemove(vo.getAply_no());
		
	}

	/**
	 * 방화벽오픈신청 전자결제 처리(화면)
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public void formConfirm(ComBasFWOpenInfoVo vo) throws KitechException {
		// 3. BPM 완료
		String chargSysPayNo = vo.getComp_charg_sys_pay_no();
		
		if (chargSysPayNo != null && !chargSysPayNo.equals("")){
			basDAO.updateComBasAplyDocCharg(vo);
		}
		
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getAply_no());
		aprVo.setEndpoint(vo.getEnd_point());
		aprVo.setAprState(vo.getApr_state());
		apprFuncService.formAccept(aprVo);
	}

	/**
	 * 방화벽오픈신청 전자결제 반려(화면)
	 * 
	 * @author 김상미
	 * @param ComBasFWOpenInfoVo
	 * @throws KitechException
	 * @since 2023.09.19.   
     */
	@Override
	public void formReject(ComBasFWOpenInfoVo vo) throws KitechException {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getAply_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		apprFuncService.formReject(aprScVo);		
	}
}
