package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "Ldap 사용자(메뉴)")
public class UserVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public UserVo(){
    }

    @ElDtoField(logicalName = "시스템사번", physicalName = "sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sn;

    @ElDtoField(logicalName = "성명", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cn;

    @ElDtoField(logicalName = "계정명(username)", physicalName = "uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String uid;

    @ElDtoField(logicalName = "암호(password)", physicalName = "userPassword", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String userPassword;

    @ElDtoField(logicalName = "부서명", physicalName = "ou", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ou;

    @ElDtoField(logicalName = "부서코드", physicalName = "ouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouCode;

    @ElDtoField(logicalName = "부서레벨", physicalName = "ouLevel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ouLevel;

    @ElDtoField(logicalName = "상위부서코드", physicalName = "headouCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String headouCode;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "휴대폰번호", physicalName = "celphoneNumber", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String celphoneNumber;

    @ElDtoField(logicalName = "전화번호", physicalName = "officephoneNumber", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String officephoneNumber;

    @ElDtoField(logicalName = "이메일", physicalName = "mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail;

    @ElDtoField(logicalName = "근무지역", physicalName = "area", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area;

    @ElDtoField(logicalName = "마지막로그인일시", physicalName = "aclastlogintime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aclastlogintime;

    @ElDtoField(logicalName = "권한코드", physicalName = "roleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleCode;

    @ElDtoField(logicalName = "서비스코드", physicalName = "serviceCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceCode;

    @ElDtoField(logicalName = "제외서비스코드", physicalName = "nonServiceCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nonServiceCode;

    @ElDtoField(logicalName = "사용여부", physicalName = "useYN", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String useYN;

    @ElDtoField(logicalName = "사용자구분", physicalName = "workDiv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String workDiv;

    @ElVoField(physicalName = "sn")
    public String getSn(){
        return sn;
    }

    @ElVoField(physicalName = "sn")
    public void setSn(String sn){
        this.sn = sn;
    }

    @ElVoField(physicalName = "cn")
    public String getCn(){
        return cn;
    }

    @ElVoField(physicalName = "cn")
    public void setCn(String cn){
        this.cn = cn;
    }

    @ElVoField(physicalName = "uid")
    public String getUid(){
        return uid;
    }

    @ElVoField(physicalName = "uid")
    public void setUid(String uid){
        this.uid = uid;
    }

    @ElVoField(physicalName = "userPassword")
    public String getUserPassword(){
        return userPassword;
    }

    @ElVoField(physicalName = "userPassword")
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }

    @ElVoField(physicalName = "ou")
    public String getOu(){
        return ou;
    }

    @ElVoField(physicalName = "ou")
    public void setOu(String ou){
        this.ou = ou;
    }

    @ElVoField(physicalName = "ouCode")
    public String getOuCode(){
        return ouCode;
    }

    @ElVoField(physicalName = "ouCode")
    public void setOuCode(String ouCode){
        this.ouCode = ouCode;
    }

    @ElVoField(physicalName = "ouLevel")
    public String getOuLevel(){
        return ouLevel;
    }

    @ElVoField(physicalName = "ouLevel")
    public void setOuLevel(String ouLevel){
        this.ouLevel = ouLevel;
    }

    @ElVoField(physicalName = "headouCode")
    public String getHeadouCode(){
        return headouCode;
    }

    @ElVoField(physicalName = "headouCode")
    public void setHeadouCode(String headouCode){
        this.headouCode = headouCode;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "celphoneNumber")
    public String getCelphoneNumber(){
        return celphoneNumber;
    }

    @ElVoField(physicalName = "celphoneNumber")
    public void setCelphoneNumber(String celphoneNumber){
        this.celphoneNumber = celphoneNumber;
    }

    @ElVoField(physicalName = "officephoneNumber")
    public String getOfficephoneNumber(){
        return officephoneNumber;
    }

    @ElVoField(physicalName = "officephoneNumber")
    public void setOfficephoneNumber(String officephoneNumber){
        this.officephoneNumber = officephoneNumber;
    }

    @ElVoField(physicalName = "mail")
    public String getMail(){
        return mail;
    }

    @ElVoField(physicalName = "mail")
    public void setMail(String mail){
        this.mail = mail;
    }

    @ElVoField(physicalName = "area")
    public String getArea(){
        return area;
    }

    @ElVoField(physicalName = "area")
    public void setArea(String area){
        this.area = area;
    }

    @ElVoField(physicalName = "aclastlogintime")
    public String getAclastlogintime(){
        return aclastlogintime;
    }

    @ElVoField(physicalName = "aclastlogintime")
    public void setAclastlogintime(String aclastlogintime){
        this.aclastlogintime = aclastlogintime;
    }

    @ElVoField(physicalName = "roleCode")
    public String getRoleCode(){
        return roleCode;
    }

    @ElVoField(physicalName = "roleCode")
    public void setRoleCode(String roleCode){
        this.roleCode = roleCode;
    }

    @ElVoField(physicalName = "serviceCode")
    public String getServiceCode(){
        return serviceCode;
    }

    @ElVoField(physicalName = "serviceCode")
    public void setServiceCode(String serviceCode){
        this.serviceCode = serviceCode;
    }

    @ElVoField(physicalName = "nonServiceCode")
    public String getNonServiceCode(){
        return nonServiceCode;
    }

    @ElVoField(physicalName = "nonServiceCode")
    public void setNonServiceCode(String nonServiceCode){
        this.nonServiceCode = nonServiceCode;
    }

    @ElVoField(physicalName = "useYN")
    public String getUseYN(){
        return useYN;
    }

    @ElVoField(physicalName = "useYN")
    public void setUseYN(String useYN){
        this.useYN = useYN;
    }

    @ElVoField(physicalName = "workDiv")
    public String getWorkDiv(){
        return workDiv;
    }

    @ElVoField(physicalName = "workDiv")
    public void setWorkDiv(String workDiv){
        this.workDiv = workDiv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserVo [");
        sb.append("sn").append("=").append(sn).append(",");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("uid").append("=").append(uid).append(",");
        sb.append("userPassword").append("=").append(userPassword).append(",");
        sb.append("ou").append("=").append(ou).append(",");
        sb.append("ouCode").append("=").append(ouCode).append(",");
        sb.append("ouLevel").append("=").append(ouLevel).append(",");
        sb.append("headouCode").append("=").append(headouCode).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("celphoneNumber").append("=").append(celphoneNumber).append(",");
        sb.append("officephoneNumber").append("=").append(officephoneNumber).append(",");
        sb.append("mail").append("=").append(mail).append(",");
        sb.append("area").append("=").append(area).append(",");
        sb.append("aclastlogintime").append("=").append(aclastlogintime).append(",");
        sb.append("roleCode").append("=").append(roleCode).append(",");
        sb.append("serviceCode").append("=").append(serviceCode).append(",");
        sb.append("nonServiceCode").append("=").append(nonServiceCode).append(",");
        sb.append("useYN").append("=").append(useYN).append(",");
        sb.append("workDiv").append("=").append(workDiv);
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
