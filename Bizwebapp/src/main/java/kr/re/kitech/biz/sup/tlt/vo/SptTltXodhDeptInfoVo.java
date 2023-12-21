package kr.re.kitech.biz.sup.tlt.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltXodhDeptInfoExp")
public class SptTltXodhDeptInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SptTltXodhDeptInfoVo(){
  }

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;
  
    @ElDtoField(logicalName = "cdNm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;
  
    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }
  
    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }
  
    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SptTltXodhDeptInfoVo [");
      sb.append("cd").append("=").append(cd).append(",");
      sb.append("cd_nm").append("=").append(cd_nm);
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