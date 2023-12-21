package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspTechSuphExp")
public class FspTechSuphVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSuphVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "decsn_ex", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "mngmt_item_1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "cud_menu", physicalName = "cud_menu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_menu;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "req_clsf", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "supt_clsf", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accnt_no_nm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_rspns_nm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "req_psn_no", physicalName = "req_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_no;

    @ElDtoField(logicalName = "req_psn", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "req_dept", physicalName = "req_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept;

    @ElDtoField(logicalName = "req_dept_nm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "complt_demnd_ymd", physicalName = "complt_demnd_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd;

    @ElDtoField(logicalName = "rcpt_psn_no", physicalName = "rcpt_psn_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_no;

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "rcpt_psn", physicalName = "rcpt_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn;

    @ElDtoField(logicalName = "rcpt_psn_nm", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "rcpt_dept", physicalName = "rcpt_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_dept;

    @ElDtoField(logicalName = "rcpt_dept_nm", physicalName = "rcpt_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_dept_nm;

    @ElDtoField(logicalName = "impt_accnt_no", physicalName = "impt_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_no;

    @ElDtoField(logicalName = "impt_accnt_no_nm", physicalName = "impt_accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_no_nm;

    @ElDtoField(logicalName = "impt_accnt_rspns", physicalName = "impt_accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_rspns;

    @ElDtoField(logicalName = "impt_accnt_rspns_nm", physicalName = "impt_accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_rspns_nm;

    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "charg_nm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "supt_respn_syspayno", physicalName = "supt_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_syspayno;

    @ElDtoField(logicalName = "supt_respn_nm", physicalName = "supt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_nm;

    @ElDtoField(logicalName = "bugt_ctrl_way", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_way;

    @ElDtoField(logicalName = "bugt_item_cd", physicalName = "bugt_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_item_cd;

    @ElDtoField(logicalName = "rcpt_ymd", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "complt_ymd", physicalName = "complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_ymd;

    @ElDtoField(logicalName = "req_amt", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "ctrl_amt", physicalName = "ctrl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_amt;

    @ElDtoField(logicalName = "accnt_cd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "req_state", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "use_usg", physicalName = "use_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_usg;

    @ElDtoField(logicalName = "supt_detls_item", physicalName = "supt_detls_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_detls_item;

    @ElDtoField(logicalName = "supt_detls", physicalName = "supt_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_detls;

    @ElDtoField(logicalName = "req_treat_qty", physicalName = "req_treat_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_treat_qty;

    @ElDtoField(logicalName = "ctrl_no", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "rst_book_issu", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "slip_ymd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "req_odr", physicalName = "req_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_odr;

    @ElDtoField(logicalName = "req_ymd_st", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;

    @ElDtoField(logicalName = "req_ymd_ed", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;

    @ElDtoField(logicalName = "complt_demnd_ymd_st", physicalName = "complt_demnd_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd_st;

    @ElDtoField(logicalName = "complt_demnd_ymd_ed", physicalName = "complt_demnd_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_demnd_ymd_ed;

    @ElDtoField(logicalName = "req_psn_syspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "req_psn_nm_like", physicalName = "req_psn_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm_like;

    @ElDtoField(logicalName = "req_psn_empno_like", physicalName = "req_psn_empno_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno_like;

    @ElDtoField(logicalName = "rcpt_psn_syspayno", physicalName = "rcpt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_syspayno;

    @ElDtoField(logicalName = "rcpt_psn_nm_like", physicalName = "rcpt_psn_nm_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm_like;

    @ElDtoField(logicalName = "rcpt_psn_empno_like", physicalName = "rcpt_psn_empno_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno_like;

    @ElDtoField(logicalName = "accnt_no_like", physicalName = "accnt_no_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_like;

    @ElDtoField(logicalName = "impt_accnt_no_like", physicalName = "impt_accnt_no_like", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_no_like;

    @ElDtoField(logicalName = "tax_cd", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "charg_syspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "accnt_rspns_dept_nm", physicalName = "accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "impt_accnt_rspns_dept_nm", physicalName = "impt_accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "accnt_ymd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "unslip_odr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr;

    @ElDtoField(logicalName = "trans_amt", physicalName = "trans_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_amt;

    @ElDtoField(logicalName = "impt_tax_nm", physicalName = "impt_tax_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_tax_nm;

    @ElDtoField(logicalName = "rst_book_issu_yn", physicalName = "rst_book_issu_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu_yn;

    @ElDtoField(logicalName = "req_psn_empno", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "rcpt_psn_empno", physicalName = "rcpt_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno;

    @ElDtoField(logicalName = "rcpt_dept_cd_nm", physicalName = "rcpt_dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_dept_cd_nm;

    @ElDtoField(logicalName = "req_dept_new_ymd", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "req_clsf_nm", physicalName = "req_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf_nm;

    @ElDtoField(logicalName = "supt_clsf_nm", physicalName = "supt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "cud_menu")
    public String getCud_menu(){
        return cud_menu;
    }

    @ElVoField(physicalName = "cud_menu")
    public void setCud_menu(String cud_menu){
        this.cud_menu = cud_menu;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
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

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "req_psn_no")
    public String getReq_psn_no(){
        return req_psn_no;
    }

    @ElVoField(physicalName = "req_psn_no")
    public void setReq_psn_no(String req_psn_no){
        this.req_psn_no = req_psn_no;
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

    @ElVoField(physicalName = "req_dept")
    public String getReq_dept(){
        return req_dept;
    }

    @ElVoField(physicalName = "req_dept")
    public void setReq_dept(String req_dept){
        this.req_dept = req_dept;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "complt_demnd_ymd")
    public String getComplt_demnd_ymd(){
        return complt_demnd_ymd;
    }

    @ElVoField(physicalName = "complt_demnd_ymd")
    public void setComplt_demnd_ymd(String complt_demnd_ymd){
        this.complt_demnd_ymd = complt_demnd_ymd;
    }

    @ElVoField(physicalName = "rcpt_psn_no")
    public String getRcpt_psn_no(){
        return rcpt_psn_no;
    }

    @ElVoField(physicalName = "rcpt_psn_no")
    public void setRcpt_psn_no(String rcpt_psn_no){
        this.rcpt_psn_no = rcpt_psn_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
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

    @ElVoField(physicalName = "rcpt_dept")
    public String getRcpt_dept(){
        return rcpt_dept;
    }

    @ElVoField(physicalName = "rcpt_dept")
    public void setRcpt_dept(String rcpt_dept){
        this.rcpt_dept = rcpt_dept;
    }

    @ElVoField(physicalName = "rcpt_dept_nm")
    public String getRcpt_dept_nm(){
        return rcpt_dept_nm;
    }

    @ElVoField(physicalName = "rcpt_dept_nm")
    public void setRcpt_dept_nm(String rcpt_dept_nm){
        this.rcpt_dept_nm = rcpt_dept_nm;
    }

    @ElVoField(physicalName = "impt_accnt_no")
    public String getImpt_accnt_no(){
        return impt_accnt_no;
    }

    @ElVoField(physicalName = "impt_accnt_no")
    public void setImpt_accnt_no(String impt_accnt_no){
        this.impt_accnt_no = impt_accnt_no;
    }

    @ElVoField(physicalName = "impt_accnt_no_nm")
    public String getImpt_accnt_no_nm(){
        return impt_accnt_no_nm;
    }

    @ElVoField(physicalName = "impt_accnt_no_nm")
    public void setImpt_accnt_no_nm(String impt_accnt_no_nm){
        this.impt_accnt_no_nm = impt_accnt_no_nm;
    }

    @ElVoField(physicalName = "impt_accnt_rspns")
    public String getImpt_accnt_rspns(){
        return impt_accnt_rspns;
    }

    @ElVoField(physicalName = "impt_accnt_rspns")
    public void setImpt_accnt_rspns(String impt_accnt_rspns){
        this.impt_accnt_rspns = impt_accnt_rspns;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_nm")
    public String getImpt_accnt_rspns_nm(){
        return impt_accnt_rspns_nm;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_nm")
    public void setImpt_accnt_rspns_nm(String impt_accnt_rspns_nm){
        this.impt_accnt_rspns_nm = impt_accnt_rspns_nm;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public String getSupt_respn_syspayno(){
        return supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public void setSupt_respn_syspayno(String supt_respn_syspayno){
        this.supt_respn_syspayno = supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public String getSupt_respn_nm(){
        return supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public void setSupt_respn_nm(String supt_respn_nm){
        this.supt_respn_nm = supt_respn_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        return bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_item_cd")
    public String getBugt_item_cd(){
        return bugt_item_cd;
    }

    @ElVoField(physicalName = "bugt_item_cd")
    public void setBugt_item_cd(String bugt_item_cd){
        this.bugt_item_cd = bugt_item_cd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "complt_ymd")
    public String getComplt_ymd(){
        return complt_ymd;
    }

    @ElVoField(physicalName = "complt_ymd")
    public void setComplt_ymd(String complt_ymd){
        this.complt_ymd = complt_ymd;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "use_usg")
    public String getUse_usg(){
        return use_usg;
    }

    @ElVoField(physicalName = "use_usg")
    public void setUse_usg(String use_usg){
        this.use_usg = use_usg;
    }

    @ElVoField(physicalName = "supt_detls_item")
    public String getSupt_detls_item(){
        return supt_detls_item;
    }

    @ElVoField(physicalName = "supt_detls_item")
    public void setSupt_detls_item(String supt_detls_item){
        this.supt_detls_item = supt_detls_item;
    }

    @ElVoField(physicalName = "supt_detls")
    public String getSupt_detls(){
        return supt_detls;
    }

    @ElVoField(physicalName = "supt_detls")
    public void setSupt_detls(String supt_detls){
        this.supt_detls = supt_detls;
    }

    @ElVoField(physicalName = "req_treat_qty")
    public String getReq_treat_qty(){
        return req_treat_qty;
    }

    @ElVoField(physicalName = "req_treat_qty")
    public void setReq_treat_qty(String req_treat_qty){
        this.req_treat_qty = req_treat_qty;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "req_odr")
    public String getReq_odr(){
        return req_odr;
    }

    @ElVoField(physicalName = "req_odr")
    public void setReq_odr(String req_odr){
        this.req_odr = req_odr;
    }

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

    @ElVoField(physicalName = "accnt_no_like")
    public String getAccnt_no_like(){
        return accnt_no_like;
    }

    @ElVoField(physicalName = "accnt_no_like")
    public void setAccnt_no_like(String accnt_no_like){
        this.accnt_no_like = accnt_no_like;
    }

    @ElVoField(physicalName = "impt_accnt_no_like")
    public String getImpt_accnt_no_like(){
        return impt_accnt_no_like;
    }

    @ElVoField(physicalName = "impt_accnt_no_like")
    public void setImpt_accnt_no_like(String impt_accnt_no_like){
        this.impt_accnt_no_like = impt_accnt_no_like;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public String getAccnt_rspns_dept_nm(){
        return accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public void setAccnt_rspns_dept_nm(String accnt_rspns_dept_nm){
        this.accnt_rspns_dept_nm = accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_dept_nm")
    public String getImpt_accnt_rspns_dept_nm(){
        return impt_accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "impt_accnt_rspns_dept_nm")
    public void setImpt_accnt_rspns_dept_nm(String impt_accnt_rspns_dept_nm){
        this.impt_accnt_rspns_dept_nm = impt_accnt_rspns_dept_nm;
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

    @ElVoField(physicalName = "trans_amt")
    public String getTrans_amt(){
        return trans_amt;
    }

    @ElVoField(physicalName = "trans_amt")
    public void setTrans_amt(String trans_amt){
        this.trans_amt = trans_amt;
    }

    @ElVoField(physicalName = "impt_tax_nm")
    public String getImpt_tax_nm(){
        return impt_tax_nm;
    }

    @ElVoField(physicalName = "impt_tax_nm")
    public void setImpt_tax_nm(String impt_tax_nm){
        this.impt_tax_nm = impt_tax_nm;
    }

    @ElVoField(physicalName = "rst_book_issu_yn")
    public String getRst_book_issu_yn(){
        return rst_book_issu_yn;
    }

    @ElVoField(physicalName = "rst_book_issu_yn")
    public void setRst_book_issu_yn(String rst_book_issu_yn){
        this.rst_book_issu_yn = rst_book_issu_yn;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public String getRcpt_psn_empno(){
        return rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public void setRcpt_psn_empno(String rcpt_psn_empno){
        this.rcpt_psn_empno = rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_dept_cd_nm")
    public String getRcpt_dept_cd_nm(){
        return rcpt_dept_cd_nm;
    }

    @ElVoField(physicalName = "rcpt_dept_cd_nm")
    public void setRcpt_dept_cd_nm(String rcpt_dept_cd_nm){
        this.rcpt_dept_cd_nm = rcpt_dept_cd_nm;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_clsf_nm")
    public String getReq_clsf_nm(){
        return req_clsf_nm;
    }

    @ElVoField(physicalName = "req_clsf_nm")
    public void setReq_clsf_nm(String req_clsf_nm){
        this.req_clsf_nm = req_clsf_nm;
    }

    @ElVoField(physicalName = "supt_clsf_nm")
    public String getSupt_clsf_nm(){
        return supt_clsf_nm;
    }

    @ElVoField(physicalName = "supt_clsf_nm")
    public void setSupt_clsf_nm(String supt_clsf_nm){
        this.supt_clsf_nm = supt_clsf_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSuphVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("cud_menu").append("=").append(cud_menu).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("req_psn_no").append("=").append(req_psn_no).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_dept").append("=").append(req_dept).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("complt_demnd_ymd").append("=").append(complt_demnd_ymd).append(",");
        sb.append("rcpt_psn_no").append("=").append(rcpt_psn_no).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("rcpt_psn").append("=").append(rcpt_psn).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("rcpt_dept").append("=").append(rcpt_dept).append(",");
        sb.append("rcpt_dept_nm").append("=").append(rcpt_dept_nm).append(",");
        sb.append("impt_accnt_no").append("=").append(impt_accnt_no).append(",");
        sb.append("impt_accnt_no_nm").append("=").append(impt_accnt_no_nm).append(",");
        sb.append("impt_accnt_rspns").append("=").append(impt_accnt_rspns).append(",");
        sb.append("impt_accnt_rspns_nm").append("=").append(impt_accnt_rspns_nm).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("supt_respn_syspayno").append("=").append(supt_respn_syspayno).append(",");
        sb.append("supt_respn_nm").append("=").append(supt_respn_nm).append(",");
        sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
        sb.append("bugt_item_cd").append("=").append(bugt_item_cd).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("complt_ymd").append("=").append(complt_ymd).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("ctrl_amt").append("=").append(ctrl_amt).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("use_usg").append("=").append(use_usg).append(",");
        sb.append("supt_detls_item").append("=").append(supt_detls_item).append(",");
        sb.append("supt_detls").append("=").append(supt_detls).append(",");
        sb.append("req_treat_qty").append("=").append(req_treat_qty).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("req_odr").append("=").append(req_odr).append(",");
        sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
        sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
        sb.append("complt_demnd_ymd_st").append("=").append(complt_demnd_ymd_st).append(",");
        sb.append("complt_demnd_ymd_ed").append("=").append(complt_demnd_ymd_ed).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_nm_like").append("=").append(req_psn_nm_like).append(",");
        sb.append("req_psn_empno_like").append("=").append(req_psn_empno_like).append(",");
        sb.append("rcpt_psn_syspayno").append("=").append(rcpt_psn_syspayno).append(",");
        sb.append("rcpt_psn_nm_like").append("=").append(rcpt_psn_nm_like).append(",");
        sb.append("rcpt_psn_empno_like").append("=").append(rcpt_psn_empno_like).append(",");
        sb.append("accnt_no_like").append("=").append(accnt_no_like).append(",");
        sb.append("impt_accnt_no_like").append("=").append(impt_accnt_no_like).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("accnt_rspns_dept_nm").append("=").append(accnt_rspns_dept_nm).append(",");
        sb.append("impt_accnt_rspns_dept_nm").append("=").append(impt_accnt_rspns_dept_nm).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("trans_amt").append("=").append(trans_amt).append(",");
        sb.append("impt_tax_nm").append("=").append(impt_tax_nm).append(",");
        sb.append("rst_book_issu_yn").append("=").append(rst_book_issu_yn).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("rcpt_psn_empno").append("=").append(rcpt_psn_empno).append(",");
        sb.append("rcpt_dept_cd_nm").append("=").append(rcpt_dept_cd_nm).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("req_clsf_nm").append("=").append(req_clsf_nm).append(",");
        sb.append("supt_clsf_nm").append("=").append(supt_clsf_nm);
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
