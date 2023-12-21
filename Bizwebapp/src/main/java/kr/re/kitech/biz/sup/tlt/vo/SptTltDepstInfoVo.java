package kr.re.kitech.biz.sup.tlt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltDepstInfoExp")
public class SptTltDepstInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTltDepstInfoVo(){
    }

    @ElDtoField(logicalName = "입금관리번호", physicalName = "depst_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_mngmt_no;

    @ElDtoField(logicalName = "관리번호", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "입금상태", physicalName = "depst_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_state;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "파견기간", physicalName = "dispatch_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_term;

    @ElDtoField(logicalName = "년차", physicalName = "posi_an", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_an;

    @ElDtoField(logicalName = "입금예정구분", physicalName = "depst_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf_nm;

    @ElDtoField(logicalName = "입금예정금액", physicalName = "depst_schdl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_schdl_amt;

    @ElDtoField(logicalName = "입금예정일", physicalName = "depst_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_schdl_ymd;

    @ElDtoField(logicalName = "실입금금액", physicalName = "real_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long real_amt;

    @ElDtoField(logicalName = "미납금액", physicalName = "gap_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gap_amt;

    @ElDtoField(logicalName = "입금일자", physicalName = "depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_ymd;

    @ElDtoField(logicalName = "입금금액", physicalName = "depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_amt;

    @ElDtoField(logicalName = "계산서번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "기업명", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "대표자명", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "우편번호", physicalName = "cmpy_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_post_no;

    @ElDtoField(logicalName = "주소", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "대상분야", physicalName = "objct_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String objct_clsf_nm;

    @ElDtoField(logicalName = "최초선정일자", physicalName = "contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_ymd;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElVoField(physicalName = "depst_mngmt_no")
    public String getDepst_mngmt_no(){
        return depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public void setDepst_mngmt_no(String depst_mngmt_no){
        this.depst_mngmt_no = depst_mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "depst_state")
    public String getDepst_state(){
        return depst_state;
    }

    @ElVoField(physicalName = "depst_state")
    public void setDepst_state(String depst_state){
        this.depst_state = depst_state;
    }

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "dispatch_term")
    public String getDispatch_term(){
        return dispatch_term;
    }

    @ElVoField(physicalName = "dispatch_term")
    public void setDispatch_term(String dispatch_term){
        this.dispatch_term = dispatch_term;
    }

    @ElVoField(physicalName = "posi_an")
    public String getPosi_an(){
        return posi_an;
    }

    @ElVoField(physicalName = "posi_an")
    public void setPosi_an(String posi_an){
        this.posi_an = posi_an;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public String getDepst_clsf_nm(){
        return depst_clsf_nm;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public void setDepst_clsf_nm(String depst_clsf_nm){
        this.depst_clsf_nm = depst_clsf_nm;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public long getDepst_schdl_amt(){
        return depst_schdl_amt;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public void setDepst_schdl_amt(long depst_schdl_amt){
        this.depst_schdl_amt = depst_schdl_amt;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public String getDepst_schdl_ymd(){
        return depst_schdl_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public void setDepst_schdl_ymd(String depst_schdl_ymd){
        this.depst_schdl_ymd = depst_schdl_ymd;
    }

    @ElVoField(physicalName = "real_amt")
    public long getReal_amt(){
        return real_amt;
    }

    @ElVoField(physicalName = "real_amt")
    public void setReal_amt(long real_amt){
        this.real_amt = real_amt;
    }

    @ElVoField(physicalName = "gap_amt")
    public long getGap_amt(){
        return gap_amt;
    }

    @ElVoField(physicalName = "gap_amt")
    public void setGap_amt(long gap_amt){
        this.gap_amt = gap_amt;
    }

    @ElVoField(physicalName = "depst_ymd")
    public String getDepst_ymd(){
        return depst_ymd;
    }

    @ElVoField(physicalName = "depst_ymd")
    public void setDepst_ymd(String depst_ymd){
        this.depst_ymd = depst_ymd;
    }

    @ElVoField(physicalName = "depst_amt")
    public long getDepst_amt(){
        return depst_amt;
    }

    @ElVoField(physicalName = "depst_amt")
    public void setDepst_amt(long depst_amt){
        this.depst_amt = depst_amt;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public String getCmpy_post_no(){
        return cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public void setCmpy_post_no(String cmpy_post_no){
        this.cmpy_post_no = cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "objct_clsf_nm")
    public String getObjct_clsf_nm(){
        return objct_clsf_nm;
    }

    @ElVoField(physicalName = "objct_clsf_nm")
    public void setObjct_clsf_nm(String objct_clsf_nm){
        this.objct_clsf_nm = objct_clsf_nm;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public String getContrct_ymd(){
        return contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public void setContrct_ymd(String contrct_ymd){
        this.contrct_ymd = contrct_ymd;
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
        sb.append("SptTltDepstInfoVo [");
        sb.append("depst_mngmt_no").append("=").append(depst_mngmt_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("depst_state").append("=").append(depst_state).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("dispatch_term").append("=").append(dispatch_term).append(",");
        sb.append("posi_an").append("=").append(posi_an).append(",");
        sb.append("depst_clsf_nm").append("=").append(depst_clsf_nm).append(",");
        sb.append("depst_schdl_amt").append("=").append(depst_schdl_amt).append(",");
        sb.append("depst_schdl_ymd").append("=").append(depst_schdl_ymd).append(",");
        sb.append("real_amt").append("=").append(real_amt).append(",");
        sb.append("gap_amt").append("=").append(gap_amt).append(",");
        sb.append("depst_ymd").append("=").append(depst_ymd).append(",");
        sb.append("depst_amt").append("=").append(depst_amt).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("cmpy_post_no").append("=").append(cmpy_post_no).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("objct_clsf_nm").append("=").append(objct_clsf_nm).append(",");
        sb.append("contrct_ymd").append("=").append(contrct_ymd).append(",");
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
