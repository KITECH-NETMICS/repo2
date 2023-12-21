package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지도교수(활용책임자) 목록 조회")
public class HumApyEduListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyEduListVo(){
    }

    @ElDtoField(logicalName = "학력사항변경신청List", physicalName = "humApyEduInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo> humApyEduInfoVoList;

    @ElDtoField(logicalName = "학력사항변경신청", physicalName = "humApyEduInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo humApyEduInfoVo;

    @ElVoField(physicalName = "humApyEduInfoVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo> getHumApyEduInfoVoList(){
        return humApyEduInfoVoList;
    }

    @ElVoField(physicalName = "humApyEduInfoVoList")
    public void setHumApyEduInfoVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo> humApyEduInfoVoList){
        this.humApyEduInfoVoList = humApyEduInfoVoList;
    }

    @ElVoField(physicalName = "humApyEduInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo getHumApyEduInfoVo(){
        return humApyEduInfoVo;
    }

    @ElVoField(physicalName = "humApyEduInfoVo")
    public void setHumApyEduInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo humApyEduInfoVo){
        this.humApyEduInfoVo = humApyEduInfoVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyEduListVo [");
        sb.append("humApyEduInfoVoList").append("=").append(humApyEduInfoVoList).append(",");
        sb.append("humApyEduInfoVo").append("=").append(humApyEduInfoVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyEduInfoVoList != null && i < humApyEduInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo)humApyEduInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humApyEduInfoVo != null ) this.humApyEduInfoVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyEduInfoVoList != null && i < humApyEduInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyEduInfoVo)humApyEduInfoVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humApyEduInfoVo != null ) this.humApyEduInfoVo._xStreamDec();
    }


}
