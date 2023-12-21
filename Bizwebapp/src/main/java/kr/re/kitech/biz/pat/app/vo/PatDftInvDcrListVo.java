package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = " 발명신고서VO")
public class PatDftInvDcrListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatDftInvDcrListVo(){
    }

    @ElDtoField(logicalName = "국내외구분", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;

    @ElDtoField(logicalName = "발명자시스템개인번호", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "신고서완료일자(시작)", physicalName = "apprvl_from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_from_ymd;

    @ElDtoField(logicalName = "신고서완료일자(종료)", physicalName = "apprvl_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_to_ymd;

    @ElDtoField(logicalName = "심의구분", physicalName = "rve_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rve_clsf;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "발명의명칭(국문)", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "주발명자성명", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;

    @ElDtoField(logicalName = "등록자성명", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "위임담당자성명", physicalName = "mandate_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_nm;

    @ElDtoField(logicalName = "출원인", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "권리구분", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "출원희망국가", physicalName = "smitapp_hope_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_hope_natn_nm;

    @ElDtoField(logicalName = "진행코드", physicalName = "state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_cd;

    @ElDtoField(logicalName = "사건진행현황", physicalName = "state_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_desc;

    @ElDtoField(logicalName = "특허사무소", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제(내외)구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "발명신고서거절사유", physicalName = "invnt_reject_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_reject_resn;

    @ElDtoField(logicalName = "발명등급", physicalName = "pat_grd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_grd_nm;

    @ElDtoField(logicalName = "인터뷰여부", physicalName = "interview_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String interview_yn;

    @ElDtoField(logicalName = "국내외구분명", physicalName = "dom_oversea_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_nm;

    @ElDtoField(logicalName = "소연심의 등록여부", physicalName = "rsml_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsml_mngmt_no;

    @ElDtoField(logicalName = "지 심의 등록여부", physicalName = "rsup_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsup_mngmt_no;

    @ElDtoField(logicalName = "소연심의 상태 값", physicalName = "rsml_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsml_rst_cd;

    @ElDtoField(logicalName = "지 심의 상태 값", physicalName = "rsup_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsup_rst_cd;

    @ElDtoField(logicalName = "발명구분명", physicalName = "invnt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_clsf_nm;

    @ElDtoField(logicalName = "특허설계지원사업 여부", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "소유권구분", physicalName = "co_smitapp_ex_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex_cd;

    @ElDtoField(logicalName = "신청일자", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "소연심의심의일자", physicalName = "sml_rvew_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sml_rvew_ymd;

    @ElDtoField(logicalName = "지심의심의일자", physicalName = "rvew_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_ymd;

    @ElDtoField(logicalName = "관련특허번호", physicalName = "relat_dom_smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_dom_smitapp_no;

    @ElDtoField(logicalName = "출원번호", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "출원일자", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }

    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "apprvl_from_ymd")
    public String getApprvl_from_ymd(){
        return apprvl_from_ymd;
    }

    @ElVoField(physicalName = "apprvl_from_ymd")
    public void setApprvl_from_ymd(String apprvl_from_ymd){
        this.apprvl_from_ymd = apprvl_from_ymd;
    }

    @ElVoField(physicalName = "apprvl_to_ymd")
    public String getApprvl_to_ymd(){
        return apprvl_to_ymd;
    }

    @ElVoField(physicalName = "apprvl_to_ymd")
    public void setApprvl_to_ymd(String apprvl_to_ymd){
        this.apprvl_to_ymd = apprvl_to_ymd;
    }

    @ElVoField(physicalName = "rve_clsf")
    public String getRve_clsf(){
        return rve_clsf;
    }

    @ElVoField(physicalName = "rve_clsf")
    public void setRve_clsf(String rve_clsf){
        this.rve_clsf = rve_clsf;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public String getMandate_psn_nm(){
        return mandate_psn_nm;
    }

    @ElVoField(physicalName = "mandate_psn_nm")
    public void setMandate_psn_nm(String mandate_psn_nm){
        this.mandate_psn_nm = mandate_psn_nm;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public String getSmitapp_hope_natn_nm(){
        return smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_hope_natn_nm")
    public void setSmitapp_hope_natn_nm(String smitapp_hope_natn_nm){
        this.smitapp_hope_natn_nm = smitapp_hope_natn_nm;
    }

    @ElVoField(physicalName = "state_cd")
    public String getState_cd(){
        return state_cd;
    }

    @ElVoField(physicalName = "state_cd")
    public void setState_cd(String state_cd){
        this.state_cd = state_cd;
    }

    @ElVoField(physicalName = "state_desc")
    public String getState_desc(){
        return state_desc;
    }

    @ElVoField(physicalName = "state_desc")
    public void setState_desc(String state_desc){
        this.state_desc = state_desc;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public String getInvnt_reject_resn(){
        return invnt_reject_resn;
    }

    @ElVoField(physicalName = "invnt_reject_resn")
    public void setInvnt_reject_resn(String invnt_reject_resn){
        this.invnt_reject_resn = invnt_reject_resn;
    }

    @ElVoField(physicalName = "pat_grd_nm")
    public String getPat_grd_nm(){
        return pat_grd_nm;
    }

    @ElVoField(physicalName = "pat_grd_nm")
    public void setPat_grd_nm(String pat_grd_nm){
        this.pat_grd_nm = pat_grd_nm;
    }

    @ElVoField(physicalName = "interview_yn")
    public String getInterview_yn(){
        return interview_yn;
    }

    @ElVoField(physicalName = "interview_yn")
    public void setInterview_yn(String interview_yn){
        this.interview_yn = interview_yn;
    }

    @ElVoField(physicalName = "dom_oversea_nm")
    public String getDom_oversea_nm(){
        return dom_oversea_nm;
    }

    @ElVoField(physicalName = "dom_oversea_nm")
    public void setDom_oversea_nm(String dom_oversea_nm){
        this.dom_oversea_nm = dom_oversea_nm;
    }

    @ElVoField(physicalName = "rsml_mngmt_no")
    public String getRsml_mngmt_no(){
        return rsml_mngmt_no;
    }

    @ElVoField(physicalName = "rsml_mngmt_no")
    public void setRsml_mngmt_no(String rsml_mngmt_no){
        this.rsml_mngmt_no = rsml_mngmt_no;
    }

    @ElVoField(physicalName = "rsup_mngmt_no")
    public String getRsup_mngmt_no(){
        return rsup_mngmt_no;
    }

    @ElVoField(physicalName = "rsup_mngmt_no")
    public void setRsup_mngmt_no(String rsup_mngmt_no){
        this.rsup_mngmt_no = rsup_mngmt_no;
    }

    @ElVoField(physicalName = "rsml_rst_cd")
    public String getRsml_rst_cd(){
        return rsml_rst_cd;
    }

    @ElVoField(physicalName = "rsml_rst_cd")
    public void setRsml_rst_cd(String rsml_rst_cd){
        this.rsml_rst_cd = rsml_rst_cd;
    }

    @ElVoField(physicalName = "rsup_rst_cd")
    public String getRsup_rst_cd(){
        return rsup_rst_cd;
    }

    @ElVoField(physicalName = "rsup_rst_cd")
    public void setRsup_rst_cd(String rsup_rst_cd){
        this.rsup_rst_cd = rsup_rst_cd;
    }

    @ElVoField(physicalName = "invnt_clsf_nm")
    public String getInvnt_clsf_nm(){
        return invnt_clsf_nm;
    }

    @ElVoField(physicalName = "invnt_clsf_nm")
    public void setInvnt_clsf_nm(String invnt_clsf_nm){
        this.invnt_clsf_nm = invnt_clsf_nm;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
    }

    @ElVoField(physicalName = "co_smitapp_ex_cd")
    public String getCo_smitapp_ex_cd(){
        return co_smitapp_ex_cd;
    }

    @ElVoField(physicalName = "co_smitapp_ex_cd")
    public void setCo_smitapp_ex_cd(String co_smitapp_ex_cd){
        this.co_smitapp_ex_cd = co_smitapp_ex_cd;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "sml_rvew_ymd")
    public String getSml_rvew_ymd(){
        return sml_rvew_ymd;
    }

    @ElVoField(physicalName = "sml_rvew_ymd")
    public void setSml_rvew_ymd(String sml_rvew_ymd){
        this.sml_rvew_ymd = sml_rvew_ymd;
    }

    @ElVoField(physicalName = "rvew_ymd")
    public String getRvew_ymd(){
        return rvew_ymd;
    }

    @ElVoField(physicalName = "rvew_ymd")
    public void setRvew_ymd(String rvew_ymd){
        this.rvew_ymd = rvew_ymd;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public String getRelat_dom_smitapp_no(){
        return relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "relat_dom_smitapp_no")
    public void setRelat_dom_smitapp_no(String relat_dom_smitapp_no){
        this.relat_dom_smitapp_no = relat_dom_smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DftInventorVo [");
        sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("apprvl_from_ymd").append("=").append(apprvl_from_ymd).append(",");
        sb.append("apprvl_to_ymd").append("=").append(apprvl_to_ymd).append(",");
        sb.append("rve_clsf").append("=").append(rve_clsf).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("mandate_psn_nm").append("=").append(mandate_psn_nm).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("smitapp_hope_natn_nm").append("=").append(smitapp_hope_natn_nm).append(",");
        sb.append("state_cd").append("=").append(state_cd).append(",");
        sb.append("state_desc").append("=").append(state_desc).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("invnt_reject_resn").append("=").append(invnt_reject_resn).append(",");
        sb.append("pat_grd_nm").append("=").append(pat_grd_nm).append(",");
        sb.append("interview_yn").append("=").append(interview_yn).append(",");
        sb.append("dom_oversea_nm").append("=").append(dom_oversea_nm).append(",");
        sb.append("rsml_mngmt_no").append("=").append(rsml_mngmt_no).append(",");
        sb.append("rsup_mngmt_no").append("=").append(rsup_mngmt_no).append(",");
        sb.append("rsml_rst_cd").append("=").append(rsml_rst_cd).append(",");
        sb.append("rsup_rst_cd").append("=").append(rsup_rst_cd).append(",");
        sb.append("invnt_clsf_nm").append("=").append(invnt_clsf_nm).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("co_smitapp_ex_cd").append("=").append(co_smitapp_ex_cd).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("sml_rvew_ymd").append("=").append(sml_rvew_ymd).append(",");
        sb.append("rvew_ymd").append("=").append(rvew_ymd).append(",");
        sb.append("relat_dom_smitapp_no").append("=").append(relat_dom_smitapp_no).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd);
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
