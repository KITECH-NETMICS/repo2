package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드결제 응답 Vo")
public class SptCardHisVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCardHisVo(){
    }

    @ElDtoField(logicalName = "전문구분", physicalName = "RQ01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ01;

    @ElDtoField(logicalName = "단말기 번호", physicalName = "RQ02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ02;

    @ElDtoField(logicalName = "카드입력구분", physicalName = "RQ03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ03;

    @ElDtoField(logicalName = "카드 번호", physicalName = "RQ04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ04;

    @ElDtoField(logicalName = "유효기간", physicalName = "RQ05", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ05;

    @ElDtoField(logicalName = "할부개월", physicalName = "RQ06", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ06;

    @ElDtoField(logicalName = "총금액", physicalName = "RQ07", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ07;

    @ElDtoField(logicalName = "현금영수증", physicalName = "RQ08", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ08;

    @ElDtoField(logicalName = "상품코드", physicalName = "RQ09", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ09;

    @ElDtoField(logicalName = "원승인번호", physicalName = "RQ10", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ10;

    @ElDtoField(logicalName = "원승인일자", physicalName = "RQ11", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ11;

    @ElDtoField(logicalName = "봉사료", physicalName = "RQ12", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ12;

    @ElDtoField(logicalName = "부가세", physicalName = "RQ13", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ13;

    @ElDtoField(logicalName = "시판매번호", physicalName = "RQ14", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ14;

    @ElDtoField(logicalName = "웹전송메시지", physicalName = "RQ15", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ15;

    @ElDtoField(logicalName = "단말기구분코드", physicalName = "RQ16", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RQ16;

    @ElDtoField(logicalName = "응답1", physicalName = "RS01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS01;

    @ElDtoField(logicalName = "응답2", physicalName = "RS02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS02;

    @ElDtoField(logicalName = "응답3", physicalName = "RS03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS03;

    @ElDtoField(logicalName = "응답4", physicalName = "RS04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS04;

    @ElDtoField(logicalName = "응답5", physicalName = "RS05", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS05;

    @ElDtoField(logicalName = "응답6", physicalName = "RS06", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS06;

    @ElDtoField(logicalName = "응답7", physicalName = "RS07", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS07;

    @ElDtoField(logicalName = "응답8", physicalName = "RS08", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS08;

    @ElDtoField(logicalName = "응답9", physicalName = "RS09", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS09;

    @ElDtoField(logicalName = "응답10", physicalName = "RS10", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS10;

    @ElDtoField(logicalName = "응답11", physicalName = "RS11", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS11;

    @ElDtoField(logicalName = "응답12", physicalName = "RS12", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS12;

    @ElDtoField(logicalName = "응답13", physicalName = "RS13", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS13;

    @ElDtoField(logicalName = "응답14", physicalName = "RS14", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS14;

    @ElDtoField(logicalName = "응답15", physicalName = "RS15", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS15;

    @ElDtoField(logicalName = "응답16", physicalName = "RS16", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS16;

    @ElDtoField(logicalName = "응답17", physicalName = "RS17", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS17;

    @ElDtoField(logicalName = "응답18", physicalName = "RS18", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS18;

    @ElDtoField(logicalName = "응답19", physicalName = "RS19", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS19;

    @ElDtoField(logicalName = "응답20", physicalName = "RS20", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String RS20;

    @ElVoField(physicalName = "RQ01")
    public String getRQ01(){
        return RQ01;
    }

    @ElVoField(physicalName = "RQ01")
    public void setRQ01(String RQ01){
        this.RQ01 = RQ01;
    }

    @ElVoField(physicalName = "RQ02")
    public String getRQ02(){
        return RQ02;
    }

    @ElVoField(physicalName = "RQ02")
    public void setRQ02(String RQ02){
        this.RQ02 = RQ02;
    }

    @ElVoField(physicalName = "RQ03")
    public String getRQ03(){
        return RQ03;
    }

    @ElVoField(physicalName = "RQ03")
    public void setRQ03(String RQ03){
        this.RQ03 = RQ03;
    }

    @ElVoField(physicalName = "RQ04")
    public String getRQ04(){
        return RQ04;
    }

    @ElVoField(physicalName = "RQ04")
    public void setRQ04(String RQ04){
        this.RQ04 = RQ04;
    }

    @ElVoField(physicalName = "RQ05")
    public String getRQ05(){
        return RQ05;
    }

    @ElVoField(physicalName = "RQ05")
    public void setRQ05(String RQ05){
        this.RQ05 = RQ05;
    }

    @ElVoField(physicalName = "RQ06")
    public String getRQ06(){
        return RQ06;
    }

    @ElVoField(physicalName = "RQ06")
    public void setRQ06(String RQ06){
        this.RQ06 = RQ06;
    }

    @ElVoField(physicalName = "RQ07")
    public String getRQ07(){
        return RQ07;
    }

    @ElVoField(physicalName = "RQ07")
    public void setRQ07(String RQ07){
        this.RQ07 = RQ07;
    }

    @ElVoField(physicalName = "RQ08")
    public String getRQ08(){
        return RQ08;
    }

    @ElVoField(physicalName = "RQ08")
    public void setRQ08(String RQ08){
        this.RQ08 = RQ08;
    }

    @ElVoField(physicalName = "RQ09")
    public String getRQ09(){
        return RQ09;
    }

    @ElVoField(physicalName = "RQ09")
    public void setRQ09(String RQ09){
        this.RQ09 = RQ09;
    }

    @ElVoField(physicalName = "RQ10")
    public String getRQ10(){
        return RQ10;
    }

    @ElVoField(physicalName = "RQ10")
    public void setRQ10(String RQ10){
        this.RQ10 = RQ10;
    }

    @ElVoField(physicalName = "RQ11")
    public String getRQ11(){
        return RQ11;
    }

    @ElVoField(physicalName = "RQ11")
    public void setRQ11(String RQ11){
        this.RQ11 = RQ11;
    }

    @ElVoField(physicalName = "RQ12")
    public String getRQ12(){
        return RQ12;
    }

    @ElVoField(physicalName = "RQ12")
    public void setRQ12(String RQ12){
        this.RQ12 = RQ12;
    }

    @ElVoField(physicalName = "RQ13")
    public String getRQ13(){
        return RQ13;
    }

    @ElVoField(physicalName = "RQ13")
    public void setRQ13(String RQ13){
        this.RQ13 = RQ13;
    }

    @ElVoField(physicalName = "RQ14")
    public String getRQ14(){
        return RQ14;
    }

    @ElVoField(physicalName = "RQ14")
    public void setRQ14(String RQ14){
        this.RQ14 = RQ14;
    }

    @ElVoField(physicalName = "RQ15")
    public String getRQ15(){
        return RQ15;
    }

    @ElVoField(physicalName = "RQ15")
    public void setRQ15(String RQ15){
        this.RQ15 = RQ15;
    }

    @ElVoField(physicalName = "RQ16")
    public String getRQ16(){
        return RQ16;
    }

    @ElVoField(physicalName = "RQ16")
    public void setRQ16(String RQ16){
        this.RQ16 = RQ16;
    }

    @ElVoField(physicalName = "RS01")
    public String getRS01(){
        return RS01;
    }

    @ElVoField(physicalName = "RS01")
    public void setRS01(String RS01){
        this.RS01 = RS01;
    }

    @ElVoField(physicalName = "RS02")
    public String getRS02(){
        return RS02;
    }

    @ElVoField(physicalName = "RS02")
    public void setRS02(String RS02){
        this.RS02 = RS02;
    }

    @ElVoField(physicalName = "RS03")
    public String getRS03(){
        return RS03;
    }

    @ElVoField(physicalName = "RS03")
    public void setRS03(String RS03){
        this.RS03 = RS03;
    }

    @ElVoField(physicalName = "RS04")
    public String getRS04(){
        return RS04;
    }

    @ElVoField(physicalName = "RS04")
    public void setRS04(String RS04){
        this.RS04 = RS04;
    }

    @ElVoField(physicalName = "RS05")
    public String getRS05(){
        return RS05;
    }

    @ElVoField(physicalName = "RS05")
    public void setRS05(String RS05){
        this.RS05 = RS05;
    }

    @ElVoField(physicalName = "RS06")
    public String getRS06(){
        return RS06;
    }

    @ElVoField(physicalName = "RS06")
    public void setRS06(String RS06){
        this.RS06 = RS06;
    }

    @ElVoField(physicalName = "RS07")
    public String getRS07(){
        return RS07;
    }

    @ElVoField(physicalName = "RS07")
    public void setRS07(String RS07){
        this.RS07 = RS07;
    }

    @ElVoField(physicalName = "RS08")
    public String getRS08(){
        return RS08;
    }

    @ElVoField(physicalName = "RS08")
    public void setRS08(String RS08){
        this.RS08 = RS08;
    }

    @ElVoField(physicalName = "RS09")
    public String getRS09(){
        return RS09;
    }

    @ElVoField(physicalName = "RS09")
    public void setRS09(String RS09){
        this.RS09 = RS09;
    }

    @ElVoField(physicalName = "RS10")
    public String getRS10(){
        return RS10;
    }

    @ElVoField(physicalName = "RS10")
    public void setRS10(String RS10){
        this.RS10 = RS10;
    }

    @ElVoField(physicalName = "RS11")
    public String getRS11(){
        return RS11;
    }

    @ElVoField(physicalName = "RS11")
    public void setRS11(String RS11){
        this.RS11 = RS11;
    }

    @ElVoField(physicalName = "RS12")
    public String getRS12(){
        return RS12;
    }

    @ElVoField(physicalName = "RS12")
    public void setRS12(String RS12){
        this.RS12 = RS12;
    }

    @ElVoField(physicalName = "RS13")
    public String getRS13(){
        return RS13;
    }

    @ElVoField(physicalName = "RS13")
    public void setRS13(String RS13){
        this.RS13 = RS13;
    }

    @ElVoField(physicalName = "RS14")
    public String getRS14(){
        return RS14;
    }

    @ElVoField(physicalName = "RS14")
    public void setRS14(String RS14){
        this.RS14 = RS14;
    }

    @ElVoField(physicalName = "RS15")
    public String getRS15(){
        return RS15;
    }

    @ElVoField(physicalName = "RS15")
    public void setRS15(String RS15){
        this.RS15 = RS15;
    }

    @ElVoField(physicalName = "RS16")
    public String getRS16(){
        return RS16;
    }

    @ElVoField(physicalName = "RS16")
    public void setRS16(String RS16){
        this.RS16 = RS16;
    }

    @ElVoField(physicalName = "RS17")
    public String getRS17(){
        return RS17;
    }

    @ElVoField(physicalName = "RS17")
    public void setRS17(String RS17){
        this.RS17 = RS17;
    }

    @ElVoField(physicalName = "RS18")
    public String getRS18(){
        return RS18;
    }

    @ElVoField(physicalName = "RS18")
    public void setRS18(String RS18){
        this.RS18 = RS18;
    }

    @ElVoField(physicalName = "RS19")
    public String getRS19(){
        return RS19;
    }

    @ElVoField(physicalName = "RS19")
    public void setRS19(String RS19){
        this.RS19 = RS19;
    }

    @ElVoField(physicalName = "RS20")
    public String getRS20(){
        return RS20;
    }

    @ElVoField(physicalName = "RS20")
    public void setRS20(String RS20){
        this.RS20 = RS20;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCardHisVo [");
        sb.append("RQ01").append("=").append(RQ01).append(",");
        sb.append("RQ02").append("=").append(RQ02).append(",");
        sb.append("RQ03").append("=").append(RQ03).append(",");
        sb.append("RQ04").append("=").append(RQ04).append(",");
        sb.append("RQ05").append("=").append(RQ05).append(",");
        sb.append("RQ06").append("=").append(RQ06).append(",");
        sb.append("RQ07").append("=").append(RQ07).append(",");
        sb.append("RQ08").append("=").append(RQ08).append(",");
        sb.append("RQ09").append("=").append(RQ09).append(",");
        sb.append("RQ10").append("=").append(RQ10).append(",");
        sb.append("RQ11").append("=").append(RQ11).append(",");
        sb.append("RQ12").append("=").append(RQ12).append(",");
        sb.append("RQ13").append("=").append(RQ13).append(",");
        sb.append("RQ14").append("=").append(RQ14).append(",");
        sb.append("RQ15").append("=").append(RQ15).append(",");
        sb.append("RQ16").append("=").append(RQ16).append(",");
        sb.append("RS01").append("=").append(RS01).append(",");
        sb.append("RS02").append("=").append(RS02).append(",");
        sb.append("RS03").append("=").append(RS03).append(",");
        sb.append("RS04").append("=").append(RS04).append(",");
        sb.append("RS05").append("=").append(RS05).append(",");
        sb.append("RS06").append("=").append(RS06).append(",");
        sb.append("RS07").append("=").append(RS07).append(",");
        sb.append("RS08").append("=").append(RS08).append(",");
        sb.append("RS09").append("=").append(RS09).append(",");
        sb.append("RS10").append("=").append(RS10).append(",");
        sb.append("RS11").append("=").append(RS11).append(",");
        sb.append("RS12").append("=").append(RS12).append(",");
        sb.append("RS13").append("=").append(RS13).append(",");
        sb.append("RS14").append("=").append(RS14).append(",");
        sb.append("RS15").append("=").append(RS15).append(",");
        sb.append("RS16").append("=").append(RS16).append(",");
        sb.append("RS17").append("=").append(RS17).append(",");
        sb.append("RS18").append("=").append(RS18).append(",");
        sb.append("RS19").append("=").append(RS19).append(",");
        sb.append("RS20").append("=").append(RS20);
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
