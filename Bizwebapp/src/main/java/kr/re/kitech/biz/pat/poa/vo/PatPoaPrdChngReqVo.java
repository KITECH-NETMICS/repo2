package kr.re.kitech.biz.pat.poa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPoaPrdChngReqExp")
public class PatPoaPrdChngReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatPoaPrdChngReqVo(){
    }

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "endYmd", physicalName = "end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_ymd;

    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "oaId", physicalName = "oa_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_id;

    @ElDtoField(logicalName = "oaSn", physicalName = "oa_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_sn;

    @ElDtoField(logicalName = "rcptClsf", physicalName = "rcpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf;

    @ElDtoField(logicalName = "cmpltYn", physicalName = "cmplt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmplt_yn;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "invntNm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "rcptPsnNm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcptChargPsnNm", physicalName = "rcpt_charg_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_charg_psn_nm;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "reqSn", physicalName = "req_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_sn;

    @ElDtoField(logicalName = "reqEmpno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "reqPsnNm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "chngYmd", physicalName = "chng_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_ymd;

    @ElDtoField(logicalName = "bfChngYmd", physicalName = "bf_chng_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bf_chng_ymd;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "rcptClsfNm", physicalName = "rcpt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf_nm;

    @ElDtoField(logicalName = "rcptOaDate", physicalName = "rcpt_oa_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_oa_date;

    @ElDtoField(logicalName = "rcptDueDate", physicalName = "rcpt_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_due_date;

    @ElDtoField(logicalName = "docNo", physicalName = "doc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_no;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "reqPsn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "longTerm", physicalName = "long_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String long_term;

    @ElDtoField(logicalName = "chngRsn", physicalName = "chng_rsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_rsn;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;

    @ElDtoField(logicalName = "smitappOccrClsfNm", physicalName = "smitapp_occr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_occr_clsf_nm;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "uiId", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "mngmtItem7", physicalName = "mngmt_item_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_7;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "researcher_id", physicalName = "researcher_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researcher_id;

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "result", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "office_nm", physicalName = "office_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String office_nm;

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public String getEnd_ymd(){
        return end_ymd;
    }

    @ElVoField(physicalName = "end_ymd")
    public void setEnd_ymd(String end_ymd){
        this.end_ymd = end_ymd;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "oa_id")
    public String getOa_id(){
        return oa_id;
    }

    @ElVoField(physicalName = "oa_id")
    public void setOa_id(String oa_id){
        this.oa_id = oa_id;
    }

    @ElVoField(physicalName = "oa_sn")
    public String getOa_sn(){
        return oa_sn;
    }

    @ElVoField(physicalName = "oa_sn")
    public void setOa_sn(String oa_sn){
        this.oa_sn = oa_sn;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public String getRcpt_clsf(){
        return rcpt_clsf;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public void setRcpt_clsf(String rcpt_clsf){
        this.rcpt_clsf = rcpt_clsf;
    }

    @ElVoField(physicalName = "cmplt_yn")
    public String getCmplt_yn(){
        return cmplt_yn;
    }

    @ElVoField(physicalName = "cmplt_yn")
    public void setCmplt_yn(String cmplt_yn){
        this.cmplt_yn = cmplt_yn;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public String getRcpt_charg_psn_nm(){
        return rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_charg_psn_nm")
    public void setRcpt_charg_psn_nm(String rcpt_charg_psn_nm){
        this.rcpt_charg_psn_nm = rcpt_charg_psn_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "req_sn")
    public String getReq_sn(){
        return req_sn;
    }

    @ElVoField(physicalName = "req_sn")
    public void setReq_sn(String req_sn){
        this.req_sn = req_sn;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "chng_ymd")
    public String getChng_ymd(){
        return chng_ymd;
    }

    @ElVoField(physicalName = "chng_ymd")
    public void setChng_ymd(String chng_ymd){
        this.chng_ymd = chng_ymd;
    }

    @ElVoField(physicalName = "bf_chng_ymd")
    public String getBf_chng_ymd(){
        return bf_chng_ymd;
    }

    @ElVoField(physicalName = "bf_chng_ymd")
    public void setBf_chng_ymd(String bf_chng_ymd){
        this.bf_chng_ymd = bf_chng_ymd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public String getRcpt_clsf_nm(){
        return rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "rcpt_clsf_nm")
    public void setRcpt_clsf_nm(String rcpt_clsf_nm){
        this.rcpt_clsf_nm = rcpt_clsf_nm;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public String getRcpt_oa_date(){
        return rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_oa_date")
    public void setRcpt_oa_date(String rcpt_oa_date){
        this.rcpt_oa_date = rcpt_oa_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public String getRcpt_due_date(){
        return rcpt_due_date;
    }

    @ElVoField(physicalName = "rcpt_due_date")
    public void setRcpt_due_date(String rcpt_due_date){
        this.rcpt_due_date = rcpt_due_date;
    }

    @ElVoField(physicalName = "doc_no")
    public String getDoc_no(){
        return doc_no;
    }

    @ElVoField(physicalName = "doc_no")
    public void setDoc_no(String doc_no){
        this.doc_no = doc_no;
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

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "long_term")
    public String getLong_term(){
        return long_term;
    }

    @ElVoField(physicalName = "long_term")
    public void setLong_term(String long_term){
        this.long_term = long_term;
    }

    @ElVoField(physicalName = "chng_rsn")
    public String getChng_rsn(){
        return chng_rsn;
    }

    @ElVoField(physicalName = "chng_rsn")
    public void setChng_rsn(String chng_rsn){
        this.chng_rsn = chng_rsn;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public String getSmitapp_occr_clsf_nm(){
        return smitapp_occr_clsf_nm;
    }

    @ElVoField(physicalName = "smitapp_occr_clsf_nm")
    public void setSmitapp_occr_clsf_nm(String smitapp_occr_clsf_nm){
        this.smitapp_occr_clsf_nm = smitapp_occr_clsf_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "mngmt_item_7")
    public String getMngmt_item_7(){
        return mngmt_item_7;
    }

    @ElVoField(physicalName = "mngmt_item_7")
    public void setMngmt_item_7(String mngmt_item_7){
        this.mngmt_item_7 = mngmt_item_7;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "researcher_id")
    public String getResearcher_id(){
        return researcher_id;
    }

    @ElVoField(physicalName = "researcher_id")
    public void setResearcher_id(String researcher_id){
        this.researcher_id = researcher_id;
    }

    @ElVoField(physicalName = "ext1_cd")
    public String getExt1_cd(){
        return ext1_cd;
    }

    @ElVoField(physicalName = "ext1_cd")
    public void setExt1_cd(String ext1_cd){
        this.ext1_cd = ext1_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public String getExt2_cd(){
        return ext2_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public void setExt2_cd(String ext2_cd){
        this.ext2_cd = ext2_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "office_nm")
    public String getOffice_nm(){
        return office_nm;
    }

    @ElVoField(physicalName = "office_nm")
    public void setOffice_nm(String office_nm){
        this.office_nm = office_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatPoaPrdChngReqVo [");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("end_ymd").append("=").append(end_ymd).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("oa_id").append("=").append(oa_id).append(",");
        sb.append("oa_sn").append("=").append(oa_sn).append(",");
        sb.append("rcpt_clsf").append("=").append(rcpt_clsf).append(",");
        sb.append("cmplt_yn").append("=").append(cmplt_yn).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_charg_psn_nm").append("=").append(rcpt_charg_psn_nm).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("req_sn").append("=").append(req_sn).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("chng_ymd").append("=").append(chng_ymd).append(",");
        sb.append("bf_chng_ymd").append("=").append(bf_chng_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("rcpt_clsf_nm").append("=").append(rcpt_clsf_nm).append(",");
        sb.append("rcpt_oa_date").append("=").append(rcpt_oa_date).append(",");
        sb.append("rcpt_due_date").append("=").append(rcpt_due_date).append(",");
        sb.append("doc_no").append("=").append(doc_no).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("long_term").append("=").append(long_term).append(",");
        sb.append("chng_rsn").append("=").append(chng_rsn).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
        sb.append("smitapp_occr_clsf_nm").append("=").append(smitapp_occr_clsf_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("mngmt_item_7").append("=").append(mngmt_item_7).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("researcher_id").append("=").append(researcher_id).append(",");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("office_nm").append("=").append(office_nm);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
