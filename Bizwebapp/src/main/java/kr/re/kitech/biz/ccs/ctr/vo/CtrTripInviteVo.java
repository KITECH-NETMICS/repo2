package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부강의신고")
public class CtrTripInviteVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrTripInviteVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "활동구분", physicalName = "act_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_clsf;

    @ElDtoField(logicalName = "활동구분명", physicalName = "act_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_clsf_nm;

    @ElDtoField(logicalName = "활동형태", physicalName = "act_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_shape;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "trip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_req_no;

    @ElDtoField(logicalName = "신고연월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yyyymm;

    @ElDtoField(logicalName = "출장코드", physicalName = "trip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_cd;

    @ElDtoField(logicalName = "출장구분명", physicalName = "trip_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_cd_nm;

    @ElDtoField(logicalName = "보고구분", physicalName = "report_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String report_cd;

    @ElDtoField(logicalName = "참석유형", physicalName = "attend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attend_cd;

    @ElDtoField(logicalName = "활동유형", physicalName = "activity_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String activity_cd;

    @ElDtoField(logicalName = "활동유형상세", physicalName = "activity_dtl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String activity_dtl;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "작성자시스템개인번호", physicalName = "write_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String write_syspayno;

    @ElDtoField(logicalName = "신청자연락처", physicalName = "req_tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_tel_no;

    @ElDtoField(logicalName = "요청기관코드", physicalName = "org_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_cd;

    @ElDtoField(logicalName = "요청기관", physicalName = "invite_org_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_org_nm;

    @ElDtoField(logicalName = "요청대표자", physicalName = "invite_ceo_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_ceo_nm;

    @ElDtoField(logicalName = "요청부서", physicalName = "invite_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_dept_nm;

    @ElDtoField(logicalName = "요청자연락처", physicalName = "invite_tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_tel_no;

    @ElDtoField(logicalName = "요청사유", physicalName = "invite_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_cause;

    @ElDtoField(logicalName = "주제", physicalName = "subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subject;

    @ElDtoField(logicalName = "장소", physicalName = "region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region;

    @ElDtoField(logicalName = "보상구분", physicalName = "econo_gain_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String econo_gain_clsf;

    @ElDtoField(logicalName = "대가", physicalName = "reward_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long reward_amt;

    @ElDtoField(logicalName = "교통비", physicalName = "traffic_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long traffic_amt;

    @ElDtoField(logicalName = "숙박비", physicalName = "stay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long stay_amt;

    @ElDtoField(logicalName = "식비", physicalName = "food_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long food_amt;

    @ElDtoField(logicalName = "대가여부", physicalName = "cost_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cost_yn;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "강의시간(분)", physicalName = "period_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String period_minute;

    @ElDtoField(logicalName = "활동시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "활동종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "참여정도", physicalName = "attnce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_clsf;

    @ElDtoField(logicalName = "시작일시", physicalName = "st_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String st_daytm;

    @ElDtoField(logicalName = "종료일시", physicalName = "ed_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ed_daytm;

    @ElDtoField(logicalName = "접수일자", physicalName = "req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_daytm;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "신청자이름", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명(상세내역)", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직책", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "활동유형명", physicalName = "activity_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String activity_cd_nm;

    @ElDtoField(logicalName = "출장목적", physicalName = "trip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_goal;

    @ElDtoField(logicalName = "출장지역", physicalName = "trip_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_region;

    @ElDtoField(logicalName = "수정항목", physicalName = "modify_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String modify_item;

    @ElDtoField(logicalName = "수정이유", physicalName = "modify_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String modify_cause;

    @ElDtoField(logicalName = "수정날짜", physicalName = "modify_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String modify_daytm;

    @ElDtoField(logicalName = "sms_cnt", physicalName = "sms_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sms_cnt;

    @ElDtoField(logicalName = "반려사유코드", physicalName = "companion_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String companion_cd;

    @ElDtoField(logicalName = "반려사유", physicalName = "companion_rs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String companion_rs;

    @ElDtoField(logicalName = "비고", physicalName = "note", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note;

    @ElDtoField(logicalName = "월간이력", physicalName = "acc_mon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acc_mon;

    @ElDtoField(logicalName = "월간 누적횟수", physicalName = "acc_mon_count", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acc_mon_count;

    @ElDtoField(logicalName = "월간 누적시간", physicalName = "acc_mon_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acc_mon_hour;

    @ElDtoField(logicalName = "출장일", physicalName = "trip_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trip_days;

    @ElDtoField(logicalName = "본부", physicalName = "divsn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_nm;

    @ElDtoField(logicalName = "작성자", physicalName = "wrt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrt_psn_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "act_clsf")
    public String getAct_clsf(){
        return act_clsf;
    }

    @ElVoField(physicalName = "act_clsf")
    public void setAct_clsf(String act_clsf){
        this.act_clsf = act_clsf;
    }

    @ElVoField(physicalName = "act_clsf_nm")
    public String getAct_clsf_nm(){
        return act_clsf_nm;
    }

    @ElVoField(physicalName = "act_clsf_nm")
    public void setAct_clsf_nm(String act_clsf_nm){
        this.act_clsf_nm = act_clsf_nm;
    }

    @ElVoField(physicalName = "act_shape")
    public String getAct_shape(){
        return act_shape;
    }

    @ElVoField(physicalName = "act_shape")
    public void setAct_shape(String act_shape){
        this.act_shape = act_shape;
    }

    @ElVoField(physicalName = "trip_req_no")
    public String getTrip_req_no(){
        return trip_req_no;
    }

    @ElVoField(physicalName = "trip_req_no")
    public void setTrip_req_no(String trip_req_no){
        this.trip_req_no = trip_req_no;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        return yyyymm;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "trip_cd")
    public String getTrip_cd(){
        return trip_cd;
    }

    @ElVoField(physicalName = "trip_cd")
    public void setTrip_cd(String trip_cd){
        this.trip_cd = trip_cd;
    }

    @ElVoField(physicalName = "trip_cd_nm")
    public String getTrip_cd_nm(){
        return trip_cd_nm;
    }

    @ElVoField(physicalName = "trip_cd_nm")
    public void setTrip_cd_nm(String trip_cd_nm){
        this.trip_cd_nm = trip_cd_nm;
    }

    @ElVoField(physicalName = "report_cd")
    public String getReport_cd(){
        return report_cd;
    }

    @ElVoField(physicalName = "report_cd")
    public void setReport_cd(String report_cd){
        this.report_cd = report_cd;
    }

    @ElVoField(physicalName = "attend_cd")
    public String getAttend_cd(){
        return attend_cd;
    }

    @ElVoField(physicalName = "attend_cd")
    public void setAttend_cd(String attend_cd){
        this.attend_cd = attend_cd;
    }

    @ElVoField(physicalName = "activity_cd")
    public String getActivity_cd(){
        return activity_cd;
    }

    @ElVoField(physicalName = "activity_cd")
    public void setActivity_cd(String activity_cd){
        this.activity_cd = activity_cd;
    }

    @ElVoField(physicalName = "activity_dtl")
    public String getActivity_dtl(){
        return activity_dtl;
    }

    @ElVoField(physicalName = "activity_dtl")
    public void setActivity_dtl(String activity_dtl){
        this.activity_dtl = activity_dtl;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "write_syspayno")
    public String getWrite_syspayno(){
        return write_syspayno;
    }

    @ElVoField(physicalName = "write_syspayno")
    public void setWrite_syspayno(String write_syspayno){
        this.write_syspayno = write_syspayno;
    }

    @ElVoField(physicalName = "req_tel_no")
    public String getReq_tel_no(){
        return req_tel_no;
    }

    @ElVoField(physicalName = "req_tel_no")
    public void setReq_tel_no(String req_tel_no){
        this.req_tel_no = req_tel_no;
    }

    @ElVoField(physicalName = "org_cd")
    public String getOrg_cd(){
        return org_cd;
    }

    @ElVoField(physicalName = "org_cd")
    public void setOrg_cd(String org_cd){
        this.org_cd = org_cd;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public String getInvite_org_nm(){
        return invite_org_nm;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public void setInvite_org_nm(String invite_org_nm){
        this.invite_org_nm = invite_org_nm;
    }

    @ElVoField(physicalName = "invite_ceo_nm")
    public String getInvite_ceo_nm(){
        return invite_ceo_nm;
    }

    @ElVoField(physicalName = "invite_ceo_nm")
    public void setInvite_ceo_nm(String invite_ceo_nm){
        this.invite_ceo_nm = invite_ceo_nm;
    }

    @ElVoField(physicalName = "invite_dept_nm")
    public String getInvite_dept_nm(){
        return invite_dept_nm;
    }

    @ElVoField(physicalName = "invite_dept_nm")
    public void setInvite_dept_nm(String invite_dept_nm){
        this.invite_dept_nm = invite_dept_nm;
    }

    @ElVoField(physicalName = "invite_tel_no")
    public String getInvite_tel_no(){
        return invite_tel_no;
    }

    @ElVoField(physicalName = "invite_tel_no")
    public void setInvite_tel_no(String invite_tel_no){
        this.invite_tel_no = invite_tel_no;
    }

    @ElVoField(physicalName = "invite_cause")
    public String getInvite_cause(){
        return invite_cause;
    }

    @ElVoField(physicalName = "invite_cause")
    public void setInvite_cause(String invite_cause){
        this.invite_cause = invite_cause;
    }

    @ElVoField(physicalName = "subject")
    public String getSubject(){
        return subject;
    }

    @ElVoField(physicalName = "subject")
    public void setSubject(String subject){
        this.subject = subject;
    }

    @ElVoField(physicalName = "region")
    public String getRegion(){
        return region;
    }

    @ElVoField(physicalName = "region")
    public void setRegion(String region){
        this.region = region;
    }

    @ElVoField(physicalName = "econo_gain_clsf")
    public String getEcono_gain_clsf(){
        return econo_gain_clsf;
    }

    @ElVoField(physicalName = "econo_gain_clsf")
    public void setEcono_gain_clsf(String econo_gain_clsf){
        this.econo_gain_clsf = econo_gain_clsf;
    }

    @ElVoField(physicalName = "reward_amt")
    public long getReward_amt(){
        return reward_amt;
    }

    @ElVoField(physicalName = "reward_amt")
    public void setReward_amt(long reward_amt){
        this.reward_amt = reward_amt;
    }

    @ElVoField(physicalName = "traffic_amt")
    public long getTraffic_amt(){
        return traffic_amt;
    }

    @ElVoField(physicalName = "traffic_amt")
    public void setTraffic_amt(long traffic_amt){
        this.traffic_amt = traffic_amt;
    }

    @ElVoField(physicalName = "stay_amt")
    public long getStay_amt(){
        return stay_amt;
    }

    @ElVoField(physicalName = "stay_amt")
    public void setStay_amt(long stay_amt){
        this.stay_amt = stay_amt;
    }

    @ElVoField(physicalName = "food_amt")
    public long getFood_amt(){
        return food_amt;
    }

    @ElVoField(physicalName = "food_amt")
    public void setFood_amt(long food_amt){
        this.food_amt = food_amt;
    }

    @ElVoField(physicalName = "cost_yn")
    public String getCost_yn(){
        return cost_yn;
    }

    @ElVoField(physicalName = "cost_yn")
    public void setCost_yn(String cost_yn){
        this.cost_yn = cost_yn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "period_minute")
    public String getPeriod_minute(){
        return period_minute;
    }

    @ElVoField(physicalName = "period_minute")
    public void setPeriod_minute(String period_minute){
        this.period_minute = period_minute;
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

    @ElVoField(physicalName = "attnce_clsf")
    public String getAttnce_clsf(){
        return attnce_clsf;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public void setAttnce_clsf(String attnce_clsf){
        this.attnce_clsf = attnce_clsf;
    }

    @ElVoField(physicalName = "st_daytm")
    public String getSt_daytm(){
        return st_daytm;
    }

    @ElVoField(physicalName = "st_daytm")
    public void setSt_daytm(String st_daytm){
        this.st_daytm = st_daytm;
    }

    @ElVoField(physicalName = "ed_daytm")
    public String getEd_daytm(){
        return ed_daytm;
    }

    @ElVoField(physicalName = "ed_daytm")
    public void setEd_daytm(String ed_daytm){
        this.ed_daytm = ed_daytm;
    }

    @ElVoField(physicalName = "req_daytm")
    public String getReq_daytm(){
        return req_daytm;
    }

    @ElVoField(physicalName = "req_daytm")
    public void setReq_daytm(String req_daytm){
        this.req_daytm = req_daytm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
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

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "activity_cd_nm")
    public String getActivity_cd_nm(){
        return activity_cd_nm;
    }

    @ElVoField(physicalName = "activity_cd_nm")
    public void setActivity_cd_nm(String activity_cd_nm){
        this.activity_cd_nm = activity_cd_nm;
    }

    @ElVoField(physicalName = "trip_goal")
    public String getTrip_goal(){
        return trip_goal;
    }

    @ElVoField(physicalName = "trip_goal")
    public void setTrip_goal(String trip_goal){
        this.trip_goal = trip_goal;
    }

    @ElVoField(physicalName = "trip_region")
    public String getTrip_region(){
        return trip_region;
    }

    @ElVoField(physicalName = "trip_region")
    public void setTrip_region(String trip_region){
        this.trip_region = trip_region;
    }

    @ElVoField(physicalName = "modify_item")
    public String getModify_item(){
        return modify_item;
    }

    @ElVoField(physicalName = "modify_item")
    public void setModify_item(String modify_item){
        this.modify_item = modify_item;
    }

    @ElVoField(physicalName = "modify_cause")
    public String getModify_cause(){
        return modify_cause;
    }

    @ElVoField(physicalName = "modify_cause")
    public void setModify_cause(String modify_cause){
        this.modify_cause = modify_cause;
    }

    @ElVoField(physicalName = "modify_daytm")
    public String getModify_daytm(){
        return modify_daytm;
    }

    @ElVoField(physicalName = "modify_daytm")
    public void setModify_daytm(String modify_daytm){
        this.modify_daytm = modify_daytm;
    }

    @ElVoField(physicalName = "sms_cnt")
    public String getSms_cnt(){
        return sms_cnt;
    }

    @ElVoField(physicalName = "sms_cnt")
    public void setSms_cnt(String sms_cnt){
        this.sms_cnt = sms_cnt;
    }

    @ElVoField(physicalName = "companion_cd")
    public String getCompanion_cd(){
        return companion_cd;
    }

    @ElVoField(physicalName = "companion_cd")
    public void setCompanion_cd(String companion_cd){
        this.companion_cd = companion_cd;
    }

    @ElVoField(physicalName = "companion_rs")
    public String getCompanion_rs(){
        return companion_rs;
    }

    @ElVoField(physicalName = "companion_rs")
    public void setCompanion_rs(String companion_rs){
        this.companion_rs = companion_rs;
    }

    @ElVoField(physicalName = "note")
    public String getNote(){
        return note;
    }

    @ElVoField(physicalName = "note")
    public void setNote(String note){
        this.note = note;
    }

    @ElVoField(physicalName = "acc_mon")
    public String getAcc_mon(){
        return acc_mon;
    }

    @ElVoField(physicalName = "acc_mon")
    public void setAcc_mon(String acc_mon){
        this.acc_mon = acc_mon;
    }

    @ElVoField(physicalName = "acc_mon_count")
    public int getAcc_mon_count(){
        return acc_mon_count;
    }

    @ElVoField(physicalName = "acc_mon_count")
    public void setAcc_mon_count(int acc_mon_count){
        this.acc_mon_count = acc_mon_count;
    }

    @ElVoField(physicalName = "acc_mon_hour")
    public String getAcc_mon_hour(){
        return acc_mon_hour;
    }

    @ElVoField(physicalName = "acc_mon_hour")
    public void setAcc_mon_hour(String acc_mon_hour){
        this.acc_mon_hour = acc_mon_hour;
    }

    @ElVoField(physicalName = "trip_days")
    public String getTrip_days(){
        return trip_days;
    }

    @ElVoField(physicalName = "trip_days")
    public void setTrip_days(String trip_days){
        this.trip_days = trip_days;
    }

    @ElVoField(physicalName = "divsn_nm")
    public String getDivsn_nm(){
        return divsn_nm;
    }

    @ElVoField(physicalName = "divsn_nm")
    public void setDivsn_nm(String divsn_nm){
        this.divsn_nm = divsn_nm;
    }

    @ElVoField(physicalName = "wrt_psn_nm")
    public String getWrt_psn_nm(){
        return wrt_psn_nm;
    }

    @ElVoField(physicalName = "wrt_psn_nm")
    public void setWrt_psn_nm(String wrt_psn_nm){
        this.wrt_psn_nm = wrt_psn_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrTripInviteVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("act_clsf").append("=").append(act_clsf).append(",");
        sb.append("act_clsf_nm").append("=").append(act_clsf_nm).append(",");
        sb.append("act_shape").append("=").append(act_shape).append(",");
        sb.append("trip_req_no").append("=").append(trip_req_no).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("trip_cd").append("=").append(trip_cd).append(",");
        sb.append("trip_cd_nm").append("=").append(trip_cd_nm).append(",");
        sb.append("report_cd").append("=").append(report_cd).append(",");
        sb.append("attend_cd").append("=").append(attend_cd).append(",");
        sb.append("activity_cd").append("=").append(activity_cd).append(",");
        sb.append("activity_dtl").append("=").append(activity_dtl).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("write_syspayno").append("=").append(write_syspayno).append(",");
        sb.append("req_tel_no").append("=").append(req_tel_no).append(",");
        sb.append("org_cd").append("=").append(org_cd).append(",");
        sb.append("invite_org_nm").append("=").append(invite_org_nm).append(",");
        sb.append("invite_ceo_nm").append("=").append(invite_ceo_nm).append(",");
        sb.append("invite_dept_nm").append("=").append(invite_dept_nm).append(",");
        sb.append("invite_tel_no").append("=").append(invite_tel_no).append(",");
        sb.append("invite_cause").append("=").append(invite_cause).append(",");
        sb.append("subject").append("=").append(subject).append(",");
        sb.append("region").append("=").append(region).append(",");
        sb.append("econo_gain_clsf").append("=").append(econo_gain_clsf).append(",");
        sb.append("reward_amt").append("=").append(reward_amt).append(",");
        sb.append("traffic_amt").append("=").append(traffic_amt).append(",");
        sb.append("stay_amt").append("=").append(stay_amt).append(",");
        sb.append("food_amt").append("=").append(food_amt).append(",");
        sb.append("cost_yn").append("=").append(cost_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("period_minute").append("=").append(period_minute).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("attnce_clsf").append("=").append(attnce_clsf).append(",");
        sb.append("st_daytm").append("=").append(st_daytm).append(",");
        sb.append("ed_daytm").append("=").append(ed_daytm).append(",");
        sb.append("req_daytm").append("=").append(req_daytm).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("activity_cd_nm").append("=").append(activity_cd_nm).append(",");
        sb.append("trip_goal").append("=").append(trip_goal).append(",");
        sb.append("trip_region").append("=").append(trip_region).append(",");
        sb.append("modify_item").append("=").append(modify_item).append(",");
        sb.append("modify_cause").append("=").append(modify_cause).append(",");
        sb.append("modify_daytm").append("=").append(modify_daytm).append(",");
        sb.append("sms_cnt").append("=").append(sms_cnt).append(",");
        sb.append("companion_cd").append("=").append(companion_cd).append(",");
        sb.append("companion_rs").append("=").append(companion_rs).append(",");
        sb.append("note").append("=").append(note).append(",");
        sb.append("acc_mon").append("=").append(acc_mon).append(",");
        sb.append("acc_mon_count").append("=").append(acc_mon_count).append(",");
        sb.append("acc_mon_hour").append("=").append(acc_mon_hour).append(",");
        sb.append("trip_days").append("=").append(trip_days).append(",");
        sb.append("divsn_nm").append("=").append(divsn_nm).append(",");
        sb.append("wrt_psn_nm").append("=").append(wrt_psn_nm);
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
