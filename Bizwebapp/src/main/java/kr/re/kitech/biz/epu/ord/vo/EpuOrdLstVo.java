package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획관리목록 Vo")
public class EpuOrdLstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdLstVo(){
    }

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "공고진행방법", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "공고명", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "구매번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "공고일자", physicalName = "noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd;

    @ElDtoField(logicalName = "발주금액", physicalName = "assign_amount", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long assign_amount;

    @ElDtoField(logicalName = "구매요구일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "발주담당", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "구매요구부서", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "통합/분리", physicalName = "comb_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comb_yn;

    @ElDtoField(logicalName = "발주계획품목/구매요구품목", physicalName = "combdivide", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combdivide;

    @ElDtoField(logicalName = "발주계획순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "구매요구유지여부", physicalName = "del_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_cause;

    @ElDtoField(logicalName = "부속구매요구번호", physicalName = "inhr_pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inhr_pur_req_no;

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "noti_ymd")
    public String getNoti_ymd(){
        return noti_ymd;
    }

    @ElVoField(physicalName = "noti_ymd")
    public void setNoti_ymd(String noti_ymd){
        this.noti_ymd = noti_ymd;
    }

    @ElVoField(physicalName = "assign_amount")
    public long getAssign_amount(){
        return assign_amount;
    }

    @ElVoField(physicalName = "assign_amount")
    public void setAssign_amount(long assign_amount){
        this.assign_amount = assign_amount;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "comb_yn")
    public String getComb_yn(){
        return comb_yn;
    }

    @ElVoField(physicalName = "comb_yn")
    public void setComb_yn(String comb_yn){
        this.comb_yn = comb_yn;
    }

    @ElVoField(physicalName = "combdivide")
    public String getCombdivide(){
        return combdivide;
    }

    @ElVoField(physicalName = "combdivide")
    public void setCombdivide(String combdivide){
        this.combdivide = combdivide;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "del_cause")
    public String getDel_cause(){
        return del_cause;
    }

    @ElVoField(physicalName = "del_cause")
    public void setDel_cause(String del_cause){
        this.del_cause = del_cause;
    }

    @ElVoField(physicalName = "inhr_pur_req_no")
    public String getInhr_pur_req_no(){
        return inhr_pur_req_no;
    }

    @ElVoField(physicalName = "inhr_pur_req_no")
    public void setInhr_pur_req_no(String inhr_pur_req_no){
        this.inhr_pur_req_no = inhr_pur_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdLstVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("noti_ymd").append("=").append(noti_ymd).append(",");
        sb.append("assign_amount").append("=").append(assign_amount).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("comb_yn").append("=").append(comb_yn).append(",");
        sb.append("combdivide").append("=").append(combdivide).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("del_cause").append("=").append(del_cause).append(",");
        sb.append("inhr_pur_req_no").append("=").append(inhr_pur_req_no);
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
