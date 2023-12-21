package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssMastrBExp")
public class AssMastrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public AssMastrVo(){
  }

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;
  
    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;
  
    @ElDtoField(logicalName = "couseClsf", physicalName = "couse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf;
  
    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;
  
    @ElDtoField(logicalName = "introYmdSt", physicalName = "intro_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd_st;
  
    @ElDtoField(logicalName = "asetNoNotIn", physicalName = "aset_no_not_in", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no_not_in;
  
    @ElDtoField(logicalName = "asetTypNm", physicalName = "aset_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ_nm;
  
    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;
  
    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;
  
    @ElDtoField(logicalName = "couseClsfNm", physicalName = "couse_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String couse_clsf_nm;
  
    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;
  
    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;
  
    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;
  
    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;
  
    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;
  
    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "respnEmpno", physicalName = "respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_empno;
  
    @ElDtoField(logicalName = "respnNm", physicalName = "respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_nm;
  
    @ElDtoField(logicalName = "posiRegionNm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region_nm;
  
    @ElDtoField(logicalName = "posiBuildNm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;
  
    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;
  
    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;
  
    @ElDtoField(logicalName = "imptNotfRepayYmd", physicalName = "impt_notf_repay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_notf_repay_ymd;
  
    @ElDtoField(logicalName = "aftrMngmtStartYmd", physicalName = "aftr_mngmt_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_mngmt_start_ymd;
  
    @ElDtoField(logicalName = "aftrMngmtClsYmd", physicalName = "aftr_mngmt_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_mngmt_cls_ymd;
  
    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }
  
    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }
  
    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }
  
    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }
  
    @ElVoField(physicalName = "couse_clsf")
    public String getCouse_clsf(){
        return couse_clsf;
    }
  
    @ElVoField(physicalName = "couse_clsf")
    public void setCouse_clsf(String couse_clsf){
        this.couse_clsf = couse_clsf;
    }
  
    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }
  
    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
    }
  
    @ElVoField(physicalName = "intro_ymd_st")
    public String getIntro_ymd_st(){
        return intro_ymd_st;
    }
  
    @ElVoField(physicalName = "intro_ymd_st")
    public void setIntro_ymd_st(String intro_ymd_st){
        this.intro_ymd_st = intro_ymd_st;
    }
  
    @ElVoField(physicalName = "aset_no_not_in")
    public String getAset_no_not_in(){
        return aset_no_not_in;
    }
  
    @ElVoField(physicalName = "aset_no_not_in")
    public void setAset_no_not_in(String aset_no_not_in){
        this.aset_no_not_in = aset_no_not_in;
    }
  
    @ElVoField(physicalName = "aset_typ_nm")
    public String getAset_typ_nm(){
        return aset_typ_nm;
    }
  
    @ElVoField(physicalName = "aset_typ_nm")
    public void setAset_typ_nm(String aset_typ_nm){
        this.aset_typ_nm = aset_typ_nm;
    }
  
    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }
  
    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }
  
    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }
  
    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }
  
    @ElVoField(physicalName = "couse_clsf_nm")
    public String getCouse_clsf_nm(){
        return couse_clsf_nm;
    }
  
    @ElVoField(physicalName = "couse_clsf_nm")
    public void setCouse_clsf_nm(String couse_clsf_nm){
        this.couse_clsf_nm = couse_clsf_nm;
    }
  
    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }
  
    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
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
  
    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }
  
    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }
  
    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }
  
    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }
  
    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }
  
    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "respn_empno")
    public String getRespn_empno(){
        return respn_empno;
    }
  
    @ElVoField(physicalName = "respn_empno")
    public void setRespn_empno(String respn_empno){
        this.respn_empno = respn_empno;
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
  
    @ElVoField(physicalName = "impt_notf_repay_ymd")
    public String getImpt_notf_repay_ymd(){
        return impt_notf_repay_ymd;
    }
  
    @ElVoField(physicalName = "impt_notf_repay_ymd")
    public void setImpt_notf_repay_ymd(String impt_notf_repay_ymd){
        this.impt_notf_repay_ymd = impt_notf_repay_ymd;
    }
  
    @ElVoField(physicalName = "aftr_mngmt_start_ymd")
    public String getAftr_mngmt_start_ymd(){
        return aftr_mngmt_start_ymd;
    }
  
    @ElVoField(physicalName = "aftr_mngmt_start_ymd")
    public void setAftr_mngmt_start_ymd(String aftr_mngmt_start_ymd){
        this.aftr_mngmt_start_ymd = aftr_mngmt_start_ymd;
    }
  
    @ElVoField(physicalName = "aftr_mngmt_cls_ymd")
    public String getAftr_mngmt_cls_ymd(){
        return aftr_mngmt_cls_ymd;
    }
  
    @ElVoField(physicalName = "aftr_mngmt_cls_ymd")
    public void setAftr_mngmt_cls_ymd(String aftr_mngmt_cls_ymd){
        this.aftr_mngmt_cls_ymd = aftr_mngmt_cls_ymd;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("AssMastrBVo [");
      sb.append("aset_no").append("=").append(aset_no).append(",");
      sb.append("aset_typ").append("=").append(aset_typ).append(",");
      sb.append("couse_clsf").append("=").append(couse_clsf).append(",");
      sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
      sb.append("intro_ymd_st").append("=").append(intro_ymd_st).append(",");
      sb.append("aset_no_not_in").append("=").append(aset_no_not_in).append(",");
      sb.append("aset_typ_nm").append("=").append(aset_typ_nm).append(",");
      sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
      sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
      sb.append("couse_clsf_nm").append("=").append(couse_clsf_nm).append(",");
      sb.append("aset_nm").append("=").append(aset_nm).append(",");
      sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
      sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
      sb.append("intro_amt").append("=").append(intro_amt).append(",");
      sb.append("user_empno").append("=").append(user_empno).append(",");
      sb.append("user_nm").append("=").append(user_nm).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("respn_empno").append("=").append(respn_empno).append(",");
      sb.append("respn_nm").append("=").append(respn_nm).append(",");
      sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
      sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
      sb.append("posi_floor").append("=").append(posi_floor).append(",");
      sb.append("posi_detls").append("=").append(posi_detls).append(",");
      sb.append("impt_notf_repay_ymd").append("=").append(impt_notf_repay_ymd).append(",");
      sb.append("aftr_mngmt_start_ymd").append("=").append(aftr_mngmt_start_ymd).append(",");
      sb.append("aftr_mngmt_cls_ymd").append("=").append(aftr_mngmt_cls_ymd);
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