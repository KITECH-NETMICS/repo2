package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpVipAudencExp")
public class LcpVipAudencVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpVipAudencVo(){
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

    @ElDtoField(logicalName = "visit_start_ymd1", physicalName = "visit_start_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_start_ymd1;

    @ElDtoField(logicalName = "visit_start_ymd2", physicalName = "visit_start_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_start_ymd2;

    @ElDtoField(logicalName = "visit_clsf", physicalName = "visit_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_clsf;

    @ElDtoField(logicalName = "charg_dept", physicalName = "charg_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept;

    @ElDtoField(logicalName = "charg_syspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "agncy_clsf", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;

    @ElDtoField(logicalName = "audenc_no", physicalName = "audenc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audenc_no;

    @ElDtoField(logicalName = "visit_start_ymd", physicalName = "visit_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_start_ymd;

    @ElDtoField(logicalName = "visit_cls_ymd", physicalName = "visit_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_cls_ymd;

    @ElDtoField(logicalName = "visit_term", physicalName = "visit_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_term;

    @ElDtoField(logicalName = "visit_clsf_nm", physicalName = "visit_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_clsf_nm;

    @ElDtoField(logicalName = "visit_subj", physicalName = "visit_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_subj;

    @ElDtoField(logicalName = "visit_goal", physicalName = "visit_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_goal;

    @ElDtoField(logicalName = "visit_plc", physicalName = "visit_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_plc;

    @ElDtoField(logicalName = "audenc_psn", physicalName = "audenc_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audenc_psn;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElDtoField(logicalName = "reprs_psn_nm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "psn_count", physicalName = "psn_count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_count;

    @ElDtoField(logicalName = "charg_empno", physicalName = "charg_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empno;

    @ElDtoField(logicalName = "charg_nm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "charg_dept_new_ymd", physicalName = "charg_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_new_ymd;

    @ElDtoField(logicalName = "audenc_contnt", physicalName = "audenc_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audenc_contnt;

    @ElDtoField(logicalName = "agncy_cd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "krchar_agncy_nm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;

    @ElDtoField(logicalName = "membr_clsf", physicalName = "membr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String membr_clsf;

    @ElDtoField(logicalName = "cmpy_postmt_no", physicalName = "cmpy_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_postmt_no;

    @ElDtoField(logicalName = "closebiz_clsf", physicalName = "closebiz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_clsf;

    @ElDtoField(logicalName = "closebiz_resn", physicalName = "closebiz_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_resn;

    @ElDtoField(logicalName = "useFlag", physicalName = "useFlag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String useFlag;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "del_row_odr", physicalName = "del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_row_odr;

    @ElDtoField(logicalName = "row_flag", physicalName = "row_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String row_flag;

    @ElDtoField(logicalName = "del_odr", physicalName = "del_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_odr;

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

    @ElVoField(physicalName = "visit_start_ymd1")
    public String getVisit_start_ymd1(){
        return visit_start_ymd1;
    }

    @ElVoField(physicalName = "visit_start_ymd1")
    public void setVisit_start_ymd1(String visit_start_ymd1){
        this.visit_start_ymd1 = visit_start_ymd1;
    }

    @ElVoField(physicalName = "visit_start_ymd2")
    public String getVisit_start_ymd2(){
        return visit_start_ymd2;
    }

    @ElVoField(physicalName = "visit_start_ymd2")
    public void setVisit_start_ymd2(String visit_start_ymd2){
        this.visit_start_ymd2 = visit_start_ymd2;
    }

    @ElVoField(physicalName = "visit_clsf")
    public String getVisit_clsf(){
        return visit_clsf;
    }

    @ElVoField(physicalName = "visit_clsf")
    public void setVisit_clsf(String visit_clsf){
        this.visit_clsf = visit_clsf;
    }

    @ElVoField(physicalName = "charg_dept")
    public String getCharg_dept(){
        return charg_dept;
    }

    @ElVoField(physicalName = "charg_dept")
    public void setCharg_dept(String charg_dept){
        this.charg_dept = charg_dept;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }

    @ElVoField(physicalName = "audenc_no")
    public String getAudenc_no(){
        return audenc_no;
    }

    @ElVoField(physicalName = "audenc_no")
    public void setAudenc_no(String audenc_no){
        this.audenc_no = audenc_no;
    }

    @ElVoField(physicalName = "visit_start_ymd")
    public String getVisit_start_ymd(){
        return visit_start_ymd;
    }

    @ElVoField(physicalName = "visit_start_ymd")
    public void setVisit_start_ymd(String visit_start_ymd){
        this.visit_start_ymd = visit_start_ymd;
    }

    @ElVoField(physicalName = "visit_cls_ymd")
    public String getVisit_cls_ymd(){
        return visit_cls_ymd;
    }

    @ElVoField(physicalName = "visit_cls_ymd")
    public void setVisit_cls_ymd(String visit_cls_ymd){
        this.visit_cls_ymd = visit_cls_ymd;
    }

    @ElVoField(physicalName = "visit_term")
    public String getVisit_term(){
        return visit_term;
    }

    @ElVoField(physicalName = "visit_term")
    public void setVisit_term(String visit_term){
        this.visit_term = visit_term;
    }

    @ElVoField(physicalName = "visit_clsf_nm")
    public String getVisit_clsf_nm(){
        return visit_clsf_nm;
    }

    @ElVoField(physicalName = "visit_clsf_nm")
    public void setVisit_clsf_nm(String visit_clsf_nm){
        this.visit_clsf_nm = visit_clsf_nm;
    }

    @ElVoField(physicalName = "visit_subj")
    public String getVisit_subj(){
        return visit_subj;
    }

    @ElVoField(physicalName = "visit_subj")
    public void setVisit_subj(String visit_subj){
        this.visit_subj = visit_subj;
    }

    @ElVoField(physicalName = "visit_goal")
    public String getVisit_goal(){
        return visit_goal;
    }

    @ElVoField(physicalName = "visit_goal")
    public void setVisit_goal(String visit_goal){
        this.visit_goal = visit_goal;
    }

    @ElVoField(physicalName = "visit_plc")
    public String getVisit_plc(){
        return visit_plc;
    }

    @ElVoField(physicalName = "visit_plc")
    public void setVisit_plc(String visit_plc){
        this.visit_plc = visit_plc;
    }

    @ElVoField(physicalName = "audenc_psn")
    public String getAudenc_psn(){
        return audenc_psn;
    }

    @ElVoField(physicalName = "audenc_psn")
    public void setAudenc_psn(String audenc_psn){
        this.audenc_psn = audenc_psn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "psn_count")
    public String getPsn_count(){
        return psn_count;
    }

    @ElVoField(physicalName = "psn_count")
    public void setPsn_count(String psn_count){
        this.psn_count = psn_count;
    }

    @ElVoField(physicalName = "charg_empno")
    public String getCharg_empno(){
        return charg_empno;
    }

    @ElVoField(physicalName = "charg_empno")
    public void setCharg_empno(String charg_empno){
        this.charg_empno = charg_empno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public String getCharg_dept_new_ymd(){
        return charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public void setCharg_dept_new_ymd(String charg_dept_new_ymd){
        this.charg_dept_new_ymd = charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "audenc_contnt")
    public String getAudenc_contnt(){
        return audenc_contnt;
    }

    @ElVoField(physicalName = "audenc_contnt")
    public void setAudenc_contnt(String audenc_contnt){
        this.audenc_contnt = audenc_contnt;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }

    @ElVoField(physicalName = "membr_clsf")
    public String getMembr_clsf(){
        return membr_clsf;
    }

    @ElVoField(physicalName = "membr_clsf")
    public void setMembr_clsf(String membr_clsf){
        this.membr_clsf = membr_clsf;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public String getCmpy_postmt_no(){
        return cmpy_postmt_no;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public void setCmpy_postmt_no(String cmpy_postmt_no){
        this.cmpy_postmt_no = cmpy_postmt_no;
    }

    @ElVoField(physicalName = "closebiz_clsf")
    public String getClosebiz_clsf(){
        return closebiz_clsf;
    }

    @ElVoField(physicalName = "closebiz_clsf")
    public void setClosebiz_clsf(String closebiz_clsf){
        this.closebiz_clsf = closebiz_clsf;
    }

    @ElVoField(physicalName = "closebiz_resn")
    public String getClosebiz_resn(){
        return closebiz_resn;
    }

    @ElVoField(physicalName = "closebiz_resn")
    public void setClosebiz_resn(String closebiz_resn){
        this.closebiz_resn = closebiz_resn;
    }

    @ElVoField(physicalName = "useFlag")
    public String getUseFlag(){
        return useFlag;
    }

    @ElVoField(physicalName = "useFlag")
    public void setUseFlag(String useFlag){
        this.useFlag = useFlag;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "del_row_odr")
    public String getDel_row_odr(){
        return del_row_odr;
    }

    @ElVoField(physicalName = "del_row_odr")
    public void setDel_row_odr(String del_row_odr){
        this.del_row_odr = del_row_odr;
    }

    @ElVoField(physicalName = "row_flag")
    public String getRow_flag(){
        return row_flag;
    }

    @ElVoField(physicalName = "row_flag")
    public void setRow_flag(String row_flag){
        this.row_flag = row_flag;
    }

    @ElVoField(physicalName = "del_odr")
    public String getDel_odr(){
        return del_odr;
    }

    @ElVoField(physicalName = "del_odr")
    public void setDel_odr(String del_odr){
        this.del_odr = del_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpVipAudencVo [");
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
        sb.append("visit_start_ymd1").append("=").append(visit_start_ymd1).append(",");
        sb.append("visit_start_ymd2").append("=").append(visit_start_ymd2).append(",");
        sb.append("visit_clsf").append("=").append(visit_clsf).append(",");
        sb.append("charg_dept").append("=").append(charg_dept).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
        sb.append("audenc_no").append("=").append(audenc_no).append(",");
        sb.append("visit_start_ymd").append("=").append(visit_start_ymd).append(",");
        sb.append("visit_cls_ymd").append("=").append(visit_cls_ymd).append(",");
        sb.append("visit_term").append("=").append(visit_term).append(",");
        sb.append("visit_clsf_nm").append("=").append(visit_clsf_nm).append(",");
        sb.append("visit_subj").append("=").append(visit_subj).append(",");
        sb.append("visit_goal").append("=").append(visit_goal).append(",");
        sb.append("visit_plc").append("=").append(visit_plc).append(",");
        sb.append("audenc_psn").append("=").append(audenc_psn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("psn_count").append("=").append(psn_count).append(",");
        sb.append("charg_empno").append("=").append(charg_empno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("charg_dept_new_ymd").append("=").append(charg_dept_new_ymd).append(",");
        sb.append("audenc_contnt").append("=").append(audenc_contnt).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
        sb.append("membr_clsf").append("=").append(membr_clsf).append(",");
        sb.append("cmpy_postmt_no").append("=").append(cmpy_postmt_no).append(",");
        sb.append("closebiz_clsf").append("=").append(closebiz_clsf).append(",");
        sb.append("closebiz_resn").append("=").append(closebiz_resn).append(",");
        sb.append("useFlag").append("=").append(useFlag).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("del_row_odr").append("=").append(del_row_odr).append(",");
        sb.append("row_flag").append("=").append(row_flag).append(",");
        sb.append("del_odr").append("=").append(del_odr);
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
