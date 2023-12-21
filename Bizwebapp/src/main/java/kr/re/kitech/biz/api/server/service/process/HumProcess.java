package kr.re.kitech.biz.api.server.service.process;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inswave.elfw.exception.ElException;

import kr.re.kitech.biz.api.server.dao.HumProcessDAO;
import kr.re.kitech.biz.api.server.enums.AprProcess;
import kr.re.kitech.biz.api.server.service.BpmPostProcess;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.enums.AprState;
import kr.re.kitech.biz.hum.apy.vo.HumApyPruseVo;
import kr.re.kitech.biz.xom.base.enums.Attaches;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Messages;
import kr.re.kitech.biz.xom.base.enums.MsgKeys;
import kr.re.kitech.biz.xom.core.model.BizMsg;
import kr.re.kitech.biz.xom.core.util.MessageSender;
import kr.re.kitech.biz.xom.core.vo.MsgTemplateVo;

/**
 * @ClassSubJect 인사관리 BPM 사후처리
 * @Class Name HumProcess.java
 * @Description 인사관리 BPM 사후처리
 * @Modification Information  
 * @
 * @    수정일               수정자             수정내용
 * @ -----------   ---------   ---------
 * @ 2022/08/01      전재우             최초생성
 * 
 * @author JeonJW
 * @since 2022/08/01
 * @version 1.0
 * @see
 * 
 */
 @Component
public class HumProcess implements BpmPostProcess {
	@Resource(name="humProcessDAO")
	private HumProcessDAO humProcessDAO;
	
	@Autowired
	private MessageSender messageSender;
	
	/**
    * 인사관리 BPM사후 처리
    * @param ApiBpmVo
    * @return ApiBpmVo
    * @author JeonJW
	 * @since 2022.08.01.
    */
	@Override
	public ApiBpmVo doExecute(ApiBpmVo vo){	
		String reqNoSub = vo.getReqNo().substring(0, 3);
		String aprState = vo.getAprState();
		
		if(AprState.COMPLATE.getCode().equals(aprState)){ // 결재완료
			if("H04".equals(reqNoSub)){ // H04 아르바이트활용신청등록
				this.createPlanHumApyArCost(vo);
			}else if("H22".equals(reqNoSub)){ // H22 EIP정보변경신청서
				this.saveHumApyInfoChg(vo);
			}else if("H3A".equals(reqNoSub)){ // H3A 지도교수(활용책임자)변경신청
				this.approvalhumApyPruseHandle(vo);
			}
		}else if(AprState.WAIT_REJECT.getCode().equals(aprState)){ // 결재반려
			if("H09".equals(reqNoSub)){	// H09 휴복직신청등록
				this.sendSms(vo);
			}
		}
		
		vo.setSuccess(true);
		vo.setMessage("정상처리");	
		
		return vo;
	}

	/**
    * 아르바이트활용신청등록 (H04)
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.08.01.
    */
	private void createPlanHumApyArCost(ApiBpmVo vo) throws ElException{
		int reqDegre = 0;
		List<Map<String,String>> selectHumApyPtInfoList = humProcessDAO.selectHumApyPtInfo(vo.getReqNo());
		for(Map<String,String> selectHumApyPtInfoMap : selectHumApyPtInfoList){
			List<Map<String,String>> selectXomdtmastList = humProcessDAO.selectXomdtmast(selectHumApyPtInfoMap);
			for(Map<String,String> selectXomdtmastMap : selectXomdtmastList){
				reqDegre++;
				selectHumApyPtInfoMap.put("req_degre", Integer.toString(reqDegre));
				selectHumApyPtInfoMap.put("use_st_ymd", selectXomdtmastMap.get("use_st_ymd"));
				selectHumApyPtInfoMap.put("use_ed_ymd", selectXomdtmastMap.get("use_ed_ymd"));
				selectHumApyPtInfoMap.put("pay_yrmon", selectXomdtmastMap.get("use_st_ymd").substring(0, 6));
				selectHumApyPtInfoMap.put("job_days", String.valueOf(selectXomdtmastMap.get("job_days")));
				selectHumApyPtInfoMap.put("regst_syspayno", vo.getSyspayno());
				humProcessDAO.insertHumApyArCost(selectHumApyPtInfoMap);
			}
		}
	}
	
