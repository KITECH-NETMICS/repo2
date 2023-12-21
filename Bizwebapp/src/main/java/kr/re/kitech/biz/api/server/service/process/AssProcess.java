package kr.re.kitech.biz.api.server.service.process;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import kr.re.kitech.biz.api.server.dao.AssProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.ass.com.vo.AssMastrBodyVO;
import kr.re.kitech.biz.ass.eqip.service.AssResEquipMgtService;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.ass.mail.service.AssMailSendService;


/**
 * @ClassSubJect 자산관리 BPM 사후처리
 * @Class Name AssProcess.java
 * @Description 자산관리 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/07/27      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/07/27
 * @version 1.0
 * @see
 * 
 */
@Component
public class AssProcess implements BpmPostProcess {
	@Resource(name="assProcessDAO")
	private AssProcessDAO assProcessDAO;	
	
	@Resource(name="assResEquipService")
	private AssResEquipMgtService assResEquipMgtService;
	
	@Resource(name="assMailSendService")
	private AssMailSendService mailService;
	
	/**
    * 자산관리 BPM사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author JeonJW
    * @since 2022.07.27.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo){	
		String reqNoSub = vo.getReqNo().substring(0, 3);
		String aprState = vo.getAprState();
		
		if(AprState.COMPLATE.getCode().equals(aprState)){
			if("A11".equals(reqNoSub)){ // A11 자산인수인계 결재완료 후
				this.saveAssReceiptTrans(vo);
			}else if(reqNoSub.matches("A13|A14")){ // A13 자산이동신청 A14 자산외부설치 결재 완료 후
				this.saveAssMove(vo, reqNoSub);
			}else if("A12".equals(reqNoSub)){ // A12 불용신청 결재 완료 후
				this.saveAssUnUseReqInfo(vo);
			}else if("A30".equals(reqNoSub)){ // A30 연구장비통합관리비 한도변경 결재 완료 후
				this.updateResEquipFeeMgt(vo);
			}
		}	
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}
	
	/**
    * 불용신청 결재 완료 후(A12)
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.07.27.
    */
	private void saveAssUnUseReqInfo(ApiBpmVo vo){
		List<Map<String,String>> assUnUseList = assProcessDAO.selectAssUnUseAsetNo(vo.getReqNo());
		for(Map<String,String> assUnUseMap : assUnUseList){
			assUnUseMap.put("aset_no", assUnUseMap.get("aset_no"));
			assUnUseMap.put("aset_state", "AAI040");
			assUnUseMap.put("updt_syspayno", vo.getSyspayno());
			assProcessDAO.updateAssMasterHead(assUnUseMap);
		}
	}
	
	/**
    * 자산 인수인계 결재 완료 후(A11)
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.07.28.
    */
	private void saveAssReceiptTrans(ApiBpmVo vo){
		List<AssMastrBodyVO> assMastrBodyVoList = assProcessDAO.selectAssReceiptTransInfo(vo.getReqNo());
		
		for(AssMastrBodyVO assMastrBodyList : assMastrBodyVoList){
			String mngmtMbody = assProcessDAO.selectAssMngmtBody(assMastrBodyList.getSyspayno());
			assMastrBodyList.setMngmt_mbody(mngmtMbody);
			assMastrBodyList.setUser_syspayno(assMastrBodyList.getSyspayno());
			assMastrBodyList.setUpdt_syspayno(vo.getSyspayno());
			assProcessDAO.updateAssMasterBody(assMastrBodyList);
		}
	}
	
	/**
    * 자산 이동신청, 자산 외부설치 결재 완료 후(A13, A14)
    * @param ApiBpmVo
    * @author JeonJW
	* @param reqNoSub 
    * @since 2022.07.28.
    */
	private void saveAssMove(ApiBpmVo vo, String reqNoSub){
		List<AssMastrBodyVO> assMastrBodyVoList = assProcessDAO.selectAssMoveInfo(vo.getReqNo());
		
		for(AssMastrBodyVO assMastrBodyList : assMastrBodyVoList){
			assMastrBodyList.setUser_syspayno(assMastrBodyList.getSyspayno());
			assMastrBodyList.setUpdt_syspayno(vo.getSyspayno());
			assProcessDAO.updateAssMasterBody(assMastrBodyList);
		}
		
		mailService.mailSendAssMove(vo.getReqNo(), vo.getSyspayno(), reqNoSub);
	}
	
	/**
    * 연구관리통합관리비 한도금액 업데이트(A30)
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.07.29.
    */
	private void updateResEquipFeeMgt(ApiBpmVo vo){
		assResEquipMgtService.updateResEquipFeeMgt(vo);
		ResEquipFeeReqVo resEquipFeeReqVo = assResEquipMgtService.selectResEquipFeeMgt(vo);
		if(!"RDK001".equals(resEquipFeeReqVo.getIntgr_mngmt_unit())){
			resEquipFeeReqVo.setRelat_no("");
		}
		resEquipFeeReqVo.setUpdt_syspayno(vo.getSyspayno());
		
		// 연구관리통합관리비 기타예실 한도금액 추가
		assResEquipMgtService.updateBblBugtActRsltEtc(resEquipFeeReqVo);
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.ASS;
	}
}
