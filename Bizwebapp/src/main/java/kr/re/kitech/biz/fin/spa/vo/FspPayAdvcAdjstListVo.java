package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FspPayAdvcAdjstListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspPayAdvcAdjstListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "fspPayAdvcAdjstVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo> fspPayAdvcAdjstVoList;

    @ElDtoField(logicalName = "정산계정내역 폼", physicalName = "fspPayAdvcAdjstVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo fspPayAdvcAdjstVo;

    @ElDtoField(logicalName = "정산계정내역 그리드", physicalName = "fspPayAdvcAdjstGridVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo fspPayAdvcAdjstGridVo;

    @ElDtoField(logicalName = "잔액입금내역 그리드", physicalName = "fcpDepstDetlsVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo fcpDepstDetlsVo;

    @ElDtoField(logicalName = "정산계정추가내역 그리드", physicalName = "fspPayAdvcAdjstAddVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo fspPayAdvcAdjstAddVo;

    @ElDtoField(logicalName = "정산계정추가내역 ComDoc 대체", physicalName = "comVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstComVo comVo;

    @ElDtoField(logicalName = "정산계정내역 그리드 리스트", physicalName = "fspPayAdvcAdjstGridVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo> fspPayAdvcAdjstGridVoList;

    @ElDtoField(logicalName = "잔액입금내역 그리드 리스트", physicalName = "fcpDepstDetlsVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> fcpDepstDetlsVoList;

    @ElDtoField(logicalName = "정산계정추가내역 그리드 리스트", physicalName = "fspPayAdvcAdjstAddVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> fspPayAdvcAdjstAddVoList;

    @ElDtoField(logicalName = "첨부파일1", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "fspPayAdvcAdjstVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo> getFspPayAdvcAdjstVoList(){
        return fspPayAdvcAdjstVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstVoList")
    public void setFspPayAdvcAdjstVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo> fspPayAdvcAdjstVoList){
        this.fspPayAdvcAdjstVoList = fspPayAdvcAdjstVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo getFspPayAdvcAdjstVo(){
        return fspPayAdvcAdjstVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstVo")
    public void setFspPayAdvcAdjstVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo fspPayAdvcAdjstVo){
        this.fspPayAdvcAdjstVo = fspPayAdvcAdjstVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstGridVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo getFspPayAdvcAdjstGridVo(){
        return fspPayAdvcAdjstGridVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstGridVo")
    public void setFspPayAdvcAdjstGridVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo fspPayAdvcAdjstGridVo){
        this.fspPayAdvcAdjstGridVo = fspPayAdvcAdjstGridVo;
    }

    @ElVoField(physicalName = "fcpDepstDetlsVo")
    public kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo getFcpDepstDetlsVo(){
        return fcpDepstDetlsVo;
    }

    @ElVoField(physicalName = "fcpDepstDetlsVo")
    public void setFcpDepstDetlsVo(kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo fcpDepstDetlsVo){
        this.fcpDepstDetlsVo = fcpDepstDetlsVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstAddVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo getFspPayAdvcAdjstAddVo(){
        return fspPayAdvcAdjstAddVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstAddVo")
    public void setFspPayAdvcAdjstAddVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo fspPayAdvcAdjstAddVo){
        this.fspPayAdvcAdjstAddVo = fspPayAdvcAdjstAddVo;
    }

    @ElVoField(physicalName = "comVo")
    public kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstComVo getComVo(){
        return comVo;
    }

    @ElVoField(physicalName = "comVo")
    public void setComVo(kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstComVo comVo){
        this.comVo = comVo;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstGridVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo> getFspPayAdvcAdjstGridVoList(){
        return fspPayAdvcAdjstGridVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstGridVoList")
    public void setFspPayAdvcAdjstGridVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo> fspPayAdvcAdjstGridVoList){
        this.fspPayAdvcAdjstGridVoList = fspPayAdvcAdjstGridVoList;
    }

    @ElVoField(physicalName = "fcpDepstDetlsVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> getFcpDepstDetlsVoList(){
        return fcpDepstDetlsVoList;
    }

    @ElVoField(physicalName = "fcpDepstDetlsVoList")
    public void setFcpDepstDetlsVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo> fcpDepstDetlsVoList){
        this.fcpDepstDetlsVoList = fcpDepstDetlsVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstAddVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> getFspPayAdvcAdjstAddVoList(){
        return fspPayAdvcAdjstAddVoList;
    }

    @ElVoField(physicalName = "fspPayAdvcAdjstAddVoList")
    public void setFspPayAdvcAdjstAddVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo> fspPayAdvcAdjstAddVoList){
        this.fspPayAdvcAdjstAddVoList = fspPayAdvcAdjstAddVoList;
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
        sb.append("FspPayAdvcAdjstListVo [");
        sb.append("fspPayAdvcAdjstVoList").append("=").append(fspPayAdvcAdjstVoList).append(",");
        sb.append("fspPayAdvcAdjstVo").append("=").append(fspPayAdvcAdjstVo).append(",");
        sb.append("fspPayAdvcAdjstGridVo").append("=").append(fspPayAdvcAdjstGridVo).append(",");
        sb.append("fcpDepstDetlsVo").append("=").append(fcpDepstDetlsVo).append(",");
        sb.append("fspPayAdvcAdjstAddVo").append("=").append(fspPayAdvcAdjstAddVo).append(",");
        sb.append("comVo").append("=").append(comVo).append(",");
        sb.append("fspPayAdvcAdjstGridVoList").append("=").append(fspPayAdvcAdjstGridVoList).append(",");
        sb.append("fcpDepstDetlsVoList").append("=").append(fcpDepstDetlsVoList).append(",");
        sb.append("fspPayAdvcAdjstAddVoList").append("=").append(fspPayAdvcAdjstAddVoList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fspPayAdvcAdjstVoList != null && i < fspPayAdvcAdjstVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo)fspPayAdvcAdjstVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspPayAdvcAdjstVo != null ) this.fspPayAdvcAdjstVo._xStreamEnc();
        if( this.fspPayAdvcAdjstGridVo != null ) this.fspPayAdvcAdjstGridVo._xStreamEnc();
        if( this.fcpDepstDetlsVo != null ) this.fcpDepstDetlsVo._xStreamEnc();
        if( this.fspPayAdvcAdjstAddVo != null ) this.fspPayAdvcAdjstAddVo._xStreamEnc();
        if( this.comVo != null ) this.comVo._xStreamEnc();
        for( int i=0 ; fspPayAdvcAdjstGridVoList != null && i < fspPayAdvcAdjstGridVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo)fspPayAdvcAdjstGridVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fcpDepstDetlsVoList != null && i < fcpDepstDetlsVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo vo = (kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo)fcpDepstDetlsVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fspPayAdvcAdjstAddVoList != null && i < fspPayAdvcAdjstAddVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo)fspPayAdvcAdjstAddVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fspPayAdvcAdjstVoList != null && i < fspPayAdvcAdjstVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstVo)fspPayAdvcAdjstVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspPayAdvcAdjstVo != null ) this.fspPayAdvcAdjstVo._xStreamDec();
        if( this.fspPayAdvcAdjstGridVo != null ) this.fspPayAdvcAdjstGridVo._xStreamDec();
        if( this.fcpDepstDetlsVo != null ) this.fcpDepstDetlsVo._xStreamDec();
        if( this.fspPayAdvcAdjstAddVo != null ) this.fspPayAdvcAdjstAddVo._xStreamDec();
        if( this.comVo != null ) this.comVo._xStreamDec();
        for( int i=0 ; fspPayAdvcAdjstGridVoList != null && i < fspPayAdvcAdjstGridVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstGridVo)fspPayAdvcAdjstGridVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fcpDepstDetlsVoList != null && i < fcpDepstDetlsVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo vo = (kr.re.kitech.biz.fin.spa.vo.FcpDepstDetlsVo)fcpDepstDetlsVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fspPayAdvcAdjstAddVoList != null && i < fspPayAdvcAdjstAddVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo vo = (kr.re.kitech.biz.fin.spa.vo.FspPayAdvcAdjstAddVo)fspPayAdvcAdjstAddVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
