package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원 신청 Vo")
public class CgslappVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청자개인번호", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "입사일자", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "조합원코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "신청자부서코드", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "신청자부서신설일자", physicalName = "req_psn_dept_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_ymd;

    @ElDtoField(logicalName = "부서", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "신청자직급코드", physicalName = "req_psn_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_posi_cd;

    @ElDtoField(logicalName = "연락처", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "휴가시작일자", physicalName = "holiday_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_start_ymd;

    @ElDtoField(logicalName = "휴가구분", physicalName = "holiday_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_clsf;

    @ElDtoField(logicalName = "휴가구분명", physicalName = "holiday_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_clsf_nm;

    @ElDtoField(logicalName = "휴가소구분", physicalName = "holiday_sub_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_sub_clsf;

    @ElDtoField(logicalName = "휴가종료일자", physicalName = "holiday_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_cls_ymd;

    @ElDtoField(logicalName = "휴가시작시간", physicalName = "holiday_start_hour", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double holiday_start_hour;

    @ElDtoField(logicalName = "휴가종료시간", physicalName = "holiday_cls_hour", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double holiday_cls_hour;

    @ElDtoField(logicalName = "휴가일수", physicalName = "holiday_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_daycnt;

    @ElDtoField(logicalName = "휴가사유", physicalName = "holiday_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_cause;

    @ElDtoField(logicalName = "행선지", physicalName = "destin", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String destin;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "직무대행자시스템개인번호", physicalName = "agent_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_syspayno;

    @ElDtoField(logicalName = "직무대행자개인번호", physicalName = "agent_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_empno;

    @ElDtoField(logicalName = "직무대행자성명", physicalName = "agent_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_nm;

    @ElDtoField(logicalName = "백신접종구분", physicalName = "vaccine", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vaccine;

    @ElDtoField(logicalName = "백신접종사유", physicalName = "vac_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vac_cause;

    @ElDtoField(logicalName = "백신종류", physicalName = "vac_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vac_gb;

    @ElDtoField(logicalName = "접종시기", physicalName = "vac_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vac_date;

    @ElDtoField(logicalName = "가족성명", physicalName = "care_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String care_name;

    @ElDtoField(logicalName = "나와의관계", physicalName = "care_relation", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String care_relation;

    @ElDtoField(logicalName = "가족생년월일", physicalName = "care_birth_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String care_birth_ymd;

    @ElDtoField(logicalName = "작성자", physicalName = "regst_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_nm;

    @ElDtoField(logicalName = "결재자", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "저축연차00", physicalName = "save_anal_yr00", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr00;

    @ElDtoField(logicalName = "저축연차01", physicalName = "save_anal_yr01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr01;

    @ElDtoField(logicalName = "저축연차02", physicalName = "save_anal_yr02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr02;

    @ElDtoField(logicalName = "저축연차03", physicalName = "save_anal_yr03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr03;

    @ElDtoField(logicalName = "저축연차04", physicalName = "save_anal_yr04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr04;

    @ElDtoField(logicalName = "저축연차05", physicalName = "save_anal_yr05", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr05;

    @ElDtoField(logicalName = "저축연차06", physicalName = "save_anal_yr06", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr06;

    @ElDtoField(logicalName = "저축연차07", physicalName = "save_anal_yr07", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr07;

    @ElDtoField(logicalName = "저축연차08", physicalName = "save_anal_yr08", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr08;

    @ElDtoField(logicalName = "저축연차09", physicalName = "save_anal_yr09", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr09;

    @ElDtoField(logicalName = "저축연차10", physicalName = "save_anal_yr10", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_anal_yr10;

    @ElDtoField(logicalName = "증빙등록", physicalName = "to_evid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_evid;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "command", physicalName = "command", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String command;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "휴가시작시간(결재)", physicalName = "lbl_start_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lbl_start_hour;

    @ElDtoField(logicalName = "휴가종료시간(결재)", physicalName = "lbl_cls_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lbl_cls_hour;

    @ElDtoField(logicalName = "휴가시간(결재)", physicalName = "holiday_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_hour;

    @ElDtoField(logicalName = "휴가구분(결재)", physicalName = "RepReason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RepReason;

    @ElDtoField(logicalName = "전결", physicalName = "rule_money_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rule_money_cd;

    @ElDtoField(logicalName = "전결", physicalName = "rule_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rule_type_cd;

    @ElDtoField(logicalName = "휴가기간", physicalName = "holiday_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_prd;

    @ElDtoField(logicalName = "신청전 잔여연차(결재)", physicalName = "holiday_before_remain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String holiday_before_remain;

    @ElDtoField(logicalName = "신청후 잔여연차(결재)", physicalName = "remain_holiday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remain_holiday;

    @ElDtoField(logicalName = "신청전 보상휴가(결재)", physicalName = "apr_beforeRewardRemain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_beforeRewardRemain;

    @ElDtoField(logicalName = "신청후 보상휴가(결재)", physicalName = "apr_afterRewardRemain", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_afterRewardRemain;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자 사번", physicalName = "regst_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn;

    @ElDtoField(logicalName = "관련신청번호(대체휴일)", physicalName = "ctr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctr_req_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public String getReq_psn_dept_cd(){
        return req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public void setReq_psn_dept_cd(String req_psn_dept_cd){
        this.req_psn_dept_cd = req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_ymd")
    public String getReq_psn_dept_ymd(){
        return req_psn_dept_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_ymd")
    public void setReq_psn_dept_ymd(String req_psn_dept_ymd){
        this.req_psn_dept_ymd = req_psn_dept_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        return req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_posi_cd")
    public String getReq_psn_posi_cd(){
        return req_psn_posi_cd;
    }

    @ElVoField(physicalName = "req_psn_posi_cd")
    public void setReq_psn_posi_cd(String req_psn_posi_cd){
        this.req_psn_posi_cd = req_psn_posi_cd;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "holiday_start_ymd")
    public String getHoliday_start_ymd(){
        return holiday_start_ymd;
    }

    @ElVoField(physicalName = "holiday_start_ymd")
    public void setHoliday_start_ymd(String holiday_start_ymd){
        this.holiday_start_ymd = holiday_start_ymd;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public String getHoliday_clsf(){
        return holiday_clsf;
    }

    @ElVoField(physicalName = "holiday_clsf")
    public void setHoliday_clsf(String holiday_clsf){
        this.holiday_clsf = holiday_clsf;
    }

    @ElVoField(physicalName = "holiday_clsf_nm")
    public String getHoliday_clsf_nm(){
        return holiday_clsf_nm;
    }

    @ElVoField(physicalName = "holiday_clsf_nm")
    public void setHoliday_clsf_nm(String holiday_clsf_nm){
        this.holiday_clsf_nm = holiday_clsf_nm;
    }

    @ElVoField(physicalName = "holiday_sub_clsf")
    public String getHoliday_sub_clsf(){
        return holiday_sub_clsf;
    }

    @ElVoField(physicalName = "holiday_sub_clsf")
    public void setHoliday_sub_clsf(String holiday_sub_clsf){
        this.holiday_sub_clsf = holiday_sub_clsf;
    }

    @ElVoField(physicalName = "holiday_cls_ymd")
    public String getHoliday_cls_ymd(){
        return holiday_cls_ymd;
    }

    @ElVoField(physicalName = "holiday_cls_ymd")
    public void setHoliday_cls_ymd(String holiday_cls_ymd){
        this.holiday_cls_ymd = holiday_cls_ymd;
    }

    @ElVoField(physicalName = "holiday_start_hour")
    public double getHoliday_start_hour(){
        return holiday_start_hour;
    }

    @ElVoField(physicalName = "holiday_start_hour")
    public void setHoliday_start_hour(double holiday_start_hour){
        this.holiday_start_hour = holiday_start_hour;
    }

    @ElVoField(physicalName = "holiday_cls_hour")
    public double getHoliday_cls_hour(){
        return holiday_cls_hour;
    }

    @ElVoField(physicalName = "holiday_cls_hour")
    public void setHoliday_cls_hour(double holiday_cls_hour){
        this.holiday_cls_hour = holiday_cls_hour;
    }

    @ElVoField(physicalName = "holiday_daycnt")
    public String getHoliday_daycnt(){
        return holiday_daycnt;
    }

    @ElVoField(physicalName = "holiday_daycnt")
    public void setHoliday_daycnt(String holiday_daycnt){
        this.holiday_daycnt = holiday_daycnt;
    }

    @ElVoField(physicalName = "holiday_cause")
    public String getHoliday_cause(){
        return holiday_cause;
    }

    @ElVoField(physicalName = "holiday_cause")
    public void setHoliday_cause(String holiday_cause){
        this.holiday_cause = holiday_cause;
    }

    @ElVoField(physicalName = "destin")
    public String getDestin(){
        return destin;
    }

    @ElVoField(physicalName = "destin")
    public void setDestin(String destin){
        this.destin = destin;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public String getAgent_psn_syspayno(){
        return agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public void setAgent_psn_syspayno(String agent_psn_syspayno){
        this.agent_psn_syspayno = agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_empno")
    public String getAgent_psn_empno(){
        return agent_psn_empno;
    }

    @ElVoField(physicalName = "agent_psn_empno")
    public void setAgent_psn_empno(String agent_psn_empno){
        this.agent_psn_empno = agent_psn_empno;
    }

    @ElVoField(physicalName = "agent_psn_nm")
    public String getAgent_psn_nm(){
        return agent_psn_nm;
    }

    @ElVoField(physicalName = "agent_psn_nm")
    public void setAgent_psn_nm(String agent_psn_nm){
        this.agent_psn_nm = agent_psn_nm;
    }

    @ElVoField(physicalName = "vaccine")
    public String getVaccine(){
        return vaccine;
    }

    @ElVoField(physicalName = "vaccine")
    public void setVaccine(String vaccine){
        this.vaccine = vaccine;
    }

    @ElVoField(physicalName = "vac_cause")
    public String getVac_cause(){
        return vac_cause;
    }

    @ElVoField(physicalName = "vac_cause")
    public void setVac_cause(String vac_cause){
        this.vac_cause = vac_cause;
    }

    @ElVoField(physicalName = "vac_gb")
    public String getVac_gb(){
        return vac_gb;
    }

    @ElVoField(physicalName = "vac_gb")
    public void setVac_gb(String vac_gb){
        this.vac_gb = vac_gb;
    }

    @ElVoField(physicalName = "vac_date")
    public String getVac_date(){
        return vac_date;
    }

    @ElVoField(physicalName = "vac_date")
    public void setVac_date(String vac_date){
        this.vac_date = vac_date;
    }

    @ElVoField(physicalName = "care_name")
    public String getCare_name(){
        return care_name;
    }

    @ElVoField(physicalName = "care_name")
    public void setCare_name(String care_name){
        this.care_name = care_name;
    }

    @ElVoField(physicalName = "care_relation")
    public String getCare_relation(){
        return care_relation;
    }

    @ElVoField(physicalName = "care_relation")
    public void setCare_relation(String care_relation){
        this.care_relation = care_relation;
    }

    @ElVoField(physicalName = "care_birth_ymd")
    public String getCare_birth_ymd(){
        return care_birth_ymd;
    }

    @ElVoField(physicalName = "care_birth_ymd")
    public void setCare_birth_ymd(String care_birth_ymd){
        this.care_birth_ymd = care_birth_ymd;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public String getRegst_psn_nm(){
        return regst_psn_nm;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public void setRegst_psn_nm(String regst_psn_nm){
        this.regst_psn_nm = regst_psn_nm;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "save_anal_yr00")
    public String getSave_anal_yr00(){
        return save_anal_yr00;
    }

    @ElVoField(physicalName = "save_anal_yr00")
    public void setSave_anal_yr00(String save_anal_yr00){
        this.save_anal_yr00 = save_anal_yr00;
    }

    @ElVoField(physicalName = "save_anal_yr01")
    public String getSave_anal_yr01(){
        return save_anal_yr01;
    }

    @ElVoField(physicalName = "save_anal_yr01")
    public void setSave_anal_yr01(String save_anal_yr01){
        this.save_anal_yr01 = save_anal_yr01;
    }

    @ElVoField(physicalName = "save_anal_yr02")
    public String getSave_anal_yr02(){
        return save_anal_yr02;
    }

    @ElVoField(physicalName = "save_anal_yr02")
    public void setSave_anal_yr02(String save_anal_yr02){
        this.save_anal_yr02 = save_anal_yr02;
    }

    @ElVoField(physicalName = "save_anal_yr03")
    public String getSave_anal_yr03(){
        return save_anal_yr03;
    }

    @ElVoField(physicalName = "save_anal_yr03")
    public void setSave_anal_yr03(String save_anal_yr03){
        this.save_anal_yr03 = save_anal_yr03;
    }

    @ElVoField(physicalName = "save_anal_yr04")
    public String getSave_anal_yr04(){
        return save_anal_yr04;
    }

    @ElVoField(physicalName = "save_anal_yr04")
    public void setSave_anal_yr04(String save_anal_yr04){
        this.save_anal_yr04 = save_anal_yr04;
    }

    @ElVoField(physicalName = "save_anal_yr05")
    public String getSave_anal_yr05(){
        return save_anal_yr05;
    }

    @ElVoField(physicalName = "save_anal_yr05")
    public void setSave_anal_yr05(String save_anal_yr05){
        this.save_anal_yr05 = save_anal_yr05;
    }

    @ElVoField(physicalName = "save_anal_yr06")
    public String getSave_anal_yr06(){
        return save_anal_yr06;
    }

    @ElVoField(physicalName = "save_anal_yr06")
    public void setSave_anal_yr06(String save_anal_yr06){
        this.save_anal_yr06 = save_anal_yr06;
    }

    @ElVoField(physicalName = "save_anal_yr07")
    public String getSave_anal_yr07(){
        return save_anal_yr07;
    }

    @ElVoField(physicalName = "save_anal_yr07")
    public void setSave_anal_yr07(String save_anal_yr07){
        this.save_anal_yr07 = save_anal_yr07;
    }

    @ElVoField(physicalName = "save_anal_yr08")
    public String getSave_anal_yr08(){
        return save_anal_yr08;
    }

    @ElVoField(physicalName = "save_anal_yr08")
    public void setSave_anal_yr08(String save_anal_yr08){
        this.save_anal_yr08 = save_anal_yr08;
    }

    @ElVoField(physicalName = "save_anal_yr09")
    public String getSave_anal_yr09(){
        return save_anal_yr09;
    }

    @ElVoField(physicalName = "save_anal_yr09")
    public void setSave_anal_yr09(String save_anal_yr09){
        this.save_anal_yr09 = save_anal_yr09;
    }

    @ElVoField(physicalName = "save_anal_yr10")
    public String getSave_anal_yr10(){
        return save_anal_yr10;
    }

    @ElVoField(physicalName = "save_anal_yr10")
    public void setSave_anal_yr10(String save_anal_yr10){
        this.save_anal_yr10 = save_anal_yr10;
    }

    @ElVoField(physicalName = "to_evid")
    public String getTo_evid(){
        return to_evid;
    }

    @ElVoField(physicalName = "to_evid")
    public void setTo_evid(String to_evid){
        this.to_evid = to_evid;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "command")
    public String getCommand(){
        return command;
    }

    @ElVoField(physicalName = "command")
    public void setCommand(String command){
        this.command = command;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "lbl_start_hour")
    public String getLbl_start_hour(){
        return lbl_start_hour;
    }

    @ElVoField(physicalName = "lbl_start_hour")
    public void setLbl_start_hour(String lbl_start_hour){
        this.lbl_start_hour = lbl_start_hour;
    }

    @ElVoField(physicalName = "lbl_cls_hour")
    public String getLbl_cls_hour(){
        return lbl_cls_hour;
    }

    @ElVoField(physicalName = "lbl_cls_hour")
    public void setLbl_cls_hour(String lbl_cls_hour){
        this.lbl_cls_hour = lbl_cls_hour;
    }

    @ElVoField(physicalName = "holiday_hour")
    public String getHoliday_hour(){
        return holiday_hour;
    }

    @ElVoField(physicalName = "holiday_hour")
    public void setHoliday_hour(String holiday_hour){
        this.holiday_hour = holiday_hour;
    }

    @ElVoField(physicalName = "RepReason")
    public String getRepReason(){
        return RepReason;
    }

    @ElVoField(physicalName = "RepReason")
    public void setRepReason(String RepReason){
        this.RepReason = RepReason;
    }

    @ElVoField(physicalName = "rule_money_cd")
    public String getRule_money_cd(){
        return rule_money_cd;
    }

    @ElVoField(physicalName = "rule_money_cd")
    public void setRule_money_cd(String rule_money_cd){
        this.rule_money_cd = rule_money_cd;
    }

    @ElVoField(physicalName = "rule_type_cd")
    public String getRule_type_cd(){
        return rule_type_cd;
    }

    @ElVoField(physicalName = "rule_type_cd")
    public void setRule_type_cd(String rule_type_cd){
        this.rule_type_cd = rule_type_cd;
    }

    @ElVoField(physicalName = "holiday_prd")
    public String getHoliday_prd(){
        return holiday_prd;
    }

    @ElVoField(physicalName = "holiday_prd")
    public void setHoliday_prd(String holiday_prd){
        this.holiday_prd = holiday_prd;
    }

    @ElVoField(physicalName = "holiday_before_remain")
    public String getHoliday_before_remain(){
        return holiday_before_remain;
    }

    @ElVoField(physicalName = "holiday_before_remain")
    public void setHoliday_before_remain(String holiday_before_remain){
        this.holiday_before_remain = holiday_before_remain;
    }

    @ElVoField(physicalName = "remain_holiday")
    public String getRemain_holiday(){
        return remain_holiday;
    }

    @ElVoField(physicalName = "remain_holiday")
    public void setRemain_holiday(String remain_holiday){
        this.remain_holiday = remain_holiday;
    }

    @ElVoField(physicalName = "apr_beforeRewardRemain")
    public String getApr_beforeRewardRemain(){
        return apr_beforeRewardRemain;
    }

    @ElVoField(physicalName = "apr_beforeRewardRemain")
    public void setApr_beforeRewardRemain(String apr_beforeRewardRemain){
        this.apr_beforeRewardRemain = apr_beforeRewardRemain;
    }

    @ElVoField(physicalName = "apr_afterRewardRemain")
    public String getApr_afterRewardRemain(){
        return apr_afterRewardRemain;
    }

    @ElVoField(physicalName = "apr_afterRewardRemain")
    public void setApr_afterRewardRemain(String apr_afterRewardRemain){
        this.apr_afterRewardRemain = apr_afterRewardRemain;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "regst_psn")
    public String getRegst_psn(){
        return regst_psn;
    }

    @ElVoField(physicalName = "regst_psn")
    public void setRegst_psn(String regst_psn){
        this.regst_psn = regst_psn;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public String getCtr_req_no(){
        return ctr_req_no;
    }

    @ElVoField(physicalName = "ctr_req_no")
    public void setCtr_req_no(String ctr_req_no){
        this.ctr_req_no = ctr_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("req_psn_dept_ymd").append("=").append(req_psn_dept_ymd).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("req_psn_posi_cd").append("=").append(req_psn_posi_cd).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("holiday_start_ymd").append("=").append(holiday_start_ymd).append(",");
        sb.append("holiday_clsf").append("=").append(holiday_clsf).append(",");
        sb.append("holiday_clsf_nm").append("=").append(holiday_clsf_nm).append(",");
        sb.append("holiday_sub_clsf").append("=").append(holiday_sub_clsf).append(",");
        sb.append("holiday_cls_ymd").append("=").append(holiday_cls_ymd).append(",");
        sb.append("holiday_start_hour").append("=").append(holiday_start_hour).append(",");
        sb.append("holiday_cls_hour").append("=").append(holiday_cls_hour).append(",");
        sb.append("holiday_daycnt").append("=").append(holiday_daycnt).append(",");
        sb.append("holiday_cause").append("=").append(holiday_cause).append(",");
        sb.append("destin").append("=").append(destin).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("agent_psn_syspayno").append("=").append(agent_psn_syspayno).append(",");
        sb.append("agent_psn_empno").append("=").append(agent_psn_empno).append(",");
        sb.append("agent_psn_nm").append("=").append(agent_psn_nm).append(",");
        sb.append("vaccine").append("=").append(vaccine).append(",");
        sb.append("vac_cause").append("=").append(vac_cause).append(",");
        sb.append("vac_gb").append("=").append(vac_gb).append(",");
        sb.append("vac_date").append("=").append(vac_date).append(",");
        sb.append("care_name").append("=").append(care_name).append(",");
        sb.append("care_relation").append("=").append(care_relation).append(",");
        sb.append("care_birth_ymd").append("=").append(care_birth_ymd).append(",");
        sb.append("regst_psn_nm").append("=").append(regst_psn_nm).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("save_anal_yr00").append("=").append(save_anal_yr00).append(",");
        sb.append("save_anal_yr01").append("=").append(save_anal_yr01).append(",");
        sb.append("save_anal_yr02").append("=").append(save_anal_yr02).append(",");
        sb.append("save_anal_yr03").append("=").append(save_anal_yr03).append(",");
        sb.append("save_anal_yr04").append("=").append(save_anal_yr04).append(",");
        sb.append("save_anal_yr05").append("=").append(save_anal_yr05).append(",");
        sb.append("save_anal_yr06").append("=").append(save_anal_yr06).append(",");
        sb.append("save_anal_yr07").append("=").append(save_anal_yr07).append(",");
        sb.append("save_anal_yr08").append("=").append(save_anal_yr08).append(",");
        sb.append("save_anal_yr09").append("=").append(save_anal_yr09).append(",");
        sb.append("save_anal_yr10").append("=").append(save_anal_yr10).append(",");
        sb.append("to_evid").append("=").append(to_evid).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("command").append("=").append(command).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("lbl_start_hour").append("=").append(lbl_start_hour).append(",");
        sb.append("lbl_cls_hour").append("=").append(lbl_cls_hour).append(",");
        sb.append("holiday_hour").append("=").append(holiday_hour).append(",");
        sb.append("RepReason").append("=").append(RepReason).append(",");
        sb.append("rule_money_cd").append("=").append(rule_money_cd).append(",");
        sb.append("rule_type_cd").append("=").append(rule_type_cd).append(",");
        sb.append("holiday_prd").append("=").append(holiday_prd).append(",");
        sb.append("holiday_before_remain").append("=").append(holiday_before_remain).append(",");
        sb.append("remain_holiday").append("=").append(remain_holiday).append(",");
        sb.append("apr_beforeRewardRemain").append("=").append(apr_beforeRewardRemain).append(",");
        sb.append("apr_afterRewardRemain").append("=").append(apr_afterRewardRemain).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("regst_psn").append("=").append(regst_psn).append(",");
        sb.append("ctr_req_no").append("=").append(ctr_req_no);
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
