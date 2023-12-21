package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatNoticeExp")
public class PatNoticeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatNoticeVo(){
    }

    @ElDtoField(logicalName = "notice_id", physicalName = "notice_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_id;

    @ElDtoField(logicalName = "wri_psn_syspayno", physicalName = "wri_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspayno;

    @ElDtoField(logicalName = "wri_daytm", physicalName = "wri_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_daytm;

    @ElDtoField(logicalName = "notice_ex", physicalName = "notice_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_ex;

    @ElDtoField(logicalName = "notice_title", physicalName = "notice_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_title;

    @ElDtoField(logicalName = "notice_comment", physicalName = "notice_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_comment;

    @ElDtoField(logicalName = "notice_attach_file", physicalName = "notice_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_attach_file;

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

    @ElDtoField(logicalName = "notice_start_date", physicalName = "notice_start_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_start_date;

    @ElDtoField(logicalName = "notice_end_date", physicalName = "notice_end_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_end_date;

    @ElDtoField(logicalName = "notice_period", physicalName = "notice_period", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_period;

    @ElDtoField(logicalName = "important", physicalName = "important", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String important;

    @ElDtoField(logicalName = "wri_psn_syspaynm", physicalName = "wri_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspaynm;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "notice_id")
    public String getNotice_id(){
        return notice_id;
    }

    @ElVoField(physicalName = "notice_id")
    public void setNotice_id(String notice_id){
        this.notice_id = notice_id;
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

    @ElVoField(physicalName = "notice_ex")
    public String getNotice_ex(){
        return notice_ex;
    }

    @ElVoField(physicalName = "notice_ex")
    public void setNotice_ex(String notice_ex){
        this.notice_ex = notice_ex;
    }

    @ElVoField(physicalName = "notice_title")
    public String getNotice_title(){
        return notice_title;
    }

    @ElVoField(physicalName = "notice_title")
    public void setNotice_title(String notice_title){
        this.notice_title = notice_title;
    }

    @ElVoField(physicalName = "notice_comment")
    public String getNotice_comment(){
        return notice_comment;
    }

    @ElVoField(physicalName = "notice_comment")
    public void setNotice_comment(String notice_comment){
        this.notice_comment = notice_comment;
    }

    @ElVoField(physicalName = "notice_attach_file")
    public String getNotice_attach_file(){
        return notice_attach_file;
    }

    @ElVoField(physicalName = "notice_attach_file")
    public void setNotice_attach_file(String notice_attach_file){
        this.notice_attach_file = notice_attach_file;
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

    @ElVoField(physicalName = "notice_start_date")
    public String getNotice_start_date(){
        return notice_start_date;
    }

    @ElVoField(physicalName = "notice_start_date")
    public void setNotice_start_date(String notice_start_date){
        this.notice_start_date = notice_start_date;
    }

    @ElVoField(physicalName = "notice_end_date")
    public String getNotice_end_date(){
        return notice_end_date;
    }

    @ElVoField(physicalName = "notice_end_date")
    public void setNotice_end_date(String notice_end_date){
        this.notice_end_date = notice_end_date;
    }

    @ElVoField(physicalName = "notice_period")
    public String getNotice_period(){
        return notice_period;
    }

    @ElVoField(physicalName = "notice_period")
    public void setNotice_period(String notice_period){
        this.notice_period = notice_period;
    }

    @ElVoField(physicalName = "important")
    public String getImportant(){
        return important;
    }

    @ElVoField(physicalName = "important")
    public void setImportant(String important){
        this.important = important;
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
        sb.append("PatNoticeVo [");
        sb.append("notice_id").append("=").append(notice_id).append(",");
        sb.append("wri_psn_syspayno").append("=").append(wri_psn_syspayno).append(",");
        sb.append("wri_daytm").append("=").append(wri_daytm).append(",");
        sb.append("notice_ex").append("=").append(notice_ex).append(",");
        sb.append("notice_title").append("=").append(notice_title).append(",");
        sb.append("notice_comment").append("=").append(notice_comment).append(",");
        sb.append("notice_attach_file").append("=").append(notice_attach_file).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("del_yn").append("=").append(del_yn).append(",");
        sb.append("notice_start_date").append("=").append(notice_start_date).append(",");
        sb.append("notice_end_date").append("=").append(notice_end_date).append(",");
        sb.append("notice_period").append("=").append(notice_period).append(",");
        sb.append("important").append("=").append(important).append(",");
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
