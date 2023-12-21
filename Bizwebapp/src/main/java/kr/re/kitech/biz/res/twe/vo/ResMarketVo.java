package kr.re.kitech.biz.res.twe.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResMarketExp")
public class ResMarketVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResMarketVo(){
    }

    @ElDtoField(logicalName = "reg_no", physicalName = "reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_no;

    @ElDtoField(logicalName = "title_ko", physicalName = "title_ko", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title_ko;

    @ElDtoField(logicalName = "title_en", physicalName = "title_en", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String title_en;

    @ElDtoField(logicalName = "industry_area_cd", physicalName = "industry_area_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String industry_area_cd;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "author", physicalName = "author", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String author;

    @ElDtoField(logicalName = "publisher", physicalName = "publisher", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publisher;

    @ElDtoField(logicalName = "publish_date", physicalName = "publish_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publish_date;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "open_yn", physicalName = "open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_yn;

    @ElDtoField(logicalName = "open_yn_nm", physicalName = "open_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_yn_nm;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "wri_psn_syspaynm", physicalName = "wri_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspaynm;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "del_yn", physicalName = "del_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_yn;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "contnt", physicalName = "contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "reg_no")
    public String getReg_no(){
        return reg_no;
    }

    @ElVoField(physicalName = "reg_no")
    public void setReg_no(String reg_no){
        this.reg_no = reg_no;
    }

    @ElVoField(physicalName = "title_ko")
    public String getTitle_ko(){
        return title_ko;
    }

    @ElVoField(physicalName = "title_ko")
    public void setTitle_ko(String title_ko){
        this.title_ko = title_ko;
    }

    @ElVoField(physicalName = "title_en")
    public String getTitle_en(){
        return title_en;
    }

    @ElVoField(physicalName = "title_en")
    public void setTitle_en(String title_en){
        this.title_en = title_en;
    }

    @ElVoField(physicalName = "industry_area_cd")
    public String getIndustry_area_cd(){
        return industry_area_cd;
    }

    @ElVoField(physicalName = "industry_area_cd")
    public void setIndustry_area_cd(String industry_area_cd){
        this.industry_area_cd = industry_area_cd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
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

    @ElVoField(physicalName = "publish_date")
    public String getPublish_date(){
        return publish_date;
    }

    @ElVoField(physicalName = "publish_date")
    public void setPublish_date(String publish_date){
        this.publish_date = publish_date;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "open_yn")
    public String getOpen_yn(){
        return open_yn;
    }

    @ElVoField(physicalName = "open_yn")
    public void setOpen_yn(String open_yn){
        this.open_yn = open_yn;
    }

    @ElVoField(physicalName = "open_yn_nm")
    public String getOpen_yn_nm(){
        return open_yn_nm;
    }

    @ElVoField(physicalName = "open_yn_nm")
    public void setOpen_yn_nm(String open_yn_nm){
        this.open_yn_nm = open_yn_nm;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public String getWri_psn_syspaynm(){
        return wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public void setWri_psn_syspaynm(String wri_psn_syspaynm){
        this.wri_psn_syspaynm = wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "del_yn")
    public String getDel_yn(){
        return del_yn;
    }

    @ElVoField(physicalName = "del_yn")
    public void setDel_yn(String del_yn){
        this.del_yn = del_yn;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "contnt")
    public String getContnt(){
        return contnt;
    }

    @ElVoField(physicalName = "contnt")
    public void setContnt(String contnt){
        this.contnt = contnt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResMarketVo [");
        sb.append("reg_no").append("=").append(reg_no).append(",");
        sb.append("title_ko").append("=").append(title_ko).append(",");
        sb.append("title_en").append("=").append(title_en).append(",");
        sb.append("industry_area_cd").append("=").append(industry_area_cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("author").append("=").append(author).append(",");
        sb.append("publisher").append("=").append(publisher).append(",");
        sb.append("publish_date").append("=").append(publish_date).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("open_yn").append("=").append(open_yn).append(",");
        sb.append("open_yn_nm").append("=").append(open_yn_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("wri_psn_syspaynm").append("=").append(wri_psn_syspaynm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("del_yn").append("=").append(del_yn).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("contnt").append("=").append(contnt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
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
