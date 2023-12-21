package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연차결재진행VO")
public class ApiEipAnnPayProVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipAnnPayProVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "휴가구분", physicalName = "holiday_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_clsf;

    @ElDtoField(logicalName = "휴가기간", physicalName = "holiday_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_ymd;

    @ElDtoField(logicalName = "업무대행자", physicalName = "agent_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String agent_psn_syspayno;

    @ElDtoField(logicalName = "결재상태", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String status;

    @ElDtoField(logicalName = "URL", physicalName = "URL", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String URL;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public String getHoliday_clsf(){
        String ret = this.holiday_clsf;
        return ret;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public void setHoliday_clsf(String holiday_clsf){
        this.holiday_clsf = holiday_clsf;
    }

    @ElVoField(physicalName = "holiday_ymd")
    public String getHoliday_ymd(){
        String ret = this.holiday_ymd;
        return ret;
    }

    @ElVoField(physicalName = "holiday_ymd")
    public void setHoliday_ymd(String holiday_ymd){
        this.holiday_ymd = holiday_ymd;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public String getAgent_psn_syspayno(){
        String ret = this.agent_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public void setAgent_psn_syspayno(String agent_psn_syspayno){
        this.agent_psn_syspayno = agent_psn_syspayno;
    }

    @ElVoField(physicalName = "status")
    public String getStatus(){
        String ret = this.status;
        return ret;
    }

    @ElVoField(physicalName = "status")
    public void setStatus(String status){
        this.status = status;
    }

    @ElVoField(physicalName = "URL")
    public String getURL(){
        String ret = this.URL;
        return ret;
    }

    @ElVoField(physicalName = "URL")
    public void setURL(String URL){
        this.URL = URL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipAnnPayProVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("holiday_clsf").append("=").append(holiday_clsf).append(",");
        sb.append("holiday_ymd").append("=").append(holiday_ymd).append(",");
        sb.append("agent_psn_syspayno").append("=").append(agent_psn_syspayno).append(",");
        sb.append("status").append("=").append(status).append(",");
        sb.append("URL").append("=").append(URL);
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
