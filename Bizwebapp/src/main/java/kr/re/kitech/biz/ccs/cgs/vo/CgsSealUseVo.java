package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "직인인감신청")
public class CgsSealUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsSealUseVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqYmd1", physicalName = "req_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd1;

    @ElDtoField(logicalName = "reqYmd2", physicalName = "req_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd2;

    @ElDtoField(logicalName = "sealClsf", physicalName = "seal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seal_clsf;

    @ElDtoField(logicalName = "useDeptCd", physicalName = "use_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_cd;

    @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "sealClsfNm", physicalName = "seal_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seal_clsf_nm;

    @ElDtoField(logicalName = "stampChar", physicalName = "stamp_char", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_char;

    @ElDtoField(logicalName = "stampStd", physicalName = "stamp_std", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_std;

    @ElDtoField(logicalName = "size", physicalName = "size", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String size;

    @ElDtoField(logicalName = "detailInfo", physicalName = "detail_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detail_info;

    @ElDtoField(logicalName = "qty", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "unit", physicalName = "unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unit;

    @ElDtoField(logicalName = "mngmtRespnPsnDeptCd", physicalName = "mngmt_respn_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_dept_cd;

    @ElDtoField(logicalName = "mngmtRespnPsnDeptNm", physicalName = "mngmt_respn_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_dept_nm;

    @ElDtoField(logicalName = "mngmtRespnPsnDeptNewYmd", physicalName = "mngmt_respn_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_dept_new_ymd;

    @ElDtoField(logicalName = "mngmtRespnPsnSyspayno", physicalName = "mngmt_respn_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_syspayno;

    @ElDtoField(logicalName = "mngmtRespnPsnEmpno", physicalName = "mngmt_respn_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_empno;

    @ElDtoField(logicalName = "mngmtRespnPsnNm", physicalName = "mngmt_respn_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_respn_psn_nm;

    @ElDtoField(logicalName = "useDeptNm", physicalName = "use_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_nm;

    @ElDtoField(logicalName = "useDeptNewYmd", physicalName = "use_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_dept_new_ymd;

    @ElDtoField(logicalName = "useUsg", physicalName = "use_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_usg;

    @ElDtoField(logicalName = "stampReqResn", physicalName = "stamp_req_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_req_resn;

    @ElDtoField(logicalName = "useOrignYmd", physicalName = "use_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_orign_ymd;

    @ElDtoField(logicalName = "useClsYmd", physicalName = "use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_cls_ymd;

    @ElDtoField(logicalName = "useTerm", physicalName = "use_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_term;

    @ElDtoField(logicalName = "sealMatrl", physicalName = "seal_matrl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seal_matrl;

    @ElDtoField(logicalName = "spclabItem", physicalName = "spclab_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "DB", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spclab_item;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "reqState", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "purYmd", physicalName = "pur_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_ymd;

    @ElDtoField(logicalName = "surtyAffirYmd", physicalName = "surty_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String surty_affir_ymd;

    @ElDtoField(logicalName = "surtySyspayno", physicalName = "surty_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String surty_syspayno;

    @ElDtoField(logicalName = "reqStateNm", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "reqPsnNm", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "reqEmpNo", physicalName = "req_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_emp_no;

    @ElDtoField(logicalName = "reqDeptNm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "reqPosiNm", physicalName = "req_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_posi_nm;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "cudType", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "aprEmpNo", physicalName = "apr_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_emp_no;

    @ElDtoField(logicalName = "aprDeptNm", physicalName = "apr_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_dept_nm;

    @ElDtoField(logicalName = "aprNm", physicalName = "apr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_nm;

    @ElDtoField(logicalName = "aprPosi", physicalName = "apr_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_posi;

    @ElDtoField(logicalName = "aprUseOrignYmd", physicalName = "apr_use_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_use_orign_ymd;

    @ElDtoField(logicalName = "aprUseClsYmd", physicalName = "apr_use_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_use_cls_ymd;

    @ElDtoField(logicalName = "aprMngmtRespnPsnDeptNm", physicalName = "apr_mngmt_respn_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_mngmt_respn_psn_dept_nm;

    @ElDtoField(logicalName = "extNo", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "depthed", physicalName = "depthed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed;

    @ElDtoField(logicalName = "depthedNm", physicalName = "depthed_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depthed_nm;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd1")
    public String getReq_ymd1(){
        return req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd1")
    public void setReq_ymd1(String req_ymd1){
        this.req_ymd1 = req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd2")
    public String getReq_ymd2(){
        return req_ymd2;
    }

    @ElVoField(physicalName = "req_ymd2")
    public void setReq_ymd2(String req_ymd2){
        this.req_ymd2 = req_ymd2;
    }

    @ElVoField(physicalName = "seal_clsf")
    public String getSeal_clsf(){
        return seal_clsf;
    }

    @ElVoField(physicalName = "seal_clsf")
    public void setSeal_clsf(String seal_clsf){
        this.seal_clsf = seal_clsf;
    }

    @ElVoField(physicalName = "use_dept_cd")
    public String getUse_dept_cd(){
        return use_dept_cd;
    }

    @ElVoField(physicalName = "use_dept_cd")
    public void setUse_dept_cd(String use_dept_cd){
        this.use_dept_cd = use_dept_cd;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "seal_clsf_nm")
    public String getSeal_clsf_nm(){
        return seal_clsf_nm;
    }

    @ElVoField(physicalName = "seal_clsf_nm")
    public void setSeal_clsf_nm(String seal_clsf_nm){
        this.seal_clsf_nm = seal_clsf_nm;
    }

    @ElVoField(physicalName = "stamp_char")
    public String getStamp_char(){
        return stamp_char;
    }

    @ElVoField(physicalName = "stamp_char")
    public void setStamp_char(String stamp_char){
        this.stamp_char = stamp_char;
    }

    @ElVoField(physicalName = "stamp_std")
    public String getStamp_std(){
        return stamp_std;
    }

    @ElVoField(physicalName = "stamp_std")
    public void setStamp_std(String stamp_std){
        this.stamp_std = stamp_std;
    }

    @ElVoField(physicalName = "size")
    public String getSize(){
        return size;
    }

    @ElVoField(physicalName = "size")
    public void setSize(String size){
        this.size = size;
    }

    @ElVoField(physicalName = "detail_info")
    public String getDetail_info(){
        return detail_info;
    }

    @ElVoField(physicalName = "detail_info")
    public void setDetail_info(String detail_info){
        this.detail_info = detail_info;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "unit")
    public String getUnit(){
        return unit;
    }

    @ElVoField(physicalName = "unit")
    public void setUnit(String unit){
        this.unit = unit;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_cd")
    public String getMngmt_respn_psn_dept_cd(){
        return mngmt_respn_psn_dept_cd;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_cd")
    public void setMngmt_respn_psn_dept_cd(String mngmt_respn_psn_dept_cd){
        this.mngmt_respn_psn_dept_cd = mngmt_respn_psn_dept_cd;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_nm")
    public String getMngmt_respn_psn_dept_nm(){
        return mngmt_respn_psn_dept_nm;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_nm")
    public void setMngmt_respn_psn_dept_nm(String mngmt_respn_psn_dept_nm){
        this.mngmt_respn_psn_dept_nm = mngmt_respn_psn_dept_nm;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_new_ymd")
    public String getMngmt_respn_psn_dept_new_ymd(){
        return mngmt_respn_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_dept_new_ymd")
    public void setMngmt_respn_psn_dept_new_ymd(String mngmt_respn_psn_dept_new_ymd){
        this.mngmt_respn_psn_dept_new_ymd = mngmt_respn_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_syspayno")
    public String getMngmt_respn_psn_syspayno(){
        return mngmt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_syspayno")
    public void setMngmt_respn_psn_syspayno(String mngmt_respn_psn_syspayno){
        this.mngmt_respn_psn_syspayno = mngmt_respn_psn_syspayno;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_empno")
    public String getMngmt_respn_psn_empno(){
        return mngmt_respn_psn_empno;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_empno")
    public void setMngmt_respn_psn_empno(String mngmt_respn_psn_empno){
        this.mngmt_respn_psn_empno = mngmt_respn_psn_empno;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_nm")
    public String getMngmt_respn_psn_nm(){
        return mngmt_respn_psn_nm;
    }

    @ElVoField(physicalName = "mngmt_respn_psn_nm")
    public void setMngmt_respn_psn_nm(String mngmt_respn_psn_nm){
        this.mngmt_respn_psn_nm = mngmt_respn_psn_nm;
    }

    @ElVoField(physicalName = "use_dept_nm")
    public String getUse_dept_nm(){
        return use_dept_nm;
    }

    @ElVoField(physicalName = "use_dept_nm")
    public void setUse_dept_nm(String use_dept_nm){
        this.use_dept_nm = use_dept_nm;
    }

    @ElVoField(physicalName = "use_dept_new_ymd")
    public String getUse_dept_new_ymd(){
        return use_dept_new_ymd;
    }

    @ElVoField(physicalName = "use_dept_new_ymd")
    public void setUse_dept_new_ymd(String use_dept_new_ymd){
        this.use_dept_new_ymd = use_dept_new_ymd;
    }

    @ElVoField(physicalName = "use_usg")
    public String getUse_usg(){
        return use_usg;
    }

    @ElVoField(physicalName = "use_usg")
    public void setUse_usg(String use_usg){
        this.use_usg = use_usg;
    }

    @ElVoField(physicalName = "stamp_req_resn")
    public String getStamp_req_resn(){
        return stamp_req_resn;
    }

    @ElVoField(physicalName = "stamp_req_resn")
    public void setStamp_req_resn(String stamp_req_resn){
        this.stamp_req_resn = stamp_req_resn;
    }

    @ElVoField(physicalName = "use_orign_ymd")
    public String getUse_orign_ymd(){
        return use_orign_ymd;
    }

    @ElVoField(physicalName = "use_orign_ymd")
    public void setUse_orign_ymd(String use_orign_ymd){
        this.use_orign_ymd = use_orign_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public String getUse_cls_ymd(){
        return use_cls_ymd;
    }

    @ElVoField(physicalName = "use_cls_ymd")
    public void setUse_cls_ymd(String use_cls_ymd){
        this.use_cls_ymd = use_cls_ymd;
    }

    @ElVoField(physicalName = "use_term")
    public String getUse_term(){
        return use_term;
    }

    @ElVoField(physicalName = "use_term")
    public void setUse_term(String use_term){
        this.use_term = use_term;
    }

    @ElVoField(physicalName = "seal_matrl")
    public String getSeal_matrl(){
        return seal_matrl;
    }

    @ElVoField(physicalName = "seal_matrl")
    public void setSeal_matrl(String seal_matrl){
        this.seal_matrl = seal_matrl;
    }

    @ElVoField(physicalName = "spclab_item")
    public String getSpclab_item(){
        return com.inswave.elfw.security.ElCryptoUtil.getEncrypt("", spclab_item, false, true);
    }

    @ElVoField(physicalName = "spclab_item")
    public void setSpclab_item(String spclab_item){
        this.spclab_item = com.inswave.elfw.security.ElCryptoUtil.getDecrypt("", spclab_item, false, true);
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "pur_ymd")
    public String getPur_ymd(){
        return pur_ymd;
    }

    @ElVoField(physicalName = "pur_ymd")
    public void setPur_ymd(String pur_ymd){
        this.pur_ymd = pur_ymd;
    }

    @ElVoField(physicalName = "surty_affir_ymd")
    public String getSurty_affir_ymd(){
        return surty_affir_ymd;
    }

    @ElVoField(physicalName = "surty_affir_ymd")
    public void setSurty_affir_ymd(String surty_affir_ymd){
        this.surty_affir_ymd = surty_affir_ymd;
    }

    @ElVoField(physicalName = "surty_syspayno")
    public String getSurty_syspayno(){
        return surty_syspayno;
    }

    @ElVoField(physicalName = "surty_syspayno")
    public void setSurty_syspayno(String surty_syspayno){
        this.surty_syspayno = surty_syspayno;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_emp_no")
    public String getReq_emp_no(){
        return req_emp_no;
    }

    @ElVoField(physicalName = "req_emp_no")
    public void setReq_emp_no(String req_emp_no){
        this.req_emp_no = req_emp_no;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public String getReq_posi_nm(){
        return req_posi_nm;
    }

    @ElVoField(physicalName = "req_posi_nm")
    public void setReq_posi_nm(String req_posi_nm){
        this.req_posi_nm = req_posi_nm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "apr_emp_no")
    public String getApr_emp_no(){
        return apr_emp_no;
    }

    @ElVoField(physicalName = "apr_emp_no")
    public void setApr_emp_no(String apr_emp_no){
        this.apr_emp_no = apr_emp_no;
    }

    @ElVoField(physicalName = "apr_dept_nm")
    public String getApr_dept_nm(){
        return apr_dept_nm;
    }

    @ElVoField(physicalName = "apr_dept_nm")
    public void setApr_dept_nm(String apr_dept_nm){
        this.apr_dept_nm = apr_dept_nm;
    }

    @ElVoField(physicalName = "apr_nm")
    public String getApr_nm(){
        return apr_nm;
    }

    @ElVoField(physicalName = "apr_nm")
    public void setApr_nm(String apr_nm){
        this.apr_nm = apr_nm;
    }

    @ElVoField(physicalName = "apr_posi")
    public String getApr_posi(){
        return apr_posi;
    }

    @ElVoField(physicalName = "apr_posi")
    public void setApr_posi(String apr_posi){
        this.apr_posi = apr_posi;
    }

    @ElVoField(physicalName = "apr_use_orign_ymd")
    public String getApr_use_orign_ymd(){
        return apr_use_orign_ymd;
    }

    @ElVoField(physicalName = "apr_use_orign_ymd")
    public void setApr_use_orign_ymd(String apr_use_orign_ymd){
        this.apr_use_orign_ymd = apr_use_orign_ymd;
    }

    @ElVoField(physicalName = "apr_use_cls_ymd")
    public String getApr_use_cls_ymd(){
        return apr_use_cls_ymd;
    }

    @ElVoField(physicalName = "apr_use_cls_ymd")
    public void setApr_use_cls_ymd(String apr_use_cls_ymd){
        this.apr_use_cls_ymd = apr_use_cls_ymd;
    }

    @ElVoField(physicalName = "apr_mngmt_respn_psn_dept_nm")
    public String getApr_mngmt_respn_psn_dept_nm(){
        return apr_mngmt_respn_psn_dept_nm;
    }

    @ElVoField(physicalName = "apr_mngmt_respn_psn_dept_nm")
    public void setApr_mngmt_respn_psn_dept_nm(String apr_mngmt_respn_psn_dept_nm){
        this.apr_mngmt_respn_psn_dept_nm = apr_mngmt_respn_psn_dept_nm;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "depthed")
    public String getDepthed(){
        return depthed;
    }

    @ElVoField(physicalName = "depthed")
    public void setDepthed(String depthed){
        this.depthed = depthed;
    }

    @ElVoField(physicalName = "depthed_nm")
    public String getDepthed_nm(){
        return depthed_nm;
    }

    @ElVoField(physicalName = "depthed_nm")
    public void setDepthed_nm(String depthed_nm){
        this.depthed_nm = depthed_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsSealUseVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd1").append("=").append(req_ymd1).append(",");
        sb.append("req_ymd2").append("=").append(req_ymd2).append(",");
        sb.append("seal_clsf").append("=").append(seal_clsf).append(",");
        sb.append("use_dept_cd").append("=").append(use_dept_cd).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("seal_clsf_nm").append("=").append(seal_clsf_nm).append(",");
        sb.append("stamp_char").append("=").append(stamp_char).append(",");
        sb.append("stamp_std").append("=").append(stamp_std).append(",");
        sb.append("size").append("=").append(size).append(",");
        sb.append("detail_info").append("=").append(detail_info).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("unit").append("=").append(unit).append(",");
        sb.append("mngmt_respn_psn_dept_cd").append("=").append(mngmt_respn_psn_dept_cd).append(",");
        sb.append("mngmt_respn_psn_dept_nm").append("=").append(mngmt_respn_psn_dept_nm).append(",");
        sb.append("mngmt_respn_psn_dept_new_ymd").append("=").append(mngmt_respn_psn_dept_new_ymd).append(",");
        sb.append("mngmt_respn_psn_syspayno").append("=").append(mngmt_respn_psn_syspayno).append(",");
        sb.append("mngmt_respn_psn_empno").append("=").append(mngmt_respn_psn_empno).append(",");
        sb.append("mngmt_respn_psn_nm").append("=").append(mngmt_respn_psn_nm).append(",");
        sb.append("use_dept_nm").append("=").append(use_dept_nm).append(",");
        sb.append("use_dept_new_ymd").append("=").append(use_dept_new_ymd).append(",");
        sb.append("use_usg").append("=").append(use_usg).append(",");
        sb.append("stamp_req_resn").append("=").append(stamp_req_resn).append(",");
        sb.append("use_orign_ymd").append("=").append(use_orign_ymd).append(",");
        sb.append("use_cls_ymd").append("=").append(use_cls_ymd).append(",");
        sb.append("use_term").append("=").append(use_term).append(",");
        sb.append("seal_matrl").append("=").append(seal_matrl).append(",");
        sb.append("spclab_item").append("=").append(this.getSpclab_item()).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("pur_ymd").append("=").append(pur_ymd).append(",");
        sb.append("surty_affir_ymd").append("=").append(surty_affir_ymd).append(",");
        sb.append("surty_syspayno").append("=").append(surty_syspayno).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_emp_no").append("=").append(req_emp_no).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_posi_nm").append("=").append(req_posi_nm).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("apr_emp_no").append("=").append(apr_emp_no).append(",");
        sb.append("apr_dept_nm").append("=").append(apr_dept_nm).append(",");
        sb.append("apr_nm").append("=").append(apr_nm).append(",");
        sb.append("apr_posi").append("=").append(apr_posi).append(",");
        sb.append("apr_use_orign_ymd").append("=").append(apr_use_orign_ymd).append(",");
        sb.append("apr_use_cls_ymd").append("=").append(apr_use_cls_ymd).append(",");
        sb.append("apr_mngmt_respn_psn_dept_nm").append("=").append(apr_mngmt_respn_psn_dept_nm).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("depthed").append("=").append(depthed).append(",");
        sb.append("depthed_nm").append("=").append(depthed_nm);
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
