package kr.re.kitech.biz.hum.apy.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumApyTrainLstReqVo")
public class HumApyTrainLstReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public HumApyTrainLstReqVo(){
  }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "rptReqNo", physicalName = "rpt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_no;
  
    @ElDtoField(logicalName = "reqYmdFrom", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;
  
    @ElDtoField(logicalName = "reqYmdTo", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;
  
    @ElDtoField(logicalName = "rptReqYmdFrom", physicalName = "rpt_req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_ymd_from;
  
    @ElDtoField(logicalName = "rptReqYmdTo", physicalName = "rpt_req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_ymd_to;
  
    @ElDtoField(logicalName = "startYmdFrom", physicalName = "start_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd_from;
  
    @ElDtoField(logicalName = "clsYmdTo", physicalName = "cls_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd_to;
  
    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;
  
    @ElDtoField(logicalName = "aprStateRpt", physicalName = "apr_state_rpt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_rpt;
  
    @ElDtoField(logicalName = "educTyp", physicalName = "educ_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ;
  
    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;
  
    @ElDtoField(logicalName = "educNm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;
  
    @ElDtoField(logicalName = "acpSyspayno", physicalName = "acp_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acp_syspayno;
  
    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;
  
    @ElDtoField(logicalName = "educAmt", physicalName = "educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_amt;
  
    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;
  
    @ElDtoField(logicalName = "rptReqYmd", physicalName = "rpt_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_req_ymd;
  
    @ElDtoField(logicalName = "rptEducAmt", physicalName = "rpt_educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_educ_amt;
  
    @ElDtoField(logicalName = "rptAprStateNm", physicalName = "rpt_apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_apr_state_nm;
  
    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;
  
    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;
  
    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;
  
    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;
  
    @ElDtoField(logicalName = "posiCd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;
  
    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;
  
    @ElDtoField(logicalName = "educTypNm", physicalName = "educ_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_typ_nm;
  
    @ElDtoField(logicalName = "educCd", physicalName = "educ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd;
  
    @ElDtoField(logicalName = "educCdNm", physicalName = "educ_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_cd_nm;
  
    @ElDtoField(logicalName = "educAgncy", physicalName = "educ_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_agncy;
  
    @ElDtoField(logicalName = "periodYmd", physicalName = "period_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String period_ymd;
  
    @ElDtoField(logicalName = "educTime", physicalName = "educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_time;
  
    @ElDtoField(logicalName = "pacpCntInfo", physicalName = "pacp_cnt_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pacp_cnt_info;
  
    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;
  
    @ElDtoField(logicalName = "expnsCd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;
  
    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;
  
    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;
    
    @ElDtoField(logicalName = "ducCode", physicalName = "duc_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duc_code;
    
    @ElDtoField(logicalName = "chVal", physicalName = "ch_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ch_val;
  
    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }
  
    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }
  
    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }
  
    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }
  
    @ElVoField(physicalName = "rpt_req_no")
    public String getRpt_req_no(){
        return rpt_req_no;
    }
  
    @ElVoField(physicalName = "rpt_req_no")
    public void setRpt_req_no(String rpt_req_no){
        this.rpt_req_no = rpt_req_no;
    }
  
    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }
  
    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }
  
    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }
  
    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd_from")
    public String getRpt_req_ymd_from(){
        return rpt_req_ymd_from;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd_from")
    public void setRpt_req_ymd_from(String rpt_req_ymd_from){
        this.rpt_req_ymd_from = rpt_req_ymd_from;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd_to")
    public String getRpt_req_ymd_to(){
        return rpt_req_ymd_to;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd_to")
    public void setRpt_req_ymd_to(String rpt_req_ymd_to){
        this.rpt_req_ymd_to = rpt_req_ymd_to;
    }
  
    @ElVoField(physicalName = "start_ymd_from")
    public String getStart_ymd_from(){
        return start_ymd_from;
    }
  
    @ElVoField(physicalName = "start_ymd_from")
    public void setStart_ymd_from(String start_ymd_from){
        this.start_ymd_from = start_ymd_from;
    }
  
    @ElVoField(physicalName = "cls_ymd_to")
    public String getCls_ymd_to(){
        return cls_ymd_to;
    }
  
    @ElVoField(physicalName = "cls_ymd_to")
    public void setCls_ymd_to(String cls_ymd_to){
        this.cls_ymd_to = cls_ymd_to;
    }
  
    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }
  
    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }
  
    @ElVoField(physicalName = "apr_state_rpt")
    public String getApr_state_rpt(){
        return apr_state_rpt;
    }
  
    @ElVoField(physicalName = "apr_state_rpt")
    public void setApr_state_rpt(String apr_state_rpt){
        this.apr_state_rpt = apr_state_rpt;
    }
  
    @ElVoField(physicalName = "educ_typ")
    public String getEduc_typ(){
        return educ_typ;
    }
  
    @ElVoField(physicalName = "educ_typ")
    public void setEduc_typ(String educ_typ){
        this.educ_typ = educ_typ;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }
  
    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }
  
    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }
  
    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }
  
    @ElVoField(physicalName = "acp_syspayno")
    public String getAcp_syspayno(){
        return acp_syspayno;
    }
  
    @ElVoField(physicalName = "acp_syspayno")
    public void setAcp_syspayno(String acp_syspayno){
        this.acp_syspayno = acp_syspayno;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }
  
    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public String getEduc_amt(){
        return educ_amt;
    }
  
    @ElVoField(physicalName = "educ_amt")
    public void setEduc_amt(String educ_amt){
        this.educ_amt = educ_amt;
    }
  
    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }
  
    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd")
    public String getRpt_req_ymd(){
        return rpt_req_ymd;
    }
  
    @ElVoField(physicalName = "rpt_req_ymd")
    public void setRpt_req_ymd(String rpt_req_ymd){
        this.rpt_req_ymd = rpt_req_ymd;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public String getRpt_educ_amt(){
        return rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "rpt_educ_amt")
    public void setRpt_educ_amt(String rpt_educ_amt){
        this.rpt_educ_amt = rpt_educ_amt;
    }
  
    @ElVoField(physicalName = "rpt_apr_state_nm")
    public String getRpt_apr_state_nm(){
        return rpt_apr_state_nm;
    }
  
    @ElVoField(physicalName = "rpt_apr_state_nm")
    public void setRpt_apr_state_nm(String rpt_apr_state_nm){
        this.rpt_apr_state_nm = rpt_apr_state_nm;
    }
  
    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }
  
    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }
  
    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }
  
    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }
  
    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }
  
    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }
  
    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }
  
    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }
  
    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }
  
    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }
  
    @ElVoField(physicalName = "educ_typ_nm")
    public String getEduc_typ_nm(){
        return educ_typ_nm;
    }
  
    @ElVoField(physicalName = "educ_typ_nm")
    public void setEduc_typ_nm(String educ_typ_nm){
        this.educ_typ_nm = educ_typ_nm;
    }
  
    @ElVoField(physicalName = "educ_cd")
    public String getEduc_cd(){
        return educ_cd;
    }
  
    @ElVoField(physicalName = "educ_cd")
    public void setEduc_cd(String educ_cd){
        this.educ_cd = educ_cd;
    }
  
    @ElVoField(physicalName = "educ_cd_nm")
    public String getEduc_cd_nm(){
        return educ_cd_nm;
    }
  
    @ElVoField(physicalName = "educ_cd_nm")
    public void setEduc_cd_nm(String educ_cd_nm){
        this.educ_cd_nm = educ_cd_nm;
    }
  
    @ElVoField(physicalName = "educ_agncy")
    public String getEduc_agncy(){
        return educ_agncy;
    }
  
    @ElVoField(physicalName = "educ_agncy")
    public void setEduc_agncy(String educ_agncy){
        this.educ_agncy = educ_agncy;
    }
  
    @ElVoField(physicalName = "period_ymd")
    public String getPeriod_ymd(){
        return period_ymd;
    }
  
    @ElVoField(physicalName = "period_ymd")
    public void setPeriod_ymd(String period_ymd){
        this.period_ymd = period_ymd;
    }
  
    @ElVoField(physicalName = "educ_time")
    public String getEduc_time(){
        return educ_time;
    }
  
    @ElVoField(physicalName = "educ_time")
    public void setEduc_time(String educ_time){
        this.educ_time = educ_time;
    }
  
    @ElVoField(physicalName = "pacp_cnt_info")
    public String getPacp_cnt_info(){
        return pacp_cnt_info;
    }
  
    @ElVoField(physicalName = "pacp_cnt_info")
    public void setPacp_cnt_info(String pacp_cnt_info){
        this.pacp_cnt_info = pacp_cnt_info;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }
  
    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }
  
    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }
  
    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }
  
    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }
    
    @ElVoField(physicalName = "duc_code")
    public String getDuc_code(){
        return duc_code;
    }
  
    @ElVoField(physicalName = "duc_code")
    public void setDuc_code(String duc_code){
        this.duc_code = duc_code;
    }
  
    
    @ElVoField(physicalName = "ch_val")
	public String getCh_val() {
		return ch_val;
	}

    @ElVoField(physicalName = "ch_val")
	public void setCh_val(String ch_val) {
		this.ch_val = ch_val;
	}

@Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("HumApyTrainLstReqVo [");
      sb.append("syspayno").append("=").append(syspayno).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("rpt_req_no").append("=").append(rpt_req_no).append(",");
      sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
      sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
      sb.append("rpt_req_ymd_from").append("=").append(rpt_req_ymd_from).append(",");
      sb.append("rpt_req_ymd_to").append("=").append(rpt_req_ymd_to).append(",");
      sb.append("start_ymd_from").append("=").append(start_ymd_from).append(",");
      sb.append("cls_ymd_to").append("=").append(cls_ymd_to).append(",");
      sb.append("apr_state").append("=").append(apr_state).append(",");
      sb.append("apr_state_rpt").append("=").append(apr_state_rpt).append(",");
      sb.append("educ_typ").append("=").append(educ_typ).append(",");
      sb.append("dept_cd").append("=").append(dept_cd).append(",");
      sb.append("educ_nm").append("=").append(educ_nm).append(",");
      sb.append("acp_syspayno").append("=").append(acp_syspayno).append(",");
      sb.append("req_ymd").append("=").append(req_ymd).append(",");
      sb.append("educ_amt").append("=").append(educ_amt).append(",");
      sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
      sb.append("rpt_req_ymd").append("=").append(rpt_req_ymd).append(",");
      sb.append("rpt_educ_amt").append("=").append(rpt_educ_amt).append(",");
      sb.append("rpt_apr_state_nm").append("=").append(rpt_apr_state_nm).append(",");
      sb.append("ymd").append("=").append(ymd).append(",");
      sb.append("empno").append("=").append(empno).append(",");
      sb.append("nm").append("=").append(nm).append(",");
      sb.append("dept_nm").append("=").append(dept_nm).append(",");
      sb.append("posi_cd").append("=").append(posi_cd).append(",");
      sb.append("posi_nm").append("=").append(posi_nm).append(",");
      sb.append("educ_typ_nm").append("=").append(educ_typ_nm).append(",");
      sb.append("educ_cd").append("=").append(educ_cd).append(",");
      sb.append("educ_cd_nm").append("=").append(educ_cd_nm).append(",");
      sb.append("educ_agncy").append("=").append(educ_agncy).append(",");
      sb.append("period_ymd").append("=").append(period_ymd).append(",");
      sb.append("educ_time").append("=").append(educ_time).append(",");
      sb.append("pacp_cnt_info").append("=").append(pacp_cnt_info).append(",");
      sb.append("accnt_no").append("=").append(accnt_no).append(",");
      sb.append("expns_cd").append("=").append(expns_cd).append(",");
      sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
      sb.append("start_ymd").append("=").append(start_ymd).append(",");
      sb.append("duc_code").append("=").append(duc_code).append(",");
      sb.append("ch_val").append("=").append(ch_val);
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