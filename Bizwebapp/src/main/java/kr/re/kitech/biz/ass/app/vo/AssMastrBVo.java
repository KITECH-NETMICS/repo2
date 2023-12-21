package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssMastrBExp")
public class AssMastrBVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public AssMastrBVo(){
  }

    @ElDtoField(logicalName = "relatAsetNo", physicalName = "relat_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_aset_no;
  
    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;
  
    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;
  
    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;
  
    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;
  
    @ElDtoField(logicalName = "mainSubClsf", physicalName = "main_sub_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf;
  
    @ElDtoField(logicalName = "mainSubClsfNm", physicalName = "main_sub_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf_nm;
  
    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;
  
    @ElDtoField(logicalName = "oldAsetNo", physicalName = "old_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_aset_no;
  
    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;
  
    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;
  
    @ElDtoField(logicalName = "userSyspayno", physicalName = "user_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_syspayno;
  
    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;
  
    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;
  
    @ElDtoField(logicalName = "userDeptCd", physicalName = "user_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_dept_cd;
  
    @ElDtoField(logicalName = "userDeptNewYmd", physicalName = "user_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_dept_new_ymd;
  
    @ElDtoField(logicalName = "posiRegion", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;
  
    @ElDtoField(logicalName = "posiBuild", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;
  
    @ElDtoField(logicalName = "posiRegionNm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region_nm;
  
    @ElDtoField(logicalName = "posiBuildNm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;
  
    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;
  
    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;
  
    @ElDtoField(logicalName = "managerId", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;
  
    @ElVoField(physicalName = "relat_aset_no")
    public String getRelat_aset_no(){
        return relat_aset_no;
    }
  
    @ElVoField(physicalName = "relat_aset_no")
    public void setRelat_aset_no(String relat_aset_no){
        this.relat_aset_no = relat_aset_no;
    }
  
    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }
  
    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
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
  
    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }
  
    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }
  
    @ElVoField(physicalName = "main_sub_clsf")
    public String getMain_sub_clsf(){
        return main_sub_clsf;
    }
  
    @ElVoField(physicalName = "main_sub_clsf")
    public void setMain_sub_clsf(String main_sub_clsf){
        this.main_sub_clsf = main_sub_clsf;
    }
  
    @ElVoField(physicalName = "main_sub_clsf_nm")
    public String getMain_sub_clsf_nm(){
        return main_sub_clsf_nm;
    }
  
    @ElVoField(physicalName = "main_sub_clsf_nm")
    public void setMain_sub_clsf_nm(String main_sub_clsf_nm){
        this.main_sub_clsf_nm = main_sub_clsf_nm;
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
  
    @ElVoField(physicalName = "user_syspayno")
    public String getUser_syspayno(){
        return user_syspayno;
    }
  
    @ElVoField(physicalName = "user_syspayno")
    public void setUser_syspayno(String user_syspayno){
        this.user_syspayno = user_syspayno;
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
  
    @ElVoField(physicalName = "user_dept_cd")
    public String getUser_dept_cd(){
        return user_dept_cd;
    }
  
    @ElVoField(physicalName = "user_dept_cd")
    public void setUser_dept_cd(String user_dept_cd){
        this.user_dept_cd = user_dept_cd;
    }
  
    @ElVoField(physicalName = "user_dept_new_ymd")
    public String getUser_dept_new_ymd(){
        return user_dept_new_ymd;
    }
  
    @ElVoField(physicalName = "user_dept_new_ymd")
    public void setUser_dept_new_ymd(String user_dept_new_ymd){
        this.user_dept_new_ymd = user_dept_new_ymd;
    }
  
    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }
  
    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }
  
    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }
  
    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
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
  
    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }
  
    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("AssMastrBVo [");
      sb.append("relat_aset_no").append("=").append(relat_aset_no).append(",");
      sb.append("aset_typ").append("=").append(aset_typ).append(",");
      sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
      sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
      sb.append("aset_no").append("=").append(aset_no).append(",");
      sb.append("main_sub_clsf").append("=").append(main_sub_clsf).append(",");
      sb.append("main_sub_clsf_nm").append("=").append(main_sub_clsf_nm).append(",");
      sb.append("aset_nm").append("=").append(aset_nm).append(",");
      sb.append("old_aset_no").append("=").append(old_aset_no).append(",");
      sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
      sb.append("intro_amt").append("=").append(intro_amt).append(",");
      sb.append("user_syspayno").append("=").append(user_syspayno).append(",");
      sb.append("user_empno").append("=").append(user_empno).append(",");
      sb.append("user_nm").append("=").append(user_nm).append(",");
      sb.append("user_dept_cd").append("=").append(user_dept_cd).append(",");
      sb.append("user_dept_new_ymd").append("=").append(user_dept_new_ymd).append(",");
      sb.append("posi_region").append("=").append(posi_region).append(",");
      sb.append("posi_build").append("=").append(posi_build).append(",");
      sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
      sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
      sb.append("posi_floor").append("=").append(posi_floor).append(",");
      sb.append("posi_detls").append("=").append(posi_detls).append(",");
      sb.append("manager_id").append("=").append(manager_id);
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