package kr.re.kitech.biz.pat.apl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "분할우선권 신청서 Vo")
public class PatDvsPrrVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatDvsPrrVo(){
    }

    @ElDtoField(logicalName = "결재신청번호", physicalName = "dp_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_req_no;

    @ElDtoField(logicalName = "기안자시스템개인번호", physicalName = "draft_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_syspayno;

    @ElDtoField(logicalName = "신청구분", physicalName = "dp_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_clsf;

    @ElDtoField(logicalName = "신청사유", physicalName = "dp_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_resn;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "dp_req_no")
    public String getDp_req_no(){
        return dp_req_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public void setDp_req_no(String dp_req_no){
        this.dp_req_no = dp_req_no;
    }

    @ElVoField(physicalName = "draft_syspayno")
    public String getDraft_syspayno(){
        return draft_syspayno;
    }

    @ElVoField(physicalName = "draft_syspayno")
    public void setDraft_syspayno(String draft_syspayno){
        this.draft_syspayno = draft_syspayno;
    }

    @ElVoField(physicalName = "dp_clsf")
    public String getDp_clsf(){
        return dp_clsf;
    }

    @ElVoField(physicalName = "dp_clsf")
    public void setDp_clsf(String dp_clsf){
        this.dp_clsf = dp_clsf;
    }

    @ElVoField(physicalName = "dp_resn")
    public String getDp_resn(){
        return dp_resn;
    }

    @ElVoField(physicalName = "dp_resn")
    public void setDp_resn(String dp_resn){
        this.dp_resn = dp_resn;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatDvsPrrVo [");
        sb.append("dp_req_no").append("=").append(dp_req_no).append(",");
        sb.append("draft_syspayno").append("=").append(draft_syspayno).append(",");
        sb.append("dp_clsf").append("=").append(dp_clsf).append(",");
        sb.append("dp_resn").append("=").append(dp_resn).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no);
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
