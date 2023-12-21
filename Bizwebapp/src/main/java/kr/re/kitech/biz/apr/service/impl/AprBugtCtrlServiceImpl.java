package kr.re.kitech.biz.apr.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.hsqldb.lib.StringUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.dao.ApprCommonDAO;
import kr.re.kitech.biz.apr.dao.AprBugtCtrlDAO;
import kr.re.kitech.biz.apr.service.AprBugtCtrlService;
import kr.re.kitech.biz.apr.vo.BugtCtrlInfoVo;
import kr.re.kitech.biz.apr.vo.BugtCtrlSrcVo;
import kr.re.kitech.biz.fin.com.service.FinComService;
import kr.re.kitech.biz.fin.com.vo.BblenfrcVo;
import kr.re.kitech.biz.fin.com.vo.DelBblEnfrcVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;

/**
 * @ClassSubJect 예산통제 
 * @Class Name AprBugtCtrlServiceImpl.java
 * @Description 예산통제 ServiceImpl
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/25      이영희             최초생성
 * 
 * @author 이영희
 * @since 2022/08/25
 * @version 1.0
 * @see
 * 
 */
@Service("aprBugtCtrlService")
public class AprBugtCtrlServiceImpl extends EgovAbstractServiceImpl implements AprBugtCtrlService {
	@Resource(name="aprBugtCtrlDAO")
	private AprBugtCtrlDAO dao;
	
	@Resource(name="apprCommonDAO")
	private ApprCommonDAO apprComDao;
	
	@Resource(name="finComService")
	private FinComService finComService;
	
	@Value("${apr.snapshot.base}")
    private String snapshotBase;

	/**
     * 예산통제자 결재 목록 조회
     * @param BugtCtrlSrcVo
     * @return List<BugtCtrlInfoVo>
     * @throws Exception
     */
	@Override
	public List<BugtCtrlInfoVo> selectBblEnfrcCtrlList(BugtCtrlSrcVo vo) throws KitechException {
		return dao.selectBblEnfrcCtrlList(vo);
	}
	
	/**
     * 예산통제자 승인/반려
     * @param ApiBpmVo
     * @return 
     * @throws Exception
     */
	public void updateDecsnReject(String reqNo, String aprYn) throws KitechException{
		BugtCtrlSrcVo srcVo = new BugtCtrlSrcVo();
		srcVo.setReq_no(reqNo);
		srcVo.setEndpoints(KitechContextUtil.getUserId());
		srcVo.setBugt_ctrl_psn(KitechContextUtil.getSyspayno());
		
		List<BugtCtrlInfoVo> ctrlList = dao.selectBblEnfrcCtrlList(srcVo);
		if(ctrlList.size() > 0){
			if("Y".equals(aprYn)){ // 승인
				this.approveBugtCtrl(ctrlList);		
			}else if("N".equals(aprYn)){
				this.rejectBugtCtrl(ctrlList);
			}
		}
	}
	
