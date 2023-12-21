package kr.re.kitech.biz.hum.sal.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumSalPayListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumSalPayListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "humSalPayVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> humSalPayVoList;

    @ElDtoField(logicalName = "수당내역Vo", physicalName = "humSalPayVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.sal.vo.HumSalPayVo humSalPayVo;

    @ElDtoField(logicalName = "공제내역Vo", physicalName = "humSalPayDdtVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> humSalPayDdtVo;

    @ElDtoField(logicalName = "급여정산정보Vo", physicalName = "humSalPayAmtDtlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.sal.vo.HumSalPayVo humSalPayAmtDtlVo;

    @ElVoField(physicalName = "humSalPayVoList")
    public java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> getHumSalPayVoList(){
        return humSalPayVoList;
    }

    @ElVoField(physicalName = "humSalPayVoList")
    public void setHumSalPayVoList(java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> humSalPayVoList){
        this.humSalPayVoList = humSalPayVoList;
    }

    @ElVoField(physicalName = "humSalPayVo")
    public kr.re.kitech.biz.hum.sal.vo.HumSalPayVo getHumSalPayVo(){
        return humSalPayVo;
    }

    @ElVoField(physicalName = "humSalPayVo")
    public void setHumSalPayVo(kr.re.kitech.biz.hum.sal.vo.HumSalPayVo humSalPayVo){
        this.humSalPayVo = humSalPayVo;
    }

    @ElVoField(physicalName = "humSalPayDdtVo")
    public java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> getHumSalPayDdtVo(){
        return humSalPayDdtVo;
    }

    @ElVoField(physicalName = "humSalPayDdtVo")
    public void setHumSalPayDdtVo(java.util.List<kr.re.kitech.biz.hum.sal.vo.HumSalPayVo> humSalPayDdtVo){
        this.humSalPayDdtVo = humSalPayDdtVo;
    }

    @ElVoField(physicalName = "humSalPayAmtDtlVo")
    public kr.re.kitech.biz.hum.sal.vo.HumSalPayVo getHumSalPayAmtDtlVo(){
        return humSalPayAmtDtlVo;
    }

    @ElVoField(physicalName = "humSalPayAmtDtlVo")
    public void setHumSalPayAmtDtlVo(kr.re.kitech.biz.hum.sal.vo.HumSalPayVo humSalPayAmtDtlVo){
        this.humSalPayAmtDtlVo = humSalPayAmtDtlVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumSalPayListVo [");
        sb.append("humSalPayVoList").append("=").append(humSalPayVoList).append(",");
        sb.append("humSalPayVo").append("=").append(humSalPayVo).append(",");
        sb.append("humSalPayDdtVo").append("=").append(humSalPayDdtVo).append(",");
        sb.append("humSalPayAmtDtlVo").append("=").append(humSalPayAmtDtlVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humSalPayVoList != null && i < humSalPayVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.sal.vo.HumSalPayVo vo = (kr.re.kitech.biz.hum.sal.vo.HumSalPayVo)humSalPayVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humSalPayVo != null ) this.humSalPayVo._xStreamEnc();
        for( int i=0 ; humSalPayDdtVo != null && i < humSalPayDdtVo.size() ; i++ ) {
            kr.re.kitech.biz.hum.sal.vo.HumSalPayVo vo = (kr.re.kitech.biz.hum.sal.vo.HumSalPayVo)humSalPayDdtVo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humSalPayAmtDtlVo != null ) this.humSalPayAmtDtlVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humSalPayVoList != null && i < humSalPayVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.sal.vo.HumSalPayVo vo = (kr.re.kitech.biz.hum.sal.vo.HumSalPayVo)humSalPayVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humSalPayVo != null ) this.humSalPayVo._xStreamDec();
        for( int i=0 ; humSalPayDdtVo != null && i < humSalPayDdtVo.size() ; i++ ) {
            kr.re.kitech.biz.hum.sal.vo.HumSalPayVo vo = (kr.re.kitech.biz.hum.sal.vo.HumSalPayVo)humSalPayDdtVo.get(i);
            vo._xStreamDec();	 
        }
        if( this.humSalPayAmtDtlVo != null ) this.humSalPayAmtDtlVo._xStreamDec();
    }


}
