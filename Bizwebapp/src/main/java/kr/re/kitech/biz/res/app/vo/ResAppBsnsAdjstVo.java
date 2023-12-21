package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업조정회의 Vo")
public class ResAppBsnsAdjstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppBsnsAdjstVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "지역본부", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "신청사유", physicalName = "req_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_cause;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns;

    @ElDtoField(logicalName = "사업부처", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "세부사업코드", physicalName = "bsns_cd_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_detls_bsns;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "연구책임자개인번호", physicalName = "resch_rspns_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_empno;

    @ElDtoField(logicalName = "연구책임자성명", physicalName = "resch_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_nm;

    @ElDtoField(logicalName = "부처명", physicalName = "bsns_ofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_ofic_nm;

    @ElDtoField(logicalName = "세부사업명", physicalName = "bsns_nm_detls_bsns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm_detls_bsns;

    @ElDtoField(logicalName = "RFP번호", physicalName = "rfp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rfp_no;

    @ElDtoField(logicalName = "공고번호", physicalName = "bsns_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_noti_no;

    @ElDtoField(logicalName = "참여유형", physicalName = "prj_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_knd;

    @ElDtoField(logicalName = "사업명", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "추진목적 및 주요내용", physicalName = "major_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String major_contnt;

    @ElDtoField(logicalName = "총사업비(전체)", physicalName = "totl_bsns_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_bsns_amt;

    @ElDtoField(logicalName = "총사업비(당해년도)", physicalName = "cur_yr_bsns_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cur_yr_bsns_amt;

    @ElDtoField(logicalName = "우리원수행비(전체)", physicalName = "totl_perf_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_perf_amt;

    @ElDtoField(logicalName = "우리원수행비(당해년도)", physicalName = "cur_yr_perf_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cur_yr_perf_amt;

    @ElDtoField(logicalName = "총사업기간", physicalName = "totl_prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totl_prd;

    @ElDtoField(logicalName = "확정여부", physicalName = "set_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String set_yn;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "req_cause")
    public String getReq_cause(){
        return req_cause;
    }

    @ElVoField(physicalName = "req_cause")
    public void setReq_cause(String req_cause){
        this.req_cause = req_cause;
    }

    @ElVoField(physicalName = "resch_rspns")
    public String getResch_rspns(){
        return resch_rspns;
    }

    @ElVoField(physicalName = "resch_rspns")
    public void setResch_rspns(String resch_rspns){
        this.resch_rspns = resch_rspns;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public String getBsns_cd_detls_bsns(){
        return bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_cd_detls_bsns")
    public void setBsns_cd_detls_bsns(String bsns_cd_detls_bsns){
        this.bsns_cd_detls_bsns = bsns_cd_detls_bsns;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "resch_rspns_empno")
    public String getResch_rspns_empno(){
        return resch_rspns_empno;
    }

    @ElVoField(physicalName = "resch_rspns_empno")
    public void setResch_rspns_empno(String resch_rspns_empno){
        this.resch_rspns_empno = resch_rspns_empno;
    }

    @ElVoField(physicalName = "resch_rspns_nm")
    public String getResch_rspns_nm(){
        return resch_rspns_nm;
    }

    @ElVoField(physicalName = "resch_rspns_nm")
    public void setResch_rspns_nm(String resch_rspns_nm){
        this.resch_rspns_nm = resch_rspns_nm;
    }

    @ElVoField(physicalName = "bsns_ofic_nm")
    public String getBsns_ofic_nm(){
        return bsns_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_ofic_nm")
    public void setBsns_ofic_nm(String bsns_ofic_nm){
        this.bsns_ofic_nm = bsns_ofic_nm;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public String getBsns_nm_detls_bsns(){
        return bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "bsns_nm_detls_bsns")
    public void setBsns_nm_detls_bsns(String bsns_nm_detls_bsns){
        this.bsns_nm_detls_bsns = bsns_nm_detls_bsns;
    }

    @ElVoField(physicalName = "rfp_no")
    public String getRfp_no(){
        return rfp_no;
    }

    @ElVoField(physicalName = "rfp_no")
    public void setRfp_no(String rfp_no){
        this.rfp_no = rfp_no;
    }

    @ElVoField(physicalName = "bsns_noti_no")
    public String getBsns_noti_no(){
        return bsns_noti_no;
    }

    @ElVoField(physicalName = "bsns_noti_no")
    public void setBsns_noti_no(String bsns_noti_no){
        this.bsns_noti_no = bsns_noti_no;
    }

    @ElVoField(physicalName = "prj_knd")
    public String getPrj_knd(){
        return prj_knd;
    }

    @ElVoField(physicalName = "prj_knd")
    public void setPrj_knd(String prj_knd){
        this.prj_knd = prj_knd;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "major_contnt")
    public String getMajor_contnt(){
        return major_contnt;
    }

    @ElVoField(physicalName = "major_contnt")
    public void setMajor_contnt(String major_contnt){
        this.major_contnt = major_contnt;
    }

    @ElVoField(physicalName = "totl_bsns_amt")
    public long getTotl_bsns_amt(){
        return totl_bsns_amt;
    }

    @ElVoField(physicalName = "totl_bsns_amt")
    public void setTotl_bsns_amt(long totl_bsns_amt){
        this.totl_bsns_amt = totl_bsns_amt;
    }

    @ElVoField(physicalName = "cur_yr_bsns_amt")
    public long getCur_yr_bsns_amt(){
        return cur_yr_bsns_amt;
    }

    @ElVoField(physicalName = "cur_yr_bsns_amt")
    public void setCur_yr_bsns_amt(long cur_yr_bsns_amt){
        this.cur_yr_bsns_amt = cur_yr_bsns_amt;
    }

    @ElVoField(physicalName = "totl_perf_amt")
    public long getTotl_perf_amt(){
        return totl_perf_amt;
    }

    @ElVoField(physicalName = "totl_perf_amt")
    public void setTotl_perf_amt(long totl_perf_amt){
        this.totl_perf_amt = totl_perf_amt;
    }

    @ElVoField(physicalName = "cur_yr_perf_amt")
    public long getCur_yr_perf_amt(){
        return cur_yr_perf_amt;
    }

    @ElVoField(physicalName = "cur_yr_perf_amt")
    public void setCur_yr_perf_amt(long cur_yr_perf_amt){
        this.cur_yr_perf_amt = cur_yr_perf_amt;
    }

    @ElVoField(physicalName = "totl_prd")
    public String getTotl_prd(){
        return totl_prd;
    }

    @ElVoField(physicalName = "totl_prd")
    public void setTotl_prd(String totl_prd){
        this.totl_prd = totl_prd;
    }

    @ElVoField(physicalName = "set_yn")
    public String getSet_yn(){
        return set_yn;
    }

    @ElVoField(physicalName = "set_yn")
    public void setSet_yn(String set_yn){
        this.set_yn = set_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppBsnsAdjstVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("req_cause").append("=").append(req_cause).append(",");
        sb.append("resch_rspns").append("=").append(resch_rspns).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("bsns_cd_detls_bsns").append("=").append(bsns_cd_detls_bsns).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("resch_rspns_empno").append("=").append(resch_rspns_empno).append(",");
        sb.append("resch_rspns_nm").append("=").append(resch_rspns_nm).append(",");
        sb.append("bsns_ofic_nm").append("=").append(bsns_ofic_nm).append(",");
        sb.append("bsns_nm_detls_bsns").append("=").append(bsns_nm_detls_bsns).append(",");
        sb.append("rfp_no").append("=").append(rfp_no).append(",");
        sb.append("bsns_noti_no").append("=").append(bsns_noti_no).append(",");
        sb.append("prj_knd").append("=").append(prj_knd).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("major_contnt").append("=").append(major_contnt).append(",");
        sb.append("totl_bsns_amt").append("=").append(totl_bsns_amt).append(",");
        sb.append("cur_yr_bsns_amt").append("=").append(cur_yr_bsns_amt).append(",");
        sb.append("totl_perf_amt").append("=").append(totl_perf_amt).append(",");
        sb.append("cur_yr_perf_amt").append("=").append(cur_yr_perf_amt).append(",");
        sb.append("totl_prd").append("=").append(totl_prd).append(",");
        sb.append("set_yn").append("=").append(set_yn);
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
