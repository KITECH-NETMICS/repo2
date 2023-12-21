package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산/수량 인수인계 리스트 VO")
public class AssAppChaReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssAppChaReqListVo(){
    }

    @ElDtoField(logicalName = "인수인계 상세", physicalName = "assAppChaReqDetailVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo assAppChaReqDetailVo;

    @ElDtoField(logicalName = "인수인계 상세 리스트", physicalName = "assAppChaReqDetailVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo> assAppChaReqDetailVoList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "assAppChaReqDetailVo")
    public kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo getAssAppChaReqDetailVo(){
        return assAppChaReqDetailVo;
    }

    @ElVoField(physicalName = "assAppChaReqDetailVo")
    public void setAssAppChaReqDetailVo(kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo assAppChaReqDetailVo){
        this.assAppChaReqDetailVo = assAppChaReqDetailVo;
    }

    @ElVoField(physicalName = "assAppChaReqDetailVoList")
    public java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo> getAssAppChaReqDetailVoList(){
        return assAppChaReqDetailVoList;
    }

    @ElVoField(physicalName = "assAppChaReqDetailVoList")
    public void setAssAppChaReqDetailVoList(java.util.List<kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo> assAppChaReqDetailVoList){
        this.assAppChaReqDetailVoList = assAppChaReqDetailVoList;
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
        sb.append("AssAppChaReqListVo [");
        sb.append("assAppChaReqDetailVo").append("=").append(assAppChaReqDetailVo).append(",");
        sb.append("assAppChaReqDetailVoList").append("=").append(assAppChaReqDetailVoList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.assAppChaReqDetailVo != null ) this.assAppChaReqDetailVo._xStreamEnc();
        for( int i=0 ; assAppChaReqDetailVoList != null && i < assAppChaReqDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo vo = (kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo)assAppChaReqDetailVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.assAppChaReqDetailVo != null ) this.assAppChaReqDetailVo._xStreamDec();
        for( int i=0 ; assAppChaReqDetailVoList != null && i < assAppChaReqDetailVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo vo = (kr.re.kitech.biz.ass.app.vo.AssAppChaReqDetailVo)assAppChaReqDetailVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