	/**
     * 예산통제자 승인
     * @param List<BugtCtrlInfoVo>
     * @return 
     * @throws Exception
     */
	private void approveBugtCtrl(List<BugtCtrlInfoVo> ctrlList) throws KitechException{		
		// 스냅샷 조회
		String reqNo = ctrlList.get(0).getReq_no();
		String linkurl = snapshotBase + apprComDao.getSnapshotLinkurl(reqNo);
    	Document snapDoc = this.getSnapShotDoc(linkurl);    		
		
		boolean chngFlag = false; // 스냅샷 변경여부
		
		for(BugtCtrlInfoVo vo : ctrlList){
			String f_sip_approval = "N";
			
			// 01. 로그 입력
			vo.setFun_nm("(승인) 작업전-AprBugtCtrlServiceImpl.approveBugtCtrl");
			dao.insertLogBugtCtrlPsn(vo);
			
			// FBJ091(일반신청), FBJ051(구매요청신청), FBJ101(가지급금신청), FBJ052(계정변경신청)이면서 결의번호가 110, 235 으로 시작하는 경우는 예산모듈 실행하지 않고 결재진행만 한다.
			f_sip_approval = this.getSlipApproval(vo.getTrans_unslip_no(), vo.getReq_clsf());
			
			// 2019.08.22 통제번호가 존재하는 경우 결재만 진행
			if(vo.getCtrl_no() != null && !"".equals(vo.getCtrl_no())){
				f_sip_approval = "Y";
			}
			
			// 20150323 가지급금정산신청서인 경우 아래처럼 조건에따라 예산통제모듈 태울지 결정
			if("F11".equals(vo.getReq_no().substring(0,3))){
				if("FBJ101".equals(vo.getReq_clsf())){ // 1. 가지급신청 시의 계정번호로 사용한 금액 확인
					f_sip_approval = "Y";
				}
				
				if("FBJ102".equals(vo.getReq_clsf())){ // 2. 가지급정산 시, 추가내역 있는 경우
					f_sip_approval = "N";
				}
			}
			
			if("N".equals(f_sip_approval)){
				// 예산통제모듈 호출
				BblenfrcVo enfrcVo = new BblenfrcVo();
										
				enfrcVo.setReq_no(vo.getReq_no());
				enfrcVo.setReq_seq(vo.getReq_seq());	
				enfrcVo.setBugt_yr(vo.getReq_ymd().substring(0,4));			
				enfrcVo.setReq_clsf(vo.getReq_clsf());			
				enfrcVo.setAccnt_no(vo.getAccnt_no());
				enfrcVo.setAccnt_cd(vo.getAccnt_cd());
				enfrcVo.setExpns_cd(vo.getExpns_cd());
				enfrcVo.setCtrl_no(vo.getCtrl_no());
				enfrcVo.setBugt_ctrl_way(vo.getBugt_ctrl_way());	
				enfrcVo.setCtrl_psn(vo.getBugt_ctrl_psn());		
				enfrcVo.setReq_amt(vo.getReq_amt());
				enfrcVo.setOld_req_amt(vo.getOld_req_amt());			
				enfrcVo.setOld_enfrc_amt_cause(vo.getOld_enfrc_amt_cause());		
				enfrcVo.setRelat_no(vo.getRelat_no());
								
				// 통제내역 호출
				finComService.budEnfrcMnt04(enfrcVo);
				
				if(vo.getCtrl_no() == null || "".equals(vo.getCtrl_no())){
					vo.setCtrl_no(enfrcVo.getCtrl_no());
					vo.setBugt_ctrl_way(enfrcVo.getBugt_ctrl_way());
					vo.setCtrl_ymd(enfrcVo.getCtrl_ymd());
					vo.setEnfrc_amt_cause(enfrcVo.getEnfrc_amt_cause());
				}
				
				// 각업무별 처리
				this.updateCtrlNo(vo, vo.getReq_no().substring(0,3));
				
				// 스냅샷 변경
				NodeList tmp1 = snapDoc.getElementsByTagName("td");			
				Node idAttr = null;
				String reqSeq = String.valueOf(vo.getReq_seq());
				
				for (int i = 0; i < tmp1.getLength(); i++) {
					idAttr = tmp1.item(i).getAttributes().getNamedItem("id");
					if(idAttr != null){						
						if(idAttr.getNodeValue().equals("ctrlNo" + reqSeq)){
							tmp1.item(i).setTextContent(vo.getCtrl_no());
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("ctrlPsn" + reqSeq)) {
							tmp1.item(i).setTextContent(vo.getCtrl_psn_nm());// 통제자
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("reqAmt" + reqSeq)) {
							tmp1.item(i).setTextContent(String.valueOf(vo.getReq_amt()));// 신청금액
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("causeAmt" + reqSeq)) {
							tmp1.item(i).setTextContent(String.valueOf(vo.getEnfrc_amt_cause()));// 원인행위금액
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("ctrlYmd" + reqSeq)) {
							tmp1.item(i).setTextContent(vo.getCtrl_ymd());// 통제일자
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("ctrlState" + reqSeq)) {
							tmp1.item(i).setTextContent("통제처리");// 통제상태
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("expnsCd" + reqSeq)) {
							tmp1.item(i).setTextContent(vo.getExpns_cd());// 비용코드
							chngFlag = true;
						}else if (idAttr.getNodeValue().equals("expnsNm" + reqSeq)) {
							tmp1.item(i).setTextContent(vo.getExpns_cd_nm());// 비용코드명
							chngFlag = true;
						} 
					}
				}
			}
		}
		
		if(chngFlag){
			// 스냅샷 수정
			this.makeSnapshot(linkurl, snapDoc);
		}
		
	}
	
	/**
     * 각 업무별 통제번호 업데이트
     * @param BugtCtrlInfoVo, String
     * @return 
     * @throws Exception
     */
	private void updateCtrlNo(BugtCtrlInfoVo vo, String reqNoSub) throws KitechException{
		switch(reqNoSub){
			case "C87" : // 국내출장 정산
				dao.updateCtrDomAdAccntCtrlNo(vo);
				break;
			case "C74" : // 해외출장
				dao.updateCtrOverAccntCtrlNo(vo);
				break;
			case "C90" : // 해외출장 정산
				dao.updateCtrOverAdAccntCtrlNo(vo);
				break;
			case "C76" : // 근거리출장
				dao.updateCtrLocalCtrlNo(vo);
				break;
			case "P23" : // 구매요구
			case "P22" :
				dao.updatePurReqAccntCtrlNo(vo);
				break;
			case "P26" : // 구매계정변경신청
				dao.updatePurAccntChngdCtrlNo(vo);
				break;
			case "F05" : // 가지급신청
				dao.updateFspPayAdvcReqAccntCtrlNo(vo);
				break;
			case "F03" : // 내부기술지원의뢰
				dao.updateFspTechSuphCtrlNo(vo);
				break;
			case "F11" : // 가지급금전도금정산
				dao.updateFapPayAdvcAdjstAddAccnt(vo);
				break;
			case "C22" : // 전화요금신청
				dao.updateCgsTelFeeReqDetlsCtrlNo(vo);
				break;
			case "R06" : // 연구비송금
				dao.updateResBgRemtlCtrlNo(vo);
				break;
			case "R22" : // 연구수당신청			
				dao.updateResBgAllowCtrlNo(vo);
				break;
			default :
				if("FBJ011".equals(vo.getReq_clsf())){
					dao.updateFspSlipdCtrlNo(vo);
				}
				break;
		}
	}
	
