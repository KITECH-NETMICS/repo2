package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 헤더 Vo")
public class FtxBillExcelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillExcelVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "역전자발행번호", physicalName = "decsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자부서", physicalName = "bugt_ctrl_psn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_dept;

    @ElDtoField(logicalName = "계산서구분", physicalName = "bill_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_clsf;

    @ElDtoField(logicalName = "매출매입구분", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "매출매입구분명", physicalName = "bill_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type_nm;

    @ElDtoField(logicalName = "계산서종류", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "계산서종류명", physicalName = "tax_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type_nm;

    @ElDtoField(logicalName = "처리구분", physicalName = "prcs_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf_nm;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "사업자번호", physicalName = "buyr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "buyr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_nm;

    @ElDtoField(logicalName = "대표자명", physicalName = "buyr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_ceo;

    @ElDtoField(logicalName = "주소", physicalName = "buyr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_addr;

    @ElDtoField(logicalName = "종사업자번호", physicalName = "buyr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_code;

    @ElDtoField(logicalName = "업태", physicalName = "buyr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_cons;

    @ElDtoField(logicalName = "업종", physicalName = "buyr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_type;

    @ElDtoField(logicalName = "공급가액", physicalName = "chrg_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long chrg_amt;

    @ElDtoField(logicalName = "과세금액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "합계금액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "현금입금", physicalName = "cash_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_depst;

    @ElDtoField(logicalName = "수표입금", physicalName = "check_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_depst;

    @ElDtoField(logicalName = "어음입금", physicalName = "prmsnt_depst", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long prmsnt_depst;

    @ElDtoField(logicalName = "외상매입", physicalName = "credit_pur", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long credit_pur;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk1;

    @ElDtoField(logicalName = "작성부서", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElDtoField(logicalName = "이메일주소", physicalName = "wrte_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_email;

    @ElDtoField(logicalName = "작성자명", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "작성자연락처", physicalName = "wrte_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ext_no;

    @ElDtoField(logicalName = "작성자부서", physicalName = "wrte_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_nm;

    @ElDtoField(logicalName = "발행구분", physicalName = "pops_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_code;

    @ElDtoField(logicalName = "지역본부", physicalName = "fomat_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit_nm;

    @ElDtoField(logicalName = "계정과세", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "수정사유", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "품목구매일자", physicalName = "buy_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_date;

    @ElDtoField(logicalName = "품목", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "비고", physicalName = "item_desp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_desp;

    @ElDtoField(logicalName = "규격", physicalName = "item_infm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_infm;

    @ElDtoField(logicalName = "수량", physicalName = "item_qunt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_qunt;

    @ElDtoField(logicalName = "단가", physicalName = "unit_prce", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_prce;

    @ElDtoField(logicalName = "공급가", physicalName = "item_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_amt;

    @ElDtoField(logicalName = "세액", physicalName = "item_tax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_tax;

    @ElDtoField(logicalName = "담당자우편번호1", physicalName = "buyr_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post;

    @ElDtoField(logicalName = "담당자이름1", physicalName = "buyr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm;

    @ElDtoField(logicalName = "담당자이메일1", physicalName = "buyr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email;

    @ElDtoField(logicalName = "담당자핸드폰1", physicalName = "buyr_chrg_mobl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_mobl;

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "decsn_no")
    public String getDecsn_no(){
        return decsn_no;
    }

    @ElVoField(physicalName = "decsn_no")
    public void setDecsn_no(String decsn_no){
        this.decsn_no = decsn_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_dept")
    public String getBugt_ctrl_psn_dept(){
        return bugt_ctrl_psn_dept;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_dept")
    public void setBugt_ctrl_psn_dept(String bugt_ctrl_psn_dept){
        this.bugt_ctrl_psn_dept = bugt_ctrl_psn_dept;
    }

    @ElVoField(physicalName = "bill_clsf")
    public String getBill_clsf(){
        return bill_clsf;
    }

    @ElVoField(physicalName = "bill_clsf")
    public void setBill_clsf(String bill_clsf){
        this.bill_clsf = bill_clsf;
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

    @ElVoField(physicalName = "prcs_clsf_nm")
    public String getPrcs_clsf_nm(){
        return prcs_clsf_nm;
    }

    @ElVoField(physicalName = "prcs_clsf_nm")
    public void setPrcs_clsf_nm(String prcs_clsf_nm){
        this.prcs_clsf_nm = prcs_clsf_nm;
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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
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

    @ElVoField(physicalName = "buyr_ceo")
    public String getBuyr_ceo(){
        return buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_ceo")
    public void setBuyr_ceo(String buyr_ceo){
        this.buyr_ceo = buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_addr")
    public String getBuyr_addr(){
        return buyr_addr;
    }

    @ElVoField(physicalName = "buyr_addr")
    public void setBuyr_addr(String buyr_addr){
        this.buyr_addr = buyr_addr;
    }

    @ElVoField(physicalName = "buyr_code")
    public String getBuyr_code(){
        return buyr_code;
    }

    @ElVoField(physicalName = "buyr_code")
    public void setBuyr_code(String buyr_code){
        this.buyr_code = buyr_code;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public String getBuyr_buss_cons(){
        return buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public void setBuyr_buss_cons(String buyr_buss_cons){
        this.buyr_buss_cons = buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public String getBuyr_buss_type(){
        return buyr_buss_type;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public void setBuyr_buss_type(String buyr_buss_type){
        this.buyr_buss_type = buyr_buss_type;
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

    @ElVoField(physicalName = "rmk1")
    public String getRmk1(){
        return rmk1;
    }

    @ElVoField(physicalName = "rmk1")
    public void setRmk1(String rmk1){
        this.rmk1 = rmk1;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @ElVoField(physicalName = "wrte_email")
    public String getWrte_email(){
        return wrte_email;
    }

    @ElVoField(physicalName = "wrte_email")
    public void setWrte_email(String wrte_email){
        this.wrte_email = wrte_email;
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

    @ElVoField(physicalName = "pops_code")
    public String getPops_code(){
        return pops_code;
    }

    @ElVoField(physicalName = "pops_code")
    public void setPops_code(String pops_code){
        this.pops_code = pops_code;
    }

    @ElVoField(physicalName = "fomat_unit_nm")
    public String getFomat_unit_nm(){
        return fomat_unit_nm;
    }

    @ElVoField(physicalName = "fomat_unit_nm")
    public void setFomat_unit_nm(String fomat_unit_nm){
        this.fomat_unit_nm = fomat_unit_nm;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "buy_date")
    public String getBuy_date(){
        return buy_date;
    }

    @ElVoField(physicalName = "buy_date")
    public void setBuy_date(String buy_date){
        this.buy_date = buy_date;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "item_desp")
    public String getItem_desp(){
        return item_desp;
    }

    @ElVoField(physicalName = "item_desp")
    public void setItem_desp(String item_desp){
        this.item_desp = item_desp;
    }

    @ElVoField(physicalName = "item_infm")
    public String getItem_infm(){
        return item_infm;
    }

    @ElVoField(physicalName = "item_infm")
    public void setItem_infm(String item_infm){
        this.item_infm = item_infm;
    }

    @ElVoField(physicalName = "item_qunt")
    public String getItem_qunt(){
        return item_qunt;
    }

    @ElVoField(physicalName = "item_qunt")
    public void setItem_qunt(String item_qunt){
        this.item_qunt = item_qunt;
    }

    @ElVoField(physicalName = "unit_prce")
    public String getUnit_prce(){
        return unit_prce;
    }

    @ElVoField(physicalName = "unit_prce")
    public void setUnit_prce(String unit_prce){
        this.unit_prce = unit_prce;
    }

    @ElVoField(physicalName = "item_amt")
    public String getItem_amt(){
        return item_amt;
    }

    @ElVoField(physicalName = "item_amt")
    public void setItem_amt(String item_amt){
        this.item_amt = item_amt;
    }

    @ElVoField(physicalName = "item_tax")
    public String getItem_tax(){
        return item_tax;
    }

    @ElVoField(physicalName = "item_tax")
    public void setItem_tax(String item_tax){
        this.item_tax = item_tax;
    }

    @ElVoField(physicalName = "buyr_chrg_post")
    public String getBuyr_chrg_post(){
        return buyr_chrg_post;
    }

    @ElVoField(physicalName = "buyr_chrg_post")
    public void setBuyr_chrg_post(String buyr_chrg_post){
        this.buyr_chrg_post = buyr_chrg_post;
    }

    @ElVoField(physicalName = "buyr_chrg_nm")
    public String getBuyr_chrg_nm(){
        return buyr_chrg_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_nm")
    public void setBuyr_chrg_nm(String buyr_chrg_nm){
        this.buyr_chrg_nm = buyr_chrg_nm;
    }

    @ElVoField(physicalName = "buyr_chrg_email")
    public String getBuyr_chrg_email(){
        return buyr_chrg_email;
    }

    @ElVoField(physicalName = "buyr_chrg_email")
    public void setBuyr_chrg_email(String buyr_chrg_email){
        this.buyr_chrg_email = buyr_chrg_email;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl")
    public String getBuyr_chrg_mobl(){
        return buyr_chrg_mobl;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl")
    public void setBuyr_chrg_mobl(String buyr_chrg_mobl){
        this.buyr_chrg_mobl = buyr_chrg_mobl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillExcelVo [");
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("decsn_no").append("=").append(decsn_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("bugt_ctrl_psn_dept").append("=").append(bugt_ctrl_psn_dept).append(",");
        sb.append("bill_clsf").append("=").append(bill_clsf).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("bill_type_nm").append("=").append(bill_type_nm).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("tax_type_nm").append("=").append(tax_type_nm).append(",");
        sb.append("prcs_clsf_nm").append("=").append(prcs_clsf_nm).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("buyr_corp_no").append("=").append(buyr_corp_no).append(",");
        sb.append("buyr_corp_nm").append("=").append(buyr_corp_nm).append(",");
        sb.append("buyr_ceo").append("=").append(buyr_ceo).append(",");
        sb.append("buyr_addr").append("=").append(buyr_addr).append(",");
        sb.append("buyr_code").append("=").append(buyr_code).append(",");
        sb.append("buyr_buss_cons").append("=").append(buyr_buss_cons).append(",");
        sb.append("buyr_buss_type").append("=").append(buyr_buss_type).append(",");
        sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("cash_depst").append("=").append(cash_depst).append(",");
        sb.append("check_depst").append("=").append(check_depst).append(",");
        sb.append("prmsnt_depst").append("=").append(prmsnt_depst).append(",");
        sb.append("credit_pur").append("=").append(credit_pur).append(",");
        sb.append("rmk1").append("=").append(rmk1).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("wrte_email").append("=").append(wrte_email).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("wrte_ext_no").append("=").append(wrte_ext_no).append(",");
        sb.append("wrte_dept_nm").append("=").append(wrte_dept_nm).append(",");
        sb.append("pops_code").append("=").append(pops_code).append(",");
        sb.append("fomat_unit_nm").append("=").append(fomat_unit_nm).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("buy_date").append("=").append(buy_date).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("item_desp").append("=").append(item_desp).append(",");
        sb.append("item_infm").append("=").append(item_infm).append(",");
        sb.append("item_qunt").append("=").append(item_qunt).append(",");
        sb.append("unit_prce").append("=").append(unit_prce).append(",");
        sb.append("item_amt").append("=").append(item_amt).append(",");
        sb.append("item_tax").append("=").append(item_tax).append(",");
        sb.append("buyr_chrg_post").append("=").append(buyr_chrg_post).append(",");
        sb.append("buyr_chrg_nm").append("=").append(buyr_chrg_nm).append(",");
        sb.append("buyr_chrg_email").append("=").append(buyr_chrg_email).append(",");
        sb.append("buyr_chrg_mobl").append("=").append(buyr_chrg_mobl);
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
