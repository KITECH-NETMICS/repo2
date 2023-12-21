package kr.re.kitech.biz.sup.par.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.sup.par.dao.SupParCustMentrChnghDAO;
import kr.re.kitech.biz.sup.par.service.SupParCustMentrChnghService;
import kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghListVo;
import kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect : 파트너기업 정보변경 신청 관련 처리를 담당하는 MyBatis Impl
 * @ClassName : SupParCustMentrchnghServiceImpl.java
 * @Description : 파트너기업 정보변경 신청 관련 처리를 담당하는 MyBatis Impl 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.14.      송선화    최초생성
 * 
 * @author 
 * @since 2023.09.14.
 * @version 1.0
 * @see
 * 
 */
@Service("supParCustMentrChnghServiceImpl")
public class SupParCustMentrChnghServiceImpl  extends EgovAbstractServiceImpl implements SupParCustMentrChnghService {
	
  @Resource(name="supParCustMentrChnghDAO")
  private SupParCustMentrChnghDAO custDAO;
  
  @Resource(name = "generationServiceImpl")
  public GenerationService generationService;
  
  @Resource(name = "apprFuncServiceImpl")
  public ApprFuncService apprFuncService;   
  
  //결재상태 유효성
  @Resource(name="apprValidServiceImpl")
  private ApprValidService apprValidService;
  
  @Resource(name="accntServiceImpl")
  private AccntService accntService;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDAO;
    
  /**
   * 파트너기업 정보변경 신청 목록 조회
   * @param SupParCustMentrChnghVo
   * @return List<SupParCustMentrChnghVo>
   * @throws KitechException
   */
  @Override
  public List<SupParCustMentrChnghVo> selectList(SupParCustMentrChnghVo vo) throws KitechException {
    List<SupParCustMentrChnghVo> list = custDAO.selectList(vo);	
    return list;
  }

  /**
   * 파트너기업 정보변경 신청 목록 소연심의 등록
   * @param SupParCustMentrchnghListVo
   * @return int
   * @throws KitechException
   */
	@Override
	public void insertItem(SupParCustMentrChnghListVo listVo) throws KitechException {
		for(SupParCustMentrChnghVo vo : listVo.getSupParCustMentrChnghVoList()) {
			custDAO.updateItem(vo);
		}
		//List<SupParCustMentrChnghVo>list=vo.getSptCustMentrChnghVoList();
	}
	
	/**
	   * 파트너기업 정보변경 신청 목록 상세 조회
	   * @param SupParCustMentrChnghVo
	   * @return SupParCustMentrChnghVo
	   * @throws KitechException
	   */
	  @Override
	  public SupParCustChargChngdVo select(SupParCustMentrChnghVo vo) throws KitechException {
		  SupParCustChargChngdVo resVo = new SupParCustChargChngdVo();
		  SupParCustMentrChnghVo custSelect = new SupParCustMentrChnghVo();				// 파트너기업정보
		  SupParCustMentrChnghVo preCustSelect = new SupParCustMentrChnghVo();			// 파트너기업정보
		  
		  List<SupParCustMentoInfoVo> preMentoSelect = new ArrayList<SupParCustMentoInfoVo>();
		  List<SupParCustChngInfoVo> prechargSelect = new ArrayList<SupParCustChngInfoVo>();
		  List<SupParCustMentoInfoVo> mentoSelect = new ArrayList<SupParCustMentoInfoVo>();
		  List<SupParCustChngInfoVo> chargSelect = new ArrayList<SupParCustChngInfoVo>();
		  
		  
		  if(vo.getReq_no().equals("")){		//저장전
			  preCustSelect = custDAO.selectSupParCustBaseinfo(vo);
			  
			  vo.setCust_no(preCustSelect.getCust_no());
			  vo.setAppont_no(preCustSelect.getAppont_no());
			  
			  resVo.setSupParCustMentrChnghVo(preCustSelect);
			  preMentoSelect = custDAO.selectSupParCustMentoInfo(vo);
			  prechargSelect = custDAO.selectSupParCustCharg(vo);
			  mentoSelect = custDAO.selectSupParCustMentrChngd(vo);
			  chargSelect = custDAO.selectSupParCustChargChngd(vo);
			  
			  resVo.setBeforeMentoList(preMentoSelect);
			  resVo.setBeforeChargList(prechargSelect);
			  resVo.setAfterMentoList(mentoSelect);
			  resVo.setAfterChargList(chargSelect);			  
		  } else {		//저장 이후
			  String aprstate = "";
			  custSelect = custDAO.selectSupParCustMentrChngh(vo);
			  
			  vo.setCust_no(custSelect.getCust_no());
			  vo.setAppont_no(custSelect.getAppont_no());
			  // Cust_no 150224 Appont_no 2023-0001
			  
			  custSelect.setReq_no(vo.getReq_no());
			  resVo.setSupParCustMentrChnghVo(custSelect);
			  
			  aprstate = custSelect.getApr_state();
			  if(aprstate.compareTo("XAD020") < 0) { // 상신 이전
				  preMentoSelect = custDAO.selectSupParCustMentoInfo(vo);
				  prechargSelect = custDAO.selectSupParCustCharg(vo);
				  
				  resVo.setBeforeMentoList(preMentoSelect);
				  resVo.setBeforeChargList(prechargSelect);
			  } else {	
				  vo.setChng_clsf("1");  // 변경전 멘토 조회
				  mentoSelect = custDAO.selectSupParCustMentrChngd(vo);
				  chargSelect = custDAO.selectSupParCustChargChngd(vo);
				  
				  resVo.setBeforeMentoList(mentoSelect);
				  resVo.setBeforeChargList(chargSelect);	
			  }
			  
			  vo.setChng_clsf("2");  // 변경후 멘토 조회
			  mentoSelect = custDAO.selectSupParCustMentrChngd(vo);
			  chargSelect = custDAO.selectSupParCustChargChngd(vo);
			  
			  resVo.setAfterMentoList(mentoSelect);
			  resVo.setAfterChargList(chargSelect);	
		  }
		  
		  return resVo;
	  }
	  
