package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장기타경비 Vo")
public class CtrDomFeeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomFeeVo(){
    }

    @ElDtoField(logicalName = "숙박비", physicalName = "lodg_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long lodg_fee;

    @ElDtoField(logicalName = "일비", physicalName = "ymd_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ymd_fee;

    @ElDtoField(logicalName = "식비", physicalName = "meal_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long meal_fee;

    @ElVoField(physicalName = "lodg_fee")
    public long getLodg_fee(){
        return lodg_fee;
    }

    @ElVoField(physicalName = "lodg_fee")
    public void setLodg_fee(long lodg_fee){
        this.lodg_fee = lodg_fee;
    }

    @ElVoField(physicalName = "ymd_fee")
    public long getYmd_fee(){
        return ymd_fee;
    }

    @ElVoField(physicalName = "ymd_fee")
    public void setYmd_fee(long ymd_fee){
        this.ymd_fee = ymd_fee;
    }

    @ElVoField(physicalName = "meal_fee")
    public long getMeal_fee(){
        return meal_fee;
    }

    @ElVoField(physicalName = "meal_fee")
    public void setMeal_fee(long meal_fee){
        this.meal_fee = meal_fee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomFeeVo [");
        sb.append("lodg_fee").append("=").append(lodg_fee).append(",");
        sb.append("ymd_fee").append("=").append(ymd_fee).append(",");
        sb.append("meal_fee").append("=").append(meal_fee);
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
