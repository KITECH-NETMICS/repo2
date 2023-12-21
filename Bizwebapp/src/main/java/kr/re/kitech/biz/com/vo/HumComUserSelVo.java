package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사용자검색")
public class HumComUserSelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumComUserSelVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "성명(영문)", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "직군코드", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "직종코드", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "직종명", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직책코드", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;

    @ElDtoField(logicalName = "직책명", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "부서(팀)코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서(팀)신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "부서(팀)명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "부서장", physicalName = "depthed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed;

    @ElDtoField(logicalName = "부서장성명", physicalName = "depthed_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed_nm;

    @ElDtoField(logicalName = "본부코드", physicalName = "divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept;

    @ElDtoField(logicalName = "본부장명", physicalName = "divsn_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_rspns_nm;

    @ElDtoField(logicalName = "본부장시스템사번", physicalName = "divsn_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_rspns_syspayno;

    @ElDtoField(logicalName = "본부명", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "부서유형", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "부서유형명", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;

    @ElDtoField(logicalName = "입사일", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "퇴직일", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "직무구분", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "직무구분명", physicalName = "job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf_nm;

    @ElDtoField(logicalName = "직무명", physicalName = "job_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_nm;

    @ElDtoField(logicalName = "직무코드", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;

    @ElDtoField(logicalName = "조합원코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "과학기술인등록번호", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_regst_no;

    @ElDtoField(logicalName = "연구자등록번호", physicalName = "res_person_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_person_no;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "겸직여부", physicalName = "addpostn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addpostn_yn;

    @ElDtoField(logicalName = "근무구분", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "근무구분명", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "근무지", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land;

    @ElDtoField(logicalName = "근무지주소", physicalName = "work_land_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_addr;

    @ElDtoField(logicalName = "근무위치(직원검색팝업)", physicalName = "work_land_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_nm;

    @ElDtoField(logicalName = "근무지건물명", physicalName = "work_land_build_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_build_info;

    @ElDtoField(logicalName = "근무지우편번호", physicalName = "work_land_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_postmt_no;

    @ElDtoField(logicalName = "핸드폰", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "내선번호", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "팩스번호", physicalName = "fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fax_no;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "주소(상세포함)", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "담당업무(직원검색팝업)", physicalName = "unitjob", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unitjob;

    @ElDtoField(logicalName = "사용자구분", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "uid", physicalName = "uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String uid;

    @ElDtoField(logicalName = "auth_type", physicalName = "auth_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_type;

    @ElDtoField(logicalName = "부서명(팀소속일경우)", physicalName = "dept_level_4_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_level_4_cd;

    @ElDtoField(logicalName = "부서코드(팀소속일경우)", physicalName = "dept_level_4_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_level_4_new_ymd;

    @ElDtoField(logicalName = "부서신설일(팀소속일경우)", physicalName = "dept_level_4_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_level_4_nm;

    @ElDtoField(logicalName = "기본주소", physicalName = "addr_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_base;

    @ElDtoField(logicalName = "상세주소", physicalName = "addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_detls;

    @ElDtoField(logicalName = "우편번호", physicalName = "addr_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_postmt_no;

    @ElDtoField(logicalName = "근속기산일", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "집전화", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "과학기술연금여부", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "적립형공제(총구좌수)", physicalName = "tot_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bankaccnt_no;

    @ElDtoField(logicalName = "적립형태공제여부", physicalName = "savng_shape_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String savng_shape_dedct;

    @ElDtoField(logicalName = "과거 공제신청일", physicalName = "sema_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sema_mm;

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

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
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

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        return duty_cd;
    }

    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
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

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "depthed")
    public String getDepthed(){
        return depthed;
    }

    @ElVoField(physicalName = "depthed")
    public void setDepthed(String depthed){
        this.depthed = depthed;
    }

    @ElVoField(physicalName = "depthed_nm")
    public String getDepthed_nm(){
        return depthed_nm;
    }

    @ElVoField(physicalName = "depthed_nm")
    public void setDepthed_nm(String depthed_nm){
        this.depthed_nm = depthed_nm;
    }

    @ElVoField(physicalName = "divsn_dept")
    public String getDivsn_dept(){
        return divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept")
    public void setDivsn_dept(String divsn_dept){
        this.divsn_dept = divsn_dept;
    }

    @ElVoField(physicalName = "divsn_rspns_nm")
    public String getDivsn_rspns_nm(){
        return divsn_rspns_nm;
    }

    @ElVoField(physicalName = "divsn_rspns_nm")
    public void setDivsn_rspns_nm(String divsn_rspns_nm){
        this.divsn_rspns_nm = divsn_rspns_nm;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public String getDivsn_rspns_syspayno(){
        return divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public void setDivsn_rspns_syspayno(String divsn_rspns_syspayno){
        this.divsn_rspns_syspayno = divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public String getDept_typ_nm(){
        return dept_typ_nm;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public void setDept_typ_nm(String dept_typ_nm){
        this.dept_typ_nm = dept_typ_nm;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public String getRetire_ymd(){
        return retire_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public void setRetire_ymd(String retire_ymd){
        this.retire_ymd = retire_ymd;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public String getJob_clsf_nm(){
        return job_clsf_nm;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public void setJob_clsf_nm(String job_clsf_nm){
        this.job_clsf_nm = job_clsf_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public String getJob_nm(){
        return job_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public void setJob_nm(String job_nm){
        this.job_nm = job_nm;
    }

    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        return sci_tech_regst_no;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }

    @ElVoField(physicalName = "res_person_no")
    public String getRes_person_no(){
        return res_person_no;
    }

    @ElVoField(physicalName = "res_person_no")
    public void setRes_person_no(String res_person_no){
        this.res_person_no = res_person_no;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "addpostn_yn")
    public String getAddpostn_yn(){
        return addpostn_yn;
    }

    @ElVoField(physicalName = "addpostn_yn")
    public void setAddpostn_yn(String addpostn_yn){
        this.addpostn_yn = addpostn_yn;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "work_land")
    public String getWork_land(){
        return work_land;
    }

    @ElVoField(physicalName = "work_land")
    public void setWork_land(String work_land){
        this.work_land = work_land;
    }

    @ElVoField(physicalName = "work_land_addr")
    public String getWork_land_addr(){
        return work_land_addr;
    }

    @ElVoField(physicalName = "work_land_addr")
    public void setWork_land_addr(String work_land_addr){
        this.work_land_addr = work_land_addr;
    }

    @ElVoField(physicalName = "work_land_nm")
    public String getWork_land_nm(){
        return work_land_nm;
    }

    @ElVoField(physicalName = "work_land_nm")
    public void setWork_land_nm(String work_land_nm){
        this.work_land_nm = work_land_nm;
    }

    @ElVoField(physicalName = "work_land_build_info")
    public String getWork_land_build_info(){
        return work_land_build_info;
    }

    @ElVoField(physicalName = "work_land_build_info")
    public void setWork_land_build_info(String work_land_build_info){
        this.work_land_build_info = work_land_build_info;
    }

    @ElVoField(physicalName = "work_land_postmt_no")
    public String getWork_land_postmt_no(){
        return work_land_postmt_no;
    }

    @ElVoField(physicalName = "work_land_postmt_no")
    public void setWork_land_postmt_no(String work_land_postmt_no){
        this.work_land_postmt_no = work_land_postmt_no;
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

    @ElVoField(physicalName = "fax_no")
    public String getFax_no(){
        return fax_no;
    }

    @ElVoField(physicalName = "fax_no")
    public void setFax_no(String fax_no){
        this.fax_no = fax_no;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "unitjob")
    public String getUnitjob(){
        return unitjob;
    }

    @ElVoField(physicalName = "unitjob")
    public void setUnitjob(String unitjob){
        this.unitjob = unitjob;
    }

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
    }

    @ElVoField(physicalName = "uid")
    public String getUid(){
        return uid;
    }

    @ElVoField(physicalName = "uid")
    public void setUid(String uid){
        this.uid = uid;
    }

    @ElVoField(physicalName = "auth_type")
    public String getAuth_type(){
        return auth_type;
    }

    @ElVoField(physicalName = "auth_type")
    public void setAuth_type(String auth_type){
        this.auth_type = auth_type;
    }

    @ElVoField(physicalName = "dept_level_4_cd")
    public String getDept_level_4_cd(){
        return dept_level_4_cd;
    }

    @ElVoField(physicalName = "dept_level_4_cd")
    public void setDept_level_4_cd(String dept_level_4_cd){
        this.dept_level_4_cd = dept_level_4_cd;
    }

    @ElVoField(physicalName = "dept_level_4_new_ymd")
    public String getDept_level_4_new_ymd(){
        return dept_level_4_new_ymd;
    }

    @ElVoField(physicalName = "dept_level_4_new_ymd")
    public void setDept_level_4_new_ymd(String dept_level_4_new_ymd){
        this.dept_level_4_new_ymd = dept_level_4_new_ymd;
    }

    @ElVoField(physicalName = "dept_level_4_nm")
    public String getDept_level_4_nm(){
        return dept_level_4_nm;
    }

    @ElVoField(physicalName = "dept_level_4_nm")
    public void setDept_level_4_nm(String dept_level_4_nm){
        this.dept_level_4_nm = dept_level_4_nm;
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

    @ElVoField(physicalName = "addr_postmt_no")
    public String getAddr_postmt_no(){
        return addr_postmt_no;
    }

    @ElVoField(physicalName = "addr_postmt_no")
    public void setAddr_postmt_no(String addr_postmt_no){
        this.addr_postmt_no = addr_postmt_no;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public String getTot_bankaccnt_no(){
        return tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public void setTot_bankaccnt_no(String tot_bankaccnt_no){
        this.tot_bankaccnt_no = tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public String getSavng_shape_dedct(){
        return savng_shape_dedct;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public void setSavng_shape_dedct(String savng_shape_dedct){
        this.savng_shape_dedct = savng_shape_dedct;
    }

    @ElVoField(physicalName = "sema_mm")
    public String getSema_mm(){
        return sema_mm;
    }

    @ElVoField(physicalName = "sema_mm")
    public void setSema_mm(String sema_mm){
        this.sema_mm = sema_mm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumComUserSelVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_cd").append("=").append(duty_cd).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("depthed").append("=").append(depthed).append(",");
        sb.append("depthed_nm").append("=").append(depthed_nm).append(",");
        sb.append("divsn_dept").append("=").append(divsn_dept).append(",");
        sb.append("divsn_rspns_nm").append("=").append(divsn_rspns_nm).append(",");
        sb.append("divsn_rspns_syspayno").append("=").append(divsn_rspns_syspayno).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("job_clsf_nm").append("=").append(job_clsf_nm).append(",");
        sb.append("job_nm").append("=").append(job_nm).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
        sb.append("res_person_no").append("=").append(res_person_no).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("addpostn_yn").append("=").append(addpostn_yn).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("work_land_addr").append("=").append(work_land_addr).append(",");
        sb.append("work_land_nm").append("=").append(work_land_nm).append(",");
        sb.append("work_land_build_info").append("=").append(work_land_build_info).append(",");
        sb.append("work_land_postmt_no").append("=").append(work_land_postmt_no).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("fax_no").append("=").append(fax_no).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("unitjob").append("=").append(unitjob).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("uid").append("=").append(uid).append(",");
        sb.append("auth_type").append("=").append(auth_type).append(",");
        sb.append("dept_level_4_cd").append("=").append(dept_level_4_cd).append(",");
        sb.append("dept_level_4_new_ymd").append("=").append(dept_level_4_new_ymd).append(",");
        sb.append("dept_level_4_nm").append("=").append(dept_level_4_nm).append(",");
        sb.append("addr_base").append("=").append(addr_base).append(",");
        sb.append("addr_detls").append("=").append(addr_detls).append(",");
        sb.append("addr_postmt_no").append("=").append(addr_postmt_no).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("tot_bankaccnt_no").append("=").append(tot_bankaccnt_no).append(",");
        sb.append("savng_shape_dedct").append("=").append(savng_shape_dedct).append(",");
        sb.append("sema_mm").append("=").append(sema_mm);
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
