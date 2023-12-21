package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FinAdjstEvidSelExp")
public class FinAdjstEvidSelVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinAdjstEvidSelVo(){
    }

    @ElDtoField(logicalName = "결의일자종료", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "결의일자시작", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "작성자사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "권한", physicalName = "roleSelectYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String roleSelectYn;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "작성일자", physicalName = "wrte_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_ymd;

    @ElDtoField(logicalName = "작성자개인번호", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_psn;

    @ElDtoField(logicalName = "작성자이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "작성부서코드", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept;

    @ElDtoField(logicalName = "작성부서이름", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "금액(차)", physicalName = "dr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dr_amt;

    @ElDtoField(logicalName = "금액(대)", physicalName = "cr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cr_amt;

    @ElDtoField(logicalName = "증빙", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "비목구분", physicalName = "expns_itm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_itm;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "서브포함여부", physicalName = "sub_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_yn;

    @ElDtoField(logicalName = "계정번호sub", physicalName = "accnt_no_itm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_itm;

    @ElDtoField(logicalName = "계정서브구분", physicalName = "accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_clsf;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "roleSelectYn")
    public String getRoleSelectYn(){
        return roleSelectYn;
    }

    @ElVoField(physicalName = "roleSelectYn")
    public void setRoleSelectYn(String roleSelectYn){
        this.roleSelectYn = roleSelectYn;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public String getWrte_ymd(){
        return wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_ymd")
    public void setWrte_ymd(String wrte_ymd){
        this.wrte_ymd = wrte_ymd;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dr_amt")
    public String getDr_amt(){
        return dr_amt;
    }

    @ElVoField(physicalName = "dr_amt")
    public void setDr_amt(String dr_amt){
        this.dr_amt = dr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public String getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(String cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "expns_itm")
    public String getExpns_itm(){
        return expns_itm;
    }

    @ElVoField(physicalName = "expns_itm")
    public void setExpns_itm(String expns_itm){
        this.expns_itm = expns_itm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "sub_yn")
    public String getSub_yn(){
        return sub_yn;
    }

    @ElVoField(physicalName = "sub_yn")
    public void setSub_yn(String sub_yn){
        this.sub_yn = sub_yn;
    }

    @ElVoField(physicalName = "accnt_no_itm")
    public String getAccnt_no_itm(){
        return accnt_no_itm;
    }

    @ElVoField(physicalName = "accnt_no_itm")
    public void setAccnt_no_itm(String accnt_no_itm){
        this.accnt_no_itm = accnt_no_itm;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public String getAccnt_clsf(){
        return accnt_clsf;
    }

    @ElVoField(physicalName = "accnt_clsf")
    public void setAccnt_clsf(String accnt_clsf){
        this.accnt_clsf = accnt_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinAdjstEvidSelVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("roleSelectYn").append("=").append(roleSelectYn).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("wrte_ymd").append("=").append(wrte_ymd).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dr_amt").append("=").append(dr_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("expns_itm").append("=").append(expns_itm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("sub_yn").append("=").append(sub_yn).append(",");
        sb.append("accnt_no_itm").append("=").append(accnt_no_itm).append(",");
        sb.append("accnt_clsf").append("=").append(accnt_clsf);
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
