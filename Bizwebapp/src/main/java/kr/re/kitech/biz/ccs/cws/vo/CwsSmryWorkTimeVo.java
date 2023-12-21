package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SummaryWorkTimeVo")
public class CwsSmryWorkTimeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsSmryWorkTimeVo(){
    }

    @ElDtoField(logicalName = "성명", physicalName = "empnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empnm;

    @ElDtoField(logicalName = "근태코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "기준일", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String basedate;

    @ElDtoField(logicalName = "근무일", physicalName = "work_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_days;

    @ElDtoField(logicalName = "기본근무대상시간", physicalName = "bsic_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsic_times;

    @ElDtoField(logicalName = "초과근무대상시간", physicalName = "over_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String over_times;

    @ElDtoField(logicalName = "집중근무시간", physicalName = "core_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String core_times;

    @ElDtoField(logicalName = "탄력근무시간", physicalName = "flex_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flex_times;

    @ElDtoField(logicalName = "근무시간합계", physicalName = "total_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String total_times;

    @ElVoField(physicalName = "empnm")
    public String getEmpnm(){
        return empnm;
    }

    @ElVoField(physicalName = "empnm")
    public void setEmpnm(String empnm){
        this.empnm = empnm;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        return basedate;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @ElVoField(physicalName = "work_days")
    public String getWork_days(){
        return work_days;
    }

    @ElVoField(physicalName = "work_days")
    public void setWork_days(String work_days){
        this.work_days = work_days;
    }

    @ElVoField(physicalName = "bsic_times")
    public String getBsic_times(){
        return bsic_times;
    }

    @ElVoField(physicalName = "bsic_times")
    public void setBsic_times(String bsic_times){
        this.bsic_times = bsic_times;
    }

    @ElVoField(physicalName = "over_times")
    public String getOver_times(){
        return over_times;
    }

    @ElVoField(physicalName = "over_times")
    public void setOver_times(String over_times){
        this.over_times = over_times;
    }

    @ElVoField(physicalName = "core_times")
    public String getCore_times(){
        return core_times;
    }

    @ElVoField(physicalName = "core_times")
    public void setCore_times(String core_times){
        this.core_times = core_times;
    }

    @ElVoField(physicalName = "flex_times")
    public String getFlex_times(){
        return flex_times;
    }

    @ElVoField(physicalName = "flex_times")
    public void setFlex_times(String flex_times){
        this.flex_times = flex_times;
    }

    @ElVoField(physicalName = "total_times")
    public String getTotal_times(){
        return total_times;
    }

    @ElVoField(physicalName = "total_times")
    public void setTotal_times(String total_times){
        this.total_times = total_times;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsSmryWorkTimeVo [");
        sb.append("empnm").append("=").append(empnm).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("basedate").append("=").append(basedate).append(",");
        sb.append("work_days").append("=").append(work_days).append(",");
        sb.append("bsic_times").append("=").append(bsic_times).append(",");
        sb.append("over_times").append("=").append(over_times).append(",");
        sb.append("core_times").append("=").append(core_times).append(",");
        sb.append("flex_times").append("=").append(flex_times).append(",");
        sb.append("total_times").append("=").append(total_times);
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
