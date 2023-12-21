package kr.re.kitech.biz.hum.bas.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "HumBasStuMngVo")
public class HumBasStuMngVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumBasStuMngVo(){
    }

    @ElDtoField(logicalName = "sbx_serv_situn", physicalName = "sbx_serv_situn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbx_serv_situn;

    @ElDtoField(logicalName = "inp_empno", physicalName = "inp_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_empno;

    @ElDtoField(logicalName = "inp_sn", physicalName = "inp_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_sn;

    @ElDtoField(logicalName = "inp_nm", physicalName = "inp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_nm;

    @ElDtoField(logicalName = "sbx_prd_stn", physicalName = "sbx_prd_stn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbx_prd_stn;

    @ElDtoField(logicalName = "req_ymd_from", physicalName = "req_ymd_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_from;

    @ElDtoField(logicalName = "req_ymd_to", physicalName = "req_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_to;

    @ElDtoField(logicalName = "frs_entr_from", physicalName = "frs_entr_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frs_entr_from;

    @ElDtoField(logicalName = "frs_entr_to", physicalName = "frs_entr_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String frs_entr_to;

    @ElDtoField(logicalName = "entr_from", physicalName = "entr_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_from;

    @ElDtoField(logicalName = "entr_to", physicalName = "entr_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_to;

    @ElDtoField(logicalName = "contrct_cls_from", physicalName = "contrct_cls_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_from;

    @ElDtoField(logicalName = "contrct_cls_to", physicalName = "contrct_cls_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_cls_to;

    @ElDtoField(logicalName = "retire_from", physicalName = "retire_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_from;

    @ElDtoField(logicalName = "retire_to", physicalName = "retire_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retire_to;

    @ElDtoField(logicalName = "sbx_entr_dgr", physicalName = "sbx_entr_dgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbx_entr_dgr;

    @ElDtoField(logicalName = "inp_entr_sch", physicalName = "inp_entr_sch", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_entr_sch;

    @ElDtoField(logicalName = "sbx_posi_cd", physicalName = "sbx_posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sbx_posi_cd;

    @ElDtoField(logicalName = "inp_pruse_psn_empno", physicalName = "inp_pruse_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_pruse_psn_empno;

    @ElDtoField(logicalName = "inp_pruse_psn_sn", physicalName = "inp_pruse_psn_sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_pruse_psn_sn;

    @ElDtoField(logicalName = "inp_pruse_psn_nm", physicalName = "inp_pruse_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inp_pruse_psn_nm;

    @ElVoField(physicalName = "sbx_serv_situn")
    public String getSbx_serv_situn(){
        return sbx_serv_situn;
    }

    @ElVoField(physicalName = "sbx_serv_situn")
    public void setSbx_serv_situn(String sbx_serv_situn){
        this.sbx_serv_situn = sbx_serv_situn;
    }

    @ElVoField(physicalName = "inp_empno")
    public String getInp_empno(){
        return inp_empno;
    }

    @ElVoField(physicalName = "inp_empno")
    public void setInp_empno(String inp_empno){
        this.inp_empno = inp_empno;
    }

    @ElVoField(physicalName = "inp_sn")
    public String getInp_sn(){
        return inp_sn;
    }

    @ElVoField(physicalName = "inp_sn")
    public void setInp_sn(String inp_sn){
        this.inp_sn = inp_sn;
    }

    @ElVoField(physicalName = "inp_nm")
    public String getInp_nm(){
        return inp_nm;
    }

    @ElVoField(physicalName = "inp_nm")
    public void setInp_nm(String inp_nm){
        this.inp_nm = inp_nm;
    }

    @ElVoField(physicalName = "sbx_prd_stn")
    public String getSbx_prd_stn(){
        return sbx_prd_stn;
    }

    @ElVoField(physicalName = "sbx_prd_stn")
    public void setSbx_prd_stn(String sbx_prd_stn){
        this.sbx_prd_stn = sbx_prd_stn;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public String getReq_ymd_from(){
        return req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_from")
    public void setReq_ymd_from(String req_ymd_from){
        this.req_ymd_from = req_ymd_from;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public String getReq_ymd_to(){
        return req_ymd_to;
    }

    @ElVoField(physicalName = "req_ymd_to")
    public void setReq_ymd_to(String req_ymd_to){
        this.req_ymd_to = req_ymd_to;
    }

    @ElVoField(physicalName = "frs_entr_from")
    public String getFrs_entr_from(){
        return frs_entr_from;
    }

    @ElVoField(physicalName = "frs_entr_from")
    public void setFrs_entr_from(String frs_entr_from){
        this.frs_entr_from = frs_entr_from;
    }

    @ElVoField(physicalName = "frs_entr_to")
    public String getFrs_entr_to(){
        return frs_entr_to;
    }

    @ElVoField(physicalName = "frs_entr_to")
    public void setFrs_entr_to(String frs_entr_to){
        this.frs_entr_to = frs_entr_to;
    }

    @ElVoField(physicalName = "entr_from")
    public String getEntr_from(){
        return entr_from;
    }

    @ElVoField(physicalName = "entr_from")
    public void setEntr_from(String entr_from){
        this.entr_from = entr_from;
    }

    @ElVoField(physicalName = "entr_to")
    public String getEntr_to(){
        return entr_to;
    }

    @ElVoField(physicalName = "entr_to")
    public void setEntr_to(String entr_to){
        this.entr_to = entr_to;
    }

    @ElVoField(physicalName = "contrct_cls_from")
    public String getContrct_cls_from(){
        return contrct_cls_from;
    }

    @ElVoField(physicalName = "contrct_cls_from")
    public void setContrct_cls_from(String contrct_cls_from){
        this.contrct_cls_from = contrct_cls_from;
    }

    @ElVoField(physicalName = "contrct_cls_to")
    public String getContrct_cls_to(){
        return contrct_cls_to;
    }

    @ElVoField(physicalName = "contrct_cls_to")
    public void setContrct_cls_to(String contrct_cls_to){
        this.contrct_cls_to = contrct_cls_to;
    }

    @ElVoField(physicalName = "retire_from")
    public String getRetire_from(){
        return retire_from;
    }

    @ElVoField(physicalName = "retire_from")
    public void setRetire_from(String retire_from){
        this.retire_from = retire_from;
    }

    @ElVoField(physicalName = "retire_to")
    public String getRetire_to(){
        return retire_to;
    }

    @ElVoField(physicalName = "retire_to")
    public void setRetire_to(String retire_to){
        this.retire_to = retire_to;
    }

    @ElVoField(physicalName = "sbx_entr_dgr")
    public String getSbx_entr_dgr(){
        return sbx_entr_dgr;
    }

    @ElVoField(physicalName = "sbx_entr_dgr")
    public void setSbx_entr_dgr(String sbx_entr_dgr){
        this.sbx_entr_dgr = sbx_entr_dgr;
    }

    @ElVoField(physicalName = "inp_entr_sch")
    public String getInp_entr_sch(){
        return inp_entr_sch;
    }

    @ElVoField(physicalName = "inp_entr_sch")
    public void setInp_entr_sch(String inp_entr_sch){
        this.inp_entr_sch = inp_entr_sch;
    }

    @ElVoField(physicalName = "sbx_posi_cd")
    public String getSbx_posi_cd(){
        return sbx_posi_cd;
    }

    @ElVoField(physicalName = "sbx_posi_cd")
    public void setSbx_posi_cd(String sbx_posi_cd){
        this.sbx_posi_cd = sbx_posi_cd;
    }

    @ElVoField(physicalName = "inp_pruse_psn_empno")
    public String getInp_pruse_psn_empno(){
        return inp_pruse_psn_empno;
    }

    @ElVoField(physicalName = "inp_pruse_psn_empno")
    public void setInp_pruse_psn_empno(String inp_pruse_psn_empno){
        this.inp_pruse_psn_empno = inp_pruse_psn_empno;
    }

    @ElVoField(physicalName = "inp_pruse_psn_sn")
    public String getInp_pruse_psn_sn(){
        return inp_pruse_psn_sn;
    }

    @ElVoField(physicalName = "inp_pruse_psn_sn")
    public void setInp_pruse_psn_sn(String inp_pruse_psn_sn){
        this.inp_pruse_psn_sn = inp_pruse_psn_sn;
    }

    @ElVoField(physicalName = "inp_pruse_psn_nm")
    public String getInp_pruse_psn_nm(){
        return inp_pruse_psn_nm;
    }

    @ElVoField(physicalName = "inp_pruse_psn_nm")
    public void setInp_pruse_psn_nm(String inp_pruse_psn_nm){
        this.inp_pruse_psn_nm = inp_pruse_psn_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumBasStuMngVo [");
        sb.append("sbx_serv_situn").append("=").append(sbx_serv_situn).append(",");
        sb.append("inp_empno").append("=").append(inp_empno).append(",");
        sb.append("inp_sn").append("=").append(inp_sn).append(",");
        sb.append("inp_nm").append("=").append(inp_nm).append(",");
        sb.append("sbx_prd_stn").append("=").append(sbx_prd_stn).append(",");
        sb.append("req_ymd_from").append("=").append(req_ymd_from).append(",");
        sb.append("req_ymd_to").append("=").append(req_ymd_to).append(",");
        sb.append("frs_entr_from").append("=").append(frs_entr_from).append(",");
        sb.append("frs_entr_to").append("=").append(frs_entr_to).append(",");
        sb.append("entr_from").append("=").append(entr_from).append(",");
        sb.append("entr_to").append("=").append(entr_to).append(",");
        sb.append("contrct_cls_from").append("=").append(contrct_cls_from).append(",");
        sb.append("contrct_cls_to").append("=").append(contrct_cls_to).append(",");
        sb.append("retire_from").append("=").append(retire_from).append(",");
        sb.append("retire_to").append("=").append(retire_to).append(",");
        sb.append("sbx_entr_dgr").append("=").append(sbx_entr_dgr).append(",");
        sb.append("inp_entr_sch").append("=").append(inp_entr_sch).append(",");
        sb.append("sbx_posi_cd").append("=").append(sbx_posi_cd).append(",");
        sb.append("inp_pruse_psn_empno").append("=").append(inp_pruse_psn_empno).append(",");
        sb.append("inp_pruse_psn_sn").append("=").append(inp_pruse_psn_sn).append(",");
        sb.append("inp_pruse_psn_nm").append("=").append(inp_pruse_psn_nm);
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
