/**
 * 
 */
package kr.re.kitech.biz.ass.eqip.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.inswave.elfw.exception.ElException;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.api.client.ZeusClient;
import kr.re.kitech.biz.api.server.vo.ApiBpmVo;
import kr.re.kitech.biz.apr.service.ApprCommonService;
import kr.re.kitech.biz.ass.eqip.dao.AssResEquipMgtDAO;
import kr.re.kitech.biz.ass.eqip.service.AssResEquipMgtService;
import kr.re.kitech.biz.ass.eqip.vo.AssEquipSrcVo;
import kr.re.kitech.biz.ass.eqip.vo.AssSearchVo;
import kr.re.kitech.biz.ass.eqip.vo.NtisRegNoVo;
import kr.re.kitech.biz.ass.eqip.vo.ResBgAcctmHisVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo;
import kr.re.kitech.biz.ass.eqip.vo.ResEquipLimitAmtVo;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;

/**  
 * @ClassSubJect 연구장비통합관리
 * @Class Name : AssResEquipMgtServiceImpl.java
 * @Description : 연구장비통합관리 ServiceImpl
 * @Modification Information  
 * @
 * @  수정일                  수정자                  수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2022/04/25   이영희                최초생성
 * 
 * @author LeeYh
 * @since 2022/05/10
 * @version 1.0
 * @see
 * 
 *  Copyright Inswave (C) by Sampler All right reserved. 
 */
@Service("assResEquipService")
public class AssResEquipMgtServiceImpl extends EgovAbstractServiceImpl implements AssResEquipMgtService {

	private static final String KEYS = "80f93f9d-b354-423a-bb8e-ba3866e84339";
	
	@Resource(name="assResEquipDAO")
	private AssResEquipMgtDAO equipDao;
	
	@Resource(name="zeusFindClient")
	private ZeusClient AssZeusClient;
	
	@Resource(name="apprCommonServiceImpl")
	private ApprCommonService apprCommonService;
	
	@Resource(name="generationServiceImpl")
	private GenerationService genService;
		
	
	/**
    * 제우스장비번호 검색(내부장비)
    * @param FinPopSearchVo
    * @return List<ResEquipFeeReqVo>
    * @author LeeYH
    */
	public List<NtisRegNoVo> selectNtisRegNoList(AssSearchVo vo) throws ElException{
		return equipDao.selectNtisRegNoList(vo);
	}
	
	/**
    * 제우스장비번호 검색(외부장비)
    * @param FinPopSearchVo
    * @return NtisRegNoVo
    * @author LeeYH
    */
	@Override
	public NtisRegNoVo selectNtisRegNo(AssSearchVo vo) throws ElException {
		StringBuffer url=new StringBuffer();
		url.append("https://api.zeus.go.kr/api/eq/equips/");
		url.append(KEYS);
		url.append("?keywords="+ vo.getEquip_no());
		
//		HttpGet get = new HttpGet(url.toString());
//		HttpClient httpClient = HttpClients.createDefault();
//		HttpResponse response = httpClient.execute(get);
//		HttpEntity entity = response.getEntity();

		NtisRegNoVo retVo = new NtisRegNoVo();
//		try{	
//			if(entity != null){
//				StatusLine statusLine = response.getStatusLine();
//				if (statusLine.getStatusCode() >= 300) {
//			        throw new HttpResponseException( statusLine.getStatusCode(), statusLine.getReasonPhrase());
//			    }
//				
//				String temp = EntityUtils.toString(entity, "utf8");	
//				System.out.println("-------------------- temp : " + temp);
//				Document rtnDoc = KitechJsonUtil.ntisJsonToXML(temp);
//				@SuppressWarnings("unchecked")
//				ArrayList<Document> tmpList = XMLUtil.getArrayList(rtnDoc, "pageList");		
//				//result = XMLUtil.toXML(tmpList);
//				if(tmpList.size() > 0){
//					Document tmpDoc = tmpList.get(0);
//					
//					retVo.set("equip_no", XMLUtil.getString(tmpDoc,"equipNo"));
//					retVo.set("kor_nm", XMLUtil.getString(tmpDoc,"korNm"));
//					retVo.set("eng_nm", XMLUtil.getString(tmpDoc,"engNm"));
//					retVo.set("organ_nm", XMLUtil.getString(tmpDoc,"organNm"));
//					retVo.set("director_nms", XMLUtil.getString(tmpDoc,"directorNms"));
//				}else{
//					Exception e = new Exception("ZEUS장비등록번호가 조회되지 않습니다. 확인바랍니다.");
//					throw KitechWarningUtil.makeWarning(Warning.ERROR, e, doc);
//				}
//	
//			}else{
//				throw new ClientProtocolException("Response contains no content");
//			}			
//		}catch(IOException e){
//			System.out.println("외부장비 검색 error : " + e.getMessage());
//		}finally{
//			
//		}

		return retVo;
	}
	
