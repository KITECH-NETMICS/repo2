package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 카드결의 조회 Vo")
public class SptCardSlipSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCardSlipSrcVo(){
    }

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "승인번호", physicalName = "card_appl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_appl_no;

    @ElDtoField(logicalName = "승인구분", physicalName = "ddealgubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ddealgubun;

    @ElDtoField(logicalName = "정산일자", physicalName = "hprovdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hprovdate;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "당일취소제외여부", physicalName = "today_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String today_yn;

    @ElDtoField(logicalName = "업무구분", physicalName = "wrk_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrk_clsf;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "결의여부", physicalName = "slip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_yn;

    @ElDtoField(logicalName = "결의유형", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "미수결의번호", physicalName = "misu_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String misu_unslip_no;

    @ElDtoField(logicalName = "승인일자", physicalName = "dtrandate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dtrandate;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

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

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public String getCard_appl_no(){
        return card_appl_no;
    }

    @ElVoField(physicalName = "card_appl_no")
    public void setCard_appl_no(String card_appl_no){
        this.card_appl_no = card_appl_no;
    }

    @ElVoField(physicalName = "ddealgubun")
    public String getDdealgubun(){
        return ddealgubun;
    }

    @ElVoField(physicalName = "ddealgubun")
    public void setDdealgubun(String ddealgubun){
        this.ddealgubun = ddealgubun;
    }

    @ElVoField(physicalName = "hprovdate")
    public String getHprovdate(){
        return hprovdate;
    }

    @ElVoField(physicalName = "hprovdate")
    public void setHprovdate(String hprovdate){
        this.hprovdate = hprovdate;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "today_yn")
    public String getToday_yn(){
        return today_yn;
    }

    @ElVoField(physicalName = "today_yn")
    public void setToday_yn(String today_yn){
        this.today_yn = today_yn;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public String getWrk_clsf(){
        return wrk_clsf;
    }

    @ElVoField(physicalName = "wrk_clsf")
    public void setWrk_clsf(String wrk_clsf){
        this.wrk_clsf = wrk_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "slip_yn")
    public String getSlip_yn(){
        return slip_yn;
    }

    @ElVoField(physicalName = "slip_yn")
    public void setSlip_yn(String slip_yn){
        this.slip_yn = slip_yn;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "misu_unslip_no")
    public String getMisu_unslip_no(){
        return misu_unslip_no;
    }

    @ElVoField(physicalName = "misu_unslip_no")
    public void setMisu_unslip_no(String misu_unslip_no){
        this.misu_unslip_no = misu_unslip_no;
    }

    @ElVoField(physicalName = "dtrandate")
    public String getDtrandate(){
        return dtrandate;
    }

    @ElVoField(physicalName = "dtrandate")
    public void setDtrandate(String dtrandate){
        this.dtrandate = dtrandate;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCardSlipSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("card_appl_no").append("=").append(card_appl_no).append(",");
        sb.append("ddealgubun").append("=").append(ddealgubun).append(",");
        sb.append("hprovdate").append("=").append(hprovdate).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("today_yn").append("=").append(today_yn).append(",");
        sb.append("wrk_clsf").append("=").append(wrk_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("slip_yn").append("=").append(slip_yn).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("misu_unslip_no").append("=").append(misu_unslip_no).append(",");
        sb.append("dtrandate").append("=").append(dtrandate).append(",");
        sb.append("bill_no").append("=").append(bill_no);
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
