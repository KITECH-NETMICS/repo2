package kr.re.kitech.biz.lpl.lpr.service.impl;

import java.util.ArrayList;
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
import kr.re.kitech.biz.lpl.lpr.dao.LplLprPrGoodsReqDAO;
import kr.re.kitech.biz.lpl.lpr.service.LplLprPrGoodsReqService;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqAprVo;
import kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.service.AccntService;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : LprPrGdReqHServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.13.      author    최초생성
 * 
 * @author 
 * @since 2023.09.13.
 * @version 1.0
 * @see
 * 
 */
@Service("lplLprPrGoodsReqServiceImpl")
public class LplLprPrGoodsReqServiceImpl  extends EgovAbstractServiceImpl implements LplLprPrGoodsReqService {

	@Resource(name="lplLprPrGoodsReqDAO")
	private LplLprPrGoodsReqDAO lprDAO;
	
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
	 * 기념홍보물신청 리스트 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	@Override
	public List<LplLprPrGoodsReqInfoVo> selectList(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		List<LplLprPrGoodsReqInfoVo> list = lprDAO.selectList(vo);	
		return list;
	}

	/**
	 * 기념홍보물신청 물품정보 리스트 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */	
	@Override
	public List<LplLprPrGoodsReqInfoVo> selectMasterList(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		List<LplLprPrGoodsReqInfoVo> list = lprDAO.selectMasterList(vo);	
		return list;
	}


	/**
	 * 기념홍보물신청 물품재고정보 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */	
	@Override
	public List<LplLprPrGoodsReqInfoVo> selectGoodsInv(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		List<LplLprPrGoodsReqInfoVo> list = lprDAO.selectGoodsInv(vo);	
		return list;
	}
	
	/**
	 * 기념홍보물 파일 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */	

	@Override
	public LplLprPrGoodsReqInfoVo selectLplLprPrGoodsFile(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		LplLprPrGoodsReqInfoVo resVo = new LplLprPrGoodsReqInfoVo(); 
		resVo = lprDAO.selectLplLprPrGoodsFile(vo);
		return resVo;
	}

