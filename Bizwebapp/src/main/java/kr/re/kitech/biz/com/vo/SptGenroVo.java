package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 접수번호 생성 Vo")
public class SptGenroVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptGenroVo(){
    }

    @ElDtoField(logicalName = "지원연도", physicalName = "supt_year", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_year;

    @ElDtoField(logicalName = "접수번호팀코드", physicalName = "supt_team_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team_code;

    @ElDtoField(logicalName = "생성번호", physicalName = "genrt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String genrt_no;

    @ElDtoField(logicalName = "지원팀", physicalName = "supt_team", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team;

    @ElDtoField(logicalName = "접수구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElVoField(physicalName = "supt_year")
    public String getSupt_year(){
        return supt_year;
    }

    @ElVoField(physicalName = "supt_year")
    public void setSupt_year(String supt_year){
        this.supt_year = supt_year;
    }

    @ElVoField(physicalName = "supt_team_code")
    public String getSupt_team_code(){
        return supt_team_code;
    }

    @ElVoField(physicalName = "supt_team_code")
    public void setSupt_team_code(String supt_team_code){
        this.supt_team_code = supt_team_code;
    }

    @ElVoField(physicalName = "genrt_no")
    public String getGenrt_no(){
        return genrt_no;
    }

    @ElVoField(physicalName = "genrt_no")
    public void setGenrt_no(String genrt_no){
        this.genrt_no = genrt_no;
    }

    @ElVoField(physicalName = "supt_team")
    public String getSupt_team(){
        return supt_team;
    }

    @ElVoField(physicalName = "supt_team")
    public void setSupt_team(String supt_team){
        this.supt_team = supt_team;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptGenroVo [");
        sb.append("supt_year").append("=").append(supt_year).append(",");
        sb.append("supt_team_code").append("=").append(supt_team_code).append(",");
        sb.append("genrt_no").append("=").append(genrt_no).append(",");
        sb.append("supt_team").append("=").append(supt_team).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf);
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
