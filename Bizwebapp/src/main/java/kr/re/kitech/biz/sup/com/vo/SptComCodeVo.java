package kr.re.kitech.biz.sup.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 공통코드 Vo")
public class SptComCodeVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptComCodeVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "코드분류", physicalName = "cd_class", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_class;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

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

    @ElVoField(physicalName = "cd_class")
    public String getCd_class(){
        return cd_class;
    }

    @ElVoField(physicalName = "cd_class")
    public void setCd_class(String cd_class){
        this.cd_class = cd_class;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptComCodeVo [");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("cd_class").append("=").append(cd_class).append(",");
        sb.append("rmk").append("=").append(rmk);
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
