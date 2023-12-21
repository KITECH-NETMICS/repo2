package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspTechSupdExp")
public class FspTechSupdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSupdVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqOdr", physicalName = "req_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_odr;

    @ElDtoField(logicalName = "suptDetls", physicalName = "supt_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_detls;

    @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "time", physicalName = "time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String time;

    @ElDtoField(logicalName = "unitPrice", physicalName = "unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_price;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "rstBookIssu", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "rstBookTreatNm", physicalName = "rst_book_treat_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_treat_nm;

    @ElDtoField(logicalName = "test", physicalName = "test", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_odr")
    public int getReq_odr(){
        return req_odr;
    }

    @ElVoField(physicalName = "req_odr")
    public void setReq_odr(int req_odr){
        this.req_odr = req_odr;
    }

    @ElVoField(physicalName = "supt_detls")
    public String getSupt_detls(){
        return supt_detls;
    }

    @ElVoField(physicalName = "supt_detls")
    public void setSupt_detls(String supt_detls){
        this.supt_detls = supt_detls;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "time")
    public String getTime(){
        return time;
    }

    @ElVoField(physicalName = "time")
    public void setTime(String time){
        this.time = time;
    }

    @ElVoField(physicalName = "unit_price")
    public String getUnit_price(){
        return unit_price;
    }

    @ElVoField(physicalName = "unit_price")
    public void setUnit_price(String unit_price){
        this.unit_price = unit_price;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_treat_nm")
    public String getRst_book_treat_nm(){
        return rst_book_treat_nm;
    }

    @ElVoField(physicalName = "rst_book_treat_nm")
    public void setRst_book_treat_nm(String rst_book_treat_nm){
        this.rst_book_treat_nm = rst_book_treat_nm;
    }

    @ElVoField(physicalName = "test")
    public String getTest(){
        return test;
    }

    @ElVoField(physicalName = "test")
    public void setTest(String test){
        this.test = test;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSupdVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_odr").append("=").append(req_odr).append(",");
        sb.append("supt_detls").append("=").append(supt_detls).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("time").append("=").append(time).append(",");
        sb.append("unit_price").append("=").append(unit_price).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("rst_book_treat_nm").append("=").append(rst_book_treat_nm).append(",");
        sb.append("test").append("=").append(test).append(",");
        sb.append("posi_cd").append("=").append(posi_cd);
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
