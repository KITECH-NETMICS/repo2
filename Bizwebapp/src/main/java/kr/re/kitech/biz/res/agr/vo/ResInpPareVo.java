package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpPareExp")
public class ResInpPareVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpPareVo(){
  }

    @ElDtoField(logicalName = "pPrjNo", physicalName = "p_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String p_prj_no;
  
    @ElDtoField(logicalName = "anal", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "inppareResiNo", physicalName = "inppareResiNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inppareResiNo;
  
    @ElDtoField(logicalName = "residRegstNo", physicalName = "resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_regst_no;
  
    @ElDtoField(logicalName = "sciTechRegstNo", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_regst_no;
  
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "inppareNm", physicalName = "inppareNm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inppareNm;
  
    @ElDtoField(logicalName = "reschrClsf", physicalName = "reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_clsf;
  
    @ElDtoField(logicalName = "cdNmReschrClsf", physicalName = "cd_nm_reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm_reschr_clsf;
  
    @ElDtoField(logicalName = "psnexpnsClsf", physicalName = "psnexpns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psnexpns_clsf;
  
    @ElDtoField(logicalName = "cdNmPsnexpnsClsf", physicalName = "cd_nm_psnexpns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm_psnexpns_clsf;
  
    @ElDtoField(logicalName = "attncePrdOrignYmd", physicalName = "attnce_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_orign_ymd;
  
    @ElDtoField(logicalName = "attncePrdClsYmd", physicalName = "attnce_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_cls_ymd;
  
    @ElDtoField(logicalName = "psnexpnsMonthUnitPrice", physicalName = "psnexpns_month_unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psnexpns_month_unit_price;
  
    @ElDtoField(logicalName = "cashAttnceRt", physicalName = "cash_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_attnce_rt;
  
    @ElDtoField(logicalName = "goodsAttnceRt", physicalName = "goods_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goods_attnce_rt;
  
    @ElDtoField(logicalName = "respnRts", physicalName = "respn_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_rts;
  
    @ElDtoField(logicalName = "cashAmt", physicalName = "cash_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_amt;
  
    @ElDtoField(logicalName = "goodsAmt", physicalName = "goods_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goods_amt;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElVoField(physicalName = "p_prj_no")
    public String getP_prj_no(){
        return p_prj_no;
    }
  
    @ElVoField(physicalName = "p_prj_no")
    public void setP_prj_no(String p_prj_no){
        this.p_prj_no = p_prj_no;
    }
  
    @ElVoField(physicalName = "anal")
    public String getAnal(){
        return anal;
    }
  
    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "inppareResiNo")
    public String getInppareResiNo(){
        return inppareResiNo;
    }
  
    @ElVoField(physicalName = "inppareResiNo")
    public void setInppareResiNo(String inppareResiNo){
        this.inppareResiNo = inppareResiNo;
    }
  
    @ElVoField(physicalName = "resid_regst_no")
    public String getResid_regst_no(){
        return resid_regst_no;
    }
  
    @ElVoField(physicalName = "resid_regst_no")
    public void setResid_regst_no(String resid_regst_no){
        this.resid_regst_no = resid_regst_no;
    }
  
    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        return sci_tech_regst_no;
    }
  
    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }
  
    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }
  
    @ElVoField(physicalName = "inppareNm")
    public String getInppareNm(){
        return inppareNm;
    }
  
    @ElVoField(physicalName = "inppareNm")
    public void setInppareNm(String inppareNm){
        this.inppareNm = inppareNm;
    }
  
    @ElVoField(physicalName = "reschr_clsf")
    public String getReschr_clsf(){
        return reschr_clsf;
    }
  
    @ElVoField(physicalName = "reschr_clsf")
    public void setReschr_clsf(String reschr_clsf){
        this.reschr_clsf = reschr_clsf;
    }
  
    @ElVoField(physicalName = "cd_nm_reschr_clsf")
    public String getCd_nm_reschr_clsf(){
        return cd_nm_reschr_clsf;
    }
  
    @ElVoField(physicalName = "cd_nm_reschr_clsf")
    public void setCd_nm_reschr_clsf(String cd_nm_reschr_clsf){
        this.cd_nm_reschr_clsf = cd_nm_reschr_clsf;
    }
  
    @ElVoField(physicalName = "psnexpns_clsf")
    public String getPsnexpns_clsf(){
        return psnexpns_clsf;
    }
  
    @ElVoField(physicalName = "psnexpns_clsf")
    public void setPsnexpns_clsf(String psnexpns_clsf){
        this.psnexpns_clsf = psnexpns_clsf;
    }
  
    @ElVoField(physicalName = "cd_nm_psnexpns_clsf")
    public String getCd_nm_psnexpns_clsf(){
        return cd_nm_psnexpns_clsf;
    }
  
    @ElVoField(physicalName = "cd_nm_psnexpns_clsf")
    public void setCd_nm_psnexpns_clsf(String cd_nm_psnexpns_clsf){
        this.cd_nm_psnexpns_clsf = cd_nm_psnexpns_clsf;
    }
  
    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public String getAttnce_prd_orign_ymd(){
        return attnce_prd_orign_ymd;
    }
  
    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public void setAttnce_prd_orign_ymd(String attnce_prd_orign_ymd){
        this.attnce_prd_orign_ymd = attnce_prd_orign_ymd;
    }
  
    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public String getAttnce_prd_cls_ymd(){
        return attnce_prd_cls_ymd;
    }
  
    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public void setAttnce_prd_cls_ymd(String attnce_prd_cls_ymd){
        this.attnce_prd_cls_ymd = attnce_prd_cls_ymd;
    }
  
    @ElVoField(physicalName = "psnexpns_month_unit_price")
    public String getPsnexpns_month_unit_price(){
        return psnexpns_month_unit_price;
    }
  
    @ElVoField(physicalName = "psnexpns_month_unit_price")
    public void setPsnexpns_month_unit_price(String psnexpns_month_unit_price){
        this.psnexpns_month_unit_price = psnexpns_month_unit_price;
    }
  
    @ElVoField(physicalName = "cash_attnce_rt")
    public String getCash_attnce_rt(){
        return cash_attnce_rt;
    }
  
    @ElVoField(physicalName = "cash_attnce_rt")
    public void setCash_attnce_rt(String cash_attnce_rt){
        this.cash_attnce_rt = cash_attnce_rt;
    }
  
    @ElVoField(physicalName = "goods_attnce_rt")
    public String getGoods_attnce_rt(){
        return goods_attnce_rt;
    }
  
    @ElVoField(physicalName = "goods_attnce_rt")
    public void setGoods_attnce_rt(String goods_attnce_rt){
        this.goods_attnce_rt = goods_attnce_rt;
    }
  
    @ElVoField(physicalName = "respn_rts")
    public String getRespn_rts(){
        return respn_rts;
    }
  
    @ElVoField(physicalName = "respn_rts")
    public void setRespn_rts(String respn_rts){
        this.respn_rts = respn_rts;
    }
  
    @ElVoField(physicalName = "cash_amt")
    public String getCash_amt(){
        return cash_amt;
    }
  
    @ElVoField(physicalName = "cash_amt")
    public void setCash_amt(String cash_amt){
        this.cash_amt = cash_amt;
    }
  
    @ElVoField(physicalName = "goods_amt")
    public String getGoods_amt(){
        return goods_amt;
    }
  
    @ElVoField(physicalName = "goods_amt")
    public void setGoods_amt(String goods_amt){
        this.goods_amt = goods_amt;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }
  
    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }
  
    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpPareVo [");
      sb.append("p_prj_no").append("=").append(p_prj_no).append(",");
      sb.append("anal").append("=").append(anal).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("inppareResiNo").append("=").append(inppareResiNo).append(",");
      sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
      sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("inppareNm").append("=").append(inppareNm).append(",");
      sb.append("reschr_clsf").append("=").append(reschr_clsf).append(",");
      sb.append("cd_nm_reschr_clsf").append("=").append(cd_nm_reschr_clsf).append(",");
      sb.append("psnexpns_clsf").append("=").append(psnexpns_clsf).append(",");
      sb.append("cd_nm_psnexpns_clsf").append("=").append(cd_nm_psnexpns_clsf).append(",");
      sb.append("attnce_prd_orign_ymd").append("=").append(attnce_prd_orign_ymd).append(",");
      sb.append("attnce_prd_cls_ymd").append("=").append(attnce_prd_cls_ymd).append(",");
      sb.append("psnexpns_month_unit_price").append("=").append(psnexpns_month_unit_price).append(",");
      sb.append("cash_attnce_rt").append("=").append(cash_attnce_rt).append(",");
      sb.append("goods_attnce_rt").append("=").append(goods_attnce_rt).append(",");
      sb.append("respn_rts").append("=").append(respn_rts).append(",");
      sb.append("cash_amt").append("=").append(cash_amt).append(",");
      sb.append("goods_amt").append("=").append(goods_amt).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
      sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
      sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("posi_nm").append("=").append(posi_nm);
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