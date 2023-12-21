package kr.re.kitech.biz.api.server.service.process;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.server.dao.FinProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SfcChmclVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.fnd.vo.FcpDepstUpdVo;
import kr.re.kitech.biz.fin.spa.service.FinAutoSlipService;
import kr.re.kitech.biz.res.exc.service.ResDepstReqService;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 재무관리 BPM 사후처리
 * @Class Name FinProcess.java
 * @Description 재무관리 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/02      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/02
 * @version 1.0
 * @see
 * 
 */
@Component
public class FinProcess implements BpmPostProcess {
	
	@Resource(name="finAutoSlipService")
	private FinAutoSlipService autoSlipService;	
	
	@Resource(name ="resDepstReqService")
	private ResDepstReqService depstService;
	
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finProcessDAO")
	private FinProcessDAO dao;

	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService aprService;

	/**
    * 재무관리 BPM 사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.08.02.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws ElException {
		String reqNoSub = vo.getReqNo().substring(0,3);
		// 1) 결의번호 조회
		String unslipNo = dao.selectUnslipNo(vo.getReqNo());
		
		if("XAD100".equals(vo.getAprState())){
			if("F27".equals(reqNoSub)){ // 소액물품
				this.saveFspSmlItemCheckupH(vo);
			}			
			
			// 결의서 결재라인 사인 업데이트를 위해 증빙 새로 생성
			if(reqNoSub.matches("F05|F11|F41") && !StringUtil.isEmpty(unslipNo)){
				// 결의번호 결재상태 XAD100으로 업데이트
				aprService.modifyAprInterface(unslipNo, "XAD100", "");
				
				EvidAttachVo attachVo = new EvidAttachVo();
				attachVo.setUnslip_no(unslipNo); 
				attachService.executeProcess(attachVo);
			}
			
		}else if(vo.getAprState().matches("XAD015|XAD013")){
			AppLog.debug(vo.toString());
			switch(reqNoSub){
				case "F05" : // 가지급금(전도금)신청
					autoSlipService.deleteFinPayAdvcReqSlipMnt(unslipNo, vo.getReqNo());
					break;
				case "F11" : // 가지급정산 결의삭제
					autoSlipService.deleteFinPayAdvcAdjstSlipMnt(unslipNo, vo.getReqNo());
					break;
				case "F41" : //예금입금 결의삭제
					if(!StringUtil.isEmpty(unslipNo)){
						depstService.deleteDepstReqSlipMnt(unslipNo, vo.getReqNo());
					}		
					
					// 입금요청확정 수정
					FcpDepstUpdVo updVo = new FcpDepstUpdVo();
					updVo.setReq_no(vo.getReqNo());
					updVo.setDepst_req_decsn("N");
					dao.updateFcpDepstReqDecsn(updVo);			
					break;
				case "F27" :
					String safReqNo = dao.selectSfcChmSafeReqNo(vo.getReqNo());
					if (!StringUtils.isBlank(safReqNo)) 
						dao.deleteSfcPrductQyInfo(safReqNo);
					break;
				default : break;
			}
		}else if("XAD070".equals(vo.getAprState())){
			if("F27".equals(reqNoSub)){ // 소액물품
				// 검사일자(계정책임자) 업데이트
				dao.updateFspSmlItmCheckupHApr(vo);
			}	
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}
	
	/**
    * 소액물품신청 결재완료시 검수일자 업데이트 및 화학물질 등록
    * @param ApiBpmVo
    * @author LeeYH
    * @since 2022.08.02.
    */
	private void saveFspSmlItemCheckupH(ApiBpmVo vo) throws ElException{
		
		// 입회검수일자, 입회자 정보와 실제 결재자 정보가 다를 경우가 있어 결재자로 업데이트
		vo.setSyspayno(KitechContextUtil.getSyspayno());
		vo.setDeptCd(KitechContextUtil.getDeptCd());
		dao.updateFspSmlItmCheckupHApr(vo);
		
		List<SfcChmclVo> srcList = dao.selectSfcChmClssafEdcdfpInfoList(vo.getReqNo());
		
		int useSeq = 1;
		for(SfcChmclVo srcVo : srcList){
			int qty = (int)srcVo.getItem_qty();
			for(int j=0; j<qty; j++){
				srcVo.setUse_req_no(srcVo.getReq_no().concat(StringUtil.lPad(String.valueOf(useSeq), 5, '0')));
				srcVo.setSeq(useSeq);
				useSeq++;
				
				dao.insertSfcPrductQyInfo(srcVo);
			}
		}
	}	
	

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.FIN;
	}
}