package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드 리스트 Vo")
public class XodfAccntListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfAccntListVo(){
    }

    @ElDtoField(logicalName = "회계코드 Vo", physicalName = "accntList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.XodfAccntVo> accntList;

    @ElVoField(physicalName = "accntList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.XodfAccntVo> getAccntList(){
        return accntList;
    }

    @ElVoField(physicalName = "accntList")
    public void setAccntList(java.util.List<kr.re.kitech.biz.fin.std.vo.XodfAccntVo> accntList){
        this.accntList = accntList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfAccntListVo [");
        sb.append("accntList").append("=").append(accntList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfAccntVo vo = (kr.re.kitech.biz.fin.std.vo.XodfAccntVo)accntList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; accntList != null && i < accntList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.XodfAccntVo vo = (kr.re.kitech.biz.fin.std.vo.XodfAccntVo)accntList.get(i);
            vo._xStreamDec();	 
        }
    }


}
