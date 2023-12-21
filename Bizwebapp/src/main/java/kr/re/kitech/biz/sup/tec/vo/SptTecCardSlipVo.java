package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부기술지원 카드처리 Vo")
public class SptTecCardSlipVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecCardSlipVo(){
    }

    @ElDtoField(logicalName = "승인일자", physicalName = "card_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_issu_ymd;

    @ElDtoField(logicalName = "승인번호", physicalName = "card_appl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_appl_no;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "과세구분", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "승인금액", physicalName = "dsaleamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dsaleamt;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long suply_value;

    @ElDtoField(logicalName = "세액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "거래일련번호", physicalName = "dcontrolno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dcontrolno;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "기술지원번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "승인구분", physicalName = "ddealgubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddealgubun;

    @ElDtoField(logicalName = "승인구분명", physicalName = "ddealgubun_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddealgubun_nm;

    @ElDtoField(logicalName = "경상비지원여부", physicalName = "srpt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srpt_cd;

    @ElDtoField(logicalName = "지역본부", physicalName = "divsn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_clsf;

    @ElDtoField(logicalName = "수수료", physicalName = "dprovfee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dprovfee;

    @ElDtoField(logicalName = "부가세", physicalName = "dprovvat", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dprovvat;

    @ElDtoField(logicalName = "수수료계정번호", physicalName = "fee_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fee_accnt_no;

    @ElDtoField(logicalName = "수수료계정 책임자", physicalName = "fee_accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fee_accnt_rspns;

    @ElDtoField(logicalName = "수수료계정 편성단위", physicalName = "fee_fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fee_fomat_unit;

    @ElDtoField(logicalName = "취소일자(거래발생일자)", physicalName = "dtrandate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dtrandate;

    @ElDtoField(logicalName = "미수결의번호", physicalName = "misu_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String misu_unslip_no;

    @ElDtoField(logicalName = "취소결의번호", physicalName = "cnl_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnl_unslip_no;

    @ElDtoField(logicalName = "취소금액", physicalName = "cnl_dsaleamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnl_dsaleamt;

    @ElDtoField(logicalName = "정산예정일자", physicalName = "hprovdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hprovdate;

    @ElDtoField(logicalName = "결의작성일자", physicalName = "wrte_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ymd;

    @ElDtoField(logicalName = "관련계정번호", physicalName = "mngmt_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_accnt_no;

    @ElDtoField(logicalName = "미수(취소)결의 확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "카드미수확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "카드미수확정결의순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "미수(취소)결의 확정여부", physicalName = "misu_decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String misu_decsn_ex;

    @ElDtoField(logicalName = "정산결의번호(수수료결의)", physicalName = "adjst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_unslip_no;

    @ElDtoField(logicalName = "회계코드(수수료결의)", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계산서발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElVoField(physicalName = "card_issu_ymd")
    public String getCard_issu_ymd(){
        return card_issu_ymd;
    }

    @ElVoField(physicalName = "card_issu_ymd")
    public void setCard_issu_ymd(String card_issu_ymd){
        this.card_issu_ymd = card_issu_ymd;
    }

    @ElVoField(physicalName = "card_appl_no")
    public String getCard_appl_no(){
        return card_appl_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public void setCard_appl_no(String card_appl_no){
        this.card_appl_no = card_appl_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "dsaleamt")
    public long getDsaleamt(){
        return dsaleamt;
    }

    @ElVoField(physicalName = "dsaleamt")
    public void setDsaleamt(long dsaleamt){
        this.dsaleamt = dsaleamt;
    }

    @ElVoField(physicalName = "suply_value")
    public long getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(long suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "dcontrolno")
    public String getDcontrolno(){
        return dcontrolno;
    }

    @ElVoField(physicalName = "dcontrolno")
    public void setDcontrolno(String dcontrolno){
        this.dcontrolno = dcontrolno;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "ddealgubun")
    public String getDdealgubun(){
        return ddealgubun;
    }

    @ElVoField(physicalName = "ddealgubun")
    public void setDdealgubun(String ddealgubun){
        this.ddealgubun = ddealgubun;
    }

    @ElVoField(physicalName = "ddealgubun_nm")
    public String getDdealgubun_nm(){
        return ddealgubun_nm;
    }

    @ElVoField(physicalName = "ddealgubun_nm")
    public void setDdealgubun_nm(String ddealgubun_nm){
        this.ddealgubun_nm = ddealgubun_nm;
    }

    @ElVoField(physicalName = "srpt_cd")
    public String getSrpt_cd(){
        return srpt_cd;
    }

    @ElVoField(physicalName = "srpt_cd")
    public void setSrpt_cd(String srpt_cd){
        this.srpt_cd = srpt_cd;
    }

    @ElVoField(physicalName = "divsn_clsf")
    public String getDivsn_clsf(){
        return divsn_clsf;
    }

    @ElVoField(physicalName = "divsn_clsf")
    public void setDivsn_clsf(String divsn_clsf){
        this.divsn_clsf = divsn_clsf;
    }

    @ElVoField(physicalName = "dprovfee")
    public long getDprovfee(){
        return dprovfee;
    }

    @ElVoField(physicalName = "dprovfee")
    public void setDprovfee(long dprovfee){
        this.dprovfee = dprovfee;
    }

    @ElVoField(physicalName = "dprovvat")
    public long getDprovvat(){
        return dprovvat;
    }

    @ElVoField(physicalName = "dprovvat")
    public void setDprovvat(long dprovvat){
        this.dprovvat = dprovvat;
    }

    @ElVoField(physicalName = "fee_accnt_no")
    public String getFee_accnt_no(){
        return fee_accnt_no;
    }

    @ElVoField(physicalName = "fee_accnt_no")
    public void setFee_accnt_no(String fee_accnt_no){
        this.fee_accnt_no = fee_accnt_no;
    }

    @ElVoField(physicalName = "fee_accnt_rspns")
    public String getFee_accnt_rspns(){
        return fee_accnt_rspns;
    }

    @ElVoField(physicalName = "fee_accnt_rspns")
    public void setFee_accnt_rspns(String fee_accnt_rspns){
        this.fee_accnt_rspns = fee_accnt_rspns;
    }

    @ElVoField(physicalName = "fee_fomat_unit")
    public String getFee_fomat_unit(){
        return fee_fomat_unit;
    }

    @ElVoField(physicalName = "fee_fomat_unit")
    public void setFee_fomat_unit(String fee_fomat_unit){
        this.fee_fomat_unit = fee_fomat_unit;
    }

    @ElVoField(physicalName = "dtrandate")
    public String getDtrandate(){
        return dtrandate;
    }

    @ElVoField(physicalName = "dtrandate")
    public void setDtrandate(String dtrandate){
        this.dtrandate = dtrandate;
    }

    @ElVoField(physicalName = "misu_unslip_no")
    public String getMisu_unslip_no(){
        return misu_unslip_no;
    }

    @ElVoField(physicalName = "misu_unslip_no")
    public void setMisu_unslip_no(String misu_unslip_no){
        this.misu_unslip_no = misu_unslip_no;
    }

    @ElVoField(physicalName = "cnl_unslip_no")
    public String getCnl_unslip_no(){
        return cnl_unslip_no;
    }

    @ElVoField(physicalName = "cnl_unslip_no")
    public void setCnl_unslip_no(String cnl_unslip_no){
        this.cnl_unslip_no = cnl_unslip_no;
    }

    @ElVoField(physicalName = "cnl_dsaleamt")
    public String getCnl_dsaleamt(){
        return cnl_dsaleamt;
    }

    @ElVoField(physicalName = "cnl_dsaleamt")
    public void setCnl_dsaleamt(String cnl_dsaleamt){
        this.cnl_dsaleamt = cnl_dsaleamt;
    }

    @ElVoField(physicalName = "hprovdate")
    public String getHprovdate(){
        return hprovdate;
    }

    @ElVoField(physicalName = "hprovdate")
    public void setHprovdate(String hprovdate){
        this.hprovdate = hprovdate;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public String getWrte_ymd(){
        return wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public void setWrte_ymd(String wrte_ymd){
        this.wrte_ymd = wrte_ymd;
    }

    @ElVoField(physicalName = "mngmt_accnt_no")
    public String getMngmt_accnt_no(){
        return mngmt_accnt_no;
    }

    @ElVoField(physicalName = "mngmt_accnt_no")
    public void setMngmt_accnt_no(String mngmt_accnt_no){
        this.mngmt_accnt_no = mngmt_accnt_no;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public int getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(int slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "misu_decsn_ex")
    public String getMisu_decsn_ex(){
        return misu_decsn_ex;
    }

    @ElVoField(physicalName = "misu_decsn_ex")
    public void setMisu_decsn_ex(String misu_decsn_ex){
        this.misu_decsn_ex = misu_decsn_ex;
    }

    @ElVoField(physicalName = "adjst_unslip_no")
    public String getAdjst_unslip_no(){
        return adjst_unslip_no;
    }

    @ElVoField(physicalName = "adjst_unslip_no")
    public void setAdjst_unslip_no(String adjst_unslip_no){
        this.adjst_unslip_no = adjst_unslip_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecCardSlipVo [");
        sb.append("card_issu_ymd").append("=").append(card_issu_ymd).append(",");
        sb.append("card_appl_no").append("=").append(card_appl_no).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("dsaleamt").append("=").append(dsaleamt).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("dcontrolno").append("=").append(dcontrolno).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("ddealgubun").append("=").append(ddealgubun).append(",");
        sb.append("ddealgubun_nm").append("=").append(ddealgubun_nm).append(",");
        sb.append("srpt_cd").append("=").append(srpt_cd).append(",");
        sb.append("divsn_clsf").append("=").append(divsn_clsf).append(",");
        sb.append("dprovfee").append("=").append(dprovfee).append(",");
        sb.append("dprovvat").append("=").append(dprovvat).append(",");
        sb.append("fee_accnt_no").append("=").append(fee_accnt_no).append(",");
        sb.append("fee_accnt_rspns").append("=").append(fee_accnt_rspns).append(",");
        sb.append("fee_fomat_unit").append("=").append(fee_fomat_unit).append(",");
        sb.append("dtrandate").append("=").append(dtrandate).append(",");
        sb.append("misu_unslip_no").append("=").append(misu_unslip_no).append(",");
        sb.append("cnl_unslip_no").append("=").append(cnl_unslip_no).append(",");
        sb.append("cnl_dsaleamt").append("=").append(cnl_dsaleamt).append(",");
        sb.append("hprovdate").append("=").append(hprovdate).append(",");
        sb.append("wrte_ymd").append("=").append(wrte_ymd).append(",");
        sb.append("mngmt_accnt_no").append("=").append(mngmt_accnt_no).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("misu_decsn_ex").append("=").append(misu_decsn_ex).append(",");
        sb.append("adjst_unslip_no").append("=").append(adjst_unslip_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd);
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
