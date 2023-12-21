package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "과학기술인연금신청")
public class HumApyAnutyVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyAnutyVo(){
    }

    @ElDtoField(logicalName = "과학기술인연금신청정보", physicalName = "humApyAnutyInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo humApyAnutyInfoVo;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElVoField(physicalName = "humApyAnutyInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo getHumApyAnutyInfoVo(){
        return humApyAnutyInfoVo;
    }

    @ElVoField(physicalName = "humApyAnutyInfoVo")
    public void setHumApyAnutyInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApyAnutyInfoVo humApyAnutyInfoVo){
        this.humApyAnutyInfoVo = humApyAnutyInfoVo;
    }

    @ElVoField(physicalName = "docList")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
        return docList;
    }

    @ElVoField(physicalName = "docList")
    public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
        this.docList = docList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyAnutyVo [");
        sb.append("humApyAnutyInfoVo").append("=").append(humApyAnutyInfoVo).append(",");
        sb.append("docList").append("=").append(docList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApyAnutyInfoVo != null ) this.humApyAnutyInfoVo._xStreamEnc();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humApyAnutyInfoVo != null ) this.humApyAnutyInfoVo._xStreamDec();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
    }


}
