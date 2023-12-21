package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록 조회 Vo")
public class FspMeetSearchVo extends kr.re.kitech.biz.fin.com.vo.FbaCardVo {
    private static final long serialVersionUID = 1L;

    public FspMeetSearchVo(){
    }

    @ElDtoField(logicalName = "작성일자 시작일", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "작성일자 종료일", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "권한 사용자 시스템개인번호", physicalName = "role_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String role_syspayno;

    @ElDtoField(logicalName = "작성자 시스템 개인번호", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "가결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "카드번호", physicalName = "cardno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cardno;

    @ElDtoField(logicalName = "회의제목", physicalName = "meet_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_subject;

    @ElDtoField(logicalName = "회의번호", physicalName = "meet_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_req_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "결의번호체크", physicalName = "unslip_no_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no_chk;

    @ElDtoField(logicalName = "참석자시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "회의시작일", physicalName = "meet_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_start_ymd;

    @ElDtoField(logicalName = "회의종료일", physicalName = "meet_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_cls_ymd;

    @ElDtoField(logicalName = "회의시작시간", physicalName = "meet_start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_start_time;

    @ElDtoField(logicalName = "회의종료시간", physicalName = "meet_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_cls_time;

    @ElDtoField(logicalName = "회의시작시", physicalName = "meet_start_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_start_hour;

    @ElDtoField(logicalName = "회의종료시", physicalName = "meet_cls_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_cls_hour;

    @ElDtoField(logicalName = "조회구분", physicalName = "inqr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inqr_clsf;

    @ElDtoField(logicalName = "참석자성명", physicalName = "attend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_nm;

    @ElDtoField(logicalName = "출장신청번호리스트", physicalName = "req_no_list", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no_list;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "role_syspayno")
    public String getRole_syspayno(){
        return role_syspayno;
    }

    @ElVoField(physicalName = "role_syspayno")
    public void setRole_syspayno(String role_syspayno){
        this.role_syspayno = role_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "cardno")
    public String getCardno(){
        return cardno;
    }

    @ElVoField(physicalName = "cardno")
    public void setCardno(String cardno){
        this.cardno = cardno;
    }

    @ElVoField(physicalName = "meet_subject")
    public String getMeet_subject(){
        return meet_subject;
    }

    @ElVoField(physicalName = "meet_subject")
    public void setMeet_subject(String meet_subject){
        this.meet_subject = meet_subject;
    }

    @ElVoField(physicalName = "meet_req_no")
    public String getMeet_req_no(){
        return meet_req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public void setMeet_req_no(String meet_req_no){
        this.meet_req_no = meet_req_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "unslip_no_chk")
    public String getUnslip_no_chk(){
        return unslip_no_chk;
    }

    @ElVoField(physicalName = "unslip_no_chk")
    public void setUnslip_no_chk(String unslip_no_chk){
        this.unslip_no_chk = unslip_no_chk;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "meet_start_ymd")
    public String getMeet_start_ymd(){
        return meet_start_ymd;
    }

    @ElVoField(physicalName = "meet_start_ymd")
    public void setMeet_start_ymd(String meet_start_ymd){
        this.meet_start_ymd = meet_start_ymd;
    }

    @ElVoField(physicalName = "meet_cls_ymd")
    public String getMeet_cls_ymd(){
        return meet_cls_ymd;
    }

    @ElVoField(physicalName = "meet_cls_ymd")
    public void setMeet_cls_ymd(String meet_cls_ymd){
        this.meet_cls_ymd = meet_cls_ymd;
    }

    @ElVoField(physicalName = "meet_start_time")
    public String getMeet_start_time(){
        return meet_start_time;
    }

    @ElVoField(physicalName = "meet_start_time")
    public void setMeet_start_time(String meet_start_time){
        this.meet_start_time = meet_start_time;
    }

    @ElVoField(physicalName = "meet_cls_time")
    public String getMeet_cls_time(){
        return meet_cls_time;
    }

    @ElVoField(physicalName = "meet_cls_time")
    public void setMeet_cls_time(String meet_cls_time){
        this.meet_cls_time = meet_cls_time;
    }

    @ElVoField(physicalName = "meet_start_hour")
    public String getMeet_start_hour(){
        return meet_start_hour;
    }

    @ElVoField(physicalName = "meet_start_hour")
    public void setMeet_start_hour(String meet_start_hour){
        this.meet_start_hour = meet_start_hour;
    }

    @ElVoField(physicalName = "meet_cls_hour")
    public String getMeet_cls_hour(){
        return meet_cls_hour;
    }

    @ElVoField(physicalName = "meet_cls_hour")
    public void setMeet_cls_hour(String meet_cls_hour){
        this.meet_cls_hour = meet_cls_hour;
    }

    @ElVoField(physicalName = "inqr_clsf")
    public String getInqr_clsf(){
        return inqr_clsf;
    }

    @ElVoField(physicalName = "inqr_clsf")
    public void setInqr_clsf(String inqr_clsf){
        this.inqr_clsf = inqr_clsf;
    }

    @ElVoField(physicalName = "attend_nm")
    public String getAttend_nm(){
        return attend_nm;
    }

    @ElVoField(physicalName = "attend_nm")
    public void setAttend_nm(String attend_nm){
        this.attend_nm = attend_nm;
    }

    @ElVoField(physicalName = "req_no_list")
    public String getReq_no_list(){
        return req_no_list;
    }

    @ElVoField(physicalName = "req_no_list")
    public void setReq_no_list(String req_no_list){
        this.req_no_list = req_no_list;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetSearchVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("role_syspayno").append("=").append(role_syspayno).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("cardno").append("=").append(cardno).append(",");
        sb.append("meet_subject").append("=").append(meet_subject).append(",");
        sb.append("meet_req_no").append("=").append(meet_req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("unslip_no_chk").append("=").append(unslip_no_chk).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("meet_start_ymd").append("=").append(meet_start_ymd).append(",");
        sb.append("meet_cls_ymd").append("=").append(meet_cls_ymd).append(",");
        sb.append("meet_start_time").append("=").append(meet_start_time).append(",");
        sb.append("meet_cls_time").append("=").append(meet_cls_time).append(",");
        sb.append("meet_start_hour").append("=").append(meet_start_hour).append(",");
        sb.append("meet_cls_hour").append("=").append(meet_cls_hour).append(",");
        sb.append("inqr_clsf").append("=").append(inqr_clsf).append(",");
        sb.append("attend_nm").append("=").append(attend_nm).append(",");
        sb.append("req_no_list").append("=").append(req_no_list);
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
