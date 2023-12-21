package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class CgsSignUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsSignUseListVo(){
    }

    @ElDtoField(logicalName = "List Vo", physicalName = "cgsSignUseVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo> cgsSignUseVoList;

    @ElDtoField(logicalName = "Single Vo", physicalName = "cgsSignUseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo cgsSignUseVo;

    @ElVoField(physicalName = "cgsSignUseVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo> getCgsSignUseVoList(){
        return cgsSignUseVoList;
    }

    @ElVoField(physicalName = "cgsSignUseVoList")
    public void setCgsSignUseVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo> cgsSignUseVoList){
        this.cgsSignUseVoList = cgsSignUseVoList;
    }

    @ElVoField(physicalName = "cgsSignUseVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo getCgsSignUseVo(){
        return cgsSignUseVo;
    }

    @ElVoField(physicalName = "cgsSignUseVo")
    public void setCgsSignUseVo(kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo cgsSignUseVo){
        this.cgsSignUseVo = cgsSignUseVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsSignUseListVo [");
        sb.append("cgsSignUseVoList").append("=").append(cgsSignUseVoList).append(",");
        sb.append("cgsSignUseVo").append("=").append(cgsSignUseVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cgsSignUseVoList != null && i < cgsSignUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo)cgsSignUseVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsSignUseVo != null ) this.cgsSignUseVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cgsSignUseVoList != null && i < cgsSignUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsSignUseVo)cgsSignUseVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsSignUseVo != null ) this.cgsSignUseVo._xStreamDec();
    }


}
