package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 스냅샷 모델")
public class AprSnapVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprSnapVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reqNo;

    @ElDtoField(logicalName = "스냅샷", physicalName = "html", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String html;

    @ElDtoField(logicalName = "스냅샷URL", physicalName = "url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String url;

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        String ret = this.reqNo;
        return ret;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "html")
    public String getHtml(){
        String ret = this.html;
        return ret;
    }

    @ElVoField(physicalName = "html")
    public void setHtml(String html){
        this.html = html;
    }

    @ElVoField(physicalName = "url")
    public String getUrl(){
        String ret = this.url;
        return ret;
    }

    @ElVoField(physicalName = "url")
    public void setUrl(String url){
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprSnapVo [");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("html").append("=").append(html).append(",");
        sb.append("url").append("=").append(url);
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
