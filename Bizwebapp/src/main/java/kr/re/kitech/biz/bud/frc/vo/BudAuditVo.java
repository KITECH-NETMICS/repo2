package kr.re.kitech.biz.bud.frc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BudAuditVo")
public class BudAuditVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BudAuditVo(){
    }

    @ElDtoField(logicalName = "rcptYmdSt", physicalName = "rcpt_ymd_start", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd_start;

    @ElDtoField(logicalName = "rcptYmdEd", physicalName = "rcpt_ymd_cls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd_cls;

    @ElDtoField(logicalName = "purReqNo", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "regionClsf", physicalName = "region_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_clsf;

    @ElDtoField(logicalName = "elecYn", physicalName = "elec_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elec_yn;

    @ElDtoField(logicalName = "elecappDocuNo", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "rcptNo", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "docType", physicalName = "doc_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_type;

    @ElDtoField(logicalName = "regionNm", physicalName = "region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_nm;

    @ElDtoField(logicalName = "docTypenm", physicalName = "doc_typenm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_typenm;

    @ElDtoField(logicalName = "rcptYmd", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "rcptContnt", physicalName = "rcpt_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_contnt;

    @ElDtoField(logicalName = "curncyNm", physicalName = "curncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_nm;

    @ElDtoField(logicalName = "curncyUnit", physicalName = "curncy_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curncy_unit;

    @ElDtoField(logicalName = "reqAmt", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_amt;

    @ElDtoField(logicalName = "reqPsn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "mngmtDept", physicalName = "mngmt_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_dept;

    @ElDtoField(logicalName = "mngmtDeptNm", physicalName = "mngmt_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_dept_nm;

    @ElDtoField(logicalName = "revwOpnon", physicalName = "revw_opnon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_opnon;

    @ElDtoField(logicalName = "applyYn", physicalName = "apply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apply_yn;

    @ElDtoField(logicalName = "auditPsn", physicalName = "audit_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audit_psn;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "auditPsnEmpno", physicalName = "audit_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audit_psn_empno;

    @ElDtoField(logicalName = "auditPsnNm", physicalName = "audit_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audit_psn_nm;

    @ElDtoField(logicalName = "purClsfCd", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "wrkClsf", physicalName = "wrk_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrk_clsf;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "reqPsnUid", physicalName = "req_psn_uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_uid;

    @ElVoField(physicalName = "rcpt_ymd_start")
    public String getRcpt_ymd_start(){
        return rcpt_ymd_start;
    }

    @ElVoField(physicalName = "rcpt_ymd_start")
    public void setRcpt_ymd_start(String rcpt_ymd_start){
        this.rcpt_ymd_start = rcpt_ymd_start;
    }

    @ElVoField(physicalName = "rcpt_ymd_cls")
    public String getRcpt_ymd_cls(){
        return rcpt_ymd_cls;
    }

    @ElVoField(physicalName = "rcpt_ymd_cls")
    public void setRcpt_ymd_cls(String rcpt_ymd_cls){
        this.rcpt_ymd_cls = rcpt_ymd_cls;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "region_clsf")
    public String getRegion_clsf(){
        return region_clsf;
    }

    @ElVoField(physicalName = "region_clsf")
    public void setRegion_clsf(String region_clsf){
        this.region_clsf = region_clsf;
    }

    @ElVoField(physicalName = "elec_yn")
    public String getElec_yn(){
        return elec_yn;
    }

    @ElVoField(physicalName = "elec_yn")
    public void setElec_yn(String elec_yn){
        this.elec_yn = elec_yn;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "doc_type")
    public String getDoc_type(){
        return doc_type;
    }

    @ElVoField(physicalName = "doc_type")
    public void setDoc_type(String doc_type){
        this.doc_type = doc_type;
    }

    @ElVoField(physicalName = "region_nm")
    public String getRegion_nm(){
        return region_nm;
    }

    @ElVoField(physicalName = "region_nm")
    public void setRegion_nm(String region_nm){
        this.region_nm = region_nm;
    }

    @ElVoField(physicalName = "doc_typenm")
    public String getDoc_typenm(){
        return doc_typenm;
    }

    @ElVoField(physicalName = "doc_typenm")
    public void setDoc_typenm(String doc_typenm){
        this.doc_typenm = doc_typenm;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_contnt")
    public String getRcpt_contnt(){
        return rcpt_contnt;
    }

    @ElVoField(physicalName = "rcpt_contnt")
    public void setRcpt_contnt(String rcpt_contnt){
        this.rcpt_contnt = rcpt_contnt;
    }

    @ElVoField(physicalName = "curncy_nm")
    public String getCurncy_nm(){
        return curncy_nm;
    }

    @ElVoField(physicalName = "curncy_nm")
    public void setCurncy_nm(String curncy_nm){
        this.curncy_nm = curncy_nm;
    }

    @ElVoField(physicalName = "curncy_unit")
    public String getCurncy_unit(){
        return curncy_unit;
    }

    @ElVoField(physicalName = "curncy_unit")
    public void setCurncy_unit(String curncy_unit){
        this.curncy_unit = curncy_unit;
    }

    @ElVoField(physicalName = "req_amt")
    public String getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(String req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "mngmt_dept")
    public String getMngmt_dept(){
        return mngmt_dept;
    }

    @ElVoField(physicalName = "mngmt_dept")
    public void setMngmt_dept(String mngmt_dept){
        this.mngmt_dept = mngmt_dept;
    }

    @ElVoField(physicalName = "mngmt_dept_nm")
    public String getMngmt_dept_nm(){
        return mngmt_dept_nm;
    }

    @ElVoField(physicalName = "mngmt_dept_nm")
    public void setMngmt_dept_nm(String mngmt_dept_nm){
        this.mngmt_dept_nm = mngmt_dept_nm;
    }

    @ElVoField(physicalName = "revw_opnon")
    public String getRevw_opnon(){
        return revw_opnon;
    }

    @ElVoField(physicalName = "revw_opnon")
    public void setRevw_opnon(String revw_opnon){
        this.revw_opnon = revw_opnon;
    }

    @ElVoField(physicalName = "apply_yn")
    public String getApply_yn(){
        return apply_yn;
    }

    @ElVoField(physicalName = "apply_yn")
    public void setApply_yn(String apply_yn){
        this.apply_yn = apply_yn;
    }

    @ElVoField(physicalName = "audit_psn")
    public String getAudit_psn(){
        return audit_psn;
    }

    @ElVoField(physicalName = "audit_psn")
    public void setAudit_psn(String audit_psn){
        this.audit_psn = audit_psn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "audit_psn_empno")
    public String getAudit_psn_empno(){
        return audit_psn_empno;
    }

    @ElVoField(physicalName = "audit_psn_empno")
    public void setAudit_psn_empno(String audit_psn_empno){
        this.audit_psn_empno = audit_psn_empno;
    }

    @ElVoField(physicalName = "audit_psn_nm")
    public String getAudit_psn_nm(){
        return audit_psn_nm;
    }

    @ElVoField(physicalName = "audit_psn_nm")
    public void setAudit_psn_nm(String audit_psn_nm){
        this.audit_psn_nm = audit_psn_nm;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public String getWrk_clsf(){
        return wrk_clsf;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public void setWrk_clsf(String wrk_clsf){
        this.wrk_clsf = wrk_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "req_psn_uid")
    public String getReq_psn_uid(){
        return req_psn_uid;
    }

    @ElVoField(physicalName = "req_psn_uid")
    public void setReq_psn_uid(String req_psn_uid){
        this.req_psn_uid = req_psn_uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BudAuditVo [");
        sb.append("rcpt_ymd_start").append("=").append(rcpt_ymd_start).append(",");
        sb.append("rcpt_ymd_cls").append("=").append(rcpt_ymd_cls).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("region_clsf").append("=").append(region_clsf).append(",");
        sb.append("elec_yn").append("=").append(elec_yn).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("doc_type").append("=").append(doc_type).append(",");
        sb.append("region_nm").append("=").append(region_nm).append(",");
        sb.append("doc_typenm").append("=").append(doc_typenm).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("rcpt_contnt").append("=").append(rcpt_contnt).append(",");
        sb.append("curncy_nm").append("=").append(curncy_nm).append(",");
        sb.append("curncy_unit").append("=").append(curncy_unit).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("mngmt_dept").append("=").append(mngmt_dept).append(",");
        sb.append("mngmt_dept_nm").append("=").append(mngmt_dept_nm).append(",");
        sb.append("revw_opnon").append("=").append(revw_opnon).append(",");
        sb.append("apply_yn").append("=").append(apply_yn).append(",");
        sb.append("audit_psn").append("=").append(audit_psn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("audit_psn_empno").append("=").append(audit_psn_empno).append(",");
        sb.append("audit_psn_nm").append("=").append(audit_psn_nm).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("wrk_clsf").append("=").append(wrk_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("req_psn_uid").append("=").append(req_psn_uid);
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
