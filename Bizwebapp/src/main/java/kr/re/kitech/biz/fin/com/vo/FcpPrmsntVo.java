package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "어음Vo")
public class FcpPrmsntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FcpPrmsntVo(){
    }

    @ElDtoField(logicalName = "어음번호", physicalName = "prmsnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prmsnt_no;

    @ElDtoField(logicalName = "어음구분", physicalName = "prmsnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prmsnt_clsf;

    @ElDtoField(logicalName = "금액", physicalName = "amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long amt;

    @ElDtoField(logicalName = "회수액", physicalName = "times_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long times_liq;

    @ElDtoField(logicalName = "가결의금액", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "가결의대변금액", physicalName = "unslip_cr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_cr_amt;

    @ElDtoField(logicalName = "어음상태코드", physicalName = "prmsnt_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prmsnt_state_cd;

    @ElDtoField(logicalName = "상대회계코드", physicalName = "contpat_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contpat_accnt_cd;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "관리항목3", physicalName = "mngmt_item_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_3;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "만기일자", physicalName = "expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expir_ymd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "발행자", physicalName = "issu_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_psn;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "어음입금의뢰번호", physicalName = "depst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_no;

    @ElDtoField(logicalName = "지급은행명", physicalName = "pay_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_bank_nm;

    @ElDtoField(logicalName = "발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElVoField(physicalName = "prmsnt_no")
    public String getPrmsnt_no(){
        return prmsnt_no;
    }

    @ElVoField(physicalName = "prmsnt_no")
    public void setPrmsnt_no(String prmsnt_no){
        this.prmsnt_no = prmsnt_no;
    }

    @ElVoField(physicalName = "prmsnt_clsf")
    public String getPrmsnt_clsf(){
        return prmsnt_clsf;
    }

    @ElVoField(physicalName = "prmsnt_clsf")
    public void setPrmsnt_clsf(String prmsnt_clsf){
        this.prmsnt_clsf = prmsnt_clsf;
    }

    @ElVoField(physicalName = "amt")
    public long getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(long amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "times_liq")
    public long getTimes_liq(){
        return times_liq;
    }

    @ElVoField(physicalName = "times_liq")
    public void setTimes_liq(long times_liq){
        this.times_liq = times_liq;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "unslip_cr_amt")
    public long getUnslip_cr_amt(){
        return unslip_cr_amt;
    }

    @ElVoField(physicalName = "unslip_cr_amt")
    public void setUnslip_cr_amt(long unslip_cr_amt){
        this.unslip_cr_amt = unslip_cr_amt;
    }

    @ElVoField(physicalName = "prmsnt_state_cd")
    public String getPrmsnt_state_cd(){
        return prmsnt_state_cd;
    }

    @ElVoField(physicalName = "prmsnt_state_cd")
    public void setPrmsnt_state_cd(String prmsnt_state_cd){
        this.prmsnt_state_cd = prmsnt_state_cd;
    }

    @ElVoField(physicalName = "contpat_accnt_cd")
    public String getContpat_accnt_cd(){
        return contpat_accnt_cd;
    }

    @ElVoField(physicalName = "contpat_accnt_cd")
    public void setContpat_accnt_cd(String contpat_accnt_cd){
        this.contpat_accnt_cd = contpat_accnt_cd;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public String getMngmt_item_3(){
        return mngmt_item_3;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public void setMngmt_item_3(String mngmt_item_3){
        this.mngmt_item_3 = mngmt_item_3;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "expir_ymd")
    public String getExpir_ymd(){
        return expir_ymd;
    }

    @ElVoField(physicalName = "expir_ymd")
    public void setExpir_ymd(String expir_ymd){
        this.expir_ymd = expir_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "issu_psn")
    public String getIssu_psn(){
        return issu_psn;
    }

    @ElVoField(physicalName = "issu_psn")
    public void setIssu_psn(String issu_psn){
        this.issu_psn = issu_psn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "depst_req_no")
    public String getDepst_req_no(){
        return depst_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public void setDepst_req_no(String depst_req_no){
        this.depst_req_no = depst_req_no;
    }

    @ElVoField(physicalName = "pay_bank_nm")
    public String getPay_bank_nm(){
        return pay_bank_nm;
    }

    @ElVoField(physicalName = "pay_bank_nm")
    public void setPay_bank_nm(String pay_bank_nm){
        this.pay_bank_nm = pay_bank_nm;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FcpPrmsntVo [");
        sb.append("prmsnt_no").append("=").append(prmsnt_no).append(",");
        sb.append("prmsnt_clsf").append("=").append(prmsnt_clsf).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("times_liq").append("=").append(times_liq).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("unslip_cr_amt").append("=").append(unslip_cr_amt).append(",");
        sb.append("prmsnt_state_cd").append("=").append(prmsnt_state_cd).append(",");
        sb.append("contpat_accnt_cd").append("=").append(contpat_accnt_cd).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("mngmt_item_3").append("=").append(mngmt_item_3).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("expir_ymd").append("=").append(expir_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("issu_psn").append("=").append(issu_psn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("depst_req_no").append("=").append(depst_req_no).append(",");
        sb.append("pay_bank_nm").append("=").append(pay_bank_nm).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd);
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
