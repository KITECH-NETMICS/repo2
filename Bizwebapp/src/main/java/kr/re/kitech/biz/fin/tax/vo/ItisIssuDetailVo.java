package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입접수 전자세금계산서 품목 Vo")
public class ItisIssuDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ItisIssuDetailVo(){
    }

    @ElDtoField(logicalName = "발행일련번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "일련번호", physicalName = "seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq_no;

    @ElDtoField(logicalName = "거래일자", physicalName = "buy_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_date;

    @ElDtoField(logicalName = "물품코드", physicalName = "item_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_code;

    @ElDtoField(logicalName = "물품명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "규격", physicalName = "item_infm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_infm;

    @ElDtoField(logicalName = "비고", physicalName = "item_desp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_desp;

    @ElDtoField(logicalName = "수량", physicalName = "item_qunt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_qunt;

    @ElDtoField(logicalName = "단가", physicalName = "unit_prce", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_prce;

    @ElDtoField(logicalName = "공급가액", physicalName = "item_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long item_amt;

    @ElDtoField(logicalName = "부가세액", physicalName = "item_tax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long item_tax;

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "seq_no")
    public String getSeq_no(){
        return seq_no;
    }

    @ElVoField(physicalName = "seq_no")
    public void setSeq_no(String seq_no){
        this.seq_no = seq_no;
    }

    @ElVoField(physicalName = "buy_date")
    public String getBuy_date(){
        return buy_date;
    }

    @ElVoField(physicalName = "buy_date")
    public void setBuy_date(String buy_date){
        this.buy_date = buy_date;
    }

    @ElVoField(physicalName = "item_code")
    public String getItem_code(){
        return item_code;
    }

    @ElVoField(physicalName = "item_code")
    public void setItem_code(String item_code){
        this.item_code = item_code;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "item_infm")
    public String getItem_infm(){
        return item_infm;
    }

    @ElVoField(physicalName = "item_infm")
    public void setItem_infm(String item_infm){
        this.item_infm = item_infm;
    }

    @ElVoField(physicalName = "item_desp")
    public String getItem_desp(){
        return item_desp;
    }

    @ElVoField(physicalName = "item_desp")
    public void setItem_desp(String item_desp){
        this.item_desp = item_desp;
    }

    @ElVoField(physicalName = "item_qunt")
    public String getItem_qunt(){
        return item_qunt;
    }

    @ElVoField(physicalName = "item_qunt")
    public void setItem_qunt(String item_qunt){
        this.item_qunt = item_qunt;
    }

    @ElVoField(physicalName = "unit_prce")
    public String getUnit_prce(){
        return unit_prce;
    }

    @ElVoField(physicalName = "unit_prce")
    public void setUnit_prce(String unit_prce){
        this.unit_prce = unit_prce;
    }

    @ElVoField(physicalName = "item_amt")
    public long getItem_amt(){
        return item_amt;
    }

    @ElVoField(physicalName = "item_amt")
    public void setItem_amt(long item_amt){
        this.item_amt = item_amt;
    }

    @ElVoField(physicalName = "item_tax")
    public long getItem_tax(){
        return item_tax;
    }

    @ElVoField(physicalName = "item_tax")
    public void setItem_tax(long item_tax){
        this.item_tax = item_tax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItisIssuDetailVo [");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("seq_no").append("=").append(seq_no).append(",");
        sb.append("buy_date").append("=").append(buy_date).append(",");
        sb.append("item_code").append("=").append(item_code).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("item_infm").append("=").append(item_infm).append(",");
        sb.append("item_desp").append("=").append(item_desp).append(",");
        sb.append("item_qunt").append("=").append(item_qunt).append(",");
        sb.append("unit_prce").append("=").append(unit_prce).append(",");
        sb.append("item_amt").append("=").append(item_amt).append(",");
        sb.append("item_tax").append("=").append(item_tax);
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
