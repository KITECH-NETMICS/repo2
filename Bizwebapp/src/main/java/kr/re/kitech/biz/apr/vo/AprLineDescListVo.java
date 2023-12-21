package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "개인 결재선 리스트")
public class AprLineDescListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprLineDescListVo(){
    }

    @ElDtoField(logicalName = "결재선 세팅 상세", physicalName = "aprLineDescList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprLineDescVo> aprLineDescList;

    @ElDtoField(logicalName = "결재선 상세", physicalName = "aprLineVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.apr.vo.AprLineVo aprLineVo;

    @ElVoField(physicalName = "aprLineDescList")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprLineDescVo> getAprLineDescList(){
        return aprLineDescList;
    }

    @ElVoField(physicalName = "aprLineDescList")
    public void setAprLineDescList(java.util.List<kr.re.kitech.biz.apr.vo.AprLineDescVo> aprLineDescList){
        this.aprLineDescList = aprLineDescList;
    }

    @ElVoField(physicalName = "aprLineVo")
    public kr.re.kitech.biz.apr.vo.AprLineVo getAprLineVo(){
        return aprLineVo;
    }

    @ElVoField(physicalName = "aprLineVo")
    public void setAprLineVo(kr.re.kitech.biz.apr.vo.AprLineVo aprLineVo){
        this.aprLineVo = aprLineVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprLineDescListVo [");
        sb.append("aprLineDescList").append("=").append(aprLineDescList).append(",");
        sb.append("aprLineVo").append("=").append(aprLineVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; aprLineDescList != null && i < aprLineDescList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprLineDescVo vo = (kr.re.kitech.biz.apr.vo.AprLineDescVo)aprLineDescList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.aprLineVo != null ) this.aprLineVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; aprLineDescList != null && i < aprLineDescList.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprLineDescVo vo = (kr.re.kitech.biz.apr.vo.AprLineDescVo)aprLineDescList.get(i);
            vo._xStreamDec();	 
        }
        if( this.aprLineVo != null ) this.aprLineVo._xStreamDec();
    }


}
