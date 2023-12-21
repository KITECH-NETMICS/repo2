package kr.re.kitech.biz.saf.che.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "SfcChmstryInfoExp")
public class SafCheChmstryInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SafCheChmstryInfoVo(){
    }

    @ElDtoField(logicalName = "casNo", physicalName = "cas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cas_no;

    @ElDtoField(logicalName = "prductCd", physicalName = "prduct_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_cd;

    @ElDtoField(logicalName = "chmclsNmKr", physicalName = "chmcls_nm_kr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_nm_kr;

    @ElDtoField(logicalName = "chmclsNmEn", physicalName = "chmcls_nm_en", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_nm_en;

    @ElDtoField(logicalName = "dgstClssfCl", physicalName = "dgst_clssf_cl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dgst_clssf_cl;

    @ElDtoField(logicalName = "chmclsSe", physicalName = "chmcls_se", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_se;

    @ElDtoField(logicalName = "registSyspayno", physicalName = "regist_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_syspayno;

    @ElDtoField(logicalName = "registNm", physicalName = "regist_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_nm;

    @ElDtoField(logicalName = "registEmpno", physicalName = "regist_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regist_empno;

    @ElDtoField(logicalName = "chmclsManageLaw", physicalName = "chmcls_manage_law", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chmcls_manage_law;

    @ElDtoField(logicalName = "industSafhelLaw", physicalName = "indust_safhel_law", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String indust_safhel_law;

    @ElDtoField(logicalName = "cl", physicalName = "cl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cl;

    @ElDtoField(logicalName = "clDetail", physicalName = "cl_detail", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cl_detail;

    @ElDtoField(logicalName = "clDetail2", physicalName = "cl_detail2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cl_detail2;

    @ElDtoField(logicalName = "speclManageMttr", physicalName = "specl_manage_mttr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String specl_manage_mttr;

    @ElDtoField(logicalName = "use_req_no", physicalName = "use_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_req_no;

    @ElDtoField(logicalName = "prduct_nm", physicalName = "prduct_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prduct_nm;

    @ElVoField(physicalName = "cas_no")
    public String getCas_no(){
        return cas_no;
    }

    @ElVoField(physicalName = "cas_no")
    public void setCas_no(String cas_no){
        this.cas_no = cas_no;
    }

    @ElVoField(physicalName = "prduct_cd")
    public String getPrduct_cd(){
        return prduct_cd;
    }

    @ElVoField(physicalName = "prduct_cd")
    public void setPrduct_cd(String prduct_cd){
        this.prduct_cd = prduct_cd;
    }

    @ElVoField(physicalName = "chmcls_nm_kr")
    public String getChmcls_nm_kr(){
        return chmcls_nm_kr;
    }

    @ElVoField(physicalName = "chmcls_nm_kr")
    public void setChmcls_nm_kr(String chmcls_nm_kr){
        this.chmcls_nm_kr = chmcls_nm_kr;
    }

    @ElVoField(physicalName = "chmcls_nm_en")
    public String getChmcls_nm_en(){
        return chmcls_nm_en;
    }

    @ElVoField(physicalName = "chmcls_nm_en")
    public void setChmcls_nm_en(String chmcls_nm_en){
        this.chmcls_nm_en = chmcls_nm_en;
    }

    @ElVoField(physicalName = "dgst_clssf_cl")
    public String getDgst_clssf_cl(){
        return dgst_clssf_cl;
    }

    @ElVoField(physicalName = "dgst_clssf_cl")
    public void setDgst_clssf_cl(String dgst_clssf_cl){
        this.dgst_clssf_cl = dgst_clssf_cl;
    }

    @ElVoField(physicalName = "chmcls_se")
    public String getChmcls_se(){
        return chmcls_se;
    }

    @ElVoField(physicalName = "chmcls_se")
    public void setChmcls_se(String chmcls_se){
        this.chmcls_se = chmcls_se;
    }

    @ElVoField(physicalName = "regist_syspayno")
    public String getRegist_syspayno(){
        return regist_syspayno;
    }

    @ElVoField(physicalName = "regist_syspayno")
    public void setRegist_syspayno(String regist_syspayno){
        this.regist_syspayno = regist_syspayno;
    }

    @ElVoField(physicalName = "regist_nm")
    public String getRegist_nm(){
        return regist_nm;
    }

    @ElVoField(physicalName = "regist_nm")
    public void setRegist_nm(String regist_nm){
        this.regist_nm = regist_nm;
    }

    @ElVoField(physicalName = "regist_empno")
    public String getRegist_empno(){
        return regist_empno;
    }

    @ElVoField(physicalName = "regist_empno")
    public void setRegist_empno(String regist_empno){
        this.regist_empno = regist_empno;
    }

    @ElVoField(physicalName = "chmcls_manage_law")
    public String getChmcls_manage_law(){
        return chmcls_manage_law;
    }

    @ElVoField(physicalName = "chmcls_manage_law")
    public void setChmcls_manage_law(String chmcls_manage_law){
        this.chmcls_manage_law = chmcls_manage_law;
    }

    @ElVoField(physicalName = "indust_safhel_law")
    public String getIndust_safhel_law(){
        return indust_safhel_law;
    }

    @ElVoField(physicalName = "indust_safhel_law")
    public void setIndust_safhel_law(String indust_safhel_law){
        this.indust_safhel_law = indust_safhel_law;
    }

    @ElVoField(physicalName = "cl")
    public String getCl(){
        return cl;
    }

    @ElVoField(physicalName = "cl")
    public void setCl(String cl){
        this.cl = cl;
    }

    @ElVoField(physicalName = "cl_detail")
    public String getCl_detail(){
        return cl_detail;
    }

    @ElVoField(physicalName = "cl_detail")
    public void setCl_detail(String cl_detail){
        this.cl_detail = cl_detail;
    }

    @ElVoField(physicalName = "cl_detail2")
    public String getCl_detail2(){
        return cl_detail2;
    }

    @ElVoField(physicalName = "cl_detail2")
    public void setCl_detail2(String cl_detail2){
        this.cl_detail2 = cl_detail2;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public String getSpecl_manage_mttr(){
        return specl_manage_mttr;
    }

    @ElVoField(physicalName = "specl_manage_mttr")
    public void setSpecl_manage_mttr(String specl_manage_mttr){
        this.specl_manage_mttr = specl_manage_mttr;
    }

    @ElVoField(physicalName = "use_req_no")
    public String getUse_req_no(){
        return use_req_no;
    }

    @ElVoField(physicalName = "use_req_no")
    public void setUse_req_no(String use_req_no){
        this.use_req_no = use_req_no;
    }

    @ElVoField(physicalName = "prduct_nm")
    public String getPrduct_nm(){
        return prduct_nm;
    }

    @ElVoField(physicalName = "prduct_nm")
    public void setPrduct_nm(String prduct_nm){
        this.prduct_nm = prduct_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SafCheChmstryInfoVo [");
        sb.append("cas_no").append("=").append(cas_no).append(",");
        sb.append("prduct_cd").append("=").append(prduct_cd).append(",");
        sb.append("chmcls_nm_kr").append("=").append(chmcls_nm_kr).append(",");
        sb.append("chmcls_nm_en").append("=").append(chmcls_nm_en).append(",");
        sb.append("dgst_clssf_cl").append("=").append(dgst_clssf_cl).append(",");
        sb.append("chmcls_se").append("=").append(chmcls_se).append(",");
        sb.append("regist_syspayno").append("=").append(regist_syspayno).append(",");
        sb.append("regist_nm").append("=").append(regist_nm).append(",");
        sb.append("regist_empno").append("=").append(regist_empno).append(",");
        sb.append("chmcls_manage_law").append("=").append(chmcls_manage_law).append(",");
        sb.append("indust_safhel_law").append("=").append(indust_safhel_law).append(",");
        sb.append("cl").append("=").append(cl).append(",");
        sb.append("cl_detail").append("=").append(cl_detail).append(",");
        sb.append("cl_detail2").append("=").append(cl_detail2).append(",");
        sb.append("specl_manage_mttr").append("=").append(specl_manage_mttr).append(",");
        sb.append("use_req_no").append("=").append(use_req_no).append(",");
        sb.append("prduct_nm").append("=").append(prduct_nm);
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
