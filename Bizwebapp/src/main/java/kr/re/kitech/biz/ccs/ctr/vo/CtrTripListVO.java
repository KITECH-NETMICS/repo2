package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장정보")
public class CtrTripListVO extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripListVO(){
    }

    @ElDtoField(logicalName = "작성번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자", physicalName = "trip_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_psn;

    @ElDtoField(logicalName = "출장구분", physicalName = "trip_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_knd;

    @ElDtoField(logicalName = "출장기간", physicalName = "biztrip_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_term;

    @ElDtoField(logicalName = "출장지", physicalName = "biztrip_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region_nm;

    @ElDtoField(logicalName = "출장목적구분", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal;

    @ElDtoField(logicalName = "출장목적", physicalName = "biztrip_goal_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal_rmk;

    @ElDtoField(logicalName = "방문기관", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;

    @ElDtoField(logicalName = "가결번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "출장카드식", physicalName = "card_meal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_meal;

    @ElDtoField(logicalName = "정산카드식", physicalName = "card_meal_ad", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_meal_ad;

    @ElDtoField(logicalName = "출장총액", physicalName = "tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_expns;

    @ElDtoField(logicalName = "복명서제출일", physicalName = "rep_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_ymd;

    @ElDtoField(logicalName = "복명서번호", physicalName = "rep_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_no;

    @ElDtoField(logicalName = "정산서번호", physicalName = "adjst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_no;

    @ElDtoField(logicalName = "복명서결재상태", physicalName = "rep_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_apr_state;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "작성자사번", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "정산사유", physicalName = "adjst_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_resn;

    @ElDtoField(logicalName = "정산내용", physicalName = "adjst_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_contnt;

    @ElDtoField(logicalName = "정산금액", physicalName = "adjst_tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long adjst_tot_expns;

    @ElDtoField(logicalName = "통합검색작성번호", physicalName = "req_no_list", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no_list;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "trip_psn")
    public String getTrip_psn(){
        return trip_psn;
    }

    @ElVoField(physicalName = "trip_psn")
    public void setTrip_psn(String trip_psn){
        this.trip_psn = trip_psn;
    }

    @ElVoField(physicalName = "trip_knd")
    public String getTrip_knd(){
        return trip_knd;
    }

    @ElVoField(physicalName = "trip_knd")
    public void setTrip_knd(String trip_knd){
        this.trip_knd = trip_knd;
    }

    @ElVoField(physicalName = "biztrip_term")
    public String getBiztrip_term(){
        return biztrip_term;
    }

    @ElVoField(physicalName = "biztrip_term")
    public void setBiztrip_term(String biztrip_term){
        this.biztrip_term = biztrip_term;
    }

    @ElVoField(physicalName = "biztrip_region_nm")
    public String getBiztrip_region_nm(){
        return biztrip_region_nm;
    }

    @ElVoField(physicalName = "biztrip_region_nm")
    public void setBiztrip_region_nm(String biztrip_region_nm){
        this.biztrip_region_nm = biztrip_region_nm;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        return biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal_rmk")
    public String getBiztrip_goal_rmk(){
        return biztrip_goal_rmk;
    }

    @ElVoField(physicalName = "biztrip_goal_rmk")
    public void setBiztrip_goal_rmk(String biztrip_goal_rmk){
        this.biztrip_goal_rmk = biztrip_goal_rmk;
    }

    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }

    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "card_meal")
    public String getCard_meal(){
        return card_meal;
    }

    @ElVoField(physicalName = "card_meal")
    public void setCard_meal(String card_meal){
        this.card_meal = card_meal;
    }

    @ElVoField(physicalName = "card_meal_ad")
    public String getCard_meal_ad(){
        return card_meal_ad;
    }

    @ElVoField(physicalName = "card_meal_ad")
    public void setCard_meal_ad(String card_meal_ad){
        this.card_meal_ad = card_meal_ad;
    }

    @ElVoField(physicalName = "tot_expns")
    public long getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(long tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "rep_ymd")
    public String getRep_ymd(){
        return rep_ymd;
    }

    @ElVoField(physicalName = "rep_ymd")
    public void setRep_ymd(String rep_ymd){
        this.rep_ymd = rep_ymd;
    }

    @ElVoField(physicalName = "rep_no")
    public String getRep_no(){
        return rep_no;
    }

    @ElVoField(physicalName = "rep_no")
    public void setRep_no(String rep_no){
        this.rep_no = rep_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public String getAdjst_req_no(){
        return adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public void setAdjst_req_no(String adjst_req_no){
        this.adjst_req_no = adjst_req_no;
    }

    @ElVoField(physicalName = "rep_apr_state")
    public String getRep_apr_state(){
        return rep_apr_state;
    }

    @ElVoField(physicalName = "rep_apr_state")
    public void setRep_apr_state(String rep_apr_state){
        this.rep_apr_state = rep_apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "adjst_resn")
    public String getAdjst_resn(){
        return adjst_resn;
    }

    @ElVoField(physicalName = "adjst_resn")
    public void setAdjst_resn(String adjst_resn){
        this.adjst_resn = adjst_resn;
    }

    @ElVoField(physicalName = "adjst_contnt")
    public String getAdjst_contnt(){
        return adjst_contnt;
    }

    @ElVoField(physicalName = "adjst_contnt")
    public void setAdjst_contnt(String adjst_contnt){
        this.adjst_contnt = adjst_contnt;
    }

    @ElVoField(physicalName = "adjst_tot_expns")
    public long getAdjst_tot_expns(){
        return adjst_tot_expns;
    }

    @ElVoField(physicalName = "adjst_tot_expns")
    public void setAdjst_tot_expns(long adjst_tot_expns){
        this.adjst_tot_expns = adjst_tot_expns;
    }

    @ElVoField(physicalName = "req_no_list")
    public String getReq_no_list(){
        return req_no_list;
    }

    @ElVoField(physicalName = "req_no_list")
    public void setReq_no_list(String req_no_list){
        this.req_no_list = req_no_list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripListVO [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("trip_psn").append("=").append(trip_psn).append(",");
        sb.append("trip_knd").append("=").append(trip_knd).append(",");
        sb.append("biztrip_term").append("=").append(biztrip_term).append(",");
        sb.append("biztrip_region_nm").append("=").append(biztrip_region_nm).append(",");
        sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
        sb.append("biztrip_goal_rmk").append("=").append(biztrip_goal_rmk).append(",");
        sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("card_meal").append("=").append(card_meal).append(",");
        sb.append("card_meal_ad").append("=").append(card_meal_ad).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("rep_ymd").append("=").append(rep_ymd).append(",");
        sb.append("rep_no").append("=").append(rep_no).append(",");
        sb.append("adjst_req_no").append("=").append(adjst_req_no).append(",");
        sb.append("rep_apr_state").append("=").append(rep_apr_state).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("adjst_resn").append("=").append(adjst_resn).append(",");
        sb.append("adjst_contnt").append("=").append(adjst_contnt).append(",");
        sb.append("adjst_tot_expns").append("=").append(adjst_tot_expns).append(",");
        sb.append("req_no_list").append("=").append(req_no_list);
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
