package kr.re.kitech.biz.ccs.cws.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cws.dao.CwsOutWorkDAO;
import kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService;
import kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateTime;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.AttachVo;


/**  
 * @ClassSubJect 재택근무신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CwsOutWorkServiceImpl.java
 * @Description 재택근무신청  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/28   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/28
 * @version 1.0
 * @see
 * 
 */
@Service("cwsOutWorkServiceImpl")
public class CwsOutWorkServiceImpl  extends EgovAbstractServiceImpl implements CwsOutWorkService {

    @Resource(name="cwsOutWorkDAO")
    private CwsOutWorkDAO cwsOutWorkDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "generationServiceImpl")
    private GenerationService generationService;
    
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService apprCommonService;    
    
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDAO;
    
    @Resource(name="accntServiceImpl")
	private AccntService accntService;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#selectListCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public List<CwsOutWorkVo> selectListCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		List<CwsOutWorkVo> list = cwsOutWorkDAO.selectListCwsOutWork(cwsOutWorkVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#selectListCountCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public long selectListCountCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		return cwsOutWorkDAO.selectListCountCwsOutWork(cwsOutWorkVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#selectCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public CwsOutWorkVo selectCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		CwsOutWorkVo resultVO = cwsOutWorkDAO.selectCwsOutWork(cwsOutWorkVo);
        
        String is_tag = cwsOutWorkVo.getIs_tag();
        if (is_tag != null && is_tag.equals("Y") && resultVO == null) {
        	throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cws.0011");
        }
        
        return resultVO;
	}
	
	public void selectCwsOutWorkDupCheck(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		String req_no = cwsOutWorkVo.getReq_no().equals("") ? "" : cwsOutWorkVo.getReq_no(); 
		CwsOutWorkVo vo = cwsOutWorkDAO.selectCwsOutWorkDupCheck(cwsOutWorkVo);
		
		if ( vo != null && !(vo.getReq_no().equals(req_no))) {
			String[] exceptionString = { vo.getApr_state(), vo.getReq_no(), vo.getStart_ymd(), vo.getCls_ymd(),	vo.getCause() };
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cws.0001", exceptionString);
		}
		
	}
	
	public void selectCwsOutWorkValidCheck(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		CwsOutWorkVo vo = cwsOutWorkDAO.selectCwsOutWorkValidCheck(cwsOutWorkVo);
		
		if ( vo != null ) {
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cws.0001");
		}
		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#insertCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public int insertCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException {
		return cwsOutWorkDAO.insertCwsOutWork(cwsOutWorkVo);	
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#updateCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public int updateCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws KitechException {				
		return cwsOutWorkDAO.updateCwsOutWork(cwsOutWorkVo);	   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsOutWorkService#deleteCwsOutWork(kr.re.kitech.biz.ccs.cws.vo.CwsOutWorkVo)
	 */
	public int deleteCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception {
		apprFuncService.formRemove(cwsOutWorkVo.getReq_no());
		return cwsOutWorkDAO.deleteCwsOutWork(cwsOutWorkVo);
	}	
	
	public String saveCwsOutWork(CwsOutWorkVo cwsOutWorkVo) throws Exception {
		String rowStatus = (String) cwsOutWorkVo.getRowStatus();
		if (rowStatus.equals("C")) {	
	        String gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C98");
	        cwsOutWorkVo.setReq_no(gen);
	        cwsOutWorkVo.setSecure_yn("Y");
	        cwsOutWorkVo.setSecure_daytm(DateUtil.getCurrentDate(DateTime.FORMATTED_DATE_TIME_PATTERN));
			cwsOutWorkDAO.insertCwsOutWork(cwsOutWorkVo);
			// Xomxintfatab 신규저장 (신청번호, 서비스ID(KitechContextUtil.getServiceId()), 시작자)
			apprCommonService.createAprInterface(gen, "C947", KitechContextUtil.getUserId());
		} else if (rowStatus.equals("U")) {
			cwsOutWorkDAO.updateCwsOutWork(cwsOutWorkVo);
		}
		
		
		if (cwsOutWorkVo.isApproval()) {
			// 1. BPM 코어 파라미터 객체 생성
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(cwsOutWorkVo.getReq_no());
			aprVo.setEndpoint(accntService.findUserIdBySyspayno(cwsOutWorkVo.getSyspayno()).getUid());
			// 근태담당자
			aprVo.setManager(cwsOutWorkVo.getManager());
			aprVo.setInfoCd(cwsOutWorkVo.getInfoCd());
			// TO-DO 변수 추가적으로 넣어주기
			//aprVo.setProcDefAlias(cwsOutWorkVo.getReq_no().substring(0, 3));
			//aprVo.setInstExt1("info_cd");
			//aprVo.setInstExt2("accntno");
						
			// 2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
			AttachVo attachVo = new AttachVo();
			// 첨부파일 번호로 첨부파일 리스트 조회
			attachVo.setAttach_file_no(cwsOutWorkVo.getAttach_file_no());
			cwsOutWorkVo.setAttachVo1(attachDAO.selectListAttach(cwsOutWorkVo.getAttach_file_no()));
			
			attachVo.setAttach_file_no(cwsOutWorkVo.getAttach_file_no());
			cwsOutWorkVo.setAttachVo2(attachDAO.selectListAttach(cwsOutWorkVo.getAttach_file_no()));
			
			// 3. 전자결재 기능 메소드 호출 (결재신청)
			apprFuncService.approvalRequest(aprVo, cwsOutWorkVo);
			
		}
		
		return cwsOutWorkVo.getReq_no() == null ? "" : cwsOutWorkVo.getReq_no();
	}
	
}
