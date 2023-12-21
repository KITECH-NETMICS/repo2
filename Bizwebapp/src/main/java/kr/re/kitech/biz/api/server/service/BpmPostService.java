/**
 * 
 */
package kr.re.kitech.biz.api.server.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import kr.re.kitech.biz.api.server.dao.BizBpmDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.api.server.vo.LogCallAppVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**
* BPM 대응 서비스
 * @author James
 * @since 2022. 6. 29.
 */
@Service("bpmPostService")
public class BpmPostService {

    @Autowired
    private BpmPostFactory bpmPostFactory;

    @Resource(name="bizBpmDAO")
	private BizBpmDAO dao;

	/**
	 * 전자결재 회수/반려/결재완료 상태 후처리 (ASIS: AppBizController)
     *
	 * @param param
	 * @return
	 * @throws KitechException
	 */
	@Transactional
    public ApiBpmVo executePostProcess(ApiBpmVo apiBpmVo) throws Exception {
		
		String workType = apiBpmVo.getReqNo().substring(0,1);
		String slipType = apiBpmVo.getReqNo().substring(0,3);
		
		// 로그저장위해
		LogCallAppVo logVo = new LogCallAppVo();
		logVo.setReq_no(apiBpmVo.getReqNo());
		logVo.setReq_sn(apiBpmVo.getSyspayno());
		logVo.setApr_state(apiBpmVo.getAprState());
		
		try {					
			// 내부기술지원신청서 예외처리
			AprProcess proc = ("F03".equals(slipType)) ? AprProcess.SPT : AprProcess.prefixOf(workType);
			
			if (dao.selectSlipTypCnt(slipType) > 0) {
				proc = AprProcess.STD;
			}
				
		    // 타입을 전달해서 전략을 가져올 수 있다.
		    BpmPostProcess process = bpmPostFactory.findProcess(proc);
		    
		    // 전략에 정의된 메소드를 호출
		    if (null != process) {
		    	apiBpmVo = process.doExecute(apiBpmVo);		    
	    	}
		
		    if (apiBpmVo.isSuccess() && AprState.COMPLATE.getCode().equals(apiBpmVo.getAprState())) {
		    	// 1. BPM Get 호출
		    	
		    	// 2. ElecInfo 저장		    	
		    }
		    

//		    if (!aprPostVo.isSuccess()){
//		    	throw new KitechException(Exceptions.ERROR, Business.COM, aprPostVo.getMessage());
//		    }
	    } catch (KitechException e){
	    	apiBpmVo.setSuccess(false);
	    	AppLog.error("MenuService-KitechException", apiBpmVo.getMessage() + ">>>" + e);	
	    	throw e;
	    	
	    } catch (Exception e){
	    	apiBpmVo.setSuccess(false);
	    	AppLog.error("MenuService-Exception", e);	    	
	    	throw e;
	    		    	
	    } finally {
    		logVo.setTmp2( apiBpmVo.isSuccess() ? "success" : "fail");
    		logVo.setTmp3( apiBpmVo.isManager() ? "manager" : "user");

	    	// TODO: 공통 로깅
	    	dao.insertLogCallApp(logVo);
	    }	    
	    
	    return apiBpmVo;
    }
    
    
}