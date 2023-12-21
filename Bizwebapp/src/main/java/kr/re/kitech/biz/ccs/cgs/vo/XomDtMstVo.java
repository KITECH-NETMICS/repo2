package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "XomDtMstExp")
public class XomDtMstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public XomDtMstVo(){
  }

  @ElDtoField(logicalName = "reqFrYmd", physicalName = "req_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_fr_ymd;

  @ElDtoField(logicalName = "reqToYmd", physicalName = "req_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_to_ymd;

  @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String ymd;

  @ElDtoField(logicalName = "applyDeptCd", physicalName = "apply_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String apply_dept_cd;

  @ElDtoField(logicalName = "day", physicalName = "day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String day;

  @ElDtoField(logicalName = "dayNo", physicalName = "day_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String day_no;

  @ElDtoField(logicalName = "offYn", physicalName = "off_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String off_yn;

  @ElDtoField(logicalName = "offRmk", physicalName = "off_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String off_rmk;

  @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rmk;

  @ElDtoField(logicalName = "monthWeek", physicalName = "month_week", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String month_week;

  @ElDtoField(logicalName = "yearWeek", physicalName = "year_week", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String year_week;

  @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String regst_psn_syspayno;

  @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String regst_daytm;

  @ElDtoField(logicalName = "updtPsnSyspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String updt_psn_syspayno;

  @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String updt_daytm;

  @ElVoField(physicalName = "req_fr_ymd")
  public String getReq_fr_ymd(){
      return req_fr_ymd;
  }

  @ElVoField(physicalName = "req_fr_ymd")
  public void setReq_fr_ymd(String req_fr_ymd){
      this.req_fr_ymd = req_fr_ymd;
  }

  @ElVoField(physicalName = "req_to_ymd")
  public String getReq_to_ymd(){
      return req_to_ymd;
  }

  @ElVoField(physicalName = "req_to_ymd")
  public void setReq_to_ymd(String req_to_ymd){
      this.req_to_ymd = req_to_ymd;
  }

  @ElVoField(physicalName = "ymd")
  public String getYmd(){
      return ymd;
  }

  @ElVoField(physicalName = "ymd")
  public void setYmd(String ymd){
      this.ymd = ymd;
  }

  @ElVoField(physicalName = "apply_dept_cd")
  public String getApply_dept_cd(){
      return apply_dept_cd;
  }

  @ElVoField(physicalName = "apply_dept_cd")
  public void setApply_dept_cd(String apply_dept_cd){
      this.apply_dept_cd = apply_dept_cd;
  }

  @ElVoField(physicalName = "day")
  public String getDay(){
      return day;
  }

  @ElVoField(physicalName = "day")
  public void setDay(String day){
      this.day = day;
  }

  @ElVoField(physicalName = "day_no")
  public String getDay_no(){
      return day_no;
  }

  @ElVoField(physicalName = "day_no")
  public void setDay_no(String day_no){
      this.day_no = day_no;
  }

  @ElVoField(physicalName = "off_yn")
  public String getOff_yn(){
      return off_yn;
  }

  @ElVoField(physicalName = "off_yn")
  public void setOff_yn(String off_yn){
      this.off_yn = off_yn;
  }

  @ElVoField(physicalName = "off_rmk")
  public String getOff_rmk(){
      return off_rmk;
  }

  @ElVoField(physicalName = "off_rmk")
  public void setOff_rmk(String off_rmk){
      this.off_rmk = off_rmk;
  }

  @ElVoField(physicalName = "rmk")
  public String getRmk(){
      return rmk;
  }

  @ElVoField(physicalName = "rmk")
  public void setRmk(String rmk){
      this.rmk = rmk;
  }

  @ElVoField(physicalName = "month_week")
  public String getMonth_week(){
      return month_week;
  }

  @ElVoField(physicalName = "month_week")
  public void setMonth_week(String month_week){
      this.month_week = month_week;
  }

  @ElVoField(physicalName = "year_week")
  public String getYear_week(){
      return year_week;
  }

  @ElVoField(physicalName = "year_week")
  public void setYear_week(String year_week){
      this.year_week = year_week;
  }

  @ElVoField(physicalName = "regst_psn_syspayno")
  public String getRegst_psn_syspayno(){
      return regst_psn_syspayno;
  }

  @ElVoField(physicalName = "regst_psn_syspayno")
  public void setRegst_psn_syspayno(String regst_psn_syspayno){
      this.regst_psn_syspayno = regst_psn_syspayno;
  }

  @ElVoField(physicalName = "regst_daytm")
  public String getRegst_daytm(){
      return regst_daytm;
  }

  @ElVoField(physicalName = "regst_daytm")
  public void setRegst_daytm(String regst_daytm){
      this.regst_daytm = regst_daytm;
  }

  @ElVoField(physicalName = "updt_psn_syspayno")
  public String getUpdt_psn_syspayno(){
      return updt_psn_syspayno;
  }

  @ElVoField(physicalName = "updt_psn_syspayno")
  public void setUpdt_psn_syspayno(String updt_psn_syspayno){
      this.updt_psn_syspayno = updt_psn_syspayno;
  }

  @ElVoField(physicalName = "updt_daytm")
  public String getUpdt_daytm(){
      return updt_daytm;
  }

  @ElVoField(physicalName = "updt_daytm")
  public void setUpdt_daytm(String updt_daytm){
      this.updt_daytm = updt_daytm;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("XomDtMstVo [");
      sb.append("req_fr_ymd").append("=").append(req_fr_ymd).append(",");
      sb.append("req_to_ymd").append("=").append(req_to_ymd).append(",");
      sb.append("ymd").append("=").append(ymd).append(",");
      sb.append("apply_dept_cd").append("=").append(apply_dept_cd).append(",");
      sb.append("day").append("=").append(day).append(",");
      sb.append("day_no").append("=").append(day_no).append(",");
      sb.append("off_yn").append("=").append(off_yn).append(",");
      sb.append("off_rmk").append("=").append(off_rmk).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("month_week").append("=").append(month_week).append(",");
      sb.append("year_week").append("=").append(year_week).append(",");
      sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
      sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
      sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
      sb.append("updt_daytm").append("=").append(updt_daytm);
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