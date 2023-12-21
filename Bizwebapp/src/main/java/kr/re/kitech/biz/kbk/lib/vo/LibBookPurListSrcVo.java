package kr.re.kitech.biz.kbk.lib.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "도서구입신청리스트조회VO")
public class LibBookPurListSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LibBookPurListSrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "센터코드", physicalName = "centr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_cd;

    @ElDtoField(logicalName = "센터명", physicalName = "centr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String centr_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "신청종류", physicalName = "book_pur_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_pur_typ;

    @ElDtoField(logicalName = "신청종류명", physicalName = "book_pur_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_pur_typ_nm;

    @ElDtoField(logicalName = "도서주소", physicalName = "book_info_url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_info_url;

    @ElDtoField(logicalName = "신청권수", physicalName = "req_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_qty;

    @ElDtoField(logicalName = "합계", physicalName = "tot_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_expns;

    @ElDtoField(logicalName = "도서명", physicalName = "book_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String book_nm;

    @ElDtoField(logicalName = "진행상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "진행상태명", physicalName = "prcs_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state_nm;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspaynm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
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

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "book_pur_typ")
    public String getBook_pur_typ(){
        return book_pur_typ;
    }

    @ElVoField(physicalName = "book_pur_typ")
    public void setBook_pur_typ(String book_pur_typ){
        this.book_pur_typ = book_pur_typ;
    }

    @ElVoField(physicalName = "book_pur_typ_nm")
    public String getBook_pur_typ_nm(){
        return book_pur_typ_nm;
    }

    @ElVoField(physicalName = "book_pur_typ_nm")
    public void setBook_pur_typ_nm(String book_pur_typ_nm){
        this.book_pur_typ_nm = book_pur_typ_nm;
    }

    @ElVoField(physicalName = "book_info_url")
    public String getBook_info_url(){
        return book_info_url;
    }

    @ElVoField(physicalName = "book_info_url")
    public void setBook_info_url(String book_info_url){
        this.book_info_url = book_info_url;
    }

    @ElVoField(physicalName = "req_qty")
    public String getReq_qty(){
        return req_qty;
    }

    @ElVoField(physicalName = "req_qty")
    public void setReq_qty(String req_qty){
        this.req_qty = req_qty;
    }

    @ElVoField(physicalName = "tot_expns")
    public String getTot_expns(){
        return tot_expns;
    }

    @ElVoField(physicalName = "tot_expns")
    public void setTot_expns(String tot_expns){
        this.tot_expns = tot_expns;
    }

    @ElVoField(physicalName = "book_nm")
    public String getBook_nm(){
        return book_nm;
    }

    @ElVoField(physicalName = "book_nm")
    public void setBook_nm(String book_nm){
        this.book_nm = book_nm;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public String getPrcs_state_nm(){
        return prcs_state_nm;
    }

    @ElVoField(physicalName = "prcs_state_nm")
    public void setPrcs_state_nm(String prcs_state_nm){
        this.prcs_state_nm = prcs_state_nm;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public String getReq_psn_syspaynm(){
        return req_psn_syspaynm;
    }

    @ElVoField(physicalName = "req_psn_syspaynm")
    public void setReq_psn_syspaynm(String req_psn_syspaynm){
        this.req_psn_syspaynm = req_psn_syspaynm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MlbBookPurcSrcVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("centr_cd").append("=").append(centr_cd).append(",");
        sb.append("centr_nm").append("=").append(centr_nm).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("book_pur_typ").append("=").append(book_pur_typ).append(",");
        sb.append("book_pur_typ_nm").append("=").append(book_pur_typ_nm).append(",");
        sb.append("book_info_url").append("=").append(book_info_url).append(",");
        sb.append("req_qty").append("=").append(req_qty).append(",");
        sb.append("tot_expns").append("=").append(tot_expns).append(",");
        sb.append("book_nm").append("=").append(book_nm).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("prcs_state_nm").append("=").append(prcs_state_nm).append(",");
        sb.append("req_psn_syspaynm").append("=").append(req_psn_syspaynm);
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
