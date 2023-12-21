package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResOutCtrbtReqVo")
public class ResOutCtrbtReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResOutCtrbtReqVo(){
    }

    @ElDtoField(logicalName = "req_nm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "req_empno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "req_dept_cd", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "req_posi_cd", physicalName = "req_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_cd;

    @ElDtoField(logicalName = "req_posi_nm", physicalName = "req_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_nm;

    @ElDtoField(logicalName = "req_psn_dept_new_ymd", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "content", physicalName = "content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String content;

    @ElDtoField(logicalName = "rcpt_psn_dept_nm", physicalName = "rcpt_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_dept_nm;

    @ElDtoField(logicalName = "rcpt_empno", physicalName = "rcpt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_empno;

    @ElDtoField(logicalName = "rcpt_psn_nm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcpt_psn_posi_nm", physicalName = "rcpt_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_posi_nm;

    @ElDtoField(logicalName = "rate_syspayno", physicalName = "rate_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_syspayno;

    @ElDtoField(logicalName = "rate_empno", physicalName = "rate_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_empno;

    @ElDtoField(logicalName = "rate_nm", physicalName = "rate_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_nm;

    @ElDtoField(logicalName = "rate_posi_cd", physicalName = "rate_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_posi_cd;

    @ElDtoField(logicalName = "rate_posi_nm", physicalName = "rate_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_posi_nm;

    @ElDtoField(logicalName = "rate_division_cd", physicalName = "rate_division_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_division_cd;

    @ElDtoField(logicalName = "rate_division_nm", physicalName = "rate_division_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_division_nm;

    @ElDtoField(logicalName = "rate_dept_cd", physicalName = "rate_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_dept_cd;

    @ElDtoField(logicalName = "rate_dept_nm", physicalName = "rate_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_dept_nm;

    @ElDtoField(logicalName = "ctrbt_eval_index", physicalName = "ctrbt_eval_index", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrbt_eval_index;

    @ElDtoField(logicalName = "points", physicalName = "points", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String points;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "ind_type", physicalName = "ind_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_type;

    @ElDtoField(logicalName = "ind_type_nm", physicalName = "ind_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_type_nm;

    @ElDtoField(logicalName = "ind_cd", physicalName = "ind_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_cd;

    @ElDtoField(logicalName = "ind_cd_nm", physicalName = "ind_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_cd_nm;

    @ElDtoField(logicalName = "rcpt_syspayno", physicalName = "rcpt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspayno;

    @ElDtoField(logicalName = "rcpt_psn", physicalName = "rcpt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn;

    @ElDtoField(logicalName = "aply_yn", physicalName = "aply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_yn;

    @ElDtoField(logicalName = "req_syspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_divsn_dept_nm", physicalName = "req_divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_divsn_dept_nm;

    @ElDtoField(logicalName = "approval_temp", physicalName = "approval_temp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String approval_temp;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "total_points", physicalName = "total_points", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String total_points;

    @ElDtoField(logicalName = "comments", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "apr_info", physicalName = "apr_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_info;

    @ElDtoField(logicalName = "actvty_nm", physicalName = "actvty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String actvty_nm;

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_posi_cd")
    public String getReq_posi_cd(){
        return req_posi_cd;
    }

    @ElVoField(physicalName = "req_posi_cd")
    public void setReq_posi_cd(String req_posi_cd){
        this.req_posi_cd = req_posi_cd;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public String getReq_posi_nm(){
        return req_posi_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public void setReq_posi_nm(String req_posi_nm){
        this.req_posi_nm = req_posi_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public String getReq_psn_dept_new_ymd(){
        return req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public void setReq_psn_dept_new_ymd(String req_psn_dept_new_ymd){
        this.req_psn_dept_new_ymd = req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
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

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "content")
    public String getContent(){
        return content;
    }

    @ElVoField(physicalName = "content")
    public void setContent(String content){
        this.content = content;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public String getRcpt_psn_dept_nm(){
        return rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public void setRcpt_psn_dept_nm(String rcpt_psn_dept_nm){
        this.rcpt_psn_dept_nm = rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_empno")
    public String getRcpt_empno(){
        return rcpt_empno;
    }

    @ElVoField(physicalName = "rcpt_empno")
    public void setRcpt_empno(String rcpt_empno){
        this.rcpt_empno = rcpt_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_posi_nm")
    public String getRcpt_psn_posi_nm(){
        return rcpt_psn_posi_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_posi_nm")
    public void setRcpt_psn_posi_nm(String rcpt_psn_posi_nm){
        this.rcpt_psn_posi_nm = rcpt_psn_posi_nm;
    }

    @ElVoField(physicalName = "rate_syspayno")
    public String getRate_syspayno(){
        return rate_syspayno;
    }

    @ElVoField(physicalName = "rate_syspayno")
    public void setRate_syspayno(String rate_syspayno){
        this.rate_syspayno = rate_syspayno;
    }

    @ElVoField(physicalName = "rate_empno")
    public String getRate_empno(){
        return rate_empno;
    }

    @ElVoField(physicalName = "rate_empno")
    public void setRate_empno(String rate_empno){
        this.rate_empno = rate_empno;
    }

    @ElVoField(physicalName = "rate_nm")
    public String getRate_nm(){
        return rate_nm;
    }

    @ElVoField(physicalName = "rate_nm")
    public void setRate_nm(String rate_nm){
        this.rate_nm = rate_nm;
    }

    @ElVoField(physicalName = "rate_posi_cd")
    public String getRate_posi_cd(){
        return rate_posi_cd;
    }

    @ElVoField(physicalName = "rate_posi_cd")
    public void setRate_posi_cd(String rate_posi_cd){
        this.rate_posi_cd = rate_posi_cd;
    }

    @ElVoField(physicalName = "rate_posi_nm")
    public String getRate_posi_nm(){
        return rate_posi_nm;
    }

    @ElVoField(physicalName = "rate_posi_nm")
    public void setRate_posi_nm(String rate_posi_nm){
        this.rate_posi_nm = rate_posi_nm;
    }

    @ElVoField(physicalName = "rate_division_cd")
    public String getRate_division_cd(){
        return rate_division_cd;
    }

    @ElVoField(physicalName = "rate_division_cd")
    public void setRate_division_cd(String rate_division_cd){
        this.rate_division_cd = rate_division_cd;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public String getRate_division_nm(){
        return rate_division_nm;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public void setRate_division_nm(String rate_division_nm){
        this.rate_division_nm = rate_division_nm;
    }

    @ElVoField(physicalName = "rate_dept_cd")
    public String getRate_dept_cd(){
        return rate_dept_cd;
    }

    @ElVoField(physicalName = "rate_dept_cd")
    public void setRate_dept_cd(String rate_dept_cd){
        this.rate_dept_cd = rate_dept_cd;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public String getRate_dept_nm(){
        return rate_dept_nm;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public void setRate_dept_nm(String rate_dept_nm){
        this.rate_dept_nm = rate_dept_nm;
    }

    @ElVoField(physicalName = "ctrbt_eval_index")
    public String getCtrbt_eval_index(){
        return ctrbt_eval_index;
    }

    @ElVoField(physicalName = "ctrbt_eval_index")
    public void setCtrbt_eval_index(String ctrbt_eval_index){
        this.ctrbt_eval_index = ctrbt_eval_index;
    }

    @ElVoField(physicalName = "points")
    public String getPoints(){
        return points;
    }

    @ElVoField(physicalName = "points")
    public void setPoints(String points){
        this.points = points;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "ind_type")
    public String getInd_type(){
        return ind_type;
    }

    @ElVoField(physicalName = "ind_type")
    public void setInd_type(String ind_type){
        this.ind_type = ind_type;
    }

    @ElVoField(physicalName = "ind_type_nm")
    public String getInd_type_nm(){
        return ind_type_nm;
    }

    @ElVoField(physicalName = "ind_type_nm")
    public void setInd_type_nm(String ind_type_nm){
        this.ind_type_nm = ind_type_nm;
    }

    @ElVoField(physicalName = "ind_cd")
    public String getInd_cd(){
        return ind_cd;
    }

    @ElVoField(physicalName = "ind_cd")
    public void setInd_cd(String ind_cd){
        this.ind_cd = ind_cd;
    }

    @ElVoField(physicalName = "ind_cd_nm")
    public String getInd_cd_nm(){
        return ind_cd_nm;
    }

    @ElVoField(physicalName = "ind_cd_nm")
    public void setInd_cd_nm(String ind_cd_nm){
        this.ind_cd_nm = ind_cd_nm;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public String getRcpt_syspayno(){
        return rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public void setRcpt_syspayno(String rcpt_syspayno){
        this.rcpt_syspayno = rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public String getRcpt_psn(){
        return rcpt_psn;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public void setRcpt_psn(String rcpt_psn){
        this.rcpt_psn = rcpt_psn;
    }

    @ElVoField(physicalName = "aply_yn")
    public String getAply_yn(){
        return aply_yn;
    }

    @ElVoField(physicalName = "aply_yn")
    public void setAply_yn(String aply_yn){
        this.aply_yn = aply_yn;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_divsn_dept_nm")
    public String getReq_divsn_dept_nm(){
        return req_divsn_dept_nm;
    }

    @ElVoField(physicalName = "req_divsn_dept_nm")
    public void setReq_divsn_dept_nm(String req_divsn_dept_nm){
        this.req_divsn_dept_nm = req_divsn_dept_nm;
    }

    @ElVoField(physicalName = "approval_temp")
    public String getApproval_temp(){
        return approval_temp;
    }

    @ElVoField(physicalName = "approval_temp")
    public void setApproval_temp(String approval_temp){
        this.approval_temp = approval_temp;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "total_points")
    public String getTotal_points(){
        return total_points;
    }

    @ElVoField(physicalName = "total_points")
    public void setTotal_points(String total_points){
        this.total_points = total_points;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "apr_info")
    public String getApr_info(){
        return apr_info;
    }

    @ElVoField(physicalName = "apr_info")
    public void setApr_info(String apr_info){
        this.apr_info = apr_info;
    }

    @ElVoField(physicalName = "actvty_nm")
    public String getActvty_nm(){
        return actvty_nm;
    }

    @ElVoField(physicalName = "actvty_nm")
    public void setActvty_nm(String actvty_nm){
        this.actvty_nm = actvty_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResOutCtrbtReqVo [");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_posi_cd").append("=").append(req_posi_cd).append(",");
        sb.append("req_posi_nm").append("=").append(req_posi_nm).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("content").append("=").append(content).append(",");
        sb.append("rcpt_psn_dept_nm").append("=").append(rcpt_psn_dept_nm).append(",");
        sb.append("rcpt_empno").append("=").append(rcpt_empno).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_psn_posi_nm").append("=").append(rcpt_psn_posi_nm).append(",");
        sb.append("rate_syspayno").append("=").append(rate_syspayno).append(",");
        sb.append("rate_empno").append("=").append(rate_empno).append(",");
        sb.append("rate_nm").append("=").append(rate_nm).append(",");
        sb.append("rate_posi_cd").append("=").append(rate_posi_cd).append(",");
        sb.append("rate_posi_nm").append("=").append(rate_posi_nm).append(",");
        sb.append("rate_division_cd").append("=").append(rate_division_cd).append(",");
        sb.append("rate_division_nm").append("=").append(rate_division_nm).append(",");
        sb.append("rate_dept_cd").append("=").append(rate_dept_cd).append(",");
        sb.append("rate_dept_nm").append("=").append(rate_dept_nm).append(",");
        sb.append("ctrbt_eval_index").append("=").append(ctrbt_eval_index).append(",");
        sb.append("points").append("=").append(points).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("ind_type").append("=").append(ind_type).append(",");
        sb.append("ind_type_nm").append("=").append(ind_type_nm).append(",");
        sb.append("ind_cd").append("=").append(ind_cd).append(",");
        sb.append("ind_cd_nm").append("=").append(ind_cd_nm).append(",");
        sb.append("rcpt_syspayno").append("=").append(rcpt_syspayno).append(",");
        sb.append("rcpt_psn").append("=").append(rcpt_psn).append(",");
        sb.append("aply_yn").append("=").append(aply_yn).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_divsn_dept_nm").append("=").append(req_divsn_dept_nm).append(",");
        sb.append("approval_temp").append("=").append(approval_temp).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("total_points").append("=").append(total_points).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("apr_info").append("=").append(apr_info).append(",");
        sb.append("actvty_nm").append("=").append(actvty_nm);
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
