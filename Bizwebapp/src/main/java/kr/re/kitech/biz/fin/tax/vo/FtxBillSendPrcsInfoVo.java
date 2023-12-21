package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자계산서 발송현황 Vo")
public class FtxBillSendPrcsInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillSendPrcsInfoVo(){
    }

    @ElDtoField(logicalName = "전자계산서 발송현황 Vo", physicalName = "sendPrcsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo> sendPrcsList;

    @ElDtoField(logicalName = "전자계산서 발송현황 Vo", physicalName = "reSendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo> reSendList;

    @ElVoField(physicalName = "sendPrcsList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo> getSendPrcsList(){
        return sendPrcsList;
    }

    @ElVoField(physicalName = "sendPrcsList")
    public void setSendPrcsList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo> sendPrcsList){
        this.sendPrcsList = sendPrcsList;
    }

    @ElVoField(physicalName = "reSendList")
    public java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo> getReSendList(){
        return reSendList;
    }

    @ElVoField(physicalName = "reSendList")
    public void setReSendList(java.util.List<kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo> reSendList){
        this.reSendList = reSendList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillSendPrcsInfoVo [");
        sb.append("sendPrcsList").append("=").append(sendPrcsList).append(",");
        sb.append("reSendList").append("=").append(reSendList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; sendPrcsList != null && i < sendPrcsList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo)sendPrcsList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; reSendList != null && i < reSendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo)reSendList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; sendPrcsList != null && i < sendPrcsList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillSendPrcsVo)sendPrcsList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; reSendList != null && i < reSendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo vo = (kr.re.kitech.biz.fin.tax.vo.FtxBillReSendVo)reSendList.get(i);
            vo._xStreamDec();	 
        }
    }


}
