package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApyArCostVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyArCostVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "일련번호", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "지급차수", physicalName = "req_degre", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_degre;

    @ElDtoField(logicalName = "비용신청번호", physicalName = "expns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_req_no;

    @ElDtoField(logicalName = "비용신청순번", physicalName = "expns_req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int expns_req_seq;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "활용(실제)시작일", physicalName = "use_st_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_st_ymd;

    @ElDtoField(logicalName = "활용(실제)종료일", physicalName = "use_ed_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ed_ymd;

    @ElDtoField(logicalName = "활용월", physicalName = "pay_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_yrmon;

    @ElDtoField(logicalName = "month_tran_time", physicalName = "month_tran_time", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int month_tran_time;

    @ElDtoField(logicalName = "작업일수", physicalName = "job_days", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double job_days;

    @ElDtoField(logicalName = "활용월1일출석여부", physicalName = "job_day_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_1;

    @ElDtoField(logicalName = "활용월2일출석여부", physicalName = "job_day_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_2;

    @ElDtoField(logicalName = "활용월3일출석여부", physicalName = "job_day_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_3;

    @ElDtoField(logicalName = "활용월4일출석여부", physicalName = "job_day_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_4;

    @ElDtoField(logicalName = "활용월5일출석여부", physicalName = "job_day_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_5;

    @ElDtoField(logicalName = "활용월6일출석여부", physicalName = "job_day_6", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_6;

    @ElDtoField(logicalName = "활용월7일출석여부", physicalName = "job_day_7", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_7;

    @ElDtoField(logicalName = "활용월8일출석여부", physicalName = "job_day_8", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_8;

    @ElDtoField(logicalName = "활용월9일출석여부", physicalName = "job_day_9", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_9;

    @ElDtoField(logicalName = "활용월10일출석여부", physicalName = "job_day_10", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_10;

    @ElDtoField(logicalName = "활용월11일출석여부", physicalName = "job_day_11", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_11;

    @ElDtoField(logicalName = "활용월12일출석여부", physicalName = "job_day_12", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_12;

    @ElDtoField(logicalName = "활용월13일출석여부", physicalName = "job_day_13", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_13;

    @ElDtoField(logicalName = "활용월14일출석여부", physicalName = "job_day_14", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_14;

    @ElDtoField(logicalName = "활용월15일출석여부", physicalName = "job_day_15", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_15;

    @ElDtoField(logicalName = "활용월16일출석여부", physicalName = "job_day_16", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_16;

    @ElDtoField(logicalName = "활용월17일출석여부", physicalName = "job_day_17", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_17;

    @ElDtoField(logicalName = "활용월18일출석여부", physicalName = "job_day_18", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_18;

    @ElDtoField(logicalName = "활용월19일출석여부", physicalName = "job_day_19", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_19;

    @ElDtoField(logicalName = "활용월20일출석여부", physicalName = "job_day_20", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_20;

    @ElDtoField(logicalName = "활용월21일출석여부", physicalName = "job_day_21", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_21;

    @ElDtoField(logicalName = "활용월22일출석여부", physicalName = "job_day_22", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_22;

    @ElDtoField(logicalName = "활용월23일출석여부", physicalName = "job_day_23", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_23;

    @ElDtoField(logicalName = "활용월24일출석여부", physicalName = "job_day_24", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_24;

    @ElDtoField(logicalName = "활용월25일출석여부", physicalName = "job_day_25", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_25;

    @ElDtoField(logicalName = "활용월26일출석여부", physicalName = "job_day_26", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_26;

    @ElDtoField(logicalName = "활용월27일출석여부", physicalName = "job_day_27", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_27;

    @ElDtoField(logicalName = "활용월28일출석여부", physicalName = "job_day_28", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_28;

    @ElDtoField(logicalName = "활용월29일출석여부", physicalName = "job_day_29", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_29;

    @ElDtoField(logicalName = "활용월30일출석여부", physicalName = "job_day_30", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_30;

    @ElDtoField(logicalName = "활용월31일출석여부", physicalName = "job_day_31", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_day_31;

    @ElDtoField(logicalName = "단가", physicalName = "day_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double day_amt;

    @ElDtoField(logicalName = "주휴수당", physicalName = "week_holi_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double week_holi_amt;

    @ElDtoField(logicalName = "금액", physicalName = "expns_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double expns_amt;

    @ElDtoField(logicalName = "tran_rt", physicalName = "tran_rt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double tran_rt;

    @ElDtoField(logicalName = "산재보험예수금", physicalName = "acdt_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double acdt_amt;

    @ElDtoField(logicalName = "임금채권보장보험예수금", physicalName = "bond_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double bond_amt;

    @ElDtoField(logicalName = "석면피해예수금", physicalName = "asbe_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double asbe_amt;

    @ElDtoField(logicalName = "고용보험예수금", physicalName = "tax_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double tax_rate;

    @ElDtoField(logicalName = "고용보험료(개인부담)", physicalName = "emp_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double emp_amt;

    @ElDtoField(logicalName = "소득세율", physicalName = "emp_ins_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double emp_ins_amt;

    @ElDtoField(logicalName = "소득세", physicalName = "tax_amt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double tax_amt;

    @ElDtoField(logicalName = "주민세예수금", physicalName = "resid_tax", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double resid_tax;

    @ElDtoField(logicalName = "은행", physicalName = "bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_cd;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "예금주", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "산재보험료율", physicalName = "acdt_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double acdt_rate;

    @ElDtoField(logicalName = "임금채권보장보험료율", physicalName = "bond_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double bond_rate;

    @ElDtoField(logicalName = "석면피해보험료율", physicalName = "asbe_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double asbe_rate;

    @ElDtoField(logicalName = "고용보험료율(원부담)", physicalName = "emp_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double emp_rate;

    @ElDtoField(logicalName = "고용보험료율(개인부담)", physicalName = "emp_ins_rate", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double emp_ins_rate;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "req_degre")
    public int getReq_degre(){
        return req_degre;
    }

    @ElVoField(physicalName = "req_degre")
    public void setReq_degre(int req_degre){
        this.req_degre = req_degre;
    }

    @ElVoField(physicalName = "expns_req_no")
    public String getExpns_req_no(){
        return expns_req_no;
    }

    @ElVoField(physicalName = "expns_req_no")
    public void setExpns_req_no(String expns_req_no){
        this.expns_req_no = expns_req_no;
    }

    @ElVoField(physicalName = "expns_req_seq")
    public int getExpns_req_seq(){
        return expns_req_seq;
    }

    @ElVoField(physicalName = "expns_req_seq")
    public void setExpns_req_seq(int expns_req_seq){
        this.expns_req_seq = expns_req_seq;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "use_st_ymd")
    public String getUse_st_ymd(){
        return use_st_ymd;
    }

    @ElVoField(physicalName = "use_st_ymd")
    public void setUse_st_ymd(String use_st_ymd){
        this.use_st_ymd = use_st_ymd;
    }

    @ElVoField(physicalName = "use_ed_ymd")
    public String getUse_ed_ymd(){
        return use_ed_ymd;
    }

    @ElVoField(physicalName = "use_ed_ymd")
    public void setUse_ed_ymd(String use_ed_ymd){
        this.use_ed_ymd = use_ed_ymd;
    }

    @ElVoField(physicalName = "pay_yrmon")
    public String getPay_yrmon(){
        return pay_yrmon;
    }

    @ElVoField(physicalName = "pay_yrmon")
    public void setPay_yrmon(String pay_yrmon){
        this.pay_yrmon = pay_yrmon;
    }

    @ElVoField(physicalName = "month_tran_time")
    public int getMonth_tran_time(){
        return month_tran_time;
    }

    @ElVoField(physicalName = "month_tran_time")
    public void setMonth_tran_time(int month_tran_time){
        this.month_tran_time = month_tran_time;
    }

    @ElVoField(physicalName = "job_days")
    public double getJob_days(){
        return job_days;
    }

    @ElVoField(physicalName = "job_days")
    public void setJob_days(double job_days){
        this.job_days = job_days;
    }

    @ElVoField(physicalName = "job_day_1")
    public String getJob_day_1(){
        return job_day_1;
    }

    @ElVoField(physicalName = "job_day_1")
    public void setJob_day_1(String job_day_1){
        this.job_day_1 = job_day_1;
    }

    @ElVoField(physicalName = "job_day_2")
    public String getJob_day_2(){
        return job_day_2;
    }

    @ElVoField(physicalName = "job_day_2")
    public void setJob_day_2(String job_day_2){
        this.job_day_2 = job_day_2;
    }

    @ElVoField(physicalName = "job_day_3")
    public String getJob_day_3(){
        return job_day_3;
    }

    @ElVoField(physicalName = "job_day_3")
    public void setJob_day_3(String job_day_3){
        this.job_day_3 = job_day_3;
    }

    @ElVoField(physicalName = "job_day_4")
    public String getJob_day_4(){
        return job_day_4;
    }

    @ElVoField(physicalName = "job_day_4")
    public void setJob_day_4(String job_day_4){
        this.job_day_4 = job_day_4;
    }

    @ElVoField(physicalName = "job_day_5")
    public String getJob_day_5(){
        return job_day_5;
    }

    @ElVoField(physicalName = "job_day_5")
    public void setJob_day_5(String job_day_5){
        this.job_day_5 = job_day_5;
    }

    @ElVoField(physicalName = "job_day_6")
    public String getJob_day_6(){
        return job_day_6;
    }

    @ElVoField(physicalName = "job_day_6")
    public void setJob_day_6(String job_day_6){
        this.job_day_6 = job_day_6;
    }

    @ElVoField(physicalName = "job_day_7")
    public String getJob_day_7(){
        return job_day_7;
    }

    @ElVoField(physicalName = "job_day_7")
    public void setJob_day_7(String job_day_7){
        this.job_day_7 = job_day_7;
    }

    @ElVoField(physicalName = "job_day_8")
    public String getJob_day_8(){
        return job_day_8;
    }

    @ElVoField(physicalName = "job_day_8")
    public void setJob_day_8(String job_day_8){
        this.job_day_8 = job_day_8;
    }

    @ElVoField(physicalName = "job_day_9")
    public String getJob_day_9(){
        return job_day_9;
    }

    @ElVoField(physicalName = "job_day_9")
    public void setJob_day_9(String job_day_9){
        this.job_day_9 = job_day_9;
    }

    @ElVoField(physicalName = "job_day_10")
    public String getJob_day_10(){
        return job_day_10;
    }

    @ElVoField(physicalName = "job_day_10")
    public void setJob_day_10(String job_day_10){
        this.job_day_10 = job_day_10;
    }

    @ElVoField(physicalName = "job_day_11")
    public String getJob_day_11(){
        return job_day_11;
    }

    @ElVoField(physicalName = "job_day_11")
    public void setJob_day_11(String job_day_11){
        this.job_day_11 = job_day_11;
    }

    @ElVoField(physicalName = "job_day_12")
    public String getJob_day_12(){
        return job_day_12;
    }

    @ElVoField(physicalName = "job_day_12")
    public void setJob_day_12(String job_day_12){
        this.job_day_12 = job_day_12;
    }

    @ElVoField(physicalName = "job_day_13")
    public String getJob_day_13(){
        return job_day_13;
    }

    @ElVoField(physicalName = "job_day_13")
    public void setJob_day_13(String job_day_13){
        this.job_day_13 = job_day_13;
    }

    @ElVoField(physicalName = "job_day_14")
    public String getJob_day_14(){
        return job_day_14;
    }

    @ElVoField(physicalName = "job_day_14")
    public void setJob_day_14(String job_day_14){
        this.job_day_14 = job_day_14;
    }

    @ElVoField(physicalName = "job_day_15")
    public String getJob_day_15(){
        return job_day_15;
    }

    @ElVoField(physicalName = "job_day_15")
    public void setJob_day_15(String job_day_15){
        this.job_day_15 = job_day_15;
    }

    @ElVoField(physicalName = "job_day_16")
    public String getJob_day_16(){
        return job_day_16;
    }

    @ElVoField(physicalName = "job_day_16")
    public void setJob_day_16(String job_day_16){
        this.job_day_16 = job_day_16;
    }

    @ElVoField(physicalName = "job_day_17")
    public String getJob_day_17(){
        return job_day_17;
    }

    @ElVoField(physicalName = "job_day_17")
    public void setJob_day_17(String job_day_17){
        this.job_day_17 = job_day_17;
    }

    @ElVoField(physicalName = "job_day_18")
    public String getJob_day_18(){
        return job_day_18;
    }

    @ElVoField(physicalName = "job_day_18")
    public void setJob_day_18(String job_day_18){
        this.job_day_18 = job_day_18;
    }

    @ElVoField(physicalName = "job_day_19")
    public String getJob_day_19(){
        return job_day_19;
    }

    @ElVoField(physicalName = "job_day_19")
    public void setJob_day_19(String job_day_19){
        this.job_day_19 = job_day_19;
    }

    @ElVoField(physicalName = "job_day_20")
    public String getJob_day_20(){
        return job_day_20;
    }

    @ElVoField(physicalName = "job_day_20")
    public void setJob_day_20(String job_day_20){
        this.job_day_20 = job_day_20;
    }

    @ElVoField(physicalName = "job_day_21")
    public String getJob_day_21(){
        return job_day_21;
    }

    @ElVoField(physicalName = "job_day_21")
    public void setJob_day_21(String job_day_21){
        this.job_day_21 = job_day_21;
    }

    @ElVoField(physicalName = "job_day_22")
    public String getJob_day_22(){
        return job_day_22;
    }

    @ElVoField(physicalName = "job_day_22")
    public void setJob_day_22(String job_day_22){
        this.job_day_22 = job_day_22;
    }

    @ElVoField(physicalName = "job_day_23")
    public String getJob_day_23(){
        return job_day_23;
    }

    @ElVoField(physicalName = "job_day_23")
    public void setJob_day_23(String job_day_23){
        this.job_day_23 = job_day_23;
    }

    @ElVoField(physicalName = "job_day_24")
    public String getJob_day_24(){
        return job_day_24;
    }

    @ElVoField(physicalName = "job_day_24")
    public void setJob_day_24(String job_day_24){
        this.job_day_24 = job_day_24;
    }

    @ElVoField(physicalName = "job_day_25")
    public String getJob_day_25(){
        return job_day_25;
    }

    @ElVoField(physicalName = "job_day_25")
    public void setJob_day_25(String job_day_25){
        this.job_day_25 = job_day_25;
    }

    @ElVoField(physicalName = "job_day_26")
    public String getJob_day_26(){
        return job_day_26;
    }

    @ElVoField(physicalName = "job_day_26")
    public void setJob_day_26(String job_day_26){
        this.job_day_26 = job_day_26;
    }

    @ElVoField(physicalName = "job_day_27")
    public String getJob_day_27(){
        return job_day_27;
    }

    @ElVoField(physicalName = "job_day_27")
    public void setJob_day_27(String job_day_27){
        this.job_day_27 = job_day_27;
    }

    @ElVoField(physicalName = "job_day_28")
    public String getJob_day_28(){
        return job_day_28;
    }

    @ElVoField(physicalName = "job_day_28")
    public void setJob_day_28(String job_day_28){
        this.job_day_28 = job_day_28;
    }

    @ElVoField(physicalName = "job_day_29")
    public String getJob_day_29(){
        return job_day_29;
    }

    @ElVoField(physicalName = "job_day_29")
    public void setJob_day_29(String job_day_29){
        this.job_day_29 = job_day_29;
    }

    @ElVoField(physicalName = "job_day_30")
    public String getJob_day_30(){
        return job_day_30;
    }

    @ElVoField(physicalName = "job_day_30")
    public void setJob_day_30(String job_day_30){
        this.job_day_30 = job_day_30;
    }

    @ElVoField(physicalName = "job_day_31")
    public String getJob_day_31(){
        return job_day_31;
    }

    @ElVoField(physicalName = "job_day_31")
    public void setJob_day_31(String job_day_31){
        this.job_day_31 = job_day_31;
    }

    @ElVoField(physicalName = "day_amt")
    public double getDay_amt(){
        return day_amt;
    }

    @ElVoField(physicalName = "day_amt")
    public void setDay_amt(double day_amt){
        this.day_amt = day_amt;
    }

    @ElVoField(physicalName = "week_holi_amt")
    public double getWeek_holi_amt(){
        return week_holi_amt;
    }

    @ElVoField(physicalName = "week_holi_amt")
    public void setWeek_holi_amt(double week_holi_amt){
        this.week_holi_amt = week_holi_amt;
    }

    @ElVoField(physicalName = "expns_amt")
    public double getExpns_amt(){
        return expns_amt;
    }

    @ElVoField(physicalName = "expns_amt")
    public void setExpns_amt(double expns_amt){
        this.expns_amt = expns_amt;
    }

    @ElVoField(physicalName = "tran_rt")
    public double getTran_rt(){
        return tran_rt;
    }

    @ElVoField(physicalName = "tran_rt")
    public void setTran_rt(double tran_rt){
        this.tran_rt = tran_rt;
    }

    @ElVoField(physicalName = "acdt_amt")
    public double getAcdt_amt(){
        return acdt_amt;
    }

    @ElVoField(physicalName = "acdt_amt")
    public void setAcdt_amt(double acdt_amt){
        this.acdt_amt = acdt_amt;
    }

    @ElVoField(physicalName = "bond_amt")
    public double getBond_amt(){
        return bond_amt;
    }

    @ElVoField(physicalName = "bond_amt")
    public void setBond_amt(double bond_amt){
        this.bond_amt = bond_amt;
    }

    @ElVoField(physicalName = "asbe_amt")
    public double getAsbe_amt(){
        return asbe_amt;
    }

    @ElVoField(physicalName = "asbe_amt")
    public void setAsbe_amt(double asbe_amt){
        this.asbe_amt = asbe_amt;
    }

    @ElVoField(physicalName = "tax_rate")
    public double getTax_rate(){
        return tax_rate;
    }

    @ElVoField(physicalName = "tax_rate")
    public void setTax_rate(double tax_rate){
        this.tax_rate = tax_rate;
    }

    @ElVoField(physicalName = "emp_amt")
    public double getEmp_amt(){
        return emp_amt;
    }

    @ElVoField(physicalName = "emp_amt")
    public void setEmp_amt(double emp_amt){
        this.emp_amt = emp_amt;
    }

    @ElVoField(physicalName = "emp_ins_amt")
    public double getEmp_ins_amt(){
        return emp_ins_amt;
    }

    @ElVoField(physicalName = "emp_ins_amt")
    public void setEmp_ins_amt(double emp_ins_amt){
        this.emp_ins_amt = emp_ins_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public double getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(double tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "resid_tax")
    public double getResid_tax(){
        return resid_tax;
    }

    @ElVoField(physicalName = "resid_tax")
    public void setResid_tax(double resid_tax){
        this.resid_tax = resid_tax;
    }

    @ElVoField(physicalName = "bank_cd")
    public String getBank_cd(){
        return bank_cd;
    }

    @ElVoField(physicalName = "bank_cd")
    public void setBank_cd(String bank_cd){
        this.bank_cd = bank_cd;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "acdt_rate")
    public double getAcdt_rate(){
        return acdt_rate;
    }

    @ElVoField(physicalName = "acdt_rate")
    public void setAcdt_rate(double acdt_rate){
        this.acdt_rate = acdt_rate;
    }

    @ElVoField(physicalName = "bond_rate")
    public double getBond_rate(){
        return bond_rate;
    }

    @ElVoField(physicalName = "bond_rate")
    public void setBond_rate(double bond_rate){
        this.bond_rate = bond_rate;
    }

    @ElVoField(physicalName = "asbe_rate")
    public double getAsbe_rate(){
        return asbe_rate;
    }

    @ElVoField(physicalName = "asbe_rate")
    public void setAsbe_rate(double asbe_rate){
        this.asbe_rate = asbe_rate;
    }

    @ElVoField(physicalName = "emp_rate")
    public double getEmp_rate(){
        return emp_rate;
    }

    @ElVoField(physicalName = "emp_rate")
    public void setEmp_rate(double emp_rate){
        this.emp_rate = emp_rate;
    }

    @ElVoField(physicalName = "emp_ins_rate")
    public double getEmp_ins_rate(){
        return emp_ins_rate;
    }

    @ElVoField(physicalName = "emp_ins_rate")
    public void setEmp_ins_rate(double emp_ins_rate){
        this.emp_ins_rate = emp_ins_rate;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyArCostVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("req_degre").append("=").append(req_degre).append(",");
        sb.append("expns_req_no").append("=").append(expns_req_no).append(",");
        sb.append("expns_req_seq").append("=").append(expns_req_seq).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("use_st_ymd").append("=").append(use_st_ymd).append(",");
        sb.append("use_ed_ymd").append("=").append(use_ed_ymd).append(",");
        sb.append("pay_yrmon").append("=").append(pay_yrmon).append(",");
        sb.append("month_tran_time").append("=").append(month_tran_time).append(",");
        sb.append("job_days").append("=").append(job_days).append(",");
        sb.append("job_day_1").append("=").append(job_day_1).append(",");
        sb.append("job_day_2").append("=").append(job_day_2).append(",");
        sb.append("job_day_3").append("=").append(job_day_3).append(",");
        sb.append("job_day_4").append("=").append(job_day_4).append(",");
        sb.append("job_day_5").append("=").append(job_day_5).append(",");
        sb.append("job_day_6").append("=").append(job_day_6).append(",");
        sb.append("job_day_7").append("=").append(job_day_7).append(",");
        sb.append("job_day_8").append("=").append(job_day_8).append(",");
        sb.append("job_day_9").append("=").append(job_day_9).append(",");
        sb.append("job_day_10").append("=").append(job_day_10).append(",");
        sb.append("job_day_11").append("=").append(job_day_11).append(",");
        sb.append("job_day_12").append("=").append(job_day_12).append(",");
        sb.append("job_day_13").append("=").append(job_day_13).append(",");
        sb.append("job_day_14").append("=").append(job_day_14).append(",");
        sb.append("job_day_15").append("=").append(job_day_15).append(",");
        sb.append("job_day_16").append("=").append(job_day_16).append(",");
        sb.append("job_day_17").append("=").append(job_day_17).append(",");
        sb.append("job_day_18").append("=").append(job_day_18).append(",");
        sb.append("job_day_19").append("=").append(job_day_19).append(",");
        sb.append("job_day_20").append("=").append(job_day_20).append(",");
        sb.append("job_day_21").append("=").append(job_day_21).append(",");
        sb.append("job_day_22").append("=").append(job_day_22).append(",");
        sb.append("job_day_23").append("=").append(job_day_23).append(",");
        sb.append("job_day_24").append("=").append(job_day_24).append(",");
        sb.append("job_day_25").append("=").append(job_day_25).append(",");
        sb.append("job_day_26").append("=").append(job_day_26).append(",");
        sb.append("job_day_27").append("=").append(job_day_27).append(",");
        sb.append("job_day_28").append("=").append(job_day_28).append(",");
        sb.append("job_day_29").append("=").append(job_day_29).append(",");
        sb.append("job_day_30").append("=").append(job_day_30).append(",");
        sb.append("job_day_31").append("=").append(job_day_31).append(",");
        sb.append("day_amt").append("=").append(day_amt).append(",");
        sb.append("week_holi_amt").append("=").append(week_holi_amt).append(",");
        sb.append("expns_amt").append("=").append(expns_amt).append(",");
        sb.append("tran_rt").append("=").append(tran_rt).append(",");
        sb.append("acdt_amt").append("=").append(acdt_amt).append(",");
        sb.append("bond_amt").append("=").append(bond_amt).append(",");
        sb.append("asbe_amt").append("=").append(asbe_amt).append(",");
        sb.append("tax_rate").append("=").append(tax_rate).append(",");
        sb.append("emp_amt").append("=").append(emp_amt).append(",");
        sb.append("emp_ins_amt").append("=").append(emp_ins_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("resid_tax").append("=").append(resid_tax).append(",");
        sb.append("bank_cd").append("=").append(bank_cd).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("acdt_rate").append("=").append(acdt_rate).append(",");
        sb.append("bond_rate").append("=").append(bond_rate).append(",");
        sb.append("asbe_rate").append("=").append(asbe_rate).append(",");
        sb.append("emp_rate").append("=").append(emp_rate).append(",");
        sb.append("emp_ins_rate").append("=").append(emp_ins_rate).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no);
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
