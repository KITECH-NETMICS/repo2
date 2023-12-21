package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 마스터 Vo")
public class PatMastrVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatMastrVo(){
    }

    @ElDtoField(logicalName = "특허구분", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "발명구분", physicalName = "invnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf;

    @ElDtoField(logicalName = "국내해외구분", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "담당자", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "발명국문명칭", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "발명영문명칭", physicalName = "invnt_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_eng_nm;

    @ElDtoField(logicalName = "특허사무소코드", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "특허사무소명칭", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "특허사무소담당자아이디", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "특허사무소담당자명", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "특허사무소연락처", physicalName = "patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_contac_loc;

    @ElDtoField(logicalName = "PCT진입여부", physicalName = "pct_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_chk;

    @ElDtoField(logicalName = "출원희망국가코드", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;

    @ElDtoField(logicalName = "출원희망국가명", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;

    @ElDtoField(logicalName = "발명등급", physicalName = "pat_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd;

    @ElDtoField(logicalName = "등급이유", physicalName = "grd_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grd_resn;

    @ElDtoField(logicalName = "기술평가희망유무", physicalName = "tech_eval_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_hope_ex;

    @ElDtoField(logicalName = "기술이전희망유무", physicalName = "tech_trans_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_ex;

    @ElDtoField(logicalName = "기술이전희망금액", physicalName = "tech_trans_hope_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_amt;

    @ElDtoField(logicalName = "기술이전희망유형", physicalName = "tech_trans_hope_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_trans_hope_typ;

    @ElDtoField(logicalName = "확인요청일자", physicalName = "affir_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affir_req_ymd;

    @ElDtoField(logicalName = "발명자비고", physicalName = "invnt_psn_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_rmk;

    @ElDtoField(logicalName = "발명기안일자", physicalName = "invnt_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_draft_ymd;

    @ElDtoField(logicalName = "발명결재완료일자", physicalName = "invnt_apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_apprvl_complt_ymd;

    @ElDtoField(logicalName = "발명부결일자", physicalName = "invnt_reject_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_ymd;

    @ElDtoField(logicalName = "발명부결사유", physicalName = "invnt_reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_resn;

    @ElDtoField(logicalName = "발명작성시스템개인번호", physicalName = "invnt_wrte_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_wrte_syspayno;

    @ElDtoField(logicalName = "구데이터관리번호", physicalName = "old_data_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_data_mngmt_no;

    @ElDtoField(logicalName = "기술설명서 첨부파일", physicalName = "attach_file_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_1;

    @ElDtoField(logicalName = "선행기술조사 첨부파일", physicalName = "attach_file_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_2;

    @ElDtoField(logicalName = "사업화계획서 첨부파일", physicalName = "attach_file_no_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_3;

    @ElDtoField(logicalName = "첨부파일4", physicalName = "attach_file_no_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_4;

    @ElDtoField(logicalName = "기술내용", physicalName = "tech_field", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_field;

    @ElDtoField(logicalName = "산업사용구분", physicalName = "indst_use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_use_clsf;

    @ElDtoField(logicalName = "해결방안", physicalName = "solve_task", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String solve_task;

    @ElDtoField(logicalName = "발명효과", physicalName = "invnt_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_efct;

    @ElDtoField(logicalName = "관련발명", physicalName = "relat_invnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_invnt;

    @ElDtoField(logicalName = "도면 첨부파일", physicalName = "plan_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_attach_file_no;

    @ElDtoField(logicalName = "사전공개 첨부파일", physicalName = "open_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_attach_file_no;

    @ElDtoField(logicalName = "기타 첨부파일", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "기술분류", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;

    @ElDtoField(logicalName = "위임담당자", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;

    @ElDtoField(logicalName = "출원발생구분", physicalName = "smitapp_occr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf;

    @ElDtoField(logicalName = "관련국내출원번호", physicalName = "relat_dom_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_dom_smitapp_no;

    @ElDtoField(logicalName = "심의 대상 유무", physicalName = "eval_act_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_act_yn;

    @ElDtoField(logicalName = "특허설계지원사업 구분", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "인터뷰여부", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "smitappCompltPsn", physicalName = "smitapp_complt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_psn;

    @ElDtoField(logicalName = "smitappCompltEmpno", physicalName = "smitapp_complt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_empno;

    @ElDtoField(logicalName = "smitappCompltNm", physicalName = "smitapp_complt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_nm;

    @ElDtoField(logicalName = "smitappCompltYmd", physicalName = "smitapp_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_complt_ymd;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "smitappRegYmd", physicalName = "smitapp_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_reg_ymd;

    @ElDtoField(logicalName = "smitappWay", physicalName = "smitapp_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way;

    @ElDtoField(logicalName = "smitappWayNm", physicalName = "smitapp_way_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_way_nm;

    @ElDtoField(logicalName = "intrnSmitappNo", physicalName = "intrn_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_no;

    @ElDtoField(logicalName = "intrnSmitappYmd", physicalName = "intrn_smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_smitapp_ymd;

    @ElDtoField(logicalName = "smitappOccrClsfNm", physicalName = "smitapp_occr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf_nm;

    @ElDtoField(logicalName = "smitappKrnNm", physicalName = "smitapp_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_krn_nm;

    @ElDtoField(logicalName = "smitappEngNm", physicalName = "smitapp_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_eng_nm;

    @ElDtoField(logicalName = "prityrgtMainRspnsNo", physicalName = "prityrgt_main_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_no;

    @ElDtoField(logicalName = "prityrgtMainRspnsYmd", physicalName = "prityrgt_main_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_ymd;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;

    @ElDtoField(logicalName = "ipc01", physicalName = "ipc_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01;

    @ElDtoField(logicalName = "ipc0101", physicalName = "ipc_01_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_01;

    @ElDtoField(logicalName = "ipc0102", physicalName = "ipc_01_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_02;

    @ElDtoField(logicalName = "ipc0103", physicalName = "ipc_01_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_03;

    @ElDtoField(logicalName = "ipc0104", physicalName = "ipc_01_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_01_04;

    @ElDtoField(logicalName = "ipc02", physicalName = "ipc_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02;

    @ElDtoField(logicalName = "ipc0201", physicalName = "ipc_02_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_01;

    @ElDtoField(logicalName = "ipc0202", physicalName = "ipc_02_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_02;

    @ElDtoField(logicalName = "ipc0203", physicalName = "ipc_02_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_03;

    @ElDtoField(logicalName = "ipc0204", physicalName = "ipc_02_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_02_04;

    @ElDtoField(logicalName = "ipc03", physicalName = "ipc_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03;

    @ElDtoField(logicalName = "ipc0301", physicalName = "ipc_03_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_01;

    @ElDtoField(logicalName = "ipc0302", physicalName = "ipc_03_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_02;

    @ElDtoField(logicalName = "ipc0303", physicalName = "ipc_03_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_03;

    @ElDtoField(logicalName = "ipc0304", physicalName = "ipc_03_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ipc_03_04;

    @ElDtoField(logicalName = "examReflectClsf", physicalName = "exam_reflect_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_reflect_clsf;

    @ElDtoField(logicalName = "detls_krn_nm", physicalName = "detls_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_krn_nm;

    @ElDtoField(logicalName = "detls_eng_nm", physicalName = "detls_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_eng_nm;

    @ElDtoField(logicalName = "regst_krn_nm", physicalName = "regst_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_krn_nm;

    @ElDtoField(logicalName = "regst_eng_nm", physicalName = "regst_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_eng_nm;

    @ElDtoField(logicalName = "trans_nm", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "regst_no", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "regst_ymd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "regst_reg_ymd", physicalName = "regst_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_reg_ymd;

    @ElDtoField(logicalName = "invnt_syspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "right_mnt_final_seq", physicalName = "right_mnt_final_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_mnt_final_seq;

    @ElDtoField(logicalName = "oversapp_hope_ex", physicalName = "oversapp_hope_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oversapp_hope_ex;

    @ElDtoField(logicalName = "open_no", physicalName = "open_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_no;

    @ElDtoField(logicalName = "open_ex", physicalName = "open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ex;

    @ElDtoField(logicalName = "open_ymd", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "open_contnt", physicalName = "open_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_contnt;

    @ElDtoField(logicalName = "ely_open_ex", physicalName = "ely_open_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ely_open_ex;

    @ElDtoField(logicalName = "eval_demnd_ex", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElDtoField(logicalName = "prity_eval_ex", physicalName = "prity_eval_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_ex;

    @ElDtoField(logicalName = "co_smitapp_ex", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "prityrgt_wdrw_ymd", physicalName = "prityrgt_wdrw_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_wdrw_ymd;

    @ElDtoField(logicalName = "pre_tech_wrt_invst", physicalName = "pre_tech_wrt_invst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_tech_wrt_invst;

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public String getInvnt_clsf(){
        return invnt_clsf;
    }

    @ElVoField(physicalName = "invnt_clsf")
    public void setInvnt_clsf(String invnt_clsf){
        this.invnt_clsf = invnt_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public String getInvnt_eng_nm(){
        return invnt_eng_nm;
    }

    @ElVoField(physicalName = "invnt_eng_nm")
    public void setInvnt_eng_nm(String invnt_eng_nm){
        this.invnt_eng_nm = invnt_eng_nm;
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

    @ElVoField(physicalName = "patofic_contac_loc")
    public String getPatofic_contac_loc(){
        return patofic_contac_loc;
    }

    @ElVoField(physicalName = "patofic_contac_loc")
    public void setPatofic_contac_loc(String patofic_contac_loc){
        this.patofic_contac_loc = patofic_contac_loc;
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

    @ElVoField(physicalName = "tech_field")
    public String getTech_field(){
        return tech_field;
    }

    @ElVoField(physicalName = "tech_field")
    public void setTech_field(String tech_field){
        this.tech_field = tech_field;
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

    @ElVoField(physicalName = "relat_invnt")
    public String getRelat_invnt(){
        return relat_invnt;
    }

    @ElVoField(physicalName = "relat_invnt")
    public void setRelat_invnt(String relat_invnt){
        this.relat_invnt = relat_invnt;
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

    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }

    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public String getSmitapp_occr_clsf(){
        return smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf")
    public void setSmitapp_occr_clsf(String smitapp_occr_clsf){
        this.smitapp_occr_clsf = smitapp_occr_clsf;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public String getRelat_dom_smitapp_no(){
        return relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public void setRelat_dom_smitapp_no(String relat_dom_smitapp_no){
        this.relat_dom_smitapp_no = relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "eval_act_yn")
    public String getEval_act_yn(){
        return eval_act_yn;
    }

    @ElVoField(physicalName = "eval_act_yn")
    public void setEval_act_yn(String eval_act_yn){
        this.eval_act_yn = eval_act_yn;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
    }

    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }

    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "smitapp_complt_psn")
    public String getSmitapp_complt_psn(){
        return smitapp_complt_psn;
    }

    @ElVoField(physicalName = "smitapp_complt_psn")
    public void setSmitapp_complt_psn(String smitapp_complt_psn){
        this.smitapp_complt_psn = smitapp_complt_psn;
    }

    @ElVoField(physicalName = "smitapp_complt_empno")
    public String getSmitapp_complt_empno(){
        return smitapp_complt_empno;
    }

    @ElVoField(physicalName = "smitapp_complt_empno")
    public void setSmitapp_complt_empno(String smitapp_complt_empno){
        this.smitapp_complt_empno = smitapp_complt_empno;
    }

    @ElVoField(physicalName = "smitapp_complt_nm")
    public String getSmitapp_complt_nm(){
        return smitapp_complt_nm;
    }

    @ElVoField(physicalName = "smitapp_complt_nm")
    public void setSmitapp_complt_nm(String smitapp_complt_nm){
        this.smitapp_complt_nm = smitapp_complt_nm;
    }

    @ElVoField(physicalName = "smitapp_complt_ymd")
    public String getSmitapp_complt_ymd(){
        return smitapp_complt_ymd;
    }

    @ElVoField(physicalName = "smitapp_complt_ymd")
    public void setSmitapp_complt_ymd(String smitapp_complt_ymd){
        this.smitapp_complt_ymd = smitapp_complt_ymd;
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

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public String getSmitapp_reg_ymd(){
        return smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_reg_ymd")
    public void setSmitapp_reg_ymd(String smitapp_reg_ymd){
        this.smitapp_reg_ymd = smitapp_reg_ymd;
    }

    @ElVoField(physicalName = "smitapp_way")
    public String getSmitapp_way(){
        return smitapp_way;
    }

    @ElVoField(physicalName = "smitapp_way")
    public void setSmitapp_way(String smitapp_way){
        this.smitapp_way = smitapp_way;
    }

    @ElVoField(physicalName = "smitapp_way_nm")
    public String getSmitapp_way_nm(){
        return smitapp_way_nm;
    }

    @ElVoField(physicalName = "smitapp_way_nm")
    public void setSmitapp_way_nm(String smitapp_way_nm){
        this.smitapp_way_nm = smitapp_way_nm;
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

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public String getSmitapp_occr_clsf_nm(){
        return smitapp_occr_clsf_nm;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public void setSmitapp_occr_clsf_nm(String smitapp_occr_clsf_nm){
        this.smitapp_occr_clsf_nm = smitapp_occr_clsf_nm;
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

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }

    @ElVoField(physicalName = "ipc_01")
    public String getIpc_01(){
        return ipc_01;
    }

    @ElVoField(physicalName = "ipc_01")
    public void setIpc_01(String ipc_01){
        this.ipc_01 = ipc_01;
    }

    @ElVoField(physicalName = "ipc_01_01")
    public String getIpc_01_01(){
        return ipc_01_01;
    }

    @ElVoField(physicalName = "ipc_01_01")
    public void setIpc_01_01(String ipc_01_01){
        this.ipc_01_01 = ipc_01_01;
    }

    @ElVoField(physicalName = "ipc_01_02")
    public String getIpc_01_02(){
        return ipc_01_02;
    }

    @ElVoField(physicalName = "ipc_01_02")
    public void setIpc_01_02(String ipc_01_02){
        this.ipc_01_02 = ipc_01_02;
    }

    @ElVoField(physicalName = "ipc_01_03")
    public String getIpc_01_03(){
        return ipc_01_03;
    }

    @ElVoField(physicalName = "ipc_01_03")
    public void setIpc_01_03(String ipc_01_03){
        this.ipc_01_03 = ipc_01_03;
    }

    @ElVoField(physicalName = "ipc_01_04")
    public String getIpc_01_04(){
        return ipc_01_04;
    }

    @ElVoField(physicalName = "ipc_01_04")
    public void setIpc_01_04(String ipc_01_04){
        this.ipc_01_04 = ipc_01_04;
    }

    @ElVoField(physicalName = "ipc_02")
    public String getIpc_02(){
        return ipc_02;
    }

    @ElVoField(physicalName = "ipc_02")
    public void setIpc_02(String ipc_02){
        this.ipc_02 = ipc_02;
    }

    @ElVoField(physicalName = "ipc_02_01")
    public String getIpc_02_01(){
        return ipc_02_01;
    }

    @ElVoField(physicalName = "ipc_02_01")
    public void setIpc_02_01(String ipc_02_01){
        this.ipc_02_01 = ipc_02_01;
    }

    @ElVoField(physicalName = "ipc_02_02")
    public String getIpc_02_02(){
        return ipc_02_02;
    }

    @ElVoField(physicalName = "ipc_02_02")
    public void setIpc_02_02(String ipc_02_02){
        this.ipc_02_02 = ipc_02_02;
    }

    @ElVoField(physicalName = "ipc_02_03")
    public String getIpc_02_03(){
        return ipc_02_03;
    }

    @ElVoField(physicalName = "ipc_02_03")
    public void setIpc_02_03(String ipc_02_03){
        this.ipc_02_03 = ipc_02_03;
    }

    @ElVoField(physicalName = "ipc_02_04")
    public String getIpc_02_04(){
        return ipc_02_04;
    }

    @ElVoField(physicalName = "ipc_02_04")
    public void setIpc_02_04(String ipc_02_04){
        this.ipc_02_04 = ipc_02_04;
    }

    @ElVoField(physicalName = "ipc_03")
    public String getIpc_03(){
        return ipc_03;
    }

    @ElVoField(physicalName = "ipc_03")
    public void setIpc_03(String ipc_03){
        this.ipc_03 = ipc_03;
    }

    @ElVoField(physicalName = "ipc_03_01")
    public String getIpc_03_01(){
        return ipc_03_01;
    }

    @ElVoField(physicalName = "ipc_03_01")
    public void setIpc_03_01(String ipc_03_01){
        this.ipc_03_01 = ipc_03_01;
    }

    @ElVoField(physicalName = "ipc_03_02")
    public String getIpc_03_02(){
        return ipc_03_02;
    }

    @ElVoField(physicalName = "ipc_03_02")
    public void setIpc_03_02(String ipc_03_02){
        this.ipc_03_02 = ipc_03_02;
    }

    @ElVoField(physicalName = "ipc_03_03")
    public String getIpc_03_03(){
        return ipc_03_03;
    }

    @ElVoField(physicalName = "ipc_03_03")
    public void setIpc_03_03(String ipc_03_03){
        this.ipc_03_03 = ipc_03_03;
    }

    @ElVoField(physicalName = "ipc_03_04")
    public String getIpc_03_04(){
        return ipc_03_04;
    }

    @ElVoField(physicalName = "ipc_03_04")
    public void setIpc_03_04(String ipc_03_04){
        this.ipc_03_04 = ipc_03_04;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public String getExam_reflect_clsf(){
        return exam_reflect_clsf;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public void setExam_reflect_clsf(String exam_reflect_clsf){
        this.exam_reflect_clsf = exam_reflect_clsf;
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

    @ElVoField(physicalName = "right_mnt_final_seq")
    public String getRight_mnt_final_seq(){
        return right_mnt_final_seq;
    }

    @ElVoField(physicalName = "right_mnt_final_seq")
    public void setRight_mnt_final_seq(String right_mnt_final_seq){
        this.right_mnt_final_seq = right_mnt_final_seq;
    }

    @ElVoField(physicalName = "oversapp_hope_ex")
    public String getOversapp_hope_ex(){
        return oversapp_hope_ex;
    }

    @ElVoField(physicalName = "oversapp_hope_ex")
    public void setOversapp_hope_ex(String oversapp_hope_ex){
        this.oversapp_hope_ex = oversapp_hope_ex;
    }

    @ElVoField(physicalName = "open_no")
    public String getOpen_no(){
        return open_no;
    }

    @ElVoField(physicalName = "open_no")
    public void setOpen_no(String open_no){
        this.open_no = open_no;
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

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "prityrgt_wdrw_ymd")
    public String getPrityrgt_wdrw_ymd(){
        return prityrgt_wdrw_ymd;
    }

    @ElVoField(physicalName = "prityrgt_wdrw_ymd")
    public void setPrityrgt_wdrw_ymd(String prityrgt_wdrw_ymd){
        this.prityrgt_wdrw_ymd = prityrgt_wdrw_ymd;
    }

    @ElVoField(physicalName = "pre_tech_wrt_invst")
    public String getPre_tech_wrt_invst(){
        return pre_tech_wrt_invst;
    }

    @ElVoField(physicalName = "pre_tech_wrt_invst")
    public void setPre_tech_wrt_invst(String pre_tech_wrt_invst){
        this.pre_tech_wrt_invst = pre_tech_wrt_invst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatMastrVo [");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("invnt_clsf").append("=").append(invnt_clsf).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("invnt_eng_nm").append("=").append(invnt_eng_nm).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("patofic_contac_loc").append("=").append(patofic_contac_loc).append(",");
        sb.append("pct_chk").append("=").append(pct_chk).append(",");
        sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
        sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
        sb.append("pat_grd").append("=").append(pat_grd).append(",");
        sb.append("grd_resn").append("=").append(grd_resn).append(",");
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
        sb.append("old_data_mngmt_no").append("=").append(old_data_mngmt_no).append(",");
        sb.append("attach_file_no_1").append("=").append(attach_file_no_1).append(",");
        sb.append("attach_file_no_2").append("=").append(attach_file_no_2).append(",");
        sb.append("attach_file_no_3").append("=").append(attach_file_no_3).append(",");
        sb.append("attach_file_no_4").append("=").append(attach_file_no_4).append(",");
        sb.append("tech_field").append("=").append(tech_field).append(",");
        sb.append("indst_use_clsf").append("=").append(indst_use_clsf).append(",");
        sb.append("solve_task").append("=").append(solve_task).append(",");
        sb.append("invnt_efct").append("=").append(invnt_efct).append(",");
        sb.append("relat_invnt").append("=").append(relat_invnt).append(",");
        sb.append("plan_attach_file_no").append("=").append(plan_attach_file_no).append(",");
        sb.append("open_attach_file_no").append("=").append(open_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
        sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
        sb.append("smitapp_occr_clsf").append("=").append(smitapp_occr_clsf).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("eval_act_yn").append("=").append(eval_act_yn).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("interview_yn").append("=").append(interview_yn).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("smitapp_complt_psn").append("=").append(smitapp_complt_psn).append(",");
        sb.append("smitapp_complt_empno").append("=").append(smitapp_complt_empno).append(",");
        sb.append("smitapp_complt_nm").append("=").append(smitapp_complt_nm).append(",");
        sb.append("smitapp_complt_ymd").append("=").append(smitapp_complt_ymd).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("smitapp_reg_ymd").append("=").append(smitapp_reg_ymd).append(",");
        sb.append("smitapp_way").append("=").append(smitapp_way).append(",");
        sb.append("smitapp_way_nm").append("=").append(smitapp_way_nm).append(",");
        sb.append("intrn_smitapp_no").append("=").append(intrn_smitapp_no).append(",");
        sb.append("intrn_smitapp_ymd").append("=").append(intrn_smitapp_ymd).append(",");
        sb.append("smitapp_occr_clsf_nm").append("=").append(smitapp_occr_clsf_nm).append(",");
        sb.append("smitapp_krn_nm").append("=").append(smitapp_krn_nm).append(",");
        sb.append("smitapp_eng_nm").append("=").append(smitapp_eng_nm).append(",");
        sb.append("prityrgt_main_rspns_no").append("=").append(prityrgt_main_rspns_no).append(",");
        sb.append("prityrgt_main_rspns_ymd").append("=").append(prityrgt_main_rspns_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
        sb.append("ipc_01").append("=").append(ipc_01).append(",");
        sb.append("ipc_01_01").append("=").append(ipc_01_01).append(",");
        sb.append("ipc_01_02").append("=").append(ipc_01_02).append(",");
        sb.append("ipc_01_03").append("=").append(ipc_01_03).append(",");
        sb.append("ipc_01_04").append("=").append(ipc_01_04).append(",");
        sb.append("ipc_02").append("=").append(ipc_02).append(",");
        sb.append("ipc_02_01").append("=").append(ipc_02_01).append(",");
        sb.append("ipc_02_02").append("=").append(ipc_02_02).append(",");
        sb.append("ipc_02_03").append("=").append(ipc_02_03).append(",");
        sb.append("ipc_02_04").append("=").append(ipc_02_04).append(",");
        sb.append("ipc_03").append("=").append(ipc_03).append(",");
        sb.append("ipc_03_01").append("=").append(ipc_03_01).append(",");
        sb.append("ipc_03_02").append("=").append(ipc_03_02).append(",");
        sb.append("ipc_03_03").append("=").append(ipc_03_03).append(",");
        sb.append("ipc_03_04").append("=").append(ipc_03_04).append(",");
        sb.append("exam_reflect_clsf").append("=").append(exam_reflect_clsf).append(",");
        sb.append("detls_krn_nm").append("=").append(detls_krn_nm).append(",");
        sb.append("detls_eng_nm").append("=").append(detls_eng_nm).append(",");
        sb.append("regst_krn_nm").append("=").append(regst_krn_nm).append(",");
        sb.append("regst_eng_nm").append("=").append(regst_eng_nm).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("regst_reg_ymd").append("=").append(regst_reg_ymd).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("right_mnt_final_seq").append("=").append(right_mnt_final_seq).append(",");
        sb.append("oversapp_hope_ex").append("=").append(oversapp_hope_ex).append(",");
        sb.append("open_no").append("=").append(open_no).append(",");
        sb.append("open_ex").append("=").append(open_ex).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("open_contnt").append("=").append(open_contnt).append(",");
        sb.append("ely_open_ex").append("=").append(ely_open_ex).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex).append(",");
        sb.append("prity_eval_ex").append("=").append(prity_eval_ex).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("prityrgt_wdrw_ymd").append("=").append(prityrgt_wdrw_ymd).append(",");
        sb.append("pre_tech_wrt_invst").append("=").append(pre_tech_wrt_invst);
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
