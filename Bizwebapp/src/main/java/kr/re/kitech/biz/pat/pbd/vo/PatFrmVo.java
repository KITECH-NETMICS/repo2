package kr.re.kitech.biz.pat.pbd.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatNoticeExp")
public class PatFrmVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatFrmVo(){
    }

    @ElDtoField(logicalName = "frm_id", physicalName = "frm_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_id;

    @ElDtoField(logicalName = "wri_psn_syspayno", physicalName = "wri_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspayno;

    @ElDtoField(logicalName = "wri_daytm", physicalName = "wri_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_daytm;

    @ElDtoField(logicalName = "frm_title", physicalName = "frm_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_title;

    @ElDtoField(logicalName = "frm_comment", physicalName = "frm_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_comment;

    @ElDtoField(logicalName = "frm_attach_file", physicalName = "frm_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_attach_file;

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

    @ElVoField(physicalName = "frm_id")
    public String getFrm_id(){
        return frm_id;
    }

    @ElVoField(physicalName = "frm_id")
    public void setFaq_id(String frm_id){
        this.frm_id = frm_id;
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

    @ElVoField(physicalName = "frm_title")
    public String getFaq_title(){
        return frm_title;
    }

    @ElVoField(physicalName = "frm_title")
    public void setFaq_title(String frm_title){
        this.frm_title = frm_title;
    }

    @ElVoField(physicalName = "frm_comment")
    public String getFaq_comment(){
        return frm_comment;
    }

    @ElVoField(physicalName = "frm_comment")
    public void setFaq_comment(String frm_comment){
        this.frm_comment = frm_comment;
    }

    @ElVoField(physicalName = "frm_attach_file")
    public String getFaq_attach_file(){
        return frm_attach_file;
    }

    @ElVoField(physicalName = "frm_attach_file")
    public void setFaq_attach_file(String frm_attach_file){
        this.frm_attach_file = frm_attach_file;
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
        sb.append("PatFrmVo [");
        sb.append("frm_id").append("=").append(frm_id).append(",");
        sb.append("wri_psn_syspayno").append("=").append(wri_psn_syspayno).append(",");
        sb.append("wri_daytm").append("=").append(wri_daytm).append(",");
        sb.append("frm_title").append("=").append(frm_title).append(",");
        sb.append("frm_comment").append("=").append(frm_comment).append(",");
        sb.append("frm_attach_file").append("=").append(frm_attach_file).append(",");
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
