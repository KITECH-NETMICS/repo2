package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서 정보")
public class DeptInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DeptInfoVo(){
    }

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "부서영문명", physicalName = "dept_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_eng_nm;

    @ElDtoField(logicalName = "부서순번", physicalName = "disp_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disp_seq;

    @ElDtoField(logicalName = "부서레벨", physicalName = "dept_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_shape;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "본부코드", physicalName = "divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept;

    @ElDtoField(logicalName = "본부신설일", physicalName = "divsn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_new_ymd;

    @ElDtoField(logicalName = "본부명", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "부서정보", physicalName = "full_info", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private boolean full_info;

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "dept_eng_nm")
    public String getDept_eng_nm(){
        return dept_eng_nm;
    }

    @ElVoField(physicalName = "dept_eng_nm")
    public void setDept_eng_nm(String dept_eng_nm){
        this.dept_eng_nm = dept_eng_nm;
    }

    @ElVoField(physicalName = "disp_seq")
    public String getDisp_seq(){
        return disp_seq;
    }

    @ElVoField(physicalName = "disp_seq")
    public void setDisp_seq(String disp_seq){
        this.disp_seq = disp_seq;
    }

    @ElVoField(physicalName = "dept_shape")
    public String getDept_shape(){
        return dept_shape;
    }

    @ElVoField(physicalName = "dept_shape")
    public void setDept_shape(String dept_shape){
        this.dept_shape = dept_shape;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "divsn_dept")
    public String getDivsn_dept(){
        return divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept")
    public void setDivsn_dept(String divsn_dept){
        this.divsn_dept = divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept_new_ymd")
    public String getDivsn_dept_new_ymd(){
        return divsn_dept_new_ymd;
    }

    @ElVoField(physicalName = "divsn_dept_new_ymd")
    public void setDivsn_dept_new_ymd(String divsn_dept_new_ymd){
        this.divsn_dept_new_ymd = divsn_dept_new_ymd;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "full_info")
    public boolean isFull_info(){
        return full_info;
    }

    @ElVoField(physicalName = "full_info")
    public void setFull_info(boolean full_info){
        this.full_info = full_info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeptInfoVo [");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("dept_eng_nm").append("=").append(dept_eng_nm).append(",");
        sb.append("disp_seq").append("=").append(disp_seq).append(",");
        sb.append("dept_shape").append("=").append(dept_shape).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("divsn_dept").append("=").append(divsn_dept).append(",");
        sb.append("divsn_dept_new_ymd").append("=").append(divsn_dept_new_ymd).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("full_info").append("=").append(full_info);
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
