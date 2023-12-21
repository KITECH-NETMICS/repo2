package kr.re.kitech.biz.lpl.lpr.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lpr.dao.LplLprPressPrDAO;
import kr.re.kitech.biz.lpl.lpr.service.LplLprPressPrService;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrAprVo;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 언론보도신청 관련 처리를 담당하는 MyBatis Impl
 * @Class Name LplLprPressPrServiceImpl.java
 * @Description 언론보도신청 처리를 담당하는 구현체 서비스
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2023.08.21.      김상미             최초생성
 * 
 * @author 김상미
 * @since 2023.08.21.
 * @version 1.0
 * @see
 * 
 */
 
@Service("lplLprPressPrServiceImpl")
public class LplLprPressPrServiceImpl  extends EgovAbstractServiceImpl implements LplLprPressPrService {
	@Resource(name="lplLprPressPrDAO")
	private LplLprPressPrDAO lprDAO;
		
	@Resource(name = "generationServiceImpl")
	public GenerationService generationService;
		
	@Resource(name = "apprFuncServiceImpl")
	public ApprFuncService apprFuncService;   
	  
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;  
		
	@Resource(name="attachDAO")
	private AttachDAO attachDAO;
	  
	@Resource(name="accntServiceImpl")
	private AccntService accntService;  
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;

    /**
     * 언론보도신청 목록조회 
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return List<LplLprPressPrInfoVo>
	 * @throws KitechException
	 * @since 2023.08.21.
	 */    
	@Override
	public List<LplLprPressPrInfoVo> selectList(LplLprPressPrInfoVo vo) throws KitechException {
		List<LplLprPressPrInfoVo> list = lprDAO.selectList(vo);	
		return list;
	}

	/**
	 * 언론보도신청 상세 조회
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	@Override
	public LplLprPressPrInfoVo select(LplLprPressPrInfoVo vo) throws KitechException {
		LplLprPressPrInfoVo resultVO = lprDAO.select(vo);			
		return resultVO;
	}

	/**
	 * 언론보도신청 등록
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @return LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
	@Override
	public LplLprPressPrInfoVo save(LplLprPressPrInfoVo vo) throws KitechException {
		LplLprPressPrInfoVo resVo = new LplLprPressPrInfoVo();
		LplLprPressPrAprVo lplLprPressPrAprVo = new LplLprPressPrAprVo();
		String req_no = vo.getReq_no();

		if(req_no.equals("")){
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), vo.getDoc_id());
			vo.setReq_no(gen);
			lprDAO.insert(vo);
			apprFuncService.formInit(gen, vo.getService_id(), KitechContextUtil.getUserId());
		}else{
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(vo.getService_id(), vo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}	
			
			lprDAO.update(vo);
			if(vo.isApproval()){
			
				lplLprPressPrAprVo.setLplLprPressPrInfoVo(vo);
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(vo.getReq_no());
				aprVo.setEndpoint(accntService.findUserIdBySyspayno(vo.getReq_psn_syspayno()).getUid());
				aprVo.setAprState(vo.getApr_state());
				aprVo.setInfoCd(vo.getInfo_cd());
				aprVo.setUiId(vo.getService_id());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
	
				//2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
				// 첨부파일 번호로 첨부파일 리스트 조회
				lplLprPressPrAprVo.setFileList(attachDAO.selectListAttach(vo.getAttach_file_mngmt_no()));
				
				apprFuncService.approvalRequest(aprVo, lplLprPressPrAprVo);
			}
		}
	
		resVo.setReq_no(vo.getReq_no());
	    return resVo;
	}
	

	/**
	 * 언론보도신청 정보 삭제
     * 
     * @author 김상미
	 * @param LplLprPressPrInfoVo
	 * @throws KitechException
	 * @since 2023.08.21.
	 */
  	@Override
	public void delete(LplLprPressPrInfoVo vo) throws KitechException {
	  	lprDAO.delete(vo);
		apprFuncService.formRemove(vo.getReq_no());
	}

}
