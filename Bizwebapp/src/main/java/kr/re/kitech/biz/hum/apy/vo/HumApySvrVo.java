package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApySvrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApySvrVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "role_type", physicalName = "role_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_type;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서생성일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "duty_cd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;

    @ElDtoField(logicalName = "job_cd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;

    @ElDtoField(logicalName = "job_clsf", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "work_land", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land;

    @ElDtoField(logicalName = "중간정산유형", physicalName = "middle_adjst_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_typ;

    @ElDtoField(logicalName = "계약일자", physicalName = "conct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conct_ymd;

    @ElDtoField(logicalName = "중간정산여부", physicalName = "middle_adjst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_yn;

    @ElDtoField(logicalName = "동일아이디사용여부", physicalName = "equal_id_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equal_id_yn;

    @ElDtoField(logicalName = "계좌유형", physicalName = "bankaccnt_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_typ;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "정년예정일", physicalName = "main_yr_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_yr_schdl_ymd;

    @ElDtoField(logicalName = "계약종료일자", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "근속(퇴직금)기산일", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "퇴직(중간정산)희망일", physicalName = "retire_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_hope_ymd;

    @ElDtoField(logicalName = "퇴직사유", physicalName = "retire_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_resn;

    @ElDtoField(logicalName = "중간정산사유", physicalName = "middle_adjst_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_adjst_resn;

    @ElDtoField(logicalName = "이직유형", physicalName = "trans_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_typ;

    @ElDtoField(logicalName = "이직기관명", physicalName = "trans_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_agncy_nm;

    @ElDtoField(logicalName = "인수시스템개인번호", physicalName = "psn_no_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_syspayno;

    @ElDtoField(logicalName = "인수자직급", physicalName = "psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_posi_nm;

    @ElDtoField(logicalName = "인수부서코드", physicalName = "psn_no_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_dept_cd;

    @ElDtoField(logicalName = "인수부서신설일", physicalName = "psn_no_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_dept_new_ymd;

    @ElDtoField(logicalName = "우편번호", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "기본주소", physicalName = "base_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_addr;

    @ElDtoField(logicalName = "상세주소", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "집전화", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "핸드폰", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "data_essen_yn", physicalName = "data_essen_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_essen_yn;

    @ElDtoField(logicalName = "data_opt_yn", physicalName = "data_opt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_opt_yn;

    @ElDtoField(logicalName = "이메일수신여부", physicalName = "email_send_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_send_yn;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "req_ymd_from", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "req_ymd_to", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "retire_resn_nm", physicalName = "retire_resn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_resn_nm;

    @ElDtoField(logicalName = "psn_no_dept_cd_nm", physicalName = "psn_no_dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_dept_cd_nm;

    @ElDtoField(logicalName = "psn_no_empno", physicalName = "psn_no_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_empno;

    @ElDtoField(logicalName = "psn_no_syspayno_nm", physicalName = "psn_no_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_syspayno_nm;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "org_email", physicalName = "org_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_email;

    @ElDtoField(logicalName = "id", physicalName = "id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String id;

    @ElDtoField(logicalName = "addr_postmt_no", physicalName = "addr_postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_postmt_no;

    @ElDtoField(logicalName = "addr_base", physicalName = "addr_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_base;

    @ElDtoField(logicalName = "addr_detls", physicalName = "addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_detls;

    @ElDtoField(logicalName = "psn_dept_nm", physicalName = "psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_dept_nm;

    @ElDtoField(logicalName = "psn_email", physicalName = "psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_email;

    @ElDtoField(logicalName = "req_empno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "occutyp_cd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElDtoField(logicalName = "occugrp_cd", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "card_keeper", physicalName = "card_keeper", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_keeper;

    @ElDtoField(logicalName = "pruse_respn_psn", physicalName = "pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn;

    @ElDtoField(logicalName = "pruse_respn_psn_nm", physicalName = "pruse_respn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn_nm;

    @ElDtoField(logicalName = "exp_retire_hope_ymd", physicalName = "exp_retire_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exp_retire_hope_ymd;

    @ElDtoField(logicalName = "fomat_unit", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "appont_contrct_ymd", physicalName = "appont_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_contrct_ymd;

    @ElDtoField(logicalName = "appont_cls_ymd", physicalName = "appont_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_cls_ymd;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "sci_tech_anuty", physicalName = "sci_tech_anuty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_anuty;

    @ElDtoField(logicalName = "savng_shape_dedct", physicalName = "savng_shape_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String savng_shape_dedct;

    @ElDtoField(logicalName = "own_driv_sub_pay", physicalName = "own_driv_sub_pay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String own_driv_sub_pay;

    @ElDtoField(logicalName = "tot_bankaccnt_no", physicalName = "tot_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bankaccnt_no;

    @ElDtoField(logicalName = "sema_mm", physicalName = "sema_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sema_mm;

    @ElDtoField(logicalName = "carmdl", physicalName = "carmdl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String carmdl;

    @ElDtoField(logicalName = "car_no", physicalName = "car_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_no;

    @ElDtoField(logicalName = "car_clr", physicalName = "car_clr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_clr;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "psn_nm", physicalName = "psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_nm;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "전자결제제목", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "첨부파일1", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "자산담당자", physicalName = "manager4_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager4_id;

    @ElDtoField(logicalName = "연구관리담당자", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "환용책임자", physicalName = "tc_manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tc_manager_id;

    @ElDtoField(logicalName = "퇴직신청", physicalName = "humApyDeptChkVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> humApyDeptChkVoList;

    @ElDtoField(logicalName = "aprLine", physicalName = "aprLine", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aprLine;

    @ElDtoField(logicalName = "aprLineTyp", physicalName = "aprLineTyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aprLineTyp;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "typ_nm", physicalName = "typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String typ_nm;

    @ElDtoField(logicalName = "work_clsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "user_div", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "appont_no", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "appont_typ", physicalName = "appont_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_typ;

    @ElDtoField(logicalName = "appont_prcs_ymd", physicalName = "appont_prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_prcs_ymd;

    @ElDtoField(logicalName = "appont_start_ymd", physicalName = "appont_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_start_ymd;

    @ElDtoField(logicalName = "appont_befr_dept_cd", physicalName = "appont_befr_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_dept_cd;

    @ElDtoField(logicalName = "appont_befr_dept_new_ymd", physicalName = "appont_befr_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_dept_new_ymd;

    @ElDtoField(logicalName = "appont_befr_occugrp_cd", physicalName = "appont_befr_occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_occugrp_cd;

    @ElDtoField(logicalName = "appont_befr_occutyp_cd", physicalName = "appont_befr_occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_occutyp_cd;

    @ElDtoField(logicalName = "appont_befr_posi_cd", physicalName = "appont_befr_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_posi_cd;

    @ElDtoField(logicalName = "appont_befr_cd", physicalName = "appont_befr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_cd;

    @ElDtoField(logicalName = "appont_befr_job_cd", physicalName = "appont_befr_job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_job_cd;

    @ElDtoField(logicalName = "appont_befr_job_clsf", physicalName = "appont_befr_job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_job_clsf;

    @ElDtoField(logicalName = "appont_befr_work_land", physicalName = "appont_befr_work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_befr_work_land;

    @ElDtoField(logicalName = "appont_resn", physicalName = "appont_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_resn;

    @ElDtoField(logicalName = "appont_resn_mnt", physicalName = "appont_resn_mnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_resn_mnt;

    @ElDtoField(logicalName = "apprvl_carer_anal", physicalName = "apprvl_carer_anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_carer_anal;

    @ElDtoField(logicalName = "cmitt_nm", physicalName = "cmitt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_nm;

    @ElDtoField(logicalName = "cmitt_duty", physicalName = "cmitt_duty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_duty;

    @ElDtoField(logicalName = "large_excpt_work_nm", physicalName = "large_excpt_work_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String large_excpt_work_nm;

    @ElDtoField(logicalName = "estb_nm", physicalName = "estb_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String estb_nm;

    @ElDtoField(logicalName = "dispatch_loc", physicalName = "dispatch_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_loc;

    @ElDtoField(logicalName = "appont_prcs", physicalName = "appont_prcs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_prcs;

    @ElDtoField(logicalName = "ofca_no", physicalName = "ofca_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofca_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "ref_tab", physicalName = "ref_tab", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_tab;

    @ElDtoField(logicalName = "ref_data", physicalName = "ref_data", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_data;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "food_manger_yn", physicalName = "food_manger_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String food_manger_yn;

    @ElDtoField(logicalName = "업무인수자 겸직부서코드", physicalName = "psn_no_adjob_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_adjob_dept_cd;

    @ElDtoField(logicalName = "업무인수자 겸직부서생성일", physicalName = "psn_no_adjob_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_no_adjob_dept_new_ymd;

    @ElDtoField(logicalName = "업무인수자 겸직부서명", physicalName = "psn_adjob_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_adjob_dept_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "role_type")
    public String getRole_type(){
        return role_type;
    }

    @ElVoField(physicalName = "role_type")
    public void setRole_type(String role_type){
        this.role_type = role_type;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "middle_adjst_typ")
    public String getMiddle_adjst_typ(){
        return middle_adjst_typ;
    }

    @ElVoField(physicalName = "middle_adjst_typ")
    public void setMiddle_adjst_typ(String middle_adjst_typ){
        this.middle_adjst_typ = middle_adjst_typ;
    }

    @ElVoField(physicalName = "conct_ymd")
    public String getConct_ymd(){
        return conct_ymd;
    }

    @ElVoField(physicalName = "conct_ymd")
    public void setConct_ymd(String conct_ymd){
        this.conct_ymd = conct_ymd;
    }

    @ElVoField(physicalName = "middle_adjst_yn")
    public String getMiddle_adjst_yn(){
        return middle_adjst_yn;
    }

    @ElVoField(physicalName = "middle_adjst_yn")
    public void setMiddle_adjst_yn(String middle_adjst_yn){
        this.middle_adjst_yn = middle_adjst_yn;
    }

    @ElVoField(physicalName = "equal_id_yn")
    public String getEqual_id_yn(){
        return equal_id_yn;
    }

    @ElVoField(physicalName = "equal_id_yn")
    public void setEqual_id_yn(String equal_id_yn){
        this.equal_id_yn = equal_id_yn;
    }

    @ElVoField(physicalName = "bankaccnt_typ")
    public String getBankaccnt_typ(){
        return bankaccnt_typ;
    }

    @ElVoField(physicalName = "bankaccnt_typ")
    public void setBankaccnt_typ(String bankaccnt_typ){
        this.bankaccnt_typ = bankaccnt_typ;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "main_yr_schdl_ymd")
    public String getMain_yr_schdl_ymd(){
        return main_yr_schdl_ymd;
    }

    @ElVoField(physicalName = "main_yr_schdl_ymd")
    public void setMain_yr_schdl_ymd(String main_yr_schdl_ymd){
        this.main_yr_schdl_ymd = main_yr_schdl_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "retire_hope_ymd")
    public String getRetire_hope_ymd(){
        return retire_hope_ymd;
    }

    @ElVoField(physicalName = "retire_hope_ymd")
    public void setRetire_hope_ymd(String retire_hope_ymd){
        this.retire_hope_ymd = retire_hope_ymd;
    }

    @ElVoField(physicalName = "retire_resn")
    public String getRetire_resn(){
        return retire_resn;
    }

    @ElVoField(physicalName = "retire_resn")
    public void setRetire_resn(String retire_resn){
        this.retire_resn = retire_resn;
    }

    @ElVoField(physicalName = "middle_adjst_resn")
    public String getMiddle_adjst_resn(){
        return middle_adjst_resn;
    }

    @ElVoField(physicalName = "middle_adjst_resn")
    public void setMiddle_adjst_resn(String middle_adjst_resn){
        this.middle_adjst_resn = middle_adjst_resn;
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

    @ElVoField(physicalName = "psn_no_syspayno")
    public String getPsn_no_syspayno(){
        return psn_no_syspayno;
    }

    @ElVoField(physicalName = "psn_no_syspayno")
    public void setPsn_no_syspayno(String psn_no_syspayno){
        this.psn_no_syspayno = psn_no_syspayno;
    }

    @ElVoField(physicalName = "psn_posi_nm")
    public String getPsn_posi_nm(){
        return psn_posi_nm;
    }

    @ElVoField(physicalName = "psn_posi_nm")
    public void setPsn_posi_nm(String psn_posi_nm){
        this.psn_posi_nm = psn_posi_nm;
    }

    @ElVoField(physicalName = "psn_no_dept_cd")
    public String getPsn_no_dept_cd(){
        return psn_no_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_dept_cd")
    public void setPsn_no_dept_cd(String psn_no_dept_cd){
        this.psn_no_dept_cd = psn_no_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_dept_new_ymd")
    public String getPsn_no_dept_new_ymd(){
        return psn_no_dept_new_ymd;
    }

    @ElVoField(physicalName = "psn_no_dept_new_ymd")
    public void setPsn_no_dept_new_ymd(String psn_no_dept_new_ymd){
        this.psn_no_dept_new_ymd = psn_no_dept_new_ymd;
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

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "data_essen_yn")
    public String getData_essen_yn(){
        return data_essen_yn;
    }

    @ElVoField(physicalName = "data_essen_yn")
    public void setData_essen_yn(String data_essen_yn){
        this.data_essen_yn = data_essen_yn;
    }

    @ElVoField(physicalName = "data_opt_yn")
    public String getData_opt_yn(){
        return data_opt_yn;
    }

    @ElVoField(physicalName = "data_opt_yn")
    public void setData_opt_yn(String data_opt_yn){
        this.data_opt_yn = data_opt_yn;
    }

    @ElVoField(physicalName = "email_send_yn")
    public String getEmail_send_yn(){
        return email_send_yn;
    }

    @ElVoField(physicalName = "email_send_yn")
    public void setEmail_send_yn(String email_send_yn){
        this.email_send_yn = email_send_yn;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "retire_resn_nm")
    public String getRetire_resn_nm(){
        return retire_resn_nm;
    }

    @ElVoField(physicalName = "retire_resn_nm")
    public void setRetire_resn_nm(String retire_resn_nm){
        this.retire_resn_nm = retire_resn_nm;
    }

    @ElVoField(physicalName = "psn_no_dept_cd_nm")
    public String getPsn_no_dept_cd_nm(){
        return psn_no_dept_cd_nm;
    }

    @ElVoField(physicalName = "psn_no_dept_cd_nm")
    public void setPsn_no_dept_cd_nm(String psn_no_dept_cd_nm){
        this.psn_no_dept_cd_nm = psn_no_dept_cd_nm;
    }

    @ElVoField(physicalName = "psn_no_empno")
    public String getPsn_no_empno(){
        return psn_no_empno;
    }

    @ElVoField(physicalName = "psn_no_empno")
    public void setPsn_no_empno(String psn_no_empno){
        this.psn_no_empno = psn_no_empno;
    }

    @ElVoField(physicalName = "psn_no_syspayno_nm")
    public String getPsn_no_syspayno_nm(){
        return psn_no_syspayno_nm;
    }

    @ElVoField(physicalName = "psn_no_syspayno_nm")
    public void setPsn_no_syspayno_nm(String psn_no_syspayno_nm){
        this.psn_no_syspayno_nm = psn_no_syspayno_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "org_email")
    public String getOrg_email(){
        return org_email;
    }

    @ElVoField(physicalName = "org_email")
    public void setOrg_email(String org_email){
        this.org_email = org_email;
    }

    @ElVoField(physicalName = "id")
    public String getId(){
        return id;
    }

    @ElVoField(physicalName = "id")
    public void setId(String id){
        this.id = id;
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

    @ElVoField(physicalName = "psn_dept_nm")
    public String getPsn_dept_nm(){
        return psn_dept_nm;
    }

    @ElVoField(physicalName = "psn_dept_nm")
    public void setPsn_dept_nm(String psn_dept_nm){
        this.psn_dept_nm = psn_dept_nm;
    }

    @ElVoField(physicalName = "psn_email")
    public String getPsn_email(){
        return psn_email;
    }

    @ElVoField(physicalName = "psn_email")
    public void setPsn_email(String psn_email){
        this.psn_email = psn_email;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        return occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "card_keeper")
    public String getCard_keeper(){
        return card_keeper;
    }

    @ElVoField(physicalName = "card_keeper")
    public void setCard_keeper(String card_keeper){
        this.card_keeper = card_keeper;
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

    @ElVoField(physicalName = "exp_retire_hope_ymd")
    public String getExp_retire_hope_ymd(){
        return exp_retire_hope_ymd;
    }

    @ElVoField(physicalName = "exp_retire_hope_ymd")
    public void setExp_retire_hope_ymd(String exp_retire_hope_ymd){
        this.exp_retire_hope_ymd = exp_retire_hope_ymd;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
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

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public String getSci_tech_anuty(){
        return sci_tech_anuty;
    }

    @ElVoField(physicalName = "sci_tech_anuty")
    public void setSci_tech_anuty(String sci_tech_anuty){
        this.sci_tech_anuty = sci_tech_anuty;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public String getSavng_shape_dedct(){
        return savng_shape_dedct;
    }

    @ElVoField(physicalName = "savng_shape_dedct")
    public void setSavng_shape_dedct(String savng_shape_dedct){
        this.savng_shape_dedct = savng_shape_dedct;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public String getOwn_driv_sub_pay(){
        return own_driv_sub_pay;
    }

    @ElVoField(physicalName = "own_driv_sub_pay")
    public void setOwn_driv_sub_pay(String own_driv_sub_pay){
        this.own_driv_sub_pay = own_driv_sub_pay;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public String getTot_bankaccnt_no(){
        return tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "tot_bankaccnt_no")
    public void setTot_bankaccnt_no(String tot_bankaccnt_no){
        this.tot_bankaccnt_no = tot_bankaccnt_no;
    }

    @ElVoField(physicalName = "sema_mm")
    public String getSema_mm(){
        return sema_mm;
    }

    @ElVoField(physicalName = "sema_mm")
    public void setSema_mm(String sema_mm){
        this.sema_mm = sema_mm;
    }

    @ElVoField(physicalName = "carmdl")
    public String getCarmdl(){
        return carmdl;
    }

    @ElVoField(physicalName = "carmdl")
    public void setCarmdl(String carmdl){
        this.carmdl = carmdl;
    }

    @ElVoField(physicalName = "car_no")
    public String getCar_no(){
        return car_no;
    }

    @ElVoField(physicalName = "car_no")
    public void setCar_no(String car_no){
        this.car_no = car_no;
    }

    @ElVoField(physicalName = "car_clr")
    public String getCar_clr(){
        return car_clr;
    }

    @ElVoField(physicalName = "car_clr")
    public void setCar_clr(String car_clr){
        this.car_clr = car_clr;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "psn_nm")
    public String getPsn_nm(){
        return psn_nm;
    }

    @ElVoField(physicalName = "psn_nm")
    public void setPsn_nm(String psn_nm){
        this.psn_nm = psn_nm;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "manager4_id")
    public String getManager4_id(){
        return manager4_id;
    }

    @ElVoField(physicalName = "manager4_id")
    public void setManager4_id(String manager4_id){
        this.manager4_id = manager4_id;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "tc_manager_id")
    public String getTc_manager_id(){
        return tc_manager_id;
    }

    @ElVoField(physicalName = "tc_manager_id")
    public void setTc_manager_id(String tc_manager_id){
        this.tc_manager_id = tc_manager_id;
    }

    @ElVoField(physicalName = "humApyDeptChkVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> getHumApyDeptChkVoList(){
        return humApyDeptChkVoList;
    }

    @ElVoField(physicalName = "humApyDeptChkVoList")
    public void setHumApyDeptChkVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo> humApyDeptChkVoList){
        this.humApyDeptChkVoList = humApyDeptChkVoList;
    }

    @ElVoField(physicalName = "aprLine")
    public String getAprLine(){
        return aprLine;
    }

    @ElVoField(physicalName = "aprLine")
    public void setAprLine(String aprLine){
        this.aprLine = aprLine;
    }

    @ElVoField(physicalName = "aprLineTyp")
    public String getAprLineTyp(){
        return aprLineTyp;
    }

    @ElVoField(physicalName = "aprLineTyp")
    public void setAprLineTyp(String aprLineTyp){
        this.aprLineTyp = aprLineTyp;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "typ_nm")
    public String getTyp_nm(){
        return typ_nm;
    }

    @ElVoField(physicalName = "typ_nm")
    public void setTyp_nm(String typ_nm){
        this.typ_nm = typ_nm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
    }

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

    @ElVoField(physicalName = "food_manger_yn")
    public String getFood_manger_yn(){
        return food_manger_yn;
    }

    @ElVoField(physicalName = "food_manger_yn")
    public void setFood_manger_yn(String food_manger_yn){
        this.food_manger_yn = food_manger_yn;
    }

    @ElVoField(physicalName = "psn_no_adjob_dept_cd")
    public String getPsn_no_adjob_dept_cd(){
        return psn_no_adjob_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_adjob_dept_cd")
    public void setPsn_no_adjob_dept_cd(String psn_no_adjob_dept_cd){
        this.psn_no_adjob_dept_cd = psn_no_adjob_dept_cd;
    }

    @ElVoField(physicalName = "psn_no_adjob_dept_new_ymd")
    public String getPsn_no_adjob_dept_new_ymd(){
        return psn_no_adjob_dept_new_ymd;
    }

    @ElVoField(physicalName = "psn_no_adjob_dept_new_ymd")
    public void setPsn_no_adjob_dept_new_ymd(String psn_no_adjob_dept_new_ymd){
        this.psn_no_adjob_dept_new_ymd = psn_no_adjob_dept_new_ymd;
    }

    @ElVoField(physicalName = "psn_adjob_dept_nm")
    public String getPsn_adjob_dept_nm(){
        return psn_adjob_dept_nm;
    }

    @ElVoField(physicalName = "psn_adjob_dept_nm")
    public void setPsn_adjob_dept_nm(String psn_adjob_dept_nm){
        this.psn_adjob_dept_nm = psn_adjob_dept_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApySvrVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("role_type").append("=").append(role_type).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("duty_cd").append("=").append(duty_cd).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("middle_adjst_typ").append("=").append(middle_adjst_typ).append(",");
        sb.append("conct_ymd").append("=").append(conct_ymd).append(",");
        sb.append("middle_adjst_yn").append("=").append(middle_adjst_yn).append(",");
        sb.append("equal_id_yn").append("=").append(equal_id_yn).append(",");
        sb.append("bankaccnt_typ").append("=").append(bankaccnt_typ).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("main_yr_schdl_ymd").append("=").append(main_yr_schdl_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("retire_hope_ymd").append("=").append(retire_hope_ymd).append(",");
        sb.append("retire_resn").append("=").append(retire_resn).append(",");
        sb.append("middle_adjst_resn").append("=").append(middle_adjst_resn).append(",");
        sb.append("trans_typ").append("=").append(trans_typ).append(",");
        sb.append("trans_agncy_nm").append("=").append(trans_agncy_nm).append(",");
        sb.append("psn_no_syspayno").append("=").append(psn_no_syspayno).append(",");
        sb.append("psn_posi_nm").append("=").append(psn_posi_nm).append(",");
        sb.append("psn_no_dept_cd").append("=").append(psn_no_dept_cd).append(",");
        sb.append("psn_no_dept_new_ymd").append("=").append(psn_no_dept_new_ymd).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("base_addr").append("=").append(base_addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("data_essen_yn").append("=").append(data_essen_yn).append(",");
        sb.append("data_opt_yn").append("=").append(data_opt_yn).append(",");
        sb.append("email_send_yn").append("=").append(email_send_yn).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_resn_nm").append("=").append(retire_resn_nm).append(",");
        sb.append("psn_no_dept_cd_nm").append("=").append(psn_no_dept_cd_nm).append(",");
        sb.append("psn_no_empno").append("=").append(psn_no_empno).append(",");
        sb.append("psn_no_syspayno_nm").append("=").append(psn_no_syspayno_nm).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("org_email").append("=").append(org_email).append(",");
        sb.append("id").append("=").append(id).append(",");
        sb.append("addr_postmt_no").append("=").append(addr_postmt_no).append(",");
        sb.append("addr_base").append("=").append(addr_base).append(",");
        sb.append("addr_detls").append("=").append(addr_detls).append(",");
        sb.append("psn_dept_nm").append("=").append(psn_dept_nm).append(",");
        sb.append("psn_email").append("=").append(psn_email).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("card_keeper").append("=").append(card_keeper).append(",");
        sb.append("pruse_respn_psn").append("=").append(pruse_respn_psn).append(",");
        sb.append("pruse_respn_psn_nm").append("=").append(pruse_respn_psn_nm).append(",");
        sb.append("exp_retire_hope_ymd").append("=").append(exp_retire_hope_ymd).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("appont_contrct_ymd").append("=").append(appont_contrct_ymd).append(",");
        sb.append("appont_cls_ymd").append("=").append(appont_cls_ymd).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("sci_tech_anuty").append("=").append(sci_tech_anuty).append(",");
        sb.append("savng_shape_dedct").append("=").append(savng_shape_dedct).append(",");
        sb.append("own_driv_sub_pay").append("=").append(own_driv_sub_pay).append(",");
        sb.append("tot_bankaccnt_no").append("=").append(tot_bankaccnt_no).append(",");
        sb.append("sema_mm").append("=").append(sema_mm).append(",");
        sb.append("carmdl").append("=").append(carmdl).append(",");
        sb.append("car_no").append("=").append(car_no).append(",");
        sb.append("car_clr").append("=").append(car_clr).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("psn_nm").append("=").append(psn_nm).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("manager4_id").append("=").append(manager4_id).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("tc_manager_id").append("=").append(tc_manager_id).append(",");
        sb.append("humApyDeptChkVoList").append("=").append(humApyDeptChkVoList).append(",");
        sb.append("aprLine").append("=").append(aprLine).append(",");
        sb.append("aprLineTyp").append("=").append(aprLineTyp).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("typ_nm").append("=").append(typ_nm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("appont_typ").append("=").append(appont_typ).append(",");
        sb.append("appont_prcs_ymd").append("=").append(appont_prcs_ymd).append(",");
        sb.append("appont_start_ymd").append("=").append(appont_start_ymd).append(",");
        sb.append("appont_befr_dept_cd").append("=").append(appont_befr_dept_cd).append(",");
        sb.append("appont_befr_dept_new_ymd").append("=").append(appont_befr_dept_new_ymd).append(",");
        sb.append("appont_befr_occugrp_cd").append("=").append(appont_befr_occugrp_cd).append(",");
        sb.append("appont_befr_occutyp_cd").append("=").append(appont_befr_occutyp_cd).append(",");
        sb.append("appont_befr_posi_cd").append("=").append(appont_befr_posi_cd).append(",");
        sb.append("appont_befr_cd").append("=").append(appont_befr_cd).append(",");
        sb.append("appont_befr_job_cd").append("=").append(appont_befr_job_cd).append(",");
        sb.append("appont_befr_job_clsf").append("=").append(appont_befr_job_clsf).append(",");
        sb.append("appont_befr_work_land").append("=").append(appont_befr_work_land).append(",");
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
        sb.append("food_manger_yn").append("=").append(food_manger_yn).append(",");
        sb.append("psn_no_adjob_dept_cd").append("=").append(psn_no_adjob_dept_cd).append(",");
        sb.append("psn_no_adjob_dept_new_ymd").append("=").append(psn_no_adjob_dept_new_ymd).append(",");
        sb.append("psn_adjob_dept_nm").append("=").append(psn_adjob_dept_nm);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; humApyDeptChkVoList != null && i < humApyDeptChkVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyDeptChkVo)humApyDeptChkVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
