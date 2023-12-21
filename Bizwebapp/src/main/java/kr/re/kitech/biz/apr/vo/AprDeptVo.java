package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 부서 검색")
public class AprDeptVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprDeptVo(){
    }

    @ElDtoField(logicalName = "부서코드", physicalName = "partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partcode;

    @ElDtoField(logicalName = "상위부서코드", physicalName = "parent_partcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String parent_partcode;

    @ElDtoField(logicalName = "부서명", physicalName = "partname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partname;

    @ElDtoField(logicalName = "부서업무코드", physicalName = "partbizcode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partbizcode;

    @ElDtoField(logicalName = "부서지역코드", physicalName = "partlocation", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String partlocation;

    @ElDtoField(logicalName = "부서레벨", physicalName = "part_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String part_shape;

    @ElVoField(physicalName = "partcode")
    public String getPartcode(){
        String ret = this.partcode;
        return ret;
    }

    @ElVoField(physicalName = "partcode")
    public void setPartcode(String partcode){
        this.partcode = partcode;
    }

    @ElVoField(physicalName = "parent_partcode")
    public String getParent_partcode(){
        String ret = this.parent_partcode;
        return ret;
    }

    @ElVoField(physicalName = "parent_partcode")
    public void setParent_partcode(String parent_partcode){
        this.parent_partcode = parent_partcode;
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

    @ElVoField(physicalName = "partbizcode")
    public String getPartbizcode(){
        String ret = this.partbizcode;
        return ret;
    }

    @ElVoField(physicalName = "partbizcode")
    public void setPartbizcode(String partbizcode){
        this.partbizcode = partbizcode;
    }

    @ElVoField(physicalName = "partlocation")
    public String getPartlocation(){
        String ret = this.partlocation;
        return ret;
    }

    @ElVoField(physicalName = "partlocation")
    public void setPartlocation(String partlocation){
        this.partlocation = partlocation;
    }

    @ElVoField(physicalName = "part_shape")
    public String getPart_shape(){
        String ret = this.part_shape;
        return ret;
    }

    @ElVoField(physicalName = "part_shape")
    public void setPart_shape(String part_shape){
        this.part_shape = part_shape;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprDeptVo [");
        sb.append("partcode").append("=").append(partcode).append(",");
        sb.append("parent_partcode").append("=").append(parent_partcode).append(",");
        sb.append("partname").append("=").append(partname).append(",");
        sb.append("partbizcode").append("=").append(partbizcode).append(",");
        sb.append("partlocation").append("=").append(partlocation).append(",");
        sb.append("part_shape").append("=").append(part_shape);
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
