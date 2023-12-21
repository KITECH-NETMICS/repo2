package kr.re.kitech.biz.res.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "사업신청 참여연구원 Vo")
public class ResAppPareVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResAppPareVo(){
    }

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "연구원구분", physicalName = "reschr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_clsf;

    @ElDtoField(logicalName = "연구원구분명", physicalName = "reschr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_clsf_nm;

    @ElDtoField(logicalName = "인건비구분", physicalName = "psnexpns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psnexpns_clsf;

    @ElDtoField(logicalName = "인건비구분명", physicalName = "psnexpns_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String psnexpns_clsf_nm;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "현금참여율", physicalName = "cash_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cash_attnce_rt;

    @ElDtoField(logicalName = "현물참여율", physicalName = "goods_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goods_attnce_rt;

    @ElDtoField(logicalName = "참여기간시작일자", physicalName = "attnce_prd_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_orign_ymd;

    @ElDtoField(logicalName = "참여기간종료일자", physicalName = "attnce_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_prd_cls_ymd;

    @ElDtoField(logicalName = " 인건비월단가", physicalName = "psnexpns_month_unit_price", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long psnexpns_month_unit_price;

    @ElDtoField(logicalName = "현금금액", physicalName = "cash_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cash_amt;

    @ElDtoField(logicalName = "현물금액", physicalName = "goods_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long goods_amt;

    @ElDtoField(logicalName = "승인여부", physicalName = "apprvl_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_yn;

    @ElDtoField(logicalName = "직무구분", physicalName = "job_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_clsf;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElDtoField(logicalName = "직군코드", physicalName = "occugrp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occugrp_cd;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "과학기술인번호", physicalName = "sci_tech_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sci_tech_regst_no;

    @ElDtoField(logicalName = "연구자등록번호", physicalName = "respersonno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respersonno;

    @ElDtoField(logicalName = "조정참여율", physicalName = "adjst_attnce_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_attnce_rt;

    @ElDtoField(logicalName = "전자결재신청번호", physicalName = "apprvl_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_req_no;

    @ElDtoField(logicalName = "승인상태", physicalName = "apprvl_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_state;

    @ElDtoField(logicalName = "책임비율", physicalName = "respn_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_rts;

    @ElDtoField(logicalName = "참여제한여부", physicalName = "restr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String restr_yn;

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public String getReschr_clsf(){
        return reschr_clsf;
    }

    @ElVoField(physicalName = "reschr_clsf")
    public void setReschr_clsf(String reschr_clsf){
        this.reschr_clsf = reschr_clsf;
    }

    @ElVoField(physicalName = "reschr_clsf_nm")
    public String getReschr_clsf_nm(){
        return reschr_clsf_nm;
    }

    @ElVoField(physicalName = "reschr_clsf_nm")
    public void setReschr_clsf_nm(String reschr_clsf_nm){
        this.reschr_clsf_nm = reschr_clsf_nm;
    }

    @ElVoField(physicalName = "psnexpns_clsf")
    public String getPsnexpns_clsf(){
        return psnexpns_clsf;
    }

    @ElVoField(physicalName = "psnexpns_clsf")
    public void setPsnexpns_clsf(String psnexpns_clsf){
        this.psnexpns_clsf = psnexpns_clsf;
    }

    @ElVoField(physicalName = "psnexpns_clsf_nm")
    public String getPsnexpns_clsf_nm(){
        return psnexpns_clsf_nm;
    }

    @ElVoField(physicalName = "psnexpns_clsf_nm")
    public void setPsnexpns_clsf_nm(String psnexpns_clsf_nm){
        this.psnexpns_clsf_nm = psnexpns_clsf_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public String getCash_attnce_rt(){
        return cash_attnce_rt;
    }

    @ElVoField(physicalName = "cash_attnce_rt")
    public void setCash_attnce_rt(String cash_attnce_rt){
        this.cash_attnce_rt = cash_attnce_rt;
    }

    @ElVoField(physicalName = "goods_attnce_rt")
    public String getGoods_attnce_rt(){
        return goods_attnce_rt;
    }

    @ElVoField(physicalName = "goods_attnce_rt")
    public void setGoods_attnce_rt(String goods_attnce_rt){
        this.goods_attnce_rt = goods_attnce_rt;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public String getAttnce_prd_orign_ymd(){
        return attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_orign_ymd")
    public void setAttnce_prd_orign_ymd(String attnce_prd_orign_ymd){
        this.attnce_prd_orign_ymd = attnce_prd_orign_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public String getAttnce_prd_cls_ymd(){
        return attnce_prd_cls_ymd;
    }

    @ElVoField(physicalName = "attnce_prd_cls_ymd")
    public void setAttnce_prd_cls_ymd(String attnce_prd_cls_ymd){
        this.attnce_prd_cls_ymd = attnce_prd_cls_ymd;
    }

    @ElVoField(physicalName = "psnexpns_month_unit_price")
    public long getPsnexpns_month_unit_price(){
        return psnexpns_month_unit_price;
    }

    @ElVoField(physicalName = "psnexpns_month_unit_price")
    public void setPsnexpns_month_unit_price(long psnexpns_month_unit_price){
        this.psnexpns_month_unit_price = psnexpns_month_unit_price;
    }

    @ElVoField(physicalName = "cash_amt")
    public long getCash_amt(){
        return cash_amt;
    }

    @ElVoField(physicalName = "cash_amt")
    public void setCash_amt(long cash_amt){
        this.cash_amt = cash_amt;
    }

    @ElVoField(physicalName = "goods_amt")
    public long getGoods_amt(){
        return goods_amt;
    }

    @ElVoField(physicalName = "goods_amt")
    public void setGoods_amt(long goods_amt){
        this.goods_amt = goods_amt;
    }

    @ElVoField(physicalName = "apprvl_yn")
    public String getApprvl_yn(){
        return apprvl_yn;
    }

    @ElVoField(physicalName = "apprvl_yn")
    public void setApprvl_yn(String apprvl_yn){
        this.apprvl_yn = apprvl_yn;
    }

    @ElVoField(physicalName = "job_clsf")
    public String getJob_clsf(){
        return job_clsf;
    }

    @ElVoField(physicalName = "job_clsf")
    public void setJob_clsf(String job_clsf){
        this.job_clsf = job_clsf;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public String getOccugrp_cd(){
        return occugrp_cd;
    }

    @ElVoField(physicalName = "occugrp_cd")
    public void setOccugrp_cd(String occugrp_cd){
        this.occugrp_cd = occugrp_cd;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public String getSci_tech_regst_no(){
        return sci_tech_regst_no;
    }

    @ElVoField(physicalName = "sci_tech_regst_no")
    public void setSci_tech_regst_no(String sci_tech_regst_no){
        this.sci_tech_regst_no = sci_tech_regst_no;
    }

    @ElVoField(physicalName = "respersonno")
    public String getRespersonno(){
        return respersonno;
    }

    @ElVoField(physicalName = "respersonno")
    public void setRespersonno(String respersonno){
        this.respersonno = respersonno;
    }

    @ElVoField(physicalName = "adjst_attnce_rt")
    public String getAdjst_attnce_rt(){
        return adjst_attnce_rt;
    }

    @ElVoField(physicalName = "adjst_attnce_rt")
    public void setAdjst_attnce_rt(String adjst_attnce_rt){
        this.adjst_attnce_rt = adjst_attnce_rt;
    }

    @ElVoField(physicalName = "apprvl_req_no")
    public String getApprvl_req_no(){
        return apprvl_req_no;
    }

    @ElVoField(physicalName = "apprvl_req_no")
    public void setApprvl_req_no(String apprvl_req_no){
        this.apprvl_req_no = apprvl_req_no;
    }

    @ElVoField(physicalName = "apprvl_state")
    public String getApprvl_state(){
        return apprvl_state;
    }

    @ElVoField(physicalName = "apprvl_state")
    public void setApprvl_state(String apprvl_state){
        this.apprvl_state = apprvl_state;
    }

    @ElVoField(physicalName = "respn_rts")
    public String getRespn_rts(){
        return respn_rts;
    }

    @ElVoField(physicalName = "respn_rts")
    public void setRespn_rts(String respn_rts){
        this.respn_rts = respn_rts;
    }

    @ElVoField(physicalName = "restr_yn")
    public String getRestr_yn(){
        return restr_yn;
    }

    @ElVoField(physicalName = "restr_yn")
    public void setRestr_yn(String restr_yn){
        this.restr_yn = restr_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResAppPareVo [");
        sb.append("bsns_req_no").append("=").append(bsns_req_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("reschr_clsf").append("=").append(reschr_clsf).append(",");
        sb.append("reschr_clsf_nm").append("=").append(reschr_clsf_nm).append(",");
        sb.append("psnexpns_clsf").append("=").append(psnexpns_clsf).append(",");
        sb.append("psnexpns_clsf_nm").append("=").append(psnexpns_clsf_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("cash_attnce_rt").append("=").append(cash_attnce_rt).append(",");
        sb.append("goods_attnce_rt").append("=").append(goods_attnce_rt).append(",");
        sb.append("attnce_prd_orign_ymd").append("=").append(attnce_prd_orign_ymd).append(",");
        sb.append("attnce_prd_cls_ymd").append("=").append(attnce_prd_cls_ymd).append(",");
        sb.append("psnexpns_month_unit_price").append("=").append(psnexpns_month_unit_price).append(",");
        sb.append("cash_amt").append("=").append(cash_amt).append(",");
        sb.append("goods_amt").append("=").append(goods_amt).append(",");
        sb.append("apprvl_yn").append("=").append(apprvl_yn).append(",");
        sb.append("job_clsf").append("=").append(job_clsf).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("resid_no").append("=").append(resid_no).append(",");
        sb.append("occugrp_cd").append("=").append(occugrp_cd).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("sci_tech_regst_no").append("=").append(sci_tech_regst_no).append(",");
        sb.append("respersonno").append("=").append(respersonno).append(",");
        sb.append("adjst_attnce_rt").append("=").append(adjst_attnce_rt).append(",");
        sb.append("apprvl_req_no").append("=").append(apprvl_req_no).append(",");
        sb.append("apprvl_state").append("=").append(apprvl_state).append(",");
        sb.append("respn_rts").append("=").append(respn_rts).append(",");
        sb.append("restr_yn").append("=").append(restr_yn);
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
