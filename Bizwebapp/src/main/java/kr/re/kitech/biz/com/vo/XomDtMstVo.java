package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "날짜 Vo")
public class XomDtMstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XomDtMstVo(){
    }

    @ElDtoField(logicalName = "날짜", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "일자 No", physicalName = "day_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day_no;

    @ElDtoField(logicalName = "일자", physicalName = "day", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String day;

    @ElDtoField(logicalName = "휴일여부", physicalName = "off_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String off_yn;

    @ElDtoField(logicalName = "휴일 비고", physicalName = "off_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String off_rmk;

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "day_no")
    public String getDay_no(){
        return day_no;
    }

    @ElVoField(physicalName = "day_no")
    public void setDay_no(String day_no){
        this.day_no = day_no;
    }

    @ElVoField(physicalName = "day")
    public String getDay(){
        return day;
    }

    @ElVoField(physicalName = "day")
    public void setDay(String day){
        this.day = day;
    }

    @ElVoField(physicalName = "off_yn")
    public String getOff_yn(){
        return off_yn;
    }

    @ElVoField(physicalName = "off_yn")
    public void setOff_yn(String off_yn){
        this.off_yn = off_yn;
    }

    @ElVoField(physicalName = "off_rmk")
    public String getOff_rmk(){
        return off_rmk;
    }

    @ElVoField(physicalName = "off_rmk")
    public void setOff_rmk(String off_rmk){
        this.off_rmk = off_rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XomDtMstVo [");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("day_no").append("=").append(day_no).append(",");
        sb.append("day").append("=").append(day).append(",");
        sb.append("off_yn").append("=").append(off_yn).append(",");
        sb.append("off_rmk").append("=").append(off_rmk);
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
