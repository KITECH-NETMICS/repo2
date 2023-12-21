package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학물질 Vo")
public class SfcChmclVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SfcChmclVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "space_cd", physicalName = "space_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String space_cd;

    @ElDtoField(logicalName = "물품 cd", physicalName = "prduct_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "항목 수량", physicalName = "item_qty", type = "double", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private double item_qty;

    @ElDtoField(logicalName = "항목 단위", physicalName = "item_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit;

    @ElDtoField(logicalName = "물질상태", physicalName = "prdu_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prdu_state;

    @ElDtoField(logicalName = "사용일자", physicalName = "use_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_daytm;

    @ElDtoField(logicalName = "사용신청번호", physicalName = "use_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_req_no;

    @ElDtoField(logicalName = "폐기상태값", physicalName = "disposal_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disposal_state;

    @ElDtoField(logicalName = "폐기상태값명", physicalName = "disposal_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String disposal_state_nm;

    @ElDtoField(logicalName = "반려사유", physicalName = "companion_rs", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String companion_rs;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "space_cd")
    public String getSpace_cd(){
        return space_cd;
    }

    @ElVoField(physicalName = "space_cd")
    public void setSpace_cd(String space_cd){
        this.space_cd = space_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public String getPrduct_cd(){
        return prduct_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public void setPrduct_cd(String prduct_cd){
        this.prduct_cd = prduct_cd;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "item_qty")
    public double getItem_qty(){
        return item_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public void setItem_qty(double item_qty){
        this.item_qty = item_qty;
    }

    @ElVoField(physicalName = "item_unit")
    public String getItem_unit(){
        return item_unit;
    }

    @ElVoField(physicalName = "item_unit")
    public void setItem_unit(String item_unit){
        this.item_unit = item_unit;
    }

    @ElVoField(physicalName = "prdu_state")
    public String getPrdu_state(){
        return prdu_state;
    }

    @ElVoField(physicalName = "prdu_state")
    public void setPrdu_state(String prdu_state){
        this.prdu_state = prdu_state;
    }

    @ElVoField(physicalName = "use_daytm")
    public String getUse_daytm(){
        return use_daytm;
    }

    @ElVoField(physicalName = "use_daytm")
    public void setUse_daytm(String use_daytm){
        this.use_daytm = use_daytm;
    }

    @ElVoField(physicalName = "use_req_no")
    public String getUse_req_no(){
        return use_req_no;
    }

    @ElVoField(physicalName = "use_req_no")
    public void setUse_req_no(String use_req_no){
        this.use_req_no = use_req_no;
    }

    @ElVoField(physicalName = "disposal_state")
    public String getDisposal_state(){
        return disposal_state;
    }

    @ElVoField(physicalName = "disposal_state")
    public void setDisposal_state(String disposal_state){
        this.disposal_state = disposal_state;
    }

    @ElVoField(physicalName = "disposal_state_nm")
    public String getDisposal_state_nm(){
        return disposal_state_nm;
    }

    @ElVoField(physicalName = "disposal_state_nm")
    public void setDisposal_state_nm(String disposal_state_nm){
        this.disposal_state_nm = disposal_state_nm;
    }

    @ElVoField(physicalName = "companion_rs")
    public String getCompanion_rs(){
        return companion_rs;
    }

    @ElVoField(physicalName = "companion_rs")
    public void setCompanion_rs(String companion_rs){
        this.companion_rs = companion_rs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SfcChmclVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("space_cd").append("=").append(space_cd).append(",");
        sb.append("prduct_cd").append("=").append(prduct_cd).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("item_qty").append("=").append(item_qty).append(",");
        sb.append("item_unit").append("=").append(item_unit).append(",");
        sb.append("prdu_state").append("=").append(prdu_state).append(",");
        sb.append("use_daytm").append("=").append(use_daytm).append(",");
        sb.append("use_req_no").append("=").append(use_req_no).append(",");
        sb.append("disposal_state").append("=").append(disposal_state).append(",");
        sb.append("disposal_state_nm").append("=").append(disposal_state_nm).append(",");
        sb.append("companion_rs").append("=").append(companion_rs);
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
