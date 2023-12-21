package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "제우스 장비예약상세정보 확인 VO")
public class SptZeusResvDtlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptZeusResvDtlVo(){
    }

    @ElDtoField(logicalName = "예약번호", physicalName = "resvno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvno;

    @ElDtoField(logicalName = "accCode", physicalName = "acccode", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acccode;

    @ElDtoField(logicalName = "resvlaststatcd", physicalName = "resvlaststatcd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvlaststatcd;

    @ElDtoField(logicalName = "취소사유", physicalName = "cancelreason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancelreason;

    @ElDtoField(logicalName = "resvstartdt", physicalName = "resvstartdt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvstartdt;

    @ElDtoField(logicalName = "resvstarthour", physicalName = "resvstarthour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvstarthour;

    @ElDtoField(logicalName = "resvstartmin", physicalName = "resvstartmin", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvstartmin;

    @ElDtoField(logicalName = "resvenddt", physicalName = "resvenddt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvenddt;

    @ElDtoField(logicalName = "resvendhour", physicalName = "resvendhour", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvendhour;

    @ElDtoField(logicalName = "resvendmin", physicalName = "resvendmin", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvendmin;

    @ElDtoField(logicalName = "제우스에보낼상태", physicalName = "postreserveflag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postreserveflag;

    @ElDtoField(logicalName = "예약금액", physicalName = "resvfinalprice", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvfinalprice;

    @ElVoField(physicalName = "resvno")
    public String getResvno(){
        return resvno;
    }

    @ElVoField(physicalName = "resvno")
    public void setResvno(String resvno){
        this.resvno = resvno;
    }

    @ElVoField(physicalName = "acccode")
    public String getAcccode(){
        return acccode;
    }

    @ElVoField(physicalName = "acccode")
    public void setAcccode(String acccode){
        this.acccode = acccode;
    }

    @ElVoField(physicalName = "resvlaststatcd")
    public String getResvlaststatcd(){
        return resvlaststatcd;
    }

    @ElVoField(physicalName = "resvlaststatcd")
    public void setResvlaststatcd(String resvlaststatcd){
        this.resvlaststatcd = resvlaststatcd;
    }

    @ElVoField(physicalName = "cancelreason")
    public String getCancelreason(){
        return cancelreason;
    }

    @ElVoField(physicalName = "cancelreason")
    public void setCancelreason(String cancelreason){
        this.cancelreason = cancelreason;
    }

    @ElVoField(physicalName = "resvstartdt")
    public String getResvstartdt(){
        return resvstartdt;
    }

    @ElVoField(physicalName = "resvstartdt")
    public void setResvstartdt(String resvstartdt){
        this.resvstartdt = resvstartdt;
    }

    @ElVoField(physicalName = "resvstarthour")
    public String getResvstarthour(){
        return resvstarthour;
    }

    @ElVoField(physicalName = "resvstarthour")
    public void setResvstarthour(String resvstarthour){
        this.resvstarthour = resvstarthour;
    }

    @ElVoField(physicalName = "resvstartmin")
    public String getResvstartmin(){
        return resvstartmin;
    }

    @ElVoField(physicalName = "resvstartmin")
    public void setResvstartmin(String resvstartmin){
        this.resvstartmin = resvstartmin;
    }

    @ElVoField(physicalName = "resvenddt")
    public String getResvenddt(){
        return resvenddt;
    }

    @ElVoField(physicalName = "resvenddt")
    public void setResvenddt(String resvenddt){
        this.resvenddt = resvenddt;
    }

    @ElVoField(physicalName = "resvendhour")
    public String getResvendhour(){
        return resvendhour;
    }

    @ElVoField(physicalName = "resvendhour")
    public void setResvendhour(String resvendhour){
        this.resvendhour = resvendhour;
    }

    @ElVoField(physicalName = "resvendmin")
    public String getResvendmin(){
        return resvendmin;
    }

    @ElVoField(physicalName = "resvendmin")
    public void setResvendmin(String resvendmin){
        this.resvendmin = resvendmin;
    }

    @ElVoField(physicalName = "postreserveflag")
    public String getPostreserveflag(){
        return postreserveflag;
    }

    @ElVoField(physicalName = "postreserveflag")
    public void setPostreserveflag(String postreserveflag){
        this.postreserveflag = postreserveflag;
    }

    @ElVoField(physicalName = "resvfinalprice")
    public String getResvfinalprice(){
        return resvfinalprice;
    }

    @ElVoField(physicalName = "resvfinalprice")
    public void setResvfinalprice(String resvfinalprice){
        this.resvfinalprice = resvfinalprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptZeusResvDtlVo [");
        sb.append("resvno").append("=").append(resvno).append(",");
        sb.append("acccode").append("=").append(acccode).append(",");
        sb.append("resvlaststatcd").append("=").append(resvlaststatcd).append(",");
        sb.append("cancelreason").append("=").append(cancelreason).append(",");
        sb.append("resvstartdt").append("=").append(resvstartdt).append(",");
        sb.append("resvstarthour").append("=").append(resvstarthour).append(",");
        sb.append("resvstartmin").append("=").append(resvstartmin).append(",");
        sb.append("resvenddt").append("=").append(resvenddt).append(",");
        sb.append("resvendhour").append("=").append(resvendhour).append(",");
        sb.append("resvendmin").append("=").append(resvendmin).append(",");
        sb.append("postreserveflag").append("=").append(postreserveflag).append(",");
        sb.append("resvfinalprice").append("=").append(resvfinalprice);
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
