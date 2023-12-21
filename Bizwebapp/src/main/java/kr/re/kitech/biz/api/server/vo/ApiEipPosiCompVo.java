package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "보직자재실현황VO")
public class ApiEipPosiCompVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipPosiCompVo(){
    }

    @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String flag;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cnt;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "goal", physicalName = "goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String goal;

    @ElDtoField(logicalName = "region", physicalName = "region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region;

    @ElDtoField(logicalName = "duty_nm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_nm;

    @ElDtoField(logicalName = "state_nm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String state_nm;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String email;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ext_no;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mobile;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_cd;

    @ElDtoField(logicalName = "출장", physicalName = "bussiness_trip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bussiness_trip;

    @ElDtoField(logicalName = "휴가", physicalName = "vacation", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String vacation;

    @ElDtoField(logicalName = "휴직_파견", physicalName = "leave_dispatch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String leave_dispatch;

    @ElDtoField(logicalName = "근무", physicalName = "work", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work;

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        String ret = this.flag;
        return ret;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        String ret = this.cnt;
        return ret;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "goal")
    public String getGoal(){
        String ret = this.goal;
        return ret;
    }

    @ElVoField(physicalName = "goal")
    public void setGoal(String goal){
        this.goal = goal;
    }

    @ElVoField(physicalName = "region")
    public String getRegion(){
        String ret = this.region;
        return ret;
    }

    @ElVoField(physicalName = "region")
    public void setRegion(String region){
        this.region = region;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        String ret = this.duty_nm;
        return ret;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        String ret = this.state_nm;
        return ret;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        String ret = this.email;
        return ret;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        String ret = this.ext_no;
        return ret;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        String ret = this.mobile;
        return ret;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        String ret = this.dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "bussiness_trip")
    public String getBussiness_trip(){
        String ret = this.bussiness_trip;
        return ret;
    }

    @ElVoField(physicalName = "bussiness_trip")
    public void setBussiness_trip(String bussiness_trip){
        this.bussiness_trip = bussiness_trip;
    }

    @ElVoField(physicalName = "vacation")
    public String getVacation(){
        String ret = this.vacation;
        return ret;
    }

    @ElVoField(physicalName = "vacation")
    public void setVacation(String vacation){
        this.vacation = vacation;
    }

    @ElVoField(physicalName = "leave_dispatch")
    public String getLeave_dispatch(){
        String ret = this.leave_dispatch;
        return ret;
    }

    @ElVoField(physicalName = "leave_dispatch")
    public void setLeave_dispatch(String leave_dispatch){
        this.leave_dispatch = leave_dispatch;
    }

    @ElVoField(physicalName = "work")
    public String getWork(){
        String ret = this.work;
        return ret;
    }

    @ElVoField(physicalName = "work")
    public void setWork(String work){
        this.work = work;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipPosiCompVo [");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("goal").append("=").append(goal).append(",");
        sb.append("region").append("=").append(region).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("bussiness_trip").append("=").append(bussiness_trip).append(",");
        sb.append("vacation").append("=").append(vacation).append(",");
        sb.append("leave_dispatch").append("=").append(leave_dispatch).append(",");
        sb.append("work").append("=").append(work);
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
