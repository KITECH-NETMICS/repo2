package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpEventTabExp")
public class LcpEventTabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpEventTabVo(){
  }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;
  
    @ElDtoField(logicalName = "eventNo", physicalName = "event_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_no;
  
    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;
  
    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;
  
    @ElDtoField(logicalName = "eventNm", physicalName = "event_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_nm;
  
    @ElDtoField(logicalName = "eventSupvis", physicalName = "event_supvis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_supvis;
  
    @ElDtoField(logicalName = "eventOpen", physicalName = "event_open", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_open;
  
    @ElDtoField(logicalName = "eventStartYmd", physicalName = "event_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_start_ymd;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "eventClsYmd", physicalName = "event_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_cls_ymd;
  
    @ElDtoField(logicalName = "eventPlc", physicalName = "event_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_plc;
  
    @ElDtoField(logicalName = "eventContnt", physicalName = "event_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_contnt;
  
    @ElDtoField(logicalName = "cr", physicalName = "cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr;
  
    @ElDtoField(logicalName = "krcharAgncyNm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;
  
    @ElDtoField(logicalName = "cmpyNmEng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;
  
    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }
  
    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }
  
    @ElVoField(physicalName = "event_no")
    public String getEvent_no(){
        return event_no;
    }
  
    @ElVoField(physicalName = "event_no")
    public void setEvent_no(String event_no){
        this.event_no = event_no;
    }
  
    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }
  
    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }
  
    @ElVoField(physicalName = "event_nm")
    public String getEvent_nm(){
        return event_nm;
    }
  
    @ElVoField(physicalName = "event_nm")
    public void setEvent_nm(String event_nm){
        this.event_nm = event_nm;
    }
  
    @ElVoField(physicalName = "event_supvis")
    public String getEvent_supvis(){
        return event_supvis;
    }
  
    @ElVoField(physicalName = "event_supvis")
    public void setEvent_supvis(String event_supvis){
        this.event_supvis = event_supvis;
    }
  
    @ElVoField(physicalName = "event_open")
    public String getEvent_open(){
        return event_open;
    }
  
    @ElVoField(physicalName = "event_open")
    public void setEvent_open(String event_open){
        this.event_open = event_open;
    }
  
    @ElVoField(physicalName = "event_start_ymd")
    public String getEvent_start_ymd(){
        return event_start_ymd;
    }
  
    @ElVoField(physicalName = "event_start_ymd")
    public void setEvent_start_ymd(String event_start_ymd){
        this.event_start_ymd = event_start_ymd;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "event_cls_ymd")
    public String getEvent_cls_ymd(){
        return event_cls_ymd;
    }
  
    @ElVoField(physicalName = "event_cls_ymd")
    public void setEvent_cls_ymd(String event_cls_ymd){
        this.event_cls_ymd = event_cls_ymd;
    }
  
    @ElVoField(physicalName = "event_plc")
    public String getEvent_plc(){
        return event_plc;
    }
  
    @ElVoField(physicalName = "event_plc")
    public void setEvent_plc(String event_plc){
        this.event_plc = event_plc;
    }
  
    @ElVoField(physicalName = "event_contnt")
    public String getEvent_contnt(){
        return event_contnt;
    }
  
    @ElVoField(physicalName = "event_contnt")
    public void setEvent_contnt(String event_contnt){
        this.event_contnt = event_contnt;
    }
  
    @ElVoField(physicalName = "cr")
    public String getCr(){
        return cr;
    }
  
    @ElVoField(physicalName = "cr")
    public void setCr(String cr){
        this.cr = cr;
    }
  
    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }
  
    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpEventTabVo [");
      sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
      sb.append("event_no").append("=").append(event_no).append(",");
      sb.append("charg").append("=").append(charg).append(",");
      sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
      sb.append("event_nm").append("=").append(event_nm).append(",");
      sb.append("event_supvis").append("=").append(event_supvis).append(",");
      sb.append("event_open").append("=").append(event_open).append(",");
      sb.append("event_start_ymd").append("=").append(event_start_ymd).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("event_cls_ymd").append("=").append(event_cls_ymd).append(",");
      sb.append("event_plc").append("=").append(event_plc).append(",");
      sb.append("event_contnt").append("=").append(event_contnt).append(",");
      sb.append("cr").append("=").append(cr).append(",");
      sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
      sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng);
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