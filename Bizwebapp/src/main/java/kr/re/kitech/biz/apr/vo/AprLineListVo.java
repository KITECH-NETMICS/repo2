package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "개인 결재선 리스트")
public class AprLineListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprLineListVo(){
    }

    @ElDtoField(logicalName = "결재선 상세", physicalName = "aprLineList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprLineVo> aprLineList;

    @ElVoField(physicalName = "aprLineList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprLineVo> getAprLineList(){
        return aprLineList;
    }

    @ElVoField(physicalName = "aprLineList")
    public void setAprLineList(java.util.List<kr.re.kitech.biz.apr.vo.AprLineVo> aprLineList){
        this.aprLineList = aprLineList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprLineListVo [");
        sb.append("aprLineList").append("=").append(aprLineList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprLineList != null && i < aprLineList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprLineVo vo = (kr.re.kitech.biz.apr.vo.AprLineVo)aprLineList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprLineList != null && i < aprLineList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprLineVo vo = (kr.re.kitech.biz.apr.vo.AprLineVo)aprLineList.get(i);
            vo._xStreamDec();	 
        }
    }


}
