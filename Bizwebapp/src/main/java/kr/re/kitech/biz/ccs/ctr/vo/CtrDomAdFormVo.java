package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장정산 Vo")
public class CtrDomAdFormVo extends kr.re.kitech.biz.ccs.ctr.vo.CtrDomRepVo {
    private static final long serialVersionUID = 1L;

    public CtrDomAdFormVo(){
    }

    @ElDtoField(logicalName = "정산번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자부서", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "신청자부서신설일", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "초과사유코드", physicalName = "excess_resn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String excess_resn_cd;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "실제운임", physicalName = "truth_fare_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long truth_fare_fee;

    @ElDtoField(logicalName = "정산운임", physicalName = "adjst_fare_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_fare_fee;

    @ElDtoField(logicalName = "정산운임비고", physicalName = "adjst_fare_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fare_fee_rmk;

    @ElDtoField(logicalName = "실제숙박비", physicalName = "truth_lodg_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long truth_lodg_fee;

    @ElDtoField(logicalName = "정산숙박비", physicalName = "adjst_lodg_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_lodg_fee;

    @ElDtoField(logicalName = "정산숙박비고", physicalName = "adjst_lodg_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_lodg_fee_rmk;

    @ElDtoField(logicalName = "실제일비", physicalName = "truth_ymd_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long truth_ymd_fee;

    @ElDtoField(logicalName = "정산일비", physicalName = "adjst_ymd_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_ymd_fee;

    @ElDtoField(logicalName = "정산일비비고", physicalName = "adjst_ymd_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_ymd_fee_rmk;

    @ElDtoField(logicalName = "실제식비", physicalName = "truth_meal_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long truth_meal_fee;

    @ElDtoField(logicalName = "정산식비", physicalName = "adjst_meal_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_meal_fee;

    @ElDtoField(logicalName = "정산식비비고", physicalName = "adjst_meal_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_meal_fee_rmk;

    @ElDtoField(logicalName = "실제비용", physicalName = "truth_tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long truth_tot_expns;

    @ElDtoField(logicalName = "정산비용", physicalName = "adjst_tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_tot_expns;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "확정유무", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "직급구분", physicalName = "posi_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_clsf;

    @ElDtoField(logicalName = "노트북반출여부", physicalName = "notebook_out", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notebook_out;

    @ElDtoField(logicalName = "usb반출여부", physicalName = "usb_out", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usb_out;

    @ElDtoField(logicalName = "출장경비여부", physicalName = "expns_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int expns_cnt;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "신청출장지", physicalName = "biztrip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region;

    @ElDtoField(logicalName = "신청도착지", physicalName = "chng_biztrip_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_biztrip_land;

    @ElDtoField(logicalName = "마일리지신청번호", physicalName = "air_mile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_mile_no;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "복명출장기간", physicalName = "req_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_prd;

    @ElDtoField(logicalName = "출장경비 총 기준금액", physicalName = "totl_fare_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_fare_fee_max;

    @ElDtoField(logicalName = "출장경비 총 실사용액", physicalName = "totl_fare_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_fare_fee;

    @ElDtoField(logicalName = "출장경비 총 신청금액", physicalName = "totl_fare_fee_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_fare_fee_pay;

    @ElDtoField(logicalName = "카드식", physicalName = "card_meal", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int card_meal;

    @ElDtoField(logicalName = "출장비없음", physicalName = "no_trvel_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_trvel_expns;

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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "excess_resn_cd")
    public String getExcess_resn_cd(){
        return excess_resn_cd;
    }

    @ElVoField(physicalName = "excess_resn_cd")
    public void setExcess_resn_cd(String excess_resn_cd){
        this.excess_resn_cd = excess_resn_cd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "truth_fare_fee")
    public long getTruth_fare_fee(){
        return truth_fare_fee;
    }

    @ElVoField(physicalName = "truth_fare_fee")
    public void setTruth_fare_fee(long truth_fare_fee){
        this.truth_fare_fee = truth_fare_fee;
    }

    @ElVoField(physicalName = "adjst_fare_fee")
    public long getAdjst_fare_fee(){
        return adjst_fare_fee;
    }

    @ElVoField(physicalName = "adjst_fare_fee")
    public void setAdjst_fare_fee(long adjst_fare_fee){
        this.adjst_fare_fee = adjst_fare_fee;
    }

    @ElVoField(physicalName = "adjst_fare_fee_rmk")
    public String getAdjst_fare_fee_rmk(){
        return adjst_fare_fee_rmk;
    }

    @ElVoField(physicalName = "adjst_fare_fee_rmk")
    public void setAdjst_fare_fee_rmk(String adjst_fare_fee_rmk){
        this.adjst_fare_fee_rmk = adjst_fare_fee_rmk;
    }

    @ElVoField(physicalName = "truth_lodg_fee")
    public long getTruth_lodg_fee(){
        return truth_lodg_fee;
    }

    @ElVoField(physicalName = "truth_lodg_fee")
    public void setTruth_lodg_fee(long truth_lodg_fee){
        this.truth_lodg_fee = truth_lodg_fee;
    }

    @ElVoField(physicalName = "adjst_lodg_fee")
    public long getAdjst_lodg_fee(){
        return adjst_lodg_fee;
    }

    @ElVoField(physicalName = "adjst_lodg_fee")
    public void setAdjst_lodg_fee(long adjst_lodg_fee){
        this.adjst_lodg_fee = adjst_lodg_fee;
    }

    @ElVoField(physicalName = "adjst_lodg_fee_rmk")
    public String getAdjst_lodg_fee_rmk(){
        return adjst_lodg_fee_rmk;
    }

    @ElVoField(physicalName = "adjst_lodg_fee_rmk")
    public void setAdjst_lodg_fee_rmk(String adjst_lodg_fee_rmk){
        this.adjst_lodg_fee_rmk = adjst_lodg_fee_rmk;
    }

    @ElVoField(physicalName = "truth_ymd_fee")
    public long getTruth_ymd_fee(){
        return truth_ymd_fee;
    }

    @ElVoField(physicalName = "truth_ymd_fee")
    public void setTruth_ymd_fee(long truth_ymd_fee){
        this.truth_ymd_fee = truth_ymd_fee;
    }

    @ElVoField(physicalName = "adjst_ymd_fee")
    public long getAdjst_ymd_fee(){
        return adjst_ymd_fee;
    }

    @ElVoField(physicalName = "adjst_ymd_fee")
    public void setAdjst_ymd_fee(long adjst_ymd_fee){
        this.adjst_ymd_fee = adjst_ymd_fee;
    }

    @ElVoField(physicalName = "adjst_ymd_fee_rmk")
    public String getAdjst_ymd_fee_rmk(){
        return adjst_ymd_fee_rmk;
    }

    @ElVoField(physicalName = "adjst_ymd_fee_rmk")
    public void setAdjst_ymd_fee_rmk(String adjst_ymd_fee_rmk){
        this.adjst_ymd_fee_rmk = adjst_ymd_fee_rmk;
    }

    @ElVoField(physicalName = "truth_meal_fee")
    public long getTruth_meal_fee(){
        return truth_meal_fee;
    }

    @ElVoField(physicalName = "truth_meal_fee")
    public void setTruth_meal_fee(long truth_meal_fee){
        this.truth_meal_fee = truth_meal_fee;
    }

    @ElVoField(physicalName = "adjst_meal_fee")
    public long getAdjst_meal_fee(){
        return adjst_meal_fee;
    }

    @ElVoField(physicalName = "adjst_meal_fee")
    public void setAdjst_meal_fee(long adjst_meal_fee){
        this.adjst_meal_fee = adjst_meal_fee;
    }

    @ElVoField(physicalName = "adjst_meal_fee_rmk")
    public String getAdjst_meal_fee_rmk(){
        return adjst_meal_fee_rmk;
    }

    @ElVoField(physicalName = "adjst_meal_fee_rmk")
    public void setAdjst_meal_fee_rmk(String adjst_meal_fee_rmk){
        this.adjst_meal_fee_rmk = adjst_meal_fee_rmk;
    }

    @ElVoField(physicalName = "truth_tot_expns")
    public long getTruth_tot_expns(){
        return truth_tot_expns;
    }

    @ElVoField(physicalName = "truth_tot_expns")
    public void setTruth_tot_expns(long truth_tot_expns){
        this.truth_tot_expns = truth_tot_expns;
    }

    @ElVoField(physicalName = "adjst_tot_expns")
    public long getAdjst_tot_expns(){
        return adjst_tot_expns;
    }

    @ElVoField(physicalName = "adjst_tot_expns")
    public void setAdjst_tot_expns(long adjst_tot_expns){
        this.adjst_tot_expns = adjst_tot_expns;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "posi_clsf")
    public String getPosi_clsf(){
        return posi_clsf;
    }

    @ElVoField(physicalName = "posi_clsf")
    public void setPosi_clsf(String posi_clsf){
        this.posi_clsf = posi_clsf;
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

    @ElVoField(physicalName = "expns_cnt")
    public int getExpns_cnt(){
        return expns_cnt;
    }

    @ElVoField(physicalName = "expns_cnt")
    public void setExpns_cnt(int expns_cnt){
        this.expns_cnt = expns_cnt;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "biztrip_region")
    public String getBiztrip_region(){
        return biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_region")
    public void setBiztrip_region(String biztrip_region){
        this.biztrip_region = biztrip_region;
    }

    @ElVoField(physicalName = "chng_biztrip_land")
    public String getChng_biztrip_land(){
        return chng_biztrip_land;
    }

    @ElVoField(physicalName = "chng_biztrip_land")
    public void setChng_biztrip_land(String chng_biztrip_land){
        this.chng_biztrip_land = chng_biztrip_land;
    }

    @ElVoField(physicalName = "air_mile_no")
    public String getAir_mile_no(){
        return air_mile_no;
    }

    @ElVoField(physicalName = "air_mile_no")
    public void setAir_mile_no(String air_mile_no){
        this.air_mile_no = air_mile_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_prd")
    public String getReq_prd(){
        return req_prd;
    }

    @ElVoField(physicalName = "req_prd")
    public void setReq_prd(String req_prd){
        this.req_prd = req_prd;
    }

    @ElVoField(physicalName = "totl_fare_fee_max")
    public long getTotl_fare_fee_max(){
        return totl_fare_fee_max;
    }

    @ElVoField(physicalName = "totl_fare_fee_max")
    public void setTotl_fare_fee_max(long totl_fare_fee_max){
        this.totl_fare_fee_max = totl_fare_fee_max;
    }

    @ElVoField(physicalName = "totl_fare_fee")
    public long getTotl_fare_fee(){
        return totl_fare_fee;
    }

    @ElVoField(physicalName = "totl_fare_fee")
    public void setTotl_fare_fee(long totl_fare_fee){
        this.totl_fare_fee = totl_fare_fee;
    }

    @ElVoField(physicalName = "totl_fare_fee_pay")
    public long getTotl_fare_fee_pay(){
        return totl_fare_fee_pay;
    }

    @ElVoField(physicalName = "totl_fare_fee_pay")
    public void setTotl_fare_fee_pay(long totl_fare_fee_pay){
        this.totl_fare_fee_pay = totl_fare_fee_pay;
    }

    @ElVoField(physicalName = "card_meal")
    public int getCard_meal(){
        return card_meal;
    }

    @ElVoField(physicalName = "card_meal")
    public void setCard_meal(int card_meal){
        this.card_meal = card_meal;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public String getNo_trvel_expns(){
        return no_trvel_expns;
    }

    @ElVoField(physicalName = "no_trvel_expns")
    public void setNo_trvel_expns(String no_trvel_expns){
        this.no_trvel_expns = no_trvel_expns;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomAdFormVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("excess_resn_cd").append("=").append(excess_resn_cd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("truth_fare_fee").append("=").append(truth_fare_fee).append(",");
        sb.append("adjst_fare_fee").append("=").append(adjst_fare_fee).append(",");
        sb.append("adjst_fare_fee_rmk").append("=").append(adjst_fare_fee_rmk).append(",");
        sb.append("truth_lodg_fee").append("=").append(truth_lodg_fee).append(",");
        sb.append("adjst_lodg_fee").append("=").append(adjst_lodg_fee).append(",");
        sb.append("adjst_lodg_fee_rmk").append("=").append(adjst_lodg_fee_rmk).append(",");
        sb.append("truth_ymd_fee").append("=").append(truth_ymd_fee).append(",");
        sb.append("adjst_ymd_fee").append("=").append(adjst_ymd_fee).append(",");
        sb.append("adjst_ymd_fee_rmk").append("=").append(adjst_ymd_fee_rmk).append(",");
        sb.append("truth_meal_fee").append("=").append(truth_meal_fee).append(",");
        sb.append("adjst_meal_fee").append("=").append(adjst_meal_fee).append(",");
        sb.append("adjst_meal_fee_rmk").append("=").append(adjst_meal_fee_rmk).append(",");
        sb.append("truth_tot_expns").append("=").append(truth_tot_expns).append(",");
        sb.append("adjst_tot_expns").append("=").append(adjst_tot_expns).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("posi_clsf").append("=").append(posi_clsf).append(",");
        sb.append("notebook_out").append("=").append(notebook_out).append(",");
        sb.append("usb_out").append("=").append(usb_out).append(",");
        sb.append("expns_cnt").append("=").append(expns_cnt).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("biztrip_region").append("=").append(biztrip_region).append(",");
        sb.append("chng_biztrip_land").append("=").append(chng_biztrip_land).append(",");
        sb.append("air_mile_no").append("=").append(air_mile_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_prd").append("=").append(req_prd).append(",");
        sb.append("totl_fare_fee_max").append("=").append(totl_fare_fee_max).append(",");
        sb.append("totl_fare_fee").append("=").append(totl_fare_fee).append(",");
        sb.append("totl_fare_fee_pay").append("=").append(totl_fare_fee_pay).append(",");
        sb.append("card_meal").append("=").append(card_meal).append(",");
        sb.append("no_trvel_expns").append("=").append(no_trvel_expns);
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
