package kr.re.kitech.biz.sup.edu.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducInfoExp")
public class SptTechEducInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTechEducInfoVo(){
    }

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "regionCentr", physicalName = "region_centr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_centr;

    @ElDtoField(logicalName = "rspnsSyspayno", physicalName = "rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_syspayno;

    @ElDtoField(logicalName = "rspnsEmpno", physicalName = "rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_empno;

    @ElDtoField(logicalName = "rspnsNm", physicalName = "rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_nm;

    @ElDtoField(logicalName = "educStartYmdSt", physicalName = "educ_start_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_start_ymd_st;

    @ElDtoField(logicalName = "educStartYmdEd", physicalName = "educ_start_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_start_ymd_ed;

    @ElDtoField(logicalName = "educProcsLike", physicalName = "educ_procs_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_procs_like;

    @ElDtoField(logicalName = "cmpyNmKrcharLike", physicalName = "cmpy_nm_krchar_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar_like;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "contributeDeptNm", physicalName = "contribute_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contribute_dept_nm;

    @ElDtoField(logicalName = "regionCentrNm", physicalName = "region_centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_centr_nm;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "educProcs", physicalName = "educ_procs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_procs;

    @ElDtoField(logicalName = "educStartYmd", physicalName = "educ_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_start_ymd;

    @ElDtoField(logicalName = "educEndYmd", physicalName = "educ_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_end_ymd;

    @ElDtoField(logicalName = "educPlce", physicalName = "educ_plce", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_plce;

    @ElDtoField(logicalName = "attnceQty", physicalName = "attnce_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_qty;

    @ElDtoField(logicalName = "attachFileNo01", physicalName = "attach_file_no_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_01;

    @ElDtoField(logicalName = "attachFileNo02", physicalName = "attach_file_no_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_02;

    @ElDtoField(logicalName = "prcsState", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "prcsStateNm", physicalName = "prcs_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state_nm;

    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "attnceNm", physicalName = "attnce_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_nm;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "sendYmd", physicalName = "send_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_ymd;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "reqdAmt", physicalName = "reqd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqd_amt;

    @ElDtoField(logicalName = "educGrd", physicalName = "educ_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_grd;

    @ElDtoField(logicalName = "educGoal", physicalName = "educ_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_goal;

    @ElDtoField(logicalName = "educGoalNm", physicalName = "educ_goal_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_goal_nm;

    @ElDtoField(logicalName = "educPurp", physicalName = "educ_purp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_purp;

    @ElDtoField(logicalName = "educForm", physicalName = "educ_form", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_form;

    @ElDtoField(logicalName = "regstEmpno", physicalName = "regst_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_empno;

    @ElDtoField(logicalName = "regstNm", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "contributeNm", physicalName = "contribute_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contribute_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "rejectRmk", physicalName = "reject_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reject_rmk;

    @ElDtoField(logicalName = "educGrdNm", physicalName = "educ_grd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_grd_nm;

    @ElDtoField(logicalName = "prcsYmd", physicalName = "prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_ymd;

    @ElDtoField(logicalName = "prcsSyspayno", physicalName = "prcs_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_syspayno;

    @ElDtoField(logicalName = "regstPsnEmail", physicalName = "regst_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_email;

    @ElDtoField(logicalName = "rspnsEmail", physicalName = "rspns_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_email;

    @ElDtoField(logicalName = "regstPsnNm", physicalName = "regst_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_nm;
    
    @ElDtoField(logicalName = "findClsf", physicalName = "find_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String find_clsf;
  
    @ElDtoField(logicalName = "educPurpNm", physicalName = "educ_purp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_purp_nm;
  
    @ElDtoField(logicalName = "educFormNm", physicalName = "educ_form_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_form_nm;
    
    @ElDtoField(logicalName = "reqdAmtSum", physicalName = "reqd_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqd_amt_sum;
    
    @ElDtoField(logicalName = "contributeRtSum", physicalName = "contribute_rt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contribute_rt_sum;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "attachFileNo01Img", physicalName = "attach_file_no_01_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_01_img;

    @ElDtoField(logicalName = "attachFileNo02Img", physicalName = "attach_file_no_02_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_02_img;
    
    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "region_centr")
    public String getRegion_centr(){
        return region_centr;
    }

    @ElVoField(physicalName = "region_centr")
    public void setRegion_centr(String region_centr){
        this.region_centr = region_centr;
    }

    @ElVoField(physicalName = "rspns_syspayno")
    public String getRspns_syspayno(){
        return rspns_syspayno;
    }

    @ElVoField(physicalName = "rspns_syspayno")
    public void setRspns_syspayno(String rspns_syspayno){
        this.rspns_syspayno = rspns_syspayno;
    }

    @ElVoField(physicalName = "rspns_empno")
    public String getRspns_empno(){
        return rspns_empno;
    }

    @ElVoField(physicalName = "rspns_empno")
    public void setRspns_empno(String rspns_empno){
        this.rspns_empno = rspns_empno;
    }

    @ElVoField(physicalName = "rspns_nm")
    public String getRspns_nm(){
        return rspns_nm;
    }

    @ElVoField(physicalName = "rspns_nm")
    public void setRspns_nm(String rspns_nm){
        this.rspns_nm = rspns_nm;
    }

    @ElVoField(physicalName = "educ_start_ymd_st")
    public String getEduc_start_ymd_st(){
        return educ_start_ymd_st;
    }

    @ElVoField(physicalName = "educ_start_ymd_st")
    public void setEduc_start_ymd_st(String educ_start_ymd_st){
        this.educ_start_ymd_st = educ_start_ymd_st;
    }

    @ElVoField(physicalName = "educ_start_ymd_ed")
    public String getEduc_start_ymd_ed(){
        return educ_start_ymd_ed;
    }

    @ElVoField(physicalName = "educ_start_ymd_ed")
    public void setEduc_start_ymd_ed(String educ_start_ymd_ed){
        this.educ_start_ymd_ed = educ_start_ymd_ed;
    }

    @ElVoField(physicalName = "educ_procs_like")
    public String getEduc_procs_like(){
        return educ_procs_like;
    }

    @ElVoField(physicalName = "educ_procs_like")
    public void setEduc_procs_like(String educ_procs_like){
        this.educ_procs_like = educ_procs_like;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar_like")
    public String getCmpy_nm_krchar_like(){
        return cmpy_nm_krchar_like;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar_like")
    public void setCmpy_nm_krchar_like(String cmpy_nm_krchar_like){
        this.cmpy_nm_krchar_like = cmpy_nm_krchar_like;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "contribute_dept_nm")
    public String getContribute_dept_nm(){
        return contribute_dept_nm;
    }

    @ElVoField(physicalName = "contribute_dept_nm")
    public void setContribute_dept_nm(String contribute_dept_nm){
        this.contribute_dept_nm = contribute_dept_nm;
    }

    @ElVoField(physicalName = "region_centr_nm")
    public String getRegion_centr_nm(){
        return region_centr_nm;
    }

    @ElVoField(physicalName = "region_centr_nm")
    public void setRegion_centr_nm(String region_centr_nm){
        this.region_centr_nm = region_centr_nm;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "educ_procs")
    public String getEduc_procs(){
        return educ_procs;
    }

    @ElVoField(physicalName = "educ_procs")
    public void setEduc_procs(String educ_procs){
        this.educ_procs = educ_procs;
    }

    @ElVoField(physicalName = "educ_start_ymd")
    public String getEduc_start_ymd(){
        return educ_start_ymd;
    }

    @ElVoField(physicalName = "educ_start_ymd")
    public void setEduc_start_ymd(String educ_start_ymd){
        this.educ_start_ymd = educ_start_ymd;
    }

    @ElVoField(physicalName = "educ_end_ymd")
    public String getEduc_end_ymd(){
        return educ_end_ymd;
    }

    @ElVoField(physicalName = "educ_end_ymd")
    public void setEduc_end_ymd(String educ_end_ymd){
        this.educ_end_ymd = educ_end_ymd;
    }

    @ElVoField(physicalName = "educ_plce")
    public String getEduc_plce(){
        return educ_plce;
    }

    @ElVoField(physicalName = "educ_plce")
    public void setEduc_plce(String educ_plce){
        this.educ_plce = educ_plce;
    }

    @ElVoField(physicalName = "attnce_qty")
    public String getAttnce_qty(){
        return attnce_qty;
    }

    @ElVoField(physicalName = "attnce_qty")
    public void setAttnce_qty(String attnce_qty){
        this.attnce_qty = attnce_qty;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public String getAttach_file_no_01(){
        return attach_file_no_01;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public void setAttach_file_no_01(String attach_file_no_01){
        this.attach_file_no_01 = attach_file_no_01;
    }

    @ElVoField(physicalName = "attach_file_no_02")
    public String getAttach_file_no_02(){
        return attach_file_no_02;
    }

    @ElVoField(physicalName = "attach_file_no_02")
    public void setAttach_file_no_02(String attach_file_no_02){
        this.attach_file_no_02 = attach_file_no_02;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public String getPrcs_state_nm(){
        return prcs_state_nm;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public void setPrcs_state_nm(String prcs_state_nm){
        this.prcs_state_nm = prcs_state_nm;
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

    @ElVoField(physicalName = "attnce_nm")
    public String getAttnce_nm(){
        return attnce_nm;
    }

    @ElVoField(physicalName = "attnce_nm")
    public void setAttnce_nm(String attnce_nm){
        this.attnce_nm = attnce_nm;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "send_ymd")
    public String getSend_ymd(){
        return send_ymd;
    }

    @ElVoField(physicalName = "send_ymd")
    public void setSend_ymd(String send_ymd){
        this.send_ymd = send_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "reqd_amt")
    public String getReqd_amt(){
        return reqd_amt;
    }

    @ElVoField(physicalName = "reqd_amt")
    public void setReqd_amt(String reqd_amt){
        this.reqd_amt = reqd_amt;
    }

    @ElVoField(physicalName = "educ_grd")
    public String getEduc_grd(){
        return educ_grd;
    }

    @ElVoField(physicalName = "educ_grd")
    public void setEduc_grd(String educ_grd){
        this.educ_grd = educ_grd;
    }

    @ElVoField(physicalName = "educ_goal")
    public String getEduc_goal(){
        return educ_goal;
    }

    @ElVoField(physicalName = "educ_goal")
    public void setEduc_goal(String educ_goal){
        this.educ_goal = educ_goal;
    }

    @ElVoField(physicalName = "educ_goal_nm")
    public String getEduc_goal_nm(){
        return educ_goal_nm;
    }

    @ElVoField(physicalName = "educ_goal_nm")
    public void setEduc_goal_nm(String educ_goal_nm){
        this.educ_goal_nm = educ_goal_nm;
    }

    @ElVoField(physicalName = "educ_purp")
    public String getEduc_purp(){
        return educ_purp;
    }

    @ElVoField(physicalName = "educ_purp")
    public void setEduc_purp(String educ_purp){
        this.educ_purp = educ_purp;
    }

    @ElVoField(physicalName = "educ_form")
    public String getEduc_form(){
        return educ_form;
    }

    @ElVoField(physicalName = "educ_form")
    public void setEduc_form(String educ_form){
        this.educ_form = educ_form;
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

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "contribute_nm")
    public String getContribute_nm(){
        return contribute_nm;
    }

    @ElVoField(physicalName = "contribute_nm")
    public void setContribute_nm(String contribute_nm){
        this.contribute_nm = contribute_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "reject_rmk")
    public String getReject_rmk(){
        return reject_rmk;
    }

    @ElVoField(physicalName = "reject_rmk")
    public void setReject_rmk(String reject_rmk){
        this.reject_rmk = reject_rmk;
    }

    @ElVoField(physicalName = "educ_grd_nm")
    public String getEduc_grd_nm(){
        return educ_grd_nm;
    }

    @ElVoField(physicalName = "educ_grd_nm")
    public void setEduc_grd_nm(String educ_grd_nm){
        this.educ_grd_nm = educ_grd_nm;
    }

    @ElVoField(physicalName = "prcs_ymd")
    public String getPrcs_ymd(){
        return prcs_ymd;
    }

    @ElVoField(physicalName = "prcs_ymd")
    public void setPrcs_ymd(String prcs_ymd){
        this.prcs_ymd = prcs_ymd;
    }

    @ElVoField(physicalName = "prcs_syspayno")
    public String getPrcs_syspayno(){
        return prcs_syspayno;
    }

    @ElVoField(physicalName = "prcs_syspayno")
    public void setPrcs_syspayno(String prcs_syspayno){
        this.prcs_syspayno = prcs_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_email")
    public String getRegst_psn_email(){
        return regst_psn_email;
    }

    @ElVoField(physicalName = "regst_psn_email")
    public void setRegst_psn_email(String regst_psn_email){
        this.regst_psn_email = regst_psn_email;
    }

    @ElVoField(physicalName = "rspns_email")
    public String getRspns_email(){
        return rspns_email;
    }

    @ElVoField(physicalName = "rspns_email")
    public void setRspns_email(String rspns_email){
        this.rspns_email = rspns_email;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public String getRegst_psn_nm(){
        return regst_psn_nm;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public void setRegst_psn_nm(String regst_psn_nm){
        this.regst_psn_nm = regst_psn_nm;
    }
    
    @ElVoField(physicalName = "find_clsf")
    public String getFind_clsf(){
    	return find_clsf;
    }
    
    @ElVoField(physicalName = "find_clsf")
    public void setFind_clsf(String find_clsf){
    	this.find_clsf = find_clsf;
    }
  
    @ElVoField(physicalName = "educ_purp_nm")
    public String getEduc_purp_nm(){
        return educ_purp_nm;
    }
  
    @ElVoField(physicalName = "educ_purp_nm")
    public void setEduc_purp_nm(String educ_purp_nm){
        this.educ_purp_nm = educ_purp_nm;
    }
  
    @ElVoField(physicalName = "educ_form_nm")
    public String getEduc_form_nm(){
        return educ_form_nm;
    }
  
    @ElVoField(physicalName = "educ_form_nm")
    public void setEduc_form_nm(String educ_form_nm){
        this.educ_form_nm = educ_form_nm;
    }
    
    @ElVoField(physicalName = "reqd_amt_sum")
    public String getReqd_amt_sum(){
    	return reqd_amt_sum;
    }
    
    @ElVoField(physicalName = "reqd_amt_sum")
    public void setReqd_amt_sum(String reqd_amt_sum){
    	this.reqd_amt_sum = reqd_amt_sum;
    }
    
    @ElVoField(physicalName = "contribute_rt_sum")
    public String getContribute_rt_sum(){
    	return contribute_rt_sum;
    }
    
    @ElVoField(physicalName = "contribute_rt_sum")
    public void setContribute_rt_sum(String contribute_rt_sum){
    	this.contribute_rt_sum = contribute_rt_sum;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }
    
    @ElVoField(physicalName = "attach_file_no_01_img")
    public String getAttach_file_no_01_img(){
    	return attach_file_no_01_img;
    }
    
    @ElVoField(physicalName = "attach_file_no_01_img")
    public void setAttach_file_no_01_img(String attach_file_no_01_img){
    	this.attach_file_no_01_img = attach_file_no_01_img;
    }

    @ElVoField(physicalName = "attach_file_no_02_img")
    public String getAttach_file_no_02_img(){
        return attach_file_no_02_img;
    }

    @ElVoField(physicalName = "attach_file_no_02_img")
    public void setAttach_file_no_02_img(String attach_file_no_02_img){
    	this.attach_file_no_02_img = attach_file_no_02_img;
	}

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTechEducInfoVo [");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("region_centr").append("=").append(region_centr).append(",");
        sb.append("rspns_syspayno").append("=").append(rspns_syspayno).append(",");
        sb.append("rspns_empno").append("=").append(rspns_empno).append(",");
        sb.append("rspns_nm").append("=").append(rspns_nm).append(",");
        sb.append("educ_start_ymd_st").append("=").append(educ_start_ymd_st).append(",");
        sb.append("educ_start_ymd_ed").append("=").append(educ_start_ymd_ed).append(",");
        sb.append("educ_procs_like").append("=").append(educ_procs_like).append(",");
        sb.append("cmpy_nm_krchar_like").append("=").append(cmpy_nm_krchar_like).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("contribute_dept_nm").append("=").append(contribute_dept_nm).append(",");
        sb.append("region_centr_nm").append("=").append(region_centr_nm).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("educ_procs").append("=").append(educ_procs).append(",");
        sb.append("educ_start_ymd").append("=").append(educ_start_ymd).append(",");
        sb.append("educ_end_ymd").append("=").append(educ_end_ymd).append(",");
        sb.append("educ_plce").append("=").append(educ_plce).append(",");
        sb.append("attnce_qty").append("=").append(attnce_qty).append(",");
        sb.append("attach_file_no_01").append("=").append(attach_file_no_01).append(",");
        sb.append("attach_file_no_02").append("=").append(attach_file_no_02).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("prcs_state_nm").append("=").append(prcs_state_nm).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("attnce_nm").append("=").append(attnce_nm).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("send_ymd").append("=").append(send_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("reqd_amt").append("=").append(reqd_amt).append(",");
        sb.append("educ_grd").append("=").append(educ_grd).append(",");
        sb.append("educ_goal").append("=").append(educ_goal).append(",");
        sb.append("educ_goal_nm").append("=").append(educ_goal_nm).append(",");
        sb.append("educ_purp").append("=").append(educ_purp).append(",");
        sb.append("educ_form").append("=").append(educ_form).append(",");
        sb.append("regst_empno").append("=").append(regst_empno).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("contribute_nm").append("=").append(contribute_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("reject_rmk").append("=").append(reject_rmk).append(",");
        sb.append("educ_grd_nm").append("=").append(educ_grd_nm).append(",");
        sb.append("prcs_ymd").append("=").append(prcs_ymd).append(",");
        sb.append("prcs_syspayno").append("=").append(prcs_syspayno).append(",");
        sb.append("regst_psn_email").append("=").append(regst_psn_email).append(",");
        sb.append("rspns_email").append("=").append(rspns_email).append(",");
        sb.append("regst_psn_nm").append("=").append(regst_psn_nm).append(",");
        sb.append("find_clsf").append("=").append(find_clsf).append(",");
        sb.append("educ_purp_nm").append("=").append(educ_purp_nm).append(",");
      	sb.append("educ_form_nm").append("=").append(educ_form_nm).append(",");
        sb.append("reqd_amt_sum").append("=").append(reqd_amt_sum).append(",");
        sb.append("contribute_rt_sum").append("=").append(contribute_rt_sum).append(",");
        sb.append("attach_file_no_01_img").append("=").append(attach_file_no_01_img).append(",");
        sb.append("attach_file_no_02_img").append("=").append(attach_file_no_02_img).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
