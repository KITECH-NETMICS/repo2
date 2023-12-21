package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkTimeDetailVo")
public class CwsWorkTimeDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeDetailVo(){
    }

    @ElDtoField(logicalName = "기본근무시간", physicalName = "sum_basic_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_basic_time;

    @ElDtoField(logicalName = "초과근무시간", physicalName = "sum_over_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_over_time;

    @ElDtoField(logicalName = "근무시간소계", physicalName = "sum_sub_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_sub_time;

    @ElDtoField(logicalName = "근거리출장시간", physicalName = "ctr_local_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_local_time;

    @ElDtoField(logicalName = "국내출장시간", physicalName = "ctr_dome_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_dome_time;

    @ElDtoField(logicalName = "해외출장시간", physicalName = "ctr_over_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_over_time;

    @ElDtoField(logicalName = "휴가I", physicalName = "full_vacation_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String full_vacation_time;

    @ElDtoField(logicalName = "휴가II", physicalName = "half_vacation_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String half_vacation_time;

    @ElDtoField(logicalName = "월근무시간", physicalName = "sum_total_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sum_total_time;

    @ElVoField(physicalName = "sum_basic_time")
    public String getSum_basic_time(){
        return sum_basic_time;
    }

    @ElVoField(physicalName = "sum_basic_time")
    public void setSum_basic_time(String sum_basic_time){
        this.sum_basic_time = sum_basic_time;
    }

    @ElVoField(physicalName = "sum_over_time")
    public String getSum_over_time(){
        return sum_over_time;
    }

    @ElVoField(physicalName = "sum_over_time")
    public void setSum_over_time(String sum_over_time){
        this.sum_over_time = sum_over_time;
    }

    @ElVoField(physicalName = "sum_sub_time")
    public String getSum_sub_time(){
        return sum_sub_time;
    }

    @ElVoField(physicalName = "sum_sub_time")
    public void setSum_sub_time(String sum_sub_time){
        this.sum_sub_time = sum_sub_time;
    }

    @ElVoField(physicalName = "ctr_local_time")
    public String getCtr_local_time(){
        return ctr_local_time;
    }

    @ElVoField(physicalName = "ctr_local_time")
    public void setCtr_local_time(String ctr_local_time){
        this.ctr_local_time = ctr_local_time;
    }

    @ElVoField(physicalName = "ctr_dome_time")
    public String getCtr_dome_time(){
        return ctr_dome_time;
    }

    @ElVoField(physicalName = "ctr_dome_time")
    public void setCtr_dome_time(String ctr_dome_time){
        this.ctr_dome_time = ctr_dome_time;
    }

    @ElVoField(physicalName = "ctr_over_time")
    public String getCtr_over_time(){
        return ctr_over_time;
    }

    @ElVoField(physicalName = "ctr_over_time")
    public void setCtr_over_time(String ctr_over_time){
        this.ctr_over_time = ctr_over_time;
    }

    @ElVoField(physicalName = "full_vacation_time")
    public String getFull_vacation_time(){
        return full_vacation_time;
    }

    @ElVoField(physicalName = "full_vacation_time")
    public void setFull_vacation_time(String full_vacation_time){
        this.full_vacation_time = full_vacation_time;
    }

    @ElVoField(physicalName = "half_vacation_time")
    public String getHalf_vacation_time(){
        return half_vacation_time;
    }

    @ElVoField(physicalName = "half_vacation_time")
    public void setHalf_vacation_time(String half_vacation_time){
        this.half_vacation_time = half_vacation_time;
    }

    @ElVoField(physicalName = "sum_total_time")
    public String getSum_total_time(){
        return sum_total_time;
    }

    @ElVoField(physicalName = "sum_total_time")
    public void setSum_total_time(String sum_total_time){
        this.sum_total_time = sum_total_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeDetailVo [");
        sb.append("sum_basic_time").append("=").append(sum_basic_time).append(",");
        sb.append("sum_over_time").append("=").append(sum_over_time).append(",");
        sb.append("sum_sub_time").append("=").append(sum_sub_time).append(",");
        sb.append("ctr_local_time").append("=").append(ctr_local_time).append(",");
        sb.append("ctr_dome_time").append("=").append(ctr_dome_time).append(",");
        sb.append("ctr_over_time").append("=").append(ctr_over_time).append(",");
        sb.append("full_vacation_time").append("=").append(full_vacation_time).append(",");
        sb.append("half_vacation_time").append("=").append(half_vacation_time).append(",");
        sb.append("sum_total_time").append("=").append(sum_total_time);
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
