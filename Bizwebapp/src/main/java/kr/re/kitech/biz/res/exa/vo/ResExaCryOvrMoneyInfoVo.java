package kr.re.kitech.biz.res.exa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "이월연구비정보")
public class ResExaCryOvrMoneyInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResExaCryOvrMoneyInfoVo(){
    }

    @ElDtoField(logicalName = "accnt_no", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "prj_no", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "crmt_use_apv_lim_amt", physicalName = "crmt_use_apv_lim_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crmt_use_apv_lim_amt;

    @ElDtoField(logicalName = "crmt_exec_amt", physicalName = "crmt_exec_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crmt_exec_amt;

    @ElDtoField(logicalName = "crmt_bal", physicalName = "crmt_bal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String crmt_bal;

    @ElDtoField(logicalName = "use_apv_cash_lim_amt", physicalName = "use_apv_cash_lim_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_apv_cash_lim_amt;

    @ElDtoField(logicalName = "exctn_exec_amt", physicalName = "exctn_exec_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exctn_exec_amt;

    @ElDtoField(logicalName = "apv_bal", physicalName = "apv_bal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apv_bal;

    @ElDtoField(logicalName = "bmname", physicalName = "bmname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bmname;

    @ElDtoField(logicalName = "bfyrcrovamt", physicalName = "bfyrcrovamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfyrcrovamt;

    @ElDtoField(logicalName = "plcsamt", physicalName = "plcsamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plcsamt;

    @ElDtoField(logicalName = "plthamt", physicalName = "plthamt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String plthamt;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "crmt_use_apv_lim_amt")
    public String getCrmt_use_apv_lim_amt(){
        return crmt_use_apv_lim_amt;
    }

    @ElVoField(physicalName = "crmt_use_apv_lim_amt")
    public void setCrmt_use_apv_lim_amt(String crmt_use_apv_lim_amt){
        this.crmt_use_apv_lim_amt = crmt_use_apv_lim_amt;
    }

    @ElVoField(physicalName = "crmt_exec_amt")
    public String getCrmt_exec_amt(){
        return crmt_exec_amt;
    }

    @ElVoField(physicalName = "crmt_exec_amt")
    public void setCrmt_exec_amt(String crmt_exec_amt){
        this.crmt_exec_amt = crmt_exec_amt;
    }

    @ElVoField(physicalName = "crmt_bal")
    public String getCrmt_bal(){
        return crmt_bal;
    }

    @ElVoField(physicalName = "crmt_bal")
    public void setCrmt_bal(String crmt_bal){
        this.crmt_bal = crmt_bal;
    }

    @ElVoField(physicalName = "use_apv_cash_lim_amt")
    public String getUse_apv_cash_lim_amt(){
        return use_apv_cash_lim_amt;
    }

    @ElVoField(physicalName = "use_apv_cash_lim_amt")
    public void setUse_apv_cash_lim_amt(String use_apv_cash_lim_amt){
        this.use_apv_cash_lim_amt = use_apv_cash_lim_amt;
    }

    @ElVoField(physicalName = "exctn_exec_amt")
    public String getExctn_exec_amt(){
        return exctn_exec_amt;
    }

    @ElVoField(physicalName = "exctn_exec_amt")
    public void setExctn_exec_amt(String exctn_exec_amt){
        this.exctn_exec_amt = exctn_exec_amt;
    }

    @ElVoField(physicalName = "apv_bal")
    public String getApv_bal(){
        return apv_bal;
    }

    @ElVoField(physicalName = "apv_bal")
    public void setApv_bal(String apv_bal){
        this.apv_bal = apv_bal;
    }

    @ElVoField(physicalName = "bmname")
    public String getBmname(){
        return bmname;
    }

    @ElVoField(physicalName = "bmname")
    public void setBmname(String bmname){
        this.bmname = bmname;
    }

    @ElVoField(physicalName = "bfyrcrovamt")
    public String getBfyrcrovamt(){
        return bfyrcrovamt;
    }

    @ElVoField(physicalName = "bfyrcrovamt")
    public void setBfyrcrovamt(String bfyrcrovamt){
        this.bfyrcrovamt = bfyrcrovamt;
    }

    @ElVoField(physicalName = "plcsamt")
    public String getPlcsamt(){
        return plcsamt;
    }

    @ElVoField(physicalName = "plcsamt")
    public void setPlcsamt(String plcsamt){
        this.plcsamt = plcsamt;
    }

    @ElVoField(physicalName = "plthamt")
    public String getPlthamt(){
        return plthamt;
    }

    @ElVoField(physicalName = "plthamt")
    public void setPlthamt(String plthamt){
        this.plthamt = plthamt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResExaCryOvrMoneyInfoVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("crmt_use_apv_lim_amt").append("=").append(crmt_use_apv_lim_amt).append(",");
        sb.append("crmt_exec_amt").append("=").append(crmt_exec_amt).append(",");
        sb.append("crmt_bal").append("=").append(crmt_bal).append(",");
        sb.append("use_apv_cash_lim_amt").append("=").append(use_apv_cash_lim_amt).append(",");
        sb.append("exctn_exec_amt").append("=").append(exctn_exec_amt).append(",");
        sb.append("apv_bal").append("=").append(apv_bal).append(",");
        sb.append("bmname").append("=").append(bmname).append(",");
        sb.append("bfyrcrovamt").append("=").append(bfyrcrovamt).append(",");
        sb.append("plcsamt").append("=").append(plcsamt).append(",");
        sb.append("plthamt").append("=").append(plthamt);
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
