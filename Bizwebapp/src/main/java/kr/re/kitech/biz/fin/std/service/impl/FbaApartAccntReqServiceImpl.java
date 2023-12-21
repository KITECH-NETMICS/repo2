package kr.re.kitech.biz.fin.std.service.impl;

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
import kr.re.kitech.biz.fin.std.dao.FbaApartAccntReqDAO;
import kr.re.kitech.biz.fin.std.service.FbaApartAccntReqService;
import kr.re.kitech.biz.fin.std.vo.FbaApartAccntReqVo;
import kr.re.kitech.biz.fin.std.vo.FinPartAccntVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 별도계좌 신청 서비스
 * @Class Name FbaApartAccntReqServiceImpl.java
 * @Description 별도계좌 신청 관련 처리를 담당하는 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/28   김준하             최초생성
 * 
 * @author 김준하
 * @since 2023/07/28
 * @version 1
 * @see
 * 
 */
@Service("fbaApartAccntReqServiceImpl")
public class FbaApartAccntReqServiceImpl  extends EgovAbstractServiceImpl implements FbaApartAccntReqService {
  @Resource(name="fbaApartAccntReqDAO")
  private FbaApartAccntReqDAO stdDAO;
    	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;	
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	

  @Override
  public List<FbaApartAccntReqVo> selectList() throws ElException {
    List<FbaApartAccntReqVo> list = stdDAO.selectList();
    return list;
  }
  
  	/**
     * 별도 계좌 목록 조회
     * @param FbaApartAccntReqVo
     * @return List<FbaApartAccntReqVo>
	 * @author 김준하
	 * @since 2023.07.25.
     */
	  @Override
	  public List<FbaApartAccntReqVo> selectListItem(FbaApartAccntReqVo vo) throws ElException {
	    List<FbaApartAccntReqVo> list = stdDAO.selectListItem(vo);
	    return list;
	  }
	  
   /**
   * 별도 계좌 신청전 기본 데이터 조회
   * @param FbaApartAccntReqVo
   * @return FbaApartAccntReqVo
   * @author 김준하
   * @since 2023.07.26.
   */	  
	@Override
	public FbaApartAccntReqVo selectSingleItem(FbaApartAccntReqVo vo) throws ElException {
	    // 기존 신청 내역 데이터 조회
	    if (vo.getReq_no() != null && !vo.getReq_no().isEmpty()) {
	        FbaApartAccntReqVo resultVO = stdDAO.selectSingleItem(vo);
	        System.out.println("Result: " + resultVO);
	        return resultVO;
	        
	   // 신규 생성 기본 데이터 조회    
	    } else {
	    	FbaApartAccntReqVo resultBeforeVO = stdDAO.selectBeforeSingleItem(vo);	    	    	
	        return resultBeforeVO;
	    }
	}
	/**
     * 별도 계좌 승인
     * @param FbaApartAccntReqVo
     * @return FbaApartAccntReqVo
	 * @author 김준하
	 * @since 2023.08.02.
     */	
	  @Override
		public FbaApartAccntReqVo approvalItem(FbaApartAccntReqVo vo) throws ElException, IOException {		  	
		    AprVo aprVo = new AprVo();
		    aprVo.setReqNo(vo.getReq_no());
		    aprVo.setEndpoint(KitechContextUtil.getUserId());
		    aprVo.setAprState(vo.getApr_state());
		    aprVo.setReporterId(vo.getRegst_syspayno());
            aprVo.setUiId("F131");
            
		    apprFuncService.formAccept(aprVo);
		    stdDAO.approvalItemItem(vo);
		
		return vo;
		}
		
	/**
     * 별도 계좌 반려
     * @param FbaApartAccntReqVo
     * @return FbaApartAccntReqVo
	 * @author 김준하
	 * @since 2023.08.02.
     */
	  @Override
		public FbaApartAccntReqVo rejectItem(FbaApartAccntReqVo vo) throws ElException, IOException {
			AprScVo aprScVo = new AprScVo();
			aprScVo.setReqNo(vo.getReq_no());
			aprScVo.setEndpoint(KitechContextUtil.getUserId());
			aprScVo.setComments(vo.getComments());
			apprFuncService.formReject(aprScVo);
		
		  return vo;
		}			
		

