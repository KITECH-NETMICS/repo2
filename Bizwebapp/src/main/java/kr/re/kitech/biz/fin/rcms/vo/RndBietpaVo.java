package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "RndBietpaExp")
public class RndBietpaVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public RndBietpaVo(){
  }

  @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String unslip_no;

  @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String unslip_odr;

  @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String req_no;

  @ElDtoField(logicalName = "expnsClsf", physicalName = "expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String expns_clsf;

  @ElDtoField(logicalName = "purReqNo", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String pur_req_no;

  @ElDtoField(logicalName = "contrctTotAmt", physicalName = "contrct_tot_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String contrct_tot_amt;

  @ElDtoField(logicalName = "mnyPayWay", physicalName = "mny_pay_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String mny_pay_way;

  @ElDtoField(logicalName = "etubId", physicalName = "etub_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String etub_id;

  @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String amt;

  @ElDtoField(logicalName = "purGrpCd", physicalName = "pur_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String pur_grp_cd;

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

  @ElVoField(physicalName = "req_no")
  public String getReq_no(){
      return req_no;
  }

  @ElVoField(physicalName = "req_no")
  public void setReq_no(String req_no){
      this.req_no = req_no;
  }

  @ElVoField(physicalName = "expns_clsf")
  public String getExpns_clsf(){
      return expns_clsf;
  }

  @ElVoField(physicalName = "expns_clsf")
  public void setExpns_clsf(String expns_clsf){
      this.expns_clsf = expns_clsf;
  }

  @ElVoField(physicalName = "pur_req_no")
  public String getPur_req_no(){
      return pur_req_no;
  }

  @ElVoField(physicalName = "pur_req_no")
  public void setPur_req_no(String pur_req_no){
      this.pur_req_no = pur_req_no;
  }

  @ElVoField(physicalName = "contrct_tot_amt")
  public String getContrct_tot_amt(){
      return contrct_tot_amt;
  }

  @ElVoField(physicalName = "contrct_tot_amt")
  public void setContrct_tot_amt(String contrct_tot_amt){
      this.contrct_tot_amt = contrct_tot_amt;
  }

  @ElVoField(physicalName = "mny_pay_way")
  public String getMny_pay_way(){
      return mny_pay_way;
  }

  @ElVoField(physicalName = "mny_pay_way")
  public void setMny_pay_way(String mny_pay_way){
      this.mny_pay_way = mny_pay_way;
  }

  @ElVoField(physicalName = "etub_id")
  public String getEtub_id(){
      return etub_id;
  }

  @ElVoField(physicalName = "etub_id")
  public void setEtub_id(String etub_id){
      this.etub_id = etub_id;
  }

  @ElVoField(physicalName = "amt")
  public String getAmt(){
      return amt;
  }

  @ElVoField(physicalName = "amt")
  public void setAmt(String amt){
      this.amt = amt;
  }

  @ElVoField(physicalName = "pur_grp_cd")
  public String getPur_grp_cd(){
      return pur_grp_cd;
  }

  @ElVoField(physicalName = "pur_grp_cd")
  public void setPur_grp_cd(String pur_grp_cd){
      this.pur_grp_cd = pur_grp_cd;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("RndBietpaVo [");
      sb.append("unslip_no").append("=").append(unslip_no).append(",");
      sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("expns_clsf").append("=").append(expns_clsf).append(",");
      sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
      sb.append("contrct_tot_amt").append("=").append(contrct_tot_amt).append(",");
      sb.append("mny_pay_way").append("=").append(mny_pay_way).append(",");
      sb.append("etub_id").append("=").append(etub_id).append(",");
      sb.append("amt").append("=").append(amt).append(",");
      sb.append("pur_grp_cd").append("=").append(pur_grp_cd);
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