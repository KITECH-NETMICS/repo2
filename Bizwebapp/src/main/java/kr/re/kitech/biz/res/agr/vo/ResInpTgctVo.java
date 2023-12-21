package kr.re.kitech.biz.res.agr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResInpTgctExp")
public class ResInpTgctVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
  private static final long serialVersionUID = 1L;

  public ResInpTgctVo(){
  }

    @ElDtoField(logicalName = "pPrjNo", physicalName = "p_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String p_prj_no;
  
    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;
  
    @ElDtoField(logicalName = "tgctPrjNo", physicalName = "tgct_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tgct_prj_no;
  
    @ElDtoField(logicalName = "middleRptpSubmitSchdlYmd", physicalName = "middle_rptp_submit_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_rptp_submit_schdl_ymd;
  
    @ElDtoField(logicalName = "finalRptpSubmitSchdlYmd", physicalName = "final_rptp_submit_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_rptp_submit_schdl_ymd;
  
    @ElDtoField(logicalName = "devContnt", physicalName = "dev_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_contnt;
  
    @ElDtoField(logicalName = "devGoal", physicalName = "dev_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_goal;
  
    @ElDtoField(logicalName = "devRst", physicalName = "dev_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_rst;
  
    @ElDtoField(logicalName = "pruseTyp", physicalName = "pruse_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_typ;
  
    @ElDtoField(logicalName = "techOutcm", physicalName = "tech_outcm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_outcm;
  
    @ElDtoField(logicalName = "econoOutcm", physicalName = "econo_outcm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String econo_outcm;
  
    @ElDtoField(logicalName = "expecEfctImptTrans", physicalName = "expec_efct_impt_trans", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_impt_trans;
  
    @ElDtoField(logicalName = "expecEfctExpIncr", physicalName = "expec_efct_exp_incr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_exp_incr;
  
    @ElDtoField(logicalName = "expecEfctSalesIncr", physicalName = "expec_efct_sales_incr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_sales_incr;
  
    @ElDtoField(logicalName = "expecEfctProdctProgrs", physicalName = "expec_efct_prodct_progrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_prodct_progrs;
  
    @ElDtoField(logicalName = "expecEfctEmpCrt", physicalName = "expec_efct_emp_crt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_emp_crt;
  
    @ElDtoField(logicalName = "expecEfctEtc", physicalName = "expec_efct_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct_etc;
  
    @ElDtoField(logicalName = "reschContnt", physicalName = "resch_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_contnt;
  
    @ElDtoField(logicalName = "expecEfct", physicalName = "expec_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct;
  
    @ElDtoField(logicalName = "kwdKrchar", physicalName = "kwd_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_krchar;
  
    @ElDtoField(logicalName = "kwdEng", physicalName = "kwd_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_eng;
  
    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;
  
    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;
  
    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;
  
    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;
  
    @ElDtoField(logicalName = "finalAttachFile", physicalName = "final_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_attach_file;
  
    @ElDtoField(logicalName = "mouBookAttachFile", physicalName = "mou_book_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_book_attach_file;
  
    @ElDtoField(logicalName = "bsnsNoticeAttachFileNo", physicalName = "bsns_notice_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_notice_attach_file_no;
  
    @ElDtoField(logicalName = "consWorkAttachFileNo", physicalName = "cons_work_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cons_work_attach_file_no;
  
    @ElVoField(physicalName = "p_prj_no")
    public String getP_prj_no(){
        return p_prj_no;
    }
  
    @ElVoField(physicalName = "p_prj_no")
    public void setP_prj_no(String p_prj_no){
        this.p_prj_no = p_prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }
  
    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }
  
    @ElVoField(physicalName = "tgct_prj_no")
    public String getTgct_prj_no(){
        return tgct_prj_no;
    }
  
    @ElVoField(physicalName = "tgct_prj_no")
    public void setTgct_prj_no(String tgct_prj_no){
        this.tgct_prj_no = tgct_prj_no;
    }
  
    @ElVoField(physicalName = "middle_rptp_submit_schdl_ymd")
    public String getMiddle_rptp_submit_schdl_ymd(){
        return middle_rptp_submit_schdl_ymd;
    }
  
    @ElVoField(physicalName = "middle_rptp_submit_schdl_ymd")
    public void setMiddle_rptp_submit_schdl_ymd(String middle_rptp_submit_schdl_ymd){
        this.middle_rptp_submit_schdl_ymd = middle_rptp_submit_schdl_ymd;
    }
  
    @ElVoField(physicalName = "final_rptp_submit_schdl_ymd")
    public String getFinal_rptp_submit_schdl_ymd(){
        return final_rptp_submit_schdl_ymd;
    }
  
    @ElVoField(physicalName = "final_rptp_submit_schdl_ymd")
    public void setFinal_rptp_submit_schdl_ymd(String final_rptp_submit_schdl_ymd){
        this.final_rptp_submit_schdl_ymd = final_rptp_submit_schdl_ymd;
    }
  
    @ElVoField(physicalName = "dev_contnt")
    public String getDev_contnt(){
        return dev_contnt;
    }
  
    @ElVoField(physicalName = "dev_contnt")
    public void setDev_contnt(String dev_contnt){
        this.dev_contnt = dev_contnt;
    }
  
    @ElVoField(physicalName = "dev_goal")
    public String getDev_goal(){
        return dev_goal;
    }
  
    @ElVoField(physicalName = "dev_goal")
    public void setDev_goal(String dev_goal){
        this.dev_goal = dev_goal;
    }
  
    @ElVoField(physicalName = "dev_rst")
    public String getDev_rst(){
        return dev_rst;
    }
  
    @ElVoField(physicalName = "dev_rst")
    public void setDev_rst(String dev_rst){
        this.dev_rst = dev_rst;
    }
  
    @ElVoField(physicalName = "pruse_typ")
    public String getPruse_typ(){
        return pruse_typ;
    }
  
    @ElVoField(physicalName = "pruse_typ")
    public void setPruse_typ(String pruse_typ){
        this.pruse_typ = pruse_typ;
    }
  
    @ElVoField(physicalName = "tech_outcm")
    public String getTech_outcm(){
        return tech_outcm;
    }
  
    @ElVoField(physicalName = "tech_outcm")
    public void setTech_outcm(String tech_outcm){
        this.tech_outcm = tech_outcm;
    }
  
    @ElVoField(physicalName = "econo_outcm")
    public String getEcono_outcm(){
        return econo_outcm;
    }
  
    @ElVoField(physicalName = "econo_outcm")
    public void setEcono_outcm(String econo_outcm){
        this.econo_outcm = econo_outcm;
    }
  
    @ElVoField(physicalName = "expec_efct_impt_trans")
    public String getExpec_efct_impt_trans(){
        return expec_efct_impt_trans;
    }
  
    @ElVoField(physicalName = "expec_efct_impt_trans")
    public void setExpec_efct_impt_trans(String expec_efct_impt_trans){
        this.expec_efct_impt_trans = expec_efct_impt_trans;
    }
  
    @ElVoField(physicalName = "expec_efct_exp_incr")
    public String getExpec_efct_exp_incr(){
        return expec_efct_exp_incr;
    }
  
    @ElVoField(physicalName = "expec_efct_exp_incr")
    public void setExpec_efct_exp_incr(String expec_efct_exp_incr){
        this.expec_efct_exp_incr = expec_efct_exp_incr;
    }
  
    @ElVoField(physicalName = "expec_efct_sales_incr")
    public String getExpec_efct_sales_incr(){
        return expec_efct_sales_incr;
    }
  
    @ElVoField(physicalName = "expec_efct_sales_incr")
    public void setExpec_efct_sales_incr(String expec_efct_sales_incr){
        this.expec_efct_sales_incr = expec_efct_sales_incr;
    }
  
    @ElVoField(physicalName = "expec_efct_prodct_progrs")
    public String getExpec_efct_prodct_progrs(){
        return expec_efct_prodct_progrs;
    }
  
    @ElVoField(physicalName = "expec_efct_prodct_progrs")
    public void setExpec_efct_prodct_progrs(String expec_efct_prodct_progrs){
        this.expec_efct_prodct_progrs = expec_efct_prodct_progrs;
    }
  
    @ElVoField(physicalName = "expec_efct_emp_crt")
    public String getExpec_efct_emp_crt(){
        return expec_efct_emp_crt;
    }
  
    @ElVoField(physicalName = "expec_efct_emp_crt")
    public void setExpec_efct_emp_crt(String expec_efct_emp_crt){
        this.expec_efct_emp_crt = expec_efct_emp_crt;
    }
  
    @ElVoField(physicalName = "expec_efct_etc")
    public String getExpec_efct_etc(){
        return expec_efct_etc;
    }
  
    @ElVoField(physicalName = "expec_efct_etc")
    public void setExpec_efct_etc(String expec_efct_etc){
        this.expec_efct_etc = expec_efct_etc;
    }
  
    @ElVoField(physicalName = "resch_contnt")
    public String getResch_contnt(){
        return resch_contnt;
    }
  
    @ElVoField(physicalName = "resch_contnt")
    public void setResch_contnt(String resch_contnt){
        this.resch_contnt = resch_contnt;
    }
  
    @ElVoField(physicalName = "expec_efct")
    public String getExpec_efct(){
        return expec_efct;
    }
  
    @ElVoField(physicalName = "expec_efct")
    public void setExpec_efct(String expec_efct){
        this.expec_efct = expec_efct;
    }
  
    @ElVoField(physicalName = "kwd_krchar")
    public String getKwd_krchar(){
        return kwd_krchar;
    }
  
    @ElVoField(physicalName = "kwd_krchar")
    public void setKwd_krchar(String kwd_krchar){
        this.kwd_krchar = kwd_krchar;
    }
  
    @ElVoField(physicalName = "kwd_eng")
    public String getKwd_eng(){
        return kwd_eng;
    }
  
    @ElVoField(physicalName = "kwd_eng")
    public void setKwd_eng(String kwd_eng){
        this.kwd_eng = kwd_eng;
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
  
    @ElVoField(physicalName = "final_attach_file")
    public String getFinal_attach_file(){
        return final_attach_file;
    }
  
    @ElVoField(physicalName = "final_attach_file")
    public void setFinal_attach_file(String final_attach_file){
        this.final_attach_file = final_attach_file;
    }
  
    @ElVoField(physicalName = "mou_book_attach_file")
    public String getMou_book_attach_file(){
        return mou_book_attach_file;
    }
  
    @ElVoField(physicalName = "mou_book_attach_file")
    public void setMou_book_attach_file(String mou_book_attach_file){
        this.mou_book_attach_file = mou_book_attach_file;
    }
  
    @ElVoField(physicalName = "bsns_notice_attach_file_no")
    public String getBsns_notice_attach_file_no(){
        return bsns_notice_attach_file_no;
    }
  
    @ElVoField(physicalName = "bsns_notice_attach_file_no")
    public void setBsns_notice_attach_file_no(String bsns_notice_attach_file_no){
        this.bsns_notice_attach_file_no = bsns_notice_attach_file_no;
    }
  
    @ElVoField(physicalName = "cons_work_attach_file_no")
    public String getCons_work_attach_file_no(){
        return cons_work_attach_file_no;
    }
  
    @ElVoField(physicalName = "cons_work_attach_file_no")
    public void setCons_work_attach_file_no(String cons_work_attach_file_no){
        this.cons_work_attach_file_no = cons_work_attach_file_no;
    }
  
  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("ResInpTgctVo [");
      sb.append("p_prj_no").append("=").append(p_prj_no).append(",");
      sb.append("prj_no").append("=").append(prj_no).append(",");
      sb.append("tgct_prj_no").append("=").append(tgct_prj_no).append(",");
      sb.append("middle_rptp_submit_schdl_ymd").append("=").append(middle_rptp_submit_schdl_ymd).append(",");
      sb.append("final_rptp_submit_schdl_ymd").append("=").append(final_rptp_submit_schdl_ymd).append(",");
      sb.append("dev_contnt").append("=").append(dev_contnt).append(",");
      sb.append("dev_goal").append("=").append(dev_goal).append(",");
      sb.append("dev_rst").append("=").append(dev_rst).append(",");
      sb.append("pruse_typ").append("=").append(pruse_typ).append(",");
      sb.append("tech_outcm").append("=").append(tech_outcm).append(",");
      sb.append("econo_outcm").append("=").append(econo_outcm).append(",");
      sb.append("expec_efct_impt_trans").append("=").append(expec_efct_impt_trans).append(",");
      sb.append("expec_efct_exp_incr").append("=").append(expec_efct_exp_incr).append(",");
      sb.append("expec_efct_sales_incr").append("=").append(expec_efct_sales_incr).append(",");
      sb.append("expec_efct_prodct_progrs").append("=").append(expec_efct_prodct_progrs).append(",");
      sb.append("expec_efct_emp_crt").append("=").append(expec_efct_emp_crt).append(",");
      sb.append("expec_efct_etc").append("=").append(expec_efct_etc).append(",");
      sb.append("resch_contnt").append("=").append(resch_contnt).append(",");
      sb.append("expec_efct").append("=").append(expec_efct).append(",");
      sb.append("kwd_krchar").append("=").append(kwd_krchar).append(",");
      sb.append("kwd_eng").append("=").append(kwd_eng).append(",");
      sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
      sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
      sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
      sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
      sb.append("final_attach_file").append("=").append(final_attach_file).append(",");
      sb.append("mou_book_attach_file").append("=").append(mou_book_attach_file).append(",");
      sb.append("bsns_notice_attach_file_no").append("=").append(bsns_notice_attach_file_no).append(",");
      sb.append("cons_work_attach_file_no").append("=").append(cons_work_attach_file_no);
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