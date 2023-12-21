package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매품목 Vo")
public class PurReqItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqItemVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "항목순번", physicalName = "item_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int item_odr;

    @ElDtoField(logicalName = "품목코드", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_cd;

    @ElDtoField(logicalName = "한글품명", physicalName = "krchar_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_gdnm;

    @ElDtoField(logicalName = "영문품명", physicalName = "eng_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_gdnm;

    @ElDtoField(logicalName = "단위코드", physicalName = "unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_cd;

    @ElDtoField(logicalName = "단위", physicalName = "unit_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_desc;

    @ElDtoField(logicalName = "통화단위코드", physicalName = "curncy_unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_cd;

    @ElDtoField(logicalName = "요청시환율", physicalName = "req_time_exchgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_time_exchgr;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "추정단가", physicalName = "req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_unit_price;

    @ElDtoField(logicalName = "추정가격", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "부가세", physicalName = "req_time_addtax_extexpns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_time_addtax_extexpns;

    @ElDtoField(logicalName = "요청금액합계", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "부대비", physicalName = "incidntl_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incidntl_expns;

    @ElDtoField(logicalName = "외자시LOCAL코드", physicalName = "local_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_cd;

    @ElDtoField(logicalName = "HS 코드 번호", physicalName = "hs_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hs_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "중기간경쟁제품여부", physicalName = "cntst_prod_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cntst_prod_yn;

    @ElDtoField(logicalName = "화폐단위", physicalName = "curncy_unit_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_desc;

    @ElDtoField(logicalName = "국내외구분", physicalName = "local_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_desc;

    @ElDtoField(logicalName = "발주여부코드", physicalName = "order_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_cd;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "item_odr")
    public int getItem_odr(){
        return item_odr;
    }

    @ElVoField(physicalName = "item_odr")
    public void setItem_odr(int item_odr){
        this.item_odr = item_odr;
    }

    @ElVoField(physicalName = "item_cd")
    public String getItem_cd(){
        return item_cd;
    }

    @ElVoField(physicalName = "item_cd")
    public void setItem_cd(String item_cd){
        this.item_cd = item_cd;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public String getKrchar_gdnm(){
        return krchar_gdnm;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public void setKrchar_gdnm(String krchar_gdnm){
        this.krchar_gdnm = krchar_gdnm;
    }

    @ElVoField(physicalName = "eng_gdnm")
    public String getEng_gdnm(){
        return eng_gdnm;
    }

    @ElVoField(physicalName = "eng_gdnm")
    public void setEng_gdnm(String eng_gdnm){
        this.eng_gdnm = eng_gdnm;
    }

    @ElVoField(physicalName = "unit_cd")
    public String getUnit_cd(){
        return unit_cd;
    }

    @ElVoField(physicalName = "unit_cd")
    public void setUnit_cd(String unit_cd){
        this.unit_cd = unit_cd;
    }

    @ElVoField(physicalName = "unit_desc")
    public String getUnit_desc(){
        return unit_desc;
    }

    @ElVoField(physicalName = "unit_desc")
    public void setUnit_desc(String unit_desc){
        this.unit_desc = unit_desc;
    }

    @ElVoField(physicalName = "curncy_unit_cd")
    public String getCurncy_unit_cd(){
        return curncy_unit_cd;
    }

    @ElVoField(physicalName = "curncy_unit_cd")
    public void setCurncy_unit_cd(String curncy_unit_cd){
        this.curncy_unit_cd = curncy_unit_cd;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public String getReq_time_exchgr(){
        return req_time_exchgr;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public void setReq_time_exchgr(String req_time_exchgr){
        this.req_time_exchgr = req_time_exchgr;
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
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public long getReq_time_addtax_extexpns(){
        return req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "req_time_addtax_extexpns")
    public void setReq_time_addtax_extexpns(long req_time_addtax_extexpns){
        this.req_time_addtax_extexpns = req_time_addtax_extexpns;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public long getIncidntl_expns(){
        return incidntl_expns;
    }

    @ElVoField(physicalName = "incidntl_expns")
    public void setIncidntl_expns(long incidntl_expns){
        this.incidntl_expns = incidntl_expns;
    }

    @ElVoField(physicalName = "local_cd")
    public String getLocal_cd(){
        return local_cd;
    }

    @ElVoField(physicalName = "local_cd")
    public void setLocal_cd(String local_cd){
        this.local_cd = local_cd;
    }

    @ElVoField(physicalName = "hs_no")
    public String getHs_no(){
        return hs_no;
    }

    @ElVoField(physicalName = "hs_no")
    public void setHs_no(String hs_no){
        this.hs_no = hs_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public String getCntst_prod_yn(){
        return cntst_prod_yn;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public void setCntst_prod_yn(String cntst_prod_yn){
        this.cntst_prod_yn = cntst_prod_yn;
    }

    @ElVoField(physicalName = "curncy_unit_desc")
    public String getCurncy_unit_desc(){
        return curncy_unit_desc;
    }

    @ElVoField(physicalName = "curncy_unit_desc")
    public void setCurncy_unit_desc(String curncy_unit_desc){
        this.curncy_unit_desc = curncy_unit_desc;
    }

    @ElVoField(physicalName = "local_desc")
    public String getLocal_desc(){
        return local_desc;
    }

    @ElVoField(physicalName = "local_desc")
    public void setLocal_desc(String local_desc){
        this.local_desc = local_desc;
    }

    @ElVoField(physicalName = "order_cd")
    public String getOrder_cd(){
        return order_cd;
    }

    @ElVoField(physicalName = "order_cd")
    public void setOrder_cd(String order_cd){
        this.order_cd = order_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqItemVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("item_odr").append("=").append(item_odr).append(",");
        sb.append("item_cd").append("=").append(item_cd).append(",");
        sb.append("krchar_gdnm").append("=").append(krchar_gdnm).append(",");
        sb.append("eng_gdnm").append("=").append(eng_gdnm).append(",");
        sb.append("unit_cd").append("=").append(unit_cd).append(",");
        sb.append("unit_desc").append("=").append(unit_desc).append(",");
        sb.append("curncy_unit_cd").append("=").append(curncy_unit_cd).append(",");
        sb.append("req_time_exchgr").append("=").append(req_time_exchgr).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("req_unit_price").append("=").append(req_unit_price).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("req_time_addtax_extexpns").append("=").append(req_time_addtax_extexpns).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("incidntl_expns").append("=").append(incidntl_expns).append(",");
        sb.append("local_cd").append("=").append(local_cd).append(",");
        sb.append("hs_no").append("=").append(hs_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cntst_prod_yn").append("=").append(cntst_prod_yn).append(",");
        sb.append("curncy_unit_desc").append("=").append(curncy_unit_desc).append(",");
        sb.append("local_desc").append("=").append(local_desc).append(",");
        sb.append("order_cd").append("=").append(order_cd);
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
