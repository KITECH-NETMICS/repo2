package kr.re.kitech.biz.lpl.lcp.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import kr.re.kitech.biz.apr.service.ApprFuncService;
import kr.re.kitech.biz.com.service.GenerationService;
import kr.re.kitech.biz.lpl.lcp.dao.LcpAgncyMstDAO;
import kr.re.kitech.biz.lpl.lcp.service.LcpAgncyMstService;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstFormVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstListVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpAgncyMstVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpEventTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.LcpMouDomTabVo;
import kr.re.kitech.biz.lpl.lcp.vo.LosVipTabVo;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.dao.AttachDAO;


/**
 * @ClassSubJect 
 * @ClassName : LcpAgncyMstServiceImpl.java
 * @Description 
 * @Modification :   
 *     수정일        수정자     수정내용
 *  -----------   ---------   ---------
 *  2023.11.21.      author    최초생성
 * 
 * @author 
 * @since 2023.11.21.
 * @version 1.0
 * @see
 * 
 */
@Service("lcpAgncyMstServiceImpl")
public class LcpAgncyMstServiceImpl extends EgovAbstractServiceImpl implements LcpAgncyMstService {
  @Resource(name="lcpAgncyMstDAO")
  private LcpAgncyMstDAO lcpDAO;

  @Resource(name="attachDAO")
  private AttachDAO attachDAO;

  @Resource(name="apprFuncServiceImpl")
  private ApprFuncService apprFuncService;

  @Resource(name="generationServiceImpl")
  private GenerationService genService;
    
