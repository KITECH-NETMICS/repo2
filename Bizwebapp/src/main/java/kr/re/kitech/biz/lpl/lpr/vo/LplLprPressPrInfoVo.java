package kr.re.kitech.biz.lpl.lpr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "언론보도신청정보")
public class LplLprPressPrInfoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public LplLprPressPrInfoVo(){
    }

    @ElDtoField(logicalName = "reqFrYmd", physicalName = "req_fr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_fr_ymd;

    @ElDtoField(logicalName = "serviceId", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "docId", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "reqToYmd", physicalName = "req_to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_to_ymd;

    @ElDtoField(logicalName = "reqClsf", physicalName = "req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf;

    @ElDtoField(logicalName = "aprReqClsf", physicalName = "apr_req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_req_clsf;

    @ElDtoField(logicalName = "rptgMediaClsf", physicalName = "rptg_media_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf;

    @ElDtoField(logicalName = "aprState", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "reqPsnSyspayno", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "reqPsnSyspaynoNm", physicalName = "req_psn_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno_nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "deptNm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "reqYmd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "aprReqYmd", physicalName = "apr_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_req_ymd;

    @ElDtoField(logicalName = "reqClsfNm", physicalName = "req_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_clsf_nm;

    @ElDtoField(logicalName = "rptgHopeYmd", physicalName = "rptg_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_hope_ymd;

    @ElDtoField(logicalName = "arpRptgHopeYmd", physicalName = "apr_rptg_hope_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_rptg_hope_ymd;

    @ElDtoField(logicalName = "rptgMediaClsfNm", physicalName = "rptg_media_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf_nm;

    @ElDtoField(logicalName = "rptgMediaClsf1", physicalName = "rptg_media_clsf1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf1;

    @ElDtoField(logicalName = "rptgMediaClsf2", physicalName = "rptg_media_clsf2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf2;

    @ElDtoField(logicalName = "rptgMediaClsf3", physicalName = "rptg_media_clsf3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf3;

    @ElDtoField(logicalName = "rptgMediaClsf4", physicalName = "rptg_media_clsf4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_media_clsf4;

    @ElDtoField(logicalName = "pressNm", physicalName = "press_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String press_nm;

    @ElDtoField(logicalName = "chargNm", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "tel", physicalName = "tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel;

    @ElDtoField(logicalName = "aprTel", physicalName = "apr_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_tel;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "pressInfo", physicalName = "press_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String press_info;

    @ElDtoField(logicalName = "rptgContnt", physicalName = "rptg_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_contnt;

    @ElDtoField(logicalName = "aprRptgContnt", physicalName = "apr_rptg_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_rptg_contnt;

    @ElDtoField(logicalName = "rptgResn", physicalName = "rptg_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptg_resn;

    @ElDtoField(logicalName = "aprRptg_resn", physicalName = "apr_rptg_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_rptg_resn;

    @ElDtoField(logicalName = "attachFileMngmtNo", physicalName = "attach_file_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_mngmt_no;

    @ElDtoField(logicalName = "reqState", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "reqStateNm", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "regstPsnSyspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "regstDaytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updtPsnSyspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "updtDaytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "param4", physicalName = "param4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String param4;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElVoField(physicalName = "req_fr_ymd")
    public String getReq_fr_ymd(){
        return req_fr_ymd;
    }

    @ElVoField(physicalName = "req_fr_ymd")
    public void setReq_fr_ymd(String req_fr_ymd){
        this.req_fr_ymd = req_fr_ymd;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public String getReq_to_ymd(){
        return req_to_ymd;
    }

    @ElVoField(physicalName = "req_to_ymd")
    public void setReq_to_ymd(String req_to_ymd){
        this.req_to_ymd = req_to_ymd;
    }

    @ElVoField(physicalName = "req_clsf")
    public String getReq_clsf(){
        return req_clsf;
    }

    @ElVoField(physicalName = "req_clsf")
    public void setReq_clsf(String req_clsf){
        this.req_clsf = req_clsf;
    }

    @ElVoField(physicalName = "apr_req_clsf")
    public String getApr_req_clsf(){
        return apr_req_clsf;
    }

    @ElVoField(physicalName = "apr_req_clsf")
    public void setApr_req_clsf(String apr_req_clsf){
        this.apr_req_clsf = apr_req_clsf;
    }

    @ElVoField(physicalName = "rptg_media_clsf")
    public String getRptg_media_clsf(){
        return rptg_media_clsf;
    }

    @ElVoField(physicalName = "rptg_media_clsf")
    public void setRptg_media_clsf(String rptg_media_clsf){
        this.rptg_media_clsf = rptg_media_clsf;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public String getReq_psn_syspayno(){
        return req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_psn_syspayno")
    public void setReq_psn_syspayno(String req_psn_syspayno){
        this.req_psn_syspayno = req_psn_syspayno;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public String getReq_psn_syspayno_nm(){
        return req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public void setReq_psn_syspayno_nm(String req_psn_syspayno_nm){
        this.req_psn_syspayno_nm = req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        return empno;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "apr_req_ymd")
    public String getApr_req_ymd(){
        return apr_req_ymd;
    }

    @ElVoField(physicalName = "apr_req_ymd")
    public void setApr_req_ymd(String apr_req_ymd){
        this.apr_req_ymd = apr_req_ymd;
    }

    @ElVoField(physicalName = "req_clsf_nm")
    public String getReq_clsf_nm(){
        return req_clsf_nm;
    }

    @ElVoField(physicalName = "req_clsf_nm")
    public void setReq_clsf_nm(String req_clsf_nm){
        this.req_clsf_nm = req_clsf_nm;
    }

    @ElVoField(physicalName = "rptg_hope_ymd")
    public String getRptg_hope_ymd(){
        return rptg_hope_ymd;
    }

    @ElVoField(physicalName = "rptg_hope_ymd")
    public void setRptg_hope_ymd(String rptg_hope_ymd){
        this.rptg_hope_ymd = rptg_hope_ymd;
    }

    @ElVoField(physicalName = "apr_rptg_hope_ymd")
    public String getApr_rptg_hope_ymd(){
        return apr_rptg_hope_ymd;
    }

    @ElVoField(physicalName = "apr_rptg_hope_ymd")
    public void setApr_rptg_hope_ymd(String apr_rptg_hope_ymd){
        this.apr_rptg_hope_ymd = apr_rptg_hope_ymd;
    }

    @ElVoField(physicalName = "rptg_media_clsf_nm")
    public String getRptg_media_clsf_nm(){
        return rptg_media_clsf_nm;
    }

    @ElVoField(physicalName = "rptg_media_clsf_nm")
    public void setRptg_media_clsf_nm(String rptg_media_clsf_nm){
        this.rptg_media_clsf_nm = rptg_media_clsf_nm;
    }

    @ElVoField(physicalName = "rptg_media_clsf1")
    public String getRptg_media_clsf1(){
        return rptg_media_clsf1;
    }

    @ElVoField(physicalName = "rptg_media_clsf1")
    public void setRptg_media_clsf1(String rptg_media_clsf1){
        this.rptg_media_clsf1 = rptg_media_clsf1;
    }

    @ElVoField(physicalName = "rptg_media_clsf2")
    public String getRptg_media_clsf2(){
        return rptg_media_clsf2;
    }

    @ElVoField(physicalName = "rptg_media_clsf2")
    public void setRptg_media_clsf2(String rptg_media_clsf2){
        this.rptg_media_clsf2 = rptg_media_clsf2;
    }

    @ElVoField(physicalName = "rptg_media_clsf3")
    public String getRptg_media_clsf3(){
        return rptg_media_clsf3;
    }

    @ElVoField(physicalName = "rptg_media_clsf3")
    public void setRptg_media_clsf3(String rptg_media_clsf3){
        this.rptg_media_clsf3 = rptg_media_clsf3;
    }

    @ElVoField(physicalName = "rptg_media_clsf4")
    public String getRptg_media_clsf4(){
        return rptg_media_clsf4;
    }

    @ElVoField(physicalName = "rptg_media_clsf4")
    public void setRptg_media_clsf4(String rptg_media_clsf4){
        this.rptg_media_clsf4 = rptg_media_clsf4;
    }

    @ElVoField(physicalName = "press_nm")
    public String getPress_nm(){
        return press_nm;
    }

    @ElVoField(physicalName = "press_nm")
    public void setPress_nm(String press_nm){
        this.press_nm = press_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "tel")
    public String getTel(){
        return tel;
    }

    @ElVoField(physicalName = "tel")
    public void setTel(String tel){
        this.tel = tel;
    }

    @ElVoField(physicalName = "apr_tel")
    public String getApr_tel(){
        return apr_tel;
    }

    @ElVoField(physicalName = "apr_tel")
    public void setApr_tel(String apr_tel){
        this.apr_tel = apr_tel;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "press_info")
    public String getPress_info(){
        return press_info;
    }

    @ElVoField(physicalName = "press_info")
    public void setPress_info(String press_info){
        this.press_info = press_info;
    }

    @ElVoField(physicalName = "rptg_contnt")
    public String getRptg_contnt(){
        return rptg_contnt;
    }

    @ElVoField(physicalName = "rptg_contnt")
    public void setRptg_contnt(String rptg_contnt){
        this.rptg_contnt = rptg_contnt;
    }

    @ElVoField(physicalName = "apr_rptg_contnt")
    public String getApr_rptg_contnt(){
        return apr_rptg_contnt;
    }

    @ElVoField(physicalName = "apr_rptg_contnt")
    public void setApr_rptg_contnt(String apr_rptg_contnt){
        this.apr_rptg_contnt = apr_rptg_contnt;
    }

    @ElVoField(physicalName = "rptg_resn")
    public String getRptg_resn(){
        return rptg_resn;
    }

    @ElVoField(physicalName = "rptg_resn")
    public void setRptg_resn(String rptg_resn){
        this.rptg_resn = rptg_resn;
    }

    @ElVoField(physicalName = "apr_rptg_resn")
    public String getApr_rptg_resn(){
        return apr_rptg_resn;
    }

    @ElVoField(physicalName = "apr_rptg_resn")
    public void setApr_rptg_resn(String apr_rptg_resn){
        this.apr_rptg_resn = apr_rptg_resn;
    }

    @ElVoField(physicalName = "attach_file_mngmt_no")
    public String getAttach_file_mngmt_no(){
        return attach_file_mngmt_no;
    }

    @ElVoField(physicalName = "attach_file_mngmt_no")
    public void setAttach_file_mngmt_no(String attach_file_mngmt_no){
        this.attach_file_mngmt_no = attach_file_mngmt_no;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        return regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        return updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "param4")
    public String getParam4(){
        return param4;
    }

    @ElVoField(physicalName = "param4")
    public void setParam4(String param4){
        this.param4 = param4;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LplLprPressPrInfoVo [");
        sb.append("req_fr_ymd").append("=").append(req_fr_ymd).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("req_to_ymd").append("=").append(req_to_ymd).append(",");
        sb.append("req_clsf").append("=").append(req_clsf).append(",");
        sb.append("apr_req_clsf").append("=").append(apr_req_clsf).append(",");
        sb.append("rptg_media_clsf").append("=").append(rptg_media_clsf).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_psn_syspayno_nm").append("=").append(req_psn_syspayno_nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("apr_req_ymd").append("=").append(apr_req_ymd).append(",");
        sb.append("req_clsf_nm").append("=").append(req_clsf_nm).append(",");
        sb.append("rptg_hope_ymd").append("=").append(rptg_hope_ymd).append(",");
        sb.append("apr_rptg_hope_ymd").append("=").append(apr_rptg_hope_ymd).append(",");
        sb.append("rptg_media_clsf_nm").append("=").append(rptg_media_clsf_nm).append(",");
        sb.append("rptg_media_clsf1").append("=").append(rptg_media_clsf1).append(",");
        sb.append("rptg_media_clsf2").append("=").append(rptg_media_clsf2).append(",");
        sb.append("rptg_media_clsf3").append("=").append(rptg_media_clsf3).append(",");
        sb.append("rptg_media_clsf4").append("=").append(rptg_media_clsf4).append(",");
        sb.append("press_nm").append("=").append(press_nm).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("tel").append("=").append(tel).append(",");
        sb.append("apr_tel").append("=").append(apr_tel).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("press_info").append("=").append(press_info).append(",");
        sb.append("rptg_contnt").append("=").append(rptg_contnt).append(",");
        sb.append("apr_rptg_contnt").append("=").append(apr_rptg_contnt).append(",");
        sb.append("rptg_resn").append("=").append(rptg_resn).append(",");
        sb.append("apr_rptg_resn").append("=").append(apr_rptg_resn).append(",");
        sb.append("attach_file_mngmt_no").append("=").append(attach_file_mngmt_no).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("param4").append("=").append(param4).append(",");
        sb.append("info_cd").append("=").append(info_cd);
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
