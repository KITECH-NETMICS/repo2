package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드관리 List Vo")
public class FbaCardListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaCardListVo(){
    }

    @ElDtoField(logicalName = "카드정보 Vo", physicalName = "cardList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.std.vo.StdFbaCardVo> cardList;

    @ElVoField(physicalName = "cardList")
    public java.util.List<kr.re.kitech.biz.fin.std.vo.StdFbaCardVo> getCardList(){
        return cardList;
    }

    @ElVoField(physicalName = "cardList")
    public void setCardList(java.util.List<kr.re.kitech.biz.fin.std.vo.StdFbaCardVo> cardList){
        this.cardList = cardList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaCardListVo [");
        sb.append("cardList").append("=").append(cardList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cardList != null && i < cardList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.StdFbaCardVo vo = (kr.re.kitech.biz.fin.std.vo.StdFbaCardVo)cardList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cardList != null && i < cardList.size() ; i++ ) {
            kr.re.kitech.biz.fin.std.vo.StdFbaCardVo vo = (kr.re.kitech.biz.fin.std.vo.StdFbaCardVo)cardList.get(i);
            vo._xStreamDec();	 
        }
    }


}
