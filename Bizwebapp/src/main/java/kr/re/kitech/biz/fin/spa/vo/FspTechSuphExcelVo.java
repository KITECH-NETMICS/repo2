package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspTechSuphExcelExp")
public class FspTechSuphExcelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSuphExcelVo(){
    }

    @ElDtoField(logicalName = "reqYmdSt", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;

    @ElDtoField(logicalName = "reqYmdEd", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;

    @ElDtoField(logicalName = "compltDemndYmdSt", physicalName = "complt_demnd_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd_st;

    @ElDtoField(logicalName = "compltDemndYmdEd", physicalName = "complt_demnd_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd_ed;

    @ElDtoField(logicalName = "reqClsf", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "reqPsnSyspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "reqPsnNmLike", physicalName = "req_psn_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm_like;

    @ElDtoField(logicalName = "reqPsnEmpnoLike", physicalName = "req_psn_empno_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno_like;

    @ElDtoField(logicalName = "rcptPsnSyspayno", physicalName = "rcpt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_syspayno;

    @ElDtoField(logicalName = "rcptPsnNmLike", physicalName = "rcpt_psn_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm_like;

    @ElDtoField(logicalName = "rcptPsnEmpnoLike", physicalName = "rcpt_psn_empno_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno_like;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accntNoLike", physicalName = "accnt_no_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_like;

    @ElDtoField(logicalName = "imptAccntNo", physicalName = "impt_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_no;

    @ElDtoField(logicalName = "imptAccntNoLike", physicalName = "impt_accnt_no_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_no_like;

    @ElDtoField(logicalName = "req_state_in1", physicalName = "req_state_in1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_in1;

    @ElDtoField(logicalName = "req_state_in2", physicalName = "req_state_in2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_in2;

    @ElDtoField(logicalName = "req_state_in3", physicalName = "req_state_in3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_in3;

    @ElDtoField(logicalName = "req_state_in4", physicalName = "req_state_in4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_in4;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accntRspnsDeptNm", physicalName = "accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "reqPsn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "reqPsnNm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "reqPsnDeptNm", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "reqAmt", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_amt;

    @ElDtoField(logicalName = "ctrlAmt", physicalName = "ctrl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_amt;

    @ElDtoField(logicalName = "rcptPsn", physicalName = "rcpt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn;

    @ElDtoField(logicalName = "rcptPsnNm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcptNo", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "imptAccntRspns", physicalName = "impt_accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_rspns;

    @ElDtoField(logicalName = "imptAccntRspnsDeptNm", physicalName = "impt_accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "ctrlNo", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr;

    @ElDtoField(logicalName = "reqState", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "reqTreatQty", physicalName = "req_treat_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_treat_qty;

    @ElDtoField(logicalName = "transAmt", physicalName = "trans_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_amt;

    @ElDtoField(logicalName = "useStartYmd", physicalName = "use_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_ymd;

    @ElDtoField(logicalName = "useStartTime", physicalName = "use_start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_start_time;

    @ElDtoField(logicalName = "useClsYmd", physicalName = "use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_ymd;

    @ElDtoField(logicalName = "useClsTime", physicalName = "use_cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_time;

    @ElDtoField(logicalName = "useTime", physicalName = "use_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_time;

    @ElDtoField(logicalName = "asetName", physicalName = "aset_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_name;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

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

    @ElVoField(physicalName = "complt_demnd_ymd_st")
    public String getComplt_demnd_ymd_st(){
        return complt_demnd_ymd_st;
    }

    @ElVoField(physicalName = "complt_demnd_ymd_st")
    public void setComplt_demnd_ymd_st(String complt_demnd_ymd_st){
        this.complt_demnd_ymd_st = complt_demnd_ymd_st;
    }

    @ElVoField(physicalName = "complt_demnd_ymd_ed")
    public String getComplt_demnd_ymd_ed(){
        return complt_demnd_ymd_ed;
    }

    @ElVoField(physicalName = "complt_demnd_ymd_ed")
    public void setComplt_demnd_ymd_ed(String complt_demnd_ymd_ed){
        this.complt_demnd_ymd_ed = complt_demnd_ymd_ed;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_nm_like")
    public String getReq_psn_nm_like(){
        return req_psn_nm_like;
    }

    @ElVoField(physicalName = "req_psn_nm_like")
    public void setReq_psn_nm_like(String req_psn_nm_like){
        this.req_psn_nm_like = req_psn_nm_like;
    }

    @ElVoField(physicalName = "req_psn_empno_like")
    public String getReq_psn_empno_like(){
        return req_psn_empno_like;
    }

    @ElVoField(physicalName = "req_psn_empno_like")
    public void setReq_psn_empno_like(String req_psn_empno_like){
        this.req_psn_empno_like = req_psn_empno_like;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public String getRcpt_psn_syspayno(){
        return rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public void setRcpt_psn_syspayno(String rcpt_psn_syspayno){
        this.rcpt_psn_syspayno = rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm_like")
    public String getRcpt_psn_nm_like(){
        return rcpt_psn_nm_like;
    }

    @ElVoField(physicalName = "rcpt_psn_nm_like")
    public void setRcpt_psn_nm_like(String rcpt_psn_nm_like){
        this.rcpt_psn_nm_like = rcpt_psn_nm_like;
    }

    @ElVoField(physicalName = "rcpt_psn_empno_like")
    public String getRcpt_psn_empno_like(){
        return rcpt_psn_empno_like;
    }

    @ElVoField(physicalName = "rcpt_psn_empno_like")
    public void setRcpt_psn_empno_like(String rcpt_psn_empno_like){
        this.rcpt_psn_empno_like = rcpt_psn_empno_like;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_like")
    public String getAccnt_no_like(){
        return accnt_no_like;
    }

    @ElVoField(physicalName = "accnt_no_like")
    public void setAccnt_no_like(String accnt_no_like){
        this.accnt_no_like = accnt_no_like;
    }

    @ElVoField(physicalName = "impt_accnt_no")
    public String getImpt_accnt_no(){
        return impt_accnt_no;
    }

    @ElVoField(physicalName = "impt_accnt_no")
    public void setImpt_accnt_no(String impt_accnt_no){
        this.impt_accnt_no = impt_accnt_no;
    }

    @ElVoField(physicalName = "impt_accnt_no_like")
    public String getImpt_accnt_no_like(){
        return impt_accnt_no_like;
    }

    @ElVoField(physicalName = "impt_accnt_no_like")
    public void setImpt_accnt_no_like(String impt_accnt_no_like){
        this.impt_accnt_no_like = impt_accnt_no_like;
    }

    @ElVoField(physicalName = "req_state_in1")
    public String getReq_state_in1(){
        return req_state_in1;
    }

    @ElVoField(physicalName = "req_state_in1")
    public void setReq_state_in1(String req_state_in1){
        this.req_state_in1 = req_state_in1;
    }

    @ElVoField(physicalName = "req_state_in2")
    public String getReq_state_in2(){
        return req_state_in2;
    }

    @ElVoField(physicalName = "req_state_in2")
    public void setReq_state_in2(String req_state_in2){
        this.req_state_in2 = req_state_in2;
    }

    @ElVoField(physicalName = "req_state_in3")
    public String getReq_state_in3(){
        return req_state_in3;
    }

    @ElVoField(physicalName = "req_state_in3")
    public void setReq_state_in3(String req_state_in3){
        this.req_state_in3 = req_state_in3;
    }

    @ElVoField(physicalName = "req_state_in4")
    public String getReq_state_in4(){
        return req_state_in4;
    }

    @ElVoField(physicalName = "req_state_in4")
    public void setReq_state_in4(String req_state_in4){
        this.req_state_in4 = req_state_in4;
    }

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

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public String getAccnt_rspns_dept_nm(){
        return accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public void setAccnt_rspns_dept_nm(String accnt_rspns_dept_nm){
        this.accnt_rspns_dept_nm = accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        return req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_amt")
    public String getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(String req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "ctrl_amt")
    public String getCtrl_amt(){
        return ctrl_amt;
    }

    @ElVoField(physicalName = "ctrl_amt")
    public void setCtrl_amt(String ctrl_amt){
        this.ctrl_amt = ctrl_amt;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public String getRcpt_psn(){
        return rcpt_psn;
    }

    @ElVoField(physicalName = "rcpt_psn")
    public void setRcpt_psn(String rcpt_psn){
        this.rcpt_psn = rcpt_psn;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "impt_accnt_rspns")
    public String getImpt_accnt_rspns(){
        return impt_accnt_rspns;
    }

    @ElVoField(physicalName = "impt_accnt_rspns")
    public void setImpt_accnt_rspns(String impt_accnt_rspns){
        this.impt_accnt_rspns = impt_accnt_rspns;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_dept_nm")
    public String getImpt_accnt_rspns_dept_nm(){
        return impt_accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_dept_nm")
    public void setImpt_accnt_rspns_dept_nm(String impt_accnt_rspns_dept_nm){
        this.impt_accnt_rspns_dept_nm = impt_accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "unslip_odr")
    public String getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(String unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_treat_qty")
    public String getReq_treat_qty(){
        return req_treat_qty;
    }

    @ElVoField(physicalName = "req_treat_qty")
    public void setReq_treat_qty(String req_treat_qty){
        this.req_treat_qty = req_treat_qty;
    }

    @ElVoField(physicalName = "trans_amt")
    public String getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(String trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "use_start_ymd")
    public String getUse_start_ymd(){
        return use_start_ymd;
    }

    @ElVoField(physicalName = "use_start_ymd")
    public void setUse_start_ymd(String use_start_ymd){
        this.use_start_ymd = use_start_ymd;
    }

    @ElVoField(physicalName = "use_start_time")
    public String getUse_start_time(){
        return use_start_time;
    }

    @ElVoField(physicalName = "use_start_time")
    public void setUse_start_time(String use_start_time){
        this.use_start_time = use_start_time;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public String getUse_cls_ymd(){
        return use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public void setUse_cls_ymd(String use_cls_ymd){
        this.use_cls_ymd = use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_time")
    public String getUse_cls_time(){
        return use_cls_time;
    }

    @ElVoField(physicalName = "use_cls_time")
    public void setUse_cls_time(String use_cls_time){
        this.use_cls_time = use_cls_time;
    }

    @ElVoField(physicalName = "use_time")
    public String getUse_time(){
        return use_time;
    }

    @ElVoField(physicalName = "use_time")
    public void setUse_time(String use_time){
        this.use_time = use_time;
    }

    @ElVoField(physicalName = "aset_name")
    public String getAset_name(){
        return aset_name;
    }

    @ElVoField(physicalName = "aset_name")
    public void setAset_name(String aset_name){
        this.aset_name = aset_name;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSuphExcelVo [");
        sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
        sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
        sb.append("complt_demnd_ymd_st").append("=").append(complt_demnd_ymd_st).append(",");
        sb.append("complt_demnd_ymd_ed").append("=").append(complt_demnd_ymd_ed).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm_like").append("=").append(req_psn_nm_like).append(",");
        sb.append("req_psn_empno_like").append("=").append(req_psn_empno_like).append(",");
        sb.append("rcpt_psn_syspayno").append("=").append(rcpt_psn_syspayno).append(",");
        sb.append("rcpt_psn_nm_like").append("=").append(rcpt_psn_nm_like).append(",");
        sb.append("rcpt_psn_empno_like").append("=").append(rcpt_psn_empno_like).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_like").append("=").append(accnt_no_like).append(",");
        sb.append("impt_accnt_no").append("=").append(impt_accnt_no).append(",");
        sb.append("impt_accnt_no_like").append("=").append(impt_accnt_no_like).append(",");
        sb.append("req_state_in1").append("=").append(req_state_in1).append(",");
        sb.append("req_state_in2").append("=").append(req_state_in2).append(",");
        sb.append("req_state_in3").append("=").append(req_state_in3).append(",");
        sb.append("req_state_in4").append("=").append(req_state_in4).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_dept_nm").append("=").append(accnt_rspns_dept_nm).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("ctrl_amt").append("=").append(ctrl_amt).append(",");
        sb.append("rcpt_psn").append("=").append(rcpt_psn).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("impt_accnt_rspns").append("=").append(impt_accnt_rspns).append(",");
        sb.append("impt_accnt_rspns_dept_nm").append("=").append(impt_accnt_rspns_dept_nm).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_treat_qty").append("=").append(req_treat_qty).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("use_start_ymd").append("=").append(use_start_ymd).append(",");
        sb.append("use_start_time").append("=").append(use_start_time).append(",");
        sb.append("use_cls_ymd").append("=").append(use_cls_ymd).append(",");
        sb.append("use_cls_time").append("=").append(use_cls_time).append(",");
        sb.append("use_time").append("=").append(use_time).append(",");
        sb.append("aset_name").append("=").append(aset_name).append(",");
        sb.append("aset_no").append("=").append(aset_no);
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
