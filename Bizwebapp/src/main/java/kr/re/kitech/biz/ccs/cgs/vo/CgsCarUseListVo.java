package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 차량배차VO")
public class CgsCarUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCarUseListVo(){
    }

    @ElDtoField(logicalName = " 차량배차리스트VO", physicalName = "cgsCarUseVoList", type = "", typeKind = "List", fldYn = "Yes", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo> cgsCarUseVoList;

    @ElDtoField(logicalName = "CGS공통", physicalName = "cgsCommVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo cgsCommVo;

    @ElDtoField(logicalName = " 차량배차VO", physicalName = "cgsCarUseVo", type = "", typeKind = "Vo", fldYn = "No", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo cgsCarUseVo;

    @ElVoField(physicalName = "cgsCarUseVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo> getCgsCarUseVoList(){
        return cgsCarUseVoList;
    }

    @ElVoField(physicalName = "cgsCarUseVoList")
    public void setCgsCarUseVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo> cgsCarUseVoList){
        this.cgsCarUseVoList = cgsCarUseVoList;
    }

    @ElVoField(physicalName = "cgsCommVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo getCgsCommVo(){
        return cgsCommVo;
    }

    @ElVoField(physicalName = "cgsCommVo")
    public void setCgsCommVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCommVo cgsCommVo){
        this.cgsCommVo = cgsCommVo;
    }

    @ElVoField(physicalName = "cgsCarUseVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo getCgsCarUseVo(){
        return cgsCarUseVo;
    }

    @ElVoField(physicalName = "cgsCarUseVo")
    public void setCgsCarUseVo(kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo cgsCarUseVo){
        this.cgsCarUseVo = cgsCarUseVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCarUseListVo [");
        sb.append("cgsCarUseVoList").append("=").append(cgsCarUseVoList).append(",");
        sb.append("cgsCommVo").append("=").append(cgsCommVo).append(",");
        sb.append("cgsCarUseVo").append("=").append(cgsCarUseVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cgsCarUseVoList != null && i < cgsCarUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo)cgsCarUseVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsCommVo != null ) this.cgsCommVo._xStreamEnc();
        if( this.cgsCarUseVo != null ) this.cgsCarUseVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cgsCarUseVoList != null && i < cgsCarUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsCarUseVo)cgsCarUseVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsCommVo != null ) this.cgsCommVo._xStreamDec();
        if( this.cgsCarUseVo != null ) this.cgsCarUseVo._xStreamDec();
    }


}
