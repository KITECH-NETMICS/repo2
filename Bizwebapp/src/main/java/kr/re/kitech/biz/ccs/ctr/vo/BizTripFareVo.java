package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장 운임 Vo")
public class BizTripFareVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BizTripFareVo(){
    }

    @ElDtoField(logicalName = "도착지역", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "운임", physicalName = "biztrip_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_fee;

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public String getBiztrip_fee(){
        return biztrip_fee;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public void setBiztrip_fee(String biztrip_fee){
        this.biztrip_fee = biztrip_fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BizTripFareVo [");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("biztrip_fee").append("=").append(biztrip_fee);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
