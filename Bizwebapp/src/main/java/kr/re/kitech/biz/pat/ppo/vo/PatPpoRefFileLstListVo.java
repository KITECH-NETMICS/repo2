package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class PatPpoRefFileLstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPpoRefFileLstListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "patPpoRefFileLstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> patPpoRefFileLstVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "patPpoRefFileLstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo patPpoRefFileLstVo;

    @ElDtoField(logicalName = "Vo", physicalName = "bibliography", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo bibliography;

    @ElDtoField(logicalName = "ListVo", physicalName = "refList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> refList;

    @ElDtoField(logicalName = "ListVo", physicalName = "krRefList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> krRefList;

    @ElVoField(physicalName = "patPpoRefFileLstVoList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> getPatPpoRefFileLstVoList(){
        return patPpoRefFileLstVoList;
    }

    @ElVoField(physicalName = "patPpoRefFileLstVoList")
    public void setPatPpoRefFileLstVoList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> patPpoRefFileLstVoList){
        this.patPpoRefFileLstVoList = patPpoRefFileLstVoList;
    }

    @ElVoField(physicalName = "patPpoRefFileLstVo")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo getPatPpoRefFileLstVo(){
        return patPpoRefFileLstVo;
    }

    @ElVoField(physicalName = "patPpoRefFileLstVo")
    public void setPatPpoRefFileLstVo(kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo patPpoRefFileLstVo){
        this.patPpoRefFileLstVo = patPpoRefFileLstVo;
    }

    @ElVoField(physicalName = "bibliography")
    public kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo getBibliography(){
        return bibliography;
    }

    @ElVoField(physicalName = "bibliography")
    public void setBibliography(kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo bibliography){
        this.bibliography = bibliography;
    }

    @ElVoField(physicalName = "refList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> getRefList(){
        return refList;
    }

    @ElVoField(physicalName = "refList")
    public void setRefList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> refList){
        this.refList = refList;
    }

    @ElVoField(physicalName = "krRefList")
    public java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> getKrRefList(){
        return krRefList;
    }

    @ElVoField(physicalName = "krRefList")
    public void setKrRefList(java.util.List<kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo> krRefList){
        this.krRefList = krRefList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPpoRefFileLstListVo [");
        sb.append("patPpoRefFileLstVoList").append("=").append(patPpoRefFileLstVoList).append(",");
        sb.append("patPpoRefFileLstVo").append("=").append(patPpoRefFileLstVo).append(",");
        sb.append("bibliography").append("=").append(bibliography).append(",");
        sb.append("refList").append("=").append(refList).append(",");
        sb.append("krRefList").append("=").append(krRefList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; patPpoRefFileLstVoList != null && i < patPpoRefFileLstVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)patPpoRefFileLstVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.patPpoRefFileLstVo != null ) this.patPpoRefFileLstVo._xStreamEnc();
        if( this.bibliography != null ) this.bibliography._xStreamEnc();
        for( int i=0 ; refList != null && i < refList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)refList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; krRefList != null && i < krRefList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)krRefList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; patPpoRefFileLstVoList != null && i < patPpoRefFileLstVoList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)patPpoRefFileLstVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.patPpoRefFileLstVo != null ) this.patPpoRefFileLstVo._xStreamDec();
        if( this.bibliography != null ) this.bibliography._xStreamDec();
        for( int i=0 ; refList != null && i < refList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)refList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; krRefList != null && i < krRefList.size() ; i++ ) {
            kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo vo = (kr.re.kitech.biz.pat.ppo.vo.PatPpoRefFileLstVo)krRefList.get(i);
            vo._xStreamDec();	 
        }
    }


}
