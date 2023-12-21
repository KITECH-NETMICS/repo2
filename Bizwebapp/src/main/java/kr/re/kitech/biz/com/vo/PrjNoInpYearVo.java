package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연차과제")
public class PrjNoInpYearVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PrjNoInpYearVo(){
    }

    @ElDtoField(logicalName = "연차", physicalName = "anal", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String anal;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_no;

    @ElDtoField(logicalName = "사업기간", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ymd;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "직급", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "소속", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "전화번호", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String ext_no;

    @ElDtoField(logicalName = "과제코드", physicalName = "reschamt_card_prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String reschamt_card_prj_no;

    @ElVoField(physicalName = "anal")
    public String getAnal(){
        String ret = this.anal;
        return ret;
    }

    @ElVoField(physicalName = "anal")
    public void setAnal(String anal){
        this.anal = anal;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        String ret = this.accnt_no;
        return ret;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        String ret = this.ymd;
        return ret;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        String ret = this.accnt_rspns_nm;
        return ret;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        String ret = this.ext_no;
        return ret;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "reschamt_card_prj_no")
    public String getReschamt_card_prj_no(){
        String ret = this.reschamt_card_prj_no;
        return ret;
    }

    @ElVoField(physicalName = "reschamt_card_prj_no")
    public void setReschamt_card_prj_no(String reschamt_card_prj_no){
        this.reschamt_card_prj_no = reschamt_card_prj_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrjNoInpYearVo [");
        sb.append("anal").append("=").append(anal).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("reschamt_card_prj_no").append("=").append(reschamt_card_prj_no);
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
