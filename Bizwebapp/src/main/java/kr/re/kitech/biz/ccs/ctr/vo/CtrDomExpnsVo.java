package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장정산 경비 Vo")
public class CtrDomExpnsVo extends kr.re.kitech.biz.ccs.ctr.vo.CtrDomFeeVo {
    private static final long serialVersionUID = 1L;

    public CtrDomExpnsVo(){
    }

    @ElDtoField(logicalName = "정산번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자개인번호", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "운임구분", physicalName = "fare_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fare_clsf;

    @ElDtoField(logicalName = "운임기준금액", physicalName = "fare_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fare_fee_max;

    @ElDtoField(logicalName = "운임실사용액", physicalName = "fare_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fare_fee;

    @ElDtoField(logicalName = "운임비고", physicalName = "fare_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fare_fee_rmk;

    @ElDtoField(logicalName = "운임신청금액", physicalName = "fare_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fare_fee_pay;

    @ElDtoField(logicalName = "운임카드사용여부", physicalName = "fare_card_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fare_card_yn;

    @ElDtoField(logicalName = "숙박구분", physicalName = "lodg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_clsf;

    @ElDtoField(logicalName = "숙박기준금액", physicalName = "lodg_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long lodg_fee_max;

    @ElDtoField(logicalName = "숙박비고", physicalName = "lodg_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_fee_rmk;

    @ElDtoField(logicalName = "숙박신청금액", physicalName = "lodg_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long lodg_fee_pay;

    @ElDtoField(logicalName = "숙박카드사용여부", physicalName = "lodg_card_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_card_yn;

    @ElDtoField(logicalName = "일비기준금액", physicalName = "ymd_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ymd_fee_max;

    @ElDtoField(logicalName = "일비신청금액", physicalName = "ymd_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ymd_fee_pay;

    @ElDtoField(logicalName = "일비비고", physicalName = "ymd_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd_fee_rmk;

    @ElDtoField(logicalName = "식비기준금액", physicalName = "meal_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long meal_fee_max;

    @ElDtoField(logicalName = "식비신청금액", physicalName = "meal_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long meal_fee_pay;

    @ElDtoField(logicalName = "식비비고", physicalName = "meal_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meal_fee_rmk;

    @ElDtoField(logicalName = "카드식", physicalName = "card_meal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_meal;

    @ElDtoField(logicalName = "출장경비기준금액", physicalName = "sum_trip_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sum_trip_fee_max;

    @ElDtoField(logicalName = "출장경비실사용액", physicalName = "sum_trip_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sum_trip_fee;

    @ElDtoField(logicalName = "출장경비신청금액", physicalName = "sum_trip_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sum_trip_fee_pay;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public String getBiztrip_psn_nm(){
        return biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public void setBiztrip_psn_nm(String biztrip_psn_nm){
        this.biztrip_psn_nm = biztrip_psn_nm;
    }

    @ElVoField(physicalName = "fare_clsf")
    public String getFare_clsf(){
        return fare_clsf;
    }

    @ElVoField(physicalName = "fare_clsf")
    public void setFare_clsf(String fare_clsf){
        this.fare_clsf = fare_clsf;
    }

    @ElVoField(physicalName = "fare_fee_max")
    public long getFare_fee_max(){
        return fare_fee_max;
    }

    @ElVoField(physicalName = "fare_fee_max")
    public void setFare_fee_max(long fare_fee_max){
        this.fare_fee_max = fare_fee_max;
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

    @ElVoField(physicalName = "fare_fee_pay")
    public long getFare_fee_pay(){
        return fare_fee_pay;
    }

    @ElVoField(physicalName = "fare_fee_pay")
    public void setFare_fee_pay(long fare_fee_pay){
        this.fare_fee_pay = fare_fee_pay;
    }

    @ElVoField(physicalName = "fare_card_yn")
    public String getFare_card_yn(){
        return fare_card_yn;
    }

    @ElVoField(physicalName = "fare_card_yn")
    public void setFare_card_yn(String fare_card_yn){
        this.fare_card_yn = fare_card_yn;
    }

    @ElVoField(physicalName = "lodg_clsf")
    public String getLodg_clsf(){
        return lodg_clsf;
    }

    @ElVoField(physicalName = "lodg_clsf")
    public void setLodg_clsf(String lodg_clsf){
        this.lodg_clsf = lodg_clsf;
    }

    @ElVoField(physicalName = "lodg_fee_max")
    public long getLodg_fee_max(){
        return lodg_fee_max;
    }

    @ElVoField(physicalName = "lodg_fee_max")
    public void setLodg_fee_max(long lodg_fee_max){
        this.lodg_fee_max = lodg_fee_max;
    }

    @ElVoField(physicalName = "lodg_fee_rmk")
    public String getLodg_fee_rmk(){
        return lodg_fee_rmk;
    }

    @ElVoField(physicalName = "lodg_fee_rmk")
    public void setLodg_fee_rmk(String lodg_fee_rmk){
        this.lodg_fee_rmk = lodg_fee_rmk;
    }

    @ElVoField(physicalName = "lodg_fee_pay")
    public long getLodg_fee_pay(){
        return lodg_fee_pay;
    }

    @ElVoField(physicalName = "lodg_fee_pay")
    public void setLodg_fee_pay(long lodg_fee_pay){
        this.lodg_fee_pay = lodg_fee_pay;
    }

    @ElVoField(physicalName = "lodg_card_yn")
    public String getLodg_card_yn(){
        return lodg_card_yn;
    }

    @ElVoField(physicalName = "lodg_card_yn")
    public void setLodg_card_yn(String lodg_card_yn){
        this.lodg_card_yn = lodg_card_yn;
    }

    @ElVoField(physicalName = "ymd_fee_max")
    public long getYmd_fee_max(){
        return ymd_fee_max;
    }

    @ElVoField(physicalName = "ymd_fee_max")
    public void setYmd_fee_max(long ymd_fee_max){
        this.ymd_fee_max = ymd_fee_max;
    }

    @ElVoField(physicalName = "ymd_fee_pay")
    public long getYmd_fee_pay(){
        return ymd_fee_pay;
    }

    @ElVoField(physicalName = "ymd_fee_pay")
    public void setYmd_fee_pay(long ymd_fee_pay){
        this.ymd_fee_pay = ymd_fee_pay;
    }

    @ElVoField(physicalName = "ymd_fee_rmk")
    public String getYmd_fee_rmk(){
        return ymd_fee_rmk;
    }

    @ElVoField(physicalName = "ymd_fee_rmk")
    public void setYmd_fee_rmk(String ymd_fee_rmk){
        this.ymd_fee_rmk = ymd_fee_rmk;
    }

    @ElVoField(physicalName = "meal_fee_max")
    public long getMeal_fee_max(){
        return meal_fee_max;
    }

    @ElVoField(physicalName = "meal_fee_max")
    public void setMeal_fee_max(long meal_fee_max){
        this.meal_fee_max = meal_fee_max;
    }

    @ElVoField(physicalName = "meal_fee_pay")
    public long getMeal_fee_pay(){
        return meal_fee_pay;
    }

    @ElVoField(physicalName = "meal_fee_pay")
    public void setMeal_fee_pay(long meal_fee_pay){
        this.meal_fee_pay = meal_fee_pay;
    }

    @ElVoField(physicalName = "meal_fee_rmk")
    public String getMeal_fee_rmk(){
        return meal_fee_rmk;
    }

    @ElVoField(physicalName = "meal_fee_rmk")
    public void setMeal_fee_rmk(String meal_fee_rmk){
        this.meal_fee_rmk = meal_fee_rmk;
    }

    @ElVoField(physicalName = "card_meal")
    public String getCard_meal(){
        return card_meal;
    }

    @ElVoField(physicalName = "card_meal")
    public void setCard_meal(String card_meal){
        this.card_meal = card_meal;
    }

    @ElVoField(physicalName = "sum_trip_fee_max")
    public long getSum_trip_fee_max(){
        return sum_trip_fee_max;
    }

    @ElVoField(physicalName = "sum_trip_fee_max")
    public void setSum_trip_fee_max(long sum_trip_fee_max){
        this.sum_trip_fee_max = sum_trip_fee_max;
    }

    @ElVoField(physicalName = "sum_trip_fee")
    public long getSum_trip_fee(){
        return sum_trip_fee;
    }

    @ElVoField(physicalName = "sum_trip_fee")
    public void setSum_trip_fee(long sum_trip_fee){
        this.sum_trip_fee = sum_trip_fee;
    }

    @ElVoField(physicalName = "sum_trip_fee_pay")
    public long getSum_trip_fee_pay(){
        return sum_trip_fee_pay;
    }

    @ElVoField(physicalName = "sum_trip_fee_pay")
    public void setSum_trip_fee_pay(long sum_trip_fee_pay){
        this.sum_trip_fee_pay = sum_trip_fee_pay;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomExpnsVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("fare_clsf").append("=").append(fare_clsf).append(",");
        sb.append("fare_fee_max").append("=").append(fare_fee_max).append(",");
        sb.append("fare_fee").append("=").append(fare_fee).append(",");
        sb.append("fare_fee_rmk").append("=").append(fare_fee_rmk).append(",");
        sb.append("fare_fee_pay").append("=").append(fare_fee_pay).append(",");
        sb.append("fare_card_yn").append("=").append(fare_card_yn).append(",");
        sb.append("lodg_clsf").append("=").append(lodg_clsf).append(",");
        sb.append("lodg_fee_max").append("=").append(lodg_fee_max).append(",");
        sb.append("lodg_fee_rmk").append("=").append(lodg_fee_rmk).append(",");
        sb.append("lodg_fee_pay").append("=").append(lodg_fee_pay).append(",");
        sb.append("lodg_card_yn").append("=").append(lodg_card_yn).append(",");
        sb.append("ymd_fee_max").append("=").append(ymd_fee_max).append(",");
        sb.append("ymd_fee_pay").append("=").append(ymd_fee_pay).append(",");
        sb.append("ymd_fee_rmk").append("=").append(ymd_fee_rmk).append(",");
        sb.append("meal_fee_max").append("=").append(meal_fee_max).append(",");
        sb.append("meal_fee_pay").append("=").append(meal_fee_pay).append(",");
        sb.append("meal_fee_rmk").append("=").append(meal_fee_rmk).append(",");
        sb.append("card_meal").append("=").append(card_meal).append(",");
        sb.append("sum_trip_fee_max").append("=").append(sum_trip_fee_max).append(",");
        sb.append("sum_trip_fee").append("=").append(sum_trip_fee).append(",");
        sb.append("sum_trip_fee_pay").append("=").append(sum_trip_fee_pay).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
