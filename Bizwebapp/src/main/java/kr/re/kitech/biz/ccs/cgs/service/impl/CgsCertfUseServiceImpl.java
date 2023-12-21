package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgsCertfUseDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsCertfUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsCertfUseVo;
import kr.re.kitech.biz.ccs.com.dao.CcsComDAO;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect : 법인증명서발급신청 serviceImpl 
 * @Class Name : CgsCertfUseServiceImpl.java
 * @Description : 법인증명서발급신청 서비스 구현
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.31.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.31.
 * @version 1.0
 * @see
 * 
 */
@Service("cgsCertfUseServiceImpl")
public class CgsCertfUseServiceImpl  extends EgovAbstractServiceImpl implements CgsCertfUseService {
  @Resource(name="cgsCertfUseDAO")
  private CgsCertfUseDAO cgsDAO;
  
  @Resource(name="ccsComDAO")
  private CcsComDAO dao;
  
  @Resource(name="generationServiceImpl")
  private GenerationService generationService;

  @Resource(name = "apprFuncServiceImpl")
  public ApprFuncService apprFuncService;
  
  @Resource(name="attachDAO")
  private AttachDAO attachDao;

@Resource(name="apprValidServiceImpl")
private ApprValidService apprValidService;  
  /**
   * 법인증명서발급신청 목록 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return List<CgsCertfUseVo>
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public List<CgsCertfUseVo> selectList(CgsCertfUseVo vo) throws KitechException {
	  List<CgsCertfUseVo> list = cgsDAO.selectList(vo);	
	  return list;
  }

  /**
   * 법인증명서발급신청 상세 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return CgsCertfUseVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public CgsCertfUseVo selectItem(CgsCertfUseVo vo) throws KitechException {
	  CgsCertfUseVo resultVO = cgsDAO.selectItem(vo);			
      return resultVO;
  }

  /**
   * 법인증명서발급신청 등록
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public CgsCertfUseVo insertItem(CgsCertfUseVo vo) throws KitechException {
	  CgsCertfUseVo resultVo = new CgsCertfUseVo();
	  
	  if("C".equals(vo.getCud_type())){ // 신규등록일때
		  
		  vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C3E"));
		  cgsDAO.insertItem(vo);
			
		  // 인터페이스 테이블 저장
		  apprFuncService.formInit(vo.getReq_no(), "C204", "");
	  }else{ // 수정일때
		
		  // AprState 체크하는 공통 메소드호출
		  try {
		      apprValidService.isWaitStateAtIntfatab("C204", vo.getReq_no());
		  } catch (KitechException ex) {
		      throw ex;
		  }
		
		  cgsDAO.updateItem(vo);
	  }
		
	  if(vo.isApproval()){
	  	  // 결재정보
      	  AprVo aprVo = new AprVo();
	  	  aprVo.setEndpoint(KitechContextUtil.getUserId());
	  	  aprVo.setReqNo(vo.getReq_no());
	  	  aprVo.setUiId("C204"); //서비스ID
	  	  aprVo.setInfoCd(vo.getGdnm_nm());
	  	  aprVo.setExt2Cd(vo.getSubmit_loc());
	  	  
	  	  // 스냅샷에 전달할 정보 셋팅
	  	  // 1.첨부파일
		  if(!"".equals(vo.getAttach_file_no())){
			  vo.setFileList(attachDao.selectListAttach(vo.getAttach_file_no()));
		  }
		  
		  // 2.신청자 사원번호 셋팅	
	  	  vo.setReq_emp_no("(" + KitechContextUtil.getSession().getEmpno() + ")");
	  	  
	  	  // 3.신청일자 셋팅
	  	  String reqYmd = vo.getReq_ymd();
	  	  String year = reqYmd.substring(0, 4); 
	  	  String month = reqYmd.substring(4, 6); 
	  	  String day = reqYmd.substring(6, 8);
	  	  vo.setReq_ymd(year + "-" + month + "-" + day);
	  	     
	  	  apprFuncService.approvalRequest(aprVo, vo);
	  }
	  		
	  resultVo.setReq_no(vo.getReq_no());
      return resultVo;
  }
  
  /**
   * 법인증명서발급신청 삭제
   * 
   * @author lsh
   * @param CgsCertfUseVo
   * @return int
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public void deleteItem(CgsCertfUseVo vo) throws KitechException {
	  cgsDAO.deleteItem(vo);
	  
	  // 결재정보 삭제
	  apprFuncService.formRemove(vo.getReq_no());
  }

  /**
   * 주소 조회
	 * 
	 * @author lsh
   * @param CgsCertfUseVo
   * @return CgsCertfUseVo
   * @throws KitechException
   * @since 2023.08.31.   
   */
  @Override
  public CgsCertfUseVo selectAddr(CgsCertfUseVo vo) throws KitechException {
	  return cgsDAO.selectListAddr(vo);
  }
}
