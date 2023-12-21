package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResinpMastTabExp")
public class ResinpMastTabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResinpMastTabVo(){
  }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "totReschPrdOrignYmd", physicalName = "tot_resch_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_orign_ymd;
  
    @ElDtoField(logicalName = "totReschPrdClsYmd", physicalName = "tot_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_cls_ymd;
  
    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;
  
    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;
  
    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;
  
    @ElDtoField(logicalName = "prjEngNm", physicalName = "prj_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_eng_nm;
  
    @ElDtoField(logicalName = "mouYmd", physicalName = "mou_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_ymd;
  
    @ElDtoField(logicalName = "agncyNm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;
  
    @ElDtoField(logicalName = "prjClsf", physicalName = "prj_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_clsf;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "resRepsn", physicalName = "res_repsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_repsn;
  
    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }
  
    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public String getTot_resch_prd_orign_ymd(){
        return tot_resch_prd_orign_ymd;
    }
  
    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public void setTot_resch_prd_orign_ymd(String tot_resch_prd_orign_ymd){
        this.tot_resch_prd_orign_ymd = tot_resch_prd_orign_ymd;
    }
  
    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public String getTot_resch_prd_cls_ymd(){
        return tot_resch_prd_cls_ymd;
    }
  
    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public void setTot_resch_prd_cls_ymd(String tot_resch_prd_cls_ymd){
        this.tot_resch_prd_cls_ymd = tot_resch_prd_cls_ymd;
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
  
    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }
  
    @ElVoField(physicalName = "prj_eng_nm")
    public String getPrj_eng_nm(){
        return prj_eng_nm;
    }
  
    @ElVoField(physicalName = "prj_eng_nm")
    public void setPrj_eng_nm(String prj_eng_nm){
        this.prj_eng_nm = prj_eng_nm;
    }
  
    @ElVoField(physicalName = "mou_ymd")
    public String getMou_ymd(){
        return mou_ymd;
    }
  
    @ElVoField(physicalName = "mou_ymd")
    public void setMou_ymd(String mou_ymd){
        this.mou_ymd = mou_ymd;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }
  
    @ElVoField(physicalName = "prj_clsf")
    public String getPrj_clsf(){
        return prj_clsf;
    }
  
    @ElVoField(physicalName = "prj_clsf")
    public void setPrj_clsf(String prj_clsf){
        this.prj_clsf = prj_clsf;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "res_repsn")
    public String getRes_repsn(){
        return res_repsn;
    }
  
    @ElVoField(physicalName = "res_repsn")
    public void setRes_repsn(String res_repsn){
        this.res_repsn = res_repsn;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResinpMastTabVo [");
      sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("tot_resch_prd_orign_ymd").append("=").append(tot_resch_prd_orign_ymd).append(",");
      sb.append("tot_resch_prd_cls_ymd").append("=").append(tot_resch_prd_cls_ymd).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
      sb.append("prj_nm").append("=").append(prj_nm).append(",");
      sb.append("prj_eng_nm").append("=").append(prj_eng_nm).append(",");
      sb.append("mou_ymd").append("=").append(mou_ymd).append(",");
      sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
      sb.append("prj_clsf").append("=").append(prj_clsf).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("res_repsn").append("=").append(res_repsn);
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