	/**
	 * 기념홍보물신청정보 조회
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqInfoVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	@Override
	public LplLprPrGoodsReqAprVo select(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		LplLprPrGoodsReqAprVo resVo = new LplLprPrGoodsReqAprVo();
		
		LplLprPrGoodsReqInfoVo infoVo = lprDAO.select(vo);	
		if (infoVo != null) {
			resVo.setInfoVo(infoVo);
			
			List<LplLprPrGoodsReqInfoVo> lplLprPrGoodsList = lprDAO.selectPrGoodsReqList(infoVo);
			resVo.setLplLprPrGoodsList(lplLprPrGoodsList);
		}
	    return resVo;
	}
	
	/**
	 * 기념홍보물신청등록
	 * 
	 * @author 김상미
	 * @param LplLprPrGoodsReqAprVo
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	@Override
	public LplLprPrGoodsReqInfoVo save(LplLprPrGoodsReqAprVo lprVo) throws KitechException {
		LplLprPrGoodsReqInfoVo infoVo = new LplLprPrGoodsReqInfoVo();
		List<LplLprPrGoodsReqInfoVo> lplLprPrGoodsList = new ArrayList<LplLprPrGoodsReqInfoVo>();
		infoVo = lprVo.getInfoVo();
		lplLprPrGoodsList = lprVo.getLplLprPrGoodsList();
		
		String req_no = infoVo.getReq_no();
		
		if (req_no.equals("")) {
			String gen = "";
			gen = generationService.getGenNumber(Numberings.DOCUMENT.getName(), infoVo.getDoc_id());
			infoVo.setReq_no(gen);
			lprDAO.insertLplLprPrGoodsReq(infoVo);
			apprFuncService.formInit(gen, infoVo.getService_id(), KitechContextUtil.getUserId());
			this.insertLplLprPrGoodsReqDetail(lplLprPrGoodsList, infoVo.getReq_no());
		} else {
		
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab(infoVo.getService_id(), infoVo.getReq_no());
			} catch (KitechException ex) {
			    throw ex;
			}		
			
			lprDAO.updateLplLprPrGoodsReq(infoVo);
			lprDAO.deleteLplLprPrGoodsReqDetail(infoVo);
			this.insertLplLprPrGoodsReqDetail(lplLprPrGoodsList, infoVo.getReq_no());

			LplLprPrGoodsReqAprVo lplLprPrGoodsReqAprVo = new LplLprPrGoodsReqAprVo();
			if(infoVo.isApproval()){
			
				lplLprPrGoodsReqAprVo.setInfoVo(infoVo);
				lplLprPrGoodsReqAprVo.setLplLprPrGoodsList(lprVo.getLplLprPrGoodsList());
				AprVo aprVo = new AprVo();
				aprVo.setReqNo(infoVo.getReq_no());
				aprVo.setEndpoint(accntService.findUserIdBySyspayno(KitechContextUtil.getSyspayno()).getUid());
				aprVo.setUiId(infoVo.getService_id());
				aprVo.setInfoCd(infoVo.getReq_cause());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
	
				//2. 모델에 첨부파일 및 컬렉션류의 데이터 리스트 추가(필요시)
				// 첨부파일 번호로 첨부파일 리스트 조회
				lplLprPrGoodsReqAprVo.setFileList(attachDAO.selectListAttach(infoVo.getAttach_file_no()));
				
				apprFuncService.approvalRequest(aprVo, lplLprPrGoodsReqAprVo);
			}			
		
		}
		
		return infoVo;
	}

	/**
	 * 기념홍보물신청 삭제
	 * 
	 * @author 김상미
	 * @param List<LplLprPrGoodsReqInfoVo> 
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */	
	@Override
	public LplLprPrGoodsReqInfoVo delete(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		LplLprPrGoodsReqInfoVo resVo = new LplLprPrGoodsReqInfoVo();
		int res = 0;
		lprDAO.deleteLplLprPrGoodsReq(vo);
		lprDAO.deleteLplLprPrGoodsReqDetail(vo);
		res = apprFuncService.formRemove(vo.getReq_no());	
		resVo.setCount(res);	
		return resVo;
		
	}
	
	/**
	 * 기념홍보물신청 물품 출고 조회
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqInfoVo
	 * @return List<LplLprPrGoodsReqInfoVo>
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	@Override
	public List<LplLprPrGoodsReqInfoVo> selectLplLprPrGoddsDeliv(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		List<LplLprPrGoodsReqInfoVo> resVo = lprDAO.selectLplLprPrGoddsDeliv(vo);
		return resVo;
	}

	/**
	 * 기념홍보물신청 수신자 정보 저장
	 * 
	 * @author 김상미 
	 * @param LplLprPrGoodsReqAprVo
	 * @return LplLprPrGoodsReqInfoVo
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */
	@Override
	public LplLprPrGoodsReqInfoVo updateLplLprPrGoodsReqDetail(LplLprPrGoodsReqInfoVo vo) throws KitechException {
		LplLprPrGoodsReqInfoVo resVo = new LplLprPrGoodsReqInfoVo();
		int res = 0;
		res += lprDAO.updateLplLprPrGoodsReqDetail(vo);
		res += lprDAO.updateLplLprPrGodds(vo);
		res += lprDAO.insertLplLprPrGdWrhsHis(vo);
		resVo.setCount(res);
		return resVo;
	}

	/**
	 * 기념홍보물신청 물품 등록
	 * 
	 * @author 김상미 
	 * @param List<LplLprPrGoodsReqInfoVo> 
	 * @return int
	 * @throws KitechException
	 * @since 2023.09.13.   
	 */	
	private int insertLplLprPrGoodsReqDetail(List<LplLprPrGoodsReqInfoVo> lplLprPrGoodsList, String req_no)  throws KitechException{
		int res = 0;
		for (LplLprPrGoodsReqInfoVo infoVo : lplLprPrGoodsList) {
			infoVo.setReq_no(req_no);
			lprDAO.insertLplLprPrGoodsReqDetail(infoVo);
			res++;
		}
		return res;
	}
}
