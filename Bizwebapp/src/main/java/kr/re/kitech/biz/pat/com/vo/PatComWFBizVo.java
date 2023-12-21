package kr.re.kitech.biz.pat.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 마스터 정보 조회(bpm 처리용) Vo")
public class PatComWFBizVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatComWFBizVo(){
    }

    @ElDtoField(logicalName = "참조키", physicalName = "ref_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_key;

    @ElDtoField(logicalName = "발명국문명칭", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "출원국가명", physicalName = "smitapp_natn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_natn_nm;

    @ElDtoField(logicalName = "특허구분명", physicalName = "pat_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf_nm;

    @ElDtoField(logicalName = "특허사무소코드", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElDtoField(logicalName = "특허사무소담당자 id", physicalName = "patofic_charg_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_id;

    @ElDtoField(logicalName = "특허사무소관리번호", physicalName = "patofic_mng_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_mng_no;

    @ElDtoField(logicalName = "특허사무소명", physicalName = "patofic_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_nm;

    @ElDtoField(logicalName = "특허사무소 이메일", physicalName = "patofic_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_email;

    @ElDtoField(logicalName = "특허사무소담당자명", physicalName = "patofic_charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_nm;

    @ElDtoField(logicalName = "특허사무소담당자이메일", physicalName = "patofic_charg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_email;

    @ElDtoField(logicalName = "특허사무소담당자연락처", physicalName = "patofic_charg_contac_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_contac_loc;

    @ElDtoField(logicalName = "특허사무소담당자모바일", physicalName = "patofic_charg_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_charg_mobile;

    @ElDtoField(logicalName = "위임담당자", physicalName = "mandate_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_psn_syspayno;

    @ElDtoField(logicalName = "위임담당자 이메일", physicalName = "mandate_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_email;

    @ElDtoField(logicalName = "위임담당자 성명", physicalName = "mandate_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_nm;

    @ElDtoField(logicalName = "위임담당자 모바일", physicalName = "mandate_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mandate_mobile;

    @ElDtoField(logicalName = "발명자 이메일", physicalName = "invnt_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_email;

    @ElDtoField(logicalName = "발명자 성명", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;

    @ElDtoField(logicalName = "발명자 모바일", physicalName = "invnt_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_mobile;

    @ElDtoField(logicalName = "사용자시스템개인번호", physicalName = "login_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_syspayno;

    @ElDtoField(logicalName = "사용자이메일", physicalName = "login_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_email;

    @ElDtoField(logicalName = "사용자명", physicalName = "login_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_nm;

    @ElDtoField(logicalName = "사용자모바일", physicalName = "login_mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_mobile;

    @ElDtoField(logicalName = "bpm 여부", physicalName = "bpm_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bpm_yn;

    @ElDtoField(logicalName = "발명자개인번호2", physicalName = "invnt_syspayno2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno2;

    @ElDtoField(logicalName = "의뢰기한일", physicalName = "req_due_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_due_date;

    @ElDtoField(logicalName = "연구책임자개인번호", physicalName = "resch_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspayno;

    @ElDtoField(logicalName = "연구책임자이메일", physicalName = "resch_respn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_email;

    @ElDtoField(logicalName = "연구책임자성명", physicalName = "resch_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_nm;

    @ElDtoField(logicalName = "담당자개인번호", physicalName = "charg_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_syspayno;

    @ElDtoField(logicalName = "담당자이메일", physicalName = "charg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_email;

    @ElDtoField(logicalName = "담당자명", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElVoField(physicalName = "ref_key")
    public String getRef_key(){
        return ref_key;
    }

    @ElVoField(physicalName = "ref_key")
    public void setRef_key(String ref_key){
        this.ref_key = ref_key;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public String getSmitapp_natn_nm(){
        return smitapp_natn_nm;
    }

    @ElVoField(physicalName = "smitapp_natn_nm")
    public void setSmitapp_natn_nm(String smitapp_natn_nm){
        this.smitapp_natn_nm = smitapp_natn_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public String getPat_clsf_nm(){
        return pat_clsf_nm;
    }

    @ElVoField(physicalName = "pat_clsf_nm")
    public void setPat_clsf_nm(String pat_clsf_nm){
        this.pat_clsf_nm = pat_clsf_nm;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public String getPatofic_charg_id(){
        return patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_charg_id")
    public void setPatofic_charg_id(String patofic_charg_id){
        this.patofic_charg_id = patofic_charg_id;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public String getPatofic_mng_no(){
        return patofic_mng_no;
    }

    @ElVoField(physicalName = "patofic_mng_no")
    public void setPatofic_mng_no(String patofic_mng_no){
        this.patofic_mng_no = patofic_mng_no;
    }

    @ElVoField(physicalName = "patofic_nm")
    public String getPatofic_nm(){
        return patofic_nm;
    }

    @ElVoField(physicalName = "patofic_nm")
    public void setPatofic_nm(String patofic_nm){
        this.patofic_nm = patofic_nm;
    }

    @ElVoField(physicalName = "patofic_email")
    public String getPatofic_email(){
        return patofic_email;
    }

    @ElVoField(physicalName = "patofic_email")
    public void setPatofic_email(String patofic_email){
        this.patofic_email = patofic_email;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public String getPatofic_charg_nm(){
        return patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_nm")
    public void setPatofic_charg_nm(String patofic_charg_nm){
        this.patofic_charg_nm = patofic_charg_nm;
    }

    @ElVoField(physicalName = "patofic_charg_email")
    public String getPatofic_charg_email(){
        return patofic_charg_email;
    }

    @ElVoField(physicalName = "patofic_charg_email")
    public void setPatofic_charg_email(String patofic_charg_email){
        this.patofic_charg_email = patofic_charg_email;
    }

    @ElVoField(physicalName = "patofic_charg_contac_loc")
    public String getPatofic_charg_contac_loc(){
        return patofic_charg_contac_loc;
    }

    @ElVoField(physicalName = "patofic_charg_contac_loc")
    public void setPatofic_charg_contac_loc(String patofic_charg_contac_loc){
        this.patofic_charg_contac_loc = patofic_charg_contac_loc;
    }

    @ElVoField(physicalName = "patofic_charg_mobile")
    public String getPatofic_charg_mobile(){
        return patofic_charg_mobile;
    }

    @ElVoField(physicalName = "patofic_charg_mobile")
    public void setPatofic_charg_mobile(String patofic_charg_mobile){
        this.patofic_charg_mobile = patofic_charg_mobile;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public String getMandate_psn_syspayno(){
        return mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_psn_syspayno")
    public void setMandate_psn_syspayno(String mandate_psn_syspayno){
        this.mandate_psn_syspayno = mandate_psn_syspayno;
    }

    @ElVoField(physicalName = "mandate_email")
    public String getMandate_email(){
        return mandate_email;
    }

    @ElVoField(physicalName = "mandate_email")
    public void setMandate_email(String mandate_email){
        this.mandate_email = mandate_email;
    }

    @ElVoField(physicalName = "mandate_nm")
    public String getMandate_nm(){
        return mandate_nm;
    }

    @ElVoField(physicalName = "mandate_nm")
    public void setMandate_nm(String mandate_nm){
        this.mandate_nm = mandate_nm;
    }

    @ElVoField(physicalName = "mandate_mobile")
    public String getMandate_mobile(){
        return mandate_mobile;
    }

    @ElVoField(physicalName = "mandate_mobile")
    public void setMandate_mobile(String mandate_mobile){
        this.mandate_mobile = mandate_mobile;
    }

    @ElVoField(physicalName = "invnt_email")
    public String getInvnt_email(){
        return invnt_email;
    }

    @ElVoField(physicalName = "invnt_email")
    public void setInvnt_email(String invnt_email){
        this.invnt_email = invnt_email;
    }

    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }

    @ElVoField(physicalName = "invnt_mobile")
    public String getInvnt_mobile(){
        return invnt_mobile;
    }

    @ElVoField(physicalName = "invnt_mobile")
    public void setInvnt_mobile(String invnt_mobile){
        this.invnt_mobile = invnt_mobile;
    }

    @ElVoField(physicalName = "login_syspayno")
    public String getLogin_syspayno(){
        return login_syspayno;
    }

    @ElVoField(physicalName = "login_syspayno")
    public void setLogin_syspayno(String login_syspayno){
        this.login_syspayno = login_syspayno;
    }

    @ElVoField(physicalName = "login_email")
    public String getLogin_email(){
        return login_email;
    }

    @ElVoField(physicalName = "login_email")
    public void setLogin_email(String login_email){
        this.login_email = login_email;
    }

    @ElVoField(physicalName = "login_nm")
    public String getLogin_nm(){
        return login_nm;
    }

    @ElVoField(physicalName = "login_nm")
    public void setLogin_nm(String login_nm){
        this.login_nm = login_nm;
    }

    @ElVoField(physicalName = "login_mobile")
    public String getLogin_mobile(){
        return login_mobile;
    }

    @ElVoField(physicalName = "login_mobile")
    public void setLogin_mobile(String login_mobile){
        this.login_mobile = login_mobile;
    }

    @ElVoField(physicalName = "bpm_yn")
    public String getBpm_yn(){
        return bpm_yn;
    }

    @ElVoField(physicalName = "bpm_yn")
    public void setBpm_yn(String bpm_yn){
        this.bpm_yn = bpm_yn;
    }

    @ElVoField(physicalName = "invnt_syspayno2")
    public String getInvnt_syspayno2(){
        return invnt_syspayno2;
    }

    @ElVoField(physicalName = "invnt_syspayno2")
    public void setInvnt_syspayno2(String invnt_syspayno2){
        this.invnt_syspayno2 = invnt_syspayno2;
    }

    @ElVoField(physicalName = "req_due_date")
    public String getReq_due_date(){
        return req_due_date;
    }

    @ElVoField(physicalName = "req_due_date")
    public void setReq_due_date(String req_due_date){
        this.req_due_date = req_due_date;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public String getResch_respn_syspayno(){
        return resch_respn_syspayno;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public void setResch_respn_syspayno(String resch_respn_syspayno){
        this.resch_respn_syspayno = resch_respn_syspayno;
    }

    @ElVoField(physicalName = "resch_respn_email")
    public String getResch_respn_email(){
        return resch_respn_email;
    }

    @ElVoField(physicalName = "resch_respn_email")
    public void setResch_respn_email(String resch_respn_email){
        this.resch_respn_email = resch_respn_email;
    }

    @ElVoField(physicalName = "resch_respn_nm")
    public String getResch_respn_nm(){
        return resch_respn_nm;
    }

    @ElVoField(physicalName = "resch_respn_nm")
    public void setResch_respn_nm(String resch_respn_nm){
        this.resch_respn_nm = resch_respn_nm;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public String getCharg_syspayno(){
        return charg_syspayno;
    }

    @ElVoField(physicalName = "charg_syspayno")
    public void setCharg_syspayno(String charg_syspayno){
        this.charg_syspayno = charg_syspayno;
    }

    @ElVoField(physicalName = "charg_email")
    public String getCharg_email(){
        return charg_email;
    }

    @ElVoField(physicalName = "charg_email")
    public void setCharg_email(String charg_email){
        this.charg_email = charg_email;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatComWFBizVo [");
        sb.append("ref_key").append("=").append(ref_key).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("smitapp_natn_nm").append("=").append(smitapp_natn_nm).append(",");
        sb.append("pat_clsf_nm").append("=").append(pat_clsf_nm).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd).append(",");
        sb.append("patofic_charg_id").append("=").append(patofic_charg_id).append(",");
        sb.append("patofic_mng_no").append("=").append(patofic_mng_no).append(",");
        sb.append("patofic_nm").append("=").append(patofic_nm).append(",");
        sb.append("patofic_email").append("=").append(patofic_email).append(",");
        sb.append("patofic_charg_nm").append("=").append(patofic_charg_nm).append(",");
        sb.append("patofic_charg_email").append("=").append(patofic_charg_email).append(",");
        sb.append("patofic_charg_contac_loc").append("=").append(patofic_charg_contac_loc).append(",");
        sb.append("patofic_charg_mobile").append("=").append(patofic_charg_mobile).append(",");
        sb.append("mandate_psn_syspayno").append("=").append(mandate_psn_syspayno).append(",");
        sb.append("mandate_email").append("=").append(mandate_email).append(",");
        sb.append("mandate_nm").append("=").append(mandate_nm).append(",");
        sb.append("mandate_mobile").append("=").append(mandate_mobile).append(",");
        sb.append("invnt_email").append("=").append(invnt_email).append(",");
        sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
        sb.append("invnt_mobile").append("=").append(invnt_mobile).append(",");
        sb.append("login_syspayno").append("=").append(login_syspayno).append(",");
        sb.append("login_email").append("=").append(login_email).append(",");
        sb.append("login_nm").append("=").append(login_nm).append(",");
        sb.append("login_mobile").append("=").append(login_mobile).append(",");
        sb.append("bpm_yn").append("=").append(bpm_yn).append(",");
        sb.append("invnt_syspayno2").append("=").append(invnt_syspayno2).append(",");
        sb.append("req_due_date").append("=").append(req_due_date).append(",");
        sb.append("resch_respn_syspayno").append("=").append(resch_respn_syspayno).append(",");
        sb.append("resch_respn_email").append("=").append(resch_respn_email).append(",");
        sb.append("resch_respn_nm").append("=").append(resch_respn_nm).append(",");
        sb.append("charg_syspayno").append("=").append(charg_syspayno).append(",");
        sb.append("charg_email").append("=").append(charg_email).append(",");
        sb.append("charg_nm").append("=").append(charg_nm);
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
