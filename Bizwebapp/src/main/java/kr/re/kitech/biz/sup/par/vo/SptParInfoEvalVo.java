package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptParInfoEvalExp")
public class SptParInfoEvalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptParInfoEvalVo(){
    }

    @ElDtoField(logicalName = "parEvalReqNo", physicalName = "par_eval_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String par_eval_req_no;

    @ElDtoField(logicalName = "appontNo", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "appont_ymd", physicalName = "파트너기업지정일", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String 파트너기업지정일;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "evalYmdSt", physicalName = "eval_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_ymd_st;

    @ElDtoField(logicalName = "evalYmdEnd", physicalName = "eval_ymd_end", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_ymd_end;

    @ElDtoField(logicalName = "appontYmdSt", physicalName = "appont_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_ymd_st;

    @ElDtoField(logicalName = "appontYmdEnd", physicalName = "appont_ymd_end", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_ymd_end;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "evalUpdtDaytm", physicalName = "eval_updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_updt_daytm;

    @ElDtoField(logicalName = "parRegstDaytm", physicalName = "par_regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String par_regst_daytm;

    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "reprsPsn", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "cmpyReprsTel", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;

    @ElDtoField(logicalName = "programEtc", physicalName = "program_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String program_etc;

    @ElDtoField(logicalName = "mentoKeepYn", physicalName = "mento_keep_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mento_keep_yn;

    @ElDtoField(logicalName = "mentoSyspayno", physicalName = "mento_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mento_syspayno;

    @ElDtoField(logicalName = "mentoEmpno", physicalName = "mento_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mento_empno;

    @ElDtoField(logicalName = "mentoNm", physicalName = "mento_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mento_nm;

    @ElDtoField(logicalName = "recMentoReason", physicalName = "rec_mento_reason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_mento_reason;

    @ElDtoField(logicalName = "evalDaytm", physicalName = "eval_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_daytm;

    @ElDtoField(logicalName = "regstNm", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "멘토", physicalName = "manager_sysno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_sysno;

    @ElDtoField(logicalName = "멘토개인번호", physicalName = "manager_sysnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_sysnm;

    @ElDtoField(logicalName = "추천멘토", physicalName = "rec_mento_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_mento_nm;

    @ElDtoField(logicalName = "추천멘토개인번호", physicalName = "rec_mento_sysno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rec_mento_sysno;

    @ElDtoField(logicalName = "최종유지심사일", physicalName = "last_eval_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String last_eval_ymd;

    @ElDtoField(logicalName = "최종유지심사자", physicalName = "last_eval_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String last_eval_nm;
    
    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;
    
    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElVoField(physicalName = "par_eval_req_no")
    public String getPar_eval_req_no(){
        return par_eval_req_no;
    }

    @ElVoField(physicalName = "par_eval_req_no")
    public void setPar_eval_req_no(String par_eval_req_no){
        this.par_eval_req_no = par_eval_req_no;
    }

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }

    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "파트너기업지정일")
    public String get파트너기업지정일(){
        return 파트너기업지정일;
    }

    @ElVoField(physicalName = "파트너기업지정일")
    public void set파트너기업지정일(String 파트너기업지정일){
        this.파트너기업지정일 = 파트너기업지정일;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "eval_ymd_st")
    public String getEval_ymd_st(){
        return eval_ymd_st;
    }

    @ElVoField(physicalName = "eval_ymd_st")
    public void setEval_ymd_st(String eval_ymd_st){
        this.eval_ymd_st = eval_ymd_st;
    }

    @ElVoField(physicalName = "eval_ymd_end")
    public String getEval_ymd_end(){
        return eval_ymd_end;
    }

    @ElVoField(physicalName = "eval_ymd_end")
    public void setEval_ymd_end(String eval_ymd_end){
        this.eval_ymd_end = eval_ymd_end;
    }

    @ElVoField(physicalName = "appont_ymd_st")
    public String getAppont_ymd_st(){
        return appont_ymd_st;
    }

    @ElVoField(physicalName = "appont_ymd_st")
    public void setAppont_ymd_st(String appont_ymd_st){
        this.appont_ymd_st = appont_ymd_st;
    }

    @ElVoField(physicalName = "appont_ymd_end")
    public String getAppont_ymd_end(){
        return appont_ymd_end;
    }

    @ElVoField(physicalName = "appont_ymd_end")
    public void setAppont_ymd_end(String appont_ymd_end){
        this.appont_ymd_end = appont_ymd_end;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "eval_updt_daytm")
    public String getEval_updt_daytm(){
        return eval_updt_daytm;
    }

    @ElVoField(physicalName = "eval_updt_daytm")
    public void setEval_updt_daytm(String eval_updt_daytm){
        this.eval_updt_daytm = eval_updt_daytm;
    }

    @ElVoField(physicalName = "par_regst_daytm")
    public String getPar_regst_daytm(){
        return par_regst_daytm;
    }

    @ElVoField(physicalName = "par_regst_daytm")
    public void setPar_regst_daytm(String par_regst_daytm){
        this.par_regst_daytm = par_regst_daytm;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "program_etc")
    public String getProgram_etc(){
        return program_etc;
    }

    @ElVoField(physicalName = "program_etc")
    public void setProgram_etc(String program_etc){
        this.program_etc = program_etc;
    }

    @ElVoField(physicalName = "mento_keep_yn")
    public String getMento_keep_yn(){
        return mento_keep_yn;
    }

    @ElVoField(physicalName = "mento_keep_yn")
    public void setMento_keep_yn(String mento_keep_yn){
        this.mento_keep_yn = mento_keep_yn;
    }

    @ElVoField(physicalName = "mento_syspayno")
    public String getMento_syspayno(){
        return mento_syspayno;
    }

    @ElVoField(physicalName = "mento_syspayno")
    public void setMento_syspayno(String mento_syspayno){
        this.mento_syspayno = mento_syspayno;
    }

    @ElVoField(physicalName = "mento_empno")
    public String getMento_empno(){
        return mento_empno;
    }

    @ElVoField(physicalName = "mento_empno")
    public void setMento_empno(String mento_empno){
        this.mento_empno = mento_empno;
    }

    @ElVoField(physicalName = "mento_nm")
    public String getMento_nm(){
        return mento_nm;
    }

    @ElVoField(physicalName = "mento_nm")
    public void setMento_nm(String mento_nm){
        this.mento_nm = mento_nm;
    }

    @ElVoField(physicalName = "rec_mento_reason")
    public String getRec_mento_reason(){
        return rec_mento_reason;
    }

    @ElVoField(physicalName = "rec_mento_reason")
    public void setRec_mento_reason(String rec_mento_reason){
        this.rec_mento_reason = rec_mento_reason;
    }

    @ElVoField(physicalName = "eval_daytm")
    public String getEval_daytm(){
        return eval_daytm;
    }

    @ElVoField(physicalName = "eval_daytm")
    public void setEval_daytm(String eval_daytm){
        this.eval_daytm = eval_daytm;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "manager_sysno")
    public String getManager_sysno(){
        return manager_sysno;
    }

    @ElVoField(physicalName = "manager_sysno")
    public void setManager_sysno(String manager_sysno){
        this.manager_sysno = manager_sysno;
    }

    @ElVoField(physicalName = "manager_sysnm")
    public String getManager_sysnm(){
        return manager_sysnm;
    }

    @ElVoField(physicalName = "manager_sysnm")
    public void setManager_sysnm(String manager_sysnm){
        this.manager_sysnm = manager_sysnm;
    }

    @ElVoField(physicalName = "rec_mento_nm")
    public String getRec_mento_nm(){
        return rec_mento_nm;
    }

    @ElVoField(physicalName = "rec_mento_nm")
    public void setRec_mento_nm(String rec_mento_nm){
        this.rec_mento_nm = rec_mento_nm;
    }

    @ElVoField(physicalName = "rec_mento_sysno")
    public String getRec_mento_sysno(){
        return rec_mento_sysno;
    }

    @ElVoField(physicalName = "rec_mento_sysno")
    public void setRec_mento_sysno(String rec_mento_sysno){
        this.rec_mento_sysno = rec_mento_sysno;
    }

    @ElVoField(physicalName = "last_eval_ymd")
    public String getLast_eval_ymd(){
        return last_eval_ymd;
    }

    @ElVoField(physicalName = "last_eval_ymd")
    public void setLast_eval_ymd(String last_eval_ymd){
        this.last_eval_ymd = last_eval_ymd;
    }

    @ElVoField(physicalName = "last_eval_nm")
    public String getLast_eval_nm(){
        return last_eval_nm;
    }

    @ElVoField(physicalName = "last_eval_nm")
    public void setLast_eval_nm(String last_eval_nm){
        this.last_eval_nm = last_eval_nm;
    }
    
    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }
    
    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptParInfoEvalVo [");
        sb.append("par_eval_req_no").append("=").append(par_eval_req_no).append(",");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("파트너기업지정일").append("=").append(파트너기업지정일).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("eval_ymd_st").append("=").append(eval_ymd_st).append(",");
        sb.append("eval_ymd_end").append("=").append(eval_ymd_end).append(",");
        sb.append("appont_ymd_st").append("=").append(appont_ymd_st).append(",");
        sb.append("appont_ymd_end").append("=").append(appont_ymd_end).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("eval_updt_daytm").append("=").append(eval_updt_daytm).append(",");
        sb.append("par_regst_daytm").append("=").append(par_regst_daytm).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
        sb.append("program_etc").append("=").append(program_etc).append(",");
        sb.append("mento_keep_yn").append("=").append(mento_keep_yn).append(",");
        sb.append("mento_syspayno").append("=").append(mento_syspayno).append(",");
        sb.append("mento_empno").append("=").append(mento_empno).append(",");
        sb.append("mento_nm").append("=").append(mento_nm).append(",");
        sb.append("rec_mento_reason").append("=").append(rec_mento_reason).append(",");
        sb.append("eval_daytm").append("=").append(eval_daytm).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("manager_sysno").append("=").append(manager_sysno).append(",");
        sb.append("manager_sysnm").append("=").append(manager_sysnm).append(",");
        sb.append("rec_mento_nm").append("=").append(rec_mento_nm).append(",");
        sb.append("rec_mento_sysno").append("=").append(rec_mento_sysno).append(",");
        sb.append("last_eval_ymd").append("=").append(last_eval_ymd).append(",");
        sb.append("last_eval_nm").append("=").append(last_eval_nm).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("service_id").append("=").append(service_id);
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
