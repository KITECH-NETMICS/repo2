package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "단행본 상세")
public class KbkPopReportDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopReportDetailVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "센터구분", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "보고서명", physicalName = "rptp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_nm;

    @ElDtoField(logicalName = "영문명", physicalName = "eng_rptp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_rptp_nm;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_psn;

    @ElDtoField(logicalName = "참여연구원", physicalName = "attnce_reschr_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_reschr_psn;

    @ElDtoField(logicalName = "연구번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "보고서번호", physicalName = "rptp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_no;

    @ElDtoField(logicalName = "출간일", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "내외부구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "전담기관", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "사업분류", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "내역사업", physicalName = "bsns_cd_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns;

    @ElDtoField(logicalName = "원외공개", physicalName = "outsd_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_open_yn;

    @ElDtoField(logicalName = "대외비만료일", physicalName = "outsd_unopn_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_unopn_cls_ymd;

    @ElDtoField(logicalName = "원내공개", physicalName = "insd_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_open_yn;

    @ElDtoField(logicalName = "대내비만료일", physicalName = "insd_unopn_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_unopn_cls_ymd;

    @ElDtoField(logicalName = "페이지", physicalName = "page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String page;

    @ElDtoField(logicalName = "생기원발간", physicalName = "kitech_publc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_publc_yn;

    @ElDtoField(logicalName = "키워드", physicalName = "idx", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String idx;

    @ElDtoField(logicalName = "초록", physicalName = "abst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abst;

    @ElDtoField(logicalName = "수기사항", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "prj_no_mst", physicalName = "prj_no_mst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_mst;

    @ElDtoField(logicalName = "prj_no_sub", physicalName = "prj_no_sub", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_sub;

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "bsns_cd_inout_nm", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "bsns_cd_ofic_nm", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "bsns_cd_exclsv_agncy_nm", physicalName = "bsns_cd_exclsv_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy_nm;

    @ElDtoField(logicalName = "bsns_cd_bsns_nm", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "bsns_cd_detls_bsns_nm", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "outsd_rptp_open_yn", physicalName = "outsd_rptp_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_rptp_open_yn;

    @ElDtoField(logicalName = "insd_rptp_open_yn", physicalName = "insd_rptp_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_rptp_open_yn;

    @ElDtoField(logicalName = "resch_contnt", physicalName = "resch_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_contnt;

    @ElDtoField(logicalName = "kwd", physicalName = "kwd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kwd;

    @ElDtoField(logicalName = "attach_file", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "outsd_unopn_prd_cls_ymd", physicalName = "outsd_unopn_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_unopn_prd_cls_ymd;

    @ElDtoField(logicalName = "insd_unopn_prd_cls_ymd", physicalName = "insd_unopn_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String insd_unopn_prd_cls_ymd;

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "centr_cd")
    public String getCentr_cd(){
        return centr_cd;
    }

    @ElVoField(physicalName = "centr_cd")
    public void setCentr_cd(String centr_cd){
        this.centr_cd = centr_cd;
    }

    @ElVoField(physicalName = "rptp_nm")
    public String getRptp_nm(){
        return rptp_nm;
    }

    @ElVoField(physicalName = "rptp_nm")
    public void setRptp_nm(String rptp_nm){
        this.rptp_nm = rptp_nm;
    }

    @ElVoField(physicalName = "eng_rptp_nm")
    public String getEng_rptp_nm(){
        return eng_rptp_nm;
    }

    @ElVoField(physicalName = "eng_rptp_nm")
    public void setEng_rptp_nm(String eng_rptp_nm){
        this.eng_rptp_nm = eng_rptp_nm;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public String getResch_respn_psn(){
        return resch_respn_psn;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public void setResch_respn_psn(String resch_respn_psn){
        this.resch_respn_psn = resch_respn_psn;
    }

    @ElVoField(physicalName = "attnce_reschr_psn")
    public String getAttnce_reschr_psn(){
        return attnce_reschr_psn;
    }

    @ElVoField(physicalName = "attnce_reschr_psn")
    public void setAttnce_reschr_psn(String attnce_reschr_psn){
        this.attnce_reschr_psn = attnce_reschr_psn;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "rptp_no")
    public String getRptp_no(){
        return rptp_no;
    }

    @ElVoField(physicalName = "rptp_no")
    public void setRptp_no(String rptp_no){
        this.rptp_no = rptp_no;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
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

    @ElVoField(physicalName = "outsd_open_yn")
    public String getOutsd_open_yn(){
        return outsd_open_yn;
    }

    @ElVoField(physicalName = "outsd_open_yn")
    public void setOutsd_open_yn(String outsd_open_yn){
        this.outsd_open_yn = outsd_open_yn;
    }

    @ElVoField(physicalName = "outsd_unopn_cls_ymd")
    public String getOutsd_unopn_cls_ymd(){
        return outsd_unopn_cls_ymd;
    }

    @ElVoField(physicalName = "outsd_unopn_cls_ymd")
    public void setOutsd_unopn_cls_ymd(String outsd_unopn_cls_ymd){
        this.outsd_unopn_cls_ymd = outsd_unopn_cls_ymd;
    }

    @ElVoField(physicalName = "insd_open_yn")
    public String getInsd_open_yn(){
        return insd_open_yn;
    }

    @ElVoField(physicalName = "insd_open_yn")
    public void setInsd_open_yn(String insd_open_yn){
        this.insd_open_yn = insd_open_yn;
    }

    @ElVoField(physicalName = "insd_unopn_cls_ymd")
    public String getInsd_unopn_cls_ymd(){
        return insd_unopn_cls_ymd;
    }

    @ElVoField(physicalName = "insd_unopn_cls_ymd")
    public void setInsd_unopn_cls_ymd(String insd_unopn_cls_ymd){
        this.insd_unopn_cls_ymd = insd_unopn_cls_ymd;
    }

    @ElVoField(physicalName = "page")
    public String getPage(){
        return page;
    }

    @ElVoField(physicalName = "page")
    public void setPage(String page){
        this.page = page;
    }

    @ElVoField(physicalName = "kitech_publc_yn")
    public String getKitech_publc_yn(){
        return kitech_publc_yn;
    }

    @ElVoField(physicalName = "kitech_publc_yn")
    public void setKitech_publc_yn(String kitech_publc_yn){
        this.kitech_publc_yn = kitech_publc_yn;
    }

    @ElVoField(physicalName = "idx")
    public String getIdx(){
        return idx;
    }

    @ElVoField(physicalName = "idx")
    public void setIdx(String idx){
        this.idx = idx;
    }

    @ElVoField(physicalName = "abst")
    public String getAbst(){
        return abst;
    }

    @ElVoField(physicalName = "abst")
    public void setAbst(String abst){
        this.abst = abst;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "prj_no_mst")
    public String getPrj_no_mst(){
        return prj_no_mst;
    }

    @ElVoField(physicalName = "prj_no_mst")
    public void setPrj_no_mst(String prj_no_mst){
        this.prj_no_mst = prj_no_mst;
    }

    @ElVoField(physicalName = "prj_no_sub")
    public String getPrj_no_sub(){
        return prj_no_sub;
    }

    @ElVoField(physicalName = "prj_no_sub")
    public void setPrj_no_sub(String prj_no_sub){
        this.prj_no_sub = prj_no_sub;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
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

    @ElVoField(physicalName = "outsd_rptp_open_yn")
    public String getOutsd_rptp_open_yn(){
        return outsd_rptp_open_yn;
    }

    @ElVoField(physicalName = "outsd_rptp_open_yn")
    public void setOutsd_rptp_open_yn(String outsd_rptp_open_yn){
        this.outsd_rptp_open_yn = outsd_rptp_open_yn;
    }

    @ElVoField(physicalName = "insd_rptp_open_yn")
    public String getInsd_rptp_open_yn(){
        return insd_rptp_open_yn;
    }

    @ElVoField(physicalName = "insd_rptp_open_yn")
    public void setInsd_rptp_open_yn(String insd_rptp_open_yn){
        this.insd_rptp_open_yn = insd_rptp_open_yn;
    }

    @ElVoField(physicalName = "resch_contnt")
    public String getResch_contnt(){
        return resch_contnt;
    }

    @ElVoField(physicalName = "resch_contnt")
    public void setResch_contnt(String resch_contnt){
        this.resch_contnt = resch_contnt;
    }

    @ElVoField(physicalName = "kwd")
    public String getKwd(){
        return kwd;
    }

    @ElVoField(physicalName = "kwd")
    public void setKwd(String kwd){
        this.kwd = kwd;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "outsd_unopn_prd_cls_ymd")
    public String getOutsd_unopn_prd_cls_ymd(){
        return outsd_unopn_prd_cls_ymd;
    }

    @ElVoField(physicalName = "outsd_unopn_prd_cls_ymd")
    public void setOutsd_unopn_prd_cls_ymd(String outsd_unopn_prd_cls_ymd){
        this.outsd_unopn_prd_cls_ymd = outsd_unopn_prd_cls_ymd;
    }

    @ElVoField(physicalName = "insd_unopn_prd_cls_ymd")
    public String getInsd_unopn_prd_cls_ymd(){
        return insd_unopn_prd_cls_ymd;
    }

    @ElVoField(physicalName = "insd_unopn_prd_cls_ymd")
    public void setInsd_unopn_prd_cls_ymd(String insd_unopn_prd_cls_ymd){
        this.insd_unopn_prd_cls_ymd = insd_unopn_prd_cls_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopReportDetailVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("rptp_nm").append("=").append(rptp_nm).append(",");
        sb.append("eng_rptp_nm").append("=").append(eng_rptp_nm).append(",");
        sb.append("resch_respn_psn").append("=").append(resch_respn_psn).append(",");
        sb.append("attnce_reschr_psn").append("=").append(attnce_reschr_psn).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("rptp_no").append("=").append(rptp_no).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("bsns_cd_detls_bsns").append("=").append(bsns_cd_detls_bsns).append(",");
        sb.append("outsd_open_yn").append("=").append(outsd_open_yn).append(",");
        sb.append("outsd_unopn_cls_ymd").append("=").append(outsd_unopn_cls_ymd).append(",");
        sb.append("insd_open_yn").append("=").append(insd_open_yn).append(",");
        sb.append("insd_unopn_cls_ymd").append("=").append(insd_unopn_cls_ymd).append(",");
        sb.append("page").append("=").append(page).append(",");
        sb.append("kitech_publc_yn").append("=").append(kitech_publc_yn).append(",");
        sb.append("idx").append("=").append(idx).append(",");
        sb.append("abst").append("=").append(abst).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("prj_no_mst").append("=").append(prj_no_mst).append(",");
        sb.append("prj_no_sub").append("=").append(prj_no_sub).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("bsns_cd_exclsv_agncy_nm").append("=").append(bsns_cd_exclsv_agncy_nm).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("outsd_rptp_open_yn").append("=").append(outsd_rptp_open_yn).append(",");
        sb.append("insd_rptp_open_yn").append("=").append(insd_rptp_open_yn).append(",");
        sb.append("resch_contnt").append("=").append(resch_contnt).append(",");
        sb.append("kwd").append("=").append(kwd).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("outsd_unopn_prd_cls_ymd").append("=").append(outsd_unopn_prd_cls_ymd).append(",");
        sb.append("insd_unopn_prd_cls_ymd").append("=").append(insd_unopn_prd_cls_ymd);
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
