package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지도교수(활용책임자) 목록 조회")
public class HumApyLndListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyLndListVo(){
    }

    @ElDtoField(logicalName = "휴복직신청 정보", physicalName = "humApyLndInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo humApyLndInfoVo;

    @ElDtoField(logicalName = "휴복직신청 승인후 정보", physicalName = "humApyLndAccptVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyLndAccptVo humApyLndAccptVo;

    @ElVoField(physicalName = "humApyLndInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo getHumApyLndInfoVo(){
        return humApyLndInfoVo;
    }

    @ElVoField(physicalName = "humApyLndInfoVo")
    public void setHumApyLndInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApyLndInfoVo humApyLndInfoVo){
        this.humApyLndInfoVo = humApyLndInfoVo;
    }

    @ElVoField(physicalName = "humApyLndAccptVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyLndAccptVo getHumApyLndAccptVo(){
        return humApyLndAccptVo;
    }

    @ElVoField(physicalName = "humApyLndAccptVo")
    public void setHumApyLndAccptVo(kr.re.kitech.biz.hum.apy.vo.HumApyLndAccptVo humApyLndAccptVo){
        this.humApyLndAccptVo = humApyLndAccptVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyLndListVo [");
        sb.append("humApyLndInfoVo").append("=").append(humApyLndInfoVo).append(",");
        sb.append("humApyLndAccptVo").append("=").append(humApyLndAccptVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApyLndInfoVo != null ) this.humApyLndInfoVo._xStreamEnc();
        if( this.humApyLndAccptVo != null ) this.humApyLndAccptVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.humApyLndInfoVo != null ) this.humApyLndInfoVo._xStreamDec();
        if( this.humApyLndAccptVo != null ) this.humApyLndAccptVo._xStreamDec();
    }


}
