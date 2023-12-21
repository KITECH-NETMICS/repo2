package kr.re.kitech.biz.pat.pbd.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatNoticeExp")
public class PatFaqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatFaqVo(){
    }

    @ElDtoField(logicalName = "faq_id", physicalName = "faq_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String faq_id;

    @ElDtoField(logicalName = "wri_psn_syspayno", physicalName = "wri_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspayno;

    @ElDtoField(logicalName = "wri_daytm", physicalName = "wri_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_daytm;

    @ElDtoField(logicalName = "faq_title", physicalName = "faq_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String faq_title;

    @ElDtoField(logicalName = "faq_comment", physicalName = "faq_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String faq_comment;

    @ElDtoField(logicalName = "faq_attach_file", physicalName = "faq_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String faq_attach_file;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "del_yn", physicalName = "del_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_yn;

    @ElDtoField(logicalName = "wri_psn_syspaynm", physicalName = "wri_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspaynm;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "faq_id")
    public String getFaq_id(){
        return faq_id;
    }

    @ElVoField(physicalName = "faq_id")
    public void setFaq_id(String faq_id){
        this.faq_id = faq_id;
    }

    @ElVoField(physicalName = "wri_psn_syspayno")
    public String getWri_psn_syspayno(){
        return wri_psn_syspayno;
    }

    @ElVoField(physicalName = "wri_psn_syspayno")
    public void setWri_psn_syspayno(String wri_psn_syspayno){
        this.wri_psn_syspayno = wri_psn_syspayno;
    }

    @ElVoField(physicalName = "wri_daytm")
    public String getWri_daytm(){
        return wri_daytm;
    }

    @ElVoField(physicalName = "wri_daytm")
    public void setWri_daytm(String wri_daytm){
        this.wri_daytm = wri_daytm;
    }

    @ElVoField(physicalName = "faq_title")
    public String getFaq_title(){
        return faq_title;
    }

    @ElVoField(physicalName = "faq_title")
    public void setFaq_title(String faq_title){
        this.faq_title = faq_title;
    }

    @ElVoField(physicalName = "faq_comment")
    public String getFaq_comment(){
        return faq_comment;
    }

    @ElVoField(physicalName = "faq_comment")
    public void setFaq_comment(String faq_comment){
        this.faq_comment = faq_comment;
    }

    @ElVoField(physicalName = "faq_attach_file")
    public String getFaq_attach_file(){
        return faq_attach_file;
    }

    @ElVoField(physicalName = "faq_attach_file")
    public void setFaq_attach_file(String faq_attach_file){
        this.faq_attach_file = faq_attach_file;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "del_yn")
    public String getDel_yn(){
        return del_yn;
    }

    @ElVoField(physicalName = "del_yn")
    public void setDel_yn(String del_yn){
        this.del_yn = del_yn;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public String getWri_psn_syspaynm(){
        return wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public void setWri_psn_syspaynm(String wri_psn_syspaynm){
        this.wri_psn_syspaynm = wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatFaqVo [");
        sb.append("faq_id").append("=").append(faq_id).append(",");
        sb.append("wri_psn_syspayno").append("=").append(wri_psn_syspayno).append(",");
        sb.append("wri_daytm").append("=").append(wri_daytm).append(",");
        sb.append("faq_title").append("=").append(faq_title).append(",");
        sb.append("faq_comment").append("=").append(faq_comment).append(",");
        sb.append("faq_attach_file").append("=").append(faq_attach_file).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("del_yn").append("=").append(del_yn).append(",");
        sb.append("wri_psn_syspaynm").append("=").append(wri_psn_syspaynm).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("empno").append("=").append(empno);
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
