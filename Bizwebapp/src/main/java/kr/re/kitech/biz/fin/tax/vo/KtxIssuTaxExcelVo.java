package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부가세 대급금 엑셀 Vo")
public class KtxIssuTaxExcelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuTaxExcelVo(){
    }

    @ElDtoField(logicalName = "순번", physicalName = "rownum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rownum;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "확정번호순번", physicalName = "slip_no_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no_odr;

    @ElDtoField(logicalName = "거래처", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "적요", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "차변금액", physicalName = "dr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dr_amt;

    @ElDtoField(logicalName = "대변금액", physicalName = "cr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr_amt;

    @ElDtoField(logicalName = "잔액", physicalName = "jan_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jan_amt;

    @ElDtoField(logicalName = "잔액관리1", physicalName = "ramt_mngmt_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_1;

    @ElDtoField(logicalName = "잔액관리2", physicalName = "ramt_mngmt_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_2;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "등록자", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "종사업자번호", physicalName = "selr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code;

    @ElVoField(physicalName = "rownum")
    public String getRownum(){
        return rownum;
    }

    @ElVoField(physicalName = "rownum")
    public void setRownum(String rownum){
        this.rownum = rownum;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public String getSlip_no_odr(){
        return slip_no_odr;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public void setSlip_no_odr(String slip_no_odr){
        this.slip_no_odr = slip_no_odr;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "dr_amt")
    public String getDr_amt(){
        return dr_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public void setDr_amt(String dr_amt){
        this.dr_amt = dr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public String getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(String cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "jan_amt")
    public String getJan_amt(){
        return jan_amt;
    }

    @ElVoField(physicalName = "jan_amt")
    public void setJan_amt(String jan_amt){
        this.jan_amt = jan_amt;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public String getRamt_mngmt_1(){
        return ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public void setRamt_mngmt_1(String ramt_mngmt_1){
        this.ramt_mngmt_1 = ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public String getRamt_mngmt_2(){
        return ramt_mngmt_2;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public void setRamt_mngmt_2(String ramt_mngmt_2){
        this.ramt_mngmt_2 = ramt_mngmt_2;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "selr_code")
    public String getSelr_code(){
        return selr_code;
    }

    @ElVoField(physicalName = "selr_code")
    public void setSelr_code(String selr_code){
        this.selr_code = selr_code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuTaxExcelVo [");
        sb.append("rownum").append("=").append(rownum).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("slip_no_odr").append("=").append(slip_no_odr).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("dr_amt").append("=").append(dr_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("jan_amt").append("=").append(jan_amt).append(",");
        sb.append("ramt_mngmt_1").append("=").append(ramt_mngmt_1).append(",");
        sb.append("ramt_mngmt_2").append("=").append(ramt_mngmt_2).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("selr_code").append("=").append(selr_code);
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
