package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspSlipHMerExp")
public class FspSlipHMerVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspSlipHMerVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqSeq", physicalName = "req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_seq;

    @ElDtoField(logicalName = "unslipNo", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "pslipNo", physicalName = "pslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pslip_no;

    @ElDtoField(logicalName = "slipYmd", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "reqPsnSyspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "reqPsnDeptCd", physicalName = "req_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_cd;

    @ElDtoField(logicalName = "reqPsnDeptNewYmd", physicalName = "req_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_new_ymd;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "vendNm", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "slipNo2", physicalName = "slip_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no2;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "apr_tobe_code", physicalName = "apr_tobe_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_tobe_code;

    @ElDtoField(logicalName = "apr_clsf", physicalName = "apr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_clsf;

    @ElDtoField(logicalName = "save_clsf", physicalName = "save_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_clsf;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "info", physicalName = "info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info;

    @ElDtoField(logicalName = "totl_amt", physicalName = "totl_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String totl_amt;

    @ElDtoField(logicalName = "slip_tmd_pd", physicalName = "slip_tmd_pd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_tmd_pd;

    @ElDtoField(logicalName = "req_psn_dept_nm", physicalName = "req_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_dept_nm;

    @ElDtoField(logicalName = "req_psn_nm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_seq")
    public int getReq_seq(){
        return req_seq;
    }

    @ElVoField(physicalName = "req_seq")
    public void setReq_seq(int req_seq){
        this.req_seq = req_seq;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "pslip_no")
    public String getPslip_no(){
        return pslip_no;
    }

    @ElVoField(physicalName = "pslip_no")
    public void setPslip_no(String pslip_no){
        this.pslip_no = pslip_no;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public String getReq_psn_dept_cd(){
        return req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_cd")
    public void setReq_psn_dept_cd(String req_psn_dept_cd){
        this.req_psn_dept_cd = req_psn_dept_cd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public String getReq_psn_dept_new_ymd(){
        return req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_psn_dept_new_ymd")
    public void setReq_psn_dept_new_ymd(String req_psn_dept_new_ymd){
        this.req_psn_dept_new_ymd = req_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "slip_no2")
    public String getSlip_no2(){
        return slip_no2;
    }

    @ElVoField(physicalName = "slip_no2")
    public void setSlip_no2(String slip_no2){
        this.slip_no2 = slip_no2;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "apr_tobe_code")
    public String getApr_tobe_code(){
        return apr_tobe_code;
    }

    @ElVoField(physicalName = "apr_tobe_code")
    public void setApr_tobe_code(String apr_tobe_code){
        this.apr_tobe_code = apr_tobe_code;
    }

    @ElVoField(physicalName = "apr_clsf")
    public String getApr_clsf(){
        return apr_clsf;
    }

    @ElVoField(physicalName = "apr_clsf")
    public void setApr_clsf(String apr_clsf){
        this.apr_clsf = apr_clsf;
    }

    @ElVoField(physicalName = "save_clsf")
    public String getSave_clsf(){
        return save_clsf;
    }

    @ElVoField(physicalName = "save_clsf")
    public void setSave_clsf(String save_clsf){
        this.save_clsf = save_clsf;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "info")
    public String getInfo(){
        return info;
    }

    @ElVoField(physicalName = "info")
    public void setInfo(String info){
        this.info = info;
    }

    @ElVoField(physicalName = "totl_amt")
    public String getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(String totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "slip_tmd_pd")
    public String getSlip_tmd_pd(){
        return slip_tmd_pd;
    }

    @ElVoField(physicalName = "slip_tmd_pd")
    public void setSlip_tmd_pd(String slip_tmd_pd){
        this.slip_tmd_pd = slip_tmd_pd;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public String getReq_psn_dept_nm(){
        return req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_dept_nm")
    public void setReq_psn_dept_nm(String req_psn_dept_nm){
        this.req_psn_dept_nm = req_psn_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipHMerVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("pslip_no").append("=").append(pslip_no).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_psn_dept_cd").append("=").append(req_psn_dept_cd).append(",");
        sb.append("req_psn_dept_new_ymd").append("=").append(req_psn_dept_new_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("slip_no2").append("=").append(slip_no2).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("apr_tobe_code").append("=").append(apr_tobe_code).append(",");
        sb.append("apr_clsf").append("=").append(apr_clsf).append(",");
        sb.append("save_clsf").append("=").append(save_clsf).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("info").append("=").append(info).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("slip_tmd_pd").append("=").append(slip_tmd_pd).append(",");
        sb.append("req_psn_dept_nm").append("=").append(req_psn_dept_nm).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm);
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
