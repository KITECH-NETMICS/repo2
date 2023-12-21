package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결재 사용자 검색")
public class ElecappinfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ElecappinfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "결재타입", physicalName = "apprvl_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apprvl_clsf;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private int odr;

    @ElDtoField(logicalName = "직무명", physicalName = "roll_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String roll_nm;

    @ElDtoField(logicalName = "apprvl_shape", physicalName = "apprvl_shape", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apprvl_shape;

    @ElDtoField(logicalName = "완료시간", physicalName = "complt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String complt_daytm;

    @ElDtoField(logicalName = "서명URL", physicalName = "sign_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String sign_info;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "apprvl_clsf")
    public String getApprvl_clsf(){
        String ret = this.apprvl_clsf;
        return ret;
    }

    @ElVoField(physicalName = "apprvl_clsf")
    public void setApprvl_clsf(String apprvl_clsf){
        this.apprvl_clsf = apprvl_clsf;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "roll_nm")
    public String getRoll_nm(){
        String ret = this.roll_nm;
        return ret;
    }

    @ElVoField(physicalName = "roll_nm")
    public void setRoll_nm(String roll_nm){
        this.roll_nm = roll_nm;
    }

    @ElVoField(physicalName = "apprvl_shape")
    public String getApprvl_shape(){
        String ret = this.apprvl_shape;
        return ret;
    }

    @ElVoField(physicalName = "apprvl_shape")
    public void setApprvl_shape(String apprvl_shape){
        this.apprvl_shape = apprvl_shape;
    }

    @ElVoField(physicalName = "complt_daytm")
    public String getComplt_daytm(){
        String ret = this.complt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "complt_daytm")
    public void setComplt_daytm(String complt_daytm){
        this.complt_daytm = complt_daytm;
    }

    @ElVoField(physicalName = "sign_info")
    public String getSign_info(){
        String ret = this.sign_info;
        return ret;
    }

    @ElVoField(physicalName = "sign_info")
    public void setSign_info(String sign_info){
        this.sign_info = sign_info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ElecappinfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("apprvl_clsf").append("=").append(apprvl_clsf).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("roll_nm").append("=").append(roll_nm).append(",");
        sb.append("apprvl_shape").append("=").append(apprvl_shape).append(",");
        sb.append("complt_daytm").append("=").append(complt_daytm).append(",");
        sb.append("sign_info").append("=").append(sign_info);
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
