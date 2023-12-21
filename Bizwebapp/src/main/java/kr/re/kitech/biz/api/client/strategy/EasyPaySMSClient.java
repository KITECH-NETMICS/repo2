package kr.re.kitech.biz.api.client.strategy;

import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.inswave.elfw.log.AppLog;
import com.kicc.EasyPayClient;

import kr.re.kitech.biz.api.client.KitechEasyPayClient;
import kr.re.kitech.biz.api.client.vo.EasyPaySMSVo;
import kr.re.kitech.biz.xom.base.enums.Business;
import kr.re.kitech.biz.xom.base.enums.Exceptions;
import kr.re.kitech.biz.xom.base.exception.KitechException;
import kr.re.kitech.biz.xom.core.ext.BaseUrlProperty;

/**
 * 이지페이 SMS_결제 API 연계 클라이언트 구현체.
 *
 * @author LeeYoungHee
 * @since 2023.07.05.
 */
@Service("kitechEasyPayClient")
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class EasyPaySMSClient implements KitechEasyPayClient {
	// URL (common.properties 참조)
//	private static final String EASYPAY_REAL_URL = "gw.easypay.co.kr"; // 운영
//	private static final String EASYPAY_URL = "testgw.easypay.co.kr"; // 개발

	private static final String TRAN_CD_NOR_REG = "00301020";   // 승인(일반, 에스크로)
	private static final String TRAN_CD_NOR_MGR = "00201000";   // 변경(취소)
	
	private static final String GW_PORT = "80";  // 포트번호(변경불가)
	
	private static final String CERT_FILE = "/was/IMIS_FILES/web_folder/cert/easypay"; // 인증파일
	private static final String LOG_DIR = "/waslog/easypay"; // 로그파일
	
	/**
     * 이지페이 SUM결제요청
     * @param EasyPaySMSVo
	 * @return EasyPaySMSVo
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.06.
     */
	public EasyPaySMSVo sendEasyPaySMS(EasyPaySMSVo vo) throws Exception{
		EasyPayClient easyPayClient = new EasyPayClient();
		
		easyPayClient.easypay_setenv_init(BaseUrlProperty.easyPayUrl, EasyPaySMSClient.GW_PORT, EasyPaySMSClient.CERT_FILE, EasyPaySMSClient.LOG_DIR, 99);
		easyPayClient.easypay_reqdata_init();
	    
		 AppLog.info("\n ----------------------------- EasyPaySMSVo : " + vo);
		 AppLog.info("\n ----------------------------- CERT_FILE : " + EasyPaySMSClient.CERT_FILE);
		
		if(vo.getTr_cd() == null || "".equals(vo.getTr_cd())){
			vo.setRes_cd("M114");
			vo.setRes_msg("연동 오류|tr_cd값이 설정되지 않았습니다.");
			throw new KitechException(Exceptions.ALERT, Business.SUP, "연동 오류|tr_cd값이 설정되지 않았습니다.");
		}
		
		// 승인요청 전문 설정        
		if(EasyPaySMSClient.TRAN_CD_NOR_REG.equals(vo.getTr_cd())){
			// 결제 주문 정보 DATA
	        int easypay_order_data_item = easyPayClient.easypay_item( "order_data" );
	
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_type"        , vo.getUser_type());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "order_no"         , vo.getOrder_no());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "memb_user_no"     , vo.getMemb_user_no());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_id"          , vo.getUser_id());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_nm"          , vo.getUser_nm());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_mail"        , vo.getUser_mail());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_phone1"      , vo.getUser_phone1());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_phone2"      , vo.getUser_phone2());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_addr"        , vo.getUser_addr());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "product_type"     , vo.getProduct_type());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "product_nm"       , vo.getProduct_nm());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "product_amt"      , vo.getProduct_amt());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define1"     , vo.getUser_define1());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define2"     , vo.getUser_define2());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define3"     , vo.getUser_define3());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define4"     , vo.getUser_define4());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define5"     , vo.getUser_define5());
	        easyPayClient.easypay_deli_us( easypay_order_data_item, "user_define6"     , vo.getUser_define6());
	        
	        //등록정보
	        int easypay_reg_data_item = easyPayClient.easypay_item( "reg_data" );
	        easyPayClient.easypay_deli_us( easypay_reg_data_item, "reg_txtype"	   , vo.getReg_txtype());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "reg_subtype"	   , vo.getReg_subtype());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "tot_amt"	       , vo.getTot_amt());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "currency" 	   , vo.getCurrency());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "client_ip"	   , vo.getClient_ip());            
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "escrow_yn"      , vo.getEscrow_yn());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "cno"		       , vo.getCno());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "rcv_mobile_no"  , vo.getRcv_mobile_no());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "pay_cd"         , vo.getPay_type());            
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "snd_tel_no"	   , vo.getSnd_tel_no());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "snd_msg"	       , vo.getSnd_msg());           
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "mall_nm"        , vo.getMall_nm());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "member_no"      , vo.getMember_no());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "own_cert_yn"    , vo.getOwn_cert_yn());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "sms_pay_expr"   , vo.getSms_pay_expr());
            easyPayClient.easypay_deli_us( easypay_reg_data_item, "bo_req_flag"    , "N"); // 가맹점관리자요청
            
          // 변경관리 요청          
		}else if(EasyPaySMSClient.TRAN_CD_NOR_MGR.equals(vo.getTr_cd())){
			int easypay_mgr_data_item = easyPayClient.easypay_item( "mgr_data" ); 
			
			easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_txtype"      , vo.getMgr_txtype());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_subtype"     , vo.getMgr_subtype());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "org_cno"         , vo.getOrg_cno());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "order_no"        , vo.getOrder_no());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_amt"         , vo.getMgr_amt());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_bank_cd"     , vo.getMgr_bank_cd());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_account"     , vo.getMgr_account());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_depositor"   , vo.getMgr_depositor());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_socno"       , vo.getMgr_socno());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_telno"       , vo.getMgr_telno());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "deli_cd"         , vo.getDeli_cd());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "deli_corp_cd"    , vo.getDeli_corp_cd());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "deli_invoice"    , vo.getDeli_invoice());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "deli_rcv_nm"     , vo.getDeli_rcv_nm());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "deli_rcv_tel"    , vo.getDeli_rcv_tel());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "req_ip"          , vo.getReq_ip());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "req_id"          , vo.getReq_id());
	        easyPayClient.easypay_deli_us( easypay_mgr_data_item, "mgr_msg"         , vo.getMgr_msg());  
		}

		 easyPayClient.easypay_run(vo.getMall_id(), vo.getTr_cd(), vo.getOrder_no() );		 
		 //System.out.println( easyPayClient.getEasypayResData());
		 
		 vo.setRes_cd(easyPayClient.res_cd);
		 vo.setRes_msg(easyPayClient.res_msg);
		 AppLog.info("\n ----------------------------- res_cd : " + vo.getRes_cd());
		 AppLog.info("\n ----------------------------- res_msg : " + vo.getRes_msg());
		 
		 String r_amount = this.getNullToSpace(easyPayClient.easypay_get_res( "amount")); //총 결제금액
		 
		 if("0000".equals(vo.getRes_cd()) && NumberUtils.toInt(vo.getTot_amt(), 0) == NumberUtils.toInt(r_amount, -1)){	
			 vo.setOrder_no(easyPayClient.easypay_get_res( "order_no")); //주문번호	
			 vo.setSuccess(true);
			 
			 if(EasyPaySMSClient.TRAN_CD_NOR_REG.equals(vo.getTr_cd())){
				 vo.setCno(this.getNullToSpace(easyPayClient.easypay_get_res( "cno"))); // PG거래번호
			 }else{
				 vo.setCanc_date(this.getNullToSpace(easyPayClient.easypay_get_res( "canc_date"))); //취소일시
			 }
		 }else{
			 vo.setSuccess(false);
		 }
		 
		 return vo;
	}
	
	/**
     * 파라미터 체크 메소드
     * @param String
	 * @return String
     * @throws Exception
	 * @author LeeYoungHee
	 * @since 2023.07.06.
     */
	private String  getNullToSpace(String param) throws KitechException{
		return (param == null) ? "" : param.trim();
	}
}
