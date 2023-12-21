package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpPacoExp")
public class ResInpPacoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpPacoVo(){
  }

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;
  
    @ElDtoField(logicalName = "vendAbbr", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;
  
    @ElDtoField(logicalName = "reprsPsnNm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;
  
    @ElDtoField(logicalName = "attnceClsfNm", physicalName = "attnce_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_clsf_nm;
  
    @ElDtoField(logicalName = "trustRspnsNm", physicalName = "trust_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_rspns_nm;
  
    @ElDtoField(logicalName = "trustPrjNm", physicalName = "trust_prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_prj_nm;
  
    @ElDtoField(logicalName = "trustOrignYmd", physicalName = "trust_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_orign_ymd;
  
    @ElDtoField(logicalName = "trustClsYmd", physicalName = "trust_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_cls_ymd;
  
    @ElDtoField(logicalName = "reschAmtCash", physicalName = "resch_amt_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_cash;
  
    @ElDtoField(logicalName = "reschAmtGoods", physicalName = "resch_amt_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_goods;
  
    @ElDtoField(logicalName = "reschAmtSum", physicalName = "resch_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_sum;
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }
  
    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }
  
    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }
  
    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }
  
    @ElVoField(physicalName = "attnce_clsf_nm")
    public String getAttnce_clsf_nm(){
        return attnce_clsf_nm;
    }
  
    @ElVoField(physicalName = "attnce_clsf_nm")
    public void setAttnce_clsf_nm(String attnce_clsf_nm){
        this.attnce_clsf_nm = attnce_clsf_nm;
    }
  
    @ElVoField(physicalName = "trust_rspns_nm")
    public String getTrust_rspns_nm(){
        return trust_rspns_nm;
    }
  
    @ElVoField(physicalName = "trust_rspns_nm")
    public void setTrust_rspns_nm(String trust_rspns_nm){
        this.trust_rspns_nm = trust_rspns_nm;
    }
  
    @ElVoField(physicalName = "trust_prj_nm")
    public String getTrust_prj_nm(){
        return trust_prj_nm;
    }
  
    @ElVoField(physicalName = "trust_prj_nm")
    public void setTrust_prj_nm(String trust_prj_nm){
        this.trust_prj_nm = trust_prj_nm;
    }
  
    @ElVoField(physicalName = "trust_orign_ymd")
    public String getTrust_orign_ymd(){
        return trust_orign_ymd;
    }
  
    @ElVoField(physicalName = "trust_orign_ymd")
    public void setTrust_orign_ymd(String trust_orign_ymd){
        this.trust_orign_ymd = trust_orign_ymd;
    }
  
    @ElVoField(physicalName = "trust_cls_ymd")
    public String getTrust_cls_ymd(){
        return trust_cls_ymd;
    }
  
    @ElVoField(physicalName = "trust_cls_ymd")
    public void setTrust_cls_ymd(String trust_cls_ymd){
        this.trust_cls_ymd = trust_cls_ymd;
    }
  
    @ElVoField(physicalName = "resch_amt_cash")
    public String getResch_amt_cash(){
        return resch_amt_cash;
    }
  
    @ElVoField(physicalName = "resch_amt_cash")
    public void setResch_amt_cash(String resch_amt_cash){
        this.resch_amt_cash = resch_amt_cash;
    }
  
    @ElVoField(physicalName = "resch_amt_goods")
    public String getResch_amt_goods(){
        return resch_amt_goods;
    }
  
    @ElVoField(physicalName = "resch_amt_goods")
    public void setResch_amt_goods(String resch_amt_goods){
        this.resch_amt_goods = resch_amt_goods;
    }
  
    @ElVoField(physicalName = "resch_amt_sum")
    public String getResch_amt_sum(){
        return resch_amt_sum;
    }
  
    @ElVoField(physicalName = "resch_amt_sum")
    public void setResch_amt_sum(String resch_amt_sum){
        this.resch_amt_sum = resch_amt_sum;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpPacoVo [");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
      sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
      sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
      sb.append("attnce_clsf_nm").append("=").append(attnce_clsf_nm).append(",");
      sb.append("trust_rspns_nm").append("=").append(trust_rspns_nm).append(",");
      sb.append("trust_prj_nm").append("=").append(trust_prj_nm).append(",");
      sb.append("trust_orign_ymd").append("=").append(trust_orign_ymd).append(",");
      sb.append("trust_cls_ymd").append("=").append(trust_cls_ymd).append(",");
      sb.append("resch_amt_cash").append("=").append(resch_amt_cash).append(",");
      sb.append("resch_amt_goods").append("=").append(resch_amt_goods).append(",");
      sb.append("resch_amt_sum").append("=").append(resch_amt_sum);
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