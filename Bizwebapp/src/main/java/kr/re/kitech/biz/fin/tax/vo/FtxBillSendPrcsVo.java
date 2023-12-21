package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자계산서 발송현황 Vo")
public class FtxBillSendPrcsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FtxBillSendPrcsVo(){
    }

    @ElDtoField(logicalName = "공급받는자 이메일1", physicalName = "buyr_chrg_email1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email1;

    @ElDtoField(logicalName = "공급받는자 이메일2", physicalName = "buyr_chrg_email2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_chrg_email2;

    @ElDtoField(logicalName = "담당자확인구분", physicalName = "rcv_view_yn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcv_view_yn_nm;

    @ElDtoField(logicalName = "전송일자", physicalName = "use_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_date;

    @ElDtoField(logicalName = "전송시간", physicalName = "use_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_time;

    @ElDtoField(logicalName = "전송상태", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "전송메세지", physicalName = "err_msg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String err_msg;

    @ElVoField(physicalName = "buyr_chrg_email1")
    public String getBuyr_chrg_email1(){
        return buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email1")
    public void setBuyr_chrg_email1(String buyr_chrg_email1){
        this.buyr_chrg_email1 = buyr_chrg_email1;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public String getBuyr_chrg_email2(){
        return buyr_chrg_email2;
    }

    @ElVoField(physicalName = "buyr_chrg_email2")
    public void setBuyr_chrg_email2(String buyr_chrg_email2){
        this.buyr_chrg_email2 = buyr_chrg_email2;
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

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "err_msg")
    public String getErr_msg(){
        return err_msg;
    }

    @ElVoField(physicalName = "err_msg")
    public void setErr_msg(String err_msg){
        this.err_msg = err_msg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FtxBillSendPrcsVo [");
        sb.append("buyr_chrg_email1").append("=").append(buyr_chrg_email1).append(",");
        sb.append("buyr_chrg_email2").append("=").append(buyr_chrg_email2).append(",");
        sb.append("rcv_view_yn_nm").append("=").append(rcv_view_yn_nm).append(",");
        sb.append("use_date").append("=").append(use_date).append(",");
        sb.append("use_time").append("=").append(use_time).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("err_msg").append("=").append(err_msg);
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
