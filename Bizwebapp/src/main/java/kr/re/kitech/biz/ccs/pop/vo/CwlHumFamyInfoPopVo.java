package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumFamyInfoExp")
public class CwlHumFamyInfoPopVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CwlHumFamyInfoPopVo(){
  }

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;
  
    @ElDtoField(logicalName = "sResidNo", physicalName = "s_resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String s_resid_no;
  
    @ElDtoField(logicalName = "relat", physicalName = "relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat;
  
    @ElDtoField(logicalName = "ocptNm", physicalName = "ocpt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ocpt_nm;
  
    @ElDtoField(logicalName = "educ", physicalName = "educ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ;
  
    @ElDtoField(logicalName = "postmtNo", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;
  
    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;
  
    @ElDtoField(logicalName = "detlsAddr", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;
  
    @ElDtoField(logicalName = "psinsrYn", physicalName = "psinsr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psinsr_yn;
  
    @ElDtoField(logicalName = "cohbtYn", physicalName = "cohbt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cohbt_yn;
  
    @ElDtoField(logicalName = "obstYn", physicalName = "obst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obst_yn;
  
    @ElDtoField(logicalName = "humanDedctYn", physicalName = "human_dedct_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String human_dedct_yn;
  
    @ElDtoField(logicalName = "famPayamtYn", physicalName = "fam_payamt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_payamt_yn;
  
    @ElDtoField(logicalName = "payamtOccrYmd", physicalName = "payamt_occr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String payamt_occr_ymd;
  
    @ElDtoField(logicalName = "payamtClsYmd", physicalName = "payamt_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String payamt_cls_ymd;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "auinspTotAmt", physicalName = "auinsp_tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auinsp_tot_amt;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;
  
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
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }
  
    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }
  
    @ElVoField(physicalName = "s_resid_no")
    public String getS_resid_no(){
        return s_resid_no;
    }
  
    @ElVoField(physicalName = "s_resid_no")
    public void setS_resid_no(String s_resid_no){
        this.s_resid_no = s_resid_no;
    }
  
    @ElVoField(physicalName = "relat")
    public String getRelat(){
        return relat;
    }
  
    @ElVoField(physicalName = "relat")
    public void setRelat(String relat){
        this.relat = relat;
    }
  
    @ElVoField(physicalName = "ocpt_nm")
    public String getOcpt_nm(){
        return ocpt_nm;
    }
  
    @ElVoField(physicalName = "ocpt_nm")
    public void setOcpt_nm(String ocpt_nm){
        this.ocpt_nm = ocpt_nm;
    }
  
    @ElVoField(physicalName = "educ")
    public String getEduc(){
        return educ;
    }
  
    @ElVoField(physicalName = "educ")
    public void setEduc(String educ){
        this.educ = educ;
    }
  
    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }
  
    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }
  
    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }
  
    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }
  
    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }
  
    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }
  
    @ElVoField(physicalName = "psinsr_yn")
    public String getPsinsr_yn(){
        return psinsr_yn;
    }
  
    @ElVoField(physicalName = "psinsr_yn")
    public void setPsinsr_yn(String psinsr_yn){
        this.psinsr_yn = psinsr_yn;
    }
  
    @ElVoField(physicalName = "cohbt_yn")
    public String getCohbt_yn(){
        return cohbt_yn;
    }
  
    @ElVoField(physicalName = "cohbt_yn")
    public void setCohbt_yn(String cohbt_yn){
        this.cohbt_yn = cohbt_yn;
    }
  
    @ElVoField(physicalName = "obst_yn")
    public String getObst_yn(){
        return obst_yn;
    }
  
    @ElVoField(physicalName = "obst_yn")
    public void setObst_yn(String obst_yn){
        this.obst_yn = obst_yn;
    }
  
    @ElVoField(physicalName = "human_dedct_yn")
    public String getHuman_dedct_yn(){
        return human_dedct_yn;
    }
  
    @ElVoField(physicalName = "human_dedct_yn")
    public void setHuman_dedct_yn(String human_dedct_yn){
        this.human_dedct_yn = human_dedct_yn;
    }
  
    @ElVoField(physicalName = "fam_payamt_yn")
    public String getFam_payamt_yn(){
        return fam_payamt_yn;
    }
  
    @ElVoField(physicalName = "fam_payamt_yn")
    public void setFam_payamt_yn(String fam_payamt_yn){
        this.fam_payamt_yn = fam_payamt_yn;
    }
  
    @ElVoField(physicalName = "payamt_occr_ymd")
    public String getPayamt_occr_ymd(){
        return payamt_occr_ymd;
    }
  
    @ElVoField(physicalName = "payamt_occr_ymd")
    public void setPayamt_occr_ymd(String payamt_occr_ymd){
        this.payamt_occr_ymd = payamt_occr_ymd;
    }
  
    @ElVoField(physicalName = "payamt_cls_ymd")
    public String getPayamt_cls_ymd(){
        return payamt_cls_ymd;
    }
  
    @ElVoField(physicalName = "payamt_cls_ymd")
    public void setPayamt_cls_ymd(String payamt_cls_ymd){
        this.payamt_cls_ymd = payamt_cls_ymd;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "auinsp_tot_amt")
    public String getAuinsp_tot_amt(){
        return auinsp_tot_amt;
    }
  
    @ElVoField(physicalName = "auinsp_tot_amt")
    public void setAuinsp_tot_amt(String auinsp_tot_amt){
        this.auinsp_tot_amt = auinsp_tot_amt;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
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
      sb.append("HumFamyInfoVo [");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("resid_no").append("=").append(resid_no).append(",");
      sb.append("s_resid_no").append("=").append(s_resid_no).append(",");
      sb.append("relat").append("=").append(relat).append(",");
      sb.append("ocpt_nm").append("=").append(ocpt_nm).append(",");
      sb.append("educ").append("=").append(educ).append(",");
      sb.append("postmt_no").append("=").append(postmt_no).append(",");
      sb.append("addr").append("=").append(addr).append(",");
      sb.append("detls_addr").append("=").append(detls_addr).append(",");
      sb.append("psinsr_yn").append("=").append(psinsr_yn).append(",");
      sb.append("cohbt_yn").append("=").append(cohbt_yn).append(",");
      sb.append("obst_yn").append("=").append(obst_yn).append(",");
      sb.append("human_dedct_yn").append("=").append(human_dedct_yn).append(",");
      sb.append("fam_payamt_yn").append("=").append(fam_payamt_yn).append(",");
      sb.append("payamt_occr_ymd").append("=").append(payamt_occr_ymd).append(",");
      sb.append("payamt_cls_ymd").append("=").append(payamt_cls_ymd).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("auinsp_tot_amt").append("=").append(auinsp_tot_amt).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
      sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
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