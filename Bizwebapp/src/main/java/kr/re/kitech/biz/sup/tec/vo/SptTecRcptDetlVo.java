package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원접수정보 Vo")
public class SptTecRcptDetlVo extends kr.re.kitech.biz.sup.tec.vo.SptTecRcptInfoVo {
    private static final long serialVersionUID = 1L;

    public SptTecRcptDetlVo(){
    }

    @ElDtoField(logicalName = "상담접수일자", physicalName = "cunsl_rcpt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_ymd;

    @ElDtoField(logicalName = "상담접수번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "의뢰자연락처(모바일)", physicalName = "cunsl_req_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_mobile_no;

    @ElDtoField(logicalName = "기술지원접수자개인번호", physicalName = "regst_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_empno;

    @ElDtoField(logicalName = "기술지원접수자성명", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "기술지원요청구분", physicalName = "techsup_req_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techsup_req_clsf;

    @ElDtoField(logicalName = "상담내용", physicalName = "cunsl_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_contnt;

    @ElDtoField(logicalName = "기술지원요청내용", physicalName = "techsup_contnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String techsup_contnt;

    @ElDtoField(logicalName = "성적서발행여부", physicalName = "rst_book_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_yn;

    @ElDtoField(logicalName = "성적서발급고객명", physicalName = "rst_book_issu_cust_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu_cust_nm;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "장비번호(제우스예약)", physicalName = "equip_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_cd;

    @ElDtoField(logicalName = "장비명(제우스예약)", physicalName = "aset_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String aset_nm;

    @ElDtoField(logicalName = "작업시작일자(제우스예약)", physicalName = "equip_use_start_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_start_daytm;

    @ElDtoField(logicalName = "작업종료일자(제우스예약)", physicalName = "equip_use_cls_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String equip_use_cls_daytm;

    @ElDtoField(logicalName = "사용시간(제우스예약)", physicalName = "job_time", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int job_time;

    @ElDtoField(logicalName = "상담자시스템개인번호", physicalName = "cunsl_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_psn_syspayno;

    @ElDtoField(logicalName = "상담접수경로", physicalName = "cunsl_rcpt_path", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_path;

    @ElDtoField(logicalName = "상담접수처구분", physicalName = "cunsl_rcpt_loc_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_loc_clsf;

    @ElDtoField(logicalName = "상담완료구분", physicalName = "cunsl_complt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_complt_clsf;

    @ElDtoField(logicalName = "사업자번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "제우스예약번호", physicalName = "resvno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resvno;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "지원책임자개인번호", physicalName = "supt_respn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_respn_empno;

    @ElDtoField(logicalName = "지원담당자개인번호", physicalName = "rcpt_psn_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rcpt_psn_empno;

    @ElDtoField(logicalName = "의뢰자", physicalName = "cunsl_req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn;

    @ElDtoField(logicalName = "의뢰자연락처", physicalName = "cunsl_req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_tel;

    @ElDtoField(logicalName = "의뢰자이메일", physicalName = "cunsl_req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_email;

    @ElDtoField(logicalName = "역발행여부", physicalName = "recp_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recp_yn;

    @ElVoField(physicalName = "cunsl_rcpt_ymd")
    public String getCunsl_rcpt_ymd(){
        return cunsl_rcpt_ymd;
    }

    @ElVoField(physicalName = "cunsl_rcpt_ymd")
    public void setCunsl_rcpt_ymd(String cunsl_rcpt_ymd){
        this.cunsl_rcpt_ymd = cunsl_rcpt_ymd;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_req_psn_mobile_no")
    public String getCunsl_req_psn_mobile_no(){
        return cunsl_req_psn_mobile_no;
    }

    @ElVoField(physicalName = "cunsl_req_psn_mobile_no")
    public void setCunsl_req_psn_mobile_no(String cunsl_req_psn_mobile_no){
        this.cunsl_req_psn_mobile_no = cunsl_req_psn_mobile_no;
    }

    @ElVoField(physicalName = "regst_empno")
    public String getRegst_empno(){
        return regst_empno;
    }

    @ElVoField(physicalName = "regst_empno")
    public void setRegst_empno(String regst_empno){
        this.regst_empno = regst_empno;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "techsup_req_clsf")
    public String getTechsup_req_clsf(){
        return techsup_req_clsf;
    }

    @ElVoField(physicalName = "techsup_req_clsf")
    public void setTechsup_req_clsf(String techsup_req_clsf){
        this.techsup_req_clsf = techsup_req_clsf;
    }

    @ElVoField(physicalName = "cunsl_contnt")
    public String getCunsl_contnt(){
        return cunsl_contnt;
    }

    @ElVoField(physicalName = "cunsl_contnt")
    public void setCunsl_contnt(String cunsl_contnt){
        this.cunsl_contnt = cunsl_contnt;
    }

    @ElVoField(physicalName = "techsup_contnt")
    public String getTechsup_contnt(){
        return techsup_contnt;
    }

    @ElVoField(physicalName = "techsup_contnt")
    public void setTechsup_contnt(String techsup_contnt){
        this.techsup_contnt = techsup_contnt;
    }

    @ElVoField(physicalName = "rst_book_yn")
    public String getRst_book_yn(){
        return rst_book_yn;
    }

    @ElVoField(physicalName = "rst_book_yn")
    public void setRst_book_yn(String rst_book_yn){
        this.rst_book_yn = rst_book_yn;
    }

    @ElVoField(physicalName = "rst_book_issu_cust_nm")
    public String getRst_book_issu_cust_nm(){
        return rst_book_issu_cust_nm;
    }

    @ElVoField(physicalName = "rst_book_issu_cust_nm")
    public void setRst_book_issu_cust_nm(String rst_book_issu_cust_nm){
        this.rst_book_issu_cust_nm = rst_book_issu_cust_nm;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "equip_cd")
    public String getEquip_cd(){
        return equip_cd;
    }

    @ElVoField(physicalName = "equip_cd")
    public void setEquip_cd(String equip_cd){
        this.equip_cd = equip_cd;
    }

    @ElVoField(physicalName = "aset_nm")
    public String getAset_nm(){
        return aset_nm;
    }

    @ElVoField(physicalName = "aset_nm")
    public void setAset_nm(String aset_nm){
        this.aset_nm = aset_nm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public String getEquip_use_start_daytm(){
        return equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_start_daytm")
    public void setEquip_use_start_daytm(String equip_use_start_daytm){
        this.equip_use_start_daytm = equip_use_start_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public String getEquip_use_cls_daytm(){
        return equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "equip_use_cls_daytm")
    public void setEquip_use_cls_daytm(String equip_use_cls_daytm){
        this.equip_use_cls_daytm = equip_use_cls_daytm;
    }

    @ElVoField(physicalName = "job_time")
    public int getJob_time(){
        return job_time;
    }

    @ElVoField(physicalName = "job_time")
    public void setJob_time(int job_time){
        this.job_time = job_time;
    }

    @ElVoField(physicalName = "cunsl_psn_syspayno")
    public String getCunsl_psn_syspayno(){
        return cunsl_psn_syspayno;
    }

    @ElVoField(physicalName = "cunsl_psn_syspayno")
    public void setCunsl_psn_syspayno(String cunsl_psn_syspayno){
        this.cunsl_psn_syspayno = cunsl_psn_syspayno;
    }

    @ElVoField(physicalName = "cunsl_rcpt_path")
    public String getCunsl_rcpt_path(){
        return cunsl_rcpt_path;
    }

    @ElVoField(physicalName = "cunsl_rcpt_path")
    public void setCunsl_rcpt_path(String cunsl_rcpt_path){
        this.cunsl_rcpt_path = cunsl_rcpt_path;
    }

    @ElVoField(physicalName = "cunsl_rcpt_loc_clsf")
    public String getCunsl_rcpt_loc_clsf(){
        return cunsl_rcpt_loc_clsf;
    }

    @ElVoField(physicalName = "cunsl_rcpt_loc_clsf")
    public void setCunsl_rcpt_loc_clsf(String cunsl_rcpt_loc_clsf){
        this.cunsl_rcpt_loc_clsf = cunsl_rcpt_loc_clsf;
    }

    @ElVoField(physicalName = "cunsl_complt_clsf")
    public String getCunsl_complt_clsf(){
        return cunsl_complt_clsf;
    }

    @ElVoField(physicalName = "cunsl_complt_clsf")
    public void setCunsl_complt_clsf(String cunsl_complt_clsf){
        this.cunsl_complt_clsf = cunsl_complt_clsf;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "resvno")
    public String getResvno(){
        return resvno;
    }

    @ElVoField(physicalName = "resvno")
    public void setResvno(String resvno){
        this.resvno = resvno;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public String getSupt_respn_empno(){
        return supt_respn_empno;
    }

    @ElVoField(physicalName = "supt_respn_empno")
    public void setSupt_respn_empno(String supt_respn_empno){
        this.supt_respn_empno = supt_respn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public String getRcpt_psn_empno(){
        return rcpt_psn_empno;
    }

    @ElVoField(physicalName = "rcpt_psn_empno")
    public void setRcpt_psn_empno(String rcpt_psn_empno){
        this.rcpt_psn_empno = rcpt_psn_empno;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public String getCunsl_req_psn(){
        return cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public void setCunsl_req_psn(String cunsl_req_psn){
        this.cunsl_req_psn = cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public String getCunsl_req_psn_tel(){
        return cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public void setCunsl_req_psn_tel(String cunsl_req_psn_tel){
        this.cunsl_req_psn_tel = cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public String getCunsl_req_psn_email(){
        return cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public void setCunsl_req_psn_email(String cunsl_req_psn_email){
        this.cunsl_req_psn_email = cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "recp_yn")
    public String getRecp_yn(){
        return recp_yn;
    }

    @ElVoField(physicalName = "recp_yn")
    public void setRecp_yn(String recp_yn){
        this.recp_yn = recp_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecRcptDetlVo [");
        sb.append("cunsl_rcpt_ymd").append("=").append(cunsl_rcpt_ymd).append(",");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("cunsl_req_psn_mobile_no").append("=").append(cunsl_req_psn_mobile_no).append(",");
        sb.append("regst_empno").append("=").append(regst_empno).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("techsup_req_clsf").append("=").append(techsup_req_clsf).append(",");
        sb.append("cunsl_contnt").append("=").append(cunsl_contnt).append(",");
        sb.append("techsup_contnt").append("=").append(techsup_contnt).append(",");
        sb.append("rst_book_yn").append("=").append(rst_book_yn).append(",");
        sb.append("rst_book_issu_cust_nm").append("=").append(rst_book_issu_cust_nm).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("equip_cd").append("=").append(equip_cd).append(",");
        sb.append("aset_nm").append("=").append(aset_nm).append(",");
        sb.append("equip_use_start_daytm").append("=").append(equip_use_start_daytm).append(",");
        sb.append("equip_use_cls_daytm").append("=").append(equip_use_cls_daytm).append(",");
        sb.append("job_time").append("=").append(job_time).append(",");
        sb.append("cunsl_psn_syspayno").append("=").append(cunsl_psn_syspayno).append(",");
        sb.append("cunsl_rcpt_path").append("=").append(cunsl_rcpt_path).append(",");
        sb.append("cunsl_rcpt_loc_clsf").append("=").append(cunsl_rcpt_loc_clsf).append(",");
        sb.append("cunsl_complt_clsf").append("=").append(cunsl_complt_clsf).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("resvno").append("=").append(resvno).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("supt_respn_empno").append("=").append(supt_respn_empno).append(",");
        sb.append("rcpt_psn_empno").append("=").append(rcpt_psn_empno).append(",");
        sb.append("cunsl_req_psn").append("=").append(cunsl_req_psn).append(",");
        sb.append("cunsl_req_psn_tel").append("=").append(cunsl_req_psn_tel).append(",");
        sb.append("cunsl_req_psn_email").append("=").append(cunsl_req_psn_email).append(",");
        sb.append("recp_yn").append("=").append(recp_yn);
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