	/**
     * 예산통제자 반려
     * @param List<BugtCtrlInfoVo>
     * @return 
     * @throws Exception
     */
	private void rejectBugtCtrl(List<BugtCtrlInfoVo> ctrlList) throws KitechException{
		int i_proc = 0;
		for(BugtCtrlInfoVo vo : ctrlList){
			String f_sip_approval = "N";
			
			// 한 건의 신청서가 신청순번에 의해 여러번 반려처리 및 예산통제실행되지 않게 하는 제약
			if(i_proc == 0){
				i_proc++;
			}else{
				continue;
			}
			
			// 01. 로그 입력
			vo.setFun_nm("(반려) 작업전-AprBugtCtrlServiceImpl.rejectBugtCtrl");
			dao.insertLogBugtCtrlPsn(vo);
			
			// FBJ091(일반신청), FBJ051(구매요청신청), FBJ101(가지급금신청), FBJ052(계정변경신청)이면서 결의번호가 110, 235 으로 시작하는 경우는 예산모듈 실행하지 않고 결재진행만 한다.
			f_sip_approval = this.getSlipApproval(vo.getTrans_unslip_no(), vo.getReq_clsf()); 	
			
			// 05/28 : 구매신청의 경우에만 원인행위 정리한다.(김기탁요구)
			if("N".equals(f_sip_approval) && vo.getReq_no().substring(0,3).matches("P22|P23")){
				DelBblEnfrcVo delVo = new DelBblEnfrcVo();
				delVo.setReq_no(vo.getReq_no());
				
				finComService.deleteBudEnfrcMnt(delVo);
			}		
		}
	}
	
	/**
     * 예산통제여부 반환
     * @param String unslipNo, String reqClsf
     * @return String
     * @throws Exception
     */
	private String getSlipApproval(String unslipNo, String reqClsf) throws KitechException{
		// FBJ091(일반신청), FBJ051(구매요청신청), FBJ101(가지급금신청), FBJ052(계정변경신청)이면서 결의번호가 110, 235 으로 시작하는 경우는 예산모듈 실행하지 않고 결재진행만 한다.
		if(!StringUtil.isEmpty(unslipNo) && unslipNo.substring(0, 3).matches("110|235") 
			      && reqClsf.matches("FBJ091|FBJ051|FBJ101|FBJ052")){
			return "Y";
		}else{
			return "N";
		}		
	}
	
	/**
     * 스냅샷 수정
     * @param String reqNo
     * @throws KitechException
     * @author LeeYH
     * @since 2022.09.16.
     */
	public Document getSnapShotDoc(String linkurl){
		// 저장 경로 조회
    	Document snapDoc = null;
    	try {
			String xml = new String(Files.readAllBytes(Paths.get(linkurl)), StandardCharsets.UTF_8);
			AppLog.debug("\n ################## 스냅샷", xml);
			//System.out.println("\n ################## 스냅샷" + xml);
			
			snapDoc = this.convertStringToXMLDocument(xml);	
			
		} catch (IOException ex) {
			AppLog.error("스냅샷 파일 읽는 도중 오류 발생", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.001", ex);
		}
		
		return snapDoc;
	}
	
	/**
	 * String -> Document
	 * @param xmlString
	 * @return
	 */
	private Document convertStringToXMLDocument(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 스냡샷 파일을 읽어 Document 로 변환 후 content 하위의 HTML 부분만 문자열로 반환한다.
	 * 
	 * @param xmlUrl XML 경로명: 저장할 파일경로 및 파일명 (snapshotBase + "/2022/6/_C55202200123.snap")
	 * @param model xsl 파일과 바인딩 될 데이터 
	 * @return
	 */
	public String makeSnapshot(String xmlUrl, Document doc) {
		String result = null;

		AppLog.debug("\n makeSnapshot --------------- xmlUrl: " + xmlUrl);
		// 파일 처리
		try (FileOutputStream output = new FileOutputStream(new File(xmlUrl), false)){
	        // add XSLT in Transformer
	        Transformer transformer = TransformerFactory.newInstance().newTransformer();
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	        transformer.transform(new DOMSource(doc), new StreamResult(output));

	        // 확인용 로직
	        result = new String(Files.readAllBytes(Paths.get(xmlUrl)), StandardCharsets.UTF_8);
	        //AppLog.debug("\n--------------------makeSnapshot  result: ", result);
		} catch (Exception ex) {
			AppLog.error("스냅샷 파일 저장 중 오류 발생", ex);
			throw new KitechException( Exceptions.ERROR, Business.XOM, "message.xom.co.util.apr.003", ex);
		} 
		return result;
	}	

}
