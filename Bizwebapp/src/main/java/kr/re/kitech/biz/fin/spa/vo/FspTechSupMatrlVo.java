package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspTechSupMatrlExp")
public class FspTechSupMatrlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspTechSupMatrlVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqOdr", physicalName = "req_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_odr;

    @ElDtoField(logicalName = "matrlNm", physicalName = "matrl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String matrl_nm;

    @ElDtoField(logicalName = "matrlStd", physicalName = "matrl_std", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String matrl_std;

    @ElDtoField(logicalName = "unitPrice", physicalName = "unit_price", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit_price;

    @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_odr")
    public int getReq_odr(){
        return req_odr;
    }

    @ElVoField(physicalName = "req_odr")
    public void setReq_odr(int req_odr){
        this.req_odr = req_odr;
    }

    @ElVoField(physicalName = "matrl_nm")
    public String getMatrl_nm(){
        return matrl_nm;
    }

    @ElVoField(physicalName = "matrl_nm")
    public void setMatrl_nm(String matrl_nm){
        this.matrl_nm = matrl_nm;
    }

    @ElVoField(physicalName = "matrl_std")
    public String getMatrl_std(){
        return matrl_std;
    }

    @ElVoField(physicalName = "matrl_std")
    public void setMatrl_std(String matrl_std){
        this.matrl_std = matrl_std;
    }

    @ElVoField(physicalName = "unit_price")
    public String getUnit_price(){
        return unit_price;
    }

    @ElVoField(physicalName = "unit_price")
    public void setUnit_price(String unit_price){
        this.unit_price = unit_price;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspTechSupMatrlVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_odr").append("=").append(req_odr).append(",");
        sb.append("matrl_nm").append("=").append(matrl_nm).append(",");
        sb.append("matrl_std").append("=").append(matrl_std).append(",");
        sb.append("unit_price").append("=").append(unit_price).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("rmk").append("=").append(rmk);
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
