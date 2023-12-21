package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기숙사신청ListVo")
public class CgsDormLisReqtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsDormLisReqtVo(){
    }

    @ElDtoField(logicalName = "기숙사신청ListVo", physicalName = "cgsDormReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo> cgsDormReqVoList;

    @ElDtoField(logicalName = "기숙사신청VO", physicalName = "cgsDormReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo cgsDormReqVo;

    @ElDtoField(logicalName = " 기숙사ListVO", physicalName = "cgsDormVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo> cgsDormVoList;

    @ElDtoField(logicalName = " 기숙사VO", physicalName = "cgsDormVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo cgsDormVo;

    @ElVoField(physicalName = "cgsDormReqVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo> getCgsDormReqVoList(){
        return cgsDormReqVoList;
    }

    @ElVoField(physicalName = "cgsDormReqVoList")
    public void setCgsDormReqVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo> cgsDormReqVoList){
        this.cgsDormReqVoList = cgsDormReqVoList;
    }

    @ElVoField(physicalName = "cgsDormReqVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo getCgsDormReqVo(){
        return cgsDormReqVo;
    }

    @ElVoField(physicalName = "cgsDormReqVo")
    public void setCgsDormReqVo(kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo cgsDormReqVo){
        this.cgsDormReqVo = cgsDormReqVo;
    }

    @ElVoField(physicalName = "cgsDormVoList")
    public java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo> getCgsDormVoList(){
        return cgsDormVoList;
    }

    @ElVoField(physicalName = "cgsDormVoList")
    public void setCgsDormVoList(java.util.List<kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo> cgsDormVoList){
        this.cgsDormVoList = cgsDormVoList;
    }

    @ElVoField(physicalName = "cgsDormVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo getCgsDormVo(){
        return cgsDormVo;
    }

    @ElVoField(physicalName = "cgsDormVo")
    public void setCgsDormVo(kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo cgsDormVo){
        this.cgsDormVo = cgsDormVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsDormLisReqtVo [");
        sb.append("cgsDormReqVoList").append("=").append(cgsDormReqVoList).append(",");
        sb.append("cgsDormReqVo").append("=").append(cgsDormReqVo).append(",");
        sb.append("cgsDormVoList").append("=").append(cgsDormVoList).append(",");
        sb.append("cgsDormVo").append("=").append(cgsDormVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; cgsDormReqVoList != null && i < cgsDormReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo)cgsDormReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsDormReqVo != null ) this.cgsDormReqVo._xStreamEnc();
        for( int i=0 ; cgsDormVoList != null && i < cgsDormVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo)cgsDormVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.cgsDormVo != null ) this.cgsDormVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; cgsDormReqVoList != null && i < cgsDormReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsDormReqVo)cgsDormReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsDormReqVo != null ) this.cgsDormReqVo._xStreamDec();
        for( int i=0 ; cgsDormVoList != null && i < cgsDormVoList.size() ; i++ ) {
            kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo vo = (kr.re.kitech.biz.ccs.cgs.vo.CgsDormVo)cgsDormVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.cgsDormVo != null ) this.cgsDormVo._xStreamDec();
    }


}
