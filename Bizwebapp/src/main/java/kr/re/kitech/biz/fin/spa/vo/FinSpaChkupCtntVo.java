package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재무결의-소액물품검수 Vo")
public class FinSpaChkupCtntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinSpaChkupCtntVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "검사자", physicalName = "check_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_psn;

    @ElDtoField(logicalName = "검사자개인번호", physicalName = "check_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_empno;

    @ElDtoField(logicalName = "검사자성명", physicalName = "check_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_nm;

    @ElDtoField(logicalName = "검사자부서", physicalName = "check_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_dept;

    @ElDtoField(logicalName = "검사자부서신설일자", physicalName = "check_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_dept_new_ymd;

    @ElDtoField(logicalName = "검사자부서명", physicalName = "check_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_dept_nm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "검수입회자", physicalName = "entsch_check_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_psn;

    @ElDtoField(logicalName = "검수입회자성명", physicalName = "entsch_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_psn_nm;

    @ElDtoField(logicalName = "검수입회자 개인번호", physicalName = "entsch_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_psn_empno;

    @ElDtoField(logicalName = "입회검수일자", physicalName = "entsch_check_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_ymd;

    @ElDtoField(logicalName = "입회검수자부서", physicalName = "entsch_check_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_dept;

    @ElDtoField(logicalName = "입회검수자부서명", physicalName = "entsch_check_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_dept_nm;

    @ElDtoField(logicalName = "입회검수자직책", physicalName = "entsch_psn_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_psn_posi_nm;

    @ElDtoField(logicalName = "입회검수자부서신설일자", physicalName = "entsch_check_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_dept_new_ymd;

    @ElDtoField(logicalName = "화학물질포함여부", physicalName = "msds_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msds_yn;

    @ElDtoField(logicalName = "방사선장비여부", physicalName = "rad_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rad_yn;

    @ElDtoField(logicalName = "방사선종류", physicalName = "rad_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rad_knd;

    @ElDtoField(logicalName = "기술장비/컴퓨터관련여부", physicalName = "equip_doc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_doc_yn;

    @ElDtoField(logicalName = "기술장비등록여부", physicalName = "equip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_yn;

    @ElDtoField(logicalName = "연구기자재순번", physicalName = "equip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_odr;

    @ElDtoField(logicalName = "자산등재대상여부", physicalName = "aset_reg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_reg;

    @ElDtoField(logicalName = "ZEUS등록번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "거래처", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "공급가액", physicalName = "chrg_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long chrg_amt;

    @ElDtoField(logicalName = "부가세", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "취득금액", physicalName = "check_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_amt;

    @ElDtoField(logicalName = "검수일자", physicalName = "check_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_ymd;

    @ElDtoField(logicalName = "납품일자", physicalName = "delvr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_ymd;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "관리구분", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "계정시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "과세여부", physicalName = "tax_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_nm;

    @ElDtoField(logicalName = "설치지역", physicalName = "instl_posi_region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_region_cd;

    @ElDtoField(logicalName = "설치위치(건물)", physicalName = "instl_posi_build_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_build_cd;

    @ElDtoField(logicalName = "설치위치(층)", physicalName = "instl_posi_floor_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_floor_cd;

    @ElDtoField(logicalName = "설치위치(호수)", physicalName = "instl_posi_editno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String instl_posi_editno;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "사진첨부파일번호", physicalName = "attach_photo_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_photo_file;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "사진첨부파일(구)", physicalName = "photo_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String photo_attach_file_no;

    @ElDtoField(logicalName = "기타(결제)첨부파일", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "사전검토신청번호", physicalName = "safe_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String safe_req_no;

    @ElDtoField(logicalName = "검사(결재)자", physicalName = "inspect_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_psn;

    @ElDtoField(logicalName = "검사(결재)자명", physicalName = "inspect_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_psn_nm;

    @ElDtoField(logicalName = "검사(결재)자 부서", physicalName = "inspect_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_dept;

    @ElDtoField(logicalName = "검사(결재)자 부서명", physicalName = "inspect_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_dept_nm;

    @ElDtoField(logicalName = "검사(결재)자 직책", physicalName = "inspect_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_posi_nm;

    @ElDtoField(logicalName = "검사(결재)자 부서신설일자", physicalName = "inspect_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_dept_new_ymd;

    @ElDtoField(logicalName = "검사(결재)일자", physicalName = "inspect_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inspect_ymd;

    @ElDtoField(logicalName = "통제내역 신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "통제내역 신청순번", physicalName = "req_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_seq;

    @ElDtoField(logicalName = "검수상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결의상태", physicalName = "unslip_apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_apr_state;

    @ElDtoField(logicalName = "구분", physicalName = "pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_clsf;

    @ElDtoField(logicalName = "입력상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "메세지", physicalName = "msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msg;

    @ElDtoField(logicalName = "연구담당자", physicalName = "res_man", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_man;

    @ElDtoField(logicalName = "결의생성 담당자", physicalName = "fin_manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_manager;

    @ElDtoField(logicalName = "결의생성 담당자 개인번호", physicalName = "fin_manager_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_manager_empno;

    @ElDtoField(logicalName = "결의생성 담당자 성명", physicalName = "fin_manager_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_manager_nm;

    @ElDtoField(logicalName = "연구지원담당자(결의생성담당자)", physicalName = "dept_res_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_res_psn;

    @ElDtoField(logicalName = "카드번호", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "승인번호", physicalName = "apprvl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_no;

    @ElDtoField(logicalName = "승인일시", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ymd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "기타(결제)정보", physicalName = "etc_pay_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_pay_info;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "check_psn")
    public String getCheck_psn(){
        return check_psn;
    }

    @ElVoField(physicalName = "check_psn")
    public void setCheck_psn(String check_psn){
        this.check_psn = check_psn;
    }

    @ElVoField(physicalName = "check_empno")
    public String getCheck_empno(){
        return check_empno;
    }

    @ElVoField(physicalName = "check_empno")
    public void setCheck_empno(String check_empno){
        this.check_empno = check_empno;
    }

    @ElVoField(physicalName = "check_nm")
    public String getCheck_nm(){
        return check_nm;
    }

    @ElVoField(physicalName = "check_nm")
    public void setCheck_nm(String check_nm){
        this.check_nm = check_nm;
    }

    @ElVoField(physicalName = "check_dept")
    public String getCheck_dept(){
        return check_dept;
    }

    @ElVoField(physicalName = "check_dept")
    public void setCheck_dept(String check_dept){
        this.check_dept = check_dept;
    }

    @ElVoField(physicalName = "check_dept_new_ymd")
    public String getCheck_dept_new_ymd(){
        return check_dept_new_ymd;
    }

    @ElVoField(physicalName = "check_dept_new_ymd")
    public void setCheck_dept_new_ymd(String check_dept_new_ymd){
        this.check_dept_new_ymd = check_dept_new_ymd;
    }

    @ElVoField(physicalName = "check_dept_nm")
    public String getCheck_dept_nm(){
        return check_dept_nm;
    }

    @ElVoField(physicalName = "check_dept_nm")
    public void setCheck_dept_nm(String check_dept_nm){
        this.check_dept_nm = check_dept_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "entsch_check_psn")
    public String getEntsch_check_psn(){
        return entsch_check_psn;
    }

    @ElVoField(physicalName = "entsch_check_psn")
    public void setEntsch_check_psn(String entsch_check_psn){
        this.entsch_check_psn = entsch_check_psn;
    }

    @ElVoField(physicalName = "entsch_psn_nm")
    public String getEntsch_psn_nm(){
        return entsch_psn_nm;
    }

    @ElVoField(physicalName = "entsch_psn_nm")
    public void setEntsch_psn_nm(String entsch_psn_nm){
        this.entsch_psn_nm = entsch_psn_nm;
    }

    @ElVoField(physicalName = "entsch_psn_empno")
    public String getEntsch_psn_empno(){
        return entsch_psn_empno;
    }

    @ElVoField(physicalName = "entsch_psn_empno")
    public void setEntsch_psn_empno(String entsch_psn_empno){
        this.entsch_psn_empno = entsch_psn_empno;
    }

    @ElVoField(physicalName = "entsch_check_ymd")
    public String getEntsch_check_ymd(){
        return entsch_check_ymd;
    }

    @ElVoField(physicalName = "entsch_check_ymd")
    public void setEntsch_check_ymd(String entsch_check_ymd){
        this.entsch_check_ymd = entsch_check_ymd;
    }

    @ElVoField(physicalName = "entsch_check_dept")
    public String getEntsch_check_dept(){
        return entsch_check_dept;
    }

    @ElVoField(physicalName = "entsch_check_dept")
    public void setEntsch_check_dept(String entsch_check_dept){
        this.entsch_check_dept = entsch_check_dept;
    }

    @ElVoField(physicalName = "entsch_check_dept_nm")
    public String getEntsch_check_dept_nm(){
        return entsch_check_dept_nm;
    }

    @ElVoField(physicalName = "entsch_check_dept_nm")
    public void setEntsch_check_dept_nm(String entsch_check_dept_nm){
        this.entsch_check_dept_nm = entsch_check_dept_nm;
    }

    @ElVoField(physicalName = "entsch_psn_posi_nm")
    public String getEntsch_psn_posi_nm(){
        return entsch_psn_posi_nm;
    }

    @ElVoField(physicalName = "entsch_psn_posi_nm")
    public void setEntsch_psn_posi_nm(String entsch_psn_posi_nm){
        this.entsch_psn_posi_nm = entsch_psn_posi_nm;
    }

    @ElVoField(physicalName = "entsch_check_dept_new_ymd")
    public String getEntsch_check_dept_new_ymd(){
        return entsch_check_dept_new_ymd;
    }

    @ElVoField(physicalName = "entsch_check_dept_new_ymd")
    public void setEntsch_check_dept_new_ymd(String entsch_check_dept_new_ymd){
        this.entsch_check_dept_new_ymd = entsch_check_dept_new_ymd;
    }

    @ElVoField(physicalName = "msds_yn")
    public String getMsds_yn(){
        return msds_yn;
    }

    @ElVoField(physicalName = "msds_yn")
    public void setMsds_yn(String msds_yn){
        this.msds_yn = msds_yn;
    }

    @ElVoField(physicalName = "rad_yn")
    public String getRad_yn(){
        return rad_yn;
    }

    @ElVoField(physicalName = "rad_yn")
    public void setRad_yn(String rad_yn){
        this.rad_yn = rad_yn;
    }

    @ElVoField(physicalName = "rad_knd")
    public String getRad_knd(){
        return rad_knd;
    }

    @ElVoField(physicalName = "rad_knd")
    public void setRad_knd(String rad_knd){
        this.rad_knd = rad_knd;
    }

    @ElVoField(physicalName = "equip_doc_yn")
    public String getEquip_doc_yn(){
        return equip_doc_yn;
    }

    @ElVoField(physicalName = "equip_doc_yn")
    public void setEquip_doc_yn(String equip_doc_yn){
        this.equip_doc_yn = equip_doc_yn;
    }

    @ElVoField(physicalName = "equip_yn")
    public String getEquip_yn(){
        return equip_yn;
    }

    @ElVoField(physicalName = "equip_yn")
    public void setEquip_yn(String equip_yn){
        this.equip_yn = equip_yn;
    }

    @ElVoField(physicalName = "equip_odr")
    public String getEquip_odr(){
        return equip_odr;
    }

    @ElVoField(physicalName = "equip_odr")
    public void setEquip_odr(String equip_odr){
        this.equip_odr = equip_odr;
    }

    @ElVoField(physicalName = "aset_reg")
    public String getAset_reg(){
        return aset_reg;
    }

    @ElVoField(physicalName = "aset_reg")
    public void setAset_reg(String aset_reg){
        this.aset_reg = aset_reg;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
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

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "chrg_amt")
    public long getChrg_amt(){
        return chrg_amt;
    }

    @ElVoField(physicalName = "chrg_amt")
    public void setChrg_amt(long chrg_amt){
        this.chrg_amt = chrg_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public long getCheck_amt(){
        return check_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public void setCheck_amt(long check_amt){
        this.check_amt = check_amt;
    }

    @ElVoField(physicalName = "check_ymd")
    public String getCheck_ymd(){
        return check_ymd;
    }

    @ElVoField(physicalName = "check_ymd")
    public void setCheck_ymd(String check_ymd){
        this.check_ymd = check_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public String getDelvr_ymd(){
        return delvr_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public void setDelvr_ymd(String delvr_ymd){
        this.delvr_ymd = delvr_ymd;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
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

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "tax_nm")
    public String getTax_nm(){
        return tax_nm;
    }

    @ElVoField(physicalName = "tax_nm")
    public void setTax_nm(String tax_nm){
        this.tax_nm = tax_nm;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public String getInstl_posi_region_cd(){
        return instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_region_cd")
    public void setInstl_posi_region_cd(String instl_posi_region_cd){
        this.instl_posi_region_cd = instl_posi_region_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public String getInstl_posi_build_cd(){
        return instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_build_cd")
    public void setInstl_posi_build_cd(String instl_posi_build_cd){
        this.instl_posi_build_cd = instl_posi_build_cd;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public String getInstl_posi_floor_cd(){
        return instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_floor_cd")
    public void setInstl_posi_floor_cd(String instl_posi_floor_cd){
        this.instl_posi_floor_cd = instl_posi_floor_cd;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public String getInstl_posi_editno(){
        return instl_posi_editno;
    }

    @ElVoField(physicalName = "instl_posi_editno")
    public void setInstl_posi_editno(String instl_posi_editno){
        this.instl_posi_editno = instl_posi_editno;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_photo_file")
    public String getAttach_photo_file(){
        return attach_photo_file;
    }

    @ElVoField(physicalName = "attach_photo_file")
    public void setAttach_photo_file(String attach_photo_file){
        this.attach_photo_file = attach_photo_file;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "photo_attach_file_no")
    public String getPhoto_attach_file_no(){
        return photo_attach_file_no;
    }

    @ElVoField(physicalName = "photo_attach_file_no")
    public void setPhoto_attach_file_no(String photo_attach_file_no){
        this.photo_attach_file_no = photo_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public String getEtc_attach_file_no(){
        return etc_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public void setEtc_attach_file_no(String etc_attach_file_no){
        this.etc_attach_file_no = etc_attach_file_no;
    }

    @ElVoField(physicalName = "safe_req_no")
    public String getSafe_req_no(){
        return safe_req_no;
    }

    @ElVoField(physicalName = "safe_req_no")
    public void setSafe_req_no(String safe_req_no){
        this.safe_req_no = safe_req_no;
    }

    @ElVoField(physicalName = "inspect_psn")
    public String getInspect_psn(){
        return inspect_psn;
    }

    @ElVoField(physicalName = "inspect_psn")
    public void setInspect_psn(String inspect_psn){
        this.inspect_psn = inspect_psn;
    }

    @ElVoField(physicalName = "inspect_psn_nm")
    public String getInspect_psn_nm(){
        return inspect_psn_nm;
    }

    @ElVoField(physicalName = "inspect_psn_nm")
    public void setInspect_psn_nm(String inspect_psn_nm){
        this.inspect_psn_nm = inspect_psn_nm;
    }

    @ElVoField(physicalName = "inspect_dept")
    public String getInspect_dept(){
        return inspect_dept;
    }

    @ElVoField(physicalName = "inspect_dept")
    public void setInspect_dept(String inspect_dept){
        this.inspect_dept = inspect_dept;
    }

    @ElVoField(physicalName = "inspect_dept_nm")
    public String getInspect_dept_nm(){
        return inspect_dept_nm;
    }

    @ElVoField(physicalName = "inspect_dept_nm")
    public void setInspect_dept_nm(String inspect_dept_nm){
        this.inspect_dept_nm = inspect_dept_nm;
    }

    @ElVoField(physicalName = "inspect_posi_nm")
    public String getInspect_posi_nm(){
        return inspect_posi_nm;
    }

    @ElVoField(physicalName = "inspect_posi_nm")
    public void setInspect_posi_nm(String inspect_posi_nm){
        this.inspect_posi_nm = inspect_posi_nm;
    }

    @ElVoField(physicalName = "inspect_dept_new_ymd")
    public String getInspect_dept_new_ymd(){
        return inspect_dept_new_ymd;
    }

    @ElVoField(physicalName = "inspect_dept_new_ymd")
    public void setInspect_dept_new_ymd(String inspect_dept_new_ymd){
        this.inspect_dept_new_ymd = inspect_dept_new_ymd;
    }

    @ElVoField(physicalName = "inspect_ymd")
    public String getInspect_ymd(){
        return inspect_ymd;
    }

    @ElVoField(physicalName = "inspect_ymd")
    public void setInspect_ymd(String inspect_ymd){
        this.inspect_ymd = inspect_ymd;
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
    public String getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(String req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "unslip_apr_state")
    public String getUnslip_apr_state(){
        return unslip_apr_state;
    }

    @ElVoField(physicalName = "unslip_apr_state")
    public void setUnslip_apr_state(String unslip_apr_state){
        this.unslip_apr_state = unslip_apr_state;
    }

    @ElVoField(physicalName = "pay_clsf")
    public String getPay_clsf(){
        return pay_clsf;
    }

    @ElVoField(physicalName = "pay_clsf")
    public void setPay_clsf(String pay_clsf){
        this.pay_clsf = pay_clsf;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "msg")
    public String getMsg(){
        return msg;
    }

    @ElVoField(physicalName = "msg")
    public void setMsg(String msg){
        this.msg = msg;
    }

    @ElVoField(physicalName = "res_man")
    public String getRes_man(){
        return res_man;
    }

    @ElVoField(physicalName = "res_man")
    public void setRes_man(String res_man){
        this.res_man = res_man;
    }

    @ElVoField(physicalName = "fin_manager")
    public String getFin_manager(){
        return fin_manager;
    }

    @ElVoField(physicalName = "fin_manager")
    public void setFin_manager(String fin_manager){
        this.fin_manager = fin_manager;
    }

    @ElVoField(physicalName = "fin_manager_empno")
    public String getFin_manager_empno(){
        return fin_manager_empno;
    }

    @ElVoField(physicalName = "fin_manager_empno")
    public void setFin_manager_empno(String fin_manager_empno){
        this.fin_manager_empno = fin_manager_empno;
    }

    @ElVoField(physicalName = "fin_manager_nm")
    public String getFin_manager_nm(){
        return fin_manager_nm;
    }

    @ElVoField(physicalName = "fin_manager_nm")
    public void setFin_manager_nm(String fin_manager_nm){
        this.fin_manager_nm = fin_manager_nm;
    }

    @ElVoField(physicalName = "dept_res_psn")
    public String getDept_res_psn(){
        return dept_res_psn;
    }

    @ElVoField(physicalName = "dept_res_psn")
    public void setDept_res_psn(String dept_res_psn){
        this.dept_res_psn = dept_res_psn;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "apprvl_no")
    public String getApprvl_no(){
        return apprvl_no;
    }

    @ElVoField(physicalName = "apprvl_no")
    public void setApprvl_no(String apprvl_no){
        this.apprvl_no = apprvl_no;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        return use_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "etc_pay_info")
    public String getEtc_pay_info(){
        return etc_pay_info;
    }

    @ElVoField(physicalName = "etc_pay_info")
    public void setEtc_pay_info(String etc_pay_info){
        this.etc_pay_info = etc_pay_info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinSpaChkupCtntVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("check_psn").append("=").append(check_psn).append(",");
        sb.append("check_empno").append("=").append(check_empno).append(",");
        sb.append("check_nm").append("=").append(check_nm).append(",");
        sb.append("check_dept").append("=").append(check_dept).append(",");
        sb.append("check_dept_new_ymd").append("=").append(check_dept_new_ymd).append(",");
        sb.append("check_dept_nm").append("=").append(check_dept_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("entsch_check_psn").append("=").append(entsch_check_psn).append(",");
        sb.append("entsch_psn_nm").append("=").append(entsch_psn_nm).append(",");
        sb.append("entsch_psn_empno").append("=").append(entsch_psn_empno).append(",");
        sb.append("entsch_check_ymd").append("=").append(entsch_check_ymd).append(",");
        sb.append("entsch_check_dept").append("=").append(entsch_check_dept).append(",");
        sb.append("entsch_check_dept_nm").append("=").append(entsch_check_dept_nm).append(",");
        sb.append("entsch_psn_posi_nm").append("=").append(entsch_psn_posi_nm).append(",");
        sb.append("entsch_check_dept_new_ymd").append("=").append(entsch_check_dept_new_ymd).append(",");
        sb.append("msds_yn").append("=").append(msds_yn).append(",");
        sb.append("rad_yn").append("=").append(rad_yn).append(",");
        sb.append("rad_knd").append("=").append(rad_knd).append(",");
        sb.append("equip_doc_yn").append("=").append(equip_doc_yn).append(",");
        sb.append("equip_yn").append("=").append(equip_yn).append(",");
        sb.append("equip_odr").append("=").append(equip_odr).append(",");
        sb.append("aset_reg").append("=").append(aset_reg).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("check_amt").append("=").append(check_amt).append(",");
        sb.append("check_ymd").append("=").append(check_ymd).append(",");
        sb.append("delvr_ymd").append("=").append(delvr_ymd).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("tax_nm").append("=").append(tax_nm).append(",");
        sb.append("instl_posi_region_cd").append("=").append(instl_posi_region_cd).append(",");
        sb.append("instl_posi_build_cd").append("=").append(instl_posi_build_cd).append(",");
        sb.append("instl_posi_floor_cd").append("=").append(instl_posi_floor_cd).append(",");
        sb.append("instl_posi_editno").append("=").append(instl_posi_editno).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_photo_file").append("=").append(attach_photo_file).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("photo_attach_file_no").append("=").append(photo_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("safe_req_no").append("=").append(safe_req_no).append(",");
        sb.append("inspect_psn").append("=").append(inspect_psn).append(",");
        sb.append("inspect_psn_nm").append("=").append(inspect_psn_nm).append(",");
        sb.append("inspect_dept").append("=").append(inspect_dept).append(",");
        sb.append("inspect_dept_nm").append("=").append(inspect_dept_nm).append(",");
        sb.append("inspect_posi_nm").append("=").append(inspect_posi_nm).append(",");
        sb.append("inspect_dept_new_ymd").append("=").append(inspect_dept_new_ymd).append(",");
        sb.append("inspect_ymd").append("=").append(inspect_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("unslip_apr_state").append("=").append(unslip_apr_state).append(",");
        sb.append("pay_clsf").append("=").append(pay_clsf).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("msg").append("=").append(msg).append(",");
        sb.append("res_man").append("=").append(res_man).append(",");
        sb.append("fin_manager").append("=").append(fin_manager).append(",");
        sb.append("fin_manager_empno").append("=").append(fin_manager_empno).append(",");
        sb.append("fin_manager_nm").append("=").append(fin_manager_nm).append(",");
        sb.append("dept_res_psn").append("=").append(dept_res_psn).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("apprvl_no").append("=").append(apprvl_no).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("etc_pay_info").append("=").append(etc_pay_info);
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
