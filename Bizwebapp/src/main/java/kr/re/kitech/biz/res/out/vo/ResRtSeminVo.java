package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "학회발표 Vo")
public class ResRtSeminVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResRtSeminVo(){
    }

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "접수상태", physicalName = "rcpt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_state;

    @ElDtoField(logicalName = "접수완료일자", physicalName = "rcpt_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_complt_ymd;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_state")
    public String getRcpt_state(){
        return rcpt_state;
    }

    @ElVoField(physicalName = "rcpt_state")
    public void setRcpt_state(String rcpt_state){
        this.rcpt_state = rcpt_state;
    }

    @ElVoField(physicalName = "rcpt_complt_ymd")
    public String getRcpt_complt_ymd(){
        return rcpt_complt_ymd;
    }

    @ElVoField(physicalName = "rcpt_complt_ymd")
    public void setRcpt_complt_ymd(String rcpt_complt_ymd){
        this.rcpt_complt_ymd = rcpt_complt_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResRtSeminVo [");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("rcpt_state").append("=").append(rcpt_state).append(",");
        sb.append("rcpt_complt_ymd").append("=").append(rcpt_complt_ymd).append(",");
        sb.append("req_ymd").append("=").append(req_ymd);
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
