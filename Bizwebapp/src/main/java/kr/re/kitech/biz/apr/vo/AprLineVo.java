package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재선 상세")
public class AprLineVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprLineVo(){
    }

    @ElDtoField(logicalName = "결재선번호", physicalName = "apl_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apl_id;

    @ElDtoField(logicalName = "결재선명", physicalName = "apl_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apl_name;

    @ElDtoField(logicalName = "결재선설명", physicalName = "apl_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apl_desc;

    @ElDtoField(logicalName = "개인결재자", physicalName = "apl_endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apl_endpoint;

    @ElVoField(physicalName = "apl_id")
    public String getApl_id(){
        String ret = this.apl_id;
        return ret;
    }

    @ElVoField(physicalName = "apl_id")
    public void setApl_id(String apl_id){
        this.apl_id = apl_id;
    }

    @ElVoField(physicalName = "apl_name")
    public String getApl_name(){
        String ret = this.apl_name;
        return ret;
    }

    @ElVoField(physicalName = "apl_name")
    public void setApl_name(String apl_name){
        this.apl_name = apl_name;
    }

    @ElVoField(physicalName = "apl_desc")
    public String getApl_desc(){
        String ret = this.apl_desc;
        return ret;
    }

    @ElVoField(physicalName = "apl_desc")
    public void setApl_desc(String apl_desc){
        this.apl_desc = apl_desc;
    }

    @ElVoField(physicalName = "apl_endpoint")
    public String getApl_endpoint(){
        String ret = this.apl_endpoint;
        return ret;
    }

    @ElVoField(physicalName = "apl_endpoint")
    public void setApl_endpoint(String apl_endpoint){
        this.apl_endpoint = apl_endpoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprLineVo [");
        sb.append("apl_id").append("=").append(apl_id).append(",");
        sb.append("apl_name").append("=").append(apl_name).append(",");
        sb.append("apl_desc").append("=").append(apl_desc).append(",");
        sb.append("apl_endpoint").append("=").append(apl_endpoint);
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
