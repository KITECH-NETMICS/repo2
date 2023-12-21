package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "BeaipaExp")
public class BeaipaVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BeaipaVo(){
    }

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "unslipOdr", physicalName = "unslip_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_odr;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "paymAmt", physicalName = "paym_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int paym_amt;

    @ElDtoField(logicalName = "ptcnRt", physicalName = "ptcn_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ptcn_rt;

    @ElDtoField(logicalName = "usrNm", physicalName = "usr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usr_nm;

    @ElDtoField(logicalName = "resRegNo", physicalName = "res_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_reg_no;

    @ElDtoField(logicalName = "ptcnStrDt", physicalName = "ptcn_str_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ptcn_str_dt;

    @ElDtoField(logicalName = "ptcnEndDt", physicalName = "ptcn_end_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ptcn_end_dt;

    @ElDtoField(logicalName = "dtbth", physicalName = "dtbth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dtbth;

    @ElDtoField(logicalName = "gndrSe", physicalName = "gndr_se", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gndr_se;

    @ElDtoField(logicalName = "scncTecrRegNo", physicalName = "scnc_tecr_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scnc_tecr_reg_no;

    @ElDtoField(logicalName = "lnk_reg_dt", physicalName = "lnk_reg_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_dt;

    @ElDtoField(logicalName = "lnk_reg_seq", physicalName = "lnk_reg_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_seq;

    @ElDtoField(logicalName = "itxp_reg_seq", physicalName = "itxp_reg_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int itxp_reg_seq;

    @ElDtoField(logicalName = "adtn_info_reg_seq", physicalName = "adtn_info_reg_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int adtn_info_reg_seq;

    @ElDtoField(logicalName = "cash_spot_dv", physicalName = "cash_spot_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_spot_dv;

    @ElDtoField(logicalName = "lnk_st", physicalName = "lnk_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_st;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "startYmd", physicalName = "startYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String startYmd;

    @ElDtoField(logicalName = "endYmd", physicalName = "endYmd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endYmd;

    @ElDtoField(logicalName = "accnt_ymd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public String getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(String unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "paym_amt")
    public int getPaym_amt(){
        return paym_amt;
    }

    @ElVoField(physicalName = "paym_amt")
    public void setPaym_amt(int paym_amt){
        this.paym_amt = paym_amt;
    }

    @ElVoField(physicalName = "ptcn_rt")
    public String getPtcn_rt(){
        return ptcn_rt;
    }

    @ElVoField(physicalName = "ptcn_rt")
    public void setPtcn_rt(String ptcn_rt){
        this.ptcn_rt = ptcn_rt;
    }

    @ElVoField(physicalName = "usr_nm")
    public String getUsr_nm(){
        return usr_nm;
    }

    @ElVoField(physicalName = "usr_nm")
    public void setUsr_nm(String usr_nm){
        this.usr_nm = usr_nm;
    }

    @ElVoField(physicalName = "res_reg_no")
    public String getRes_reg_no(){
        return res_reg_no;
    }

    @ElVoField(physicalName = "res_reg_no")
    public void setRes_reg_no(String res_reg_no){
        this.res_reg_no = res_reg_no;
    }

    @ElVoField(physicalName = "ptcn_str_dt")
    public String getPtcn_str_dt(){
        return ptcn_str_dt;
    }

    @ElVoField(physicalName = "ptcn_str_dt")
    public void setPtcn_str_dt(String ptcn_str_dt){
        this.ptcn_str_dt = ptcn_str_dt;
    }

    @ElVoField(physicalName = "ptcn_end_dt")
    public String getPtcn_end_dt(){
        return ptcn_end_dt;
    }

    @ElVoField(physicalName = "ptcn_end_dt")
    public void setPtcn_end_dt(String ptcn_end_dt){
        this.ptcn_end_dt = ptcn_end_dt;
    }

    @ElVoField(physicalName = "dtbth")
    public String getDtbth(){
        return dtbth;
    }

    @ElVoField(physicalName = "dtbth")
    public void setDtbth(String dtbth){
        this.dtbth = dtbth;
    }

    @ElVoField(physicalName = "gndr_se")
    public String getGndr_se(){
        return gndr_se;
    }

    @ElVoField(physicalName = "gndr_se")
    public void setGndr_se(String gndr_se){
        this.gndr_se = gndr_se;
    }

    @ElVoField(physicalName = "scnc_tecr_reg_no")
    public String getScnc_tecr_reg_no(){
        return scnc_tecr_reg_no;
    }

    @ElVoField(physicalName = "scnc_tecr_reg_no")
    public void setScnc_tecr_reg_no(String scnc_tecr_reg_no){
        this.scnc_tecr_reg_no = scnc_tecr_reg_no;
    }

    @ElVoField(physicalName = "lnk_reg_dt")
    public String getLnk_reg_dt(){
        return lnk_reg_dt;
    }

    @ElVoField(physicalName = "lnk_reg_dt")
    public void setLnk_reg_dt(String lnk_reg_dt){
        this.lnk_reg_dt = lnk_reg_dt;
    }

    @ElVoField(physicalName = "lnk_reg_seq")
    public String getLnk_reg_seq(){
        return lnk_reg_seq;
    }

    @ElVoField(physicalName = "lnk_reg_seq")
    public void setLnk_reg_seq(String lnk_reg_seq){
        this.lnk_reg_seq = lnk_reg_seq;
    }

    @ElVoField(physicalName = "itxp_reg_seq")
    public int getItxp_reg_seq(){
        return itxp_reg_seq;
    }

    @ElVoField(physicalName = "itxp_reg_seq")
    public void setItxp_reg_seq(int itxp_reg_seq){
        this.itxp_reg_seq = itxp_reg_seq;
    }

    @ElVoField(physicalName = "adtn_info_reg_seq")
    public int getAdtn_info_reg_seq(){
        return adtn_info_reg_seq;
    }

    @ElVoField(physicalName = "adtn_info_reg_seq")
    public void setAdtn_info_reg_seq(int adtn_info_reg_seq){
        this.adtn_info_reg_seq = adtn_info_reg_seq;
    }

    @ElVoField(physicalName = "cash_spot_dv")
    public String getCash_spot_dv(){
        return cash_spot_dv;
    }

    @ElVoField(physicalName = "cash_spot_dv")
    public void setCash_spot_dv(String cash_spot_dv){
        this.cash_spot_dv = cash_spot_dv;
    }

    @ElVoField(physicalName = "lnk_st")
    public String getLnk_st(){
        return lnk_st;
    }

    @ElVoField(physicalName = "lnk_st")
    public void setLnk_st(String lnk_st){
        this.lnk_st = lnk_st;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "startYmd")
    public String getStartYmd(){
        return startYmd;
    }

    @ElVoField(physicalName = "startYmd")
    public void setStartYmd(String startYmd){
        this.startYmd = startYmd;
    }

    @ElVoField(physicalName = "endYmd")
    public String getEndYmd(){
        return endYmd;
    }

    @ElVoField(physicalName = "endYmd")
    public void setEndYmd(String endYmd){
        this.endYmd = endYmd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BeaipaVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("paym_amt").append("=").append(paym_amt).append(",");
        sb.append("ptcn_rt").append("=").append(ptcn_rt).append(",");
        sb.append("usr_nm").append("=").append(usr_nm).append(",");
        sb.append("res_reg_no").append("=").append(res_reg_no).append(",");
        sb.append("ptcn_str_dt").append("=").append(ptcn_str_dt).append(",");
        sb.append("ptcn_end_dt").append("=").append(ptcn_end_dt).append(",");
        sb.append("dtbth").append("=").append(dtbth).append(",");
        sb.append("gndr_se").append("=").append(gndr_se).append(",");
        sb.append("scnc_tecr_reg_no").append("=").append(scnc_tecr_reg_no).append(",");
        sb.append("lnk_reg_dt").append("=").append(lnk_reg_dt).append(",");
        sb.append("lnk_reg_seq").append("=").append(lnk_reg_seq).append(",");
        sb.append("itxp_reg_seq").append("=").append(itxp_reg_seq).append(",");
        sb.append("adtn_info_reg_seq").append("=").append(adtn_info_reg_seq).append(",");
        sb.append("cash_spot_dv").append("=").append(cash_spot_dv).append(",");
        sb.append("lnk_st").append("=").append(lnk_st).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("startYmd").append("=").append(startYmd).append(",");
        sb.append("endYmd").append("=").append(endYmd).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd);
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
