package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspEquipUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspEquipUseListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "fspEquipUseVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> fspEquipUseVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "fspEquipUseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo fspEquipUseVo;

    @ElVoField(physicalName = "fspEquipUseVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> getFspEquipUseVoList(){
        return fspEquipUseVoList;
    }

    @ElVoField(physicalName = "fspEquipUseVoList")
    public void setFspEquipUseVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> fspEquipUseVoList){
        this.fspEquipUseVoList = fspEquipUseVoList;
    }

    @ElVoField(physicalName = "fspEquipUseVo")
    public kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo getFspEquipUseVo(){
        return fspEquipUseVo;
    }

    @ElVoField(physicalName = "fspEquipUseVo")
    public void setFspEquipUseVo(kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo fspEquipUseVo){
        this.fspEquipUseVo = fspEquipUseVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspEquipUseListVo [");
        sb.append("fspEquipUseVoList").append("=").append(fspEquipUseVoList).append(",");
        sb.append("fspEquipUseVo").append("=").append(fspEquipUseVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspEquipUseVoList != null && i < fspEquipUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo vo = (kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo)fspEquipUseVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspEquipUseVo != null ) this.fspEquipUseVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspEquipUseVoList != null && i < fspEquipUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo vo = (kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo)fspEquipUseVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspEquipUseVo != null ) this.fspEquipUseVo._xStreamDec();
    }


}
