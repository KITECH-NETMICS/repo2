package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획-구매의뢰내역 Vo")
public class EpuOrdReqItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdReqItemVo(){
    }

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "품목순번", physicalName = "item_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int item_odr;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "품명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "단위", physicalName = "unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_cd;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "추정단가", physicalName = "req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_unit_price;

    @ElDtoField(logicalName = "추정금액", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_amt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "납품장소", physicalName = "delvr_plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_nm;

    @ElDtoField(logicalName = "납품기간", physicalName = "delvr_demnd_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_demnd_daycnt;

    @ElDtoField(logicalName = "구매품목순번", physicalName = "pur_req_item_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pur_req_item_odr;

    @ElDtoField(logicalName = "품목코드", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_cd;

    @ElDtoField(logicalName = "부가세", physicalName = "req_time_addtax_extexpns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_time_addtax_extexpns;

    @ElDtoField(logicalName = "부대비용", physicalName = "incidntl_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incidntl_expns;

    @ElDtoField(logicalName = "요청금액합계", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "orderCd", physicalName = "order_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_cd;

    @ElDtoField(logicalName = "화폐단위명", physicalName = "curncy_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_nm;

    @ElDtoField(logicalName = "환율", physicalName = "req_time_exchgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_time_exchgr;

    @ElDtoField(logicalName = "추정단가(외자)", physicalName = "for_req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String for_req_unit_price;

    @ElDtoField(logicalName = "중기간경쟁제품여부", physicalName = "cntst_prod_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cntst_prod_yn;

    @ElDtoField(logicalName = "구매요구자", physicalName = "user_sub_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_syspayno;

    @ElDtoField(logicalName = "코드한글품명(외자)", physicalName = "p_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String p_item_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "item_odr")
    public int getItem_odr(){
        return item_odr;
    }

    @ElVoField(physicalName = "item_odr")
    public void setItem_odr(int item_odr){
        this.item_odr = item_odr;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "unit_cd")
    public String getUnit_cd(){
        return unit_cd;
    }

    @ElVoField(physicalName = "unit_cd")
    public void setUnit_cd(String unit_cd){
        this.unit_cd = unit_cd;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "req_unit_price")
    public String getReq_unit_price(){
        return req_unit_price;
    }

    @ElVoField(physicalName = "req_unit_price")
    public void setReq_unit_price(String req_unit_price){
        this.req_unit_price = req_unit_price;
    }

    @ElVoField(physicalName = "req_amt")
    public String getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(String req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public String getDelvr_plc_nm(){
        return delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public void setDelvr_plc_nm(String delvr_plc_nm){
        this.delvr_plc_nm = delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public String getDelvr_demnd_daycnt(){
        return delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public void setDelvr_demnd_daycnt(String delvr_demnd_daycnt){
        this.delvr_demnd_daycnt = delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "pur_req_item_odr")
    public int getPur_req_item_odr(){
        return pur_req_item_odr;
    }

    @ElVoField(physicalName = "pur_req_item_odr")
    public void setPur_req_item_odr(int pur_req_item_odr){
        this.pur_req_item_odr = pur_req_item_odr;
    }

    @ElVoField(physicalName = "item_cd")
    public String getItem_cd(){
        return item_cd;
    }

    @ElVoField(physicalName = "item_cd")
    public void setItem_cd(String item_cd){
        this.item_cd = item_cd;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public long getReq_time_addtax_extexpns(){
        return req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public void setReq_time_addtax_extexpns(long req_time_addtax_extexpns){
        this.req_time_addtax_extexpns = req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public long getIncidntl_expns(){
        return incidntl_expns;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public void setIncidntl_expns(long incidntl_expns){
        this.incidntl_expns = incidntl_expns;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "order_cd")
    public String getOrder_cd(){
        return order_cd;
    }

    @ElVoField(physicalName = "order_cd")
    public void setOrder_cd(String order_cd){
        this.order_cd = order_cd;
    }

    @ElVoField(physicalName = "curncy_unit_nm")
    public String getCurncy_unit_nm(){
        return curncy_unit_nm;
    }

    @ElVoField(physicalName = "curncy_unit_nm")
    public void setCurncy_unit_nm(String curncy_unit_nm){
        this.curncy_unit_nm = curncy_unit_nm;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public String getReq_time_exchgr(){
        return req_time_exchgr;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public void setReq_time_exchgr(String req_time_exchgr){
        this.req_time_exchgr = req_time_exchgr;
    }

    @ElVoField(physicalName = "for_req_unit_price")
    public String getFor_req_unit_price(){
        return for_req_unit_price;
    }

    @ElVoField(physicalName = "for_req_unit_price")
    public void setFor_req_unit_price(String for_req_unit_price){
        this.for_req_unit_price = for_req_unit_price;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public String getCntst_prod_yn(){
        return cntst_prod_yn;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public void setCntst_prod_yn(String cntst_prod_yn){
        this.cntst_prod_yn = cntst_prod_yn;
    }

    @ElVoField(physicalName = "user_sub_syspayno")
    public String getUser_sub_syspayno(){
        return user_sub_syspayno;
    }

    @ElVoField(physicalName = "user_sub_syspayno")
    public void setUser_sub_syspayno(String user_sub_syspayno){
        this.user_sub_syspayno = user_sub_syspayno;
    }

    @ElVoField(physicalName = "p_item_nm")
    public String getP_item_nm(){
        return p_item_nm;
    }

    @ElVoField(physicalName = "p_item_nm")
    public void setP_item_nm(String p_item_nm){
        this.p_item_nm = p_item_nm;
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
        sb.append("EpuOrdReqItemVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("item_odr").append("=").append(item_odr).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("unit_cd").append("=").append(unit_cd).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("req_unit_price").append("=").append(req_unit_price).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("delvr_plc_nm").append("=").append(delvr_plc_nm).append(",");
        sb.append("delvr_demnd_daycnt").append("=").append(delvr_demnd_daycnt).append(",");
        sb.append("pur_req_item_odr").append("=").append(pur_req_item_odr).append(",");
        sb.append("item_cd").append("=").append(item_cd).append(",");
        sb.append("req_time_addtax_extexpns").append("=").append(req_time_addtax_extexpns).append(",");
        sb.append("incidntl_expns").append("=").append(incidntl_expns).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("order_cd").append("=").append(order_cd).append(",");
        sb.append("curncy_unit_nm").append("=").append(curncy_unit_nm).append(",");
        sb.append("req_time_exchgr").append("=").append(req_time_exchgr).append(",");
        sb.append("for_req_unit_price").append("=").append(for_req_unit_price).append(",");
        sb.append("cntst_prod_yn").append("=").append(cntst_prod_yn).append(",");
        sb.append("user_sub_syspayno").append("=").append(user_sub_syspayno).append(",");
        sb.append("p_item_nm").append("=").append(p_item_nm).append(",");
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
