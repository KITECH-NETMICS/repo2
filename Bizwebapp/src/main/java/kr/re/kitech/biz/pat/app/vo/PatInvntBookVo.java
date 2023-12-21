package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재특허마스터VO")
public class PatInvntBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatInvntBookVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "상표의미", physicalName = "tm_mean", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tm_mean;

    @ElDtoField(logicalName = "상표설명", physicalName = "tm_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tm_desc;

    @ElDtoField(logicalName = "지정상품", physicalName = "appont_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_goods;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "출원시급도", physicalName = "smitapp_urgntgee", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_urgntgee;

    @ElDtoField(logicalName = "출원시급도이유", physicalName = "smitapp_urgntgee_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_urgntgee_resn;

    @ElDtoField(logicalName = "선행디자인유무", physicalName = "pre_desn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_desn_ex;

    @ElDtoField(logicalName = "선행디자인명", physicalName = "pre_desn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pre_desn_nm;

    @ElDtoField(logicalName = "디자인상세설명", physicalName = "desn_detls_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String desn_detls_desc;

    @ElDtoField(logicalName = "첨부파일1(첨부도면) ", physicalName = "attach_file_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_1;

    @ElDtoField(logicalName = "신청성명(프로그램)", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "신청주민등록번호", physicalName = "req_resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_resid_regst_no;

    @ElDtoField(logicalName = "신청주소", physicalName = "req_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_addr;

    @ElDtoField(logicalName = "신청전화번호", physicalName = "req_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_tel;

    @ElDtoField(logicalName = "저작자관계", physicalName = "auth_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_relat;

    @ElDtoField(logicalName = "명칭", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "창작연월일", physicalName = "crt_yr_mmdd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crt_yr_mmdd;

    @ElDtoField(logicalName = "공표연월일", physicalName = "notice_yrmon_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String notice_yrmon_ymd;

    @ElDtoField(logicalName = "복제물형태", physicalName = "replica_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String replica_shape;

    @ElDtoField(logicalName = "복제물형태명", physicalName = "replica_shape_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String replica_shape_nm;

    @ElDtoField(logicalName = "복제물수량", physicalName = "replica_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String replica_qty;

    @ElDtoField(logicalName = "저작자국문성명", physicalName = "auth_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_krn_nm;

    @ElDtoField(logicalName = "저작자영문성명", physicalName = "auth_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_eng_nm;

    @ElDtoField(logicalName = "저작자국적", physicalName = "auth_natnlt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_natnlt;

    @ElDtoField(logicalName = "저작자법인등록번호", physicalName = "auth_corp_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_corp_regst_no;

    @ElDtoField(logicalName = "저작자사업등록번호", physicalName = "auth_bsns_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_bsns_regst_no;

    @ElDtoField(logicalName = "저작자주소", physicalName = "auth_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_addr;

    @ElDtoField(logicalName = "저작자전화번호", physicalName = "auth_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_tel;

    @ElDtoField(logicalName = "저작자이메일", physicalName = "auth_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_email;

    @ElDtoField(logicalName = "저작자홈페이지", physicalName = "auth_homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String auth_homepg;

    @ElDtoField(logicalName = "프로그램종류코드", physicalName = "pgm_knd_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pgm_knd_cd;

    @ElDtoField(logicalName = "프로그램종류(대분류)", physicalName = "pgm_knd_big", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pgm_knd_big;

    @ElDtoField(logicalName = "프로그램종류(중분류)", physicalName = "pgm_knd_middle", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pgm_knd_middle;

    @ElDtoField(logicalName = "프로그램종류(소분류)", physicalName = "pgm_knd_small", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pgm_knd_small;

    @ElDtoField(logicalName = "적용분야", physicalName = "apply_fild", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apply_fild;

    @ElDtoField(logicalName = "특징", physicalName = "spclmark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spclmark;

    @ElDtoField(logicalName = "주요기능", physicalName = "major_skill", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_skill;

    @ElDtoField(logicalName = "사용방법", physicalName = "use_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_way;

    @ElDtoField(logicalName = "판매구분", physicalName = "sale_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sale_clsf;

    @ElDtoField(logicalName = "사용기종", physicalName = "use_model", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_model;

    @ElDtoField(logicalName = "사용기종기타", physicalName = "use_model_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_model_etc;

    @ElDtoField(logicalName = "사용OS", physicalName = "use_os", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_os;

    @ElDtoField(logicalName = "사용OS 기타", physicalName = "use_os_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_os_etc;

    @ElDtoField(logicalName = "사용OS명", physicalName = "use_os_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_os_nm;

    @ElDtoField(logicalName = "사용언어", physicalName = "use_lang", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_lang;

    @ElDtoField(logicalName = "사용언어기타", physicalName = "use_lang_etc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_lang_etc;

    @ElDtoField(logicalName = "사용언어명", physicalName = "use_lang_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_lang_nm;

    @ElDtoField(logicalName = "필요프로그램", physicalName = "need_pgm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String need_pgm;

    @ElDtoField(logicalName = "규모", physicalName = "scale", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scale;

    @ElDtoField(logicalName = "수임자성명", physicalName = "nmiee_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nmiee_nm;

    @ElDtoField(logicalName = "수임자주민등록번호", physicalName = "nmiee_resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nmiee_resid_regst_no;

    @ElDtoField(logicalName = "수임자주소", physicalName = "nmiee_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nmiee_addr;

    @ElDtoField(logicalName = "수임자전화번호", physicalName = "nmiee_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nmiee_tel;

    @ElDtoField(logicalName = "프로그램명칭", physicalName = "pgm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pgm_nm;

    @ElDtoField(logicalName = "위임사항", physicalName = "dlgate_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dlgate_item;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "tm_mean")
    public String getTm_mean(){
        return tm_mean;
    }

    @ElVoField(physicalName = "tm_mean")
    public void setTm_mean(String tm_mean){
        this.tm_mean = tm_mean;
    }

    @ElVoField(physicalName = "tm_desc")
    public String getTm_desc(){
        return tm_desc;
    }

    @ElVoField(physicalName = "tm_desc")
    public void setTm_desc(String tm_desc){
        this.tm_desc = tm_desc;
    }

    @ElVoField(physicalName = "appont_goods")
    public String getAppont_goods(){
        return appont_goods;
    }

    @ElVoField(physicalName = "appont_goods")
    public void setAppont_goods(String appont_goods){
        this.appont_goods = appont_goods;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "smitapp_urgntgee")
    public String getSmitapp_urgntgee(){
        return smitapp_urgntgee;
    }

    @ElVoField(physicalName = "smitapp_urgntgee")
    public void setSmitapp_urgntgee(String smitapp_urgntgee){
        this.smitapp_urgntgee = smitapp_urgntgee;
    }

    @ElVoField(physicalName = "smitapp_urgntgee_resn")
    public String getSmitapp_urgntgee_resn(){
        return smitapp_urgntgee_resn;
    }

    @ElVoField(physicalName = "smitapp_urgntgee_resn")
    public void setSmitapp_urgntgee_resn(String smitapp_urgntgee_resn){
        this.smitapp_urgntgee_resn = smitapp_urgntgee_resn;
    }

    @ElVoField(physicalName = "pre_desn_ex")
    public String getPre_desn_ex(){
        return pre_desn_ex;
    }

    @ElVoField(physicalName = "pre_desn_ex")
    public void setPre_desn_ex(String pre_desn_ex){
        this.pre_desn_ex = pre_desn_ex;
    }

    @ElVoField(physicalName = "pre_desn_nm")
    public String getPre_desn_nm(){
        return pre_desn_nm;
    }

    @ElVoField(physicalName = "pre_desn_nm")
    public void setPre_desn_nm(String pre_desn_nm){
        this.pre_desn_nm = pre_desn_nm;
    }

    @ElVoField(physicalName = "desn_detls_desc")
    public String getDesn_detls_desc(){
        return desn_detls_desc;
    }

    @ElVoField(physicalName = "desn_detls_desc")
    public void setDesn_detls_desc(String desn_detls_desc){
        this.desn_detls_desc = desn_detls_desc;
    }

    @ElVoField(physicalName = "attach_file_no_1")
    public String getAttach_file_no_1(){
        return attach_file_no_1;
    }

    @ElVoField(physicalName = "attach_file_no_1")
    public void setAttach_file_no_1(String attach_file_no_1){
        this.attach_file_no_1 = attach_file_no_1;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_resid_regst_no")
    public String getReq_resid_regst_no(){
        return req_resid_regst_no;
    }

    @ElVoField(physicalName = "req_resid_regst_no")
    public void setReq_resid_regst_no(String req_resid_regst_no){
        this.req_resid_regst_no = req_resid_regst_no;
    }

    @ElVoField(physicalName = "req_addr")
    public String getReq_addr(){
        return req_addr;
    }

    @ElVoField(physicalName = "req_addr")
    public void setReq_addr(String req_addr){
        this.req_addr = req_addr;
    }

    @ElVoField(physicalName = "req_tel")
    public String getReq_tel(){
        return req_tel;
    }

    @ElVoField(physicalName = "req_tel")
    public void setReq_tel(String req_tel){
        this.req_tel = req_tel;
    }

    @ElVoField(physicalName = "auth_relat")
    public String getAuth_relat(){
        return auth_relat;
    }

    @ElVoField(physicalName = "auth_relat")
    public void setAuth_relat(String auth_relat){
        this.auth_relat = auth_relat;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "crt_yr_mmdd")
    public String getCrt_yr_mmdd(){
        return crt_yr_mmdd;
    }

    @ElVoField(physicalName = "crt_yr_mmdd")
    public void setCrt_yr_mmdd(String crt_yr_mmdd){
        this.crt_yr_mmdd = crt_yr_mmdd;
    }

    @ElVoField(physicalName = "notice_yrmon_ymd")
    public String getNotice_yrmon_ymd(){
        return notice_yrmon_ymd;
    }

    @ElVoField(physicalName = "notice_yrmon_ymd")
    public void setNotice_yrmon_ymd(String notice_yrmon_ymd){
        this.notice_yrmon_ymd = notice_yrmon_ymd;
    }

    @ElVoField(physicalName = "replica_shape")
    public String getReplica_shape(){
        return replica_shape;
    }

    @ElVoField(physicalName = "replica_shape")
    public void setReplica_shape(String replica_shape){
        this.replica_shape = replica_shape;
    }

    @ElVoField(physicalName = "replica_shape_nm")
    public String getReplica_shape_nm(){
        return replica_shape_nm;
    }

    @ElVoField(physicalName = "replica_shape_nm")
    public void setReplica_shape_nm(String replica_shape_nm){
        this.replica_shape_nm = replica_shape_nm;
    }

    @ElVoField(physicalName = "replica_qty")
    public String getReplica_qty(){
        return replica_qty;
    }

    @ElVoField(physicalName = "replica_qty")
    public void setReplica_qty(String replica_qty){
        this.replica_qty = replica_qty;
    }

    @ElVoField(physicalName = "auth_krn_nm")
    public String getAuth_krn_nm(){
        return auth_krn_nm;
    }

    @ElVoField(physicalName = "auth_krn_nm")
    public void setAuth_krn_nm(String auth_krn_nm){
        this.auth_krn_nm = auth_krn_nm;
    }

    @ElVoField(physicalName = "auth_eng_nm")
    public String getAuth_eng_nm(){
        return auth_eng_nm;
    }

    @ElVoField(physicalName = "auth_eng_nm")
    public void setAuth_eng_nm(String auth_eng_nm){
        this.auth_eng_nm = auth_eng_nm;
    }

    @ElVoField(physicalName = "auth_natnlt")
    public String getAuth_natnlt(){
        return auth_natnlt;
    }

    @ElVoField(physicalName = "auth_natnlt")
    public void setAuth_natnlt(String auth_natnlt){
        this.auth_natnlt = auth_natnlt;
    }

    @ElVoField(physicalName = "auth_corp_regst_no")
    public String getAuth_corp_regst_no(){
        return auth_corp_regst_no;
    }

    @ElVoField(physicalName = "auth_corp_regst_no")
    public void setAuth_corp_regst_no(String auth_corp_regst_no){
        this.auth_corp_regst_no = auth_corp_regst_no;
    }

    @ElVoField(physicalName = "auth_bsns_regst_no")
    public String getAuth_bsns_regst_no(){
        return auth_bsns_regst_no;
    }

    @ElVoField(physicalName = "auth_bsns_regst_no")
    public void setAuth_bsns_regst_no(String auth_bsns_regst_no){
        this.auth_bsns_regst_no = auth_bsns_regst_no;
    }

    @ElVoField(physicalName = "auth_addr")
    public String getAuth_addr(){
        return auth_addr;
    }

    @ElVoField(physicalName = "auth_addr")
    public void setAuth_addr(String auth_addr){
        this.auth_addr = auth_addr;
    }

    @ElVoField(physicalName = "auth_tel")
    public String getAuth_tel(){
        return auth_tel;
    }

    @ElVoField(physicalName = "auth_tel")
    public void setAuth_tel(String auth_tel){
        this.auth_tel = auth_tel;
    }

    @ElVoField(physicalName = "auth_email")
    public String getAuth_email(){
        return auth_email;
    }

    @ElVoField(physicalName = "auth_email")
    public void setAuth_email(String auth_email){
        this.auth_email = auth_email;
    }

    @ElVoField(physicalName = "auth_homepg")
    public String getAuth_homepg(){
        return auth_homepg;
    }

    @ElVoField(physicalName = "auth_homepg")
    public void setAuth_homepg(String auth_homepg){
        this.auth_homepg = auth_homepg;
    }

    @ElVoField(physicalName = "pgm_knd_cd")
    public String getPgm_knd_cd(){
        return pgm_knd_cd;
    }

    @ElVoField(physicalName = "pgm_knd_cd")
    public void setPgm_knd_cd(String pgm_knd_cd){
        this.pgm_knd_cd = pgm_knd_cd;
    }

    @ElVoField(physicalName = "pgm_knd_big")
    public String getPgm_knd_big(){
        return pgm_knd_big;
    }

    @ElVoField(physicalName = "pgm_knd_big")
    public void setPgm_knd_big(String pgm_knd_big){
        this.pgm_knd_big = pgm_knd_big;
    }

    @ElVoField(physicalName = "pgm_knd_middle")
    public String getPgm_knd_middle(){
        return pgm_knd_middle;
    }

    @ElVoField(physicalName = "pgm_knd_middle")
    public void setPgm_knd_middle(String pgm_knd_middle){
        this.pgm_knd_middle = pgm_knd_middle;
    }

    @ElVoField(physicalName = "pgm_knd_small")
    public String getPgm_knd_small(){
        return pgm_knd_small;
    }

    @ElVoField(physicalName = "pgm_knd_small")
    public void setPgm_knd_small(String pgm_knd_small){
        this.pgm_knd_small = pgm_knd_small;
    }

    @ElVoField(physicalName = "apply_fild")
    public String getApply_fild(){
        return apply_fild;
    }

    @ElVoField(physicalName = "apply_fild")
    public void setApply_fild(String apply_fild){
        this.apply_fild = apply_fild;
    }

    @ElVoField(physicalName = "spclmark")
    public String getSpclmark(){
        return spclmark;
    }

    @ElVoField(physicalName = "spclmark")
    public void setSpclmark(String spclmark){
        this.spclmark = spclmark;
    }

    @ElVoField(physicalName = "major_skill")
    public String getMajor_skill(){
        return major_skill;
    }

    @ElVoField(physicalName = "major_skill")
    public void setMajor_skill(String major_skill){
        this.major_skill = major_skill;
    }

    @ElVoField(physicalName = "use_way")
    public String getUse_way(){
        return use_way;
    }

    @ElVoField(physicalName = "use_way")
    public void setUse_way(String use_way){
        this.use_way = use_way;
    }

    @ElVoField(physicalName = "sale_clsf")
    public String getSale_clsf(){
        return sale_clsf;
    }

    @ElVoField(physicalName = "sale_clsf")
    public void setSale_clsf(String sale_clsf){
        this.sale_clsf = sale_clsf;
    }

    @ElVoField(physicalName = "use_model")
    public String getUse_model(){
        return use_model;
    }

    @ElVoField(physicalName = "use_model")
    public void setUse_model(String use_model){
        this.use_model = use_model;
    }

    @ElVoField(physicalName = "use_model_etc")
    public String getUse_model_etc(){
        return use_model_etc;
    }

    @ElVoField(physicalName = "use_model_etc")
    public void setUse_model_etc(String use_model_etc){
        this.use_model_etc = use_model_etc;
    }

    @ElVoField(physicalName = "use_os")
    public String getUse_os(){
        return use_os;
    }

    @ElVoField(physicalName = "use_os")
    public void setUse_os(String use_os){
        this.use_os = use_os;
    }

    @ElVoField(physicalName = "use_os_etc")
    public String getUse_os_etc(){
        return use_os_etc;
    }

    @ElVoField(physicalName = "use_os_etc")
    public void setUse_os_etc(String use_os_etc){
        this.use_os_etc = use_os_etc;
    }

    @ElVoField(physicalName = "use_os_nm")
    public String getUse_os_nm(){
        return use_os_nm;
    }

    @ElVoField(physicalName = "use_os_nm")
    public void setUse_os_nm(String use_os_nm){
        this.use_os_nm = use_os_nm;
    }

    @ElVoField(physicalName = "use_lang")
    public String getUse_lang(){
        return use_lang;
    }

    @ElVoField(physicalName = "use_lang")
    public void setUse_lang(String use_lang){
        this.use_lang = use_lang;
    }

    @ElVoField(physicalName = "use_lang_etc")
    public String getUse_lang_etc(){
        return use_lang_etc;
    }

    @ElVoField(physicalName = "use_lang_etc")
    public void setUse_lang_etc(String use_lang_etc){
        this.use_lang_etc = use_lang_etc;
    }

    @ElVoField(physicalName = "use_lang_nm")
    public String getUse_lang_nm(){
        return use_lang_nm;
    }

    @ElVoField(physicalName = "use_lang_nm")
    public void setUse_lang_nm(String use_lang_nm){
        this.use_lang_nm = use_lang_nm;
    }

    @ElVoField(physicalName = "need_pgm")
    public String getNeed_pgm(){
        return need_pgm;
    }

    @ElVoField(physicalName = "need_pgm")
    public void setNeed_pgm(String need_pgm){
        this.need_pgm = need_pgm;
    }

    @ElVoField(physicalName = "scale")
    public String getScale(){
        return scale;
    }

    @ElVoField(physicalName = "scale")
    public void setScale(String scale){
        this.scale = scale;
    }

    @ElVoField(physicalName = "nmiee_nm")
    public String getNmiee_nm(){
        return nmiee_nm;
    }

    @ElVoField(physicalName = "nmiee_nm")
    public void setNmiee_nm(String nmiee_nm){
        this.nmiee_nm = nmiee_nm;
    }

    @ElVoField(physicalName = "nmiee_resid_regst_no")
    public String getNmiee_resid_regst_no(){
        return nmiee_resid_regst_no;
    }

    @ElVoField(physicalName = "nmiee_resid_regst_no")
    public void setNmiee_resid_regst_no(String nmiee_resid_regst_no){
        this.nmiee_resid_regst_no = nmiee_resid_regst_no;
    }

    @ElVoField(physicalName = "nmiee_addr")
    public String getNmiee_addr(){
        return nmiee_addr;
    }

    @ElVoField(physicalName = "nmiee_addr")
    public void setNmiee_addr(String nmiee_addr){
        this.nmiee_addr = nmiee_addr;
    }

    @ElVoField(physicalName = "nmiee_tel")
    public String getNmiee_tel(){
        return nmiee_tel;
    }

    @ElVoField(physicalName = "nmiee_tel")
    public void setNmiee_tel(String nmiee_tel){
        this.nmiee_tel = nmiee_tel;
    }

    @ElVoField(physicalName = "pgm_nm")
    public String getPgm_nm(){
        return pgm_nm;
    }

    @ElVoField(physicalName = "pgm_nm")
    public void setPgm_nm(String pgm_nm){
        this.pgm_nm = pgm_nm;
    }

    @ElVoField(physicalName = "dlgate_item")
    public String getDlgate_item(){
        return dlgate_item;
    }

    @ElVoField(physicalName = "dlgate_item")
    public void setDlgate_item(String dlgate_item){
        this.dlgate_item = dlgate_item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatInvntBookVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("tm_mean").append("=").append(tm_mean).append(",");
        sb.append("tm_desc").append("=").append(tm_desc).append(",");
        sb.append("appont_goods").append("=").append(appont_goods).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("smitapp_urgntgee").append("=").append(smitapp_urgntgee).append(",");
        sb.append("smitapp_urgntgee_resn").append("=").append(smitapp_urgntgee_resn).append(",");
        sb.append("pre_desn_ex").append("=").append(pre_desn_ex).append(",");
        sb.append("pre_desn_nm").append("=").append(pre_desn_nm).append(",");
        sb.append("desn_detls_desc").append("=").append(desn_detls_desc).append(",");
        sb.append("attach_file_no_1").append("=").append(attach_file_no_1).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_resid_regst_no").append("=").append(req_resid_regst_no).append(",");
        sb.append("req_addr").append("=").append(req_addr).append(",");
        sb.append("req_tel").append("=").append(req_tel).append(",");
        sb.append("auth_relat").append("=").append(auth_relat).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("crt_yr_mmdd").append("=").append(crt_yr_mmdd).append(",");
        sb.append("notice_yrmon_ymd").append("=").append(notice_yrmon_ymd).append(",");
        sb.append("replica_shape").append("=").append(replica_shape).append(",");
        sb.append("replica_shape_nm").append("=").append(replica_shape_nm).append(",");
        sb.append("replica_qty").append("=").append(replica_qty).append(",");
        sb.append("auth_krn_nm").append("=").append(auth_krn_nm).append(",");
        sb.append("auth_eng_nm").append("=").append(auth_eng_nm).append(",");
        sb.append("auth_natnlt").append("=").append(auth_natnlt).append(",");
        sb.append("auth_corp_regst_no").append("=").append(auth_corp_regst_no).append(",");
        sb.append("auth_bsns_regst_no").append("=").append(auth_bsns_regst_no).append(",");
        sb.append("auth_addr").append("=").append(auth_addr).append(",");
        sb.append("auth_tel").append("=").append(auth_tel).append(",");
        sb.append("auth_email").append("=").append(auth_email).append(",");
        sb.append("auth_homepg").append("=").append(auth_homepg).append(",");
        sb.append("pgm_knd_cd").append("=").append(pgm_knd_cd).append(",");
        sb.append("pgm_knd_big").append("=").append(pgm_knd_big).append(",");
        sb.append("pgm_knd_middle").append("=").append(pgm_knd_middle).append(",");
        sb.append("pgm_knd_small").append("=").append(pgm_knd_small).append(",");
        sb.append("apply_fild").append("=").append(apply_fild).append(",");
        sb.append("spclmark").append("=").append(spclmark).append(",");
        sb.append("major_skill").append("=").append(major_skill).append(",");
        sb.append("use_way").append("=").append(use_way).append(",");
        sb.append("sale_clsf").append("=").append(sale_clsf).append(",");
        sb.append("use_model").append("=").append(use_model).append(",");
        sb.append("use_model_etc").append("=").append(use_model_etc).append(",");
        sb.append("use_os").append("=").append(use_os).append(",");
        sb.append("use_os_etc").append("=").append(use_os_etc).append(",");
        sb.append("use_os_nm").append("=").append(use_os_nm).append(",");
        sb.append("use_lang").append("=").append(use_lang).append(",");
        sb.append("use_lang_etc").append("=").append(use_lang_etc).append(",");
        sb.append("use_lang_nm").append("=").append(use_lang_nm).append(",");
        sb.append("need_pgm").append("=").append(need_pgm).append(",");
        sb.append("scale").append("=").append(scale).append(",");
        sb.append("nmiee_nm").append("=").append(nmiee_nm).append(",");
        sb.append("nmiee_resid_regst_no").append("=").append(nmiee_resid_regst_no).append(",");
        sb.append("nmiee_addr").append("=").append(nmiee_addr).append(",");
        sb.append("nmiee_tel").append("=").append(nmiee_tel).append(",");
        sb.append("pgm_nm").append("=").append(pgm_nm).append(",");
        sb.append("dlgate_item").append("=").append(dlgate_item);
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
