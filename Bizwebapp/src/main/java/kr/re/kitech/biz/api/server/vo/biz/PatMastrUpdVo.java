package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재후 patmastr수정 Vo")
public class PatMastrUpdVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatMastrUpdVo(){
    }

    @ElDtoField(logicalName = "심의결과", physicalName = "rvw_rslt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvw_rslt;

    @ElVoField(physicalName = "rvw_rslt")
    public String getRvw_rslt(){
        return rvw_rslt;
    }

    @ElVoField(physicalName = "rvw_rslt")
    public void setRvw_rslt(String rvw_rslt){
        this.rvw_rslt = rvw_rslt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatMastrUpdVo [");
        sb.append("rvw_rslt").append("=").append(rvw_rslt);
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
