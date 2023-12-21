package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발표논문 ListVo")
public class InvPaperListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvPaperListVo(){
    }

    @ElDtoField(logicalName = "발표논문 Vo List", physicalName = "invPaperVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvPaperVo> invPaperVoList;

    @ElVoField(physicalName = "invPaperVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvPaperVo> getInvPaperVoList(){
        return invPaperVoList;
    }

    @ElVoField(physicalName = "invPaperVoList")
    public void setInvPaperVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvPaperVo> invPaperVoList){
        this.invPaperVoList = invPaperVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvPaperListVo [");
        sb.append("invPaperVoList").append("=").append(invPaperVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invPaperVoList != null && i < invPaperVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvPaperVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvPaperVo)invPaperVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invPaperVoList != null && i < invPaperVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvPaperVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvPaperVo)invPaperVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
