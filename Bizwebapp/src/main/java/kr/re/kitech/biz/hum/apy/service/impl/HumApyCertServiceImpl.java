package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApyCertDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyCertService;
import kr.re.kitech.biz.hum.apy.vo.HumApyCertListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyCertVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyOutVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.UserVo;


/**  
 * @ClassSubJect 증명서발급신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name HumApyCertServiceImpl.java
 * @Description 증명서발급신청  처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/03/31   개발팀             최초생성
 * 
 * @author 개발팀
 * @since 2022/03/31
 * @version 1.0
 * @see
 * 
 */
@Service("humApyCertServiceImpl")
public class HumApyCertServiceImpl  extends EgovAbstractServiceImpl implements HumApyCertService {

    @Resource(name="humApyCertDAO")
    private HumApyCertDAO humApyCertDAO;
	
	@Resource(name = "messageSource")
	private MessageSource messageSource;
	
	@Resource(name = "generationServiceImpl")
    public GenerationService generationService;
    
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDAO;
    
    @Resource(name="accntServiceImpl")
	private AccntService accntService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
    
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#selectListHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public List<HumApyCertVo> selectListHumApyCert(HumApyOutVo humApyCertVo) throws KitechException {
		List<HumApyCertVo> list = humApyCertDAO.selectListHumApyCert(humApyCertVo);	
	
		return list;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#selectListCountHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public long selectListCountHumApyCert(HumApyOutVo humApyCertVo) throws KitechException {
		return humApyCertDAO.selectListCountHumApyCert(humApyCertVo);
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#selectHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public HumApyCertVo selectHumApyCert(HumApyCertVo humApyCertVo) throws KitechException {
		HumApyCertVo resultVO = humApyCertDAO.selectHumApyCert(humApyCertVo);			
        
