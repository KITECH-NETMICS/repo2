package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumPotletGetDepartmentExp")
public class HumPotletGetDepartmentVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumPotletGetDepartmentVo(){
  }

  @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String ymd;

  @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dept_cd;

  @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dept_new_ymd;

  @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String dept_nm;

  @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String nm;

  @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String empno;

  @ElDtoField(logicalName = "goal", physicalName = "goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String goal;

  @ElDtoField(logicalName = "region", physicalName = "region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String region;

  @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String clsf;

  @ElDtoField(logicalName = "stateNm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String state_nm;

  @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String flag;

  @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String posi_nm;

  @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String ext_no;

  @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String mobile;

  @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String email;

  @ElVoField(physicalName = "ymd")
  public String getYmd(){
      return ymd;
  }

  @ElVoField(physicalName = "ymd")
  public void setYmd(String ymd){
      this.ymd = ymd;
  }

  @ElVoField(physicalName = "dept_cd")
  public String getDept_cd(){
      return dept_cd;
  }

  @ElVoField(physicalName = "dept_cd")
  public void setDept_cd(String dept_cd){
      this.dept_cd = dept_cd;
  }

  @ElVoField(physicalName = "dept_new_ymd")
  public String getDept_new_ymd(){
      return dept_new_ymd;
  }

  @ElVoField(physicalName = "dept_new_ymd")
  public void setDept_new_ymd(String dept_new_ymd){
      this.dept_new_ymd = dept_new_ymd;
  }

  @ElVoField(physicalName = "dept_nm")
  public String getDept_nm(){
      return dept_nm;
  }

  @ElVoField(physicalName = "dept_nm")
  public void setDept_nm(String dept_nm){
      this.dept_nm = dept_nm;
  }

  @ElVoField(physicalName = "nm")
  public String getNm(){
      return nm;
  }

  @ElVoField(physicalName = "nm")
  public void setNm(String nm){
      this.nm = nm;
  }

  @ElVoField(physicalName = "empno")
  public String getEmpno(){
      return empno;
  }

  @ElVoField(physicalName = "empno")
  public void setEmpno(String empno){
      this.empno = empno;
  }

  @ElVoField(physicalName = "goal")
  public String getGoal(){
      return goal;
  }

  @ElVoField(physicalName = "goal")
  public void setGoal(String goal){
      this.goal = goal;
  }

  @ElVoField(physicalName = "region")
  public String getRegion(){
      return region;
  }

  @ElVoField(physicalName = "region")
  public void setRegion(String region){
      this.region = region;
  }

  @ElVoField(physicalName = "clsf")
  public String getClsf(){
      return clsf;
  }

  @ElVoField(physicalName = "clsf")
  public void setClsf(String clsf){
      this.clsf = clsf;
  }

  @ElVoField(physicalName = "state_nm")
  public String getState_nm(){
      return state_nm;
  }

  @ElVoField(physicalName = "state_nm")
  public void setState_nm(String state_nm){
      this.state_nm = state_nm;
  }

  @ElVoField(physicalName = "flag")
  public String getFlag(){
      return flag;
  }

  @ElVoField(physicalName = "flag")
  public void setFlag(String flag){
      this.flag = flag;
  }

  @ElVoField(physicalName = "posi_nm")
  public String getPosi_nm(){
      return posi_nm;
  }

  @ElVoField(physicalName = "posi_nm")
  public void setPosi_nm(String posi_nm){
      this.posi_nm = posi_nm;
  }

  @ElVoField(physicalName = "ext_no")
  public String getExt_no(){
      return ext_no;
  }

  @ElVoField(physicalName = "ext_no")
  public void setExt_no(String ext_no){
      this.ext_no = ext_no;
  }

  @ElVoField(physicalName = "mobile")
  public String getMobile(){
      return mobile;
  }

  @ElVoField(physicalName = "mobile")
  public void setMobile(String mobile){
      this.mobile = mobile;
  }

  @ElVoField(physicalName = "email")
  public String getEmail(){
      return email;
  }

  @ElVoField(physicalName = "email")
  public void setEmail(String email){
      this.email = email;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumPotletGetDepartmentVo [");
      sb.append("ymd").append("=").append(ymd).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("goal").append("=").append(goal).append(",");
      sb.append("region").append("=").append(region).append(",");
      sb.append("clsf").append("=").append(clsf).append(",");
      sb.append("state_nm").append("=").append(state_nm).append(",");
      sb.append("flag").append("=").append(flag).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("ext_no").append("=").append(ext_no).append(",");
      sb.append("mobile").append("=").append(mobile).append(",");
      sb.append("email").append("=").append(email);
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