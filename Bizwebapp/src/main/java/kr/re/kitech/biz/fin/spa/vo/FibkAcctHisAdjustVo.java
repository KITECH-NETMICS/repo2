package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FibkAcctHisAdjustExp")
public class FibkAcctHisAdjustVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FibkAcctHisAdjustVo(){
    }

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "acctTxday", physicalName = "acct_txday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday;

    @ElDtoField(logicalName = "acctTxdaySeq", physicalName = "acct_txday_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acct_txday_seq;

    @ElDtoField(logicalName = "bankaccntNo", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "bankCd", physicalName = "bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_cd;

    @ElDtoField(logicalName = "depstYmd", physicalName = "depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_ymd;

    @ElDtoField(logicalName = "depstLiq", physicalName = "depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_liq;

    @ElDtoField(logicalName = "depstUnslipNo", physicalName = "depst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_unslip_no;

    @ElDtoField(logicalName = "depstUnslipOdr", physicalName = "depst_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_unslip_odr;

    @ElDtoField(logicalName = "reqDept", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "reqDeptNewYmd", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

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

    @ElVoField(physicalName = "depst_ymd")
    public String getDepst_ymd(){
        return depst_ymd;
    }

    @ElVoField(physicalName = "depst_ymd")
    public void setDepst_ymd(String depst_ymd){
        this.depst_ymd = depst_ymd;
    }

    @ElVoField(physicalName = "depst_liq")
    public long getDepst_liq(){
        return depst_liq;
    }

    @ElVoField(physicalName = "depst_liq")
    public void setDepst_liq(long depst_liq){
        this.depst_liq = depst_liq;
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
    public int getDepst_unslip_odr(){
        return depst_unslip_odr;
    }

    @ElVoField(physicalName = "depst_unslip_odr")
    public void setDepst_unslip_odr(int depst_unslip_odr){
        this.depst_unslip_odr = depst_unslip_odr;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FibkAcctHisAdjustVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("acct_txday").append("=").append(acct_txday).append(",");
        sb.append("acct_txday_seq").append("=").append(acct_txday_seq).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("bank_cd").append("=").append(bank_cd).append(",");
        sb.append("depst_ymd").append("=").append(depst_ymd).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("depst_unslip_no").append("=").append(depst_unslip_no).append(",");
        sb.append("depst_unslip_odr").append("=").append(depst_unslip_odr).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd);
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
