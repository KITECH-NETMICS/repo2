package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinRcmsPaySend04Exp")
public class FinRcmsPaySend04Vo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinRcmsPaySend04Vo(){
    }

    @ElDtoField(logicalName = "accntYmdSt", physicalName = "accnt_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_st;

    @ElDtoField(logicalName = "resch_slip_type_cd", physicalName = "resch_slip_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_slip_type_cd;

    @ElDtoField(logicalName = "accntYmdEd", physicalName = "accnt_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_ed;

    @ElDtoField(logicalName = "cardUseEx", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "slipNo", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "reschAccntClsf", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf;

    @ElDtoField(logicalName = "erpSendNo", physicalName = "erp_send_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_send_no;

    @ElDtoField(logicalName = "selAprState", physicalName = "sel_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sel_apr_state;

    @ElDtoField(logicalName = "lnkRegSeq", physicalName = "lnk_reg_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_seq;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "accntCdAbbr", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "unslipAmt", physicalName = "unslip_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_amt;

    @ElDtoField(logicalName = "transAmt", physicalName = "trans_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_amt;

    @ElDtoField(logicalName = "payAccntCd", physicalName = "pay_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_accnt_cd;

    @ElDtoField(logicalName = "rcmsPayClsf", physicalName = "rcms_pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcms_pay_clsf;

    @ElDtoField(logicalName = "rcmsPayUnslipNo", physicalName = "rcms_pay_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcms_pay_unslip_no;

    @ElDtoField(logicalName = "billNo", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "evidCd", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "rmk2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "paymUsag", physicalName = "paym_usag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paym_usag;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "wrtePsnNm", physicalName = "wrte_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_nm;

    @ElDtoField(logicalName = "slipNoOdr", physicalName = "slip_no_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no_odr;

    @ElDtoField(logicalName = "transUnslipNo", physicalName = "trans_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_unslip_no;

    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "bugtCtrlPsnNm", physicalName = "bugt_ctrl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_nm;

    @ElDtoField(logicalName = "lnkRegDt", physicalName = "lnk_reg_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_dt;

    @ElDtoField(logicalName = "exctnExecDt", physicalName = "exctn_exec_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exctn_exec_dt;

    @ElDtoField(logicalName = "bzExpExctnErrCtt", physicalName = "bz_exp_exctn_err_ctt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bz_exp_exctn_err_ctt;

    @ElDtoField(logicalName = "splrBzRegNo", physicalName = "splr_bz_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_bz_reg_no;

    @ElDtoField(logicalName = "rchExpAcctNo", physicalName = "rch_exp_acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rch_exp_acct_no;

    @ElDtoField(logicalName = "instSbjtPrgrSt", physicalName = "inst_sbjt_prgr_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_sbjt_prgr_st;

    @ElDtoField(logicalName = "exctnLimtSt", physicalName = "exctn_limt_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exctn_limt_st;

    @ElDtoField(logicalName = "instTotlInstAmt", physicalName = "inst_totl_inst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_totl_inst_amt;

    @ElDtoField(logicalName = "pmsId", physicalName = "pms_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pms_id;

    @ElDtoField(logicalName = "instSbjtNo", physicalName = "inst_sbjt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_sbjt_no;

    @ElDtoField(logicalName = "procState", physicalName = "proc_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String proc_state;

    @ElDtoField(logicalName = "trnsAmt", physicalName = "trns_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trns_amt;

    @ElDtoField(logicalName = "prjYmdYn", physicalName = "prj_ymd_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_ymd_yn;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "itxpCd", physicalName = "itxp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itxp_cd;

    @ElDtoField(logicalName = "frcTrscYn", physicalName = "frc_trsc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frc_trsc_yn;

    @ElDtoField(logicalName = "etcEvdcRsnCd", physicalName = "etc_evdc_rsn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_evdc_rsn_cd;

    @ElDtoField(logicalName = "accntRspnsEmail", physicalName = "accnt_rspns_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_email;

    @ElDtoField(logicalName = "bugtCtrlPsnEmail", physicalName = "bugt_ctrl_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_email;

    @ElDtoField(logicalName = "wrtePsnEmail", physicalName = "wrte_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_email;

    @ElDtoField(logicalName = "sbjt_state", physicalName = "sbjt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbjt_state;

    @ElVoField(physicalName = "accnt_ymd_st")
    public String getAccnt_ymd_st(){
        return accnt_ymd_st;
    }

    @ElVoField(physicalName = "accnt_ymd_st")
    public void setAccnt_ymd_st(String accnt_ymd_st){
        this.accnt_ymd_st = accnt_ymd_st;
    }

    @ElVoField(physicalName = "resch_slip_type_cd")
    public String getResch_slip_type_cd(){
        return resch_slip_type_cd;
    }

    @ElVoField(physicalName = "resch_slip_type_cd")
    public void setResch_slip_type_cd(String resch_slip_type_cd){
        this.resch_slip_type_cd = resch_slip_type_cd;
    }

    @ElVoField(physicalName = "accnt_ymd_ed")
    public String getAccnt_ymd_ed(){
        return accnt_ymd_ed;
    }

    @ElVoField(physicalName = "accnt_ymd_ed")
    public void setAccnt_ymd_ed(String accnt_ymd_ed){
        this.accnt_ymd_ed = accnt_ymd_ed;
    }

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public String getResch_accnt_clsf(){
        return resch_accnt_clsf;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public void setResch_accnt_clsf(String resch_accnt_clsf){
        this.resch_accnt_clsf = resch_accnt_clsf;
    }

    @ElVoField(physicalName = "erp_send_no")
    public String getErp_send_no(){
        return erp_send_no;
    }

    @ElVoField(physicalName = "erp_send_no")
    public void setErp_send_no(String erp_send_no){
        this.erp_send_no = erp_send_no;
    }

    @ElVoField(physicalName = "sel_apr_state")
    public String getSel_apr_state(){
        return sel_apr_state;
    }

    @ElVoField(physicalName = "sel_apr_state")
    public void setSel_apr_state(String sel_apr_state){
        this.sel_apr_state = sel_apr_state;
    }

    @ElVoField(physicalName = "lnk_reg_seq")
    public String getLnk_reg_seq(){
        return lnk_reg_seq;
    }

    @ElVoField(physicalName = "lnk_reg_seq")
    public void setLnk_reg_seq(String lnk_reg_seq){
        this.lnk_reg_seq = lnk_reg_seq;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "unslip_amt")
    public String getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(String unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public String getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(String trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "pay_accnt_cd")
    public String getPay_accnt_cd(){
        return pay_accnt_cd;
    }

    @ElVoField(physicalName = "pay_accnt_cd")
    public void setPay_accnt_cd(String pay_accnt_cd){
        this.pay_accnt_cd = pay_accnt_cd;
    }

    @ElVoField(physicalName = "rcms_pay_clsf")
    public String getRcms_pay_clsf(){
        return rcms_pay_clsf;
    }

    @ElVoField(physicalName = "rcms_pay_clsf")
    public void setRcms_pay_clsf(String rcms_pay_clsf){
        this.rcms_pay_clsf = rcms_pay_clsf;
    }

    @ElVoField(physicalName = "rcms_pay_unslip_no")
    public String getRcms_pay_unslip_no(){
        return rcms_pay_unslip_no;
    }

    @ElVoField(physicalName = "rcms_pay_unslip_no")
    public void setRcms_pay_unslip_no(String rcms_pay_unslip_no){
        this.rcms_pay_unslip_no = rcms_pay_unslip_no;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "paym_usag")
    public String getPaym_usag(){
        return paym_usag;
    }

    @ElVoField(physicalName = "paym_usag")
    public void setPaym_usag(String paym_usag){
        this.paym_usag = paym_usag;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public String getWrte_psn_nm(){
        return wrte_psn_nm;
    }

    @ElVoField(physicalName = "wrte_psn_nm")
    public void setWrte_psn_nm(String wrte_psn_nm){
        this.wrte_psn_nm = wrte_psn_nm;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public String getSlip_no_odr(){
        return slip_no_odr;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public void setSlip_no_odr(String slip_no_odr){
        this.slip_no_odr = slip_no_odr;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public String getTrans_unslip_no(){
        return trans_unslip_no;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public void setTrans_unslip_no(String trans_unslip_no){
        this.trans_unslip_no = trans_unslip_no;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public String getBugt_ctrl_psn_nm(){
        return bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public void setBugt_ctrl_psn_nm(String bugt_ctrl_psn_nm){
        this.bugt_ctrl_psn_nm = bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "lnk_reg_dt")
    public String getLnk_reg_dt(){
        return lnk_reg_dt;
    }

    @ElVoField(physicalName = "lnk_reg_dt")
    public void setLnk_reg_dt(String lnk_reg_dt){
        this.lnk_reg_dt = lnk_reg_dt;
    }

    @ElVoField(physicalName = "exctn_exec_dt")
    public String getExctn_exec_dt(){
        return exctn_exec_dt;
    }

    @ElVoField(physicalName = "exctn_exec_dt")
    public void setExctn_exec_dt(String exctn_exec_dt){
        this.exctn_exec_dt = exctn_exec_dt;
    }

    @ElVoField(physicalName = "bz_exp_exctn_err_ctt")
    public String getBz_exp_exctn_err_ctt(){
        return bz_exp_exctn_err_ctt;
    }

    @ElVoField(physicalName = "bz_exp_exctn_err_ctt")
    public void setBz_exp_exctn_err_ctt(String bz_exp_exctn_err_ctt){
        this.bz_exp_exctn_err_ctt = bz_exp_exctn_err_ctt;
    }

    @ElVoField(physicalName = "splr_bz_reg_no")
    public String getSplr_bz_reg_no(){
        return splr_bz_reg_no;
    }

    @ElVoField(physicalName = "splr_bz_reg_no")
    public void setSplr_bz_reg_no(String splr_bz_reg_no){
        this.splr_bz_reg_no = splr_bz_reg_no;
    }

    @ElVoField(physicalName = "rch_exp_acct_no")
    public String getRch_exp_acct_no(){
        return rch_exp_acct_no;
    }

    @ElVoField(physicalName = "rch_exp_acct_no")
    public void setRch_exp_acct_no(String rch_exp_acct_no){
        this.rch_exp_acct_no = rch_exp_acct_no;
    }

    @ElVoField(physicalName = "inst_sbjt_prgr_st")
    public String getInst_sbjt_prgr_st(){
        return inst_sbjt_prgr_st;
    }

    @ElVoField(physicalName = "inst_sbjt_prgr_st")
    public void setInst_sbjt_prgr_st(String inst_sbjt_prgr_st){
        this.inst_sbjt_prgr_st = inst_sbjt_prgr_st;
    }

    @ElVoField(physicalName = "exctn_limt_st")
    public String getExctn_limt_st(){
        return exctn_limt_st;
    }

    @ElVoField(physicalName = "exctn_limt_st")
    public void setExctn_limt_st(String exctn_limt_st){
        this.exctn_limt_st = exctn_limt_st;
    }

    @ElVoField(physicalName = "inst_totl_inst_amt")
    public String getInst_totl_inst_amt(){
        return inst_totl_inst_amt;
    }

    @ElVoField(physicalName = "inst_totl_inst_amt")
    public void setInst_totl_inst_amt(String inst_totl_inst_amt){
        this.inst_totl_inst_amt = inst_totl_inst_amt;
    }

    @ElVoField(physicalName = "pms_id")
    public String getPms_id(){
        return pms_id;
    }

    @ElVoField(physicalName = "pms_id")
    public void setPms_id(String pms_id){
        this.pms_id = pms_id;
    }

    @ElVoField(physicalName = "inst_sbjt_no")
    public String getInst_sbjt_no(){
        return inst_sbjt_no;
    }

    @ElVoField(physicalName = "inst_sbjt_no")
    public void setInst_sbjt_no(String inst_sbjt_no){
        this.inst_sbjt_no = inst_sbjt_no;
    }

    @ElVoField(physicalName = "proc_state")
    public String getProc_state(){
        return proc_state;
    }

    @ElVoField(physicalName = "proc_state")
    public void setProc_state(String proc_state){
        this.proc_state = proc_state;
    }

    @ElVoField(physicalName = "trns_amt")
    public String getTrns_amt(){
        return trns_amt;
    }

    @ElVoField(physicalName = "trns_amt")
    public void setTrns_amt(String trns_amt){
        this.trns_amt = trns_amt;
    }

    @ElVoField(physicalName = "prj_ymd_yn")
    public String getPrj_ymd_yn(){
        return prj_ymd_yn;
    }

    @ElVoField(physicalName = "prj_ymd_yn")
    public void setPrj_ymd_yn(String prj_ymd_yn){
        this.prj_ymd_yn = prj_ymd_yn;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "itxp_cd")
    public String getItxp_cd(){
        return itxp_cd;
    }

    @ElVoField(physicalName = "itxp_cd")
    public void setItxp_cd(String itxp_cd){
        this.itxp_cd = itxp_cd;
    }

    @ElVoField(physicalName = "frc_trsc_yn")
    public String getFrc_trsc_yn(){
        return frc_trsc_yn;
    }

    @ElVoField(physicalName = "frc_trsc_yn")
    public void setFrc_trsc_yn(String frc_trsc_yn){
        this.frc_trsc_yn = frc_trsc_yn;
    }

    @ElVoField(physicalName = "etc_evdc_rsn_cd")
    public String getEtc_evdc_rsn_cd(){
        return etc_evdc_rsn_cd;
    }

    @ElVoField(physicalName = "etc_evdc_rsn_cd")
    public void setEtc_evdc_rsn_cd(String etc_evdc_rsn_cd){
        this.etc_evdc_rsn_cd = etc_evdc_rsn_cd;
    }

    @ElVoField(physicalName = "accnt_rspns_email")
    public String getAccnt_rspns_email(){
        return accnt_rspns_email;
    }

    @ElVoField(physicalName = "accnt_rspns_email")
    public void setAccnt_rspns_email(String accnt_rspns_email){
        this.accnt_rspns_email = accnt_rspns_email;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_email")
    public String getBugt_ctrl_psn_email(){
        return bugt_ctrl_psn_email;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_email")
    public void setBugt_ctrl_psn_email(String bugt_ctrl_psn_email){
        this.bugt_ctrl_psn_email = bugt_ctrl_psn_email;
    }

    @ElVoField(physicalName = "wrte_psn_email")
    public String getWrte_psn_email(){
        return wrte_psn_email;
    }

    @ElVoField(physicalName = "wrte_psn_email")
    public void setWrte_psn_email(String wrte_psn_email){
        this.wrte_psn_email = wrte_psn_email;
    }

    @ElVoField(physicalName = "sbjt_state")
    public String getSbjt_state(){
        return sbjt_state;
    }

    @ElVoField(physicalName = "sbjt_state")
    public void setSbjt_state(String sbjt_state){
        this.sbjt_state = sbjt_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinRcmsPaySend04Vo [");
        sb.append("accnt_ymd_st").append("=").append(accnt_ymd_st).append(",");
        sb.append("resch_slip_type_cd").append("=").append(resch_slip_type_cd).append(",");
        sb.append("accnt_ymd_ed").append("=").append(accnt_ymd_ed).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf).append(",");
        sb.append("erp_send_no").append("=").append(erp_send_no).append(",");
        sb.append("sel_apr_state").append("=").append(sel_apr_state).append(",");
        sb.append("lnk_reg_seq").append("=").append(lnk_reg_seq).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("pay_accnt_cd").append("=").append(pay_accnt_cd).append(",");
        sb.append("rcms_pay_clsf").append("=").append(rcms_pay_clsf).append(",");
        sb.append("rcms_pay_unslip_no").append("=").append(rcms_pay_unslip_no).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("paym_usag").append("=").append(paym_usag).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("wrte_psn_nm").append("=").append(wrte_psn_nm).append(",");
        sb.append("slip_no_odr").append("=").append(slip_no_odr).append(",");
        sb.append("trans_unslip_no").append("=").append(trans_unslip_no).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("bugt_ctrl_psn_nm").append("=").append(bugt_ctrl_psn_nm).append(",");
        sb.append("lnk_reg_dt").append("=").append(lnk_reg_dt).append(",");
        sb.append("exctn_exec_dt").append("=").append(exctn_exec_dt).append(",");
        sb.append("bz_exp_exctn_err_ctt").append("=").append(bz_exp_exctn_err_ctt).append(",");
        sb.append("splr_bz_reg_no").append("=").append(splr_bz_reg_no).append(",");
        sb.append("rch_exp_acct_no").append("=").append(rch_exp_acct_no).append(",");
        sb.append("inst_sbjt_prgr_st").append("=").append(inst_sbjt_prgr_st).append(",");
        sb.append("exctn_limt_st").append("=").append(exctn_limt_st).append(",");
        sb.append("inst_totl_inst_amt").append("=").append(inst_totl_inst_amt).append(",");
        sb.append("pms_id").append("=").append(pms_id).append(",");
        sb.append("inst_sbjt_no").append("=").append(inst_sbjt_no).append(",");
        sb.append("proc_state").append("=").append(proc_state).append(",");
        sb.append("trns_amt").append("=").append(trns_amt).append(",");
        sb.append("prj_ymd_yn").append("=").append(prj_ymd_yn).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("itxp_cd").append("=").append(itxp_cd).append(",");
        sb.append("frc_trsc_yn").append("=").append(frc_trsc_yn).append(",");
        sb.append("etc_evdc_rsn_cd").append("=").append(etc_evdc_rsn_cd).append(",");
        sb.append("accnt_rspns_email").append("=").append(accnt_rspns_email).append(",");
        sb.append("bugt_ctrl_psn_email").append("=").append(bugt_ctrl_psn_email).append(",");
        sb.append("wrte_psn_email").append("=").append(wrte_psn_email).append(",");
        sb.append("sbjt_state").append("=").append(sbjt_state);
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
