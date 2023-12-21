package kr.re.kitech.biz.pat.ptd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPtdLstExp")
public class PatPtdLstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPtdLstVo(){
    }

    @ElDtoField(logicalName = "prity_demnd_id", physicalName = "prity_demnd_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_demnd_id;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmt_no", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "job_state_cd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "srh_id", physicalName = "srh_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_id;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "req_patofic_cd", physicalName = "req_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_patofic_cd;

    @ElDtoField(logicalName = "hope_patofic_charg_id", physicalName = "hope_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_id;

    @ElDtoField(logicalName = "req_due_date", physicalName = "req_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_due_date;

    @ElDtoField(logicalName = "req_comment", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "demnd_id", physicalName = "demnd_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_id;

    @ElDtoField(logicalName = "ask_psn_syspayno", physicalName = "ask_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ask_psn_syspayno;

    @ElDtoField(logicalName = "spec_id", physicalName = "spec_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spec_id;

    @ElDtoField(logicalName = "invnt_syspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "patofic_cd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patofic_charg_id", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "todo_auth", physicalName = "todo_auth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_auth;

    @ElDtoField(logicalName = "pat_clsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "invnt_krn_nm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "ref_no", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "curr_state_cd", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "invnt_psn_nm", physicalName = "invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_nm;

    @ElDtoField(logicalName = "patofic_nm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "job_title", physicalName = "job_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_title;

    @ElDtoField(logicalName = "todo_title", physicalName = "todo_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_title;

    @ElDtoField(logicalName = "todo_due_date", physicalName = "todo_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_due_date;

    @ElDtoField(logicalName = "todo_pro", physicalName = "todo_pro", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_pro;

    @ElDtoField(logicalName = "page_id", physicalName = "page_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_id;

    @ElDtoField(logicalName = "page_detail_id", physicalName = "page_detail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_detail_id;

    @ElDtoField(logicalName = "smitapp_no", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "status", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String status;

    @ElDtoField(logicalName = "defname", physicalName = "defname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String defname;

    @ElDtoField(logicalName = "app_id", physicalName = "app_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_id;

    @ElDtoField(logicalName = "type", physicalName = "type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String type;

    @ElDtoField(logicalName = "eval_demnd_ex", physicalName = "eval_demnd_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_demnd_ex;

    @ElVoField(physicalName = "prity_demnd_id")
    public String getPrity_demnd_id(){
        return prity_demnd_id;
    }

    @ElVoField(physicalName = "prity_demnd_id")
    public void setPrity_demnd_id(String prity_demnd_id){
        this.prity_demnd_id = prity_demnd_id;
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

    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }

    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "srh_id")
    public String getSrh_id(){
        return srh_id;
    }

    @ElVoField(physicalName = "srh_id")
    public void setSrh_id(String srh_id){
        this.srh_id = srh_id;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public String getReq_patofic_cd(){
        return req_patofic_cd;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public void setReq_patofic_cd(String req_patofic_cd){
        this.req_patofic_cd = req_patofic_cd;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public String getHope_patofic_charg_id(){
        return hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public void setHope_patofic_charg_id(String hope_patofic_charg_id){
        this.hope_patofic_charg_id = hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "req_due_date")
    public String getReq_due_date(){
        return req_due_date;
    }

    @ElVoField(physicalName = "req_due_date")
    public void setReq_due_date(String req_due_date){
        this.req_due_date = req_due_date;
    }

    @ElVoField(physicalName = "req_comment")
    public String getReq_comment(){
        return req_comment;
    }

    @ElVoField(physicalName = "req_comment")
    public void setReq_comment(String req_comment){
        this.req_comment = req_comment;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "demnd_id")
    public String getDemnd_id(){
        return demnd_id;
    }

    @ElVoField(physicalName = "demnd_id")
    public void setDemnd_id(String demnd_id){
        this.demnd_id = demnd_id;
    }

    @ElVoField(physicalName = "ask_psn_syspayno")
    public String getAsk_psn_syspayno(){
        return ask_psn_syspayno;
    }

    @ElVoField(physicalName = "ask_psn_syspayno")
    public void setAsk_psn_syspayno(String ask_psn_syspayno){
        this.ask_psn_syspayno = ask_psn_syspayno;
    }

    @ElVoField(physicalName = "spec_id")
    public String getSpec_id(){
        return spec_id;
    }

    @ElVoField(physicalName = "spec_id")
    public void setSpec_id(String spec_id){
        this.spec_id = spec_id;
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

    @ElVoField(physicalName = "todo_auth")
    public String getTodo_auth(){
        return todo_auth;
    }

    @ElVoField(physicalName = "todo_auth")
    public void setTodo_auth(String todo_auth){
        this.todo_auth = todo_auth;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
    }

    @ElVoField(physicalName = "invnt_psn_nm")
    public String getInvnt_psn_nm(){
        return invnt_psn_nm;
    }

    @ElVoField(physicalName = "invnt_psn_nm")
    public void setInvnt_psn_nm(String invnt_psn_nm){
        this.invnt_psn_nm = invnt_psn_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "job_title")
    public String getJob_title(){
        return job_title;
    }

    @ElVoField(physicalName = "job_title")
    public void setJob_title(String job_title){
        this.job_title = job_title;
    }

    @ElVoField(physicalName = "todo_title")
    public String getTodo_title(){
        return todo_title;
    }

    @ElVoField(physicalName = "todo_title")
    public void setTodo_title(String todo_title){
        this.todo_title = todo_title;
    }

    @ElVoField(physicalName = "todo_due_date")
    public String getTodo_due_date(){
        return todo_due_date;
    }

    @ElVoField(physicalName = "todo_due_date")
    public void setTodo_due_date(String todo_due_date){
        this.todo_due_date = todo_due_date;
    }

    @ElVoField(physicalName = "todo_pro")
    public String getTodo_pro(){
        return todo_pro;
    }

    @ElVoField(physicalName = "todo_pro")
    public void setTodo_pro(String todo_pro){
        this.todo_pro = todo_pro;
    }

    @ElVoField(physicalName = "page_id")
    public String getPage_id(){
        return page_id;
    }

    @ElVoField(physicalName = "page_id")
    public void setPage_id(String page_id){
        this.page_id = page_id;
    }

    @ElVoField(physicalName = "page_detail_id")
    public String getPage_detail_id(){
        return page_detail_id;
    }

    @ElVoField(physicalName = "page_detail_id")
    public void setPage_detail_id(String page_detail_id){
        this.page_detail_id = page_detail_id;
    }

    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }

    @ElVoField(physicalName = "status")
    public String getStatus(){
        return status;
    }

    @ElVoField(physicalName = "status")
    public void setStatus(String status){
        this.status = status;
    }

    @ElVoField(physicalName = "defname")
    public String getDefname(){
        return defname;
    }

    @ElVoField(physicalName = "defname")
    public void setDefname(String defname){
        this.defname = defname;
    }

    @ElVoField(physicalName = "app_id")
    public String getApp_id(){
        return app_id;
    }

    @ElVoField(physicalName = "app_id")
    public void setApp_id(String app_id){
        this.app_id = app_id;
    }

    @ElVoField(physicalName = "type")
    public String getType(){
        return type;
    }

    @ElVoField(physicalName = "type")
    public void setType(String type){
        this.type = type;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public String getEval_demnd_ex(){
        return eval_demnd_ex;
    }

    @ElVoField(physicalName = "eval_demnd_ex")
    public void setEval_demnd_ex(String eval_demnd_ex){
        this.eval_demnd_ex = eval_demnd_ex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPtdLstVo [");
        sb.append("prity_demnd_id").append("=").append(prity_demnd_id).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("srh_id").append("=").append(srh_id).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_patofic_cd").append("=").append(req_patofic_cd).append(",");
        sb.append("hope_patofic_charg_id").append("=").append(hope_patofic_charg_id).append(",");
        sb.append("req_due_date").append("=").append(req_due_date).append(",");
        sb.append("req_comment").append("=").append(req_comment).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("demnd_id").append("=").append(demnd_id).append(",");
        sb.append("ask_psn_syspayno").append("=").append(ask_psn_syspayno).append(",");
        sb.append("spec_id").append("=").append(spec_id).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("todo_auth").append("=").append(todo_auth).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("invnt_psn_nm").append("=").append(invnt_psn_nm).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("job_title").append("=").append(job_title).append(",");
        sb.append("todo_title").append("=").append(todo_title).append(",");
        sb.append("todo_due_date").append("=").append(todo_due_date).append(",");
        sb.append("todo_pro").append("=").append(todo_pro).append(",");
        sb.append("page_id").append("=").append(page_id).append(",");
        sb.append("page_detail_id").append("=").append(page_detail_id).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("status").append("=").append(status).append(",");
        sb.append("defname").append("=").append(defname).append(",");
        sb.append("app_id").append("=").append(app_id).append(",");
        sb.append("type").append("=").append(type).append(",");
        sb.append("eval_demnd_ex").append("=").append(eval_demnd_ex);
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
