package kr.re.kitech.biz.ass.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "불용신청상세조회 VO")
public class AssUnUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AssUnUseVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqNm", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "reqEmpno", physicalName = "req_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_empno;

    @ElDtoField(logicalName = "reqSyspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "reqDeptCd", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "reqDeptNewYmd", physicalName = "req_dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_new_ymd;

    @ElDtoField(logicalName = "reqEmail", physicalName = "req_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_email;

    @ElDtoField(logicalName = "reqExtNo", physicalName = "req_ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ext_no;

    @ElDtoField(logicalName = "reqDeptNm", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "unuseClsf", physicalName = "unuse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unuse_clsf;

    @ElDtoField(logicalName = "respnNm", physicalName = "respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String respn_nm;

    @ElDtoField(logicalName = "reUsePossbl", physicalName = "re_use_possbl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String re_use_possbl;

    @ElDtoField(logicalName = "repayAftrEconoValue", physicalName = "repay_aftr_econo_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String repay_aftr_econo_value;

    @ElDtoField(logicalName = "mngmtState", physicalName = "mngmt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_state;

    @ElDtoField(logicalName = "etcItem", physicalName = "etc_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_item;

    @ElDtoField(logicalName = "cause", physicalName = "cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cause;

    @ElDtoField(logicalName = "idleUnuseClsf", physicalName = "idle_unuse_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String idle_unuse_clsf;

    @ElDtoField(logicalName = "userNm", physicalName = "user_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_nm;

    @ElDtoField(logicalName = "userEmpno", physicalName = "user_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_empno;

    @ElDtoField(logicalName = "asetNo", physicalName = "aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_no;

    @ElDtoField(logicalName = "asetClsf", physicalName = "aset_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf;

    @ElDtoField(logicalName = "relatAsetNo", physicalName = "relat_aset_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_aset_no;

    @ElDtoField(logicalName = "mainSubClsf", physicalName = "main_sub_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf;

    @ElDtoField(logicalName = "asetNm", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "asetTyp", physicalName = "aset_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_typ;

    @ElDtoField(logicalName = "asetClsfNm", physicalName = "aset_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_clsf_nm;

    @ElDtoField(logicalName = "mainSubClsfNm", physicalName = "main_sub_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_sub_clsf_nm;

    @ElDtoField(logicalName = "introAmt", physicalName = "intro_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_amt;

    @ElDtoField(logicalName = "introYmd", physicalName = "intro_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String intro_ymd;

    @ElDtoField(logicalName = "posiRegion", physicalName = "posi_region", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region;

    @ElDtoField(logicalName = "posiBuild", physicalName = "posi_build", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build;

    @ElDtoField(logicalName = "posiRegionNm", physicalName = "posi_region_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_region_nm;

    @ElDtoField(logicalName = "posiBuildNm", physicalName = "posi_build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_build_nm;

    @ElDtoField(logicalName = "posiFloor", physicalName = "posi_floor", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_floor;

    @ElDtoField(logicalName = "posiDetls", physicalName = "posi_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_detls;

    @ElDtoField(logicalName = "prcsYmd", physicalName = "prcs_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_ymd;

    @ElDtoField(logicalName = "prcsAmt", physicalName = "prcs_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_amt;

    @ElDtoField(logicalName = "prcsClsf", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "userDeptCd", physicalName = "user_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_dept_cd;

    @ElDtoField(logicalName = "userDeptCdYmd", physicalName = "user_dept_cd_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_dept_cd_ymd;

    @ElDtoField(logicalName = "managerId", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "appDiv", physicalName = "app_div", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_div;

    @ElDtoField(logicalName = "asetStateClsf", physicalName = "aset_state_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_state_clsf;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "cnt", physicalName = "cnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cnt;

    @ElDtoField(logicalName = "decidarbItem", physicalName = "decidarb_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decidarb_item;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "saleObjClsf", physicalName = "sale_obj_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sale_obj_clsf;

    @ElDtoField(logicalName = "prcsNo", physicalName = "prcs_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_no;

    @ElDtoField(logicalName = "regstSyspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "updtSyspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_empno")
    public String getReq_empno(){
        return req_empno;
    }

    @ElVoField(physicalName = "req_empno")
    public void setReq_empno(String req_empno){
        this.req_empno = req_empno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        return req_syspayno;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public String getReq_dept_new_ymd(){
        return req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_dept_new_ymd")
    public void setReq_dept_new_ymd(String req_dept_new_ymd){
        this.req_dept_new_ymd = req_dept_new_ymd;
    }

    @ElVoField(physicalName = "req_email")
    public String getReq_email(){
        return req_email;
    }

    @ElVoField(physicalName = "req_email")
    public void setReq_email(String req_email){
        this.req_email = req_email;
    }

    @ElVoField(physicalName = "req_ext_no")
    public String getReq_ext_no(){
        return req_ext_no;
    }

    @ElVoField(physicalName = "req_ext_no")
    public void setReq_ext_no(String req_ext_no){
        this.req_ext_no = req_ext_no;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "unuse_clsf")
    public String getUnuse_clsf(){
        return unuse_clsf;
    }

    @ElVoField(physicalName = "unuse_clsf")
    public void setUnuse_clsf(String unuse_clsf){
        this.unuse_clsf = unuse_clsf;
    }

    @ElVoField(physicalName = "respn_nm")
    public String getRespn_nm(){
        return respn_nm;
    }

    @ElVoField(physicalName = "respn_nm")
    public void setRespn_nm(String respn_nm){
        this.respn_nm = respn_nm;
    }

    @ElVoField(physicalName = "re_use_possbl")
    public String getRe_use_possbl(){
        return re_use_possbl;
    }

    @ElVoField(physicalName = "re_use_possbl")
    public void setRe_use_possbl(String re_use_possbl){
        this.re_use_possbl = re_use_possbl;
    }

    @ElVoField(physicalName = "repay_aftr_econo_value")
    public String getRepay_aftr_econo_value(){
        return repay_aftr_econo_value;
    }

    @ElVoField(physicalName = "repay_aftr_econo_value")
    public void setRepay_aftr_econo_value(String repay_aftr_econo_value){
        this.repay_aftr_econo_value = repay_aftr_econo_value;
    }

    @ElVoField(physicalName = "mngmt_state")
    public String getMngmt_state(){
        return mngmt_state;
    }

    @ElVoField(physicalName = "mngmt_state")
    public void setMngmt_state(String mngmt_state){
        this.mngmt_state = mngmt_state;
    }

    @ElVoField(physicalName = "etc_item")
    public String getEtc_item(){
        return etc_item;
    }

    @ElVoField(physicalName = "etc_item")
    public void setEtc_item(String etc_item){
        this.etc_item = etc_item;
    }

    @ElVoField(physicalName = "cause")
    public String getCause(){
        return cause;
    }

    @ElVoField(physicalName = "cause")
    public void setCause(String cause){
        this.cause = cause;
    }

    @ElVoField(physicalName = "idle_unuse_clsf")
    public String getIdle_unuse_clsf(){
        return idle_unuse_clsf;
    }

    @ElVoField(physicalName = "idle_unuse_clsf")
    public void setIdle_unuse_clsf(String idle_unuse_clsf){
        this.idle_unuse_clsf = idle_unuse_clsf;
    }

    @ElVoField(physicalName = "user_nm")
    public String getUser_nm(){
        return user_nm;
    }

    @ElVoField(physicalName = "user_nm")
    public void setUser_nm(String user_nm){
        this.user_nm = user_nm;
    }

    @ElVoField(physicalName = "user_empno")
    public String getUser_empno(){
        return user_empno;
    }

    @ElVoField(physicalName = "user_empno")
    public void setUser_empno(String user_empno){
        this.user_empno = user_empno;
    }

    @ElVoField(physicalName = "aset_no")
    public String getAset_no(){
        return aset_no;
    }

    @ElVoField(physicalName = "aset_no")
    public void setAset_no(String aset_no){
        this.aset_no = aset_no;
    }

    @ElVoField(physicalName = "aset_clsf")
    public String getAset_clsf(){
        return aset_clsf;
    }

    @ElVoField(physicalName = "aset_clsf")
    public void setAset_clsf(String aset_clsf){
        this.aset_clsf = aset_clsf;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public String getRelat_aset_no(){
        return relat_aset_no;
    }

    @ElVoField(physicalName = "relat_aset_no")
    public void setRelat_aset_no(String relat_aset_no){
        this.relat_aset_no = relat_aset_no;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public String getMain_sub_clsf(){
        return main_sub_clsf;
    }

    @ElVoField(physicalName = "main_sub_clsf")
    public void setMain_sub_clsf(String main_sub_clsf){
        this.main_sub_clsf = main_sub_clsf;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "aset_typ")
    public String getAset_typ(){
        return aset_typ;
    }

    @ElVoField(physicalName = "aset_typ")
    public void setAset_typ(String aset_typ){
        this.aset_typ = aset_typ;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public String getAset_clsf_nm(){
        return aset_clsf_nm;
    }

    @ElVoField(physicalName = "aset_clsf_nm")
    public void setAset_clsf_nm(String aset_clsf_nm){
        this.aset_clsf_nm = aset_clsf_nm;
    }

    @ElVoField(physicalName = "main_sub_clsf_nm")
    public String getMain_sub_clsf_nm(){
        return main_sub_clsf_nm;
    }

    @ElVoField(physicalName = "main_sub_clsf_nm")
    public void setMain_sub_clsf_nm(String main_sub_clsf_nm){
        this.main_sub_clsf_nm = main_sub_clsf_nm;
    }

    @ElVoField(physicalName = "intro_amt")
    public String getIntro_amt(){
        return intro_amt;
    }

    @ElVoField(physicalName = "intro_amt")
    public void setIntro_amt(String intro_amt){
        this.intro_amt = intro_amt;
    }

    @ElVoField(physicalName = "intro_ymd")
    public String getIntro_ymd(){
        return intro_ymd;
    }

    @ElVoField(physicalName = "intro_ymd")
    public void setIntro_ymd(String intro_ymd){
        this.intro_ymd = intro_ymd;
    }

    @ElVoField(physicalName = "posi_region")
    public String getPosi_region(){
        return posi_region;
    }

    @ElVoField(physicalName = "posi_region")
    public void setPosi_region(String posi_region){
        this.posi_region = posi_region;
    }

    @ElVoField(physicalName = "posi_build")
    public String getPosi_build(){
        return posi_build;
    }

    @ElVoField(physicalName = "posi_build")
    public void setPosi_build(String posi_build){
        this.posi_build = posi_build;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public String getPosi_region_nm(){
        return posi_region_nm;
    }

    @ElVoField(physicalName = "posi_region_nm")
    public void setPosi_region_nm(String posi_region_nm){
        this.posi_region_nm = posi_region_nm;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public String getPosi_build_nm(){
        return posi_build_nm;
    }

    @ElVoField(physicalName = "posi_build_nm")
    public void setPosi_build_nm(String posi_build_nm){
        this.posi_build_nm = posi_build_nm;
    }

    @ElVoField(physicalName = "posi_floor")
    public String getPosi_floor(){
        return posi_floor;
    }

    @ElVoField(physicalName = "posi_floor")
    public void setPosi_floor(String posi_floor){
        this.posi_floor = posi_floor;
    }

    @ElVoField(physicalName = "posi_detls")
    public String getPosi_detls(){
        return posi_detls;
    }

    @ElVoField(physicalName = "posi_detls")
    public void setPosi_detls(String posi_detls){
        this.posi_detls = posi_detls;
    }

    @ElVoField(physicalName = "prcs_ymd")
    public String getPrcs_ymd(){
        return prcs_ymd;
    }

    @ElVoField(physicalName = "prcs_ymd")
    public void setPrcs_ymd(String prcs_ymd){
        this.prcs_ymd = prcs_ymd;
    }

    @ElVoField(physicalName = "prcs_amt")
    public String getPrcs_amt(){
        return prcs_amt;
    }

    @ElVoField(physicalName = "prcs_amt")
    public void setPrcs_amt(String prcs_amt){
        this.prcs_amt = prcs_amt;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public String getPrcs_clsf(){
        return prcs_clsf;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public void setPrcs_clsf(String prcs_clsf){
        this.prcs_clsf = prcs_clsf;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "user_dept_cd")
    public String getUser_dept_cd(){
        return user_dept_cd;
    }

    @ElVoField(physicalName = "user_dept_cd")
    public void setUser_dept_cd(String user_dept_cd){
        this.user_dept_cd = user_dept_cd;
    }

    @ElVoField(physicalName = "user_dept_cd_ymd")
    public String getUser_dept_cd_ymd(){
        return user_dept_cd_ymd;
    }

    @ElVoField(physicalName = "user_dept_cd_ymd")
    public void setUser_dept_cd_ymd(String user_dept_cd_ymd){
        this.user_dept_cd_ymd = user_dept_cd_ymd;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "app_div")
    public String getApp_div(){
        return app_div;
    }

    @ElVoField(physicalName = "app_div")
    public void setApp_div(String app_div){
        this.app_div = app_div;
    }

    @ElVoField(physicalName = "aset_state_clsf")
    public String getAset_state_clsf(){
        return aset_state_clsf;
    }

    @ElVoField(physicalName = "aset_state_clsf")
    public void setAset_state_clsf(String aset_state_clsf){
        this.aset_state_clsf = aset_state_clsf;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "cnt")
    public String getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(String cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "decidarb_item")
    public String getDecidarb_item(){
        return decidarb_item;
    }

    @ElVoField(physicalName = "decidarb_item")
    public void setDecidarb_item(String decidarb_item){
        this.decidarb_item = decidarb_item;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "sale_obj_clsf")
    public String getSale_obj_clsf(){
        return sale_obj_clsf;
    }

    @ElVoField(physicalName = "sale_obj_clsf")
    public void setSale_obj_clsf(String sale_obj_clsf){
        this.sale_obj_clsf = sale_obj_clsf;
    }

    @ElVoField(physicalName = "prcs_no")
    public String getPrcs_no(){
        return prcs_no;
    }

    @ElVoField(physicalName = "prcs_no")
    public void setPrcs_no(String prcs_no){
        this.prcs_no = prcs_no;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssUnUseVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_empno").append("=").append(req_empno).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_new_ymd").append("=").append(req_dept_new_ymd).append(",");
        sb.append("req_email").append("=").append(req_email).append(",");
        sb.append("req_ext_no").append("=").append(req_ext_no).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("unuse_clsf").append("=").append(unuse_clsf).append(",");
        sb.append("respn_nm").append("=").append(respn_nm).append(",");
        sb.append("re_use_possbl").append("=").append(re_use_possbl).append(",");
        sb.append("repay_aftr_econo_value").append("=").append(repay_aftr_econo_value).append(",");
        sb.append("mngmt_state").append("=").append(mngmt_state).append(",");
        sb.append("etc_item").append("=").append(etc_item).append(",");
        sb.append("cause").append("=").append(cause).append(",");
        sb.append("idle_unuse_clsf").append("=").append(idle_unuse_clsf).append(",");
        sb.append("user_nm").append("=").append(user_nm).append(",");
        sb.append("user_empno").append("=").append(user_empno).append(",");
        sb.append("aset_no").append("=").append(aset_no).append(",");
        sb.append("aset_clsf").append("=").append(aset_clsf).append(",");
        sb.append("relat_aset_no").append("=").append(relat_aset_no).append(",");
        sb.append("main_sub_clsf").append("=").append(main_sub_clsf).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("aset_typ").append("=").append(aset_typ).append(",");
        sb.append("aset_clsf_nm").append("=").append(aset_clsf_nm).append(",");
        sb.append("main_sub_clsf_nm").append("=").append(main_sub_clsf_nm).append(",");
        sb.append("intro_amt").append("=").append(intro_amt).append(",");
        sb.append("intro_ymd").append("=").append(intro_ymd).append(",");
        sb.append("posi_region").append("=").append(posi_region).append(",");
        sb.append("posi_build").append("=").append(posi_build).append(",");
        sb.append("posi_region_nm").append("=").append(posi_region_nm).append(",");
        sb.append("posi_build_nm").append("=").append(posi_build_nm).append(",");
        sb.append("posi_floor").append("=").append(posi_floor).append(",");
        sb.append("posi_detls").append("=").append(posi_detls).append(",");
        sb.append("prcs_ymd").append("=").append(prcs_ymd).append(",");
        sb.append("prcs_amt").append("=").append(prcs_amt).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("user_dept_cd").append("=").append(user_dept_cd).append(",");
        sb.append("user_dept_cd_ymd").append("=").append(user_dept_cd_ymd).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("app_div").append("=").append(app_div).append(",");
        sb.append("aset_state_clsf").append("=").append(aset_state_clsf).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("decidarb_item").append("=").append(decidarb_item).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("sale_obj_clsf").append("=").append(sale_obj_clsf).append(",");
        sb.append("prcs_no").append("=").append(prcs_no).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno);
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
