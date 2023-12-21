package kr.re.kitech.biz.ccs.cgs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cgs.dao.CgsSealUseDAO;
import kr.re.kitech.biz.ccs.cgs.service.CgsSealUseService;
import kr.re.kitech.biz.ccs.cgs.vo.CgsSealUseVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;

/**
 * @ClassSubJect : 직인/인감신청 serviceImpl
 * @Class Name : cgsSealUseServiceImpl.java
 * @Description : 직인/인감신청 서비스
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.08.30.      lsh    최초생성
 * 
 * @author lsh
 * @since 2023.08.30.
 * @version 1.0
 * @see
 * 
 */
@Service("cgsSealUseServiceImpl")
public class CgsSealUseServiceImpl  extends EgovAbstractServiceImpl implements CgsSealUseService {
	@Resource(name="cgsSealUseDAO")
	private CgsSealUseDAO cgsDAO;
    
	@Resource(name="mailSender")
	private MailSender mailSender;
	
	@Resource(name="generationServiceImpl")
	private GenerationService generationService;
	
	@Resource(name = "apprFuncServiceImpl")
    public ApprFuncService apprFuncService;
    
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;

   /**
    * 직인/인감신청 목록 조회
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return List<CgsSealUseVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public List<CgsSealUseVo> selectList(CgsSealUseVo vo) throws ElException {
      List<CgsSealUseVo> list = cgsDAO.selectList(vo);	
      return list;
    }
    
   /**
    * 직인/인감신청 상세 조회
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return CgsSealUseVo
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public CgsSealUseVo selectItem(CgsSealUseVo vo) throws ElException {
      CgsSealUseVo resultVO = cgsDAO.selectItem(vo);			
      return resultVO;
    }

   /**
    * 직인/인감신청 등록
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return CgsSealUseVo
    * @throws Exception
    * @since 2023.08.30.   
    */
  	@Override
	public CgsSealUseVo saveItem(CgsSealUseVo vo) throws Exception {
	  	CgsSealUseVo resultVo = new CgsSealUseVo();
	  	
		if("C".equals(vo.getCud_type())){ // 신규등록일때
			vo.setReq_no(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "C3A"));
			cgsDAO.insertItem(vo);
			
			// 인터페이스 테이블 저장
			apprFuncService.formInit(vo.getReq_no(), "C200", "");
		}else{ // 수정일때
		
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab("C200", vo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}
			
			cgsDAO.updateItem(vo);
		}
		
		if(vo.isApproval()){
    		this.approvalSealUseReq(vo);
    	}
	
		resultVo.setReq_no(vo.getReq_no());
    	return resultVo;
	}
	
   /**
    * 직인/인감신청 결재신청
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return void
    * @throws Exception
    * @since 2023.08.30.   
    */
	private void approvalSealUseReq(CgsSealUseVo vo) throws Exception {	
    	// 결재정보
    	AprVo aprVo = new AprVo();
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setInfoCd(vo.getSeal_clsf_nm());
		aprVo.setExt2Cd(vo.getUse_usg());
		aprVo.setUiId("C200"); //서비스ID
			
		apprFuncService.approvalRequest(aprVo, vo);		
	}
	
   /**
    * 직인/인감신청 삭제
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return void
    * @throws Exception
    * @since 2023.08.30.   
    */
	@Override
	public void deleteItem(CgsSealUseVo vo) throws Exception {
		cgsDAO.deleteItem(vo);
		
		// 결재정보 삭제
		apprFuncService.formRemove(vo.getReq_no());
	}
	
   /**
    * 사용(직인/인감)인수증 목록조회(팝업)
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return List<CgsSealUseVo>
    * @throws ElException
    * @since 2023.08.30.   
    */
    @Override
    public List<CgsSealUseVo> selectListPop(CgsSealUseVo vo) throws ElException {
      List<CgsSealUseVo> list = cgsDAO.selectListPop(vo);	
      return list;
    }	

   /**
    * 사용(직인/인감)인수증 수정(팝업)
 	 * 
 	 * @author lsh
    * @param  CgsSealUseVo
    * @return int
    * @throws Exception
    * @since 2023.08.30.   
    */
    @Override
  	public int updateItemPop(CgsSealUseVo vo) throws Exception {
  	  	int result = cgsDAO.updateItemPop(vo);
  		return result;
  	}

}
