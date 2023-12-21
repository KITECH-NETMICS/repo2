package kr.re.kitech.biz.pat.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatAppRightExp")
public class PatAppRightVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatAppRightVo(){
  }

    @ElDtoField(logicalName = "rightReqNo", physicalName = "right_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "mntSeq", physicalName = "mnt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mnt_seq;
  
    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "invntNm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;
  
    @ElDtoField(logicalName = "invntEmpno", physicalName = "invnt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_empno;
  
    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "smitappPsn", physicalName = "smitapp_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_psn;
  
    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;
  
    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;
  
    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;
  
    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;
  
    @ElDtoField(logicalName = "regstNo", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;
  
    @ElDtoField(logicalName = "thsyearEvyearfeePayCloseYmd", physicalName = "thsyear_evyearfee_pay_close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thsyear_evyearfee_pay_close_ymd;
  
    @ElDtoField(logicalName = "governpayFee", physicalName = "governpay_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String governpay_fee;
  
    @ElVoField(physicalName = "right_req_no")
    public String getRight_req_no(){
        return right_req_no;
    }
  
    @ElVoField(physicalName = "right_req_no")
    public void setRight_req_no(String right_req_no){
        this.right_req_no = right_req_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "mnt_seq")
    public String getMnt_seq(){
        return mnt_seq;
    }
  
    @ElVoField(physicalName = "mnt_seq")
    public void setMnt_seq(String mnt_seq){
        this.mnt_seq = mnt_seq;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }
  
    @ElVoField(physicalName = "invnt_empno")
    public String getInvnt_empno(){
        return invnt_empno;
    }
  
    @ElVoField(physicalName = "invnt_empno")
    public void setInvnt_empno(String invnt_empno){
        this.invnt_empno = invnt_empno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "smitapp_psn")
    public String getSmitapp_psn(){
        return smitapp_psn;
    }
  
    @ElVoField(physicalName = "smitapp_psn")
    public void setSmitapp_psn(String smitapp_psn){
        this.smitapp_psn = smitapp_psn;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }
  
    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }
  
    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public String getThsyear_evyearfee_pay_close_ymd(){
        return thsyear_evyearfee_pay_close_ymd;
    }
  
    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public void setThsyear_evyearfee_pay_close_ymd(String thsyear_evyearfee_pay_close_ymd){
        this.thsyear_evyearfee_pay_close_ymd = thsyear_evyearfee_pay_close_ymd;
    }
  
    @ElVoField(physicalName = "governpay_fee")
    public String getGovernpay_fee(){
        return governpay_fee;
    }
  
    @ElVoField(physicalName = "governpay_fee")
    public void setGovernpay_fee(String governpay_fee){
        this.governpay_fee = governpay_fee;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatAppRightVo [");
      sb.append("right_req_no").append("=").append(right_req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("mnt_seq").append("=").append(mnt_seq).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
      sb.append("invnt_empno").append("=").append(invnt_empno).append(",");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("smitapp_psn").append("=").append(smitapp_psn).append(",");
      sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
      sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
      sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
      sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
      sb.append("regst_no").append("=").append(regst_no).append(",");
      sb.append("thsyear_evyearfee_pay_close_ymd").append("=").append(thsyear_evyearfee_pay_close_ymd).append(",");
      sb.append("governpay_fee").append("=").append(governpay_fee);
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