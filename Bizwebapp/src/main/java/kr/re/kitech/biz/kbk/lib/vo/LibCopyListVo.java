package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원문복사신청 List Vo")
public class LibCopyListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibCopyListVo(){
    }

    @ElDtoField(logicalName = "원문복사신청 Vo", physicalName = "libCopyVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibCopyVo> libCopyVoList;

    @ElVoField(physicalName = "libCopyVoList")
    public java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibCopyVo> getLibCopyVoList(){
        return libCopyVoList;
    }

    @ElVoField(physicalName = "libCopyVoList")
    public void setLibCopyVoList(java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibCopyVo> libCopyVoList){
        this.libCopyVoList = libCopyVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibCopyListVo [");
        sb.append("libCopyVoList").append("=").append(libCopyVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; libCopyVoList != null && i < libCopyVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibCopyVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibCopyVo)libCopyVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; libCopyVoList != null && i < libCopyVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibCopyVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibCopyVo)libCopyVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
