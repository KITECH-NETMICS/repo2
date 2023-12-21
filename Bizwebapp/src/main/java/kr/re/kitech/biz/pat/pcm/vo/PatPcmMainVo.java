package kr.re.kitech.biz.pat.pcm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPcmMainExp")
public class PatPcmMainVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPcmMainVo(){
    }

    @ElDtoField(logicalName = "refKey", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "refNo", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "pageId", physicalName = "page_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_id;

    @ElDtoField(logicalName = "pageDetailId", physicalName = "page_detail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_detail_id;

    @ElDtoField(logicalName = "jobTitle", physicalName = "job_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_title;

    @ElDtoField(logicalName = "todoAuth", physicalName = "todo_auth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_auth;

    @ElDtoField(logicalName = "transId", physicalName = "trans_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_id;

    @ElDtoField(logicalName = "prityEvalReqNo", physicalName = "prity_eval_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_req_no;

    @ElDtoField(logicalName = "prityDemndId", physicalName = "prity_demnd_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_demnd_id;

    @ElDtoField(logicalName = "dpReqNo", physicalName = "dp_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_req_no;

    @ElDtoField(logicalName = "appId", physicalName = "app_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_id;

    @ElDtoField(logicalName = "page_gbn", physicalName = "page_gbn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_gbn;

    @ElDtoField(logicalName = "work_id", physicalName = "work_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_id;

    @ElDtoField(logicalName = "todo_id", physicalName = "todo_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_id;

    @ElDtoField(logicalName = "main_key", physicalName = "main_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_key;

    @ElDtoField(logicalName = "currep", physicalName = "currep", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String currep;

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
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

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
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

    @ElVoField(physicalName = "job_title")
    public String getJob_title(){
        return job_title;
    }

    @ElVoField(physicalName = "job_title")
    public void setJob_title(String job_title){
        this.job_title = job_title;
    }

    @ElVoField(physicalName = "todo_auth")
    public String getTodo_auth(){
        return todo_auth;
    }

    @ElVoField(physicalName = "todo_auth")
    public void setTodo_auth(String todo_auth){
        this.todo_auth = todo_auth;
    }

    @ElVoField(physicalName = "trans_id")
    public String getTrans_id(){
        return trans_id;
    }

    @ElVoField(physicalName = "trans_id")
    public void setTrans_id(String trans_id){
        this.trans_id = trans_id;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public String getPrity_eval_req_no(){
        return prity_eval_req_no;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public void setPrity_eval_req_no(String prity_eval_req_no){
        this.prity_eval_req_no = prity_eval_req_no;
    }

    @ElVoField(physicalName = "prity_demnd_id")
    public String getPrity_demnd_id(){
        return prity_demnd_id;
    }

    @ElVoField(physicalName = "prity_demnd_id")
    public void setPrity_demnd_id(String prity_demnd_id){
        this.prity_demnd_id = prity_demnd_id;
    }

    @ElVoField(physicalName = "dp_req_no")
    public String getDp_req_no(){
        return dp_req_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public void setDp_req_no(String dp_req_no){
        this.dp_req_no = dp_req_no;
    }

    @ElVoField(physicalName = "app_id")
    public String getApp_id(){
        return app_id;
    }

    @ElVoField(physicalName = "app_id")
    public void setApp_id(String app_id){
        this.app_id = app_id;
    }

    @ElVoField(physicalName = "page_gbn")
    public String getPage_gbn(){
        return page_gbn;
    }

    @ElVoField(physicalName = "page_gbn")
    public void setPage_gbn(String page_gbn){
        this.page_gbn = page_gbn;
    }

    @ElVoField(physicalName = "work_id")
    public String getWork_id(){
        return work_id;
    }

    @ElVoField(physicalName = "work_id")
    public void setWork_id(String work_id){
        this.work_id = work_id;
    }

    @ElVoField(physicalName = "todo_id")
    public String getTodo_id(){
        return todo_id;
    }

    @ElVoField(physicalName = "todo_id")
    public void setTodo_id(String todo_id){
        this.todo_id = todo_id;
    }

    @ElVoField(physicalName = "main_key")
    public String getMain_key(){
        return main_key;
    }

    @ElVoField(physicalName = "main_key")
    public void setMain_key(String main_key){
        this.main_key = main_key;
    }

    @ElVoField(physicalName = "currep")
    public String getCurrep(){
        return currep;
    }

    @ElVoField(physicalName = "currep")
    public void setCurrep(String currep){
        this.currep = currep;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPcmMainVo [");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("page_id").append("=").append(page_id).append(",");
        sb.append("page_detail_id").append("=").append(page_detail_id).append(",");
        sb.append("job_title").append("=").append(job_title).append(",");
        sb.append("todo_auth").append("=").append(todo_auth).append(",");
        sb.append("trans_id").append("=").append(trans_id).append(",");
        sb.append("prity_eval_req_no").append("=").append(prity_eval_req_no).append(",");
        sb.append("prity_demnd_id").append("=").append(prity_demnd_id).append(",");
        sb.append("dp_req_no").append("=").append(dp_req_no).append(",");
        sb.append("app_id").append("=").append(app_id).append(",");
        sb.append("page_gbn").append("=").append(page_gbn).append(",");
        sb.append("work_id").append("=").append(work_id).append(",");
        sb.append("todo_id").append("=").append(todo_id).append(",");
        sb.append("main_key").append("=").append(main_key).append(",");
        sb.append("currep").append("=").append(currep);
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
