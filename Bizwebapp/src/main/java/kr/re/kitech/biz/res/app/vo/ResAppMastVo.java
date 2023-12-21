package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 상세 정보 Vo")
public class ResAppMastVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppMastVo(){
    }

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "사업코드내외", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "사업코드부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "사업코드전담기관", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "사업코드사업", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "사업코드세부사업", physicalName = "bsns_cd_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns;

    @ElDtoField(logicalName = "사업코드내외(명)", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "사업코드부처(명)", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "사업코드전담기관(명)", physicalName = "bsns_cd_exclsv_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy_nm;

    @ElDtoField(logicalName = "사업코드사업(명)", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "사업코드세부사업(명)", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "과제영문명", physicalName = "prj_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_eng_nm;

    @ElDtoField(logicalName = "총연구비", physicalName = "tot_resch_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_amt;

    @ElDtoField(logicalName = "공급가액", physicalName = "suply_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String suply_value;

    @ElDtoField(logicalName = "부가세", physicalName = "tax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_amt;

    @ElDtoField(logicalName = "출연금부처", physicalName = "cntrbamt_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cntrbamt_ofic;

    @ElDtoField(logicalName = "주관연구기관", physicalName = "supvis_resch_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supvis_resch_agncy;

    @ElDtoField(logicalName = "협동연구기관", physicalName = "cooper_resch_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cooper_resch_agncy;

    @ElDtoField(logicalName = "공동연구기관", physicalName = "co_resch_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_resch_agncy;

    @ElDtoField(logicalName = "참여업체", physicalName = "attnce_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_vend;

    @ElDtoField(logicalName = "위탁기관", physicalName = "trust_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_agncy;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_rspns_main", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main;

    @ElDtoField(logicalName = "개인번호(연구책임자)", physicalName = "resch_rspns_main_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main_empno;

    @ElDtoField(logicalName = "성명(연구책임자)", physicalName = "resch_rspns_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main_nm;

    @ElDtoField(logicalName = "연구책임자 이메일", physicalName = "resch_rspns_main_mail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main_mail;

    @ElDtoField(logicalName = "과제형태", physicalName = "prj_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_shape;

    @ElDtoField(logicalName = "개발단계", physicalName = "dev_step", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_step;

    @ElDtoField(logicalName = "과제유형", physicalName = "prj_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_typ;

    @ElDtoField(logicalName = "기술유형", physicalName = "tech_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_typ;

    @ElDtoField(logicalName = "기술수명주기", physicalName = "tech_life_cycle", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_life_cycle;

    @ElDtoField(logicalName = "실용화대상여부", physicalName = "aplctn_objct_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aplctn_objct_yn;

    @ElDtoField(logicalName = "경제사회적목적", physicalName = "econo_soct_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String econo_soct_goal;

    @ElDtoField(logicalName = "6T관련기술", physicalName = "sixt_relat_tech", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sixt_relat_tech;

    @ElDtoField(logicalName = "6T관련기술세부", physicalName = "sixt_relat_tech_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sixt_relat_tech_detls;

    @ElDtoField(logicalName = "6T관련기술세부(명", physicalName = "sixt_relat_tech_detls_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sixt_relat_tech_detls_nm;

    @ElDtoField(logicalName = "총연구기간시작일자", physicalName = "tot_resch_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_orign_ymd;

    @ElDtoField(logicalName = "총연구기간종료일자", physicalName = "tot_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_resch_prd_cls_ymd;

    @ElDtoField(logicalName = "현단계연구기간시작일자", physicalName = "step_resch_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String step_resch_prd_orign_ymd;

    @ElDtoField(logicalName = "현단계연구기간종료일자", physicalName = "step_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String step_resch_prd_cls_ymd;

    @ElDtoField(logicalName = "현단계", physicalName = "cur_step", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cur_step;

    @ElDtoField(logicalName = "당해연구기간시작일자", physicalName = "thyr_resch_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_resch_prd_orign_ymd;

    @ElDtoField(logicalName = "당해연구기간종료일자", physicalName = "thyr_resch_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String thyr_resch_prd_cls_ymd;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "신청상태(명)", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "선정결과", physicalName = "selt_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_rst;

    @ElDtoField(logicalName = "선정결과(명)", physicalName = "selt_rst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_rst_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "선정일자", physicalName = "selt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_ymd;

    @ElDtoField(logicalName = "사유및특이사항", physicalName = "resn_and_unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resn_and_unusual_item;

    @ElDtoField(logicalName = "과제등록여부", physicalName = "prj_regst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_regst_yn;

    @ElDtoField(logicalName = "선정점수", physicalName = "selt_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_score;

    @ElDtoField(logicalName = "세부과제성격", physicalName = "detls_prj_charct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_prj_charct;

    @ElDtoField(logicalName = "과학기술표준분류", physicalName = "sci_tech_std_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_std_clsf;

    @ElDtoField(logicalName = "과학기술표준분류(명)", physicalName = "sci_tech_std_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_std_clsf_nm;

    @ElDtoField(logicalName = "NTRM분류", physicalName = "ntrm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntrm_clsf;

    @ElDtoField(logicalName = "NTRM분류(명)", physicalName = "ntrm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntrm_clsf_nm;

    @ElDtoField(logicalName = "개발목표", physicalName = "dev_goal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dev_goal;

    @ElDtoField(logicalName = "연구내용", physicalName = "resch_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_contnt;

    @ElDtoField(logicalName = "기대효과", physicalName = "expec_efct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expec_efct;

    @ElDtoField(logicalName = "키워드한글", physicalName = "kwd_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_krchar;

    @ElDtoField(logicalName = "키워드영문", physicalName = "kwd_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd_eng;

    @ElDtoField(logicalName = "보안과제유무", physicalName = "secrt_prj_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_ex;

    @ElDtoField(logicalName = "산업기술분류표", physicalName = "indst_tech_clsf_label", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf_label;

    @ElDtoField(logicalName = "산업기술분류표(명)", physicalName = "indst_tech_clsf_label_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indst_tech_clsf_label_nm;

    @ElDtoField(logicalName = "선행기획과제", physicalName = "pre_plan_prj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_plan_prj;

    @ElDtoField(logicalName = "선정 첨부파일", physicalName = "selt_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_attach_file_no;

    @ElDtoField(logicalName = "사업계획서(중간첨부파일)", physicalName = "middle_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String middle_attach_file;

    @ElDtoField(logicalName = "최종사업계획서(최종첨부파일)", physicalName = "final_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_attach_file;

    @ElDtoField(logicalName = "사업공고 첨부파일", physicalName = "bsns_notice_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_notice_attach_file_no;

    @ElDtoField(logicalName = "사업공고번호", physicalName = "bsns_notice_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_notice_no;

    @ElDtoField(logicalName = "총과제년수", physicalName = "tot_prj_yrs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_prj_yrs;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "연구책임자부서", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "연구책임자부서신설일자", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "작성자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "OH흡수율", physicalName = "oh_absrp_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oh_absrp_rt;

    @ElDtoField(logicalName = "메일발송여부(선정시)", physicalName = "mail_send_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_send_yn;

    @ElDtoField(logicalName = "가상계좌번호", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "국제공동연구과제여부", physicalName = "intrn_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intrn_use_ex;

    @ElDtoField(logicalName = "연구노트사용여부", physicalName = "note_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_use_ex;

    @ElDtoField(logicalName = "연구노트구분", physicalName = "note_type_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note_type_cd;

    @ElDtoField(logicalName = "과제구분", physicalName = "prj_card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_card_clsf;

    @ElDtoField(logicalName = "3책5공여부", physicalName = "threefive", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String threefive;

    @ElDtoField(logicalName = "3책5공제한사유", physicalName = "threefive_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String threefive_clsf;

    @ElDtoField(logicalName = "사업조정회의 심의여부", physicalName = "consider", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consider;

    @ElDtoField(logicalName = "사업조정회의 심의여부 제외기준", physicalName = "consider_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String consider_clsf;

    @ElDtoField(logicalName = "과세구분", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "비과세항목", physicalName = "tax_free_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_free_item;

    @ElDtoField(logicalName = "과세항목", physicalName = "tax_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_item;

    @ElDtoField(logicalName = "의뢰기관기업체여부", physicalName = "cmpy_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_yn;

    @ElDtoField(logicalName = "보안등급1점검여부", physicalName = "secu01_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secu01_yn;

    @ElDtoField(logicalName = "보안등급2점검여부", physicalName = "secu02_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secu02_yn;

    @ElDtoField(logicalName = "보안등급3점검여부", physicalName = "secu03_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secu03_yn;

    @ElDtoField(logicalName = "보안등급4점검여부", physicalName = "secu04_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secu04_yn;

    @ElDtoField(logicalName = "중소기업참여유형", physicalName = "wrk_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrk_clsf;

    @ElDtoField(logicalName = "위탁과제구분", physicalName = "trust_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_gb;

    @ElDtoField(logicalName = "총연구비", physicalName = "total_res_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long total_res_amt;

    @ElDtoField(logicalName = "현단계 연구비", physicalName = "step_res_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long step_res_amt;

    @ElDtoField(logicalName = "참여유형", physicalName = "part_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_clsf;

    @ElDtoField(logicalName = "통합관리단위", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "참여연구원 사전등록신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "참여연구원 사전등록신청번호(구)", physicalName = "cu_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cu_req_no;

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public String getBsns_cd_bsns(){
        return bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public void setBsns_cd_bsns(String bsns_cd_bsns){
        this.bsns_cd_bsns = bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public String getBsns_cd_detls_bsns(){
        return bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public void setBsns_cd_detls_bsns(String bsns_cd_detls_bsns){
        this.bsns_cd_detls_bsns = bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy_nm")
    public String getBsns_cd_exclsv_agncy_nm(){
        return bsns_cd_exclsv_agncy_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy_nm")
    public void setBsns_cd_exclsv_agncy_nm(String bsns_cd_exclsv_agncy_nm){
        this.bsns_cd_exclsv_agncy_nm = bsns_cd_exclsv_agncy_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public String getBsns_cd_bsns_nm(){
        return bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public void setBsns_cd_bsns_nm(String bsns_cd_bsns_nm){
        this.bsns_cd_bsns_nm = bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "prj_eng_nm")
    public String getPrj_eng_nm(){
        return prj_eng_nm;
    }

    @ElVoField(physicalName = "prj_eng_nm")
    public void setPrj_eng_nm(String prj_eng_nm){
        this.prj_eng_nm = prj_eng_nm;
    }

    @ElVoField(physicalName = "tot_resch_amt")
    public String getTot_resch_amt(){
        return tot_resch_amt;
    }

    @ElVoField(physicalName = "tot_resch_amt")
    public void setTot_resch_amt(String tot_resch_amt){
        this.tot_resch_amt = tot_resch_amt;
    }

    @ElVoField(physicalName = "suply_value")
    public String getSuply_value(){
        return suply_value;
    }

    @ElVoField(physicalName = "suply_value")
    public void setSuply_value(String suply_value){
        this.suply_value = suply_value;
    }

    @ElVoField(physicalName = "tax_amt")
    public String getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(String tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "cntrbamt_ofic")
    public String getCntrbamt_ofic(){
        return cntrbamt_ofic;
    }

    @ElVoField(physicalName = "cntrbamt_ofic")
    public void setCntrbamt_ofic(String cntrbamt_ofic){
        this.cntrbamt_ofic = cntrbamt_ofic;
    }

    @ElVoField(physicalName = "supvis_resch_agncy")
    public String getSupvis_resch_agncy(){
        return supvis_resch_agncy;
    }

    @ElVoField(physicalName = "supvis_resch_agncy")
    public void setSupvis_resch_agncy(String supvis_resch_agncy){
        this.supvis_resch_agncy = supvis_resch_agncy;
    }

    @ElVoField(physicalName = "cooper_resch_agncy")
    public String getCooper_resch_agncy(){
        return cooper_resch_agncy;
    }

    @ElVoField(physicalName = "cooper_resch_agncy")
    public void setCooper_resch_agncy(String cooper_resch_agncy){
        this.cooper_resch_agncy = cooper_resch_agncy;
    }

    @ElVoField(physicalName = "co_resch_agncy")
    public String getCo_resch_agncy(){
        return co_resch_agncy;
    }

    @ElVoField(physicalName = "co_resch_agncy")
    public void setCo_resch_agncy(String co_resch_agncy){
        this.co_resch_agncy = co_resch_agncy;
    }

    @ElVoField(physicalName = "attnce_vend")
    public String getAttnce_vend(){
        return attnce_vend;
    }

    @ElVoField(physicalName = "attnce_vend")
    public void setAttnce_vend(String attnce_vend){
        this.attnce_vend = attnce_vend;
    }

    @ElVoField(physicalName = "trust_agncy")
    public String getTrust_agncy(){
        return trust_agncy;
    }

    @ElVoField(physicalName = "trust_agncy")
    public void setTrust_agncy(String trust_agncy){
        this.trust_agncy = trust_agncy;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public String getResch_rspns_main(){
        return resch_rspns_main;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public void setResch_rspns_main(String resch_rspns_main){
        this.resch_rspns_main = resch_rspns_main;
    }

    @ElVoField(physicalName = "resch_rspns_main_empno")
    public String getResch_rspns_main_empno(){
        return resch_rspns_main_empno;
    }

    @ElVoField(physicalName = "resch_rspns_main_empno")
    public void setResch_rspns_main_empno(String resch_rspns_main_empno){
        this.resch_rspns_main_empno = resch_rspns_main_empno;
    }

    @ElVoField(physicalName = "resch_rspns_main_nm")
    public String getResch_rspns_main_nm(){
        return resch_rspns_main_nm;
    }

    @ElVoField(physicalName = "resch_rspns_main_nm")
    public void setResch_rspns_main_nm(String resch_rspns_main_nm){
        this.resch_rspns_main_nm = resch_rspns_main_nm;
    }

    @ElVoField(physicalName = "resch_rspns_main_mail")
    public String getResch_rspns_main_mail(){
        return resch_rspns_main_mail;
    }

    @ElVoField(physicalName = "resch_rspns_main_mail")
    public void setResch_rspns_main_mail(String resch_rspns_main_mail){
        this.resch_rspns_main_mail = resch_rspns_main_mail;
    }

    @ElVoField(physicalName = "prj_shape")
    public String getPrj_shape(){
        return prj_shape;
    }

    @ElVoField(physicalName = "prj_shape")
    public void setPrj_shape(String prj_shape){
        this.prj_shape = prj_shape;
    }

    @ElVoField(physicalName = "dev_step")
    public String getDev_step(){
        return dev_step;
    }

    @ElVoField(physicalName = "dev_step")
    public void setDev_step(String dev_step){
        this.dev_step = dev_step;
    }

    @ElVoField(physicalName = "prj_typ")
    public String getPrj_typ(){
        return prj_typ;
    }

    @ElVoField(physicalName = "prj_typ")
    public void setPrj_typ(String prj_typ){
        this.prj_typ = prj_typ;
    }

    @ElVoField(physicalName = "tech_typ")
    public String getTech_typ(){
        return tech_typ;
    }

    @ElVoField(physicalName = "tech_typ")
    public void setTech_typ(String tech_typ){
        this.tech_typ = tech_typ;
    }

    @ElVoField(physicalName = "tech_life_cycle")
    public String getTech_life_cycle(){
        return tech_life_cycle;
    }

    @ElVoField(physicalName = "tech_life_cycle")
    public void setTech_life_cycle(String tech_life_cycle){
        this.tech_life_cycle = tech_life_cycle;
    }

    @ElVoField(physicalName = "aplctn_objct_yn")
    public String getAplctn_objct_yn(){
        return aplctn_objct_yn;
    }

    @ElVoField(physicalName = "aplctn_objct_yn")
    public void setAplctn_objct_yn(String aplctn_objct_yn){
        this.aplctn_objct_yn = aplctn_objct_yn;
    }

    @ElVoField(physicalName = "econo_soct_goal")
    public String getEcono_soct_goal(){
        return econo_soct_goal;
    }

    @ElVoField(physicalName = "econo_soct_goal")
    public void setEcono_soct_goal(String econo_soct_goal){
        this.econo_soct_goal = econo_soct_goal;
    }

    @ElVoField(physicalName = "sixt_relat_tech")
    public String getSixt_relat_tech(){
        return sixt_relat_tech;
    }

    @ElVoField(physicalName = "sixt_relat_tech")
    public void setSixt_relat_tech(String sixt_relat_tech){
        this.sixt_relat_tech = sixt_relat_tech;
    }

    @ElVoField(physicalName = "sixt_relat_tech_detls")
    public String getSixt_relat_tech_detls(){
        return sixt_relat_tech_detls;
    }

    @ElVoField(physicalName = "sixt_relat_tech_detls")
    public void setSixt_relat_tech_detls(String sixt_relat_tech_detls){
        this.sixt_relat_tech_detls = sixt_relat_tech_detls;
    }

    @ElVoField(physicalName = "sixt_relat_tech_detls_nm")
    public String getSixt_relat_tech_detls_nm(){
        return sixt_relat_tech_detls_nm;
    }

    @ElVoField(physicalName = "sixt_relat_tech_detls_nm")
    public void setSixt_relat_tech_detls_nm(String sixt_relat_tech_detls_nm){
        this.sixt_relat_tech_detls_nm = sixt_relat_tech_detls_nm;
    }

    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public String getTot_resch_prd_orign_ymd(){
        return tot_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_orign_ymd")
    public void setTot_resch_prd_orign_ymd(String tot_resch_prd_orign_ymd){
        this.tot_resch_prd_orign_ymd = tot_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public String getTot_resch_prd_cls_ymd(){
        return tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "tot_resch_prd_cls_ymd")
    public void setTot_resch_prd_cls_ymd(String tot_resch_prd_cls_ymd){
        this.tot_resch_prd_cls_ymd = tot_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "step_resch_prd_orign_ymd")
    public String getStep_resch_prd_orign_ymd(){
        return step_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "step_resch_prd_orign_ymd")
    public void setStep_resch_prd_orign_ymd(String step_resch_prd_orign_ymd){
        this.step_resch_prd_orign_ymd = step_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "step_resch_prd_cls_ymd")
    public String getStep_resch_prd_cls_ymd(){
        return step_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "step_resch_prd_cls_ymd")
    public void setStep_resch_prd_cls_ymd(String step_resch_prd_cls_ymd){
        this.step_resch_prd_cls_ymd = step_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "cur_step")
    public String getCur_step(){
        return cur_step;
    }

    @ElVoField(physicalName = "cur_step")
    public void setCur_step(String cur_step){
        this.cur_step = cur_step;
    }

    @ElVoField(physicalName = "thyr_resch_prd_orign_ymd")
    public String getThyr_resch_prd_orign_ymd(){
        return thyr_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "thyr_resch_prd_orign_ymd")
    public void setThyr_resch_prd_orign_ymd(String thyr_resch_prd_orign_ymd){
        this.thyr_resch_prd_orign_ymd = thyr_resch_prd_orign_ymd;
    }

    @ElVoField(physicalName = "thyr_resch_prd_cls_ymd")
    public String getThyr_resch_prd_cls_ymd(){
        return thyr_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "thyr_resch_prd_cls_ymd")
    public void setThyr_resch_prd_cls_ymd(String thyr_resch_prd_cls_ymd){
        this.thyr_resch_prd_cls_ymd = thyr_resch_prd_cls_ymd;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "selt_rst")
    public String getSelt_rst(){
        return selt_rst;
    }

    @ElVoField(physicalName = "selt_rst")
    public void setSelt_rst(String selt_rst){
        this.selt_rst = selt_rst;
    }

    @ElVoField(physicalName = "selt_rst_nm")
    public String getSelt_rst_nm(){
        return selt_rst_nm;
    }

    @ElVoField(physicalName = "selt_rst_nm")
    public void setSelt_rst_nm(String selt_rst_nm){
        this.selt_rst_nm = selt_rst_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "selt_ymd")
    public String getSelt_ymd(){
        return selt_ymd;
    }

    @ElVoField(physicalName = "selt_ymd")
    public void setSelt_ymd(String selt_ymd){
        this.selt_ymd = selt_ymd;
    }

    @ElVoField(physicalName = "resn_and_unusual_item")
    public String getResn_and_unusual_item(){
        return resn_and_unusual_item;
    }

    @ElVoField(physicalName = "resn_and_unusual_item")
    public void setResn_and_unusual_item(String resn_and_unusual_item){
        this.resn_and_unusual_item = resn_and_unusual_item;
    }

    @ElVoField(physicalName = "prj_regst_yn")
    public String getPrj_regst_yn(){
        return prj_regst_yn;
    }

    @ElVoField(physicalName = "prj_regst_yn")
    public void setPrj_regst_yn(String prj_regst_yn){
        this.prj_regst_yn = prj_regst_yn;
    }

    @ElVoField(physicalName = "selt_score")
    public String getSelt_score(){
        return selt_score;
    }

    @ElVoField(physicalName = "selt_score")
    public void setSelt_score(String selt_score){
        this.selt_score = selt_score;
    }

    @ElVoField(physicalName = "detls_prj_charct")
    public String getDetls_prj_charct(){
        return detls_prj_charct;
    }

    @ElVoField(physicalName = "detls_prj_charct")
    public void setDetls_prj_charct(String detls_prj_charct){
        this.detls_prj_charct = detls_prj_charct;
    }

    @ElVoField(physicalName = "sci_tech_std_clsf")
    public String getSci_tech_std_clsf(){
        return sci_tech_std_clsf;
    }

    @ElVoField(physicalName = "sci_tech_std_clsf")
    public void setSci_tech_std_clsf(String sci_tech_std_clsf){
        this.sci_tech_std_clsf = sci_tech_std_clsf;
    }

    @ElVoField(physicalName = "sci_tech_std_clsf_nm")
    public String getSci_tech_std_clsf_nm(){
        return sci_tech_std_clsf_nm;
    }

    @ElVoField(physicalName = "sci_tech_std_clsf_nm")
    public void setSci_tech_std_clsf_nm(String sci_tech_std_clsf_nm){
        this.sci_tech_std_clsf_nm = sci_tech_std_clsf_nm;
    }

    @ElVoField(physicalName = "ntrm_clsf")
    public String getNtrm_clsf(){
        return ntrm_clsf;
    }

    @ElVoField(physicalName = "ntrm_clsf")
    public void setNtrm_clsf(String ntrm_clsf){
        this.ntrm_clsf = ntrm_clsf;
    }

    @ElVoField(physicalName = "ntrm_clsf_nm")
    public String getNtrm_clsf_nm(){
        return ntrm_clsf_nm;
    }

    @ElVoField(physicalName = "ntrm_clsf_nm")
    public void setNtrm_clsf_nm(String ntrm_clsf_nm){
        this.ntrm_clsf_nm = ntrm_clsf_nm;
    }

    @ElVoField(physicalName = "dev_goal")
    public String getDev_goal(){
        return dev_goal;
    }

    @ElVoField(physicalName = "dev_goal")
    public void setDev_goal(String dev_goal){
        this.dev_goal = dev_goal;
    }

    @ElVoField(physicalName = "resch_contnt")
    public String getResch_contnt(){
        return resch_contnt;
    }

    @ElVoField(physicalName = "resch_contnt")
    public void setResch_contnt(String resch_contnt){
        this.resch_contnt = resch_contnt;
    }

    @ElVoField(physicalName = "expec_efct")
    public String getExpec_efct(){
        return expec_efct;
    }

    @ElVoField(physicalName = "expec_efct")
    public void setExpec_efct(String expec_efct){
        this.expec_efct = expec_efct;
    }

    @ElVoField(physicalName = "kwd_krchar")
    public String getKwd_krchar(){
        return kwd_krchar;
    }

    @ElVoField(physicalName = "kwd_krchar")
    public void setKwd_krchar(String kwd_krchar){
        this.kwd_krchar = kwd_krchar;
    }

    @ElVoField(physicalName = "kwd_eng")
    public String getKwd_eng(){
        return kwd_eng;
    }

    @ElVoField(physicalName = "kwd_eng")
    public void setKwd_eng(String kwd_eng){
        this.kwd_eng = kwd_eng;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public String getSecrt_prj_ex(){
        return secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public void setSecrt_prj_ex(String secrt_prj_ex){
        this.secrt_prj_ex = secrt_prj_ex;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label")
    public String getIndst_tech_clsf_label(){
        return indst_tech_clsf_label;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label")
    public void setIndst_tech_clsf_label(String indst_tech_clsf_label){
        this.indst_tech_clsf_label = indst_tech_clsf_label;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label_nm")
    public String getIndst_tech_clsf_label_nm(){
        return indst_tech_clsf_label_nm;
    }

    @ElVoField(physicalName = "indst_tech_clsf_label_nm")
    public void setIndst_tech_clsf_label_nm(String indst_tech_clsf_label_nm){
        this.indst_tech_clsf_label_nm = indst_tech_clsf_label_nm;
    }

    @ElVoField(physicalName = "pre_plan_prj")
    public String getPre_plan_prj(){
        return pre_plan_prj;
    }

    @ElVoField(physicalName = "pre_plan_prj")
    public void setPre_plan_prj(String pre_plan_prj){
        this.pre_plan_prj = pre_plan_prj;
    }

    @ElVoField(physicalName = "selt_attach_file_no")
    public String getSelt_attach_file_no(){
        return selt_attach_file_no;
    }

    @ElVoField(physicalName = "selt_attach_file_no")
    public void setSelt_attach_file_no(String selt_attach_file_no){
        this.selt_attach_file_no = selt_attach_file_no;
    }

    @ElVoField(physicalName = "middle_attach_file")
    public String getMiddle_attach_file(){
        return middle_attach_file;
    }

    @ElVoField(physicalName = "middle_attach_file")
    public void setMiddle_attach_file(String middle_attach_file){
        this.middle_attach_file = middle_attach_file;
    }

    @ElVoField(physicalName = "final_attach_file")
    public String getFinal_attach_file(){
        return final_attach_file;
    }

    @ElVoField(physicalName = "final_attach_file")
    public void setFinal_attach_file(String final_attach_file){
        this.final_attach_file = final_attach_file;
    }

    @ElVoField(physicalName = "bsns_notice_attach_file_no")
    public String getBsns_notice_attach_file_no(){
        return bsns_notice_attach_file_no;
    }

    @ElVoField(physicalName = "bsns_notice_attach_file_no")
    public void setBsns_notice_attach_file_no(String bsns_notice_attach_file_no){
        this.bsns_notice_attach_file_no = bsns_notice_attach_file_no;
    }

    @ElVoField(physicalName = "bsns_notice_no")
    public String getBsns_notice_no(){
        return bsns_notice_no;
    }

    @ElVoField(physicalName = "bsns_notice_no")
    public void setBsns_notice_no(String bsns_notice_no){
        this.bsns_notice_no = bsns_notice_no;
    }

    @ElVoField(physicalName = "tot_prj_yrs")
    public String getTot_prj_yrs(){
        return tot_prj_yrs;
    }

    @ElVoField(physicalName = "tot_prj_yrs")
    public void setTot_prj_yrs(String tot_prj_yrs){
        this.tot_prj_yrs = tot_prj_yrs;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public String getOh_absrp_rt(){
        return oh_absrp_rt;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public void setOh_absrp_rt(String oh_absrp_rt){
        this.oh_absrp_rt = oh_absrp_rt;
    }

    @ElVoField(physicalName = "mail_send_yn")
    public String getMail_send_yn(){
        return mail_send_yn;
    }

    @ElVoField(physicalName = "mail_send_yn")
    public void setMail_send_yn(String mail_send_yn){
        this.mail_send_yn = mail_send_yn;
    }

    @ElVoField(physicalName = "vacct_no")
    public String getVacct_no(){
        return vacct_no;
    }

    @ElVoField(physicalName = "vacct_no")
    public void setVacct_no(String vacct_no){
        this.vacct_no = vacct_no;
    }

    @ElVoField(physicalName = "intrn_use_ex")
    public String getIntrn_use_ex(){
        return intrn_use_ex;
    }

    @ElVoField(physicalName = "intrn_use_ex")
    public void setIntrn_use_ex(String intrn_use_ex){
        this.intrn_use_ex = intrn_use_ex;
    }

    @ElVoField(physicalName = "note_use_ex")
    public String getNote_use_ex(){
        return note_use_ex;
    }

    @ElVoField(physicalName = "note_use_ex")
    public void setNote_use_ex(String note_use_ex){
        this.note_use_ex = note_use_ex;
    }

    @ElVoField(physicalName = "note_type_cd")
    public String getNote_type_cd(){
        return note_type_cd;
    }

    @ElVoField(physicalName = "note_type_cd")
    public void setNote_type_cd(String note_type_cd){
        this.note_type_cd = note_type_cd;
    }

    @ElVoField(physicalName = "prj_card_clsf")
    public String getPrj_card_clsf(){
        return prj_card_clsf;
    }

    @ElVoField(physicalName = "prj_card_clsf")
    public void setPrj_card_clsf(String prj_card_clsf){
        this.prj_card_clsf = prj_card_clsf;
    }

    @ElVoField(physicalName = "threefive")
    public String getThreefive(){
        return threefive;
    }

    @ElVoField(physicalName = "threefive")
    public void setThreefive(String threefive){
        this.threefive = threefive;
    }

    @ElVoField(physicalName = "threefive_clsf")
    public String getThreefive_clsf(){
        return threefive_clsf;
    }

    @ElVoField(physicalName = "threefive_clsf")
    public void setThreefive_clsf(String threefive_clsf){
        this.threefive_clsf = threefive_clsf;
    }

    @ElVoField(physicalName = "consider")
    public String getConsider(){
        return consider;
    }

    @ElVoField(physicalName = "consider")
    public void setConsider(String consider){
        this.consider = consider;
    }

    @ElVoField(physicalName = "consider_clsf")
    public String getConsider_clsf(){
        return consider_clsf;
    }

    @ElVoField(physicalName = "consider_clsf")
    public void setConsider_clsf(String consider_clsf){
        this.consider_clsf = consider_clsf;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "tax_free_item")
    public String getTax_free_item(){
        return tax_free_item;
    }

    @ElVoField(physicalName = "tax_free_item")
    public void setTax_free_item(String tax_free_item){
        this.tax_free_item = tax_free_item;
    }

    @ElVoField(physicalName = "tax_item")
    public String getTax_item(){
        return tax_item;
    }

    @ElVoField(physicalName = "tax_item")
    public void setTax_item(String tax_item){
        this.tax_item = tax_item;
    }

    @ElVoField(physicalName = "cmpy_yn")
    public String getCmpy_yn(){
        return cmpy_yn;
    }

    @ElVoField(physicalName = "cmpy_yn")
    public void setCmpy_yn(String cmpy_yn){
        this.cmpy_yn = cmpy_yn;
    }

    @ElVoField(physicalName = "secu01_yn")
    public String getSecu01_yn(){
        return secu01_yn;
    }

    @ElVoField(physicalName = "secu01_yn")
    public void setSecu01_yn(String secu01_yn){
        this.secu01_yn = secu01_yn;
    }

    @ElVoField(physicalName = "secu02_yn")
    public String getSecu02_yn(){
        return secu02_yn;
    }

    @ElVoField(physicalName = "secu02_yn")
    public void setSecu02_yn(String secu02_yn){
        this.secu02_yn = secu02_yn;
    }

    @ElVoField(physicalName = "secu03_yn")
    public String getSecu03_yn(){
        return secu03_yn;
    }

    @ElVoField(physicalName = "secu03_yn")
    public void setSecu03_yn(String secu03_yn){
        this.secu03_yn = secu03_yn;
    }

    @ElVoField(physicalName = "secu04_yn")
    public String getSecu04_yn(){
        return secu04_yn;
    }

    @ElVoField(physicalName = "secu04_yn")
    public void setSecu04_yn(String secu04_yn){
        this.secu04_yn = secu04_yn;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public String getWrk_clsf(){
        return wrk_clsf;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public void setWrk_clsf(String wrk_clsf){
        this.wrk_clsf = wrk_clsf;
    }

    @ElVoField(physicalName = "trust_gb")
    public String getTrust_gb(){
        return trust_gb;
    }

    @ElVoField(physicalName = "trust_gb")
    public void setTrust_gb(String trust_gb){
        this.trust_gb = trust_gb;
    }

    @ElVoField(physicalName = "total_res_amt")
    public long getTotal_res_amt(){
        return total_res_amt;
    }

    @ElVoField(physicalName = "total_res_amt")
    public void setTotal_res_amt(long total_res_amt){
        this.total_res_amt = total_res_amt;
    }

    @ElVoField(physicalName = "step_res_amt")
    public long getStep_res_amt(){
        return step_res_amt;
    }

    @ElVoField(physicalName = "step_res_amt")
    public void setStep_res_amt(long step_res_amt){
        this.step_res_amt = step_res_amt;
    }

    @ElVoField(physicalName = "part_clsf")
    public String getPart_clsf(){
        return part_clsf;
    }

    @ElVoField(physicalName = "part_clsf")
    public void setPart_clsf(String part_clsf){
        this.part_clsf = part_clsf;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "cu_req_no")
    public String getCu_req_no(){
        return cu_req_no;
    }

    @ElVoField(physicalName = "cu_req_no")
    public void setCu_req_no(String cu_req_no){
        this.cu_req_no = cu_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppMastVo [");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("bsns_cd_detls_bsns").append("=").append(bsns_cd_detls_bsns).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("bsns_cd_exclsv_agncy_nm").append("=").append(bsns_cd_exclsv_agncy_nm).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("prj_eng_nm").append("=").append(prj_eng_nm).append(",");
        sb.append("tot_resch_amt").append("=").append(tot_resch_amt).append(",");
        sb.append("suply_value").append("=").append(suply_value).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("cntrbamt_ofic").append("=").append(cntrbamt_ofic).append(",");
        sb.append("supvis_resch_agncy").append("=").append(supvis_resch_agncy).append(",");
        sb.append("cooper_resch_agncy").append("=").append(cooper_resch_agncy).append(",");
        sb.append("co_resch_agncy").append("=").append(co_resch_agncy).append(",");
        sb.append("attnce_vend").append("=").append(attnce_vend).append(",");
        sb.append("trust_agncy").append("=").append(trust_agncy).append(",");
        sb.append("resch_rspns_main").append("=").append(resch_rspns_main).append(",");
        sb.append("resch_rspns_main_empno").append("=").append(resch_rspns_main_empno).append(",");
        sb.append("resch_rspns_main_nm").append("=").append(resch_rspns_main_nm).append(",");
        sb.append("resch_rspns_main_mail").append("=").append(resch_rspns_main_mail).append(",");
        sb.append("prj_shape").append("=").append(prj_shape).append(",");
        sb.append("dev_step").append("=").append(dev_step).append(",");
        sb.append("prj_typ").append("=").append(prj_typ).append(",");
        sb.append("tech_typ").append("=").append(tech_typ).append(",");
        sb.append("tech_life_cycle").append("=").append(tech_life_cycle).append(",");
        sb.append("aplctn_objct_yn").append("=").append(aplctn_objct_yn).append(",");
        sb.append("econo_soct_goal").append("=").append(econo_soct_goal).append(",");
        sb.append("sixt_relat_tech").append("=").append(sixt_relat_tech).append(",");
        sb.append("sixt_relat_tech_detls").append("=").append(sixt_relat_tech_detls).append(",");
        sb.append("sixt_relat_tech_detls_nm").append("=").append(sixt_relat_tech_detls_nm).append(",");
        sb.append("tot_resch_prd_orign_ymd").append("=").append(tot_resch_prd_orign_ymd).append(",");
        sb.append("tot_resch_prd_cls_ymd").append("=").append(tot_resch_prd_cls_ymd).append(",");
        sb.append("step_resch_prd_orign_ymd").append("=").append(step_resch_prd_orign_ymd).append(",");
        sb.append("step_resch_prd_cls_ymd").append("=").append(step_resch_prd_cls_ymd).append(",");
        sb.append("cur_step").append("=").append(cur_step).append(",");
        sb.append("thyr_resch_prd_orign_ymd").append("=").append(thyr_resch_prd_orign_ymd).append(",");
        sb.append("thyr_resch_prd_cls_ymd").append("=").append(thyr_resch_prd_cls_ymd).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("selt_rst").append("=").append(selt_rst).append(",");
        sb.append("selt_rst_nm").append("=").append(selt_rst_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("selt_ymd").append("=").append(selt_ymd).append(",");
        sb.append("resn_and_unusual_item").append("=").append(resn_and_unusual_item).append(",");
        sb.append("prj_regst_yn").append("=").append(prj_regst_yn).append(",");
        sb.append("selt_score").append("=").append(selt_score).append(",");
        sb.append("detls_prj_charct").append("=").append(detls_prj_charct).append(",");
        sb.append("sci_tech_std_clsf").append("=").append(sci_tech_std_clsf).append(",");
        sb.append("sci_tech_std_clsf_nm").append("=").append(sci_tech_std_clsf_nm).append(",");
        sb.append("ntrm_clsf").append("=").append(ntrm_clsf).append(",");
        sb.append("ntrm_clsf_nm").append("=").append(ntrm_clsf_nm).append(",");
        sb.append("dev_goal").append("=").append(dev_goal).append(",");
        sb.append("resch_contnt").append("=").append(resch_contnt).append(",");
        sb.append("expec_efct").append("=").append(expec_efct).append(",");
        sb.append("kwd_krchar").append("=").append(kwd_krchar).append(",");
        sb.append("kwd_eng").append("=").append(kwd_eng).append(",");
        sb.append("secrt_prj_ex").append("=").append(secrt_prj_ex).append(",");
        sb.append("indst_tech_clsf_label").append("=").append(indst_tech_clsf_label).append(",");
        sb.append("indst_tech_clsf_label_nm").append("=").append(indst_tech_clsf_label_nm).append(",");
        sb.append("pre_plan_prj").append("=").append(pre_plan_prj).append(",");
        sb.append("selt_attach_file_no").append("=").append(selt_attach_file_no).append(",");
        sb.append("middle_attach_file").append("=").append(middle_attach_file).append(",");
        sb.append("final_attach_file").append("=").append(final_attach_file).append(",");
        sb.append("bsns_notice_attach_file_no").append("=").append(bsns_notice_attach_file_no).append(",");
        sb.append("bsns_notice_no").append("=").append(bsns_notice_no).append(",");
        sb.append("tot_prj_yrs").append("=").append(tot_prj_yrs).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("oh_absrp_rt").append("=").append(oh_absrp_rt).append(",");
        sb.append("mail_send_yn").append("=").append(mail_send_yn).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("intrn_use_ex").append("=").append(intrn_use_ex).append(",");
        sb.append("note_use_ex").append("=").append(note_use_ex).append(",");
        sb.append("note_type_cd").append("=").append(note_type_cd).append(",");
        sb.append("prj_card_clsf").append("=").append(prj_card_clsf).append(",");
        sb.append("threefive").append("=").append(threefive).append(",");
        sb.append("threefive_clsf").append("=").append(threefive_clsf).append(",");
        sb.append("consider").append("=").append(consider).append(",");
        sb.append("consider_clsf").append("=").append(consider_clsf).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("tax_free_item").append("=").append(tax_free_item).append(",");
        sb.append("tax_item").append("=").append(tax_item).append(",");
        sb.append("cmpy_yn").append("=").append(cmpy_yn).append(",");
        sb.append("secu01_yn").append("=").append(secu01_yn).append(",");
        sb.append("secu02_yn").append("=").append(secu02_yn).append(",");
        sb.append("secu03_yn").append("=").append(secu03_yn).append(",");
        sb.append("secu04_yn").append("=").append(secu04_yn).append(",");
        sb.append("wrk_clsf").append("=").append(wrk_clsf).append(",");
        sb.append("trust_gb").append("=").append(trust_gb).append(",");
        sb.append("total_res_amt").append("=").append(total_res_amt).append(",");
        sb.append("step_res_amt").append("=").append(step_res_amt).append(",");
        sb.append("part_clsf").append("=").append(part_clsf).append(",");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("cu_req_no").append("=").append(cu_req_no);
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
