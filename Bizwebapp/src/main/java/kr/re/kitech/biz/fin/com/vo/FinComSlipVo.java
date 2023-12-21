package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자동결의 Vo")
public class FinComSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinComSlipVo(){
    }

    @ElDtoField(logicalName = "결의서디테일VO", physicalName = "slipDVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipDVo slipDVo;

    @ElDtoField(logicalName = "결의서관리항목 VO", physicalName = "mngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList;

    @ElDtoField(logicalName = "잔액생성Vo", physicalName = "ramtVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo ramtVo;

    @ElDtoField(logicalName = "결의서 송금내역 VO", physicalName = "sendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "결의서헤더VO(예산통제모듈호출시)", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElVoField(physicalName = "slipDVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipDVo getSlipDVo(){
        return slipDVo;
    }

    @ElVoField(physicalName = "slipDVo")
    public void setSlipDVo(kr.re.kitech.biz.fin.com.vo.FspSlipDVo slipDVo){
        this.slipDVo = slipDVo;
    }

    @ElVoField(physicalName = "mngmtList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> getMngmtList(){
        return mngmtList;
    }

    @ElVoField(physicalName = "mngmtList")
    public void setMngmtList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo> mngmtList){
        this.mngmtList = mngmtList;
    }

    @ElVoField(physicalName = "ramtVo")
    public kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo getRamtVo(){
        return ramtVo;
    }

    @ElVoField(physicalName = "ramtVo")
    public void setRamtVo(kr.re.kitech.biz.fin.com.vo.FspRamtCreatVo ramtVo){
        this.ramtVo = ramtVo;
    }

    @ElVoField(physicalName = "sendList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> getSendList(){
        return sendList;
    }

    @ElVoField(physicalName = "sendList")
    public void setSendList(java.util.List<kr.re.kitech.biz.fin.com.vo.FspSendReqVo> sendList){
        this.sendList = sendList;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinComSlipVo [");
        sb.append("slipDVo").append("=").append(slipDVo).append(",");
        sb.append("mngmtList").append("=").append(mngmtList).append(",");
        sb.append("ramtVo").append("=").append(ramtVo).append(",");
        sb.append("sendList").append("=").append(sendList).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("slipHVo").append("=").append(slipHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.slipDVo != null ) this.slipDVo._xStreamEnc();
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.ramtVo != null ) this.ramtVo._xStreamEnc();
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.slipDVo != null ) this.slipDVo._xStreamDec();
        for( int i=0 ; mngmtList != null && i < mngmtList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo vo = (kr.re.kitech.biz.fin.com.vo.FspSlipMngmtVo)mngmtList.get(i);
            vo._xStreamDec();	 
        }
        if( this.ramtVo != null ) this.ramtVo._xStreamDec();
        for( int i=0 ; sendList != null && i < sendList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FspSendReqVo vo = (kr.re.kitech.biz.fin.com.vo.FspSendReqVo)sendList.get(i);
            vo._xStreamDec();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
    }


}
