package kr.re.kitech.biz.hum.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumTaxPayListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumTaxPayListVo(){
    }

    @ElDtoField(logicalName = "Vo", physicalName = "humTaxPayVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo humTaxPayVo;

    @ElDtoField(logicalName = "ListVo", physicalName = "humTaxPayVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo> humTaxPayVoList;

    @ElVoField(physicalName = "humTaxPayVo")
    public kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo getHumTaxPayVo(){
        return humTaxPayVo;
    }

    @ElVoField(physicalName = "humTaxPayVo")
    public void setHumTaxPayVo(kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo humTaxPayVo){
        this.humTaxPayVo = humTaxPayVo;
    }

    @ElVoField(physicalName = "humTaxPayVoList")
    public java.util.List<kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo> getHumTaxPayVoList(){
        return humTaxPayVoList;
    }

    @ElVoField(physicalName = "humTaxPayVoList")
    public void setHumTaxPayVoList(java.util.List<kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo> humTaxPayVoList){
        this.humTaxPayVoList = humTaxPayVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumTaxPayListVo [");
        sb.append("humTaxPayVo").append("=").append(humTaxPayVo).append(",");
        sb.append("humTaxPayVoList").append("=").append(humTaxPayVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humTaxPayVo != null ) this.humTaxPayVo._xStreamEnc();
        for( int i=0 ; humTaxPayVoList != null && i < humTaxPayVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo vo = (kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo)humTaxPayVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humTaxPayVo != null ) this.humTaxPayVo._xStreamDec();
        for( int i=0 ; humTaxPayVoList != null && i < humTaxPayVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo vo = (kr.re.kitech.biz.hum.tax.vo.HumTaxPayVo)humTaxPayVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
