package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계속연차확인 Vo")
public class PurContAnnlReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurContAnnlReqVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_respn_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn_syspayno;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청부서", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd_nm;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "총금액", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "주사용자명", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "지역본부", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "특정구매 결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "특정구매 결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "구매요구 결재상태", physicalName = "apr_state_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_2;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계속연차신청번호", physicalName = "conti_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conti_req_no;

    @ElDtoField(logicalName = "계속연차사유", physicalName = "conti_reason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conti_reason;

    @ElDtoField(logicalName = "계속연차 첨부자료", physicalName = "conti_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conti_attach_file_no;

    @ElDtoField(logicalName = "구매요구건명", physicalName = "req_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_usg;

    @ElDtoField(logicalName = "구매요구 결재여부", physicalName = "apr_check", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_check;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public String getAccnt_respn_psn_syspayno(){
        return accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "accnt_respn_psn_syspayno")
    public void setAccnt_respn_psn_syspayno(String accnt_respn_psn_syspayno){
        this.accnt_respn_psn_syspayno = accnt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd_nm")
    public String getReq_dept_cd_nm(){
        return req_dept_cd_nm;
    }

    @ElVoField(physicalName = "req_dept_cd_nm")
    public void setReq_dept_cd_nm(String req_dept_cd_nm){
        this.req_dept_cd_nm = req_dept_cd_nm;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
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

    @ElVoField(physicalName = "apr_state_2")
    public String getApr_state_2(){
        return apr_state_2;
    }

    @ElVoField(physicalName = "apr_state_2")
    public void setApr_state_2(String apr_state_2){
        this.apr_state_2 = apr_state_2;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "conti_req_no")
    public String getConti_req_no(){
        return conti_req_no;
    }

    @ElVoField(physicalName = "conti_req_no")
    public void setConti_req_no(String conti_req_no){
        this.conti_req_no = conti_req_no;
    }

    @ElVoField(physicalName = "conti_reason")
    public String getConti_reason(){
        return conti_reason;
    }

    @ElVoField(physicalName = "conti_reason")
    public void setConti_reason(String conti_reason){
        this.conti_reason = conti_reason;
    }

    @ElVoField(physicalName = "conti_attach_file_no")
    public String getConti_attach_file_no(){
        return conti_attach_file_no;
    }

    @ElVoField(physicalName = "conti_attach_file_no")
    public void setConti_attach_file_no(String conti_attach_file_no){
        this.conti_attach_file_no = conti_attach_file_no;
    }

    @ElVoField(physicalName = "req_usg")
    public String getReq_usg(){
        return req_usg;
    }

    @ElVoField(physicalName = "req_usg")
    public void setReq_usg(String req_usg){
        this.req_usg = req_usg;
    }

    @ElVoField(physicalName = "apr_check")
    public String getApr_check(){
        return apr_check;
    }

    @ElVoField(physicalName = "apr_check")
    public void setApr_check(String apr_check){
        this.apr_check = apr_check;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurContAnnlReqVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("accnt_respn_psn_syspayno").append("=").append(accnt_respn_psn_syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_cd_nm").append("=").append(req_dept_cd_nm).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("apr_state_2").append("=").append(apr_state_2).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("conti_req_no").append("=").append(conti_req_no).append(",");
        sb.append("conti_reason").append("=").append(conti_reason).append(",");
        sb.append("conti_attach_file_no").append("=").append(conti_attach_file_no).append(",");
        sb.append("req_usg").append("=").append(req_usg).append(",");
        sb.append("apr_check").append("=").append(apr_check);
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
