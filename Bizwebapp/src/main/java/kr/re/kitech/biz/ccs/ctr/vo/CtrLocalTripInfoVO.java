package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장정보")
public class CtrLocalTripInfoVO extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrLocalTripInfoVO(){
    }

    @ElDtoField(logicalName = "신청자시스템번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자사원번호", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청자부서명", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자직급", physicalName = "req_psn_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_posi;

    @ElDtoField(logicalName = "신청자부서", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "신청자부서신설일자", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자시스템번호", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "대행자시스템번호", physicalName = "agent_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_syspayno;

    @ElDtoField(logicalName = "비상연락처", physicalName = "emgnc_contac_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emgnc_contac_no;

    @ElDtoField(logicalName = "출장일자", physicalName = "biztrip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_ymd;

    @ElDtoField(logicalName = "출발시간", physicalName = "start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_time;

    @ElDtoField(logicalName = "도착시간", physicalName = "arriv_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_time;

    @ElDtoField(logicalName = "차량사용여부", physicalName = "car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_use_yn;

    @ElDtoField(logicalName = "출발지", physicalName = "start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region;

    @ElDtoField(logicalName = "도착지", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "출장장소", physicalName = "biztrip_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_land;

    @ElDtoField(logicalName = "면담자", physicalName = "major_intrv_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_intrv_psn;

    @ElDtoField(logicalName = "면담자연락처", physicalName = "major_intrv_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_intrv_tel;

    @ElDtoField(logicalName = "출장목적", physicalName = "biztrip_goal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal_clsf;

    @ElDtoField(logicalName = "출장목적비고", physicalName = "biztrip_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal;

    @ElDtoField(logicalName = "원내출장여부", physicalName = "is_internal_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_internal_region;

    @ElDtoField(logicalName = "계정/출장비 없음", physicalName = "accnt_no_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_use;

    @ElDtoField(logicalName = "방문처", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "금액", physicalName = "trafc_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trafc_fee;

    @ElDtoField(logicalName = "출장총액", physicalName = "tot_expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_expns;

    @ElDtoField(logicalName = "금액비고", physicalName = "trafc_fee_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trafc_fee_rmk;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정번호명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "회계코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "계정책임자시스템번호", physicalName = "accnt_respn_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_syspayno;

    @ElDtoField(logicalName = "계정책임자사원번호", physicalName = "accnt_respn_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_empno;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_respn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_nm;

    @ElDtoField(logicalName = "계정시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "계정상태", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "통제번호", physicalName = "bugt_ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "이지바로계정", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "학술대회명", physicalName = "pool_conf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pool_conf_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "동행자수", physicalName = "compn_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int compn_cnt;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        return req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn_posi")
    public String getReq_psn_posi(){
        return req_psn_posi;
    }

    @ElVoField(physicalName = "req_psn_posi")
    public void setReq_psn_posi(String req_psn_posi){
        this.req_psn_posi = req_psn_posi;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public String getAgent_psn_syspayno(){
        return agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public void setAgent_psn_syspayno(String agent_psn_syspayno){
        this.agent_psn_syspayno = agent_psn_syspayno;
    }

    @ElVoField(physicalName = "emgnc_contac_no")
    public String getEmgnc_contac_no(){
        return emgnc_contac_no;
    }

    @ElVoField(physicalName = "emgnc_contac_no")
    public void setEmgnc_contac_no(String emgnc_contac_no){
        this.emgnc_contac_no = emgnc_contac_no;
    }

    @ElVoField(physicalName = "biztrip_ymd")
    public String getBiztrip_ymd(){
        return biztrip_ymd;
    }

    @ElVoField(physicalName = "biztrip_ymd")
    public void setBiztrip_ymd(String biztrip_ymd){
        this.biztrip_ymd = biztrip_ymd;
    }

    @ElVoField(physicalName = "start_time")
    public String getStart_time(){
        return start_time;
    }

    @ElVoField(physicalName = "start_time")
    public void setStart_time(String start_time){
        this.start_time = start_time;
    }

    @ElVoField(physicalName = "arriv_time")
    public String getArriv_time(){
        return arriv_time;
    }

    @ElVoField(physicalName = "arriv_time")
    public void setArriv_time(String arriv_time){
        this.arriv_time = arriv_time;
    }

    @ElVoField(physicalName = "car_use_yn")
    public String getCar_use_yn(){
        return car_use_yn;
    }

    @ElVoField(physicalName = "car_use_yn")
    public void setCar_use_yn(String car_use_yn){
        this.car_use_yn = car_use_yn;
    }

    @ElVoField(physicalName = "start_region")
    public String getStart_region(){
        return start_region;
    }

    @ElVoField(physicalName = "start_region")
    public void setStart_region(String start_region){
        this.start_region = start_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "biztrip_land")
    public String getBiztrip_land(){
        return biztrip_land;
    }

    @ElVoField(physicalName = "biztrip_land")
    public void setBiztrip_land(String biztrip_land){
        this.biztrip_land = biztrip_land;
    }

    @ElVoField(physicalName = "major_intrv_psn")
    public String getMajor_intrv_psn(){
        return major_intrv_psn;
    }

    @ElVoField(physicalName = "major_intrv_psn")
    public void setMajor_intrv_psn(String major_intrv_psn){
        this.major_intrv_psn = major_intrv_psn;
    }

    @ElVoField(physicalName = "major_intrv_tel")
    public String getMajor_intrv_tel(){
        return major_intrv_tel;
    }

    @ElVoField(physicalName = "major_intrv_tel")
    public void setMajor_intrv_tel(String major_intrv_tel){
        this.major_intrv_tel = major_intrv_tel;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf")
    public String getBiztrip_goal_clsf(){
        return biztrip_goal_clsf;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf")
    public void setBiztrip_goal_clsf(String biztrip_goal_clsf){
        this.biztrip_goal_clsf = biztrip_goal_clsf;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public String getBiztrip_goal(){
        return biztrip_goal;
    }

    @ElVoField(physicalName = "biztrip_goal")
    public void setBiztrip_goal(String biztrip_goal){
        this.biztrip_goal = biztrip_goal;
    }

    @ElVoField(physicalName = "is_internal_region")
    public String getIs_internal_region(){
        return is_internal_region;
    }

    @ElVoField(physicalName = "is_internal_region")
    public void setIs_internal_region(String is_internal_region){
        this.is_internal_region = is_internal_region;
    }

    @ElVoField(physicalName = "accnt_no_use")
    public String getAccnt_no_use(){
        return accnt_no_use;
    }

    @ElVoField(physicalName = "accnt_no_use")
    public void setAccnt_no_use(String accnt_no_use){
        this.accnt_no_use = accnt_no_use;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "trafc_fee")
    public long getTrafc_fee(){
        return trafc_fee;
    }

    @ElVoField(physicalName = "trafc_fee")
    public void setTrafc_fee(long trafc_fee){
        this.trafc_fee = trafc_fee;
    }

    @ElVoField(physicalName = "tot_expns")
    public long getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(long tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "trafc_fee_rmk")
    public String getTrafc_fee_rmk(){
        return trafc_fee_rmk;
    }

    @ElVoField(physicalName = "trafc_fee_rmk")
    public void setTrafc_fee_rmk(String trafc_fee_rmk){
        this.trafc_fee_rmk = trafc_fee_rmk;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public String getAccnt_respn_psn_syspayno(){
        return accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public void setAccnt_respn_psn_syspayno(String accnt_respn_psn_syspayno){
        this.accnt_respn_psn_syspayno = accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_empno")
    public String getAccnt_respn_psn_empno(){
        return accnt_respn_psn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_empno")
    public void setAccnt_respn_psn_empno(String accnt_respn_psn_empno){
        this.accnt_respn_psn_empno = accnt_respn_psn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_nm")
    public String getAccnt_respn_psn_nm(){
        return accnt_respn_psn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_psn_nm")
    public void setAccnt_respn_psn_nm(String accnt_respn_psn_nm){
        this.accnt_respn_psn_nm = accnt_respn_psn_nm;
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

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_no")
    public String getBugt_ctrl_no(){
        return bugt_ctrl_no;
    }

    @ElVoField(physicalName = "bugt_ctrl_no")
    public void setBugt_ctrl_no(String bugt_ctrl_no){
        this.bugt_ctrl_no = bugt_ctrl_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "pool_conf_nm")
    public String getPool_conf_nm(){
        return pool_conf_nm;
    }

    @ElVoField(physicalName = "pool_conf_nm")
    public void setPool_conf_nm(String pool_conf_nm){
        this.pool_conf_nm = pool_conf_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "compn_cnt")
    public int getCompn_cnt(){
        return compn_cnt;
    }

    @ElVoField(physicalName = "compn_cnt")
    public void setCompn_cnt(int compn_cnt){
        this.compn_cnt = compn_cnt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrLocalTripInfoVO [");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn_posi").append("=").append(req_psn_posi).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("agent_psn_syspayno").append("=").append(agent_psn_syspayno).append(",");
        sb.append("emgnc_contac_no").append("=").append(emgnc_contac_no).append(",");
        sb.append("biztrip_ymd").append("=").append(biztrip_ymd).append(",");
        sb.append("start_time").append("=").append(start_time).append(",");
        sb.append("arriv_time").append("=").append(arriv_time).append(",");
        sb.append("car_use_yn").append("=").append(car_use_yn).append(",");
        sb.append("start_region").append("=").append(start_region).append(",");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("biztrip_land").append("=").append(biztrip_land).append(",");
        sb.append("major_intrv_psn").append("=").append(major_intrv_psn).append(",");
        sb.append("major_intrv_tel").append("=").append(major_intrv_tel).append(",");
        sb.append("biztrip_goal_clsf").append("=").append(biztrip_goal_clsf).append(",");
        sb.append("biztrip_goal").append("=").append(biztrip_goal).append(",");
        sb.append("is_internal_region").append("=").append(is_internal_region).append(",");
        sb.append("accnt_no_use").append("=").append(accnt_no_use).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("trafc_fee").append("=").append(trafc_fee).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("trafc_fee_rmk").append("=").append(trafc_fee_rmk).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("accnt_respn_psn_syspayno").append("=").append(accnt_respn_psn_syspayno).append(",");
        sb.append("accnt_respn_psn_empno").append("=").append(accnt_respn_psn_empno).append(",");
        sb.append("accnt_respn_psn_nm").append("=").append(accnt_respn_psn_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("bugt_ctrl_no").append("=").append(bugt_ctrl_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("pool_conf_nm").append("=").append(pool_conf_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("compn_cnt").append("=").append(compn_cnt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no);
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
