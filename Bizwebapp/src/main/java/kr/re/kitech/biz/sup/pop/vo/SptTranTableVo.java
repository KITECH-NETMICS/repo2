package kr.re.kitech.biz.sup.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결제내역 Vo")
public class SptTranTableVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTranTableVo(){
    }

    @ElDtoField(logicalName = "거래번호", physicalName = "dcontrolno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dcontrolno;

    @ElDtoField(logicalName = "접수번호", physicalName = "dmembdealno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dmembdealno;

    @ElDtoField(logicalName = "거래일자", physicalName = "dtrandate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dtrandate;

    @ElDtoField(logicalName = "거래금액", physicalName = "dsaleamt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dsaleamt;

    @ElDtoField(logicalName = "승인번호", physicalName = "dapplno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dapplno;

    @ElDtoField(logicalName = "미수결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "정산예정일", physicalName = "dorderdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dorderdate;

    @ElDtoField(logicalName = "거래번호", physicalName = "dmembtrno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dmembtrno;

    @ElDtoField(logicalName = "수수료", physicalName = "dprovfee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dprovfee;

    @ElDtoField(logicalName = "부가세", physicalName = "dprovvat", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long dprovvat;

    @ElDtoField(logicalName = "결의확정", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "승인번호", physicalName = "card_appl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_appl_no;

    @ElDtoField(logicalName = "승인일자", physicalName = "card_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_issu_ymd;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "총액", physicalName = "decsn_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_amt;

    @ElDtoField(logicalName = "승인구분", physicalName = "ddealgubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddealgubun;

    @ElDtoField(logicalName = "승인구분명", physicalName = "ddealgubun_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddealgubun_nm;

    @ElDtoField(logicalName = "공급가액", physicalName = "decsn_suply_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_suply_value;

    @ElDtoField(logicalName = "부가세", physicalName = "decsn_tax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_tax_amt;

    @ElVoField(physicalName = "dcontrolno")
    public String getDcontrolno(){
        return dcontrolno;
    }

    @ElVoField(physicalName = "dcontrolno")
    public void setDcontrolno(String dcontrolno){
        this.dcontrolno = dcontrolno;
    }

    @ElVoField(physicalName = "dmembdealno")
    public String getDmembdealno(){
        return dmembdealno;
    }

    @ElVoField(physicalName = "dmembdealno")
    public void setDmembdealno(String dmembdealno){
        this.dmembdealno = dmembdealno;
    }

    @ElVoField(physicalName = "dtrandate")
    public String getDtrandate(){
        return dtrandate;
    }

    @ElVoField(physicalName = "dtrandate")
    public void setDtrandate(String dtrandate){
        this.dtrandate = dtrandate;
    }

    @ElVoField(physicalName = "dsaleamt")
    public long getDsaleamt(){
        return dsaleamt;
    }

    @ElVoField(physicalName = "dsaleamt")
    public void setDsaleamt(long dsaleamt){
        this.dsaleamt = dsaleamt;
    }

    @ElVoField(physicalName = "dapplno")
    public String getDapplno(){
        return dapplno;
    }

    @ElVoField(physicalName = "dapplno")
    public void setDapplno(String dapplno){
        this.dapplno = dapplno;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "dorderdate")
    public String getDorderdate(){
        return dorderdate;
    }

    @ElVoField(physicalName = "dorderdate")
    public void setDorderdate(String dorderdate){
        this.dorderdate = dorderdate;
    }

    @ElVoField(physicalName = "dmembtrno")
    public String getDmembtrno(){
        return dmembtrno;
    }

    @ElVoField(physicalName = "dmembtrno")
    public void setDmembtrno(String dmembtrno){
        this.dmembtrno = dmembtrno;
    }

    @ElVoField(physicalName = "dprovfee")
    public long getDprovfee(){
        return dprovfee;
    }

    @ElVoField(physicalName = "dprovfee")
    public void setDprovfee(long dprovfee){
        this.dprovfee = dprovfee;
    }

    @ElVoField(physicalName = "dprovvat")
    public long getDprovvat(){
        return dprovvat;
    }

    @ElVoField(physicalName = "dprovvat")
    public void setDprovvat(long dprovvat){
        this.dprovvat = dprovvat;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public String getCard_appl_no(){
        return card_appl_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public void setCard_appl_no(String card_appl_no){
        this.card_appl_no = card_appl_no;
    }

    @ElVoField(physicalName = "card_issu_ymd")
    public String getCard_issu_ymd(){
        return card_issu_ymd;
    }

    @ElVoField(physicalName = "card_issu_ymd")
    public void setCard_issu_ymd(String card_issu_ymd){
        this.card_issu_ymd = card_issu_ymd;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "decsn_amt")
    public long getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(long decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "ddealgubun")
    public String getDdealgubun(){
        return ddealgubun;
    }

    @ElVoField(physicalName = "ddealgubun")
    public void setDdealgubun(String ddealgubun){
        this.ddealgubun = ddealgubun;
    }

    @ElVoField(physicalName = "ddealgubun_nm")
    public String getDdealgubun_nm(){
        return ddealgubun_nm;
    }

    @ElVoField(physicalName = "ddealgubun_nm")
    public void setDdealgubun_nm(String ddealgubun_nm){
        this.ddealgubun_nm = ddealgubun_nm;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public String getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(String decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public String getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(String decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTranTableVo [");
        sb.append("dcontrolno").append("=").append(dcontrolno).append(",");
        sb.append("dmembdealno").append("=").append(dmembdealno).append(",");
        sb.append("dtrandate").append("=").append(dtrandate).append(",");
        sb.append("dsaleamt").append("=").append(dsaleamt).append(",");
        sb.append("dapplno").append("=").append(dapplno).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("dorderdate").append("=").append(dorderdate).append(",");
        sb.append("dmembtrno").append("=").append(dmembtrno).append(",");
        sb.append("dprovfee").append("=").append(dprovfee).append(",");
        sb.append("dprovvat").append("=").append(dprovvat).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("card_appl_no").append("=").append(card_appl_no).append(",");
        sb.append("card_issu_ymd").append("=").append(card_issu_ymd).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("ddealgubun").append("=").append(ddealgubun).append(",");
        sb.append("ddealgubun_nm").append("=").append(ddealgubun_nm).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt);
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
