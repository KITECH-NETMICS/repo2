package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예외정보 List Vo")
public class ExceptItemListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ExceptItemListVo(){
    }

    @ElDtoField(logicalName = "예외정보 List", physicalName = "exceptItemVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.ExceptItemVo> exceptItemVoList;

    @ElVoField(physicalName = "exceptItemVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.ExceptItemVo> getExceptItemVoList(){
        return exceptItemVoList;
    }

    @ElVoField(physicalName = "exceptItemVoList")
    public void setExceptItemVoList(java.util.List<kr.re.kitech.biz.com.vo.ExceptItemVo> exceptItemVoList){
        this.exceptItemVoList = exceptItemVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExceptItemListVo [");
        sb.append("exceptItemVoList").append("=").append(exceptItemVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; exceptItemVoList != null && i < exceptItemVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ExceptItemVo vo = (kr.re.kitech.biz.com.vo.ExceptItemVo)exceptItemVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; exceptItemVoList != null && i < exceptItemVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.ExceptItemVo vo = (kr.re.kitech.biz.com.vo.ExceptItemVo)exceptItemVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
