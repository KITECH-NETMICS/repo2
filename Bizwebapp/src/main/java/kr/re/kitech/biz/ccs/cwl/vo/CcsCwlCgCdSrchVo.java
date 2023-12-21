package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 조회조건")
public class CcsCwlCgCdSrchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlCgCdSrchVo(){
    }

    @ElDtoField(logicalName = "시작일", physicalName = "req_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd1;

    @ElDtoField(logicalName = "종료일", physicalName = "req_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd2;

    @ElDtoField(logicalName = "종류코드", physicalName = "cgncd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf;

    @ElDtoField(logicalName = "사원구분번호1", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "사원구분번호2", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "직책 구분코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서 구분코드", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "user_div", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "가족관계 구분코드", physicalName = "fam_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_relat;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "경조사비 신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElVoField(physicalName = "req_ymd1")
    public String getReq_ymd1(){
        return req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd1")
    public void setReq_ymd1(String req_ymd1){
        this.req_ymd1 = req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd2")
    public String getReq_ymd2(){
        return req_ymd2;
    }

    @ElVoField(physicalName = "req_ymd2")
    public void setReq_ymd2(String req_ymd2){
        this.req_ymd2 = req_ymd2;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public String getCgncd_clsf(){
        return cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public void setCgncd_clsf(String cgncd_clsf){
        this.cgncd_clsf = cgncd_clsf;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
    }

    @ElVoField(physicalName = "fam_relat")
    public String getFam_relat(){
        return fam_relat;
    }

    @ElVoField(physicalName = "fam_relat")
    public void setFam_relat(String fam_relat){
        this.fam_relat = fam_relat;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlCgCdSrchVo [");
        sb.append("req_ymd1").append("=").append(req_ymd1).append(",");
        sb.append("req_ymd2").append("=").append(req_ymd2).append(",");
        sb.append("cgncd_clsf").append("=").append(cgncd_clsf).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("fam_relat").append("=").append(fam_relat).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd);
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
