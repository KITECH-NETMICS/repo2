package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappReqInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappReqInfoVo(){
    }

    @ElDtoField(logicalName = "휴가원", physicalName = "cgslappVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgslappVo cgslappVo;

    @ElDtoField(logicalName = "휴가원연차", physicalName = "cgslappAnalVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo cgslappAnalVo;

    @ElDtoField(logicalName = "사후결재 Vo", physicalName = "postAprVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.apr.vo.PostAprVo postAprVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElVoField(physicalName = "cgslappVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgslappVo getCgslappVo(){
        return cgslappVo;
    }

    @ElVoField(physicalName = "cgslappVo")
    public void setCgslappVo(kr.re.kitech.biz.ccs.cgs.vo.CgslappVo cgslappVo){
        this.cgslappVo = cgslappVo;
    }

    @ElVoField(physicalName = "cgslappAnalVo")
    public kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo getCgslappAnalVo(){
        return cgslappAnalVo;
    }

    @ElVoField(physicalName = "cgslappAnalVo")
    public void setCgslappAnalVo(kr.re.kitech.biz.ccs.cgs.vo.CgslappAnalVo cgslappAnalVo){
        this.cgslappAnalVo = cgslappAnalVo;
    }

    @ElVoField(physicalName = "postAprVo")
    public kr.re.kitech.biz.apr.vo.PostAprVo getPostAprVo(){
        return postAprVo;
    }

    @ElVoField(physicalName = "postAprVo")
    public void setPostAprVo(kr.re.kitech.biz.apr.vo.PostAprVo postAprVo){
        this.postAprVo = postAprVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "docList")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
        return docList;
    }

    @ElVoField(physicalName = "docList")
    public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
        this.docList = docList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappReqInfoVo [");
        sb.append("cgslappVo").append("=").append(cgslappVo).append(",");
        sb.append("cgslappAnalVo").append("=").append(cgslappAnalVo).append(",");
        sb.append("postAprVo").append("=").append(postAprVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("docList").append("=").append(docList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.cgslappVo != null ) this.cgslappVo._xStreamEnc();
        if( this.cgslappAnalVo != null ) this.cgslappAnalVo._xStreamEnc();
        if( this.postAprVo != null ) this.postAprVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.cgslappVo != null ) this.cgslappVo._xStreamDec();
        if( this.cgslappAnalVo != null ) this.cgslappAnalVo._xStreamDec();
        if( this.postAprVo != null ) this.postAprVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
    }


}
