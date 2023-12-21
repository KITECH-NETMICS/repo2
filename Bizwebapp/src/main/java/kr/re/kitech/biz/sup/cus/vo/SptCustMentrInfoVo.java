package kr.re.kitech.biz.sup.cus.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "고객멘토정보 Vo")
public class SptCustMentrInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptCustMentrInfoVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "업무 구분", physicalName = "bizwrk_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bizwrk_clsf;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "일련번호 ", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "관리지역", physicalName = "mngmt_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_region;

    @ElDtoField(logicalName = "맨토여부", physicalName = "mentr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mentr_yn;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "bizwrk_clsf")
    public String getBizwrk_clsf(){
        return bizwrk_clsf;
    }

    @ElVoField(physicalName = "bizwrk_clsf")
    public void setBizwrk_clsf(String bizwrk_clsf){
        this.bizwrk_clsf = bizwrk_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "mngmt_region")
    public String getMngmt_region(){
        return mngmt_region;
    }

    @ElVoField(physicalName = "mngmt_region")
    public void setMngmt_region(String mngmt_region){
        this.mngmt_region = mngmt_region;
    }

    @ElVoField(physicalName = "mentr_yn")
    public String getMentr_yn(){
        return mentr_yn;
    }

    @ElVoField(physicalName = "mentr_yn")
    public void setMentr_yn(String mentr_yn){
        this.mentr_yn = mentr_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCustMentrInfoVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("bizwrk_clsf").append("=").append(bizwrk_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("mngmt_region").append("=").append(mngmt_region).append(",");
        sb.append("mentr_yn").append("=").append(mentr_yn);
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
