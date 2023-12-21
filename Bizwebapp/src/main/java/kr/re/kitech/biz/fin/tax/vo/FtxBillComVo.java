package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출계산서 공통 Vo")
public class FtxBillComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillComVo(){
    }

    @ElDtoField(logicalName = "수정코드", physicalName = "mody_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mody_code;

    @ElDtoField(logicalName = "세금계산서종류", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "담당자우편번호1", physicalName = "buyr_chrg_post1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post1;

    @ElDtoField(logicalName = "담당자이름1", physicalName = "buyr_chrg_nm1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm1;

    @ElDtoField(logicalName = "담당자전화1", physicalName = "buyr_chrg_tel1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_tel1;

    @ElDtoField(logicalName = "담당자이메일1", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "담당자핸드폰1", physicalName = "buyr_chrg_mobl1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_mobl1;

    @ElDtoField(logicalName = "담당자우편번호2", physicalName = "buyr_chrg_post2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_post2;

    @ElDtoField(logicalName = "담당자이름2", physicalName = "buyr_chrg_nm2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_nm2;

    @ElDtoField(logicalName = "담당자전화2", physicalName = "buyr_chrg_tel2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_tel2;

    @ElDtoField(logicalName = "담당자이메일2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email2;

    @ElDtoField(logicalName = "담당자핸드폰2", physicalName = "buyr_chrg_mobl2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_mobl2;

    @ElDtoField(logicalName = "종사업장번호", physicalName = "buyr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_code;

    @ElVoField(physicalName = "mody_code")
    public String getMody_code(){
        return mody_code;
    }

    @ElVoField(physicalName = "mody_code")
    public void setMody_code(String mody_code){
        this.mody_code = mody_code;
    }

    @ElVoField(physicalName = "tax_type")
    public String getTax_type(){
        return tax_type;
    }

    @ElVoField(physicalName = "tax_type")
    public void setTax_type(String tax_type){
        this.tax_type = tax_type;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public String getBuyr_chrg_post1(){
        return buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_post1")
    public void setBuyr_chrg_post1(String buyr_chrg_post1){
        this.buyr_chrg_post1 = buyr_chrg_post1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public String getBuyr_chrg_nm1(){
        return buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_nm1")
    public void setBuyr_chrg_nm1(String buyr_chrg_nm1){
        this.buyr_chrg_nm1 = buyr_chrg_nm1;
    }

    @ElVoField(physicalName = "buyr_chrg_tel1")
    public String getBuyr_chrg_tel1(){
        return buyr_chrg_tel1;
    }

    @ElVoField(physicalName = "buyr_chrg_tel1")
    public void setBuyr_chrg_tel1(String buyr_chrg_tel1){
        this.buyr_chrg_tel1 = buyr_chrg_tel1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl1")
    public String getBuyr_chrg_mobl1(){
        return buyr_chrg_mobl1;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl1")
    public void setBuyr_chrg_mobl1(String buyr_chrg_mobl1){
        this.buyr_chrg_mobl1 = buyr_chrg_mobl1;
    }

    @ElVoField(physicalName = "buyr_chrg_post2")
    public String getBuyr_chrg_post2(){
        return buyr_chrg_post2;
    }

    @ElVoField(physicalName = "buyr_chrg_post2")
    public void setBuyr_chrg_post2(String buyr_chrg_post2){
        this.buyr_chrg_post2 = buyr_chrg_post2;
    }

    @ElVoField(physicalName = "buyr_chrg_nm2")
    public String getBuyr_chrg_nm2(){
        return buyr_chrg_nm2;
    }

    @ElVoField(physicalName = "buyr_chrg_nm2")
    public void setBuyr_chrg_nm2(String buyr_chrg_nm2){
        this.buyr_chrg_nm2 = buyr_chrg_nm2;
    }

    @ElVoField(physicalName = "buyr_chrg_tel2")
    public String getBuyr_chrg_tel2(){
        return buyr_chrg_tel2;
    }

    @ElVoField(physicalName = "buyr_chrg_tel2")
    public void setBuyr_chrg_tel2(String buyr_chrg_tel2){
        this.buyr_chrg_tel2 = buyr_chrg_tel2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public String getBuyr_chrg_email2(){
        return buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public void setBuyr_chrg_email2(String buyr_chrg_email2){
        this.buyr_chrg_email2 = buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl2")
    public String getBuyr_chrg_mobl2(){
        return buyr_chrg_mobl2;
    }

    @ElVoField(physicalName = "buyr_chrg_mobl2")
    public void setBuyr_chrg_mobl2(String buyr_chrg_mobl2){
        this.buyr_chrg_mobl2 = buyr_chrg_mobl2;
    }

    @ElVoField(physicalName = "buyr_code")
    public String getBuyr_code(){
        return buyr_code;
    }

    @ElVoField(physicalName = "buyr_code")
    public void setBuyr_code(String buyr_code){
        this.buyr_code = buyr_code;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillComVo [");
        sb.append("mody_code").append("=").append(mody_code).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("buyr_chrg_post1").append("=").append(buyr_chrg_post1).append(",");
        sb.append("buyr_chrg_nm1").append("=").append(buyr_chrg_nm1).append(",");
        sb.append("buyr_chrg_tel1").append("=").append(buyr_chrg_tel1).append(",");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("buyr_chrg_mobl1").append("=").append(buyr_chrg_mobl1).append(",");
        sb.append("buyr_chrg_post2").append("=").append(buyr_chrg_post2).append(",");
        sb.append("buyr_chrg_nm2").append("=").append(buyr_chrg_nm2).append(",");
        sb.append("buyr_chrg_tel2").append("=").append(buyr_chrg_tel2).append(",");
        sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
        sb.append("buyr_chrg_mobl2").append("=").append(buyr_chrg_mobl2).append(",");
        sb.append("buyr_code").append("=").append(buyr_code);
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
