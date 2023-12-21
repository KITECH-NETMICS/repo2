package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "보유자산VO")
public class AssetsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssetsVo(){
    }

    @ElDtoField(logicalName = "사용자시스템개인번호", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "자산번호", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_no;

    @ElDtoField(logicalName = "자산분류", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "aset_typ", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_typ;

    @ElDtoField(logicalName = "intro_ymd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "intro_amt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String intro_amt;

    @ElDtoField(logicalName = "aset_state", physicalName = "aset_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_state;

    @ElDtoField(logicalName = "자산분류명", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "couse_clsf", physicalName = "couse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String couse_clsf;

    @ElDtoField(logicalName = "개인공용구분", physicalName = "couse_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String couse_clsf_nm;

    @ElDtoField(logicalName = "자산명", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String aset_nm;

    @ElDtoField(logicalName = "사용자개인번호", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String user_empno;

    @ElDtoField(logicalName = "사용자성명", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String user_nm;

    @ElDtoField(logicalName = "사용자내선번호", physicalName = "user_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String user_ext_no;

    @ElDtoField(logicalName = "사용자핸드폰번호", physicalName = "user_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String user_mobile;

    @ElDtoField(logicalName = "posi_region", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_region;

    @ElDtoField(logicalName = "posi_region_nm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_region_nm;

    @ElDtoField(logicalName = "posi_build", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_build;

    @ElDtoField(logicalName = "posi_build_nm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_build_nm;

    @ElDtoField(logicalName = "posi_floor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_floor;

    @ElDtoField(logicalName = "posi_detls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_detls;

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        String ret = this.user_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        String ret = this.aset_no;
        return ret;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        String ret = this.aset_clsf;
        return ret;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        String ret = this.aset_typ;
        return ret;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        String ret = this.intro_ymd;
        return ret;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        String ret = this.intro_amt;
        return ret;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "aset_state")
    public String getAset_state(){
        String ret = this.aset_state;
        return ret;
    }

    @ElVoField(physicalName = "aset_state")
    public void setAset_state(String aset_state){
        this.aset_state = aset_state;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        String ret = this.aset_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "couse_clsf")
    public String getCouse_clsf(){
        String ret = this.couse_clsf;
        return ret;
    }

    @ElVoField(physicalName = "couse_clsf")
    public void setCouse_clsf(String couse_clsf){
        this.couse_clsf = couse_clsf;
    }

    @ElVoField(physicalName = "couse_clsf_nm")
    public String getCouse_clsf_nm(){
        String ret = this.couse_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "couse_clsf_nm")
    public void setCouse_clsf_nm(String couse_clsf_nm){
        this.couse_clsf_nm = couse_clsf_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        String ret = this.aset_nm;
        return ret;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        String ret = this.user_empno;
        return ret;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        String ret = this.user_nm;
        return ret;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_ext_no")
    public String getUser_ext_no(){
        String ret = this.user_ext_no;
        return ret;
    }

    @ElVoField(physicalName = "user_ext_no")
    public void setUser_ext_no(String user_ext_no){
        this.user_ext_no = user_ext_no;
    }

    @ElVoField(physicalName = "user_mobile")
    public String getUser_mobile(){
        String ret = this.user_mobile;
        return ret;
    }

    @ElVoField(physicalName = "user_mobile")
    public void setUser_mobile(String user_mobile){
        this.user_mobile = user_mobile;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        String ret = this.posi_region;
        return ret;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public String getPosi_region_nm(){
        String ret = this.posi_region_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public void setPosi_region_nm(String posi_region_nm){
        this.posi_region_nm = posi_region_nm;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        String ret = this.posi_build;
        return ret;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public String getPosi_build_nm(){
        String ret = this.posi_build_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public void setPosi_build_nm(String posi_build_nm){
        this.posi_build_nm = posi_build_nm;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        String ret = this.posi_floor;
        return ret;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        String ret = this.posi_detls;
        return ret;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssetsVo [");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("aset_state").append("=").append(aset_state).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("couse_clsf").append("=").append(couse_clsf).append(",");
        sb.append("couse_clsf_nm").append("=").append(couse_clsf_nm).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_ext_no").append("=").append(user_ext_no).append(",");
        sb.append("user_mobile").append("=").append(user_mobile).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls);
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
