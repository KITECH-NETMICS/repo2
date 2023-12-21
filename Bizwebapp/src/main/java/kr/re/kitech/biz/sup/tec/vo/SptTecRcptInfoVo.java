package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원접수정보 Vo")
public class SptTecRcptInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecRcptInfoVo(){
    }

    @ElDtoField(logicalName = "기술지원의뢰번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "고객명(한글)", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "지역구분", physicalName = "region_centr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_centr;

    @ElDtoField(logicalName = "접수일자", physicalName = "rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_ymd;

    @ElDtoField(logicalName = "지원담당자", physicalName = "rcpt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_syspayno;

    @ElDtoField(logicalName = "지원책임자", physicalName = "supt_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_syspayno;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "지원팀", physicalName = "supt_team", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team;

    @ElDtoField(logicalName = "성적서구분", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "성적서발행구분", physicalName = "rst_book_issu_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu_info;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계산서발행일자", physicalName = "bill_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_issu_ymd;

    @ElDtoField(logicalName = "계산서발급정보", physicalName = "bill_issu_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_issu_info;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn;

    @ElDtoField(logicalName = "계정책임자개인번호", physicalName = "accnt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_empno;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_nm;

    @ElDtoField(logicalName = "성적서신청번호", physicalName = "rst_book_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_req_no;

    @ElDtoField(logicalName = "입금일자", physicalName = "depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_ymd;

    @ElDtoField(logicalName = "지원 건수", physicalName = "treat_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int treat_qty;

    @ElDtoField(logicalName = "신청 금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "확정 금액", physicalName = "decsn_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_amt;

    @ElDtoField(logicalName = "확정공급가", physicalName = "decsn_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_suply_value;

    @ElDtoField(logicalName = "확정세액", physicalName = "decsn_tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_tax_amt;

    @ElDtoField(logicalName = "가결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "할인율", physicalName = "discnt_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String discnt_rt;

    @ElDtoField(logicalName = "상담접수번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "장비사용여부", physicalName = "equip_use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_yn;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "완료요청일자", physicalName = "complt_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_req_ymd;

    @ElDtoField(logicalName = "완료예정일자 ", physicalName = "complt_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_schdl_ymd;

    @ElDtoField(logicalName = "입금예정일자", physicalName = "depst_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_schdl_ymd;

    @ElDtoField(logicalName = "입금계좌", physicalName = "depst_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bankaccnt_no;

    @ElDtoField(logicalName = "입금은행", physicalName = "depst_bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bank_cd;

    @ElDtoField(logicalName = "입금자명", physicalName = "depst_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_psn;

    @ElDtoField(logicalName = "사용용도", physicalName = "use_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_usg;

    @ElDtoField(logicalName = "시험방법및특이항목", physicalName = "test_way_and_unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test_way_and_unusual_item;

    @ElDtoField(logicalName = "카드승인번호", physicalName = "card_appl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_appl_no;

    @ElDtoField(logicalName = "카드승인일자", physicalName = "card_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_issu_ymd;

    @ElDtoField(logicalName = "결제증빙구분", physicalName = "proof_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String proof_yn;

    @ElDtoField(logicalName = "방문, 우편 접수", physicalName = "rece_states_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rece_states_cd;

    @ElDtoField(logicalName = "사유기재", physicalName = "rst_book_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_rmk;

    @ElDtoField(logicalName = "확정여부", physicalName = "decide_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decide_yn;

    @ElDtoField(logicalName = "교정주기", physicalName = "revsn_cycle", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revsn_cycle;

    @ElDtoField(logicalName = "교정장소", physicalName = "revsn_plc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String revsn_plc;

    @ElDtoField(logicalName = "시료처리분류", physicalName = "treat_prcs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String treat_prcs;

    @ElDtoField(logicalName = "성적서발행고객", physicalName = "rst_book_issu_cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu_cust_no;

    @ElDtoField(logicalName = "시험료지원구분", physicalName = "supt_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_work_clsf;

    @ElDtoField(logicalName = "완료일자", physicalName = "complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_ymd;

    @ElDtoField(logicalName = "지원책임자성명", physicalName = "supt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_nm;

    @ElDtoField(logicalName = "지원담당자성명", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "선택", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElDtoField(logicalName = "청구영수구분", physicalName = "demnd_recv_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf;

    @ElDtoField(logicalName = "RPA수행여부", physicalName = "rpa_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_yn;

    @ElDtoField(logicalName = "RPA수행결과", physicalName = "rpa_result_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_result_yn;

    @ElDtoField(logicalName = "RPA종류", physicalName = "rpa_evid_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_evid_clsf;

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "region_centr")
    public String getRegion_centr(){
        return region_centr;
    }

    @ElVoField(physicalName = "region_centr")
    public void setRegion_centr(String region_centr){
        this.region_centr = region_centr;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public String getRcpt_ymd(){
        return rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_ymd")
    public void setRcpt_ymd(String rcpt_ymd){
        this.rcpt_ymd = rcpt_ymd;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public String getRcpt_psn_syspayno(){
        return rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public void setRcpt_psn_syspayno(String rcpt_psn_syspayno){
        this.rcpt_psn_syspayno = rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public String getSupt_respn_syspayno(){
        return supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public void setSupt_respn_syspayno(String supt_respn_syspayno){
        this.supt_respn_syspayno = supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "supt_team")
    public String getSupt_team(){
        return supt_team;
    }

    @ElVoField(physicalName = "supt_team")
    public void setSupt_team(String supt_team){
        this.supt_team = supt_team;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu_info")
    public String getRst_book_issu_info(){
        return rst_book_issu_info;
    }

    @ElVoField(physicalName = "rst_book_issu_info")
    public void setRst_book_issu_info(String rst_book_issu_info){
        this.rst_book_issu_info = rst_book_issu_info;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "bill_issu_ymd")
    public String getBill_issu_ymd(){
        return bill_issu_ymd;
    }

    @ElVoField(physicalName = "bill_issu_ymd")
    public void setBill_issu_ymd(String bill_issu_ymd){
        this.bill_issu_ymd = bill_issu_ymd;
    }

    @ElVoField(physicalName = "bill_issu_info")
    public String getBill_issu_info(){
        return bill_issu_info;
    }

    @ElVoField(physicalName = "bill_issu_info")
    public void setBill_issu_info(String bill_issu_info){
        this.bill_issu_info = bill_issu_info;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_respn_psn")
    public String getAccnt_respn_psn(){
        return accnt_respn_psn;
    }

    @ElVoField(physicalName = "accnt_respn_psn")
    public void setAccnt_respn_psn(String accnt_respn_psn){
        this.accnt_respn_psn = accnt_respn_psn;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public String getAccnt_respn_empno(){
        return accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public void setAccnt_respn_empno(String accnt_respn_empno){
        this.accnt_respn_empno = accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public String getAccnt_respn_nm(){
        return accnt_respn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public void setAccnt_respn_nm(String accnt_respn_nm){
        this.accnt_respn_nm = accnt_respn_nm;
    }

    @ElVoField(physicalName = "rst_book_req_no")
    public String getRst_book_req_no(){
        return rst_book_req_no;
    }

    @ElVoField(physicalName = "rst_book_req_no")
    public void setRst_book_req_no(String rst_book_req_no){
        this.rst_book_req_no = rst_book_req_no;
    }

    @ElVoField(physicalName = "depst_ymd")
    public String getDepst_ymd(){
        return depst_ymd;
    }

    @ElVoField(physicalName = "depst_ymd")
    public void setDepst_ymd(String depst_ymd){
        this.depst_ymd = depst_ymd;
    }

    @ElVoField(physicalName = "treat_qty")
    public int getTreat_qty(){
        return treat_qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public void setTreat_qty(int treat_qty){
        this.treat_qty = treat_qty;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public long getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(long decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public long getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(long decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public long getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(long decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "discnt_rt")
    public String getDiscnt_rt(){
        return discnt_rt;
    }

    @ElVoField(physicalName = "discnt_rt")
    public void setDiscnt_rt(String discnt_rt){
        this.discnt_rt = discnt_rt;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "equip_use_yn")
    public String getEquip_use_yn(){
        return equip_use_yn;
    }

    @ElVoField(physicalName = "equip_use_yn")
    public void setEquip_use_yn(String equip_use_yn){
        this.equip_use_yn = equip_use_yn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "complt_req_ymd")
    public String getComplt_req_ymd(){
        return complt_req_ymd;
    }

    @ElVoField(physicalName = "complt_req_ymd")
    public void setComplt_req_ymd(String complt_req_ymd){
        this.complt_req_ymd = complt_req_ymd;
    }

    @ElVoField(physicalName = "complt_schdl_ymd")
    public String getComplt_schdl_ymd(){
        return complt_schdl_ymd;
    }

    @ElVoField(physicalName = "complt_schdl_ymd")
    public void setComplt_schdl_ymd(String complt_schdl_ymd){
        this.complt_schdl_ymd = complt_schdl_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public String getDepst_schdl_ymd(){
        return depst_schdl_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public void setDepst_schdl_ymd(String depst_schdl_ymd){
        this.depst_schdl_ymd = depst_schdl_ymd;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public String getDepst_bankaccnt_no(){
        return depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public void setDepst_bankaccnt_no(String depst_bankaccnt_no){
        this.depst_bankaccnt_no = depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "depst_bank_cd")
    public String getDepst_bank_cd(){
        return depst_bank_cd;
    }

    @ElVoField(physicalName = "depst_bank_cd")
    public void setDepst_bank_cd(String depst_bank_cd){
        this.depst_bank_cd = depst_bank_cd;
    }

    @ElVoField(physicalName = "depst_psn")
    public String getDepst_psn(){
        return depst_psn;
    }

    @ElVoField(physicalName = "depst_psn")
    public void setDepst_psn(String depst_psn){
        this.depst_psn = depst_psn;
    }

    @ElVoField(physicalName = "use_usg")
    public String getUse_usg(){
        return use_usg;
    }

    @ElVoField(physicalName = "use_usg")
    public void setUse_usg(String use_usg){
        this.use_usg = use_usg;
    }

    @ElVoField(physicalName = "test_way_and_unusual_item")
    public String getTest_way_and_unusual_item(){
        return test_way_and_unusual_item;
    }

    @ElVoField(physicalName = "test_way_and_unusual_item")
    public void setTest_way_and_unusual_item(String test_way_and_unusual_item){
        this.test_way_and_unusual_item = test_way_and_unusual_item;
    }

    @ElVoField(physicalName = "card_appl_no")
    public String getCard_appl_no(){
        return card_appl_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public void setCard_appl_no(String card_appl_no){
        this.card_appl_no = card_appl_no;
    }

    @ElVoField(physicalName = "card_issu_ymd")
    public String getCard_issu_ymd(){
        return card_issu_ymd;
    }

    @ElVoField(physicalName = "card_issu_ymd")
    public void setCard_issu_ymd(String card_issu_ymd){
        this.card_issu_ymd = card_issu_ymd;
    }

    @ElVoField(physicalName = "proof_yn")
    public String getProof_yn(){
        return proof_yn;
    }

    @ElVoField(physicalName = "proof_yn")
    public void setProof_yn(String proof_yn){
        this.proof_yn = proof_yn;
    }

    @ElVoField(physicalName = "rece_states_cd")
    public String getRece_states_cd(){
        return rece_states_cd;
    }

    @ElVoField(physicalName = "rece_states_cd")
    public void setRece_states_cd(String rece_states_cd){
        this.rece_states_cd = rece_states_cd;
    }

    @ElVoField(physicalName = "rst_book_rmk")
    public String getRst_book_rmk(){
        return rst_book_rmk;
    }

    @ElVoField(physicalName = "rst_book_rmk")
    public void setRst_book_rmk(String rst_book_rmk){
        this.rst_book_rmk = rst_book_rmk;
    }

    @ElVoField(physicalName = "decide_yn")
    public String getDecide_yn(){
        return decide_yn;
    }

    @ElVoField(physicalName = "decide_yn")
    public void setDecide_yn(String decide_yn){
        this.decide_yn = decide_yn;
    }

    @ElVoField(physicalName = "revsn_cycle")
    public String getRevsn_cycle(){
        return revsn_cycle;
    }

    @ElVoField(physicalName = "revsn_cycle")
    public void setRevsn_cycle(String revsn_cycle){
        this.revsn_cycle = revsn_cycle;
    }

    @ElVoField(physicalName = "revsn_plc")
    public String getRevsn_plc(){
        return revsn_plc;
    }

    @ElVoField(physicalName = "revsn_plc")
    public void setRevsn_plc(String revsn_plc){
        this.revsn_plc = revsn_plc;
    }

    @ElVoField(physicalName = "treat_prcs")
    public String getTreat_prcs(){
        return treat_prcs;
    }

    @ElVoField(physicalName = "treat_prcs")
    public void setTreat_prcs(String treat_prcs){
        this.treat_prcs = treat_prcs;
    }

    @ElVoField(physicalName = "rst_book_issu_cust_no")
    public String getRst_book_issu_cust_no(){
        return rst_book_issu_cust_no;
    }

    @ElVoField(physicalName = "rst_book_issu_cust_no")
    public void setRst_book_issu_cust_no(String rst_book_issu_cust_no){
        this.rst_book_issu_cust_no = rst_book_issu_cust_no;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public String getSupt_work_clsf(){
        return supt_work_clsf;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public void setSupt_work_clsf(String supt_work_clsf){
        this.supt_work_clsf = supt_work_clsf;
    }

    @ElVoField(physicalName = "complt_ymd")
    public String getComplt_ymd(){
        return complt_ymd;
    }

    @ElVoField(physicalName = "complt_ymd")
    public void setComplt_ymd(String complt_ymd){
        this.complt_ymd = complt_ymd;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public String getSupt_respn_nm(){
        return supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public void setSupt_respn_nm(String supt_respn_nm){
        this.supt_respn_nm = supt_respn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public String getDemnd_recv_clsf(){
        return demnd_recv_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public void setDemnd_recv_clsf(String demnd_recv_clsf){
        this.demnd_recv_clsf = demnd_recv_clsf;
    }

    @ElVoField(physicalName = "rpa_yn")
    public String getRpa_yn(){
        return rpa_yn;
    }

    @ElVoField(physicalName = "rpa_yn")
    public void setRpa_yn(String rpa_yn){
        this.rpa_yn = rpa_yn;
    }

    @ElVoField(physicalName = "rpa_result_yn")
    public String getRpa_result_yn(){
        return rpa_result_yn;
    }

    @ElVoField(physicalName = "rpa_result_yn")
    public void setRpa_result_yn(String rpa_result_yn){
        this.rpa_result_yn = rpa_result_yn;
    }

    @ElVoField(physicalName = "rpa_evid_clsf")
    public String getRpa_evid_clsf(){
        return rpa_evid_clsf;
    }

    @ElVoField(physicalName = "rpa_evid_clsf")
    public void setRpa_evid_clsf(String rpa_evid_clsf){
        this.rpa_evid_clsf = rpa_evid_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRcptInfoVo [");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("region_centr").append("=").append(region_centr).append(",");
        sb.append("rcpt_ymd").append("=").append(rcpt_ymd).append(",");
        sb.append("rcpt_psn_syspayno").append("=").append(rcpt_psn_syspayno).append(",");
        sb.append("supt_respn_syspayno").append("=").append(supt_respn_syspayno).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("supt_team").append("=").append(supt_team).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("rst_book_issu_info").append("=").append(rst_book_issu_info).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("bill_issu_ymd").append("=").append(bill_issu_ymd).append(",");
        sb.append("bill_issu_info").append("=").append(bill_issu_info).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_respn_psn").append("=").append(accnt_respn_psn).append(",");
        sb.append("accnt_respn_empno").append("=").append(accnt_respn_empno).append(",");
        sb.append("accnt_respn_nm").append("=").append(accnt_respn_nm).append(",");
        sb.append("rst_book_req_no").append("=").append(rst_book_req_no).append(",");
        sb.append("depst_ymd").append("=").append(depst_ymd).append(",");
        sb.append("treat_qty").append("=").append(treat_qty).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("discnt_rt").append("=").append(discnt_rt).append(",");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("equip_use_yn").append("=").append(equip_use_yn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("complt_req_ymd").append("=").append(complt_req_ymd).append(",");
        sb.append("complt_schdl_ymd").append("=").append(complt_schdl_ymd).append(",");
        sb.append("depst_schdl_ymd").append("=").append(depst_schdl_ymd).append(",");
        sb.append("depst_bankaccnt_no").append("=").append(depst_bankaccnt_no).append(",");
        sb.append("depst_bank_cd").append("=").append(depst_bank_cd).append(",");
        sb.append("depst_psn").append("=").append(depst_psn).append(",");
        sb.append("use_usg").append("=").append(use_usg).append(",");
        sb.append("test_way_and_unusual_item").append("=").append(test_way_and_unusual_item).append(",");
        sb.append("card_appl_no").append("=").append(card_appl_no).append(",");
        sb.append("card_issu_ymd").append("=").append(card_issu_ymd).append(",");
        sb.append("proof_yn").append("=").append(proof_yn).append(",");
        sb.append("rece_states_cd").append("=").append(rece_states_cd).append(",");
        sb.append("rst_book_rmk").append("=").append(rst_book_rmk).append(",");
        sb.append("decide_yn").append("=").append(decide_yn).append(",");
        sb.append("revsn_cycle").append("=").append(revsn_cycle).append(",");
        sb.append("revsn_plc").append("=").append(revsn_plc).append(",");
        sb.append("treat_prcs").append("=").append(treat_prcs).append(",");
        sb.append("rst_book_issu_cust_no").append("=").append(rst_book_issu_cust_no).append(",");
        sb.append("supt_work_clsf").append("=").append(supt_work_clsf).append(",");
        sb.append("complt_ymd").append("=").append(complt_ymd).append(",");
        sb.append("supt_respn_nm").append("=").append(supt_respn_nm).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("chk").append("=").append(chk).append(",");
        sb.append("demnd_recv_clsf").append("=").append(demnd_recv_clsf).append(",");
        sb.append("rpa_yn").append("=").append(rpa_yn).append(",");
        sb.append("rpa_result_yn").append("=").append(rpa_result_yn).append(",");
        sb.append("rpa_evid_clsf").append("=").append(rpa_evid_clsf);
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
