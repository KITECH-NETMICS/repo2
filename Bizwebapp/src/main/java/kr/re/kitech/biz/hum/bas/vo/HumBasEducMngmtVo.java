package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "교육훈련통합관리Vo")
public class HumBasEducMngmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasEducMngmtVo(){
    }

    @ElDtoField(logicalName = "교육연도", physicalName = "educ_year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_year;

    @ElDtoField(logicalName = "교육구분", physicalName = "educ_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ;

    @ElDtoField(logicalName = "교육명", physicalName = "educ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd;

    @ElDtoField(logicalName = "교육마감일", physicalName = "educ_enddate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_enddate;

    @ElDtoField(logicalName = "대상자", physicalName = "target_occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_occutyp_cd;

    @ElDtoField(logicalName = "대상자직종", physicalName = "target_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_posi_cd;

    @ElDtoField(logicalName = "대상자사번", physicalName = "target_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_syspayno;

    @ElDtoField(logicalName = "대상자이름", physicalName = "target_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_nm;

    @ElDtoField(logicalName = "의무횟수", physicalName = "duty_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cnt;

    @ElDtoField(logicalName = "의무시간", physicalName = "duty_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_time;

    @ElDtoField(logicalName = "교육방법", physicalName = "educ_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_way;

    @ElDtoField(logicalName = "링크", physicalName = "link", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String link;

    @ElDtoField(logicalName = "일정", physicalName = "calendar_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calendar_info;

    @ElDtoField(logicalName = "기타안내", physicalName = "etc_guide", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_guide;

    @ElDtoField(logicalName = "담당부서명", physicalName = "charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_nm;

    @ElDtoField(logicalName = "담당부서코드", physicalName = "charg_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_cd;

    @ElDtoField(logicalName = "담당부서신설일", physicalName = "charg_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_new_ymd;

    @ElDtoField(logicalName = "담당자사번", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "담당자이름", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "이수현황", physicalName = "info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info;

    @ElDtoField(logicalName = "이수대상자", physicalName = "target_count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_count;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "기준일자", physicalName = "base_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_date;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "성명(한문)", physicalName = "nm_chchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_chchar;

    @ElDtoField(logicalName = "성명(영문)", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "핸드폰번호", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "핸드폰번호(특수문자제거)", physicalName = "mobile_replace", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile_replace;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "입사일", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "퇴사일", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "disp_seq", physicalName = "disp_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disp_seq;

    @ElDtoField(logicalName = "근무상태", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "educ_typ_nm", physicalName = "educ_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ_nm;

    @ElDtoField(logicalName = "educ_cd_nm", physicalName = "educ_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd_nm;

    @ElDtoField(logicalName = "educ_nm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;

    @ElDtoField(logicalName = "educ_agncy", physicalName = "educ_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_agncy;

    @ElDtoField(logicalName = "start_ymd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "퇴사사유", physicalName = "retire_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_resn;

    @ElDtoField(logicalName = "근무시간", physicalName = "month_work_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_work_time;

    @ElDtoField(logicalName = "occutyp_cd", physicalName = "occutyp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_cd;

    @ElVoField(physicalName = "educ_year")
    public String getEduc_year(){
        return educ_year;
    }

    @ElVoField(physicalName = "educ_year")
    public void setEduc_year(String educ_year){
        this.educ_year = educ_year;
    }

    @ElVoField(physicalName = "educ_typ")
    public String getEduc_typ(){
        return educ_typ;
    }

    @ElVoField(physicalName = "educ_typ")
    public void setEduc_typ(String educ_typ){
        this.educ_typ = educ_typ;
    }

    @ElVoField(physicalName = "educ_cd")
    public String getEduc_cd(){
        return educ_cd;
    }

    @ElVoField(physicalName = "educ_cd")
    public void setEduc_cd(String educ_cd){
        this.educ_cd = educ_cd;
    }

    @ElVoField(physicalName = "educ_enddate")
    public String getEduc_enddate(){
        return educ_enddate;
    }

    @ElVoField(physicalName = "educ_enddate")
    public void setEduc_enddate(String educ_enddate){
        this.educ_enddate = educ_enddate;
    }

    @ElVoField(physicalName = "target_occutyp_cd")
    public String getTarget_occutyp_cd(){
        return target_occutyp_cd;
    }

    @ElVoField(physicalName = "target_occutyp_cd")
    public void setTarget_occutyp_cd(String target_occutyp_cd){
        this.target_occutyp_cd = target_occutyp_cd;
    }

    @ElVoField(physicalName = "target_posi_cd")
    public String getTarget_posi_cd(){
        return target_posi_cd;
    }

    @ElVoField(physicalName = "target_posi_cd")
    public void setTarget_posi_cd(String target_posi_cd){
        this.target_posi_cd = target_posi_cd;
    }

    @ElVoField(physicalName = "target_syspayno")
    public String getTarget_syspayno(){
        return target_syspayno;
    }

    @ElVoField(physicalName = "target_syspayno")
    public void setTarget_syspayno(String target_syspayno){
        this.target_syspayno = target_syspayno;
    }

    @ElVoField(physicalName = "target_nm")
    public String getTarget_nm(){
        return target_nm;
    }

    @ElVoField(physicalName = "target_nm")
    public void setTarget_nm(String target_nm){
        this.target_nm = target_nm;
    }

    @ElVoField(physicalName = "duty_cnt")
    public String getDuty_cnt(){
        return duty_cnt;
    }

    @ElVoField(physicalName = "duty_cnt")
    public void setDuty_cnt(String duty_cnt){
        this.duty_cnt = duty_cnt;
    }

    @ElVoField(physicalName = "duty_time")
    public String getDuty_time(){
        return duty_time;
    }

    @ElVoField(physicalName = "duty_time")
    public void setDuty_time(String duty_time){
        this.duty_time = duty_time;
    }

    @ElVoField(physicalName = "educ_way")
    public String getEduc_way(){
        return educ_way;
    }

    @ElVoField(physicalName = "educ_way")
    public void setEduc_way(String educ_way){
        this.educ_way = educ_way;
    }

    @ElVoField(physicalName = "link")
    public String getLink(){
        return link;
    }

    @ElVoField(physicalName = "link")
    public void setLink(String link){
        this.link = link;
    }

    @ElVoField(physicalName = "calendar_info")
    public String getCalendar_info(){
        return calendar_info;
    }

    @ElVoField(physicalName = "calendar_info")
    public void setCalendar_info(String calendar_info){
        this.calendar_info = calendar_info;
    }

    @ElVoField(physicalName = "etc_guide")
    public String getEtc_guide(){
        return etc_guide;
    }

    @ElVoField(physicalName = "etc_guide")
    public void setEtc_guide(String etc_guide){
        this.etc_guide = etc_guide;
    }

    @ElVoField(physicalName = "charg_dept_nm")
    public String getCharg_dept_nm(){
        return charg_dept_nm;
    }

    @ElVoField(physicalName = "charg_dept_nm")
    public void setCharg_dept_nm(String charg_dept_nm){
        this.charg_dept_nm = charg_dept_nm;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public String getCharg_dept_cd(){
        return charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public void setCharg_dept_cd(String charg_dept_cd){
        this.charg_dept_cd = charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public String getCharg_dept_new_ymd(){
        return charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public void setCharg_dept_new_ymd(String charg_dept_new_ymd){
        this.charg_dept_new_ymd = charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "info")
    public String getInfo(){
        return info;
    }

    @ElVoField(physicalName = "info")
    public void setInfo(String info){
        this.info = info;
    }

    @ElVoField(physicalName = "target_count")
    public String getTarget_count(){
        return target_count;
    }

    @ElVoField(physicalName = "target_count")
    public void setTarget_count(String target_count){
        this.target_count = target_count;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "base_date")
    public String getBase_date(){
        return base_date;
    }

    @ElVoField(physicalName = "base_date")
    public void setBase_date(String base_date){
        this.base_date = base_date;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "nm_chchar")
    public String getNm_chchar(){
        return nm_chchar;
    }

    @ElVoField(physicalName = "nm_chchar")
    public void setNm_chchar(String nm_chchar){
        this.nm_chchar = nm_chchar;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "mobile_replace")
    public String getMobile_replace(){
        return mobile_replace;
    }

    @ElVoField(physicalName = "mobile_replace")
    public void setMobile_replace(String mobile_replace){
        this.mobile_replace = mobile_replace;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "disp_seq")
    public String getDisp_seq(){
        return disp_seq;
    }

    @ElVoField(physicalName = "disp_seq")
    public void setDisp_seq(String disp_seq){
        this.disp_seq = disp_seq;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "educ_typ_nm")
    public String getEduc_typ_nm(){
        return educ_typ_nm;
    }

    @ElVoField(physicalName = "educ_typ_nm")
    public void setEduc_typ_nm(String educ_typ_nm){
        this.educ_typ_nm = educ_typ_nm;
    }

    @ElVoField(physicalName = "educ_cd_nm")
    public String getEduc_cd_nm(){
        return educ_cd_nm;
    }

    @ElVoField(physicalName = "educ_cd_nm")
    public void setEduc_cd_nm(String educ_cd_nm){
        this.educ_cd_nm = educ_cd_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }

    @ElVoField(physicalName = "educ_agncy")
    public String getEduc_agncy(){
        return educ_agncy;
    }

    @ElVoField(physicalName = "educ_agncy")
    public void setEduc_agncy(String educ_agncy){
        this.educ_agncy = educ_agncy;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "retire_resn")
    public String getRetire_resn(){
        return retire_resn;
    }

    @ElVoField(physicalName = "retire_resn")
    public void setRetire_resn(String retire_resn){
        this.retire_resn = retire_resn;
    }

    @ElVoField(physicalName = "month_work_time")
    public String getMonth_work_time(){
        return month_work_time;
    }

    @ElVoField(physicalName = "month_work_time")
    public void setMonth_work_time(String month_work_time){
        this.month_work_time = month_work_time;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public String getOccutyp_cd(){
        return occutyp_cd;
    }

    @ElVoField(physicalName = "occutyp_cd")
    public void setOccutyp_cd(String occutyp_cd){
        this.occutyp_cd = occutyp_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasEducMngmtVo [");
        sb.append("educ_year").append("=").append(educ_year).append(",");
        sb.append("educ_typ").append("=").append(educ_typ).append(",");
        sb.append("educ_cd").append("=").append(educ_cd).append(",");
        sb.append("educ_enddate").append("=").append(educ_enddate).append(",");
        sb.append("target_occutyp_cd").append("=").append(target_occutyp_cd).append(",");
        sb.append("target_posi_cd").append("=").append(target_posi_cd).append(",");
        sb.append("target_syspayno").append("=").append(target_syspayno).append(",");
        sb.append("target_nm").append("=").append(target_nm).append(",");
        sb.append("duty_cnt").append("=").append(duty_cnt).append(",");
        sb.append("duty_time").append("=").append(duty_time).append(",");
        sb.append("educ_way").append("=").append(educ_way).append(",");
        sb.append("link").append("=").append(link).append(",");
        sb.append("calendar_info").append("=").append(calendar_info).append(",");
        sb.append("etc_guide").append("=").append(etc_guide).append(",");
        sb.append("charg_dept_nm").append("=").append(charg_dept_nm).append(",");
        sb.append("charg_dept_cd").append("=").append(charg_dept_cd).append(",");
        sb.append("charg_dept_new_ymd").append("=").append(charg_dept_new_ymd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("info").append("=").append(info).append(",");
        sb.append("target_count").append("=").append(target_count).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("base_date").append("=").append(base_date).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("nm_chchar").append("=").append(nm_chchar).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("mobile_replace").append("=").append(mobile_replace).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("disp_seq").append("=").append(disp_seq).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("educ_typ_nm").append("=").append(educ_typ_nm).append(",");
        sb.append("educ_cd_nm").append("=").append(educ_cd_nm).append(",");
        sb.append("educ_nm").append("=").append(educ_nm).append(",");
        sb.append("educ_agncy").append("=").append(educ_agncy).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("retire_resn").append("=").append(retire_resn).append(",");
        sb.append("month_work_time").append("=").append(month_work_time).append(",");
        sb.append("occutyp_cd").append("=").append(occutyp_cd);
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
