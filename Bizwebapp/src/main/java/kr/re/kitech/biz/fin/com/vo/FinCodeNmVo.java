package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "코드조회 Vo")
public class FinCodeNmVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinCodeNmVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String code;

    @ElDtoField(logicalName = "코드값", physicalName = "code_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String code_nm;

    @ElDtoField(logicalName = "코드구분", physicalName = "code_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String code_clsf;

    @ElDtoField(logicalName = "서비스ID", physicalName = "serviceId", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String serviceId;

    @ElDtoField(logicalName = "개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "채권채무구분", physicalName = "bond_debt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bond_debt_clsf;

    @ElDtoField(logicalName = "관리구분", physicalName = "mngmt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_clsf;

    @ElDtoField(logicalName = "차대구분", physicalName = "base_debit_cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_debit_cr;

    @ElDtoField(logicalName = "결의유형", physicalName = "slip_typ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_typ_cd;

    @ElDtoField(logicalName = "미정산여부", physicalName = "caseby_adjst_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String caseby_adjst_ex;

    @ElVoField(physicalName = "code")
    public String getCode(){
        return code;
    }

    @ElVoField(physicalName = "code")
    public void setCode(String code){
        this.code = code;
    }

    @ElVoField(physicalName = "code_nm")
    public String getCode_nm(){
        return code_nm;
    }

    @ElVoField(physicalName = "code_nm")
    public void setCode_nm(String code_nm){
        this.code_nm = code_nm;
    }

    @ElVoField(physicalName = "code_clsf")
    public String getCode_clsf(){
        return code_clsf;
    }

    @ElVoField(physicalName = "code_clsf")
    public void setCode_clsf(String code_clsf){
        this.code_clsf = code_clsf;
    }

    @ElVoField(physicalName = "serviceId")
    public String getServiceId(){
        return serviceId;
    }

    @ElVoField(physicalName = "serviceId")
    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public String getBond_debt_clsf(){
        return bond_debt_clsf;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public void setBond_debt_clsf(String bond_debt_clsf){
        this.bond_debt_clsf = bond_debt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public String getMngmt_clsf(){
        return mngmt_clsf;
    }

    @ElVoField(physicalName = "mngmt_clsf")
    public void setMngmt_clsf(String mngmt_clsf){
        this.mngmt_clsf = mngmt_clsf;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public String getBase_debit_cr(){
        return base_debit_cr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public void setBase_debit_cr(String base_debit_cr){
        this.base_debit_cr = base_debit_cr;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public String getSlip_typ_cd(){
        return slip_typ_cd;
    }

    @ElVoField(physicalName = "slip_typ_cd")
    public void setSlip_typ_cd(String slip_typ_cd){
        this.slip_typ_cd = slip_typ_cd;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public String getCaseby_adjst_ex(){
        return caseby_adjst_ex;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public void setCaseby_adjst_ex(String caseby_adjst_ex){
        this.caseby_adjst_ex = caseby_adjst_ex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinCodeNmVo [");
        sb.append("code").append("=").append(code).append(",");
        sb.append("code_nm").append("=").append(code_nm).append(",");
        sb.append("code_clsf").append("=").append(code_clsf).append(",");
        sb.append("serviceId").append("=").append(serviceId).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("bond_debt_clsf").append("=").append(bond_debt_clsf).append(",");
        sb.append("mngmt_clsf").append("=").append(mngmt_clsf).append(",");
        sb.append("base_debit_cr").append("=").append(base_debit_cr).append(",");
        sb.append("slip_typ_cd").append("=").append(slip_typ_cd).append(",");
        sb.append("caseby_adjst_ex").append("=").append(caseby_adjst_ex);
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
