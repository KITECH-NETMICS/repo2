package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApyCompanListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyCompanListVo(){
    }

    @ElDtoField(logicalName = "퇴직신청", physicalName = "humApyCompanVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo> humApyCompanVoList;

    @ElVoField(physicalName = "humApyCompanVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo> getHumApyCompanVoList(){
        return humApyCompanVoList;
    }

    @ElVoField(physicalName = "humApyCompanVoList")
    public void setHumApyCompanVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo> humApyCompanVoList){
        this.humApyCompanVoList = humApyCompanVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyCompanListVo [");
        sb.append("humApyCompanVoList").append("=").append(humApyCompanVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyCompanVoList != null && i < humApyCompanVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo)humApyCompanVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyCompanVoList != null && i < humApyCompanVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyCompanVo)humApyCompanVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
