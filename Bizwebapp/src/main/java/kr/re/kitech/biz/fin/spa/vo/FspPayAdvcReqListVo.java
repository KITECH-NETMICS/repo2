package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspPayAdvcReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspPayAdvcReqListVo(){
    }

    @ElDtoField(logicalName = "가지급그리드", physicalName = "fspPayAdvcReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo> fspPayAdvcReqVoList;

    @ElDtoField(logicalName = "가지급폼", physicalName = "fspPayAdvcReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo fspPayAdvcReqVo;

    @ElDtoField(logicalName = "첨부파일1", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "fspPayAdvcReqVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo> getFspPayAdvcReqVoList(){
        return fspPayAdvcReqVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcReqVoList")
    public void setFspPayAdvcReqVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo> fspPayAdvcReqVoList){
        this.fspPayAdvcReqVoList = fspPayAdvcReqVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcReqVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo getFspPayAdvcReqVo(){
        return fspPayAdvcReqVo;
    }

    @ElVoField(physicalName = "fspPayAdvcReqVo")
    public void setFspPayAdvcReqVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo fspPayAdvcReqVo){
        this.fspPayAdvcReqVo = fspPayAdvcReqVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspPayAdvcReqListVo [");
        sb.append("fspPayAdvcReqVoList").append("=").append(fspPayAdvcReqVoList).append(",");
        sb.append("fspPayAdvcReqVo").append("=").append(fspPayAdvcReqVo).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspPayAdvcReqVoList != null && i < fspPayAdvcReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo)fspPayAdvcReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspPayAdvcReqVo != null ) this.fspPayAdvcReqVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspPayAdvcReqVoList != null && i < fspPayAdvcReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcReqVo)fspPayAdvcReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspPayAdvcReqVo != null ) this.fspPayAdvcReqVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
