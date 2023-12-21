package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매입계산서 Vo")
public class KtxIssuMstrVo extends kr.re.kitech.biz.fin.spm.vo.KtxIssuMstrComVo {
    private static final long serialVersionUID = 1L;

    public KtxIssuMstrVo(){
    }

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "미처리금액", physicalName = "un_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long un_amt;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "증빙코드", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "예금주", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "은행", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "세금계산서종류", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "세금계산서종류명", physicalName = "tax_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type_nm;

    @ElDtoField(logicalName = "영수/청구구분", physicalName = "pops_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_code;

    @ElDtoField(logicalName = "영수/청구구분명", physicalName = "pops_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_nm;

    @ElDtoField(logicalName = "수정코드", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "수정사유", physicalName = "mody_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_cause;

    @ElDtoField(logicalName = "노트1", physicalName = "note1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note1;

    @ElDtoField(logicalName = "노트2", physicalName = "note2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note2;

    @ElDtoField(logicalName = "노트3", physicalName = "note3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note3;

    @ElDtoField(logicalName = "수입신고번호", physicalName = "impt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impt_no;

    @ElDtoField(logicalName = "일괄발급시작일", physicalName = "acep_stat_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acep_stat_date;

    @ElDtoField(logicalName = "일괄발급종료일", physicalName = "acep_end_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acep_end_date;

    @ElDtoField(logicalName = "수입총건", physicalName = "item_quant", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_quant;

    @ElDtoField(logicalName = "공급자사업자번호", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no;

    @ElDtoField(logicalName = "공급자상호", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_nm;

    @ElDtoField(logicalName = "공급자거래처코드", physicalName = "selr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_code;

    @ElDtoField(logicalName = "공급자대표자명", physicalName = "selr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_ceo;

    @ElDtoField(logicalName = "공급자주소", physicalName = "selr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_addr;

    @ElDtoField(logicalName = "공급자업태", physicalName = "selr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_cons;

    @ElDtoField(logicalName = "공급자업종", physicalName = "selr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_type;

    @ElDtoField(logicalName = "공급받는자 사업자번호", physicalName = "buyr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_no;

    @ElDtoField(logicalName = "공급받는자 거래처코드", physicalName = "buyr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_code;

    @ElDtoField(logicalName = "공급받는자상호", physicalName = "buyr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_nm;

    @ElDtoField(logicalName = "공급받는자대표자명", physicalName = "buyr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_ceo;

    @ElDtoField(logicalName = "공급받는자주소", physicalName = "buyr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_addr;

    @ElDtoField(logicalName = "공급받는자업태", physicalName = "buyr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_cons;

    @ElDtoField(logicalName = "공급받는자업종", physicalName = "buyr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_type;

    @ElDtoField(logicalName = "금액1(현금)", physicalName = "pamt_amt1", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt1;

    @ElDtoField(logicalName = "금액2(수표)", physicalName = "pamt_amt2", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt2;

    @ElDtoField(logicalName = "금액3(어음)", physicalName = "pamt_amt3", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt3;

    @ElDtoField(logicalName = "금액4(외상미수금)", physicalName = "pamt_amt4", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt4;

    @ElDtoField(logicalName = "매출/매입구분", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "등록일시", physicalName = "creation_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creation_date;

    @ElDtoField(logicalName = "공공요금여부", physicalName = "public_amt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String public_amt_yn;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "공급자담당부서명", physicalName = "selr_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_post;

    @ElDtoField(logicalName = "공급자담당자전화번호", physicalName = "selr_chrg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_tel;

    @ElDtoField(logicalName = "공급자담당자명", physicalName = "selr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_nm;

    @ElDtoField(logicalName = "공급자담당자이메일", physicalName = "selr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_email;

    @ElDtoField(logicalName = "공급받는자구분코드", physicalName = "buyr_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_gb;

    @ElDtoField(logicalName = "공급받는자담당자부서명1", physicalName = "buyr_chrg_post1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post1;

    @ElDtoField(logicalName = "공급받는자담당자명1", physicalName = "buyr_chrg_nm1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm1;

    @ElDtoField(logicalName = "공급받는자담당자전화번호1", physicalName = "buyr_chrg_tel1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_tel1;

    @ElDtoField(logicalName = "공급받는자담당자이메일1", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "공급받는자담당자부서명2", physicalName = "buyr_chrg_post2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post2;

    @ElDtoField(logicalName = "공급받는자담당자명2", physicalName = "buyr_chrg_nm2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm2;

    @ElDtoField(logicalName = "공급받는자담당자전화번호2", physicalName = "buyr_chrg_tel2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_tel2;

    @ElDtoField(logicalName = "공급받는자담당자이메일2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email2;

    @ElDtoField(logicalName = "수탁사업자등록번호", physicalName = "brok_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_corp_no;

    @ElDtoField(logicalName = "수탁사업자거래처코드", physicalName = "brok_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_code;

    @ElDtoField(logicalName = "수탁사업자등록번호", physicalName = "brok_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_corp_nm;

    @ElDtoField(logicalName = "수탁사업자대표자명", physicalName = "brok_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_ceo;

    @ElDtoField(logicalName = "수탁사업자주소", physicalName = "brok_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_addr;

    @ElDtoField(logicalName = "수탁사업자업태", physicalName = "brok_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_buss_cons;

    @ElDtoField(logicalName = "수탁사업자업종", physicalName = "brok_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_buss_type;

    @ElDtoField(logicalName = "수탁사업자담당자부서명", physicalName = "brok_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_chrg_post;

    @ElDtoField(logicalName = "수탁사업자담당자명", physicalName = "brok_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_chrg_nm;

    @ElDtoField(logicalName = "수탁사업자담당자전화번호", physicalName = "brok_chrg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_chrg_tel;

    @ElDtoField(logicalName = "수탁사업자담당자이메일", physicalName = "brok_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String brok_chrg_email;

    @ElDtoField(logicalName = "결제방법코드1", physicalName = "pymt_type1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type1;

    @ElDtoField(logicalName = "결제방법코드2", physicalName = "pymt_type2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type2;

    @ElDtoField(logicalName = "결제방법코드3", physicalName = "pymt_type3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type3;

    @ElDtoField(logicalName = "결제방법코드4", physicalName = "pymt_type4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type4;

    @ElDtoField(logicalName = "역발행 구분", physicalName = "recp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recp_cd;

    @ElDtoField(logicalName = "수정전세금계산서발행일련번호", physicalName = "bfo_issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfo_issu_id;

    @ElDtoField(logicalName = "회사코드", physicalName = "company_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String company_code;

    @ElDtoField(logicalName = "업무구분", physicalName = "sys_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_chk;

    @ElDtoField(logicalName = "응답 상태코드", physicalName = "stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stat_code;

    @ElDtoField(logicalName = "결과수신여부", physicalName = "rst_rcp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_rcp_yn;

    @ElDtoField(logicalName = "응답코드", physicalName = "err_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String err_cd;

    @ElDtoField(logicalName = "발행처리상태", physicalName = "loadstatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loadstatus;

    @ElDtoField(logicalName = "국세청 전송일자", physicalName = "issu_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_date;

    @ElDtoField(logicalName = "거래처코드", physicalName = "ech_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ech_code;

    @ElDtoField(logicalName = "ASP전송일자시간", physicalName = "asp_sdatetime", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String asp_sdatetime;

    @ElDtoField(logicalName = "계산서디테일여부", physicalName = "detail_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detail_yn;

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
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

    @ElVoField(physicalName = "un_amt")
    public long getUn_amt(){
        return un_amt;
    }

    @ElVoField(physicalName = "un_amt")
    public void setUn_amt(long un_amt){
        this.un_amt = un_amt;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "tax_type")
    public String getTax_type(){
        return tax_type;
    }

    @ElVoField(physicalName = "tax_type")
    public void setTax_type(String tax_type){
        this.tax_type = tax_type;
    }

    @ElVoField(physicalName = "tax_type_nm")
    public String getTax_type_nm(){
        return tax_type_nm;
    }

    @ElVoField(physicalName = "tax_type_nm")
    public void setTax_type_nm(String tax_type_nm){
        this.tax_type_nm = tax_type_nm;
    }

    @ElVoField(physicalName = "pops_code")
    public String getPops_code(){
        return pops_code;
    }

    @ElVoField(physicalName = "pops_code")
    public void setPops_code(String pops_code){
        this.pops_code = pops_code;
    }

    @ElVoField(physicalName = "pops_nm")
    public String getPops_nm(){
        return pops_nm;
    }

    @ElVoField(physicalName = "pops_nm")
    public void setPops_nm(String pops_nm){
        this.pops_nm = pops_nm;
    }

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "mody_cause")
    public String getMody_cause(){
        return mody_cause;
    }

    @ElVoField(physicalName = "mody_cause")
    public void setMody_cause(String mody_cause){
        this.mody_cause = mody_cause;
    }

    @ElVoField(physicalName = "note1")
    public String getNote1(){
        return note1;
    }

    @ElVoField(physicalName = "note1")
    public void setNote1(String note1){
        this.note1 = note1;
    }

    @ElVoField(physicalName = "note2")
    public String getNote2(){
        return note2;
    }

    @ElVoField(physicalName = "note2")
    public void setNote2(String note2){
        this.note2 = note2;
    }

    @ElVoField(physicalName = "note3")
    public String getNote3(){
        return note3;
    }

    @ElVoField(physicalName = "note3")
    public void setNote3(String note3){
        this.note3 = note3;
    }

    @ElVoField(physicalName = "impt_no")
    public String getImpt_no(){
        return impt_no;
    }

    @ElVoField(physicalName = "impt_no")
    public void setImpt_no(String impt_no){
        this.impt_no = impt_no;
    }

    @ElVoField(physicalName = "acep_stat_date")
    public String getAcep_stat_date(){
        return acep_stat_date;
    }

    @ElVoField(physicalName = "acep_stat_date")
    public void setAcep_stat_date(String acep_stat_date){
        this.acep_stat_date = acep_stat_date;
    }

    @ElVoField(physicalName = "acep_end_date")
    public String getAcep_end_date(){
        return acep_end_date;
    }

    @ElVoField(physicalName = "acep_end_date")
    public void setAcep_end_date(String acep_end_date){
        this.acep_end_date = acep_end_date;
    }

    @ElVoField(physicalName = "item_quant")
    public String getItem_quant(){
        return item_quant;
    }

    @ElVoField(physicalName = "item_quant")
    public void setItem_quant(String item_quant){
        this.item_quant = item_quant;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public String getSelr_corp_no(){
        return selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public void setSelr_corp_no(String selr_corp_no){
        this.selr_corp_no = selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public String getSelr_corp_nm(){
        return selr_corp_nm;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public void setSelr_corp_nm(String selr_corp_nm){
        this.selr_corp_nm = selr_corp_nm;
    }

    @ElVoField(physicalName = "selr_code")
    public String getSelr_code(){
        return selr_code;
    }

    @ElVoField(physicalName = "selr_code")
    public void setSelr_code(String selr_code){
        this.selr_code = selr_code;
    }

    @ElVoField(physicalName = "selr_ceo")
    public String getSelr_ceo(){
        return selr_ceo;
    }

    @ElVoField(physicalName = "selr_ceo")
    public void setSelr_ceo(String selr_ceo){
        this.selr_ceo = selr_ceo;
    }

    @ElVoField(physicalName = "selr_addr")
    public String getSelr_addr(){
        return selr_addr;
    }

    @ElVoField(physicalName = "selr_addr")
    public void setSelr_addr(String selr_addr){
        this.selr_addr = selr_addr;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public String getSelr_buss_cons(){
        return selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public void setSelr_buss_cons(String selr_buss_cons){
        this.selr_buss_cons = selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public String getSelr_buss_type(){
        return selr_buss_type;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public void setSelr_buss_type(String selr_buss_type){
        this.selr_buss_type = selr_buss_type;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public String getBuyr_corp_no(){
        return buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public void setBuyr_corp_no(String buyr_corp_no){
        this.buyr_corp_no = buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_code")
    public String getBuyr_code(){
        return buyr_code;
    }

    @ElVoField(physicalName = "buyr_code")
    public void setBuyr_code(String buyr_code){
        this.buyr_code = buyr_code;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public String getBuyr_corp_nm(){
        return buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public void setBuyr_corp_nm(String buyr_corp_nm){
        this.buyr_corp_nm = buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_ceo")
    public String getBuyr_ceo(){
        return buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_ceo")
    public void setBuyr_ceo(String buyr_ceo){
        this.buyr_ceo = buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_addr")
    public String getBuyr_addr(){
        return buyr_addr;
    }

    @ElVoField(physicalName = "buyr_addr")
    public void setBuyr_addr(String buyr_addr){
        this.buyr_addr = buyr_addr;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public String getBuyr_buss_cons(){
        return buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public void setBuyr_buss_cons(String buyr_buss_cons){
        this.buyr_buss_cons = buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public String getBuyr_buss_type(){
        return buyr_buss_type;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public void setBuyr_buss_type(String buyr_buss_type){
        this.buyr_buss_type = buyr_buss_type;
    }

    @ElVoField(physicalName = "pamt_amt1")
    public long getPamt_amt1(){
        return pamt_amt1;
    }

    @ElVoField(physicalName = "pamt_amt1")
    public void setPamt_amt1(long pamt_amt1){
        this.pamt_amt1 = pamt_amt1;
    }

    @ElVoField(physicalName = "pamt_amt2")
    public long getPamt_amt2(){
        return pamt_amt2;
    }

    @ElVoField(physicalName = "pamt_amt2")
    public void setPamt_amt2(long pamt_amt2){
        this.pamt_amt2 = pamt_amt2;
    }

    @ElVoField(physicalName = "pamt_amt3")
    public long getPamt_amt3(){
        return pamt_amt3;
    }

    @ElVoField(physicalName = "pamt_amt3")
    public void setPamt_amt3(long pamt_amt3){
        this.pamt_amt3 = pamt_amt3;
    }

    @ElVoField(physicalName = "pamt_amt4")
    public long getPamt_amt4(){
        return pamt_amt4;
    }

    @ElVoField(physicalName = "pamt_amt4")
    public void setPamt_amt4(long pamt_amt4){
        this.pamt_amt4 = pamt_amt4;
    }

    @ElVoField(physicalName = "bill_type")
    public String getBill_type(){
        return bill_type;
    }

    @ElVoField(physicalName = "bill_type")
    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }

    @ElVoField(physicalName = "creation_date")
    public String getCreation_date(){
        return creation_date;
    }

    @ElVoField(physicalName = "creation_date")
    public void setCreation_date(String creation_date){
        this.creation_date = creation_date;
    }

    @ElVoField(physicalName = "public_amt_yn")
    public String getPublic_amt_yn(){
        return public_amt_yn;
    }

    @ElVoField(physicalName = "public_amt_yn")
    public void setPublic_amt_yn(String public_amt_yn){
        this.public_amt_yn = public_amt_yn;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public String getSelr_chrg_post(){
        return selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public void setSelr_chrg_post(String selr_chrg_post){
        this.selr_chrg_post = selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_tel")
    public String getSelr_chrg_tel(){
        return selr_chrg_tel;
    }

    @ElVoField(physicalName = "selr_chrg_tel")
    public void setSelr_chrg_tel(String selr_chrg_tel){
        this.selr_chrg_tel = selr_chrg_tel;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public String getSelr_chrg_nm(){
        return selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public void setSelr_chrg_nm(String selr_chrg_nm){
        this.selr_chrg_nm = selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public String getSelr_chrg_email(){
        return selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public void setSelr_chrg_email(String selr_chrg_email){
        this.selr_chrg_email = selr_chrg_email;
    }

    @ElVoField(physicalName = "buyr_gb")
    public String getBuyr_gb(){
        return buyr_gb;
    }

    @ElVoField(physicalName = "buyr_gb")
    public void setBuyr_gb(String buyr_gb){
        this.buyr_gb = buyr_gb;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public String getBuyr_chrg_post1(){
        return buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public void setBuyr_chrg_post1(String buyr_chrg_post1){
        this.buyr_chrg_post1 = buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public String getBuyr_chrg_nm1(){
        return buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public void setBuyr_chrg_nm1(String buyr_chrg_nm1){
        this.buyr_chrg_nm1 = buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_tel1")
    public String getBuyr_chrg_tel1(){
        return buyr_chrg_tel1;
    }

    @ElVoField(physicalName = "buyr_chrg_tel1")
    public void setBuyr_chrg_tel1(String buyr_chrg_tel1){
        this.buyr_chrg_tel1 = buyr_chrg_tel1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_post2")
    public String getBuyr_chrg_post2(){
        return buyr_chrg_post2;
    }

    @ElVoField(physicalName = "buyr_chrg_post2")
    public void setBuyr_chrg_post2(String buyr_chrg_post2){
        this.buyr_chrg_post2 = buyr_chrg_post2;
    }

    @ElVoField(physicalName = "buyr_chrg_nm2")
    public String getBuyr_chrg_nm2(){
        return buyr_chrg_nm2;
    }

    @ElVoField(physicalName = "buyr_chrg_nm2")
    public void setBuyr_chrg_nm2(String buyr_chrg_nm2){
        this.buyr_chrg_nm2 = buyr_chrg_nm2;
    }

    @ElVoField(physicalName = "buyr_chrg_tel2")
    public String getBuyr_chrg_tel2(){
        return buyr_chrg_tel2;
    }

    @ElVoField(physicalName = "buyr_chrg_tel2")
    public void setBuyr_chrg_tel2(String buyr_chrg_tel2){
        this.buyr_chrg_tel2 = buyr_chrg_tel2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public String getBuyr_chrg_email2(){
        return buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public void setBuyr_chrg_email2(String buyr_chrg_email2){
        this.buyr_chrg_email2 = buyr_chrg_email2;
    }

    @ElVoField(physicalName = "brok_corp_no")
    public String getBrok_corp_no(){
        return brok_corp_no;
    }

    @ElVoField(physicalName = "brok_corp_no")
    public void setBrok_corp_no(String brok_corp_no){
        this.brok_corp_no = brok_corp_no;
    }

    @ElVoField(physicalName = "brok_code")
    public String getBrok_code(){
        return brok_code;
    }

    @ElVoField(physicalName = "brok_code")
    public void setBrok_code(String brok_code){
        this.brok_code = brok_code;
    }

    @ElVoField(physicalName = "brok_corp_nm")
    public String getBrok_corp_nm(){
        return brok_corp_nm;
    }

    @ElVoField(physicalName = "brok_corp_nm")
    public void setBrok_corp_nm(String brok_corp_nm){
        this.brok_corp_nm = brok_corp_nm;
    }

    @ElVoField(physicalName = "brok_ceo")
    public String getBrok_ceo(){
        return brok_ceo;
    }

    @ElVoField(physicalName = "brok_ceo")
    public void setBrok_ceo(String brok_ceo){
        this.brok_ceo = brok_ceo;
    }

    @ElVoField(physicalName = "brok_addr")
    public String getBrok_addr(){
        return brok_addr;
    }

    @ElVoField(physicalName = "brok_addr")
    public void setBrok_addr(String brok_addr){
        this.brok_addr = brok_addr;
    }

    @ElVoField(physicalName = "brok_buss_cons")
    public String getBrok_buss_cons(){
        return brok_buss_cons;
    }

    @ElVoField(physicalName = "brok_buss_cons")
    public void setBrok_buss_cons(String brok_buss_cons){
        this.brok_buss_cons = brok_buss_cons;
    }

    @ElVoField(physicalName = "brok_buss_type")
    public String getBrok_buss_type(){
        return brok_buss_type;
    }

    @ElVoField(physicalName = "brok_buss_type")
    public void setBrok_buss_type(String brok_buss_type){
        this.brok_buss_type = brok_buss_type;
    }

    @ElVoField(physicalName = "brok_chrg_post")
    public String getBrok_chrg_post(){
        return brok_chrg_post;
    }

    @ElVoField(physicalName = "brok_chrg_post")
    public void setBrok_chrg_post(String brok_chrg_post){
        this.brok_chrg_post = brok_chrg_post;
    }

    @ElVoField(physicalName = "brok_chrg_nm")
    public String getBrok_chrg_nm(){
        return brok_chrg_nm;
    }

    @ElVoField(physicalName = "brok_chrg_nm")
    public void setBrok_chrg_nm(String brok_chrg_nm){
        this.brok_chrg_nm = brok_chrg_nm;
    }

    @ElVoField(physicalName = "brok_chrg_tel")
    public String getBrok_chrg_tel(){
        return brok_chrg_tel;
    }

    @ElVoField(physicalName = "brok_chrg_tel")
    public void setBrok_chrg_tel(String brok_chrg_tel){
        this.brok_chrg_tel = brok_chrg_tel;
    }

    @ElVoField(physicalName = "brok_chrg_email")
    public String getBrok_chrg_email(){
        return brok_chrg_email;
    }

    @ElVoField(physicalName = "brok_chrg_email")
    public void setBrok_chrg_email(String brok_chrg_email){
        this.brok_chrg_email = brok_chrg_email;
    }

    @ElVoField(physicalName = "pymt_type1")
    public String getPymt_type1(){
        return pymt_type1;
    }

    @ElVoField(physicalName = "pymt_type1")
    public void setPymt_type1(String pymt_type1){
        this.pymt_type1 = pymt_type1;
    }

    @ElVoField(physicalName = "pymt_type2")
    public String getPymt_type2(){
        return pymt_type2;
    }

    @ElVoField(physicalName = "pymt_type2")
    public void setPymt_type2(String pymt_type2){
        this.pymt_type2 = pymt_type2;
    }

    @ElVoField(physicalName = "pymt_type3")
    public String getPymt_type3(){
        return pymt_type3;
    }

    @ElVoField(physicalName = "pymt_type3")
    public void setPymt_type3(String pymt_type3){
        this.pymt_type3 = pymt_type3;
    }

    @ElVoField(physicalName = "pymt_type4")
    public String getPymt_type4(){
        return pymt_type4;
    }

    @ElVoField(physicalName = "pymt_type4")
    public void setPymt_type4(String pymt_type4){
        this.pymt_type4 = pymt_type4;
    }

    @ElVoField(physicalName = "recp_cd")
    public String getRecp_cd(){
        return recp_cd;
    }

    @ElVoField(physicalName = "recp_cd")
    public void setRecp_cd(String recp_cd){
        this.recp_cd = recp_cd;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public String getBfo_issu_id(){
        return bfo_issu_id;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public void setBfo_issu_id(String bfo_issu_id){
        this.bfo_issu_id = bfo_issu_id;
    }

    @ElVoField(physicalName = "company_code")
    public String getCompany_code(){
        return company_code;
    }

    @ElVoField(physicalName = "company_code")
    public void setCompany_code(String company_code){
        this.company_code = company_code;
    }

    @ElVoField(physicalName = "sys_chk")
    public String getSys_chk(){
        return sys_chk;
    }

    @ElVoField(physicalName = "sys_chk")
    public void setSys_chk(String sys_chk){
        this.sys_chk = sys_chk;
    }

    @ElVoField(physicalName = "stat_code")
    public String getStat_code(){
        return stat_code;
    }

    @ElVoField(physicalName = "stat_code")
    public void setStat_code(String stat_code){
        this.stat_code = stat_code;
    }

    @ElVoField(physicalName = "rst_rcp_yn")
    public String getRst_rcp_yn(){
        return rst_rcp_yn;
    }

    @ElVoField(physicalName = "rst_rcp_yn")
    public void setRst_rcp_yn(String rst_rcp_yn){
        this.rst_rcp_yn = rst_rcp_yn;
    }

    @ElVoField(physicalName = "err_cd")
    public String getErr_cd(){
        return err_cd;
    }

    @ElVoField(physicalName = "err_cd")
    public void setErr_cd(String err_cd){
        this.err_cd = err_cd;
    }

    @ElVoField(physicalName = "loadstatus")
    public String getLoadstatus(){
        return loadstatus;
    }

    @ElVoField(physicalName = "loadstatus")
    public void setLoadstatus(String loadstatus){
        this.loadstatus = loadstatus;
    }

    @ElVoField(physicalName = "issu_date")
    public String getIssu_date(){
        return issu_date;
    }

    @ElVoField(physicalName = "issu_date")
    public void setIssu_date(String issu_date){
        this.issu_date = issu_date;
    }

    @ElVoField(physicalName = "ech_code")
    public String getEch_code(){
        return ech_code;
    }

    @ElVoField(physicalName = "ech_code")
    public void setEch_code(String ech_code){
        this.ech_code = ech_code;
    }

    @ElVoField(physicalName = "asp_sdatetime")
    public String getAsp_sdatetime(){
        return asp_sdatetime;
    }

    @ElVoField(physicalName = "asp_sdatetime")
    public void setAsp_sdatetime(String asp_sdatetime){
        this.asp_sdatetime = asp_sdatetime;
    }

    @ElVoField(physicalName = "detail_yn")
    public String getDetail_yn(){
        return detail_yn;
    }

    @ElVoField(physicalName = "detail_yn")
    public void setDetail_yn(String detail_yn){
        this.detail_yn = detail_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KtxIssuMstrVo [");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("un_amt").append("=").append(un_amt).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("tax_type_nm").append("=").append(tax_type_nm).append(",");
        sb.append("pops_code").append("=").append(pops_code).append(",");
        sb.append("pops_nm").append("=").append(pops_nm).append(",");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("mody_cause").append("=").append(mody_cause).append(",");
        sb.append("note1").append("=").append(note1).append(",");
        sb.append("note2").append("=").append(note2).append(",");
        sb.append("note3").append("=").append(note3).append(",");
        sb.append("impt_no").append("=").append(impt_no).append(",");
        sb.append("acep_stat_date").append("=").append(acep_stat_date).append(",");
        sb.append("acep_end_date").append("=").append(acep_end_date).append(",");
        sb.append("item_quant").append("=").append(item_quant).append(",");
        sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
        sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
        sb.append("selr_code").append("=").append(selr_code).append(",");
        sb.append("selr_ceo").append("=").append(selr_ceo).append(",");
        sb.append("selr_addr").append("=").append(selr_addr).append(",");
        sb.append("selr_buss_cons").append("=").append(selr_buss_cons).append(",");
        sb.append("selr_buss_type").append("=").append(selr_buss_type).append(",");
        sb.append("buyr_corp_no").append("=").append(buyr_corp_no).append(",");
        sb.append("buyr_code").append("=").append(buyr_code).append(",");
        sb.append("buyr_corp_nm").append("=").append(buyr_corp_nm).append(",");
        sb.append("buyr_ceo").append("=").append(buyr_ceo).append(",");
        sb.append("buyr_addr").append("=").append(buyr_addr).append(",");
        sb.append("buyr_buss_cons").append("=").append(buyr_buss_cons).append(",");
        sb.append("buyr_buss_type").append("=").append(buyr_buss_type).append(",");
        sb.append("pamt_amt1").append("=").append(pamt_amt1).append(",");
        sb.append("pamt_amt2").append("=").append(pamt_amt2).append(",");
        sb.append("pamt_amt3").append("=").append(pamt_amt3).append(",");
        sb.append("pamt_amt4").append("=").append(pamt_amt4).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("creation_date").append("=").append(creation_date).append(",");
        sb.append("public_amt_yn").append("=").append(public_amt_yn).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("selr_chrg_post").append("=").append(selr_chrg_post).append(",");
        sb.append("selr_chrg_tel").append("=").append(selr_chrg_tel).append(",");
        sb.append("selr_chrg_nm").append("=").append(selr_chrg_nm).append(",");
        sb.append("selr_chrg_email").append("=").append(selr_chrg_email).append(",");
        sb.append("buyr_gb").append("=").append(buyr_gb).append(",");
        sb.append("buyr_chrg_post1").append("=").append(buyr_chrg_post1).append(",");
        sb.append("buyr_chrg_nm1").append("=").append(buyr_chrg_nm1).append(",");
        sb.append("buyr_chrg_tel1").append("=").append(buyr_chrg_tel1).append(",");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("buyr_chrg_post2").append("=").append(buyr_chrg_post2).append(",");
        sb.append("buyr_chrg_nm2").append("=").append(buyr_chrg_nm2).append(",");
        sb.append("buyr_chrg_tel2").append("=").append(buyr_chrg_tel2).append(",");
        sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
        sb.append("brok_corp_no").append("=").append(brok_corp_no).append(",");
        sb.append("brok_code").append("=").append(brok_code).append(",");
        sb.append("brok_corp_nm").append("=").append(brok_corp_nm).append(",");
        sb.append("brok_ceo").append("=").append(brok_ceo).append(",");
        sb.append("brok_addr").append("=").append(brok_addr).append(",");
        sb.append("brok_buss_cons").append("=").append(brok_buss_cons).append(",");
        sb.append("brok_buss_type").append("=").append(brok_buss_type).append(",");
        sb.append("brok_chrg_post").append("=").append(brok_chrg_post).append(",");
        sb.append("brok_chrg_nm").append("=").append(brok_chrg_nm).append(",");
        sb.append("brok_chrg_tel").append("=").append(brok_chrg_tel).append(",");
        sb.append("brok_chrg_email").append("=").append(brok_chrg_email).append(",");
        sb.append("pymt_type1").append("=").append(pymt_type1).append(",");
        sb.append("pymt_type2").append("=").append(pymt_type2).append(",");
        sb.append("pymt_type3").append("=").append(pymt_type3).append(",");
        sb.append("pymt_type4").append("=").append(pymt_type4).append(",");
        sb.append("recp_cd").append("=").append(recp_cd).append(",");
        sb.append("bfo_issu_id").append("=").append(bfo_issu_id).append(",");
        sb.append("company_code").append("=").append(company_code).append(",");
        sb.append("sys_chk").append("=").append(sys_chk).append(",");
        sb.append("stat_code").append("=").append(stat_code).append(",");
        sb.append("rst_rcp_yn").append("=").append(rst_rcp_yn).append(",");
        sb.append("err_cd").append("=").append(err_cd).append(",");
        sb.append("loadstatus").append("=").append(loadstatus).append(",");
        sb.append("issu_date").append("=").append(issu_date).append(",");
        sb.append("ech_code").append("=").append(ech_code).append(",");
        sb.append("asp_sdatetime").append("=").append(asp_sdatetime).append(",");
        sb.append("detail_yn").append("=").append(detail_yn);
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
