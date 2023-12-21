package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직금중간정산신청정보")
public class HumApyMidSvrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyMidSvrVo(){
    }

    @ElDtoField(logicalName = "퇴직금중간정산신청정보", physicalName = "humApyMidSvrInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo humApyMidSvrInfoVo;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElVoField(physicalName = "humApyMidSvrInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo getHumApyMidSvrInfoVo(){
        return humApyMidSvrInfoVo;
    }

    @ElVoField(physicalName = "humApyMidSvrInfoVo")
    public void setHumApyMidSvrInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApyMidSvrInfoVo humApyMidSvrInfoVo){
        this.humApyMidSvrInfoVo = humApyMidSvrInfoVo;
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
        sb.append("HumApyMidSvrVo [");
        sb.append("humApyMidSvrInfoVo").append("=").append(humApyMidSvrInfoVo).append(",");
        sb.append("docList").append("=").append(docList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApyMidSvrInfoVo != null ) this.humApyMidSvrInfoVo._xStreamEnc();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humApyMidSvrInfoVo != null ) this.humApyMidSvrInfoVo._xStreamDec();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
    }


}
