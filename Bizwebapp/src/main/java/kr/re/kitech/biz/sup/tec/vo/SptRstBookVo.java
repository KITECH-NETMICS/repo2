package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "시험성적서 Vo")
public class SptRstBookVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptRstBookVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "상담접수번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "기술지원접수번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계산서발행일자", physicalName = "bill_issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_issu_ymd;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "발급구분", physicalName = "issu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_clsf;

    @ElDtoField(logicalName = "발급업체고객번호", physicalName = "issu_vend_cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_vend_cust_no;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "bill_issu_ymd")
    public String getBill_issu_ymd(){
        return bill_issu_ymd;
    }

    @ElVoField(physicalName = "bill_issu_ymd")
    public void setBill_issu_ymd(String bill_issu_ymd){
        this.bill_issu_ymd = bill_issu_ymd;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "issu_clsf")
    public String getIssu_clsf(){
        return issu_clsf;
    }

    @ElVoField(physicalName = "issu_clsf")
    public void setIssu_clsf(String issu_clsf){
        this.issu_clsf = issu_clsf;
    }

    @ElVoField(physicalName = "issu_vend_cust_no")
    public String getIssu_vend_cust_no(){
        return issu_vend_cust_no;
    }

    @ElVoField(physicalName = "issu_vend_cust_no")
    public void setIssu_vend_cust_no(String issu_vend_cust_no){
        this.issu_vend_cust_no = issu_vend_cust_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptRstBookVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("bill_issu_ymd").append("=").append(bill_issu_ymd).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("issu_clsf").append("=").append(issu_clsf).append(",");
        sb.append("issu_vend_cust_no").append("=").append(issu_vend_cust_no);
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
