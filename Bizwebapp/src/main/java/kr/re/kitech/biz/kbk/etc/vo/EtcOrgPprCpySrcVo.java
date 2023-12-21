package kr.re.kitech.biz.kbk.etc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사관리조회VO")
public class EtcOrgPprCpySrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EtcOrgPprCpySrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "신청일자", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청종류 ", physicalName = "origntxt_copy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String origntxt_copy_typ;

    @ElDtoField(logicalName = "신청종류명", physicalName = "origntxt_copy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String origntxt_copy_nm;

    @ElDtoField(logicalName = "원문명", physicalName = "paper_nm_pat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm_pat;

    @ElDtoField(logicalName = "규격번호", physicalName = "std_pat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_pat_no;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "처리상태명", physicalName = "prcs_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state_nm;

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

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public String getOrigntxt_copy_typ(){
        return origntxt_copy_typ;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public void setOrigntxt_copy_typ(String origntxt_copy_typ){
        this.origntxt_copy_typ = origntxt_copy_typ;
    }

    @ElVoField(physicalName = "origntxt_copy_nm")
    public String getOrigntxt_copy_nm(){
        return origntxt_copy_nm;
    }

    @ElVoField(physicalName = "origntxt_copy_nm")
    public void setOrigntxt_copy_nm(String origntxt_copy_nm){
        this.origntxt_copy_nm = origntxt_copy_nm;
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

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public String getPrcs_state_nm(){
        return prcs_state_nm;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public void setPrcs_state_nm(String prcs_state_nm){
        this.prcs_state_nm = prcs_state_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EtcOrgPprCpySrcVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("origntxt_copy_typ").append("=").append(origntxt_copy_typ).append(",");
        sb.append("origntxt_copy_nm").append("=").append(origntxt_copy_nm).append(",");
        sb.append("paper_nm_pat").append("=").append(paper_nm_pat).append(",");
        sb.append("std_pat_no").append("=").append(std_pat_no).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("prcs_state_nm").append("=").append(prcs_state_nm);
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
