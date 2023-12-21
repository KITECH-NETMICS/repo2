package kr.re.kitech.biz.hum.ana.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumAnaUserVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumAnaUserVo(){
    }

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "occugrpCd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "occutypCd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "workClsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "fromDate", physicalName = "from_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_date;

    @ElDtoField(logicalName = "toDate", physicalName = "to_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_date;

    @ElDtoField(logicalName = "fromEntrDate", physicalName = "from_entr_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_entr_date;

    @ElDtoField(logicalName = "toEntrDate", physicalName = "to_entr_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_entr_date;

    @ElDtoField(logicalName = "nmChchar", physicalName = "nm_chchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_chchar;

    @ElDtoField(logicalName = "nmEng", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "divsnDept", physicalName = "divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept;

    @ElDtoField(logicalName = "divsnDeptNm", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "cntNm", physicalName = "cnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt_nm;

    @ElDtoField(logicalName = "occugrpNm", physicalName = "occugrp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_nm;

    @ElDtoField(logicalName = "occutypNm", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "jobCd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;

    @ElDtoField(logicalName = "jobNm", physicalName = "job_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_nm;

    @ElDtoField(logicalName = "empUntjob", physicalName = "emp_untjob", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_untjob;

    @ElDtoField(logicalName = "dutyNm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "posiAn", physicalName = "posi_an", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_an;

    @ElDtoField(logicalName = "entrYmd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "retireYmd", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "ttoffOrignYmd", physicalName = "ttoff_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ttoff_orign_ymd;

    @ElDtoField(logicalName = "ttoffClsYmd", physicalName = "ttoff_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ttoff_cls_ymd;

    @ElDtoField(logicalName = "promoBaseYmd", physicalName = "promo_base_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String promo_base_ymd;

    @ElDtoField(logicalName = "longwkCntfrYmd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "addpostnYn", physicalName = "addpostn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addpostn_yn;

    @ElDtoField(logicalName = "othrChargYn", physicalName = "othr_charg_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String othr_charg_yn;

    @ElDtoField(logicalName = "appontContrctYmd", physicalName = "appont_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_contrct_ymd;

    @ElDtoField(logicalName = "appontClsYmd", physicalName = "appont_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_cls_ymd;

    @ElDtoField(logicalName = "workLandNm", physicalName = "work_land_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_nm;

    @ElDtoField(logicalName = "workClsfNm", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "addrRegionNm", physicalName = "addr_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_region_nm;

    @ElDtoField(logicalName = "jobClsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "jobClsfNm", physicalName = "job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf_nm;

    @ElDtoField(logicalName = "ohAddObjct", physicalName = "oh_add_objct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oh_add_objct;

    @ElDtoField(logicalName = "pruseRespnPsn", physicalName = "pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn;

    @ElDtoField(logicalName = "pruseRespnPsnNm", physicalName = "pruse_respn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn_nm;

    @ElDtoField(logicalName = "monthWorkTime", physicalName = "month_work_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_work_time;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "birthYmd", physicalName = "birth_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String birth_ymd;

    @ElDtoField(logicalName = "age", physicalName = "age", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String age;

    @ElDtoField(logicalName = "sex", physicalName = "sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sex;

    @ElDtoField(logicalName = "homeTel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "mobileReplace", physicalName = "mobile_replace", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile_replace;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "domicAddr", physicalName = "domic_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String domic_addr;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "marryYn", physicalName = "marry_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String marry_yn;

    @ElDtoField(logicalName = "educ", physicalName = "educ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ;

    @ElDtoField(logicalName = "educNm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;

    @ElDtoField(logicalName = "degr", physicalName = "degr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String degr;

    @ElDtoField(logicalName = "degrNm", physicalName = "degr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String degr_nm;

    @ElDtoField(logicalName = "schlNm", physicalName = "schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String schl_nm;

    @ElDtoField(logicalName = "major", physicalName = "major", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major;

    @ElDtoField(logicalName = "majorNm", physicalName = "major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_nm;

    @ElDtoField(logicalName = "highEntschYrmon", physicalName = "high_entsch_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String high_entsch_yrmon;

    @ElDtoField(logicalName = "highGradtYrmon", physicalName = "high_gradt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String high_gradt_yrmon;

    @ElDtoField(logicalName = "highSchlNm", physicalName = "high_schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String high_schl_nm;

    @ElDtoField(logicalName = "highMajorNm", physicalName = "high_major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String high_major_nm;

    @ElDtoField(logicalName = "bachelorEntschYrmon", physicalName = "bachelor_entsch_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bachelor_entsch_yrmon;

    @ElDtoField(logicalName = "bachelorGradtYrmon", physicalName = "bachelor_gradt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bachelor_gradt_yrmon;

    @ElDtoField(logicalName = "bachelorSchlNm", physicalName = "bachelor_schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bachelor_schl_nm;

    @ElDtoField(logicalName = "bachelorMajorNm", physicalName = "bachelor_major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bachelor_major_nm;

    @ElDtoField(logicalName = "masterEntschYrmon", physicalName = "master_entsch_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String master_entsch_yrmon;

    @ElDtoField(logicalName = "masterGradtYrmon", physicalName = "master_gradt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String master_gradt_yrmon;

    @ElDtoField(logicalName = "masterSchlNm", physicalName = "master_schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String master_schl_nm;

    @ElDtoField(logicalName = "masterMajorNm", physicalName = "master_major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String master_major_nm;

    @ElDtoField(logicalName = "doctorEntschYrmon", physicalName = "doctor_entsch_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doctor_entsch_yrmon;

    @ElDtoField(logicalName = "doctorGradtYrmon", physicalName = "doctor_gradt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doctor_gradt_yrmon;

    @ElDtoField(logicalName = "doctorSchlNm", physicalName = "doctor_schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doctor_schl_nm;

    @ElDtoField(logicalName = "doctorMajorNm", physicalName = "doctor_major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doctor_major_nm;

    @ElDtoField(logicalName = "baseDate", physicalName = "base_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_date;

    @ElDtoField(logicalName = "retireYyymm", physicalName = "retire_yyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_yyymm;

    @ElDtoField(logicalName = "sciTechRegstNo", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_regst_no;

    @ElDtoField(logicalName = "userDiv", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "userDivNm", physicalName = "user_div_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div_nm;

    @ElDtoField(logicalName = "dispSeq", physicalName = "disp_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disp_seq;

    @ElDtoField(logicalName = "promoBaseYr", physicalName = "promo_base_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String promo_base_yr;

    @ElDtoField(logicalName = "retireResn", physicalName = "retire_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_resn;

    @ElDtoField(logicalName = "transTyp", physicalName = "trans_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_typ;

    @ElDtoField(logicalName = "transAgncyNm", physicalName = "trans_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_agncy_nm;

    @ElDtoField(logicalName = "orderbyid", physicalName = "orderbyid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orderbyid;

    @ElDtoField(logicalName = "sort_id", physicalName = "sort_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sort_id;

    @ElDtoField(logicalName = "privacy_info", physicalName = "privacy_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String privacy_info;

    @ElDtoField(logicalName = "scrn_id", physicalName = "scrn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scrn_id;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "param", physicalName = "param", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String param;

    @ElDtoField(logicalName = "searchGubn", physicalName = "searchGubn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String searchGubn;

    @ElDtoField(logicalName = "searchPosiGubn", physicalName = "searchPosiGubn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String searchPosiGubn;

    @ElDtoField(logicalName = "contrct_cls_ymd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

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

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "from_date")
    public String getFrom_date(){
        return from_date;
    }

    @ElVoField(physicalName = "from_date")
    public void setFrom_date(String from_date){
        this.from_date = from_date;
    }

    @ElVoField(physicalName = "to_date")
    public String getTo_date(){
        return to_date;
    }

    @ElVoField(physicalName = "to_date")
    public void setTo_date(String to_date){
        this.to_date = to_date;
    }

    @ElVoField(physicalName = "from_entr_date")
    public String getFrom_entr_date(){
        return from_entr_date;
    }

    @ElVoField(physicalName = "from_entr_date")
    public void setFrom_entr_date(String from_entr_date){
        this.from_entr_date = from_entr_date;
    }

    @ElVoField(physicalName = "to_entr_date")
    public String getTo_entr_date(){
        return to_entr_date;
    }

    @ElVoField(physicalName = "to_entr_date")
    public void setTo_entr_date(String to_entr_date){
        this.to_entr_date = to_entr_date;
    }

    @ElVoField(physicalName = "nm_chchar")
    public String getNm_chchar(){
        return nm_chchar;
    }

    @ElVoField(physicalName = "nm_chchar")
    public void setNm_chchar(String nm_chchar){
        this.nm_chchar = nm_chchar;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "divsn_dept")
    public String getDivsn_dept(){
        return divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept")
    public void setDivsn_dept(String divsn_dept){
        this.divsn_dept = divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "cnt_nm")
    public String getCnt_nm(){
        return cnt_nm;
    }

    @ElVoField(physicalName = "cnt_nm")
    public void setCnt_nm(String cnt_nm){
        this.cnt_nm = cnt_nm;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public String getOccugrp_nm(){
        return occugrp_nm;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public void setOccugrp_nm(String occugrp_nm){
        this.occugrp_nm = occugrp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }

    @ElVoField(physicalName = "job_nm")
    public String getJob_nm(){
        return job_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public void setJob_nm(String job_nm){
        this.job_nm = job_nm;
    }

    @ElVoField(physicalName = "emp_untjob")
    public String getEmp_untjob(){
        return emp_untjob;
    }

    @ElVoField(physicalName = "emp_untjob")
    public void setEmp_untjob(String emp_untjob){
        this.emp_untjob = emp_untjob;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "posi_an")
    public String getPosi_an(){
        return posi_an;
    }

    @ElVoField(physicalName = "posi_an")
    public void setPosi_an(String posi_an){
        this.posi_an = posi_an;
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

    @ElVoField(physicalName = "ttoff_orign_ymd")
    public String getTtoff_orign_ymd(){
        return ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "ttoff_orign_ymd")
    public void setTtoff_orign_ymd(String ttoff_orign_ymd){
        this.ttoff_orign_ymd = ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "ttoff_cls_ymd")
    public String getTtoff_cls_ymd(){
        return ttoff_cls_ymd;
    }

    @ElVoField(physicalName = "ttoff_cls_ymd")
    public void setTtoff_cls_ymd(String ttoff_cls_ymd){
        this.ttoff_cls_ymd = ttoff_cls_ymd;
    }

    @ElVoField(physicalName = "promo_base_ymd")
    public String getPromo_base_ymd(){
        return promo_base_ymd;
    }

    @ElVoField(physicalName = "promo_base_ymd")
    public void setPromo_base_ymd(String promo_base_ymd){
        this.promo_base_ymd = promo_base_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "addpostn_yn")
    public String getAddpostn_yn(){
        return addpostn_yn;
    }

    @ElVoField(physicalName = "addpostn_yn")
    public void setAddpostn_yn(String addpostn_yn){
        this.addpostn_yn = addpostn_yn;
    }

    @ElVoField(physicalName = "othr_charg_yn")
    public String getOthr_charg_yn(){
        return othr_charg_yn;
    }

    @ElVoField(physicalName = "othr_charg_yn")
    public void setOthr_charg_yn(String othr_charg_yn){
        this.othr_charg_yn = othr_charg_yn;
    }

    @ElVoField(physicalName = "appont_contrct_ymd")
    public String getAppont_contrct_ymd(){
        return appont_contrct_ymd;
    }

    @ElVoField(physicalName = "appont_contrct_ymd")
    public void setAppont_contrct_ymd(String appont_contrct_ymd){
        this.appont_contrct_ymd = appont_contrct_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public String getAppont_cls_ymd(){
        return appont_cls_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public void setAppont_cls_ymd(String appont_cls_ymd){
        this.appont_cls_ymd = appont_cls_ymd;
    }

    @ElVoField(physicalName = "work_land_nm")
    public String getWork_land_nm(){
        return work_land_nm;
    }

    @ElVoField(physicalName = "work_land_nm")
    public void setWork_land_nm(String work_land_nm){
        this.work_land_nm = work_land_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "addr_region_nm")
    public String getAddr_region_nm(){
        return addr_region_nm;
    }

    @ElVoField(physicalName = "addr_region_nm")
    public void setAddr_region_nm(String addr_region_nm){
        this.addr_region_nm = addr_region_nm;
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

    @ElVoField(physicalName = "oh_add_objct")
    public String getOh_add_objct(){
        return oh_add_objct;
    }

    @ElVoField(physicalName = "oh_add_objct")
    public void setOh_add_objct(String oh_add_objct){
        this.oh_add_objct = oh_add_objct;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public String getPruse_respn_psn(){
        return pruse_respn_psn;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public void setPruse_respn_psn(String pruse_respn_psn){
        this.pruse_respn_psn = pruse_respn_psn;
    }

    @ElVoField(physicalName = "pruse_respn_psn_nm")
    public String getPruse_respn_psn_nm(){
        return pruse_respn_psn_nm;
    }

    @ElVoField(physicalName = "pruse_respn_psn_nm")
    public void setPruse_respn_psn_nm(String pruse_respn_psn_nm){
        this.pruse_respn_psn_nm = pruse_respn_psn_nm;
    }

    @ElVoField(physicalName = "month_work_time")
    public String getMonth_work_time(){
        return month_work_time;
    }

    @ElVoField(physicalName = "month_work_time")
    public void setMonth_work_time(String month_work_time){
        this.month_work_time = month_work_time;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "birth_ymd")
    public String getBirth_ymd(){
        return birth_ymd;
    }

    @ElVoField(physicalName = "birth_ymd")
    public void setBirth_ymd(String birth_ymd){
        this.birth_ymd = birth_ymd;
    }

    @ElVoField(physicalName = "age")
    public String getAge(){
        return age;
    }

    @ElVoField(physicalName = "age")
    public void setAge(String age){
        this.age = age;
    }

    @ElVoField(physicalName = "sex")
    public String getSex(){
        return sex;
    }

    @ElVoField(physicalName = "sex")
    public void setSex(String sex){
        this.sex = sex;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "mobile_replace")
    public String getMobile_replace(){
        return mobile_replace;
    }

    @ElVoField(physicalName = "mobile_replace")
    public void setMobile_replace(String mobile_replace){
        this.mobile_replace = mobile_replace;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "domic_addr")
    public String getDomic_addr(){
        return domic_addr;
    }

    @ElVoField(physicalName = "domic_addr")
    public void setDomic_addr(String domic_addr){
        this.domic_addr = domic_addr;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "marry_yn")
    public String getMarry_yn(){
        return marry_yn;
    }

    @ElVoField(physicalName = "marry_yn")
    public void setMarry_yn(String marry_yn){
        this.marry_yn = marry_yn;
    }

    @ElVoField(physicalName = "educ")
    public String getEduc(){
        return educ;
    }

    @ElVoField(physicalName = "educ")
    public void setEduc(String educ){
        this.educ = educ;
    }

    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }

    @ElVoField(physicalName = "degr")
    public String getDegr(){
        return degr;
    }

    @ElVoField(physicalName = "degr")
    public void setDegr(String degr){
        this.degr = degr;
    }

    @ElVoField(physicalName = "degr_nm")
    public String getDegr_nm(){
        return degr_nm;
    }

    @ElVoField(physicalName = "degr_nm")
    public void setDegr_nm(String degr_nm){
        this.degr_nm = degr_nm;
    }

    @ElVoField(physicalName = "schl_nm")
    public String getSchl_nm(){
        return schl_nm;
    }

    @ElVoField(physicalName = "schl_nm")
    public void setSchl_nm(String schl_nm){
        this.schl_nm = schl_nm;
    }

    @ElVoField(physicalName = "major")
    public String getMajor(){
        return major;
    }

    @ElVoField(physicalName = "major")
    public void setMajor(String major){
        this.major = major;
    }

    @ElVoField(physicalName = "major_nm")
    public String getMajor_nm(){
        return major_nm;
    }

    @ElVoField(physicalName = "major_nm")
    public void setMajor_nm(String major_nm){
        this.major_nm = major_nm;
    }

    @ElVoField(physicalName = "high_entsch_yrmon")
    public String getHigh_entsch_yrmon(){
        return high_entsch_yrmon;
    }

    @ElVoField(physicalName = "high_entsch_yrmon")
    public void setHigh_entsch_yrmon(String high_entsch_yrmon){
        this.high_entsch_yrmon = high_entsch_yrmon;
    }

    @ElVoField(physicalName = "high_gradt_yrmon")
    public String getHigh_gradt_yrmon(){
        return high_gradt_yrmon;
    }

    @ElVoField(physicalName = "high_gradt_yrmon")
    public void setHigh_gradt_yrmon(String high_gradt_yrmon){
        this.high_gradt_yrmon = high_gradt_yrmon;
    }

    @ElVoField(physicalName = "high_schl_nm")
    public String getHigh_schl_nm(){
        return high_schl_nm;
    }

    @ElVoField(physicalName = "high_schl_nm")
    public void setHigh_schl_nm(String high_schl_nm){
        this.high_schl_nm = high_schl_nm;
    }

    @ElVoField(physicalName = "high_major_nm")
    public String getHigh_major_nm(){
        return high_major_nm;
    }

    @ElVoField(physicalName = "high_major_nm")
    public void setHigh_major_nm(String high_major_nm){
        this.high_major_nm = high_major_nm;
    }

    @ElVoField(physicalName = "bachelor_entsch_yrmon")
    public String getBachelor_entsch_yrmon(){
        return bachelor_entsch_yrmon;
    }

    @ElVoField(physicalName = "bachelor_entsch_yrmon")
    public void setBachelor_entsch_yrmon(String bachelor_entsch_yrmon){
        this.bachelor_entsch_yrmon = bachelor_entsch_yrmon;
    }

    @ElVoField(physicalName = "bachelor_gradt_yrmon")
    public String getBachelor_gradt_yrmon(){
        return bachelor_gradt_yrmon;
    }

    @ElVoField(physicalName = "bachelor_gradt_yrmon")
    public void setBachelor_gradt_yrmon(String bachelor_gradt_yrmon){
        this.bachelor_gradt_yrmon = bachelor_gradt_yrmon;
    }

    @ElVoField(physicalName = "bachelor_schl_nm")
    public String getBachelor_schl_nm(){
        return bachelor_schl_nm;
    }

    @ElVoField(physicalName = "bachelor_schl_nm")
    public void setBachelor_schl_nm(String bachelor_schl_nm){
        this.bachelor_schl_nm = bachelor_schl_nm;
    }

    @ElVoField(physicalName = "bachelor_major_nm")
    public String getBachelor_major_nm(){
        return bachelor_major_nm;
    }

    @ElVoField(physicalName = "bachelor_major_nm")
    public void setBachelor_major_nm(String bachelor_major_nm){
        this.bachelor_major_nm = bachelor_major_nm;
    }

    @ElVoField(physicalName = "master_entsch_yrmon")
    public String getMaster_entsch_yrmon(){
        return master_entsch_yrmon;
    }

    @ElVoField(physicalName = "master_entsch_yrmon")
    public void setMaster_entsch_yrmon(String master_entsch_yrmon){
        this.master_entsch_yrmon = master_entsch_yrmon;
    }

    @ElVoField(physicalName = "master_gradt_yrmon")
    public String getMaster_gradt_yrmon(){
        return master_gradt_yrmon;
    }

    @ElVoField(physicalName = "master_gradt_yrmon")
    public void setMaster_gradt_yrmon(String master_gradt_yrmon){
        this.master_gradt_yrmon = master_gradt_yrmon;
    }

    @ElVoField(physicalName = "master_schl_nm")
    public String getMaster_schl_nm(){
        return master_schl_nm;
    }

    @ElVoField(physicalName = "master_schl_nm")
    public void setMaster_schl_nm(String master_schl_nm){
        this.master_schl_nm = master_schl_nm;
    }

    @ElVoField(physicalName = "master_major_nm")
    public String getMaster_major_nm(){
        return master_major_nm;
    }

    @ElVoField(physicalName = "master_major_nm")
    public void setMaster_major_nm(String master_major_nm){
        this.master_major_nm = master_major_nm;
    }

    @ElVoField(physicalName = "doctor_entsch_yrmon")
    public String getDoctor_entsch_yrmon(){
        return doctor_entsch_yrmon;
    }

    @ElVoField(physicalName = "doctor_entsch_yrmon")
    public void setDoctor_entsch_yrmon(String doctor_entsch_yrmon){
        this.doctor_entsch_yrmon = doctor_entsch_yrmon;
    }

    @ElVoField(physicalName = "doctor_gradt_yrmon")
    public String getDoctor_gradt_yrmon(){
        return doctor_gradt_yrmon;
    }

    @ElVoField(physicalName = "doctor_gradt_yrmon")
    public void setDoctor_gradt_yrmon(String doctor_gradt_yrmon){
        this.doctor_gradt_yrmon = doctor_gradt_yrmon;
    }

    @ElVoField(physicalName = "doctor_schl_nm")
    public String getDoctor_schl_nm(){
        return doctor_schl_nm;
    }

    @ElVoField(physicalName = "doctor_schl_nm")
    public void setDoctor_schl_nm(String doctor_schl_nm){
        this.doctor_schl_nm = doctor_schl_nm;
    }

    @ElVoField(physicalName = "doctor_major_nm")
    public String getDoctor_major_nm(){
        return doctor_major_nm;
    }

    @ElVoField(physicalName = "doctor_major_nm")
    public void setDoctor_major_nm(String doctor_major_nm){
        this.doctor_major_nm = doctor_major_nm;
    }

    @ElVoField(physicalName = "base_date")
    public String getBase_date(){
        return base_date;
    }

    @ElVoField(physicalName = "base_date")
    public void setBase_date(String base_date){
        this.base_date = base_date;
    }

    @ElVoField(physicalName = "retire_yyymm")
    public String getRetire_yyymm(){
        return retire_yyymm;
    }

    @ElVoField(physicalName = "retire_yyymm")
    public void setRetire_yyymm(String retire_yyymm){
        this.retire_yyymm = retire_yyymm;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        return sci_tech_regst_no;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
    }

    @ElVoField(physicalName = "user_div_nm")
    public String getUser_div_nm(){
        return user_div_nm;
    }

    @ElVoField(physicalName = "user_div_nm")
    public void setUser_div_nm(String user_div_nm){
        this.user_div_nm = user_div_nm;
    }

    @ElVoField(physicalName = "disp_seq")
    public String getDisp_seq(){
        return disp_seq;
    }

    @ElVoField(physicalName = "disp_seq")
    public void setDisp_seq(String disp_seq){
        this.disp_seq = disp_seq;
    }

    @ElVoField(physicalName = "promo_base_yr")
    public String getPromo_base_yr(){
        return promo_base_yr;
    }

    @ElVoField(physicalName = "promo_base_yr")
    public void setPromo_base_yr(String promo_base_yr){
        this.promo_base_yr = promo_base_yr;
    }

    @ElVoField(physicalName = "retire_resn")
    public String getRetire_resn(){
        return retire_resn;
    }

    @ElVoField(physicalName = "retire_resn")
    public void setRetire_resn(String retire_resn){
        this.retire_resn = retire_resn;
    }

    @ElVoField(physicalName = "trans_typ")
    public String getTrans_typ(){
        return trans_typ;
    }

    @ElVoField(physicalName = "trans_typ")
    public void setTrans_typ(String trans_typ){
        this.trans_typ = trans_typ;
    }

    @ElVoField(physicalName = "trans_agncy_nm")
    public String getTrans_agncy_nm(){
        return trans_agncy_nm;
    }

    @ElVoField(physicalName = "trans_agncy_nm")
    public void setTrans_agncy_nm(String trans_agncy_nm){
        this.trans_agncy_nm = trans_agncy_nm;
    }

    @ElVoField(physicalName = "orderbyid")
    public String getOrderbyid(){
        return orderbyid;
    }

    @ElVoField(physicalName = "orderbyid")
    public void setOrderbyid(String orderbyid){
        this.orderbyid = orderbyid;
    }

    @ElVoField(physicalName = "sort_id")
    public String getSort_id(){
        return sort_id;
    }

    @ElVoField(physicalName = "sort_id")
    public void setSort_id(String sort_id){
        this.sort_id = sort_id;
    }

    @ElVoField(physicalName = "privacy_info")
    public String getPrivacy_info(){
        return privacy_info;
    }

    @ElVoField(physicalName = "privacy_info")
    public void setPrivacy_info(String privacy_info){
        this.privacy_info = privacy_info;
    }

    @ElVoField(physicalName = "scrn_id")
    public String getScrn_id(){
        return scrn_id;
    }

    @ElVoField(physicalName = "scrn_id")
    public void setScrn_id(String scrn_id){
        this.scrn_id = scrn_id;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "param")
    public String getParam(){
        return param;
    }

    @ElVoField(physicalName = "param")
    public void setParam(String param){
        this.param = param;
    }

    @ElVoField(physicalName = "searchGubn")
    public String getSearchGubn(){
        return searchGubn;
    }

    @ElVoField(physicalName = "searchGubn")
    public void setSearchGubn(String searchGubn){
        this.searchGubn = searchGubn;
    }

    @ElVoField(physicalName = "searchPosiGubn")
    public String getSearchPosiGubn(){
        return searchPosiGubn;
    }

    @ElVoField(physicalName = "searchPosiGubn")
    public void setSearchPosiGubn(String searchPosiGubn){
        this.searchPosiGubn = searchPosiGubn;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumAnaUserVo [");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("from_date").append("=").append(from_date).append(",");
        sb.append("to_date").append("=").append(to_date).append(",");
        sb.append("from_entr_date").append("=").append(from_entr_date).append(",");
        sb.append("to_entr_date").append("=").append(to_entr_date).append(",");
        sb.append("nm_chchar").append("=").append(nm_chchar).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("divsn_dept").append("=").append(divsn_dept).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("cnt_nm").append("=").append(cnt_nm).append(",");
        sb.append("occugrp_nm").append("=").append(occugrp_nm).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("job_nm").append("=").append(job_nm).append(",");
        sb.append("emp_untjob").append("=").append(emp_untjob).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("posi_an").append("=").append(posi_an).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("ttoff_orign_ymd").append("=").append(ttoff_orign_ymd).append(",");
        sb.append("ttoff_cls_ymd").append("=").append(ttoff_cls_ymd).append(",");
        sb.append("promo_base_ymd").append("=").append(promo_base_ymd).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("addpostn_yn").append("=").append(addpostn_yn).append(",");
        sb.append("othr_charg_yn").append("=").append(othr_charg_yn).append(",");
        sb.append("appont_contrct_ymd").append("=").append(appont_contrct_ymd).append(",");
        sb.append("appont_cls_ymd").append("=").append(appont_cls_ymd).append(",");
        sb.append("work_land_nm").append("=").append(work_land_nm).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("addr_region_nm").append("=").append(addr_region_nm).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("job_clsf_nm").append("=").append(job_clsf_nm).append(",");
        sb.append("oh_add_objct").append("=").append(oh_add_objct).append(",");
        sb.append("pruse_respn_psn").append("=").append(pruse_respn_psn).append(",");
        sb.append("pruse_respn_psn_nm").append("=").append(pruse_respn_psn_nm).append(",");
        sb.append("month_work_time").append("=").append(month_work_time).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("birth_ymd").append("=").append(birth_ymd).append(",");
        sb.append("age").append("=").append(age).append(",");
        sb.append("sex").append("=").append(sex).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("mobile_replace").append("=").append(mobile_replace).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("domic_addr").append("=").append(domic_addr).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("marry_yn").append("=").append(marry_yn).append(",");
        sb.append("educ").append("=").append(educ).append(",");
        sb.append("educ_nm").append("=").append(educ_nm).append(",");
        sb.append("degr").append("=").append(degr).append(",");
        sb.append("degr_nm").append("=").append(degr_nm).append(",");
        sb.append("schl_nm").append("=").append(schl_nm).append(",");
        sb.append("major").append("=").append(major).append(",");
        sb.append("major_nm").append("=").append(major_nm).append(",");
        sb.append("high_entsch_yrmon").append("=").append(high_entsch_yrmon).append(",");
        sb.append("high_gradt_yrmon").append("=").append(high_gradt_yrmon).append(",");
        sb.append("high_schl_nm").append("=").append(high_schl_nm).append(",");
        sb.append("high_major_nm").append("=").append(high_major_nm).append(",");
        sb.append("bachelor_entsch_yrmon").append("=").append(bachelor_entsch_yrmon).append(",");
        sb.append("bachelor_gradt_yrmon").append("=").append(bachelor_gradt_yrmon).append(",");
        sb.append("bachelor_schl_nm").append("=").append(bachelor_schl_nm).append(",");
        sb.append("bachelor_major_nm").append("=").append(bachelor_major_nm).append(",");
        sb.append("master_entsch_yrmon").append("=").append(master_entsch_yrmon).append(",");
        sb.append("master_gradt_yrmon").append("=").append(master_gradt_yrmon).append(",");
        sb.append("master_schl_nm").append("=").append(master_schl_nm).append(",");
        sb.append("master_major_nm").append("=").append(master_major_nm).append(",");
        sb.append("doctor_entsch_yrmon").append("=").append(doctor_entsch_yrmon).append(",");
        sb.append("doctor_gradt_yrmon").append("=").append(doctor_gradt_yrmon).append(",");
        sb.append("doctor_schl_nm").append("=").append(doctor_schl_nm).append(",");
        sb.append("doctor_major_nm").append("=").append(doctor_major_nm).append(",");
        sb.append("base_date").append("=").append(base_date).append(",");
        sb.append("retire_yyymm").append("=").append(retire_yyymm).append(",");
        sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("user_div_nm").append("=").append(user_div_nm).append(",");
        sb.append("disp_seq").append("=").append(disp_seq).append(",");
        sb.append("promo_base_yr").append("=").append(promo_base_yr).append(",");
        sb.append("retire_resn").append("=").append(retire_resn).append(",");
        sb.append("trans_typ").append("=").append(trans_typ).append(",");
        sb.append("trans_agncy_nm").append("=").append(trans_agncy_nm).append(",");
        sb.append("orderbyid").append("=").append(orderbyid).append(",");
        sb.append("sort_id").append("=").append(sort_id).append(",");
        sb.append("privacy_info").append("=").append(privacy_info).append(",");
        sb.append("scrn_id").append("=").append(scrn_id).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("param").append("=").append(param).append(",");
        sb.append("searchGubn").append("=").append(searchGubn).append(",");
        sb.append("searchPosiGubn").append("=").append(searchPosiGubn).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd);
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
