package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 결의생성 Vo")
public class SptTecSlipInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecSlipInfoVo(){
    }

    @ElDtoField(logicalName = "기술지원결의생성 Vo", physicalName = "slipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo> slipList;

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "slipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo slipHVo;

    @ElDtoField(logicalName = "기술지원 결의생성 조회 Vo", physicalName = "srcVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo srcVo;

    @ElDtoField(logicalName = "미수수탁정산결의Vo", physicalName = "adjstList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> adjstList;

    @ElVoField(physicalName = "slipList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo> getSlipList(){
        return slipList;
    }

    @ElVoField(physicalName = "slipList")
    public void setSlipList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo> slipList){
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

    @ElVoField(physicalName = "srcVo")
    public kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo getSrcVo(){
        return srcVo;
    }

    @ElVoField(physicalName = "srcVo")
    public void setSrcVo(kr.re.kitech.biz.sup.tec.vo.SptTecSlipSrcVo srcVo){
        this.srcVo = srcVo;
    }

    @ElVoField(physicalName = "adjstList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> getAdjstList(){
        return adjstList;
    }

    @ElVoField(physicalName = "adjstList")
    public void setAdjstList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> adjstList){
        this.adjstList = adjstList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecSlipInfoVo [");
        sb.append("slipList").append("=").append(slipList).append(",");
        sb.append("slipHVo").append("=").append(slipHVo).append(",");
        sb.append("srcVo").append("=").append(srcVo).append(",");
        sb.append("adjstList").append("=").append(adjstList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo)slipList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamEnc();
        if( this.srcVo != null ) this.srcVo._xStreamEnc();
        for( int i=0 ; adjstList != null && i < adjstList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo)adjstList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecSlipMntVo)slipList.get(i);
            vo._xStreamDec();	 
        }
        if( this.slipHVo != null ) this.slipHVo._xStreamDec();
        if( this.srcVo != null ) this.srcVo._xStreamDec();
        for( int i=0 ; adjstList != null && i < adjstList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo)adjstList.get(i);
            vo._xStreamDec();	 
        }
    }


}
