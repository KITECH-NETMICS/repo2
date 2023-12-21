package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumApyTrainLstReqListVo")
public class HumApyTrainLstReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyTrainLstReqListVo(){
  }

  @ElDtoField(logicalName = "ListVo", physicalName = "humApyTrainLstReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo> humApyTrainLstReqVoList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "humApyTrainLstReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo humApyTrainLstReqVo;
  
  @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;
  
  @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;
  
  @ElDtoField(logicalName = "참석자정보", physicalName = "attentList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> attentList;
  
  @ElDtoField(logicalName = "Vo", physicalName = "humApyEducVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private kr.re.kitech.biz.hum.apy.vo.HumApyEducVo humApyEducVo;
  
  @ElVoField(physicalName = "humApyTrainLstReqVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo> getHumApyTrainLstReqVoList(){
      return humApyTrainLstReqVoList;
  }

  @ElVoField(physicalName = "humApyTrainLstReqVoList")
  public void setHumApyTrainLstReqVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo> humApyTrainLstReqVoList){
      this.humApyTrainLstReqVoList = humApyTrainLstReqVoList;
  }

  @ElVoField(physicalName = "humApyTrainLstReqVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo getHumApyTrainLstReqVo(){
      return humApyTrainLstReqVo;
  }

  @ElVoField(physicalName = "humApyTrainLstReqVo")
  public void setHumApyTrainLstReqVo(kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo humApyTrainLstReqVo){
      this.humApyTrainLstReqVo = humApyTrainLstReqVo;
  }
  
  @ElVoField(physicalName = "docList")
  public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
      return docList;
  }

  @ElVoField(physicalName = "docList")
  public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
      this.docList = docList;
  }
  
  @ElVoField(physicalName = "fileList")
  public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
      return fileList;
  }

  @ElVoField(physicalName = "fileList")
  public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
      this.fileList = fileList;
  }
  
  @ElVoField(physicalName = "attentList")
  public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> getAttentList(){
    return attentList;
	}
	
	@ElVoField(physicalName = "attentList")
	public void setAttentList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo> attentList){
	    this.attentList = attentList;
	}
	
	@ElVoField(physicalName = "humApyEducVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyEducVo getHumApyEducVo(){
      return humApyEducVo;
  }

  @ElVoField(physicalName = "humApyEducVo")
  public void setHumApyEducVo(kr.re.kitech.biz.hum.apy.vo.HumApyEducVo humApyEducVo){
      this.humApyEducVo = humApyEducVo;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyTrainLstReqListVo [");
      sb.append("humApyTrainLstReqVoList").append("=").append(humApyTrainLstReqVoList).append(",");
      sb.append("humApyTrainLstReqVo").append("=").append(humApyTrainLstReqVo).append(",");
      sb.append("docList").append("=").append(docList).append(",");
      sb.append("fileList").append("=").append(fileList).append(",");
      sb.append("attentList").append("=").append(attentList).append(",");
      sb.append("humApyEducVo").append("=").append(humApyEducVo);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }


  @Override
  public void _xStreamEnc() {
    for( int i=0 ; humApyTrainLstReqVoList != null && i < humApyTrainLstReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo)humApyTrainLstReqVoList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.humApyTrainLstReqVo != null ) this.humApyTrainLstReqVo._xStreamEnc();
    for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
        kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
        kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
        vo._xStreamEnc();	 
    }
    for( int i=0 ; attentList != null && i < attentList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo)attentList.get(i);
        vo._xStreamEnc();	 
    }
    if( this.humApyEducVo != null ) this.humApyEducVo._xStreamEnc();
  }


  @Override
  public void _xStreamDec() {
    for( int i=0 ; humApyTrainLstReqVoList != null && i < humApyTrainLstReqVoList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyTrainLstReqVo)humApyTrainLstReqVoList.get(i);
        vo._xStreamDec();	 
    }
    if( this.humApyTrainLstReqVo != null ) this.humApyTrainLstReqVo._xStreamDec();
    for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
        kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
        kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
        vo._xStreamDec();	 
    }
    for( int i=0 ; attentList != null && i < attentList.size() ; i++ ) {
        kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduCpacpVo)attentList.get(i);
        vo._xStreamDec();	 
    }
    if( this.humApyEducVo != null ) this.humApyEducVo._xStreamDec();
  }  
}
