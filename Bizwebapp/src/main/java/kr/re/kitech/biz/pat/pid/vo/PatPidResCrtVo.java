package kr.re.kitech.biz.pat.pid.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPidResCrtExp")
public class PatPidResCrtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPidResCrtVo(){
    }

    @ElDtoField(logicalName = "job_state_cd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "eval_psn_syspayno", physicalName = "eval_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspayno;

    @ElDtoField(logicalName = "eval_daytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "eval_res_clsf", physicalName = "eval_res_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_res_clsf;

    @ElDtoField(logicalName = "eval_service_scr", physicalName = "eval_service_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_service_scr;

    @ElDtoField(logicalName = "eval_result_scr", physicalName = "eval_result_scr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_result_scr;

    @ElDtoField(logicalName = "eval_comment", physicalName = "eval_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_comment;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "ids_id", physicalName = "ids_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ids_id;

    @ElDtoField(logicalName = "rcpt_wri_nm", physicalName = "rcpt_wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_wri_nm;

    @ElDtoField(logicalName = "rcpt_daytm", physicalName = "rcpt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_daytm;

    @ElDtoField(logicalName = "rcpt_charg_psn_nm", physicalName = "rcpt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_nm;

    @ElDtoField(logicalName = "rcpt_psn_nm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcpt_ids_date", physicalName = "rcpt_ids_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ids_date;

    @ElDtoField(logicalName = "rcpt_comment", physicalName = "rcpt_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_comment;

    @ElDtoField(logicalName = "rcpt_attach_file", physicalName = "rcpt_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_attach_file;

    @ElDtoField(logicalName = "todo_auth", physicalName = "todo_auth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_auth;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmt_no", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "next_state_cd", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "ref_key", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "eval_psn_syspaynm", physicalName = "eval_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_psn_syspaynm;

    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }

    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public String getEval_psn_syspayno(){
        return eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_psn_syspayno")
    public void setEval_psn_syspayno(String eval_psn_syspayno){
        this.eval_psn_syspayno = eval_psn_syspayno;
    }

    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }

    @ElVoField(physicalName = "eval_res_clsf")
    public String getEval_res_clsf(){
        return eval_res_clsf;
    }

    @ElVoField(physicalName = "eval_res_clsf")
    public void setEval_res_clsf(String eval_res_clsf){
        this.eval_res_clsf = eval_res_clsf;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public String getEval_service_scr(){
        return eval_service_scr;
    }

    @ElVoField(physicalName = "eval_service_scr")
    public void setEval_service_scr(String eval_service_scr){
        this.eval_service_scr = eval_service_scr;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public String getEval_result_scr(){
        return eval_result_scr;
    }

    @ElVoField(physicalName = "eval_result_scr")
    public void setEval_result_scr(String eval_result_scr){
        this.eval_result_scr = eval_result_scr;
    }

    @ElVoField(physicalName = "eval_comment")
    public String getEval_comment(){
        return eval_comment;
    }

    @ElVoField(physicalName = "eval_comment")
    public void setEval_comment(String eval_comment){
        this.eval_comment = eval_comment;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "ids_id")
    public String getIds_id(){
        return ids_id;
    }

    @ElVoField(physicalName = "ids_id")
    public void setIds_id(String ids_id){
        this.ids_id = ids_id;
    }

    @ElVoField(physicalName = "rcpt_wri_nm")
    public String getRcpt_wri_nm(){
        return rcpt_wri_nm;
    }

    @ElVoField(physicalName = "rcpt_wri_nm")
    public void setRcpt_wri_nm(String rcpt_wri_nm){
        this.rcpt_wri_nm = rcpt_wri_nm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public String getRcpt_daytm(){
        return rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_daytm")
    public void setRcpt_daytm(String rcpt_daytm){
        this.rcpt_daytm = rcpt_daytm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public String getRcpt_charg_psn_nm(){
        return rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public void setRcpt_charg_psn_nm(String rcpt_charg_psn_nm){
        this.rcpt_charg_psn_nm = rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_ids_date")
    public String getRcpt_ids_date(){
        return rcpt_ids_date;
    }

    @ElVoField(physicalName = "rcpt_ids_date")
    public void setRcpt_ids_date(String rcpt_ids_date){
        this.rcpt_ids_date = rcpt_ids_date;
    }

    @ElVoField(physicalName = "rcpt_comment")
    public String getRcpt_comment(){
        return rcpt_comment;
    }

    @ElVoField(physicalName = "rcpt_comment")
    public void setRcpt_comment(String rcpt_comment){
        this.rcpt_comment = rcpt_comment;
    }

    @ElVoField(physicalName = "rcpt_attach_file")
    public String getRcpt_attach_file(){
        return rcpt_attach_file;
    }

    @ElVoField(physicalName = "rcpt_attach_file")
    public void setRcpt_attach_file(String rcpt_attach_file){
        this.rcpt_attach_file = rcpt_attach_file;
    }

    @ElVoField(physicalName = "todo_auth")
    public String getTodo_auth(){
        return todo_auth;
    }

    @ElVoField(physicalName = "todo_auth")
    public void setTodo_auth(String todo_auth){
        this.todo_auth = todo_auth;
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

    @ElVoField(physicalName = "next_state_cd")
    public String getNext_state_cd(){
        return next_state_cd;
    }

    @ElVoField(physicalName = "next_state_cd")
    public void setNext_state_cd(String next_state_cd){
        this.next_state_cd = next_state_cd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "eval_psn_syspaynm")
    public String getEval_psn_syspaynm(){
        return eval_psn_syspaynm;
    }

    @ElVoField(physicalName = "eval_psn_syspaynm")
    public void setEval_psn_syspaynm(String eval_psn_syspaynm){
        this.eval_psn_syspaynm = eval_psn_syspaynm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPidResCrtVo [");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("eval_psn_syspayno").append("=").append(eval_psn_syspayno).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("eval_res_clsf").append("=").append(eval_res_clsf).append(",");
        sb.append("eval_service_scr").append("=").append(eval_service_scr).append(",");
        sb.append("eval_result_scr").append("=").append(eval_result_scr).append(",");
        sb.append("eval_comment").append("=").append(eval_comment).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("ids_id").append("=").append(ids_id).append(",");
        sb.append("rcpt_wri_nm").append("=").append(rcpt_wri_nm).append(",");
        sb.append("rcpt_daytm").append("=").append(rcpt_daytm).append(",");
        sb.append("rcpt_charg_psn_nm").append("=").append(rcpt_charg_psn_nm).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_ids_date").append("=").append(rcpt_ids_date).append(",");
        sb.append("rcpt_comment").append("=").append(rcpt_comment).append(",");
        sb.append("rcpt_attach_file").append("=").append(rcpt_attach_file).append(",");
        sb.append("todo_auth").append("=").append(todo_auth).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("eval_psn_syspaynm").append("=").append(eval_psn_syspaynm);
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
