package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획상세 Vo")
public class EpuOrdMastrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdMastrVo(){
    }

    @ElDtoField(logicalName = "공고번호", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "이전 발주번호", physicalName = "rebid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rebid_ord_no;

    @ElDtoField(logicalName = "이전 변경차수", physicalName = "rebid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rebid_no;

    @ElDtoField(logicalName = "원 발주번호", physicalName = "org_bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_bid_ord_no;

    @ElDtoField(logicalName = "원발주순번", physicalName = "org_chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String org_chg_no;

    @ElDtoField(logicalName = "계약형태", physicalName = "contract_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contract_type_cd;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "공고진행방법", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "긴급입찰여부", physicalName = "emer_bid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emer_bid_yn;

    @ElDtoField(logicalName = "공고명", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "공고일자", physicalName = "noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd;

    @ElDtoField(logicalName = "부가세 포함여부", physicalName = "vat_include_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vat_include_yn;

    @ElDtoField(logicalName = "공고마감일시", physicalName = "noti_last_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_last_ymd;

    @ElDtoField(logicalName = "납품일수", physicalName = "delvr_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_date;

    @ElDtoField(logicalName = "비고", physicalName = "remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remark;

    @ElDtoField(logicalName = "계약방법", physicalName = "contrct_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_method;

    @ElDtoField(logicalName = "낙찰자선정방법", physicalName = "bid_succ_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_method;

    @ElDtoField(logicalName = "입찰방식", physicalName = "bid_succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_type;

    @ElDtoField(logicalName = "재입찰가능여부", physicalName = "rebid_possible_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rebid_possible_yn;

    @ElDtoField(logicalName = "RPA 자동등록", physicalName = "rpa_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpa_yn;

    @ElDtoField(logicalName = "낙찰방법기준", physicalName = "succ_pivot", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_pivot;

    @ElDtoField(logicalName = "낙찰방법", physicalName = "succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_type;

    @ElDtoField(logicalName = "낙찰하한율", physicalName = "succ_min_rate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_min_rate;

    @ElDtoField(logicalName = "PQ심사여부", physicalName = "pq_eval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_yn;

    @ElDtoField(logicalName = "PQ 점수", physicalName = "pq_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_score;

    @ElDtoField(logicalName = "입찰설명회여부", physicalName = "bid_expl_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_expl_yn;

    @ElDtoField(logicalName = "입찰설명회 장소", physicalName = "bid_expl_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_expl_loc;

    @ElDtoField(logicalName = "입찰참가자격", physicalName = "apply_lic_remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apply_lic_remark;

    @ElDtoField(logicalName = "시담공개여부", physicalName = "nego_pur_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nego_pur_yn;

    @ElDtoField(logicalName = "하자보증율", physicalName = "exe_guar_rate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exe_guar_rate;

    @ElDtoField(logicalName = "하자보증기간", physicalName = "exe_guar_period", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exe_guar_period;

    @ElDtoField(logicalName = "지체상금율", physicalName = "delay_amt_rate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delay_amt_rate;

    @ElDtoField(logicalName = "입찰설명회 일시", physicalName = "bid_expl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_expl_ymd;

    @ElDtoField(logicalName = "입찰서접수개시일시", physicalName = "bid_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_start_ymd;

    @ElDtoField(logicalName = "입찰서접수마감일시", physicalName = "bid_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_end_ymd;

    @ElDtoField(logicalName = "개찰일시", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "입찰참가등록마감일시", physicalName = "bid_apply_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_apply_end_ymd;

    @ElDtoField(logicalName = "입찰보증서접수마감일시", physicalName = "bid_gurnt_fin_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_gurnt_fin_ymd;

    @ElDtoField(logicalName = "공동수급가능여부", physicalName = "join_possible_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_possible_yn;

    @ElDtoField(logicalName = "공동수급방법", physicalName = "join_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_method;

    @ElDtoField(logicalName = "공동수급협정서 접수마감일시", physicalName = "join_agr_fin_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_agr_fin_ymd;

    @ElDtoField(logicalName = "동가입찰 낙찰자 자동추첨프로그램사용(용역)", physicalName = "same_suc_lot_program_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String same_suc_lot_program_yn;

    @ElDtoField(logicalName = "지역제한", physicalName = "limit_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String limit_loc;

    @ElDtoField(logicalName = "지역제한(지사/지점)", physicalName = "tender_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tender_yn;

    @ElDtoField(logicalName = "업종제한", physicalName = "limit_category", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String limit_category;

    @ElDtoField(logicalName = "물품분류제한여부", physicalName = "item_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_limit_yn;

    @ElDtoField(logicalName = "제조업체로 제한", physicalName = "vend_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_limit_yn;

    @ElDtoField(logicalName = "공동수급체 구성원 지역제한적용여부", physicalName = "join_mem_loc_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_mem_loc_limit_yn;

    @ElDtoField(logicalName = "예가방식", physicalName = "multi_esti_pr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String multi_esti_pr_yn;

    @ElDtoField(logicalName = " 단일예가 온라인여부", physicalName = "esti_online_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String esti_online_yn;

    @ElDtoField(logicalName = "배정예산", physicalName = "assign_amount", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long assign_amount;

    @ElDtoField(logicalName = "추정가격", physicalName = "budget_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long budget_amt;

    @ElDtoField(logicalName = "기초금액", physicalName = "desing_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long desing_amt;

    @ElDtoField(logicalName = "원가예산 근거 첨부파일", physicalName = "estipr_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String estipr_attach_file_no;

    @ElDtoField(logicalName = "발주계획 첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "작성자", physicalName = "ord_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord_psn_nm;

    @ElDtoField(logicalName = "발주도우미", physicalName = "ord_helper", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord_helper;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "연계방법", physicalName = "check_bid_succ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_bid_succ;

    @ElDtoField(logicalName = "구매담당자부서코드", physicalName = "charg_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_cd;

    @ElDtoField(logicalName = "구매담당자부서명", physicalName = "charg_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_new_ymd;

    @ElDtoField(logicalName = "구매담당자지역구분", physicalName = "charg_region_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_region_clsf;

    @ElDtoField(logicalName = "구매담당자본부", physicalName = "charg_divsn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_divsn_dept;

    @ElDtoField(logicalName = "결재번호", physicalName = "elec_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elec_docu_no;

    @ElDtoField(logicalName = "부가세", physicalName = "req_addtax", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_addtax;

    @ElDtoField(logicalName = "납품일자", physicalName = "delvr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_ymd;

    @ElDtoField(logicalName = "면허보유여부(용역)", physicalName = "lic_chk_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lic_chk_yn;

    @ElDtoField(logicalName = "PQ심사신청서 접수방식", physicalName = "pq_eval_rcp_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_rcp_type;

    @ElDtoField(logicalName = "PQ심사신청서 접수기한", physicalName = "pq_eval_rcp_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_rcp_end_ymd;

    @ElDtoField(logicalName = "용역구분", physicalName = "service_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_type_cd;

    @ElDtoField(logicalName = "SW가격점수산정방식적용여부", physicalName = "sw_score_apply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sw_score_apply_yn;

    @ElDtoField(logicalName = "내역입찰여부(공사)", physicalName = "his_bid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_bid_yn;

    @ElDtoField(logicalName = "지역의무공동도급여부", physicalName = "loc_duty_pub_outsource_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loc_duty_pub_outsource_yn;

    @ElDtoField(logicalName = "공동도급비율", physicalName = "pub_outsource_rate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_outsource_rate;

    @ElDtoField(logicalName = "공동도급지역1", physicalName = "pub_outsource_loc1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_outsource_loc1;

    @ElDtoField(logicalName = "공동도급지역2", physicalName = "pub_outsource_loc2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_outsource_loc2;

    @ElDtoField(logicalName = "공동도급지역3", physicalName = "pub_outsource_loc3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_outsource_loc3;

    @ElDtoField(logicalName = "공동수급업체수 제한여부", physicalName = "pub_sup_vendno_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_sup_vendno_limit_yn;

    @ElDtoField(logicalName = "공동수급 업체수", physicalName = "pub_sup_vendno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pub_sup_vendno;

    @ElDtoField(logicalName = "적격심사 평가기준", physicalName = "fit_eval_judg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fit_eval_judg;

    @ElDtoField(logicalName = "적격심사 주공종", physicalName = "fit_eval_maincon_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fit_eval_maincon_cd;

    @ElDtoField(logicalName = "적격심사 주공종 추정금액", physicalName = "fit_eval_maincon_esti_val", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fit_eval_maincon_esti_val;

    @ElDtoField(logicalName = "입찰참가제한여부", physicalName = "bid_part_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_part_limit_yn;

    @ElDtoField(logicalName = "관급금액(관급자)", physicalName = "gov_supply_val_gov", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gov_supply_val_gov;

    @ElDtoField(logicalName = "관급금액(도급자)", physicalName = "gov_supply_val_outsouce", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gov_supply_val_outsouce;

    @ElDtoField(logicalName = "현장설명담당자", physicalName = "filed_expn_charger", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String filed_expn_charger;

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "rebid_ord_no")
    public String getRebid_ord_no(){
        return rebid_ord_no;
    }

    @ElVoField(physicalName = "rebid_ord_no")
    public void setRebid_ord_no(String rebid_ord_no){
        this.rebid_ord_no = rebid_ord_no;
    }

    @ElVoField(physicalName = "rebid_no")
    public String getRebid_no(){
        return rebid_no;
    }

    @ElVoField(physicalName = "rebid_no")
    public void setRebid_no(String rebid_no){
        this.rebid_no = rebid_no;
    }

    @ElVoField(physicalName = "org_bid_ord_no")
    public String getOrg_bid_ord_no(){
        return org_bid_ord_no;
    }

    @ElVoField(physicalName = "org_bid_ord_no")
    public void setOrg_bid_ord_no(String org_bid_ord_no){
        this.org_bid_ord_no = org_bid_ord_no;
    }

    @ElVoField(physicalName = "org_chg_no")
    public String getOrg_chg_no(){
        return org_chg_no;
    }

    @ElVoField(physicalName = "org_chg_no")
    public void setOrg_chg_no(String org_chg_no){
        this.org_chg_no = org_chg_no;
    }

    @ElVoField(physicalName = "contract_type_cd")
    public String getContract_type_cd(){
        return contract_type_cd;
    }

    @ElVoField(physicalName = "contract_type_cd")
    public void setContract_type_cd(String contract_type_cd){
        this.contract_type_cd = contract_type_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "emer_bid_yn")
    public String getEmer_bid_yn(){
        return emer_bid_yn;
    }

    @ElVoField(physicalName = "emer_bid_yn")
    public void setEmer_bid_yn(String emer_bid_yn){
        this.emer_bid_yn = emer_bid_yn;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "noti_ymd")
    public String getNoti_ymd(){
        return noti_ymd;
    }

    @ElVoField(physicalName = "noti_ymd")
    public void setNoti_ymd(String noti_ymd){
        this.noti_ymd = noti_ymd;
    }

    @ElVoField(physicalName = "vat_include_yn")
    public String getVat_include_yn(){
        return vat_include_yn;
    }

    @ElVoField(physicalName = "vat_include_yn")
    public void setVat_include_yn(String vat_include_yn){
        this.vat_include_yn = vat_include_yn;
    }

    @ElVoField(physicalName = "noti_last_ymd")
    public String getNoti_last_ymd(){
        return noti_last_ymd;
    }

    @ElVoField(physicalName = "noti_last_ymd")
    public void setNoti_last_ymd(String noti_last_ymd){
        this.noti_last_ymd = noti_last_ymd;
    }

    @ElVoField(physicalName = "delvr_date")
    public String getDelvr_date(){
        return delvr_date;
    }

    @ElVoField(physicalName = "delvr_date")
    public void setDelvr_date(String delvr_date){
        this.delvr_date = delvr_date;
    }

    @ElVoField(physicalName = "remark")
    public String getRemark(){
        return remark;
    }

    @ElVoField(physicalName = "remark")
    public void setRemark(String remark){
        this.remark = remark;
    }

    @ElVoField(physicalName = "contrct_method")
    public String getContrct_method(){
        return contrct_method;
    }

    @ElVoField(physicalName = "contrct_method")
    public void setContrct_method(String contrct_method){
        this.contrct_method = contrct_method;
    }

    @ElVoField(physicalName = "bid_succ_method")
    public String getBid_succ_method(){
        return bid_succ_method;
    }

    @ElVoField(physicalName = "bid_succ_method")
    public void setBid_succ_method(String bid_succ_method){
        this.bid_succ_method = bid_succ_method;
    }

    @ElVoField(physicalName = "bid_succ_type")
    public String getBid_succ_type(){
        return bid_succ_type;
    }

    @ElVoField(physicalName = "bid_succ_type")
    public void setBid_succ_type(String bid_succ_type){
        this.bid_succ_type = bid_succ_type;
    }

    @ElVoField(physicalName = "rebid_possible_yn")
    public String getRebid_possible_yn(){
        return rebid_possible_yn;
    }

    @ElVoField(physicalName = "rebid_possible_yn")
    public void setRebid_possible_yn(String rebid_possible_yn){
        this.rebid_possible_yn = rebid_possible_yn;
    }

    @ElVoField(physicalName = "rpa_yn")
    public String getRpa_yn(){
        return rpa_yn;
    }

    @ElVoField(physicalName = "rpa_yn")
    public void setRpa_yn(String rpa_yn){
        this.rpa_yn = rpa_yn;
    }

    @ElVoField(physicalName = "succ_pivot")
    public String getSucc_pivot(){
        return succ_pivot;
    }

    @ElVoField(physicalName = "succ_pivot")
    public void setSucc_pivot(String succ_pivot){
        this.succ_pivot = succ_pivot;
    }

    @ElVoField(physicalName = "succ_type")
    public String getSucc_type(){
        return succ_type;
    }

    @ElVoField(physicalName = "succ_type")
    public void setSucc_type(String succ_type){
        this.succ_type = succ_type;
    }

    @ElVoField(physicalName = "succ_min_rate")
    public String getSucc_min_rate(){
        return succ_min_rate;
    }

    @ElVoField(physicalName = "succ_min_rate")
    public void setSucc_min_rate(String succ_min_rate){
        this.succ_min_rate = succ_min_rate;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public String getPq_eval_yn(){
        return pq_eval_yn;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public void setPq_eval_yn(String pq_eval_yn){
        this.pq_eval_yn = pq_eval_yn;
    }

    @ElVoField(physicalName = "pq_score")
    public String getPq_score(){
        return pq_score;
    }

    @ElVoField(physicalName = "pq_score")
    public void setPq_score(String pq_score){
        this.pq_score = pq_score;
    }

    @ElVoField(physicalName = "bid_expl_yn")
    public String getBid_expl_yn(){
        return bid_expl_yn;
    }

    @ElVoField(physicalName = "bid_expl_yn")
    public void setBid_expl_yn(String bid_expl_yn){
        this.bid_expl_yn = bid_expl_yn;
    }

    @ElVoField(physicalName = "bid_expl_loc")
    public String getBid_expl_loc(){
        return bid_expl_loc;
    }

    @ElVoField(physicalName = "bid_expl_loc")
    public void setBid_expl_loc(String bid_expl_loc){
        this.bid_expl_loc = bid_expl_loc;
    }

    @ElVoField(physicalName = "apply_lic_remark")
    public String getApply_lic_remark(){
        return apply_lic_remark;
    }

    @ElVoField(physicalName = "apply_lic_remark")
    public void setApply_lic_remark(String apply_lic_remark){
        this.apply_lic_remark = apply_lic_remark;
    }

    @ElVoField(physicalName = "nego_pur_yn")
    public String getNego_pur_yn(){
        return nego_pur_yn;
    }

    @ElVoField(physicalName = "nego_pur_yn")
    public void setNego_pur_yn(String nego_pur_yn){
        this.nego_pur_yn = nego_pur_yn;
    }

    @ElVoField(physicalName = "exe_guar_rate")
    public String getExe_guar_rate(){
        return exe_guar_rate;
    }

    @ElVoField(physicalName = "exe_guar_rate")
    public void setExe_guar_rate(String exe_guar_rate){
        this.exe_guar_rate = exe_guar_rate;
    }

    @ElVoField(physicalName = "exe_guar_period")
    public String getExe_guar_period(){
        return exe_guar_period;
    }

    @ElVoField(physicalName = "exe_guar_period")
    public void setExe_guar_period(String exe_guar_period){
        this.exe_guar_period = exe_guar_period;
    }

    @ElVoField(physicalName = "delay_amt_rate")
    public String getDelay_amt_rate(){
        return delay_amt_rate;
    }

    @ElVoField(physicalName = "delay_amt_rate")
    public void setDelay_amt_rate(String delay_amt_rate){
        this.delay_amt_rate = delay_amt_rate;
    }

    @ElVoField(physicalName = "bid_expl_ymd")
    public String getBid_expl_ymd(){
        return bid_expl_ymd;
    }

    @ElVoField(physicalName = "bid_expl_ymd")
    public void setBid_expl_ymd(String bid_expl_ymd){
        this.bid_expl_ymd = bid_expl_ymd;
    }

    @ElVoField(physicalName = "bid_start_ymd")
    public String getBid_start_ymd(){
        return bid_start_ymd;
    }

    @ElVoField(physicalName = "bid_start_ymd")
    public void setBid_start_ymd(String bid_start_ymd){
        this.bid_start_ymd = bid_start_ymd;
    }

    @ElVoField(physicalName = "bid_end_ymd")
    public String getBid_end_ymd(){
        return bid_end_ymd;
    }

    @ElVoField(physicalName = "bid_end_ymd")
    public void setBid_end_ymd(String bid_end_ymd){
        this.bid_end_ymd = bid_end_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public String getOpen_ymd(){
        return open_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public void setOpen_ymd(String open_ymd){
        this.open_ymd = open_ymd;
    }

    @ElVoField(physicalName = "bid_apply_end_ymd")
    public String getBid_apply_end_ymd(){
        return bid_apply_end_ymd;
    }

    @ElVoField(physicalName = "bid_apply_end_ymd")
    public void setBid_apply_end_ymd(String bid_apply_end_ymd){
        this.bid_apply_end_ymd = bid_apply_end_ymd;
    }

    @ElVoField(physicalName = "bid_gurnt_fin_ymd")
    public String getBid_gurnt_fin_ymd(){
        return bid_gurnt_fin_ymd;
    }

    @ElVoField(physicalName = "bid_gurnt_fin_ymd")
    public void setBid_gurnt_fin_ymd(String bid_gurnt_fin_ymd){
        this.bid_gurnt_fin_ymd = bid_gurnt_fin_ymd;
    }

    @ElVoField(physicalName = "join_possible_yn")
    public String getJoin_possible_yn(){
        return join_possible_yn;
    }

    @ElVoField(physicalName = "join_possible_yn")
    public void setJoin_possible_yn(String join_possible_yn){
        this.join_possible_yn = join_possible_yn;
    }

    @ElVoField(physicalName = "join_method")
    public String getJoin_method(){
        return join_method;
    }

    @ElVoField(physicalName = "join_method")
    public void setJoin_method(String join_method){
        this.join_method = join_method;
    }

    @ElVoField(physicalName = "join_agr_fin_ymd")
    public String getJoin_agr_fin_ymd(){
        return join_agr_fin_ymd;
    }

    @ElVoField(physicalName = "join_agr_fin_ymd")
    public void setJoin_agr_fin_ymd(String join_agr_fin_ymd){
        this.join_agr_fin_ymd = join_agr_fin_ymd;
    }

    @ElVoField(physicalName = "same_suc_lot_program_yn")
    public String getSame_suc_lot_program_yn(){
        return same_suc_lot_program_yn;
    }

    @ElVoField(physicalName = "same_suc_lot_program_yn")
    public void setSame_suc_lot_program_yn(String same_suc_lot_program_yn){
        this.same_suc_lot_program_yn = same_suc_lot_program_yn;
    }

    @ElVoField(physicalName = "limit_loc")
    public String getLimit_loc(){
        return limit_loc;
    }

    @ElVoField(physicalName = "limit_loc")
    public void setLimit_loc(String limit_loc){
        this.limit_loc = limit_loc;
    }

    @ElVoField(physicalName = "tender_yn")
    public String getTender_yn(){
        return tender_yn;
    }

    @ElVoField(physicalName = "tender_yn")
    public void setTender_yn(String tender_yn){
        this.tender_yn = tender_yn;
    }

    @ElVoField(physicalName = "limit_category")
    public String getLimit_category(){
        return limit_category;
    }

    @ElVoField(physicalName = "limit_category")
    public void setLimit_category(String limit_category){
        this.limit_category = limit_category;
    }

    @ElVoField(physicalName = "item_limit_yn")
    public String getItem_limit_yn(){
        return item_limit_yn;
    }

    @ElVoField(physicalName = "item_limit_yn")
    public void setItem_limit_yn(String item_limit_yn){
        this.item_limit_yn = item_limit_yn;
    }

    @ElVoField(physicalName = "vend_limit_yn")
    public String getVend_limit_yn(){
        return vend_limit_yn;
    }

    @ElVoField(physicalName = "vend_limit_yn")
    public void setVend_limit_yn(String vend_limit_yn){
        this.vend_limit_yn = vend_limit_yn;
    }

    @ElVoField(physicalName = "join_mem_loc_limit_yn")
    public String getJoin_mem_loc_limit_yn(){
        return join_mem_loc_limit_yn;
    }

    @ElVoField(physicalName = "join_mem_loc_limit_yn")
    public void setJoin_mem_loc_limit_yn(String join_mem_loc_limit_yn){
        this.join_mem_loc_limit_yn = join_mem_loc_limit_yn;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public String getMulti_esti_pr_yn(){
        return multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public void setMulti_esti_pr_yn(String multi_esti_pr_yn){
        this.multi_esti_pr_yn = multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "esti_online_yn")
    public String getEsti_online_yn(){
        return esti_online_yn;
    }

    @ElVoField(physicalName = "esti_online_yn")
    public void setEsti_online_yn(String esti_online_yn){
        this.esti_online_yn = esti_online_yn;
    }

    @ElVoField(physicalName = "assign_amount")
    public long getAssign_amount(){
        return assign_amount;
    }

    @ElVoField(physicalName = "assign_amount")
    public void setAssign_amount(long assign_amount){
        this.assign_amount = assign_amount;
    }

    @ElVoField(physicalName = "budget_amt")
    public long getBudget_amt(){
        return budget_amt;
    }

    @ElVoField(physicalName = "budget_amt")
    public void setBudget_amt(long budget_amt){
        this.budget_amt = budget_amt;
    }

    @ElVoField(physicalName = "desing_amt")
    public long getDesing_amt(){
        return desing_amt;
    }

    @ElVoField(physicalName = "desing_amt")
    public void setDesing_amt(long desing_amt){
        this.desing_amt = desing_amt;
    }

    @ElVoField(physicalName = "estipr_attach_file_no")
    public String getEstipr_attach_file_no(){
        return estipr_attach_file_no;
    }

    @ElVoField(physicalName = "estipr_attach_file_no")
    public void setEstipr_attach_file_no(String estipr_attach_file_no){
        this.estipr_attach_file_no = estipr_attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "ord_psn_nm")
    public String getOrd_psn_nm(){
        return ord_psn_nm;
    }

    @ElVoField(physicalName = "ord_psn_nm")
    public void setOrd_psn_nm(String ord_psn_nm){
        this.ord_psn_nm = ord_psn_nm;
    }

    @ElVoField(physicalName = "ord_helper")
    public String getOrd_helper(){
        return ord_helper;
    }

    @ElVoField(physicalName = "ord_helper")
    public void setOrd_helper(String ord_helper){
        this.ord_helper = ord_helper;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "check_bid_succ")
    public String getCheck_bid_succ(){
        return check_bid_succ;
    }

    @ElVoField(physicalName = "check_bid_succ")
    public void setCheck_bid_succ(String check_bid_succ){
        this.check_bid_succ = check_bid_succ;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public String getCharg_dept_cd(){
        return charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_cd")
    public void setCharg_dept_cd(String charg_dept_cd){
        this.charg_dept_cd = charg_dept_cd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public String getCharg_dept_new_ymd(){
        return charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_dept_new_ymd")
    public void setCharg_dept_new_ymd(String charg_dept_new_ymd){
        this.charg_dept_new_ymd = charg_dept_new_ymd;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public String getCharg_region_clsf(){
        return charg_region_clsf;
    }

    @ElVoField(physicalName = "charg_region_clsf")
    public void setCharg_region_clsf(String charg_region_clsf){
        this.charg_region_clsf = charg_region_clsf;
    }

    @ElVoField(physicalName = "charg_divsn_dept")
    public String getCharg_divsn_dept(){
        return charg_divsn_dept;
    }

    @ElVoField(physicalName = "charg_divsn_dept")
    public void setCharg_divsn_dept(String charg_divsn_dept){
        this.charg_divsn_dept = charg_divsn_dept;
    }

    @ElVoField(physicalName = "elec_docu_no")
    public String getElec_docu_no(){
        return elec_docu_no;
    }

    @ElVoField(physicalName = "elec_docu_no")
    public void setElec_docu_no(String elec_docu_no){
        this.elec_docu_no = elec_docu_no;
    }

    @ElVoField(physicalName = "req_addtax")
    public long getReq_addtax(){
        return req_addtax;
    }

    @ElVoField(physicalName = "req_addtax")
    public void setReq_addtax(long req_addtax){
        this.req_addtax = req_addtax;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public String getDelvr_ymd(){
        return delvr_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public void setDelvr_ymd(String delvr_ymd){
        this.delvr_ymd = delvr_ymd;
    }

    @ElVoField(physicalName = "lic_chk_yn")
    public String getLic_chk_yn(){
        return lic_chk_yn;
    }

    @ElVoField(physicalName = "lic_chk_yn")
    public void setLic_chk_yn(String lic_chk_yn){
        this.lic_chk_yn = lic_chk_yn;
    }

    @ElVoField(physicalName = "pq_eval_rcp_type")
    public String getPq_eval_rcp_type(){
        return pq_eval_rcp_type;
    }

    @ElVoField(physicalName = "pq_eval_rcp_type")
    public void setPq_eval_rcp_type(String pq_eval_rcp_type){
        this.pq_eval_rcp_type = pq_eval_rcp_type;
    }

    @ElVoField(physicalName = "pq_eval_rcp_end_ymd")
    public String getPq_eval_rcp_end_ymd(){
        return pq_eval_rcp_end_ymd;
    }

    @ElVoField(physicalName = "pq_eval_rcp_end_ymd")
    public void setPq_eval_rcp_end_ymd(String pq_eval_rcp_end_ymd){
        this.pq_eval_rcp_end_ymd = pq_eval_rcp_end_ymd;
    }

    @ElVoField(physicalName = "service_type_cd")
    public String getService_type_cd(){
        return service_type_cd;
    }

    @ElVoField(physicalName = "service_type_cd")
    public void setService_type_cd(String service_type_cd){
        this.service_type_cd = service_type_cd;
    }

    @ElVoField(physicalName = "sw_score_apply_yn")
    public String getSw_score_apply_yn(){
        return sw_score_apply_yn;
    }

    @ElVoField(physicalName = "sw_score_apply_yn")
    public void setSw_score_apply_yn(String sw_score_apply_yn){
        this.sw_score_apply_yn = sw_score_apply_yn;
    }

    @ElVoField(physicalName = "his_bid_yn")
    public String getHis_bid_yn(){
        return his_bid_yn;
    }

    @ElVoField(physicalName = "his_bid_yn")
    public void setHis_bid_yn(String his_bid_yn){
        this.his_bid_yn = his_bid_yn;
    }

    @ElVoField(physicalName = "loc_duty_pub_outsource_yn")
    public String getLoc_duty_pub_outsource_yn(){
        return loc_duty_pub_outsource_yn;
    }

    @ElVoField(physicalName = "loc_duty_pub_outsource_yn")
    public void setLoc_duty_pub_outsource_yn(String loc_duty_pub_outsource_yn){
        this.loc_duty_pub_outsource_yn = loc_duty_pub_outsource_yn;
    }

    @ElVoField(physicalName = "pub_outsource_rate")
    public String getPub_outsource_rate(){
        return pub_outsource_rate;
    }

    @ElVoField(physicalName = "pub_outsource_rate")
    public void setPub_outsource_rate(String pub_outsource_rate){
        this.pub_outsource_rate = pub_outsource_rate;
    }

    @ElVoField(physicalName = "pub_outsource_loc1")
    public String getPub_outsource_loc1(){
        return pub_outsource_loc1;
    }

    @ElVoField(physicalName = "pub_outsource_loc1")
    public void setPub_outsource_loc1(String pub_outsource_loc1){
        this.pub_outsource_loc1 = pub_outsource_loc1;
    }

    @ElVoField(physicalName = "pub_outsource_loc2")
    public String getPub_outsource_loc2(){
        return pub_outsource_loc2;
    }

    @ElVoField(physicalName = "pub_outsource_loc2")
    public void setPub_outsource_loc2(String pub_outsource_loc2){
        this.pub_outsource_loc2 = pub_outsource_loc2;
    }

    @ElVoField(physicalName = "pub_outsource_loc3")
    public String getPub_outsource_loc3(){
        return pub_outsource_loc3;
    }

    @ElVoField(physicalName = "pub_outsource_loc3")
    public void setPub_outsource_loc3(String pub_outsource_loc3){
        this.pub_outsource_loc3 = pub_outsource_loc3;
    }

    @ElVoField(physicalName = "pub_sup_vendno_limit_yn")
    public String getPub_sup_vendno_limit_yn(){
        return pub_sup_vendno_limit_yn;
    }

    @ElVoField(physicalName = "pub_sup_vendno_limit_yn")
    public void setPub_sup_vendno_limit_yn(String pub_sup_vendno_limit_yn){
        this.pub_sup_vendno_limit_yn = pub_sup_vendno_limit_yn;
    }

    @ElVoField(physicalName = "pub_sup_vendno")
    public String getPub_sup_vendno(){
        return pub_sup_vendno;
    }

    @ElVoField(physicalName = "pub_sup_vendno")
    public void setPub_sup_vendno(String pub_sup_vendno){
        this.pub_sup_vendno = pub_sup_vendno;
    }

    @ElVoField(physicalName = "fit_eval_judg")
    public String getFit_eval_judg(){
        return fit_eval_judg;
    }

    @ElVoField(physicalName = "fit_eval_judg")
    public void setFit_eval_judg(String fit_eval_judg){
        this.fit_eval_judg = fit_eval_judg;
    }

    @ElVoField(physicalName = "fit_eval_maincon_cd")
    public String getFit_eval_maincon_cd(){
        return fit_eval_maincon_cd;
    }

    @ElVoField(physicalName = "fit_eval_maincon_cd")
    public void setFit_eval_maincon_cd(String fit_eval_maincon_cd){
        this.fit_eval_maincon_cd = fit_eval_maincon_cd;
    }

    @ElVoField(physicalName = "fit_eval_maincon_esti_val")
    public long getFit_eval_maincon_esti_val(){
        return fit_eval_maincon_esti_val;
    }

    @ElVoField(physicalName = "fit_eval_maincon_esti_val")
    public void setFit_eval_maincon_esti_val(long fit_eval_maincon_esti_val){
        this.fit_eval_maincon_esti_val = fit_eval_maincon_esti_val;
    }

    @ElVoField(physicalName = "bid_part_limit_yn")
    public String getBid_part_limit_yn(){
        return bid_part_limit_yn;
    }

    @ElVoField(physicalName = "bid_part_limit_yn")
    public void setBid_part_limit_yn(String bid_part_limit_yn){
        this.bid_part_limit_yn = bid_part_limit_yn;
    }

    @ElVoField(physicalName = "gov_supply_val_gov")
    public long getGov_supply_val_gov(){
        return gov_supply_val_gov;
    }

    @ElVoField(physicalName = "gov_supply_val_gov")
    public void setGov_supply_val_gov(long gov_supply_val_gov){
        this.gov_supply_val_gov = gov_supply_val_gov;
    }

    @ElVoField(physicalName = "gov_supply_val_outsouce")
    public long getGov_supply_val_outsouce(){
        return gov_supply_val_outsouce;
    }

    @ElVoField(physicalName = "gov_supply_val_outsouce")
    public void setGov_supply_val_outsouce(long gov_supply_val_outsouce){
        this.gov_supply_val_outsouce = gov_supply_val_outsouce;
    }

    @ElVoField(physicalName = "filed_expn_charger")
    public String getFiled_expn_charger(){
        return filed_expn_charger;
    }

    @ElVoField(physicalName = "filed_expn_charger")
    public void setFiled_expn_charger(String filed_expn_charger){
        this.filed_expn_charger = filed_expn_charger;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdMastrVo [");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("rebid_ord_no").append("=").append(rebid_ord_no).append(",");
        sb.append("rebid_no").append("=").append(rebid_no).append(",");
        sb.append("org_bid_ord_no").append("=").append(org_bid_ord_no).append(",");
        sb.append("org_chg_no").append("=").append(org_chg_no).append(",");
        sb.append("contract_type_cd").append("=").append(contract_type_cd).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("emer_bid_yn").append("=").append(emer_bid_yn).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("noti_ymd").append("=").append(noti_ymd).append(",");
        sb.append("vat_include_yn").append("=").append(vat_include_yn).append(",");
        sb.append("noti_last_ymd").append("=").append(noti_last_ymd).append(",");
        sb.append("delvr_date").append("=").append(delvr_date).append(",");
        sb.append("remark").append("=").append(remark).append(",");
        sb.append("contrct_method").append("=").append(contrct_method).append(",");
        sb.append("bid_succ_method").append("=").append(bid_succ_method).append(",");
        sb.append("bid_succ_type").append("=").append(bid_succ_type).append(",");
        sb.append("rebid_possible_yn").append("=").append(rebid_possible_yn).append(",");
        sb.append("rpa_yn").append("=").append(rpa_yn).append(",");
        sb.append("succ_pivot").append("=").append(succ_pivot).append(",");
        sb.append("succ_type").append("=").append(succ_type).append(",");
        sb.append("succ_min_rate").append("=").append(succ_min_rate).append(",");
        sb.append("pq_eval_yn").append("=").append(pq_eval_yn).append(",");
        sb.append("pq_score").append("=").append(pq_score).append(",");
        sb.append("bid_expl_yn").append("=").append(bid_expl_yn).append(",");
        sb.append("bid_expl_loc").append("=").append(bid_expl_loc).append(",");
        sb.append("apply_lic_remark").append("=").append(apply_lic_remark).append(",");
        sb.append("nego_pur_yn").append("=").append(nego_pur_yn).append(",");
        sb.append("exe_guar_rate").append("=").append(exe_guar_rate).append(",");
        sb.append("exe_guar_period").append("=").append(exe_guar_period).append(",");
        sb.append("delay_amt_rate").append("=").append(delay_amt_rate).append(",");
        sb.append("bid_expl_ymd").append("=").append(bid_expl_ymd).append(",");
        sb.append("bid_start_ymd").append("=").append(bid_start_ymd).append(",");
        sb.append("bid_end_ymd").append("=").append(bid_end_ymd).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("bid_apply_end_ymd").append("=").append(bid_apply_end_ymd).append(",");
        sb.append("bid_gurnt_fin_ymd").append("=").append(bid_gurnt_fin_ymd).append(",");
        sb.append("join_possible_yn").append("=").append(join_possible_yn).append(",");
        sb.append("join_method").append("=").append(join_method).append(",");
        sb.append("join_agr_fin_ymd").append("=").append(join_agr_fin_ymd).append(",");
        sb.append("same_suc_lot_program_yn").append("=").append(same_suc_lot_program_yn).append(",");
        sb.append("limit_loc").append("=").append(limit_loc).append(",");
        sb.append("tender_yn").append("=").append(tender_yn).append(",");
        sb.append("limit_category").append("=").append(limit_category).append(",");
        sb.append("item_limit_yn").append("=").append(item_limit_yn).append(",");
        sb.append("vend_limit_yn").append("=").append(vend_limit_yn).append(",");
        sb.append("join_mem_loc_limit_yn").append("=").append(join_mem_loc_limit_yn).append(",");
        sb.append("multi_esti_pr_yn").append("=").append(multi_esti_pr_yn).append(",");
        sb.append("esti_online_yn").append("=").append(esti_online_yn).append(",");
        sb.append("assign_amount").append("=").append(assign_amount).append(",");
        sb.append("budget_amt").append("=").append(budget_amt).append(",");
        sb.append("desing_amt").append("=").append(desing_amt).append(",");
        sb.append("estipr_attach_file_no").append("=").append(estipr_attach_file_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("ord_psn_nm").append("=").append(ord_psn_nm).append(",");
        sb.append("ord_helper").append("=").append(ord_helper).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("check_bid_succ").append("=").append(check_bid_succ).append(",");
        sb.append("charg_dept_cd").append("=").append(charg_dept_cd).append(",");
        sb.append("charg_dept_new_ymd").append("=").append(charg_dept_new_ymd).append(",");
        sb.append("charg_region_clsf").append("=").append(charg_region_clsf).append(",");
        sb.append("charg_divsn_dept").append("=").append(charg_divsn_dept).append(",");
        sb.append("elec_docu_no").append("=").append(elec_docu_no).append(",");
        sb.append("req_addtax").append("=").append(req_addtax).append(",");
        sb.append("delvr_ymd").append("=").append(delvr_ymd).append(",");
        sb.append("lic_chk_yn").append("=").append(lic_chk_yn).append(",");
        sb.append("pq_eval_rcp_type").append("=").append(pq_eval_rcp_type).append(",");
        sb.append("pq_eval_rcp_end_ymd").append("=").append(pq_eval_rcp_end_ymd).append(",");
        sb.append("service_type_cd").append("=").append(service_type_cd).append(",");
        sb.append("sw_score_apply_yn").append("=").append(sw_score_apply_yn).append(",");
        sb.append("his_bid_yn").append("=").append(his_bid_yn).append(",");
        sb.append("loc_duty_pub_outsource_yn").append("=").append(loc_duty_pub_outsource_yn).append(",");
        sb.append("pub_outsource_rate").append("=").append(pub_outsource_rate).append(",");
        sb.append("pub_outsource_loc1").append("=").append(pub_outsource_loc1).append(",");
        sb.append("pub_outsource_loc2").append("=").append(pub_outsource_loc2).append(",");
        sb.append("pub_outsource_loc3").append("=").append(pub_outsource_loc3).append(",");
        sb.append("pub_sup_vendno_limit_yn").append("=").append(pub_sup_vendno_limit_yn).append(",");
        sb.append("pub_sup_vendno").append("=").append(pub_sup_vendno).append(",");
        sb.append("fit_eval_judg").append("=").append(fit_eval_judg).append(",");
        sb.append("fit_eval_maincon_cd").append("=").append(fit_eval_maincon_cd).append(",");
        sb.append("fit_eval_maincon_esti_val").append("=").append(fit_eval_maincon_esti_val).append(",");
        sb.append("bid_part_limit_yn").append("=").append(bid_part_limit_yn).append(",");
        sb.append("gov_supply_val_gov").append("=").append(gov_supply_val_gov).append(",");
        sb.append("gov_supply_val_outsouce").append("=").append(gov_supply_val_outsouce).append(",");
        sb.append("filed_expn_charger").append("=").append(filed_expn_charger);
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
