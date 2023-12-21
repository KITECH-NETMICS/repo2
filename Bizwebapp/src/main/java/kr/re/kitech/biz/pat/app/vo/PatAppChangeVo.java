package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatAppChangeExp")
public class PatAppChangeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatAppChangeVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "inputYmdSt", physicalName = "input_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd_st;

    @ElDtoField(logicalName = "inputYmdEd", physicalName = "input_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd_ed;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "skateClsf", physicalName = "skate_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String skate_clsf;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "elecappDocuNo", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "inputYmd", physicalName = "input_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_ymd;

    @ElDtoField(logicalName = "hisSeq", physicalName = "his_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int his_seq;

    @ElDtoField(logicalName = "acdtUnusualItem", physicalName = "acdt_unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acdt_unusual_item;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "hisSeqMax", physicalName = "his_seq_max", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_seq_max;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "reschRespnSyspayno", physicalName = "resch_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspayno;

    @ElDtoField(logicalName = "prjTerm", physicalName = "prj_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_term;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "reschRespnSyspaynm", physicalName = "resch_respn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspaynm;

    @ElDtoField(logicalName = "workClsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "vendType", physicalName = "vend_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type;

    @ElDtoField(logicalName = "stakeRt", physicalName = "stake_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_rt;

    @ElDtoField(logicalName = "blongClsf", physicalName = "blong_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf;

    @ElDtoField(logicalName = "blongCd", physicalName = "blong_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_cd;

    @ElDtoField(logicalName = "blongNm", physicalName = "blong_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_nm;

    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "invntPsnClsf", physicalName = "invnt_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "vendCd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "vendBsnNo", physicalName = "vend_bsn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_bsn_no;

    @ElDtoField(logicalName = "nmKrn", physicalName = "nm_krn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_krn;

    @ElDtoField(logicalName = "nmEng", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "residRegstNo", physicalName = "resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_regst_no;

    @ElDtoField(logicalName = "contacLoc", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "chngState", physicalName = "chng_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_state;

    @ElDtoField(logicalName = "stakeDept", physicalName = "stake_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_dept;

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

    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "patGrd", physicalName = "pat_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "invntEngNm", physicalName = "invnt_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_eng_nm;

    @ElDtoField(logicalName = "detlsKrnNm", physicalName = "detls_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_krn_nm;

    @ElDtoField(logicalName = "detlsEngNm", physicalName = "detls_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_eng_nm;

    @ElDtoField(logicalName = "smitappKrnNm", physicalName = "smitapp_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_krn_nm;

    @ElDtoField(logicalName = "smitappEngNm", physicalName = "smitapp_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_eng_nm;

    @ElDtoField(logicalName = "regstKrnNm", physicalName = "regst_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_krn_nm;

    @ElDtoField(logicalName = "regstEngNm", physicalName = "regst_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_eng_nm;

    @ElDtoField(logicalName = "transNm", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappRegYmd", physicalName = "smitapp_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_reg_ymd;

    @ElDtoField(logicalName = "regstNo", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "regstRegYmd", physicalName = "regst_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_reg_ymd;

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patoficChargId", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "patoficChargNm", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "patoficContacLoc", physicalName = "patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_contac_loc;

    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;

    @ElDtoField(logicalName = "rightMntFinalSeq", physicalName = "right_mnt_final_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_mnt_final_seq;

    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "oversappHopeEx", physicalName = "oversapp_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oversapp_hope_ex;

    @ElDtoField(logicalName = "pctChk", physicalName = "pct_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_chk;

    @ElDtoField(logicalName = "smitappNatnCd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;

    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;

    @ElDtoField(logicalName = "openNo", physicalName = "open_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_no;

    @ElDtoField(logicalName = "intrnSmitappNo", physicalName = "intrn_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_no;

    @ElDtoField(logicalName = "intrnSmitappYmd", physicalName = "intrn_smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_ymd;

    @ElDtoField(logicalName = "prityrgtMainRspnsNo", physicalName = "prityrgt_main_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_no;

    @ElDtoField(logicalName = "prityrgtMainRspnsYmd", physicalName = "prityrgt_main_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_ymd;

    @ElDtoField(logicalName = "openEx", physicalName = "open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ex;

    @ElDtoField(logicalName = "openYmd", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "openContnt", physicalName = "open_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_contnt;

    @ElDtoField(logicalName = "invntClsf", physicalName = "invnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf;

    @ElDtoField(logicalName = "elyOpenEx", physicalName = "ely_open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ely_open_ex;

    @ElDtoField(logicalName = "evalDemndEx", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElDtoField(logicalName = "prityEvalEx", physicalName = "prity_eval_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_ex;

    @ElDtoField(logicalName = "smitappOccrClsf", physicalName = "smitapp_occr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf;

    @ElDtoField(logicalName = "coSmitappEx", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "smitappWay", physicalName = "smitapp_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way;

    @ElDtoField(logicalName = "techEvalHopeEx", physicalName = "tech_eval_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_hope_ex;

    @ElDtoField(logicalName = "techTransHopeEx", physicalName = "tech_trans_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_ex;

    @ElDtoField(logicalName = "techTransHopeAmt", physicalName = "tech_trans_hope_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_amt;

    @ElDtoField(logicalName = "techTransHopeTyp", physicalName = "tech_trans_hope_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_typ;

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

    @ElDtoField(logicalName = "ipc01", physicalName = "ipc_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01;

    @ElDtoField(logicalName = "ipc02", physicalName = "ipc_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02;

    @ElDtoField(logicalName = "ipc03", physicalName = "ipc_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03;

    @ElDtoField(logicalName = "examReflectClsf", physicalName = "exam_reflect_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_reflect_clsf;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "postNo", physicalName = "post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String post_no;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "blongClsfNm", physicalName = "blong_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf_nm;

    @ElDtoField(logicalName = "residNoDis", physicalName = "resid_no_dis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no_dis;

    @ElDtoField(logicalName = "detlsAddr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "vendTypeNm", physicalName = "vend_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_type_nm;

    @ElDtoField(logicalName = "bsnsCdInout", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "stateNm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;

    @ElDtoField(logicalName = "patoficMngNo", physicalName = "patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_mng_no;

    @ElDtoField(logicalName = "techClsfNm", physicalName = "tech_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf_nm;

    @ElDtoField(logicalName = "smitappOccrClsfNm", physicalName = "smitapp_occr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf_nm;

    @ElDtoField(logicalName = "befOpenYn", physicalName = "bef_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bef_open_yn;

    @ElDtoField(logicalName = "openAttachFileNo", physicalName = "open_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_attach_file_no;

    @ElDtoField(logicalName = "bpmYn", physicalName = "bpm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bpm_yn;

    @ElDtoField(logicalName = "giveupReqNo", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "maxSeq", physicalName = "max_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_seq;

    @ElDtoField(logicalName = "endpoint", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "ext3_cd", physicalName = "ext3_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext3_cd;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "researcher_id", physicalName = "researcher_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researcher_id;

    @ElDtoField(logicalName = "main_researcher_id", physicalName = "main_researcher_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_researcher_id;

    @ElDtoField(logicalName = "apply_yn_cd", physicalName = "apply_yn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apply_yn_cd;

    @ElDtoField(logicalName = "scrn_clsf", physicalName = "scrn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scrn_clsf;

    @ElDtoField(logicalName = "save_clsf", physicalName = "save_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_clsf;

    @ElDtoField(logicalName = "chng_cause", physicalName = "chng_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_cause;

    @ElDtoField(logicalName = "app_req_no", physicalName = "app_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_req_no;

    @ElDtoField(logicalName = "bf_seq", physicalName = "bf_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_seq;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "fileList_A", physicalName = "fileList_A", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_A;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "ListVo", physicalName = "after", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> after;

    @ElDtoField(logicalName = "ListVo", physicalName = "before", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> before;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "input_ymd_st")
    public String getInput_ymd_st(){
        return input_ymd_st;
    }

    @ElVoField(physicalName = "input_ymd_st")
    public void setInput_ymd_st(String input_ymd_st){
        this.input_ymd_st = input_ymd_st;
    }

    @ElVoField(physicalName = "input_ymd_ed")
    public String getInput_ymd_ed(){
        return input_ymd_ed;
    }

    @ElVoField(physicalName = "input_ymd_ed")
    public void setInput_ymd_ed(String input_ymd_ed){
        this.input_ymd_ed = input_ymd_ed;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "skate_clsf")
    public String getSkate_clsf(){
        return skate_clsf;
    }

    @ElVoField(physicalName = "skate_clsf")
    public void setSkate_clsf(String skate_clsf){
        this.skate_clsf = skate_clsf;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "input_ymd")
    public String getInput_ymd(){
        return input_ymd;
    }

    @ElVoField(physicalName = "input_ymd")
    public void setInput_ymd(String input_ymd){
        this.input_ymd = input_ymd;
    }

    @ElVoField(physicalName = "his_seq")
    public int getHis_seq(){
        return his_seq;
    }

    @ElVoField(physicalName = "his_seq")
    public void setHis_seq(int his_seq){
        this.his_seq = his_seq;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public String getAcdt_unusual_item(){
        return acdt_unusual_item;
    }

    @ElVoField(physicalName = "acdt_unusual_item")
    public void setAcdt_unusual_item(String acdt_unusual_item){
        this.acdt_unusual_item = acdt_unusual_item;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "his_seq_max")
    public String getHis_seq_max(){
        return his_seq_max;
    }

    @ElVoField(physicalName = "his_seq_max")
    public void setHis_seq_max(String his_seq_max){
        this.his_seq_max = his_seq_max;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "prj_term")
    public String getPrj_term(){
        return prj_term;
    }

    @ElVoField(physicalName = "prj_term")
    public void setPrj_term(String prj_term){
        this.prj_term = prj_term;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "resch_respn_syspaynm")
    public String getResch_respn_syspaynm(){
        return resch_respn_syspaynm;
    }

    @ElVoField(physicalName = "resch_respn_syspaynm")
    public void setResch_respn_syspaynm(String resch_respn_syspaynm){
        this.resch_respn_syspaynm = resch_respn_syspaynm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }

    @ElVoField(physicalName = "vend_type")
    public String getVend_type(){
        return vend_type;
    }

    @ElVoField(physicalName = "vend_type")
    public void setVend_type(String vend_type){
        this.vend_type = vend_type;
    }

    @ElVoField(physicalName = "stake_rt")
    public String getStake_rt(){
        return stake_rt;
    }

    @ElVoField(physicalName = "stake_rt")
    public void setStake_rt(String stake_rt){
        this.stake_rt = stake_rt;
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

    @ElVoField(physicalName = "blong_nm")
    public String getBlong_nm(){
        return blong_nm;
    }

    @ElVoField(physicalName = "blong_nm")
    public void setBlong_nm(String blong_nm){
        this.blong_nm = blong_nm;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public String getInvnt_psn_clsf(){
        return invnt_psn_clsf;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public void setInvnt_psn_clsf(String invnt_psn_clsf){
        this.invnt_psn_clsf = invnt_psn_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "chng_state")
    public String getChng_state(){
        return chng_state;
    }

    @ElVoField(physicalName = "chng_state")
    public void setChng_state(String chng_state){
        this.chng_state = chng_state;
    }

    @ElVoField(physicalName = "stake_dept")
    public String getStake_dept(){
        return stake_dept;
    }

    @ElVoField(physicalName = "stake_dept")
    public void setStake_dept(String stake_dept){
        this.stake_dept = stake_dept;
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

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "pat_grd")
    public String getPat_grd(){
        return pat_grd;
    }

    @ElVoField(physicalName = "pat_grd")
    public void setPat_grd(String pat_grd){
        this.pat_grd = pat_grd;
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

    @ElVoField(physicalName = "detls_krn_nm")
    public String getDetls_krn_nm(){
        return detls_krn_nm;
    }

    @ElVoField(physicalName = "detls_krn_nm")
    public void setDetls_krn_nm(String detls_krn_nm){
        this.detls_krn_nm = detls_krn_nm;
    }

    @ElVoField(physicalName = "detls_eng_nm")
    public String getDetls_eng_nm(){
        return detls_eng_nm;
    }

    @ElVoField(physicalName = "detls_eng_nm")
    public void setDetls_eng_nm(String detls_eng_nm){
        this.detls_eng_nm = detls_eng_nm;
    }

    @ElVoField(physicalName = "smitapp_krn_nm")
    public String getSmitapp_krn_nm(){
        return smitapp_krn_nm;
    }

    @ElVoField(physicalName = "smitapp_krn_nm")
    public void setSmitapp_krn_nm(String smitapp_krn_nm){
        this.smitapp_krn_nm = smitapp_krn_nm;
    }

    @ElVoField(physicalName = "smitapp_eng_nm")
    public String getSmitapp_eng_nm(){
        return smitapp_eng_nm;
    }

    @ElVoField(physicalName = "smitapp_eng_nm")
    public void setSmitapp_eng_nm(String smitapp_eng_nm){
        this.smitapp_eng_nm = smitapp_eng_nm;
    }

    @ElVoField(physicalName = "regst_krn_nm")
    public String getRegst_krn_nm(){
        return regst_krn_nm;
    }

    @ElVoField(physicalName = "regst_krn_nm")
    public void setRegst_krn_nm(String regst_krn_nm){
        this.regst_krn_nm = regst_krn_nm;
    }

    @ElVoField(physicalName = "regst_eng_nm")
    public String getRegst_eng_nm(){
        return regst_eng_nm;
    }

    @ElVoField(physicalName = "regst_eng_nm")
    public void setRegst_eng_nm(String regst_eng_nm){
        this.regst_eng_nm = regst_eng_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public String getTrans_nm(){
        return trans_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public void setTrans_nm(String trans_nm){
        this.trans_nm = trans_nm;
    }

    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public String getSmitapp_reg_ymd(){
        return smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public void setSmitapp_reg_ymd(String smitapp_reg_ymd){
        this.smitapp_reg_ymd = smitapp_reg_ymd;
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

    @ElVoField(physicalName = "regst_reg_ymd")
    public String getRegst_reg_ymd(){
        return regst_reg_ymd;
    }

    @ElVoField(physicalName = "regst_reg_ymd")
    public void setRegst_reg_ymd(String regst_reg_ymd){
        this.regst_reg_ymd = regst_reg_ymd;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public String getPatofic_charg_id(){
        return patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public void setPatofic_charg_id(String patofic_charg_id){
        this.patofic_charg_id = patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public String getPatofic_contac_loc(){
        return patofic_contac_loc;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public void setPatofic_contac_loc(String patofic_contac_loc){
        this.patofic_contac_loc = patofic_contac_loc;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }

    @ElVoField(physicalName = "right_mnt_final_seq")
    public String getRight_mnt_final_seq(){
        return right_mnt_final_seq;
    }

    @ElVoField(physicalName = "right_mnt_final_seq")
    public void setRight_mnt_final_seq(String right_mnt_final_seq){
        this.right_mnt_final_seq = right_mnt_final_seq;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "oversapp_hope_ex")
    public String getOversapp_hope_ex(){
        return oversapp_hope_ex;
    }

    @ElVoField(physicalName = "oversapp_hope_ex")
    public void setOversapp_hope_ex(String oversapp_hope_ex){
        this.oversapp_hope_ex = oversapp_hope_ex;
    }

    @ElVoField(physicalName = "pct_chk")
    public String getPct_chk(){
        return pct_chk;
    }

    @ElVoField(physicalName = "pct_chk")
    public void setPct_chk(String pct_chk){
        this.pct_chk = pct_chk;
    }

    @ElVoField(physicalName = "smitapp_natn_cd")
    public String getSmitapp_natn_cd(){
        return smitapp_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_natn_cd")
    public void setSmitapp_natn_cd(String smitapp_natn_cd){
        this.smitapp_natn_cd = smitapp_natn_cd;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }

    @ElVoField(physicalName = "open_no")
    public String getOpen_no(){
        return open_no;
    }

    @ElVoField(physicalName = "open_no")
    public void setOpen_no(String open_no){
        this.open_no = open_no;
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

    @ElVoField(physicalName = "invnt_clsf")
    public String getInvnt_clsf(){
        return invnt_clsf;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public void setInvnt_clsf(String invnt_clsf){
        this.invnt_clsf = invnt_clsf;
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

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "smitapp_way")
    public String getSmitapp_way(){
        return smitapp_way;
    }

    @ElVoField(physicalName = "smitapp_way")
    public void setSmitapp_way(String smitapp_way){
        this.smitapp_way = smitapp_way;
    }

    @ElVoField(physicalName = "tech_eval_hope_ex")
    public String getTech_eval_hope_ex(){
        return tech_eval_hope_ex;
    }

    @ElVoField(physicalName = "tech_eval_hope_ex")
    public void setTech_eval_hope_ex(String tech_eval_hope_ex){
        this.tech_eval_hope_ex = tech_eval_hope_ex;
    }

    @ElVoField(physicalName = "tech_trans_hope_ex")
    public String getTech_trans_hope_ex(){
        return tech_trans_hope_ex;
    }

    @ElVoField(physicalName = "tech_trans_hope_ex")
    public void setTech_trans_hope_ex(String tech_trans_hope_ex){
        this.tech_trans_hope_ex = tech_trans_hope_ex;
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

    @ElVoField(physicalName = "ipc_01")
    public String getIpc_01(){
        return ipc_01;
    }

    @ElVoField(physicalName = "ipc_01")
    public void setIpc_01(String ipc_01){
        this.ipc_01 = ipc_01;
    }

    @ElVoField(physicalName = "ipc_02")
    public String getIpc_02(){
        return ipc_02;
    }

    @ElVoField(physicalName = "ipc_02")
    public void setIpc_02(String ipc_02){
        this.ipc_02 = ipc_02;
    }

    @ElVoField(physicalName = "ipc_03")
    public String getIpc_03(){
        return ipc_03;
    }

    @ElVoField(physicalName = "ipc_03")
    public void setIpc_03(String ipc_03){
        this.ipc_03 = ipc_03;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public String getExam_reflect_clsf(){
        return exam_reflect_clsf;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public void setExam_reflect_clsf(String exam_reflect_clsf){
        this.exam_reflect_clsf = exam_reflect_clsf;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "post_no")
    public String getPost_no(){
        return post_no;
    }

    @ElVoField(physicalName = "post_no")
    public void setPost_no(String post_no){
        this.post_no = post_no;
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

    @ElVoField(physicalName = "blong_clsf_nm")
    public String getBlong_clsf_nm(){
        return blong_clsf_nm;
    }

    @ElVoField(physicalName = "blong_clsf_nm")
    public void setBlong_clsf_nm(String blong_clsf_nm){
        this.blong_clsf_nm = blong_clsf_nm;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public String getResid_no_dis(){
        return resid_no_dis;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public void setResid_no_dis(String resid_no_dis){
        this.resid_no_dis = resid_no_dis;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "vend_type_nm")
    public String getVend_type_nm(){
        return vend_type_nm;
    }

    @ElVoField(physicalName = "vend_type_nm")
    public void setVend_type_nm(String vend_type_nm){
        this.vend_type_nm = vend_type_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public String getPatofic_mng_no(){
        return patofic_mng_no;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public void setPatofic_mng_no(String patofic_mng_no){
        this.patofic_mng_no = patofic_mng_no;
    }

    @ElVoField(physicalName = "tech_clsf_nm")
    public String getTech_clsf_nm(){
        return tech_clsf_nm;
    }

    @ElVoField(physicalName = "tech_clsf_nm")
    public void setTech_clsf_nm(String tech_clsf_nm){
        this.tech_clsf_nm = tech_clsf_nm;
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

    @ElVoField(physicalName = "open_attach_file_no")
    public String getOpen_attach_file_no(){
        return open_attach_file_no;
    }

    @ElVoField(physicalName = "open_attach_file_no")
    public void setOpen_attach_file_no(String open_attach_file_no){
        this.open_attach_file_no = open_attach_file_no;
    }

    @ElVoField(physicalName = "bpm_yn")
    public String getBpm_yn(){
        return bpm_yn;
    }

    @ElVoField(physicalName = "bpm_yn")
    public void setBpm_yn(String bpm_yn){
        this.bpm_yn = bpm_yn;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "max_seq")
    public String getMax_seq(){
        return max_seq;
    }

    @ElVoField(physicalName = "max_seq")
    public void setMax_seq(String max_seq){
        this.max_seq = max_seq;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        return endpoint;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
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

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
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

    @ElVoField(physicalName = "researcher_id")
    public String getResearcher_id(){
        return researcher_id;
    }

    @ElVoField(physicalName = "researcher_id")
    public void setResearcher_id(String researcher_id){
        this.researcher_id = researcher_id;
    }

    @ElVoField(physicalName = "main_researcher_id")
    public String getMain_researcher_id(){
        return main_researcher_id;
    }

    @ElVoField(physicalName = "main_researcher_id")
    public void setMain_researcher_id(String main_researcher_id){
        this.main_researcher_id = main_researcher_id;
    }

    @ElVoField(physicalName = "apply_yn_cd")
    public String getApply_yn_cd(){
        return apply_yn_cd;
    }

    @ElVoField(physicalName = "apply_yn_cd")
    public void setApply_yn_cd(String apply_yn_cd){
        this.apply_yn_cd = apply_yn_cd;
    }

    @ElVoField(physicalName = "scrn_clsf")
    public String getScrn_clsf(){
        return scrn_clsf;
    }

    @ElVoField(physicalName = "scrn_clsf")
    public void setScrn_clsf(String scrn_clsf){
        this.scrn_clsf = scrn_clsf;
    }

    @ElVoField(physicalName = "save_clsf")
    public String getSave_clsf(){
        return save_clsf;
    }

    @ElVoField(physicalName = "save_clsf")
    public void setSave_clsf(String save_clsf){
        this.save_clsf = save_clsf;
    }

    @ElVoField(physicalName = "chng_cause")
    public String getChng_cause(){
        return chng_cause;
    }

    @ElVoField(physicalName = "chng_cause")
    public void setChng_cause(String chng_cause){
        this.chng_cause = chng_cause;
    }

    @ElVoField(physicalName = "app_req_no")
    public String getApp_req_no(){
        return app_req_no;
    }

    @ElVoField(physicalName = "app_req_no")
    public void setApp_req_no(String app_req_no){
        this.app_req_no = app_req_no;
    }

    @ElVoField(physicalName = "bf_seq")
    public String getBf_seq(){
        return bf_seq;
    }

    @ElVoField(physicalName = "bf_seq")
    public void setBf_seq(String bf_seq){
        this.bf_seq = bf_seq;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "fileList_A")
    public String getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(String fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "after")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getAfter(){
        return after;
    }

    @ElVoField(physicalName = "after")
    public void setAfter(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> after){
        this.after = after;
    }

    @ElVoField(physicalName = "before")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> getBefore(){
        return before;
    }

    @ElVoField(physicalName = "before")
    public void setBefore(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAppChangeVo> before){
        this.before = before;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatAppChangeVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("input_ymd_st").append("=").append(input_ymd_st).append(",");
        sb.append("input_ymd_ed").append("=").append(input_ymd_ed).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("skate_clsf").append("=").append(skate_clsf).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("input_ymd").append("=").append(input_ymd).append(",");
        sb.append("his_seq").append("=").append(his_seq).append(",");
        sb.append("acdt_unusual_item").append("=").append(acdt_unusual_item).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("his_seq_max").append("=").append(his_seq_max).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("resch_respn_syspayno").append("=").append(resch_respn_syspayno).append(",");
        sb.append("prj_term").append("=").append(prj_term).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("resch_respn_syspaynm").append("=").append(resch_respn_syspaynm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("vend_type").append("=").append(vend_type).append(",");
        sb.append("stake_rt").append("=").append(stake_rt).append(",");
        sb.append("blong_clsf").append("=").append(blong_clsf).append(",");
        sb.append("blong_cd").append("=").append(blong_cd).append(",");
        sb.append("blong_nm").append("=").append(blong_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("invnt_psn_clsf").append("=").append(invnt_psn_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("vend_bsn_no").append("=").append(vend_bsn_no).append(",");
        sb.append("nm_krn").append("=").append(nm_krn).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("chng_state").append("=").append(chng_state).append(",");
        sb.append("stake_dept").append("=").append(stake_dept).append(",");
        sb.append("trans_ex").append("=").append(trans_ex).append(",");
        sb.append("co_invnt_affir_ex").append("=").append(co_invnt_affir_ex).append(",");
        sb.append("co_invnt_affir_ymd").append("=").append(co_invnt_affir_ymd).append(",");
        sb.append("co_invnt_affir_rmk").append("=").append(co_invnt_affir_rmk).append(",");
        sb.append("co_invnt_retn_ymd").append("=").append(co_invnt_retn_ymd).append(",");
        sb.append("co_invnt_retn_rmk").append("=").append(co_invnt_retn_rmk).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("pat_grd").append("=").append(pat_grd).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("invnt_eng_nm").append("=").append(invnt_eng_nm).append(",");
        sb.append("detls_krn_nm").append("=").append(detls_krn_nm).append(",");
        sb.append("detls_eng_nm").append("=").append(detls_eng_nm).append(",");
        sb.append("smitapp_krn_nm").append("=").append(smitapp_krn_nm).append(",");
        sb.append("smitapp_eng_nm").append("=").append(smitapp_eng_nm).append(",");
        sb.append("regst_krn_nm").append("=").append(regst_krn_nm).append(",");
        sb.append("regst_eng_nm").append("=").append(regst_eng_nm).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_reg_ymd").append("=").append(smitapp_reg_ymd).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("regst_reg_ymd").append("=").append(regst_reg_ymd).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("patofic_contac_loc").append("=").append(patofic_contac_loc).append(",");
        sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
        sb.append("right_mnt_final_seq").append("=").append(right_mnt_final_seq).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("oversapp_hope_ex").append("=").append(oversapp_hope_ex).append(",");
        sb.append("pct_chk").append("=").append(pct_chk).append(",");
        sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
        sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
        sb.append("open_no").append("=").append(open_no).append(",");
        sb.append("intrn_smitapp_no").append("=").append(intrn_smitapp_no).append(",");
        sb.append("intrn_smitapp_ymd").append("=").append(intrn_smitapp_ymd).append(",");
        sb.append("prityrgt_main_rspns_no").append("=").append(prityrgt_main_rspns_no).append(",");
        sb.append("prityrgt_main_rspns_ymd").append("=").append(prityrgt_main_rspns_ymd).append(",");
        sb.append("open_ex").append("=").append(open_ex).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("open_contnt").append("=").append(open_contnt).append(",");
        sb.append("invnt_clsf").append("=").append(invnt_clsf).append(",");
        sb.append("ely_open_ex").append("=").append(ely_open_ex).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex).append(",");
        sb.append("prity_eval_ex").append("=").append(prity_eval_ex).append(",");
        sb.append("smitapp_occr_clsf").append("=").append(smitapp_occr_clsf).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("smitapp_way").append("=").append(smitapp_way).append(",");
        sb.append("tech_eval_hope_ex").append("=").append(tech_eval_hope_ex).append(",");
        sb.append("tech_trans_hope_ex").append("=").append(tech_trans_hope_ex).append(",");
        sb.append("tech_trans_hope_amt").append("=").append(tech_trans_hope_amt).append(",");
        sb.append("tech_trans_hope_typ").append("=").append(tech_trans_hope_typ).append(",");
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
        sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("pre_tech_wrt_invst").append("=").append(pre_tech_wrt_invst).append(",");
        sb.append("attach_file_no_2").append("=").append(attach_file_no_2).append(",");
        sb.append("attach_file_no_3").append("=").append(attach_file_no_3).append(",");
        sb.append("attach_file_no_4").append("=").append(attach_file_no_4).append(",");
        sb.append("ipc_01").append("=").append(ipc_01).append(",");
        sb.append("ipc_02").append("=").append(ipc_02).append(",");
        sb.append("ipc_03").append("=").append(ipc_03).append(",");
        sb.append("exam_reflect_clsf").append("=").append(exam_reflect_clsf).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("post_no").append("=").append(post_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("blong_clsf_nm").append("=").append(blong_clsf_nm).append(",");
        sb.append("resid_no_dis").append("=").append(resid_no_dis).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("vend_type_nm").append("=").append(vend_type_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("patofic_mng_no").append("=").append(patofic_mng_no).append(",");
        sb.append("tech_clsf_nm").append("=").append(tech_clsf_nm).append(",");
        sb.append("smitapp_occr_clsf_nm").append("=").append(smitapp_occr_clsf_nm).append(",");
        sb.append("bef_open_yn").append("=").append(bef_open_yn).append(",");
        sb.append("open_attach_file_no").append("=").append(open_attach_file_no).append(",");
        sb.append("bpm_yn").append("=").append(bpm_yn).append(",");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("max_seq").append("=").append(max_seq).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("ext3_cd").append("=").append(ext3_cd).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("researcher_id").append("=").append(researcher_id).append(",");
        sb.append("main_researcher_id").append("=").append(main_researcher_id).append(",");
        sb.append("apply_yn_cd").append("=").append(apply_yn_cd).append(",");
        sb.append("scrn_clsf").append("=").append(scrn_clsf).append(",");
        sb.append("save_clsf").append("=").append(save_clsf).append(",");
        sb.append("chng_cause").append("=").append(chng_cause).append(",");
        sb.append("app_req_no").append("=").append(app_req_no).append(",");
        sb.append("bf_seq").append("=").append(bf_seq).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("after").append("=").append(after).append(",");
        sb.append("before").append("=").append(before).append(",");
        sb.append("attachVo1").append("=").append(attachVo1);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; after != null && i < after.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)after.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; before != null && i < before.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)before.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; after != null && i < after.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)after.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; before != null && i < before.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAppChangeVo vo = (kr.re.kitech.biz.pat.app.vo.PatAppChangeVo)before.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
