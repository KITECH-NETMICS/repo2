package kr.re.kitech.biz.pat.ppo.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatPpoRefFileLstExp")
public class PatPpoRefFileLstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatPpoRefFileLstVo(){
  }

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;
  
    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;
  
    @ElDtoField(logicalName = "patClsfNm", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;
  
    @ElDtoField(logicalName = "techClsf", physicalName = "tech_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf;
  
    @ElDtoField(logicalName = "techClsfNm", physicalName = "tech_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_clsf_nm;
  
    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;
  
    @ElDtoField(logicalName = "stateNm", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;
  
    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;
  
    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;
  
    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;
  
    @ElDtoField(logicalName = "smitappNatnCd", physicalName = "smitapp_natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_cd;
  
    @ElDtoField(logicalName = "smitappNatnNm", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;
  
    @ElDtoField(logicalName = "regstNo", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;
  
    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;
  
    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;
  
    @ElDtoField(logicalName = "invntPsnNm", physicalName = "invnt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_nm;
  
    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;
  
    @ElDtoField(logicalName = "invntNm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;
  
    @ElDtoField(logicalName = "mandatePsnNm", physicalName = "mandate_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_nm;
  
    @ElDtoField(logicalName = "patoficFullNm", physicalName = "patofic_full_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_full_nm;
  
    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;
  
    @ElDtoField(logicalName = "patoficMngNo", physicalName = "patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_mng_no;
  
    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;
  
    @ElDtoField(logicalName = "prityrgtMainRspnsNo", physicalName = "prityrgt_main_rspns_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_no;
  
    @ElDtoField(logicalName = "prityrgtMainRspnsYmd", physicalName = "prityrgt_main_rspns_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prityrgt_main_rspns_ymd;
  
    @ElDtoField(logicalName = "cd", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "fileNm", physicalName = "file_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String file_nm;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;
  
    @ElDtoField(logicalName = "attachFullPath", physicalName = "attach_full_path", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_full_path;
  
    @ElDtoField(logicalName = "ord", physicalName = "ord", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord;
  
    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }
  
    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }
  
    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }
  
    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public String getTech_clsf(){
        return tech_clsf;
    }
  
    @ElVoField(physicalName = "tech_clsf")
    public void setTech_clsf(String tech_clsf){
        this.tech_clsf = tech_clsf;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public String getTech_clsf_nm(){
        return tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "tech_clsf_nm")
    public void setTech_clsf_nm(String tech_clsf_nm){
        this.tech_clsf_nm = tech_clsf_nm;
    }
  
    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }
  
    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }
  
    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }
  
    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }
  
    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
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
  
    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }
  
    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }
  
    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }
  
    @ElVoField(physicalName = "invnt_psn_nm")
    public String getInvnt_psn_nm(){
        return invnt_psn_nm;
    }
  
    @ElVoField(physicalName = "invnt_psn_nm")
    public void setInvnt_psn_nm(String invnt_psn_nm){
        this.invnt_psn_nm = invnt_psn_nm;
    }
  
    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }
  
    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }
  
    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }
  
    @ElVoField(physicalName = "mandate_psn_nm")
    public String getMandate_psn_nm(){
        return mandate_psn_nm;
    }
  
    @ElVoField(physicalName = "mandate_psn_nm")
    public void setMandate_psn_nm(String mandate_psn_nm){
        this.mandate_psn_nm = mandate_psn_nm;
    }
  
    @ElVoField(physicalName = "patofic_full_nm")
    public String getPatofic_full_nm(){
        return patofic_full_nm;
    }
  
    @ElVoField(physicalName = "patofic_full_nm")
    public void setPatofic_full_nm(String patofic_full_nm){
        this.patofic_full_nm = patofic_full_nm;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }
  
    @ElVoField(physicalName = "patofic_mng_no")
    public String getPatofic_mng_no(){
        return patofic_mng_no;
    }
  
    @ElVoField(physicalName = "patofic_mng_no")
    public void setPatofic_mng_no(String patofic_mng_no){
        this.patofic_mng_no = patofic_mng_no;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public String getPrityrgt_main_rspns_no(){
        return prityrgt_main_rspns_no;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_no")
    public void setPrityrgt_main_rspns_no(String prityrgt_main_rspns_no){
        this.prityrgt_main_rspns_no = prityrgt_main_rspns_no;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public String getPrityrgt_main_rspns_ymd(){
        return prityrgt_main_rspns_ymd;
    }
  
    @ElVoField(physicalName = "prityrgt_main_rspns_ymd")
    public void setPrityrgt_main_rspns_ymd(String prityrgt_main_rspns_ymd){
        this.prityrgt_main_rspns_ymd = prityrgt_main_rspns_ymd;
    }
  
    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }
  
    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "file_nm")
    public String getFile_nm(){
        return file_nm;
    }
  
    @ElVoField(physicalName = "file_nm")
    public void setFile_nm(String file_nm){
        this.file_nm = file_nm;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }
  
    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }
  
    @ElVoField(physicalName = "attach_full_path")
    public String getAttach_full_path(){
        return attach_full_path;
    }
  
    @ElVoField(physicalName = "attach_full_path")
    public void setAttach_full_path(String attach_full_path){
        this.attach_full_path = attach_full_path;
    }
  
    @ElVoField(physicalName = "ord")
    public String getOrd(){
        return ord;
    }
  
    @ElVoField(physicalName = "ord")
    public void setOrd(String ord){
        this.ord = ord;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatPpoRefFileLstVo [");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
      sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
      sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
      sb.append("tech_clsf").append("=").append(tech_clsf).append(",");
      sb.append("tech_clsf_nm").append("=").append(tech_clsf_nm).append(",");
      sb.append("state").append("=").append(state).append(",");
      sb.append("state_nm").append("=").append(state_nm).append(",");
      sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
      sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
      sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
      sb.append("smitapp_natn_cd").append("=").append(smitapp_natn_cd).append(",");
      sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
      sb.append("regst_no").append("=").append(regst_no).append(",");
      sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
      sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
      sb.append("invnt_psn_nm").append("=").append(invnt_psn_nm).append(",");
      sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
      sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
      sb.append("mandate_psn_nm").append("=").append(mandate_psn_nm).append(",");
      sb.append("patofic_full_nm").append("=").append(patofic_full_nm).append(",");
      sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
      sb.append("patofic_mng_no").append("=").append(patofic_mng_no).append(",");
      sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf).append(",");
      sb.append("prityrgt_main_rspns_no").append("=").append(prityrgt_main_rspns_no).append(",");
      sb.append("prityrgt_main_rspns_ymd").append("=").append(prityrgt_main_rspns_ymd).append(",");
      sb.append("cd").append("=").append(cd).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("file_nm").append("=").append(file_nm).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("seq").append("=").append(seq).append(",");
      sb.append("attach_full_path").append("=").append(attach_full_path).append(",");
      sb.append("ord").append("=").append(ord);
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