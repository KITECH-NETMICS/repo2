package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappCreComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappCreComVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "미승인연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String anal_yr;

    @ElDtoField(logicalName = "적립월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String yyyymm;

    @ElDtoField(logicalName = "적립일수", physicalName = "reward_tot", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reward_tot;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "anal_yr")
    public String getAnal_yr(){
        String ret = this.anal_yr;
        return ret;
    }

    @ElVoField(physicalName = "anal_yr")
    public void setAnal_yr(String anal_yr){
        this.anal_yr = anal_yr;
    }

    @ElVoField(physicalName = "yyyymm")
    public String getYyyymm(){
        String ret = this.yyyymm;
        return ret;
    }

    @ElVoField(physicalName = "yyyymm")
    public void setYyyymm(String yyyymm){
        this.yyyymm = yyyymm;
    }

    @ElVoField(physicalName = "reward_tot")
    public String getReward_tot(){
        String ret = this.reward_tot;
        return ret;
    }

    @ElVoField(physicalName = "reward_tot")
    public void setReward_tot(String reward_tot){
        this.reward_tot = reward_tot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappCreComVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("reward_tot").append("=").append(reward_tot);
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
