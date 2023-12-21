package kr.re.kitech.biz.sup.tlt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltDepstInfoExp")
public class SptTltDepstSaveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTltDepstSaveVo(){
    }

    @ElDtoField(logicalName = "입금관리정보 Vo", physicalName = "depstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo depstVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "기술지원내역내역", physicalName = "itemList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo> itemList;

    @ElDtoField(logicalName = "입금의뢰 Vo", physicalName = "reqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo reqVo;

    @ElDtoField(logicalName = "입금내역리스트", physicalName = "detlsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo> detlsList;

    @ElVoField(physicalName = "depstVo")
    public kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo getDepstVo(){
        return depstVo;
    }

    @ElVoField(physicalName = "depstVo")
    public void setDepstVo(kr.re.kitech.biz.sup.tlt.vo.SptTltDepstInfoVo depstVo){
        this.depstVo = depstVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "itemList")
    public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo> getItemList(){
        return itemList;
    }

    @ElVoField(physicalName = "itemList")
    public void setItemList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo> itemList){
        this.itemList = itemList;
    }

    @ElVoField(physicalName = "reqVo")
    public kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo getReqVo(){
        return reqVo;
    }

    @ElVoField(physicalName = "reqVo")
    public void setReqVo(kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo reqVo){
        this.reqVo = reqVo;
    }

    @ElVoField(physicalName = "detlsList")
    public java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo> getDetlsList(){
        return detlsList;
    }

    @ElVoField(physicalName = "detlsList")
    public void setDetlsList(java.util.List<kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo> detlsList){
        this.detlsList = detlsList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTltDepstSaveVo [");
        sb.append("depstVo").append("=").append(depstVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("itemList").append("=").append(itemList).append(",");
        sb.append("reqVo").append("=").append(reqVo).append(",");
        sb.append("detlsList").append("=").append(detlsList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.depstVo != null ) this.depstVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo)itemList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.reqVo != null ) this.reqVo._xStreamEnc();
        for( int i=0 ; detlsList != null && i < detlsList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo)detlsList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.depstVo != null ) this.depstVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltDepstItemVo)itemList.get(i);
            vo._xStreamDec();	 
        }
        if( this.reqVo != null ) this.reqVo._xStreamDec();
        for( int i=0 ; detlsList != null && i < detlsList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo vo = (kr.re.kitech.biz.sup.tlt.vo.SptTltDepstDetlsVo)detlsList.get(i);
            vo._xStreamDec();	 
        }
    }


}
