package kr.re.kitech.biz.pat.mnt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatRightMngListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRightMngListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "PatRightMngVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo> PatRightMngVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatRightMngVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo PatRightMngVo;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatApprovalVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.mnt.vo.PatApprovalVo PatApprovalVo;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "PatRightMntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo;
  
  @ElVoField(physicalName = "PatRightMngVoList")
    public java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo> getPatRightMngVoList(){
      return PatRightMngVoList;
  }

  @ElVoField(physicalName = "PatRightMngVoList")
  public void setPatRightMngVoList(java.util.List<kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo> PatRightMngVoList){
      this.PatRightMngVoList = PatRightMngVoList;
  }

  @ElVoField(physicalName = "PatRightMngVo")
    public kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo getPatRightMngVo(){
      return PatRightMngVo;
  }

  @ElVoField(physicalName = "PatRightMngVo")
  public void setPatRightMngVo(kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo PatRightMngVo){
      this.PatRightMngVo = PatRightMngVo;
  }

  @ElVoField(physicalName = "PatApprovalVo")
    public kr.re.kitech.biz.pat.mnt.vo.PatApprovalVo getPatApprovalVo(){
      return PatApprovalVo;
  }

  @ElVoField(physicalName = "PatApprovalVo")
  public void setPatApprovalVo(kr.re.kitech.biz.pat.mnt.vo.PatApprovalVo PatApprovalVo){
      this.PatApprovalVo = PatApprovalVo;
  }

  @ElVoField(physicalName = "PatRightMntVo")
    public kr.re.kitech.biz.pat.com.vo.PatRightMntVo getPatRightMntVo(){
      return PatRightMntVo;
  }

  @ElVoField(physicalName = "PatRightMntVo")
  public void setPatRightMntVo(kr.re.kitech.biz.pat.com.vo.PatRightMntVo PatRightMntVo){
      this.PatRightMntVo = PatRightMntVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRightMngListVo [");
      sb.append("PatRightMngVoList").append("=").append(PatRightMngVoList).append(",");
      sb.append("PatRightMngVo").append("=").append(PatRightMngVo).append(",");
      sb.append("PatApprovalVo").append("=").append(PatApprovalVo).append(",");
      sb.append("PatRightMntVo").append("=").append(PatRightMntVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; PatRightMngVoList != null && i < PatRightMngVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo vo = (kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo)PatRightMngVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.PatRightMngVo != null ) this.PatRightMngVo._xStreamEnc();
    if( this.PatApprovalVo != null ) this.PatApprovalVo._xStreamEnc();
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; PatRightMngVoList != null && i < PatRightMngVoList.size() ; i++ ) {
        kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo vo = (kr.re.kitech.biz.pat.mnt.vo.PatRightMngVo)PatRightMngVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.PatRightMngVo != null ) this.PatRightMngVo._xStreamDec();
    if( this.PatApprovalVo != null ) this.PatApprovalVo._xStreamDec();
    if( this.PatRightMntVo != null ) this.PatRightMntVo._xStreamDec();

  }
  
}
