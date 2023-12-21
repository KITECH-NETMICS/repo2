package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "(결재)출장 항공마일리지  Vo")
public class CtrAirMileUseAprVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrAirMileUseAprVo(){
    }

    @ElDtoField(logicalName = "마일리지신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "적립마일리지", physicalName = "pub_new_mile", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int pub_new_mile;

    @ElDtoField(logicalName = "신고서 파일", physicalName = "attach_file_no_req", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_req;

    @ElDtoField(logicalName = "항공사", physicalName = "air_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String air_nm;

    @ElDtoField(logicalName = "성명", physicalName = "emp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public int getPub_new_mile(){
        return pub_new_mile;
    }

    @ElVoField(physicalName = "pub_new_mile")
    public void setPub_new_mile(int pub_new_mile){
        this.pub_new_mile = pub_new_mile;
    }

    @ElVoField(physicalName = "attach_file_no_req")
    public String getAttach_file_no_req(){
        return attach_file_no_req;
    }

    @ElVoField(physicalName = "attach_file_no_req")
    public void setAttach_file_no_req(String attach_file_no_req){
        this.attach_file_no_req = attach_file_no_req;
    }

    @ElVoField(physicalName = "air_nm")
    public String getAir_nm(){
        return air_nm;
    }

    @ElVoField(physicalName = "air_nm")
    public void setAir_nm(String air_nm){
        this.air_nm = air_nm;
    }

    @ElVoField(physicalName = "emp_nm")
    public String getEmp_nm(){
        return emp_nm;
    }

    @ElVoField(physicalName = "emp_nm")
    public void setEmp_nm(String emp_nm){
        this.emp_nm = emp_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrAirMileUseAprVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("pub_new_mile").append("=").append(pub_new_mile).append(",");
        sb.append("attach_file_no_req").append("=").append(attach_file_no_req).append(",");
        sb.append("air_nm").append("=").append(air_nm).append(",");
        sb.append("emp_nm").append("=").append(emp_nm).append(",");
        sb.append("empno").append("=").append(empno);
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
