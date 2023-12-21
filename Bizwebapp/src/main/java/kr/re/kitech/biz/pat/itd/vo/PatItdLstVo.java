package kr.re.kitech.biz.pat.itd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatItdLstExp")
public class PatItdLstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatItdLstVo(){
  }

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "mandatePsnSyspayno", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "refNo", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;
  
    @ElDtoField(logicalName = "invntPsnNm", physicalName = "invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_nm;
  
    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;
  
    @ElDtoField(logicalName = "jobTitle", physicalName = "job_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_title;
  
    @ElDtoField(logicalName = "todoTitle", physicalName = "todo_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_title;
  
    @ElDtoField(logicalName = "todoDueDate", physicalName = "todo_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_due_date;
  
    @ElDtoField(logicalName = "todoPro", physicalName = "todo_pro", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String todo_pro;
  
    @ElDtoField(logicalName = "pageId", physicalName = "page_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_id;
  
    @ElDtoField(logicalName = "pageDetailId", physicalName = "page_detail_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page_detail_id;
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }
  
    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }
  
    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }
  
    @ElVoField(physicalName = "invnt_psn_nm")
    public String getInvnt_psn_nm(){
        return invnt_psn_nm;
    }
  
    @ElVoField(physicalName = "invnt_psn_nm")
    public void setInvnt_psn_nm(String invnt_psn_nm){
        this.invnt_psn_nm = invnt_psn_nm;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }
  
    @ElVoField(physicalName = "job_title")
    public String getJob_title(){
        return job_title;
    }
  
    @ElVoField(physicalName = "job_title")
    public void setJob_title(String job_title){
        this.job_title = job_title;
    }
  
    @ElVoField(physicalName = "todo_title")
    public String getTodo_title(){
        return todo_title;
    }
  
    @ElVoField(physicalName = "todo_title")
    public void setTodo_title(String todo_title){
        this.todo_title = todo_title;
    }
  
    @ElVoField(physicalName = "todo_due_date")
    public String getTodo_due_date(){
        return todo_due_date;
    }
  
    @ElVoField(physicalName = "todo_due_date")
    public void setTodo_due_date(String todo_due_date){
        this.todo_due_date = todo_due_date;
    }
  
    @ElVoField(physicalName = "todo_pro")
    public String getTodo_pro(){
        return todo_pro;
    }
  
    @ElVoField(physicalName = "todo_pro")
    public void setTodo_pro(String todo_pro){
        this.todo_pro = todo_pro;
    }
  
    @ElVoField(physicalName = "page_id")
    public String getPage_id(){
        return page_id;
    }
  
    @ElVoField(physicalName = "page_id")
    public void setPage_id(String page_id){
        this.page_id = page_id;
    }
  
    @ElVoField(physicalName = "page_detail_id")
    public String getPage_detail_id(){
        return page_detail_id;
    }
  
    @ElVoField(physicalName = "page_detail_id")
    public void setPage_detail_id(String page_detail_id){
        this.page_detail_id = page_detail_id;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatItdLstVo [");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("ref_no").append("=").append(ref_no).append(",");
      sb.append("invnt_psn_nm").append("=").append(invnt_psn_nm).append(",");
      sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
      sb.append("job_title").append("=").append(job_title).append(",");
      sb.append("todo_title").append("=").append(todo_title).append(",");
      sb.append("todo_due_date").append("=").append(todo_due_date).append(",");
      sb.append("todo_pro").append("=").append(todo_pro).append(",");
      sb.append("page_id").append("=").append(page_id).append(",");
      sb.append("page_detail_id").append("=").append(page_detail_id);
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