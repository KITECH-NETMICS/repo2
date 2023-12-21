package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴복직신청 정보")
public class HumApyLndInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyLndInfoVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "결재상태코드", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "reqYmdFrom", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "reqYmdTo", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "신청유형코드", physicalName = "req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ;

    @ElDtoField(logicalName = "직무구분코드", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "신청유형명", physicalName = "req_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_typ_nm;

    @ElDtoField(logicalName = "휴직기간", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "휴직일", physicalName = "month_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_no;

    @ElDtoField(logicalName = "복직일", physicalName = "combk_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combk_ymd;

    @ElDtoField(logicalName = "복직부서코드", physicalName = "combk_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combk_dept_cd;

    @ElDtoField(logicalName = "복직부서명", physicalName = "combk_dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combk_dept_cd_nm;

    @ElDtoField(logicalName = "직무구분명", physicalName = "job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf_nm;

    @ElDtoField(logicalName = "apr_state_cd", physicalName = "apr_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_cd;

    @ElDtoField(logicalName = "ttoff_orign_ymd", physicalName = "ttoff_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ttoff_orign_ymd;

    @ElDtoField(logicalName = "ttoff_cls_ymd", physicalName = "ttoff_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ttoff_cls_ymd;

    @ElDtoField(logicalName = "combk_dept_nm", physicalName = "combk_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combk_dept_nm;

    @ElDtoField(logicalName = "combk_dept_new_ymd", physicalName = "combk_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String combk_dept_new_ymd;

    @ElDtoField(logicalName = "사유", physicalName = "resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resn;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "저장타입", physicalName = "save_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_type;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElDtoField(logicalName = "sh_dept_nm", physicalName = "sh_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_dept_nm;

    @ElDtoField(logicalName = "sh_posi_nm", physicalName = "sh_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_posi_nm;

    @ElDtoField(logicalName = "sh_nm", physicalName = "sh_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_nm;

    @ElDtoField(logicalName = "sh_job_clsf_nm", physicalName = "sh_job_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_job_clsf_nm;

    @ElDtoField(logicalName = "sh_req_typ_nm", physicalName = "sh_req_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_req_typ_nm;

    @ElDtoField(logicalName = "sh_req_typ", physicalName = "sh_req_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_req_typ;

    @ElDtoField(logicalName = "sh_combk_ymd", physicalName = "sh_combk_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_combk_ymd;

    @ElDtoField(logicalName = "sh_combk_dept_nm", physicalName = "sh_combk_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_combk_dept_nm;

    @ElDtoField(logicalName = "sh_ttoff_orign_ymd", physicalName = "sh_ttoff_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_ttoff_orign_ymd;

    @ElDtoField(logicalName = "sh_month_no", physicalName = "sh_month_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_month_no;

    @ElDtoField(logicalName = "sh_resn", physicalName = "sh_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sh_resn;

    @ElDtoField(logicalName = "반려사유", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
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

    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }

    @ElVoField(physicalName = "req_typ")
    public String getReq_typ(){
        return req_typ;
    }

    @ElVoField(physicalName = "req_typ")
    public void setReq_typ(String req_typ){
        this.req_typ = req_typ;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
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

    @ElVoField(physicalName = "req_typ_nm")
    public String getReq_typ_nm(){
        return req_typ_nm;
    }

    @ElVoField(physicalName = "req_typ_nm")
    public void setReq_typ_nm(String req_typ_nm){
        this.req_typ_nm = req_typ_nm;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "month_no")
    public String getMonth_no(){
        return month_no;
    }

    @ElVoField(physicalName = "month_no")
    public void setMonth_no(String month_no){
        this.month_no = month_no;
    }

    @ElVoField(physicalName = "combk_ymd")
    public String getCombk_ymd(){
        return combk_ymd;
    }

    @ElVoField(physicalName = "combk_ymd")
    public void setCombk_ymd(String combk_ymd){
        this.combk_ymd = combk_ymd;
    }

    @ElVoField(physicalName = "combk_dept_cd")
    public String getCombk_dept_cd(){
        return combk_dept_cd;
    }

    @ElVoField(physicalName = "combk_dept_cd")
    public void setCombk_dept_cd(String combk_dept_cd){
        this.combk_dept_cd = combk_dept_cd;
    }

    @ElVoField(physicalName = "combk_dept_cd_nm")
    public String getCombk_dept_cd_nm(){
        return combk_dept_cd_nm;
    }

    @ElVoField(physicalName = "combk_dept_cd_nm")
    public void setCombk_dept_cd_nm(String combk_dept_cd_nm){
        this.combk_dept_cd_nm = combk_dept_cd_nm;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public String getJob_clsf_nm(){
        return job_clsf_nm;
    }

    @ElVoField(physicalName = "job_clsf_nm")
    public void setJob_clsf_nm(String job_clsf_nm){
        this.job_clsf_nm = job_clsf_nm;
    }

    @ElVoField(physicalName = "apr_state_cd")
    public String getApr_state_cd(){
        return apr_state_cd;
    }

    @ElVoField(physicalName = "apr_state_cd")
    public void setApr_state_cd(String apr_state_cd){
        this.apr_state_cd = apr_state_cd;
    }

    @ElVoField(physicalName = "ttoff_orign_ymd")
    public String getTtoff_orign_ymd(){
        return ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "ttoff_orign_ymd")
    public void setTtoff_orign_ymd(String ttoff_orign_ymd){
        this.ttoff_orign_ymd = ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "ttoff_cls_ymd")
    public String getTtoff_cls_ymd(){
        return ttoff_cls_ymd;
    }

    @ElVoField(physicalName = "ttoff_cls_ymd")
    public void setTtoff_cls_ymd(String ttoff_cls_ymd){
        this.ttoff_cls_ymd = ttoff_cls_ymd;
    }

    @ElVoField(physicalName = "combk_dept_nm")
    public String getCombk_dept_nm(){
        return combk_dept_nm;
    }

    @ElVoField(physicalName = "combk_dept_nm")
    public void setCombk_dept_nm(String combk_dept_nm){
        this.combk_dept_nm = combk_dept_nm;
    }

    @ElVoField(physicalName = "combk_dept_new_ymd")
    public String getCombk_dept_new_ymd(){
        return combk_dept_new_ymd;
    }

    @ElVoField(physicalName = "combk_dept_new_ymd")
    public void setCombk_dept_new_ymd(String combk_dept_new_ymd){
        this.combk_dept_new_ymd = combk_dept_new_ymd;
    }

    @ElVoField(physicalName = "resn")
    public String getResn(){
        return resn;
    }

    @ElVoField(physicalName = "resn")
    public void setResn(String resn){
        this.resn = resn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "save_type")
    public String getSave_type(){
        return save_type;
    }

    @ElVoField(physicalName = "save_type")
    public void setSave_type(String save_type){
        this.save_type = save_type;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @ElVoField(physicalName = "sh_dept_nm")
    public String getSh_dept_nm(){
        return sh_dept_nm;
    }

    @ElVoField(physicalName = "sh_dept_nm")
    public void setSh_dept_nm(String sh_dept_nm){
        this.sh_dept_nm = sh_dept_nm;
    }

    @ElVoField(physicalName = "sh_posi_nm")
    public String getSh_posi_nm(){
        return sh_posi_nm;
    }

    @ElVoField(physicalName = "sh_posi_nm")
    public void setSh_posi_nm(String sh_posi_nm){
        this.sh_posi_nm = sh_posi_nm;
    }

    @ElVoField(physicalName = "sh_nm")
    public String getSh_nm(){
        return sh_nm;
    }

    @ElVoField(physicalName = "sh_nm")
    public void setSh_nm(String sh_nm){
        this.sh_nm = sh_nm;
    }

    @ElVoField(physicalName = "sh_job_clsf_nm")
    public String getSh_job_clsf_nm(){
        return sh_job_clsf_nm;
    }

    @ElVoField(physicalName = "sh_job_clsf_nm")
    public void setSh_job_clsf_nm(String sh_job_clsf_nm){
        this.sh_job_clsf_nm = sh_job_clsf_nm;
    }

    @ElVoField(physicalName = "sh_req_typ_nm")
    public String getSh_req_typ_nm(){
        return sh_req_typ_nm;
    }

    @ElVoField(physicalName = "sh_req_typ_nm")
    public void setSh_req_typ_nm(String sh_req_typ_nm){
        this.sh_req_typ_nm = sh_req_typ_nm;
    }

    @ElVoField(physicalName = "sh_req_typ")
    public String getSh_req_typ(){
        return sh_req_typ;
    }

    @ElVoField(physicalName = "sh_req_typ")
    public void setSh_req_typ(String sh_req_typ){
        this.sh_req_typ = sh_req_typ;
    }

    @ElVoField(physicalName = "sh_combk_ymd")
    public String getSh_combk_ymd(){
        return sh_combk_ymd;
    }

    @ElVoField(physicalName = "sh_combk_ymd")
    public void setSh_combk_ymd(String sh_combk_ymd){
        this.sh_combk_ymd = sh_combk_ymd;
    }

    @ElVoField(physicalName = "sh_combk_dept_nm")
    public String getSh_combk_dept_nm(){
        return sh_combk_dept_nm;
    }

    @ElVoField(physicalName = "sh_combk_dept_nm")
    public void setSh_combk_dept_nm(String sh_combk_dept_nm){
        this.sh_combk_dept_nm = sh_combk_dept_nm;
    }

    @ElVoField(physicalName = "sh_ttoff_orign_ymd")
    public String getSh_ttoff_orign_ymd(){
        return sh_ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "sh_ttoff_orign_ymd")
    public void setSh_ttoff_orign_ymd(String sh_ttoff_orign_ymd){
        this.sh_ttoff_orign_ymd = sh_ttoff_orign_ymd;
    }

    @ElVoField(physicalName = "sh_month_no")
    public String getSh_month_no(){
        return sh_month_no;
    }

    @ElVoField(physicalName = "sh_month_no")
    public void setSh_month_no(String sh_month_no){
        this.sh_month_no = sh_month_no;
    }

    @ElVoField(physicalName = "sh_resn")
    public String getSh_resn(){
        return sh_resn;
    }

    @ElVoField(physicalName = "sh_resn")
    public void setSh_resn(String sh_resn){
        this.sh_resn = sh_resn;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyLndInfoVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("req_typ").append("=").append(req_typ).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("req_typ_nm").append("=").append(req_typ_nm).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("month_no").append("=").append(month_no).append(",");
        sb.append("combk_ymd").append("=").append(combk_ymd).append(",");
        sb.append("combk_dept_cd").append("=").append(combk_dept_cd).append(",");
        sb.append("combk_dept_cd_nm").append("=").append(combk_dept_cd_nm).append(",");
        sb.append("job_clsf_nm").append("=").append(job_clsf_nm).append(",");
        sb.append("apr_state_cd").append("=").append(apr_state_cd).append(",");
        sb.append("ttoff_orign_ymd").append("=").append(ttoff_orign_ymd).append(",");
        sb.append("ttoff_cls_ymd").append("=").append(ttoff_cls_ymd).append(",");
        sb.append("combk_dept_nm").append("=").append(combk_dept_nm).append(",");
        sb.append("combk_dept_new_ymd").append("=").append(combk_dept_new_ymd).append(",");
        sb.append("resn").append("=").append(resn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("save_type").append("=").append(save_type).append(",");
        sb.append("fileList").append("=").append(fileList).append(",");
        sb.append("sh_dept_nm").append("=").append(sh_dept_nm).append(",");
        sb.append("sh_posi_nm").append("=").append(sh_posi_nm).append(",");
        sb.append("sh_nm").append("=").append(sh_nm).append(",");
        sb.append("sh_job_clsf_nm").append("=").append(sh_job_clsf_nm).append(",");
        sb.append("sh_req_typ_nm").append("=").append(sh_req_typ_nm).append(",");
        sb.append("sh_req_typ").append("=").append(sh_req_typ).append(",");
        sb.append("sh_combk_ymd").append("=").append(sh_combk_ymd).append(",");
        sb.append("sh_combk_dept_nm").append("=").append(sh_combk_dept_nm).append(",");
        sb.append("sh_ttoff_orign_ymd").append("=").append(sh_ttoff_orign_ymd).append(",");
        sb.append("sh_month_no").append("=").append(sh_month_no).append(",");
        sb.append("sh_resn").append("=").append(sh_resn).append(",");
        sb.append("comments").append("=").append(comments);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
