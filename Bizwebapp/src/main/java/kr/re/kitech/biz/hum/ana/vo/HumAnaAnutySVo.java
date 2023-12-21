package kr.re.kitech.biz.hum.ana.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaAnutySExp")
public class HumAnaAnutySVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumAnaAnutySVo(){
  }

    @ElDtoField(logicalName = "belngYrmonFr", physicalName = "belng_yrmon_fr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon_fr;
  
    @ElDtoField(logicalName = "belngYrmonTo", physicalName = "belng_yrmon_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon_to;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "occugrpNm", physicalName = "occugrp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_nm;
  
    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;
  
    @ElDtoField(logicalName = "retireBaseAmt", physicalName = "retire_base_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_base_amt;
  
    @ElDtoField(logicalName = "userAmt", physicalName = "user_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_amt;
  
    @ElDtoField(logicalName = "personAmt", physicalName = "person_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String person_amt;
  
    @ElDtoField(logicalName = "addAmt", physicalName = "add_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String add_amt;
  
    @ElDtoField(logicalName = "pastRetirePay", physicalName = "past_retire_pay", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String past_retire_pay;
  
    @ElDtoField(logicalName = "totAmt", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;
  
    @ElDtoField(logicalName = "avBaseUser", physicalName = "av_base_user", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String av_base_user;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElVoField(physicalName = "belng_yrmon_fr")
    public String getBelng_yrmon_fr(){
        return belng_yrmon_fr;
    }
  
    @ElVoField(physicalName = "belng_yrmon_fr")
    public void setBelng_yrmon_fr(String belng_yrmon_fr){
        this.belng_yrmon_fr = belng_yrmon_fr;
    }
  
    @ElVoField(physicalName = "belng_yrmon_to")
    public String getBelng_yrmon_to(){
        return belng_yrmon_to;
    }
  
    @ElVoField(physicalName = "belng_yrmon_to")
    public void setBelng_yrmon_to(String belng_yrmon_to){
        this.belng_yrmon_to = belng_yrmon_to;
    }
  
    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }
  
    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
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
  
    @ElVoField(physicalName = "occugrp_nm")
    public String getOccugrp_nm(){
        return occugrp_nm;
    }
  
    @ElVoField(physicalName = "occugrp_nm")
    public void setOccugrp_nm(String occugrp_nm){
        this.occugrp_nm = occugrp_nm;
    }
  
    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }
  
    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }
  
    @ElVoField(physicalName = "retire_base_amt")
    public String getRetire_base_amt(){
        return retire_base_amt;
    }
  
    @ElVoField(physicalName = "retire_base_amt")
    public void setRetire_base_amt(String retire_base_amt){
        this.retire_base_amt = retire_base_amt;
    }
  
    @ElVoField(physicalName = "user_amt")
    public String getUser_amt(){
        return user_amt;
    }
  
    @ElVoField(physicalName = "user_amt")
    public void setUser_amt(String user_amt){
        this.user_amt = user_amt;
    }
  
    @ElVoField(physicalName = "person_amt")
    public String getPerson_amt(){
        return person_amt;
    }
  
    @ElVoField(physicalName = "person_amt")
    public void setPerson_amt(String person_amt){
        this.person_amt = person_amt;
    }
  
    @ElVoField(physicalName = "add_amt")
    public String getAdd_amt(){
        return add_amt;
    }
  
    @ElVoField(physicalName = "add_amt")
    public void setAdd_amt(String add_amt){
        this.add_amt = add_amt;
    }
  
    @ElVoField(physicalName = "past_retire_pay")
    public String getPast_retire_pay(){
        return past_retire_pay;
    }
  
    @ElVoField(physicalName = "past_retire_pay")
    public void setPast_retire_pay(String past_retire_pay){
        this.past_retire_pay = past_retire_pay;
    }
  
    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }
  
    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }
  
    @ElVoField(physicalName = "av_base_user")
    public String getAv_base_user(){
        return av_base_user;
    }
  
    @ElVoField(physicalName = "av_base_user")
    public void setAv_base_user(String av_base_user){
        this.av_base_user = av_base_user;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumAnaAnutySVo [");
      sb.append("belng_yrmon_fr").append("=").append(belng_yrmon_fr).append(",");
      sb.append("belng_yrmon_to").append("=").append(belng_yrmon_to).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("occugrp_nm").append("=").append(occugrp_nm).append(",");
      sb.append("resid_no").append("=").append(resid_no).append(",");
      sb.append("retire_base_amt").append("=").append(retire_base_amt).append(",");
      sb.append("user_amt").append("=").append(user_amt).append(",");
      sb.append("person_amt").append("=").append(person_amt).append(",");
      sb.append("add_amt").append("=").append(add_amt).append(",");
      sb.append("past_retire_pay").append("=").append(past_retire_pay).append(",");
      sb.append("tot_amt").append("=").append(tot_amt).append(",");
      sb.append("av_base_user").append("=").append(av_base_user).append(",");
      sb.append("rmk").append("=").append(rmk);
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