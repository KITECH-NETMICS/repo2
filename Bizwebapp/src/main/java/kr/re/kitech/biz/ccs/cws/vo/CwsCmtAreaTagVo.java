package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출퇴근인증VO")
public class CwsCmtAreaTagVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsCmtAreaTagVo(){
    }

    @ElDtoField(logicalName = "인증시스템개인번호", physicalName = "tag_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_syspayno;

    @ElDtoField(logicalName = "현재위도", physicalName = "tag_hor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_hor;

    @ElDtoField(logicalName = "현재경도", physicalName = "tag_ver", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_ver;

    @ElDtoField(logicalName = "현재주소", physicalName = "tag_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_addr;

    @ElDtoField(logicalName = "통근구분코드", physicalName = "gps_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gps_clsf;

    @ElDtoField(logicalName = "유효태그여부", physicalName = "is_valid", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean is_valid;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "작성자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "통근지역번호", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "유효태그여부명", physicalName = "valid_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String valid_nm;

    @ElDtoField(logicalName = "인증일자", physicalName = "tag_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tag_ymd;

    @ElVoField(physicalName = "tag_syspayno")
    public String getTag_syspayno(){
        return tag_syspayno;
    }

    @ElVoField(physicalName = "tag_syspayno")
    public void setTag_syspayno(String tag_syspayno){
        this.tag_syspayno = tag_syspayno;
    }

    @ElVoField(physicalName = "tag_hor")
    public String getTag_hor(){
        return tag_hor;
    }

    @ElVoField(physicalName = "tag_hor")
    public void setTag_hor(String tag_hor){
        this.tag_hor = tag_hor;
    }

    @ElVoField(physicalName = "tag_ver")
    public String getTag_ver(){
        return tag_ver;
    }

    @ElVoField(physicalName = "tag_ver")
    public void setTag_ver(String tag_ver){
        this.tag_ver = tag_ver;
    }

    @ElVoField(physicalName = "tag_addr")
    public String getTag_addr(){
        return tag_addr;
    }

    @ElVoField(physicalName = "tag_addr")
    public void setTag_addr(String tag_addr){
        this.tag_addr = tag_addr;
    }

    @ElVoField(physicalName = "gps_clsf")
    public String getGps_clsf(){
        return gps_clsf;
    }

    @ElVoField(physicalName = "gps_clsf")
    public void setGps_clsf(String gps_clsf){
        this.gps_clsf = gps_clsf;
    }

    @ElVoField(physicalName = "is_valid")
    public boolean isIs_valid(){
        return is_valid;
    }

    @ElVoField(physicalName = "is_valid")
    public void setIs_valid(boolean is_valid){
        this.is_valid = is_valid;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }

    @ElVoField(physicalName = "valid_nm")
    public String getValid_nm(){
        return valid_nm;
    }

    @ElVoField(physicalName = "valid_nm")
    public void setValid_nm(String valid_nm){
        this.valid_nm = valid_nm;
    }

    @ElVoField(physicalName = "tag_ymd")
    public String getTag_ymd(){
        return tag_ymd;
    }

    @ElVoField(physicalName = "tag_ymd")
    public void setTag_ymd(String tag_ymd){
        this.tag_ymd = tag_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsCmtAreaTagVo [");
        sb.append("tag_syspayno").append("=").append(tag_syspayno).append(",");
        sb.append("tag_hor").append("=").append(tag_hor).append(",");
        sb.append("tag_ver").append("=").append(tag_ver).append(",");
        sb.append("tag_addr").append("=").append(tag_addr).append(",");
        sb.append("gps_clsf").append("=").append(gps_clsf).append(",");
        sb.append("is_valid").append("=").append(is_valid).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("valid_nm").append("=").append(valid_nm).append(",");
        sb.append("tag_ymd").append("=").append(tag_ymd);
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
