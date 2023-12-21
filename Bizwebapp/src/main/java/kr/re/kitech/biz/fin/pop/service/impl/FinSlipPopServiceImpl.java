package kr.re.kitech.biz.fin.pop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.fin.com.vo.FcpPrmsntVo;
import kr.re.kitech.biz.fin.com.vo.FinCodeNmVo;
import kr.re.kitech.biz.fin.pop.dao.FinSlipPopDAO;
import kr.re.kitech.biz.fin.pop.service.FinSlipPopService;
import kr.re.kitech.biz.fin.pop.vo.AccntCdVo;
import kr.re.kitech.biz.fin.pop.vo.CtrlSlipVo;
import kr.re.kitech.biz.fin.pop.vo.FinPopSearchVo;
import kr.re.kitech.biz.fin.pop.vo.FspMeetMntPopVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuDetailVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuMstrCntVo;
import kr.re.kitech.biz.fin.pop.vo.KtxIssuMstrDetlVo;
import kr.re.kitech.biz.fin.pop.vo.TransSlipVo;
import kr.re.kitech.biz.fin.pop.vo.XomxDelHistoryVo;
import kr.re.kitech.biz.fin.spm.vo.FspRamtCreatVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo;
import kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo;
import kr.re.kitech.biz.fin.std.vo.StdFbaCardVo;
import kr.re.kitech.biz.fin.std.vo.XodfExpnsVo;
import kr.re.kitech.biz.fin.std.vo.XodfVendVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.StringUtil;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 결의생성 팝업 ServiceImpl
 * @Class Name : FinSlipPopServiceImpl.java
 * @Description : 결의생성 팝업 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/25   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/04/25
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Service("finSlipPopService")
public class FinSlipPopServiceImpl extends EgovAbstractServiceImpl implements FinSlipPopService {
	@Resource(name="finSlipPopDAO")
	private FinSlipPopDAO popDao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService generationService;	
	
	/**
    * On-Line 가수반제 회계코드 조회
    * @param FinSlipSearchVo
    * @return List<FspRamtCreatVo>
    * @author LeeYH
    */
	@Override
	public List<FspRamtCreatVo> selectFspRamtCreatList(FinPopSearchVo vo) throws ElException{
		return popDao.selectFspRamtCreatList(vo);
	}
	
	/**
    * 카드정보조회
    * @param FinSlipSearchVo
    * @return List<StdFbaCardVo>
    * @author LeeYH
    */
	public List<StdFbaCardVo> selectFbaCardPopList(FinPopSearchVo vo) throws ElException{
		return popDao.selectFbaCardPopList(vo);
	}
	
	/**
    * 연구장비집행확인 조회
    * @param ResEquipFeeReqVo
    * @return List<ResEquipFeeReqVo>
    * @author LeeYH
    */
	public List<ResEquipFeeReqVo> selectAssReqEquipFeeReqList(ResEquipFeeReqVo vo) throws ElException{
		return popDao.selectAssReqEquipFeeReqList(vo);
	}
	
