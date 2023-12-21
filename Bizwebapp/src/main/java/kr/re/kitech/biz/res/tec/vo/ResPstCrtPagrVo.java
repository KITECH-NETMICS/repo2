package kr.re.kitech.biz.res.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술이전 협약정보 Vo")
public class ResPstCrtPagrVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResPstCrtPagrVo(){
    }

    @ElDtoField(logicalName = "기술료번호", physicalName = "tech_fee_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_fee_no;

    @ElDtoField(logicalName = "기술료협약순번", physicalName = "tech_fee_mou_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int tech_fee_mou_odr;

    @ElDtoField(logicalName = "협약대상업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "협약대상업체명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "협약금액", physicalName = "fxd_tech_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fxd_tech_fee;

    @ElDtoField(logicalName = "협약금액 공급가액", physicalName = "fxd_tech_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fxd_tech_suply_value;

    @ElDtoField(logicalName = "협약금액 부가세", physicalName = "fxd_tech_tax_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long fxd_tech_tax_fee;

    @ElDtoField(logicalName = "선급금", physicalName = "advnc_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long advnc_fee;

    @ElDtoField(logicalName = "선급금 공급가액", physicalName = "advnc_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long advnc_suply_value;

    @ElDtoField(logicalName = "선급금 부가세", physicalName = "advnc_tax_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long advnc_tax_fee;

    @ElDtoField(logicalName = "대표성명", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElVoField(physicalName = "tech_fee_no")
    public String getTech_fee_no(){
        return tech_fee_no;
    }

    @ElVoField(physicalName = "tech_fee_no")
    public void setTech_fee_no(String tech_fee_no){
        this.tech_fee_no = tech_fee_no;
    }

    @ElVoField(physicalName = "tech_fee_mou_odr")
    public int getTech_fee_mou_odr(){
        return tech_fee_mou_odr;
    }

    @ElVoField(physicalName = "tech_fee_mou_odr")
    public void setTech_fee_mou_odr(int tech_fee_mou_odr){
        this.tech_fee_mou_odr = tech_fee_mou_odr;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "fxd_tech_fee")
    public long getFxd_tech_fee(){
        return fxd_tech_fee;
    }

    @ElVoField(physicalName = "fxd_tech_fee")
    public void setFxd_tech_fee(long fxd_tech_fee){
        this.fxd_tech_fee = fxd_tech_fee;
    }

    @ElVoField(physicalName = "fxd_tech_suply_value")
    public long getFxd_tech_suply_value(){
        return fxd_tech_suply_value;
    }

    @ElVoField(physicalName = "fxd_tech_suply_value")
    public void setFxd_tech_suply_value(long fxd_tech_suply_value){
        this.fxd_tech_suply_value = fxd_tech_suply_value;
    }

    @ElVoField(physicalName = "fxd_tech_tax_fee")
    public long getFxd_tech_tax_fee(){
        return fxd_tech_tax_fee;
    }

    @ElVoField(physicalName = "fxd_tech_tax_fee")
    public void setFxd_tech_tax_fee(long fxd_tech_tax_fee){
        this.fxd_tech_tax_fee = fxd_tech_tax_fee;
    }

    @ElVoField(physicalName = "advnc_fee")
    public long getAdvnc_fee(){
        return advnc_fee;
    }

    @ElVoField(physicalName = "advnc_fee")
    public void setAdvnc_fee(long advnc_fee){
        this.advnc_fee = advnc_fee;
    }

    @ElVoField(physicalName = "advnc_suply_value")
    public long getAdvnc_suply_value(){
        return advnc_suply_value;
    }

    @ElVoField(physicalName = "advnc_suply_value")
    public void setAdvnc_suply_value(long advnc_suply_value){
        this.advnc_suply_value = advnc_suply_value;
    }

    @ElVoField(physicalName = "advnc_tax_fee")
    public long getAdvnc_tax_fee(){
        return advnc_tax_fee;
    }

    @ElVoField(physicalName = "advnc_tax_fee")
    public void setAdvnc_tax_fee(long advnc_tax_fee){
        this.advnc_tax_fee = advnc_tax_fee;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResPstCrtPagrVo [");
        sb.append("tech_fee_no").append("=").append(tech_fee_no).append(",");
        sb.append("tech_fee_mou_odr").append("=").append(tech_fee_mou_odr).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("fxd_tech_fee").append("=").append(fxd_tech_fee).append(",");
        sb.append("fxd_tech_suply_value").append("=").append(fxd_tech_suply_value).append(",");
        sb.append("fxd_tech_tax_fee").append("=").append(fxd_tech_tax_fee).append(",");
        sb.append("advnc_fee").append("=").append(advnc_fee).append(",");
        sb.append("advnc_suply_value").append("=").append(advnc_suply_value).append(",");
        sb.append("advnc_tax_fee").append("=").append(advnc_tax_fee).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm);
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
