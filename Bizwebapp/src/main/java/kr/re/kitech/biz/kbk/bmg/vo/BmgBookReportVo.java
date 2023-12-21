package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Bmg 업무 관련 검색 Vo")
public class BmgBookReportVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BmgBookReportVo(){
    }

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "반납예정일", physicalName = "retrn_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_schdl_ymd;

    @ElDtoField(logicalName = "반납일", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;

    @ElDtoField(logicalName = "예약자사번", physicalName = "resv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_syspayno;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "대출번호", physicalName = "loan_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_no;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "저자기호", physicalName = "authcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String authcd;

    @ElDtoField(logicalName = "예약일", physicalName = "resv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_ymd;

    @ElDtoField(logicalName = "대출여부", physicalName = "loan_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_yn;

    @ElDtoField(logicalName = "예약여부", physicalName = "resv_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_yn;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "출반사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "대출여부", physicalName = "loan_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_yn_nm;

    @ElDtoField(logicalName = "대출자", physicalName = "loan_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_nm;

    @ElDtoField(logicalName = "예약여부", physicalName = "resv_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_yn_nm;

    @ElDtoField(logicalName = "등록일", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
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

    @ElVoField(physicalName = "retrn_schdl_ymd")
    public String getRetrn_schdl_ymd(){
        return retrn_schdl_ymd;
    }

    @ElVoField(physicalName = "retrn_schdl_ymd")
    public void setRetrn_schdl_ymd(String retrn_schdl_ymd){
        this.retrn_schdl_ymd = retrn_schdl_ymd;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public String getRetrn_ymd(){
        return retrn_ymd;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public void setRetrn_ymd(String retrn_ymd){
        this.retrn_ymd = retrn_ymd;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public String getResv_psn_syspayno(){
        return resv_psn_syspayno;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public void setResv_psn_syspayno(String resv_psn_syspayno){
        this.resv_psn_syspayno = resv_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "loan_no")
    public String getLoan_no(){
        return loan_no;
    }

    @ElVoField(physicalName = "loan_no")
    public void setLoan_no(String loan_no){
        this.loan_no = loan_no;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
    }

    @ElVoField(physicalName = "clsfsgn")
    public String getClsfsgn(){
        return clsfsgn;
    }

    @ElVoField(physicalName = "clsfsgn")
    public void setClsfsgn(String clsfsgn){
        this.clsfsgn = clsfsgn;
    }

    @ElVoField(physicalName = "authcd")
    public String getAuthcd(){
        return authcd;
    }

    @ElVoField(physicalName = "authcd")
    public void setAuthcd(String authcd){
        this.authcd = authcd;
    }

    @ElVoField(physicalName = "resv_ymd")
    public String getResv_ymd(){
        return resv_ymd;
    }

    @ElVoField(physicalName = "resv_ymd")
    public void setResv_ymd(String resv_ymd){
        this.resv_ymd = resv_ymd;
    }

    @ElVoField(physicalName = "loan_yn")
    public String getLoan_yn(){
        return loan_yn;
    }

    @ElVoField(physicalName = "loan_yn")
    public void setLoan_yn(String loan_yn){
        this.loan_yn = loan_yn;
    }

    @ElVoField(physicalName = "resv_yn")
    public String getResv_yn(){
        return resv_yn;
    }

    @ElVoField(physicalName = "resv_yn")
    public void setResv_yn(String resv_yn){
        this.resv_yn = resv_yn;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "loan_yn_nm")
    public String getLoan_yn_nm(){
        return loan_yn_nm;
    }

    @ElVoField(physicalName = "loan_yn_nm")
    public void setLoan_yn_nm(String loan_yn_nm){
        this.loan_yn_nm = loan_yn_nm;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public String getLoan_psn_nm(){
        return loan_psn_nm;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public void setLoan_psn_nm(String loan_psn_nm){
        this.loan_psn_nm = loan_psn_nm;
    }

    @ElVoField(physicalName = "resv_yn_nm")
    public String getResv_yn_nm(){
        return resv_yn_nm;
    }

    @ElVoField(physicalName = "resv_yn_nm")
    public void setResv_yn_nm(String resv_yn_nm){
        this.resv_yn_nm = resv_yn_nm;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BrsBookReportVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("retrn_schdl_ymd").append("=").append(retrn_schdl_ymd).append(",");
        sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
        sb.append("resv_psn_syspayno").append("=").append(resv_psn_syspayno).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("loan_no").append("=").append(loan_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("authcd").append("=").append(authcd).append(",");
        sb.append("resv_ymd").append("=").append(resv_ymd).append(",");
        sb.append("loan_yn").append("=").append(loan_yn).append(",");
        sb.append("resv_yn").append("=").append(resv_yn).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("loan_yn_nm").append("=").append(loan_yn_nm).append(",");
        sb.append("loan_psn_nm").append("=").append(loan_psn_nm).append(",");
        sb.append("resv_yn_nm").append("=").append(resv_yn_nm).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd);
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
