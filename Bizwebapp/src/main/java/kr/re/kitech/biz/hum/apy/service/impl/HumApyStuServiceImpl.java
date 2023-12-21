package kr.re.kitech.biz.hum.apy.service.impl;

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
import kr.re.kitech.biz.hum.apy.dao.HumApyStuDAO;
import kr.re.kitech.biz.hum.apy.service.HumApyStuService;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuListVo;
import kr.re.kitech.biz.hum.apy.vo.HumApyStuSrchVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 학생연구원활용예정확인서 관련 서비스
 * @Class Name : HumApyStuServiceImpl.java
 * @Description : 학생연구원활용예정확인서 관련 서비스
 * @Modification Information  
 * @
 * @  수정일             수정자             수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/09/07   석원탁             최초생성
 * 
 * @author 
 * @since 2023/09/07
 * @version 1.0
 * @see
 * 
 */
@Service("humApyStuServiceImpl")
public class HumApyStuServiceImpl extends EgovAbstractServiceImpl implements HumApyStuService {

	@Resource(name = "humApyStuDAO")
	private HumApyStuDAO dao;

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

    @Resource(name="attachDAO")
    private AttachDAO attachDao;

	/**
     * 학생연구원활용예정확인서. 목록 조회
     * @param 
     * @return List<HumApyStuInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyStuInfoVo> selectHumApyStuList(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuList(vo);
	}
	
	/**
     * 학생연구원활용예정확인서. 추천서 발급번호 생성
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void updateHumApyStuRcmd(HumApyStuListVo vo) throws KitechException {

		List<HumApyStuInfoVo> chkList = vo.getHumApyStuVoList();	//grid에서 체크한 값들을 가져옴
		
		for(HumApyStuInfoVo updateVo : chkList){
		
			String enterYmd = updateVo.getEntr_ymd();
			String formerLatter = updateVo.getFormer_latter();	//신청서 내 전기/후기 구분
			String rcmdNo = enterYmd.substring(0, 4) + "-" + formerLatter.substring(0, 1) + "-";
			
			updateVo.setRcmd_no(rcmdNo);
			
			dao.updateHumApyStuRcmd(updateVo);
		}
	
	}
	
	/**
     * 학생연구원활용예정확인서. 메일발송 여부 수정
     * @param 
     * @return 
     * @throws Exception
     */
	@Override
	public void updateEmailYn(HumApyStuListVo vo) throws KitechException {
	
		List<HumApyStuInfoVo> chkList = vo.getHumApyStuVoList();	//grid에서 체크한 값들을 가져옴
		
		for(HumApyStuInfoVo updateVo : chkList){
			
			updateVo.setRcmd_state(updateVo.getUpdateData() + " 메일전송");
			updateVo.setRcmd_updt_syspayno(KitechContextUtil.getSyspayno());
			
			dao.updateEmailYn(updateVo);
		}
		
	}

	/**
     * 학생연구원활용예정확인서. 연수책임자 과제 현황 목록 조회
     * @param 
     * @return List<HumApyStuInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyStuInfoVo> selectHumApyStuPrjList(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuPrjList(vo);
	}

	/**
     * 학생연구원활용예정확인서. 연수책임자 지도 학생 연구원 현황 목록 조회
     * @param 
     * @return List<HumApyStuInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyStuInfoVo> selectHumApyStuStuList(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuStuList(vo);
	}

	/**
     * 학생연구원활용예정확인서. 연수책임자 학생인건비 현황 조회
     * @param 
     * @return List<HumApyStuInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyStuInfoVo> selectHumApyStuExpns(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuExpns(vo);
	}

	/**
     * 학생연구원활용예정확인서. 상세조회
     * @param 
     * @return HumApyStuInfoVo
     * @throws Exception
     */
	@Override
	public HumApyStuInfoVo selectHumApyStuInfo(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuInfo(vo);
	}

