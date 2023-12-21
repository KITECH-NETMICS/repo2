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
import kr.re.kitech.biz.hum.apy.dao.HumApyLndDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyLndService;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndAccptVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyLndSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**  
 * @ClassSubJect 휴복직신청 관련 서비스
 * @Class Name : HumApyLndServiceImpl.java
 * @Description : 휴복직신청 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/15   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/15
 * @version 1.0
 * @see
 * 
 */
@Service("humApyLndServiceImpl")
public class HumApyLndServiceImpl extends EgovAbstractServiceImpl implements HumApyLndService {

	@Resource(name = "humApyLndDAO")
	private HumApyLndDAO dao;

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

    //스냅샷 첨부파일 관련
    @Resource(name="attachDAO")
    private AttachDAO attachDao;

	/**
     * 휴복직신청. 목록 조회
     * @param 
     * @return List<HumApyLndInfoVo>
     * @throws Exception
     */
    @Override
    public List<HumApyLndInfoVo> selectHumApyLndList(HumApyLndSrchVo vo) throws KitechException {
    	return dao.selectHumApyLndList(vo);
    }
    
    /**
     * 휴복직신청. 상세조회
     * @param 
     * @return HumApyLndInfoVo
     * @throws Exception
     */
    @Override
    public HumApyLndInfoVo selectHumApyLndInfo(HumApyLndSrchVo vo) throws KitechException {
    	return dao.selectHumApyLndInfo(vo);
    }
    
    /**
     * 휴복직신청. 신청서 삭제
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void deleteHumApyLnd(HumApyLndSrchVo vo) throws KitechException {
		dao.deleteHumApyLnd(vo);						//신청서 삭제
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
	}

    /**
     * 휴복직신청. 신청서 삭제
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public String saveHumApyLnd(HumApyLndInfoVo vo) throws KitechException {

		String reqNo = vo.getReq_no();		//화면단에서 받아오는 신청번호
		
		
		//if : 신규(신청번호 없는 경우)
		if ("".equals(reqNo)) {
			
			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H09");
			vo.setReq_no(reqNo_new);
			
			//신청서 신규 저장
			dao.insertHumApyLnd(vo);
			
			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H544", KitechContextUtil.getUserId(), vo.getReq_typ_nm());
		
		
		//else : 수정(신청번호 있는 경우)
		} else {
			
			//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("H544", reqNo);
			}catch (KitechException ex){
				throw ex;
			}
			
			//신청서 수정
			dao.updateHumApyLnd(vo);
		
			//반려 상태에서 저장 누르면 "저장중"으로 상태 변경
			if ("XAD015".equals(vo.getApr_state())) {
				aprComService.modifyAprInterface(vo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
			}		
			
		}
		
		//결재신청
		if ("apr".equals(vo.getSave_type())) {
			
			if (vo.isApproval()) {
					
				AprVo aprVo = new AprVo();
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setMainKey(vo.getReq_no());
				aprVo.setReqNo(vo.getReq_no());
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setUiId("H544"); //서비스ID
				aprVo.setAprState(vo.getApr_state());
				aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + vo.getReq_typ_nm());
				aprVo.setExt2Cd(vo.getResn());
				aprVo.setTaskExt1("H534");
				
				//스냅샷에 전달하기위한 첨부파일 세팅
				if(!"".equals(vo.getAttach_file_no())){
					vo.setFileList(attachDao.selectListAttach(vo.getAttach_file_no()));
				}
				
				apprFuncService.approvalRequest(aprVo, vo);		
				
			}
			
		}

		
		return vo.getReq_no();
		
	}

	/**
	 * 휴복직신청. 반려
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formReject(HumApyLndInfoVo vo) throws KitechException {

		AprScVo aprScVo = new AprScVo();
		aprScVo.setAprState(vo.getApr_state());
		aprScVo.setReqNo(vo.getReq_no());
		aprScVo.setEndpoint(KitechContextUtil.getUserId());
		aprScVo.setComments(vo.getComments());
		//반려
		apprFuncService.formReject(aprScVo);	
		
	}

	/**
	 * 휴복직신청. 승인 처리
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void formAccept(HumApyLndListVo vo) throws KitechException {
		
		HumApyLndInfoVo saveVo = vo.getHumApyLndInfoVo();		//승인처리 정보
		HumApyLndAccptVo insertVo = vo.getHumApyLndAccptVo();	//승인 후 insert 정보
		
		AprVo aprVo = new AprVo();
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setReqNo(saveVo.getReq_no());
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("H544");
		aprVo.setBiz(true);
		aprVo.setAprState(saveVo.getApr_state());
		aprVo.setOperCode("9");
		aprVo.setEndpoint(KitechContextUtil.getUserId());
		//처리
		apprFuncService.formAccept(aprVo);
		
		
		//승인처리시 : <<발령정보관리 입력(saveHumAppnThst)>> insert
		String appont_no = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H01");
		insertVo.setAppont_no(appont_no);
		//insert정보(발령정보관리 입력)
		dao.insertHumApyLndSuccessAccept(insertVo);
		
	}

}
