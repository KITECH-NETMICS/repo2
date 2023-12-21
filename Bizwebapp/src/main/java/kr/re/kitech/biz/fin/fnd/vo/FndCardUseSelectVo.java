package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FndCardSelectExp")
public class FndCardUseSelectVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FndCardUseSelectVo(){
    }

    @ElDtoField(logicalName = "cardNo", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "cardKnd", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;

    @ElDtoField(logicalName = "cardClsf", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;

    @ElDtoField(logicalName = "cardKndNm", physicalName = "card_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd_nm;

    @ElDtoField(logicalName = "cardClsfNm", physicalName = "card_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "cnldate", physicalName = "cnldate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnldate;

    @ElDtoField(logicalName = "apprno", physicalName = "apprno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprno;

    @ElDtoField(logicalName = "time", physicalName = "time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String time;

    @ElDtoField(logicalName = "recamt", physicalName = "recamt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double recamt;

    @ElDtoField(logicalName = "cnlamt", physicalName = "cnlamt", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double cnlamt;

    @ElDtoField(logicalName = "compcost", physicalName = "compcost", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double compcost;

    @ElDtoField(logicalName = "shop_nm", physicalName = "shop_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String shop_nm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "compyn", physicalName = "compyn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String compyn;

    @ElDtoField(logicalName = "confyn", physicalName = "confyn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String confyn;

    @ElDtoField(logicalName = "unslip_no", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "local_amt", physicalName = "local_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String local_amt;

    @ElDtoField(logicalName = "from_ymd", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "to_ymd", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }

    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }

    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }

    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }

    @ElVoField(physicalName = "card_knd_nm")
    public String getCard_knd_nm(){
        return card_knd_nm;
    }

    @ElVoField(physicalName = "card_knd_nm")
    public void setCard_knd_nm(String card_knd_nm){
        this.card_knd_nm = card_knd_nm;
    }

    @ElVoField(physicalName = "card_clsf_nm")
    public String getCard_clsf_nm(){
        return card_clsf_nm;
    }

    @ElVoField(physicalName = "card_clsf_nm")
    public void setCard_clsf_nm(String card_clsf_nm){
        this.card_clsf_nm = card_clsf_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "cnldate")
    public String getCnldate(){
        return cnldate;
    }

    @ElVoField(physicalName = "cnldate")
    public void setCnldate(String cnldate){
        this.cnldate = cnldate;
    }

    @ElVoField(physicalName = "apprno")
    public String getApprno(){
        return apprno;
    }

    @ElVoField(physicalName = "apprno")
    public void setApprno(String apprno){
        this.apprno = apprno;
    }

    @ElVoField(physicalName = "time")
    public String getTime(){
        return time;
    }

    @ElVoField(physicalName = "time")
    public void setTime(String time){
        this.time = time;
    }

    @ElVoField(physicalName = "recamt")
    public double getRecamt(){
        return recamt;
    }

    @ElVoField(physicalName = "recamt")
    public void setRecamt(double recamt){
        this.recamt = recamt;
    }

    @ElVoField(physicalName = "cnlamt")
    public double getCnlamt(){
        return cnlamt;
    }

    @ElVoField(physicalName = "cnlamt")
    public void setCnlamt(double cnlamt){
        this.cnlamt = cnlamt;
    }

    @ElVoField(physicalName = "compcost")
    public double getCompcost(){
        return compcost;
    }

    @ElVoField(physicalName = "compcost")
    public void setCompcost(double compcost){
        this.compcost = compcost;
    }

    @ElVoField(physicalName = "shop_nm")
    public String getShop_nm(){
        return shop_nm;
    }

    @ElVoField(physicalName = "shop_nm")
    public void setShop_nm(String shop_nm){
        this.shop_nm = shop_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "compyn")
    public String getCompyn(){
        return compyn;
    }

    @ElVoField(physicalName = "compyn")
    public void setCompyn(String compyn){
        this.compyn = compyn;
    }

    @ElVoField(physicalName = "confyn")
    public String getConfyn(){
        return confyn;
    }

    @ElVoField(physicalName = "confyn")
    public void setConfyn(String confyn){
        this.confyn = confyn;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "local_amt")
    public String getLocal_amt(){
        return local_amt;
    }

    @ElVoField(physicalName = "local_amt")
    public void setLocal_amt(String local_amt){
        this.local_amt = local_amt;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FndCardUseSelectVo [");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("card_knd").append("=").append(card_knd).append(",");
        sb.append("card_clsf").append("=").append(card_clsf).append(",");
        sb.append("card_knd_nm").append("=").append(card_knd_nm).append(",");
        sb.append("card_clsf_nm").append("=").append(card_clsf_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("cnldate").append("=").append(cnldate).append(",");
        sb.append("apprno").append("=").append(apprno).append(",");
        sb.append("time").append("=").append(time).append(",");
        sb.append("recamt").append("=").append(recamt).append(",");
        sb.append("cnlamt").append("=").append(cnlamt).append(",");
        sb.append("compcost").append("=").append(compcost).append(",");
        sb.append("shop_nm").append("=").append(shop_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("compyn").append("=").append(compyn).append(",");
        sb.append("confyn").append("=").append(confyn).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("local_amt").append("=").append(local_amt).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
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
