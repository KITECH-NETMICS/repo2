package kr.re.kitech.biz.kbk.etc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사관리입력VO")
public class EtcOrgPprCpyInpVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EtcOrgPprCpyInpVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "원문명", physicalName = "paper_nm_pat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm_pat;

    @ElDtoField(logicalName = "신청조회시작날짜", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "신청조회종료날짜", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "신청종류", physicalName = "origntxt_copy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String origntxt_copy_typ;

    @ElDtoField(logicalName = "진행상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspaynm;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public String getPaper_nm_pat(){
        return paper_nm_pat;
    }

    @ElVoField(physicalName = "paper_nm_pat")
    public void setPaper_nm_pat(String paper_nm_pat){
        this.paper_nm_pat = paper_nm_pat;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public String getOrigntxt_copy_typ(){
        return origntxt_copy_typ;
    }

    @ElVoField(physicalName = "origntxt_copy_typ")
    public void setOrigntxt_copy_typ(String origntxt_copy_typ){
        this.origntxt_copy_typ = origntxt_copy_typ;
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

    @ElVoField(physicalName = "req_psn_syspaynm")
    public String getReq_psn_syspaynm(){
        return req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public void setReq_psn_syspaynm(String req_psn_syspaynm){
        this.req_psn_syspaynm = req_psn_syspaynm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkBookPprCpyInpVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("paper_nm_pat").append("=").append(paper_nm_pat).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("origntxt_copy_typ").append("=").append(origntxt_copy_typ).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_syspaynm").append("=").append(req_psn_syspaynm);
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
