package kr.re.kitech.biz.uss.ath.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사용자조회 Vo")
public class UserSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public UserSrcVo(){
    }

    @ElDtoField(logicalName = "속성명", physicalName = "attribute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attribute;

    @ElDtoField(logicalName = "필터", physicalName = "filter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String filter;

    @ElDtoField(logicalName = "기준", physicalName = "base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base;

    @ElDtoField(logicalName = "성명", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cn;

    @ElDtoField(logicalName = "부서", physicalName = "ouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouCode;

    @ElDtoField(logicalName = "사용자구분", physicalName = "workDiv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String workDiv;

    @ElDtoField(logicalName = "롤코드", physicalName = "roleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleCode;

    @ElDtoField(logicalName = "롤레벨", physicalName = "roleLevel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleLevel;

    @ElVoField(physicalName = "attribute")
    public String getAttribute(){
        return attribute;
    }

    @ElVoField(physicalName = "attribute")
    public void setAttribute(String attribute){
        this.attribute = attribute;
    }

    @ElVoField(physicalName = "filter")
    public String getFilter(){
        return filter;
    }

    @ElVoField(physicalName = "filter")
    public void setFilter(String filter){
        this.filter = filter;
    }

    @ElVoField(physicalName = "base")
    public String getBase(){
        return base;
    }

    @ElVoField(physicalName = "base")
    public void setBase(String base){
        this.base = base;
    }

    @ElVoField(physicalName = "cn")
    public String getCn(){
        return cn;
    }

    @ElVoField(physicalName = "cn")
    public void setCn(String cn){
        this.cn = cn;
    }

    @ElVoField(physicalName = "ouCode")
    public String getOuCode(){
        return ouCode;
    }

    @ElVoField(physicalName = "ouCode")
    public void setOuCode(String ouCode){
        this.ouCode = ouCode;
    }

    @ElVoField(physicalName = "workDiv")
    public String getWorkDiv(){
        return workDiv;
    }

    @ElVoField(physicalName = "workDiv")
    public void setWorkDiv(String workDiv){
        this.workDiv = workDiv;
    }

    @ElVoField(physicalName = "roleCode")
    public String getRoleCode(){
        return roleCode;
    }

    @ElVoField(physicalName = "roleCode")
    public void setRoleCode(String roleCode){
        this.roleCode = roleCode;
    }

    @ElVoField(physicalName = "roleLevel")
    public String getRoleLevel(){
        return roleLevel;
    }

    @ElVoField(physicalName = "roleLevel")
    public void setRoleLevel(String roleLevel){
        this.roleLevel = roleLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserSrcVo [");
        sb.append("attribute").append("=").append(attribute).append(",");
        sb.append("filter").append("=").append(filter).append(",");
        sb.append("base").append("=").append(base).append(",");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("ouCode").append("=").append(ouCode).append(",");
        sb.append("workDiv").append("=").append(workDiv).append(",");
        sb.append("roleCode").append("=").append(roleCode).append(",");
        sb.append("roleLevel").append("=").append(roleLevel);
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
