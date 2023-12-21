package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpMastStatusExp")
public class ResInpMastStatusVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpMastStatusVo(){
  }

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "prjNoSeq", physicalName = "prj_no_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_seq;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;
  
    @ElDtoField(logicalName = "rspnsNm", physicalName = "rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_nm;
  
    @ElDtoField(logicalName = "govCntrbamt", physicalName = "gov_cntrbamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gov_cntrbamt;
  
    @ElDtoField(logicalName = "cash", physicalName = "cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash;
  
    @ElDtoField(logicalName = "etcCash", physicalName = "etc_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_cash;
  
    @ElDtoField(logicalName = "cmpyGoods", physicalName = "cmpy_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_goods;
  
    @ElDtoField(logicalName = "contpatGoods", physicalName = "contpat_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contpat_goods;
  
    @ElDtoField(logicalName = "colSum", physicalName = "col_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String col_sum;
  
    @ElDtoField(logicalName = "cmpyCash", physicalName = "cmpy_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_cash;
  
    @ElDtoField(logicalName = "univCash", physicalName = "univ_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String univ_cash;
  
    @ElDtoField(logicalName = "localGovCash", physicalName = "local_gov_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_gov_cash;
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "prj_no_seq")
    public String getPrj_no_seq(){
        return prj_no_seq;
    }
  
    @ElVoField(physicalName = "prj_no_seq")
    public void setPrj_no_seq(String prj_no_seq){
        this.prj_no_seq = prj_no_seq;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }
  
    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }
  
    @ElVoField(physicalName = "rspns_nm")
    public String getRspns_nm(){
        return rspns_nm;
    }
  
    @ElVoField(physicalName = "rspns_nm")
    public void setRspns_nm(String rspns_nm){
        this.rspns_nm = rspns_nm;
    }
  
    @ElVoField(physicalName = "gov_cntrbamt")
    public String getGov_cntrbamt(){
        return gov_cntrbamt;
    }
  
    @ElVoField(physicalName = "gov_cntrbamt")
    public void setGov_cntrbamt(String gov_cntrbamt){
        this.gov_cntrbamt = gov_cntrbamt;
    }
  
    @ElVoField(physicalName = "cash")
    public String getCash(){
        return cash;
    }
  
    @ElVoField(physicalName = "cash")
    public void setCash(String cash){
        this.cash = cash;
    }
  
    @ElVoField(physicalName = "etc_cash")
    public String getEtc_cash(){
        return etc_cash;
    }
  
    @ElVoField(physicalName = "etc_cash")
    public void setEtc_cash(String etc_cash){
        this.etc_cash = etc_cash;
    }
  
    @ElVoField(physicalName = "cmpy_goods")
    public String getCmpy_goods(){
        return cmpy_goods;
    }
  
    @ElVoField(physicalName = "cmpy_goods")
    public void setCmpy_goods(String cmpy_goods){
        this.cmpy_goods = cmpy_goods;
    }
  
    @ElVoField(physicalName = "contpat_goods")
    public String getContpat_goods(){
        return contpat_goods;
    }
  
    @ElVoField(physicalName = "contpat_goods")
    public void setContpat_goods(String contpat_goods){
        this.contpat_goods = contpat_goods;
    }
  
    @ElVoField(physicalName = "col_sum")
    public String getCol_sum(){
        return col_sum;
    }
  
    @ElVoField(physicalName = "col_sum")
    public void setCol_sum(String col_sum){
        this.col_sum = col_sum;
    }
  
    @ElVoField(physicalName = "cmpy_cash")
    public String getCmpy_cash(){
        return cmpy_cash;
    }
  
    @ElVoField(physicalName = "cmpy_cash")
    public void setCmpy_cash(String cmpy_cash){
        this.cmpy_cash = cmpy_cash;
    }
  
    @ElVoField(physicalName = "univ_cash")
    public String getUniv_cash(){
        return univ_cash;
    }
  
    @ElVoField(physicalName = "univ_cash")
    public void setUniv_cash(String univ_cash){
        this.univ_cash = univ_cash;
    }
  
    @ElVoField(physicalName = "local_gov_cash")
    public String getLocal_gov_cash(){
        return local_gov_cash;
    }
  
    @ElVoField(physicalName = "local_gov_cash")
    public void setLocal_gov_cash(String local_gov_cash){
        this.local_gov_cash = local_gov_cash;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpMastStatusVo [");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("prj_no_seq").append("=").append(prj_no_seq).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("ymd").append("=").append(ymd).append(",");
      sb.append("rspns_nm").append("=").append(rspns_nm).append(",");
      sb.append("gov_cntrbamt").append("=").append(gov_cntrbamt).append(",");
      sb.append("cash").append("=").append(cash).append(",");
      sb.append("etc_cash").append("=").append(etc_cash).append(",");
      sb.append("cmpy_goods").append("=").append(cmpy_goods).append(",");
      sb.append("contpat_goods").append("=").append(contpat_goods).append(",");
      sb.append("col_sum").append("=").append(col_sum).append(",");
      sb.append("cmpy_cash").append("=").append(cmpy_cash).append(",");
      sb.append("univ_cash").append("=").append(univ_cash).append(",");
      sb.append("local_gov_cash").append("=").append(local_gov_cash);
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