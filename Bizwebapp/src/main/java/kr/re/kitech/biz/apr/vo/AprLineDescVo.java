package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재선 세팅 상세")
public class AprLineDescVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprLineDescVo(){
    }

    @ElDtoField(logicalName = "결재상세번호", physicalName = "apld_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_id;

    @ElDtoField(logicalName = "결재선번호", physicalName = "apld_aplid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_aplid;

    @ElDtoField(logicalName = "결제아이디", physicalName = "apld_endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_endpoint;

    @ElDtoField(logicalName = "타입", physicalName = "apld_apltype", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_apltype;

    @ElDtoField(logicalName = "순번", physicalName = "apld_order", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apld_order;

    @ElDtoField(logicalName = "이름", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empname;

    @ElDtoField(logicalName = "직책", physicalName = "jikname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String jikname;

    @ElDtoField(logicalName = "부서코드", physicalName = "partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partcode;

    @ElDtoField(logicalName = "부서명", physicalName = "partname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partname;

    @ElVoField(physicalName = "apld_id")
    public String getApld_id(){
        String ret = this.apld_id;
        return ret;
    }

    @ElVoField(physicalName = "apld_id")
    public void setApld_id(String apld_id){
        this.apld_id = apld_id;
    }

    @ElVoField(physicalName = "apld_aplid")
    public String getApld_aplid(){
        String ret = this.apld_aplid;
        return ret;
    }

    @ElVoField(physicalName = "apld_aplid")
    public void setApld_aplid(String apld_aplid){
        this.apld_aplid = apld_aplid;
    }

    @ElVoField(physicalName = "apld_endpoint")
    public String getApld_endpoint(){
        String ret = this.apld_endpoint;
        return ret;
    }

    @ElVoField(physicalName = "apld_endpoint")
    public void setApld_endpoint(String apld_endpoint){
        this.apld_endpoint = apld_endpoint;
    }

    @ElVoField(physicalName = "apld_apltype")
    public String getApld_apltype(){
        String ret = this.apld_apltype;
        return ret;
    }

    @ElVoField(physicalName = "apld_apltype")
    public void setApld_apltype(String apld_apltype){
        this.apld_apltype = apld_apltype;
    }

    @ElVoField(physicalName = "apld_order")
    public String getApld_order(){
        String ret = this.apld_order;
        return ret;
    }

    @ElVoField(physicalName = "apld_order")
    public void setApld_order(String apld_order){
        this.apld_order = apld_order;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        String ret = this.empname;
        return ret;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "jikname")
    public String getJikname(){
        String ret = this.jikname;
        return ret;
    }

    @ElVoField(physicalName = "jikname")
    public void setJikname(String jikname){
        this.jikname = jikname;
    }

    @ElVoField(physicalName = "partcode")
    public String getPartcode(){
        String ret = this.partcode;
        return ret;
    }

    @ElVoField(physicalName = "partcode")
    public void setPartcode(String partcode){
        this.partcode = partcode;
    }

    @ElVoField(physicalName = "partname")
    public String getPartname(){
        String ret = this.partname;
        return ret;
    }

    @ElVoField(physicalName = "partname")
    public void setPartname(String partname){
        this.partname = partname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprLineDescVo [");
        sb.append("apld_id").append("=").append(apld_id).append(",");
        sb.append("apld_aplid").append("=").append(apld_aplid).append(",");
        sb.append("apld_endpoint").append("=").append(apld_endpoint).append(",");
        sb.append("apld_apltype").append("=").append(apld_apltype).append(",");
        sb.append("apld_order").append("=").append(apld_order).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("jikname").append("=").append(jikname).append(",");
        sb.append("partcode").append("=").append(partcode).append(",");
        sb.append("partname").append("=").append(partname);
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
