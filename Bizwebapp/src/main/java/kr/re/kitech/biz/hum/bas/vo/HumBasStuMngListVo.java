package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumBasStuMngListVo")
public class HumBasStuMngListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasStuMngListVo(){
    }

    @ElDtoField(logicalName = "to_mail_chk", physicalName = "to_mail_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_mail_chk;

    @ElDtoField(logicalName = "work_clsf_nm", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "employ_type", physicalName = "employ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String employ_type;

    @ElDtoField(logicalName = "divsn_dept_nm", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "month_work_time", physicalName = "month_work_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_work_time;

    @ElDtoField(logicalName = "week_work_time", physicalName = "week_work_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String week_work_time;

    @ElDtoField(logicalName = "convsn_rts", physicalName = "convsn_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String convsn_rts;

    @ElDtoField(logicalName = "use_rt", physicalName = "use_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_rt;

    @ElDtoField(logicalName = "entr_schl_nm", physicalName = "entr_schl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_schl_nm;

    @ElDtoField(logicalName = "entr_degr", physicalName = "entr_degr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_degr;

    @ElDtoField(logicalName = "frs_entr", physicalName = "frs_entr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frs_entr;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "contrct_cls_ymd", physicalName = "contrct_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_ymd;

    @ElDtoField(logicalName = "retire_ymd", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "educ", physicalName = "educ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ;

    @ElDtoField(logicalName = "contrct_apr_state_nm", physicalName = "contrct_apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_apr_state_nm;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "enter_encrg_state", physicalName = "enter_encrg_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enter_encrg_state;

    @ElDtoField(logicalName = "retire_encrg_state", physicalName = "retire_encrg_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_encrg_state;

    @ElDtoField(logicalName = "pruse_respn_man_nm", physicalName = "pruse_respn_man_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_man_nm;

    @ElDtoField(logicalName = "month_contrct_amt_sum", physicalName = "month_contrct_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month_contrct_amt_sum;

    @ElDtoField(logicalName = "contrct_amt", physicalName = "contrct_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_amt;

    @ElDtoField(logicalName = "vend_nm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "vend_nm_bt", physicalName = "vend_nm_bt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm_bt;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "sch_grant", physicalName = "sch_grant", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sch_grant;

    @ElDtoField(logicalName = "apy_req_no", physicalName = "apy_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apy_req_no;

    @ElDtoField(logicalName = "ret_req_no", physicalName = "ret_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ret_req_no;

    @ElDtoField(logicalName = "pruse_respn_psn", physicalName = "pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn;

    @ElDtoField(logicalName = "work_land", physicalName = "work_land", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "pruse_respn_psn_list", physicalName = "pruse_respn_psn_list", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn_list;

    @ElDtoField(logicalName = "sex", physicalName = "sex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sex;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "home_tel", physicalName = "home_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String home_tel;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "addr", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "edulist", physicalName = "edulist", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String edulist;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "gubn", physicalName = "gubn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubn;

    @ElDtoField(logicalName = "req_syspayno_email", physicalName = "req_syspayno_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno_email;

    @ElVoField(physicalName = "to_mail_chk")
    public String getTo_mail_chk(){
        return to_mail_chk;
    }

    @ElVoField(physicalName = "to_mail_chk")
    public void setTo_mail_chk(String to_mail_chk){
        this.to_mail_chk = to_mail_chk;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "employ_type")
    public String getEmploy_type(){
        return employ_type;
    }

    @ElVoField(physicalName = "employ_type")
    public void setEmploy_type(String employ_type){
        this.employ_type = employ_type;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "month_work_time")
    public String getMonth_work_time(){
        return month_work_time;
    }

    @ElVoField(physicalName = "month_work_time")
    public void setMonth_work_time(String month_work_time){
        this.month_work_time = month_work_time;
    }

    @ElVoField(physicalName = "week_work_time")
    public String getWeek_work_time(){
        return week_work_time;
    }

    @ElVoField(physicalName = "week_work_time")
    public void setWeek_work_time(String week_work_time){
        this.week_work_time = week_work_time;
    }

    @ElVoField(physicalName = "convsn_rts")
    public String getConvsn_rts(){
        return convsn_rts;
    }

    @ElVoField(physicalName = "convsn_rts")
    public void setConvsn_rts(String convsn_rts){
        this.convsn_rts = convsn_rts;
    }

    @ElVoField(physicalName = "use_rt")
    public String getUse_rt(){
        return use_rt;
    }

    @ElVoField(physicalName = "use_rt")
    public void setUse_rt(String use_rt){
        this.use_rt = use_rt;
    }

    @ElVoField(physicalName = "entr_schl_nm")
    public String getEntr_schl_nm(){
        return entr_schl_nm;
    }

    @ElVoField(physicalName = "entr_schl_nm")
    public void setEntr_schl_nm(String entr_schl_nm){
        this.entr_schl_nm = entr_schl_nm;
    }

    @ElVoField(physicalName = "entr_degr")
    public String getEntr_degr(){
        return entr_degr;
    }

    @ElVoField(physicalName = "entr_degr")
    public void setEntr_degr(String entr_degr){
        this.entr_degr = entr_degr;
    }

    @ElVoField(physicalName = "frs_entr")
    public String getFrs_entr(){
        return frs_entr;
    }

    @ElVoField(physicalName = "frs_entr")
    public void setFrs_entr(String frs_entr){
        this.frs_entr = frs_entr;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public String getContrct_cls_ymd(){
        return contrct_cls_ymd;
    }

    @ElVoField(physicalName = "contrct_cls_ymd")
    public void setContrct_cls_ymd(String contrct_cls_ymd){
        this.contrct_cls_ymd = contrct_cls_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public String getRetire_ymd(){
        return retire_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public void setRetire_ymd(String retire_ymd){
        this.retire_ymd = retire_ymd;
    }

    @ElVoField(physicalName = "educ")
    public String getEduc(){
        return educ;
    }

    @ElVoField(physicalName = "educ")
    public void setEduc(String educ){
        this.educ = educ;
    }

    @ElVoField(physicalName = "contrct_apr_state_nm")
    public String getContrct_apr_state_nm(){
        return contrct_apr_state_nm;
    }

    @ElVoField(physicalName = "contrct_apr_state_nm")
    public void setContrct_apr_state_nm(String contrct_apr_state_nm){
        this.contrct_apr_state_nm = contrct_apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "enter_encrg_state")
    public String getEnter_encrg_state(){
        return enter_encrg_state;
    }

    @ElVoField(physicalName = "enter_encrg_state")
    public void setEnter_encrg_state(String enter_encrg_state){
        this.enter_encrg_state = enter_encrg_state;
    }

    @ElVoField(physicalName = "retire_encrg_state")
    public String getRetire_encrg_state(){
        return retire_encrg_state;
    }

    @ElVoField(physicalName = "retire_encrg_state")
    public void setRetire_encrg_state(String retire_encrg_state){
        this.retire_encrg_state = retire_encrg_state;
    }

    @ElVoField(physicalName = "pruse_respn_man_nm")
    public String getPruse_respn_man_nm(){
        return pruse_respn_man_nm;
    }

    @ElVoField(physicalName = "pruse_respn_man_nm")
    public void setPruse_respn_man_nm(String pruse_respn_man_nm){
        this.pruse_respn_man_nm = pruse_respn_man_nm;
    }

    @ElVoField(physicalName = "month_contrct_amt_sum")
    public String getMonth_contrct_amt_sum(){
        return month_contrct_amt_sum;
    }

    @ElVoField(physicalName = "month_contrct_amt_sum")
    public void setMonth_contrct_amt_sum(String month_contrct_amt_sum){
        this.month_contrct_amt_sum = month_contrct_amt_sum;
    }

    @ElVoField(physicalName = "contrct_amt")
    public String getContrct_amt(){
        return contrct_amt;
    }

    @ElVoField(physicalName = "contrct_amt")
    public void setContrct_amt(String contrct_amt){
        this.contrct_amt = contrct_amt;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "vend_nm_bt")
    public String getVend_nm_bt(){
        return vend_nm_bt;
    }

    @ElVoField(physicalName = "vend_nm_bt")
    public void setVend_nm_bt(String vend_nm_bt){
        this.vend_nm_bt = vend_nm_bt;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "sch_grant")
    public String getSch_grant(){
        return sch_grant;
    }

    @ElVoField(physicalName = "sch_grant")
    public void setSch_grant(String sch_grant){
        this.sch_grant = sch_grant;
    }

    @ElVoField(physicalName = "apy_req_no")
    public String getApy_req_no(){
        return apy_req_no;
    }

    @ElVoField(physicalName = "apy_req_no")
    public void setApy_req_no(String apy_req_no){
        this.apy_req_no = apy_req_no;
    }

    @ElVoField(physicalName = "ret_req_no")
    public String getRet_req_no(){
        return ret_req_no;
    }

    @ElVoField(physicalName = "ret_req_no")
    public void setRet_req_no(String ret_req_no){
        this.ret_req_no = ret_req_no;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public String getPruse_respn_psn(){
        return pruse_respn_psn;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public void setPruse_respn_psn(String pruse_respn_psn){
        this.pruse_respn_psn = pruse_respn_psn;
    }

    @ElVoField(physicalName = "work_land")
    public String getWork_land(){
        return work_land;
    }

    @ElVoField(physicalName = "work_land")
    public void setWork_land(String work_land){
        this.work_land = work_land;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "pruse_respn_psn_list")
    public String getPruse_respn_psn_list(){
        return pruse_respn_psn_list;
    }

    @ElVoField(physicalName = "pruse_respn_psn_list")
    public void setPruse_respn_psn_list(String pruse_respn_psn_list){
        this.pruse_respn_psn_list = pruse_respn_psn_list;
    }

    @ElVoField(physicalName = "sex")
    public String getSex(){
        return sex;
    }

    @ElVoField(physicalName = "sex")
    public void setSex(String sex){
        this.sex = sex;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "home_tel")
    public String getHome_tel(){
        return home_tel;
    }

    @ElVoField(physicalName = "home_tel")
    public void setHome_tel(String home_tel){
        this.home_tel = home_tel;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "edulist")
    public String getEdulist(){
        return edulist;
    }

    @ElVoField(physicalName = "edulist")
    public void setEdulist(String edulist){
        this.edulist = edulist;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "gubn")
    public String getGubn(){
        return gubn;
    }

    @ElVoField(physicalName = "gubn")
    public void setGubn(String gubn){
        this.gubn = gubn;
    }

    @ElVoField(physicalName = "req_syspayno_email")
    public String getReq_syspayno_email(){
        return req_syspayno_email;
    }

    @ElVoField(physicalName = "req_syspayno_email")
    public void setReq_syspayno_email(String req_syspayno_email){
        this.req_syspayno_email = req_syspayno_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasStuMngListVo [");
        sb.append("to_mail_chk").append("=").append(to_mail_chk).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("employ_type").append("=").append(employ_type).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("month_work_time").append("=").append(month_work_time).append(",");
        sb.append("week_work_time").append("=").append(week_work_time).append(",");
        sb.append("convsn_rts").append("=").append(convsn_rts).append(",");
        sb.append("use_rt").append("=").append(use_rt).append(",");
        sb.append("entr_schl_nm").append("=").append(entr_schl_nm).append(",");
        sb.append("entr_degr").append("=").append(entr_degr).append(",");
        sb.append("frs_entr").append("=").append(frs_entr).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("contrct_cls_ymd").append("=").append(contrct_cls_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("educ").append("=").append(educ).append(",");
        sb.append("contrct_apr_state_nm").append("=").append(contrct_apr_state_nm).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("enter_encrg_state").append("=").append(enter_encrg_state).append(",");
        sb.append("retire_encrg_state").append("=").append(retire_encrg_state).append(",");
        sb.append("pruse_respn_man_nm").append("=").append(pruse_respn_man_nm).append(",");
        sb.append("month_contrct_amt_sum").append("=").append(month_contrct_amt_sum).append(",");
        sb.append("contrct_amt").append("=").append(contrct_amt).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("vend_nm_bt").append("=").append(vend_nm_bt).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("sch_grant").append("=").append(sch_grant).append(",");
        sb.append("apy_req_no").append("=").append(apy_req_no).append(",");
        sb.append("ret_req_no").append("=").append(ret_req_no).append(",");
        sb.append("pruse_respn_psn").append("=").append(pruse_respn_psn).append(",");
        sb.append("work_land").append("=").append(work_land).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("pruse_respn_psn_list").append("=").append(pruse_respn_psn_list).append(",");
        sb.append("sex").append("=").append(sex).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("home_tel").append("=").append(home_tel).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("edulist").append("=").append(edulist).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("gubn").append("=").append(gubn).append(",");
        sb.append("req_syspayno_email").append("=").append(req_syspayno_email);
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
