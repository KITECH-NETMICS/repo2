package kr.re.kitech.biz.ccs.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "항공마일리지 출장정보 Vo")
public class CtrAirMileTripVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrAirMileTripVo(){
    }

    @ElDtoField(logicalName = "출장지", physicalName = "biztrip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_region;

    @ElDtoField(logicalName = "출장시작일자", physicalName = "biztrip_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_start_ymd;

    @ElDtoField(logicalName = "출장종료일자", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "마일리지신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElVoField(physicalName = "biztrip_region")
    public String getBiztrip_region(){
        return biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_region")
    public void setBiztrip_region(String biztrip_region){
        this.biztrip_region = biztrip_region;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public String getBiztrip_start_ymd(){
        return biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_start_ymd")
    public void setBiztrip_start_ymd(String biztrip_start_ymd){
        this.biztrip_start_ymd = biztrip_start_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        return biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrAirMileTripVo [");
        sb.append("biztrip_region").append("=").append(biztrip_region).append(",");
        sb.append("biztrip_start_ymd").append("=").append(biztrip_start_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("req_no").append("=").append(req_no);
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
