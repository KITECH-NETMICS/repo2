package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "학생연구원활용예정확인서")
public class HumApyStuListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyStuListVo(){
    }

    @ElDtoField(logicalName = "학생연구원활용예정확인서List", physicalName = "humApyStuVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> humApyStuVoList;

    @ElDtoField(logicalName = "학생연구원활용예정확인서", physicalName = "humApyStuVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo humApyStuVo;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "연수책임자 과제현황List", physicalName = "rspnsPrjVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> rspnsPrjVoList;

    @ElDtoField(logicalName = "연수책임자 지도 학생연구원 현황List", physicalName = "rspnsStuVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> rspnsStuVoList;

    @ElVoField(physicalName = "humApyStuVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> getHumApyStuVoList(){
        return humApyStuVoList;
    }

    @ElVoField(physicalName = "humApyStuVoList")
    public void setHumApyStuVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> humApyStuVoList){
        this.humApyStuVoList = humApyStuVoList;
    }

    @ElVoField(physicalName = "humApyStuVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo getHumApyStuVo(){
        return humApyStuVo;
    }

    @ElVoField(physicalName = "humApyStuVo")
    public void setHumApyStuVo(kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo humApyStuVo){
        this.humApyStuVo = humApyStuVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "rspnsPrjVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> getRspnsPrjVoList(){
        return rspnsPrjVoList;
    }

    @ElVoField(physicalName = "rspnsPrjVoList")
    public void setRspnsPrjVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> rspnsPrjVoList){
        this.rspnsPrjVoList = rspnsPrjVoList;
    }

    @ElVoField(physicalName = "rspnsStuVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> getRspnsStuVoList(){
        return rspnsStuVoList;
    }

    @ElVoField(physicalName = "rspnsStuVoList")
    public void setRspnsStuVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo> rspnsStuVoList){
        this.rspnsStuVoList = rspnsStuVoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyStuListVo [");
        sb.append("humApyStuVoList").append("=").append(humApyStuVoList).append(",");
        sb.append("humApyStuVo").append("=").append(humApyStuVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("rspnsPrjVoList").append("=").append(rspnsPrjVoList).append(",");
        sb.append("rspnsStuVoList").append("=").append(rspnsStuVoList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyStuVoList != null && i < humApyStuVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)humApyStuVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.humApyStuVo != null ) this.humApyStuVo._xStreamEnc();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; rspnsPrjVoList != null && i < rspnsPrjVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)rspnsPrjVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; rspnsStuVoList != null && i < rspnsStuVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)rspnsStuVoList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyStuVoList != null && i < humApyStuVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)humApyStuVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.humApyStuVo != null ) this.humApyStuVo._xStreamDec();
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; rspnsPrjVoList != null && i < rspnsPrjVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)rspnsPrjVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; rspnsStuVoList != null && i < rspnsStuVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyStuInfoVo)rspnsStuVoList.get(i);
            vo._xStreamDec();	 
        }
    }


}
