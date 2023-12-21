package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부강의신청 조회Vo")
public class CtrCvnTripSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrCvnTripSrcVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "신청월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yyyymm;

    @ElDtoField(logicalName = "신고구분", physicalName = "report_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String report_cd;

    @ElDtoField(logicalName = "활동구분", physicalName = "act_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String act_clsf;

    @ElDtoField(logicalName = "활동유형", physicalName = "activity_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String activity_cd;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "강의월시작", physicalName = "st_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String st_daytm;

    @ElDtoField(logicalName = "강의월끝", physicalName = "ed_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ed_daytm;

    @ElDtoField(logicalName = "신청기간시작", physicalName = "st_req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String st_req_daytm;

    @ElDtoField(logicalName = "신청기간끝", physicalName = "ed_req_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ed_req_daytm;

    @ElDtoField(logicalName = "요청기관명", physicalName = "invite_org_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_org_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        return yyyymm;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "report_cd")
    public String getReport_cd(){
        return report_cd;
    }

    @ElVoField(physicalName = "report_cd")
    public void setReport_cd(String report_cd){
        this.report_cd = report_cd;
    }

    @ElVoField(physicalName = "act_clsf")
    public String getAct_clsf(){
        return act_clsf;
    }

    @ElVoField(physicalName = "act_clsf")
    public void setAct_clsf(String act_clsf){
        this.act_clsf = act_clsf;
    }

    @ElVoField(physicalName = "activity_cd")
    public String getActivity_cd(){
        return activity_cd;
    }

    @ElVoField(physicalName = "activity_cd")
    public void setActivity_cd(String activity_cd){
        this.activity_cd = activity_cd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "st_daytm")
    public String getSt_daytm(){
        return st_daytm;
    }

    @ElVoField(physicalName = "st_daytm")
    public void setSt_daytm(String st_daytm){
        this.st_daytm = st_daytm;
    }

    @ElVoField(physicalName = "ed_daytm")
    public String getEd_daytm(){
        return ed_daytm;
    }

    @ElVoField(physicalName = "ed_daytm")
    public void setEd_daytm(String ed_daytm){
        this.ed_daytm = ed_daytm;
    }

    @ElVoField(physicalName = "st_req_daytm")
    public String getSt_req_daytm(){
        return st_req_daytm;
    }

    @ElVoField(physicalName = "st_req_daytm")
    public void setSt_req_daytm(String st_req_daytm){
        this.st_req_daytm = st_req_daytm;
    }

    @ElVoField(physicalName = "ed_req_daytm")
    public String getEd_req_daytm(){
        return ed_req_daytm;
    }

    @ElVoField(physicalName = "ed_req_daytm")
    public void setEd_req_daytm(String ed_req_daytm){
        this.ed_req_daytm = ed_req_daytm;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public String getInvite_org_nm(){
        return invite_org_nm;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public void setInvite_org_nm(String invite_org_nm){
        this.invite_org_nm = invite_org_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrCvnTripSrcVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("report_cd").append("=").append(report_cd).append(",");
        sb.append("act_clsf").append("=").append(act_clsf).append(",");
        sb.append("activity_cd").append("=").append(activity_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("st_daytm").append("=").append(st_daytm).append(",");
        sb.append("ed_daytm").append("=").append(ed_daytm).append(",");
        sb.append("st_req_daytm").append("=").append(st_req_daytm).append(",");
        sb.append("ed_req_daytm").append("=").append(ed_req_daytm).append(",");
        sb.append("invite_org_nm").append("=").append(invite_org_nm);
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
