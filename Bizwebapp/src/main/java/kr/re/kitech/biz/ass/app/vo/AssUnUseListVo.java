package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산불용신청 리스트 VO")
public class AssUnUseListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssUnUseListVo(){
    }

    @ElDtoField(logicalName = "불용신청상세조회 VO", physicalName = "asetList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.app.vo.AssUnUseVo> asetList;

    @ElDtoField(logicalName = "List Vo", physicalName = "assMastrBVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.app.vo.AssMastrBVo> assMastrBVoList;

    @ElDtoField(logicalName = "AssUnUseMast Vo", physicalName = "assUnUseMastVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ass.app.vo.AssUnUseMastVo assUnUseMastVo;
    
     @ElDtoField(logicalName = "불용신청 상세보기 Vo", physicalName = "assUnUseDetailVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo assUnUseDetailVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "asetList")
    public java.util.List<kr.re.kitech.biz.ass.app.vo.AssUnUseVo> getAsetList(){
        return asetList;
    }

    @ElVoField(physicalName = "asetList")
    public void setAsetList(java.util.List<kr.re.kitech.biz.ass.app.vo.AssUnUseVo> asetList){
        this.asetList = asetList;
    }

    @ElVoField(physicalName = "assMastrBVoList")
    public java.util.List<kr.re.kitech.biz.ass.app.vo.AssMastrBVo> getAssMastrBVoList(){
        return assMastrBVoList;
    }

    @ElVoField(physicalName = "assMastrBVoList")
    public void setAssMastrBVoList(java.util.List<kr.re.kitech.biz.ass.app.vo.AssMastrBVo> assMastrBVoList){
        this.assMastrBVoList = assMastrBVoList;
    }

    @ElVoField(physicalName = "assUnUseMastVo")
    public kr.re.kitech.biz.ass.app.vo.AssUnUseMastVo getAssUnUseMastVo(){
        return assUnUseMastVo;
    }

    @ElVoField(physicalName = "assUnUseMastVo")
    public void setAssUnUseMastVo(kr.re.kitech.biz.ass.app.vo.AssUnUseMastVo assUnUseMastVo){
        this.assUnUseMastVo = assUnUseMastVo;
    }
    
     @ElVoField(physicalName = "assUnUseDetailVo")
    public kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo getAssUnUseDetailVo(){
        return assUnUseDetailVo;
    }

    @ElVoField(physicalName = "assUnUseDetailVo")
    public void setAssUnUseDetailVo(kr.re.kitech.biz.ass.app.vo.AssUnUseDetailVo assUnUseDetailVo){
        this.assUnUseDetailVo = assUnUseDetailVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssUnUseListVo [");
        sb.append("asetList").append("=").append(asetList).append(",");
        sb.append("assMastrBVoList").append("=").append(assMastrBVoList).append(",");
        sb.append("assUnUseMastVo").append("=").append(assUnUseMastVo).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; asetList != null && i < asetList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssUnUseVo vo = (kr.re.kitech.biz.ass.app.vo.AssUnUseVo)asetList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; assMastrBVoList != null && i < assMastrBVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssMastrBVo vo = (kr.re.kitech.biz.ass.app.vo.AssMastrBVo)assMastrBVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.assUnUseMastVo != null ) this.assUnUseMastVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; asetList != null && i < asetList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssUnUseVo vo = (kr.re.kitech.biz.ass.app.vo.AssUnUseVo)asetList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; assMastrBVoList != null && i < assMastrBVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssMastrBVo vo = (kr.re.kitech.biz.ass.app.vo.AssMastrBVo)assMastrBVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.assUnUseMastVo != null ) this.assUnUseMastVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
