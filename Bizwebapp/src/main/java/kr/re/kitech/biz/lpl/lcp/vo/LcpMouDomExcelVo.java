package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpMouDomExcelExp")
public class LcpMouDomExcelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public LcpMouDomExcelVo(){
  }

    @ElDtoField(logicalName = "mouContrctYmd1", physicalName = "mou_contrct_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd1;
  
    @ElDtoField(logicalName = "mouContrctYmd2", physicalName = "mou_contrct_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd2;
  
    @ElDtoField(logicalName = "mouSubj", physicalName = "mou_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_subj;
  
    @ElDtoField(logicalName = "agncyClsf", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;
  
    @ElDtoField(logicalName = "cmpyNmEng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
  
    @ElDtoField(logicalName = "mouNo", physicalName = "mou_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_no;
  
    @ElDtoField(logicalName = "mouContrctYmd", physicalName = "mou_contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_contrct_ymd;
  
    @ElDtoField(logicalName = "mouClsYmd", physicalName = "mou_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_cls_ymd;
  
    @ElDtoField(logicalName = "valitationYn", physicalName = "valitation_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String valitation_yn;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "krcharAgncyNm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;
  
    @ElDtoField(logicalName = "agncyClsfNm", physicalName = "agncy_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf_nm;
  
    @ElDtoField(logicalName = "contractorSyspayno", physicalName = "contractor_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contractor_syspayno;
  
    @ElDtoField(logicalName = "contractorNm", physicalName = "contractor_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contractor_nm;
  
    @ElDtoField(logicalName = "reqChargSyspayno", physicalName = "req_charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_charg_syspayno;
  
    @ElDtoField(logicalName = "reqChargNm", physicalName = "req_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_charg_nm;
  
    @ElDtoField(logicalName = "reqChargDeptNm", physicalName = "req_charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_charg_dept_nm;
  
    @ElDtoField(logicalName = "oldReqChargDeptNm", physicalName = "old_req_charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_req_charg_dept_nm;
  
    @ElDtoField(logicalName = "chargSyspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;
  
    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;
  
    @ElDtoField(logicalName = "chargDeptNm", physicalName = "charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_nm;
  
    @ElDtoField(logicalName = "oldChargDeptNm", physicalName = "old_charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_charg_dept_nm;
  
    @ElVoField(physicalName = "mou_contrct_ymd1")
    public String getMou_contrct_ymd1(){
        return mou_contrct_ymd1;
    }
  
    @ElVoField(physicalName = "mou_contrct_ymd1")
    public void setMou_contrct_ymd1(String mou_contrct_ymd1){
        this.mou_contrct_ymd1 = mou_contrct_ymd1;
    }
  
    @ElVoField(physicalName = "mou_contrct_ymd2")
    public String getMou_contrct_ymd2(){
        return mou_contrct_ymd2;
    }
  
    @ElVoField(physicalName = "mou_contrct_ymd2")
    public void setMou_contrct_ymd2(String mou_contrct_ymd2){
        this.mou_contrct_ymd2 = mou_contrct_ymd2;
    }
  
    @ElVoField(physicalName = "mou_subj")
    public String getMou_subj(){
        return mou_subj;
    }
  
    @ElVoField(physicalName = "mou_subj")
    public void setMou_subj(String mou_subj){
        this.mou_subj = mou_subj;
    }
  
    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }
  
    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }
  
    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "mou_no")
    public String getMou_no(){
        return mou_no;
    }
  
    @ElVoField(physicalName = "mou_no")
    public void setMou_no(String mou_no){
        this.mou_no = mou_no;
    }
  
    @ElVoField(physicalName = "mou_contrct_ymd")
    public String getMou_contrct_ymd(){
        return mou_contrct_ymd;
    }
  
    @ElVoField(physicalName = "mou_contrct_ymd")
    public void setMou_contrct_ymd(String mou_contrct_ymd){
        this.mou_contrct_ymd = mou_contrct_ymd;
    }
  
    @ElVoField(physicalName = "mou_cls_ymd")
    public String getMou_cls_ymd(){
        return mou_cls_ymd;
    }
  
    @ElVoField(physicalName = "mou_cls_ymd")
    public void setMou_cls_ymd(String mou_cls_ymd){
        this.mou_cls_ymd = mou_cls_ymd;
    }
  
    @ElVoField(physicalName = "valitation_yn")
    public String getValitation_yn(){
        return valitation_yn;
    }
  
    @ElVoField(physicalName = "valitation_yn")
    public void setValitation_yn(String valitation_yn){
        this.valitation_yn = valitation_yn;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }
  
    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }
  
    @ElVoField(physicalName = "agncy_clsf_nm")
    public String getAgncy_clsf_nm(){
        return agncy_clsf_nm;
    }
  
    @ElVoField(physicalName = "agncy_clsf_nm")
    public void setAgncy_clsf_nm(String agncy_clsf_nm){
        this.agncy_clsf_nm = agncy_clsf_nm;
    }
  
    @ElVoField(physicalName = "contractor_syspayno")
    public String getContractor_syspayno(){
        return contractor_syspayno;
    }
  
    @ElVoField(physicalName = "contractor_syspayno")
    public void setContractor_syspayno(String contractor_syspayno){
        this.contractor_syspayno = contractor_syspayno;
    }
  
    @ElVoField(physicalName = "contractor_nm")
    public String getContractor_nm(){
        return contractor_nm;
    }
  
    @ElVoField(physicalName = "contractor_nm")
    public void setContractor_nm(String contractor_nm){
        this.contractor_nm = contractor_nm;
    }
  
    @ElVoField(physicalName = "req_charg_syspayno")
    public String getReq_charg_syspayno(){
        return req_charg_syspayno;
    }
  
    @ElVoField(physicalName = "req_charg_syspayno")
    public void setReq_charg_syspayno(String req_charg_syspayno){
        this.req_charg_syspayno = req_charg_syspayno;
    }
  
    @ElVoField(physicalName = "req_charg_nm")
    public String getReq_charg_nm(){
        return req_charg_nm;
    }
  
    @ElVoField(physicalName = "req_charg_nm")
    public void setReq_charg_nm(String req_charg_nm){
        this.req_charg_nm = req_charg_nm;
    }
  
    @ElVoField(physicalName = "req_charg_dept_nm")
    public String getReq_charg_dept_nm(){
        return req_charg_dept_nm;
    }
  
    @ElVoField(physicalName = "req_charg_dept_nm")
    public void setReq_charg_dept_nm(String req_charg_dept_nm){
        this.req_charg_dept_nm = req_charg_dept_nm;
    }
  
    @ElVoField(physicalName = "old_req_charg_dept_nm")
    public String getOld_req_charg_dept_nm(){
        return old_req_charg_dept_nm;
    }
  
    @ElVoField(physicalName = "old_req_charg_dept_nm")
    public void setOld_req_charg_dept_nm(String old_req_charg_dept_nm){
        this.old_req_charg_dept_nm = old_req_charg_dept_nm;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }
  
    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }
  
    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }
  
    @ElVoField(physicalName = "charg_dept_nm")
    public String getCharg_dept_nm(){
        return charg_dept_nm;
    }
  
    @ElVoField(physicalName = "charg_dept_nm")
    public void setCharg_dept_nm(String charg_dept_nm){
        this.charg_dept_nm = charg_dept_nm;
    }
  
    @ElVoField(physicalName = "old_charg_dept_nm")
    public String getOld_charg_dept_nm(){
        return old_charg_dept_nm;
    }
  
    @ElVoField(physicalName = "old_charg_dept_nm")
    public void setOld_charg_dept_nm(String old_charg_dept_nm){
        this.old_charg_dept_nm = old_charg_dept_nm;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("LcpMouDomExcelVo [");
      sb.append("mou_contrct_ymd1").append("=").append(mou_contrct_ymd1).append(",");
      sb.append("mou_contrct_ymd2").append("=").append(mou_contrct_ymd2).append(",");
      sb.append("mou_subj").append("=").append(mou_subj).append(",");
      sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
      sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
      sb.append("mou_no").append("=").append(mou_no).append(",");
      sb.append("mou_contrct_ymd").append("=").append(mou_contrct_ymd).append(",");
      sb.append("mou_cls_ymd").append("=").append(mou_cls_ymd).append(",");
      sb.append("valitation_yn").append("=").append(valitation_yn).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
      sb.append("agncy_clsf_nm").append("=").append(agncy_clsf_nm).append(",");
      sb.append("contractor_syspayno").append("=").append(contractor_syspayno).append(",");
      sb.append("contractor_nm").append("=").append(contractor_nm).append(",");
      sb.append("req_charg_syspayno").append("=").append(req_charg_syspayno).append(",");
      sb.append("req_charg_nm").append("=").append(req_charg_nm).append(",");
      sb.append("req_charg_dept_nm").append("=").append(req_charg_dept_nm).append(",");
      sb.append("old_req_charg_dept_nm").append("=").append(old_req_charg_dept_nm).append(",");
      sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
      sb.append("charg_nm").append("=").append(charg_nm).append(",");
      sb.append("charg_dept_nm").append("=").append(charg_dept_nm).append(",");
      sb.append("old_charg_dept_nm").append("=").append(old_charg_dept_nm);
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