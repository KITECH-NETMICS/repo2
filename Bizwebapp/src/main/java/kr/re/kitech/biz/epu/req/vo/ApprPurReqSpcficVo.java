package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "특정구매요구서 결재신청 Vo")
public class ApprPurReqSpcficVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApprPurReqSpcficVo(){
    }

    @ElDtoField(logicalName = "특정물품구매사유서 Vo", physicalName = "spcficVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo spcficVo;

    @ElDtoField(logicalName = "구매품목 Vo", physicalName = "itemList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> itemList;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "spcficVo")
    public kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo getSpcficVo(){
        return spcficVo;
    }

    @ElVoField(physicalName = "spcficVo")
    public void setSpcficVo(kr.re.kitech.biz.epu.pop.vo.PurReqSpcficVo spcficVo){
        this.spcficVo = spcficVo;
    }

    @ElVoField(physicalName = "itemList")
    public java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> getItemList(){
        return itemList;
    }

    @ElVoField(physicalName = "itemList")
    public void setItemList(java.util.List<kr.re.kitech.biz.epu.req.vo.PurReqItemVo> itemList){
        this.itemList = itemList;
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
        sb.append("ApprPurReqSpcficVo [");
        sb.append("spcficVo").append("=").append(spcficVo).append(",");
        sb.append("itemList").append("=").append(itemList).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.spcficVo != null ) this.spcficVo._xStreamEnc();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqItemVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqItemVo)itemList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.spcficVo != null ) this.spcficVo._xStreamDec();
        for( int i=0 ; itemList != null && i < itemList.size() ; i++ ) {
            kr.re.kitech.biz.epu.req.vo.PurReqItemVo vo = (kr.re.kitech.biz.epu.req.vo.PurReqItemVo)itemList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
