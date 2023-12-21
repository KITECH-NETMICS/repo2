package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "입금내역 정보")
public class FibkAccntHisVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FibkAccntHisVo(){
    }

    @ElDtoField(logicalName = "입금일자", physicalName = "acct_txday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday;

    @ElDtoField(logicalName = "입금일자순번", physicalName = "acct_txday_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acct_txday_seq;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "은행", physicalName = "bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_cd;

    @ElDtoField(logicalName = "적요", physicalName = "remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remark;

    @ElDtoField(logicalName = "금액", physicalName = "tx_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tx_amt;

    @ElDtoField(logicalName = "처리금액(정산+반제)", physicalName = "rcmny_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long rcmny_req_amt;

    @ElDtoField(logicalName = "입금잔액", physicalName = "ramt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ramt;

    @ElDtoField(logicalName = "정산금액", physicalName = "won_adjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long won_adjst_amt;

    @ElDtoField(logicalName = "반제금액", physicalName = "unslip_repay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_repay_amt;

    @ElDtoField(logicalName = "처리잔액", physicalName = "slip_ramt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long slip_ramt;

    @ElDtoField(logicalName = "지점", physicalName = "branch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String branch;

    @ElDtoField(logicalName = "확정여부", physicalName = "tx_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tx_flag;

    @ElDtoField(logicalName = "가결의번호", physicalName = "depst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_unslip_no;

    @ElDtoField(logicalName = "가결의순번", physicalName = "depst_unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_unslip_odr;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정번호순번", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "가상계좌번호", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계좌번호", physicalName = "acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_no;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "입금금액", physicalName = "depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_liq;

    @ElDtoField(logicalName = "입금의뢰여부", physicalName = "depst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_yn;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElVoField(physicalName = "acct_txday")
    public String getAcct_txday(){
        return acct_txday;
    }

    @ElVoField(physicalName = "acct_txday")
    public void setAcct_txday(String acct_txday){
        this.acct_txday = acct_txday;
    }

    @ElVoField(physicalName = "acct_txday_seq")
    public int getAcct_txday_seq(){
        return acct_txday_seq;
    }

    @ElVoField(physicalName = "acct_txday_seq")
    public void setAcct_txday_seq(int acct_txday_seq){
        this.acct_txday_seq = acct_txday_seq;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "bank_cd")
    public String getBank_cd(){
        return bank_cd;
    }

    @ElVoField(physicalName = "bank_cd")
    public void setBank_cd(String bank_cd){
        this.bank_cd = bank_cd;
    }

    @ElVoField(physicalName = "remark")
    public String getRemark(){
        return remark;
    }

    @ElVoField(physicalName = "remark")
    public void setRemark(String remark){
        this.remark = remark;
    }

    @ElVoField(physicalName = "tx_amt")
    public long getTx_amt(){
        return tx_amt;
    }

    @ElVoField(physicalName = "tx_amt")
    public void setTx_amt(long tx_amt){
        this.tx_amt = tx_amt;
    }

    @ElVoField(physicalName = "rcmny_req_amt")
    public long getRcmny_req_amt(){
        return rcmny_req_amt;
    }

    @ElVoField(physicalName = "rcmny_req_amt")
    public void setRcmny_req_amt(long rcmny_req_amt){
        this.rcmny_req_amt = rcmny_req_amt;
    }

    @ElVoField(physicalName = "ramt")
    public long getRamt(){
        return ramt;
    }

    @ElVoField(physicalName = "ramt")
    public void setRamt(long ramt){
        this.ramt = ramt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public long getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(long won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public long getUnslip_repay_amt(){
        return unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public void setUnslip_repay_amt(long unslip_repay_amt){
        this.unslip_repay_amt = unslip_repay_amt;
    }

    @ElVoField(physicalName = "slip_ramt")
    public long getSlip_ramt(){
        return slip_ramt;
    }

    @ElVoField(physicalName = "slip_ramt")
    public void setSlip_ramt(long slip_ramt){
        this.slip_ramt = slip_ramt;
    }

    @ElVoField(physicalName = "branch")
    public String getBranch(){
        return branch;
    }

    @ElVoField(physicalName = "branch")
    public void setBranch(String branch){
        this.branch = branch;
    }

    @ElVoField(physicalName = "tx_flag")
    public String getTx_flag(){
        return tx_flag;
    }

    @ElVoField(physicalName = "tx_flag")
    public void setTx_flag(String tx_flag){
        this.tx_flag = tx_flag;
    }

    @ElVoField(physicalName = "depst_unslip_no")
    public String getDepst_unslip_no(){
        return depst_unslip_no;
    }

    @ElVoField(physicalName = "depst_unslip_no")
    public void setDepst_unslip_no(String depst_unslip_no){
        this.depst_unslip_no = depst_unslip_no;
    }

    @ElVoField(physicalName = "depst_unslip_odr")
    public String getDepst_unslip_odr(){
        return depst_unslip_odr;
    }

    @ElVoField(physicalName = "depst_unslip_odr")
    public void setDepst_unslip_odr(String depst_unslip_odr){
        this.depst_unslip_odr = depst_unslip_odr;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public String getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(String slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "vacct_no")
    public String getVacct_no(){
        return vacct_no;
    }

    @ElVoField(physicalName = "vacct_no")
    public void setVacct_no(String vacct_no){
        this.vacct_no = vacct_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "acct_no")
    public String getAcct_no(){
        return acct_no;
    }

    @ElVoField(physicalName = "acct_no")
    public void setAcct_no(String acct_no){
        this.acct_no = acct_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "depst_liq")
    public long getDepst_liq(){
        return depst_liq;
    }

    @ElVoField(physicalName = "depst_liq")
    public void setDepst_liq(long depst_liq){
        this.depst_liq = depst_liq;
    }

    @ElVoField(physicalName = "depst_yn")
    public String getDepst_yn(){
        return depst_yn;
    }

    @ElVoField(physicalName = "depst_yn")
    public void setDepst_yn(String depst_yn){
        this.depst_yn = depst_yn;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FibkAccntHisVo [");
        sb.append("acct_txday").append("=").append(acct_txday).append(",");
        sb.append("acct_txday_seq").append("=").append(acct_txday_seq).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("bank_cd").append("=").append(bank_cd).append(",");
        sb.append("remark").append("=").append(remark).append(",");
        sb.append("tx_amt").append("=").append(tx_amt).append(",");
        sb.append("rcmny_req_amt").append("=").append(rcmny_req_amt).append(",");
        sb.append("ramt").append("=").append(ramt).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("unslip_repay_amt").append("=").append(unslip_repay_amt).append(",");
        sb.append("slip_ramt").append("=").append(slip_ramt).append(",");
        sb.append("branch").append("=").append(branch).append(",");
        sb.append("tx_flag").append("=").append(tx_flag).append(",");
        sb.append("depst_unslip_no").append("=").append(depst_unslip_no).append(",");
        sb.append("depst_unslip_odr").append("=").append(depst_unslip_odr).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("acct_no").append("=").append(acct_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("depst_yn").append("=").append(depst_yn).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd);
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
