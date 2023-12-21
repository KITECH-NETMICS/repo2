package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatSmitappExp")
public class PatSmitappVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatSmitappVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElDtoField(logicalName = "rptId", physicalName = "rpt_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_id;
  
    @ElDtoField(logicalName = "indicNm", physicalName = "indic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_nm;
  
    @ElDtoField(logicalName = "indicEmpno", physicalName = "indic_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_empno;
  
    @ElDtoField(logicalName = "indicYmd", physicalName = "indic_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_ymd;
  
    @ElDtoField(logicalName = "indicRmk", physicalName = "indic_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_rmk;
  
    @ElDtoField(logicalName = "patClsf", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;
  
    @ElDtoField(logicalName = "domOverseaClsf", physicalName = "dom_oversea_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf;
  
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
  
    @ElVoField(physicalName = "rpt_id")
    public String getRpt_id(){
        return rpt_id;
    }
  
    @ElVoField(physicalName = "rpt_id")
    public void setRpt_id(String rpt_id){
        this.rpt_id = rpt_id;
    }
  
    @ElVoField(physicalName = "indic_nm")
    public String getIndic_nm(){
        return indic_nm;
    }
  
    @ElVoField(physicalName = "indic_nm")
    public void setIndic_nm(String indic_nm){
        this.indic_nm = indic_nm;
    }
  
    @ElVoField(physicalName = "indic_empno")
    public String getIndic_empno(){
        return indic_empno;
    }
  
    @ElVoField(physicalName = "indic_empno")
    public void setIndic_empno(String indic_empno){
        this.indic_empno = indic_empno;
    }
  
    @ElVoField(physicalName = "indic_ymd")
    public String getIndic_ymd(){
        return indic_ymd;
    }
  
    @ElVoField(physicalName = "indic_ymd")
    public void setIndic_ymd(String indic_ymd){
        this.indic_ymd = indic_ymd;
    }
  
    @ElVoField(physicalName = "indic_rmk")
    public String getIndic_rmk(){
        return indic_rmk;
    }
  
    @ElVoField(physicalName = "indic_rmk")
    public void setIndic_rmk(String indic_rmk){
        this.indic_rmk = indic_rmk;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }
  
    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public String getDom_oversea_clsf(){
        return dom_oversea_clsf;
    }
  
    @ElVoField(physicalName = "dom_oversea_clsf")
    public void setDom_oversea_clsf(String dom_oversea_clsf){
        this.dom_oversea_clsf = dom_oversea_clsf;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatSmitappVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
      sb.append("rpt_id").append("=").append(rpt_id).append(",");
      sb.append("indic_nm").append("=").append(indic_nm).append(",");
      sb.append("indic_empno").append("=").append(indic_empno).append(",");
      sb.append("indic_ymd").append("=").append(indic_ymd).append(",");
      sb.append("indic_rmk").append("=").append(indic_rmk).append(",");
      sb.append("pat_clsf").append("=").append(pat_clsf).append(",");
      sb.append("dom_oversea_clsf").append("=").append(dom_oversea_clsf);
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