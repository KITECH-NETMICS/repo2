package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LosVipTabExp")
public class LosVipTabVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LosVipTabVo(){
  }

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;
  
    @ElDtoField(logicalName = "audencNo", physicalName = "audenc_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audenc_no;
  
    @ElDtoField(logicalName = "visitStartYmd", physicalName = "visit_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_start_ymd;
  
    @ElDtoField(logicalName = "visitClsYmd", physicalName = "visit_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_cls_ymd;
  
    @ElDtoField(logicalName = "visitTerm", physicalName = "visit_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_term;
  
    @ElDtoField(logicalName = "visitClsf", physicalName = "visit_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_clsf;
  
    @ElDtoField(logicalName = "visitClsfNm", physicalName = "visit_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_clsf_nm;
  
    @ElDtoField(logicalName = "visitSubj", physicalName = "visit_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_subj;
  
    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;
  
    @ElDtoField(logicalName = "chargDept", physicalName = "charg_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept;
  
    @ElDtoField(logicalName = "visitGoal", physicalName = "visit_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_goal;
  
    @ElDtoField(logicalName = "visitPlc", physicalName = "visit_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_plc;
  
    @ElDtoField(logicalName = "audencPsn", physicalName = "audenc_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String audenc_psn;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "natnCd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;
  
    @ElDtoField(logicalName = "natnNm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;
  
    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;
  
    @ElDtoField(logicalName = "reprsPsnNm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
  
    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }
  
    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }
  
    @ElVoField(physicalName = "audenc_no")
    public String getAudenc_no(){
        return audenc_no;
    }
  
    @ElVoField(physicalName = "audenc_no")
    public void setAudenc_no(String audenc_no){
        this.audenc_no = audenc_no;
    }
  
    @ElVoField(physicalName = "visit_start_ymd")
    public String getVisit_start_ymd(){
        return visit_start_ymd;
    }
  
    @ElVoField(physicalName = "visit_start_ymd")
    public void setVisit_start_ymd(String visit_start_ymd){
        this.visit_start_ymd = visit_start_ymd;
    }
  
    @ElVoField(physicalName = "visit_cls_ymd")
    public String getVisit_cls_ymd(){
        return visit_cls_ymd;
    }
  
    @ElVoField(physicalName = "visit_cls_ymd")
    public void setVisit_cls_ymd(String visit_cls_ymd){
        this.visit_cls_ymd = visit_cls_ymd;
    }
  
    @ElVoField(physicalName = "visit_term")
    public String getVisit_term(){
        return visit_term;
    }
  
    @ElVoField(physicalName = "visit_term")
    public void setVisit_term(String visit_term){
        this.visit_term = visit_term;
    }
  
    @ElVoField(physicalName = "visit_clsf")
    public String getVisit_clsf(){
        return visit_clsf;
    }
  
    @ElVoField(physicalName = "visit_clsf")
    public void setVisit_clsf(String visit_clsf){
        this.visit_clsf = visit_clsf;
    }
  
    @ElVoField(physicalName = "visit_clsf_nm")
    public String getVisit_clsf_nm(){
        return visit_clsf_nm;
    }
  
    @ElVoField(physicalName = "visit_clsf_nm")
    public void setVisit_clsf_nm(String visit_clsf_nm){
        this.visit_clsf_nm = visit_clsf_nm;
    }
  
    @ElVoField(physicalName = "visit_subj")
    public String getVisit_subj(){
        return visit_subj;
    }
  
    @ElVoField(physicalName = "visit_subj")
    public void setVisit_subj(String visit_subj){
        this.visit_subj = visit_subj;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_dept")
    public String getCharg_dept(){
        return charg_dept;
    }
  
    @ElVoField(physicalName = "charg_dept")
    public void setCharg_dept(String charg_dept){
        this.charg_dept = charg_dept;
    }
  
    @ElVoField(physicalName = "visit_goal")
    public String getVisit_goal(){
        return visit_goal;
    }
  
    @ElVoField(physicalName = "visit_goal")
    public void setVisit_goal(String visit_goal){
        this.visit_goal = visit_goal;
    }
  
    @ElVoField(physicalName = "visit_plc")
    public String getVisit_plc(){
        return visit_plc;
    }
  
    @ElVoField(physicalName = "visit_plc")
    public void setVisit_plc(String visit_plc){
        this.visit_plc = visit_plc;
    }
  
    @ElVoField(physicalName = "audenc_psn")
    public String getAudenc_psn(){
        return audenc_psn;
    }
  
    @ElVoField(physicalName = "audenc_psn")
    public void setAudenc_psn(String audenc_psn){
        this.audenc_psn = audenc_psn;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }
  
    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }
  
    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }
  
    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }
  
    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }
  
    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }
  
    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }
  
    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LosVipTabVo [");
      sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
      sb.append("audenc_no").append("=").append(audenc_no).append(",");
      sb.append("visit_start_ymd").append("=").append(visit_start_ymd).append(",");
      sb.append("visit_cls_ymd").append("=").append(visit_cls_ymd).append(",");
      sb.append("visit_term").append("=").append(visit_term).append(",");
      sb.append("visit_clsf").append("=").append(visit_clsf).append(",");
      sb.append("visit_clsf_nm").append("=").append(visit_clsf_nm).append(",");
      sb.append("visit_subj").append("=").append(visit_subj).append(",");
      sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
      sb.append("charg_dept").append("=").append(charg_dept).append(",");
      sb.append("visit_goal").append("=").append(visit_goal).append(",");
      sb.append("visit_plc").append("=").append(visit_plc).append(",");
      sb.append("audenc_psn").append("=").append(audenc_psn).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("natn_cd").append("=").append(natn_cd).append(",");
      sb.append("natn_nm").append("=").append(natn_nm).append(",");
      sb.append("odr").append("=").append(odr).append(",");
      sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar);
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