package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "콘도신청VO")
public class CgsCondoReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCondoReqVo(){
    }

    @ElDtoField(logicalName = "이용시작일자", physicalName = "use_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_ymd;

    @ElDtoField(logicalName = "이용종료일자", physicalName = "use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_ymd;

    @ElDtoField(logicalName = "입력신청번호", physicalName = "input_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_req_no;

    @ElDtoField(logicalName = "입력사원번호", physicalName = "input_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String input_emp_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psn_dept_cd;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "사원번호", physicalName = "emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_no;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "콘도명", physicalName = "condo_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_nm;

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "", physicalName = "condo_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_use_yn;

    @ElDtoField(logicalName = "이용객실개수", physicalName = "use_room_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_room_qty;

    @ElDtoField(logicalName = "useNght", physicalName = "use_nght", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_nght;

    @ElDtoField(logicalName = "useDay", physicalName = "use_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_day;

    @ElDtoField(logicalName = "방문기간", physicalName = "visit_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_term;

    @ElDtoField(logicalName = "이용자구분코드", physicalName = "use_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_clsf_cd;

    @ElDtoField(logicalName = "이용자명", physicalName = "use_psn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_clsf_nm;

    @ElDtoField(logicalName = "이용인원", physicalName = "use_hedcnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_hedcnt;

    @ElDtoField(logicalName = "예약번호", physicalName = "resv_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resv_no;

    @ElDtoField(logicalName = "이용예상금액", physicalName = "use_expct_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int use_expct_amt;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "신청상태명", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "등록자사원번호", physicalName = "regst_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_empno;

    @ElDtoField(logicalName = "등록자명", physicalName = "regst_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_nm;

    @ElDtoField(logicalName = "신청자사원번호", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "저장구분", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "이용금액", physicalName = "us_cost", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String us_cost;

    @ElDtoField(logicalName = "처리요청구분", physicalName = "req_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_flag;

    @ElDtoField(logicalName = "동작구분", physicalName = "req_action", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_action;

    @ElDtoField(logicalName = "반려사유", physicalName = "rejct_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rejct_resn;

    @ElDtoField(logicalName = "콘도홈페이지", physicalName = "condo_homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String condo_homepg;

    @ElVoField(physicalName = "use_start_ymd")
    public String getUse_start_ymd(){
        return use_start_ymd;
    }

    @ElVoField(physicalName = "use_start_ymd")
    public void setUse_start_ymd(String use_start_ymd){
        this.use_start_ymd = use_start_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public String getUse_cls_ymd(){
        return use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public void setUse_cls_ymd(String use_cls_ymd){
        this.use_cls_ymd = use_cls_ymd;
    }

    @ElVoField(physicalName = "input_req_no")
    public String getInput_req_no(){
        return input_req_no;
    }

    @ElVoField(physicalName = "input_req_no")
    public void setInput_req_no(String input_req_no){
        this.input_req_no = input_req_no;
    }

    @ElVoField(physicalName = "input_emp_no")
    public String getInput_emp_no(){
        return input_emp_no;
    }

    @ElVoField(physicalName = "input_emp_no")
    public void setInput_emp_no(String input_emp_no){
        this.input_emp_no = input_emp_no;
    }

    @ElVoField(physicalName = "psn_dept_cd")
    public String getPsn_dept_cd(){
        return psn_dept_cd;
    }

    @ElVoField(physicalName = "psn_dept_cd")
    public void setPsn_dept_cd(String psn_dept_cd){
        this.psn_dept_cd = psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "emp_no")
    public String getEmp_no(){
        return emp_no;
    }

    @ElVoField(physicalName = "emp_no")
    public void setEmp_no(String emp_no){
        this.emp_no = emp_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
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

    @ElVoField(physicalName = "condo_nm")
    public String getCondo_nm(){
        return condo_nm;
    }

    @ElVoField(physicalName = "condo_nm")
    public void setCondo_nm(String condo_nm){
        this.condo_nm = condo_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "condo_use_yn")
    public String getCondo_use_yn(){
        return condo_use_yn;
    }

    @ElVoField(physicalName = "condo_use_yn")
    public void setCondo_use_yn(String condo_use_yn){
        this.condo_use_yn = condo_use_yn;
    }

    @ElVoField(physicalName = "use_room_qty")
    public int getUse_room_qty(){
        return use_room_qty;
    }

    @ElVoField(physicalName = "use_room_qty")
    public void setUse_room_qty(int use_room_qty){
        this.use_room_qty = use_room_qty;
    }

    @ElVoField(physicalName = "use_nght")
    public int getUse_nght(){
        return use_nght;
    }

    @ElVoField(physicalName = "use_nght")
    public void setUse_nght(int use_nght){
        this.use_nght = use_nght;
    }

    @ElVoField(physicalName = "use_day")
    public String getUse_day(){
        return use_day;
    }

    @ElVoField(physicalName = "use_day")
    public void setUse_day(String use_day){
        this.use_day = use_day;
    }

    @ElVoField(physicalName = "visit_term")
    public String getVisit_term(){
        return visit_term;
    }

    @ElVoField(physicalName = "visit_term")
    public void setVisit_term(String visit_term){
        this.visit_term = visit_term;
    }

    @ElVoField(physicalName = "use_psn_clsf_cd")
    public String getUse_psn_clsf_cd(){
        return use_psn_clsf_cd;
    }

    @ElVoField(physicalName = "use_psn_clsf_cd")
    public void setUse_psn_clsf_cd(String use_psn_clsf_cd){
        this.use_psn_clsf_cd = use_psn_clsf_cd;
    }

    @ElVoField(physicalName = "use_psn_clsf_nm")
    public String getUse_psn_clsf_nm(){
        return use_psn_clsf_nm;
    }

    @ElVoField(physicalName = "use_psn_clsf_nm")
    public void setUse_psn_clsf_nm(String use_psn_clsf_nm){
        this.use_psn_clsf_nm = use_psn_clsf_nm;
    }

    @ElVoField(physicalName = "use_hedcnt")
    public int getUse_hedcnt(){
        return use_hedcnt;
    }

    @ElVoField(physicalName = "use_hedcnt")
    public void setUse_hedcnt(int use_hedcnt){
        this.use_hedcnt = use_hedcnt;
    }

    @ElVoField(physicalName = "resv_no")
    public String getResv_no(){
        return resv_no;
    }

    @ElVoField(physicalName = "resv_no")
    public void setResv_no(String resv_no){
        this.resv_no = resv_no;
    }

    @ElVoField(physicalName = "use_expct_amt")
    public int getUse_expct_amt(){
        return use_expct_amt;
    }

    @ElVoField(physicalName = "use_expct_amt")
    public void setUse_expct_amt(int use_expct_amt){
        this.use_expct_amt = use_expct_amt;
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

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "regst_psn_empno")
    public String getRegst_psn_empno(){
        return regst_psn_empno;
    }

    @ElVoField(physicalName = "regst_psn_empno")
    public void setRegst_psn_empno(String regst_psn_empno){
        this.regst_psn_empno = regst_psn_empno;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public String getRegst_psn_nm(){
        return regst_psn_nm;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public void setRegst_psn_nm(String regst_psn_nm){
        this.regst_psn_nm = regst_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "us_cost")
    public String getUs_cost(){
        return us_cost;
    }

    @ElVoField(physicalName = "us_cost")
    public void setUs_cost(String us_cost){
        this.us_cost = us_cost;
    }

    @ElVoField(physicalName = "req_flag")
    public String getReq_flag(){
        return req_flag;
    }

    @ElVoField(physicalName = "req_flag")
    public void setReq_flag(String req_flag){
        this.req_flag = req_flag;
    }

    @ElVoField(physicalName = "req_action")
    public String getReq_action(){
        return req_action;
    }

    @ElVoField(physicalName = "req_action")
    public void setReq_action(String req_action){
        this.req_action = req_action;
    }

    @ElVoField(physicalName = "rejct_resn")
    public String getRejct_resn(){
        return rejct_resn;
    }

    @ElVoField(physicalName = "rejct_resn")
    public void setRejct_resn(String rejct_resn){
        this.rejct_resn = rejct_resn;
    }

    @ElVoField(physicalName = "condo_homepg")
    public String getCondo_homepg(){
        return condo_homepg;
    }

    @ElVoField(physicalName = "condo_homepg")
    public void setCondo_homepg(String condo_homepg){
        this.condo_homepg = condo_homepg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCondoReqVo [");
        sb.append("use_start_ymd").append("=").append(use_start_ymd).append(",");
        sb.append("use_cls_ymd").append("=").append(use_cls_ymd).append(",");
        sb.append("input_req_no").append("=").append(input_req_no).append(",");
        sb.append("input_emp_no").append("=").append(input_emp_no).append(",");
        sb.append("psn_dept_cd").append("=").append(psn_dept_cd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("emp_no").append("=").append(emp_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("condo_nm").append("=").append(condo_nm).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("condo_use_yn").append("=").append(condo_use_yn).append(",");
        sb.append("use_room_qty").append("=").append(use_room_qty).append(",");
        sb.append("use_nght").append("=").append(use_nght).append(",");
        sb.append("use_day").append("=").append(use_day).append(",");
        sb.append("visit_term").append("=").append(visit_term).append(",");
        sb.append("use_psn_clsf_cd").append("=").append(use_psn_clsf_cd).append(",");
        sb.append("use_psn_clsf_nm").append("=").append(use_psn_clsf_nm).append(",");
        sb.append("use_hedcnt").append("=").append(use_hedcnt).append(",");
        sb.append("resv_no").append("=").append(resv_no).append(",");
        sb.append("use_expct_amt").append("=").append(use_expct_amt).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("regst_psn_empno").append("=").append(regst_psn_empno).append(",");
        sb.append("regst_psn_nm").append("=").append(regst_psn_nm).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("us_cost").append("=").append(us_cost).append(",");
        sb.append("req_flag").append("=").append(req_flag).append(",");
        sb.append("req_action").append("=").append(req_action).append(",");
        sb.append("rejct_resn").append("=").append(rejct_resn).append(",");
        sb.append("condo_homepg").append("=").append(condo_homepg);
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
