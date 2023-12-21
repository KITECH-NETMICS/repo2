package kr.re.kitech.biz.ccs.ctr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "국내출장 동반자 Vo")
public class CtrDomCompnVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CtrDomCompnVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "순번", physicalName = "req_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_seq;

    @ElDtoField(logicalName = "출장신청번호", physicalName = "biztrip_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_req_no;

    @ElDtoField(logicalName = "출장자구분", physicalName = "biztrip_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_clsf;

    @ElDtoField(logicalName = "출장자구분명", physicalName = "biztrip_psn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_clsf_nm;

    @ElDtoField(logicalName = "출장자시스템개인번호", physicalName = "biztrip_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_syspayno;

    @ElDtoField(logicalName = "출장자개인번호", physicalName = "biztrip_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_empno;

    @ElDtoField(logicalName = "출장자성명", physicalName = "biztrip_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_nm;

    @ElDtoField(logicalName = "출장자직급", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "출장자직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "출장자부서코드", physicalName = "biztrip_psn_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_dept_cd;

    @ElDtoField(logicalName = "출장자부서신설일자", physicalName = "biztrip_psn_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_psn_dept_new_ymd;

    @ElDtoField(logicalName = "출장자부서명", physicalName = "biztrip_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_dept_nm;

    @ElDtoField(logicalName = "편성단위", physicalName = "fomat_unit", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fomat_unit;

    @ElDtoField(logicalName = "직급구분", physicalName = "posi_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_clsf;

    @ElDtoField(logicalName = "직급구분명", physicalName = "posi_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_clsf_nm;

    @ElDtoField(logicalName = "대행자시스템개인번호", physicalName = "agent_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_psn_syspayno;

    @ElDtoField(logicalName = "대행자명", physicalName = "agent_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_nm;

    @ElDtoField(logicalName = "대행자개인번호", physicalName = "agent_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String agent_empno;

    @ElDtoField(logicalName = "출장밤", physicalName = "biztrip_nght", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_nght;

    @ElDtoField(logicalName = "출장낮", physicalName = "biztrip_day", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int biztrip_day;

    @ElDtoField(logicalName = "출장시작일자(정산)", physicalName = "biztrip_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_orign_ymd;

    @ElDtoField(logicalName = "출장종료일자(정산)", physicalName = "biztrip_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biztrip_cls_ymd;

    @ElDtoField(logicalName = "조합원코드", physicalName = "commute_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String commute_cd;

    @ElDtoField(logicalName = "취소여부(정산)", physicalName = "chng_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chng_clsf;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

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

    @ElVoField(physicalName = "biztrip_req_no")
    public String getBiztrip_req_no(){
        return biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_req_no")
    public void setBiztrip_req_no(String biztrip_req_no){
        this.biztrip_req_no = biztrip_req_no;
    }

    @ElVoField(physicalName = "biztrip_psn_clsf")
    public String getBiztrip_psn_clsf(){
        return biztrip_psn_clsf;
    }

    @ElVoField(physicalName = "biztrip_psn_clsf")
    public void setBiztrip_psn_clsf(String biztrip_psn_clsf){
        this.biztrip_psn_clsf = biztrip_psn_clsf;
    }

    @ElVoField(physicalName = "biztrip_psn_clsf_nm")
    public String getBiztrip_psn_clsf_nm(){
        return biztrip_psn_clsf_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_clsf_nm")
    public void setBiztrip_psn_clsf_nm(String biztrip_psn_clsf_nm){
        this.biztrip_psn_clsf_nm = biztrip_psn_clsf_nm;
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

    @ElVoField(physicalName = "posi_cd")
    public String getPosi_cd(){
        return posi_cd;
    }

    @ElVoField(physicalName = "posi_cd")
    public void setPosi_cd(String posi_cd){
        this.posi_cd = posi_cd;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_cd")
    public String getBiztrip_psn_dept_cd(){
        return biztrip_psn_dept_cd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_cd")
    public void setBiztrip_psn_dept_cd(String biztrip_psn_dept_cd){
        this.biztrip_psn_dept_cd = biztrip_psn_dept_cd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_new_ymd")
    public String getBiztrip_psn_dept_new_ymd(){
        return biztrip_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "biztrip_psn_dept_new_ymd")
    public void setBiztrip_psn_dept_new_ymd(String biztrip_psn_dept_new_ymd){
        this.biztrip_psn_dept_new_ymd = biztrip_psn_dept_new_ymd;
    }

    @ElVoField(physicalName = "biztrip_dept_nm")
    public String getBiztrip_dept_nm(){
        return biztrip_dept_nm;
    }

    @ElVoField(physicalName = "biztrip_dept_nm")
    public void setBiztrip_dept_nm(String biztrip_dept_nm){
        this.biztrip_dept_nm = biztrip_dept_nm;
    }

    @ElVoField(physicalName = "fomat_unit")
    public String getFomat_unit(){
        return fomat_unit;
    }

    @ElVoField(physicalName = "fomat_unit")
    public void setFomat_unit(String fomat_unit){
        this.fomat_unit = fomat_unit;
    }

    @ElVoField(physicalName = "posi_clsf")
    public String getPosi_clsf(){
        return posi_clsf;
    }

    @ElVoField(physicalName = "posi_clsf")
    public void setPosi_clsf(String posi_clsf){
        this.posi_clsf = posi_clsf;
    }

    @ElVoField(physicalName = "posi_clsf_nm")
    public String getPosi_clsf_nm(){
        return posi_clsf_nm;
    }

    @ElVoField(physicalName = "posi_clsf_nm")
    public void setPosi_clsf_nm(String posi_clsf_nm){
        this.posi_clsf_nm = posi_clsf_nm;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public String getAgent_psn_syspayno(){
        return agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_psn_syspayno")
    public void setAgent_psn_syspayno(String agent_psn_syspayno){
        this.agent_psn_syspayno = agent_psn_syspayno;
    }

    @ElVoField(physicalName = "agent_nm")
    public String getAgent_nm(){
        return agent_nm;
    }

    @ElVoField(physicalName = "agent_nm")
    public void setAgent_nm(String agent_nm){
        this.agent_nm = agent_nm;
    }

    @ElVoField(physicalName = "agent_empno")
    public String getAgent_empno(){
        return agent_empno;
    }

    @ElVoField(physicalName = "agent_empno")
    public void setAgent_empno(String agent_empno){
        this.agent_empno = agent_empno;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public int getBiztrip_nght(){
        return biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_nght")
    public void setBiztrip_nght(int biztrip_nght){
        this.biztrip_nght = biztrip_nght;
    }

    @ElVoField(physicalName = "biztrip_day")
    public int getBiztrip_day(){
        return biztrip_day;
    }

    @ElVoField(physicalName = "biztrip_day")
    public void setBiztrip_day(int biztrip_day){
        this.biztrip_day = biztrip_day;
    }

    @ElVoField(physicalName = "biztrip_orign_ymd")
    public String getBiztrip_orign_ymd(){
        return biztrip_orign_ymd;
    }

    @ElVoField(physicalName = "biztrip_orign_ymd")
    public void setBiztrip_orign_ymd(String biztrip_orign_ymd){
        this.biztrip_orign_ymd = biztrip_orign_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public String getBiztrip_cls_ymd(){
        return biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "biztrip_cls_ymd")
    public void setBiztrip_cls_ymd(String biztrip_cls_ymd){
        this.biztrip_cls_ymd = biztrip_cls_ymd;
    }

    @ElVoField(physicalName = "commute_cd")
    public String getCommute_cd(){
        return commute_cd;
    }

    @ElVoField(physicalName = "commute_cd")
    public void setCommute_cd(String commute_cd){
        this.commute_cd = commute_cd;
    }

    @ElVoField(physicalName = "chng_clsf")
    public String getChng_clsf(){
        return chng_clsf;
    }

    @ElVoField(physicalName = "chng_clsf")
    public void setChng_clsf(String chng_clsf){
        this.chng_clsf = chng_clsf;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CtrDomCompnVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_seq").append("=").append(req_seq).append(",");
        sb.append("biztrip_req_no").append("=").append(biztrip_req_no).append(",");
        sb.append("biztrip_psn_clsf").append("=").append(biztrip_psn_clsf).append(",");
        sb.append("biztrip_psn_clsf_nm").append("=").append(biztrip_psn_clsf_nm).append(",");
        sb.append("biztrip_psn_syspayno").append("=").append(biztrip_psn_syspayno).append(",");
        sb.append("biztrip_psn_empno").append("=").append(biztrip_psn_empno).append(",");
        sb.append("biztrip_psn_nm").append("=").append(biztrip_psn_nm).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("biztrip_psn_dept_cd").append("=").append(biztrip_psn_dept_cd).append(",");
        sb.append("biztrip_psn_dept_new_ymd").append("=").append(biztrip_psn_dept_new_ymd).append(",");
        sb.append("biztrip_dept_nm").append("=").append(biztrip_dept_nm).append(",");
        sb.append("fomat_unit").append("=").append(fomat_unit).append(",");
        sb.append("posi_clsf").append("=").append(posi_clsf).append(",");
        sb.append("posi_clsf_nm").append("=").append(posi_clsf_nm).append(",");
        sb.append("agent_psn_syspayno").append("=").append(agent_psn_syspayno).append(",");
        sb.append("agent_nm").append("=").append(agent_nm).append(",");
        sb.append("agent_empno").append("=").append(agent_empno).append(",");
        sb.append("biztrip_nght").append("=").append(biztrip_nght).append(",");
        sb.append("biztrip_day").append("=").append(biztrip_day).append(",");
        sb.append("biztrip_orign_ymd").append("=").append(biztrip_orign_ymd).append(",");
        sb.append("biztrip_cls_ymd").append("=").append(biztrip_cls_ymd).append(",");
        sb.append("commute_cd").append("=").append(commute_cd).append(",");
        sb.append("chng_clsf").append("=").append(chng_clsf).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
