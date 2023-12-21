
package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class KtxIssuMstrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public KtxIssuMstrListVo(){
  }

  @ElDtoField(logicalName = "List Vo", physicalName = "KtxIssuMstrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo> KtxIssuMstrVoList;
  
  @ElDtoField(logicalName = "Single Vo", physicalName = "KtxIssuMstrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo KtxIssuMstrVo;
  
  @ElVoField(physicalName = "KtxIssuMstrVoList")
    public java.util.List<kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo> getKtxIssuMstrVoList(){
      return KtxIssuMstrVoList;
  }

  @ElVoField(physicalName = "KtxIssuMstrVoList")
  public void setKtxIssuMstrVoList(java.util.List<kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo> KtxIssuMstrVoList){
      this.KtxIssuMstrVoList = KtxIssuMstrVoList;
  }

  @ElVoField(physicalName = "KtxIssuMstrVo")
    public kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo getKtxIssuMstrVo(){
      return KtxIssuMstrVo;
  }

  @ElVoField(physicalName = "KtxIssuMstrVo")
  public void setKtxIssuMstrVo(kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo KtxIssuMstrVo){
      this.KtxIssuMstrVo = KtxIssuMstrVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("KtxIssuMstrListVo [");
      sb.append("KtxIssuMstrVoList").append("=").append(KtxIssuMstrVoList).append(",");
      sb.append("KtxIssuMstrVo").append("=").append(KtxIssuMstrVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; KtxIssuMstrVoList != null && i < KtxIssuMstrVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo vo = (kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo)KtxIssuMstrVoList.get(i);
        vo._xStreamEnc();  
    }
    if( this.KtxIssuMstrVo != null ) this.KtxIssuMstrVo._xStreamEnc();

  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; KtxIssuMstrVoList != null && i < KtxIssuMstrVoList.size() ; i++ ) {
        kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo vo = (kr.re.kitech.biz.fin.rcms.vo.KtxIssuMstrVo)KtxIssuMstrVoList.get(i);
        vo._xStreamDec();  
    }
    if( this.KtxIssuMstrVo != null ) this.KtxIssuMstrVo._xStreamDec();

  }
  
}
