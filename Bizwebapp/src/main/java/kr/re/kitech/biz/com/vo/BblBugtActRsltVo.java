package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예실팝업Vo")
public class BblBugtActRsltVo extends kr.re.kitech.biz.fin.com.vo.BugtActRsltVo {
    private static final long serialVersionUID = 1L;

    public BblBugtActRsltVo(){
    }

    @ElDtoField(logicalName = "금년집행", physicalName = "thyr_enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private long thyr_enfrc_amt;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "회계구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_clsf;

    @ElDtoField(logicalName = "종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "프로젝트번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String prj_no;

    @ElDtoField(logicalName = "사업분류", physicalName = "bsns_cd_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bsns_cd_bsns;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "비목해소기준명", physicalName = "itm_solve_base_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String itm_solve_base_nm;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_nm;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String itm_clsf_nm;

    @ElVoField(physicalName = "thyr_enfrc_amt")
    public long getThyr_enfrc_amt(){
        return thyr_enfrc_amt;
    }

    @ElVoField(physicalName = "thyr_enfrc_amt")
    public void setThyr_enfrc_amt(long thyr_enfrc_amt){
        this.thyr_enfrc_amt = thyr_enfrc_amt;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        String ret = this.accnt_cd_abbr;
        return ret;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        String ret = this.accnt_clsf;
        return ret;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        String ret = this.cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        String ret = this.start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        String ret = this.prj_no;
        return ret;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public String getBsns_cd_bsns(){
        String ret = this.bsns_cd_bsns;
        return ret;
    }

    @ElVoField(physicalName = "bsns_cd_bsns")
    public void setBsns_cd_bsns(String bsns_cd_bsns){
        this.bsns_cd_bsns = bsns_cd_bsns;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        String ret = this.accnt_no_nm;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public String getItm_solve_base_nm(){
        String ret = this.itm_solve_base_nm;
        return ret;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public void setItm_solve_base_nm(String itm_solve_base_nm){
        this.itm_solve_base_nm = itm_solve_base_nm;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        String ret = this.itm_solve_base;
        return ret;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "accnt_nm")
    public String getAccnt_nm(){
        String ret = this.accnt_nm;
        return ret;
    }

    @ElVoField(physicalName = "accnt_nm")
    public void setAccnt_nm(String accnt_nm){
        this.accnt_nm = accnt_nm;
    }

    @ElVoField(physicalName = "itm_clsf_nm")
    public String getItm_clsf_nm(){
        String ret = this.itm_clsf_nm;
        return ret;
    }

    @ElVoField(physicalName = "itm_clsf_nm")
    public void setItm_clsf_nm(String itm_clsf_nm){
        this.itm_clsf_nm = itm_clsf_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BblBugtActRsltVo [");
        sb.append("thyr_enfrc_amt").append("=").append(thyr_enfrc_amt).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("bsns_cd_bsns").append("=").append(bsns_cd_bsns).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("itm_solve_base_nm").append("=").append(itm_solve_base_nm).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("accnt_nm").append("=").append(accnt_nm).append(",");
        sb.append("itm_clsf_nm").append("=").append(itm_clsf_nm);
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
