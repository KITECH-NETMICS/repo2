package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구관리 공통코드 Vo")
public class ResBsnsCodeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBsnsCodeVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "연구번호", physicalName = "prj_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_cd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "관계부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "관계부처명", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "사업분류", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "사업분류명", physicalName = "bsns_cd_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_bsns_nm;

    @ElDtoField(logicalName = "내역사업", physicalName = "bsns_cd_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns;

    @ElDtoField(logicalName = "내역사업명", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "내외부구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "내외부구분명", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "전담기관", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "전담기관명", physicalName = "bsns_cd_exclsv_agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy_nm;

    @ElDtoField(logicalName = "OH흡수율", physicalName = "oh_absrp_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String oh_absrp_rt;

    @ElDtoField(logicalName = "계정담당자", physicalName = "accnt_mngmt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_mngmt_cd;

    @ElDtoField(logicalName = "bsns_cd", physicalName = "bsns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd;

    @ElDtoField(logicalName = "bsns_nm", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "prj_cd")
    public String getPrj_cd(){
        return prj_cd;
    }

    @ElVoField(physicalName = "prj_cd")
    public void setPrj_cd(String prj_cd){
        this.prj_cd = prj_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public String getBsns_cd_bsns(){
        return bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public void setBsns_cd_bsns(String bsns_cd_bsns){
        this.bsns_cd_bsns = bsns_cd_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public String getBsns_cd_bsns_nm(){
        return bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_bsns_nm")
    public void setBsns_cd_bsns_nm(String bsns_cd_bsns_nm){
        this.bsns_cd_bsns_nm = bsns_cd_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public String getBsns_cd_detls_bsns(){
        return bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public void setBsns_cd_detls_bsns(String bsns_cd_detls_bsns){
        this.bsns_cd_detls_bsns = bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy_nm")
    public String getBsns_cd_exclsv_agncy_nm(){
        return bsns_cd_exclsv_agncy_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy_nm")
    public void setBsns_cd_exclsv_agncy_nm(String bsns_cd_exclsv_agncy_nm){
        this.bsns_cd_exclsv_agncy_nm = bsns_cd_exclsv_agncy_nm;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public String getOh_absrp_rt(){
        return oh_absrp_rt;
    }

    @ElVoField(physicalName = "oh_absrp_rt")
    public void setOh_absrp_rt(String oh_absrp_rt){
        this.oh_absrp_rt = oh_absrp_rt;
    }

    @ElVoField(physicalName = "accnt_mngmt_cd")
    public String getAccnt_mngmt_cd(){
        return accnt_mngmt_cd;
    }

    @ElVoField(physicalName = "accnt_mngmt_cd")
    public void setAccnt_mngmt_cd(String accnt_mngmt_cd){
        this.accnt_mngmt_cd = accnt_mngmt_cd;
    }

    @ElVoField(physicalName = "bsns_cd")
    public String getBsns_cd(){
        return bsns_cd;
    }

    @ElVoField(physicalName = "bsns_cd")
    public void setBsns_cd(String bsns_cd){
        this.bsns_cd = bsns_cd;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBsnsCodeVo [");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("prj_cd").append("=").append(prj_cd).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("bsns_cd_bsns_nm").append("=").append(bsns_cd_bsns_nm).append(",");
        sb.append("bsns_cd_detls_bsns").append("=").append(bsns_cd_detls_bsns).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("bsns_cd_exclsv_agncy_nm").append("=").append(bsns_cd_exclsv_agncy_nm).append(",");
        sb.append("oh_absrp_rt").append("=").append(oh_absrp_rt).append(",");
        sb.append("accnt_mngmt_cd").append("=").append(accnt_mngmt_cd).append(",");
        sb.append("bsns_cd").append("=").append(bsns_cd).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm);
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
