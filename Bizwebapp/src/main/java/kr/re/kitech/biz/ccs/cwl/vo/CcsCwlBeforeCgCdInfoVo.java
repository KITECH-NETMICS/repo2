package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 신청내역")
public class CcsCwlBeforeCgCdInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlBeforeCgCdInfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "등록일시", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "경조사 구분코드", physicalName = "cgncd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf;

    @ElDtoField(logicalName = "가족관계 구분코드", physicalName = "fam_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_relat;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public String getCgncd_clsf(){
        return cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public void setCgncd_clsf(String cgncd_clsf){
        this.cgncd_clsf = cgncd_clsf;
    }

    @ElVoField(physicalName = "fam_relat")
    public String getFam_relat(){
        return fam_relat;
    }

    @ElVoField(physicalName = "fam_relat")
    public void setFam_relat(String fam_relat){
        this.fam_relat = fam_relat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlBeforeCgCdInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("cgncd_clsf").append("=").append(cgncd_clsf).append(",");
        sb.append("fam_relat").append("=").append(fam_relat);
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
