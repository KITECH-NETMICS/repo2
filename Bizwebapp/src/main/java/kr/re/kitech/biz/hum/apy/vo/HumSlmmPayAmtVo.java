package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "퇴직충당금조회")
public class HumSlmmPayAmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumSlmmPayAmtVo(){
    }

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "longwkCntfrYmd", physicalName = "longwk_cntfr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String longwk_cntfr_ymd;

    @ElDtoField(logicalName = "retireApproAvgWage", physicalName = "retire_appro_avg_wage", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_appro_avg_wage;

    @ElDtoField(logicalName = "retireAppro", physicalName = "retire_appro", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_appro;

    @ElDtoField(logicalName = "retireApproLongwk", physicalName = "retire_appro_longwk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_appro_longwk;

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public String getLongwk_cntfr_ymd(){
        return longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "longwk_cntfr_ymd")
    public void setLongwk_cntfr_ymd(String longwk_cntfr_ymd){
        this.longwk_cntfr_ymd = longwk_cntfr_ymd;
    }

    @ElVoField(physicalName = "retire_appro_avg_wage")
    public String getRetire_appro_avg_wage(){
        return retire_appro_avg_wage;
    }

    @ElVoField(physicalName = "retire_appro_avg_wage")
    public void setRetire_appro_avg_wage(String retire_appro_avg_wage){
        this.retire_appro_avg_wage = retire_appro_avg_wage;
    }

    @ElVoField(physicalName = "retire_appro")
    public String getRetire_appro(){
        return retire_appro;
    }

    @ElVoField(physicalName = "retire_appro")
    public void setRetire_appro(String retire_appro){
        this.retire_appro = retire_appro;
    }

    @ElVoField(physicalName = "retire_appro_longwk")
    public String getRetire_appro_longwk(){
        return retire_appro_longwk;
    }

    @ElVoField(physicalName = "retire_appro_longwk")
    public void setRetire_appro_longwk(String retire_appro_longwk){
        this.retire_appro_longwk = retire_appro_longwk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumSlmmPayAmtVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("longwk_cntfr_ymd").append("=").append(longwk_cntfr_ymd).append(",");
        sb.append("retire_appro_avg_wage").append("=").append(retire_appro_avg_wage).append(",");
        sb.append("retire_appro").append("=").append(retire_appro).append(",");
        sb.append("retire_appro_longwk").append("=").append(retire_appro_longwk);
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
