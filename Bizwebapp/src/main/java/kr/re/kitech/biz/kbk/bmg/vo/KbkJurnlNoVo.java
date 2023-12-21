package kr.re.kitech.biz.kbk.bmg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "저널관리번호VO")
public class KbkJurnlNoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkJurnlNoVo(){
    }

    @ElDtoField(logicalName = "저널번호", physicalName = "jurnl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_no;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "저널구분코드", physicalName = "jurnl_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_cd;

    @ElDtoField(logicalName = "저널구분명", physicalName = "jurnl_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_clsf_nm;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "도서등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "저널제목", physicalName = "jurnl_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String jurnl_subj;

    @ElDtoField(logicalName = "출판업체", physicalName = "publ_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_vend;

    @ElDtoField(logicalName = "출판구분코드", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "출판구분명", physicalName = "clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_nm;

    @ElDtoField(logicalName = "국가코드", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "국가명", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "대행업체", physicalName = "agent_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_vend;

    @ElDtoField(logicalName = "SCI구분코드", physicalName = "sci_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_clsf_cd;

    @ElDtoField(logicalName = "SCI구분명", physicalName = "sci_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_clsf_nm;

    @ElDtoField(logicalName = "발주번호", physicalName = "order_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_no;

    @ElDtoField(logicalName = "발주일자", physicalName = "order_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String order_ymd;

    @ElDtoField(logicalName = "구독여부", physicalName = "cont_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cont_yn;

    @ElDtoField(logicalName = "창간일자", physicalName = "startpubl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String startpubl_ymd;

    @ElDtoField(logicalName = "간기", physicalName = "imprnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt_cd;

    @ElDtoField(logicalName = "간기명", physicalName = "imprnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String imprnt_nm;

    @ElDtoField(logicalName = "최근입고예정일자", physicalName = "recent_wrhsg_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recent_wrhsg_schdl_ymd;

    @ElDtoField(logicalName = "유예기간", physicalName = "pspnmt_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pspnmt_time;

    @ElDtoField(logicalName = "후입고일자", physicalName = "aftr_wrhsg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aftr_wrhsg_ymd;

    @ElDtoField(logicalName = "주제분야", physicalName = "subj_fild", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subj_fild;

    @ElDtoField(logicalName = "생기원소장여부", physicalName = "kitech_owshp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_owshp_yn;

    @ElDtoField(logicalName = "생기원소장년도", physicalName = "kitech_owshp_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_owshp_yr;

    @ElDtoField(logicalName = "외부기관소장사항", physicalName = "out_agncy_owshp_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String out_agncy_owshp_item;

    @ElDtoField(logicalName = "전자저널제공사항", physicalName = "electr_jurnl_suply_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String electr_jurnl_suply_item;

    @ElDtoField(logicalName = "전자저널홈페이지주소", physicalName = "electr_jurnl_homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String electr_jurnl_homepg;

    @ElDtoField(logicalName = "출판년도", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "구입구분코드", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "구입구분명", physicalName = "pur_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_nm;

    @ElDtoField(logicalName = "전화번호", physicalName = "tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel;

    @ElDtoField(logicalName = "국제표준정기간행물번호", physicalName = "issn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issn;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "홈페이지주소", physicalName = "homepg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String homepg;

    @ElDtoField(logicalName = "통권여부", physicalName = "tong_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tong_yn;

    @ElDtoField(logicalName = "chk_contnt", physicalName = "chk_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk_contnt;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "등록자", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "jurnl_no")
    public String getJurnl_no(){
        return jurnl_no;
    }

    @ElVoField(physicalName = "jurnl_no")
    public void setJurnl_no(String jurnl_no){
        this.jurnl_no = jurnl_no;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "centr_nm")
    public String getCentr_nm(){
        return centr_nm;
    }

    @ElVoField(physicalName = "centr_nm")
    public void setCentr_nm(String centr_nm){
        this.centr_nm = centr_nm;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public String getJurnl_clsf_cd(){
        return jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "jurnl_clsf_cd")
    public void setJurnl_clsf_cd(String jurnl_clsf_cd){
        this.jurnl_clsf_cd = jurnl_clsf_cd;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public String getJurnl_clsf_nm(){
        return jurnl_clsf_nm;
    }

    @ElVoField(physicalName = "jurnl_clsf_nm")
    public void setJurnl_clsf_nm(String jurnl_clsf_nm){
        this.jurnl_clsf_nm = jurnl_clsf_nm;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public String getJurnl_subj(){
        return jurnl_subj;
    }

    @ElVoField(physicalName = "jurnl_subj")
    public void setJurnl_subj(String jurnl_subj){
        this.jurnl_subj = jurnl_subj;
    }

    @ElVoField(physicalName = "publ_vend")
    public String getPubl_vend(){
        return publ_vend;
    }

    @ElVoField(physicalName = "publ_vend")
    public void setPubl_vend(String publ_vend){
        this.publ_vend = publ_vend;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "clsf_nm")
    public String getClsf_nm(){
        return clsf_nm;
    }

    @ElVoField(physicalName = "clsf_nm")
    public void setClsf_nm(String clsf_nm){
        this.clsf_nm = clsf_nm;
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

    @ElVoField(physicalName = "agent_vend")
    public String getAgent_vend(){
        return agent_vend;
    }

    @ElVoField(physicalName = "agent_vend")
    public void setAgent_vend(String agent_vend){
        this.agent_vend = agent_vend;
    }

    @ElVoField(physicalName = "sci_clsf_cd")
    public String getSci_clsf_cd(){
        return sci_clsf_cd;
    }

    @ElVoField(physicalName = "sci_clsf_cd")
    public void setSci_clsf_cd(String sci_clsf_cd){
        this.sci_clsf_cd = sci_clsf_cd;
    }

    @ElVoField(physicalName = "sci_clsf_nm")
    public String getSci_clsf_nm(){
        return sci_clsf_nm;
    }

    @ElVoField(physicalName = "sci_clsf_nm")
    public void setSci_clsf_nm(String sci_clsf_nm){
        this.sci_clsf_nm = sci_clsf_nm;
    }

    @ElVoField(physicalName = "order_no")
    public String getOrder_no(){
        return order_no;
    }

    @ElVoField(physicalName = "order_no")
    public void setOrder_no(String order_no){
        this.order_no = order_no;
    }

    @ElVoField(physicalName = "order_ymd")
    public String getOrder_ymd(){
        return order_ymd;
    }

    @ElVoField(physicalName = "order_ymd")
    public void setOrder_ymd(String order_ymd){
        this.order_ymd = order_ymd;
    }

    @ElVoField(physicalName = "cont_yn")
    public String getCont_yn(){
        return cont_yn;
    }

    @ElVoField(physicalName = "cont_yn")
    public void setCont_yn(String cont_yn){
        this.cont_yn = cont_yn;
    }

    @ElVoField(physicalName = "startpubl_ymd")
    public String getStartpubl_ymd(){
        return startpubl_ymd;
    }

    @ElVoField(physicalName = "startpubl_ymd")
    public void setStartpubl_ymd(String startpubl_ymd){
        this.startpubl_ymd = startpubl_ymd;
    }

    @ElVoField(physicalName = "imprnt_cd")
    public String getImprnt_cd(){
        return imprnt_cd;
    }

    @ElVoField(physicalName = "imprnt_cd")
    public void setImprnt_cd(String imprnt_cd){
        this.imprnt_cd = imprnt_cd;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public String getImprnt_nm(){
        return imprnt_nm;
    }

    @ElVoField(physicalName = "imprnt_nm")
    public void setImprnt_nm(String imprnt_nm){
        this.imprnt_nm = imprnt_nm;
    }

    @ElVoField(physicalName = "recent_wrhsg_schdl_ymd")
    public String getRecent_wrhsg_schdl_ymd(){
        return recent_wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "recent_wrhsg_schdl_ymd")
    public void setRecent_wrhsg_schdl_ymd(String recent_wrhsg_schdl_ymd){
        this.recent_wrhsg_schdl_ymd = recent_wrhsg_schdl_ymd;
    }

    @ElVoField(physicalName = "pspnmt_time")
    public String getPspnmt_time(){
        return pspnmt_time;
    }

    @ElVoField(physicalName = "pspnmt_time")
    public void setPspnmt_time(String pspnmt_time){
        this.pspnmt_time = pspnmt_time;
    }

    @ElVoField(physicalName = "aftr_wrhsg_ymd")
    public String getAftr_wrhsg_ymd(){
        return aftr_wrhsg_ymd;
    }

    @ElVoField(physicalName = "aftr_wrhsg_ymd")
    public void setAftr_wrhsg_ymd(String aftr_wrhsg_ymd){
        this.aftr_wrhsg_ymd = aftr_wrhsg_ymd;
    }

    @ElVoField(physicalName = "subj_fild")
    public String getSubj_fild(){
        return subj_fild;
    }

    @ElVoField(physicalName = "subj_fild")
    public void setSubj_fild(String subj_fild){
        this.subj_fild = subj_fild;
    }

    @ElVoField(physicalName = "kitech_owshp_yn")
    public String getKitech_owshp_yn(){
        return kitech_owshp_yn;
    }

    @ElVoField(physicalName = "kitech_owshp_yn")
    public void setKitech_owshp_yn(String kitech_owshp_yn){
        this.kitech_owshp_yn = kitech_owshp_yn;
    }

    @ElVoField(physicalName = "kitech_owshp_yr")
    public String getKitech_owshp_yr(){
        return kitech_owshp_yr;
    }

    @ElVoField(physicalName = "kitech_owshp_yr")
    public void setKitech_owshp_yr(String kitech_owshp_yr){
        this.kitech_owshp_yr = kitech_owshp_yr;
    }

    @ElVoField(physicalName = "out_agncy_owshp_item")
    public String getOut_agncy_owshp_item(){
        return out_agncy_owshp_item;
    }

    @ElVoField(physicalName = "out_agncy_owshp_item")
    public void setOut_agncy_owshp_item(String out_agncy_owshp_item){
        this.out_agncy_owshp_item = out_agncy_owshp_item;
    }

    @ElVoField(physicalName = "electr_jurnl_suply_item")
    public String getElectr_jurnl_suply_item(){
        return electr_jurnl_suply_item;
    }

    @ElVoField(physicalName = "electr_jurnl_suply_item")
    public void setElectr_jurnl_suply_item(String electr_jurnl_suply_item){
        this.electr_jurnl_suply_item = electr_jurnl_suply_item;
    }

    @ElVoField(physicalName = "electr_jurnl_homepg")
    public String getElectr_jurnl_homepg(){
        return electr_jurnl_homepg;
    }

    @ElVoField(physicalName = "electr_jurnl_homepg")
    public void setElectr_jurnl_homepg(String electr_jurnl_homepg){
        this.electr_jurnl_homepg = electr_jurnl_homepg;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_nm")
    public String getPur_clsf_nm(){
        return pur_clsf_nm;
    }

    @ElVoField(physicalName = "pur_clsf_nm")
    public void setPur_clsf_nm(String pur_clsf_nm){
        this.pur_clsf_nm = pur_clsf_nm;
    }

    @ElVoField(physicalName = "tel")
    public String getTel(){
        return tel;
    }

    @ElVoField(physicalName = "tel")
    public void setTel(String tel){
        this.tel = tel;
    }

    @ElVoField(physicalName = "issn")
    public String getIssn(){
        return issn;
    }

    @ElVoField(physicalName = "issn")
    public void setIssn(String issn){
        this.issn = issn;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "homepg")
    public String getHomepg(){
        return homepg;
    }

    @ElVoField(physicalName = "homepg")
    public void setHomepg(String homepg){
        this.homepg = homepg;
    }

    @ElVoField(physicalName = "tong_yn")
    public String getTong_yn(){
        return tong_yn;
    }

    @ElVoField(physicalName = "tong_yn")
    public void setTong_yn(String tong_yn){
        this.tong_yn = tong_yn;
    }

    @ElVoField(physicalName = "chk_contnt")
    public String getChk_contnt(){
        return chk_contnt;
    }

    @ElVoField(physicalName = "chk_contnt")
    public void setChk_contnt(String chk_contnt){
        this.chk_contnt = chk_contnt;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkJurnlNoVo [");
        sb.append("jurnl_no").append("=").append(jurnl_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("jurnl_clsf_cd").append("=").append(jurnl_clsf_cd).append(",");
        sb.append("jurnl_clsf_nm").append("=").append(jurnl_clsf_nm).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("jurnl_subj").append("=").append(jurnl_subj).append(",");
        sb.append("publ_vend").append("=").append(publ_vend).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("clsf_nm").append("=").append(clsf_nm).append(",");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("agent_vend").append("=").append(agent_vend).append(",");
        sb.append("sci_clsf_cd").append("=").append(sci_clsf_cd).append(",");
        sb.append("sci_clsf_nm").append("=").append(sci_clsf_nm).append(",");
        sb.append("order_no").append("=").append(order_no).append(",");
        sb.append("order_ymd").append("=").append(order_ymd).append(",");
        sb.append("cont_yn").append("=").append(cont_yn).append(",");
        sb.append("startpubl_ymd").append("=").append(startpubl_ymd).append(",");
        sb.append("imprnt_cd").append("=").append(imprnt_cd).append(",");
        sb.append("imprnt_nm").append("=").append(imprnt_nm).append(",");
        sb.append("recent_wrhsg_schdl_ymd").append("=").append(recent_wrhsg_schdl_ymd).append(",");
        sb.append("pspnmt_time").append("=").append(pspnmt_time).append(",");
        sb.append("aftr_wrhsg_ymd").append("=").append(aftr_wrhsg_ymd).append(",");
        sb.append("subj_fild").append("=").append(subj_fild).append(",");
        sb.append("kitech_owshp_yn").append("=").append(kitech_owshp_yn).append(",");
        sb.append("kitech_owshp_yr").append("=").append(kitech_owshp_yr).append(",");
        sb.append("out_agncy_owshp_item").append("=").append(out_agncy_owshp_item).append(",");
        sb.append("electr_jurnl_suply_item").append("=").append(electr_jurnl_suply_item).append(",");
        sb.append("electr_jurnl_homepg").append("=").append(electr_jurnl_homepg).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("pur_clsf_nm").append("=").append(pur_clsf_nm).append(",");
        sb.append("tel").append("=").append(tel).append(",");
        sb.append("issn").append("=").append(issn).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("homepg").append("=").append(homepg).append(",");
        sb.append("tong_yn").append("=").append(tong_yn).append(",");
        sb.append("chk_contnt").append("=").append(chk_contnt).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
