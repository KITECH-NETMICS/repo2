package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장경로Vo")
public class CtrDomPathVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomPathVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "출발지", physicalName = "start_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region;

    @ElDtoField(logicalName = "도착지", physicalName = "arriv_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "숙박여부", physicalName = "lodg_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_yn;

    @ElDtoField(logicalName = "출발지명", physicalName = "start_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_region_nm;

    @ElDtoField(logicalName = "도착지명", physicalName = "arriv_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String arriv_region_nm;

    @ElDtoField(logicalName = "운임비", physicalName = "biztrip_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long biztrip_fee;

    @ElDtoField(logicalName = "직급구분", physicalName = "posi_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_clsf;

    @ElDtoField(logicalName = "숙박비상한액", physicalName = "lodg_fee_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long lodg_fee_max;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "start_region")
    public String getStart_region(){
        return start_region;
    }

    @ElVoField(physicalName = "start_region")
    public void setStart_region(String start_region){
        this.start_region = start_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public String getArriv_region(){
        return arriv_region;
    }

    @ElVoField(physicalName = "arriv_region")
    public void setArriv_region(String arriv_region){
        this.arriv_region = arriv_region;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "lodg_yn")
    public String getLodg_yn(){
        return lodg_yn;
    }

    @ElVoField(physicalName = "lodg_yn")
    public void setLodg_yn(String lodg_yn){
        this.lodg_yn = lodg_yn;
    }

    @ElVoField(physicalName = "start_region_nm")
    public String getStart_region_nm(){
        return start_region_nm;
    }

    @ElVoField(physicalName = "start_region_nm")
    public void setStart_region_nm(String start_region_nm){
        this.start_region_nm = start_region_nm;
    }

    @ElVoField(physicalName = "arriv_region_nm")
    public String getArriv_region_nm(){
        return arriv_region_nm;
    }

    @ElVoField(physicalName = "arriv_region_nm")
    public void setArriv_region_nm(String arriv_region_nm){
        this.arriv_region_nm = arriv_region_nm;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public long getBiztrip_fee(){
        return biztrip_fee;
    }

    @ElVoField(physicalName = "biztrip_fee")
    public void setBiztrip_fee(long biztrip_fee){
        this.biztrip_fee = biztrip_fee;
    }

    @ElVoField(physicalName = "posi_clsf")
    public String getPosi_clsf(){
        return posi_clsf;
    }

    @ElVoField(physicalName = "posi_clsf")
    public void setPosi_clsf(String posi_clsf){
        this.posi_clsf = posi_clsf;
    }

    @ElVoField(physicalName = "lodg_fee_max")
    public long getLodg_fee_max(){
        return lodg_fee_max;
    }

    @ElVoField(physicalName = "lodg_fee_max")
    public void setLodg_fee_max(long lodg_fee_max){
        this.lodg_fee_max = lodg_fee_max;
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
        sb.append("CtrDomPathVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("start_region").append("=").append(start_region).append(",");
        sb.append("arriv_region").append("=").append(arriv_region).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("lodg_yn").append("=").append(lodg_yn).append(",");
        sb.append("start_region_nm").append("=").append(start_region_nm).append(",");
        sb.append("arriv_region_nm").append("=").append(arriv_region_nm).append(",");
        sb.append("biztrip_fee").append("=").append(biztrip_fee).append(",");
        sb.append("posi_clsf").append("=").append(posi_clsf).append(",");
        sb.append("lodg_fee_max").append("=").append(lodg_fee_max).append(",");
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
