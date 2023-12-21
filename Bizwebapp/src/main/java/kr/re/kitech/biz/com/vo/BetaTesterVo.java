package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "베타테스터")
public class BetaTesterVo extends kr.re.kitech.biz.xom.core.vo.ServiceVo {
    private static final long serialVersionUID = 1L;

    public BetaTesterVo(){
    }

    @ElDtoField(logicalName = "사번", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "시작일", physicalName = "start_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_date;

    @ElDtoField(logicalName = "종료일", physicalName = "close_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String close_date;

    @ElDtoField(logicalName = "입력구분", physicalName = "cud_mode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_mode;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "성명(조회용)", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "개인번호(조회용)", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "문서번호(검색용)", physicalName = "alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String alias;

    @ElDtoField(logicalName = "xslurl", physicalName = "xslurl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String xslurl;

    @ElDtoField(logicalName = "xslurl_ready", physicalName = "xslurl_ready", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String xslurl_ready;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "start_date")
    public String getStart_date(){
        return start_date;
    }

    @ElVoField(physicalName = "start_date")
    public void setStart_date(String start_date){
        this.start_date = start_date;
    }

    @ElVoField(physicalName = "close_date")
    public String getClose_date(){
        return close_date;
    }

    @ElVoField(physicalName = "close_date")
    public void setClose_date(String close_date){
        this.close_date = close_date;
    }

    @ElVoField(physicalName = "cud_mode")
    public String getCud_mode(){
        return cud_mode;
    }

    @ElVoField(physicalName = "cud_mode")
    public void setCud_mode(String cud_mode){
        this.cud_mode = cud_mode;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "alias")
    public String getAlias(){
        return alias;
    }

    @ElVoField(physicalName = "alias")
    public void setAlias(String alias){
        this.alias = alias;
    }

    @ElVoField(physicalName = "xslurl")
    public String getXslurl(){
        return xslurl;
    }

    @ElVoField(physicalName = "xslurl")
    public void setXslurl(String xslurl){
        this.xslurl = xslurl;
    }

    @ElVoField(physicalName = "xslurl_ready")
    public String getXslurl_ready(){
        return xslurl_ready;
    }

    @ElVoField(physicalName = "xslurl_ready")
    public void setXslurl_ready(String xslurl_ready){
        this.xslurl_ready = xslurl_ready;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BetaTesterVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("start_date").append("=").append(start_date).append(",");
        sb.append("close_date").append("=").append(close_date).append(",");
        sb.append("cud_mode").append("=").append(cud_mode).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("alias").append("=").append(alias).append(",");
        sb.append("xslurl").append("=").append(xslurl).append(",");
        sb.append("xslurl_ready").append("=").append(xslurl_ready);
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
