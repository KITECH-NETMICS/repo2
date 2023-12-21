package kr.re.kitech.biz.pat.mnt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatrightmntExp")
public class PatrightmntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatrightmntVo(){
  }

    @ElDtoField(logicalName = "giveupReqNo", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;
  
    @ElDtoField(logicalName = "seqNo", physicalName = "seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "giveupClsf", physicalName = "giveup_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_clsf;
  
    @ElDtoField(logicalName = "stateCd", physicalName = "state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_cd;
  
    @ElDtoField(logicalName = "giveupDeptCd", physicalName = "giveup_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_dept_cd;
  
    @ElDtoField(logicalName = "giveupSyspayno", physicalName = "giveup_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_syspayno;
  
    @ElDtoField(logicalName = "giveupDeptNewYmd", physicalName = "giveup_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_dept_new_ymd;
  
    @ElDtoField(logicalName = "giveupYmd", physicalName = "giveup_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_ymd;
  
    @ElDtoField(logicalName = "giveupKnd", physicalName = "giveup_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_knd;
  
    @ElDtoField(logicalName = "giveupResn", physicalName = "giveup_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_resn;
  
    @ElDtoField(logicalName = "draftSyspayno", physicalName = "draft_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_syspayno;
  
    @ElDtoField(logicalName = "draftYmd", physicalName = "draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_ymd;
  
    @ElDtoField(logicalName = "apprvlCompltYmd", physicalName = "apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_complt_ymd;
  
    @ElDtoField(logicalName = "rejectYmd", physicalName = "reject_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reject_ymd;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "admYn", physicalName = "adm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adm_yn;
  
    @ElDtoField(logicalName = "multiAppYn", physicalName = "multi_app_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String multi_app_yn;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }
  
    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }
  
    @ElVoField(physicalName = "seq_no")
    public String getSeq_no(){
        return seq_no;
    }
  
    @ElVoField(physicalName = "seq_no")
    public void setSeq_no(String seq_no){
        this.seq_no = seq_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "giveup_clsf")
    public String getGiveup_clsf(){
        return giveup_clsf;
    }
  
    @ElVoField(physicalName = "giveup_clsf")
    public void setGiveup_clsf(String giveup_clsf){
        this.giveup_clsf = giveup_clsf;
    }
  
    @ElVoField(physicalName = "state_cd")
    public String getState_cd(){
        return state_cd;
    }
  
    @ElVoField(physicalName = "state_cd")
    public void setState_cd(String state_cd){
        this.state_cd = state_cd;
    }
  
    @ElVoField(physicalName = "giveup_dept_cd")
    public String getGiveup_dept_cd(){
        return giveup_dept_cd;
    }
  
    @ElVoField(physicalName = "giveup_dept_cd")
    public void setGiveup_dept_cd(String giveup_dept_cd){
        this.giveup_dept_cd = giveup_dept_cd;
    }
  
    @ElVoField(physicalName = "giveup_syspayno")
    public String getGiveup_syspayno(){
        return giveup_syspayno;
    }
  
    @ElVoField(physicalName = "giveup_syspayno")
    public void setGiveup_syspayno(String giveup_syspayno){
        this.giveup_syspayno = giveup_syspayno;
    }
  
    @ElVoField(physicalName = "giveup_dept_new_ymd")
    public String getGiveup_dept_new_ymd(){
        return giveup_dept_new_ymd;
    }
  
    @ElVoField(physicalName = "giveup_dept_new_ymd")
    public void setGiveup_dept_new_ymd(String giveup_dept_new_ymd){
        this.giveup_dept_new_ymd = giveup_dept_new_ymd;
    }
  
    @ElVoField(physicalName = "giveup_ymd")
    public String getGiveup_ymd(){
        return giveup_ymd;
    }
  
    @ElVoField(physicalName = "giveup_ymd")
    public void setGiveup_ymd(String giveup_ymd){
        this.giveup_ymd = giveup_ymd;
    }
  
    @ElVoField(physicalName = "giveup_knd")
    public String getGiveup_knd(){
        return giveup_knd;
    }
  
    @ElVoField(physicalName = "giveup_knd")
    public void setGiveup_knd(String giveup_knd){
        this.giveup_knd = giveup_knd;
    }
  
    @ElVoField(physicalName = "giveup_resn")
    public String getGiveup_resn(){
        return giveup_resn;
    }
  
    @ElVoField(physicalName = "giveup_resn")
    public void setGiveup_resn(String giveup_resn){
        this.giveup_resn = giveup_resn;
    }
  
    @ElVoField(physicalName = "draft_syspayno")
    public String getDraft_syspayno(){
        return draft_syspayno;
    }
  
    @ElVoField(physicalName = "draft_syspayno")
    public void setDraft_syspayno(String draft_syspayno){
        this.draft_syspayno = draft_syspayno;
    }
  
    @ElVoField(physicalName = "draft_ymd")
    public String getDraft_ymd(){
        return draft_ymd;
    }
  
    @ElVoField(physicalName = "draft_ymd")
    public void setDraft_ymd(String draft_ymd){
        this.draft_ymd = draft_ymd;
    }
  
    @ElVoField(physicalName = "apprvl_complt_ymd")
    public String getApprvl_complt_ymd(){
        return apprvl_complt_ymd;
    }
  
    @ElVoField(physicalName = "apprvl_complt_ymd")
    public void setApprvl_complt_ymd(String apprvl_complt_ymd){
        this.apprvl_complt_ymd = apprvl_complt_ymd;
    }
  
    @ElVoField(physicalName = "reject_ymd")
    public String getReject_ymd(){
        return reject_ymd;
    }
  
    @ElVoField(physicalName = "reject_ymd")
    public void setReject_ymd(String reject_ymd){
        this.reject_ymd = reject_ymd;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "adm_yn")
    public String getAdm_yn(){
        return adm_yn;
    }
  
    @ElVoField(physicalName = "adm_yn")
    public void setAdm_yn(String adm_yn){
        this.adm_yn = adm_yn;
    }
  
    @ElVoField(physicalName = "multi_app_yn")
    public String getMulti_app_yn(){
        return multi_app_yn;
    }
  
    @ElVoField(physicalName = "multi_app_yn")
    public void setMulti_app_yn(String multi_app_yn){
        this.multi_app_yn = multi_app_yn;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatrightmntVo [");
      sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
      sb.append("seq_no").append("=").append(seq_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("giveup_clsf").append("=").append(giveup_clsf).append(",");
      sb.append("state_cd").append("=").append(state_cd).append(",");
      sb.append("giveup_dept_cd").append("=").append(giveup_dept_cd).append(",");
      sb.append("giveup_syspayno").append("=").append(giveup_syspayno).append(",");
      sb.append("giveup_dept_new_ymd").append("=").append(giveup_dept_new_ymd).append(",");
      sb.append("giveup_ymd").append("=").append(giveup_ymd).append(",");
      sb.append("giveup_knd").append("=").append(giveup_knd).append(",");
      sb.append("giveup_resn").append("=").append(giveup_resn).append(",");
      sb.append("draft_syspayno").append("=").append(draft_syspayno).append(",");
      sb.append("draft_ymd").append("=").append(draft_ymd).append(",");
      sb.append("apprvl_complt_ymd").append("=").append(apprvl_complt_ymd).append(",");
      sb.append("reject_ymd").append("=").append(reject_ymd).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("adm_yn").append("=").append(adm_yn).append(",");
      sb.append("multi_app_yn").append("=").append(multi_app_yn).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno);
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