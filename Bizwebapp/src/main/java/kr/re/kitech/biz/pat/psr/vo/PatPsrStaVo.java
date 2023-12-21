package kr.re.kitech.biz.pat.psr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPsrStaExp")
public class PatPsrStaVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPsrStaVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;
  
    @ElDtoField(logicalName = "stateDesc", physicalName = "state_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_desc;
  
    @ElDtoField(logicalName = "jobCd", physicalName = "job_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_cd;
  
    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;
  
    @ElDtoField(logicalName = "srhKey", physicalName = "srh_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_key;
  
    @ElDtoField(logicalName = "srhState", physicalName = "srh_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_state;
  
    @ElDtoField(logicalName = "srhCompYn", physicalName = "srh_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_comp_yn;
  
    @ElDtoField(logicalName = "examKey", physicalName = "exam_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_key;
  
    @ElDtoField(logicalName = "examState", physicalName = "exam_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_state;
  
    @ElDtoField(logicalName = "examCompYn", physicalName = "exam_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_comp_yn;
  
    @ElDtoField(logicalName = "pscKey", physicalName = "psc_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psc_key;
  
    @ElDtoField(logicalName = "pscState", physicalName = "psc_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psc_state;
  
    @ElDtoField(logicalName = "pscCompYn", physicalName = "psc_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psc_comp_yn;
  
    @ElDtoField(logicalName = "papKey", physicalName = "pap_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pap_key;
  
    @ElDtoField(logicalName = "papState", physicalName = "pap_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pap_state;
  
    @ElDtoField(logicalName = "papCompYn", physicalName = "pap_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pap_comp_yn;
  
    @ElDtoField(logicalName = "pdKey", physicalName = "pd_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pd_key;
  
    @ElDtoField(logicalName = "pdState", physicalName = "pd_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pd_state;
  
    @ElDtoField(logicalName = "pdCompYn", physicalName = "pd_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pd_comp_yn;
  
    @ElDtoField(logicalName = "ppdKey", physicalName = "ppd_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ppd_key;
  
    @ElDtoField(logicalName = "ppdState", physicalName = "ppd_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ppd_state;
  
    @ElDtoField(logicalName = "ppdCompYn", physicalName = "ppd_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ppd_comp_yn;
  
    @ElDtoField(logicalName = "oaKey", physicalName = "oa_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_key;
  
    @ElDtoField(logicalName = "oaState", physicalName = "oa_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_state;
  
    @ElDtoField(logicalName = "oaCompYn", physicalName = "oa_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oa_comp_yn;
  
    @ElDtoField(logicalName = "regKey", physicalName = "reg_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_key;
  
    @ElDtoField(logicalName = "regState", physicalName = "reg_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_state;
  
    @ElDtoField(logicalName = "regCompYn", physicalName = "reg_comp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reg_comp_yn;
  
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
  
    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }
  
    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }
  
    @ElVoField(physicalName = "state_desc")
    public String getState_desc(){
        return state_desc;
    }
  
    @ElVoField(physicalName = "state_desc")
    public void setState_desc(String state_desc){
        this.state_desc = state_desc;
    }
  
    @ElVoField(physicalName = "job_cd")
    public String getJob_cd(){
        return job_cd;
    }
  
    @ElVoField(physicalName = "job_cd")
    public void setJob_cd(String job_cd){
        this.job_cd = job_cd;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }
  
    @ElVoField(physicalName = "srh_key")
    public String getSrh_key(){
        return srh_key;
    }
  
    @ElVoField(physicalName = "srh_key")
    public void setSrh_key(String srh_key){
        this.srh_key = srh_key;
    }
  
    @ElVoField(physicalName = "srh_state")
    public String getSrh_state(){
        return srh_state;
    }
  
    @ElVoField(physicalName = "srh_state")
    public void setSrh_state(String srh_state){
        this.srh_state = srh_state;
    }
  
    @ElVoField(physicalName = "srh_comp_yn")
    public String getSrh_comp_yn(){
        return srh_comp_yn;
    }
  
    @ElVoField(physicalName = "srh_comp_yn")
    public void setSrh_comp_yn(String srh_comp_yn){
        this.srh_comp_yn = srh_comp_yn;
    }
  
    @ElVoField(physicalName = "exam_key")
    public String getExam_key(){
        return exam_key;
    }
  
    @ElVoField(physicalName = "exam_key")
    public void setExam_key(String exam_key){
        this.exam_key = exam_key;
    }
  
    @ElVoField(physicalName = "exam_state")
    public String getExam_state(){
        return exam_state;
    }
  
    @ElVoField(physicalName = "exam_state")
    public void setExam_state(String exam_state){
        this.exam_state = exam_state;
    }
  
    @ElVoField(physicalName = "exam_comp_yn")
    public String getExam_comp_yn(){
        return exam_comp_yn;
    }
  
    @ElVoField(physicalName = "exam_comp_yn")
    public void setExam_comp_yn(String exam_comp_yn){
        this.exam_comp_yn = exam_comp_yn;
    }
  
    @ElVoField(physicalName = "psc_key")
    public String getPsc_key(){
        return psc_key;
    }
  
    @ElVoField(physicalName = "psc_key")
    public void setPsc_key(String psc_key){
        this.psc_key = psc_key;
    }
  
    @ElVoField(physicalName = "psc_state")
    public String getPsc_state(){
        return psc_state;
    }
  
    @ElVoField(physicalName = "psc_state")
    public void setPsc_state(String psc_state){
        this.psc_state = psc_state;
    }
  
    @ElVoField(physicalName = "psc_comp_yn")
    public String getPsc_comp_yn(){
        return psc_comp_yn;
    }
  
    @ElVoField(physicalName = "psc_comp_yn")
    public void setPsc_comp_yn(String psc_comp_yn){
        this.psc_comp_yn = psc_comp_yn;
    }
  
    @ElVoField(physicalName = "pap_key")
    public String getPap_key(){
        return pap_key;
    }
  
    @ElVoField(physicalName = "pap_key")
    public void setPap_key(String pap_key){
        this.pap_key = pap_key;
    }
  
    @ElVoField(physicalName = "pap_state")
    public String getPap_state(){
        return pap_state;
    }
  
    @ElVoField(physicalName = "pap_state")
    public void setPap_state(String pap_state){
        this.pap_state = pap_state;
    }
  
    @ElVoField(physicalName = "pap_comp_yn")
    public String getPap_comp_yn(){
        return pap_comp_yn;
    }
  
    @ElVoField(physicalName = "pap_comp_yn")
    public void setPap_comp_yn(String pap_comp_yn){
        this.pap_comp_yn = pap_comp_yn;
    }
  
    @ElVoField(physicalName = "pd_key")
    public String getPd_key(){
        return pd_key;
    }
  
    @ElVoField(physicalName = "pd_key")
    public void setPd_key(String pd_key){
        this.pd_key = pd_key;
    }
  
    @ElVoField(physicalName = "pd_state")
    public String getPd_state(){
        return pd_state;
    }
  
    @ElVoField(physicalName = "pd_state")
    public void setPd_state(String pd_state){
        this.pd_state = pd_state;
    }
  
    @ElVoField(physicalName = "pd_comp_yn")
    public String getPd_comp_yn(){
        return pd_comp_yn;
    }
  
    @ElVoField(physicalName = "pd_comp_yn")
    public void setPd_comp_yn(String pd_comp_yn){
        this.pd_comp_yn = pd_comp_yn;
    }
  
    @ElVoField(physicalName = "ppd_key")
    public String getPpd_key(){
        return ppd_key;
    }
  
    @ElVoField(physicalName = "ppd_key")
    public void setPpd_key(String ppd_key){
        this.ppd_key = ppd_key;
    }
  
    @ElVoField(physicalName = "ppd_state")
    public String getPpd_state(){
        return ppd_state;
    }
  
    @ElVoField(physicalName = "ppd_state")
    public void setPpd_state(String ppd_state){
        this.ppd_state = ppd_state;
    }
  
    @ElVoField(physicalName = "ppd_comp_yn")
    public String getPpd_comp_yn(){
        return ppd_comp_yn;
    }
  
    @ElVoField(physicalName = "ppd_comp_yn")
    public void setPpd_comp_yn(String ppd_comp_yn){
        this.ppd_comp_yn = ppd_comp_yn;
    }
  
    @ElVoField(physicalName = "oa_key")
    public String getOa_key(){
        return oa_key;
    }
  
    @ElVoField(physicalName = "oa_key")
    public void setOa_key(String oa_key){
        this.oa_key = oa_key;
    }
  
    @ElVoField(physicalName = "oa_state")
    public String getOa_state(){
        return oa_state;
    }
  
    @ElVoField(physicalName = "oa_state")
    public void setOa_state(String oa_state){
        this.oa_state = oa_state;
    }
  
    @ElVoField(physicalName = "oa_comp_yn")
    public String getOa_comp_yn(){
        return oa_comp_yn;
    }
  
    @ElVoField(physicalName = "oa_comp_yn")
    public void setOa_comp_yn(String oa_comp_yn){
        this.oa_comp_yn = oa_comp_yn;
    }
  
    @ElVoField(physicalName = "reg_key")
    public String getReg_key(){
        return reg_key;
    }
  
    @ElVoField(physicalName = "reg_key")
    public void setReg_key(String reg_key){
        this.reg_key = reg_key;
    }
  
    @ElVoField(physicalName = "reg_state")
    public String getReg_state(){
        return reg_state;
    }
  
    @ElVoField(physicalName = "reg_state")
    public void setReg_state(String reg_state){
        this.reg_state = reg_state;
    }
  
    @ElVoField(physicalName = "reg_comp_yn")
    public String getReg_comp_yn(){
        return reg_comp_yn;
    }
  
    @ElVoField(physicalName = "reg_comp_yn")
    public void setReg_comp_yn(String reg_comp_yn){
        this.reg_comp_yn = reg_comp_yn;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPsrStaVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("state").append("=").append(state).append(",");
      sb.append("state_desc").append("=").append(state_desc).append(",");
      sb.append("job_cd").append("=").append(job_cd).append(",");
      sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
      sb.append("srh_key").append("=").append(srh_key).append(",");
      sb.append("srh_state").append("=").append(srh_state).append(",");
      sb.append("srh_comp_yn").append("=").append(srh_comp_yn).append(",");
      sb.append("exam_key").append("=").append(exam_key).append(",");
      sb.append("exam_state").append("=").append(exam_state).append(",");
      sb.append("exam_comp_yn").append("=").append(exam_comp_yn).append(",");
      sb.append("psc_key").append("=").append(psc_key).append(",");
      sb.append("psc_state").append("=").append(psc_state).append(",");
      sb.append("psc_comp_yn").append("=").append(psc_comp_yn).append(",");
      sb.append("pap_key").append("=").append(pap_key).append(",");
      sb.append("pap_state").append("=").append(pap_state).append(",");
      sb.append("pap_comp_yn").append("=").append(pap_comp_yn).append(",");
      sb.append("pd_key").append("=").append(pd_key).append(",");
      sb.append("pd_state").append("=").append(pd_state).append(",");
      sb.append("pd_comp_yn").append("=").append(pd_comp_yn).append(",");
      sb.append("ppd_key").append("=").append(ppd_key).append(",");
      sb.append("ppd_state").append("=").append(ppd_state).append(",");
      sb.append("ppd_comp_yn").append("=").append(ppd_comp_yn).append(",");
      sb.append("oa_key").append("=").append(oa_key).append(",");
      sb.append("oa_state").append("=").append(oa_state).append(",");
      sb.append("oa_comp_yn").append("=").append(oa_comp_yn).append(",");
      sb.append("reg_key").append("=").append(reg_key).append(",");
      sb.append("reg_state").append("=").append(reg_state).append(",");
      sb.append("reg_comp_yn").append("=").append(reg_comp_yn);
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