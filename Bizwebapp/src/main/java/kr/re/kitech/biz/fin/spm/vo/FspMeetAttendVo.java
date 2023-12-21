package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의참석자 Vo")
public class FspMeetAttendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspMeetAttendVo(){
    }

    @ElDtoField(logicalName = "회의신청번호", physicalName = "meet_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_req_no;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "사용자구분", physicalName = "user_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_clsf;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "사용자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "휴대폰번호", physicalName = "mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "타회의참석횟수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "ctr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_req_no;

    @ElDtoField(logicalName = "국내출장정산번호", physicalName = "adjst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_no;

    @ElDtoField(logicalName = "회의시작일자", physicalName = "meet_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_start_ymd;

    @ElDtoField(logicalName = "회의종료일자", physicalName = "meet_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_cls_ymd;

    @ElDtoField(logicalName = "회의시작시간", physicalName = "meet_start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_start_time;

    @ElDtoField(logicalName = "회의종료시간", physicalName = "meet_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_cls_time;

    @ElDtoField(logicalName = "작성자성명", physicalName = "reg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_nm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "식사여부", physicalName = "meal_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int meal_cnt;

    @ElVoField(physicalName = "meet_req_no")
    public String getMeet_req_no(){
        return meet_req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public void setMeet_req_no(String meet_req_no){
        this.meet_req_no = meet_req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "user_clsf")
    public String getUser_clsf(){
        return user_clsf;
    }

    @ElVoField(physicalName = "user_clsf")
    public void setUser_clsf(String user_clsf){
        this.user_clsf = user_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "mobile_no")
    public String getMobile_no(){
        return mobile_no;
    }

    @ElVoField(physicalName = "mobile_no")
    public void setMobile_no(String mobile_no){
        this.mobile_no = mobile_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public String getCtr_req_no(){
        return ctr_req_no;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public void setCtr_req_no(String ctr_req_no){
        this.ctr_req_no = ctr_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public String getAdjst_req_no(){
        return adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public void setAdjst_req_no(String adjst_req_no){
        this.adjst_req_no = adjst_req_no;
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

    @ElVoField(physicalName = "reg_nm")
    public String getReg_nm(){
        return reg_nm;
    }

    @ElVoField(physicalName = "reg_nm")
    public void setReg_nm(String reg_nm){
        this.reg_nm = reg_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "meal_cnt")
    public int getMeal_cnt(){
        return meal_cnt;
    }

    @ElVoField(physicalName = "meal_cnt")
    public void setMeal_cnt(int meal_cnt){
        this.meal_cnt = meal_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetAttendVo [");
        sb.append("meet_req_no").append("=").append(meet_req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("user_clsf").append("=").append(user_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("mobile_no").append("=").append(mobile_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("ctr_req_no").append("=").append(ctr_req_no).append(",");
        sb.append("adjst_req_no").append("=").append(adjst_req_no).append(",");
        sb.append("meet_start_ymd").append("=").append(meet_start_ymd).append(",");
        sb.append("meet_cls_ymd").append("=").append(meet_cls_ymd).append(",");
        sb.append("meet_start_time").append("=").append(meet_start_time).append(",");
        sb.append("meet_cls_time").append("=").append(meet_cls_time).append(",");
        sb.append("reg_nm").append("=").append(reg_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("meal_cnt").append("=").append(meal_cnt);
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
