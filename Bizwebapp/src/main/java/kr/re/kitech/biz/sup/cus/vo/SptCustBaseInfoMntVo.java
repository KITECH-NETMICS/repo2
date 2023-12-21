package kr.re.kitech.biz.sup.cus.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "고객정보관리 목록 Vo")
public class SptCustBaseInfoMntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCustBaseInfoMntVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "기업상태", physicalName = "enp_scd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enp_scd;

    @ElDtoField(logicalName = "기업상태명", physicalName = "enp_scd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enp_scd_nm;

    @ElDtoField(logicalName = "파트너기업", physicalName = "supt_par", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_par;

    @ElDtoField(logicalName = "창업보육기업", physicalName = "supt_inc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_inc;

    @ElDtoField(logicalName = "성장지원기업", physicalName = "supt_gbl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_gbl;

    @ElDtoField(logicalName = "렌탈랩기업", physicalName = "supt_rtl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_rtl;

    @ElDtoField(logicalName = "기업명", physicalName = "cust_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_nm;

    @ElDtoField(logicalName = "대표자", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "도로명주소", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "회사지번주소", physicalName = "cmpy_addr_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_01;

    @ElDtoField(logicalName = "대표번호", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "enp_scd")
    public String getEnp_scd(){
        return enp_scd;
    }

    @ElVoField(physicalName = "enp_scd")
    public void setEnp_scd(String enp_scd){
        this.enp_scd = enp_scd;
    }

    @ElVoField(physicalName = "enp_scd_nm")
    public String getEnp_scd_nm(){
        return enp_scd_nm;
    }

    @ElVoField(physicalName = "enp_scd_nm")
    public void setEnp_scd_nm(String enp_scd_nm){
        this.enp_scd_nm = enp_scd_nm;
    }

    @ElVoField(physicalName = "supt_par")
    public String getSupt_par(){
        return supt_par;
    }

    @ElVoField(physicalName = "supt_par")
    public void setSupt_par(String supt_par){
        this.supt_par = supt_par;
    }

    @ElVoField(physicalName = "supt_inc")
    public String getSupt_inc(){
        return supt_inc;
    }

    @ElVoField(physicalName = "supt_inc")
    public void setSupt_inc(String supt_inc){
        this.supt_inc = supt_inc;
    }

    @ElVoField(physicalName = "supt_gbl")
    public String getSupt_gbl(){
        return supt_gbl;
    }

    @ElVoField(physicalName = "supt_gbl")
    public void setSupt_gbl(String supt_gbl){
        this.supt_gbl = supt_gbl;
    }

    @ElVoField(physicalName = "supt_rtl")
    public String getSupt_rtl(){
        return supt_rtl;
    }

    @ElVoField(physicalName = "supt_rtl")
    public void setSupt_rtl(String supt_rtl){
        this.supt_rtl = supt_rtl;
    }

    @ElVoField(physicalName = "cust_nm")
    public String getCust_nm(){
        return cust_nm;
    }

    @ElVoField(physicalName = "cust_nm")
    public void setCust_nm(String cust_nm){
        this.cust_nm = cust_nm;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr_01")
    public String getCmpy_addr_01(){
        return cmpy_addr_01;
    }

    @ElVoField(physicalName = "cmpy_addr_01")
    public void setCmpy_addr_01(String cmpy_addr_01){
        this.cmpy_addr_01 = cmpy_addr_01;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCustBaseInfoMntVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("enp_scd").append("=").append(enp_scd).append(",");
        sb.append("enp_scd_nm").append("=").append(enp_scd_nm).append(",");
        sb.append("supt_par").append("=").append(supt_par).append(",");
        sb.append("supt_inc").append("=").append(supt_inc).append(",");
        sb.append("supt_gbl").append("=").append(supt_gbl).append(",");
        sb.append("supt_rtl").append("=").append(supt_rtl).append(",");
        sb.append("cust_nm").append("=").append(cust_nm).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("cmpy_addr_01").append("=").append(cmpy_addr_01).append(",");
        sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel);
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
