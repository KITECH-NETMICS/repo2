package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 스냅샷 모델")
public class AprSnapReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprSnapReqVo(){
    }

    @ElDtoField(logicalName = "결재기능파라미터", physicalName = "aprScVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private kr.re.kitech.biz.apr.vo.AprScVo aprScVo;

    @ElDtoField(logicalName = "결재 사용자 검색", physicalName = "aprUserListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserListVo;

    @ElVoField(physicalName = "aprScVo")
    public kr.re.kitech.biz.apr.vo.AprScVo getAprScVo(){
        return aprScVo;
    }

    @ElVoField(physicalName = "aprScVo")
    public void setAprScVo(kr.re.kitech.biz.apr.vo.AprScVo aprScVo){
        this.aprScVo = aprScVo;
    }

    @ElVoField(physicalName = "aprUserListVo")
    public java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> getAprUserListVo(){
        return aprUserListVo;
    }

    @ElVoField(physicalName = "aprUserListVo")
    public void setAprUserListVo(java.util.List<kr.re.kitech.biz.apr.vo.AprUserVo> aprUserListVo){
        this.aprUserListVo = aprUserListVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprSnapReqVo [");
        sb.append("aprScVo").append("=").append(aprScVo).append(",");
        sb.append("aprUserListVo").append("=").append(aprUserListVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        if( this.aprScVo != null ) this.aprScVo._xStreamEnc();
        for( int i=0 ; aprUserListVo != null && i < aprUserListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserListVo.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        if( this.aprScVo != null ) this.aprScVo._xStreamDec();
        for( int i=0 ; aprUserListVo != null && i < aprUserListVo.size() ; i++ ) {
            kr.re.kitech.biz.apr.vo.AprUserVo vo = (kr.re.kitech.biz.apr.vo.AprUserVo)aprUserListVo.get(i);
            vo._xStreamDec();	 
        }
    }


}
