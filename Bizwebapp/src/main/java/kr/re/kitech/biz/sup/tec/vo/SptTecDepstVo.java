package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원입금의뢰목록 Vo")
public class SptTecDepstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecDepstVo(){
    }

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "고객 번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "기술지원 요청 번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "기술지원담당자 시스템번호", physicalName = "rcpt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_syspayno;

    @ElDtoField(logicalName = "기술지원담당자 개인번호", physicalName = "rcpt_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno;

    @ElDtoField(logicalName = "기술지원담당자 성명", physicalName = "rcpt_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_nm;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_work_clsf;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과세구분코드", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "계정 책임자 시스템 개인 번호", physicalName = "accnt_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_psn;

    @ElDtoField(logicalName = "계정 책임자 개인번호", physicalName = "accnt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_empno;

    @ElDtoField(logicalName = "계정 책임자 이름", physicalName = "accnt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_respn_nm;

    @ElDtoField(logicalName = "지원책임자 시스템번호", physicalName = "supt_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_syspayno;

    @ElDtoField(logicalName = "지원책임자성명", physicalName = "supt_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_nm;

    @ElDtoField(logicalName = "지원책임자 개인번호", physicalName = "supt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_empno;

    @ElDtoField(logicalName = "지원 팀", physicalName = "supt_team", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team;

    @ElDtoField(logicalName = "지원금액 ", physicalName = "req_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_amt;

    @ElDtoField(logicalName = "확정 금액", physicalName = "decsn_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_amt;

    @ElDtoField(logicalName = "확정  공급가액", physicalName = "decsn_suply_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_suply_value;

    @ElDtoField(logicalName = "확정 세액", physicalName = "decsn_tax_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_tax_amt;

    @ElDtoField(logicalName = "계산서 번호", physicalName = "bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_no;

    @ElDtoField(logicalName = "계산서 발행 일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "청구영수구분", physicalName = "demnd_recv_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "가결의서 생성 일자", physicalName = "unslip_wrte_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_wrte_ymd;

    @ElDtoField(logicalName = "입금 의뢰 번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "입금계좌번호", physicalName = "depst_bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_bankaccnt_no;

    @ElDtoField(logicalName = "성적서발행분류", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "고객명", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "계산서에러코드", physicalName = "err_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String err_cd;

    @ElDtoField(logicalName = "계산서상태코드", physicalName = "stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stat_code;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public String getRcpt_psn_syspayno(){
        return rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn_syspayno")
    public void setRcpt_psn_syspayno(String rcpt_psn_syspayno){
        this.rcpt_psn_syspayno = rcpt_psn_syspayno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public String getRcpt_psn_empno(){
        return rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public void setRcpt_psn_empno(String rcpt_psn_empno){
        this.rcpt_psn_empno = rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public String getRcpt_psn_nm(){
        return rcpt_psn_nm;
    }

    @ElVoField(physicalName = "rcpt_psn_nm")
    public void setRcpt_psn_nm(String rcpt_psn_nm){
        this.rcpt_psn_nm = rcpt_psn_nm;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public String getSupt_work_clsf(){
        return supt_work_clsf;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public void setSupt_work_clsf(String supt_work_clsf){
        this.supt_work_clsf = supt_work_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "accnt_respn_psn")
    public String getAccnt_respn_psn(){
        return accnt_respn_psn;
    }

    @ElVoField(physicalName = "accnt_respn_psn")
    public void setAccnt_respn_psn(String accnt_respn_psn){
        this.accnt_respn_psn = accnt_respn_psn;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public String getAccnt_respn_empno(){
        return accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_empno")
    public void setAccnt_respn_empno(String accnt_respn_empno){
        this.accnt_respn_empno = accnt_respn_empno;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public String getAccnt_respn_nm(){
        return accnt_respn_nm;
    }

    @ElVoField(physicalName = "accnt_respn_nm")
    public void setAccnt_respn_nm(String accnt_respn_nm){
        this.accnt_respn_nm = accnt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public String getSupt_respn_syspayno(){
        return supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_syspayno")
    public void setSupt_respn_syspayno(String supt_respn_syspayno){
        this.supt_respn_syspayno = supt_respn_syspayno;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public String getSupt_respn_nm(){
        return supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_nm")
    public void setSupt_respn_nm(String supt_respn_nm){
        this.supt_respn_nm = supt_respn_nm;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public String getSupt_respn_empno(){
        return supt_respn_empno;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public void setSupt_respn_empno(String supt_respn_empno){
        this.supt_respn_empno = supt_respn_empno;
    }

    @ElVoField(physicalName = "supt_team")
    public String getSupt_team(){
        return supt_team;
    }

    @ElVoField(physicalName = "supt_team")
    public void setSupt_team(String supt_team){
        this.supt_team = supt_team;
    }

    @ElVoField(physicalName = "req_amt")
    public String getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(String req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public String getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(String decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public String getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(String decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public String getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(String decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @ElVoField(physicalName = "bill_no")
    public String getBill_no(){
        return bill_no;
    }

    @ElVoField(physicalName = "bill_no")
    public void setBill_no(String bill_no){
        this.bill_no = bill_no;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public String getDemnd_recv_clsf(){
        return demnd_recv_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public void setDemnd_recv_clsf(String demnd_recv_clsf){
        this.demnd_recv_clsf = demnd_recv_clsf;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_wrte_ymd")
    public String getUnslip_wrte_ymd(){
        return unslip_wrte_ymd;
    }

    @ElVoField(physicalName = "unslip_wrte_ymd")
    public void setUnslip_wrte_ymd(String unslip_wrte_ymd){
        this.unslip_wrte_ymd = unslip_wrte_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public String getDepst_bankaccnt_no(){
        return depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "depst_bankaccnt_no")
    public void setDepst_bankaccnt_no(String depst_bankaccnt_no){
        this.depst_bankaccnt_no = depst_bankaccnt_no;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "err_cd")
    public String getErr_cd(){
        return err_cd;
    }

    @ElVoField(physicalName = "err_cd")
    public void setErr_cd(String err_cd){
        this.err_cd = err_cd;
    }

    @ElVoField(physicalName = "stat_code")
    public String getStat_code(){
        return stat_code;
    }

    @ElVoField(physicalName = "stat_code")
    public void setStat_code(String stat_code){
        this.stat_code = stat_code;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecDepstVo [");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("rcpt_psn_syspayno").append("=").append(rcpt_psn_syspayno).append(",");
        sb.append("rcpt_psn_empno").append("=").append(rcpt_psn_empno).append(",");
        sb.append("rcpt_psn_nm").append("=").append(rcpt_psn_nm).append(",");
        sb.append("supt_work_clsf").append("=").append(supt_work_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("accnt_respn_psn").append("=").append(accnt_respn_psn).append(",");
        sb.append("accnt_respn_empno").append("=").append(accnt_respn_empno).append(",");
        sb.append("accnt_respn_nm").append("=").append(accnt_respn_nm).append(",");
        sb.append("supt_respn_syspayno").append("=").append(supt_respn_syspayno).append(",");
        sb.append("supt_respn_nm").append("=").append(supt_respn_nm).append(",");
        sb.append("supt_respn_empno").append("=").append(supt_respn_empno).append(",");
        sb.append("supt_team").append("=").append(supt_team).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt).append(",");
        sb.append("bill_no").append("=").append(bill_no).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("demnd_recv_clsf").append("=").append(demnd_recv_clsf).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_wrte_ymd").append("=").append(unslip_wrte_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("depst_bankaccnt_no").append("=").append(depst_bankaccnt_no).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("err_cd").append("=").append(err_cd).append(",");
        sb.append("stat_code").append("=").append(stat_code).append(",");
        sb.append("prcs_state").append("=").append(prcs_state);
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
