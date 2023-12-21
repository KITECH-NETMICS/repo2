package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "EmpTable Vo")
public class EmpTableVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EmpTableVo(){
    }

    @ElDtoField(logicalName = "롤코드", physicalName = "rolecode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rolecode;

    @ElDtoField(logicalName = "uid", physicalName = "empcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empcode;

    @ElDtoField(logicalName = "성명", physicalName = "empname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empname;

    @ElDtoField(logicalName = "개인번호", physicalName = "empsn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empsn;

    @ElVoField(physicalName = "rolecode")
    public String getRolecode(){
        return rolecode;
    }

    @ElVoField(physicalName = "rolecode")
    public void setRolecode(String rolecode){
        this.rolecode = rolecode;
    }

    @ElVoField(physicalName = "empcode")
    public String getEmpcode(){
        return empcode;
    }

    @ElVoField(physicalName = "empcode")
    public void setEmpcode(String empcode){
        this.empcode = empcode;
    }

    @ElVoField(physicalName = "empname")
    public String getEmpname(){
        return empname;
    }

    @ElVoField(physicalName = "empname")
    public void setEmpname(String empname){
        this.empname = empname;
    }

    @ElVoField(physicalName = "empsn")
    public String getEmpsn(){
        return empsn;
    }

    @ElVoField(physicalName = "empsn")
    public void setEmpsn(String empsn){
        this.empsn = empsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmpTableVo [");
        sb.append("rolecode").append("=").append(rolecode).append(",");
        sb.append("empcode").append("=").append(empcode).append(",");
        sb.append("empname").append("=").append(empname).append(",");
        sb.append("empsn").append("=").append(empsn);
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
