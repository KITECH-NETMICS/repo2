package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 Vo")
public class ResAppBsnsReqVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppBsnsReqVo(){
    }

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "연구책임자 시스템개인번호", physicalName = "resch_rspns_main", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main;

    @ElDtoField(logicalName = "연구책임자 사번", physicalName = "resch_rspns_main_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main_empno;

    @ElDtoField(logicalName = "연구책임자 성명", physicalName = "resch_rspns_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main_nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "선정결과", physicalName = "selt_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_rst;

    @ElDtoField(logicalName = "선정결과명", physicalName = "selt_rst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selt_rst_nm;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_str", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_str;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "내외구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "연구시작일자", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "연구종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "부처명", physicalName = "bsns_cd_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic_nm;

    @ElDtoField(logicalName = "세부사업명", physicalName = "bsns_cd_detls_bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns_nm;

    @ElDtoField(logicalName = "전담기관", physicalName = "bsns_cd_exclsv_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_exclsv_agncy;

    @ElDtoField(logicalName = "본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "연구비(현금)", physicalName = "tot_cash_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tot_cash_amt;

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public String getResch_rspns_main(){
        return resch_rspns_main;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public void setResch_rspns_main(String resch_rspns_main){
        this.resch_rspns_main = resch_rspns_main;
    }

    @ElVoField(physicalName = "resch_rspns_main_empno")
    public String getResch_rspns_main_empno(){
        return resch_rspns_main_empno;
    }

    @ElVoField(physicalName = "resch_rspns_main_empno")
    public void setResch_rspns_main_empno(String resch_rspns_main_empno){
        this.resch_rspns_main_empno = resch_rspns_main_empno;
    }

    @ElVoField(physicalName = "resch_rspns_main_nm")
    public String getResch_rspns_main_nm(){
        return resch_rspns_main_nm;
    }

    @ElVoField(physicalName = "resch_rspns_main_nm")
    public void setResch_rspns_main_nm(String resch_rspns_main_nm){
        this.resch_rspns_main_nm = resch_rspns_main_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "selt_rst")
    public String getSelt_rst(){
        return selt_rst;
    }

    @ElVoField(physicalName = "selt_rst")
    public void setSelt_rst(String selt_rst){
        this.selt_rst = selt_rst;
    }

    @ElVoField(physicalName = "selt_rst_nm")
    public String getSelt_rst_nm(){
        return selt_rst_nm;
    }

    @ElVoField(physicalName = "selt_rst_nm")
    public void setSelt_rst_nm(String selt_rst_nm){
        this.selt_rst_nm = selt_rst_nm;
    }

    @ElVoField(physicalName = "apr_state_str")
    public String getApr_state_str(){
        return apr_state_str;
    }

    @ElVoField(physicalName = "apr_state_str")
    public void setApr_state_str(String apr_state_str){
        this.apr_state_str = apr_state_str;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public String getBsns_cd_ofic_nm(){
        return bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_ofic_nm")
    public void setBsns_cd_ofic_nm(String bsns_cd_ofic_nm){
        this.bsns_cd_ofic_nm = bsns_cd_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public String getBsns_cd_detls_bsns_nm(){
        return bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns_nm")
    public void setBsns_cd_detls_bsns_nm(String bsns_cd_detls_bsns_nm){
        this.bsns_cd_detls_bsns_nm = bsns_cd_detls_bsns_nm;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public String getBsns_cd_exclsv_agncy(){
        return bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "bsns_cd_exclsv_agncy")
    public void setBsns_cd_exclsv_agncy(String bsns_cd_exclsv_agncy){
        this.bsns_cd_exclsv_agncy = bsns_cd_exclsv_agncy;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "tot_cash_amt")
    public long getTot_cash_amt(){
        return tot_cash_amt;
    }

    @ElVoField(physicalName = "tot_cash_amt")
    public void setTot_cash_amt(long tot_cash_amt){
        this.tot_cash_amt = tot_cash_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBsnsReqVo [");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("resch_rspns_main").append("=").append(resch_rspns_main).append(",");
        sb.append("resch_rspns_main_empno").append("=").append(resch_rspns_main_empno).append(",");
        sb.append("resch_rspns_main_nm").append("=").append(resch_rspns_main_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("selt_rst").append("=").append(selt_rst).append(",");
        sb.append("selt_rst_nm").append("=").append(selt_rst_nm).append(",");
        sb.append("apr_state_str").append("=").append(apr_state_str).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("bsns_cd_ofic_nm").append("=").append(bsns_cd_ofic_nm).append(",");
        sb.append("bsns_cd_detls_bsns_nm").append("=").append(bsns_cd_detls_bsns_nm).append(",");
        sb.append("bsns_cd_exclsv_agncy").append("=").append(bsns_cd_exclsv_agncy).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("tot_cash_amt").append("=").append(tot_cash_amt);
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
