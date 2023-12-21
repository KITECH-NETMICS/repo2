package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResOutCtrbtReqIntegVo")
public class ResOutCtrbtReqIntegVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResOutCtrbtReqIntegVo(){
    }

    @ElDtoField(logicalName = "ResOutCtrbtReqVo", physicalName = "resOutCtrbtReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo resOutCtrbtReqVo;

    @ElDtoField(logicalName = "ResOutCtrbtReqListVo", physicalName = "resOutCtrbtReqListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo> resOutCtrbtReqListVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "resOutCtrbtReqVo")
    public kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo getResOutCtrbtReqVo(){
        return resOutCtrbtReqVo;
    }

    @ElVoField(physicalName = "resOutCtrbtReqVo")
    public void setResOutCtrbtReqVo(kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqVo resOutCtrbtReqVo){
        this.resOutCtrbtReqVo = resOutCtrbtReqVo;
    }

    @ElVoField(physicalName = "resOutCtrbtReqListVo")
    public java.util.List<kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo> getResOutCtrbtReqListVo(){
        return resOutCtrbtReqListVo;
    }

    @ElVoField(physicalName = "resOutCtrbtReqListVo")
    public void setResOutCtrbtReqListVo(java.util.List<kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo> resOutCtrbtReqListVo){
        this.resOutCtrbtReqListVo = resOutCtrbtReqListVo;
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
        sb.append("ResOutCtrbtReqIntegVo [");
        sb.append("resOutCtrbtReqVo").append("=").append(resOutCtrbtReqVo).append(",");
        sb.append("resOutCtrbtReqListVo").append("=").append(resOutCtrbtReqListVo).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.resOutCtrbtReqVo != null ) this.resOutCtrbtReqVo._xStreamEnc();
        for( int i=0 ; resOutCtrbtReqListVo != null && i < resOutCtrbtReqListVo.size() ; i++ ) {
            kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo vo = (kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo)resOutCtrbtReqListVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.resOutCtrbtReqVo != null ) this.resOutCtrbtReqVo._xStreamDec();
        for( int i=0 ; resOutCtrbtReqListVo != null && i < resOutCtrbtReqListVo.size() ; i++ ) {
            kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo vo = (kr.re.kitech.biz.res.out.vo.ResOutCtrbtReqListVo)resOutCtrbtReqListVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
