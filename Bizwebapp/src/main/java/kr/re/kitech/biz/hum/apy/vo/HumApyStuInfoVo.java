package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "학생연구원활용예정확인서 정보")
public class HumApyStuInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyStuInfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "시스템 개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "지도교수", physicalName = "map_prof_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_syspayno;

    @ElDtoField(logicalName = "지도교수 사번", physicalName = "map_prof_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_empno;

    @ElDtoField(logicalName = "지도교수성명", physicalName = "map_prof_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_nm;

    @ElDtoField(logicalName = "지도교수부서(활용부서)", physicalName = "map_prof_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_dept_nm;

    @ElDtoField(logicalName = "지도교수이메일", physicalName = "map_prof_dept_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_dept_email;

    @ElDtoField(logicalName = "활용학연자(학생명)", physicalName = "stu_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stu_nm;

    @ElDtoField(logicalName = "주민번호", physicalName = "birth_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String birth_ymd;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "핸드폰", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "성별", physicalName = "sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sex;

    @ElDtoField(logicalName = "final_edu", physicalName = "final_edu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_edu;

    @ElDtoField(logicalName = "학연진학학교명", physicalName = "supt_schl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_schl;

    @ElDtoField(logicalName = "학위과정", physicalName = "procs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String procs;

    @ElDtoField(logicalName = "전공코드", physicalName = "major_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_cd;

    @ElDtoField(logicalName = "전공명", physicalName = "major", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "last_execute_tim", physicalName = "last_execute_tim", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String last_execute_tim;

    @ElDtoField(logicalName = "신청자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "신청자 근무상태", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "신청자 근무상태 코드", physicalName = "work_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_cd;

    @ElDtoField(logicalName = "신청자이메일", physicalName = "req_syspayno_email_org", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno_email_org;

    @ElDtoField(logicalName = "신청자이메일", physicalName = "req_syspayno_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno_email;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "입사일", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "전기 및 후기", physicalName = "former_latter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String former_latter;

    @ElDtoField(logicalName = "추천서 발급번호", physicalName = "rcmd_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcmd_no;

    @ElDtoField(logicalName = "추천서 이메일발급 상태", physicalName = "rcmd_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcmd_state;

    @ElDtoField(logicalName = "입소독려 이메일 상태", physicalName = "encrg_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String encrg_state;

    @ElDtoField(logicalName = "chk", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElDtoField(logicalName = "rcmd_updt_syspayno", physicalName = "rcmd_updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcmd_updt_syspayno;

    @ElDtoField(logicalName = "updateData", physicalName = "updateData", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updateData;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "계정책임자사원번호", physicalName = "accnt_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_empno;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "기간", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "날짜", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "연구비", physicalName = "total_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String total_cash;

    @ElDtoField(logicalName = "month_fxdamt_amt", physicalName = "month_fxdamt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_fxdamt_amt;

    @ElDtoField(logicalName = "계약기간", physicalName = "contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_ymd;

    @ElDtoField(logicalName = "contrct_start_ymd", physicalName = "contrct_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_start_ymd;

    @ElDtoField(logicalName = "contrct_cls_ymd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "cash_attnce_rt", physicalName = "cash_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_attnce_rt;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "respn_clsf", physicalName = "respn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_clsf;

    @ElDtoField(logicalName = "attnce_prd_ymd", physicalName = "attnce_prd_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_ymd;

    @ElDtoField(logicalName = "잔액", physicalName = "tot_ramt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_ramt;

    @ElDtoField(logicalName = "흡수예정액", physicalName = "input_schdl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_schdl_amt;

    @ElDtoField(logicalName = "기본신청유형", physicalName = "req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ;

    @ElDtoField(logicalName = "신청일", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "부서장시스템개인번호", physicalName = "depthed_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed_syspayno;

    @ElDtoField(logicalName = "본부장시스템개인번호", physicalName = "divsn_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_rspns_syspayno;

    @ElDtoField(logicalName = "map_prof", physicalName = "map_prof", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof;

    @ElDtoField(logicalName = "map_prof_emp_no", physicalName = "map_prof_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_emp_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "첨부파일번호01", physicalName = "attach_file_no_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_01;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "확보계획", physicalName = "secure_plan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secure_plan;

    @ElDtoField(logicalName = "plan_yn", physicalName = "plan_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_yn;

    @ElDtoField(logicalName = "map_prof_entr_ymd", physicalName = "map_prof_entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_entr_ymd;

    @ElDtoField(logicalName = "한자", physicalName = "nm_chchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_chchar;

    @ElDtoField(logicalName = "졸업예정일", physicalName = "gradt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gradt_ymd;

    @ElDtoField(logicalName = "활용예정일", physicalName = "prj_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_start_ymd;

    @ElDtoField(logicalName = "활용종료일", physicalName = "prj_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_cls_ymd;

    @ElDtoField(logicalName = "근무시간(주)", physicalName = "work_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_time;

    @ElDtoField(logicalName = "학생인건비지출예정액(월)", physicalName = "stu_amt_mnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stu_amt_mnt;

    @ElDtoField(logicalName = "학생인건비지출예정총액", physicalName = "stu_amt_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stu_amt_yr;

    @ElDtoField(logicalName = "활용내용", physicalName = "pruse_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_contnt;

    @ElDtoField(logicalName = "면담결과", physicalName = "intrv_result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrv_result;

    @ElDtoField(logicalName = "보험율", physicalName = "membr_burdn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String membr_burdn;

    @ElDtoField(logicalName = "salry_label_grp", physicalName = "salry_label_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_label_grp;

    @ElDtoField(logicalName = "base_ymd", physicalName = "base_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_ymd;

    @ElDtoField(logicalName = "analsal_clsf", physicalName = "analsal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String analsal_clsf;

    @ElDtoField(logicalName = "analsal_clsf_nm", physicalName = "analsal_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String analsal_clsf_nm;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "analsal", physicalName = "analsal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String analsal;

    @ElDtoField(logicalName = "apr_nm", physicalName = "apr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_nm;

    @ElDtoField(logicalName = "apr_schl", physicalName = "apr_schl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_schl;

    @ElDtoField(logicalName = "저장타입", physicalName = "save_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_type;

    @ElDtoField(logicalName = "apr_map_prof", physicalName = "apr_map_prof", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_map_prof;

    @ElDtoField(logicalName = "지도교수", physicalName = "rspns_map_prof_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_map_prof_nm;

    @ElDtoField(logicalName = "지도교수 개인번호", physicalName = "rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_empno;

    @ElDtoField(logicalName = "지도교수 직급", physicalName = "rspns_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_posi_nm;

    @ElDtoField(logicalName = "지도교수 부서", physicalName = "rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_dept_nm;

    @ElDtoField(logicalName = "부서장", physicalName = "rspns_depthed_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_depthed_nm;

    @ElDtoField(logicalName = "본부장", physicalName = "rspns_divsn_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_divsn_rspns_nm;

    @ElDtoField(logicalName = "전공명", physicalName = "major_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_nm;

    @ElDtoField(logicalName = "결재당시 잔액", physicalName = "ramt_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_amt;

    @ElDtoField(logicalName = "결재당시 지출예정액", physicalName = "enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_amt;

    @ElDtoField(logicalName = "prj_ymd", physicalName = "prj_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_ymd;

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

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "map_prof_syspayno")
    public String getMap_prof_syspayno(){
        return map_prof_syspayno;
    }

    @ElVoField(physicalName = "map_prof_syspayno")
    public void setMap_prof_syspayno(String map_prof_syspayno){
        this.map_prof_syspayno = map_prof_syspayno;
    }

    @ElVoField(physicalName = "map_prof_empno")
    public String getMap_prof_empno(){
        return map_prof_empno;
    }

    @ElVoField(physicalName = "map_prof_empno")
    public void setMap_prof_empno(String map_prof_empno){
        this.map_prof_empno = map_prof_empno;
    }

    @ElVoField(physicalName = "map_prof_nm")
    public String getMap_prof_nm(){
        return map_prof_nm;
    }

    @ElVoField(physicalName = "map_prof_nm")
    public void setMap_prof_nm(String map_prof_nm){
        this.map_prof_nm = map_prof_nm;
    }

    @ElVoField(physicalName = "map_prof_dept_nm")
    public String getMap_prof_dept_nm(){
        return map_prof_dept_nm;
    }

    @ElVoField(physicalName = "map_prof_dept_nm")
    public void setMap_prof_dept_nm(String map_prof_dept_nm){
        this.map_prof_dept_nm = map_prof_dept_nm;
    }

    @ElVoField(physicalName = "map_prof_dept_email")
    public String getMap_prof_dept_email(){
        return map_prof_dept_email;
    }

    @ElVoField(physicalName = "map_prof_dept_email")
    public void setMap_prof_dept_email(String map_prof_dept_email){
        this.map_prof_dept_email = map_prof_dept_email;
    }

    @ElVoField(physicalName = "stu_nm")
    public String getStu_nm(){
        return stu_nm;
    }

    @ElVoField(physicalName = "stu_nm")
    public void setStu_nm(String stu_nm){
        this.stu_nm = stu_nm;
    }

    @ElVoField(physicalName = "birth_ymd")
    public String getBirth_ymd(){
        return birth_ymd;
    }

    @ElVoField(physicalName = "birth_ymd")
    public void setBirth_ymd(String birth_ymd){
        this.birth_ymd = birth_ymd;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "sex")
    public String getSex(){
        return sex;
    }

    @ElVoField(physicalName = "sex")
    public void setSex(String sex){
        this.sex = sex;
    }

    @ElVoField(physicalName = "final_edu")
    public String getFinal_edu(){
        return final_edu;
    }

    @ElVoField(physicalName = "final_edu")
    public void setFinal_edu(String final_edu){
        this.final_edu = final_edu;
    }

    @ElVoField(physicalName = "supt_schl")
    public String getSupt_schl(){
        return supt_schl;
    }

    @ElVoField(physicalName = "supt_schl")
    public void setSupt_schl(String supt_schl){
        this.supt_schl = supt_schl;
    }

    @ElVoField(physicalName = "procs")
    public String getProcs(){
        return procs;
    }

    @ElVoField(physicalName = "procs")
    public void setProcs(String procs){
        this.procs = procs;
    }

    @ElVoField(physicalName = "major_cd")
    public String getMajor_cd(){
        return major_cd;
    }

    @ElVoField(physicalName = "major_cd")
    public void setMajor_cd(String major_cd){
        this.major_cd = major_cd;
    }

    @ElVoField(physicalName = "major")
    public String getMajor(){
        return major;
    }

    @ElVoField(physicalName = "major")
    public void setMajor(String major){
        this.major = major;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public String getLast_execute_tim(){
        return last_execute_tim;
    }

    @ElVoField(physicalName = "last_execute_tim")
    public void setLast_execute_tim(String last_execute_tim){
        this.last_execute_tim = last_execute_tim;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "work_clsf_cd")
    public String getWork_clsf_cd(){
        return work_clsf_cd;
    }

    @ElVoField(physicalName = "work_clsf_cd")
    public void setWork_clsf_cd(String work_clsf_cd){
        this.work_clsf_cd = work_clsf_cd;
    }

    @ElVoField(physicalName = "req_syspayno_email_org")
    public String getReq_syspayno_email_org(){
        return req_syspayno_email_org;
    }

    @ElVoField(physicalName = "req_syspayno_email_org")
    public void setReq_syspayno_email_org(String req_syspayno_email_org){
        this.req_syspayno_email_org = req_syspayno_email_org;
    }

    @ElVoField(physicalName = "req_syspayno_email")
    public String getReq_syspayno_email(){
        return req_syspayno_email;
    }

    @ElVoField(physicalName = "req_syspayno_email")
    public void setReq_syspayno_email(String req_syspayno_email){
        this.req_syspayno_email = req_syspayno_email;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "former_latter")
    public String getFormer_latter(){
        return former_latter;
    }

    @ElVoField(physicalName = "former_latter")
    public void setFormer_latter(String former_latter){
        this.former_latter = former_latter;
    }

    @ElVoField(physicalName = "rcmd_no")
    public String getRcmd_no(){
        return rcmd_no;
    }

    @ElVoField(physicalName = "rcmd_no")
    public void setRcmd_no(String rcmd_no){
        this.rcmd_no = rcmd_no;
    }

    @ElVoField(physicalName = "rcmd_state")
    public String getRcmd_state(){
        return rcmd_state;
    }

    @ElVoField(physicalName = "rcmd_state")
    public void setRcmd_state(String rcmd_state){
        this.rcmd_state = rcmd_state;
    }

    @ElVoField(physicalName = "encrg_state")
    public String getEncrg_state(){
        return encrg_state;
    }

    @ElVoField(physicalName = "encrg_state")
    public void setEncrg_state(String encrg_state){
        this.encrg_state = encrg_state;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @ElVoField(physicalName = "rcmd_updt_syspayno")
    public String getRcmd_updt_syspayno(){
        return rcmd_updt_syspayno;
    }

    @ElVoField(physicalName = "rcmd_updt_syspayno")
    public void setRcmd_updt_syspayno(String rcmd_updt_syspayno){
        this.rcmd_updt_syspayno = rcmd_updt_syspayno;
    }

    @ElVoField(physicalName = "updateData")
    public String getUpdateData(){
        return updateData;
    }

    @ElVoField(physicalName = "updateData")
    public void setUpdateData(String updateData){
        this.updateData = updateData;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public String getAccnt_rspns_empno(){
        return accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public void setAccnt_rspns_empno(String accnt_rspns_empno){
        this.accnt_rspns_empno = accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "total_cash")
    public String getTotal_cash(){
        return total_cash;
    }

    @ElVoField(physicalName = "total_cash")
    public void setTotal_cash(String total_cash){
        this.total_cash = total_cash;
    }

    @ElVoField(physicalName = "month_fxdamt_amt")
    public String getMonth_fxdamt_amt(){
        return month_fxdamt_amt;
    }

    @ElVoField(physicalName = "month_fxdamt_amt")
    public void setMonth_fxdamt_amt(String month_fxdamt_amt){
        this.month_fxdamt_amt = month_fxdamt_amt;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public String getContrct_ymd(){
        return contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public void setContrct_ymd(String contrct_ymd){
        this.contrct_ymd = contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_start_ymd")
    public String getContrct_start_ymd(){
        return contrct_start_ymd;
    }

    @ElVoField(physicalName = "contrct_start_ymd")
    public void setContrct_start_ymd(String contrct_start_ymd){
        this.contrct_start_ymd = contrct_start_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public String getCash_attnce_rt(){
        return cash_attnce_rt;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public void setCash_attnce_rt(String cash_attnce_rt){
        this.cash_attnce_rt = cash_attnce_rt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "respn_clsf")
    public String getRespn_clsf(){
        return respn_clsf;
    }

    @ElVoField(physicalName = "respn_clsf")
    public void setRespn_clsf(String respn_clsf){
        this.respn_clsf = respn_clsf;
    }

    @ElVoField(physicalName = "attnce_prd_ymd")
    public String getAttnce_prd_ymd(){
        return attnce_prd_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_ymd")
    public void setAttnce_prd_ymd(String attnce_prd_ymd){
        this.attnce_prd_ymd = attnce_prd_ymd;
    }

    @ElVoField(physicalName = "tot_ramt")
    public String getTot_ramt(){
        return tot_ramt;
    }

    @ElVoField(physicalName = "tot_ramt")
    public void setTot_ramt(String tot_ramt){
        this.tot_ramt = tot_ramt;
    }

    @ElVoField(physicalName = "input_schdl_amt")
    public String getInput_schdl_amt(){
        return input_schdl_amt;
    }

    @ElVoField(physicalName = "input_schdl_amt")
    public void setInput_schdl_amt(String input_schdl_amt){
        this.input_schdl_amt = input_schdl_amt;
    }

    @ElVoField(physicalName = "req_typ")
    public String getReq_typ(){
        return req_typ;
    }

    @ElVoField(physicalName = "req_typ")
    public void setReq_typ(String req_typ){
        this.req_typ = req_typ;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
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

    @ElVoField(physicalName = "depthed_syspayno")
    public String getDepthed_syspayno(){
        return depthed_syspayno;
    }

    @ElVoField(physicalName = "depthed_syspayno")
    public void setDepthed_syspayno(String depthed_syspayno){
        this.depthed_syspayno = depthed_syspayno;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public String getDivsn_rspns_syspayno(){
        return divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public void setDivsn_rspns_syspayno(String divsn_rspns_syspayno){
        this.divsn_rspns_syspayno = divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "map_prof")
    public String getMap_prof(){
        return map_prof;
    }

    @ElVoField(physicalName = "map_prof")
    public void setMap_prof(String map_prof){
        this.map_prof = map_prof;
    }

    @ElVoField(physicalName = "map_prof_emp_no")
    public String getMap_prof_emp_no(){
        return map_prof_emp_no;
    }

    @ElVoField(physicalName = "map_prof_emp_no")
    public void setMap_prof_emp_no(String map_prof_emp_no){
        this.map_prof_emp_no = map_prof_emp_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public String getAttach_file_no_01(){
        return attach_file_no_01;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public void setAttach_file_no_01(String attach_file_no_01){
        this.attach_file_no_01 = attach_file_no_01;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "secure_plan")
    public String getSecure_plan(){
        return secure_plan;
    }

    @ElVoField(physicalName = "secure_plan")
    public void setSecure_plan(String secure_plan){
        this.secure_plan = secure_plan;
    }

    @ElVoField(physicalName = "plan_yn")
    public String getPlan_yn(){
        return plan_yn;
    }

    @ElVoField(physicalName = "plan_yn")
    public void setPlan_yn(String plan_yn){
        this.plan_yn = plan_yn;
    }

    @ElVoField(physicalName = "map_prof_entr_ymd")
    public String getMap_prof_entr_ymd(){
        return map_prof_entr_ymd;
    }

    @ElVoField(physicalName = "map_prof_entr_ymd")
    public void setMap_prof_entr_ymd(String map_prof_entr_ymd){
        this.map_prof_entr_ymd = map_prof_entr_ymd;
    }

    @ElVoField(physicalName = "nm_chchar")
    public String getNm_chchar(){
        return nm_chchar;
    }

    @ElVoField(physicalName = "nm_chchar")
    public void setNm_chchar(String nm_chchar){
        this.nm_chchar = nm_chchar;
    }

    @ElVoField(physicalName = "gradt_ymd")
    public String getGradt_ymd(){
        return gradt_ymd;
    }

    @ElVoField(physicalName = "gradt_ymd")
    public void setGradt_ymd(String gradt_ymd){
        this.gradt_ymd = gradt_ymd;
    }

    @ElVoField(physicalName = "prj_start_ymd")
    public String getPrj_start_ymd(){
        return prj_start_ymd;
    }

    @ElVoField(physicalName = "prj_start_ymd")
    public void setPrj_start_ymd(String prj_start_ymd){
        this.prj_start_ymd = prj_start_ymd;
    }

    @ElVoField(physicalName = "prj_cls_ymd")
    public String getPrj_cls_ymd(){
        return prj_cls_ymd;
    }

    @ElVoField(physicalName = "prj_cls_ymd")
    public void setPrj_cls_ymd(String prj_cls_ymd){
        this.prj_cls_ymd = prj_cls_ymd;
    }

    @ElVoField(physicalName = "work_time")
    public String getWork_time(){
        return work_time;
    }

    @ElVoField(physicalName = "work_time")
    public void setWork_time(String work_time){
        this.work_time = work_time;
    }

    @ElVoField(physicalName = "stu_amt_mnt")
    public String getStu_amt_mnt(){
        return stu_amt_mnt;
    }

    @ElVoField(physicalName = "stu_amt_mnt")
    public void setStu_amt_mnt(String stu_amt_mnt){
        this.stu_amt_mnt = stu_amt_mnt;
    }

    @ElVoField(physicalName = "stu_amt_yr")
    public String getStu_amt_yr(){
        return stu_amt_yr;
    }

    @ElVoField(physicalName = "stu_amt_yr")
    public void setStu_amt_yr(String stu_amt_yr){
        this.stu_amt_yr = stu_amt_yr;
    }

    @ElVoField(physicalName = "pruse_contnt")
    public String getPruse_contnt(){
        return pruse_contnt;
    }

    @ElVoField(physicalName = "pruse_contnt")
    public void setPruse_contnt(String pruse_contnt){
        this.pruse_contnt = pruse_contnt;
    }

    @ElVoField(physicalName = "intrv_result")
    public String getIntrv_result(){
        return intrv_result;
    }

    @ElVoField(physicalName = "intrv_result")
    public void setIntrv_result(String intrv_result){
        this.intrv_result = intrv_result;
    }

    @ElVoField(physicalName = "membr_burdn")
    public String getMembr_burdn(){
        return membr_burdn;
    }

    @ElVoField(physicalName = "membr_burdn")
    public void setMembr_burdn(String membr_burdn){
        this.membr_burdn = membr_burdn;
    }

    @ElVoField(physicalName = "salry_label_grp")
    public String getSalry_label_grp(){
        return salry_label_grp;
    }

    @ElVoField(physicalName = "salry_label_grp")
    public void setSalry_label_grp(String salry_label_grp){
        this.salry_label_grp = salry_label_grp;
    }

    @ElVoField(physicalName = "base_ymd")
    public String getBase_ymd(){
        return base_ymd;
    }

    @ElVoField(physicalName = "base_ymd")
    public void setBase_ymd(String base_ymd){
        this.base_ymd = base_ymd;
    }

    @ElVoField(physicalName = "analsal_clsf")
    public String getAnalsal_clsf(){
        return analsal_clsf;
    }

    @ElVoField(physicalName = "analsal_clsf")
    public void setAnalsal_clsf(String analsal_clsf){
        this.analsal_clsf = analsal_clsf;
    }

    @ElVoField(physicalName = "analsal_clsf_nm")
    public String getAnalsal_clsf_nm(){
        return analsal_clsf_nm;
    }

    @ElVoField(physicalName = "analsal_clsf_nm")
    public void setAnalsal_clsf_nm(String analsal_clsf_nm){
        this.analsal_clsf_nm = analsal_clsf_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "analsal")
    public String getAnalsal(){
        return analsal;
    }

    @ElVoField(physicalName = "analsal")
    public void setAnalsal(String analsal){
        this.analsal = analsal;
    }

    @ElVoField(physicalName = "apr_nm")
    public String getApr_nm(){
        return apr_nm;
    }

    @ElVoField(physicalName = "apr_nm")
    public void setApr_nm(String apr_nm){
        this.apr_nm = apr_nm;
    }

    @ElVoField(physicalName = "apr_schl")
    public String getApr_schl(){
        return apr_schl;
    }

    @ElVoField(physicalName = "apr_schl")
    public void setApr_schl(String apr_schl){
        this.apr_schl = apr_schl;
    }

    @ElVoField(physicalName = "save_type")
    public String getSave_type(){
        return save_type;
    }

    @ElVoField(physicalName = "save_type")
    public void setSave_type(String save_type){
        this.save_type = save_type;
    }

    @ElVoField(physicalName = "apr_map_prof")
    public String getApr_map_prof(){
        return apr_map_prof;
    }

    @ElVoField(physicalName = "apr_map_prof")
    public void setApr_map_prof(String apr_map_prof){
        this.apr_map_prof = apr_map_prof;
    }

    @ElVoField(physicalName = "rspns_map_prof_nm")
    public String getRspns_map_prof_nm(){
        return rspns_map_prof_nm;
    }

    @ElVoField(physicalName = "rspns_map_prof_nm")
    public void setRspns_map_prof_nm(String rspns_map_prof_nm){
        this.rspns_map_prof_nm = rspns_map_prof_nm;
    }

    @ElVoField(physicalName = "rspns_empno")
    public String getRspns_empno(){
        return rspns_empno;
    }

    @ElVoField(physicalName = "rspns_empno")
    public void setRspns_empno(String rspns_empno){
        this.rspns_empno = rspns_empno;
    }

    @ElVoField(physicalName = "rspns_posi_nm")
    public String getRspns_posi_nm(){
        return rspns_posi_nm;
    }

    @ElVoField(physicalName = "rspns_posi_nm")
    public void setRspns_posi_nm(String rspns_posi_nm){
        this.rspns_posi_nm = rspns_posi_nm;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public String getRspns_dept_nm(){
        return rspns_dept_nm;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public void setRspns_dept_nm(String rspns_dept_nm){
        this.rspns_dept_nm = rspns_dept_nm;
    }

    @ElVoField(physicalName = "rspns_depthed_nm")
    public String getRspns_depthed_nm(){
        return rspns_depthed_nm;
    }

    @ElVoField(physicalName = "rspns_depthed_nm")
    public void setRspns_depthed_nm(String rspns_depthed_nm){
        this.rspns_depthed_nm = rspns_depthed_nm;
    }

    @ElVoField(physicalName = "rspns_divsn_rspns_nm")
    public String getRspns_divsn_rspns_nm(){
        return rspns_divsn_rspns_nm;
    }

    @ElVoField(physicalName = "rspns_divsn_rspns_nm")
    public void setRspns_divsn_rspns_nm(String rspns_divsn_rspns_nm){
        this.rspns_divsn_rspns_nm = rspns_divsn_rspns_nm;
    }

    @ElVoField(physicalName = "major_nm")
    public String getMajor_nm(){
        return major_nm;
    }

    @ElVoField(physicalName = "major_nm")
    public void setMajor_nm(String major_nm){
        this.major_nm = major_nm;
    }

    @ElVoField(physicalName = "ramt_amt")
    public String getRamt_amt(){
        return ramt_amt;
    }

    @ElVoField(physicalName = "ramt_amt")
    public void setRamt_amt(String ramt_amt){
        this.ramt_amt = ramt_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public String getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(String enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "prj_ymd")
    public String getPrj_ymd(){
        return prj_ymd;
    }

    @ElVoField(physicalName = "prj_ymd")
    public void setPrj_ymd(String prj_ymd){
        this.prj_ymd = prj_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyStuInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("map_prof_syspayno").append("=").append(map_prof_syspayno).append(",");
        sb.append("map_prof_empno").append("=").append(map_prof_empno).append(",");
        sb.append("map_prof_nm").append("=").append(map_prof_nm).append(",");
        sb.append("map_prof_dept_nm").append("=").append(map_prof_dept_nm).append(",");
        sb.append("map_prof_dept_email").append("=").append(map_prof_dept_email).append(",");
        sb.append("stu_nm").append("=").append(stu_nm).append(",");
        sb.append("birth_ymd").append("=").append(birth_ymd).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("sex").append("=").append(sex).append(",");
        sb.append("final_edu").append("=").append(final_edu).append(",");
        sb.append("supt_schl").append("=").append(supt_schl).append(",");
        sb.append("procs").append("=").append(procs).append(",");
        sb.append("major_cd").append("=").append(major_cd).append(",");
        sb.append("major").append("=").append(major).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("last_execute_tim").append("=").append(last_execute_tim).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("work_clsf_cd").append("=").append(work_clsf_cd).append(",");
        sb.append("req_syspayno_email_org").append("=").append(req_syspayno_email_org).append(",");
        sb.append("req_syspayno_email").append("=").append(req_syspayno_email).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("former_latter").append("=").append(former_latter).append(",");
        sb.append("rcmd_no").append("=").append(rcmd_no).append(",");
        sb.append("rcmd_state").append("=").append(rcmd_state).append(",");
        sb.append("encrg_state").append("=").append(encrg_state).append(",");
        sb.append("chk").append("=").append(chk).append(",");
        sb.append("rcmd_updt_syspayno").append("=").append(rcmd_updt_syspayno).append(",");
        sb.append("updateData").append("=").append(updateData).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_empno").append("=").append(accnt_rspns_empno).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("total_cash").append("=").append(total_cash).append(",");
        sb.append("month_fxdamt_amt").append("=").append(month_fxdamt_amt).append(",");
        sb.append("contrct_ymd").append("=").append(contrct_ymd).append(",");
        sb.append("contrct_start_ymd").append("=").append(contrct_start_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("cash_attnce_rt").append("=").append(cash_attnce_rt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("respn_clsf").append("=").append(respn_clsf).append(",");
        sb.append("attnce_prd_ymd").append("=").append(attnce_prd_ymd).append(",");
        sb.append("tot_ramt").append("=").append(tot_ramt).append(",");
        sb.append("input_schdl_amt").append("=").append(input_schdl_amt).append(",");
        sb.append("req_typ").append("=").append(req_typ).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("depthed_syspayno").append("=").append(depthed_syspayno).append(",");
        sb.append("divsn_rspns_syspayno").append("=").append(divsn_rspns_syspayno).append(",");
        sb.append("map_prof").append("=").append(map_prof).append(",");
        sb.append("map_prof_emp_no").append("=").append(map_prof_emp_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_no_01").append("=").append(attach_file_no_01).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("secure_plan").append("=").append(secure_plan).append(",");
        sb.append("plan_yn").append("=").append(plan_yn).append(",");
        sb.append("map_prof_entr_ymd").append("=").append(map_prof_entr_ymd).append(",");
        sb.append("nm_chchar").append("=").append(nm_chchar).append(",");
        sb.append("gradt_ymd").append("=").append(gradt_ymd).append(",");
        sb.append("prj_start_ymd").append("=").append(prj_start_ymd).append(",");
        sb.append("prj_cls_ymd").append("=").append(prj_cls_ymd).append(",");
        sb.append("work_time").append("=").append(work_time).append(",");
        sb.append("stu_amt_mnt").append("=").append(stu_amt_mnt).append(",");
        sb.append("stu_amt_yr").append("=").append(stu_amt_yr).append(",");
        sb.append("pruse_contnt").append("=").append(pruse_contnt).append(",");
        sb.append("intrv_result").append("=").append(intrv_result).append(",");
        sb.append("membr_burdn").append("=").append(membr_burdn).append(",");
        sb.append("salry_label_grp").append("=").append(salry_label_grp).append(",");
        sb.append("base_ymd").append("=").append(base_ymd).append(",");
        sb.append("analsal_clsf").append("=").append(analsal_clsf).append(",");
        sb.append("analsal_clsf_nm").append("=").append(analsal_clsf_nm).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("analsal").append("=").append(analsal).append(",");
        sb.append("apr_nm").append("=").append(apr_nm).append(",");
        sb.append("apr_schl").append("=").append(apr_schl).append(",");
        sb.append("save_type").append("=").append(save_type).append(",");
        sb.append("apr_map_prof").append("=").append(apr_map_prof).append(",");
        sb.append("rspns_map_prof_nm").append("=").append(rspns_map_prof_nm).append(",");
        sb.append("rspns_empno").append("=").append(rspns_empno).append(",");
        sb.append("rspns_posi_nm").append("=").append(rspns_posi_nm).append(",");
        sb.append("rspns_dept_nm").append("=").append(rspns_dept_nm).append(",");
        sb.append("rspns_depthed_nm").append("=").append(rspns_depthed_nm).append(",");
        sb.append("rspns_divsn_rspns_nm").append("=").append(rspns_divsn_rspns_nm).append(",");
        sb.append("major_nm").append("=").append(major_nm).append(",");
        sb.append("ramt_amt").append("=").append(ramt_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("prj_ymd").append("=").append(prj_ymd);
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
