package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "관리항목 및 카드정보 Vo")
public class ExpnsSlipMngmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ExpnsSlipMngmtVo(){
    }

    @ElDtoField(logicalName = "카드결의 카드정보 Vo", physicalName = "cardVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spm.vo.CardInfoVo cardVo;

    @ElDtoField(logicalName = "결의서관리항목 VO", physicalName = "mngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList;

    @ElDtoField(logicalName = "결의서 송금내역 VO", physicalName = "sendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList;

    @ElDtoField(logicalName = "매입계산서 Vo", physicalName = "billVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo billVo;

    @ElVoField(physicalName = "cardVo")
    public kr.re.kitech.biz.fin.spm.vo.CardInfoVo getCardVo(){
        return cardVo;
    }

    @ElVoField(physicalName = "cardVo")
    public void setCardVo(kr.re.kitech.biz.fin.spm.vo.CardInfoVo cardVo){
        this.cardVo = cardVo;
    }

    @ElVoField(physicalName = "mngmtList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> getMngmtList(){
        return mngmtList;
    }

    @ElVoField(physicalName = "mngmtList")
    public void setMngmtList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList){
        this.mngmtList = mngmtList;
    }

    @ElVoField(physicalName = "sendList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> getSendList(){
        return sendList;
    }

    @ElVoField(physicalName = "sendList")
    public void setSendList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList){
        this.sendList = sendList;
    }

    @ElVoField(physicalName = "billVo")
    public kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo getBillVo(){
        return billVo;
    }

    @ElVoField(physicalName = "billVo")
    public void setBillVo(kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrVo billVo){
        this.billVo = billVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpnsSlipMngmtVo [");
        sb.append("cardVo").append("=").append(cardVo).append(",");
        sb.append("mngmtList").append("=").append(mngmtList).append(",");
        sb.append("sendList").append("=").append(sendList).append(",");
        sb.append("billVo").append("=").append(billVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.cardVo != null ) this.cardVo._xStreamEnc();
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.billVo != null ) this.billVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.cardVo != null ) this.cardVo._xStreamDec();
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamDec();	 
        }
        if( this.billVo != null ) this.billVo._xStreamDec();
    }


}
