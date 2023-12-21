package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "화학물질 사전안전성검토 결재 Vo")
public class SfcChmDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SfcChmDetailVo(){
    }

    @ElDtoField(logicalName = "제품명", physicalName = "prduct_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_nm;

    @ElDtoField(logicalName = "제품코드", physicalName = "prduct_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd;

    @ElDtoField(logicalName = "혼합물여부", physicalName = "mixtr_mttr_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mixtr_mttr_cd;

    @ElDtoField(logicalName = "용량", physicalName = "cpcty_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cpcty_qty;

    @ElDtoField(logicalName = "수량", physicalName = "item_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_qty;

    @ElDtoField(logicalName = "item_unit_nm", physicalName = "item_unit_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_unit_nm;

    @ElDtoField(logicalName = "CAS 번호", physicalName = "cas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cas_no;

    @ElDtoField(logicalName = "specl_manage_mttr", physicalName = "specl_manage_mttr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String specl_manage_mttr;

    @ElDtoField(logicalName = "MSDS 링크", physicalName = "msds_url", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String msds_url;

    @ElDtoField(logicalName = "물질명(영문)", physicalName = "chmcls_nm_en", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_nm_en;

    @ElDtoField(logicalName = "연구실책임자", physicalName = "main_secrt_rspns_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_secrt_rspns_syspayno;

    @ElVoField(physicalName = "prduct_nm")
    public String getPrduct_nm(){
        return prduct_nm;
    }

    @ElVoField(physicalName = "prduct_nm")
    public void setPrduct_nm(String prduct_nm){
        this.prduct_nm = prduct_nm;
    }

    @ElVoField(physicalName = "prduct_cd")
    public String getPrduct_cd(){
        return prduct_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public void setPrduct_cd(String prduct_cd){
        this.prduct_cd = prduct_cd;
    }

    @ElVoField(physicalName = "mixtr_mttr_cd")
    public String getMixtr_mttr_cd(){
        return mixtr_mttr_cd;
    }

    @ElVoField(physicalName = "mixtr_mttr_cd")
    public void setMixtr_mttr_cd(String mixtr_mttr_cd){
        this.mixtr_mttr_cd = mixtr_mttr_cd;
    }

    @ElVoField(physicalName = "cpcty_qty")
    public String getCpcty_qty(){
        return cpcty_qty;
    }

    @ElVoField(physicalName = "cpcty_qty")
    public void setCpcty_qty(String cpcty_qty){
        this.cpcty_qty = cpcty_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public String getItem_qty(){
        return item_qty;
    }

    @ElVoField(physicalName = "item_qty")
    public void setItem_qty(String item_qty){
        this.item_qty = item_qty;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public String getItem_unit_nm(){
        return item_unit_nm;
    }

    @ElVoField(physicalName = "item_unit_nm")
    public void setItem_unit_nm(String item_unit_nm){
        this.item_unit_nm = item_unit_nm;
    }

    @ElVoField(physicalName = "cas_no")
    public String getCas_no(){
        return cas_no;
    }

    @ElVoField(physicalName = "cas_no")
    public void setCas_no(String cas_no){
        this.cas_no = cas_no;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public String getSpecl_manage_mttr(){
        return specl_manage_mttr;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public void setSpecl_manage_mttr(String specl_manage_mttr){
        this.specl_manage_mttr = specl_manage_mttr;
    }

    @ElVoField(physicalName = "msds_url")
    public String getMsds_url(){
        return msds_url;
    }

    @ElVoField(physicalName = "msds_url")
    public void setMsds_url(String msds_url){
        this.msds_url = msds_url;
    }

    @ElVoField(physicalName = "chmcls_nm_en")
    public String getChmcls_nm_en(){
        return chmcls_nm_en;
    }

    @ElVoField(physicalName = "chmcls_nm_en")
    public void setChmcls_nm_en(String chmcls_nm_en){
        this.chmcls_nm_en = chmcls_nm_en;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public String getMain_secrt_rspns_syspayno(){
        return main_secrt_rspns_syspayno;
    }

    @ElVoField(physicalName = "main_secrt_rspns_syspayno")
    public void setMain_secrt_rspns_syspayno(String main_secrt_rspns_syspayno){
        this.main_secrt_rspns_syspayno = main_secrt_rspns_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SfcChmDetailVo [");
        sb.append("prduct_nm").append("=").append(prduct_nm).append(",");
        sb.append("prduct_cd").append("=").append(prduct_cd).append(",");
        sb.append("mixtr_mttr_cd").append("=").append(mixtr_mttr_cd).append(",");
        sb.append("cpcty_qty").append("=").append(cpcty_qty).append(",");
        sb.append("item_qty").append("=").append(item_qty).append(",");
        sb.append("item_unit_nm").append("=").append(item_unit_nm).append(",");
        sb.append("cas_no").append("=").append(cas_no).append(",");
        sb.append("specl_manage_mttr").append("=").append(specl_manage_mttr).append(",");
        sb.append("msds_url").append("=").append(msds_url).append(",");
        sb.append("chmcls_nm_en").append("=").append(chmcls_nm_en).append(",");
        sb.append("main_secrt_rspns_syspayno").append("=").append(main_secrt_rspns_syspayno);
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
