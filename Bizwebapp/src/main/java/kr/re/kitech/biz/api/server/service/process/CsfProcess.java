package kr.re.kitech.biz.api.server.service.process;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import kr.re.kitech.biz.api.server.dao.CsfProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.biz.SfcChmclVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
 * 
 * @author James
 * @since 2022. 6. 29.
 * @ClassSubJect 안전관리 BPM 사후처리
 * @Class Name CsfProcess.java
 * @Description 안전관리 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/11/26                  최초생성
 * 
 * @author 
 * @since 2022/11/26
 * @version 1.0
 * @see
 * 
 */
@Component 
public class CsfProcess implements BpmPostProcess {
	@Resource(name = "csfProcessDAO")
	private CsfProcessDAO dao;


	/**
    * 안전관리 BPM 사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author 
    * @since 2022.11.26.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo) throws KitechException{
		String reqNoSub = vo.getReqNo().substring(0, 3);
		String aprState = vo.getAprState();
		
		switch(reqNoSub){
			case "D35" : // 화학물질폐기
				if(AprState.COMPLATE.getCode().equals(aprState)){ // XAD100
					//화학물질폐기 결재 완료시 이력 저장
					List<SfcChmclVo> srcSfcChmclList = dao.selectsfcDsuseReqNoInfo(vo.getReqNo());
					for(SfcChmclVo resultVo : srcSfcChmclList){
						resultVo.setDisposal_state("SFI002");
						resultVo.setDisposal_state_nm("폐기신청 결재완료");
						
						dao.insertSfcdisposalapphistory(resultVo);
					}
				}
				break;
				
			default : break;			
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}	
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.CSF;
	}
}