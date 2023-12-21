package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FbaItmBaseExp")
public class FbaItmBaseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaItmBaseVo(){
    }

    @ElDtoField(logicalName = "재무사업구분", physicalName = "fin_bsns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fin_bsns_clsf;

    @ElDtoField(logicalName = "비목해소기준명", physicalName = "itm_solve_base_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base_nm;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "시행일자", physicalName = "impl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impl_ymd;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "기관코드", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "기관", physicalName = "ofname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofname;

    @ElVoField(physicalName = "fin_bsns_clsf")
    public String getFin_bsns_clsf(){
        return fin_bsns_clsf;
    }

    @ElVoField(physicalName = "fin_bsns_clsf")
    public void setFin_bsns_clsf(String fin_bsns_clsf){
        this.fin_bsns_clsf = fin_bsns_clsf;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public String getItm_solve_base_nm(){
        return itm_solve_base_nm;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public void setItm_solve_base_nm(String itm_solve_base_nm){
        this.itm_solve_base_nm = itm_solve_base_nm;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "impl_ymd")
    public String getImpl_ymd(){
        return impl_ymd;
    }

    @ElVoField(physicalName = "impl_ymd")
    public void setImpl_ymd(String impl_ymd){
        this.impl_ymd = impl_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "ofname")
    public String getOfname(){
        return ofname;
    }

    @ElVoField(physicalName = "ofname")
    public void setOfname(String ofname){
        this.ofname = ofname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaItmBaseVo [");
        sb.append("fin_bsns_clsf").append("=").append(fin_bsns_clsf).append(",");
        sb.append("itm_solve_base_nm").append("=").append(itm_solve_base_nm).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("impl_ymd").append("=").append(impl_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("ofname").append("=").append(ofname);
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
