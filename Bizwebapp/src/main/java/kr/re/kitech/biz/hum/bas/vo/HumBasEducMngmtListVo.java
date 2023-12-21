package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "교육훈련 내역 리스트 Vo")
public class HumBasEducMngmtListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasEducMngmtListVo(){
    }

    @ElDtoField(logicalName = "교육훈련통합관리Vo", physicalName = "basEducMngmtList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo> basEducMngmtList;

    @ElVoField(physicalName = "basEducMngmtList")
    public java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo> getBasEducMngmtList(){
        return basEducMngmtList;
    }

    @ElVoField(physicalName = "basEducMngmtList")
    public void setBasEducMngmtList(java.util.List<kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo> basEducMngmtList){
        this.basEducMngmtList = basEducMngmtList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasEducMngmtListVo [");
        sb.append("basEducMngmtList").append("=").append(basEducMngmtList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; basEducMngmtList != null && i < basEducMngmtList.size() ; i++ ) {
            kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo vo = (kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo)basEducMngmtList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; basEducMngmtList != null && i < basEducMngmtList.size() ; i++ ) {
            kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo vo = (kr.re.kitech.biz.hum.bas.vo.HumBasEducMngmtVo)basEducMngmtList.get(i);
            vo._xStreamDec();	 
        }
    }


}
