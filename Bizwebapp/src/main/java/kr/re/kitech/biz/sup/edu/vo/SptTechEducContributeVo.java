package kr.re.kitech.biz.sup.edu.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducContributeExp")
public class SptTechEducContributeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTechEducContributeVo(){
  }

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "bizClsfNm", physicalName = "biz_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf_nm;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;
  
    @ElDtoField(logicalName = "stakeDept", physicalName = "stake_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_dept;
  
    @ElDtoField(logicalName = "contributeRt", physicalName = "contribute_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contribute_rt;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;
  
    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }
  
    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public String getBiz_clsf_nm(){
        return biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public void setBiz_clsf_nm(String biz_clsf_nm){
        this.biz_clsf_nm = biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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
  
    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }
  
    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }
  
    @ElVoField(physicalName = "stake_dept")
    public String getStake_dept(){
        return stake_dept;
    }
  
    @ElVoField(physicalName = "stake_dept")
    public void setStake_dept(String stake_dept){
        this.stake_dept = stake_dept;
    }
  
    @ElVoField(physicalName = "contribute_rt")
    public String getContribute_rt(){
        return contribute_rt;
    }
  
    @ElVoField(physicalName = "contribute_rt")
    public void setContribute_rt(String contribute_rt){
        this.contribute_rt = contribute_rt;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTechEducContributeVo [");
      sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("biz_clsf_nm").append("=").append(biz_clsf_nm).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("ext_no").append("=").append(ext_no).append(",");
      sb.append("stake_dept").append("=").append(stake_dept).append(",");
      sb.append("contribute_rt").append("=").append(contribute_rt).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("cud_type").append("=").append(cud_type);
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