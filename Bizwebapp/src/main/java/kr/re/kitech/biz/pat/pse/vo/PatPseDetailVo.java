package kr.re.kitech.biz.pat.pse.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPseDetailExp")
public class PatPseDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPseDetailVo(){
  }

    @ElDtoField(logicalName = "examId", physicalName = "exam_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_id;
  
    @ElDtoField(logicalName = "wriId", physicalName = "wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_id;
  
    @ElDtoField(logicalName = "wriNm", physicalName = "wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_nm;
  
    @ElDtoField(logicalName = "wriDaytm", physicalName = "wri_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_daytm;
  
    @ElDtoField(logicalName = "examYear", physicalName = "exam_year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_year;
  
    @ElDtoField(logicalName = "examCnt", physicalName = "exam_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_cnt;
  
    @ElDtoField(logicalName = "examDaytm", physicalName = "exam_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_daytm;
  
    @ElDtoField(logicalName = "examHour", physicalName = "exam_hour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_hour;
  
    @ElDtoField(logicalName = "examAddr", physicalName = "exam_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_addr;
  
    @ElDtoField(logicalName = "examTitle", physicalName = "exam_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_title;
  
    @ElDtoField(logicalName = "examComment", physicalName = "exam_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_comment;
  
    @ElDtoField(logicalName = "examEntry", physicalName = "exam_entry", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_entry;
  
    @ElDtoField(logicalName = "objExamClsf", physicalName = "obj_exam_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_exam_clsf;
  
    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "invntSyspaynm", physicalName = "invnt_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspaynm;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "objEval1", physicalName = "obj_eval_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_eval_1;
  
    @ElDtoField(logicalName = "objComment", physicalName = "obj_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_comment;
  
    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "objExamId", physicalName = "obj_exam_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_exam_id;
  
    @ElVoField(physicalName = "exam_id")
    public String getExam_id(){
        return exam_id;
    }
  
    @ElVoField(physicalName = "exam_id")
    public void setExam_id(String exam_id){
        this.exam_id = exam_id;
    }
  
    @ElVoField(physicalName = "wri_id")
    public String getWri_id(){
        return wri_id;
    }
  
    @ElVoField(physicalName = "wri_id")
    public void setWri_id(String wri_id){
        this.wri_id = wri_id;
    }
  
    @ElVoField(physicalName = "wri_nm")
    public String getWri_nm(){
        return wri_nm;
    }
  
    @ElVoField(physicalName = "wri_nm")
    public void setWri_nm(String wri_nm){
        this.wri_nm = wri_nm;
    }
  
    @ElVoField(physicalName = "wri_daytm")
    public String getWri_daytm(){
        return wri_daytm;
    }
  
    @ElVoField(physicalName = "wri_daytm")
    public void setWri_daytm(String wri_daytm){
        this.wri_daytm = wri_daytm;
    }
  
    @ElVoField(physicalName = "exam_year")
    public String getExam_year(){
        return exam_year;
    }
  
    @ElVoField(physicalName = "exam_year")
    public void setExam_year(String exam_year){
        this.exam_year = exam_year;
    }
  
    @ElVoField(physicalName = "exam_cnt")
    public String getExam_cnt(){
        return exam_cnt;
    }
  
    @ElVoField(physicalName = "exam_cnt")
    public void setExam_cnt(String exam_cnt){
        this.exam_cnt = exam_cnt;
    }
  
    @ElVoField(physicalName = "exam_daytm")
    public String getExam_daytm(){
        return exam_daytm;
    }
  
    @ElVoField(physicalName = "exam_daytm")
    public void setExam_daytm(String exam_daytm){
        this.exam_daytm = exam_daytm;
    }
  
    @ElVoField(physicalName = "exam_hour")
    public String getExam_hour(){
        return exam_hour;
    }
  
    @ElVoField(physicalName = "exam_hour")
    public void setExam_hour(String exam_hour){
        this.exam_hour = exam_hour;
    }
  
    @ElVoField(physicalName = "exam_addr")
    public String getExam_addr(){
        return exam_addr;
    }
  
    @ElVoField(physicalName = "exam_addr")
    public void setExam_addr(String exam_addr){
        this.exam_addr = exam_addr;
    }
  
    @ElVoField(physicalName = "exam_title")
    public String getExam_title(){
        return exam_title;
    }
  
    @ElVoField(physicalName = "exam_title")
    public void setExam_title(String exam_title){
        this.exam_title = exam_title;
    }
  
    @ElVoField(physicalName = "exam_comment")
    public String getExam_comment(){
        return exam_comment;
    }
  
    @ElVoField(physicalName = "exam_comment")
    public void setExam_comment(String exam_comment){
        this.exam_comment = exam_comment;
    }
  
    @ElVoField(physicalName = "exam_entry")
    public String getExam_entry(){
        return exam_entry;
    }
  
    @ElVoField(physicalName = "exam_entry")
    public void setExam_entry(String exam_entry){
        this.exam_entry = exam_entry;
    }
  
    @ElVoField(physicalName = "obj_exam_clsf")
    public String getObj_exam_clsf(){
        return obj_exam_clsf;
    }
  
    @ElVoField(physicalName = "obj_exam_clsf")
    public void setObj_exam_clsf(String obj_exam_clsf){
        this.obj_exam_clsf = obj_exam_clsf;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspaynm")
    public String getInvnt_syspaynm(){
        return invnt_syspaynm;
    }
  
    @ElVoField(physicalName = "invnt_syspaynm")
    public void setInvnt_syspaynm(String invnt_syspaynm){
        this.invnt_syspaynm = invnt_syspaynm;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "obj_eval_1")
    public String getObj_eval_1(){
        return obj_eval_1;
    }
  
    @ElVoField(physicalName = "obj_eval_1")
    public void setObj_eval_1(String obj_eval_1){
        this.obj_eval_1 = obj_eval_1;
    }
  
    @ElVoField(physicalName = "obj_comment")
    public String getObj_comment(){
        return obj_comment;
    }
  
    @ElVoField(physicalName = "obj_comment")
    public void setObj_comment(String obj_comment){
        this.obj_comment = obj_comment;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "obj_exam_id")
    public String getObj_exam_id(){
        return obj_exam_id;
    }
  
    @ElVoField(physicalName = "obj_exam_id")
    public void setObj_exam_id(String obj_exam_id){
        this.obj_exam_id = obj_exam_id;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPseDetailVo [");
      sb.append("exam_id").append("=").append(exam_id).append(",");
      sb.append("wri_id").append("=").append(wri_id).append(",");
      sb.append("wri_nm").append("=").append(wri_nm).append(",");
      sb.append("wri_daytm").append("=").append(wri_daytm).append(",");
      sb.append("exam_year").append("=").append(exam_year).append(",");
      sb.append("exam_cnt").append("=").append(exam_cnt).append(",");
      sb.append("exam_daytm").append("=").append(exam_daytm).append(",");
      sb.append("exam_hour").append("=").append(exam_hour).append(",");
      sb.append("exam_addr").append("=").append(exam_addr).append(",");
      sb.append("exam_title").append("=").append(exam_title).append(",");
      sb.append("exam_comment").append("=").append(exam_comment).append(",");
      sb.append("exam_entry").append("=").append(exam_entry).append(",");
      sb.append("obj_exam_clsf").append("=").append(obj_exam_clsf).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("invnt_syspaynm").append("=").append(invnt_syspaynm).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("obj_eval_1").append("=").append(obj_eval_1).append(",");
      sb.append("obj_comment").append("=").append(obj_comment).append(",");
      sb.append("prj_nm").append("=").append(prj_nm).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("obj_exam_id").append("=").append(obj_exam_id);
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