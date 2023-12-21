package kr.re.kitech.biz.xom.base.model;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공통 VO")
public class BizCommVO extends com.inswave.elfw.core.CommVO {
    private static final long serialVersionUID = 1L;

    public BizCommVO(){
    }

    @ElDtoField(logicalName = "유효첨부파일번호", physicalName = "validAttachNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String validAttachNo;

    @ElDtoField(logicalName = "생성자", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "생성일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "결재여부", physicalName = "approval", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "false", desc = "", attr = "")
    private boolean approval = false;

    @ElVoField(physicalName = "validAttachNo")
    public String getValidAttachNo(){
        String ret = this.validAttachNo;
        return ret;
    }

    @ElVoField(physicalName = "validAttachNo")
    public void setValidAttachNo(String validAttachNo){
        this.validAttachNo = validAttachNo;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        String ret = this.regst_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        String ret = this.regst_daytm;
        return ret;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        String ret = this.updt_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        String ret = this.updt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "approval")
    public boolean isApproval(){
        return approval;
    }

    @ElVoField(physicalName = "approval")
    public void setApproval(boolean approval){
        this.approval = approval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BizCommVO [");
        sb.append("validAttachNo").append("=").append(validAttachNo).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("approval").append("=").append(approval);
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
