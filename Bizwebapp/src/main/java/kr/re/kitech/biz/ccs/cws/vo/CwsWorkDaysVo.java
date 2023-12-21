package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkDaysVo")
public class CwsWorkDaysVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkDaysVo(){
    }

    @ElDtoField(logicalName = "근태코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "근무일수", physicalName = "work_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_days;

    @ElDtoField(logicalName = "직급코드", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "일수", physicalName = "day_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day_no;

    @ElDtoField(logicalName = "근태제외코드", physicalName = "except_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String except_cd;

    @ElDtoField(logicalName = "집중근무시간_목표", physicalName = "target_core_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_core_time;

    @ElDtoField(logicalName = "탄력근무시간_목표", physicalName = "target_flex_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_flex_time;

    @ElDtoField(logicalName = "근무시간합계_목표", physicalName = "target_total_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_total_time;

    @ElDtoField(logicalName = "기준시간외", physicalName = "std_over_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_over_time;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "work_days")
    public String getWork_days(){
        return work_days;
    }

    @ElVoField(physicalName = "work_days")
    public void setWork_days(String work_days){
        this.work_days = work_days;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "day_no")
    public String getDay_no(){
        return day_no;
    }

    @ElVoField(physicalName = "day_no")
    public void setDay_no(String day_no){
        this.day_no = day_no;
    }

    @ElVoField(physicalName = "except_cd")
    public String getExcept_cd(){
        return except_cd;
    }

    @ElVoField(physicalName = "except_cd")
    public void setExcept_cd(String except_cd){
        this.except_cd = except_cd;
    }

    @ElVoField(physicalName = "target_core_time")
    public String getTarget_core_time(){
        return target_core_time;
    }

    @ElVoField(physicalName = "target_core_time")
    public void setTarget_core_time(String target_core_time){
        this.target_core_time = target_core_time;
    }

    @ElVoField(physicalName = "target_flex_time")
    public String getTarget_flex_time(){
        return target_flex_time;
    }

    @ElVoField(physicalName = "target_flex_time")
    public void setTarget_flex_time(String target_flex_time){
        this.target_flex_time = target_flex_time;
    }

    @ElVoField(physicalName = "target_total_time")
    public String getTarget_total_time(){
        return target_total_time;
    }

    @ElVoField(physicalName = "target_total_time")
    public void setTarget_total_time(String target_total_time){
        this.target_total_time = target_total_time;
    }

    @ElVoField(physicalName = "std_over_time")
    public String getStd_over_time(){
        return std_over_time;
    }

    @ElVoField(physicalName = "std_over_time")
    public void setStd_over_time(String std_over_time){
        this.std_over_time = std_over_time;
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
        sb.append("CwsWorkDaysVo [");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("work_days").append("=").append(work_days).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("day_no").append("=").append(day_no).append(",");
        sb.append("except_cd").append("=").append(except_cd).append(",");
        sb.append("target_core_time").append("=").append(target_core_time).append(",");
        sb.append("target_flex_time").append("=").append(target_flex_time).append(",");
        sb.append("target_total_time").append("=").append(target_total_time).append(",");
        sb.append("std_over_time").append("=").append(std_over_time).append(",");
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
