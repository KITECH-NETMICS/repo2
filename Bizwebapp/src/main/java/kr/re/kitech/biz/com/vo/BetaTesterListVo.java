package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "베타테스터")
public class BetaTesterListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BetaTesterListVo(){
    }

    @ElDtoField(logicalName = "베타테스터 List", physicalName = "betaTesterVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.com.vo.BetaTesterVo> betaTesterVoList;

    @ElDtoField(logicalName = "베타테스터", physicalName = "betaTesterVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.com.vo.BetaTesterVo betaTesterVo;

    @ElVoField(physicalName = "betaTesterVoList")
    public java.util.List<kr.re.kitech.biz.com.vo.BetaTesterVo> getBetaTesterVoList(){
        return betaTesterVoList;
    }

    @ElVoField(physicalName = "betaTesterVoList")
    public void setBetaTesterVoList(java.util.List<kr.re.kitech.biz.com.vo.BetaTesterVo> betaTesterVoList){
        this.betaTesterVoList = betaTesterVoList;
    }

    @ElVoField(physicalName = "betaTesterVo")
    public kr.re.kitech.biz.com.vo.BetaTesterVo getBetaTesterVo(){
        return betaTesterVo;
    }

    @ElVoField(physicalName = "betaTesterVo")
    public void setBetaTesterVo(kr.re.kitech.biz.com.vo.BetaTesterVo betaTesterVo){
        this.betaTesterVo = betaTesterVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BetaTesterListVo [");
        sb.append("betaTesterVoList").append("=").append(betaTesterVoList).append(",");
        sb.append("betaTesterVo").append("=").append(betaTesterVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; betaTesterVoList != null && i < betaTesterVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.BetaTesterVo vo = (kr.re.kitech.biz.com.vo.BetaTesterVo)betaTesterVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.betaTesterVo != null ) this.betaTesterVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; betaTesterVoList != null && i < betaTesterVoList.size() ; i++ ) {
            kr.re.kitech.biz.com.vo.BetaTesterVo vo = (kr.re.kitech.biz.com.vo.BetaTesterVo)betaTesterVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.betaTesterVo != null ) this.betaTesterVo._xStreamDec();
    }


}
