package kr.re.kitech.biz.ass.rpt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssRptExp")
public class AssRptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public AssRptVo(){
  }

    @ElDtoField(logicalName = "asetGubun", physicalName = "aset_gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_gubun;
  
    @ElDtoField(logicalName = "asetState", physicalName = "aset_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state;
  
    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "mngmtMbody", physicalName = "mngmt_mbody", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_mbody;
  
    @ElDtoField(logicalName = "introYmdSt", physicalName = "intro_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd_st;
  
    @ElDtoField(logicalName = "introYmdEd", physicalName = "intro_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd_ed;
  
    @ElDtoField(logicalName = "posiRegion", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;
  
    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;
  
    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;
  
    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;
  
    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;
  
    @ElDtoField(logicalName = "finnc", physicalName = "finnc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc;
  
    @ElDtoField(logicalName = "finncNm", physicalName = "finnc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String finnc_nm;
  
    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;
  
    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;
  
    @ElDtoField(logicalName = "respnNm", physicalName = "respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_nm;
  
    @ElDtoField(logicalName = "posiRegionNm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region_nm;
  
    @ElDtoField(logicalName = "posiBuild", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;
  
    @ElDtoField(logicalName = "posiBuildNm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;
  
    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;
  
    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;
  
    @ElDtoField(logicalName = "useScopNm", physicalName = "use_scop_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_scop_nm;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "prcsYmd", physicalName = "prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_ymd;
  
    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;
  
    @ElDtoField(logicalName = "unuseClsf", physicalName = "unuse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_clsf;
  
    @ElDtoField(logicalName = "depreSumAmt", physicalName = "depre_sum_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depre_sum_amt;
  
    @ElDtoField(logicalName = "residualAmt", physicalName = "residual_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String residual_amt;
  
    @ElVoField(physicalName = "aset_gubun")
    public String getAset_gubun(){
        return aset_gubun;
    }
  
    @ElVoField(physicalName = "aset_gubun")
    public void setAset_gubun(String aset_gubun){
        this.aset_gubun = aset_gubun;
    }
  
    @ElVoField(physicalName = "aset_state")
    public String getAset_state(){
        return aset_state;
    }
  
    @ElVoField(physicalName = "aset_state")
    public void setAset_state(String aset_state){
        this.aset_state = aset_state;
    }
  
    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }
  
    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }
  
    @ElVoField(physicalName = "mngmt_mbody")
    public String getMngmt_mbody(){
        return mngmt_mbody;
    }
  
    @ElVoField(physicalName = "mngmt_mbody")
    public void setMngmt_mbody(String mngmt_mbody){
        this.mngmt_mbody = mngmt_mbody;
    }
  
    @ElVoField(physicalName = "intro_ymd_st")
    public String getIntro_ymd_st(){
        return intro_ymd_st;
    }
  
    @ElVoField(physicalName = "intro_ymd_st")
    public void setIntro_ymd_st(String intro_ymd_st){
        this.intro_ymd_st = intro_ymd_st;
    }
  
    @ElVoField(physicalName = "intro_ymd_ed")
    public String getIntro_ymd_ed(){
        return intro_ymd_ed;
    }
  
    @ElVoField(physicalName = "intro_ymd_ed")
    public void setIntro_ymd_ed(String intro_ymd_ed){
        this.intro_ymd_ed = intro_ymd_ed;
    }
  
    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }
  
    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }
  
    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }
  
    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }
  
    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }
  
    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }
  
    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }
  
    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }
  
    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }
  
    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }
  
    @ElVoField(physicalName = "finnc")
    public String getFinnc(){
        return finnc;
    }
  
    @ElVoField(physicalName = "finnc")
    public void setFinnc(String finnc){
        this.finnc = finnc;
    }
  
    @ElVoField(physicalName = "finnc_nm")
    public String getFinnc_nm(){
        return finnc_nm;
    }
  
    @ElVoField(physicalName = "finnc_nm")
    public void setFinnc_nm(String finnc_nm){
        this.finnc_nm = finnc_nm;
    }
  
    @ElVoField(physicalName = "old_aset_no")
    public String getOld_aset_no(){
        return old_aset_no;
    }
  
    @ElVoField(physicalName = "old_aset_no")
    public void setOld_aset_no(String old_aset_no){
        this.old_aset_no = old_aset_no;
    }
  
    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }
  
    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }
  
    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }
  
    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }
  
    @ElVoField(physicalName = "respn_nm")
    public String getRespn_nm(){
        return respn_nm;
    }
  
    @ElVoField(physicalName = "respn_nm")
    public void setRespn_nm(String respn_nm){
        this.respn_nm = respn_nm;
    }
  
    @ElVoField(physicalName = "posi_region_nm")
    public String getPosi_region_nm(){
        return posi_region_nm;
    }
  
    @ElVoField(physicalName = "posi_region_nm")
    public void setPosi_region_nm(String posi_region_nm){
        this.posi_region_nm = posi_region_nm;
    }
  
    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }
  
    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }
  
    @ElVoField(physicalName = "posi_build_nm")
    public String getPosi_build_nm(){
        return posi_build_nm;
    }
  
    @ElVoField(physicalName = "posi_build_nm")
    public void setPosi_build_nm(String posi_build_nm){
        this.posi_build_nm = posi_build_nm;
    }
  
    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }
  
    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }
  
    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }
  
    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }
  
    @ElVoField(physicalName = "use_scop_nm")
    public String getUse_scop_nm(){
        return use_scop_nm;
    }
  
    @ElVoField(physicalName = "use_scop_nm")
    public void setUse_scop_nm(String use_scop_nm){
        this.use_scop_nm = use_scop_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
    @ElVoField(physicalName = "prcs_ymd")
    public String getPrcs_ymd(){
        return prcs_ymd;
    }
  
    @ElVoField(physicalName = "prcs_ymd")
    public void setPrcs_ymd(String prcs_ymd){
        this.prcs_ymd = prcs_ymd;
    }
  
    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }
  
    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }
  
    @ElVoField(physicalName = "unuse_clsf")
    public String getUnuse_clsf(){
        return unuse_clsf;
    }
  
    @ElVoField(physicalName = "unuse_clsf")
    public void setUnuse_clsf(String unuse_clsf){
        this.unuse_clsf = unuse_clsf;
    }
  
    @ElVoField(physicalName = "depre_sum_amt")
    public String getDepre_sum_amt(){
        return depre_sum_amt;
    }
  
    @ElVoField(physicalName = "depre_sum_amt")
    public void setDepre_sum_amt(String depre_sum_amt){
        this.depre_sum_amt = depre_sum_amt;
    }
  
    @ElVoField(physicalName = "residual_amt")
    public String getResidual_amt(){
        return residual_amt;
    }
  
    @ElVoField(physicalName = "residual_amt")
    public void setResidual_amt(String residual_amt){
        this.residual_amt = residual_amt;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("AssRptVo [");
      sb.append("aset_gubun").append("=").append(aset_gubun).append(",");
      sb.append("aset_state").append("=").append(aset_state).append(",");
      sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("mngmt_mbody").append("=").append(mngmt_mbody).append(",");
      sb.append("intro_ymd_st").append("=").append(intro_ymd_st).append(",");
      sb.append("intro_ymd_ed").append("=").append(intro_ymd_ed).append(",");
      sb.append("posi_region").append("=").append(posi_region).append(",");
      sb.append("aset_no").append("=").append(aset_no).append(",");
      sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
      sb.append("aset_nm").append("=").append(aset_nm).append(",");
      sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
      sb.append("finnc").append("=").append(finnc).append(",");
      sb.append("finnc_nm").append("=").append(finnc_nm).append(",");
      sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
      sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("intro_amt").append("=").append(intro_amt).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("user_nm").append("=").append(user_nm).append(",");
      sb.append("respn_nm").append("=").append(respn_nm).append(",");
      sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
      sb.append("posi_build").append("=").append(posi_build).append(",");
      sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
      sb.append("posi_floor").append("=").append(posi_floor).append(",");
      sb.append("posi_detls").append("=").append(posi_detls).append(",");
      sb.append("use_scop_nm").append("=").append(use_scop_nm).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("prcs_ymd").append("=").append(prcs_ymd).append(",");
      sb.append("cause").append("=").append(cause).append(",");
      sb.append("unuse_clsf").append("=").append(unuse_clsf).append(",");
      sb.append("depre_sum_amt").append("=").append(depre_sum_amt).append(",");
      sb.append("residual_amt").append("=").append(residual_amt);
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