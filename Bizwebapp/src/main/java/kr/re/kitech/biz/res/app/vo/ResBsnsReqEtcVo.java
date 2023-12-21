package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청기타 Vo")
public class ResBsnsReqEtcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBsnsReqEtcVo(){
    }

    @ElDtoField(logicalName = "간접비율", physicalName = "indrc_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indrc_rt;

    @ElDtoField(logicalName = "날짜", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "연구원구분", physicalName = "reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_clsf;

    @ElDtoField(logicalName = "월단가합계", physicalName = "psnexpns_month_unit_price_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long psnexpns_month_unit_price_sum;

    @ElDtoField(logicalName = "인건비현금합계", physicalName = "cash_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_amt_sum;

    @ElDtoField(logicalName = "정부출연금합계", physicalName = "gov_cntrbamt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gov_cntrbamt_sum;

    @ElDtoField(logicalName = "기업현금합계", physicalName = "cmpy_cash_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cmpy_cash_sum;

    @ElDtoField(logicalName = "기업현물합계", physicalName = "cmpy_goods_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cmpy_goods_sum;

    @ElDtoField(logicalName = "연구비기타합계", physicalName = "etc_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long etc_amt_sum;

    @ElDtoField(logicalName = "연구비총합계", physicalName = "tot_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_amt_sum;

    @ElDtoField(logicalName = "연구비기간정리", physicalName = "bugt_smmry_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_smmry_1;

    @ElDtoField(logicalName = "연구비정리", physicalName = "bugt_smmry_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_smmry_2;

    @ElDtoField(logicalName = "선행연구과제 기여율 합계", physicalName = "preprj_contr_rt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String preprj_contr_rt_sum;

    @ElDtoField(logicalName = "총연구기간", physicalName = "tot_resch_prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_term;

    @ElDtoField(logicalName = "현단계연구기간", physicalName = "cur_resch_prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cur_resch_prd_term;

    @ElDtoField(logicalName = "당해년도연구기간", physicalName = "year_resch_prd_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year_resch_prd_term;

    @ElDtoField(logicalName = "연구관리담당자", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElVoField(physicalName = "indrc_rt")
    public String getIndrc_rt(){
        return indrc_rt;
    }

    @ElVoField(physicalName = "indrc_rt")
    public void setIndrc_rt(String indrc_rt){
        this.indrc_rt = indrc_rt;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public String getReschr_clsf(){
        return reschr_clsf;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public void setReschr_clsf(String reschr_clsf){
        this.reschr_clsf = reschr_clsf;
    }

    @ElVoField(physicalName = "psnexpns_month_unit_price_sum")
    public long getPsnexpns_month_unit_price_sum(){
        return psnexpns_month_unit_price_sum;
    }

    @ElVoField(physicalName = "psnexpns_month_unit_price_sum")
    public void setPsnexpns_month_unit_price_sum(long psnexpns_month_unit_price_sum){
        this.psnexpns_month_unit_price_sum = psnexpns_month_unit_price_sum;
    }

    @ElVoField(physicalName = "cash_amt_sum")
    public long getCash_amt_sum(){
        return cash_amt_sum;
    }

    @ElVoField(physicalName = "cash_amt_sum")
    public void setCash_amt_sum(long cash_amt_sum){
        this.cash_amt_sum = cash_amt_sum;
    }

    @ElVoField(physicalName = "gov_cntrbamt_sum")
    public long getGov_cntrbamt_sum(){
        return gov_cntrbamt_sum;
    }

    @ElVoField(physicalName = "gov_cntrbamt_sum")
    public void setGov_cntrbamt_sum(long gov_cntrbamt_sum){
        this.gov_cntrbamt_sum = gov_cntrbamt_sum;
    }

    @ElVoField(physicalName = "cmpy_cash_sum")
    public long getCmpy_cash_sum(){
        return cmpy_cash_sum;
    }

    @ElVoField(physicalName = "cmpy_cash_sum")
    public void setCmpy_cash_sum(long cmpy_cash_sum){
        this.cmpy_cash_sum = cmpy_cash_sum;
    }

    @ElVoField(physicalName = "cmpy_goods_sum")
    public long getCmpy_goods_sum(){
        return cmpy_goods_sum;
    }

    @ElVoField(physicalName = "cmpy_goods_sum")
    public void setCmpy_goods_sum(long cmpy_goods_sum){
        this.cmpy_goods_sum = cmpy_goods_sum;
    }

    @ElVoField(physicalName = "etc_amt_sum")
    public long getEtc_amt_sum(){
        return etc_amt_sum;
    }

    @ElVoField(physicalName = "etc_amt_sum")
    public void setEtc_amt_sum(long etc_amt_sum){
        this.etc_amt_sum = etc_amt_sum;
    }

    @ElVoField(physicalName = "tot_amt_sum")
    public long getTot_amt_sum(){
        return tot_amt_sum;
    }

    @ElVoField(physicalName = "tot_amt_sum")
    public void setTot_amt_sum(long tot_amt_sum){
        this.tot_amt_sum = tot_amt_sum;
    }

    @ElVoField(physicalName = "bugt_smmry_1")
    public String getBugt_smmry_1(){
        return bugt_smmry_1;
    }

    @ElVoField(physicalName = "bugt_smmry_1")
    public void setBugt_smmry_1(String bugt_smmry_1){
        this.bugt_smmry_1 = bugt_smmry_1;
    }

    @ElVoField(physicalName = "bugt_smmry_2")
    public String getBugt_smmry_2(){
        return bugt_smmry_2;
    }

    @ElVoField(physicalName = "bugt_smmry_2")
    public void setBugt_smmry_2(String bugt_smmry_2){
        this.bugt_smmry_2 = bugt_smmry_2;
    }

    @ElVoField(physicalName = "preprj_contr_rt_sum")
    public String getPreprj_contr_rt_sum(){
        return preprj_contr_rt_sum;
    }

    @ElVoField(physicalName = "preprj_contr_rt_sum")
    public void setPreprj_contr_rt_sum(String preprj_contr_rt_sum){
        this.preprj_contr_rt_sum = preprj_contr_rt_sum;
    }

    @ElVoField(physicalName = "tot_resch_prd_term")
    public String getTot_resch_prd_term(){
        return tot_resch_prd_term;
    }

    @ElVoField(physicalName = "tot_resch_prd_term")
    public void setTot_resch_prd_term(String tot_resch_prd_term){
        this.tot_resch_prd_term = tot_resch_prd_term;
    }

    @ElVoField(physicalName = "cur_resch_prd_term")
    public String getCur_resch_prd_term(){
        return cur_resch_prd_term;
    }

    @ElVoField(physicalName = "cur_resch_prd_term")
    public void setCur_resch_prd_term(String cur_resch_prd_term){
        this.cur_resch_prd_term = cur_resch_prd_term;
    }

    @ElVoField(physicalName = "year_resch_prd_term")
    public String getYear_resch_prd_term(){
        return year_resch_prd_term;
    }

    @ElVoField(physicalName = "year_resch_prd_term")
    public void setYear_resch_prd_term(String year_resch_prd_term){
        this.year_resch_prd_term = year_resch_prd_term;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBsnsReqEtcVo [");
        sb.append("indrc_rt").append("=").append(indrc_rt).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("reschr_clsf").append("=").append(reschr_clsf).append(",");
        sb.append("psnexpns_month_unit_price_sum").append("=").append(psnexpns_month_unit_price_sum).append(",");
        sb.append("cash_amt_sum").append("=").append(cash_amt_sum).append(",");
        sb.append("gov_cntrbamt_sum").append("=").append(gov_cntrbamt_sum).append(",");
        sb.append("cmpy_cash_sum").append("=").append(cmpy_cash_sum).append(",");
        sb.append("cmpy_goods_sum").append("=").append(cmpy_goods_sum).append(",");
        sb.append("etc_amt_sum").append("=").append(etc_amt_sum).append(",");
        sb.append("tot_amt_sum").append("=").append(tot_amt_sum).append(",");
        sb.append("bugt_smmry_1").append("=").append(bugt_smmry_1).append(",");
        sb.append("bugt_smmry_2").append("=").append(bugt_smmry_2).append(",");
        sb.append("preprj_contr_rt_sum").append("=").append(preprj_contr_rt_sum).append(",");
        sb.append("tot_resch_prd_term").append("=").append(tot_resch_prd_term).append(",");
        sb.append("cur_resch_prd_term").append("=").append(cur_resch_prd_term).append(",");
        sb.append("year_resch_prd_term").append("=").append(year_resch_prd_term).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno);
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
