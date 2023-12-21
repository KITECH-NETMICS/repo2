package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LplCustBaseInfoExp")
public class LplCustBaseInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LplCustBaseInfoVo(){
    }

    @ElDtoField(logicalName = "cmpy_typ", physicalName = "cmpy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ;

    @ElDtoField(logicalName = "dom_excpt_clsf", physicalName = "dom_excpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_excpt_clsf;

    @ElDtoField(logicalName = "natn_cd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "cmpy_nm_krchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "cmpy_nm_eng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "cust_no", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "supt_clsf", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "dom_excpt_clsf_nm", physicalName = "dom_excpt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_excpt_clsf_nm;

    @ElDtoField(logicalName = "agncy_clsf_nm", physicalName = "agncy_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf_nm;

    @ElDtoField(logicalName = "natn_nm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "reprs_psn", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "reprs_psn_mobile_no", physicalName = "reprs_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_mobile_no;

    @ElDtoField(logicalName = "reprs_psn_email", physicalName = "reprs_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_email;

    @ElDtoField(logicalName = "estb_ymd", physicalName = "estb_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String estb_ymd;

    @ElDtoField(logicalName = "cmpy_post_no", physicalName = "cmpy_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_post_no;

    @ElDtoField(logicalName = "cmpy_addr", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "cmpy_fax_no", physicalName = "cmpy_fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_fax_no;

    @ElDtoField(logicalName = "cmpy_reprs_tel", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;

    @ElDtoField(logicalName = "homepg", physicalName = "homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg;

    @ElDtoField(logicalName = "closebiz_ex", physicalName = "closebiz_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_ex;

    @ElDtoField(logicalName = "intrc_yn_nm", physicalName = "intrc_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrc_yn_nm;

    @ElDtoField(logicalName = "closebiz_ymd", physicalName = "closebiz_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_ymd;

    @ElDtoField(logicalName = "closebiz_cause", physicalName = "closebiz_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_cause;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "relat_vend_cd", physicalName = "relat_vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_vend_cd;

    @ElDtoField(logicalName = "cmpy_nm_eng_short", physicalName = "cmpy_nm_eng_short", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng_short;

    @ElDtoField(logicalName = "agncy_clsf", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;

    @ElDtoField(logicalName = "bsns_psn_regst_no", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "corp_regst_no", physicalName = "corp_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_regst_no;

    @ElDtoField(logicalName = "cmpy_addr_detls", physicalName = "cmpy_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_detls;

    @ElDtoField(logicalName = "factry_use_ex", physicalName = "factry_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_use_ex;

    @ElDtoField(logicalName = "factry_post_no", physicalName = "factry_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_post_no;

    @ElDtoField(logicalName = "factry_addr", physicalName = "factry_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_addr;

    @ElDtoField(logicalName = "factry_addr_detls", physicalName = "factry_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_addr_detls;

    @ElDtoField(logicalName = "factry_reprs_tel", physicalName = "factry_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_reprs_tel;

    @ElDtoField(logicalName = "factry_fax_no", physicalName = "factry_fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_fax_no;

    @ElDtoField(logicalName = "bizcatg", physicalName = "bizcatg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizcatg;

    @ElDtoField(logicalName = "item", physicalName = "item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item;

    @ElDtoField(logicalName = "biztyp", physicalName = "biztyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztyp;

    @ElDtoField(logicalName = "main_prodct_item", physicalName = "main_prodct_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_prodct_item;

    @ElDtoField(logicalName = "reprs_clsf", physicalName = "reprs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_clsf;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "chk_text", physicalName = "chk_text", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk_text;

    @ElVoField(physicalName = "cmpy_typ")
    public String getCmpy_typ(){
        return cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public void setCmpy_typ(String cmpy_typ){
        this.cmpy_typ = cmpy_typ;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public String getDom_excpt_clsf(){
        return dom_excpt_clsf;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public void setDom_excpt_clsf(String dom_excpt_clsf){
        this.dom_excpt_clsf = dom_excpt_clsf;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "dom_excpt_clsf_nm")
    public String getDom_excpt_clsf_nm(){
        return dom_excpt_clsf_nm;
    }

    @ElVoField(physicalName = "dom_excpt_clsf_nm")
    public void setDom_excpt_clsf_nm(String dom_excpt_clsf_nm){
        this.dom_excpt_clsf_nm = dom_excpt_clsf_nm;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public String getAgncy_clsf_nm(){
        return agncy_clsf_nm;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public void setAgncy_clsf_nm(String agncy_clsf_nm){
        this.agncy_clsf_nm = agncy_clsf_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn_mobile_no")
    public String getReprs_psn_mobile_no(){
        return reprs_psn_mobile_no;
    }

    @ElVoField(physicalName = "reprs_psn_mobile_no")
    public void setReprs_psn_mobile_no(String reprs_psn_mobile_no){
        this.reprs_psn_mobile_no = reprs_psn_mobile_no;
    }

    @ElVoField(physicalName = "reprs_psn_email")
    public String getReprs_psn_email(){
        return reprs_psn_email;
    }

    @ElVoField(physicalName = "reprs_psn_email")
    public void setReprs_psn_email(String reprs_psn_email){
        this.reprs_psn_email = reprs_psn_email;
    }

    @ElVoField(physicalName = "estb_ymd")
    public String getEstb_ymd(){
        return estb_ymd;
    }

    @ElVoField(physicalName = "estb_ymd")
    public void setEstb_ymd(String estb_ymd){
        this.estb_ymd = estb_ymd;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public String getCmpy_post_no(){
        return cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public void setCmpy_post_no(String cmpy_post_no){
        this.cmpy_post_no = cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_fax_no")
    public String getCmpy_fax_no(){
        return cmpy_fax_no;
    }

    @ElVoField(physicalName = "cmpy_fax_no")
    public void setCmpy_fax_no(String cmpy_fax_no){
        this.cmpy_fax_no = cmpy_fax_no;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "homepg")
    public String getHomepg(){
        return homepg;
    }

    @ElVoField(physicalName = "homepg")
    public void setHomepg(String homepg){
        this.homepg = homepg;
    }

    @ElVoField(physicalName = "closebiz_ex")
    public String getClosebiz_ex(){
        return closebiz_ex;
    }

    @ElVoField(physicalName = "closebiz_ex")
    public void setClosebiz_ex(String closebiz_ex){
        this.closebiz_ex = closebiz_ex;
    }

    @ElVoField(physicalName = "intrc_yn_nm")
    public String getIntrc_yn_nm(){
        return intrc_yn_nm;
    }

    @ElVoField(physicalName = "intrc_yn_nm")
    public void setIntrc_yn_nm(String intrc_yn_nm){
        this.intrc_yn_nm = intrc_yn_nm;
    }

    @ElVoField(physicalName = "closebiz_ymd")
    public String getClosebiz_ymd(){
        return closebiz_ymd;
    }

    @ElVoField(physicalName = "closebiz_ymd")
    public void setClosebiz_ymd(String closebiz_ymd){
        this.closebiz_ymd = closebiz_ymd;
    }

    @ElVoField(physicalName = "closebiz_cause")
    public String getClosebiz_cause(){
        return closebiz_cause;
    }

    @ElVoField(physicalName = "closebiz_cause")
    public void setClosebiz_cause(String closebiz_cause){
        this.closebiz_cause = closebiz_cause;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "relat_vend_cd")
    public String getRelat_vend_cd(){
        return relat_vend_cd;
    }

    @ElVoField(physicalName = "relat_vend_cd")
    public void setRelat_vend_cd(String relat_vend_cd){
        this.relat_vend_cd = relat_vend_cd;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public String getCmpy_nm_eng_short(){
        return cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public void setCmpy_nm_eng_short(String cmpy_nm_eng_short){
        this.cmpy_nm_eng_short = cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public String getCorp_regst_no(){
        return corp_regst_no;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public void setCorp_regst_no(String corp_regst_no){
        this.corp_regst_no = corp_regst_no;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public String getCmpy_addr_detls(){
        return cmpy_addr_detls;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public void setCmpy_addr_detls(String cmpy_addr_detls){
        this.cmpy_addr_detls = cmpy_addr_detls;
    }

    @ElVoField(physicalName = "factry_use_ex")
    public String getFactry_use_ex(){
        return factry_use_ex;
    }

    @ElVoField(physicalName = "factry_use_ex")
    public void setFactry_use_ex(String factry_use_ex){
        this.factry_use_ex = factry_use_ex;
    }

    @ElVoField(physicalName = "factry_post_no")
    public String getFactry_post_no(){
        return factry_post_no;
    }

    @ElVoField(physicalName = "factry_post_no")
    public void setFactry_post_no(String factry_post_no){
        this.factry_post_no = factry_post_no;
    }

    @ElVoField(physicalName = "factry_addr")
    public String getFactry_addr(){
        return factry_addr;
    }

    @ElVoField(physicalName = "factry_addr")
    public void setFactry_addr(String factry_addr){
        this.factry_addr = factry_addr;
    }

    @ElVoField(physicalName = "factry_addr_detls")
    public String getFactry_addr_detls(){
        return factry_addr_detls;
    }

    @ElVoField(physicalName = "factry_addr_detls")
    public void setFactry_addr_detls(String factry_addr_detls){
        this.factry_addr_detls = factry_addr_detls;
    }

    @ElVoField(physicalName = "factry_reprs_tel")
    public String getFactry_reprs_tel(){
        return factry_reprs_tel;
    }

    @ElVoField(physicalName = "factry_reprs_tel")
    public void setFactry_reprs_tel(String factry_reprs_tel){
        this.factry_reprs_tel = factry_reprs_tel;
    }

    @ElVoField(physicalName = "factry_fax_no")
    public String getFactry_fax_no(){
        return factry_fax_no;
    }

    @ElVoField(physicalName = "factry_fax_no")
    public void setFactry_fax_no(String factry_fax_no){
        this.factry_fax_no = factry_fax_no;
    }

    @ElVoField(physicalName = "bizcatg")
    public String getBizcatg(){
        return bizcatg;
    }

    @ElVoField(physicalName = "bizcatg")
    public void setBizcatg(String bizcatg){
        this.bizcatg = bizcatg;
    }

    @ElVoField(physicalName = "item")
    public String getItem(){
        return item;
    }

    @ElVoField(physicalName = "item")
    public void setItem(String item){
        this.item = item;
    }

    @ElVoField(physicalName = "biztyp")
    public String getBiztyp(){
        return biztyp;
    }

    @ElVoField(physicalName = "biztyp")
    public void setBiztyp(String biztyp){
        this.biztyp = biztyp;
    }

    @ElVoField(physicalName = "main_prodct_item")
    public String getMain_prodct_item(){
        return main_prodct_item;
    }

    @ElVoField(physicalName = "main_prodct_item")
    public void setMain_prodct_item(String main_prodct_item){
        this.main_prodct_item = main_prodct_item;
    }

    @ElVoField(physicalName = "reprs_clsf")
    public String getReprs_clsf(){
        return reprs_clsf;
    }

    @ElVoField(physicalName = "reprs_clsf")
    public void setReprs_clsf(String reprs_clsf){
        this.reprs_clsf = reprs_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "chk_text")
    public String getChk_text(){
        return chk_text;
    }

    @ElVoField(physicalName = "chk_text")
    public void setChk_text(String chk_text){
        this.chk_text = chk_text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LplCustBaseInfoVo [");
        sb.append("cmpy_typ").append("=").append(cmpy_typ).append(",");
        sb.append("dom_excpt_clsf").append("=").append(dom_excpt_clsf).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("dom_excpt_clsf_nm").append("=").append(dom_excpt_clsf_nm).append(",");
        sb.append("agncy_clsf_nm").append("=").append(agncy_clsf_nm).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("reprs_psn_mobile_no").append("=").append(reprs_psn_mobile_no).append(",");
        sb.append("reprs_psn_email").append("=").append(reprs_psn_email).append(",");
        sb.append("estb_ymd").append("=").append(estb_ymd).append(",");
        sb.append("cmpy_post_no").append("=").append(cmpy_post_no).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("cmpy_fax_no").append("=").append(cmpy_fax_no).append(",");
        sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
        sb.append("homepg").append("=").append(homepg).append(",");
        sb.append("closebiz_ex").append("=").append(closebiz_ex).append(",");
        sb.append("intrc_yn_nm").append("=").append(intrc_yn_nm).append(",");
        sb.append("closebiz_ymd").append("=").append(closebiz_ymd).append(",");
        sb.append("closebiz_cause").append("=").append(closebiz_cause).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("relat_vend_cd").append("=").append(relat_vend_cd).append(",");
        sb.append("cmpy_nm_eng_short").append("=").append(cmpy_nm_eng_short).append(",");
        sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("corp_regst_no").append("=").append(corp_regst_no).append(",");
        sb.append("cmpy_addr_detls").append("=").append(cmpy_addr_detls).append(",");
        sb.append("factry_use_ex").append("=").append(factry_use_ex).append(",");
        sb.append("factry_post_no").append("=").append(factry_post_no).append(",");
        sb.append("factry_addr").append("=").append(factry_addr).append(",");
        sb.append("factry_addr_detls").append("=").append(factry_addr_detls).append(",");
        sb.append("factry_reprs_tel").append("=").append(factry_reprs_tel).append(",");
        sb.append("factry_fax_no").append("=").append(factry_fax_no).append(",");
        sb.append("bizcatg").append("=").append(bizcatg).append(",");
        sb.append("item").append("=").append(item).append(",");
        sb.append("biztyp").append("=").append(biztyp).append(",");
        sb.append("main_prodct_item").append("=").append(main_prodct_item).append(",");
        sb.append("reprs_clsf").append("=").append(reprs_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("chk_text").append("=").append(chk_text);
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
