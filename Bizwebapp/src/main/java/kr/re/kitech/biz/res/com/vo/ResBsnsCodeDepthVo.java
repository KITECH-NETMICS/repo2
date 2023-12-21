package kr.re.kitech.biz.res.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업무구분 코드 통합Vo")
public class ResBsnsCodeDepthVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBsnsCodeDepthVo(){
    }

    @ElDtoField(logicalName = "코드", physicalName = "bsns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd;

    @ElDtoField(logicalName = "명", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "업무구분 그룹", physicalName = "bsns_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_grp_cd;

    @ElDtoField(logicalName = "깊이", physicalName = "depth", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depth;

    @ElDtoField(logicalName = "과제관리코드", physicalName = "prj_mngmt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_mngmt_cd;

    @ElDtoField(logicalName = "계정관리코드", physicalName = "accnt_mngmt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_mngmt_cd;

    @ElVoField(physicalName = "bsns_cd")
    public String getBsns_cd(){
        return bsns_cd;
    }

    @ElVoField(physicalName = "bsns_cd")
    public void setBsns_cd(String bsns_cd){
        this.bsns_cd = bsns_cd;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "bsns_grp_cd")
    public String getBsns_grp_cd(){
        return bsns_grp_cd;
    }

    @ElVoField(physicalName = "bsns_grp_cd")
    public void setBsns_grp_cd(String bsns_grp_cd){
        this.bsns_grp_cd = bsns_grp_cd;
    }

    @ElVoField(physicalName = "depth")
    public String getDepth(){
        return depth;
    }

    @ElVoField(physicalName = "depth")
    public void setDepth(String depth){
        this.depth = depth;
    }

    @ElVoField(physicalName = "prj_mngmt_cd")
    public String getPrj_mngmt_cd(){
        return prj_mngmt_cd;
    }

    @ElVoField(physicalName = "prj_mngmt_cd")
    public void setPrj_mngmt_cd(String prj_mngmt_cd){
        this.prj_mngmt_cd = prj_mngmt_cd;
    }

    @ElVoField(physicalName = "accnt_mngmt_cd")
    public String getAccnt_mngmt_cd(){
        return accnt_mngmt_cd;
    }

    @ElVoField(physicalName = "accnt_mngmt_cd")
    public void setAccnt_mngmt_cd(String accnt_mngmt_cd){
        this.accnt_mngmt_cd = accnt_mngmt_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBsnsCodeDepthVo [");
        sb.append("bsns_cd").append("=").append(bsns_cd).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("bsns_grp_cd").append("=").append(bsns_grp_cd).append(",");
        sb.append("depth").append("=").append(depth).append(",");
        sb.append("prj_mngmt_cd").append("=").append(prj_mngmt_cd).append(",");
        sb.append("accnt_mngmt_cd").append("=").append(accnt_mngmt_cd);
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
