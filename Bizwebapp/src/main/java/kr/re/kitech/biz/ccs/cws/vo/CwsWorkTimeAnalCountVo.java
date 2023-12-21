package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "WorkTimeAnalCountVo")
public class CwsWorkTimeAnalCountVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsWorkTimeAnalCountVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "년도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal_yr;

    @ElDtoField(logicalName = "입원일", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "소멸년도", physicalName = "expire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expire_ymd;

    @ElDtoField(logicalName = "소멸일수", physicalName = "expire_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expire_daycnt;

    @ElDtoField(logicalName = "생성일수", physicalName = "creat_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String creat_anal_qty;

    @ElDtoField(logicalName = "저축일수", physicalName = "cryfwd_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_anal_qty;

    @ElDtoField(logicalName = "사용일수", physicalName = "use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_anal_qty;

    @ElDtoField(logicalName = "잔여일수", physicalName = "remidr_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remidr_anal_qty;

    @ElDtoField(logicalName = "의무사용일수", physicalName = "duty_use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String duty_use_anal_qty;

    @ElDtoField(logicalName = "보상적립일수", physicalName = "tot_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tot_com_cnt;

    @ElDtoField(logicalName = "보상사용일수", physicalName = "use_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_com_cnt;

    @ElDtoField(logicalName = "보상잔여일수", physicalName = "remain_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remain_com_cnt;

    @ElDtoField(logicalName = "대체휴일", physicalName = "use_alt_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_alt_days;

    @ElDtoField(logicalName = "자녀돌봄", physicalName = "use_chd_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_chd_days;

    @ElDtoField(logicalName = "병가", physicalName = "use_sck_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_sck_days;

    @ElDtoField(logicalName = "공제보상", physicalName = "dedct_reward_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_reward_time;

    @ElDtoField(logicalName = "공제연차", physicalName = "dedct_anal_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dedct_anal_time;

    @ElDtoField(logicalName = "보상적저축일수", physicalName = "cryfwd_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cryfwd_com_cnt;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "anal_yr")
    public String getAnal_yr(){
        return anal_yr;
    }

    @ElVoField(physicalName = "anal_yr")
    public void setAnal_yr(String anal_yr){
        this.anal_yr = anal_yr;
    }

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "expire_ymd")
    public String getExpire_ymd(){
        return expire_ymd;
    }

    @ElVoField(physicalName = "expire_ymd")
    public void setExpire_ymd(String expire_ymd){
        this.expire_ymd = expire_ymd;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public String getExpire_daycnt(){
        return expire_daycnt;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public void setExpire_daycnt(String expire_daycnt){
        this.expire_daycnt = expire_daycnt;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public String getCreat_anal_qty(){
        return creat_anal_qty;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public void setCreat_anal_qty(String creat_anal_qty){
        this.creat_anal_qty = creat_anal_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public String getCryfwd_anal_qty(){
        return cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public void setCryfwd_anal_qty(String cryfwd_anal_qty){
        this.cryfwd_anal_qty = cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public String getUse_anal_qty(){
        return use_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public void setUse_anal_qty(String use_anal_qty){
        this.use_anal_qty = use_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public String getRemidr_anal_qty(){
        return remidr_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public void setRemidr_anal_qty(String remidr_anal_qty){
        this.remidr_anal_qty = remidr_anal_qty;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public String getDuty_use_anal_qty(){
        return duty_use_anal_qty;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public void setDuty_use_anal_qty(String duty_use_anal_qty){
        this.duty_use_anal_qty = duty_use_anal_qty;
    }

    @ElVoField(physicalName = "tot_com_cnt")
    public String getTot_com_cnt(){
        return tot_com_cnt;
    }

    @ElVoField(physicalName = "tot_com_cnt")
    public void setTot_com_cnt(String tot_com_cnt){
        this.tot_com_cnt = tot_com_cnt;
    }

    @ElVoField(physicalName = "use_com_cnt")
    public String getUse_com_cnt(){
        return use_com_cnt;
    }

    @ElVoField(physicalName = "use_com_cnt")
    public void setUse_com_cnt(String use_com_cnt){
        this.use_com_cnt = use_com_cnt;
    }

    @ElVoField(physicalName = "remain_com_cnt")
    public String getRemain_com_cnt(){
        return remain_com_cnt;
    }

    @ElVoField(physicalName = "remain_com_cnt")
    public void setRemain_com_cnt(String remain_com_cnt){
        this.remain_com_cnt = remain_com_cnt;
    }

    @ElVoField(physicalName = "use_alt_days")
    public String getUse_alt_days(){
        return use_alt_days;
    }

    @ElVoField(physicalName = "use_alt_days")
    public void setUse_alt_days(String use_alt_days){
        this.use_alt_days = use_alt_days;
    }

    @ElVoField(physicalName = "use_chd_days")
    public String getUse_chd_days(){
        return use_chd_days;
    }

    @ElVoField(physicalName = "use_chd_days")
    public void setUse_chd_days(String use_chd_days){
        this.use_chd_days = use_chd_days;
    }

    @ElVoField(physicalName = "use_sck_days")
    public String getUse_sck_days(){
        return use_sck_days;
    }

    @ElVoField(physicalName = "use_sck_days")
    public void setUse_sck_days(String use_sck_days){
        this.use_sck_days = use_sck_days;
    }

    @ElVoField(physicalName = "dedct_reward_time")
    public String getDedct_reward_time(){
        return dedct_reward_time;
    }

    @ElVoField(physicalName = "dedct_reward_time")
    public void setDedct_reward_time(String dedct_reward_time){
        this.dedct_reward_time = dedct_reward_time;
    }

    @ElVoField(physicalName = "dedct_anal_time")
    public String getDedct_anal_time(){
        return dedct_anal_time;
    }

    @ElVoField(physicalName = "dedct_anal_time")
    public void setDedct_anal_time(String dedct_anal_time){
        this.dedct_anal_time = dedct_anal_time;
    }

    @ElVoField(physicalName = "cryfwd_com_cnt")
    public String getCryfwd_com_cnt(){
        return cryfwd_com_cnt;
    }

    @ElVoField(physicalName = "cryfwd_com_cnt")
    public void setCryfwd_com_cnt(String cryfwd_com_cnt){
        this.cryfwd_com_cnt = cryfwd_com_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CwsWorkTimeAnalCountVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("expire_ymd").append("=").append(expire_ymd).append(",");
        sb.append("expire_daycnt").append("=").append(expire_daycnt).append(",");
        sb.append("creat_anal_qty").append("=").append(creat_anal_qty).append(",");
        sb.append("cryfwd_anal_qty").append("=").append(cryfwd_anal_qty).append(",");
        sb.append("use_anal_qty").append("=").append(use_anal_qty).append(",");
        sb.append("remidr_anal_qty").append("=").append(remidr_anal_qty).append(",");
        sb.append("duty_use_anal_qty").append("=").append(duty_use_anal_qty).append(",");
        sb.append("tot_com_cnt").append("=").append(tot_com_cnt).append(",");
        sb.append("use_com_cnt").append("=").append(use_com_cnt).append(",");
        sb.append("remain_com_cnt").append("=").append(remain_com_cnt).append(",");
        sb.append("use_alt_days").append("=").append(use_alt_days).append(",");
        sb.append("use_chd_days").append("=").append(use_chd_days).append(",");
        sb.append("use_sck_days").append("=").append(use_sck_days).append(",");
        sb.append("dedct_reward_time").append("=").append(dedct_reward_time).append(",");
        sb.append("dedct_anal_time").append("=").append(dedct_anal_time).append(",");
        sb.append("cryfwd_com_cnt").append("=").append(cryfwd_com_cnt);
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
