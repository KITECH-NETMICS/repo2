package kr.re.kitech.biz.res.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.apr.service.ApprValidService;
import kr.re.kitech.biz.apr.vo.AprVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;
import kr.re.kitech.biz.com.enums.Numberings;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.res.app.dao.ResBsnsAplyReqDAO;
import kr.re.kitech.biz.res.app.service.ResBsnsAplyReqService;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsAdjstVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsAppRetVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsReqVo;
import kr.re.kitech.biz.res.app.vo.ResAppBsnsThreeFiveVo;
import kr.re.kitech.biz.res.app.vo.ResAppBugtVo;
import kr.re.kitech.biz.res.app.vo.ResAppMastVo;
import kr.re.kitech.biz.res.app.vo.ResAppPareVo;
import kr.re.kitech.biz.res.app.vo.ResAppPrePrjVo;
import kr.re.kitech.biz.res.app.vo.ResAppSrcVo;
import kr.re.kitech.biz.res.app.vo.ResBsnsReqEtcVo;
import kr.re.kitech.biz.res.app.vo.ResPareMngmtMstrVo;
import kr.re.kitech.biz.res.mail.service.ResMailSendService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**  
 * @ClassSubJect 사업신청 
 * @Class Name : ResAppBsnsAppServiceImpl.java
 * @Description : 사업신청 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/12/10   홍성민                최초생성
 * 
 * @author 홍성민
 * @since 2022/12/10
 * @version 1.0r
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Service("resBsnsAplyReqService")
public class ResBsnsAplyReqServiceImpl extends EgovAbstractServiceImpl implements ResBsnsAplyReqService {

	@Resource(name="resBsnsAplyReqDAO")
	private ResBsnsAplyReqDAO dao;
	
	@Resource(name="attachDAO")
    private AttachDAO attachDao;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
	
	@Resource(name="apprFuncServiceImpl")
	private ApprFuncService apprFuncService;
	
	@Resource(name="resMailSendService")
	private ResMailSendService mailService;
	
	@Resource(name="apprValidServiceImpl")
	private ApprValidService apprValidService;
	
	/**
	 * 사업 신청 목록(사용자) 조회
	 * @param ResAppSrcVo
     * @return ResAppBsnsAppListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public List<ResAppBsnsReqVo> selectBsnsAppUserList(ResAppSrcVo vo) throws KitechException {
		return dao.selectBsnsAppUserList(vo);
	}
	
	/**
	 * 사업 신청 디테일 조회
	 * @param ResAppSrcVo
     * @return ResAppBsnsAppListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public ResAppBsnsAppRetVo selectBsnsApp(ResAppSrcVo vo) throws KitechException {
		ResAppBsnsAppRetVo retVo = new ResAppBsnsAppRetVo();
		// 사업신청정보
		retVo.setMastVo(dao.selectResAppMast(vo.getBsns_req_no()));
		// 연구비조회
		retVo.setBugtList(dao.selectResAppBugt(vo));
		// 사후결재사유 조회
		retVo.setPostAprVo(apprCommonService.selectAprAfterReason(vo.getBsns_req_no()));
		
		// 간접세 비율 조회
		ResBsnsReqEtcVo etcVo = new ResBsnsReqEtcVo();
//		if(retVo.getMastVo() != null){
//			etcVo.setYmd(retVo.getMastVo().getReq_ymd());
//			etcVo = dao.selectAppIndrc(indrcVo);
//		}
		
		// 로그인한 사람의 연구원구분 조회
		if(!StringUtils.isEmpty(vo.getBsns_req_no())){
			etcVo.setReschr_clsf(dao.selectUserAuthorInfo(vo));
		}
		
		retVo.setEtcVo(etcVo);		
		
		return retVo;
	}
	
	/**
	 * 연구비 템플릿 조회
	 * @param ResAppSrcVo
     * @return List<ResAppBugtVo>
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public List<ResAppBugtVo> selectBugtTemplate(ResAppSrcVo vo) throws KitechException {
		return dao.selectResAppBugt(vo);
	}
	
	/**
	 * 간접비 비율 조회
	 * @param ResAppSrcVo
     * @return List<ResAppBugtVo>
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public ResBsnsReqEtcVo selectAppIndrc(ResBsnsReqEtcVo vo) throws KitechException {
		return dao.selectAppIndrc(vo);
	}

	/**
	 * 사전 사업 내역 조회
	 * @param ResAppPrePrjVo
     * @return List<ResAppPrePrjDetailVo>
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public List<ResAppPrePrjVo> selectResAppPrePrjList(ResAppPrePrjVo vo) throws KitechException {
		return dao.selectResAppPrePrjList(vo);
	}

	/**
	 * 사업신청전 참여연구원 사전등록 목록 조회(사전등록팝업)
	 * @param ResAppSrcVo
     * @return ResAppPrePrjDetailListVo
	 * @throws Exception 모든 예외를 던진다.
	 */
	@Override
	public List<ResPareMngmtMstrVo> selectResPareMngmtMstrList(ResPareMngmtMstrVo vo) throws KitechException {	
		return dao.selectResPareMngmtMstrList(vo);
	}
	
