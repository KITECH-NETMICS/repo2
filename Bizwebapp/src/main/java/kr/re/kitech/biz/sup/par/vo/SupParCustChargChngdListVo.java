package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "파트너기업 정보변경 신청서 리스트Vo")
public class SupParCustChargChngdListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SupParCustChargChngdListVo(){
    }

    @ElDtoField(logicalName = "list", physicalName = "supParCustChargChngdListVo", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo> supParCustChargChngdListVo;

    @ElDtoField(logicalName = "vo", physicalName = "supParCustChargChngdVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo supParCustChargChngdVo;

    @ElVoField(physicalName = "supParCustChargChngdListVo")
    public java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo> getSupParCustChargChngdListVo(){
        return supParCustChargChngdListVo;
    }

    @ElVoField(physicalName = "supParCustChargChngdListVo")
    public void setSupParCustChargChngdListVo(java.util.List<kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo> supParCustChargChngdListVo){
        this.supParCustChargChngdListVo = supParCustChargChngdListVo;
    }

    @ElVoField(physicalName = "supParCustChargChngdVo")
    public kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo getSupParCustChargChngdVo(){
        return supParCustChargChngdVo;
    }

    @ElVoField(physicalName = "supParCustChargChngdVo")
    public void setSupParCustChargChngdVo(kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo supParCustChargChngdVo){
        this.supParCustChargChngdVo = supParCustChargChngdVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SupParCustChargChngdListVo [");
        sb.append("supParCustChargChngdListVo").append("=").append(supParCustChargChngdListVo).append(",");
        sb.append("supParCustChargChngdVo").append("=").append(supParCustChargChngdVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; supParCustChargChngdListVo != null && i < supParCustChargChngdListVo.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo)supParCustChargChngdListVo.get(i);
            vo._xStreamEnc();	 
        }
        if( this.supParCustChargChngdVo != null ) this.supParCustChargChngdVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; supParCustChargChngdListVo != null && i < supParCustChargChngdListVo.size() ; i++ ) {
            kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo vo = (kr.re.kitech.biz.sup.par.vo.SupParCustChargChngdVo)supParCustChargChngdListVo.get(i);
            vo._xStreamDec();	 
        }
        if( this.supParCustChargChngdVo != null ) this.supParCustChargChngdVo._xStreamDec();
    }


}
