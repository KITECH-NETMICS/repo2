package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class ResInpMastListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResInpMastListVo(){
    }

    @ElDtoField(logicalName = "과제정보", physicalName = "resInpMastVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.agr.vo.ResInpMastVo resInpMastVo;

    @ElDtoField(logicalName = "기준정보", physicalName = "resInpMastStandardVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo resInpMastStandardVo;

    @ElDtoField(logicalName = "과제현황", physicalName = "resInpMastStatusVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo resInpMastStatusVo;

    @ElDtoField(logicalName = "기준정보리스트", physicalName = "resInpMastStandardVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo> resInpMastStandardVoList;

    @ElDtoField(logicalName = "과제현황리스트", physicalName = "resInpMastStatusVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo> resInpMastStatusVoList;

    @ElDtoField(logicalName = "과제 개발목표 내역", physicalName = "resInpTgctVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.agr.vo.ResInpTgctVo resInpTgctVo;

    @ElDtoField(logicalName = "참여연구원리스트", physicalName = "resInpPareVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPareVo> resInpPareVoList;

    @ElDtoField(logicalName = "참여업체리스트", physicalName = "resInpPacoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoVo> resInpPacoVoList;

    @ElDtoField(logicalName = "참여업체직원리스트", physicalName = "resInpPacoEmpVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo> resInpPacoEmpVoList;

    @ElDtoField(logicalName = "연구기자재리스트", physicalName = "resInpMatePrjVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo> resInpMatePrjVoList;

    @ElDtoField(logicalName = "개발성과", physicalName = "resAppOtgtVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo> resAppOtgtVoList;

    @ElVoField(physicalName = "resInpMastVo")
    public kr.re.kitech.biz.res.agr.vo.ResInpMastVo getResInpMastVo(){
        return resInpMastVo;
    }

    @ElVoField(physicalName = "resInpMastVo")
    public void setResInpMastVo(kr.re.kitech.biz.res.agr.vo.ResInpMastVo resInpMastVo){
        this.resInpMastVo = resInpMastVo;
    }

    @ElVoField(physicalName = "resInpMastStandardVo")
    public kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo getResInpMastStandardVo(){
        return resInpMastStandardVo;
    }

    @ElVoField(physicalName = "resInpMastStandardVo")
    public void setResInpMastStandardVo(kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo resInpMastStandardVo){
        this.resInpMastStandardVo = resInpMastStandardVo;
    }

    @ElVoField(physicalName = "resInpMastStatusVo")
    public kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo getResInpMastStatusVo(){
        return resInpMastStatusVo;
    }

    @ElVoField(physicalName = "resInpMastStatusVo")
    public void setResInpMastStatusVo(kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo resInpMastStatusVo){
        this.resInpMastStatusVo = resInpMastStatusVo;
    }

    @ElVoField(physicalName = "resInpMastStandardVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo> getResInpMastStandardVoList(){
        return resInpMastStandardVoList;
    }

    @ElVoField(physicalName = "resInpMastStandardVoList")
    public void setResInpMastStandardVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo> resInpMastStandardVoList){
        this.resInpMastStandardVoList = resInpMastStandardVoList;
    }

    @ElVoField(physicalName = "resInpMastStatusVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo> getResInpMastStatusVoList(){
        return resInpMastStatusVoList;
    }

    @ElVoField(physicalName = "resInpMastStatusVoList")
    public void setResInpMastStatusVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo> resInpMastStatusVoList){
        this.resInpMastStatusVoList = resInpMastStatusVoList;
    }

    @ElVoField(physicalName = "resInpTgctVo")
    public kr.re.kitech.biz.res.agr.vo.ResInpTgctVo getResInpTgctVo(){
        return resInpTgctVo;
    }

    @ElVoField(physicalName = "resInpTgctVo")
    public void setResInpTgctVo(kr.re.kitech.biz.res.agr.vo.ResInpTgctVo resInpTgctVo){
        this.resInpTgctVo = resInpTgctVo;
    }

    @ElVoField(physicalName = "resInpPareVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPareVo> getResInpPareVoList(){
        return resInpPareVoList;
    }

    @ElVoField(physicalName = "resInpPareVoList")
    public void setResInpPareVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPareVo> resInpPareVoList){
        this.resInpPareVoList = resInpPareVoList;
    }

    @ElVoField(physicalName = "resInpPacoVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoVo> getResInpPacoVoList(){
        return resInpPacoVoList;
    }

    @ElVoField(physicalName = "resInpPacoVoList")
    public void setResInpPacoVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoVo> resInpPacoVoList){
        this.resInpPacoVoList = resInpPacoVoList;
    }

    @ElVoField(physicalName = "resInpPacoEmpVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo> getResInpPacoEmpVoList(){
        return resInpPacoEmpVoList;
    }

    @ElVoField(physicalName = "resInpPacoEmpVoList")
    public void setResInpPacoEmpVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo> resInpPacoEmpVoList){
        this.resInpPacoEmpVoList = resInpPacoEmpVoList;
    }

    @ElVoField(physicalName = "resInpMatePrjVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo> getResInpMatePrjVoList(){
        return resInpMatePrjVoList;
    }

    @ElVoField(physicalName = "resInpMatePrjVoList")
    public void setResInpMatePrjVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo> resInpMatePrjVoList){
        this.resInpMatePrjVoList = resInpMatePrjVoList;
    }

    @ElVoField(physicalName = "resAppOtgtVoList")
    public java.util.List<kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo> getResAppOtgtVoList(){
        return resAppOtgtVoList;
    }

    @ElVoField(physicalName = "resAppOtgtVoList")
    public void setResAppOtgtVoList(java.util.List<kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo> resAppOtgtVoList){
        this.resAppOtgtVoList = resAppOtgtVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResInpMastListVo [");
        sb.append("resInpMastVo").append("=").append(resInpMastVo).append(",");
        sb.append("resInpMastStandardVo").append("=").append(resInpMastStandardVo).append(",");
        sb.append("resInpMastStatusVo").append("=").append(resInpMastStatusVo).append(",");
        sb.append("resInpMastStandardVoList").append("=").append(resInpMastStandardVoList).append(",");
        sb.append("resInpMastStatusVoList").append("=").append(resInpMastStatusVoList).append(",");
        sb.append("resInpTgctVo").append("=").append(resInpTgctVo).append(",");
        sb.append("resInpPareVoList").append("=").append(resInpPareVoList).append(",");
        sb.append("resInpPacoVoList").append("=").append(resInpPacoVoList).append(",");
        sb.append("resInpPacoEmpVoList").append("=").append(resInpPacoEmpVoList).append(",");
        sb.append("resInpMatePrjVoList").append("=").append(resInpMatePrjVoList).append(",");
        sb.append("resAppOtgtVoList").append("=").append(resAppOtgtVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.resInpMastVo != null ) this.resInpMastVo._xStreamEnc();
        if( this.resInpMastStandardVo != null ) this.resInpMastStandardVo._xStreamEnc();
        if( this.resInpMastStatusVo != null ) this.resInpMastStatusVo._xStreamEnc();
        for( int i=0 ; resInpMastStandardVoList != null && i < resInpMastStandardVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo)resInpMastStandardVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resInpMastStatusVoList != null && i < resInpMastStatusVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo)resInpMastStatusVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.resInpTgctVo != null ) this.resInpTgctVo._xStreamEnc();
        for( int i=0 ; resInpPareVoList != null && i < resInpPareVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPareVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPareVo)resInpPareVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resInpPacoVoList != null && i < resInpPacoVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPacoVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPacoVo)resInpPacoVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resInpPacoEmpVoList != null && i < resInpPacoEmpVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo)resInpPacoEmpVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resInpMatePrjVoList != null && i < resInpMatePrjVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo)resInpMatePrjVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; resAppOtgtVoList != null && i < resAppOtgtVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo vo = (kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo)resAppOtgtVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.resInpMastVo != null ) this.resInpMastVo._xStreamDec();
        if( this.resInpMastStandardVo != null ) this.resInpMastStandardVo._xStreamDec();
        if( this.resInpMastStatusVo != null ) this.resInpMastStatusVo._xStreamDec();
        for( int i=0 ; resInpMastStandardVoList != null && i < resInpMastStandardVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMastStandardVo)resInpMastStandardVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resInpMastStatusVoList != null && i < resInpMastStatusVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMastStatusVo)resInpMastStatusVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.resInpTgctVo != null ) this.resInpTgctVo._xStreamDec();
        for( int i=0 ; resInpPareVoList != null && i < resInpPareVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPareVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPareVo)resInpPareVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resInpPacoVoList != null && i < resInpPacoVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPacoVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPacoVo)resInpPacoVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resInpPacoEmpVoList != null && i < resInpPacoEmpVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpPacoEmpVo)resInpPacoEmpVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resInpMatePrjVoList != null && i < resInpMatePrjVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo vo = (kr.re.kitech.biz.res.agr.vo.ResInpMatePrjVo)resInpMatePrjVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; resAppOtgtVoList != null && i < resAppOtgtVoList.size() ; i++ ) {
            kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo vo = (kr.re.kitech.biz.res.agr.vo.ResAppOtgtVo)resAppOtgtVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
