package kr.re.kitech.biz.kbk.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발표논문 팝업 상세 Vo")
public class KbkPopPaperDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public KbkPopPaperDetailVo(){
    }

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "등록번호", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "참여연구원", physicalName = "attnce_reschr_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_reschr_psn;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_psn;

    @ElDtoField(logicalName = "논문명", physicalName = "paper_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_nm;

    @ElDtoField(logicalName = "게재지명", physicalName = "publpapr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publpapr_nm;

    @ElDtoField(logicalName = "권호", physicalName = "ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ed;

    @ElDtoField(logicalName = "게재일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "시작페이지", physicalName = "orign_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String orign_page;

    @ElDtoField(logicalName = "끝페이지", physicalName = "end_page", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_page;

    @ElDtoField(logicalName = "SCI구분", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "논문구분", physicalName = "paper_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_clsf;

    @ElDtoField(logicalName = "한술진흥재단등급부여", physicalName = "krf_grd_grant", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krf_grd_grant;

    @ElDtoField(logicalName = "자료유형", physicalName = "data_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_typ_cd;

    @ElDtoField(logicalName = "초록", physicalName = "abst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String abst;

    @ElDtoField(logicalName = "키워드", physicalName = "contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contnt;

    @ElDtoField(logicalName = "주기사항", physicalName = "cycle_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cycle_item;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "접수구분", physicalName = "rcpt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_clsf;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "action", physicalName = "action", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String action;

    @ElDtoField(logicalName = "accnt_rspns", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "attach_file", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "socty_yn", physicalName = "socty_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String socty_yn;

    @ElDtoField(logicalName = "clsf", physicalName = "clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf;

    @ElDtoField(logicalName = "issu_page_end", physicalName = "issu_page_end", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_page_end;

    @ElDtoField(logicalName = "issu_page_start", physicalName = "issu_page_start", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_page_start;

    @ElDtoField(logicalName = "prj_no_nm", physicalName = "prj_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no_nm;

    @ElDtoField(logicalName = "paper_clsf_cd", physicalName = "paper_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String paper_clsf_cd;

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "attnce_reschr_psn")
    public String getAttnce_reschr_psn(){
        return attnce_reschr_psn;
    }

    @ElVoField(physicalName = "attnce_reschr_psn")
    public void setAttnce_reschr_psn(String attnce_reschr_psn){
        this.attnce_reschr_psn = attnce_reschr_psn;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public String getResch_respn_psn(){
        return resch_respn_psn;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public void setResch_respn_psn(String resch_respn_psn){
        this.resch_respn_psn = resch_respn_psn;
    }

    @ElVoField(physicalName = "paper_nm")
    public String getPaper_nm(){
        return paper_nm;
    }

    @ElVoField(physicalName = "paper_nm")
    public void setPaper_nm(String paper_nm){
        this.paper_nm = paper_nm;
    }

    @ElVoField(physicalName = "publpapr_nm")
    public String getPublpapr_nm(){
        return publpapr_nm;
    }

    @ElVoField(physicalName = "publpapr_nm")
    public void setPublpapr_nm(String publpapr_nm){
        this.publpapr_nm = publpapr_nm;
    }

    @ElVoField(physicalName = "ed")
    public String getEd(){
        return ed;
    }

    @ElVoField(physicalName = "ed")
    public void setEd(String ed){
        this.ed = ed;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "orign_page")
    public String getOrign_page(){
        return orign_page;
    }

    @ElVoField(physicalName = "orign_page")
    public void setOrign_page(String orign_page){
        this.orign_page = orign_page;
    }

    @ElVoField(physicalName = "end_page")
    public String getEnd_page(){
        return end_page;
    }

    @ElVoField(physicalName = "end_page")
    public void setEnd_page(String end_page){
        this.end_page = end_page;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "paper_clsf")
    public String getPaper_clsf(){
        return paper_clsf;
    }

    @ElVoField(physicalName = "paper_clsf")
    public void setPaper_clsf(String paper_clsf){
        this.paper_clsf = paper_clsf;
    }

    @ElVoField(physicalName = "krf_grd_grant")
    public String getKrf_grd_grant(){
        return krf_grd_grant;
    }

    @ElVoField(physicalName = "krf_grd_grant")
    public void setKrf_grd_grant(String krf_grd_grant){
        this.krf_grd_grant = krf_grd_grant;
    }

    @ElVoField(physicalName = "data_typ_cd")
    public String getData_typ_cd(){
        return data_typ_cd;
    }

    @ElVoField(physicalName = "data_typ_cd")
    public void setData_typ_cd(String data_typ_cd){
        this.data_typ_cd = data_typ_cd;
    }

    @ElVoField(physicalName = "abst")
    public String getAbst(){
        return abst;
    }

    @ElVoField(physicalName = "abst")
    public void setAbst(String abst){
        this.abst = abst;
    }

    @ElVoField(physicalName = "contnt")
    public String getContnt(){
        return contnt;
    }

    @ElVoField(physicalName = "contnt")
    public void setContnt(String contnt){
        this.contnt = contnt;
    }

    @ElVoField(physicalName = "cycle_item")
    public String getCycle_item(){
        return cycle_item;
    }

    @ElVoField(physicalName = "cycle_item")
    public void setCycle_item(String cycle_item){
        this.cycle_item = cycle_item;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public String getRcpt_clsf(){
        return rcpt_clsf;
    }

    @ElVoField(physicalName = "rcpt_clsf")
    public void setRcpt_clsf(String rcpt_clsf){
        this.rcpt_clsf = rcpt_clsf;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "action")
    public String getAction(){
        return action;
    }

    @ElVoField(physicalName = "action")
    public void setAction(String action){
        this.action = action;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "socty_yn")
    public String getSocty_yn(){
        return socty_yn;
    }

    @ElVoField(physicalName = "socty_yn")
    public void setSocty_yn(String socty_yn){
        this.socty_yn = socty_yn;
    }

    @ElVoField(physicalName = "clsf")
    public String getClsf(){
        return clsf;
    }

    @ElVoField(physicalName = "clsf")
    public void setClsf(String clsf){
        this.clsf = clsf;
    }

    @ElVoField(physicalName = "issu_page_end")
    public String getIssu_page_end(){
        return issu_page_end;
    }

    @ElVoField(physicalName = "issu_page_end")
    public void setIssu_page_end(String issu_page_end){
        this.issu_page_end = issu_page_end;
    }

    @ElVoField(physicalName = "issu_page_start")
    public String getIssu_page_start(){
        return issu_page_start;
    }

    @ElVoField(physicalName = "issu_page_start")
    public void setIssu_page_start(String issu_page_start){
        this.issu_page_start = issu_page_start;
    }

    @ElVoField(physicalName = "prj_no_nm")
    public String getPrj_no_nm(){
        return prj_no_nm;
    }

    @ElVoField(physicalName = "prj_no_nm")
    public void setPrj_no_nm(String prj_no_nm){
        this.prj_no_nm = prj_no_nm;
    }

    @ElVoField(physicalName = "paper_clsf_cd")
    public String getPaper_clsf_cd(){
        return paper_clsf_cd;
    }

    @ElVoField(physicalName = "paper_clsf_cd")
    public void setPaper_clsf_cd(String paper_clsf_cd){
        this.paper_clsf_cd = paper_clsf_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KbkPopPaperDetailVo [");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("attnce_reschr_psn").append("=").append(attnce_reschr_psn).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("resch_respn_psn").append("=").append(resch_respn_psn).append(",");
        sb.append("paper_nm").append("=").append(paper_nm).append(",");
        sb.append("publpapr_nm").append("=").append(publpapr_nm).append(",");
        sb.append("ed").append("=").append(ed).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("orign_page").append("=").append(orign_page).append(",");
        sb.append("end_page").append("=").append(end_page).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("paper_clsf").append("=").append(paper_clsf).append(",");
        sb.append("krf_grd_grant").append("=").append(krf_grd_grant).append(",");
        sb.append("data_typ_cd").append("=").append(data_typ_cd).append(",");
        sb.append("abst").append("=").append(abst).append(",");
        sb.append("contnt").append("=").append(contnt).append(",");
        sb.append("cycle_item").append("=").append(cycle_item).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rcpt_clsf").append("=").append(rcpt_clsf).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("action").append("=").append(action).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("socty_yn").append("=").append(socty_yn).append(",");
        sb.append("clsf").append("=").append(clsf).append(",");
        sb.append("issu_page_end").append("=").append(issu_page_end).append(",");
        sb.append("issu_page_start").append("=").append(issu_page_start).append(",");
        sb.append("prj_no_nm").append("=").append(prj_no_nm).append(",");
        sb.append("paper_clsf_cd").append("=").append(paper_clsf_cd);
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
