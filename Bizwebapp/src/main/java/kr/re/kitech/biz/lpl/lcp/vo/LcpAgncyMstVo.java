package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpAgncyMstExp")
public class LcpAgncyMstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpAgncyMstVo(){
    }

    @ElDtoField(logicalName = "natnCd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "agncyClsf", physicalName = "agncy_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_clsf;

    @ElDtoField(logicalName = "agncyNm", physicalName = "agncy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_nm;

    @ElDtoField(logicalName = "mouCntnt", physicalName = "mou_cntnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mou_cntnt;

    @ElDtoField(logicalName = "gubun", physicalName = "gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubun;

    @ElDtoField(logicalName = "cust_no", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "natn_nm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "cmpy_nm_krchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "cmpy_nm_eng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "cmpy_nm", physicalName = "cmpy_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm;

    @ElDtoField(logicalName = "tab_type", physicalName = "tab_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tab_type;

    @ElDtoField(logicalName = "agncy_cd", physicalName = "agncy_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agncy_cd;

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public String getAgncy_clsf(){
        return agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_clsf")
    public void setAgncy_clsf(String agncy_clsf){
        this.agncy_clsf = agncy_clsf;
    }

    @ElVoField(physicalName = "agncy_nm")
    public String getAgncy_nm(){
        return agncy_nm;
    }

    @ElVoField(physicalName = "agncy_nm")
    public void setAgncy_nm(String agncy_nm){
        this.agncy_nm = agncy_nm;
    }

    @ElVoField(physicalName = "mou_cntnt")
    public String getMou_cntnt(){
        return mou_cntnt;
    }

    @ElVoField(physicalName = "mou_cntnt")
    public void setMou_cntnt(String mou_cntnt){
        this.mou_cntnt = mou_cntnt;
    }

    @ElVoField(physicalName = "gubun")
    public String getGubun(){
        return gubun;
    }

    @ElVoField(physicalName = "gubun")
    public void setGubun(String gubun){
        this.gubun = gubun;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm")
    public String getCmpy_nm(){
        return cmpy_nm;
    }

    @ElVoField(physicalName = "cmpy_nm")
    public void setCmpy_nm(String cmpy_nm){
        this.cmpy_nm = cmpy_nm;
    }

    @ElVoField(physicalName = "tab_type")
    public String getTab_type(){
        return tab_type;
    }

    @ElVoField(physicalName = "tab_type")
    public void setTab_type(String tab_type){
        this.tab_type = tab_type;
    }

    @ElVoField(physicalName = "agncy_cd")
    public String getAgncy_cd(){
        return agncy_cd;
    }

    @ElVoField(physicalName = "agncy_cd")
    public void setAgncy_cd(String agncy_cd){
        this.agncy_cd = agncy_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpAgncyMstVo [");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("agncy_clsf").append("=").append(agncy_clsf).append(",");
        sb.append("agncy_nm").append("=").append(agncy_nm).append(",");
        sb.append("mou_cntnt").append("=").append(mou_cntnt).append(",");
        sb.append("gubun").append("=").append(gubun).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("cmpy_nm").append("=").append(cmpy_nm).append(",");
        sb.append("tab_type").append("=").append(tab_type).append(",");
        sb.append("agncy_cd").append("=").append(agncy_cd);
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
