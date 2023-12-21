package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 사용자 검색")
public class AprUserVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprUserVo(){
    }

    @ElDtoField(logicalName = "아이디", physicalName = "empcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empcode;

    @ElDtoField(logicalName = "사번", physicalName = "empsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empsn;

    @ElDtoField(logicalName = "성명", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empname;

    @ElDtoField(logicalName = "직무명", physicalName = "jikname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String jikname;

    @ElDtoField(logicalName = "직무코드", physicalName = "jikcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String jikcd;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String email;

    @ElDtoField(logicalName = "부서코드", physicalName = "partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partcode;

    @ElDtoField(logicalName = "부서명", physicalName = "partname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partname;

    @ElDtoField(logicalName = "직급", physicalName = "empposition", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empposition;

    @ElDtoField(logicalName = "지역", physicalName = "locale", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String locale;

    @ElDtoField(logicalName = "결재타입", physicalName = "apld_apltype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_apltype;

    @ElDtoField(logicalName = "결재시간", physicalName = "endTime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String endTime;

    @ElDtoField(logicalName = "결재유형", physicalName = "autoApproval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "자동결재여부", attr = "")
    private String autoApproval;

    @ElVoField(physicalName = "empcode")
    public String getEmpcode(){
        String ret = this.empcode;
        return ret;
    }

    @ElVoField(physicalName = "empcode")
    public void setEmpcode(String empcode){
        this.empcode = empcode;
    }

    @ElVoField(physicalName = "empsn")
    public String getEmpsn(){
        String ret = this.empsn;
        return ret;
    }

    @ElVoField(physicalName = "empsn")
    public void setEmpsn(String empsn){
        this.empsn = empsn;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        String ret = this.empname;
        return ret;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "jikname")
    public String getJikname(){
        String ret = this.jikname;
        return ret;
    }

    @ElVoField(physicalName = "jikname")
    public void setJikname(String jikname){
        this.jikname = jikname;
    }

    @ElVoField(physicalName = "jikcd")
    public String getJikcd(){
        String ret = this.jikcd;
        return ret;
    }

    @ElVoField(physicalName = "jikcd")
    public void setJikcd(String jikcd){
        this.jikcd = jikcd;
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

    @ElVoField(physicalName = "partcode")
    public String getPartcode(){
        String ret = this.partcode;
        return ret;
    }

    @ElVoField(physicalName = "partcode")
    public void setPartcode(String partcode){
        this.partcode = partcode;
    }

    @ElVoField(physicalName = "partname")
    public String getPartname(){
        String ret = this.partname;
        return ret;
    }

    @ElVoField(physicalName = "partname")
    public void setPartname(String partname){
        this.partname = partname;
    }

    @ElVoField(physicalName = "empposition")
    public String getEmpposition(){
        String ret = this.empposition;
        return ret;
    }

    @ElVoField(physicalName = "empposition")
    public void setEmpposition(String empposition){
        this.empposition = empposition;
    }

    @ElVoField(physicalName = "locale")
    public String getLocale(){
        String ret = this.locale;
        return ret;
    }

    @ElVoField(physicalName = "locale")
    public void setLocale(String locale){
        this.locale = locale;
    }

    @ElVoField(physicalName = "apld_apltype")
    public String getApld_apltype(){
        String ret = this.apld_apltype;
        return ret;
    }

    @ElVoField(physicalName = "apld_apltype")
    public void setApld_apltype(String apld_apltype){
        this.apld_apltype = apld_apltype;
    }

    @ElVoField(physicalName = "endTime")
    public String getEndTime(){
        String ret = this.endTime;
        return ret;
    }

    @ElVoField(physicalName = "endTime")
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }

    @ElVoField(physicalName = "autoApproval")
    public String getAutoApproval(){
        String ret = this.autoApproval;
        return ret;
    }

    @ElVoField(physicalName = "autoApproval")
    public void setAutoApproval(String autoApproval){
        this.autoApproval = autoApproval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprUserVo [");
        sb.append("empcode").append("=").append(empcode).append(",");
        sb.append("empsn").append("=").append(empsn).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("jikname").append("=").append(jikname).append(",");
        sb.append("jikcd").append("=").append(jikcd).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("partcode").append("=").append(partcode).append(",");
        sb.append("partname").append("=").append(partname).append(",");
        sb.append("empposition").append("=").append(empposition).append(",");
        sb.append("locale").append("=").append(locale).append(",");
        sb.append("apld_apltype").append("=").append(apld_apltype).append(",");
        sb.append("endTime").append("=").append(endTime).append(",");
        sb.append("autoApproval").append("=").append(autoApproval);
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
