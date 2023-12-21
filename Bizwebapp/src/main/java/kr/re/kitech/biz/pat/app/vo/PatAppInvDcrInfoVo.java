package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발명신고서 상세 Vo")
public class PatAppInvDcrInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatAppInvDcrInfoVo(){
    }

    @ElDtoField(logicalName = "발명신고서 Vo", physicalName = "mastVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatAppMastrVo mastVo;

    @ElDtoField(logicalName = "공동발명자 Vo", physicalName = "psnList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo> psnList;

    @ElDtoField(logicalName = "공동출원인 Vo", physicalName = "vendList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo> vendList;

    @ElDtoField(logicalName = "지재권 관련과제 Vo", physicalName = "prjList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo> prjList;

    @ElDtoField(logicalName = "결재특허마스터VO", physicalName = "bookVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.pat.app.vo.PatInvntBookVo bookVo;

    @ElDtoField(logicalName = "발명신고서 첨부서류 Vo", physicalName = "attachList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo> attachList;

    @ElDtoField(logicalName = "도면첨부", physicalName = "fileList_A", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A;

    @ElDtoField(logicalName = "첨부파일(기술설명서)", physicalName = "fileList_B", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B;

    @ElDtoField(logicalName = "첨부파일(국외PCT사업화계획서)", physicalName = "fileList_C", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_C;

    @ElDtoField(logicalName = "첨부파일(외부인양도증)", physicalName = "fileList_D", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_D;

    @ElDtoField(logicalName = "첨부파일(공동출원동의서·사유서)", physicalName = "fileList_E", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_E;

    @ElDtoField(logicalName = "첨부파일(기타)", physicalName = "fileList_F", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_F;

    @ElDtoField(logicalName = "첨부파일(1인 발명지분 소명서)", physicalName = "fileList_G", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_G;

    @ElDtoField(logicalName = "첨부파일(디자인)", physicalName = "fileList_I", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_I;

    @ElDtoField(logicalName = "첨부파일(상표)", physicalName = "fileList_J", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_J;

    @ElDtoField(logicalName = "첨부파일(사전공개파일)", physicalName = "fileList_K", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_K;

    @ElVoField(physicalName = "mastVo")
    public kr.re.kitech.biz.pat.app.vo.PatAppMastrVo getMastVo(){
        return mastVo;
    }

    @ElVoField(physicalName = "mastVo")
    public void setMastVo(kr.re.kitech.biz.pat.app.vo.PatAppMastrVo mastVo){
        this.mastVo = mastVo;
    }

    @ElVoField(physicalName = "psnList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo> getPsnList(){
        return psnList;
    }

    @ElVoField(physicalName = "psnList")
    public void setPsnList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo> psnList){
        this.psnList = psnList;
    }

    @ElVoField(physicalName = "vendList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo> getVendList(){
        return vendList;
    }

    @ElVoField(physicalName = "vendList")
    public void setVendList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo> vendList){
        this.vendList = vendList;
    }

    @ElVoField(physicalName = "prjList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo> getPrjList(){
        return prjList;
    }

    @ElVoField(physicalName = "prjList")
    public void setPrjList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo> prjList){
        this.prjList = prjList;
    }

    @ElVoField(physicalName = "bookVo")
    public kr.re.kitech.biz.pat.app.vo.PatInvntBookVo getBookVo(){
        return bookVo;
    }

    @ElVoField(physicalName = "bookVo")
    public void setBookVo(kr.re.kitech.biz.pat.app.vo.PatInvntBookVo bookVo){
        this.bookVo = bookVo;
    }

    @ElVoField(physicalName = "attachList")
    public java.util.List<kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo> getAttachList(){
        return attachList;
    }

    @ElVoField(physicalName = "attachList")
    public void setAttachList(java.util.List<kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo> attachList){
        this.attachList = attachList;
    }

    @ElVoField(physicalName = "fileList_A")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "fileList_B")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_B(){
        return fileList_B;
    }

    @ElVoField(physicalName = "fileList_B")
    public void setFileList_B(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_B){
        this.fileList_B = fileList_B;
    }

    @ElVoField(physicalName = "fileList_C")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_C(){
        return fileList_C;
    }

    @ElVoField(physicalName = "fileList_C")
    public void setFileList_C(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_C){
        this.fileList_C = fileList_C;
    }

    @ElVoField(physicalName = "fileList_D")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_D(){
        return fileList_D;
    }

    @ElVoField(physicalName = "fileList_D")
    public void setFileList_D(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_D){
        this.fileList_D = fileList_D;
    }

    @ElVoField(physicalName = "fileList_E")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_E(){
        return fileList_E;
    }

    @ElVoField(physicalName = "fileList_E")
    public void setFileList_E(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_E){
        this.fileList_E = fileList_E;
    }

    @ElVoField(physicalName = "fileList_F")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_F(){
        return fileList_F;
    }

    @ElVoField(physicalName = "fileList_F")
    public void setFileList_F(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_F){
        this.fileList_F = fileList_F;
    }

    @ElVoField(physicalName = "fileList_G")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_G(){
        return fileList_G;
    }

    @ElVoField(physicalName = "fileList_G")
    public void setFileList_G(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_G){
        this.fileList_G = fileList_G;
    }

    @ElVoField(physicalName = "fileList_I")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_I(){
        return fileList_I;
    }

    @ElVoField(physicalName = "fileList_I")
    public void setFileList_I(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_I){
        this.fileList_I = fileList_I;
    }

    @ElVoField(physicalName = "fileList_J")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_J(){
        return fileList_J;
    }

    @ElVoField(physicalName = "fileList_J")
    public void setFileList_J(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_J){
        this.fileList_J = fileList_J;
    }

    @ElVoField(physicalName = "fileList_K")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList_K(){
        return fileList_K;
    }

    @ElVoField(physicalName = "fileList_K")
    public void setFileList_K(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList_K){
        this.fileList_K = fileList_K;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatAppInvDcrInfoVo [");
        sb.append("mastVo").append("=").append(mastVo).append(",");
        sb.append("psnList").append("=").append(psnList).append(",");
        sb.append("vendList").append("=").append(vendList).append(",");
        sb.append("prjList").append("=").append(prjList).append(",");
        sb.append("bookVo").append("=").append(bookVo).append(",");
        sb.append("attachList").append("=").append(attachList).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("fileList_B").append("=").append(fileList_B).append(",");
        sb.append("fileList_C").append("=").append(fileList_C).append(",");
        sb.append("fileList_D").append("=").append(fileList_D).append(",");
        sb.append("fileList_E").append("=").append(fileList_E).append(",");
        sb.append("fileList_F").append("=").append(fileList_F).append(",");
        sb.append("fileList_G").append("=").append(fileList_G).append(",");
        sb.append("fileList_I").append("=").append(fileList_I).append(",");
        sb.append("fileList_J").append("=").append(fileList_J).append(",");
        sb.append("fileList_K").append("=").append(fileList_K);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.mastVo != null ) this.mastVo._xStreamEnc();
        for( int i=0 ; psnList != null && i < psnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo vo = (kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo)psnList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo vo = (kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo)vendList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; prjList != null && i < prjList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo vo = (kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo)prjList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.bookVo != null ) this.bookVo._xStreamEnc();
        for( int i=0 ; attachList != null && i < attachList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo vo = (kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo)attachList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_C != null && i < fileList_C.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_C.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_D != null && i < fileList_D.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_D.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_E != null && i < fileList_E.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_E.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_F != null && i < fileList_F.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_F.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_G != null && i < fileList_G.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_G.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_I != null && i < fileList_I.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_I.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_J != null && i < fileList_J.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_J.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList_K != null && i < fileList_K.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_K.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.mastVo != null ) this.mastVo._xStreamDec();
        for( int i=0 ; psnList != null && i < psnList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo vo = (kr.re.kitech.biz.pat.app.vo.PatCoinvntPsnVo)psnList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; vendList != null && i < vendList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo vo = (kr.re.kitech.biz.pat.app.vo.PatCoSmitappVendVo)vendList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; prjList != null && i < prjList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo vo = (kr.re.kitech.biz.pat.app.vo.PatRelatReschPrjVo)prjList.get(i);
            vo._xStreamDec();	 
        }
        if( this.bookVo != null ) this.bookVo._xStreamDec();
        for( int i=0 ; attachList != null && i < attachList.size() ; i++ ) {
            kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo vo = (kr.re.kitech.biz.pat.app.vo.PatAttachaMastrVo)attachList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_A != null && i < fileList_A.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_A.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_B != null && i < fileList_B.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_B.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_C != null && i < fileList_C.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_C.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_D != null && i < fileList_D.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_D.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_E != null && i < fileList_E.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_E.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_F != null && i < fileList_F.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_F.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_G != null && i < fileList_G.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_G.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_I != null && i < fileList_I.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_I.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_J != null && i < fileList_J.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_J.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList_K != null && i < fileList_K.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList_K.get(i);
            vo._xStreamDec();	 
        }
    }


}
