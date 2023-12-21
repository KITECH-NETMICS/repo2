package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계정별 도서구입현황 리스트 Vo")
public class InvAccntBookListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvAccntBookListVo(){
    }

    @ElDtoField(logicalName = "계정별 도서구입현황 Vo", physicalName = "invAccntBookVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo> invAccntBookVoList;

    @ElVoField(physicalName = "invAccntBookVoList")
    public java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo> getInvAccntBookVoList(){
        return invAccntBookVoList;
    }

    @ElVoField(physicalName = "invAccntBookVoList")
    public void setInvAccntBookVoList(java.util.List<kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo> invAccntBookVoList){
        this.invAccntBookVoList = invAccntBookVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvAccntBookListVo [");
        sb.append("invAccntBookVoList").append("=").append(invAccntBookVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; invAccntBookVoList != null && i < invAccntBookVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo)invAccntBookVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; invAccntBookVoList != null && i < invAccntBookVoList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo vo = (kr.re.kitech.biz.kbk.inv.vo.InvAccntBookVo)invAccntBookVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
