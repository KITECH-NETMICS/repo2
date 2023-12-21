package kr.re.kitech.biz.sup.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "이지페이 정보 Vo")
public class EasyPayInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EasyPayInfoVo(){
    }

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "접수번호", physicalName = "order_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_no;

    @ElDtoField(logicalName = "PG거래번호", physicalName = "cno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cno;

    @ElDtoField(logicalName = "의뢰자성명", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "의뢰자이메일", physicalName = "user_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_mail;

    @ElDtoField(logicalName = "고객전화번호", physicalName = "user_phone1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_phone1;

    @ElDtoField(logicalName = "의뢰자모바일", physicalName = "rcv_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_mobile_no;

    @ElDtoField(logicalName = "응답코드", physicalName = "res_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_cd;

    @ElDtoField(logicalName = "금액", physicalName = "amount", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amount;

    @ElDtoField(logicalName = "응답메세지", physicalName = "res_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_msg;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean success;

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "order_no")
    public String getOrder_no(){
        return order_no;
    }

    @ElVoField(physicalName = "order_no")
    public void setOrder_no(String order_no){
        this.order_no = order_no;
    }

    @ElVoField(physicalName = "cno")
    public String getCno(){
        return cno;
    }

    @ElVoField(physicalName = "cno")
    public void setCno(String cno){
        this.cno = cno;
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

    @ElVoField(physicalName = "rcv_mobile_no")
    public String getRcv_mobile_no(){
        return rcv_mobile_no;
    }

    @ElVoField(physicalName = "rcv_mobile_no")
    public void setRcv_mobile_no(String rcv_mobile_no){
        this.rcv_mobile_no = rcv_mobile_no;
    }

    @ElVoField(physicalName = "res_cd")
    public String getRes_cd(){
        return res_cd;
    }

    @ElVoField(physicalName = "res_cd")
    public void setRes_cd(String res_cd){
        this.res_cd = res_cd;
    }

    @ElVoField(physicalName = "amount")
    public String getAmount(){
        return amount;
    }

    @ElVoField(physicalName = "amount")
    public void setAmount(String amount){
        this.amount = amount;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasyPayInfoVo [");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("order_no").append("=").append(order_no).append(",");
        sb.append("cno").append("=").append(cno).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_mail").append("=").append(user_mail).append(",");
        sb.append("user_phone1").append("=").append(user_phone1).append(",");
        sb.append("rcv_mobile_no").append("=").append(rcv_mobile_no).append(",");
        sb.append("res_cd").append("=").append(res_cd).append(",");
        sb.append("amount").append("=").append(amount).append(",");
        sb.append("res_msg").append("=").append(res_msg).append(",");
        sb.append("success").append("=").append(success);
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
