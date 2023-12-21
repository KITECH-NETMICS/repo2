package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자세금계산서 등록 거래처 조회 Vo")
public class XodfVendListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfVendListVo(){
    }

    @ElDtoField(logicalName = "거래처정보 Vo", physicalName = "vendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendVo> vendList;

    @ElVoField(physicalName = "vendList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendVo> getVendList(){
        return vendList;
    }

    @ElVoField(physicalName = "vendList")
    public void setVendList(java.util.List<kr.re.kitech.biz.fin.std.vo.XodfVendVo> vendList){
        this.vendList = vendList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfVendListVo [");
        sb.append("vendList").append("=").append(vendList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendVo)vendList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfVendVo vo = (kr.re.kitech.biz.fin.std.vo.XodfVendVo)vendList.get(i);
            vo._xStreamDec();	 
        }
    }


}
