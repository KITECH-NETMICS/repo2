package kr.re.kitech.biz.pat.mnt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatrightmntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatrightmntListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatrightmntVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo> PatrightmntVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatrightmntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo PatrightmntVo;
  
  @ElVoField(physicalName = "PatrightmntVoList")
    public java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo> getPatrightmntVoList(){
      return PatrightmntVoList;
  }

  @ElVoField(physicalName = "PatrightmntVoList")
  public void setPatrightmntVoList(java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo> PatrightmntVoList){
      this.PatrightmntVoList = PatrightmntVoList;
  }

  @ElVoField(physicalName = "PatrightmntVo")
    public kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo getPatrightmntVo(){
      return PatrightmntVo;
  }

  @ElVoField(physicalName = "PatrightmntVo")
  public void setPatrightmntVo(kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo PatrightmntVo){
      this.PatrightmntVo = PatrightmntVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatrightmntListVo [");
      sb.append("PatrightmntVoList").append("=").append(PatrightmntVoList).append(",");
      sb.append("PatrightmntVo").append("=").append(PatrightmntVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatrightmntVoList != null && i < PatrightmntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo vo = (kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo)PatrightmntVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatrightmntVo != null ) this.PatrightmntVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatrightmntVoList != null && i < PatrightmntVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo vo = (kr.re.kitech.biz.pat.mnt.vo.PatrightmntVo)PatrightmntVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatrightmntVo != null ) this.PatrightmntVo._xStreamDec();

  }
  
}
