package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구관리목록 Vo")
public class PurReqMastrMngVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqMastrMngVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "구매구분명", physicalName = "pur_clsf_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd_nm;

    @ElDtoField(logicalName = "구매담당자", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "구매담당자성명", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "주사용자", physicalName = "user_main_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_syspayno;

    @ElDtoField(logicalName = "주사용자성명", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "실사용자성명", physicalName = "user_sub_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_nm;

    @ElDtoField(logicalName = "구매요구금액", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "작성일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "부속구매요구번호", physicalName = "inhr_pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inhr_pur_req_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "품명", physicalName = "item_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_gdnm;

    @ElDtoField(logicalName = "계약번호", physicalName = "contrct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_no;

    @ElDtoField(logicalName = "계약순번", physicalName = "chng_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_seq;

    @ElDtoField(logicalName = "계약금액", physicalName = "contrct_tot_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long contrct_tot_amt;

    @ElDtoField(logicalName = "계약일자", physicalName = "contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_ymd;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_grp_cd;

    @ElDtoField(logicalName = "계약업체", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "구매검수번호", physicalName = "checkup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String checkup_req_no;

    @ElDtoField(logicalName = "납품일자", physicalName = "delvr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_ymd;

    @ElDtoField(logicalName = "검수일자", physicalName = "check_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_ymd;

    @ElDtoField(logicalName = "검수자성명", physicalName = "check_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_psn_nm;

    @ElDtoField(logicalName = "구매지급신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "지급신청일", physicalName = "pay_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_req_ymd;

    @ElDtoField(logicalName = "특정구매신청번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "공고번호", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "진행상태", physicalName = "progress_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress_status;

    @ElDtoField(logicalName = "최소사유", physicalName = "cancel_reason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancel_reason;

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "공고일자", physicalName = "noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd;

    @ElDtoField(logicalName = "장애인생산품구매가능여부", physicalName = "disabld_pur_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disabld_pur_yn;

    @ElDtoField(logicalName = "구매요구자", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "계정구매요구금액", physicalName = "accnt_demnd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_demnd_amt;

    @ElDtoField(logicalName = "사용자email", physicalName = "user_main_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_email;

    @ElDtoField(logicalName = "요청자email", physicalName = "req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_email;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd_nm")
    public String getPur_clsf_cd_nm(){
        return pur_clsf_cd_nm;
    }

    @ElVoField(physicalName = "pur_clsf_cd_nm")
    public void setPur_clsf_cd_nm(String pur_clsf_cd_nm){
        this.pur_clsf_cd_nm = pur_clsf_cd_nm;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public String getUser_main_syspayno(){
        return user_main_syspayno;
    }

    @ElVoField(physicalName = "user_main_syspayno")
    public void setUser_main_syspayno(String user_main_syspayno){
        this.user_main_syspayno = user_main_syspayno;
    }

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public String getUser_sub_nm(){
        return user_sub_nm;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public void setUser_sub_nm(String user_sub_nm){
        this.user_sub_nm = user_sub_nm;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
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

    @ElVoField(physicalName = "inhr_pur_req_no")
    public String getInhr_pur_req_no(){
        return inhr_pur_req_no;
    }

    @ElVoField(physicalName = "inhr_pur_req_no")
    public void setInhr_pur_req_no(String inhr_pur_req_no){
        this.inhr_pur_req_no = inhr_pur_req_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "item_gdnm")
    public String getItem_gdnm(){
        return item_gdnm;
    }

    @ElVoField(physicalName = "item_gdnm")
    public void setItem_gdnm(String item_gdnm){
        this.item_gdnm = item_gdnm;
    }

    @ElVoField(physicalName = "contrct_no")
    public String getContrct_no(){
        return contrct_no;
    }

    @ElVoField(physicalName = "contrct_no")
    public void setContrct_no(String contrct_no){
        this.contrct_no = contrct_no;
    }

    @ElVoField(physicalName = "chng_seq")
    public String getChng_seq(){
        return chng_seq;
    }

    @ElVoField(physicalName = "chng_seq")
    public void setChng_seq(String chng_seq){
        this.chng_seq = chng_seq;
    }

    @ElVoField(physicalName = "contrct_tot_amt")
    public long getContrct_tot_amt(){
        return contrct_tot_amt;
    }

    @ElVoField(physicalName = "contrct_tot_amt")
    public void setContrct_tot_amt(long contrct_tot_amt){
        this.contrct_tot_amt = contrct_tot_amt;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public String getContrct_ymd(){
        return contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public void setContrct_ymd(String contrct_ymd){
        this.contrct_ymd = contrct_ymd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public String getPur_grp_cd(){
        return pur_grp_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public void setPur_grp_cd(String pur_grp_cd){
        this.pur_grp_cd = pur_grp_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "checkup_req_no")
    public String getCheckup_req_no(){
        return checkup_req_no;
    }

    @ElVoField(physicalName = "checkup_req_no")
    public void setCheckup_req_no(String checkup_req_no){
        this.checkup_req_no = checkup_req_no;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public String getDelvr_ymd(){
        return delvr_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public void setDelvr_ymd(String delvr_ymd){
        this.delvr_ymd = delvr_ymd;
    }

    @ElVoField(physicalName = "check_ymd")
    public String getCheck_ymd(){
        return check_ymd;
    }

    @ElVoField(physicalName = "check_ymd")
    public void setCheck_ymd(String check_ymd){
        this.check_ymd = check_ymd;
    }

    @ElVoField(physicalName = "check_psn_nm")
    public String getCheck_psn_nm(){
        return check_psn_nm;
    }

    @ElVoField(physicalName = "check_psn_nm")
    public void setCheck_psn_nm(String check_psn_nm){
        this.check_psn_nm = check_psn_nm;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "pay_req_ymd")
    public String getPay_req_ymd(){
        return pay_req_ymd;
    }

    @ElVoField(physicalName = "pay_req_ymd")
    public void setPay_req_ymd(String pay_req_ymd){
        this.pay_req_ymd = pay_req_ymd;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        return req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "progress_status")
    public String getProgress_status(){
        return progress_status;
    }

    @ElVoField(physicalName = "progress_status")
    public void setProgress_status(String progress_status){
        this.progress_status = progress_status;
    }

    @ElVoField(physicalName = "cancel_reason")
    public String getCancel_reason(){
        return cancel_reason;
    }

    @ElVoField(physicalName = "cancel_reason")
    public void setCancel_reason(String cancel_reason){
        this.cancel_reason = cancel_reason;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "noti_ymd")
    public String getNoti_ymd(){
        return noti_ymd;
    }

    @ElVoField(physicalName = "noti_ymd")
    public void setNoti_ymd(String noti_ymd){
        this.noti_ymd = noti_ymd;
    }

    @ElVoField(physicalName = "disabld_pur_yn")
    public String getDisabld_pur_yn(){
        return disabld_pur_yn;
    }

    @ElVoField(physicalName = "disabld_pur_yn")
    public void setDisabld_pur_yn(String disabld_pur_yn){
        this.disabld_pur_yn = disabld_pur_yn;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "accnt_demnd_amt")
    public String getAccnt_demnd_amt(){
        return accnt_demnd_amt;
    }

    @ElVoField(physicalName = "accnt_demnd_amt")
    public void setAccnt_demnd_amt(String accnt_demnd_amt){
        this.accnt_demnd_amt = accnt_demnd_amt;
    }

    @ElVoField(physicalName = "user_main_email")
    public String getUser_main_email(){
        return user_main_email;
    }

    @ElVoField(physicalName = "user_main_email")
    public void setUser_main_email(String user_main_email){
        this.user_main_email = user_main_email;
    }

    @ElVoField(physicalName = "req_psn_email")
    public String getReq_psn_email(){
        return req_psn_email;
    }

    @ElVoField(physicalName = "req_psn_email")
    public void setReq_psn_email(String req_psn_email){
        this.req_psn_email = req_psn_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqMastrMngVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_clsf_cd_nm").append("=").append(pur_clsf_cd_nm).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("user_main_syspayno").append("=").append(user_main_syspayno).append(",");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("user_sub_nm").append("=").append(user_sub_nm).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("inhr_pur_req_no").append("=").append(inhr_pur_req_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("item_gdnm").append("=").append(item_gdnm).append(",");
        sb.append("contrct_no").append("=").append(contrct_no).append(",");
        sb.append("chng_seq").append("=").append(chng_seq).append(",");
        sb.append("contrct_tot_amt").append("=").append(contrct_tot_amt).append(",");
        sb.append("contrct_ymd").append("=").append(contrct_ymd).append(",");
        sb.append("pur_grp_cd").append("=").append(pur_grp_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("checkup_req_no").append("=").append(checkup_req_no).append(",");
        sb.append("delvr_ymd").append("=").append(delvr_ymd).append(",");
        sb.append("check_ymd").append("=").append(check_ymd).append(",");
        sb.append("check_psn_nm").append("=").append(check_psn_nm).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("pay_req_ymd").append("=").append(pay_req_ymd).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("progress_status").append("=").append(progress_status).append(",");
        sb.append("cancel_reason").append("=").append(cancel_reason).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("noti_ymd").append("=").append(noti_ymd).append(",");
        sb.append("disabld_pur_yn").append("=").append(disabld_pur_yn).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("accnt_demnd_amt").append("=").append(accnt_demnd_amt).append(",");
        sb.append("user_main_email").append("=").append(user_main_email).append(",");
        sb.append("req_psn_email").append("=").append(req_psn_email);
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
