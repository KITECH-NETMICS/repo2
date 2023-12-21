package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 기숙사VO")
public class CgsDormVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsDormVo(){
    }

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "지역코드", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "기숙사구분", physicalName = "dorm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dorm_clsf;

    @ElDtoField(logicalName = "기숙사구분명", physicalName = "dorm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dorm_clsf_nm;

    @ElDtoField(logicalName = "숙소구분", physicalName = "room_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_clsf;

    @ElDtoField(logicalName = "숙소구분명", physicalName = "room_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_clsf_nm;

    @ElDtoField(logicalName = "개수", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "사용자시스템개인번호", physicalName = "use_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_syspayno;

    @ElDtoField(logicalName = "사용자성별", physicalName = "use_psn_sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_sex;

    @ElDtoField(logicalName = "사용시작일자", physicalName = "use_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_from_ymd;

    @ElDtoField(logicalName = "사용종료일자", physicalName = "use_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_to_ymd;

    @ElDtoField(logicalName = "숙박구분", physicalName = "stay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stay_clsf;

    @ElDtoField(logicalName = "방코드", physicalName = "room_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_cd;

    @ElDtoField(logicalName = "방번호", physicalName = "room_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_no;

    @ElDtoField(logicalName = "기숙사종류", physicalName = "room_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_kind;

    @ElDtoField(logicalName = "기숙사종류명", physicalName = "room_kind_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String room_kind_nm;

    @ElDtoField(logicalName = "숙박구분명", physicalName = "stay_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stay_clsf_nm;

    @ElDtoField(logicalName = "사용자성별", physicalName = "use_psn_sex_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_sex_nm;

    @ElDtoField(logicalName = "사용자구분", physicalName = "use_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_clsf;

    @ElDtoField(logicalName = "사용자구분명", physicalName = "use_psn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_clsf_nm;

    @ElDtoField(logicalName = "in_psn_use_fee", physicalName = "in_psn_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String in_psn_use_fee;

    @ElDtoField(logicalName = "out_psn_use_fee", physicalName = "out_psn_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_psn_use_fee;

    @ElDtoField(logicalName = "month_in_use_fee", physicalName = "month_in_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_in_use_fee;

    @ElDtoField(logicalName = "month_out_use_fee", physicalName = "month_out_use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_out_use_fee;

    @ElDtoField(logicalName = "사용료", physicalName = "use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_fee;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "auto_approval_yn", physicalName = "auto_approval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auto_approval_yn;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "auto_approval_yn_nm", physicalName = "auto_approval_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auto_approval_yn_nm;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "사용자명", physicalName = "use_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_nm;

    @ElDtoField(logicalName = "사용자부서명", physicalName = "use_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_dept_nm;

    @ElDtoField(logicalName = "사용자번호", physicalName = "use_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_tel;

    @ElDtoField(logicalName = "사용자메일", physicalName = "use_psn_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_psn_mail;

    @ElDtoField(logicalName = "사유", physicalName = "req_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_resn;

    @ElDtoField(logicalName = "방구분", physicalName = "req_room_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_room_clsf;

    @ElDtoField(logicalName = "방코드", physicalName = "req_room_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_room_cd;

    @ElDtoField(logicalName = "all_cnt", physicalName = "all_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String all_cnt;

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "dorm_clsf")
    public String getDorm_clsf(){
        return dorm_clsf;
    }

    @ElVoField(physicalName = "dorm_clsf")
    public void setDorm_clsf(String dorm_clsf){
        this.dorm_clsf = dorm_clsf;
    }

    @ElVoField(physicalName = "dorm_clsf_nm")
    public String getDorm_clsf_nm(){
        return dorm_clsf_nm;
    }

    @ElVoField(physicalName = "dorm_clsf_nm")
    public void setDorm_clsf_nm(String dorm_clsf_nm){
        this.dorm_clsf_nm = dorm_clsf_nm;
    }

    @ElVoField(physicalName = "room_clsf")
    public String getRoom_clsf(){
        return room_clsf;
    }

    @ElVoField(physicalName = "room_clsf")
    public void setRoom_clsf(String room_clsf){
        this.room_clsf = room_clsf;
    }

    @ElVoField(physicalName = "room_clsf_nm")
    public String getRoom_clsf_nm(){
        return room_clsf_nm;
    }

    @ElVoField(physicalName = "room_clsf_nm")
    public void setRoom_clsf_nm(String room_clsf_nm){
        this.room_clsf_nm = room_clsf_nm;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "use_psn_syspayno")
    public String getUse_psn_syspayno(){
        return use_psn_syspayno;
    }

    @ElVoField(physicalName = "use_psn_syspayno")
    public void setUse_psn_syspayno(String use_psn_syspayno){
        this.use_psn_syspayno = use_psn_syspayno;
    }

    @ElVoField(physicalName = "use_psn_sex")
    public String getUse_psn_sex(){
        return use_psn_sex;
    }

    @ElVoField(physicalName = "use_psn_sex")
    public void setUse_psn_sex(String use_psn_sex){
        this.use_psn_sex = use_psn_sex;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public String getUse_from_ymd(){
        return use_from_ymd;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public void setUse_from_ymd(String use_from_ymd){
        this.use_from_ymd = use_from_ymd;
    }

    @ElVoField(physicalName = "use_to_ymd")
    public String getUse_to_ymd(){
        return use_to_ymd;
    }

    @ElVoField(physicalName = "use_to_ymd")
    public void setUse_to_ymd(String use_to_ymd){
        this.use_to_ymd = use_to_ymd;
    }

    @ElVoField(physicalName = "stay_clsf")
    public String getStay_clsf(){
        return stay_clsf;
    }

    @ElVoField(physicalName = "stay_clsf")
    public void setStay_clsf(String stay_clsf){
        this.stay_clsf = stay_clsf;
    }

    @ElVoField(physicalName = "room_cd")
    public String getRoom_cd(){
        return room_cd;
    }

    @ElVoField(physicalName = "room_cd")
    public void setRoom_cd(String room_cd){
        this.room_cd = room_cd;
    }

    @ElVoField(physicalName = "room_no")
    public String getRoom_no(){
        return room_no;
    }

    @ElVoField(physicalName = "room_no")
    public void setRoom_no(String room_no){
        this.room_no = room_no;
    }

    @ElVoField(physicalName = "room_kind")
    public String getRoom_kind(){
        return room_kind;
    }

    @ElVoField(physicalName = "room_kind")
    public void setRoom_kind(String room_kind){
        this.room_kind = room_kind;
    }

    @ElVoField(physicalName = "room_kind_nm")
    public String getRoom_kind_nm(){
        return room_kind_nm;
    }

    @ElVoField(physicalName = "room_kind_nm")
    public void setRoom_kind_nm(String room_kind_nm){
        this.room_kind_nm = room_kind_nm;
    }

    @ElVoField(physicalName = "stay_clsf_nm")
    public String getStay_clsf_nm(){
        return stay_clsf_nm;
    }

    @ElVoField(physicalName = "stay_clsf_nm")
    public void setStay_clsf_nm(String stay_clsf_nm){
        this.stay_clsf_nm = stay_clsf_nm;
    }

    @ElVoField(physicalName = "use_psn_sex_nm")
    public String getUse_psn_sex_nm(){
        return use_psn_sex_nm;
    }

    @ElVoField(physicalName = "use_psn_sex_nm")
    public void setUse_psn_sex_nm(String use_psn_sex_nm){
        this.use_psn_sex_nm = use_psn_sex_nm;
    }

    @ElVoField(physicalName = "use_psn_clsf")
    public String getUse_psn_clsf(){
        return use_psn_clsf;
    }

    @ElVoField(physicalName = "use_psn_clsf")
    public void setUse_psn_clsf(String use_psn_clsf){
        this.use_psn_clsf = use_psn_clsf;
    }

    @ElVoField(physicalName = "use_psn_clsf_nm")
    public String getUse_psn_clsf_nm(){
        return use_psn_clsf_nm;
    }

    @ElVoField(physicalName = "use_psn_clsf_nm")
    public void setUse_psn_clsf_nm(String use_psn_clsf_nm){
        this.use_psn_clsf_nm = use_psn_clsf_nm;
    }

    @ElVoField(physicalName = "in_psn_use_fee")
    public String getIn_psn_use_fee(){
        return in_psn_use_fee;
    }

    @ElVoField(physicalName = "in_psn_use_fee")
    public void setIn_psn_use_fee(String in_psn_use_fee){
        this.in_psn_use_fee = in_psn_use_fee;
    }

    @ElVoField(physicalName = "out_psn_use_fee")
    public String getOut_psn_use_fee(){
        return out_psn_use_fee;
    }

    @ElVoField(physicalName = "out_psn_use_fee")
    public void setOut_psn_use_fee(String out_psn_use_fee){
        this.out_psn_use_fee = out_psn_use_fee;
    }

    @ElVoField(physicalName = "month_in_use_fee")
    public String getMonth_in_use_fee(){
        return month_in_use_fee;
    }

    @ElVoField(physicalName = "month_in_use_fee")
    public void setMonth_in_use_fee(String month_in_use_fee){
        this.month_in_use_fee = month_in_use_fee;
    }

    @ElVoField(physicalName = "month_out_use_fee")
    public String getMonth_out_use_fee(){
        return month_out_use_fee;
    }

    @ElVoField(physicalName = "month_out_use_fee")
    public void setMonth_out_use_fee(String month_out_use_fee){
        this.month_out_use_fee = month_out_use_fee;
    }

    @ElVoField(physicalName = "use_fee")
    public String getUse_fee(){
        return use_fee;
    }

    @ElVoField(physicalName = "use_fee")
    public void setUse_fee(String use_fee){
        this.use_fee = use_fee;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "auto_approval_yn")
    public String getAuto_approval_yn(){
        return auto_approval_yn;
    }

    @ElVoField(physicalName = "auto_approval_yn")
    public void setAuto_approval_yn(String auto_approval_yn){
        this.auto_approval_yn = auto_approval_yn;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "auto_approval_yn_nm")
    public String getAuto_approval_yn_nm(){
        return auto_approval_yn_nm;
    }

    @ElVoField(physicalName = "auto_approval_yn_nm")
    public void setAuto_approval_yn_nm(String auto_approval_yn_nm){
        this.auto_approval_yn_nm = auto_approval_yn_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "use_psn_nm")
    public String getUse_psn_nm(){
        return use_psn_nm;
    }

    @ElVoField(physicalName = "use_psn_nm")
    public void setUse_psn_nm(String use_psn_nm){
        this.use_psn_nm = use_psn_nm;
    }

    @ElVoField(physicalName = "use_psn_dept_nm")
    public String getUse_psn_dept_nm(){
        return use_psn_dept_nm;
    }

    @ElVoField(physicalName = "use_psn_dept_nm")
    public void setUse_psn_dept_nm(String use_psn_dept_nm){
        this.use_psn_dept_nm = use_psn_dept_nm;
    }

    @ElVoField(physicalName = "use_psn_tel")
    public String getUse_psn_tel(){
        return use_psn_tel;
    }

    @ElVoField(physicalName = "use_psn_tel")
    public void setUse_psn_tel(String use_psn_tel){
        this.use_psn_tel = use_psn_tel;
    }

    @ElVoField(physicalName = "use_psn_mail")
    public String getUse_psn_mail(){
        return use_psn_mail;
    }

    @ElVoField(physicalName = "use_psn_mail")
    public void setUse_psn_mail(String use_psn_mail){
        this.use_psn_mail = use_psn_mail;
    }

    @ElVoField(physicalName = "req_resn")
    public String getReq_resn(){
        return req_resn;
    }

    @ElVoField(physicalName = "req_resn")
    public void setReq_resn(String req_resn){
        this.req_resn = req_resn;
    }

    @ElVoField(physicalName = "req_room_clsf")
    public String getReq_room_clsf(){
        return req_room_clsf;
    }

    @ElVoField(physicalName = "req_room_clsf")
    public void setReq_room_clsf(String req_room_clsf){
        this.req_room_clsf = req_room_clsf;
    }

    @ElVoField(physicalName = "req_room_cd")
    public String getReq_room_cd(){
        return req_room_cd;
    }

    @ElVoField(physicalName = "req_room_cd")
    public void setReq_room_cd(String req_room_cd){
        this.req_room_cd = req_room_cd;
    }

    @ElVoField(physicalName = "all_cnt")
    public String getAll_cnt(){
        return all_cnt;
    }

    @ElVoField(physicalName = "all_cnt")
    public void setAll_cnt(String all_cnt){
        this.all_cnt = all_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsDormVo [");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("dorm_clsf").append("=").append(dorm_clsf).append(",");
        sb.append("dorm_clsf_nm").append("=").append(dorm_clsf_nm).append(",");
        sb.append("room_clsf").append("=").append(room_clsf).append(",");
        sb.append("room_clsf_nm").append("=").append(room_clsf_nm).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("use_psn_syspayno").append("=").append(use_psn_syspayno).append(",");
        sb.append("use_psn_sex").append("=").append(use_psn_sex).append(",");
        sb.append("use_from_ymd").append("=").append(use_from_ymd).append(",");
        sb.append("use_to_ymd").append("=").append(use_to_ymd).append(",");
        sb.append("stay_clsf").append("=").append(stay_clsf).append(",");
        sb.append("room_cd").append("=").append(room_cd).append(",");
        sb.append("room_no").append("=").append(room_no).append(",");
        sb.append("room_kind").append("=").append(room_kind).append(",");
        sb.append("room_kind_nm").append("=").append(room_kind_nm).append(",");
        sb.append("stay_clsf_nm").append("=").append(stay_clsf_nm).append(",");
        sb.append("use_psn_sex_nm").append("=").append(use_psn_sex_nm).append(",");
        sb.append("use_psn_clsf").append("=").append(use_psn_clsf).append(",");
        sb.append("use_psn_clsf_nm").append("=").append(use_psn_clsf_nm).append(",");
        sb.append("in_psn_use_fee").append("=").append(in_psn_use_fee).append(",");
        sb.append("out_psn_use_fee").append("=").append(out_psn_use_fee).append(",");
        sb.append("month_in_use_fee").append("=").append(month_in_use_fee).append(",");
        sb.append("month_out_use_fee").append("=").append(month_out_use_fee).append(",");
        sb.append("use_fee").append("=").append(use_fee).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("auto_approval_yn").append("=").append(auto_approval_yn).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("auto_approval_yn_nm").append("=").append(auto_approval_yn_nm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("use_psn_nm").append("=").append(use_psn_nm).append(",");
        sb.append("use_psn_dept_nm").append("=").append(use_psn_dept_nm).append(",");
        sb.append("use_psn_tel").append("=").append(use_psn_tel).append(",");
        sb.append("use_psn_mail").append("=").append(use_psn_mail).append(",");
        sb.append("req_resn").append("=").append(req_resn).append(",");
        sb.append("req_room_clsf").append("=").append(req_room_clsf).append(",");
        sb.append("req_room_cd").append("=").append(req_room_cd).append(",");
        sb.append("all_cnt").append("=").append(all_cnt);
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
