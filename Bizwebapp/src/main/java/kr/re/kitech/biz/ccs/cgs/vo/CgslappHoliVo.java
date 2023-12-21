package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappHoliVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappHoliVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "구분", physicalName = "holiday_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_clsf;

    @ElDtoField(logicalName = "시작일자", physicalName = "holiday_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "holiday_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_cls_ymd;

    @ElDtoField(logicalName = "휴가일수", physicalName = "holiday_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_daycnt;

    @ElDtoField(logicalName = "행선지", physicalName = "destin", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String destin;

    @ElDtoField(logicalName = "사유", physicalName = "holiday_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String holiday_cause;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        String ret = this.req_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
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

    @ElVoField(physicalName = "holiday_start_ymd")
    public String getHoliday_start_ymd(){
        String ret = this.holiday_start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "holiday_start_ymd")
    public void setHoliday_start_ymd(String holiday_start_ymd){
        this.holiday_start_ymd = holiday_start_ymd;
    }

    @ElVoField(physicalName = "holiday_cls_ymd")
    public String getHoliday_cls_ymd(){
        String ret = this.holiday_cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "holiday_cls_ymd")
    public void setHoliday_cls_ymd(String holiday_cls_ymd){
        this.holiday_cls_ymd = holiday_cls_ymd;
    }

    @ElVoField(physicalName = "holiday_daycnt")
    public String getHoliday_daycnt(){
        String ret = this.holiday_daycnt;
        return ret;
    }

    @ElVoField(physicalName = "holiday_daycnt")
    public void setHoliday_daycnt(String holiday_daycnt){
        this.holiday_daycnt = holiday_daycnt;
    }

    @ElVoField(physicalName = "destin")
    public String getDestin(){
        String ret = this.destin;
        return ret;
    }

    @ElVoField(physicalName = "destin")
    public void setDestin(String destin){
        this.destin = destin;
    }

    @ElVoField(physicalName = "holiday_cause")
    public String getHoliday_cause(){
        String ret = this.holiday_cause;
        return ret;
    }

    @ElVoField(physicalName = "holiday_cause")
    public void setHoliday_cause(String holiday_cause){
        this.holiday_cause = holiday_cause;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappHoliVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("holiday_clsf").append("=").append(holiday_clsf).append(",");
        sb.append("holiday_start_ymd").append("=").append(holiday_start_ymd).append(",");
        sb.append("holiday_cls_ymd").append("=").append(holiday_cls_ymd).append(",");
        sb.append("holiday_daycnt").append("=").append(holiday_daycnt).append(",");
        sb.append("destin").append("=").append(destin).append(",");
        sb.append("holiday_cause").append("=").append(holiday_cause);
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
