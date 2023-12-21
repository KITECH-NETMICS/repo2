package kr.re.kitech.biz.lpl.lpr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LprRptgReqExp")
public class LplLprPressPrAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LplLprPressPrAprVo(){
    }

    @ElDtoField(logicalName = "lplLprPressPrInfoVo", physicalName = "lplLprPressPrInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo lplLprPressPrInfoVo;

    @ElDtoField(logicalName = "fileList", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "lplLprPressPrInfoVo")
    public kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo getLplLprPressPrInfoVo(){
        return lplLprPressPrInfoVo;
    }

    @ElVoField(physicalName = "lplLprPressPrInfoVo")
    public void setLplLprPressPrInfoVo(kr.re.kitech.biz.lpl.lpr.vo.LplLprPressPrInfoVo lplLprPressPrInfoVo){
        this.lplLprPressPrInfoVo = lplLprPressPrInfoVo;
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
        sb.append("LplLprPressPrAprVo [");
        sb.append("lplLprPressPrInfoVo").append("=").append(lplLprPressPrInfoVo).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.lplLprPressPrInfoVo != null ) this.lplLprPressPrInfoVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.lplLprPressPrInfoVo != null ) this.lplLprPressPrInfoVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
