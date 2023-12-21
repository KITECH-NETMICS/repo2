package kr.re.kitech.biz.ccs.cwl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ccs.cwl.dao.CcsCwlCgCdDAO;
import kr.re.kitech.biz.ccs.cwl.service.CcsCwlCgCdService;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlBeforeCgCdInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdDtlVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdFeeVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdMntVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdSrchVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlCgCdVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlHumSlBscInfoVo;
import kr.re.kitech.biz.ccs.cwl.vo.CcsCwlSvCgCdVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;

/**  
 * @ClassSubJect 경조사비 신청 MyBatis Impl
 * @Class Name CcsCwlCgCdServiceImpl.java
 * @Description 경조사비 신청  서비스
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/07/27   석원탁                 최초생성
 * 
 * @author 
 * @since 2023/07/27
 * @version 1.0
 * @see
 * 
 */
@Service("ccsCwlCgCdServiceImpl")
public class CcsCwlCgCdServiceImpl extends EgovAbstractServiceImpl implements CcsCwlCgCdService {

	@Resource(name="ccsCwlCgCdDAO")
	private CcsCwlCgCdDAO dao;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    //결재관련 추가
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService aprComService;	

    @Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;	

	/**
     * 경조사비 신청. 목록 조회
     * @param 
     * @return List<CssCwlCgCdVo>
     * @throws Exception
     */
	@Override
	public List<CcsCwlCgCdVo> selectCcsCwlCgCdList(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCcsCwlCgCdList(vo);
	}

	/**
     * 경조사비 신청. 급여계좌정보 조회
     * @param 
     * @return CcsCwlHumSlBscInfoVo
     * @throws Exception
     */
	@Override
	public CcsCwlHumSlBscInfoVo selectHumSlBscInfo(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectHumSlBscInfo(vo);
	}

	/**
     * 경조사비 신청. 경조금액 조회
     * @param 
     * @return CcsCwlCgCdFeeVo
     * @throws Exception
     */
	@Override
	public CcsCwlCgCdFeeVo selectCwlCgCdFee(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCwlCgCdFee(vo);
	}

	/**
     * 경조사비 신청. 중복 신청 조회
     * @param 
     * @return CcsCwlBeforeCgCdInfoVo
     * @throws Exception
     */
	@Override
	public List<CcsCwlCgCdVo> selectCwlBeforeCgCdInfo(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCwlBeforeCgCdInfo(vo);
	}
	
	/**
     * 경조사비 신청. 중복 신청 조회2(회갑, 칠순, 팔순, 구순 각 1회 신청가능 검증)
     * @param 
     * @return CcsCwlBeforeCgCdInfoVo
     * @throws Exception
     */
	@Override
	public List<CcsCwlBeforeCgCdInfoVo> selectCwlBeforeCgCdInfo2(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCwlBeforeCgCdInfo2(vo);
	}
	
