package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "대출연장신청 Vo List")
public class LibLoanListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibLoanListVo(){
    }

    @ElDtoField(logicalName = "대출연장신청 Vo", physicalName = "libLoanVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibLoanVo> libLoanVoList;

    @ElVoField(physicalName = "libLoanVoList")
    public java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibLoanVo> getLibLoanVoList(){
        return libLoanVoList;
    }

    @ElVoField(physicalName = "libLoanVoList")
    public void setLibLoanVoList(java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibLoanVo> libLoanVoList){
        this.libLoanVoList = libLoanVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibLoanListVo [");
        sb.append("libLoanVoList").append("=").append(libLoanVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; libLoanVoList != null && i < libLoanVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibLoanVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibLoanVo)libLoanVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; libLoanVoList != null && i < libLoanVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibLoanVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibLoanVo)libLoanVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
