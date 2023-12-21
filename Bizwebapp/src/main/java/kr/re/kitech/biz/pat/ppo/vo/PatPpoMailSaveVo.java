package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPpoMailSaveExp")
public class PatPpoMailSaveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPpoMailSaveVo(){
  }

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "targetType", physicalName = "target_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target_type;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;
  
    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "mailId", physicalName = "mail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_id;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "patoficMngNo", physicalName = "patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_mng_no;
  
    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;
  
    @ElDtoField(logicalName = "smitappNatnCd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;
  
    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;
  
    @ElDtoField(logicalName = "techClsfNm", physicalName = "tech_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf_nm;
  
    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;
  
    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;
  
    @ElDtoField(logicalName = "sendAddr", physicalName = "send_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_addr;
  
    @ElDtoField(logicalName = "sendName", physicalName = "send_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_name;
  
    @ElDtoField(logicalName = "mailSubject", physicalName = "mail_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_subject;
  
    @ElDtoField(logicalName = "mailContents", physicalName = "mail_contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_contents;
  
    @ElDtoField(logicalName = "recvType", physicalName = "recv_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_type;
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "target_type")
    public String getTarget_type(){
        return target_type;
    }
  
    @ElVoField(physicalName = "target_type")
    public void setTarget_type(String target_type){
        this.target_type = target_type;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }
  
    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }
  
    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
  
    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }
  
    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }
  
    @ElVoField(physicalName = "mail_id")
    public String getMail_id(){
        return mail_id;
    }
  
    @ElVoField(physicalName = "mail_id")
    public void setMail_id(String mail_id){
        this.mail_id = mail_id;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "patofic_mng_no")
    public String getPatofic_mng_no(){
        return patofic_mng_no;
    }
  
    @ElVoField(physicalName = "patofic_mng_no")
    public void setPatofic_mng_no(String patofic_mng_no){
        this.patofic_mng_no = patofic_mng_no;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public String getSmitapp_natn_cd(){
        return smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_cd")
    public void setSmitapp_natn_cd(String smitapp_natn_cd){
        this.smitapp_natn_cd = smitapp_natn_cd;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public String getTech_clsf_nm(){
        return tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public void setTech_clsf_nm(String tech_clsf_nm){
        this.tech_clsf_nm = tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }
  
    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }
  
    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }
  
    @ElVoField(physicalName = "send_addr")
    public String getSend_addr(){
        return send_addr;
    }
  
    @ElVoField(physicalName = "send_addr")
    public void setSend_addr(String send_addr){
        this.send_addr = send_addr;
    }
  
    @ElVoField(physicalName = "send_name")
    public String getSend_name(){
        return send_name;
    }
  
    @ElVoField(physicalName = "send_name")
    public void setSend_name(String send_name){
        this.send_name = send_name;
    }
  
    @ElVoField(physicalName = "mail_subject")
    public String getMail_subject(){
        return mail_subject;
    }
  
    @ElVoField(physicalName = "mail_subject")
    public void setMail_subject(String mail_subject){
        this.mail_subject = mail_subject;
    }
  
    @ElVoField(physicalName = "mail_contents")
    public String getMail_contents(){
        return mail_contents;
    }
  
    @ElVoField(physicalName = "mail_contents")
    public void setMail_contents(String mail_contents){
        this.mail_contents = mail_contents;
    }
  
    @ElVoField(physicalName = "recv_type")
    public String getRecv_type(){
        return recv_type;
    }
  
    @ElVoField(physicalName = "recv_type")
    public void setRecv_type(String recv_type){
        this.recv_type = recv_type;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPpoMailSaveVo [");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("target_type").append("=").append(target_type).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("mobile").append("=").append(mobile).append(",");
      sb.append("email").append("=").append(email).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
      sb.append("mail_id").append("=").append(mail_id).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("patofic_mng_no").append("=").append(patofic_mng_no).append(",");
      sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
      sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
      sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
      sb.append("tech_clsf_nm").append("=").append(tech_clsf_nm).append(",");
      sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
      sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
      sb.append("send_addr").append("=").append(send_addr).append(",");
      sb.append("send_name").append("=").append(send_name).append(",");
      sb.append("mail_subject").append("=").append(mail_subject).append(",");
      sb.append("mail_contents").append("=").append(mail_contents).append(",");
      sb.append("recv_type").append("=").append(recv_type);
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