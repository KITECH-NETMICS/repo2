package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatRegstUpdateExp")
public class PatRegstUpdateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public PatRegstUpdateVo(){
  }

    @ElDtoField(logicalName = "regstDecsnYmd", physicalName = "regst_decsn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_ymd;
  
    @ElDtoField(logicalName = "excPatYn", physicalName = "exc_pat_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exc_pat_yn;
  
    @ElDtoField(logicalName = "evalGrd", physicalName = "eval_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_grd;
  
    @ElDtoField(logicalName = "evalYmd", physicalName = "eval_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_ymd;
  
    @ElDtoField(logicalName = "attachFileNo2", physicalName = "attach_file_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no2;
  
    @ElDtoField(logicalName = "payCloseYmd", physicalName = "pay_close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_close_ymd;
  
    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;
  
    @ElDtoField(logicalName = "rptId", physicalName = "rpt_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_id;
  
    @ElDtoField(logicalName = "rptReplyReqYmd", physicalName = "rpt_reply_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_reply_req_ymd;
  
    @ElDtoField(logicalName = "rptYmd", physicalName = "rpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_ymd;
  
    @ElDtoField(logicalName = "rptRmk", physicalName = "rpt_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_rmk;
  
    @ElDtoField(logicalName = "rcptSyspayno", physicalName = "rcpt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspayno;
  
    @ElDtoField(logicalName = "rcptRevwReqYmd", physicalName = "rcpt_revw_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_revw_req_ymd;
  
    @ElDtoField(logicalName = "rcptRevwReqRmk", physicalName = "rcpt_revw_req_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_revw_req_rmk;
  
    @ElDtoField(logicalName = "revwGiveupClsf", physicalName = "revw_giveup_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_giveup_clsf;
  
    @ElDtoField(logicalName = "revwCompltHopeYmd", physicalName = "revw_complt_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_complt_hope_ymd;
  
    @ElDtoField(logicalName = "revwYmd", physicalName = "revw_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_ymd;
  
    @ElDtoField(logicalName = "revwRmk", physicalName = "revw_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_rmk;
  
    @ElDtoField(logicalName = "indicCompltHopeYmd", physicalName = "indic_complt_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_complt_hope_ymd;
  
    @ElDtoField(logicalName = "indicYmd", physicalName = "indic_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_ymd;
  
    @ElDtoField(logicalName = "indicRmk", physicalName = "indic_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indic_rmk;
  
    @ElDtoField(logicalName = "indepenItem", physicalName = "indepen_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indepen_item;
  
    @ElDtoField(logicalName = "subordiItem", physicalName = "subordi_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subordi_item;
  
    @ElDtoField(logicalName = "chartPage", physicalName = "chart_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chart_page;
  
    @ElDtoField(logicalName = "detlsPage", physicalName = "detls_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_page;
  
    @ElDtoField(logicalName = "compltRptId", physicalName = "complt_rpt_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_id;
  
    @ElDtoField(logicalName = "compltRptYmd", physicalName = "complt_rpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_ymd;
  
    @ElDtoField(logicalName = "compltRptRmk", physicalName = "complt_rpt_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_rmk;
  
    @ElDtoField(logicalName = "revwReqYmd", physicalName = "revw_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_req_ymd;
  
    @ElDtoField(logicalName = "revwReqRmk", physicalName = "revw_req_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_req_rmk;
  
    @ElDtoField(logicalName = "reWrteIndicReqYmd", physicalName = "re_wrte_indic_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_wrte_indic_req_ymd;
  
    @ElDtoField(logicalName = "reWrteIndicReqRmk", physicalName = "re_wrte_indic_req_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_wrte_indic_req_rmk;
  
    @ElDtoField(logicalName = "reWrteIndicYmd", physicalName = "re_wrte_indic_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_wrte_indic_ymd;
  
    @ElDtoField(logicalName = "reWrteIndicRmk", physicalName = "re_wrte_indic_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_wrte_indic_rmk;
  
    @ElDtoField(logicalName = "revwCompltAffirYmd", physicalName = "revw_complt_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_complt_affir_ymd;
  
    @ElDtoField(logicalName = "revwCompltAffirRmk", physicalName = "revw_complt_affir_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revw_complt_affir_rmk;
  
    @ElDtoField(logicalName = "rcptCompltAffirYmd", physicalName = "rcpt_complt_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_complt_affir_ymd;
  
    @ElDtoField(logicalName = "rcptCompltAffirRmk", physicalName = "rcpt_complt_affir_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_complt_affir_rmk;
  
    @ElDtoField(logicalName = "evalSendEx", physicalName = "eval_send_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_send_ex;
  
    @ElDtoField(logicalName = "evalApplyAnal", physicalName = "eval_apply_anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_apply_anal;
  
    @ElDtoField(logicalName = "taxBill", physicalName = "tax_bill", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill;
  
    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;
  
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
  
    @ElDtoField(logicalName = "regstDecsnAmt", physicalName = "regst_decsn_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_amt;
  
    @ElDtoField(logicalName = "regstDecsnAmtYmd", physicalName = "regst_decsn_amt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_amt_ymd;
  
    @ElDtoField(logicalName = "examReflectClsf", physicalName = "exam_reflect_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_reflect_clsf;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;
  
    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;
  
    @ElVoField(physicalName = "regst_decsn_ymd")
    public String getRegst_decsn_ymd(){
        return regst_decsn_ymd;
    }
  
    @ElVoField(physicalName = "regst_decsn_ymd")
    public void setRegst_decsn_ymd(String regst_decsn_ymd){
        this.regst_decsn_ymd = regst_decsn_ymd;
    }
  
    @ElVoField(physicalName = "exc_pat_yn")
    public String getExc_pat_yn(){
        return exc_pat_yn;
    }
  
    @ElVoField(physicalName = "exc_pat_yn")
    public void setExc_pat_yn(String exc_pat_yn){
        this.exc_pat_yn = exc_pat_yn;
    }
  
    @ElVoField(physicalName = "eval_grd")
    public String getEval_grd(){
        return eval_grd;
    }
  
    @ElVoField(physicalName = "eval_grd")
    public void setEval_grd(String eval_grd){
        this.eval_grd = eval_grd;
    }
  
    @ElVoField(physicalName = "eval_ymd")
    public String getEval_ymd(){
        return eval_ymd;
    }
  
    @ElVoField(physicalName = "eval_ymd")
    public void setEval_ymd(String eval_ymd){
        this.eval_ymd = eval_ymd;
    }
  
    @ElVoField(physicalName = "attach_file_no2")
    public String getAttach_file_no2(){
        return attach_file_no2;
    }
  
    @ElVoField(physicalName = "attach_file_no2")
    public void setAttach_file_no2(String attach_file_no2){
        this.attach_file_no2 = attach_file_no2;
    }
  
    @ElVoField(physicalName = "pay_close_ymd")
    public String getPay_close_ymd(){
        return pay_close_ymd;
    }
  
    @ElVoField(physicalName = "pay_close_ymd")
    public void setPay_close_ymd(String pay_close_ymd){
        this.pay_close_ymd = pay_close_ymd;
    }
  
    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }
  
    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }
  
    @ElVoField(physicalName = "rpt_id")
    public String getRpt_id(){
        return rpt_id;
    }
  
    @ElVoField(physicalName = "rpt_id")
    public void setRpt_id(String rpt_id){
        this.rpt_id = rpt_id;
    }
  
    @ElVoField(physicalName = "rpt_reply_req_ymd")
    public String getRpt_reply_req_ymd(){
        return rpt_reply_req_ymd;
    }
  
    @ElVoField(physicalName = "rpt_reply_req_ymd")
    public void setRpt_reply_req_ymd(String rpt_reply_req_ymd){
        this.rpt_reply_req_ymd = rpt_reply_req_ymd;
    }
  
    @ElVoField(physicalName = "rpt_ymd")
    public String getRpt_ymd(){
        return rpt_ymd;
    }
  
    @ElVoField(physicalName = "rpt_ymd")
    public void setRpt_ymd(String rpt_ymd){
        this.rpt_ymd = rpt_ymd;
    }
  
    @ElVoField(physicalName = "rpt_rmk")
    public String getRpt_rmk(){
        return rpt_rmk;
    }
  
    @ElVoField(physicalName = "rpt_rmk")
    public void setRpt_rmk(String rpt_rmk){
        this.rpt_rmk = rpt_rmk;
    }
  
    @ElVoField(physicalName = "rcpt_syspayno")
    public String getRcpt_syspayno(){
        return rcpt_syspayno;
    }
  
    @ElVoField(physicalName = "rcpt_syspayno")
    public void setRcpt_syspayno(String rcpt_syspayno){
        this.rcpt_syspayno = rcpt_syspayno;
    }
  
    @ElVoField(physicalName = "rcpt_revw_req_ymd")
    public String getRcpt_revw_req_ymd(){
        return rcpt_revw_req_ymd;
    }
  
    @ElVoField(physicalName = "rcpt_revw_req_ymd")
    public void setRcpt_revw_req_ymd(String rcpt_revw_req_ymd){
        this.rcpt_revw_req_ymd = rcpt_revw_req_ymd;
    }
  
    @ElVoField(physicalName = "rcpt_revw_req_rmk")
    public String getRcpt_revw_req_rmk(){
        return rcpt_revw_req_rmk;
    }
  
    @ElVoField(physicalName = "rcpt_revw_req_rmk")
    public void setRcpt_revw_req_rmk(String rcpt_revw_req_rmk){
        this.rcpt_revw_req_rmk = rcpt_revw_req_rmk;
    }
  
    @ElVoField(physicalName = "revw_giveup_clsf")
    public String getRevw_giveup_clsf(){
        return revw_giveup_clsf;
    }
  
    @ElVoField(physicalName = "revw_giveup_clsf")
    public void setRevw_giveup_clsf(String revw_giveup_clsf){
        this.revw_giveup_clsf = revw_giveup_clsf;
    }
  
    @ElVoField(physicalName = "revw_complt_hope_ymd")
    public String getRevw_complt_hope_ymd(){
        return revw_complt_hope_ymd;
    }
  
    @ElVoField(physicalName = "revw_complt_hope_ymd")
    public void setRevw_complt_hope_ymd(String revw_complt_hope_ymd){
        this.revw_complt_hope_ymd = revw_complt_hope_ymd;
    }
  
    @ElVoField(physicalName = "revw_ymd")
    public String getRevw_ymd(){
        return revw_ymd;
    }
  
    @ElVoField(physicalName = "revw_ymd")
    public void setRevw_ymd(String revw_ymd){
        this.revw_ymd = revw_ymd;
    }
  
    @ElVoField(physicalName = "revw_rmk")
    public String getRevw_rmk(){
        return revw_rmk;
    }
  
    @ElVoField(physicalName = "revw_rmk")
    public void setRevw_rmk(String revw_rmk){
        this.revw_rmk = revw_rmk;
    }
  
    @ElVoField(physicalName = "indic_complt_hope_ymd")
    public String getIndic_complt_hope_ymd(){
        return indic_complt_hope_ymd;
    }
  
    @ElVoField(physicalName = "indic_complt_hope_ymd")
    public void setIndic_complt_hope_ymd(String indic_complt_hope_ymd){
        this.indic_complt_hope_ymd = indic_complt_hope_ymd;
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
  
    @ElVoField(physicalName = "indepen_item")
    public String getIndepen_item(){
        return indepen_item;
    }
  
    @ElVoField(physicalName = "indepen_item")
    public void setIndepen_item(String indepen_item){
        this.indepen_item = indepen_item;
    }
  
    @ElVoField(physicalName = "subordi_item")
    public String getSubordi_item(){
        return subordi_item;
    }
  
    @ElVoField(physicalName = "subordi_item")
    public void setSubordi_item(String subordi_item){
        this.subordi_item = subordi_item;
    }
  
    @ElVoField(physicalName = "chart_page")
    public String getChart_page(){
        return chart_page;
    }
  
    @ElVoField(physicalName = "chart_page")
    public void setChart_page(String chart_page){
        this.chart_page = chart_page;
    }
  
    @ElVoField(physicalName = "detls_page")
    public String getDetls_page(){
        return detls_page;
    }
  
    @ElVoField(physicalName = "detls_page")
    public void setDetls_page(String detls_page){
        this.detls_page = detls_page;
    }
  
    @ElVoField(physicalName = "complt_rpt_id")
    public String getComplt_rpt_id(){
        return complt_rpt_id;
    }
  
    @ElVoField(physicalName = "complt_rpt_id")
    public void setComplt_rpt_id(String complt_rpt_id){
        this.complt_rpt_id = complt_rpt_id;
    }
  
    @ElVoField(physicalName = "complt_rpt_ymd")
    public String getComplt_rpt_ymd(){
        return complt_rpt_ymd;
    }
  
    @ElVoField(physicalName = "complt_rpt_ymd")
    public void setComplt_rpt_ymd(String complt_rpt_ymd){
        this.complt_rpt_ymd = complt_rpt_ymd;
    }
  
    @ElVoField(physicalName = "complt_rpt_rmk")
    public String getComplt_rpt_rmk(){
        return complt_rpt_rmk;
    }
  
    @ElVoField(physicalName = "complt_rpt_rmk")
    public void setComplt_rpt_rmk(String complt_rpt_rmk){
        this.complt_rpt_rmk = complt_rpt_rmk;
    }
  
    @ElVoField(physicalName = "revw_req_ymd")
    public String getRevw_req_ymd(){
        return revw_req_ymd;
    }
  
    @ElVoField(physicalName = "revw_req_ymd")
    public void setRevw_req_ymd(String revw_req_ymd){
        this.revw_req_ymd = revw_req_ymd;
    }
  
    @ElVoField(physicalName = "revw_req_rmk")
    public String getRevw_req_rmk(){
        return revw_req_rmk;
    }
  
    @ElVoField(physicalName = "revw_req_rmk")
    public void setRevw_req_rmk(String revw_req_rmk){
        this.revw_req_rmk = revw_req_rmk;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_req_ymd")
    public String getRe_wrte_indic_req_ymd(){
        return re_wrte_indic_req_ymd;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_req_ymd")
    public void setRe_wrte_indic_req_ymd(String re_wrte_indic_req_ymd){
        this.re_wrte_indic_req_ymd = re_wrte_indic_req_ymd;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_req_rmk")
    public String getRe_wrte_indic_req_rmk(){
        return re_wrte_indic_req_rmk;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_req_rmk")
    public void setRe_wrte_indic_req_rmk(String re_wrte_indic_req_rmk){
        this.re_wrte_indic_req_rmk = re_wrte_indic_req_rmk;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_ymd")
    public String getRe_wrte_indic_ymd(){
        return re_wrte_indic_ymd;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_ymd")
    public void setRe_wrte_indic_ymd(String re_wrte_indic_ymd){
        this.re_wrte_indic_ymd = re_wrte_indic_ymd;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_rmk")
    public String getRe_wrte_indic_rmk(){
        return re_wrte_indic_rmk;
    }
  
    @ElVoField(physicalName = "re_wrte_indic_rmk")
    public void setRe_wrte_indic_rmk(String re_wrte_indic_rmk){
        this.re_wrte_indic_rmk = re_wrte_indic_rmk;
    }
  
    @ElVoField(physicalName = "revw_complt_affir_ymd")
    public String getRevw_complt_affir_ymd(){
        return revw_complt_affir_ymd;
    }
  
    @ElVoField(physicalName = "revw_complt_affir_ymd")
    public void setRevw_complt_affir_ymd(String revw_complt_affir_ymd){
        this.revw_complt_affir_ymd = revw_complt_affir_ymd;
    }
  
    @ElVoField(physicalName = "revw_complt_affir_rmk")
    public String getRevw_complt_affir_rmk(){
        return revw_complt_affir_rmk;
    }
  
    @ElVoField(physicalName = "revw_complt_affir_rmk")
    public void setRevw_complt_affir_rmk(String revw_complt_affir_rmk){
        this.revw_complt_affir_rmk = revw_complt_affir_rmk;
    }
  
    @ElVoField(physicalName = "rcpt_complt_affir_ymd")
    public String getRcpt_complt_affir_ymd(){
        return rcpt_complt_affir_ymd;
    }
  
    @ElVoField(physicalName = "rcpt_complt_affir_ymd")
    public void setRcpt_complt_affir_ymd(String rcpt_complt_affir_ymd){
        this.rcpt_complt_affir_ymd = rcpt_complt_affir_ymd;
    }
  
    @ElVoField(physicalName = "rcpt_complt_affir_rmk")
    public String getRcpt_complt_affir_rmk(){
        return rcpt_complt_affir_rmk;
    }
  
    @ElVoField(physicalName = "rcpt_complt_affir_rmk")
    public void setRcpt_complt_affir_rmk(String rcpt_complt_affir_rmk){
        this.rcpt_complt_affir_rmk = rcpt_complt_affir_rmk;
    }
  
    @ElVoField(physicalName = "eval_send_ex")
    public String getEval_send_ex(){
        return eval_send_ex;
    }
  
    @ElVoField(physicalName = "eval_send_ex")
    public void setEval_send_ex(String eval_send_ex){
        this.eval_send_ex = eval_send_ex;
    }
  
    @ElVoField(physicalName = "eval_apply_anal")
    public String getEval_apply_anal(){
        return eval_apply_anal;
    }
  
    @ElVoField(physicalName = "eval_apply_anal")
    public void setEval_apply_anal(String eval_apply_anal){
        this.eval_apply_anal = eval_apply_anal;
    }
  
    @ElVoField(physicalName = "tax_bill")
    public String getTax_bill(){
        return tax_bill;
    }
  
    @ElVoField(physicalName = "tax_bill")
    public void setTax_bill(String tax_bill){
        this.tax_bill = tax_bill;
    }
  
    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }
  
    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }
  
    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
  
    @ElVoField(physicalName = "regst_decsn_amt")
    public String getRegst_decsn_amt(){
        return regst_decsn_amt;
    }
  
    @ElVoField(physicalName = "regst_decsn_amt")
    public void setRegst_decsn_amt(String regst_decsn_amt){
        this.regst_decsn_amt = regst_decsn_amt;
    }
  
    @ElVoField(physicalName = "regst_decsn_amt_ymd")
    public String getRegst_decsn_amt_ymd(){
        return regst_decsn_amt_ymd;
    }
  
    @ElVoField(physicalName = "regst_decsn_amt_ymd")
    public void setRegst_decsn_amt_ymd(String regst_decsn_amt_ymd){
        this.regst_decsn_amt_ymd = regst_decsn_amt_ymd;
    }
  
    @ElVoField(physicalName = "exam_reflect_clsf")
    public String getExam_reflect_clsf(){
        return exam_reflect_clsf;
    }
  
    @ElVoField(physicalName = "exam_reflect_clsf")
    public void setExam_reflect_clsf(String exam_reflect_clsf){
        this.exam_reflect_clsf = exam_reflect_clsf;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }
  
    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }
  
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
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("PatRegstUpdateVo [");
      sb.append("regst_decsn_ymd").append("=").append(regst_decsn_ymd).append(",");
      sb.append("exc_pat_yn").append("=").append(exc_pat_yn).append(",");
      sb.append("eval_grd").append("=").append(eval_grd).append(",");
      sb.append("eval_ymd").append("=").append(eval_ymd).append(",");
      sb.append("attach_file_no2").append("=").append(attach_file_no2).append(",");
      sb.append("pay_close_ymd").append("=").append(pay_close_ymd).append(",");
      sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
      sb.append("rpt_id").append("=").append(rpt_id).append(",");
      sb.append("rpt_reply_req_ymd").append("=").append(rpt_reply_req_ymd).append(",");
      sb.append("rpt_ymd").append("=").append(rpt_ymd).append(",");
      sb.append("rpt_rmk").append("=").append(rpt_rmk).append(",");
      sb.append("rcpt_syspayno").append("=").append(rcpt_syspayno).append(",");
      sb.append("rcpt_revw_req_ymd").append("=").append(rcpt_revw_req_ymd).append(",");
      sb.append("rcpt_revw_req_rmk").append("=").append(rcpt_revw_req_rmk).append(",");
      sb.append("revw_giveup_clsf").append("=").append(revw_giveup_clsf).append(",");
      sb.append("revw_complt_hope_ymd").append("=").append(revw_complt_hope_ymd).append(",");
      sb.append("revw_ymd").append("=").append(revw_ymd).append(",");
      sb.append("revw_rmk").append("=").append(revw_rmk).append(",");
      sb.append("indic_complt_hope_ymd").append("=").append(indic_complt_hope_ymd).append(",");
      sb.append("indic_ymd").append("=").append(indic_ymd).append(",");
      sb.append("indic_rmk").append("=").append(indic_rmk).append(",");
      sb.append("indepen_item").append("=").append(indepen_item).append(",");
      sb.append("subordi_item").append("=").append(subordi_item).append(",");
      sb.append("chart_page").append("=").append(chart_page).append(",");
      sb.append("detls_page").append("=").append(detls_page).append(",");
      sb.append("complt_rpt_id").append("=").append(complt_rpt_id).append(",");
      sb.append("complt_rpt_ymd").append("=").append(complt_rpt_ymd).append(",");
      sb.append("complt_rpt_rmk").append("=").append(complt_rpt_rmk).append(",");
      sb.append("revw_req_ymd").append("=").append(revw_req_ymd).append(",");
      sb.append("revw_req_rmk").append("=").append(revw_req_rmk).append(",");
      sb.append("re_wrte_indic_req_ymd").append("=").append(re_wrte_indic_req_ymd).append(",");
      sb.append("re_wrte_indic_req_rmk").append("=").append(re_wrte_indic_req_rmk).append(",");
      sb.append("re_wrte_indic_ymd").append("=").append(re_wrte_indic_ymd).append(",");
      sb.append("re_wrte_indic_rmk").append("=").append(re_wrte_indic_rmk).append(",");
      sb.append("revw_complt_affir_ymd").append("=").append(revw_complt_affir_ymd).append(",");
      sb.append("revw_complt_affir_rmk").append("=").append(revw_complt_affir_rmk).append(",");
      sb.append("rcpt_complt_affir_ymd").append("=").append(rcpt_complt_affir_ymd).append(",");
      sb.append("rcpt_complt_affir_rmk").append("=").append(rcpt_complt_affir_rmk).append(",");
      sb.append("eval_send_ex").append("=").append(eval_send_ex).append(",");
      sb.append("eval_apply_anal").append("=").append(eval_apply_anal).append(",");
      sb.append("tax_bill").append("=").append(tax_bill).append(",");
      sb.append("unslip_no").append("=").append(unslip_no).append(",");
      sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
      sb.append("regst_decsn_amt").append("=").append(regst_decsn_amt).append(",");
      sb.append("regst_decsn_amt_ymd").append("=").append(regst_decsn_amt_ymd).append(",");
      sb.append("exam_reflect_clsf").append("=").append(exam_reflect_clsf).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
      sb.append("req_no").append("=").append(req_no).append(",");
      sb.append("mngmt_no").append("=").append(mngmt_no);
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