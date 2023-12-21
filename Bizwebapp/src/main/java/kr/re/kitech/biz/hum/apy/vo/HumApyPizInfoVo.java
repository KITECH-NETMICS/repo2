package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "포상경력신청 목록 정보")
public class HumApyPizInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyPizInfoVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "사원번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "부서코드", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "부서 개설일", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "outsd_yn", physicalName = "outsd_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_yn;

    @ElDtoField(logicalName = "직급코드", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "포상기관", physicalName = "impl_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String impl_agncy;

    @ElDtoField(logicalName = "포상일", physicalName = "reward_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_ymd;

    @ElDtoField(logicalName = "포상종류", physicalName = "reward_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_knd;

    @ElDtoField(logicalName = "issu_charg", physicalName = "issu_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_charg;

    @ElDtoField(logicalName = "첨부파일", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "issu_head", physicalName = "issu_head", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_head;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "상장번호", physicalName = "reward_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_no;

    @ElDtoField(logicalName = "포상종류 이름", physicalName = "reward_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_knd_nm;

    @ElDtoField(logicalName = "포상내용", physicalName = "reward_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_contnt;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "결재상태 이름", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "신청서등록자(대리신청)", physicalName = "subtitu_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subtitu_nm;

    @ElDtoField(logicalName = "신청자 개인번호", physicalName = "subtitu_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String subtitu_syspayno;

    @ElDtoField(logicalName = "부상여부", physicalName = "addpiz_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addpiz_yn;

    @ElDtoField(logicalName = "부상금액", physicalName = "addpiz_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addpiz_amt;

    @ElDtoField(logicalName = "reward_clsf", physicalName = "reward_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_clsf;

    @ElDtoField(logicalName = "reward_typ", physicalName = "reward_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reward_typ;

    @ElDtoField(logicalName = "저장타입", physicalName = "save_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String save_type;

    @ElDtoField(logicalName = "apySuccessFlg", physicalName = "apySuccessFlg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apySuccessFlg;

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

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "dept_cd")
    public String getDept_cd(){
        return dept_cd;
    }

    @ElVoField(physicalName = "dept_cd")
    public void setDept_cd(String dept_cd){
        this.dept_cd = dept_cd;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public String getDept_new_ymd(){
        return dept_new_ymd;
    }

    @ElVoField(physicalName = "dept_new_ymd")
    public void setDept_new_ymd(String dept_new_ymd){
        this.dept_new_ymd = dept_new_ymd;
    }

    @ElVoField(physicalName = "outsd_yn")
    public String getOutsd_yn(){
        return outsd_yn;
    }

    @ElVoField(physicalName = "outsd_yn")
    public void setOutsd_yn(String outsd_yn){
        this.outsd_yn = outsd_yn;
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

    @ElVoField(physicalName = "impl_agncy")
    public String getImpl_agncy(){
        return impl_agncy;
    }

    @ElVoField(physicalName = "impl_agncy")
    public void setImpl_agncy(String impl_agncy){
        this.impl_agncy = impl_agncy;
    }

    @ElVoField(physicalName = "reward_ymd")
    public String getReward_ymd(){
        return reward_ymd;
    }

    @ElVoField(physicalName = "reward_ymd")
    public void setReward_ymd(String reward_ymd){
        this.reward_ymd = reward_ymd;
    }

    @ElVoField(physicalName = "reward_knd")
    public String getReward_knd(){
        return reward_knd;
    }

    @ElVoField(physicalName = "reward_knd")
    public void setReward_knd(String reward_knd){
        this.reward_knd = reward_knd;
    }

    @ElVoField(physicalName = "issu_charg")
    public String getIssu_charg(){
        return issu_charg;
    }

    @ElVoField(physicalName = "issu_charg")
    public void setIssu_charg(String issu_charg){
        this.issu_charg = issu_charg;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "issu_head")
    public String getIssu_head(){
        return issu_head;
    }

    @ElVoField(physicalName = "issu_head")
    public void setIssu_head(String issu_head){
        this.issu_head = issu_head;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "reward_no")
    public String getReward_no(){
        return reward_no;
    }

    @ElVoField(physicalName = "reward_no")
    public void setReward_no(String reward_no){
        this.reward_no = reward_no;
    }

    @ElVoField(physicalName = "reward_knd_nm")
    public String getReward_knd_nm(){
        return reward_knd_nm;
    }

    @ElVoField(physicalName = "reward_knd_nm")
    public void setReward_knd_nm(String reward_knd_nm){
        this.reward_knd_nm = reward_knd_nm;
    }

    @ElVoField(physicalName = "reward_contnt")
    public String getReward_contnt(){
        return reward_contnt;
    }

    @ElVoField(physicalName = "reward_contnt")
    public void setReward_contnt(String reward_contnt){
        this.reward_contnt = reward_contnt;
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

    @ElVoField(physicalName = "subtitu_nm")
    public String getSubtitu_nm(){
        return subtitu_nm;
    }

    @ElVoField(physicalName = "subtitu_nm")
    public void setSubtitu_nm(String subtitu_nm){
        this.subtitu_nm = subtitu_nm;
    }

    @ElVoField(physicalName = "subtitu_syspayno")
    public String getSubtitu_syspayno(){
        return subtitu_syspayno;
    }

    @ElVoField(physicalName = "subtitu_syspayno")
    public void setSubtitu_syspayno(String subtitu_syspayno){
        this.subtitu_syspayno = subtitu_syspayno;
    }

    @ElVoField(physicalName = "addpiz_yn")
    public String getAddpiz_yn(){
        return addpiz_yn;
    }

    @ElVoField(physicalName = "addpiz_yn")
    public void setAddpiz_yn(String addpiz_yn){
        this.addpiz_yn = addpiz_yn;
    }

    @ElVoField(physicalName = "addpiz_amt")
    public String getAddpiz_amt(){
        return addpiz_amt;
    }

    @ElVoField(physicalName = "addpiz_amt")
    public void setAddpiz_amt(String addpiz_amt){
        this.addpiz_amt = addpiz_amt;
    }

    @ElVoField(physicalName = "reward_clsf")
    public String getReward_clsf(){
        return reward_clsf;
    }

    @ElVoField(physicalName = "reward_clsf")
    public void setReward_clsf(String reward_clsf){
        this.reward_clsf = reward_clsf;
    }

    @ElVoField(physicalName = "reward_typ")
    public String getReward_typ(){
        return reward_typ;
    }

    @ElVoField(physicalName = "reward_typ")
    public void setReward_typ(String reward_typ){
        this.reward_typ = reward_typ;
    }

    @ElVoField(physicalName = "save_type")
    public String getSave_type(){
        return save_type;
    }

    @ElVoField(physicalName = "save_type")
    public void setSave_type(String save_type){
        this.save_type = save_type;
    }

    @ElVoField(physicalName = "apySuccessFlg")
    public String getApySuccessFlg(){
        return apySuccessFlg;
    }

    @ElVoField(physicalName = "apySuccessFlg")
    public void setApySuccessFlg(String apySuccessFlg){
        this.apySuccessFlg = apySuccessFlg;
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
        sb.append("HumApyPizInfoVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("outsd_yn").append("=").append(outsd_yn).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("impl_agncy").append("=").append(impl_agncy).append(",");
        sb.append("reward_ymd").append("=").append(reward_ymd).append(",");
        sb.append("reward_knd").append("=").append(reward_knd).append(",");
        sb.append("issu_charg").append("=").append(issu_charg).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("issu_head").append("=").append(issu_head).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("reward_no").append("=").append(reward_no).append(",");
        sb.append("reward_knd_nm").append("=").append(reward_knd_nm).append(",");
        sb.append("reward_contnt").append("=").append(reward_contnt).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("subtitu_nm").append("=").append(subtitu_nm).append(",");
        sb.append("subtitu_syspayno").append("=").append(subtitu_syspayno).append(",");
        sb.append("addpiz_yn").append("=").append(addpiz_yn).append(",");
        sb.append("addpiz_amt").append("=").append(addpiz_amt).append(",");
        sb.append("reward_clsf").append("=").append(reward_clsf).append(",");
        sb.append("reward_typ").append("=").append(reward_typ).append(",");
        sb.append("save_type").append("=").append(save_type).append(",");
        sb.append("apySuccessFlg").append("=").append(apySuccessFlg).append(",");
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
