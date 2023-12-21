package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "일반,경비결의작성 VO")
public class FinSaveSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSaveSlipVo(){
    }

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "slipDVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수")
    private kr.re.kitech.biz.fin.com.vo.FspSlipDVo slipDVo;

    @ElDtoField(logicalName = "결의서 송금내역 ListVo", physicalName = "sendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList;

    @ElDtoField(logicalName = "결의서관리항목 ListVo", physicalName = "mngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList;

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @ElVoField(physicalName = "slipDVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipDVo getSlipDVo(){
        return slipDVo;
    }

    @ElVoField(physicalName = "slipDVo")
    public void setSlipDVo(kr.re.kitech.biz.fin.com.vo.FspSlipDVo slipDVo){
        this.slipDVo = slipDVo;
    }

    @ElVoField(physicalName = "sendList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> getSendList(){
        return sendList;
    }

    @ElVoField(physicalName = "sendList")
    public void setSendList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList){
        this.sendList = sendList;
    }

    @ElVoField(physicalName = "mngmtList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> getMngmtList(){
        return mngmtList;
    }

    @ElVoField(physicalName = "mngmtList")
    public void setMngmtList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList){
        this.mngmtList = mngmtList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSaveSlipVo [");
        sb.append("slipHVo").append("=").append(slipHVo).append(",");
        sb.append("slipDVo").append("=").append(slipDVo).append(",");
        sb.append("sendList").append("=").append(sendList).append(",");
        sb.append("mngmtList").append("=").append(mngmtList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
        if( this.slipDVo != null ) this.slipDVo._xStreamEnc();
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
        if( this.slipDVo != null ) this.slipDVo._xStreamDec();
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamDec();	 
        }
    }


}
