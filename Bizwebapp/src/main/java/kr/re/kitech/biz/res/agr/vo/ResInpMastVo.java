package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpMastExp")
public class ResInpMastVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResInpMastVo(){
    }

    @ElDtoField(logicalName = "prj_no", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "p_prj_no", physicalName = "p_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String p_prj_no;

    @ElDtoField(logicalName = "sch_prj_no", physicalName = "sch_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sch_prj_no;

    @ElDtoField(logicalName = "prj_no_seq", physicalName = "prj_no_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_seq;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "rspns_nm", physicalName = "rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rspns_nm;

    @ElDtoField(logicalName = "gov_cntrbamt", physicalName = "gov_cntrbamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gov_cntrbamt;

    @ElDtoField(logicalName = "cash", physicalName = "cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash;

    @ElDtoField(logicalName = "etc_cash", physicalName = "etc_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_cash;

    @ElDtoField(logicalName = "cmpy_goods", physicalName = "cmpy_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_goods;

    @ElDtoField(logicalName = "contpat_goods", physicalName = "contpat_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contpat_goods;

    @ElDtoField(logicalName = "col_sum", physicalName = "col_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String col_sum;

    @ElDtoField(logicalName = "cmpy_cash", physicalName = "cmpy_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_cash;

    @ElDtoField(logicalName = "univ_cash", physicalName = "univ_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String univ_cash;

    @ElDtoField(logicalName = "local_gov_cash", physicalName = "local_gov_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_gov_cash;

    @ElDtoField(logicalName = "large_prj_no", physicalName = "large_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String large_prj_no;

    @ElDtoField(logicalName = "bsns_cd_exclsv_agncy", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "prj_nm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "bsns_cd_inout", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "bsns_cd_inout_nm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "ntrm_clsf_nm", physicalName = "ntrm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntrm_clsf_nm;

    @ElDtoField(logicalName = "indst_tech_clsf_label", physicalName = "indst_tech_clsf_label", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf_label;

    @ElDtoField(logicalName = "sixt_relat_tech_nm", physicalName = "sixt_relat_tech_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sixt_relat_tech_nm;

    @ElDtoField(logicalName = "secrt_prj_ex", physicalName = "secrt_prj_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_ex;

    @ElDtoField(logicalName = "curr_resch_rspns", physicalName = "curr_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns;

    @ElDtoField(logicalName = "curr_resch_rspns_nm", physicalName = "curr_resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns_nm;

    @ElDtoField(logicalName = "step", physicalName = "step", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String step;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "bsns_req_no", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "prj_state_nm", physicalName = "prj_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state_nm;

    @ElDtoField(logicalName = "prj_state", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_rspns_nm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "thyr_yr_ymd", physicalName = "thyr_yr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_yr_ymd;

    @ElDtoField(logicalName = "thyr_yr_ymd2", physicalName = "thyr_yr_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_yr_ymd2;

    @ElDtoField(logicalName = "tot_yr_ymd", physicalName = "tot_yr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_yr_ymd;

    @ElDtoField(logicalName = "bsns_cd_bsns_nm", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "bsns_cd_detls_bsns_nm", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "bsns_cd_ofic_nm", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "prj_eng_nm", physicalName = "prj_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_eng_nm;

    @ElDtoField(logicalName = "tab_id", physicalName = "tab_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tab_id;

    @ElDtoField(logicalName = "bsns_req_no_plan", physicalName = "bsns_req_no_plan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no_plan;

    @ElDtoField(logicalName = "anal", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;

    @ElDtoField(logicalName = "chng_item", physicalName = "chng_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_item;

    @ElDtoField(logicalName = "sch_equip_odr", physicalName = "sch_equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sch_equip_odr;

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "p_prj_no")
    public String getP_prj_no(){
        return p_prj_no;
    }

    @ElVoField(physicalName = "p_prj_no")
    public void setP_prj_no(String p_prj_no){
        this.p_prj_no = p_prj_no;
    }

    @ElVoField(physicalName = "sch_prj_no")
    public String getSch_prj_no(){
        return sch_prj_no;
    }

    @ElVoField(physicalName = "sch_prj_no")
    public void setSch_prj_no(String sch_prj_no){
        this.sch_prj_no = sch_prj_no;
    }

    @ElVoField(physicalName = "prj_no_seq")
    public String getPrj_no_seq(){
        return prj_no_seq;
    }

    @ElVoField(physicalName = "prj_no_seq")
    public void setPrj_no_seq(String prj_no_seq){
        this.prj_no_seq = prj_no_seq;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "rspns_nm")
    public String getRspns_nm(){
        return rspns_nm;
    }

    @ElVoField(physicalName = "rspns_nm")
    public void setRspns_nm(String rspns_nm){
        this.rspns_nm = rspns_nm;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public String getGov_cntrbamt(){
        return gov_cntrbamt;
    }

    @ElVoField(physicalName = "gov_cntrbamt")
    public void setGov_cntrbamt(String gov_cntrbamt){
        this.gov_cntrbamt = gov_cntrbamt;
    }

    @ElVoField(physicalName = "cash")
    public String getCash(){
        return cash;
    }

    @ElVoField(physicalName = "cash")
    public void setCash(String cash){
        this.cash = cash;
    }

    @ElVoField(physicalName = "etc_cash")
    public String getEtc_cash(){
        return etc_cash;
    }

    @ElVoField(physicalName = "etc_cash")
    public void setEtc_cash(String etc_cash){
        this.etc_cash = etc_cash;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public String getCmpy_goods(){
        return cmpy_goods;
    }

    @ElVoField(physicalName = "cmpy_goods")
    public void setCmpy_goods(String cmpy_goods){
        this.cmpy_goods = cmpy_goods;
    }

    @ElVoField(physicalName = "contpat_goods")
    public String getContpat_goods(){
        return contpat_goods;
    }

    @ElVoField(physicalName = "contpat_goods")
    public void setContpat_goods(String contpat_goods){
        this.contpat_goods = contpat_goods;
    }

    @ElVoField(physicalName = "col_sum")
    public String getCol_sum(){
        return col_sum;
    }

    @ElVoField(physicalName = "col_sum")
    public void setCol_sum(String col_sum){
        this.col_sum = col_sum;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public String getCmpy_cash(){
        return cmpy_cash;
    }

    @ElVoField(physicalName = "cmpy_cash")
    public void setCmpy_cash(String cmpy_cash){
        this.cmpy_cash = cmpy_cash;
    }

    @ElVoField(physicalName = "univ_cash")
    public String getUniv_cash(){
        return univ_cash;
    }

    @ElVoField(physicalName = "univ_cash")
    public void setUniv_cash(String univ_cash){
        this.univ_cash = univ_cash;
    }

    @ElVoField(physicalName = "local_gov_cash")
    public String getLocal_gov_cash(){
        return local_gov_cash;
    }

    @ElVoField(physicalName = "local_gov_cash")
    public void setLocal_gov_cash(String local_gov_cash){
        this.local_gov_cash = local_gov_cash;
    }

    @ElVoField(physicalName = "large_prj_no")
    public String getLarge_prj_no(){
        return large_prj_no;
    }

    @ElVoField(physicalName = "large_prj_no")
    public void setLarge_prj_no(String large_prj_no){
        this.large_prj_no = large_prj_no;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
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

    @ElVoField(physicalName = "ntrm_clsf_nm")
    public String getNtrm_clsf_nm(){
        return ntrm_clsf_nm;
    }

    @ElVoField(physicalName = "ntrm_clsf_nm")
    public void setNtrm_clsf_nm(String ntrm_clsf_nm){
        this.ntrm_clsf_nm = ntrm_clsf_nm;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label")
    public String getIndst_tech_clsf_label(){
        return indst_tech_clsf_label;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label")
    public void setIndst_tech_clsf_label(String indst_tech_clsf_label){
        this.indst_tech_clsf_label = indst_tech_clsf_label;
    }

    @ElVoField(physicalName = "sixt_relat_tech_nm")
    public String getSixt_relat_tech_nm(){
        return sixt_relat_tech_nm;
    }

    @ElVoField(physicalName = "sixt_relat_tech_nm")
    public void setSixt_relat_tech_nm(String sixt_relat_tech_nm){
        this.sixt_relat_tech_nm = sixt_relat_tech_nm;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public String getSecrt_prj_ex(){
        return secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public void setSecrt_prj_ex(String secrt_prj_ex){
        this.secrt_prj_ex = secrt_prj_ex;
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

    @ElVoField(physicalName = "step")
    public String getStep(){
        return step;
    }

    @ElVoField(physicalName = "step")
    public void setStep(String step){
        this.step = step;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "prj_state_nm")
    public String getPrj_state_nm(){
        return prj_state_nm;
    }

    @ElVoField(physicalName = "prj_state_nm")
    public void setPrj_state_nm(String prj_state_nm){
        this.prj_state_nm = prj_state_nm;
    }

    @ElVoField(physicalName = "prj_state")
    public String getPrj_state(){
        return prj_state;
    }

    @ElVoField(physicalName = "prj_state")
    public void setPrj_state(String prj_state){
        this.prj_state = prj_state;
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

    @ElVoField(physicalName = "thyr_yr_ymd")
    public String getThyr_yr_ymd(){
        return thyr_yr_ymd;
    }

    @ElVoField(physicalName = "thyr_yr_ymd")
    public void setThyr_yr_ymd(String thyr_yr_ymd){
        this.thyr_yr_ymd = thyr_yr_ymd;
    }

    @ElVoField(physicalName = "thyr_yr_ymd2")
    public String getThyr_yr_ymd2(){
        return thyr_yr_ymd2;
    }

    @ElVoField(physicalName = "thyr_yr_ymd2")
    public void setThyr_yr_ymd2(String thyr_yr_ymd2){
        this.thyr_yr_ymd2 = thyr_yr_ymd2;
    }

    @ElVoField(physicalName = "tot_yr_ymd")
    public String getTot_yr_ymd(){
        return tot_yr_ymd;
    }

    @ElVoField(physicalName = "tot_yr_ymd")
    public void setTot_yr_ymd(String tot_yr_ymd){
        this.tot_yr_ymd = tot_yr_ymd;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public String getBsns_cd_bsns_nm(){
        return bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public void setBsns_cd_bsns_nm(String bsns_cd_bsns_nm){
        this.bsns_cd_bsns_nm = bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "prj_eng_nm")
    public String getPrj_eng_nm(){
        return prj_eng_nm;
    }

    @ElVoField(physicalName = "prj_eng_nm")
    public void setPrj_eng_nm(String prj_eng_nm){
        this.prj_eng_nm = prj_eng_nm;
    }

    @ElVoField(physicalName = "tab_id")
    public String getTab_id(){
        return tab_id;
    }

    @ElVoField(physicalName = "tab_id")
    public void setTab_id(String tab_id){
        this.tab_id = tab_id;
    }

    @ElVoField(physicalName = "bsns_req_no_plan")
    public String getBsns_req_no_plan(){
        return bsns_req_no_plan;
    }

    @ElVoField(physicalName = "bsns_req_no_plan")
    public void setBsns_req_no_plan(String bsns_req_no_plan){
        this.bsns_req_no_plan = bsns_req_no_plan;
    }

    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "chng_item")
    public String getChng_item(){
        return chng_item;
    }

    @ElVoField(physicalName = "chng_item")
    public void setChng_item(String chng_item){
        this.chng_item = chng_item;
    }

    @ElVoField(physicalName = "sch_equip_odr")
    public String getSch_equip_odr(){
        return sch_equip_odr;
    }

    @ElVoField(physicalName = "sch_equip_odr")
    public void setSch_equip_odr(String sch_equip_odr){
        this.sch_equip_odr = sch_equip_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResInpMastVo [");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("p_prj_no").append("=").append(p_prj_no).append(",");
        sb.append("sch_prj_no").append("=").append(sch_prj_no).append(",");
        sb.append("prj_no_seq").append("=").append(prj_no_seq).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("rspns_nm").append("=").append(rspns_nm).append(",");
        sb.append("gov_cntrbamt").append("=").append(gov_cntrbamt).append(",");
        sb.append("cash").append("=").append(cash).append(",");
        sb.append("etc_cash").append("=").append(etc_cash).append(",");
        sb.append("cmpy_goods").append("=").append(cmpy_goods).append(",");
        sb.append("contpat_goods").append("=").append(contpat_goods).append(",");
        sb.append("col_sum").append("=").append(col_sum).append(",");
        sb.append("cmpy_cash").append("=").append(cmpy_cash).append(",");
        sb.append("univ_cash").append("=").append(univ_cash).append(",");
        sb.append("local_gov_cash").append("=").append(local_gov_cash).append(",");
        sb.append("large_prj_no").append("=").append(large_prj_no).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("ntrm_clsf_nm").append("=").append(ntrm_clsf_nm).append(",");
        sb.append("indst_tech_clsf_label").append("=").append(indst_tech_clsf_label).append(",");
        sb.append("sixt_relat_tech_nm").append("=").append(sixt_relat_tech_nm).append(",");
        sb.append("secrt_prj_ex").append("=").append(secrt_prj_ex).append(",");
        sb.append("curr_resch_rspns").append("=").append(curr_resch_rspns).append(",");
        sb.append("curr_resch_rspns_nm").append("=").append(curr_resch_rspns_nm).append(",");
        sb.append("step").append("=").append(step).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("prj_state_nm").append("=").append(prj_state_nm).append(",");
        sb.append("prj_state").append("=").append(prj_state).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("thyr_yr_ymd").append("=").append(thyr_yr_ymd).append(",");
        sb.append("thyr_yr_ymd2").append("=").append(thyr_yr_ymd2).append(",");
        sb.append("tot_yr_ymd").append("=").append(tot_yr_ymd).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("prj_eng_nm").append("=").append(prj_eng_nm).append(",");
        sb.append("tab_id").append("=").append(tab_id).append(",");
        sb.append("bsns_req_no_plan").append("=").append(bsns_req_no_plan).append(",");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("chng_item").append("=").append(chng_item).append(",");
        sb.append("sch_equip_odr").append("=").append(sch_equip_odr);
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
