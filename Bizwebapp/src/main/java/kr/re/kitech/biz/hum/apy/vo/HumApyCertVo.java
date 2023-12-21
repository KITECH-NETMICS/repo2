package kr.re.kitech.biz.hum.apy.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "증명서발급신청")
public class HumApyCertVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public HumApyCertVo(){
    }

    @ElDtoField(logicalName = "rowStatus", physicalName = "rowStatus", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rowStatus;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "req_ymd", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "empno", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "nm", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "sn", physicalName = "sn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sn;

    @ElDtoField(logicalName = "dept_cd", physicalName = "dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_cd;

    @ElDtoField(logicalName = "dept_nm", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "dept_new_ymd", physicalName = "dept_new_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_new_ymd;

    @ElDtoField(logicalName = "entr_ymd", physicalName = "entr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entr_ymd;

    @ElDtoField(logicalName = "posi_cd", physicalName = "posi_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_cd;

    @ElDtoField(logicalName = "posi_nm", physicalName = "posi_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String posi_nm;

    @ElDtoField(logicalName = "issu_knd", physicalName = "issu_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_knd;

    @ElDtoField(logicalName = "issu_knd_nm", physicalName = "issu_knd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_knd_nm;

    @ElDtoField(logicalName = "usg_cd", physicalName = "usg_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_cd;

    @ElDtoField(logicalName = "usg_cd_nm", physicalName = "usg_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg_cd_nm;

    @ElDtoField(logicalName = "issu_qty", physicalName = "issu_qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_qty;

    @ElDtoField(logicalName = "issu_usg", physicalName = "issu_usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_usg;

    @ElDtoField(logicalName = "issu_dline", physicalName = "issu_dline", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_dline;

    @ElDtoField(logicalName = "issu_daytm", physicalName = "issu_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_daytm;

    @ElDtoField(logicalName = "issu_no", physicalName = "issu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_no;

    @ElDtoField(logicalName = "apy_uid", physicalName = "apy_uid", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apy_uid;

    @ElDtoField(logicalName = "rmk", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "language", physicalName = "language", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String language;

    @ElDtoField(logicalName = "eng_univ", physicalName = "eng_univ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_univ;

    @ElDtoField(logicalName = "eng_major", physicalName = "eng_major", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eng_major;

    @ElDtoField(logicalName = "apr_state", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "apr_state_nm", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "regst_syspayno", physicalName = "regst_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_syspayno;

    @ElDtoField(logicalName = "regst_daytm", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "updt_syspayno", physicalName = "updt_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_syspayno;

    @ElDtoField(logicalName = "updt_daytm", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "endpoints", physicalName = "endpoints", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String endpoints;

    @ElDtoField(logicalName = "결제의견", physicalName = "comments", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comments;

    @ElDtoField(logicalName = "doc_id", physicalName = "doc_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String doc_id;

    @ElDtoField(logicalName = "info_cd", physicalName = "info_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String info_cd;

    @ElDtoField(logicalName = "st_ymd", physicalName = "st_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String st_ymd;

    @ElDtoField(logicalName = "ed_ymd", physicalName = "ed_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ed_ymd;

    @ElDtoField(logicalName = "issu_yn_y", physicalName = "issu_yn_y", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_yn_y;

    @ElDtoField(logicalName = "issu_yn_n", physicalName = "issu_yn_n", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_yn_n;

    @ElDtoField(logicalName = "gubun", physicalName = "gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubun;

    @ElDtoField(logicalName = "email", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "mail_gubun", physicalName = "mail_gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mail_gubun;

    @ElDtoField(logicalName = "nm_empno", physicalName = "nm_empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm_empno;

    @ElDtoField(logicalName = "resid_no", physicalName = "resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resid_no;

    @ElVoField(physicalName = "rowStatus")
    public String getRowStatus(){
        return rowStatus;
    }

    @ElVoField(physicalName = "rowStatus")
    public void setRowStatus(String rowStatus){
        this.rowStatus = rowStatus;
    }

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

    @ElVoField(physicalName = "sn")
    public String getSn(){
        return sn;
    }

    @ElVoField(physicalName = "sn")
    public void setSn(String sn){
        this.sn = sn;
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

    @ElVoField(physicalName = "entr_ymd")
    public String getEntr_ymd(){
        return entr_ymd;
    }

    @ElVoField(physicalName = "entr_ymd")
    public void setEntr_ymd(String entr_ymd){
        this.entr_ymd = entr_ymd;
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

    @ElVoField(physicalName = "issu_knd")
    public String getIssu_knd(){
        return issu_knd;
    }

    @ElVoField(physicalName = "issu_knd")
    public void setIssu_knd(String issu_knd){
        this.issu_knd = issu_knd;
    }

    @ElVoField(physicalName = "issu_knd_nm")
    public String getIssu_knd_nm(){
        return issu_knd_nm;
    }

    @ElVoField(physicalName = "issu_knd_nm")
    public void setIssu_knd_nm(String issu_knd_nm){
        this.issu_knd_nm = issu_knd_nm;
    }

    @ElVoField(physicalName = "usg_cd")
    public String getUsg_cd(){
        return usg_cd;
    }

    @ElVoField(physicalName = "usg_cd")
    public void setUsg_cd(String usg_cd){
        this.usg_cd = usg_cd;
    }

    @ElVoField(physicalName = "usg_cd_nm")
    public String getUsg_cd_nm(){
        return usg_cd_nm;
    }

    @ElVoField(physicalName = "usg_cd_nm")
    public void setUsg_cd_nm(String usg_cd_nm){
        this.usg_cd_nm = usg_cd_nm;
    }

    @ElVoField(physicalName = "issu_qty")
    public String getIssu_qty(){
        return issu_qty;
    }

    @ElVoField(physicalName = "issu_qty")
    public void setIssu_qty(String issu_qty){
        this.issu_qty = issu_qty;
    }

    @ElVoField(physicalName = "issu_usg")
    public String getIssu_usg(){
        return issu_usg;
    }

    @ElVoField(physicalName = "issu_usg")
    public void setIssu_usg(String issu_usg){
        this.issu_usg = issu_usg;
    }

    @ElVoField(physicalName = "issu_dline")
    public String getIssu_dline(){
        return issu_dline;
    }

    @ElVoField(physicalName = "issu_dline")
    public void setIssu_dline(String issu_dline){
        this.issu_dline = issu_dline;
    }

    @ElVoField(physicalName = "issu_daytm")
    public String getIssu_daytm(){
        return issu_daytm;
    }

    @ElVoField(physicalName = "issu_daytm")
    public void setIssu_daytm(String issu_daytm){
        this.issu_daytm = issu_daytm;
    }

    @ElVoField(physicalName = "issu_no")
    public String getIssu_no(){
        return issu_no;
    }

    @ElVoField(physicalName = "issu_no")
    public void setIssu_no(String issu_no){
        this.issu_no = issu_no;
    }

    @ElVoField(physicalName = "apy_uid")
    public String getApy_uid(){
        return apy_uid;
    }

    @ElVoField(physicalName = "apy_uid")
    public void setApy_uid(String apy_uid){
        this.apy_uid = apy_uid;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "language")
    public String getLanguage(){
        return language;
    }

    @ElVoField(physicalName = "language")
    public void setLanguage(String language){
        this.language = language;
    }

    @ElVoField(physicalName = "eng_univ")
    public String getEng_univ(){
        return eng_univ;
    }

    @ElVoField(physicalName = "eng_univ")
    public void setEng_univ(String eng_univ){
        this.eng_univ = eng_univ;
    }

    @ElVoField(physicalName = "eng_major")
    public String getEng_major(){
        return eng_major;
    }

    @ElVoField(physicalName = "eng_major")
    public void setEng_major(String eng_major){
        this.eng_major = eng_major;
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

    @ElVoField(physicalName = "regst_syspayno")
    public String getRegst_syspayno(){
        return regst_syspayno;
    }

    @ElVoField(physicalName = "regst_syspayno")
    public void setRegst_syspayno(String regst_syspayno){
        this.regst_syspayno = regst_syspayno;
    }

    @ElVoField(physicalName = "regst_daytm")
    public String getRegst_daytm(){
        return regst_daytm;
    }

    @ElVoField(physicalName = "regst_daytm")
    public void setRegst_daytm(String regst_daytm){
        this.regst_daytm = regst_daytm;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public String getUpdt_syspayno(){
        return updt_syspayno;
    }

    @ElVoField(physicalName = "updt_syspayno")
    public void setUpdt_syspayno(String updt_syspayno){
        this.updt_syspayno = updt_syspayno;
    }

    @ElVoField(physicalName = "updt_daytm")
    public String getUpdt_daytm(){
        return updt_daytm;
    }

    @ElVoField(physicalName = "updt_daytm")
    public void setUpdt_daytm(String updt_daytm){
        this.updt_daytm = updt_daytm;
    }

    @ElVoField(physicalName = "endpoints")
    public String getEndpoints(){
        return endpoints;
    }

    @ElVoField(physicalName = "endpoints")
    public void setEndpoints(String endpoints){
        this.endpoints = endpoints;
    }

    @ElVoField(physicalName = "comments")
    public String getComments(){
        return comments;
    }

    @ElVoField(physicalName = "comments")
    public void setComments(String comments){
        this.comments = comments;
    }

    @ElVoField(physicalName = "doc_id")
    public String getDoc_id(){
        return doc_id;
    }

    @ElVoField(physicalName = "doc_id")
    public void setDoc_id(String doc_id){
        this.doc_id = doc_id;
    }

    @ElVoField(physicalName = "info_cd")
    public String getInfo_cd(){
        return info_cd;
    }

    @ElVoField(physicalName = "info_cd")
    public void setInfo_cd(String info_cd){
        this.info_cd = info_cd;
    }

    @ElVoField(physicalName = "st_ymd")
    public String getSt_ymd(){
        return st_ymd;
    }

    @ElVoField(physicalName = "st_ymd")
    public void setSt_ymd(String st_ymd){
        this.st_ymd = st_ymd;
    }

    @ElVoField(physicalName = "ed_ymd")
    public String getEd_ymd(){
        return ed_ymd;
    }

    @ElVoField(physicalName = "ed_ymd")
    public void setEd_ymd(String ed_ymd){
        this.ed_ymd = ed_ymd;
    }

    @ElVoField(physicalName = "issu_yn_y")
    public String getIssu_yn_y(){
        return issu_yn_y;
    }

    @ElVoField(physicalName = "issu_yn_y")
    public void setIssu_yn_y(String issu_yn_y){
        this.issu_yn_y = issu_yn_y;
    }

    @ElVoField(physicalName = "issu_yn_n")
    public String getIssu_yn_n(){
        return issu_yn_n;
    }

    @ElVoField(physicalName = "issu_yn_n")
    public void setIssu_yn_n(String issu_yn_n){
        this.issu_yn_n = issu_yn_n;
    }

    @ElVoField(physicalName = "gubun")
    public String getGubun(){
        return gubun;
    }

    @ElVoField(physicalName = "gubun")
    public void setGubun(String gubun){
        this.gubun = gubun;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "mail_gubun")
    public String getMail_gubun(){
        return mail_gubun;
    }

    @ElVoField(physicalName = "mail_gubun")
    public void setMail_gubun(String mail_gubun){
        this.mail_gubun = mail_gubun;
    }

    @ElVoField(physicalName = "nm_empno")
    public String getNm_empno(){
        return nm_empno;
    }

    @ElVoField(physicalName = "nm_empno")
    public void setNm_empno(String nm_empno){
        this.nm_empno = nm_empno;
    }

    @ElVoField(physicalName = "resid_no")
    public String getResid_no(){
        return resid_no;
    }

    @ElVoField(physicalName = "resid_no")
    public void setResid_no(String resid_no){
        this.resid_no = resid_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumApyCertVo [");
        sb.append("rowStatus").append("=").append(rowStatus).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("sn").append("=").append(sn).append(",");
        sb.append("dept_cd").append("=").append(dept_cd).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("dept_new_ymd").append("=").append(dept_new_ymd).append(",");
        sb.append("entr_ymd").append("=").append(entr_ymd).append(",");
        sb.append("posi_cd").append("=").append(posi_cd).append(",");
        sb.append("posi_nm").append("=").append(posi_nm).append(",");
        sb.append("issu_knd").append("=").append(issu_knd).append(",");
        sb.append("issu_knd_nm").append("=").append(issu_knd_nm).append(",");
        sb.append("usg_cd").append("=").append(usg_cd).append(",");
        sb.append("usg_cd_nm").append("=").append(usg_cd_nm).append(",");
        sb.append("issu_qty").append("=").append(issu_qty).append(",");
        sb.append("issu_usg").append("=").append(issu_usg).append(",");
        sb.append("issu_dline").append("=").append(issu_dline).append(",");
        sb.append("issu_daytm").append("=").append(issu_daytm).append(",");
        sb.append("issu_no").append("=").append(issu_no).append(",");
        sb.append("apy_uid").append("=").append(apy_uid).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("language").append("=").append(language).append(",");
        sb.append("eng_univ").append("=").append(eng_univ).append(",");
        sb.append("eng_major").append("=").append(eng_major).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("regst_syspayno").append("=").append(regst_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_syspayno").append("=").append(updt_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("endpoints").append("=").append(endpoints).append(",");
        sb.append("comments").append("=").append(comments).append(",");
        sb.append("doc_id").append("=").append(doc_id).append(",");
        sb.append("info_cd").append("=").append(info_cd).append(",");
        sb.append("st_ymd").append("=").append(st_ymd).append(",");
        sb.append("ed_ymd").append("=").append(ed_ymd).append(",");
        sb.append("issu_yn_y").append("=").append(issu_yn_y).append(",");
        sb.append("issu_yn_n").append("=").append(issu_yn_n).append(",");
        sb.append("gubun").append("=").append(gubun).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("mail_gubun").append("=").append(mail_gubun).append(",");
        sb.append("nm_empno").append("=").append(nm_empno).append(",");
        sb.append("resid_no").append("=").append(resid_no);
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
