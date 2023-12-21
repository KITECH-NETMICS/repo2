package kr.re.kitech.biz.pat.ipd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatIpdRightDivListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatIpdRightDivListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patIpdRightDivVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> patIpdRightDivVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patIpdRightDivVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo patIpdRightDivVo;

    @ElDtoField(logicalName = "Vo", physicalName = "draftInfo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo draftInfo;

    @ElDtoField(logicalName = "Vo", physicalName = "core", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo core;

    @ElDtoField(logicalName = "ListVo", physicalName = "smipAppLst", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> smipAppLst;

    @ElDtoField(logicalName = "ListVo", physicalName = "patIpdList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> patIpdList;

    @ElVoField(physicalName = "patIpdRightDivVoList")
    public java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> getPatIpdRightDivVoList(){
        return patIpdRightDivVoList;
    }

    @ElVoField(physicalName = "patIpdRightDivVoList")
    public void setPatIpdRightDivVoList(java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> patIpdRightDivVoList){
        this.patIpdRightDivVoList = patIpdRightDivVoList;
    }

    @ElVoField(physicalName = "patIpdRightDivVo")
    public kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo getPatIpdRightDivVo(){
        return patIpdRightDivVo;
    }

    @ElVoField(physicalName = "patIpdRightDivVo")
    public void setPatIpdRightDivVo(kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo patIpdRightDivVo){
        this.patIpdRightDivVo = patIpdRightDivVo;
    }

    @ElVoField(physicalName = "draftInfo")
    public kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo getDraftInfo(){
        return draftInfo;
    }

    @ElVoField(physicalName = "draftInfo")
    public void setDraftInfo(kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo draftInfo){
        this.draftInfo = draftInfo;
    }

    @ElVoField(physicalName = "core")
    public kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo getCore(){
        return core;
    }

    @ElVoField(physicalName = "core")
    public void setCore(kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo core){
        this.core = core;
    }

    @ElVoField(physicalName = "smipAppLst")
    public java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> getSmipAppLst(){
        return smipAppLst;
    }

    @ElVoField(physicalName = "smipAppLst")
    public void setSmipAppLst(java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> smipAppLst){
        this.smipAppLst = smipAppLst;
    }

    @ElVoField(physicalName = "patIpdList")
    public java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> getPatIpdList(){
        return patIpdList;
    }

    @ElVoField(physicalName = "patIpdList")
    public void setPatIpdList(java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> patIpdList){
        this.patIpdList = patIpdList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatIpdRightDivListVo [");
        sb.append("patIpdRightDivVoList").append("=").append(patIpdRightDivVoList).append(",");
        sb.append("patIpdRightDivVo").append("=").append(patIpdRightDivVo).append(",");
        sb.append("draftInfo").append("=").append(draftInfo).append(",");
        sb.append("core").append("=").append(core).append(",");
        sb.append("smipAppLst").append("=").append(smipAppLst).append(",");
        sb.append("patIpdList").append("=").append(patIpdList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patIpdRightDivVoList != null && i < patIpdRightDivVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)patIpdRightDivVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patIpdRightDivVo != null ) this.patIpdRightDivVo._xStreamEnc();
        if( this.draftInfo != null ) this.draftInfo._xStreamEnc();
        if( this.core != null ) this.core._xStreamEnc();
        for( int i=0 ; smipAppLst != null && i < smipAppLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)smipAppLst.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patIpdList != null && i < patIpdList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)patIpdList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patIpdRightDivVoList != null && i < patIpdRightDivVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)patIpdRightDivVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patIpdRightDivVo != null ) this.patIpdRightDivVo._xStreamDec();
        if( this.draftInfo != null ) this.draftInfo._xStreamDec();
        if( this.core != null ) this.core._xStreamDec();
        for( int i=0 ; smipAppLst != null && i < smipAppLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)smipAppLst.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patIpdList != null && i < patIpdList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)patIpdList.get(i);
            vo._xStreamDec();	 
        }
    }


}
