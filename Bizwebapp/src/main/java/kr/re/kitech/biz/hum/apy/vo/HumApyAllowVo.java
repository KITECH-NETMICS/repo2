package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "가족수당신청")
public class HumApyAllowVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyAllowVo(){
    }

    @ElDtoField(logicalName = "가족수당신청정보", physicalName = "humApyAllowInfoVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo humApyAllowInfoVo;

    @ElDtoField(logicalName = "결재의견", physicalName = "docList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList;

    @ElDtoField(logicalName = "변경전 가족정보", physicalName = "beforeList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> beforeList;

    @ElDtoField(logicalName = "변경후 가족정보", physicalName = "afterList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> afterList;

    @ElVoField(physicalName = "humApyAllowInfoVo")
    public kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo getHumApyAllowInfoVo(){
        return humApyAllowInfoVo;
    }

    @ElVoField(physicalName = "humApyAllowInfoVo")
    public void setHumApyAllowInfoVo(kr.re.kitech.biz.hum.apy.vo.HumApyAllowInfoVo humApyAllowInfoVo){
        this.humApyAllowInfoVo = humApyAllowInfoVo;
    }

    @ElVoField(physicalName = "docList")
    public java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> getDocList(){
        return docList;
    }

    @ElVoField(physicalName = "docList")
    public void setDocList(java.util.List<kr.re.kitech.biz.apr.vo.DocCommentsVo> docList){
        this.docList = docList;
    }

    @ElVoField(physicalName = "beforeList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> getBeforeList(){
        return beforeList;
    }

    @ElVoField(physicalName = "beforeList")
    public void setBeforeList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> beforeList){
        this.beforeList = beforeList;
    }

    @ElVoField(physicalName = "afterList")
    public java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> getAfterList(){
        return afterList;
    }

    @ElVoField(physicalName = "afterList")
    public void setAfterList(java.util.List<kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo> afterList){
        this.afterList = afterList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyAllowVo [");
        sb.append("humApyAllowInfoVo").append("=").append(humApyAllowInfoVo).append(",");
        sb.append("docList").append("=").append(docList).append(",");
        sb.append("beforeList").append("=").append(beforeList).append(",");
        sb.append("afterList").append("=").append(afterList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.humApyAllowInfoVo != null ) this.humApyAllowInfoVo._xStreamEnc();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; beforeList != null && i < beforeList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo)beforeList.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; afterList != null && i < afterList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo)afterList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.humApyAllowInfoVo != null ) this.humApyAllowInfoVo._xStreamDec();
        for( int i=0 ; docList != null && i < docList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.DocCommentsVo vo = (kr.re.kitech.biz.apr.vo.DocCommentsVo)docList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; beforeList != null && i < beforeList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo)beforeList.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; afterList != null && i < afterList.size() ; i++ ) {
            kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo vo = (kr.re.kitech.biz.hum.apy.vo.HumApyRctFamInfoVo)afterList.get(i);
            vo._xStreamDec();	 
        }
    }


}
