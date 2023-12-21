package kr.re.kitech.biz.hum.sal.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "급여내역조회Vo")
public class HumSalPayVo extends kr.re.kitech.biz.fin.com.vo.ComReqVo {
    private static final long serialVersionUID = 1L;

    public HumSalPayVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "급여년월", physicalName = "belng_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String belng_yrmon;

    @ElDtoField(logicalName = "소득구분", physicalName = "user_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_div;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "직군", physicalName = "occugrp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_nm;

    @ElDtoField(logicalName = "직종", physicalName = "occutyp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occutyp_nm;

    @ElDtoField(logicalName = "직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직책", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "총근로소득", physicalName = "tot_work_incom", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_work_incom;

    @ElDtoField(logicalName = "공제액계", physicalName = "tot_dedct_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_dedct_amt;

    @ElDtoField(logicalName = "실지급액", physicalName = "ofic_pay", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ofic_pay;

    @ElDtoField(logicalName = "공지사항", physicalName = "notice_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_contnt;

    @ElDtoField(logicalName = "은행코드", physicalName = "salry_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_bank;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "수당코드", physicalName = "salry_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_cd;

    @ElDtoField(logicalName = "수당코드명", physicalName = "salry_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_cd_nm;

    @ElDtoField(logicalName = "수당유형코드", physicalName = "pay_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_typ_cd;

    @ElDtoField(logicalName = "수당유형코드", physicalName = "pay_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_typ;

    @ElDtoField(logicalName = "비과세대상", physicalName = "fretax_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fretax_yn;

    @ElDtoField(logicalName = "비과세금액", physicalName = "fretax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fretax_amt;

    @ElDtoField(logicalName = "수당금액", physicalName = "salry_cd_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long salry_cd_amt;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_1;

    @ElDtoField(logicalName = "출력순서", physicalName = "disp_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disp_seq;

    @ElDtoField(logicalName = "시작일자", physicalName = "fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fr_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "급여마감정보", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "비과세근로소득", physicalName = "fretax_work_incom", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fretax_work_incom;

    @ElDtoField(logicalName = "총급여액", physicalName = "tot_salry_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_salry_liq;

    @ElDtoField(logicalName = "근로소득공제", physicalName = "work_incom_dedct", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long work_incom_dedct;

    @ElDtoField(logicalName = "근로소득금액", physicalName = "work_incom_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long work_incom_amt;

    @ElDtoField(logicalName = "총소득공제금액", physicalName = "tot_incom_dedct_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_incom_dedct_amt;

    @ElDtoField(logicalName = "인적소득공제부양가족", physicalName = "human_dpnd_fam", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_dpnd_fam;

    @ElDtoField(logicalName = "payup_mny_amt", physicalName = "payup_mny_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long payup_mny_amt;

    @ElDtoField(logicalName = "과세표준", physicalName = "tax_std", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_std;

    @ElDtoField(logicalName = "산출세액", physicalName = "calc_taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long calc_taxamt;

    @ElDtoField(logicalName = "세액공제감면", physicalName = "taxamt_dedct_dedct", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long taxamt_dedct_dedct;

    @ElDtoField(logicalName = "결정세액", physicalName = "decsn_taxamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_taxamt;

    @ElDtoField(logicalName = "결정세액률", physicalName = "decsn_taxrts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_taxrts;

    @ElDtoField(logicalName = "급여공제세율", physicalName = "salry_taxrts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_taxrts;

    @ElDtoField(logicalName = "소득세", physicalName = "incomtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long incomtax;

    @ElDtoField(logicalName = "주민세", physicalName = "residtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long residtax;

    @ElDtoField(logicalName = "농특세", physicalName = "ffvstax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ffvstax;

    @ElDtoField(logicalName = "인적공제본인", physicalName = "human_self", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_self;

    @ElDtoField(logicalName = "인적공제배우자", physicalName = "human_wife", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_wife;

    @ElDtoField(logicalName = "인저공제경로우대", physicalName = "human_path_prefrt_hedcnt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_path_prefrt_hedcnt;

    @ElDtoField(logicalName = "인적공제장애인수", physicalName = "human_disapsn_no", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int human_disapsn_no;

    @ElDtoField(logicalName = "인적공제자녀양육인원", physicalName = "human_child_nutur_hedcnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int human_child_nutur_hedcnt;

    @ElDtoField(logicalName = "nation_amt", physicalName = "nation_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long nation_amt;

    @ElDtoField(logicalName = "heath_amt", physicalName = "heath_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long heath_amt;

    @ElDtoField(logicalName = "emp_amt", physicalName = "emp_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long emp_amt;

    @ElDtoField(logicalName = "reti_amt", physicalName = "reti_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long reti_amt;

    @ElDtoField(logicalName = "부녀자공제", physicalName = "human_woman_psn", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_woman_psn;

    @ElDtoField(logicalName = "총인적공제", physicalName = "tot_human_dedct", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_human_dedct;

    @ElDtoField(logicalName = "다자녀수", physicalName = "add_many_child_hedcnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int add_many_child_hedcnt;

    @ElDtoField(logicalName = "인적소득공제경로우대", physicalName = "human_path_prefrt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_path_prefrt;

    @ElDtoField(logicalName = "인적소득공제장애인", physicalName = "human_disapsn", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_disapsn;

    @ElDtoField(logicalName = "인적소득공제자녀양육", physicalName = "human_child_nutur", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long human_child_nutur;

    @ElDtoField(logicalName = "다자녀추가공제", physicalName = "add_many_child", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long add_many_child;

    @ElDtoField(logicalName = "tot_etc_tax", physicalName = "tot_etc_tax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_etc_tax;

    @ElDtoField(logicalName = "payup_mny_incomtax", physicalName = "payup_mny_incomtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long payup_mny_incomtax;

    @ElDtoField(logicalName = "payup_mny_residtax", physicalName = "payup_mny_residtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long payup_mny_residtax;

    @ElDtoField(logicalName = "tot_work_incom_tax", physicalName = "tot_work_incom_tax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_work_incom_tax;

    @ElDtoField(logicalName = "급여코드명", physicalName = "pay_sarly_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_sarly_cd_nm;

    @ElDtoField(logicalName = "1월지급분", physicalName = "pay_01", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_01;

    @ElDtoField(logicalName = "2월지급분", physicalName = "pay_02", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_02;

    @ElDtoField(logicalName = "3월지급분", physicalName = "pay_03", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_03;

    @ElDtoField(logicalName = "4월지급분", physicalName = "pay_04", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_04;

    @ElDtoField(logicalName = "5월지급분", physicalName = "pay_05", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_05;

    @ElDtoField(logicalName = "6월지급분", physicalName = "pay_06", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_06;

    @ElDtoField(logicalName = "7월지급분", physicalName = "pay_07", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_07;

    @ElDtoField(logicalName = "8월지급분", physicalName = "pay_08", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_08;

    @ElDtoField(logicalName = "9월지급분", physicalName = "pay_09", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_09;

    @ElDtoField(logicalName = "10월지급분", physicalName = "pay_10", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_10;

    @ElDtoField(logicalName = "11월지급분", physicalName = "pay_11", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_11;

    @ElDtoField(logicalName = "12월지급분", physicalName = "pay_12", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_12;

    @ElDtoField(logicalName = "지급분합계", physicalName = "payTotal", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long payTotal;

    @ElDtoField(logicalName = "조회구분", physicalName = "slGubn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slGubn;

    @ElDtoField(logicalName = "pay_ymd", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "work_cnt", physicalName = "work_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_cnt;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public String getBelng_yrmon(){
        return belng_yrmon;
    }

    @ElVoField(physicalName = "belng_yrmon")
    public void setBelng_yrmon(String belng_yrmon){
        this.belng_yrmon = belng_yrmon;
    }

    @ElVoField(physicalName = "user_div")
    public String getUser_div(){
        return user_div;
    }

    @ElVoField(physicalName = "user_div")
    public void setUser_div(String user_div){
        this.user_div = user_div;
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

    @ElVoField(physicalName = "occugrp_nm")
    public String getOccugrp_nm(){
        return occugrp_nm;
    }

    @ElVoField(physicalName = "occugrp_nm")
    public void setOccugrp_nm(String occugrp_nm){
        this.occugrp_nm = occugrp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public String getOccutyp_nm(){
        return occutyp_nm;
    }

    @ElVoField(physicalName = "occutyp_nm")
    public void setOccutyp_nm(String occutyp_nm){
        this.occutyp_nm = occutyp_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "tot_work_incom")
    public long getTot_work_incom(){
        return tot_work_incom;
    }

    @ElVoField(physicalName = "tot_work_incom")
    public void setTot_work_incom(long tot_work_incom){
        this.tot_work_incom = tot_work_incom;
    }

    @ElVoField(physicalName = "tot_dedct_amt")
    public long getTot_dedct_amt(){
        return tot_dedct_amt;
    }

    @ElVoField(physicalName = "tot_dedct_amt")
    public void setTot_dedct_amt(long tot_dedct_amt){
        this.tot_dedct_amt = tot_dedct_amt;
    }

    @ElVoField(physicalName = "ofic_pay")
    public long getOfic_pay(){
        return ofic_pay;
    }

    @ElVoField(physicalName = "ofic_pay")
    public void setOfic_pay(long ofic_pay){
        this.ofic_pay = ofic_pay;
    }

    @ElVoField(physicalName = "notice_contnt")
    public String getNotice_contnt(){
        return notice_contnt;
    }

    @ElVoField(physicalName = "notice_contnt")
    public void setNotice_contnt(String notice_contnt){
        this.notice_contnt = notice_contnt;
    }

    @ElVoField(physicalName = "salry_bank")
    public String getSalry_bank(){
        return salry_bank;
    }

    @ElVoField(physicalName = "salry_bank")
    public void setSalry_bank(String salry_bank){
        this.salry_bank = salry_bank;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "salry_cd")
    public String getSalry_cd(){
        return salry_cd;
    }

    @ElVoField(physicalName = "salry_cd")
    public void setSalry_cd(String salry_cd){
        this.salry_cd = salry_cd;
    }

    @ElVoField(physicalName = "salry_cd_nm")
    public String getSalry_cd_nm(){
        return salry_cd_nm;
    }

    @ElVoField(physicalName = "salry_cd_nm")
    public void setSalry_cd_nm(String salry_cd_nm){
        this.salry_cd_nm = salry_cd_nm;
    }

    @ElVoField(physicalName = "pay_typ_cd")
    public String getPay_typ_cd(){
        return pay_typ_cd;
    }

    @ElVoField(physicalName = "pay_typ_cd")
    public void setPay_typ_cd(String pay_typ_cd){
        this.pay_typ_cd = pay_typ_cd;
    }

    @ElVoField(physicalName = "pay_typ")
    public String getPay_typ(){
        return pay_typ;
    }

    @ElVoField(physicalName = "pay_typ")
    public void setPay_typ(String pay_typ){
        this.pay_typ = pay_typ;
    }

    @ElVoField(physicalName = "fretax_yn")
    public String getFretax_yn(){
        return fretax_yn;
    }

    @ElVoField(physicalName = "fretax_yn")
    public void setFretax_yn(String fretax_yn){
        this.fretax_yn = fretax_yn;
    }

    @ElVoField(physicalName = "fretax_amt")
    public long getFretax_amt(){
        return fretax_amt;
    }

    @ElVoField(physicalName = "fretax_amt")
    public void setFretax_amt(long fretax_amt){
        this.fretax_amt = fretax_amt;
    }

    @ElVoField(physicalName = "salry_cd_amt")
    public long getSalry_cd_amt(){
        return salry_cd_amt;
    }

    @ElVoField(physicalName = "salry_cd_amt")
    public void setSalry_cd_amt(long salry_cd_amt){
        this.salry_cd_amt = salry_cd_amt;
    }

    @ElVoField(physicalName = "mngmt_no_1")
    public String getMngmt_no_1(){
        return mngmt_no_1;
    }

    @ElVoField(physicalName = "mngmt_no_1")
    public void setMngmt_no_1(String mngmt_no_1){
        this.mngmt_no_1 = mngmt_no_1;
    }

    @ElVoField(physicalName = "disp_seq")
    public String getDisp_seq(){
        return disp_seq;
    }

    @ElVoField(physicalName = "disp_seq")
    public void setDisp_seq(String disp_seq){
        this.disp_seq = disp_seq;
    }

    @ElVoField(physicalName = "fr_ymd")
    public String getFr_ymd(){
        return fr_ymd;
    }

    @ElVoField(physicalName = "fr_ymd")
    public void setFr_ymd(String fr_ymd){
        this.fr_ymd = fr_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "fretax_work_incom")
    public long getFretax_work_incom(){
        return fretax_work_incom;
    }

    @ElVoField(physicalName = "fretax_work_incom")
    public void setFretax_work_incom(long fretax_work_incom){
        this.fretax_work_incom = fretax_work_incom;
    }

    @ElVoField(physicalName = "tot_salry_liq")
    public long getTot_salry_liq(){
        return tot_salry_liq;
    }

    @ElVoField(physicalName = "tot_salry_liq")
    public void setTot_salry_liq(long tot_salry_liq){
        this.tot_salry_liq = tot_salry_liq;
    }

    @ElVoField(physicalName = "work_incom_dedct")
    public long getWork_incom_dedct(){
        return work_incom_dedct;
    }

    @ElVoField(physicalName = "work_incom_dedct")
    public void setWork_incom_dedct(long work_incom_dedct){
        this.work_incom_dedct = work_incom_dedct;
    }

    @ElVoField(physicalName = "work_incom_amt")
    public long getWork_incom_amt(){
        return work_incom_amt;
    }

    @ElVoField(physicalName = "work_incom_amt")
    public void setWork_incom_amt(long work_incom_amt){
        this.work_incom_amt = work_incom_amt;
    }

    @ElVoField(physicalName = "tot_incom_dedct_amt")
    public long getTot_incom_dedct_amt(){
        return tot_incom_dedct_amt;
    }

    @ElVoField(physicalName = "tot_incom_dedct_amt")
    public void setTot_incom_dedct_amt(long tot_incom_dedct_amt){
        this.tot_incom_dedct_amt = tot_incom_dedct_amt;
    }

    @ElVoField(physicalName = "human_dpnd_fam")
    public long getHuman_dpnd_fam(){
        return human_dpnd_fam;
    }

    @ElVoField(physicalName = "human_dpnd_fam")
    public void setHuman_dpnd_fam(long human_dpnd_fam){
        this.human_dpnd_fam = human_dpnd_fam;
    }

    @ElVoField(physicalName = "payup_mny_amt")
    public long getPayup_mny_amt(){
        return payup_mny_amt;
    }

    @ElVoField(physicalName = "payup_mny_amt")
    public void setPayup_mny_amt(long payup_mny_amt){
        this.payup_mny_amt = payup_mny_amt;
    }

    @ElVoField(physicalName = "tax_std")
    public long getTax_std(){
        return tax_std;
    }

    @ElVoField(physicalName = "tax_std")
    public void setTax_std(long tax_std){
        this.tax_std = tax_std;
    }

    @ElVoField(physicalName = "calc_taxamt")
    public long getCalc_taxamt(){
        return calc_taxamt;
    }

    @ElVoField(physicalName = "calc_taxamt")
    public void setCalc_taxamt(long calc_taxamt){
        this.calc_taxamt = calc_taxamt;
    }

    @ElVoField(physicalName = "taxamt_dedct_dedct")
    public long getTaxamt_dedct_dedct(){
        return taxamt_dedct_dedct;
    }

    @ElVoField(physicalName = "taxamt_dedct_dedct")
    public void setTaxamt_dedct_dedct(long taxamt_dedct_dedct){
        this.taxamt_dedct_dedct = taxamt_dedct_dedct;
    }

    @ElVoField(physicalName = "decsn_taxamt")
    public long getDecsn_taxamt(){
        return decsn_taxamt;
    }

    @ElVoField(physicalName = "decsn_taxamt")
    public void setDecsn_taxamt(long decsn_taxamt){
        this.decsn_taxamt = decsn_taxamt;
    }

    @ElVoField(physicalName = "decsn_taxrts")
    public String getDecsn_taxrts(){
        return decsn_taxrts;
    }

    @ElVoField(physicalName = "decsn_taxrts")
    public void setDecsn_taxrts(String decsn_taxrts){
        this.decsn_taxrts = decsn_taxrts;
    }

    @ElVoField(physicalName = "salry_taxrts")
    public String getSalry_taxrts(){
        return salry_taxrts;
    }

    @ElVoField(physicalName = "salry_taxrts")
    public void setSalry_taxrts(String salry_taxrts){
        this.salry_taxrts = salry_taxrts;
    }

    @ElVoField(physicalName = "incomtax")
    public long getIncomtax(){
        return incomtax;
    }

    @ElVoField(physicalName = "incomtax")
    public void setIncomtax(long incomtax){
        this.incomtax = incomtax;
    }

    @ElVoField(physicalName = "residtax")
    public long getResidtax(){
        return residtax;
    }

    @ElVoField(physicalName = "residtax")
    public void setResidtax(long residtax){
        this.residtax = residtax;
    }

    @ElVoField(physicalName = "ffvstax")
    public long getFfvstax(){
        return ffvstax;
    }

    @ElVoField(physicalName = "ffvstax")
    public void setFfvstax(long ffvstax){
        this.ffvstax = ffvstax;
    }

    @ElVoField(physicalName = "human_self")
    public long getHuman_self(){
        return human_self;
    }

    @ElVoField(physicalName = "human_self")
    public void setHuman_self(long human_self){
        this.human_self = human_self;
    }

    @ElVoField(physicalName = "human_wife")
    public long getHuman_wife(){
        return human_wife;
    }

    @ElVoField(physicalName = "human_wife")
    public void setHuman_wife(long human_wife){
        this.human_wife = human_wife;
    }

    @ElVoField(physicalName = "human_path_prefrt_hedcnt")
    public long getHuman_path_prefrt_hedcnt(){
        return human_path_prefrt_hedcnt;
    }

    @ElVoField(physicalName = "human_path_prefrt_hedcnt")
    public void setHuman_path_prefrt_hedcnt(long human_path_prefrt_hedcnt){
        this.human_path_prefrt_hedcnt = human_path_prefrt_hedcnt;
    }

    @ElVoField(physicalName = "human_disapsn_no")
    public int getHuman_disapsn_no(){
        return human_disapsn_no;
    }

    @ElVoField(physicalName = "human_disapsn_no")
    public void setHuman_disapsn_no(int human_disapsn_no){
        this.human_disapsn_no = human_disapsn_no;
    }

    @ElVoField(physicalName = "human_child_nutur_hedcnt")
    public int getHuman_child_nutur_hedcnt(){
        return human_child_nutur_hedcnt;
    }

    @ElVoField(physicalName = "human_child_nutur_hedcnt")
    public void setHuman_child_nutur_hedcnt(int human_child_nutur_hedcnt){
        this.human_child_nutur_hedcnt = human_child_nutur_hedcnt;
    }

    @ElVoField(physicalName = "nation_amt")
    public long getNation_amt(){
        return nation_amt;
    }

    @ElVoField(physicalName = "nation_amt")
    public void setNation_amt(long nation_amt){
        this.nation_amt = nation_amt;
    }

    @ElVoField(physicalName = "heath_amt")
    public long getHeath_amt(){
        return heath_amt;
    }

    @ElVoField(physicalName = "heath_amt")
    public void setHeath_amt(long heath_amt){
        this.heath_amt = heath_amt;
    }

    @ElVoField(physicalName = "emp_amt")
    public long getEmp_amt(){
        return emp_amt;
    }

    @ElVoField(physicalName = "emp_amt")
    public void setEmp_amt(long emp_amt){
        this.emp_amt = emp_amt;
    }

    @ElVoField(physicalName = "reti_amt")
    public long getReti_amt(){
        return reti_amt;
    }

    @ElVoField(physicalName = "reti_amt")
    public void setReti_amt(long reti_amt){
        this.reti_amt = reti_amt;
    }

    @ElVoField(physicalName = "human_woman_psn")
    public long getHuman_woman_psn(){
        return human_woman_psn;
    }

    @ElVoField(physicalName = "human_woman_psn")
    public void setHuman_woman_psn(long human_woman_psn){
        this.human_woman_psn = human_woman_psn;
    }

    @ElVoField(physicalName = "tot_human_dedct")
    public long getTot_human_dedct(){
        return tot_human_dedct;
    }

    @ElVoField(physicalName = "tot_human_dedct")
    public void setTot_human_dedct(long tot_human_dedct){
        this.tot_human_dedct = tot_human_dedct;
    }

    @ElVoField(physicalName = "add_many_child_hedcnt")
    public int getAdd_many_child_hedcnt(){
        return add_many_child_hedcnt;
    }

    @ElVoField(physicalName = "add_many_child_hedcnt")
    public void setAdd_many_child_hedcnt(int add_many_child_hedcnt){
        this.add_many_child_hedcnt = add_many_child_hedcnt;
    }

    @ElVoField(physicalName = "human_path_prefrt")
    public long getHuman_path_prefrt(){
        return human_path_prefrt;
    }

    @ElVoField(physicalName = "human_path_prefrt")
    public void setHuman_path_prefrt(long human_path_prefrt){
        this.human_path_prefrt = human_path_prefrt;
    }

    @ElVoField(physicalName = "human_disapsn")
    public long getHuman_disapsn(){
        return human_disapsn;
    }

    @ElVoField(physicalName = "human_disapsn")
    public void setHuman_disapsn(long human_disapsn){
        this.human_disapsn = human_disapsn;
    }

    @ElVoField(physicalName = "human_child_nutur")
    public long getHuman_child_nutur(){
        return human_child_nutur;
    }

    @ElVoField(physicalName = "human_child_nutur")
    public void setHuman_child_nutur(long human_child_nutur){
        this.human_child_nutur = human_child_nutur;
    }

    @ElVoField(physicalName = "add_many_child")
    public long getAdd_many_child(){
        return add_many_child;
    }

    @ElVoField(physicalName = "add_many_child")
    public void setAdd_many_child(long add_many_child){
        this.add_many_child = add_many_child;
    }

    @ElVoField(physicalName = "tot_etc_tax")
    public long getTot_etc_tax(){
        return tot_etc_tax;
    }

    @ElVoField(physicalName = "tot_etc_tax")
    public void setTot_etc_tax(long tot_etc_tax){
        this.tot_etc_tax = tot_etc_tax;
    }

    @ElVoField(physicalName = "payup_mny_incomtax")
    public long getPayup_mny_incomtax(){
        return payup_mny_incomtax;
    }

    @ElVoField(physicalName = "payup_mny_incomtax")
    public void setPayup_mny_incomtax(long payup_mny_incomtax){
        this.payup_mny_incomtax = payup_mny_incomtax;
    }

    @ElVoField(physicalName = "payup_mny_residtax")
    public long getPayup_mny_residtax(){
        return payup_mny_residtax;
    }

    @ElVoField(physicalName = "payup_mny_residtax")
    public void setPayup_mny_residtax(long payup_mny_residtax){
        this.payup_mny_residtax = payup_mny_residtax;
    }

    @ElVoField(physicalName = "tot_work_incom_tax")
    public long getTot_work_incom_tax(){
        return tot_work_incom_tax;
    }

    @ElVoField(physicalName = "tot_work_incom_tax")
    public void setTot_work_incom_tax(long tot_work_incom_tax){
        this.tot_work_incom_tax = tot_work_incom_tax;
    }

    @ElVoField(physicalName = "pay_sarly_cd_nm")
    public String getPay_sarly_cd_nm(){
        return pay_sarly_cd_nm;
    }

    @ElVoField(physicalName = "pay_sarly_cd_nm")
    public void setPay_sarly_cd_nm(String pay_sarly_cd_nm){
        this.pay_sarly_cd_nm = pay_sarly_cd_nm;
    }

    @ElVoField(physicalName = "pay_01")
    public long getPay_01(){
        return pay_01;
    }

    @ElVoField(physicalName = "pay_01")
    public void setPay_01(long pay_01){
        this.pay_01 = pay_01;
    }

    @ElVoField(physicalName = "pay_02")
    public long getPay_02(){
        return pay_02;
    }

    @ElVoField(physicalName = "pay_02")
    public void setPay_02(long pay_02){
        this.pay_02 = pay_02;
    }

    @ElVoField(physicalName = "pay_03")
    public long getPay_03(){
        return pay_03;
    }

    @ElVoField(physicalName = "pay_03")
    public void setPay_03(long pay_03){
        this.pay_03 = pay_03;
    }

    @ElVoField(physicalName = "pay_04")
    public long getPay_04(){
        return pay_04;
    }

    @ElVoField(physicalName = "pay_04")
    public void setPay_04(long pay_04){
        this.pay_04 = pay_04;
    }

    @ElVoField(physicalName = "pay_05")
    public long getPay_05(){
        return pay_05;
    }

    @ElVoField(physicalName = "pay_05")
    public void setPay_05(long pay_05){
        this.pay_05 = pay_05;
    }

    @ElVoField(physicalName = "pay_06")
    public long getPay_06(){
        return pay_06;
    }

    @ElVoField(physicalName = "pay_06")
    public void setPay_06(long pay_06){
        this.pay_06 = pay_06;
    }

    @ElVoField(physicalName = "pay_07")
    public long getPay_07(){
        return pay_07;
    }

    @ElVoField(physicalName = "pay_07")
    public void setPay_07(long pay_07){
        this.pay_07 = pay_07;
    }

    @ElVoField(physicalName = "pay_08")
    public long getPay_08(){
        return pay_08;
    }

    @ElVoField(physicalName = "pay_08")
    public void setPay_08(long pay_08){
        this.pay_08 = pay_08;
    }

    @ElVoField(physicalName = "pay_09")
    public long getPay_09(){
        return pay_09;
    }

    @ElVoField(physicalName = "pay_09")
    public void setPay_09(long pay_09){
        this.pay_09 = pay_09;
    }

    @ElVoField(physicalName = "pay_10")
    public long getPay_10(){
        return pay_10;
    }

    @ElVoField(physicalName = "pay_10")
    public void setPay_10(long pay_10){
        this.pay_10 = pay_10;
    }

    @ElVoField(physicalName = "pay_11")
    public long getPay_11(){
        return pay_11;
    }

    @ElVoField(physicalName = "pay_11")
    public void setPay_11(long pay_11){
        this.pay_11 = pay_11;
    }

    @ElVoField(physicalName = "pay_12")
    public long getPay_12(){
        return pay_12;
    }

    @ElVoField(physicalName = "pay_12")
    public void setPay_12(long pay_12){
        this.pay_12 = pay_12;
    }

    @ElVoField(physicalName = "payTotal")
    public long getPayTotal(){
        return payTotal;
    }

    @ElVoField(physicalName = "payTotal")
    public void setPayTotal(long payTotal){
        this.payTotal = payTotal;
    }

    @ElVoField(physicalName = "slGubn")
    public String getSlGubn(){
        return slGubn;
    }

    @ElVoField(physicalName = "slGubn")
    public void setSlGubn(String slGubn){
        this.slGubn = slGubn;
    }

    @ElVoField(physicalName = "pay_ymd")
    public String getPay_ymd(){
        return pay_ymd;
    }

    @ElVoField(physicalName = "pay_ymd")
    public void setPay_ymd(String pay_ymd){
        this.pay_ymd = pay_ymd;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "work_cnt")
    public String getWork_cnt(){
        return work_cnt;
    }

    @ElVoField(physicalName = "work_cnt")
    public void setWork_cnt(String work_cnt){
        this.work_cnt = work_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumSalPayVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("belng_yrmon").append("=").append(belng_yrmon).append(",");
        sb.append("user_div").append("=").append(user_div).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("occugrp_nm").append("=").append(occugrp_nm).append(",");
        sb.append("occutyp_nm").append("=").append(occutyp_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("tot_work_incom").append("=").append(tot_work_incom).append(",");
        sb.append("tot_dedct_amt").append("=").append(tot_dedct_amt).append(",");
        sb.append("ofic_pay").append("=").append(ofic_pay).append(",");
        sb.append("notice_contnt").append("=").append(notice_contnt).append(",");
        sb.append("salry_bank").append("=").append(salry_bank).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("salry_cd").append("=").append(salry_cd).append(",");
        sb.append("salry_cd_nm").append("=").append(salry_cd_nm).append(",");
        sb.append("pay_typ_cd").append("=").append(pay_typ_cd).append(",");
        sb.append("pay_typ").append("=").append(pay_typ).append(",");
        sb.append("fretax_yn").append("=").append(fretax_yn).append(",");
        sb.append("fretax_amt").append("=").append(fretax_amt).append(",");
        sb.append("salry_cd_amt").append("=").append(salry_cd_amt).append(",");
        sb.append("mngmt_no_1").append("=").append(mngmt_no_1).append(",");
        sb.append("disp_seq").append("=").append(disp_seq).append(",");
        sb.append("fr_ymd").append("=").append(fr_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("fretax_work_incom").append("=").append(fretax_work_incom).append(",");
        sb.append("tot_salry_liq").append("=").append(tot_salry_liq).append(",");
        sb.append("work_incom_dedct").append("=").append(work_incom_dedct).append(",");
        sb.append("work_incom_amt").append("=").append(work_incom_amt).append(",");
        sb.append("tot_incom_dedct_amt").append("=").append(tot_incom_dedct_amt).append(",");
        sb.append("human_dpnd_fam").append("=").append(human_dpnd_fam).append(",");
        sb.append("payup_mny_amt").append("=").append(payup_mny_amt).append(",");
        sb.append("tax_std").append("=").append(tax_std).append(",");
        sb.append("calc_taxamt").append("=").append(calc_taxamt).append(",");
        sb.append("taxamt_dedct_dedct").append("=").append(taxamt_dedct_dedct).append(",");
        sb.append("decsn_taxamt").append("=").append(decsn_taxamt).append(",");
        sb.append("decsn_taxrts").append("=").append(decsn_taxrts).append(",");
        sb.append("salry_taxrts").append("=").append(salry_taxrts).append(",");
        sb.append("incomtax").append("=").append(incomtax).append(",");
        sb.append("residtax").append("=").append(residtax).append(",");
        sb.append("ffvstax").append("=").append(ffvstax).append(",");
        sb.append("human_self").append("=").append(human_self).append(",");
        sb.append("human_wife").append("=").append(human_wife).append(",");
        sb.append("human_path_prefrt_hedcnt").append("=").append(human_path_prefrt_hedcnt).append(",");
        sb.append("human_disapsn_no").append("=").append(human_disapsn_no).append(",");
        sb.append("human_child_nutur_hedcnt").append("=").append(human_child_nutur_hedcnt).append(",");
        sb.append("nation_amt").append("=").append(nation_amt).append(",");
        sb.append("heath_amt").append("=").append(heath_amt).append(",");
        sb.append("emp_amt").append("=").append(emp_amt).append(",");
        sb.append("reti_amt").append("=").append(reti_amt).append(",");
        sb.append("human_woman_psn").append("=").append(human_woman_psn).append(",");
        sb.append("tot_human_dedct").append("=").append(tot_human_dedct).append(",");
        sb.append("add_many_child_hedcnt").append("=").append(add_many_child_hedcnt).append(",");
        sb.append("human_path_prefrt").append("=").append(human_path_prefrt).append(",");
        sb.append("human_disapsn").append("=").append(human_disapsn).append(",");
        sb.append("human_child_nutur").append("=").append(human_child_nutur).append(",");
        sb.append("add_many_child").append("=").append(add_many_child).append(",");
        sb.append("tot_etc_tax").append("=").append(tot_etc_tax).append(",");
        sb.append("payup_mny_incomtax").append("=").append(payup_mny_incomtax).append(",");
        sb.append("payup_mny_residtax").append("=").append(payup_mny_residtax).append(",");
        sb.append("tot_work_incom_tax").append("=").append(tot_work_incom_tax).append(",");
        sb.append("pay_sarly_cd_nm").append("=").append(pay_sarly_cd_nm).append(",");
        sb.append("pay_01").append("=").append(pay_01).append(",");
        sb.append("pay_02").append("=").append(pay_02).append(",");
        sb.append("pay_03").append("=").append(pay_03).append(",");
        sb.append("pay_04").append("=").append(pay_04).append(",");
        sb.append("pay_05").append("=").append(pay_05).append(",");
        sb.append("pay_06").append("=").append(pay_06).append(",");
        sb.append("pay_07").append("=").append(pay_07).append(",");
        sb.append("pay_08").append("=").append(pay_08).append(",");
        sb.append("pay_09").append("=").append(pay_09).append(",");
        sb.append("pay_10").append("=").append(pay_10).append(",");
        sb.append("pay_11").append("=").append(pay_11).append(",");
        sb.append("pay_12").append("=").append(pay_12).append(",");
        sb.append("payTotal").append("=").append(payTotal).append(",");
        sb.append("slGubn").append("=").append(slGubn).append(",");
        sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("work_cnt").append("=").append(work_cnt);
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
