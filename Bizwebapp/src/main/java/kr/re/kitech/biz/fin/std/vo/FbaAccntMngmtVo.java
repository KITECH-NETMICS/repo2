package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "회계코드별관리항목Vo ")
public class FbaAccntMngmtVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FbaAccntMngmtVo(){
    }

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "관리항목코드", physicalName = "mngmt_item_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_cd;

    @ElDtoField(logicalName = "관리항목이름", physicalName = "mngmt_item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm;

    @ElDtoField(logicalName = "차대구분", physicalName = "debit_cr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String debit_cr_clsf;

    @ElDtoField(logicalName = "필수여부", physicalName = "essen_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String essen_ex;

    @ElDtoField(logicalName = "현업사용유무", physicalName = "worksite_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String worksite_use_ex;

    @ElDtoField(logicalName = "결의서출력순서", physicalName = "slip_prt_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_prt_seq;

    @ElDtoField(logicalName = "데이터형식", physicalName = "data_form", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_form;

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public String getMngmt_item_cd(){
        return mngmt_item_cd;
    }

    @ElVoField(physicalName = "mngmt_item_cd")
    public void setMngmt_item_cd(String mngmt_item_cd){
        this.mngmt_item_cd = mngmt_item_cd;
    }

    @ElVoField(physicalName = "mngmt_item_nm")
    public String getMngmt_item_nm(){
        return mngmt_item_nm;
    }

    @ElVoField(physicalName = "mngmt_item_nm")
    public void setMngmt_item_nm(String mngmt_item_nm){
        this.mngmt_item_nm = mngmt_item_nm;
    }

    @ElVoField(physicalName = "debit_cr_clsf")
    public String getDebit_cr_clsf(){
        return debit_cr_clsf;
    }

    @ElVoField(physicalName = "debit_cr_clsf")
    public void setDebit_cr_clsf(String debit_cr_clsf){
        this.debit_cr_clsf = debit_cr_clsf;
    }

    @ElVoField(physicalName = "essen_ex")
    public String getEssen_ex(){
        return essen_ex;
    }

    @ElVoField(physicalName = "essen_ex")
    public void setEssen_ex(String essen_ex){
        this.essen_ex = essen_ex;
    }

    @ElVoField(physicalName = "worksite_use_ex")
    public String getWorksite_use_ex(){
        return worksite_use_ex;
    }

    @ElVoField(physicalName = "worksite_use_ex")
    public void setWorksite_use_ex(String worksite_use_ex){
        this.worksite_use_ex = worksite_use_ex;
    }

    @ElVoField(physicalName = "slip_prt_seq")
    public String getSlip_prt_seq(){
        return slip_prt_seq;
    }

    @ElVoField(physicalName = "slip_prt_seq")
    public void setSlip_prt_seq(String slip_prt_seq){
        this.slip_prt_seq = slip_prt_seq;
    }

    @ElVoField(physicalName = "data_form")
    public String getData_form(){
        return data_form;
    }

    @ElVoField(physicalName = "data_form")
    public void setData_form(String data_form){
        this.data_form = data_form;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaAccntMngmtVo [");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("mngmt_item_cd").append("=").append(mngmt_item_cd).append(",");
        sb.append("mngmt_item_nm").append("=").append(mngmt_item_nm).append(",");
        sb.append("debit_cr_clsf").append("=").append(debit_cr_clsf).append(",");
        sb.append("essen_ex").append("=").append(essen_ex).append(",");
        sb.append("worksite_use_ex").append("=").append(worksite_use_ex).append(",");
        sb.append("slip_prt_seq").append("=").append(slip_prt_seq).append(",");
        sb.append("data_form").append("=").append(data_form);
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
