package kr.re.kitech.biz.pat.apl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "출원 Vo")
public class PatAppVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatAppVo(){
    }

    @ElDtoField(logicalName = "출원 의뢰번호", physicalName = "app_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_id;

    @ElDtoField(logicalName = "업무진행상태코드", physicalName = "job_state_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_state_cd;

    @ElDtoField(logicalName = "요청자 개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "요청 출원 구분", physicalName = "req_app_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_app_clsf;

    @ElDtoField(logicalName = "요청 공개 유무", physicalName = "req_pub_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_pub_yn;

    @ElDtoField(logicalName = "요청 심사청구 유무", physicalName = "req_claim_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_claim_yn;

    @ElDtoField(logicalName = "요청 내용", physicalName = "req_comment", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_comment;

    @ElDtoField(logicalName = "요청 기타첨부", physicalName = "req_attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_attach_file;

    @ElVoField(physicalName = "app_id")
    public String getApp_id(){
        return app_id;
    }

    @ElVoField(physicalName = "app_id")
    public void setApp_id(String app_id){
        this.app_id = app_id;
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

    @ElVoField(physicalName = "req_app_clsf")
    public String getReq_app_clsf(){
        return req_app_clsf;
    }

    @ElVoField(physicalName = "req_app_clsf")
    public void setReq_app_clsf(String req_app_clsf){
        this.req_app_clsf = req_app_clsf;
    }

    @ElVoField(physicalName = "req_pub_yn")
    public String getReq_pub_yn(){
        return req_pub_yn;
    }

    @ElVoField(physicalName = "req_pub_yn")
    public void setReq_pub_yn(String req_pub_yn){
        this.req_pub_yn = req_pub_yn;
    }

    @ElVoField(physicalName = "req_claim_yn")
    public String getReq_claim_yn(){
        return req_claim_yn;
    }

    @ElVoField(physicalName = "req_claim_yn")
    public void setReq_claim_yn(String req_claim_yn){
        this.req_claim_yn = req_claim_yn;
    }

    @ElVoField(physicalName = "req_comment")
    public String getReq_comment(){
        return req_comment;
    }

    @ElVoField(physicalName = "req_comment")
    public void setReq_comment(String req_comment){
        this.req_comment = req_comment;
    }

    @ElVoField(physicalName = "req_attach_file")
    public String getReq_attach_file(){
        return req_attach_file;
    }

    @ElVoField(physicalName = "req_attach_file")
    public void setReq_attach_file(String req_attach_file){
        this.req_attach_file = req_attach_file;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatAppVo [");
        sb.append("app_id").append("=").append(app_id).append(",");
        sb.append("job_state_cd").append("=").append(job_state_cd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_app_clsf").append("=").append(req_app_clsf).append(",");
        sb.append("req_pub_yn").append("=").append(req_pub_yn).append(",");
        sb.append("req_claim_yn").append("=").append(req_claim_yn).append(",");
        sb.append("req_comment").append("=").append(req_comment).append(",");
        sb.append("req_attach_file").append("=").append(req_attach_file);
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
