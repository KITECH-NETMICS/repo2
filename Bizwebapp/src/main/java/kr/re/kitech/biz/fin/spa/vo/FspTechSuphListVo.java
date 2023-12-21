package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspTechSuphListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSuphListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fspTechSuphVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> fspTechSuphVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fspTechSuphVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo fspTechSuphVo;

    @ElVoField(physicalName = "fspTechSuphVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> getFspTechSuphVoList(){
        return fspTechSuphVoList;
    }

    @ElVoField(physicalName = "fspTechSuphVoList")
    public void setFspTechSuphVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> fspTechSuphVoList){
        this.fspTechSuphVoList = fspTechSuphVoList;
    }

    @ElVoField(physicalName = "fspTechSuphVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo getFspTechSuphVo(){
        return fspTechSuphVo;
    }

    @ElVoField(physicalName = "fspTechSuphVo")
    public void setFspTechSuphVo(kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo fspTechSuphVo){
        this.fspTechSuphVo = fspTechSuphVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSuphListVo [");
        sb.append("fspTechSuphVoList").append("=").append(fspTechSuphVoList).append(",");
        sb.append("fspTechSuphVo").append("=").append(fspTechSuphVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspTechSuphVoList != null && i < fspTechSuphVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo)fspTechSuphVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspTechSuphVo != null ) this.fspTechSuphVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspTechSuphVoList != null && i < fspTechSuphVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo)fspTechSuphVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspTechSuphVo != null ) this.fspTechSuphVo._xStreamDec();
    }


}
