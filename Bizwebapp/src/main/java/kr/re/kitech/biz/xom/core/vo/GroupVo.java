package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Ldap 권한")
public class GroupVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public GroupVo(){
    }

    @ElDtoField(logicalName = "권한ID", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cn;

    @ElDtoField(logicalName = "권한명", physicalName = "cnRoleFullName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnRoleFullName;

    @ElDtoField(logicalName = "권한코드", physicalName = "roleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleCode;

    @ElDtoField(logicalName = "상위권한코드", physicalName = "parentGroupCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String parentGroupCode;

    @ElDtoField(logicalName = "권한레벨", physicalName = "roleLevel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleLevel;

    @ElDtoField(logicalName = "권한순서", physicalName = "roleOrder", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleOrder;

    @ElDtoField(logicalName = "서비스코드", physicalName = "serviceCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceCode;

    @ElVoField(physicalName = "cn")
    public String getCn(){
        return cn;
    }

    @ElVoField(physicalName = "cn")
    public void setCn(String cn){
        this.cn = cn;
    }

    @ElVoField(physicalName = "cnRoleFullName")
    public String getCnRoleFullName(){
        return cnRoleFullName;
    }

    @ElVoField(physicalName = "cnRoleFullName")
    public void setCnRoleFullName(String cnRoleFullName){
        this.cnRoleFullName = cnRoleFullName;
    }

    @ElVoField(physicalName = "roleCode")
    public String getRoleCode(){
        return roleCode;
    }

    @ElVoField(physicalName = "roleCode")
    public void setRoleCode(String roleCode){
        this.roleCode = roleCode;
    }

    @ElVoField(physicalName = "parentGroupCode")
    public String getParentGroupCode(){
        return parentGroupCode;
    }

    @ElVoField(physicalName = "parentGroupCode")
    public void setParentGroupCode(String parentGroupCode){
        this.parentGroupCode = parentGroupCode;
    }

    @ElVoField(physicalName = "roleLevel")
    public String getRoleLevel(){
        return roleLevel;
    }

    @ElVoField(physicalName = "roleLevel")
    public void setRoleLevel(String roleLevel){
        this.roleLevel = roleLevel;
    }

    @ElVoField(physicalName = "roleOrder")
    public String getRoleOrder(){
        return roleOrder;
    }

    @ElVoField(physicalName = "roleOrder")
    public void setRoleOrder(String roleOrder){
        this.roleOrder = roleOrder;
    }

    @ElVoField(physicalName = "serviceCode")
    public String getServiceCode(){
        return serviceCode;
    }

    @ElVoField(physicalName = "serviceCode")
    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupVo [");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("cnRoleFullName").append("=").append(cnRoleFullName).append(",");
        sb.append("roleCode").append("=").append(roleCode).append(",");
        sb.append("parentGroupCode").append("=").append(parentGroupCode).append(",");
        sb.append("roleLevel").append("=").append(roleLevel).append(",");
        sb.append("roleOrder").append("=").append(roleOrder).append(",");
        sb.append("serviceCode").append("=").append(serviceCode);
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
