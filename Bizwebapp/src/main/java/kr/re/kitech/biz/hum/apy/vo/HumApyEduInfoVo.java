package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "포상경력신청 목록 정보")
public class HumApyEduInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyEduInfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태이름", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "기본신청유형", physicalName = "req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ;

    @ElDtoField(logicalName = "성명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "부서장시스템개인번호", physicalName = "depthed_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed_syspayno;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "본부장시스템개인번호", physicalName = "divsn_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_rspns_syspayno;

    @ElDtoField(logicalName = "map_prof", physicalName = "map_prof", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof;

    @ElDtoField(logicalName = "map_prof_syspayno", physicalName = "map_prof_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_syspayno;

    @ElDtoField(logicalName = "map_prof_nm", physicalName = "map_prof_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_nm;

    @ElDtoField(logicalName = "map_prof_emp_no", physicalName = "map_prof_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_emp_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_01;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "확보계획", physicalName = "secure_plan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secure_plan;

    @ElDtoField(logicalName = "plan_yn", physicalName = "plan_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plan_yn;

    @ElDtoField(logicalName = "map_prof_entr_ymd", physicalName = "map_prof_entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String map_prof_entr_ymd;

    @ElDtoField(logicalName = "학력", physicalName = "educ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ;

    @ElDtoField(logicalName = "입학년월", physicalName = "entsch_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_yrmon;

    @ElDtoField(logicalName = "졸업년월", physicalName = "gradt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gradt_yrmon;

    @ElDtoField(logicalName = "학교명", physicalName = "schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String schl_nm;

    @ElDtoField(logicalName = "전공", physicalName = "major", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major;

    @ElDtoField(logicalName = "상태", physicalName = "gradt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gradt_state;

    @ElDtoField(logicalName = "인정학력", physicalName = "apprvl_educ_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_educ_yn;

    @ElDtoField(logicalName = "학위", physicalName = "degr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String degr;

    @ElDtoField(logicalName = "논문명", physicalName = "paper_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm;

    @ElDtoField(logicalName = "lpnt", physicalName = "lpnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lpnt;

    @ElDtoField(logicalName = "소재지", physicalName = "loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loc;

    @ElDtoField(logicalName = "반려사유", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "ref_tab", physicalName = "ref_tab", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_tab;

    @ElDtoField(logicalName = "ref_data", physicalName = "ref_data", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_data;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "req_typ")
    public String getReq_typ(){
        return req_typ;
    }

    @ElVoField(physicalName = "req_typ")
    public void setReq_typ(String req_typ){
        this.req_typ = req_typ;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "depthed_syspayno")
    public String getDepthed_syspayno(){
        return depthed_syspayno;
    }

    @ElVoField(physicalName = "depthed_syspayno")
    public void setDepthed_syspayno(String depthed_syspayno){
        this.depthed_syspayno = depthed_syspayno;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public String getDivsn_rspns_syspayno(){
        return divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "divsn_rspns_syspayno")
    public void setDivsn_rspns_syspayno(String divsn_rspns_syspayno){
        this.divsn_rspns_syspayno = divsn_rspns_syspayno;
    }

    @ElVoField(physicalName = "map_prof")
    public String getMap_prof(){
        return map_prof;
    }

    @ElVoField(physicalName = "map_prof")
    public void setMap_prof(String map_prof){
        this.map_prof = map_prof;
    }

    @ElVoField(physicalName = "map_prof_syspayno")
    public String getMap_prof_syspayno(){
        return map_prof_syspayno;
    }

    @ElVoField(physicalName = "map_prof_syspayno")
    public void setMap_prof_syspayno(String map_prof_syspayno){
        this.map_prof_syspayno = map_prof_syspayno;
    }

    @ElVoField(physicalName = "map_prof_nm")
    public String getMap_prof_nm(){
        return map_prof_nm;
    }

    @ElVoField(physicalName = "map_prof_nm")
    public void setMap_prof_nm(String map_prof_nm){
        this.map_prof_nm = map_prof_nm;
    }

    @ElVoField(physicalName = "map_prof_emp_no")
    public String getMap_prof_emp_no(){
        return map_prof_emp_no;
    }

    @ElVoField(physicalName = "map_prof_emp_no")
    public void setMap_prof_emp_no(String map_prof_emp_no){
        this.map_prof_emp_no = map_prof_emp_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public String getAttach_file_no_01(){
        return attach_file_no_01;
    }

    @ElVoField(physicalName = "attach_file_no_01")
    public void setAttach_file_no_01(String attach_file_no_01){
        this.attach_file_no_01 = attach_file_no_01;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "secure_plan")
    public String getSecure_plan(){
        return secure_plan;
    }

    @ElVoField(physicalName = "secure_plan")
    public void setSecure_plan(String secure_plan){
        this.secure_plan = secure_plan;
    }

    @ElVoField(physicalName = "plan_yn")
    public String getPlan_yn(){
        return plan_yn;
    }

    @ElVoField(physicalName = "plan_yn")
    public void setPlan_yn(String plan_yn){
        this.plan_yn = plan_yn;
    }

    @ElVoField(physicalName = "map_prof_entr_ymd")
    public String getMap_prof_entr_ymd(){
        return map_prof_entr_ymd;
    }

    @ElVoField(physicalName = "map_prof_entr_ymd")
    public void setMap_prof_entr_ymd(String map_prof_entr_ymd){
        this.map_prof_entr_ymd = map_prof_entr_ymd;
    }

    @ElVoField(physicalName = "educ")
    public String getEduc(){
        return educ;
    }

    @ElVoField(physicalName = "educ")
    public void setEduc(String educ){
        this.educ = educ;
    }

    @ElVoField(physicalName = "entsch_yrmon")
    public String getEntsch_yrmon(){
        return entsch_yrmon;
    }

    @ElVoField(physicalName = "entsch_yrmon")
    public void setEntsch_yrmon(String entsch_yrmon){
        this.entsch_yrmon = entsch_yrmon;
    }

    @ElVoField(physicalName = "gradt_yrmon")
    public String getGradt_yrmon(){
        return gradt_yrmon;
    }

    @ElVoField(physicalName = "gradt_yrmon")
    public void setGradt_yrmon(String gradt_yrmon){
        this.gradt_yrmon = gradt_yrmon;
    }

    @ElVoField(physicalName = "schl_nm")
    public String getSchl_nm(){
        return schl_nm;
    }

    @ElVoField(physicalName = "schl_nm")
    public void setSchl_nm(String schl_nm){
        this.schl_nm = schl_nm;
    }

    @ElVoField(physicalName = "major")
    public String getMajor(){
        return major;
    }

    @ElVoField(physicalName = "major")
    public void setMajor(String major){
        this.major = major;
    }

    @ElVoField(physicalName = "gradt_state")
    public String getGradt_state(){
        return gradt_state;
    }

    @ElVoField(physicalName = "gradt_state")
    public void setGradt_state(String gradt_state){
        this.gradt_state = gradt_state;
    }

    @ElVoField(physicalName = "apprvl_educ_yn")
    public String getApprvl_educ_yn(){
        return apprvl_educ_yn;
    }

    @ElVoField(physicalName = "apprvl_educ_yn")
    public void setApprvl_educ_yn(String apprvl_educ_yn){
        this.apprvl_educ_yn = apprvl_educ_yn;
    }

    @ElVoField(physicalName = "degr")
    public String getDegr(){
        return degr;
    }

    @ElVoField(physicalName = "degr")
    public void setDegr(String degr){
        this.degr = degr;
    }

    @ElVoField(physicalName = "paper_nm")
    public String getPaper_nm(){
        return paper_nm;
    }

    @ElVoField(physicalName = "paper_nm")
    public void setPaper_nm(String paper_nm){
        this.paper_nm = paper_nm;
    }

    @ElVoField(physicalName = "lpnt")
    public String getLpnt(){
        return lpnt;
    }

    @ElVoField(physicalName = "lpnt")
    public void setLpnt(String lpnt){
        this.lpnt = lpnt;
    }

    @ElVoField(physicalName = "loc")
    public String getLoc(){
        return loc;
    }

    @ElVoField(physicalName = "loc")
    public void setLoc(String loc){
        this.loc = loc;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "ref_tab")
    public String getRef_tab(){
        return ref_tab;
    }

    @ElVoField(physicalName = "ref_tab")
    public void setRef_tab(String ref_tab){
        this.ref_tab = ref_tab;
    }

    @ElVoField(physicalName = "ref_data")
    public String getRef_data(){
        return ref_data;
    }

    @ElVoField(physicalName = "ref_data")
    public void setRef_data(String ref_data){
        this.ref_data = ref_data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyEduInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("req_typ").append("=").append(req_typ).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("depthed_syspayno").append("=").append(depthed_syspayno).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("divsn_rspns_syspayno").append("=").append(divsn_rspns_syspayno).append(",");
        sb.append("map_prof").append("=").append(map_prof).append(",");
        sb.append("map_prof_syspayno").append("=").append(map_prof_syspayno).append(",");
        sb.append("map_prof_nm").append("=").append(map_prof_nm).append(",");
        sb.append("map_prof_emp_no").append("=").append(map_prof_emp_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_no_01").append("=").append(attach_file_no_01).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("secure_plan").append("=").append(secure_plan).append(",");
        sb.append("plan_yn").append("=").append(plan_yn).append(",");
        sb.append("map_prof_entr_ymd").append("=").append(map_prof_entr_ymd).append(",");
        sb.append("educ").append("=").append(educ).append(",");
        sb.append("entsch_yrmon").append("=").append(entsch_yrmon).append(",");
        sb.append("gradt_yrmon").append("=").append(gradt_yrmon).append(",");
        sb.append("schl_nm").append("=").append(schl_nm).append(",");
        sb.append("major").append("=").append(major).append(",");
        sb.append("gradt_state").append("=").append(gradt_state).append(",");
        sb.append("apprvl_educ_yn").append("=").append(apprvl_educ_yn).append(",");
        sb.append("degr").append("=").append(degr).append(",");
        sb.append("paper_nm").append("=").append(paper_nm).append(",");
        sb.append("lpnt").append("=").append(lpnt).append(",");
        sb.append("loc").append("=").append(loc).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("ref_tab").append("=").append(ref_tab).append(",");
        sb.append("ref_data").append("=").append(ref_data);
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
