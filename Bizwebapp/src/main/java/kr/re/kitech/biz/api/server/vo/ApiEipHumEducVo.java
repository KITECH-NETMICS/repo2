package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "교육이력Vo")
public class ApiEipHumEducVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipHumEducVo(){
    }

    @ElDtoField(logicalName = "educ_clsf", physicalName = "educ_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_clsf_nm;

    @ElDtoField(logicalName = "educ_detls_nm", physicalName = "educ_detls_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_detls_nm;

    @ElDtoField(logicalName = "educ_nm", physicalName = "educ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_nm;

    @ElDtoField(logicalName = "educ_agncy", physicalName = "educ_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_agncy;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "start_ymd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "educ_time", physicalName = "educ_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_time;

    @ElDtoField(logicalName = "educ_amt", physicalName = "educ_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String educ_amt;

    @ElVoField(physicalName = "educ_clsf_nm")
    public String getEduc_clsf_nm(){
        return educ_clsf_nm;
    }

    @ElVoField(physicalName = "educ_clsf_nm")
    public void setEduc_clsf_nm(String educ_clsf_nm){
        this.educ_clsf_nm = educ_clsf_nm;
    }

    @ElVoField(physicalName = "educ_detls_nm")
    public String getEduc_detls_nm(){
        return educ_detls_nm;
    }

    @ElVoField(physicalName = "educ_detls_nm")
    public void setEduc_detls_nm(String educ_detls_nm){
        this.educ_detls_nm = educ_detls_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public String getEduc_nm(){
        return educ_nm;
    }

    @ElVoField(physicalName = "educ_nm")
    public void setEduc_nm(String educ_nm){
        this.educ_nm = educ_nm;
    }

    @ElVoField(physicalName = "educ_agncy")
    public String getEduc_agncy(){
        return educ_agncy;
    }

    @ElVoField(physicalName = "educ_agncy")
    public void setEduc_agncy(String educ_agncy){
        this.educ_agncy = educ_agncy;
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

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "educ_time")
    public String getEduc_time(){
        return educ_time;
    }

    @ElVoField(physicalName = "educ_time")
    public void setEduc_time(String educ_time){
        this.educ_time = educ_time;
    }

    @ElVoField(physicalName = "educ_amt")
    public String getEduc_amt(){
        return educ_amt;
    }

    @ElVoField(physicalName = "educ_amt")
    public void setEduc_amt(String educ_amt){
        this.educ_amt = educ_amt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipHumEducVo [");
        sb.append("educ_clsf_nm").append("=").append(educ_clsf_nm).append(",");
        sb.append("educ_detls_nm").append("=").append(educ_detls_nm).append(",");
        sb.append("educ_nm").append("=").append(educ_nm).append(",");
        sb.append("educ_agncy").append("=").append(educ_agncy).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("educ_time").append("=").append(educ_time).append(",");
        sb.append("educ_amt").append("=").append(educ_amt);
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
