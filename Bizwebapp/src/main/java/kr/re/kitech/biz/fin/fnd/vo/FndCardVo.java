package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FndCardIssReqSI01Exp")
public class FndCardVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FndCardVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "reqPsn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "reqDept", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "engNm", physicalName = "eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_nm;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "issuClsf", physicalName = "issu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_clsf;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "issuCause", physicalName = "issu_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_cause;

    @ElDtoField(logicalName = "cardNo", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "agrmtYn", physicalName = "agrmt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agrmt_yn;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "cardUseYn", physicalName = "card_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_yn;

    @ElDtoField(logicalName = "cardReturnYn", physicalName = "card_return_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_return_yn;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "isApproval", physicalName = "isApproval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String isApproval;

    @ElDtoField(logicalName = "issuCauseNm", physicalName = "issu_cause_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_cause_nm;

    @ElDtoField(logicalName = "issuClsfNm", physicalName = "issu_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_clsf_nm;

    @ElDtoField(logicalName = "첨부파일1", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "empNo", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "reqDeptNm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "reqEmpNm", physicalName = "req_emp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_emp_nm;

    @ElDtoField(logicalName = "reqPosiNm", physicalName = "req_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_nm;

    @ElDtoField(logicalName = "reqYmdFrom", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "reqYmdTo", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "mailYn", physicalName = "mail_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_yn;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "reqNoList", physicalName = "reqNoList", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.Map reqNoList;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "eng_nm")
    public String getEng_nm(){
        return eng_nm;
    }

    @ElVoField(physicalName = "eng_nm")
    public void setEng_nm(String eng_nm){
        this.eng_nm = eng_nm;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "issu_clsf")
    public String getIssu_clsf(){
        return issu_clsf;
    }

    @ElVoField(physicalName = "issu_clsf")
    public void setIssu_clsf(String issu_clsf){
        this.issu_clsf = issu_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "issu_cause")
    public String getIssu_cause(){
        return issu_cause;
    }

    @ElVoField(physicalName = "issu_cause")
    public void setIssu_cause(String issu_cause){
        this.issu_cause = issu_cause;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "agrmt_yn")
    public String getAgrmt_yn(){
        return agrmt_yn;
    }

    @ElVoField(physicalName = "agrmt_yn")
    public void setAgrmt_yn(String agrmt_yn){
        this.agrmt_yn = agrmt_yn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "card_use_yn")
    public String getCard_use_yn(){
        return card_use_yn;
    }

    @ElVoField(physicalName = "card_use_yn")
    public void setCard_use_yn(String card_use_yn){
        this.card_use_yn = card_use_yn;
    }

    @ElVoField(physicalName = "card_return_yn")
    public String getCard_return_yn(){
        return card_return_yn;
    }

    @ElVoField(physicalName = "card_return_yn")
    public void setCard_return_yn(String card_return_yn){
        this.card_return_yn = card_return_yn;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "isApproval")
    public String getIsApproval(){
        return isApproval;
    }

    @ElVoField(physicalName = "isApproval")
    public void setIsApproval(String isApproval){
        this.isApproval = isApproval;
    }

    @ElVoField(physicalName = "issu_cause_nm")
    public String getIssu_cause_nm(){
        return issu_cause_nm;
    }

    @ElVoField(physicalName = "issu_cause_nm")
    public void setIssu_cause_nm(String issu_cause_nm){
        this.issu_cause_nm = issu_cause_nm;
    }

    @ElVoField(physicalName = "issu_clsf_nm")
    public String getIssu_clsf_nm(){
        return issu_clsf_nm;
    }

    @ElVoField(physicalName = "issu_clsf_nm")
    public void setIssu_clsf_nm(String issu_clsf_nm){
        this.issu_clsf_nm = issu_clsf_nm;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_emp_nm")
    public String getReq_emp_nm(){
        return req_emp_nm;
    }

    @ElVoField(physicalName = "req_emp_nm")
    public void setReq_emp_nm(String req_emp_nm){
        this.req_emp_nm = req_emp_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public String getReq_posi_nm(){
        return req_posi_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public void setReq_posi_nm(String req_posi_nm){
        this.req_posi_nm = req_posi_nm;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "mail_yn")
    public String getMail_yn(){
        return mail_yn;
    }

    @ElVoField(physicalName = "mail_yn")
    public void setMail_yn(String mail_yn){
        this.mail_yn = mail_yn;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "reqNoList")
    public java.util.Map getReqNoList(){
        return reqNoList;
    }

    @ElVoField(physicalName = "reqNoList")
    public void setReqNoList(java.util.Map reqNoList){
        this.reqNoList = reqNoList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FndCardVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("eng_nm").append("=").append(eng_nm).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("issu_clsf").append("=").append(issu_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("issu_cause").append("=").append(issu_cause).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("agrmt_yn").append("=").append(agrmt_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("card_use_yn").append("=").append(card_use_yn).append(",");
        sb.append("card_return_yn").append("=").append(card_return_yn).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("isApproval").append("=").append(isApproval).append(",");
        sb.append("issu_cause_nm").append("=").append(issu_cause_nm).append(",");
        sb.append("issu_clsf_nm").append("=").append(issu_clsf_nm).append(",");
        sb.append("attachVo1").append("=").append(attachVo1).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_emp_nm").append("=").append(req_emp_nm).append(",");
        sb.append("req_posi_nm").append("=").append(req_posi_nm).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("mail_yn").append("=").append(mail_yn).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("reqNoList").append("=").append(reqNoList);
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
