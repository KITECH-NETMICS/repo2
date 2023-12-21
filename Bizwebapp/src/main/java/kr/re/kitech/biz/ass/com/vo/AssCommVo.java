package kr.re.kitech.biz.ass.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "자산위치별 건물, 층수 검색 VO")
public class AssCommVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssCommVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "지상 최저 층", physicalName = "mngmt_no_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_1;

    @ElDtoField(logicalName = "지상 최고 층", physicalName = "mngmt_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_2;

    @ElDtoField(logicalName = "지하 최고 층", physicalName = "mngmt_no_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_3;

    @ElDtoField(logicalName = "지하 최저 층", physicalName = "mngmt_no_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_4;

    @ElDtoField(logicalName = "옥상 정보", physicalName = "mngmt_no_5", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no_5;

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "mngmt_no_1")
    public String getMngmt_no_1(){
        return mngmt_no_1;
    }

    @ElVoField(physicalName = "mngmt_no_1")
    public void setMngmt_no_1(String mngmt_no_1){
        this.mngmt_no_1 = mngmt_no_1;
    }

    @ElVoField(physicalName = "mngmt_no_2")
    public String getMngmt_no_2(){
        return mngmt_no_2;
    }

    @ElVoField(physicalName = "mngmt_no_2")
    public void setMngmt_no_2(String mngmt_no_2){
        this.mngmt_no_2 = mngmt_no_2;
    }

    @ElVoField(physicalName = "mngmt_no_3")
    public String getMngmt_no_3(){
        return mngmt_no_3;
    }

    @ElVoField(physicalName = "mngmt_no_3")
    public void setMngmt_no_3(String mngmt_no_3){
        this.mngmt_no_3 = mngmt_no_3;
    }

    @ElVoField(physicalName = "mngmt_no_4")
    public String getMngmt_no_4(){
        return mngmt_no_4;
    }

    @ElVoField(physicalName = "mngmt_no_4")
    public void setMngmt_no_4(String mngmt_no_4){
        this.mngmt_no_4 = mngmt_no_4;
    }

    @ElVoField(physicalName = "mngmt_no_5")
    public String getMngmt_no_5(){
        return mngmt_no_5;
    }

    @ElVoField(physicalName = "mngmt_no_5")
    public void setMngmt_no_5(String mngmt_no_5){
        this.mngmt_no_5 = mngmt_no_5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssCommVo [");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("mngmt_no_1").append("=").append(mngmt_no_1).append(",");
        sb.append("mngmt_no_2").append("=").append(mngmt_no_2).append(",");
        sb.append("mngmt_no_3").append("=").append(mngmt_no_3).append(",");
        sb.append("mngmt_no_4").append("=").append(mngmt_no_4).append(",");
        sb.append("mngmt_no_5").append("=").append(mngmt_no_5);
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
