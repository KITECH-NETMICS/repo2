package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumApyEduCpacpVo")
public class HumApyEduCpacpVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyEduCpacpVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
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
  
    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "jobCd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;
  
    @ElDtoField(logicalName = "educAmt", physicalName = "educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_amt;
  
    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;
  
    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;
  
    @ElDtoField(logicalName = "educYmd", physicalName = "educ_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_ymd;
  
    @ElDtoField(logicalName = "educTime", physicalName = "educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_time;
  
    @ElDtoField(logicalName = "educContnt", physicalName = "educ_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_contnt;
  
    @ElDtoField(logicalName = "rptEducAmt", physicalName = "rpt_educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_educ_amt;
  
    @ElDtoField(logicalName = "attendYn", physicalName = "attend_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_yn;
  
    @ElDtoField(logicalName = "sumamtstr", physicalName = "sumamtstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sumamtstr;
    
    @ElDtoField(logicalName = "duty_cd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;
    
    @ElDtoField(logicalName = "rpt_req_no", physicalName = "rpt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_no;
    
    @ElDtoField(logicalName = "rptEducContnt", physicalName = "rpt_educ_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_educ_contnt;    
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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
  
    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }
  
    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }
  
    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public String getEduc_amt(){
        return educ_amt;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public void setEduc_amt(String educ_amt){
        this.educ_amt = educ_amt;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }
  
    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }
  
    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }
  
    @ElVoField(physicalName = "educ_ymd")
    public String getEduc_ymd(){
        return educ_ymd;
    }
  
    @ElVoField(physicalName = "educ_ymd")
    public void setEduc_ymd(String educ_ymd){
        this.educ_ymd = educ_ymd;
    }
  
    @ElVoField(physicalName = "educ_time")
    public String getEduc_time(){
        return educ_time;
    }
  
    @ElVoField(physicalName = "educ_time")
    public void setEduc_time(String educ_time){
        this.educ_time = educ_time;
    }
  
    @ElVoField(physicalName = "educ_contnt")
    public String getEduc_contnt(){
        return educ_contnt;
    }
  
    @ElVoField(physicalName = "educ_contnt")
    public void setEduc_contnt(String educ_contnt){
        this.educ_contnt = educ_contnt;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public String getRpt_educ_amt(){
        return rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public void setRpt_educ_amt(String rpt_educ_amt){
        this.rpt_educ_amt = rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "attend_yn")
    public String getAttend_yn(){
        return attend_yn;
    }
  
    @ElVoField(physicalName = "attend_yn")
    public void setAttend_yn(String attend_yn){
        this.attend_yn = attend_yn;
    }
  
    @ElVoField(physicalName = "sumamtstr")
    public String getSumamtstr(){
        return sumamtstr;
    }
  
    @ElVoField(physicalName = "sumamtstr")
    public void setSumamtstr(String sumamtstr){
        this.sumamtstr = sumamtstr;
    }
    
    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        return duty_cd;
    }
  
    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }
    
    @ElVoField(physicalName = "rpt_req_no")
    public String getRpt_req_no(){
        return rpt_req_no;
    }
  
    @ElVoField(physicalName = "rpt_req_no")
    public void setRpt_req_no(String rpt_req_no){
        this.rpt_req_no = rpt_req_no;
    }
    
    @ElVoField(physicalName = "rpt_educ_contnt")
    public String getRpt_educ_contnt(){
        return rpt_educ_contnt;
    }
  
    @ElVoField(physicalName = "rpt_educ_contnt")
    public void setRpt_educ_contnt(String rpt_educ_contnt){
        this.rpt_educ_contnt = rpt_educ_contnt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyEduCpacpVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("posi_cd").append("=").append(posi_cd).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("job_cd").append("=").append(job_cd).append(",");
      sb.append("educ_amt").append("=").append(educ_amt).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
      sb.append("educ_ymd").append("=").append(educ_ymd).append(",");
      sb.append("educ_time").append("=").append(educ_time).append(",");
      sb.append("educ_contnt").append("=").append(educ_contnt).append(",");
      sb.append("rpt_educ_amt").append("=").append(rpt_educ_amt).append(",");
      sb.append("attend_yn").append("=").append(attend_yn).append(",");
      sb.append("sumamtstr").append("=").append(sumamtstr).append(",");
      sb.append("duty_cd").append("=").append(duty_cd).append(",");
      sb.append("rpt_req_no").append("=").append(rpt_req_no).append(",");
      sb.append("rpt_educ_contnt").append("=").append(rpt_educ_contnt);
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