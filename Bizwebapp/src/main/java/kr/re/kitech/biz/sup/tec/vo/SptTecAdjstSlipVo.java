package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "미수수탁정산결의Vo")
public class SptTecAdjstSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecAdjstSlipVo(){
    }

    @ElDtoField(logicalName = "청구결의번호", physicalName = "chrg_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_unslip_no;

    @ElDtoField(logicalName = "청구결의순번", physicalName = "chrg_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int chrg_unslip_odr;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "depst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_no;

    @ElDtoField(logicalName = "정산결의번호", physicalName = "adjst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_unslip_no;

    @ElDtoField(logicalName = "발생결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "발생결의순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "정산결의확정유무", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "청구금액", physicalName = "decsn_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_amt;

    @ElDtoField(logicalName = "청구공급가액", physicalName = "decsn_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_suply_value;

    @ElDtoField(logicalName = "청구세액", physicalName = "decsn_tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_tax_amt;

    @ElDtoField(logicalName = "기정산금액", physicalName = "depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_amt;

    @ElDtoField(logicalName = "미정산금액", physicalName = "unadjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unadjst_amt;

    @ElDtoField(logicalName = "입금금액", physicalName = "depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_liq;

    @ElDtoField(logicalName = "입금일자", physicalName = "depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_ymd;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "지원담당자", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "지원담당자 부서", physicalName = "rcpt_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_dept_nm;

    @ElDtoField(logicalName = "지원담당자 본부", physicalName = "rcpt_psn_divsn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_divsn_nm;

    @ElDtoField(logicalName = "지원책임자", physicalName = "supt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_nm;

    @ElDtoField(logicalName = "지원책임자 부서", physicalName = "supt_respn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_dept_nm;

    @ElDtoField(logicalName = "지원책임자 본부", physicalName = "supt_respn_divsn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_divsn_nm;

    @ElDtoField(logicalName = "최종정산일자", physicalName = "wrte_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ymd;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElVoField(physicalName = "chrg_unslip_no")
    public String getChrg_unslip_no(){
        return chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_no")
    public void setChrg_unslip_no(String chrg_unslip_no){
        this.chrg_unslip_no = chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public int getChrg_unslip_odr(){
        return chrg_unslip_odr;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public void setChrg_unslip_odr(int chrg_unslip_odr){
        this.chrg_unslip_odr = chrg_unslip_odr;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "depst_req_no")
    public String getDepst_req_no(){
        return depst_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public void setDepst_req_no(String depst_req_no){
        this.depst_req_no = depst_req_no;
    }

    @ElVoField(physicalName = "adjst_unslip_no")
    public String getAdjst_unslip_no(){
        return adjst_unslip_no;
    }

    @ElVoField(physicalName = "adjst_unslip_no")
    public void setAdjst_unslip_no(String adjst_unslip_no){
        this.adjst_unslip_no = adjst_unslip_no;
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
    public int getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(int slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "decsn_amt")
    public long getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(long decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public long getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(long decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public long getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(long decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @ElVoField(physicalName = "depst_amt")
    public long getDepst_amt(){
        return depst_amt;
    }

    @ElVoField(physicalName = "depst_amt")
    public void setDepst_amt(long depst_amt){
        this.depst_amt = depst_amt;
    }

    @ElVoField(physicalName = "unadjst_amt")
    public long getUnadjst_amt(){
        return unadjst_amt;
    }

    @ElVoField(physicalName = "unadjst_amt")
    public void setUnadjst_amt(long unadjst_amt){
        this.unadjst_amt = unadjst_amt;
    }

    @ElVoField(physicalName = "depst_liq")
    public long getDepst_liq(){
        return depst_liq;
    }

    @ElVoField(physicalName = "depst_liq")
    public void setDepst_liq(long depst_liq){
        this.depst_liq = depst_liq;
    }

    @ElVoField(physicalName = "depst_ymd")
    public String getDepst_ymd(){
        return depst_ymd;
    }

    @ElVoField(physicalName = "depst_ymd")
    public void setDepst_ymd(String depst_ymd){
        this.depst_ymd = depst_ymd;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public String getRcpt_psn_dept_nm(){
        return rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public void setRcpt_psn_dept_nm(String rcpt_psn_dept_nm){
        this.rcpt_psn_dept_nm = rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_divsn_nm")
    public String getRcpt_psn_divsn_nm(){
        return rcpt_psn_divsn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_divsn_nm")
    public void setRcpt_psn_divsn_nm(String rcpt_psn_divsn_nm){
        this.rcpt_psn_divsn_nm = rcpt_psn_divsn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public String getSupt_respn_nm(){
        return supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public void setSupt_respn_nm(String supt_respn_nm){
        this.supt_respn_nm = supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_dept_nm")
    public String getSupt_respn_dept_nm(){
        return supt_respn_dept_nm;
    }

    @ElVoField(physicalName = "supt_respn_dept_nm")
    public void setSupt_respn_dept_nm(String supt_respn_dept_nm){
        this.supt_respn_dept_nm = supt_respn_dept_nm;
    }

    @ElVoField(physicalName = "supt_respn_divsn_nm")
    public String getSupt_respn_divsn_nm(){
        return supt_respn_divsn_nm;
    }

    @ElVoField(physicalName = "supt_respn_divsn_nm")
    public void setSupt_respn_divsn_nm(String supt_respn_divsn_nm){
        this.supt_respn_divsn_nm = supt_respn_divsn_nm;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public String getWrte_ymd(){
        return wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public void setWrte_ymd(String wrte_ymd){
        this.wrte_ymd = wrte_ymd;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecAdjstSlipVo [");
        sb.append("chrg_unslip_no").append("=").append(chrg_unslip_no).append(",");
        sb.append("chrg_unslip_odr").append("=").append(chrg_unslip_odr).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("depst_req_no").append("=").append(depst_req_no).append(",");
        sb.append("adjst_unslip_no").append("=").append(adjst_unslip_no).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt).append(",");
        sb.append("depst_amt").append("=").append(depst_amt).append(",");
        sb.append("unadjst_amt").append("=").append(unadjst_amt).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("depst_ymd").append("=").append(depst_ymd).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_psn_dept_nm").append("=").append(rcpt_psn_dept_nm).append(",");
        sb.append("rcpt_psn_divsn_nm").append("=").append(rcpt_psn_divsn_nm).append(",");
        sb.append("supt_respn_nm").append("=").append(supt_respn_nm).append(",");
        sb.append("supt_respn_dept_nm").append("=").append(supt_respn_dept_nm).append(",");
        sb.append("supt_respn_divsn_nm").append("=").append(supt_respn_divsn_nm).append(",");
        sb.append("wrte_ymd").append("=").append(wrte_ymd).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("apr_state").append("=").append(apr_state);
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
