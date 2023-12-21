package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출퇴근기록 미이행 사유서")
public class CwsTagExceptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsTagExceptVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "신청일자", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String basedate;

    @ElDtoField(logicalName = "미이행구분", physicalName = "miss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String miss_type;

    @ElDtoField(logicalName = "신청출근시간", physicalName = "valid_st_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_st_dt;

    @ElDtoField(logicalName = "신청퇴근시간", physicalName = "valid_ed_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_ed_dt;

    @ElDtoField(logicalName = "신청출근시간_시", physicalName = "valid_st_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_st_hour;

    @ElDtoField(logicalName = "신청출근시간_분", physicalName = "valid_st_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_st_minute;

    @ElDtoField(logicalName = "신청퇴근시간_시", physicalName = "valid_ed_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_ed_hour;

    @ElDtoField(logicalName = "신청퇴근시간_분", physicalName = "valid_ed_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String valid_ed_minute;

    @ElDtoField(logicalName = "사유", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cause;

    @ElDtoField(logicalName = "업무수행실적", physicalName = "work_perfmc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work_perfmc;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "중복구분", physicalName = "dup_str", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dup_str;

    @ElDtoField(logicalName = "(검색)시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "(검색)종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "사용자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "APR제목", physicalName = "infoCd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String infoCd;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "관리자사번", physicalName = "auth_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String auth_syspayno;

    @ElDtoField(logicalName = "부서본부명", physicalName = "apr_dept_divisn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_dept_divisn;

    @ElDtoField(logicalName = "성명사번", physicalName = "apr_req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_req_nm;

    @ElDtoField(logicalName = "직급직책", physicalName = "apr_posi_duty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_posi_duty;

    @ElDtoField(logicalName = "기존출근시각", physicalName = "org_st_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String org_st_dt;

    @ElDtoField(logicalName = "기존퇴근시각", physicalName = "org_ed_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String org_ed_dt;

    @ElDtoField(logicalName = "미이행구분", physicalName = "miss_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String miss_type_nm;

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

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        String ret = this.basedate;
        return ret;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @ElVoField(physicalName = "miss_type")
    public String getMiss_type(){
        String ret = this.miss_type;
        return ret;
    }

    @ElVoField(physicalName = "miss_type")
    public void setMiss_type(String miss_type){
        this.miss_type = miss_type;
    }

    @ElVoField(physicalName = "valid_st_dt")
    public String getValid_st_dt(){
        String ret = this.valid_st_dt;
        return ret;
    }

    @ElVoField(physicalName = "valid_st_dt")
    public void setValid_st_dt(String valid_st_dt){
        this.valid_st_dt = valid_st_dt;
    }

    @ElVoField(physicalName = "valid_ed_dt")
    public String getValid_ed_dt(){
        String ret = this.valid_ed_dt;
        return ret;
    }

    @ElVoField(physicalName = "valid_ed_dt")
    public void setValid_ed_dt(String valid_ed_dt){
        this.valid_ed_dt = valid_ed_dt;
    }

    @ElVoField(physicalName = "valid_st_hour")
    public String getValid_st_hour(){
        String ret = this.valid_st_hour;
        return ret;
    }

    @ElVoField(physicalName = "valid_st_hour")
    public void setValid_st_hour(String valid_st_hour){
        this.valid_st_hour = valid_st_hour;
    }

    @ElVoField(physicalName = "valid_st_minute")
    public String getValid_st_minute(){
        String ret = this.valid_st_minute;
        return ret;
    }

    @ElVoField(physicalName = "valid_st_minute")
    public void setValid_st_minute(String valid_st_minute){
        this.valid_st_minute = valid_st_minute;
    }

    @ElVoField(physicalName = "valid_ed_hour")
    public String getValid_ed_hour(){
        String ret = this.valid_ed_hour;
        return ret;
    }

    @ElVoField(physicalName = "valid_ed_hour")
    public void setValid_ed_hour(String valid_ed_hour){
        this.valid_ed_hour = valid_ed_hour;
    }

    @ElVoField(physicalName = "valid_ed_minute")
    public String getValid_ed_minute(){
        String ret = this.valid_ed_minute;
        return ret;
    }

    @ElVoField(physicalName = "valid_ed_minute")
    public void setValid_ed_minute(String valid_ed_minute){
        this.valid_ed_minute = valid_ed_minute;
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

    @ElVoField(physicalName = "work_perfmc")
    public String getWork_perfmc(){
        String ret = this.work_perfmc;
        return ret;
    }

    @ElVoField(physicalName = "work_perfmc")
    public void setWork_perfmc(String work_perfmc){
        this.work_perfmc = work_perfmc;
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

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        String ret = this.apr_state;
        return ret;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        String ret = this.apr_state_nm;
        return ret;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "dup_str")
    public String getDup_str(){
        String ret = this.dup_str;
        return ret;
    }

    @ElVoField(physicalName = "dup_str")
    public void setDup_str(String dup_str){
        this.dup_str = dup_str;
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

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "infoCd")
    public String getInfoCd(){
        String ret = this.infoCd;
        return ret;
    }

    @ElVoField(physicalName = "infoCd")
    public void setInfoCd(String infoCd){
        this.infoCd = infoCd;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
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

    @ElVoField(physicalName = "apr_dept_divisn")
    public String getApr_dept_divisn(){
        String ret = this.apr_dept_divisn;
        return ret;
    }

    @ElVoField(physicalName = "apr_dept_divisn")
    public void setApr_dept_divisn(String apr_dept_divisn){
        this.apr_dept_divisn = apr_dept_divisn;
    }

    @ElVoField(physicalName = "apr_req_nm")
    public String getApr_req_nm(){
        String ret = this.apr_req_nm;
        return ret;
    }

    @ElVoField(physicalName = "apr_req_nm")
    public void setApr_req_nm(String apr_req_nm){
        this.apr_req_nm = apr_req_nm;
    }

    @ElVoField(physicalName = "apr_posi_duty")
    public String getApr_posi_duty(){
        String ret = this.apr_posi_duty;
        return ret;
    }

    @ElVoField(physicalName = "apr_posi_duty")
    public void setApr_posi_duty(String apr_posi_duty){
        this.apr_posi_duty = apr_posi_duty;
    }

    @ElVoField(physicalName = "org_st_dt")
    public String getOrg_st_dt(){
        String ret = this.org_st_dt;
        return ret;
    }

    @ElVoField(physicalName = "org_st_dt")
    public void setOrg_st_dt(String org_st_dt){
        this.org_st_dt = org_st_dt;
    }

    @ElVoField(physicalName = "org_ed_dt")
    public String getOrg_ed_dt(){
        String ret = this.org_ed_dt;
        return ret;
    }

    @ElVoField(physicalName = "org_ed_dt")
    public void setOrg_ed_dt(String org_ed_dt){
        this.org_ed_dt = org_ed_dt;
    }

    @ElVoField(physicalName = "miss_type_nm")
    public String getMiss_type_nm(){
        String ret = this.miss_type_nm;
        return ret;
    }

    @ElVoField(physicalName = "miss_type_nm")
    public void setMiss_type_nm(String miss_type_nm){
        this.miss_type_nm = miss_type_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsTagExceptVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("basedate").append("=").append(basedate).append(",");
        sb.append("miss_type").append("=").append(miss_type).append(",");
        sb.append("valid_st_dt").append("=").append(valid_st_dt).append(",");
        sb.append("valid_ed_dt").append("=").append(valid_ed_dt).append(",");
        sb.append("valid_st_hour").append("=").append(valid_st_hour).append(",");
        sb.append("valid_st_minute").append("=").append(valid_st_minute).append(",");
        sb.append("valid_ed_hour").append("=").append(valid_ed_hour).append(",");
        sb.append("valid_ed_minute").append("=").append(valid_ed_minute).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("work_perfmc").append("=").append(work_perfmc).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("dup_str").append("=").append(dup_str).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("infoCd").append("=").append(infoCd).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("auth_syspayno").append("=").append(auth_syspayno).append(",");
        sb.append("apr_dept_divisn").append("=").append(apr_dept_divisn).append(",");
        sb.append("apr_req_nm").append("=").append(apr_req_nm).append(",");
        sb.append("apr_posi_duty").append("=").append(apr_posi_duty).append(",");
        sb.append("org_st_dt").append("=").append(org_st_dt).append(",");
        sb.append("org_ed_dt").append("=").append(org_ed_dt).append(",");
        sb.append("miss_type_nm").append("=").append(miss_type_nm);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
