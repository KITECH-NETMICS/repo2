package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpMouDomAgencyExp")
public class LcpMouDomAgencyVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpMouDomAgencyVo(){
    }

    @ElDtoField(logicalName = "mouNo", physicalName = "mou_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_no;

    @ElDtoField(logicalName = "agncyCd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "contrctPsnDuty", physicalName = "contrct_psn_duty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_duty;

    @ElDtoField(logicalName = "agncyClsf", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;

    @ElDtoField(logicalName = "agncyClsfNm", physicalName = "agncy_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf_nm;

    @ElDtoField(logicalName = "contrctPsnNm", physicalName = "contrct_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_psn_nm;

    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "chargDeptNm", physicalName = "charg_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_dept_nm;

    @ElDtoField(logicalName = "chargTel", physicalName = "charg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_tel;

    @ElDtoField(logicalName = "mouKnd", physicalName = "mou_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_knd;

    @ElDtoField(logicalName = "cud_type", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "regst_psn_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "updt_psn_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElVoField(physicalName = "mou_no")
    public String getMou_no(){
        return mou_no;
    }

    @ElVoField(physicalName = "mou_no")
    public void setMou_no(String mou_no){
        this.mou_no = mou_no;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "contrct_psn_duty")
    public String getContrct_psn_duty(){
        return contrct_psn_duty;
    }

    @ElVoField(physicalName = "contrct_psn_duty")
    public void setContrct_psn_duty(String contrct_psn_duty){
        this.contrct_psn_duty = contrct_psn_duty;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public String getAgncy_clsf_nm(){
        return agncy_clsf_nm;
    }

    @ElVoField(physicalName = "agncy_clsf_nm")
    public void setAgncy_clsf_nm(String agncy_clsf_nm){
        this.agncy_clsf_nm = agncy_clsf_nm;
    }

    @ElVoField(physicalName = "contrct_psn_nm")
    public String getContrct_psn_nm(){
        return contrct_psn_nm;
    }

    @ElVoField(physicalName = "contrct_psn_nm")
    public void setContrct_psn_nm(String contrct_psn_nm){
        this.contrct_psn_nm = contrct_psn_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
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

    @ElVoField(physicalName = "mou_knd")
    public String getMou_knd(){
        return mou_knd;
    }

    @ElVoField(physicalName = "mou_knd")
    public void setMou_knd(String mou_knd){
        this.mou_knd = mou_knd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpMouDomAgencyVo [");
        sb.append("mou_no").append("=").append(mou_no).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("contrct_psn_duty").append("=").append(contrct_psn_duty).append(",");
        sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
        sb.append("agncy_clsf_nm").append("=").append(agncy_clsf_nm).append(",");
        sb.append("contrct_psn_nm").append("=").append(contrct_psn_nm).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("charg_dept_nm").append("=").append(charg_dept_nm).append(",");
        sb.append("charg_tel").append("=").append(charg_tel).append(",");
        sb.append("mou_knd").append("=").append(mou_knd).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno);
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
