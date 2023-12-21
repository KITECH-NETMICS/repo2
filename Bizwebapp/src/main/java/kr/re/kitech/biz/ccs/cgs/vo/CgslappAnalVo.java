package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원연차")
public class CgslappAnalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappAnalVo(){
    }

    @ElDtoField(logicalName = "잔여연차일수", physicalName = "remidr_anal_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_anal_qty;

    @ElDtoField(logicalName = "저축연차00", physicalName = "remidr_save_qty00", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty00;

    @ElDtoField(logicalName = "저축연차01", physicalName = "remidr_save_qty01", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty01;

    @ElDtoField(logicalName = "저축연차02", physicalName = "remidr_save_qty02", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty02;

    @ElDtoField(logicalName = "저축연차03", physicalName = "remidr_save_qty03", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty03;

    @ElDtoField(logicalName = "저축연차04", physicalName = "remidr_save_qty04", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty04;

    @ElDtoField(logicalName = "저축연차05", physicalName = "remidr_save_qty05", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty05;

    @ElDtoField(logicalName = "저축연차06", physicalName = "remidr_save_qty06", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty06;

    @ElDtoField(logicalName = "저축연차07", physicalName = "remidr_save_qty07", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty07;

    @ElDtoField(logicalName = "저축연차08", physicalName = "remidr_save_qty08", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty08;

    @ElDtoField(logicalName = "저축연차09", physicalName = "remidr_save_qty09", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty09;

    @ElDtoField(logicalName = "저축연차10", physicalName = "remidr_save_qty10", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double remidr_save_qty10;

    @ElDtoField(logicalName = "미승인 연차일수", physicalName = "no_apr_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_apr_qty;

    @ElDtoField(logicalName = "워크데이", physicalName = "work_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_days;

    @ElDtoField(logicalName = "가족돌봄휴가", physicalName = "care_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String care_cnt;

    @ElDtoField(logicalName = "병가", physicalName = "sick_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sick_cnt;

    @ElDtoField(logicalName = "보상전체일수", physicalName = "tot_com_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_com_qty;

    @ElDtoField(logicalName = "보상사용일수", physicalName = "use_com_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_com_qty;

    @ElDtoField(logicalName = "잔여보상일수", physicalName = "remain_com_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remain_com_qty;

    @ElVoField(physicalName = "remidr_anal_qty")
    public double getRemidr_anal_qty(){
        return remidr_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public void setRemidr_anal_qty(double remidr_anal_qty){
        this.remidr_anal_qty = remidr_anal_qty;
    }

    @ElVoField(physicalName = "remidr_save_qty00")
    public double getRemidr_save_qty00(){
        return remidr_save_qty00;
    }

    @ElVoField(physicalName = "remidr_save_qty00")
    public void setRemidr_save_qty00(double remidr_save_qty00){
        this.remidr_save_qty00 = remidr_save_qty00;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public double getRemidr_save_qty01(){
        return remidr_save_qty01;
    }

    @ElVoField(physicalName = "remidr_save_qty01")
    public void setRemidr_save_qty01(double remidr_save_qty01){
        this.remidr_save_qty01 = remidr_save_qty01;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public double getRemidr_save_qty02(){
        return remidr_save_qty02;
    }

    @ElVoField(physicalName = "remidr_save_qty02")
    public void setRemidr_save_qty02(double remidr_save_qty02){
        this.remidr_save_qty02 = remidr_save_qty02;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public double getRemidr_save_qty03(){
        return remidr_save_qty03;
    }

    @ElVoField(physicalName = "remidr_save_qty03")
    public void setRemidr_save_qty03(double remidr_save_qty03){
        this.remidr_save_qty03 = remidr_save_qty03;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public double getRemidr_save_qty04(){
        return remidr_save_qty04;
    }

    @ElVoField(physicalName = "remidr_save_qty04")
    public void setRemidr_save_qty04(double remidr_save_qty04){
        this.remidr_save_qty04 = remidr_save_qty04;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public double getRemidr_save_qty05(){
        return remidr_save_qty05;
    }

    @ElVoField(physicalName = "remidr_save_qty05")
    public void setRemidr_save_qty05(double remidr_save_qty05){
        this.remidr_save_qty05 = remidr_save_qty05;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public double getRemidr_save_qty06(){
        return remidr_save_qty06;
    }

    @ElVoField(physicalName = "remidr_save_qty06")
    public void setRemidr_save_qty06(double remidr_save_qty06){
        this.remidr_save_qty06 = remidr_save_qty06;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public double getRemidr_save_qty07(){
        return remidr_save_qty07;
    }

    @ElVoField(physicalName = "remidr_save_qty07")
    public void setRemidr_save_qty07(double remidr_save_qty07){
        this.remidr_save_qty07 = remidr_save_qty07;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public double getRemidr_save_qty08(){
        return remidr_save_qty08;
    }

    @ElVoField(physicalName = "remidr_save_qty08")
    public void setRemidr_save_qty08(double remidr_save_qty08){
        this.remidr_save_qty08 = remidr_save_qty08;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public double getRemidr_save_qty09(){
        return remidr_save_qty09;
    }

    @ElVoField(physicalName = "remidr_save_qty09")
    public void setRemidr_save_qty09(double remidr_save_qty09){
        this.remidr_save_qty09 = remidr_save_qty09;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public double getRemidr_save_qty10(){
        return remidr_save_qty10;
    }

    @ElVoField(physicalName = "remidr_save_qty10")
    public void setRemidr_save_qty10(double remidr_save_qty10){
        this.remidr_save_qty10 = remidr_save_qty10;
    }

    @ElVoField(physicalName = "no_apr_qty")
    public String getNo_apr_qty(){
        return no_apr_qty;
    }

    @ElVoField(physicalName = "no_apr_qty")
    public void setNo_apr_qty(String no_apr_qty){
        this.no_apr_qty = no_apr_qty;
    }

    @ElVoField(physicalName = "work_days")
    public String getWork_days(){
        return work_days;
    }

    @ElVoField(physicalName = "work_days")
    public void setWork_days(String work_days){
        this.work_days = work_days;
    }

    @ElVoField(physicalName = "care_cnt")
    public String getCare_cnt(){
        return care_cnt;
    }

    @ElVoField(physicalName = "care_cnt")
    public void setCare_cnt(String care_cnt){
        this.care_cnt = care_cnt;
    }

    @ElVoField(physicalName = "sick_cnt")
    public String getSick_cnt(){
        return sick_cnt;
    }

    @ElVoField(physicalName = "sick_cnt")
    public void setSick_cnt(String sick_cnt){
        this.sick_cnt = sick_cnt;
    }

    @ElVoField(physicalName = "tot_com_qty")
    public String getTot_com_qty(){
        return tot_com_qty;
    }

    @ElVoField(physicalName = "tot_com_qty")
    public void setTot_com_qty(String tot_com_qty){
        this.tot_com_qty = tot_com_qty;
    }

    @ElVoField(physicalName = "use_com_qty")
    public String getUse_com_qty(){
        return use_com_qty;
    }

    @ElVoField(physicalName = "use_com_qty")
    public void setUse_com_qty(String use_com_qty){
        this.use_com_qty = use_com_qty;
    }

    @ElVoField(physicalName = "remain_com_qty")
    public String getRemain_com_qty(){
        return remain_com_qty;
    }

    @ElVoField(physicalName = "remain_com_qty")
    public void setRemain_com_qty(String remain_com_qty){
        this.remain_com_qty = remain_com_qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappAnalVo [");
        sb.append("remidr_anal_qty").append("=").append(remidr_anal_qty).append(",");
        sb.append("remidr_save_qty00").append("=").append(remidr_save_qty00).append(",");
        sb.append("remidr_save_qty01").append("=").append(remidr_save_qty01).append(",");
        sb.append("remidr_save_qty02").append("=").append(remidr_save_qty02).append(",");
        sb.append("remidr_save_qty03").append("=").append(remidr_save_qty03).append(",");
        sb.append("remidr_save_qty04").append("=").append(remidr_save_qty04).append(",");
        sb.append("remidr_save_qty05").append("=").append(remidr_save_qty05).append(",");
        sb.append("remidr_save_qty06").append("=").append(remidr_save_qty06).append(",");
        sb.append("remidr_save_qty07").append("=").append(remidr_save_qty07).append(",");
        sb.append("remidr_save_qty08").append("=").append(remidr_save_qty08).append(",");
        sb.append("remidr_save_qty09").append("=").append(remidr_save_qty09).append(",");
        sb.append("remidr_save_qty10").append("=").append(remidr_save_qty10).append(",");
        sb.append("no_apr_qty").append("=").append(no_apr_qty).append(",");
        sb.append("work_days").append("=").append(work_days).append(",");
        sb.append("care_cnt").append("=").append(care_cnt).append(",");
        sb.append("sick_cnt").append("=").append(sick_cnt).append(",");
        sb.append("tot_com_qty").append("=").append(tot_com_qty).append(",");
        sb.append("use_com_qty").append("=").append(use_com_qty).append(",");
        sb.append("remain_com_qty").append("=").append(remain_com_qty);
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
