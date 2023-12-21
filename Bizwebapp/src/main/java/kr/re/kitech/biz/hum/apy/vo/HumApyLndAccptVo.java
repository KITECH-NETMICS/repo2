package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴복직신청 승인처리 후 insert 정보")
public class HumApyLndAccptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyLndAccptVo(){
    }

    @ElDtoField(logicalName = "appontNo", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "appontTyp", physicalName = "appont_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_typ;

    @ElDtoField(logicalName = "appontPrcsYmd", physicalName = "appont_prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_prcs_ymd;

    @ElDtoField(logicalName = "appontStartYmd", physicalName = "appont_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_start_ymd;

    @ElDtoField(logicalName = "appontClsYmd", physicalName = "appont_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_cls_ymd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "appontBefrDeptCd", physicalName = "appont_befr_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_dept_cd;

    @ElDtoField(logicalName = "appontBefrDeptNewYmd", physicalName = "appont_befr_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_dept_new_ymd;

    @ElDtoField(logicalName = "appontBefrOccugrpCd", physicalName = "appont_befr_occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_occugrp_cd;

    @ElDtoField(logicalName = "appontBefrOccutypCd", physicalName = "appont_befr_occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_occutyp_cd;

    @ElDtoField(logicalName = "appontBefrPosiCd", physicalName = "appont_befr_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_posi_cd;

    @ElDtoField(logicalName = "appontBefrCd", physicalName = "appont_befr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_cd;

    @ElDtoField(logicalName = "appontBefrJobCd", physicalName = "appont_befr_job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_job_cd;

    @ElDtoField(logicalName = "appontBefrJobClsf", physicalName = "appont_befr_job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_job_clsf;

    @ElDtoField(logicalName = "appontBefrWorkLand", physicalName = "appont_befr_work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_work_land;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "occugrpCd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "occutypCd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "dutyCd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;

    @ElDtoField(logicalName = "jobCd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;

    @ElDtoField(logicalName = "jobClsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "workLand", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land;

    @ElDtoField(logicalName = "appontResn", physicalName = "appont_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_resn;

    @ElDtoField(logicalName = "appontResnMnt", physicalName = "appont_resn_mnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_resn_mnt;

    @ElDtoField(logicalName = "apprvlCarerAnal", physicalName = "apprvl_carer_anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_carer_anal;

    @ElDtoField(logicalName = "cmittNm", physicalName = "cmitt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_nm;

    @ElDtoField(logicalName = "cmittDuty", physicalName = "cmitt_duty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_duty;

    @ElDtoField(logicalName = "largeExcptWorkNm", physicalName = "large_excpt_work_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String large_excpt_work_nm;

    @ElDtoField(logicalName = "estbNm", physicalName = "estb_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String estb_nm;

    @ElDtoField(logicalName = "dispatchLoc", physicalName = "dispatch_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_loc;

    @ElDtoField(logicalName = "appontPrcs", physicalName = "appont_prcs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_prcs;

    @ElDtoField(logicalName = "ofcaNo", physicalName = "ofca_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofca_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "refTab", physicalName = "ref_tab", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_tab;

    @ElDtoField(logicalName = "refData", physicalName = "ref_data", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_data;

    @ElDtoField(logicalName = "vendCd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }

    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "appont_typ")
    public String getAppont_typ(){
        return appont_typ;
    }

    @ElVoField(physicalName = "appont_typ")
    public void setAppont_typ(String appont_typ){
        this.appont_typ = appont_typ;
    }

    @ElVoField(physicalName = "appont_prcs_ymd")
    public String getAppont_prcs_ymd(){
        return appont_prcs_ymd;
    }

    @ElVoField(physicalName = "appont_prcs_ymd")
    public void setAppont_prcs_ymd(String appont_prcs_ymd){
        this.appont_prcs_ymd = appont_prcs_ymd;
    }

    @ElVoField(physicalName = "appont_start_ymd")
    public String getAppont_start_ymd(){
        return appont_start_ymd;
    }

    @ElVoField(physicalName = "appont_start_ymd")
    public void setAppont_start_ymd(String appont_start_ymd){
        this.appont_start_ymd = appont_start_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public String getAppont_cls_ymd(){
        return appont_cls_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public void setAppont_cls_ymd(String appont_cls_ymd){
        this.appont_cls_ymd = appont_cls_ymd;
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

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "appont_befr_dept_cd")
    public String getAppont_befr_dept_cd(){
        return appont_befr_dept_cd;
    }

    @ElVoField(physicalName = "appont_befr_dept_cd")
    public void setAppont_befr_dept_cd(String appont_befr_dept_cd){
        this.appont_befr_dept_cd = appont_befr_dept_cd;
    }

    @ElVoField(physicalName = "appont_befr_dept_new_ymd")
    public String getAppont_befr_dept_new_ymd(){
        return appont_befr_dept_new_ymd;
    }

    @ElVoField(physicalName = "appont_befr_dept_new_ymd")
    public void setAppont_befr_dept_new_ymd(String appont_befr_dept_new_ymd){
        this.appont_befr_dept_new_ymd = appont_befr_dept_new_ymd;
    }

    @ElVoField(physicalName = "appont_befr_occugrp_cd")
    public String getAppont_befr_occugrp_cd(){
        return appont_befr_occugrp_cd;
    }

    @ElVoField(physicalName = "appont_befr_occugrp_cd")
    public void setAppont_befr_occugrp_cd(String appont_befr_occugrp_cd){
        this.appont_befr_occugrp_cd = appont_befr_occugrp_cd;
    }

    @ElVoField(physicalName = "appont_befr_occutyp_cd")
    public String getAppont_befr_occutyp_cd(){
        return appont_befr_occutyp_cd;
    }

    @ElVoField(physicalName = "appont_befr_occutyp_cd")
    public void setAppont_befr_occutyp_cd(String appont_befr_occutyp_cd){
        this.appont_befr_occutyp_cd = appont_befr_occutyp_cd;
    }

    @ElVoField(physicalName = "appont_befr_posi_cd")
    public String getAppont_befr_posi_cd(){
        return appont_befr_posi_cd;
    }

    @ElVoField(physicalName = "appont_befr_posi_cd")
    public void setAppont_befr_posi_cd(String appont_befr_posi_cd){
        this.appont_befr_posi_cd = appont_befr_posi_cd;
    }

    @ElVoField(physicalName = "appont_befr_cd")
    public String getAppont_befr_cd(){
        return appont_befr_cd;
    }

    @ElVoField(physicalName = "appont_befr_cd")
    public void setAppont_befr_cd(String appont_befr_cd){
        this.appont_befr_cd = appont_befr_cd;
    }

    @ElVoField(physicalName = "appont_befr_job_cd")
    public String getAppont_befr_job_cd(){
        return appont_befr_job_cd;
    }

    @ElVoField(physicalName = "appont_befr_job_cd")
    public void setAppont_befr_job_cd(String appont_befr_job_cd){
        this.appont_befr_job_cd = appont_befr_job_cd;
    }

    @ElVoField(physicalName = "appont_befr_job_clsf")
    public String getAppont_befr_job_clsf(){
        return appont_befr_job_clsf;
    }

    @ElVoField(physicalName = "appont_befr_job_clsf")
    public void setAppont_befr_job_clsf(String appont_befr_job_clsf){
        this.appont_befr_job_clsf = appont_befr_job_clsf;
    }

    @ElVoField(physicalName = "appont_befr_work_land")
    public String getAppont_befr_work_land(){
        return appont_befr_work_land;
    }

    @ElVoField(physicalName = "appont_befr_work_land")
    public void setAppont_befr_work_land(String appont_befr_work_land){
        this.appont_befr_work_land = appont_befr_work_land;
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

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        return occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        return duty_cd;
    }

    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "work_land")
    public String getWork_land(){
        return work_land;
    }

    @ElVoField(physicalName = "work_land")
    public void setWork_land(String work_land){
        this.work_land = work_land;
    }

    @ElVoField(physicalName = "appont_resn")
    public String getAppont_resn(){
        return appont_resn;
    }

    @ElVoField(physicalName = "appont_resn")
    public void setAppont_resn(String appont_resn){
        this.appont_resn = appont_resn;
    }

    @ElVoField(physicalName = "appont_resn_mnt")
    public String getAppont_resn_mnt(){
        return appont_resn_mnt;
    }

    @ElVoField(physicalName = "appont_resn_mnt")
    public void setAppont_resn_mnt(String appont_resn_mnt){
        this.appont_resn_mnt = appont_resn_mnt;
    }

    @ElVoField(physicalName = "apprvl_carer_anal")
    public String getApprvl_carer_anal(){
        return apprvl_carer_anal;
    }

    @ElVoField(physicalName = "apprvl_carer_anal")
    public void setApprvl_carer_anal(String apprvl_carer_anal){
        this.apprvl_carer_anal = apprvl_carer_anal;
    }

    @ElVoField(physicalName = "cmitt_nm")
    public String getCmitt_nm(){
        return cmitt_nm;
    }

    @ElVoField(physicalName = "cmitt_nm")
    public void setCmitt_nm(String cmitt_nm){
        this.cmitt_nm = cmitt_nm;
    }

    @ElVoField(physicalName = "cmitt_duty")
    public String getCmitt_duty(){
        return cmitt_duty;
    }

    @ElVoField(physicalName = "cmitt_duty")
    public void setCmitt_duty(String cmitt_duty){
        this.cmitt_duty = cmitt_duty;
    }

    @ElVoField(physicalName = "large_excpt_work_nm")
    public String getLarge_excpt_work_nm(){
        return large_excpt_work_nm;
    }

    @ElVoField(physicalName = "large_excpt_work_nm")
    public void setLarge_excpt_work_nm(String large_excpt_work_nm){
        this.large_excpt_work_nm = large_excpt_work_nm;
    }

    @ElVoField(physicalName = "estb_nm")
    public String getEstb_nm(){
        return estb_nm;
    }

    @ElVoField(physicalName = "estb_nm")
    public void setEstb_nm(String estb_nm){
        this.estb_nm = estb_nm;
    }

    @ElVoField(physicalName = "dispatch_loc")
    public String getDispatch_loc(){
        return dispatch_loc;
    }

    @ElVoField(physicalName = "dispatch_loc")
    public void setDispatch_loc(String dispatch_loc){
        this.dispatch_loc = dispatch_loc;
    }

    @ElVoField(physicalName = "appont_prcs")
    public String getAppont_prcs(){
        return appont_prcs;
    }

    @ElVoField(physicalName = "appont_prcs")
    public void setAppont_prcs(String appont_prcs){
        this.appont_prcs = appont_prcs;
    }

    @ElVoField(physicalName = "ofca_no")
    public String getOfca_no(){
        return ofca_no;
    }

    @ElVoField(physicalName = "ofca_no")
    public void setOfca_no(String ofca_no){
        this.ofca_no = ofca_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "ref_tab")
    public String getRef_tab(){
        return ref_tab;
    }

    @ElVoField(physicalName = "ref_tab")
    public void setRef_tab(String ref_tab){
        this.ref_tab = ref_tab;
    }

    @ElVoField(physicalName = "ref_data")
    public String getRef_data(){
        return ref_data;
    }

    @ElVoField(physicalName = "ref_data")
    public void setRef_data(String ref_data){
        this.ref_data = ref_data;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyLndAccptVo [");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("appont_typ").append("=").append(appont_typ).append(",");
        sb.append("appont_prcs_ymd").append("=").append(appont_prcs_ymd).append(",");
        sb.append("appont_start_ymd").append("=").append(appont_start_ymd).append(",");
        sb.append("appont_cls_ymd").append("=").append(appont_cls_ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("appont_befr_dept_cd").append("=").append(appont_befr_dept_cd).append(",");
        sb.append("appont_befr_dept_new_ymd").append("=").append(appont_befr_dept_new_ymd).append(",");
        sb.append("appont_befr_occugrp_cd").append("=").append(appont_befr_occugrp_cd).append(",");
        sb.append("appont_befr_occutyp_cd").append("=").append(appont_befr_occutyp_cd).append(",");
        sb.append("appont_befr_posi_cd").append("=").append(appont_befr_posi_cd).append(",");
        sb.append("appont_befr_cd").append("=").append(appont_befr_cd).append(",");
        sb.append("appont_befr_job_cd").append("=").append(appont_befr_job_cd).append(",");
        sb.append("appont_befr_job_clsf").append("=").append(appont_befr_job_clsf).append(",");
        sb.append("appont_befr_work_land").append("=").append(appont_befr_work_land).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("duty_cd").append("=").append(duty_cd).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("appont_resn").append("=").append(appont_resn).append(",");
        sb.append("appont_resn_mnt").append("=").append(appont_resn_mnt).append(",");
        sb.append("apprvl_carer_anal").append("=").append(apprvl_carer_anal).append(",");
        sb.append("cmitt_nm").append("=").append(cmitt_nm).append(",");
        sb.append("cmitt_duty").append("=").append(cmitt_duty).append(",");
        sb.append("large_excpt_work_nm").append("=").append(large_excpt_work_nm).append(",");
        sb.append("estb_nm").append("=").append(estb_nm).append(",");
        sb.append("dispatch_loc").append("=").append(dispatch_loc).append(",");
        sb.append("appont_prcs").append("=").append(appont_prcs).append(",");
        sb.append("ofca_no").append("=").append(ofca_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("ref_tab").append("=").append(ref_tab).append(",");
        sb.append("ref_data").append("=").append(ref_data).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no);
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