	/**
    * 지도교수(활용책임자)변경신청 (H3A)
    * @param ApiBpmVo
    * @author JeonJW
    * @since 2022.08.02.
    */
	private void approvalhumApyPruseHandle(ApiBpmVo vo) throws ElException{
		List<HumApyPruseVo> humPruseList = humProcessDAO.selectHumPruse(vo.getReqNo());
		
		for(HumApyPruseVo humPruseVo : humPruseList){
			humPruseVo.setRegst_syspayno("SYSTEM");
			humPruseVo.setUpdt_syspayno("SYSTEM");
			int cnt = humProcessDAO.selectHumPruseCnt(humPruseVo);
			if(cnt == 0){
				humProcessDAO.insertHumPruse(humPruseVo);
			} else {
				humProcessDAO.updateHumPruse(humPruseVo);
			}
			
			if("M".equals(humPruseVo.getRespn_clsf())){
				humProcessDAO.updateHumBasic(humPruseVo);
			}
		}
		
		vo.setUpdt_syspayno("SYSTEM");
		humProcessDAO.updateHumApyPruserEspnInfo(vo);
	}
	
	/**
    * EIP정보변경신청서 (H22)
    * @param ApiBpmVo
    * @author JeonJW
	* @since 2022.08.03.
    */
	private void saveHumApyInfoChg(ApiBpmVo vo){
		// \was\IMIS_FILES\web_folder\bizimages\hum\photo\attach\테스트_2020-06-25(104306).jpg (지정된 경로를 찾을 수 없습니다)
		// 로컬에서 테스트 함에 따라 파일을 찾을수 없는것 같음.
		List<Map<String,String>> humApyInfoChgList = humProcessDAO.selectHumApyInfoChg(vo.getReqNo());
		
		for(Map<String,String> humApyInfoChgMap : humApyInfoChgList){
			String syspayno = humApyInfoChgMap.get("syspayno");
			String path = Attaches.BIZ_STORAGE_ROOT.getCode() + "/web_folder";
			String imageOrgUrl = humApyInfoChgMap.get("image_attach_file_no");
			String imageBkUrl = humApyInfoChgMap.get("image_bf_attach_file_no");
			String signOrgUrl = humApyInfoChgMap.get("sign_attach_file_no");
			String signBkUrl = humApyInfoChgMap.get("sign_bf_attach_file_no");
			try{
				if (!"".equals(imageOrgUrl)) {
					File imgFile = new File(path + imageBkUrl);
					if (imgFile.exists()) {
						imageBkUrl = "/photoimages/bk/" + syspayno + "/" + UUID.randomUUID() + ".jpg";
						File imgDir = new File(path + "/photoimages/bk/" + syspayno);
						if (!imgDir.isDirectory())
							imgDir.mkdirs();
						FileInputStream inputBkStream = new FileInputStream(imgFile);
						FileOutputStream outputBkStream = new FileOutputStream(path + imageBkUrl);
						FileChannel fcinBk = inputBkStream.getChannel();
						FileChannel fcoutBk = outputBkStream.getChannel();
						long size = fcinBk.size();
						fcinBk.transferTo(0, size, fcoutBk);
						fcoutBk.close();
						fcinBk.close();
						outputBkStream.close();
						inputBkStream.close();
						humApyInfoChgMap.put("image_bf_attach_file_no", imageBkUrl);
					}
					File orgImgFile = new File(path + imageOrgUrl);
					FileInputStream inputStream = new FileInputStream(orgImgFile);
					FileOutputStream outputStream = new FileOutputStream(path + "/photoimages/" + syspayno + ".jpg");
					FileChannel fcin = inputStream.getChannel();
					FileChannel fcout = outputStream.getChannel();
					long size = fcin.size();
					fcin.transferTo(0, size, fcout);
					fcout.close();
					fcin.close();
					outputStream.close();
					inputStream.close();
					if (orgImgFile.exists())
						orgImgFile.delete();
					humApyInfoChgMap.put("image_attach_file_no", "/photoimages/" + syspayno + ".jpg");
				}
		
				if (!"".equals(signOrgUrl)) {
					File signBkFile = new File(path + signBkUrl);
					if (signBkFile.exists()) {
						File signDir = new File(path + "/sign/bk/" + syspayno);
						if (!signDir.isDirectory())
							signDir.mkdirs();
						signBkUrl = "/sign/bk/" + syspayno + "/" + UUID.randomUUID() + ".jpg";
						FileInputStream inputBkStream = new FileInputStream(signBkFile);
						FileOutputStream outputBkStream = new FileOutputStream(path + signBkUrl);
						FileChannel fcinBk = inputBkStream.getChannel();
						FileChannel fcoutBk = outputBkStream.getChannel();
						long size = fcinBk.size();
						fcinBk.transferTo(0, size, fcoutBk);
						fcoutBk.close();
						fcinBk.close();
						outputBkStream.close();
						inputBkStream.close();
						humApyInfoChgMap.put("sign_bf_attach_file_no", signBkUrl);
					}
					File orgSignFile = new File(path + signOrgUrl);
					FileInputStream inputStream = new FileInputStream(orgSignFile);
					FileOutputStream outputStream = new FileOutputStream(path + "/sign/" + syspayno + ".gif");
					FileChannel fcin = inputStream.getChannel();
					FileChannel fcout = outputStream.getChannel();
					long size = fcin.size();
					fcin.transferTo(0, size, fcout);
					fcout.close();
					fcin.close();
					outputStream.close();
					inputStream.close();
					if (orgSignFile.exists())
						orgSignFile.delete();
					humApyInfoChgMap.put("sign_attach_file_no", "/sign/" + syspayno + ".gif");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			humApyInfoChgMap.put("req_no", vo.getReqNo());
			humProcessDAO.updateHumApyInfoChgImg(humApyInfoChgMap);
		}
	}
	
	/**
    * 휴복직신청 반려 SMS발송 (H09)
    * @param ApiBpmVo
    * @author JeonJW
	* @since 2022.08.03.
    */
	private void sendSms(ApiBpmVo vo) {
		Map<String,String> humMobileMap = humProcessDAO.selectHumMobile(vo.getReqNo());		
		
		// 발신자 맵
		Map<String,String> sender = new HashMap<>();
		sender.put( MsgKeys.SEND_NAME.getCode(), "한국생산기술연구원");
		sender.put( MsgKeys.SEND_PHONE.getCode(), "041-589-8114");
		sender.put( MsgKeys.SEND_SYSPAYNO.getCode(), "00000000");		
		
		
		MsgTemplateVo templateVar = new MsgTemplateVo();
		// 수신자
		templateVar.setDestName(humMobileMap.get("nm"));
		templateVar.setDestPhone(humMobileMap.get("mobile"));
		templateVar.setDestSyspayno(humMobileMap.get("syspayno"));
		
		// TODO TEST
//		templateVar.setDestName("이영희");
//		templateVar.setDestPhone("");
//		templateVar.setDestSyspayno("99999978");
		// 제목
		templateVar.setSubject("알림내용");
		
		// 내용
		Map<String, String> contentVar = new HashMap<>();
		contentVar.put("알림내용", "[안내] 전자결재 알림" + System.lineSeparator() + System.lineSeparator() + "귀하께서 신청하신 휴복직 신청 건이 반려되었으니, 보완 후 재상신 부탁드립니다. " + System.lineSeparator()
				+ "(*반려사유는 EIP 전자결재의견 확인 요망)" + System.lineSeparator() + System.lineSeparator() + "감사합니다.");
		templateVar.setContentVar(contentVar);		
		
		List<MsgTemplateVo>templateVars = new ArrayList<>();
		templateVars.add(templateVar);		
		
		// 메시지 발송
		// Incorrect string value: '\xB0' for column 'DEST_NAME' at row 1
		// 인코딩 오류로 인해 메시지 발송 테스트에 오류가 확인됨
		messageSender.sendMessage(
			new BizMsg.Builder(vo.getSyspayno(), Business.HUM, Messages.LMS_MSG)
				.templateCode("bizp_2022051709405314053261313")
				.templateVars(templateVars)
				.sender(sender)				
				.businessYn("Y")
				.logging(true)		
				.build()
		);		
	}
	
	/* (non-Javadoc)
	 * @see kr.re.kitech.biz.api.server.service.BpmPostProcess#getBusiness()
	 */
	@Override
	public AprProcess getAprProcess() {
		return AprProcess.HUM;
	}
}
