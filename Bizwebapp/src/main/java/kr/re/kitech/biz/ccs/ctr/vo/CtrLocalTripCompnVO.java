package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "근거리출장자")
public class CtrLocalTripCompnVO extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrLocalTripCompnVO(){
    }

    @ElDtoField(logicalName = "작성번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "출장자시스템번호", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장자사원번호", physicalName = "biztrip_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_empno;

    @ElDtoField(logicalName = "출장자명", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "출장자부서코드", physicalName = "biztrip_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_dept_cd;

    @ElDtoField(logicalName = "출장자부서명", physicalName = "biztrip_psn_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_dept_nm;

    @ElDtoField(logicalName = "부서신설일자", physicalName = "biztrip_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_dept_new_ymd;

    @ElDtoField(logicalName = "대행자시스템번호", physicalName = "agent_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_syspayno;

    @ElDtoField(logicalName = "대행자사원번호", physicalName = "agent_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_empno;

    @ElDtoField(logicalName = "대행자명", physicalName = "agent_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_nm;

    @ElDtoField(logicalName = "비상연락번호", physicalName = "emgnc_contac_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emgnc_contac_no;

    @ElDtoField(logicalName = "지급금액", physicalName = "pay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pay_amt;

    @ElDtoField(logicalName = "지급비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "조합원코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public String getBiztrip_psn_syspayno(){
        return biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_syspayno")
    public void setBiztrip_psn_syspayno(String biztrip_psn_syspayno){
        this.biztrip_psn_syspayno = biztrip_psn_syspayno;
    }

    @ElVoField(physicalName = "biztrip_psn_empno")
    public String getBiztrip_psn_empno(){
        return biztrip_psn_empno;
    }

    @ElVoField(physicalName = "biztrip_psn_empno")
    public void setBiztrip_psn_empno(String biztrip_psn_empno){
        this.biztrip_psn_empno = biztrip_psn_empno;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public String getBiztrip_psn_nm(){
        return biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_nm")
    public void setBiztrip_psn_nm(String biztrip_psn_nm){
        this.biztrip_psn_nm = biztrip_psn_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_cd")
    public String getBiztrip_psn_dept_cd(){
        return biztrip_psn_dept_cd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_cd")
    public void setBiztrip_psn_dept_cd(String biztrip_psn_dept_cd){
        this.biztrip_psn_dept_cd = biztrip_psn_dept_cd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_nm")
    public String getBiztrip_psn_dept_nm(){
        return biztrip_psn_dept_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_nm")
    public void setBiztrip_psn_dept_nm(String biztrip_psn_dept_nm){
        this.biztrip_psn_dept_nm = biztrip_psn_dept_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_new_ymd")
    public String getBiztrip_psn_dept_new_ymd(){
        return biztrip_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_new_ymd")
    public void setBiztrip_psn_dept_new_ymd(String biztrip_psn_dept_new_ymd){
        this.biztrip_psn_dept_new_ymd = biztrip_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public String getAgent_psn_syspayno(){
        return agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public void setAgent_psn_syspayno(String agent_psn_syspayno){
        this.agent_psn_syspayno = agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_empno")
    public String getAgent_psn_empno(){
        return agent_psn_empno;
    }

    @ElVoField(physicalName = "agent_psn_empno")
    public void setAgent_psn_empno(String agent_psn_empno){
        this.agent_psn_empno = agent_psn_empno;
    }

    @ElVoField(physicalName = "agent_psn_nm")
    public String getAgent_psn_nm(){
        return agent_psn_nm;
    }

    @ElVoField(physicalName = "agent_psn_nm")
    public void setAgent_psn_nm(String agent_psn_nm){
        this.agent_psn_nm = agent_psn_nm;
    }

    @ElVoField(physicalName = "emgnc_contac_no")
    public String getEmgnc_contac_no(){
        return emgnc_contac_no;
    }

    @ElVoField(physicalName = "emgnc_contac_no")
    public void setEmgnc_contac_no(String emgnc_contac_no){
        this.emgnc_contac_no = emgnc_contac_no;
    }

    @ElVoField(physicalName = "pay_amt")
    public long getPay_amt(){
        return pay_amt;
    }

    @ElVoField(physicalName = "pay_amt")
    public void setPay_amt(long pay_amt){
        this.pay_amt = pay_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrLocalTripCompnVO [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("biztrip_psn_empno").append("=").append(biztrip_psn_empno).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("biztrip_psn_dept_cd").append("=").append(biztrip_psn_dept_cd).append(",");
        sb.append("biztrip_psn_dept_nm").append("=").append(biztrip_psn_dept_nm).append(",");
        sb.append("biztrip_psn_dept_new_ymd").append("=").append(biztrip_psn_dept_new_ymd).append(",");
        sb.append("agent_psn_syspayno").append("=").append(agent_psn_syspayno).append(",");
        sb.append("agent_psn_empno").append("=").append(agent_psn_empno).append(",");
        sb.append("agent_psn_nm").append("=").append(agent_psn_nm).append(",");
        sb.append("emgnc_contac_no").append("=").append(emgnc_contac_no).append(",");
        sb.append("pay_amt").append("=").append(pay_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("commute_cd").append("=").append(commute_cd);
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
