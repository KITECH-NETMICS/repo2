package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회의록 조회(팝업) Vo")
public class FspMeetMntPopVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspMeetMntPopVo(){
    }

    @ElDtoField(logicalName = "회의번호", physicalName = "meet_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_req_no;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "회의일자", physicalName = "meet_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_ymd;

    @ElDtoField(logicalName = "회의시간", physicalName = "meet_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_time;

    @ElDtoField(logicalName = "회의명", physicalName = "meet_subject", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_subject;

    @ElDtoField(logicalName = "증빙구분명", physicalName = "evid_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_clsf_nm;

    @ElDtoField(logicalName = "증빙번호", physicalName = "evid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "증빙여부", physicalName = "evid_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_chk;

    @ElVoField(physicalName = "meet_req_no")
    public String getMeet_req_no(){
        return meet_req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public void setMeet_req_no(String meet_req_no){
        this.meet_req_no = meet_req_no;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "meet_ymd")
    public String getMeet_ymd(){
        return meet_ymd;
    }

    @ElVoField(physicalName = "meet_ymd")
    public void setMeet_ymd(String meet_ymd){
        this.meet_ymd = meet_ymd;
    }

    @ElVoField(physicalName = "meet_time")
    public String getMeet_time(){
        return meet_time;
    }

    @ElVoField(physicalName = "meet_time")
    public void setMeet_time(String meet_time){
        this.meet_time = meet_time;
    }

    @ElVoField(physicalName = "meet_subject")
    public String getMeet_subject(){
        return meet_subject;
    }

    @ElVoField(physicalName = "meet_subject")
    public void setMeet_subject(String meet_subject){
        this.meet_subject = meet_subject;
    }

    @ElVoField(physicalName = "evid_clsf_nm")
    public String getEvid_clsf_nm(){
        return evid_clsf_nm;
    }

    @ElVoField(physicalName = "evid_clsf_nm")
    public void setEvid_clsf_nm(String evid_clsf_nm){
        this.evid_clsf_nm = evid_clsf_nm;
    }

    @ElVoField(physicalName = "evid_no")
    public String getEvid_no(){
        return evid_no;
    }

    @ElVoField(physicalName = "evid_no")
    public void setEvid_no(String evid_no){
        this.evid_no = evid_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "evid_chk")
    public String getEvid_chk(){
        return evid_chk;
    }

    @ElVoField(physicalName = "evid_chk")
    public void setEvid_chk(String evid_chk){
        this.evid_chk = evid_chk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspMeetMntHPopVo [");
        sb.append("meet_req_no").append("=").append(meet_req_no).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("meet_ymd").append("=").append(meet_ymd).append(",");
        sb.append("meet_time").append("=").append(meet_time).append(",");
        sb.append("meet_subject").append("=").append(meet_subject).append(",");
        sb.append("evid_clsf_nm").append("=").append(evid_clsf_nm).append(",");
        sb.append("evid_no").append("=").append(evid_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("evid_chk").append("=").append(evid_chk);
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
