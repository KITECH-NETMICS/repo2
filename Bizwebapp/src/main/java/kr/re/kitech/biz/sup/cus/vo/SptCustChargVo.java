package kr.re.kitech.biz.sup.cus.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "고객업무담당자 Vo")
public class SptCustChargVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCustChargVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "업무 구분", physicalName = "bizwrk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk;

    @ElDtoField(logicalName = "일련번호", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "지정번호(파트너)", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "실무책임자", physicalName = "affair_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn;

    @ElDtoField(logicalName = "실무책임자부서", physicalName = "affair_respn_psn_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_dept;

    @ElDtoField(logicalName = "실무책임자직위", physicalName = "affair_respn_psn_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_posi;

    @ElDtoField(logicalName = "실무책임자전화번호", physicalName = "affair_respn_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_tel;

    @ElDtoField(logicalName = "실무책임자휴대폰번호", physicalName = "affair_respn_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_mobile_no;

    @ElDtoField(logicalName = "실무책임자이메일", physicalName = "affair_respn_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String affair_respn_psn_email;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "bizwrk")
    public String getBizwrk(){
        return bizwrk;
    }

    @ElVoField(physicalName = "bizwrk")
    public void setBizwrk(String bizwrk){
        this.bizwrk = bizwrk;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }

    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "affair_respn_psn")
    public String getAffair_respn_psn(){
        return affair_respn_psn;
    }

    @ElVoField(physicalName = "affair_respn_psn")
    public void setAffair_respn_psn(String affair_respn_psn){
        this.affair_respn_psn = affair_respn_psn;
    }

    @ElVoField(physicalName = "affair_respn_psn_dept")
    public String getAffair_respn_psn_dept(){
        return affair_respn_psn_dept;
    }

    @ElVoField(physicalName = "affair_respn_psn_dept")
    public void setAffair_respn_psn_dept(String affair_respn_psn_dept){
        this.affair_respn_psn_dept = affair_respn_psn_dept;
    }

    @ElVoField(physicalName = "affair_respn_psn_posi")
    public String getAffair_respn_psn_posi(){
        return affair_respn_psn_posi;
    }

    @ElVoField(physicalName = "affair_respn_psn_posi")
    public void setAffair_respn_psn_posi(String affair_respn_psn_posi){
        this.affair_respn_psn_posi = affair_respn_psn_posi;
    }

    @ElVoField(physicalName = "affair_respn_psn_tel")
    public String getAffair_respn_psn_tel(){
        return affair_respn_psn_tel;
    }

    @ElVoField(physicalName = "affair_respn_psn_tel")
    public void setAffair_respn_psn_tel(String affair_respn_psn_tel){
        this.affair_respn_psn_tel = affair_respn_psn_tel;
    }

    @ElVoField(physicalName = "affair_respn_psn_mobile_no")
    public String getAffair_respn_psn_mobile_no(){
        return affair_respn_psn_mobile_no;
    }

    @ElVoField(physicalName = "affair_respn_psn_mobile_no")
    public void setAffair_respn_psn_mobile_no(String affair_respn_psn_mobile_no){
        this.affair_respn_psn_mobile_no = affair_respn_psn_mobile_no;
    }

    @ElVoField(physicalName = "affair_respn_psn_email")
    public String getAffair_respn_psn_email(){
        return affair_respn_psn_email;
    }

    @ElVoField(physicalName = "affair_respn_psn_email")
    public void setAffair_respn_psn_email(String affair_respn_psn_email){
        this.affair_respn_psn_email = affair_respn_psn_email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCustChargVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("bizwrk").append("=").append(bizwrk).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("affair_respn_psn").append("=").append(affair_respn_psn).append(",");
        sb.append("affair_respn_psn_dept").append("=").append(affair_respn_psn_dept).append(",");
        sb.append("affair_respn_psn_posi").append("=").append(affair_respn_psn_posi).append(",");
        sb.append("affair_respn_psn_tel").append("=").append(affair_respn_psn_tel).append(",");
        sb.append("affair_respn_psn_mobile_no").append("=").append(affair_respn_psn_mobile_no).append(",");
        sb.append("affair_respn_psn_email").append("=").append(affair_respn_psn_email);
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
