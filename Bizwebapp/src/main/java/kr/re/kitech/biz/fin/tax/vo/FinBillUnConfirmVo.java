package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계산서 미확인조회 Vo")
public class FinBillUnConfirmVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinBillUnConfirmVo(){
    }

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "확정자", physicalName = "decsn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn_nm;

    @ElDtoField(logicalName = "지출결의번호", physicalName = "pay_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_slip_no;

    @ElDtoField(logicalName = "계산서확인여부", physicalName = "tax_confirm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_confirm_yn;

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public String getDecsn_psn_nm(){
        return decsn_psn_nm;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public void setDecsn_psn_nm(String decsn_psn_nm){
        this.decsn_psn_nm = decsn_psn_nm;
    }

    @ElVoField(physicalName = "pay_slip_no")
    public String getPay_slip_no(){
        return pay_slip_no;
    }

    @ElVoField(physicalName = "pay_slip_no")
    public void setPay_slip_no(String pay_slip_no){
        this.pay_slip_no = pay_slip_no;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public String getTax_confirm_yn(){
        return tax_confirm_yn;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public void setTax_confirm_yn(String tax_confirm_yn){
        this.tax_confirm_yn = tax_confirm_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinBillUnConfirmVo [");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("decsn_psn_nm").append("=").append(decsn_psn_nm).append(",");
        sb.append("pay_slip_no").append("=").append(pay_slip_no).append(",");
        sb.append("tax_confirm_yn").append("=").append(tax_confirm_yn);
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
