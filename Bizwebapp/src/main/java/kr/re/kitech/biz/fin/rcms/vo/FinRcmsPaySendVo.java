package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinRcmsPaySendExp")
public class FinRcmsPaySendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinRcmsPaySendVo(){
    }

    @ElDtoField(logicalName = "accntYmdSt", physicalName = "accnt_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_st;

    @ElDtoField(logicalName = "accntYmdEd", physicalName = "accnt_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_ed;

    @ElDtoField(logicalName = "cardUseEx", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "slipNo", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "reschAccntClsf", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf;

    @ElDtoField(logicalName = "erpSendNo", physicalName = "erp_send_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_send_no;

    @ElDtoField(logicalName = "selAprState", physicalName = "sel_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sel_apr_state;

    @ElDtoField(logicalName = "lnkRegSeq", physicalName = "lnk_reg_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_seq;

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

    @ElDtoField(logicalName = "wrtePsnEmaill", physicalName = "wrte_psn_emaill", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn_emaill;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr;

    @ElDtoField(logicalName = "sbjt_state", physicalName = "sbjt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbjt_state;

    @ElDtoField(logicalName = "resch_slip_type_cd", physicalName = "resch_slip_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_slip_type_cd;

    @ElDtoField(logicalName = "send_type", physicalName = "send_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_type;

    @ElDtoField(logicalName = "emp_nm", physicalName = "emp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_nm;

    @ElDtoField(logicalName = "tel_no", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "rcv_bank", physicalName = "rcv_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_bank;

    @ElDtoField(logicalName = "rcv_acct_no", physicalName = "rcv_acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_acct_no;

    @ElDtoField(logicalName = "owac_nm", physicalName = "owac_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String owac_nm;

    @ElDtoField(logicalName = "rcv_bank_nm", physicalName = "rcv_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_bank_nm;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "bsns_psn_regst_no", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "reprs_psn_nm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "bank", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "bank_nm", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "bankaccnt_no", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "rcv_bnk_nm", physicalName = "rcv_bnk_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_bnk_nm;

    @ElDtoField(logicalName = "slip_no_odr_int", physicalName = "slip_no_odr_int", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_no_odr_int;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "slip_odr", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "trans_amt_long", physicalName = "trans_amt_long", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trans_amt_long;

    @ElDtoField(logicalName = "bz_exp_exctn_proc_st", physicalName = "bz_exp_exctn_proc_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bz_exp_exctn_proc_st;

    @ElDtoField(logicalName = "rch_exp_acct_bnk_cd", physicalName = "rch_exp_acct_bnk_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rch_exp_acct_bnk_cd;

    @ElDtoField(logicalName = "rcv_bnk_cd", physicalName = "rcv_bnk_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_bnk_cd;

    @ElDtoField(logicalName = "rch_exp_acct_rcv_psbk_prt_ctt", physicalName = "rch_exp_acct_rcv_psbk_prt_ctt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rch_exp_acct_rcv_psbk_prt_ctt;

    @ElDtoField(logicalName = "rch_exp_acct_wdrw_psbk_prt_ctt", physicalName = "rch_exp_acct_wdrw_psbk_prt_ctt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rch_exp_acct_wdrw_psbk_prt_ctt;

    @ElDtoField(logicalName = "bzaq_acct_rcv_psbk_prt_ctt", physicalName = "bzaq_acct_rcv_psbk_prt_ctt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bzaq_acct_rcv_psbk_prt_ctt;

    @ElDtoField(logicalName = "vat_amt", physicalName = "vat_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int vat_amt;

    @ElDtoField(logicalName = "srv_amt", physicalName = "srv_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int srv_amt;

    @ElDtoField(logicalName = "comm", physicalName = "comm", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int comm;

    @ElDtoField(logicalName = "sply_amt", physicalName = "sply_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sply_amt;

    @ElDtoField(logicalName = "trns_amt_long", physicalName = "trns_amt_long", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long trns_amt_long;

    @ElDtoField(logicalName = "req_type", physicalName = "req_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_type;

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "rcms_dctc_reg_yn", physicalName = "rcms_dctc_reg_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcms_dctc_reg_yn;

    @ElDtoField(logicalName = "evdc_dv", physicalName = "evdc_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evdc_dv;

    @ElDtoField(logicalName = "elec_evdc_dv", physicalName = "elec_evdc_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elec_evdc_dv;

    @ElDtoField(logicalName = "lnk_dv", physicalName = "lnk_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_dv;

    @ElDtoField(logicalName = "agrmt_inst_bz_reg_no", physicalName = "agrmt_inst_bz_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agrmt_inst_bz_reg_no;

    @ElDtoField(logicalName = "unslip_seq", physicalName = "unslip_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_seq;

    @ElDtoField(logicalName = "splr_co_nm", physicalName = "splr_co_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_co_nm;

    @ElDtoField(logicalName = "splr_repr_nm", physicalName = "splr_repr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_repr_nm;

    @ElDtoField(logicalName = "splr_tpbz_nm", physicalName = "splr_tpbz_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_tpbz_nm;

    @ElDtoField(logicalName = "splr_adr", physicalName = "splr_adr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_adr;

    @ElDtoField(logicalName = "apprno", physicalName = "apprno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprno;

    @ElDtoField(logicalName = "rectime", physicalName = "rectime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rectime;

    @ElDtoField(logicalName = "elec_evdc_no", physicalName = "elec_evdc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elec_evdc_no;

    @ElDtoField(logicalName = "wrtg_dt", physicalName = "wrtg_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrtg_dt;

    @ElDtoField(logicalName = "splr_tpop_nm", physicalName = "splr_tpop_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_tpop_nm;

    @ElDtoField(logicalName = "issu_seqno", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "dtls_ncnt", physicalName = "dtls_ncnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dtls_ncnt;

    @ElDtoField(logicalName = "splr_prsn_yn", physicalName = "splr_prsn_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String splr_prsn_yn;

    @ElDtoField(logicalName = "unslip_odr_int", physicalName = "unslip_odr_int", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr_int;

    @ElDtoField(logicalName = "pay_clsf", physicalName = "pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_clsf;

    @ElDtoField(logicalName = "use_amt", physicalName = "use_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_amt;

    @ElDtoField(logicalName = "erp_cd_1", physicalName = "erp_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_1;

    @ElDtoField(logicalName = "erp_cd_2", physicalName = "erp_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_2;

    @ElDtoField(logicalName = "erp_cd_3", physicalName = "erp_cd_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_3;

    @ElDtoField(logicalName = "erp_cd_4", physicalName = "erp_cd_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_4;

    @ElDtoField(logicalName = "erp_send_nm", physicalName = "erp_send_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_send_nm;

    @ElDtoField(logicalName = "lnk_st", physicalName = "lnk_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_st;

    @ElDtoField(logicalName = "rprcs_ncnt", physicalName = "rprcs_ncnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int rprcs_ncnt;

    @ElDtoField(logicalName = "unslip_odr_list", physicalName = "unslip_odr_list", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr_list;

    @ElDtoField(logicalName = "use_amt_se_cd", physicalName = "use_amt_se_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_amt_se_cd;

    @ElDtoField(logicalName = "agrmt_seq_no", physicalName = "agrmt_seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agrmt_seq_no;

    @ElDtoField(logicalName = "itxp_reg_seq", physicalName = "itxp_reg_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itxp_reg_seq;

    @ElDtoField(logicalName = "pms_flag", physicalName = "pms_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pms_flag;

    @ElDtoField(logicalName = "unslip_type", physicalName = "unslip_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_type;

    @ElDtoField(logicalName = "absrp_clsf", physicalName = "absrp_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String absrp_clsf;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "inst_use_cd", physicalName = "inst_use_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_use_cd;

    @ElDtoField(logicalName = "inst_use_cd_1", physicalName = "inst_use_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inst_use_cd_1;

    @ElDtoField(logicalName = "evdc_seq_no", physicalName = "evdc_seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evdc_seq_no;

    @ElDtoField(logicalName = "crd_no", physicalName = "crd_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crd_no;

    @ElDtoField(logicalName = "fnc_inst_cd", physicalName = "fnc_inst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fnc_inst_cd;

    @ElDtoField(logicalName = "apv_no", physicalName = "apv_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apv_no;

    @ElDtoField(logicalName = "buy_apv_dv", physicalName = "buy_apv_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_apv_dv;

    @ElDtoField(logicalName = "apv_dt", physicalName = "apv_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apv_dt;

    @ElDtoField(logicalName = "buy_clct_no", physicalName = "buy_clct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buy_clct_no;

    @ElDtoField(logicalName = "rmk_1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "err_msg", physicalName = "err_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String err_msg;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "dept_cd_nm", physicalName = "dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd_nm;

    @ElDtoField(logicalName = "fomat_unit", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "bugt_ctrl_psn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "ext_no", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "lnk_reg_dt_st", physicalName = "lnk_reg_dt_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_dt_st;

    @ElDtoField(logicalName = "lnk_reg_dt_ed", physicalName = "lnk_reg_dt_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_dt_ed;

    @ElVoField(physicalName = "accnt_ymd_st")
    public String getAccnt_ymd_st(){
        return accnt_ymd_st;
    }

    @ElVoField(physicalName = "accnt_ymd_st")
    public void setAccnt_ymd_st(String accnt_ymd_st){
        this.accnt_ymd_st = accnt_ymd_st;
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

    @ElVoField(physicalName = "wrte_psn_emaill")
    public String getWrte_psn_emaill(){
        return wrte_psn_emaill;
    }

    @ElVoField(physicalName = "wrte_psn_emaill")
    public void setWrte_psn_emaill(String wrte_psn_emaill){
        this.wrte_psn_emaill = wrte_psn_emaill;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public String getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(String unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "sbjt_state")
    public String getSbjt_state(){
        return sbjt_state;
    }

    @ElVoField(physicalName = "sbjt_state")
    public void setSbjt_state(String sbjt_state){
        this.sbjt_state = sbjt_state;
    }

    @ElVoField(physicalName = "resch_slip_type_cd")
    public String getResch_slip_type_cd(){
        return resch_slip_type_cd;
    }

    @ElVoField(physicalName = "resch_slip_type_cd")
    public void setResch_slip_type_cd(String resch_slip_type_cd){
        this.resch_slip_type_cd = resch_slip_type_cd;
    }

    @ElVoField(physicalName = "send_type")
    public String getSend_type(){
        return send_type;
    }

    @ElVoField(physicalName = "send_type")
    public void setSend_type(String send_type){
        this.send_type = send_type;
    }

    @ElVoField(physicalName = "emp_nm")
    public String getEmp_nm(){
        return emp_nm;
    }

    @ElVoField(physicalName = "emp_nm")
    public void setEmp_nm(String emp_nm){
        this.emp_nm = emp_nm;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "rcv_bank")
    public String getRcv_bank(){
        return rcv_bank;
    }

    @ElVoField(physicalName = "rcv_bank")
    public void setRcv_bank(String rcv_bank){
        this.rcv_bank = rcv_bank;
    }

    @ElVoField(physicalName = "rcv_acct_no")
    public String getRcv_acct_no(){
        return rcv_acct_no;
    }

    @ElVoField(physicalName = "rcv_acct_no")
    public void setRcv_acct_no(String rcv_acct_no){
        this.rcv_acct_no = rcv_acct_no;
    }

    @ElVoField(physicalName = "owac_nm")
    public String getOwac_nm(){
        return owac_nm;
    }

    @ElVoField(physicalName = "owac_nm")
    public void setOwac_nm(String owac_nm){
        this.owac_nm = owac_nm;
    }

    @ElVoField(physicalName = "rcv_bank_nm")
    public String getRcv_bank_nm(){
        return rcv_bank_nm;
    }

    @ElVoField(physicalName = "rcv_bank_nm")
    public void setRcv_bank_nm(String rcv_bank_nm){
        this.rcv_bank_nm = rcv_bank_nm;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "rcv_bnk_nm")
    public String getRcv_bnk_nm(){
        return rcv_bnk_nm;
    }

    @ElVoField(physicalName = "rcv_bnk_nm")
    public void setRcv_bnk_nm(String rcv_bnk_nm){
        this.rcv_bnk_nm = rcv_bnk_nm;
    }

    @ElVoField(physicalName = "slip_no_odr_int")
    public int getSlip_no_odr_int(){
        return slip_no_odr_int;
    }

    @ElVoField(physicalName = "slip_no_odr_int")
    public void setSlip_no_odr_int(int slip_no_odr_int){
        this.slip_no_odr_int = slip_no_odr_int;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "slip_odr")
    public String getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(String slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "trans_amt_long")
    public long getTrans_amt_long(){
        return trans_amt_long;
    }

    @ElVoField(physicalName = "trans_amt_long")
    public void setTrans_amt_long(long trans_amt_long){
        this.trans_amt_long = trans_amt_long;
    }

    @ElVoField(physicalName = "bz_exp_exctn_proc_st")
    public String getBz_exp_exctn_proc_st(){
        return bz_exp_exctn_proc_st;
    }

    @ElVoField(physicalName = "bz_exp_exctn_proc_st")
    public void setBz_exp_exctn_proc_st(String bz_exp_exctn_proc_st){
        this.bz_exp_exctn_proc_st = bz_exp_exctn_proc_st;
    }

    @ElVoField(physicalName = "rch_exp_acct_bnk_cd")
    public String getRch_exp_acct_bnk_cd(){
        return rch_exp_acct_bnk_cd;
    }

    @ElVoField(physicalName = "rch_exp_acct_bnk_cd")
    public void setRch_exp_acct_bnk_cd(String rch_exp_acct_bnk_cd){
        this.rch_exp_acct_bnk_cd = rch_exp_acct_bnk_cd;
    }

    @ElVoField(physicalName = "rcv_bnk_cd")
    public String getRcv_bnk_cd(){
        return rcv_bnk_cd;
    }

    @ElVoField(physicalName = "rcv_bnk_cd")
    public void setRcv_bnk_cd(String rcv_bnk_cd){
        this.rcv_bnk_cd = rcv_bnk_cd;
    }

    @ElVoField(physicalName = "rch_exp_acct_rcv_psbk_prt_ctt")
    public String getRch_exp_acct_rcv_psbk_prt_ctt(){
        return rch_exp_acct_rcv_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "rch_exp_acct_rcv_psbk_prt_ctt")
    public void setRch_exp_acct_rcv_psbk_prt_ctt(String rch_exp_acct_rcv_psbk_prt_ctt){
        this.rch_exp_acct_rcv_psbk_prt_ctt = rch_exp_acct_rcv_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "rch_exp_acct_wdrw_psbk_prt_ctt")
    public String getRch_exp_acct_wdrw_psbk_prt_ctt(){
        return rch_exp_acct_wdrw_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "rch_exp_acct_wdrw_psbk_prt_ctt")
    public void setRch_exp_acct_wdrw_psbk_prt_ctt(String rch_exp_acct_wdrw_psbk_prt_ctt){
        this.rch_exp_acct_wdrw_psbk_prt_ctt = rch_exp_acct_wdrw_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "bzaq_acct_rcv_psbk_prt_ctt")
    public String getBzaq_acct_rcv_psbk_prt_ctt(){
        return bzaq_acct_rcv_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "bzaq_acct_rcv_psbk_prt_ctt")
    public void setBzaq_acct_rcv_psbk_prt_ctt(String bzaq_acct_rcv_psbk_prt_ctt){
        this.bzaq_acct_rcv_psbk_prt_ctt = bzaq_acct_rcv_psbk_prt_ctt;
    }

    @ElVoField(physicalName = "vat_amt")
    public int getVat_amt(){
        return vat_amt;
    }

    @ElVoField(physicalName = "vat_amt")
    public void setVat_amt(int vat_amt){
        this.vat_amt = vat_amt;
    }

    @ElVoField(physicalName = "srv_amt")
    public int getSrv_amt(){
        return srv_amt;
    }

    @ElVoField(physicalName = "srv_amt")
    public void setSrv_amt(int srv_amt){
        this.srv_amt = srv_amt;
    }

    @ElVoField(physicalName = "comm")
    public int getComm(){
        return comm;
    }

    @ElVoField(physicalName = "comm")
    public void setComm(int comm){
        this.comm = comm;
    }

    @ElVoField(physicalName = "sply_amt")
    public long getSply_amt(){
        return sply_amt;
    }

    @ElVoField(physicalName = "sply_amt")
    public void setSply_amt(long sply_amt){
        this.sply_amt = sply_amt;
    }

    @ElVoField(physicalName = "trns_amt_long")
    public long getTrns_amt_long(){
        return trns_amt_long;
    }

    @ElVoField(physicalName = "trns_amt_long")
    public void setTrns_amt_long(long trns_amt_long){
        this.trns_amt_long = trns_amt_long;
    }

    @ElVoField(physicalName = "req_type")
    public String getReq_type(){
        return req_type;
    }

    @ElVoField(physicalName = "req_type")
    public void setReq_type(String req_type){
        this.req_type = req_type;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "rcms_dctc_reg_yn")
    public String getRcms_dctc_reg_yn(){
        return rcms_dctc_reg_yn;
    }

    @ElVoField(physicalName = "rcms_dctc_reg_yn")
    public void setRcms_dctc_reg_yn(String rcms_dctc_reg_yn){
        this.rcms_dctc_reg_yn = rcms_dctc_reg_yn;
    }

    @ElVoField(physicalName = "evdc_dv")
    public String getEvdc_dv(){
        return evdc_dv;
    }

    @ElVoField(physicalName = "evdc_dv")
    public void setEvdc_dv(String evdc_dv){
        this.evdc_dv = evdc_dv;
    }

    @ElVoField(physicalName = "elec_evdc_dv")
    public String getElec_evdc_dv(){
        return elec_evdc_dv;
    }

    @ElVoField(physicalName = "elec_evdc_dv")
    public void setElec_evdc_dv(String elec_evdc_dv){
        this.elec_evdc_dv = elec_evdc_dv;
    }

    @ElVoField(physicalName = "lnk_dv")
    public String getLnk_dv(){
        return lnk_dv;
    }

    @ElVoField(physicalName = "lnk_dv")
    public void setLnk_dv(String lnk_dv){
        this.lnk_dv = lnk_dv;
    }

    @ElVoField(physicalName = "agrmt_inst_bz_reg_no")
    public String getAgrmt_inst_bz_reg_no(){
        return agrmt_inst_bz_reg_no;
    }

    @ElVoField(physicalName = "agrmt_inst_bz_reg_no")
    public void setAgrmt_inst_bz_reg_no(String agrmt_inst_bz_reg_no){
        this.agrmt_inst_bz_reg_no = agrmt_inst_bz_reg_no;
    }

    @ElVoField(physicalName = "unslip_seq")
    public int getUnslip_seq(){
        return unslip_seq;
    }

    @ElVoField(physicalName = "unslip_seq")
    public void setUnslip_seq(int unslip_seq){
        this.unslip_seq = unslip_seq;
    }

    @ElVoField(physicalName = "splr_co_nm")
    public String getSplr_co_nm(){
        return splr_co_nm;
    }

    @ElVoField(physicalName = "splr_co_nm")
    public void setSplr_co_nm(String splr_co_nm){
        this.splr_co_nm = splr_co_nm;
    }

    @ElVoField(physicalName = "splr_repr_nm")
    public String getSplr_repr_nm(){
        return splr_repr_nm;
    }

    @ElVoField(physicalName = "splr_repr_nm")
    public void setSplr_repr_nm(String splr_repr_nm){
        this.splr_repr_nm = splr_repr_nm;
    }

    @ElVoField(physicalName = "splr_tpbz_nm")
    public String getSplr_tpbz_nm(){
        return splr_tpbz_nm;
    }

    @ElVoField(physicalName = "splr_tpbz_nm")
    public void setSplr_tpbz_nm(String splr_tpbz_nm){
        this.splr_tpbz_nm = splr_tpbz_nm;
    }

    @ElVoField(physicalName = "splr_adr")
    public String getSplr_adr(){
        return splr_adr;
    }

    @ElVoField(physicalName = "splr_adr")
    public void setSplr_adr(String splr_adr){
        this.splr_adr = splr_adr;
    }

    @ElVoField(physicalName = "apprno")
    public String getApprno(){
        return apprno;
    }

    @ElVoField(physicalName = "apprno")
    public void setApprno(String apprno){
        this.apprno = apprno;
    }

    @ElVoField(physicalName = "rectime")
    public String getRectime(){
        return rectime;
    }

    @ElVoField(physicalName = "rectime")
    public void setRectime(String rectime){
        this.rectime = rectime;
    }

    @ElVoField(physicalName = "elec_evdc_no")
    public String getElec_evdc_no(){
        return elec_evdc_no;
    }

    @ElVoField(physicalName = "elec_evdc_no")
    public void setElec_evdc_no(String elec_evdc_no){
        this.elec_evdc_no = elec_evdc_no;
    }

    @ElVoField(physicalName = "wrtg_dt")
    public String getWrtg_dt(){
        return wrtg_dt;
    }

    @ElVoField(physicalName = "wrtg_dt")
    public void setWrtg_dt(String wrtg_dt){
        this.wrtg_dt = wrtg_dt;
    }

    @ElVoField(physicalName = "splr_tpop_nm")
    public String getSplr_tpop_nm(){
        return splr_tpop_nm;
    }

    @ElVoField(physicalName = "splr_tpop_nm")
    public void setSplr_tpop_nm(String splr_tpop_nm){
        this.splr_tpop_nm = splr_tpop_nm;
    }

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "dtls_ncnt")
    public int getDtls_ncnt(){
        return dtls_ncnt;
    }

    @ElVoField(physicalName = "dtls_ncnt")
    public void setDtls_ncnt(int dtls_ncnt){
        this.dtls_ncnt = dtls_ncnt;
    }

    @ElVoField(physicalName = "splr_prsn_yn")
    public String getSplr_prsn_yn(){
        return splr_prsn_yn;
    }

    @ElVoField(physicalName = "splr_prsn_yn")
    public void setSplr_prsn_yn(String splr_prsn_yn){
        this.splr_prsn_yn = splr_prsn_yn;
    }

    @ElVoField(physicalName = "unslip_odr_int")
    public int getUnslip_odr_int(){
        return unslip_odr_int;
    }

    @ElVoField(physicalName = "unslip_odr_int")
    public void setUnslip_odr_int(int unslip_odr_int){
        this.unslip_odr_int = unslip_odr_int;
    }

    @ElVoField(physicalName = "pay_clsf")
    public String getPay_clsf(){
        return pay_clsf;
    }

    @ElVoField(physicalName = "pay_clsf")
    public void setPay_clsf(String pay_clsf){
        this.pay_clsf = pay_clsf;
    }

    @ElVoField(physicalName = "use_amt")
    public String getUse_amt(){
        return use_amt;
    }

    @ElVoField(physicalName = "use_amt")
    public void setUse_amt(String use_amt){
        this.use_amt = use_amt;
    }

    @ElVoField(physicalName = "erp_cd_1")
    public String getErp_cd_1(){
        return erp_cd_1;
    }

    @ElVoField(physicalName = "erp_cd_1")
    public void setErp_cd_1(String erp_cd_1){
        this.erp_cd_1 = erp_cd_1;
    }

    @ElVoField(physicalName = "erp_cd_2")
    public String getErp_cd_2(){
        return erp_cd_2;
    }

    @ElVoField(physicalName = "erp_cd_2")
    public void setErp_cd_2(String erp_cd_2){
        this.erp_cd_2 = erp_cd_2;
    }

    @ElVoField(physicalName = "erp_cd_3")
    public String getErp_cd_3(){
        return erp_cd_3;
    }

    @ElVoField(physicalName = "erp_cd_3")
    public void setErp_cd_3(String erp_cd_3){
        this.erp_cd_3 = erp_cd_3;
    }

    @ElVoField(physicalName = "erp_cd_4")
    public String getErp_cd_4(){
        return erp_cd_4;
    }

    @ElVoField(physicalName = "erp_cd_4")
    public void setErp_cd_4(String erp_cd_4){
        this.erp_cd_4 = erp_cd_4;
    }

    @ElVoField(physicalName = "erp_send_nm")
    public String getErp_send_nm(){
        return erp_send_nm;
    }

    @ElVoField(physicalName = "erp_send_nm")
    public void setErp_send_nm(String erp_send_nm){
        this.erp_send_nm = erp_send_nm;
    }

    @ElVoField(physicalName = "lnk_st")
    public String getLnk_st(){
        return lnk_st;
    }

    @ElVoField(physicalName = "lnk_st")
    public void setLnk_st(String lnk_st){
        this.lnk_st = lnk_st;
    }

    @ElVoField(physicalName = "rprcs_ncnt")
    public int getRprcs_ncnt(){
        return rprcs_ncnt;
    }

    @ElVoField(physicalName = "rprcs_ncnt")
    public void setRprcs_ncnt(int rprcs_ncnt){
        this.rprcs_ncnt = rprcs_ncnt;
    }

    @ElVoField(physicalName = "unslip_odr_list")
    public String getUnslip_odr_list(){
        return unslip_odr_list;
    }

    @ElVoField(physicalName = "unslip_odr_list")
    public void setUnslip_odr_list(String unslip_odr_list){
        this.unslip_odr_list = unslip_odr_list;
    }

    @ElVoField(physicalName = "use_amt_se_cd")
    public String getUse_amt_se_cd(){
        return use_amt_se_cd;
    }

    @ElVoField(physicalName = "use_amt_se_cd")
    public void setUse_amt_se_cd(String use_amt_se_cd){
        this.use_amt_se_cd = use_amt_se_cd;
    }

    @ElVoField(physicalName = "agrmt_seq_no")
    public String getAgrmt_seq_no(){
        return agrmt_seq_no;
    }

    @ElVoField(physicalName = "agrmt_seq_no")
    public void setAgrmt_seq_no(String agrmt_seq_no){
        this.agrmt_seq_no = agrmt_seq_no;
    }

    @ElVoField(physicalName = "itxp_reg_seq")
    public String getItxp_reg_seq(){
        return itxp_reg_seq;
    }

    @ElVoField(physicalName = "itxp_reg_seq")
    public void setItxp_reg_seq(String itxp_reg_seq){
        this.itxp_reg_seq = itxp_reg_seq;
    }

    @ElVoField(physicalName = "pms_flag")
    public String getPms_flag(){
        return pms_flag;
    }

    @ElVoField(physicalName = "pms_flag")
    public void setPms_flag(String pms_flag){
        this.pms_flag = pms_flag;
    }

    @ElVoField(physicalName = "unslip_type")
    public String getUnslip_type(){
        return unslip_type;
    }

    @ElVoField(physicalName = "unslip_type")
    public void setUnslip_type(String unslip_type){
        this.unslip_type = unslip_type;
    }

    @ElVoField(physicalName = "absrp_clsf")
    public String getAbsrp_clsf(){
        return absrp_clsf;
    }

    @ElVoField(physicalName = "absrp_clsf")
    public void setAbsrp_clsf(String absrp_clsf){
        this.absrp_clsf = absrp_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "inst_use_cd")
    public String getInst_use_cd(){
        return inst_use_cd;
    }

    @ElVoField(physicalName = "inst_use_cd")
    public void setInst_use_cd(String inst_use_cd){
        this.inst_use_cd = inst_use_cd;
    }

    @ElVoField(physicalName = "inst_use_cd_1")
    public String getInst_use_cd_1(){
        return inst_use_cd_1;
    }

    @ElVoField(physicalName = "inst_use_cd_1")
    public void setInst_use_cd_1(String inst_use_cd_1){
        this.inst_use_cd_1 = inst_use_cd_1;
    }

    @ElVoField(physicalName = "evdc_seq_no")
    public String getEvdc_seq_no(){
        return evdc_seq_no;
    }

    @ElVoField(physicalName = "evdc_seq_no")
    public void setEvdc_seq_no(String evdc_seq_no){
        this.evdc_seq_no = evdc_seq_no;
    }

    @ElVoField(physicalName = "crd_no")
    public String getCrd_no(){
        return crd_no;
    }

    @ElVoField(physicalName = "crd_no")
    public void setCrd_no(String crd_no){
        this.crd_no = crd_no;
    }

    @ElVoField(physicalName = "fnc_inst_cd")
    public String getFnc_inst_cd(){
        return fnc_inst_cd;
    }

    @ElVoField(physicalName = "fnc_inst_cd")
    public void setFnc_inst_cd(String fnc_inst_cd){
        this.fnc_inst_cd = fnc_inst_cd;
    }

    @ElVoField(physicalName = "apv_no")
    public String getApv_no(){
        return apv_no;
    }

    @ElVoField(physicalName = "apv_no")
    public void setApv_no(String apv_no){
        this.apv_no = apv_no;
    }

    @ElVoField(physicalName = "buy_apv_dv")
    public String getBuy_apv_dv(){
        return buy_apv_dv;
    }

    @ElVoField(physicalName = "buy_apv_dv")
    public void setBuy_apv_dv(String buy_apv_dv){
        this.buy_apv_dv = buy_apv_dv;
    }

    @ElVoField(physicalName = "apv_dt")
    public String getApv_dt(){
        return apv_dt;
    }

    @ElVoField(physicalName = "apv_dt")
    public void setApv_dt(String apv_dt){
        this.apv_dt = apv_dt;
    }

    @ElVoField(physicalName = "buy_clct_no")
    public String getBuy_clct_no(){
        return buy_clct_no;
    }

    @ElVoField(physicalName = "buy_clct_no")
    public void setBuy_clct_no(String buy_clct_no){
        this.buy_clct_no = buy_clct_no;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "err_msg")
    public String getErr_msg(){
        return err_msg;
    }

    @ElVoField(physicalName = "err_msg")
    public void setErr_msg(String err_msg){
        this.err_msg = err_msg;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "dept_cd_nm")
    public String getDept_cd_nm(){
        return dept_cd_nm;
    }

    @ElVoField(physicalName = "dept_cd_nm")
    public void setDept_cd_nm(String dept_cd_nm){
        this.dept_cd_nm = dept_cd_nm;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "lnk_reg_dt_st")
    public String getLnk_reg_dt_st(){
        return lnk_reg_dt_st;
    }

    @ElVoField(physicalName = "lnk_reg_dt_st")
    public void setLnk_reg_dt_st(String lnk_reg_dt_st){
        this.lnk_reg_dt_st = lnk_reg_dt_st;
    }

    @ElVoField(physicalName = "lnk_reg_dt_ed")
    public String getLnk_reg_dt_ed(){
        return lnk_reg_dt_ed;
    }

    @ElVoField(physicalName = "lnk_reg_dt_ed")
    public void setLnk_reg_dt_ed(String lnk_reg_dt_ed){
        this.lnk_reg_dt_ed = lnk_reg_dt_ed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinRcmsPaySendVo [");
        sb.append("accnt_ymd_st").append("=").append(accnt_ymd_st).append(",");
        sb.append("accnt_ymd_ed").append("=").append(accnt_ymd_ed).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf).append(",");
        sb.append("erp_send_no").append("=").append(erp_send_no).append(",");
        sb.append("sel_apr_state").append("=").append(sel_apr_state).append(",");
        sb.append("lnk_reg_seq").append("=").append(lnk_reg_seq).append(",");
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
        sb.append("wrte_psn_emaill").append("=").append(wrte_psn_emaill).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("sbjt_state").append("=").append(sbjt_state).append(",");
        sb.append("resch_slip_type_cd").append("=").append(resch_slip_type_cd).append(",");
        sb.append("send_type").append("=").append(send_type).append(",");
        sb.append("emp_nm").append("=").append(emp_nm).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("rcv_bank").append("=").append(rcv_bank).append(",");
        sb.append("rcv_acct_no").append("=").append(rcv_acct_no).append(",");
        sb.append("owac_nm").append("=").append(owac_nm).append(",");
        sb.append("rcv_bank_nm").append("=").append(rcv_bank_nm).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("rcv_bnk_nm").append("=").append(rcv_bnk_nm).append(",");
        sb.append("slip_no_odr_int").append("=").append(slip_no_odr_int).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("trans_amt_long").append("=").append(trans_amt_long).append(",");
        sb.append("bz_exp_exctn_proc_st").append("=").append(bz_exp_exctn_proc_st).append(",");
        sb.append("rch_exp_acct_bnk_cd").append("=").append(rch_exp_acct_bnk_cd).append(",");
        sb.append("rcv_bnk_cd").append("=").append(rcv_bnk_cd).append(",");
        sb.append("rch_exp_acct_rcv_psbk_prt_ctt").append("=").append(rch_exp_acct_rcv_psbk_prt_ctt).append(",");
        sb.append("rch_exp_acct_wdrw_psbk_prt_ctt").append("=").append(rch_exp_acct_wdrw_psbk_prt_ctt).append(",");
        sb.append("bzaq_acct_rcv_psbk_prt_ctt").append("=").append(bzaq_acct_rcv_psbk_prt_ctt).append(",");
        sb.append("vat_amt").append("=").append(vat_amt).append(",");
        sb.append("srv_amt").append("=").append(srv_amt).append(",");
        sb.append("comm").append("=").append(comm).append(",");
        sb.append("sply_amt").append("=").append(sply_amt).append(",");
        sb.append("trns_amt_long").append("=").append(trns_amt_long).append(",");
        sb.append("req_type").append("=").append(req_type).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("rcms_dctc_reg_yn").append("=").append(rcms_dctc_reg_yn).append(",");
        sb.append("evdc_dv").append("=").append(evdc_dv).append(",");
        sb.append("elec_evdc_dv").append("=").append(elec_evdc_dv).append(",");
        sb.append("lnk_dv").append("=").append(lnk_dv).append(",");
        sb.append("agrmt_inst_bz_reg_no").append("=").append(agrmt_inst_bz_reg_no).append(",");
        sb.append("unslip_seq").append("=").append(unslip_seq).append(",");
        sb.append("splr_co_nm").append("=").append(splr_co_nm).append(",");
        sb.append("splr_repr_nm").append("=").append(splr_repr_nm).append(",");
        sb.append("splr_tpbz_nm").append("=").append(splr_tpbz_nm).append(",");
        sb.append("splr_adr").append("=").append(splr_adr).append(",");
        sb.append("apprno").append("=").append(apprno).append(",");
        sb.append("rectime").append("=").append(rectime).append(",");
        sb.append("elec_evdc_no").append("=").append(elec_evdc_no).append(",");
        sb.append("wrtg_dt").append("=").append(wrtg_dt).append(",");
        sb.append("splr_tpop_nm").append("=").append(splr_tpop_nm).append(",");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("dtls_ncnt").append("=").append(dtls_ncnt).append(",");
        sb.append("splr_prsn_yn").append("=").append(splr_prsn_yn).append(",");
        sb.append("unslip_odr_int").append("=").append(unslip_odr_int).append(",");
        sb.append("pay_clsf").append("=").append(pay_clsf).append(",");
        sb.append("use_amt").append("=").append(use_amt).append(",");
        sb.append("erp_cd_1").append("=").append(erp_cd_1).append(",");
        sb.append("erp_cd_2").append("=").append(erp_cd_2).append(",");
        sb.append("erp_cd_3").append("=").append(erp_cd_3).append(",");
        sb.append("erp_cd_4").append("=").append(erp_cd_4).append(",");
        sb.append("erp_send_nm").append("=").append(erp_send_nm).append(",");
        sb.append("lnk_st").append("=").append(lnk_st).append(",");
        sb.append("rprcs_ncnt").append("=").append(rprcs_ncnt).append(",");
        sb.append("unslip_odr_list").append("=").append(unslip_odr_list).append(",");
        sb.append("use_amt_se_cd").append("=").append(use_amt_se_cd).append(",");
        sb.append("agrmt_seq_no").append("=").append(agrmt_seq_no).append(",");
        sb.append("itxp_reg_seq").append("=").append(itxp_reg_seq).append(",");
        sb.append("pms_flag").append("=").append(pms_flag).append(",");
        sb.append("unslip_type").append("=").append(unslip_type).append(",");
        sb.append("absrp_clsf").append("=").append(absrp_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("inst_use_cd").append("=").append(inst_use_cd).append(",");
        sb.append("inst_use_cd_1").append("=").append(inst_use_cd_1).append(",");
        sb.append("evdc_seq_no").append("=").append(evdc_seq_no).append(",");
        sb.append("crd_no").append("=").append(crd_no).append(",");
        sb.append("fnc_inst_cd").append("=").append(fnc_inst_cd).append(",");
        sb.append("apv_no").append("=").append(apv_no).append(",");
        sb.append("buy_apv_dv").append("=").append(buy_apv_dv).append(",");
        sb.append("apv_dt").append("=").append(apv_dt).append(",");
        sb.append("buy_clct_no").append("=").append(buy_clct_no).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("err_msg").append("=").append(err_msg).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("dept_cd_nm").append("=").append(dept_cd_nm).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("lnk_reg_dt_st").append("=").append(lnk_reg_dt_st).append(",");
        sb.append("lnk_reg_dt_ed").append("=").append(lnk_reg_dt_ed);
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
