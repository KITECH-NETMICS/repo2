package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 세부내역 Vo")
public class FtxBillDVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillDVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "품목코드", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_cd;

    @ElDtoField(logicalName = "품명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "규격", physicalName = "std", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int qty;

    @ElDtoField(logicalName = "단가", physicalName = "unit_price", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unit_price;

    @ElDtoField(logicalName = "공급가액", physicalName = "amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long amt;

    @ElDtoField(logicalName = "세액", physicalName = "taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long taxamt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "기술지원사업구분", physicalName = "supt_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_work_clsf;

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "item_cd")
    public String getItem_cd(){
        return item_cd;
    }

    @ElVoField(physicalName = "item_cd")
    public void setItem_cd(String item_cd){
        this.item_cd = item_cd;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "std")
    public String getStd(){
        return std;
    }

    @ElVoField(physicalName = "std")
    public void setStd(String std){
        this.std = std;
    }

    @ElVoField(physicalName = "qty")
    public int getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(int qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "unit_price")
    public long getUnit_price(){
        return unit_price;
    }

    @ElVoField(physicalName = "unit_price")
    public void setUnit_price(long unit_price){
        this.unit_price = unit_price;
    }

    @ElVoField(physicalName = "amt")
    public long getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(long amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "taxamt")
    public long getTaxamt(){
        return taxamt;
    }

    @ElVoField(physicalName = "taxamt")
    public void setTaxamt(long taxamt){
        this.taxamt = taxamt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public String getSupt_work_clsf(){
        return supt_work_clsf;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public void setSupt_work_clsf(String supt_work_clsf){
        this.supt_work_clsf = supt_work_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillDVo [");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("item_cd").append("=").append(item_cd).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("std").append("=").append(std).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("unit_price").append("=").append(unit_price).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("taxamt").append("=").append(taxamt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("supt_work_clsf").append("=").append(supt_work_clsf);
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
