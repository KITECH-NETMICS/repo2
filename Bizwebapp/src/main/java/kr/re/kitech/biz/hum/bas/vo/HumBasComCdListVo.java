package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "교육훈련 코드 리스트 Vo")
public class HumBasComCdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasComCdListVo(){
    }

    @ElDtoField(logicalName = "교육훈련 코드 Vo", physicalName = "basComCdList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo> basComCdList;

    @ElVoField(physicalName = "basComCdList")
    public java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo> getBasComCdList(){
        return basComCdList;
    }

    @ElVoField(physicalName = "basComCdList")
    public void setBasComCdList(java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo> basComCdList){
        this.basComCdList = basComCdList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasComCdListVo [");
        sb.append("basComCdList").append("=").append(basComCdList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; basComCdList != null && i < basComCdList.size() ; i++ ) {
            kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo vo = (kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo)basComCdList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; basComCdList != null && i < basComCdList.size() ; i++ ) {
            kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo vo = (kr.re.kitech.biz.hum.bas.vo.HumBasComCdVo)basComCdList.get(i);
            vo._xStreamDec();	 
        }
    }


}
