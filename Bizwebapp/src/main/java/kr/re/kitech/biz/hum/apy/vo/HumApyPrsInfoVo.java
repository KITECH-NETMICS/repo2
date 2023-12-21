package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지도교수(활용책임자) 목록 조회")
public class HumApyPrsInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyPrsInfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "이름", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직책", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "대상자 풀사원번호", physicalName = "tar_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tar_syspayno;

    @ElDtoField(logicalName = "대상자 사원번호", physicalName = "tar_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tar_empno;

    @ElDtoField(logicalName = "대상자 이름", physicalName = "tar_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tar_nm;

    @ElDtoField(logicalName = "대상자 부서이름", physicalName = "tar_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tar_dept_nm;

    @ElDtoField(logicalName = "대상자 직책", physicalName = "tar_posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tar_posi_nm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "승인상태", physicalName = "approval_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String approval_state;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "전 지도교수 부서명", physicalName = "old_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_dept_nm;

    @ElDtoField(logicalName = "전  지도교수 이름", physicalName = "old_pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_pruse_respn_psn;

    @ElDtoField(logicalName = "후 지도교수 부서명", physicalName = "new_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String new_dept_nm;

    @ElDtoField(logicalName = "후 지도교수 성명", physicalName = "new_pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String new_pruse_respn_psn;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "pruse_respn_psn", physicalName = "pruse_respn_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pruse_respn_psn;

    @ElDtoField(logicalName = "respn_clsf", physicalName = "respn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_clsf;

    @ElDtoField(logicalName = "use_yn", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "CRUD상태", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "data_clsf", physicalName = "data_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String data_clsf;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "chk", physicalName = "chk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "work_clsf", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "활용책임자구분", physicalName = "respn_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_clsf_nm;

    @ElDtoField(logicalName = "반려의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
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

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        return posi_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "tar_syspayno")
    public String getTar_syspayno(){
        return tar_syspayno;
    }

    @ElVoField(physicalName = "tar_syspayno")
    public void setTar_syspayno(String tar_syspayno){
        this.tar_syspayno = tar_syspayno;
    }

    @ElVoField(physicalName = "tar_empno")
    public String getTar_empno(){
        return tar_empno;
    }

    @ElVoField(physicalName = "tar_empno")
    public void setTar_empno(String tar_empno){
        this.tar_empno = tar_empno;
    }

    @ElVoField(physicalName = "tar_nm")
    public String getTar_nm(){
        return tar_nm;
    }

    @ElVoField(physicalName = "tar_nm")
    public void setTar_nm(String tar_nm){
        this.tar_nm = tar_nm;
    }

    @ElVoField(physicalName = "tar_dept_nm")
    public String getTar_dept_nm(){
        return tar_dept_nm;
    }

    @ElVoField(physicalName = "tar_dept_nm")
    public void setTar_dept_nm(String tar_dept_nm){
        this.tar_dept_nm = tar_dept_nm;
    }

    @ElVoField(physicalName = "tar_posi_nm")
    public String getTar_posi_nm(){
        return tar_posi_nm;
    }

    @ElVoField(physicalName = "tar_posi_nm")
    public void setTar_posi_nm(String tar_posi_nm){
        this.tar_posi_nm = tar_posi_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "approval_state")
    public String getApproval_state(){
        return approval_state;
    }

    @ElVoField(physicalName = "approval_state")
    public void setApproval_state(String approval_state){
        this.approval_state = approval_state;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "old_dept_nm")
    public String getOld_dept_nm(){
        return old_dept_nm;
    }

    @ElVoField(physicalName = "old_dept_nm")
    public void setOld_dept_nm(String old_dept_nm){
        this.old_dept_nm = old_dept_nm;
    }

    @ElVoField(physicalName = "old_pruse_respn_psn")
    public String getOld_pruse_respn_psn(){
        return old_pruse_respn_psn;
    }

    @ElVoField(physicalName = "old_pruse_respn_psn")
    public void setOld_pruse_respn_psn(String old_pruse_respn_psn){
        this.old_pruse_respn_psn = old_pruse_respn_psn;
    }

    @ElVoField(physicalName = "new_dept_nm")
    public String getNew_dept_nm(){
        return new_dept_nm;
    }

    @ElVoField(physicalName = "new_dept_nm")
    public void setNew_dept_nm(String new_dept_nm){
        this.new_dept_nm = new_dept_nm;
    }

    @ElVoField(physicalName = "new_pruse_respn_psn")
    public String getNew_pruse_respn_psn(){
        return new_pruse_respn_psn;
    }

    @ElVoField(physicalName = "new_pruse_respn_psn")
    public void setNew_pruse_respn_psn(String new_pruse_respn_psn){
        this.new_pruse_respn_psn = new_pruse_respn_psn;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public String getPruse_respn_psn(){
        return pruse_respn_psn;
    }

    @ElVoField(physicalName = "pruse_respn_psn")
    public void setPruse_respn_psn(String pruse_respn_psn){
        this.pruse_respn_psn = pruse_respn_psn;
    }

    @ElVoField(physicalName = "respn_clsf")
    public String getRespn_clsf(){
        return respn_clsf;
    }

    @ElVoField(physicalName = "respn_clsf")
    public void setRespn_clsf(String respn_clsf){
        this.respn_clsf = respn_clsf;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "data_clsf")
    public String getData_clsf(){
        return data_clsf;
    }

    @ElVoField(physicalName = "data_clsf")
    public void setData_clsf(String data_clsf){
        this.data_clsf = data_clsf;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "chk")
    public String getChk(){
        return chk;
    }

    @ElVoField(physicalName = "chk")
    public void setChk(String chk){
        this.chk = chk;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "respn_clsf_nm")
    public String getRespn_clsf_nm(){
        return respn_clsf_nm;
    }

    @ElVoField(physicalName = "respn_clsf_nm")
    public void setRespn_clsf_nm(String respn_clsf_nm){
        this.respn_clsf_nm = respn_clsf_nm;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyPrsInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("tar_syspayno").append("=").append(tar_syspayno).append(",");
        sb.append("tar_empno").append("=").append(tar_empno).append(",");
        sb.append("tar_nm").append("=").append(tar_nm).append(",");
        sb.append("tar_dept_nm").append("=").append(tar_dept_nm).append(",");
        sb.append("tar_posi_nm").append("=").append(tar_posi_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("approval_state").append("=").append(approval_state).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("old_dept_nm").append("=").append(old_dept_nm).append(",");
        sb.append("old_pruse_respn_psn").append("=").append(old_pruse_respn_psn).append(",");
        sb.append("new_dept_nm").append("=").append(new_dept_nm).append(",");
        sb.append("new_pruse_respn_psn").append("=").append(new_pruse_respn_psn).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("pruse_respn_psn").append("=").append(pruse_respn_psn).append(",");
        sb.append("respn_clsf").append("=").append(respn_clsf).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("data_clsf").append("=").append(data_clsf).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("chk").append("=").append(chk).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("respn_clsf_nm").append("=").append(respn_clsf_nm).append(",");
        sb.append("comments").append("=").append(comments);
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
