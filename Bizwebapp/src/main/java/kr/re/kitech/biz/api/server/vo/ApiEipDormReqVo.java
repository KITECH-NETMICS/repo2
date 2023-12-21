package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기숙사신청VO")
public class ApiEipDormReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipDormReqVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "사용자이름", physicalName = "use_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_nm;

    @ElDtoField(logicalName = "사용시작일", physicalName = "use_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_from_ymd;

    @ElDtoField(logicalName = "사용지역", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_nm;

    @ElDtoField(logicalName = "사용룸타입", physicalName = "req_room_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_room_nm;

    @ElDtoField(logicalName = "룸번호", physicalName = "room_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String room_no;

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

    @ElVoField(physicalName = "use_psn_nm")
    public String getUse_psn_nm(){
        String ret = this.use_psn_nm;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_nm")
    public void setUse_psn_nm(String use_psn_nm){
        this.use_psn_nm = use_psn_nm;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public String getUse_from_ymd(){
        String ret = this.use_from_ymd;
        return ret;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public void setUse_from_ymd(String use_from_ymd){
        this.use_from_ymd = use_from_ymd;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        String ret = this.region_nm;
        return ret;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "req_room_nm")
    public String getReq_room_nm(){
        String ret = this.req_room_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_room_nm")
    public void setReq_room_nm(String req_room_nm){
        this.req_room_nm = req_room_nm;
    }

    @ElVoField(physicalName = "room_no")
    public String getRoom_no(){
        String ret = this.room_no;
        return ret;
    }

    @ElVoField(physicalName = "room_no")
    public void setRoom_no(String room_no){
        this.room_no = room_no;
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
        sb.append("ApiEipDormReqVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("use_psn_nm").append("=").append(use_psn_nm).append(",");
        sb.append("use_from_ymd").append("=").append(use_from_ymd).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("req_room_nm").append("=").append(req_room_nm).append(",");
        sb.append("room_no").append("=").append(room_no).append(",");
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