	/**
	 * 사업신청 참여연구원 조회
	 * @param ResPareMngmtMstrVo
     * @return List<ResAppAttncePsnVo>
	 * @throws Exception
	 */
	@Override
	public List<ResAppPareVo> selectResAppPareList(ResPareMngmtMstrVo vo) throws KitechException {		
		if("PARE_MNG".equals(vo.getSrc_clsf())){
			return dao.selectResPareMngmtList(vo);
		}else{
			return dao.selectResAppPareList(vo);
		}
	}
	
	/**
	 * 3책5공 제외사업기준 조회
	 * @param ResAppBsnsThreeFiveVo
     * @return List<ResAppAttncePsnVo>
	 * @throws Exception
	 */
	@Override
	public List<ResAppBsnsThreeFiveVo> selectBsnsAplyThreeFive(ResAppBsnsThreeFiveVo vo) throws KitechException {
		return dao.selectBsnsAplyThreeFive(vo);
	}
	
	/**
     * 사업신청목록(관리자화면)을 조회한다.
     * @param ResAppSrcVo
     * @return ResAppBsnsAppListVo
     * @throws KitechException
     */
	public List<ResAppBsnsReqVo> selectBsnsAppList(ResAppSrcVo vo) throws KitechException{
		return dao.selectBsnsAppList(vo);
	}
	
