package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "프로젝트예산편성정보")
public class ResExcPrjBdgetVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResExcPrjBdgetVo(){
    }

    @ElDtoField(logicalName = "프로젝트예산편성정보", physicalName = "infoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo infoVo;

    @ElDtoField(logicalName = "프로젝트예산편성정보", physicalName = "masterVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo masterVo;

    @ElDtoField(logicalName = "프로젝트예산편성정보", physicalName = "listVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> listVo;

    @ElDtoField(logicalName = "첨부파일리스트", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "프로젝트예산편성정보", physicalName = "detailList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> detailList;

    @ElVoField(physicalName = "infoVo")
    public kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo getInfoVo(){
        return infoVo;
    }

    @ElVoField(physicalName = "infoVo")
    public void setInfoVo(kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo infoVo){
        this.infoVo = infoVo;
    }

    @ElVoField(physicalName = "masterVo")
    public kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo getMasterVo(){
        return masterVo;
    }

    @ElVoField(physicalName = "masterVo")
    public void setMasterVo(kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo masterVo){
        this.masterVo = masterVo;
    }

    @ElVoField(physicalName = "listVo")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> getListVo(){
        return listVo;
    }

    @ElVoField(physicalName = "listVo")
    public void setListVo(java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> listVo){
        this.listVo = listVo;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "detailList")
    public java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> getDetailList(){
        return detailList;
    }

    @ElVoField(physicalName = "detailList")
    public void setDetailList(java.util.List<kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo> detailList){
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResExcPrjBdgetVo [");
        sb.append("infoVo").append("=").append(infoVo).append(",");
        sb.append("masterVo").append("=").append(masterVo).append(",");
        sb.append("listVo").append("=").append(listVo).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("detailList").append("=").append(detailList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.infoVo != null ) this.infoVo._xStreamEnc();
        if( this.masterVo != null ) this.masterVo._xStreamEnc();
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo)listVo.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; detailList != null && i < detailList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo)detailList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.infoVo != null ) this.infoVo._xStreamDec();
        if( this.masterVo != null ) this.masterVo._xStreamDec();
        for( int i=0 ; listVo != null && i < listVo.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo)listVo.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; detailList != null && i < detailList.size() ; i++ ) {
            kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo vo = (kr.re.kitech.biz.res.exc.vo.ResExcPrjBdgetInfoVo)detailList.get(i);
            vo._xStreamDec();	 
        }
    }


}
