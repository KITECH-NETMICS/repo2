package kr.re.kitech.biz.sup.tlt.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SptTltDepstItemExp")
public class SptTltDepstItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTltDepstItemVo(){
    }

    @ElDtoField(logicalName = "입금관리번호", physicalName = "depst_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_mngmt_no;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "직위", physicalName = "posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi;

    @ElDtoField(logicalName = "파견현황", physicalName = "send_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String send_clsf;

    @ElDtoField(logicalName = "파견계약기간", physicalName = "dispatch_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_term;

    @ElDtoField(logicalName = "년차", physicalName = "posi_an", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_an;

    @ElDtoField(logicalName = "파견계약(시작일)", physicalName = "dispatch_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_start_ymd;

    @ElDtoField(logicalName = "파견계약(종료일)", physicalName = "dispatch_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dispatch_cls_ymd;

    @ElDtoField(logicalName = "급여지급(시작일)", physicalName = "salry_start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_start_ymd;

    @ElDtoField(logicalName = "급여지급(종료일)", physicalName = "salry_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String salry_cls_ymd;

    @ElDtoField(logicalName = "입금예정금액", physicalName = "depst_schdl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_schdl_amt;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "depst_mngmt_no")
    public String getDepst_mngmt_no(){
        return depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public void setDepst_mngmt_no(String depst_mngmt_no){
        this.depst_mngmt_no = depst_mngmt_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "posi")
    public String getPosi(){
        return posi;
    }

    @ElVoField(physicalName = "posi")
    public void setPosi(String posi){
        this.posi = posi;
    }

    @ElVoField(physicalName = "send_clsf")
    public String getSend_clsf(){
        return send_clsf;
    }

    @ElVoField(physicalName = "send_clsf")
    public void setSend_clsf(String send_clsf){
        this.send_clsf = send_clsf;
    }

    @ElVoField(physicalName = "dispatch_term")
    public String getDispatch_term(){
        return dispatch_term;
    }

    @ElVoField(physicalName = "dispatch_term")
    public void setDispatch_term(String dispatch_term){
        this.dispatch_term = dispatch_term;
    }

    @ElVoField(physicalName = "posi_an")
    public String getPosi_an(){
        return posi_an;
    }

    @ElVoField(physicalName = "posi_an")
    public void setPosi_an(String posi_an){
        this.posi_an = posi_an;
    }

    @ElVoField(physicalName = "dispatch_start_ymd")
    public String getDispatch_start_ymd(){
        return dispatch_start_ymd;
    }

    @ElVoField(physicalName = "dispatch_start_ymd")
    public void setDispatch_start_ymd(String dispatch_start_ymd){
        this.dispatch_start_ymd = dispatch_start_ymd;
    }

    @ElVoField(physicalName = "dispatch_cls_ymd")
    public String getDispatch_cls_ymd(){
        return dispatch_cls_ymd;
    }

    @ElVoField(physicalName = "dispatch_cls_ymd")
    public void setDispatch_cls_ymd(String dispatch_cls_ymd){
        this.dispatch_cls_ymd = dispatch_cls_ymd;
    }

    @ElVoField(physicalName = "salry_start_ymd")
    public String getSalry_start_ymd(){
        return salry_start_ymd;
    }

    @ElVoField(physicalName = "salry_start_ymd")
    public void setSalry_start_ymd(String salry_start_ymd){
        this.salry_start_ymd = salry_start_ymd;
    }

    @ElVoField(physicalName = "salry_cls_ymd")
    public String getSalry_cls_ymd(){
        return salry_cls_ymd;
    }

    @ElVoField(physicalName = "salry_cls_ymd")
    public void setSalry_cls_ymd(String salry_cls_ymd){
        this.salry_cls_ymd = salry_cls_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public String getDepst_schdl_amt(){
        return depst_schdl_amt;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public void setDepst_schdl_amt(String depst_schdl_amt){
        this.depst_schdl_amt = depst_schdl_amt;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTltDepstItemVo [");
        sb.append("depst_mngmt_no").append("=").append(depst_mngmt_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("posi").append("=").append(posi).append(",");
        sb.append("send_clsf").append("=").append(send_clsf).append(",");
        sb.append("dispatch_term").append("=").append(dispatch_term).append(",");
        sb.append("posi_an").append("=").append(posi_an).append(",");
        sb.append("dispatch_start_ymd").append("=").append(dispatch_start_ymd).append(",");
        sb.append("dispatch_cls_ymd").append("=").append(dispatch_cls_ymd).append(",");
        sb.append("salry_start_ymd").append("=").append(salry_start_ymd).append(",");
        sb.append("salry_cls_ymd").append("=").append(salry_cls_ymd).append(",");
        sb.append("depst_schdl_amt").append("=").append(depst_schdl_amt).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
