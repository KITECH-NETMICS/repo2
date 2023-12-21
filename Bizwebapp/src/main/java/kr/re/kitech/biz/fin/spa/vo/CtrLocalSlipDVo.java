package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장결의 디테일 Vo")
public class CtrLocalSlipDVo extends kr.re.kitech.biz.fin.com.vo.FspSlipDVo {
    private static final long serialVersionUID = 1L;

    public CtrLocalSlipDVo(){
    }

    @ElDtoField(logicalName = "차량사용유무", physicalName = "car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_use_yn;

    @ElVoField(physicalName = "car_use_yn")
    public String getCar_use_yn(){
        return car_use_yn;
    }

    @ElVoField(physicalName = "car_use_yn")
    public void setCar_use_yn(String car_use_yn){
        this.car_use_yn = car_use_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrLocalSlipDVo [");
        sb.append("car_use_yn").append("=").append(car_use_yn);
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
