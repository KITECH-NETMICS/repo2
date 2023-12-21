package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴무일내역 Vo")
public class CtrBizTripRstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrBizTripRstVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_syspayno;

    @ElDtoField(logicalName = "출장자개인번호", physicalName = "biztrip_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_empno;

    @ElDtoField(logicalName = "출장자성명", physicalName = "biztrip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_nm;

    @ElDtoField(logicalName = "출장일자", physicalName = "biztrip_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_day;

    @ElDtoField(logicalName = "휴일", physicalName = "weekday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String weekday;

    @ElDtoField(logicalName = "요일No", physicalName = "day_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day_no;

    @ElDtoField(logicalName = "휴일여부", physicalName = "off_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String off_yn;

    @ElDtoField(logicalName = "요일구분", physicalName = "day_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day_clsf;

    @ElDtoField(logicalName = "휴일 비고", physicalName = "off_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String off_rmk;

    @ElDtoField(logicalName = "근무구분", physicalName = "rest_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rest_cd;

    @ElDtoField(logicalName = "대체유일", physicalName = "holiday_alt_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_alt_day;

    @ElDtoField(logicalName = "활동내역", physicalName = "detls_scheads", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_scheads;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_syspayno")
    public String getBiztrip_syspayno(){
        return biztrip_syspayno;
    }

    @ElVoField(physicalName = "biztrip_syspayno")
    public void setBiztrip_syspayno(String biztrip_syspayno){
        this.biztrip_syspayno = biztrip_syspayno;
    }

    @ElVoField(physicalName = "biztrip_empno")
    public String getBiztrip_empno(){
        return biztrip_empno;
    }

    @ElVoField(physicalName = "biztrip_empno")
    public void setBiztrip_empno(String biztrip_empno){
        this.biztrip_empno = biztrip_empno;
    }

    @ElVoField(physicalName = "biztrip_nm")
    public String getBiztrip_nm(){
        return biztrip_nm;
    }

    @ElVoField(physicalName = "biztrip_nm")
    public void setBiztrip_nm(String biztrip_nm){
        this.biztrip_nm = biztrip_nm;
    }

    @ElVoField(physicalName = "biztrip_day")
    public String getBiztrip_day(){
        return biztrip_day;
    }

    @ElVoField(physicalName = "biztrip_day")
    public void setBiztrip_day(String biztrip_day){
        this.biztrip_day = biztrip_day;
    }

    @ElVoField(physicalName = "weekday")
    public String getWeekday(){
        return weekday;
    }

    @ElVoField(physicalName = "weekday")
    public void setWeekday(String weekday){
        this.weekday = weekday;
    }

    @ElVoField(physicalName = "day_no")
    public String getDay_no(){
        return day_no;
    }

    @ElVoField(physicalName = "day_no")
    public void setDay_no(String day_no){
        this.day_no = day_no;
    }

    @ElVoField(physicalName = "off_yn")
    public String getOff_yn(){
        return off_yn;
    }

    @ElVoField(physicalName = "off_yn")
    public void setOff_yn(String off_yn){
        this.off_yn = off_yn;
    }

    @ElVoField(physicalName = "day_clsf")
    public String getDay_clsf(){
        return day_clsf;
    }

    @ElVoField(physicalName = "day_clsf")
    public void setDay_clsf(String day_clsf){
        this.day_clsf = day_clsf;
    }

    @ElVoField(physicalName = "off_rmk")
    public String getOff_rmk(){
        return off_rmk;
    }

    @ElVoField(physicalName = "off_rmk")
    public void setOff_rmk(String off_rmk){
        this.off_rmk = off_rmk;
    }

    @ElVoField(physicalName = "rest_cd")
    public String getRest_cd(){
        return rest_cd;
    }

    @ElVoField(physicalName = "rest_cd")
    public void setRest_cd(String rest_cd){
        this.rest_cd = rest_cd;
    }

    @ElVoField(physicalName = "holiday_alt_day")
    public String getHoliday_alt_day(){
        return holiday_alt_day;
    }

    @ElVoField(physicalName = "holiday_alt_day")
    public void setHoliday_alt_day(String holiday_alt_day){
        this.holiday_alt_day = holiday_alt_day;
    }

    @ElVoField(physicalName = "detls_scheads")
    public String getDetls_scheads(){
        return detls_scheads;
    }

    @ElVoField(physicalName = "detls_scheads")
    public void setDetls_scheads(String detls_scheads){
        this.detls_scheads = detls_scheads;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrBizTripRstVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_syspayno").append("=").append(biztrip_syspayno).append(",");
        sb.append("biztrip_empno").append("=").append(biztrip_empno).append(",");
        sb.append("biztrip_nm").append("=").append(biztrip_nm).append(",");
        sb.append("biztrip_day").append("=").append(biztrip_day).append(",");
        sb.append("weekday").append("=").append(weekday).append(",");
        sb.append("day_no").append("=").append(day_no).append(",");
        sb.append("off_yn").append("=").append(off_yn).append(",");
        sb.append("day_clsf").append("=").append(day_clsf).append(",");
        sb.append("off_rmk").append("=").append(off_rmk).append(",");
        sb.append("rest_cd").append("=").append(rest_cd).append(",");
        sb.append("holiday_alt_day").append("=").append(holiday_alt_day).append(",");
        sb.append("detls_scheads").append("=").append(detls_scheads).append(",");
        sb.append("rmk").append("=").append(rmk);
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
