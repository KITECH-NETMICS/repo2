package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구장비집행요청확인 리스트 Vo")
public class ResEquipFeeReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResEquipFeeReqListVo(){
    }

    @ElDtoField(logicalName = "연구장비집행신청Vo", physicalName = "reqList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> reqList;

    @ElVoField(physicalName = "reqList")
    public java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> getReqList(){
        return reqList;
    }

    @ElVoField(physicalName = "reqList")
    public void setReqList(java.util.List<kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo> reqList){
        this.reqList = reqList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResEquipFeeReqListVo [");
        sb.append("reqList").append("=").append(reqList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; reqList != null && i < reqList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo)reqList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; reqList != null && i < reqList.size() ; i++ ) {
            kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo vo = (kr.re.kitech.biz.ass.eqip.vo.ResEquipFeeReqVo)reqList.get(i);
            vo._xStreamDec();	 
        }
    }


}
