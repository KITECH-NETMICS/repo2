package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장신청 조회 Vo")
public class CtrDomTripVo extends kr.re.kitech.biz.ccs.ctr.vo.CtrDomVo {
    private static final long serialVersionUID = 1L;

    public CtrDomTripVo(){
    }

    @ElDtoField(logicalName = "신청자성명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청자개인번호", physicalName = "req_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_empno;

    @ElDtoField(logicalName = "신청자부서", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "숙박비없음여부", physicalName = "lodg_fee_chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String lodg_fee_chk;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "현 총액", physicalName = "cu_tot_expns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cu_tot_expns;

    @ElDtoField(logicalName = "학술대회명", physicalName = "pool_conf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pool_conf_nm;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "출장목적구분명", physicalName = "biztrip_goal_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_goal_clsf_nm;

    @ElDtoField(logicalName = "결의처리상태", physicalName = "slip_prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_prcs_state;

    @ElDtoField(logicalName = "동반자수", physicalName = "compn_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int compn_cnt;

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public String getReq_psn_empno(){
        return req_psn_empno;
    }

    @ElVoField(physicalName = "req_psn_empno")
    public void setReq_psn_empno(String req_psn_empno){
        this.req_psn_empno = req_psn_empno;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "lodg_fee_chk")
    public String getLodg_fee_chk(){
        return lodg_fee_chk;
    }

    @ElVoField(physicalName = "lodg_fee_chk")
    public void setLodg_fee_chk(String lodg_fee_chk){
        this.lodg_fee_chk = lodg_fee_chk;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "cu_tot_expns")
    public String getCu_tot_expns(){
        return cu_tot_expns;
    }

    @ElVoField(physicalName = "cu_tot_expns")
    public void setCu_tot_expns(String cu_tot_expns){
        this.cu_tot_expns = cu_tot_expns;
    }

    @ElVoField(physicalName = "pool_conf_nm")
    public String getPool_conf_nm(){
        return pool_conf_nm;
    }

    @ElVoField(physicalName = "pool_conf_nm")
    public void setPool_conf_nm(String pool_conf_nm){
        this.pool_conf_nm = pool_conf_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf_nm")
    public String getBiztrip_goal_clsf_nm(){
        return biztrip_goal_clsf_nm;
    }

    @ElVoField(physicalName = "biztrip_goal_clsf_nm")
    public void setBiztrip_goal_clsf_nm(String biztrip_goal_clsf_nm){
        this.biztrip_goal_clsf_nm = biztrip_goal_clsf_nm;
    }

    @ElVoField(physicalName = "slip_prcs_state")
    public String getSlip_prcs_state(){
        return slip_prcs_state;
    }

    @ElVoField(physicalName = "slip_prcs_state")
    public void setSlip_prcs_state(String slip_prcs_state){
        this.slip_prcs_state = slip_prcs_state;
    }

    @ElVoField(physicalName = "compn_cnt")
    public int getCompn_cnt(){
        return compn_cnt;
    }

    @ElVoField(physicalName = "compn_cnt")
    public void setCompn_cnt(int compn_cnt){
        this.compn_cnt = compn_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomTripVo [");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_psn_empno").append("=").append(req_psn_empno).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("lodg_fee_chk").append("=").append(lodg_fee_chk).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("cu_tot_expns").append("=").append(cu_tot_expns).append(",");
        sb.append("pool_conf_nm").append("=").append(pool_conf_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("biztrip_goal_clsf_nm").append("=").append(biztrip_goal_clsf_nm).append(",");
        sb.append("slip_prcs_state").append("=").append(slip_prcs_state).append(",");
        sb.append("compn_cnt").append("=").append(compn_cnt);
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
