package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatQnaExp")
public class PatQnaVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatQnaVo(){
    }

    @ElDtoField(logicalName = "qna_id", physicalName = "qna_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qna_id;

    @ElDtoField(logicalName = "quest_psn_syspayno", physicalName = "quest_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_psn_syspayno;

    @ElDtoField(logicalName = "quest_daytm", physicalName = "quest_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_daytm;

    @ElDtoField(logicalName = "quest_psn_syspaynm", physicalName = "quest_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_psn_syspaynm;

    @ElDtoField(logicalName = "quest_title", physicalName = "quest_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_title;

    @ElDtoField(logicalName = "quest_comment", physicalName = "quest_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_comment;

    @ElDtoField(logicalName = "quest_attach_file", physicalName = "quest_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String quest_attach_file;

    @ElDtoField(logicalName = "answer_ex", physicalName = "answer_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_ex;

    @ElDtoField(logicalName = "wri_psn_syspaynm", physicalName = "wri_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_psn_syspaynm;

    @ElDtoField(logicalName = "answer_psn_syspaynm", physicalName = "answer_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_psn_syspaynm;

    @ElDtoField(logicalName = "answer_psn_syspayno", physicalName = "answer_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_psn_syspayno;

    @ElDtoField(logicalName = "answer_daytm", physicalName = "answer_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_daytm;

    @ElDtoField(logicalName = "answer_title", physicalName = "answer_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_title;

    @ElDtoField(logicalName = "answer_comment", physicalName = "answer_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_comment;

    @ElDtoField(logicalName = "answer_attach_file", physicalName = "answer_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_attach_file;

    @ElDtoField(logicalName = "regst_syapayno", physicalName = "regst_syapayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syapayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updt_syapayno", physicalName = "updt_syapayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syapayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "del_yn", physicalName = "del_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String del_yn;

    @ElDtoField(logicalName = "send_clsf", physicalName = "send_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_clsf;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "send_clsf_stat", physicalName = "send_clsf_stat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_clsf_stat;

    @ElDtoField(logicalName = "answer_ex_stat", physicalName = "answer_ex_stat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String answer_ex_stat;

    @ElDtoField(logicalName = "patofic_cd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patofic_nm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "contac_loc", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "start_daytm", physicalName = "start_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_daytm;

    @ElDtoField(logicalName = "end_daytm", physicalName = "end_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_daytm;

    @ElDtoField(logicalName = "patofic_charg_id", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "patofic_charg_nm", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "req_time", physicalName = "req_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_time;

    @ElDtoField(logicalName = "complt_demnd_ymd", physicalName = "complt_demnd_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd;

    @ElDtoField(logicalName = "complt_demnd_time", physicalName = "complt_demnd_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_time;

    @ElDtoField(logicalName = "req_sys", physicalName = "req_sys", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_sys;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "req_dept", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "req_subj", physicalName = "req_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_subj;

    @ElDtoField(logicalName = "progrss_state", physicalName = "progrss_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progrss_state;

    @ElDtoField(logicalName = "CUMode", physicalName = "CUMode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String CUMode;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "relat_menu_nm", physicalName = "relat_menu_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_menu_nm;

    @ElDtoField(logicalName = "req_kind", physicalName = "req_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_kind;

    @ElDtoField(logicalName = "req_contnt", physicalName = "req_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_contnt;

    @ElDtoField(logicalName = "relat_menu_id", physicalName = "relat_menu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_menu_id;

    @ElDtoField(logicalName = "demnd_item_mngmt_no", physicalName = "demnd_item_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_item_mngmt_no;

    @ElDtoField(logicalName = "req_bizwrk", physicalName = "req_bizwrk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_bizwrk;

    @ElDtoField(logicalName = "req_base_clsf", physicalName = "req_base_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_base_clsf;

    @ElDtoField(logicalName = "req_objct_clsf", physicalName = "req_objct_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_objct_clsf;

    @ElDtoField(logicalName = "rcpt_psn_empno", physicalName = "rcpt_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno;

    @ElDtoField(logicalName = "infr_mgr_no", physicalName = "infr_mgr_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String infr_mgr_no;

    @ElDtoField(logicalName = "req_cause", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "req_base", physicalName = "req_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_base;

    @ElDtoField(logicalName = "expec_efct", physicalName = "expec_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct;

    @ElDtoField(logicalName = "expec_efct_selt", physicalName = "expec_efct_selt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_selt;

    @ElDtoField(logicalName = "rcpt_yn", physicalName = "rcpt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_yn;

    @ElDtoField(logicalName = "actn_plan", physicalName = "actn_plan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String actn_plan;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "elecapp_yn", physicalName = "elecapp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_yn;

    @ElDtoField(logicalName = "cause_analysis_yn", physicalName = "cause_analysis_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause_analysis_yn;

    @ElVoField(physicalName = "qna_id")
    public String getQna_id(){
        return qna_id;
    }

    @ElVoField(physicalName = "qna_id")
    public void setQna_id(String qna_id){
        this.qna_id = qna_id;
    }

    @ElVoField(physicalName = "quest_psn_syspayno")
    public String getQuest_psn_syspayno(){
        return quest_psn_syspayno;
    }

    @ElVoField(physicalName = "quest_psn_syspayno")
    public void setQuest_psn_syspayno(String quest_psn_syspayno){
        this.quest_psn_syspayno = quest_psn_syspayno;
    }

    @ElVoField(physicalName = "quest_daytm")
    public String getQuest_daytm(){
        return quest_daytm;
    }

    @ElVoField(physicalName = "quest_daytm")
    public void setQuest_daytm(String quest_daytm){
        this.quest_daytm = quest_daytm;
    }

    @ElVoField(physicalName = "quest_psn_syspaynm")
    public String getQuest_psn_syspaynm(){
        return quest_psn_syspaynm;
    }

    @ElVoField(physicalName = "quest_psn_syspaynm")
    public void setQuest_psn_syspaynm(String quest_psn_syspaynm){
        this.quest_psn_syspaynm = quest_psn_syspaynm;
    }

    @ElVoField(physicalName = "quest_title")
    public String getQuest_title(){
        return quest_title;
    }

    @ElVoField(physicalName = "quest_title")
    public void setQuest_title(String quest_title){
        this.quest_title = quest_title;
    }

    @ElVoField(physicalName = "quest_comment")
    public String getQuest_comment(){
        return quest_comment;
    }

    @ElVoField(physicalName = "quest_comment")
    public void setQuest_comment(String quest_comment){
        this.quest_comment = quest_comment;
    }

    @ElVoField(physicalName = "quest_attach_file")
    public String getQuest_attach_file(){
        return quest_attach_file;
    }

    @ElVoField(physicalName = "quest_attach_file")
    public void setQuest_attach_file(String quest_attach_file){
        this.quest_attach_file = quest_attach_file;
    }

    @ElVoField(physicalName = "answer_ex")
    public String getAnswer_ex(){
        return answer_ex;
    }

    @ElVoField(physicalName = "answer_ex")
    public void setAnswer_ex(String answer_ex){
        this.answer_ex = answer_ex;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public String getWri_psn_syspaynm(){
        return wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "wri_psn_syspaynm")
    public void setWri_psn_syspaynm(String wri_psn_syspaynm){
        this.wri_psn_syspaynm = wri_psn_syspaynm;
    }

    @ElVoField(physicalName = "answer_psn_syspaynm")
    public String getAnswer_psn_syspaynm(){
        return answer_psn_syspaynm;
    }

    @ElVoField(physicalName = "answer_psn_syspaynm")
    public void setAnswer_psn_syspaynm(String answer_psn_syspaynm){
        this.answer_psn_syspaynm = answer_psn_syspaynm;
    }

    @ElVoField(physicalName = "answer_psn_syspayno")
    public String getAnswer_psn_syspayno(){
        return answer_psn_syspayno;
    }

    @ElVoField(physicalName = "answer_psn_syspayno")
    public void setAnswer_psn_syspayno(String answer_psn_syspayno){
        this.answer_psn_syspayno = answer_psn_syspayno;
    }

    @ElVoField(physicalName = "answer_daytm")
    public String getAnswer_daytm(){
        return answer_daytm;
    }

    @ElVoField(physicalName = "answer_daytm")
    public void setAnswer_daytm(String answer_daytm){
        this.answer_daytm = answer_daytm;
    }

    @ElVoField(physicalName = "answer_title")
    public String getAnswer_title(){
        return answer_title;
    }

    @ElVoField(physicalName = "answer_title")
    public void setAnswer_title(String answer_title){
        this.answer_title = answer_title;
    }

    @ElVoField(physicalName = "answer_comment")
    public String getAnswer_comment(){
        return answer_comment;
    }

    @ElVoField(physicalName = "answer_comment")
    public void setAnswer_comment(String answer_comment){
        this.answer_comment = answer_comment;
    }

    @ElVoField(physicalName = "answer_attach_file")
    public String getAnswer_attach_file(){
        return answer_attach_file;
    }

    @ElVoField(physicalName = "answer_attach_file")
    public void setAnswer_attach_file(String answer_attach_file){
        this.answer_attach_file = answer_attach_file;
    }

    @ElVoField(physicalName = "regst_syapayno")
    public String getRegst_syapayno(){
        return regst_syapayno;
    }

    @ElVoField(physicalName = "regst_syapayno")
    public void setRegst_syapayno(String regst_syapayno){
        this.regst_syapayno = regst_syapayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syapayno")
    public String getUpdt_syapayno(){
        return updt_syapayno;
    }

    @ElVoField(physicalName = "updt_syapayno")
    public void setUpdt_syapayno(String updt_syapayno){
        this.updt_syapayno = updt_syapayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "del_yn")
    public String getDel_yn(){
        return del_yn;
    }

    @ElVoField(physicalName = "del_yn")
    public void setDel_yn(String del_yn){
        this.del_yn = del_yn;
    }

    @ElVoField(physicalName = "send_clsf")
    public String getSend_clsf(){
        return send_clsf;
    }

    @ElVoField(physicalName = "send_clsf")
    public void setSend_clsf(String send_clsf){
        this.send_clsf = send_clsf;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "send_clsf_stat")
    public String getSend_clsf_stat(){
        return send_clsf_stat;
    }

    @ElVoField(physicalName = "send_clsf_stat")
    public void setSend_clsf_stat(String send_clsf_stat){
        this.send_clsf_stat = send_clsf_stat;
    }

    @ElVoField(physicalName = "answer_ex_stat")
    public String getAnswer_ex_stat(){
        return answer_ex_stat;
    }

    @ElVoField(physicalName = "answer_ex_stat")
    public void setAnswer_ex_stat(String answer_ex_stat){
        this.answer_ex_stat = answer_ex_stat;
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

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_time")
    public String getReq_time(){
        return req_time;
    }

    @ElVoField(physicalName = "req_time")
    public void setReq_time(String req_time){
        this.req_time = req_time;
    }

    @ElVoField(physicalName = "complt_demnd_ymd")
    public String getComplt_demnd_ymd(){
        return complt_demnd_ymd;
    }

    @ElVoField(physicalName = "complt_demnd_ymd")
    public void setComplt_demnd_ymd(String complt_demnd_ymd){
        this.complt_demnd_ymd = complt_demnd_ymd;
    }

    @ElVoField(physicalName = "complt_demnd_time")
    public String getComplt_demnd_time(){
        return complt_demnd_time;
    }

    @ElVoField(physicalName = "complt_demnd_time")
    public void setComplt_demnd_time(String complt_demnd_time){
        this.complt_demnd_time = complt_demnd_time;
    }

    @ElVoField(physicalName = "req_sys")
    public String getReq_sys(){
        return req_sys;
    }

    @ElVoField(physicalName = "req_sys")
    public void setReq_sys(String req_sys){
        this.req_sys = req_sys;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "req_subj")
    public String getReq_subj(){
        return req_subj;
    }

    @ElVoField(physicalName = "req_subj")
    public void setReq_subj(String req_subj){
        this.req_subj = req_subj;
    }

    @ElVoField(physicalName = "progrss_state")
    public String getProgrss_state(){
        return progrss_state;
    }

    @ElVoField(physicalName = "progrss_state")
    public void setProgrss_state(String progrss_state){
        this.progrss_state = progrss_state;
    }

    @ElVoField(physicalName = "CUMode")
    public String getCUMode(){
        return CUMode;
    }

    @ElVoField(physicalName = "CUMode")
    public void setCUMode(String CUMode){
        this.CUMode = CUMode;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "relat_menu_nm")
    public String getRelat_menu_nm(){
        return relat_menu_nm;
    }

    @ElVoField(physicalName = "relat_menu_nm")
    public void setRelat_menu_nm(String relat_menu_nm){
        this.relat_menu_nm = relat_menu_nm;
    }

    @ElVoField(physicalName = "req_kind")
    public String getReq_kind(){
        return req_kind;
    }

    @ElVoField(physicalName = "req_kind")
    public void setReq_kind(String req_kind){
        this.req_kind = req_kind;
    }

    @ElVoField(physicalName = "req_contnt")
    public String getReq_contnt(){
        return req_contnt;
    }

    @ElVoField(physicalName = "req_contnt")
    public void setReq_contnt(String req_contnt){
        this.req_contnt = req_contnt;
    }

    @ElVoField(physicalName = "relat_menu_id")
    public String getRelat_menu_id(){
        return relat_menu_id;
    }

    @ElVoField(physicalName = "relat_menu_id")
    public void setRelat_menu_id(String relat_menu_id){
        this.relat_menu_id = relat_menu_id;
    }

    @ElVoField(physicalName = "demnd_item_mngmt_no")
    public String getDemnd_item_mngmt_no(){
        return demnd_item_mngmt_no;
    }

    @ElVoField(physicalName = "demnd_item_mngmt_no")
    public void setDemnd_item_mngmt_no(String demnd_item_mngmt_no){
        this.demnd_item_mngmt_no = demnd_item_mngmt_no;
    }

    @ElVoField(physicalName = "req_bizwrk")
    public String getReq_bizwrk(){
        return req_bizwrk;
    }

    @ElVoField(physicalName = "req_bizwrk")
    public void setReq_bizwrk(String req_bizwrk){
        this.req_bizwrk = req_bizwrk;
    }

    @ElVoField(physicalName = "req_base_clsf")
    public String getReq_base_clsf(){
        return req_base_clsf;
    }

    @ElVoField(physicalName = "req_base_clsf")
    public void setReq_base_clsf(String req_base_clsf){
        this.req_base_clsf = req_base_clsf;
    }

    @ElVoField(physicalName = "req_objct_clsf")
    public String getReq_objct_clsf(){
        return req_objct_clsf;
    }

    @ElVoField(physicalName = "req_objct_clsf")
    public void setReq_objct_clsf(String req_objct_clsf){
        this.req_objct_clsf = req_objct_clsf;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public String getRcpt_psn_empno(){
        return rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public void setRcpt_psn_empno(String rcpt_psn_empno){
        this.rcpt_psn_empno = rcpt_psn_empno;
    }

    @ElVoField(physicalName = "infr_mgr_no")
    public String getInfr_mgr_no(){
        return infr_mgr_no;
    }

    @ElVoField(physicalName = "infr_mgr_no")
    public void setInfr_mgr_no(String infr_mgr_no){
        this.infr_mgr_no = infr_mgr_no;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "req_base")
    public String getReq_base(){
        return req_base;
    }

    @ElVoField(physicalName = "req_base")
    public void setReq_base(String req_base){
        this.req_base = req_base;
    }

    @ElVoField(physicalName = "expec_efct")
    public String getExpec_efct(){
        return expec_efct;
    }

    @ElVoField(physicalName = "expec_efct")
    public void setExpec_efct(String expec_efct){
        this.expec_efct = expec_efct;
    }

    @ElVoField(physicalName = "expec_efct_selt")
    public String getExpec_efct_selt(){
        return expec_efct_selt;
    }

    @ElVoField(physicalName = "expec_efct_selt")
    public void setExpec_efct_selt(String expec_efct_selt){
        this.expec_efct_selt = expec_efct_selt;
    }

    @ElVoField(physicalName = "rcpt_yn")
    public String getRcpt_yn(){
        return rcpt_yn;
    }

    @ElVoField(physicalName = "rcpt_yn")
    public void setRcpt_yn(String rcpt_yn){
        this.rcpt_yn = rcpt_yn;
    }

    @ElVoField(physicalName = "actn_plan")
    public String getActn_plan(){
        return actn_plan;
    }

    @ElVoField(physicalName = "actn_plan")
    public void setActn_plan(String actn_plan){
        this.actn_plan = actn_plan;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "elecapp_yn")
    public String getElecapp_yn(){
        return elecapp_yn;
    }

    @ElVoField(physicalName = "elecapp_yn")
    public void setElecapp_yn(String elecapp_yn){
        this.elecapp_yn = elecapp_yn;
    }

    @ElVoField(physicalName = "cause_analysis_yn")
    public String getCause_analysis_yn(){
        return cause_analysis_yn;
    }

    @ElVoField(physicalName = "cause_analysis_yn")
    public void setCause_analysis_yn(String cause_analysis_yn){
        this.cause_analysis_yn = cause_analysis_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatQnaVo [");
        sb.append("qna_id").append("=").append(qna_id).append(",");
        sb.append("quest_psn_syspayno").append("=").append(quest_psn_syspayno).append(",");
        sb.append("quest_daytm").append("=").append(quest_daytm).append(",");
        sb.append("quest_psn_syspaynm").append("=").append(quest_psn_syspaynm).append(",");
        sb.append("quest_title").append("=").append(quest_title).append(",");
        sb.append("quest_comment").append("=").append(quest_comment).append(",");
        sb.append("quest_attach_file").append("=").append(quest_attach_file).append(",");
        sb.append("answer_ex").append("=").append(answer_ex).append(",");
        sb.append("wri_psn_syspaynm").append("=").append(wri_psn_syspaynm).append(",");
        sb.append("answer_psn_syspaynm").append("=").append(answer_psn_syspaynm).append(",");
        sb.append("answer_psn_syspayno").append("=").append(answer_psn_syspayno).append(",");
        sb.append("answer_daytm").append("=").append(answer_daytm).append(",");
        sb.append("answer_title").append("=").append(answer_title).append(",");
        sb.append("answer_comment").append("=").append(answer_comment).append(",");
        sb.append("answer_attach_file").append("=").append(answer_attach_file).append(",");
        sb.append("regst_syapayno").append("=").append(regst_syapayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syapayno").append("=").append(updt_syapayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("del_yn").append("=").append(del_yn).append(",");
        sb.append("send_clsf").append("=").append(send_clsf).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("send_clsf_stat").append("=").append(send_clsf_stat).append(",");
        sb.append("answer_ex_stat").append("=").append(answer_ex_stat).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("start_daytm").append("=").append(start_daytm).append(",");
        sb.append("end_daytm").append("=").append(end_daytm).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_time").append("=").append(req_time).append(",");
        sb.append("complt_demnd_ymd").append("=").append(complt_demnd_ymd).append(",");
        sb.append("complt_demnd_time").append("=").append(complt_demnd_time).append(",");
        sb.append("req_sys").append("=").append(req_sys).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_subj").append("=").append(req_subj).append(",");
        sb.append("progrss_state").append("=").append(progrss_state).append(",");
        sb.append("CUMode").append("=").append(CUMode).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("relat_menu_nm").append("=").append(relat_menu_nm).append(",");
        sb.append("req_kind").append("=").append(req_kind).append(",");
        sb.append("req_contnt").append("=").append(req_contnt).append(",");
        sb.append("relat_menu_id").append("=").append(relat_menu_id).append(",");
        sb.append("demnd_item_mngmt_no").append("=").append(demnd_item_mngmt_no).append(",");
        sb.append("req_bizwrk").append("=").append(req_bizwrk).append(",");
        sb.append("req_base_clsf").append("=").append(req_base_clsf).append(",");
        sb.append("req_objct_clsf").append("=").append(req_objct_clsf).append(",");
        sb.append("rcpt_psn_empno").append("=").append(rcpt_psn_empno).append(",");
        sb.append("infr_mgr_no").append("=").append(infr_mgr_no).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("req_base").append("=").append(req_base).append(",");
        sb.append("expec_efct").append("=").append(expec_efct).append(",");
        sb.append("expec_efct_selt").append("=").append(expec_efct_selt).append(",");
        sb.append("rcpt_yn").append("=").append(rcpt_yn).append(",");
        sb.append("actn_plan").append("=").append(actn_plan).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("elecapp_yn").append("=").append(elecapp_yn).append(",");
        sb.append("cause_analysis_yn").append("=").append(cause_analysis_yn);
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
