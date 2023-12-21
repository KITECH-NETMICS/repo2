package kr.re.kitech.biz.pat.dft.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatFreeInventionExp")
public class PatFreeInventionVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatFreeInventionVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "deptTyp", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "regstDaytmSt", physicalName = "regst_daytm_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm_st;

    @ElDtoField(logicalName = "regstDaytmEd", physicalName = "regst_daytm_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm_ed;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "regstNm", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "invntClsf", physicalName = "invnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf;

    @ElDtoField(logicalName = "coSmitappEx", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "rsmlMngmtNo", physicalName = "rsml_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsml_mngmt_no;

    @ElDtoField(logicalName = "rsupMngmtNo", physicalName = "rsup_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsup_mngmt_no;

    @ElDtoField(logicalName = "rsmlRstCd", physicalName = "rsml_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsml_rst_cd;

    @ElDtoField(logicalName = "rsupRstCd", physicalName = "rsup_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsup_rst_cd;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "invntEngNm", physicalName = "invnt_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_eng_nm;

    @ElDtoField(logicalName = "transNm", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "techField", physicalName = "tech_field", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_field;

    @ElDtoField(logicalName = "relatInvnt", physicalName = "relat_invnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_invnt;

    @ElDtoField(logicalName = "indstUseClsf", physicalName = "indst_use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_use_clsf;

    @ElDtoField(logicalName = "solveTask", physicalName = "solve_task", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String solve_task;

    @ElDtoField(logicalName = "invntEfct", physicalName = "invnt_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_efct;

    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "tempOversappHopeEx", physicalName = "temp_oversapp_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String temp_oversapp_hope_ex;

    @ElDtoField(logicalName = "pctChk", physicalName = "pct_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_chk;

    @ElDtoField(logicalName = "smitappHopeNatnCd", physicalName = "smitapp_hope_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_cd;

    @ElDtoField(logicalName = "smitappHopeNatnNm", physicalName = "smitapp_hope_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_nm;

    @ElDtoField(logicalName = "openEx", physicalName = "open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ex;

    @ElDtoField(logicalName = "openYmd", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "openContnt", physicalName = "open_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_contnt;

    @ElDtoField(logicalName = "patGrd", physicalName = "pat_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd;

    @ElDtoField(logicalName = "grdResn", physicalName = "grd_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grd_resn;

    @ElDtoField(logicalName = "befOpenYn", physicalName = "bef_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bef_open_yn;

    @ElDtoField(logicalName = "elyOpenEx", physicalName = "ely_open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ely_open_ex;

    @ElDtoField(logicalName = "evalDemndEx", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElDtoField(logicalName = "prityEvalEx", physicalName = "prity_eval_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_ex;

    @ElDtoField(logicalName = "smitappOccrClsf", physicalName = "smitapp_occr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf;

    @ElDtoField(logicalName = "smitappWay", physicalName = "smitapp_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way;

    @ElDtoField(logicalName = "hopePatoficCd", physicalName = "hope_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_cd;

    @ElDtoField(logicalName = "hopePatoficContacLoc", physicalName = "hope_patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_contac_loc;

    @ElDtoField(logicalName = "hopePatoficNm", physicalName = "hope_patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_nm;

    @ElDtoField(logicalName = "hopePatoficChargId", physicalName = "hope_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_id;

    @ElDtoField(logicalName = "hopePatoficChargNm", physicalName = "hope_patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_nm;

    @ElDtoField(logicalName = "techEvalHopeEx", physicalName = "tech_eval_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_hope_ex;

    @ElDtoField(logicalName = "techBefrHopeEx", physicalName = "tech_befr_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_befr_hope_ex;

    @ElDtoField(logicalName = "techTransHopeAmt", physicalName = "tech_trans_hope_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_amt;

    @ElDtoField(logicalName = "techTransHopeTyp", physicalName = "tech_trans_hope_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_typ;

    @ElDtoField(logicalName = "tempStorgYmd", physicalName = "temp_storg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String temp_storg_ymd;

    @ElDtoField(logicalName = "affirReqYmd", physicalName = "affir_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affir_req_ymd;

    @ElDtoField(logicalName = "invntPsnRmk", physicalName = "invnt_psn_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_rmk;

    @ElDtoField(logicalName = "invntDraftYmd", physicalName = "invnt_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_draft_ymd;

    @ElDtoField(logicalName = "invntApprvlCompltYmd", physicalName = "invnt_apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_apprvl_complt_ymd;

    @ElDtoField(logicalName = "invntRejectYmd", physicalName = "invnt_reject_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_ymd;

    @ElDtoField(logicalName = "invntRejectResn", physicalName = "invnt_reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_resn;

    @ElDtoField(logicalName = "invntWrteSyspayno", physicalName = "invnt_wrte_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_wrte_syspayno;

    @ElDtoField(logicalName = "prityrgtWdrwYmd", physicalName = "prityrgt_wdrw_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_wdrw_ymd;

    @ElDtoField(logicalName = "oldDataMngmtNo", physicalName = "old_data_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_data_mngmt_no;

    @ElDtoField(logicalName = "attachFileNo1", physicalName = "attach_file_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_1;

    @ElDtoField(logicalName = "pctAttachFileNo", physicalName = "pct_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_attach_file_no;

    @ElDtoField(logicalName = "outDeedAttachFileNo", physicalName = "out_deed_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_deed_attach_file_no;

    @ElDtoField(logicalName = "comApplyAttachFileNo", physicalName = "com_apply_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_apply_attach_file_no;

    @ElDtoField(logicalName = "oneInvntAttachFileNo", physicalName = "one_invnt_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String one_invnt_attach_file_no;

    @ElDtoField(logicalName = "techClsf", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;

    @ElDtoField(logicalName = "relatDomSmitappNo", physicalName = "relat_dom_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_dom_smitapp_no;

    @ElDtoField(logicalName = "preTechWrtInvst", physicalName = "pre_tech_wrt_invst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_tech_wrt_invst;

    @ElDtoField(logicalName = "attachFileNo2", physicalName = "attach_file_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_2;

    @ElDtoField(logicalName = "attachFileNo3", physicalName = "attach_file_no_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_3;

    @ElDtoField(logicalName = "attachFileNo4", physicalName = "attach_file_no_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_4;

    @ElDtoField(logicalName = "planAttachFileNo", physicalName = "plan_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_attach_file_no;

    @ElDtoField(logicalName = "openAttachFileNo", physicalName = "open_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_attach_file_no;

    @ElDtoField(logicalName = "etcAttachFileNo", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "attachFileNo5", physicalName = "attach_file_no_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_5;

    @ElDtoField(logicalName = "mandatePsnSyspayno", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;

    @ElDtoField(logicalName = "indstTechClsf", physicalName = "indst_tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf;

    @ElDtoField(logicalName = "indstTechSmlClsf", physicalName = "indst_tech_sml_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_sml_clsf;

    @ElDtoField(logicalName = "trnsYn", physicalName = "trns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trns_yn;

    @ElDtoField(logicalName = "techFee", physicalName = "tech_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee;

    @ElDtoField(logicalName = "trnsYmd", physicalName = "trns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trns_ymd;

    @ElDtoField(logicalName = "interviewYn", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;

    @ElDtoField(logicalName = "trlStepCd", physicalName = "trl_step_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trl_step_cd;

    @ElDtoField(logicalName = "indstTechMinorClsf", physicalName = "indst_tech_minor_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_minor_clsf;

    @ElDtoField(logicalName = "pdpFlag", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "demandVendNm", physicalName = "demand_vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demand_vend_nm;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "vendType", physicalName = "vend_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type;

    @ElDtoField(logicalName = "vendCd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "vendBsnNo", physicalName = "vend_bsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_bsn_no;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "stakeRt", physicalName = "stake_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_rt;

    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "contacLoc", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

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

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "invntPsnClsf", physicalName = "invnt_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf;

    @ElDtoField(logicalName = "tmMean", physicalName = "tm_mean", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tm_mean;

    @ElDtoField(logicalName = "tmDesc", physicalName = "tm_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tm_desc;

    @ElDtoField(logicalName = "appontGoods", physicalName = "appont_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_goods;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "smitappUrgntgee", physicalName = "smitapp_urgntgee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_urgntgee;

    @ElDtoField(logicalName = "smitappUrgntgeeResn", physicalName = "smitapp_urgntgee_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_urgntgee_resn;

    @ElDtoField(logicalName = "preDesnEx", physicalName = "pre_desn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_desn_ex;

    @ElDtoField(logicalName = "preDesnNm", physicalName = "pre_desn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_desn_nm;

    @ElDtoField(logicalName = "desnDetlsDesc", physicalName = "desn_detls_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desn_detls_desc;

    @ElDtoField(logicalName = "attachFileNo6", physicalName = "attach_file_no_6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_6;

    @ElDtoField(logicalName = "attachFileNo7", physicalName = "attach_file_no_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_7;

    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "tmReqNo", physicalName = "tm_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tm_req_no;

    @ElDtoField(logicalName = "attachFileNoTab3", physicalName = "attach_file_no_tab3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_tab3;

    @ElDtoField(logicalName = "desnReqNo", physicalName = "desn_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desn_req_no;

    @ElDtoField(logicalName = "attachFileNoTab2", physicalName = "attach_file_no_tab2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_tab2;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "residNoDis", physicalName = "resid_no_dis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no_dis;

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

    @ElDtoField(logicalName = "attachClsf", physicalName = "attach_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_clsf;

    @ElDtoField(logicalName = "desc", physicalName = "desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desc;

    @ElDtoField(logicalName = "roleType", physicalName = "role_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_type;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "fileList_A", physicalName = "fileList_A", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_A;

    @ElDtoField(logicalName = "fileList_B", physicalName = "fileList_B", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_B;

    @ElDtoField(logicalName = "fileList_C", physicalName = "fileList_C", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_C;

    @ElDtoField(logicalName = "fileList_D", physicalName = "fileList_D", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_D;

    @ElDtoField(logicalName = "fileList_E", physicalName = "fileList_E", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_E;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "endpoint", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "ext3_cd", physicalName = "ext3_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext3_cd;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "pat_clsf_nm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "rve_clsf", physicalName = "rve_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rve_clsf;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo2", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo2;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo3", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo3;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo4", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo4;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo5", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo5;

    @ElDtoField(logicalName = "ListVo", physicalName = "vendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> vendList;

    @ElDtoField(logicalName = "ListVo", physicalName = "invntpsnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> invntpsnList;

    @ElDtoField(logicalName = "ListVo", physicalName = "attachtab2List", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> attachtab2List;

    @ElDtoField(logicalName = "Vo", physicalName = "tabData", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo tabData;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "regst_daytm_st")
    public String getRegst_daytm_st(){
        return regst_daytm_st;
    }

    @ElVoField(physicalName = "regst_daytm_st")
    public void setRegst_daytm_st(String regst_daytm_st){
        this.regst_daytm_st = regst_daytm_st;
    }

    @ElVoField(physicalName = "regst_daytm_ed")
    public String getRegst_daytm_ed(){
        return regst_daytm_ed;
    }

    @ElVoField(physicalName = "regst_daytm_ed")
    public void setRegst_daytm_ed(String regst_daytm_ed){
        this.regst_daytm_ed = regst_daytm_ed;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public String getInvnt_clsf(){
        return invnt_clsf;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public void setInvnt_clsf(String invnt_clsf){
        this.invnt_clsf = invnt_clsf;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "rsml_mngmt_no")
    public String getRsml_mngmt_no(){
        return rsml_mngmt_no;
    }

    @ElVoField(physicalName = "rsml_mngmt_no")
    public void setRsml_mngmt_no(String rsml_mngmt_no){
        this.rsml_mngmt_no = rsml_mngmt_no;
    }

    @ElVoField(physicalName = "rsup_mngmt_no")
    public String getRsup_mngmt_no(){
        return rsup_mngmt_no;
    }

    @ElVoField(physicalName = "rsup_mngmt_no")
    public void setRsup_mngmt_no(String rsup_mngmt_no){
        this.rsup_mngmt_no = rsup_mngmt_no;
    }

    @ElVoField(physicalName = "rsml_rst_cd")
    public String getRsml_rst_cd(){
        return rsml_rst_cd;
    }

    @ElVoField(physicalName = "rsml_rst_cd")
    public void setRsml_rst_cd(String rsml_rst_cd){
        this.rsml_rst_cd = rsml_rst_cd;
    }

    @ElVoField(physicalName = "rsup_rst_cd")
    public String getRsup_rst_cd(){
        return rsup_rst_cd;
    }

    @ElVoField(physicalName = "rsup_rst_cd")
    public void setRsup_rst_cd(String rsup_rst_cd){
        this.rsup_rst_cd = rsup_rst_cd;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public String getInvnt_eng_nm(){
        return invnt_eng_nm;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public void setInvnt_eng_nm(String invnt_eng_nm){
        this.invnt_eng_nm = invnt_eng_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public String getTrans_nm(){
        return trans_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public void setTrans_nm(String trans_nm){
        this.trans_nm = trans_nm;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "tech_field")
    public String getTech_field(){
        return tech_field;
    }

    @ElVoField(physicalName = "tech_field")
    public void setTech_field(String tech_field){
        this.tech_field = tech_field;
    }

    @ElVoField(physicalName = "relat_invnt")
    public String getRelat_invnt(){
        return relat_invnt;
    }

    @ElVoField(physicalName = "relat_invnt")
    public void setRelat_invnt(String relat_invnt){
        this.relat_invnt = relat_invnt;
    }

    @ElVoField(physicalName = "indst_use_clsf")
    public String getIndst_use_clsf(){
        return indst_use_clsf;
    }

    @ElVoField(physicalName = "indst_use_clsf")
    public void setIndst_use_clsf(String indst_use_clsf){
        this.indst_use_clsf = indst_use_clsf;
    }

    @ElVoField(physicalName = "solve_task")
    public String getSolve_task(){
        return solve_task;
    }

    @ElVoField(physicalName = "solve_task")
    public void setSolve_task(String solve_task){
        this.solve_task = solve_task;
    }

    @ElVoField(physicalName = "invnt_efct")
    public String getInvnt_efct(){
        return invnt_efct;
    }

    @ElVoField(physicalName = "invnt_efct")
    public void setInvnt_efct(String invnt_efct){
        this.invnt_efct = invnt_efct;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "temp_oversapp_hope_ex")
    public String getTemp_oversapp_hope_ex(){
        return temp_oversapp_hope_ex;
    }

    @ElVoField(physicalName = "temp_oversapp_hope_ex")
    public void setTemp_oversapp_hope_ex(String temp_oversapp_hope_ex){
        this.temp_oversapp_hope_ex = temp_oversapp_hope_ex;
    }

    @ElVoField(physicalName = "pct_chk")
    public String getPct_chk(){
        return pct_chk;
    }

    @ElVoField(physicalName = "pct_chk")
    public void setPct_chk(String pct_chk){
        this.pct_chk = pct_chk;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_cd")
    public String getSmitapp_hope_natn_cd(){
        return smitapp_hope_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_cd")
    public void setSmitapp_hope_natn_cd(String smitapp_hope_natn_cd){
        this.smitapp_hope_natn_cd = smitapp_hope_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public String getSmitapp_hope_natn_nm(){
        return smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public void setSmitapp_hope_natn_nm(String smitapp_hope_natn_nm){
        this.smitapp_hope_natn_nm = smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "open_ex")
    public String getOpen_ex(){
        return open_ex;
    }

    @ElVoField(physicalName = "open_ex")
    public void setOpen_ex(String open_ex){
        this.open_ex = open_ex;
    }

    @ElVoField(physicalName = "open_ymd")
    public String getOpen_ymd(){
        return open_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public void setOpen_ymd(String open_ymd){
        this.open_ymd = open_ymd;
    }

    @ElVoField(physicalName = "open_contnt")
    public String getOpen_contnt(){
        return open_contnt;
    }

    @ElVoField(physicalName = "open_contnt")
    public void setOpen_contnt(String open_contnt){
        this.open_contnt = open_contnt;
    }

    @ElVoField(physicalName = "pat_grd")
    public String getPat_grd(){
        return pat_grd;
    }

    @ElVoField(physicalName = "pat_grd")
    public void setPat_grd(String pat_grd){
        this.pat_grd = pat_grd;
    }

    @ElVoField(physicalName = "grd_resn")
    public String getGrd_resn(){
        return grd_resn;
    }

    @ElVoField(physicalName = "grd_resn")
    public void setGrd_resn(String grd_resn){
        this.grd_resn = grd_resn;
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

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public String getSmitapp_occr_clsf(){
        return smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public void setSmitapp_occr_clsf(String smitapp_occr_clsf){
        this.smitapp_occr_clsf = smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "smitapp_way")
    public String getSmitapp_way(){
        return smitapp_way;
    }

    @ElVoField(physicalName = "smitapp_way")
    public void setSmitapp_way(String smitapp_way){
        this.smitapp_way = smitapp_way;
    }

    @ElVoField(physicalName = "hope_patofic_cd")
    public String getHope_patofic_cd(){
        return hope_patofic_cd;
    }

    @ElVoField(physicalName = "hope_patofic_cd")
    public void setHope_patofic_cd(String hope_patofic_cd){
        this.hope_patofic_cd = hope_patofic_cd;
    }

    @ElVoField(physicalName = "hope_patofic_contac_loc")
    public String getHope_patofic_contac_loc(){
        return hope_patofic_contac_loc;
    }

    @ElVoField(physicalName = "hope_patofic_contac_loc")
    public void setHope_patofic_contac_loc(String hope_patofic_contac_loc){
        this.hope_patofic_contac_loc = hope_patofic_contac_loc;
    }

    @ElVoField(physicalName = "hope_patofic_nm")
    public String getHope_patofic_nm(){
        return hope_patofic_nm;
    }

    @ElVoField(physicalName = "hope_patofic_nm")
    public void setHope_patofic_nm(String hope_patofic_nm){
        this.hope_patofic_nm = hope_patofic_nm;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public String getHope_patofic_charg_id(){
        return hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public void setHope_patofic_charg_id(String hope_patofic_charg_id){
        this.hope_patofic_charg_id = hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "hope_patofic_charg_nm")
    public String getHope_patofic_charg_nm(){
        return hope_patofic_charg_nm;
    }

    @ElVoField(physicalName = "hope_patofic_charg_nm")
    public void setHope_patofic_charg_nm(String hope_patofic_charg_nm){
        this.hope_patofic_charg_nm = hope_patofic_charg_nm;
    }

    @ElVoField(physicalName = "tech_eval_hope_ex")
    public String getTech_eval_hope_ex(){
        return tech_eval_hope_ex;
    }

    @ElVoField(physicalName = "tech_eval_hope_ex")
    public void setTech_eval_hope_ex(String tech_eval_hope_ex){
        this.tech_eval_hope_ex = tech_eval_hope_ex;
    }

    @ElVoField(physicalName = "tech_befr_hope_ex")
    public String getTech_befr_hope_ex(){
        return tech_befr_hope_ex;
    }

    @ElVoField(physicalName = "tech_befr_hope_ex")
    public void setTech_befr_hope_ex(String tech_befr_hope_ex){
        this.tech_befr_hope_ex = tech_befr_hope_ex;
    }

    @ElVoField(physicalName = "tech_trans_hope_amt")
    public String getTech_trans_hope_amt(){
        return tech_trans_hope_amt;
    }

    @ElVoField(physicalName = "tech_trans_hope_amt")
    public void setTech_trans_hope_amt(String tech_trans_hope_amt){
        this.tech_trans_hope_amt = tech_trans_hope_amt;
    }

    @ElVoField(physicalName = "tech_trans_hope_typ")
    public String getTech_trans_hope_typ(){
        return tech_trans_hope_typ;
    }

    @ElVoField(physicalName = "tech_trans_hope_typ")
    public void setTech_trans_hope_typ(String tech_trans_hope_typ){
        this.tech_trans_hope_typ = tech_trans_hope_typ;
    }

    @ElVoField(physicalName = "temp_storg_ymd")
    public String getTemp_storg_ymd(){
        return temp_storg_ymd;
    }

    @ElVoField(physicalName = "temp_storg_ymd")
    public void setTemp_storg_ymd(String temp_storg_ymd){
        this.temp_storg_ymd = temp_storg_ymd;
    }

    @ElVoField(physicalName = "affir_req_ymd")
    public String getAffir_req_ymd(){
        return affir_req_ymd;
    }

    @ElVoField(physicalName = "affir_req_ymd")
    public void setAffir_req_ymd(String affir_req_ymd){
        this.affir_req_ymd = affir_req_ymd;
    }

    @ElVoField(physicalName = "invnt_psn_rmk")
    public String getInvnt_psn_rmk(){
        return invnt_psn_rmk;
    }

    @ElVoField(physicalName = "invnt_psn_rmk")
    public void setInvnt_psn_rmk(String invnt_psn_rmk){
        this.invnt_psn_rmk = invnt_psn_rmk;
    }

    @ElVoField(physicalName = "invnt_draft_ymd")
    public String getInvnt_draft_ymd(){
        return invnt_draft_ymd;
    }

    @ElVoField(physicalName = "invnt_draft_ymd")
    public void setInvnt_draft_ymd(String invnt_draft_ymd){
        this.invnt_draft_ymd = invnt_draft_ymd;
    }

    @ElVoField(physicalName = "invnt_apprvl_complt_ymd")
    public String getInvnt_apprvl_complt_ymd(){
        return invnt_apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "invnt_apprvl_complt_ymd")
    public void setInvnt_apprvl_complt_ymd(String invnt_apprvl_complt_ymd){
        this.invnt_apprvl_complt_ymd = invnt_apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "invnt_reject_ymd")
    public String getInvnt_reject_ymd(){
        return invnt_reject_ymd;
    }

    @ElVoField(physicalName = "invnt_reject_ymd")
    public void setInvnt_reject_ymd(String invnt_reject_ymd){
        this.invnt_reject_ymd = invnt_reject_ymd;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public String getInvnt_reject_resn(){
        return invnt_reject_resn;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public void setInvnt_reject_resn(String invnt_reject_resn){
        this.invnt_reject_resn = invnt_reject_resn;
    }

    @ElVoField(physicalName = "invnt_wrte_syspayno")
    public String getInvnt_wrte_syspayno(){
        return invnt_wrte_syspayno;
    }

    @ElVoField(physicalName = "invnt_wrte_syspayno")
    public void setInvnt_wrte_syspayno(String invnt_wrte_syspayno){
        this.invnt_wrte_syspayno = invnt_wrte_syspayno;
    }

    @ElVoField(physicalName = "prityrgt_wdrw_ymd")
    public String getPrityrgt_wdrw_ymd(){
        return prityrgt_wdrw_ymd;
    }

    @ElVoField(physicalName = "prityrgt_wdrw_ymd")
    public void setPrityrgt_wdrw_ymd(String prityrgt_wdrw_ymd){
        this.prityrgt_wdrw_ymd = prityrgt_wdrw_ymd;
    }

    @ElVoField(physicalName = "old_data_mngmt_no")
    public String getOld_data_mngmt_no(){
        return old_data_mngmt_no;
    }

    @ElVoField(physicalName = "old_data_mngmt_no")
    public void setOld_data_mngmt_no(String old_data_mngmt_no){
        this.old_data_mngmt_no = old_data_mngmt_no;
    }

    @ElVoField(physicalName = "attach_file_no_1")
    public String getAttach_file_no_1(){
        return attach_file_no_1;
    }

    @ElVoField(physicalName = "attach_file_no_1")
    public void setAttach_file_no_1(String attach_file_no_1){
        this.attach_file_no_1 = attach_file_no_1;
    }

    @ElVoField(physicalName = "pct_attach_file_no")
    public String getPct_attach_file_no(){
        return pct_attach_file_no;
    }

    @ElVoField(physicalName = "pct_attach_file_no")
    public void setPct_attach_file_no(String pct_attach_file_no){
        this.pct_attach_file_no = pct_attach_file_no;
    }

    @ElVoField(physicalName = "out_deed_attach_file_no")
    public String getOut_deed_attach_file_no(){
        return out_deed_attach_file_no;
    }

    @ElVoField(physicalName = "out_deed_attach_file_no")
    public void setOut_deed_attach_file_no(String out_deed_attach_file_no){
        this.out_deed_attach_file_no = out_deed_attach_file_no;
    }

    @ElVoField(physicalName = "com_apply_attach_file_no")
    public String getCom_apply_attach_file_no(){
        return com_apply_attach_file_no;
    }

    @ElVoField(physicalName = "com_apply_attach_file_no")
    public void setCom_apply_attach_file_no(String com_apply_attach_file_no){
        this.com_apply_attach_file_no = com_apply_attach_file_no;
    }

    @ElVoField(physicalName = "one_invnt_attach_file_no")
    public String getOne_invnt_attach_file_no(){
        return one_invnt_attach_file_no;
    }

    @ElVoField(physicalName = "one_invnt_attach_file_no")
    public void setOne_invnt_attach_file_no(String one_invnt_attach_file_no){
        this.one_invnt_attach_file_no = one_invnt_attach_file_no;
    }

    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }

    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public String getRelat_dom_smitapp_no(){
        return relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public void setRelat_dom_smitapp_no(String relat_dom_smitapp_no){
        this.relat_dom_smitapp_no = relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "pre_tech_wrt_invst")
    public String getPre_tech_wrt_invst(){
        return pre_tech_wrt_invst;
    }

    @ElVoField(physicalName = "pre_tech_wrt_invst")
    public void setPre_tech_wrt_invst(String pre_tech_wrt_invst){
        this.pre_tech_wrt_invst = pre_tech_wrt_invst;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public String getAttach_file_no_2(){
        return attach_file_no_2;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public void setAttach_file_no_2(String attach_file_no_2){
        this.attach_file_no_2 = attach_file_no_2;
    }

    @ElVoField(physicalName = "attach_file_no_3")
    public String getAttach_file_no_3(){
        return attach_file_no_3;
    }

    @ElVoField(physicalName = "attach_file_no_3")
    public void setAttach_file_no_3(String attach_file_no_3){
        this.attach_file_no_3 = attach_file_no_3;
    }

    @ElVoField(physicalName = "attach_file_no_4")
    public String getAttach_file_no_4(){
        return attach_file_no_4;
    }

    @ElVoField(physicalName = "attach_file_no_4")
    public void setAttach_file_no_4(String attach_file_no_4){
        this.attach_file_no_4 = attach_file_no_4;
    }

    @ElVoField(physicalName = "plan_attach_file_no")
    public String getPlan_attach_file_no(){
        return plan_attach_file_no;
    }

    @ElVoField(physicalName = "plan_attach_file_no")
    public void setPlan_attach_file_no(String plan_attach_file_no){
        this.plan_attach_file_no = plan_attach_file_no;
    }

    @ElVoField(physicalName = "open_attach_file_no")
    public String getOpen_attach_file_no(){
        return open_attach_file_no;
    }

    @ElVoField(physicalName = "open_attach_file_no")
    public void setOpen_attach_file_no(String open_attach_file_no){
        this.open_attach_file_no = open_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public String getEtc_attach_file_no(){
        return etc_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public void setEtc_attach_file_no(String etc_attach_file_no){
        this.etc_attach_file_no = etc_attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no_5")
    public String getAttach_file_no_5(){
        return attach_file_no_5;
    }

    @ElVoField(physicalName = "attach_file_no_5")
    public void setAttach_file_no_5(String attach_file_no_5){
        this.attach_file_no_5 = attach_file_no_5;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "indst_tech_clsf")
    public String getIndst_tech_clsf(){
        return indst_tech_clsf;
    }

    @ElVoField(physicalName = "indst_tech_clsf")
    public void setIndst_tech_clsf(String indst_tech_clsf){
        this.indst_tech_clsf = indst_tech_clsf;
    }

    @ElVoField(physicalName = "indst_tech_sml_clsf")
    public String getIndst_tech_sml_clsf(){
        return indst_tech_sml_clsf;
    }

    @ElVoField(physicalName = "indst_tech_sml_clsf")
    public void setIndst_tech_sml_clsf(String indst_tech_sml_clsf){
        this.indst_tech_sml_clsf = indst_tech_sml_clsf;
    }

    @ElVoField(physicalName = "trns_yn")
    public String getTrns_yn(){
        return trns_yn;
    }

    @ElVoField(physicalName = "trns_yn")
    public void setTrns_yn(String trns_yn){
        this.trns_yn = trns_yn;
    }

    @ElVoField(physicalName = "tech_fee")
    public String getTech_fee(){
        return tech_fee;
    }

    @ElVoField(physicalName = "tech_fee")
    public void setTech_fee(String tech_fee){
        this.tech_fee = tech_fee;
    }

    @ElVoField(physicalName = "trns_ymd")
    public String getTrns_ymd(){
        return trns_ymd;
    }

    @ElVoField(physicalName = "trns_ymd")
    public void setTrns_ymd(String trns_ymd){
        this.trns_ymd = trns_ymd;
    }

    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }

    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }

    @ElVoField(physicalName = "trl_step_cd")
    public String getTrl_step_cd(){
        return trl_step_cd;
    }

    @ElVoField(physicalName = "trl_step_cd")
    public void setTrl_step_cd(String trl_step_cd){
        this.trl_step_cd = trl_step_cd;
    }

    @ElVoField(physicalName = "indst_tech_minor_clsf")
    public String getIndst_tech_minor_clsf(){
        return indst_tech_minor_clsf;
    }

    @ElVoField(physicalName = "indst_tech_minor_clsf")
    public void setIndst_tech_minor_clsf(String indst_tech_minor_clsf){
        this.indst_tech_minor_clsf = indst_tech_minor_clsf;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public String getDemand_vend_nm(){
        return demand_vend_nm;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public void setDemand_vend_nm(String demand_vend_nm){
        this.demand_vend_nm = demand_vend_nm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
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

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public String getVend_bsn_no(){
        return vend_bsn_no;
    }

    @ElVoField(physicalName = "vend_bsn_no")
    public void setVend_bsn_no(String vend_bsn_no){
        this.vend_bsn_no = vend_bsn_no;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "stake_rt")
    public String getStake_rt(){
        return stake_rt;
    }

    @ElVoField(physicalName = "stake_rt")
    public void setStake_rt(String stake_rt){
        this.stake_rt = stake_rt;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
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

    @ElVoField(physicalName = "tm_mean")
    public String getTm_mean(){
        return tm_mean;
    }

    @ElVoField(physicalName = "tm_mean")
    public void setTm_mean(String tm_mean){
        this.tm_mean = tm_mean;
    }

    @ElVoField(physicalName = "tm_desc")
    public String getTm_desc(){
        return tm_desc;
    }

    @ElVoField(physicalName = "tm_desc")
    public void setTm_desc(String tm_desc){
        this.tm_desc = tm_desc;
    }

    @ElVoField(physicalName = "appont_goods")
    public String getAppont_goods(){
        return appont_goods;
    }

    @ElVoField(physicalName = "appont_goods")
    public void setAppont_goods(String appont_goods){
        this.appont_goods = appont_goods;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "smitapp_urgntgee")
    public String getSmitapp_urgntgee(){
        return smitapp_urgntgee;
    }

    @ElVoField(physicalName = "smitapp_urgntgee")
    public void setSmitapp_urgntgee(String smitapp_urgntgee){
        this.smitapp_urgntgee = smitapp_urgntgee;
    }

    @ElVoField(physicalName = "smitapp_urgntgee_resn")
    public String getSmitapp_urgntgee_resn(){
        return smitapp_urgntgee_resn;
    }

    @ElVoField(physicalName = "smitapp_urgntgee_resn")
    public void setSmitapp_urgntgee_resn(String smitapp_urgntgee_resn){
        this.smitapp_urgntgee_resn = smitapp_urgntgee_resn;
    }

    @ElVoField(physicalName = "pre_desn_ex")
    public String getPre_desn_ex(){
        return pre_desn_ex;
    }

    @ElVoField(physicalName = "pre_desn_ex")
    public void setPre_desn_ex(String pre_desn_ex){
        this.pre_desn_ex = pre_desn_ex;
    }

    @ElVoField(physicalName = "pre_desn_nm")
    public String getPre_desn_nm(){
        return pre_desn_nm;
    }

    @ElVoField(physicalName = "pre_desn_nm")
    public void setPre_desn_nm(String pre_desn_nm){
        this.pre_desn_nm = pre_desn_nm;
    }

    @ElVoField(physicalName = "desn_detls_desc")
    public String getDesn_detls_desc(){
        return desn_detls_desc;
    }

    @ElVoField(physicalName = "desn_detls_desc")
    public void setDesn_detls_desc(String desn_detls_desc){
        this.desn_detls_desc = desn_detls_desc;
    }

    @ElVoField(physicalName = "attach_file_no_6")
    public String getAttach_file_no_6(){
        return attach_file_no_6;
    }

    @ElVoField(physicalName = "attach_file_no_6")
    public void setAttach_file_no_6(String attach_file_no_6){
        this.attach_file_no_6 = attach_file_no_6;
    }

    @ElVoField(physicalName = "attach_file_no_7")
    public String getAttach_file_no_7(){
        return attach_file_no_7;
    }

    @ElVoField(physicalName = "attach_file_no_7")
    public void setAttach_file_no_7(String attach_file_no_7){
        this.attach_file_no_7 = attach_file_no_7;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "tm_req_no")
    public String getTm_req_no(){
        return tm_req_no;
    }

    @ElVoField(physicalName = "tm_req_no")
    public void setTm_req_no(String tm_req_no){
        this.tm_req_no = tm_req_no;
    }

    @ElVoField(physicalName = "attach_file_no_tab3")
    public String getAttach_file_no_tab3(){
        return attach_file_no_tab3;
    }

    @ElVoField(physicalName = "attach_file_no_tab3")
    public void setAttach_file_no_tab3(String attach_file_no_tab3){
        this.attach_file_no_tab3 = attach_file_no_tab3;
    }

    @ElVoField(physicalName = "desn_req_no")
    public String getDesn_req_no(){
        return desn_req_no;
    }

    @ElVoField(physicalName = "desn_req_no")
    public void setDesn_req_no(String desn_req_no){
        this.desn_req_no = desn_req_no;
    }

    @ElVoField(physicalName = "attach_file_no_tab2")
    public String getAttach_file_no_tab2(){
        return attach_file_no_tab2;
    }

    @ElVoField(physicalName = "attach_file_no_tab2")
    public void setAttach_file_no_tab2(String attach_file_no_tab2){
        this.attach_file_no_tab2 = attach_file_no_tab2;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public String getResid_no_dis(){
        return resid_no_dis;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public void setResid_no_dis(String resid_no_dis){
        this.resid_no_dis = resid_no_dis;
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

    @ElVoField(physicalName = "attach_clsf")
    public String getAttach_clsf(){
        return attach_clsf;
    }

    @ElVoField(physicalName = "attach_clsf")
    public void setAttach_clsf(String attach_clsf){
        this.attach_clsf = attach_clsf;
    }

    @ElVoField(physicalName = "desc")
    public String getDesc(){
        return desc;
    }

    @ElVoField(physicalName = "desc")
    public void setDesc(String desc){
        this.desc = desc;
    }

    @ElVoField(physicalName = "role_type")
    public String getRole_type(){
        return role_type;
    }

    @ElVoField(physicalName = "role_type")
    public void setRole_type(String role_type){
        this.role_type = role_type;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "fileList_A")
    public String getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(String fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "fileList_B")
    public String getFileList_B(){
        return fileList_B;
    }

    @ElVoField(physicalName = "fileList_B")
    public void setFileList_B(String fileList_B){
        this.fileList_B = fileList_B;
    }

    @ElVoField(physicalName = "fileList_C")
    public String getFileList_C(){
        return fileList_C;
    }

    @ElVoField(physicalName = "fileList_C")
    public void setFileList_C(String fileList_C){
        this.fileList_C = fileList_C;
    }

    @ElVoField(physicalName = "fileList_D")
    public String getFileList_D(){
        return fileList_D;
    }

    @ElVoField(physicalName = "fileList_D")
    public void setFileList_D(String fileList_D){
        this.fileList_D = fileList_D;
    }

    @ElVoField(physicalName = "fileList_E")
    public String getFileList_E(){
        return fileList_E;
    }

    @ElVoField(physicalName = "fileList_E")
    public void setFileList_E(String fileList_E){
        this.fileList_E = fileList_E;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        return endpoint;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
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

    @ElVoField(physicalName = "ext3_cd")
    public String getExt3_cd(){
        return ext3_cd;
    }

    @ElVoField(physicalName = "ext3_cd")
    public void setExt3_cd(String ext3_cd){
        this.ext3_cd = ext3_cd;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "rve_clsf")
    public String getRve_clsf(){
        return rve_clsf;
    }

    @ElVoField(physicalName = "rve_clsf")
    public void setRve_clsf(String rve_clsf){
        this.rve_clsf = rve_clsf;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "attachVo2")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo2(){
        return attachVo2;
    }

    @ElVoField(physicalName = "attachVo2")
    public void setAttachVo2(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo2){
        this.attachVo2 = attachVo2;
    }

    @ElVoField(physicalName = "attachVo3")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo3(){
        return attachVo3;
    }

    @ElVoField(physicalName = "attachVo3")
    public void setAttachVo3(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo3){
        this.attachVo3 = attachVo3;
    }

    @ElVoField(physicalName = "attachVo4")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo4(){
        return attachVo4;
    }

    @ElVoField(physicalName = "attachVo4")
    public void setAttachVo4(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo4){
        this.attachVo4 = attachVo4;
    }

    @ElVoField(physicalName = "attachVo5")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo5(){
        return attachVo5;
    }

    @ElVoField(physicalName = "attachVo5")
    public void setAttachVo5(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo5){
        this.attachVo5 = attachVo5;
    }

    @ElVoField(physicalName = "vendList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getVendList(){
        return vendList;
    }

    @ElVoField(physicalName = "vendList")
    public void setVendList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> vendList){
        this.vendList = vendList;
    }

    @ElVoField(physicalName = "invntpsnList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getInvntpsnList(){
        return invntpsnList;
    }

    @ElVoField(physicalName = "invntpsnList")
    public void setInvntpsnList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> invntpsnList){
        this.invntpsnList = invntpsnList;
    }

    @ElVoField(physicalName = "attachtab2List")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getAttachtab2List(){
        return attachtab2List;
    }

    @ElVoField(physicalName = "attachtab2List")
    public void setAttachtab2List(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> attachtab2List){
        this.attachtab2List = attachtab2List;
    }

    @ElVoField(physicalName = "tabData")
    public kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo getTabData(){
        return tabData;
    }

    @ElVoField(physicalName = "tabData")
    public void setTabData(kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo tabData){
        this.tabData = tabData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatFreeInventionVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("regst_daytm_st").append("=").append(regst_daytm_st).append(",");
        sb.append("regst_daytm_ed").append("=").append(regst_daytm_ed).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("invnt_clsf").append("=").append(invnt_clsf).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("rsml_mngmt_no").append("=").append(rsml_mngmt_no).append(",");
        sb.append("rsup_mngmt_no").append("=").append(rsup_mngmt_no).append(",");
        sb.append("rsml_rst_cd").append("=").append(rsml_rst_cd).append(",");
        sb.append("rsup_rst_cd").append("=").append(rsup_rst_cd).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("invnt_eng_nm").append("=").append(invnt_eng_nm).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("tech_field").append("=").append(tech_field).append(",");
        sb.append("relat_invnt").append("=").append(relat_invnt).append(",");
        sb.append("indst_use_clsf").append("=").append(indst_use_clsf).append(",");
        sb.append("solve_task").append("=").append(solve_task).append(",");
        sb.append("invnt_efct").append("=").append(invnt_efct).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("temp_oversapp_hope_ex").append("=").append(temp_oversapp_hope_ex).append(",");
        sb.append("pct_chk").append("=").append(pct_chk).append(",");
        sb.append("smitapp_hope_natn_cd").append("=").append(smitapp_hope_natn_cd).append(",");
        sb.append("smitapp_hope_natn_nm").append("=").append(smitapp_hope_natn_nm).append(",");
        sb.append("open_ex").append("=").append(open_ex).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("open_contnt").append("=").append(open_contnt).append(",");
        sb.append("pat_grd").append("=").append(pat_grd).append(",");
        sb.append("grd_resn").append("=").append(grd_resn).append(",");
        sb.append("bef_open_yn").append("=").append(bef_open_yn).append(",");
        sb.append("ely_open_ex").append("=").append(ely_open_ex).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex).append(",");
        sb.append("prity_eval_ex").append("=").append(prity_eval_ex).append(",");
        sb.append("smitapp_occr_clsf").append("=").append(smitapp_occr_clsf).append(",");
        sb.append("smitapp_way").append("=").append(smitapp_way).append(",");
        sb.append("hope_patofic_cd").append("=").append(hope_patofic_cd).append(",");
        sb.append("hope_patofic_contac_loc").append("=").append(hope_patofic_contac_loc).append(",");
        sb.append("hope_patofic_nm").append("=").append(hope_patofic_nm).append(",");
        sb.append("hope_patofic_charg_id").append("=").append(hope_patofic_charg_id).append(",");
        sb.append("hope_patofic_charg_nm").append("=").append(hope_patofic_charg_nm).append(",");
        sb.append("tech_eval_hope_ex").append("=").append(tech_eval_hope_ex).append(",");
        sb.append("tech_befr_hope_ex").append("=").append(tech_befr_hope_ex).append(",");
        sb.append("tech_trans_hope_amt").append("=").append(tech_trans_hope_amt).append(",");
        sb.append("tech_trans_hope_typ").append("=").append(tech_trans_hope_typ).append(",");
        sb.append("temp_storg_ymd").append("=").append(temp_storg_ymd).append(",");
        sb.append("affir_req_ymd").append("=").append(affir_req_ymd).append(",");
        sb.append("invnt_psn_rmk").append("=").append(invnt_psn_rmk).append(",");
        sb.append("invnt_draft_ymd").append("=").append(invnt_draft_ymd).append(",");
        sb.append("invnt_apprvl_complt_ymd").append("=").append(invnt_apprvl_complt_ymd).append(",");
        sb.append("invnt_reject_ymd").append("=").append(invnt_reject_ymd).append(",");
        sb.append("invnt_reject_resn").append("=").append(invnt_reject_resn).append(",");
        sb.append("invnt_wrte_syspayno").append("=").append(invnt_wrte_syspayno).append(",");
        sb.append("prityrgt_wdrw_ymd").append("=").append(prityrgt_wdrw_ymd).append(",");
        sb.append("old_data_mngmt_no").append("=").append(old_data_mngmt_no).append(",");
        sb.append("attach_file_no_1").append("=").append(attach_file_no_1).append(",");
        sb.append("pct_attach_file_no").append("=").append(pct_attach_file_no).append(",");
        sb.append("out_deed_attach_file_no").append("=").append(out_deed_attach_file_no).append(",");
        sb.append("com_apply_attach_file_no").append("=").append(com_apply_attach_file_no).append(",");
        sb.append("one_invnt_attach_file_no").append("=").append(one_invnt_attach_file_no).append(",");
        sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("pre_tech_wrt_invst").append("=").append(pre_tech_wrt_invst).append(",");
        sb.append("attach_file_no_2").append("=").append(attach_file_no_2).append(",");
        sb.append("attach_file_no_3").append("=").append(attach_file_no_3).append(",");
        sb.append("attach_file_no_4").append("=").append(attach_file_no_4).append(",");
        sb.append("plan_attach_file_no").append("=").append(plan_attach_file_no).append(",");
        sb.append("open_attach_file_no").append("=").append(open_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("attach_file_no_5").append("=").append(attach_file_no_5).append(",");
        sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
        sb.append("indst_tech_clsf").append("=").append(indst_tech_clsf).append(",");
        sb.append("indst_tech_sml_clsf").append("=").append(indst_tech_sml_clsf).append(",");
        sb.append("trns_yn").append("=").append(trns_yn).append(",");
        sb.append("tech_fee").append("=").append(tech_fee).append(",");
        sb.append("trns_ymd").append("=").append(trns_ymd).append(",");
        sb.append("interview_yn").append("=").append(interview_yn).append(",");
        sb.append("trl_step_cd").append("=").append(trl_step_cd).append(",");
        sb.append("indst_tech_minor_clsf").append("=").append(indst_tech_minor_clsf).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("demand_vend_nm").append("=").append(demand_vend_nm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("vend_type").append("=").append(vend_type).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_bsn_no").append("=").append(vend_bsn_no).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("stake_rt").append("=").append(stake_rt).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("blong_clsf").append("=").append(blong_clsf).append(",");
        sb.append("blong_cd").append("=").append(blong_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("blong_nm").append("=").append(blong_nm).append(",");
        sb.append("nm_krn").append("=").append(nm_krn).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("invnt_psn_clsf").append("=").append(invnt_psn_clsf).append(",");
        sb.append("tm_mean").append("=").append(tm_mean).append(",");
        sb.append("tm_desc").append("=").append(tm_desc).append(",");
        sb.append("appont_goods").append("=").append(appont_goods).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("smitapp_urgntgee").append("=").append(smitapp_urgntgee).append(",");
        sb.append("smitapp_urgntgee_resn").append("=").append(smitapp_urgntgee_resn).append(",");
        sb.append("pre_desn_ex").append("=").append(pre_desn_ex).append(",");
        sb.append("pre_desn_nm").append("=").append(pre_desn_nm).append(",");
        sb.append("desn_detls_desc").append("=").append(desn_detls_desc).append(",");
        sb.append("attach_file_no_6").append("=").append(attach_file_no_6).append(",");
        sb.append("attach_file_no_7").append("=").append(attach_file_no_7).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("tm_req_no").append("=").append(tm_req_no).append(",");
        sb.append("attach_file_no_tab3").append("=").append(attach_file_no_tab3).append(",");
        sb.append("desn_req_no").append("=").append(desn_req_no).append(",");
        sb.append("attach_file_no_tab2").append("=").append(attach_file_no_tab2).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("resid_no_dis").append("=").append(resid_no_dis).append(",");
        sb.append("trans_ex").append("=").append(trans_ex).append(",");
        sb.append("co_invnt_affir_ex").append("=").append(co_invnt_affir_ex).append(",");
        sb.append("co_invnt_affir_ymd").append("=").append(co_invnt_affir_ymd).append(",");
        sb.append("co_invnt_affir_rmk").append("=").append(co_invnt_affir_rmk).append(",");
        sb.append("co_invnt_retn_ymd").append("=").append(co_invnt_retn_ymd).append(",");
        sb.append("co_invnt_retn_rmk").append("=").append(co_invnt_retn_rmk).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("attach_clsf").append("=").append(attach_clsf).append(",");
        sb.append("desc").append("=").append(desc).append(",");
        sb.append("role_type").append("=").append(role_type).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("fileList_B").append("=").append(fileList_B).append(",");
        sb.append("fileList_C").append("=").append(fileList_C).append(",");
        sb.append("fileList_D").append("=").append(fileList_D).append(",");
        sb.append("fileList_E").append("=").append(fileList_E).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("ext3_cd").append("=").append(ext3_cd).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("rve_clsf").append("=").append(rve_clsf).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("attachVo2").append("=").append(attachVo2).append(",");
        sb.append("attachVo3").append("=").append(attachVo3).append(",");
        sb.append("attachVo4").append("=").append(attachVo4).append(",");
        sb.append("attachVo5").append("=").append(attachVo5).append(",");
        sb.append("vendList").append("=").append(vendList).append(",");
        sb.append("invntpsnList").append("=").append(invntpsnList).append(",");
        sb.append("attachtab2List").append("=").append(attachtab2List).append(",");
        sb.append("tabData").append("=").append(tabData);
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
        for( int i=0 ; attachVo2 != null && i < attachVo2.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo2.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo3 != null && i < attachVo3.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo3.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo4 != null && i < attachVo4.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo4.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo5 != null && i < attachVo5.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo5.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)vendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; invntpsnList != null && i < invntpsnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)invntpsnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachtab2List != null && i < attachtab2List.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)attachtab2List.get(i);
            vo._xStreamEnc();	 
        }
        if( this.tabData != null ) this.tabData._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo2 != null && i < attachVo2.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo2.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo3 != null && i < attachVo3.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo3.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo4 != null && i < attachVo4.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo4.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo5 != null && i < attachVo5.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo5.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)vendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; invntpsnList != null && i < invntpsnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)invntpsnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachtab2List != null && i < attachtab2List.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)attachtab2List.get(i);
            vo._xStreamDec();	 
        }
        if( this.tabData != null ) this.tabData._xStreamDec();
    }


}
