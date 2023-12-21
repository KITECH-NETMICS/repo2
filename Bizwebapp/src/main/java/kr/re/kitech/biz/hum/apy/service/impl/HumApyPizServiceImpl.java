package kr.re.kitech.biz.hum.apy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprScVo;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.hum.apy.dao.HumApyPizDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyPizService;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyPizSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.manager.CodeCacheManager;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;
import kr.re.kitech.biz.xom.core.vo.CodeVo;


/**  
 * @ClassSubJect 포상경력신청 관련 서비스
 * @Class Name : HumApyPizServiceImpl.java
 * @Description : 포상경력신청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/08/25   석원탁             최초생성
 * 
 * @author 
 * @since 2023/08/25
 * @version 1.0
 * @see
 * 
 */
@Service("humApyPizServiceImpl")
public class HumApyPizServiceImpl extends EgovAbstractServiceImpl implements HumApyPizService {

	@Resource(name = "humApyPizDAO")
	private HumApyPizDAO dao;

	@Resource(name="generationServiceImpl")
	private GenerationService genService;

	//결재관련 추가
    @Resource(name = "apprFuncServiceImpl")
    private ApprFuncService apprFuncService;
    
    //결재상태 유효성
    @Resource(name="apprValidServiceImpl")
    private ApprValidService apprValidService;

	/**
     * 포상경력신청. 목록 조회
     * @param 
     * @return List<HumApyPrsInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyPizInfoVo> selectHumApyPizList(HumApyPizSrchVo vo) throws KitechException {
		return dao.selectHumApyPizList(vo);
	}

	/**
     * 포상경력신청. 상세 조회
     * @param 
     * @return HumApyPrsInfoVo
     * @throws Exception
     */
	@Override
	public HumApyPizInfoVo selectHumApyPizInfo(HumApyPizSrchVo vo) throws KitechException {
		return dao.selectHumApyPizInfo(vo);
	}

	/**
     * 포상경력신청. 삭제
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public void deleteHumApyPiz(HumApyPizInfoVo vo) throws KitechException {
		dao.deleteHumApyPiz(vo);	//신청서 정보 삭제
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
	}

	/**
     * 포상경력신청. 저장, 수정, 결재신청
     * @param 
     * @return String
     * @throws Exception
     */
	@Override
	public String saveHumApyPiz(HumApyPizInfoVo vo) throws KitechException {
	
		String reqNo = vo.getReq_no();		//화면단에서 받아오는 신청번호
		
		//포상경력신청의 경우 "1"로 구분
		if ("1".equals(vo.getReward_clsf())) {
			
			//if : 신규(신청번호 없는 경우)
			if ("".equals(reqNo)) {
				
				//신청번호 채번
				String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H0B");
				vo.setReq_no(reqNo_new);
				vo.setRegst_syspayno(KitechContextUtil.getSyspayno());
				
				if ("0".equals(vo.getOutsd_yn())) {
					vo.setOutsd_yn("N");
				}
				
				//신청서 신규 저장
				dao.insertHumApyPiz(vo);
				
				//결재인터페이스 저장
				CodeVo codeVo = CodeCacheManager.getInstance().getCode("HBF", vo.getReward_knd());		//이런식으로 코드 받아서 명칭받아오기	
				
				//신규 저장의 경우 인터페이스에 같이 넣어줘야함
				apprFuncService.formInit(reqNo_new, "H546", KitechContextUtil.getUserId(), codeVo.getComNm());
			
			
			//else : 수정(신청번호 있는 경우)
			} else {
				
				//결재상태 유효성
				try {
					apprValidService.isWaitStateAtIntfatab("H546", reqNo);
				}catch (KitechException ex){
					throw ex;
				}
				
				//수정자
				vo.setUpdt_syspayno(KitechContextUtil.getSyspayno());
				//신청서 수정
				dao.updateHumApyPiz(vo);
				
				
				//if : 결재신청
				if ("apr".equals(vo.getSave_type())) {
				
					if (vo.isApproval()) {
					
						String apySuccessFlg = ""; 
						apySuccessFlg = vo.getApySuccessFlg();
						
						//결재인터페이스 저장
						CodeVo codeVo = CodeCacheManager.getInstance().getCode("HBF", vo.getReward_knd());		//이런식으로 코드 받아서 명칭받아오기
						
				    	// 결재정보
				    	AprVo aprVo = new AprVo();
				    	aprVo.setLoginUserId(KitechContextUtil.getUserId());
				    	aprVo.setReqNo(vo.getReq_no());
				    	aprVo.setReporterId(KitechContextUtil.getSyspayno());
				    	aprVo.setUiId("H546");
				    	aprVo.setAprState(vo.getApr_state());
				    	aprVo.setEndpoint(KitechContextUtil.getUserId());
				    	aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + codeVo.getComNm());
				    	
						if(apySuccessFlg != "2" && apySuccessFlg != "9" && apySuccessFlg != "20"){ // 반려, 최초상신
							aprVo.setBiz(true);
						}    	
						if (apySuccessFlg != "") {
							aprVo.setOperCode(vo.getApySuccessFlg());
						}
						if (vo.getImpl_agncy() != "") {
							aprVo.setExt2Cd(vo.getImpl_agncy());
						}
						if (vo.getReward_no() != "") {
							aprVo.setExt3Cd(vo.getReward_no());
						}
						
						//결재신청
						apprFuncService.approvalScreen(aprVo);		
						
					}
					
				}
			
			}
			
		} 
		
		return vo.getReq_no();
	}

	/**
     * 포상경력신청. 반려
     * @param 
     * @return
     * @throws Exception
     */
	@Override
	public void formReject(HumApyPizInfoVo vo) throws KitechException {

		AprScVo aprScVo = new AprScVo();
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setComments(vo.getComments());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		
		//반려
		apprFuncService.formReject(aprScVo);
	}

	/**
     * 포상경력신청. 처리
     * @param 
     * @return
     * @throws Exception
     */
	@Override
	public void formAccept(HumApyPizInfoVo vo) throws KitechException {

		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(vo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("H546");
		aprVo.setAprState(vo.getApr_state());
		aprVo.setOperCode("0");
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		
		//처리
		apprFuncService.formAccept(aprVo);
	}




}
