package kr.re.kitech.biz.fin.rcms.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SaveBeitpaVo")
public class SaveBeitpaVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SaveBeitpaVo(){
    }

    @ElDtoField(logicalName = "cashSpotDv", physicalName = "cash_spot_dv", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_spot_dv;

    @ElDtoField(logicalName = "itxpCd", physicalName = "itxp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itxp_cd;

    @ElDtoField(logicalName = "useDt", physicalName = "use_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dt;

    @ElDtoField(logicalName = "mitm", physicalName = "mitm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mitm;

    @ElDtoField(logicalName = "uprc", physicalName = "uprc", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long uprc;

    @ElDtoField(logicalName = "qnt", physicalName = "qnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int qnt;

    @ElDtoField(logicalName = "nrm", physicalName = "nrm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nrm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "useAmt", physicalName = "use_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long use_amt;

    @ElDtoField(logicalName = "splyAmt", physicalName = "sply_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long sply_amt;

    @ElDtoField(logicalName = "vatAmt", physicalName = "vat_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long vat_amt;

    @ElDtoField(logicalName = "srvAmt", physicalName = "srv_amt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int srv_amt;

    @ElDtoField(logicalName = "comm", physicalName = "comm", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int comm;

    @ElDtoField(logicalName = "accoCd1", physicalName = "acco_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acco_cd_1;

    @ElDtoField(logicalName = "accoCd2", physicalName = "acco_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acco_cd_2;

    @ElDtoField(logicalName = "lnkSt", physicalName = "lnk_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_st;

    @ElDtoField(logicalName = "useAmtSeCd", physicalName = "use_amt_se_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_amt_se_cd;

    @ElDtoField(logicalName = "lnkRegDt", physicalName = "lnk_reg_dt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_dt;

    @ElDtoField(logicalName = "lnkRegSeq", physicalName = "lnk_reg_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lnk_reg_seq;

    @ElDtoField(logicalName = "itxpRegSeq", physicalName = "itxp_reg_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int itxp_reg_seq;

    @ElDtoField(logicalName = "erp_cd_1", physicalName = "erp_cd_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_1;

    @ElDtoField(logicalName = "erp_cd_2", physicalName = "erp_cd_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String erp_cd_2;

    @ElVoField(physicalName = "cash_spot_dv")
    public String getCash_spot_dv(){
        return cash_spot_dv;
    }

    @ElVoField(physicalName = "cash_spot_dv")
    public void setCash_spot_dv(String cash_spot_dv){
        this.cash_spot_dv = cash_spot_dv;
    }

    @ElVoField(physicalName = "itxp_cd")
    public String getItxp_cd(){
        return itxp_cd;
    }

    @ElVoField(physicalName = "itxp_cd")
    public void setItxp_cd(String itxp_cd){
        this.itxp_cd = itxp_cd;
    }

    @ElVoField(physicalName = "use_dt")
    public String getUse_dt(){
        return use_dt;
    }

    @ElVoField(physicalName = "use_dt")
    public void setUse_dt(String use_dt){
        this.use_dt = use_dt;
    }

    @ElVoField(physicalName = "mitm")
    public String getMitm(){
        return mitm;
    }

    @ElVoField(physicalName = "mitm")
    public void setMitm(String mitm){
        this.mitm = mitm;
    }

    @ElVoField(physicalName = "uprc")
    public long getUprc(){
        return uprc;
    }

    @ElVoField(physicalName = "uprc")
    public void setUprc(long uprc){
        this.uprc = uprc;
    }

    @ElVoField(physicalName = "qnt")
    public int getQnt(){
        return qnt;
    }

    @ElVoField(physicalName = "qnt")
    public void setQnt(int qnt){
        this.qnt = qnt;
    }

    @ElVoField(physicalName = "nrm")
    public String getNrm(){
        return nrm;
    }

    @ElVoField(physicalName = "nrm")
    public void setNrm(String nrm){
        this.nrm = nrm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "use_amt")
    public long getUse_amt(){
        return use_amt;
    }

    @ElVoField(physicalName = "use_amt")
    public void setUse_amt(long use_amt){
        this.use_amt = use_amt;
    }

    @ElVoField(physicalName = "sply_amt")
    public long getSply_amt(){
        return sply_amt;
    }

    @ElVoField(physicalName = "sply_amt")
    public void setSply_amt(long sply_amt){
        this.sply_amt = sply_amt;
    }

    @ElVoField(physicalName = "vat_amt")
    public long getVat_amt(){
        return vat_amt;
    }

    @ElVoField(physicalName = "vat_amt")
    public void setVat_amt(long vat_amt){
        this.vat_amt = vat_amt;
    }

    @ElVoField(physicalName = "srv_amt")
    public int getSrv_amt(){
        return srv_amt;
    }

    @ElVoField(physicalName = "srv_amt")
    public void setSrv_amt(int srv_amt){
        this.srv_amt = srv_amt;
    }

    @ElVoField(physicalName = "comm")
    public int getComm(){
        return comm;
    }

    @ElVoField(physicalName = "comm")
    public void setComm(int comm){
        this.comm = comm;
    }

    @ElVoField(physicalName = "acco_cd_1")
    public String getAcco_cd_1(){
        return acco_cd_1;
    }

    @ElVoField(physicalName = "acco_cd_1")
    public void setAcco_cd_1(String acco_cd_1){
        this.acco_cd_1 = acco_cd_1;
    }

    @ElVoField(physicalName = "acco_cd_2")
    public String getAcco_cd_2(){
        return acco_cd_2;
    }

    @ElVoField(physicalName = "acco_cd_2")
    public void setAcco_cd_2(String acco_cd_2){
        this.acco_cd_2 = acco_cd_2;
    }

    @ElVoField(physicalName = "lnk_st")
    public String getLnk_st(){
        return lnk_st;
    }

    @ElVoField(physicalName = "lnk_st")
    public void setLnk_st(String lnk_st){
        this.lnk_st = lnk_st;
    }

    @ElVoField(physicalName = "use_amt_se_cd")
    public String getUse_amt_se_cd(){
        return use_amt_se_cd;
    }

    @ElVoField(physicalName = "use_amt_se_cd")
    public void setUse_amt_se_cd(String use_amt_se_cd){
        this.use_amt_se_cd = use_amt_se_cd;
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

    @ElVoField(physicalName = "erp_cd_1")
    public String getErp_cd_1(){
        return erp_cd_1;
    }

    @ElVoField(physicalName = "erp_cd_1")
    public void setErp_cd_1(String erp_cd_1){
        this.erp_cd_1 = erp_cd_1;
    }

    @ElVoField(physicalName = "erp_cd_2")
    public String getErp_cd_2(){
        return erp_cd_2;
    }

    @ElVoField(physicalName = "erp_cd_2")
    public void setErp_cd_2(String erp_cd_2){
        this.erp_cd_2 = erp_cd_2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SaveBeitpaVo [");
        sb.append("cash_spot_dv").append("=").append(cash_spot_dv).append(",");
        sb.append("itxp_cd").append("=").append(itxp_cd).append(",");
        sb.append("use_dt").append("=").append(use_dt).append(",");
        sb.append("mitm").append("=").append(mitm).append(",");
        sb.append("uprc").append("=").append(uprc).append(",");
        sb.append("qnt").append("=").append(qnt).append(",");
        sb.append("nrm").append("=").append(nrm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("use_amt").append("=").append(use_amt).append(",");
        sb.append("sply_amt").append("=").append(sply_amt).append(",");
        sb.append("vat_amt").append("=").append(vat_amt).append(",");
        sb.append("srv_amt").append("=").append(srv_amt).append(",");
        sb.append("comm").append("=").append(comm).append(",");
        sb.append("acco_cd_1").append("=").append(acco_cd_1).append(",");
        sb.append("acco_cd_2").append("=").append(acco_cd_2).append(",");
        sb.append("lnk_st").append("=").append(lnk_st).append(",");
        sb.append("use_amt_se_cd").append("=").append(use_amt_se_cd).append(",");
        sb.append("lnk_reg_dt").append("=").append(lnk_reg_dt).append(",");
        sb.append("lnk_reg_seq").append("=").append(lnk_reg_seq).append(",");
        sb.append("itxp_reg_seq").append("=").append(itxp_reg_seq).append(",");
        sb.append("erp_cd_1").append("=").append(erp_cd_1).append(",");
        sb.append("erp_cd_2").append("=").append(erp_cd_2);
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
