package kr.re.kitech.biz.epu.bid.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술평가요청 정보")
public class EpuBidTechEvalInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuBidTechEvalInfoVo(){
    }

    @ElDtoField(logicalName = "inout_psn_clsf_cd", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "pur_clsf_cd", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "bid_noti_no", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "bid_ord_no", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "bid_title", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "chg_no", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "pur_req_no", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "open_ymd", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "eval_state", physicalName = "eval_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_state;

    @ElDtoField(logicalName = "eval_state_text", physicalName = "eval_state_text", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_state_text;

    @ElDtoField(logicalName = "bid_val_score", physicalName = "bid_val_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_val_score;

    @ElDtoField(logicalName = "eval_clsf_cd", physicalName = "eval_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_clsf_cd;

    @ElDtoField(logicalName = "eval_clsf_cd_text", physicalName = "eval_clsf_cd_text", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_clsf_cd_text;

    @ElDtoField(logicalName = "ord_chg_no", physicalName = "ord_chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord_chg_no;

    @ElDtoField(logicalName = "partcode", physicalName = "partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String partcode;

    @ElDtoField(logicalName = "progress_status", physicalName = "progress_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress_status;

    @ElDtoField(logicalName = "assist_yn", physicalName = "assist_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String assist_yn;

    @ElDtoField(logicalName = "assist_charger_cd", physicalName = "assist_charger_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String assist_charger_cd;

    @ElDtoField(logicalName = "assist_charger_nm", physicalName = "assist_charger_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String assist_charger_nm;

    @ElDtoField(logicalName = "tech_eval_doc_no", physicalName = "tech_eval_doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_doc_no;

    @ElDtoField(logicalName = "tech_eval_assist_doc_no", physicalName = "tech_eval_assist_doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_eval_assist_doc_no;

    @ElDtoField(logicalName = "tech_nego_yn_cd", physicalName = "tech_nego_yn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_nego_yn_cd;

    @ElDtoField(logicalName = "sys_pay_no", physicalName = "sys_pay_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_pay_no;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "bid_clsf_cd", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "charger_cd", physicalName = "charger_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charger_cd;

    @ElDtoField(logicalName = "charger_nm", physicalName = "charger_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charger_nm;

    @ElDtoField(logicalName = "pq_score", physicalName = "pq_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_score;

    @ElDtoField(logicalName = "eval_attach_file_no", physicalName = "eval_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_attach_file_no;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "endpoints_assist", physicalName = "endpoints_assist", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints_assist;

    @ElDtoField(logicalName = "noti_progress_status", physicalName = "noti_progress_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_progress_status;

    @ElDtoField(logicalName = "org_bid_ord_no", physicalName = "org_bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_bid_ord_no;

    @ElDtoField(logicalName = "org_chg_no", physicalName = "org_chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_chg_no;

    @ElDtoField(logicalName = "eval_assist_attach_file_no", physicalName = "eval_assist_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_assist_attach_file_no;

    @ElDtoField(logicalName = "charge_nm", physicalName = "charge_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charge_nm;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "renoti_after_yn", physicalName = "renoti_after_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String renoti_after_yn;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElDtoField(logicalName = "vend_no", physicalName = "vend_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_no;

    @ElDtoField(logicalName = "bsns_psn_regst_no", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "vend_nm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "ceo_nm", physicalName = "ceo_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ceo_nm;

    @ElDtoField(logicalName = "tot_score", physicalName = "tot_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_score;

    @ElDtoField(logicalName = "succ_yn", physicalName = "succ_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_yn;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "new_odr", physicalName = "new_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String new_odr;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "approvalCheck", physicalName = "approvalCheck", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String approvalCheck;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "endpoint", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "open_ymd")
    public String getOpen_ymd(){
        return open_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public void setOpen_ymd(String open_ymd){
        this.open_ymd = open_ymd;
    }

    @ElVoField(physicalName = "eval_state")
    public String getEval_state(){
        return eval_state;
    }

    @ElVoField(physicalName = "eval_state")
    public void setEval_state(String eval_state){
        this.eval_state = eval_state;
    }

    @ElVoField(physicalName = "eval_state_text")
    public String getEval_state_text(){
        return eval_state_text;
    }

    @ElVoField(physicalName = "eval_state_text")
    public void setEval_state_text(String eval_state_text){
        this.eval_state_text = eval_state_text;
    }

    @ElVoField(physicalName = "bid_val_score")
    public String getBid_val_score(){
        return bid_val_score;
    }

    @ElVoField(physicalName = "bid_val_score")
    public void setBid_val_score(String bid_val_score){
        this.bid_val_score = bid_val_score;
    }

    @ElVoField(physicalName = "eval_clsf_cd")
    public String getEval_clsf_cd(){
        return eval_clsf_cd;
    }

    @ElVoField(physicalName = "eval_clsf_cd")
    public void setEval_clsf_cd(String eval_clsf_cd){
        this.eval_clsf_cd = eval_clsf_cd;
    }

    @ElVoField(physicalName = "eval_clsf_cd_text")
    public String getEval_clsf_cd_text(){
        return eval_clsf_cd_text;
    }

    @ElVoField(physicalName = "eval_clsf_cd_text")
    public void setEval_clsf_cd_text(String eval_clsf_cd_text){
        this.eval_clsf_cd_text = eval_clsf_cd_text;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public String getOrd_chg_no(){
        return ord_chg_no;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public void setOrd_chg_no(String ord_chg_no){
        this.ord_chg_no = ord_chg_no;
    }

    @ElVoField(physicalName = "partcode")
    public String getPartcode(){
        return partcode;
    }

    @ElVoField(physicalName = "partcode")
    public void setPartcode(String partcode){
        this.partcode = partcode;
    }

    @ElVoField(physicalName = "progress_status")
    public String getProgress_status(){
        return progress_status;
    }

    @ElVoField(physicalName = "progress_status")
    public void setProgress_status(String progress_status){
        this.progress_status = progress_status;
    }

    @ElVoField(physicalName = "assist_yn")
    public String getAssist_yn(){
        return assist_yn;
    }

    @ElVoField(physicalName = "assist_yn")
    public void setAssist_yn(String assist_yn){
        this.assist_yn = assist_yn;
    }

    @ElVoField(physicalName = "assist_charger_cd")
    public String getAssist_charger_cd(){
        return assist_charger_cd;
    }

    @ElVoField(physicalName = "assist_charger_cd")
    public void setAssist_charger_cd(String assist_charger_cd){
        this.assist_charger_cd = assist_charger_cd;
    }

    @ElVoField(physicalName = "assist_charger_nm")
    public String getAssist_charger_nm(){
        return assist_charger_nm;
    }

    @ElVoField(physicalName = "assist_charger_nm")
    public void setAssist_charger_nm(String assist_charger_nm){
        this.assist_charger_nm = assist_charger_nm;
    }

    @ElVoField(physicalName = "tech_eval_doc_no")
    public String getTech_eval_doc_no(){
        return tech_eval_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_doc_no")
    public void setTech_eval_doc_no(String tech_eval_doc_no){
        this.tech_eval_doc_no = tech_eval_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public String getTech_eval_assist_doc_no(){
        return tech_eval_assist_doc_no;
    }

    @ElVoField(physicalName = "tech_eval_assist_doc_no")
    public void setTech_eval_assist_doc_no(String tech_eval_assist_doc_no){
        this.tech_eval_assist_doc_no = tech_eval_assist_doc_no;
    }

    @ElVoField(physicalName = "tech_nego_yn_cd")
    public String getTech_nego_yn_cd(){
        return tech_nego_yn_cd;
    }

    @ElVoField(physicalName = "tech_nego_yn_cd")
    public void setTech_nego_yn_cd(String tech_nego_yn_cd){
        this.tech_nego_yn_cd = tech_nego_yn_cd;
    }

    @ElVoField(physicalName = "sys_pay_no")
    public String getSys_pay_no(){
        return sys_pay_no;
    }

    @ElVoField(physicalName = "sys_pay_no")
    public void setSys_pay_no(String sys_pay_no){
        this.sys_pay_no = sys_pay_no;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "charger_cd")
    public String getCharger_cd(){
        return charger_cd;
    }

    @ElVoField(physicalName = "charger_cd")
    public void setCharger_cd(String charger_cd){
        this.charger_cd = charger_cd;
    }

    @ElVoField(physicalName = "charger_nm")
    public String getCharger_nm(){
        return charger_nm;
    }

    @ElVoField(physicalName = "charger_nm")
    public void setCharger_nm(String charger_nm){
        this.charger_nm = charger_nm;
    }

    @ElVoField(physicalName = "pq_score")
    public String getPq_score(){
        return pq_score;
    }

    @ElVoField(physicalName = "pq_score")
    public void setPq_score(String pq_score){
        this.pq_score = pq_score;
    }

    @ElVoField(physicalName = "eval_attach_file_no")
    public String getEval_attach_file_no(){
        return eval_attach_file_no;
    }

    @ElVoField(physicalName = "eval_attach_file_no")
    public void setEval_attach_file_no(String eval_attach_file_no){
        this.eval_attach_file_no = eval_attach_file_no;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "endpoints_assist")
    public String getEndpoints_assist(){
        return endpoints_assist;
    }

    @ElVoField(physicalName = "endpoints_assist")
    public void setEndpoints_assist(String endpoints_assist){
        this.endpoints_assist = endpoints_assist;
    }

    @ElVoField(physicalName = "noti_progress_status")
    public String getNoti_progress_status(){
        return noti_progress_status;
    }

    @ElVoField(physicalName = "noti_progress_status")
    public void setNoti_progress_status(String noti_progress_status){
        this.noti_progress_status = noti_progress_status;
    }

    @ElVoField(physicalName = "org_bid_ord_no")
    public String getOrg_bid_ord_no(){
        return org_bid_ord_no;
    }

    @ElVoField(physicalName = "org_bid_ord_no")
    public void setOrg_bid_ord_no(String org_bid_ord_no){
        this.org_bid_ord_no = org_bid_ord_no;
    }

    @ElVoField(physicalName = "org_chg_no")
    public String getOrg_chg_no(){
        return org_chg_no;
    }

    @ElVoField(physicalName = "org_chg_no")
    public void setOrg_chg_no(String org_chg_no){
        this.org_chg_no = org_chg_no;
    }

    @ElVoField(physicalName = "eval_assist_attach_file_no")
    public String getEval_assist_attach_file_no(){
        return eval_assist_attach_file_no;
    }

    @ElVoField(physicalName = "eval_assist_attach_file_no")
    public void setEval_assist_attach_file_no(String eval_assist_attach_file_no){
        this.eval_assist_attach_file_no = eval_assist_attach_file_no;
    }

    @ElVoField(physicalName = "charge_nm")
    public String getCharge_nm(){
        return charge_nm;
    }

    @ElVoField(physicalName = "charge_nm")
    public void setCharge_nm(String charge_nm){
        this.charge_nm = charge_nm;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "renoti_after_yn")
    public String getRenoti_after_yn(){
        return renoti_after_yn;
    }

    @ElVoField(physicalName = "renoti_after_yn")
    public void setRenoti_after_yn(String renoti_after_yn){
        this.renoti_after_yn = renoti_after_yn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "vend_no")
    public String getVend_no(){
        return vend_no;
    }

    @ElVoField(physicalName = "vend_no")
    public void setVend_no(String vend_no){
        this.vend_no = vend_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "ceo_nm")
    public String getCeo_nm(){
        return ceo_nm;
    }

    @ElVoField(physicalName = "ceo_nm")
    public void setCeo_nm(String ceo_nm){
        this.ceo_nm = ceo_nm;
    }

    @ElVoField(physicalName = "tot_score")
    public String getTot_score(){
        return tot_score;
    }

    @ElVoField(physicalName = "tot_score")
    public void setTot_score(String tot_score){
        this.tot_score = tot_score;
    }

    @ElVoField(physicalName = "succ_yn")
    public String getSucc_yn(){
        return succ_yn;
    }

    @ElVoField(physicalName = "succ_yn")
    public void setSucc_yn(String succ_yn){
        this.succ_yn = succ_yn;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "new_odr")
    public String getNew_odr(){
        return new_odr;
    }

    @ElVoField(physicalName = "new_odr")
    public void setNew_odr(String new_odr){
        this.new_odr = new_odr;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "approvalCheck")
    public String getApprovalCheck(){
        return approvalCheck;
    }

    @ElVoField(physicalName = "approvalCheck")
    public void setApprovalCheck(String approvalCheck){
        this.approvalCheck = approvalCheck;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuBidTechEvalInfoVo [");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("eval_state").append("=").append(eval_state).append(",");
        sb.append("eval_state_text").append("=").append(eval_state_text).append(",");
        sb.append("bid_val_score").append("=").append(bid_val_score).append(",");
        sb.append("eval_clsf_cd").append("=").append(eval_clsf_cd).append(",");
        sb.append("eval_clsf_cd_text").append("=").append(eval_clsf_cd_text).append(",");
        sb.append("ord_chg_no").append("=").append(ord_chg_no).append(",");
        sb.append("partcode").append("=").append(partcode).append(",");
        sb.append("progress_status").append("=").append(progress_status).append(",");
        sb.append("assist_yn").append("=").append(assist_yn).append(",");
        sb.append("assist_charger_cd").append("=").append(assist_charger_cd).append(",");
        sb.append("assist_charger_nm").append("=").append(assist_charger_nm).append(",");
        sb.append("tech_eval_doc_no").append("=").append(tech_eval_doc_no).append(",");
        sb.append("tech_eval_assist_doc_no").append("=").append(tech_eval_assist_doc_no).append(",");
        sb.append("tech_nego_yn_cd").append("=").append(tech_nego_yn_cd).append(",");
        sb.append("sys_pay_no").append("=").append(sys_pay_no).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("charger_cd").append("=").append(charger_cd).append(",");
        sb.append("charger_nm").append("=").append(charger_nm).append(",");
        sb.append("pq_score").append("=").append(pq_score).append(",");
        sb.append("eval_attach_file_no").append("=").append(eval_attach_file_no).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("endpoints_assist").append("=").append(endpoints_assist).append(",");
        sb.append("noti_progress_status").append("=").append(noti_progress_status).append(",");
        sb.append("org_bid_ord_no").append("=").append(org_bid_ord_no).append(",");
        sb.append("org_chg_no").append("=").append(org_chg_no).append(",");
        sb.append("eval_assist_attach_file_no").append("=").append(eval_assist_attach_file_no).append(",");
        sb.append("charge_nm").append("=").append(charge_nm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("renoti_after_yn").append("=").append(renoti_after_yn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("vend_no").append("=").append(vend_no).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("ceo_nm").append("=").append(ceo_nm).append(",");
        sb.append("tot_score").append("=").append(tot_score).append(",");
        sb.append("succ_yn").append("=").append(succ_yn).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("new_odr").append("=").append(new_odr).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("approvalCheck").append("=").append(approvalCheck).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("endpoint").append("=").append(endpoint);
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
