package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결의 카드정보 List Vo")
public class CardSlipInfoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CardSlipInfoListVo(){
    }

    @ElDtoField(logicalName = "카드결의 카드정보 Vo", physicalName = "cardInfoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spm.vo.CardInfoVo> cardInfoList;

    @ElVoField(physicalName = "cardInfoList")
    public java.util.List<kr.re.kitech.biz.fin.spm.vo.CardInfoVo> getCardInfoList(){
        return cardInfoList;
    }

    @ElVoField(physicalName = "cardInfoList")
    public void setCardInfoList(java.util.List<kr.re.kitech.biz.fin.spm.vo.CardInfoVo> cardInfoList){
        this.cardInfoList = cardInfoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardSlipInfoListVo [");
        sb.append("cardInfoList").append("=").append(cardInfoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cardInfoList != null && i < cardInfoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.CardInfoVo vo = (kr.re.kitech.biz.fin.spm.vo.CardInfoVo)cardInfoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cardInfoList != null && i < cardInfoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spm.vo.CardInfoVo vo = (kr.re.kitech.biz.fin.spm.vo.CardInfoVo)cardInfoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
