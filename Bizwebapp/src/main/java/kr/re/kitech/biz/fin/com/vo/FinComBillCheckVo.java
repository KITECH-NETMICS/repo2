package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계산서 금액 체크")
public class FinComBillCheckVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinComBillCheckVo(){
    }

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "총액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "결의금액", physicalName = "trans_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trans_amt;

    @ElDtoField(logicalName = "총액체크", physicalName = "totl_amt_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totl_amt_chk;

    @ElDtoField(logicalName = "부가세신고여부", physicalName = "tax_returns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_returns_yn;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "totl_amt")
    public long getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(long totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public long getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(long trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "totl_amt_chk")
    public String getTotl_amt_chk(){
        return totl_amt_chk;
    }

    @ElVoField(physicalName = "totl_amt_chk")
    public void setTotl_amt_chk(String totl_amt_chk){
        this.totl_amt_chk = totl_amt_chk;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public String getTax_returns_yn(){
        return tax_returns_yn;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public void setTax_returns_yn(String tax_returns_yn){
        this.tax_returns_yn = tax_returns_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinComBillCheckVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("totl_amt_chk").append("=").append(totl_amt_chk).append(",");
        sb.append("tax_returns_yn").append("=").append(tax_returns_yn);
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
