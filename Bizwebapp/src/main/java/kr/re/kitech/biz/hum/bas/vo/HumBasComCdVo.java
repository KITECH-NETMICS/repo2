package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "직급코드Vo")
public class HumBasComCdVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasComCdVo(){
    }

    @ElDtoField(logicalName = "교육구분", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "코드구분", physicalName = "cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_clsf;

    @ElDtoField(logicalName = "시스템구분", physicalName = "sys_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sys_clsf;

    @ElDtoField(logicalName = "교육명코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElDtoField(logicalName = "교육명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "코드상세설명", physicalName = "cd_desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_desc;

    @ElDtoField(logicalName = "seq", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "사용유무", physicalName = "use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_ex;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "cd_clsf")
    public String getCd_clsf(){
        return cd_clsf;
    }

    @ElVoField(physicalName = "cd_clsf")
    public void setCd_clsf(String cd_clsf){
        this.cd_clsf = cd_clsf;
    }

    @ElVoField(physicalName = "sys_clsf")
    public String getSys_clsf(){
        return sys_clsf;
    }

    @ElVoField(physicalName = "sys_clsf")
    public void setSys_clsf(String sys_clsf){
        this.sys_clsf = sys_clsf;
    }

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

    @ElVoField(physicalName = "cd_desc")
    public String getCd_desc(){
        return cd_desc;
    }

    @ElVoField(physicalName = "cd_desc")
    public void setCd_desc(String cd_desc){
        this.cd_desc = cd_desc;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "use_ex")
    public String getUse_ex(){
        return use_ex;
    }

    @ElVoField(physicalName = "use_ex")
    public void setUse_ex(String use_ex){
        this.use_ex = use_ex;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasComCdVo [");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("cd_clsf").append("=").append(cd_clsf).append(",");
        sb.append("sys_clsf").append("=").append(sys_clsf).append(",");
        sb.append("cd").append("=").append(cd).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("cd_desc").append("=").append(cd_desc).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("use_ex").append("=").append(use_ex).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
