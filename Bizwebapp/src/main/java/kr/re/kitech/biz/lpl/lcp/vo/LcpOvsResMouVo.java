package kr.re.kitech.biz.lpl.lcp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "LcpOvsResMouExp")
public class LcpOvsResMouVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LcpOvsResMouVo(){
    }

    @ElDtoField(logicalName = "natnCd", physicalName = "natn_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd;

    @ElDtoField(logicalName = "cmpyNmKrchar", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "accntNo", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "accntNoNm", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "startYmd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "clsYmd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "prjNo", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "reschRspnsMain", physicalName = "resch_rspns_main", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_rspns_main;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "prjBugt", physicalName = "prj_bugt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_bugt;

    @ElDtoField(logicalName = "natnNm", physicalName = "natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_nm;

    @ElDtoField(logicalName = "ez_srch", physicalName = "ez_srch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ez_srch;

    @ElDtoField(logicalName = "attnce_clsf", physicalName = "attnce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_clsf;

    @ElDtoField(logicalName = "vend_cd", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "natn_cd_nm", physicalName = "natn_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String natn_cd_nm;

    @ElDtoField(logicalName = "cust_no", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "cmpy_nm_eng", physicalName = "cmpy_nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng;

    @ElDtoField(logicalName = "cmpy_nm_eng_short", physicalName = "cmpy_nm_eng_short", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_eng_short;

    @ElDtoField(logicalName = "cust_natn_cd_nm", physicalName = "cust_natn_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_natn_cd_nm;

    @ElVoField(physicalName = "natn_cd")
    public String getNatn_cd(){
        return natn_cd;
    }

    @ElVoField(physicalName = "natn_cd")
    public void setNatn_cd(String natn_cd){
        this.natn_cd = natn_cd;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public String getResch_rspns_main(){
        return resch_rspns_main;
    }

    @ElVoField(physicalName = "resch_rspns_main")
    public void setResch_rspns_main(String resch_rspns_main){
        this.resch_rspns_main = resch_rspns_main;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "prj_bugt")
    public String getPrj_bugt(){
        return prj_bugt;
    }

    @ElVoField(physicalName = "prj_bugt")
    public void setPrj_bugt(String prj_bugt){
        this.prj_bugt = prj_bugt;
    }

    @ElVoField(physicalName = "natn_nm")
    public String getNatn_nm(){
        return natn_nm;
    }

    @ElVoField(physicalName = "natn_nm")
    public void setNatn_nm(String natn_nm){
        this.natn_nm = natn_nm;
    }

    @ElVoField(physicalName = "ez_srch")
    public String getEz_srch(){
        return ez_srch;
    }

    @ElVoField(physicalName = "ez_srch")
    public void setEz_srch(String ez_srch){
        this.ez_srch = ez_srch;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public String getAttnce_clsf(){
        return attnce_clsf;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public void setAttnce_clsf(String attnce_clsf){
        this.attnce_clsf = attnce_clsf;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "natn_cd_nm")
    public String getNatn_cd_nm(){
        return natn_cd_nm;
    }

    @ElVoField(physicalName = "natn_cd_nm")
    public void setNatn_cd_nm(String natn_cd_nm){
        this.natn_cd_nm = natn_cd_nm;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public String getCmpy_nm_eng(){
        return cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng")
    public void setCmpy_nm_eng(String cmpy_nm_eng){
        this.cmpy_nm_eng = cmpy_nm_eng;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public String getCmpy_nm_eng_short(){
        return cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "cmpy_nm_eng_short")
    public void setCmpy_nm_eng_short(String cmpy_nm_eng_short){
        this.cmpy_nm_eng_short = cmpy_nm_eng_short;
    }

    @ElVoField(physicalName = "cust_natn_cd_nm")
    public String getCust_natn_cd_nm(){
        return cust_natn_cd_nm;
    }

    @ElVoField(physicalName = "cust_natn_cd_nm")
    public void setCust_natn_cd_nm(String cust_natn_cd_nm){
        this.cust_natn_cd_nm = cust_natn_cd_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LcpOvsResMouVo [");
        sb.append("natn_cd").append("=").append(natn_cd).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("resch_rspns_main").append("=").append(resch_rspns_main).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("prj_bugt").append("=").append(prj_bugt).append(",");
        sb.append("natn_nm").append("=").append(natn_nm).append(",");
        sb.append("ez_srch").append("=").append(ez_srch).append(",");
        sb.append("attnce_clsf").append("=").append(attnce_clsf).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("natn_cd_nm").append("=").append(natn_cd_nm).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cmpy_nm_eng").append("=").append(cmpy_nm_eng).append(",");
        sb.append("cmpy_nm_eng_short").append("=").append(cmpy_nm_eng_short).append(",");
        sb.append("cust_natn_cd_nm").append("=").append(cust_natn_cd_nm);
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
