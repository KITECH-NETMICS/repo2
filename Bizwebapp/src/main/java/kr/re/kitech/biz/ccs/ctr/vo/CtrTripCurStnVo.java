package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장현황 Vo")
public class CtrTripCurStnVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripCurStnVo(){
    }

    @ElDtoField(logicalName = "구분", physicalName = "ctr_gbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_gbn;

    @ElDtoField(logicalName = "출장일수", physicalName = "ctr_count", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ctr_count;

    @ElDtoField(logicalName = "출장비율", physicalName = "ctr_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double ctr_rate;

    @ElDtoField(logicalName = "원내출장일수", physicalName = "ctr_in_region", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ctr_in_region;

    @ElDtoField(logicalName = "원외출장일수", physicalName = "ctr_out_region", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ctr_out_region;

    @ElDtoField(logicalName = "당해근무일수", physicalName = "work_days", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int work_days;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "현재년도", physicalName = "curr_yy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_yy;

    @ElDtoField(logicalName = "현재일자", physicalName = "curr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_ymd;

    @ElVoField(physicalName = "ctr_gbn")
    public String getCtr_gbn(){
        return ctr_gbn;
    }

    @ElVoField(physicalName = "ctr_gbn")
    public void setCtr_gbn(String ctr_gbn){
        this.ctr_gbn = ctr_gbn;
    }

    @ElVoField(physicalName = "ctr_count")
    public int getCtr_count(){
        return ctr_count;
    }

    @ElVoField(physicalName = "ctr_count")
    public void setCtr_count(int ctr_count){
        this.ctr_count = ctr_count;
    }

    @ElVoField(physicalName = "ctr_rate")
    public double getCtr_rate(){
        return ctr_rate;
    }

    @ElVoField(physicalName = "ctr_rate")
    public void setCtr_rate(double ctr_rate){
        this.ctr_rate = ctr_rate;
    }

    @ElVoField(physicalName = "ctr_in_region")
    public int getCtr_in_region(){
        return ctr_in_region;
    }

    @ElVoField(physicalName = "ctr_in_region")
    public void setCtr_in_region(int ctr_in_region){
        this.ctr_in_region = ctr_in_region;
    }

    @ElVoField(physicalName = "ctr_out_region")
    public int getCtr_out_region(){
        return ctr_out_region;
    }

    @ElVoField(physicalName = "ctr_out_region")
    public void setCtr_out_region(int ctr_out_region){
        this.ctr_out_region = ctr_out_region;
    }

    @ElVoField(physicalName = "work_days")
    public int getWork_days(){
        return work_days;
    }

    @ElVoField(physicalName = "work_days")
    public void setWork_days(int work_days){
        this.work_days = work_days;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "curr_yy")
    public String getCurr_yy(){
        return curr_yy;
    }

    @ElVoField(physicalName = "curr_yy")
    public void setCurr_yy(String curr_yy){
        this.curr_yy = curr_yy;
    }

    @ElVoField(physicalName = "curr_ymd")
    public String getCurr_ymd(){
        return curr_ymd;
    }

    @ElVoField(physicalName = "curr_ymd")
    public void setCurr_ymd(String curr_ymd){
        this.curr_ymd = curr_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripCurStnVo [");
        sb.append("ctr_gbn").append("=").append(ctr_gbn).append(",");
        sb.append("ctr_count").append("=").append(ctr_count).append(",");
        sb.append("ctr_rate").append("=").append(ctr_rate).append(",");
        sb.append("ctr_in_region").append("=").append(ctr_in_region).append(",");
        sb.append("ctr_out_region").append("=").append(ctr_out_region).append(",");
        sb.append("work_days").append("=").append(work_days).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("curr_yy").append("=").append(curr_yy).append(",");
        sb.append("curr_ymd").append("=").append(curr_ymd);
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
