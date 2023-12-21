package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품검수 품목 Vo")
public class FspSmlItemCheckupDVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSmlItemCheckupDVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "순번", physicalName = "check_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int check_odr;

    @ElDtoField(logicalName = "물품분류", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf;

    @ElDtoField(logicalName = "물품명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "물품단위", physicalName = "item_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit;

    @ElDtoField(logicalName = "단가", physicalName = "item_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit_price;

    @ElDtoField(logicalName = "수량", physicalName = "item_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int item_qty;

    @ElDtoField(logicalName = "금액", physicalName = "item_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long item_amt;

    @ElDtoField(logicalName = "부가세", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "총액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "물품단위명", physicalName = "item_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit_nm;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "check_odr")
    public int getCheck_odr(){
        return check_odr;
    }

    @ElVoField(physicalName = "check_odr")
    public void setCheck_odr(int check_odr){
        this.check_odr = check_odr;
    }

    @ElVoField(physicalName = "item_clsf")
    public String getItem_clsf(){
        return item_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public void setItem_clsf(String item_clsf){
        this.item_clsf = item_clsf;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "item_unit")
    public String getItem_unit(){
        return item_unit;
    }

    @ElVoField(physicalName = "item_unit")
    public void setItem_unit(String item_unit){
        this.item_unit = item_unit;
    }

    @ElVoField(physicalName = "item_unit_price")
    public String getItem_unit_price(){
        return item_unit_price;
    }

    @ElVoField(physicalName = "item_unit_price")
    public void setItem_unit_price(String item_unit_price){
        this.item_unit_price = item_unit_price;
    }

    @ElVoField(physicalName = "item_qty")
    public int getItem_qty(){
        return item_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public void setItem_qty(int item_qty){
        this.item_qty = item_qty;
    }

    @ElVoField(physicalName = "item_amt")
    public long getItem_amt(){
        return item_amt;
    }

    @ElVoField(physicalName = "item_amt")
    public void setItem_amt(long item_amt){
        this.item_amt = item_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public long getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(long totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public String getItem_unit_nm(){
        return item_unit_nm;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public void setItem_unit_nm(String item_unit_nm){
        this.item_unit_nm = item_unit_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSmlItemCheckupDVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("check_odr").append("=").append(check_odr).append(",");
        sb.append("item_clsf").append("=").append(item_clsf).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("item_unit").append("=").append(item_unit).append(",");
        sb.append("item_unit_price").append("=").append(item_unit_price).append(",");
        sb.append("item_qty").append("=").append(item_qty).append(",");
        sb.append("item_amt").append("=").append(item_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("item_unit_nm").append("=").append(item_unit_nm);
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
