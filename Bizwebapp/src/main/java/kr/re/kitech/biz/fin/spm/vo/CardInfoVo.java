package kr.re.kitech.biz.fin.spm.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결의 카드정보 Vo")
public class CardInfoVo extends kr.re.kitech.biz.fin.com.vo.FbaCardVo {
    private static final long serialVersionUID = 1L;

    public CardInfoVo(){
    }

    @ElDtoField(logicalName = "승인일자", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ymd;

    @ElDtoField(logicalName = "승인번호", physicalName = "apprvl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_no;

    @ElDtoField(logicalName = "가맹점", physicalName = "joinsto_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String joinsto_nm;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "공급가액", physicalName = "supply_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long supply_amt;

    @ElDtoField(logicalName = "과세금액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "사용금액", physicalName = "use_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long use_amt;

    @ElDtoField(logicalName = "미처리금액", physicalName = "un_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long un_amt;

    @ElDtoField(logicalName = "주소1", physicalName = "shop_addr1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String shop_addr1;

    @ElDtoField(logicalName = "주소2", physicalName = "shop_addr2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String shop_addr2;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "보유자성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_nm;

    @ElDtoField(logicalName = "정산(확정)회계코드", physicalName = "conf_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_accnt_cd;

    @ElDtoField(logicalName = "정산여부", physicalName = "adjstyn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjstyn;

    @ElDtoField(logicalName = "국내외구분", physicalName = "dofogu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dofogu;

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        return use_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "apprvl_no")
    public String getApprvl_no(){
        return apprvl_no;
    }

    @ElVoField(physicalName = "apprvl_no")
    public void setApprvl_no(String apprvl_no){
        this.apprvl_no = apprvl_no;
    }

    @ElVoField(physicalName = "joinsto_nm")
    public String getJoinsto_nm(){
        return joinsto_nm;
    }

    @ElVoField(physicalName = "joinsto_nm")
    public void setJoinsto_nm(String joinsto_nm){
        this.joinsto_nm = joinsto_nm;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "supply_amt")
    public long getSupply_amt(){
        return supply_amt;
    }

    @ElVoField(physicalName = "supply_amt")
    public void setSupply_amt(long supply_amt){
        this.supply_amt = supply_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "use_amt")
    public long getUse_amt(){
        return use_amt;
    }

    @ElVoField(physicalName = "use_amt")
    public void setUse_amt(long use_amt){
        this.use_amt = use_amt;
    }

    @ElVoField(physicalName = "un_amt")
    public long getUn_amt(){
        return un_amt;
    }

    @ElVoField(physicalName = "un_amt")
    public void setUn_amt(long un_amt){
        this.un_amt = un_amt;
    }

    @ElVoField(physicalName = "shop_addr1")
    public String getShop_addr1(){
        return shop_addr1;
    }

    @ElVoField(physicalName = "shop_addr1")
    public void setShop_addr1(String shop_addr1){
        this.shop_addr1 = shop_addr1;
    }

    @ElVoField(physicalName = "shop_addr2")
    public String getShop_addr2(){
        return shop_addr2;
    }

    @ElVoField(physicalName = "shop_addr2")
    public void setShop_addr2(String shop_addr2){
        this.shop_addr2 = shop_addr2;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public String getAccnt_cd_nm(){
        return accnt_cd_nm;
    }

    @ElVoField(physicalName = "accnt_cd_nm")
    public void setAccnt_cd_nm(String accnt_cd_nm){
        this.accnt_cd_nm = accnt_cd_nm;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public String getConf_accnt_cd(){
        return conf_accnt_cd;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public void setConf_accnt_cd(String conf_accnt_cd){
        this.conf_accnt_cd = conf_accnt_cd;
    }

    @ElVoField(physicalName = "adjstyn")
    public String getAdjstyn(){
        return adjstyn;
    }

    @ElVoField(physicalName = "adjstyn")
    public void setAdjstyn(String adjstyn){
        this.adjstyn = adjstyn;
    }

    @ElVoField(physicalName = "dofogu")
    public String getDofogu(){
        return dofogu;
    }

    @ElVoField(physicalName = "dofogu")
    public void setDofogu(String dofogu){
        this.dofogu = dofogu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardInfoVo [");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("apprvl_no").append("=").append(apprvl_no).append(",");
        sb.append("joinsto_nm").append("=").append(joinsto_nm).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("supply_amt").append("=").append(supply_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("use_amt").append("=").append(use_amt).append(",");
        sb.append("un_amt").append("=").append(un_amt).append(",");
        sb.append("shop_addr1").append("=").append(shop_addr1).append(",");
        sb.append("shop_addr2").append("=").append(shop_addr2).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("accnt_cd_nm").append("=").append(accnt_cd_nm).append(",");
        sb.append("conf_accnt_cd").append("=").append(conf_accnt_cd).append(",");
        sb.append("adjstyn").append("=").append(adjstyn).append(",");
        sb.append("dofogu").append("=").append(dofogu);
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
