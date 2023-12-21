package kr.re.kitech.biz.pat.com.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 TODO Vo")
public class PatToDoVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatToDoVo(){
    }

    @ElDtoField(logicalName = "TODO ID", physicalName = "todo_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_id;

    @ElDtoField(logicalName = "업무번호", physicalName = "work_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_id;

    @ElDtoField(logicalName = "생성코드", physicalName = "reg_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_cd;

    @ElDtoField(logicalName = "업무코드", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;

    @ElDtoField(logicalName = "업무명", physicalName = "job_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_title;

    @ElDtoField(logicalName = "TO-DO명칭", physicalName = "todo_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_title;

    @ElDtoField(logicalName = "업무권한", physicalName = "todo_auth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "0 발명자")
    private String todo_auth;

    @ElDtoField(logicalName = "화면ID", physicalName = "page_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_id;

    @ElDtoField(logicalName = "상세화면", physicalName = "page_detail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_detail_id;

    @ElDtoField(logicalName = "기한일", physicalName = "todo_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_due_date;

    @ElDtoField(logicalName = "INIT", physicalName = "init", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String init;

    @ElDtoField(logicalName = "참조키", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "다음상태코드", physicalName = "next_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String next_state_cd;

    @ElDtoField(logicalName = "현재상태코드", physicalName = "curr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_state_cd;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "완료유무", physicalName = "end_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_yn;

    @ElDtoField(logicalName = "소요일", physicalName = "todo_day", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int todo_day;

    @ElDtoField(logicalName = "TO-DO유무", physicalName = "todo_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_yn;

    @ElDtoField(logicalName = "업무대기함유무", physicalName = "bpm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bpm_yn;

    @ElDtoField(logicalName = "메일전송유무", physicalName = "mail_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_yn;

    @ElDtoField(logicalName = "SMS전송유무", physicalName = "sms_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_yn;

    @ElDtoField(logicalName = "알림발신자", physicalName = "alarm_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String alarm_from;

    @ElDtoField(logicalName = "통합프로세스 mainKey", physicalName = "main_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_key;

    @ElDtoField(logicalName = "TODO ACTOR", physicalName = "todo_actor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_actor;

    @ElVoField(physicalName = "todo_id")
    public String getTodo_id(){
        return todo_id;
    }

    @ElVoField(physicalName = "todo_id")
    public void setTodo_id(String todo_id){
        this.todo_id = todo_id;
    }

    @ElVoField(physicalName = "work_id")
    public String getWork_id(){
        return work_id;
    }

    @ElVoField(physicalName = "work_id")
    public void setWork_id(String work_id){
        this.work_id = work_id;
    }

    @ElVoField(physicalName = "reg_cd")
    public String getReg_cd(){
        return reg_cd;
    }

    @ElVoField(physicalName = "reg_cd")
    public void setReg_cd(String reg_cd){
        this.reg_cd = reg_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }

    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
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

    @ElVoField(physicalName = "todo_auth")
    public String getTodo_auth(){
        return todo_auth;
    }

    @ElVoField(physicalName = "todo_auth")
    public void setTodo_auth(String todo_auth){
        this.todo_auth = todo_auth;
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

    @ElVoField(physicalName = "todo_due_date")
    public String getTodo_due_date(){
        return todo_due_date;
    }

    @ElVoField(physicalName = "todo_due_date")
    public void setTodo_due_date(String todo_due_date){
        this.todo_due_date = todo_due_date;
    }

    @ElVoField(physicalName = "init")
    public String getInit(){
        return init;
    }

    @ElVoField(physicalName = "init")
    public void setInit(String init){
        this.init = init;
    }

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "next_state_cd")
    public String getNext_state_cd(){
        return next_state_cd;
    }

    @ElVoField(physicalName = "next_state_cd")
    public void setNext_state_cd(String next_state_cd){
        this.next_state_cd = next_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public String getCurr_state_cd(){
        return curr_state_cd;
    }

    @ElVoField(physicalName = "curr_state_cd")
    public void setCurr_state_cd(String curr_state_cd){
        this.curr_state_cd = curr_state_cd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "end_yn")
    public String getEnd_yn(){
        return end_yn;
    }

    @ElVoField(physicalName = "end_yn")
    public void setEnd_yn(String end_yn){
        this.end_yn = end_yn;
    }

    @ElVoField(physicalName = "todo_day")
    public int getTodo_day(){
        return todo_day;
    }

    @ElVoField(physicalName = "todo_day")
    public void setTodo_day(int todo_day){
        this.todo_day = todo_day;
    }

    @ElVoField(physicalName = "todo_yn")
    public String getTodo_yn(){
        return todo_yn;
    }

    @ElVoField(physicalName = "todo_yn")
    public void setTodo_yn(String todo_yn){
        this.todo_yn = todo_yn;
    }

    @ElVoField(physicalName = "bpm_yn")
    public String getBpm_yn(){
        return bpm_yn;
    }

    @ElVoField(physicalName = "bpm_yn")
    public void setBpm_yn(String bpm_yn){
        this.bpm_yn = bpm_yn;
    }

    @ElVoField(physicalName = "mail_yn")
    public String getMail_yn(){
        return mail_yn;
    }

    @ElVoField(physicalName = "mail_yn")
    public void setMail_yn(String mail_yn){
        this.mail_yn = mail_yn;
    }

    @ElVoField(physicalName = "sms_yn")
    public String getSms_yn(){
        return sms_yn;
    }

    @ElVoField(physicalName = "sms_yn")
    public void setSms_yn(String sms_yn){
        this.sms_yn = sms_yn;
    }

    @ElVoField(physicalName = "alarm_from")
    public String getAlarm_from(){
        return alarm_from;
    }

    @ElVoField(physicalName = "alarm_from")
    public void setAlarm_from(String alarm_from){
        this.alarm_from = alarm_from;
    }

    @ElVoField(physicalName = "main_key")
    public String getMain_key(){
        return main_key;
    }

    @ElVoField(physicalName = "main_key")
    public void setMain_key(String main_key){
        this.main_key = main_key;
    }

    @ElVoField(physicalName = "todo_actor")
    public String getTodo_actor(){
        return todo_actor;
    }

    @ElVoField(physicalName = "todo_actor")
    public void setTodo_actor(String todo_actor){
        this.todo_actor = todo_actor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatToDoVo [");
        sb.append("todo_id").append("=").append(todo_id).append(",");
        sb.append("work_id").append("=").append(work_id).append(",");
        sb.append("reg_cd").append("=").append(reg_cd).append(",");
        sb.append("job_cd").append("=").append(job_cd).append(",");
        sb.append("job_title").append("=").append(job_title).append(",");
        sb.append("todo_title").append("=").append(todo_title).append(",");
        sb.append("todo_auth").append("=").append(todo_auth).append(",");
        sb.append("page_id").append("=").append(page_id).append(",");
        sb.append("page_detail_id").append("=").append(page_detail_id).append(",");
        sb.append("todo_due_date").append("=").append(todo_due_date).append(",");
        sb.append("init").append("=").append(init).append(",");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("next_state_cd").append("=").append(next_state_cd).append(",");
        sb.append("curr_state_cd").append("=").append(curr_state_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("end_yn").append("=").append(end_yn).append(",");
        sb.append("todo_day").append("=").append(todo_day).append(",");
        sb.append("todo_yn").append("=").append(todo_yn).append(",");
        sb.append("bpm_yn").append("=").append(bpm_yn).append(",");
        sb.append("mail_yn").append("=").append(mail_yn).append(",");
        sb.append("sms_yn").append("=").append(sms_yn).append(",");
        sb.append("alarm_from").append("=").append(alarm_from).append(",");
        sb.append("main_key").append("=").append(main_key).append(",");
        sb.append("todo_actor").append("=").append(todo_actor);
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
