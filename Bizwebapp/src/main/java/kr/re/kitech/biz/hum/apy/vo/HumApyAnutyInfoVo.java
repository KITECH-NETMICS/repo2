package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "과학기술인연금신청정보")
public class HumApyAnutyInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyAnutyInfoVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "entrYmd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "longwkCntfrYmd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "reqTyp", physicalName = "req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ;

    @ElDtoField(logicalName = "retireMiddleCntfrYmd", physicalName = "retire_middle_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_middle_cntfr_ymd;

    @ElDtoField(logicalName = "postmtNo", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "baseAddr", physicalName = "base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_addr;

    @ElDtoField(logicalName = "detlsAddr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "cmpyPostmtNo", physicalName = "cmpy_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_postmt_no;

    @ElDtoField(logicalName = "cmpyBaseAddr", physicalName = "cmpy_base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_base_addr;

    @ElDtoField(logicalName = "cmpyDetlsAddr", physicalName = "cmpy_detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_detls_addr;

    @ElDtoField(logicalName = "homeTel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "retireMnyCntfrYmd", physicalName = "retire_mny_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_mny_cntfr_ymd;

    @ElDtoField(logicalName = "retireInclYn", physicalName = "retire_incl_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_incl_yn;

    @ElDtoField(logicalName = "psnBurdn", physicalName = "psn_burdn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_burdn;

    @ElDtoField(logicalName = "addPayYn", physicalName = "add_pay_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_pay_yn;

    @ElDtoField(logicalName = "reqCause", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "docuNo", physicalName = "docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_no;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "coleYn", physicalName = "cole_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cole_yn;

    @ElDtoField(logicalName = "sciTechAnuty", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "initIndictMp100Yn", physicalName = "init_indict_mp100_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_mp100_yn;

    @ElDtoField(logicalName = "initIndictMp70Yn", physicalName = "init_indict_mp70_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_mp70_yn;

    @ElDtoField(logicalName = "initIndictMp50Yn", physicalName = "init_indict_mp50_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_mp50_yn;

    @ElDtoField(logicalName = "initIndictMp30Yn", physicalName = "init_indict_mp30_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_mp30_yn;

    @ElDtoField(logicalName = "initIndictRetireamtYn", physicalName = "init_indict_retireamt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_retireamt_yn;

    @ElDtoField(logicalName = "initIndictEtcYn", physicalName = "init_indict_etc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init_indict_etc_yn;

    @ElDtoField(logicalName = "apartIndictMp100Yn", physicalName = "apart_indict_mp100_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_mp100_yn;

    @ElDtoField(logicalName = "apartIndictMp70Yn", physicalName = "apart_indict_mp70_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_mp70_yn;

    @ElDtoField(logicalName = "apartIndictMp50Yn", physicalName = "apart_indict_mp50_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_mp50_yn;

    @ElDtoField(logicalName = "apartIndictMp30Yn", physicalName = "apart_indict_mp30_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_mp30_yn;

    @ElDtoField(logicalName = "apartIndictRetireamtYn", physicalName = "apart_indict_retireamt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_retireamt_yn;

    @ElDtoField(logicalName = "apartIndictEtcYn", physicalName = "apart_indict_etc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apart_indict_etc_yn;

    @ElDtoField(logicalName = "reqYmdFrom", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "reqYmdTo", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "reqTypNm", physicalName = "req_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ_nm;

    @ElDtoField(logicalName = "addrPostmtNo", physicalName = "addr_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_postmt_no;

    @ElDtoField(logicalName = "addrBase", physicalName = "addr_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_base;

    @ElDtoField(logicalName = "addrDetls", physicalName = "addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_detls;

    @ElDtoField(logicalName = "addPayAmt", physicalName = "add_pay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_pay_amt;

    @ElDtoField(logicalName = "retonum", physicalName = "retonum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retonum;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "calcBase", physicalName = "calc_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calc_base;

    @ElDtoField(logicalName = "baseYmd", physicalName = "base_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_ymd;

    @ElDtoField(logicalName = "salryCd", physicalName = "salry_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_cd;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "docId", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "appYrmon", physicalName = "app_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_yrmon;

    @ElDtoField(logicalName = "fretaxAmt", physicalName = "fretax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_amt;

    @ElDtoField(logicalName = "calcBase2", physicalName = "calc_base_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calc_base_2;

    @ElDtoField(logicalName = "salry_bank", physicalName = "salry_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "depstr", physicalName = "depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr;

    @ElDtoField(logicalName = "savng_shape_dedct", physicalName = "savng_shape_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String savng_shape_dedct;

    @ElDtoField(logicalName = "tot_bankaccnt_no", physicalName = "tot_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bankaccnt_no;

    @ElDtoField(logicalName = "own_driv_sub_pay", physicalName = "own_driv_sub_pay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String own_driv_sub_pay;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "req_typ")
    public String getReq_typ(){
        return req_typ;
    }

    @ElVoField(physicalName = "req_typ")
    public void setReq_typ(String req_typ){
        this.req_typ = req_typ;
    }

    @ElVoField(physicalName = "retire_middle_cntfr_ymd")
    public String getRetire_middle_cntfr_ymd(){
        return retire_middle_cntfr_ymd;
    }

    @ElVoField(physicalName = "retire_middle_cntfr_ymd")
    public void setRetire_middle_cntfr_ymd(String retire_middle_cntfr_ymd){
        this.retire_middle_cntfr_ymd = retire_middle_cntfr_ymd;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @ElVoField(physicalName = "base_addr")
    public String getBase_addr(){
        return base_addr;
    }

    @ElVoField(physicalName = "base_addr")
    public void setBase_addr(String base_addr){
        this.base_addr = base_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public String getCmpy_postmt_no(){
        return cmpy_postmt_no;
    }

    @ElVoField(physicalName = "cmpy_postmt_no")
    public void setCmpy_postmt_no(String cmpy_postmt_no){
        this.cmpy_postmt_no = cmpy_postmt_no;
    }

    @ElVoField(physicalName = "cmpy_base_addr")
    public String getCmpy_base_addr(){
        return cmpy_base_addr;
    }

    @ElVoField(physicalName = "cmpy_base_addr")
    public void setCmpy_base_addr(String cmpy_base_addr){
        this.cmpy_base_addr = cmpy_base_addr;
    }

    @ElVoField(physicalName = "cmpy_detls_addr")
    public String getCmpy_detls_addr(){
        return cmpy_detls_addr;
    }

    @ElVoField(physicalName = "cmpy_detls_addr")
    public void setCmpy_detls_addr(String cmpy_detls_addr){
        this.cmpy_detls_addr = cmpy_detls_addr;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "retire_mny_cntfr_ymd")
    public String getRetire_mny_cntfr_ymd(){
        return retire_mny_cntfr_ymd;
    }

    @ElVoField(physicalName = "retire_mny_cntfr_ymd")
    public void setRetire_mny_cntfr_ymd(String retire_mny_cntfr_ymd){
        this.retire_mny_cntfr_ymd = retire_mny_cntfr_ymd;
    }

    @ElVoField(physicalName = "retire_incl_yn")
    public String getRetire_incl_yn(){
        return retire_incl_yn;
    }

    @ElVoField(physicalName = "retire_incl_yn")
    public void setRetire_incl_yn(String retire_incl_yn){
        this.retire_incl_yn = retire_incl_yn;
    }

    @ElVoField(physicalName = "psn_burdn")
    public String getPsn_burdn(){
        return psn_burdn;
    }

    @ElVoField(physicalName = "psn_burdn")
    public void setPsn_burdn(String psn_burdn){
        this.psn_burdn = psn_burdn;
    }

    @ElVoField(physicalName = "add_pay_yn")
    public String getAdd_pay_yn(){
        return add_pay_yn;
    }

    @ElVoField(physicalName = "add_pay_yn")
    public void setAdd_pay_yn(String add_pay_yn){
        this.add_pay_yn = add_pay_yn;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "docu_no")
    public String getDocu_no(){
        return docu_no;
    }

    @ElVoField(physicalName = "docu_no")
    public void setDocu_no(String docu_no){
        this.docu_no = docu_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "cole_yn")
    public String getCole_yn(){
        return cole_yn;
    }

    @ElVoField(physicalName = "cole_yn")
    public void setCole_yn(String cole_yn){
        this.cole_yn = cole_yn;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "init_indict_mp100_yn")
    public String getInit_indict_mp100_yn(){
        return init_indict_mp100_yn;
    }

    @ElVoField(physicalName = "init_indict_mp100_yn")
    public void setInit_indict_mp100_yn(String init_indict_mp100_yn){
        this.init_indict_mp100_yn = init_indict_mp100_yn;
    }

    @ElVoField(physicalName = "init_indict_mp70_yn")
    public String getInit_indict_mp70_yn(){
        return init_indict_mp70_yn;
    }

    @ElVoField(physicalName = "init_indict_mp70_yn")
    public void setInit_indict_mp70_yn(String init_indict_mp70_yn){
        this.init_indict_mp70_yn = init_indict_mp70_yn;
    }

    @ElVoField(physicalName = "init_indict_mp50_yn")
    public String getInit_indict_mp50_yn(){
        return init_indict_mp50_yn;
    }

    @ElVoField(physicalName = "init_indict_mp50_yn")
    public void setInit_indict_mp50_yn(String init_indict_mp50_yn){
        this.init_indict_mp50_yn = init_indict_mp50_yn;
    }

    @ElVoField(physicalName = "init_indict_mp30_yn")
    public String getInit_indict_mp30_yn(){
        return init_indict_mp30_yn;
    }

    @ElVoField(physicalName = "init_indict_mp30_yn")
    public void setInit_indict_mp30_yn(String init_indict_mp30_yn){
        this.init_indict_mp30_yn = init_indict_mp30_yn;
    }

    @ElVoField(physicalName = "init_indict_retireamt_yn")
    public String getInit_indict_retireamt_yn(){
        return init_indict_retireamt_yn;
    }

    @ElVoField(physicalName = "init_indict_retireamt_yn")
    public void setInit_indict_retireamt_yn(String init_indict_retireamt_yn){
        this.init_indict_retireamt_yn = init_indict_retireamt_yn;
    }

    @ElVoField(physicalName = "init_indict_etc_yn")
    public String getInit_indict_etc_yn(){
        return init_indict_etc_yn;
    }

    @ElVoField(physicalName = "init_indict_etc_yn")
    public void setInit_indict_etc_yn(String init_indict_etc_yn){
        this.init_indict_etc_yn = init_indict_etc_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp100_yn")
    public String getApart_indict_mp100_yn(){
        return apart_indict_mp100_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp100_yn")
    public void setApart_indict_mp100_yn(String apart_indict_mp100_yn){
        this.apart_indict_mp100_yn = apart_indict_mp100_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp70_yn")
    public String getApart_indict_mp70_yn(){
        return apart_indict_mp70_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp70_yn")
    public void setApart_indict_mp70_yn(String apart_indict_mp70_yn){
        this.apart_indict_mp70_yn = apart_indict_mp70_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp50_yn")
    public String getApart_indict_mp50_yn(){
        return apart_indict_mp50_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp50_yn")
    public void setApart_indict_mp50_yn(String apart_indict_mp50_yn){
        this.apart_indict_mp50_yn = apart_indict_mp50_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp30_yn")
    public String getApart_indict_mp30_yn(){
        return apart_indict_mp30_yn;
    }

    @ElVoField(physicalName = "apart_indict_mp30_yn")
    public void setApart_indict_mp30_yn(String apart_indict_mp30_yn){
        this.apart_indict_mp30_yn = apart_indict_mp30_yn;
    }

    @ElVoField(physicalName = "apart_indict_retireamt_yn")
    public String getApart_indict_retireamt_yn(){
        return apart_indict_retireamt_yn;
    }

    @ElVoField(physicalName = "apart_indict_retireamt_yn")
    public void setApart_indict_retireamt_yn(String apart_indict_retireamt_yn){
        this.apart_indict_retireamt_yn = apart_indict_retireamt_yn;
    }

    @ElVoField(physicalName = "apart_indict_etc_yn")
    public String getApart_indict_etc_yn(){
        return apart_indict_etc_yn;
    }

    @ElVoField(physicalName = "apart_indict_etc_yn")
    public void setApart_indict_etc_yn(String apart_indict_etc_yn){
        this.apart_indict_etc_yn = apart_indict_etc_yn;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }

    @ElVoField(physicalName = "req_typ_nm")
    public String getReq_typ_nm(){
        return req_typ_nm;
    }

    @ElVoField(physicalName = "req_typ_nm")
    public void setReq_typ_nm(String req_typ_nm){
        this.req_typ_nm = req_typ_nm;
    }

    @ElVoField(physicalName = "addr_postmt_no")
    public String getAddr_postmt_no(){
        return addr_postmt_no;
    }

    @ElVoField(physicalName = "addr_postmt_no")
    public void setAddr_postmt_no(String addr_postmt_no){
        this.addr_postmt_no = addr_postmt_no;
    }

    @ElVoField(physicalName = "addr_base")
    public String getAddr_base(){
        return addr_base;
    }

    @ElVoField(physicalName = "addr_base")
    public void setAddr_base(String addr_base){
        this.addr_base = addr_base;
    }

    @ElVoField(physicalName = "addr_detls")
    public String getAddr_detls(){
        return addr_detls;
    }

    @ElVoField(physicalName = "addr_detls")
    public void setAddr_detls(String addr_detls){
        this.addr_detls = addr_detls;
    }

    @ElVoField(physicalName = "add_pay_amt")
    public String getAdd_pay_amt(){
        return add_pay_amt;
    }

    @ElVoField(physicalName = "add_pay_amt")
    public void setAdd_pay_amt(String add_pay_amt){
        this.add_pay_amt = add_pay_amt;
    }

    @ElVoField(physicalName = "retonum")
    public String getRetonum(){
        return retonum;
    }

    @ElVoField(physicalName = "retonum")
    public void setRetonum(String retonum){
        this.retonum = retonum;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "calc_base")
    public String getCalc_base(){
        return calc_base;
    }

    @ElVoField(physicalName = "calc_base")
    public void setCalc_base(String calc_base){
        this.calc_base = calc_base;
    }

    @ElVoField(physicalName = "base_ymd")
    public String getBase_ymd(){
        return base_ymd;
    }

    @ElVoField(physicalName = "base_ymd")
    public void setBase_ymd(String base_ymd){
        this.base_ymd = base_ymd;
    }

    @ElVoField(physicalName = "salry_cd")
    public String getSalry_cd(){
        return salry_cd;
    }

    @ElVoField(physicalName = "salry_cd")
    public void setSalry_cd(String salry_cd){
        this.salry_cd = salry_cd;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "app_yrmon")
    public String getApp_yrmon(){
        return app_yrmon;
    }

    @ElVoField(physicalName = "app_yrmon")
    public void setApp_yrmon(String app_yrmon){
        this.app_yrmon = app_yrmon;
    }

    @ElVoField(physicalName = "fretax_amt")
    public String getFretax_amt(){
        return fretax_amt;
    }

    @ElVoField(physicalName = "fretax_amt")
    public void setFretax_amt(String fretax_amt){
        this.fretax_amt = fretax_amt;
    }

    @ElVoField(physicalName = "calc_base_2")
    public String getCalc_base_2(){
        return calc_base_2;
    }

    @ElVoField(physicalName = "calc_base_2")
    public void setCalc_base_2(String calc_base_2){
        this.calc_base_2 = calc_base_2;
    }

    @ElVoField(physicalName = "salry_bank")
    public String getSalry_bank(){
        return salry_bank;
    }

    @ElVoField(physicalName = "salry_bank")
    public void setSalry_bank(String salry_bank){
        this.salry_bank = salry_bank;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr")
    public String getDepstr(){
        return depstr;
    }

    @ElVoField(physicalName = "depstr")
    public void setDepstr(String depstr){
        this.depstr = depstr;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public String getSavng_shape_dedct(){
        return savng_shape_dedct;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public void setSavng_shape_dedct(String savng_shape_dedct){
        this.savng_shape_dedct = savng_shape_dedct;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public String getTot_bankaccnt_no(){
        return tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public void setTot_bankaccnt_no(String tot_bankaccnt_no){
        this.tot_bankaccnt_no = tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public String getOwn_driv_sub_pay(){
        return own_driv_sub_pay;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public void setOwn_driv_sub_pay(String own_driv_sub_pay){
        this.own_driv_sub_pay = own_driv_sub_pay;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyAnutyInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("req_typ").append("=").append(req_typ).append(",");
        sb.append("retire_middle_cntfr_ymd").append("=").append(retire_middle_cntfr_ymd).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("base_addr").append("=").append(base_addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("cmpy_postmt_no").append("=").append(cmpy_postmt_no).append(",");
        sb.append("cmpy_base_addr").append("=").append(cmpy_base_addr).append(",");
        sb.append("cmpy_detls_addr").append("=").append(cmpy_detls_addr).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("retire_mny_cntfr_ymd").append("=").append(retire_mny_cntfr_ymd).append(",");
        sb.append("retire_incl_yn").append("=").append(retire_incl_yn).append(",");
        sb.append("psn_burdn").append("=").append(psn_burdn).append(",");
        sb.append("add_pay_yn").append("=").append(add_pay_yn).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("docu_no").append("=").append(docu_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("cole_yn").append("=").append(cole_yn).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("init_indict_mp100_yn").append("=").append(init_indict_mp100_yn).append(",");
        sb.append("init_indict_mp70_yn").append("=").append(init_indict_mp70_yn).append(",");
        sb.append("init_indict_mp50_yn").append("=").append(init_indict_mp50_yn).append(",");
        sb.append("init_indict_mp30_yn").append("=").append(init_indict_mp30_yn).append(",");
        sb.append("init_indict_retireamt_yn").append("=").append(init_indict_retireamt_yn).append(",");
        sb.append("init_indict_etc_yn").append("=").append(init_indict_etc_yn).append(",");
        sb.append("apart_indict_mp100_yn").append("=").append(apart_indict_mp100_yn).append(",");
        sb.append("apart_indict_mp70_yn").append("=").append(apart_indict_mp70_yn).append(",");
        sb.append("apart_indict_mp50_yn").append("=").append(apart_indict_mp50_yn).append(",");
        sb.append("apart_indict_mp30_yn").append("=").append(apart_indict_mp30_yn).append(",");
        sb.append("apart_indict_retireamt_yn").append("=").append(apart_indict_retireamt_yn).append(",");
        sb.append("apart_indict_etc_yn").append("=").append(apart_indict_etc_yn).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("req_typ_nm").append("=").append(req_typ_nm).append(",");
        sb.append("addr_postmt_no").append("=").append(addr_postmt_no).append(",");
        sb.append("addr_base").append("=").append(addr_base).append(",");
        sb.append("addr_detls").append("=").append(addr_detls).append(",");
        sb.append("add_pay_amt").append("=").append(add_pay_amt).append(",");
        sb.append("retonum").append("=").append(retonum).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("calc_base").append("=").append(calc_base).append(",");
        sb.append("base_ymd").append("=").append(base_ymd).append(",");
        sb.append("salry_cd").append("=").append(salry_cd).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("app_yrmon").append("=").append(app_yrmon).append(",");
        sb.append("fretax_amt").append("=").append(fretax_amt).append(",");
        sb.append("calc_base_2").append("=").append(calc_base_2).append(",");
        sb.append("salry_bank").append("=").append(salry_bank).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr").append("=").append(depstr).append(",");
        sb.append("savng_shape_dedct").append("=").append(savng_shape_dedct).append(",");
        sb.append("tot_bankaccnt_no").append("=").append(tot_bankaccnt_no).append(",");
        sb.append("own_driv_sub_pay").append("=").append(own_driv_sub_pay).append(",");
        sb.append("info_cd").append("=").append(info_cd);
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
