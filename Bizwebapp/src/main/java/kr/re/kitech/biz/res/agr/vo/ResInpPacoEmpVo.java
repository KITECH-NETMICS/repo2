package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpPacoEmpExp")
public class ResInpPacoEmpVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpPacoEmpVo(){
  }

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "chargClsf", physicalName = "charg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_clsf;
  
    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;
  
    @ElDtoField(logicalName = "vendAbbr", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;
  
    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;
  
    @ElDtoField(logicalName = "chargTel", physicalName = "charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_tel;
  
    @ElDtoField(logicalName = "chargEtcInfo", physicalName = "charg_etc_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_etc_info;
  
    @ElDtoField(logicalName = "chargMail", physicalName = "charg_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_mail;
  
    @ElDtoField(logicalName = "chargFax", physicalName = "charg_fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_fax;
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "charg_clsf")
    public String getCharg_clsf(){
        return charg_clsf;
    }
  
    @ElVoField(physicalName = "charg_clsf")
    public void setCharg_clsf(String charg_clsf){
        this.charg_clsf = charg_clsf;
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
  
    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }
  
    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }
  
    @ElVoField(physicalName = "charg_tel")
    public String getCharg_tel(){
        return charg_tel;
    }
  
    @ElVoField(physicalName = "charg_tel")
    public void setCharg_tel(String charg_tel){
        this.charg_tel = charg_tel;
    }
  
    @ElVoField(physicalName = "charg_etc_info")
    public String getCharg_etc_info(){
        return charg_etc_info;
    }
  
    @ElVoField(physicalName = "charg_etc_info")
    public void setCharg_etc_info(String charg_etc_info){
        this.charg_etc_info = charg_etc_info;
    }
  
    @ElVoField(physicalName = "charg_mail")
    public String getCharg_mail(){
        return charg_mail;
    }
  
    @ElVoField(physicalName = "charg_mail")
    public void setCharg_mail(String charg_mail){
        this.charg_mail = charg_mail;
    }
  
    @ElVoField(physicalName = "charg_fax")
    public String getCharg_fax(){
        return charg_fax;
    }
  
    @ElVoField(physicalName = "charg_fax")
    public void setCharg_fax(String charg_fax){
        this.charg_fax = charg_fax;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpPacoEmpVo [");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("charg_clsf").append("=").append(charg_clsf).append(",");
      sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
      sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
      sb.append("charg_nm").append("=").append(charg_nm).append(",");
      sb.append("charg_tel").append("=").append(charg_tel).append(",");
      sb.append("charg_etc_info").append("=").append(charg_etc_info).append(",");
      sb.append("charg_mail").append("=").append(charg_mail).append(",");
      sb.append("charg_fax").append("=").append(charg_fax);
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