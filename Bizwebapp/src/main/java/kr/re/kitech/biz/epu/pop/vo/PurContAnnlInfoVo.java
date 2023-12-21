package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계속연차확인 조회 Vo")
public class PurContAnnlInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurContAnnlInfoVo(){
    }

    @ElDtoField(logicalName = "계속연차확인 Vo", physicalName = "reqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo reqVo;

    @ElDtoField(logicalName = "계속연차 과제정보 Vo", physicalName = "prjList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo> prjList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "reqVo")
    public kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo getReqVo(){
        return reqVo;
    }

    @ElVoField(physicalName = "reqVo")
    public void setReqVo(kr.re.kitech.biz.epu.pop.vo.PurContAnnlReqVo reqVo){
        this.reqVo = reqVo;
    }

    @ElVoField(physicalName = "prjList")
    public java.util.List<kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo> getPrjList(){
        return prjList;
    }

    @ElVoField(physicalName = "prjList")
    public void setPrjList(java.util.List<kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo> prjList){
        this.prjList = prjList;
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
        sb.append("PurContAnnlInfoVo [");
        sb.append("reqVo").append("=").append(reqVo).append(",");
        sb.append("prjList").append("=").append(prjList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.reqVo != null ) this.reqVo._xStreamEnc();
        for( int i=0 ; prjList != null && i < prjList.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo vo = (kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo)prjList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.reqVo != null ) this.reqVo._xStreamDec();
        for( int i=0 ; prjList != null && i < prjList.size() ; i++ ) {
            kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo vo = (kr.re.kitech.biz.epu.pop.vo.PurContAnnlPrjVo)prjList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
