package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품 결의생성정보 Vo")
public class FinCheckupSlipInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCheckupSlipInfoVo(){
    }

    @ElDtoField(logicalName = "소액물품결의생성 Vo", physicalName = "checkVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo checkVo;

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElVoField(physicalName = "checkVo")
    public kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo getCheckVo(){
        return checkVo;
    }

    @ElVoField(physicalName = "checkVo")
    public void setCheckVo(kr.re.kitech.biz.fin.spa.vo.FspSmlItmCheckupSlipVo checkVo){
        this.checkVo = checkVo;
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
        sb.append("FinCheckupSlipInfoVo [");
        sb.append("checkVo").append("=").append(checkVo).append(",");
        sb.append("slipHVo").append("=").append(slipHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.checkVo != null ) this.checkVo._xStreamEnc();
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.checkVo != null ) this.checkVo._xStreamDec();
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
    }


}
