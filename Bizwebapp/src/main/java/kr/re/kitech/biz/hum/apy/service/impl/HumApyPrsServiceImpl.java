package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApyPrsDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyPrsService;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSaveVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPrsSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**  
 * @ClassSubJect 지도교수(활용책임자) 변경신청 관련 서비스
 * @Class Name : HumApyPrsServiceImpl.java
 * @Description : 지도교수(활용책임자) 변경신청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/10   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/10
 * @version 1.0
 * @see
 * 
 */
@Service("humApyPrsServiceImpl")
public class HumApyPrsServiceImpl extends EgovAbstractServiceImpl implements HumApyPrsService {

	@Resource(name = "humApyPrsDAO")
	private HumApyPrsDAO dao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    //결재상태 유효성
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;

    @Resource(name="attachDAO")
    private AttachDAO attachDao;

	/**
     * 지도교수(활용책임자) 변경신청. 목록 조회
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyPrsInfoVo> selectHumApyPrsList(HumApyPrsSrchVo humApySvrVo) throws KitechException {
		return dao.selectHumApyPrsList(humApySvrVo);
	}

	/**
     * 지도교수(활용책임자) 변경신청. 목록 내 승인
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public void approvalHumApyPrs(HumApyPrsInfoVo vo) throws KitechException {
			
		//지도교수(활용책임자) 수정건 조회
		List<HumApyPrsInfoVo> selectUptCnt = dao.selectHumApyPrsUptCnt(vo);
		
		for (int i = 0; i < selectUptCnt.size(); i++) {
			HumApyPrsInfoVo selectUpt = new HumApyPrsInfoVo();
			selectUpt = selectUptCnt.get(i);
			selectUpt.setRegst_syspayno(KitechContextUtil.getSyspayno());
			selectUpt.setUpdt_syspayno(KitechContextUtil.getSyspayno());
			
			//등록여부 확인
			HumApyPrsInfoVo selectInsCnt = dao.selectHumApyPrsInsCnt(selectUpt);	
			
			//등록
			if (selectInsCnt.getCnt() == "0") {
				dao.insertHumApyPrsAppr(selectUpt);		//지도교수(활용책임자)신규저장
			//수정	
			} else {
				dao.updateHumApyPrsAppr(selectUpt);		//지도교수(활용책임자) 수정
			}
			
			//인사정보(humbasicinfo) 활용책임자변경
			if (selectUpt.getRespn_clsf() == "M") {
				dao.updateHumBasicAppr(selectUpt);
			}
			
			//지도교수(활용책임자) 승인처리
			dao.updateHumPrsAppr(selectUpt);
		}
		
	}

	/**
     * 지도교수(활용책임자) 변경신청. 삭제
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public void deleteHumApyPrs(HumApyPrsSrchVo humApySvrVo) throws KitechException {
	
		dao.deleteHumApyBsc(humApySvrVo);	//신청서 삭제
		dao.deleteHumApyPrs(humApySvrVo);	//지도교수 삭제
		aprComService.delXomxintfatab(humApySvrVo.getReq_no());	//인터페이스 테이블 내 삭제
		
	}

	/**
     * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경전 지도교수 조회
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyPrsInfoVo> selectHumApyPrsInfo(HumApyPrsSrchVo humApySvrVo) throws KitechException {
		return dao.selectHumApyPrsInfo(humApySvrVo);
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 지도교수(활용책임자) 변경신청서 상세 조회
	 * @param 
	 * @return List<HumApyPrsInfoVo>
	 * @throws Exception
	 */
	@Override
	public HumApyPrsInfoVo selectHumApyPrsDtl(HumApyPrsSrchVo humApySvrVo) throws KitechException {
		return dao.selectHumApyPrsDtl(humApySvrVo);
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 변경전 지도교수(활용책임자) 조회
	 * @param 
	 * @return List<HumApyPrsInfoVo>
	 * @throws Exception
	 */
	@Override
	public List<HumApyPrsInfoVo> selectHumApyPrsBefore(HumApyPrsSrchVo humApySvrVo) {
		return dao.selectHumApyPrsBefore(humApySvrVo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 조회
	 * @param 
	 * @return List<HumApyPrsInfoVo>
	 * @throws Exception
	 */
	@Override
	public List<HumApyPrsInfoVo> selectHumApyPrsAfter(HumApyPrsSrchVo humApySvrVo) {
		return dao.selectHumApyPrsAfter(humApySvrVo);
	}
	
	/**
	 * 지도교수(활용책임자) 변경신청. 저장
	 * @param 
	 * @return List<HumApyPrsInfoVo>
	 * @throws Exception
	 */
	@Override
	public String saveHumApyPrs(HumApyPrsListVo vo) throws KitechException {

		HumApyPrsSaveVo saveVo = vo.getSaveVo();
		List<HumApyPrsBeforeVo> prsBeforeList = vo.getHumApyPrsBeforeVoList();	//변경전 지도교수(활용책임자)
		List<HumApyPrsInfoVo> prsAfterList = vo.getHumApyPrsInfoVoList();		//변경후 지도교수(활용책임자)
		
		String reqType = saveVo.getReq_typ();	//신청타입구분 (H3A=지도교수, H3B=활용책임자)
		String tarNm = saveVo.getTar_nm();		//변경자 성명 : 신규저장시 formInit에 담아줌
		String reqNo = saveVo.getReq_no();		//화면단에서 받아오는 신청번호
		
		//신규작성
		//if : 지도교수
		if ("".equals(reqNo) && reqType.equals("H3A")) {
			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H3A");
			saveVo.setReq_no(reqNo_new);
			saveVo.setRegst_syspayno(KitechContextUtil.getSyspayno());

			//신청서 신규 저장
			dao.insertHumApyPrs(saveVo);
			
			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H579", KitechContextUtil.getUserId(), tarNm);	//결재상태 수정

			
		//else if : 활용책임자
		} else if ("".equals(reqNo) && reqType.equals("H3B")) {
			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H3B");
			saveVo.setReq_no(reqNo_new);
			saveVo.setRegst_syspayno(KitechContextUtil.getSyspayno());
			
			//신청서 신규 저장
			dao.insertHumApyPrs(saveVo);
			
			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H579", KitechContextUtil.getUserId(), tarNm);	//결재상태 수정
			
		//else : 기본 신청파일 수정
		} else {

			//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("H579", reqNo);
			}catch (KitechException ex){
				throw ex;
			}

			//신청서 수정
			dao.updateHumApyPrs(saveVo);
		}
		
		//변경 전 지도교수(활용책임자) -> 최초 저장시만 작동
		for(HumApyPrsBeforeVo prsBeforeVo : prsBeforeList){
			
			//기존에 신청번호가 없는 경우
			if ("".equals(reqNo)) {
				
				prsBeforeVo.setReq_no(saveVo.getReq_no());
				prsBeforeVo.setData_clsf("O");
				prsBeforeVo.setUse_yn("Y");
				prsBeforeVo.setRegst_syspayno(KitechContextUtil.getSyspayno());		//생성자
				
				//지도교수(활용책임자) 작성
				dao.insertHumApyPrsBeforeInfo(prsBeforeVo);			
			}
			
		}
		
		//변경 후 지도교수(활용책임자)
		for(HumApyPrsInfoVo prsAfterVo : prsAfterList){
		
			prsAfterVo.setReq_no(saveVo.getReq_no());
			prsAfterVo.setRegst_syspayno(KitechContextUtil.getSyspayno());		//생성자
			prsAfterVo.setUpdt_syspayno(KitechContextUtil.getSyspayno());		//수정자
			
			//if : 행상태가 "C"이면 신규 ->  insert
			//신규작성에는 R이 들어오기에 타지않음. req_no가 없는 경우도 추가하여 신규작성인 경우에도 타도록 변경함
			if ("".equals(reqNo) || "C".equals(prsAfterVo.getRowStatus())) {
				//prsAfterVo.setData_clsf("U");
				
				//지도교수(활용책임자) 작성
				dao.insertHumApyPrsInfo(prsAfterVo);
				
			//else : 수정 
			} else {
			
				dao.updateHumApyPrsInfo(prsAfterVo);
			}
			
		}

		//결재신청 관련 로직
		if ("apr".equals(saveVo.getSave_type())) {
		
			if (saveVo.isApproval()) {
			
				//결재신청 로직
		    	// 결재정보
		    	AprVo aprVo = new AprVo();
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setReqNo(saveVo.getReq_no());
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setUiId("H579"); //서비스ID
				aprVo.setAprState(saveVo.getApr_state());
				aprVo.setAppType(saveVo.getApp_type_cd());
				aprVo.setManager(saveVo.getManager_id());
				aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + saveVo.getInfo_cd());
				
				//스냅샷에 전달하기위한 첨부파일 세팅
				if(!"".equals(saveVo.getAttach_file_no())){
					vo.setFileList(attachDao.selectListAttach(saveVo.getAttach_file_no()));
				}
				
				apprFuncService.approvalRequest(aprVo, vo);		
				
			}
			
		}
		
		//반려 상태에서 저장 누르면 "저장중"으로 상태 변경
		if ("XAD015".equals(saveVo.getApr_state())) {
			aprComService.modifyAprInterface(saveVo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
		}		
		
		return saveVo.getReq_no();
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 변경후 지도교수(활용책임자) 삭제
	 * @param 
	 * @throws Exception
	 */
	@Override
	public void deleteHumApyPrsAfter(HumApyPrsListVo vo) throws KitechException {
		
		List<HumApyPrsInfoVo> prsAfterList = vo.getHumApyPrsInfoVoList();
		
		for(HumApyPrsInfoVo delVo : prsAfterList){
		
			//체크한 값이 "Y"인 경우
			if("Y".equals(delVo.getChk())) {
				dao.deleteHumApyPrsAfter(delVo);
			}
			
		}
		
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 반려
	 * @param 
	 * @throws Exception
	 */
	@Override
	public void formReject(HumApyPrsInfoVo vo) throws KitechException {
	
		AprScVo aprScVo = new AprScVo();
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		//반려
		apprFuncService.formReject(aprScVo);	
		
	}

	/**
	 * 지도교수(활용책임자) 변경신청. 처리
	 * @param 
	 * @throws Exception
	 */
	@Override
	public void formAccept(HumApyPrsInfoVo vo) throws KitechException {

		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("H579");
		aprVo.setAprState(vo.getApr_state());
		aprVo.setOperCode("0");
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		//처리
		apprFuncService.formAccept(aprVo);

	}

}
