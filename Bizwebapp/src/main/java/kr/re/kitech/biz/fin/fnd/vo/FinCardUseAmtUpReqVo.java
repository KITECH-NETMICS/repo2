package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinCardUseAmtUpReqExp")
public class FinCardUseAmtUpReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCardUseAmtUpReqVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_dept_cd", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "req_posi_cd", physicalName = "req_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_cd;

    @ElDtoField(logicalName = "use_psn", physicalName = "use_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn;

    @ElDtoField(logicalName = "use_dept_cd", physicalName = "use_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_cd;

    @ElDtoField(logicalName = "use_posi_cd", physicalName = "use_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_posi_cd;

    @ElDtoField(logicalName = "card_no", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "req_dom_amt", physicalName = "req_dom_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dom_amt;

    @ElDtoField(logicalName = "req_over_amt", physicalName = "req_over_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_over_amt;

    @ElDtoField(logicalName = "str_ymd", physicalName = "str_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String str_ymd;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "attach_file_no1", physicalName = "attach_file_no1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no1;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "fr_req_ymd", physicalName = "fr_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fr_req_ymd;

    @ElDtoField(logicalName = "to_req_ymd", physicalName = "to_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_req_ymd;

    @ElDtoField(logicalName = "req_empno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "req_nm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "req_posi_nm", physicalName = "req_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_nm;

    @ElDtoField(logicalName = "use_empno", physicalName = "use_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_empno;

    @ElDtoField(logicalName = "use_syspayno", physicalName = "use_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_syspayno;

    @ElDtoField(logicalName = "use_mobile", physicalName = "use_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_mobile;

    @ElDtoField(logicalName = "use_nm", physicalName = "use_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_nm;

    @ElDtoField(logicalName = "use_dept_nm", physicalName = "use_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_nm;

    @ElDtoField(logicalName = "use_posi_nm", physicalName = "use_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_posi_nm;

    @ElDtoField(logicalName = "req_term", physicalName = "req_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_term;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "cud_flag", physicalName = "cud_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_flag;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_posi_cd")
    public String getReq_posi_cd(){
        return req_posi_cd;
    }

    @ElVoField(physicalName = "req_posi_cd")
    public void setReq_posi_cd(String req_posi_cd){
        this.req_posi_cd = req_posi_cd;
    }

    @ElVoField(physicalName = "use_psn")
    public String getUse_psn(){
        return use_psn;
    }

    @ElVoField(physicalName = "use_psn")
    public void setUse_psn(String use_psn){
        this.use_psn = use_psn;
    }

    @ElVoField(physicalName = "use_dept_cd")
    public String getUse_dept_cd(){
        return use_dept_cd;
    }

    @ElVoField(physicalName = "use_dept_cd")
    public void setUse_dept_cd(String use_dept_cd){
        this.use_dept_cd = use_dept_cd;
    }

    @ElVoField(physicalName = "use_posi_cd")
    public String getUse_posi_cd(){
        return use_posi_cd;
    }

    @ElVoField(physicalName = "use_posi_cd")
    public void setUse_posi_cd(String use_posi_cd){
        this.use_posi_cd = use_posi_cd;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "req_dom_amt")
    public String getReq_dom_amt(){
        return req_dom_amt;
    }

    @ElVoField(physicalName = "req_dom_amt")
    public void setReq_dom_amt(String req_dom_amt){
        this.req_dom_amt = req_dom_amt;
    }

    @ElVoField(physicalName = "req_over_amt")
    public String getReq_over_amt(){
        return req_over_amt;
    }

    @ElVoField(physicalName = "req_over_amt")
    public void setReq_over_amt(String req_over_amt){
        this.req_over_amt = req_over_amt;
    }

    @ElVoField(physicalName = "str_ymd")
    public String getStr_ymd(){
        return str_ymd;
    }

    @ElVoField(physicalName = "str_ymd")
    public void setStr_ymd(String str_ymd){
        this.str_ymd = str_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
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

    @ElVoField(physicalName = "attach_file_no1")
    public String getAttach_file_no1(){
        return attach_file_no1;
    }

    @ElVoField(physicalName = "attach_file_no1")
    public void setAttach_file_no1(String attach_file_no1){
        this.attach_file_no1 = attach_file_no1;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "fr_req_ymd")
    public String getFr_req_ymd(){
        return fr_req_ymd;
    }

    @ElVoField(physicalName = "fr_req_ymd")
    public void setFr_req_ymd(String fr_req_ymd){
        this.fr_req_ymd = fr_req_ymd;
    }

    @ElVoField(physicalName = "to_req_ymd")
    public String getTo_req_ymd(){
        return to_req_ymd;
    }

    @ElVoField(physicalName = "to_req_ymd")
    public void setTo_req_ymd(String to_req_ymd){
        this.to_req_ymd = to_req_ymd;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public String getReq_posi_nm(){
        return req_posi_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public void setReq_posi_nm(String req_posi_nm){
        this.req_posi_nm = req_posi_nm;
    }

    @ElVoField(physicalName = "use_empno")
    public String getUse_empno(){
        return use_empno;
    }

    @ElVoField(physicalName = "use_empno")
    public void setUse_empno(String use_empno){
        this.use_empno = use_empno;
    }

    @ElVoField(physicalName = "use_syspayno")
    public String getUse_syspayno(){
        return use_syspayno;
    }

    @ElVoField(physicalName = "use_syspayno")
    public void setUse_syspayno(String use_syspayno){
        this.use_syspayno = use_syspayno;
    }

    @ElVoField(physicalName = "use_mobile")
    public String getUse_mobile(){
        return use_mobile;
    }

    @ElVoField(physicalName = "use_mobile")
    public void setUse_mobile(String use_mobile){
        this.use_mobile = use_mobile;
    }

    @ElVoField(physicalName = "use_nm")
    public String getUse_nm(){
        return use_nm;
    }

    @ElVoField(physicalName = "use_nm")
    public void setUse_nm(String use_nm){
        this.use_nm = use_nm;
    }

    @ElVoField(physicalName = "use_dept_nm")
    public String getUse_dept_nm(){
        return use_dept_nm;
    }

    @ElVoField(physicalName = "use_dept_nm")
    public void setUse_dept_nm(String use_dept_nm){
        this.use_dept_nm = use_dept_nm;
    }

    @ElVoField(physicalName = "use_posi_nm")
    public String getUse_posi_nm(){
        return use_posi_nm;
    }

    @ElVoField(physicalName = "use_posi_nm")
    public void setUse_posi_nm(String use_posi_nm){
        this.use_posi_nm = use_posi_nm;
    }

    @ElVoField(physicalName = "req_term")
    public String getReq_term(){
        return req_term;
    }

    @ElVoField(physicalName = "req_term")
    public void setReq_term(String req_term){
        this.req_term = req_term;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "cud_flag")
    public String getCud_flag(){
        return cud_flag;
    }

    @ElVoField(physicalName = "cud_flag")
    public void setCud_flag(String cud_flag){
        this.cud_flag = cud_flag;
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

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinCardUseAmtUpReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_posi_cd").append("=").append(req_posi_cd).append(",");
        sb.append("use_psn").append("=").append(use_psn).append(",");
        sb.append("use_dept_cd").append("=").append(use_dept_cd).append(",");
        sb.append("use_posi_cd").append("=").append(use_posi_cd).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("req_dom_amt").append("=").append(req_dom_amt).append(",");
        sb.append("req_over_amt").append("=").append(req_over_amt).append(",");
        sb.append("str_ymd").append("=").append(str_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_no1").append("=").append(attach_file_no1).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("fr_req_ymd").append("=").append(fr_req_ymd).append(",");
        sb.append("to_req_ymd").append("=").append(to_req_ymd).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_posi_nm").append("=").append(req_posi_nm).append(",");
        sb.append("use_empno").append("=").append(use_empno).append(",");
        sb.append("use_syspayno").append("=").append(use_syspayno).append(",");
        sb.append("use_mobile").append("=").append(use_mobile).append(",");
        sb.append("use_nm").append("=").append(use_nm).append(",");
        sb.append("use_dept_nm").append("=").append(use_dept_nm).append(",");
        sb.append("use_posi_nm").append("=").append(use_posi_nm).append(",");
        sb.append("req_term").append("=").append(req_term).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("cud_flag").append("=").append(cud_flag).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("comments").append("=").append(comments);
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
