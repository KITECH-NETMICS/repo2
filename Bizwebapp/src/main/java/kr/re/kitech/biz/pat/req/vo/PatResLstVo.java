package kr.re.kitech.biz.pat.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatResLstExp")
public class PatResLstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatResLstVo(){
  }

    @ElDtoField(logicalName = "accntNoLike", physicalName = "accnt_no_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_like;
  
    @ElDtoField(logicalName = "accntNoNmLike", physicalName = "accnt_no_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm_like;
  
    @ElDtoField(logicalName = "accntRspnsNmLike", physicalName = "accnt_rspns_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm_like;
  
    @ElDtoField(logicalName = "reschRspnsNmLike", physicalName = "resch_rspns_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_nm_like;
  
    @ElDtoField(logicalName = "accntClsf", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;
  
    @ElDtoField(logicalName = "prjTerm", physicalName = "prj_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_term;
  
    @ElDtoField(logicalName = "accntRspnsSyspayno", physicalName = "accnt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_syspayno;
  
    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;
  
    @ElDtoField(logicalName = "reschRspnsSyspayno", physicalName = "resch_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_syspayno;
  
    @ElDtoField(logicalName = "reschRspnsNm", physicalName = "resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_nm;
  
    @ElDtoField(logicalName = "accntState", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;
  
    @ElDtoField(logicalName = "accntStateNm", physicalName = "accnt_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state_nm;
  
    @ElDtoField(logicalName = "prjState", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state;
  
    @ElDtoField(logicalName = "accntClsfNm", physicalName = "accnt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf_nm;
  
    @ElDtoField(logicalName = "progress", physicalName = "progress", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress;
  
    @ElDtoField(logicalName = "bsnsCdInoutNm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;
  
    @ElVoField(physicalName = "accnt_no_like")
    public String getAccnt_no_like(){
        return accnt_no_like;
    }
  
    @ElVoField(physicalName = "accnt_no_like")
    public void setAccnt_no_like(String accnt_no_like){
        this.accnt_no_like = accnt_no_like;
    }
  
    @ElVoField(physicalName = "accnt_no_nm_like")
    public String getAccnt_no_nm_like(){
        return accnt_no_nm_like;
    }
  
    @ElVoField(physicalName = "accnt_no_nm_like")
    public void setAccnt_no_nm_like(String accnt_no_nm_like){
        this.accnt_no_nm_like = accnt_no_nm_like;
    }
  
    @ElVoField(physicalName = "accnt_rspns_nm_like")
    public String getAccnt_rspns_nm_like(){
        return accnt_rspns_nm_like;
    }
  
    @ElVoField(physicalName = "accnt_rspns_nm_like")
    public void setAccnt_rspns_nm_like(String accnt_rspns_nm_like){
        this.accnt_rspns_nm_like = accnt_rspns_nm_like;
    }
  
    @ElVoField(physicalName = "resch_rspns_nm_like")
    public String getResch_rspns_nm_like(){
        return resch_rspns_nm_like;
    }
  
    @ElVoField(physicalName = "resch_rspns_nm_like")
    public void setResch_rspns_nm_like(String resch_rspns_nm_like){
        this.resch_rspns_nm_like = resch_rspns_nm_like;
    }
  
    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }
  
    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }
  
    @ElVoField(physicalName = "prj_term")
    public String getPrj_term(){
        return prj_term;
    }
  
    @ElVoField(physicalName = "prj_term")
    public void setPrj_term(String prj_term){
        this.prj_term = prj_term;
    }
  
    @ElVoField(physicalName = "accnt_rspns_syspayno")
    public String getAccnt_rspns_syspayno(){
        return accnt_rspns_syspayno;
    }
  
    @ElVoField(physicalName = "accnt_rspns_syspayno")
    public void setAccnt_rspns_syspayno(String accnt_rspns_syspayno){
        this.accnt_rspns_syspayno = accnt_rspns_syspayno;
    }
  
    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }
  
    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }
  
    @ElVoField(physicalName = "resch_rspns_syspayno")
    public String getResch_rspns_syspayno(){
        return resch_rspns_syspayno;
    }
  
    @ElVoField(physicalName = "resch_rspns_syspayno")
    public void setResch_rspns_syspayno(String resch_rspns_syspayno){
        this.resch_rspns_syspayno = resch_rspns_syspayno;
    }
  
    @ElVoField(physicalName = "resch_rspns_nm")
    public String getResch_rspns_nm(){
        return resch_rspns_nm;
    }
  
    @ElVoField(physicalName = "resch_rspns_nm")
    public void setResch_rspns_nm(String resch_rspns_nm){
        this.resch_rspns_nm = resch_rspns_nm;
    }
  
    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }
  
    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }
  
    @ElVoField(physicalName = "accnt_state_nm")
    public String getAccnt_state_nm(){
        return accnt_state_nm;
    }
  
    @ElVoField(physicalName = "accnt_state_nm")
    public void setAccnt_state_nm(String accnt_state_nm){
        this.accnt_state_nm = accnt_state_nm;
    }
  
    @ElVoField(physicalName = "prj_state")
    public String getPrj_state(){
        return prj_state;
    }
  
    @ElVoField(physicalName = "prj_state")
    public void setPrj_state(String prj_state){
        this.prj_state = prj_state;
    }
  
    @ElVoField(physicalName = "accnt_clsf_nm")
    public String getAccnt_clsf_nm(){
        return accnt_clsf_nm;
    }
  
    @ElVoField(physicalName = "accnt_clsf_nm")
    public void setAccnt_clsf_nm(String accnt_clsf_nm){
        this.accnt_clsf_nm = accnt_clsf_nm;
    }
  
    @ElVoField(physicalName = "progress")
    public String getProgress(){
        return progress;
    }
  
    @ElVoField(physicalName = "progress")
    public void setProgress(String progress){
        this.progress = progress;
    }
  
    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }
  
    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatResLstVo [");
      sb.append("accnt_no_like").append("=").append(accnt_no_like).append(",");
      sb.append("accnt_no_nm_like").append("=").append(accnt_no_nm_like).append(",");
      sb.append("accnt_rspns_nm_like").append("=").append(accnt_rspns_nm_like).append(",");
      sb.append("resch_rspns_nm_like").append("=").append(resch_rspns_nm_like).append(",");
      sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("prj_nm").append("=").append(prj_nm).append(",");
      sb.append("prj_term").append("=").append(prj_term).append(",");
      sb.append("accnt_rspns_syspayno").append("=").append(accnt_rspns_syspayno).append(",");
      sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
      sb.append("resch_rspns_syspayno").append("=").append(resch_rspns_syspayno).append(",");
      sb.append("resch_rspns_nm").append("=").append(resch_rspns_nm).append(",");
      sb.append("accnt_state").append("=").append(accnt_state).append(",");
      sb.append("accnt_state_nm").append("=").append(accnt_state_nm).append(",");
      sb.append("prj_state").append("=").append(prj_state).append(",");
      sb.append("accnt_clsf_nm").append("=").append(accnt_clsf_nm).append(",");
      sb.append("progress").append("=").append(progress).append(",");
      sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm);
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