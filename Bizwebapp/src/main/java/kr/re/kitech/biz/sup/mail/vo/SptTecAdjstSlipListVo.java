package kr.re.kitech.biz.sup.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "미수수탁정산결의 리스트 Vo")
public class SptTecAdjstSlipListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecAdjstSlipListVo(){
    }

    @ElDtoField(logicalName = "미수수탁정산결의Vo", physicalName = "slipList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> slipList;

    @ElVoField(physicalName = "slipList")
    public java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> getSlipList(){
        return slipList;
    }

    @ElVoField(physicalName = "slipList")
    public void setSlipList(java.util.List<kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo> slipList){
        this.slipList = slipList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecAdjstSlipListVo [");
        sb.append("slipList").append("=").append(slipList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo)slipList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; slipList != null && i < slipList.size() ; i++ ) {
            kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo vo = (kr.re.kitech.biz.sup.tec.vo.SptTecAdjstSlipVo)slipList.get(i);
            vo._xStreamDec();	 
        }
    }


}
