package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부기술지원 계산서내역 Vo")
public class SptTecRcptBillVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecRcptBillVo(){
    }

    @ElDtoField(logicalName = "계산서발행일자", physicalName = "bill_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_issu_ymd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElVoField(physicalName = "bill_issu_ymd")
    public String getBill_issu_ymd(){
        return bill_issu_ymd;
    }

    @ElVoField(physicalName = "bill_issu_ymd")
    public void setBill_issu_ymd(String bill_issu_ymd){
        this.bill_issu_ymd = bill_issu_ymd;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRcptBillVo [");
        sb.append("bill_issu_ymd").append("=").append(bill_issu_ymd).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("req_amt").append("=").append(req_amt);
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
