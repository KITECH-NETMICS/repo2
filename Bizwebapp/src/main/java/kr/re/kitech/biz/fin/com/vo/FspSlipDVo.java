package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서디테일VO")
public class FspSlipDVo extends kr.re.kitech.biz.fin.com.vo.FspSlipDComVo {
    private static final long serialVersionUID = 1L;

    public FspSlipDVo(){
    }

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String fomat_unit;

    @ElDtoField(logicalName = "분개코드", physicalName = "journ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String journ_cd;

    @ElDtoField(logicalName = "분개순번", physicalName = "journ_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int journ_odr;

    @ElDtoField(logicalName = "차대구분", physicalName = "base_debit_cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String base_debit_cr;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String accnt_rspns;

    @ElDtoField(logicalName = "총액", physicalName = "total_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long total_amt;

    @ElDtoField(logicalName = "세액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "증빙코드", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String evid_cd;

    @ElDtoField(logicalName = "잔액관리항목1", physicalName = "ramt_mngmt_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_1;

    @ElDtoField(logicalName = "잔액관리항목2", physicalName = "ramt_mngmt_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ramt_mngmt_2;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String rmk_1;

    @ElDtoField(logicalName = "비고2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String rmk_2;

    @ElDtoField(logicalName = "비고3", physicalName = "rmk_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_3;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청순번", physicalName = "req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_seq;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "지급구분", physicalName = "pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_clsf;

    @ElDtoField(logicalName = "발생결의번호", physicalName = "occr_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occr_slip_no;

    @ElDtoField(logicalName = "발생결의순번", physicalName = "occr_slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int occr_slip_odr;

    @ElDtoField(logicalName = "이전발생결의번호", physicalName = "bf_occr_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "결의내역대체처리")
    private String bf_occr_slip_no;

    @ElDtoField(logicalName = "이전발생결의순번", physicalName = "bf_occr_slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "결의내역대체처리")
    private int bf_occr_slip_odr;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "부분전체구분", physicalName = "part_all_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_all_clsf;

    @ElDtoField(logicalName = "계정번호구분", physicalName = "accnt_no_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_clsf;

    @ElDtoField(logicalName = "지급회계코드", physicalName = "pay_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_accnt_cd;

    @ElDtoField(logicalName = "RCMS지급구분", physicalName = "rcms_pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcms_pay_clsf;

    @ElDtoField(logicalName = "RCMS지급상태", physicalName = "rcms_pay_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcms_pay_state;

    @ElDtoField(logicalName = "카드번호", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "카드종류", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;

    @ElDtoField(logicalName = "카드구분", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;

    @ElDtoField(logicalName = "사용일자", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ymd;

    @ElDtoField(logicalName = "승인번호", physicalName = "apprvl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_no;

    @ElDtoField(logicalName = "이전결의총액", physicalName = "bf_total_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bf_total_amt;

    @ElDtoField(logicalName = "이전결의금액", physicalName = "bf_unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bf_unslip_amt;

    @ElDtoField(logicalName = "어음번호", physicalName = "prmsnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prmsnt_no;

    @ElDtoField(logicalName = "CUD유형", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수(C,U,D)")
    private String cud_type;

    @ElDtoField(logicalName = "이지바로 증빙구분", physicalName = "evid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_yn;

    @ElDtoField(logicalName = "이지바로 증빙서비스ID", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "과세구분", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_nm;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "확정회계코드", physicalName = "conf_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_accnt_cd;

    @ElDtoField(logicalName = "계산서발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "계정번호 관리구분", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "신청서작성자", physicalName = "regst_req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_req_psn;

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "journ_cd")
    public String getJourn_cd(){
        return journ_cd;
    }

    @ElVoField(physicalName = "journ_cd")
    public void setJourn_cd(String journ_cd){
        this.journ_cd = journ_cd;
    }

    @ElVoField(physicalName = "journ_odr")
    public int getJourn_odr(){
        return journ_odr;
    }

    @ElVoField(physicalName = "journ_odr")
    public void setJourn_odr(int journ_odr){
        this.journ_odr = journ_odr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public String getBase_debit_cr(){
        return base_debit_cr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public void setBase_debit_cr(String base_debit_cr){
        this.base_debit_cr = base_debit_cr;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "total_amt")
    public long getTotal_amt(){
        return total_amt;
    }

    @ElVoField(physicalName = "total_amt")
    public void setTotal_amt(long total_amt){
        this.total_amt = total_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public String getRamt_mngmt_1(){
        return ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_1")
    public void setRamt_mngmt_1(String ramt_mngmt_1){
        this.ramt_mngmt_1 = ramt_mngmt_1;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public String getRamt_mngmt_2(){
        return ramt_mngmt_2;
    }

    @ElVoField(physicalName = "ramt_mngmt_2")
    public void setRamt_mngmt_2(String ramt_mngmt_2){
        this.ramt_mngmt_2 = ramt_mngmt_2;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "rmk_3")
    public String getRmk_3(){
        return rmk_3;
    }

    @ElVoField(physicalName = "rmk_3")
    public void setRmk_3(String rmk_3){
        this.rmk_3 = rmk_3;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_seq")
    public int getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(int req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "pay_clsf")
    public String getPay_clsf(){
        return pay_clsf;
    }

    @ElVoField(physicalName = "pay_clsf")
    public void setPay_clsf(String pay_clsf){
        this.pay_clsf = pay_clsf;
    }

    @ElVoField(physicalName = "occr_slip_no")
    public String getOccr_slip_no(){
        return occr_slip_no;
    }

    @ElVoField(physicalName = "occr_slip_no")
    public void setOccr_slip_no(String occr_slip_no){
        this.occr_slip_no = occr_slip_no;
    }

    @ElVoField(physicalName = "occr_slip_odr")
    public int getOccr_slip_odr(){
        return occr_slip_odr;
    }

    @ElVoField(physicalName = "occr_slip_odr")
    public void setOccr_slip_odr(int occr_slip_odr){
        this.occr_slip_odr = occr_slip_odr;
    }

    @ElVoField(physicalName = "bf_occr_slip_no")
    public String getBf_occr_slip_no(){
        return bf_occr_slip_no;
    }

    @ElVoField(physicalName = "bf_occr_slip_no")
    public void setBf_occr_slip_no(String bf_occr_slip_no){
        this.bf_occr_slip_no = bf_occr_slip_no;
    }

    @ElVoField(physicalName = "bf_occr_slip_odr")
    public int getBf_occr_slip_odr(){
        return bf_occr_slip_odr;
    }

    @ElVoField(physicalName = "bf_occr_slip_odr")
    public void setBf_occr_slip_odr(int bf_occr_slip_odr){
        this.bf_occr_slip_odr = bf_occr_slip_odr;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public String getPart_all_clsf(){
        return part_all_clsf;
    }

    @ElVoField(physicalName = "part_all_clsf")
    public void setPart_all_clsf(String part_all_clsf){
        this.part_all_clsf = part_all_clsf;
    }

    @ElVoField(physicalName = "accnt_no_clsf")
    public String getAccnt_no_clsf(){
        return accnt_no_clsf;
    }

    @ElVoField(physicalName = "accnt_no_clsf")
    public void setAccnt_no_clsf(String accnt_no_clsf){
        this.accnt_no_clsf = accnt_no_clsf;
    }

    @ElVoField(physicalName = "pay_accnt_cd")
    public String getPay_accnt_cd(){
        return pay_accnt_cd;
    }

    @ElVoField(physicalName = "pay_accnt_cd")
    public void setPay_accnt_cd(String pay_accnt_cd){
        this.pay_accnt_cd = pay_accnt_cd;
    }

    @ElVoField(physicalName = "rcms_pay_clsf")
    public String getRcms_pay_clsf(){
        return rcms_pay_clsf;
    }

    @ElVoField(physicalName = "rcms_pay_clsf")
    public void setRcms_pay_clsf(String rcms_pay_clsf){
        this.rcms_pay_clsf = rcms_pay_clsf;
    }

    @ElVoField(physicalName = "rcms_pay_state")
    public String getRcms_pay_state(){
        return rcms_pay_state;
    }

    @ElVoField(physicalName = "rcms_pay_state")
    public void setRcms_pay_state(String rcms_pay_state){
        this.rcms_pay_state = rcms_pay_state;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }

    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }

    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }

    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        return use_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "apprvl_no")
    public String getApprvl_no(){
        return apprvl_no;
    }

    @ElVoField(physicalName = "apprvl_no")
    public void setApprvl_no(String apprvl_no){
        this.apprvl_no = apprvl_no;
    }

    @ElVoField(physicalName = "bf_total_amt")
    public long getBf_total_amt(){
        return bf_total_amt;
    }

    @ElVoField(physicalName = "bf_total_amt")
    public void setBf_total_amt(long bf_total_amt){
        this.bf_total_amt = bf_total_amt;
    }

    @ElVoField(physicalName = "bf_unslip_amt")
    public long getBf_unslip_amt(){
        return bf_unslip_amt;
    }

    @ElVoField(physicalName = "bf_unslip_amt")
    public void setBf_unslip_amt(long bf_unslip_amt){
        this.bf_unslip_amt = bf_unslip_amt;
    }

    @ElVoField(physicalName = "prmsnt_no")
    public String getPrmsnt_no(){
        return prmsnt_no;
    }

    @ElVoField(physicalName = "prmsnt_no")
    public void setPrmsnt_no(String prmsnt_no){
        this.prmsnt_no = prmsnt_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "evid_yn")
    public String getEvid_yn(){
        return evid_yn;
    }

    @ElVoField(physicalName = "evid_yn")
    public void setEvid_yn(String evid_yn){
        this.evid_yn = evid_yn;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public String getAccnt_cd_nm(){
        return accnt_cd_nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public void setAccnt_cd_nm(String accnt_cd_nm){
        this.accnt_cd_nm = accnt_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public String getConf_accnt_cd(){
        return conf_accnt_cd;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public void setConf_accnt_cd(String conf_accnt_cd){
        this.conf_accnt_cd = conf_accnt_cd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public String getMngmt_clsf(){
        return mngmt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public void setMngmt_clsf(String mngmt_clsf){
        this.mngmt_clsf = mngmt_clsf;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "regst_req_psn")
    public String getRegst_req_psn(){
        return regst_req_psn;
    }

    @ElVoField(physicalName = "regst_req_psn")
    public void setRegst_req_psn(String regst_req_psn){
        this.regst_req_psn = regst_req_psn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipDVo [");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("journ_cd").append("=").append(journ_cd).append(",");
        sb.append("journ_odr").append("=").append(journ_odr).append(",");
        sb.append("base_debit_cr").append("=").append(base_debit_cr).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("total_amt").append("=").append(total_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("ramt_mngmt_1").append("=").append(ramt_mngmt_1).append(",");
        sb.append("ramt_mngmt_2").append("=").append(ramt_mngmt_2).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("rmk_3").append("=").append(rmk_3).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("pay_clsf").append("=").append(pay_clsf).append(",");
        sb.append("occr_slip_no").append("=").append(occr_slip_no).append(",");
        sb.append("occr_slip_odr").append("=").append(occr_slip_odr).append(",");
        sb.append("bf_occr_slip_no").append("=").append(bf_occr_slip_no).append(",");
        sb.append("bf_occr_slip_odr").append("=").append(bf_occr_slip_odr).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("part_all_clsf").append("=").append(part_all_clsf).append(",");
        sb.append("accnt_no_clsf").append("=").append(accnt_no_clsf).append(",");
        sb.append("pay_accnt_cd").append("=").append(pay_accnt_cd).append(",");
        sb.append("rcms_pay_clsf").append("=").append(rcms_pay_clsf).append(",");
        sb.append("rcms_pay_state").append("=").append(rcms_pay_state).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("card_clsf").append("=").append(card_clsf).append(",");
        sb.append("card_knd").append("=").append(card_knd).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("apprvl_no").append("=").append(apprvl_no).append(",");
        sb.append("bf_total_amt").append("=").append(bf_total_amt).append(",");
        sb.append("bf_unslip_amt").append("=").append(bf_unslip_amt).append(",");
        sb.append("prmsnt_no").append("=").append(prmsnt_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("evid_yn").append("=").append(evid_yn).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_cd_nm").append("=").append(accnt_cd_nm).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("conf_accnt_cd").append("=").append(conf_accnt_cd).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("regst_req_psn").append("=").append(regst_req_psn);
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
