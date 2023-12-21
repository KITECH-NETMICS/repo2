package kr.re.kitech.biz.fin.seq.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinFsaledgrExp")
public class FinFsaledgrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FinFsaledgrVo(){
  }

    @ElDtoField(logicalName = "accntYrmonFrom", physicalName = "accnt_yrmon_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_yrmon_from;
  
    @ElDtoField(logicalName = "accntYrmonTo", physicalName = "accnt_yrmon_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_yrmon_to;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "level", physicalName = "level", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String level;
  
    @ElDtoField(logicalName = "remainder", physicalName = "remainder", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remainder;
  
    @ElDtoField(logicalName = "debtor", physicalName = "debtor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String debtor;
  
    @ElDtoField(logicalName = "accntCdNm", physicalName = "accnt_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_nm;
  
    @ElDtoField(logicalName = "credit", physicalName = "credit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String credit;
  
    @ElDtoField(logicalName = "balance", physicalName = "balance", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String balance;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElVoField(physicalName = "accnt_yrmon_from")
    public String getAccnt_yrmon_from(){
        return accnt_yrmon_from;
    }
  
    @ElVoField(physicalName = "accnt_yrmon_from")
    public void setAccnt_yrmon_from(String accnt_yrmon_from){
        this.accnt_yrmon_from = accnt_yrmon_from;
    }
  
    @ElVoField(physicalName = "accnt_yrmon_to")
    public String getAccnt_yrmon_to(){
        return accnt_yrmon_to;
    }
  
    @ElVoField(physicalName = "accnt_yrmon_to")
    public void setAccnt_yrmon_to(String accnt_yrmon_to){
        this.accnt_yrmon_to = accnt_yrmon_to;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "level")
    public String getLevel(){
        return level;
    }
  
    @ElVoField(physicalName = "level")
    public void setLevel(String level){
        this.level = level;
    }
  
    @ElVoField(physicalName = "remainder")
    public String getRemainder(){
        return remainder;
    }
  
    @ElVoField(physicalName = "remainder")
    public void setRemainder(String remainder){
        this.remainder = remainder;
    }
  
    @ElVoField(physicalName = "debtor")
    public String getDebtor(){
        return debtor;
    }
  
    @ElVoField(physicalName = "debtor")
    public void setDebtor(String debtor){
        this.debtor = debtor;
    }
  
    @ElVoField(physicalName = "accnt_cd_nm")
    public String getAccnt_cd_nm(){
        return accnt_cd_nm;
    }
  
    @ElVoField(physicalName = "accnt_cd_nm")
    public void setAccnt_cd_nm(String accnt_cd_nm){
        this.accnt_cd_nm = accnt_cd_nm;
    }
  
    @ElVoField(physicalName = "credit")
    public String getCredit(){
        return credit;
    }
  
    @ElVoField(physicalName = "credit")
    public void setCredit(String credit){
        this.credit = credit;
    }
  
    @ElVoField(physicalName = "balance")
    public String getBalance(){
        return balance;
    }
  
    @ElVoField(physicalName = "balance")
    public void setBalance(String balance){
        this.balance = balance;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FinFsaledgrVo [");
      sb.append("accnt_yrmon_from").append("=").append(accnt_yrmon_from).append(",");
      sb.append("accnt_yrmon_to").append("=").append(accnt_yrmon_to).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("level").append("=").append(level).append(",");
      sb.append("remainder").append("=").append(remainder).append(",");
      sb.append("debtor").append("=").append(debtor).append(",");
      sb.append("accnt_cd_nm").append("=").append(accnt_cd_nm).append(",");
      sb.append("credit").append("=").append(credit).append(",");
      sb.append("balance").append("=").append(balance).append(",");
      sb.append("seq").append("=").append(seq);
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