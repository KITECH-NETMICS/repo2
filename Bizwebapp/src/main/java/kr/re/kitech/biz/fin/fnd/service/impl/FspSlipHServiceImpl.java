package kr.re.kitech.biz.fin.fnd.service.impl;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.apr.vo.IntfatabVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.fnd.dao.FspSlipHDAO;
import kr.re.kitech.biz.fin.fnd.service.FspSlipHService;
import kr.re.kitech.biz.fin.fnd.vo.FspSendReqVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerListVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHMerVo;
import kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.util.MailSender;

@Service("fspSlipHServiceImpl")
public class FspSlipHServiceImpl  extends EgovAbstractServiceImpl implements FspSlipHService {
  @Resource(name="fspSlipHDAO")
  private FspSlipHDAO fndDAO;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	    
	@Resource(name="mailSender")
	private MailSender mailSender;


  /**
    * 출금 결의 현황 조회
    * @author 
    * @since 2023.08.04.
    */
  @Override
  public List<FspSlipHVo> selectList(FspSlipHVo vo) throws ElException {
    List<FspSlipHVo> list = fndDAO.selectList(vo);	
    return list;
  }

  /**
    * 출금 결의 현황 결재 조회
    * @author 
    * @since 2023.08.08.
    */
  @Override
  public List<FspSlipHVo> selectFspSlipDetail(FspSlipHVo vo) throws ElException {
    AppLog.info("출금 결의 현황 "+vo.toString()); 
    List<FspSlipHVo> list = fndDAO.selectFspSlipDetail(vo);
      return list;
  }

  /**
    * 출금결의 지불장 신청 저장
    * @author 
    * @since 2023.08.08.
    */
  @Override
	public FspSlipHMerVo insertItem(FspSlipHMerListVo vo) throws ElException, IOException {
	
		String reqNo = vo.getFspSlipHMerVo().getReq_no();
		String sysPayNo = vo.getFspSlipHMerVo().getSyspayno();
		String reqYmd = vo.getFspSlipHMerVo().getReq_ymd();
		String saveClsf = vo.getFspSlipHMerVo().getSave_clsf();
		String aprClsf = vo.getFspSlipHMerVo().getApr_clsf();
		String aprTobeCode = vo.getFspSlipHMerVo().getApr_tobe_code();

		if ("insert".equals(saveClsf)) { //저장 
			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "F72");
			for (int i = 0; i < vo.getFspSlipHVoList().size(); i++) {
				vo.getFspSlipHVoList().get(i).setReq_no(reqNo);
				vo.getFspSlipHVoList().get(i).setReq_seq(i+1);
				vo.getFspSlipHVoList().get(i).setRegst_syspayno(sysPayNo);
				vo.getFspSlipHVoList().get(i).setReq_ymd(reqYmd);
				vo.getFspSlipHVoList().get(i).setReq_psn_syspayno(vo.getFspSlipHMerVo().getReq_psn_syspayno());
				vo.getFspSlipHVoList().get(i).setReq_psn_dept_cd(vo.getFspSlipHMerVo().getReq_psn_dept_cd());
				vo.getFspSlipHVoList().get(i).setReq_psn_dept_new_ymd(vo.getFspSlipHMerVo().getReq_psn_dept_new_ymd());

				fndDAO.insertItem(vo.getFspSlipHVoList().get(i));
			}

			// 1-1) 인터페이스 테이블 저장
			IntfatabVo inftaVo = new IntfatabVo();
			inftaVo.setReqNo(reqNo);
			inftaVo.setUiId("F723");
			inftaVo.setAprState("XAD005");
			inftaVo.setEndpoints(KitechContextUtil.getUserId());
			//결재상태 : 임시저장
			apprFuncService.formInit(reqNo, "F723", KitechContextUtil.getUserId(), vo.getFspSlipHMerVo().getInfo());
				
		}else{ // 수정
			for (int i = 0; i < vo.getFspSlipHVoList().size(); i++) {
				vo.getFspSlipHVoList().get(i).setUpdt_syspayno(sysPayNo);
				vo.getFspSlipHVoList().get(i).setReq_ymd(reqYmd);
				
				fndDAO.insertItem(vo.getFspSlipHVoList().get(i));
			}
		}
		//결재상신시 XDA010 수정
		if("apr".equals(aprClsf)){		
			
			// 결재정보
			AprVo aprVo = new AprVo();
			aprVo.setUiId("F723");
			aprVo.setReqNo(reqNo);
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setAprState(aprTobeCode);
			aprVo.setInfoCd(vo.getFspSlipHMerVo().getInfo());
				
			apprFuncService.approvalRequest(aprVo, vo);	
			
		}
		
		
		//리턴 req_no 보내기
		
	    return vo.getFspSlipHMerVo();
	}

   /**
    * 단건 삭제
    * @author 
    * @since 2023.08.09.
    */
   @Override
   public FspSlipHVo deleteItem(FspSlipHVo vo) throws Exception {	
	   // 지불장 삭제
	   fndDAO.deleteItem(vo);
	   
	    // 결재삭제
	   apprFuncService.formRemove(vo.getReq_no());
	   
	   return vo;
   }
  

	/**
     * 엑셀내리기
     * @param FspSendReqVo
     * @return FspSendReqVo
     * @throws Exception
	 * @author 김준하
	 * @since 2023.08.04.
     */
	public List<FspSendReqVo> selectFspSlipExel(FspSendReqVo vo) throws KitechException{
		 
		return fndDAO.selectFspSlipExel(vo);
	}
	
	/**
     * 엑셀내리기 은행 코드 포함
     * @param FspSendReqVo
     * @return FspSendReqVo
     * @throws Exception
	 * @author 김준하
	 * @since 2023.08.04.
     */
	public List<FspSendReqVo> selectFspSlipBankExel(FspSendReqVo vo) throws KitechException{

		return fndDAO.selectFspSlipBankExel(vo);
	}	

}
