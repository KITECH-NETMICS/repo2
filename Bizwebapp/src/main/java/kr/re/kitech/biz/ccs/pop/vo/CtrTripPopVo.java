package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장신청번호 검색 Vo")
public class CtrTripPopVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripPopVo(){
    }

    @ElDtoField(logicalName = "출장구분", physicalName = "trip_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_knd;

    @ElDtoField(logicalName = "출장신청(정산)번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장기간", physicalName = "biztrip_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_term;

    @ElDtoField(logicalName = "출장지", physicalName = "biztrip_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region_nm;

    @ElDtoField(logicalName = "복명서일자", physicalName = "rep_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_ymd;

    @ElDtoField(logicalName = "카드식", physicalName = "card_meal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_meal;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "출장금액", physicalName = "tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_expns;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "복명서번호", physicalName = "rep_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_req_no;

    @ElDtoField(logicalName = "출장목적", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElVoField(physicalName = "trip_knd")
    public String getTrip_knd(){
        return trip_knd;
    }

    @ElVoField(physicalName = "trip_knd")
    public void setTrip_knd(String trip_knd){
        this.trip_knd = trip_knd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
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

    @ElVoField(physicalName = "rep_ymd")
    public String getRep_ymd(){
        return rep_ymd;
    }

    @ElVoField(physicalName = "rep_ymd")
    public void setRep_ymd(String rep_ymd){
        this.rep_ymd = rep_ymd;
    }

    @ElVoField(physicalName = "card_meal")
    public String getCard_meal(){
        return card_meal;
    }

    @ElVoField(physicalName = "card_meal")
    public void setCard_meal(String card_meal){
        this.card_meal = card_meal;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public String getBiztrip_psn_nm(){
        return biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public void setBiztrip_psn_nm(String biztrip_psn_nm){
        this.biztrip_psn_nm = biztrip_psn_nm;
    }

    @ElVoField(physicalName = "tot_expns")
    public long getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(long tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "rep_req_no")
    public String getRep_req_no(){
        return rep_req_no;
    }

    @ElVoField(physicalName = "rep_req_no")
    public void setRep_req_no(String rep_req_no){
        this.rep_req_no = rep_req_no;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        return biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripPopVo [");
        sb.append("trip_knd").append("=").append(trip_knd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_term").append("=").append(biztrip_term).append(",");
        sb.append("biztrip_region_nm").append("=").append(biztrip_region_nm).append(",");
        sb.append("rep_ymd").append("=").append(rep_ymd).append(",");
        sb.append("card_meal").append("=").append(card_meal).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("rep_req_no").append("=").append(rep_req_no).append(",");
        sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm);
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
