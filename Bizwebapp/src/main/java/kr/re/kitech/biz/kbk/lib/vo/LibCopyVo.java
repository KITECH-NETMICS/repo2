package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사신청 Vo")
public class LibCopyVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibCopyVo(){
    }

    @ElDtoField(logicalName = "regst_no", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "origntxt_copy_typ", physicalName = "origntxt_copy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String origntxt_copy_typ;

    @ElDtoField(logicalName = "paper_nm_pat", physicalName = "paper_nm_pat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm_pat;

    @ElDtoField(logicalName = "jurnl_nm", physicalName = "jurnl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_nm;

    @ElDtoField(logicalName = "std_pat_no", physicalName = "std_pat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_pat_no;

    @ElDtoField(logicalName = "auth_nm", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "publ_yr", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "prcs_state", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "ymd_fr", physicalName = "ymd_fr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_fr;

    @ElDtoField(logicalName = "ymd_to", physicalName = "ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_to;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public String getOrigntxt_copy_typ(){
        return origntxt_copy_typ;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public void setOrigntxt_copy_typ(String origntxt_copy_typ){
        this.origntxt_copy_typ = origntxt_copy_typ;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public String getPaper_nm_pat(){
        return paper_nm_pat;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public void setPaper_nm_pat(String paper_nm_pat){
        this.paper_nm_pat = paper_nm_pat;
    }

    @ElVoField(physicalName = "jurnl_nm")
    public String getJurnl_nm(){
        return jurnl_nm;
    }

    @ElVoField(physicalName = "jurnl_nm")
    public void setJurnl_nm(String jurnl_nm){
        this.jurnl_nm = jurnl_nm;
    }

    @ElVoField(physicalName = "std_pat_no")
    public String getStd_pat_no(){
        return std_pat_no;
    }

    @ElVoField(physicalName = "std_pat_no")
    public void setStd_pat_no(String std_pat_no){
        this.std_pat_no = std_pat_no;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "ymd_fr")
    public String getYmd_fr(){
        return ymd_fr;
    }

    @ElVoField(physicalName = "ymd_fr")
    public void setYmd_fr(String ymd_fr){
        this.ymd_fr = ymd_fr;
    }

    @ElVoField(physicalName = "ymd_to")
    public String getYmd_to(){
        return ymd_to;
    }

    @ElVoField(physicalName = "ymd_to")
    public void setYmd_to(String ymd_to){
        this.ymd_to = ymd_to;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibCopyVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("origntxt_copy_typ").append("=").append(origntxt_copy_typ).append(",");
        sb.append("paper_nm_pat").append("=").append(paper_nm_pat).append(",");
        sb.append("jurnl_nm").append("=").append(jurnl_nm).append(",");
        sb.append("std_pat_no").append("=").append(std_pat_no).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("ymd_fr").append("=").append(ymd_fr).append(",");
        sb.append("ymd_to").append("=").append(ymd_to);
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
