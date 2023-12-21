package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CtrOverTabExp")
public class CtrOverTabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CtrOverTabVo(){
  }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "biztripNms", physicalName = "biztrip_nms", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_nms;
  
    @ElDtoField(logicalName = "biztripPeriod", physicalName = "biztrip_period", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_period;
  
    @ElDtoField(logicalName = "biztripLand", physicalName = "biztrip_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_land;
  
    @ElDtoField(logicalName = "biztripGoal", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal;
  
    @ElDtoField(logicalName = "agncyCd1", physicalName = "agncy_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd_1;
  
    @ElDtoField(logicalName = "agncyCd2", physicalName = "agncy_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd_2;
  
    @ElDtoField(logicalName = "agncyCd3", physicalName = "agncy_cd_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd_3;
  
    @ElDtoField(logicalName = "agncyNm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;
  
    @ElDtoField(logicalName = "repReqNo", physicalName = "rep_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rep_req_no;
  
    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }
  
    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "biztrip_nms")
    public String getBiztrip_nms(){
        return biztrip_nms;
    }
  
    @ElVoField(physicalName = "biztrip_nms")
    public void setBiztrip_nms(String biztrip_nms){
        this.biztrip_nms = biztrip_nms;
    }
  
    @ElVoField(physicalName = "biztrip_period")
    public String getBiztrip_period(){
        return biztrip_period;
    }
  
    @ElVoField(physicalName = "biztrip_period")
    public void setBiztrip_period(String biztrip_period){
        this.biztrip_period = biztrip_period;
    }
  
    @ElVoField(physicalName = "biztrip_land")
    public String getBiztrip_land(){
        return biztrip_land;
    }
  
    @ElVoField(physicalName = "biztrip_land")
    public void setBiztrip_land(String biztrip_land){
        this.biztrip_land = biztrip_land;
    }
  
    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        return biztrip_goal;
    }
  
    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }
  
    @ElVoField(physicalName = "agncy_cd_1")
    public String getAgncy_cd_1(){
        return agncy_cd_1;
    }
  
    @ElVoField(physicalName = "agncy_cd_1")
    public void setAgncy_cd_1(String agncy_cd_1){
        this.agncy_cd_1 = agncy_cd_1;
    }
  
    @ElVoField(physicalName = "agncy_cd_2")
    public String getAgncy_cd_2(){
        return agncy_cd_2;
    }
  
    @ElVoField(physicalName = "agncy_cd_2")
    public void setAgncy_cd_2(String agncy_cd_2){
        this.agncy_cd_2 = agncy_cd_2;
    }
  
    @ElVoField(physicalName = "agncy_cd_3")
    public String getAgncy_cd_3(){
        return agncy_cd_3;
    }
  
    @ElVoField(physicalName = "agncy_cd_3")
    public void setAgncy_cd_3(String agncy_cd_3){
        this.agncy_cd_3 = agncy_cd_3;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }
  
    @ElVoField(physicalName = "rep_req_no")
    public String getRep_req_no(){
        return rep_req_no;
    }
  
    @ElVoField(physicalName = "rep_req_no")
    public void setRep_req_no(String rep_req_no){
        this.rep_req_no = rep_req_no;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CtrOverTabVo [");
      sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("biztrip_nms").append("=").append(biztrip_nms).append(",");
      sb.append("biztrip_period").append("=").append(biztrip_period).append(",");
      sb.append("biztrip_land").append("=").append(biztrip_land).append(",");
      sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
      sb.append("agncy_cd_1").append("=").append(agncy_cd_1).append(",");
      sb.append("agncy_cd_2").append("=").append(agncy_cd_2).append(",");
      sb.append("agncy_cd_3").append("=").append(agncy_cd_3).append(",");
      sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
      sb.append("rep_req_no").append("=").append(rep_req_no);
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