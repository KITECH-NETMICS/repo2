package kr.re.kitech.biz.kbk.brw.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서대출VO")
public class KbkBookLoanVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkBookLoanVo(){
    }

    @ElDtoField(logicalName = "대출번호", physicalName = "loan_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_no;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "대출년도", physicalName = "loan_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_yr;

    @ElDtoField(logicalName = "대출도서번호", physicalName = "loan_book_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_book_no;

    @ElDtoField(logicalName = "대출도서명", physicalName = "loan_book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_book_nm;

    @ElDtoField(logicalName = "분류기호", physicalName = "clsfsgn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsfsgn;

    @ElDtoField(logicalName = "출판년도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "출판사", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "저자명", physicalName = "auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_nm;

    @ElDtoField(logicalName = "내외부구분", physicalName = "psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_clsf;

    @ElDtoField(logicalName = "대출자시스템개인번호", physicalName = "loan_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_syspayno;

    @ElDtoField(logicalName = "대출자시스템사원번호", physicalName = "loan_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_empno;

    @ElDtoField(logicalName = "대출자명", physicalName = "loan_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_nm;

    @ElDtoField(logicalName = "대출자이메일", physicalName = "loan_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_email;

    @ElDtoField(logicalName = "외부대출자조직", physicalName = "out_loan_psn_ogan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_loan_psn_ogan;

    @ElDtoField(logicalName = "외부대출자성명", physicalName = "out_loan_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_loan_psn_nm;

    @ElDtoField(logicalName = "외부대출자전화번호", physicalName = "out_loan_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_loan_psn_tel;

    @ElDtoField(logicalName = "외부대출자이메일", physicalName = "out_loan_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_loan_psn_email;

    @ElDtoField(logicalName = "대출일자", physicalName = "loan_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_ymd;

    @ElDtoField(logicalName = "대출시작일자", physicalName = "loan_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_fr_ymd;

    @ElDtoField(logicalName = "대출마감일자", physicalName = "loan_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_to_ymd;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "반납예정일자", physicalName = "retrn_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_schdl_ymd;

    @ElDtoField(logicalName = "반납일자", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;

    @ElDtoField(logicalName = "반납확인자시스템개인번호", physicalName = "retrn_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_psn_syspayno;

    @ElDtoField(logicalName = "연체여부", physicalName = "retrn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_yn;

    @ElDtoField(logicalName = "대출구분", physicalName = "loan_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_clsf;

    @ElDtoField(logicalName = "예약자시스템개인번호", physicalName = "resv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_syspayno;

    @ElDtoField(logicalName = "예약자명", physicalName = "resv_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_nm;

    @ElDtoField(logicalName = "예약자이메일", physicalName = "resv_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_psn_email;

    @ElDtoField(logicalName = "예약일자", physicalName = "resv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_ymd;

    @ElDtoField(logicalName = "예약번호", physicalName = "resv_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_no;

    @ElDtoField(logicalName = "예약여부", physicalName = "resv_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_yn;

    @ElDtoField(logicalName = "연장일자", physicalName = "renwl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String renwl_ymd;

    @ElDtoField(logicalName = "연장구분", physicalName = "renwl_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String renwl_clsf;

    @ElDtoField(logicalName = "주기사항", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "유효여부", physicalName = "valid_yn", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int valid_yn;

    @ElDtoField(logicalName = "엑셀Provider다운로드여부", physicalName = "isExcel", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean isExcel;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

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

    @ElVoField(physicalName = "loan_yr")
    public String getLoan_yr(){
        return loan_yr;
    }

    @ElVoField(physicalName = "loan_yr")
    public void setLoan_yr(String loan_yr){
        this.loan_yr = loan_yr;
    }

    @ElVoField(physicalName = "loan_book_no")
    public String getLoan_book_no(){
        return loan_book_no;
    }

    @ElVoField(physicalName = "loan_book_no")
    public void setLoan_book_no(String loan_book_no){
        this.loan_book_no = loan_book_no;
    }

    @ElVoField(physicalName = "loan_book_nm")
    public String getLoan_book_nm(){
        return loan_book_nm;
    }

    @ElVoField(physicalName = "loan_book_nm")
    public void setLoan_book_nm(String loan_book_nm){
        this.loan_book_nm = loan_book_nm;
    }

    @ElVoField(physicalName = "clsfsgn")
    public String getClsfsgn(){
        return clsfsgn;
    }

    @ElVoField(physicalName = "clsfsgn")
    public void setClsfsgn(String clsfsgn){
        this.clsfsgn = clsfsgn;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "auth_nm")
    public String getAuth_nm(){
        return auth_nm;
    }

    @ElVoField(physicalName = "auth_nm")
    public void setAuth_nm(String auth_nm){
        this.auth_nm = auth_nm;
    }

    @ElVoField(physicalName = "psn_clsf")
    public String getPsn_clsf(){
        return psn_clsf;
    }

    @ElVoField(physicalName = "psn_clsf")
    public void setPsn_clsf(String psn_clsf){
        this.psn_clsf = psn_clsf;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public String getLoan_psn_syspayno(){
        return loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public void setLoan_psn_syspayno(String loan_psn_syspayno){
        this.loan_psn_syspayno = loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_empno")
    public String getLoan_psn_empno(){
        return loan_psn_empno;
    }

    @ElVoField(physicalName = "loan_psn_empno")
    public void setLoan_psn_empno(String loan_psn_empno){
        this.loan_psn_empno = loan_psn_empno;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public String getLoan_psn_nm(){
        return loan_psn_nm;
    }

    @ElVoField(physicalName = "loan_psn_nm")
    public void setLoan_psn_nm(String loan_psn_nm){
        this.loan_psn_nm = loan_psn_nm;
    }

    @ElVoField(physicalName = "loan_psn_email")
    public String getLoan_psn_email(){
        return loan_psn_email;
    }

    @ElVoField(physicalName = "loan_psn_email")
    public void setLoan_psn_email(String loan_psn_email){
        this.loan_psn_email = loan_psn_email;
    }

    @ElVoField(physicalName = "out_loan_psn_ogan")
    public String getOut_loan_psn_ogan(){
        return out_loan_psn_ogan;
    }

    @ElVoField(physicalName = "out_loan_psn_ogan")
    public void setOut_loan_psn_ogan(String out_loan_psn_ogan){
        this.out_loan_psn_ogan = out_loan_psn_ogan;
    }

    @ElVoField(physicalName = "out_loan_psn_nm")
    public String getOut_loan_psn_nm(){
        return out_loan_psn_nm;
    }

    @ElVoField(physicalName = "out_loan_psn_nm")
    public void setOut_loan_psn_nm(String out_loan_psn_nm){
        this.out_loan_psn_nm = out_loan_psn_nm;
    }

    @ElVoField(physicalName = "out_loan_psn_tel")
    public String getOut_loan_psn_tel(){
        return out_loan_psn_tel;
    }

    @ElVoField(physicalName = "out_loan_psn_tel")
    public void setOut_loan_psn_tel(String out_loan_psn_tel){
        this.out_loan_psn_tel = out_loan_psn_tel;
    }

    @ElVoField(physicalName = "out_loan_psn_email")
    public String getOut_loan_psn_email(){
        return out_loan_psn_email;
    }

    @ElVoField(physicalName = "out_loan_psn_email")
    public void setOut_loan_psn_email(String out_loan_psn_email){
        this.out_loan_psn_email = out_loan_psn_email;
    }

    @ElVoField(physicalName = "loan_ymd")
    public String getLoan_ymd(){
        return loan_ymd;
    }

    @ElVoField(physicalName = "loan_ymd")
    public void setLoan_ymd(String loan_ymd){
        this.loan_ymd = loan_ymd;
    }

    @ElVoField(physicalName = "loan_fr_ymd")
    public String getLoan_fr_ymd(){
        return loan_fr_ymd;
    }

    @ElVoField(physicalName = "loan_fr_ymd")
    public void setLoan_fr_ymd(String loan_fr_ymd){
        this.loan_fr_ymd = loan_fr_ymd;
    }

    @ElVoField(physicalName = "loan_to_ymd")
    public String getLoan_to_ymd(){
        return loan_to_ymd;
    }

    @ElVoField(physicalName = "loan_to_ymd")
    public void setLoan_to_ymd(String loan_to_ymd){
        this.loan_to_ymd = loan_to_ymd;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
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

    @ElVoField(physicalName = "retrn_psn_syspayno")
    public String getRetrn_psn_syspayno(){
        return retrn_psn_syspayno;
    }

    @ElVoField(physicalName = "retrn_psn_syspayno")
    public void setRetrn_psn_syspayno(String retrn_psn_syspayno){
        this.retrn_psn_syspayno = retrn_psn_syspayno;
    }

    @ElVoField(physicalName = "retrn_yn")
    public String getRetrn_yn(){
        return retrn_yn;
    }

    @ElVoField(physicalName = "retrn_yn")
    public void setRetrn_yn(String retrn_yn){
        this.retrn_yn = retrn_yn;
    }

    @ElVoField(physicalName = "loan_clsf")
    public String getLoan_clsf(){
        return loan_clsf;
    }

    @ElVoField(physicalName = "loan_clsf")
    public void setLoan_clsf(String loan_clsf){
        this.loan_clsf = loan_clsf;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public String getResv_psn_syspayno(){
        return resv_psn_syspayno;
    }

    @ElVoField(physicalName = "resv_psn_syspayno")
    public void setResv_psn_syspayno(String resv_psn_syspayno){
        this.resv_psn_syspayno = resv_psn_syspayno;
    }

    @ElVoField(physicalName = "resv_psn_nm")
    public String getResv_psn_nm(){
        return resv_psn_nm;
    }

    @ElVoField(physicalName = "resv_psn_nm")
    public void setResv_psn_nm(String resv_psn_nm){
        this.resv_psn_nm = resv_psn_nm;
    }

    @ElVoField(physicalName = "resv_psn_email")
    public String getResv_psn_email(){
        return resv_psn_email;
    }

    @ElVoField(physicalName = "resv_psn_email")
    public void setResv_psn_email(String resv_psn_email){
        this.resv_psn_email = resv_psn_email;
    }

    @ElVoField(physicalName = "resv_ymd")
    public String getResv_ymd(){
        return resv_ymd;
    }

    @ElVoField(physicalName = "resv_ymd")
    public void setResv_ymd(String resv_ymd){
        this.resv_ymd = resv_ymd;
    }

    @ElVoField(physicalName = "resv_no")
    public String getResv_no(){
        return resv_no;
    }

    @ElVoField(physicalName = "resv_no")
    public void setResv_no(String resv_no){
        this.resv_no = resv_no;
    }

    @ElVoField(physicalName = "resv_yn")
    public String getResv_yn(){
        return resv_yn;
    }

    @ElVoField(physicalName = "resv_yn")
    public void setResv_yn(String resv_yn){
        this.resv_yn = resv_yn;
    }

    @ElVoField(physicalName = "renwl_ymd")
    public String getRenwl_ymd(){
        return renwl_ymd;
    }

    @ElVoField(physicalName = "renwl_ymd")
    public void setRenwl_ymd(String renwl_ymd){
        this.renwl_ymd = renwl_ymd;
    }

    @ElVoField(physicalName = "renwl_clsf")
    public String getRenwl_clsf(){
        return renwl_clsf;
    }

    @ElVoField(physicalName = "renwl_clsf")
    public void setRenwl_clsf(String renwl_clsf){
        this.renwl_clsf = renwl_clsf;
    }

    @ElVoField(physicalName = "cycle_item")
    public String getCycle_item(){
        return cycle_item;
    }

    @ElVoField(physicalName = "cycle_item")
    public void setCycle_item(String cycle_item){
        this.cycle_item = cycle_item;
    }

    @ElVoField(physicalName = "valid_yn")
    public int getValid_yn(){
        return valid_yn;
    }

    @ElVoField(physicalName = "valid_yn")
    public void setValid_yn(int valid_yn){
        this.valid_yn = valid_yn;
    }

    @ElVoField(physicalName = "isExcel")
    public boolean isIsExcel(){
        return isExcel;
    }

    @ElVoField(physicalName = "isExcel")
    public void setIsExcel(boolean isExcel){
        this.isExcel = isExcel;
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
        sb.append("KbkBookLoanVo [");
        sb.append("loan_no").append("=").append(loan_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("loan_yr").append("=").append(loan_yr).append(",");
        sb.append("loan_book_no").append("=").append(loan_book_no).append(",");
        sb.append("loan_book_nm").append("=").append(loan_book_nm).append(",");
        sb.append("clsfsgn").append("=").append(clsfsgn).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("auth_nm").append("=").append(auth_nm).append(",");
        sb.append("psn_clsf").append("=").append(psn_clsf).append(",");
        sb.append("loan_psn_syspayno").append("=").append(loan_psn_syspayno).append(",");
        sb.append("loan_psn_empno").append("=").append(loan_psn_empno).append(",");
        sb.append("loan_psn_nm").append("=").append(loan_psn_nm).append(",");
        sb.append("loan_psn_email").append("=").append(loan_psn_email).append(",");
        sb.append("out_loan_psn_ogan").append("=").append(out_loan_psn_ogan).append(",");
        sb.append("out_loan_psn_nm").append("=").append(out_loan_psn_nm).append(",");
        sb.append("out_loan_psn_tel").append("=").append(out_loan_psn_tel).append(",");
        sb.append("out_loan_psn_email").append("=").append(out_loan_psn_email).append(",");
        sb.append("loan_ymd").append("=").append(loan_ymd).append(",");
        sb.append("loan_fr_ymd").append("=").append(loan_fr_ymd).append(",");
        sb.append("loan_to_ymd").append("=").append(loan_to_ymd).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("retrn_schdl_ymd").append("=").append(retrn_schdl_ymd).append(",");
        sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
        sb.append("retrn_psn_syspayno").append("=").append(retrn_psn_syspayno).append(",");
        sb.append("retrn_yn").append("=").append(retrn_yn).append(",");
        sb.append("loan_clsf").append("=").append(loan_clsf).append(",");
        sb.append("resv_psn_syspayno").append("=").append(resv_psn_syspayno).append(",");
        sb.append("resv_psn_nm").append("=").append(resv_psn_nm).append(",");
        sb.append("resv_psn_email").append("=").append(resv_psn_email).append(",");
        sb.append("resv_ymd").append("=").append(resv_ymd).append(",");
        sb.append("resv_no").append("=").append(resv_no).append(",");
        sb.append("resv_yn").append("=").append(resv_yn).append(",");
        sb.append("renwl_ymd").append("=").append(renwl_ymd).append(",");
        sb.append("renwl_clsf").append("=").append(renwl_clsf).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("valid_yn").append("=").append(valid_yn).append(",");
        sb.append("isExcel").append("=").append(isExcel).append(",");
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
