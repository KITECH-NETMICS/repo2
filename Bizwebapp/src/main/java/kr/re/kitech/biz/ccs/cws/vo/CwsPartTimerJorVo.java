package kr.re.kitech.biz.ccs.cws.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비상근 업무일지")
public class CwsPartTimerJorVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CwsPartTimerJorVo(){
    }

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_no;

    @ElDtoField(logicalName = "req_syspayno", physicalName = "req_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String req_syspayno;

    @ElDtoField(logicalName = "start_ymd", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_ymd;

    @ElDtoField(logicalName = "start_time", physicalName = "start_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String start_time;

    @ElDtoField(logicalName = "cls_ymd", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "cls_time", physicalName = "cls_time", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String cls_time;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String dept_nm;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String posi_nm;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String nm;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String empno;

    @ElDtoField(logicalName = "work_plan", physicalName = "work_plan", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work_plan;

    @ElDtoField(logicalName = "work_act", physicalName = "work_act", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String work_act;

    @ElDtoField(logicalName = "attach_file_no", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String rowStatus;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String info_cd;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "attachVo1", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> attachVo1;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        String ret = this.req_no;
        return ret;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_syspayno")
    public String getReq_syspayno(){
        String ret = this.req_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "req_syspayno")
    public void setReq_syspayno(String req_syspayno){
        this.req_syspayno = req_syspayno;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        String ret = this.start_ymd;
        return ret;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "start_time")
    public String getStart_time(){
        String ret = this.start_time;
        return ret;
    }

    @ElVoField(physicalName = "start_time")
    public void setStart_time(String start_time){
        this.start_time = start_time;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        String ret = this.cls_ymd;
        return ret;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "cls_time")
    public String getCls_time(){
        String ret = this.cls_time;
        return ret;
    }

    @ElVoField(physicalName = "cls_time")
    public void setCls_time(String cls_time){
        this.cls_time = cls_time;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        String ret = this.dept_nm;
        return ret;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "posi_nm")
    public String getPosi_nm(){
        String ret = this.posi_nm;
        return ret;
    }

    @ElVoField(physicalName = "posi_nm")
    public void setPosi_nm(String posi_nm){
        this.posi_nm = posi_nm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        String ret = this.apr_state;
        return ret;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        String ret = this.apr_state_nm;
        return ret;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        String ret = this.nm;
        return ret;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "empno")
    public String getEmpno(){
        String ret = this.empno;
        return ret;
    }

    @ElVoField(physicalName = "empno")
    public void setEmpno(String empno){
        this.empno = empno;
    }

    @ElVoField(physicalName = "work_plan")
    public String getWork_plan(){
        String ret = this.work_plan;
        return ret;
    }

    @ElVoField(physicalName = "work_plan")
    public void setWork_plan(String work_plan){
        this.work_plan = work_plan;
    }

    @ElVoField(physicalName = "work_act")
    public String getWork_act(){
        String ret = this.work_act;
        return ret;
    }

    @ElVoField(physicalName = "work_act")
    public void setWork_act(String work_act){
        this.work_act = work_act;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        String ret = this.attach_file_no;
        return ret;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public String getRegst_psn_syspayno(){
        String ret = this.regst_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "regst_psn_syspayno")
    public void setRegst_psn_syspayno(String regst_psn_syspayno){
        this.regst_psn_syspayno = regst_psn_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        String ret = this.regst_daytm;
        return ret;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        String ret = this.rowStatus;
        return ret;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public String getUpdt_psn_syspayno(){
        String ret = this.updt_psn_syspayno;
        return ret;
    }

    @ElVoField(physicalName = "updt_psn_syspayno")
    public void setUpdt_psn_syspayno(String updt_psn_syspayno){
        this.updt_psn_syspayno = updt_psn_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        String ret = this.updt_daytm;
        return ret;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        String ret = this.info_cd;
        return ret;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
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
        sb.append("CwsPartTimerJorVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_syspayno").append("=").append(req_syspayno).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("start_time").append("=").append(start_time).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("cls_time").append("=").append(cls_time).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("work_plan").append("=").append(work_plan).append(",");
        sb.append("work_act").append("=").append(work_act).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("attachVo1").append("=").append(attachVo1);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; attachVo1 != null && i < attachVo1.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)attachVo1.get(i);
            vo._xStreamDec();	 
        }
    }


}
