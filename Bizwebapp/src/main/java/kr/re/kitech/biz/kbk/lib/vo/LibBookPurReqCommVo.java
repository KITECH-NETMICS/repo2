package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서구입신청서VO")
public class LibBookPurReqCommVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibBookPurReqCommVo(){
    }

    @ElDtoField(logicalName = "도서구입신청서VO", physicalName = "reqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo reqVo;

    @ElDtoField(logicalName = "도서구입신청서리스트VO", physicalName = "bookList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo> bookList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "reqVo")
    public kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo getReqVo(){
        return reqVo;
    }

    @ElVoField(physicalName = "reqVo")
    public void setReqVo(kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqVo reqVo){
        this.reqVo = reqVo;
    }

    @ElVoField(physicalName = "bookList")
    public java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo> getBookList(){
        return bookList;
    }

    @ElVoField(physicalName = "bookList")
    public void setBookList(java.util.List<kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo> bookList){
        this.bookList = bookList;
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
        sb.append("LibBookPurReqCommVo [");
        sb.append("reqVo").append("=").append(reqVo).append(",");
        sb.append("bookList").append("=").append(bookList).append(",");
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
        for( int i=0 ; bookList != null && i < bookList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo)bookList.get(i);
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
        for( int i=0 ; bookList != null && i < bookList.size() ; i++ ) {
            kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo vo = (kr.re.kitech.biz.kbk.lib.vo.LibBookPurReqListVo)bookList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
