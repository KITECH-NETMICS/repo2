package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "이지페이 SMS결제 Vo")
public class EasyPaySMSVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EasyPaySMSVo(){
    }

    @ElDtoField(logicalName = "거래구분(수정불가)", physicalName = "tr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tr_cd;

    @ElDtoField(logicalName = "가맹점 ID(실ID)", physicalName = "mall_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mall_id;

    @ElDtoField(logicalName = "상호명", physicalName = "mall_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mall_nm;

    @ElDtoField(logicalName = "결제고객Ip", physicalName = "client_ip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String client_ip;

    @ElDtoField(logicalName = "통화코드(00 : 원화)", physicalName = "currency", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String currency;

    @ElDtoField(logicalName = "총 결제금액", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;

    @ElDtoField(logicalName = "에스크로여부(수정불가)", physicalName = "escrow_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String escrow_yn;

    @ElDtoField(logicalName = "복합결제여부(수정불가)", physicalName = "complex_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complex_yn;

    @ElDtoField(logicalName = "사용자구분", physicalName = "user_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_type;

    @ElDtoField(logicalName = "가맹점 고객일련번호", physicalName = "memb_user_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String memb_user_no;

    @ElDtoField(logicalName = "가맹점 필드1", physicalName = "user_define1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define1;

    @ElDtoField(logicalName = "가맹점 필드2", physicalName = "user_define2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define2;

    @ElDtoField(logicalName = "가맹점 필드3", physicalName = "user_define3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define3;

    @ElDtoField(logicalName = "가맹점 필드4", physicalName = "user_define4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define4;

    @ElDtoField(logicalName = "가맹점 필드5", physicalName = "user_define5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define5;

    @ElDtoField(logicalName = "가맹점 필드6", physicalName = "user_define6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_define6;

    @ElDtoField(logicalName = "서비스 기간", physicalName = "product_expr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String product_expr;

    @ElDtoField(logicalName = "SMS PHARM 발송", physicalName = "reg_txtype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_txtype;

    @ElDtoField(logicalName = "SMS 등록", physicalName = "reg_subtype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_subtype;

    @ElDtoField(logicalName = "결제수단 신용카드 11 계좌이체 21", physicalName = "pay_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_type;

    @ElDtoField(logicalName = "PG거래번호", physicalName = "cno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cno;

    @ElDtoField(logicalName = "결제만료일시", physicalName = "sms_pay_expr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_pay_expr;

    @ElDtoField(logicalName = "SMS수신 전화번호", physicalName = "rcv_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_mobile_no;

    @ElDtoField(logicalName = "SMS발신번호", physicalName = "snd_tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_tel_no;

    @ElDtoField(logicalName = "SMS 문구", physicalName = "snd_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_msg;

    @ElDtoField(logicalName = "주문번호", physicalName = "order_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_no;

    @ElDtoField(logicalName = "가맹점 고객 ID", physicalName = "user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_id;

    @ElDtoField(logicalName = "고객명", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "가맹점 고객 E-mail", physicalName = "user_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_mail;

    @ElDtoField(logicalName = "가맹점 고객 연락처1", physicalName = "user_phone1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_phone1;

    @ElDtoField(logicalName = "가맹점 고객 연락처2", physicalName = "user_phone2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_phone2;

    @ElDtoField(logicalName = "가맹점 고객 주소", physicalName = "user_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_addr;

    @ElDtoField(logicalName = "상품명", physicalName = "product_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String product_nm;

    @ElDtoField(logicalName = "상품금액", physicalName = "product_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String product_amt;

    @ElDtoField(logicalName = "상품구분", physicalName = "product_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String product_type;

    @ElDtoField(logicalName = "회원사 시퀀스번호", physicalName = "member_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String member_no;

    @ElDtoField(logicalName = "본인인증여부", physicalName = "own_cert_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String own_cert_yn;

    @ElDtoField(logicalName = "거래구분", physicalName = "mgr_txtype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_txtype;

    @ElDtoField(logicalName = "변경세부구분", physicalName = "mgr_subtype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_subtype;

    @ElDtoField(logicalName = "원거래고유번호", physicalName = "org_cno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_cno;

    @ElDtoField(logicalName = "부분취소/환불요청 금액", physicalName = "mgr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_amt;

    @ElDtoField(logicalName = "변경 사유", physicalName = "mgr_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_msg;

    @ElDtoField(logicalName = "은행코드", physicalName = "mgr_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_bank_cd;

    @ElDtoField(logicalName = "계좌번호", physicalName = "mgr_account", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_account;

    @ElDtoField(logicalName = "예금주명", physicalName = "mgr_depositor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_depositor;

    @ElDtoField(logicalName = "mgr_socno", physicalName = "mgr_socno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_socno;

    @ElDtoField(logicalName = "mgr_telno", physicalName = "mgr_telno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mgr_telno;

    @ElDtoField(logicalName = "deli_cd", physicalName = "deli_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deli_cd;

    @ElDtoField(logicalName = "deli_corp_cd", physicalName = "deli_corp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deli_corp_cd;

    @ElDtoField(logicalName = "deli_invoice", physicalName = "deli_invoice", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deli_invoice;

    @ElDtoField(logicalName = "deli_rcv_nm", physicalName = "deli_rcv_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deli_rcv_nm;

    @ElDtoField(logicalName = "deli_rcv_tel", physicalName = "deli_rcv_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deli_rcv_tel;

    @ElDtoField(logicalName = "요청자 IP", physicalName = "req_ip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ip;

    @ElDtoField(logicalName = "요청자Id", physicalName = "req_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_id;

    @ElDtoField(logicalName = "expireDate", physicalName = "expire_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expire_date;

    @ElDtoField(logicalName = "expireTime", physicalName = "expire_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expire_time;

    @ElDtoField(logicalName = "취소일자", physicalName = "canc_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String canc_date;

    @ElDtoField(logicalName = "응답코드", physicalName = "res_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_cd;

    @ElDtoField(logicalName = "응답메세지", physicalName = "res_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_msg;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean success;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "tr_cd")
    public String getTr_cd(){
        return tr_cd;
    }

    @ElVoField(physicalName = "tr_cd")
    public void setTr_cd(String tr_cd){
        this.tr_cd = tr_cd;
    }

    @ElVoField(physicalName = "mall_id")
    public String getMall_id(){
        return mall_id;
    }

    @ElVoField(physicalName = "mall_id")
    public void setMall_id(String mall_id){
        this.mall_id = mall_id;
    }

    @ElVoField(physicalName = "mall_nm")
    public String getMall_nm(){
        return mall_nm;
    }

    @ElVoField(physicalName = "mall_nm")
    public void setMall_nm(String mall_nm){
        this.mall_nm = mall_nm;
    }

    @ElVoField(physicalName = "client_ip")
    public String getClient_ip(){
        return client_ip;
    }

    @ElVoField(physicalName = "client_ip")
    public void setClient_ip(String client_ip){
        this.client_ip = client_ip;
    }

    @ElVoField(physicalName = "currency")
    public String getCurrency(){
        return currency;
    }

    @ElVoField(physicalName = "currency")
    public void setCurrency(String currency){
        this.currency = currency;
    }

    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }

    @ElVoField(physicalName = "escrow_yn")
    public String getEscrow_yn(){
        return escrow_yn;
    }

    @ElVoField(physicalName = "escrow_yn")
    public void setEscrow_yn(String escrow_yn){
        this.escrow_yn = escrow_yn;
    }

    @ElVoField(physicalName = "complex_yn")
    public String getComplex_yn(){
        return complex_yn;
    }

    @ElVoField(physicalName = "complex_yn")
    public void setComplex_yn(String complex_yn){
        this.complex_yn = complex_yn;
    }

    @ElVoField(physicalName = "user_type")
    public String getUser_type(){
        return user_type;
    }

    @ElVoField(physicalName = "user_type")
    public void setUser_type(String user_type){
        this.user_type = user_type;
    }

    @ElVoField(physicalName = "memb_user_no")
    public String getMemb_user_no(){
        return memb_user_no;
    }

    @ElVoField(physicalName = "memb_user_no")
    public void setMemb_user_no(String memb_user_no){
        this.memb_user_no = memb_user_no;
    }

    @ElVoField(physicalName = "user_define1")
    public String getUser_define1(){
        return user_define1;
    }

    @ElVoField(physicalName = "user_define1")
    public void setUser_define1(String user_define1){
        this.user_define1 = user_define1;
    }

    @ElVoField(physicalName = "user_define2")
    public String getUser_define2(){
        return user_define2;
    }

    @ElVoField(physicalName = "user_define2")
    public void setUser_define2(String user_define2){
        this.user_define2 = user_define2;
    }

    @ElVoField(physicalName = "user_define3")
    public String getUser_define3(){
        return user_define3;
    }

    @ElVoField(physicalName = "user_define3")
    public void setUser_define3(String user_define3){
        this.user_define3 = user_define3;
    }

    @ElVoField(physicalName = "user_define4")
    public String getUser_define4(){
        return user_define4;
    }

    @ElVoField(physicalName = "user_define4")
    public void setUser_define4(String user_define4){
        this.user_define4 = user_define4;
    }

    @ElVoField(physicalName = "user_define5")
    public String getUser_define5(){
        return user_define5;
    }

    @ElVoField(physicalName = "user_define5")
    public void setUser_define5(String user_define5){
        this.user_define5 = user_define5;
    }

    @ElVoField(physicalName = "user_define6")
    public String getUser_define6(){
        return user_define6;
    }

    @ElVoField(physicalName = "user_define6")
    public void setUser_define6(String user_define6){
        this.user_define6 = user_define6;
    }

    @ElVoField(physicalName = "product_expr")
    public String getProduct_expr(){
        return product_expr;
    }

    @ElVoField(physicalName = "product_expr")
    public void setProduct_expr(String product_expr){
        this.product_expr = product_expr;
    }

    @ElVoField(physicalName = "reg_txtype")
    public String getReg_txtype(){
        return reg_txtype;
    }

    @ElVoField(physicalName = "reg_txtype")
    public void setReg_txtype(String reg_txtype){
        this.reg_txtype = reg_txtype;
    }

    @ElVoField(physicalName = "reg_subtype")
    public String getReg_subtype(){
        return reg_subtype;
    }

    @ElVoField(physicalName = "reg_subtype")
    public void setReg_subtype(String reg_subtype){
        this.reg_subtype = reg_subtype;
    }

    @ElVoField(physicalName = "pay_type")
    public String getPay_type(){
        return pay_type;
    }

    @ElVoField(physicalName = "pay_type")
    public void setPay_type(String pay_type){
        this.pay_type = pay_type;
    }

    @ElVoField(physicalName = "cno")
    public String getCno(){
        return cno;
    }

    @ElVoField(physicalName = "cno")
    public void setCno(String cno){
        this.cno = cno;
    }

    @ElVoField(physicalName = "sms_pay_expr")
    public String getSms_pay_expr(){
        return sms_pay_expr;
    }

    @ElVoField(physicalName = "sms_pay_expr")
    public void setSms_pay_expr(String sms_pay_expr){
        this.sms_pay_expr = sms_pay_expr;
    }

    @ElVoField(physicalName = "rcv_mobile_no")
    public String getRcv_mobile_no(){
        return rcv_mobile_no;
    }

    @ElVoField(physicalName = "rcv_mobile_no")
    public void setRcv_mobile_no(String rcv_mobile_no){
        this.rcv_mobile_no = rcv_mobile_no;
    }

    @ElVoField(physicalName = "snd_tel_no")
    public String getSnd_tel_no(){
        return snd_tel_no;
    }

    @ElVoField(physicalName = "snd_tel_no")
    public void setSnd_tel_no(String snd_tel_no){
        this.snd_tel_no = snd_tel_no;
    }

    @ElVoField(physicalName = "snd_msg")
    public String getSnd_msg(){
        return snd_msg;
    }

    @ElVoField(physicalName = "snd_msg")
    public void setSnd_msg(String snd_msg){
        this.snd_msg = snd_msg;
    }

    @ElVoField(physicalName = "order_no")
    public String getOrder_no(){
        return order_no;
    }

    @ElVoField(physicalName = "order_no")
    public void setOrder_no(String order_no){
        this.order_no = order_no;
    }

    @ElVoField(physicalName = "user_id")
    public String getUser_id(){
        return user_id;
    }

    @ElVoField(physicalName = "user_id")
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_mail")
    public String getUser_mail(){
        return user_mail;
    }

    @ElVoField(physicalName = "user_mail")
    public void setUser_mail(String user_mail){
        this.user_mail = user_mail;
    }

    @ElVoField(physicalName = "user_phone1")
    public String getUser_phone1(){
        return user_phone1;
    }

    @ElVoField(physicalName = "user_phone1")
    public void setUser_phone1(String user_phone1){
        this.user_phone1 = user_phone1;
    }

    @ElVoField(physicalName = "user_phone2")
    public String getUser_phone2(){
        return user_phone2;
    }

    @ElVoField(physicalName = "user_phone2")
    public void setUser_phone2(String user_phone2){
        this.user_phone2 = user_phone2;
    }

    @ElVoField(physicalName = "user_addr")
    public String getUser_addr(){
        return user_addr;
    }

    @ElVoField(physicalName = "user_addr")
    public void setUser_addr(String user_addr){
        this.user_addr = user_addr;
    }

    @ElVoField(physicalName = "product_nm")
    public String getProduct_nm(){
        return product_nm;
    }

    @ElVoField(physicalName = "product_nm")
    public void setProduct_nm(String product_nm){
        this.product_nm = product_nm;
    }

    @ElVoField(physicalName = "product_amt")
    public String getProduct_amt(){
        return product_amt;
    }

    @ElVoField(physicalName = "product_amt")
    public void setProduct_amt(String product_amt){
        this.product_amt = product_amt;
    }

    @ElVoField(physicalName = "product_type")
    public String getProduct_type(){
        return product_type;
    }

    @ElVoField(physicalName = "product_type")
    public void setProduct_type(String product_type){
        this.product_type = product_type;
    }

    @ElVoField(physicalName = "member_no")
    public String getMember_no(){
        return member_no;
    }

    @ElVoField(physicalName = "member_no")
    public void setMember_no(String member_no){
        this.member_no = member_no;
    }

    @ElVoField(physicalName = "own_cert_yn")
    public String getOwn_cert_yn(){
        return own_cert_yn;
    }

    @ElVoField(physicalName = "own_cert_yn")
    public void setOwn_cert_yn(String own_cert_yn){
        this.own_cert_yn = own_cert_yn;
    }

    @ElVoField(physicalName = "mgr_txtype")
    public String getMgr_txtype(){
        return mgr_txtype;
    }

    @ElVoField(physicalName = "mgr_txtype")
    public void setMgr_txtype(String mgr_txtype){
        this.mgr_txtype = mgr_txtype;
    }

    @ElVoField(physicalName = "mgr_subtype")
    public String getMgr_subtype(){
        return mgr_subtype;
    }

    @ElVoField(physicalName = "mgr_subtype")
    public void setMgr_subtype(String mgr_subtype){
        this.mgr_subtype = mgr_subtype;
    }

    @ElVoField(physicalName = "org_cno")
    public String getOrg_cno(){
        return org_cno;
    }

    @ElVoField(physicalName = "org_cno")
    public void setOrg_cno(String org_cno){
        this.org_cno = org_cno;
    }

    @ElVoField(physicalName = "mgr_amt")
    public String getMgr_amt(){
        return mgr_amt;
    }

    @ElVoField(physicalName = "mgr_amt")
    public void setMgr_amt(String mgr_amt){
        this.mgr_amt = mgr_amt;
    }

    @ElVoField(physicalName = "mgr_msg")
    public String getMgr_msg(){
        return mgr_msg;
    }

    @ElVoField(physicalName = "mgr_msg")
    public void setMgr_msg(String mgr_msg){
        this.mgr_msg = mgr_msg;
    }

    @ElVoField(physicalName = "mgr_bank_cd")
    public String getMgr_bank_cd(){
        return mgr_bank_cd;
    }

    @ElVoField(physicalName = "mgr_bank_cd")
    public void setMgr_bank_cd(String mgr_bank_cd){
        this.mgr_bank_cd = mgr_bank_cd;
    }

    @ElVoField(physicalName = "mgr_account")
    public String getMgr_account(){
        return mgr_account;
    }

    @ElVoField(physicalName = "mgr_account")
    public void setMgr_account(String mgr_account){
        this.mgr_account = mgr_account;
    }

    @ElVoField(physicalName = "mgr_depositor")
    public String getMgr_depositor(){
        return mgr_depositor;
    }

    @ElVoField(physicalName = "mgr_depositor")
    public void setMgr_depositor(String mgr_depositor){
        this.mgr_depositor = mgr_depositor;
    }

    @ElVoField(physicalName = "mgr_socno")
    public String getMgr_socno(){
        return mgr_socno;
    }

    @ElVoField(physicalName = "mgr_socno")
    public void setMgr_socno(String mgr_socno){
        this.mgr_socno = mgr_socno;
    }

    @ElVoField(physicalName = "mgr_telno")
    public String getMgr_telno(){
        return mgr_telno;
    }

    @ElVoField(physicalName = "mgr_telno")
    public void setMgr_telno(String mgr_telno){
        this.mgr_telno = mgr_telno;
    }

    @ElVoField(physicalName = "deli_cd")
    public String getDeli_cd(){
        return deli_cd;
    }

    @ElVoField(physicalName = "deli_cd")
    public void setDeli_cd(String deli_cd){
        this.deli_cd = deli_cd;
    }

    @ElVoField(physicalName = "deli_corp_cd")
    public String getDeli_corp_cd(){
        return deli_corp_cd;
    }

    @ElVoField(physicalName = "deli_corp_cd")
    public void setDeli_corp_cd(String deli_corp_cd){
        this.deli_corp_cd = deli_corp_cd;
    }

    @ElVoField(physicalName = "deli_invoice")
    public String getDeli_invoice(){
        return deli_invoice;
    }

    @ElVoField(physicalName = "deli_invoice")
    public void setDeli_invoice(String deli_invoice){
        this.deli_invoice = deli_invoice;
    }

    @ElVoField(physicalName = "deli_rcv_nm")
    public String getDeli_rcv_nm(){
        return deli_rcv_nm;
    }

    @ElVoField(physicalName = "deli_rcv_nm")
    public void setDeli_rcv_nm(String deli_rcv_nm){
        this.deli_rcv_nm = deli_rcv_nm;
    }

    @ElVoField(physicalName = "deli_rcv_tel")
    public String getDeli_rcv_tel(){
        return deli_rcv_tel;
    }

    @ElVoField(physicalName = "deli_rcv_tel")
    public void setDeli_rcv_tel(String deli_rcv_tel){
        this.deli_rcv_tel = deli_rcv_tel;
    }

    @ElVoField(physicalName = "req_ip")
    public String getReq_ip(){
        return req_ip;
    }

    @ElVoField(physicalName = "req_ip")
    public void setReq_ip(String req_ip){
        this.req_ip = req_ip;
    }

    @ElVoField(physicalName = "req_id")
    public String getReq_id(){
        return req_id;
    }

    @ElVoField(physicalName = "req_id")
    public void setReq_id(String req_id){
        this.req_id = req_id;
    }

    @ElVoField(physicalName = "expire_date")
    public String getExpire_date(){
        return expire_date;
    }

    @ElVoField(physicalName = "expire_date")
    public void setExpire_date(String expire_date){
        this.expire_date = expire_date;
    }

    @ElVoField(physicalName = "expire_time")
    public String getExpire_time(){
        return expire_time;
    }

    @ElVoField(physicalName = "expire_time")
    public void setExpire_time(String expire_time){
        this.expire_time = expire_time;
    }

    @ElVoField(physicalName = "canc_date")
    public String getCanc_date(){
        return canc_date;
    }

    @ElVoField(physicalName = "canc_date")
    public void setCanc_date(String canc_date){
        this.canc_date = canc_date;
    }

    @ElVoField(physicalName = "res_cd")
    public String getRes_cd(){
        return res_cd;
    }

    @ElVoField(physicalName = "res_cd")
    public void setRes_cd(String res_cd){
        this.res_cd = res_cd;
    }

    @ElVoField(physicalName = "res_msg")
    public String getRes_msg(){
        return res_msg;
    }

    @ElVoField(physicalName = "res_msg")
    public void setRes_msg(String res_msg){
        this.res_msg = res_msg;
    }

    @ElVoField(physicalName = "success")
    public boolean isSuccess(){
        return success;
    }

    @ElVoField(physicalName = "success")
    public void setSuccess(boolean success){
        this.success = success;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasyPaySMSVo [");
        sb.append("tr_cd").append("=").append(tr_cd).append(",");
        sb.append("mall_id").append("=").append(mall_id).append(",");
        sb.append("mall_nm").append("=").append(mall_nm).append(",");
        sb.append("client_ip").append("=").append(client_ip).append(",");
        sb.append("currency").append("=").append(currency).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("escrow_yn").append("=").append(escrow_yn).append(",");
        sb.append("complex_yn").append("=").append(complex_yn).append(",");
        sb.append("user_type").append("=").append(user_type).append(",");
        sb.append("memb_user_no").append("=").append(memb_user_no).append(",");
        sb.append("user_define1").append("=").append(user_define1).append(",");
        sb.append("user_define2").append("=").append(user_define2).append(",");
        sb.append("user_define3").append("=").append(user_define3).append(",");
        sb.append("user_define4").append("=").append(user_define4).append(",");
        sb.append("user_define5").append("=").append(user_define5).append(",");
        sb.append("user_define6").append("=").append(user_define6).append(",");
        sb.append("product_expr").append("=").append(product_expr).append(",");
        sb.append("reg_txtype").append("=").append(reg_txtype).append(",");
        sb.append("reg_subtype").append("=").append(reg_subtype).append(",");
        sb.append("pay_type").append("=").append(pay_type).append(",");
        sb.append("cno").append("=").append(cno).append(",");
        sb.append("sms_pay_expr").append("=").append(sms_pay_expr).append(",");
        sb.append("rcv_mobile_no").append("=").append(rcv_mobile_no).append(",");
        sb.append("snd_tel_no").append("=").append(snd_tel_no).append(",");
        sb.append("snd_msg").append("=").append(snd_msg).append(",");
        sb.append("order_no").append("=").append(order_no).append(",");
        sb.append("user_id").append("=").append(user_id).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_mail").append("=").append(user_mail).append(",");
        sb.append("user_phone1").append("=").append(user_phone1).append(",");
        sb.append("user_phone2").append("=").append(user_phone2).append(",");
        sb.append("user_addr").append("=").append(user_addr).append(",");
        sb.append("product_nm").append("=").append(product_nm).append(",");
        sb.append("product_amt").append("=").append(product_amt).append(",");
        sb.append("product_type").append("=").append(product_type).append(",");
        sb.append("member_no").append("=").append(member_no).append(",");
        sb.append("own_cert_yn").append("=").append(own_cert_yn).append(",");
        sb.append("mgr_txtype").append("=").append(mgr_txtype).append(",");
        sb.append("mgr_subtype").append("=").append(mgr_subtype).append(",");
        sb.append("org_cno").append("=").append(org_cno).append(",");
        sb.append("mgr_amt").append("=").append(mgr_amt).append(",");
        sb.append("mgr_msg").append("=").append(mgr_msg).append(",");
        sb.append("mgr_bank_cd").append("=").append(mgr_bank_cd).append(",");
        sb.append("mgr_account").append("=").append(mgr_account).append(",");
        sb.append("mgr_depositor").append("=").append(mgr_depositor).append(",");
        sb.append("mgr_socno").append("=").append(mgr_socno).append(",");
        sb.append("mgr_telno").append("=").append(mgr_telno).append(",");
        sb.append("deli_cd").append("=").append(deli_cd).append(",");
        sb.append("deli_corp_cd").append("=").append(deli_corp_cd).append(",");
        sb.append("deli_invoice").append("=").append(deli_invoice).append(",");
        sb.append("deli_rcv_nm").append("=").append(deli_rcv_nm).append(",");
        sb.append("deli_rcv_tel").append("=").append(deli_rcv_tel).append(",");
        sb.append("req_ip").append("=").append(req_ip).append(",");
        sb.append("req_id").append("=").append(req_id).append(",");
        sb.append("expire_date").append("=").append(expire_date).append(",");
        sb.append("expire_time").append("=").append(expire_time).append(",");
        sb.append("canc_date").append("=").append(canc_date).append(",");
        sb.append("res_cd").append("=").append(res_cd).append(",");
        sb.append("res_msg").append("=").append(res_msg).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("syspayno").append("=").append(syspayno);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
