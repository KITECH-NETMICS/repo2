package kr.re.kitech.biz.fin.ena.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "UpdatedeleteFileExp")
public class UpdatedeleteFileVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public UpdatedeleteFileVo(){
  }

    @ElDtoField(logicalName = "tableNm", physicalName = "table_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String table_nm;
  
    @ElDtoField(logicalName = "colNm", physicalName = "col_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String col_nm;
  
    @ElDtoField(logicalName = "keyCol", physicalName = "key_col", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String key_col;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElVoField(physicalName = "table_nm")
    public String getTable_nm(){
        return table_nm;
    }
  
    @ElVoField(physicalName = "table_nm")
    public void setTable_nm(String table_nm){
        this.table_nm = table_nm;
    }
  
    @ElVoField(physicalName = "col_nm")
    public String getCol_nm(){
        return col_nm;
    }
  
    @ElVoField(physicalName = "col_nm")
    public void setCol_nm(String col_nm){
        this.col_nm = col_nm;
    }
  
    @ElVoField(physicalName = "key_col")
    public String getKey_col(){
        return key_col;
    }
  
    @ElVoField(physicalName = "key_col")
    public void setKey_col(String key_col){
        this.key_col = key_col;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("UpdatedeleteFileVo [");
      sb.append("table_nm").append("=").append(table_nm).append(",");
      sb.append("col_nm").append("=").append(col_nm).append(",");
      sb.append("key_col").append("=").append(key_col).append(",");
      sb.append("req_no").append("=").append(req_no);
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