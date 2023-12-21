package kr.re.kitech.biz.ass.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산검색팝업 Vo")
public class AssMastrHPopVo extends kr.re.kitech.biz.ass.com.vo.AssMastrHVo {
    private static final long serialVersionUID = 1L;

    public AssMastrHPopVo(){
    }

    @ElDtoField(logicalName = "시간당장비사용료", physicalName = "equip_use_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long equip_use_fee;

    @ElDtoField(logicalName = "사용용도", physicalName = "usg_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_desc;

    @ElDtoField(logicalName = "제우스장비번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "사용자성명", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "사용자개인번호", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "지역구분", physicalName = "region_centr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_centr;

    @ElDtoField(logicalName = "업무구분", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "실험실코드(기업지원)", physicalName = "lab_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_cd;

    @ElDtoField(logicalName = "위치지역", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;

    @ElDtoField(logicalName = "위치건물", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;

    @ElDtoField(logicalName = "위치층", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;

    @ElDtoField(logicalName = "위치상세", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;

    @ElDtoField(logicalName = "공용구분", physicalName = "couse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf;

    @ElDtoField(logicalName = "위치건물명", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;

    @ElVoField(physicalName = "equip_use_fee")
    public long getEquip_use_fee(){
        return equip_use_fee;
    }

    @ElVoField(physicalName = "equip_use_fee")
    public void setEquip_use_fee(long equip_use_fee){
        this.equip_use_fee = equip_use_fee;
    }

    @ElVoField(physicalName = "usg_desc")
    public String getUsg_desc(){
        return usg_desc;
    }

    @ElVoField(physicalName = "usg_desc")
    public void setUsg_desc(String usg_desc){
        this.usg_desc = usg_desc;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "region_centr")
    public String getRegion_centr(){
        return region_centr;
    }

    @ElVoField(physicalName = "region_centr")
    public void setRegion_centr(String region_centr){
        this.region_centr = region_centr;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "lab_cd")
    public String getLab_cd(){
        return lab_cd;
    }

    @ElVoField(physicalName = "lab_cd")
    public void setLab_cd(String lab_cd){
        this.lab_cd = lab_cd;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @ElVoField(physicalName = "couse_clsf")
    public String getCouse_clsf(){
        return couse_clsf;
    }

    @ElVoField(physicalName = "couse_clsf")
    public void setCouse_clsf(String couse_clsf){
        this.couse_clsf = couse_clsf;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public String getPosi_build_nm(){
        return posi_build_nm;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public void setPosi_build_nm(String posi_build_nm){
        this.posi_build_nm = posi_build_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssMastrHPopVo [");
        sb.append("equip_use_fee").append("=").append(equip_use_fee).append(",");
        sb.append("usg_desc").append("=").append(usg_desc).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("region_centr").append("=").append(region_centr).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("lab_cd").append("=").append(lab_cd).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls).append(",");
        sb.append("couse_clsf").append("=").append(couse_clsf).append(",");
        sb.append("posi_build_nm").append("=").append(posi_build_nm);
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
