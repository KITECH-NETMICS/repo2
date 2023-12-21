package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "잔액생성 체크 Vo")
public class FspRamtCreatChkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspRamtCreatChkVo(){
    }

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정결의순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "입금의뢰금액", physicalName = "depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_liq;

    @ElDtoField(logicalName = "반제금액", physicalName = "unslip_repay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_repay_amt;

    @ElDtoField(logicalName = "잔액생성금액", physicalName = "won_occr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long won_occr_amt;

    @ElDtoField(logicalName = "잔액정산금액", physicalName = "won_adjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long won_adjst_amt;

    @ElDtoField(logicalName = "결과체크", physicalName = "rslt_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rslt_chk;

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public int getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(int slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "depst_liq")
    public long getDepst_liq(){
        return depst_liq;
    }

    @ElVoField(physicalName = "depst_liq")
    public void setDepst_liq(long depst_liq){
        this.depst_liq = depst_liq;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public long getUnslip_repay_amt(){
        return unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public void setUnslip_repay_amt(long unslip_repay_amt){
        this.unslip_repay_amt = unslip_repay_amt;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public long getWon_occr_amt(){
        return won_occr_amt;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public void setWon_occr_amt(long won_occr_amt){
        this.won_occr_amt = won_occr_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public long getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(long won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "rslt_chk")
    public String getRslt_chk(){
        return rslt_chk;
    }

    @ElVoField(physicalName = "rslt_chk")
    public void setRslt_chk(String rslt_chk){
        this.rslt_chk = rslt_chk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspRamtCreatChkVo [");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("unslip_repay_amt").append("=").append(unslip_repay_amt).append(",");
        sb.append("won_occr_amt").append("=").append(won_occr_amt).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("rslt_chk").append("=").append(rslt_chk);
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
