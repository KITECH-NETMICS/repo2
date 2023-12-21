package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화면 업무권한 체크 Vo")
public class RoleCheckVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public RoleCheckVo(){
    }

    @ElDtoField(logicalName = "화면아이디", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceId;

    @ElDtoField(logicalName = "롤코드", physicalName = "roleCodes", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleCodes;

    @ElDtoField(logicalName = "권한여부", physicalName = "isRoleYn", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean isRoleYn;

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        return serviceId;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "roleCodes")
    public String getRoleCodes(){
        return roleCodes;
    }

    @ElVoField(physicalName = "roleCodes")
    public void setRoleCodes(String roleCodes){
        this.roleCodes = roleCodes;
    }

    @ElVoField(physicalName = "isRoleYn")
    public boolean isIsRoleYn(){
        return isRoleYn;
    }

    @ElVoField(physicalName = "isRoleYn")
    public void setIsRoleYn(boolean isRoleYn){
        this.isRoleYn = isRoleYn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoleCheckVo [");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("roleCodes").append("=").append(roleCodes).append(",");
        sb.append("isRoleYn").append("=").append(isRoleYn);
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
