package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장정보")
public class CtrLocalTripVO extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrLocalTripVO(){
    }

    @ElDtoField(logicalName = "근거리출장정보", physicalName = "tripVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripInfoVO tripVo;

    @ElDtoField(logicalName = "근거리출장자", physicalName = "compnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> compnList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElDtoField(logicalName = "사후결재 Vo", physicalName = "postAprVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.apr.vo.PostAprVo postAprVo;

    @ElDtoField(logicalName = "근거리출장자", physicalName = "biztripPsnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO biztripPsnVo;

    @ElDtoField(logicalName = "근거리출장자", physicalName = "payList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> payList;

    @ElVoField(physicalName = "tripVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripInfoVO getTripVo(){
        return tripVo;
    }

    @ElVoField(physicalName = "tripVo")
    public void setTripVo(kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripInfoVO tripVo){
        this.tripVo = tripVo;
    }

    @ElVoField(physicalName = "compnList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> getCompnList(){
        return compnList;
    }

    @ElVoField(physicalName = "compnList")
    public void setCompnList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> compnList){
        this.compnList = compnList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "docList")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
        return docList;
    }

    @ElVoField(physicalName = "docList")
    public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
        this.docList = docList;
    }

    @ElVoField(physicalName = "postAprVo")
    public kr.re.kitech.biz.apr.vo.PostAprVo getPostAprVo(){
        return postAprVo;
    }

    @ElVoField(physicalName = "postAprVo")
    public void setPostAprVo(kr.re.kitech.biz.apr.vo.PostAprVo postAprVo){
        this.postAprVo = postAprVo;
    }

    @ElVoField(physicalName = "biztripPsnVo")
    public kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO getBiztripPsnVo(){
        return biztripPsnVo;
    }

    @ElVoField(physicalName = "biztripPsnVo")
    public void setBiztripPsnVo(kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO biztripPsnVo){
        this.biztripPsnVo = biztripPsnVo;
    }

    @ElVoField(physicalName = "payList")
    public java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> getPayList(){
        return payList;
    }

    @ElVoField(physicalName = "payList")
    public void setPayList(java.util.List<kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO> payList){
        this.payList = payList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrLocalTripVO [");
        sb.append("tripVo").append("=").append(tripVo).append(",");
        sb.append("compnList").append("=").append(compnList).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("docList").append("=").append(docList).append(",");
        sb.append("postAprVo").append("=").append(postAprVo).append(",");
        sb.append("biztripPsnVo").append("=").append(biztripPsnVo).append(",");
        sb.append("payList").append("=").append(payList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.tripVo != null ) this.tripVo._xStreamEnc();
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO)compnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.postAprVo != null ) this.postAprVo._xStreamEnc();
        if( this.biztripPsnVo != null ) this.biztripPsnVo._xStreamEnc();
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO)payList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.tripVo != null ) this.tripVo._xStreamDec();
        for( int i=0 ; compnList != null && i < compnList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO)compnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
        if( this.postAprVo != null ) this.postAprVo._xStreamDec();
        if( this.biztripPsnVo != null ) this.biztripPsnVo._xStreamDec();
        for( int i=0 ; payList != null && i < payList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO vo = (kr.re.kitech.biz.ccs.ctr.vo.CtrLocalTripCompnVO)payList.get(i);
            vo._xStreamDec();	 
        }
    }


}
