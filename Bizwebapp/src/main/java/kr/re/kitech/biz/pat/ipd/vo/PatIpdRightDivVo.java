package kr.re.kitech.biz.pat.ipd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatIpdRightDivExp")
public class PatIpdRightDivVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatIpdRightDivVo(){
    }

    @ElDtoField(logicalName = "draftSyspayno", physicalName = "draft_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_syspayno;

    @ElDtoField(logicalName = "dpClsf", physicalName = "dp_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_clsf;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "startDraftYmd", physicalName = "start_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_draft_ymd;

    @ElDtoField(logicalName = "endDraftYmd", physicalName = "end_draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String end_draft_ymd;

    @ElDtoField(logicalName = "noType", physicalName = "no_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String no_type;

    @ElDtoField(logicalName = "refNo", physicalName = "ref_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ref_no;

    @ElDtoField(logicalName = "dpReqNo", physicalName = "dp_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_req_no;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "aprStateNm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "dpClsfNm", physicalName = "dp_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_clsf_nm;

    @ElDtoField(logicalName = "dpResn", physicalName = "dp_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dp_resn;

    @ElDtoField(logicalName = "draftSyspaynm", physicalName = "draft_syspaynm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_syspaynm;

    @ElDtoField(logicalName = "draftYmd", physicalName = "draft_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_ymd;

    @ElDtoField(logicalName = "apprvlCompltYmd", physicalName = "apprvl_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprvl_complt_ymd;

    @ElDtoField(logicalName = "rejectYmd", physicalName = "reject_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reject_ymd;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "invntSyspayno", physicalName = "invnt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_syspayno;

    @ElDtoField(logicalName = "invntEmpno", physicalName = "invnt_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_empno;

    @ElDtoField(logicalName = "invntNm", physicalName = "invnt_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_nm;

    @ElDtoField(logicalName = "invntKrnNm", physicalName = "invnt_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String invnt_krn_nm;

    @ElDtoField(logicalName = "smitappNo", physicalName = "smitapp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_no;

    @ElDtoField(logicalName = "smitappYmd", physicalName = "smitapp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String smitapp_ymd;

    @ElDtoField(logicalName = "draftDeptCd", physicalName = "draft_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_dept_cd;

    @ElDtoField(logicalName = "draftDeptNewYmd", physicalName = "draft_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String draft_dept_new_ymd;

    @ElDtoField(logicalName = "prityEvalReqNo", physicalName = "prity_eval_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prity_eval_req_no;

    @ElDtoField(logicalName = "giveupReqNo", physicalName = "giveup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giveup_req_no;

    @ElDtoField(logicalName = "docu_clsf", physicalName = "docu_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_clsf;

    @ElDtoField(logicalName = "apprYn", physicalName = "apprYn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apprYn;

    @ElDtoField(logicalName = "login_user_id", physicalName = "login_user_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String login_user_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "ext1_cd", physicalName = "ext1_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext1_cd;

    @ElDtoField(logicalName = "ext2_cd", physicalName = "ext2_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext2_cd;

    @ElDtoField(logicalName = "main_key", physicalName = "main_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_key;

    @ElDtoField(logicalName = "researcher_id", physicalName = "researcher_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String researcher_id;

    @ElDtoField(logicalName = "fileList_A", physicalName = "fileList_A", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fileList_A;

    @ElDtoField(logicalName = "endpoint", physicalName = "endpoint", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoint;

    @ElDtoField(logicalName = "wri_nm", physicalName = "wri_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_nm;

    @ElDtoField(logicalName = "ListVo", physicalName = "smipAppLst", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> smipAppLst;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElVoField(physicalName = "draft_syspayno")
    public String getDraft_syspayno(){
        return draft_syspayno;
    }

    @ElVoField(physicalName = "draft_syspayno")
    public void setDraft_syspayno(String draft_syspayno){
        this.draft_syspayno = draft_syspayno;
    }

    @ElVoField(physicalName = "dp_clsf")
    public String getDp_clsf(){
        return dp_clsf;
    }

    @ElVoField(physicalName = "dp_clsf")
    public void setDp_clsf(String dp_clsf){
        this.dp_clsf = dp_clsf;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "start_draft_ymd")
    public String getStart_draft_ymd(){
        return start_draft_ymd;
    }

    @ElVoField(physicalName = "start_draft_ymd")
    public void setStart_draft_ymd(String start_draft_ymd){
        this.start_draft_ymd = start_draft_ymd;
    }

    @ElVoField(physicalName = "end_draft_ymd")
    public String getEnd_draft_ymd(){
        return end_draft_ymd;
    }

    @ElVoField(physicalName = "end_draft_ymd")
    public void setEnd_draft_ymd(String end_draft_ymd){
        this.end_draft_ymd = end_draft_ymd;
    }

    @ElVoField(physicalName = "no_type")
    public String getNo_type(){
        return no_type;
    }

    @ElVoField(physicalName = "no_type")
    public void setNo_type(String no_type){
        this.no_type = no_type;
    }

    @ElVoField(physicalName = "ref_no")
    public String getRef_no(){
        return ref_no;
    }

    @ElVoField(physicalName = "ref_no")
    public void setRef_no(String ref_no){
        this.ref_no = ref_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public String getDp_req_no(){
        return dp_req_no;
    }

    @ElVoField(physicalName = "dp_req_no")
    public void setDp_req_no(String dp_req_no){
        this.dp_req_no = dp_req_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public String getMngmt_no(){
        return mngmt_no;
    }

    @ElVoField(physicalName = "mngmt_no")
    public void setMngmt_no(String mngmt_no){
        this.mngmt_no = mngmt_no;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "dp_clsf_nm")
    public String getDp_clsf_nm(){
        return dp_clsf_nm;
    }

    @ElVoField(physicalName = "dp_clsf_nm")
    public void setDp_clsf_nm(String dp_clsf_nm){
        this.dp_clsf_nm = dp_clsf_nm;
    }

    @ElVoField(physicalName = "dp_resn")
    public String getDp_resn(){
        return dp_resn;
    }

    @ElVoField(physicalName = "dp_resn")
    public void setDp_resn(String dp_resn){
        this.dp_resn = dp_resn;
    }

    @ElVoField(physicalName = "draft_syspaynm")
    public String getDraft_syspaynm(){
        return draft_syspaynm;
    }

    @ElVoField(physicalName = "draft_syspaynm")
    public void setDraft_syspaynm(String draft_syspaynm){
        this.draft_syspaynm = draft_syspaynm;
    }

    @ElVoField(physicalName = "draft_ymd")
    public String getDraft_ymd(){
        return draft_ymd;
    }

    @ElVoField(physicalName = "draft_ymd")
    public void setDraft_ymd(String draft_ymd){
        this.draft_ymd = draft_ymd;
    }

    @ElVoField(physicalName = "apprvl_complt_ymd")
    public String getApprvl_complt_ymd(){
        return apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "apprvl_complt_ymd")
    public void setApprvl_complt_ymd(String apprvl_complt_ymd){
        this.apprvl_complt_ymd = apprvl_complt_ymd;
    }

    @ElVoField(physicalName = "reject_ymd")
    public String getReject_ymd(){
        return reject_ymd;
    }

    @ElVoField(physicalName = "reject_ymd")
    public void setReject_ymd(String reject_ymd){
        this.reject_ymd = reject_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public String getInvnt_syspayno(){
        return invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_syspayno")
    public void setInvnt_syspayno(String invnt_syspayno){
        this.invnt_syspayno = invnt_syspayno;
    }

    @ElVoField(physicalName = "invnt_empno")
    public String getInvnt_empno(){
        return invnt_empno;
    }

    @ElVoField(physicalName = "invnt_empno")
    public void setInvnt_empno(String invnt_empno){
        this.invnt_empno = invnt_empno;
    }

    @ElVoField(physicalName = "invnt_nm")
    public String getInvnt_nm(){
        return invnt_nm;
    }

    @ElVoField(physicalName = "invnt_nm")
    public void setInvnt_nm(String invnt_nm){
        this.invnt_nm = invnt_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public String getInvnt_krn_nm(){
        return invnt_krn_nm;
    }

    @ElVoField(physicalName = "invnt_krn_nm")
    public void setInvnt_krn_nm(String invnt_krn_nm){
        this.invnt_krn_nm = invnt_krn_nm;
    }

    @ElVoField(physicalName = "smitapp_no")
    public String getSmitapp_no(){
        return smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_no")
    public void setSmitapp_no(String smitapp_no){
        this.smitapp_no = smitapp_no;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public String getSmitapp_ymd(){
        return smitapp_ymd;
    }

    @ElVoField(physicalName = "smitapp_ymd")
    public void setSmitapp_ymd(String smitapp_ymd){
        this.smitapp_ymd = smitapp_ymd;
    }

    @ElVoField(physicalName = "draft_dept_cd")
    public String getDraft_dept_cd(){
        return draft_dept_cd;
    }

    @ElVoField(physicalName = "draft_dept_cd")
    public void setDraft_dept_cd(String draft_dept_cd){
        this.draft_dept_cd = draft_dept_cd;
    }

    @ElVoField(physicalName = "draft_dept_new_ymd")
    public String getDraft_dept_new_ymd(){
        return draft_dept_new_ymd;
    }

    @ElVoField(physicalName = "draft_dept_new_ymd")
    public void setDraft_dept_new_ymd(String draft_dept_new_ymd){
        this.draft_dept_new_ymd = draft_dept_new_ymd;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public String getPrity_eval_req_no(){
        return prity_eval_req_no;
    }

    @ElVoField(physicalName = "prity_eval_req_no")
    public void setPrity_eval_req_no(String prity_eval_req_no){
        this.prity_eval_req_no = prity_eval_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public String getGiveup_req_no(){
        return giveup_req_no;
    }

    @ElVoField(physicalName = "giveup_req_no")
    public void setGiveup_req_no(String giveup_req_no){
        this.giveup_req_no = giveup_req_no;
    }

    @ElVoField(physicalName = "docu_clsf")
    public String getDocu_clsf(){
        return docu_clsf;
    }

    @ElVoField(physicalName = "docu_clsf")
    public void setDocu_clsf(String docu_clsf){
        this.docu_clsf = docu_clsf;
    }

    @ElVoField(physicalName = "apprYn")
    public String getApprYn(){
        return apprYn;
    }

    @ElVoField(physicalName = "apprYn")
    public void setApprYn(String apprYn){
        this.apprYn = apprYn;
    }

    @ElVoField(physicalName = "login_user_id")
    public String getLogin_user_id(){
        return login_user_id;
    }

    @ElVoField(physicalName = "login_user_id")
    public void setLogin_user_id(String login_user_id){
        this.login_user_id = login_user_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "ext1_cd")
    public String getExt1_cd(){
        return ext1_cd;
    }

    @ElVoField(physicalName = "ext1_cd")
    public void setExt1_cd(String ext1_cd){
        this.ext1_cd = ext1_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public String getExt2_cd(){
        return ext2_cd;
    }

    @ElVoField(physicalName = "ext2_cd")
    public void setExt2_cd(String ext2_cd){
        this.ext2_cd = ext2_cd;
    }

    @ElVoField(physicalName = "main_key")
    public String getMain_key(){
        return main_key;
    }

    @ElVoField(physicalName = "main_key")
    public void setMain_key(String main_key){
        this.main_key = main_key;
    }

    @ElVoField(physicalName = "researcher_id")
    public String getResearcher_id(){
        return researcher_id;
    }

    @ElVoField(physicalName = "researcher_id")
    public void setResearcher_id(String researcher_id){
        this.researcher_id = researcher_id;
    }

    @ElVoField(physicalName = "fileList_A")
    public String getFileList_A(){
        return fileList_A;
    }

    @ElVoField(physicalName = "fileList_A")
    public void setFileList_A(String fileList_A){
        this.fileList_A = fileList_A;
    }

    @ElVoField(physicalName = "endpoint")
    public String getEndpoint(){
        return endpoint;
    }

    @ElVoField(physicalName = "endpoint")
    public void setEndpoint(String endpoint){
        this.endpoint = endpoint;
    }

    @ElVoField(physicalName = "wri_nm")
    public String getWri_nm(){
        return wri_nm;
    }

    @ElVoField(physicalName = "wri_nm")
    public void setWri_nm(String wri_nm){
        this.wri_nm = wri_nm;
    }

    @ElVoField(physicalName = "smipAppLst")
    public java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> getSmipAppLst(){
        return smipAppLst;
    }

    @ElVoField(physicalName = "smipAppLst")
    public void setSmipAppLst(java.util.List<kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo> smipAppLst){
        this.smipAppLst = smipAppLst;
    }

    @ElVoField(physicalName = "attachVo1")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getAttachVo1(){
        return attachVo1;
    }

    @ElVoField(physicalName = "attachVo1")
    public void setAttachVo1(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1){
        this.attachVo1 = attachVo1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatIpdRightDivVo [");
        sb.append("draft_syspayno").append("=").append(draft_syspayno).append(",");
        sb.append("dp_clsf").append("=").append(dp_clsf).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("start_draft_ymd").append("=").append(start_draft_ymd).append(",");
        sb.append("end_draft_ymd").append("=").append(end_draft_ymd).append(",");
        sb.append("no_type").append("=").append(no_type).append(",");
        sb.append("ref_no").append("=").append(ref_no).append(",");
        sb.append("dp_req_no").append("=").append(dp_req_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("dp_clsf_nm").append("=").append(dp_clsf_nm).append(",");
        sb.append("dp_resn").append("=").append(dp_resn).append(",");
        sb.append("draft_syspaynm").append("=").append(draft_syspaynm).append(",");
        sb.append("draft_ymd").append("=").append(draft_ymd).append(",");
        sb.append("apprvl_complt_ymd").append("=").append(apprvl_complt_ymd).append(",");
        sb.append("reject_ymd").append("=").append(reject_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("invnt_syspayno").append("=").append(invnt_syspayno).append(",");
        sb.append("invnt_empno").append("=").append(invnt_empno).append(",");
        sb.append("invnt_nm").append("=").append(invnt_nm).append(",");
        sb.append("invnt_krn_nm").append("=").append(invnt_krn_nm).append(",");
        sb.append("smitapp_no").append("=").append(smitapp_no).append(",");
        sb.append("smitapp_ymd").append("=").append(smitapp_ymd).append(",");
        sb.append("draft_dept_cd").append("=").append(draft_dept_cd).append(",");
        sb.append("draft_dept_new_ymd").append("=").append(draft_dept_new_ymd).append(",");
        sb.append("prity_eval_req_no").append("=").append(prity_eval_req_no).append(",");
        sb.append("giveup_req_no").append("=").append(giveup_req_no).append(",");
        sb.append("docu_clsf").append("=").append(docu_clsf).append(",");
        sb.append("apprYn").append("=").append(apprYn).append(",");
        sb.append("login_user_id").append("=").append(login_user_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("ext1_cd").append("=").append(ext1_cd).append(",");
        sb.append("ext2_cd").append("=").append(ext2_cd).append(",");
        sb.append("main_key").append("=").append(main_key).append(",");
        sb.append("researcher_id").append("=").append(researcher_id).append(",");
        sb.append("fileList_A").append("=").append(fileList_A).append(",");
        sb.append("endpoint").append("=").append(endpoint).append(",");
        sb.append("wri_nm").append("=").append(wri_nm).append(",");
        sb.append("smipAppLst").append("=").append(smipAppLst).append(",");
        sb.append("attachVo1").append("=").append(attachVo1);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; smipAppLst != null && i < smipAppLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)smipAppLst.get(i);
            vo._xStreamEnc();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; smipAppLst != null && i < smipAppLst.size() ; i++ ) {
            kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo vo = (kr.re.kitech.biz.pat.ipd.vo.PatIpdRightDivVo)smipAppLst.get(i);
            vo._xStreamDec();	 
        }
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
