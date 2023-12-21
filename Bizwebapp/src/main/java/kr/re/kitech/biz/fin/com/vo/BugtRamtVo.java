package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예산통제모듈시 잔액체크 Vo")
public class BugtRamtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BugtRamtVo(){
    }

    @ElDtoField(logicalName = "예산금액", physicalName = "bugt_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long bugt_amt;

    @ElDtoField(logicalName = "원인행위금액", physicalName = "cause_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cause_amt;

    @ElDtoField(logicalName = "집행금액", physicalName = "enfrc_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long enfrc_amt;

    @ElDtoField(logicalName = "신청금액", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "예산통제방법", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_way;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "통제일자", physicalName = "bugt_ctrl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_ymd;

    @ElVoField(physicalName = "bugt_amt")
    public long getBugt_amt(){
        return bugt_amt;
    }

    @ElVoField(physicalName = "bugt_amt")
    public void setBugt_amt(long bugt_amt){
        this.bugt_amt = bugt_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public long getCause_amt(){
        return cause_amt;
    }

    @ElVoField(physicalName = "cause_amt")
    public void setCause_amt(long cause_amt){
        this.cause_amt = cause_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public long getEnfrc_amt(){
        return enfrc_amt;
    }

    @ElVoField(physicalName = "enfrc_amt")
    public void setEnfrc_amt(long enfrc_amt){
        this.enfrc_amt = enfrc_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        return bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "bugt_ctrl_ymd")
    public String getBugt_ctrl_ymd(){
        return bugt_ctrl_ymd;
    }

    @ElVoField(physicalName = "bugt_ctrl_ymd")
    public void setBugt_ctrl_ymd(String bugt_ctrl_ymd){
        this.bugt_ctrl_ymd = bugt_ctrl_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BugtRamtVo [");
        sb.append("bugt_amt").append("=").append(bugt_amt).append(",");
        sb.append("cause_amt").append("=").append(cause_amt).append(",");
        sb.append("enfrc_amt").append("=").append(enfrc_amt).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("bugt_ctrl_ymd").append("=").append(bugt_ctrl_ymd);
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
