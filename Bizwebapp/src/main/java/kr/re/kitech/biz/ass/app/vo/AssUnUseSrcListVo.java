package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssUnUseSrcListExp")
public class AssUnUseSrcListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssUnUseSrcListVo(){
    }

    @ElDtoField(logicalName = "reqYmdSt", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;

    @ElDtoField(logicalName = "reqYmdEd", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "reqUserNm", physicalName = "req_user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_user_nm;

    @ElDtoField(logicalName = "reqUserEmpno", physicalName = "req_user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_user_empno;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "asetState", physicalName = "aset_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state;

    @ElDtoField(logicalName = "asetStateNm", physicalName = "aset_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state_nm;

    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "respnSyspayno", physicalName = "respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_syspayno;

    @ElDtoField(logicalName = "respnNm", physicalName = "respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_nm;

    @ElDtoField(logicalName = "respnEmpno", physicalName = "respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_empno;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "reviewComState", physicalName = "review_com_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String review_com_state;

    @ElDtoField(logicalName = "reviewComStateNm", physicalName = "review_com_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String review_com_state_nm;

    @ElDtoField(logicalName = "deliberationState", physicalName = "deliberation_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deliberation_state;

    @ElDtoField(logicalName = "deliberationStateNm", physicalName = "deliberation_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deliberation_state_nm;

    @ElDtoField(logicalName = "prcsClsfNm", physicalName = "prcs_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf_nm;

    @ElDtoField(logicalName = "rvewRstCd", physicalName = "rvew_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst_cd;

    @ElDtoField(logicalName = "resRvewRstCd", physicalName = "res_rvew_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_rvew_rst_cd;

    @ElDtoField(logicalName = "smlAprState", physicalName = "sml_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sml_apr_state;

    @ElDtoField(logicalName = "resSmlAprState", physicalName = "res_sml_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_sml_apr_state;

    @ElDtoField(logicalName = "appDiv", physicalName = "app_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_div;

    @ElVoField(physicalName = "req_ymd_st")
    public String getReq_ymd_st(){
        return req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_st")
    public void setReq_ymd_st(String req_ymd_st){
        this.req_ymd_st = req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public String getReq_ymd_ed(){
        return req_ymd_ed;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public void setReq_ymd_ed(String req_ymd_ed){
        this.req_ymd_ed = req_ymd_ed;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }

    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "req_user_nm")
    public String getReq_user_nm(){
        return req_user_nm;
    }

    @ElVoField(physicalName = "req_user_nm")
    public void setReq_user_nm(String req_user_nm){
        this.req_user_nm = req_user_nm;
    }

    @ElVoField(physicalName = "req_user_empno")
    public String getReq_user_empno(){
        return req_user_empno;
    }

    @ElVoField(physicalName = "req_user_empno")
    public void setReq_user_empno(String req_user_empno){
        this.req_user_empno = req_user_empno;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "old_aset_no")
    public String getOld_aset_no(){
        return old_aset_no;
    }

    @ElVoField(physicalName = "old_aset_no")
    public void setOld_aset_no(String old_aset_no){
        this.old_aset_no = old_aset_no;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "aset_state")
    public String getAset_state(){
        return aset_state;
    }

    @ElVoField(physicalName = "aset_state")
    public void setAset_state(String aset_state){
        this.aset_state = aset_state;
    }

    @ElVoField(physicalName = "aset_state_nm")
    public String getAset_state_nm(){
        return aset_state_nm;
    }

    @ElVoField(physicalName = "aset_state_nm")
    public void setAset_state_nm(String aset_state_nm){
        this.aset_state_nm = aset_state_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "respn_syspayno")
    public String getRespn_syspayno(){
        return respn_syspayno;
    }

    @ElVoField(physicalName = "respn_syspayno")
    public void setRespn_syspayno(String respn_syspayno){
        this.respn_syspayno = respn_syspayno;
    }

    @ElVoField(physicalName = "respn_nm")
    public String getRespn_nm(){
        return respn_nm;
    }

    @ElVoField(physicalName = "respn_nm")
    public void setRespn_nm(String respn_nm){
        this.respn_nm = respn_nm;
    }

    @ElVoField(physicalName = "respn_empno")
    public String getRespn_empno(){
        return respn_empno;
    }

    @ElVoField(physicalName = "respn_empno")
    public void setRespn_empno(String respn_empno){
        this.respn_empno = respn_empno;
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

    @ElVoField(physicalName = "review_com_state")
    public String getReview_com_state(){
        return review_com_state;
    }

    @ElVoField(physicalName = "review_com_state")
    public void setReview_com_state(String review_com_state){
        this.review_com_state = review_com_state;
    }

    @ElVoField(physicalName = "review_com_state_nm")
    public String getReview_com_state_nm(){
        return review_com_state_nm;
    }

    @ElVoField(physicalName = "review_com_state_nm")
    public void setReview_com_state_nm(String review_com_state_nm){
        this.review_com_state_nm = review_com_state_nm;
    }

    @ElVoField(physicalName = "deliberation_state")
    public String getDeliberation_state(){
        return deliberation_state;
    }

    @ElVoField(physicalName = "deliberation_state")
    public void setDeliberation_state(String deliberation_state){
        this.deliberation_state = deliberation_state;
    }

    @ElVoField(physicalName = "deliberation_state_nm")
    public String getDeliberation_state_nm(){
        return deliberation_state_nm;
    }

    @ElVoField(physicalName = "deliberation_state_nm")
    public void setDeliberation_state_nm(String deliberation_state_nm){
        this.deliberation_state_nm = deliberation_state_nm;
    }

    @ElVoField(physicalName = "prcs_clsf_nm")
    public String getPrcs_clsf_nm(){
        return prcs_clsf_nm;
    }

    @ElVoField(physicalName = "prcs_clsf_nm")
    public void setPrcs_clsf_nm(String prcs_clsf_nm){
        this.prcs_clsf_nm = prcs_clsf_nm;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public String getRvew_rst_cd(){
        return rvew_rst_cd;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public void setRvew_rst_cd(String rvew_rst_cd){
        this.rvew_rst_cd = rvew_rst_cd;
    }

    @ElVoField(physicalName = "res_rvew_rst_cd")
    public String getRes_rvew_rst_cd(){
        return res_rvew_rst_cd;
    }

    @ElVoField(physicalName = "res_rvew_rst_cd")
    public void setRes_rvew_rst_cd(String res_rvew_rst_cd){
        this.res_rvew_rst_cd = res_rvew_rst_cd;
    }

    @ElVoField(physicalName = "sml_apr_state")
    public String getSml_apr_state(){
        return sml_apr_state;
    }

    @ElVoField(physicalName = "sml_apr_state")
    public void setSml_apr_state(String sml_apr_state){
        this.sml_apr_state = sml_apr_state;
    }

    @ElVoField(physicalName = "res_sml_apr_state")
    public String getRes_sml_apr_state(){
        return res_sml_apr_state;
    }

    @ElVoField(physicalName = "res_sml_apr_state")
    public void setRes_sml_apr_state(String res_sml_apr_state){
        this.res_sml_apr_state = res_sml_apr_state;
    }

    @ElVoField(physicalName = "app_div")
    public String getApp_div(){
        return app_div;
    }

    @ElVoField(physicalName = "app_div")
    public void setApp_div(String app_div){
        this.app_div = app_div;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssUnUseSrcListVo [");
        sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
        sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("req_user_nm").append("=").append(req_user_nm).append(",");
        sb.append("req_user_empno").append("=").append(req_user_empno).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("aset_state").append("=").append(aset_state).append(",");
        sb.append("aset_state_nm").append("=").append(aset_state_nm).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("respn_syspayno").append("=").append(respn_syspayno).append(",");
        sb.append("respn_nm").append("=").append(respn_nm).append(",");
        sb.append("respn_empno").append("=").append(respn_empno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("review_com_state").append("=").append(review_com_state).append(",");
        sb.append("review_com_state_nm").append("=").append(review_com_state_nm).append(",");
        sb.append("deliberation_state").append("=").append(deliberation_state).append(",");
        sb.append("deliberation_state_nm").append("=").append(deliberation_state_nm).append(",");
        sb.append("prcs_clsf_nm").append("=").append(prcs_clsf_nm).append(",");
        sb.append("rvew_rst_cd").append("=").append(rvew_rst_cd).append(",");
        sb.append("res_rvew_rst_cd").append("=").append(res_rvew_rst_cd).append(",");
        sb.append("sml_apr_state").append("=").append(sml_apr_state).append(",");
        sb.append("res_sml_apr_state").append("=").append(res_sml_apr_state).append(",");
        sb.append("app_div").append("=").append(app_div);
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
