package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssAppChaReqExp")
public class AssAppChaReqDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppChaReqDetailVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "couseClsf", physicalName = "couse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf;

    @ElDtoField(logicalName = "couseClsfN", physicalName = "couse_clsf_n", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf_n;

    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "transDeptNm", physicalName = "trans_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_dept_nm;

    @ElDtoField(logicalName = "transNm", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "transEmpno", physicalName = "trans_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_empno;

    @ElDtoField(logicalName = "transSyspayno", physicalName = "trans_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_syspayno;

    @ElDtoField(logicalName = "transDeptCd", physicalName = "trans_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_dept_cd;

    @ElDtoField(logicalName = "transDeptNewYmd", physicalName = "trans_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_dept_new_ymd;

    @ElDtoField(logicalName = "transEmail", physicalName = "trans_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_email;

    @ElDtoField(logicalName = "transExtNo", physicalName = "trans_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_ext_no;

    @ElDtoField(logicalName = "transRespnNm", physicalName = "trans_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_respn_nm;

    @ElDtoField(logicalName = "transRespnEmpno", physicalName = "trans_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_respn_empno;

    @ElDtoField(logicalName = "receiptDeptNm", physicalName = "receipt_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_dept_nm;

    @ElDtoField(logicalName = "receiptNm", physicalName = "receipt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_nm;

    @ElDtoField(logicalName = "receiptEmpno", physicalName = "receipt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_empno;

    @ElDtoField(logicalName = "receiptSyspayno", physicalName = "receipt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_syspayno;

    @ElDtoField(logicalName = "receiptDeptCd", physicalName = "receipt_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_dept_cd;

    @ElDtoField(logicalName = "receiptDeptNewYmd", physicalName = "receipt_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_dept_new_ymd;

    @ElDtoField(logicalName = "receiptEmail", physicalName = "receipt_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_email;

    @ElDtoField(logicalName = "receiptExtNo", physicalName = "receipt_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_ext_no;

    @ElDtoField(logicalName = "receiptRespnNm", physicalName = "receipt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_respn_nm;

    @ElDtoField(logicalName = "receiptRespnEmpno", physicalName = "receipt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_respn_empno;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "asetTypNm", physicalName = "aset_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ_nm;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;

    @ElDtoField(logicalName = "mainSubClsf", physicalName = "main_sub_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf;

    @ElDtoField(logicalName = "mainSubClsfNm", physicalName = "main_sub_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf_nm;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "posiRegion", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;

    @ElDtoField(logicalName = "posiRegionNm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region_nm;

    @ElDtoField(logicalName = "posiBuild", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;

    @ElDtoField(logicalName = "posiBuildNm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;

    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;

    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "fomatUnit1", physicalName = "fomatUnit1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomatUnit1;

    @ElDtoField(logicalName = "fomatUnit2", physicalName = "fomatUnit2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomatUnit2;

    @ElDtoField(logicalName = "receiptPosiRegion", physicalName = "receipt_posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_region;

    @ElDtoField(logicalName = "receiptPosiRegionNm", physicalName = "receipt_posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_region_nm;

    @ElDtoField(logicalName = "receiptPosiBuild", physicalName = "receipt_posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_build;

    @ElDtoField(logicalName = "receiptPosiBuildNm", physicalName = "receipt_posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_build_nm;

    @ElDtoField(logicalName = "receiptPosiFloor", physicalName = "receipt_posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_floor;

    @ElDtoField(logicalName = "receiptPosiDetls", physicalName = "receipt_posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_posi_detls;

    @ElDtoField(logicalName = "cudType", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "docuClsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "wrteSyspayno", physicalName = "wrte_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_syspayno;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "transDeptCdNewYmd", physicalName = "trans_dept_cd_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_dept_cd_new_ymd;

    @ElDtoField(logicalName = "receiptDeptCdNewYmd", physicalName = "receipt_dept_cd_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_dept_cd_new_ymd;

    @ElDtoField(logicalName = "receiptAffirSyspayno", physicalName = "receipt_affir_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_affir_syspayno;

    @ElDtoField(logicalName = "receiptAffirYmd", physicalName = "receipt_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String receipt_affir_ymd;

    @ElDtoField(logicalName = "mngmtMbodyAffirSyspayno", physicalName = "mngmt_mbody_affir_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody_affir_syspayno;

    @ElDtoField(logicalName = "mngmtMbodyAffirYmd", physicalName = "mngmt_mbody_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody_affir_ymd;

    @ElDtoField(logicalName = "decidarbItem", physicalName = "decidarb_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decidarb_item;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "loginUserId", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "reporterId", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "uiId", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "operCode", physicalName = "oper_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oper_code;

    @ElDtoField(logicalName = "result", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "asetAprClsf", physicalName = "aset_apr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_apr_clsf;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "mngmtMbody", physicalName = "mngmt_mbody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody;

    @ElDtoField(logicalName = "equipCd", physicalName = "equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_cd;

    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "introYmdSt", physicalName = "intro_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd_st;

    @ElDtoField(logicalName = "asetNoNotIn", physicalName = "aset_no_not_in", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no_not_in;

    @ElDtoField(logicalName = "", physicalName = "model_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String model_nm;

    @ElDtoField(logicalName = "", physicalName = "tech_equip_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_equip_nm;

    @ElDtoField(logicalName = "", physicalName = "equip_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_state;

    @ElDtoField(logicalName = "", physicalName = "mfg_natn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mfg_natn;

    @ElDtoField(logicalName = "", physicalName = "contrct_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_vend;

    @ElDtoField(logicalName = "", physicalName = "suply_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String suply_vend;

    @ElDtoField(logicalName = "", physicalName = "mfg_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mfg_vend;

    @ElDtoField(logicalName = "", physicalName = "finnc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc;

    @ElDtoField(logicalName = "", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "", physicalName = "unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit;

    @ElDtoField(logicalName = "", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "", physicalName = "move_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String move_clsf;

    @ElDtoField(logicalName = "", physicalName = "equip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_region;

    @ElDtoField(logicalName = "", physicalName = "intro_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_way;

    @ElDtoField(logicalName = "", physicalName = "mngmt_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_start_ymd;

    @ElDtoField(logicalName = "", physicalName = "mngmt_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_cls_ymd;

    @ElDtoField(logicalName = "", physicalName = "acq_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acq_yr;

    @ElDtoField(logicalName = "", physicalName = "contnt_yrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt_yrs;

    @ElDtoField(logicalName = "", physicalName = "equip_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_fee;

    @ElDtoField(logicalName = "", physicalName = "use_esti_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_esti_time;

    @ElDtoField(logicalName = "", physicalName = "keep_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_clsf;

    @ElDtoField(logicalName = "", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "", physicalName = "techsup_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techsup_clsf;

    @ElDtoField(logicalName = "", physicalName = "usg_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_desc;

    @ElDtoField(logicalName = "", physicalName = "homepg_link_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg_link_clsf;

    @ElDtoField(logicalName = "", physicalName = "cptl_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cptl_clsf;

    @ElDtoField(logicalName = "", physicalName = "relat_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_aset_no;

    @ElDtoField(logicalName = "", physicalName = "sub_aset_intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_aset_intro_ymd;

    @ElDtoField(logicalName = "", physicalName = "upgrade_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String upgrade_clsf;

    @ElDtoField(logicalName = "", physicalName = "tag_issu_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_issu_ex;

    @ElDtoField(logicalName = "", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "", physicalName = "pda_send_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pda_send_yn;

    @ElDtoField(logicalName = "", physicalName = "model_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String model_yn;

    @ElDtoField(logicalName = "", physicalName = "compu_equip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compu_equip_yn;

    @ElDtoField(logicalName = "", physicalName = "compu_equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compu_equip_cd;

    @ElDtoField(logicalName = "", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "", physicalName = "kbcc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kbcc_yn;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "couse_clsf")
    public String getCouse_clsf(){
        return couse_clsf;
    }

    @ElVoField(physicalName = "couse_clsf")
    public void setCouse_clsf(String couse_clsf){
        this.couse_clsf = couse_clsf;
    }

    @ElVoField(physicalName = "couse_clsf_n")
    public String getCouse_clsf_n(){
        return couse_clsf_n;
    }

    @ElVoField(physicalName = "couse_clsf_n")
    public void setCouse_clsf_n(String couse_clsf_n){
        this.couse_clsf_n = couse_clsf_n;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "trans_dept_nm")
    public String getTrans_dept_nm(){
        return trans_dept_nm;
    }

    @ElVoField(physicalName = "trans_dept_nm")
    public void setTrans_dept_nm(String trans_dept_nm){
        this.trans_dept_nm = trans_dept_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public String getTrans_nm(){
        return trans_nm;
    }

    @ElVoField(physicalName = "trans_nm")
    public void setTrans_nm(String trans_nm){
        this.trans_nm = trans_nm;
    }

    @ElVoField(physicalName = "trans_empno")
    public String getTrans_empno(){
        return trans_empno;
    }

    @ElVoField(physicalName = "trans_empno")
    public void setTrans_empno(String trans_empno){
        this.trans_empno = trans_empno;
    }

    @ElVoField(physicalName = "trans_syspayno")
    public String getTrans_syspayno(){
        return trans_syspayno;
    }

    @ElVoField(physicalName = "trans_syspayno")
    public void setTrans_syspayno(String trans_syspayno){
        this.trans_syspayno = trans_syspayno;
    }

    @ElVoField(physicalName = "trans_dept_cd")
    public String getTrans_dept_cd(){
        return trans_dept_cd;
    }

    @ElVoField(physicalName = "trans_dept_cd")
    public void setTrans_dept_cd(String trans_dept_cd){
        this.trans_dept_cd = trans_dept_cd;
    }

    @ElVoField(physicalName = "trans_dept_new_ymd")
    public String getTrans_dept_new_ymd(){
        return trans_dept_new_ymd;
    }

    @ElVoField(physicalName = "trans_dept_new_ymd")
    public void setTrans_dept_new_ymd(String trans_dept_new_ymd){
        this.trans_dept_new_ymd = trans_dept_new_ymd;
    }

    @ElVoField(physicalName = "trans_email")
    public String getTrans_email(){
        return trans_email;
    }

    @ElVoField(physicalName = "trans_email")
    public void setTrans_email(String trans_email){
        this.trans_email = trans_email;
    }

    @ElVoField(physicalName = "trans_ext_no")
    public String getTrans_ext_no(){
        return trans_ext_no;
    }

    @ElVoField(physicalName = "trans_ext_no")
    public void setTrans_ext_no(String trans_ext_no){
        this.trans_ext_no = trans_ext_no;
    }

    @ElVoField(physicalName = "trans_respn_nm")
    public String getTrans_respn_nm(){
        return trans_respn_nm;
    }

    @ElVoField(physicalName = "trans_respn_nm")
    public void setTrans_respn_nm(String trans_respn_nm){
        this.trans_respn_nm = trans_respn_nm;
    }

    @ElVoField(physicalName = "trans_respn_empno")
    public String getTrans_respn_empno(){
        return trans_respn_empno;
    }

    @ElVoField(physicalName = "trans_respn_empno")
    public void setTrans_respn_empno(String trans_respn_empno){
        this.trans_respn_empno = trans_respn_empno;
    }

    @ElVoField(physicalName = "receipt_dept_nm")
    public String getReceipt_dept_nm(){
        return receipt_dept_nm;
    }

    @ElVoField(physicalName = "receipt_dept_nm")
    public void setReceipt_dept_nm(String receipt_dept_nm){
        this.receipt_dept_nm = receipt_dept_nm;
    }

    @ElVoField(physicalName = "receipt_nm")
    public String getReceipt_nm(){
        return receipt_nm;
    }

    @ElVoField(physicalName = "receipt_nm")
    public void setReceipt_nm(String receipt_nm){
        this.receipt_nm = receipt_nm;
    }

    @ElVoField(physicalName = "receipt_empno")
    public String getReceipt_empno(){
        return receipt_empno;
    }

    @ElVoField(physicalName = "receipt_empno")
    public void setReceipt_empno(String receipt_empno){
        this.receipt_empno = receipt_empno;
    }

    @ElVoField(physicalName = "receipt_syspayno")
    public String getReceipt_syspayno(){
        return receipt_syspayno;
    }

    @ElVoField(physicalName = "receipt_syspayno")
    public void setReceipt_syspayno(String receipt_syspayno){
        this.receipt_syspayno = receipt_syspayno;
    }

    @ElVoField(physicalName = "receipt_dept_cd")
    public String getReceipt_dept_cd(){
        return receipt_dept_cd;
    }

    @ElVoField(physicalName = "receipt_dept_cd")
    public void setReceipt_dept_cd(String receipt_dept_cd){
        this.receipt_dept_cd = receipt_dept_cd;
    }

    @ElVoField(physicalName = "receipt_dept_new_ymd")
    public String getReceipt_dept_new_ymd(){
        return receipt_dept_new_ymd;
    }

    @ElVoField(physicalName = "receipt_dept_new_ymd")
    public void setReceipt_dept_new_ymd(String receipt_dept_new_ymd){
        this.receipt_dept_new_ymd = receipt_dept_new_ymd;
    }

    @ElVoField(physicalName = "receipt_email")
    public String getReceipt_email(){
        return receipt_email;
    }

    @ElVoField(physicalName = "receipt_email")
    public void setReceipt_email(String receipt_email){
        this.receipt_email = receipt_email;
    }

    @ElVoField(physicalName = "receipt_ext_no")
    public String getReceipt_ext_no(){
        return receipt_ext_no;
    }

    @ElVoField(physicalName = "receipt_ext_no")
    public void setReceipt_ext_no(String receipt_ext_no){
        this.receipt_ext_no = receipt_ext_no;
    }

    @ElVoField(physicalName = "receipt_respn_nm")
    public String getReceipt_respn_nm(){
        return receipt_respn_nm;
    }

    @ElVoField(physicalName = "receipt_respn_nm")
    public void setReceipt_respn_nm(String receipt_respn_nm){
        this.receipt_respn_nm = receipt_respn_nm;
    }

    @ElVoField(physicalName = "receipt_respn_empno")
    public String getReceipt_respn_empno(){
        return receipt_respn_empno;
    }

    @ElVoField(physicalName = "receipt_respn_empno")
    public void setReceipt_respn_empno(String receipt_respn_empno){
        this.receipt_respn_empno = receipt_respn_empno;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "aset_typ_nm")
    public String getAset_typ_nm(){
        return aset_typ_nm;
    }

    @ElVoField(physicalName = "aset_typ_nm")
    public void setAset_typ_nm(String aset_typ_nm){
        this.aset_typ_nm = aset_typ_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "old_aset_no")
    public String getOld_aset_no(){
        return old_aset_no;
    }

    @ElVoField(physicalName = "old_aset_no")
    public void setOld_aset_no(String old_aset_no){
        this.old_aset_no = old_aset_no;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public String getMain_sub_clsf(){
        return main_sub_clsf;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public void setMain_sub_clsf(String main_sub_clsf){
        this.main_sub_clsf = main_sub_clsf;
    }

    @ElVoField(physicalName = "main_sub_clsf_nm")
    public String getMain_sub_clsf_nm(){
        return main_sub_clsf_nm;
    }

    @ElVoField(physicalName = "main_sub_clsf_nm")
    public void setMain_sub_clsf_nm(String main_sub_clsf_nm){
        this.main_sub_clsf_nm = main_sub_clsf_nm;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public String getPosi_region_nm(){
        return posi_region_nm;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public void setPosi_region_nm(String posi_region_nm){
        this.posi_region_nm = posi_region_nm;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public String getPosi_build_nm(){
        return posi_build_nm;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public void setPosi_build_nm(String posi_build_nm){
        this.posi_build_nm = posi_build_nm;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "fomatUnit1")
    public String getFomatUnit1(){
        return fomatUnit1;
    }

    @ElVoField(physicalName = "fomatUnit1")
    public void setFomatUnit1(String fomatUnit1){
        this.fomatUnit1 = fomatUnit1;
    }

    @ElVoField(physicalName = "fomatUnit2")
    public String getFomatUnit2(){
        return fomatUnit2;
    }

    @ElVoField(physicalName = "fomatUnit2")
    public void setFomatUnit2(String fomatUnit2){
        this.fomatUnit2 = fomatUnit2;
    }

    @ElVoField(physicalName = "receipt_posi_region")
    public String getReceipt_posi_region(){
        return receipt_posi_region;
    }

    @ElVoField(physicalName = "receipt_posi_region")
    public void setReceipt_posi_region(String receipt_posi_region){
        this.receipt_posi_region = receipt_posi_region;
    }

    @ElVoField(physicalName = "receipt_posi_region_nm")
    public String getReceipt_posi_region_nm(){
        return receipt_posi_region_nm;
    }

    @ElVoField(physicalName = "receipt_posi_region_nm")
    public void setReceipt_posi_region_nm(String receipt_posi_region_nm){
        this.receipt_posi_region_nm = receipt_posi_region_nm;
    }

    @ElVoField(physicalName = "receipt_posi_build")
    public String getReceipt_posi_build(){
        return receipt_posi_build;
    }

    @ElVoField(physicalName = "receipt_posi_build")
    public void setReceipt_posi_build(String receipt_posi_build){
        this.receipt_posi_build = receipt_posi_build;
    }

    @ElVoField(physicalName = "receipt_posi_build_nm")
    public String getReceipt_posi_build_nm(){
        return receipt_posi_build_nm;
    }

    @ElVoField(physicalName = "receipt_posi_build_nm")
    public void setReceipt_posi_build_nm(String receipt_posi_build_nm){
        this.receipt_posi_build_nm = receipt_posi_build_nm;
    }

    @ElVoField(physicalName = "receipt_posi_floor")
    public String getReceipt_posi_floor(){
        return receipt_posi_floor;
    }

    @ElVoField(physicalName = "receipt_posi_floor")
    public void setReceipt_posi_floor(String receipt_posi_floor){
        this.receipt_posi_floor = receipt_posi_floor;
    }

    @ElVoField(physicalName = "receipt_posi_detls")
    public String getReceipt_posi_detls(){
        return receipt_posi_detls;
    }

    @ElVoField(physicalName = "receipt_posi_detls")
    public void setReceipt_posi_detls(String receipt_posi_detls){
        this.receipt_posi_detls = receipt_posi_detls;
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

    @ElVoField(physicalName = "wrte_syspayno")
    public String getWrte_syspayno(){
        return wrte_syspayno;
    }

    @ElVoField(physicalName = "wrte_syspayno")
    public void setWrte_syspayno(String wrte_syspayno){
        this.wrte_syspayno = wrte_syspayno;
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

    @ElVoField(physicalName = "trans_dept_cd_new_ymd")
    public String getTrans_dept_cd_new_ymd(){
        return trans_dept_cd_new_ymd;
    }

    @ElVoField(physicalName = "trans_dept_cd_new_ymd")
    public void setTrans_dept_cd_new_ymd(String trans_dept_cd_new_ymd){
        this.trans_dept_cd_new_ymd = trans_dept_cd_new_ymd;
    }

    @ElVoField(physicalName = "receipt_dept_cd_new_ymd")
    public String getReceipt_dept_cd_new_ymd(){
        return receipt_dept_cd_new_ymd;
    }

    @ElVoField(physicalName = "receipt_dept_cd_new_ymd")
    public void setReceipt_dept_cd_new_ymd(String receipt_dept_cd_new_ymd){
        this.receipt_dept_cd_new_ymd = receipt_dept_cd_new_ymd;
    }

    @ElVoField(physicalName = "receipt_affir_syspayno")
    public String getReceipt_affir_syspayno(){
        return receipt_affir_syspayno;
    }

    @ElVoField(physicalName = "receipt_affir_syspayno")
    public void setReceipt_affir_syspayno(String receipt_affir_syspayno){
        this.receipt_affir_syspayno = receipt_affir_syspayno;
    }

    @ElVoField(physicalName = "receipt_affir_ymd")
    public String getReceipt_affir_ymd(){
        return receipt_affir_ymd;
    }

    @ElVoField(physicalName = "receipt_affir_ymd")
    public void setReceipt_affir_ymd(String receipt_affir_ymd){
        this.receipt_affir_ymd = receipt_affir_ymd;
    }

    @ElVoField(physicalName = "mngmt_mbody_affir_syspayno")
    public String getMngmt_mbody_affir_syspayno(){
        return mngmt_mbody_affir_syspayno;
    }

    @ElVoField(physicalName = "mngmt_mbody_affir_syspayno")
    public void setMngmt_mbody_affir_syspayno(String mngmt_mbody_affir_syspayno){
        this.mngmt_mbody_affir_syspayno = mngmt_mbody_affir_syspayno;
    }

    @ElVoField(physicalName = "mngmt_mbody_affir_ymd")
    public String getMngmt_mbody_affir_ymd(){
        return mngmt_mbody_affir_ymd;
    }

    @ElVoField(physicalName = "mngmt_mbody_affir_ymd")
    public void setMngmt_mbody_affir_ymd(String mngmt_mbody_affir_ymd){
        this.mngmt_mbody_affir_ymd = mngmt_mbody_affir_ymd;
    }

    @ElVoField(physicalName = "decidarb_item")
    public String getDecidarb_item(){
        return decidarb_item;
    }

    @ElVoField(physicalName = "decidarb_item")
    public void setDecidarb_item(String decidarb_item){
        this.decidarb_item = decidarb_item;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
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

    @ElVoField(physicalName = "oper_code")
    public String getOper_code(){
        return oper_code;
    }

    @ElVoField(physicalName = "oper_code")
    public void setOper_code(String oper_code){
        this.oper_code = oper_code;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "aset_apr_clsf")
    public String getAset_apr_clsf(){
        return aset_apr_clsf;
    }

    @ElVoField(physicalName = "aset_apr_clsf")
    public void setAset_apr_clsf(String aset_apr_clsf){
        this.aset_apr_clsf = aset_apr_clsf;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public String getMngmt_mbody(){
        return mngmt_mbody;
    }

    @ElVoField(physicalName = "mngmt_mbody")
    public void setMngmt_mbody(String mngmt_mbody){
        this.mngmt_mbody = mngmt_mbody;
    }

    @ElVoField(physicalName = "equip_cd")
    public String getEquip_cd(){
        return equip_cd;
    }

    @ElVoField(physicalName = "equip_cd")
    public void setEquip_cd(String equip_cd){
        this.equip_cd = equip_cd;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "intro_ymd_st")
    public String getIntro_ymd_st(){
        return intro_ymd_st;
    }

    @ElVoField(physicalName = "intro_ymd_st")
    public void setIntro_ymd_st(String intro_ymd_st){
        this.intro_ymd_st = intro_ymd_st;
    }

    @ElVoField(physicalName = "aset_no_not_in")
    public String getAset_no_not_in(){
        return aset_no_not_in;
    }

    @ElVoField(physicalName = "aset_no_not_in")
    public void setAset_no_not_in(String aset_no_not_in){
        this.aset_no_not_in = aset_no_not_in;
    }

    @ElVoField(physicalName = "model_nm")
    public String getModel_nm(){
        return model_nm;
    }

    @ElVoField(physicalName = "model_nm")
    public void setModel_nm(String model_nm){
        this.model_nm = model_nm;
    }

    @ElVoField(physicalName = "tech_equip_nm")
    public String getTech_equip_nm(){
        return tech_equip_nm;
    }

    @ElVoField(physicalName = "tech_equip_nm")
    public void setTech_equip_nm(String tech_equip_nm){
        this.tech_equip_nm = tech_equip_nm;
    }

    @ElVoField(physicalName = "equip_state")
    public String getEquip_state(){
        return equip_state;
    }

    @ElVoField(physicalName = "equip_state")
    public void setEquip_state(String equip_state){
        this.equip_state = equip_state;
    }

    @ElVoField(physicalName = "mfg_natn")
    public String getMfg_natn(){
        return mfg_natn;
    }

    @ElVoField(physicalName = "mfg_natn")
    public void setMfg_natn(String mfg_natn){
        this.mfg_natn = mfg_natn;
    }

    @ElVoField(physicalName = "contrct_vend")
    public String getContrct_vend(){
        return contrct_vend;
    }

    @ElVoField(physicalName = "contrct_vend")
    public void setContrct_vend(String contrct_vend){
        this.contrct_vend = contrct_vend;
    }

    @ElVoField(physicalName = "suply_vend")
    public String getSuply_vend(){
        return suply_vend;
    }

    @ElVoField(physicalName = "suply_vend")
    public void setSuply_vend(String suply_vend){
        this.suply_vend = suply_vend;
    }

    @ElVoField(physicalName = "mfg_vend")
    public String getMfg_vend(){
        return mfg_vend;
    }

    @ElVoField(physicalName = "mfg_vend")
    public void setMfg_vend(String mfg_vend){
        this.mfg_vend = mfg_vend;
    }

    @ElVoField(physicalName = "finnc")
    public String getFinnc(){
        return finnc;
    }

    @ElVoField(physicalName = "finnc")
    public void setFinnc(String finnc){
        this.finnc = finnc;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "unit")
    public String getUnit(){
        return unit;
    }

    @ElVoField(physicalName = "unit")
    public void setUnit(String unit){
        this.unit = unit;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "move_clsf")
    public String getMove_clsf(){
        return move_clsf;
    }

    @ElVoField(physicalName = "move_clsf")
    public void setMove_clsf(String move_clsf){
        this.move_clsf = move_clsf;
    }

    @ElVoField(physicalName = "equip_region")
    public String getEquip_region(){
        return equip_region;
    }

    @ElVoField(physicalName = "equip_region")
    public void setEquip_region(String equip_region){
        this.equip_region = equip_region;
    }

    @ElVoField(physicalName = "intro_way")
    public String getIntro_way(){
        return intro_way;
    }

    @ElVoField(physicalName = "intro_way")
    public void setIntro_way(String intro_way){
        this.intro_way = intro_way;
    }

    @ElVoField(physicalName = "mngmt_start_ymd")
    public String getMngmt_start_ymd(){
        return mngmt_start_ymd;
    }

    @ElVoField(physicalName = "mngmt_start_ymd")
    public void setMngmt_start_ymd(String mngmt_start_ymd){
        this.mngmt_start_ymd = mngmt_start_ymd;
    }

    @ElVoField(physicalName = "mngmt_cls_ymd")
    public String getMngmt_cls_ymd(){
        return mngmt_cls_ymd;
    }

    @ElVoField(physicalName = "mngmt_cls_ymd")
    public void setMngmt_cls_ymd(String mngmt_cls_ymd){
        this.mngmt_cls_ymd = mngmt_cls_ymd;
    }

    @ElVoField(physicalName = "acq_yr")
    public String getAcq_yr(){
        return acq_yr;
    }

    @ElVoField(physicalName = "acq_yr")
    public void setAcq_yr(String acq_yr){
        this.acq_yr = acq_yr;
    }

    @ElVoField(physicalName = "contnt_yrs")
    public String getContnt_yrs(){
        return contnt_yrs;
    }

    @ElVoField(physicalName = "contnt_yrs")
    public void setContnt_yrs(String contnt_yrs){
        this.contnt_yrs = contnt_yrs;
    }

    @ElVoField(physicalName = "equip_use_fee")
    public String getEquip_use_fee(){
        return equip_use_fee;
    }

    @ElVoField(physicalName = "equip_use_fee")
    public void setEquip_use_fee(String equip_use_fee){
        this.equip_use_fee = equip_use_fee;
    }

    @ElVoField(physicalName = "use_esti_time")
    public String getUse_esti_time(){
        return use_esti_time;
    }

    @ElVoField(physicalName = "use_esti_time")
    public void setUse_esti_time(String use_esti_time){
        this.use_esti_time = use_esti_time;
    }

    @ElVoField(physicalName = "keep_clsf")
    public String getKeep_clsf(){
        return keep_clsf;
    }

    @ElVoField(physicalName = "keep_clsf")
    public void setKeep_clsf(String keep_clsf){
        this.keep_clsf = keep_clsf;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public String getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(String slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "techsup_clsf")
    public String getTechsup_clsf(){
        return techsup_clsf;
    }

    @ElVoField(physicalName = "techsup_clsf")
    public void setTechsup_clsf(String techsup_clsf){
        this.techsup_clsf = techsup_clsf;
    }

    @ElVoField(physicalName = "usg_desc")
    public String getUsg_desc(){
        return usg_desc;
    }

    @ElVoField(physicalName = "usg_desc")
    public void setUsg_desc(String usg_desc){
        this.usg_desc = usg_desc;
    }

    @ElVoField(physicalName = "homepg_link_clsf")
    public String getHomepg_link_clsf(){
        return homepg_link_clsf;
    }

    @ElVoField(physicalName = "homepg_link_clsf")
    public void setHomepg_link_clsf(String homepg_link_clsf){
        this.homepg_link_clsf = homepg_link_clsf;
    }

    @ElVoField(physicalName = "cptl_clsf")
    public String getCptl_clsf(){
        return cptl_clsf;
    }

    @ElVoField(physicalName = "cptl_clsf")
    public void setCptl_clsf(String cptl_clsf){
        this.cptl_clsf = cptl_clsf;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public String getRelat_aset_no(){
        return relat_aset_no;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public void setRelat_aset_no(String relat_aset_no){
        this.relat_aset_no = relat_aset_no;
    }

    @ElVoField(physicalName = "sub_aset_intro_ymd")
    public String getSub_aset_intro_ymd(){
        return sub_aset_intro_ymd;
    }

    @ElVoField(physicalName = "sub_aset_intro_ymd")
    public void setSub_aset_intro_ymd(String sub_aset_intro_ymd){
        this.sub_aset_intro_ymd = sub_aset_intro_ymd;
    }

    @ElVoField(physicalName = "upgrade_clsf")
    public String getUpgrade_clsf(){
        return upgrade_clsf;
    }

    @ElVoField(physicalName = "upgrade_clsf")
    public void setUpgrade_clsf(String upgrade_clsf){
        this.upgrade_clsf = upgrade_clsf;
    }

    @ElVoField(physicalName = "tag_issu_ex")
    public String getTag_issu_ex(){
        return tag_issu_ex;
    }

    @ElVoField(physicalName = "tag_issu_ex")
    public void setTag_issu_ex(String tag_issu_ex){
        this.tag_issu_ex = tag_issu_ex;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "pda_send_yn")
    public String getPda_send_yn(){
        return pda_send_yn;
    }

    @ElVoField(physicalName = "pda_send_yn")
    public void setPda_send_yn(String pda_send_yn){
        this.pda_send_yn = pda_send_yn;
    }

    @ElVoField(physicalName = "model_yn")
    public String getModel_yn(){
        return model_yn;
    }

    @ElVoField(physicalName = "model_yn")
    public void setModel_yn(String model_yn){
        this.model_yn = model_yn;
    }

    @ElVoField(physicalName = "compu_equip_yn")
    public String getCompu_equip_yn(){
        return compu_equip_yn;
    }

    @ElVoField(physicalName = "compu_equip_yn")
    public void setCompu_equip_yn(String compu_equip_yn){
        this.compu_equip_yn = compu_equip_yn;
    }

    @ElVoField(physicalName = "compu_equip_cd")
    public String getCompu_equip_cd(){
        return compu_equip_cd;
    }

    @ElVoField(physicalName = "compu_equip_cd")
    public void setCompu_equip_cd(String compu_equip_cd){
        this.compu_equip_cd = compu_equip_cd;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "kbcc_yn")
    public String getKbcc_yn(){
        return kbcc_yn;
    }

    @ElVoField(physicalName = "kbcc_yn")
    public void setKbcc_yn(String kbcc_yn){
        this.kbcc_yn = kbcc_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssAppChaReqDetailVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("couse_clsf").append("=").append(couse_clsf).append(",");
        sb.append("couse_clsf_n").append("=").append(couse_clsf_n).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("trans_dept_nm").append("=").append(trans_dept_nm).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("trans_empno").append("=").append(trans_empno).append(",");
        sb.append("trans_syspayno").append("=").append(trans_syspayno).append(",");
        sb.append("trans_dept_cd").append("=").append(trans_dept_cd).append(",");
        sb.append("trans_dept_new_ymd").append("=").append(trans_dept_new_ymd).append(",");
        sb.append("trans_email").append("=").append(trans_email).append(",");
        sb.append("trans_ext_no").append("=").append(trans_ext_no).append(",");
        sb.append("trans_respn_nm").append("=").append(trans_respn_nm).append(",");
        sb.append("trans_respn_empno").append("=").append(trans_respn_empno).append(",");
        sb.append("receipt_dept_nm").append("=").append(receipt_dept_nm).append(",");
        sb.append("receipt_nm").append("=").append(receipt_nm).append(",");
        sb.append("receipt_empno").append("=").append(receipt_empno).append(",");
        sb.append("receipt_syspayno").append("=").append(receipt_syspayno).append(",");
        sb.append("receipt_dept_cd").append("=").append(receipt_dept_cd).append(",");
        sb.append("receipt_dept_new_ymd").append("=").append(receipt_dept_new_ymd).append(",");
        sb.append("receipt_email").append("=").append(receipt_email).append(",");
        sb.append("receipt_ext_no").append("=").append(receipt_ext_no).append(",");
        sb.append("receipt_respn_nm").append("=").append(receipt_respn_nm).append(",");
        sb.append("receipt_respn_empno").append("=").append(receipt_respn_empno).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("aset_typ_nm").append("=").append(aset_typ_nm).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
        sb.append("main_sub_clsf").append("=").append(main_sub_clsf).append(",");
        sb.append("main_sub_clsf_nm").append("=").append(main_sub_clsf_nm).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("fomatUnit1").append("=").append(fomatUnit1).append(",");
        sb.append("fomatUnit2").append("=").append(fomatUnit2).append(",");
        sb.append("receipt_posi_region").append("=").append(receipt_posi_region).append(",");
        sb.append("receipt_posi_region_nm").append("=").append(receipt_posi_region_nm).append(",");
        sb.append("receipt_posi_build").append("=").append(receipt_posi_build).append(",");
        sb.append("receipt_posi_build_nm").append("=").append(receipt_posi_build_nm).append(",");
        sb.append("receipt_posi_floor").append("=").append(receipt_posi_floor).append(",");
        sb.append("receipt_posi_detls").append("=").append(receipt_posi_detls).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("wrte_syspayno").append("=").append(wrte_syspayno).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("trans_dept_cd_new_ymd").append("=").append(trans_dept_cd_new_ymd).append(",");
        sb.append("receipt_dept_cd_new_ymd").append("=").append(receipt_dept_cd_new_ymd).append(",");
        sb.append("receipt_affir_syspayno").append("=").append(receipt_affir_syspayno).append(",");
        sb.append("receipt_affir_ymd").append("=").append(receipt_affir_ymd).append(",");
        sb.append("mngmt_mbody_affir_syspayno").append("=").append(mngmt_mbody_affir_syspayno).append(",");
        sb.append("mngmt_mbody_affir_ymd").append("=").append(mngmt_mbody_affir_ymd).append(",");
        sb.append("decidarb_item").append("=").append(decidarb_item).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("oper_code").append("=").append(oper_code).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("aset_apr_clsf").append("=").append(aset_apr_clsf).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("mngmt_mbody").append("=").append(mngmt_mbody).append(",");
        sb.append("equip_cd").append("=").append(equip_cd).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("intro_ymd_st").append("=").append(intro_ymd_st).append(",");
        sb.append("aset_no_not_in").append("=").append(aset_no_not_in).append(",");
        sb.append("model_nm").append("=").append(model_nm).append(",");
        sb.append("tech_equip_nm").append("=").append(tech_equip_nm).append(",");
        sb.append("equip_state").append("=").append(equip_state).append(",");
        sb.append("mfg_natn").append("=").append(mfg_natn).append(",");
        sb.append("contrct_vend").append("=").append(contrct_vend).append(",");
        sb.append("suply_vend").append("=").append(suply_vend).append(",");
        sb.append("mfg_vend").append("=").append(mfg_vend).append(",");
        sb.append("finnc").append("=").append(finnc).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("unit").append("=").append(unit).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("move_clsf").append("=").append(move_clsf).append(",");
        sb.append("equip_region").append("=").append(equip_region).append(",");
        sb.append("intro_way").append("=").append(intro_way).append(",");
        sb.append("mngmt_start_ymd").append("=").append(mngmt_start_ymd).append(",");
        sb.append("mngmt_cls_ymd").append("=").append(mngmt_cls_ymd).append(",");
        sb.append("acq_yr").append("=").append(acq_yr).append(",");
        sb.append("contnt_yrs").append("=").append(contnt_yrs).append(",");
        sb.append("equip_use_fee").append("=").append(equip_use_fee).append(",");
        sb.append("use_esti_time").append("=").append(use_esti_time).append(",");
        sb.append("keep_clsf").append("=").append(keep_clsf).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("techsup_clsf").append("=").append(techsup_clsf).append(",");
        sb.append("usg_desc").append("=").append(usg_desc).append(",");
        sb.append("homepg_link_clsf").append("=").append(homepg_link_clsf).append(",");
        sb.append("cptl_clsf").append("=").append(cptl_clsf).append(",");
        sb.append("relat_aset_no").append("=").append(relat_aset_no).append(",");
        sb.append("sub_aset_intro_ymd").append("=").append(sub_aset_intro_ymd).append(",");
        sb.append("upgrade_clsf").append("=").append(upgrade_clsf).append(",");
        sb.append("tag_issu_ex").append("=").append(tag_issu_ex).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("pda_send_yn").append("=").append(pda_send_yn).append(",");
        sb.append("model_yn").append("=").append(model_yn).append(",");
        sb.append("compu_equip_yn").append("=").append(compu_equip_yn).append(",");
        sb.append("compu_equip_cd").append("=").append(compu_equip_cd).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("kbcc_yn").append("=").append(kbcc_yn);
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
