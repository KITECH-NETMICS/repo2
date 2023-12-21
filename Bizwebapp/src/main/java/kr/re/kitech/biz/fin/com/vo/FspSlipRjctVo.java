package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서헤더VO")
public class FspSlipRjctVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipRjctVo(){
    }

    @ElDtoField(logicalName = "결의반려번호", physicalName = "reject_no", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int reject_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String unslip_no;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수", attr = "")
    private String attach_no;

    @ElDtoField(logicalName = "결재상태(시점)", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "반려의견", physicalName = "rct_content", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rct_content;

    @ElVoField(physicalName = "reject_no")
    public int getReject_no(){
        return reject_no;
    }

    @ElVoField(physicalName = "reject_no")
    public void setReject_no(int reject_no){
        this.reject_no = reject_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        String ret = this.unslip_no;
        return ret;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "attach_no")
    public String getAttach_no(){
        String ret = this.attach_no;
        return ret;
    }

    @ElVoField(physicalName = "attach_no")
    public void setAttach_no(String attach_no){
        this.attach_no = attach_no;
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

    @ElVoField(physicalName = "rct_content")
    public String getRct_content(){
        String ret = this.rct_content;
        return ret;
    }

    @ElVoField(physicalName = "rct_content")
    public void setRct_content(String rct_content){
        this.rct_content = rct_content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipRjctVo [");
        sb.append("reject_no").append("=").append(reject_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("attach_no").append("=").append(attach_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("rct_content").append("=").append(rct_content);
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
