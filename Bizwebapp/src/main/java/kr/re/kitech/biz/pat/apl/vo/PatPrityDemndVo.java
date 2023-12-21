package kr.re.kitech.biz.pat.apl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "우선심사청구 Vo")
public class PatPrityDemndVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatPrityDemndVo(){
    }

    @ElDtoField(logicalName = "우선심사청구 의뢰번호", physicalName = "prity_demnd_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_demnd_id;

    @ElDtoField(logicalName = "업무진행상태코드", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElVoField(physicalName = "prity_demnd_id")
    public String getPrity_demnd_id(){
        return prity_demnd_id;
    }

    @ElVoField(physicalName = "prity_demnd_id")
    public void setPrity_demnd_id(String prity_demnd_id){
        this.prity_demnd_id = prity_demnd_id;
    }

    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }

    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPrityDemndVo [");
        sb.append("prity_demnd_id").append("=").append(prity_demnd_id).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd);
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
