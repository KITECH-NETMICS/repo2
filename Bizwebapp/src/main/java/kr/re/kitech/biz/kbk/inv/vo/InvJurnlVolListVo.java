package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널권호정보 리스트 Vo")
public class InvJurnlVolListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvJurnlVolListVo(){
    }

    @ElDtoField(logicalName = "저널권호정보 Vo", physicalName = "invJurnlVolVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo> invJurnlVolVoList;

    @ElVoField(physicalName = "invJurnlVolVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo> getInvJurnlVolVoList(){
        return invJurnlVolVoList;
    }

    @ElVoField(physicalName = "invJurnlVolVoList")
    public void setInvJurnlVolVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo> invJurnlVolVoList){
        this.invJurnlVolVoList = invJurnlVolVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvJurnlVolListVo [");
        sb.append("invJurnlVolVoList").append("=").append(invJurnlVolVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invJurnlVolVoList != null && i < invJurnlVolVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo)invJurnlVolVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invJurnlVolVoList != null && i < invJurnlVolVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvJurnlVolVo)invJurnlVolVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
