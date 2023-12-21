package kr.re.kitech.biz.api.server.service.process;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.util.DateUtil;

import kr.re.kitech.biz.api.server.dao.StdProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.fin.com.service.FinComAttachService;
import kr.re.kitech.biz.fin.com.vo.EvidAttachVo;
import kr.re.kitech.biz.fin.com.vo.FspSlipRjctVo;
import kr.re.kitech.biz.fin.mail.service.FinMailSendService;

/**
 * @ClassSubJect 결의서 BPM 사후처리
 * @Class Name StdProcess.java
 * @Description 결의서 BPM 사후처리
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
public class StdProcess implements BpmPostProcess {
	@Resource(name="finComAttachService")
	private FinComAttachService attachService;
	
	@Resource(name="finMailSendService")
	private FinMailSendService mailService;
	
	@Resource(name="stdProcessDAO")
	private StdProcessDAO stdDao;
	
	/**
    * 결의서 BPM 사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author LeeYH
    * @since 2022.08.03.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws ElException {

		if (vo.getReqNo().length() == 10){
			// 결의서 결재라인 사인 업데이트를 위해 증빙 새로 생성
			EvidAttachVo attachVo = new EvidAttachVo();
			attachVo.setUnslip_no(vo.getReqNo()); 
			attachService.executeProcess(attachVo);

			// 결재상태에 따른 예외 로직
			switch(AprState.getAprState(vo.getAprState())) {
				case COMPLATE:
					if ("119".equals(vo.getReqNo().substring(0,3))){
						mailService.mailSendSmlItemApr(vo.getReqNo(), vo.getSyspayno());
					}
					break;
				case WAIT_REJECT:
					// 결의서가 반려 처리되는 경우: 연구비적정집행모니터링 검색서버 수집을 위해 로그저장
					this.loggingForMonitering(vo.getReqNo(), vo.getPrevAprState(), vo.getRejectComment());
					break;
				default:
			}
		}

		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}	
	
	
	
	/**
	 * 연구비적정집행모니터링 검색서버 수집을 위해 결재반려시 로그저장
	 *  - 첨부파일 백업 및 로깅
	 * @param fspSlipRjct
	 */
	private void loggingForMonitering(String unslipNo, String prevAprState, String rejectComment) {
		// TODO: 1. 첨부파일 번호 조회 (결의서첨부파일 및 증빙첨부파일)
		
		// TODO: 2. 첨부파일 번호로 첨부파일 경로 조회
		
		// TODO: 3. 첨부파일 백업 스크립트 실행 (exec.sh 원본첨부파일풀경로 대상 첨부 파일 풀경로)

		// TODO: 4. 첨부파일 번호 설정 
		FspSlipRjctVo fspSlipRjct = new FspSlipRjctVo();
		fspSlipRjct.setUnslip_no(unslipNo);
		fspSlipRjct.setRct_content(rejectComment);
		fspSlipRjct.setApr_state(prevAprState);		
		fspSlipRjct.setAttach_no("temp_" + DateUtil.getNow("yyyyMMddhhssmm"));

		// 최종 로깅..
		stdDao.insertFspSlipRjct(fspSlipRjct);			
	}
		

	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getAprProcess()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.STD;
	}

}
