package kr.re.kitech.biz.sup.edu.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducAttnceExp")
public class SptTechEducAttnceVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTechEducAttnceVo(){
  }

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "bizClsfNm", physicalName = "biz_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf_nm;
  
    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
  
    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
  
    @ElDtoField(logicalName = "reprsPsn", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;
  
    @ElDtoField(logicalName = "cmpyAddr", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;
  
    @ElDtoField(logicalName = "cmpyReprsTel", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "attnceNm", physicalName = "attnce_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_nm;
  
    @ElDtoField(logicalName = "attnceMobile", physicalName = "attnce_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_mobile;
  
    @ElDtoField(logicalName = "attnceEmail", physicalName = "attnce_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_email;
  
    @ElDtoField(logicalName = "suptClsf", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "userClsf", physicalName = "user_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_clsf;
    
    @ElDtoField(logicalName = "userClsfNm", physicalName = "user_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_clsf_nm;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
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
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }
  
    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }
  
    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }
  
    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }
  
    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }
  
    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "attnce_nm")
    public String getAttnce_nm(){
        return attnce_nm;
    }
  
    @ElVoField(physicalName = "attnce_nm")
    public void setAttnce_nm(String attnce_nm){
        this.attnce_nm = attnce_nm;
    }
  
    @ElVoField(physicalName = "attnce_mobile")
    public String getAttnce_mobile(){
        return attnce_mobile;
    }
  
    @ElVoField(physicalName = "attnce_mobile")
    public void setAttnce_mobile(String attnce_mobile){
        this.attnce_mobile = attnce_mobile;
    }
  
    @ElVoField(physicalName = "attnce_email")
    public String getAttnce_email(){
        return attnce_email;
    }
  
    @ElVoField(physicalName = "attnce_email")
    public void setAttnce_email(String attnce_email){
        this.attnce_email = attnce_email;
    }
  
    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }
  
    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    } 
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "user_clsf")
    public String getUser_clsf(){
        return user_clsf;
    }
  
    @ElVoField(physicalName = "user_clsf")
    public void setUser_clsf(String user_clsf){
        this.user_clsf = user_clsf;
    }
    
    @ElVoField(physicalName = "user_clsf_nm")
    public String getUser_clsf_nm(){
    	return user_clsf_nm;
    }
    
    @ElVoField(physicalName = "user_clsf_nm")
    public void setUser_clsf_nm(String user_clsf_nm){
    	this.user_clsf_nm = user_clsf_nm;
    }
    
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTechEducAttnceVo [");
      sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("biz_clsf_nm").append("=").append(biz_clsf_nm).append(",");
      sb.append("cust_no").append("=").append(cust_no).append(",");
      sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
      sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
      sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
      sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("attnce_nm").append("=").append(attnce_nm).append(",");
      sb.append("attnce_mobile").append("=").append(attnce_mobile).append(",");
      sb.append("attnce_email").append("=").append(attnce_email).append(",");
      sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("user_clsf").append("=").append(user_clsf).append(",");
      sb.append("user_clsf_nm").append("=").append(user_clsf_nm).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("posi_nm").append("=").append(posi_nm);
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