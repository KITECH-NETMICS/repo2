package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결제 저장 Vo")
public class SptCardPaymntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCardPaymntVo(){
    }

    @ElDtoField(logicalName = "카드결제 응답 Vo", physicalName = "hisVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptCardHisVo hisVo;

    @ElDtoField(logicalName = "기술지원접수정보 Vo", physicalName = "rcptVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo rcptVo;

    @ElVoField(physicalName = "hisVo")
    public kr.re.kitech.biz.sup.tec.vo.SptCardHisVo getHisVo(){
        return hisVo;
    }

    @ElVoField(physicalName = "hisVo")
    public void setHisVo(kr.re.kitech.biz.sup.tec.vo.SptCardHisVo hisVo){
        this.hisVo = hisVo;
    }

    @ElVoField(physicalName = "rcptVo")
    public kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo getRcptVo(){
        return rcptVo;
    }

    @ElVoField(physicalName = "rcptVo")
    public void setRcptVo(kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo rcptVo){
        this.rcptVo = rcptVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCardPaymntVo [");
        sb.append("hisVo").append("=").append(hisVo).append(",");
        sb.append("rcptVo").append("=").append(rcptVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.hisVo != null ) this.hisVo._xStreamEnc();
        if( this.rcptVo != null ) this.rcptVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.hisVo != null ) this.hisVo._xStreamDec();
        if( this.rcptVo != null ) this.rcptVo._xStreamDec();
    }


}