        return resultVO;
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#insertHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public int insertHumApyCert(HumApyCertVo humApyCertVo) throws KitechException {
		return humApyCertDAO.insertHumApyCert(humApyCertVo);	
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#updateHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public int updateHumApyCert(HumApyCertVo humApyCertVo) throws KitechException {				
		return humApyCertDAO.updateHumApyCert(humApyCertVo);	   		
	}

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.hum.apy.service.HumApyCertService#deleteHumApyCert(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)
	 */
	public int deleteHumApyCert(HumApyCertVo humApyCertVo) throws KitechException {
		return humApyCertDAO.deleteHumApyCert(humApyCertVo);
	}
	
	@Override
	public HumApyOutVo selectHumApyOutVo(HumApyOutVo humApyOutVo) throws KitechException {
		return humApyCertDAO.selectHumApyOut(humApyOutVo);
	}
	
	@Override
	public String saveHumApyCert(HumApyCertVo humApyCertVo) throws Exception {
		String rowStatus = (String) humApyCertVo.getRowStatus();
		
		if (rowStatus.equals("C")) {
	        String issu_knd = humApyCertVo.getIssu_knd();
	        String gen = "";
	        if (issu_knd.equals("HCD040") || issu_knd.equals("HCD050")) {
	        	gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H57");
	        } else {
	        	gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H07");
	        }
	        
	        humApyCertVo.setReq_no(gen);
			humApyCertDAO.insertHumApyCert(humApyCertVo);
			apprFuncService.formInit(gen, "H542", KitechContextUtil.getUserId());
		} else if (rowStatus.equals("U")) {
			humApyCertDAO.updateHumApyCert(humApyCertVo);
		} else if (rowStatus.equals("D")) {
			apprFuncService.formRemove(humApyCertVo.getReq_no());
			humApyCertDAO.deleteHumApyCert(humApyCertVo);
		}
		
		if (humApyCertVo.isApproval()) {
			AprVo aprVo = new AprVo();
			aprVo.setReqNo(humApyCertVo.getReq_no());
			aprVo.setInfoCd(humApyCertVo.getInfo_cd());
			aprVo.setExt2Cd(humApyCertVo.getIssu_usg());
			
			String issu_knd = humApyCertVo.getIssu_knd();
			String roleCode = "";
			// 담당자 세팅
			if (issu_knd.equals("HCD040") || issu_knd.equals("HCD050")) { // 수료증명서 || 연수증명서
				roleCode = "1003152";	// 연수증명서담당
			} else {
				roleCode = "1003130";	// 증명서발급담당
			}
			List<UserVo> volist = accntService.findUsersByRoleCodes(new String[]{roleCode});
			String uid = volist.get(0).getUid();
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setAprState(humApyCertVo.getApr_state());
			
			apprFuncService.approvalScreen(aprVo);
			aprVo.setEndpoint(uid);
			aprVo.setTaskExt1("H542");
			apprFuncService.formAccept(aprVo);
			
			humApyCertVo.setDoc_id(humApyCertVo.getReq_no().substring(0, 3));
			String issu_no = humApyCertDAO.selectHumApyIssuNo(humApyCertVo);
			humApyCertVo.setIssu_no(issu_no);
			humApyCertDAO.updateHumApyIssuNo(humApyCertVo);
		}
	
		return humApyCertVo.getReq_no() == null ? "" : humApyCertVo.getReq_no();
	}
	
	
	@Override
	public void formAccept(HumApyCertVo humApyCertVo) throws Exception {
		// 3. BPM 완료
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(humApyCertVo.getReq_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(humApyCertVo.getApr_state());
		aprVo.setTaskExt1(humApyCertVo.getIssu_usg());
		apprFuncService.formAccept(aprVo);
		
	}
	
	
	@Override
	public void formReject(HumApyCertVo humApyCertVo) throws Exception {
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(humApyCertVo.getReq_no());
		aprScVo.setEndpoint("system");
		aprScVo.setAprState(humApyCertVo.getApr_state());
		aprScVo.setComments(humApyCertVo.getComments());
		apprFuncService.formAuthReject(aprScVo);	
	}

	@Override
	public List<HumApyCertVo> selectHumApyCertList(HumApyCertVo vo) {
		return humApyCertDAO.selectHumApyCertList(vo);
	}

	@Override
	public void saveHumApyCertList(HumApyCertListVo vo) {
		List<HumApyCertVo> humApyCertVoList = vo.getHumApyCertVoList();
		for(HumApyCertVo certvo : humApyCertVoList){
			humApyCertDAO.saveHumApyCertList(certvo);
		}
	}

	@Override
	public void deleteHumApyCertList(HumApyCertListVo vo) {
		List<HumApyCertVo> humApyCertVoList = vo.getHumApyCertVoList();
		for(HumApyCertVo certvo : humApyCertVoList){
			humApyCertDAO.deleteHumApyCertList(certvo);
			apprFuncService.formRemove(certvo.getReq_no());
		}
	}

	@Override
	public String adminSaveHumApyCert(HumApyCertVo humApyCertVo) {
		String issu_knd = humApyCertVo.getIssu_knd();
        String gen = "";
        if (issu_knd.equals("HCD040") || issu_knd.equals("HCD050")) {
        	gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H57");
        } else {
        	gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "H07");
        }
        
        humApyCertVo.setReq_no(gen);
		humApyCertDAO.insertHumApyCert(humApyCertVo);
		
		IntfatabVo inftaVo = new IntfatabVo();
		inftaVo.setReqNo(gen);
		inftaVo.setUiId(KitechContextUtil.getServiceId());
		inftaVo.setAprState(humApyCertVo.getApr_state());
		inftaVo.setEndpoints(KitechContextUtil.getUserId());
		
		humApyCertVo.setDoc_id(humApyCertVo.getReq_no().substring(0, 3));
		String issu_no = humApyCertDAO.selectHumApyIssuNo(humApyCertVo);
		humApyCertVo.setIssu_no(issu_no);
		humApyCertDAO.updateHumApyIssuNo(humApyCertVo);
		
		//결재상태 : 임시저장
		aprComService.putXomxintfatab(inftaVo);
		
		return humApyCertVo.getReq_no() == null ? "" : humApyCertVo.getReq_no();
	}
}
