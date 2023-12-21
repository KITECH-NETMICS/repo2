package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "입금의뢰 수정 Vo")
public class FcpDepstUpdVo extends kr.re.kitech.biz.fin.com.vo.ComReqVo {
    private static final long serialVersionUID = 1L;

    public FcpDepstUpdVo(){
    }

    @ElDtoField(logicalName = "입금요청확정", physicalName = "depst_req_decsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_decsn;

    @ElVoField(physicalName = "depst_req_decsn")
    public String getDepst_req_decsn(){
        return depst_req_decsn;
    }

    @ElVoField(physicalName = "depst_req_decsn")
    public void setDepst_req_decsn(String depst_req_decsn){
        this.depst_req_decsn = depst_req_decsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FcpDepstUpdVo [");
        sb.append("depst_req_decsn").append("=").append(depst_req_decsn);
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
