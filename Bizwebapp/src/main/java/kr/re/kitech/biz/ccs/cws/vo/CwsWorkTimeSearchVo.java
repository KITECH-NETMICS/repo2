package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "CwsWorkTimeSearchVo")
public class CwsWorkTimeSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeSearchVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "년", physicalName = "year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String year;

    @ElDtoField(logicalName = "년월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yyyymm;

    @ElDtoField(logicalName = "년월일", physicalName = "yyyymmdd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String yyyymmdd;

    @ElDtoField(logicalName = "기준일", physicalName = "basedate", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String basedate;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "year")
    public String getYear(){
        return year;
    }

    @ElVoField(physicalName = "year")
    public void setYear(String year){
        this.year = year;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        return yyyymm;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "yyyymmdd")
    public String getYyyymmdd(){
        return yyyymmdd;
    }

    @ElVoField(physicalName = "yyyymmdd")
    public void setYyyymmdd(String yyyymmdd){
        this.yyyymmdd = yyyymmdd;
    }

    @ElVoField(physicalName = "basedate")
    public String getBasedate(){
        return basedate;
    }

    @ElVoField(physicalName = "basedate")
    public void setBasedate(String basedate){
        this.basedate = basedate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeSearchVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("year").append("=").append(year).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("yyyymmdd").append("=").append(yyyymmdd).append(",");
        sb.append("basedate").append("=").append(basedate);
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
