package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재프로세스로그 Vo")
public class LogCallAppVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LogCallAppVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "req_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_sn;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "클래스명", physicalName = "tmp1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tmp1;

    @ElDtoField(logicalName = "성공여부", physicalName = "tmp2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tmp2;

    @ElDtoField(logicalName = "호출위치", physicalName = "tmp3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "manager | user", attr = "")
    private String tmp3;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_sn")
    public String getReq_sn(){
        String ret = this.req_sn;
        return ret;
    }

    @ElVoField(physicalName = "req_sn")
    public void setReq_sn(String req_sn){
        this.req_sn = req_sn;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        String ret = this.apr_state;
        return ret;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "tmp1")
    public String getTmp1(){
        String ret = this.tmp1;
        return ret;
    }

    @ElVoField(physicalName = "tmp1")
    public void setTmp1(String tmp1){
        this.tmp1 = tmp1;
    }

    @ElVoField(physicalName = "tmp2")
    public String getTmp2(){
        String ret = this.tmp2;
        return ret;
    }

    @ElVoField(physicalName = "tmp2")
    public void setTmp2(String tmp2){
        this.tmp2 = tmp2;
    }

    @ElVoField(physicalName = "tmp3")
    public String getTmp3(){
        String ret = this.tmp3;
        return ret;
    }

    @ElVoField(physicalName = "tmp3")
    public void setTmp3(String tmp3){
        this.tmp3 = tmp3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogCallAppVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_sn").append("=").append(req_sn).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("tmp1").append("=").append(tmp1).append(",");
        sb.append("tmp2").append("=").append(tmp2).append(",");
        sb.append("tmp3").append("=").append(tmp3);
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