	/**
    * 연구관리통합관리비 한도금액 업데이트
    * @param ApiBpmVo
    * @author JeonJW
    */
	@Override
	public void updateResEquipFeeMgt(ApiBpmVo vo) {
		equipDao.updateResEquipFeeMgt(vo);
	}

	/**
    * 연구관리통합관리비 한도금액 조회
    * @param ApiBpmVo
    * @return ResEquipFeeReqVo
    * @author JeonJW
    */
	@Override
	public ResEquipFeeReqVo selectResEquipFeeMgt(ApiBpmVo vo){
		return equipDao.selectResEquipFeeMgt(vo);
	}
	
	/**
    * 연구관리통합관리비 기타예실 한도금액 추가
    * @param ResEquipFeeReqVo
    * @author JeonJW
    */
	@Override
	public void updateBblBugtActRsltEtc(ResEquipFeeReqVo vo) {
		equipDao.updateBblBugtActRsltEtc(vo);
	}
	
	/**
    * 연구장비통합관리비 한도금액 조회
    * @param ResEquipLimitAmtVo
    * @return List<ResEquipLimitAmtVo>
    * @author LeeYH
    * @since 2022.12.22.
    */
	@Override
	public List<ResEquipLimitAmtVo> selectResEquipLimitAmt(ResEquipLimitAmtVo vo) throws KitechException {
		String mngmtUnit = vo.getIntgr_mngmt_unit();
		String[] unitArr = mngmtUnit.split(",");
		String relatNo = "";
		List<ResEquipLimitAmtVo> retList = new ArrayList<>();

		String accntNo = "";
		for(int i=0; i<unitArr.length; i++){
			vo.setIntgr_mngmt_unit(unitArr[i]);
			if (StringUtils.equals(unitArr[i], "RDK002")) {
				ResEquipLimitAmtVo srcDoc = equipDao.selectResbgacctm(vo);
				if (srcDoc == null || StringUtils.equals(srcDoc.getAccnt_no(), "")) {
					throw new KitechException(Exceptions.ERROR, Business.ASS, "message.alert.res.ass.0001");//공동활용시설 통합계정번호가 존재하지 않습니다. 관리자에게 문의바랍니다.
				}
				accntNo = srcDoc.getAccnt_no();
				relatNo = accntNo.substring(2, 8);
			} else if (StringUtils.equals(unitArr[i], "RDK001")) { // 연구책임자
				accntNo = "FF210001";
				relatNo = vo.getSyspayno().substring(2,8);
			} else if (StringUtils.equals(unitArr[i], "RDK003")) { // 연구기관
				accntNo = "FF210002";
				relatNo = "210002";
			}
			vo.setAccnt_no(accntNo);
			vo.setRelat_no(relatNo);
			retList.add(equipDao.selectResEquipLimtAmt(vo));
		}

		return retList;
	}
	
	/**
    * 통합관리계정 변경이력 목록 조회
    * @param AssEquipSrcVo
	* @return List<ResBgAcctmHisVo>
    * @throws Exception
	* @author LeeYoungHee
	* @since 2023.09.20.
    */
	public List<ResBgAcctmHisVo> selectResBgAcctmHis(AssEquipSrcVo vo) throws KitechException{
		return equipDao.selectResBgAcctmHis(vo);
	}
	
	/**
    * 통합관리계정 변경이력 다건 저장
    * @param List<ResBgAcctmHisVo>
    * @throws Exception
	* @author LeeYoungHee
	* @since 2023.09.21.
    */
	public void saveAssIntgrAccntInfo(List<ResBgAcctmHisVo> hisList) throws KitechException{
		for(ResBgAcctmHisVo hisVo : hisList){
			this.saveResBgAcctmHis(hisVo, false);
		}
	}
	
	/**
    * 통합관리계정 변경이력 단건 저장
    * @param List<ResBgAcctmHisVo>
    * @throws Exception
	* @author LeeYoungHee
	* @since 2023.09.21.
    */
	public void saveResBgAcctmHis(ResBgAcctmHisVo vo, boolean finYn) throws KitechException{
		if("FF21".equals(vo.getAccnt_no().substring(0, 4))){
			if("FF210001".equals(vo.getAccnt_no())){
				vo.setIntgr_mngmt_unit("RDK001");
			}else if("FF210002".equals(vo.getAccnt_no())){
				vo.setIntgr_mngmt_unit("RDK003");
			}else{
				vo.setIntgr_mngmt_unit("RDK002");
			}
		}
		
		equipDao.mergeResBgAcctmHis(vo);
		
		// 통합관리계정 변경이력에서 수정시 계정마스터 수정
		if(!finYn && !"FF210001".equals(vo.getAccnt_no())){
			equipDao.updateResBgAcctmPsn(vo);
		}
	}
}
