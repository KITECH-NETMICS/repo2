package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpAgncyMstFormExp")
public class LcpAgncyMstFormVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpAgncyMstFormVo(){
  }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;
  
    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
  
    @ElDtoField(logicalName = "agncyNm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;
  
    @ElDtoField(logicalName = "natnNm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
  
    @ElDtoField(logicalName = "cmpyNmEng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;
  
    @ElDtoField(logicalName = "cmpyNmEngShort", physicalName = "cmpy_nm_eng_short", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng_short;
  
    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;
  
    @ElDtoField(logicalName = "homepg", physicalName = "homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "moucnt", physicalName = "moucnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String moucnt;
  
    @ElDtoField(logicalName = "rescnt", physicalName = "rescnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rescnt;
  
    @ElDtoField(logicalName = "tripcnt", physicalName = "tripcnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tripcnt;
  
    @ElDtoField(logicalName = "vipcnt", physicalName = "vipcnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vipcnt;
  
    @ElDtoField(logicalName = "eventcnt", physicalName = "eventcnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eventcnt;
  
    @ElDtoField(logicalName = "suptcnt", physicalName = "suptcnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String suptcnt;
  
    @ElDtoField(logicalName = "studycnt", physicalName = "studycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String studycnt;
  
    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }
  
    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }
  
    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }
  
    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }
  
    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public String getCmpy_nm_eng_short(){
        return cmpy_nm_eng_short;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public void setCmpy_nm_eng_short(String cmpy_nm_eng_short){
        this.cmpy_nm_eng_short = cmpy_nm_eng_short;
    }
  
    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }
  
    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }
  
    @ElVoField(physicalName = "homepg")
    public String getHomepg(){
        return homepg;
    }
  
    @ElVoField(physicalName = "homepg")
    public void setHomepg(String homepg){
        this.homepg = homepg;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "moucnt")
    public String getMoucnt(){
        return moucnt;
    }
  
    @ElVoField(physicalName = "moucnt")
    public void setMoucnt(String moucnt){
        this.moucnt = moucnt;
    }
  
    @ElVoField(physicalName = "rescnt")
    public String getRescnt(){
        return rescnt;
    }
  
    @ElVoField(physicalName = "rescnt")
    public void setRescnt(String rescnt){
        this.rescnt = rescnt;
    }
  
    @ElVoField(physicalName = "tripcnt")
    public String getTripcnt(){
        return tripcnt;
    }
  
    @ElVoField(physicalName = "tripcnt")
    public void setTripcnt(String tripcnt){
        this.tripcnt = tripcnt;
    }
  
    @ElVoField(physicalName = "vipcnt")
    public String getVipcnt(){
        return vipcnt;
    }
  
    @ElVoField(physicalName = "vipcnt")
    public void setVipcnt(String vipcnt){
        this.vipcnt = vipcnt;
    }
  
    @ElVoField(physicalName = "eventcnt")
    public String getEventcnt(){
        return eventcnt;
    }
  
    @ElVoField(physicalName = "eventcnt")
    public void setEventcnt(String eventcnt){
        this.eventcnt = eventcnt;
    }
  
    @ElVoField(physicalName = "suptcnt")
    public String getSuptcnt(){
        return suptcnt;
    }
  
    @ElVoField(physicalName = "suptcnt")
    public void setSuptcnt(String suptcnt){
        this.suptcnt = suptcnt;
    }
  
    @ElVoField(physicalName = "studycnt")
    public String getStudycnt(){
        return studycnt;
    }
  
    @ElVoField(physicalName = "studycnt")
    public void setStudycnt(String studycnt){
        this.studycnt = studycnt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpAgncyMstFormVo [");
      sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
      sb.append("cust_no").append("=").append(cust_no).append(",");
      sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
      sb.append("natn_nm").append("=").append(natn_nm).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
      sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
      sb.append("cmpy_nm_eng_short").append("=").append(cmpy_nm_eng_short).append(",");
      sb.append("addr").append("=").append(addr).append(",");
      sb.append("homepg").append("=").append(homepg).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("moucnt").append("=").append(moucnt).append(",");
      sb.append("rescnt").append("=").append(rescnt).append(",");
      sb.append("tripcnt").append("=").append(tripcnt).append(",");
      sb.append("vipcnt").append("=").append(vipcnt).append(",");
      sb.append("eventcnt").append("=").append(eventcnt).append(",");
      sb.append("suptcnt").append("=").append(suptcnt).append(",");
      sb.append("studycnt").append("=").append(studycnt);
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