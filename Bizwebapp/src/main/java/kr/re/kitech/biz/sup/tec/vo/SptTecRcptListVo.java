package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부기술지원(유상)엑셀내리기 Vo")
public class SptTecRcptListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecRcptListVo(){
    }

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "고객명(한글)", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "지역구분", physicalName = "region_centr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_centr;

    @ElDtoField(logicalName = "접수일자", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "지원팀", physicalName = "supt_team", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team;

    @ElDtoField(logicalName = "성적서구분", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_empno;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_nm;

    @ElDtoField(logicalName = "계정책임자부서명", physicalName = "accnt_respn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_dept_nm;

    @ElDtoField(logicalName = "지원 건수", physicalName = "treat_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int treat_qty;

    @ElDtoField(logicalName = "확정 금액", physicalName = "decsn_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_amt;

    @ElDtoField(logicalName = "확정공급가", physicalName = "decsn_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_suply_value;

    @ElDtoField(logicalName = "확정세액", physicalName = "decsn_tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_tax_amt;

    @ElDtoField(logicalName = "가결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "할인율", physicalName = "discnt_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String discnt_rt;

    @ElDtoField(logicalName = "시험료지원구분", physicalName = "supt_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_work_clsf;

    @ElDtoField(logicalName = "완료일자", physicalName = "complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_ymd;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "업체주소", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "의뢰자", physicalName = "cunsl_req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn;

    @ElDtoField(logicalName = "의뢰자연락처", physicalName = "cunsl_req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_tel;

    @ElDtoField(logicalName = "의뢰자이메일", physicalName = "cunsl_req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_email;

    @ElDtoField(logicalName = "품명", physicalName = "test_req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test_req_nm;

    @ElDtoField(logicalName = "(시험)항목", physicalName = "test", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test;

    @ElDtoField(logicalName = "지원책임자성명", physicalName = "supt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_nm;

    @ElDtoField(logicalName = "지원책임자개인번호", physicalName = "supt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_empno;

    @ElDtoField(logicalName = "지원책임자부서", physicalName = "supt_respn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_dept_nm;

    @ElDtoField(logicalName = "지원담당자개인번호", physicalName = "rcpt_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno;

    @ElDtoField(logicalName = "지원담당자성명", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "지원담당자부서명", physicalName = "rcpt_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_dept_nm;

    @ElDtoField(logicalName = "작성자개인번호", physicalName = "regst_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_empno;

    @ElDtoField(logicalName = "작성자성명", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "작성자부서명", physicalName = "regst_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_dept_nm;

    @ElDtoField(logicalName = "지원장비", physicalName = "equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_cd;

    @ElDtoField(logicalName = "장비명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "작업시작일자", physicalName = "equip_use_start_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_daytm;

    @ElDtoField(logicalName = "작업종료일자", physicalName = "equip_use_cls_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_daytm;

    @ElDtoField(logicalName = "사용시간", physicalName = "job_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_time;

    @ElDtoField(logicalName = "고객유형", physicalName = "cmpy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ;

    @ElDtoField(logicalName = "체크", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElDtoField(logicalName = "RPA수행여부", physicalName = "rpa_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_yn;

    @ElDtoField(logicalName = "RPA수행결과", physicalName = "rpa_result_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_result_yn;

    @ElDtoField(logicalName = "RPA종류", physicalName = "rpa_evid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_evid_clsf;

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "region_centr")
    public String getRegion_centr(){
        return region_centr;
    }

    @ElVoField(physicalName = "region_centr")
    public void setRegion_centr(String region_centr){
        this.region_centr = region_centr;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "supt_team")
    public String getSupt_team(){
        return supt_team;
    }

    @ElVoField(physicalName = "supt_team")
    public void setSupt_team(String supt_team){
        this.supt_team = supt_team;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public String getAccnt_respn_empno(){
        return accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public void setAccnt_respn_empno(String accnt_respn_empno){
        this.accnt_respn_empno = accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public String getAccnt_respn_nm(){
        return accnt_respn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public void setAccnt_respn_nm(String accnt_respn_nm){
        this.accnt_respn_nm = accnt_respn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_dept_nm")
    public String getAccnt_respn_dept_nm(){
        return accnt_respn_dept_nm;
    }

    @ElVoField(physicalName = "accnt_respn_dept_nm")
    public void setAccnt_respn_dept_nm(String accnt_respn_dept_nm){
        this.accnt_respn_dept_nm = accnt_respn_dept_nm;
    }

    @ElVoField(physicalName = "treat_qty")
    public int getTreat_qty(){
        return treat_qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public void setTreat_qty(int treat_qty){
        this.treat_qty = treat_qty;
    }

    @ElVoField(physicalName = "decsn_amt")
    public long getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(long decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public long getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(long decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public long getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(long decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "discnt_rt")
    public String getDiscnt_rt(){
        return discnt_rt;
    }

    @ElVoField(physicalName = "discnt_rt")
    public void setDiscnt_rt(String discnt_rt){
        this.discnt_rt = discnt_rt;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public String getSupt_work_clsf(){
        return supt_work_clsf;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public void setSupt_work_clsf(String supt_work_clsf){
        this.supt_work_clsf = supt_work_clsf;
    }

    @ElVoField(physicalName = "complt_ymd")
    public String getComplt_ymd(){
        return complt_ymd;
    }

    @ElVoField(physicalName = "complt_ymd")
    public void setComplt_ymd(String complt_ymd){
        this.complt_ymd = complt_ymd;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public String getCunsl_req_psn(){
        return cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public void setCunsl_req_psn(String cunsl_req_psn){
        this.cunsl_req_psn = cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public String getCunsl_req_psn_tel(){
        return cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public void setCunsl_req_psn_tel(String cunsl_req_psn_tel){
        this.cunsl_req_psn_tel = cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public String getCunsl_req_psn_email(){
        return cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public void setCunsl_req_psn_email(String cunsl_req_psn_email){
        this.cunsl_req_psn_email = cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "test_req_nm")
    public String getTest_req_nm(){
        return test_req_nm;
    }

    @ElVoField(physicalName = "test_req_nm")
    public void setTest_req_nm(String test_req_nm){
        this.test_req_nm = test_req_nm;
    }

    @ElVoField(physicalName = "test")
    public String getTest(){
        return test;
    }

    @ElVoField(physicalName = "test")
    public void setTest(String test){
        this.test = test;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public String getSupt_respn_nm(){
        return supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public void setSupt_respn_nm(String supt_respn_nm){
        this.supt_respn_nm = supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public String getSupt_respn_empno(){
        return supt_respn_empno;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public void setSupt_respn_empno(String supt_respn_empno){
        this.supt_respn_empno = supt_respn_empno;
    }

    @ElVoField(physicalName = "supt_respn_dept_nm")
    public String getSupt_respn_dept_nm(){
        return supt_respn_dept_nm;
    }

    @ElVoField(physicalName = "supt_respn_dept_nm")
    public void setSupt_respn_dept_nm(String supt_respn_dept_nm){
        this.supt_respn_dept_nm = supt_respn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public String getRcpt_psn_empno(){
        return rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public void setRcpt_psn_empno(String rcpt_psn_empno){
        this.rcpt_psn_empno = rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public String getRcpt_psn_dept_nm(){
        return rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public void setRcpt_psn_dept_nm(String rcpt_psn_dept_nm){
        this.rcpt_psn_dept_nm = rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "regst_empno")
    public String getRegst_empno(){
        return regst_empno;
    }

    @ElVoField(physicalName = "regst_empno")
    public void setRegst_empno(String regst_empno){
        this.regst_empno = regst_empno;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "regst_dept_nm")
    public String getRegst_dept_nm(){
        return regst_dept_nm;
    }

    @ElVoField(physicalName = "regst_dept_nm")
    public void setRegst_dept_nm(String regst_dept_nm){
        this.regst_dept_nm = regst_dept_nm;
    }

    @ElVoField(physicalName = "equip_cd")
    public String getEquip_cd(){
        return equip_cd;
    }

    @ElVoField(physicalName = "equip_cd")
    public void setEquip_cd(String equip_cd){
        this.equip_cd = equip_cd;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public String getEquip_use_start_daytm(){
        return equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public void setEquip_use_start_daytm(String equip_use_start_daytm){
        this.equip_use_start_daytm = equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public String getEquip_use_cls_daytm(){
        return equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public void setEquip_use_cls_daytm(String equip_use_cls_daytm){
        this.equip_use_cls_daytm = equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "job_time")
    public String getJob_time(){
        return job_time;
    }

    @ElVoField(physicalName = "job_time")
    public void setJob_time(String job_time){
        this.job_time = job_time;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public String getCmpy_typ(){
        return cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public void setCmpy_typ(String cmpy_typ){
        this.cmpy_typ = cmpy_typ;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @ElVoField(physicalName = "rpa_yn")
    public String getRpa_yn(){
        return rpa_yn;
    }

    @ElVoField(physicalName = "rpa_yn")
    public void setRpa_yn(String rpa_yn){
        this.rpa_yn = rpa_yn;
    }

    @ElVoField(physicalName = "rpa_result_yn")
    public String getRpa_result_yn(){
        return rpa_result_yn;
    }

    @ElVoField(physicalName = "rpa_result_yn")
    public void setRpa_result_yn(String rpa_result_yn){
        this.rpa_result_yn = rpa_result_yn;
    }

    @ElVoField(physicalName = "rpa_evid_clsf")
    public String getRpa_evid_clsf(){
        return rpa_evid_clsf;
    }

    @ElVoField(physicalName = "rpa_evid_clsf")
    public void setRpa_evid_clsf(String rpa_evid_clsf){
        this.rpa_evid_clsf = rpa_evid_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRcptListVo [");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("region_centr").append("=").append(region_centr).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("supt_team").append("=").append(supt_team).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_respn_empno").append("=").append(accnt_respn_empno).append(",");
        sb.append("accnt_respn_nm").append("=").append(accnt_respn_nm).append(",");
        sb.append("accnt_respn_dept_nm").append("=").append(accnt_respn_dept_nm).append(",");
        sb.append("treat_qty").append("=").append(treat_qty).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("discnt_rt").append("=").append(discnt_rt).append(",");
        sb.append("supt_work_clsf").append("=").append(supt_work_clsf).append(",");
        sb.append("complt_ymd").append("=").append(complt_ymd).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("cunsl_req_psn").append("=").append(cunsl_req_psn).append(",");
        sb.append("cunsl_req_psn_tel").append("=").append(cunsl_req_psn_tel).append(",");
        sb.append("cunsl_req_psn_email").append("=").append(cunsl_req_psn_email).append(",");
        sb.append("test_req_nm").append("=").append(test_req_nm).append(",");
        sb.append("test").append("=").append(test).append(",");
        sb.append("supt_respn_nm").append("=").append(supt_respn_nm).append(",");
        sb.append("supt_respn_empno").append("=").append(supt_respn_empno).append(",");
        sb.append("supt_respn_dept_nm").append("=").append(supt_respn_dept_nm).append(",");
        sb.append("rcpt_psn_empno").append("=").append(rcpt_psn_empno).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_psn_dept_nm").append("=").append(rcpt_psn_dept_nm).append(",");
        sb.append("regst_empno").append("=").append(regst_empno).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("regst_dept_nm").append("=").append(regst_dept_nm).append(",");
        sb.append("equip_cd").append("=").append(equip_cd).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("equip_use_start_daytm").append("=").append(equip_use_start_daytm).append(",");
        sb.append("equip_use_cls_daytm").append("=").append(equip_use_cls_daytm).append(",");
        sb.append("job_time").append("=").append(job_time).append(",");
        sb.append("cmpy_typ").append("=").append(cmpy_typ).append(",");
        sb.append("chk").append("=").append(chk).append(",");
        sb.append("rpa_yn").append("=").append(rpa_yn).append(",");
        sb.append("rpa_result_yn").append("=").append(rpa_result_yn).append(",");
        sb.append("rpa_evid_clsf").append("=").append(rpa_evid_clsf);
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
