package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkTimeDays")
public class CwsWorkTimeDaysFlexVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeDaysFlexVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "년월", physicalName = "년월", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String 년월;

    @ElDtoField(logicalName = "기준일", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String basedate;

    @ElDtoField(logicalName = "기준년월일", physicalName = "base_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_ymd;

    @ElDtoField(logicalName = "월일(요일)", physicalName = "base_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_date;

    @ElDtoField(logicalName = "출근시간", physicalName = "attend_at", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_at;

    @ElDtoField(logicalName = "퇴근시간", physicalName = "leave_at", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String leave_at;

    @ElDtoField(logicalName = "근무형태", physicalName = "work_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_type;

    @ElDtoField(logicalName = "비고", physicalName = "off_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String off_rmk;

    @ElDtoField(logicalName = "근무합계시간", physicalName = "sum_wrk_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_wrk_time;

    @ElDtoField(logicalName = "탄력오전근무", physicalName = "flex_am_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_am_time;

    @ElDtoField(logicalName = "집중오전근무", physicalName = "core_am_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String core_am_time;

    @ElDtoField(logicalName = "집증오후근무", physicalName = "core_pm_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String core_pm_time;

    @ElDtoField(logicalName = "탄력오후근무", physicalName = "flex_pm_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_pm_time;

    @ElDtoField(logicalName = "탄력저녁근무", physicalName = "flex_nt_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_nt_time;

    @ElDtoField(logicalName = "연장오전근무", physicalName = "over_am_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String over_am_time;

    @ElDtoField(logicalName = "연장오후근무", physicalName = "over_pm_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String over_pm_time;

    @ElDtoField(logicalName = "휴가근무여부", physicalName = "is_holwork", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_holwork;

    @ElDtoField(logicalName = "출장근무여부", physicalName = "is_ctrwork", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_ctrwork;

    @ElDtoField(logicalName = "연장근무여부", physicalName = "is_extwork", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_extwork;

    @ElDtoField(logicalName = "휴일여부", physicalName = "is_holiday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_holiday;

    @ElDtoField(logicalName = "수정종류", physicalName = "modify_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String modify_kind;

    @ElDtoField(logicalName = "탄력오전휴계", physicalName = "flex_am_rest", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_am_rest;

    @ElDtoField(logicalName = "탄력오후휴계", physicalName = "flex_pm_rest", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_pm_rest;

    @ElDtoField(logicalName = "탄력저녁휴계", physicalName = "flex_nt_rest", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_nt_rest;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "년월")
    public String get년월(){
        return 년월;
    }

    @ElVoField(physicalName = "년월")
    public void set년월(String 년월){
        this.년월 = 년월;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        return basedate;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @ElVoField(physicalName = "base_ymd")
    public String getBase_ymd(){
        return base_ymd;
    }

    @ElVoField(physicalName = "base_ymd")
    public void setBase_ymd(String base_ymd){
        this.base_ymd = base_ymd;
    }

    @ElVoField(physicalName = "base_date")
    public String getBase_date(){
        return base_date;
    }

    @ElVoField(physicalName = "base_date")
    public void setBase_date(String base_date){
        this.base_date = base_date;
    }

    @ElVoField(physicalName = "attend_at")
    public String getAttend_at(){
        return attend_at;
    }

    @ElVoField(physicalName = "attend_at")
    public void setAttend_at(String attend_at){
        this.attend_at = attend_at;
    }

    @ElVoField(physicalName = "leave_at")
    public String getLeave_at(){
        return leave_at;
    }

    @ElVoField(physicalName = "leave_at")
    public void setLeave_at(String leave_at){
        this.leave_at = leave_at;
    }

    @ElVoField(physicalName = "work_type")
    public String getWork_type(){
        return work_type;
    }

    @ElVoField(physicalName = "work_type")
    public void setWork_type(String work_type){
        this.work_type = work_type;
    }

    @ElVoField(physicalName = "off_rmk")
    public String getOff_rmk(){
        return off_rmk;
    }

    @ElVoField(physicalName = "off_rmk")
    public void setOff_rmk(String off_rmk){
        this.off_rmk = off_rmk;
    }

    @ElVoField(physicalName = "sum_wrk_time")
    public String getSum_wrk_time(){
        return sum_wrk_time;
    }

    @ElVoField(physicalName = "sum_wrk_time")
    public void setSum_wrk_time(String sum_wrk_time){
        this.sum_wrk_time = sum_wrk_time;
    }

    @ElVoField(physicalName = "flex_am_time")
    public String getFlex_am_time(){
        return flex_am_time;
    }

    @ElVoField(physicalName = "flex_am_time")
    public void setFlex_am_time(String flex_am_time){
        this.flex_am_time = flex_am_time;
    }

    @ElVoField(physicalName = "core_am_time")
    public String getCore_am_time(){
        return core_am_time;
    }

    @ElVoField(physicalName = "core_am_time")
    public void setCore_am_time(String core_am_time){
        this.core_am_time = core_am_time;
    }

    @ElVoField(physicalName = "core_pm_time")
    public String getCore_pm_time(){
        return core_pm_time;
    }

    @ElVoField(physicalName = "core_pm_time")
    public void setCore_pm_time(String core_pm_time){
        this.core_pm_time = core_pm_time;
    }

    @ElVoField(physicalName = "flex_pm_time")
    public String getFlex_pm_time(){
        return flex_pm_time;
    }

    @ElVoField(physicalName = "flex_pm_time")
    public void setFlex_pm_time(String flex_pm_time){
        this.flex_pm_time = flex_pm_time;
    }

    @ElVoField(physicalName = "flex_nt_time")
    public String getFlex_nt_time(){
        return flex_nt_time;
    }

    @ElVoField(physicalName = "flex_nt_time")
    public void setFlex_nt_time(String flex_nt_time){
        this.flex_nt_time = flex_nt_time;
    }

    @ElVoField(physicalName = "over_am_time")
    public String getOver_am_time(){
        return over_am_time;
    }

    @ElVoField(physicalName = "over_am_time")
    public void setOver_am_time(String over_am_time){
        this.over_am_time = over_am_time;
    }

    @ElVoField(physicalName = "over_pm_time")
    public String getOver_pm_time(){
        return over_pm_time;
    }

    @ElVoField(physicalName = "over_pm_time")
    public void setOver_pm_time(String over_pm_time){
        this.over_pm_time = over_pm_time;
    }

    @ElVoField(physicalName = "is_holwork")
    public String getIs_holwork(){
        return is_holwork;
    }

    @ElVoField(physicalName = "is_holwork")
    public void setIs_holwork(String is_holwork){
        this.is_holwork = is_holwork;
    }

    @ElVoField(physicalName = "is_ctrwork")
    public String getIs_ctrwork(){
        return is_ctrwork;
    }

    @ElVoField(physicalName = "is_ctrwork")
    public void setIs_ctrwork(String is_ctrwork){
        this.is_ctrwork = is_ctrwork;
    }

    @ElVoField(physicalName = "is_extwork")
    public String getIs_extwork(){
        return is_extwork;
    }

    @ElVoField(physicalName = "is_extwork")
    public void setIs_extwork(String is_extwork){
        this.is_extwork = is_extwork;
    }

    @ElVoField(physicalName = "is_holiday")
    public String getIs_holiday(){
        return is_holiday;
    }

    @ElVoField(physicalName = "is_holiday")
    public void setIs_holiday(String is_holiday){
        this.is_holiday = is_holiday;
    }

    @ElVoField(physicalName = "modify_kind")
    public String getModify_kind(){
        return modify_kind;
    }

    @ElVoField(physicalName = "modify_kind")
    public void setModify_kind(String modify_kind){
        this.modify_kind = modify_kind;
    }

    @ElVoField(physicalName = "flex_am_rest")
    public String getFlex_am_rest(){
        return flex_am_rest;
    }

    @ElVoField(physicalName = "flex_am_rest")
    public void setFlex_am_rest(String flex_am_rest){
        this.flex_am_rest = flex_am_rest;
    }

    @ElVoField(physicalName = "flex_pm_rest")
    public String getFlex_pm_rest(){
        return flex_pm_rest;
    }

    @ElVoField(physicalName = "flex_pm_rest")
    public void setFlex_pm_rest(String flex_pm_rest){
        this.flex_pm_rest = flex_pm_rest;
    }

    @ElVoField(physicalName = "flex_nt_rest")
    public String getFlex_nt_rest(){
        return flex_nt_rest;
    }

    @ElVoField(physicalName = "flex_nt_rest")
    public void setFlex_nt_rest(String flex_nt_rest){
        this.flex_nt_rest = flex_nt_rest;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeDaysFlexVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("년월").append("=").append(년월).append(",");
        sb.append("basedate").append("=").append(basedate).append(",");
        sb.append("base_ymd").append("=").append(base_ymd).append(",");
        sb.append("base_date").append("=").append(base_date).append(",");
        sb.append("attend_at").append("=").append(attend_at).append(",");
        sb.append("leave_at").append("=").append(leave_at).append(",");
        sb.append("work_type").append("=").append(work_type).append(",");
        sb.append("off_rmk").append("=").append(off_rmk).append(",");
        sb.append("sum_wrk_time").append("=").append(sum_wrk_time).append(",");
        sb.append("flex_am_time").append("=").append(flex_am_time).append(",");
        sb.append("core_am_time").append("=").append(core_am_time).append(",");
        sb.append("core_pm_time").append("=").append(core_pm_time).append(",");
        sb.append("flex_pm_time").append("=").append(flex_pm_time).append(",");
        sb.append("flex_nt_time").append("=").append(flex_nt_time).append(",");
        sb.append("over_am_time").append("=").append(over_am_time).append(",");
        sb.append("over_pm_time").append("=").append(over_pm_time).append(",");
        sb.append("is_holwork").append("=").append(is_holwork).append(",");
        sb.append("is_ctrwork").append("=").append(is_ctrwork).append(",");
        sb.append("is_extwork").append("=").append(is_extwork).append(",");
        sb.append("is_holiday").append("=").append(is_holiday).append(",");
        sb.append("modify_kind").append("=").append(modify_kind).append(",");
        sb.append("flex_am_rest").append("=").append(flex_am_rest).append(",");
        sb.append("flex_pm_rest").append("=").append(flex_pm_rest).append(",");
        sb.append("flex_nt_rest").append("=").append(flex_nt_rest);
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
