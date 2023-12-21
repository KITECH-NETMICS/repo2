package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통팝업 조회 조건 Vo")
public class ComPopSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComPopSearchVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "학술대회명등", physicalName = "conf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_nm;

    @ElDtoField(logicalName = "연도", physicalName = "yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yr;

    @ElDtoField(logicalName = "상태코드", physicalName = "state_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_code;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "사업자번호(12자)", physicalName = "bsns_psn_regst_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no_1;

    @ElDtoField(logicalName = "거래처구분", physicalName = "vend_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf;

    @ElDtoField(logicalName = "주민번호", physicalName = "corp_resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_resid_no;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "업무구분", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "최근업체여부", physicalName = "recnt_cust_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recnt_cust_yn;

    @ElDtoField(logicalName = "업체대표자명", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "파트너기업 검색 구분", physicalName = "isPartner", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isPartner;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "conf_nm")
    public String getConf_nm(){
        return conf_nm;
    }

    @ElVoField(physicalName = "conf_nm")
    public void setConf_nm(String conf_nm){
        this.conf_nm = conf_nm;
    }

    @ElVoField(physicalName = "yr")
    public String getYr(){
        return yr;
    }

    @ElVoField(physicalName = "yr")
    public void setYr(String yr){
        this.yr = yr;
    }

    @ElVoField(physicalName = "state_code")
    public String getState_code(){
        return state_code;
    }

    @ElVoField(physicalName = "state_code")
    public void setState_code(String state_code){
        this.state_code = state_code;
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

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no_1")
    public String getBsns_psn_regst_no_1(){
        return bsns_psn_regst_no_1;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no_1")
    public void setBsns_psn_regst_no_1(String bsns_psn_regst_no_1){
        this.bsns_psn_regst_no_1 = bsns_psn_regst_no_1;
    }

    @ElVoField(physicalName = "vend_clsf")
    public String getVend_clsf(){
        return vend_clsf;
    }

    @ElVoField(physicalName = "vend_clsf")
    public void setVend_clsf(String vend_clsf){
        this.vend_clsf = vend_clsf;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public String getCorp_resid_no(){
        return corp_resid_no;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public void setCorp_resid_no(String corp_resid_no){
        this.corp_resid_no = corp_resid_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "recnt_cust_yn")
    public String getRecnt_cust_yn(){
        return recnt_cust_yn;
    }

    @ElVoField(physicalName = "recnt_cust_yn")
    public void setRecnt_cust_yn(String recnt_cust_yn){
        this.recnt_cust_yn = recnt_cust_yn;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "isPartner")
    public String getIsPartner(){
        return isPartner;
    }

    @ElVoField(physicalName = "isPartner")
    public void setIsPartner(String isPartner){
        this.isPartner = isPartner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComPopSearchVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("conf_nm").append("=").append(conf_nm).append(",");
        sb.append("yr").append("=").append(yr).append(",");
        sb.append("state_code").append("=").append(state_code).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("bsns_psn_regst_no_1").append("=").append(bsns_psn_regst_no_1).append(",");
        sb.append("vend_clsf").append("=").append(vend_clsf).append(",");
        sb.append("corp_resid_no").append("=").append(corp_resid_no).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("recnt_cust_yn").append("=").append(recnt_cust_yn).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("isPartner").append("=").append(isPartner);
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
