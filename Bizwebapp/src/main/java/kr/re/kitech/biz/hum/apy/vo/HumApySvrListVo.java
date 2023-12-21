package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApySvrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApySvrListVo(){
    }

    @ElDtoField(logicalName = "퇴직신청List", physicalName = "humApySvrVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApySvrVo> humApySvrVoList;

    @ElDtoField(logicalName = "퇴직신청", physicalName = "humApySvrVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApySvrVo humApySvrVo;

    @ElDtoField(logicalName = "보유자산VO", physicalName = "assetsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.AssetsVo> assetsVoList;

    @ElVoField(physicalName = "humApySvrVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApySvrVo> getHumApySvrVoList(){
        return humApySvrVoList;
    }

    @ElVoField(physicalName = "humApySvrVoList")
    public void setHumApySvrVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApySvrVo> humApySvrVoList){
        this.humApySvrVoList = humApySvrVoList;
    }

    @ElVoField(physicalName = "humApySvrVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApySvrVo getHumApySvrVo(){
        return humApySvrVo;
    }

    @ElVoField(physicalName = "humApySvrVo")
    public void setHumApySvrVo(kr.re.kitech.biz.hum.apy.vo.HumApySvrVo humApySvrVo){
        this.humApySvrVo = humApySvrVo;
    }

    @ElVoField(physicalName = "assetsVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.AssetsVo> getAssetsVoList(){
        return assetsVoList;
    }

    @ElVoField(physicalName = "assetsVoList")
    public void setAssetsVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.AssetsVo> assetsVoList){
        this.assetsVoList = assetsVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApySvrListVo [");
        sb.append("humApySvrVoList").append("=").append(humApySvrVoList).append(",");
        sb.append("humApySvrVo").append("=").append(humApySvrVo).append(",");
        sb.append("assetsVoList").append("=").append(assetsVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApySvrVoList != null && i < humApySvrVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApySvrVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApySvrVo)humApySvrVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humApySvrVo != null ) this.humApySvrVo._xStreamEnc();
        for( int i=0 ; assetsVoList != null && i < assetsVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.AssetsVo vo = (kr.re.kitech.biz.hum.apy.vo.AssetsVo)assetsVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApySvrVoList != null && i < humApySvrVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApySvrVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApySvrVo)humApySvrVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humApySvrVo != null ) this.humApySvrVo._xStreamDec();
        for( int i=0 ; assetsVoList != null && i < assetsVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.AssetsVo vo = (kr.re.kitech.biz.hum.apy.vo.AssetsVo)assetsVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
