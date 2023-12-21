package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서헤더VO")
public class FspSlipHVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipHVo(){
    }

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의유형", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "작성부서", physicalName = "wrte_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String wrte_dept;

    @ElDtoField(logicalName = "작성부서신설일자", physicalName = "wrte_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wrte_dept_new_ymd;

    @ElDtoField(logicalName = "작성자", physicalName = "wrte_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String wrte_psn;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String slip_ymd;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String rmk;

    @ElDtoField(logicalName = "확정여부", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String decsn_ex;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "CUD타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수(C,U,D)")
    private String cud_type;

    @ElDtoField(logicalName = "작성자 개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "작성자이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "작성부서", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "작성자전화번호", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "확정여부명", physicalName = "decsn_ex_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex_nm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "자산등록여부", physicalName = "aset_reg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_reg;

    @ElDtoField(logicalName = "자산관리자", physicalName = "aset_manager", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_manager;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "wrte_dept")
    public String getWrte_dept(){
        return wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept")
    public void setWrte_dept(String wrte_dept){
        this.wrte_dept = wrte_dept;
    }

    @ElVoField(physicalName = "wrte_dept_new_ymd")
    public String getWrte_dept_new_ymd(){
        return wrte_dept_new_ymd;
    }

    @ElVoField(physicalName = "wrte_dept_new_ymd")
    public void setWrte_dept_new_ymd(String wrte_dept_new_ymd){
        this.wrte_dept_new_ymd = wrte_dept_new_ymd;
    }

    @ElVoField(physicalName = "wrte_psn")
    public String getWrte_psn(){
        return wrte_psn;
    }

    @ElVoField(physicalName = "wrte_psn")
    public void setWrte_psn(String wrte_psn){
        this.wrte_psn = wrte_psn;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
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

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "decsn_ex_nm")
    public String getDecsn_ex_nm(){
        return decsn_ex_nm;
    }

    @ElVoField(physicalName = "decsn_ex_nm")
    public void setDecsn_ex_nm(String decsn_ex_nm){
        this.decsn_ex_nm = decsn_ex_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "aset_reg")
    public String getAset_reg(){
        return aset_reg;
    }

    @ElVoField(physicalName = "aset_reg")
    public void setAset_reg(String aset_reg){
        this.aset_reg = aset_reg;
    }

    @ElVoField(physicalName = "aset_manager")
    public String getAset_manager(){
        return aset_manager;
    }

    @ElVoField(physicalName = "aset_manager")
    public void setAset_manager(String aset_manager){
        this.aset_manager = aset_manager;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipHVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("wrte_dept").append("=").append(wrte_dept).append(",");
        sb.append("wrte_dept_new_ymd").append("=").append(wrte_dept_new_ymd).append(",");
        sb.append("wrte_psn").append("=").append(wrte_psn).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("decsn_ex_nm").append("=").append(decsn_ex_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("aset_reg").append("=").append(aset_reg).append(",");
        sb.append("aset_manager").append("=").append(aset_manager).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit);
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
