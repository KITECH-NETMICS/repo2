package kr.re.kitech.biz.fin.std.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "카드정보 Vo")
public class StdFbaCardVo extends kr.re.kitech.biz.fin.com.vo.FbaCardVo {
    private static final long serialVersionUID = 1L;

    public StdFbaCardVo(){
    }

    @ElDtoField(logicalName = "결재일", physicalName = "apprvl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_ymd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "보유부서", physicalName = "keep_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_dept;

    @ElDtoField(logicalName = "보유부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "보유자", physicalName = "keep_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_charg;

    @ElDtoField(logicalName = "보유자명(개인번호)", physicalName = "emp_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_no_nm;

    @ElDtoField(logicalName = "카드상태", physicalName = "card_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_state;

    @ElVoField(physicalName = "apprvl_ymd")
    public String getApprvl_ymd(){
        return apprvl_ymd;
    }

    @ElVoField(physicalName = "apprvl_ymd")
    public void setApprvl_ymd(String apprvl_ymd){
        this.apprvl_ymd = apprvl_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "keep_dept")
    public String getKeep_dept(){
        return keep_dept;
    }

    @ElVoField(physicalName = "keep_dept")
    public void setKeep_dept(String keep_dept){
        this.keep_dept = keep_dept;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "keep_charg")
    public String getKeep_charg(){
        return keep_charg;
    }

    @ElVoField(physicalName = "keep_charg")
    public void setKeep_charg(String keep_charg){
        this.keep_charg = keep_charg;
    }

    @ElVoField(physicalName = "emp_no_nm")
    public String getEmp_no_nm(){
        return emp_no_nm;
    }

    @ElVoField(physicalName = "emp_no_nm")
    public void setEmp_no_nm(String emp_no_nm){
        this.emp_no_nm = emp_no_nm;
    }

    @ElVoField(physicalName = "card_state")
    public String getCard_state(){
        return card_state;
    }

    @ElVoField(physicalName = "card_state")
    public void setCard_state(String card_state){
        this.card_state = card_state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StdFbaCardVo [");
        sb.append("apprvl_ymd").append("=").append(apprvl_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("keep_dept").append("=").append(keep_dept).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("keep_charg").append("=").append(keep_charg).append(",");
        sb.append("emp_no_nm").append("=").append(emp_no_nm).append(",");
        sb.append("card_state").append("=").append(card_state);
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
