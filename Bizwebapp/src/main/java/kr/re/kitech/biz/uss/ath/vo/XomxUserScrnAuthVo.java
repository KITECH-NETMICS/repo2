package kr.re.kitech.biz.uss.ath.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사용자권한 화면 Vo")
public class XomxUserScrnAuthVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XomxUserScrnAuthVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "sys_pay_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_pay_no;

    @ElDtoField(logicalName = "서비스아이디", physicalName = "scrn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scrn_id;

    @ElDtoField(logicalName = "서비스명", physicalName = "scrn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scrn_nm;

    @ElDtoField(logicalName = "대분류코드", physicalName = "sys_bigclsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_bigclsf_cd;

    @ElDtoField(logicalName = "대분류명", physicalName = "sys_bigclsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_bigclsf_nm;

    @ElDtoField(logicalName = "서비스코드", physicalName = "ldap_svr_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ldap_svr_id;

    @ElDtoField(logicalName = "링크url", physicalName = "linkurl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String linkurl;

    @ElDtoField(logicalName = "c_right_yn", physicalName = "c_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String c_right_yn;

    @ElDtoField(logicalName = "r1_right_yn", physicalName = "r1_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String r1_right_yn;

    @ElDtoField(logicalName = "r2_right_yn", physicalName = "r2_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String r2_right_yn;

    @ElDtoField(logicalName = "r3_right_yn", physicalName = "r3_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String r3_right_yn;

    @ElDtoField(logicalName = "r4_right_yn", physicalName = "r4_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String r4_right_yn;

    @ElDtoField(logicalName = "u_right_yn", physicalName = "u_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String u_right_yn;

    @ElDtoField(logicalName = "d_right_yn", physicalName = "d_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String d_right_yn;

    @ElDtoField(logicalName = "e_right_yn", physicalName = "e_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String e_right_yn;

    @ElDtoField(logicalName = "p_right_yn", physicalName = "p_right_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String p_right_yn;

    @ElVoField(physicalName = "sys_pay_no")
    public String getSys_pay_no(){
        return sys_pay_no;
    }

    @ElVoField(physicalName = "sys_pay_no")
    public void setSys_pay_no(String sys_pay_no){
        this.sys_pay_no = sys_pay_no;
    }

    @ElVoField(physicalName = "scrn_id")
    public String getScrn_id(){
        return scrn_id;
    }

    @ElVoField(physicalName = "scrn_id")
    public void setScrn_id(String scrn_id){
        this.scrn_id = scrn_id;
    }

    @ElVoField(physicalName = "scrn_nm")
    public String getScrn_nm(){
        return scrn_nm;
    }

    @ElVoField(physicalName = "scrn_nm")
    public void setScrn_nm(String scrn_nm){
        this.scrn_nm = scrn_nm;
    }

    @ElVoField(physicalName = "sys_bigclsf_cd")
    public String getSys_bigclsf_cd(){
        return sys_bigclsf_cd;
    }

    @ElVoField(physicalName = "sys_bigclsf_cd")
    public void setSys_bigclsf_cd(String sys_bigclsf_cd){
        this.sys_bigclsf_cd = sys_bigclsf_cd;
    }

    @ElVoField(physicalName = "sys_bigclsf_nm")
    public String getSys_bigclsf_nm(){
        return sys_bigclsf_nm;
    }

    @ElVoField(physicalName = "sys_bigclsf_nm")
    public void setSys_bigclsf_nm(String sys_bigclsf_nm){
        this.sys_bigclsf_nm = sys_bigclsf_nm;
    }

    @ElVoField(physicalName = "ldap_svr_id")
    public String getLdap_svr_id(){
        return ldap_svr_id;
    }

    @ElVoField(physicalName = "ldap_svr_id")
    public void setLdap_svr_id(String ldap_svr_id){
        this.ldap_svr_id = ldap_svr_id;
    }

    @ElVoField(physicalName = "linkurl")
    public String getLinkurl(){
        return linkurl;
    }

    @ElVoField(physicalName = "linkurl")
    public void setLinkurl(String linkurl){
        this.linkurl = linkurl;
    }

    @ElVoField(physicalName = "c_right_yn")
    public String getC_right_yn(){
        return c_right_yn;
    }

    @ElVoField(physicalName = "c_right_yn")
    public void setC_right_yn(String c_right_yn){
        this.c_right_yn = c_right_yn;
    }

    @ElVoField(physicalName = "r1_right_yn")
    public String getR1_right_yn(){
        return r1_right_yn;
    }

    @ElVoField(physicalName = "r1_right_yn")
    public void setR1_right_yn(String r1_right_yn){
        this.r1_right_yn = r1_right_yn;
    }

    @ElVoField(physicalName = "r2_right_yn")
    public String getR2_right_yn(){
        return r2_right_yn;
    }

    @ElVoField(physicalName = "r2_right_yn")
    public void setR2_right_yn(String r2_right_yn){
        this.r2_right_yn = r2_right_yn;
    }

    @ElVoField(physicalName = "r3_right_yn")
    public String getR3_right_yn(){
        return r3_right_yn;
    }

    @ElVoField(physicalName = "r3_right_yn")
    public void setR3_right_yn(String r3_right_yn){
        this.r3_right_yn = r3_right_yn;
    }

    @ElVoField(physicalName = "r4_right_yn")
    public String getR4_right_yn(){
        return r4_right_yn;
    }

    @ElVoField(physicalName = "r4_right_yn")
    public void setR4_right_yn(String r4_right_yn){
        this.r4_right_yn = r4_right_yn;
    }

    @ElVoField(physicalName = "u_right_yn")
    public String getU_right_yn(){
        return u_right_yn;
    }

    @ElVoField(physicalName = "u_right_yn")
    public void setU_right_yn(String u_right_yn){
        this.u_right_yn = u_right_yn;
    }

    @ElVoField(physicalName = "d_right_yn")
    public String getD_right_yn(){
        return d_right_yn;
    }

    @ElVoField(physicalName = "d_right_yn")
    public void setD_right_yn(String d_right_yn){
        this.d_right_yn = d_right_yn;
    }

    @ElVoField(physicalName = "e_right_yn")
    public String getE_right_yn(){
        return e_right_yn;
    }

    @ElVoField(physicalName = "e_right_yn")
    public void setE_right_yn(String e_right_yn){
        this.e_right_yn = e_right_yn;
    }

    @ElVoField(physicalName = "p_right_yn")
    public String getP_right_yn(){
        return p_right_yn;
    }

    @ElVoField(physicalName = "p_right_yn")
    public void setP_right_yn(String p_right_yn){
        this.p_right_yn = p_right_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XomxUserScrnAuthVo [");
        sb.append("sys_pay_no").append("=").append(sys_pay_no).append(",");
        sb.append("scrn_id").append("=").append(scrn_id).append(",");
        sb.append("scrn_nm").append("=").append(scrn_nm).append(",");
        sb.append("sys_bigclsf_cd").append("=").append(sys_bigclsf_cd).append(",");
        sb.append("sys_bigclsf_nm").append("=").append(sys_bigclsf_nm).append(",");
        sb.append("ldap_svr_id").append("=").append(ldap_svr_id).append(",");
        sb.append("linkurl").append("=").append(linkurl).append(",");
        sb.append("c_right_yn").append("=").append(c_right_yn).append(",");
        sb.append("r1_right_yn").append("=").append(r1_right_yn).append(",");
        sb.append("r2_right_yn").append("=").append(r2_right_yn).append(",");
        sb.append("r3_right_yn").append("=").append(r3_right_yn).append(",");
        sb.append("r4_right_yn").append("=").append(r4_right_yn).append(",");
        sb.append("u_right_yn").append("=").append(u_right_yn).append(",");
        sb.append("d_right_yn").append("=").append(d_right_yn).append(",");
        sb.append("e_right_yn").append("=").append(e_right_yn).append(",");
        sb.append("p_right_yn").append("=").append(p_right_yn);
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
