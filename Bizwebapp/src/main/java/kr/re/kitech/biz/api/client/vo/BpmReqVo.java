package kr.re.kitech.biz.api.client.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BPM 요청 객체")
public class BpmReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BpmReqVo(){
    }

    @ElDtoField(logicalName = "문서ID", physicalName = "alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "docId 대응", attr = "")
    private String alias;

    @ElDtoField(logicalName = "서비스타입", physicalName = "serviceType", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceType;

    @ElDtoField(logicalName = "실행자", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "user_id 대응", attr = "")
    private String endpoint;

    @ElDtoField(logicalName = "요청값", physicalName = "paramVo", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.Map paramVo;

    @ElVoField(physicalName = "alias")
    public String getAlias(){
        String ret = this.alias;
        return ret;
    }

    @ElVoField(physicalName = "alias")
    public void setAlias(String alias){
        this.alias = alias;
    }

    @ElVoField(physicalName = "serviceType")
    public String getServiceType(){
        String ret = this.serviceType;
        return ret;
    }

    @ElVoField(physicalName = "serviceType")
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        String ret = this.endpoint;
        return ret;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @ElVoField(physicalName = "paramVo")
    public java.util.Map getParamVo(){
        return paramVo;
    }

    @ElVoField(physicalName = "paramVo")
    public void setParamVo(java.util.Map paramVo){
        this.paramVo = paramVo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BpmReqVo [");
        sb.append("alias").append("=").append(alias).append(",");
        sb.append("serviceType").append("=").append(serviceType).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("paramVo").append("=").append(paramVo);
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
