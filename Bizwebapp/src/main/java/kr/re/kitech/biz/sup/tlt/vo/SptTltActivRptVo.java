package kr.re.kitech.biz.sup.tlt.vo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltActivRptExp")
public class SptTltActivRptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTltActivRptVo(){
    }

    @ElDtoField(logicalName = "firstCnt", physicalName = "first_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String first_cnt;

    @ElDtoField(logicalName = "date", physicalName = "date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String date;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "deptCd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "year", physicalName = "year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year;

    @ElDtoField(logicalName = "month", physicalName = "month", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String month;

    @ElDtoField(logicalName = "chk", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElDtoField(logicalName = "custNo", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqDiv", physicalName = "req_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_div;

    @ElDtoField(logicalName = "reqState", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "reqStateNm", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "rptYrmon", physicalName = "rpt_yrmon", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rpt_yrmon;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "reprsPsn", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "cmpyAddr", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "posiNm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "mobile", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "chkReqNo", physicalName = "chk_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk_req_no;

    @ElDtoField(logicalName = "confirm", physicalName = "confirm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String confirm;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;
    
    @ElDtoField(logicalName = "docuClsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "visitYmd", physicalName = "visit_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String visit_ymd;
    
    @ElDtoField(logicalName = "mntSyspayno", physicalName = "mnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mnt_syspayno;
    
    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;
    
    @ElDtoField(logicalName = "attachFileNoImg", physicalName = "attach_file_no_img", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_img;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;
    
    @ElDtoField(logicalName = "성공cnt", physicalName = "succ_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_cnt;
    
    @ElDtoField(logicalName = "성공code", physicalName = "result_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result_code;
    
    @ElVoField(physicalName = "first_cnt")
    public String getFirst_cnt(){
        return first_cnt;
    }

    @ElVoField(physicalName = "first_cnt")
    public void setFirst_cnt(String first_cnt){
        this.first_cnt = first_cnt;
    }

    @ElVoField(physicalName = "date")
    public String getDate(){
        return date;
    }

    @ElVoField(physicalName = "date")
    public void setDate(String date){
        this.date = date;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "year")
    public String getYear(){
        return year;
    }

    @ElVoField(physicalName = "year")
    public void setYear(String year){
        this.year = year;
    }

    @ElVoField(physicalName = "month")
    public String getMonth(){
        return month;
    }

    @ElVoField(physicalName = "month")
    public void setMonth(String month){
        this.month = month;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_div")
    public String getReq_div(){
        return req_div;
    }

    @ElVoField(physicalName = "req_div")
    public void setReq_div(String req_div){
        this.req_div = req_div;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "rpt_yrmon")
    public String getRpt_yrmon(){
        return rpt_yrmon;
    }

    @ElVoField(physicalName = "rpt_yrmon")
    public void setRpt_yrmon(String rpt_yrmon){
        this.rpt_yrmon = rpt_yrmon;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
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

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "chk_req_no")
    public String getChk_req_no(){
        return chk_req_no;
    }

    @ElVoField(physicalName = "chk_req_no")
    public void setChk_req_no(String chk_req_no){
        this.chk_req_no = chk_req_no;
    }

    @ElVoField(physicalName = "confirm")
    public String getConfirm(){
        return confirm;
    }

    @ElVoField(physicalName = "confirm")
    public void setConfirm(String confirm){
        this.confirm = confirm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
    	return docu_clsf;
    }
    
    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
    	this.docu_clsf = docu_clsf;
    }
  
    @ElVoField(physicalName = "visit_ymd")
    public String getVisit_ymd(){
        return visit_ymd;
    }
  
    @ElVoField(physicalName = "visit_ymd")
    public void setVisit_ymd(String visit_ymd){
        this.visit_ymd = visit_ymd;
    }
  
    @ElVoField(physicalName = "mnt_syspayno")
    public String getMnt_syspayno(){
        return mnt_syspayno;
    }
  
    @ElVoField(physicalName = "mnt_syspayno")
    public void setMnt_syspayno(String mnt_syspayno){
        this.mnt_syspayno = mnt_syspayno;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }
    
    @ElVoField(physicalName = "attach_file_no_img")
    public String getAttach_file_no_img(){
    	return attach_file_no_img;
    }
    
    @ElVoField(physicalName = "attach_file_no_img")
    public void setAttach_file_no_img(String attach_file_no_img){
    	this.attach_file_no_img = attach_file_no_img;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }
    
    @ElVoField(physicalName = "succ_cnt")
	public String getSucc_cnt() {
		return succ_cnt;
	}

    @ElVoField(physicalName = "succ_cnt")
	public void setSucc_cnt(String succ_cnt) {
		this.succ_cnt = succ_cnt;
	}

    @ElVoField(physicalName = "result_code")
	public String getResult_code() {
		return result_code;
	}

    @ElVoField(physicalName = "result_code")
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTltActivRptVo [");
        sb.append("first_cnt").append("=").append(first_cnt).append(",");
        sb.append("date").append("=").append(date).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("year").append("=").append(year).append(",");
        sb.append("month").append("=").append(month).append(",");
        sb.append("chk").append("=").append(chk).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_div").append("=").append(req_div).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("rpt_yrmon").append("=").append(rpt_yrmon).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("chk_req_no").append("=").append(chk_req_no).append(",");
        sb.append("confirm").append("=").append(confirm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("visit_ymd").append("=").append(visit_ymd).append(",");
        sb.append("mnt_syspayno").append("=").append(mnt_syspayno).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("attach_file_no_img").append("=").append(attach_file_no_img).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("succ_cnt").append("=").append(succ_cnt).append(",");
        sb.append("result_code").append("=").append(result_code);
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
