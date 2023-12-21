package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResAppOtgtExp")
public class ResAppOtgtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResAppOtgtVo(){
  }

    @ElDtoField(logicalName = "bsnsReqNo", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;
  
    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "selYn", physicalName = "sel_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sel_yn;
  
    @ElDtoField(logicalName = "stateClsf", physicalName = "state_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_clsf;
  
    @ElDtoField(logicalName = "outcmCd", physicalName = "outcm_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outcm_cd;
  
    @ElDtoField(logicalName = "outcmNm", physicalName = "outcm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outcm_nm;
  
    @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;
  
    @ElDtoField(logicalName = "rsltQty", physicalName = "rslt_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rslt_qty;
  
    @ElDtoField(logicalName = "aftFirQty", physicalName = "aft_fir_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_fir_qty;
  
    @ElDtoField(logicalName = "aftFirRsltQty", physicalName = "aft_fir_rslt_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_fir_rslt_qty;
  
    @ElDtoField(logicalName = "aftSecQty", physicalName = "aft_sec_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_sec_qty;
  
    @ElDtoField(logicalName = "aftSecRsltQty", physicalName = "aft_sec_rslt_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_sec_rslt_qty;
  
    @ElDtoField(logicalName = "aftThiQty", physicalName = "aft_thi_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_thi_qty;
  
    @ElDtoField(logicalName = "aftThiRsltQty", physicalName = "aft_thi_rslt_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aft_thi_rslt_qty;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }
  
    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }
  
    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }
  
    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "sel_yn")
    public String getSel_yn(){
        return sel_yn;
    }
  
    @ElVoField(physicalName = "sel_yn")
    public void setSel_yn(String sel_yn){
        this.sel_yn = sel_yn;
    }
  
    @ElVoField(physicalName = "state_clsf")
    public String getState_clsf(){
        return state_clsf;
    }
  
    @ElVoField(physicalName = "state_clsf")
    public void setState_clsf(String state_clsf){
        this.state_clsf = state_clsf;
    }
  
    @ElVoField(physicalName = "outcm_cd")
    public String getOutcm_cd(){
        return outcm_cd;
    }
  
    @ElVoField(physicalName = "outcm_cd")
    public void setOutcm_cd(String outcm_cd){
        this.outcm_cd = outcm_cd;
    }
  
    @ElVoField(physicalName = "outcm_nm")
    public String getOutcm_nm(){
        return outcm_nm;
    }
  
    @ElVoField(physicalName = "outcm_nm")
    public void setOutcm_nm(String outcm_nm){
        this.outcm_nm = outcm_nm;
    }
  
    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }
  
    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }
  
    @ElVoField(physicalName = "rslt_qty")
    public String getRslt_qty(){
        return rslt_qty;
    }
  
    @ElVoField(physicalName = "rslt_qty")
    public void setRslt_qty(String rslt_qty){
        this.rslt_qty = rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_fir_qty")
    public String getAft_fir_qty(){
        return aft_fir_qty;
    }
  
    @ElVoField(physicalName = "aft_fir_qty")
    public void setAft_fir_qty(String aft_fir_qty){
        this.aft_fir_qty = aft_fir_qty;
    }
  
    @ElVoField(physicalName = "aft_fir_rslt_qty")
    public String getAft_fir_rslt_qty(){
        return aft_fir_rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_fir_rslt_qty")
    public void setAft_fir_rslt_qty(String aft_fir_rslt_qty){
        this.aft_fir_rslt_qty = aft_fir_rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_sec_qty")
    public String getAft_sec_qty(){
        return aft_sec_qty;
    }
  
    @ElVoField(physicalName = "aft_sec_qty")
    public void setAft_sec_qty(String aft_sec_qty){
        this.aft_sec_qty = aft_sec_qty;
    }
  
    @ElVoField(physicalName = "aft_sec_rslt_qty")
    public String getAft_sec_rslt_qty(){
        return aft_sec_rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_sec_rslt_qty")
    public void setAft_sec_rslt_qty(String aft_sec_rslt_qty){
        this.aft_sec_rslt_qty = aft_sec_rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_thi_qty")
    public String getAft_thi_qty(){
        return aft_thi_qty;
    }
  
    @ElVoField(physicalName = "aft_thi_qty")
    public void setAft_thi_qty(String aft_thi_qty){
        this.aft_thi_qty = aft_thi_qty;
    }
  
    @ElVoField(physicalName = "aft_thi_rslt_qty")
    public String getAft_thi_rslt_qty(){
        return aft_thi_rslt_qty;
    }
  
    @ElVoField(physicalName = "aft_thi_rslt_qty")
    public void setAft_thi_rslt_qty(String aft_thi_rslt_qty){
        this.aft_thi_rslt_qty = aft_thi_rslt_qty;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResAppOtgtVo [");
      sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
      sb.append("odr").append("=").append(odr).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("sel_yn").append("=").append(sel_yn).append(",");
      sb.append("state_clsf").append("=").append(state_clsf).append(",");
      sb.append("outcm_cd").append("=").append(outcm_cd).append(",");
      sb.append("outcm_nm").append("=").append(outcm_nm).append(",");
      sb.append("qty").append("=").append(qty).append(",");
      sb.append("rslt_qty").append("=").append(rslt_qty).append(",");
      sb.append("aft_fir_qty").append("=").append(aft_fir_qty).append(",");
      sb.append("aft_fir_rslt_qty").append("=").append(aft_fir_rslt_qty).append(",");
      sb.append("aft_sec_qty").append("=").append(aft_sec_qty).append(",");
      sb.append("aft_sec_rslt_qty").append("=").append(aft_sec_rslt_qty).append(",");
      sb.append("aft_thi_qty").append("=").append(aft_thi_qty).append(",");
      sb.append("aft_thi_rslt_qty").append("=").append(aft_thi_rslt_qty).append(",");
      sb.append("seq").append("=").append(seq);
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