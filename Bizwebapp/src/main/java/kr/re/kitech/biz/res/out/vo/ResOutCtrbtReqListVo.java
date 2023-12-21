package kr.re.kitech.biz.res.out.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "ResOutCtrbtReqListVo")
public class ResOutCtrbtReqListVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResOutCtrbtReqListVo(){
    }

    @ElDtoField(logicalName = "rate_syspayno", physicalName = "rate_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_syspayno;

    @ElDtoField(logicalName = "rcpt_no", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "rate_empno", physicalName = "rate_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_empno;

    @ElDtoField(logicalName = "rate_nm", physicalName = "rate_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_nm;

    @ElDtoField(logicalName = "rate_posi_cd", physicalName = "rate_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_posi_cd;

    @ElDtoField(logicalName = "rate_posi_nm", physicalName = "rate_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_posi_nm;

    @ElDtoField(logicalName = "rate_division_cd", physicalName = "rate_division_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_division_cd;

    @ElDtoField(logicalName = "rate_division_nm", physicalName = "rate_division_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_division_nm;

    @ElDtoField(logicalName = "rate_dept_cd", physicalName = "rate_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_dept_cd;

    @ElDtoField(logicalName = "rate_dept_nm", physicalName = "rate_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rate_dept_nm;

    @ElDtoField(logicalName = "points", physicalName = "points", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String points;

    @ElDtoField(logicalName = "chk", physicalName = "선택", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String 선택;

    @ElDtoField(logicalName = "odr", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElVoField(physicalName = "rate_syspayno")
    public String getRate_syspayno(){
        return rate_syspayno;
    }

    @ElVoField(physicalName = "rate_syspayno")
    public void setRate_syspayno(String rate_syspayno){
        this.rate_syspayno = rate_syspayno;
    }

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "rate_empno")
    public String getRate_empno(){
        return rate_empno;
    }

    @ElVoField(physicalName = "rate_empno")
    public void setRate_empno(String rate_empno){
        this.rate_empno = rate_empno;
    }

    @ElVoField(physicalName = "rate_nm")
    public String getRate_nm(){
        return rate_nm;
    }

    @ElVoField(physicalName = "rate_nm")
    public void setRate_nm(String rate_nm){
        this.rate_nm = rate_nm;
    }

    @ElVoField(physicalName = "rate_posi_cd")
    public String getRate_posi_cd(){
        return rate_posi_cd;
    }

    @ElVoField(physicalName = "rate_posi_cd")
    public void setRate_posi_cd(String rate_posi_cd){
        this.rate_posi_cd = rate_posi_cd;
    }

    @ElVoField(physicalName = "rate_posi_nm")
    public String getRate_posi_nm(){
        return rate_posi_nm;
    }

    @ElVoField(physicalName = "rate_posi_nm")
    public void setRate_posi_nm(String rate_posi_nm){
        this.rate_posi_nm = rate_posi_nm;
    }

    @ElVoField(physicalName = "rate_division_cd")
    public String getRate_division_cd(){
        return rate_division_cd;
    }

    @ElVoField(physicalName = "rate_division_cd")
    public void setRate_division_cd(String rate_division_cd){
        this.rate_division_cd = rate_division_cd;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public String getRate_division_nm(){
        return rate_division_nm;
    }

    @ElVoField(physicalName = "rate_division_nm")
    public void setRate_division_nm(String rate_division_nm){
        this.rate_division_nm = rate_division_nm;
    }

    @ElVoField(physicalName = "rate_dept_cd")
    public String getRate_dept_cd(){
        return rate_dept_cd;
    }

    @ElVoField(physicalName = "rate_dept_cd")
    public void setRate_dept_cd(String rate_dept_cd){
        this.rate_dept_cd = rate_dept_cd;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public String getRate_dept_nm(){
        return rate_dept_nm;
    }

    @ElVoField(physicalName = "rate_dept_nm")
    public void setRate_dept_nm(String rate_dept_nm){
        this.rate_dept_nm = rate_dept_nm;
    }

    @ElVoField(physicalName = "points")
    public String getPoints(){
        return points;
    }

    @ElVoField(physicalName = "points")
    public void setPoints(String points){
        this.points = points;
    }

    @ElVoField(physicalName = "선택")
    public String get선택(){
        return 선택;
    }

    @ElVoField(physicalName = "선택")
    public void set선택(String 선택){
        this.선택 = 선택;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResOutCtrbtReqListVo [");
        sb.append("rate_syspayno").append("=").append(rate_syspayno).append(",");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("rate_empno").append("=").append(rate_empno).append(",");
        sb.append("rate_nm").append("=").append(rate_nm).append(",");
        sb.append("rate_posi_cd").append("=").append(rate_posi_cd).append(",");
        sb.append("rate_posi_nm").append("=").append(rate_posi_nm).append(",");
        sb.append("rate_division_cd").append("=").append(rate_division_cd).append(",");
        sb.append("rate_division_nm").append("=").append(rate_division_nm).append(",");
        sb.append("rate_dept_cd").append("=").append(rate_dept_cd).append(",");
        sb.append("rate_dept_nm").append("=").append(rate_dept_nm).append(",");
        sb.append("points").append("=").append(points).append(",");
        sb.append("선택").append("=").append(선택).append(",");
        sb.append("odr").append("=").append(odr);
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
