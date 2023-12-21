package kr.re.kitech.biz.zam.emp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "부서 정보")
public class DeptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public DeptVo(){
    }

    @ElDtoField(logicalName = "부서번호", physicalName = "deptno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String deptno;

    @ElDtoField(logicalName = "부서명", physicalName = "dname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dname;

    @ElDtoField(logicalName = "지역", physicalName = "loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String loc;

    @ElVoField(physicalName = "deptno")
    public String getDeptno(){
        return deptno;
    }

    @ElVoField(physicalName = "deptno")
    public void setDeptno(String deptno){
        this.deptno = deptno;
    }

    @ElVoField(physicalName = "dname")
    public String getDname(){
        return dname;
    }

    @ElVoField(physicalName = "dname")
    public void setDname(String dname){
        this.dname = dname;
    }

    @ElVoField(physicalName = "loc")
    public String getLoc(){
        return loc;
    }

    @ElVoField(physicalName = "loc")
    public void setLoc(String loc){
        this.loc = loc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeptVo [");
        sb.append("deptno").append("=").append(deptno).append(",");
        sb.append("dname").append("=").append(dname).append(",");
        sb.append("loc").append("=").append(loc);
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
