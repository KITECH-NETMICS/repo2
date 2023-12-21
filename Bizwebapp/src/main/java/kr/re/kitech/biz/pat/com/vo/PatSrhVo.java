package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "선행기술조사 Vo")
public class PatSrhVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatSrhVo(){
    }

    @ElDtoField(logicalName = "선행기술 의뢰번호", physicalName = "srh_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String srh_id;

    @ElDtoField(logicalName = "업무진행상태코드", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "의뢰자 개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "의뢰 특허사무소 코드", physicalName = "req_patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_patofic_cd;

    @ElDtoField(logicalName = "의뢰 사무소 담당자 ID", physicalName = "hope_patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String hope_patofic_charg_id;

    @ElDtoField(logicalName = "의뢰 내용", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;

    @ElVoField(physicalName = "srh_id")
    public String getSrh_id(){
        return srh_id;
    }

    @ElVoField(physicalName = "srh_id")
    public void setSrh_id(String srh_id){
        this.srh_id = srh_id;
    }

    @ElVoField(physicalName = "job_state_cd")
    public String getJob_state_cd(){
        return job_state_cd;
    }

    @ElVoField(physicalName = "job_state_cd")
    public void setJob_state_cd(String job_state_cd){
        this.job_state_cd = job_state_cd;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public String getReq_patofic_cd(){
        return req_patofic_cd;
    }

    @ElVoField(physicalName = "req_patofic_cd")
    public void setReq_patofic_cd(String req_patofic_cd){
        this.req_patofic_cd = req_patofic_cd;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public String getHope_patofic_charg_id(){
        return hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "hope_patofic_charg_id")
    public void setHope_patofic_charg_id(String hope_patofic_charg_id){
        this.hope_patofic_charg_id = hope_patofic_charg_id;
    }

    @ElVoField(physicalName = "req_comment")
    public String getReq_comment(){
        return req_comment;
    }

    @ElVoField(physicalName = "req_comment")
    public void setReq_comment(String req_comment){
        this.req_comment = req_comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatSrhVo [");
        sb.append("srh_id").append("=").append(srh_id).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_patofic_cd").append("=").append(req_patofic_cd).append(",");
        sb.append("hope_patofic_charg_id").append("=").append(hope_patofic_charg_id).append(",");
        sb.append("req_comment").append("=").append(req_comment);
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
