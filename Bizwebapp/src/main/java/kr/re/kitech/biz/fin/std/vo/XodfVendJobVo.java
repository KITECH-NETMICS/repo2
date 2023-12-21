package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "거래처담당자 Vo")
public class XodfVendJobVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XodfVendJobVo(){
    }

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "담당자구분", physicalName = "charg_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_clsf;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "담당자성명", physicalName = "charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg;

    @ElDtoField(logicalName = "담당자직급", physicalName = "charg_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_posi_nm;

    @ElDtoField(logicalName = "담당자소속명", physicalName = "charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_nm;

    @ElDtoField(logicalName = "담당자연락처", physicalName = "charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_tel;

    @ElDtoField(logicalName = "담당자모바일", physicalName = "charg_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_mobile;

    @ElDtoField(logicalName = "담당자이메일", physicalName = "charg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_email;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "charg_clsf")
    public String getCharg_clsf(){
        return charg_clsf;
    }

    @ElVoField(physicalName = "charg_clsf")
    public void setCharg_clsf(String charg_clsf){
        this.charg_clsf = charg_clsf;
    }

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "charg")
    public String getCharg(){
        return charg;
    }

    @ElVoField(physicalName = "charg")
    public void setCharg(String charg){
        this.charg = charg;
    }

    @ElVoField(physicalName = "charg_posi_nm")
    public String getCharg_posi_nm(){
        return charg_posi_nm;
    }

    @ElVoField(physicalName = "charg_posi_nm")
    public void setCharg_posi_nm(String charg_posi_nm){
        this.charg_posi_nm = charg_posi_nm;
    }

    @ElVoField(physicalName = "charg_dept_nm")
    public String getCharg_dept_nm(){
        return charg_dept_nm;
    }

    @ElVoField(physicalName = "charg_dept_nm")
    public void setCharg_dept_nm(String charg_dept_nm){
        this.charg_dept_nm = charg_dept_nm;
    }

    @ElVoField(physicalName = "charg_tel")
    public String getCharg_tel(){
        return charg_tel;
    }

    @ElVoField(physicalName = "charg_tel")
    public void setCharg_tel(String charg_tel){
        this.charg_tel = charg_tel;
    }

    @ElVoField(physicalName = "charg_mobile")
    public String getCharg_mobile(){
        return charg_mobile;
    }

    @ElVoField(physicalName = "charg_mobile")
    public void setCharg_mobile(String charg_mobile){
        this.charg_mobile = charg_mobile;
    }

    @ElVoField(physicalName = "charg_email")
    public String getCharg_email(){
        return charg_email;
    }

    @ElVoField(physicalName = "charg_email")
    public void setCharg_email(String charg_email){
        this.charg_email = charg_email;
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
        sb.append("XodfVendJobVo [");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("charg_clsf").append("=").append(charg_clsf).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("charg").append("=").append(charg).append(",");
        sb.append("charg_posi_nm").append("=").append(charg_posi_nm).append(",");
        sb.append("charg_dept_nm").append("=").append(charg_dept_nm).append(",");
        sb.append("charg_tel").append("=").append(charg_tel).append(",");
        sb.append("charg_mobile").append("=").append(charg_mobile).append(",");
        sb.append("charg_email").append("=").append(charg_email).append(",");
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
