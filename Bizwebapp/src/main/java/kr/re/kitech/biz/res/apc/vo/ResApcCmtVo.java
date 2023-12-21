package kr.re.kitech.biz.res.apc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 선정평가 위원회 Vo")
public class ResApcCmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResApcCmtVo(){
    }

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "위원회번호", physicalName = "cmitt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_no;

    @ElDtoField(logicalName = "위원회구분", physicalName = "cmitt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_clsf;

    @ElDtoField(logicalName = "위원회구분명", physicalName = "cmitt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_clsf_nm;

    @ElDtoField(logicalName = "위원회명", physicalName = "cmitt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmitt_nm;

    @ElDtoField(logicalName = "상태구분", physicalName = "state_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_clsf;

    @ElDtoField(logicalName = "위원회내외구분", physicalName = "inout_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_clsf;

    @ElDtoField(logicalName = "위원번호", physicalName = "mber_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mber_no;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "membr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String membr_nm;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "소속", physicalName = "blong", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "개최일자", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "cmitt_no")
    public String getCmitt_no(){
        return cmitt_no;
    }

    @ElVoField(physicalName = "cmitt_no")
    public void setCmitt_no(String cmitt_no){
        this.cmitt_no = cmitt_no;
    }

    @ElVoField(physicalName = "cmitt_clsf")
    public String getCmitt_clsf(){
        return cmitt_clsf;
    }

    @ElVoField(physicalName = "cmitt_clsf")
    public void setCmitt_clsf(String cmitt_clsf){
        this.cmitt_clsf = cmitt_clsf;
    }

    @ElVoField(physicalName = "cmitt_clsf_nm")
    public String getCmitt_clsf_nm(){
        return cmitt_clsf_nm;
    }

    @ElVoField(physicalName = "cmitt_clsf_nm")
    public void setCmitt_clsf_nm(String cmitt_clsf_nm){
        this.cmitt_clsf_nm = cmitt_clsf_nm;
    }

    @ElVoField(physicalName = "cmitt_nm")
    public String getCmitt_nm(){
        return cmitt_nm;
    }

    @ElVoField(physicalName = "cmitt_nm")
    public void setCmitt_nm(String cmitt_nm){
        this.cmitt_nm = cmitt_nm;
    }

    @ElVoField(physicalName = "state_clsf")
    public String getState_clsf(){
        return state_clsf;
    }

    @ElVoField(physicalName = "state_clsf")
    public void setState_clsf(String state_clsf){
        this.state_clsf = state_clsf;
    }

    @ElVoField(physicalName = "inout_clsf")
    public String getInout_clsf(){
        return inout_clsf;
    }

    @ElVoField(physicalName = "inout_clsf")
    public void setInout_clsf(String inout_clsf){
        this.inout_clsf = inout_clsf;
    }

    @ElVoField(physicalName = "mber_no")
    public String getMber_no(){
        return mber_no;
    }

    @ElVoField(physicalName = "mber_no")
    public void setMber_no(String mber_no){
        this.mber_no = mber_no;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "membr_nm")
    public String getMembr_nm(){
        return membr_nm;
    }

    @ElVoField(physicalName = "membr_nm")
    public void setMembr_nm(String membr_nm){
        this.membr_nm = membr_nm;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "blong")
    public String getBlong(){
        return blong;
    }

    @ElVoField(physicalName = "blong")
    public void setBlong(String blong){
        this.blong = blong;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "open_ymd")
    public String getOpen_ymd(){
        return open_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public void setOpen_ymd(String open_ymd){
        this.open_ymd = open_ymd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResApcCmtVo [");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("cmitt_no").append("=").append(cmitt_no).append(",");
        sb.append("cmitt_clsf").append("=").append(cmitt_clsf).append(",");
        sb.append("cmitt_clsf_nm").append("=").append(cmitt_clsf_nm).append(",");
        sb.append("cmitt_nm").append("=").append(cmitt_nm).append(",");
        sb.append("state_clsf").append("=").append(state_clsf).append(",");
        sb.append("inout_clsf").append("=").append(inout_clsf).append(",");
        sb.append("mber_no").append("=").append(mber_no).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("membr_nm").append("=").append(membr_nm).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("blong").append("=").append(blong).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
