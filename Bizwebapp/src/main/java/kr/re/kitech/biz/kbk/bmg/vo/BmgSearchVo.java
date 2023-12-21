package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Bmg 업무 관련 검색 Vo")
public class BmgSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BmgSearchVo(){
    }

    @ElDtoField(logicalName = "등록일From", physicalName = "reg_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_from;

    @ElDtoField(logicalName = "등록일To", physicalName = "reg_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_to;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "출판사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "센터구분", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "대출여부", physicalName = "retrn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_yn;

    @ElDtoField(logicalName = "예약여부", physicalName = "resv_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_yn;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "보고서번호", physicalName = "rptp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_no;

    @ElDtoField(logicalName = "보고서명", physicalName = "rptp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_nm;

    @ElDtoField(logicalName = "보고서작성자사번", physicalName = "rptp_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_psn;

    @ElDtoField(logicalName = "검색구분", physicalName = "data_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_clsf;

    @ElDtoField(logicalName = "예약용 사번", physicalName = "resv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_syspayno;

    @ElDtoField(logicalName = "예약용 예약일자", physicalName = "resv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_ymd;

    @ElDtoField(logicalName = "예약용 대출번호", physicalName = "loan_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_no;

    @ElVoField(physicalName = "reg_from")
    public String getReg_from(){
        return reg_from;
    }

    @ElVoField(physicalName = "reg_from")
    public void setReg_from(String reg_from){
        this.reg_from = reg_from;
    }

    @ElVoField(physicalName = "reg_to")
    public String getReg_to(){
        return reg_to;
    }

    @ElVoField(physicalName = "reg_to")
    public void setReg_to(String reg_to){
        this.reg_to = reg_to;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "retrn_yn")
    public String getRetrn_yn(){
        return retrn_yn;
    }

    @ElVoField(physicalName = "retrn_yn")
    public void setRetrn_yn(String retrn_yn){
        this.retrn_yn = retrn_yn;
    }

    @ElVoField(physicalName = "resv_yn")
    public String getResv_yn(){
        return resv_yn;
    }

    @ElVoField(physicalName = "resv_yn")
    public void setResv_yn(String resv_yn){
        this.resv_yn = resv_yn;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "clsfsgn")
    public String getClsfsgn(){
        return clsfsgn;
    }

    @ElVoField(physicalName = "clsfsgn")
    public void setClsfsgn(String clsfsgn){
        this.clsfsgn = clsfsgn;
    }

    @ElVoField(physicalName = "rptp_no")
    public String getRptp_no(){
        return rptp_no;
    }

    @ElVoField(physicalName = "rptp_no")
    public void setRptp_no(String rptp_no){
        this.rptp_no = rptp_no;
    }

    @ElVoField(physicalName = "rptp_nm")
    public String getRptp_nm(){
        return rptp_nm;
    }

    @ElVoField(physicalName = "rptp_nm")
    public void setRptp_nm(String rptp_nm){
        this.rptp_nm = rptp_nm;
    }

    @ElVoField(physicalName = "rptp_psn")
    public String getRptp_psn(){
        return rptp_psn;
    }

    @ElVoField(physicalName = "rptp_psn")
    public void setRptp_psn(String rptp_psn){
        this.rptp_psn = rptp_psn;
    }

    @ElVoField(physicalName = "data_clsf")
    public String getData_clsf(){
        return data_clsf;
    }

    @ElVoField(physicalName = "data_clsf")
    public void setData_clsf(String data_clsf){
        this.data_clsf = data_clsf;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public String getResv_psn_syspayno(){
        return resv_psn_syspayno;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public void setResv_psn_syspayno(String resv_psn_syspayno){
        this.resv_psn_syspayno = resv_psn_syspayno;
    }

    @ElVoField(physicalName = "resv_ymd")
    public String getResv_ymd(){
        return resv_ymd;
    }

    @ElVoField(physicalName = "resv_ymd")
    public void setResv_ymd(String resv_ymd){
        this.resv_ymd = resv_ymd;
    }

    @ElVoField(physicalName = "loan_no")
    public String getLoan_no(){
        return loan_no;
    }

    @ElVoField(physicalName = "loan_no")
    public void setLoan_no(String loan_no){
        this.loan_no = loan_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BmgSearchVo [");
        sb.append("reg_from").append("=").append(reg_from).append(",");
        sb.append("reg_to").append("=").append(reg_to).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("retrn_yn").append("=").append(retrn_yn).append(",");
        sb.append("resv_yn").append("=").append(resv_yn).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("rptp_no").append("=").append(rptp_no).append(",");
        sb.append("rptp_nm").append("=").append(rptp_nm).append(",");
        sb.append("rptp_psn").append("=").append(rptp_psn).append(",");
        sb.append("data_clsf").append("=").append(data_clsf).append(",");
        sb.append("resv_psn_syspayno").append("=").append(resv_psn_syspayno).append(",");
        sb.append("resv_ymd").append("=").append(resv_ymd).append(",");
        sb.append("loan_no").append("=").append(loan_no);
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
