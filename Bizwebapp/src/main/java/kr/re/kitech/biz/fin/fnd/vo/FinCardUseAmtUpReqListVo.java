package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FinCardUseAmtUpReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCardUseAmtUpReqListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "finCardUseAmtUpReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo> finCardUseAmtUpReqVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "finCardUseAmtUpReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo finCardUseAmtUpReqVo;

    @ElVoField(physicalName = "finCardUseAmtUpReqVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo> getFinCardUseAmtUpReqVoList(){
        return finCardUseAmtUpReqVoList;
    }

    @ElVoField(physicalName = "finCardUseAmtUpReqVoList")
    public void setFinCardUseAmtUpReqVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo> finCardUseAmtUpReqVoList){
        this.finCardUseAmtUpReqVoList = finCardUseAmtUpReqVoList;
    }

    @ElVoField(physicalName = "finCardUseAmtUpReqVo")
    public kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo getFinCardUseAmtUpReqVo(){
        return finCardUseAmtUpReqVo;
    }

    @ElVoField(physicalName = "finCardUseAmtUpReqVo")
    public void setFinCardUseAmtUpReqVo(kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo finCardUseAmtUpReqVo){
        this.finCardUseAmtUpReqVo = finCardUseAmtUpReqVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinCardUseAmtUpReqListVo [");
        sb.append("finCardUseAmtUpReqVoList").append("=").append(finCardUseAmtUpReqVoList).append(",");
        sb.append("finCardUseAmtUpReqVo").append("=").append(finCardUseAmtUpReqVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; finCardUseAmtUpReqVoList != null && i < finCardUseAmtUpReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo vo = (kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo)finCardUseAmtUpReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.finCardUseAmtUpReqVo != null ) this.finCardUseAmtUpReqVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; finCardUseAmtUpReqVoList != null && i < finCardUseAmtUpReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo vo = (kr.re.kitech.biz.fin.fnd.vo.FinCardUseAmtUpReqVo)finCardUseAmtUpReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.finCardUseAmtUpReqVo != null ) this.finCardUseAmtUpReqVo._xStreamDec();
    }


}
