package kr.re.kitech.biz.pat.dft.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatFreeInventionListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatFreeInventionListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patFreeInventionVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> patFreeInventionVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patFreeInventionVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo patFreeInventionVo;

    @ElDtoField(logicalName = "Vo", physicalName = "formVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo formVo;

    @ElDtoField(logicalName = "Vo", physicalName = "tabData", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo tabData;

    @ElDtoField(logicalName = "Vo", physicalName = "core", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo core;

    @ElDtoField(logicalName = "ListVo", physicalName = "vendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> vendList;

    @ElDtoField(logicalName = "ListVo", physicalName = "delvendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delvendList;

    @ElDtoField(logicalName = "ListVo", physicalName = "invntpsnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> invntpsnList;

    @ElDtoField(logicalName = "ListVo", physicalName = "delpersonList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delpersonList;

    @ElDtoField(logicalName = "ListVo", physicalName = "delattachList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delattachList;

    @ElDtoField(logicalName = "ListVo", physicalName = "attachtab2List", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> attachtab2List;

    @ElVoField(physicalName = "patFreeInventionVoList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getPatFreeInventionVoList(){
        return patFreeInventionVoList;
    }

    @ElVoField(physicalName = "patFreeInventionVoList")
    public void setPatFreeInventionVoList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> patFreeInventionVoList){
        this.patFreeInventionVoList = patFreeInventionVoList;
    }

    @ElVoField(physicalName = "patFreeInventionVo")
    public kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo getPatFreeInventionVo(){
        return patFreeInventionVo;
    }

    @ElVoField(physicalName = "patFreeInventionVo")
    public void setPatFreeInventionVo(kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo patFreeInventionVo){
        this.patFreeInventionVo = patFreeInventionVo;
    }

    @ElVoField(physicalName = "formVo")
    public kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo getFormVo(){
        return formVo;
    }

    @ElVoField(physicalName = "formVo")
    public void setFormVo(kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo formVo){
        this.formVo = formVo;
    }

    @ElVoField(physicalName = "tabData")
    public kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo getTabData(){
        return tabData;
    }

    @ElVoField(physicalName = "tabData")
    public void setTabData(kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo tabData){
        this.tabData = tabData;
    }

    @ElVoField(physicalName = "core")
    public kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo getCore(){
        return core;
    }

    @ElVoField(physicalName = "core")
    public void setCore(kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo core){
        this.core = core;
    }

    @ElVoField(physicalName = "vendList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getVendList(){
        return vendList;
    }

    @ElVoField(physicalName = "vendList")
    public void setVendList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> vendList){
        this.vendList = vendList;
    }

    @ElVoField(physicalName = "delvendList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getDelvendList(){
        return delvendList;
    }

    @ElVoField(physicalName = "delvendList")
    public void setDelvendList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delvendList){
        this.delvendList = delvendList;
    }

    @ElVoField(physicalName = "invntpsnList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getInvntpsnList(){
        return invntpsnList;
    }

    @ElVoField(physicalName = "invntpsnList")
    public void setInvntpsnList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> invntpsnList){
        this.invntpsnList = invntpsnList;
    }

    @ElVoField(physicalName = "delpersonList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getDelpersonList(){
        return delpersonList;
    }

    @ElVoField(physicalName = "delpersonList")
    public void setDelpersonList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delpersonList){
        this.delpersonList = delpersonList;
    }

    @ElVoField(physicalName = "delattachList")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getDelattachList(){
        return delattachList;
    }

    @ElVoField(physicalName = "delattachList")
    public void setDelattachList(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> delattachList){
        this.delattachList = delattachList;
    }

    @ElVoField(physicalName = "attachtab2List")
    public java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> getAttachtab2List(){
        return attachtab2List;
    }

    @ElVoField(physicalName = "attachtab2List")
    public void setAttachtab2List(java.util.List<kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo> attachtab2List){
        this.attachtab2List = attachtab2List;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatFreeInventionListVo [");
        sb.append("patFreeInventionVoList").append("=").append(patFreeInventionVoList).append(",");
        sb.append("patFreeInventionVo").append("=").append(patFreeInventionVo).append(",");
        sb.append("formVo").append("=").append(formVo).append(",");
        sb.append("tabData").append("=").append(tabData).append(",");
        sb.append("core").append("=").append(core).append(",");
        sb.append("vendList").append("=").append(vendList).append(",");
        sb.append("delvendList").append("=").append(delvendList).append(",");
        sb.append("invntpsnList").append("=").append(invntpsnList).append(",");
        sb.append("delpersonList").append("=").append(delpersonList).append(",");
        sb.append("delattachList").append("=").append(delattachList).append(",");
        sb.append("attachtab2List").append("=").append(attachtab2List);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patFreeInventionVoList != null && i < patFreeInventionVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)patFreeInventionVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patFreeInventionVo != null ) this.patFreeInventionVo._xStreamEnc();
        if( this.formVo != null ) this.formVo._xStreamEnc();
        if( this.tabData != null ) this.tabData._xStreamEnc();
        if( this.core != null ) this.core._xStreamEnc();
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)vendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; delvendList != null && i < delvendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delvendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; invntpsnList != null && i < invntpsnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)invntpsnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; delpersonList != null && i < delpersonList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delpersonList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; delattachList != null && i < delattachList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delattachList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachtab2List != null && i < attachtab2List.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)attachtab2List.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patFreeInventionVoList != null && i < patFreeInventionVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)patFreeInventionVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patFreeInventionVo != null ) this.patFreeInventionVo._xStreamDec();
        if( this.formVo != null ) this.formVo._xStreamDec();
        if( this.tabData != null ) this.tabData._xStreamDec();
        if( this.core != null ) this.core._xStreamDec();
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)vendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; delvendList != null && i < delvendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delvendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; invntpsnList != null && i < invntpsnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)invntpsnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; delpersonList != null && i < delpersonList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delpersonList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; delattachList != null && i < delattachList.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)delattachList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachtab2List != null && i < attachtab2List.size() ; i++ ) {
            kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo vo = (kr.re.kitech.biz.pat.dft.vo.PatFreeInventionVo)attachtab2List.get(i);
            vo._xStreamDec();	 
        }
    }


}
