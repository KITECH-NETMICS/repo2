package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연차생성Vo")
public class CgsAnnlHoliVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsAnnlHoliVo(){
    }

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "연도", physicalName = "anal_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String anal_yr;

    @ElDtoField(logicalName = "대상", physicalName = "target", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String target;

    @ElDtoField(logicalName = "현재년도", physicalName = "cur_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cur_ymd;

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

    @ElVoField(physicalName = "target")
    public String getTarget(){
        return target;
    }

    @ElVoField(physicalName = "target")
    public void setTarget(String target){
        this.target = target;
    }

    @ElVoField(physicalName = "cur_ymd")
    public String getCur_ymd(){
        return cur_ymd;
    }

    @ElVoField(physicalName = "cur_ymd")
    public void setCur_ymd(String cur_ymd){
        this.cur_ymd = cur_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsAnnlHoliVo [");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("anal_yr").append("=").append(anal_yr).append(",");
        sb.append("target").append("=").append(target).append(",");
        sb.append("cur_ymd").append("=").append(cur_ymd);
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
