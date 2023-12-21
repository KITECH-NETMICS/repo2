package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록VO")
public class ApiEipMNoteVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipMNoteVo(){
    }

    @ElDtoField(logicalName = "작성일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_ymd;

    @ElDtoField(logicalName = "회의일자", physicalName = "meet_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_ymd;

    @ElDtoField(logicalName = "회의명", physicalName = "meet_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_nm;

    @ElDtoField(logicalName = "작성자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "회의록신청번호", physicalName = "meet_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String meet_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회의록상세주소", physicalName = "URL", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String URL;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String unslip_no;

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        String ret = this.req_ymd;
        return ret;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "meet_ymd")
    public String getMeet_ymd(){
        String ret = this.meet_ymd;
        return ret;
    }

    @ElVoField(physicalName = "meet_ymd")
    public void setMeet_ymd(String meet_ymd){
        this.meet_ymd = meet_ymd;
    }

    @ElVoField(physicalName = "meet_nm")
    public String getMeet_nm(){
        String ret = this.meet_nm;
        return ret;
    }

    @ElVoField(physicalName = "meet_nm")
    public void setMeet_nm(String meet_nm){
        this.meet_nm = meet_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "meet_no")
    public String getMeet_no(){
        String ret = this.meet_no;
        return ret;
    }

    @ElVoField(physicalName = "meet_no")
    public void setMeet_no(String meet_no){
        this.meet_no = meet_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "URL")
    public String getURL(){
        String ret = this.URL;
        return ret;
    }

    @ElVoField(physicalName = "URL")
    public void setURL(String URL){
        this.URL = URL;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipMNoteVo [");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("meet_ymd").append("=").append(meet_ymd).append(",");
        sb.append("meet_nm").append("=").append(meet_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("meet_no").append("=").append(meet_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("URL").append("=").append(URL).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("unslip_no").append("=").append(unslip_no);
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
