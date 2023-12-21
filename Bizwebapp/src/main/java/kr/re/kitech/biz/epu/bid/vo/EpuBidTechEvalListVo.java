package kr.re.kitech.biz.epu.bid.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술평가요청 정보")
public class EpuBidTechEvalListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuBidTechEvalListVo(){
    }

    @ElDtoField(logicalName = "기술평가규격심사List", physicalName = "epuBidTechEvalInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo> epuBidTechEvalInfoVoList;

    @ElDtoField(logicalName = "기술평가규격심사", physicalName = "epuBidTechEvalInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo epuBidTechEvalInfoVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "epuBidTechEvalInfoVoList")
    public java.util.List<kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo> getEpuBidTechEvalInfoVoList(){
        return epuBidTechEvalInfoVoList;
    }

    @ElVoField(physicalName = "epuBidTechEvalInfoVoList")
    public void setEpuBidTechEvalInfoVoList(java.util.List<kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo> epuBidTechEvalInfoVoList){
        this.epuBidTechEvalInfoVoList = epuBidTechEvalInfoVoList;
    }

    @ElVoField(physicalName = "epuBidTechEvalInfoVo")
    public kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo getEpuBidTechEvalInfoVo(){
        return epuBidTechEvalInfoVo;
    }

    @ElVoField(physicalName = "epuBidTechEvalInfoVo")
    public void setEpuBidTechEvalInfoVo(kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo epuBidTechEvalInfoVo){
        this.epuBidTechEvalInfoVo = epuBidTechEvalInfoVo;
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
        sb.append("EpuBidTechEvalListVo [");
        sb.append("epuBidTechEvalInfoVoList").append("=").append(epuBidTechEvalInfoVoList).append(",");
        sb.append("epuBidTechEvalInfoVo").append("=").append(epuBidTechEvalInfoVo).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; epuBidTechEvalInfoVoList != null && i < epuBidTechEvalInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo vo = (kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo)epuBidTechEvalInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.epuBidTechEvalInfoVo != null ) this.epuBidTechEvalInfoVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; epuBidTechEvalInfoVoList != null && i < epuBidTechEvalInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo vo = (kr.re.kitech.biz.epu.bid.vo.EpuBidTechEvalInfoVo)epuBidTechEvalInfoVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.epuBidTechEvalInfoVo != null ) this.epuBidTechEvalInfoVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
