package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EpuPurReqItemExp")
public class EpuPurReqItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public EpuPurReqItemVo(){
  }

  @ElDtoField(logicalName = "purReqNo", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String pur_req_no;

  @ElDtoField(logicalName = "itemNm", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String item_nm;

  @ElDtoField(logicalName = "unitCd", physicalName = "unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String unit_cd;

  @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String qty;

  @ElDtoField(logicalName = "reqUnitPrice", physicalName = "req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_unit_price;

  @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rmk;

  @ElDtoField(logicalName = "orderCd", physicalName = "order_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String order_cd;

  @ElDtoField(logicalName = "itemCd", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String item_cd;

  @ElDtoField(logicalName = "itemOdr", physicalName = "item_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String item_odr;

  @ElDtoField(logicalName = "itemClsf", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String item_clsf;

  @ElDtoField(logicalName = "delvrPlcNm", physicalName = "delvr_plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String delvr_plc_nm;

  @ElDtoField(logicalName = "delvrDemndDaycnt", physicalName = "delvr_demnd_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String delvr_demnd_daycnt;

  @ElDtoField(logicalName = "pItemNm", physicalName = "p_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String p_item_nm;

  @ElDtoField(logicalName = "curncyUnitCd", physicalName = "curncy_unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String curncy_unit_cd;

  @ElDtoField(logicalName = "cntstProdYn", physicalName = "cntst_prod_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String cntst_prod_yn;

  @ElDtoField(logicalName = "curncyUnitNm", physicalName = "curncy_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String curncy_unit_nm;

  @ElDtoField(logicalName = "curncyUnitAmtCd", physicalName = "curncy_unit_amt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String curncy_unit_amt_cd;

  @ElDtoField(logicalName = "reqTimeExchgr", physicalName = "req_time_exchgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_time_exchgr;

  @ElDtoField(logicalName = "reqAmt", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_amt;

  @ElDtoField(logicalName = "reqTimeAddtaxExtexpns", physicalName = "req_time_addtax_extexpns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_time_addtax_extexpns;

  @ElDtoField(logicalName = "incidntlExpns", physicalName = "incidntl_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String incidntl_expns;

  @ElDtoField(logicalName = "reqAmtSum", physicalName = "req_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_amt_sum;

  @ElDtoField(logicalName = "forReqUnitPrice", physicalName = "for_req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String for_req_unit_price;

  @ElDtoField(logicalName = "orgBidOrdNo", physicalName = "org_bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String org_bid_ord_no;

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

  @ElVoField(physicalName = "rmk")
  public String getRmk(){
      return rmk;
  }

  @ElVoField(physicalName = "rmk")
  public void setRmk(String rmk){
      this.rmk = rmk;
  }

  @ElVoField(physicalName = "order_cd")
  public String getOrder_cd(){
      return order_cd;
  }

  @ElVoField(physicalName = "order_cd")
  public void setOrder_cd(String order_cd){
      this.order_cd = order_cd;
  }

  @ElVoField(physicalName = "item_cd")
  public String getItem_cd(){
      return item_cd;
  }

  @ElVoField(physicalName = "item_cd")
  public void setItem_cd(String item_cd){
      this.item_cd = item_cd;
  }

  @ElVoField(physicalName = "item_odr")
  public String getItem_odr(){
      return item_odr;
  }

  @ElVoField(physicalName = "item_odr")
  public void setItem_odr(String item_odr){
      this.item_odr = item_odr;
  }

  @ElVoField(physicalName = "item_clsf")
  public String getItem_clsf(){
      return item_clsf;
  }

  @ElVoField(physicalName = "item_clsf")
  public void setItem_clsf(String item_clsf){
      this.item_clsf = item_clsf;
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

  @ElVoField(physicalName = "p_item_nm")
  public String getP_item_nm(){
      return p_item_nm;
  }

  @ElVoField(physicalName = "p_item_nm")
  public void setP_item_nm(String p_item_nm){
      this.p_item_nm = p_item_nm;
  }

  @ElVoField(physicalName = "curncy_unit_cd")
  public String getCurncy_unit_cd(){
      return curncy_unit_cd;
  }

  @ElVoField(physicalName = "curncy_unit_cd")
  public void setCurncy_unit_cd(String curncy_unit_cd){
      this.curncy_unit_cd = curncy_unit_cd;
  }

  @ElVoField(physicalName = "cntst_prod_yn")
  public String getCntst_prod_yn(){
      return cntst_prod_yn;
  }

  @ElVoField(physicalName = "cntst_prod_yn")
  public void setCntst_prod_yn(String cntst_prod_yn){
      this.cntst_prod_yn = cntst_prod_yn;
  }

  @ElVoField(physicalName = "curncy_unit_nm")
  public String getCurncy_unit_nm(){
      return curncy_unit_nm;
  }

  @ElVoField(physicalName = "curncy_unit_nm")
  public void setCurncy_unit_nm(String curncy_unit_nm){
      this.curncy_unit_nm = curncy_unit_nm;
  }

  @ElVoField(physicalName = "curncy_unit_amt_cd")
  public String getCurncy_unit_amt_cd(){
      return curncy_unit_amt_cd;
  }

  @ElVoField(physicalName = "curncy_unit_amt_cd")
  public void setCurncy_unit_amt_cd(String curncy_unit_amt_cd){
      this.curncy_unit_amt_cd = curncy_unit_amt_cd;
  }

  @ElVoField(physicalName = "req_time_exchgr")
  public String getReq_time_exchgr(){
      return req_time_exchgr;
  }

  @ElVoField(physicalName = "req_time_exchgr")
  public void setReq_time_exchgr(String req_time_exchgr){
      this.req_time_exchgr = req_time_exchgr;
  }

  @ElVoField(physicalName = "req_amt")
  public String getReq_amt(){
      return req_amt;
  }

  @ElVoField(physicalName = "req_amt")
  public void setReq_amt(String req_amt){
      this.req_amt = req_amt;
  }

  @ElVoField(physicalName = "req_time_addtax_extexpns")
  public String getReq_time_addtax_extexpns(){
      return req_time_addtax_extexpns;
  }

  @ElVoField(physicalName = "req_time_addtax_extexpns")
  public void setReq_time_addtax_extexpns(String req_time_addtax_extexpns){
      this.req_time_addtax_extexpns = req_time_addtax_extexpns;
  }

  @ElVoField(physicalName = "incidntl_expns")
  public String getIncidntl_expns(){
      return incidntl_expns;
  }

  @ElVoField(physicalName = "incidntl_expns")
  public void setIncidntl_expns(String incidntl_expns){
      this.incidntl_expns = incidntl_expns;
  }

  @ElVoField(physicalName = "req_amt_sum")
  public String getReq_amt_sum(){
      return req_amt_sum;
  }

  @ElVoField(physicalName = "req_amt_sum")
  public void setReq_amt_sum(String req_amt_sum){
      this.req_amt_sum = req_amt_sum;
  }

  @ElVoField(physicalName = "for_req_unit_price")
  public String getFor_req_unit_price(){
      return for_req_unit_price;
  }

  @ElVoField(physicalName = "for_req_unit_price")
  public void setFor_req_unit_price(String for_req_unit_price){
      this.for_req_unit_price = for_req_unit_price;
  }

  @ElVoField(physicalName = "org_bid_ord_no")
  public String getOrg_bid_ord_no(){
      return org_bid_ord_no;
  }

  @ElVoField(physicalName = "org_bid_ord_no")
  public void setOrg_bid_ord_no(String org_bid_ord_no){
      this.org_bid_ord_no = org_bid_ord_no;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("EpuPurReqItemVo [");
      sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
      sb.append("item_nm").append("=").append(item_nm).append(",");
      sb.append("unit_cd").append("=").append(unit_cd).append(",");
      sb.append("qty").append("=").append(qty).append(",");
      sb.append("req_unit_price").append("=").append(req_unit_price).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("order_cd").append("=").append(order_cd).append(",");
      sb.append("item_cd").append("=").append(item_cd).append(",");
      sb.append("item_odr").append("=").append(item_odr).append(",");
      sb.append("item_clsf").append("=").append(item_clsf).append(",");
      sb.append("delvr_plc_nm").append("=").append(delvr_plc_nm).append(",");
      sb.append("delvr_demnd_daycnt").append("=").append(delvr_demnd_daycnt).append(",");
      sb.append("p_item_nm").append("=").append(p_item_nm).append(",");
      sb.append("curncy_unit_cd").append("=").append(curncy_unit_cd).append(",");
      sb.append("cntst_prod_yn").append("=").append(cntst_prod_yn).append(",");
      sb.append("curncy_unit_nm").append("=").append(curncy_unit_nm).append(",");
      sb.append("curncy_unit_amt_cd").append("=").append(curncy_unit_amt_cd).append(",");
      sb.append("req_time_exchgr").append("=").append(req_time_exchgr).append(",");
      sb.append("req_amt").append("=").append(req_amt).append(",");
      sb.append("req_time_addtax_extexpns").append("=").append(req_time_addtax_extexpns).append(",");
      sb.append("incidntl_expns").append("=").append(incidntl_expns).append(",");
      sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
      sb.append("for_req_unit_price").append("=").append(for_req_unit_price).append(",");
      sb.append("org_bid_ord_no").append("=").append(org_bid_ord_no);
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