package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사 팝업 Vo")
public class KbkPopCopyVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopCopyVo(){
    }

    @ElDtoField(logicalName = "regst_no", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "regst_ymd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "req_psn_syspaynm", physicalName = "req_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspaynm;

    @ElDtoField(logicalName = "req_psn_empno", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "origntxt_copy_typ", physicalName = "origntxt_copy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String origntxt_copy_typ;

    @ElDtoField(logicalName = "jurnl_nm", physicalName = "jurnl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_nm;

    @ElDtoField(logicalName = "paper_nm_pat", physicalName = "paper_nm_pat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm_pat;

    @ElDtoField(logicalName = "std_pat_no", physicalName = "std_pat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_pat_no;

    @ElDtoField(logicalName = "auth_nm", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "issu_agncy", physicalName = "issu_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_agncy;

    @ElDtoField(logicalName = "publ_yr", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "vol", physicalName = "vol", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vol;

    @ElDtoField(logicalName = "no", physicalName = "no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no;

    @ElDtoField(logicalName = "orign_page", physicalName = "orign_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orign_page;

    @ElDtoField(logicalName = "end_page", physicalName = "end_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_page;

    @ElDtoField(logicalName = "req_scop", physicalName = "req_scop", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_scop;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_no_nm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accnt_expir_ymd", physicalName = "accnt_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_expir_ymd;

    @ElDtoField(logicalName = "cycle_item", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "attach_file_nm", physicalName = "attach_file_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_nm;

    @ElDtoField(logicalName = "prcs_state", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "rcpt_ymd", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "prcs_complt_ymd", physicalName = "prcs_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_complt_ymd;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flag;

    @ElDtoField(logicalName = "loan_psn_syspayno", physicalName = "loan_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public String getReq_psn_syspaynm(){
        return req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public void setReq_psn_syspaynm(String req_psn_syspaynm){
        this.req_psn_syspaynm = req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public String getOrigntxt_copy_typ(){
        return origntxt_copy_typ;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public void setOrigntxt_copy_typ(String origntxt_copy_typ){
        this.origntxt_copy_typ = origntxt_copy_typ;
    }

    @ElVoField(physicalName = "jurnl_nm")
    public String getJurnl_nm(){
        return jurnl_nm;
    }

    @ElVoField(physicalName = "jurnl_nm")
    public void setJurnl_nm(String jurnl_nm){
        this.jurnl_nm = jurnl_nm;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public String getPaper_nm_pat(){
        return paper_nm_pat;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public void setPaper_nm_pat(String paper_nm_pat){
        this.paper_nm_pat = paper_nm_pat;
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

    @ElVoField(physicalName = "issu_agncy")
    public String getIssu_agncy(){
        return issu_agncy;
    }

    @ElVoField(physicalName = "issu_agncy")
    public void setIssu_agncy(String issu_agncy){
        this.issu_agncy = issu_agncy;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "vol")
    public String getVol(){
        return vol;
    }

    @ElVoField(physicalName = "vol")
    public void setVol(String vol){
        this.vol = vol;
    }

    @ElVoField(physicalName = "no")
    public String getNo(){
        return no;
    }

    @ElVoField(physicalName = "no")
    public void setNo(String no){
        this.no = no;
    }

    @ElVoField(physicalName = "orign_page")
    public String getOrign_page(){
        return orign_page;
    }

    @ElVoField(physicalName = "orign_page")
    public void setOrign_page(String orign_page){
        this.orign_page = orign_page;
    }

    @ElVoField(physicalName = "end_page")
    public String getEnd_page(){
        return end_page;
    }

    @ElVoField(physicalName = "end_page")
    public void setEnd_page(String end_page){
        this.end_page = end_page;
    }

    @ElVoField(physicalName = "req_scop")
    public String getReq_scop(){
        return req_scop;
    }

    @ElVoField(physicalName = "req_scop")
    public void setReq_scop(String req_scop){
        this.req_scop = req_scop;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_expir_ymd")
    public String getAccnt_expir_ymd(){
        return accnt_expir_ymd;
    }

    @ElVoField(physicalName = "accnt_expir_ymd")
    public void setAccnt_expir_ymd(String accnt_expir_ymd){
        this.accnt_expir_ymd = accnt_expir_ymd;
    }

    @ElVoField(physicalName = "cycle_item")
    public String getCycle_item(){
        return cycle_item;
    }

    @ElVoField(physicalName = "cycle_item")
    public void setCycle_item(String cycle_item){
        this.cycle_item = cycle_item;
    }

    @ElVoField(physicalName = "attach_file_nm")
    public String getAttach_file_nm(){
        return attach_file_nm;
    }

    @ElVoField(physicalName = "attach_file_nm")
    public void setAttach_file_nm(String attach_file_nm){
        this.attach_file_nm = attach_file_nm;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "prcs_complt_ymd")
    public String getPrcs_complt_ymd(){
        return prcs_complt_ymd;
    }

    @ElVoField(physicalName = "prcs_complt_ymd")
    public void setPrcs_complt_ymd(String prcs_complt_ymd){
        this.prcs_complt_ymd = prcs_complt_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        return flag;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public String getLoan_psn_syspayno(){
        return loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public void setLoan_psn_syspayno(String loan_psn_syspayno){
        this.loan_psn_syspayno = loan_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopCopyVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_syspaynm").append("=").append(req_psn_syspaynm).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("origntxt_copy_typ").append("=").append(origntxt_copy_typ).append(",");
        sb.append("jurnl_nm").append("=").append(jurnl_nm).append(",");
        sb.append("paper_nm_pat").append("=").append(paper_nm_pat).append(",");
        sb.append("std_pat_no").append("=").append(std_pat_no).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("issu_agncy").append("=").append(issu_agncy).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("vol").append("=").append(vol).append(",");
        sb.append("no").append("=").append(no).append(",");
        sb.append("orign_page").append("=").append(orign_page).append(",");
        sb.append("end_page").append("=").append(end_page).append(",");
        sb.append("req_scop").append("=").append(req_scop).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_expir_ymd").append("=").append(accnt_expir_ymd).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("attach_file_nm").append("=").append(attach_file_nm).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("prcs_complt_ymd").append("=").append(prcs_complt_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("loan_psn_syspayno").append("=").append(loan_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm);
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
