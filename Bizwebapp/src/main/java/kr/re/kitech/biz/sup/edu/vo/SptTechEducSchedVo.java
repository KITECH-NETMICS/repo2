package kr.re.kitech.biz.sup.edu.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducSchedExp")
public class SptTechEducSchedVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTechEducSchedVo(){
  }

    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "bizClsfNm", physicalName = "biz_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf_nm;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;
  
    @ElDtoField(logicalName = "startTm", physicalName = "start_tm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_tm;
  
    @ElDtoField(logicalName = "endYmd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;
  
    @ElDtoField(logicalName = "endTm", physicalName = "end_tm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_tm;
  
    @ElDtoField(logicalName = "contnt", physicalName = "contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt;
  
    @ElDtoField(logicalName = "lectrNm", physicalName = "lectr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lectr_nm;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
    
    @ElDtoField(logicalName = "total_time", physicalName = "total_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String total_time;
  
    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }
  
    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public String getBiz_clsf_nm(){
        return biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "biz_clsf_nm")
    public void setBiz_clsf_nm(String biz_clsf_nm){
        this.biz_clsf_nm = biz_clsf_nm;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }
  
    @ElVoField(physicalName = "start_tm")
    public String getStart_tm(){
        return start_tm;
    }
  
    @ElVoField(physicalName = "start_tm")
    public void setStart_tm(String start_tm){
        this.start_tm = start_tm;
    }
  
    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }
  
    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }
  
    @ElVoField(physicalName = "end_tm")
    public String getEnd_tm(){
        return end_tm;
    }
  
    @ElVoField(physicalName = "end_tm")
    public void setEnd_tm(String end_tm){
        this.end_tm = end_tm;
    }
  
    @ElVoField(physicalName = "contnt")
    public String getContnt(){
        return contnt;
    }
  
    @ElVoField(physicalName = "contnt")
    public void setContnt(String contnt){
        this.contnt = contnt;
    }
  
    @ElVoField(physicalName = "lectr_nm")
    public String getLectr_nm(){
        return lectr_nm;
    }
  
    @ElVoField(physicalName = "lectr_nm")
    public void setLectr_nm(String lectr_nm){
        this.lectr_nm = lectr_nm;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
    
    @ElVoField(physicalName = "total_time")
    public String getTotal_time(){
        return total_time;
    }
  
    @ElVoField(physicalName = "total_time")
    public void setTotal_time(String total_time){
        this.total_time = total_time;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTechEducSchedVo [");
      sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("biz_clsf_nm").append("=").append(biz_clsf_nm).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("start_tm").append("=").append(start_tm).append(",");
      sb.append("end_ymd").append("=").append(end_ymd).append(",");
      sb.append("end_tm").append("=").append(end_tm).append(",");
      sb.append("contnt").append("=").append(contnt).append(",");
      sb.append("lectr_nm").append("=").append(lectr_nm).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("total_time").append("=").append(total_time);
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