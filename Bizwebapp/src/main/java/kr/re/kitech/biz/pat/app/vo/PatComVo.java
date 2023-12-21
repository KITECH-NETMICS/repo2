package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지식재산권 공통 Vo")
public class PatComVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatComVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "관리번호", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "발명자개인번호", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "공동출원유무", physicalName = "co_smitapp_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_smitapp_ex;

    @ElDtoField(logicalName = "상태", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "결재여부", physicalName = "app_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_yn;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public String getCo_smitapp_ex(){
        return co_smitapp_ex;
    }

    @ElVoField(physicalName = "co_smitapp_ex")
    public void setCo_smitapp_ex(String co_smitapp_ex){
        this.co_smitapp_ex = co_smitapp_ex;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "app_yn")
    public String getApp_yn(){
        return app_yn;
    }

    @ElVoField(physicalName = "app_yn")
    public void setApp_yn(String app_yn){
        this.app_yn = app_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatComVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("co_smitapp_ex").append("=").append(co_smitapp_ex).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("app_yn").append("=").append(app_yn);
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
