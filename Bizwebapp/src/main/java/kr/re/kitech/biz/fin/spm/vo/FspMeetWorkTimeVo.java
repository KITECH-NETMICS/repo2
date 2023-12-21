package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록 근태정보 Vo")
public class FspMeetWorkTimeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspMeetWorkTimeVo(){
    }

    @ElDtoField(logicalName = "출장구분", physicalName = "trip_cls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_cls;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "날짜구분", physicalName = "date_cls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date_cls;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "ctr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_req_no;

    @ElDtoField(logicalName = "출근상세", physicalName = "work_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_detls;

    @ElDtoField(logicalName = "휴일구분", physicalName = "holiday_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_clsf;

    @ElDtoField(logicalName = "개수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "국내출장정산번호", physicalName = "adjst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_req_no;

    @ElVoField(physicalName = "trip_cls")
    public String getTrip_cls(){
        return trip_cls;
    }

    @ElVoField(physicalName = "trip_cls")
    public void setTrip_cls(String trip_cls){
        this.trip_cls = trip_cls;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "date_cls")
    public String getDate_cls(){
        return date_cls;
    }

    @ElVoField(physicalName = "date_cls")
    public void setDate_cls(String date_cls){
        this.date_cls = date_cls;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public String getCtr_req_no(){
        return ctr_req_no;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public void setCtr_req_no(String ctr_req_no){
        this.ctr_req_no = ctr_req_no;
    }

    @ElVoField(physicalName = "work_detls")
    public String getWork_detls(){
        return work_detls;
    }

    @ElVoField(physicalName = "work_detls")
    public void setWork_detls(String work_detls){
        this.work_detls = work_detls;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public String getHoliday_clsf(){
        return holiday_clsf;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public void setHoliday_clsf(String holiday_clsf){
        this.holiday_clsf = holiday_clsf;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public String getAdjst_req_no(){
        return adjst_req_no;
    }

    @ElVoField(physicalName = "adjst_req_no")
    public void setAdjst_req_no(String adjst_req_no){
        this.adjst_req_no = adjst_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetWorkTimeVo [");
        sb.append("trip_cls").append("=").append(trip_cls).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("date_cls").append("=").append(date_cls).append(",");
        sb.append("ctr_req_no").append("=").append(ctr_req_no).append(",");
        sb.append("work_detls").append("=").append(work_detls).append(",");
        sb.append("holiday_clsf").append("=").append(holiday_clsf).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("adjst_req_no").append("=").append(adjst_req_no);
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