  /**
   * 다건 조회
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return List<LcpAgncyMstVo>
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public List<LcpAgncyMstVo> selectList01(LcpAgncyMstVo vo) throws KitechException {
    List<LcpAgncyMstVo> list = lcpDAO.selectList01(vo);
/*    int i = 0;
    for (LcpAgncyMstVo resultVo : list) {
    	list.get(i).set기관명(resultVo.get한글기관명()+"&lt;b/&gt;&nbsp;&lt;font color=#4682b4&gt;"+resultVo.get영문기관명()+"&lt;/font&gt;");
    	i++;
    }  */  	
    return list;
  }

  /**
   * 대외협력조회 기관헤더조회 및 목록별 건수조회
   * 
   * @author 
   * @param LcpAgncyMstFormVo
   * @return LcpAgncyMstFormVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public LcpAgncyMstFormVo selectLcpAgncyMstForm(LcpAgncyMstFormVo vo) throws KitechException {
    LcpAgncyMstFormVo resultVO = lcpDAO.selectLcpAgncyMstForm(vo);			
      return resultVO;
  }
  
  /**
   * 탭 목록 조회
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return LcpAgncyMstListVo
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
  public LcpAgncyMstListVo selectTabList(LcpAgncyMstVo vo) throws KitechException {
     LcpAgncyMstListVo list = new LcpAgncyMstListVo();
     String krcharNm  = "";
     String visitPsn = "";
     String tabFlag = vo.getTab_type();
     String[] agncyPlus = new String[99];
     String[] visitPsnPlus = new String[99];
     List<LcpMouDomTabVo> mouVoList = null;
     List<LosVipTabVo> vipVoList = null;
     List<LcpEventTabVo> eveVoList = null;
     int totalCount = 0;
     boolean whileFlag = false; 
     int reqCount = 0;
	 if ("Mou".equals(tabFlag)) { // 협약
	     mouVoList = lcpDAO.selectLcpMouDomTab(vo);
	     totalCount = mouVoList.size();
	    
	     List<LcpMouDomTabVo> toRemove = new ArrayList<>();
	
	     for (int i = 0; i < totalCount - 1; i++) {
	         String ymd = mouVoList.get(i).getMou_contrct_ymd();
	         String subj = mouVoList.get(i).getMou_subj();
	
	         for (int j = i + 1; j < totalCount; j++) {
	             String ymd2 = mouVoList.get(j).getMou_contrct_ymd();
	             String subj2 = mouVoList.get(j).getMou_subj();
	
	             if (ymd.equals(ymd2) && subj.equals(subj2)) {
	                 agncyPlus[reqCount] = mouVoList.get(i).getKrchar_agncy_nm();
	                 agncyPlus[++reqCount] = mouVoList.get(j).getKrchar_agncy_nm();
	                 mouVoList.get(i).setAgncy_nm("delete");
	                 break;
	             }
	         }
	     }
	     // 중복된 항목을 toRemove 리스트에 추가
	     for (LcpMouDomTabVo mouVo : mouVoList) {
	         if ("delete".equals(mouVo.getAgncy_nm())) {
	             toRemove.add(mouVo);
	         }
	     }
	     // 중복된 항목 제거
	     mouVoList.removeAll(toRemove);	
	     list.setLcpMouDomTabVoList(mouVoList);
	 } else if ("Res".equals(tabFlag)) { // 공동연구
    	 list.setResinpMastTabVoList(lcpDAO.selectResinpMastTab(vo));
     } else if ("Trip".equals(tabFlag)) { // 출장
    	 list.setCtrOverTabVoList(lcpDAO.selectCtrOverTab(vo));
     } else if ("Vip".equals(tabFlag)) { //귀빈접견
    	 vipVoList = lcpDAO.selectLosVipTab(vo);
    	 totalCount = vipVoList.size();

		 for (int i = 0; i < totalCount; i++) {    	 
			 String reqNo = vipVoList.get(i).getAudenc_no();
			 if ( i+1 >= totalCount) {
				 krcharNm = vipVoList.get(i).getCmpy_nm_krchar();
				 visitPsn = vipVoList.get(i).getReprs_psn_nm();
				 vipVoList.get(i).setReprs_psn_nm(visitPsn);
				 vipVoList.get(i).setCmpy_nm_krchar(krcharNm);
				 break;   		 
			 }
			 String reqNo2 = vipVoList.get(i+1).getAudenc_no();
			 
			 while (reqNo.equals(reqNo2)) {
				 agncyPlus[reqCount] = vipVoList.get(i).getCmpy_nm_krchar();
				 visitPsnPlus[reqCount] = vipVoList.get(i).getReprs_psn_nm();
				 agncyPlus[++reqCount] = vipVoList.get(i).getCmpy_nm_krchar(); 
				 visitPsnPlus[reqCount] = vipVoList.get(i).getReprs_psn_nm();
				 vipVoList.get(i).setCmpy_nm_krchar("delete");
				 vipVoList.set(i, vipVoList.get(++i));
				 if ( i >= totalCount || i+1 >= totalCount) {
					 whileFlag = true;
					 break;
				 }
				 reqNo2 = vipVoList.get(i+1).getAudenc_no();
				 whileFlag = true;     
			 }
			 for (int j = 0; j <= reqCount; j++) {
				 if (j != reqCount) {
					 visitPsn = visitPsn + visitPsnPlus[j]+ ", ";
				 	 krcharNm = krcharNm + agncyPlus[j] + ", ";    			 
				 } else {
					 visitPsn = visitPsn + visitPsnPlus[j];
					 krcharNm = krcharNm + agncyPlus[j];    			 
				 }
			 }
			 if (reqNo != reqNo2) {
				if (whileFlag == false) {
					krcharNm = vipVoList.get(i).getCmpy_nm_krchar();
					visitPsn = vipVoList.get(i).getReprs_psn_nm();
				} else {
					krcharNm = krcharNm;
					visitPsn = visitPsn;
				}
			 }
			 if (!"delete".equals(krcharNm) && !krcharNm.equals(null)) {
				 vipVoList.get(i).setCmpy_nm_krchar(krcharNm);
				 vipVoList.get(i).setReprs_psn_nm(visitPsn);		
			 }  
			
	   		 reqCount = 0;
			 whileFlag = false;
			
			 krcharNm = "";   			     		 		 
		 }
		 for (int j=0; j < totalCount; j++) {   				
			 if ("delete".equals(vipVoList.get(j).getCmpy_nm_krchar())) {					
				 vipVoList.remove(j);					 
				 totalCount = totalCount-1;   					
				 j--;
			 }				 			
		 }
		 list.setLosVipTabVoList(vipVoList);		 
     } else if ("Eve".equals(tabFlag)) { // 행상
    	 eveVoList = lcpDAO.selectLcpEventTab(vo);
    	 totalCount = eveVoList.size();

		 for (int i = 0; i < totalCount; i++) {    	 
			 String reqNo = eveVoList.get(i).getEvent_no();
			 if ( i+1 >= totalCount) {
				 krcharNm = eveVoList.get(i).getKrchar_agncy_nm();
				 eveVoList.get(i).setKrchar_agncy_nm(krcharNm);
				 break;   		 
			 }
			 String reqNo2 = eveVoList.get(i+1).getEvent_no();
			 
			 while (reqNo.equals(reqNo2)) {
				 agncyPlus[reqCount] = eveVoList.get(i).getKrchar_agncy_nm();
				 agncyPlus[++reqCount] = eveVoList.get(i).getKrchar_agncy_nm(); 
				 eveVoList.get(i).setKrchar_agncy_nm("delete");
				 eveVoList.set(i, eveVoList.get(++i));
				 if ( i >= totalCount || i+1 >= totalCount) {
					 whileFlag = true;
					 break;
				 }
				 reqNo2 = eveVoList.get(i+1).getEvent_no();
				 whileFlag = true;     
			 }
			 for (int j = 0; j <= reqCount; j++) {
				 if (j != reqCount) {
				 	 krcharNm = krcharNm + agncyPlus[j] + ", ";    			 
				 } else {
					 krcharNm = krcharNm + agncyPlus[j];    			 
				 }
			 }
			 if (reqNo != reqNo2) {
				if (whileFlag == false) {
					krcharNm = eveVoList.get(i).getKrchar_agncy_nm();
				} else {
					krcharNm = krcharNm;
				}
			 }
			 if (!"delete".equals(krcharNm) && !krcharNm.equals(null)) {
				 eveVoList.get(i).setKrchar_agncy_nm(krcharNm);	
			 }  
			
	   		 reqCount = 0;
			 whileFlag = false;
			 krcharNm = "";   			     		 		 
		 }
		 for (int j=0; j < totalCount; j++) {   				
			 if ("delete".equals(eveVoList.get(j).getKrchar_agncy_nm())) {					
				 eveVoList.remove(j);					 
				 totalCount = totalCount-1;   					
				 j--;
			 }				 			
		 }
		 list.setLcpEventTabVoList(eveVoList);     
     }

    return list;
  }  

  /**
   * 단건 등록
   * 
   * @author 
   * @param LcpAgncyMstVo
   * @return int
   * @throws KitechException
   * @since 2023.11.21.
   */
  @Override
	public int insertItem01(LcpAgncyMstVo vo) throws KitechException {
    int result = lcpDAO.insertOne01(vo);
    return result;
	}

}
