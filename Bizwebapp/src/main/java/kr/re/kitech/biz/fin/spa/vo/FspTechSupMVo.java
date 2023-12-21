package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspTechSupMExp")
public class FspTechSupMVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSupMVo(){
    }

    @ElDtoField(logicalName = "내부장비활용 상세", physicalName = "fspTechSupdVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo fspTechSupdVo;

    @ElDtoField(logicalName = "내부장비활용 장비사용실적", physicalName = "fspEquipUseVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo fspEquipUseVo;

    @ElDtoField(logicalName = "내부장비활용 재료 사용 내역", physicalName = "fspTechSupMatrlVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo fspTechSupMatrlVo;

    @ElDtoField(logicalName = "내부장비활용 지원 인력", physicalName = "fspTechSupPsnVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo fspTechSupPsnVo;

    @ElDtoField(logicalName = "내부장비활용 지원 인력리스트", physicalName = "fspTechSupPsnVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> fspTechSupPsnVoList;

    @ElDtoField(logicalName = "내부장비활용 장비사용실적리스트", physicalName = "fspEquipUseVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> fspEquipUseVoList;

    @ElDtoField(logicalName = "내부장비활용 상세리스트", physicalName = "fspTechSupdVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> fspTechSupdVoList;

    @ElDtoField(logicalName = "내부장비활용재료사용내역리스트", physicalName = "fspTechSupMatrlVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> fspTechSupMatrlVoList;

    @ElDtoField(logicalName = "내부장비활용 헤드 리스트", physicalName = "fspTechSuphVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> fspTechSuphVoList;

    @ElDtoField(logicalName = "첨부파일1", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "내부장비활용 헤드", physicalName = "fspTechSuphVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo fspTechSuphVo;

    @ElVoField(physicalName = "fspTechSupdVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo getFspTechSupdVo(){
        return fspTechSupdVo;
    }

    @ElVoField(physicalName = "fspTechSupdVo")
    public void setFspTechSupdVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo fspTechSupdVo){
        this.fspTechSupdVo = fspTechSupdVo;
    }

    @ElVoField(physicalName = "fspEquipUseVo")
    public kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo getFspEquipUseVo(){
        return fspEquipUseVo;
    }

    @ElVoField(physicalName = "fspEquipUseVo")
    public void setFspEquipUseVo(kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo fspEquipUseVo){
        this.fspEquipUseVo = fspEquipUseVo;
    }

    @ElVoField(physicalName = "fspTechSupMatrlVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo getFspTechSupMatrlVo(){
        return fspTechSupMatrlVo;
    }

    @ElVoField(physicalName = "fspTechSupMatrlVo")
    public void setFspTechSupMatrlVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo fspTechSupMatrlVo){
        this.fspTechSupMatrlVo = fspTechSupMatrlVo;
    }

    @ElVoField(physicalName = "fspTechSupPsnVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo getFspTechSupPsnVo(){
        return fspTechSupPsnVo;
    }

    @ElVoField(physicalName = "fspTechSupPsnVo")
    public void setFspTechSupPsnVo(kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo fspTechSupPsnVo){
        this.fspTechSupPsnVo = fspTechSupPsnVo;
    }

    @ElVoField(physicalName = "fspTechSupPsnVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> getFspTechSupPsnVoList(){
        return fspTechSupPsnVoList;
    }

    @ElVoField(physicalName = "fspTechSupPsnVoList")
    public void setFspTechSupPsnVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo> fspTechSupPsnVoList){
        this.fspTechSupPsnVoList = fspTechSupPsnVoList;
    }

    @ElVoField(physicalName = "fspEquipUseVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> getFspEquipUseVoList(){
        return fspEquipUseVoList;
    }

    @ElVoField(physicalName = "fspEquipUseVoList")
    public void setFspEquipUseVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo> fspEquipUseVoList){
        this.fspEquipUseVoList = fspEquipUseVoList;
    }

    @ElVoField(physicalName = "fspTechSupdVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> getFspTechSupdVoList(){
        return fspTechSupdVoList;
    }

    @ElVoField(physicalName = "fspTechSupdVoList")
    public void setFspTechSupdVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo> fspTechSupdVoList){
        this.fspTechSupdVoList = fspTechSupdVoList;
    }

    @ElVoField(physicalName = "fspTechSupMatrlVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> getFspTechSupMatrlVoList(){
        return fspTechSupMatrlVoList;
    }

    @ElVoField(physicalName = "fspTechSupMatrlVoList")
    public void setFspTechSupMatrlVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo> fspTechSupMatrlVoList){
        this.fspTechSupMatrlVoList = fspTechSupMatrlVoList;
    }

    @ElVoField(physicalName = "fspTechSuphVoList")
    public java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> getFspTechSuphVoList(){
        return fspTechSuphVoList;
    }

    @ElVoField(physicalName = "fspTechSuphVoList")
    public void setFspTechSuphVoList(java.util.List<kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo> fspTechSuphVoList){
        this.fspTechSuphVoList = fspTechSuphVoList;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "fspTechSuphVo")
    public kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo getFspTechSuphVo(){
        return fspTechSuphVo;
    }

    @ElVoField(physicalName = "fspTechSuphVo")
    public void setFspTechSuphVo(kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo fspTechSuphVo){
        this.fspTechSuphVo = fspTechSuphVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSupMVo [");
        sb.append("fspTechSupdVo").append("=").append(fspTechSupdVo).append(",");
        sb.append("fspEquipUseVo").append("=").append(fspEquipUseVo).append(",");
        sb.append("fspTechSupMatrlVo").append("=").append(fspTechSupMatrlVo).append(",");
        sb.append("fspTechSupPsnVo").append("=").append(fspTechSupPsnVo).append(",");
        sb.append("fspTechSupPsnVoList").append("=").append(fspTechSupPsnVoList).append(",");
        sb.append("fspEquipUseVoList").append("=").append(fspEquipUseVoList).append(",");
        sb.append("fspTechSupdVoList").append("=").append(fspTechSupdVoList).append(",");
        sb.append("fspTechSupMatrlVoList").append("=").append(fspTechSupMatrlVoList).append(",");
        sb.append("fspTechSuphVoList").append("=").append(fspTechSuphVoList).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("fspTechSuphVo").append("=").append(fspTechSuphVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.fspTechSupdVo != null ) this.fspTechSupdVo._xStreamEnc();
        if( this.fspEquipUseVo != null ) this.fspEquipUseVo._xStreamEnc();
        if( this.fspTechSupMatrlVo != null ) this.fspTechSupMatrlVo._xStreamEnc();
        if( this.fspTechSupPsnVo != null ) this.fspTechSupPsnVo._xStreamEnc();
        for( int i=0 ; fspTechSupPsnVoList != null && i < fspTechSupPsnVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo)fspTechSupPsnVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fspEquipUseVoList != null && i < fspEquipUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo vo = (kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo)fspEquipUseVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fspTechSupdVoList != null && i < fspTechSupdVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo)fspTechSupdVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fspTechSupMatrlVoList != null && i < fspTechSupMatrlVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo)fspTechSupMatrlVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fspTechSuphVoList != null && i < fspTechSuphVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo)fspTechSuphVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fspTechSuphVo != null ) this.fspTechSuphVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        if( this.fspTechSupdVo != null ) this.fspTechSupdVo._xStreamDec();
        if( this.fspEquipUseVo != null ) this.fspEquipUseVo._xStreamDec();
        if( this.fspTechSupMatrlVo != null ) this.fspTechSupMatrlVo._xStreamDec();
        if( this.fspTechSupPsnVo != null ) this.fspTechSupPsnVo._xStreamDec();
        for( int i=0 ; fspTechSupPsnVoList != null && i < fspTechSupPsnVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupPsnVo)fspTechSupPsnVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fspEquipUseVoList != null && i < fspEquipUseVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo vo = (kr.re.kitech.biz.fin.spa.vo.FspEquipUseVo)fspEquipUseVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fspTechSupdVoList != null && i < fspTechSupdVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupdVo)fspTechSupdVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fspTechSupMatrlVoList != null && i < fspTechSupMatrlVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSupMatrlVo)fspTechSupMatrlVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fspTechSuphVoList != null && i < fspTechSuphVoList.size() ; i++ ) {
            kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo vo = (kr.re.kitech.biz.fin.spa.vo.FspTechSuphVo)fspTechSuphVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        if( this.fspTechSuphVo != null ) this.fspTechSuphVo._xStreamDec();
    }


}