	 /**
     * 별도 계좌 신청
     * @param FbaApartAccntReqVo
     * @return FbaApartAccntReqVo
	 * @author 김준하
	 * @since 2023.07.27.
     */	
	  @Override
		public FbaApartAccntReqVo mergeItem(FbaApartAccntReqVo vo) throws ElException, IOException {
		  //임시 저장
		  if(vo.getReq_no()==null||vo.getReq_no().equals("")){
			String newReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F35");
			 // 1-1) 인터페이스 테이블 저장
			IntfatabVo inftaVo = new IntfatabVo();
			inftaVo.setReqNo(newReqNo);
			inftaVo.setUiId("F131");
			inftaVo.setAprState(vo.getApr_state());
			inftaVo.setEndpoints(KitechContextUtil.getUserId());
			//결재상태 : 임시저장
			aprComService.putXomxintfatab(inftaVo);
			vo.setReq_no(newReqNo);
			//데이터 저장
			stdDAO.insertItem(vo);		 	
		 //변경 저장
		 }else{
			 String apr_state=vo.getApr_state();			 
			 //신청
			 if("XAD010".equals(apr_state)){
				 stdDAO.updateItem(vo);				 	 
				 AprVo aprVo = new AprVo();
				 aprVo.setApproval(vo.isApproval());
				 if (aprVo.isApproval()) {
				 	// 결재: 인스터스 생성 로직 구현				 		
					 aprVo.setReqNo(vo.getReq_no());
					 aprVo.setReporterId(vo.getSyspayno());
					 aprVo.setUiId("F131");
					 aprVo.setAprState(apr_state);
					 aprVo.setEndpoint(KitechContextUtil.getUserId());				 		 				 		 
					 apprFuncService.approvalScreen(aprVo);
				 }				 	 					 
				} else{
					//수정	
					if("XAD015".equals(apr_state)){
						IntfatabVo inftaVo = new IntfatabVo();
						inftaVo.setReqNo(vo.getReq_no());
						inftaVo.setAprState("XAD005");
						aprComService.modXomxintfatab(inftaVo);
					}					
					stdDAO.updateItem(vo);			 
				}		 	  
		 }
		  
		  return vo;
		}
		
	 /**
     * 별도 계좌 삭제
     * @param FbaApartAccntReqVo
     * @return int
	 * @author 김준하
	 * @since 2023.07.28.
     */	
	  @Override
		public int deleteItem(FbaApartAccntReqVo vo) throws Exception {		  			  	
		  	int result = aprComService.delXomxintfatab(vo.getReq_no());
		  		result = stdDAO.deleteItem(vo);		  		
			return result;
		}
		
	/**
	* 별도 계좌 조회
	* @param FbaApartAccntReqVo
	* @return List<FbaApartAccntReqVo>
	* @author 김준하
	* @since 2023.10.31.
	*/
	@Override
	public List<FbaApartAccntReqVo> selectListItem2(FbaApartAccntReqVo vo) throws ElException {
		List<FbaApartAccntReqVo> list = stdDAO.selectListItem2(vo);
		return list;
	}
	  
    /**
    * 별도계좌 from 조회
    * @param FbaApartAccntReqVo
    * @return FbaApartAccntReqVo
    * @author 김준하
    * @since 2023.10.31.
    */	  
	@Override
	public FbaApartAccntReqVo selectSingleItem2(FbaApartAccntReqVo vo) throws ElException {
		return vo = stdDAO.selectSingleItem2(vo);
	}
	
    /**
    * 별도계좌 cnt 조회
    * @param FbaApartAccntReqVo
    * @return FbaApartAccntReqVo
    * @author 김준하
    * @since 2023.10.31.
    */	  
	@Override
	public FbaApartAccntReqVo selectSingleItem3(FbaApartAccntReqVo vo) throws ElException {
		return vo = stdDAO.selectSingleItem3(vo);
	}

    /**
    * 별도계좌 등록,수정,삭제
    * @param FbaApartAccntReqVo
    * @return FbaApartAccntReqVo
    * @author 김준하
    * @since 2023.10.31.
    */	  
	@Override
	public FbaApartAccntReqVo mergeItem2(FbaApartAccntReqVo vo) throws ElException {
		String cudType = vo.getCud_type();
		if ("I".equals(cudType)) {
			stdDAO.insertFbaApartAccnt(vo);		
		} else if ("U".equals(cudType)){
			stdDAO.updateFbaApartAccnt(vo);
		} else if ("D".equals(cudType)){
			stdDAO.deleteFbaApartAccnt(vo);
		}	
		return vo;
	}
	
   /**
    * 별도계좌 집행 조회
    * 
    * @author 
    * @param FinPartAccntVo
    * @return List<FinPartAccntVo>
    * @throws KitechException
    * @since 2023.11.01.   
    */
   @Override
   public List<FinPartAccntVo> selectList01(FinPartAccntVo vo) throws ElException {
     List<FinPartAccntVo> list = stdDAO.selectList01(vo);	
     return list;
   }					
}
