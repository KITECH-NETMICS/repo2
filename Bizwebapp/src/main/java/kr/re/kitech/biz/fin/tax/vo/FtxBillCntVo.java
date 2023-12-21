package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출수정계산서카운트 Vo")
public class FtxBillCntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillCntVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "계산서종류(수정 U)", physicalName = "bill_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_knd;

    @ElDtoField(logicalName = "수정발행전체개수", physicalName = "updt_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int updt_cnt;

    @ElDtoField(logicalName = "최초세금계산서 개수", physicalName = "org_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int org_cnt;

    @ElDtoField(logicalName = "수정 발행개수", physicalName = "updt_new_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int updt_new_cnt;

    @ElDtoField(logicalName = "마이너스 발행 개수", physicalName = "updt_minus_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int updt_minus_cnt;

    @ElDtoField(logicalName = "수정의 수정 개수", physicalName = "updt_of_updt_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int updt_of_updt_cnt;

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "bill_knd")
    public String getBill_knd(){
        return bill_knd;
    }

    @ElVoField(physicalName = "bill_knd")
    public void setBill_knd(String bill_knd){
        this.bill_knd = bill_knd;
    }

    @ElVoField(physicalName = "updt_cnt")
    public int getUpdt_cnt(){
        return updt_cnt;
    }

    @ElVoField(physicalName = "updt_cnt")
    public void setUpdt_cnt(int updt_cnt){
        this.updt_cnt = updt_cnt;
    }

    @ElVoField(physicalName = "org_cnt")
    public int getOrg_cnt(){
        return org_cnt;
    }

    @ElVoField(physicalName = "org_cnt")
    public void setOrg_cnt(int org_cnt){
        this.org_cnt = org_cnt;
    }

    @ElVoField(physicalName = "updt_new_cnt")
    public int getUpdt_new_cnt(){
        return updt_new_cnt;
    }

    @ElVoField(physicalName = "updt_new_cnt")
    public void setUpdt_new_cnt(int updt_new_cnt){
        this.updt_new_cnt = updt_new_cnt;
    }

    @ElVoField(physicalName = "updt_minus_cnt")
    public int getUpdt_minus_cnt(){
        return updt_minus_cnt;
    }

    @ElVoField(physicalName = "updt_minus_cnt")
    public void setUpdt_minus_cnt(int updt_minus_cnt){
        this.updt_minus_cnt = updt_minus_cnt;
    }

    @ElVoField(physicalName = "updt_of_updt_cnt")
    public int getUpdt_of_updt_cnt(){
        return updt_of_updt_cnt;
    }

    @ElVoField(physicalName = "updt_of_updt_cnt")
    public void setUpdt_of_updt_cnt(int updt_of_updt_cnt){
        this.updt_of_updt_cnt = updt_of_updt_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillCntVo [");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("bill_knd").append("=").append(bill_knd).append(",");
        sb.append("updt_cnt").append("=").append(updt_cnt).append(",");
        sb.append("org_cnt").append("=").append(org_cnt).append(",");
        sb.append("updt_new_cnt").append("=").append(updt_new_cnt).append(",");
        sb.append("updt_minus_cnt").append("=").append(updt_minus_cnt).append(",");
        sb.append("updt_of_updt_cnt").append("=").append(updt_of_updt_cnt);
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
