package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResOutCtrbtEvalVo")
public class ResOutCtrbtEvalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResOutCtrbtEvalVo(){
    }

    @ElDtoField(logicalName = "from_ymd", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "to_ymd", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "req_syspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "req_empno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "req_nm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "contb_syspayno", physicalName = "contb_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contb_syspayno;

    @ElDtoField(logicalName = "rcpt_syspayno", physicalName = "rcpt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_syspayno;

    @ElDtoField(logicalName = "aply_yn", physicalName = "aply_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aply_yn;

    @ElDtoField(logicalName = "division_typ", physicalName = "division_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String division_typ;

    @ElDtoField(logicalName = "division_cd", physicalName = "division_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String division_cd;

    @ElDtoField(logicalName = "division_nm", physicalName = "division_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String division_nm;

    @ElDtoField(logicalName = "division_new_ymd", physicalName = "division_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String division_new_ymd;

    @ElDtoField(logicalName = "dept_typ", physicalName = "dept_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_typ;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "ind_clsf", physicalName = "ind_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ind_clsf;

    @ElDtoField(logicalName = "rate_nm", physicalName = "rate_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_nm;

    @ElDtoField(logicalName = "rate_empno", physicalName = "rate_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_empno;

    @ElDtoField(logicalName = "rate_syspayno", physicalName = "rate_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_syspayno;

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

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "contb_syspayno")
    public String getContb_syspayno(){
        return contb_syspayno;
    }

    @ElVoField(physicalName = "contb_syspayno")
    public void setContb_syspayno(String contb_syspayno){
        this.contb_syspayno = contb_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public String getRcpt_syspayno(){
        return rcpt_syspayno;
    }

    @ElVoField(physicalName = "rcpt_syspayno")
    public void setRcpt_syspayno(String rcpt_syspayno){
        this.rcpt_syspayno = rcpt_syspayno;
    }

    @ElVoField(physicalName = "aply_yn")
    public String getAply_yn(){
        return aply_yn;
    }

    @ElVoField(physicalName = "aply_yn")
    public void setAply_yn(String aply_yn){
        this.aply_yn = aply_yn;
    }

    @ElVoField(physicalName = "division_typ")
    public String getDivision_typ(){
        return division_typ;
    }

    @ElVoField(physicalName = "division_typ")
    public void setDivision_typ(String division_typ){
        this.division_typ = division_typ;
    }

    @ElVoField(physicalName = "division_cd")
    public String getDivision_cd(){
        return division_cd;
    }

    @ElVoField(physicalName = "division_cd")
    public void setDivision_cd(String division_cd){
        this.division_cd = division_cd;
    }

    @ElVoField(physicalName = "division_nm")
    public String getDivision_nm(){
        return division_nm;
    }

    @ElVoField(physicalName = "division_nm")
    public void setDivision_nm(String division_nm){
        this.division_nm = division_nm;
    }

    @ElVoField(physicalName = "division_new_ymd")
    public String getDivision_new_ymd(){
        return division_new_ymd;
    }

    @ElVoField(physicalName = "division_new_ymd")
    public void setDivision_new_ymd(String division_new_ymd){
        this.division_new_ymd = division_new_ymd;
    }

    @ElVoField(physicalName = "dept_typ")
    public String getDept_typ(){
        return dept_typ;
    }

    @ElVoField(physicalName = "dept_typ")
    public void setDept_typ(String dept_typ){
        this.dept_typ = dept_typ;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "ind_clsf")
    public String getInd_clsf(){
        return ind_clsf;
    }

    @ElVoField(physicalName = "ind_clsf")
    public void setInd_clsf(String ind_clsf){
        this.ind_clsf = ind_clsf;
    }

    @ElVoField(physicalName = "rate_nm")
    public String getRate_nm(){
        return rate_nm;
    }

    @ElVoField(physicalName = "rate_nm")
    public void setRate_nm(String rate_nm){
        this.rate_nm = rate_nm;
    }

    @ElVoField(physicalName = "rate_empno")
    public String getRate_empno(){
        return rate_empno;
    }

    @ElVoField(physicalName = "rate_empno")
    public void setRate_empno(String rate_empno){
        this.rate_empno = rate_empno;
    }

    @ElVoField(physicalName = "rate_syspayno")
    public String getRate_syspayno(){
        return rate_syspayno;
    }

    @ElVoField(physicalName = "rate_syspayno")
    public void setRate_syspayno(String rate_syspayno){
        this.rate_syspayno = rate_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResOutCtrbtEvalVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("contb_syspayno").append("=").append(contb_syspayno).append(",");
        sb.append("rcpt_syspayno").append("=").append(rcpt_syspayno).append(",");
        sb.append("aply_yn").append("=").append(aply_yn).append(",");
        sb.append("division_typ").append("=").append(division_typ).append(",");
        sb.append("division_cd").append("=").append(division_cd).append(",");
        sb.append("division_nm").append("=").append(division_nm).append(",");
        sb.append("division_new_ymd").append("=").append(division_new_ymd).append(",");
        sb.append("dept_typ").append("=").append(dept_typ).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("ind_clsf").append("=").append(ind_clsf).append(",");
        sb.append("rate_nm").append("=").append(rate_nm).append(",");
        sb.append("rate_empno").append("=").append(rate_empno).append(",");
        sb.append("rate_syspayno").append("=").append(rate_syspayno);
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
