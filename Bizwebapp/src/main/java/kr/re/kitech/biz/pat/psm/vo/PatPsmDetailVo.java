package kr.re.kitech.biz.pat.psm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPsmDetailExp")
public class PatPsmDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsmDetailVo(){
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
  
    @ElDtoField(logicalName = "jobStateCd", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "areaNm", physicalName = "area_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area_nm;
  
    @ElDtoField(logicalName = "areaCd", physicalName = "area_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String area_cd;
  
    @ElDtoField(logicalName = "objExamClsf", physicalName = "obj_exam_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_exam_clsf;
  
    @ElDtoField(logicalName = "rvewObjct", physicalName = "rvew_objct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_objct;
  
    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "relPsnNm", physicalName = "rel_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rel_psn_nm;
  
    @ElDtoField(logicalName = "key1", physicalName = "key_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_1;
  
    @ElDtoField(logicalName = "rvewRstCd", physicalName = "rvew_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst_cd;
  
    @ElDtoField(logicalName = "rvewRst", physicalName = "rvew_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst;
  
    @ElDtoField(logicalName = "prjNm", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;
  
    @ElDtoField(logicalName = "key2", physicalName = "key_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_2;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "objExamId", physicalName = "obj_exam_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String obj_exam_id;
  
    @ElDtoField(logicalName = "comment", physicalName = "comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comment;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "rvewYr", physicalName = "rvew_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_yr;
  
    @ElDtoField(logicalName = "rvewSbj", physicalName = "rvew_sbj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_sbj;
  
    @ElDtoField(logicalName = "rvewSeq", physicalName = "rvew_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_seq;
  
    @ElDtoField(logicalName = "rvewYmd", physicalName = "rvew_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_ymd;
  
    @ElDtoField(logicalName = "rvewPlc", physicalName = "rvew_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_plc;
  
    @ElDtoField(logicalName = "openWay", physicalName = "open_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_way;
  
    @ElDtoField(logicalName = "deptTyp", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;
  
    @ElDtoField(logicalName = "deptTypNm", physicalName = "dept_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ_nm;
  
    @ElDtoField(logicalName = "meetClsf", physicalName = "meet_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_clsf;
  
    @ElDtoField(logicalName = "techClsf", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;
  
    @ElDtoField(logicalName = "elecappDocuNo", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;
  
    @ElDtoField(logicalName = "setYn", physicalName = "set_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String set_yn;
  
    @ElDtoField(logicalName = "regstNm", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;
  
    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;
  
    @ElDtoField(logicalName = "bizClsf", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "itemClsf", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf;
  
    @ElDtoField(logicalName = "itemSeq", physicalName = "item_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_seq;
  
    @ElDtoField(logicalName = "itemClsfSeq", physicalName = "item_clsf_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf_seq;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "chrgPsn", physicalName = "chrg_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_psn;
  
    @ElDtoField(logicalName = "cmtClsf", physicalName = "cmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmt_clsf;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
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
  
    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }
  
    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "area_nm")
    public String getArea_nm(){
        return area_nm;
    }
  
    @ElVoField(physicalName = "area_nm")
    public void setArea_nm(String area_nm){
        this.area_nm = area_nm;
    }
  
    @ElVoField(physicalName = "area_cd")
    public String getArea_cd(){
        return area_cd;
    }
  
    @ElVoField(physicalName = "area_cd")
    public void setArea_cd(String area_cd){
        this.area_cd = area_cd;
    }
  
    @ElVoField(physicalName = "obj_exam_clsf")
    public String getObj_exam_clsf(){
        return obj_exam_clsf;
    }
  
    @ElVoField(physicalName = "obj_exam_clsf")
    public void setObj_exam_clsf(String obj_exam_clsf){
        this.obj_exam_clsf = obj_exam_clsf;
    }
  
    @ElVoField(physicalName = "rvew_objct")
    public String getRvew_objct(){
        return rvew_objct;
    }
  
    @ElVoField(physicalName = "rvew_objct")
    public void setRvew_objct(String rvew_objct){
        this.rvew_objct = rvew_objct;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "rel_psn_nm")
    public String getRel_psn_nm(){
        return rel_psn_nm;
    }
  
    @ElVoField(physicalName = "rel_psn_nm")
    public void setRel_psn_nm(String rel_psn_nm){
        this.rel_psn_nm = rel_psn_nm;
    }
  
    @ElVoField(physicalName = "key_1")
    public String getKey_1(){
        return key_1;
    }
  
    @ElVoField(physicalName = "key_1")
    public void setKey_1(String key_1){
        this.key_1 = key_1;
    }
  
    @ElVoField(physicalName = "rvew_rst_cd")
    public String getRvew_rst_cd(){
        return rvew_rst_cd;
    }
  
    @ElVoField(physicalName = "rvew_rst_cd")
    public void setRvew_rst_cd(String rvew_rst_cd){
        this.rvew_rst_cd = rvew_rst_cd;
    }
  
    @ElVoField(physicalName = "rvew_rst")
    public String getRvew_rst(){
        return rvew_rst;
    }
  
    @ElVoField(physicalName = "rvew_rst")
    public void setRvew_rst(String rvew_rst){
        this.rvew_rst = rvew_rst;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }
  
    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }
  
    @ElVoField(physicalName = "key_2")
    public String getKey_2(){
        return key_2;
    }
  
    @ElVoField(physicalName = "key_2")
    public void setKey_2(String key_2){
        this.key_2 = key_2;
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
  
    @ElVoField(physicalName = "comment")
    public String getComment(){
        return comment;
    }
  
    @ElVoField(physicalName = "comment")
    public void setComment(String comment){
        this.comment = comment;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "rvew_yr")
    public String getRvew_yr(){
        return rvew_yr;
    }
  
    @ElVoField(physicalName = "rvew_yr")
    public void setRvew_yr(String rvew_yr){
        this.rvew_yr = rvew_yr;
    }
  
    @ElVoField(physicalName = "rvew_sbj")
    public String getRvew_sbj(){
        return rvew_sbj;
    }
  
    @ElVoField(physicalName = "rvew_sbj")
    public void setRvew_sbj(String rvew_sbj){
        this.rvew_sbj = rvew_sbj;
    }
  
    @ElVoField(physicalName = "rvew_seq")
    public String getRvew_seq(){
        return rvew_seq;
    }
  
    @ElVoField(physicalName = "rvew_seq")
    public void setRvew_seq(String rvew_seq){
        this.rvew_seq = rvew_seq;
    }
  
    @ElVoField(physicalName = "rvew_ymd")
    public String getRvew_ymd(){
        return rvew_ymd;
    }
  
    @ElVoField(physicalName = "rvew_ymd")
    public void setRvew_ymd(String rvew_ymd){
        this.rvew_ymd = rvew_ymd;
    }
  
    @ElVoField(physicalName = "rvew_plc")
    public String getRvew_plc(){
        return rvew_plc;
    }
  
    @ElVoField(physicalName = "rvew_plc")
    public void setRvew_plc(String rvew_plc){
        this.rvew_plc = rvew_plc;
    }
  
    @ElVoField(physicalName = "open_way")
    public String getOpen_way(){
        return open_way;
    }
  
    @ElVoField(physicalName = "open_way")
    public void setOpen_way(String open_way){
        this.open_way = open_way;
    }
  
    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }
  
    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }
  
    @ElVoField(physicalName = "dept_typ_nm")
    public String getDept_typ_nm(){
        return dept_typ_nm;
    }
  
    @ElVoField(physicalName = "dept_typ_nm")
    public void setDept_typ_nm(String dept_typ_nm){
        this.dept_typ_nm = dept_typ_nm;
    }
  
    @ElVoField(physicalName = "meet_clsf")
    public String getMeet_clsf(){
        return meet_clsf;
    }
  
    @ElVoField(physicalName = "meet_clsf")
    public void setMeet_clsf(String meet_clsf){
        this.meet_clsf = meet_clsf;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }
  
    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }
  
    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }
  
    @ElVoField(physicalName = "set_yn")
    public String getSet_yn(){
        return set_yn;
    }
  
    @ElVoField(physicalName = "set_yn")
    public void setSet_yn(String set_yn){
        this.set_yn = set_yn;
    }
  
    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }
  
    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }
  
    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }
  
    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "item_clsf")
    public String getItem_clsf(){
        return item_clsf;
    }
  
    @ElVoField(physicalName = "item_clsf")
    public void setItem_clsf(String item_clsf){
        this.item_clsf = item_clsf;
    }
  
    @ElVoField(physicalName = "item_seq")
    public String getItem_seq(){
        return item_seq;
    }
  
    @ElVoField(physicalName = "item_seq")
    public void setItem_seq(String item_seq){
        this.item_seq = item_seq;
    }
  
    @ElVoField(physicalName = "item_clsf_seq")
    public String getItem_clsf_seq(){
        return item_clsf_seq;
    }
  
    @ElVoField(physicalName = "item_clsf_seq")
    public void setItem_clsf_seq(String item_clsf_seq){
        this.item_clsf_seq = item_clsf_seq;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "chrg_psn")
    public String getChrg_psn(){
        return chrg_psn;
    }
  
    @ElVoField(physicalName = "chrg_psn")
    public void setChrg_psn(String chrg_psn){
        this.chrg_psn = chrg_psn;
    }
  
    @ElVoField(physicalName = "cmt_clsf")
    public String getCmt_clsf(){
        return cmt_clsf;
    }
  
    @ElVoField(physicalName = "cmt_clsf")
    public void setCmt_clsf(String cmt_clsf){
        this.cmt_clsf = cmt_clsf;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsmDetailVo [");
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
      sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("area_nm").append("=").append(area_nm).append(",");
      sb.append("area_cd").append("=").append(area_cd).append(",");
      sb.append("obj_exam_clsf").append("=").append(obj_exam_clsf).append(",");
      sb.append("rvew_objct").append("=").append(rvew_objct).append(",");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("rel_psn_nm").append("=").append(rel_psn_nm).append(",");
      sb.append("key_1").append("=").append(key_1).append(",");
      sb.append("rvew_rst_cd").append("=").append(rvew_rst_cd).append(",");
      sb.append("rvew_rst").append("=").append(rvew_rst).append(",");
      sb.append("prj_nm").append("=").append(prj_nm).append(",");
      sb.append("key_2").append("=").append(key_2).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("obj_exam_id").append("=").append(obj_exam_id).append(",");
      sb.append("comment").append("=").append(comment).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("rvew_yr").append("=").append(rvew_yr).append(",");
      sb.append("rvew_sbj").append("=").append(rvew_sbj).append(",");
      sb.append("rvew_seq").append("=").append(rvew_seq).append(",");
      sb.append("rvew_ymd").append("=").append(rvew_ymd).append(",");
      sb.append("rvew_plc").append("=").append(rvew_plc).append(",");
      sb.append("open_way").append("=").append(open_way).append(",");
      sb.append("dept_typ").append("=").append(dept_typ).append(",");
      sb.append("dept_typ_nm").append("=").append(dept_typ_nm).append(",");
      sb.append("meet_clsf").append("=").append(meet_clsf).append(",");
      sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
      sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
      sb.append("set_yn").append("=").append(set_yn).append(",");
      sb.append("regst_nm").append("=").append(regst_nm).append(",");
      sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
      sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("item_clsf").append("=").append(item_clsf).append(",");
      sb.append("item_seq").append("=").append(item_seq).append(",");
      sb.append("item_clsf_seq").append("=").append(item_clsf_seq).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("chrg_psn").append("=").append(chrg_psn).append(",");
      sb.append("cmt_clsf").append("=").append(cmt_clsf).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno);
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