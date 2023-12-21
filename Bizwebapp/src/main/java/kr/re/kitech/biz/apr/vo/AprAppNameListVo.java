package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AprAppNameListExp")
public class AprAppNameListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprAppNameListVo(){
    }

    @ElDtoField(logicalName = "appname", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appname;

    @ElDtoField(logicalName = "empcode", physicalName = "empcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empcode;

    @ElDtoField(logicalName = "reqnum", physicalName = "reqnum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqnum;

    @ElVoField(physicalName = "appname")
    public String getAppname(){
        return appname;
    }

    @ElVoField(physicalName = "appname")
    public void setAppname(String appname){
        this.appname = appname;
    }

    @ElVoField(physicalName = "empcode")
    public String getEmpcode(){
        return empcode;
    }

    @ElVoField(physicalName = "empcode")
    public void setEmpcode(String empcode){
        this.empcode = empcode;
    }

    @ElVoField(physicalName = "reqnum")
    public String getReqnum(){
        return reqnum;
    }

    @ElVoField(physicalName = "reqnum")
    public void setReqnum(String reqnum){
        this.reqnum = reqnum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprAppNameListVo [");
        sb.append("appname").append("=").append(appname).append(",");
        sb.append("empcode").append("=").append(empcode).append(",");
        sb.append("reqnum").append("=").append(reqnum);
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