	/**
    * 연구장비집행확인 저장
    * @param ResEquipFeeReqVo
    * @return int
    * @author LeeYH
    */
	public ResEquipFeeReqVo saveAssResEquipFeeReq(ResEquipFeeReqVo vo) throws ElException{
		vo.setIntgr_mngmt_unit("RDK001");
		
		String reqNo = vo.getReq_no();
		if(reqNo == null || "".equals(reqNo)){
			reqNo = generationService.getGenNumber(Numberings.DOCUMENT.getName(), "A31"); 
			vo.setReq_no(reqNo);
			
			if(popDao.insertAssResEquipFeeReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"연구장비집행확인 저장"});
			}
		}else{
			if(popDao.updateAssResEquipFeeReq(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"연구장비집행확인 수정"});
			}
		}
		
		return vo;
	}
	
	/**
    * 거래증빙등록 팝업 조회
    * @param KtxIssuMstrComVo
    * @return KtxIssuMstrInVo
    * @author LeeYH
    */
	public KtxIssuMstrVo selectKtxIssuMstrPop(KtxIssuMstrComVo vo) throws ElException{
		return popDao.selectKtxIssuMstrPop(vo);
	}
	
	/**
    * 거래증빙등록(팝업 화면)
    * @param KtxIssuMstrInVo
    * @return KtxIssuMstrComVo
    * @author LeeYH
    */
	public KtxIssuMstrComVo saveKtxIssuMstr(KtxIssuMstrVo vo) throws ElException{
		KtxIssuMstrComVo retVo = new KtxIssuMstrComVo();
		if("C".equals(vo.getCud_type())){			
			vo.setIssu_seqno(generationService.getGenNumber(Numberings.DOCUMENT.getName(), "F24"));
			
			if(popDao.insertKtxIssuMstr(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"거래증빙(계산서) 저장"});
			}
		}else{
			if(popDao.updateKtxIssuMstr(vo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"거래증빙(계산서) 수정"});
			}
		}
		
		retVo.setIssu_seqno(vo.getIssu_seqno());
		return retVo;
	}
	
	/**
    * 전자세금계산서 등록팝업 계산서 정보 저장
    * @param KtxIssuMstrDetlVo
    * @return int
    * @author LeeYH
    * @since 2022.06.16.
    */
	public void saveKtxIssuMstr(KtxIssuMstrDetlVo vo) throws ElException{
		// 마스터 정보
		KtxIssuMstrVo mstrVo = vo.getMstrVo();
		
		// 계산서 기 저장 여부 체크
		KtxIssuMstrCntVo cntVo = popDao.selectKtxIssuMstrCnt(mstrVo.getIssu_id());
		if(cntVo.getCnt() > 0){
			if(!StringUtil.isEmpty(cntVo.getUnslip_no())){
				throw new KitechException(Exceptions.ALERT, Business.FIN, "message.xom.ui.fin.066", new String[]{cntVo.getUnslip_no()});
			}else{
				popDao.updateKtxIssuMstrPsn(mstrVo);
			}
		}else{
			if(popDao.insertKtxIssuMstr(mstrVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"계산서 마스터 저장"});
			}
			
			// 디테일 저장
			List<KtxIssuDetailVo> detlList = vo.getDetlList();
			for(KtxIssuDetailVo detlVo : detlList){
				detlVo.setIssu_seqno(vo.getMstrVo().getIssu_id());
				popDao.insertKtxIssuDetail(detlVo);
			}
		}
	}
	
	/**
    * 거래증빙 삭제(팝업 화면)
    * @param KtxIssuMstrComVo
    * @author LeeYH
    */
	public void deleteKtxIssuMstr(KtxIssuMstrComVo vo) throws ElException{
		vo = popDao.selectKtxIssuMstrChk(vo);
		if(!"N".equals(vo.getTax_returns_yn())){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.spm.0001", new String[]{vo.getIssu_seqno()});
		}

		if(!StringUtil.isEmpty(vo.getUnslip_no()) || vo.getTrans_amt() != 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.alert.fin.spm.0002", new String[]{vo.getIssu_seqno()});
		}
		
		// 계산서 삭제
		if(popDao.deleteKtxIssuMstr(vo) == 0){
			throw new KitechException(Exceptions.ERROR, Business.FIN, "message.xom.co.com.0002", new String[]{"거래증빙(계산서) 삭제"});
		}
		
		// 삭제이력 저장
		XomxDelHistoryVo delVo = new XomxDelHistoryVo();
		delVo.setReq_no(vo.getIssu_seqno());
		delVo.setDoc_contnt(vo.toString());
		delVo.setSrv_id(KitechContextUtil.getServiceId());
		delVo.setDelete_syspayno(KitechContextUtil.getSyspayno());
		popDao.insertXomxDelHistory(delVo);
	}	
	
	/**
    * 비용코드검색(팝업 화면)
    * @param FinPopSearchVo
    * @return List<XodfExpnsVo>
    * @author LeeYH
    */
	public List<XodfExpnsVo> selectXodfExpnsList(FinPopSearchVo vo) throws ElException{
		return popDao.selectXodfExpnsList(vo);
	}
	
	/**
    * 일반결의 결의내역 대체처리 검색 팝업
    * @param FinPopSearchVo
    * @return List<FspSlipDVo>
    * @author LeeYH
    */
	public List<TransSlipVo> selectTransSlipInfoList(FinPopSearchVo vo) throws ElException{
		return popDao.selectTransSlipInfoList(vo);
	}
	
	/**
    * 일반결의 통제내역결의처리 검색 팝업
    * @param FinPopSearchVo
    * @return List<CtrlSlipVo>
    * @author LeeYH
    */
	public List<CtrlSlipVo> selectBblEnfrcForSlip(FinPopSearchVo vo) throws ElException{
		return popDao.selectBblEnfrcForSlip(vo);
	}
	
	/**
    * 일반결의 채무반제처리, On-Line가수반제 팝업 회계코드 조회
    * @param FinCodeNmVo
    * @return List<XodfAccntVo>
    * @author LeeYH
    */
	public List<AccntCdVo> selectXodfAccntCdForDebt(FinCodeNmVo vo) throws ElException{
		return popDao.selectXodfAccntCdForDebt(vo);
	}	
	
	/**
    * 전자세금계산서 팝업 조회
    * @param KtxIssuMstrComVo
    * @return KtxIssuMstrDetlVo
    * @author LeeYH
    * @since 2022.06.02.
    */
	public KtxIssuMstrDetlVo selectKtxIssuMstr(KtxIssuMstrComVo vo) throws ElException{
	    KtxIssuMstrDetlVo retVo = new KtxIssuMstrDetlVo();
		// 계산서 마스터 조회
		retVo.setMstrVo(popDao.selectKtxIssuMstrPop(vo));		
		// 품목리스트 조회
		vo.setIssu_seqno(retVo.getMstrVo().getIssu_seqno());
		retVo.setDetlList(popDao.selectKtxIssuDetailList(vo));
		
		return retVo;
	}
	
	/**
    * 전자세금계산서 등록팝업에서 거래선 정보 조회
    * @param XodfVendVo
    * @return List<XodfVendVo>
    * @author LeeYH
    * @since 2022.06.15.
    */
	public List<XodfVendVo> selectXodfVendList(XodfVendVo vo) throws ElException{
		return popDao.selectXodfVendList(vo.getBsns_psn_regst_no());
	}	
	
	/**
    * 어음번호 조회
    * @param FcpPrmsntVo
    * @return List<FcpPrmsntVo>
    * @author LeeYH
    * @since 2022.08.17.
    */
	public List<FcpPrmsntVo> selectFcpPrmsntList(FcpPrmsntVo vo) throws ElException{
		return popDao.selectFcpPrmsntList(vo);
	}
	
	/**
    * 회의록조회(팝업 F244)
    * @param FinPopSearchVo
    * @return List<FspMeetMntPopVo>
    * @author LeeYH
    * @since 2022.09.27.
    */
	public List<FspMeetMntPopVo> selectFspMeetPopList(FinPopSearchVo vo) throws ElException{
		return popDao.selectFspMeetPopList(vo);
	}
	
	/**
    * 이지바로과제일 경우 과학기술인번호가 없는 회의 참여자 조회
    * @param String reqNo
    * @return String
    * @author LeeYH
    * @since 2022.09.27.
    */
	public String selectNoSciTechNoPsn(String reqNo) throws ElException{
		return popDao.selectNoSciTechNoPsn(reqNo);
	}
	
	/**
    * 매입계산서(관) 팝업호출시 결의번호 업데이트
    * @param KtxIssuMstrComVo
	* @throws Exception
    * @author LeeYoungHee
	* @since 2023.10.25.
    */
	public void updateKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws ElException{
		popDao.updateKtxIssuMstrUnslipNo(vo);
	}
	
	/**
    * 매입계산서(관) 팝업호출시 결의번호 삭제
    * @param KtxIssuMstrComVo
	* @throws Exception
    * @author Timothee
	* @since 2023.12.13.
    */
	public void deleteKtxIssuMstrUnslipNo(KtxIssuMstrComVo vo) throws ElException{
		popDao.deleteKtxIssuMstrUnslipNo(vo);
	}
}
