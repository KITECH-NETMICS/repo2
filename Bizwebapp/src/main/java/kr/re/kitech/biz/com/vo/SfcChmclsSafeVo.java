package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사전안전성 검토 Vo")
public class SfcChmclsSafeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SfcChmclsSafeVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "연구실번호", physicalName = "lab_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_no;

    @ElDtoField(logicalName = "연구실명", physicalName = "lab_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lab_nm;

    @ElDtoField(logicalName = "구매번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_date;

    @ElDtoField(logicalName = "신청자", physicalName = "reqst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_syspayno;

    @ElDtoField(logicalName = "사용용도", physicalName = "req_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_usg;

    @ElDtoField(logicalName = "신청자명", physicalName = "reqst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqst_nm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "연구실책임자", physicalName = "main_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_syspayno;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "lab_no")
    public String getLab_no(){
        return lab_no;
    }

    @ElVoField(physicalName = "lab_no")
    public void setLab_no(String lab_no){
        this.lab_no = lab_no;
    }

    @ElVoField(physicalName = "lab_nm")
    public String getLab_nm(){
        return lab_nm;
    }

    @ElVoField(physicalName = "lab_nm")
    public void setLab_nm(String lab_nm){
        this.lab_nm = lab_nm;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "req_date")
    public String getReq_date(){
        return req_date;
    }

    @ElVoField(physicalName = "req_date")
    public void setReq_date(String req_date){
        this.req_date = req_date;
    }

    @ElVoField(physicalName = "reqst_syspayno")
    public String getReqst_syspayno(){
        return reqst_syspayno;
    }

    @ElVoField(physicalName = "reqst_syspayno")
    public void setReqst_syspayno(String reqst_syspayno){
        this.reqst_syspayno = reqst_syspayno;
    }

    @ElVoField(physicalName = "req_usg")
    public String getReq_usg(){
        return req_usg;
    }

    @ElVoField(physicalName = "req_usg")
    public void setReq_usg(String req_usg){
        this.req_usg = req_usg;
    }

    @ElVoField(physicalName = "reqst_nm")
    public String getReqst_nm(){
        return reqst_nm;
    }

    @ElVoField(physicalName = "reqst_nm")
    public void setReqst_nm(String reqst_nm){
        this.reqst_nm = reqst_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public String getMain_secrt_rspns_syspayno(){
        return main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public void setMain_secrt_rspns_syspayno(String main_secrt_rspns_syspayno){
        this.main_secrt_rspns_syspayno = main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SfcChmclsSafeVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("lab_no").append("=").append(lab_no).append(",");
        sb.append("lab_nm").append("=").append(lab_nm).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("req_date").append("=").append(req_date).append(",");
        sb.append("reqst_syspayno").append("=").append(reqst_syspayno).append(",");
        sb.append("req_usg").append("=").append(req_usg).append(",");
        sb.append("reqst_nm").append("=").append(reqst_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("main_secrt_rspns_syspayno").append("=").append(main_secrt_rspns_syspayno).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
