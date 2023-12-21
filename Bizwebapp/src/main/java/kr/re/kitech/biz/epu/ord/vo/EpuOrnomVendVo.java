package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획-지명업체 Vo")
public class EpuOrnomVendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrnomVendVo(){
    }

    @ElDtoField(logicalName = "발주계획번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "업체명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "법인(주민)번호", physicalName = "corp_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_regst_no;

    @ElDtoField(logicalName = "대표자성명", physicalName = "ceo_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ceo_nm;

    @ElDtoField(logicalName = "우편번호", physicalName = "post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String post_no;

    @ElDtoField(logicalName = "거래처주소", physicalName = "vend_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_addr;

    @ElDtoField(logicalName = "업태", physicalName = "vend_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf;

    @ElDtoField(logicalName = "종목", physicalName = "vend_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_kind;

    @ElDtoField(logicalName = "전화번호", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "팩스번호", physicalName = "fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fax;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "등록자", physicalName = "regst_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_nm;

    @ElDtoField(logicalName = "대표여부", physicalName = "reprs_ceo_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_ceo_yn;

    @ElDtoField(logicalName = "지명업체(입찰설명회에서사용)", physicalName = "bid_nomi_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_nomi_yn;

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

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public String getCorp_regst_no(){
        return corp_regst_no;
    }

    @ElVoField(physicalName = "corp_regst_no")
    public void setCorp_regst_no(String corp_regst_no){
        this.corp_regst_no = corp_regst_no;
    }

    @ElVoField(physicalName = "ceo_nm")
    public String getCeo_nm(){
        return ceo_nm;
    }

    @ElVoField(physicalName = "ceo_nm")
    public void setCeo_nm(String ceo_nm){
        this.ceo_nm = ceo_nm;
    }

    @ElVoField(physicalName = "post_no")
    public String getPost_no(){
        return post_no;
    }

    @ElVoField(physicalName = "post_no")
    public void setPost_no(String post_no){
        this.post_no = post_no;
    }

    @ElVoField(physicalName = "vend_addr")
    public String getVend_addr(){
        return vend_addr;
    }

    @ElVoField(physicalName = "vend_addr")
    public void setVend_addr(String vend_addr){
        this.vend_addr = vend_addr;
    }

    @ElVoField(physicalName = "vend_clsf")
    public String getVend_clsf(){
        return vend_clsf;
    }

    @ElVoField(physicalName = "vend_clsf")
    public void setVend_clsf(String vend_clsf){
        this.vend_clsf = vend_clsf;
    }

    @ElVoField(physicalName = "vend_kind")
    public String getVend_kind(){
        return vend_kind;
    }

    @ElVoField(physicalName = "vend_kind")
    public void setVend_kind(String vend_kind){
        this.vend_kind = vend_kind;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "fax")
    public String getFax(){
        return fax;
    }

    @ElVoField(physicalName = "fax")
    public void setFax(String fax){
        this.fax = fax;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public String getRegst_psn_nm(){
        return regst_psn_nm;
    }

    @ElVoField(physicalName = "regst_psn_nm")
    public void setRegst_psn_nm(String regst_psn_nm){
        this.regst_psn_nm = regst_psn_nm;
    }

    @ElVoField(physicalName = "reprs_ceo_yn")
    public String getReprs_ceo_yn(){
        return reprs_ceo_yn;
    }

    @ElVoField(physicalName = "reprs_ceo_yn")
    public void setReprs_ceo_yn(String reprs_ceo_yn){
        this.reprs_ceo_yn = reprs_ceo_yn;
    }

    @ElVoField(physicalName = "bid_nomi_yn")
    public String getBid_nomi_yn(){
        return bid_nomi_yn;
    }

    @ElVoField(physicalName = "bid_nomi_yn")
    public void setBid_nomi_yn(String bid_nomi_yn){
        this.bid_nomi_yn = bid_nomi_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrnomVendVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("corp_regst_no").append("=").append(corp_regst_no).append(",");
        sb.append("ceo_nm").append("=").append(ceo_nm).append(",");
        sb.append("post_no").append("=").append(post_no).append(",");
        sb.append("vend_addr").append("=").append(vend_addr).append(",");
        sb.append("vend_clsf").append("=").append(vend_clsf).append(",");
        sb.append("vend_kind").append("=").append(vend_kind).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("fax").append("=").append(fax).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("regst_psn_nm").append("=").append(regst_psn_nm).append(",");
        sb.append("reprs_ceo_yn").append("=").append(reprs_ceo_yn).append(",");
        sb.append("bid_nomi_yn").append("=").append(bid_nomi_yn);
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
