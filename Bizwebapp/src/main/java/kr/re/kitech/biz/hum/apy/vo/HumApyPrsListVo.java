package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지도교수(활용책임자) 목록 조회")
public class HumApyPrsListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyPrsListVo(){
    }

    @ElDtoField(logicalName = "지도교수활용책임 변경신청", physicalName = "humApyPrsInfoVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo> humApyPrsInfoVoList;

    @ElDtoField(logicalName = "지도교수활용책임 저장정보", physicalName = "saveVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyPrsSaveVo saveVo;

    @ElDtoField(logicalName = "지도교수활용책임 변경전", physicalName = "humApyPrsBeforeVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo> humApyPrsBeforeVoList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "humApyPrsInfoVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo> getHumApyPrsInfoVoList(){
        return humApyPrsInfoVoList;
    }

    @ElVoField(physicalName = "humApyPrsInfoVoList")
    public void setHumApyPrsInfoVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo> humApyPrsInfoVoList){
        this.humApyPrsInfoVoList = humApyPrsInfoVoList;
    }

    @ElVoField(physicalName = "saveVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyPrsSaveVo getSaveVo(){
        return saveVo;
    }

    @ElVoField(physicalName = "saveVo")
    public void setSaveVo(kr.re.kitech.biz.hum.apy.vo.HumApyPrsSaveVo saveVo){
        this.saveVo = saveVo;
    }

    @ElVoField(physicalName = "humApyPrsBeforeVoList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo> getHumApyPrsBeforeVoList(){
        return humApyPrsBeforeVoList;
    }

    @ElVoField(physicalName = "humApyPrsBeforeVoList")
    public void setHumApyPrsBeforeVoList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo> humApyPrsBeforeVoList){
        this.humApyPrsBeforeVoList = humApyPrsBeforeVoList;
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
        sb.append("HumApyPrsListVo [");
        sb.append("humApyPrsInfoVoList").append("=").append(humApyPrsInfoVoList).append(",");
        sb.append("saveVo").append("=").append(saveVo).append(",");
        sb.append("humApyPrsBeforeVoList").append("=").append(humApyPrsBeforeVoList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; humApyPrsInfoVoList != null && i < humApyPrsInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo)humApyPrsInfoVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.saveVo != null ) this.saveVo._xStreamEnc();
        for( int i=0 ; humApyPrsBeforeVoList != null && i < humApyPrsBeforeVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo)humApyPrsBeforeVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; humApyPrsInfoVoList != null && i < humApyPrsInfoVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyPrsInfoVo)humApyPrsInfoVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.saveVo != null ) this.saveVo._xStreamDec();
        for( int i=0 ; humApyPrsBeforeVoList != null && i < humApyPrsBeforeVoList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyPrsBeforeVo)humApyPrsBeforeVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
