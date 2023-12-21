package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서구입신청서팝업VO")
public class LibBookPurRegVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibBookPurRegVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "요청일자", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "구입구분명", physicalName = "book_pur_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_pur_typ_nm;

    @ElDtoField(logicalName = "구입구분", physicalName = "book_pur_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_pur_typ;

    @ElDtoField(logicalName = "전체신청권수", physicalName = "req_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_qty;

    @ElDtoField(logicalName = "대출자명", physicalName = "loan_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_syspaynm;

    @ElDtoField(logicalName = "대출자사번", physicalName = "loan_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_empno;

    @ElDtoField(logicalName = "대출자시스템개인번호", physicalName = "loan_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loan_psn_syspayno;

    @ElDtoField(logicalName = "단가(현지화)", physicalName = "unit_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_amt;

    @ElDtoField(logicalName = "통화단위명", physicalName = "curncy_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit_nm;

    @ElDtoField(logicalName = "통화단위", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "전체합계", physicalName = "tot_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_expns;

    @ElDtoField(logicalName = "국제표준도서", physicalName = "isbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isbn;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정번호명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "계정만료일자", physicalName = "accnt_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_expir_ymd;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "예산통제방법", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_way;

    @ElDtoField(logicalName = "예산통제번호", physicalName = "bugt_ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_no;

    @ElDtoField(logicalName = "예산통제자시스템개인번호", physicalName = "bugt_ctrl_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_syspayno;

    @ElDtoField(logicalName = "정보출처링크", physicalName = "book_info_url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_info_url;

    @ElDtoField(logicalName = "주기사항", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "처리상태명", physicalName = "prcs_statenm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_statenm;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "접수일자", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "처리완료일자", physicalName = "prcs_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_complt_ymd;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspaynm;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "등록자명", physicalName = "regst_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspaynm;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "수정자명", physicalName = "updt_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspaynm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "book_pur_typ_nm")
    public String getBook_pur_typ_nm(){
        return book_pur_typ_nm;
    }

    @ElVoField(physicalName = "book_pur_typ_nm")
    public void setBook_pur_typ_nm(String book_pur_typ_nm){
        this.book_pur_typ_nm = book_pur_typ_nm;
    }

    @ElVoField(physicalName = "book_pur_typ")
    public String getBook_pur_typ(){
        return book_pur_typ;
    }

    @ElVoField(physicalName = "book_pur_typ")
    public void setBook_pur_typ(String book_pur_typ){
        this.book_pur_typ = book_pur_typ;
    }

    @ElVoField(physicalName = "req_qty")
    public String getReq_qty(){
        return req_qty;
    }

    @ElVoField(physicalName = "req_qty")
    public void setReq_qty(String req_qty){
        this.req_qty = req_qty;
    }

    @ElVoField(physicalName = "loan_psn_syspaynm")
    public String getLoan_psn_syspaynm(){
        return loan_psn_syspaynm;
    }

    @ElVoField(physicalName = "loan_psn_syspaynm")
    public void setLoan_psn_syspaynm(String loan_psn_syspaynm){
        this.loan_psn_syspaynm = loan_psn_syspaynm;
    }

    @ElVoField(physicalName = "loan_psn_empno")
    public String getLoan_psn_empno(){
        return loan_psn_empno;
    }

    @ElVoField(physicalName = "loan_psn_empno")
    public void setLoan_psn_empno(String loan_psn_empno){
        this.loan_psn_empno = loan_psn_empno;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public String getLoan_psn_syspayno(){
        return loan_psn_syspayno;
    }

    @ElVoField(physicalName = "loan_psn_syspayno")
    public void setLoan_psn_syspayno(String loan_psn_syspayno){
        this.loan_psn_syspayno = loan_psn_syspayno;
    }

    @ElVoField(physicalName = "unit_amt")
    public String getUnit_amt(){
        return unit_amt;
    }

    @ElVoField(physicalName = "unit_amt")
    public void setUnit_amt(String unit_amt){
        this.unit_amt = unit_amt;
    }

    @ElVoField(physicalName = "curncy_unit_nm")
    public String getCurncy_unit_nm(){
        return curncy_unit_nm;
    }

    @ElVoField(physicalName = "curncy_unit_nm")
    public void setCurncy_unit_nm(String curncy_unit_nm){
        this.curncy_unit_nm = curncy_unit_nm;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "tot_expns")
    public String getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(String tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "isbn")
    public String getIsbn(){
        return isbn;
    }

    @ElVoField(physicalName = "isbn")
    public void setIsbn(String isbn){
        this.isbn = isbn;
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

    @ElVoField(physicalName = "accnt_expir_ymd")
    public String getAccnt_expir_ymd(){
        return accnt_expir_ymd;
    }

    @ElVoField(physicalName = "accnt_expir_ymd")
    public void setAccnt_expir_ymd(String accnt_expir_ymd){
        this.accnt_expir_ymd = accnt_expir_ymd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        return bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_no")
    public String getBugt_ctrl_no(){
        return bugt_ctrl_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_no")
    public void setBugt_ctrl_no(String bugt_ctrl_no){
        this.bugt_ctrl_no = bugt_ctrl_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_syspayno")
    public String getBugt_ctrl_psn_syspayno(){
        return bugt_ctrl_psn_syspayno;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_syspayno")
    public void setBugt_ctrl_psn_syspayno(String bugt_ctrl_psn_syspayno){
        this.bugt_ctrl_psn_syspayno = bugt_ctrl_psn_syspayno;
    }

    @ElVoField(physicalName = "book_info_url")
    public String getBook_info_url(){
        return book_info_url;
    }

    @ElVoField(physicalName = "book_info_url")
    public void setBook_info_url(String book_info_url){
        this.book_info_url = book_info_url;
    }

    @ElVoField(physicalName = "cycle_item")
    public String getCycle_item(){
        return cycle_item;
    }

    @ElVoField(physicalName = "cycle_item")
    public void setCycle_item(String cycle_item){
        this.cycle_item = cycle_item;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "prcs_statenm")
    public String getPrcs_statenm(){
        return prcs_statenm;
    }

    @ElVoField(physicalName = "prcs_statenm")
    public void setPrcs_statenm(String prcs_statenm){
        this.prcs_statenm = prcs_statenm;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "prcs_complt_ymd")
    public String getPrcs_complt_ymd(){
        return prcs_complt_ymd;
    }

    @ElVoField(physicalName = "prcs_complt_ymd")
    public void setPrcs_complt_ymd(String prcs_complt_ymd){
        this.prcs_complt_ymd = prcs_complt_ymd;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public String getReq_psn_syspaynm(){
        return req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public void setReq_psn_syspaynm(String req_psn_syspaynm){
        this.req_psn_syspaynm = req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspaynm")
    public String getRegst_psn_syspaynm(){
        return regst_psn_syspaynm;
    }

    @ElVoField(physicalName = "regst_psn_syspaynm")
    public void setRegst_psn_syspaynm(String regst_psn_syspaynm){
        this.regst_psn_syspaynm = regst_psn_syspaynm;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspaynm")
    public String getUpdt_psn_syspaynm(){
        return updt_psn_syspaynm;
    }

    @ElVoField(physicalName = "updt_psn_syspaynm")
    public void setUpdt_psn_syspaynm(String updt_psn_syspaynm){
        this.updt_psn_syspaynm = updt_psn_syspaynm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibBookPurRegVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("book_pur_typ_nm").append("=").append(book_pur_typ_nm).append(",");
        sb.append("book_pur_typ").append("=").append(book_pur_typ).append(",");
        sb.append("req_qty").append("=").append(req_qty).append(",");
        sb.append("loan_psn_syspaynm").append("=").append(loan_psn_syspaynm).append(",");
        sb.append("loan_psn_empno").append("=").append(loan_psn_empno).append(",");
        sb.append("loan_psn_syspayno").append("=").append(loan_psn_syspayno).append(",");
        sb.append("unit_amt").append("=").append(unit_amt).append(",");
        sb.append("curncy_unit_nm").append("=").append(curncy_unit_nm).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("isbn").append("=").append(isbn).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_expir_ymd").append("=").append(accnt_expir_ymd).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
        sb.append("bugt_ctrl_no").append("=").append(bugt_ctrl_no).append(",");
        sb.append("bugt_ctrl_psn_syspayno").append("=").append(bugt_ctrl_psn_syspayno).append(",");
        sb.append("book_info_url").append("=").append(book_info_url).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("prcs_statenm").append("=").append(prcs_statenm).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("prcs_complt_ymd").append("=").append(prcs_complt_ymd).append(",");
        sb.append("req_psn_syspaynm").append("=").append(req_psn_syspaynm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("regst_psn_syspaynm").append("=").append(regst_psn_syspaynm).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspaynm").append("=").append(updt_psn_syspaynm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno);
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
