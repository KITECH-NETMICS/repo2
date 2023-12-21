package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출장현황결재VO")
public class ApiEipTripPayVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipTripPayVo(){
    }

    @ElDtoField(logicalName = "출장구분", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String flag;

    @ElDtoField(logicalName = "출장시작일", physicalName = "biztrip_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_start_ymd;

    @ElDtoField(logicalName = "출장종료일", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "출장목적", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_goal;

    @ElDtoField(logicalName = "출장자", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장지역", physicalName = "region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String status;

    @ElDtoField(logicalName = "URL", physicalName = "URL", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String URL;

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        String ret = this.flag;
        return ret;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public String getBiztrip_start_ymd(){
        String ret = this.biztrip_start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public void setBiztrip_start_ymd(String biztrip_start_ymd){
        this.biztrip_start_ymd = biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        String ret = this.biztrip_cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        String ret = this.biztrip_goal;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        String ret = this.biztrip_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "region")
    public String getRegion(){
        String ret = this.region;
        return ret;
    }

    @ElVoField(physicalName = "region")
    public void setRegion(String region){
        this.region = region;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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
        sb.append("ApiEipTripPayVo [");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("biztrip_start_ymd").append("=").append(biztrip_start_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
        sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("region").append("=").append(region).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
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
