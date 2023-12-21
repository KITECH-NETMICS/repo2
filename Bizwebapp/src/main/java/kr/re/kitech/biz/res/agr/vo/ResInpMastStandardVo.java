package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpMastStandardExp")
public class ResInpMastStandardVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpMastStandardVo(){
  }

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "largePrjNo", physicalName = "large_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String large_prj_no;
  
    @ElDtoField(logicalName = "bsnsCdExclsvAgncy", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;
  
    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;
  
    @ElDtoField(logicalName = "bsnsCdInout", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;
  
    @ElDtoField(logicalName = "bsnsCdInoutNm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;
  
    @ElDtoField(logicalName = "ntrmClsfNm", physicalName = "ntrm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntrm_clsf_nm;
  
    @ElDtoField(logicalName = "indstTechClsfLabel", physicalName = "indst_tech_clsf_label", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf_label;
  
    @ElDtoField(logicalName = "sixtRelatTechNm", physicalName = "sixt_relat_tech_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sixt_relat_tech_nm;
  
    @ElDtoField(logicalName = "secrtPrjEx", physicalName = "secrt_prj_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_ex;
  
    @ElDtoField(logicalName = "currReschRspns", physicalName = "curr_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns;
  
    @ElDtoField(logicalName = "currReschRspnsNm", physicalName = "curr_resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns_nm;
  
    @ElDtoField(logicalName = "step", physicalName = "step", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String step;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "bsnsReqNo", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;
  
    @ElDtoField(logicalName = "prjStateNm", physicalName = "prj_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state_nm;
  
    @ElDtoField(logicalName = "prjState", physicalName = "prj_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_state;
  
    @ElDtoField(logicalName = "accntRspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;
  
    @ElDtoField(logicalName = "accntRspnsNm", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;
  
    @ElDtoField(logicalName = "thyrYrYmd", physicalName = "thyr_yr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_yr_ymd;
  
    @ElDtoField(logicalName = "thyrYrYmd2", physicalName = "thyr_yr_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_yr_ymd2;
  
    @ElDtoField(logicalName = "totYrYmd", physicalName = "tot_yr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_yr_ymd;
  
    @ElDtoField(logicalName = "bsnsCdBsnsNm", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;
  
    @ElDtoField(logicalName = "bsnsCdDetlsBsnsNm", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;
  
    @ElDtoField(logicalName = "bsnsCdOficNm", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;
  
    @ElDtoField(logicalName = "prjEngNm", physicalName = "prj_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_eng_nm;
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpMastStandardVo [");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
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
      sb.append("prj_eng_nm").append("=").append(prj_eng_nm);
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