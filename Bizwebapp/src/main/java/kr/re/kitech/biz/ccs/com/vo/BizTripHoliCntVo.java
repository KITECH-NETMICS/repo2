package kr.re.kitech.biz.ccs.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장 휴일근무일수 Vo")
public class BizTripHoliCntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BizTripHoliCntVo(){
    }

    @ElDtoField(logicalName = "전체일수", physicalName = "totCnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int totCnt;

    @ElDtoField(logicalName = "휴일일수", physicalName = "holiDayCnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int holiDayCnt;

    @ElVoField(physicalName = "totCnt")
    public int getTotCnt(){
        return totCnt;
    }

    @ElVoField(physicalName = "totCnt")
    public void setTotCnt(int totCnt){
        this.totCnt = totCnt;
    }

    @ElVoField(physicalName = "holiDayCnt")
    public int getHoliDayCnt(){
        return holiDayCnt;
    }

    @ElVoField(physicalName = "holiDayCnt")
    public void setHoliDayCnt(int holiDayCnt){
        this.holiDayCnt = holiDayCnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BizTripHoliCntVo [");
        sb.append("totCnt").append("=").append(totCnt).append(",");
        sb.append("holiDayCnt").append("=").append(holiDayCnt);
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
