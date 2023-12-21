package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 헤더 Vo")
public class FtxBillHVo extends kr.re.kitech.biz.fin.tax.vo.FtxBillComVo {
    private static final long serialVersionUID = 1L;

    public FtxBillHVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "계산서번호(구)", physicalName = "old_tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_tax_bill_no;

    @ElDtoField(logicalName = "국세청전송일련번호", physicalName = "issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_id;

    @ElDtoField(logicalName = "발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "입금예정순번", physicalName = "depst_schdl_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_schdl_seq;

    @ElDtoField(logicalName = "계산서구분", physicalName = "bill_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_clsf;

    @ElDtoField(logicalName = "결제방법", physicalName = "bill_clsf1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_clsf1;

    @ElDtoField(logicalName = "청구영수구분", physicalName = "demnd_recv_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf;

    @ElDtoField(logicalName = "계산서종류(U-수정)", physicalName = "bill_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_knd;

    @ElDtoField(logicalName = "처리구분", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "현금입금", physicalName = "cash_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_depst;

    @ElDtoField(logicalName = "수표입금", physicalName = "check_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_depst;

    @ElDtoField(logicalName = "어음입금", physicalName = "prmsnt_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long prmsnt_depst;

    @ElDtoField(logicalName = "외상매입", physicalName = "credit_pur", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long credit_pur;

    @ElDtoField(logicalName = "작성부서", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long suply_value;

    @ElDtoField(logicalName = "과세금액", physicalName = "taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long taxamt;

    @ElDtoField(logicalName = "합계금액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "업태", physicalName = "bizcatg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizcatg;

    @ElDtoField(logicalName = "업종", physicalName = "biztyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztyp;

    @ElDtoField(logicalName = "업체코드", physicalName = "sude_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sude_psn;

    @ElDtoField(logicalName = "담당자", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "전화번호", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "이메일주소", physicalName = "email_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_addr;

    @ElDtoField(logicalName = "역전자발행번호", physicalName = "decsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_no;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk1;

    @ElDtoField(logicalName = "비고2", physicalName = "rmk2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk2;

    @ElDtoField(logicalName = "비고3", physicalName = "rmk3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk3;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "issu_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_req_no;

    @ElDtoField(logicalName = "처리구분명", physicalName = "prcs_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf_nm;

    @ElDtoField(logicalName = "작성자개인번호", physicalName = "wrte_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_empno;

    @ElDtoField(logicalName = "작성자명", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "작성자연락처", physicalName = "wrte_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ext_no;

    @ElDtoField(logicalName = "작성자부서", physicalName = "wrte_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_nm;

    @ElDtoField(logicalName = "작성자이메일", physicalName = "wrte_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_email;

    @ElDtoField(logicalName = "수정자 성명", physicalName = "updt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_nm;

    @ElDtoField(logicalName = "전자발행여부", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;

    @ElDtoField(logicalName = "전자발행여부코드", physicalName = "state_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_code;

    @ElDtoField(logicalName = "발행구분", physicalName = "demnd_recv_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf_nm;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "대표자명", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "공급받는자구분코드", physicalName = "buyr_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_gb;

    @ElDtoField(logicalName = "계정과세", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "계산서확정여부", physicalName = "tax_confirm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_confirm_yn;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;

    @ElDtoField(logicalName = "종사업자번호", physicalName = "selr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code;

    @ElDtoField(logicalName = "수정사유", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "수정계산서번호", physicalName = "updt_issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_issu_seqno;

    @ElDtoField(logicalName = "이전계산서번호", physicalName = "bfo_issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfo_issu_seqno;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "업무구분(S:기업부담금)", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "역전자발행여부", physicalName = "recp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recp_yn;

    @ElDtoField(logicalName = "기술지원의뢰번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "출력회수(거래명세서포함)", physicalName = "prt_times", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_times;

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "old_tax_bill_no")
    public String getOld_tax_bill_no(){
        return old_tax_bill_no;
    }

    @ElVoField(physicalName = "old_tax_bill_no")
    public void setOld_tax_bill_no(String old_tax_bill_no){
        this.old_tax_bill_no = old_tax_bill_no;
    }

    @ElVoField(physicalName = "issu_id")
    public String getIssu_id(){
        return issu_id;
    }

    @ElVoField(physicalName = "issu_id")
    public void setIssu_id(String issu_id){
        this.issu_id = issu_id;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_seq")
    public int getDepst_schdl_seq(){
        return depst_schdl_seq;
    }

    @ElVoField(physicalName = "depst_schdl_seq")
    public void setDepst_schdl_seq(int depst_schdl_seq){
        this.depst_schdl_seq = depst_schdl_seq;
    }

    @ElVoField(physicalName = "bill_clsf")
    public String getBill_clsf(){
        return bill_clsf;
    }

    @ElVoField(physicalName = "bill_clsf")
    public void setBill_clsf(String bill_clsf){
        this.bill_clsf = bill_clsf;
    }

    @ElVoField(physicalName = "bill_clsf1")
    public String getBill_clsf1(){
        return bill_clsf1;
    }

    @ElVoField(physicalName = "bill_clsf1")
    public void setBill_clsf1(String bill_clsf1){
        this.bill_clsf1 = bill_clsf1;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public String getDemnd_recv_clsf(){
        return demnd_recv_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public void setDemnd_recv_clsf(String demnd_recv_clsf){
        this.demnd_recv_clsf = demnd_recv_clsf;
    }

    @ElVoField(physicalName = "bill_knd")
    public String getBill_knd(){
        return bill_knd;
    }

    @ElVoField(physicalName = "bill_knd")
    public void setBill_knd(String bill_knd){
        this.bill_knd = bill_knd;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public String getPrcs_clsf(){
        return prcs_clsf;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public void setPrcs_clsf(String prcs_clsf){
        this.prcs_clsf = prcs_clsf;
    }

    @ElVoField(physicalName = "cash_depst")
    public long getCash_depst(){
        return cash_depst;
    }

    @ElVoField(physicalName = "cash_depst")
    public void setCash_depst(long cash_depst){
        this.cash_depst = cash_depst;
    }

    @ElVoField(physicalName = "check_depst")
    public long getCheck_depst(){
        return check_depst;
    }

    @ElVoField(physicalName = "check_depst")
    public void setCheck_depst(long check_depst){
        this.check_depst = check_depst;
    }

    @ElVoField(physicalName = "prmsnt_depst")
    public long getPrmsnt_depst(){
        return prmsnt_depst;
    }

    @ElVoField(physicalName = "prmsnt_depst")
    public void setPrmsnt_depst(long prmsnt_depst){
        this.prmsnt_depst = prmsnt_depst;
    }

    @ElVoField(physicalName = "credit_pur")
    public long getCredit_pur(){
        return credit_pur;
    }

    @ElVoField(physicalName = "credit_pur")
    public void setCredit_pur(long credit_pur){
        this.credit_pur = credit_pur;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
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

    @ElVoField(physicalName = "totl_amt")
    public long getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(long totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "bizcatg")
    public String getBizcatg(){
        return bizcatg;
    }

    @ElVoField(physicalName = "bizcatg")
    public void setBizcatg(String bizcatg){
        this.bizcatg = bizcatg;
    }

    @ElVoField(physicalName = "biztyp")
    public String getBiztyp(){
        return biztyp;
    }

    @ElVoField(physicalName = "biztyp")
    public void setBiztyp(String biztyp){
        this.biztyp = biztyp;
    }

    @ElVoField(physicalName = "sude_psn")
    public String getSude_psn(){
        return sude_psn;
    }

    @ElVoField(physicalName = "sude_psn")
    public void setSude_psn(String sude_psn){
        this.sude_psn = sude_psn;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "email_addr")
    public String getEmail_addr(){
        return email_addr;
    }

    @ElVoField(physicalName = "email_addr")
    public void setEmail_addr(String email_addr){
        this.email_addr = email_addr;
    }

    @ElVoField(physicalName = "decsn_no")
    public String getDecsn_no(){
        return decsn_no;
    }

    @ElVoField(physicalName = "decsn_no")
    public void setDecsn_no(String decsn_no){
        this.decsn_no = decsn_no;
    }

    @ElVoField(physicalName = "rmk1")
    public String getRmk1(){
        return rmk1;
    }

    @ElVoField(physicalName = "rmk1")
    public void setRmk1(String rmk1){
        this.rmk1 = rmk1;
    }

    @ElVoField(physicalName = "rmk2")
    public String getRmk2(){
        return rmk2;
    }

    @ElVoField(physicalName = "rmk2")
    public void setRmk2(String rmk2){
        this.rmk2 = rmk2;
    }

    @ElVoField(physicalName = "rmk3")
    public String getRmk3(){
        return rmk3;
    }

    @ElVoField(physicalName = "rmk3")
    public void setRmk3(String rmk3){
        this.rmk3 = rmk3;
    }

    @ElVoField(physicalName = "issu_req_no")
    public String getIssu_req_no(){
        return issu_req_no;
    }

    @ElVoField(physicalName = "issu_req_no")
    public void setIssu_req_no(String issu_req_no){
        this.issu_req_no = issu_req_no;
    }

    @ElVoField(physicalName = "prcs_clsf_nm")
    public String getPrcs_clsf_nm(){
        return prcs_clsf_nm;
    }

    @ElVoField(physicalName = "prcs_clsf_nm")
    public void setPrcs_clsf_nm(String prcs_clsf_nm){
        this.prcs_clsf_nm = prcs_clsf_nm;
    }

    @ElVoField(physicalName = "wrte_psn_empno")
    public String getWrte_psn_empno(){
        return wrte_psn_empno;
    }

    @ElVoField(physicalName = "wrte_psn_empno")
    public void setWrte_psn_empno(String wrte_psn_empno){
        this.wrte_psn_empno = wrte_psn_empno;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_ext_no")
    public String getWrte_ext_no(){
        return wrte_ext_no;
    }

    @ElVoField(physicalName = "wrte_ext_no")
    public void setWrte_ext_no(String wrte_ext_no){
        this.wrte_ext_no = wrte_ext_no;
    }

    @ElVoField(physicalName = "wrte_dept_nm")
    public String getWrte_dept_nm(){
        return wrte_dept_nm;
    }

    @ElVoField(physicalName = "wrte_dept_nm")
    public void setWrte_dept_nm(String wrte_dept_nm){
        this.wrte_dept_nm = wrte_dept_nm;
    }

    @ElVoField(physicalName = "wrte_email")
    public String getWrte_email(){
        return wrte_email;
    }

    @ElVoField(physicalName = "wrte_email")
    public void setWrte_email(String wrte_email){
        this.wrte_email = wrte_email;
    }

    @ElVoField(physicalName = "updt_psn_nm")
    public String getUpdt_psn_nm(){
        return updt_psn_nm;
    }

    @ElVoField(physicalName = "updt_psn_nm")
    public void setUpdt_psn_nm(String updt_psn_nm){
        this.updt_psn_nm = updt_psn_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "state_code")
    public String getState_code(){
        return state_code;
    }

    @ElVoField(physicalName = "state_code")
    public void setState_code(String state_code){
        this.state_code = state_code;
    }

    @ElVoField(physicalName = "demnd_recv_clsf_nm")
    public String getDemnd_recv_clsf_nm(){
        return demnd_recv_clsf_nm;
    }

    @ElVoField(physicalName = "demnd_recv_clsf_nm")
    public void setDemnd_recv_clsf_nm(String demnd_recv_clsf_nm){
        this.demnd_recv_clsf_nm = demnd_recv_clsf_nm;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "buyr_gb")
    public String getBuyr_gb(){
        return buyr_gb;
    }

    @ElVoField(physicalName = "buyr_gb")
    public void setBuyr_gb(String buyr_gb){
        this.buyr_gb = buyr_gb;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public String getTax_confirm_yn(){
        return tax_confirm_yn;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public void setTax_confirm_yn(String tax_confirm_yn){
        this.tax_confirm_yn = tax_confirm_yn;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public String getDept_typ_nm(){
        return dept_typ_nm;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public void setDept_typ_nm(String dept_typ_nm){
        this.dept_typ_nm = dept_typ_nm;
    }

    @ElVoField(physicalName = "selr_code")
    public String getSelr_code(){
        return selr_code;
    }

    @ElVoField(physicalName = "selr_code")
    public void setSelr_code(String selr_code){
        this.selr_code = selr_code;
    }

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "updt_issu_seqno")
    public String getUpdt_issu_seqno(){
        return updt_issu_seqno;
    }

    @ElVoField(physicalName = "updt_issu_seqno")
    public void setUpdt_issu_seqno(String updt_issu_seqno){
        this.updt_issu_seqno = updt_issu_seqno;
    }

    @ElVoField(physicalName = "bfo_issu_seqno")
    public String getBfo_issu_seqno(){
        return bfo_issu_seqno;
    }

    @ElVoField(physicalName = "bfo_issu_seqno")
    public void setBfo_issu_seqno(String bfo_issu_seqno){
        this.bfo_issu_seqno = bfo_issu_seqno;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "recp_yn")
    public String getRecp_yn(){
        return recp_yn;
    }

    @ElVoField(physicalName = "recp_yn")
    public void setRecp_yn(String recp_yn){
        this.recp_yn = recp_yn;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "prt_times")
    public String getPrt_times(){
        return prt_times;
    }

    @ElVoField(physicalName = "prt_times")
    public void setPrt_times(String prt_times){
        this.prt_times = prt_times;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillHVo [");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("old_tax_bill_no").append("=").append(old_tax_bill_no).append(",");
        sb.append("issu_id").append("=").append(issu_id).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("depst_schdl_seq").append("=").append(depst_schdl_seq).append(",");
        sb.append("bill_clsf").append("=").append(bill_clsf).append(",");
        sb.append("bill_clsf1").append("=").append(bill_clsf1).append(",");
        sb.append("demnd_recv_clsf").append("=").append(demnd_recv_clsf).append(",");
        sb.append("bill_knd").append("=").append(bill_knd).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("cash_depst").append("=").append(cash_depst).append(",");
        sb.append("check_depst").append("=").append(check_depst).append(",");
        sb.append("prmsnt_depst").append("=").append(prmsnt_depst).append(",");
        sb.append("credit_pur").append("=").append(credit_pur).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("taxamt").append("=").append(taxamt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("bizcatg").append("=").append(bizcatg).append(",");
        sb.append("biztyp").append("=").append(biztyp).append(",");
        sb.append("sude_psn").append("=").append(sude_psn).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("email_addr").append("=").append(email_addr).append(",");
        sb.append("decsn_no").append("=").append(decsn_no).append(",");
        sb.append("rmk1").append("=").append(rmk1).append(",");
        sb.append("rmk2").append("=").append(rmk2).append(",");
        sb.append("rmk3").append("=").append(rmk3).append(",");
        sb.append("issu_req_no").append("=").append(issu_req_no).append(",");
        sb.append("prcs_clsf_nm").append("=").append(prcs_clsf_nm).append(",");
        sb.append("wrte_psn_empno").append("=").append(wrte_psn_empno).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("wrte_ext_no").append("=").append(wrte_ext_no).append(",");
        sb.append("wrte_dept_nm").append("=").append(wrte_dept_nm).append(",");
        sb.append("wrte_email").append("=").append(wrte_email).append(",");
        sb.append("updt_psn_nm").append("=").append(updt_psn_nm).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("state_code").append("=").append(state_code).append(",");
        sb.append("demnd_recv_clsf_nm").append("=").append(demnd_recv_clsf_nm).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("buyr_gb").append("=").append(buyr_gb).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("tax_confirm_yn").append("=").append(tax_confirm_yn).append(",");
        sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
        sb.append("selr_code").append("=").append(selr_code).append(",");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("updt_issu_seqno").append("=").append(updt_issu_seqno).append(",");
        sb.append("bfo_issu_seqno").append("=").append(bfo_issu_seqno).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("recp_yn").append("=").append(recp_yn).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("prt_times").append("=").append(prt_times);
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
