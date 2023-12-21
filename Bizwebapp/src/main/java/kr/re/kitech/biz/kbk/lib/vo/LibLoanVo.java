package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "대출연장신청 Vo")
public class LibLoanVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibLoanVo(){
    }

    @ElDtoField(logicalName = "loan_psn_syspayno", physicalName = "loan_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_syspayno;

    @ElDtoField(logicalName = "loan_ymd", physicalName = "loan_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ymd;

    @ElDtoField(logicalName = "resv_psn_syspayno", physicalName = "resv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_syspayno;

    @ElDtoField(logicalName = "resv_ymd", physicalName = "resv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_ymd;

    @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flag;

    @ElDtoField(logicalName = "loan_no", physicalName = "loan_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_no;

    @ElDtoField(logicalName = "loan_book_no", physicalName = "loan_book_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_book_no;

    @ElDtoField(logicalName = "book_nm", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "retrn_schdl_ymd", physicalName = "retrn_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_schdl_ymd;

    @ElDtoField(logicalName = "retrn_ymd", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;

    @ElDtoField(logicalName = "resv", physicalName = "resv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "centr_cd", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "엑셀Provider다운로드여부", physicalName = "isExcel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean isExcel;

    @ElVoField(physicalName = "loan_psn_syspayno")
    public String getLoan_psn_syspayno(){
        return loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public void setLoan_psn_syspayno(String loan_psn_syspayno){
        this.loan_psn_syspayno = loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_ymd")
    public String getLoan_ymd(){
        return loan_ymd;
    }

    @ElVoField(physicalName = "loan_ymd")
    public void setLoan_ymd(String loan_ymd){
        this.loan_ymd = loan_ymd;
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

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        return flag;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "loan_no")
    public String getLoan_no(){
        return loan_no;
    }

    @ElVoField(physicalName = "loan_no")
    public void setLoan_no(String loan_no){
        this.loan_no = loan_no;
    }

    @ElVoField(physicalName = "loan_book_no")
    public String getLoan_book_no(){
        return loan_book_no;
    }

    @ElVoField(physicalName = "loan_book_no")
    public void setLoan_book_no(String loan_book_no){
        this.loan_book_no = loan_book_no;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
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

    @ElVoField(physicalName = "resv")
    public String getResv(){
        return resv;
    }

    @ElVoField(physicalName = "resv")
    public void setResv(String resv){
        this.resv = resv;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "isExcel")
    public boolean isIsExcel(){
        return isExcel;
    }

    @ElVoField(physicalName = "isExcel")
    public void setIsExcel(boolean isExcel){
        this.isExcel = isExcel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibLoanVo [");
        sb.append("loan_psn_syspayno").append("=").append(loan_psn_syspayno).append(",");
        sb.append("loan_ymd").append("=").append(loan_ymd).append(",");
        sb.append("resv_psn_syspayno").append("=").append(resv_psn_syspayno).append(",");
        sb.append("resv_ymd").append("=").append(resv_ymd).append(",");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("loan_no").append("=").append(loan_no).append(",");
        sb.append("loan_book_no").append("=").append(loan_book_no).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("retrn_schdl_ymd").append("=").append(retrn_schdl_ymd).append(",");
        sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
        sb.append("resv").append("=").append(resv).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("isExcel").append("=").append(isExcel);
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
