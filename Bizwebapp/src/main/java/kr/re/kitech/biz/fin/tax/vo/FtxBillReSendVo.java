package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자계산서 발송현황 Vo")
public class FtxBillReSendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillReSendVo(){
    }

    @ElDtoField(logicalName = "재전송 이메일", physicalName = "res_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_addr;

    @ElDtoField(logicalName = "담당자확인구분", physicalName = "rcv_view_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_view_yn_nm;

    @ElDtoField(logicalName = "전송일자", physicalName = "use_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_date;

    @ElDtoField(logicalName = "전송시간", physicalName = "use_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_time;

    @ElDtoField(logicalName = "전송상태", physicalName = "snd_stat_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_stat_nm;

    @ElVoField(physicalName = "res_addr")
    public String getRes_addr(){
        return res_addr;
    }

    @ElVoField(physicalName = "res_addr")
    public void setRes_addr(String res_addr){
        this.res_addr = res_addr;
    }

    @ElVoField(physicalName = "rcv_view_yn_nm")
    public String getRcv_view_yn_nm(){
        return rcv_view_yn_nm;
    }

    @ElVoField(physicalName = "rcv_view_yn_nm")
    public void setRcv_view_yn_nm(String rcv_view_yn_nm){
        this.rcv_view_yn_nm = rcv_view_yn_nm;
    }

    @ElVoField(physicalName = "use_date")
    public String getUse_date(){
        return use_date;
    }

    @ElVoField(physicalName = "use_date")
    public void setUse_date(String use_date){
        this.use_date = use_date;
    }

    @ElVoField(physicalName = "use_time")
    public String getUse_time(){
        return use_time;
    }

    @ElVoField(physicalName = "use_time")
    public void setUse_time(String use_time){
        this.use_time = use_time;
    }

    @ElVoField(physicalName = "snd_stat_nm")
    public String getSnd_stat_nm(){
        return snd_stat_nm;
    }

    @ElVoField(physicalName = "snd_stat_nm")
    public void setSnd_stat_nm(String snd_stat_nm){
        this.snd_stat_nm = snd_stat_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillReSendVo [");
        sb.append("res_addr").append("=").append(res_addr).append(",");
        sb.append("rcv_view_yn_nm").append("=").append(rcv_view_yn_nm).append(",");
        sb.append("use_date").append("=").append(use_date).append(",");
        sb.append("use_time").append("=").append(use_time).append(",");
        sb.append("snd_stat_nm").append("=").append(snd_stat_nm);
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
