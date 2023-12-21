package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappDedctVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappDedctVo(){
    }

    @ElDtoField(logicalName = "미승인연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String anal_yr;

    @ElDtoField(logicalName = "적립월", physicalName = "yyyymm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String yyyymm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "보상휴가 공제일수", physicalName = "dedct_reward_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dedct_reward_time;

    @ElDtoField(logicalName = "연차휴가 공제일수", physicalName = "dedct_anal_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dedct_anal_time;

    @ElDtoField(logicalName = "tot_time", physicalName = "tot_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tot_time;

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

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        String ret = this.syspayno;
        return ret;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "dedct_reward_time")
    public String getDedct_reward_time(){
        String ret = this.dedct_reward_time;
        return ret;
    }

    @ElVoField(physicalName = "dedct_reward_time")
    public void setDedct_reward_time(String dedct_reward_time){
        this.dedct_reward_time = dedct_reward_time;
    }

    @ElVoField(physicalName = "dedct_anal_time")
    public String getDedct_anal_time(){
        String ret = this.dedct_anal_time;
        return ret;
    }

    @ElVoField(physicalName = "dedct_anal_time")
    public void setDedct_anal_time(String dedct_anal_time){
        this.dedct_anal_time = dedct_anal_time;
    }

    @ElVoField(physicalName = "tot_time")
    public String getTot_time(){
        String ret = this.tot_time;
        return ret;
    }

    @ElVoField(physicalName = "tot_time")
    public void setTot_time(String tot_time){
        this.tot_time = tot_time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappDedctVo [");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("yyyymm").append("=").append(yyyymm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("dedct_reward_time").append("=").append(dedct_reward_time).append(",");
        sb.append("dedct_anal_time").append("=").append(dedct_anal_time).append(",");
        sb.append("tot_time").append("=").append(tot_time);
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
