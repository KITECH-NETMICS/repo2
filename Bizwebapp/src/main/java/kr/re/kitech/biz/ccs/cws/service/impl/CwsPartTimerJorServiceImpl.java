package kr.re.kitech.biz.ccs.cws.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cws.dao.CwsPartTimerJorDAO;
import kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService;
import kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo;
import kr.re.kitech.biz.ccs.cws.vo.CwsWorkTimeVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**  
 * @ClassSubJect 비상근 업무일지 관련 처리를 담당하는 MyBatis Impl
 * @Class Name CwsPartTimerJorServiceImpl.java
 * @Description 비상근 업무일지  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/07   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/04/07
 * @version 1.0
 * @see
 * 
 */
@Service("cwsPartTimerJorServiceImpl")
public class CwsPartTimerJorServiceImpl  extends EgovAbstractServiceImpl implements CwsPartTimerJorService {

    @Resource(name="cwsPartTimerJorDAO")	
    private CwsPartTimerJorDAO cwsPartTimerJorDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
    
	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
    @Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
  	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService apprCommonService;    
    
    @Resource(name="attachDAO")
    private AttachDAO attachDAO;
    
    @Resource(name="accntServiceImpl")
	private AccntService accntService;
    
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#selectListCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public List<CwsPartTimerJorVo> selectListCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
		List<CwsPartTimerJorVo> list = cwsPartTimerJorDAO.selectListCwsPartTimerJor(cwsPartTimerJorVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#selectListCountCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public long selectListCountCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
		return cwsPartTimerJorDAO.selectListCountCwsPartTimerJor(cwsPartTimerJorVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#selectCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public CwsPartTimerJorVo selectCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
		CwsPartTimerJorVo resultVO = cwsPartTimerJorDAO.selectCwsPartTimerJor(cwsPartTimerJorVo);			
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#insertCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public int insertCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
		return cwsPartTimerJorDAO.insertCwsPartTimerJor(cwsPartTimerJorVo);	
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#updateCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public int updateCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {				
		return cwsPartTimerJorDAO.updateCwsPartTimerJor(cwsPartTimerJorVo);	   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.ccs.cws.service.CwsPartTimerJorService#deleteCwsPartTimerJor(kr.re.kitech.biz.ccs.cws.vo.CwsPartTimerJorVo)
	 */
	public int deleteCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception {
		this.apprFuncService.formRemove(cwsPartTimerJorVo.getReq_no());
		return cwsPartTimerJorDAO.deleteCwsPartTimerJor(cwsPartTimerJorVo);
	}
	
	public String saveCwsPartTimerJor(CwsPartTimerJorVo cwsPartTimerJorVo) throws Exception {
		String rowStatus = (String) cwsPartTimerJorVo.getRowStatus();
		if (rowStatus.equals("C")) {	
	        String gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C95");
	        
	        cwsPartTimerJorVo.setReq_no(gen);
			cwsPartTimerJorDAO.insertCwsPartTimerJor(cwsPartTimerJorVo);
		
			apprCommonService.createAprInterface(gen, "C951", KitechContextUtil.getUserId());
		} else if (rowStatus.equals("U")) {
			cwsPartTimerJorDAO.updateCwsPartTimerJor(cwsPartTimerJorVo);
		} else if (rowStatus.equals("D")) {
			apprFuncService.formRemove(cwsPartTimerJorVo.getReq_no());
			cwsPartTimerJorDAO.deleteCwsPartTimerJor(cwsPartTimerJorVo);
		}
	
		if (cwsPartTimerJorVo.isApproval()) {
		
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(cwsPartTimerJorVo.getReq_no());
			aprVo.setEndpoint(accntService.findUserIdBySyspayno(cwsPartTimerJorVo.getReq_syspayno()).getUid());
			aprVo.setAprState(cwsPartTimerJorVo.getApr_state());
			aprVo.setUiId("C951");
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			//인포시디 다시해야함
			aprVo.setInfoCd(cwsPartTimerJorVo.getInfo_cd());
			//aprVo.setInfoCd(cwsPartTimerJorVo.getInfo_cd());

			//2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
			// 첨부파일 번호로 첨부파일 리스트 조회
			cwsPartTimerJorVo.setAttachVo1(attachDAO.selectListAttach(cwsPartTimerJorVo.getAttach_file_no()));
			
			apprFuncService.approvalRequest(aprVo, cwsPartTimerJorVo);
			
		
		}
		
		return cwsPartTimerJorVo.getReq_no() == null ? "" : cwsPartTimerJorVo.getReq_no();
	}
	
	public CwsWorkTimeVo selectCwsWorkTime(CwsWorkTimeVo cwsWorkTimeVo) throws KitechException {
		CwsWorkTimeVo resultVO = cwsPartTimerJorDAO.selectCwsWorkTime(cwsWorkTimeVo);			
        resultVO.setWork_day(cwsPartTimerJorDAO.selectCwsWorkDays(cwsWorkTimeVo));
        return resultVO;
	}
	
	@Override
	public void selectCwsPartTimerJorCheck(CwsPartTimerJorVo cwsPartTimerJorVo) throws KitechException {
		String reqNo = cwsPartTimerJorDAO.selectCwsPartTimerJorCheck(cwsPartTimerJorVo);
		
		if (reqNo != null && !reqNo.equals("")) {
			String[] params = { reqNo };
			throw new KitechException(Exceptions.ERROR, Business.CCS, "message.alert.ccs.cws.0019", params);
		}
	}
	
}
