package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입계산서 조회 Vo")
public class FinPurTaxSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinPurTaxSrcVo(){
    }

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "사업자번호", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_nm;

    @ElDtoField(logicalName = "처리구분", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "작성부서", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "결의서작성자", physicalName = "slip_wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_wrte_psn;

    @ElDtoField(logicalName = "결의서작성부서", physicalName = "slip_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_dept_nm;

    @ElDtoField(logicalName = "결의확정자", physicalName = "decsn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn;

    @ElDtoField(logicalName = "증빙코드", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "처리구분", physicalName = "tax_returns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_returns_yn;

    @ElDtoField(logicalName = "확정구분", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "사업자번호1", physicalName = "selr_corp_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no_1;

    @ElDtoField(logicalName = "조회구분(미확인계산서반송메일팝업)", physicalName = "inqr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inqr_clsf;

    @ElDtoField(logicalName = "계산서구분", physicalName = "invoice_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invoice_type;

    @ElDtoField(logicalName = "구분", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "계산서상태", physicalName = "stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stat_code;

    @ElDtoField(logicalName = "대사정보", physicalName = "match_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String match_cd;

    @ElDtoField(logicalName = "국세청전송일련번호", physicalName = "issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_id;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public String getSelr_corp_no(){
        return selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public void setSelr_corp_no(String selr_corp_no){
        this.selr_corp_no = selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public String getSelr_corp_nm(){
        return selr_corp_nm;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public void setSelr_corp_nm(String selr_corp_nm){
        this.selr_corp_nm = selr_corp_nm;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public String getPrcs_clsf(){
        return prcs_clsf;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public void setPrcs_clsf(String prcs_clsf){
        this.prcs_clsf = prcs_clsf;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "slip_wrte_psn")
    public String getSlip_wrte_psn(){
        return slip_wrte_psn;
    }

    @ElVoField(physicalName = "slip_wrte_psn")
    public void setSlip_wrte_psn(String slip_wrte_psn){
        this.slip_wrte_psn = slip_wrte_psn;
    }

    @ElVoField(physicalName = "slip_dept_nm")
    public String getSlip_dept_nm(){
        return slip_dept_nm;
    }

    @ElVoField(physicalName = "slip_dept_nm")
    public void setSlip_dept_nm(String slip_dept_nm){
        this.slip_dept_nm = slip_dept_nm;
    }

    @ElVoField(physicalName = "decsn_psn")
    public String getDecsn_psn(){
        return decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn")
    public void setDecsn_psn(String decsn_psn){
        this.decsn_psn = decsn_psn;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public String getTax_returns_yn(){
        return tax_returns_yn;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public void setTax_returns_yn(String tax_returns_yn){
        this.tax_returns_yn = tax_returns_yn;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "selr_corp_no_1")
    public String getSelr_corp_no_1(){
        return selr_corp_no_1;
    }

    @ElVoField(physicalName = "selr_corp_no_1")
    public void setSelr_corp_no_1(String selr_corp_no_1){
        this.selr_corp_no_1 = selr_corp_no_1;
    }

    @ElVoField(physicalName = "inqr_clsf")
    public String getInqr_clsf(){
        return inqr_clsf;
    }

    @ElVoField(physicalName = "inqr_clsf")
    public void setInqr_clsf(String inqr_clsf){
        this.inqr_clsf = inqr_clsf;
    }

    @ElVoField(physicalName = "invoice_type")
    public String getInvoice_type(){
        return invoice_type;
    }

    @ElVoField(physicalName = "invoice_type")
    public void setInvoice_type(String invoice_type){
        this.invoice_type = invoice_type;
    }

    @ElVoField(physicalName = "bill_type")
    public String getBill_type(){
        return bill_type;
    }

    @ElVoField(physicalName = "bill_type")
    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }

    @ElVoField(physicalName = "stat_code")
    public String getStat_code(){
        return stat_code;
    }

    @ElVoField(physicalName = "stat_code")
    public void setStat_code(String stat_code){
        this.stat_code = stat_code;
    }

    @ElVoField(physicalName = "match_cd")
    public String getMatch_cd(){
        return match_cd;
    }

    @ElVoField(physicalName = "match_cd")
    public void setMatch_cd(String match_cd){
        this.match_cd = match_cd;
    }

    @ElVoField(physicalName = "issu_id")
    public String getIssu_id(){
        return issu_id;
    }

    @ElVoField(physicalName = "issu_id")
    public void setIssu_id(String issu_id){
        this.issu_id = issu_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinPurTaxSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
        sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("slip_wrte_psn").append("=").append(slip_wrte_psn).append(",");
        sb.append("slip_dept_nm").append("=").append(slip_dept_nm).append(",");
        sb.append("decsn_psn").append("=").append(decsn_psn).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("tax_returns_yn").append("=").append(tax_returns_yn).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("selr_corp_no_1").append("=").append(selr_corp_no_1).append(",");
        sb.append("inqr_clsf").append("=").append(inqr_clsf).append(",");
        sb.append("invoice_type").append("=").append(invoice_type).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("stat_code").append("=").append(stat_code).append(",");
        sb.append("match_cd").append("=").append(match_cd).append(",");
        sb.append("issu_id").append("=").append(issu_id);
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