	/**
     * 사업신청 저장
     * @param ResAppBsnsAppRetVo
     * @return String
     * @throws KitechException
     * @author LeeYH
     * @since 2022.12.27.
     */
	public String saveResBsnsAplyReq(ResAppBsnsAppRetVo vo) throws Exception{		
		ResAppMastVo mastVo = vo.getMastVo();
		String bsnsReqNo = mastVo.getBsns_req_no();
		
		if("C".equals(mastVo.getCud_type())){
			bsnsReqNo = genService.getGenNumber(Numberings.DOCUMENT.getName(), "R11");
			mastVo.setBsns_req_no(bsnsReqNo);
			
			// 01. 마스터 저장
			if(dao.insertResAppMast(mastVo) == 0){
				throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0002", new String[]{"사업신청마스터 저장"});
			}
			
			// 02. 인터페이스 저장
			apprCommonService.createAprInterface(bsnsReqNo, "RB42", KitechContextUtil.getUserId(), mastVo.getPrj_nm());
			
			// 03.사업조정회의 resappbsnsadjst.bsns_req_no update
			if("RII001".equals(mastVo.getConsider())){ // Y인 경우
				ResAppBsnsAdjstVo adjstVo = new ResAppBsnsAdjstVo();
				
				adjstVo.setReq_no(mastVo.getConsider_clsf());
				adjstVo.setBsns_req_no(bsnsReqNo);
				
				dao.updateResAppBsnsAdjst(adjstVo);
			}
			
			// 04.수행과제 보안등급 분류 및 심사기준 입력(내부연구(기관주요), 자체연구만) 20170926
			dao.insertResAppSecurity(mastVo);
			
			// 05.참여연구원사정등록 마스터에 bsns_req_no 입력			
			ResPareMngmtMstrVo pareMngmtVo = new ResPareMngmtMstrVo();
			pareMngmtVo.setReq_no(mastVo.getReq_no());
			pareMngmtVo.setBsns_req_no(bsnsReqNo);
			
			dao.updateResPareMngmtMstr(pareMngmtVo);
		}else{
			// AprState 체크하는 공통 메소드호출
			try {
			    apprValidService.isWaitStateAtIntfatab("RB42", bsnsReqNo);
			} catch (KitechException ex) {
			    throw ex;
			}
			
			// 마스터 수정
			dao.updateResAppMast(mastVo);
			
			// 사업조정회의 resappbsnsadjst.bsns_req_no update
			ResAppBsnsAdjstVo adjstVo = new ResAppBsnsAdjstVo();
			if("RII001".equals(mastVo.getConsider())){ // Y인 경우
				adjstVo.setReq_no(mastVo.getConsider_clsf());
				adjstVo.setBsns_req_no(bsnsReqNo);
			}else{
				adjstVo.setReq_no(bsnsReqNo);
				adjstVo.setBsns_req_no("");
			}
			dao.updateResAppBsnsAdjst(adjstVo);
			
			// 수행과제 보안등급 분류 및 심사기준 수정(내부연구(기관주요), 자체연구만) 20170926
			dao.updateResAppSecurity(mastVo);
			
			// 선행연구과제 없을 시 기존에 입력된 내역 삭제
			if("N".equals(mastVo.getPre_plan_prj())){
				dao.deleteResAppPrePrj(bsnsReqNo);
			}
			
			// 05.참여연구원사정등록 마스터에 bsns_req_no 입력	
			if(!"".equals(mastVo.getReq_no()) && !mastVo.getReq_no().equals(mastVo.getCu_req_no())){
				// 기존의 참여연구원사정등록 마스터 수정(초기화)
				ResAppSrcVo srcVo = new ResAppSrcVo();
				srcVo.setBsns_req_no(bsnsReqNo);
				dao.updateResPareMngmtMstrDel(srcVo);
				
				// 마스터 수정
				ResPareMngmtMstrVo pareMngmtVo = new ResPareMngmtMstrVo();
				pareMngmtVo.setReq_no(mastVo.getReq_no());
				pareMngmtVo.setBsns_req_no(bsnsReqNo);
				
				dao.updateResPareMngmtMstr(pareMngmtVo);
			}
		}
		
		// 06. 선행연구과제 저장
		List<ResAppPrePrjVo> prjList = vo.getPrePrjList();
		if(prjList != null){
			if("U".equals(mastVo.getCud_type())){
				// 기존의 데이터 삭제
				dao.deleteResAppPrePrj(bsnsReqNo);
			}
			
			int cnt =1;
			for(ResAppPrePrjVo prjVo : prjList){
				prjVo.setBsns_req_no(bsnsReqNo);
				prjVo.setSeq(cnt);
				
				if(dao.insertResAppPrePrj(prjVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0002", new String[]{"선행연구과제 저장"});
				}
				cnt++;
			}
		}
		
		// 07. 참여연구원 저장
		List<ResAppPareVo> pareList = vo.getPareList();
		if(pareList != null){
			if("U".equals(mastVo.getCud_type())){
				// 기존의 데이터 삭제
				dao.deleteResAppPare(bsnsReqNo);
			}
			
			for(ResAppPareVo pareVo : pareList){
				pareVo.setBsns_req_no(bsnsReqNo);
				
				if(dao.insertResAppPare(pareVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0002", new String[]{"참여연구원 저장"});
				}
			}
		}
		
		// 08. 사업신청 연구비 저장
		List<ResAppBugtVo> bugtList = vo.getBugtList();
		if(bugtList != null){
			for(ResAppBugtVo bugtVo : bugtList){
				bugtVo.setBsns_req_no(bsnsReqNo);
				bugtVo.setAnal(1);
				
				if(dao.mergeResAppBugt(bugtVo) == 0){
					throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0002", new String[]{"사업신청 연구비 저장"});
				}
			}
		}
		
		// 09.연구장비비 통합관리(2021.09.03.)
		if("U".equals(mastVo.getCud_type())){
			// 기존 통합관리비 삭제
			dao.deleteResEquipFeeMgt(bsnsReqNo);
		}
		
		List<ResEquipLimitAmtVo> limitAmtList = vo.getLimitAmtList();
		if(limitAmtList != null){
			for(ResEquipLimitAmtVo amtVo : limitAmtList){
				amtVo.setReq_no(bsnsReqNo);
				
				dao.mergeResEquipFeeMgt(amtVo);
			}
		}
		
		if(mastVo.isApproval()){
			this.approvalResBsnsAplyReq(vo);
		}
		
		return bsnsReqNo;
	}
	
	/**
     * 사업신청 사업선전 결과 저장
     * @param ResAppMastVo
     * @throws KitechException
     * @author LeeYH
     * @since 2022.12.28.
     */
	public String saveBsnsAplySeltRst(ResAppMastVo vo) throws KitechException{
		// 01. 선정결과 저장
		dao.updateResAppMastSeltRst(vo);
		
		// 02.사업선정이 안된 경우 통합관리비 삭제
		if(!"RAG001".equals(vo.getSelt_rst())){
			dao.deleteResEquipFeeMgt(vo.getBsns_req_no());
		}
		
		// 03.통합프로세스 호출
		if(vo.isApproval()){
			AprVo aprVo = new AprVo();
			aprVo.setMainKey(vo.getBsns_req_no());
			aprVo.setReqNo(vo.getBsns_req_no());
			aprVo.setReporterId(KitechContextUtil.getSyspayno());
			aprVo.setLoginUserId(KitechContextUtil.getUserId());
			aprVo.setEndpoint(KitechContextUtil.getUserId());
			aprVo.setUiId("RB42");
			if("RAG001".equals(vo.getSelt_rst())){
				aprVo.setPrjSelYn("Y");
			}else{
				aprVo.setPrjSelYn("N");
			}
			
			apprFuncService.formAccept(aprVo);
		}
		
		// 04. 메일발송
		boolean mailYn = false;
		if(!"Y".equals(vo.getMail_send_yn()) && "RAG001".equals(vo.getSelt_rst())){
			if(!"9999".equals(KitechContextUtil.getSyspayno().substring(0, 4))){ // 시스템관리자인 경우 메일이 안가도록
				Map<String,String> map = new HashMap<>();
				map.put("prj_nm", vo.getPrj_nm());
				map.put("resch_rspns_main_nm", vo.getResch_rspns_main_nm());
				map.put("tot_resch_prd_orign_ymd", vo.getTot_resch_prd_orign_ymd());
				map.put("tot_resch_prd_cls_ymd", vo.getTot_resch_prd_cls_ymd());
				map.put("resch_rspns_main_mail", vo.getResch_rspns_main_mail());
				// TODO TEST
				//map.put("resch_rspns_main_mail", "eipleeyh@kitech.re.kr");
				
				mailService.sendBsnsSeltRst(map);
				
				// 메일발송여부 Y로 수정
				dao.updateResAppMastMailSend(vo.getBsns_req_no());
				mailYn = true;
			}
		}else{
			if("Y".equals(vo.getMail_send_yn())) mailYn = true;
		}	
		
		return (mailYn)? "Y" : "N";
	}
	
	/**
     * 사업신청 결재신청
     * @param ResAppBsnsAppRetVo
     * @throws KitechException
     * @author LeeYH
     * @since 2023.01.10.
     */
	private void approvalResBsnsAplyReq(ResAppBsnsAppRetVo vo) throws Exception{
		ResAppMastVo mastVo = vo.getMastVo();
		// 보안등급분로		
		if("Y".equals(mastVo.getSecrt_prj_ex())){
			mastVo.setSecrt_prj_ex("보안과제");
		}else{
			mastVo.setSecrt_prj_ex("일반과제");
		}
		
		vo.setPostAprVo(apprCommonService.selectAprAfterReason(mastVo.getBsns_req_no()));		
    	// 사후결재 여부
    	if(vo.getPostAprVo() != null && !StringUtils.isEmpty(vo.getPostAprVo().getReq_no())){
    		vo.getPostAprVo().setIs_apr_after(true);
    	}
    	
    	// 사업계획서
    	if(!"".equals(mastVo.getMiddle_attach_file())){
    		vo.setFileListA(attachDao.selectListAttach(mastVo.getMiddle_attach_file()));
    	}
    	
    	// 사업공고문
    	if(!"".equals(mastVo.getBsns_notice_attach_file_no())){
    		vo.setFileListB(attachDao.selectListAttach(mastVo.getBsns_notice_attach_file_no()));
    	}
    	
    	AprVo aprVo = new AprVo();
    	aprVo.setMainKey(mastVo.getBsns_req_no());
    	aprVo.setReqNo(mastVo.getBsns_req_no());
		aprVo.setLoginUserId(KitechContextUtil.getUserId());
		aprVo.setEndpoint(KitechContextUtil.getUserId());		
		aprVo.setReporterId(KitechContextUtil.getSyspayno());
		aprVo.setUiId("RB42");
		
		aprVo.setResearchCharger(mastVo.getResch_rspns_main());
		aprVo.setManager(vo.getEtcVo().getCharg_syspayno());
		// 정부수탁, 민간수탁이면 외부과제(RCMS, POINT과제는 제외) : 통합프로세스(과제생성 후 입금의뢰)
		if(mastVo.getBsns_cd_inout().matches("RHA001|RHA003") && "N".equals(mastVo.getPrj_card_clsf())){
			aprVo.setOuterPrjYn("Y");
		}else{
			aprVo.setOuterPrjYn("N");
		}
		aprVo.setInfoCd(mastVo.getPrj_nm());
		aprVo.setExt1Cd(mastVo.getBsns_req_no());
		aprVo.setExt2Cd(mastVo.getResch_rspns_main());
		
		apprFuncService.approvalRequest(aprVo, vo);
	}
	
	/**
     * 사업신청 삭제
     * @param ResAppSrcVo
     * @return int
     * @throws KitechException
     * @author LeeYH
     * @since 2023.01.12.
     */
	public void deleteResBsnsReq(ResAppSrcVo vo) throws KitechException{
		// 01.사업신청 마스터,연구비,수행과제 보안등급 분류 및 심사기준 삭제
		if(dao.deleteResBsnsReq(vo.getBsns_req_no()) == 0){
			throw new KitechException(Exceptions.ERROR, Business.RES, "message.xom.co.com.0002", new String[]{"사업신청 삭제"});
		}
		
		// 02. 참여연구원 삭제
		dao.deleteResAppPare(vo.getBsns_req_no());
		// 02-1. 참여연구원사전등록테이블 수정(사업신청번호 빈값처리)
		dao.updateResPareMngmtMstrDel(vo);
		
		// 03.사업조정회의 resappbsnsadjst.bsns_req_no update
		ResAppBsnsAdjstVo adjstVo = new ResAppBsnsAdjstVo();
		adjstVo.setReq_no(vo.getBsns_req_no());
		adjstVo.setBsns_req_no("");
		
		dao.updateResAppBsnsAdjst(adjstVo);
		
		// 04. 선행연구과제 삭제
		dao.deleteResAppPrePrj(vo.getBsns_req_no());
		
		// 05. 연구장비통합관리비 삭제
		dao.deleteResEquipFeeMgt(vo.getBsns_req_no());
		
		// 06. 결재스냅샷 및 인터페이스 테이블 삭제
		apprCommonService.deleteApr(vo.getBsns_req_no());
	}

}
