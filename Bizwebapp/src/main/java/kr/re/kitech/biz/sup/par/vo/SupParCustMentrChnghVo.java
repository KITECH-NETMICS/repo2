package kr.re.kitech.biz.sup.par.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "파트너기업 정보변경 신청 목록 vo")
public class SupParCustMentrChnghVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public SupParCustMentrChnghVo(){
  }

    @ElDtoField(logicalName = "reqYmdSt", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;
  
    @ElDtoField(logicalName = "reqYmdEd", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;
  
    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;
  
    @ElDtoField(logicalName = "bsnsPsnRegstNo", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;
  
    @ElDtoField(logicalName = "reprsPsn", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;
  
    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;
  
    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;
  
    @ElDtoField(logicalName = "parMgmtNo", physicalName = "par_mgmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String par_mgmt_no;
  
    @ElDtoField(logicalName = "beforeMento", physicalName = "before_mento", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String before_mento;
  
    @ElDtoField(logicalName = "afterMento", physicalName = "after_mento", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String after_mento;
  
    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;
  
    @ElDtoField(logicalName = "cmpyReprsTel", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;
  
    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
    
    @ElDtoField(logicalName = "appont_no", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "chgn_resn", physicalName = "chgn_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chgn_resn;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
    
    @ElDtoField(logicalName = "chngClsf", physicalName = "chng_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_clsf;
    
    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;
    
    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;
    
    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;
    
    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
    
    @ElDtoField(logicalName = "depthed", physicalName = "depthed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed;
    
    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }
  
    @ElVoField(physicalName = "req_ymd_st")
    public String getReq_ymd_st(){
        return req_ymd_st;
    }
  
    @ElVoField(physicalName = "req_ymd_st")
    public void setReq_ymd_st(String req_ymd_st){
        this.req_ymd_st = req_ymd_st;
    }
  
    @ElVoField(physicalName = "req_ymd_ed")
    public String getReq_ymd_ed(){
        return req_ymd_ed;
    }
  
    @ElVoField(physicalName = "req_ymd_ed")
    public void setReq_ymd_ed(String req_ymd_ed){
        this.req_ymd_ed = req_ymd_ed;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }
  
    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }
  
    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }
  
    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }
  
    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }
  
    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }
  
    @ElVoField(physicalName = "par_mgmt_no")
    public String getPar_mgmt_no(){
        return par_mgmt_no;
    }
  
    @ElVoField(physicalName = "par_mgmt_no")
    public void setPar_mgmt_no(String par_mgmt_no){
        this.par_mgmt_no = par_mgmt_no;
    }
  
    @ElVoField(physicalName = "before_mento")
    public String getBefore_mento(){
        return before_mento;
    }
  
    @ElVoField(physicalName = "before_mento")
    public void setBefore_mento(String before_mento){
        this.before_mento = before_mento;
    }
  
    @ElVoField(physicalName = "after_mento")
    public String getAfter_mento(){
        return after_mento;
    }
  
    @ElVoField(physicalName = "after_mento")
    public void setAfter_mento(String after_mento){
        this.after_mento = after_mento;
    }
  
    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }
  
    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }
  
    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }
  
    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }
  
    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }
  
    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }
    
    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "chgn_resn")
    public String getChgn_resn(){
        return chgn_resn;
    }

    @ElVoField(physicalName = "chgn_resn")
    public void setChgn_resn(String chgn_resn){
        this.chgn_resn = chgn_resn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
    
    @ElVoField(physicalName = "chng_clsf")
    public String getChng_clsf(){
        return chng_clsf;
    }
  
    @ElVoField(physicalName = "chng_clsf")
    public void setChng_clsf(String chng_clsf){
        this.chng_clsf = chng_clsf;
    }
    
    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }
  
    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }
    
    @ElVoField(physicalName = "doc_id")
    public String getDocId(){
        return doc_id;
    }
  
    @ElVoField(physicalName = "doc_id")
    public void setDocId(String doc_id){
        this.doc_id = doc_id;
    }
    
    @ElVoField(physicalName = "service_id")
    public String getServiceId(){
        return service_id;
    }
  
    @ElVoField(physicalName = "service_id")
    public void setServiceId(String service_id){
        this.service_id = service_id;
    }
    
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
    
    @ElVoField(physicalName = "depthed")
    public String getDepthed(){
        return depthed;
    }
  
    @ElVoField(physicalName = "depthed")
    public void setDepthed(String depthed){
        this.depthed = depthed;
    }
    
    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }
    
    
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("SupParCustMentrChnghVo [");
      sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
      sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
      sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
      sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("apr_state").append("=").append(apr_state).append(",");
      sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
      sb.append("req_ymd").append("=").append(req_ymd).append(",");
      sb.append("cust_no").append("=").append(cust_no).append(",");
      sb.append("par_mgmt_no").append("=").append(par_mgmt_no).append(",");
      sb.append("before_mento").append("=").append(before_mento).append(",");
      sb.append("after_mento").append("=").append(after_mento).append(",");
      sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
      sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
      sb.append("rmk").append("=").append(rmk).append(",");
      sb.append("appont_no").append("=").append(appont_no).append(",");
      sb.append("chgn_resn").append("=").append(chgn_resn).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("chng_clsf").append("=").append(chng_clsf).append(",");
      sb.append("cnt").append("=").append(cnt).append(",");
      sb.append("doc_id").append("=").append(doc_id).append(",");
      sb.append("service_id").append("=").append(service_id).append(",");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("depthed").append("=").append(depthed).append(",");
      sb.append("fileList").append("=").append(fileList);
      sb.append("]");
      return sb.toString();
    }


  public boolean isFixedLengthVo() {
    return false;
  }

  @Override
  public void _xStreamEnc() {
	  for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
          kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
          vo._xStreamEnc();	 
      }
  }

  @Override
  public void _xStreamDec() {
	  for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
          kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
          vo._xStreamDec();	 
      }
  }
}