package kr.re.kitech.biz.ass.eqip.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구장비비 통합관리 한도금액 Vo")
public class ResEquipLimitAmtVo extends kr.re.kitech.biz.fin.com.vo.ComReqVo {
    private static final long serialVersionUID = 1L;

    public ResEquipLimitAmtVo(){
    }

    @ElDtoField(logicalName = "통합관리단위", physicalName = "intgr_mngmt_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_mngmt_unit;

    @ElDtoField(logicalName = "협약비율", physicalName = "req_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_rt;

    @ElDtoField(logicalName = "신청금액 합계", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "배분비율", physicalName = "distr_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String distr_rt;

    @ElDtoField(logicalName = "차수", physicalName = "degr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String degr;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns;

    @ElDtoField(logicalName = "변경사유", physicalName = "chng_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_resn;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "본부명", physicalName = "divsn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String divsn_dept_nm;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "직책명", physicalName = "duty_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_nm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "누적한도금액", physicalName = "accm_lmt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long accm_lmt_amt;

    @ElDtoField(logicalName = "추가한도금액", physicalName = "add_lmt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long add_lmt_amt;

    @ElDtoField(logicalName = "적립총액", physicalName = "accm_totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long accm_totl_amt;

    @ElDtoField(logicalName = "집행금액", physicalName = "enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long enfrc_amt;

    @ElDtoField(logicalName = "적립한도잔액", physicalName = "accm_ramt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long accm_ramt_amt;

    @ElDtoField(logicalName = "통합계정번호", physicalName = "intgr_accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intgr_accnt_no;

    @ElDtoField(logicalName = "relat_no", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public String getIntgr_mngmt_unit(){
        return intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "intgr_mngmt_unit")
    public void setIntgr_mngmt_unit(String intgr_mngmt_unit){
        this.intgr_mngmt_unit = intgr_mngmt_unit;
    }

    @ElVoField(physicalName = "req_rt")
    public String getReq_rt(){
        return req_rt;
    }

    @ElVoField(physicalName = "req_rt")
    public void setReq_rt(String req_rt){
        this.req_rt = req_rt;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "distr_rt")
    public String getDistr_rt(){
        return distr_rt;
    }

    @ElVoField(physicalName = "distr_rt")
    public void setDistr_rt(String distr_rt){
        this.distr_rt = distr_rt;
    }

    @ElVoField(physicalName = "degr")
    public String getDegr(){
        return degr;
    }

    @ElVoField(physicalName = "degr")
    public void setDegr(String degr){
        this.degr = degr;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "chng_resn")
    public String getChng_resn(){
        return chng_resn;
    }

    @ElVoField(physicalName = "chng_resn")
    public void setChng_resn(String chng_resn){
        this.chng_resn = chng_resn;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public String getDivsn_dept_nm(){
        return divsn_dept_nm;
    }

    @ElVoField(physicalName = "divsn_dept_nm")
    public void setDivsn_dept_nm(String divsn_dept_nm){
        this.divsn_dept_nm = divsn_dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public String getDuty_nm(){
        return duty_nm;
    }

    @ElVoField(physicalName = "duty_nm")
    public void setDuty_nm(String duty_nm){
        this.duty_nm = duty_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "accm_lmt_amt")
    public long getAccm_lmt_amt(){
        return accm_lmt_amt;
    }

    @ElVoField(physicalName = "accm_lmt_amt")
    public void setAccm_lmt_amt(long accm_lmt_amt){
        this.accm_lmt_amt = accm_lmt_amt;
    }

    @ElVoField(physicalName = "add_lmt_amt")
    public long getAdd_lmt_amt(){
        return add_lmt_amt;
    }

    @ElVoField(physicalName = "add_lmt_amt")
    public void setAdd_lmt_amt(long add_lmt_amt){
        this.add_lmt_amt = add_lmt_amt;
    }

    @ElVoField(physicalName = "accm_totl_amt")
    public long getAccm_totl_amt(){
        return accm_totl_amt;
    }

    @ElVoField(physicalName = "accm_totl_amt")
    public void setAccm_totl_amt(long accm_totl_amt){
        this.accm_totl_amt = accm_totl_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public long getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(long enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "accm_ramt_amt")
    public long getAccm_ramt_amt(){
        return accm_ramt_amt;
    }

    @ElVoField(physicalName = "accm_ramt_amt")
    public void setAccm_ramt_amt(long accm_ramt_amt){
        this.accm_ramt_amt = accm_ramt_amt;
    }

    @ElVoField(physicalName = "intgr_accnt_no")
    public String getIntgr_accnt_no(){
        return intgr_accnt_no;
    }

    @ElVoField(physicalName = "intgr_accnt_no")
    public void setIntgr_accnt_no(String intgr_accnt_no){
        this.intgr_accnt_no = intgr_accnt_no;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResEquipLimitAmtVo [");
        sb.append("intgr_mngmt_unit").append("=").append(intgr_mngmt_unit).append(",");
        sb.append("req_rt").append("=").append(req_rt).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("distr_rt").append("=").append(distr_rt).append(",");
        sb.append("degr").append("=").append(degr).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("chng_resn").append("=").append(chng_resn).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("divsn_dept_nm").append("=").append(divsn_dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("duty_nm").append("=").append(duty_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("accm_lmt_amt").append("=").append(accm_lmt_amt).append(",");
        sb.append("add_lmt_amt").append("=").append(add_lmt_amt).append(",");
        sb.append("accm_totl_amt").append("=").append(accm_totl_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("accm_ramt_amt").append("=").append(accm_ramt_amt).append(",");
        sb.append("intgr_accnt_no").append("=").append(intgr_accnt_no).append(",");
        sb.append("relat_no").append("=").append(relat_no);
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
