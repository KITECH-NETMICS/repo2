package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발명신고서 Vo")
public class PatAppMastrVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatAppMastrVo(){
    }

    @ElDtoField(logicalName = "특허구분", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "특허구분명", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "발명구분", physicalName = "invnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf;

    @ElDtoField(logicalName = "국내해외구분", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "담당자", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "담당자개인번호", physicalName = "charg_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empno;

    @ElDtoField(logicalName = "담당자성명", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "발명국문명칭", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "인터뷰여부", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;

    @ElDtoField(logicalName = "특허설계지원사업 구분", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "PCT진입여부", physicalName = "pct_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_chk;

    @ElDtoField(logicalName = "출원희망국가코드", physicalName = "smitapp_hope_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_cd;

    @ElDtoField(logicalName = "출원희망국가명", physicalName = "smitapp_hope_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_nm;

    @ElDtoField(logicalName = "주발명자성명", physicalName = "invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_nm;

    @ElDtoField(logicalName = "진행코드", physicalName = "state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_cd;

    @ElDtoField(logicalName = "발명신고서거절사유", physicalName = "invnt_reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_resn;

    @ElDtoField(logicalName = "소유권구분", physicalName = "co_smitapp_ex_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex_cd;

    @ElDtoField(logicalName = "관련특허번호", physicalName = "relat_dom_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_dom_smitapp_no;

    @ElDtoField(logicalName = "출원번호", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "출원일자", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "발명영문명칭", physicalName = "invnt_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_eng_nm;

    @ElDtoField(logicalName = "기술적특징-상세한설명", physicalName = "trans_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_nm;

    @ElDtoField(logicalName = "기술적특징 - 배경기술", physicalName = "tech_field", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_field;

    @ElDtoField(logicalName = "기술적특징-관련특허", physicalName = "relat_invnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_invnt;

    @ElDtoField(logicalName = "기술적특징 - 산업상 이용분야", physicalName = "indst_use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_use_clsf;

    @ElDtoField(logicalName = "기술적특징 - 해결하고자 하는 과제", physicalName = "solve_task", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String solve_task;

    @ElDtoField(logicalName = "기술적특징 -  발명의 효과", physicalName = "invnt_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_efct;

    @ElDtoField(logicalName = "발명의 등급", physicalName = "pat_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd;

    @ElDtoField(logicalName = "발명등급 선택 이유", physicalName = "grd_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grd_resn;

    @ElDtoField(logicalName = "사전공개유무", physicalName = "bef_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bef_open_yn;

    @ElDtoField(logicalName = "희망특허사무소코드", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "특허사무소 명칭", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "특허사무소담당자", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "특허사무소담당자 성명", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "희망특허사무소연락처", physicalName = "patofic_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_contac_loc;

    @ElDtoField(logicalName = "임시저장일자", physicalName = "temp_storg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String temp_storg_ymd;

    @ElDtoField(logicalName = "확인요청일자", physicalName = "affir_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affir_req_ymd;

    @ElDtoField(logicalName = "발명기안일자", physicalName = "invnt_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_draft_ymd;

    @ElDtoField(logicalName = "발명결재완료일자", physicalName = "invnt_apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_apprvl_complt_ymd;

    @ElDtoField(logicalName = "발명부결일자", physicalName = "invnt_reject_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_ymd;

    @ElDtoField(logicalName = "발명작성시스템개인번호", physicalName = "invnt_wrte_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_wrte_syspayno;

    @ElDtoField(logicalName = "기술구분", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;

    @ElDtoField(logicalName = "pct사업화계획서", physicalName = "pct_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pct_attach_file_no;

    @ElDtoField(logicalName = "외부인양도증", physicalName = "out_deed_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_deed_attach_file_no;

    @ElDtoField(logicalName = "공동출원사유서", physicalName = "com_apply_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String com_apply_attach_file_no;

    @ElDtoField(logicalName = "1인 발명지분 소명서", physicalName = "one_invnt_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String one_invnt_attach_file_no;

    @ElDtoField(logicalName = "첨부파일(기술설명서)", physicalName = "attach_file_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_1;

    @ElDtoField(logicalName = "기술적특징 - 도면첨부", physicalName = "plan_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_attach_file_no;

    @ElDtoField(logicalName = "사전공개유무 첨부파일", physicalName = "open_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_attach_file_no;

    @ElDtoField(logicalName = "기타 파일첨부", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "위임담당자", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;

    @ElDtoField(logicalName = "위임담당자 개인번호", physicalName = "mandate_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_empno;

    @ElDtoField(logicalName = "위임담당자성명", physicalName = "mandate_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_nm;

    @ElDtoField(logicalName = "산업기술분류(대분류)", physicalName = "indst_tech_big_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_big_clsf;

    @ElDtoField(logicalName = "산업기술분류", physicalName = "indst_tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf;

    @ElDtoField(logicalName = "산업기술분류(소분류)", physicalName = "indst_tech_sml_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_sml_clsf;

    @ElDtoField(logicalName = "산업기술분류(소분류)", physicalName = "indst_tech_minor_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_minor_clsf;

    @ElDtoField(logicalName = "기술이전유무", physicalName = "trns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trns_yn;

    @ElDtoField(logicalName = "예상기술료", physicalName = "tech_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee;

    @ElDtoField(logicalName = "기술이전시기", physicalName = "trns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trns_ymd;

    @ElDtoField(logicalName = "TRL단계", physicalName = "trl_step_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trl_step_cd;

    @ElDtoField(logicalName = "TRL단계명", physicalName = "trl_step_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trl_step_nm;

    @ElDtoField(logicalName = "수요기업명", physicalName = "demand_vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demand_vend_nm;

    @ElDtoField(logicalName = "최초등록자성명", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "키워드1", physicalName = "kwd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_1;

    @ElDtoField(logicalName = "키워드2", physicalName = "kwd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_2;

    @ElDtoField(logicalName = "키워드3", physicalName = "kwd_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_3;

    @ElDtoField(logicalName = "키워드4", physicalName = "kwd_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_4;

    @ElDtoField(logicalName = "키워드5", physicalName = "kwd_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_5;

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
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

    @ElVoField(physicalName = "charg_empno")
    public String getCharg_empno(){
        return charg_empno;
    }

    @ElVoField(physicalName = "charg_empno")
    public void setCharg_empno(String charg_empno){
        this.charg_empno = charg_empno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }

    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
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

    @ElVoField(physicalName = "invnt_psn_nm")
    public String getInvnt_psn_nm(){
        return invnt_psn_nm;
    }

    @ElVoField(physicalName = "invnt_psn_nm")
    public void setInvnt_psn_nm(String invnt_psn_nm){
        this.invnt_psn_nm = invnt_psn_nm;
    }

    @ElVoField(physicalName = "state_cd")
    public String getState_cd(){
        return state_cd;
    }

    @ElVoField(physicalName = "state_cd")
    public void setState_cd(String state_cd){
        this.state_cd = state_cd;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public String getInvnt_reject_resn(){
        return invnt_reject_resn;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public void setInvnt_reject_resn(String invnt_reject_resn){
        this.invnt_reject_resn = invnt_reject_resn;
    }

    @ElVoField(physicalName = "co_smitapp_ex_cd")
    public String getCo_smitapp_ex_cd(){
        return co_smitapp_ex_cd;
    }

    @ElVoField(physicalName = "co_smitapp_ex_cd")
    public void setCo_smitapp_ex_cd(String co_smitapp_ex_cd){
        this.co_smitapp_ex_cd = co_smitapp_ex_cd;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public String getRelat_dom_smitapp_no(){
        return relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public void setRelat_dom_smitapp_no(String relat_dom_smitapp_no){
        this.relat_dom_smitapp_no = relat_dom_smitapp_no;
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

    @ElVoField(physicalName = "invnt_wrte_syspayno")
    public String getInvnt_wrte_syspayno(){
        return invnt_wrte_syspayno;
    }

    @ElVoField(physicalName = "invnt_wrte_syspayno")
    public void setInvnt_wrte_syspayno(String invnt_wrte_syspayno){
        this.invnt_wrte_syspayno = invnt_wrte_syspayno;
    }

    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }

    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
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

    @ElVoField(physicalName = "attach_file_no_1")
    public String getAttach_file_no_1(){
        return attach_file_no_1;
    }

    @ElVoField(physicalName = "attach_file_no_1")
    public void setAttach_file_no_1(String attach_file_no_1){
        this.attach_file_no_1 = attach_file_no_1;
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

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_empno")
    public String getMandate_psn_empno(){
        return mandate_psn_empno;
    }

    @ElVoField(physicalName = "mandate_psn_empno")
    public void setMandate_psn_empno(String mandate_psn_empno){
        this.mandate_psn_empno = mandate_psn_empno;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public String getMandate_psn_nm(){
        return mandate_psn_nm;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public void setMandate_psn_nm(String mandate_psn_nm){
        this.mandate_psn_nm = mandate_psn_nm;
    }

    @ElVoField(physicalName = "indst_tech_big_clsf")
    public String getIndst_tech_big_clsf(){
        return indst_tech_big_clsf;
    }

    @ElVoField(physicalName = "indst_tech_big_clsf")
    public void setIndst_tech_big_clsf(String indst_tech_big_clsf){
        this.indst_tech_big_clsf = indst_tech_big_clsf;
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

    @ElVoField(physicalName = "indst_tech_minor_clsf")
    public String getIndst_tech_minor_clsf(){
        return indst_tech_minor_clsf;
    }

    @ElVoField(physicalName = "indst_tech_minor_clsf")
    public void setIndst_tech_minor_clsf(String indst_tech_minor_clsf){
        this.indst_tech_minor_clsf = indst_tech_minor_clsf;
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

    @ElVoField(physicalName = "trl_step_cd")
    public String getTrl_step_cd(){
        return trl_step_cd;
    }

    @ElVoField(physicalName = "trl_step_cd")
    public void setTrl_step_cd(String trl_step_cd){
        this.trl_step_cd = trl_step_cd;
    }

    @ElVoField(physicalName = "trl_step_nm")
    public String getTrl_step_nm(){
        return trl_step_nm;
    }

    @ElVoField(physicalName = "trl_step_nm")
    public void setTrl_step_nm(String trl_step_nm){
        this.trl_step_nm = trl_step_nm;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public String getDemand_vend_nm(){
        return demand_vend_nm;
    }

    @ElVoField(physicalName = "demand_vend_nm")
    public void setDemand_vend_nm(String demand_vend_nm){
        this.demand_vend_nm = demand_vend_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "kwd_1")
    public String getKwd_1(){
        return kwd_1;
    }

    @ElVoField(physicalName = "kwd_1")
    public void setKwd_1(String kwd_1){
        this.kwd_1 = kwd_1;
    }

    @ElVoField(physicalName = "kwd_2")
    public String getKwd_2(){
        return kwd_2;
    }

    @ElVoField(physicalName = "kwd_2")
    public void setKwd_2(String kwd_2){
        this.kwd_2 = kwd_2;
    }

    @ElVoField(physicalName = "kwd_3")
    public String getKwd_3(){
        return kwd_3;
    }

    @ElVoField(physicalName = "kwd_3")
    public void setKwd_3(String kwd_3){
        this.kwd_3 = kwd_3;
    }

    @ElVoField(physicalName = "kwd_4")
    public String getKwd_4(){
        return kwd_4;
    }

    @ElVoField(physicalName = "kwd_4")
    public void setKwd_4(String kwd_4){
        this.kwd_4 = kwd_4;
    }

    @ElVoField(physicalName = "kwd_5")
    public String getKwd_5(){
        return kwd_5;
    }

    @ElVoField(physicalName = "kwd_5")
    public void setKwd_5(String kwd_5){
        this.kwd_5 = kwd_5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatAppMastrVo [");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("invnt_clsf").append("=").append(invnt_clsf).append(",");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_empno").append("=").append(charg_empno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("interview_yn").append("=").append(interview_yn).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("pct_chk").append("=").append(pct_chk).append(",");
        sb.append("smitapp_hope_natn_cd").append("=").append(smitapp_hope_natn_cd).append(",");
        sb.append("smitapp_hope_natn_nm").append("=").append(smitapp_hope_natn_nm).append(",");
        sb.append("invnt_psn_nm").append("=").append(invnt_psn_nm).append(",");
        sb.append("state_cd").append("=").append(state_cd).append(",");
        sb.append("invnt_reject_resn").append("=").append(invnt_reject_resn).append(",");
        sb.append("co_smitapp_ex_cd").append("=").append(co_smitapp_ex_cd).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("invnt_eng_nm").append("=").append(invnt_eng_nm).append(",");
        sb.append("trans_nm").append("=").append(trans_nm).append(",");
        sb.append("tech_field").append("=").append(tech_field).append(",");
        sb.append("relat_invnt").append("=").append(relat_invnt).append(",");
        sb.append("indst_use_clsf").append("=").append(indst_use_clsf).append(",");
        sb.append("solve_task").append("=").append(solve_task).append(",");
        sb.append("invnt_efct").append("=").append(invnt_efct).append(",");
        sb.append("pat_grd").append("=").append(pat_grd).append(",");
        sb.append("grd_resn").append("=").append(grd_resn).append(",");
        sb.append("bef_open_yn").append("=").append(bef_open_yn).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("patofic_contac_loc").append("=").append(patofic_contac_loc).append(",");
        sb.append("temp_storg_ymd").append("=").append(temp_storg_ymd).append(",");
        sb.append("affir_req_ymd").append("=").append(affir_req_ymd).append(",");
        sb.append("invnt_draft_ymd").append("=").append(invnt_draft_ymd).append(",");
        sb.append("invnt_apprvl_complt_ymd").append("=").append(invnt_apprvl_complt_ymd).append(",");
        sb.append("invnt_reject_ymd").append("=").append(invnt_reject_ymd).append(",");
        sb.append("invnt_wrte_syspayno").append("=").append(invnt_wrte_syspayno).append(",");
        sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
        sb.append("pct_attach_file_no").append("=").append(pct_attach_file_no).append(",");
        sb.append("out_deed_attach_file_no").append("=").append(out_deed_attach_file_no).append(",");
        sb.append("com_apply_attach_file_no").append("=").append(com_apply_attach_file_no).append(",");
        sb.append("one_invnt_attach_file_no").append("=").append(one_invnt_attach_file_no).append(",");
        sb.append("attach_file_no_1").append("=").append(attach_file_no_1).append(",");
        sb.append("plan_attach_file_no").append("=").append(plan_attach_file_no).append(",");
        sb.append("open_attach_file_no").append("=").append(open_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
        sb.append("mandate_psn_empno").append("=").append(mandate_psn_empno).append(",");
        sb.append("mandate_psn_nm").append("=").append(mandate_psn_nm).append(",");
        sb.append("indst_tech_big_clsf").append("=").append(indst_tech_big_clsf).append(",");
        sb.append("indst_tech_clsf").append("=").append(indst_tech_clsf).append(",");
        sb.append("indst_tech_sml_clsf").append("=").append(indst_tech_sml_clsf).append(",");
        sb.append("indst_tech_minor_clsf").append("=").append(indst_tech_minor_clsf).append(",");
        sb.append("trns_yn").append("=").append(trns_yn).append(",");
        sb.append("tech_fee").append("=").append(tech_fee).append(",");
        sb.append("trns_ymd").append("=").append(trns_ymd).append(",");
        sb.append("trl_step_cd").append("=").append(trl_step_cd).append(",");
        sb.append("trl_step_nm").append("=").append(trl_step_nm).append(",");
        sb.append("demand_vend_nm").append("=").append(demand_vend_nm).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("kwd_1").append("=").append(kwd_1).append(",");
        sb.append("kwd_2").append("=").append(kwd_2).append(",");
        sb.append("kwd_3").append("=").append(kwd_3).append(",");
        sb.append("kwd_4").append("=").append(kwd_4).append(",");
        sb.append("kwd_5").append("=").append(kwd_5);
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
