package kr.re.kitech.biz.ass.app.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.app.dao.AssAppMoveReqDAO;
import kr.re.kitech.biz.ass.app.dao.AssAppUnUseDAO;
import kr.re.kitech.biz.ass.app.service.AssAppMoveReqService;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqDetailVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqListVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqSrchVo;
import kr.re.kitech.biz.ass.app.vo.AssAppMoveReqVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

@Service("assAppMoveReqService")
public class AssAppMoveReqServiceImpl extends EgovAbstractServiceImpl implements AssAppMoveReqService {
	@Resource(name="assAppMoveReqDAO")
	private AssAppMoveReqDAO moveReqDao;

	@Resource(name="assAppUnUseDAO")
	private AssAppUnUseDAO unUseDao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	/**
	 * 자산 이동신청 목록 조회
	 */
	public List<AssAppMoveReqVo> selectAssAppMoveReqList(AssAppMoveReqSrchVo vo) throws Exception {
		return moveReqDao.selectAssAppMoveReqList(vo);
	}

	/**
	 * 자산 이동신청 상세정보 조회
	 */
	public List<AssAppMoveReqDetailVo> selectAssAppMoveReqDetail(AssAppMoveReqVo vo) throws Exception {
		return moveReqDao.selectAssAppMoveReqDetail(vo);
	}

	/**
     * 불용신청 저장
     * @param 
     * @return reqNo
     * @throws Exception
     */
	public String saveAssetMove(AssAppMoveReqListVo vo)throws Exception{
		
		AssAppMoveReqVo mastVo = vo.getAssAppMoveReqVo();
		List<AssAppMoveReqDetailVo> asetList = vo.getAssAppMoveReqDetailVoList();

		String saveClsf = mastVo.getSave_clsf();
		String reqNo = mastVo.getReq_no();
		String moveClsf = mastVo.getMove_clsf();

		if("insert".equals(saveClsf)) {
			String reqNoClsf = "";

			if("AGA020".equals(moveClsf)) reqNoClsf = "A14";
			else reqNoClsf = "A13";

			reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), reqNoClsf);

			// 인터페이스 테이블 저장
			apprFuncService.formInit(reqNo, "G210", KitechContextUtil.getUserId());
		}

		if(asetList != null && asetList.size() > 0) {
			for(AssAppMoveReqDetailVo asetVo : asetList) {
				String cudType = asetVo.getRowStatus();
				int result = 0;

				asetVo.setReq_no(reqNo);
				asetVo.setMove_clsf(moveClsf);
				asetVo.setReq_ymd(mastVo.getReq_no());
				asetVo.setWrte_syspayno("");
				asetVo.setTout_psn_syspayno("");
				asetVo.setTout_dept("");
				asetVo.setTout_dept_new_ymd("");
				asetVo.setTout_schdl_ymd("");
				asetVo.setTout_posi_region("");
				asetVo.setTout_posi_build("");
				asetVo.setTout_posi_floor("");
				asetVo.setTout_posi_detls("");
				asetVo.setInstl_vend("");
				asetVo.setInstl_vend_nm("");
				asetVo.setInstl_vend_charg("");
				asetVo.setInstl_vend_charg_tel("");
				asetVo.setBrin_schdl_ymd("");
				asetVo.setAftr_mngmt_ex("");
				asetVo.setOut_instl_ymd_st("");
				asetVo.setOut_instl_ymd_ed("");
				asetVo.setPrj_no("");
				asetVo.setPrj_nm("");
				asetVo.setCause("");
				asetVo.setAttach_file_no("");
				asetVo.setRegst_syspayno("");
				asetVo.setUpdt_syspayno("");

				if("C".equals(cudType)) {
					result = moveReqDao.insertAssMove01(asetVo);

				} else if("U".equals(cudType)) {
					// 수정
					result = moveReqDao.updateAssMove01(asetVo);

					if(result == 0) {
						result = moveReqDao.insertAssMove01(asetVo);
					}

				} else if("D".equals(cudType)) {
					moveReqDao.deleteAssMove01(asetVo);
				}
			}
			
		}
		return reqNo;
	}

	/**
	 * 자산 이동신청서 삭제
	 */
	public void deleteAssMove(AssAppMoveReqDetailVo vo) throws KitechException {
		String reqNo = vo.getReq_no();

		// 전자결재 인터페이스 테이블 삭제, 스냅샷 데이터 삭제
		apprFuncService.formRemove(reqNo);

		// 이동신청서 삭제
		moveReqDao.deleteAssMove01(vo);
	}

	/**
     * 자산 신청서 삭제
     * @param AssAppMoveReqVo
     * @throws Exception
     * @author Lee Jungho
     * @since 2023.06.08.
     */
	public void deleteAssAprInfo(AssAppMoveReqDetailVo vo) throws KitechException {
		String reqNo = vo.getReq_no();

		// 전자결재 인터페이스 테이블 삭제, 스냅샷 데이터 삭제
		apprFuncService.formRemove(reqNo);

		// 추후 개발해야 함
	}

}
