package kr.re.kitech.biz.uss.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "IP신청 Vo")
public class ComBasIPReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComBasIPReqVo(){
    }

    @ElDtoField(logicalName = "aplyNo", physicalName = "aply_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_no;

    @ElDtoField(logicalName = "aplyClsf", physicalName = "aply_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_clsf;

    @ElDtoField(logicalName = "compChargSysPsnNo", physicalName = "comp_charg_sys_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_charg_sys_psn_no;

    @ElDtoField(logicalName = "useEx", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;

    @ElDtoField(logicalName = "aplySysPsnNo", physicalName = "aply_sys_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_sys_psn_no;

    @ElDtoField(logicalName = "aplyEmpNo", physicalName = "aply_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_empno;

    @ElDtoField(logicalName = "aplyPnsPosi", physicalName = "aply_pns_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_pns_posi;

    @ElDtoField(logicalName = "userId", physicalName = "user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_id;

    @ElDtoField(logicalName = "aplyPsnKrcharNm", physicalName = "aply_psn_krchar_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_psn_krchar_nm;

    @ElDtoField(logicalName = "aplyPsnEngNm", physicalName = "aply_psn_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_psn_eng_nm;

    @ElDtoField(logicalName = "blongDivsn", physicalName = "blong_divsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_divsn;

    @ElDtoField(logicalName = "blongDept", physicalName = "blong_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_dept;

    @ElDtoField(logicalName = "blongOfic", physicalName = "blong_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_ofic;

    @ElDtoField(logicalName = "oficRegion1", physicalName = "ofic_region_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_region_1;

    @ElDtoField(logicalName = "oficRegion2", physicalName = "ofic_region_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_region_2;

    @ElDtoField(logicalName = "oficRegion3", physicalName = "ofic_region_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_region_3;

    @ElDtoField(logicalName = "oficFax", physicalName = "ofic_fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_fax;

    @ElDtoField(logicalName = "oficTel", physicalName = "ofic_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_tel;

    @ElDtoField(logicalName = "aplyPsnMobileNo", physicalName = "aply_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_psn_mobile_no;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "attachFilePath", physicalName = "attach_file_path", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_path;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "bizwrkPrcsState", physicalName = "bizwrk_prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_prcs_state;

    @ElDtoField(logicalName = "apprvlPrcsState", physicalName = "apprvl_prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_prcs_state;

    @ElDtoField(logicalName = "aplyDaytm", physicalName = "aply_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_daytm;

    @ElDtoField(logicalName = "bizwrkDaytm", physicalName = "bizwrk_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_daytm;

    @ElDtoField(logicalName = "apprvlDaytm", physicalName = "apprvl_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_daytm;

    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElVoField(physicalName = "aply_no")
    public String getAply_no(){
        return aply_no;
    }

    @ElVoField(physicalName = "aply_no")
    public void setAply_no(String aply_no){
        this.aply_no = aply_no;
    }

    @ElVoField(physicalName = "aply_clsf")
    public String getAply_clsf(){
        return aply_clsf;
    }

    @ElVoField(physicalName = "aply_clsf")
    public void setAply_clsf(String aply_clsf){
        this.aply_clsf = aply_clsf;
    }

    @ElVoField(physicalName = "comp_charg_sys_psn_no")
    public String getComp_charg_sys_psn_no(){
        return comp_charg_sys_psn_no;
    }

    @ElVoField(physicalName = "comp_charg_sys_psn_no")
    public void setComp_charg_sys_psn_no(String comp_charg_sys_psn_no){
        this.comp_charg_sys_psn_no = comp_charg_sys_psn_no;
    }

    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }

    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }

    @ElVoField(physicalName = "aply_sys_psn_no")
    public String getAply_sys_psn_no(){
        return aply_sys_psn_no;
    }

    @ElVoField(physicalName = "aply_sys_psn_no")
    public void setAply_sys_psn_no(String aply_sys_psn_no){
        this.aply_sys_psn_no = aply_sys_psn_no;
    }

    @ElVoField(physicalName = "aply_empno")
    public String getAply_empno(){
        return aply_empno;
    }

    @ElVoField(physicalName = "aply_empno")
    public void setAply_empno(String aply_empno){
        this.aply_empno = aply_empno;
    }

    @ElVoField(physicalName = "aply_pns_posi")
    public String getAply_pns_posi(){
        return aply_pns_posi;
    }

    @ElVoField(physicalName = "aply_pns_posi")
    public void setAply_pns_posi(String aply_pns_posi){
        this.aply_pns_posi = aply_pns_posi;
    }

    @ElVoField(physicalName = "user_id")
    public String getUser_id(){
        return user_id;
    }

    @ElVoField(physicalName = "user_id")
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }

    @ElVoField(physicalName = "aply_psn_krchar_nm")
    public String getAply_psn_krchar_nm(){
        return aply_psn_krchar_nm;
    }

    @ElVoField(physicalName = "aply_psn_krchar_nm")
    public void setAply_psn_krchar_nm(String aply_psn_krchar_nm){
        this.aply_psn_krchar_nm = aply_psn_krchar_nm;
    }

    @ElVoField(physicalName = "aply_psn_eng_nm")
    public String getAply_psn_eng_nm(){
        return aply_psn_eng_nm;
    }

    @ElVoField(physicalName = "aply_psn_eng_nm")
    public void setAply_psn_eng_nm(String aply_psn_eng_nm){
        this.aply_psn_eng_nm = aply_psn_eng_nm;
    }

    @ElVoField(physicalName = "blong_divsn")
    public String getBlong_divsn(){
        return blong_divsn;
    }

    @ElVoField(physicalName = "blong_divsn")
    public void setBlong_divsn(String blong_divsn){
        this.blong_divsn = blong_divsn;
    }

    @ElVoField(physicalName = "blong_dept")
    public String getBlong_dept(){
        return blong_dept;
    }

    @ElVoField(physicalName = "blong_dept")
    public void setBlong_dept(String blong_dept){
        this.blong_dept = blong_dept;
    }

    @ElVoField(physicalName = "blong_ofic")
    public String getBlong_ofic(){
        return blong_ofic;
    }

    @ElVoField(physicalName = "blong_ofic")
    public void setBlong_ofic(String blong_ofic){
        this.blong_ofic = blong_ofic;
    }

    @ElVoField(physicalName = "ofic_region_1")
    public String getOfic_region_1(){
        return ofic_region_1;
    }

    @ElVoField(physicalName = "ofic_region_1")
    public void setOfic_region_1(String ofic_region_1){
        this.ofic_region_1 = ofic_region_1;
    }

    @ElVoField(physicalName = "ofic_region_2")
    public String getOfic_region_2(){
        return ofic_region_2;
    }

    @ElVoField(physicalName = "ofic_region_2")
    public void setOfic_region_2(String ofic_region_2){
        this.ofic_region_2 = ofic_region_2;
    }

    @ElVoField(physicalName = "ofic_region_3")
    public String getOfic_region_3(){
        return ofic_region_3;
    }

    @ElVoField(physicalName = "ofic_region_3")
    public void setOfic_region_3(String ofic_region_3){
        this.ofic_region_3 = ofic_region_3;
    }

    @ElVoField(physicalName = "ofic_fax")
    public String getOfic_fax(){
        return ofic_fax;
    }

    @ElVoField(physicalName = "ofic_fax")
    public void setOfic_fax(String ofic_fax){
        this.ofic_fax = ofic_fax;
    }

    @ElVoField(physicalName = "ofic_tel")
    public String getOfic_tel(){
        return ofic_tel;
    }

    @ElVoField(physicalName = "ofic_tel")
    public void setOfic_tel(String ofic_tel){
        this.ofic_tel = ofic_tel;
    }

    @ElVoField(physicalName = "aply_psn_mobile_no")
    public String getAply_psn_mobile_no(){
        return aply_psn_mobile_no;
    }

    @ElVoField(physicalName = "aply_psn_mobile_no")
    public void setAply_psn_mobile_no(String aply_psn_mobile_no){
        this.aply_psn_mobile_no = aply_psn_mobile_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_path")
    public String getAttach_file_path(){
        return attach_file_path;
    }

    @ElVoField(physicalName = "attach_file_path")
    public void setAttach_file_path(String attach_file_path){
        this.attach_file_path = attach_file_path;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state")
    public String getBizwrk_prcs_state(){
        return bizwrk_prcs_state;
    }

    @ElVoField(physicalName = "bizwrk_prcs_state")
    public void setBizwrk_prcs_state(String bizwrk_prcs_state){
        this.bizwrk_prcs_state = bizwrk_prcs_state;
    }

    @ElVoField(physicalName = "apprvl_prcs_state")
    public String getApprvl_prcs_state(){
        return apprvl_prcs_state;
    }

    @ElVoField(physicalName = "apprvl_prcs_state")
    public void setApprvl_prcs_state(String apprvl_prcs_state){
        this.apprvl_prcs_state = apprvl_prcs_state;
    }

    @ElVoField(physicalName = "aply_daytm")
    public String getAply_daytm(){
        return aply_daytm;
    }

    @ElVoField(physicalName = "aply_daytm")
    public void setAply_daytm(String aply_daytm){
        this.aply_daytm = aply_daytm;
    }

    @ElVoField(physicalName = "bizwrk_daytm")
    public String getBizwrk_daytm(){
        return bizwrk_daytm;
    }

    @ElVoField(physicalName = "bizwrk_daytm")
    public void setBizwrk_daytm(String bizwrk_daytm){
        this.bizwrk_daytm = bizwrk_daytm;
    }

    @ElVoField(physicalName = "apprvl_daytm")
    public String getApprvl_daytm(){
        return apprvl_daytm;
    }

    @ElVoField(physicalName = "apprvl_daytm")
    public void setApprvl_daytm(String apprvl_daytm){
        this.apprvl_daytm = apprvl_daytm;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComBasIPReqVo [");
        sb.append("aply_no").append("=").append(aply_no).append(",");
        sb.append("aply_clsf").append("=").append(aply_clsf).append(",");
        sb.append("comp_charg_sys_psn_no").append("=").append(comp_charg_sys_psn_no).append(",");
        sb.append("use_ex").append("=").append(use_ex).append(",");
        sb.append("aply_sys_psn_no").append("=").append(aply_sys_psn_no).append(",");
        sb.append("aply_empno").append("=").append(aply_empno).append(",");
        sb.append("aply_pns_posi").append("=").append(aply_pns_posi).append(",");
        sb.append("user_id").append("=").append(user_id).append(",");
        sb.append("aply_psn_krchar_nm").append("=").append(aply_psn_krchar_nm).append(",");
        sb.append("aply_psn_eng_nm").append("=").append(aply_psn_eng_nm).append(",");
        sb.append("blong_divsn").append("=").append(blong_divsn).append(",");
        sb.append("blong_dept").append("=").append(blong_dept).append(",");
        sb.append("blong_ofic").append("=").append(blong_ofic).append(",");
        sb.append("ofic_region_1").append("=").append(ofic_region_1).append(",");
        sb.append("ofic_region_2").append("=").append(ofic_region_2).append(",");
        sb.append("ofic_region_3").append("=").append(ofic_region_3).append(",");
        sb.append("ofic_fax").append("=").append(ofic_fax).append(",");
        sb.append("ofic_tel").append("=").append(ofic_tel).append(",");
        sb.append("aply_psn_mobile_no").append("=").append(aply_psn_mobile_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_path").append("=").append(attach_file_path).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("bizwrk_prcs_state").append("=").append(bizwrk_prcs_state).append(",");
        sb.append("apprvl_prcs_state").append("=").append(apprvl_prcs_state).append(",");
        sb.append("aply_daytm").append("=").append(aply_daytm).append(",");
        sb.append("bizwrk_daytm").append("=").append(bizwrk_daytm).append(",");
        sb.append("apprvl_daytm").append("=").append(apprvl_daytm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("email").append("=").append(email);
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
