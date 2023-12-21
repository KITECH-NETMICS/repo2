package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입계산서 목록 Vo")
public class KtxIssuMstrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrVo(){
    }

    @ElDtoField(logicalName = "사업자번호", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_nm;

    @ElDtoField(logicalName = "증빙코드", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "계산서 등록자성명", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "계산서 등록부서명", physicalName = "wrte_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_nm;

    @ElDtoField(logicalName = "등록자이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "상태코드", physicalName = "stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stat_code;

    @ElDtoField(logicalName = "이전계산서번호", physicalName = "bfo_issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfo_issu_id;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "계산서확인여부", physicalName = "tax_confirm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_confirm_yn;

    @ElDtoField(logicalName = "계정과세여부", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "결의서작성자성명", physicalName = "slip_wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_wrte_psn_nm;

    @ElDtoField(logicalName = "결의서작성부서", physicalName = "slip_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_dept_nm;

    @ElDtoField(logicalName = "증빙구분", physicalName = "evid_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd_nm;

    @ElDtoField(logicalName = "지급결의번호", physicalName = "pay_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_unslip_no;

    @ElDtoField(logicalName = "결의확정자", physicalName = "decsn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn;

    @ElDtoField(logicalName = "결의확정자성명(미확인계산서)", physicalName = "decsn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn_nm;

    @ElDtoField(logicalName = "공급자담당자명", physicalName = "selr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_nm;

    @ElDtoField(logicalName = "공급자담당자이메일", physicalName = "selr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_email;

    @ElDtoField(logicalName = "공급자 종사업자번호", physicalName = "selr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code;

    @ElDtoField(logicalName = "공급자 대표자명", physicalName = "selr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_ceo;

    @ElDtoField(logicalName = "공급받는자사업자번호", physicalName = "buyr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_no;

    @ElDtoField(logicalName = "공급받는자상호", physicalName = "buyr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_nm;

    @ElDtoField(logicalName = "공급받는자 담당자 부서", physicalName = "buyr_chrg_post1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post1;

    @ElDtoField(logicalName = "공급받는자 담당자명", physicalName = "buyr_chrg_nm1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm1;

    @ElDtoField(logicalName = "공급받는자 담당자 이메일", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "공급받는자 담당자 이메일2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email2;

    @ElDtoField(logicalName = "비고(미확인계산서)", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "품목", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "구분", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "대사결과", physicalName = "match_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String match_cd;

    @ElDtoField(logicalName = "세금계산서종류", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "구매일자", physicalName = "buy_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_date;

    @ElDtoField(logicalName = "영수청구구분", physicalName = "pops_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_code;

    @ElDtoField(logicalName = "영수청구구분명", physicalName = "pops_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_nm;

    @ElDtoField(logicalName = "계산서구분", physicalName = "invoice_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invoice_type;

    @ElDtoField(logicalName = "부서담당자", physicalName = "wrte_dept_res_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_res_nm;

    @ElDtoField(logicalName = "부서담당자 사번", physicalName = "wrte_dept_res_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_res_empno;

    @ElDtoField(logicalName = "부서담당자 이메일", physicalName = "wrte_dept_res_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_res_email;

    @ElDtoField(logicalName = "국세청승인일련번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "국세청전송일련번호", physicalName = "issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_id;

    @ElDtoField(logicalName = "작성일자", physicalName = "regs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regs_date;

    @ElDtoField(logicalName = "공급가액", physicalName = "chrg_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long chrg_amt;

    @ElDtoField(logicalName = "부가세액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "합계금액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "부가세신고확인", physicalName = "tax_returns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_returns_yn;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의금액", physicalName = "trans_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trans_amt;

    @ElDtoField(logicalName = "등록자", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "작성부서", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElDtoField(logicalName = "매입확인사용자", physicalName = "pur_con_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_con_user_id;

    @ElDtoField(logicalName = "매입확인조직", physicalName = "pur_con_org_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_con_org_code;

    @ElDtoField(logicalName = "순번(등록자변경이력)", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

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

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_dept_nm")
    public String getWrte_dept_nm(){
        return wrte_dept_nm;
    }

    @ElVoField(physicalName = "wrte_dept_nm")
    public void setWrte_dept_nm(String wrte_dept_nm){
        this.wrte_dept_nm = wrte_dept_nm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "stat_code")
    public String getStat_code(){
        return stat_code;
    }

    @ElVoField(physicalName = "stat_code")
    public void setStat_code(String stat_code){
        this.stat_code = stat_code;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public String getBfo_issu_id(){
        return bfo_issu_id;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public void setBfo_issu_id(String bfo_issu_id){
        this.bfo_issu_id = bfo_issu_id;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public String getTax_confirm_yn(){
        return tax_confirm_yn;
    }

    @ElVoField(physicalName = "tax_confirm_yn")
    public void setTax_confirm_yn(String tax_confirm_yn){
        this.tax_confirm_yn = tax_confirm_yn;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "slip_wrte_psn_nm")
    public String getSlip_wrte_psn_nm(){
        return slip_wrte_psn_nm;
    }

    @ElVoField(physicalName = "slip_wrte_psn_nm")
    public void setSlip_wrte_psn_nm(String slip_wrte_psn_nm){
        this.slip_wrte_psn_nm = slip_wrte_psn_nm;
    }

    @ElVoField(physicalName = "slip_dept_nm")
    public String getSlip_dept_nm(){
        return slip_dept_nm;
    }

    @ElVoField(physicalName = "slip_dept_nm")
    public void setSlip_dept_nm(String slip_dept_nm){
        this.slip_dept_nm = slip_dept_nm;
    }

    @ElVoField(physicalName = "evid_cd_nm")
    public String getEvid_cd_nm(){
        return evid_cd_nm;
    }

    @ElVoField(physicalName = "evid_cd_nm")
    public void setEvid_cd_nm(String evid_cd_nm){
        this.evid_cd_nm = evid_cd_nm;
    }

    @ElVoField(physicalName = "pay_unslip_no")
    public String getPay_unslip_no(){
        return pay_unslip_no;
    }

    @ElVoField(physicalName = "pay_unslip_no")
    public void setPay_unslip_no(String pay_unslip_no){
        this.pay_unslip_no = pay_unslip_no;
    }

    @ElVoField(physicalName = "decsn_psn")
    public String getDecsn_psn(){
        return decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn")
    public void setDecsn_psn(String decsn_psn){
        this.decsn_psn = decsn_psn;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public String getDecsn_psn_nm(){
        return decsn_psn_nm;
    }

    @ElVoField(physicalName = "decsn_psn_nm")
    public void setDecsn_psn_nm(String decsn_psn_nm){
        this.decsn_psn_nm = decsn_psn_nm;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public String getSelr_chrg_nm(){
        return selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public void setSelr_chrg_nm(String selr_chrg_nm){
        this.selr_chrg_nm = selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public String getSelr_chrg_email(){
        return selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public void setSelr_chrg_email(String selr_chrg_email){
        this.selr_chrg_email = selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_code")
    public String getSelr_code(){
        return selr_code;
    }

    @ElVoField(physicalName = "selr_code")
    public void setSelr_code(String selr_code){
        this.selr_code = selr_code;
    }

    @ElVoField(physicalName = "selr_ceo")
    public String getSelr_ceo(){
        return selr_ceo;
    }

    @ElVoField(physicalName = "selr_ceo")
    public void setSelr_ceo(String selr_ceo){
        this.selr_ceo = selr_ceo;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public String getBuyr_corp_no(){
        return buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public void setBuyr_corp_no(String buyr_corp_no){
        this.buyr_corp_no = buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public String getBuyr_corp_nm(){
        return buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public void setBuyr_corp_nm(String buyr_corp_nm){
        this.buyr_corp_nm = buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public String getBuyr_chrg_post1(){
        return buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public void setBuyr_chrg_post1(String buyr_chrg_post1){
        this.buyr_chrg_post1 = buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public String getBuyr_chrg_nm1(){
        return buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public void setBuyr_chrg_nm1(String buyr_chrg_nm1){
        this.buyr_chrg_nm1 = buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public String getBuyr_chrg_email2(){
        return buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public void setBuyr_chrg_email2(String buyr_chrg_email2){
        this.buyr_chrg_email2 = buyr_chrg_email2;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "bill_type")
    public String getBill_type(){
        return bill_type;
    }

    @ElVoField(physicalName = "bill_type")
    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }

    @ElVoField(physicalName = "match_cd")
    public String getMatch_cd(){
        return match_cd;
    }

    @ElVoField(physicalName = "match_cd")
    public void setMatch_cd(String match_cd){
        this.match_cd = match_cd;
    }

    @ElVoField(physicalName = "tax_type")
    public String getTax_type(){
        return tax_type;
    }

    @ElVoField(physicalName = "tax_type")
    public void setTax_type(String tax_type){
        this.tax_type = tax_type;
    }

    @ElVoField(physicalName = "buy_date")
    public String getBuy_date(){
        return buy_date;
    }

    @ElVoField(physicalName = "buy_date")
    public void setBuy_date(String buy_date){
        this.buy_date = buy_date;
    }

    @ElVoField(physicalName = "pops_code")
    public String getPops_code(){
        return pops_code;
    }

    @ElVoField(physicalName = "pops_code")
    public void setPops_code(String pops_code){
        this.pops_code = pops_code;
    }

    @ElVoField(physicalName = "pops_nm")
    public String getPops_nm(){
        return pops_nm;
    }

    @ElVoField(physicalName = "pops_nm")
    public void setPops_nm(String pops_nm){
        this.pops_nm = pops_nm;
    }

    @ElVoField(physicalName = "invoice_type")
    public String getInvoice_type(){
        return invoice_type;
    }

    @ElVoField(physicalName = "invoice_type")
    public void setInvoice_type(String invoice_type){
        this.invoice_type = invoice_type;
    }

    @ElVoField(physicalName = "wrte_dept_res_nm")
    public String getWrte_dept_res_nm(){
        return wrte_dept_res_nm;
    }

    @ElVoField(physicalName = "wrte_dept_res_nm")
    public void setWrte_dept_res_nm(String wrte_dept_res_nm){
        this.wrte_dept_res_nm = wrte_dept_res_nm;
    }

    @ElVoField(physicalName = "wrte_dept_res_empno")
    public String getWrte_dept_res_empno(){
        return wrte_dept_res_empno;
    }

    @ElVoField(physicalName = "wrte_dept_res_empno")
    public void setWrte_dept_res_empno(String wrte_dept_res_empno){
        this.wrte_dept_res_empno = wrte_dept_res_empno;
    }

    @ElVoField(physicalName = "wrte_dept_res_email")
    public String getWrte_dept_res_email(){
        return wrte_dept_res_email;
    }

    @ElVoField(physicalName = "wrte_dept_res_email")
    public void setWrte_dept_res_email(String wrte_dept_res_email){
        this.wrte_dept_res_email = wrte_dept_res_email;
    }

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "issu_id")
    public String getIssu_id(){
        return issu_id;
    }

    @ElVoField(physicalName = "issu_id")
    public void setIssu_id(String issu_id){
        this.issu_id = issu_id;
    }

    @ElVoField(physicalName = "regs_date")
    public String getRegs_date(){
        return regs_date;
    }

    @ElVoField(physicalName = "regs_date")
    public void setRegs_date(String regs_date){
        this.regs_date = regs_date;
    }

    @ElVoField(physicalName = "chrg_amt")
    public long getChrg_amt(){
        return chrg_amt;
    }

    @ElVoField(physicalName = "chrg_amt")
    public void setChrg_amt(long chrg_amt){
        this.chrg_amt = chrg_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public long getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(long totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public String getTax_returns_yn(){
        return tax_returns_yn;
    }

    @ElVoField(physicalName = "tax_returns_yn")
    public void setTax_returns_yn(String tax_returns_yn){
        this.tax_returns_yn = tax_returns_yn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "trans_amt")
    public long getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(long trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @ElVoField(physicalName = "pur_con_user_id")
    public String getPur_con_user_id(){
        return pur_con_user_id;
    }

    @ElVoField(physicalName = "pur_con_user_id")
    public void setPur_con_user_id(String pur_con_user_id){
        this.pur_con_user_id = pur_con_user_id;
    }

    @ElVoField(physicalName = "pur_con_org_code")
    public String getPur_con_org_code(){
        return pur_con_org_code;
    }

    @ElVoField(physicalName = "pur_con_org_code")
    public void setPur_con_org_code(String pur_con_org_code){
        this.pur_con_org_code = pur_con_org_code;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrVo [");
        sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
        sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("wrte_dept_nm").append("=").append(wrte_dept_nm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("stat_code").append("=").append(stat_code).append(",");
        sb.append("bfo_issu_id").append("=").append(bfo_issu_id).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("tax_confirm_yn").append("=").append(tax_confirm_yn).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("slip_wrte_psn_nm").append("=").append(slip_wrte_psn_nm).append(",");
        sb.append("slip_dept_nm").append("=").append(slip_dept_nm).append(",");
        sb.append("evid_cd_nm").append("=").append(evid_cd_nm).append(",");
        sb.append("pay_unslip_no").append("=").append(pay_unslip_no).append(",");
        sb.append("decsn_psn").append("=").append(decsn_psn).append(",");
        sb.append("decsn_psn_nm").append("=").append(decsn_psn_nm).append(",");
        sb.append("selr_chrg_nm").append("=").append(selr_chrg_nm).append(",");
        sb.append("selr_chrg_email").append("=").append(selr_chrg_email).append(",");
        sb.append("selr_code").append("=").append(selr_code).append(",");
        sb.append("selr_ceo").append("=").append(selr_ceo).append(",");
        sb.append("buyr_corp_no").append("=").append(buyr_corp_no).append(",");
        sb.append("buyr_corp_nm").append("=").append(buyr_corp_nm).append(",");
        sb.append("buyr_chrg_post1").append("=").append(buyr_chrg_post1).append(",");
        sb.append("buyr_chrg_nm1").append("=").append(buyr_chrg_nm1).append(",");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("match_cd").append("=").append(match_cd).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("buy_date").append("=").append(buy_date).append(",");
        sb.append("pops_code").append("=").append(pops_code).append(",");
        sb.append("pops_nm").append("=").append(pops_nm).append(",");
        sb.append("invoice_type").append("=").append(invoice_type).append(",");
        sb.append("wrte_dept_res_nm").append("=").append(wrte_dept_res_nm).append(",");
        sb.append("wrte_dept_res_empno").append("=").append(wrte_dept_res_empno).append(",");
        sb.append("wrte_dept_res_email").append("=").append(wrte_dept_res_email).append(",");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("issu_id").append("=").append(issu_id).append(",");
        sb.append("regs_date").append("=").append(regs_date).append(",");
        sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("tax_returns_yn").append("=").append(tax_returns_yn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("pur_con_user_id").append("=").append(pur_con_user_id).append(",");
        sb.append("pur_con_org_code").append("=").append(pur_con_org_code).append(",");
        sb.append("seq").append("=").append(seq);
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
