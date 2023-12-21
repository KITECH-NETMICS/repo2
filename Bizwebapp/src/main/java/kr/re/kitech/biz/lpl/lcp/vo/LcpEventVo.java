package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpEventExp")
public class LcpEventVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpEventVo(){
    }

    @ElDtoField(logicalName = "slip_ymd1", physicalName = "slip_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd1;

    @ElDtoField(logicalName = "slip_ymd2", physicalName = "slip_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd2;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "event_no", physicalName = "event_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_no;

    @ElDtoField(logicalName = "slip_ymd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "rmk_2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "rmk_1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "unslip_amt", physicalName = "unslip_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_amt;

    @ElDtoField(logicalName = "slip_no", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "natn_cd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "agncy_cd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "reprs_psn_nm", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "krchar_agncy_nm", physicalName = "krchar_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_agncy_nm;

    @ElDtoField(logicalName = "natn_nm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "cmpy_nm_krchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "cmpy_nm_eng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "event_start_ymd1", physicalName = "event_start_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_start_ymd1;

    @ElDtoField(logicalName = "event_start_ymd2", physicalName = "event_start_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_start_ymd2;

    @ElDtoField(logicalName = "event_nm", physicalName = "event_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_nm;

    @ElDtoField(logicalName = "charg", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "charg_syspayno", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "event_supvis", physicalName = "event_supvis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_supvis;

    @ElDtoField(logicalName = "event_open", physicalName = "event_open", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_open;

    @ElDtoField(logicalName = "event_start_ymd", physicalName = "event_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_start_ymd;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "event_cls_ymd", physicalName = "event_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_cls_ymd;

    @ElDtoField(logicalName = "event_plc", physicalName = "event_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_plc;

    @ElDtoField(logicalName = "event_contnt", physicalName = "event_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_contnt;

    @ElDtoField(logicalName = "cr", physicalName = "cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr;

    @ElDtoField(logicalName = "charg_empno", physicalName = "charg_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_empno;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "ymd", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "decsn_slip_no", physicalName = "decsn_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_slip_no;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "vend_nm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "debit", physicalName = "debit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String debit;

    @ElDtoField(logicalName = "ramt", physicalName = "ramt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt;

    @ElDtoField(logicalName = "accnt_cd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "flag", physicalName = "flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String flag;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "exp_row_flag", physicalName = "exp_row_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exp_row_flag;

    @ElDtoField(logicalName = "exp_del_row_odr", physicalName = "exp_del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exp_del_row_odr;

    @ElDtoField(logicalName = "exp_del_odr", physicalName = "exp_del_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exp_del_odr;

    @ElDtoField(logicalName = "agy_row_flag", physicalName = "agy_row_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_row_flag;

    @ElDtoField(logicalName = "agy_del_row_odr", physicalName = "agy_del_row_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_del_row_odr;

    @ElDtoField(logicalName = "agy_del_odr", physicalName = "agy_del_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agy_del_odr;

    @ElVoField(physicalName = "slip_ymd1")
    public String getSlip_ymd1(){
        return slip_ymd1;
    }

    @ElVoField(physicalName = "slip_ymd1")
    public void setSlip_ymd1(String slip_ymd1){
        this.slip_ymd1 = slip_ymd1;
    }

    @ElVoField(physicalName = "slip_ymd2")
    public String getSlip_ymd2(){
        return slip_ymd2;
    }

    @ElVoField(physicalName = "slip_ymd2")
    public void setSlip_ymd2(String slip_ymd2){
        this.slip_ymd2 = slip_ymd2;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
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

    @ElVoField(physicalName = "event_no")
    public String getEvent_no(){
        return event_no;
    }

    @ElVoField(physicalName = "event_no")
    public void setEvent_no(String event_no){
        this.event_no = event_no;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "unslip_amt")
    public String getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(String unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public String getKrchar_agncy_nm(){
        return krchar_agncy_nm;
    }

    @ElVoField(physicalName = "krchar_agncy_nm")
    public void setKrchar_agncy_nm(String krchar_agncy_nm){
        this.krchar_agncy_nm = krchar_agncy_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "event_start_ymd1")
    public String getEvent_start_ymd1(){
        return event_start_ymd1;
    }

    @ElVoField(physicalName = "event_start_ymd1")
    public void setEvent_start_ymd1(String event_start_ymd1){
        this.event_start_ymd1 = event_start_ymd1;
    }

    @ElVoField(physicalName = "event_start_ymd2")
    public String getEvent_start_ymd2(){
        return event_start_ymd2;
    }

    @ElVoField(physicalName = "event_start_ymd2")
    public void setEvent_start_ymd2(String event_start_ymd2){
        this.event_start_ymd2 = event_start_ymd2;
    }

    @ElVoField(physicalName = "event_nm")
    public String getEvent_nm(){
        return event_nm;
    }

    @ElVoField(physicalName = "event_nm")
    public void setEvent_nm(String event_nm){
        this.event_nm = event_nm;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "event_supvis")
    public String getEvent_supvis(){
        return event_supvis;
    }

    @ElVoField(physicalName = "event_supvis")
    public void setEvent_supvis(String event_supvis){
        this.event_supvis = event_supvis;
    }

    @ElVoField(physicalName = "event_open")
    public String getEvent_open(){
        return event_open;
    }

    @ElVoField(physicalName = "event_open")
    public void setEvent_open(String event_open){
        this.event_open = event_open;
    }

    @ElVoField(physicalName = "event_start_ymd")
    public String getEvent_start_ymd(){
        return event_start_ymd;
    }

    @ElVoField(physicalName = "event_start_ymd")
    public void setEvent_start_ymd(String event_start_ymd){
        this.event_start_ymd = event_start_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "event_cls_ymd")
    public String getEvent_cls_ymd(){
        return event_cls_ymd;
    }

    @ElVoField(physicalName = "event_cls_ymd")
    public void setEvent_cls_ymd(String event_cls_ymd){
        this.event_cls_ymd = event_cls_ymd;
    }

    @ElVoField(physicalName = "event_plc")
    public String getEvent_plc(){
        return event_plc;
    }

    @ElVoField(physicalName = "event_plc")
    public void setEvent_plc(String event_plc){
        this.event_plc = event_plc;
    }

    @ElVoField(physicalName = "event_contnt")
    public String getEvent_contnt(){
        return event_contnt;
    }

    @ElVoField(physicalName = "event_contnt")
    public void setEvent_contnt(String event_contnt){
        this.event_contnt = event_contnt;
    }

    @ElVoField(physicalName = "cr")
    public String getCr(){
        return cr;
    }

    @ElVoField(physicalName = "cr")
    public void setCr(String cr){
        this.cr = cr;
    }

    @ElVoField(physicalName = "charg_empno")
    public String getCharg_empno(){
        return charg_empno;
    }

    @ElVoField(physicalName = "charg_empno")
    public void setCharg_empno(String charg_empno){
        this.charg_empno = charg_empno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "decsn_slip_no")
    public String getDecsn_slip_no(){
        return decsn_slip_no;
    }

    @ElVoField(physicalName = "decsn_slip_no")
    public void setDecsn_slip_no(String decsn_slip_no){
        this.decsn_slip_no = decsn_slip_no;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "debit")
    public String getDebit(){
        return debit;
    }

    @ElVoField(physicalName = "debit")
    public void setDebit(String debit){
        this.debit = debit;
    }

    @ElVoField(physicalName = "ramt")
    public String getRamt(){
        return ramt;
    }

    @ElVoField(physicalName = "ramt")
    public void setRamt(String ramt){
        this.ramt = ramt;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "flag")
    public String getFlag(){
        return flag;
    }

    @ElVoField(physicalName = "flag")
    public void setFlag(String flag){
        this.flag = flag;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "exp_row_flag")
    public String getExp_row_flag(){
        return exp_row_flag;
    }

    @ElVoField(physicalName = "exp_row_flag")
    public void setExp_row_flag(String exp_row_flag){
        this.exp_row_flag = exp_row_flag;
    }

    @ElVoField(physicalName = "exp_del_row_odr")
    public String getExp_del_row_odr(){
        return exp_del_row_odr;
    }

    @ElVoField(physicalName = "exp_del_row_odr")
    public void setExp_del_row_odr(String exp_del_row_odr){
        this.exp_del_row_odr = exp_del_row_odr;
    }

    @ElVoField(physicalName = "exp_del_odr")
    public String getExp_del_odr(){
        return exp_del_odr;
    }

    @ElVoField(physicalName = "exp_del_odr")
    public void setExp_del_odr(String exp_del_odr){
        this.exp_del_odr = exp_del_odr;
    }

    @ElVoField(physicalName = "agy_row_flag")
    public String getAgy_row_flag(){
        return agy_row_flag;
    }

    @ElVoField(physicalName = "agy_row_flag")
    public void setAgy_row_flag(String agy_row_flag){
        this.agy_row_flag = agy_row_flag;
    }

    @ElVoField(physicalName = "agy_del_row_odr")
    public String getAgy_del_row_odr(){
        return agy_del_row_odr;
    }

    @ElVoField(physicalName = "agy_del_row_odr")
    public void setAgy_del_row_odr(String agy_del_row_odr){
        this.agy_del_row_odr = agy_del_row_odr;
    }

    @ElVoField(physicalName = "agy_del_odr")
    public String getAgy_del_odr(){
        return agy_del_odr;
    }

    @ElVoField(physicalName = "agy_del_odr")
    public void setAgy_del_odr(String agy_del_odr){
        this.agy_del_odr = agy_del_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpEventVo [");
        sb.append("slip_ymd1").append("=").append(slip_ymd1).append(",");
        sb.append("slip_ymd2").append("=").append(slip_ymd2).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("event_no").append("=").append(event_no).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("krchar_agncy_nm").append("=").append(krchar_agncy_nm).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("event_start_ymd1").append("=").append(event_start_ymd1).append(",");
        sb.append("event_start_ymd2").append("=").append(event_start_ymd2).append(",");
        sb.append("event_nm").append("=").append(event_nm).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("event_supvis").append("=").append(event_supvis).append(",");
        sb.append("event_open").append("=").append(event_open).append(",");
        sb.append("event_start_ymd").append("=").append(event_start_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("event_cls_ymd").append("=").append(event_cls_ymd).append(",");
        sb.append("event_plc").append("=").append(event_plc).append(",");
        sb.append("event_contnt").append("=").append(event_contnt).append(",");
        sb.append("cr").append("=").append(cr).append(",");
        sb.append("charg_empno").append("=").append(charg_empno).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("decsn_slip_no").append("=").append(decsn_slip_no).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("debit").append("=").append(debit).append(",");
        sb.append("ramt").append("=").append(ramt).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("flag").append("=").append(flag).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("exp_row_flag").append("=").append(exp_row_flag).append(",");
        sb.append("exp_del_row_odr").append("=").append(exp_del_row_odr).append(",");
        sb.append("exp_del_odr").append("=").append(exp_del_odr).append(",");
        sb.append("agy_row_flag").append("=").append(agy_row_flag).append(",");
        sb.append("agy_del_row_odr").append("=").append(agy_del_row_odr).append(",");
        sb.append("agy_del_odr").append("=").append(agy_del_odr);
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
