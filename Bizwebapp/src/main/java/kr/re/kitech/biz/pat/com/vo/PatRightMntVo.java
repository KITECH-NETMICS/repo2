package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatRightMntExp")
public class PatRightMntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatRightMntVo(){
    }

    @ElDtoField(logicalName = "rightmntDiv", physicalName = "rightmnt_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rightmnt_div;

    @ElDtoField(logicalName = "rightReqNo", physicalName = "right_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_req_no;

    @ElDtoField(logicalName = "rightmntDivSyspayno", physicalName = "rightmnt_div_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rightmnt_div_syspayno;

    @ElDtoField(logicalName = "patoficCd", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "patoficNm", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "nedguidpsnId", physicalName = "nedguidpsn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nedguidpsn_id;

    @ElDtoField(logicalName = "nedguidpsnNm", physicalName = "nedguidpsn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nedguidpsn_nm;

    @ElDtoField(logicalName = "nedguidpsnReplyReqYmd", physicalName = "nedguidpsn_reply_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nedguidpsn_reply_req_ymd;

    @ElDtoField(logicalName = "needGuideYmd", physicalName = "need_guide_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String need_guide_ymd;

    @ElDtoField(logicalName = "needGuideRmk", physicalName = "need_guide_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String need_guide_rmk;

    @ElDtoField(logicalName = "rcptSyspayno", physicalName = "rcpt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspayno;

    @ElDtoField(logicalName = "rcptSyspaynm", physicalName = "rcpt_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspaynm;

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

    @ElDtoField(logicalName = "thsyearEvyearfeePayYmd", physicalName = "thsyear_evyearfee_pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thsyear_evyearfee_pay_ymd;

    @ElDtoField(logicalName = "governpayFee", physicalName = "governpay_fee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String governpay_fee;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "thsyearEvyearfeePayCloseYmd", physicalName = "thsyear_evyearfee_pay_close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thsyear_evyearfee_pay_close_ymd;

    @ElDtoField(logicalName = "nexyearEvyearfeePayCloseYmd", physicalName = "nexyear_evyearfee_pay_close_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nexyear_evyearfee_pay_close_ymd;

    @ElDtoField(logicalName = "rightExpirYmd", physicalName = "right_expir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String right_expir_ymd;

    @ElDtoField(logicalName = "compltRptId", physicalName = "complt_rpt_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_id;

    @ElDtoField(logicalName = "compltRptNm", physicalName = "complt_rpt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_nm;

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

    @ElDtoField(logicalName = "taxBillNo", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "unusualItem", physicalName = "unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unusual_item;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "mntSeq", physicalName = "mnt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mnt_seq;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "giveup_req_no", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "seq_no", physicalName = "seq_no", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq_no;

    @ElVoField(physicalName = "rightmnt_div")
    public String getRightmnt_div(){
        return rightmnt_div;
    }

    @ElVoField(physicalName = "rightmnt_div")
    public void setRightmnt_div(String rightmnt_div){
        this.rightmnt_div = rightmnt_div;
    }

    @ElVoField(physicalName = "right_req_no")
    public String getRight_req_no(){
        return right_req_no;
    }

    @ElVoField(physicalName = "right_req_no")
    public void setRight_req_no(String right_req_no){
        this.right_req_no = right_req_no;
    }

    @ElVoField(physicalName = "rightmnt_div_syspayno")
    public String getRightmnt_div_syspayno(){
        return rightmnt_div_syspayno;
    }

    @ElVoField(physicalName = "rightmnt_div_syspayno")
    public void setRightmnt_div_syspayno(String rightmnt_div_syspayno){
        this.rightmnt_div_syspayno = rightmnt_div_syspayno;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "nedguidpsn_id")
    public String getNedguidpsn_id(){
        return nedguidpsn_id;
    }

    @ElVoField(physicalName = "nedguidpsn_id")
    public void setNedguidpsn_id(String nedguidpsn_id){
        this.nedguidpsn_id = nedguidpsn_id;
    }

    @ElVoField(physicalName = "nedguidpsn_nm")
    public String getNedguidpsn_nm(){
        return nedguidpsn_nm;
    }

    @ElVoField(physicalName = "nedguidpsn_nm")
    public void setNedguidpsn_nm(String nedguidpsn_nm){
        this.nedguidpsn_nm = nedguidpsn_nm;
    }

    @ElVoField(physicalName = "nedguidpsn_reply_req_ymd")
    public String getNedguidpsn_reply_req_ymd(){
        return nedguidpsn_reply_req_ymd;
    }

    @ElVoField(physicalName = "nedguidpsn_reply_req_ymd")
    public void setNedguidpsn_reply_req_ymd(String nedguidpsn_reply_req_ymd){
        this.nedguidpsn_reply_req_ymd = nedguidpsn_reply_req_ymd;
    }

    @ElVoField(physicalName = "need_guide_ymd")
    public String getNeed_guide_ymd(){
        return need_guide_ymd;
    }

    @ElVoField(physicalName = "need_guide_ymd")
    public void setNeed_guide_ymd(String need_guide_ymd){
        this.need_guide_ymd = need_guide_ymd;
    }

    @ElVoField(physicalName = "need_guide_rmk")
    public String getNeed_guide_rmk(){
        return need_guide_rmk;
    }

    @ElVoField(physicalName = "need_guide_rmk")
    public void setNeed_guide_rmk(String need_guide_rmk){
        this.need_guide_rmk = need_guide_rmk;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public String getRcpt_syspayno(){
        return rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public void setRcpt_syspayno(String rcpt_syspayno){
        this.rcpt_syspayno = rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspaynm")
    public String getRcpt_syspaynm(){
        return rcpt_syspaynm;
    }

    @ElVoField(physicalName = "rcpt_syspaynm")
    public void setRcpt_syspaynm(String rcpt_syspaynm){
        this.rcpt_syspaynm = rcpt_syspaynm;
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

    @ElVoField(physicalName = "thsyear_evyearfee_pay_ymd")
    public String getThsyear_evyearfee_pay_ymd(){
        return thsyear_evyearfee_pay_ymd;
    }

    @ElVoField(physicalName = "thsyear_evyearfee_pay_ymd")
    public void setThsyear_evyearfee_pay_ymd(String thsyear_evyearfee_pay_ymd){
        this.thsyear_evyearfee_pay_ymd = thsyear_evyearfee_pay_ymd;
    }

    @ElVoField(physicalName = "governpay_fee")
    public String getGovernpay_fee(){
        return governpay_fee;
    }

    @ElVoField(physicalName = "governpay_fee")
    public void setGovernpay_fee(String governpay_fee){
        this.governpay_fee = governpay_fee;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public String getThsyear_evyearfee_pay_close_ymd(){
        return thsyear_evyearfee_pay_close_ymd;
    }

    @ElVoField(physicalName = "thsyear_evyearfee_pay_close_ymd")
    public void setThsyear_evyearfee_pay_close_ymd(String thsyear_evyearfee_pay_close_ymd){
        this.thsyear_evyearfee_pay_close_ymd = thsyear_evyearfee_pay_close_ymd;
    }

    @ElVoField(physicalName = "nexyear_evyearfee_pay_close_ymd")
    public String getNexyear_evyearfee_pay_close_ymd(){
        return nexyear_evyearfee_pay_close_ymd;
    }

    @ElVoField(physicalName = "nexyear_evyearfee_pay_close_ymd")
    public void setNexyear_evyearfee_pay_close_ymd(String nexyear_evyearfee_pay_close_ymd){
        this.nexyear_evyearfee_pay_close_ymd = nexyear_evyearfee_pay_close_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public String getRight_expir_ymd(){
        return right_expir_ymd;
    }

    @ElVoField(physicalName = "right_expir_ymd")
    public void setRight_expir_ymd(String right_expir_ymd){
        this.right_expir_ymd = right_expir_ymd;
    }

    @ElVoField(physicalName = "complt_rpt_id")
    public String getComplt_rpt_id(){
        return complt_rpt_id;
    }

    @ElVoField(physicalName = "complt_rpt_id")
    public void setComplt_rpt_id(String complt_rpt_id){
        this.complt_rpt_id = complt_rpt_id;
    }

    @ElVoField(physicalName = "complt_rpt_nm")
    public String getComplt_rpt_nm(){
        return complt_rpt_nm;
    }

    @ElVoField(physicalName = "complt_rpt_nm")
    public void setComplt_rpt_nm(String complt_rpt_nm){
        this.complt_rpt_nm = complt_rpt_nm;
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

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unusual_item")
    public String getUnusual_item(){
        return unusual_item;
    }

    @ElVoField(physicalName = "unusual_item")
    public void setUnusual_item(String unusual_item){
        this.unusual_item = unusual_item;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "mnt_seq")
    public String getMnt_seq(){
        return mnt_seq;
    }

    @ElVoField(physicalName = "mnt_seq")
    public void setMnt_seq(String mnt_seq){
        this.mnt_seq = mnt_seq;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "seq_no")
    public int getSeq_no(){
        return seq_no;
    }

    @ElVoField(physicalName = "seq_no")
    public void setSeq_no(int seq_no){
        this.seq_no = seq_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatRightMntVo [");
        sb.append("rightmnt_div").append("=").append(rightmnt_div).append(",");
        sb.append("right_req_no").append("=").append(right_req_no).append(",");
        sb.append("rightmnt_div_syspayno").append("=").append(rightmnt_div_syspayno).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("nedguidpsn_id").append("=").append(nedguidpsn_id).append(",");
        sb.append("nedguidpsn_nm").append("=").append(nedguidpsn_nm).append(",");
        sb.append("nedguidpsn_reply_req_ymd").append("=").append(nedguidpsn_reply_req_ymd).append(",");
        sb.append("need_guide_ymd").append("=").append(need_guide_ymd).append(",");
        sb.append("need_guide_rmk").append("=").append(need_guide_rmk).append(",");
        sb.append("rcpt_syspayno").append("=").append(rcpt_syspayno).append(",");
        sb.append("rcpt_syspaynm").append("=").append(rcpt_syspaynm).append(",");
        sb.append("rcpt_revw_req_ymd").append("=").append(rcpt_revw_req_ymd).append(",");
        sb.append("rcpt_revw_req_rmk").append("=").append(rcpt_revw_req_rmk).append(",");
        sb.append("revw_giveup_clsf").append("=").append(revw_giveup_clsf).append(",");
        sb.append("revw_complt_hope_ymd").append("=").append(revw_complt_hope_ymd).append(",");
        sb.append("revw_ymd").append("=").append(revw_ymd).append(",");
        sb.append("revw_rmk").append("=").append(revw_rmk).append(",");
        sb.append("indic_complt_hope_ymd").append("=").append(indic_complt_hope_ymd).append(",");
        sb.append("indic_ymd").append("=").append(indic_ymd).append(",");
        sb.append("indic_rmk").append("=").append(indic_rmk).append(",");
        sb.append("thsyear_evyearfee_pay_ymd").append("=").append(thsyear_evyearfee_pay_ymd).append(",");
        sb.append("governpay_fee").append("=").append(governpay_fee).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("thsyear_evyearfee_pay_close_ymd").append("=").append(thsyear_evyearfee_pay_close_ymd).append(",");
        sb.append("nexyear_evyearfee_pay_close_ymd").append("=").append(nexyear_evyearfee_pay_close_ymd).append(",");
        sb.append("right_expir_ymd").append("=").append(right_expir_ymd).append(",");
        sb.append("complt_rpt_id").append("=").append(complt_rpt_id).append(",");
        sb.append("complt_rpt_nm").append("=").append(complt_rpt_nm).append(",");
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
        sb.append("tax_bill_no").append("=").append(tax_bill_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unusual_item").append("=").append(unusual_item).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("mnt_seq").append("=").append(mnt_seq).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("seq_no").append("=").append(seq_no);
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
