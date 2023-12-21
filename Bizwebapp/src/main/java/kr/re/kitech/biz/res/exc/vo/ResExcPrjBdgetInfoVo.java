package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "프로젝트예산편성정보")
public class ResExcPrjBdgetInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResExcPrjBdgetInfoVo(){
    }

    @ElDtoField(logicalName = "accnt_clsf", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_no_nm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_rspns_dept", physicalName = "accnt_rspns_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept;

    @ElDtoField(logicalName = "accnt_rspns_nm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

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

    @ElDtoField(logicalName = "agrt_cryfwd_amt", physicalName = "agrt_cryfwd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agrt_cryfwd_amt;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "anal", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "bg_agree_tot_rat", physicalName = "bg_agree_tot_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_tot_rat;

    @ElDtoField(logicalName = "bg_agree_tot_sum", physicalName = "bg_agree_tot_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bg_agree_tot_sum;

    @ElDtoField(logicalName = "bsns_req_no", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "bugt_ctrl_psn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "bugt_ctrl_psn_nm", physicalName = "bugt_ctrl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn_nm;

    @ElDtoField(logicalName = "bugt_item", physicalName = "bugt_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item;

    @ElDtoField(logicalName = "bugt_item_nm", physicalName = "bugt_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_nm;

    @ElDtoField(logicalName = "bugt_item_rat", physicalName = "bugt_item_rat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_rat;

    @ElDtoField(logicalName = "bugt_item_sum", physicalName = "bugt_item_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_sum;

    @ElDtoField(logicalName = "bugt_item_yn", physicalName = "bugt_item_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_yn;

    @ElDtoField(logicalName = "count", physicalName = "count", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String count;

    @ElDtoField(logicalName = "crud_tag", physicalName = "crud_tag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crud_tag;

    @ElDtoField(logicalName = "cryfwd_amt", physicalName = "cryfwd_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_amt;

    @ElDtoField(logicalName = "cud_flag", physicalName = "cud_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_flag;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_typ", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "dept_typ_nm", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;

    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "enfrc_amt", physicalName = "enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_amt;

    @ElDtoField(logicalName = "enfrc_cause_amt", physicalName = "enfrc_cause_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_cause_amt;

    @ElDtoField(logicalName = "exec_bugt_seq", physicalName = "exec_bugt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exec_bugt_seq;

    @ElDtoField(logicalName = "exec_bugt_seq_max", physicalName = "exec_bugt_seq_max", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exec_bugt_seq_max;

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

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "insd_tech_sup_incom", physicalName = "insd_tech_sup_incom", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_tech_sup_incom;

    @ElDtoField(logicalName = "itm_clsf", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "itm_clsf_nm", physicalName = "itm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf_nm;

    @ElDtoField(logicalName = "itm_solve_base", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "max_seq", physicalName = "max_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String max_seq;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "prcs_clsf", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "prd_term", physicalName = "prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prd_term;

    @ElDtoField(logicalName = "pre_amt", physicalName = "pre_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_amt;

    @ElDtoField(logicalName = "prj_no", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

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

    @ElDtoField(logicalName = "resch_accnt_clsf", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf;

    @ElDtoField(logicalName = "resch_accnt_clsf_nm", physicalName = "resch_accnt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf_nm;

    @ElDtoField(logicalName = "resch_prd_term", physicalName = "resch_prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_prd_term;

    @ElDtoField(logicalName = "resn_contnt", physicalName = "resn_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resn_contnt;

    @ElDtoField(logicalName = "rspns_dept_nm", physicalName = "rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_dept_nm;

    @ElDtoField(logicalName = "rsut_use_cls_ymd", physicalName = "rsut_use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsut_use_cls_ymd;

    @ElDtoField(logicalName = "rsut_use_orign_ymd", physicalName = "rsut_use_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rsut_use_orign_ymd;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "tax_cd", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "tax_cd_nm", physicalName = "tax_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd_nm;

    @ElDtoField(logicalName = "tot_amt", physicalName = "tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_amt;

    @ElDtoField(logicalName = "tot_enfrc_cause_amt", physicalName = "tot_enfrc_cause_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_enfrc_cause_amt;

    @ElDtoField(logicalName = "tot_pre_amt", physicalName = "tot_pre_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_pre_amt;

    @ElDtoField(logicalName = "totl_amt", physicalName = "totl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totl_amt;

    @ElDtoField(logicalName = "trans_amt", physicalName = "trans_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_amt;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "usg_clsf", physicalName = "usg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf;

    @ElDtoField(logicalName = "usg_clsf_nm", physicalName = "usg_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_clsf_nm;

    @ElDtoField(logicalName = "yr", physicalName = "yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yr;

    @ElDtoField(logicalName = "ss_sql", physicalName = "ss_sql", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int ss_sql;

    @ElDtoField(logicalName = "ss_desc", physicalName = "ss_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ss_desc;

    @ElDtoField(logicalName = "log_no", physicalName = "log_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String log_no;

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
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

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
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

    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
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

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
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

    @ElVoField(physicalName = "cryfwd_amt")
    public String getCryfwd_amt(){
        return cryfwd_amt;
    }

    @ElVoField(physicalName = "cryfwd_amt")
    public void setCryfwd_amt(String cryfwd_amt){
        this.cryfwd_amt = cryfwd_amt;
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

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
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

    @ElVoField(physicalName = "max_seq")
    public String getMax_seq(){
        return max_seq;
    }

    @ElVoField(physicalName = "max_seq")
    public void setMax_seq(String max_seq){
        this.max_seq = max_seq;
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

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
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

    @ElVoField(physicalName = "resn_contnt")
    public String getResn_contnt(){
        return resn_contnt;
    }

    @ElVoField(physicalName = "resn_contnt")
    public void setResn_contnt(String resn_contnt){
        this.resn_contnt = resn_contnt;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public String getRspns_dept_nm(){
        return rspns_dept_nm;
    }

    @ElVoField(physicalName = "rspns_dept_nm")
    public void setRspns_dept_nm(String rspns_dept_nm){
        this.rspns_dept_nm = rspns_dept_nm;
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

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
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

    @ElVoField(physicalName = "tot_amt")
    public String getTot_amt(){
        return tot_amt;
    }

    @ElVoField(physicalName = "tot_amt")
    public void setTot_amt(String tot_amt){
        this.tot_amt = tot_amt;
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

    @ElVoField(physicalName = "yr")
    public String getYr(){
        return yr;
    }

    @ElVoField(physicalName = "yr")
    public void setYr(String yr){
        this.yr = yr;
    }

    @ElVoField(physicalName = "ss_sql")
    public int getSs_sql(){
        return ss_sql;
    }

    @ElVoField(physicalName = "ss_sql")
    public void setSs_sql(int ss_sql){
        this.ss_sql = ss_sql;
    }

    @ElVoField(physicalName = "ss_desc")
    public String getSs_desc(){
        return ss_desc;
    }

    @ElVoField(physicalName = "ss_desc")
    public void setSs_desc(String ss_desc){
        this.ss_desc = ss_desc;
    }

    @ElVoField(physicalName = "log_no")
    public String getLog_no(){
        return log_no;
    }

    @ElVoField(physicalName = "log_no")
    public void setLog_no(String log_no){
        this.log_no = log_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResExcPrjBdgetInfoVo [");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_dept").append("=").append(accnt_rspns_dept).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_no").append("=").append(accnt_rspns_no).append(",");
        sb.append("accnt_rspns_posi").append("=").append(accnt_rspns_posi).append(",");
        sb.append("accnt_rspns_str").append("=").append(accnt_rspns_str).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("accnt_state_nm").append("=").append(accnt_state_nm).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("agrt_cryfwd_amt").append("=").append(agrt_cryfwd_amt).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("bg_agree_tot_rat").append("=").append(bg_agree_tot_rat).append(",");
        sb.append("bg_agree_tot_sum").append("=").append(bg_agree_tot_sum).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("bugt_ctrl_psn_nm").append("=").append(bugt_ctrl_psn_nm).append(",");
        sb.append("bugt_item").append("=").append(bugt_item).append(",");
        sb.append("bugt_item_nm").append("=").append(bugt_item_nm).append(",");
        sb.append("bugt_item_rat").append("=").append(bugt_item_rat).append(",");
        sb.append("bugt_item_sum").append("=").append(bugt_item_sum).append(",");
        sb.append("bugt_item_yn").append("=").append(bugt_item_yn).append(",");
        sb.append("count").append("=").append(count).append(",");
        sb.append("crud_tag").append("=").append(crud_tag).append(",");
        sb.append("cryfwd_amt").append("=").append(cryfwd_amt).append(",");
        sb.append("cud_flag").append("=").append(cud_flag).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("enfrc_cause_amt").append("=").append(enfrc_cause_amt).append(",");
        sb.append("exec_bugt_seq").append("=").append(exec_bugt_seq).append(",");
        sb.append("exec_bugt_seq_max").append("=").append(exec_bugt_seq_max).append(",");
        sb.append("frm_amt").append("=").append(frm_amt).append(",");
        sb.append("frm_rt").append("=").append(frm_rt).append(",");
        sb.append("grid_column_id").append("=").append(grid_column_id).append(",");
        sb.append("imp_totl_amt").append("=").append(imp_totl_amt).append(",");
        sb.append("incom_amt").append("=").append(incom_amt).append(",");
        sb.append("incom_enfrc_amt").append("=").append(incom_enfrc_amt).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("insd_tech_sup_incom").append("=").append(insd_tech_sup_incom).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("itm_clsf_nm").append("=").append(itm_clsf_nm).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("max_seq").append("=").append(max_seq).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("prd_term").append("=").append(prd_term).append(",");
        sb.append("pre_amt").append("=").append(pre_amt).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("relat_accnt_no").append("=").append(relat_accnt_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf).append(",");
        sb.append("resch_accnt_clsf_nm").append("=").append(resch_accnt_clsf_nm).append(",");
        sb.append("resch_prd_term").append("=").append(resch_prd_term).append(",");
        sb.append("resn_contnt").append("=").append(resn_contnt).append(",");
        sb.append("rspns_dept_nm").append("=").append(rspns_dept_nm).append(",");
        sb.append("rsut_use_cls_ymd").append("=").append(rsut_use_cls_ymd).append(",");
        sb.append("rsut_use_orign_ymd").append("=").append(rsut_use_orign_ymd).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("tax_cd_nm").append("=").append(tax_cd_nm).append(",");
        sb.append("tot_amt").append("=").append(tot_amt).append(",");
        sb.append("tot_enfrc_cause_amt").append("=").append(tot_enfrc_cause_amt).append(",");
        sb.append("tot_pre_amt").append("=").append(tot_pre_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("usg_clsf").append("=").append(usg_clsf).append(",");
        sb.append("usg_clsf_nm").append("=").append(usg_clsf_nm).append(",");
        sb.append("yr").append("=").append(yr).append(",");
        sb.append("ss_sql").append("=").append(ss_sql).append(",");
        sb.append("ss_desc").append("=").append(ss_desc).append(",");
        sb.append("log_no").append("=").append(log_no);
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
