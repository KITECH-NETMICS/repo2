package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FndCardSelectExp")
public class FndCardSelectVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FndCardSelectVo(){
  }

    @ElDtoField(logicalName = "keepCharg", physicalName = "keep_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_charg;
  
    @ElDtoField(logicalName = "cardNo", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;
  
    @ElDtoField(logicalName = "cardKnd", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;
  
    @ElDtoField(logicalName = "cardClsf", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;
  
    @ElDtoField(logicalName = "cardKndNm", physicalName = "card_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd_nm;
  
    @ElDtoField(logicalName = "cardClsfNm", physicalName = "card_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf_nm;
  
    @ElDtoField(logicalName = "apprvlBank", physicalName = "apprvl_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_bank;
  
    @ElDtoField(logicalName = "apprvlYmd", physicalName = "apprvl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_ymd;
  
    @ElDtoField(logicalName = "apprvlBankaccnt", physicalName = "apprvl_bankaccnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_bankaccnt;
  
    @ElDtoField(logicalName = "expAcctNo", physicalName = "exp_acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exp_acct_no;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "deptNewYmd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "dutyNm", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;
  
    @ElDtoField(logicalName = "validYmd", physicalName = "valid_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String valid_ymd;
  
    @ElDtoField(logicalName = "payYmd", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;
  
    @ElDtoField(logicalName = "retrnYmd", physicalName = "retrn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrn_ymd;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "cardState", physicalName = "card_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_state;
  
    @ElDtoField(logicalName = "issuClsf", physicalName = "issu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_clsf;
  
    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;
  
    @ElDtoField(logicalName = "cardStateNm", physicalName = "card_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_state_nm;
  
    @ElDtoField(logicalName = "issuClsfNm", physicalName = "issu_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_clsf_nm;
  
    @ElVoField(physicalName = "keep_charg")
    public String getKeep_charg(){
        return keep_charg;
    }
  
    @ElVoField(physicalName = "keep_charg")
    public void setKeep_charg(String keep_charg){
        this.keep_charg = keep_charg;
    }
  
    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }
  
    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }
  
    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }
  
    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }
  
    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }
  
    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }
  
    @ElVoField(physicalName = "card_knd_nm")
    public String getCard_knd_nm(){
        return card_knd_nm;
    }
  
    @ElVoField(physicalName = "card_knd_nm")
    public void setCard_knd_nm(String card_knd_nm){
        this.card_knd_nm = card_knd_nm;
    }
  
    @ElVoField(physicalName = "card_clsf_nm")
    public String getCard_clsf_nm(){
        return card_clsf_nm;
    }
  
    @ElVoField(physicalName = "card_clsf_nm")
    public void setCard_clsf_nm(String card_clsf_nm){
        this.card_clsf_nm = card_clsf_nm;
    }
  
    @ElVoField(physicalName = "apprvl_bank")
    public String getApprvl_bank(){
        return apprvl_bank;
    }
  
    @ElVoField(physicalName = "apprvl_bank")
    public void setApprvl_bank(String apprvl_bank){
        this.apprvl_bank = apprvl_bank;
    }
  
    @ElVoField(physicalName = "apprvl_ymd")
    public String getApprvl_ymd(){
        return apprvl_ymd;
    }
  
    @ElVoField(physicalName = "apprvl_ymd")
    public void setApprvl_ymd(String apprvl_ymd){
        this.apprvl_ymd = apprvl_ymd;
    }
  
    @ElVoField(physicalName = "apprvl_bankaccnt")
    public String getApprvl_bankaccnt(){
        return apprvl_bankaccnt;
    }
  
    @ElVoField(physicalName = "apprvl_bankaccnt")
    public void setApprvl_bankaccnt(String apprvl_bankaccnt){
        this.apprvl_bankaccnt = apprvl_bankaccnt;
    }
  
    @ElVoField(physicalName = "exp_acct_no")
    public String getExp_acct_no(){
        return exp_acct_no;
    }
  
    @ElVoField(physicalName = "exp_acct_no")
    public void setExp_acct_no(String exp_acct_no){
        this.exp_acct_no = exp_acct_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }
  
    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }
  
    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }
  
    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }
  
    @ElVoField(physicalName = "valid_ymd")
    public String getValid_ymd(){
        return valid_ymd;
    }
  
    @ElVoField(physicalName = "valid_ymd")
    public void setValid_ymd(String valid_ymd){
        this.valid_ymd = valid_ymd;
    }
  
    @ElVoField(physicalName = "pay_ymd")
    public String getPay_ymd(){
        return pay_ymd;
    }
  
    @ElVoField(physicalName = "pay_ymd")
    public void setPay_ymd(String pay_ymd){
        this.pay_ymd = pay_ymd;
    }
  
    @ElVoField(physicalName = "retrn_ymd")
    public String getRetrn_ymd(){
        return retrn_ymd;
    }
  
    @ElVoField(physicalName = "retrn_ymd")
    public void setRetrn_ymd(String retrn_ymd){
        this.retrn_ymd = retrn_ymd;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "card_state")
    public String getCard_state(){
        return card_state;
    }
  
    @ElVoField(physicalName = "card_state")
    public void setCard_state(String card_state){
        this.card_state = card_state;
    }
  
    @ElVoField(physicalName = "issu_clsf")
    public String getIssu_clsf(){
        return issu_clsf;
    }
  
    @ElVoField(physicalName = "issu_clsf")
    public void setIssu_clsf(String issu_clsf){
        this.issu_clsf = issu_clsf;
    }
  
    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }
  
    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }
  
    @ElVoField(physicalName = "card_state_nm")
    public String getCard_state_nm(){
        return card_state_nm;
    }
  
    @ElVoField(physicalName = "card_state_nm")
    public void setCard_state_nm(String card_state_nm){
        this.card_state_nm = card_state_nm;
    }
  
    @ElVoField(physicalName = "issu_clsf_nm")
    public String getIssu_clsf_nm(){
        return issu_clsf_nm;
    }
  
    @ElVoField(physicalName = "issu_clsf_nm")
    public void setIssu_clsf_nm(String issu_clsf_nm){
        this.issu_clsf_nm = issu_clsf_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FndCardSelectVo [");
      sb.append("keep_charg").append("=").append(keep_charg).append(",");
      sb.append("card_no").append("=").append(card_no).append(",");
      sb.append("card_knd").append("=").append(card_knd).append(",");
      sb.append("card_clsf").append("=").append(card_clsf).append(",");
      sb.append("card_knd_nm").append("=").append(card_knd_nm).append(",");
      sb.append("card_clsf_nm").append("=").append(card_clsf_nm).append(",");
      sb.append("apprvl_bank").append("=").append(apprvl_bank).append(",");
      sb.append("apprvl_ymd").append("=").append(apprvl_ymd).append(",");
      sb.append("apprvl_bankaccnt").append("=").append(apprvl_bankaccnt).append(",");
      sb.append("exp_acct_no").append("=").append(exp_acct_no).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("duty_nm").append("=").append(duty_nm).append(",");
      sb.append("valid_ymd").append("=").append(valid_ymd).append(",");
      sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
      sb.append("retrn_ymd").append("=").append(retrn_ymd).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("card_state").append("=").append(card_state).append(",");
      sb.append("issu_clsf").append("=").append(issu_clsf).append(",");
      sb.append("email").append("=").append(email).append(",");
      sb.append("card_state_nm").append("=").append(card_state_nm).append(",");
      sb.append("issu_clsf_nm").append("=").append(issu_clsf_nm);
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