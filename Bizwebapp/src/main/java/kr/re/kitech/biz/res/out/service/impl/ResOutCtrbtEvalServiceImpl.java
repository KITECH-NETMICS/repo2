package kr.re.kitech.biz.res.out.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.res.out.dao.ResOutCtrbtEvalDAO;
import kr.re.kitech.biz.res.out.service.ResOutCtrbtEvalService;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtEvalVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqIntegVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo;
import kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("resOutCtrbtEvalService")
public class ResOutCtrbtEvalServiceImpl extends EgovAbstractServiceImpl implements ResOutCtrbtEvalService {

	@Resource(name = "generationServiceImpl")
    private GenerationService generationService;
    
    @Resource(name="attachDAO")
    private AttachDAO attachDao;
    
	@Resource(name = "apprCommonServiceImpl")
	private ApprCommonService apprCommonService;  

	@Resource(name="resOutCtrbtEvalDAO")
	private ResOutCtrbtEvalDAO resDAO;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
 
	//조직기여도 리스트화면 조회
	@Override
	public List<ResOutCtrbtEvalListVo> selectCtrbtEval01(ResOutCtrbtEvalVo vo) throws ElException {
		// TODO Auto-generated method stub
		return resDAO.selectCtrbtEval01(vo);
	}

	// 조직기여도 신청서화면 조회
	@Override
	public ResOutCtrbtReqIntegVo selectCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		
		// TODO Auto-generated method stub
		ResOutCtrbtReqIntegVo retVo = new ResOutCtrbtReqIntegVo();
		//기본정보 조회
		retVo.setResOutCtrbtReqVo(resDAO.selectCtrbtEvalReq01(vo));
		//기여자 조회
		retVo.setResOutCtrbtReqListVo(resDAO.selectCtrbtEvalReq02(vo));
		return retVo;
	}

	// 조직기여도 신청서 저장
	@Override
	public ResOutCtrbtReqVo saveCtrbtEvalReq01(ResOutCtrbtReqIntegVo vo) throws Exception {
	   
		
	    ResOutCtrbtReqVo retVo = vo.getResOutCtrbtReqVo();
	    if (!retVo.getRcpt_no().isEmpty()) {
	    
	    	// 기본정보 업데이트 실행
			resDAO.updateCtrbtEvalReq01(retVo);
			
			// 기여자 삭제 후 저장
			resDAO.deleteCtrbtEvalReq02(retVo);

			if(vo.getResOutCtrbtReqListVo() != null){
				int i = 0;
				for(ResOutCtrbtReqListVo rateVo1 : vo.getResOutCtrbtReqListVo()){
					rateVo1.setRcpt_no(retVo.getRcpt_no());
					rateVo1.setOdr(i+1);
					i++;						
					if(resDAO.saveCtrbtEvalReq02(rateVo1) == 0){
						throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"기여자 저장"});
					}
				}
			}
	    
	    } else {    
		    // 채번 공통로직
		    String gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "R98");
	        retVo.setRcpt_no(gen);
	        
	        //retVo.setSecure_daytm(DateUtil.getCurrentDate(DateTime.FORMATTED_DATE_TIME_PATTERN));
			// Xomxintfatab 신규저장 (신청번호, 서비스ID(KitechContextUtil.getServiceId()), 시작자)
			apprCommonService.createAprInterface(gen, "J666", KitechContextUtil.getUserId());  
			
			// 기본정보 저장 실행
			resDAO.saveCtrbtEvalReq01(retVo);
					
			// 기여자 저장
			if(vo.getResOutCtrbtReqListVo() != null){
				int i = 0;
				for(ResOutCtrbtReqListVo rateVo2 : vo.getResOutCtrbtReqListVo()){			
					rateVo2.setRcpt_no(gen);		
					rateVo2.setOdr(i+1);
					i++;			
					if(resDAO.saveCtrbtEvalReq02(rateVo2) == 0){
						throw new KitechException(Exceptions.ERROR, Business.CCS, "message.xom.co.com.0002", new String[]{"기여자 저장"});
					}
				}
			}
		}
		
		// 결재신청
		if(retVo.isApproval()){
	    	this.approvalCtrbtReqInfo(vo);
		}
		
		return retVo;
	}

	/**
    조직기여도 결재신청
    **/
	private void approvalCtrbtReqInfo(ResOutCtrbtReqIntegVo vo) throws Exception{	
		// 1) 성과지표담당자 조회
//		String mangerIds = resDAO.selectResManager(KitechContextUtil.getSyspayno());
//		
//		if(StringUtils.isEmpty(mangerIds)){
//			throw new KitechException(Exceptions.ALERT, Business.RES, "message.xom.co.com.0007", new String[]{"성과지표담당자"});
//		}
		
		ResOutCtrbtReqVo retVo = vo.getResOutCtrbtReqVo();
		
		AprVo aprVo = new AprVo();
		aprVo.setMainKey(retVo.getRcpt_no());
		aprVo.setReqNo(retVo.getRcpt_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setUiId("J666");
		aprVo.setInfoCd(retVo.getApr_info());
//		aprVo.setManager(mangerIds.replaceAll(",", ";")); // 성과지표담당자에서 평가지표담당자료 명칭 변경, BPM에서 세팅
//		aprVo.setManager2(mangerIds.replaceAll(",", ";")); // 평가담당자_BPM에서 세팅
		
		//공통첨부파일Vo 세팅
		if(!"".equals(retVo.getAttach_file_no())){
			vo.setFileList(attachDao.selectListAttach(retVo.getAttach_file_no()));
		}
				
		apprFuncService.approvalRequest(aprVo, vo);
	}


	// 조직기여도 신청서 삭제
	public void deleteCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		resDAO.deleteCtrbtEvalReq01(vo);
		resDAO.deleteCtrbtEvalReq02(vo);
		
		// 결재정보 삭제
		apprFuncService.formRemove(vo.getRcpt_no());
	}

	// 조직기여도 신청서 담당자 승인
	public void cofirmCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
				
		AprVo aprVo = new AprVo();
		aprVo.setReqNo(vo.getRcpt_no());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setAprState(vo.getApr_state());
		aprVo.setUiId("J666");
		apprFuncService.formAccept(aprVo);

		resDAO.updateCtrbtEvalReq01(vo);
	}

	// 조직기여도 신청서 담당자 반려
	public void rejectCtrbtEvalReq01(ResOutCtrbtReqVo vo) throws ElException {
		
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getRcpt_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setComments(vo.getComments());
		
		apprFuncService.formReject(aprScVo);
		
		resDAO.updateCtrbtEvalReq01(vo);
	}


/*
	@Override
	public void updateCtrbtEvalReq01(ResOutCtrbtEvalVo vo) throws ElException {
		// TODO Auto-generated method stub
		
	}
*/
}
