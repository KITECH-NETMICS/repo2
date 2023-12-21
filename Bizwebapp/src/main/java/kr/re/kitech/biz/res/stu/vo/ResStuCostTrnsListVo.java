package kr.re.kitech.biz.res.stu.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResStuCostTrnsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResStuCostTrnsListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "resStuCostTrnsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo> resStuCostTrnsVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "resStuCostTrnsVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo resStuCostTrnsVo;
  
  @ElVoField(physicalName = "resStuCostTrnsVoList")
    public java.util.List<kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo> getResStuCostTrnsVoList(){
      return resStuCostTrnsVoList;
  }

  @ElVoField(physicalName = "resStuCostTrnsVoList")
  public void setResStuCostTrnsVoList(java.util.List<kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo> resStuCostTrnsVoList){
      this.resStuCostTrnsVoList = resStuCostTrnsVoList;
  }

  @ElVoField(physicalName = "resStuCostTrnsVo")
    public kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo getResStuCostTrnsVo(){
      return resStuCostTrnsVo;
  }

  @ElVoField(physicalName = "resStuCostTrnsVo")
  public void setResStuCostTrnsVo(kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo resStuCostTrnsVo){
      this.resStuCostTrnsVo = resStuCostTrnsVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResStuCostTrnsListVo [");
      sb.append("resStuCostTrnsVoList").append("=").append(resStuCostTrnsVoList).append(",");
      sb.append("resStuCostTrnsVo").append("=").append(resStuCostTrnsVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; resStuCostTrnsVoList != null && i < resStuCostTrnsVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo vo = (kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo)resStuCostTrnsVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.resStuCostTrnsVo != null ) this.resStuCostTrnsVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; resStuCostTrnsVoList != null && i < resStuCostTrnsVoList.size() ; i++ ) {
        kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo vo = (kr.re.kitech.biz.res.stu.vo.ResStuCostTrnsVo)resStuCostTrnsVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.resStuCostTrnsVo != null ) this.resStuCostTrnsVo._xStreamDec();

  }
  
}
