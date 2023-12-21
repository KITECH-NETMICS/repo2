package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "외부강의신고 월간현황 Vo")
public class CvnTripReqMonthVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CvnTripReqMonthVo(){
    }

    @ElDtoField(logicalName = "회차", physicalName = "row_num", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String row_num;

    @ElDtoField(logicalName = "강의일시", physicalName = "period_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String period_date;

    @ElDtoField(logicalName = "강의시간(분)", physicalName = "period_minute", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String period_minute;

    @ElDtoField(logicalName = "사례금(원)", physicalName = "reward_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long reward_amt;

    @ElDtoField(logicalName = "요청기관명", physicalName = "invite_org_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invite_org_nm;

    @ElDtoField(logicalName = "보상구분", physicalName = "econo_gain_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String econo_gain_clsf;

    @ElDtoField(logicalName = "참여정도", physicalName = "attnce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_clsf;

    @ElVoField(physicalName = "row_num")
    public String getRow_num(){
        return row_num;
    }

    @ElVoField(physicalName = "row_num")
    public void setRow_num(String row_num){
        this.row_num = row_num;
    }

    @ElVoField(physicalName = "period_date")
    public String getPeriod_date(){
        return period_date;
    }

    @ElVoField(physicalName = "period_date")
    public void setPeriod_date(String period_date){
        this.period_date = period_date;
    }

    @ElVoField(physicalName = "period_minute")
    public String getPeriod_minute(){
        return period_minute;
    }

    @ElVoField(physicalName = "period_minute")
    public void setPeriod_minute(String period_minute){
        this.period_minute = period_minute;
    }

    @ElVoField(physicalName = "reward_amt")
    public long getReward_amt(){
        return reward_amt;
    }

    @ElVoField(physicalName = "reward_amt")
    public void setReward_amt(long reward_amt){
        this.reward_amt = reward_amt;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public String getInvite_org_nm(){
        return invite_org_nm;
    }

    @ElVoField(physicalName = "invite_org_nm")
    public void setInvite_org_nm(String invite_org_nm){
        this.invite_org_nm = invite_org_nm;
    }

    @ElVoField(physicalName = "econo_gain_clsf")
    public String getEcono_gain_clsf(){
        return econo_gain_clsf;
    }

    @ElVoField(physicalName = "econo_gain_clsf")
    public void setEcono_gain_clsf(String econo_gain_clsf){
        this.econo_gain_clsf = econo_gain_clsf;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public String getAttnce_clsf(){
        return attnce_clsf;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public void setAttnce_clsf(String attnce_clsf){
        this.attnce_clsf = attnce_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CvnTripReqMonthVo [");
        sb.append("row_num").append("=").append(row_num).append(",");
        sb.append("period_date").append("=").append(period_date).append(",");
        sb.append("period_minute").append("=").append(period_minute).append(",");
        sb.append("reward_amt").append("=").append(reward_amt).append(",");
        sb.append("invite_org_nm").append("=").append(invite_org_nm).append(",");
        sb.append("econo_gain_clsf").append("=").append(econo_gain_clsf).append(",");
        sb.append("attnce_clsf").append("=").append(attnce_clsf);
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
