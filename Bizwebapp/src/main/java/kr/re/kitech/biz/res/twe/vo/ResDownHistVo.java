package kr.re.kitech.biz.res.twe.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResDownHistExp")
public class ResDownHistVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResDownHistVo(){
    }

    @ElDtoField(logicalName = "mng_no", physicalName = "mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mng_no;

    @ElDtoField(logicalName = "reg_no", physicalName = "reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_no;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "attach_file_nm", physicalName = "attach_file_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_nm;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "title_ko", physicalName = "title_ko", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title_ko;

    @ElDtoField(logicalName = "author", physicalName = "author", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String author;

    @ElDtoField(logicalName = "publisher", physicalName = "publisher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publisher;

    @ElDtoField(logicalName = "industry_area_cd", physicalName = "industry_area_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String industry_area_cd;

    @ElDtoField(logicalName = "industry_area_nm", physicalName = "industry_area_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String industry_area_nm;

    @ElDtoField(logicalName = "start_date", physicalName = "start_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_date;

    @ElDtoField(logicalName = "end_date", physicalName = "end_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_date;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "wri_psn_syspaynm", physicalName = "wri_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspaynm;

    @ElVoField(physicalName = "mng_no")
    public String getMng_no(){
        return mng_no;
    }

    @ElVoField(physicalName = "mng_no")
    public void setMng_no(String mng_no){
        this.mng_no = mng_no;
    }

    @ElVoField(physicalName = "reg_no")
    public String getReg_no(){
        return reg_no;
    }

    @ElVoField(physicalName = "reg_no")
    public void setReg_no(String reg_no){
        this.reg_no = reg_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_nm")
    public String getAttach_file_nm(){
        return attach_file_nm;
    }

    @ElVoField(physicalName = "attach_file_nm")
    public void setAttach_file_nm(String attach_file_nm){
        this.attach_file_nm = attach_file_nm;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "title_ko")
    public String getTitle_ko(){
        return title_ko;
    }

    @ElVoField(physicalName = "title_ko")
    public void setTitle_ko(String title_ko){
        this.title_ko = title_ko;
    }

    @ElVoField(physicalName = "author")
    public String getAuthor(){
        return author;
    }

    @ElVoField(physicalName = "author")
    public void setAuthor(String author){
        this.author = author;
    }

    @ElVoField(physicalName = "publisher")
    public String getPublisher(){
        return publisher;
    }

    @ElVoField(physicalName = "publisher")
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    @ElVoField(physicalName = "industry_area_cd")
    public String getIndustry_area_cd(){
        return industry_area_cd;
    }

    @ElVoField(physicalName = "industry_area_cd")
    public void setIndustry_area_cd(String industry_area_cd){
        this.industry_area_cd = industry_area_cd;
    }

    @ElVoField(physicalName = "industry_area_nm")
    public String getIndustry_area_nm(){
        return industry_area_nm;
    }

    @ElVoField(physicalName = "industry_area_nm")
    public void setIndustry_area_nm(String industry_area_nm){
        this.industry_area_nm = industry_area_nm;
    }

    @ElVoField(physicalName = "start_date")
    public String getStart_date(){
        return start_date;
    }

    @ElVoField(physicalName = "start_date")
    public void setStart_date(String start_date){
        this.start_date = start_date;
    }

    @ElVoField(physicalName = "end_date")
    public String getEnd_date(){
        return end_date;
    }

    @ElVoField(physicalName = "end_date")
    public void setEnd_date(String end_date){
        this.end_date = end_date;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public String getWri_psn_syspaynm(){
        return wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public void setWri_psn_syspaynm(String wri_psn_syspaynm){
        this.wri_psn_syspaynm = wri_psn_syspaynm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResDownHistVo [");
        sb.append("mng_no").append("=").append(mng_no).append(",");
        sb.append("reg_no").append("=").append(reg_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_nm").append("=").append(attach_file_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("title_ko").append("=").append(title_ko).append(",");
        sb.append("author").append("=").append(author).append(",");
        sb.append("publisher").append("=").append(publisher).append(",");
        sb.append("industry_area_cd").append("=").append(industry_area_cd).append(",");
        sb.append("industry_area_nm").append("=").append(industry_area_nm).append(",");
        sb.append("start_date").append("=").append(start_date).append(",");
        sb.append("end_date").append("=").append(end_date).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("wri_psn_syspaynm").append("=").append(wri_psn_syspaynm);
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
