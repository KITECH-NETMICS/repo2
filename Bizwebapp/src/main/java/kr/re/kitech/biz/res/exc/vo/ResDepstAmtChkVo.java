package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비입금의뢰 총액 체크 Vo")
public class ResDepstAmtChkVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResDepstAmtChkVo(){
    }

    @ElDtoField(logicalName = "과세금액", physicalName = "taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long taxamt;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long suply_value;

    @ElVoField(physicalName = "taxamt")
    public long getTaxamt(){
        return taxamt;
    }

    @ElVoField(physicalName = "taxamt")
    public void setTaxamt(long taxamt){
        this.taxamt = taxamt;
    }

    @ElVoField(physicalName = "suply_value")
    public long getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(long suply_value){
        this.suply_value = suply_value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResDepstAmtChkVo [");
        sb.append("taxamt").append("=").append(taxamt).append(",");
        sb.append("suply_value").append("=").append(suply_value);
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
