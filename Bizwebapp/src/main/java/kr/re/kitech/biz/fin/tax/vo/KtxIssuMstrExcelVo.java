package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입계산서(관)엑셀다운로드 Vo")
public class KtxIssuMstrExcelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrExcelVo(){
    }

    @ElDtoField(logicalName = "국세청승인일련번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

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

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "사업자번호", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_nm;

    @ElDtoField(logicalName = "거래처대표자명", physicalName = "selr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_ceo;

    @ElDtoField(logicalName = "거래처주소", physicalName = "selr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_addr;

    @ElDtoField(logicalName = "거래처종사업장번호", physicalName = "selr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code;

    @ElDtoField(logicalName = "거래처업태", physicalName = "selr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_cons;

    @ElDtoField(logicalName = "거래처업종", physicalName = "selr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_type;

    @ElDtoField(logicalName = "거래처담당자", physicalName = "selr_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_post;

    @ElDtoField(logicalName = "거래처담당자명", physicalName = "selr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_nm;

    @ElDtoField(logicalName = "거래처담당자휴대폰", physicalName = "selr_chrg_mobl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_mobl;

    @ElDtoField(logicalName = "거래처담당자이메일", physicalName = "selr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_email;

    @ElDtoField(logicalName = "비고", physicalName = "note1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note1;

    @ElDtoField(logicalName = "증빙코드명", physicalName = "evid_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd_nm;

    @ElDtoField(logicalName = "등록자", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "등록부서명", physicalName = "wrte_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_nm;

    @ElDtoField(logicalName = "등록자이메일", physicalName = "wrte_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_email;

    @ElDtoField(logicalName = "등록자핸드폰", physicalName = "wrte_psn_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_mobile;

    @ElDtoField(logicalName = "등록자연락처", physicalName = "wrte_psn_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_ext_no;

    @ElDtoField(logicalName = "부서담당자", physicalName = "dept_res_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_res_nm;

    @ElDtoField(logicalName = "부서담당자이메일", physicalName = "dept_res_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_res_email;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "계정과세여부", physicalName = "tax_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd_nm;

    @ElDtoField(logicalName = "공급받는자이메일", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "결의확정자", physicalName = "decsn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn;

    @ElDtoField(logicalName = "결의확정자성명", physicalName = "decsn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_psn_nm;

    @ElDtoField(logicalName = "계산서종류", physicalName = "invoice_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invoice_type;

    @ElDtoField(logicalName = "구분코드", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "구분명", physicalName = "bill_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type_nm;

    @ElDtoField(logicalName = "계산서종류", physicalName = "tax_type_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type_1;

    @ElDtoField(logicalName = "세액종코드", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "세액종명", physicalName = "tax_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type_nm;

    @ElDtoField(logicalName = "수정사유", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "책번호(권)", physicalName = "selr_mgr_id1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_mgr_id1;

    @ElDtoField(logicalName = "책번호(호)", physicalName = "selr_mgr_id2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_mgr_id2;

    @ElDtoField(logicalName = "일련번호", physicalName = "selr_mgr_id3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_mgr_id3;

    @ElDtoField(logicalName = "본부명", physicalName = "dept_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_type_nm;

    @ElDtoField(logicalName = "현금", physicalName = "cash_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_amt;

    @ElDtoField(logicalName = "수표", physicalName = "check_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_amt;

    @ElDtoField(logicalName = "어음", physicalName = "prmsnt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long prmsnt_amt;

    @ElDtoField(logicalName = "외상미수금", physicalName = "credit_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long credit_amt;

    @ElDtoField(logicalName = "영수/청구", physicalName = "pops_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_code;

    @ElDtoField(logicalName = "월일", physicalName = "buy_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_date;

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
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

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
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

    @ElVoField(physicalName = "selr_ceo")
    public String getSelr_ceo(){
        return selr_ceo;
    }

    @ElVoField(physicalName = "selr_ceo")
    public void setSelr_ceo(String selr_ceo){
        this.selr_ceo = selr_ceo;
    }

    @ElVoField(physicalName = "selr_addr")
    public String getSelr_addr(){
        return selr_addr;
    }

    @ElVoField(physicalName = "selr_addr")
    public void setSelr_addr(String selr_addr){
        this.selr_addr = selr_addr;
    }

    @ElVoField(physicalName = "selr_code")
    public String getSelr_code(){
        return selr_code;
    }

    @ElVoField(physicalName = "selr_code")
    public void setSelr_code(String selr_code){
        this.selr_code = selr_code;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public String getSelr_buss_cons(){
        return selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public void setSelr_buss_cons(String selr_buss_cons){
        this.selr_buss_cons = selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public String getSelr_buss_type(){
        return selr_buss_type;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public void setSelr_buss_type(String selr_buss_type){
        this.selr_buss_type = selr_buss_type;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public String getSelr_chrg_post(){
        return selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public void setSelr_chrg_post(String selr_chrg_post){
        this.selr_chrg_post = selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public String getSelr_chrg_nm(){
        return selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public void setSelr_chrg_nm(String selr_chrg_nm){
        this.selr_chrg_nm = selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_mobl")
    public String getSelr_chrg_mobl(){
        return selr_chrg_mobl;
    }

    @ElVoField(physicalName = "selr_chrg_mobl")
    public void setSelr_chrg_mobl(String selr_chrg_mobl){
        this.selr_chrg_mobl = selr_chrg_mobl;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public String getSelr_chrg_email(){
        return selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public void setSelr_chrg_email(String selr_chrg_email){
        this.selr_chrg_email = selr_chrg_email;
    }

    @ElVoField(physicalName = "note1")
    public String getNote1(){
        return note1;
    }

    @ElVoField(physicalName = "note1")
    public void setNote1(String note1){
        this.note1 = note1;
    }

    @ElVoField(physicalName = "evid_cd_nm")
    public String getEvid_cd_nm(){
        return evid_cd_nm;
    }

    @ElVoField(physicalName = "evid_cd_nm")
    public void setEvid_cd_nm(String evid_cd_nm){
        this.evid_cd_nm = evid_cd_nm;
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

    @ElVoField(physicalName = "wrte_psn_email")
    public String getWrte_psn_email(){
        return wrte_psn_email;
    }

    @ElVoField(physicalName = "wrte_psn_email")
    public void setWrte_psn_email(String wrte_psn_email){
        this.wrte_psn_email = wrte_psn_email;
    }

    @ElVoField(physicalName = "wrte_psn_mobile")
    public String getWrte_psn_mobile(){
        return wrte_psn_mobile;
    }

    @ElVoField(physicalName = "wrte_psn_mobile")
    public void setWrte_psn_mobile(String wrte_psn_mobile){
        this.wrte_psn_mobile = wrte_psn_mobile;
    }

    @ElVoField(physicalName = "wrte_psn_ext_no")
    public String getWrte_psn_ext_no(){
        return wrte_psn_ext_no;
    }

    @ElVoField(physicalName = "wrte_psn_ext_no")
    public void setWrte_psn_ext_no(String wrte_psn_ext_no){
        this.wrte_psn_ext_no = wrte_psn_ext_no;
    }

    @ElVoField(physicalName = "dept_res_nm")
    public String getDept_res_nm(){
        return dept_res_nm;
    }

    @ElVoField(physicalName = "dept_res_nm")
    public void setDept_res_nm(String dept_res_nm){
        this.dept_res_nm = dept_res_nm;
    }

    @ElVoField(physicalName = "dept_res_email")
    public String getDept_res_email(){
        return dept_res_email;
    }

    @ElVoField(physicalName = "dept_res_email")
    public void setDept_res_email(String dept_res_email){
        this.dept_res_email = dept_res_email;
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

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public String getTax_cd_nm(){
        return tax_cd_nm;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public void setTax_cd_nm(String tax_cd_nm){
        this.tax_cd_nm = tax_cd_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
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

    @ElVoField(physicalName = "bill_type_nm")
    public String getBill_type_nm(){
        return bill_type_nm;
    }

    @ElVoField(physicalName = "bill_type_nm")
    public void setBill_type_nm(String bill_type_nm){
        this.bill_type_nm = bill_type_nm;
    }

    @ElVoField(physicalName = "tax_type_1")
    public String getTax_type_1(){
        return tax_type_1;
    }

    @ElVoField(physicalName = "tax_type_1")
    public void setTax_type_1(String tax_type_1){
        this.tax_type_1 = tax_type_1;
    }

    @ElVoField(physicalName = "tax_type")
    public String getTax_type(){
        return tax_type;
    }

    @ElVoField(physicalName = "tax_type")
    public void setTax_type(String tax_type){
        this.tax_type = tax_type;
    }

    @ElVoField(physicalName = "tax_type_nm")
    public String getTax_type_nm(){
        return tax_type_nm;
    }

    @ElVoField(physicalName = "tax_type_nm")
    public void setTax_type_nm(String tax_type_nm){
        this.tax_type_nm = tax_type_nm;
    }

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "selr_mgr_id1")
    public String getSelr_mgr_id1(){
        return selr_mgr_id1;
    }

    @ElVoField(physicalName = "selr_mgr_id1")
    public void setSelr_mgr_id1(String selr_mgr_id1){
        this.selr_mgr_id1 = selr_mgr_id1;
    }

    @ElVoField(physicalName = "selr_mgr_id2")
    public String getSelr_mgr_id2(){
        return selr_mgr_id2;
    }

    @ElVoField(physicalName = "selr_mgr_id2")
    public void setSelr_mgr_id2(String selr_mgr_id2){
        this.selr_mgr_id2 = selr_mgr_id2;
    }

    @ElVoField(physicalName = "selr_mgr_id3")
    public String getSelr_mgr_id3(){
        return selr_mgr_id3;
    }

    @ElVoField(physicalName = "selr_mgr_id3")
    public void setSelr_mgr_id3(String selr_mgr_id3){
        this.selr_mgr_id3 = selr_mgr_id3;
    }

    @ElVoField(physicalName = "dept_type_nm")
    public String getDept_type_nm(){
        return dept_type_nm;
    }

    @ElVoField(physicalName = "dept_type_nm")
    public void setDept_type_nm(String dept_type_nm){
        this.dept_type_nm = dept_type_nm;
    }

    @ElVoField(physicalName = "cash_amt")
    public long getCash_amt(){
        return cash_amt;
    }

    @ElVoField(physicalName = "cash_amt")
    public void setCash_amt(long cash_amt){
        this.cash_amt = cash_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public long getCheck_amt(){
        return check_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public void setCheck_amt(long check_amt){
        this.check_amt = check_amt;
    }

    @ElVoField(physicalName = "prmsnt_amt")
    public long getPrmsnt_amt(){
        return prmsnt_amt;
    }

    @ElVoField(physicalName = "prmsnt_amt")
    public void setPrmsnt_amt(long prmsnt_amt){
        this.prmsnt_amt = prmsnt_amt;
    }

    @ElVoField(physicalName = "credit_amt")
    public long getCredit_amt(){
        return credit_amt;
    }

    @ElVoField(physicalName = "credit_amt")
    public void setCredit_amt(long credit_amt){
        this.credit_amt = credit_amt;
    }

    @ElVoField(physicalName = "pops_code")
    public String getPops_code(){
        return pops_code;
    }

    @ElVoField(physicalName = "pops_code")
    public void setPops_code(String pops_code){
        this.pops_code = pops_code;
    }

    @ElVoField(physicalName = "buy_date")
    public String getBuy_date(){
        return buy_date;
    }

    @ElVoField(physicalName = "buy_date")
    public void setBuy_date(String buy_date){
        this.buy_date = buy_date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrExcelVo [");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("regs_date").append("=").append(regs_date).append(",");
        sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("tax_returns_yn").append("=").append(tax_returns_yn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
        sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
        sb.append("selr_ceo").append("=").append(selr_ceo).append(",");
        sb.append("selr_addr").append("=").append(selr_addr).append(",");
        sb.append("selr_code").append("=").append(selr_code).append(",");
        sb.append("selr_buss_cons").append("=").append(selr_buss_cons).append(",");
        sb.append("selr_buss_type").append("=").append(selr_buss_type).append(",");
        sb.append("selr_chrg_post").append("=").append(selr_chrg_post).append(",");
        sb.append("selr_chrg_nm").append("=").append(selr_chrg_nm).append(",");
        sb.append("selr_chrg_mobl").append("=").append(selr_chrg_mobl).append(",");
        sb.append("selr_chrg_email").append("=").append(selr_chrg_email).append(",");
        sb.append("note1").append("=").append(note1).append(",");
        sb.append("evid_cd_nm").append("=").append(evid_cd_nm).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("wrte_dept_nm").append("=").append(wrte_dept_nm).append(",");
        sb.append("wrte_psn_email").append("=").append(wrte_psn_email).append(",");
        sb.append("wrte_psn_mobile").append("=").append(wrte_psn_mobile).append(",");
        sb.append("wrte_psn_ext_no").append("=").append(wrte_psn_ext_no).append(",");
        sb.append("dept_res_nm").append("=").append(dept_res_nm).append(",");
        sb.append("dept_res_email").append("=").append(dept_res_email).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("tax_cd_nm").append("=").append(tax_cd_nm).append(",");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("decsn_psn").append("=").append(decsn_psn).append(",");
        sb.append("decsn_psn_nm").append("=").append(decsn_psn_nm).append(",");
        sb.append("invoice_type").append("=").append(invoice_type).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("bill_type_nm").append("=").append(bill_type_nm).append(",");
        sb.append("tax_type_1").append("=").append(tax_type_1).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("tax_type_nm").append("=").append(tax_type_nm).append(",");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("selr_mgr_id1").append("=").append(selr_mgr_id1).append(",");
        sb.append("selr_mgr_id2").append("=").append(selr_mgr_id2).append(",");
        sb.append("selr_mgr_id3").append("=").append(selr_mgr_id3).append(",");
        sb.append("dept_type_nm").append("=").append(dept_type_nm).append(",");
        sb.append("cash_amt").append("=").append(cash_amt).append(",");
        sb.append("check_amt").append("=").append(check_amt).append(",");
        sb.append("prmsnt_amt").append("=").append(prmsnt_amt).append(",");
        sb.append("credit_amt").append("=").append(credit_amt).append(",");
        sb.append("pops_code").append("=").append(pops_code).append(",");
        sb.append("buy_date").append("=").append(buy_date);
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
