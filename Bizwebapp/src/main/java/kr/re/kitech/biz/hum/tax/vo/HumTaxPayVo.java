package kr.re.kitech.biz.hum.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumAnaUserInfo")
public class HumTaxPayVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumTaxPayVo(){
    }

    @ElDtoField(logicalName = "belngYr", physicalName = "belng_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yr;

    @ElDtoField(logicalName = "belngYrmon", physicalName = "belng_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "paySum", physicalName = "pay_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_sum;

    @ElDtoField(logicalName = "fretaxAmtMeal", physicalName = "fretax_amt_meal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_amt_meal;

    @ElDtoField(logicalName = "fretaxAmtResearch", physicalName = "fretax_amt_research", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_amt_research;

    @ElDtoField(logicalName = "incomtax", physicalName = "incomtax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incomtax;

    @ElDtoField(logicalName = "residtax", physicalName = "residtax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String residtax;

    @ElDtoField(logicalName = "taxSum", physicalName = "tax_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_sum;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "residNo", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "adjstYr", physicalName = "adjst_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_yr;

    @ElDtoField(logicalName = "adjstCd", physicalName = "adjst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_cd;

    @ElDtoField(logicalName = "adjstClsf", physicalName = "adjst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_clsf;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "userDiv", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "entrYmd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "retireYmd", physicalName = "retire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_ymd;

    @ElDtoField(logicalName = "workClsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "dutyCd", physicalName = "duty_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_cd;

    @ElDtoField(logicalName = "dutyNm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "yrlyWorkIncom", physicalName = "yrly_work_incom", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yrly_work_incom;

    @ElDtoField(logicalName = "fretaxSum", physicalName = "fretax_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_sum;

    @ElDtoField(logicalName = "totSalry", physicalName = "tot_salry", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_salry;

    @ElDtoField(logicalName = "workIncomDedct", physicalName = "work_incom_dedct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_incom_dedct;

    @ElDtoField(logicalName = "workIncomAmt", physicalName = "work_incom_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_incom_amt;

    @ElDtoField(logicalName = "humanDedctSum", physicalName = "human_dedct_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String human_dedct_sum;

    @ElDtoField(logicalName = "anutyInsrSum", physicalName = "anuty_insr_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anuty_insr_sum;

    @ElDtoField(logicalName = "spclDedctSum", physicalName = "spcl_dedct_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spcl_dedct_sum;

    @ElDtoField(logicalName = "etcDedctSum", physicalName = "etc_dedct_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_dedct_sum;

    @ElDtoField(logicalName = "overlTaxStd", physicalName = "overl_tax_std", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String overl_tax_std;

    @ElDtoField(logicalName = "taxRts", physicalName = "tax_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_rts;

    @ElDtoField(logicalName = "calcTaxamt", physicalName = "calc_taxamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String calc_taxamt;

    @ElDtoField(logicalName = "taxamtDedctSum", physicalName = "taxamt_dedct_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String taxamt_dedct_sum;

    @ElDtoField(logicalName = "decsnTaxamt", physicalName = "decsn_taxamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_taxamt;

    @ElDtoField(logicalName = "incomtax1", physicalName = "incomtax_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incomtax_1;

    @ElDtoField(logicalName = "residtax1", physicalName = "residtax_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String residtax_1;

    @ElDtoField(logicalName = "decsnTaxamt1", physicalName = "decsn_taxamt_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_taxamt_1;

    @ElDtoField(logicalName = "colctIncomtax", physicalName = "colct_incomtax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String colct_incomtax;

    @ElDtoField(logicalName = "colctResidtax", physicalName = "colct_residtax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String colct_residtax;

    @ElDtoField(logicalName = "decsnColctTaxamt", physicalName = "decsn_colct_taxamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_colct_taxamt;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "occugrpNm", physicalName = "occugrp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_nm;

    @ElDtoField(logicalName = "adjstClsfNm", physicalName = "adjst_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_clsf_nm;

    @ElDtoField(logicalName = "workLandNm", physicalName = "work_land_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_land_nm;

    @ElDtoField(logicalName = "workClsfNm", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "retireYy", physicalName = "retire_yy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_yy;

    @ElDtoField(logicalName = "occutypNm", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "incomSum", physicalName = "incom_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incom_sum;

    @ElDtoField(logicalName = "fretaxOverseaWork", physicalName = "fretax_oversea_work", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_oversea_work;

    @ElDtoField(logicalName = "fretaxGivbirthChildcr", physicalName = "fretax_givbirth_childcr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_givbirth_childcr;

    @ElDtoField(logicalName = "fretaxReschActn", physicalName = "fretax_resch_actn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_resch_actn;

    @ElDtoField(logicalName = "fretaxEtc", physicalName = "fretax_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_etc;

    @ElDtoField(logicalName = "fretaxExpsOffer", physicalName = "fretax_exps_offer", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_exps_offer;

    @ElDtoField(logicalName = "incomtax3", physicalName = "incomtax_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incomtax_3;

    @ElDtoField(logicalName = "residtax3", physicalName = "residtax_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String residtax_3;

    @ElDtoField(logicalName = "overseaWork3", physicalName = "oversea_work_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oversea_work_3;

    @ElDtoField(logicalName = "givbirthExtra3", physicalName = "givbirth_extra_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String givbirth_extra_3;

    @ElDtoField(logicalName = "reschOrgn3", physicalName = "resch_orgn_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_orgn_3;

    @ElDtoField(logicalName = "etc3", physicalName = "etc_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_3;

    @ElDtoField(logicalName = "fretaxWorkIncom3", physicalName = "fretax_work_incom_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_work_incom_3;

    @ElDtoField(logicalName = "incomtax13", physicalName = "incomtax_1_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incomtax_1_3;

    @ElDtoField(logicalName = "totSalrySum", physicalName = "tot_salry_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_salry_sum;

    @ElDtoField(logicalName = "incomtax2", physicalName = "incomtax_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String incomtax_2;

    @ElDtoField(logicalName = "residtax2", physicalName = "residtax_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String residtax_2;

    @ElDtoField(logicalName = "insrSum", physicalName = "insr_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insr_sum;

    @ElDtoField(logicalName = "yearSalamt501", physicalName = "year_salamt_501", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_501;

    @ElDtoField(logicalName = "yearSalamt503", physicalName = "year_salamt_503", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_503;

    @ElDtoField(logicalName = "yearSalamt504", physicalName = "year_salamt_504", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_504;

    @ElDtoField(logicalName = "yearSalamt517", physicalName = "year_salamt_517", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_517;

    @ElDtoField(logicalName = "yearSalamt551", physicalName = "year_salamt_551", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_551;

    @ElDtoField(logicalName = "yearSalamt802", physicalName = "year_salamt_802", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_802;

    @ElDtoField(logicalName = "yearSalamt803", physicalName = "year_salamt_803", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_803;

    @ElDtoField(logicalName = "yearSalamt804", physicalName = "year_salamt_804", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_804;

    @ElDtoField(logicalName = "yearSalamt818", physicalName = "year_salamt_818", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_salamt_818;

    @ElDtoField(logicalName = "searchGubun", physicalName = "searchGubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String searchGubun;

    @ElVoField(physicalName = "belng_yr")
    public String getBelng_yr(){
        return belng_yr;
    }

    @ElVoField(physicalName = "belng_yr")
    public void setBelng_yr(String belng_yr){
        this.belng_yr = belng_yr;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public String getBelng_yrmon(){
        return belng_yrmon;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public void setBelng_yrmon(String belng_yrmon){
        this.belng_yrmon = belng_yrmon;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "pay_sum")
    public String getPay_sum(){
        return pay_sum;
    }

    @ElVoField(physicalName = "pay_sum")
    public void setPay_sum(String pay_sum){
        this.pay_sum = pay_sum;
    }

    @ElVoField(physicalName = "fretax_amt_meal")
    public String getFretax_amt_meal(){
        return fretax_amt_meal;
    }

    @ElVoField(physicalName = "fretax_amt_meal")
    public void setFretax_amt_meal(String fretax_amt_meal){
        this.fretax_amt_meal = fretax_amt_meal;
    }

    @ElVoField(physicalName = "fretax_amt_research")
    public String getFretax_amt_research(){
        return fretax_amt_research;
    }

    @ElVoField(physicalName = "fretax_amt_research")
    public void setFretax_amt_research(String fretax_amt_research){
        this.fretax_amt_research = fretax_amt_research;
    }

    @ElVoField(physicalName = "incomtax")
    public String getIncomtax(){
        return incomtax;
    }

    @ElVoField(physicalName = "incomtax")
    public void setIncomtax(String incomtax){
        this.incomtax = incomtax;
    }

    @ElVoField(physicalName = "residtax")
    public String getResidtax(){
        return residtax;
    }

    @ElVoField(physicalName = "residtax")
    public void setResidtax(String residtax){
        this.residtax = residtax;
    }

    @ElVoField(physicalName = "tax_sum")
    public String getTax_sum(){
        return tax_sum;
    }

    @ElVoField(physicalName = "tax_sum")
    public void setTax_sum(String tax_sum){
        this.tax_sum = tax_sum;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "adjst_yr")
    public String getAdjst_yr(){
        return adjst_yr;
    }

    @ElVoField(physicalName = "adjst_yr")
    public void setAdjst_yr(String adjst_yr){
        this.adjst_yr = adjst_yr;
    }

    @ElVoField(physicalName = "adjst_cd")
    public String getAdjst_cd(){
        return adjst_cd;
    }

    @ElVoField(physicalName = "adjst_cd")
    public void setAdjst_cd(String adjst_cd){
        this.adjst_cd = adjst_cd;
    }

    @ElVoField(physicalName = "adjst_clsf")
    public String getAdjst_clsf(){
        return adjst_clsf;
    }

    @ElVoField(physicalName = "adjst_clsf")
    public void setAdjst_clsf(String adjst_clsf){
        this.adjst_clsf = adjst_clsf;
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

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public String getRetire_ymd(){
        return retire_ymd;
    }

    @ElVoField(physicalName = "retire_ymd")
    public void setRetire_ymd(String retire_ymd){
        this.retire_ymd = retire_ymd;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
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

    @ElVoField(physicalName = "duty_cd")
    public String getDuty_cd(){
        return duty_cd;
    }

    @ElVoField(physicalName = "duty_cd")
    public void setDuty_cd(String duty_cd){
        this.duty_cd = duty_cd;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "yrly_work_incom")
    public String getYrly_work_incom(){
        return yrly_work_incom;
    }

    @ElVoField(physicalName = "yrly_work_incom")
    public void setYrly_work_incom(String yrly_work_incom){
        this.yrly_work_incom = yrly_work_incom;
    }

    @ElVoField(physicalName = "fretax_sum")
    public String getFretax_sum(){
        return fretax_sum;
    }

    @ElVoField(physicalName = "fretax_sum")
    public void setFretax_sum(String fretax_sum){
        this.fretax_sum = fretax_sum;
    }

    @ElVoField(physicalName = "tot_salry")
    public String getTot_salry(){
        return tot_salry;
    }

    @ElVoField(physicalName = "tot_salry")
    public void setTot_salry(String tot_salry){
        this.tot_salry = tot_salry;
    }

    @ElVoField(physicalName = "work_incom_dedct")
    public String getWork_incom_dedct(){
        return work_incom_dedct;
    }

    @ElVoField(physicalName = "work_incom_dedct")
    public void setWork_incom_dedct(String work_incom_dedct){
        this.work_incom_dedct = work_incom_dedct;
    }

    @ElVoField(physicalName = "work_incom_amt")
    public String getWork_incom_amt(){
        return work_incom_amt;
    }

    @ElVoField(physicalName = "work_incom_amt")
    public void setWork_incom_amt(String work_incom_amt){
        this.work_incom_amt = work_incom_amt;
    }

    @ElVoField(physicalName = "human_dedct_sum")
    public String getHuman_dedct_sum(){
        return human_dedct_sum;
    }

    @ElVoField(physicalName = "human_dedct_sum")
    public void setHuman_dedct_sum(String human_dedct_sum){
        this.human_dedct_sum = human_dedct_sum;
    }

    @ElVoField(physicalName = "anuty_insr_sum")
    public String getAnuty_insr_sum(){
        return anuty_insr_sum;
    }

    @ElVoField(physicalName = "anuty_insr_sum")
    public void setAnuty_insr_sum(String anuty_insr_sum){
        this.anuty_insr_sum = anuty_insr_sum;
    }

    @ElVoField(physicalName = "spcl_dedct_sum")
    public String getSpcl_dedct_sum(){
        return spcl_dedct_sum;
    }

    @ElVoField(physicalName = "spcl_dedct_sum")
    public void setSpcl_dedct_sum(String spcl_dedct_sum){
        this.spcl_dedct_sum = spcl_dedct_sum;
    }

    @ElVoField(physicalName = "etc_dedct_sum")
    public String getEtc_dedct_sum(){
        return etc_dedct_sum;
    }

    @ElVoField(physicalName = "etc_dedct_sum")
    public void setEtc_dedct_sum(String etc_dedct_sum){
        this.etc_dedct_sum = etc_dedct_sum;
    }

    @ElVoField(physicalName = "overl_tax_std")
    public String getOverl_tax_std(){
        return overl_tax_std;
    }

    @ElVoField(physicalName = "overl_tax_std")
    public void setOverl_tax_std(String overl_tax_std){
        this.overl_tax_std = overl_tax_std;
    }

    @ElVoField(physicalName = "tax_rts")
    public String getTax_rts(){
        return tax_rts;
    }

    @ElVoField(physicalName = "tax_rts")
    public void setTax_rts(String tax_rts){
        this.tax_rts = tax_rts;
    }

    @ElVoField(physicalName = "calc_taxamt")
    public String getCalc_taxamt(){
        return calc_taxamt;
    }

    @ElVoField(physicalName = "calc_taxamt")
    public void setCalc_taxamt(String calc_taxamt){
        this.calc_taxamt = calc_taxamt;
    }

    @ElVoField(physicalName = "taxamt_dedct_sum")
    public String getTaxamt_dedct_sum(){
        return taxamt_dedct_sum;
    }

    @ElVoField(physicalName = "taxamt_dedct_sum")
    public void setTaxamt_dedct_sum(String taxamt_dedct_sum){
        this.taxamt_dedct_sum = taxamt_dedct_sum;
    }

    @ElVoField(physicalName = "decsn_taxamt")
    public String getDecsn_taxamt(){
        return decsn_taxamt;
    }

    @ElVoField(physicalName = "decsn_taxamt")
    public void setDecsn_taxamt(String decsn_taxamt){
        this.decsn_taxamt = decsn_taxamt;
    }

    @ElVoField(physicalName = "incomtax_1")
    public String getIncomtax_1(){
        return incomtax_1;
    }

    @ElVoField(physicalName = "incomtax_1")
    public void setIncomtax_1(String incomtax_1){
        this.incomtax_1 = incomtax_1;
    }

    @ElVoField(physicalName = "residtax_1")
    public String getResidtax_1(){
        return residtax_1;
    }

    @ElVoField(physicalName = "residtax_1")
    public void setResidtax_1(String residtax_1){
        this.residtax_1 = residtax_1;
    }

    @ElVoField(physicalName = "decsn_taxamt_1")
    public String getDecsn_taxamt_1(){
        return decsn_taxamt_1;
    }

    @ElVoField(physicalName = "decsn_taxamt_1")
    public void setDecsn_taxamt_1(String decsn_taxamt_1){
        this.decsn_taxamt_1 = decsn_taxamt_1;
    }

    @ElVoField(physicalName = "colct_incomtax")
    public String getColct_incomtax(){
        return colct_incomtax;
    }

    @ElVoField(physicalName = "colct_incomtax")
    public void setColct_incomtax(String colct_incomtax){
        this.colct_incomtax = colct_incomtax;
    }

    @ElVoField(physicalName = "colct_residtax")
    public String getColct_residtax(){
        return colct_residtax;
    }

    @ElVoField(physicalName = "colct_residtax")
    public void setColct_residtax(String colct_residtax){
        this.colct_residtax = colct_residtax;
    }

    @ElVoField(physicalName = "decsn_colct_taxamt")
    public String getDecsn_colct_taxamt(){
        return decsn_colct_taxamt;
    }

    @ElVoField(physicalName = "decsn_colct_taxamt")
    public void setDecsn_colct_taxamt(String decsn_colct_taxamt){
        this.decsn_colct_taxamt = decsn_colct_taxamt;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public String getOccugrp_nm(){
        return occugrp_nm;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public void setOccugrp_nm(String occugrp_nm){
        this.occugrp_nm = occugrp_nm;
    }

    @ElVoField(physicalName = "adjst_clsf_nm")
    public String getAdjst_clsf_nm(){
        return adjst_clsf_nm;
    }

    @ElVoField(physicalName = "adjst_clsf_nm")
    public void setAdjst_clsf_nm(String adjst_clsf_nm){
        this.adjst_clsf_nm = adjst_clsf_nm;
    }

    @ElVoField(physicalName = "work_land_nm")
    public String getWork_land_nm(){
        return work_land_nm;
    }

    @ElVoField(physicalName = "work_land_nm")
    public void setWork_land_nm(String work_land_nm){
        this.work_land_nm = work_land_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "retire_yy")
    public String getRetire_yy(){
        return retire_yy;
    }

    @ElVoField(physicalName = "retire_yy")
    public void setRetire_yy(String retire_yy){
        this.retire_yy = retire_yy;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "incom_sum")
    public String getIncom_sum(){
        return incom_sum;
    }

    @ElVoField(physicalName = "incom_sum")
    public void setIncom_sum(String incom_sum){
        this.incom_sum = incom_sum;
    }

    @ElVoField(physicalName = "fretax_oversea_work")
    public String getFretax_oversea_work(){
        return fretax_oversea_work;
    }

    @ElVoField(physicalName = "fretax_oversea_work")
    public void setFretax_oversea_work(String fretax_oversea_work){
        this.fretax_oversea_work = fretax_oversea_work;
    }

    @ElVoField(physicalName = "fretax_givbirth_childcr")
    public String getFretax_givbirth_childcr(){
        return fretax_givbirth_childcr;
    }

    @ElVoField(physicalName = "fretax_givbirth_childcr")
    public void setFretax_givbirth_childcr(String fretax_givbirth_childcr){
        this.fretax_givbirth_childcr = fretax_givbirth_childcr;
    }

    @ElVoField(physicalName = "fretax_resch_actn")
    public String getFretax_resch_actn(){
        return fretax_resch_actn;
    }

    @ElVoField(physicalName = "fretax_resch_actn")
    public void setFretax_resch_actn(String fretax_resch_actn){
        this.fretax_resch_actn = fretax_resch_actn;
    }

    @ElVoField(physicalName = "fretax_etc")
    public String getFretax_etc(){
        return fretax_etc;
    }

    @ElVoField(physicalName = "fretax_etc")
    public void setFretax_etc(String fretax_etc){
        this.fretax_etc = fretax_etc;
    }

    @ElVoField(physicalName = "fretax_exps_offer")
    public String getFretax_exps_offer(){
        return fretax_exps_offer;
    }

    @ElVoField(physicalName = "fretax_exps_offer")
    public void setFretax_exps_offer(String fretax_exps_offer){
        this.fretax_exps_offer = fretax_exps_offer;
    }

    @ElVoField(physicalName = "incomtax_3")
    public String getIncomtax_3(){
        return incomtax_3;
    }

    @ElVoField(physicalName = "incomtax_3")
    public void setIncomtax_3(String incomtax_3){
        this.incomtax_3 = incomtax_3;
    }

    @ElVoField(physicalName = "residtax_3")
    public String getResidtax_3(){
        return residtax_3;
    }

    @ElVoField(physicalName = "residtax_3")
    public void setResidtax_3(String residtax_3){
        this.residtax_3 = residtax_3;
    }

    @ElVoField(physicalName = "oversea_work_3")
    public String getOversea_work_3(){
        return oversea_work_3;
    }

    @ElVoField(physicalName = "oversea_work_3")
    public void setOversea_work_3(String oversea_work_3){
        this.oversea_work_3 = oversea_work_3;
    }

    @ElVoField(physicalName = "givbirth_extra_3")
    public String getGivbirth_extra_3(){
        return givbirth_extra_3;
    }

    @ElVoField(physicalName = "givbirth_extra_3")
    public void setGivbirth_extra_3(String givbirth_extra_3){
        this.givbirth_extra_3 = givbirth_extra_3;
    }

    @ElVoField(physicalName = "resch_orgn_3")
    public String getResch_orgn_3(){
        return resch_orgn_3;
    }

    @ElVoField(physicalName = "resch_orgn_3")
    public void setResch_orgn_3(String resch_orgn_3){
        this.resch_orgn_3 = resch_orgn_3;
    }

    @ElVoField(physicalName = "etc_3")
    public String getEtc_3(){
        return etc_3;
    }

    @ElVoField(physicalName = "etc_3")
    public void setEtc_3(String etc_3){
        this.etc_3 = etc_3;
    }

    @ElVoField(physicalName = "fretax_work_incom_3")
    public String getFretax_work_incom_3(){
        return fretax_work_incom_3;
    }

    @ElVoField(physicalName = "fretax_work_incom_3")
    public void setFretax_work_incom_3(String fretax_work_incom_3){
        this.fretax_work_incom_3 = fretax_work_incom_3;
    }

    @ElVoField(physicalName = "incomtax_1_3")
    public String getIncomtax_1_3(){
        return incomtax_1_3;
    }

    @ElVoField(physicalName = "incomtax_1_3")
    public void setIncomtax_1_3(String incomtax_1_3){
        this.incomtax_1_3 = incomtax_1_3;
    }

    @ElVoField(physicalName = "tot_salry_sum")
    public String getTot_salry_sum(){
        return tot_salry_sum;
    }

    @ElVoField(physicalName = "tot_salry_sum")
    public void setTot_salry_sum(String tot_salry_sum){
        this.tot_salry_sum = tot_salry_sum;
    }

    @ElVoField(physicalName = "incomtax_2")
    public String getIncomtax_2(){
        return incomtax_2;
    }

    @ElVoField(physicalName = "incomtax_2")
    public void setIncomtax_2(String incomtax_2){
        this.incomtax_2 = incomtax_2;
    }

    @ElVoField(physicalName = "residtax_2")
    public String getResidtax_2(){
        return residtax_2;
    }

    @ElVoField(physicalName = "residtax_2")
    public void setResidtax_2(String residtax_2){
        this.residtax_2 = residtax_2;
    }

    @ElVoField(physicalName = "insr_sum")
    public String getInsr_sum(){
        return insr_sum;
    }

    @ElVoField(physicalName = "insr_sum")
    public void setInsr_sum(String insr_sum){
        this.insr_sum = insr_sum;
    }

    @ElVoField(physicalName = "year_salamt_501")
    public String getYear_salamt_501(){
        return year_salamt_501;
    }

    @ElVoField(physicalName = "year_salamt_501")
    public void setYear_salamt_501(String year_salamt_501){
        this.year_salamt_501 = year_salamt_501;
    }

    @ElVoField(physicalName = "year_salamt_503")
    public String getYear_salamt_503(){
        return year_salamt_503;
    }

    @ElVoField(physicalName = "year_salamt_503")
    public void setYear_salamt_503(String year_salamt_503){
        this.year_salamt_503 = year_salamt_503;
    }

    @ElVoField(physicalName = "year_salamt_504")
    public String getYear_salamt_504(){
        return year_salamt_504;
    }

    @ElVoField(physicalName = "year_salamt_504")
    public void setYear_salamt_504(String year_salamt_504){
        this.year_salamt_504 = year_salamt_504;
    }

    @ElVoField(physicalName = "year_salamt_517")
    public String getYear_salamt_517(){
        return year_salamt_517;
    }

    @ElVoField(physicalName = "year_salamt_517")
    public void setYear_salamt_517(String year_salamt_517){
        this.year_salamt_517 = year_salamt_517;
    }

    @ElVoField(physicalName = "year_salamt_551")
    public String getYear_salamt_551(){
        return year_salamt_551;
    }

    @ElVoField(physicalName = "year_salamt_551")
    public void setYear_salamt_551(String year_salamt_551){
        this.year_salamt_551 = year_salamt_551;
    }

    @ElVoField(physicalName = "year_salamt_802")
    public String getYear_salamt_802(){
        return year_salamt_802;
    }

    @ElVoField(physicalName = "year_salamt_802")
    public void setYear_salamt_802(String year_salamt_802){
        this.year_salamt_802 = year_salamt_802;
    }

    @ElVoField(physicalName = "year_salamt_803")
    public String getYear_salamt_803(){
        return year_salamt_803;
    }

    @ElVoField(physicalName = "year_salamt_803")
    public void setYear_salamt_803(String year_salamt_803){
        this.year_salamt_803 = year_salamt_803;
    }

    @ElVoField(physicalName = "year_salamt_804")
    public String getYear_salamt_804(){
        return year_salamt_804;
    }

    @ElVoField(physicalName = "year_salamt_804")
    public void setYear_salamt_804(String year_salamt_804){
        this.year_salamt_804 = year_salamt_804;
    }

    @ElVoField(physicalName = "year_salamt_818")
    public String getYear_salamt_818(){
        return year_salamt_818;
    }

    @ElVoField(physicalName = "year_salamt_818")
    public void setYear_salamt_818(String year_salamt_818){
        this.year_salamt_818 = year_salamt_818;
    }

    @ElVoField(physicalName = "searchGubun")
    public String getSearchGubun(){
        return searchGubun;
    }

    @ElVoField(physicalName = "searchGubun")
    public void setSearchGubun(String searchGubun){
        this.searchGubun = searchGubun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumTaxPayVo [");
        sb.append("belng_yr").append("=").append(belng_yr).append(",");
        sb.append("belng_yrmon").append("=").append(belng_yrmon).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("pay_sum").append("=").append(pay_sum).append(",");
        sb.append("fretax_amt_meal").append("=").append(fretax_amt_meal).append(",");
        sb.append("fretax_amt_research").append("=").append(fretax_amt_research).append(",");
        sb.append("incomtax").append("=").append(incomtax).append(",");
        sb.append("residtax").append("=").append(residtax).append(",");
        sb.append("tax_sum").append("=").append(tax_sum).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("adjst_yr").append("=").append(adjst_yr).append(",");
        sb.append("adjst_cd").append("=").append(adjst_cd).append(",");
        sb.append("adjst_clsf").append("=").append(adjst_clsf).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("retire_ymd").append("=").append(retire_ymd).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_cd").append("=").append(duty_cd).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("yrly_work_incom").append("=").append(yrly_work_incom).append(",");
        sb.append("fretax_sum").append("=").append(fretax_sum).append(",");
        sb.append("tot_salry").append("=").append(tot_salry).append(",");
        sb.append("work_incom_dedct").append("=").append(work_incom_dedct).append(",");
        sb.append("work_incom_amt").append("=").append(work_incom_amt).append(",");
        sb.append("human_dedct_sum").append("=").append(human_dedct_sum).append(",");
        sb.append("anuty_insr_sum").append("=").append(anuty_insr_sum).append(",");
        sb.append("spcl_dedct_sum").append("=").append(spcl_dedct_sum).append(",");
        sb.append("etc_dedct_sum").append("=").append(etc_dedct_sum).append(",");
        sb.append("overl_tax_std").append("=").append(overl_tax_std).append(",");
        sb.append("tax_rts").append("=").append(tax_rts).append(",");
        sb.append("calc_taxamt").append("=").append(calc_taxamt).append(",");
        sb.append("taxamt_dedct_sum").append("=").append(taxamt_dedct_sum).append(",");
        sb.append("decsn_taxamt").append("=").append(decsn_taxamt).append(",");
        sb.append("incomtax_1").append("=").append(incomtax_1).append(",");
        sb.append("residtax_1").append("=").append(residtax_1).append(",");
        sb.append("decsn_taxamt_1").append("=").append(decsn_taxamt_1).append(",");
        sb.append("colct_incomtax").append("=").append(colct_incomtax).append(",");
        sb.append("colct_residtax").append("=").append(colct_residtax).append(",");
        sb.append("decsn_colct_taxamt").append("=").append(decsn_colct_taxamt).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("occugrp_nm").append("=").append(occugrp_nm).append(",");
        sb.append("adjst_clsf_nm").append("=").append(adjst_clsf_nm).append(",");
        sb.append("work_land_nm").append("=").append(work_land_nm).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("retire_yy").append("=").append(retire_yy).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("incom_sum").append("=").append(incom_sum).append(",");
        sb.append("fretax_oversea_work").append("=").append(fretax_oversea_work).append(",");
        sb.append("fretax_givbirth_childcr").append("=").append(fretax_givbirth_childcr).append(",");
        sb.append("fretax_resch_actn").append("=").append(fretax_resch_actn).append(",");
        sb.append("fretax_etc").append("=").append(fretax_etc).append(",");
        sb.append("fretax_exps_offer").append("=").append(fretax_exps_offer).append(",");
        sb.append("incomtax_3").append("=").append(incomtax_3).append(",");
        sb.append("residtax_3").append("=").append(residtax_3).append(",");
        sb.append("oversea_work_3").append("=").append(oversea_work_3).append(",");
        sb.append("givbirth_extra_3").append("=").append(givbirth_extra_3).append(",");
        sb.append("resch_orgn_3").append("=").append(resch_orgn_3).append(",");
        sb.append("etc_3").append("=").append(etc_3).append(",");
        sb.append("fretax_work_incom_3").append("=").append(fretax_work_incom_3).append(",");
        sb.append("incomtax_1_3").append("=").append(incomtax_1_3).append(",");
        sb.append("tot_salry_sum").append("=").append(tot_salry_sum).append(",");
        sb.append("incomtax_2").append("=").append(incomtax_2).append(",");
        sb.append("residtax_2").append("=").append(residtax_2).append(",");
        sb.append("insr_sum").append("=").append(insr_sum).append(",");
        sb.append("year_salamt_501").append("=").append(year_salamt_501).append(",");
        sb.append("year_salamt_503").append("=").append(year_salamt_503).append(",");
        sb.append("year_salamt_504").append("=").append(year_salamt_504).append(",");
        sb.append("year_salamt_517").append("=").append(year_salamt_517).append(",");
        sb.append("year_salamt_551").append("=").append(year_salamt_551).append(",");
        sb.append("year_salamt_802").append("=").append(year_salamt_802).append(",");
        sb.append("year_salamt_803").append("=").append(year_salamt_803).append(",");
        sb.append("year_salamt_804").append("=").append(year_salamt_804).append(",");
        sb.append("year_salamt_818").append("=").append(year_salamt_818).append(",");
        sb.append("searchGubun").append("=").append(searchGubun);
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
