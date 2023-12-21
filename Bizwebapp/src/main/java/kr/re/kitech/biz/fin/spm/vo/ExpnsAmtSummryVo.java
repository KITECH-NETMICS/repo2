package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드사용합계Vo")
public class ExpnsAmtSummryVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ExpnsAmtSummryVo(){
    }

    @ElDtoField(logicalName = "비용합계", physicalName = "tot_expns_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_expns_amt;

    @ElDtoField(logicalName = "입금합계", physicalName = "tot_depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_depst_amt;

    @ElDtoField(logicalName = "증빙금액합계", physicalName = "tot_evid_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_evid_amt;

    @ElDtoField(logicalName = "공제금액합계", physicalName = "tot_dedct_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_dedct_amt;

    @ElDtoField(logicalName = "송금합계", physicalName = "tot_send_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_send_amt;

    @ElDtoField(logicalName = "차변금액합", physicalName = "dr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dr_amt;

    @ElDtoField(logicalName = "대변금액합", physicalName = "cr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cr_amt;

    @ElDtoField(logicalName = "차액", physicalName = "check_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_amt;

    @ElVoField(physicalName = "tot_expns_amt")
    public long getTot_expns_amt(){
        return tot_expns_amt;
    }

    @ElVoField(physicalName = "tot_expns_amt")
    public void setTot_expns_amt(long tot_expns_amt){
        this.tot_expns_amt = tot_expns_amt;
    }

    @ElVoField(physicalName = "tot_depst_amt")
    public long getTot_depst_amt(){
        return tot_depst_amt;
    }

    @ElVoField(physicalName = "tot_depst_amt")
    public void setTot_depst_amt(long tot_depst_amt){
        this.tot_depst_amt = tot_depst_amt;
    }

    @ElVoField(physicalName = "tot_evid_amt")
    public long getTot_evid_amt(){
        return tot_evid_amt;
    }

    @ElVoField(physicalName = "tot_evid_amt")
    public void setTot_evid_amt(long tot_evid_amt){
        this.tot_evid_amt = tot_evid_amt;
    }

    @ElVoField(physicalName = "tot_dedct_amt")
    public long getTot_dedct_amt(){
        return tot_dedct_amt;
    }

    @ElVoField(physicalName = "tot_dedct_amt")
    public void setTot_dedct_amt(long tot_dedct_amt){
        this.tot_dedct_amt = tot_dedct_amt;
    }

    @ElVoField(physicalName = "tot_send_amt")
    public long getTot_send_amt(){
        return tot_send_amt;
    }

    @ElVoField(physicalName = "tot_send_amt")
    public void setTot_send_amt(long tot_send_amt){
        this.tot_send_amt = tot_send_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public long getDr_amt(){
        return dr_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public void setDr_amt(long dr_amt){
        this.dr_amt = dr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public long getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(long cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public long getCheck_amt(){
        return check_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public void setCheck_amt(long check_amt){
        this.check_amt = check_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpnsAmtSummryVo [");
        sb.append("tot_expns_amt").append("=").append(tot_expns_amt).append(",");
        sb.append("tot_depst_amt").append("=").append(tot_depst_amt).append(",");
        sb.append("tot_evid_amt").append("=").append(tot_evid_amt).append(",");
        sb.append("tot_dedct_amt").append("=").append(tot_dedct_amt).append(",");
        sb.append("tot_send_amt").append("=").append(tot_send_amt).append(",");
        sb.append("dr_amt").append("=").append(dr_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("check_amt").append("=").append(check_amt);
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
