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
import kr.re.kitech.biz.hum.apy.dao.HumApyEduDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyEduService;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyEduSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 학력사항변경신청 관련 서비스
 * @Class Name : HumApyEduServiceImpl.java
 * @Description : 학력사항변경신청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/31   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/31
 * @version 1.0
 * @see
 * 
 */
@Service("humApyEduServiceImpl")
public class HumApyEduServiceImpl extends EgovAbstractServiceImpl implements HumApyEduService {

	@Resource(name = "humApyEduDAO")
	private HumApyEduDAO dao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    //결재상태 유효성
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;
    
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;

	/**
     * 학력사항변경신청. 목록 조회
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyEduInfoVo> selectHumApyEduList(HumApyEduSrchVo vo) throws KitechException {
		return dao.selectHumApyEduList(vo);
	}

	/**
     * 학력사항변경신청. 상세 조회
     * @param 
     * @return HumApyPrsInfoVo
     * @throws Exception
     */
	@Override
	public HumApyEduInfoVo selectHumApyEduInfo(HumApyEduSrchVo vo) throws KitechException {
		return dao.selectHumApyEduInfo(vo);
	}

	/**
     * 학력사항변경신청. 변경전 학력사항 조회
     * @param 
     * @return List<HumApyEduInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyEduInfoVo> selectHumApyEduInfoBefore(HumApyEduSrchVo vo) throws KitechException {
		return dao.selectHumApyEduInfoBefore(vo);
	}

	/**
     * 학력사항변경신청. 변경후 학력사항 조회
     * @param 
     * @return List<HumApyEduInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyEduInfoVo> selectHumApyEduInfoAfter(HumApyEduSrchVo vo) throws KitechException {
		return dao.selectHumApyEduInfoAfter(vo);
	}

	/**
     * 학력사항변경신청. 신청서 삭제
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void deleteHumApyEdu(HumApyEduSrchVo vo) throws KitechException {
		dao.deleteHumApyEdu(vo);						//신청서 정보 삭제
		dao.deleteHumApyEduAfter(vo);					//신청서 정보 내 학력사항 정보 삭제
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
	}

	/**
     * 학력사항변경신청. 저장, 결재신청
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public String saveHumApyEdu(HumApyEduListVo vo) throws KitechException {
		
		HumApyEduInfoVo infoVo = vo.getHumApyEduInfoVo();				//신청서 기본 정보(Map)
		List<HumApyEduInfoVo> infoList = vo.getHumApyEduInfoVoList();	//신청서 내 변경후 학력사항(List)
		
		String reqNo = infoVo.getReq_no();			//화면단에서 전달받은 신청번호
		String aprState = infoVo.getApr_state();	//결재상태코드
		
		//if : 신청번호 없을 경우. insert
		if ("".equals(reqNo)) {

			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H0A");
			infoVo.setReq_no(reqNo_new);
			infoVo.setRegst_syspayno(KitechContextUtil.getSyspayno());
			
			//신청서 기본 정보 저장
			dao.insertHumApyEduInfo(infoVo);
			
			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H545", KitechContextUtil.getUserId(), infoVo.getRmk());	//결재상태 수정
			
			
		//else : 신청번호 있는 경우. update 
		} else {
			
			//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("H545", reqNo);
			}catch (KitechException ex){
				throw ex;
			}
			
			//신청서 수정
			dao.updateHumApyEduInfo(infoVo);

			
			//결재 신청 ("반려(XAD015)"상태에 재 결재신청 가능)
			if ("XAD005".equals(aprState) || "XAD015".equals(aprState)) {
				if (infoVo.isApproval()) {
					
					//결재신청 로직
					// 결재정보
					AprVo aprVo = new AprVo();
					aprVo.setLoginUserId(KitechContextUtil.getUserId());
					aprVo.setReqNo(infoVo.getReq_no());
					aprVo.setReporterId(KitechContextUtil.getSyspayno());
					aprVo.setUiId("H545");
					aprVo.setAprState(infoVo.getApr_state());
					aprVo.setOperCode("9");
					aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + infoVo.getRmk());
					aprVo.setEndpoint(KitechContextUtil.getUserId());
							
					//결재신청
					apprFuncService.approvalScreen(aprVo);
				}
			}
			
		}
		
		//변경 후 학력사항
		if (infoList != null) {
			
			//변경 후 학력사항 delete
			HumApyEduSrchVo deleteVo = new HumApyEduSrchVo();
			deleteVo.setReq_no(infoVo.getReq_no());
			dao.deleteHumApyEduAfter(deleteVo);
			
			//변경 후 학력사항 insert
			for(HumApyEduInfoVo afterList : infoList){

				afterList.setReq_no(infoVo.getReq_no());							//신청번호
				afterList.setRegst_syspayno(KitechContextUtil.getSyspayno());		//생성자
				
				//변경 후 학력사항. 저장
				dao.insertHumApyEduAfter(afterList);
				
			}
			
		}
		
		//반려 상태에서 저장 누르면 "저장중"으로 상태 변경
		if ("XAD015".equals(aprState)) {
			aprComService.modifyAprInterface(infoVo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
		}		
		
		
		return infoVo.getReq_no();
	}

	/**
	 * 학력사항변경신청. 반려
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formReject(HumApyEduInfoVo vo) throws KitechException {

		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setComments(vo.getComments());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		
		//반려
		apprFuncService.formReject(aprScVo);
	}

	/**
	 * 학력사항변경신청. 처리(결재승인)
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formAccept(HumApyEduListVo vo) throws KitechException {
	
		HumApyEduInfoVo infoVo = vo.getHumApyEduInfoVo();				//신청서 기본 정보(Map)
		List<HumApyEduInfoVo> infoList = vo.getHumApyEduInfoVoList();	//신청서 내 변경후 학력사항(List)
		
		//결재 처리시 필요 데이터 세팅
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(infoVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("H545");
		aprVo.setAprState(infoVo.getApr_state());
		aprVo.setOperCode("0");
		aprVo.setInfo(infoVo.getRmk());
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		//처리(결재승인)
		apprFuncService.formAccept(aprVo);


		//결재 승인 후 처리 (기존 "변경전 학력사항" 삭제 -> 입력한 "변경후 학력사항"으로 저장)
		//1. 변경전 학력사항 -> 삭제 (삭제조건 : 시스템 개인번호(syspayno))
		dao.deleteHumApyEduInfoBefore(infoVo);
		
		//2. 변경전 학력사항 -> 저장 (저장정보 : 입력된 변경후 학력사항 정보)
		for(HumApyEduInfoVo beforeList : infoList){

			beforeList.setSyspayno(infoVo.getSyspayno());
			beforeList.setRef_tab("humrcteduc");
			beforeList.setRef_data(infoVo.getReq_no());
			
			//변경 후 학력사항. 저장
			dao.insertHumApyEduInfoBefore(beforeList);
			
		}
		
	}

}
