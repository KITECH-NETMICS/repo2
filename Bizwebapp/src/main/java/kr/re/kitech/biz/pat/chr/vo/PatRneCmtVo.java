package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatRneCmtExp")
public class PatRneCmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRneCmtVo(){
  }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "rnecmtSyspayno", physicalName = "rnecmt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_syspayno;
  
    @ElDtoField(logicalName = "rnecmtEmpno", physicalName = "rnecmt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_empno;
  
    @ElDtoField(logicalName = "rnecmtNm", physicalName = "rnecmt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_nm;
  
    @ElDtoField(logicalName = "rnecmtConsttnSeq", physicalName = "rnecmt_consttn_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_consttn_seq;
  
    @ElDtoField(logicalName = "rnecmtConsttnSubj", physicalName = "rnecmt_consttn_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_consttn_subj;
  
    @ElDtoField(logicalName = "rnecmtConsttnYmd", physicalName = "rnecmt_consttn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_consttn_ymd;
  
    @ElDtoField(logicalName = "rnecmtConsttnRst", physicalName = "rnecmt_consttn_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_consttn_rst;
  
    @ElDtoField(logicalName = "rnecmtPrcsYmd", physicalName = "rnecmt_prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rnecmt_prcs_ymd;
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "rnecmt_syspayno")
    public String getRnecmt_syspayno(){
        return rnecmt_syspayno;
    }
  
    @ElVoField(physicalName = "rnecmt_syspayno")
    public void setRnecmt_syspayno(String rnecmt_syspayno){
        this.rnecmt_syspayno = rnecmt_syspayno;
    }
  
    @ElVoField(physicalName = "rnecmt_empno")
    public String getRnecmt_empno(){
        return rnecmt_empno;
    }
  
    @ElVoField(physicalName = "rnecmt_empno")
    public void setRnecmt_empno(String rnecmt_empno){
        this.rnecmt_empno = rnecmt_empno;
    }
  
    @ElVoField(physicalName = "rnecmt_nm")
    public String getRnecmt_nm(){
        return rnecmt_nm;
    }
  
    @ElVoField(physicalName = "rnecmt_nm")
    public void setRnecmt_nm(String rnecmt_nm){
        this.rnecmt_nm = rnecmt_nm;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_seq")
    public String getRnecmt_consttn_seq(){
        return rnecmt_consttn_seq;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_seq")
    public void setRnecmt_consttn_seq(String rnecmt_consttn_seq){
        this.rnecmt_consttn_seq = rnecmt_consttn_seq;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_subj")
    public String getRnecmt_consttn_subj(){
        return rnecmt_consttn_subj;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_subj")
    public void setRnecmt_consttn_subj(String rnecmt_consttn_subj){
        this.rnecmt_consttn_subj = rnecmt_consttn_subj;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_ymd")
    public String getRnecmt_consttn_ymd(){
        return rnecmt_consttn_ymd;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_ymd")
    public void setRnecmt_consttn_ymd(String rnecmt_consttn_ymd){
        this.rnecmt_consttn_ymd = rnecmt_consttn_ymd;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_rst")
    public String getRnecmt_consttn_rst(){
        return rnecmt_consttn_rst;
    }
  
    @ElVoField(physicalName = "rnecmt_consttn_rst")
    public void setRnecmt_consttn_rst(String rnecmt_consttn_rst){
        this.rnecmt_consttn_rst = rnecmt_consttn_rst;
    }
  
    @ElVoField(physicalName = "rnecmt_prcs_ymd")
    public String getRnecmt_prcs_ymd(){
        return rnecmt_prcs_ymd;
    }
  
    @ElVoField(physicalName = "rnecmt_prcs_ymd")
    public void setRnecmt_prcs_ymd(String rnecmt_prcs_ymd){
        this.rnecmt_prcs_ymd = rnecmt_prcs_ymd;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRneCmtVo [");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("rnecmt_syspayno").append("=").append(rnecmt_syspayno).append(",");
      sb.append("rnecmt_empno").append("=").append(rnecmt_empno).append(",");
      sb.append("rnecmt_nm").append("=").append(rnecmt_nm).append(",");
      sb.append("rnecmt_consttn_seq").append("=").append(rnecmt_consttn_seq).append(",");
      sb.append("rnecmt_consttn_subj").append("=").append(rnecmt_consttn_subj).append(",");
      sb.append("rnecmt_consttn_ymd").append("=").append(rnecmt_consttn_ymd).append(",");
      sb.append("rnecmt_consttn_rst").append("=").append(rnecmt_consttn_rst).append(",");
      sb.append("rnecmt_prcs_ymd").append("=").append(rnecmt_prcs_ymd);
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