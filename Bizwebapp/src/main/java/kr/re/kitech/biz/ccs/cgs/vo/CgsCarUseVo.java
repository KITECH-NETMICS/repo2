package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 차량배차VO")
public class CgsCarUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCarUseVo(){
    }

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "반납일시", physicalName = "retrn_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_daytm;

    @ElDtoField(logicalName = "신청자지역코드", physicalName = "req_region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_region_cd;

    @ElDtoField(logicalName = "차량번호", physicalName = "car_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_no;

    @ElDtoField(logicalName = "사용시작일자", physicalName = "use_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_orign_ymd;

    @ElDtoField(logicalName = "사용종료일자", physicalName = "use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_ymd;

    @ElDtoField(logicalName = "사용시작시간", physicalName = "use_orign_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_orign_time;

    @ElDtoField(logicalName = "사용종료시간", physicalName = "use_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_time;

    @ElDtoField(logicalName = "사용기간", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ymd;

    @ElDtoField(logicalName = "차량정보", physicalName = "car_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_info;

    @ElDtoField(logicalName = "신청순서", physicalName = "req_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_seq;

    @ElDtoField(logicalName = "차량모델명", physicalName = "carmdl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String carmdl_nm;

    @ElDtoField(logicalName = "행선지", physicalName = "destin", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String destin;

    @ElDtoField(logicalName = "신청지", physicalName = "req_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_region_nm;

    @ElDtoField(logicalName = "운전자시스템게인번호", physicalName = "driv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_syspayno;

    @ElDtoField(logicalName = "운전자명", physicalName = "driv_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_nm;

    @ElDtoField(logicalName = "사업내용", physicalName = "bsns_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_contnt;

    @ElDtoField(logicalName = "업무우선순위", physicalName = "bizwrk_prity_rank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_prity_rank;

    @ElDtoField(logicalName = "신청자전화번호", physicalName = "req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_tel;

    @ElDtoField(logicalName = "관리자명", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "신청상태명", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "수령일자", physicalName = "recv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_ymd;

    @ElDtoField(logicalName = "수령시간", physicalName = "recv_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_time;

    @ElDtoField(logicalName = "수령일시", physicalName = "recv_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_daytm;

    @ElDtoField(logicalName = "반납일자", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;

    @ElDtoField(logicalName = "반납시간", physicalName = "retrn_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_time;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "탑승자시스템개인번호", physicalName = "onbrd_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String onbrd_psn;

    @ElDtoField(logicalName = "신청자부서", physicalName = "req_psn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept;

    @ElDtoField(logicalName = "신청자부서신설일자", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "신청자메일주소", physicalName = "req_psn_mail_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_mail_addr;

    @ElDtoField(logicalName = "담당자시스템개인번호", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "출발메타", physicalName = "start_meter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_meter;

    @ElDtoField(logicalName = "도착메타", physicalName = "arriv_meter", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_meter;

    @ElDtoField(logicalName = "운행거리", physicalName = "mvmnt_dist", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mvmnt_dist;

    @ElDtoField(logicalName = "출발유량", physicalName = "start_flow", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_flow;

    @ElDtoField(logicalName = "도착유량", physicalName = "arriv_flow", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_flow;

    @ElDtoField(logicalName = "보급유량", physicalName = "suply_flow", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String suply_flow;

    @ElDtoField(logicalName = "차량사용여", physicalName = "biztrip_car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_car_use_yn;

    @ElDtoField(logicalName = "가결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "등록자시스개인템번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "운전자시스템개인번호1", physicalName = "driv_psn_syspayno_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_syspayno_1;

    @ElDtoField(logicalName = "운전자명1", physicalName = "driv_psn_nm_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_nm_1;

    @ElDtoField(logicalName = "운전자시스템개인번호2", physicalName = "driv_psn_syspayno_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_syspayno_2;

    @ElDtoField(logicalName = "운전자명2", physicalName = "driv_psn_nm_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_psn_nm_2;

    @ElDtoField(logicalName = "금액변경", physicalName = "charge_amount", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charge_amount;

    @ElDtoField(logicalName = "차량상세정보", physicalName = "rpt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt;

    @ElDtoField(logicalName = "관리자시스템개인번호", physicalName = "admin_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String admin_syspayno;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "차량사용여부", physicalName = "car_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String car_use_yn;

    @ElDtoField(logicalName = "지역코드", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "운전자번호", physicalName = "driv_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_empno;

    @ElDtoField(logicalName = "운전자번호1", physicalName = "driv_empno_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_empno_1;

    @ElDtoField(logicalName = "운전자번호2", physicalName = "driv_empno_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String driv_empno_2;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "관리자명", physicalName = "admin_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String admin_nm;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "승인 버튼 여부", physicalName = "isSend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isSend;

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "retrn_daytm")
    public String getRetrn_daytm(){
        return retrn_daytm;
    }

    @ElVoField(physicalName = "retrn_daytm")
    public void setRetrn_daytm(String retrn_daytm){
        this.retrn_daytm = retrn_daytm;
    }

    @ElVoField(physicalName = "req_region_cd")
    public String getReq_region_cd(){
        return req_region_cd;
    }

    @ElVoField(physicalName = "req_region_cd")
    public void setReq_region_cd(String req_region_cd){
        this.req_region_cd = req_region_cd;
    }

    @ElVoField(physicalName = "car_no")
    public String getCar_no(){
        return car_no;
    }

    @ElVoField(physicalName = "car_no")
    public void setCar_no(String car_no){
        this.car_no = car_no;
    }

    @ElVoField(physicalName = "use_orign_ymd")
    public String getUse_orign_ymd(){
        return use_orign_ymd;
    }

    @ElVoField(physicalName = "use_orign_ymd")
    public void setUse_orign_ymd(String use_orign_ymd){
        this.use_orign_ymd = use_orign_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public String getUse_cls_ymd(){
        return use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public void setUse_cls_ymd(String use_cls_ymd){
        this.use_cls_ymd = use_cls_ymd;
    }

    @ElVoField(physicalName = "use_orign_time")
    public String getUse_orign_time(){
        return use_orign_time;
    }

    @ElVoField(physicalName = "use_orign_time")
    public void setUse_orign_time(String use_orign_time){
        this.use_orign_time = use_orign_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public String getUse_cls_time(){
        return use_cls_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public void setUse_cls_time(String use_cls_time){
        this.use_cls_time = use_cls_time;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        return use_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "car_info")
    public String getCar_info(){
        return car_info;
    }

    @ElVoField(physicalName = "car_info")
    public void setCar_info(String car_info){
        this.car_info = car_info;
    }

    @ElVoField(physicalName = "req_seq")
    public String getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(String req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "carmdl_nm")
    public String getCarmdl_nm(){
        return carmdl_nm;
    }

    @ElVoField(physicalName = "carmdl_nm")
    public void setCarmdl_nm(String carmdl_nm){
        this.carmdl_nm = carmdl_nm;
    }

    @ElVoField(physicalName = "destin")
    public String getDestin(){
        return destin;
    }

    @ElVoField(physicalName = "destin")
    public void setDestin(String destin){
        this.destin = destin;
    }

    @ElVoField(physicalName = "req_region_nm")
    public String getReq_region_nm(){
        return req_region_nm;
    }

    @ElVoField(physicalName = "req_region_nm")
    public void setReq_region_nm(String req_region_nm){
        this.req_region_nm = req_region_nm;
    }

    @ElVoField(physicalName = "driv_psn_syspayno")
    public String getDriv_psn_syspayno(){
        return driv_psn_syspayno;
    }

    @ElVoField(physicalName = "driv_psn_syspayno")
    public void setDriv_psn_syspayno(String driv_psn_syspayno){
        this.driv_psn_syspayno = driv_psn_syspayno;
    }

    @ElVoField(physicalName = "driv_psn_nm")
    public String getDriv_psn_nm(){
        return driv_psn_nm;
    }

    @ElVoField(physicalName = "driv_psn_nm")
    public void setDriv_psn_nm(String driv_psn_nm){
        this.driv_psn_nm = driv_psn_nm;
    }

    @ElVoField(physicalName = "bsns_contnt")
    public String getBsns_contnt(){
        return bsns_contnt;
    }

    @ElVoField(physicalName = "bsns_contnt")
    public void setBsns_contnt(String bsns_contnt){
        this.bsns_contnt = bsns_contnt;
    }

    @ElVoField(physicalName = "bizwrk_prity_rank")
    public String getBizwrk_prity_rank(){
        return bizwrk_prity_rank;
    }

    @ElVoField(physicalName = "bizwrk_prity_rank")
    public void setBizwrk_prity_rank(String bizwrk_prity_rank){
        this.bizwrk_prity_rank = bizwrk_prity_rank;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public String getReq_psn_tel(){
        return req_psn_tel;
    }

    @ElVoField(physicalName = "req_psn_tel")
    public void setReq_psn_tel(String req_psn_tel){
        this.req_psn_tel = req_psn_tel;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "recv_ymd")
    public String getRecv_ymd(){
        return recv_ymd;
    }

    @ElVoField(physicalName = "recv_ymd")
    public void setRecv_ymd(String recv_ymd){
        this.recv_ymd = recv_ymd;
    }

    @ElVoField(physicalName = "recv_time")
    public String getRecv_time(){
        return recv_time;
    }

    @ElVoField(physicalName = "recv_time")
    public void setRecv_time(String recv_time){
        this.recv_time = recv_time;
    }

    @ElVoField(physicalName = "recv_daytm")
    public String getRecv_daytm(){
        return recv_daytm;
    }

    @ElVoField(physicalName = "recv_daytm")
    public void setRecv_daytm(String recv_daytm){
        this.recv_daytm = recv_daytm;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public String getRetrn_ymd(){
        return retrn_ymd;
    }

    @ElVoField(physicalName = "retrn_ymd")
    public void setRetrn_ymd(String retrn_ymd){
        this.retrn_ymd = retrn_ymd;
    }

    @ElVoField(physicalName = "retrn_time")
    public String getRetrn_time(){
        return retrn_time;
    }

    @ElVoField(physicalName = "retrn_time")
    public void setRetrn_time(String retrn_time){
        this.retrn_time = retrn_time;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "onbrd_psn")
    public String getOnbrd_psn(){
        return onbrd_psn;
    }

    @ElVoField(physicalName = "onbrd_psn")
    public void setOnbrd_psn(String onbrd_psn){
        this.onbrd_psn = onbrd_psn;
    }

    @ElVoField(physicalName = "req_psn_dept")
    public String getReq_psn_dept(){
        return req_psn_dept;
    }

    @ElVoField(physicalName = "req_psn_dept")
    public void setReq_psn_dept(String req_psn_dept){
        this.req_psn_dept = req_psn_dept;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public String getReq_psn_dept_new_ymd(){
        return req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public void setReq_psn_dept_new_ymd(String req_psn_dept_new_ymd){
        this.req_psn_dept_new_ymd = req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_mail_addr")
    public String getReq_psn_mail_addr(){
        return req_psn_mail_addr;
    }

    @ElVoField(physicalName = "req_psn_mail_addr")
    public void setReq_psn_mail_addr(String req_psn_mail_addr){
        this.req_psn_mail_addr = req_psn_mail_addr;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "start_meter")
    public String getStart_meter(){
        return start_meter;
    }

    @ElVoField(physicalName = "start_meter")
    public void setStart_meter(String start_meter){
        this.start_meter = start_meter;
    }

    @ElVoField(physicalName = "arriv_meter")
    public String getArriv_meter(){
        return arriv_meter;
    }

    @ElVoField(physicalName = "arriv_meter")
    public void setArriv_meter(String arriv_meter){
        this.arriv_meter = arriv_meter;
    }

    @ElVoField(physicalName = "mvmnt_dist")
    public String getMvmnt_dist(){
        return mvmnt_dist;
    }

    @ElVoField(physicalName = "mvmnt_dist")
    public void setMvmnt_dist(String mvmnt_dist){
        this.mvmnt_dist = mvmnt_dist;
    }

    @ElVoField(physicalName = "start_flow")
    public String getStart_flow(){
        return start_flow;
    }

    @ElVoField(physicalName = "start_flow")
    public void setStart_flow(String start_flow){
        this.start_flow = start_flow;
    }

    @ElVoField(physicalName = "arriv_flow")
    public String getArriv_flow(){
        return arriv_flow;
    }

    @ElVoField(physicalName = "arriv_flow")
    public void setArriv_flow(String arriv_flow){
        this.arriv_flow = arriv_flow;
    }

    @ElVoField(physicalName = "suply_flow")
    public String getSuply_flow(){
        return suply_flow;
    }

    @ElVoField(physicalName = "suply_flow")
    public void setSuply_flow(String suply_flow){
        this.suply_flow = suply_flow;
    }

    @ElVoField(physicalName = "biztrip_car_use_yn")
    public String getBiztrip_car_use_yn(){
        return biztrip_car_use_yn;
    }

    @ElVoField(physicalName = "biztrip_car_use_yn")
    public void setBiztrip_car_use_yn(String biztrip_car_use_yn){
        this.biztrip_car_use_yn = biztrip_car_use_yn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "driv_psn_syspayno_1")
    public String getDriv_psn_syspayno_1(){
        return driv_psn_syspayno_1;
    }

    @ElVoField(physicalName = "driv_psn_syspayno_1")
    public void setDriv_psn_syspayno_1(String driv_psn_syspayno_1){
        this.driv_psn_syspayno_1 = driv_psn_syspayno_1;
    }

    @ElVoField(physicalName = "driv_psn_nm_1")
    public String getDriv_psn_nm_1(){
        return driv_psn_nm_1;
    }

    @ElVoField(physicalName = "driv_psn_nm_1")
    public void setDriv_psn_nm_1(String driv_psn_nm_1){
        this.driv_psn_nm_1 = driv_psn_nm_1;
    }

    @ElVoField(physicalName = "driv_psn_syspayno_2")
    public String getDriv_psn_syspayno_2(){
        return driv_psn_syspayno_2;
    }

    @ElVoField(physicalName = "driv_psn_syspayno_2")
    public void setDriv_psn_syspayno_2(String driv_psn_syspayno_2){
        this.driv_psn_syspayno_2 = driv_psn_syspayno_2;
    }

    @ElVoField(physicalName = "driv_psn_nm_2")
    public String getDriv_psn_nm_2(){
        return driv_psn_nm_2;
    }

    @ElVoField(physicalName = "driv_psn_nm_2")
    public void setDriv_psn_nm_2(String driv_psn_nm_2){
        this.driv_psn_nm_2 = driv_psn_nm_2;
    }

    @ElVoField(physicalName = "charge_amount")
    public String getCharge_amount(){
        return charge_amount;
    }

    @ElVoField(physicalName = "charge_amount")
    public void setCharge_amount(String charge_amount){
        this.charge_amount = charge_amount;
    }

    @ElVoField(physicalName = "rpt")
    public String getRpt(){
        return rpt;
    }

    @ElVoField(physicalName = "rpt")
    public void setRpt(String rpt){
        this.rpt = rpt;
    }

    @ElVoField(physicalName = "admin_syspayno")
    public String getAdmin_syspayno(){
        return admin_syspayno;
    }

    @ElVoField(physicalName = "admin_syspayno")
    public void setAdmin_syspayno(String admin_syspayno){
        this.admin_syspayno = admin_syspayno;
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

    @ElVoField(physicalName = "car_use_yn")
    public String getCar_use_yn(){
        return car_use_yn;
    }

    @ElVoField(physicalName = "car_use_yn")
    public void setCar_use_yn(String car_use_yn){
        this.car_use_yn = car_use_yn;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "driv_empno")
    public String getDriv_empno(){
        return driv_empno;
    }

    @ElVoField(physicalName = "driv_empno")
    public void setDriv_empno(String driv_empno){
        this.driv_empno = driv_empno;
    }

    @ElVoField(physicalName = "driv_empno_1")
    public String getDriv_empno_1(){
        return driv_empno_1;
    }

    @ElVoField(physicalName = "driv_empno_1")
    public void setDriv_empno_1(String driv_empno_1){
        this.driv_empno_1 = driv_empno_1;
    }

    @ElVoField(physicalName = "driv_empno_2")
    public String getDriv_empno_2(){
        return driv_empno_2;
    }

    @ElVoField(physicalName = "driv_empno_2")
    public void setDriv_empno_2(String driv_empno_2){
        this.driv_empno_2 = driv_empno_2;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "admin_nm")
    public String getAdmin_nm(){
        return admin_nm;
    }

    @ElVoField(physicalName = "admin_nm")
    public void setAdmin_nm(String admin_nm){
        this.admin_nm = admin_nm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "isSend")
    public String getIsSend(){
        return isSend;
    }

    @ElVoField(physicalName = "isSend")
    public void setIsSend(String isSend){
        this.isSend = isSend;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCarUseVo [");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("retrn_daytm").append("=").append(retrn_daytm).append(",");
        sb.append("req_region_cd").append("=").append(req_region_cd).append(",");
        sb.append("car_no").append("=").append(car_no).append(",");
        sb.append("use_orign_ymd").append("=").append(use_orign_ymd).append(",");
        sb.append("use_cls_ymd").append("=").append(use_cls_ymd).append(",");
        sb.append("use_orign_time").append("=").append(use_orign_time).append(",");
        sb.append("use_cls_time").append("=").append(use_cls_time).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("car_info").append("=").append(car_info).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("carmdl_nm").append("=").append(carmdl_nm).append(",");
        sb.append("destin").append("=").append(destin).append(",");
        sb.append("req_region_nm").append("=").append(req_region_nm).append(",");
        sb.append("driv_psn_syspayno").append("=").append(driv_psn_syspayno).append(",");
        sb.append("driv_psn_nm").append("=").append(driv_psn_nm).append(",");
        sb.append("bsns_contnt").append("=").append(bsns_contnt).append(",");
        sb.append("bizwrk_prity_rank").append("=").append(bizwrk_prity_rank).append(",");
        sb.append("req_psn_tel").append("=").append(req_psn_tel).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("recv_ymd").append("=").append(recv_ymd).append(",");
        sb.append("recv_time").append("=").append(recv_time).append(",");
        sb.append("recv_daytm").append("=").append(recv_daytm).append(",");
        sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
        sb.append("retrn_time").append("=").append(retrn_time).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("onbrd_psn").append("=").append(onbrd_psn).append(",");
        sb.append("req_psn_dept").append("=").append(req_psn_dept).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("req_psn_mail_addr").append("=").append(req_psn_mail_addr).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("start_meter").append("=").append(start_meter).append(",");
        sb.append("arriv_meter").append("=").append(arriv_meter).append(",");
        sb.append("mvmnt_dist").append("=").append(mvmnt_dist).append(",");
        sb.append("start_flow").append("=").append(start_flow).append(",");
        sb.append("arriv_flow").append("=").append(arriv_flow).append(",");
        sb.append("suply_flow").append("=").append(suply_flow).append(",");
        sb.append("biztrip_car_use_yn").append("=").append(biztrip_car_use_yn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("driv_psn_syspayno_1").append("=").append(driv_psn_syspayno_1).append(",");
        sb.append("driv_psn_nm_1").append("=").append(driv_psn_nm_1).append(",");
        sb.append("driv_psn_syspayno_2").append("=").append(driv_psn_syspayno_2).append(",");
        sb.append("driv_psn_nm_2").append("=").append(driv_psn_nm_2).append(",");
        sb.append("charge_amount").append("=").append(charge_amount).append(",");
        sb.append("rpt").append("=").append(rpt).append(",");
        sb.append("admin_syspayno").append("=").append(admin_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("car_use_yn").append("=").append(car_use_yn).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("driv_empno").append("=").append(driv_empno).append(",");
        sb.append("driv_empno_1").append("=").append(driv_empno_1).append(",");
        sb.append("driv_empno_2").append("=").append(driv_empno_2).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("admin_nm").append("=").append(admin_nm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("isSend").append("=").append(isSend);
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