	/**
     * 학생연구원활용예정확인서. 학생연구원 정보 목록 조회
     * @param 
     * @return List<HumApyStuInfoVo>
     * @throws Exception
     */
	@Override
	public List<HumApyStuInfoVo> selectHumApyStuInfoList(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuInfoList(vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 보험율 산정 방식 조회
	 * @param 
	 * @return HumApyStuInfoVo
	 * @throws Exception
	 */
	@Override
	public HumApyStuInfoVo selectHumApyStuSalInsur(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuSalInsur(vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 학생연구원 급여기준표 급여 조회
	 * @param 
	 * @return HumApyStuInfoVo
	 * @throws Exception
	 */
	@Override
	public HumApyStuInfoVo selectHumApyStuSalAnuPay(HumApyStuSrchVo vo) throws KitechException {
		return dao.selectHumApyStuSalAnuPay(vo);
	}
	
	/**
	 * 학생연구원활용예정확인서. 학생연구원 급여기준표 급여 조회
	 * @param 
	 * @return String
	 * @throws Exception
	 */
	@Override
	public String saveHumApyStu(HumApyStuListVo vo) throws KitechException {
	
		HumApyStuInfoVo infoVo = vo.getHumApyStuVo();				//신청서 기본 정보(Map)
		List<HumApyStuInfoVo> infoList = vo.getHumApyStuVoList();	//신청서 내 변경후 학력사항(List)
		
		String reqNo = infoVo.getReq_no();			//화면단에서 전달받은 신청번호
		
		//if : 신청번호 없을 경우. insert
		if ("".equals(reqNo)) {

			//신청번호 채번
			String reqNo_new = genService.getGenNumber(Numberings.DOCUMENT.getName(), "H0D");
			infoVo.setReq_no(reqNo_new);
			infoVo.setReq_typ("H0D");
			
			//신청서 기본 정보 저장
			dao.insertHumApyStuInfo(infoVo);

			//신규 저장의 경우 인터페이스에 같이 넣어줘야함
			//맨 마지막 parameter에 학생연구원 성명 쭉 넣어줘야함
			apprFuncService.formInit(reqNo_new, "H548", KitechContextUtil.getUserId(), infoVo.getApr_nm());

			
		//else : 신청번호 있는 경우. update 
		} else {
			
			//결재상태 유효성
			try {
				apprValidService.isWaitStateAtIntfatab("H548", reqNo);
			}catch (KitechException ex){
				throw ex;
			}
			
			//신청서 수정
			dao.updateHumApyStuInfo(infoVo);
			
		}
	
		//학생연구원 정보 목록 저장 -> delete & insert 방식
		if (infoList != null) {
			
			//학생연구원 정보 delete
			HumApyStuSrchVo deleteVo = new HumApyStuSrchVo();
			deleteVo.setReq_no(infoVo.getReq_no());
			dao.deleteHumApyStuList(deleteVo);
			
			//학생연구원 정보 insert
			for(HumApyStuInfoVo afterList : infoList){

				afterList.setReq_no(infoVo.getReq_no());		//신청번호
				
				//변경 후 학력사항. 저장
				dao.insertHumApyStuList(afterList);
				
			}
			 
		}
		
		//결재신청 관련 로직
		if ("apr".equals(infoVo.getSave_type())) {
		
			if (infoVo.isApproval()) {
			
				//결재신청 로직
				HumApyStuInfoVo saveVo = vo.getHumApyStuVo();
		
				AprVo aprVo = new AprVo();
				aprVo.setEndpoint(KitechContextUtil.getUserId());
				aprVo.setMainKey(saveVo.getReq_no());
				aprVo.setReqNo(saveVo.getReq_no());
				aprVo.setLoginUserId(KitechContextUtil.getUserId());
				aprVo.setReporterId(KitechContextUtil.getSyspayno());
				aprVo.setTcManger(saveVo.getApr_map_prof());
				aprVo.setUiId("H548");
				aprVo.setAprState(saveVo.getApr_state());
				aprVo.setInfoCd(KitechContextUtil.getName() + "(" + KitechContextUtil.getSyspayno().substring(2, 8) + ") / " + saveVo.getApr_nm());
				aprVo.setExt3Cd(saveVo.getApr_schl());
		
				//스냅샷에 전달하기위한 첨부파일 세팅
				if(!"".equals(saveVo.getAttach_file_no())){
					vo.setFileList(attachDao.selectListAttach(saveVo.getAttach_file_no()));
				}
				
				apprFuncService.approvalRequest(aprVo, vo);		
				
			}
			
		}
		
		//반려 상태에서 저장 누르면 "저장중"으로 상태 변경
		if ("XAD015".equals(infoVo.getApr_state())) {
			aprComService.modifyAprInterface(infoVo.getReq_no(), "XAD005", KitechContextUtil.getUserId());
		}	
	
		return infoVo.getReq_no();
	}
	
	/**
	 * 학생연구원활용예정확인서. 신청서 삭제
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	@Override
	public void deleteHumApyStu(HumApyStuSrchVo vo) throws KitechException {
		
		//신청서 기본정보
		dao.deleteHumApyStuInfo(vo);
		//신청서 학생연구원 목록
		dao.deleteHumApyStuList(vo);
		//결재상태 테이블
		apprFuncService.formRemove(vo.getReq_no());		//결재정보 삭제
		
	}

}
