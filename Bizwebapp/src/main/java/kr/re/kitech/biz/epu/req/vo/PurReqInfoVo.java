package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "내자구매요구작성 Vo")
public class PurReqInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqInfoVo(){
    }

    @ElDtoField(logicalName = "구매요구마스터 Vo", physicalName = "mstrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.req.vo.PurReqMastrVo mstrVo;

    @ElDtoField(logicalName = "구매품목 Vo", physicalName = "itemList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> itemList;

    @ElDtoField(logicalName = "구매요구 계정내역 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList;

    @ElDtoField(logicalName = "구매요구 첨부서류 Vo", physicalName = "purFileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo> purFileList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "구매첨부서류 유무 Vo", physicalName = "fileCntVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.req.vo.PurAttachCntVo fileCntVo;

    @ElVoField(physicalName = "mstrVo")
    public kr.re.kitech.biz.epu.req.vo.PurReqMastrVo getMstrVo(){
        return mstrVo;
    }

    @ElVoField(physicalName = "mstrVo")
    public void setMstrVo(kr.re.kitech.biz.epu.req.vo.PurReqMastrVo mstrVo){
        this.mstrVo = mstrVo;
    }

    @ElVoField(physicalName = "itemList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> getItemList(){
        return itemList;
    }

    @ElVoField(physicalName = "itemList")
    public void setItemList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> itemList){
        this.itemList = itemList;
    }

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAccntVo> accntList){
        this.accntList = accntList;
    }

    @ElVoField(physicalName = "purFileList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo> getPurFileList(){
        return purFileList;
    }

    @ElVoField(physicalName = "purFileList")
    public void setPurFileList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo> purFileList){
        this.purFileList = purFileList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "fileCntVo")
    public kr.re.kitech.biz.epu.req.vo.PurAttachCntVo getFileCntVo(){
        return fileCntVo;
    }

    @ElVoField(physicalName = "fileCntVo")
    public void setFileCntVo(kr.re.kitech.biz.epu.req.vo.PurAttachCntVo fileCntVo){
        this.fileCntVo = fileCntVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqInfoVo [");
        sb.append("mstrVo").append("=").append(mstrVo).append(",");
        sb.append("itemList").append("=").append(itemList).append(",");
        sb.append("accntList").append("=").append(accntList).append(",");
        sb.append("purFileList").append("=").append(purFileList).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("fileCntVo").append("=").append(fileCntVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mstrVo != null ) this.mstrVo._xStreamEnc();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqItemVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqItemVo)itemList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; purFileList != null && i < purFileList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo)purFileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fileCntVo != null ) this.fileCntVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.mstrVo != null ) this.mstrVo._xStreamDec();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqItemVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqItemVo)itemList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAccntVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; purFileList != null && i < purFileList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqAttachFileVo)purFileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fileCntVo != null ) this.fileCntVo._xStreamDec();
    }


}
