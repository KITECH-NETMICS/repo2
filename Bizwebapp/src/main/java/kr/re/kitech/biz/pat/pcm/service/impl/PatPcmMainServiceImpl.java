package kr.re.kitech.biz.pat.pcm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.pat.pcm.dao.PatPcmMainDAO;
import kr.re.kitech.biz.pat.pcm.service.PatPcmMainService;
import kr.re.kitech.biz.pat.pcm.vo.PatPcmMainVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.util.KitechContextUtil;


/**
 * @ClassSubJect 
 * @ClassName : PatPcmMainServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.09.04.      이대훈    최초생성
 * 
 * @author 
 * @since 2023.09.04.
 * @version 1.0
 * @see
 * 
 */
@Service("patPcmMainServiceImpl")
public class PatPcmMainServiceImpl  extends EgovAbstractServiceImpl implements PatPcmMainService {
  @Resource(name="patPcmMainDAO")
  private PatPcmMainDAO pcmDAO;
    
  /**
   * 출원업무공통탭 파라미터 조회
   * 
   * @author 
   * @param PatPcmMainVo
   * @return PatPcmMainVo
   * @throws KitechException
   * @since 2023.09.04.   
   */
  @Override
  public PatPcmMainVo selectParam(PatPcmMainVo vo) throws KitechException {
  
	PatPcmMainVo retVo = new PatPcmMainVo();

    /*****************************************
     * 01. 설정부 시작
     *****************************************/
    String queryId = "";
    String refKey = "";
    String newRefKey = "";

    String queryId01 = "selectPatPcmMainSS01"; // 업무공통탭 선행기술조사 파라미터 조회
    String queryId02 = "selectPatPcmMainSS02"; // 업무공통탭 명세서 파라미터 조회
    String queryId03 = "selectPatPcmMainSS03"; // 업무공통탭 출원 파라미터 조회
    String queryId04 = "selectPatPcmMainSS04"; // 업무공통탭 심사청구 파라미터 조회
    String queryId05 = "selectPatPcmMainSS05"; // 업무공통탭 우선심사청구 파라미터 조회
    String queryId06 = "selectPatPcmMainSS06"; // 업무공통탭 OA 파라미터 조회
    String queryId07 = "selectPatPcmMainSS07"; // 업무공통탭 등록 파라미터 조회
    String queryId08 = "selectPatPcmMainSS08"; // 업무공통탭 IDS제출 파라미터 조회
    String queryId09 = "selectPatPcmMainSS09"; // 업무공통탭 번역제출 파라미터 조회
    String queryId10 = "selectPatPcmMainSS10"; // 업무공통탭 기타의뢰 파라미터 조회

    if (vo.getTodo_auth().equals("1")) {
        queryId07 = "selectPatPcmMainSS27"; // 업무공통탭 등록(관리자) 파라미터 조회
    }

    if (vo.getPage_gbn().equals("end")) {
        queryId01 = "selectPatPcmMainSS11"; // 업무공통탭 선행기술조사 파라미터 조회 진행함, 완료함
        queryId02 = "selectPatPcmMainSS12"; // 업무공통탭 명세서 파라미터 조회 진행함, 완료함
        queryId03 = "selectPatPcmMainSS13"; // 업무공통탭 출원 파라미터 조회 진행함, 완료함
        queryId04 = "selectPatPcmMainSS14"; // 업무공통탭 심사청구 파라미터 조회 진행함, 완료함
        queryId05 = "selectPatPcmMainSS15"; // 업무공통탭 우선심사청구 파라미터 조회 진행함, 완료함
        queryId06 = "selectPatPcmMainSS16"; // 업무공통탭 OA 파라미터 조회 진행함, 완료함
        queryId07 = "selectPatPcmMainSS17"; // 업무공통탭 등록 파라미터 조회 진행함, 완료함
        queryId08 = "selectPatPcmMainSS18"; // 업무공통탭 IDS제출 파라미터 조회 진행함, 완료함
        queryId09 = "selectPatPcmMainSS19"; // 업무공통탭 번역제출 파라미터 조회 진행함, 완료함
        queryId10 = "selectPatPcmMainSS20";
    }


    refKey = vo.getRef_key();

    if(refKey.substring(0, 3).equalsIgnoreCase("I05")) {
      vo.setPrity_eval_req_no(refKey);
      PatPcmMainVo retVo1 = pcmDAO.selectPatPcmMainSS21(vo);
      newRefKey = retVo1.getPrity_demnd_id();
      refKey = newRefKey;
      vo.setRef_key(refKey);
    }
    else if(refKey.substring(0, 3).equalsIgnoreCase("I06")) {
      vo.setDp_req_no(refKey);
      PatPcmMainVo retVo2 = pcmDAO.selectPatPcmMainSS23(vo);
      newRefKey = retVo2.getApp_id();
      refKey = newRefKey;
      vo.setRef_key(refKey);
    }


    // I11 선행기술조사, I13 명세서 작성, I14 출원, I15 심사청구, I16 우선심사청구, I18 OA대응, I20 등록
    // I31 IDS제출, I32 번역제출, I34 기타의뢰
    queryId = determineQueryId(refKey, queryId01, queryId02, queryId03, queryId04, queryId05, queryId06, queryId07, queryId08, queryId09, queryId10);
    /*
    switch (refKey.substring(0, 3)) {
        case "I11":
            queryId = queryId01;
            break;
        case "I13":
            queryId = queryId02;
            break;
        case "I14":
            queryId = queryId03;
            break;
        case "I15":
            queryId = queryId04;
            break;
        case "I16":
            queryId = queryId05;
            break;
        case "I18":
            queryId = queryId06;
            break;
        case "I20":
            queryId = queryId07;
            break;
        case "I31":
            queryId = queryId08;
            break;
        case "I32":
            queryId = queryId09;
            break;
        case "I34":
            queryId = queryId10;
            break;
    }
     */

    String refKeySub = refKey.substring(0, 3);
    AppLog.debug("refKeySub" + refKeySub);
    if( "R26".equals(refKeySub) ){
    	PatPcmMainVo param = new PatPcmMainVo();
    	param.setMain_key(refKey);
    	List<PatPcmMainVo> mainList = pcmDAO.selectPatTodoMainKey(param);
    	int targetIndex = -1;
		// mainList에서 데이터가 있는지 확인하고, 있으면 currep 값을 세미콜론으로 분리한 후, 현재 유저 ID와 비교하여 인덱스를 반환합니다.
		if (!mainList.isEmpty()) {
			AppLog.debug("mainList Size : " + mainList.size());
		    String currep = mainList.get(0).getCurrep();
		    String[] currepArray = currep.split(";");
		    AppLog.debug("currepArray Length : " + currepArray.length);
		    
		    String userId = KitechContextUtil.getUserId();
		    for (int i = 0; i < currepArray.length; i++) {
		    	AppLog.debug("currepArray : " + currepArray[i]);
		        if (currepArray[i].equals(userId)) {
		            targetIndex = i;
		            AppLog.debug("targetIndex : " + targetIndex);
		        }
		    }
		}
		if(targetIndex > -1){
			AppLog.debug("Work_id : " + mainList.get(targetIndex).getWork_id());
			queryId = determineQueryId(mainList.get(targetIndex).getWork_id(), queryId01, queryId02, queryId03, queryId04, queryId05, queryId06, queryId07, queryId08, queryId09, queryId10);
			vo.setRef_key(mainList.get(targetIndex).getWork_id());
		}
    }
    
    PatPcmMainVo retVo3 = new PatPcmMainVo(); 
    
    if (queryId.isEmpty()) {
        PatPcmMainVo param = new PatPcmMainVo();
        param.setReq_no(refKey);        
        retVo3 = pcmDAO.selectPatTodoWorkId(param);
        queryId = determineQueryId(retVo3.getWork_id(), queryId01, queryId02, queryId03, queryId04, queryId05, queryId06, queryId07, queryId08, queryId09, queryId10);
        vo.setRef_key(retVo3.getWork_id());
    }
    
    AppLog.debug("쿼리 아이디 : " + queryId);
    AppLog.debug("쿼리  파라미터 : " + vo);
    
    retVo = pcmDAO.selectPatPcmMain("kr.re.kitech.biz.pat.pcm." + queryId, vo);
    if(retVo != null){
    	retVo.setWork_id(retVo3.getWork_id());    
    }else{
    	retVo = new PatPcmMainVo();
    }
    
    return retVo; 
    //return methodMap.get(queryId).apply(vo);
  }
  
  private String determineQueryId(String refKey, String...queryIds) {
    switch (refKey.substring(0, 3)) {
        case "I11":
            return queryIds[0];
        case "I13":
            return queryIds[1];
        case "I14":
            return queryIds[2];
        case "I15":
        	return queryIds[3];
        case "I16":
        	return queryIds[4];
        case "I18":
        	return queryIds[5];
        case "I20":
        	return queryIds[6];
        case "I31":
        	return queryIds[7];
        case "I32":
        	return queryIds[8];
        case "I34":
        	return queryIds[9];
        default:
            return "";
    }
  }

}
