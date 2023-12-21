package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class ResEquipFeeReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResEquipFeeReqListVo(){
    }

    @ElDtoField(logicalName = "ListVo", physicalName = "resEquipFeeReqVoList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> resEquipFeeReqVoList;

    @ElDtoField(logicalName = "Vo", physicalName = "resEquipFeeReqVo", type = "", typeKind = "Vo", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo resEquipFeeReqVo;

    @ElVoField(physicalName = "resEquipFeeReqVoList")
    public java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> getResEquipFeeReqVoList(){
        return resEquipFeeReqVoList;
    }

    @ElVoField(physicalName = "resEquipFeeReqVoList")
    public void setResEquipFeeReqVoList(java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> resEquipFeeReqVoList){
        this.resEquipFeeReqVoList = resEquipFeeReqVoList;
    }

    @ElVoField(physicalName = "resEquipFeeReqVo")
    public kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo getResEquipFeeReqVo(){
        return resEquipFeeReqVo;
    }

    @ElVoField(physicalName = "resEquipFeeReqVo")
    public void setResEquipFeeReqVo(kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo resEquipFeeReqVo){
        this.resEquipFeeReqVo = resEquipFeeReqVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResEquipFeeReqListVo [");
        sb.append("resEquipFeeReqVoList").append("=").append(resEquipFeeReqVoList).append(",");
        sb.append("resEquipFeeReqVo").append("=").append(resEquipFeeReqVo);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; resEquipFeeReqVoList != null && i < resEquipFeeReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo)resEquipFeeReqVoList.get(i);
            vo._xStreamEnc();	 
        }
        if( this.resEquipFeeReqVo != null ) this.resEquipFeeReqVo._xStreamEnc();
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; resEquipFeeReqVoList != null && i < resEquipFeeReqVoList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo)resEquipFeeReqVoList.get(i);
            vo._xStreamDec();	 
        }
        if( this.resEquipFeeReqVo != null ) this.resEquipFeeReqVo._xStreamDec();
    }


}
