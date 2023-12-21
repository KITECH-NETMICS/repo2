package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의실신청VO")
public class ApiEipMRoomReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipMRoomReqVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "회의일자", physicalName = "meet_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ymd;

    @ElDtoField(logicalName = "회의시작시간", physicalName = "use_orign_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_orign_time;

    @ElDtoField(logicalName = "회의종료시간", physicalName = "use_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_cls_time;

    @ElDtoField(logicalName = "회의제목", physicalName = "meet_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_subj;

    @ElDtoField(logicalName = "회의장소", physicalName = "meet_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ofic_nm;

    @ElDtoField(logicalName = "상태", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String status;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "meet_ymd")
    public String getMeet_ymd(){
        String ret = this.meet_ymd;
        return ret;
    }

    @ElVoField(physicalName = "meet_ymd")
    public void setMeet_ymd(String meet_ymd){
        this.meet_ymd = meet_ymd;
    }

    @ElVoField(physicalName = "use_orign_time")
    public String getUse_orign_time(){
        String ret = this.use_orign_time;
        return ret;
    }

    @ElVoField(physicalName = "use_orign_time")
    public void setUse_orign_time(String use_orign_time){
        this.use_orign_time = use_orign_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public String getUse_cls_time(){
        String ret = this.use_cls_time;
        return ret;
    }

    @ElVoField(physicalName = "use_cls_time")
    public void setUse_cls_time(String use_cls_time){
        this.use_cls_time = use_cls_time;
    }

    @ElVoField(physicalName = "meet_subj")
    public String getMeet_subj(){
        String ret = this.meet_subj;
        return ret;
    }

    @ElVoField(physicalName = "meet_subj")
    public void setMeet_subj(String meet_subj){
        this.meet_subj = meet_subj;
    }

    @ElVoField(physicalName = "meet_ofic_nm")
    public String getMeet_ofic_nm(){
        String ret = this.meet_ofic_nm;
        return ret;
    }

    @ElVoField(physicalName = "meet_ofic_nm")
    public void setMeet_ofic_nm(String meet_ofic_nm){
        this.meet_ofic_nm = meet_ofic_nm;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipMRoomReqVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("meet_ymd").append("=").append(meet_ymd).append(",");
        sb.append("use_orign_time").append("=").append(use_orign_time).append(",");
        sb.append("use_cls_time").append("=").append(use_cls_time).append(",");
        sb.append("meet_subj").append("=").append(meet_subj).append(",");
        sb.append("meet_ofic_nm").append("=").append(meet_ofic_nm).append(",");
        sb.append("status").append("=").append(status);
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
