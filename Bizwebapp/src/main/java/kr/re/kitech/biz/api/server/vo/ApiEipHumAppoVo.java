package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발령이력Vo")
public class ApiEipHumAppoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipHumAppoVo(){
    }

    @ElDtoField(logicalName = "appont_cls_ymd", physicalName = "appont_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_cls_ymd;

    @ElDtoField(logicalName = "appont_typ", physicalName = "appont_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_typ;

    @ElDtoField(logicalName = "appont_resn", physicalName = "appont_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_resn;

    @ElDtoField(logicalName = "asdept_nm", physicalName = "asdept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String asdept_nm;

    @ElDtoField(logicalName = "occutyp_nm", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "duty_nm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "job_nm", physicalName = "job_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_nm;

    @ElDtoField(logicalName = "work_land", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land;

    @ElDtoField(logicalName = "appont_no", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "appont_start_ymd", physicalName = "appont_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_start_ymd;

    @ElVoField(physicalName = "appont_cls_ymd")
    public String getAppont_cls_ymd(){
        return appont_cls_ymd;
    }

    @ElVoField(physicalName = "appont_cls_ymd")
    public void setAppont_cls_ymd(String appont_cls_ymd){
        this.appont_cls_ymd = appont_cls_ymd;
    }

    @ElVoField(physicalName = "appont_typ")
    public String getAppont_typ(){
        return appont_typ;
    }

    @ElVoField(physicalName = "appont_typ")
    public void setAppont_typ(String appont_typ){
        this.appont_typ = appont_typ;
    }

    @ElVoField(physicalName = "appont_resn")
    public String getAppont_resn(){
        return appont_resn;
    }

    @ElVoField(physicalName = "appont_resn")
    public void setAppont_resn(String appont_resn){
        this.appont_resn = appont_resn;
    }

    @ElVoField(physicalName = "asdept_nm")
    public String getAsdept_nm(){
        return asdept_nm;
    }

    @ElVoField(physicalName = "asdept_nm")
    public void setAsdept_nm(String asdept_nm){
        this.asdept_nm = asdept_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public String getJob_nm(){
        return job_nm;
    }

    @ElVoField(physicalName = "job_nm")
    public void setJob_nm(String job_nm){
        this.job_nm = job_nm;
    }

    @ElVoField(physicalName = "work_land")
    public String getWork_land(){
        return work_land;
    }

    @ElVoField(physicalName = "work_land")
    public void setWork_land(String work_land){
        this.work_land = work_land;
    }

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }

    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "appont_start_ymd")
    public String getAppont_start_ymd(){
        return appont_start_ymd;
    }

    @ElVoField(physicalName = "appont_start_ymd")
    public void setAppont_start_ymd(String appont_start_ymd){
        this.appont_start_ymd = appont_start_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipHumAppoVo [");
        sb.append("appont_cls_ymd").append("=").append(appont_cls_ymd).append(",");
        sb.append("appont_typ").append("=").append(appont_typ).append(",");
        sb.append("appont_resn").append("=").append(appont_resn).append(",");
        sb.append("asdept_nm").append("=").append(asdept_nm).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("job_nm").append("=").append(job_nm).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("appont_start_ymd").append("=").append(appont_start_ymd);
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
