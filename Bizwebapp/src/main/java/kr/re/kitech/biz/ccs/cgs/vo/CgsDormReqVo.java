package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기숙사신청VO")
public class CgsDormReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsDormReqVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "사용자명", physicalName = "use_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_nm;

    @ElDtoField(logicalName = "지역명", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_nm;

    @ElDtoField(logicalName = "사용시작일자", physicalName = "use_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_from_ymd;

    @ElDtoField(logicalName = "사용종료일자", physicalName = "use_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_to_ymd;

    @ElDtoField(logicalName = "사용일", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_ymd;

    @ElDtoField(logicalName = "req_room_clsf_nm", physicalName = "req_room_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_room_clsf_nm;

    @ElDtoField(logicalName = "신청호실번호", physicalName = "req_room_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_room_no;

    @ElDtoField(logicalName = "사용호실번호", physicalName = "use_room_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_room_no;

    @ElDtoField(logicalName = "요청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "stay_clsf_nm", physicalName = "stay_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String stay_clsf_nm;

    @ElDtoField(logicalName = "req_state_nm", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "reject_resn", physicalName = "reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reject_resn;

    @ElDtoField(logicalName = "auto_approval_yn", physicalName = "auto_approval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String auto_approval_yn;

    @ElDtoField(logicalName = "off_yn", physicalName = "off_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String off_yn;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ymd;

    @ElDtoField(logicalName = "시스템번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "시작일", physicalName = "startYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String startYmd;

    @ElDtoField(logicalName = "종료일", physicalName = "closeYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String closeYmd;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cd_nm;

    @ElDtoField(logicalName = "req_fr_ymd", physicalName = "req_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_fr_ymd;

    @ElDtoField(logicalName = "req_to_ymd", physicalName = "req_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_to_ymd;

    @ElDtoField(logicalName = "apply_dept_cd", physicalName = "apply_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apply_dept_cd;

    @ElDtoField(logicalName = "day", physicalName = "day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String day;

    @ElDtoField(logicalName = "day_no", physicalName = "day_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String day_no;

    @ElDtoField(logicalName = "off_rmk", physicalName = "off_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String off_rmk;

    @ElDtoField(logicalName = "month_week", physicalName = "month_week", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String month_week;

    @ElDtoField(logicalName = "year_week", physicalName = "year_week", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String year_week;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rmk;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "use_psn_syspayno", physicalName = "use_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_syspayno;

    @ElDtoField(logicalName = "use_psn_sex", physicalName = "use_psn_sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_sex;

    @ElDtoField(logicalName = "use_psn_dept_nm", physicalName = "use_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_dept_nm;

    @ElDtoField(logicalName = "use_psn_tel", physicalName = "use_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_tel;

    @ElDtoField(logicalName = "use_psn_mail", physicalName = "use_psn_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_mail;

    @ElDtoField(logicalName = "req_resn", physicalName = "req_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_resn;

    @ElDtoField(logicalName = "stay_clsf", physicalName = "stay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String stay_clsf;

    @ElDtoField(logicalName = "region_cd", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String region_cd;

    @ElDtoField(logicalName = "dorm_clsf", physicalName = "dorm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dorm_clsf;

    @ElDtoField(logicalName = "req_room_clsf", physicalName = "req_room_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_room_clsf;

    @ElDtoField(logicalName = "req_room_cd", physicalName = "req_room_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_room_cd;

    @ElDtoField(logicalName = "mngmt_psn_email", physicalName = "mngmt_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_psn_email;

    @ElDtoField(logicalName = "mngmt_psn_mobile", physicalName = "mngmt_psn_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_psn_mobile;

    @ElDtoField(logicalName = "mngmt_psn_ext_no", physicalName = "mngmt_psn_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_psn_ext_no;

    @ElDtoField(logicalName = "mngmt_psn_nm", physicalName = "mngmt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_psn_nm;

    @ElDtoField(logicalName = "mngmt_psn_syspayno", physicalName = "mngmt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String mngmt_psn_syspayno;

    @ElDtoField(logicalName = "adjust_fee", physicalName = "adjust_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String adjust_fee;

    @ElDtoField(logicalName = "use_fee", physicalName = "use_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_fee;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "req_state", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_state;

    @ElDtoField(logicalName = "use_room_cd", physicalName = "use_room_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_room_cd;

    @ElDtoField(logicalName = "use_psn_posi_nm", physicalName = "use_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_posi_nm;

    @ElDtoField(logicalName = "use_psn_empno", physicalName = "use_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_empno;

    @ElDtoField(logicalName = "use_psn_clsf", physicalName = "use_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_psn_clsf;

    @ElDtoField(logicalName = "req_psn_dept_nm", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "req_psn_posi_nm", physicalName = "req_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_posi_nm;

    @ElDtoField(logicalName = "req_psn_empno", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_psn_empno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "use_psn_nm")
    public String getUse_psn_nm(){
        String ret = this.use_psn_nm;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_nm")
    public void setUse_psn_nm(String use_psn_nm){
        this.use_psn_nm = use_psn_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        String ret = this.region_nm;
        return ret;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public String getUse_from_ymd(){
        String ret = this.use_from_ymd;
        return ret;
    }

    @ElVoField(physicalName = "use_from_ymd")
    public void setUse_from_ymd(String use_from_ymd){
        this.use_from_ymd = use_from_ymd;
    }

    @ElVoField(physicalName = "use_to_ymd")
    public String getUse_to_ymd(){
        String ret = this.use_to_ymd;
        return ret;
    }

    @ElVoField(physicalName = "use_to_ymd")
    public void setUse_to_ymd(String use_to_ymd){
        this.use_to_ymd = use_to_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        String ret = this.use_ymd;
        return ret;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "req_room_clsf_nm")
    public String getReq_room_clsf_nm(){
        String ret = this.req_room_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_room_clsf_nm")
    public void setReq_room_clsf_nm(String req_room_clsf_nm){
        this.req_room_clsf_nm = req_room_clsf_nm;
    }

    @ElVoField(physicalName = "req_room_no")
    public String getReq_room_no(){
        String ret = this.req_room_no;
        return ret;
    }

    @ElVoField(physicalName = "req_room_no")
    public void setReq_room_no(String req_room_no){
        this.req_room_no = req_room_no;
    }

    @ElVoField(physicalName = "use_room_no")
    public String getUse_room_no(){
        String ret = this.use_room_no;
        return ret;
    }

    @ElVoField(physicalName = "use_room_no")
    public void setUse_room_no(String use_room_no){
        this.use_room_no = use_room_no;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        String ret = this.req_psn_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "stay_clsf_nm")
    public String getStay_clsf_nm(){
        String ret = this.stay_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "stay_clsf_nm")
    public void setStay_clsf_nm(String stay_clsf_nm){
        this.stay_clsf_nm = stay_clsf_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        String ret = this.req_state_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "reject_resn")
    public String getReject_resn(){
        String ret = this.reject_resn;
        return ret;
    }

    @ElVoField(physicalName = "reject_resn")
    public void setReject_resn(String reject_resn){
        this.reject_resn = reject_resn;
    }

    @ElVoField(physicalName = "auto_approval_yn")
    public String getAuto_approval_yn(){
        String ret = this.auto_approval_yn;
        return ret;
    }

    @ElVoField(physicalName = "auto_approval_yn")
    public void setAuto_approval_yn(String auto_approval_yn){
        this.auto_approval_yn = auto_approval_yn;
    }

    @ElVoField(physicalName = "off_yn")
    public String getOff_yn(){
        String ret = this.off_yn;
        return ret;
    }

    @ElVoField(physicalName = "off_yn")
    public void setOff_yn(String off_yn){
        this.off_yn = off_yn;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        String ret = this.ymd;
        return ret;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
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

    @ElVoField(physicalName = "startYmd")
    public String getStartYmd(){
        String ret = this.startYmd;
        return ret;
    }

    @ElVoField(physicalName = "startYmd")
    public void setStartYmd(String startYmd){
        this.startYmd = startYmd;
    }

    @ElVoField(physicalName = "closeYmd")
    public String getCloseYmd(){
        String ret = this.closeYmd;
        return ret;
    }

    @ElVoField(physicalName = "closeYmd")
    public void setCloseYmd(String closeYmd){
        this.closeYmd = closeYmd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        String ret = this.cd_nm;
        return ret;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "req_fr_ymd")
    public String getReq_fr_ymd(){
        String ret = this.req_fr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "req_fr_ymd")
    public void setReq_fr_ymd(String req_fr_ymd){
        this.req_fr_ymd = req_fr_ymd;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public String getReq_to_ymd(){
        String ret = this.req_to_ymd;
        return ret;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public void setReq_to_ymd(String req_to_ymd){
        this.req_to_ymd = req_to_ymd;
    }

    @ElVoField(physicalName = "apply_dept_cd")
    public String getApply_dept_cd(){
        String ret = this.apply_dept_cd;
        return ret;
    }

    @ElVoField(physicalName = "apply_dept_cd")
    public void setApply_dept_cd(String apply_dept_cd){
        this.apply_dept_cd = apply_dept_cd;
    }

    @ElVoField(physicalName = "day")
    public String getDay(){
        String ret = this.day;
        return ret;
    }

    @ElVoField(physicalName = "day")
    public void setDay(String day){
        this.day = day;
    }

    @ElVoField(physicalName = "day_no")
    public String getDay_no(){
        String ret = this.day_no;
        return ret;
    }

    @ElVoField(physicalName = "day_no")
    public void setDay_no(String day_no){
        this.day_no = day_no;
    }

    @ElVoField(physicalName = "off_rmk")
    public String getOff_rmk(){
        String ret = this.off_rmk;
        return ret;
    }

    @ElVoField(physicalName = "off_rmk")
    public void setOff_rmk(String off_rmk){
        this.off_rmk = off_rmk;
    }

    @ElVoField(physicalName = "month_week")
    public String getMonth_week(){
        String ret = this.month_week;
        return ret;
    }

    @ElVoField(physicalName = "month_week")
    public void setMonth_week(String month_week){
        this.month_week = month_week;
    }

    @ElVoField(physicalName = "year_week")
    public String getYear_week(){
        String ret = this.year_week;
        return ret;
    }

    @ElVoField(physicalName = "year_week")
    public void setYear_week(String year_week){
        this.year_week = year_week;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        String ret = this.regst_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        String ret = this.regst_daytm;
        return ret;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        String ret = this.updt_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        String ret = this.updt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        String ret = this.rmk;
        return ret;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        String ret = this.posi_cd;
        return ret;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        String ret = this.req_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "use_psn_syspayno")
    public String getUse_psn_syspayno(){
        String ret = this.use_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_syspayno")
    public void setUse_psn_syspayno(String use_psn_syspayno){
        this.use_psn_syspayno = use_psn_syspayno;
    }

    @ElVoField(physicalName = "use_psn_sex")
    public String getUse_psn_sex(){
        String ret = this.use_psn_sex;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_sex")
    public void setUse_psn_sex(String use_psn_sex){
        this.use_psn_sex = use_psn_sex;
    }

    @ElVoField(physicalName = "use_psn_dept_nm")
    public String getUse_psn_dept_nm(){
        String ret = this.use_psn_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_dept_nm")
    public void setUse_psn_dept_nm(String use_psn_dept_nm){
        this.use_psn_dept_nm = use_psn_dept_nm;
    }

    @ElVoField(physicalName = "use_psn_tel")
    public String getUse_psn_tel(){
        String ret = this.use_psn_tel;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_tel")
    public void setUse_psn_tel(String use_psn_tel){
        this.use_psn_tel = use_psn_tel;
    }

    @ElVoField(physicalName = "use_psn_mail")
    public String getUse_psn_mail(){
        String ret = this.use_psn_mail;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_mail")
    public void setUse_psn_mail(String use_psn_mail){
        this.use_psn_mail = use_psn_mail;
    }

    @ElVoField(physicalName = "req_resn")
    public String getReq_resn(){
        String ret = this.req_resn;
        return ret;
    }

    @ElVoField(physicalName = "req_resn")
    public void setReq_resn(String req_resn){
        this.req_resn = req_resn;
    }

    @ElVoField(physicalName = "stay_clsf")
    public String getStay_clsf(){
        String ret = this.stay_clsf;
        return ret;
    }

    @ElVoField(physicalName = "stay_clsf")
    public void setStay_clsf(String stay_clsf){
        this.stay_clsf = stay_clsf;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        String ret = this.region_cd;
        return ret;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "dorm_clsf")
    public String getDorm_clsf(){
        String ret = this.dorm_clsf;
        return ret;
    }

    @ElVoField(physicalName = "dorm_clsf")
    public void setDorm_clsf(String dorm_clsf){
        this.dorm_clsf = dorm_clsf;
    }

    @ElVoField(physicalName = "req_room_clsf")
    public String getReq_room_clsf(){
        String ret = this.req_room_clsf;
        return ret;
    }

    @ElVoField(physicalName = "req_room_clsf")
    public void setReq_room_clsf(String req_room_clsf){
        this.req_room_clsf = req_room_clsf;
    }

    @ElVoField(physicalName = "req_room_cd")
    public String getReq_room_cd(){
        String ret = this.req_room_cd;
        return ret;
    }

    @ElVoField(physicalName = "req_room_cd")
    public void setReq_room_cd(String req_room_cd){
        this.req_room_cd = req_room_cd;
    }

    @ElVoField(physicalName = "mngmt_psn_email")
    public String getMngmt_psn_email(){
        String ret = this.mngmt_psn_email;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_psn_email")
    public void setMngmt_psn_email(String mngmt_psn_email){
        this.mngmt_psn_email = mngmt_psn_email;
    }

    @ElVoField(physicalName = "mngmt_psn_mobile")
    public String getMngmt_psn_mobile(){
        String ret = this.mngmt_psn_mobile;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_psn_mobile")
    public void setMngmt_psn_mobile(String mngmt_psn_mobile){
        this.mngmt_psn_mobile = mngmt_psn_mobile;
    }

    @ElVoField(physicalName = "mngmt_psn_ext_no")
    public String getMngmt_psn_ext_no(){
        String ret = this.mngmt_psn_ext_no;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_psn_ext_no")
    public void setMngmt_psn_ext_no(String mngmt_psn_ext_no){
        this.mngmt_psn_ext_no = mngmt_psn_ext_no;
    }

    @ElVoField(physicalName = "mngmt_psn_nm")
    public String getMngmt_psn_nm(){
        String ret = this.mngmt_psn_nm;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_psn_nm")
    public void setMngmt_psn_nm(String mngmt_psn_nm){
        this.mngmt_psn_nm = mngmt_psn_nm;
    }

    @ElVoField(physicalName = "mngmt_psn_syspayno")
    public String getMngmt_psn_syspayno(){
        String ret = this.mngmt_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "mngmt_psn_syspayno")
    public void setMngmt_psn_syspayno(String mngmt_psn_syspayno){
        this.mngmt_psn_syspayno = mngmt_psn_syspayno;
    }

    @ElVoField(physicalName = "adjust_fee")
    public String getAdjust_fee(){
        String ret = this.adjust_fee;
        return ret;
    }

    @ElVoField(physicalName = "adjust_fee")
    public void setAdjust_fee(String adjust_fee){
        this.adjust_fee = adjust_fee;
    }

    @ElVoField(physicalName = "use_fee")
    public String getUse_fee(){
        String ret = this.use_fee;
        return ret;
    }

    @ElVoField(physicalName = "use_fee")
    public void setUse_fee(String use_fee){
        this.use_fee = use_fee;
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

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        String ret = this.req_state;
        return ret;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "use_room_cd")
    public String getUse_room_cd(){
        String ret = this.use_room_cd;
        return ret;
    }

    @ElVoField(physicalName = "use_room_cd")
    public void setUse_room_cd(String use_room_cd){
        this.use_room_cd = use_room_cd;
    }

    @ElVoField(physicalName = "use_psn_posi_nm")
    public String getUse_psn_posi_nm(){
        String ret = this.use_psn_posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_posi_nm")
    public void setUse_psn_posi_nm(String use_psn_posi_nm){
        this.use_psn_posi_nm = use_psn_posi_nm;
    }

    @ElVoField(physicalName = "use_psn_empno")
    public String getUse_psn_empno(){
        String ret = this.use_psn_empno;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_empno")
    public void setUse_psn_empno(String use_psn_empno){
        this.use_psn_empno = use_psn_empno;
    }

    @ElVoField(physicalName = "use_psn_clsf")
    public String getUse_psn_clsf(){
        String ret = this.use_psn_clsf;
        return ret;
    }

    @ElVoField(physicalName = "use_psn_clsf")
    public void setUse_psn_clsf(String use_psn_clsf){
        this.use_psn_clsf = use_psn_clsf;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        String ret = this.req_psn_dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_posi_nm")
    public String getReq_psn_posi_nm(){
        String ret = this.req_psn_posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_posi_nm")
    public void setReq_psn_posi_nm(String req_psn_posi_nm){
        this.req_psn_posi_nm = req_psn_posi_nm;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        String ret = this.req_psn_empno;
        return ret;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsDormReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("use_psn_nm").append("=").append(use_psn_nm).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("use_from_ymd").append("=").append(use_from_ymd).append(",");
        sb.append("use_to_ymd").append("=").append(use_to_ymd).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("req_room_clsf_nm").append("=").append(req_room_clsf_nm).append(",");
        sb.append("req_room_no").append("=").append(req_room_no).append(",");
        sb.append("use_room_no").append("=").append(use_room_no).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("stay_clsf_nm").append("=").append(stay_clsf_nm).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("reject_resn").append("=").append(reject_resn).append(",");
        sb.append("auto_approval_yn").append("=").append(auto_approval_yn).append(",");
        sb.append("off_yn").append("=").append(off_yn).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("startYmd").append("=").append(startYmd).append(",");
        sb.append("closeYmd").append("=").append(closeYmd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("req_fr_ymd").append("=").append(req_fr_ymd).append(",");
        sb.append("req_to_ymd").append("=").append(req_to_ymd).append(",");
        sb.append("apply_dept_cd").append("=").append(apply_dept_cd).append(",");
        sb.append("day").append("=").append(day).append(",");
        sb.append("day_no").append("=").append(day_no).append(",");
        sb.append("off_rmk").append("=").append(off_rmk).append(",");
        sb.append("month_week").append("=").append(month_week).append(",");
        sb.append("year_week").append("=").append(year_week).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("use_psn_syspayno").append("=").append(use_psn_syspayno).append(",");
        sb.append("use_psn_sex").append("=").append(use_psn_sex).append(",");
        sb.append("use_psn_dept_nm").append("=").append(use_psn_dept_nm).append(",");
        sb.append("use_psn_tel").append("=").append(use_psn_tel).append(",");
        sb.append("use_psn_mail").append("=").append(use_psn_mail).append(",");
        sb.append("req_resn").append("=").append(req_resn).append(",");
        sb.append("stay_clsf").append("=").append(stay_clsf).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("dorm_clsf").append("=").append(dorm_clsf).append(",");
        sb.append("req_room_clsf").append("=").append(req_room_clsf).append(",");
        sb.append("req_room_cd").append("=").append(req_room_cd).append(",");
        sb.append("mngmt_psn_email").append("=").append(mngmt_psn_email).append(",");
        sb.append("mngmt_psn_mobile").append("=").append(mngmt_psn_mobile).append(",");
        sb.append("mngmt_psn_ext_no").append("=").append(mngmt_psn_ext_no).append(",");
        sb.append("mngmt_psn_nm").append("=").append(mngmt_psn_nm).append(",");
        sb.append("mngmt_psn_syspayno").append("=").append(mngmt_psn_syspayno).append(",");
        sb.append("adjust_fee").append("=").append(adjust_fee).append(",");
        sb.append("use_fee").append("=").append(use_fee).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("use_room_cd").append("=").append(use_room_cd).append(",");
        sb.append("use_psn_posi_nm").append("=").append(use_psn_posi_nm).append(",");
        sb.append("use_psn_empno").append("=").append(use_psn_empno).append(",");
        sb.append("use_psn_clsf").append("=").append(use_psn_clsf).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("req_psn_posi_nm").append("=").append(req_psn_posi_nm).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno);
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
