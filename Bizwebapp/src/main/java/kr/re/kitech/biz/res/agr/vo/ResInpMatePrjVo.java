package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpMatePrjExp")
public class ResInpMatePrjVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpMatePrjVo(){
  }

    @ElDtoField(logicalName = "schPrjNo", physicalName = "sch_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sch_prj_no;
  
    @ElDtoField(logicalName = "schEquipOdr", physicalName = "sch_equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sch_equip_odr;
  
    @ElDtoField(logicalName = "anal", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "equipOdr", physicalName = "equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_odr;
  
    @ElDtoField(logicalName = "equipClsf", physicalName = "equip_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_clsf;
  
    @ElDtoField(logicalName = "cdNm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;
  
    @ElDtoField(logicalName = "gdnm", physicalName = "gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm;
  
    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;
  
    @ElDtoField(logicalName = "A", physicalName = "A", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String A;
  
    @ElDtoField(logicalName = "B", physicalName = "B", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String B;
  
    @ElDtoField(logicalName = "amt2", physicalName = "amt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt2;
  
    @ElDtoField(logicalName = "amt3", physicalName = "amt3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt3;
  
    @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;
  
    @ElDtoField(logicalName = "qty2", physicalName = "qty2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty2;
  
    @ElDtoField(logicalName = "qty3", physicalName = "qty3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty3;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;
  
    @ElVoField(physicalName = "sch_prj_no")
    public String getSch_prj_no(){
        return sch_prj_no;
    }
  
    @ElVoField(physicalName = "sch_prj_no")
    public void setSch_prj_no(String sch_prj_no){
        this.sch_prj_no = sch_prj_no;
    }
  
    @ElVoField(physicalName = "sch_equip_odr")
    public String getSch_equip_odr(){
        return sch_equip_odr;
    }
  
    @ElVoField(physicalName = "sch_equip_odr")
    public void setSch_equip_odr(String sch_equip_odr){
        this.sch_equip_odr = sch_equip_odr;
    }
  
    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }
  
    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "equip_odr")
    public String getEquip_odr(){
        return equip_odr;
    }
  
    @ElVoField(physicalName = "equip_odr")
    public void setEquip_odr(String equip_odr){
        this.equip_odr = equip_odr;
    }
  
    @ElVoField(physicalName = "equip_clsf")
    public String getEquip_clsf(){
        return equip_clsf;
    }
  
    @ElVoField(physicalName = "equip_clsf")
    public void setEquip_clsf(String equip_clsf){
        this.equip_clsf = equip_clsf;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }
  
    @ElVoField(physicalName = "gdnm")
    public String getGdnm(){
        return gdnm;
    }
  
    @ElVoField(physicalName = "gdnm")
    public void setGdnm(String gdnm){
        this.gdnm = gdnm;
    }
  
    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }
  
    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }
  
    @ElVoField(physicalName = "A")
    public String getA(){
        return A;
    }
  
    @ElVoField(physicalName = "A")
    public void setA(String A){
        this.A = A;
    }
  
    @ElVoField(physicalName = "B")
    public String getB(){
        return B;
    }
  
    @ElVoField(physicalName = "B")
    public void setB(String B){
        this.B = B;
    }
  
    @ElVoField(physicalName = "amt2")
    public String getAmt2(){
        return amt2;
    }
  
    @ElVoField(physicalName = "amt2")
    public void setAmt2(String amt2){
        this.amt2 = amt2;
    }
  
    @ElVoField(physicalName = "amt3")
    public String getAmt3(){
        return amt3;
    }
  
    @ElVoField(physicalName = "amt3")
    public void setAmt3(String amt3){
        this.amt3 = amt3;
    }
  
    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }
  
    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }
  
    @ElVoField(physicalName = "qty2")
    public String getQty2(){
        return qty2;
    }
  
    @ElVoField(physicalName = "qty2")
    public void setQty2(String qty2){
        this.qty2 = qty2;
    }
  
    @ElVoField(physicalName = "qty3")
    public String getQty3(){
        return qty3;
    }
  
    @ElVoField(physicalName = "qty3")
    public void setQty3(String qty3){
        this.qty3 = qty3;
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
      sb.append("ResInpMatePrjVo [");
      sb.append("sch_prj_no").append("=").append(sch_prj_no).append(",");
      sb.append("sch_equip_odr").append("=").append(sch_equip_odr).append(",");
      sb.append("anal").append("=").append(anal).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("equip_odr").append("=").append(equip_odr).append(",");
      sb.append("equip_clsf").append("=").append(equip_clsf).append(",");
      sb.append("cd_nm").append("=").append(cd_nm).append(",");
      sb.append("gdnm").append("=").append(gdnm).append(",");
      sb.append("amt").append("=").append(amt).append(",");
      sb.append("A").append("=").append(A).append(",");
      sb.append("B").append("=").append(B).append(",");
      sb.append("amt2").append("=").append(amt2).append(",");
      sb.append("amt3").append("=").append(amt3).append(",");
      sb.append("qty").append("=").append(qty).append(",");
      sb.append("qty2").append("=").append(qty2).append(",");
      sb.append("qty3").append("=").append(qty3).append(",");
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