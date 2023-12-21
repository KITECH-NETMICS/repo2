package kr.re.kitech.biz.sup.cus.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 고객정보 조회 Vo")
public class SptCustSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCustSrcVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "고객명", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "작성완료여부", physicalName = "wrte_complt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_complt;

    @ElDtoField(logicalName = "경영정보작성여부", physicalName = "his_complt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_complt;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "매출액(시작)", physicalName = "sales_amt_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sales_amt_st;

    @ElDtoField(logicalName = "매출액(종료)", physicalName = "sales_amt_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sales_amt_ed;

    @ElDtoField(logicalName = "종업원수(시작)", physicalName = "emp_no_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_no_st;

    @ElDtoField(logicalName = "종업원수(종료)", physicalName = "emp_no_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_no_ed;

    @ElDtoField(logicalName = "사용유무", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "기업상태", physicalName = "enp_scd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enp_scd;

    @ElDtoField(logicalName = "기업분류", physicalName = "cmpy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_clsf;

    @ElDtoField(logicalName = "관계연도", physicalName = "relt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relt_yr;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "wrte_complt")
    public String getWrte_complt(){
        return wrte_complt;
    }

    @ElVoField(physicalName = "wrte_complt")
    public void setWrte_complt(String wrte_complt){
        this.wrte_complt = wrte_complt;
    }

    @ElVoField(physicalName = "his_complt")
    public String getHis_complt(){
        return his_complt;
    }

    @ElVoField(physicalName = "his_complt")
    public void setHis_complt(String his_complt){
        this.his_complt = his_complt;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "sales_amt_st")
    public String getSales_amt_st(){
        return sales_amt_st;
    }

    @ElVoField(physicalName = "sales_amt_st")
    public void setSales_amt_st(String sales_amt_st){
        this.sales_amt_st = sales_amt_st;
    }

    @ElVoField(physicalName = "sales_amt_ed")
    public String getSales_amt_ed(){
        return sales_amt_ed;
    }

    @ElVoField(physicalName = "sales_amt_ed")
    public void setSales_amt_ed(String sales_amt_ed){
        this.sales_amt_ed = sales_amt_ed;
    }

    @ElVoField(physicalName = "emp_no_st")
    public String getEmp_no_st(){
        return emp_no_st;
    }

    @ElVoField(physicalName = "emp_no_st")
    public void setEmp_no_st(String emp_no_st){
        this.emp_no_st = emp_no_st;
    }

    @ElVoField(physicalName = "emp_no_ed")
    public String getEmp_no_ed(){
        return emp_no_ed;
    }

    @ElVoField(physicalName = "emp_no_ed")
    public void setEmp_no_ed(String emp_no_ed){
        this.emp_no_ed = emp_no_ed;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "enp_scd")
    public String getEnp_scd(){
        return enp_scd;
    }

    @ElVoField(physicalName = "enp_scd")
    public void setEnp_scd(String enp_scd){
        this.enp_scd = enp_scd;
    }

    @ElVoField(physicalName = "cmpy_clsf")
    public String getCmpy_clsf(){
        return cmpy_clsf;
    }

    @ElVoField(physicalName = "cmpy_clsf")
    public void setCmpy_clsf(String cmpy_clsf){
        this.cmpy_clsf = cmpy_clsf;
    }

    @ElVoField(physicalName = "relt_yr")
    public String getRelt_yr(){
        return relt_yr;
    }

    @ElVoField(physicalName = "relt_yr")
    public void setRelt_yr(String relt_yr){
        this.relt_yr = relt_yr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCustSrcVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("wrte_complt").append("=").append(wrte_complt).append(",");
        sb.append("his_complt").append("=").append(his_complt).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("sales_amt_st").append("=").append(sales_amt_st).append(",");
        sb.append("sales_amt_ed").append("=").append(sales_amt_ed).append(",");
        sb.append("emp_no_st").append("=").append(emp_no_st).append(",");
        sb.append("emp_no_ed").append("=").append(emp_no_ed).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("enp_scd").append("=").append(enp_scd).append(",");
        sb.append("cmpy_clsf").append("=").append(cmpy_clsf).append(",");
        sb.append("relt_yr").append("=").append(relt_yr);
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
