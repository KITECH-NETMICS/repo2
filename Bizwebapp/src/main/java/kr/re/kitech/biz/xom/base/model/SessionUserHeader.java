package kr.re.kitech.biz.xom.base.model;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import com.inswave.elfw.exception.ElException;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.log.AppLog;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "Y", delimeterYn = "", logicalName = "Session 유저 헤더")
public class SessionUserHeader extends com.inswave.elfw.core.UserHeader {
    private static final long serialVersionUID = 1L;

    private int _offset;

    public SessionUserHeader(){
        this._offset = 0;
    }

    public SessionUserHeader(int iOffset){
        this._offset = iOffset;
    }

    @ElDtoField(logicalName = "사용자ID", physicalName = "uid", type = "String", typeKind = "", fldYn = "Yes", delimeterYn = "Yes", cryptoGbn = "", cryptoKind = "", length = 10, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String uid;

    @ElDtoField(logicalName = "사용자이름", physicalName = "cn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cn;

    @ElDtoField(logicalName = "시스템사번", physicalName = "sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sn;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "부서코드", physicalName = "deptCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptCode;

    @ElDtoField(logicalName = "부서신설일", physicalName = "deptNewYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptNewYmd;

    @ElDtoField(logicalName = "부서명", physicalName = "deptName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptName;

    @ElDtoField(logicalName = "부서레벨", physicalName = "deptLevel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String deptLevel;

    @ElDtoField(logicalName = "본부코드", physicalName = "dvsnCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dvsnCode;

    @ElDtoField(logicalName = "본부신설일", physicalName = "dvsnNewYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dvsnNewYmd;

    @ElDtoField(logicalName = "본부명", physicalName = "dvsnName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dvsnName;

    @ElDtoField(logicalName = "직급코드", physicalName = "posiCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posiCode;

    @ElDtoField(logicalName = "직급명", physicalName = "posiName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posiName;

    @ElDtoField(logicalName = "근태코드", physicalName = "cmmtCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cmmtCode;

    @ElDtoField(logicalName = "근태코드명", physicalName = "cmmtName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cmmtName;

    @ElDtoField(logicalName = "직책코드", physicalName = "dutyCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dutyCode;

    @ElDtoField(logicalName = "직책명", physicalName = "dutyName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dutyName;

    @ElDtoField(logicalName = "근무상태", physicalName = "workClsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String workClsf;

    @ElDtoField(logicalName = "근무지코드", physicalName = "areaCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String areaCode;

    @ElDtoField(logicalName = "근무지명", physicalName = "areaName", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String areaName;

    @ElDtoField(logicalName = "메일주소", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String email;

    @ElDtoField(logicalName = "휴대전화번호", physicalName = "phone", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String phone;

    @ElDtoField(logicalName = "롤코드", physicalName = "roleCode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String roleCode;

    @ElDtoField(logicalName = "퍼미션코드", physicalName = "permission", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String permission;

    @ElDtoField(logicalName = "BIZ서비스ID", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String serviceId;

    @ElDtoField(logicalName = "BIZ서비스URL", physicalName = "redirectUrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String redirectUrl;

    @ElDtoField(logicalName = "문서ID", physicalName = "docId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String docId;

    @ElDtoField(logicalName = "베타서비스IDS", physicalName = "betaService", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "false", desc = "", attr = "")
    private String betaService = "false";

    @ElDtoField(logicalName = "bpm토큰", physicalName = "bpmToken", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bpmToken;

    @ElDtoField(logicalName = "eip토큰", physicalName = "eipToken", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String eipToken;

    @ElVoField(physicalName = "uid")
    public String getUid(){
        String ret = this.uid;
        return ret;
    }

    @ElVoField(physicalName = "uid")
    public void setUid(String uid){
        this.uid = uid;
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

    @ElVoField(physicalName = "sn")
    public String getSn(){
        String ret = this.sn;
        return ret;
    }

    @ElVoField(physicalName = "sn")
    public void setSn(String sn){
        this.sn = sn;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "deptCode")
    public String getDeptCode(){
        String ret = this.deptCode;
        return ret;
    }

    @ElVoField(physicalName = "deptCode")
    public void setDeptCode(String deptCode){
        this.deptCode = deptCode;
    }

    @ElVoField(physicalName = "deptNewYmd")
    public String getDeptNewYmd(){
        String ret = this.deptNewYmd;
        return ret;
    }

    @ElVoField(physicalName = "deptNewYmd")
    public void setDeptNewYmd(String deptNewYmd){
        this.deptNewYmd = deptNewYmd;
    }

    @ElVoField(physicalName = "deptName")
    public String getDeptName(){
        String ret = this.deptName;
        return ret;
    }

    @ElVoField(physicalName = "deptName")
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }

    @ElVoField(physicalName = "deptLevel")
    public String getDeptLevel(){
        String ret = this.deptLevel;
        return ret;
    }

    @ElVoField(physicalName = "deptLevel")
    public void setDeptLevel(String deptLevel){
        this.deptLevel = deptLevel;
    }

    @ElVoField(physicalName = "dvsnCode")
    public String getDvsnCode(){
        String ret = this.dvsnCode;
        return ret;
    }

    @ElVoField(physicalName = "dvsnCode")
    public void setDvsnCode(String dvsnCode){
        this.dvsnCode = dvsnCode;
    }

    @ElVoField(physicalName = "dvsnNewYmd")
    public String getDvsnNewYmd(){
        String ret = this.dvsnNewYmd;
        return ret;
    }

    @ElVoField(physicalName = "dvsnNewYmd")
    public void setDvsnNewYmd(String dvsnNewYmd){
        this.dvsnNewYmd = dvsnNewYmd;
    }

    @ElVoField(physicalName = "dvsnName")
    public String getDvsnName(){
        String ret = this.dvsnName;
        return ret;
    }

    @ElVoField(physicalName = "dvsnName")
    public void setDvsnName(String dvsnName){
        this.dvsnName = dvsnName;
    }

    @ElVoField(physicalName = "posiCode")
    public String getPosiCode(){
        String ret = this.posiCode;
        return ret;
    }

    @ElVoField(physicalName = "posiCode")
    public void setPosiCode(String posiCode){
        this.posiCode = posiCode;
    }

    @ElVoField(physicalName = "posiName")
    public String getPosiName(){
        String ret = this.posiName;
        return ret;
    }

    @ElVoField(physicalName = "posiName")
    public void setPosiName(String posiName){
        this.posiName = posiName;
    }

    @ElVoField(physicalName = "cmmtCode")
    public String getCmmtCode(){
        String ret = this.cmmtCode;
        return ret;
    }

    @ElVoField(physicalName = "cmmtCode")
    public void setCmmtCode(String cmmtCode){
        this.cmmtCode = cmmtCode;
    }

    @ElVoField(physicalName = "cmmtName")
    public String getCmmtName(){
        String ret = this.cmmtName;
        return ret;
    }

    @ElVoField(physicalName = "cmmtName")
    public void setCmmtName(String cmmtName){
        this.cmmtName = cmmtName;
    }

    @ElVoField(physicalName = "dutyCode")
    public String getDutyCode(){
        String ret = this.dutyCode;
        return ret;
    }

    @ElVoField(physicalName = "dutyCode")
    public void setDutyCode(String dutyCode){
        this.dutyCode = dutyCode;
    }

    @ElVoField(physicalName = "dutyName")
    public String getDutyName(){
        String ret = this.dutyName;
        return ret;
    }

    @ElVoField(physicalName = "dutyName")
    public void setDutyName(String dutyName){
        this.dutyName = dutyName;
    }

    @ElVoField(physicalName = "workClsf")
    public String getWorkClsf(){
        String ret = this.workClsf;
        return ret;
    }

    @ElVoField(physicalName = "workClsf")
    public void setWorkClsf(String workClsf){
        this.workClsf = workClsf;
    }

    @ElVoField(physicalName = "areaCode")
    public String getAreaCode(){
        String ret = this.areaCode;
        return ret;
    }

    @ElVoField(physicalName = "areaCode")
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    @ElVoField(physicalName = "areaName")
    public String getAreaName(){
        String ret = this.areaName;
        return ret;
    }

    @ElVoField(physicalName = "areaName")
    public void setAreaName(String areaName){
        this.areaName = areaName;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        String ret = this.email;
        return ret;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "phone")
    public String getPhone(){
        String ret = this.phone;
        return ret;
    }

    @ElVoField(physicalName = "phone")
    public void setPhone(String phone){
        this.phone = phone;
    }

    @ElVoField(physicalName = "roleCode")
    public String getRoleCode(){
        String ret = this.roleCode;
        return ret;
    }

    @ElVoField(physicalName = "roleCode")
    public void setRoleCode(String roleCode){
        this.roleCode = roleCode;
    }

    @ElVoField(physicalName = "permission")
    public String getPermission(){
        String ret = this.permission;
        return ret;
    }

    @ElVoField(physicalName = "permission")
    public void setPermission(String permission){
        this.permission = permission;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        String ret = this.serviceId;
        return ret;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "redirectUrl")
    public String getRedirectUrl(){
        String ret = this.redirectUrl;
        return ret;
    }

    @ElVoField(physicalName = "redirectUrl")
    public void setRedirectUrl(String redirectUrl){
        this.redirectUrl = redirectUrl;
    }

    @ElVoField(physicalName = "docId")
    public String getDocId(){
        String ret = this.docId;
        return ret;
    }

    @ElVoField(physicalName = "docId")
    public void setDocId(String docId){
        this.docId = docId;
    }

    @ElVoField(physicalName = "betaService")
    public String getBetaService(){
        String ret = this.betaService;
        return ret;
    }

    @ElVoField(physicalName = "betaService")
    public void setBetaService(String betaService){
        this.betaService = betaService;
    }

    @ElVoField(physicalName = "bpmToken")
    public String getBpmToken(){
        String ret = this.bpmToken;
        return ret;
    }

    @ElVoField(physicalName = "bpmToken")
    public void setBpmToken(String bpmToken){
        this.bpmToken = bpmToken;
    }

    @ElVoField(physicalName = "eipToken")
    public String getEipToken(){
        String ret = this.eipToken;
        return ret;
    }

    @ElVoField(physicalName = "eipToken")
    public void setEipToken(String eipToken){
        this.eipToken = eipToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionUserHeader [");
        sb.append("uid").append("=").append(uid).append(",");
        sb.append("cn").append("=").append(cn).append(",");
        sb.append("sn").append("=").append(sn).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("deptCode").append("=").append(deptCode).append(",");
        sb.append("deptNewYmd").append("=").append(deptNewYmd).append(",");
        sb.append("deptName").append("=").append(deptName).append(",");
        sb.append("deptLevel").append("=").append(deptLevel).append(",");
        sb.append("dvsnCode").append("=").append(dvsnCode).append(",");
        sb.append("dvsnNewYmd").append("=").append(dvsnNewYmd).append(",");
        sb.append("dvsnName").append("=").append(dvsnName).append(",");
        sb.append("posiCode").append("=").append(posiCode).append(",");
        sb.append("posiName").append("=").append(posiName).append(",");
        sb.append("cmmtCode").append("=").append(cmmtCode).append(",");
        sb.append("cmmtName").append("=").append(cmmtName).append(",");
        sb.append("dutyCode").append("=").append(dutyCode).append(",");
        sb.append("dutyName").append("=").append(dutyName).append(",");
        sb.append("workClsf").append("=").append(workClsf).append(",");
        sb.append("areaCode").append("=").append(areaCode).append(",");
        sb.append("areaName").append("=").append(areaName).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("phone").append("=").append(phone).append(",");
        sb.append("roleCode").append("=").append(roleCode).append(",");
        sb.append("permission").append("=").append(permission).append(",");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("redirectUrl").append("=").append(redirectUrl).append(",");
        sb.append("docId").append("=").append(docId).append(",");
        sb.append("betaService").append("=").append(betaService).append(",");
        sb.append("bpmToken").append("=").append(bpmToken).append(",");
        sb.append("eipToken").append("=").append(eipToken);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return true;
    }

    public byte[] marshalFld() throws IOException{
        return marshalFld( com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

	public byte[] marshalFld(String encode) throws IOException{
    	ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(bout);
            out.write( com.inswave.elfw.util.TypeConversionUtil.strToSpBytes(this.uid , 10, encode ) );
        } catch (IOException e) {
                AppLog.error("marshalFld Error:["+ toString()+"]", e);
                throw e;
        } finally {
            try	{
                if (out != null) out.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld out close Error", ie);
           }
            try	{
                if (bout != null) bout.close();
           } catch (IOException ie) {
                AppLog.error("marshalFld bout close Error", ie);
           }
        }
        return bout.toByteArray();
    }

    public void unMarshalFld( byte[] bytes ) throws ElException{
        unMarshalFld( bytes, com.inswave.elfw.ElConfig.getFldEncode() ); 
    }

    public void unMarshalFld( byte[] bytes , String encode) throws ElException{
        try{ 
            this.uid = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, _offset, 10, encode );
             _offset += 10;
        }catch(ElException e) { 
            String errorLine = com.inswave.elfw.util.TypeConversionUtil.getTrimmedString( bytes, 0, bytes.length, encode );
            AppLog.error("unMarshalFld Error:["+ errorLine+"]", e);
            throw e;
        } 
    }

    public int getOffset(){
        return _offset;
    }

    public int getFixedTotalLength(){
        return 10;
    }

    @Override
    public void _xStreamEnc() {
    }


    @Override
    public void _xStreamDec() {
    }


}
