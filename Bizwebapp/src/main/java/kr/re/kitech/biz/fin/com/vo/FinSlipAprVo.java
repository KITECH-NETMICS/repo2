package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "일반,경비결의작성 VO")
public class FinSlipAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSlipAprVo(){
    }

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElDtoField(logicalName = "결의서 디테일 결재 Vo", physicalName = "slipdList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo> slipdList;

    @ElDtoField(logicalName = "결의서 송금내역 ListVo", physicalName = "sendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList;

    @ElDtoField(logicalName = "결의서관리항목 ListVo", physicalName = "mngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "신연구비증빙내역Vo", physicalName = "evidList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> evidList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "evidFileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList;

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @ElVoField(physicalName = "slipdList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo> getSlipdList(){
        return slipdList;
    }

    @ElVoField(physicalName = "slipdList")
    public void setSlipdList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo> slipdList){
        this.slipdList = slipdList;
    }

    @ElVoField(physicalName = "sendList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> getSendList(){
        return sendList;
    }

    @ElVoField(physicalName = "sendList")
    public void setSendList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList){
        this.sendList = sendList;
    }

    @ElVoField(physicalName = "mngmtList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> getMngmtList(){
        return mngmtList;
    }

    @ElVoField(physicalName = "mngmtList")
    public void setMngmtList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList){
        this.mngmtList = mngmtList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "evidList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> getEvidList(){
        return evidList;
    }

    @ElVoField(physicalName = "evidList")
    public void setEvidList(java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> evidList){
        this.evidList = evidList;
    }

    @ElVoField(physicalName = "evidFileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getEvidFileList(){
        return evidFileList;
    }

    @ElVoField(physicalName = "evidFileList")
    public void setEvidFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList){
        this.evidFileList = evidFileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSlipAprVo [");
        sb.append("slipHVo").append("=").append(slipHVo).append(",");
        sb.append("slipdList").append("=").append(slipdList).append(",");
        sb.append("sendList").append("=").append(sendList).append(",");
        sb.append("mngmtList").append("=").append(mngmtList).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("evidList").append("=").append(evidList).append(",");
        sb.append("evidFileList").append("=").append(evidFileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
        for( int i=0 ; slipdList != null && i < slipdList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo)slipdList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo vo = (kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo)evidList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
        for( int i=0 ; slipdList != null && i < slipdList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipDAprVo)slipdList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo vo = (kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo)evidList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
