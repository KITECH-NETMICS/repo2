package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "입금내역조회")
public class FibkAcctHisVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FibkAcctHisVo(){
    }

    @ElDtoField(logicalName = "입금일자", physicalName = "acct_txday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday;

    @ElDtoField(logicalName = "입금순번", physicalName = "acct_txday_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acct_txday_seq;

    @ElDtoField(logicalName = "계좌번호1", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "계좌번호2", physicalName = "acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_no;

    @ElDtoField(logicalName = "비고", physicalName = "remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remark;

    @ElDtoField(logicalName = "입금액", physicalName = "tx_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tx_amt;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_seq;

    @ElDtoField(logicalName = "가수확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "가수확정결의순번", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "가상계좌번호", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "처리금액", physicalName = "rcmny_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long rcmny_req_amt;

    @ElDtoField(logicalName = "정산잔액", physicalName = "adjst_ramt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_ramt;

    @ElDtoField(logicalName = "은행코드", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "은행명", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "가결의반제금액", physicalName = "unslip_repay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_repay_amt;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "입금의뢰금액", physicalName = "depst_liq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_liq;

    @ElDtoField(logicalName = "원화정산금액", physicalName = "won_adjst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String won_adjst_amt;

    @ElDtoField(logicalName = "미정산금액", physicalName = "bal_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bal_amt;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "입금구분명", physicalName = "depst_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf_nm;

    @ElDtoField(logicalName = "지점", physicalName = "branch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String branch;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "가수결의여부", physicalName = "depst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_yn;

    @ElDtoField(logicalName = "확정결의순번", physicalName = "slip_no_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no_odr;

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

    @ElVoField(physicalName = "acct_no")
    public String getAcct_no(){
        return acct_no;
    }

    @ElVoField(physicalName = "acct_no")
    public void setAcct_no(String acct_no){
        this.acct_no = acct_no;
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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_seq")
    public String getUnslip_seq(){
        return unslip_seq;
    }

    @ElVoField(physicalName = "unslip_seq")
    public void setUnslip_seq(String unslip_seq){
        this.unslip_seq = unslip_seq;
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

    @ElVoField(physicalName = "rcmny_req_amt")
    public long getRcmny_req_amt(){
        return rcmny_req_amt;
    }

    @ElVoField(physicalName = "rcmny_req_amt")
    public void setRcmny_req_amt(long rcmny_req_amt){
        this.rcmny_req_amt = rcmny_req_amt;
    }

    @ElVoField(physicalName = "adjst_ramt")
    public String getAdjst_ramt(){
        return adjst_ramt;
    }

    @ElVoField(physicalName = "adjst_ramt")
    public void setAdjst_ramt(String adjst_ramt){
        this.adjst_ramt = adjst_ramt;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public long getUnslip_repay_amt(){
        return unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public void setUnslip_repay_amt(long unslip_repay_amt){
        this.unslip_repay_amt = unslip_repay_amt;
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
    public String getDepst_liq(){
        return depst_liq;
    }

    @ElVoField(physicalName = "depst_liq")
    public void setDepst_liq(String depst_liq){
        this.depst_liq = depst_liq;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public String getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(String won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "bal_amt")
    public String getBal_amt(){
        return bal_amt;
    }

    @ElVoField(physicalName = "bal_amt")
    public void setBal_amt(String bal_amt){
        this.bal_amt = bal_amt;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public String getDepst_clsf_nm(){
        return depst_clsf_nm;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public void setDepst_clsf_nm(String depst_clsf_nm){
        this.depst_clsf_nm = depst_clsf_nm;
    }

    @ElVoField(physicalName = "branch")
    public String getBranch(){
        return branch;
    }

    @ElVoField(physicalName = "branch")
    public void setBranch(String branch){
        this.branch = branch;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "depst_yn")
    public String getDepst_yn(){
        return depst_yn;
    }

    @ElVoField(physicalName = "depst_yn")
    public void setDepst_yn(String depst_yn){
        this.depst_yn = depst_yn;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public String getSlip_no_odr(){
        return slip_no_odr;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public void setSlip_no_odr(String slip_no_odr){
        this.slip_no_odr = slip_no_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FibkAcctHisVo [");
        sb.append("acct_txday").append("=").append(acct_txday).append(",");
        sb.append("acct_txday_seq").append("=").append(acct_txday_seq).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("acct_no").append("=").append(acct_no).append(",");
        sb.append("remark").append("=").append(remark).append(",");
        sb.append("tx_amt").append("=").append(tx_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_seq").append("=").append(unslip_seq).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("rcmny_req_amt").append("=").append(rcmny_req_amt).append(",");
        sb.append("adjst_ramt").append("=").append(adjst_ramt).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("unslip_repay_amt").append("=").append(unslip_repay_amt).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("bal_amt").append("=").append(bal_amt).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("depst_clsf_nm").append("=").append(depst_clsf_nm).append(",");
        sb.append("branch").append("=").append(branch).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("depst_yn").append("=").append(depst_yn).append(",");
        sb.append("slip_no_odr").append("=").append(slip_no_odr);
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
