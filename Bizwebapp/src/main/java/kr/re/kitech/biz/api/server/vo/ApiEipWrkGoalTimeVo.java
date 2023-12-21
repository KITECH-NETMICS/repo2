package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "목표근무시간VO")
public class ApiEipWrkGoalTimeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipWrkGoalTimeVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "기준월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String yyyymm;

    @ElDtoField(logicalName = "집계기준일자", physicalName = "baseday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String baseday;

    @ElDtoField(logicalName = "근무시간", physicalName = "worktime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String worktime;

    @ElDtoField(logicalName = "목표근무시간", physicalName = "wrkgoalTime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String wrkgoalTime;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        String ret = this.yyyymm;
        return ret;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "baseday")
    public String getBaseday(){
        String ret = this.baseday;
        return ret;
    }

    @ElVoField(physicalName = "baseday")
    public void setBaseday(String baseday){
        this.baseday = baseday;
    }

    @ElVoField(physicalName = "worktime")
    public String getWorktime(){
        String ret = this.worktime;
        return ret;
    }

    @ElVoField(physicalName = "worktime")
    public void setWorktime(String worktime){
        this.worktime = worktime;
    }

    @ElVoField(physicalName = "wrkgoalTime")
    public String getWrkgoalTime(){
        String ret = this.wrkgoalTime;
        return ret;
    }

    @ElVoField(physicalName = "wrkgoalTime")
    public void setWrkgoalTime(String wrkgoalTime){
        this.wrkgoalTime = wrkgoalTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipGWorkTimeVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("baseday").append("=").append(baseday).append(",");
        sb.append("worktime").append("=").append(worktime).append(",");
        sb.append("wrkgoalTime").append("=").append(wrkgoalTime);
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
