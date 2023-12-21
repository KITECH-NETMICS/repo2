package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서관리항목 VO")
public class FspSlipMngmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipMngmtVo(){
    }

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "관리항목코드", physicalName = "mngmt_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자 필수")
    private String mngmt_item_cd;

    @ElDtoField(logicalName = "관리항목이름", physicalName = "mngmt_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm;

    @ElDtoField(logicalName = "관리상세코드", physicalName = "mngmt_detls_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd;

    @ElDtoField(logicalName = "관리상세명", physicalName = "mngmt_detls_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_nm;

    @ElDtoField(logicalName = "필수여부", physicalName = "essen_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자 필수")
    private String essen_ex;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자 필수(C,U,D)")
    private String cud_type;

    @ElDtoField(logicalName = "자료형식", physicalName = "data_form", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_form;

    @ElDtoField(logicalName = "수정가능여부", physicalName = "updt_possbl_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_possbl_yn;

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public String getMngmt_item_cd(){
        return mngmt_item_cd;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public void setMngmt_item_cd(String mngmt_item_cd){
        this.mngmt_item_cd = mngmt_item_cd;
    }

    @ElVoField(physicalName = "mngmt_item_nm")
    public String getMngmt_item_nm(){
        return mngmt_item_nm;
    }

    @ElVoField(physicalName = "mngmt_item_nm")
    public void setMngmt_item_nm(String mngmt_item_nm){
        this.mngmt_item_nm = mngmt_item_nm;
    }

    @ElVoField(physicalName = "mngmt_detls_cd")
    public String getMngmt_detls_cd(){
        return mngmt_detls_cd;
    }

    @ElVoField(physicalName = "mngmt_detls_cd")
    public void setMngmt_detls_cd(String mngmt_detls_cd){
        this.mngmt_detls_cd = mngmt_detls_cd;
    }

    @ElVoField(physicalName = "mngmt_detls_nm")
    public String getMngmt_detls_nm(){
        return mngmt_detls_nm;
    }

    @ElVoField(physicalName = "mngmt_detls_nm")
    public void setMngmt_detls_nm(String mngmt_detls_nm){
        this.mngmt_detls_nm = mngmt_detls_nm;
    }

    @ElVoField(physicalName = "essen_ex")
    public String getEssen_ex(){
        return essen_ex;
    }

    @ElVoField(physicalName = "essen_ex")
    public void setEssen_ex(String essen_ex){
        this.essen_ex = essen_ex;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "data_form")
    public String getData_form(){
        return data_form;
    }

    @ElVoField(physicalName = "data_form")
    public void setData_form(String data_form){
        this.data_form = data_form;
    }

    @ElVoField(physicalName = "updt_possbl_yn")
    public String getUpdt_possbl_yn(){
        return updt_possbl_yn;
    }

    @ElVoField(physicalName = "updt_possbl_yn")
    public void setUpdt_possbl_yn(String updt_possbl_yn){
        this.updt_possbl_yn = updt_possbl_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipMngmtVo [");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("mngmt_item_cd").append("=").append(mngmt_item_cd).append(",");
        sb.append("mngmt_item_nm").append("=").append(mngmt_item_nm).append(",");
        sb.append("mngmt_detls_cd").append("=").append(mngmt_detls_cd).append(",");
        sb.append("mngmt_detls_nm").append("=").append(mngmt_detls_nm).append(",");
        sb.append("essen_ex").append("=").append(essen_ex).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("data_form").append("=").append(data_form).append(",");
        sb.append("updt_possbl_yn").append("=").append(updt_possbl_yn);
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
