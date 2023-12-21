package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록 조회 Vo")
public class FspMeetVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspMeetVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "회의번호", physicalName = "meet_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_req_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회의명", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "회의일자", physicalName = "meet_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_ymd;

    @ElDtoField(logicalName = "회의시간", physicalName = "meet_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_time;

    @ElDtoField(logicalName = "회의제목", physicalName = "meet_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_subject;

    @ElDtoField(logicalName = "회의참석자", physicalName = "meet_member", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_member;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "참석자 부서코드", physicalName = "meet_member_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_member_dept_cd;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계정책임자부서명", physicalName = "accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "출장신청계정번호", physicalName = "biztrip_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_accnt_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public String getMeet_req_no(){
        return meet_req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public void setMeet_req_no(String meet_req_no){
        this.meet_req_no = meet_req_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "meet_ymd")
    public String getMeet_ymd(){
        return meet_ymd;
    }

    @ElVoField(physicalName = "meet_ymd")
    public void setMeet_ymd(String meet_ymd){
        this.meet_ymd = meet_ymd;
    }

    @ElVoField(physicalName = "meet_time")
    public String getMeet_time(){
        return meet_time;
    }

    @ElVoField(physicalName = "meet_time")
    public void setMeet_time(String meet_time){
        this.meet_time = meet_time;
    }

    @ElVoField(physicalName = "meet_subject")
    public String getMeet_subject(){
        return meet_subject;
    }

    @ElVoField(physicalName = "meet_subject")
    public void setMeet_subject(String meet_subject){
        this.meet_subject = meet_subject;
    }

    @ElVoField(physicalName = "meet_member")
    public String getMeet_member(){
        return meet_member;
    }

    @ElVoField(physicalName = "meet_member")
    public void setMeet_member(String meet_member){
        this.meet_member = meet_member;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "meet_member_dept_cd")
    public String getMeet_member_dept_cd(){
        return meet_member_dept_cd;
    }

    @ElVoField(physicalName = "meet_member_dept_cd")
    public void setMeet_member_dept_cd(String meet_member_dept_cd){
        this.meet_member_dept_cd = meet_member_dept_cd;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public String getAccnt_rspns_dept_nm(){
        return accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public void setAccnt_rspns_dept_nm(String accnt_rspns_dept_nm){
        this.accnt_rspns_dept_nm = accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "biztrip_accnt_no")
    public String getBiztrip_accnt_no(){
        return biztrip_accnt_no;
    }

    @ElVoField(physicalName = "biztrip_accnt_no")
    public void setBiztrip_accnt_no(String biztrip_accnt_no){
        this.biztrip_accnt_no = biztrip_accnt_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("meet_req_no").append("=").append(meet_req_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("meet_ymd").append("=").append(meet_ymd).append(",");
        sb.append("meet_time").append("=").append(meet_time).append(",");
        sb.append("meet_subject").append("=").append(meet_subject).append(",");
        sb.append("meet_member").append("=").append(meet_member).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("meet_member_dept_cd").append("=").append(meet_member_dept_cd).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_dept_nm").append("=").append(accnt_rspns_dept_nm).append(",");
        sb.append("biztrip_accnt_no").append("=").append(biztrip_accnt_no);
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
