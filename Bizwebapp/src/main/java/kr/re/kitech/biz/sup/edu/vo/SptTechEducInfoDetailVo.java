package kr.re.kitech.biz.sup.edu.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTechEducInfoDetailExp")
public class SptTechEducInfoDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTechEducInfoDetailVo(){
    }

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList_B", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;

    @ElDtoField(logicalName = "기여자목록 Vo", physicalName = "SptTechEducContributeVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo> SptTechEducContributeVoList;

    @ElDtoField(logicalName = "소요예산목록 Vo", physicalName = "SptTechEducReqdBugtVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo> SptTechEducReqdBugtVoList;

    @ElDtoField(logicalName = "주요프로그램목록 Vo", physicalName = "SptTechEducSchedVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo> SptTechEducSchedVoList;

    @ElDtoField(logicalName = "교육참여자목록 Vo", physicalName = "SptTechEducAttnceVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo> SptTechEducAttnceVoList;

    @ElDtoField(logicalName = "세미나 Vo", physicalName = "SptTechEducInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo SptTechEducInfoVo;

    @ElVoField(physicalName = "fileList_B")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_B(){
        return fileList_B;
    }

    @ElVoField(physicalName = "fileList_B")
    public void setFileList_B(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B){
        this.fileList_B = fileList_B;
    }

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "SptTechEducContributeVoList")
    public java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo> getSptTechEducContributeVoList(){
        return SptTechEducContributeVoList;
    }

    @ElVoField(physicalName = "SptTechEducContributeVoList")
    public void setSptTechEducContributeVoList(java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo> SptTechEducContributeVoList){
        this.SptTechEducContributeVoList = SptTechEducContributeVoList;
    }

    @ElVoField(physicalName = "SptTechEducReqdBugtVoList")
    public java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo> getSptTechEducReqdBugtVoList(){
        return SptTechEducReqdBugtVoList;
    }

    @ElVoField(physicalName = "SptTechEducReqdBugtVoList")
    public void setSptTechEducReqdBugtVoList(java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo> SptTechEducReqdBugtVoList){
        this.SptTechEducReqdBugtVoList = SptTechEducReqdBugtVoList;
    }

    @ElVoField(physicalName = "SptTechEducSchedVoList")
    public java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo> getSptTechEducSchedVoList(){
        return SptTechEducSchedVoList;
    }

    @ElVoField(physicalName = "SptTechEducSchedVoList")
    public void setSptTechEducSchedVoList(java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo> SptTechEducSchedVoList){
        this.SptTechEducSchedVoList = SptTechEducSchedVoList;
    }

    @ElVoField(physicalName = "SptTechEducAttnceVoList")
    public java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo> getSptTechEducAttnceVoList(){
        return SptTechEducAttnceVoList;
    }

    @ElVoField(physicalName = "SptTechEducAttnceVoList")
    public void setSptTechEducAttnceVoList(java.util.List<kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo> SptTechEducAttnceVoList){
        this.SptTechEducAttnceVoList = SptTechEducAttnceVoList;
    }

    @ElVoField(physicalName = "SptTechEducInfoVo")
    public kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo getSptTechEducInfoVo(){
        return SptTechEducInfoVo;
    }

    @ElVoField(physicalName = "SptTechEducInfoVo")
    public void setSptTechEducInfoVo(kr.re.kitech.biz.sup.edu.vo.SptTechEducInfoVo SptTechEducInfoVo){
        this.SptTechEducInfoVo = SptTechEducInfoVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTechEducInfoDetailVo [");
        sb.append("fileList_B").append("=").append(fileList_B).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("SptTechEducContributeVoList").append("=").append(SptTechEducContributeVoList).append(",");
        sb.append("SptTechEducReqdBugtVoList").append("=").append(SptTechEducReqdBugtVoList).append(",");
        sb.append("SptTechEducSchedVoList").append("=").append(SptTechEducSchedVoList).append(",");
        sb.append("SptTechEducAttnceVoList").append("=").append(SptTechEducAttnceVoList).append(",");
        sb.append("SptTechEducInfoVo").append("=").append(SptTechEducInfoVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTechEducContributeVoList != null && i < SptTechEducContributeVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo)SptTechEducContributeVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTechEducReqdBugtVoList != null && i < SptTechEducReqdBugtVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo)SptTechEducReqdBugtVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTechEducSchedVoList != null && i < SptTechEducSchedVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo)SptTechEducSchedVoList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; SptTechEducAttnceVoList != null && i < SptTechEducAttnceVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo)SptTechEducAttnceVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.SptTechEducInfoVo != null ) this.SptTechEducInfoVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTechEducContributeVoList != null && i < SptTechEducContributeVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducContributeVo)SptTechEducContributeVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTechEducReqdBugtVoList != null && i < SptTechEducReqdBugtVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducReqdBugtVo)SptTechEducReqdBugtVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTechEducSchedVoList != null && i < SptTechEducSchedVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducSchedVo)SptTechEducSchedVoList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; SptTechEducAttnceVoList != null && i < SptTechEducAttnceVoList.size() ; i++ ) {
            kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo vo = (kr.re.kitech.biz.sup.edu.vo.SptTechEducAttnceVo)SptTechEducAttnceVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.SptTechEducInfoVo != null ) this.SptTechEducInfoVo._xStreamDec();
    }


}
