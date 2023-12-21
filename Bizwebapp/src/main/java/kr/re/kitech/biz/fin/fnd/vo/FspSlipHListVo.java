package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspSlipHListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipHListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fspSlipHVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> fspSlipHVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fspSlipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo fspSlipHVo;

    @ElVoField(physicalName = "fspSlipHVoList")
    public java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> getFspSlipHVoList(){
        return fspSlipHVoList;
    }

    @ElVoField(physicalName = "fspSlipHVoList")
    public void setFspSlipHVoList(java.util.List<kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo> fspSlipHVoList){
        this.fspSlipHVoList = fspSlipHVoList;
    }

    @ElVoField(physicalName = "fspSlipHVo")
    public kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo getFspSlipHVo(){
        return fspSlipHVo;
    }

    @ElVoField(physicalName = "fspSlipHVo")
    public void setFspSlipHVo(kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo fspSlipHVo){
        this.fspSlipHVo = fspSlipHVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipHListVo [");
        sb.append("fspSlipHVoList").append("=").append(fspSlipHVoList).append(",");
        sb.append("fspSlipHVo").append("=").append(fspSlipHVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspSlipHVoList != null && i < fspSlipHVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo)fspSlipHVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspSlipHVo != null ) this.fspSlipHVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspSlipHVoList != null && i < fspSlipHVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo vo = (kr.re.kitech.biz.fin.fnd.vo.FspSlipHVo)fspSlipHVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspSlipHVo != null ) this.fspSlipHVo._xStreamDec();
    }


}
