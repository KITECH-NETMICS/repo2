package kr.re.kitech.biz.uss.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "IP신청 자산Vo")
public class ComBasIPReqAssVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ComBasIPReqAssVo(){
    }

    @ElDtoField(logicalName = "aplyno", physicalName = "aply_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_no;

    @ElDtoField(logicalName = "aplytype", physicalName = "aply_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_type;

    @ElDtoField(logicalName = "asetno", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "asetnm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "asettype", physicalName = "aset_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_type;

    @ElDtoField(logicalName = "asetusg", physicalName = "aset_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_usg;

    @ElDtoField(logicalName = "asetregion1", physicalName = "aset_region_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_region_1;

    @ElDtoField(logicalName = "asetregion2", physicalName = "aset_region_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_region_2;

    @ElDtoField(logicalName = "asetregion3", physicalName = "aset_region_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_region_3;

    @ElDtoField(logicalName = "oprsys", physicalName = "opr_sys", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String opr_sys;

    @ElDtoField(logicalName = "etc", physicalName = "etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc;

    @ElDtoField(logicalName = "aplyip", physicalName = "aply_ip", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_ip;

    @ElDtoField(logicalName = "ipaddr", physicalName = "ip_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ip_addr;

    @ElDtoField(logicalName = "submask", physicalName = "sub_mask", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_mask;

    @ElDtoField(logicalName = "gateway", physicalName = "gateway", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gateway;

    @ElDtoField(logicalName = "basedns", physicalName = "base_dns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_dns;

    @ElDtoField(logicalName = "subdns", physicalName = "sub_dns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_dns;

    @ElDtoField(logicalName = "usenmfull", physicalName = "use_nm_full", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_nm_full;

    @ElDtoField(logicalName = "deptnm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "usesyspayno", physicalName = "use_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_syspayno;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "usesyspaynm", physicalName = "use_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_syspaynm;

    @ElDtoField(logicalName = "useempno", physicalName = "use_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_empno;

    @ElDtoField(logicalName = "resultopn", physicalName = "result_opn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result_opn;

    @ElDtoField(logicalName = "chk", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElVoField(physicalName = "aply_no")
    public String getAply_no(){
        return aply_no;
    }

    @ElVoField(physicalName = "aply_no")
    public void setAply_no(String aply_no){
        this.aply_no = aply_no;
    }

    @ElVoField(physicalName = "aply_type")
    public String getAply_type(){
        return aply_type;
    }

    @ElVoField(physicalName = "aply_type")
    public void setAply_type(String aply_type){
        this.aply_type = aply_type;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "aset_type")
    public String getAset_type(){
        return aset_type;
    }

    @ElVoField(physicalName = "aset_type")
    public void setAset_type(String aset_type){
        this.aset_type = aset_type;
    }

    @ElVoField(physicalName = "aset_usg")
    public String getAset_usg(){
        return aset_usg;
    }

    @ElVoField(physicalName = "aset_usg")
    public void setAset_usg(String aset_usg){
        this.aset_usg = aset_usg;
    }

    @ElVoField(physicalName = "aset_region_1")
    public String getAset_region_1(){
        return aset_region_1;
    }

    @ElVoField(physicalName = "aset_region_1")
    public void setAset_region_1(String aset_region_1){
        this.aset_region_1 = aset_region_1;
    }

    @ElVoField(physicalName = "aset_region_2")
    public String getAset_region_2(){
        return aset_region_2;
    }

    @ElVoField(physicalName = "aset_region_2")
    public void setAset_region_2(String aset_region_2){
        this.aset_region_2 = aset_region_2;
    }

    @ElVoField(physicalName = "aset_region_3")
    public String getAset_region_3(){
        return aset_region_3;
    }

    @ElVoField(physicalName = "aset_region_3")
    public void setAset_region_3(String aset_region_3){
        this.aset_region_3 = aset_region_3;
    }

    @ElVoField(physicalName = "opr_sys")
    public String getOpr_sys(){
        return opr_sys;
    }

    @ElVoField(physicalName = "opr_sys")
    public void setOpr_sys(String opr_sys){
        this.opr_sys = opr_sys;
    }

    @ElVoField(physicalName = "etc")
    public String getEtc(){
        return etc;
    }

    @ElVoField(physicalName = "etc")
    public void setEtc(String etc){
        this.etc = etc;
    }

    @ElVoField(physicalName = "aply_ip")
    public String getAply_ip(){
        return aply_ip;
    }

    @ElVoField(physicalName = "aply_ip")
    public void setAply_ip(String aply_ip){
        this.aply_ip = aply_ip;
    }

    @ElVoField(physicalName = "ip_addr")
    public String getIp_addr(){
        return ip_addr;
    }

    @ElVoField(physicalName = "ip_addr")
    public void setIp_addr(String ip_addr){
        this.ip_addr = ip_addr;
    }

    @ElVoField(physicalName = "sub_mask")
    public String getSub_mask(){
        return sub_mask;
    }

    @ElVoField(physicalName = "sub_mask")
    public void setSub_mask(String sub_mask){
        this.sub_mask = sub_mask;
    }

    @ElVoField(physicalName = "gateway")
    public String getGateway(){
        return gateway;
    }

    @ElVoField(physicalName = "gateway")
    public void setGateway(String gateway){
        this.gateway = gateway;
    }

    @ElVoField(physicalName = "base_dns")
    public String getBase_dns(){
        return base_dns;
    }

    @ElVoField(physicalName = "base_dns")
    public void setBase_dns(String base_dns){
        this.base_dns = base_dns;
    }

    @ElVoField(physicalName = "sub_dns")
    public String getSub_dns(){
        return sub_dns;
    }

    @ElVoField(physicalName = "sub_dns")
    public void setSub_dns(String sub_dns){
        this.sub_dns = sub_dns;
    }

    @ElVoField(physicalName = "use_nm_full")
    public String getUse_nm_full(){
        return use_nm_full;
    }

    @ElVoField(physicalName = "use_nm_full")
    public void setUse_nm_full(String use_nm_full){
        this.use_nm_full = use_nm_full;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "use_syspayno")
    public String getUse_syspayno(){
        return use_syspayno;
    }

    @ElVoField(physicalName = "use_syspayno")
    public void setUse_syspayno(String use_syspayno){
        this.use_syspayno = use_syspayno;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "use_syspaynm")
    public String getUse_syspaynm(){
        return use_syspaynm;
    }

    @ElVoField(physicalName = "use_syspaynm")
    public void setUse_syspaynm(String use_syspaynm){
        this.use_syspaynm = use_syspaynm;
    }

    @ElVoField(physicalName = "use_empno")
    public String getUse_empno(){
        return use_empno;
    }

    @ElVoField(physicalName = "use_empno")
    public void setUse_empno(String use_empno){
        this.use_empno = use_empno;
    }

    @ElVoField(physicalName = "result_opn")
    public String getResult_opn(){
        return result_opn;
    }

    @ElVoField(physicalName = "result_opn")
    public void setResult_opn(String result_opn){
        this.result_opn = result_opn;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComBasIPReqAssVo [");
        sb.append("aply_no").append("=").append(aply_no).append(",");
        sb.append("aply_type").append("=").append(aply_type).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("aset_type").append("=").append(aset_type).append(",");
        sb.append("aset_usg").append("=").append(aset_usg).append(",");
        sb.append("aset_region_1").append("=").append(aset_region_1).append(",");
        sb.append("aset_region_2").append("=").append(aset_region_2).append(",");
        sb.append("aset_region_3").append("=").append(aset_region_3).append(",");
        sb.append("opr_sys").append("=").append(opr_sys).append(",");
        sb.append("etc").append("=").append(etc).append(",");
        sb.append("aply_ip").append("=").append(aply_ip).append(",");
        sb.append("ip_addr").append("=").append(ip_addr).append(",");
        sb.append("sub_mask").append("=").append(sub_mask).append(",");
        sb.append("gateway").append("=").append(gateway).append(",");
        sb.append("base_dns").append("=").append(base_dns).append(",");
        sb.append("sub_dns").append("=").append(sub_dns).append(",");
        sb.append("use_nm_full").append("=").append(use_nm_full).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("use_syspayno").append("=").append(use_syspayno).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("use_syspaynm").append("=").append(use_syspaynm).append(",");
        sb.append("use_empno").append("=").append(use_empno).append(",");
        sb.append("result_opn").append("=").append(result_opn).append(",");
        sb.append("chk").append("=").append(chk);
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
