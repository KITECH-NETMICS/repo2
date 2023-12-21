package kr.re.kitech.biz.pat.pbd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatNoticeListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatNoticeListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patNoticeVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo> patNoticeVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patNotice2Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo patNoticeVo;
  
  @ElVoField(physicalName = "patNoticeVoList")
    public java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo> getPatNoticeVoList(){
      return patNoticeVoList;
  }

  @ElVoField(physicalName = "patNoticeVoList")
  public void setPatNoticeVoList(java.util.List<kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo> patNoticeVoList){
      this.patNoticeVoList = patNoticeVoList;
  }

  @ElVoField(physicalName = "patNoticeVo")
    public kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo getPatNotice2Vo(){
      return patNoticeVo;
  }

  @ElVoField(physicalName = "patNotice2Vo")
  public void setPatNotice2Vo(kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo patNotice2Vo){
      this.patNoticeVo = patNotice2Vo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatNoticeListVo [");
      sb.append("patNoticeVoList").append("=").append(patNoticeVoList).append(",");
      sb.append("patNoticeVo").append("=").append(patNoticeVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }
    
  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patNoticeVoList != null && i < patNoticeVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo)patNoticeVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patNoticeVo != null ) this.patNoticeVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patNoticeVoList != null && i < patNoticeVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo vo = (kr.re.kitech.biz.pat.pbd.vo.PatNoticeVo)patNoticeVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patNoticeVo != null ) this.patNoticeVo._xStreamDec();

  }
  
}
