package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "KtxIssuMstrExp")
public class KtxIssuMstrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public KtxIssuMstrVo(){
  }

  @ElDtoField(logicalName = "issuSeqno", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String issu_seqno;

  @ElDtoField(logicalName = "regsDate", physicalName = "regs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String regs_date;

  @ElDtoField(logicalName = "issuDate", physicalName = "issu_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String issu_date;

  @ElDtoField(logicalName = "buyrCorpNo", physicalName = "buyr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_corp_no;

  @ElDtoField(logicalName = "buyrCorpNm", physicalName = "buyr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_corp_nm;

  @ElDtoField(logicalName = "buyrBussCons", physicalName = "buyr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_buss_cons;

  @ElDtoField(logicalName = "buyrBussType", physicalName = "buyr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_buss_type;

  @ElDtoField(logicalName = "buyrCeo", physicalName = "buyr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_ceo;

  @ElDtoField(logicalName = "buyrAddr", physicalName = "buyr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_addr;

  @ElDtoField(logicalName = "buyrChrgEmail1", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_chrg_email1;

  @ElDtoField(logicalName = "buyrChrgEmail2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String buyr_chrg_email2;

  @ElDtoField(logicalName = "selrCorpNo", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_corp_no;

  @ElDtoField(logicalName = "selrCorpNm", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_corp_nm;

  @ElDtoField(logicalName = "selrBussCons", physicalName = "selr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_buss_cons;

  @ElDtoField(logicalName = "selrBussType", physicalName = "selr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_buss_type;

  @ElDtoField(logicalName = "selrCeo", physicalName = "selr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_ceo;

  @ElDtoField(logicalName = "selrAddr", physicalName = "selr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_addr;

  @ElDtoField(logicalName = "selrChrgEmail", physicalName = "selr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String selr_chrg_email;

  @ElDtoField(logicalName = "chrgAmt", physicalName = "chrg_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String chrg_amt;

  @ElDtoField(logicalName = "taxAmt", physicalName = "tax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String tax_amt;

  @ElDtoField(logicalName = "totlAmt", physicalName = "totl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String totl_amt;

  @ElDtoField(logicalName = "billCnt", physicalName = "bill_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String bill_cnt;

  @ElDtoField(logicalName = "vendClsf", physicalName = "vend_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String vend_clsf;

  @ElVoField(physicalName = "issu_seqno")
  public String getIssu_seqno(){
      return issu_seqno;
  }

  @ElVoField(physicalName = "issu_seqno")
  public void setIssu_seqno(String issu_seqno){
      this.issu_seqno = issu_seqno;
  }

  @ElVoField(physicalName = "regs_date")
  public String getRegs_date(){
      return regs_date;
  }

  @ElVoField(physicalName = "regs_date")
  public void setRegs_date(String regs_date){
      this.regs_date = regs_date;
  }

  @ElVoField(physicalName = "issu_date")
  public String getIssu_date(){
      return issu_date;
  }

  @ElVoField(physicalName = "issu_date")
  public void setIssu_date(String issu_date){
      this.issu_date = issu_date;
  }

  @ElVoField(physicalName = "buyr_corp_no")
  public String getBuyr_corp_no(){
      return buyr_corp_no;
  }

  @ElVoField(physicalName = "buyr_corp_no")
  public void setBuyr_corp_no(String buyr_corp_no){
      this.buyr_corp_no = buyr_corp_no;
  }

  @ElVoField(physicalName = "buyr_corp_nm")
  public String getBuyr_corp_nm(){
      return buyr_corp_nm;
  }

  @ElVoField(physicalName = "buyr_corp_nm")
  public void setBuyr_corp_nm(String buyr_corp_nm){
      this.buyr_corp_nm = buyr_corp_nm;
  }

  @ElVoField(physicalName = "buyr_buss_cons")
  public String getBuyr_buss_cons(){
      return buyr_buss_cons;
  }

  @ElVoField(physicalName = "buyr_buss_cons")
  public void setBuyr_buss_cons(String buyr_buss_cons){
      this.buyr_buss_cons = buyr_buss_cons;
  }

  @ElVoField(physicalName = "buyr_buss_type")
  public String getBuyr_buss_type(){
      return buyr_buss_type;
  }

  @ElVoField(physicalName = "buyr_buss_type")
  public void setBuyr_buss_type(String buyr_buss_type){
      this.buyr_buss_type = buyr_buss_type;
  }

  @ElVoField(physicalName = "buyr_ceo")
  public String getBuyr_ceo(){
      return buyr_ceo;
  }

  @ElVoField(physicalName = "buyr_ceo")
  public void setBuyr_ceo(String buyr_ceo){
      this.buyr_ceo = buyr_ceo;
  }

  @ElVoField(physicalName = "buyr_addr")
  public String getBuyr_addr(){
      return buyr_addr;
  }

  @ElVoField(physicalName = "buyr_addr")
  public void setBuyr_addr(String buyr_addr){
      this.buyr_addr = buyr_addr;
  }

  @ElVoField(physicalName = "buyr_chrg_email1")
  public String getBuyr_chrg_email1(){
      return buyr_chrg_email1;
  }

  @ElVoField(physicalName = "buyr_chrg_email1")
  public void setBuyr_chrg_email1(String buyr_chrg_email1){
      this.buyr_chrg_email1 = buyr_chrg_email1;
  }

  @ElVoField(physicalName = "buyr_chrg_email2")
  public String getBuyr_chrg_email2(){
      return buyr_chrg_email2;
  }

  @ElVoField(physicalName = "buyr_chrg_email2")
  public void setBuyr_chrg_email2(String buyr_chrg_email2){
      this.buyr_chrg_email2 = buyr_chrg_email2;
  }

  @ElVoField(physicalName = "selr_corp_no")
  public String getSelr_corp_no(){
      return selr_corp_no;
  }

  @ElVoField(physicalName = "selr_corp_no")
  public void setSelr_corp_no(String selr_corp_no){
      this.selr_corp_no = selr_corp_no;
  }

  @ElVoField(physicalName = "selr_corp_nm")
  public String getSelr_corp_nm(){
      return selr_corp_nm;
  }

  @ElVoField(physicalName = "selr_corp_nm")
  public void setSelr_corp_nm(String selr_corp_nm){
      this.selr_corp_nm = selr_corp_nm;
  }

  @ElVoField(physicalName = "selr_buss_cons")
  public String getSelr_buss_cons(){
      return selr_buss_cons;
  }

  @ElVoField(physicalName = "selr_buss_cons")
  public void setSelr_buss_cons(String selr_buss_cons){
      this.selr_buss_cons = selr_buss_cons;
  }

  @ElVoField(physicalName = "selr_buss_type")
  public String getSelr_buss_type(){
      return selr_buss_type;
  }

  @ElVoField(physicalName = "selr_buss_type")
  public void setSelr_buss_type(String selr_buss_type){
      this.selr_buss_type = selr_buss_type;
  }

  @ElVoField(physicalName = "selr_ceo")
  public String getSelr_ceo(){
      return selr_ceo;
  }

  @ElVoField(physicalName = "selr_ceo")
  public void setSelr_ceo(String selr_ceo){
      this.selr_ceo = selr_ceo;
  }

  @ElVoField(physicalName = "selr_addr")
  public String getSelr_addr(){
      return selr_addr;
  }

  @ElVoField(physicalName = "selr_addr")
  public void setSelr_addr(String selr_addr){
      this.selr_addr = selr_addr;
  }

  @ElVoField(physicalName = "selr_chrg_email")
  public String getSelr_chrg_email(){
      return selr_chrg_email;
  }

  @ElVoField(physicalName = "selr_chrg_email")
  public void setSelr_chrg_email(String selr_chrg_email){
      this.selr_chrg_email = selr_chrg_email;
  }

  @ElVoField(physicalName = "chrg_amt")
  public String getChrg_amt(){
      return chrg_amt;
  }

  @ElVoField(physicalName = "chrg_amt")
  public void setChrg_amt(String chrg_amt){
      this.chrg_amt = chrg_amt;
  }

  @ElVoField(physicalName = "tax_amt")
  public String getTax_amt(){
      return tax_amt;
  }

  @ElVoField(physicalName = "tax_amt")
  public void setTax_amt(String tax_amt){
      this.tax_amt = tax_amt;
  }

  @ElVoField(physicalName = "totl_amt")
  public String getTotl_amt(){
      return totl_amt;
  }

  @ElVoField(physicalName = "totl_amt")
  public void setTotl_amt(String totl_amt){
      this.totl_amt = totl_amt;
  }

  @ElVoField(physicalName = "bill_cnt")
  public String getBill_cnt(){
      return bill_cnt;
  }

  @ElVoField(physicalName = "bill_cnt")
  public void setBill_cnt(String bill_cnt){
      this.bill_cnt = bill_cnt;
  }

  @ElVoField(physicalName = "vend_clsf")
  public String getVend_clsf(){
      return vend_clsf;
  }

  @ElVoField(physicalName = "vend_clsf")
  public void setVend_clsf(String vend_clsf){
      this.vend_clsf = vend_clsf;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("KtxIssuMstrVo [");
      sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
      sb.append("regs_date").append("=").append(regs_date).append(",");
      sb.append("issu_date").append("=").append(issu_date).append(",");
      sb.append("buyr_corp_no").append("=").append(buyr_corp_no).append(",");
      sb.append("buyr_corp_nm").append("=").append(buyr_corp_nm).append(",");
      sb.append("buyr_buss_cons").append("=").append(buyr_buss_cons).append(",");
      sb.append("buyr_buss_type").append("=").append(buyr_buss_type).append(",");
      sb.append("buyr_ceo").append("=").append(buyr_ceo).append(",");
      sb.append("buyr_addr").append("=").append(buyr_addr).append(",");
      sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
      sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
      sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
      sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
      sb.append("selr_buss_cons").append("=").append(selr_buss_cons).append(",");
      sb.append("selr_buss_type").append("=").append(selr_buss_type).append(",");
      sb.append("selr_ceo").append("=").append(selr_ceo).append(",");
      sb.append("selr_addr").append("=").append(selr_addr).append(",");
      sb.append("selr_chrg_email").append("=").append(selr_chrg_email).append(",");
      sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
      sb.append("tax_amt").append("=").append(tax_amt).append(",");
      sb.append("totl_amt").append("=").append(totl_amt).append(",");
      sb.append("bill_cnt").append("=").append(bill_cnt).append(",");
      sb.append("vend_clsf").append("=").append(vend_clsf);
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