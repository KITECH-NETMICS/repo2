package kr.re.kitech.biz.sup.tec.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.ZeusClient;
import kr.re.kitech.biz.sup.tec.dao.SptZeusResvDAO;
import kr.re.kitech.biz.sup.tec.service.SptZeusResvService;
import kr.re.kitech.biz.sup.tec.vo.SptZeusResvDtlVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.base.util.pks.DateUtil;

/**  
 * @ClassSubJect 기술지원 제우스 연계 처리
 * @Class Name SptJeusResvServiceImpl.java
 * @Description 기술지원 제우스 연계 처리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023/06/21   이영희             최초생성
 * 
 * @author 이영희
 * @since 2023/06/21
 * @version 1
 * @see
 * 
 */
@Service("sptZeusResvService")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SptZeusResvServiceImpl extends EgovAbstractServiceImpl implements SptZeusResvService {
	@Resource(name="sptZeusResvDAO")
	private SptZeusResvDAO dao;
	
	@Resource(name="zeusApprvClient")
	private ZeusClient zeusClient;
	
	
	
	/**
     * 제우스 장비예약 상세 정보 확인
     * @param String resvNo
     * @return SptZeusResvDtlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.21.
     */
	public SptZeusResvDtlVo selectZeusResvMng(String resvNo) throws KitechException{
		return dao.selectSptZeusResvDtl(resvNo);
	}
	
	public void sendResrvData(SptZeusResvDtlVo vo) throws Exception{
		String result = this.postReserve(vo);
		
		JSONObject respenseObject = new JSONObject(result);
		if(result.contains("errors")){
			JSONObject json = respenseObject.getJSONArray("errors").getJSONObject(0);
			if("E0012".equals(json.get("code"))){ // 해당 장비가 승인(완료)되었습니다.
				// 제우스 예약정보 동기화
				//this.transReserve(vo);
			}
		}
	}
	
	/**
     * 제우스에 상태 및 데이타 전송 로직(상태 : 이용승인, 분석완료, 결제완료, 이용취소)
     * @param SptZeusResvDtlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.21.
     */
     private String postReserve(SptZeusResvDtlVo vo) throws Exception{
		Map<String, Object> reserveInfo = new HashMap<String, Object>();
		
		// 이용승인
		if("approve".equals(vo.getPostreserveflag())){
			reserveInfo.put("useStartDt", DateUtil.formatDate(vo.getResvstartdt(), "-"));
			reserveInfo.put("useStartHour", vo.getResvstarthour());
			reserveInfo.put("useStartMin", vo.getResvstartmin());
			reserveInfo.put("useEndDt", DateUtil.formatDate(vo.getResvenddt(), "-"));
			reserveInfo.put("useEndHour", vo.getResvendhour());
			reserveInfo.put("useEndMin", vo.getResvendmin());
			
		// 분석완료
		}else if("success".equals(vo.getPostreserveflag())){
			reserveInfo.put("resvFinalStDt", DateUtil.formatDate(vo.getResvstartdt(), "-"));
			reserveInfo.put("resvFinalStHour", vo.getResvstarthour());
			reserveInfo.put("resvFinalStMin", vo.getResvstartmin());
			reserveInfo.put("resvFinalEdDt", DateUtil.formatDate(vo.getResvenddt(), "-"));
			reserveInfo.put("resvFinalEdHour", vo.getResvendhour());
			reserveInfo.put("resvFinalEdMin", vo.getResvendmin());
			reserveInfo.put("resvFinalPrice", vo.getResvfinalprice());
			
		// 결제완료
		}else if("payment".equals(vo.getPostreserveflag())){
		
		// 이용취소
		}else if("cancel".equals(vo.getPostreserveflag())){
			reserveInfo.put("resvFinalPrice", vo.getCancelreason());
		}
		
		String path = "/api/equip/manager/" + vo.getResvno() + "/" + vo.getPostreserveflag() + "/";
		String result = zeusClient.sendRequestMnt(path, reserveInfo);
		
		return result;
	}
	
	/**
     * 제우스 예약정보 동기화
     * @param SptZeusResvDtlVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.06.22.
     */
	public void transReserve(SptZeusResvDtlVo vo) throws Exception{
		// 제우스에 결제완료 보내기
	}
}
