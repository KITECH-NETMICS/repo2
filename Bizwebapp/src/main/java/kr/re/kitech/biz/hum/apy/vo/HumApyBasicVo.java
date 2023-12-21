package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직자등록")
public class HumApyBasicVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyBasicVo(){
    }

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "nm_eng", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm_eng;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String resid_no;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_cd;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_typ", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_typ;

    @ElDtoField(logicalName = "fomat_unit", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "divsn_dept", physicalName = "divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String divsn_dept;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "duty_cd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_cd;

    @ElDtoField(logicalName = "duty_nm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_nm;

    @ElDtoField(logicalName = "job_cd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String job_cd;

    @ElDtoField(logicalName = "job_nm", physicalName = "job_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String job_nm;

    @ElDtoField(logicalName = "job_clsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String job_clsf;

    @ElDtoField(logicalName = "job_clsf_nm", physicalName = "job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String job_clsf_nm;

    @ElDtoField(logicalName = "work_land", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work_land;

    @ElDtoField(logicalName = "occutyp_cd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "occugrp_cd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "occutypNm", physicalName = "occutypNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String occutypNm;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String email;

    @ElDtoField(logicalName = "work_clsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work_clsf;

    @ElDtoField(logicalName = "rct_req_no", physicalName = "rct_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rct_req_no;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String addr;

    @ElDtoField(logicalName = "home_tel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String home_tel;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mobile;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ext_no;

    @ElDtoField(logicalName = "sex", physicalName = "sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sex;

    @ElDtoField(logicalName = "sci_tech_regst_no", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sci_tech_regst_no;

    @ElDtoField(logicalName = "res_person_no", physicalName = "res_person_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String res_person_no;

    @ElDtoField(logicalName = "up_dept_nm", physicalName = "up_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String up_dept_nm;

    @ElDtoField(logicalName = "divsn_dept_nm", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "depthed_empno", physicalName = "depthed_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String depthed_empno;

    @ElDtoField(logicalName = "depthed_nm", physicalName = "depthed_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String depthed_nm;

    @ElDtoField(logicalName = "commute_cd", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String commute_cd;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "degr", physicalName = "degr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String degr;

    @ElDtoField(logicalName = "natn_cd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String natn_cd;

    @ElDtoField(logicalName = "resid_cd", physicalName = "resid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String resid_cd;

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        String ret = this.nm_eng;
        return ret;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        String ret = this.resid_no;
        return ret;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        String ret = this.dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        String ret = this.dept_new_ymd;
        return ret;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        String ret = this.dept_typ;
        return ret;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        String ret = this.fomat_unit;
        return ret;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "divsn_dept")
    public String getDivsn_dept(){
        String ret = this.divsn_dept;
        return ret;
    }

    @ElVoField(physicalName = "divsn_dept")
    public void setDivsn_dept(String divsn_dept){
        this.divsn_dept = divsn_dept;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        String ret = this.posi_cd;
        return ret;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        String ret = this.duty_cd;
        return ret;
    }

    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        String ret = this.duty_nm;
        return ret;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        String ret = this.job_cd;
        return ret;
    }

    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }

    @ElVoField(physicalName = "job_nm")
    public String getJob_nm(){
        String ret = this.job_nm;
        return ret;
    }

    @ElVoField(physicalName = "job_nm")
    public void setJob_nm(String job_nm){
        this.job_nm = job_nm;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        String ret = this.job_clsf;
        return ret;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public String getJob_clsf_nm(){
        String ret = this.job_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public void setJob_clsf_nm(String job_clsf_nm){
        this.job_clsf_nm = job_clsf_nm;
    }

    @ElVoField(physicalName = "work_land")
    public String getWork_land(){
        String ret = this.work_land;
        return ret;
    }

    @ElVoField(physicalName = "work_land")
    public void setWork_land(String work_land){
        this.work_land = work_land;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        String ret = this.occutyp_cd;
        return ret;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        String ret = this.occugrp_cd;
        return ret;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "occutypNm")
    public String getOccutypNm(){
        String ret = this.occutypNm;
        return ret;
    }

    @ElVoField(physicalName = "occutypNm")
    public void setOccutypNm(String occutypNm){
        this.occutypNm = occutypNm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        String ret = this.email;
        return ret;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        String ret = this.work_clsf;
        return ret;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "rct_req_no")
    public String getRct_req_no(){
        String ret = this.rct_req_no;
        return ret;
    }

    @ElVoField(physicalName = "rct_req_no")
    public void setRct_req_no(String rct_req_no){
        this.rct_req_no = rct_req_no;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        String ret = this.addr;
        return ret;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        String ret = this.home_tel;
        return ret;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        String ret = this.mobile;
        return ret;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        String ret = this.ext_no;
        return ret;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "sex")
    public String getSex(){
        String ret = this.sex;
        return ret;
    }

    @ElVoField(physicalName = "sex")
    public void setSex(String sex){
        this.sex = sex;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        String ret = this.sci_tech_regst_no;
        return ret;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }

    @ElVoField(physicalName = "res_person_no")
    public String getRes_person_no(){
        String ret = this.res_person_no;
        return ret;
    }

    @ElVoField(physicalName = "res_person_no")
    public void setRes_person_no(String res_person_no){
        this.res_person_no = res_person_no;
    }

    @ElVoField(physicalName = "up_dept_nm")
    public String getUp_dept_nm(){
        String ret = this.up_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "up_dept_nm")
    public void setUp_dept_nm(String up_dept_nm){
        this.up_dept_nm = up_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        String ret = this.divsn_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "depthed_empno")
    public String getDepthed_empno(){
        String ret = this.depthed_empno;
        return ret;
    }

    @ElVoField(physicalName = "depthed_empno")
    public void setDepthed_empno(String depthed_empno){
        this.depthed_empno = depthed_empno;
    }

    @ElVoField(physicalName = "depthed_nm")
    public String getDepthed_nm(){
        String ret = this.depthed_nm;
        return ret;
    }

    @ElVoField(physicalName = "depthed_nm")
    public void setDepthed_nm(String depthed_nm){
        this.depthed_nm = depthed_nm;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        String ret = this.commute_cd;
        return ret;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        String ret = this.entr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "degr")
    public String getDegr(){
        String ret = this.degr;
        return ret;
    }

    @ElVoField(physicalName = "degr")
    public void setDegr(String degr){
        this.degr = degr;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        String ret = this.natn_cd;
        return ret;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "resid_cd")
    public String getResid_cd(){
        String ret = this.resid_cd;
        return ret;
    }

    @ElVoField(physicalName = "resid_cd")
    public void setResid_cd(String resid_cd){
        this.resid_cd = resid_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyBasicVo [");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("divsn_dept").append("=").append(divsn_dept).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_cd").append("=").append(duty_cd).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("job_nm").append("=").append(job_nm).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("job_clsf_nm").append("=").append(job_clsf_nm).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occutypNm").append("=").append(occutypNm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("rct_req_no").append("=").append(rct_req_no).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("sex").append("=").append(sex).append(",");
        sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
        sb.append("res_person_no").append("=").append(res_person_no).append(",");
        sb.append("up_dept_nm").append("=").append(up_dept_nm).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("depthed_empno").append("=").append(depthed_empno).append(",");
        sb.append("depthed_nm").append("=").append(depthed_nm).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("degr").append("=").append(degr).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("resid_cd").append("=").append(resid_cd);
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