	/**
     * 경조사비 신청. 작성
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public CcsCwlCgCdSrchVo insertCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException {

		//신청번호 채번 후 insert
		String reqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "C70");
		vo.setReq_no(reqNo);
		dao.insertCwlCgCd(vo);

		//결재인터페이스 저장
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("CWC", vo.getCgncd_clsf());		//이런식으로 코드 받아서 명칭받아오기	
		//"저장중"상태 초기 설정
		apprFuncService.formInit(reqNo, "C261", KitechContextUtil.getUserId(), codeVo.getComNm());	//결재상태 수정
		
		CcsCwlCgCdSrchVo srcVo = new CcsCwlCgCdSrchVo();
		//저장 후 화면 재조회하기 위함. 신청번호 화면단으로 전달
		srcVo.setReq_no(reqNo);
		
		return srcVo;
	}
	
	/**
     * 경조사비 신청. 상세조회
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public CcsCwlCgCdDtlVo selectCcsCwlCgCdDtl(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCcsCwlCgCdDtl(vo);
	}
	
	/**
	 * 경조사비 신청. 삭제
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public int deleteCwlCgCd(CcsCwlCgCdSrchVo vo) throws KitechException {
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
		return dao.deleteCwlCgCd(vo);
	}
	
	/**
     * 경조내역수정. 상세조회
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public CcsCwlCgCdMntVo selectCcsCwlCgCdMnt(CcsCwlCgCdSrchVo vo) throws KitechException {
		return dao.selectCcsCwlCgCdMnt(vo);
	}
	
	/**
	 * 경조내역수정. 수정
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void updateCwlCgCd(CcsCwlSvCgCdVo vo) throws KitechException {
		dao.updateCwlCgCd(vo);
	}
	
	/**
     * 경조사비 신청. 결재상태 수정, 결재처리
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void updateCwlCgCdDtl(CcsCwlSvCgCdVo vo) throws KitechException {
		
		String apr_state = vo.getApr_state_code();
		String aprTobeCode = vo.getApr_tobe_code();	//재신청 결재상태코드
		
		//InfoCd 가져오기
		CodeVo codeVo = CodeCacheManager.getInstance().getCode("CWC", vo.getCgncd_clsf());		//이런식으로 코드 받아서 명칭받아오기	

		// AprState 체크하는 공통 메소드호출
		try {
			apprValidService.isWaitStateAtIntfatab("C261", vo.getReq_no());
		} catch (KitechException ex) {
			throw ex;
		}
		
		//경조사비 신청. 상세정보 수정
		dao.updateCwlCgCdDtl(vo);

		// 수정
		//if : "저장중", "작성중"인 경우 -> 결재신청으로 넘어감
		if ("XAD005".equals(apr_state) || "XAD010".equals(apr_state)) {
			
			//결재 신청
			if ("XAD010".equals(aprTobeCode)) {
			
				AprVo aprVo = new AprVo();
				aprVo.setLoginUserId(KitechContextUtil.getUserId());	//아이디
				aprVo.setReqNo(vo.getReq_no());							//신청번호
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setUiId("C261");
				aprVo.setAprState(apr_state);
				aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + codeVo.getComNm());		//"신청자성명(개인번호) / 제목(제목 필드 또는 비고, 적요 필드)"으로 변경
				aprVo.setEndpoint(KitechContextUtil.getUserId());	//아이디
				
				//결재신청
				apprFuncService.approvalScreen(aprVo);
			}
			
		//else if : "반려" 
		} else if("XAD015".equals(aprTobeCode)) {
		
			AprScVo aprScVo = new AprScVo();		
			
			aprScVo.setReqNo(vo.getReq_no());			//신청번호	
			aprScVo.setComments(vo.getReject_resn());	//반려사유
			aprScVo.setAprState(apr_state);
			aprScVo.setTaskExt1("C261");				//서비스ID
			aprScVo.setEndpoint(KitechContextUtil.getUserId());
			
			//"결재완료" 상태에서 반려하는 것과 "결재완료"전의 반려는 다른 함수 탄다
			if ("XAD100".equals(apr_state)) {
				//담당자 반려 (결재완료 상태에서)
				apprFuncService.formAuthReject(aprScVo);
			} else {
				//반려(결재완료 아닌 상태에서)
				apprFuncService.formReject(aprScVo);
			}

		//else if : "지급"(결재승인)
		} else if("XAD100".equals(aprTobeCode)) {
		
			AprVo aprVo = new AprVo();			
			aprVo.setReqNo(vo.getReq_no());	//신청번호
			aprVo.setLoginUserId(KitechContextUtil.getUserId());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			//aprVo.setReporterId(vo.getReq_psn_syspayno());
			aprVo.setUiId("C261");
			aprVo.setOperCode("0");
			aprVo.setAprState(apr_state);
			aprVo.setBiz(true);
			aprVo.setEndpoint(KitechContextUtil.getUserId());	//아이디
			
			//지급(결재승인)
			apprFuncService.formAccept(aprVo);	
		
		}

		//전자결재 반려,회수후 신청화면 [저장]버튼을 클릭하면 인터페이스 테이블에 재신청이 가능하게 "XAD005" 수정
		if ("XAD015".equals(apr_state) && "XAD005".equals(aprTobeCode)) {
			aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
		}
		
		
	}
	
}
