package kr.re.kitech.biz.ccs.csf.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "보안안전교육Vo")
public class CsfSecrtEduVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CsfSecrtEduVo(){
    }

    @ElDtoField(logicalName = "year", physicalName = "year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year;

    @ElDtoField(logicalName = "educ_psn_nm", physicalName = "educ_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_psn_nm;

    @ElDtoField(logicalName = "educ_psn_empno", physicalName = "educ_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_psn_empno;

    @ElDtoField(logicalName = "educ_psn_syspayno", physicalName = "educ_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_psn_syspayno;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "search_div", physicalName = "search_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String search_div;

    @ElDtoField(logicalName = "educ_typ", physicalName = "educ_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ;

    @ElDtoField(logicalName = "educ_knd", physicalName = "educ_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_knd;

    @ElDtoField(logicalName = "educ_ymd", physicalName = "educ_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_ymd;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "work_region", physicalName = "work_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_region;

    @ElDtoField(logicalName = "educ_knd_grp", physicalName = "educ_knd_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_knd_grp;

    @ElDtoField(logicalName = "complt_time", physicalName = "complt_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_time;

    @ElDtoField(logicalName = "educ_time", physicalName = "educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_time;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "job_flag", physicalName = "job_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_flag;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "work_region_nm", physicalName = "work_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_region_nm;

    @ElDtoField(logicalName = "educ_typ_nm", physicalName = "educ_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ_nm;

    @ElDtoField(logicalName = "educ_knd_nm", physicalName = "educ_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_knd_nm;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "retire_ymd", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "cd_nm", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "educ_cd", physicalName = "educ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd;

    @ElVoField(physicalName = "year")
    public String getYear(){
        return year;
    }

    @ElVoField(physicalName = "year")
    public void setYear(String year){
        this.year = year;
    }

    @ElVoField(physicalName = "educ_psn_nm")
    public String getEduc_psn_nm(){
        return educ_psn_nm;
    }

    @ElVoField(physicalName = "educ_psn_nm")
    public void setEduc_psn_nm(String educ_psn_nm){
        this.educ_psn_nm = educ_psn_nm;
    }

    @ElVoField(physicalName = "educ_psn_empno")
    public String getEduc_psn_empno(){
        return educ_psn_empno;
    }

    @ElVoField(physicalName = "educ_psn_empno")
    public void setEduc_psn_empno(String educ_psn_empno){
        this.educ_psn_empno = educ_psn_empno;
    }

    @ElVoField(physicalName = "educ_psn_syspayno")
    public String getEduc_psn_syspayno(){
        return educ_psn_syspayno;
    }

    @ElVoField(physicalName = "educ_psn_syspayno")
    public void setEduc_psn_syspayno(String educ_psn_syspayno){
        this.educ_psn_syspayno = educ_psn_syspayno;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "search_div")
    public String getSearch_div(){
        return search_div;
    }

    @ElVoField(physicalName = "search_div")
    public void setSearch_div(String search_div){
        this.search_div = search_div;
    }

    @ElVoField(physicalName = "educ_typ")
    public String getEduc_typ(){
        return educ_typ;
    }

    @ElVoField(physicalName = "educ_typ")
    public void setEduc_typ(String educ_typ){
        this.educ_typ = educ_typ;
    }

    @ElVoField(physicalName = "educ_knd")
    public String getEduc_knd(){
        return educ_knd;
    }

    @ElVoField(physicalName = "educ_knd")
    public void setEduc_knd(String educ_knd){
        this.educ_knd = educ_knd;
    }

    @ElVoField(physicalName = "educ_ymd")
    public String getEduc_ymd(){
        return educ_ymd;
    }

    @ElVoField(physicalName = "educ_ymd")
    public void setEduc_ymd(String educ_ymd){
        this.educ_ymd = educ_ymd;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "work_region")
    public String getWork_region(){
        return work_region;
    }

    @ElVoField(physicalName = "work_region")
    public void setWork_region(String work_region){
        this.work_region = work_region;
    }

    @ElVoField(physicalName = "educ_knd_grp")
    public String getEduc_knd_grp(){
        return educ_knd_grp;
    }

    @ElVoField(physicalName = "educ_knd_grp")
    public void setEduc_knd_grp(String educ_knd_grp){
        this.educ_knd_grp = educ_knd_grp;
    }

    @ElVoField(physicalName = "complt_time")
    public String getComplt_time(){
        return complt_time;
    }

    @ElVoField(physicalName = "complt_time")
    public void setComplt_time(String complt_time){
        this.complt_time = complt_time;
    }

    @ElVoField(physicalName = "educ_time")
    public String getEduc_time(){
        return educ_time;
    }

    @ElVoField(physicalName = "educ_time")
    public void setEduc_time(String educ_time){
        this.educ_time = educ_time;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "job_flag")
    public String getJob_flag(){
        return job_flag;
    }

    @ElVoField(physicalName = "job_flag")
    public void setJob_flag(String job_flag){
        this.job_flag = job_flag;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "work_region_nm")
    public String getWork_region_nm(){
        return work_region_nm;
    }

    @ElVoField(physicalName = "work_region_nm")
    public void setWork_region_nm(String work_region_nm){
        this.work_region_nm = work_region_nm;
    }

    @ElVoField(physicalName = "educ_typ_nm")
    public String getEduc_typ_nm(){
        return educ_typ_nm;
    }

    @ElVoField(physicalName = "educ_typ_nm")
    public void setEduc_typ_nm(String educ_typ_nm){
        this.educ_typ_nm = educ_typ_nm;
    }

    @ElVoField(physicalName = "educ_knd_nm")
    public String getEduc_knd_nm(){
        return educ_knd_nm;
    }

    @ElVoField(physicalName = "educ_knd_nm")
    public void setEduc_knd_nm(String educ_knd_nm){
        this.educ_knd_nm = educ_knd_nm;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public String getRetire_ymd(){
        return retire_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public void setRetire_ymd(String retire_ymd){
        this.retire_ymd = retire_ymd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "educ_cd")
    public String getEduc_cd(){
        return educ_cd;
    }

    @ElVoField(physicalName = "educ_cd")
    public void setEduc_cd(String educ_cd){
        this.educ_cd = educ_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CsfSecrtEduVo [");
        sb.append("year").append("=").append(year).append(",");
        sb.append("educ_psn_nm").append("=").append(educ_psn_nm).append(",");
        sb.append("educ_psn_empno").append("=").append(educ_psn_empno).append(",");
        sb.append("educ_psn_syspayno").append("=").append(educ_psn_syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("search_div").append("=").append(search_div).append(",");
        sb.append("educ_typ").append("=").append(educ_typ).append(",");
        sb.append("educ_knd").append("=").append(educ_knd).append(",");
        sb.append("educ_ymd").append("=").append(educ_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("work_region").append("=").append(work_region).append(",");
        sb.append("educ_knd_grp").append("=").append(educ_knd_grp).append(",");
        sb.append("complt_time").append("=").append(complt_time).append(",");
        sb.append("educ_time").append("=").append(educ_time).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("job_flag").append("=").append(job_flag).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("work_region_nm").append("=").append(work_region_nm).append(",");
        sb.append("educ_typ_nm").append("=").append(educ_typ_nm).append(",");
        sb.append("educ_knd_nm").append("=").append(educ_knd_nm).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("educ_cd").append("=").append(educ_cd);
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
