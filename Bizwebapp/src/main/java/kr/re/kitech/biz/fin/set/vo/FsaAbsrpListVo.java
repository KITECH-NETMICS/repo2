package kr.re.kitech.biz.fin.set.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "logicName")
public class FsaAbsrpListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FsaAbsrpListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "fsaAbsrpListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo> fsaAbsrpListVo;

    @ElDtoField(logicalName = "SingleVo", physicalName = "fsaAbsrpVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo fsaAbsrpVo;

    @ElDtoField(logicalName = "결의서헤더VO", physicalName = "fspSlipHVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.fin.com.vo.FspSlipHVo fspSlipHVo;

    @ElDtoField(logicalName = "첨부파일", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;

    @ElDtoField(logicalName = "전자증빙", physicalName = "evidFileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList;

    @ElVoField(physicalName = "fsaAbsrpListVo")
    public java.util.List<kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo> getFsaAbsrpListVo(){
        return fsaAbsrpListVo;
    }

    @ElVoField(physicalName = "fsaAbsrpListVo")
    public void setFsaAbsrpListVo(java.util.List<kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo> fsaAbsrpListVo){
        this.fsaAbsrpListVo = fsaAbsrpListVo;
    }

    @ElVoField(physicalName = "fsaAbsrpVo")
    public kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo getFsaAbsrpVo(){
        return fsaAbsrpVo;
    }

    @ElVoField(physicalName = "fsaAbsrpVo")
    public void setFsaAbsrpVo(kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo fsaAbsrpVo){
        this.fsaAbsrpVo = fsaAbsrpVo;
    }

    @ElVoField(physicalName = "fspSlipHVo")
    public kr.re.kitech.biz.fin.com.vo.FspSlipHVo getFspSlipHVo(){
        return fspSlipHVo;
    }

    @ElVoField(physicalName = "fspSlipHVo")
    public void setFspSlipHVo(kr.re.kitech.biz.fin.com.vo.FspSlipHVo fspSlipHVo){
        this.fspSlipHVo = fspSlipHVo;
    }

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "evidFileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getEvidFileList(){
        return evidFileList;
    }

    @ElVoField(physicalName = "evidFileList")
    public void setEvidFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> evidFileList){
        this.evidFileList = evidFileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FsaAbsrpListVo [");
        sb.append("fsaAbsrpListVo").append("=").append(fsaAbsrpListVo).append(",");
        sb.append("fsaAbsrpVo").append("=").append(fsaAbsrpVo).append(",");
        sb.append("fspSlipHVo").append("=").append(fspSlipHVo).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("evidFileList").append("=").append(evidFileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fsaAbsrpListVo != null && i < fsaAbsrpListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo vo = (kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo)fsaAbsrpListVo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.fsaAbsrpVo != null ) this.fsaAbsrpVo._xStreamEnc();
        if( this.fspSlipHVo != null ) this.fspSlipHVo._xStreamEnc();
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fsaAbsrpListVo != null && i < fsaAbsrpListVo.size() ; i++ ) {
            kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo vo = (kr.re.kitech.biz.fin.set.vo.FsaAbsrpVo)fsaAbsrpListVo.get(i);
            vo._xStreamDec();	 
        }
        if( this.fsaAbsrpVo != null ) this.fsaAbsrpVo._xStreamDec();
        if( this.fspSlipHVo != null ) this.fspSlipHVo._xStreamDec();
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; evidFileList != null && i < evidFileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)evidFileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
