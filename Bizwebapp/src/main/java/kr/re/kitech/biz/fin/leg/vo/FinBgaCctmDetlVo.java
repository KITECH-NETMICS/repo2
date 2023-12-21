package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResBgaCctmExp")
public class FinBgaCctmDetlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinBgaCctmDetlVo(){
    }

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "relatNo", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "taxCd", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "accntClsf", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "accntState", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "date", physicalName = "date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "progressTmp", physicalName = "progress_tmp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress_tmp;

    @ElDtoField(logicalName = "progress", physicalName = "progress", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String progress;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "attnceAgncy", physicalName = "attnce_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_agncy;

    @ElDtoField(logicalName = "bsnsCdExclsvAgncy", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "itmSolveBase", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "accntCdAbbr", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "ramtMngmt1", physicalName = "ramt_mngmt_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_1;

    @ElDtoField(logicalName = "ramtMngmt2", physicalName = "ramt_mngmt_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_2;

    @ElDtoField(logicalName = "ramtMngmt3", physicalName = "ramt_mngmt_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_3;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "drAmt", physicalName = "dr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dr_amt;

    @ElDtoField(logicalName = "crAmt", physicalName = "cr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr_amt;

    @ElDtoField(logicalName = "janAmt", physicalName = "jan_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jan_amt;

    @ElDtoField(logicalName = "accntMm", physicalName = "accnt_mm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_mm;

    @ElDtoField(logicalName = "slipNo", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "slipOdr", physicalName = "slip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_odr;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr;

    @ElDtoField(logicalName = "slipNoOdr", physicalName = "slip_no_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no_odr;

    @ElDtoField(logicalName = "rmk1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "rmk2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "expnsCdNm", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flag;

    @ElDtoField(logicalName = "ramAmt", physicalName = "ram_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ram_amt;

    @ElDtoField(logicalName = "vend_abbr", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "yrmon", physicalName = "yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yrmon;

    @ElDtoField(logicalName = "accnt_rspns_nm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "accnt_rspns_dept_nm", physicalName = "accnt_rspns_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_dept_nm;

    @ElDtoField(logicalName = "unslip_amt", physicalName = "unslip_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_amt;

    @ElDtoField(logicalName = "itm_clsf", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "bugt_ctrl_psn", physicalName = "bugt_ctrl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_psn;

    @ElDtoField(logicalName = "selr_code2", physicalName = "selr_code2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code2;

    @ElDtoField(logicalName = "evid_nm", physicalName = "evid_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_nm;

    @ElDtoField(logicalName = "evid_day", physicalName = "evid_day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_day;

    @ElDtoField(logicalName = "supply_amt", physicalName = "supply_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supply_amt;

    @ElDtoField(logicalName = "trans_unslip_no", physicalName = "trans_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_unslip_no;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "up_dept", physicalName = "up_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String up_dept;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "bsns_nm", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "prj_nm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "tot_resch_prd_cls_ymd", physicalName = "tot_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_cls_ymd;

    @ElDtoField(logicalName = "main_accnt_no", physicalName = "main_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_accnt_no;

    @ElDtoField(logicalName = "gov_cntrbamt", physicalName = "gov_cntrbamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gov_cntrbamt;

    @ElDtoField(logicalName = "cmpy_cash", physicalName = "cmpy_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_cash;

    @ElDtoField(logicalName = "cmpy_goods", physicalName = "cmpy_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_goods;

    @ElDtoField(logicalName = "agree_amt", physicalName = "agree_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agree_amt;

    @ElDtoField(logicalName = "schdl_amt", physicalName = "schdl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String schdl_amt;

    @ElDtoField(logicalName = "enfrc_amt", physicalName = "enfrc_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enfrc_amt;

    @ElDtoField(logicalName = "mngmt_item_1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "mngmt_item_2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "won_occr_amt", physicalName = "won_occr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String won_occr_amt;

    @ElDtoField(logicalName = "won_adjst_amt", physicalName = "won_adjst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String won_adjst_amt;

    @ElDtoField(logicalName = "pre_amt", physicalName = "pre_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_amt;

    @ElDtoField(logicalName = "slipYmd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "slipYymm", physicalName = "slip_yymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_yymm;

    @ElDtoField(logicalName = "gubunAccntCd", physicalName = "gubun_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubun_accnt_cd;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "date")
    public String getDate(){
        return date;
    }

    @ElVoField(physicalName = "date")
    public void setDate(String date){
        this.date = date;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "progress_tmp")
    public String getProgress_tmp(){
        return progress_tmp;
    }

    @ElVoField(physicalName = "progress_tmp")
    public void setProgress_tmp(String progress_tmp){
        this.progress_tmp = progress_tmp;
    }

    @ElVoField(physicalName = "progress")
    public String getProgress(){
        return progress;
    }

    @ElVoField(physicalName = "progress")
    public void setProgress(String progress){
        this.progress = progress;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "attnce_agncy")
    public String getAttnce_agncy(){
        return attnce_agncy;
    }

    @ElVoField(physicalName = "attnce_agncy")
    public void setAttnce_agncy(String attnce_agncy){
        this.attnce_agncy = attnce_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public String getRamt_mngmt_1(){
        return ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public void setRamt_mngmt_1(String ramt_mngmt_1){
        this.ramt_mngmt_1 = ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public String getRamt_mngmt_2(){
        return ramt_mngmt_2;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public void setRamt_mngmt_2(String ramt_mngmt_2){
        this.ramt_mngmt_2 = ramt_mngmt_2;
    }

    @ElVoField(physicalName = "ramt_mngmt_3")
    public String getRamt_mngmt_3(){
        return ramt_mngmt_3;
    }

    @ElVoField(physicalName = "ramt_mngmt_3")
    public void setRamt_mngmt_3(String ramt_mngmt_3){
        this.ramt_mngmt_3 = ramt_mngmt_3;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "dr_amt")
    public String getDr_amt(){
        return dr_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public void setDr_amt(String dr_amt){
        this.dr_amt = dr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public String getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(String cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "jan_amt")
    public String getJan_amt(){
        return jan_amt;
    }

    @ElVoField(physicalName = "jan_amt")
    public void setJan_amt(String jan_amt){
        this.jan_amt = jan_amt;
    }

    @ElVoField(physicalName = "accnt_mm")
    public String getAccnt_mm(){
        return accnt_mm;
    }

    @ElVoField(physicalName = "accnt_mm")
    public void setAccnt_mm(String accnt_mm){
        this.accnt_mm = accnt_mm;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public String getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(String slip_odr){
        this.slip_odr = slip_odr;
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

    @ElVoField(physicalName = "slip_no_odr")
    public String getSlip_no_odr(){
        return slip_no_odr;
    }

    @ElVoField(physicalName = "slip_no_odr")
    public void setSlip_no_odr(String slip_no_odr){
        this.slip_no_odr = slip_no_odr;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
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

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        return flag;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "ram_amt")
    public String getRam_amt(){
        return ram_amt;
    }

    @ElVoField(physicalName = "ram_amt")
    public void setRam_amt(String ram_amt){
        this.ram_amt = ram_amt;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "yrmon")
    public String getYrmon(){
        return yrmon;
    }

    @ElVoField(physicalName = "yrmon")
    public void setYrmon(String yrmon){
        this.yrmon = yrmon;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public String getAccnt_rspns_dept_nm(){
        return accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_dept_nm")
    public void setAccnt_rspns_dept_nm(String accnt_rspns_dept_nm){
        this.accnt_rspns_dept_nm = accnt_rspns_dept_nm;
    }

    @ElVoField(physicalName = "unslip_amt")
    public String getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(String unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public String getBugt_ctrl_psn(){
        return bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "bugt_ctrl_psn")
    public void setBugt_ctrl_psn(String bugt_ctrl_psn){
        this.bugt_ctrl_psn = bugt_ctrl_psn;
    }

    @ElVoField(physicalName = "selr_code2")
    public String getSelr_code2(){
        return selr_code2;
    }

    @ElVoField(physicalName = "selr_code2")
    public void setSelr_code2(String selr_code2){
        this.selr_code2 = selr_code2;
    }

    @ElVoField(physicalName = "evid_nm")
    public String getEvid_nm(){
        return evid_nm;
    }

    @ElVoField(physicalName = "evid_nm")
    public void setEvid_nm(String evid_nm){
        this.evid_nm = evid_nm;
    }

    @ElVoField(physicalName = "evid_day")
    public String getEvid_day(){
        return evid_day;
    }

    @ElVoField(physicalName = "evid_day")
    public void setEvid_day(String evid_day){
        this.evid_day = evid_day;
    }

    @ElVoField(physicalName = "supply_amt")
    public String getSupply_amt(){
        return supply_amt;
    }

    @ElVoField(physicalName = "supply_amt")
    public void setSupply_amt(String supply_amt){
        this.supply_amt = supply_amt;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public String getTrans_unslip_no(){
        return trans_unslip_no;
    }

    @ElVoField(physicalName = "trans_unslip_no")
    public void setTrans_unslip_no(String trans_unslip_no){
        this.trans_unslip_no = trans_unslip_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "up_dept")
    public String getUp_dept(){
        return up_dept;
    }

    @ElVoField(physicalName = "up_dept")
    public void setUp_dept(String up_dept){
        this.up_dept = up_dept;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public String getTot_resch_prd_cls_ymd(){
        return tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public void setTot_resch_prd_cls_ymd(String tot_resch_prd_cls_ymd){
        this.tot_resch_prd_cls_ymd = tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public String getMain_accnt_no(){
        return main_accnt_no;
    }

    @ElVoField(physicalName = "main_accnt_no")
    public void setMain_accnt_no(String main_accnt_no){
        this.main_accnt_no = main_accnt_no;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public String getGov_cntrbamt(){
        return gov_cntrbamt;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public void setGov_cntrbamt(String gov_cntrbamt){
        this.gov_cntrbamt = gov_cntrbamt;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public String getCmpy_cash(){
        return cmpy_cash;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public void setCmpy_cash(String cmpy_cash){
        this.cmpy_cash = cmpy_cash;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public String getCmpy_goods(){
        return cmpy_goods;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public void setCmpy_goods(String cmpy_goods){
        this.cmpy_goods = cmpy_goods;
    }

    @ElVoField(physicalName = "agree_amt")
    public String getAgree_amt(){
        return agree_amt;
    }

    @ElVoField(physicalName = "agree_amt")
    public void setAgree_amt(String agree_amt){
        this.agree_amt = agree_amt;
    }

    @ElVoField(physicalName = "schdl_amt")
    public String getSchdl_amt(){
        return schdl_amt;
    }

    @ElVoField(physicalName = "schdl_amt")
    public void setSchdl_amt(String schdl_amt){
        this.schdl_amt = schdl_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public String getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(String enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public String getWon_occr_amt(){
        return won_occr_amt;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public void setWon_occr_amt(String won_occr_amt){
        this.won_occr_amt = won_occr_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public String getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(String won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "pre_amt")
    public String getPre_amt(){
        return pre_amt;
    }

    @ElVoField(physicalName = "pre_amt")
    public void setPre_amt(String pre_amt){
        this.pre_amt = pre_amt;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "slip_yymm")
    public String getSlip_yymm(){
        return slip_yymm;
    }

    @ElVoField(physicalName = "slip_yymm")
    public void setSlip_yymm(String slip_yymm){
        this.slip_yymm = slip_yymm;
    }

    @ElVoField(physicalName = "gubun_accnt_cd")
    public String getGubun_accnt_cd(){
        return gubun_accnt_cd;
    }

    @ElVoField(physicalName = "gubun_accnt_cd")
    public void setGubun_accnt_cd(String gubun_accnt_cd){
        this.gubun_accnt_cd = gubun_accnt_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinBgaCctmDetlVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("date").append("=").append(date).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("progress_tmp").append("=").append(progress_tmp).append(",");
        sb.append("progress").append("=").append(progress).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("attnce_agncy").append("=").append(attnce_agncy).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("ramt_mngmt_1").append("=").append(ramt_mngmt_1).append(",");
        sb.append("ramt_mngmt_2").append("=").append(ramt_mngmt_2).append(",");
        sb.append("ramt_mngmt_3").append("=").append(ramt_mngmt_3).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("dr_amt").append("=").append(dr_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("jan_amt").append("=").append(jan_amt).append(",");
        sb.append("accnt_mm").append("=").append(accnt_mm).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("slip_no_odr").append("=").append(slip_no_odr).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("ram_amt").append("=").append(ram_amt).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("yrmon").append("=").append(yrmon).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_rspns_dept_nm").append("=").append(accnt_rspns_dept_nm).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("bugt_ctrl_psn").append("=").append(bugt_ctrl_psn).append(",");
        sb.append("selr_code2").append("=").append(selr_code2).append(",");
        sb.append("evid_nm").append("=").append(evid_nm).append(",");
        sb.append("evid_day").append("=").append(evid_day).append(",");
        sb.append("supply_amt").append("=").append(supply_amt).append(",");
        sb.append("trans_unslip_no").append("=").append(trans_unslip_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("up_dept").append("=").append(up_dept).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("tot_resch_prd_cls_ymd").append("=").append(tot_resch_prd_cls_ymd).append(",");
        sb.append("main_accnt_no").append("=").append(main_accnt_no).append(",");
        sb.append("gov_cntrbamt").append("=").append(gov_cntrbamt).append(",");
        sb.append("cmpy_cash").append("=").append(cmpy_cash).append(",");
        sb.append("cmpy_goods").append("=").append(cmpy_goods).append(",");
        sb.append("agree_amt").append("=").append(agree_amt).append(",");
        sb.append("schdl_amt").append("=").append(schdl_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("won_occr_amt").append("=").append(won_occr_amt).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("pre_amt").append("=").append(pre_amt).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("slip_yymm").append("=").append(slip_yymm).append(",");
        sb.append("gubun_accnt_cd").append("=").append(gubun_accnt_cd);
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
