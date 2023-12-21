package kr.re.kitech.biz.lpl.lpr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기념홍보물신청정보")
public class LplLprPrGoodsReqAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LplLprPrGoodsReqAprVo(){
    }

    @ElDtoField(logicalName = "기념홍보물신청정보", physicalName = "infoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo infoVo;

    @ElDtoField(logicalName = "기념홍보물신청정보", physicalName = "lplLprPrGoodsList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo> lplLprPrGoodsList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "infoVo")
    public kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo getInfoVo(){
        return infoVo;
    }

    @ElVoField(physicalName = "infoVo")
    public void setInfoVo(kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo infoVo){
        this.infoVo = infoVo;
    }

    @ElVoField(physicalName = "lplLprPrGoodsList")
    public java.util.List<kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo> getLplLprPrGoodsList(){
        return lplLprPrGoodsList;
    }

    @ElVoField(physicalName = "lplLprPrGoodsList")
    public void setLplLprPrGoodsList(java.util.List<kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo> lplLprPrGoodsList){
        this.lplLprPrGoodsList = lplLprPrGoodsList;
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
        sb.append("LplLprPrGoodsReqAprVo [");
        sb.append("infoVo").append("=").append(infoVo).append(",");
        sb.append("lplLprPrGoodsList").append("=").append(lplLprPrGoodsList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.infoVo != null ) this.infoVo._xStreamEnc();
        for( int i=0 ; lplLprPrGoodsList != null && i < lplLprPrGoodsList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo vo = (kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo)lplLprPrGoodsList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.infoVo != null ) this.infoVo._xStreamDec();
        for( int i=0 ; lplLprPrGoodsList != null && i < lplLprPrGoodsList.size() ; i++ ) {
            kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo vo = (kr.re.kitech.biz.lpl.lpr.vo.LplLprPrGoodsReqInfoVo)lplLprPrGoodsList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
