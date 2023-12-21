package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 카드결의생성 Vo")
public class SptTecCardSlipCrtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecCardSlipCrtVo(){
    }

    @ElDtoField(logicalName = "외부기술지원 카드처리 Vo", physicalName = "slipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo> slipList;

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElVoField(physicalName = "slipList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo> getSlipList(){
        return slipList;
    }

    @ElVoField(physicalName = "slipList")
    public void setSlipList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo> slipList){
        this.slipList = slipList;
    }

    @ElVoField(physicalName = "slipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getSlipHVo(){
        return slipHVo;
    }

    @ElVoField(physicalName = "slipHVo")
    public void setSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo){
        this.slipHVo = slipHVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecCardSlipCrtVo [");
        sb.append("slipList").append("=").append(slipList).append(",");
        sb.append("slipHVo").append("=").append(slipHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo)slipList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecCardSlipVo)slipList.get(i);
            vo._xStreamDec();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
    }


}
