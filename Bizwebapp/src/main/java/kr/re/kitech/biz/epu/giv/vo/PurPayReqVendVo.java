package kr.re.kitech.biz.epu.giv.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매지급업체 Vo")
public class PurPayReqVendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurPayReqVendVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "업체순번", physicalName = "vend_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int vend_odr;

    @ElDtoField(logicalName = "업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "카드번호", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "지급금액", physicalName = "pay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_amt;

    @ElDtoField(logicalName = "재무지급금액", physicalName = "fin_pay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fin_pay_amt;

    @ElDtoField(logicalName = "승인일시", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ymd;

    @ElDtoField(logicalName = "승인번호", physicalName = "apprvl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_no;

    @ElDtoField(logicalName = "카드구분", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;

    @ElDtoField(logicalName = "카드종류", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "vend_odr")
    public int getVend_odr(){
        return vend_odr;
    }

    @ElVoField(physicalName = "vend_odr")
    public void setVend_odr(int vend_odr){
        this.vend_odr = vend_odr;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "pay_amt")
    public long getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(long pay_amt){
        this.pay_amt = pay_amt;
    }

    @ElVoField(physicalName = "fin_pay_amt")
    public long getFin_pay_amt(){
        return fin_pay_amt;
    }

    @ElVoField(physicalName = "fin_pay_amt")
    public void setFin_pay_amt(long fin_pay_amt){
        this.fin_pay_amt = fin_pay_amt;
    }

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

    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }

    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }

    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }

    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurPayReqVendVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("vend_odr").append("=").append(vend_odr).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("fin_pay_amt").append("=").append(fin_pay_amt).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("apprvl_no").append("=").append(apprvl_no).append(",");
        sb.append("card_clsf").append("=").append(card_clsf).append(",");
        sb.append("card_knd").append("=").append(card_knd);
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
