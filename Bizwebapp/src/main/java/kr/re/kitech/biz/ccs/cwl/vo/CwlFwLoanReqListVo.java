package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CwlFwLoanReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public CwlFwLoanReqListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "cwlFwLoanReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo> cwlFwLoanReqVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "cwlFwLoanReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo cwlFwLoanReqVo;
  
  @ElVoField(physicalName = "cwlFwLoanReqVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo> getCwlFwLoanReqVoList(){
      return cwlFwLoanReqVoList;
  }

  @ElVoField(physicalName = "cwlFwLoanReqVoList")
  public void setCwlFwLoanReqVoList(java.util.List<kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo> cwlFwLoanReqVoList){
      this.cwlFwLoanReqVoList = cwlFwLoanReqVoList;
  }

  @ElVoField(physicalName = "cwlFwLoanReqVo")
    public kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo getCwlFwLoanReqVo(){
      return cwlFwLoanReqVo;
  }

  @ElVoField(physicalName = "cwlFwLoanReqVo")
  public void setCwlFwLoanReqVo(kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo cwlFwLoanReqVo){
      this.cwlFwLoanReqVo = cwlFwLoanReqVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("CwlFwLoanReqListVo [");
      sb.append("cwlFwLoanReqVoList").append("=").append(cwlFwLoanReqVoList).append(",");
      sb.append("cwlFwLoanReqVo").append("=").append(cwlFwLoanReqVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; cwlFwLoanReqVoList != null && i < cwlFwLoanReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo)cwlFwLoanReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.cwlFwLoanReqVo != null ) this.cwlFwLoanReqVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; cwlFwLoanReqVoList != null && i < cwlFwLoanReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo vo = (kr.re.kitech.biz.ccs.cwl.vo.CwlFwLoanReqVo)cwlFwLoanReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.cwlFwLoanReqVo != null ) this.cwlFwLoanReqVo._xStreamDec();

  }
  
}
