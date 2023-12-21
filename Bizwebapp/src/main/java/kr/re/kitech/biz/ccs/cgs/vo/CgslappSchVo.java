package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappSchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappSchVo(){
    }

    @ElDtoField(logicalName = "휴가시작일자_시작", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "휴가시작일자_종료", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "신청자부서코드", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "휴가구분", physicalName = "holiday_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_clsf;

    @ElDtoField(logicalName = "결재상테", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "시스템사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "휴가구분값", physicalName = "src_gubn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String src_gubn;

    @ElDtoField(logicalName = "미승인연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal_yr;

    @ElDtoField(logicalName = "신청자사번", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "연도", physicalName = "year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_day;

    @ElDtoField(logicalName = "종료일자", physicalName = "close_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String close_day;

    @ElDtoField(logicalName = "휴가원신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "엑셀Provider다운로드여부", physicalName = "isExcel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean isExcel;

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

    @ElVoField(physicalName = "req_psn_dept_cd")
    public String getReq_psn_dept_cd(){
        return req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public void setReq_psn_dept_cd(String req_psn_dept_cd){
        this.req_psn_dept_cd = req_psn_dept_cd;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public String getHoliday_clsf(){
        return holiday_clsf;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public void setHoliday_clsf(String holiday_clsf){
        this.holiday_clsf = holiday_clsf;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "src_gubn")
    public String getSrc_gubn(){
        return src_gubn;
    }

    @ElVoField(physicalName = "src_gubn")
    public void setSrc_gubn(String src_gubn){
        this.src_gubn = src_gubn;
    }

    @ElVoField(physicalName = "anal_yr")
    public String getAnal_yr(){
        return anal_yr;
    }

    @ElVoField(physicalName = "anal_yr")
    public void setAnal_yr(String anal_yr){
        this.anal_yr = anal_yr;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "year")
    public String getYear(){
        return year;
    }

    @ElVoField(physicalName = "year")
    public void setYear(String year){
        this.year = year;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "start_day")
    public String getStart_day(){
        return start_day;
    }

    @ElVoField(physicalName = "start_day")
    public void setStart_day(String start_day){
        this.start_day = start_day;
    }

    @ElVoField(physicalName = "close_day")
    public String getClose_day(){
        return close_day;
    }

    @ElVoField(physicalName = "close_day")
    public void setClose_day(String close_day){
        this.close_day = close_day;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "isExcel")
    public boolean isIsExcel(){
        return isExcel;
    }

    @ElVoField(physicalName = "isExcel")
    public void setIsExcel(boolean isExcel){
        this.isExcel = isExcel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappSchVo [");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("holiday_clsf").append("=").append(holiday_clsf).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("src_gubn").append("=").append(src_gubn).append(",");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("year").append("=").append(year).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("start_day").append("=").append(start_day).append(",");
        sb.append("close_day").append("=").append(close_day).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("isExcel").append("=").append(isExcel);
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
