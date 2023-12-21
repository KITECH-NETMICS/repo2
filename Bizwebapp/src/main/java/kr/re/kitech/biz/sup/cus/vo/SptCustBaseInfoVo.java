package kr.re.kitech.biz.sup.cus.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기업지원고객정보 Vo")
public class SptCustBaseInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCustBaseInfoVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "기관구분", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;

    @ElDtoField(logicalName = "국내외구분", physicalName = "dom_excpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_excpt_clsf;

    @ElDtoField(logicalName = "국가코드", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "국가명", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "기업명한글", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "기업명한글(㈜제외)", physicalName = "cmpy_nm_krchar_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar_odr;

    @ElDtoField(logicalName = "기업명영문", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "기업명영문약어", physicalName = "cmpy_nm_eng_short", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng_short;

    @ElDtoField(logicalName = "법인등록번호", physicalName = "corp_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_regst_no;

    @ElDtoField(logicalName = "대표자 ", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "대표자휴대폰번호 ", physicalName = "reprs_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_mobile_no;

    @ElDtoField(logicalName = "대표자이메일", physicalName = "reprs_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_email;

    @ElDtoField(logicalName = "창업일자", physicalName = "estb_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String estb_ymd;

    @ElDtoField(logicalName = "기업대표전화", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;

    @ElDtoField(logicalName = "기업팩스번호", physicalName = "cmpy_fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_fax_no;

    @ElDtoField(logicalName = "홈페이지", physicalName = "homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg;

    @ElDtoField(logicalName = "기업우편번호", physicalName = "cmpy_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_post_no;

    @ElDtoField(logicalName = "기업주소", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "기업주소상세", physicalName = "cmpy_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_detls;

    @ElDtoField(logicalName = "도로명주소", physicalName = "cmpy_addr_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_01;

    @ElDtoField(logicalName = "공장사용유무", physicalName = "factry_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_use_ex;

    @ElDtoField(logicalName = "공장우편번호", physicalName = "factry_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_post_no;

    @ElDtoField(logicalName = "공장주소", physicalName = "factry_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_addr;

    @ElDtoField(logicalName = "공장주소상세", physicalName = "factry_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_addr_detls;

    @ElDtoField(logicalName = "공장대표전화", physicalName = "factry_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_reprs_tel;

    @ElDtoField(logicalName = "공장팩스번호", physicalName = "factry_fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String factry_fax_no;

    @ElDtoField(logicalName = "업태", physicalName = "bizcatg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizcatg;

    @ElDtoField(logicalName = "항목", physicalName = "item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item;

    @ElDtoField(logicalName = "업종", physicalName = "biztyp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztyp;

    @ElDtoField(logicalName = "소재권역", physicalName = "region_prcond", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_prcond;

    @ElDtoField(logicalName = "영리/비영리구분", physicalName = "cmpy_typ_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ_clsf;

    @ElDtoField(logicalName = "기업유형", physicalName = "cmpy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ;

    @ElDtoField(logicalName = "표준산업분류", physicalName = "std_indst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_indst_clsf;

    @ElDtoField(logicalName = "표준산업분류작성일자", physicalName = "std_indst_regst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_indst_regst;

    @ElDtoField(logicalName = "표준산업분류작성자", physicalName = "std_indst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_indst_syspayno;

    @ElDtoField(logicalName = "주생산품목", physicalName = "main_prodct_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_prodct_item;

    @ElDtoField(logicalName = "폐업유무", physicalName = "closebiz_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_ex;

    @ElDtoField(logicalName = "폐업일자", physicalName = "closebiz_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_ymd;

    @ElDtoField(logicalName = "폐업사유", physicalName = "closebiz_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String closebiz_cause;

    @ElDtoField(logicalName = "대표구분", physicalName = "reprs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_clsf;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "작성완료구분", physicalName = "wrte_complt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_complt;

    @ElDtoField(logicalName = "경영, 연혁 작성완료구분", physicalName = "his_complt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_complt;

    @ElDtoField(logicalName = "표준거래처", physicalName = "std_cust", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_cust;

    @ElDtoField(logicalName = "사용유무", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "미사용사유", physicalName = "unuse_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_cause;

    @ElDtoField(logicalName = "신용등급", physicalName = "cr_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr_grd;

    @ElDtoField(logicalName = "기업상태", physicalName = "enp_scd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String enp_scd;

    @ElDtoField(logicalName = "기업형태", physicalName = "cmpy_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_kind;

    @ElDtoField(logicalName = "기업규모", physicalName = "cmpy_scale", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_scale;

    @ElDtoField(logicalName = "법인번호", physicalName = "cono_pid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cono_pid;

    @ElDtoField(logicalName = "표준산업분류", physicalName = "std_indst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std_indst_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "바우처가입여부", physicalName = "voucher_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String voucher_yn;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public String getDom_excpt_clsf(){
        return dom_excpt_clsf;
    }

    @ElVoField(physicalName = "dom_excpt_clsf")
    public void setDom_excpt_clsf(String dom_excpt_clsf){
        this.dom_excpt_clsf = dom_excpt_clsf;
    }

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
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

    @ElVoField(physicalName = "cmpy_nm_krchar_odr")
    public String getCmpy_nm_krchar_odr(){
        return cmpy_nm_krchar_odr;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar_odr")
    public void setCmpy_nm_krchar_odr(String cmpy_nm_krchar_odr){
        this.cmpy_nm_krchar_odr = cmpy_nm_krchar_odr;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public String getCmpy_nm_eng_short(){
        return cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public void setCmpy_nm_eng_short(String cmpy_nm_eng_short){
        this.cmpy_nm_eng_short = cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public String getCorp_regst_no(){
        return corp_regst_no;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public void setCorp_regst_no(String corp_regst_no){
        this.corp_regst_no = corp_regst_no;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn_mobile_no")
    public String getReprs_psn_mobile_no(){
        return reprs_psn_mobile_no;
    }

    @ElVoField(physicalName = "reprs_psn_mobile_no")
    public void setReprs_psn_mobile_no(String reprs_psn_mobile_no){
        this.reprs_psn_mobile_no = reprs_psn_mobile_no;
    }

    @ElVoField(physicalName = "reprs_psn_email")
    public String getReprs_psn_email(){
        return reprs_psn_email;
    }

    @ElVoField(physicalName = "reprs_psn_email")
    public void setReprs_psn_email(String reprs_psn_email){
        this.reprs_psn_email = reprs_psn_email;
    }

    @ElVoField(physicalName = "estb_ymd")
    public String getEstb_ymd(){
        return estb_ymd;
    }

    @ElVoField(physicalName = "estb_ymd")
    public void setEstb_ymd(String estb_ymd){
        this.estb_ymd = estb_ymd;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_fax_no")
    public String getCmpy_fax_no(){
        return cmpy_fax_no;
    }

    @ElVoField(physicalName = "cmpy_fax_no")
    public void setCmpy_fax_no(String cmpy_fax_no){
        this.cmpy_fax_no = cmpy_fax_no;
    }

    @ElVoField(physicalName = "homepg")
    public String getHomepg(){
        return homepg;
    }

    @ElVoField(physicalName = "homepg")
    public void setHomepg(String homepg){
        this.homepg = homepg;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public String getCmpy_post_no(){
        return cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public void setCmpy_post_no(String cmpy_post_no){
        this.cmpy_post_no = cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public String getCmpy_addr_detls(){
        return cmpy_addr_detls;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public void setCmpy_addr_detls(String cmpy_addr_detls){
        this.cmpy_addr_detls = cmpy_addr_detls;
    }

    @ElVoField(physicalName = "cmpy_addr_01")
    public String getCmpy_addr_01(){
        return cmpy_addr_01;
    }

    @ElVoField(physicalName = "cmpy_addr_01")
    public void setCmpy_addr_01(String cmpy_addr_01){
        this.cmpy_addr_01 = cmpy_addr_01;
    }

    @ElVoField(physicalName = "factry_use_ex")
    public String getFactry_use_ex(){
        return factry_use_ex;
    }

    @ElVoField(physicalName = "factry_use_ex")
    public void setFactry_use_ex(String factry_use_ex){
        this.factry_use_ex = factry_use_ex;
    }

    @ElVoField(physicalName = "factry_post_no")
    public String getFactry_post_no(){
        return factry_post_no;
    }

    @ElVoField(physicalName = "factry_post_no")
    public void setFactry_post_no(String factry_post_no){
        this.factry_post_no = factry_post_no;
    }

    @ElVoField(physicalName = "factry_addr")
    public String getFactry_addr(){
        return factry_addr;
    }

    @ElVoField(physicalName = "factry_addr")
    public void setFactry_addr(String factry_addr){
        this.factry_addr = factry_addr;
    }

    @ElVoField(physicalName = "factry_addr_detls")
    public String getFactry_addr_detls(){
        return factry_addr_detls;
    }

    @ElVoField(physicalName = "factry_addr_detls")
    public void setFactry_addr_detls(String factry_addr_detls){
        this.factry_addr_detls = factry_addr_detls;
    }

    @ElVoField(physicalName = "factry_reprs_tel")
    public String getFactry_reprs_tel(){
        return factry_reprs_tel;
    }

    @ElVoField(physicalName = "factry_reprs_tel")
    public void setFactry_reprs_tel(String factry_reprs_tel){
        this.factry_reprs_tel = factry_reprs_tel;
    }

    @ElVoField(physicalName = "factry_fax_no")
    public String getFactry_fax_no(){
        return factry_fax_no;
    }

    @ElVoField(physicalName = "factry_fax_no")
    public void setFactry_fax_no(String factry_fax_no){
        this.factry_fax_no = factry_fax_no;
    }

    @ElVoField(physicalName = "bizcatg")
    public String getBizcatg(){
        return bizcatg;
    }

    @ElVoField(physicalName = "bizcatg")
    public void setBizcatg(String bizcatg){
        this.bizcatg = bizcatg;
    }

    @ElVoField(physicalName = "item")
    public String getItem(){
        return item;
    }

    @ElVoField(physicalName = "item")
    public void setItem(String item){
        this.item = item;
    }

    @ElVoField(physicalName = "biztyp")
    public String getBiztyp(){
        return biztyp;
    }

    @ElVoField(physicalName = "biztyp")
    public void setBiztyp(String biztyp){
        this.biztyp = biztyp;
    }

    @ElVoField(physicalName = "region_prcond")
    public String getRegion_prcond(){
        return region_prcond;
    }

    @ElVoField(physicalName = "region_prcond")
    public void setRegion_prcond(String region_prcond){
        this.region_prcond = region_prcond;
    }

    @ElVoField(physicalName = "cmpy_typ_clsf")
    public String getCmpy_typ_clsf(){
        return cmpy_typ_clsf;
    }

    @ElVoField(physicalName = "cmpy_typ_clsf")
    public void setCmpy_typ_clsf(String cmpy_typ_clsf){
        this.cmpy_typ_clsf = cmpy_typ_clsf;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public String getCmpy_typ(){
        return cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public void setCmpy_typ(String cmpy_typ){
        this.cmpy_typ = cmpy_typ;
    }

    @ElVoField(physicalName = "std_indst_clsf")
    public String getStd_indst_clsf(){
        return std_indst_clsf;
    }

    @ElVoField(physicalName = "std_indst_clsf")
    public void setStd_indst_clsf(String std_indst_clsf){
        this.std_indst_clsf = std_indst_clsf;
    }

    @ElVoField(physicalName = "std_indst_regst")
    public String getStd_indst_regst(){
        return std_indst_regst;
    }

    @ElVoField(physicalName = "std_indst_regst")
    public void setStd_indst_regst(String std_indst_regst){
        this.std_indst_regst = std_indst_regst;
    }

    @ElVoField(physicalName = "std_indst_syspayno")
    public String getStd_indst_syspayno(){
        return std_indst_syspayno;
    }

    @ElVoField(physicalName = "std_indst_syspayno")
    public void setStd_indst_syspayno(String std_indst_syspayno){
        this.std_indst_syspayno = std_indst_syspayno;
    }

    @ElVoField(physicalName = "main_prodct_item")
    public String getMain_prodct_item(){
        return main_prodct_item;
    }

    @ElVoField(physicalName = "main_prodct_item")
    public void setMain_prodct_item(String main_prodct_item){
        this.main_prodct_item = main_prodct_item;
    }

    @ElVoField(physicalName = "closebiz_ex")
    public String getClosebiz_ex(){
        return closebiz_ex;
    }

    @ElVoField(physicalName = "closebiz_ex")
    public void setClosebiz_ex(String closebiz_ex){
        this.closebiz_ex = closebiz_ex;
    }

    @ElVoField(physicalName = "closebiz_ymd")
    public String getClosebiz_ymd(){
        return closebiz_ymd;
    }

    @ElVoField(physicalName = "closebiz_ymd")
    public void setClosebiz_ymd(String closebiz_ymd){
        this.closebiz_ymd = closebiz_ymd;
    }

    @ElVoField(physicalName = "closebiz_cause")
    public String getClosebiz_cause(){
        return closebiz_cause;
    }

    @ElVoField(physicalName = "closebiz_cause")
    public void setClosebiz_cause(String closebiz_cause){
        this.closebiz_cause = closebiz_cause;
    }

    @ElVoField(physicalName = "reprs_clsf")
    public String getReprs_clsf(){
        return reprs_clsf;
    }

    @ElVoField(physicalName = "reprs_clsf")
    public void setReprs_clsf(String reprs_clsf){
        this.reprs_clsf = reprs_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "wrte_complt")
    public String getWrte_complt(){
        return wrte_complt;
    }

    @ElVoField(physicalName = "wrte_complt")
    public void setWrte_complt(String wrte_complt){
        this.wrte_complt = wrte_complt;
    }

    @ElVoField(physicalName = "his_complt")
    public String getHis_complt(){
        return his_complt;
    }

    @ElVoField(physicalName = "his_complt")
    public void setHis_complt(String his_complt){
        this.his_complt = his_complt;
    }

    @ElVoField(physicalName = "std_cust")
    public String getStd_cust(){
        return std_cust;
    }

    @ElVoField(physicalName = "std_cust")
    public void setStd_cust(String std_cust){
        this.std_cust = std_cust;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "unuse_cause")
    public String getUnuse_cause(){
        return unuse_cause;
    }

    @ElVoField(physicalName = "unuse_cause")
    public void setUnuse_cause(String unuse_cause){
        this.unuse_cause = unuse_cause;
    }

    @ElVoField(physicalName = "cr_grd")
    public String getCr_grd(){
        return cr_grd;
    }

    @ElVoField(physicalName = "cr_grd")
    public void setCr_grd(String cr_grd){
        this.cr_grd = cr_grd;
    }

    @ElVoField(physicalName = "enp_scd")
    public String getEnp_scd(){
        return enp_scd;
    }

    @ElVoField(physicalName = "enp_scd")
    public void setEnp_scd(String enp_scd){
        this.enp_scd = enp_scd;
    }

    @ElVoField(physicalName = "cmpy_kind")
    public String getCmpy_kind(){
        return cmpy_kind;
    }

    @ElVoField(physicalName = "cmpy_kind")
    public void setCmpy_kind(String cmpy_kind){
        this.cmpy_kind = cmpy_kind;
    }

    @ElVoField(physicalName = "cmpy_scale")
    public String getCmpy_scale(){
        return cmpy_scale;
    }

    @ElVoField(physicalName = "cmpy_scale")
    public void setCmpy_scale(String cmpy_scale){
        this.cmpy_scale = cmpy_scale;
    }

    @ElVoField(physicalName = "cono_pid")
    public String getCono_pid(){
        return cono_pid;
    }

    @ElVoField(physicalName = "cono_pid")
    public void setCono_pid(String cono_pid){
        this.cono_pid = cono_pid;
    }

    @ElVoField(physicalName = "std_indst_nm")
    public String getStd_indst_nm(){
        return std_indst_nm;
    }

    @ElVoField(physicalName = "std_indst_nm")
    public void setStd_indst_nm(String std_indst_nm){
        this.std_indst_nm = std_indst_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "voucher_yn")
    public String getVoucher_yn(){
        return voucher_yn;
    }

    @ElVoField(physicalName = "voucher_yn")
    public void setVoucher_yn(String voucher_yn){
        this.voucher_yn = voucher_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCustBaseInfoVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
        sb.append("dom_excpt_clsf").append("=").append(dom_excpt_clsf).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("cmpy_nm_krchar_odr").append("=").append(cmpy_nm_krchar_odr).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("cmpy_nm_eng_short").append("=").append(cmpy_nm_eng_short).append(",");
        sb.append("corp_regst_no").append("=").append(corp_regst_no).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("reprs_psn_mobile_no").append("=").append(reprs_psn_mobile_no).append(",");
        sb.append("reprs_psn_email").append("=").append(reprs_psn_email).append(",");
        sb.append("estb_ymd").append("=").append(estb_ymd).append(",");
        sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
        sb.append("cmpy_fax_no").append("=").append(cmpy_fax_no).append(",");
        sb.append("homepg").append("=").append(homepg).append(",");
        sb.append("cmpy_post_no").append("=").append(cmpy_post_no).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("cmpy_addr_detls").append("=").append(cmpy_addr_detls).append(",");
        sb.append("cmpy_addr_01").append("=").append(cmpy_addr_01).append(",");
        sb.append("factry_use_ex").append("=").append(factry_use_ex).append(",");
        sb.append("factry_post_no").append("=").append(factry_post_no).append(",");
        sb.append("factry_addr").append("=").append(factry_addr).append(",");
        sb.append("factry_addr_detls").append("=").append(factry_addr_detls).append(",");
        sb.append("factry_reprs_tel").append("=").append(factry_reprs_tel).append(",");
        sb.append("factry_fax_no").append("=").append(factry_fax_no).append(",");
        sb.append("bizcatg").append("=").append(bizcatg).append(",");
        sb.append("item").append("=").append(item).append(",");
        sb.append("biztyp").append("=").append(biztyp).append(",");
        sb.append("region_prcond").append("=").append(region_prcond).append(",");
        sb.append("cmpy_typ_clsf").append("=").append(cmpy_typ_clsf).append(",");
        sb.append("cmpy_typ").append("=").append(cmpy_typ).append(",");
        sb.append("std_indst_clsf").append("=").append(std_indst_clsf).append(",");
        sb.append("std_indst_regst").append("=").append(std_indst_regst).append(",");
        sb.append("std_indst_syspayno").append("=").append(std_indst_syspayno).append(",");
        sb.append("main_prodct_item").append("=").append(main_prodct_item).append(",");
        sb.append("closebiz_ex").append("=").append(closebiz_ex).append(",");
        sb.append("closebiz_ymd").append("=").append(closebiz_ymd).append(",");
        sb.append("closebiz_cause").append("=").append(closebiz_cause).append(",");
        sb.append("reprs_clsf").append("=").append(reprs_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("wrte_complt").append("=").append(wrte_complt).append(",");
        sb.append("his_complt").append("=").append(his_complt).append(",");
        sb.append("std_cust").append("=").append(std_cust).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("unuse_cause").append("=").append(unuse_cause).append(",");
        sb.append("cr_grd").append("=").append(cr_grd).append(",");
        sb.append("enp_scd").append("=").append(enp_scd).append(",");
        sb.append("cmpy_kind").append("=").append(cmpy_kind).append(",");
        sb.append("cmpy_scale").append("=").append(cmpy_scale).append(",");
        sb.append("cono_pid").append("=").append(cono_pid).append(",");
        sb.append("std_indst_nm").append("=").append(std_indst_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("voucher_yn").append("=").append(voucher_yn);
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
