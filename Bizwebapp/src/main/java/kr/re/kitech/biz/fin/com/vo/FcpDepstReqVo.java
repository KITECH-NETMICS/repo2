package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "입금의뢰 Vo")
public class FcpDepstReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FcpDepstReqVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정번호명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "과세여부", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "계정시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "emp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_nm;

    @ElDtoField(logicalName = "계정책임자직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "계정책임자부서", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "입금일자", physicalName = "acct_txday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday;

    @ElDtoField(logicalName = "입금순번", physicalName = "acct_txday_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acct_txday_seq;

    @ElDtoField(logicalName = "입금예정순서", physicalName = "depst_schdl_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_schdl_seq;

    @ElDtoField(logicalName = "입금예정상세순서", physicalName = "depst_schdl_detls_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_schdl_detls_seq;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "은행코드", physicalName = "bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_cd;

    @ElDtoField(logicalName = "은행명", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "청구계산서번호", physicalName = "demnd_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_bill_no;

    @ElDtoField(logicalName = "영수계산서번호", physicalName = "recv_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_bill_no;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long suply_value;

    @ElDtoField(logicalName = "세액", physicalName = "taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long taxamt;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처이름", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "입금일자", physicalName = "depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_ymd;

    @ElDtoField(logicalName = "입금금액", physicalName = "depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_liq;

    @ElDtoField(logicalName = "이전입금금액", physicalName = "bf_depst_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bf_depst_liq;

    @ElDtoField(logicalName = "입금잔액", physicalName = "ramt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ramt;

    @ElDtoField(logicalName = "적요", physicalName = "remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remark;

    @ElDtoField(logicalName = "입금금액", physicalName = "tx_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tx_amt;

    @ElDtoField(logicalName = "기처리금액", physicalName = "rcmny_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long rcmny_req_amt;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청부서", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "신청부서신설일자", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "입금의뢰확정", physicalName = "depst_req_decsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_decsn;

    @ElDtoField(logicalName = "가수결의번호", physicalName = "depst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_unslip_no;

    @ElDtoField(logicalName = "가수결의순번", physicalName = "depst_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_unslip_odr;

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정결의순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "결재신청번호", physicalName = "apr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_req_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "청구의뢰번호", physicalName = "demnd_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_req_no;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "결의확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "입금관리번호(외부기술지원)", physicalName = "depst_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_mngmt_no;

    @ElDtoField(logicalName = "입금상태(기업부담금)", physicalName = "depst_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_state;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "emp_nm")
    public String getEmp_nm(){
        return emp_nm;
    }

    @ElVoField(physicalName = "emp_nm")
    public void setEmp_nm(String emp_nm){
        this.emp_nm = emp_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "depst_schdl_seq")
    public int getDepst_schdl_seq(){
        return depst_schdl_seq;
    }

    @ElVoField(physicalName = "depst_schdl_seq")
    public void setDepst_schdl_seq(int depst_schdl_seq){
        this.depst_schdl_seq = depst_schdl_seq;
    }

    @ElVoField(physicalName = "depst_schdl_detls_seq")
    public int getDepst_schdl_detls_seq(){
        return depst_schdl_detls_seq;
    }

    @ElVoField(physicalName = "depst_schdl_detls_seq")
    public void setDepst_schdl_detls_seq(int depst_schdl_detls_seq){
        this.depst_schdl_detls_seq = depst_schdl_detls_seq;
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

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public String getDemnd_bill_no(){
        return demnd_bill_no;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public void setDemnd_bill_no(String demnd_bill_no){
        this.demnd_bill_no = demnd_bill_no;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public String getRecv_bill_no(){
        return recv_bill_no;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public void setRecv_bill_no(String recv_bill_no){
        this.recv_bill_no = recv_bill_no;
    }

    @ElVoField(physicalName = "suply_value")
    public long getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(long suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "taxamt")
    public long getTaxamt(){
        return taxamt;
    }

    @ElVoField(physicalName = "taxamt")
    public void setTaxamt(long taxamt){
        this.taxamt = taxamt;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
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

    @ElVoField(physicalName = "bf_depst_liq")
    public long getBf_depst_liq(){
        return bf_depst_liq;
    }

    @ElVoField(physicalName = "bf_depst_liq")
    public void setBf_depst_liq(long bf_depst_liq){
        this.bf_depst_liq = bf_depst_liq;
    }

    @ElVoField(physicalName = "ramt")
    public long getRamt(){
        return ramt;
    }

    @ElVoField(physicalName = "ramt")
    public void setRamt(long ramt){
        this.ramt = ramt;
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
    public String getTx_amt(){
        return tx_amt;
    }

    @ElVoField(physicalName = "tx_amt")
    public void setTx_amt(String tx_amt){
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

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
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

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "depst_req_decsn")
    public String getDepst_req_decsn(){
        return depst_req_decsn;
    }

    @ElVoField(physicalName = "depst_req_decsn")
    public void setDepst_req_decsn(String depst_req_decsn){
        this.depst_req_decsn = depst_req_decsn;
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

    @ElVoField(physicalName = "apr_req_no")
    public String getApr_req_no(){
        return apr_req_no;
    }

    @ElVoField(physicalName = "apr_req_no")
    public void setApr_req_no(String apr_req_no){
        this.apr_req_no = apr_req_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public String getDemnd_req_no(){
        return demnd_req_no;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public void setDemnd_req_no(String demnd_req_no){
        this.demnd_req_no = demnd_req_no;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public String getDepst_mngmt_no(){
        return depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public void setDepst_mngmt_no(String depst_mngmt_no){
        this.depst_mngmt_no = depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_state")
    public String getDepst_state(){
        return depst_state;
    }

    @ElVoField(physicalName = "depst_state")
    public void setDepst_state(String depst_state){
        this.depst_state = depst_state;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FcpDepstReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("emp_nm").append("=").append(emp_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("acct_txday").append("=").append(acct_txday).append(",");
        sb.append("acct_txday_seq").append("=").append(acct_txday_seq).append(",");
        sb.append("depst_schdl_seq").append("=").append(depst_schdl_seq).append(",");
        sb.append("depst_schdl_detls_seq").append("=").append(depst_schdl_detls_seq).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("bank_cd").append("=").append(bank_cd).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("demnd_bill_no").append("=").append(demnd_bill_no).append(",");
        sb.append("recv_bill_no").append("=").append(recv_bill_no).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("taxamt").append("=").append(taxamt).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("depst_ymd").append("=").append(depst_ymd).append(",");
        sb.append("depst_liq").append("=").append(depst_liq).append(",");
        sb.append("bf_depst_liq").append("=").append(bf_depst_liq).append(",");
        sb.append("ramt").append("=").append(ramt).append(",");
        sb.append("remark").append("=").append(remark).append(",");
        sb.append("tx_amt").append("=").append(tx_amt).append(",");
        sb.append("rcmny_req_amt").append("=").append(rcmny_req_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("depst_req_decsn").append("=").append(depst_req_decsn).append(",");
        sb.append("depst_unslip_no").append("=").append(depst_unslip_no).append(",");
        sb.append("depst_unslip_odr").append("=").append(depst_unslip_odr).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("apr_req_no").append("=").append(apr_req_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("demnd_req_no").append("=").append(demnd_req_no).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("depst_mngmt_no").append("=").append(depst_mngmt_no).append(",");
        sb.append("depst_state").append("=").append(depst_state).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
