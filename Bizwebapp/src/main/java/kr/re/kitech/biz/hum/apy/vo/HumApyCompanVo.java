package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직신청")
public class HumApyCompanVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyCompanVo(){
    }

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "reject_name", physicalName = "reject_name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reject_name;

    @ElDtoField(logicalName = "reject_contents", physicalName = "reject_contents", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reject_contents;

    @ElDtoField(logicalName = "reject_wdate", physicalName = "reject_wdate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reject_wdate;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        String ret = this.rcpt_no;
        return ret;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "reject_name")
    public String getReject_name(){
        String ret = this.reject_name;
        return ret;
    }

    @ElVoField(physicalName = "reject_name")
    public void setReject_name(String reject_name){
        this.reject_name = reject_name;
    }

    @ElVoField(physicalName = "reject_contents")
    public String getReject_contents(){
        String ret = this.reject_contents;
        return ret;
    }

    @ElVoField(physicalName = "reject_contents")
    public void setReject_contents(String reject_contents){
        this.reject_contents = reject_contents;
    }

    @ElVoField(physicalName = "reject_wdate")
    public String getReject_wdate(){
        String ret = this.reject_wdate;
        return ret;
    }

    @ElVoField(physicalName = "reject_wdate")
    public void setReject_wdate(String reject_wdate){
        this.reject_wdate = reject_wdate;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyCompanVo [");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("reject_name").append("=").append(reject_name).append(",");
        sb.append("reject_contents").append("=").append(reject_contents).append(",");
        sb.append("reject_wdate").append("=").append(reject_wdate).append(",");
        sb.append("req_no").append("=").append(req_no);
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
