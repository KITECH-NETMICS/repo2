package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서구입신청리스트조회ListVO")
public class LibBookPurListSrcListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibBookPurListSrcListVo(){
    }

    @ElDtoField(logicalName = "도서구입신청리스트조회VO", physicalName = "libBookPurListSrcVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo> libBookPurListSrcVoList;

    @ElVoField(physicalName = "libBookPurListSrcVoList")
    public java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo> getLibBookPurListSrcVoList(){
        return libBookPurListSrcVoList;
    }

    @ElVoField(physicalName = "libBookPurListSrcVoList")
    public void setLibBookPurListSrcVoList(java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo> libBookPurListSrcVoList){
        this.libBookPurListSrcVoList = libBookPurListSrcVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibBookPurListSrcListVo [");
        sb.append("libBookPurListSrcVoList").append("=").append(libBookPurListSrcVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; libBookPurListSrcVoList != null && i < libBookPurListSrcVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo)libBookPurListSrcVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; libBookPurListSrcVoList != null && i < libBookPurListSrcVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibBookPurListSrcVo)libBookPurListSrcVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
