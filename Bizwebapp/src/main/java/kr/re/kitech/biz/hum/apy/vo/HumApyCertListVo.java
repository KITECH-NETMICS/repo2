package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "증명서발급신청")
public class HumApyCertListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyCertListVo(){
    }

    @ElDtoField(logicalName = "증명서발급신청List", physicalName = "humApyCertVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCertVo> humApyCertVoList;

    @ElDtoField(logicalName = "증명서발급신청Vo", physicalName = "humApyCertVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyCertVo humApyCertVo;

    @ElVoField(physicalName = "humApyCertVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCertVo> getHumApyCertVoList(){
        return humApyCertVoList;
    }

    @ElVoField(physicalName = "humApyCertVoList")
    public void setHumApyCertVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCertVo> humApyCertVoList){
        this.humApyCertVoList = humApyCertVoList;
    }

    @ElVoField(physicalName = "humApyCertVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyCertVo getHumApyCertVo(){
        return humApyCertVo;
    }

    @ElVoField(physicalName = "humApyCertVo")
    public void setHumApyCertVo(kr.re.kitech.biz.hum.apy.vo.HumApyCertVo humApyCertVo){
        this.humApyCertVo = humApyCertVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyCertListVo [");
        sb.append("humApyCertVoList").append("=").append(humApyCertVoList).append(",");
        sb.append("humApyCertVo").append("=").append(humApyCertVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyCertVoList != null && i < humApyCertVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyCertVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)humApyCertVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humApyCertVo != null ) this.humApyCertVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyCertVoList != null && i < humApyCertVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyCertVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyCertVo)humApyCertVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humApyCertVo != null ) this.humApyCertVo._xStreamDec();
    }


}
