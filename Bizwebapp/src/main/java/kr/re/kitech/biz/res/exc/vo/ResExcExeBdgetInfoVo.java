package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구관리 실행예산 정보")
public class ResExcExeBdgetInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResExcExeBdgetInfoVo(){
    }

    @ElDtoField(logicalName = "accnt_clsf", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "accnt_clsf_nm", physicalName = "accnt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf_nm;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_no_nm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accnt_no1", physicalName = "accnt_no1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no1;

    @ElDtoField(logicalName = "accnt_no2", physicalName = "accnt_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no2;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_rspns_dept", physicalName = "accnt_rspns_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept;

    @ElDtoField(logicalName = "accnt_rspns_empno", physicalName = "accnt_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_empno;

    @ElDtoField(logicalName = "accnt_rspns_nm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "accnt_rspns_nm_01", physicalName = "accnt_rspns_nm_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm_01;

    @ElDtoField(logicalName = "accnt_rspns_no", physicalName = "accnt_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_no;

    @ElDtoField(logicalName = "accnt_rspns_posi", physicalName = "accnt_rspns_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_posi;

    @ElDtoField(logicalName = "accnt_rspns_str", physicalName = "accnt_rspns_str", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_str;

    @ElDtoField(logicalName = "accnt_state", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "accnt_state_nm", physicalName = "accnt_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state_nm;

    @ElDtoField(logicalName = "accnt_ymd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "agree_amt", physicalName = "agree_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agree_amt;

    @ElDtoField(logicalName = "agree_amt2", physicalName = "agree_amt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agree_amt2;

    @ElDtoField(logicalName = "agree_direct_cost_fix_yn", physicalName = "agree_direct_cost_fix_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agree_direct_cost_fix_yn;

    @ElDtoField(logicalName = "agrt_cryfwd_amt", physicalName = "agrt_cryfwd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agrt_cryfwd_amt;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "amt2", physicalName = "amt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt2;

    @ElDtoField(logicalName = "anal", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;

    @ElDtoField(logicalName = "apr_exec_bugt_seq", physicalName = "apr_exec_bugt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_exec_bugt_seq;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "attach_file", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "bankaccnt_type", physicalName = "bankaccnt_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_type;

    @ElDtoField(logicalName = "bg_agree_026_sum_sum", physicalName = "bg_agree_026_sum_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_026_sum_sum;

    @ElDtoField(logicalName = "bg_agree_tot_rat", physicalName = "bg_agree_tot_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_tot_rat;

    @ElDtoField(logicalName = "bg_agree_tot_sum", physicalName = "bg_agree_tot_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_tot_sum;

    @ElDtoField(logicalName = "bg_agree_tot_sum_sum", physicalName = "bg_agree_tot_sum_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_tot_sum_sum;

    @ElDtoField(logicalName = "bill_no", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "bsns_cd_bsns", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "bsns_cd_bsns_nm", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "bsns_cd_detls_bsns", physicalName = "bsns_cd_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns;

    @ElDtoField(logicalName = "bsns_cd_detls_bsns_nm", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "bsns_cd_exclsv_agncy", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "bsns_cd_inout", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "bsns_cd_inout_nm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "bsns_cd_ofic", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "bsns_req_no", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "bsns_yn", physicalName = "bsns_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_yn;

    @ElDtoField(logicalName = "bugt_ctrl_psn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "bugt_ctrl_psn_nm", physicalName = "bugt_ctrl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_nm;

    @ElDtoField(logicalName = "bugt_item", physicalName = "bugt_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item;

    @ElDtoField(logicalName = "bugt_item_026_amt", physicalName = "bugt_item_026_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_026_amt;

    @ElDtoField(logicalName = "bugt_item_amt", physicalName = "bugt_item_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_amt;

    @ElDtoField(logicalName = "bugt_item_nm", physicalName = "bugt_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_nm;

    @ElDtoField(logicalName = "bugt_item_rat", physicalName = "bugt_item_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_rat;

    @ElDtoField(logicalName = "bugt_item_sum", physicalName = "bugt_item_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_sum;

    @ElDtoField(logicalName = "bugt_item_yn", physicalName = "bugt_item_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_yn;

    @ElDtoField(logicalName = "card_use_ex", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "cons_work_attach_file_no", physicalName = "cons_work_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cons_work_attach_file_no;

    @ElDtoField(logicalName = "cons_work_file", physicalName = "cons_work_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cons_work_file;

    @ElDtoField(logicalName = "count", physicalName = "count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String count;

    @ElDtoField(logicalName = "crud_tag", physicalName = "crud_tag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crud_tag;

    @ElDtoField(logicalName = "cryfwd_agree_amt", physicalName = "cryfwd_agree_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_agree_amt;

    @ElDtoField(logicalName = "cryfwd_agree_amt2", physicalName = "cryfwd_agree_amt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_agree_amt2;

    @ElDtoField(logicalName = "cryfwd_amt", physicalName = "cryfwd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_amt;

    @ElDtoField(logicalName = "cryfwd_amt2", physicalName = "cryfwd_amt2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_amt2;

    @ElDtoField(logicalName = "cud_flag", physicalName = "cud_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_flag;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "curr_dept_cd", physicalName = "curr_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_dept_cd;

    @ElDtoField(logicalName = "curr_dept_nm", physicalName = "curr_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_dept_nm;

    @ElDtoField(logicalName = "curr_empno", physicalName = "curr_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_empno;

    @ElDtoField(logicalName = "curr_new_ymd", physicalName = "curr_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_new_ymd;

    @ElDtoField(logicalName = "curr_posi_cd", physicalName = "curr_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_posi_cd;

    @ElDtoField(logicalName = "curr_posi_nm", physicalName = "curr_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_posi_nm;

    @ElDtoField(logicalName = "curr_prj_anal", physicalName = "curr_prj_anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_prj_anal;

    @ElDtoField(logicalName = "curr_resch_rspns", physicalName = "curr_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns;

    @ElDtoField(logicalName = "curr_resch_rspns_nm", physicalName = "curr_resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns_nm;

    @ElDtoField(logicalName = "curr_resch_rspns_sys", physicalName = "curr_resch_rspns_sys", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns_sys;

    @ElDtoField(logicalName = "demnd_bill_no", physicalName = "demnd_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_bill_no;

    @ElDtoField(logicalName = "depst_clsf", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "depst_odr", physicalName = "depst_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_odr;

    @ElDtoField(logicalName = "depst_req_no", physicalName = "depst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_no;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_typ", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "dept_typ_nm", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;

    @ElDtoField(logicalName = "divsn_dept_nm", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "drct_chk", physicalName = "drct_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String drct_chk;

    @ElDtoField(logicalName = "drctText", physicalName = "drctText", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String drctText;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "enfrc_amt", physicalName = "enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_amt;

    @ElDtoField(logicalName = "enfrc_cause_amt", physicalName = "enfrc_cause_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_cause_amt;

    @ElDtoField(logicalName = "exec_bugt_seq", physicalName = "exec_bugt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exec_bugt_seq;

    @ElDtoField(logicalName = "exec_bugt_seq_max", physicalName = "exec_bugt_seq_max", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exec_bugt_seq_max;

    @ElDtoField(logicalName = "exect010_amt", physicalName = "exect010_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exect010_amt;

    @ElDtoField(logicalName = "exect190_amt", physicalName = "exect190_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exect190_amt;

    @ElDtoField(logicalName = "exect300_amt", physicalName = "exect300_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exect300_amt;

    @ElDtoField(logicalName = "final_bsns_plan_submit_affir", physicalName = "final_bsns_plan_submit_affir", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_bsns_plan_submit_affir;

    @ElDtoField(logicalName = "first_pre_prj_no", physicalName = "first_pre_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String first_pre_prj_no;

    @ElDtoField(logicalName = "frm_amt", physicalName = "frm_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_amt;

    @ElDtoField(logicalName = "frm_rt", physicalName = "frm_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frm_rt;

    @ElDtoField(logicalName = "grid_column_id", physicalName = "grid_column_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String grid_column_id;

    @ElDtoField(logicalName = "imp_totl_amt", physicalName = "imp_totl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imp_totl_amt;

    @ElDtoField(logicalName = "incom_amt", physicalName = "incom_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_amt;

    @ElDtoField(logicalName = "incom_enfrc_amt", physicalName = "incom_enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_enfrc_amt;

    @ElDtoField(logicalName = "indicost_amt", physicalName = "indicost_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indicost_amt;

    @ElDtoField(logicalName = "indicost_rt_inp", physicalName = "indicost_rt_inp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indicost_rt_inp;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "insd_tech_sup_incom", physicalName = "insd_tech_sup_incom", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_tech_sup_incom;

    @ElDtoField(logicalName = "intgr_mngmt_unit", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "intrst_amt", physicalName = "intrst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrst_amt;

    @ElDtoField(logicalName = "itm_clsf", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "itm_clsf_nm", physicalName = "itm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf_nm;

    @ElDtoField(logicalName = "itm_solve_base", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "itm_solve_base_pm", physicalName = "itm_solve_base_pm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base_pm;

    @ElDtoField(logicalName = "itm_solve_base1", physicalName = "itm_solve_base1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base1;

    @ElDtoField(logicalName = "itm_solve_base2", physicalName = "itm_solve_base2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base2;

    @ElDtoField(logicalName = "main_accnt_no", physicalName = "main_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_accnt_no;

    @ElDtoField(logicalName = "main_amt", physicalName = "main_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_amt;

    @ElDtoField(logicalName = "max_anal", physicalName = "max_anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_anal;

    @ElDtoField(logicalName = "max_seq", physicalName = "max_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_seq;

    @ElDtoField(logicalName = "mngmt_clsf", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "note_use_ex", physicalName = "note_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_use_ex;

    @ElDtoField(logicalName = "note_yn", physicalName = "note_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_yn;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElDtoField(logicalName = "oh_absrp_rt", physicalName = "oh_absrp_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oh_absrp_rt;

    @ElDtoField(logicalName = "othr_accnt_amt_sum", physicalName = "othr_accnt_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String othr_accnt_amt_sum;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "prcs_clsf", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "prd_term", physicalName = "prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prd_term;

    @ElDtoField(logicalName = "pre_amt", physicalName = "pre_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_amt;

    @ElDtoField(logicalName = "prj_clsf0", physicalName = "prj_clsf0", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_clsf0;

    @ElDtoField(logicalName = "prj_clsf1", physicalName = "prj_clsf1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_clsf1;

    @ElDtoField(logicalName = "prj_kind", physicalName = "prj_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_kind;

    @ElDtoField(logicalName = "prj_nm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "prj_no", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "prj_no_yr", physicalName = "prj_no_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_yr;

    @ElDtoField(logicalName = "prj_no1", physicalName = "prj_no1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no1;

    @ElDtoField(logicalName = "prj_orign", physicalName = "prj_orign", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_orign;

    @ElDtoField(logicalName = "prj_orign_yyyy", physicalName = "prj_orign_yyyy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_orign_yyyy;

    @ElDtoField(logicalName = "prj_state", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state;

    @ElDtoField(logicalName = "prj_state_nm", physicalName = "prj_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state_nm;

    @ElDtoField(logicalName = "ram001_amt", physicalName = "ram001_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ram001_amt;

    @ElDtoField(logicalName = "recv_bill_no", physicalName = "recv_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_bill_no;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "relat_accnt_no", physicalName = "relat_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_accnt_no;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "res_email", physicalName = "res_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_email;

    @ElDtoField(logicalName = "resbgallow_amt", physicalName = "resbgallow_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resbgallow_amt;

    @ElDtoField(logicalName = "resch_accnt_clsf", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf;

    @ElDtoField(logicalName = "resch_accnt_clsf_nm", physicalName = "resch_accnt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf_nm;

    @ElDtoField(logicalName = "resch_prd_term", physicalName = "resch_prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_prd_term;

    @ElDtoField(logicalName = "resch_rspns_str", physicalName = "resch_rspns_str", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_str;

    @ElDtoField(logicalName = "reschamt_card_use_clsf", physicalName = "reschamt_card_use_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschamt_card_use_clsf;

    @ElDtoField(logicalName = "resn_contnt", physicalName = "resn_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resn_contnt;

    @ElDtoField(logicalName = "result_detail", physicalName = "result_detail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result_detail;

    @ElDtoField(logicalName = "rspns_dept_nm", physicalName = "rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_dept_nm;

    @ElDtoField(logicalName = "rst_amt_chk", physicalName = "rst_amt_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_amt_chk;

    @ElDtoField(logicalName = "rstAmtChk", physicalName = "rstAmtChk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rstAmtChk;

    @ElDtoField(logicalName = "rsut_use_cls_ymd", physicalName = "rsut_use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsut_use_cls_ymd;

    @ElDtoField(logicalName = "rsut_use_orign_ymd", physicalName = "rsut_use_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsut_use_orign_ymd;

    @ElDtoField(logicalName = "save", physicalName = "save", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save;

    @ElDtoField(logicalName = "scrn_clsf", physicalName = "scrn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scrn_clsf;

    @ElDtoField(logicalName = "send_cnt", physicalName = "send_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_cnt;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "start_ymd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "start_ymd_chk", physicalName = "start_ymd_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd_chk;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "state_nm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "tax_cd", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "tax_cd_nm", physicalName = "tax_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd_nm;

    @ElDtoField(logicalName = "tot_026_amt", physicalName = "tot_026_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_026_amt;

    @ElDtoField(logicalName = "tot_amt", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;

    @ElDtoField(logicalName = "tot_bg_agree_tot_rat", physicalName = "tot_bg_agree_tot_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bg_agree_tot_rat;

    @ElDtoField(logicalName = "tot_bg_agree_tot_sum", physicalName = "tot_bg_agree_tot_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bg_agree_tot_sum;

    @ElDtoField(logicalName = "tot_bugt_item_rat", physicalName = "tot_bugt_item_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bugt_item_rat;

    @ElDtoField(logicalName = "tot_bugt_item_sum", physicalName = "tot_bugt_item_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_bugt_item_sum;

    @ElDtoField(logicalName = "tot_enfrc_cause_amt", physicalName = "tot_enfrc_cause_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_enfrc_cause_amt;

    @ElDtoField(logicalName = "tot_pre_amt", physicalName = "tot_pre_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_pre_amt;

    @ElDtoField(logicalName = "tot_prj_yrs", physicalName = "tot_prj_yrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_yrs;

    @ElDtoField(logicalName = "tot_resch_amt", physicalName = "tot_resch_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_amt;

    @ElDtoField(logicalName = "tot_resch_cash_amt", physicalName = "tot_resch_cash_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_cash_amt;

    @ElDtoField(logicalName = "tot_resch_prd_cls_ymd", physicalName = "tot_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_cls_ymd;

    @ElDtoField(logicalName = "tot_resch_prd_orign_ymd", physicalName = "tot_resch_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_orign_ymd;

    @ElDtoField(logicalName = "totl_amt", physicalName = "totl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totl_amt;

    @ElDtoField(logicalName = "trans_amt", physicalName = "trans_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_amt;

    @ElDtoField(logicalName = "uid", physicalName = "uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String uid;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "usg_clsf", physicalName = "usg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf;

    @ElDtoField(logicalName = "usg_clsf_nm", physicalName = "usg_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf_nm;

    @ElDtoField(logicalName = "vacct_no", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "yr", physicalName = "yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yr;

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf_nm")
    public String getAccnt_clsf_nm(){
        return accnt_clsf_nm;
    }

    @ElVoField(physicalName = "accnt_clsf_nm")
    public void setAccnt_clsf_nm(String accnt_clsf_nm){
        this.accnt_clsf_nm = accnt_clsf_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no1")
    public String getAccnt_no1(){
        return accnt_no1;
    }

    @ElVoField(physicalName = "accnt_no1")
    public void setAccnt_no1(String accnt_no1){
        this.accnt_no1 = accnt_no1;
    }

    @ElVoField(physicalName = "accnt_no2")
    public String getAccnt_no2(){
        return accnt_no2;
    }

    @ElVoField(physicalName = "accnt_no2")
    public void setAccnt_no2(String accnt_no2){
        this.accnt_no2 = accnt_no2;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns_dept")
    public String getAccnt_rspns_dept(){
        return accnt_rspns_dept;
    }

    @ElVoField(physicalName = "accnt_rspns_dept")
    public void setAccnt_rspns_dept(String accnt_rspns_dept){
        this.accnt_rspns_dept = accnt_rspns_dept;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public String getAccnt_rspns_empno(){
        return accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_empno")
    public void setAccnt_rspns_empno(String accnt_rspns_empno){
        this.accnt_rspns_empno = accnt_rspns_empno;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm_01")
    public String getAccnt_rspns_nm_01(){
        return accnt_rspns_nm_01;
    }

    @ElVoField(physicalName = "accnt_rspns_nm_01")
    public void setAccnt_rspns_nm_01(String accnt_rspns_nm_01){
        this.accnt_rspns_nm_01 = accnt_rspns_nm_01;
    }

    @ElVoField(physicalName = "accnt_rspns_no")
    public String getAccnt_rspns_no(){
        return accnt_rspns_no;
    }

    @ElVoField(physicalName = "accnt_rspns_no")
    public void setAccnt_rspns_no(String accnt_rspns_no){
        this.accnt_rspns_no = accnt_rspns_no;
    }

    @ElVoField(physicalName = "accnt_rspns_posi")
    public String getAccnt_rspns_posi(){
        return accnt_rspns_posi;
    }

    @ElVoField(physicalName = "accnt_rspns_posi")
    public void setAccnt_rspns_posi(String accnt_rspns_posi){
        this.accnt_rspns_posi = accnt_rspns_posi;
    }

    @ElVoField(physicalName = "accnt_rspns_str")
    public String getAccnt_rspns_str(){
        return accnt_rspns_str;
    }

    @ElVoField(physicalName = "accnt_rspns_str")
    public void setAccnt_rspns_str(String accnt_rspns_str){
        this.accnt_rspns_str = accnt_rspns_str;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "accnt_state_nm")
    public String getAccnt_state_nm(){
        return accnt_state_nm;
    }

    @ElVoField(physicalName = "accnt_state_nm")
    public void setAccnt_state_nm(String accnt_state_nm){
        this.accnt_state_nm = accnt_state_nm;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "agree_amt")
    public String getAgree_amt(){
        return agree_amt;
    }

    @ElVoField(physicalName = "agree_amt")
    public void setAgree_amt(String agree_amt){
        this.agree_amt = agree_amt;
    }

    @ElVoField(physicalName = "agree_amt2")
    public String getAgree_amt2(){
        return agree_amt2;
    }

    @ElVoField(physicalName = "agree_amt2")
    public void setAgree_amt2(String agree_amt2){
        this.agree_amt2 = agree_amt2;
    }

    @ElVoField(physicalName = "agree_direct_cost_fix_yn")
    public String getAgree_direct_cost_fix_yn(){
        return agree_direct_cost_fix_yn;
    }

    @ElVoField(physicalName = "agree_direct_cost_fix_yn")
    public void setAgree_direct_cost_fix_yn(String agree_direct_cost_fix_yn){
        this.agree_direct_cost_fix_yn = agree_direct_cost_fix_yn;
    }

    @ElVoField(physicalName = "agrt_cryfwd_amt")
    public String getAgrt_cryfwd_amt(){
        return agrt_cryfwd_amt;
    }

    @ElVoField(physicalName = "agrt_cryfwd_amt")
    public void setAgrt_cryfwd_amt(String agrt_cryfwd_amt){
        this.agrt_cryfwd_amt = agrt_cryfwd_amt;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "amt2")
    public String getAmt2(){
        return amt2;
    }

    @ElVoField(physicalName = "amt2")
    public void setAmt2(String amt2){
        this.amt2 = amt2;
    }

    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "apr_exec_bugt_seq")
    public String getApr_exec_bugt_seq(){
        return apr_exec_bugt_seq;
    }

    @ElVoField(physicalName = "apr_exec_bugt_seq")
    public void setApr_exec_bugt_seq(String apr_exec_bugt_seq){
        this.apr_exec_bugt_seq = apr_exec_bugt_seq;
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

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "bankaccnt_type")
    public String getBankaccnt_type(){
        return bankaccnt_type;
    }

    @ElVoField(physicalName = "bankaccnt_type")
    public void setBankaccnt_type(String bankaccnt_type){
        this.bankaccnt_type = bankaccnt_type;
    }

    @ElVoField(physicalName = "bg_agree_026_sum_sum")
    public String getBg_agree_026_sum_sum(){
        return bg_agree_026_sum_sum;
    }

    @ElVoField(physicalName = "bg_agree_026_sum_sum")
    public void setBg_agree_026_sum_sum(String bg_agree_026_sum_sum){
        this.bg_agree_026_sum_sum = bg_agree_026_sum_sum;
    }

    @ElVoField(physicalName = "bg_agree_tot_rat")
    public String getBg_agree_tot_rat(){
        return bg_agree_tot_rat;
    }

    @ElVoField(physicalName = "bg_agree_tot_rat")
    public void setBg_agree_tot_rat(String bg_agree_tot_rat){
        this.bg_agree_tot_rat = bg_agree_tot_rat;
    }

    @ElVoField(physicalName = "bg_agree_tot_sum")
    public String getBg_agree_tot_sum(){
        return bg_agree_tot_sum;
    }

    @ElVoField(physicalName = "bg_agree_tot_sum")
    public void setBg_agree_tot_sum(String bg_agree_tot_sum){
        this.bg_agree_tot_sum = bg_agree_tot_sum;
    }

    @ElVoField(physicalName = "bg_agree_tot_sum_sum")
    public String getBg_agree_tot_sum_sum(){
        return bg_agree_tot_sum_sum;
    }

    @ElVoField(physicalName = "bg_agree_tot_sum_sum")
    public void setBg_agree_tot_sum_sum(String bg_agree_tot_sum_sum){
        this.bg_agree_tot_sum_sum = bg_agree_tot_sum_sum;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public String getBsns_cd_bsns(){
        return bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public void setBsns_cd_bsns(String bsns_cd_bsns){
        this.bsns_cd_bsns = bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public String getBsns_cd_bsns_nm(){
        return bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public void setBsns_cd_bsns_nm(String bsns_cd_bsns_nm){
        this.bsns_cd_bsns_nm = bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public String getBsns_cd_detls_bsns(){
        return bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public void setBsns_cd_detls_bsns(String bsns_cd_detls_bsns){
        this.bsns_cd_detls_bsns = bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_yn")
    public String getBsns_yn(){
        return bsns_yn;
    }

    @ElVoField(physicalName = "bsns_yn")
    public void setBsns_yn(String bsns_yn){
        this.bsns_yn = bsns_yn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public String getBugt_ctrl_psn_nm(){
        return bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn_nm")
    public void setBugt_ctrl_psn_nm(String bugt_ctrl_psn_nm){
        this.bugt_ctrl_psn_nm = bugt_ctrl_psn_nm;
    }

    @ElVoField(physicalName = "bugt_item")
    public String getBugt_item(){
        return bugt_item;
    }

    @ElVoField(physicalName = "bugt_item")
    public void setBugt_item(String bugt_item){
        this.bugt_item = bugt_item;
    }

    @ElVoField(physicalName = "bugt_item_026_amt")
    public String getBugt_item_026_amt(){
        return bugt_item_026_amt;
    }

    @ElVoField(physicalName = "bugt_item_026_amt")
    public void setBugt_item_026_amt(String bugt_item_026_amt){
        this.bugt_item_026_amt = bugt_item_026_amt;
    }

    @ElVoField(physicalName = "bugt_item_amt")
    public String getBugt_item_amt(){
        return bugt_item_amt;
    }

    @ElVoField(physicalName = "bugt_item_amt")
    public void setBugt_item_amt(String bugt_item_amt){
        this.bugt_item_amt = bugt_item_amt;
    }

    @ElVoField(physicalName = "bugt_item_nm")
    public String getBugt_item_nm(){
        return bugt_item_nm;
    }

    @ElVoField(physicalName = "bugt_item_nm")
    public void setBugt_item_nm(String bugt_item_nm){
        this.bugt_item_nm = bugt_item_nm;
    }

    @ElVoField(physicalName = "bugt_item_rat")
    public String getBugt_item_rat(){
        return bugt_item_rat;
    }

    @ElVoField(physicalName = "bugt_item_rat")
    public void setBugt_item_rat(String bugt_item_rat){
        this.bugt_item_rat = bugt_item_rat;
    }

    @ElVoField(physicalName = "bugt_item_sum")
    public String getBugt_item_sum(){
        return bugt_item_sum;
    }

    @ElVoField(physicalName = "bugt_item_sum")
    public void setBugt_item_sum(String bugt_item_sum){
        this.bugt_item_sum = bugt_item_sum;
    }

    @ElVoField(physicalName = "bugt_item_yn")
    public String getBugt_item_yn(){
        return bugt_item_yn;
    }

    @ElVoField(physicalName = "bugt_item_yn")
    public void setBugt_item_yn(String bugt_item_yn){
        this.bugt_item_yn = bugt_item_yn;
    }

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "cons_work_attach_file_no")
    public String getCons_work_attach_file_no(){
        return cons_work_attach_file_no;
    }

    @ElVoField(physicalName = "cons_work_attach_file_no")
    public void setCons_work_attach_file_no(String cons_work_attach_file_no){
        this.cons_work_attach_file_no = cons_work_attach_file_no;
    }

    @ElVoField(physicalName = "cons_work_file")
    public String getCons_work_file(){
        return cons_work_file;
    }

    @ElVoField(physicalName = "cons_work_file")
    public void setCons_work_file(String cons_work_file){
        this.cons_work_file = cons_work_file;
    }

    @ElVoField(physicalName = "count")
    public String getCount(){
        return count;
    }

    @ElVoField(physicalName = "count")
    public void setCount(String count){
        this.count = count;
    }

    @ElVoField(physicalName = "crud_tag")
    public String getCrud_tag(){
        return crud_tag;
    }

    @ElVoField(physicalName = "crud_tag")
    public void setCrud_tag(String crud_tag){
        this.crud_tag = crud_tag;
    }

    @ElVoField(physicalName = "cryfwd_agree_amt")
    public String getCryfwd_agree_amt(){
        return cryfwd_agree_amt;
    }

    @ElVoField(physicalName = "cryfwd_agree_amt")
    public void setCryfwd_agree_amt(String cryfwd_agree_amt){
        this.cryfwd_agree_amt = cryfwd_agree_amt;
    }

    @ElVoField(physicalName = "cryfwd_agree_amt2")
    public String getCryfwd_agree_amt2(){
        return cryfwd_agree_amt2;
    }

    @ElVoField(physicalName = "cryfwd_agree_amt2")
    public void setCryfwd_agree_amt2(String cryfwd_agree_amt2){
        this.cryfwd_agree_amt2 = cryfwd_agree_amt2;
    }

    @ElVoField(physicalName = "cryfwd_amt")
    public String getCryfwd_amt(){
        return cryfwd_amt;
    }

    @ElVoField(physicalName = "cryfwd_amt")
    public void setCryfwd_amt(String cryfwd_amt){
        this.cryfwd_amt = cryfwd_amt;
    }

    @ElVoField(physicalName = "cryfwd_amt2")
    public String getCryfwd_amt2(){
        return cryfwd_amt2;
    }

    @ElVoField(physicalName = "cryfwd_amt2")
    public void setCryfwd_amt2(String cryfwd_amt2){
        this.cryfwd_amt2 = cryfwd_amt2;
    }

    @ElVoField(physicalName = "cud_flag")
    public String getCud_flag(){
        return cud_flag;
    }

    @ElVoField(physicalName = "cud_flag")
    public void setCud_flag(String cud_flag){
        this.cud_flag = cud_flag;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "curr_dept_cd")
    public String getCurr_dept_cd(){
        return curr_dept_cd;
    }

    @ElVoField(physicalName = "curr_dept_cd")
    public void setCurr_dept_cd(String curr_dept_cd){
        this.curr_dept_cd = curr_dept_cd;
    }

    @ElVoField(physicalName = "curr_dept_nm")
    public String getCurr_dept_nm(){
        return curr_dept_nm;
    }

    @ElVoField(physicalName = "curr_dept_nm")
    public void setCurr_dept_nm(String curr_dept_nm){
        this.curr_dept_nm = curr_dept_nm;
    }

    @ElVoField(physicalName = "curr_empno")
    public String getCurr_empno(){
        return curr_empno;
    }

    @ElVoField(physicalName = "curr_empno")
    public void setCurr_empno(String curr_empno){
        this.curr_empno = curr_empno;
    }

    @ElVoField(physicalName = "curr_new_ymd")
    public String getCurr_new_ymd(){
        return curr_new_ymd;
    }

    @ElVoField(physicalName = "curr_new_ymd")
    public void setCurr_new_ymd(String curr_new_ymd){
        this.curr_new_ymd = curr_new_ymd;
    }

    @ElVoField(physicalName = "curr_posi_cd")
    public String getCurr_posi_cd(){
        return curr_posi_cd;
    }

    @ElVoField(physicalName = "curr_posi_cd")
    public void setCurr_posi_cd(String curr_posi_cd){
        this.curr_posi_cd = curr_posi_cd;
    }

    @ElVoField(physicalName = "curr_posi_nm")
    public String getCurr_posi_nm(){
        return curr_posi_nm;
    }

    @ElVoField(physicalName = "curr_posi_nm")
    public void setCurr_posi_nm(String curr_posi_nm){
        this.curr_posi_nm = curr_posi_nm;
    }

    @ElVoField(physicalName = "curr_prj_anal")
    public String getCurr_prj_anal(){
        return curr_prj_anal;
    }

    @ElVoField(physicalName = "curr_prj_anal")
    public void setCurr_prj_anal(String curr_prj_anal){
        this.curr_prj_anal = curr_prj_anal;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public String getCurr_resch_rspns(){
        return curr_resch_rspns;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public void setCurr_resch_rspns(String curr_resch_rspns){
        this.curr_resch_rspns = curr_resch_rspns;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public String getCurr_resch_rspns_nm(){
        return curr_resch_rspns_nm;
    }

    @ElVoField(physicalName = "curr_resch_rspns_nm")
    public void setCurr_resch_rspns_nm(String curr_resch_rspns_nm){
        this.curr_resch_rspns_nm = curr_resch_rspns_nm;
    }

    @ElVoField(physicalName = "curr_resch_rspns_sys")
    public String getCurr_resch_rspns_sys(){
        return curr_resch_rspns_sys;
    }

    @ElVoField(physicalName = "curr_resch_rspns_sys")
    public void setCurr_resch_rspns_sys(String curr_resch_rspns_sys){
        this.curr_resch_rspns_sys = curr_resch_rspns_sys;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public String getDemnd_bill_no(){
        return demnd_bill_no;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public void setDemnd_bill_no(String demnd_bill_no){
        this.demnd_bill_no = demnd_bill_no;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "depst_odr")
    public String getDepst_odr(){
        return depst_odr;
    }

    @ElVoField(physicalName = "depst_odr")
    public void setDepst_odr(String depst_odr){
        this.depst_odr = depst_odr;
    }

    @ElVoField(physicalName = "depst_req_no")
    public String getDepst_req_no(){
        return depst_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public void setDepst_req_no(String depst_req_no){
        this.depst_req_no = depst_req_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public String getDept_typ_nm(){
        return dept_typ_nm;
    }

    @ElVoField(physicalName = "dept_typ_nm")
    public void setDept_typ_nm(String dept_typ_nm){
        this.dept_typ_nm = dept_typ_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "drct_chk")
    public String getDrct_chk(){
        return drct_chk;
    }

    @ElVoField(physicalName = "drct_chk")
    public void setDrct_chk(String drct_chk){
        this.drct_chk = drct_chk;
    }

    @ElVoField(physicalName = "drctText")
    public String getDrctText(){
        return drctText;
    }

    @ElVoField(physicalName = "drctText")
    public void setDrctText(String drctText){
        this.drctText = drctText;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public String getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(String enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_cause_amt")
    public String getEnfrc_cause_amt(){
        return enfrc_cause_amt;
    }

    @ElVoField(physicalName = "enfrc_cause_amt")
    public void setEnfrc_cause_amt(String enfrc_cause_amt){
        this.enfrc_cause_amt = enfrc_cause_amt;
    }

    @ElVoField(physicalName = "exec_bugt_seq")
    public String getExec_bugt_seq(){
        return exec_bugt_seq;
    }

    @ElVoField(physicalName = "exec_bugt_seq")
    public void setExec_bugt_seq(String exec_bugt_seq){
        this.exec_bugt_seq = exec_bugt_seq;
    }

    @ElVoField(physicalName = "exec_bugt_seq_max")
    public String getExec_bugt_seq_max(){
        return exec_bugt_seq_max;
    }

    @ElVoField(physicalName = "exec_bugt_seq_max")
    public void setExec_bugt_seq_max(String exec_bugt_seq_max){
        this.exec_bugt_seq_max = exec_bugt_seq_max;
    }

    @ElVoField(physicalName = "exect010_amt")
    public String getExect010_amt(){
        return exect010_amt;
    }

    @ElVoField(physicalName = "exect010_amt")
    public void setExect010_amt(String exect010_amt){
        this.exect010_amt = exect010_amt;
    }

    @ElVoField(physicalName = "exect190_amt")
    public String getExect190_amt(){
        return exect190_amt;
    }

    @ElVoField(physicalName = "exect190_amt")
    public void setExect190_amt(String exect190_amt){
        this.exect190_amt = exect190_amt;
    }

    @ElVoField(physicalName = "exect300_amt")
    public String getExect300_amt(){
        return exect300_amt;
    }

    @ElVoField(physicalName = "exect300_amt")
    public void setExect300_amt(String exect300_amt){
        this.exect300_amt = exect300_amt;
    }

    @ElVoField(physicalName = "final_bsns_plan_submit_affir")
    public String getFinal_bsns_plan_submit_affir(){
        return final_bsns_plan_submit_affir;
    }

    @ElVoField(physicalName = "final_bsns_plan_submit_affir")
    public void setFinal_bsns_plan_submit_affir(String final_bsns_plan_submit_affir){
        this.final_bsns_plan_submit_affir = final_bsns_plan_submit_affir;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public String getFirst_pre_prj_no(){
        return first_pre_prj_no;
    }

    @ElVoField(physicalName = "first_pre_prj_no")
    public void setFirst_pre_prj_no(String first_pre_prj_no){
        this.first_pre_prj_no = first_pre_prj_no;
    }

    @ElVoField(physicalName = "frm_amt")
    public String getFrm_amt(){
        return frm_amt;
    }

    @ElVoField(physicalName = "frm_amt")
    public void setFrm_amt(String frm_amt){
        this.frm_amt = frm_amt;
    }

    @ElVoField(physicalName = "frm_rt")
    public String getFrm_rt(){
        return frm_rt;
    }

    @ElVoField(physicalName = "frm_rt")
    public void setFrm_rt(String frm_rt){
        this.frm_rt = frm_rt;
    }

    @ElVoField(physicalName = "grid_column_id")
    public String getGrid_column_id(){
        return grid_column_id;
    }

    @ElVoField(physicalName = "grid_column_id")
    public void setGrid_column_id(String grid_column_id){
        this.grid_column_id = grid_column_id;
    }

    @ElVoField(physicalName = "imp_totl_amt")
    public String getImp_totl_amt(){
        return imp_totl_amt;
    }

    @ElVoField(physicalName = "imp_totl_amt")
    public void setImp_totl_amt(String imp_totl_amt){
        this.imp_totl_amt = imp_totl_amt;
    }

    @ElVoField(physicalName = "incom_amt")
    public String getIncom_amt(){
        return incom_amt;
    }

    @ElVoField(physicalName = "incom_amt")
    public void setIncom_amt(String incom_amt){
        this.incom_amt = incom_amt;
    }

    @ElVoField(physicalName = "incom_enfrc_amt")
    public String getIncom_enfrc_amt(){
        return incom_enfrc_amt;
    }

    @ElVoField(physicalName = "incom_enfrc_amt")
    public void setIncom_enfrc_amt(String incom_enfrc_amt){
        this.incom_enfrc_amt = incom_enfrc_amt;
    }

    @ElVoField(physicalName = "indicost_amt")
    public String getIndicost_amt(){
        return indicost_amt;
    }

    @ElVoField(physicalName = "indicost_amt")
    public void setIndicost_amt(String indicost_amt){
        this.indicost_amt = indicost_amt;
    }

    @ElVoField(physicalName = "indicost_rt_inp")
    public String getIndicost_rt_inp(){
        return indicost_rt_inp;
    }

    @ElVoField(physicalName = "indicost_rt_inp")
    public void setIndicost_rt_inp(String indicost_rt_inp){
        this.indicost_rt_inp = indicost_rt_inp;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "insd_tech_sup_incom")
    public String getInsd_tech_sup_incom(){
        return insd_tech_sup_incom;
    }

    @ElVoField(physicalName = "insd_tech_sup_incom")
    public void setInsd_tech_sup_incom(String insd_tech_sup_incom){
        this.insd_tech_sup_incom = insd_tech_sup_incom;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intrst_amt")
    public String getIntrst_amt(){
        return intrst_amt;
    }

    @ElVoField(physicalName = "intrst_amt")
    public void setIntrst_amt(String intrst_amt){
        this.intrst_amt = intrst_amt;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf_nm")
    public String getItm_clsf_nm(){
        return itm_clsf_nm;
    }

    @ElVoField(physicalName = "itm_clsf_nm")
    public void setItm_clsf_nm(String itm_clsf_nm){
        this.itm_clsf_nm = itm_clsf_nm;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base_pm")
    public String getItm_solve_base_pm(){
        return itm_solve_base_pm;
    }

    @ElVoField(physicalName = "itm_solve_base_pm")
    public void setItm_solve_base_pm(String itm_solve_base_pm){
        this.itm_solve_base_pm = itm_solve_base_pm;
    }

    @ElVoField(physicalName = "itm_solve_base1")
    public String getItm_solve_base1(){
        return itm_solve_base1;
    }

    @ElVoField(physicalName = "itm_solve_base1")
    public void setItm_solve_base1(String itm_solve_base1){
        this.itm_solve_base1 = itm_solve_base1;
    }

    @ElVoField(physicalName = "itm_solve_base2")
    public String getItm_solve_base2(){
        return itm_solve_base2;
    }

    @ElVoField(physicalName = "itm_solve_base2")
    public void setItm_solve_base2(String itm_solve_base2){
        this.itm_solve_base2 = itm_solve_base2;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public String getMain_accnt_no(){
        return main_accnt_no;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public void setMain_accnt_no(String main_accnt_no){
        this.main_accnt_no = main_accnt_no;
    }

    @ElVoField(physicalName = "main_amt")
    public String getMain_amt(){
        return main_amt;
    }

    @ElVoField(physicalName = "main_amt")
    public void setMain_amt(String main_amt){
        this.main_amt = main_amt;
    }

    @ElVoField(physicalName = "max_anal")
    public String getMax_anal(){
        return max_anal;
    }

    @ElVoField(physicalName = "max_anal")
    public void setMax_anal(String max_anal){
        this.max_anal = max_anal;
    }

    @ElVoField(physicalName = "max_seq")
    public String getMax_seq(){
        return max_seq;
    }

    @ElVoField(physicalName = "max_seq")
    public void setMax_seq(String max_seq){
        this.max_seq = max_seq;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public String getMngmt_clsf(){
        return mngmt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public void setMngmt_clsf(String mngmt_clsf){
        this.mngmt_clsf = mngmt_clsf;
    }

    @ElVoField(physicalName = "note_use_ex")
    public String getNote_use_ex(){
        return note_use_ex;
    }

    @ElVoField(physicalName = "note_use_ex")
    public void setNote_use_ex(String note_use_ex){
        this.note_use_ex = note_use_ex;
    }

    @ElVoField(physicalName = "note_yn")
    public String getNote_yn(){
        return note_yn;
    }

    @ElVoField(physicalName = "note_yn")
    public void setNote_yn(String note_yn){
        this.note_yn = note_yn;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public String getOh_absrp_rt(){
        return oh_absrp_rt;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public void setOh_absrp_rt(String oh_absrp_rt){
        this.oh_absrp_rt = oh_absrp_rt;
    }

    @ElVoField(physicalName = "othr_accnt_amt_sum")
    public String getOthr_accnt_amt_sum(){
        return othr_accnt_amt_sum;
    }

    @ElVoField(physicalName = "othr_accnt_amt_sum")
    public void setOthr_accnt_amt_sum(String othr_accnt_amt_sum){
        this.othr_accnt_amt_sum = othr_accnt_amt_sum;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public String getPrcs_clsf(){
        return prcs_clsf;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public void setPrcs_clsf(String prcs_clsf){
        this.prcs_clsf = prcs_clsf;
    }

    @ElVoField(physicalName = "prd_term")
    public String getPrd_term(){
        return prd_term;
    }

    @ElVoField(physicalName = "prd_term")
    public void setPrd_term(String prd_term){
        this.prd_term = prd_term;
    }

    @ElVoField(physicalName = "pre_amt")
    public String getPre_amt(){
        return pre_amt;
    }

    @ElVoField(physicalName = "pre_amt")
    public void setPre_amt(String pre_amt){
        this.pre_amt = pre_amt;
    }

    @ElVoField(physicalName = "prj_clsf0")
    public String getPrj_clsf0(){
        return prj_clsf0;
    }

    @ElVoField(physicalName = "prj_clsf0")
    public void setPrj_clsf0(String prj_clsf0){
        this.prj_clsf0 = prj_clsf0;
    }

    @ElVoField(physicalName = "prj_clsf1")
    public String getPrj_clsf1(){
        return prj_clsf1;
    }

    @ElVoField(physicalName = "prj_clsf1")
    public void setPrj_clsf1(String prj_clsf1){
        this.prj_clsf1 = prj_clsf1;
    }

    @ElVoField(physicalName = "prj_kind")
    public String getPrj_kind(){
        return prj_kind;
    }

    @ElVoField(physicalName = "prj_kind")
    public void setPrj_kind(String prj_kind){
        this.prj_kind = prj_kind;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "prj_no_yr")
    public String getPrj_no_yr(){
        return prj_no_yr;
    }

    @ElVoField(physicalName = "prj_no_yr")
    public void setPrj_no_yr(String prj_no_yr){
        this.prj_no_yr = prj_no_yr;
    }

    @ElVoField(physicalName = "prj_no1")
    public String getPrj_no1(){
        return prj_no1;
    }

    @ElVoField(physicalName = "prj_no1")
    public void setPrj_no1(String prj_no1){
        this.prj_no1 = prj_no1;
    }

    @ElVoField(physicalName = "prj_orign")
    public String getPrj_orign(){
        return prj_orign;
    }

    @ElVoField(physicalName = "prj_orign")
    public void setPrj_orign(String prj_orign){
        this.prj_orign = prj_orign;
    }

    @ElVoField(physicalName = "prj_orign_yyyy")
    public String getPrj_orign_yyyy(){
        return prj_orign_yyyy;
    }

    @ElVoField(physicalName = "prj_orign_yyyy")
    public void setPrj_orign_yyyy(String prj_orign_yyyy){
        this.prj_orign_yyyy = prj_orign_yyyy;
    }

    @ElVoField(physicalName = "prj_state")
    public String getPrj_state(){
        return prj_state;
    }

    @ElVoField(physicalName = "prj_state")
    public void setPrj_state(String prj_state){
        this.prj_state = prj_state;
    }

    @ElVoField(physicalName = "prj_state_nm")
    public String getPrj_state_nm(){
        return prj_state_nm;
    }

    @ElVoField(physicalName = "prj_state_nm")
    public void setPrj_state_nm(String prj_state_nm){
        this.prj_state_nm = prj_state_nm;
    }

    @ElVoField(physicalName = "ram001_amt")
    public String getRam001_amt(){
        return ram001_amt;
    }

    @ElVoField(physicalName = "ram001_amt")
    public void setRam001_amt(String ram001_amt){
        this.ram001_amt = ram001_amt;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public String getRecv_bill_no(){
        return recv_bill_no;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public void setRecv_bill_no(String recv_bill_no){
        this.recv_bill_no = recv_bill_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "relat_accnt_no")
    public String getRelat_accnt_no(){
        return relat_accnt_no;
    }

    @ElVoField(physicalName = "relat_accnt_no")
    public void setRelat_accnt_no(String relat_accnt_no){
        this.relat_accnt_no = relat_accnt_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "res_email")
    public String getRes_email(){
        return res_email;
    }

    @ElVoField(physicalName = "res_email")
    public void setRes_email(String res_email){
        this.res_email = res_email;
    }

    @ElVoField(physicalName = "resbgallow_amt")
    public String getResbgallow_amt(){
        return resbgallow_amt;
    }

    @ElVoField(physicalName = "resbgallow_amt")
    public void setResbgallow_amt(String resbgallow_amt){
        this.resbgallow_amt = resbgallow_amt;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public String getResch_accnt_clsf(){
        return resch_accnt_clsf;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public void setResch_accnt_clsf(String resch_accnt_clsf){
        this.resch_accnt_clsf = resch_accnt_clsf;
    }

    @ElVoField(physicalName = "resch_accnt_clsf_nm")
    public String getResch_accnt_clsf_nm(){
        return resch_accnt_clsf_nm;
    }

    @ElVoField(physicalName = "resch_accnt_clsf_nm")
    public void setResch_accnt_clsf_nm(String resch_accnt_clsf_nm){
        this.resch_accnt_clsf_nm = resch_accnt_clsf_nm;
    }

    @ElVoField(physicalName = "resch_prd_term")
    public String getResch_prd_term(){
        return resch_prd_term;
    }

    @ElVoField(physicalName = "resch_prd_term")
    public void setResch_prd_term(String resch_prd_term){
        this.resch_prd_term = resch_prd_term;
    }

    @ElVoField(physicalName = "resch_rspns_str")
    public String getResch_rspns_str(){
        return resch_rspns_str;
    }

    @ElVoField(physicalName = "resch_rspns_str")
    public void setResch_rspns_str(String resch_rspns_str){
        this.resch_rspns_str = resch_rspns_str;
    }

    @ElVoField(physicalName = "reschamt_card_use_clsf")
    public String getReschamt_card_use_clsf(){
        return reschamt_card_use_clsf;
    }

    @ElVoField(physicalName = "reschamt_card_use_clsf")
    public void setReschamt_card_use_clsf(String reschamt_card_use_clsf){
        this.reschamt_card_use_clsf = reschamt_card_use_clsf;
    }

    @ElVoField(physicalName = "resn_contnt")
    public String getResn_contnt(){
        return resn_contnt;
    }

    @ElVoField(physicalName = "resn_contnt")
    public void setResn_contnt(String resn_contnt){
        this.resn_contnt = resn_contnt;
    }

    @ElVoField(physicalName = "result_detail")
    public String getResult_detail(){
        return result_detail;
    }

    @ElVoField(physicalName = "result_detail")
    public void setResult_detail(String result_detail){
        this.result_detail = result_detail;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public String getRspns_dept_nm(){
        return rspns_dept_nm;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public void setRspns_dept_nm(String rspns_dept_nm){
        this.rspns_dept_nm = rspns_dept_nm;
    }

    @ElVoField(physicalName = "rst_amt_chk")
    public String getRst_amt_chk(){
        return rst_amt_chk;
    }

    @ElVoField(physicalName = "rst_amt_chk")
    public void setRst_amt_chk(String rst_amt_chk){
        this.rst_amt_chk = rst_amt_chk;
    }

    @ElVoField(physicalName = "rstAmtChk")
    public String getRstAmtChk(){
        return rstAmtChk;
    }

    @ElVoField(physicalName = "rstAmtChk")
    public void setRstAmtChk(String rstAmtChk){
        this.rstAmtChk = rstAmtChk;
    }

    @ElVoField(physicalName = "rsut_use_cls_ymd")
    public String getRsut_use_cls_ymd(){
        return rsut_use_cls_ymd;
    }

    @ElVoField(physicalName = "rsut_use_cls_ymd")
    public void setRsut_use_cls_ymd(String rsut_use_cls_ymd){
        this.rsut_use_cls_ymd = rsut_use_cls_ymd;
    }

    @ElVoField(physicalName = "rsut_use_orign_ymd")
    public String getRsut_use_orign_ymd(){
        return rsut_use_orign_ymd;
    }

    @ElVoField(physicalName = "rsut_use_orign_ymd")
    public void setRsut_use_orign_ymd(String rsut_use_orign_ymd){
        this.rsut_use_orign_ymd = rsut_use_orign_ymd;
    }

    @ElVoField(physicalName = "save")
    public String getSave(){
        return save;
    }

    @ElVoField(physicalName = "save")
    public void setSave(String save){
        this.save = save;
    }

    @ElVoField(physicalName = "scrn_clsf")
    public String getScrn_clsf(){
        return scrn_clsf;
    }

    @ElVoField(physicalName = "scrn_clsf")
    public void setScrn_clsf(String scrn_clsf){
        this.scrn_clsf = scrn_clsf;
    }

    @ElVoField(physicalName = "send_cnt")
    public String getSend_cnt(){
        return send_cnt;
    }

    @ElVoField(physicalName = "send_cnt")
    public void setSend_cnt(String send_cnt){
        this.send_cnt = send_cnt;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "start_ymd_chk")
    public String getStart_ymd_chk(){
        return start_ymd_chk;
    }

    @ElVoField(physicalName = "start_ymd_chk")
    public void setStart_ymd_chk(String start_ymd_chk){
        this.start_ymd_chk = start_ymd_chk;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public String getTax_cd_nm(){
        return tax_cd_nm;
    }

    @ElVoField(physicalName = "tax_cd_nm")
    public void setTax_cd_nm(String tax_cd_nm){
        this.tax_cd_nm = tax_cd_nm;
    }

    @ElVoField(physicalName = "tot_026_amt")
    public String getTot_026_amt(){
        return tot_026_amt;
    }

    @ElVoField(physicalName = "tot_026_amt")
    public void setTot_026_amt(String tot_026_amt){
        this.tot_026_amt = tot_026_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
    }

    @ElVoField(physicalName = "tot_bg_agree_tot_rat")
    public String getTot_bg_agree_tot_rat(){
        return tot_bg_agree_tot_rat;
    }

    @ElVoField(physicalName = "tot_bg_agree_tot_rat")
    public void setTot_bg_agree_tot_rat(String tot_bg_agree_tot_rat){
        this.tot_bg_agree_tot_rat = tot_bg_agree_tot_rat;
    }

    @ElVoField(physicalName = "tot_bg_agree_tot_sum")
    public String getTot_bg_agree_tot_sum(){
        return tot_bg_agree_tot_sum;
    }

    @ElVoField(physicalName = "tot_bg_agree_tot_sum")
    public void setTot_bg_agree_tot_sum(String tot_bg_agree_tot_sum){
        this.tot_bg_agree_tot_sum = tot_bg_agree_tot_sum;
    }

    @ElVoField(physicalName = "tot_bugt_item_rat")
    public String getTot_bugt_item_rat(){
        return tot_bugt_item_rat;
    }

    @ElVoField(physicalName = "tot_bugt_item_rat")
    public void setTot_bugt_item_rat(String tot_bugt_item_rat){
        this.tot_bugt_item_rat = tot_bugt_item_rat;
    }

    @ElVoField(physicalName = "tot_bugt_item_sum")
    public String getTot_bugt_item_sum(){
        return tot_bugt_item_sum;
    }

    @ElVoField(physicalName = "tot_bugt_item_sum")
    public void setTot_bugt_item_sum(String tot_bugt_item_sum){
        this.tot_bugt_item_sum = tot_bugt_item_sum;
    }

    @ElVoField(physicalName = "tot_enfrc_cause_amt")
    public String getTot_enfrc_cause_amt(){
        return tot_enfrc_cause_amt;
    }

    @ElVoField(physicalName = "tot_enfrc_cause_amt")
    public void setTot_enfrc_cause_amt(String tot_enfrc_cause_amt){
        this.tot_enfrc_cause_amt = tot_enfrc_cause_amt;
    }

    @ElVoField(physicalName = "tot_pre_amt")
    public String getTot_pre_amt(){
        return tot_pre_amt;
    }

    @ElVoField(physicalName = "tot_pre_amt")
    public void setTot_pre_amt(String tot_pre_amt){
        this.tot_pre_amt = tot_pre_amt;
    }

    @ElVoField(physicalName = "tot_prj_yrs")
    public String getTot_prj_yrs(){
        return tot_prj_yrs;
    }

    @ElVoField(physicalName = "tot_prj_yrs")
    public void setTot_prj_yrs(String tot_prj_yrs){
        this.tot_prj_yrs = tot_prj_yrs;
    }

    @ElVoField(physicalName = "tot_resch_amt")
    public String getTot_resch_amt(){
        return tot_resch_amt;
    }

    @ElVoField(physicalName = "tot_resch_amt")
    public void setTot_resch_amt(String tot_resch_amt){
        this.tot_resch_amt = tot_resch_amt;
    }

    @ElVoField(physicalName = "tot_resch_cash_amt")
    public String getTot_resch_cash_amt(){
        return tot_resch_cash_amt;
    }

    @ElVoField(physicalName = "tot_resch_cash_amt")
    public void setTot_resch_cash_amt(String tot_resch_cash_amt){
        this.tot_resch_cash_amt = tot_resch_cash_amt;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public String getTot_resch_prd_cls_ymd(){
        return tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public void setTot_resch_prd_cls_ymd(String tot_resch_prd_cls_ymd){
        this.tot_resch_prd_cls_ymd = tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public String getTot_resch_prd_orign_ymd(){
        return tot_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public void setTot_resch_prd_orign_ymd(String tot_resch_prd_orign_ymd){
        this.tot_resch_prd_orign_ymd = tot_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "totl_amt")
    public String getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(String totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public String getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(String trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "uid")
    public String getUid(){
        return uid;
    }

    @ElVoField(physicalName = "uid")
    public void setUid(String uid){
        this.uid = uid;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "usg_clsf")
    public String getUsg_clsf(){
        return usg_clsf;
    }

    @ElVoField(physicalName = "usg_clsf")
    public void setUsg_clsf(String usg_clsf){
        this.usg_clsf = usg_clsf;
    }

    @ElVoField(physicalName = "usg_clsf_nm")
    public String getUsg_clsf_nm(){
        return usg_clsf_nm;
    }

    @ElVoField(physicalName = "usg_clsf_nm")
    public void setUsg_clsf_nm(String usg_clsf_nm){
        this.usg_clsf_nm = usg_clsf_nm;
    }

    @ElVoField(physicalName = "vacct_no")
    public String getVacct_no(){
        return vacct_no;
    }

    @ElVoField(physicalName = "vacct_no")
    public void setVacct_no(String vacct_no){
        this.vacct_no = vacct_no;
    }

    @ElVoField(physicalName = "yr")
    public String getYr(){
        return yr;
    }

    @ElVoField(physicalName = "yr")
    public void setYr(String yr){
        this.yr = yr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResExcExeBdgetInfoVo [");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("accnt_clsf_nm").append("=").append(accnt_clsf_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_no1").append("=").append(accnt_no1).append(",");
        sb.append("accnt_no2").append("=").append(accnt_no2).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_dept").append("=").append(accnt_rspns_dept).append(",");
        sb.append("accnt_rspns_empno").append("=").append(accnt_rspns_empno).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_nm_01").append("=").append(accnt_rspns_nm_01).append(",");
        sb.append("accnt_rspns_no").append("=").append(accnt_rspns_no).append(",");
        sb.append("accnt_rspns_posi").append("=").append(accnt_rspns_posi).append(",");
        sb.append("accnt_rspns_str").append("=").append(accnt_rspns_str).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("accnt_state_nm").append("=").append(accnt_state_nm).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("agree_amt").append("=").append(agree_amt).append(",");
        sb.append("agree_amt2").append("=").append(agree_amt2).append(",");
        sb.append("agree_direct_cost_fix_yn").append("=").append(agree_direct_cost_fix_yn).append(",");
        sb.append("agrt_cryfwd_amt").append("=").append(agrt_cryfwd_amt).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("amt2").append("=").append(amt2).append(",");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("apr_exec_bugt_seq").append("=").append(apr_exec_bugt_seq).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("bankaccnt_type").append("=").append(bankaccnt_type).append(",");
        sb.append("bg_agree_026_sum_sum").append("=").append(bg_agree_026_sum_sum).append(",");
        sb.append("bg_agree_tot_rat").append("=").append(bg_agree_tot_rat).append(",");
        sb.append("bg_agree_tot_sum").append("=").append(bg_agree_tot_sum).append(",");
        sb.append("bg_agree_tot_sum_sum").append("=").append(bg_agree_tot_sum_sum).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("bsns_cd_detls_bsns").append("=").append(bsns_cd_detls_bsns).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("bsns_yn").append("=").append(bsns_yn).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("bugt_ctrl_psn_nm").append("=").append(bugt_ctrl_psn_nm).append(",");
        sb.append("bugt_item").append("=").append(bugt_item).append(",");
        sb.append("bugt_item_026_amt").append("=").append(bugt_item_026_amt).append(",");
        sb.append("bugt_item_amt").append("=").append(bugt_item_amt).append(",");
        sb.append("bugt_item_nm").append("=").append(bugt_item_nm).append(",");
        sb.append("bugt_item_rat").append("=").append(bugt_item_rat).append(",");
        sb.append("bugt_item_sum").append("=").append(bugt_item_sum).append(",");
        sb.append("bugt_item_yn").append("=").append(bugt_item_yn).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("cons_work_attach_file_no").append("=").append(cons_work_attach_file_no).append(",");
        sb.append("cons_work_file").append("=").append(cons_work_file).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("crud_tag").append("=").append(crud_tag).append(",");
        sb.append("cryfwd_agree_amt").append("=").append(cryfwd_agree_amt).append(",");
        sb.append("cryfwd_agree_amt2").append("=").append(cryfwd_agree_amt2).append(",");
        sb.append("cryfwd_amt").append("=").append(cryfwd_amt).append(",");
        sb.append("cryfwd_amt2").append("=").append(cryfwd_amt2).append(",");
        sb.append("cud_flag").append("=").append(cud_flag).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("curr_dept_cd").append("=").append(curr_dept_cd).append(",");
        sb.append("curr_dept_nm").append("=").append(curr_dept_nm).append(",");
        sb.append("curr_empno").append("=").append(curr_empno).append(",");
        sb.append("curr_new_ymd").append("=").append(curr_new_ymd).append(",");
        sb.append("curr_posi_cd").append("=").append(curr_posi_cd).append(",");
        sb.append("curr_posi_nm").append("=").append(curr_posi_nm).append(",");
        sb.append("curr_prj_anal").append("=").append(curr_prj_anal).append(",");
        sb.append("curr_resch_rspns").append("=").append(curr_resch_rspns).append(",");
        sb.append("curr_resch_rspns_nm").append("=").append(curr_resch_rspns_nm).append(",");
        sb.append("curr_resch_rspns_sys").append("=").append(curr_resch_rspns_sys).append(",");
        sb.append("demnd_bill_no").append("=").append(demnd_bill_no).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("depst_odr").append("=").append(depst_odr).append(",");
        sb.append("depst_req_no").append("=").append(depst_req_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("drct_chk").append("=").append(drct_chk).append(",");
        sb.append("drctText").append("=").append(drctText).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("enfrc_cause_amt").append("=").append(enfrc_cause_amt).append(",");
        sb.append("exec_bugt_seq").append("=").append(exec_bugt_seq).append(",");
        sb.append("exec_bugt_seq_max").append("=").append(exec_bugt_seq_max).append(",");
        sb.append("exect010_amt").append("=").append(exect010_amt).append(",");
        sb.append("exect190_amt").append("=").append(exect190_amt).append(",");
        sb.append("exect300_amt").append("=").append(exect300_amt).append(",");
        sb.append("final_bsns_plan_submit_affir").append("=").append(final_bsns_plan_submit_affir).append(",");
        sb.append("first_pre_prj_no").append("=").append(first_pre_prj_no).append(",");
        sb.append("frm_amt").append("=").append(frm_amt).append(",");
        sb.append("frm_rt").append("=").append(frm_rt).append(",");
        sb.append("grid_column_id").append("=").append(grid_column_id).append(",");
        sb.append("imp_totl_amt").append("=").append(imp_totl_amt).append(",");
        sb.append("incom_amt").append("=").append(incom_amt).append(",");
        sb.append("incom_enfrc_amt").append("=").append(incom_enfrc_amt).append(",");
        sb.append("indicost_amt").append("=").append(indicost_amt).append(",");
        sb.append("indicost_rt_inp").append("=").append(indicost_rt_inp).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("insd_tech_sup_incom").append("=").append(insd_tech_sup_incom).append(",");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("intrst_amt").append("=").append(intrst_amt).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("itm_clsf_nm").append("=").append(itm_clsf_nm).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("itm_solve_base_pm").append("=").append(itm_solve_base_pm).append(",");
        sb.append("itm_solve_base1").append("=").append(itm_solve_base1).append(",");
        sb.append("itm_solve_base2").append("=").append(itm_solve_base2).append(",");
        sb.append("main_accnt_no").append("=").append(main_accnt_no).append(",");
        sb.append("main_amt").append("=").append(main_amt).append(",");
        sb.append("max_anal").append("=").append(max_anal).append(",");
        sb.append("max_seq").append("=").append(max_seq).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("note_use_ex").append("=").append(note_use_ex).append(",");
        sb.append("note_yn").append("=").append(note_yn).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("oh_absrp_rt").append("=").append(oh_absrp_rt).append(",");
        sb.append("othr_accnt_amt_sum").append("=").append(othr_accnt_amt_sum).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("prd_term").append("=").append(prd_term).append(",");
        sb.append("pre_amt").append("=").append(pre_amt).append(",");
        sb.append("prj_clsf0").append("=").append(prj_clsf0).append(",");
        sb.append("prj_clsf1").append("=").append(prj_clsf1).append(",");
        sb.append("prj_kind").append("=").append(prj_kind).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_no_yr").append("=").append(prj_no_yr).append(",");
        sb.append("prj_no1").append("=").append(prj_no1).append(",");
        sb.append("prj_orign").append("=").append(prj_orign).append(",");
        sb.append("prj_orign_yyyy").append("=").append(prj_orign_yyyy).append(",");
        sb.append("prj_state").append("=").append(prj_state).append(",");
        sb.append("prj_state_nm").append("=").append(prj_state_nm).append(",");
        sb.append("ram001_amt").append("=").append(ram001_amt).append(",");
        sb.append("recv_bill_no").append("=").append(recv_bill_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("relat_accnt_no").append("=").append(relat_accnt_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("res_email").append("=").append(res_email).append(",");
        sb.append("resbgallow_amt").append("=").append(resbgallow_amt).append(",");
        sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf).append(",");
        sb.append("resch_accnt_clsf_nm").append("=").append(resch_accnt_clsf_nm).append(",");
        sb.append("resch_prd_term").append("=").append(resch_prd_term).append(",");
        sb.append("resch_rspns_str").append("=").append(resch_rspns_str).append(",");
        sb.append("reschamt_card_use_clsf").append("=").append(reschamt_card_use_clsf).append(",");
        sb.append("resn_contnt").append("=").append(resn_contnt).append(",");
        sb.append("result_detail").append("=").append(result_detail).append(",");
        sb.append("rspns_dept_nm").append("=").append(rspns_dept_nm).append(",");
        sb.append("rst_amt_chk").append("=").append(rst_amt_chk).append(",");
        sb.append("rstAmtChk").append("=").append(rstAmtChk).append(",");
        sb.append("rsut_use_cls_ymd").append("=").append(rsut_use_cls_ymd).append(",");
        sb.append("rsut_use_orign_ymd").append("=").append(rsut_use_orign_ymd).append(",");
        sb.append("save").append("=").append(save).append(",");
        sb.append("scrn_clsf").append("=").append(scrn_clsf).append(",");
        sb.append("send_cnt").append("=").append(send_cnt).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("start_ymd_chk").append("=").append(start_ymd_chk).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("tax_cd_nm").append("=").append(tax_cd_nm).append(",");
        sb.append("tot_026_amt").append("=").append(tot_026_amt).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("tot_bg_agree_tot_rat").append("=").append(tot_bg_agree_tot_rat).append(",");
        sb.append("tot_bg_agree_tot_sum").append("=").append(tot_bg_agree_tot_sum).append(",");
        sb.append("tot_bugt_item_rat").append("=").append(tot_bugt_item_rat).append(",");
        sb.append("tot_bugt_item_sum").append("=").append(tot_bugt_item_sum).append(",");
        sb.append("tot_enfrc_cause_amt").append("=").append(tot_enfrc_cause_amt).append(",");
        sb.append("tot_pre_amt").append("=").append(tot_pre_amt).append(",");
        sb.append("tot_prj_yrs").append("=").append(tot_prj_yrs).append(",");
        sb.append("tot_resch_amt").append("=").append(tot_resch_amt).append(",");
        sb.append("tot_resch_cash_amt").append("=").append(tot_resch_cash_amt).append(",");
        sb.append("tot_resch_prd_cls_ymd").append("=").append(tot_resch_prd_cls_ymd).append(",");
        sb.append("tot_resch_prd_orign_ymd").append("=").append(tot_resch_prd_orign_ymd).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("uid").append("=").append(uid).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("usg_clsf").append("=").append(usg_clsf).append(",");
        sb.append("usg_clsf_nm").append("=").append(usg_clsf_nm).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("yr").append("=").append(yr);
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
