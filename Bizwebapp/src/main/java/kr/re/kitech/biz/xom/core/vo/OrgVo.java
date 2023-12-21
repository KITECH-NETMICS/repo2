package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Ldap 조직도(부서)")
public class OrgVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public OrgVo(){
    }

    @ElDtoField(logicalName = "부서명", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cn;

    @ElDtoField(logicalName = "부서코드", physicalName = "ouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouCode;

    @ElDtoField(logicalName = "부서코드(rdb)", physicalName = "bizouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizouCode;

    @ElDtoField(logicalName = "상위부서명", physicalName = "ou", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ou;

    @ElDtoField(logicalName = "상위부서코드", physicalName = "parentouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String parentouCode;

    @ElDtoField(logicalName = "부서경로", physicalName = "cnOrgFullName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnOrgFullName;

    @ElDtoField(logicalName = "부서레벨", physicalName = "ouLevel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouLevel;

    @ElDtoField(logicalName = "부서순서", physicalName = "ouOrder", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouOrder;

    @ElDtoField(logicalName = "최상위부서코드", physicalName = "topouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String topouCode;

    @ElDtoField(logicalName = "본부코드", physicalName = "headouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String headouCode;

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

    @ElVoField(physicalName = "bizouCode")
    public String getBizouCode(){
        return bizouCode;
    }

    @ElVoField(physicalName = "bizouCode")
    public void setBizouCode(String bizouCode){
        this.bizouCode = bizouCode;
    }

    @ElVoField(physicalName = "ou")
    public String getOu(){
        return ou;
    }

    @ElVoField(physicalName = "ou")
    public void setOu(String ou){
        this.ou = ou;
    }

    @ElVoField(physicalName = "parentouCode")
    public String getParentouCode(){
        return parentouCode;
    }

    @ElVoField(physicalName = "parentouCode")
    public void setParentouCode(String parentouCode){
        this.parentouCode = parentouCode;
    }

    @ElVoField(physicalName = "cnOrgFullName")
    public String getCnOrgFullName(){
        return cnOrgFullName;
    }

    @ElVoField(physicalName = "cnOrgFullName")
    public void setCnOrgFullName(String cnOrgFullName){
        this.cnOrgFullName = cnOrgFullName;
    }

    @ElVoField(physicalName = "ouLevel")
    public String getOuLevel(){
        return ouLevel;
    }

    @ElVoField(physicalName = "ouLevel")
    public void setOuLevel(String ouLevel){
        this.ouLevel = ouLevel;
    }

    @ElVoField(physicalName = "ouOrder")
    public String getOuOrder(){
        return ouOrder;
    }

    @ElVoField(physicalName = "ouOrder")
    public void setOuOrder(String ouOrder){
        this.ouOrder = ouOrder;
    }

    @ElVoField(physicalName = "topouCode")
    public String getTopouCode(){
        return topouCode;
    }

    @ElVoField(physicalName = "topouCode")
    public void setTopouCode(String topouCode){
        this.topouCode = topouCode;
    }

    @ElVoField(physicalName = "headouCode")
    public String getHeadouCode(){
        return headouCode;
    }

    @ElVoField(physicalName = "headouCode")
    public void setHeadouCode(String headouCode){
        this.headouCode = headouCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrgVo [");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("ouCode").append("=").append(ouCode).append(",");
        sb.append("bizouCode").append("=").append(bizouCode).append(",");
        sb.append("ou").append("=").append(ou).append(",");
        sb.append("parentouCode").append("=").append(parentouCode).append(",");
        sb.append("cnOrgFullName").append("=").append(cnOrgFullName).append(",");
        sb.append("ouLevel").append("=").append(ouLevel).append(",");
        sb.append("ouOrder").append("=").append(ouOrder).append(",");
        sb.append("topouCode").append("=").append(topouCode).append(",");
        sb.append("headouCode").append("=").append(headouCode);
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
