package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "품목코드Vo")
public class ProdItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ProdItemVo(){
    }

    @ElDtoField(logicalName = "품목코드", physicalName = "item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_cd;

    @ElDtoField(logicalName = "품목단계", physicalName = "item_level", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_level;

    @ElDtoField(logicalName = "품목명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "품목영문명", physicalName = "item_eng_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_eng_nm;

    @ElDtoField(logicalName = "품목구분명", physicalName = "item_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf;

    @ElDtoField(logicalName = "품목상위코드", physicalName = "item_upper_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_upper_cd;

    @ElDtoField(logicalName = "상세설명", physicalName = "item_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_rmk;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "사용여부", physicalName = "usg_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_yn;

    @ElDtoField(logicalName = "하위단계여부", physicalName = "item_dept_end", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_dept_end;

    @ElDtoField(logicalName = "중기간경쟁제품여부", physicalName = "cntst_prod_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cntst_prod_yn;

    @ElVoField(physicalName = "item_cd")
    public String getItem_cd(){
        return item_cd;
    }

    @ElVoField(physicalName = "item_cd")
    public void setItem_cd(String item_cd){
        this.item_cd = item_cd;
    }

    @ElVoField(physicalName = "item_level")
    public String getItem_level(){
        return item_level;
    }

    @ElVoField(physicalName = "item_level")
    public void setItem_level(String item_level){
        this.item_level = item_level;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "item_eng_nm")
    public String getItem_eng_nm(){
        return item_eng_nm;
    }

    @ElVoField(physicalName = "item_eng_nm")
    public void setItem_eng_nm(String item_eng_nm){
        this.item_eng_nm = item_eng_nm;
    }

    @ElVoField(physicalName = "item_clsf")
    public String getItem_clsf(){
        return item_clsf;
    }

    @ElVoField(physicalName = "item_clsf")
    public void setItem_clsf(String item_clsf){
        this.item_clsf = item_clsf;
    }

    @ElVoField(physicalName = "item_upper_cd")
    public String getItem_upper_cd(){
        return item_upper_cd;
    }

    @ElVoField(physicalName = "item_upper_cd")
    public void setItem_upper_cd(String item_upper_cd){
        this.item_upper_cd = item_upper_cd;
    }

    @ElVoField(physicalName = "item_rmk")
    public String getItem_rmk(){
        return item_rmk;
    }

    @ElVoField(physicalName = "item_rmk")
    public void setItem_rmk(String item_rmk){
        this.item_rmk = item_rmk;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "usg_yn")
    public String getUsg_yn(){
        return usg_yn;
    }

    @ElVoField(physicalName = "usg_yn")
    public void setUsg_yn(String usg_yn){
        this.usg_yn = usg_yn;
    }

    @ElVoField(physicalName = "item_dept_end")
    public String getItem_dept_end(){
        return item_dept_end;
    }

    @ElVoField(physicalName = "item_dept_end")
    public void setItem_dept_end(String item_dept_end){
        this.item_dept_end = item_dept_end;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public String getCntst_prod_yn(){
        return cntst_prod_yn;
    }

    @ElVoField(physicalName = "cntst_prod_yn")
    public void setCntst_prod_yn(String cntst_prod_yn){
        this.cntst_prod_yn = cntst_prod_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProdItemVo [");
        sb.append("item_cd").append("=").append(item_cd).append(",");
        sb.append("item_level").append("=").append(item_level).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("item_eng_nm").append("=").append(item_eng_nm).append(",");
        sb.append("item_clsf").append("=").append(item_clsf).append(",");
        sb.append("item_upper_cd").append("=").append(item_upper_cd).append(",");
        sb.append("item_rmk").append("=").append(item_rmk).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("usg_yn").append("=").append(usg_yn).append(",");
        sb.append("item_dept_end").append("=").append(item_dept_end).append(",");
        sb.append("cntst_prod_yn").append("=").append(cntst_prod_yn);
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
