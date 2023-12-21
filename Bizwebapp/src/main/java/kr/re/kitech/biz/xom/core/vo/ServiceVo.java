package kr.re.kitech.biz.xom.core.vo;

import java.util.HashSet;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Ldap 서비스(메뉴)")
public class ServiceVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ServiceVo(){
    }

    // 복사 생성자
    public ServiceVo(ServiceVo other) {
        this.serviceCode = other.serviceCode;
        this.parentDivCode = other.parentDivCode;
        this.childNode = other.childNode;
        this.serviceLevel = other.serviceLevel;
        this.serviceOrder = other.serviceOrder;
        this.cn = other.cn;
        this.serviceUrl = other.serviceUrl;
        this.serviceNewUrl = other.serviceNewUrl;
        this.serviceID = other.serviceID;
        this.alias = other.alias;
        this.useYN = other.useYN;
        this.betaServiceYN = other.betaServiceYN;
        this.cnServiceFullName = other.cnServiceFullName;
        this.publicMenu = other.publicMenu;
    }

    @ElDtoField(logicalName = "서비스코드", physicalName = "serviceCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceCode;

    @ElDtoField(logicalName = "부모코드", physicalName = "parentDivCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String parentDivCode;

    @ElDtoField(logicalName = "자신유무", physicalName = "childNode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String childNode;

    @ElDtoField(logicalName = "레벨", physicalName = "serviceLevel", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int serviceLevel;

    @ElDtoField(logicalName = "정렬순서", physicalName = "serviceOrder", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int serviceOrder;

    @ElDtoField(logicalName = "메뉴명", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cn;

    @ElDtoField(logicalName = "EIP2-URL", physicalName = "serviceUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceUrl;

    @ElDtoField(logicalName = "EIP3-URL", physicalName = "serviceNewUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceNewUrl;

    @ElDtoField(logicalName = "서비스ID", physicalName = "serviceID", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceID;

    @ElDtoField(logicalName = "문서번호", physicalName = "alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String alias;

    @ElDtoField(logicalName = "사용유무(노출)", physicalName = "useYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String useYN;

    @ElDtoField(logicalName = "베타테스트유무", physicalName = "betaServiceYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String betaServiceYN;

    @ElDtoField(logicalName = "서비스 전체 이름", physicalName = "cnServiceFullName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cnServiceFullName;

    @ElDtoField(logicalName = "공용여부", physicalName = "publicMenu", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private boolean publicMenu;

    @ElDtoField(logicalName = "액세스가능자", physicalName = "accessors", type = "", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private HashSet<String> accessors = new HashSet<>();

    @ElVoField(physicalName = "serviceCode")
    public String getServiceCode(){
        String ret = this.serviceCode;
        return ret;
    }

    @ElVoField(physicalName = "serviceCode")
    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }

    @ElVoField(physicalName = "parentDivCode")
    public String getParentDivCode(){
        String ret = this.parentDivCode;
        return ret;
    }

    @ElVoField(physicalName = "parentDivCode")
    public void setParentDivCode(String parentDivCode){
        this.parentDivCode = parentDivCode;
    }

    @ElVoField(physicalName = "childNode")
    public String getChildNode(){
        String ret = this.childNode;
        return ret;
    }

    @ElVoField(physicalName = "childNode")
    public void setChildNode(String childNode){
        this.childNode = childNode;
    }

    @ElVoField(physicalName = "serviceLevel")
    public int getServiceLevel(){
        return serviceLevel;
    }

    @ElVoField(physicalName = "serviceLevel")
    public void setServiceLevel(int serviceLevel){
        this.serviceLevel = serviceLevel;
    }

    @ElVoField(physicalName = "serviceOrder")
    public int getServiceOrder(){
        return serviceOrder;
    }

    @ElVoField(physicalName = "serviceOrder")
    public void setServiceOrder(int serviceOrder){
        this.serviceOrder = serviceOrder;
    }

    @ElVoField(physicalName = "cn")
    public String getCn(){
        String ret = this.cn;
        return ret;
    }

    @ElVoField(physicalName = "cn")
    public void setCn(String cn){
        this.cn = cn;
    }

    @ElVoField(physicalName = "serviceUrl")
    public String getServiceUrl(){
        String ret = this.serviceUrl;
        return ret;
    }

    @ElVoField(physicalName = "serviceUrl")
    public void setServiceUrl(String serviceUrl){
        this.serviceUrl = serviceUrl;
    }

    @ElVoField(physicalName = "serviceNewUrl")
    public String getServiceNewUrl(){
        String ret = this.serviceNewUrl;
        return ret;
    }

    @ElVoField(physicalName = "serviceNewUrl")
    public void setServiceNewUrl(String serviceNewUrl){
        this.serviceNewUrl = serviceNewUrl;
    }

    @ElVoField(physicalName = "serviceID")
    public String getServiceID(){
        String ret = this.serviceID;
        return ret;
    }

    @ElVoField(physicalName = "serviceID")
    public void setServiceID(String serviceID){
        this.serviceID = serviceID;
    }

    @ElVoField(physicalName = "alias")
    public String getAlias(){
        String ret = this.alias;
        return ret;
    }

    @ElVoField(physicalName = "alias")
    public void setAlias(String alias){
        this.alias = alias;
    }

    @ElVoField(physicalName = "useYN")
    public String getUseYN(){
        String ret = this.useYN;
        return ret;
    }

    @ElVoField(physicalName = "useYN")
    public void setUseYN(String useYN){
        this.useYN = useYN;
    }

    @ElVoField(physicalName = "betaServiceYN")
    public String getBetaServiceYN(){
        String ret = this.betaServiceYN;
        return ret;
    }

    @ElVoField(physicalName = "betaServiceYN")
    public void setBetaServiceYN(String betaServiceYN){
        this.betaServiceYN = betaServiceYN;
    }

    @ElVoField(physicalName = "cnServiceFullName")
    public String getCnServiceFullName(){
        String ret = this.cnServiceFullName;
        return ret;
    }

    @ElVoField(physicalName = "cnServiceFullName")
    public void setCnServiceFullName(String cnServiceFullName){
        this.cnServiceFullName = cnServiceFullName;
    }

    @ElVoField(physicalName = "publicMenu")
    public boolean isPublicMenu(){
        return publicMenu;
    }

    @ElVoField(physicalName = "publicMenu")
    public void setPublicMenu(boolean publicMenu){
        this.publicMenu = publicMenu;
    }

    @ElVoField(physicalName = "accessors")
    public HashSet<String> getAccessors(){
        return accessors;
    }

    @ElVoField(physicalName = "accessors")
    public void setAccessors(HashSet<String> accessors){
        this.accessors = accessors;
    }

    public void addAccessor(String accessor){
        this.accessors.add( accessor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceVo [");
        sb.append("serviceCode").append("=").append(serviceCode).append(",");
        sb.append("parentDivCode").append("=").append(parentDivCode).append(",");
        sb.append("childNode").append("=").append(childNode).append(",");
        sb.append("serviceLevel").append("=").append(serviceLevel).append(",");
        sb.append("serviceOrder").append("=").append(serviceOrder).append(",");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("serviceUrl").append("=").append(serviceUrl).append(",");
        sb.append("serviceNewUrl").append("=").append(serviceNewUrl).append(",");
        sb.append("serviceID").append("=").append(serviceID).append(",");
        sb.append("alias").append("=").append(alias).append(",");
        sb.append("useYN").append("=").append(useYN).append(",");
        sb.append("betaServiceYN").append("=").append(betaServiceYN).append(",");
        sb.append("cnServiceFullName").append("=").append(cnServiceFullName).append(",");
        sb.append("public").append("=").append(publicMenu).append(",");
        sb.append("accessors").append("=").append(accessors);
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
