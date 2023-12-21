package kr.re.kitech.biz.hum.ana.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumAnaUserListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumAnaUserListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "humAnaUserVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo> humAnaUserVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "humAnaUserVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo humAnaUserVo;

    @ElVoField(physicalName = "humAnaUserVoList")
    public java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo> getHumAnaUserVoList(){
        return humAnaUserVoList;
    }

    @ElVoField(physicalName = "humAnaUserVoList")
    public void setHumAnaUserVoList(java.util.List<kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo> humAnaUserVoList){
        this.humAnaUserVoList = humAnaUserVoList;
    }

    @ElVoField(physicalName = "humAnaUserVo")
    public kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo getHumAnaUserVo(){
        return humAnaUserVo;
    }

    @ElVoField(physicalName = "humAnaUserVo")
    public void setHumAnaUserVo(kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo humAnaUserVo){
        this.humAnaUserVo = humAnaUserVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumAnaUserListVo [");
        sb.append("humAnaUserVoList").append("=").append(humAnaUserVoList).append(",");
        sb.append("humAnaUserVo").append("=").append(humAnaUserVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humAnaUserVoList != null && i < humAnaUserVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo vo = (kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo)humAnaUserVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humAnaUserVo != null ) this.humAnaUserVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humAnaUserVoList != null && i < humAnaUserVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo vo = (kr.re.kitech.biz.hum.ana.vo.HumAnaUserVo)humAnaUserVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humAnaUserVo != null ) this.humAnaUserVo._xStreamDec();
    }


}
