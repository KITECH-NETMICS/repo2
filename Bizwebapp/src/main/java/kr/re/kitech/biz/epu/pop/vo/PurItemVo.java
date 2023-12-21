package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "품목코드Vo")
public class PurItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurItemVo(){
    }

    @ElDtoField(logicalName = "아이템순서", physicalName = "item_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_odr;

    @ElDtoField(logicalName = "아이템코드", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_cd;

    @ElDtoField(logicalName = "한글명", physicalName = "krchar_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_gdnm;

    @ElDtoField(logicalName = "영문명", physicalName = "eng_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_gdnm;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "단위코드", physicalName = "unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_cd;

    @ElDtoField(logicalName = "추정단가", physicalName = "req_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_unit_price;

    @ElDtoField(logicalName = "추정가격", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "실부가세", physicalName = "req_time_addtax_extexpns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_time_addtax_extexpns;

    @ElDtoField(logicalName = "합계금액", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "부대비", physicalName = "incidntl_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incidntl_expns;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "코드한글명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "코드영문명", physicalName = "item_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_eng_nm;

    @ElDtoField(logicalName = "상위코드", physicalName = "item_upper_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_upper_cd;

    @ElDtoField(logicalName = "상세설명", physicalName = "item_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_rmk;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "화폐단위", physicalName = "curncy_unit_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_cd;

    @ElDtoField(logicalName = "국내외구분", physicalName = "local_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_cd;

    @ElDtoField(logicalName = "환율", physicalName = "req_time_exchgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_time_exchgr;

    @ElVoField(physicalName = "item_odr")
    public String getItem_odr(){
        return item_odr;
    }

    @ElVoField(physicalName = "item_odr")
    public void setItem_odr(String item_odr){
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

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "unit_cd")
    public String getUnit_cd(){
        return unit_cd;
    }

    @ElVoField(physicalName = "unit_cd")
    public void setUnit_cd(String unit_cd){
        this.unit_cd = unit_cd;
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

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "item_eng_nm")
    public String getItem_eng_nm(){
        return item_eng_nm;
    }

    @ElVoField(physicalName = "item_eng_nm")
    public void setItem_eng_nm(String item_eng_nm){
        this.item_eng_nm = item_eng_nm;
    }

    @ElVoField(physicalName = "item_upper_cd")
    public String getItem_upper_cd(){
        return item_upper_cd;
    }

    @ElVoField(physicalName = "item_upper_cd")
    public void setItem_upper_cd(String item_upper_cd){
        this.item_upper_cd = item_upper_cd;
    }

    @ElVoField(physicalName = "item_rmk")
    public String getItem_rmk(){
        return item_rmk;
    }

    @ElVoField(physicalName = "item_rmk")
    public void setItem_rmk(String item_rmk){
        this.item_rmk = item_rmk;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "curncy_unit_cd")
    public String getCurncy_unit_cd(){
        return curncy_unit_cd;
    }

    @ElVoField(physicalName = "curncy_unit_cd")
    public void setCurncy_unit_cd(String curncy_unit_cd){
        this.curncy_unit_cd = curncy_unit_cd;
    }

    @ElVoField(physicalName = "local_cd")
    public String getLocal_cd(){
        return local_cd;
    }

    @ElVoField(physicalName = "local_cd")
    public void setLocal_cd(String local_cd){
        this.local_cd = local_cd;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public String getReq_time_exchgr(){
        return req_time_exchgr;
    }

    @ElVoField(physicalName = "req_time_exchgr")
    public void setReq_time_exchgr(String req_time_exchgr){
        this.req_time_exchgr = req_time_exchgr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurItemVo [");
        sb.append("item_odr").append("=").append(item_odr).append(",");
        sb.append("item_cd").append("=").append(item_cd).append(",");
        sb.append("krchar_gdnm").append("=").append(krchar_gdnm).append(",");
        sb.append("eng_gdnm").append("=").append(eng_gdnm).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("unit_cd").append("=").append(unit_cd).append(",");
        sb.append("req_unit_price").append("=").append(req_unit_price).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("req_time_addtax_extexpns").append("=").append(req_time_addtax_extexpns).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("incidntl_expns").append("=").append(incidntl_expns).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("item_eng_nm").append("=").append(item_eng_nm).append(",");
        sb.append("item_upper_cd").append("=").append(item_upper_cd).append(",");
        sb.append("item_rmk").append("=").append(item_rmk).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("curncy_unit_cd").append("=").append(curncy_unit_cd).append(",");
        sb.append("local_cd").append("=").append(local_cd).append(",");
        sb.append("req_time_exchgr").append("=").append(req_time_exchgr);
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
