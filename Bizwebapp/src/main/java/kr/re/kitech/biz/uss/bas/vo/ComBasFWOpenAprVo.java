package kr.re.kitech.biz.uss.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "방화벽오픈신청")
public class ComBasFWOpenAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComBasFWOpenAprVo(){
    }

    @ElDtoField(logicalName = "방화벽오픈신청정보", physicalName = "comBasFWOpenInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo comBasFWOpenInfoVo;

    @ElVoField(physicalName = "comBasFWOpenInfoVo")
    public kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo getComBasFWOpenInfoVo(){
        return comBasFWOpenInfoVo;
    }

    @ElVoField(physicalName = "comBasFWOpenInfoVo")
    public void setComBasFWOpenInfoVo(kr.re.kitech.biz.uss.bas.vo.ComBasFWOpenInfoVo comBasFWOpenInfoVo){
        this.comBasFWOpenInfoVo = comBasFWOpenInfoVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComBasFWOpenAprVo [");
        sb.append("comBasFWOpenInfoVo").append("=").append(comBasFWOpenInfoVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.comBasFWOpenInfoVo != null ) this.comBasFWOpenInfoVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.comBasFWOpenInfoVo != null ) this.comBasFWOpenInfoVo._xStreamDec();
    }


}
