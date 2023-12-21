package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "특정일의 출근 기록과 퇴근 기록Vo")
public class CwsExceptWorkTimeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsExceptWorkTimeVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "출근시간", physicalName = "attend_at", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_at;

    @ElDtoField(logicalName = "퇴근시간", physicalName = "leave_at", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String leave_at;

    @ElDtoField(logicalName = "대상일", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String basedate;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "attend_at")
    public String getAttend_at(){
        return attend_at;
    }

    @ElVoField(physicalName = "attend_at")
    public void setAttend_at(String attend_at){
        this.attend_at = attend_at;
    }

    @ElVoField(physicalName = "leave_at")
    public String getLeave_at(){
        return leave_at;
    }

    @ElVoField(physicalName = "leave_at")
    public void setLeave_at(String leave_at){
        this.leave_at = leave_at;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        return basedate;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsExceptWorkTimeVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("attend_at").append("=").append(attend_at).append(",");
        sb.append("leave_at").append("=").append(leave_at).append(",");
        sb.append("basedate").append("=").append(basedate);
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
