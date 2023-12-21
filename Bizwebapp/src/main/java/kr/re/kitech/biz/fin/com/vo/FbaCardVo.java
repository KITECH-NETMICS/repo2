package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드정보Vo")
public class FbaCardVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaCardVo(){
    }

    @ElDtoField(logicalName = "카드번호", physicalName = "cardno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cardno;

    @ElDtoField(logicalName = "카드번호 2", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "카드종류", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;

    @ElDtoField(logicalName = "카드구분", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;

    @ElVoField(physicalName = "cardno")
    public String getCardno(){
        return cardno;
    }

    @ElVoField(physicalName = "cardno")
    public void setCardno(String cardno){
        this.cardno = cardno;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }

    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }

    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }

    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaCardVo [");
        sb.append("cardno").append("=").append(cardno).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("card_knd").append("=").append(card_knd).append(",");
        sb.append("card_clsf").append("=").append(card_clsf);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
