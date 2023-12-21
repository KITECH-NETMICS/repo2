package kr.re.kitech.biz.fin.fnd.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.fnd.dao.FinCardUseAmtUpReqDAO;
import kr.re.kitech.biz.fin.fnd.service.FinCardUseAmtUpReqService;
import kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FndCardSelectVo;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("finCardUseAmtUpReqServiceImpl")
public class FinCardUseAmtUpReqServiceImpl  extends EgovAbstractServiceImpl implements FinCardUseAmtUpReqService {
  @Resource(name="finCardUseAmtUpReqDAO")
  private FinCardUseAmtUpReqDAO fndDAO;
    

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;		
	


  /**
    * 법인카드 한도증액 신청 목록
    * @author 
    * @since 2023.08.08.
    */
  @Override
  public List<FinCardUseAmtUpReqVo> selectList(FinCardUseAmtUpReqVo vo) throws ElException {
    List<FinCardUseAmtUpReqVo> list = fndDAO.selectList(vo);	
    return list;
  }

  /**
    * 법인카드 한도증액 신청에 상세정보
    * @author 
    * @since 2023.08.08.
    */
  @Override
  public FinCardUseAmtUpReqVo selectSingle(FinCardUseAmtUpReqVo vo) throws ElException {
    FinCardUseAmtUpReqVo resultVO = fndDAO.selectSingle(vo);
    	
      return resultVO;
  }
  
  /**
    * 셀렉트박스용 법인카드 목록
    * @author 
    * @since 2023.08.16.
    */
  @Override
  public List<FndCardSelectVo> selectCardList(FndCardSelectVo vo) throws ElException {
    List<FndCardSelectVo> list = fndDAO.selectCardList(vo);
    
    return list;
  }  

  /**
    * 법인카드 국내외 사용한도 증액신청 저장, 수정, 삭제, 반려
    * @author 
    * @since 2023.08.16.
    */
  @Override
	public FinCardUseAmtUpReqVo insertItem(FinCardUseAmtUpReqVo vo) throws ElException, IOException {
	
	String reqNo = "";
	String cudFlag = vo.getCud_flag();
	String apr_state = vo.getApr_state();
	if("I".equals(cudFlag)){
		//신청번호채번
		reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F70");
		vo.setReq_no(reqNo);
		fndDAO.insertItem(vo);
		//신청
		if("XAD010".equals(apr_state)){			
			// 1-1) 인터페이스 테이블 저장
			IntfatabVo inftaVo = new IntfatabVo();
			inftaVo.setReqNo(reqNo);
			inftaVo.setUiId("F981");
			inftaVo.setAprState(apr_state);
			inftaVo.setEndpoints(KitechContextUtil.getUserId());
			//결재상태 : 임시저장
			aprComService.putXomxintfatab(inftaVo);						
		}		
		return vo;	
	}else if("U".equals(cudFlag)){
		
		fndDAO.updateItem(vo);

	}else if("D".equals(cudFlag)){
	
		fndDAO.deleteItem(vo);	   
		if("XDA005".equals(vo.getApr_state())||"XAD010".equals(vo.getApr_state())){
			// 1-2) 인터페이스 테이블 삭제
			
			aprComService.delXomxintfatab(vo.getReq_no());
		}else{
			// 전자결재 삭제
			aprComService.deleteApr(vo.getReq_no());	   
		}
	}	
    return vo;
	}

  /**
    * 법인카드 한도증액 결제 신청
    * @author 
    * @since 2023.08.17.
    */
  @Override
	public FinCardUseAmtUpReqVo paymentRequest(FinCardUseAmtUpReqVo vo) throws Exception {
	
		if("XAD015".equals(vo.getApr_state())){			
			//1-2) 인터페이스 테이블 수정
			IntfatabVo inftaVo = new IntfatabVo();
			inftaVo.setReqNo(vo.getReq_no());
			inftaVo.setAprState("XAD005");
			aprComService.modXomxintfatab(inftaVo);					
		}
		AprVo aprVo = new AprVo();
		// 결재: 인스터스 생성 로직 구현				 		
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("F981");
		aprVo.setAprState(vo.getApr_state());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		if(!("XAD070".equals(vo.getApr_state()))){
			aprVo.setResearcher("");		
		}
		aprVo.setInfoCd(vo.getCard_no());
		aprVo.setExt1Cd(vo.getReq_nm());
						 		 				 		 
		apprFuncService.approvalScreen(aprVo);
		return vo;
	}

  /**
    * 법인카드 한도증액 승인 및 반려
    * @author 
    * @since 2023.08.17.
    */
  @Override
  public FinCardUseAmtUpReqVo apyConfORrejt(FinCardUseAmtUpReqVo vo) throws Exception {
	  if(vo.getCud_flag().equals("A")){
		  AprVo aprVo = new AprVo();
		  aprVo.setReqNo(vo.getReq_no());
		  aprVo.setEndpoint(KitechContextUtil.getUserId());
		  aprVo.setAprState("XAD100");
		  aprVo.setReporterId(KitechContextUtil.getSyspayno());
		  aprVo.setUiId("F981");
		  
		  apprFuncService.formAccept(aprVo);	  
	  }else{
	  
		  AprScVo aprScVo = new AprScVo();
		  aprScVo.setReqNo(vo.getReq_no());
		  aprScVo.setEndpoint(KitechContextUtil.getUserId());
		  aprScVo.setComments(vo.getComments());
		  apprFuncService.formReject(aprScVo);	  
	  }
	
	  return vo;
  }

}
