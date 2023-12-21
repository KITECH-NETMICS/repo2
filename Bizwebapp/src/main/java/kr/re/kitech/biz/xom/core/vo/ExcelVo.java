package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "엑셀")
public class ExcelVo extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public ExcelVo(){
    }

    @ElDtoField(logicalName = "엑셀헤더", physicalName = "headerList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo> headerList;

    @ElVoField(physicalName = "headerList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo> getHeaderList(){
        return headerList;
    }

    @ElVoField(physicalName = "headerList")
    public void setHeaderList(java.util.List<kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo> headerList){
        this.headerList = headerList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExcelVo [");
        sb.append("headerList").append("=").append(headerList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; headerList != null && i < headerList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo vo = (kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo)headerList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; headerList != null && i < headerList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo vo = (kr.re.kitech.biz.xom.core.vo.ExcelHeaderVo)headerList.get(i);
            vo._xStreamDec();	 
        }
    }


}
