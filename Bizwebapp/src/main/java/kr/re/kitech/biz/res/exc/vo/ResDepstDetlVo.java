package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비입금관리 상세 Vo")
public class ResDepstDetlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResDepstDetlVo(){
    }

    @ElDtoField(logicalName = "연구관리 계정정보 Vo", physicalName = "prjVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.com.vo.ResPrjInfoVo prjVo;

    @ElDtoField(logicalName = "연구비입금예정 Vo", physicalName = "recvList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRecveVo> recvList;

    @ElDtoField(logicalName = "연구비입금상세 Vo", physicalName = "rectlList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRectlVo> rectlList;

    @ElDtoField(logicalName = "연구비청구의뢰Vo", physicalName = "demndVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.exc.vo.ResDemndReqVo demndVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "입금의뢰 Vo", physicalName = "depstList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList;

    @ElDtoField(logicalName = "연구비입금예정 Vo", physicalName = "recVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.exc.vo.ResBgRecveVo recVo;

    @ElVoField(physicalName = "prjVo")
    public kr.re.kitech.biz.res.com.vo.ResPrjInfoVo getPrjVo(){
        return prjVo;
    }

    @ElVoField(physicalName = "prjVo")
    public void setPrjVo(kr.re.kitech.biz.res.com.vo.ResPrjInfoVo prjVo){
        this.prjVo = prjVo;
    }

    @ElVoField(physicalName = "recvList")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRecveVo> getRecvList(){
        return recvList;
    }

    @ElVoField(physicalName = "recvList")
    public void setRecvList(java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRecveVo> recvList){
        this.recvList = recvList;
    }

    @ElVoField(physicalName = "rectlList")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRectlVo> getRectlList(){
        return rectlList;
    }

    @ElVoField(physicalName = "rectlList")
    public void setRectlList(java.util.List<kr.re.kitech.biz.res.exc.vo.ResBgRectlVo> rectlList){
        this.rectlList = rectlList;
    }

    @ElVoField(physicalName = "demndVo")
    public kr.re.kitech.biz.res.exc.vo.ResDemndReqVo getDemndVo(){
        return demndVo;
    }

    @ElVoField(physicalName = "demndVo")
    public void setDemndVo(kr.re.kitech.biz.res.exc.vo.ResDemndReqVo demndVo){
        this.demndVo = demndVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "depstList")
    public java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> getDepstList(){
        return depstList;
    }

    @ElVoField(physicalName = "depstList")
    public void setDepstList(java.util.List<kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo> depstList){
        this.depstList = depstList;
    }

    @ElVoField(physicalName = "recVo")
    public kr.re.kitech.biz.res.exc.vo.ResBgRecveVo getRecVo(){
        return recVo;
    }

    @ElVoField(physicalName = "recVo")
    public void setRecVo(kr.re.kitech.biz.res.exc.vo.ResBgRecveVo recVo){
        this.recVo = recVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResDepstDetlVo [");
        sb.append("prjVo").append("=").append(prjVo).append(",");
        sb.append("recvList").append("=").append(recvList).append(",");
        sb.append("rectlList").append("=").append(rectlList).append(",");
        sb.append("demndVo").append("=").append(demndVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("depstList").append("=").append(depstList).append(",");
        sb.append("recVo").append("=").append(recVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.prjVo != null ) this.prjVo._xStreamEnc();
        for( int i=0 ; recvList != null && i < recvList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResBgRecveVo vo = (kr.re.kitech.biz.res.exc.vo.ResBgRecveVo)recvList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; rectlList != null && i < rectlList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResBgRectlVo vo = (kr.re.kitech.biz.res.exc.vo.ResBgRectlVo)rectlList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.demndVo != null ) this.demndVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; depstList != null && i < depstList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo vo = (kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo)depstList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.recVo != null ) this.recVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.prjVo != null ) this.prjVo._xStreamDec();
        for( int i=0 ; recvList != null && i < recvList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResBgRecveVo vo = (kr.re.kitech.biz.res.exc.vo.ResBgRecveVo)recvList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; rectlList != null && i < rectlList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResBgRectlVo vo = (kr.re.kitech.biz.res.exc.vo.ResBgRectlVo)rectlList.get(i);
            vo._xStreamDec();	 
        }
        if( this.demndVo != null ) this.demndVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; depstList != null && i < depstList.size() ; i++ ) {
            kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo vo = (kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo)depstList.get(i);
            vo._xStreamDec();	 
        }
        if( this.recVo != null ) this.recVo._xStreamDec();
    }


}
