package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구보고서Vo")
public class ApiEipResReportVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipResReportVo(){
    }

    @ElDtoField(logicalName = "접수번호", physicalName = "rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_no;

    @ElDtoField(logicalName = "접수상태", physicalName = "rcpt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_state;

    @ElDtoField(logicalName = "사유발생일", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "보고서구분", physicalName = "rptp_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_clsf;

    @ElDtoField(logicalName = "평가반영여부", physicalName = "eval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_yn;

    @ElDtoField(logicalName = "평가기준일", physicalName = "rcpt_complt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_complt_ymd;

    @ElDtoField(logicalName = "보고서명", physicalName = "rptp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rptp_nm;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "연구번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "연구책임자", physicalName = "curr_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String curr_resch_rspns;

    @ElDtoField(logicalName = "세부사업명", physicalName = "bsns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_nm;

    @ElDtoField(logicalName = "당해연도연구기간", physicalName = "ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ymd;

    @ElDtoField(logicalName = "당해년도과제 시작일", physicalName = "start_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String start_ymd;

    @ElDtoField(logicalName = "당해년도과제 종료일", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "연구명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "내외부구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElDtoField(logicalName = "참여업체", physicalName = "attnce_cmpy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_cmpy;

    @ElDtoField(logicalName = "연구책임자명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "근무구분", physicalName = "work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String work_clsf;

    @ElDtoField(logicalName = "부서명", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "직급명", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "부처명", physicalName = "bsns_cd_ofic", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_ofic;

    @ElDtoField(logicalName = "주저자개인번호", physicalName = "main_auth_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_auth_empno;

    @ElDtoField(logicalName = "주저자", physicalName = "main_auth_resch_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_auth_resch_rspns;

    @ElDtoField(logicalName = "주저자명", physicalName = "main_auth_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_auth_nm;

    @ElDtoField(logicalName = "보고서공개여부", physicalName = "outsd_rptp_open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_rptp_open_yn;

    @ElDtoField(logicalName = "비공개기간", physicalName = "outsd_unopn_prd_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String outsd_unopn_prd_cls_ymd;

    @ElDtoField(logicalName = "비공개사유", physicalName = "unopen_resn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unopen_resn;

    @ElDtoField(logicalName = "비공개사유서 첨부화일", physicalName = "attach_file_no_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_2;

    @ElDtoField(logicalName = "위탁기관 연구보고서", physicalName = "attach_file_no_3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no_3;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "보고서제출처", physicalName = "rcpt_agncy", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_agncy;

    @ElDtoField(logicalName = "보고서발간일", physicalName = "rcpt_agncy_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_agncy_ymd;

    @ElDtoField(logicalName = "개인정보자동검출기사용유무", physicalName = "privt_info_auto_detct", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String privt_info_auto_detct;

    @ElDtoField(logicalName = "연구내용", physicalName = "resch_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_contnt;

    @ElDtoField(logicalName = "보안과제유무", physicalName = "secrt_prj_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_ex;

    @ElDtoField(logicalName = "연구자료공개여부", physicalName = "secrt_prj_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String secrt_prj_yn;

    @ElVoField(physicalName = "rcpt_no")
    public String getRcpt_no(){
        return rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_no")
    public void setRcpt_no(String rcpt_no){
        this.rcpt_no = rcpt_no;
    }

    @ElVoField(physicalName = "rcpt_state")
    public String getRcpt_state(){
        return rcpt_state;
    }

    @ElVoField(physicalName = "rcpt_state")
    public void setRcpt_state(String rcpt_state){
        this.rcpt_state = rcpt_state;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "rptp_clsf")
    public String getRptp_clsf(){
        return rptp_clsf;
    }

    @ElVoField(physicalName = "rptp_clsf")
    public void setRptp_clsf(String rptp_clsf){
        this.rptp_clsf = rptp_clsf;
    }

    @ElVoField(physicalName = "eval_yn")
    public String getEval_yn(){
        return eval_yn;
    }

    @ElVoField(physicalName = "eval_yn")
    public void setEval_yn(String eval_yn){
        this.eval_yn = eval_yn;
    }

    @ElVoField(physicalName = "rcpt_complt_ymd")
    public String getRcpt_complt_ymd(){
        return rcpt_complt_ymd;
    }

    @ElVoField(physicalName = "rcpt_complt_ymd")
    public void setRcpt_complt_ymd(String rcpt_complt_ymd){
        this.rcpt_complt_ymd = rcpt_complt_ymd;
    }

    @ElVoField(physicalName = "rptp_nm")
    public String getRptp_nm(){
        return rptp_nm;
    }

    @ElVoField(physicalName = "rptp_nm")
    public void setRptp_nm(String rptp_nm){
        this.rptp_nm = rptp_nm;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public String getCurr_resch_rspns(){
        return curr_resch_rspns;
    }

    @ElVoField(physicalName = "curr_resch_rspns")
    public void setCurr_resch_rspns(String curr_resch_rspns){
        this.curr_resch_rspns = curr_resch_rspns;
    }

    @ElVoField(physicalName = "bsns_nm")
    public String getBsns_nm(){
        return bsns_nm;
    }

    @ElVoField(physicalName = "bsns_nm")
    public void setBsns_nm(String bsns_nm){
        this.bsns_nm = bsns_nm;
    }

    @ElVoField(physicalName = "ymd")
    public String getYmd(){
        return ymd;
    }

    @ElVoField(physicalName = "ymd")
    public void setYmd(String ymd){
        this.ymd = ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public String getStart_ymd(){
        return start_ymd;
    }

    @ElVoField(physicalName = "start_ymd")
    public void setStart_ymd(String start_ymd){
        this.start_ymd = start_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @ElVoField(physicalName = "attnce_cmpy")
    public String getAttnce_cmpy(){
        return attnce_cmpy;
    }

    @ElVoField(physicalName = "attnce_cmpy")
    public void setAttnce_cmpy(String attnce_cmpy){
        this.attnce_cmpy = attnce_cmpy;
    }

    @ElVoField(physicalName = "nm")
    public String getNm(){
        return nm;
    }

    @ElVoField(physicalName = "nm")
    public void setNm(String nm){
        this.nm = nm;
    }

    @ElVoField(physicalName = "work_clsf")
    public String getWork_clsf(){
        return work_clsf;
    }

    @ElVoField(physicalName = "work_clsf")
    public void setWork_clsf(String work_clsf){
        this.work_clsf = work_clsf;
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

    @ElVoField(physicalName = "bsns_cd_ofic")
    public String getBsns_cd_ofic(){
        return bsns_cd_ofic;
    }

    @ElVoField(physicalName = "bsns_cd_ofic")
    public void setBsns_cd_ofic(String bsns_cd_ofic){
        this.bsns_cd_ofic = bsns_cd_ofic;
    }

    @ElVoField(physicalName = "main_auth_empno")
    public String getMain_auth_empno(){
        return main_auth_empno;
    }

    @ElVoField(physicalName = "main_auth_empno")
    public void setMain_auth_empno(String main_auth_empno){
        this.main_auth_empno = main_auth_empno;
    }

    @ElVoField(physicalName = "main_auth_resch_rspns")
    public String getMain_auth_resch_rspns(){
        return main_auth_resch_rspns;
    }

    @ElVoField(physicalName = "main_auth_resch_rspns")
    public void setMain_auth_resch_rspns(String main_auth_resch_rspns){
        this.main_auth_resch_rspns = main_auth_resch_rspns;
    }

    @ElVoField(physicalName = "main_auth_nm")
    public String getMain_auth_nm(){
        return main_auth_nm;
    }

    @ElVoField(physicalName = "main_auth_nm")
    public void setMain_auth_nm(String main_auth_nm){
        this.main_auth_nm = main_auth_nm;
    }

    @ElVoField(physicalName = "outsd_rptp_open_yn")
    public String getOutsd_rptp_open_yn(){
        return outsd_rptp_open_yn;
    }

    @ElVoField(physicalName = "outsd_rptp_open_yn")
    public void setOutsd_rptp_open_yn(String outsd_rptp_open_yn){
        this.outsd_rptp_open_yn = outsd_rptp_open_yn;
    }

    @ElVoField(physicalName = "outsd_unopn_prd_cls_ymd")
    public String getOutsd_unopn_prd_cls_ymd(){
        return outsd_unopn_prd_cls_ymd;
    }

    @ElVoField(physicalName = "outsd_unopn_prd_cls_ymd")
    public void setOutsd_unopn_prd_cls_ymd(String outsd_unopn_prd_cls_ymd){
        this.outsd_unopn_prd_cls_ymd = outsd_unopn_prd_cls_ymd;
    }

    @ElVoField(physicalName = "unopen_resn")
    public String getUnopen_resn(){
        return unopen_resn;
    }

    @ElVoField(physicalName = "unopen_resn")
    public void setUnopen_resn(String unopen_resn){
        this.unopen_resn = unopen_resn;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public String getAttach_file_no_2(){
        return attach_file_no_2;
    }

    @ElVoField(physicalName = "attach_file_no_2")
    public void setAttach_file_no_2(String attach_file_no_2){
        this.attach_file_no_2 = attach_file_no_2;
    }

    @ElVoField(physicalName = "attach_file_no_3")
    public String getAttach_file_no_3(){
        return attach_file_no_3;
    }

    @ElVoField(physicalName = "attach_file_no_3")
    public void setAttach_file_no_3(String attach_file_no_3){
        this.attach_file_no_3 = attach_file_no_3;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "rcpt_agncy")
    public String getRcpt_agncy(){
        return rcpt_agncy;
    }

    @ElVoField(physicalName = "rcpt_agncy")
    public void setRcpt_agncy(String rcpt_agncy){
        this.rcpt_agncy = rcpt_agncy;
    }

    @ElVoField(physicalName = "rcpt_agncy_ymd")
    public String getRcpt_agncy_ymd(){
        return rcpt_agncy_ymd;
    }

    @ElVoField(physicalName = "rcpt_agncy_ymd")
    public void setRcpt_agncy_ymd(String rcpt_agncy_ymd){
        this.rcpt_agncy_ymd = rcpt_agncy_ymd;
    }

    @ElVoField(physicalName = "privt_info_auto_detct")
    public String getPrivt_info_auto_detct(){
        return privt_info_auto_detct;
    }

    @ElVoField(physicalName = "privt_info_auto_detct")
    public void setPrivt_info_auto_detct(String privt_info_auto_detct){
        this.privt_info_auto_detct = privt_info_auto_detct;
    }

    @ElVoField(physicalName = "resch_contnt")
    public String getResch_contnt(){
        return resch_contnt;
    }

    @ElVoField(physicalName = "resch_contnt")
    public void setResch_contnt(String resch_contnt){
        this.resch_contnt = resch_contnt;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public String getSecrt_prj_ex(){
        return secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_ex")
    public void setSecrt_prj_ex(String secrt_prj_ex){
        this.secrt_prj_ex = secrt_prj_ex;
    }

    @ElVoField(physicalName = "secrt_prj_yn")
    public String getSecrt_prj_yn(){
        return secrt_prj_yn;
    }

    @ElVoField(physicalName = "secrt_prj_yn")
    public void setSecrt_prj_yn(String secrt_prj_yn){
        this.secrt_prj_yn = secrt_prj_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipResReportVo [");
        sb.append("rcpt_no").append("=").append(rcpt_no).append(",");
        sb.append("rcpt_state").append("=").append(rcpt_state).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("rptp_clsf").append("=").append(rptp_clsf).append(",");
        sb.append("eval_yn").append("=").append(eval_yn).append(",");
        sb.append("rcpt_complt_ymd").append("=").append(rcpt_complt_ymd).append(",");
        sb.append("rptp_nm").append("=").append(rptp_nm).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("curr_resch_rspns").append("=").append(curr_resch_rspns).append(",");
        sb.append("bsns_nm").append("=").append(bsns_nm).append(",");
        sb.append("ymd").append("=").append(ymd).append(",");
        sb.append("start_ymd").append("=").append(start_ymd).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout).append(",");
        sb.append("attnce_cmpy").append("=").append(attnce_cmpy).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("work_clsf").append("=").append(work_clsf).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("bsns_cd_ofic").append("=").append(bsns_cd_ofic).append(",");
        sb.append("main_auth_empno").append("=").append(main_auth_empno).append(",");
        sb.append("main_auth_resch_rspns").append("=").append(main_auth_resch_rspns).append(",");
        sb.append("main_auth_nm").append("=").append(main_auth_nm).append(",");
        sb.append("outsd_rptp_open_yn").append("=").append(outsd_rptp_open_yn).append(",");
        sb.append("outsd_unopn_prd_cls_ymd").append("=").append(outsd_unopn_prd_cls_ymd).append(",");
        sb.append("unopen_resn").append("=").append(unopen_resn).append(",");
        sb.append("attach_file_no_2").append("=").append(attach_file_no_2).append(",");
        sb.append("attach_file_no_3").append("=").append(attach_file_no_3).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("rcpt_agncy").append("=").append(rcpt_agncy).append(",");
        sb.append("rcpt_agncy_ymd").append("=").append(rcpt_agncy_ymd).append(",");
        sb.append("privt_info_auto_detct").append("=").append(privt_info_auto_detct).append(",");
        sb.append("resch_contnt").append("=").append(resch_contnt).append(",");
        sb.append("secrt_prj_ex").append("=").append(secrt_prj_ex).append(",");
        sb.append("secrt_prj_yn").append("=").append(secrt_prj_yn);
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
