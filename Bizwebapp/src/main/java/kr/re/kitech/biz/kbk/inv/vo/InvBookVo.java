package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본 관리 Vo")
public class InvBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvBookVo(){
    }

    @ElDtoField(logicalName = "센터", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "도서번호", physicalName = "isbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isbn;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "등록일", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "출간일", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "저자코드", physicalName = "authcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String authcd;

    @ElDtoField(logicalName = "복본", physicalName = "copy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String copy;

    @ElDtoField(logicalName = "출판사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "대출여부", physicalName = "loan_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_yn_nm;

    @ElDtoField(logicalName = "대출자명", physicalName = "loan_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_nm;

    @ElDtoField(logicalName = "반납예정일", physicalName = "retrn_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_schdl_ymd;

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "isbn")
    public String getIsbn(){
        return isbn;
    }

    @ElVoField(physicalName = "isbn")
    public void setIsbn(String isbn){
        this.isbn = isbn;
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

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
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

    @ElVoField(physicalName = "copy")
    public String getCopy(){
        return copy;
    }

    @ElVoField(physicalName = "copy")
    public void setCopy(String copy){
        this.copy = copy;
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

    @ElVoField(physicalName = "retrn_schdl_ymd")
    public String getRetrn_schdl_ymd(){
        return retrn_schdl_ymd;
    }

    @ElVoField(physicalName = "retrn_schdl_ymd")
    public void setRetrn_schdl_ymd(String retrn_schdl_ymd){
        this.retrn_schdl_ymd = retrn_schdl_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvBookVo [");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("isbn").append("=").append(isbn).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("authcd").append("=").append(authcd).append(",");
        sb.append("copy").append("=").append(copy).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("loan_yn_nm").append("=").append(loan_yn_nm).append(",");
        sb.append("loan_psn_nm").append("=").append(loan_psn_nm).append(",");
        sb.append("retrn_schdl_ymd").append("=").append(retrn_schdl_ymd);
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