	  /**
	   * 파트너기업 정보변경 신청 목록 상세 삭제
	   * @param SupParCustMentrChnghVo
	   * @return SupParCustMentrChnghVo
	   * @throws KitechException
	   */
	  @Override
	  public void deleteSupParPart(SupParCustMentrChnghVo vo) throws KitechException {
		  custDAO.deleteSupParPart(vo);		  
	  }
	  
	  /**
	   * 파트너기업 정보변경 신청 등록/저장
	   * @param SupParCustMentrchnghListVo
	   * @return int
	   * @throws KitechException
	   */
		@Override
		public SupParCustMentrChnghVo saveParInfoAll(SupParCustChargChngdVo vo) throws KitechException{
			SupParCustMentrChnghVo resVo = new SupParCustMentrChnghVo();
			SupParCustMentrChnghVo baseInfoVo = vo.getSupParCustMentrChnghVo();
			SupParCustChargChngdVo supParAprVo = new SupParCustChargChngdVo();
			
			
			String reqNo = baseInfoVo.getReq_no();
			
			
			if(reqNo.equals("")) {	//저장전
				String gen = "";
				gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), baseInfoVo.getDocId());
				reqNo = gen;
				//insertId01  insertSupParCustMentrChngh
				baseInfoVo.setReq_no(gen);
				custDAO.insertSupParCustMentrChngh(baseInfoVo);
				apprFuncService.formInit(gen, baseInfoVo.getServiceId(), KitechContextUtil.getUserId());
			} else { // 저장후
				
				//결재상태 유효성
				try {
					apprValidService.isWaitStateAtIntfatab(baseInfoVo.getServiceId(), baseInfoVo.getReq_no());
				}catch (KitechException ex){
					throw ex;
				}
				
				//updateId01
				custDAO.updateSupParCustMentrChngh01(baseInfoVo);
				//deleteId02
				custDAO.deleteSupParCustMentrChngd(baseInfoVo);
				//deleteId03
				custDAO.deleteSupParCustChargEngd(baseInfoVo);
			}
			
			int save1count = 0;
			int save2count = 0;
			int save3count = 0;
			int save4count = 0;
			
			
			// insertId02 
			// 변경전 멘토
			List<SupParCustMentoInfoVo> beforeMentoList = vo.getBeforeMentoList();
			//SupParCustMentoInfoVo beforeMento = new SupParCustMentoInfoVo();
			if(beforeMentoList.size() > 0){
				//save1count = beforeMentoList.size();
				for(SupParCustMentoInfoVo bMVo : vo.getBeforeMentoList()){
					save1count = save1count+1;
					bMVo.setReq_no(reqNo);
					bMVo.setSeq(String.valueOf(save1count));
					custDAO.updateSupParCustMentrChngd(bMVo);
				}
			}
			
			// insertId02
			// 변경후 멘토
			List<SupParCustMentoInfoVo> afterMentoList = vo.getAfterMentoList();
			if(afterMentoList.size() > 0) {
				for(SupParCustMentoInfoVo aMVo : vo.getAfterMentoList()){
					save2count = save2count +1;
					aMVo.setReq_no(reqNo);
					aMVo.setSeq(String.valueOf(save2count));
					custDAO.updateSupParCustMentrChngd(aMVo);
				}
			}
			
			//insertId03
			// 변경전 담당자
			List<SupParCustChngInfoVo> beforeChargList = vo.getBeforeChargList();
			if(beforeChargList.size() > 0) {
				//save3count = beforeChargList.size();
				for(SupParCustChngInfoVo  bCVo : vo.getBeforeChargList()){
					save3count = save3count +1;
					bCVo.setReq_no(reqNo);
					bCVo.setSeq(String.valueOf(save3count));
					custDAO.insertSupParCustChargEngd(bCVo);
				}
			}
			
			//insertId03
			// 변경후 담당자
			List<SupParCustChngInfoVo> afterChargList = vo.getAfterChargList();
			if(afterChargList.size() > 0) {
				//save4count = afterChargList.size();
				for(SupParCustChngInfoVo aCVo : vo.getAfterChargList()){
					save4count = save4count + 1;
					aCVo.setReq_no(reqNo);
					aCVo.setSeq(String.valueOf(save4count));
					custDAO.insertSupParCustChargEngd(aCVo);
				}
			}
			
			if(baseInfoVo.isApproval()) {
				AprVo aprVo = new AprVo();
				supParAprVo.setAfterChargList(vo.getAfterChargList());
				supParAprVo.setBeforeChargList(vo.getBeforeChargList());
				supParAprVo.setAfterMentoList(vo.getAfterMentoList());
				supParAprVo.setBeforeMentoList(vo.getBeforeMentoList());
				
				supParAprVo.setSupParCustMentrChnghVo(baseInfoVo);
				
				aprVo.setReqNo(reqNo);
				aprVo.setEndpoint(accntService.findUserIdBySyspayno(baseInfoVo.getRegst_syspayno()).getUid());
				aprVo.setAprState(baseInfoVo.getApr_state());
				aprVo.setUiId(baseInfoVo.getServiceId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setBefrMentr(baseInfoVo.getBefore_mento());
				aprVo.setAfterMentr(baseInfoVo.getAfter_mento());
				aprVo.setSupportPsn(baseInfoVo.getSyspayno());
				aprVo.setInfoCd(baseInfoVo.getCmpy_nm_krchar()+"("+baseInfoVo.getCust_no()+"} 멘토변경");
				AppLog.debug("======getAttach_file_no==="+baseInfoVo.getAttach_file_no());
				//스냅샷에 전달하기위한 첨부파일 세팅
				if(!"".equals(baseInfoVo.getAttach_file_no())){
					supParAprVo.setFileList(attachDAO.selectListAttach(baseInfoVo.getAttach_file_no()));
				}

				//supParAprVosetFileList(attachDAO.selectListAttach(baseInfoVo.getAttach_file_no());
				
				apprFuncService.approvalRequest(aprVo, supParAprVo);
			}
			
			resVo.setReq_no(baseInfoVo.getReq_no());
			
			return resVo;
		}
		
		/**
	   * 파트너기업 정보변경 신청 - 사업지원 실장 조회
	   * @param SupParCustMentrChnghVo
	   * @return SupParCustMentrChnghVo
	   * @throws KitechException
	   */
	 @Override
	  public SupParCustMentrChnghVo selectSupportPsn(SupParCustMentrChnghVo vo) throws KitechException{
		  SupParCustMentrChnghVo resVo = new SupParCustMentrChnghVo();
		  resVo = custDAO.selectSupportPsn(vo);
		  
		  return resVo;
	  }
}
