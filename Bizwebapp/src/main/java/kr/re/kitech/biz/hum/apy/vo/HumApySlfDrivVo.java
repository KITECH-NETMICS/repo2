package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자가운전비보조신청정보")
public class HumApySlfDrivVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApySlfDrivVo(){
    }

    @ElDtoField(logicalName = "자가운전비보조신청기본정보", physicalName = "humApySlfDrivInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo humApySlfDrivInfoVo;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElVoField(physicalName = "humApySlfDrivInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo getHumApySlfDrivInfoVo(){
        return humApySlfDrivInfoVo;
    }

    @ElVoField(physicalName = "humApySlfDrivInfoVo")
    public void setHumApySlfDrivInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApySlfDrivInfoVo humApySlfDrivInfoVo){
        this.humApySlfDrivInfoVo = humApySlfDrivInfoVo;
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
        sb.append("HumApySlfDrivVo [");
        sb.append("humApySlfDrivInfoVo").append("=").append(humApySlfDrivInfoVo).append(",");
        sb.append("docList").append("=").append(docList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApySlfDrivInfoVo != null ) this.humApySlfDrivInfoVo._xStreamEnc();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humApySlfDrivInfoVo != null ) this.humApySlfDrivInfoVo._xStreamDec();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
    }


}
