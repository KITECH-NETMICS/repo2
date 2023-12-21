package kr.re.kitech.biz.pat.pse.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPseDetailListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPseDetailListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "patPseDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> patPseDetailVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPseDetailVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo patPseDetailVo;
  
  @ElDtoField(logicalName = "Vo", physicalName = "patPseExam", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo patPseExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "outSideExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> outSideExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "jointExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> jointExam;
  
  @ElDtoField(logicalName = "ListVo", physicalName = "giveUpExam", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> giveUpExam;
  
  @ElVoField(physicalName = "patPseDetailVoList")
    public java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> getPatPseDetailVoList(){
      return patPseDetailVoList;
  }

  @ElVoField(physicalName = "patPseDetailVoList")
  public void setPatPseDetailVoList(java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> patPseDetailVoList){
      this.patPseDetailVoList = patPseDetailVoList;
  }

  @ElVoField(physicalName = "patPseDetailVo")
    public kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo getPatPseDetailVo(){
      return patPseDetailVo;
  }

  @ElVoField(physicalName = "patPseDetailVo")
  public void setPatPseDetailVo(kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo patPseDetailVo){
      this.patPseDetailVo = patPseDetailVo;
  }

  @ElVoField(physicalName = "patPseExam")
    public kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo getPatPseExam(){
      return patPseExam;
  }

  @ElVoField(physicalName = "patPseExam")
  public void setPatPseExam(kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo patPseExam){
      this.patPseExam = patPseExam;
  }

  @ElVoField(physicalName = "outSideExam")
    public java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> getOutSideExam(){
      return outSideExam;
  }

  @ElVoField(physicalName = "outSideExam")
  public void setOutSideExam(java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> outSideExam){
      this.outSideExam = outSideExam;
  }

  @ElVoField(physicalName = "jointExam")
    public java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> getJointExam(){
      return jointExam;
  }

  @ElVoField(physicalName = "jointExam")
  public void setJointExam(java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> jointExam){
      this.jointExam = jointExam;
  }

  @ElVoField(physicalName = "giveUpExam")
    public java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> getGiveUpExam(){
      return giveUpExam;
  }

  @ElVoField(physicalName = "giveUpExam")
  public void setGiveUpExam(java.util.List<kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo> giveUpExam){
      this.giveUpExam = giveUpExam;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPseDetailListVo [");
      sb.append("patPseDetailVoList").append("=").append(patPseDetailVoList).append(",");
      sb.append("patPseDetailVo").append("=").append(patPseDetailVo).append(",");
      sb.append("patPseExam").append("=").append(patPseExam).append(",");
      sb.append("outSideExam").append("=").append(outSideExam).append(",");
      sb.append("jointExam").append("=").append(jointExam).append(",");
      sb.append("giveUpExam").append("=").append(giveUpExam);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; patPseDetailVoList != null && i < patPseDetailVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)patPseDetailVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.patPseDetailVo != null ) this.patPseDetailVo._xStreamEnc();
    if( this.patPseExam != null ) this.patPseExam._xStreamEnc();
    for( int i=0 ; outSideExam != null && i < outSideExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)outSideExam.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; jointExam != null && i < jointExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)jointExam.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; giveUpExam != null && i < giveUpExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)giveUpExam.get(i);
        vo._xStreamEnc();	 
    }

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; patPseDetailVoList != null && i < patPseDetailVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)patPseDetailVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.patPseDetailVo != null ) this.patPseDetailVo._xStreamDec();
    if( this.patPseExam != null ) this.patPseExam._xStreamDec();
    for( int i=0 ; outSideExam != null && i < outSideExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)outSideExam.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; jointExam != null && i < jointExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)jointExam.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; giveUpExam != null && i < giveUpExam.size() ; i++ ) {
        kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo vo = (kr.re.kitech.biz.pat.pse.vo.PatPseDetailVo)giveUpExam.get(i);
        vo._xStreamDec();	 
    }

  }
  
}
