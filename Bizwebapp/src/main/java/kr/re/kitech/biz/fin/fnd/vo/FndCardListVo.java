package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FndCardListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FndCardListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fndCardVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardVo> fndCardVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fndCard2Vo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.fnd.vo.FndCardVo fndCard2Vo;

    @ElVoField(physicalName = "fndCardVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardVo> getFndCardVoList(){
        return fndCardVoList;
    }

    @ElVoField(physicalName = "fndCardVoList")
    public void setFndCardVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FndCardVo> fndCardVoList){
        this.fndCardVoList = fndCardVoList;
    }

    @ElVoField(physicalName = "fndCard2Vo")
    public kr.re.kitech.biz.fin.fnd.vo.FndCardVo getFndCard2Vo(){
        return fndCard2Vo;
    }

    @ElVoField(physicalName = "fndCard2Vo")
    public void setFndCard2Vo(kr.re.kitech.biz.fin.fnd.vo.FndCardVo fndCard2Vo){
        this.fndCard2Vo = fndCard2Vo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FndCardListVo [");
        sb.append("fndCardVoList").append("=").append(fndCardVoList).append(",");
        sb.append("fndCard2Vo").append("=").append(fndCard2Vo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fndCardVoList != null && i < fndCardVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardVo)fndCardVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fndCard2Vo != null ) this.fndCard2Vo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fndCardVoList != null && i < fndCardVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FndCardVo vo = (kr.re.kitech.biz.fin.fnd.vo.FndCardVo)fndCardVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fndCard2Vo != null ) this.fndCard2Vo._xStreamDec();
    }


}
