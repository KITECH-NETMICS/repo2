package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "콘도신청리스트VO")
public class CgsCondoReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCondoReqListVo(){
    }

    @ElDtoField(logicalName = "콘도신청리스트", physicalName = "cgsCondoListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo> cgsCondoListVo;

    @ElDtoField(logicalName = "콘도신청상세", physicalName = "cgsCondoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo cgsCondoVo;

    @ElVoField(physicalName = "cgsCondoListVo")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo> getCgsCondoListVo(){
        return cgsCondoListVo;
    }

    @ElVoField(physicalName = "cgsCondoListVo")
    public void setCgsCondoListVo(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo> cgsCondoListVo){
        this.cgsCondoListVo = cgsCondoListVo;
    }

    @ElVoField(physicalName = "cgsCondoVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo getCgsCondoVo(){
        return cgsCondoVo;
    }

    @ElVoField(physicalName = "cgsCondoVo")
    public void setCgsCondoVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo cgsCondoVo){
        this.cgsCondoVo = cgsCondoVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCondoReqListVo [");
        sb.append("cgsCondoListVo").append("=").append(cgsCondoListVo).append(",");
        sb.append("cgsCondoVo").append("=").append(cgsCondoVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cgsCondoListVo != null && i < cgsCondoListVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo)cgsCondoListVo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsCondoVo != null ) this.cgsCondoVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cgsCondoListVo != null && i < cgsCondoListVo.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCondoReqVo)cgsCondoListVo.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsCondoVo != null ) this.cgsCondoVo._xStreamDec();
    }


}
