package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서검색")
public class HumBasicInfoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasicInfoListVo(){
    }

    @ElDtoField(logicalName = "근태정보", physicalName = "humBasicInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.com.vo.HumBasicInfoVo> humBasicInfoVoList;

    @ElVoField(physicalName = "humBasicInfoVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.HumBasicInfoVo> getHumBasicInfoVoList(){
        return humBasicInfoVoList;
    }

    @ElVoField(physicalName = "humBasicInfoVoList")
    public void setHumBasicInfoVoList(java.util.List<kr.re.kitech.biz.com.vo.HumBasicInfoVo> humBasicInfoVoList){
        this.humBasicInfoVoList = humBasicInfoVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasicInfoListVo [");
        sb.append("humBasicInfoVoList").append("=").append(humBasicInfoVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humBasicInfoVoList != null && i < humBasicInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.HumBasicInfoVo vo = (kr.re.kitech.biz.com.vo.HumBasicInfoVo)humBasicInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humBasicInfoVoList != null && i < humBasicInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.HumBasicInfoVo vo = (kr.re.kitech.biz.com.vo.HumBasicInfoVo)humBasicInfoVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
