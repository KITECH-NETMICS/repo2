package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드미처리VO")
public class ApiEipCardUnproVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipCardUnproVo(){
    }

    @ElDtoField(logicalName = "카드번호", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String card_no;

    @ElDtoField(logicalName = "사용년월일", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_ymd;

    @ElDtoField(logicalName = "use_amt", physicalName = "use_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_amt;

    @ElDtoField(logicalName = "expns_cd", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expns_cd;

    @ElDtoField(logicalName = "expns_nm", physicalName = "expns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expns_nm;

    @ElDtoField(logicalName = "shopnm", physicalName = "shopnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String shopnm;

    @ElDtoField(logicalName = "expns_clsf", physicalName = "expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expns_clsf;

    @ElDtoField(logicalName = "URL", physicalName = "URL", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String URL;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        String ret = this.card_no;
        return ret;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        String ret = this.use_ymd;
        return ret;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "use_amt")
    public String getUse_amt(){
        String ret = this.use_amt;
        return ret;
    }

    @ElVoField(physicalName = "use_amt")
    public void setUse_amt(String use_amt){
        this.use_amt = use_amt;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        String ret = this.expns_cd;
        return ret;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "expns_nm")
    public String getExpns_nm(){
        String ret = this.expns_nm;
        return ret;
    }

    @ElVoField(physicalName = "expns_nm")
    public void setExpns_nm(String expns_nm){
        this.expns_nm = expns_nm;
    }

    @ElVoField(physicalName = "shopnm")
    public String getShopnm(){
        String ret = this.shopnm;
        return ret;
    }

    @ElVoField(physicalName = "shopnm")
    public void setShopnm(String shopnm){
        this.shopnm = shopnm;
    }

    @ElVoField(physicalName = "expns_clsf")
    public String getExpns_clsf(){
        String ret = this.expns_clsf;
        return ret;
    }

    @ElVoField(physicalName = "expns_clsf")
    public void setExpns_clsf(String expns_clsf){
        this.expns_clsf = expns_clsf;
    }

    @ElVoField(physicalName = "URL")
    public String getURL(){
        String ret = this.URL;
        return ret;
    }

    @ElVoField(physicalName = "URL")
    public void setURL(String URL){
        this.URL = URL;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipCardUnproVo [");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("use_amt").append("=").append(use_amt).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("expns_nm").append("=").append(expns_nm).append(",");
        sb.append("shopnm").append("=").append(shopnm).append(",");
        sb.append("expns_clsf").append("=").append(expns_clsf).append(",");
        sb.append("URL").append("=").append(URL).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
