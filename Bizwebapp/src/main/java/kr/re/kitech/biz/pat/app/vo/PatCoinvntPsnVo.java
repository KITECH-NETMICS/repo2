package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "공동발명자 Vo")
public class PatCoinvntPsnVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatCoinvntPsnVo(){
    }

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "사번", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "소속구분", physicalName = "blong_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_clsf;

    @ElDtoField(logicalName = "소속코드", physicalName = "blong_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_cd;

    @ElDtoField(logicalName = "부서신설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "소속명", physicalName = "blong_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String blong_nm;

    @ElDtoField(logicalName = "발명자구분", physicalName = "invnt_psn_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_psn_clsf;

    @ElDtoField(logicalName = "성명국문", physicalName = "nm_krn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_krn;

    @ElDtoField(logicalName = "성명영문", physicalName = "nm_eng", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_eng;

    @ElDtoField(logicalName = "재직구분", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "재직구분명", physicalName = "work_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf_nm;

    @ElDtoField(logicalName = "주민번호", physicalName = "resid_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_regst_no;

    @ElDtoField(logicalName = "주민번호2", physicalName = "resid_no_dis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no_dis;

    @ElDtoField(logicalName = "연락처", physicalName = "contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contac_loc;

    @ElDtoField(logicalName = "이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "우편번호", physicalName = "post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String post_no;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "세부주소", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElDtoField(logicalName = "지분율", physicalName = "stake_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_rt;

    @ElDtoField(logicalName = "실적부서 유무", physicalName = "stake_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stake_dept;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "공동발명확인유무", physicalName = "co_invnt_affir_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "0 승인, 1 반려")
    private String co_invnt_affir_ex;

    @ElDtoField(logicalName = "공동발명확인일자", physicalName = "co_invnt_affir_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_affir_ymd;

    @ElDtoField(logicalName = "공동발명확인비고", physicalName = "co_invnt_affir_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_affir_rmk;

    @ElDtoField(logicalName = "공동발명반송일자", physicalName = "co_invnt_retn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String co_invnt_retn_ymd;

    @ElDtoField(logicalName = "양도유무", physicalName = "trans_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trans_ex;

    @ElDtoField(logicalName = "반려의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "blong_clsf")
    public String getBlong_clsf(){
        return blong_clsf;
    }

    @ElVoField(physicalName = "blong_clsf")
    public void setBlong_clsf(String blong_clsf){
        this.blong_clsf = blong_clsf;
    }

    @ElVoField(physicalName = "blong_cd")
    public String getBlong_cd(){
        return blong_cd;
    }

    @ElVoField(physicalName = "blong_cd")
    public void setBlong_cd(String blong_cd){
        this.blong_cd = blong_cd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "blong_nm")
    public String getBlong_nm(){
        return blong_nm;
    }

    @ElVoField(physicalName = "blong_nm")
    public void setBlong_nm(String blong_nm){
        this.blong_nm = blong_nm;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public String getInvnt_psn_clsf(){
        return invnt_psn_clsf;
    }

    @ElVoField(physicalName = "invnt_psn_clsf")
    public void setInvnt_psn_clsf(String invnt_psn_clsf){
        this.invnt_psn_clsf = invnt_psn_clsf;
    }

    @ElVoField(physicalName = "nm_krn")
    public String getNm_krn(){
        return nm_krn;
    }

    @ElVoField(physicalName = "nm_krn")
    public void setNm_krn(String nm_krn){
        this.nm_krn = nm_krn;
    }

    @ElVoField(physicalName = "nm_eng")
    public String getNm_eng(){
        return nm_eng;
    }

    @ElVoField(physicalName = "nm_eng")
    public void setNm_eng(String nm_eng){
        this.nm_eng = nm_eng;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public String getWork_clsf_nm(){
        return work_clsf_nm;
    }

    @ElVoField(physicalName = "work_clsf_nm")
    public void setWork_clsf_nm(String work_clsf_nm){
        this.work_clsf_nm = work_clsf_nm;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public String getResid_regst_no(){
        return resid_regst_no;
    }

    @ElVoField(physicalName = "resid_regst_no")
    public void setResid_regst_no(String resid_regst_no){
        this.resid_regst_no = resid_regst_no;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public String getResid_no_dis(){
        return resid_no_dis;
    }

    @ElVoField(physicalName = "resid_no_dis")
    public void setResid_no_dis(String resid_no_dis){
        this.resid_no_dis = resid_no_dis;
    }

    @ElVoField(physicalName = "contac_loc")
    public String getContac_loc(){
        return contac_loc;
    }

    @ElVoField(physicalName = "contac_loc")
    public void setContac_loc(String contac_loc){
        this.contac_loc = contac_loc;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "post_no")
    public String getPost_no(){
        return post_no;
    }

    @ElVoField(physicalName = "post_no")
    public void setPost_no(String post_no){
        this.post_no = post_no;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @ElVoField(physicalName = "stake_rt")
    public String getStake_rt(){
        return stake_rt;
    }

    @ElVoField(physicalName = "stake_rt")
    public void setStake_rt(String stake_rt){
        this.stake_rt = stake_rt;
    }

    @ElVoField(physicalName = "stake_dept")
    public String getStake_dept(){
        return stake_dept;
    }

    @ElVoField(physicalName = "stake_dept")
    public void setStake_dept(String stake_dept){
        this.stake_dept = stake_dept;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "co_invnt_affir_ex")
    public String getCo_invnt_affir_ex(){
        return co_invnt_affir_ex;
    }

    @ElVoField(physicalName = "co_invnt_affir_ex")
    public void setCo_invnt_affir_ex(String co_invnt_affir_ex){
        this.co_invnt_affir_ex = co_invnt_affir_ex;
    }

    @ElVoField(physicalName = "co_invnt_affir_ymd")
    public String getCo_invnt_affir_ymd(){
        return co_invnt_affir_ymd;
    }

    @ElVoField(physicalName = "co_invnt_affir_ymd")
    public void setCo_invnt_affir_ymd(String co_invnt_affir_ymd){
        this.co_invnt_affir_ymd = co_invnt_affir_ymd;
    }

    @ElVoField(physicalName = "co_invnt_affir_rmk")
    public String getCo_invnt_affir_rmk(){
        return co_invnt_affir_rmk;
    }

    @ElVoField(physicalName = "co_invnt_affir_rmk")
    public void setCo_invnt_affir_rmk(String co_invnt_affir_rmk){
        this.co_invnt_affir_rmk = co_invnt_affir_rmk;
    }

    @ElVoField(physicalName = "co_invnt_retn_ymd")
    public String getCo_invnt_retn_ymd(){
        return co_invnt_retn_ymd;
    }

    @ElVoField(physicalName = "co_invnt_retn_ymd")
    public void setCo_invnt_retn_ymd(String co_invnt_retn_ymd){
        this.co_invnt_retn_ymd = co_invnt_retn_ymd;
    }

    @ElVoField(physicalName = "trans_ex")
    public String getTrans_ex(){
        return trans_ex;
    }

    @ElVoField(physicalName = "trans_ex")
    public void setTrans_ex(String trans_ex){
        this.trans_ex = trans_ex;
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
        sb.append("PatCoinvntPsnVo [");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("blong_clsf").append("=").append(blong_clsf).append(",");
        sb.append("blong_cd").append("=").append(blong_cd).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("blong_nm").append("=").append(blong_nm).append(",");
        sb.append("invnt_psn_clsf").append("=").append(invnt_psn_clsf).append(",");
        sb.append("nm_krn").append("=").append(nm_krn).append(",");
        sb.append("nm_eng").append("=").append(nm_eng).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("work_clsf_nm").append("=").append(work_clsf_nm).append(",");
        sb.append("resid_regst_no").append("=").append(resid_regst_no).append(",");
        sb.append("resid_no_dis").append("=").append(resid_no_dis).append(",");
        sb.append("contac_loc").append("=").append(contac_loc).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("post_no").append("=").append(post_no).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr).append(",");
        sb.append("stake_rt").append("=").append(stake_rt).append(",");
        sb.append("stake_dept").append("=").append(stake_dept).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("co_invnt_affir_ex").append("=").append(co_invnt_affir_ex).append(",");
        sb.append("co_invnt_affir_ymd").append("=").append(co_invnt_affir_ymd).append(",");
        sb.append("co_invnt_affir_rmk").append("=").append(co_invnt_affir_rmk).append(",");
        sb.append("co_invnt_retn_ymd").append("=").append(co_invnt_retn_ymd).append(",");
        sb.append("trans_ex").append("=").append(trans_ex).append(",");
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
