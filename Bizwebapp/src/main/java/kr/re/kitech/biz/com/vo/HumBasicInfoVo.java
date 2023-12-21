package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서 정보")
public class HumBasicInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasicInfoVo(){
    }

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "기준시작일", physicalName = "biztrip_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_from_ymd;

    @ElDtoField(logicalName = "기준종료일", physicalName = "biztrip_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_to_ymd;

    @ElDtoField(logicalName = "일자", physicalName = "biztrip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String biztrip_ymd;

    @ElDtoField(logicalName = "근태정보", physicalName = "ctrl_content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ctrl_content;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "biztrip_from_ymd")
    public String getBiztrip_from_ymd(){
        String ret = this.biztrip_from_ymd;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_from_ymd")
    public void setBiztrip_from_ymd(String biztrip_from_ymd){
        this.biztrip_from_ymd = biztrip_from_ymd;
    }

    @ElVoField(physicalName = "biztrip_to_ymd")
    public String getBiztrip_to_ymd(){
        String ret = this.biztrip_to_ymd;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_to_ymd")
    public void setBiztrip_to_ymd(String biztrip_to_ymd){
        this.biztrip_to_ymd = biztrip_to_ymd;
    }

    @ElVoField(physicalName = "biztrip_ymd")
    public String getBiztrip_ymd(){
        String ret = this.biztrip_ymd;
        return ret;
    }

    @ElVoField(physicalName = "biztrip_ymd")
    public void setBiztrip_ymd(String biztrip_ymd){
        this.biztrip_ymd = biztrip_ymd;
    }

    @ElVoField(physicalName = "ctrl_content")
    public String getCtrl_content(){
        String ret = this.ctrl_content;
        return ret;
    }

    @ElVoField(physicalName = "ctrl_content")
    public void setCtrl_content(String ctrl_content){
        this.ctrl_content = ctrl_content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasicInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("biztrip_from_ymd").append("=").append(biztrip_from_ymd).append(",");
        sb.append("biztrip_to_ymd").append("=").append(biztrip_to_ymd).append(",");
        sb.append("biztrip_ymd").append("=").append(biztrip_ymd).append(",");
        sb.append("ctrl_content").append("=").append(ctrl_content);
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
