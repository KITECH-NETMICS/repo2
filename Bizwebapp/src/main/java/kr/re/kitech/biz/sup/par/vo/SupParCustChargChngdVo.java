package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "파트너기업 정보변경 신청 Base Info Vo")
public class SupParCustChargChngdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SupParCustChargChngdVo(){
    }

    @ElDtoField(logicalName = "파트너기업 기본 정보", physicalName = "supParCustMentrChnghVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo supParCustMentrChnghVo;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElDtoField(logicalName = "변경전 파트너기업 멘토정보", physicalName = "beforeMentoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> beforeMentoList;

    @ElDtoField(logicalName = "변경후 파트너기업 멘토정보", physicalName = "afterMentoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> afterMentoList;

    @ElDtoField(logicalName = "변경전 파트너기업 담당자정보", physicalName = "beforeChargList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> beforeChargList;

    @ElDtoField(logicalName = "변경후 파트너기업 담당자정보", physicalName = "afterChargList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> afterChargList;
    
    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "supParCustMentrChnghVo")
    public kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo getSupParCustMentrChnghVo(){
        return supParCustMentrChnghVo;
    }

    @ElVoField(physicalName = "supParCustMentrChnghVo")
    public void setSupParCustMentrChnghVo(kr.re.kitech.biz.sup.par.vo.SupParCustMentrChnghVo supParCustMentrChnghVo){
        this.supParCustMentrChnghVo = supParCustMentrChnghVo;
    }

    @ElVoField(physicalName = "docList")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
        return docList;
    }

    @ElVoField(physicalName = "docList")
    public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
        this.docList = docList;
    }

    @ElVoField(physicalName = "beforeMentoList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> getBeforeMentoList(){
        return beforeMentoList;
    }

    @ElVoField(physicalName = "beforeMentoList")
    public void setBeforeMentoList(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> beforeMentoList){
        this.beforeMentoList = beforeMentoList;
    }

    @ElVoField(physicalName = "afterMentoList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> getAfterMentoList(){
        return afterMentoList;
    }

    @ElVoField(physicalName = "afterMentoList")
    public void setAfterMentoList(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo> afterMentoList){
        this.afterMentoList = afterMentoList;
    }

    @ElVoField(physicalName = "beforeChargList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> getBeforeChargList(){
        return beforeChargList;
    }

    @ElVoField(physicalName = "beforeChargList")
    public void setBeforeChargList(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> beforeChargList){
        this.beforeChargList = beforeChargList;
    }

    @ElVoField(physicalName = "afterChargList")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> getAfterChargList(){
        return afterChargList;
    }

    @ElVoField(physicalName = "afterChargList")
    public void setAfterChargList(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo> afterChargList){
        this.afterChargList = afterChargList;
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
        sb.append("SupParCustChargChngdVo [");
        sb.append("supParCustMentrChnghVo").append("=").append(supParCustMentrChnghVo).append(",");
        sb.append("docList").append("=").append(docList).append(",");
        sb.append("beforeMentoList").append("=").append(beforeMentoList).append(",");
        sb.append("afterMentoList").append("=").append(afterMentoList).append(",");
        sb.append("beforeChargList").append("=").append(beforeChargList).append(",");
        sb.append("afterChargList").append("=").append(afterChargList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.supParCustMentrChnghVo != null ) this.supParCustMentrChnghVo._xStreamEnc();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; beforeMentoList != null && i < beforeMentoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo)beforeMentoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; afterMentoList != null && i < afterMentoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo)afterMentoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; beforeChargList != null && i < beforeChargList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo)beforeChargList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; afterChargList != null && i < afterChargList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo)afterChargList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.supParCustMentrChnghVo != null ) this.supParCustMentrChnghVo._xStreamDec();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; beforeMentoList != null && i < beforeMentoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo)beforeMentoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; afterMentoList != null && i < afterMentoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustMentoInfoVo)afterMentoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; beforeChargList != null && i < beforeChargList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo)beforeChargList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; afterChargList != null && i < afterChargList.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChngInfoVo)afterChargList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }



}
