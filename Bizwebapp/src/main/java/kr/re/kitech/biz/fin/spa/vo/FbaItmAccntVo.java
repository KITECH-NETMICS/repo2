package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FbaItmAccntExp")
public class FbaItmAccntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public FbaItmAccntVo(){
  }

    @ElDtoField(logicalName = "itmSolveBase", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;
  
    @ElDtoField(logicalName = "itmClsf", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;
  
    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;
  
    @ElDtoField(logicalName = "expnsList", physicalName = "expns_list", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_list;
  
    @ElDtoField(logicalName = "expnsCdNm", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;
  
    @ElDtoField(logicalName = "accntCdAbbr", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "desc", physicalName = "desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desc;
  
    @ElDtoField(logicalName = "bugtCtrlWay", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_way;
  
    @ElDtoField(logicalName = "bugtCtrlEx", physicalName = "bugt_ctrl_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_ex;
  
    @ElDtoField(logicalName = "reschAccntClsf", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_accnt_clsf;
  
    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }
  
    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }
  
    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }
  
    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }
  
    @ElVoField(physicalName = "expns_list")
    public String getExpns_list(){
        return expns_list;
    }
  
    @ElVoField(physicalName = "expns_list")
    public void setExpns_list(String expns_list){
        this.expns_list = expns_list;
    }
  
    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }
  
    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }
  
    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }
  
    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "desc")
    public String getDesc(){
        return desc;
    }
  
    @ElVoField(physicalName = "desc")
    public void setDesc(String desc){
        this.desc = desc;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        return bugt_ctrl_way;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_ex")
    public String getBugt_ctrl_ex(){
        return bugt_ctrl_ex;
    }
  
    @ElVoField(physicalName = "bugt_ctrl_ex")
    public void setBugt_ctrl_ex(String bugt_ctrl_ex){
        this.bugt_ctrl_ex = bugt_ctrl_ex;
    }
  
    @ElVoField(physicalName = "resch_accnt_clsf")
    public String getResch_accnt_clsf(){
        return resch_accnt_clsf;
    }
  
    @ElVoField(physicalName = "resch_accnt_clsf")
    public void setResch_accnt_clsf(String resch_accnt_clsf){
        this.resch_accnt_clsf = resch_accnt_clsf;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("FbaItmAccntVo [");
      sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
      sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
      sb.append("expns_cd").append("=").append(expns_cd).append(",");
      sb.append("expns_list").append("=").append(expns_list).append(",");
      sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
      sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("desc").append("=").append(desc).append(",");
      sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
      sb.append("bugt_ctrl_ex").append("=").append(bugt_ctrl_ex).append(",");
      sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf);
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