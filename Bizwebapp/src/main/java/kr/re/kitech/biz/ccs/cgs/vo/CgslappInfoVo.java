package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "휴가원")
public class CgslappInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgslappInfoVo(){
    }

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String syspayno;

    @ElDtoField(logicalName = "미승인연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String anal_yr;

    @ElDtoField(logicalName = "입사일자", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "소멸예정일", physicalName = "expire_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expire_ymd;

    @ElDtoField(logicalName = "소멸예정연차", physicalName = "expire_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expire_daycnt;

    @ElDtoField(logicalName = "생성년차", physicalName = "creat_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String creat_anal_qty;

    @ElDtoField(logicalName = "저축연차", physicalName = "cryfwd_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cryfwd_anal_qty;

    @ElDtoField(logicalName = "사용연차", physicalName = "use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_anal_qty;

    @ElDtoField(logicalName = "잔여연차", physicalName = "remidr_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remidr_anal_qty;

    @ElDtoField(logicalName = "의무사용연차", physicalName = "duty_use_anal_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String duty_use_anal_qty;

    @ElDtoField(logicalName = "적립시간", physicalName = "tot_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String tot_com_cnt;

    @ElDtoField(logicalName = "사용시간", physicalName = "use_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_com_cnt;

    @ElDtoField(logicalName = "잔여시간", physicalName = "remain_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String remain_com_cnt;

    @ElDtoField(logicalName = "use_alt_days", physicalName = "use_alt_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_alt_days;

    @ElDtoField(logicalName = "자녀돌봄휴가", physicalName = "use_chd_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_chd_days;

    @ElDtoField(logicalName = "병가", physicalName = "use_sck_days", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String use_sck_days;

    @ElDtoField(logicalName = "사용기간", physicalName = "dedct_reward_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dedct_reward_time;

    @ElDtoField(logicalName = "공제", physicalName = "dedct_anal_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dedct_anal_time;

    @ElDtoField(logicalName = "저축보상", physicalName = "cryfwd_com_cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cryfwd_com_cnt;

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

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        String ret = this.entr_ymd;
        return ret;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
    }

    @ElVoField(physicalName = "expire_ymd")
    public String getExpire_ymd(){
        String ret = this.expire_ymd;
        return ret;
    }

    @ElVoField(physicalName = "expire_ymd")
    public void setExpire_ymd(String expire_ymd){
        this.expire_ymd = expire_ymd;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public String getExpire_daycnt(){
        String ret = this.expire_daycnt;
        return ret;
    }

    @ElVoField(physicalName = "expire_daycnt")
    public void setExpire_daycnt(String expire_daycnt){
        this.expire_daycnt = expire_daycnt;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public String getCreat_anal_qty(){
        String ret = this.creat_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "creat_anal_qty")
    public void setCreat_anal_qty(String creat_anal_qty){
        this.creat_anal_qty = creat_anal_qty;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public String getCryfwd_anal_qty(){
        String ret = this.cryfwd_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "cryfwd_anal_qty")
    public void setCryfwd_anal_qty(String cryfwd_anal_qty){
        this.cryfwd_anal_qty = cryfwd_anal_qty;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public String getUse_anal_qty(){
        String ret = this.use_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "use_anal_qty")
    public void setUse_anal_qty(String use_anal_qty){
        this.use_anal_qty = use_anal_qty;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public String getRemidr_anal_qty(){
        String ret = this.remidr_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "remidr_anal_qty")
    public void setRemidr_anal_qty(String remidr_anal_qty){
        this.remidr_anal_qty = remidr_anal_qty;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public String getDuty_use_anal_qty(){
        String ret = this.duty_use_anal_qty;
        return ret;
    }

    @ElVoField(physicalName = "duty_use_anal_qty")
    public void setDuty_use_anal_qty(String duty_use_anal_qty){
        this.duty_use_anal_qty = duty_use_anal_qty;
    }

    @ElVoField(physicalName = "tot_com_cnt")
    public String getTot_com_cnt(){
        String ret = this.tot_com_cnt;
        return ret;
    }

    @ElVoField(physicalName = "tot_com_cnt")
    public void setTot_com_cnt(String tot_com_cnt){
        this.tot_com_cnt = tot_com_cnt;
    }

    @ElVoField(physicalName = "use_com_cnt")
    public String getUse_com_cnt(){
        String ret = this.use_com_cnt;
        return ret;
    }

    @ElVoField(physicalName = "use_com_cnt")
    public void setUse_com_cnt(String use_com_cnt){
        this.use_com_cnt = use_com_cnt;
    }

    @ElVoField(physicalName = "remain_com_cnt")
    public String getRemain_com_cnt(){
        String ret = this.remain_com_cnt;
        return ret;
    }

    @ElVoField(physicalName = "remain_com_cnt")
    public void setRemain_com_cnt(String remain_com_cnt){
        this.remain_com_cnt = remain_com_cnt;
    }

    @ElVoField(physicalName = "use_alt_days")
    public String getUse_alt_days(){
        String ret = this.use_alt_days;
        return ret;
    }

    @ElVoField(physicalName = "use_alt_days")
    public void setUse_alt_days(String use_alt_days){
        this.use_alt_days = use_alt_days;
    }

    @ElVoField(physicalName = "use_chd_days")
    public String getUse_chd_days(){
        String ret = this.use_chd_days;
        return ret;
    }

    @ElVoField(physicalName = "use_chd_days")
    public void setUse_chd_days(String use_chd_days){
        this.use_chd_days = use_chd_days;
    }

    @ElVoField(physicalName = "use_sck_days")
    public String getUse_sck_days(){
        String ret = this.use_sck_days;
        return ret;
    }

    @ElVoField(physicalName = "use_sck_days")
    public void setUse_sck_days(String use_sck_days){
        this.use_sck_days = use_sck_days;
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

    @ElVoField(physicalName = "cryfwd_com_cnt")
    public String getCryfwd_com_cnt(){
        String ret = this.cryfwd_com_cnt;
        return ret;
    }

    @ElVoField(physicalName = "cryfwd_com_cnt")
    public void setCryfwd_com_cnt(String cryfwd_com_cnt){
        this.cryfwd_com_cnt = cryfwd_com_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgslappInfoVo [");
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
