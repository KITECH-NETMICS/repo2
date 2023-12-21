package kr.re.kitech.biz.res.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "학술대회참가신청Vo")
public class ResConfPoolReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResConfPoolReqVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "학회Pool번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "학술행사 참여시작일", physicalName = "part_strdt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_strdt;

    @ElDtoField(logicalName = "학술행사 참여종료일", physicalName = "part_clsdt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_clsdt;

    @ElDtoField(logicalName = "참여구분", physicalName = "part_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String part_clsf;

    @ElDtoField(logicalName = "학술행사 논문명", physicalName = "conf_thesis_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_thesis_nm;

    @ElDtoField(logicalName = "학술행사 발표주제명", physicalName = "conf_ptthm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_ptthm_nm;

    @ElDtoField(logicalName = "논문 첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "학술행사 첨부파일번호", physicalName = "attach_file_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no2;

    @ElDtoField(logicalName = "학술대회명", physicalName = "conf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_nm;

    @ElDtoField(logicalName = "연구분야", physicalName = "scitech_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String scitech_cd;

    @ElDtoField(logicalName = "행사(예정)시작일", physicalName = "event_strdt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_strdt;

    @ElDtoField(logicalName = "행사(예정)종료일", physicalName = "event_clsdt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String event_clsdt;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "part_strdt")
    public String getPart_strdt(){
        return part_strdt;
    }

    @ElVoField(physicalName = "part_strdt")
    public void setPart_strdt(String part_strdt){
        this.part_strdt = part_strdt;
    }

    @ElVoField(physicalName = "part_clsdt")
    public String getPart_clsdt(){
        return part_clsdt;
    }

    @ElVoField(physicalName = "part_clsdt")
    public void setPart_clsdt(String part_clsdt){
        this.part_clsdt = part_clsdt;
    }

    @ElVoField(physicalName = "part_clsf")
    public String getPart_clsf(){
        return part_clsf;
    }

    @ElVoField(physicalName = "part_clsf")
    public void setPart_clsf(String part_clsf){
        this.part_clsf = part_clsf;
    }

    @ElVoField(physicalName = "conf_thesis_nm")
    public String getConf_thesis_nm(){
        return conf_thesis_nm;
    }

    @ElVoField(physicalName = "conf_thesis_nm")
    public void setConf_thesis_nm(String conf_thesis_nm){
        this.conf_thesis_nm = conf_thesis_nm;
    }

    @ElVoField(physicalName = "conf_ptthm_nm")
    public String getConf_ptthm_nm(){
        return conf_ptthm_nm;
    }

    @ElVoField(physicalName = "conf_ptthm_nm")
    public void setConf_ptthm_nm(String conf_ptthm_nm){
        this.conf_ptthm_nm = conf_ptthm_nm;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public String getAttach_file_no2(){
        return attach_file_no2;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public void setAttach_file_no2(String attach_file_no2){
        this.attach_file_no2 = attach_file_no2;
    }

    @ElVoField(physicalName = "conf_nm")
    public String getConf_nm(){
        return conf_nm;
    }

    @ElVoField(physicalName = "conf_nm")
    public void setConf_nm(String conf_nm){
        this.conf_nm = conf_nm;
    }

    @ElVoField(physicalName = "scitech_cd")
    public String getScitech_cd(){
        return scitech_cd;
    }

    @ElVoField(physicalName = "scitech_cd")
    public void setScitech_cd(String scitech_cd){
        this.scitech_cd = scitech_cd;
    }

    @ElVoField(physicalName = "event_strdt")
    public String getEvent_strdt(){
        return event_strdt;
    }

    @ElVoField(physicalName = "event_strdt")
    public void setEvent_strdt(String event_strdt){
        this.event_strdt = event_strdt;
    }

    @ElVoField(physicalName = "event_clsdt")
    public String getEvent_clsdt(){
        return event_clsdt;
    }

    @ElVoField(physicalName = "event_clsdt")
    public void setEvent_clsdt(String event_clsdt){
        this.event_clsdt = event_clsdt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResConfPoolReqVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("part_strdt").append("=").append(part_strdt).append(",");
        sb.append("part_clsdt").append("=").append(part_clsdt).append(",");
        sb.append("part_clsf").append("=").append(part_clsf).append(",");
        sb.append("conf_thesis_nm").append("=").append(conf_thesis_nm).append(",");
        sb.append("conf_ptthm_nm").append("=").append(conf_ptthm_nm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_no2").append("=").append(attach_file_no2).append(",");
        sb.append("conf_nm").append("=").append(conf_nm).append(",");
        sb.append("scitech_cd").append("=").append(scitech_cd).append(",");
        sb.append("event_strdt").append("=").append(event_strdt).append(",");
        sb.append("event_clsdt").append("=").append(event_clsdt);
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
