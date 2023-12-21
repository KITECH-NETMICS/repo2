package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPrityEvalReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPrityEvalReqListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPrityEvalReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPrityEvalReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo patPrityEvalReqVo;

    @ElDtoField(logicalName = "ListVo", physicalName = "patPrityEvalReqVoList01", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList01;

    @ElDtoField(logicalName = "ListVo", physicalName = "patPrityEvalReqVoList02", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList02;

    @ElDtoField(logicalName = "ListVo", physicalName = "aprGrid01", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> aprGrid01;

    @ElVoField(physicalName = "patPrityEvalReqVoList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> getPatPrityEvalReqVoList(){
        return patPrityEvalReqVoList;
    }

    @ElVoField(physicalName = "patPrityEvalReqVoList")
    public void setPatPrityEvalReqVoList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList){
        this.patPrityEvalReqVoList = patPrityEvalReqVoList;
    }

    @ElVoField(physicalName = "patPrityEvalReqVo")
    public kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo getPatPrityEvalReqVo(){
        return patPrityEvalReqVo;
    }

    @ElVoField(physicalName = "patPrityEvalReqVo")
    public void setPatPrityEvalReqVo(kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo patPrityEvalReqVo){
        this.patPrityEvalReqVo = patPrityEvalReqVo;
    }

    @ElVoField(physicalName = "patPrityEvalReqVoList01")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> getPatPrityEvalReqVoList01(){
        return patPrityEvalReqVoList01;
    }

    @ElVoField(physicalName = "patPrityEvalReqVoList01")
    public void setPatPrityEvalReqVoList01(java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList01){
        this.patPrityEvalReqVoList01 = patPrityEvalReqVoList01;
    }

    @ElVoField(physicalName = "patPrityEvalReqVoList02")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> getPatPrityEvalReqVoList02(){
        return patPrityEvalReqVoList02;
    }

    @ElVoField(physicalName = "patPrityEvalReqVoList02")
    public void setPatPrityEvalReqVoList02(java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> patPrityEvalReqVoList02){
        this.patPrityEvalReqVoList02 = patPrityEvalReqVoList02;
    }

    @ElVoField(physicalName = "aprGrid01")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> getAprGrid01(){
        return aprGrid01;
    }

    @ElVoField(physicalName = "aprGrid01")
    public void setAprGrid01(java.util.List<kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo> aprGrid01){
        this.aprGrid01 = aprGrid01;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPrityEvalReqListVo [");
        sb.append("patPrityEvalReqVoList").append("=").append(patPrityEvalReqVoList).append(",");
        sb.append("patPrityEvalReqVo").append("=").append(patPrityEvalReqVo).append(",");
        sb.append("patPrityEvalReqVoList01").append("=").append(patPrityEvalReqVoList01).append(",");
        sb.append("patPrityEvalReqVoList02").append("=").append(patPrityEvalReqVoList02).append(",");
        sb.append("aprGrid01").append("=").append(aprGrid01);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPrityEvalReqVoList != null && i < patPrityEvalReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPrityEvalReqVo != null ) this.patPrityEvalReqVo._xStreamEnc();
        for( int i=0 ; patPrityEvalReqVoList01 != null && i < patPrityEvalReqVoList01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList01.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; patPrityEvalReqVoList02 != null && i < patPrityEvalReqVoList02.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList02.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; aprGrid01 != null && i < aprGrid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)aprGrid01.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPrityEvalReqVoList != null && i < patPrityEvalReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPrityEvalReqVo != null ) this.patPrityEvalReqVo._xStreamDec();
        for( int i=0 ; patPrityEvalReqVoList01 != null && i < patPrityEvalReqVoList01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList01.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; patPrityEvalReqVoList02 != null && i < patPrityEvalReqVoList02.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)patPrityEvalReqVoList02.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; aprGrid01 != null && i < aprGrid01.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo vo = (kr.re.kitech.biz.pat.app.vo.PatPrityEvalReqVo)aprGrid01.get(i);
            vo._xStreamDec();	 
        }
    }


}
