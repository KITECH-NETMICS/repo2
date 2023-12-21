package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPsrInquiryManageExp")
public class PatPsrInquiryManageVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPsrInquiryManageVo(){
    }

    @ElDtoField(logicalName = "bpmYn", physicalName = "bpm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bpm_yn;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "coSmitappEx", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "coSmitappExNm", physicalName = "co_smitapp_ex_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex_nm;

    @ElDtoField(logicalName = "invntDraftYmd", physicalName = "invnt_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_draft_ymd;

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "invntSyspaynm", physicalName = "invnt_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspaynm;

    @ElDtoField(logicalName = "invntApprvlCompltYmd", physicalName = "invnt_apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_apprvl_complt_ymd;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "vendType", physicalName = "vend_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type;

    @ElDtoField(logicalName = "vendTypeNm", physicalName = "vend_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type_nm;

    @ElDtoField(logicalName = "vendCd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "vendBsnNo", physicalName = "vend_bsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_bsn_no;

    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "contacLoc", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "stakeRt", physicalName = "stake_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_rt;

    @ElDtoField(logicalName = "invntNm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;

    @ElDtoField(logicalName = "mandatePsnSyspayno", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;

    @ElDtoField(logicalName = "mandatePsnNm", physicalName = "mandate_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_nm;

    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "keepMngmtOffc", physicalName = "keep_mngmt_offc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_mngmt_offc;

    @ElDtoField(logicalName = "keepMngmtOffcNm", physicalName = "keep_mngmt_offc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_mngmt_offc_nm;

    @ElDtoField(logicalName = "patoficChargId", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "patoficChargNm", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "refNo", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "startDate", physicalName = "start_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_date;

    @ElDtoField(logicalName = "endDate", physicalName = "end_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_date;

    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;

    @ElDtoField(logicalName = "invntPsnSyspayno", physicalName = "invnt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_syspayno;

    @ElDtoField(logicalName = "mainInvntPsnSyspayno", physicalName = "main_invnt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_invnt_psn_syspayno;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "deptTyp", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "evalGradeYn", physicalName = "eval_grade_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_grade_yn;

    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "mainInvntSyspayno", physicalName = "main_invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_invnt_syspayno;

    @ElDtoField(logicalName = "invntPsnNm", physicalName = "invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_nm;

    @ElDtoField(logicalName = "mainInvntPsnNm", physicalName = "main_invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_invnt_psn_nm;

    @ElDtoField(logicalName = "mainInvntEmpno", physicalName = "main_invnt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_invnt_empno;

    @ElDtoField(logicalName = "invntDeptNm", physicalName = "invnt_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_dept_nm;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "regstNo", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "stateNm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;

    @ElDtoField(logicalName = "deptTypNm", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;

    @ElDtoField(logicalName = "transYn", physicalName = "trans_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_yn;

    @ElDtoField(logicalName = "evalGradeVal", physicalName = "eval_grade_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_grade_val;

    @ElDtoField(logicalName = "patGrdNm", physicalName = "pat_grd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd_nm;

    @ElDtoField(logicalName = "interviewYn", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;

    @ElDtoField(logicalName = "domOverseaNm", physicalName = "dom_oversea_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_nm;

    @ElDtoField(logicalName = "demandVendNm", physicalName = "demand_vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demand_vend_nm;

    @ElDtoField(logicalName = "giveupKndNm", physicalName = "giveup_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_knd_nm;

    @ElDtoField(logicalName = "invntEngNm", physicalName = "invnt_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_eng_nm;

    @ElDtoField(logicalName = "patoficMngNo", physicalName = "patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_mng_no;

    @ElDtoField(logicalName = "smitappNatnCd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;

    @ElDtoField(logicalName = "techClsf", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;

    @ElDtoField(logicalName = "techClsfNm", physicalName = "tech_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf_nm;

    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;

    @ElDtoField(logicalName = "smitappOccrClsf", physicalName = "smitapp_occr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf;

    @ElDtoField(logicalName = "smitappOccrClsfNm", physicalName = "smitapp_occr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf_nm;

    @ElDtoField(logicalName = "befOpenYn", physicalName = "bef_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bef_open_yn;

    @ElDtoField(logicalName = "elyOpenEx", physicalName = "ely_open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ely_open_ex;

    @ElDtoField(logicalName = "evalDemndEx", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElDtoField(logicalName = "prityEvalEx", physicalName = "prity_eval_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_ex;

    @ElDtoField(logicalName = "openAttachFileNo", physicalName = "open_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_attach_file_no;

    @ElDtoField(logicalName = "relatDomSmitappNo", physicalName = "relat_dom_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_dom_smitapp_no;

    @ElDtoField(logicalName = "intrnSmitappNo", physicalName = "intrn_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_no;

    @ElDtoField(logicalName = "intrnSmitappYmd", physicalName = "intrn_smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_ymd;

    @ElDtoField(logicalName = "regstRegYmd", physicalName = "regst_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_reg_ymd;

    @ElDtoField(logicalName = "smitappRegYmd", physicalName = "smitapp_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_reg_ymd;

    @ElDtoField(logicalName = "prityrgtMainRspnsNo", physicalName = "prityrgt_main_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_no;

    @ElDtoField(logicalName = "prityrgtMainRspnsYmd", physicalName = "prityrgt_main_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_ymd;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "giveupReqNo", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "gbNm", physicalName = "gb_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gb_nm;

    @ElDtoField(logicalName = "gb", physicalName = "gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gb;

    @ElDtoField(logicalName = "refKey", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "managerNm", physicalName = "manager_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_nm;

    @ElDtoField(logicalName = "managerDeptnm", physicalName = "manager_deptnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_deptnm;

    @ElDtoField(logicalName = "comptDate", physicalName = "compt_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compt_date;

    @ElDtoField(logicalName = "compYn", physicalName = "comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_yn;

    @ElDtoField(logicalName = "bigo", physicalName = "bigo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bigo;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "reschRespnSyspayno", physicalName = "resch_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspayno;

    @ElDtoField(logicalName = "reschRespnSyspaynm", physicalName = "resch_respn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspaynm;

    @ElDtoField(logicalName = "prjTerm", physicalName = "prj_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_term;

    @ElDtoField(logicalName = "bsnsCdInoutNm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "blongClsf", physicalName = "blong_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf;

    @ElDtoField(logicalName = "blongClsfNm", physicalName = "blong_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf_nm;

    @ElDtoField(logicalName = "blongCd", physicalName = "blong_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_cd;

    @ElDtoField(logicalName = "blongNm", physicalName = "blong_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_nm;

    @ElDtoField(logicalName = "nmKrn", physicalName = "nm_krn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_krn;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "invntPsnClsf", physicalName = "invnt_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf;

    @ElDtoField(logicalName = "stakeDept", physicalName = "stake_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_dept;

    @ElDtoField(logicalName = "appId", physicalName = "app_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_id;

    @ElDtoField(logicalName = "prtAppNo", physicalName = "prt_app_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_no;

    @ElDtoField(logicalName = "prtAppDate", physicalName = "prt_app_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_date;

    @ElDtoField(logicalName = "prtIndepCnt", physicalName = "prt_indep_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_indep_cnt;

    @ElDtoField(logicalName = "prtDepenCnt", physicalName = "prt_depen_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_depen_cnt;

    @ElDtoField(logicalName = "prtSpecCnt", physicalName = "prt_spec_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_spec_cnt;

    @ElDtoField(logicalName = "prtDrawCnt", physicalName = "prt_draw_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_draw_cnt;

    @ElDtoField(logicalName = "prtKoAppTitle", physicalName = "prt_ko_app_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_ko_app_title;

    @ElDtoField(logicalName = "prtEnAppTitle", physicalName = "prt_en_app_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_en_app_title;

    @ElDtoField(logicalName = "prtAppAttachFile", physicalName = "prt_app_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_app_attach_file;

    @ElDtoField(logicalName = "prtAttachFile", physicalName = "prt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_attach_file;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "key1", physicalName = "key_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_1;

    @ElDtoField(logicalName = "key2", physicalName = "key_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_2;

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "subBizClsf", physicalName = "sub_biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_biz_clsf;

    @ElDtoField(logicalName = "itemClsf", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf;

    @ElDtoField(logicalName = "rvewObjct", physicalName = "rvew_objct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_objct;

    @ElDtoField(logicalName = "chrgPsn", physicalName = "chrg_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_psn;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "cmtClsf", physicalName = "cmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmt_clsf;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "invntClsf", physicalName = "invnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf;

    @ElDtoField(logicalName = "pdpFlag", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "regId", physicalName = "reg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_id;

    @ElDtoField(logicalName = "prtRegNo", physicalName = "prt_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_no;

    @ElDtoField(logicalName = "prtRegDate", physicalName = "prt_reg_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_date;

    @ElDtoField(logicalName = "prtKoRegTitle", physicalName = "prt_ko_reg_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_ko_reg_title;

    @ElDtoField(logicalName = "prtEnRegTitle", physicalName = "prt_en_reg_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_en_reg_title;

    @ElDtoField(logicalName = "prtRegistAttachFile", physicalName = "prt_regist_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_regist_attach_file;

    @ElDtoField(logicalName = "prtRegOrgAttachFile", physicalName = "prt_reg_org_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_org_attach_file;

    @ElDtoField(logicalName = "prtRegAttachFile", physicalName = "prt_reg_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prt_reg_attach_file;

    @ElDtoField(logicalName = "skateClsf", physicalName = "skate_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String skate_clsf;

    @ElDtoField(logicalName = "hisSeq", physicalName = "his_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_seq;

    @ElDtoField(logicalName = "inputYmd", physicalName = "input_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd;

    @ElDtoField(logicalName = "skateClsfNm", physicalName = "skate_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String skate_clsf_nm;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "techFeeClsf", physicalName = "tech_fee_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee_clsf;

    @ElDtoField(logicalName = "firstPrePrjNo", physicalName = "first_pre_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String first_pre_prj_no;

    @ElDtoField(logicalName = "mouStateNm", physicalName = "mou_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_state_nm;

    @ElDtoField(logicalName = "techFeeNo", physicalName = "tech_fee_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee_no;

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

    @ElDtoField(logicalName = "rptPrityDate", physicalName = "rpt_prity_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_prity_date;

    @ElDtoField(logicalName = "aprKey", physicalName = "apr_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_key;

    @ElDtoField(logicalName = "view", physicalName = "view", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String view;

    @ElDtoField(logicalName = "elecappDocuNo", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "acdtUnusualItem", physicalName = "acdt_unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acdt_unusual_item;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "workClsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "oaId", physicalName = "oa_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_id;

    @ElDtoField(logicalName = "oaSn", physicalName = "oa_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_sn;

    @ElDtoField(logicalName = "rcptClsfNm", physicalName = "rcpt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf_nm;

    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "stateCd", physicalName = "state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_cd;

    @ElDtoField(logicalName = "rcptOaDate", physicalName = "rcpt_oa_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_oa_date;

    @ElDtoField(logicalName = "rcptDueDate", physicalName = "rcpt_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_due_date;

    @ElDtoField(logicalName = "fnshDate", physicalName = "fnsh_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fnsh_date;

    @ElDtoField(logicalName = "seq02", physicalName = "seq_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq_02;

    @ElDtoField(logicalName = "inputYmd02", physicalName = "input_ymd_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd_02;

    @ElDtoField(logicalName = "ntbRegstYn", physicalName = "ntb_regst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntb_regst_yn;

    @ElDtoField(logicalName = "ntbRegstYnNm", physicalName = "ntb_regst_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntb_regst_yn_nm;

    @ElDtoField(logicalName = "ntbRegstYmd", physicalName = "ntb_regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntb_regst_ymd;

    @ElDtoField(logicalName = "attachFileNo02", physicalName = "attach_file_no_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_02;

    @ElDtoField(logicalName = "attachFileNo01", physicalName = "attach_file_no_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_01;

    @ElDtoField(logicalName = "cnt02", physicalName = "cnt_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt_02;

    @ElDtoField(logicalName = "startDaytm", physicalName = "start_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_daytm;

    @ElDtoField(logicalName = "endDaytm", physicalName = "end_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_daytm;

    @ElDtoField(logicalName = "inputEvalTool", physicalName = "input_eval_tool", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_eval_tool;

    @ElDtoField(logicalName = "postEvalId", physicalName = "post_eval_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String post_eval_id;

    @ElDtoField(logicalName = "evalOrgan", physicalName = "eval_organ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_organ;

    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "evalTool", physicalName = "eval_tool", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_tool;

    @ElDtoField(logicalName = "evalGrade", physicalName = "eval_grade", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_grade;

    @ElDtoField(logicalName = "discuClsf", physicalName = "discu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String discu_clsf;

    @ElDtoField(logicalName = "evalAttachFile", physicalName = "eval_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_attach_file;

    @ElDtoField(logicalName = "evalDate", physicalName = "eval_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_date;

    @ElDtoField(logicalName = "appCostSum", physicalName = "appCostSum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appCostSum;

    @ElDtoField(logicalName = "oaCostSum", physicalName = "oaCostSum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oaCostSum;

    @ElDtoField(logicalName = "regCostSum", physicalName = "regCostSum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regCostSum;

    @ElDtoField(logicalName = "annualCostSum", physicalName = "annualCostSum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String annualCostSum;

    @ElDtoField(logicalName = "etcCostSum", physicalName = "etcCostSum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etcCostSum;

    @ElDtoField(logicalName = "expnsMngmtNo", physicalName = "expns_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_mngmt_no;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "acdtContnt", physicalName = "acdt_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acdt_contnt;

    @ElDtoField(logicalName = "governpayFee", physicalName = "governpay_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String governpay_fee;

    @ElDtoField(logicalName = "outGovernpayFee", physicalName = "out_governpay_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_governpay_fee;

    @ElDtoField(logicalName = "supplyPrice", physicalName = "supply_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supply_price;

    @ElDtoField(logicalName = "outSupplyPrice", physicalName = "out_supply_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_supply_price;

    @ElDtoField(logicalName = "surtax", physicalName = "surtax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String surtax;

    @ElDtoField(logicalName = "outCommission", physicalName = "out_commission", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_commission;

    @ElDtoField(logicalName = "totalPrice", physicalName = "total_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String total_price;

    @ElDtoField(logicalName = "no_type", physicalName = "no_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_type;

    @ElDtoField(logicalName = "date_type", physicalName = "date_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date_type;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "attach_file", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "cost_kind", physicalName = "cost_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cost_kind;

    @ElVoField(physicalName = "bpm_yn")
    public String getBpm_yn(){
        return bpm_yn;
    }

    @ElVoField(physicalName = "bpm_yn")
    public void setBpm_yn(String bpm_yn){
        this.bpm_yn = bpm_yn;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex_nm")
    public String getCo_smitapp_ex_nm(){
        return co_smitapp_ex_nm;
    }

    @ElVoField(physicalName = "co_smitapp_ex_nm")
    public void setCo_smitapp_ex_nm(String co_smitapp_ex_nm){
        this.co_smitapp_ex_nm = co_smitapp_ex_nm;
    }

    @ElVoField(physicalName = "invnt_draft_ymd")
    public String getInvnt_draft_ymd(){
        return invnt_draft_ymd;
    }

    @ElVoField(physicalName = "invnt_draft_ymd")
    public void setInvnt_draft_ymd(String invnt_draft_ymd){
        this.invnt_draft_ymd = invnt_draft_ymd;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspaynm")
    public String getInvnt_syspaynm(){
        return invnt_syspaynm;
    }

    @ElVoField(physicalName = "invnt_syspaynm")
    public void setInvnt_syspaynm(String invnt_syspaynm){
        this.invnt_syspaynm = invnt_syspaynm;
    }

    @ElVoField(physicalName = "invnt_apprvl_complt_ymd")
    public String getInvnt_apprvl_complt_ymd(){
        return invnt_apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "invnt_apprvl_complt_ymd")
    public void setInvnt_apprvl_complt_ymd(String invnt_apprvl_complt_ymd){
        this.invnt_apprvl_complt_ymd = invnt_apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "vend_type")
    public String getVend_type(){
        return vend_type;
    }

    @ElVoField(physicalName = "vend_type")
    public void setVend_type(String vend_type){
        this.vend_type = vend_type;
    }

    @ElVoField(physicalName = "vend_type_nm")
    public String getVend_type_nm(){
        return vend_type_nm;
    }

    @ElVoField(physicalName = "vend_type_nm")
    public void setVend_type_nm(String vend_type_nm){
        this.vend_type_nm = vend_type_nm;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public String getVend_bsn_no(){
        return vend_bsn_no;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public void setVend_bsn_no(String vend_bsn_no){
        this.vend_bsn_no = vend_bsn_no;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
    }

    @ElVoField(physicalName = "stake_rt")
    public String getStake_rt(){
        return stake_rt;
    }

    @ElVoField(physicalName = "stake_rt")
    public void setStake_rt(String stake_rt){
        this.stake_rt = stake_rt;
    }

    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public String getMandate_psn_nm(){
        return mandate_psn_nm;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public void setMandate_psn_nm(String mandate_psn_nm){
        this.mandate_psn_nm = mandate_psn_nm;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "keep_mngmt_offc")
    public String getKeep_mngmt_offc(){
        return keep_mngmt_offc;
    }

    @ElVoField(physicalName = "keep_mngmt_offc")
    public void setKeep_mngmt_offc(String keep_mngmt_offc){
        this.keep_mngmt_offc = keep_mngmt_offc;
    }

    @ElVoField(physicalName = "keep_mngmt_offc_nm")
    public String getKeep_mngmt_offc_nm(){
        return keep_mngmt_offc_nm;
    }

    @ElVoField(physicalName = "keep_mngmt_offc_nm")
    public void setKeep_mngmt_offc_nm(String keep_mngmt_offc_nm){
        this.keep_mngmt_offc_nm = keep_mngmt_offc_nm;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public String getPatofic_charg_id(){
        return patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public void setPatofic_charg_id(String patofic_charg_id){
        this.patofic_charg_id = patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }

    @ElVoField(physicalName = "start_date")
    public String getStart_date(){
        return start_date;
    }

    @ElVoField(physicalName = "start_date")
    public void setStart_date(String start_date){
        this.start_date = start_date;
    }

    @ElVoField(physicalName = "end_date")
    public String getEnd_date(){
        return end_date;
    }

    @ElVoField(physicalName = "end_date")
    public void setEnd_date(String end_date){
        this.end_date = end_date;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }

    @ElVoField(physicalName = "invnt_psn_syspayno")
    public String getInvnt_psn_syspayno(){
        return invnt_psn_syspayno;
    }

    @ElVoField(physicalName = "invnt_psn_syspayno")
    public void setInvnt_psn_syspayno(String invnt_psn_syspayno){
        this.invnt_psn_syspayno = invnt_psn_syspayno;
    }

    @ElVoField(physicalName = "main_invnt_psn_syspayno")
    public String getMain_invnt_psn_syspayno(){
        return main_invnt_psn_syspayno;
    }

    @ElVoField(physicalName = "main_invnt_psn_syspayno")
    public void setMain_invnt_psn_syspayno(String main_invnt_psn_syspayno){
        this.main_invnt_psn_syspayno = main_invnt_psn_syspayno;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "eval_grade_yn")
    public String getEval_grade_yn(){
        return eval_grade_yn;
    }

    @ElVoField(physicalName = "eval_grade_yn")
    public void setEval_grade_yn(String eval_grade_yn){
        this.eval_grade_yn = eval_grade_yn;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "main_invnt_syspayno")
    public String getMain_invnt_syspayno(){
        return main_invnt_syspayno;
    }

    @ElVoField(physicalName = "main_invnt_syspayno")
    public void setMain_invnt_syspayno(String main_invnt_syspayno){
        this.main_invnt_syspayno = main_invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_psn_nm")
    public String getInvnt_psn_nm(){
        return invnt_psn_nm;
    }

    @ElVoField(physicalName = "invnt_psn_nm")
    public void setInvnt_psn_nm(String invnt_psn_nm){
        this.invnt_psn_nm = invnt_psn_nm;
    }

    @ElVoField(physicalName = "main_invnt_psn_nm")
    public String getMain_invnt_psn_nm(){
        return main_invnt_psn_nm;
    }

    @ElVoField(physicalName = "main_invnt_psn_nm")
    public void setMain_invnt_psn_nm(String main_invnt_psn_nm){
        this.main_invnt_psn_nm = main_invnt_psn_nm;
    }

    @ElVoField(physicalName = "main_invnt_empno")
    public String getMain_invnt_empno(){
        return main_invnt_empno;
    }

    @ElVoField(physicalName = "main_invnt_empno")
    public void setMain_invnt_empno(String main_invnt_empno){
        this.main_invnt_empno = main_invnt_empno;
    }

    @ElVoField(physicalName = "invnt_dept_nm")
    public String getInvnt_dept_nm(){
        return invnt_dept_nm;
    }

    @ElVoField(physicalName = "invnt_dept_nm")
    public void setInvnt_dept_nm(String invnt_dept_nm){
        this.invnt_dept_nm = invnt_dept_nm;
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

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public String getDept_typ_nm(){
        return dept_typ_nm;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public void setDept_typ_nm(String dept_typ_nm){
        this.dept_typ_nm = dept_typ_nm;
    }

    @ElVoField(physicalName = "trans_yn")
    public String getTrans_yn(){
        return trans_yn;
    }

    @ElVoField(physicalName = "trans_yn")
    public void setTrans_yn(String trans_yn){
        this.trans_yn = trans_yn;
    }

    @ElVoField(physicalName = "eval_grade_val")
    public String getEval_grade_val(){
        return eval_grade_val;
    }

    @ElVoField(physicalName = "eval_grade_val")
    public void setEval_grade_val(String eval_grade_val){
        this.eval_grade_val = eval_grade_val;
    }

    @ElVoField(physicalName = "pat_grd_nm")
    public String getPat_grd_nm(){
        return pat_grd_nm;
    }

    @ElVoField(physicalName = "pat_grd_nm")
    public void setPat_grd_nm(String pat_grd_nm){
        this.pat_grd_nm = pat_grd_nm;
    }

    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }

    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }

    @ElVoField(physicalName = "dom_oversea_nm")
    public String getDom_oversea_nm(){
        return dom_oversea_nm;
    }

    @ElVoField(physicalName = "dom_oversea_nm")
    public void setDom_oversea_nm(String dom_oversea_nm){
        this.dom_oversea_nm = dom_oversea_nm;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public String getDemand_vend_nm(){
        return demand_vend_nm;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public void setDemand_vend_nm(String demand_vend_nm){
        this.demand_vend_nm = demand_vend_nm;
    }

    @ElVoField(physicalName = "giveup_knd_nm")
    public String getGiveup_knd_nm(){
        return giveup_knd_nm;
    }

    @ElVoField(physicalName = "giveup_knd_nm")
    public void setGiveup_knd_nm(String giveup_knd_nm){
        this.giveup_knd_nm = giveup_knd_nm;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public String getInvnt_eng_nm(){
        return invnt_eng_nm;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public void setInvnt_eng_nm(String invnt_eng_nm){
        this.invnt_eng_nm = invnt_eng_nm;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public String getPatofic_mng_no(){
        return patofic_mng_no;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public void setPatofic_mng_no(String patofic_mng_no){
        this.patofic_mng_no = patofic_mng_no;
    }

    @ElVoField(physicalName = "smitapp_natn_cd")
    public String getSmitapp_natn_cd(){
        return smitapp_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_natn_cd")
    public void setSmitapp_natn_cd(String smitapp_natn_cd){
        this.smitapp_natn_cd = smitapp_natn_cd;
    }

    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }

    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }

    @ElVoField(physicalName = "tech_clsf_nm")
    public String getTech_clsf_nm(){
        return tech_clsf_nm;
    }

    @ElVoField(physicalName = "tech_clsf_nm")
    public void setTech_clsf_nm(String tech_clsf_nm){
        this.tech_clsf_nm = tech_clsf_nm;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public String getSmitapp_occr_clsf(){
        return smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public void setSmitapp_occr_clsf(String smitapp_occr_clsf){
        this.smitapp_occr_clsf = smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public String getSmitapp_occr_clsf_nm(){
        return smitapp_occr_clsf_nm;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public void setSmitapp_occr_clsf_nm(String smitapp_occr_clsf_nm){
        this.smitapp_occr_clsf_nm = smitapp_occr_clsf_nm;
    }

    @ElVoField(physicalName = "bef_open_yn")
    public String getBef_open_yn(){
        return bef_open_yn;
    }

    @ElVoField(physicalName = "bef_open_yn")
    public void setBef_open_yn(String bef_open_yn){
        this.bef_open_yn = bef_open_yn;
    }

    @ElVoField(physicalName = "ely_open_ex")
    public String getEly_open_ex(){
        return ely_open_ex;
    }

    @ElVoField(physicalName = "ely_open_ex")
    public void setEly_open_ex(String ely_open_ex){
        this.ely_open_ex = ely_open_ex;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public String getEval_demnd_ex(){
        return eval_demnd_ex;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public void setEval_demnd_ex(String eval_demnd_ex){
        this.eval_demnd_ex = eval_demnd_ex;
    }

    @ElVoField(physicalName = "prity_eval_ex")
    public String getPrity_eval_ex(){
        return prity_eval_ex;
    }

    @ElVoField(physicalName = "prity_eval_ex")
    public void setPrity_eval_ex(String prity_eval_ex){
        this.prity_eval_ex = prity_eval_ex;
    }

    @ElVoField(physicalName = "open_attach_file_no")
    public String getOpen_attach_file_no(){
        return open_attach_file_no;
    }

    @ElVoField(physicalName = "open_attach_file_no")
    public void setOpen_attach_file_no(String open_attach_file_no){
        this.open_attach_file_no = open_attach_file_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public String getRelat_dom_smitapp_no(){
        return relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public void setRelat_dom_smitapp_no(String relat_dom_smitapp_no){
        this.relat_dom_smitapp_no = relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "intrn_smitapp_no")
    public String getIntrn_smitapp_no(){
        return intrn_smitapp_no;
    }

    @ElVoField(physicalName = "intrn_smitapp_no")
    public void setIntrn_smitapp_no(String intrn_smitapp_no){
        this.intrn_smitapp_no = intrn_smitapp_no;
    }

    @ElVoField(physicalName = "intrn_smitapp_ymd")
    public String getIntrn_smitapp_ymd(){
        return intrn_smitapp_ymd;
    }

    @ElVoField(physicalName = "intrn_smitapp_ymd")
    public void setIntrn_smitapp_ymd(String intrn_smitapp_ymd){
        this.intrn_smitapp_ymd = intrn_smitapp_ymd;
    }

    @ElVoField(physicalName = "regst_reg_ymd")
    public String getRegst_reg_ymd(){
        return regst_reg_ymd;
    }

    @ElVoField(physicalName = "regst_reg_ymd")
    public void setRegst_reg_ymd(String regst_reg_ymd){
        this.regst_reg_ymd = regst_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public String getSmitapp_reg_ymd(){
        return smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public void setSmitapp_reg_ymd(String smitapp_reg_ymd){
        this.smitapp_reg_ymd = smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public String getPrityrgt_main_rspns_no(){
        return prityrgt_main_rspns_no;
    }

    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public void setPrityrgt_main_rspns_no(String prityrgt_main_rspns_no){
        this.prityrgt_main_rspns_no = prityrgt_main_rspns_no;
    }

    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public String getPrityrgt_main_rspns_ymd(){
        return prityrgt_main_rspns_ymd;
    }

    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public void setPrityrgt_main_rspns_ymd(String prityrgt_main_rspns_ymd){
        this.prityrgt_main_rspns_ymd = prityrgt_main_rspns_ymd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "gb_nm")
    public String getGb_nm(){
        return gb_nm;
    }

    @ElVoField(physicalName = "gb_nm")
    public void setGb_nm(String gb_nm){
        this.gb_nm = gb_nm;
    }

    @ElVoField(physicalName = "gb")
    public String getGb(){
        return gb;
    }

    @ElVoField(physicalName = "gb")
    public void setGb(String gb){
        this.gb = gb;
    }

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "manager_nm")
    public String getManager_nm(){
        return manager_nm;
    }

    @ElVoField(physicalName = "manager_nm")
    public void setManager_nm(String manager_nm){
        this.manager_nm = manager_nm;
    }

    @ElVoField(physicalName = "manager_deptnm")
    public String getManager_deptnm(){
        return manager_deptnm;
    }

    @ElVoField(physicalName = "manager_deptnm")
    public void setManager_deptnm(String manager_deptnm){
        this.manager_deptnm = manager_deptnm;
    }

    @ElVoField(physicalName = "compt_date")
    public String getCompt_date(){
        return compt_date;
    }

    @ElVoField(physicalName = "compt_date")
    public void setCompt_date(String compt_date){
        this.compt_date = compt_date;
    }

    @ElVoField(physicalName = "comp_yn")
    public String getComp_yn(){
        return comp_yn;
    }

    @ElVoField(physicalName = "comp_yn")
    public void setComp_yn(String comp_yn){
        this.comp_yn = comp_yn;
    }

    @ElVoField(physicalName = "bigo")
    public String getBigo(){
        return bigo;
    }

    @ElVoField(physicalName = "bigo")
    public void setBigo(String bigo){
        this.bigo = bigo;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public String getResch_respn_syspayno(){
        return resch_respn_syspayno;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public void setResch_respn_syspayno(String resch_respn_syspayno){
        this.resch_respn_syspayno = resch_respn_syspayno;
    }

    @ElVoField(physicalName = "resch_respn_syspaynm")
    public String getResch_respn_syspaynm(){
        return resch_respn_syspaynm;
    }

    @ElVoField(physicalName = "resch_respn_syspaynm")
    public void setResch_respn_syspaynm(String resch_respn_syspaynm){
        this.resch_respn_syspaynm = resch_respn_syspaynm;
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

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "blong_clsf")
    public String getBlong_clsf(){
        return blong_clsf;
    }

    @ElVoField(physicalName = "blong_clsf")
    public void setBlong_clsf(String blong_clsf){
        this.blong_clsf = blong_clsf;
    }

    @ElVoField(physicalName = "blong_clsf_nm")
    public String getBlong_clsf_nm(){
        return blong_clsf_nm;
    }

    @ElVoField(physicalName = "blong_clsf_nm")
    public void setBlong_clsf_nm(String blong_clsf_nm){
        this.blong_clsf_nm = blong_clsf_nm;
    }

    @ElVoField(physicalName = "blong_cd")
    public String getBlong_cd(){
        return blong_cd;
    }

    @ElVoField(physicalName = "blong_cd")
    public void setBlong_cd(String blong_cd){
        this.blong_cd = blong_cd;
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

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public String getInvnt_psn_clsf(){
        return invnt_psn_clsf;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public void setInvnt_psn_clsf(String invnt_psn_clsf){
        this.invnt_psn_clsf = invnt_psn_clsf;
    }

    @ElVoField(physicalName = "stake_dept")
    public String getStake_dept(){
        return stake_dept;
    }

    @ElVoField(physicalName = "stake_dept")
    public void setStake_dept(String stake_dept){
        this.stake_dept = stake_dept;
    }

    @ElVoField(physicalName = "app_id")
    public String getApp_id(){
        return app_id;
    }

    @ElVoField(physicalName = "app_id")
    public void setApp_id(String app_id){
        this.app_id = app_id;
    }

    @ElVoField(physicalName = "prt_app_no")
    public String getPrt_app_no(){
        return prt_app_no;
    }

    @ElVoField(physicalName = "prt_app_no")
    public void setPrt_app_no(String prt_app_no){
        this.prt_app_no = prt_app_no;
    }

    @ElVoField(physicalName = "prt_app_date")
    public String getPrt_app_date(){
        return prt_app_date;
    }

    @ElVoField(physicalName = "prt_app_date")
    public void setPrt_app_date(String prt_app_date){
        this.prt_app_date = prt_app_date;
    }

    @ElVoField(physicalName = "prt_indep_cnt")
    public String getPrt_indep_cnt(){
        return prt_indep_cnt;
    }

    @ElVoField(physicalName = "prt_indep_cnt")
    public void setPrt_indep_cnt(String prt_indep_cnt){
        this.prt_indep_cnt = prt_indep_cnt;
    }

    @ElVoField(physicalName = "prt_depen_cnt")
    public String getPrt_depen_cnt(){
        return prt_depen_cnt;
    }

    @ElVoField(physicalName = "prt_depen_cnt")
    public void setPrt_depen_cnt(String prt_depen_cnt){
        this.prt_depen_cnt = prt_depen_cnt;
    }

    @ElVoField(physicalName = "prt_spec_cnt")
    public String getPrt_spec_cnt(){
        return prt_spec_cnt;
    }

    @ElVoField(physicalName = "prt_spec_cnt")
    public void setPrt_spec_cnt(String prt_spec_cnt){
        this.prt_spec_cnt = prt_spec_cnt;
    }

    @ElVoField(physicalName = "prt_draw_cnt")
    public String getPrt_draw_cnt(){
        return prt_draw_cnt;
    }

    @ElVoField(physicalName = "prt_draw_cnt")
    public void setPrt_draw_cnt(String prt_draw_cnt){
        this.prt_draw_cnt = prt_draw_cnt;
    }

    @ElVoField(physicalName = "prt_ko_app_title")
    public String getPrt_ko_app_title(){
        return prt_ko_app_title;
    }

    @ElVoField(physicalName = "prt_ko_app_title")
    public void setPrt_ko_app_title(String prt_ko_app_title){
        this.prt_ko_app_title = prt_ko_app_title;
    }

    @ElVoField(physicalName = "prt_en_app_title")
    public String getPrt_en_app_title(){
        return prt_en_app_title;
    }

    @ElVoField(physicalName = "prt_en_app_title")
    public void setPrt_en_app_title(String prt_en_app_title){
        this.prt_en_app_title = prt_en_app_title;
    }

    @ElVoField(physicalName = "prt_app_attach_file")
    public String getPrt_app_attach_file(){
        return prt_app_attach_file;
    }

    @ElVoField(physicalName = "prt_app_attach_file")
    public void setPrt_app_attach_file(String prt_app_attach_file){
        this.prt_app_attach_file = prt_app_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public String getPrt_attach_file(){
        return prt_attach_file;
    }

    @ElVoField(physicalName = "prt_attach_file")
    public void setPrt_attach_file(String prt_attach_file){
        this.prt_attach_file = prt_attach_file;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "key_1")
    public String getKey_1(){
        return key_1;
    }

    @ElVoField(physicalName = "key_1")
    public void setKey_1(String key_1){
        this.key_1 = key_1;
    }

    @ElVoField(physicalName = "key_2")
    public String getKey_2(){
        return key_2;
    }

    @ElVoField(physicalName = "key_2")
    public void setKey_2(String key_2){
        this.key_2 = key_2;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "sub_biz_clsf")
    public String getSub_biz_clsf(){
        return sub_biz_clsf;
    }

    @ElVoField(physicalName = "sub_biz_clsf")
    public void setSub_biz_clsf(String sub_biz_clsf){
        this.sub_biz_clsf = sub_biz_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public String getItem_clsf(){
        return item_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public void setItem_clsf(String item_clsf){
        this.item_clsf = item_clsf;
    }

    @ElVoField(physicalName = "rvew_objct")
    public String getRvew_objct(){
        return rvew_objct;
    }

    @ElVoField(physicalName = "rvew_objct")
    public void setRvew_objct(String rvew_objct){
        this.rvew_objct = rvew_objct;
    }

    @ElVoField(physicalName = "chrg_psn")
    public String getChrg_psn(){
        return chrg_psn;
    }

    @ElVoField(physicalName = "chrg_psn")
    public void setChrg_psn(String chrg_psn){
        this.chrg_psn = chrg_psn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cmt_clsf")
    public String getCmt_clsf(){
        return cmt_clsf;
    }

    @ElVoField(physicalName = "cmt_clsf")
    public void setCmt_clsf(String cmt_clsf){
        this.cmt_clsf = cmt_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public String getInvnt_clsf(){
        return invnt_clsf;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public void setInvnt_clsf(String invnt_clsf){
        this.invnt_clsf = invnt_clsf;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
    }

    @ElVoField(physicalName = "reg_id")
    public String getReg_id(){
        return reg_id;
    }

    @ElVoField(physicalName = "reg_id")
    public void setReg_id(String reg_id){
        this.reg_id = reg_id;
    }

    @ElVoField(physicalName = "prt_reg_no")
    public String getPrt_reg_no(){
        return prt_reg_no;
    }

    @ElVoField(physicalName = "prt_reg_no")
    public void setPrt_reg_no(String prt_reg_no){
        this.prt_reg_no = prt_reg_no;
    }

    @ElVoField(physicalName = "prt_reg_date")
    public String getPrt_reg_date(){
        return prt_reg_date;
    }

    @ElVoField(physicalName = "prt_reg_date")
    public void setPrt_reg_date(String prt_reg_date){
        this.prt_reg_date = prt_reg_date;
    }

    @ElVoField(physicalName = "prt_ko_reg_title")
    public String getPrt_ko_reg_title(){
        return prt_ko_reg_title;
    }

    @ElVoField(physicalName = "prt_ko_reg_title")
    public void setPrt_ko_reg_title(String prt_ko_reg_title){
        this.prt_ko_reg_title = prt_ko_reg_title;
    }

    @ElVoField(physicalName = "prt_en_reg_title")
    public String getPrt_en_reg_title(){
        return prt_en_reg_title;
    }

    @ElVoField(physicalName = "prt_en_reg_title")
    public void setPrt_en_reg_title(String prt_en_reg_title){
        this.prt_en_reg_title = prt_en_reg_title;
    }

    @ElVoField(physicalName = "prt_regist_attach_file")
    public String getPrt_regist_attach_file(){
        return prt_regist_attach_file;
    }

    @ElVoField(physicalName = "prt_regist_attach_file")
    public void setPrt_regist_attach_file(String prt_regist_attach_file){
        this.prt_regist_attach_file = prt_regist_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_org_attach_file")
    public String getPrt_reg_org_attach_file(){
        return prt_reg_org_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_org_attach_file")
    public void setPrt_reg_org_attach_file(String prt_reg_org_attach_file){
        this.prt_reg_org_attach_file = prt_reg_org_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_attach_file")
    public String getPrt_reg_attach_file(){
        return prt_reg_attach_file;
    }

    @ElVoField(physicalName = "prt_reg_attach_file")
    public void setPrt_reg_attach_file(String prt_reg_attach_file){
        this.prt_reg_attach_file = prt_reg_attach_file;
    }

    @ElVoField(physicalName = "skate_clsf")
    public String getSkate_clsf(){
        return skate_clsf;
    }

    @ElVoField(physicalName = "skate_clsf")
    public void setSkate_clsf(String skate_clsf){
        this.skate_clsf = skate_clsf;
    }

    @ElVoField(physicalName = "his_seq")
    public String getHis_seq(){
        return his_seq;
    }

    @ElVoField(physicalName = "his_seq")
    public void setHis_seq(String his_seq){
        this.his_seq = his_seq;
    }

    @ElVoField(physicalName = "input_ymd")
    public String getInput_ymd(){
        return input_ymd;
    }

    @ElVoField(physicalName = "input_ymd")
    public void setInput_ymd(String input_ymd){
        this.input_ymd = input_ymd;
    }

    @ElVoField(physicalName = "skate_clsf_nm")
    public String getSkate_clsf_nm(){
        return skate_clsf_nm;
    }

    @ElVoField(physicalName = "skate_clsf_nm")
    public void setSkate_clsf_nm(String skate_clsf_nm){
        this.skate_clsf_nm = skate_clsf_nm;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
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

    @ElVoField(physicalName = "rpt_prity_date")
    public String getRpt_prity_date(){
        return rpt_prity_date;
    }

    @ElVoField(physicalName = "rpt_prity_date")
    public void setRpt_prity_date(String rpt_prity_date){
        this.rpt_prity_date = rpt_prity_date;
    }

    @ElVoField(physicalName = "apr_key")
    public String getApr_key(){
        return apr_key;
    }

    @ElVoField(physicalName = "apr_key")
    public void setApr_key(String apr_key){
        this.apr_key = apr_key;
    }

    @ElVoField(physicalName = "view")
    public String getView(){
        return view;
    }

    @ElVoField(physicalName = "view")
    public void setView(String view){
        this.view = view;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public String getAcdt_unusual_item(){
        return acdt_unusual_item;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public void setAcdt_unusual_item(String acdt_unusual_item){
        this.acdt_unusual_item = acdt_unusual_item;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "oa_id")
    public String getOa_id(){
        return oa_id;
    }

    @ElVoField(physicalName = "oa_id")
    public void setOa_id(String oa_id){
        this.oa_id = oa_id;
    }

    @ElVoField(physicalName = "oa_sn")
    public String getOa_sn(){
        return oa_sn;
    }

    @ElVoField(physicalName = "oa_sn")
    public void setOa_sn(String oa_sn){
        this.oa_sn = oa_sn;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public String getRcpt_clsf_nm(){
        return rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public void setRcpt_clsf_nm(String rcpt_clsf_nm){
        this.rcpt_clsf_nm = rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "state_cd")
    public String getState_cd(){
        return state_cd;
    }

    @ElVoField(physicalName = "state_cd")
    public void setState_cd(String state_cd){
        this.state_cd = state_cd;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public String getRcpt_oa_date(){
        return rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public void setRcpt_oa_date(String rcpt_oa_date){
        this.rcpt_oa_date = rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public String getRcpt_due_date(){
        return rcpt_due_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public void setRcpt_due_date(String rcpt_due_date){
        this.rcpt_due_date = rcpt_due_date;
    }

    @ElVoField(physicalName = "fnsh_date")
    public String getFnsh_date(){
        return fnsh_date;
    }

    @ElVoField(physicalName = "fnsh_date")
    public void setFnsh_date(String fnsh_date){
        this.fnsh_date = fnsh_date;
    }

    @ElVoField(physicalName = "seq_02")
    public String getSeq_02(){
        return seq_02;
    }

    @ElVoField(physicalName = "seq_02")
    public void setSeq_02(String seq_02){
        this.seq_02 = seq_02;
    }

    @ElVoField(physicalName = "input_ymd_02")
    public String getInput_ymd_02(){
        return input_ymd_02;
    }

    @ElVoField(physicalName = "input_ymd_02")
    public void setInput_ymd_02(String input_ymd_02){
        this.input_ymd_02 = input_ymd_02;
    }

    @ElVoField(physicalName = "ntb_regst_yn")
    public String getNtb_regst_yn(){
        return ntb_regst_yn;
    }

    @ElVoField(physicalName = "ntb_regst_yn")
    public void setNtb_regst_yn(String ntb_regst_yn){
        this.ntb_regst_yn = ntb_regst_yn;
    }

    @ElVoField(physicalName = "ntb_regst_yn_nm")
    public String getNtb_regst_yn_nm(){
        return ntb_regst_yn_nm;
    }

    @ElVoField(physicalName = "ntb_regst_yn_nm")
    public void setNtb_regst_yn_nm(String ntb_regst_yn_nm){
        this.ntb_regst_yn_nm = ntb_regst_yn_nm;
    }

    @ElVoField(physicalName = "ntb_regst_ymd")
    public String getNtb_regst_ymd(){
        return ntb_regst_ymd;
    }

    @ElVoField(physicalName = "ntb_regst_ymd")
    public void setNtb_regst_ymd(String ntb_regst_ymd){
        this.ntb_regst_ymd = ntb_regst_ymd;
    }

    @ElVoField(physicalName = "attach_file_no_02")
    public String getAttach_file_no_02(){
        return attach_file_no_02;
    }

    @ElVoField(physicalName = "attach_file_no_02")
    public void setAttach_file_no_02(String attach_file_no_02){
        this.attach_file_no_02 = attach_file_no_02;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public String getAttach_file_no_01(){
        return attach_file_no_01;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public void setAttach_file_no_01(String attach_file_no_01){
        this.attach_file_no_01 = attach_file_no_01;
    }

    @ElVoField(physicalName = "cnt_02")
    public String getCnt_02(){
        return cnt_02;
    }

    @ElVoField(physicalName = "cnt_02")
    public void setCnt_02(String cnt_02){
        this.cnt_02 = cnt_02;
    }

    @ElVoField(physicalName = "start_daytm")
    public String getStart_daytm(){
        return start_daytm;
    }

    @ElVoField(physicalName = "start_daytm")
    public void setStart_daytm(String start_daytm){
        this.start_daytm = start_daytm;
    }

    @ElVoField(physicalName = "end_daytm")
    public String getEnd_daytm(){
        return end_daytm;
    }

    @ElVoField(physicalName = "end_daytm")
    public void setEnd_daytm(String end_daytm){
        this.end_daytm = end_daytm;
    }

    @ElVoField(physicalName = "input_eval_tool")
    public String getInput_eval_tool(){
        return input_eval_tool;
    }

    @ElVoField(physicalName = "input_eval_tool")
    public void setInput_eval_tool(String input_eval_tool){
        this.input_eval_tool = input_eval_tool;
    }

    @ElVoField(physicalName = "post_eval_id")
    public String getPost_eval_id(){
        return post_eval_id;
    }

    @ElVoField(physicalName = "post_eval_id")
    public void setPost_eval_id(String post_eval_id){
        this.post_eval_id = post_eval_id;
    }

    @ElVoField(physicalName = "eval_organ")
    public String getEval_organ(){
        return eval_organ;
    }

    @ElVoField(physicalName = "eval_organ")
    public void setEval_organ(String eval_organ){
        this.eval_organ = eval_organ;
    }

    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }

    @ElVoField(physicalName = "eval_tool")
    public String getEval_tool(){
        return eval_tool;
    }

    @ElVoField(physicalName = "eval_tool")
    public void setEval_tool(String eval_tool){
        this.eval_tool = eval_tool;
    }

    @ElVoField(physicalName = "eval_grade")
    public String getEval_grade(){
        return eval_grade;
    }

    @ElVoField(physicalName = "eval_grade")
    public void setEval_grade(String eval_grade){
        this.eval_grade = eval_grade;
    }

    @ElVoField(physicalName = "discu_clsf")
    public String getDiscu_clsf(){
        return discu_clsf;
    }

    @ElVoField(physicalName = "discu_clsf")
    public void setDiscu_clsf(String discu_clsf){
        this.discu_clsf = discu_clsf;
    }

    @ElVoField(physicalName = "eval_attach_file")
    public String getEval_attach_file(){
        return eval_attach_file;
    }

    @ElVoField(physicalName = "eval_attach_file")
    public void setEval_attach_file(String eval_attach_file){
        this.eval_attach_file = eval_attach_file;
    }

    @ElVoField(physicalName = "eval_date")
    public String getEval_date(){
        return eval_date;
    }

    @ElVoField(physicalName = "eval_date")
    public void setEval_date(String eval_date){
        this.eval_date = eval_date;
    }

    @ElVoField(physicalName = "appCostSum")
    public String getAppCostSum(){
        return appCostSum;
    }

    @ElVoField(physicalName = "appCostSum")
    public void setAppCostSum(String appCostSum){
        this.appCostSum = appCostSum;
    }

    @ElVoField(physicalName = "oaCostSum")
    public String getOaCostSum(){
        return oaCostSum;
    }

    @ElVoField(physicalName = "oaCostSum")
    public void setOaCostSum(String oaCostSum){
        this.oaCostSum = oaCostSum;
    }

    @ElVoField(physicalName = "regCostSum")
    public String getRegCostSum(){
        return regCostSum;
    }

    @ElVoField(physicalName = "regCostSum")
    public void setRegCostSum(String regCostSum){
        this.regCostSum = regCostSum;
    }

    @ElVoField(physicalName = "annualCostSum")
    public String getAnnualCostSum(){
        return annualCostSum;
    }

    @ElVoField(physicalName = "annualCostSum")
    public void setAnnualCostSum(String annualCostSum){
        this.annualCostSum = annualCostSum;
    }

    @ElVoField(physicalName = "etcCostSum")
    public String getEtcCostSum(){
        return etcCostSum;
    }

    @ElVoField(physicalName = "etcCostSum")
    public void setEtcCostSum(String etcCostSum){
        this.etcCostSum = etcCostSum;
    }

    @ElVoField(physicalName = "expns_mngmt_no")
    public String getExpns_mngmt_no(){
        return expns_mngmt_no;
    }

    @ElVoField(physicalName = "expns_mngmt_no")
    public void setExpns_mngmt_no(String expns_mngmt_no){
        this.expns_mngmt_no = expns_mngmt_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "acdt_contnt")
    public String getAcdt_contnt(){
        return acdt_contnt;
    }

    @ElVoField(physicalName = "acdt_contnt")
    public void setAcdt_contnt(String acdt_contnt){
        this.acdt_contnt = acdt_contnt;
    }

    @ElVoField(physicalName = "governpay_fee")
    public String getGovernpay_fee(){
        return governpay_fee;
    }

    @ElVoField(physicalName = "governpay_fee")
    public void setGovernpay_fee(String governpay_fee){
        this.governpay_fee = governpay_fee;
    }

    @ElVoField(physicalName = "out_governpay_fee")
    public String getOut_governpay_fee(){
        return out_governpay_fee;
    }

    @ElVoField(physicalName = "out_governpay_fee")
    public void setOut_governpay_fee(String out_governpay_fee){
        this.out_governpay_fee = out_governpay_fee;
    }

    @ElVoField(physicalName = "supply_price")
    public String getSupply_price(){
        return supply_price;
    }

    @ElVoField(physicalName = "supply_price")
    public void setSupply_price(String supply_price){
        this.supply_price = supply_price;
    }

    @ElVoField(physicalName = "out_supply_price")
    public String getOut_supply_price(){
        return out_supply_price;
    }

    @ElVoField(physicalName = "out_supply_price")
    public void setOut_supply_price(String out_supply_price){
        this.out_supply_price = out_supply_price;
    }

    @ElVoField(physicalName = "surtax")
    public String getSurtax(){
        return surtax;
    }

    @ElVoField(physicalName = "surtax")
    public void setSurtax(String surtax){
        this.surtax = surtax;
    }

    @ElVoField(physicalName = "out_commission")
    public String getOut_commission(){
        return out_commission;
    }

    @ElVoField(physicalName = "out_commission")
    public void setOut_commission(String out_commission){
        this.out_commission = out_commission;
    }

    @ElVoField(physicalName = "total_price")
    public String getTotal_price(){
        return total_price;
    }

    @ElVoField(physicalName = "total_price")
    public void setTotal_price(String total_price){
        this.total_price = total_price;
    }

    @ElVoField(physicalName = "no_type")
    public String getNo_type(){
        return no_type;
    }

    @ElVoField(physicalName = "no_type")
    public void setNo_type(String no_type){
        this.no_type = no_type;
    }

    @ElVoField(physicalName = "date_type")
    public String getDate_type(){
        return date_type;
    }

    @ElVoField(physicalName = "date_type")
    public void setDate_type(String date_type){
        this.date_type = date_type;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "cost_kind")
    public String getCost_kind(){
        return cost_kind;
    }

    @ElVoField(physicalName = "cost_kind")
    public void setCost_kind(String cost_kind){
        this.cost_kind = cost_kind;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPsrInquiryManageVo [");
        sb.append("bpm_yn").append("=").append(bpm_yn).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("co_smitapp_ex_nm").append("=").append(co_smitapp_ex_nm).append(",");
        sb.append("invnt_draft_ymd").append("=").append(invnt_draft_ymd).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("invnt_syspaynm").append("=").append(invnt_syspaynm).append(",");
        sb.append("invnt_apprvl_complt_ymd").append("=").append(invnt_apprvl_complt_ymd).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("vend_type").append("=").append(vend_type).append(",");
        sb.append("vend_type_nm").append("=").append(vend_type_nm).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("vend_bsn_no").append("=").append(vend_bsn_no).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("stake_rt").append("=").append(stake_rt).append(",");
        sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
        sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
        sb.append("mandate_psn_nm").append("=").append(mandate_psn_nm).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("keep_mngmt_offc").append("=").append(keep_mngmt_offc).append(",");
        sb.append("keep_mngmt_offc_nm").append("=").append(keep_mngmt_offc_nm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("start_date").append("=").append(start_date).append(",");
        sb.append("end_date").append("=").append(end_date).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
        sb.append("invnt_psn_syspayno").append("=").append(invnt_psn_syspayno).append(",");
        sb.append("main_invnt_psn_syspayno").append("=").append(main_invnt_psn_syspayno).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("eval_grade_yn").append("=").append(eval_grade_yn).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("main_invnt_syspayno").append("=").append(main_invnt_syspayno).append(",");
        sb.append("invnt_psn_nm").append("=").append(invnt_psn_nm).append(",");
        sb.append("main_invnt_psn_nm").append("=").append(main_invnt_psn_nm).append(",");
        sb.append("main_invnt_empno").append("=").append(main_invnt_empno).append(",");
        sb.append("invnt_dept_nm").append("=").append(invnt_dept_nm).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
        sb.append("trans_yn").append("=").append(trans_yn).append(",");
        sb.append("eval_grade_val").append("=").append(eval_grade_val).append(",");
        sb.append("pat_grd_nm").append("=").append(pat_grd_nm).append(",");
        sb.append("interview_yn").append("=").append(interview_yn).append(",");
        sb.append("dom_oversea_nm").append("=").append(dom_oversea_nm).append(",");
        sb.append("demand_vend_nm").append("=").append(demand_vend_nm).append(",");
        sb.append("giveup_knd_nm").append("=").append(giveup_knd_nm).append(",");
        sb.append("invnt_eng_nm").append("=").append(invnt_eng_nm).append(",");
        sb.append("patofic_mng_no").append("=").append(patofic_mng_no).append(",");
        sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
        sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
        sb.append("tech_clsf_nm").append("=").append(tech_clsf_nm).append(",");
        sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
        sb.append("smitapp_occr_clsf").append("=").append(smitapp_occr_clsf).append(",");
        sb.append("smitapp_occr_clsf_nm").append("=").append(smitapp_occr_clsf_nm).append(",");
        sb.append("bef_open_yn").append("=").append(bef_open_yn).append(",");
        sb.append("ely_open_ex").append("=").append(ely_open_ex).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex).append(",");
        sb.append("prity_eval_ex").append("=").append(prity_eval_ex).append(",");
        sb.append("open_attach_file_no").append("=").append(open_attach_file_no).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("intrn_smitapp_no").append("=").append(intrn_smitapp_no).append(",");
        sb.append("intrn_smitapp_ymd").append("=").append(intrn_smitapp_ymd).append(",");
        sb.append("regst_reg_ymd").append("=").append(regst_reg_ymd).append(",");
        sb.append("smitapp_reg_ymd").append("=").append(smitapp_reg_ymd).append(",");
        sb.append("prityrgt_main_rspns_no").append("=").append(prityrgt_main_rspns_no).append(",");
        sb.append("prityrgt_main_rspns_ymd").append("=").append(prityrgt_main_rspns_ymd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("gb_nm").append("=").append(gb_nm).append(",");
        sb.append("gb").append("=").append(gb).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("manager_nm").append("=").append(manager_nm).append(",");
        sb.append("manager_deptnm").append("=").append(manager_deptnm).append(",");
        sb.append("compt_date").append("=").append(compt_date).append(",");
        sb.append("comp_yn").append("=").append(comp_yn).append(",");
        sb.append("bigo").append("=").append(bigo).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("resch_respn_syspayno").append("=").append(resch_respn_syspayno).append(",");
        sb.append("resch_respn_syspaynm").append("=").append(resch_respn_syspaynm).append(",");
        sb.append("prj_term").append("=").append(prj_term).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("blong_clsf").append("=").append(blong_clsf).append(",");
        sb.append("blong_clsf_nm").append("=").append(blong_clsf_nm).append(",");
        sb.append("blong_cd").append("=").append(blong_cd).append(",");
        sb.append("blong_nm").append("=").append(blong_nm).append(",");
        sb.append("nm_krn").append("=").append(nm_krn).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("invnt_psn_clsf").append("=").append(invnt_psn_clsf).append(",");
        sb.append("stake_dept").append("=").append(stake_dept).append(",");
        sb.append("app_id").append("=").append(app_id).append(",");
        sb.append("prt_app_no").append("=").append(prt_app_no).append(",");
        sb.append("prt_app_date").append("=").append(prt_app_date).append(",");
        sb.append("prt_indep_cnt").append("=").append(prt_indep_cnt).append(",");
        sb.append("prt_depen_cnt").append("=").append(prt_depen_cnt).append(",");
        sb.append("prt_spec_cnt").append("=").append(prt_spec_cnt).append(",");
        sb.append("prt_draw_cnt").append("=").append(prt_draw_cnt).append(",");
        sb.append("prt_ko_app_title").append("=").append(prt_ko_app_title).append(",");
        sb.append("prt_en_app_title").append("=").append(prt_en_app_title).append(",");
        sb.append("prt_app_attach_file").append("=").append(prt_app_attach_file).append(",");
        sb.append("prt_attach_file").append("=").append(prt_attach_file).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("key_1").append("=").append(key_1).append(",");
        sb.append("key_2").append("=").append(key_2).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("sub_biz_clsf").append("=").append(sub_biz_clsf).append(",");
        sb.append("item_clsf").append("=").append(item_clsf).append(",");
        sb.append("rvew_objct").append("=").append(rvew_objct).append(",");
        sb.append("chrg_psn").append("=").append(chrg_psn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cmt_clsf").append("=").append(cmt_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("invnt_clsf").append("=").append(invnt_clsf).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("reg_id").append("=").append(reg_id).append(",");
        sb.append("prt_reg_no").append("=").append(prt_reg_no).append(",");
        sb.append("prt_reg_date").append("=").append(prt_reg_date).append(",");
        sb.append("prt_ko_reg_title").append("=").append(prt_ko_reg_title).append(",");
        sb.append("prt_en_reg_title").append("=").append(prt_en_reg_title).append(",");
        sb.append("prt_regist_attach_file").append("=").append(prt_regist_attach_file).append(",");
        sb.append("prt_reg_org_attach_file").append("=").append(prt_reg_org_attach_file).append(",");
        sb.append("prt_reg_attach_file").append("=").append(prt_reg_attach_file).append(",");
        sb.append("skate_clsf").append("=").append(skate_clsf).append(",");
        sb.append("his_seq").append("=").append(his_seq).append(",");
        sb.append("input_ymd").append("=").append(input_ymd).append(",");
        sb.append("skate_clsf_nm").append("=").append(skate_clsf_nm).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("tech_fee_clsf").append("=").append(tech_fee_clsf).append(",");
        sb.append("first_pre_prj_no").append("=").append(first_pre_prj_no).append(",");
        sb.append("mou_state_nm").append("=").append(mou_state_nm).append(",");
        sb.append("tech_fee_no").append("=").append(tech_fee_no).append(",");
        sb.append("tech_nm").append("=").append(tech_nm).append(",");
        sb.append("permit_clsf_nm").append("=").append(permit_clsf_nm).append(",");
        sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("rspns_nm").append("=").append(rspns_nm).append(",");
        sb.append("contrct_fee").append("=").append(contrct_fee).append(",");
        sb.append("ofic_depst_amt").append("=").append(ofic_depst_amt).append(",");
        sb.append("rpt_prity_date").append("=").append(rpt_prity_date).append(",");
        sb.append("apr_key").append("=").append(apr_key).append(",");
        sb.append("view").append("=").append(view).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("acdt_unusual_item").append("=").append(acdt_unusual_item).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("oa_id").append("=").append(oa_id).append(",");
        sb.append("oa_sn").append("=").append(oa_sn).append(",");
        sb.append("rcpt_clsf_nm").append("=").append(rcpt_clsf_nm).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("state_cd").append("=").append(state_cd).append(",");
        sb.append("rcpt_oa_date").append("=").append(rcpt_oa_date).append(",");
        sb.append("rcpt_due_date").append("=").append(rcpt_due_date).append(",");
        sb.append("fnsh_date").append("=").append(fnsh_date).append(",");
        sb.append("seq_02").append("=").append(seq_02).append(",");
        sb.append("input_ymd_02").append("=").append(input_ymd_02).append(",");
        sb.append("ntb_regst_yn").append("=").append(ntb_regst_yn).append(",");
        sb.append("ntb_regst_yn_nm").append("=").append(ntb_regst_yn_nm).append(",");
        sb.append("ntb_regst_ymd").append("=").append(ntb_regst_ymd).append(",");
        sb.append("attach_file_no_02").append("=").append(attach_file_no_02).append(",");
        sb.append("attach_file_no_01").append("=").append(attach_file_no_01).append(",");
        sb.append("cnt_02").append("=").append(cnt_02).append(",");
        sb.append("start_daytm").append("=").append(start_daytm).append(",");
        sb.append("end_daytm").append("=").append(end_daytm).append(",");
        sb.append("input_eval_tool").append("=").append(input_eval_tool).append(",");
        sb.append("post_eval_id").append("=").append(post_eval_id).append(",");
        sb.append("eval_organ").append("=").append(eval_organ).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("eval_tool").append("=").append(eval_tool).append(",");
        sb.append("eval_grade").append("=").append(eval_grade).append(",");
        sb.append("discu_clsf").append("=").append(discu_clsf).append(",");
        sb.append("eval_attach_file").append("=").append(eval_attach_file).append(",");
        sb.append("eval_date").append("=").append(eval_date).append(",");
        sb.append("appCostSum").append("=").append(appCostSum).append(",");
        sb.append("oaCostSum").append("=").append(oaCostSum).append(",");
        sb.append("regCostSum").append("=").append(regCostSum).append(",");
        sb.append("annualCostSum").append("=").append(annualCostSum).append(",");
        sb.append("etcCostSum").append("=").append(etcCostSum).append(",");
        sb.append("expns_mngmt_no").append("=").append(expns_mngmt_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("acdt_contnt").append("=").append(acdt_contnt).append(",");
        sb.append("governpay_fee").append("=").append(governpay_fee).append(",");
        sb.append("out_governpay_fee").append("=").append(out_governpay_fee).append(",");
        sb.append("supply_price").append("=").append(supply_price).append(",");
        sb.append("out_supply_price").append("=").append(out_supply_price).append(",");
        sb.append("surtax").append("=").append(surtax).append(",");
        sb.append("out_commission").append("=").append(out_commission).append(",");
        sb.append("total_price").append("=").append(total_price).append(",");
        sb.append("no_type").append("=").append(no_type).append(",");
        sb.append("date_type").append("=").append(date_type).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("cost_kind").append("=").append(cost_kind);
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
