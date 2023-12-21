package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "신연구비증빙내역 리스트 Vo")
public class FspItmEvidDetlsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspItmEvidDetlsListVo(){
    }

    @ElDtoField(logicalName = "신연구비증빙내역Vo", physicalName = "evidList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> evidList;

    @ElVoField(physicalName = "evidList")
    public java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> getEvidList(){
        return evidList;
    }

    @ElVoField(physicalName = "evidList")
    public void setEvidList(java.util.List<kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo> evidList){
        this.evidList = evidList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspItmEvidDetlsListVo [");
        sb.append("evidList").append("=").append(evidList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo vo = (kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo)evidList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; evidList != null && i < evidList.size() ; i++ ) {
            kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo vo = (kr.re.kitech.biz.fin.pop.vo.FspItmEvidDetlsVo)evidList.get(i);
            vo._xStreamDec();	 
        }
    }


}
