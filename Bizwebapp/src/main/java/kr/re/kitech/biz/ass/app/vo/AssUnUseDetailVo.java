package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "AssUnUseDetailExp")
public class AssUnUseDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssUnUseDetailVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "ntisRegNo", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "modelNm", physicalName = "model_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String model_nm;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "upDeptNm", physicalName = "up_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String up_dept_nm;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posiRegion", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;

    @ElDtoField(logicalName = "posiBuild", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;

    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;

    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;

    @ElDtoField(logicalName = "asetStateClsf", physicalName = "aset_state_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state_clsf;

    @ElDtoField(logicalName = "asetStateNm", physicalName = "aset_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state_nm;

    @ElDtoField(logicalName = "reUsePossbl", physicalName = "re_use_possbl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_use_possbl;

    @ElDtoField(logicalName = "repayAftrEconoValue", physicalName = "repay_aftr_econo_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_aftr_econo_value;

    @ElDtoField(logicalName = "unuseClsf", physicalName = "unuse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_clsf;

    @ElDtoField(logicalName = "unuseClsfNm", physicalName = "unuse_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_clsf_nm;

    @ElDtoField(logicalName = "asetUse", physicalName = "aset_use", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_use;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "mngmtState", physicalName = "mngmt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_state;

    @ElDtoField(logicalName = "asetFileNo", physicalName = "aset_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_file_no;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "model_nm")
    public String getModel_nm(){
        return model_nm;
    }

    @ElVoField(physicalName = "model_nm")
    public void setModel_nm(String model_nm){
        this.model_nm = model_nm;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
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

    @ElVoField(physicalName = "up_dept_nm")
    public String getUp_dept_nm(){
        return up_dept_nm;
    }

    @ElVoField(physicalName = "up_dept_nm")
    public void setUp_dept_nm(String up_dept_nm){
        this.up_dept_nm = up_dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @ElVoField(physicalName = "aset_state_clsf")
    public String getAset_state_clsf(){
        return aset_state_clsf;
    }

    @ElVoField(physicalName = "aset_state_clsf")
    public void setAset_state_clsf(String aset_state_clsf){
        this.aset_state_clsf = aset_state_clsf;
    }

    @ElVoField(physicalName = "aset_state_nm")
    public String getAset_state_nm(){
        return aset_state_nm;
    }

    @ElVoField(physicalName = "aset_state_nm")
    public void setAset_state_nm(String aset_state_nm){
        this.aset_state_nm = aset_state_nm;
    }

    @ElVoField(physicalName = "re_use_possbl")
    public String getRe_use_possbl(){
        return re_use_possbl;
    }

    @ElVoField(physicalName = "re_use_possbl")
    public void setRe_use_possbl(String re_use_possbl){
        this.re_use_possbl = re_use_possbl;
    }

    @ElVoField(physicalName = "repay_aftr_econo_value")
    public String getRepay_aftr_econo_value(){
        return repay_aftr_econo_value;
    }

    @ElVoField(physicalName = "repay_aftr_econo_value")
    public void setRepay_aftr_econo_value(String repay_aftr_econo_value){
        this.repay_aftr_econo_value = repay_aftr_econo_value;
    }

    @ElVoField(physicalName = "unuse_clsf")
    public String getUnuse_clsf(){
        return unuse_clsf;
    }

    @ElVoField(physicalName = "unuse_clsf")
    public void setUnuse_clsf(String unuse_clsf){
        this.unuse_clsf = unuse_clsf;
    }

    @ElVoField(physicalName = "unuse_clsf_nm")
    public String getUnuse_clsf_nm(){
        return unuse_clsf_nm;
    }

    @ElVoField(physicalName = "unuse_clsf_nm")
    public void setUnuse_clsf_nm(String unuse_clsf_nm){
        this.unuse_clsf_nm = unuse_clsf_nm;
    }

    @ElVoField(physicalName = "aset_use")
    public String getAset_use(){
        return aset_use;
    }

    @ElVoField(physicalName = "aset_use")
    public void setAset_use(String aset_use){
        this.aset_use = aset_use;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "mngmt_state")
    public String getMngmt_state(){
        return mngmt_state;
    }

    @ElVoField(physicalName = "mngmt_state")
    public void setMngmt_state(String mngmt_state){
        this.mngmt_state = mngmt_state;
    }

    @ElVoField(physicalName = "aset_file_no")
    public String getAset_file_no(){
        return aset_file_no;
    }

    @ElVoField(physicalName = "aset_file_no")
    public void setAset_file_no(String aset_file_no){
        this.aset_file_no = aset_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssUnUseDetailVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("model_nm").append("=").append(model_nm).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("up_dept_nm").append("=").append(up_dept_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls).append(",");
        sb.append("aset_state_clsf").append("=").append(aset_state_clsf).append(",");
        sb.append("aset_state_nm").append("=").append(aset_state_nm).append(",");
        sb.append("re_use_possbl").append("=").append(re_use_possbl).append(",");
        sb.append("repay_aftr_econo_value").append("=").append(repay_aftr_econo_value).append(",");
        sb.append("unuse_clsf").append("=").append(unuse_clsf).append(",");
        sb.append("unuse_clsf_nm").append("=").append(unuse_clsf_nm).append(",");
        sb.append("aset_use").append("=").append(aset_use).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("mngmt_state").append("=").append(mngmt_state).append(",");
        sb.append("aset_file_no").append("=").append(aset_file_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno);
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
