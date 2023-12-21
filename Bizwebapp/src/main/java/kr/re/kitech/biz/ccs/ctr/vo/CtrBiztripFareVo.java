package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CtrBiztripFareExp")
public class CtrBiztripFareVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrBiztripFareVo(){
    }

    @ElDtoField(logicalName = "출장비용구분", physicalName = "biztrip_expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_expns_clsf;

    @ElDtoField(logicalName = "출장비용구분이름", physicalName = "biztrip_expns_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_expns_clsf_nm;

    @ElDtoField(logicalName = "출장구분(코드)", physicalName = "biztrip_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_clsf;

    @ElDtoField(logicalName = "출장구분", physicalName = "biztrip_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_clsf_nm;

    @ElDtoField(logicalName = "지역구분", physicalName = "region_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_clsf;

    @ElDtoField(logicalName = "출발지역", physicalName = "start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region;

    @ElDtoField(logicalName = "출발지", physicalName = "start_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region_nm;

    @ElDtoField(logicalName = "도착지역", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "도착지", physicalName = "arriv_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region_nm;

    @ElDtoField(logicalName = "도착도시", physicalName = "arriv_city_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_city_nm;

    @ElDtoField(logicalName = "국외지역", physicalName = "region_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_clsf_nm;

    @ElDtoField(logicalName = "직급", physicalName = "grd_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grd_clsf_nm;

    @ElDtoField(logicalName = "등급구분", physicalName = "grd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grd_clsf;

    @ElDtoField(logicalName = "출장일수", physicalName = "biztrip_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_daycnt;

    @ElDtoField(logicalName = "출장비", physicalName = "biztrip_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_fee;

    @ElDtoField(logicalName = "주말출장비", physicalName = "week_biztrip_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String week_biztrip_fee;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "이동거리", physicalName = "move_dist", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_dist;

    @ElVoField(physicalName = "biztrip_expns_clsf")
    public String getBiztrip_expns_clsf(){
        return biztrip_expns_clsf;
    }

    @ElVoField(physicalName = "biztrip_expns_clsf")
    public void setBiztrip_expns_clsf(String biztrip_expns_clsf){
        this.biztrip_expns_clsf = biztrip_expns_clsf;
    }

    @ElVoField(physicalName = "biztrip_expns_clsf_nm")
    public String getBiztrip_expns_clsf_nm(){
        return biztrip_expns_clsf_nm;
    }

    @ElVoField(physicalName = "biztrip_expns_clsf_nm")
    public void setBiztrip_expns_clsf_nm(String biztrip_expns_clsf_nm){
        this.biztrip_expns_clsf_nm = biztrip_expns_clsf_nm;
    }

    @ElVoField(physicalName = "biztrip_clsf")
    public String getBiztrip_clsf(){
        return biztrip_clsf;
    }

    @ElVoField(physicalName = "biztrip_clsf")
    public void setBiztrip_clsf(String biztrip_clsf){
        this.biztrip_clsf = biztrip_clsf;
    }

    @ElVoField(physicalName = "biztrip_clsf_nm")
    public String getBiztrip_clsf_nm(){
        return biztrip_clsf_nm;
    }

    @ElVoField(physicalName = "biztrip_clsf_nm")
    public void setBiztrip_clsf_nm(String biztrip_clsf_nm){
        this.biztrip_clsf_nm = biztrip_clsf_nm;
    }

    @ElVoField(physicalName = "region_clsf")
    public String getRegion_clsf(){
        return region_clsf;
    }

    @ElVoField(physicalName = "region_clsf")
    public void setRegion_clsf(String region_clsf){
        this.region_clsf = region_clsf;
    }

    @ElVoField(physicalName = "start_region")
    public String getStart_region(){
        return start_region;
    }

    @ElVoField(physicalName = "start_region")
    public void setStart_region(String start_region){
        this.start_region = start_region;
    }

    @ElVoField(physicalName = "start_region_nm")
    public String getStart_region_nm(){
        return start_region_nm;
    }

    @ElVoField(physicalName = "start_region_nm")
    public void setStart_region_nm(String start_region_nm){
        this.start_region_nm = start_region_nm;
    }

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "arriv_region_nm")
    public String getArriv_region_nm(){
        return arriv_region_nm;
    }

    @ElVoField(physicalName = "arriv_region_nm")
    public void setArriv_region_nm(String arriv_region_nm){
        this.arriv_region_nm = arriv_region_nm;
    }

    @ElVoField(physicalName = "arriv_city_nm")
    public String getArriv_city_nm(){
        return arriv_city_nm;
    }

    @ElVoField(physicalName = "arriv_city_nm")
    public void setArriv_city_nm(String arriv_city_nm){
        this.arriv_city_nm = arriv_city_nm;
    }

    @ElVoField(physicalName = "region_clsf_nm")
    public String getRegion_clsf_nm(){
        return region_clsf_nm;
    }

    @ElVoField(physicalName = "region_clsf_nm")
    public void setRegion_clsf_nm(String region_clsf_nm){
        this.region_clsf_nm = region_clsf_nm;
    }

    @ElVoField(physicalName = "grd_clsf_nm")
    public String getGrd_clsf_nm(){
        return grd_clsf_nm;
    }

    @ElVoField(physicalName = "grd_clsf_nm")
    public void setGrd_clsf_nm(String grd_clsf_nm){
        this.grd_clsf_nm = grd_clsf_nm;
    }

    @ElVoField(physicalName = "grd_clsf")
    public String getGrd_clsf(){
        return grd_clsf;
    }

    @ElVoField(physicalName = "grd_clsf")
    public void setGrd_clsf(String grd_clsf){
        this.grd_clsf = grd_clsf;
    }

    @ElVoField(physicalName = "biztrip_daycnt")
    public String getBiztrip_daycnt(){
        return biztrip_daycnt;
    }

    @ElVoField(physicalName = "biztrip_daycnt")
    public void setBiztrip_daycnt(String biztrip_daycnt){
        this.biztrip_daycnt = biztrip_daycnt;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public String getBiztrip_fee(){
        return biztrip_fee;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public void setBiztrip_fee(String biztrip_fee){
        this.biztrip_fee = biztrip_fee;
    }

    @ElVoField(physicalName = "week_biztrip_fee")
    public String getWeek_biztrip_fee(){
        return week_biztrip_fee;
    }

    @ElVoField(physicalName = "week_biztrip_fee")
    public void setWeek_biztrip_fee(String week_biztrip_fee){
        this.week_biztrip_fee = week_biztrip_fee;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "move_dist")
    public String getMove_dist(){
        return move_dist;
    }

    @ElVoField(physicalName = "move_dist")
    public void setMove_dist(String move_dist){
        this.move_dist = move_dist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrBiztripFareVo [");
        sb.append("biztrip_expns_clsf").append("=").append(biztrip_expns_clsf).append(",");
        sb.append("biztrip_expns_clsf_nm").append("=").append(biztrip_expns_clsf_nm).append(",");
        sb.append("biztrip_clsf").append("=").append(biztrip_clsf).append(",");
        sb.append("biztrip_clsf_nm").append("=").append(biztrip_clsf_nm).append(",");
        sb.append("region_clsf").append("=").append(region_clsf).append(",");
        sb.append("start_region").append("=").append(start_region).append(",");
        sb.append("start_region_nm").append("=").append(start_region_nm).append(",");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("arriv_region_nm").append("=").append(arriv_region_nm).append(",");
        sb.append("arriv_city_nm").append("=").append(arriv_city_nm).append(",");
        sb.append("region_clsf_nm").append("=").append(region_clsf_nm).append(",");
        sb.append("grd_clsf_nm").append("=").append(grd_clsf_nm).append(",");
        sb.append("grd_clsf").append("=").append(grd_clsf).append(",");
        sb.append("biztrip_daycnt").append("=").append(biztrip_daycnt).append(",");
        sb.append("biztrip_fee").append("=").append(biztrip_fee).append(",");
        sb.append("week_biztrip_fee").append("=").append(week_biztrip_fee).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("move_dist").append("=").append(move_dist);
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
