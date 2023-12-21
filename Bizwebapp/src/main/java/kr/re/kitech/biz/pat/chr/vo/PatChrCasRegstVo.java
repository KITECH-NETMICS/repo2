package kr.re.kitech.biz.pat.chr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "PatChrCasRegstExp")
public class PatChrCasRegstVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatChrCasRegstVo(){
    }

    @ElDtoField(logicalName = "reqNo", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "mngmtNo", physicalName = "mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_no;

    @ElDtoField(logicalName = "regstDecsnYmd", physicalName = "regst_decsn_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_ymd;

    @ElDtoField(logicalName = "regstNo", physicalName = "regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_no;

    @ElDtoField(logicalName = "regstYmd", physicalName = "regst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_ymd;

    @ElDtoField(logicalName = "regstRegYmd", physicalName = "regst_reg_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_reg_ymd;

    @ElDtoField(logicalName = "regstKrnNm", physicalName = "regst_krn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_krn_nm;

    @ElDtoField(logicalName = "compltRptYmd", physicalName = "complt_rpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complt_rpt_ymd;

    @ElDtoField(logicalName = "attachFileNo", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regstDecsnAmt", physicalName = "regst_decsn_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_amt;

    @ElDtoField(logicalName = "regstDecsnAmtYmd", physicalName = "regst_decsn_amt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_decsn_amt_ymd;

    @ElDtoField(logicalName = "excPatYn", physicalName = "exc_pat_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exc_pat_yn;

    @ElDtoField(logicalName = "evalGrd", physicalName = "eval_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_grd;

    @ElDtoField(logicalName = "evalYmd", physicalName = "eval_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_ymd;

    @ElDtoField(logicalName = "attachFileNo2", physicalName = "attach_file_no2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no2;

    @ElDtoField(logicalName = "state", physicalName = "state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state;

    @ElDtoField(logicalName = "examReflectClsf", physicalName = "exam_reflect_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String exam_reflect_clsf;

    @ElDtoField(logicalName = "app_yn", physicalName = "app_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String app_yn;

    @ElDtoField(logicalName = "prcs_clsf", physicalName = "prcs_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_clsf;

    @ElDtoField(logicalName = "reqNo", physicalName = "reqNo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reqNo;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "manager_id", physicalName = "manager_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String manager_id;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "dom_oversea_clsf_cd", physicalName = "dom_oversea_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dom_oversea_clsf_cd;

    @ElDtoField(logicalName = "main_key", physicalName = "main_key", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_key;

    @ElDtoField(logicalName = "ui_id", physicalName = "ui_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ui_id;

    @ElDtoField(logicalName = "reporter_id", physicalName = "reporter_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reporter_id;

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

    @ElVoField(physicalName = "regst_decsn_ymd")
    public String getRegst_decsn_ymd(){
        return regst_decsn_ymd;
    }

    @ElVoField(physicalName = "regst_decsn_ymd")
    public void setRegst_decsn_ymd(String regst_decsn_ymd){
        this.regst_decsn_ymd = regst_decsn_ymd;
    }

    @ElVoField(physicalName = "regst_no")
    public String getRegst_no(){
        return regst_no;
    }

    @ElVoField(physicalName = "regst_no")
    public void setRegst_no(String regst_no){
        this.regst_no = regst_no;
    }

    @ElVoField(physicalName = "regst_ymd")
    public String getRegst_ymd(){
        return regst_ymd;
    }

    @ElVoField(physicalName = "regst_ymd")
    public void setRegst_ymd(String regst_ymd){
        this.regst_ymd = regst_ymd;
    }

    @ElVoField(physicalName = "regst_reg_ymd")
    public String getRegst_reg_ymd(){
        return regst_reg_ymd;
    }

    @ElVoField(physicalName = "regst_reg_ymd")
    public void setRegst_reg_ymd(String regst_reg_ymd){
        this.regst_reg_ymd = regst_reg_ymd;
    }

    @ElVoField(physicalName = "regst_krn_nm")
    public String getRegst_krn_nm(){
        return regst_krn_nm;
    }

    @ElVoField(physicalName = "regst_krn_nm")
    public void setRegst_krn_nm(String regst_krn_nm){
        this.regst_krn_nm = regst_krn_nm;
    }

    @ElVoField(physicalName = "complt_rpt_ymd")
    public String getComplt_rpt_ymd(){
        return complt_rpt_ymd;
    }

    @ElVoField(physicalName = "complt_rpt_ymd")
    public void setComplt_rpt_ymd(String complt_rpt_ymd){
        this.complt_rpt_ymd = complt_rpt_ymd;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_decsn_amt")
    public String getRegst_decsn_amt(){
        return regst_decsn_amt;
    }

    @ElVoField(physicalName = "regst_decsn_amt")
    public void setRegst_decsn_amt(String regst_decsn_amt){
        this.regst_decsn_amt = regst_decsn_amt;
    }

    @ElVoField(physicalName = "regst_decsn_amt_ymd")
    public String getRegst_decsn_amt_ymd(){
        return regst_decsn_amt_ymd;
    }

    @ElVoField(physicalName = "regst_decsn_amt_ymd")
    public void setRegst_decsn_amt_ymd(String regst_decsn_amt_ymd){
        this.regst_decsn_amt_ymd = regst_decsn_amt_ymd;
    }

    @ElVoField(physicalName = "exc_pat_yn")
    public String getExc_pat_yn(){
        return exc_pat_yn;
    }

    @ElVoField(physicalName = "exc_pat_yn")
    public void setExc_pat_yn(String exc_pat_yn){
        this.exc_pat_yn = exc_pat_yn;
    }

    @ElVoField(physicalName = "eval_grd")
    public String getEval_grd(){
        return eval_grd;
    }

    @ElVoField(physicalName = "eval_grd")
    public void setEval_grd(String eval_grd){
        this.eval_grd = eval_grd;
    }

    @ElVoField(physicalName = "eval_ymd")
    public String getEval_ymd(){
        return eval_ymd;
    }

    @ElVoField(physicalName = "eval_ymd")
    public void setEval_ymd(String eval_ymd){
        this.eval_ymd = eval_ymd;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public String getAttach_file_no2(){
        return attach_file_no2;
    }

    @ElVoField(physicalName = "attach_file_no2")
    public void setAttach_file_no2(String attach_file_no2){
        this.attach_file_no2 = attach_file_no2;
    }

    @ElVoField(physicalName = "state")
    public String getState(){
        return state;
    }

    @ElVoField(physicalName = "state")
    public void setState(String state){
        this.state = state;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public String getExam_reflect_clsf(){
        return exam_reflect_clsf;
    }

    @ElVoField(physicalName = "exam_reflect_clsf")
    public void setExam_reflect_clsf(String exam_reflect_clsf){
        this.exam_reflect_clsf = exam_reflect_clsf;
    }

    @ElVoField(physicalName = "app_yn")
    public String getApp_yn(){
        return app_yn;
    }

    @ElVoField(physicalName = "app_yn")
    public void setApp_yn(String app_yn){
        this.app_yn = app_yn;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public String getPrcs_clsf(){
        return prcs_clsf;
    }

    @ElVoField(physicalName = "prcs_clsf")
    public void setPrcs_clsf(String prcs_clsf){
        this.prcs_clsf = prcs_clsf;
    }

    @ElVoField(physicalName = "reqNo")
    public String getReqNo(){
        return reqNo;
    }

    @ElVoField(physicalName = "reqNo")
    public void setReqNo(String reqNo){
        this.reqNo = reqNo;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "manager_id")
    public String getManager_id(){
        return manager_id;
    }

    @ElVoField(physicalName = "manager_id")
    public void setManager_id(String manager_id){
        this.manager_id = manager_id;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "dom_oversea_clsf_cd")
    public String getDom_oversea_clsf_cd(){
        return dom_oversea_clsf_cd;
    }

    @ElVoField(physicalName = "dom_oversea_clsf_cd")
    public void setDom_oversea_clsf_cd(String dom_oversea_clsf_cd){
        this.dom_oversea_clsf_cd = dom_oversea_clsf_cd;
    }

    @ElVoField(physicalName = "main_key")
    public String getMain_key(){
        return main_key;
    }

    @ElVoField(physicalName = "main_key")
    public void setMain_key(String main_key){
        this.main_key = main_key;
    }

    @ElVoField(physicalName = "ui_id")
    public String getUi_id(){
        return ui_id;
    }

    @ElVoField(physicalName = "ui_id")
    public void setUi_id(String ui_id){
        this.ui_id = ui_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public String getReporter_id(){
        return reporter_id;
    }

    @ElVoField(physicalName = "reporter_id")
    public void setReporter_id(String reporter_id){
        this.reporter_id = reporter_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatChrCasRegstVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("mngmt_no").append("=").append(mngmt_no).append(",");
        sb.append("regst_decsn_ymd").append("=").append(regst_decsn_ymd).append(",");
        sb.append("regst_no").append("=").append(regst_no).append(",");
        sb.append("regst_ymd").append("=").append(regst_ymd).append(",");
        sb.append("regst_reg_ymd").append("=").append(regst_reg_ymd).append(",");
        sb.append("regst_krn_nm").append("=").append(regst_krn_nm).append(",");
        sb.append("complt_rpt_ymd").append("=").append(complt_rpt_ymd).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_decsn_amt").append("=").append(regst_decsn_amt).append(",");
        sb.append("regst_decsn_amt_ymd").append("=").append(regst_decsn_amt_ymd).append(",");
        sb.append("exc_pat_yn").append("=").append(exc_pat_yn).append(",");
        sb.append("eval_grd").append("=").append(eval_grd).append(",");
        sb.append("eval_ymd").append("=").append(eval_ymd).append(",");
        sb.append("attach_file_no2").append("=").append(attach_file_no2).append(",");
        sb.append("state").append("=").append(state).append(",");
        sb.append("exam_reflect_clsf").append("=").append(exam_reflect_clsf).append(",");
        sb.append("app_yn").append("=").append(app_yn).append(",");
        sb.append("prcs_clsf").append("=").append(prcs_clsf).append(",");
        sb.append("reqNo").append("=").append(reqNo).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("manager_id").append("=").append(manager_id).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("dom_oversea_clsf_cd").append("=").append(dom_oversea_clsf_cd).append(",");
        sb.append("main_key").append("=").append(main_key).append(",");
        sb.append("ui_id").append("=").append(ui_id).append(",");
        sb.append("reporter_id").append("=").append(reporter_id);
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
