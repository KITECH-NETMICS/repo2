package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "XodxComMExp")
public class XodxComMVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public XodxComMVo(){
  }

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;
  
    @ElDtoField(logicalName = "cdClsf", physicalName = "cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_clsf;
  
    @ElDtoField(logicalName = "mngmtItem1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;
  
    @ElDtoField(logicalName = "mngmtItem1None", physicalName = "mngmt_item_1_none", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1_none;
  
    @ElDtoField(logicalName = "mngmtItem1In", physicalName = "mngmt_item_1_in", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1_in;
  
    @ElDtoField(logicalName = "mngmtItem2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;
  
    @ElDtoField(logicalName = "mngmtItem3", physicalName = "mngmt_item_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_3;
  
    @ElDtoField(logicalName = "mngmtItem4", physicalName = "mngmt_item_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_4;
  
    @ElDtoField(logicalName = "mngmtItem5", physicalName = "mngmt_item_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_5;
  
    @ElDtoField(logicalName = "mngmtItem6", physicalName = "mngmt_item_6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_6;
  
    @ElDtoField(logicalName = "mngmtItem7", physicalName = "mngmt_item_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_7;
  
    @ElDtoField(logicalName = "mngmtItem45Between", physicalName = "mngmt_item_4_5_between", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_4_5_between;
  
    @ElDtoField(logicalName = "orderBy", physicalName = "orderBy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orderBy;
  
    @ElDtoField(logicalName = "cdNm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;
  
    @ElDtoField(logicalName = "cdDesc", physicalName = "cd_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_desc;
  
    @ElDtoField(logicalName = "sysClsf", physicalName = "sys_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_clsf;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "useEx", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;
  
    @ElDtoField(logicalName = "mngmtNo1", physicalName = "mngmt_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_1;
  
    @ElDtoField(logicalName = "mngmtNo2", physicalName = "mngmt_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_2;
  
    @ElDtoField(logicalName = "mngmtNo3", physicalName = "mngmt_no_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_3;
  
    @ElDtoField(logicalName = "mngmtNo4", physicalName = "mngmt_no_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_4;
  
    @ElDtoField(logicalName = "mngmtNo5", physicalName = "mngmt_no_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_5;
  
    @ElDtoField(logicalName = "mngmtNo6", physicalName = "mngmt_no_6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_6;
  
    @ElDtoField(logicalName = "mngmtNo7", physicalName = "mngmt_no_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_7;
  
    @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;
  
    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;
  
    @ElDtoField(logicalName = "updtPsnSyspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;
  
    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;
  
    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }
  
    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }
  
    @ElVoField(physicalName = "cd_clsf")
    public String getCd_clsf(){
        return cd_clsf;
    }
  
    @ElVoField(physicalName = "cd_clsf")
    public void setCd_clsf(String cd_clsf){
        this.cd_clsf = cd_clsf;
    }
  
    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }
  
    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }
  
    @ElVoField(physicalName = "mngmt_item_1_none")
    public String getMngmt_item_1_none(){
        return mngmt_item_1_none;
    }
  
    @ElVoField(physicalName = "mngmt_item_1_none")
    public void setMngmt_item_1_none(String mngmt_item_1_none){
        this.mngmt_item_1_none = mngmt_item_1_none;
    }
  
    @ElVoField(physicalName = "mngmt_item_1_in")
    public String getMngmt_item_1_in(){
        return mngmt_item_1_in;
    }
  
    @ElVoField(physicalName = "mngmt_item_1_in")
    public void setMngmt_item_1_in(String mngmt_item_1_in){
        this.mngmt_item_1_in = mngmt_item_1_in;
    }
  
    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }
  
    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }
  
    @ElVoField(physicalName = "mngmt_item_3")
    public String getMngmt_item_3(){
        return mngmt_item_3;
    }
  
    @ElVoField(physicalName = "mngmt_item_3")
    public void setMngmt_item_3(String mngmt_item_3){
        this.mngmt_item_3 = mngmt_item_3;
    }
  
    @ElVoField(physicalName = "mngmt_item_4")
    public String getMngmt_item_4(){
        return mngmt_item_4;
    }
  
    @ElVoField(physicalName = "mngmt_item_4")
    public void setMngmt_item_4(String mngmt_item_4){
        this.mngmt_item_4 = mngmt_item_4;
    }
  
    @ElVoField(physicalName = "mngmt_item_5")
    public String getMngmt_item_5(){
        return mngmt_item_5;
    }
  
    @ElVoField(physicalName = "mngmt_item_5")
    public void setMngmt_item_5(String mngmt_item_5){
        this.mngmt_item_5 = mngmt_item_5;
    }
  
    @ElVoField(physicalName = "mngmt_item_6")
    public String getMngmt_item_6(){
        return mngmt_item_6;
    }
  
    @ElVoField(physicalName = "mngmt_item_6")
    public void setMngmt_item_6(String mngmt_item_6){
        this.mngmt_item_6 = mngmt_item_6;
    }
  
    @ElVoField(physicalName = "mngmt_item_7")
    public String getMngmt_item_7(){
        return mngmt_item_7;
    }
  
    @ElVoField(physicalName = "mngmt_item_7")
    public void setMngmt_item_7(String mngmt_item_7){
        this.mngmt_item_7 = mngmt_item_7;
    }
  
    @ElVoField(physicalName = "mngmt_item_4_5_between")
    public String getMngmt_item_4_5_between(){
        return mngmt_item_4_5_between;
    }
  
    @ElVoField(physicalName = "mngmt_item_4_5_between")
    public void setMngmt_item_4_5_between(String mngmt_item_4_5_between){
        this.mngmt_item_4_5_between = mngmt_item_4_5_between;
    }
  
    @ElVoField(physicalName = "orderBy")
    public String getOrderBy(){
        return orderBy;
    }
  
    @ElVoField(physicalName = "orderBy")
    public void setOrderBy(String orderBy){
        this.orderBy = orderBy;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }
  
    @ElVoField(physicalName = "cd_desc")
    public String getCd_desc(){
        return cd_desc;
    }
  
    @ElVoField(physicalName = "cd_desc")
    public void setCd_desc(String cd_desc){
        this.cd_desc = cd_desc;
    }
  
    @ElVoField(physicalName = "sys_clsf")
    public String getSys_clsf(){
        return sys_clsf;
    }
  
    @ElVoField(physicalName = "sys_clsf")
    public void setSys_clsf(String sys_clsf){
        this.sys_clsf = sys_clsf;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }
  
    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }
  
    @ElVoField(physicalName = "mngmt_no_1")
    public String getMngmt_no_1(){
        return mngmt_no_1;
    }
  
    @ElVoField(physicalName = "mngmt_no_1")
    public void setMngmt_no_1(String mngmt_no_1){
        this.mngmt_no_1 = mngmt_no_1;
    }
  
    @ElVoField(physicalName = "mngmt_no_2")
    public String getMngmt_no_2(){
        return mngmt_no_2;
    }
  
    @ElVoField(physicalName = "mngmt_no_2")
    public void setMngmt_no_2(String mngmt_no_2){
        this.mngmt_no_2 = mngmt_no_2;
    }
  
    @ElVoField(physicalName = "mngmt_no_3")
    public String getMngmt_no_3(){
        return mngmt_no_3;
    }
  
    @ElVoField(physicalName = "mngmt_no_3")
    public void setMngmt_no_3(String mngmt_no_3){
        this.mngmt_no_3 = mngmt_no_3;
    }
  
    @ElVoField(physicalName = "mngmt_no_4")
    public String getMngmt_no_4(){
        return mngmt_no_4;
    }
  
    @ElVoField(physicalName = "mngmt_no_4")
    public void setMngmt_no_4(String mngmt_no_4){
        this.mngmt_no_4 = mngmt_no_4;
    }
  
    @ElVoField(physicalName = "mngmt_no_5")
    public String getMngmt_no_5(){
        return mngmt_no_5;
    }
  
    @ElVoField(physicalName = "mngmt_no_5")
    public void setMngmt_no_5(String mngmt_no_5){
        this.mngmt_no_5 = mngmt_no_5;
    }
  
    @ElVoField(physicalName = "mngmt_no_6")
    public String getMngmt_no_6(){
        return mngmt_no_6;
    }
  
    @ElVoField(physicalName = "mngmt_no_6")
    public void setMngmt_no_6(String mngmt_no_6){
        this.mngmt_no_6 = mngmt_no_6;
    }
  
    @ElVoField(physicalName = "mngmt_no_7")
    public String getMngmt_no_7(){
        return mngmt_no_7;
    }
  
    @ElVoField(physicalName = "mngmt_no_7")
    public void setMngmt_no_7(String mngmt_no_7){
        this.mngmt_no_7 = mngmt_no_7;
    }
  
    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }
  
    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }
  
    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }
  
    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
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
      sb.append("XodxComMVo [");
      sb.append("cd").append("=").append(cd).append(",");
      sb.append("cd_clsf").append("=").append(cd_clsf).append(",");
      sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
      sb.append("mngmt_item_1_none").append("=").append(mngmt_item_1_none).append(",");
      sb.append("mngmt_item_1_in").append("=").append(mngmt_item_1_in).append(",");
      sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
      sb.append("mngmt_item_3").append("=").append(mngmt_item_3).append(",");
      sb.append("mngmt_item_4").append("=").append(mngmt_item_4).append(",");
      sb.append("mngmt_item_5").append("=").append(mngmt_item_5).append(",");
      sb.append("mngmt_item_6").append("=").append(mngmt_item_6).append(",");
      sb.append("mngmt_item_7").append("=").append(mngmt_item_7).append(",");
      sb.append("mngmt_item_4_5_between").append("=").append(mngmt_item_4_5_between).append(",");
      sb.append("orderBy").append("=").append(orderBy).append(",");
      sb.append("cd_nm").append("=").append(cd_nm).append(",");
      sb.append("cd_desc").append("=").append(cd_desc).append(",");
      sb.append("sys_clsf").append("=").append(sys_clsf).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("use_ex").append("=").append(use_ex).append(",");
      sb.append("mngmt_no_1").append("=").append(mngmt_no_1).append(",");
      sb.append("mngmt_no_2").append("=").append(mngmt_no_2).append(",");
      sb.append("mngmt_no_3").append("=").append(mngmt_no_3).append(",");
      sb.append("mngmt_no_4").append("=").append(mngmt_no_4).append(",");
      sb.append("mngmt_no_5").append("=").append(mngmt_no_5).append(",");
      sb.append("mngmt_no_6").append("=").append(mngmt_no_6).append(",");
      sb.append("mngmt_no_7").append("=").append(mngmt_no_7).append(",");
      sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
      sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
      sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
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