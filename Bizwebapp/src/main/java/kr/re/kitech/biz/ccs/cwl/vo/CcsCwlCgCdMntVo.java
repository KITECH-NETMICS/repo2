package kr.re.kitech.biz.ccs.cwl.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "경조사비 수정 시 조회")
public class CcsCwlCgCdMntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CcsCwlCgCdMntVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "가족관계 구분", physicalName = "fam_relat", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fam_relat;

    @ElDtoField(logicalName = "경조사 구분", physicalName = "cgncd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_clsf;

    @ElDtoField(logicalName = "지급일자", physicalName = "pay_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_ymd;

    @ElDtoField(logicalName = "지출금액", physicalName = "expns_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_amt;

    @ElDtoField(logicalName = "지급금액", physicalName = "pay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_amt;

    @ElDtoField(logicalName = "경조내역", physicalName = "cgncd_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cgncd_detls;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "fam_relat")
    public String getFam_relat(){
        return fam_relat;
    }

    @ElVoField(physicalName = "fam_relat")
    public void setFam_relat(String fam_relat){
        this.fam_relat = fam_relat;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public String getCgncd_clsf(){
        return cgncd_clsf;
    }

    @ElVoField(physicalName = "cgncd_clsf")
    public void setCgncd_clsf(String cgncd_clsf){
        this.cgncd_clsf = cgncd_clsf;
    }

    @ElVoField(physicalName = "pay_ymd")
    public String getPay_ymd(){
        return pay_ymd;
    }

    @ElVoField(physicalName = "pay_ymd")
    public void setPay_ymd(String pay_ymd){
        this.pay_ymd = pay_ymd;
    }

    @ElVoField(physicalName = "expns_amt")
    public String getExpns_amt(){
        return expns_amt;
    }

    @ElVoField(physicalName = "expns_amt")
    public void setExpns_amt(String expns_amt){
        this.expns_amt = expns_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public String getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(String pay_amt){
        this.pay_amt = pay_amt;
    }

    @ElVoField(physicalName = "cgncd_detls")
    public String getCgncd_detls(){
        return cgncd_detls;
    }

    @ElVoField(physicalName = "cgncd_detls")
    public void setCgncd_detls(String cgncd_detls){
        this.cgncd_detls = cgncd_detls;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CcsCwlCgCdMntVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("fam_relat").append("=").append(fam_relat).append(",");
        sb.append("cgncd_clsf").append("=").append(cgncd_clsf).append(",");
        sb.append("pay_ymd").append("=").append(pay_ymd).append(",");
        sb.append("expns_amt").append("=").append(expns_amt).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("cgncd_detls").append("=").append(cgncd_detls).append(",");
        sb.append("rmk").append("=").append(rmk);
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
