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
import kr.re.kitech.biz.hum.apy.dao.HumApyAccDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyAccService;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyAccSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;


/**  
 * @ClassSubJect 급여계좌신청 관련 서비스
 * @Class Name : HumApyAccServiceImpl.java
 * @Description : 급여계좌신청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/21   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/21
 * @version 1.0
 * @see
 * 
 */
@Service("humApyAccServiceImpl")
public class HumApyAccServiceImpl extends EgovAbstractServiceImpl implements HumApyAccService {

	@Resource(name = "humApyAccDAO")
	private HumApyAccDAO dao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    //결재관련 추가
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;	
    
    //결재상태 유효성
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;


	/**
     * 급여계좌신청. 목록 조회
     * @param 
     * @return List<HumApyAccInfoVo>
     * @throws Exception
     */
    @Override
    public List<HumApyAccInfoVo> selectHumApyAccList(HumApyAccSrchVo vo) throws KitechException {
    	return dao.selectHumApyAccList(vo);
    }

	/**
     * 급여계좌신청. 작성중 문서 유효성 체크
     * @param 
     * @return HumApyAccInfoVo
     * @throws Exception
     */
	@Override
	public HumApyAccInfoVo selectHumApyAccAprChk(HumApyAccSrchVo vo) throws KitechException {
		return dao.selectHumApyAccAprChk(vo);
	}

	/**
     * 급여계좌신청. 신청전 기본 계좌 정보 조회(신규)
     * @param 
     * @return HumApyAccInfoVo
     * @throws Exception
     */
	@Override
	public HumApyAccInfoVo selectHumApyAccBscInfo(HumApyAccSrchVo vo) throws KitechException {
		return dao.selectHumApyAccBscInfo(vo);
	}

	/**
     * 급여계좌신청. 신청계좌정보 조회(상세)
     * @param 
     * @return HumApyAccInfoVo
     * @throws Exception
     */
	@Override
	public HumApyAccInfoVo selectHumApyAccInfo(HumApyAccSrchVo vo) throws KitechException {
		return dao.selectHumApyAccInfo(vo);
	}

	/**
     * 급여계좌신청. 신청서 삭제
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void deleteHumApyAcc(HumApyAccSrchVo vo) throws KitechException {
		dao.deleteHumApyAcc(vo);						//신청서 삭제
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
	}

	/**
     * 급여계좌신청. 신청서 저장, 수정, 결재신청
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public String saveHumApyAcc(HumApyAccInfoVo vo) throws KitechException {
	
		String reqNo = vo.getReq_no();		//화면단에서 받아오는 신청번호
		
		//if : 신규(신청번호 없는 경우)
		if ("".equals(reqNo)) {
			
			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H12");
			vo.setReq_no(reqNo_new);
			
			//신청서 신규 저장
			dao.insertHumApyAcc(vo);
			
			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H581", KitechContextUtil.getUserId());
		
		
		//else : 수정(신청번호 있는 경우)
		} else {
			
			//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("H581", reqNo);
			}catch (KitechException ex){
				throw ex;
			}
			
			//신청서 수정
			dao.updateHumApyLnd(vo);

			//결재신청 save_type
			if ("apr".equals(vo.getSave_type())) {
				if (vo.isApproval()) {

					//InfoCd에 넣기 위해 은행명 받아오기
					CodeVo codeVo = CodeCacheManager.getInstance().getCode("FAA", vo.getSalry_bank());		//이런식으로 코드 받아서 명칭받아오기
			
					//결재정보
					AprVo aprVo = new AprVo();
					aprVo.setMainKey(vo.getReq_no());
					aprVo.setReqNo(vo.getReq_no());
					aprVo.setLoginUserId(KitechContextUtil.getUserId());
					aprVo.setReporterId(KitechContextUtil.getSyspayno());
					aprVo.setUiId("H581");
					aprVo.setAprState(vo.getApr_state());
					aprVo.setExt1Cd(vo.getReq_ymd());		//신청일
					aprVo.setEndpoint(KitechContextUtil.getUserId());
					aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + codeVo.getComNm() + "(" + vo.getBankaccnt_no() + ")");
					
					//결재신청
					apprFuncService.approvalScreen(aprVo);

				}
			}
			
			//반려 상태에서 저장 누르면 "저장중"으로 상태 변경
			if ("XAD015".equals(vo.getApr_state())) {
				aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
			}		
		
		}
		
		
		return vo.getReq_no();
	}

	/**
	 * 급여계좌신청. 반려
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formReject(HumApyAccInfoVo vo) throws KitechException {
		
		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setComments(vo.getComments());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		//반려
		apprFuncService.formReject(aprScVo);

	}

	/**
	 * 급여계좌신청. 처리 (+신청자 계좌번호 update)
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formAccept(HumApyAccInfoVo vo) throws KitechException {

		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("H581");
		aprVo.setBiz(true);
		aprVo.setAprState(vo.getApr_state());
		aprVo.setOperCode("0");
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		//처리
		apprFuncService.formAccept(aprVo);		
		
		//승인 처리시 -> 신청자의 계좌정보 update
		dao.updateHumApyAccUserInfo(vo);
		
	}

}
