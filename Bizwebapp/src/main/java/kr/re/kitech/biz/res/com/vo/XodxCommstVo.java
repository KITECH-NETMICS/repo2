package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구 공통코드 Vo")
public class XodxCommstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodxCommstVo(){
    }

    @ElDtoField(logicalName = "코드구분", physicalName = "cd_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_clsf;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seq;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "관리항목3", physicalName = "mngmt_item_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_3;

    @ElDtoField(logicalName = "관리항목4", physicalName = "mngmt_item_4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_4;

    @ElDtoField(logicalName = "코드명", physicalName = "cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd_nm;

    @ElDtoField(logicalName = "코드명(대)", physicalName = "big_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String big_cd_nm;

    @ElDtoField(logicalName = "코드명(중)", physicalName = "mid_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mid_cd_nm;

    @ElDtoField(logicalName = "코드", physicalName = "cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cd;

    @ElVoField(physicalName = "cd_clsf")
    public String getCd_clsf(){
        return cd_clsf;
    }

    @ElVoField(physicalName = "cd_clsf")
    public void setCd_clsf(String cd_clsf){
        this.cd_clsf = cd_clsf;
    }

    @ElVoField(physicalName = "seq")
    public String getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(String seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public String getMngmt_item_3(){
        return mngmt_item_3;
    }

    @ElVoField(physicalName = "mngmt_item_3")
    public void setMngmt_item_3(String mngmt_item_3){
        this.mngmt_item_3 = mngmt_item_3;
    }

    @ElVoField(physicalName = "mngmt_item_4")
    public String getMngmt_item_4(){
        return mngmt_item_4;
    }

    @ElVoField(physicalName = "mngmt_item_4")
    public void setMngmt_item_4(String mngmt_item_4){
        this.mngmt_item_4 = mngmt_item_4;
    }

    @ElVoField(physicalName = "cd_nm")
    public String getCd_nm(){
        return cd_nm;
    }

    @ElVoField(physicalName = "cd_nm")
    public void setCd_nm(String cd_nm){
        this.cd_nm = cd_nm;
    }

    @ElVoField(physicalName = "big_cd_nm")
    public String getBig_cd_nm(){
        return big_cd_nm;
    }

    @ElVoField(physicalName = "big_cd_nm")
    public void setBig_cd_nm(String big_cd_nm){
        this.big_cd_nm = big_cd_nm;
    }

    @ElVoField(physicalName = "mid_cd_nm")
    public String getMid_cd_nm(){
        return mid_cd_nm;
    }

    @ElVoField(physicalName = "mid_cd_nm")
    public void setMid_cd_nm(String mid_cd_nm){
        this.mid_cd_nm = mid_cd_nm;
    }

    @ElVoField(physicalName = "cd")
    public String getCd(){
        return cd;
    }

    @ElVoField(physicalName = "cd")
    public void setCd(String cd){
        this.cd = cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodxCommstVo [");
        sb.append("cd_clsf").append("=").append(cd_clsf).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("mngmt_item_3").append("=").append(mngmt_item_3).append(",");
        sb.append("mngmt_item_4").append("=").append(mngmt_item_4).append(",");
        sb.append("cd_nm").append("=").append(cd_nm).append(",");
        sb.append("big_cd_nm").append("=").append(big_cd_nm).append(",");
        sb.append("mid_cd_nm").append("=").append(mid_cd_nm).append(",");
        sb.append("cd").append("=").append(cd);
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
