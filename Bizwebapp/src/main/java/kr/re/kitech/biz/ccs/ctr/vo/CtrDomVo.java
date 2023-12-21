package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장신청 Vo")
public class CtrDomVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자부서코드", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "신청자부서신설일자", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "출장지역", physicalName = "biztrip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region;

    @ElDtoField(logicalName = "출장목적", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal;

    @ElDtoField(logicalName = "출장목적구분", physicalName = "biztrip_goal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal_clsf;

    @ElDtoField(logicalName = "출발지", physicalName = "start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region;

    @ElDtoField(logicalName = "도착지", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "차량신청번호", physicalName = "car_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_req_no;

    @ElDtoField(logicalName = "출장시작일자", physicalName = "biztrip_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_start_ymd;

    @ElDtoField(logicalName = "출장종료일자", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "출장밤", physicalName = "biztrip_nght", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_nght;

    @ElDtoField(logicalName = "출장낮", physicalName = "biztrip_day", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_day;

    @ElDtoField(logicalName = "차량사용여부", physicalName = "car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_use_yn;

    @ElDtoField(logicalName = "노트북반출여부", physicalName = "notebook_out", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notebook_out;

    @ElDtoField(logicalName = "USB반출여부", physicalName = "usb_out", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usb_out;

    @ElDtoField(logicalName = "원내출장여부", physicalName = "is_internal_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_internal_region;

    @ElDtoField(logicalName = "출장비존재여부", physicalName = "no_trvel_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_trvel_expns;

    @ElDtoField(logicalName = "출발지기준", physicalName = "depart_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depart_base;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "운임비", physicalName = "fare_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fare_fee;

    @ElDtoField(logicalName = "운임비비고", physicalName = "fare_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fare_fee_rmk;

    @ElDtoField(logicalName = "일비", physicalName = "ymd_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ymd_fee;

    @ElDtoField(logicalName = "일비비고", physicalName = "ymd_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_fee_rmk;

    @ElDtoField(logicalName = "카드식", physicalName = "card_meal", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int card_meal;

    @ElDtoField(logicalName = "숙박비", physicalName = "lodg_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long lodg_fee;

    @ElDtoField(logicalName = "숙박비비고", physicalName = "lodg_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_fee_rmk;

    @ElDtoField(logicalName = "식비", physicalName = "meal_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long meal_fee;

    @ElDtoField(logicalName = "식비비고", physicalName = "meal_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meal_fee_rmk;

    @ElDtoField(logicalName = "총경비", physicalName = "tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_expns;

    @ElDtoField(logicalName = "총경비비고", physicalName = "tot_expns_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_expns_rmk;

    @ElDtoField(logicalName = "출장방법", physicalName = "biztrip_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_way;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public String getReq_psn_dept_cd(){
        return req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public void setReq_psn_dept_cd(String req_psn_dept_cd){
        this.req_psn_dept_cd = req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public String getReq_psn_dept_new_ymd(){
        return req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public void setReq_psn_dept_new_ymd(String req_psn_dept_new_ymd){
        this.req_psn_dept_new_ymd = req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "biztrip_region")
    public String getBiztrip_region(){
        return biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_region")
    public void setBiztrip_region(String biztrip_region){
        this.biztrip_region = biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        return biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf")
    public String getBiztrip_goal_clsf(){
        return biztrip_goal_clsf;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf")
    public void setBiztrip_goal_clsf(String biztrip_goal_clsf){
        this.biztrip_goal_clsf = biztrip_goal_clsf;
    }

    @ElVoField(physicalName = "start_region")
    public String getStart_region(){
        return start_region;
    }

    @ElVoField(physicalName = "start_region")
    public void setStart_region(String start_region){
        this.start_region = start_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "car_req_no")
    public String getCar_req_no(){
        return car_req_no;
    }

    @ElVoField(physicalName = "car_req_no")
    public void setCar_req_no(String car_req_no){
        this.car_req_no = car_req_no;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public String getBiztrip_start_ymd(){
        return biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public void setBiztrip_start_ymd(String biztrip_start_ymd){
        this.biztrip_start_ymd = biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        return biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public int getBiztrip_nght(){
        return biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public void setBiztrip_nght(int biztrip_nght){
        this.biztrip_nght = biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_day")
    public int getBiztrip_day(){
        return biztrip_day;
    }

    @ElVoField(physicalName = "biztrip_day")
    public void setBiztrip_day(int biztrip_day){
        this.biztrip_day = biztrip_day;
    }

    @ElVoField(physicalName = "car_use_yn")
    public String getCar_use_yn(){
        return car_use_yn;
    }

    @ElVoField(physicalName = "car_use_yn")
    public void setCar_use_yn(String car_use_yn){
        this.car_use_yn = car_use_yn;
    }

    @ElVoField(physicalName = "notebook_out")
    public String getNotebook_out(){
        return notebook_out;
    }

    @ElVoField(physicalName = "notebook_out")
    public void setNotebook_out(String notebook_out){
        this.notebook_out = notebook_out;
    }

    @ElVoField(physicalName = "usb_out")
    public String getUsb_out(){
        return usb_out;
    }

    @ElVoField(physicalName = "usb_out")
    public void setUsb_out(String usb_out){
        this.usb_out = usb_out;
    }

    @ElVoField(physicalName = "is_internal_region")
    public String getIs_internal_region(){
        return is_internal_region;
    }

    @ElVoField(physicalName = "is_internal_region")
    public void setIs_internal_region(String is_internal_region){
        this.is_internal_region = is_internal_region;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public String getNo_trvel_expns(){
        return no_trvel_expns;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public void setNo_trvel_expns(String no_trvel_expns){
        this.no_trvel_expns = no_trvel_expns;
    }

    @ElVoField(physicalName = "depart_base")
    public String getDepart_base(){
        return depart_base;
    }

    @ElVoField(physicalName = "depart_base")
    public void setDepart_base(String depart_base){
        this.depart_base = depart_base;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "fare_fee")
    public long getFare_fee(){
        return fare_fee;
    }

    @ElVoField(physicalName = "fare_fee")
    public void setFare_fee(long fare_fee){
        this.fare_fee = fare_fee;
    }

    @ElVoField(physicalName = "fare_fee_rmk")
    public String getFare_fee_rmk(){
        return fare_fee_rmk;
    }

    @ElVoField(physicalName = "fare_fee_rmk")
    public void setFare_fee_rmk(String fare_fee_rmk){
        this.fare_fee_rmk = fare_fee_rmk;
    }

    @ElVoField(physicalName = "ymd_fee")
    public long getYmd_fee(){
        return ymd_fee;
    }

    @ElVoField(physicalName = "ymd_fee")
    public void setYmd_fee(long ymd_fee){
        this.ymd_fee = ymd_fee;
    }

    @ElVoField(physicalName = "ymd_fee_rmk")
    public String getYmd_fee_rmk(){
        return ymd_fee_rmk;
    }

    @ElVoField(physicalName = "ymd_fee_rmk")
    public void setYmd_fee_rmk(String ymd_fee_rmk){
        this.ymd_fee_rmk = ymd_fee_rmk;
    }

    @ElVoField(physicalName = "card_meal")
    public int getCard_meal(){
        return card_meal;
    }

    @ElVoField(physicalName = "card_meal")
    public void setCard_meal(int card_meal){
        this.card_meal = card_meal;
    }

    @ElVoField(physicalName = "lodg_fee")
    public long getLodg_fee(){
        return lodg_fee;
    }

    @ElVoField(physicalName = "lodg_fee")
    public void setLodg_fee(long lodg_fee){
        this.lodg_fee = lodg_fee;
    }

    @ElVoField(physicalName = "lodg_fee_rmk")
    public String getLodg_fee_rmk(){
        return lodg_fee_rmk;
    }

    @ElVoField(physicalName = "lodg_fee_rmk")
    public void setLodg_fee_rmk(String lodg_fee_rmk){
        this.lodg_fee_rmk = lodg_fee_rmk;
    }

    @ElVoField(physicalName = "meal_fee")
    public long getMeal_fee(){
        return meal_fee;
    }

    @ElVoField(physicalName = "meal_fee")
    public void setMeal_fee(long meal_fee){
        this.meal_fee = meal_fee;
    }

    @ElVoField(physicalName = "meal_fee_rmk")
    public String getMeal_fee_rmk(){
        return meal_fee_rmk;
    }

    @ElVoField(physicalName = "meal_fee_rmk")
    public void setMeal_fee_rmk(String meal_fee_rmk){
        this.meal_fee_rmk = meal_fee_rmk;
    }

    @ElVoField(physicalName = "tot_expns")
    public long getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(long tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "tot_expns_rmk")
    public String getTot_expns_rmk(){
        return tot_expns_rmk;
    }

    @ElVoField(physicalName = "tot_expns_rmk")
    public void setTot_expns_rmk(String tot_expns_rmk){
        this.tot_expns_rmk = tot_expns_rmk;
    }

    @ElVoField(physicalName = "biztrip_way")
    public String getBiztrip_way(){
        return biztrip_way;
    }

    @ElVoField(physicalName = "biztrip_way")
    public void setBiztrip_way(String biztrip_way){
        this.biztrip_way = biztrip_way;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("biztrip_region").append("=").append(biztrip_region).append(",");
        sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
        sb.append("biztrip_goal_clsf").append("=").append(biztrip_goal_clsf).append(",");
        sb.append("start_region").append("=").append(start_region).append(",");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("car_req_no").append("=").append(car_req_no).append(",");
        sb.append("biztrip_start_ymd").append("=").append(biztrip_start_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
        sb.append("biztrip_nght").append("=").append(biztrip_nght).append(",");
        sb.append("biztrip_day").append("=").append(biztrip_day).append(",");
        sb.append("car_use_yn").append("=").append(car_use_yn).append(",");
        sb.append("notebook_out").append("=").append(notebook_out).append(",");
        sb.append("usb_out").append("=").append(usb_out).append(",");
        sb.append("is_internal_region").append("=").append(is_internal_region).append(",");
        sb.append("no_trvel_expns").append("=").append(no_trvel_expns).append(",");
        sb.append("depart_base").append("=").append(depart_base).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("fare_fee").append("=").append(fare_fee).append(",");
        sb.append("fare_fee_rmk").append("=").append(fare_fee_rmk).append(",");
        sb.append("ymd_fee").append("=").append(ymd_fee).append(",");
        sb.append("ymd_fee_rmk").append("=").append(ymd_fee_rmk).append(",");
        sb.append("card_meal").append("=").append(card_meal).append(",");
        sb.append("lodg_fee").append("=").append(lodg_fee).append(",");
        sb.append("lodg_fee_rmk").append("=").append(lodg_fee_rmk).append(",");
        sb.append("meal_fee").append("=").append(meal_fee).append(",");
        sb.append("meal_fee_rmk").append("=").append(meal_fee_rmk).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("tot_expns_rmk").append("=").append(tot_expns_rmk).append(",");
        sb.append("biztrip_way").append("=").append(biztrip_way);
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
