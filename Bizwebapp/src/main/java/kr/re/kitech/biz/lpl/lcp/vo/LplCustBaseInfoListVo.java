package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class LplCustBaseInfoListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LplCustBaseInfoListVo(){
    }

    @ElDtoField(logicalName = "기관기본정보목록조회", physicalName = "lplCustBaseInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo> lplCustBaseInfoVoList;

    @ElDtoField(logicalName = "기관기본정보상세조회", physicalName = "lplCustBaseInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo lplCustBaseInfoVo;

    @ElDtoField(logicalName = "기관기본정보등록,수정", physicalName = "lplCustBaseInfoMerVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo lplCustBaseInfoMerVo;

    @ElVoField(physicalName = "lplCustBaseInfoVoList")
    public java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo> getLplCustBaseInfoVoList(){
        return lplCustBaseInfoVoList;
    }

    @ElVoField(physicalName = "lplCustBaseInfoVoList")
    public void setLplCustBaseInfoVoList(java.util.List<kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo> lplCustBaseInfoVoList){
        this.lplCustBaseInfoVoList = lplCustBaseInfoVoList;
    }

    @ElVoField(physicalName = "lplCustBaseInfoVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo getLplCustBaseInfoVo(){
        return lplCustBaseInfoVo;
    }

    @ElVoField(physicalName = "lplCustBaseInfoVo")
    public void setLplCustBaseInfoVo(kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo lplCustBaseInfoVo){
        this.lplCustBaseInfoVo = lplCustBaseInfoVo;
    }

    @ElVoField(physicalName = "lplCustBaseInfoMerVo")
    public kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo getLplCustBaseInfoMerVo(){
        return lplCustBaseInfoMerVo;
    }

    @ElVoField(physicalName = "lplCustBaseInfoMerVo")
    public void setLplCustBaseInfoMerVo(kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoMerVo lplCustBaseInfoMerVo){
        this.lplCustBaseInfoMerVo = lplCustBaseInfoMerVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LplCustBaseInfoListVo [");
        sb.append("lplCustBaseInfoVoList").append("=").append(lplCustBaseInfoVoList).append(",");
        sb.append("lplCustBaseInfoVo").append("=").append(lplCustBaseInfoVo).append(",");
        sb.append("lplCustBaseInfoMerVo").append("=").append(lplCustBaseInfoMerVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; lplCustBaseInfoVoList != null && i < lplCustBaseInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo)lplCustBaseInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.lplCustBaseInfoVo != null ) this.lplCustBaseInfoVo._xStreamEnc();
        if( this.lplCustBaseInfoMerVo != null ) this.lplCustBaseInfoMerVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; lplCustBaseInfoVoList != null && i < lplCustBaseInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo vo = (kr.re.kitech.biz.lpl.lcp.vo.LplCustBaseInfoVo)lplCustBaseInfoVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.lplCustBaseInfoVo != null ) this.lplCustBaseInfoVo._xStreamDec();
        if( this.lplCustBaseInfoMerVo != null ) this.lplCustBaseInfoMerVo._xStreamDec();
    }


}
