package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재무결의-소액물품검수 목록 Vo")
public class FspSmlItmChkUpInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSmlItmChkUpInfoVo(){
    }

    @ElDtoField(logicalName = "재무결의-소액물품검수 Vo", physicalName = "mastVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo mastVo;

    @ElDtoField(logicalName = "소액물품검수 품목 Vo", physicalName = "itemList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo> itemList;

    @ElDtoField(logicalName = "화학물질 사전안전성검토 결재 Vo", physicalName = "safeList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo> safeList;

    @ElDtoField(logicalName = "첨부파일", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;

    @ElDtoField(logicalName = "사진첨부", physicalName = "fileList_B", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B;

    @ElDtoField(logicalName = "기타(결제)첨부파일", physicalName = "fileList_C", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_C;

    @ElDtoField(logicalName = "전자증빙", physicalName = "evidFileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList;

    @ElVoField(physicalName = "mastVo")
    public kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo getMastVo(){
        return mastVo;
    }

    @ElVoField(physicalName = "mastVo")
    public void setMastVo(kr.re.kitech.biz.fin.spa.vo.FinSpaChkupCtntVo mastVo){
        this.mastVo = mastVo;
    }

    @ElVoField(physicalName = "itemList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo> getItemList(){
        return itemList;
    }

    @ElVoField(physicalName = "itemList")
    public void setItemList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo> itemList){
        this.itemList = itemList;
    }

    @ElVoField(physicalName = "safeList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo> getSafeList(){
        return safeList;
    }

    @ElVoField(physicalName = "safeList")
    public void setSafeList(java.util.List<kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo> safeList){
        this.safeList = safeList;
    }

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "fileList_B")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_B(){
        return fileList_B;
    }

    @ElVoField(physicalName = "fileList_B")
    public void setFileList_B(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B){
        this.fileList_B = fileList_B;
    }

    @ElVoField(physicalName = "fileList_C")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_C(){
        return fileList_C;
    }

    @ElVoField(physicalName = "fileList_C")
    public void setFileList_C(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_C){
        this.fileList_C = fileList_C;
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
        sb.append("FspSmlItmChkUpInfoVo [");
        sb.append("mastVo").append("=").append(mastVo).append(",");
        sb.append("itemList").append("=").append(itemList).append(",");
        sb.append("safeList").append("=").append(safeList).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("fileList_B").append("=").append(fileList_B).append(",");
        sb.append("fileList_C").append("=").append(fileList_C).append(",");
        sb.append("evidFileList").append("=").append(evidFileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mastVo != null ) this.mastVo._xStreamEnc();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo vo = (kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo)itemList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; safeList != null && i < safeList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo vo = (kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo)safeList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_C != null && i < fileList_C.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_C.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mastVo != null ) this.mastVo._xStreamDec();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo vo = (kr.re.kitech.biz.fin.spa.vo.FspSmlItemCheckupDVo)itemList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; safeList != null && i < safeList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo vo = (kr.re.kitech.biz.fin.spa.vo.SfcChmDetailVo)safeList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_C != null && i < fileList_C.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_C.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
