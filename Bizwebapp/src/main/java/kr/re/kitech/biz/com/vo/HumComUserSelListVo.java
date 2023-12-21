package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사용자검색")
public class HumComUserSelListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumComUserSelListVo(){
    }

    @ElDtoField(logicalName = "사용자검색List", physicalName = "humComUserSelVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.HumComUserSelVo> humComUserSelVoList;

    @ElVoField(physicalName = "humComUserSelVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.HumComUserSelVo> getHumComUserSelVoList(){
        return humComUserSelVoList;
    }

    @ElVoField(physicalName = "humComUserSelVoList")
    public void setHumComUserSelVoList(java.util.List<kr.re.kitech.biz.com.vo.HumComUserSelVo> humComUserSelVoList){
        this.humComUserSelVoList = humComUserSelVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumComUserSelListVo [");
        sb.append("humComUserSelVoList").append("=").append(humComUserSelVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humComUserSelVoList != null && i < humComUserSelVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.HumComUserSelVo vo = (kr.re.kitech.biz.com.vo.HumComUserSelVo)humComUserSelVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humComUserSelVoList != null && i < humComUserSelVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.HumComUserSelVo vo = (kr.re.kitech.biz.com.vo.HumComUserSelVo)humComUserSelVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
