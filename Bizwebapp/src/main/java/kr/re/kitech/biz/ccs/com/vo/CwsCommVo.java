package kr.re.kitech.biz.ccs.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재택근무신청")
public class CwsCommVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsCommVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "컬럼상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElDtoField(logicalName = "사원번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "요청사원번호", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String emp_no;

    @ElDtoField(logicalName = "사원명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "신청일수", physicalName = "req_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_day;

    @ElDtoField(logicalName = "신청사유", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cause;

    @ElDtoField(logicalName = "보안서명여부", physicalName = "secure_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String secure_yn;

    @ElDtoField(logicalName = "보안서명일자", physicalName = "secure_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String secure_daytm;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "재택근무장소", physicalName = "out_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String out_work_clsf;

    @ElDtoField(logicalName = "신청상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "재택근무장소_기타", physicalName = "out_work_clsf_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String out_work_clsf_etc;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직책명", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_nm;

    @ElDtoField(logicalName = "본부코드(검색)", physicalName = "divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String divsn_dept;

    @ElDtoField(logicalName = "본부명(검색)", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "부서코드(검색)", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서명(검색)", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "생성자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "생성일자", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "수정일자", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "지역담당자사번", physicalName = "auth_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String auth_syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        String ret = this.rowStatus;
        return ret;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        String ret = this.req_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "emp_no")
    public String getEmp_no(){
        String ret = this.emp_no;
        return ret;
    }

    @ElVoField(physicalName = "emp_no")
    public void setEmp_no(String emp_no){
        this.emp_no = emp_no;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        String ret = this.start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        String ret = this.cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "req_day")
    public String getReq_day(){
        String ret = this.req_day;
        return ret;
    }

    @ElVoField(physicalName = "req_day")
    public void setReq_day(String req_day){
        this.req_day = req_day;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        String ret = this.cause;
        return ret;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "secure_yn")
    public String getSecure_yn(){
        String ret = this.secure_yn;
        return ret;
    }

    @ElVoField(physicalName = "secure_yn")
    public void setSecure_yn(String secure_yn){
        this.secure_yn = secure_yn;
    }

    @ElVoField(physicalName = "secure_daytm")
    public String getSecure_daytm(){
        String ret = this.secure_daytm;
        return ret;
    }

    @ElVoField(physicalName = "secure_daytm")
    public void setSecure_daytm(String secure_daytm){
        this.secure_daytm = secure_daytm;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        String ret = this.attach_file_no;
        return ret;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "out_work_clsf")
    public String getOut_work_clsf(){
        String ret = this.out_work_clsf;
        return ret;
    }

    @ElVoField(physicalName = "out_work_clsf")
    public void setOut_work_clsf(String out_work_clsf){
        this.out_work_clsf = out_work_clsf;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        String ret = this.apr_state;
        return ret;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "out_work_clsf_etc")
    public String getOut_work_clsf_etc(){
        String ret = this.out_work_clsf_etc;
        return ret;
    }

    @ElVoField(physicalName = "out_work_clsf_etc")
    public void setOut_work_clsf_etc(String out_work_clsf_etc){
        this.out_work_clsf_etc = out_work_clsf_etc;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        String ret = this.duty_nm;
        return ret;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "divsn_dept")
    public String getDivsn_dept(){
        String ret = this.divsn_dept;
        return ret;
    }

    @ElVoField(physicalName = "divsn_dept")
    public void setDivsn_dept(String divsn_dept){
        this.divsn_dept = divsn_dept;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        String ret = this.divsn_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        String ret = this.dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        String ret = this.regst_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        String ret = this.regst_daytm;
        return ret;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        String ret = this.updt_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        String ret = this.updt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "auth_syspayno")
    public String getAuth_syspayno(){
        String ret = this.auth_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "auth_syspayno")
    public void setAuth_syspayno(String auth_syspayno){
        this.auth_syspayno = auth_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsCommVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("emp_no").append("=").append(emp_no).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("req_day").append("=").append(req_day).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("secure_yn").append("=").append(secure_yn).append(",");
        sb.append("secure_daytm").append("=").append(secure_daytm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("out_work_clsf").append("=").append(out_work_clsf).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("out_work_clsf_etc").append("=").append(out_work_clsf_etc).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("divsn_dept").append("=").append(divsn_dept).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("auth_syspayno").append("=").append(auth_syspayno);
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
