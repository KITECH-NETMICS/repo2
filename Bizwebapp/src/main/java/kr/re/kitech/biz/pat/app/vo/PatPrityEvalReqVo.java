package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPrityEvalReqExp")
public class PatPrityEvalReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPrityEvalReqVo(){
    }

    @ElDtoField(logicalName = "prityStartYmd", physicalName = "prity_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_start_ymd;

    @ElDtoField(logicalName = "prityEndYmd", physicalName = "prity_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_end_ymd;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "pritySyspayno", physicalName = "prity_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_syspayno;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "refNo", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "prityEvalReqNo", physicalName = "prity_eval_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_req_no;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "prityNm", physicalName = "prity_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_nm;

    @ElDtoField(logicalName = "prityEmpno", physicalName = "prity_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_empno;

    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "reqResn", physicalName = "req_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_resn;

    @ElDtoField(logicalName = "reqSyspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "reqDeptCd", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "reqDeptNewYmd", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "rptPrityDate", physicalName = "rpt_prity_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_prity_date;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "prjTerm", physicalName = "prj_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_term;

    @ElDtoField(logicalName = "bsnsCdInoutNm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "blongClsf", physicalName = "blong_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf;

    @ElDtoField(logicalName = "blongCd", physicalName = "blong_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_cd;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "blongNm", physicalName = "blong_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_nm;

    @ElDtoField(logicalName = "nmKrn", physicalName = "nm_krn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_krn;

    @ElDtoField(logicalName = "nmEng", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "residRegstNo", physicalName = "resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_regst_no;

    @ElDtoField(logicalName = "residNoDis", physicalName = "resid_no_dis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no_dis;

    @ElDtoField(logicalName = "contacLoc", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "stakeRt", physicalName = "stake_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_rt;

    @ElDtoField(logicalName = "stakeDept", physicalName = "stake_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_dept;

    @ElDtoField(logicalName = "invntPsnClsf", physicalName = "invnt_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf;

    @ElDtoField(logicalName = "transEx", physicalName = "trans_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_ex;

    @ElDtoField(logicalName = "coInvntAffirEx", physicalName = "co_invnt_affir_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_affir_ex;

    @ElDtoField(logicalName = "coInvntAffirYmd", physicalName = "co_invnt_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_affir_ymd;

    @ElDtoField(logicalName = "coInvntAffirRmk", physicalName = "co_invnt_affir_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_affir_rmk;

    @ElDtoField(logicalName = "coInvntRetnYmd", physicalName = "co_invnt_retn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_retn_ymd;

    @ElDtoField(logicalName = "coInvntRetnRmk", physicalName = "co_invnt_retn_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_retn_rmk;

    @ElDtoField(logicalName = "workClsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "workClsfNm", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "techFeeClsf", physicalName = "tech_fee_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee_clsf;

    @ElDtoField(logicalName = "firstPrePrjNo", physicalName = "first_pre_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String first_pre_prj_no;

    @ElDtoField(logicalName = "mouStateNm", physicalName = "mou_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_state_nm;

    @ElDtoField(logicalName = "techFeeNo", physicalName = "tech_fee_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee_no;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "techNm", physicalName = "tech_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_nm;

    @ElDtoField(logicalName = "permitClsfNm", physicalName = "permit_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String permit_clsf_nm;

    @ElDtoField(logicalName = "mouContrctYmd", physicalName = "mou_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd;

    @ElDtoField(logicalName = "contrctClsYmd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "rspnsNm", physicalName = "rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_nm;

    @ElDtoField(logicalName = "contrctFee", physicalName = "contrct_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_fee;

    @ElDtoField(logicalName = "oficDepstAmt", physicalName = "ofic_depst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_depst_amt;

    @ElDtoField(logicalName = "uiId", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "mngmtItem7", physicalName = "mngmt_item_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_7;

    @ElDtoField(logicalName = "giveupReqNo", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "dpReqNo", physicalName = "dp_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_req_no;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "docu_clsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "no_type", physicalName = "no_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_type;

    @ElDtoField(logicalName = "blong_clsf_nm", physicalName = "blong_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf_nm;

    @ElDtoField(logicalName = "invnt_psn_clsf_nm", physicalName = "invnt_psn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf_nm;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "req_nm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "main_key", physicalName = "main_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_key;

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "result", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "researcher_id", physicalName = "researcher_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researcher_id;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "ListVo", physicalName = "aprGrid01", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> aprGrid01;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "endpoint", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElVoField(physicalName = "prity_start_ymd")
    public String getPrity_start_ymd(){
        return prity_start_ymd;
    }

    @ElVoField(physicalName = "prity_start_ymd")
    public void setPrity_start_ymd(String prity_start_ymd){
        this.prity_start_ymd = prity_start_ymd;
    }

    @ElVoField(physicalName = "prity_end_ymd")
    public String getPrity_end_ymd(){
        return prity_end_ymd;
    }

    @ElVoField(physicalName = "prity_end_ymd")
    public void setPrity_end_ymd(String prity_end_ymd){
        this.prity_end_ymd = prity_end_ymd;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "prity_syspayno")
    public String getPrity_syspayno(){
        return prity_syspayno;
    }

    @ElVoField(physicalName = "prity_syspayno")
    public void setPrity_syspayno(String prity_syspayno){
        this.prity_syspayno = prity_syspayno;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public String getPrity_eval_req_no(){
        return prity_eval_req_no;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public void setPrity_eval_req_no(String prity_eval_req_no){
        this.prity_eval_req_no = prity_eval_req_no;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "prity_nm")
    public String getPrity_nm(){
        return prity_nm;
    }

    @ElVoField(physicalName = "prity_nm")
    public void setPrity_nm(String prity_nm){
        this.prity_nm = prity_nm;
    }

    @ElVoField(physicalName = "prity_empno")
    public String getPrity_empno(){
        return prity_empno;
    }

    @ElVoField(physicalName = "prity_empno")
    public void setPrity_empno(String prity_empno){
        this.prity_empno = prity_empno;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "req_resn")
    public String getReq_resn(){
        return req_resn;
    }

    @ElVoField(physicalName = "req_resn")
    public void setReq_resn(String req_resn){
        this.req_resn = req_resn;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
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

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "rpt_prity_date")
    public String getRpt_prity_date(){
        return rpt_prity_date;
    }

    @ElVoField(physicalName = "rpt_prity_date")
    public void setRpt_prity_date(String rpt_prity_date){
        this.rpt_prity_date = rpt_prity_date;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "prj_term")
    public String getPrj_term(){
        return prj_term;
    }

    @ElVoField(physicalName = "prj_term")
    public void setPrj_term(String prj_term){
        this.prj_term = prj_term;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "blong_clsf")
    public String getBlong_clsf(){
        return blong_clsf;
    }

    @ElVoField(physicalName = "blong_clsf")
    public void setBlong_clsf(String blong_clsf){
        this.blong_clsf = blong_clsf;
    }

    @ElVoField(physicalName = "blong_cd")
    public String getBlong_cd(){
        return blong_cd;
    }

    @ElVoField(physicalName = "blong_cd")
    public void setBlong_cd(String blong_cd){
        this.blong_cd = blong_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "blong_nm")
    public String getBlong_nm(){
        return blong_nm;
    }

    @ElVoField(physicalName = "blong_nm")
    public void setBlong_nm(String blong_nm){
        this.blong_nm = blong_nm;
    }

    @ElVoField(physicalName = "nm_krn")
    public String getNm_krn(){
        return nm_krn;
    }

    @ElVoField(physicalName = "nm_krn")
    public void setNm_krn(String nm_krn){
        this.nm_krn = nm_krn;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public String getResid_regst_no(){
        return resid_regst_no;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public void setResid_regst_no(String resid_regst_no){
        this.resid_regst_no = resid_regst_no;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public String getResid_no_dis(){
        return resid_no_dis;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public void setResid_no_dis(String resid_no_dis){
        this.resid_no_dis = resid_no_dis;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
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

    @ElVoField(physicalName = "stake_rt")
    public String getStake_rt(){
        return stake_rt;
    }

    @ElVoField(physicalName = "stake_rt")
    public void setStake_rt(String stake_rt){
        this.stake_rt = stake_rt;
    }

    @ElVoField(physicalName = "stake_dept")
    public String getStake_dept(){
        return stake_dept;
    }

    @ElVoField(physicalName = "stake_dept")
    public void setStake_dept(String stake_dept){
        this.stake_dept = stake_dept;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public String getInvnt_psn_clsf(){
        return invnt_psn_clsf;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public void setInvnt_psn_clsf(String invnt_psn_clsf){
        this.invnt_psn_clsf = invnt_psn_clsf;
    }

    @ElVoField(physicalName = "trans_ex")
    public String getTrans_ex(){
        return trans_ex;
    }

    @ElVoField(physicalName = "trans_ex")
    public void setTrans_ex(String trans_ex){
        this.trans_ex = trans_ex;
    }

    @ElVoField(physicalName = "co_invnt_affir_ex")
    public String getCo_invnt_affir_ex(){
        return co_invnt_affir_ex;
    }

    @ElVoField(physicalName = "co_invnt_affir_ex")
    public void setCo_invnt_affir_ex(String co_invnt_affir_ex){
        this.co_invnt_affir_ex = co_invnt_affir_ex;
    }

    @ElVoField(physicalName = "co_invnt_affir_ymd")
    public String getCo_invnt_affir_ymd(){
        return co_invnt_affir_ymd;
    }

    @ElVoField(physicalName = "co_invnt_affir_ymd")
    public void setCo_invnt_affir_ymd(String co_invnt_affir_ymd){
        this.co_invnt_affir_ymd = co_invnt_affir_ymd;
    }

    @ElVoField(physicalName = "co_invnt_affir_rmk")
    public String getCo_invnt_affir_rmk(){
        return co_invnt_affir_rmk;
    }

    @ElVoField(physicalName = "co_invnt_affir_rmk")
    public void setCo_invnt_affir_rmk(String co_invnt_affir_rmk){
        this.co_invnt_affir_rmk = co_invnt_affir_rmk;
    }

    @ElVoField(physicalName = "co_invnt_retn_ymd")
    public String getCo_invnt_retn_ymd(){
        return co_invnt_retn_ymd;
    }

    @ElVoField(physicalName = "co_invnt_retn_ymd")
    public void setCo_invnt_retn_ymd(String co_invnt_retn_ymd){
        this.co_invnt_retn_ymd = co_invnt_retn_ymd;
    }

    @ElVoField(physicalName = "co_invnt_retn_rmk")
    public String getCo_invnt_retn_rmk(){
        return co_invnt_retn_rmk;
    }

    @ElVoField(physicalName = "co_invnt_retn_rmk")
    public void setCo_invnt_retn_rmk(String co_invnt_retn_rmk){
        this.co_invnt_retn_rmk = co_invnt_retn_rmk;
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

    @ElVoField(physicalName = "tech_fee_clsf")
    public String getTech_fee_clsf(){
        return tech_fee_clsf;
    }

    @ElVoField(physicalName = "tech_fee_clsf")
    public void setTech_fee_clsf(String tech_fee_clsf){
        this.tech_fee_clsf = tech_fee_clsf;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public String getFirst_pre_prj_no(){
        return first_pre_prj_no;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public void setFirst_pre_prj_no(String first_pre_prj_no){
        this.first_pre_prj_no = first_pre_prj_no;
    }

    @ElVoField(physicalName = "mou_state_nm")
    public String getMou_state_nm(){
        return mou_state_nm;
    }

    @ElVoField(physicalName = "mou_state_nm")
    public void setMou_state_nm(String mou_state_nm){
        this.mou_state_nm = mou_state_nm;
    }

    @ElVoField(physicalName = "tech_fee_no")
    public String getTech_fee_no(){
        return tech_fee_no;
    }

    @ElVoField(physicalName = "tech_fee_no")
    public void setTech_fee_no(String tech_fee_no){
        this.tech_fee_no = tech_fee_no;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "tech_nm")
    public String getTech_nm(){
        return tech_nm;
    }

    @ElVoField(physicalName = "tech_nm")
    public void setTech_nm(String tech_nm){
        this.tech_nm = tech_nm;
    }

    @ElVoField(physicalName = "permit_clsf_nm")
    public String getPermit_clsf_nm(){
        return permit_clsf_nm;
    }

    @ElVoField(physicalName = "permit_clsf_nm")
    public void setPermit_clsf_nm(String permit_clsf_nm){
        this.permit_clsf_nm = permit_clsf_nm;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public String getMou_contrct_ymd(){
        return mou_contrct_ymd;
    }

    @ElVoField(physicalName = "mou_contrct_ymd")
    public void setMou_contrct_ymd(String mou_contrct_ymd){
        this.mou_contrct_ymd = mou_contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "rspns_nm")
    public String getRspns_nm(){
        return rspns_nm;
    }

    @ElVoField(physicalName = "rspns_nm")
    public void setRspns_nm(String rspns_nm){
        this.rspns_nm = rspns_nm;
    }

    @ElVoField(physicalName = "contrct_fee")
    public String getContrct_fee(){
        return contrct_fee;
    }

    @ElVoField(physicalName = "contrct_fee")
    public void setContrct_fee(String contrct_fee){
        this.contrct_fee = contrct_fee;
    }

    @ElVoField(physicalName = "ofic_depst_amt")
    public String getOfic_depst_amt(){
        return ofic_depst_amt;
    }

    @ElVoField(physicalName = "ofic_depst_amt")
    public void setOfic_depst_amt(String ofic_depst_amt){
        this.ofic_depst_amt = ofic_depst_amt;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "mngmt_item_7")
    public String getMngmt_item_7(){
        return mngmt_item_7;
    }

    @ElVoField(physicalName = "mngmt_item_7")
    public void setMngmt_item_7(String mngmt_item_7){
        this.mngmt_item_7 = mngmt_item_7;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public String getDp_req_no(){
        return dp_req_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public void setDp_req_no(String dp_req_no){
        this.dp_req_no = dp_req_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }

    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }

    @ElVoField(physicalName = "no_type")
    public String getNo_type(){
        return no_type;
    }

    @ElVoField(physicalName = "no_type")
    public void setNo_type(String no_type){
        this.no_type = no_type;
    }

    @ElVoField(physicalName = "blong_clsf_nm")
    public String getBlong_clsf_nm(){
        return blong_clsf_nm;
    }

    @ElVoField(physicalName = "blong_clsf_nm")
    public void setBlong_clsf_nm(String blong_clsf_nm){
        this.blong_clsf_nm = blong_clsf_nm;
    }

    @ElVoField(physicalName = "invnt_psn_clsf_nm")
    public String getInvnt_psn_clsf_nm(){
        return invnt_psn_clsf_nm;
    }

    @ElVoField(physicalName = "invnt_psn_clsf_nm")
    public void setInvnt_psn_clsf_nm(String invnt_psn_clsf_nm){
        this.invnt_psn_clsf_nm = invnt_psn_clsf_nm;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "main_key")
    public String getMain_key(){
        return main_key;
    }

    @ElVoField(physicalName = "main_key")
    public void setMain_key(String main_key){
        this.main_key = main_key;
    }

    @ElVoField(physicalName = "ext1_cd")
    public String getExt1_cd(){
        return ext1_cd;
    }

    @ElVoField(physicalName = "ext1_cd")
    public void setExt1_cd(String ext1_cd){
        this.ext1_cd = ext1_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public String getExt2_cd(){
        return ext2_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public void setExt2_cd(String ext2_cd){
        this.ext2_cd = ext2_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "researcher_id")
    public String getResearcher_id(){
        return researcher_id;
    }

    @ElVoField(physicalName = "researcher_id")
    public void setResearcher_id(String researcher_id){
        this.researcher_id = researcher_id;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @ElVoField(physicalName = "aprGrid01")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> getAprGrid01(){
        return aprGrid01;
    }

    @ElVoField(physicalName = "aprGrid01")
    public void setAprGrid01(java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> aprGrid01){
        this.aprGrid01 = aprGrid01;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        return endpoint;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPrityEvalReqVo [");
        sb.append("prity_start_ymd").append("=").append(prity_start_ymd).append(",");
        sb.append("prity_end_ymd").append("=").append(prity_end_ymd).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("prity_syspayno").append("=").append(prity_syspayno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("prity_eval_req_no").append("=").append(prity_eval_req_no).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("prity_nm").append("=").append(prity_nm).append(",");
        sb.append("prity_empno").append("=").append(prity_empno).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("req_resn").append("=").append(req_resn).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rpt_prity_date").append("=").append(rpt_prity_date).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("prj_term").append("=").append(prj_term).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("blong_clsf").append("=").append(blong_clsf).append(",");
        sb.append("blong_cd").append("=").append(blong_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("blong_nm").append("=").append(blong_nm).append(",");
        sb.append("nm_krn").append("=").append(nm_krn).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
        sb.append("resid_no_dis").append("=").append(resid_no_dis).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("stake_rt").append("=").append(stake_rt).append(",");
        sb.append("stake_dept").append("=").append(stake_dept).append(",");
        sb.append("invnt_psn_clsf").append("=").append(invnt_psn_clsf).append(",");
        sb.append("trans_ex").append("=").append(trans_ex).append(",");
        sb.append("co_invnt_affir_ex").append("=").append(co_invnt_affir_ex).append(",");
        sb.append("co_invnt_affir_ymd").append("=").append(co_invnt_affir_ymd).append(",");
        sb.append("co_invnt_affir_rmk").append("=").append(co_invnt_affir_rmk).append(",");
        sb.append("co_invnt_retn_ymd").append("=").append(co_invnt_retn_ymd).append(",");
        sb.append("co_invnt_retn_rmk").append("=").append(co_invnt_retn_rmk).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("tech_fee_clsf").append("=").append(tech_fee_clsf).append(",");
        sb.append("first_pre_prj_no").append("=").append(first_pre_prj_no).append(",");
        sb.append("mou_state_nm").append("=").append(mou_state_nm).append(",");
        sb.append("tech_fee_no").append("=").append(tech_fee_no).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("tech_nm").append("=").append(tech_nm).append(",");
        sb.append("permit_clsf_nm").append("=").append(permit_clsf_nm).append(",");
        sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("rspns_nm").append("=").append(rspns_nm).append(",");
        sb.append("contrct_fee").append("=").append(contrct_fee).append(",");
        sb.append("ofic_depst_amt").append("=").append(ofic_depst_amt).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("mngmt_item_7").append("=").append(mngmt_item_7).append(",");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("dp_req_no").append("=").append(dp_req_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("no_type").append("=").append(no_type).append(",");
        sb.append("blong_clsf_nm").append("=").append(blong_clsf_nm).append(",");
        sb.append("invnt_psn_clsf_nm").append("=").append(invnt_psn_clsf_nm).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("main_key").append("=").append(main_key).append(",");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("researcher_id").append("=").append(researcher_id).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("aprGrid01").append("=").append(aprGrid01).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("endpoint").append("=").append(endpoint);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprGrid01 != null && i < aprGrid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)aprGrid01.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprGrid01 != null && i < aprGrid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)aprGrid01.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
