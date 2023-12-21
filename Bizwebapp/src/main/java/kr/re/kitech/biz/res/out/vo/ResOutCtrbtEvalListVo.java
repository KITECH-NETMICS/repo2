package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResOutCtrbtEvalListVo")
public class ResOutCtrbtEvalListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResOutCtrbtEvalListVo(){
    }

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "req_spn", physicalName = "req_spn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_spn;

    @ElDtoField(logicalName = "req_nm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "req_empno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_divsn_dept_nm", physicalName = "req_divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_divsn_dept_nm;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "ind_type", physicalName = "ind_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_type;

    @ElDtoField(logicalName = "ind_type_nm", physicalName = "ind_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_type_nm;

    @ElDtoField(logicalName = "ind_cd", physicalName = "ind_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_cd;

    @ElDtoField(logicalName = "ind_cd_nm", physicalName = "ind_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_cd_nm;

    @ElDtoField(logicalName = "content", physicalName = "content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String content;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "rcpt_syspayno", physicalName = "rcpt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspayno;

    @ElDtoField(logicalName = "rcpt_empno", physicalName = "rcpt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_empno;

    @ElDtoField(logicalName = "rcpt_psn_nm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcpt_psn", physicalName = "rcpt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn;

    @ElDtoField(logicalName = "rcpt_psn_dept_nm", physicalName = "rcpt_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_dept_nm;

    @ElDtoField(logicalName = "aply_yn", physicalName = "aply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_yn;

    @ElDtoField(logicalName = "rate", physicalName = "rate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate;

    @ElDtoField(logicalName = "points", physicalName = "points", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String points;

    @ElDtoField(logicalName = "rate_empno", physicalName = "rate_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_empno;

    @ElDtoField(logicalName = "rate_nm", physicalName = "rate_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_nm;

    @ElDtoField(logicalName = "rate_division_nm", physicalName = "rate_division_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_division_nm;

    @ElDtoField(logicalName = "rate_dept_nm", physicalName = "rate_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_dept_nm;

    @ElDtoField(logicalName = "actvty_nm", physicalName = "actvty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String actvty_nm;

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_spn")
    public String getReq_spn(){
        return req_spn;
    }

    @ElVoField(physicalName = "req_spn")
    public void setReq_spn(String req_spn){
        this.req_spn = req_spn;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_divsn_dept_nm")
    public String getReq_divsn_dept_nm(){
        return req_divsn_dept_nm;
    }

    @ElVoField(physicalName = "req_divsn_dept_nm")
    public void setReq_divsn_dept_nm(String req_divsn_dept_nm){
        this.req_divsn_dept_nm = req_divsn_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "ind_type")
    public String getInd_type(){
        return ind_type;
    }

    @ElVoField(physicalName = "ind_type")
    public void setInd_type(String ind_type){
        this.ind_type = ind_type;
    }

    @ElVoField(physicalName = "ind_type_nm")
    public String getInd_type_nm(){
        return ind_type_nm;
    }

    @ElVoField(physicalName = "ind_type_nm")
    public void setInd_type_nm(String ind_type_nm){
        this.ind_type_nm = ind_type_nm;
    }

    @ElVoField(physicalName = "ind_cd")
    public String getInd_cd(){
        return ind_cd;
    }

    @ElVoField(physicalName = "ind_cd")
    public void setInd_cd(String ind_cd){
        this.ind_cd = ind_cd;
    }

    @ElVoField(physicalName = "ind_cd_nm")
    public String getInd_cd_nm(){
        return ind_cd_nm;
    }

    @ElVoField(physicalName = "ind_cd_nm")
    public void setInd_cd_nm(String ind_cd_nm){
        this.ind_cd_nm = ind_cd_nm;
    }

    @ElVoField(physicalName = "content")
    public String getContent(){
        return content;
    }

    @ElVoField(physicalName = "content")
    public void setContent(String content){
        this.content = content;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
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

    @ElVoField(physicalName = "rcpt_syspayno")
    public String getRcpt_syspayno(){
        return rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public void setRcpt_syspayno(String rcpt_syspayno){
        this.rcpt_syspayno = rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_empno")
    public String getRcpt_empno(){
        return rcpt_empno;
    }

    @ElVoField(physicalName = "rcpt_empno")
    public void setRcpt_empno(String rcpt_empno){
        this.rcpt_empno = rcpt_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public String getRcpt_psn(){
        return rcpt_psn;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public void setRcpt_psn(String rcpt_psn){
        this.rcpt_psn = rcpt_psn;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public String getRcpt_psn_dept_nm(){
        return rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_dept_nm")
    public void setRcpt_psn_dept_nm(String rcpt_psn_dept_nm){
        this.rcpt_psn_dept_nm = rcpt_psn_dept_nm;
    }

    @ElVoField(physicalName = "aply_yn")
    public String getAply_yn(){
        return aply_yn;
    }

    @ElVoField(physicalName = "aply_yn")
    public void setAply_yn(String aply_yn){
        this.aply_yn = aply_yn;
    }

    @ElVoField(physicalName = "rate")
    public String getRate(){
        return rate;
    }

    @ElVoField(physicalName = "rate")
    public void setRate(String rate){
        this.rate = rate;
    }

    @ElVoField(physicalName = "points")
    public String getPoints(){
        return points;
    }

    @ElVoField(physicalName = "points")
    public void setPoints(String points){
        this.points = points;
    }

    @ElVoField(physicalName = "rate_empno")
    public String getRate_empno(){
        return rate_empno;
    }

    @ElVoField(physicalName = "rate_empno")
    public void setRate_empno(String rate_empno){
        this.rate_empno = rate_empno;
    }

    @ElVoField(physicalName = "rate_nm")
    public String getRate_nm(){
        return rate_nm;
    }

    @ElVoField(physicalName = "rate_nm")
    public void setRate_nm(String rate_nm){
        this.rate_nm = rate_nm;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public String getRate_division_nm(){
        return rate_division_nm;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public void setRate_division_nm(String rate_division_nm){
        this.rate_division_nm = rate_division_nm;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public String getRate_dept_nm(){
        return rate_dept_nm;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public void setRate_dept_nm(String rate_dept_nm){
        this.rate_dept_nm = rate_dept_nm;
    }

    @ElVoField(physicalName = "actvty_nm")
    public String getActvty_nm(){
        return actvty_nm;
    }

    @ElVoField(physicalName = "actvty_nm")
    public void setActvty_nm(String actvty_nm){
        this.actvty_nm = actvty_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResOutCtrbtEvalListVo [");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_spn").append("=").append(req_spn).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_divsn_dept_nm").append("=").append(req_divsn_dept_nm).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("ind_type").append("=").append(ind_type).append(",");
        sb.append("ind_type_nm").append("=").append(ind_type_nm).append(",");
        sb.append("ind_cd").append("=").append(ind_cd).append(",");
        sb.append("ind_cd_nm").append("=").append(ind_cd_nm).append(",");
        sb.append("content").append("=").append(content).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("rcpt_syspayno").append("=").append(rcpt_syspayno).append(",");
        sb.append("rcpt_empno").append("=").append(rcpt_empno).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_psn").append("=").append(rcpt_psn).append(",");
        sb.append("rcpt_psn_dept_nm").append("=").append(rcpt_psn_dept_nm).append(",");
        sb.append("aply_yn").append("=").append(aply_yn).append(",");
        sb.append("rate").append("=").append(rate).append(",");
        sb.append("points").append("=").append(points).append(",");
        sb.append("rate_empno").append("=").append(rate_empno).append(",");
        sb.append("rate_nm").append("=").append(rate_nm).append(",");
        sb.append("rate_division_nm").append("=").append(rate_division_nm).append(",");
        sb.append("rate_dept_nm").append("=").append(rate_dept_nm).append(",");
        sb.append("actvty_nm").append("=").append(actvty_nm);
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
