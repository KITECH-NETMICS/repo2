package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구관리 실행예산 정보")
public class ResExcExeBdgetVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResExcExeBdgetVo(){
    }

    @ElDtoField(logicalName = "연구관리 실행예산 정보", physicalName = "infoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo infoVo;

    @ElDtoField(logicalName = "연구관리 실행예산 정보", physicalName = "listVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> listVo;

    @ElDtoField(logicalName = "첨부파일리스트", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "연구관리 실행예산 정보", physicalName = "detailList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> detailList;

    @ElVoField(physicalName = "infoVo")
    public kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo getInfoVo(){
        return infoVo;
    }

    @ElVoField(physicalName = "infoVo")
    public void setInfoVo(kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo infoVo){
        this.infoVo = infoVo;
    }

    @ElVoField(physicalName = "listVo")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> getListVo(){
        return listVo;
    }

    @ElVoField(physicalName = "listVo")
    public void setListVo(java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> listVo){
        this.listVo = listVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "detailList")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> getDetailList(){
        return detailList;
    }

    @ElVoField(physicalName = "detailList")
    public void setDetailList(java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo> detailList){
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResExcExeBdgetVo [");
        sb.append("infoVo").append("=").append(infoVo).append(",");
        sb.append("listVo").append("=").append(listVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("detailList").append("=").append(detailList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.infoVo != null ) this.infoVo._xStreamEnc();
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo)listVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; detailList != null && i < detailList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo)detailList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.infoVo != null ) this.infoVo._xStreamDec();
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo)listVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; detailList != null && i < detailList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcExeBdgetInfoVo)detailList.get(i);
            vo._xStreamDec();	 
        }
    }


}
