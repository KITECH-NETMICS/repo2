package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구관리 계정정보 Vo")
public class ResPrjInfoVo extends kr.re.kitech.biz.fin.std.vo.ComResBgAcctmVo {
    private static final long serialVersionUID = 1L;

    public ResPrjInfoVo(){
    }

    @ElDtoField(logicalName = "계정구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "사업구분", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "총연구금액(현금)", physicalName = "tot_resch_cash_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_resch_cash_amt;

    @ElDtoField(logicalName = "총연구금액(현물)", physicalName = "tot_goods_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_goods_amt;

    @ElDtoField(logicalName = "부가세", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "입금연구비(부가세포함)", physicalName = "tot_resch_cash_tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_resch_cash_tax_amt;

    @ElDtoField(logicalName = "계정책임자직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "계정책임자소속", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "연구비구분", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "연구책임자", physicalName = "curr_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns;

    @ElDtoField(logicalName = "연구책임자성명", physicalName = "curr_resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns_nm;

    @ElDtoField(logicalName = "연구책임자직급", physicalName = "curr_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_posi_nm;

    @ElDtoField(logicalName = "연구책임자소속", physicalName = "curr_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_dept_nm;

    @ElDtoField(logicalName = "가상계좌", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "사업코드내외", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "과제참여유형", physicalName = "prj_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_kind;

    @ElDtoField(logicalName = "사업신청번호(연구비입금 메인키)", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "연구비입금구분", physicalName = "bankaccnt_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_type;

    @ElDtoField(logicalName = "업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "업체명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public String getBsns_cd_bsns_nm(){
        return bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public void setBsns_cd_bsns_nm(String bsns_cd_bsns_nm){
        this.bsns_cd_bsns_nm = bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "tot_resch_cash_amt")
    public long getTot_resch_cash_amt(){
        return tot_resch_cash_amt;
    }

    @ElVoField(physicalName = "tot_resch_cash_amt")
    public void setTot_resch_cash_amt(long tot_resch_cash_amt){
        this.tot_resch_cash_amt = tot_resch_cash_amt;
    }

    @ElVoField(physicalName = "tot_goods_amt")
    public long getTot_goods_amt(){
        return tot_goods_amt;
    }

    @ElVoField(physicalName = "tot_goods_amt")
    public void setTot_goods_amt(long tot_goods_amt){
        this.tot_goods_amt = tot_goods_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "tot_resch_cash_tax_amt")
    public long getTot_resch_cash_tax_amt(){
        return tot_resch_cash_tax_amt;
    }

    @ElVoField(physicalName = "tot_resch_cash_tax_amt")
    public void setTot_resch_cash_tax_amt(long tot_resch_cash_tax_amt){
        this.tot_resch_cash_tax_amt = tot_resch_cash_tax_amt;
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

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public String getCurr_resch_rspns(){
        return curr_resch_rspns;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public void setCurr_resch_rspns(String curr_resch_rspns){
        this.curr_resch_rspns = curr_resch_rspns;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public String getCurr_resch_rspns_nm(){
        return curr_resch_rspns_nm;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public void setCurr_resch_rspns_nm(String curr_resch_rspns_nm){
        this.curr_resch_rspns_nm = curr_resch_rspns_nm;
    }

    @ElVoField(physicalName = "curr_posi_nm")
    public String getCurr_posi_nm(){
        return curr_posi_nm;
    }

    @ElVoField(physicalName = "curr_posi_nm")
    public void setCurr_posi_nm(String curr_posi_nm){
        this.curr_posi_nm = curr_posi_nm;
    }

    @ElVoField(physicalName = "curr_dept_nm")
    public String getCurr_dept_nm(){
        return curr_dept_nm;
    }

    @ElVoField(physicalName = "curr_dept_nm")
    public void setCurr_dept_nm(String curr_dept_nm){
        this.curr_dept_nm = curr_dept_nm;
    }

    @ElVoField(physicalName = "vacct_no")
    public String getVacct_no(){
        return vacct_no;
    }

    @ElVoField(physicalName = "vacct_no")
    public void setVacct_no(String vacct_no){
        this.vacct_no = vacct_no;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "prj_kind")
    public String getPrj_kind(){
        return prj_kind;
    }

    @ElVoField(physicalName = "prj_kind")
    public void setPrj_kind(String prj_kind){
        this.prj_kind = prj_kind;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "bankaccnt_type")
    public String getBankaccnt_type(){
        return bankaccnt_type;
    }

    @ElVoField(physicalName = "bankaccnt_type")
    public void setBankaccnt_type(String bankaccnt_type){
        this.bankaccnt_type = bankaccnt_type;
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

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResPrjInfoVo [");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("tot_resch_cash_amt").append("=").append(tot_resch_cash_amt).append(",");
        sb.append("tot_goods_amt").append("=").append(tot_goods_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("tot_resch_cash_tax_amt").append("=").append(tot_resch_cash_tax_amt).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("curr_resch_rspns").append("=").append(curr_resch_rspns).append(",");
        sb.append("curr_resch_rspns_nm").append("=").append(curr_resch_rspns_nm).append(",");
        sb.append("curr_posi_nm").append("=").append(curr_posi_nm).append(",");
        sb.append("curr_dept_nm").append("=").append(curr_dept_nm).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("prj_kind").append("=").append(prj_kind).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("bankaccnt_type").append("=").append(bankaccnt_type).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn);
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
