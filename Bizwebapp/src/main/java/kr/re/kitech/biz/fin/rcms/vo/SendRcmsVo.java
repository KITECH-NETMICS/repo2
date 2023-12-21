package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SendRcmsExp")
public class SendRcmsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SendRcmsVo(){
  }

  @ElDtoField(logicalName = "send_type", physicalName = "send_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String send_type;

  @ElDtoField(logicalName = "lnk_reg_dt", physicalName = "lnk_reg_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String lnk_reg_dt;

  @ElDtoField(logicalName = "card_use_ex", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String card_use_ex;

  @ElDtoField(logicalName = "rcms_pay_clsf", physicalName = "rcms_pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rcms_pay_clsf;

  @ElDtoField(logicalName = "erp_send_no", physicalName = "erp_send_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String erp_send_no;

  @ElDtoField(logicalName = "emp_nm", physicalName = "emp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String emp_nm;

  @ElDtoField(logicalName = "tel_no", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String tel_no;

  @ElDtoField(logicalName = "rcv_bank", physicalName = "rcv_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rcv_bank;

  @ElDtoField(logicalName = "rcv_acct_no", physicalName = "rcv_acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rcv_acct_no;

  @ElDtoField(logicalName = "owac_nm", physicalName = "owac_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String owac_nm;

  @ElDtoField(logicalName = "rcv_bank_nm", physicalName = "rcv_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
  private String rcv_bank_nm;

  @ElVoField(physicalName = "send_type")
  public String getSend_type(){
      return send_type;
  }

  @ElVoField(physicalName = "send_type")
  public void setSend_type(String send_type){
      this.send_type = send_type;
  }

  @ElVoField(physicalName = "lnk_reg_dt")
  public String getLnk_reg_dt(){
      return lnk_reg_dt;
  }

  @ElVoField(physicalName = "lnk_reg_dt")
  public void setLnk_reg_dt(String lnk_reg_dt){
      this.lnk_reg_dt = lnk_reg_dt;
  }

  @ElVoField(physicalName = "card_use_ex")
  public String getCard_use_ex(){
      return card_use_ex;
  }

  @ElVoField(physicalName = "card_use_ex")
  public void setCard_use_ex(String card_use_ex){
      this.card_use_ex = card_use_ex;
  }

  @ElVoField(physicalName = "rcms_pay_clsf")
  public String getRcms_pay_clsf(){
      return rcms_pay_clsf;
  }

  @ElVoField(physicalName = "rcms_pay_clsf")
  public void setRcms_pay_clsf(String rcms_pay_clsf){
      this.rcms_pay_clsf = rcms_pay_clsf;
  }

  @ElVoField(physicalName = "erp_send_no")
  public String getErp_send_no(){
      return erp_send_no;
  }

  @ElVoField(physicalName = "erp_send_no")
  public void setErp_send_no(String erp_send_no){
      this.erp_send_no = erp_send_no;
  }

  @ElVoField(physicalName = "emp_nm")
  public String getEmp_nm(){
      return emp_nm;
  }

  @ElVoField(physicalName = "emp_nm")
  public void setEmp_nm(String emp_nm){
      this.emp_nm = emp_nm;
  }

  @ElVoField(physicalName = "tel_no")
  public String getTel_no(){
      return tel_no;
  }

  @ElVoField(physicalName = "tel_no")
  public void setTel_no(String tel_no){
      this.tel_no = tel_no;
  }

  @ElVoField(physicalName = "rcv_bank")
  public String getRcv_bank(){
      return rcv_bank;
  }

  @ElVoField(physicalName = "rcv_bank")
  public void setRcv_bank(String rcv_bank){
      this.rcv_bank = rcv_bank;
  }

  @ElVoField(physicalName = "rcv_acct_no")
  public String getRcv_acct_no(){
      return rcv_acct_no;
  }

  @ElVoField(physicalName = "rcv_acct_no")
  public void setRcv_acct_no(String rcv_acct_no){
      this.rcv_acct_no = rcv_acct_no;
  }

  @ElVoField(physicalName = "owac_nm")
  public String getOwac_nm(){
      return owac_nm;
  }

  @ElVoField(physicalName = "owac_nm")
  public void setOwac_nm(String owac_nm){
      this.owac_nm = owac_nm;
  }

  @ElVoField(physicalName = "rcv_bank_nm")
  public String getRcv_bank_nm(){
      return rcv_bank_nm;
  }

  @ElVoField(physicalName = "rcv_bank_nm")
  public void setRcv_bank_nm(String rcv_bank_nm){
      this.rcv_bank_nm = rcv_bank_nm;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SendRcmsVo [");
      sb.append("send_type").append("=").append(send_type).append(",");
      sb.append("lnk_reg_dt").append("=").append(lnk_reg_dt).append(",");
      sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
      sb.append("rcms_pay_clsf").append("=").append(rcms_pay_clsf).append(",");
      sb.append("erp_send_no").append("=").append(erp_send_no).append(",");
      sb.append("emp_nm").append("=").append(emp_nm).append(",");
      sb.append("tel_no").append("=").append(tel_no).append(",");
      sb.append("rcv_bank").append("=").append(rcv_bank).append(",");
      sb.append("rcv_acct_no").append("=").append(rcv_acct_no).append(",");
      sb.append("owac_nm").append("=").append(owac_nm).append(",");
      sb.append("rcv_bank_nm").append("=").append(rcv_bank_nm);
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