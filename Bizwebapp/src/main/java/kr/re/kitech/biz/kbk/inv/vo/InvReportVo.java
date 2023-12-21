package kr.re.kitech.biz.kbk.inv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구보고서 상세")
public class InvReportVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public InvReportVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "등록일자", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "보고서명", physicalName = "rptp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_nm;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_psn;

    @ElDtoField(logicalName = "출간일", physicalName = "publ_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String publ_yr;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "사업분류", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "생기원발간", physicalName = "kitech_publc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kitech_publc_yn;

    @ElDtoField(logicalName = "첨부파일유무", physicalName = "attach_file_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_yn;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "보고서번호", physicalName = "rptp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_no;

    @ElDtoField(logicalName = "키워드", physicalName = "idx", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String idx;

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

    @ElVoField(physicalName = "rptp_nm")
    public String getRptp_nm(){
        return rptp_nm;
    }

    @ElVoField(physicalName = "rptp_nm")
    public void setRptp_nm(String rptp_nm){
        this.rptp_nm = rptp_nm;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public String getResch_respn_psn(){
        return resch_respn_psn;
    }

    @ElVoField(physicalName = "resch_respn_psn")
    public void setResch_respn_psn(String resch_respn_psn){
        this.resch_respn_psn = resch_respn_psn;
    }

    @ElVoField(physicalName = "publ_yr")
    public String getPubl_yr(){
        return publ_yr;
    }

    @ElVoField(physicalName = "publ_yr")
    public void setPubl_yr(String publ_yr){
        this.publ_yr = publ_yr;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public String getBsns_cd_bsns(){
        return bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public void setBsns_cd_bsns(String bsns_cd_bsns){
        this.bsns_cd_bsns = bsns_cd_bsns;
    }

    @ElVoField(physicalName = "kitech_publc_yn")
    public String getKitech_publc_yn(){
        return kitech_publc_yn;
    }

    @ElVoField(physicalName = "kitech_publc_yn")
    public void setKitech_publc_yn(String kitech_publc_yn){
        this.kitech_publc_yn = kitech_publc_yn;
    }

    @ElVoField(physicalName = "attach_file_yn")
    public String getAttach_file_yn(){
        return attach_file_yn;
    }

    @ElVoField(physicalName = "attach_file_yn")
    public void setAttach_file_yn(String attach_file_yn){
        this.attach_file_yn = attach_file_yn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rptp_no")
    public String getRptp_no(){
        return rptp_no;
    }

    @ElVoField(physicalName = "rptp_no")
    public void setRptp_no(String rptp_no){
        this.rptp_no = rptp_no;
    }

    @ElVoField(physicalName = "idx")
    public String getIdx(){
        return idx;
    }

    @ElVoField(physicalName = "idx")
    public void setIdx(String idx){
        this.idx = idx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvReportVo [");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("rptp_nm").append("=").append(rptp_nm).append(",");
        sb.append("resch_respn_psn").append("=").append(resch_respn_psn).append(",");
        sb.append("publ_yr").append("=").append(publ_yr).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("kitech_publc_yn").append("=").append(kitech_publc_yn).append(",");
        sb.append("attach_file_yn").append("=").append(attach_file_yn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rptp_no").append("=").append(rptp_no).append(",");
        sb.append("idx").append("=").append(idx);
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
