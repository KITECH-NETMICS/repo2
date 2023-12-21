package kr.re.kitech.biz.pat.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지식재산권 코드마스터 Vo")
public class PatCodeMastrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatCodeMastrVo(){
    }

    @ElDtoField(logicalName = "코드번호", physicalName = "cd_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_no;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "코드상세설명", physicalName = "cd_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_desc;

    @ElVoField(physicalName = "cd_no")
    public String getCd_no(){
        return cd_no;
    }

    @ElVoField(physicalName = "cd_no")
    public void setCd_no(String cd_no){
        this.cd_no = cd_no;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "cd_desc")
    public String getCd_desc(){
        return cd_desc;
    }

    @ElVoField(physicalName = "cd_desc")
    public void setCd_desc(String cd_desc){
        this.cd_desc = cd_desc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatCodeMastrVo [");
        sb.append("cd_no").append("=").append(cd_no).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("cd_desc").append("=").append(cd_desc);
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
