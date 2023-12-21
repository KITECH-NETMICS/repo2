package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "파트너기업 정보변경 신청 목록 List Vo")
public class SupParCustMentrChnghListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SupParCustMentrChnghListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "supParCustMentrChnghVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo> supParCustMentrChnghVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "supParCustMentrChnghVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo supParCustMentrChnghVo;
  
  @ElVoField(physicalName = "supParCustMentrChnghVoList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo> getSupParCustMentrChnghVoList(){
      return supParCustMentrChnghVoList;
  }

  @ElVoField(physicalName = "supParCustMentrChnghVoList")
  public void setSupParCustMentrChnghVoList(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo> supParCustMentrChnghVoList){
      this.supParCustMentrChnghVoList = supParCustMentrChnghVoList;
  }

  @ElVoField(physicalName = "supParCustMentrChnghVo")
    public kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo getSupParCustMentrChnghVo(){
      return supParCustMentrChnghVo;
  }

  @ElVoField(physicalName = "supParCustMentrChnghVo")
  public void setSupParCustMentrChnghVo(kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo supParCustMentrChnghVo){
      this.supParCustMentrChnghVo = supParCustMentrChnghVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SupParCustMentrChnghListVo [");
      sb.append("supParCustMentrChnghVoList").append("=").append(supParCustMentrChnghVoList).append(",");
      sb.append("supParCustMentrChnghVo").append("=").append(supParCustMentrChnghVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; supParCustMentrChnghVoList != null && i < supParCustMentrChnghVoList.size() ; i++ ) {
        kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo)supParCustMentrChnghVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.supParCustMentrChnghVo != null ) this.supParCustMentrChnghVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; supParCustMentrChnghVoList != null && i < supParCustMentrChnghVoList.size() ; i++ ) {
        kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo)supParCustMentrChnghVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.supParCustMentrChnghVo != null ) this.supParCustMentrChnghVo._xStreamDec();

  }
  
}
