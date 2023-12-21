package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "법인증명서발급신청")
public class CgsCertfUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsCertfUseVo(){
    }

    @ElDtoField(logicalName = "조회시작일자", physicalName = "req_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd1;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "req_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd2;

    @ElDtoField(logicalName = "품명코드", physicalName = "gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "신청부서코드", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "품명", physicalName = "gdnm_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm_nm;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "용도", physicalName = "usg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String usg;

    @ElDtoField(logicalName = "제출처", physicalName = "submit_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String submit_loc;

    @ElDtoField(logicalName = "전달방법", physicalName = "premnth_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String premnth_way;

    @ElDtoField(logicalName = "전달방법명", physicalName = "premnth_way_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String premnth_way_nm;

    @ElDtoField(logicalName = "주소구분", physicalName = "addr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_clsf;

    @ElDtoField(logicalName = "주소구분명", physicalName = "addr_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_clsf_nm;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

    @ElDtoField(logicalName = "팩스번호", physicalName = "fax_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fax_no;

    @ElDtoField(logicalName = "전화번호", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청자사원번호", physicalName = "req_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_emp_no;

    @ElDtoField(logicalName = "수령자시스템개인번호", physicalName = "recv_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_psn_syspayno;

    @ElDtoField(logicalName = "수령자명", physicalName = "recv_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_psn_nm;

    @ElDtoField(logicalName = "수령일자", physicalName = "recv_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_ymd;

    @ElDtoField(logicalName = "발급확인번호", physicalName = "issu_chk_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_chk_no;

    @ElDtoField(logicalName = "등록자시스템개인번호", physicalName = "regst_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_psn_syspayno;

    @ElDtoField(logicalName = "등록일시", physicalName = "regst_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_daytm;

    @ElDtoField(logicalName = "수정자시스템개인번호", physicalName = "updt_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_psn_syspayno;

    @ElDtoField(logicalName = "수정일시", physicalName = "updt_daytm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String updt_daytm;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청상태명", physicalName = "req_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state_nm;

    @ElDtoField(logicalName = "저장구분", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "공통첨부파일테이블", physicalName = "fileList", type = "", typeKind = "List", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList;

    @ElVoField(physicalName = "req_ymd1")
    public String getReq_ymd1(){
        return req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd1")
    public void setReq_ymd1(String req_ymd1){
        this.req_ymd1 = req_ymd1;
    }

    @ElVoField(physicalName = "req_ymd2")
    public String getReq_ymd2(){
        return req_ymd2;
    }

    @ElVoField(physicalName = "req_ymd2")
    public void setReq_ymd2(String req_ymd2){
        this.req_ymd2 = req_ymd2;
    }

    @ElVoField(physicalName = "gdnm")
    public String getGdnm(){
        return gdnm;
    }

    @ElVoField(physicalName = "gdnm")
    public void setGdnm(String gdnm){
        this.gdnm = gdnm;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
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

    @ElVoField(physicalName = "gdnm_nm")
    public String getGdnm_nm(){
        return gdnm_nm;
    }

    @ElVoField(physicalName = "gdnm_nm")
    public void setGdnm_nm(String gdnm_nm){
        this.gdnm_nm = gdnm_nm;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "usg")
    public String getUsg(){
        return usg;
    }

    @ElVoField(physicalName = "usg")
    public void setUsg(String usg){
        this.usg = usg;
    }

    @ElVoField(physicalName = "submit_loc")
    public String getSubmit_loc(){
        return submit_loc;
    }

    @ElVoField(physicalName = "submit_loc")
    public void setSubmit_loc(String submit_loc){
        this.submit_loc = submit_loc;
    }

    @ElVoField(physicalName = "premnth_way")
    public String getPremnth_way(){
        return premnth_way;
    }

    @ElVoField(physicalName = "premnth_way")
    public void setPremnth_way(String premnth_way){
        this.premnth_way = premnth_way;
    }

    @ElVoField(physicalName = "premnth_way_nm")
    public String getPremnth_way_nm(){
        return premnth_way_nm;
    }

    @ElVoField(physicalName = "premnth_way_nm")
    public void setPremnth_way_nm(String premnth_way_nm){
        this.premnth_way_nm = premnth_way_nm;
    }

    @ElVoField(physicalName = "addr_clsf")
    public String getAddr_clsf(){
        return addr_clsf;
    }

    @ElVoField(physicalName = "addr_clsf")
    public void setAddr_clsf(String addr_clsf){
        this.addr_clsf = addr_clsf;
    }

    @ElVoField(physicalName = "addr_clsf_nm")
    public String getAddr_clsf_nm(){
        return addr_clsf_nm;
    }

    @ElVoField(physicalName = "addr_clsf_nm")
    public void setAddr_clsf_nm(String addr_clsf_nm){
        this.addr_clsf_nm = addr_clsf_nm;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @ElVoField(physicalName = "fax_no")
    public String getFax_no(){
        return fax_no;
    }

    @ElVoField(physicalName = "fax_no")
    public void setFax_no(String fax_no){
        this.fax_no = fax_no;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_emp_no")
    public String getReq_emp_no(){
        return req_emp_no;
    }

    @ElVoField(physicalName = "req_emp_no")
    public void setReq_emp_no(String req_emp_no){
        this.req_emp_no = req_emp_no;
    }

    @ElVoField(physicalName = "recv_psn_syspayno")
    public String getRecv_psn_syspayno(){
        return recv_psn_syspayno;
    }

    @ElVoField(physicalName = "recv_psn_syspayno")
    public void setRecv_psn_syspayno(String recv_psn_syspayno){
        this.recv_psn_syspayno = recv_psn_syspayno;
    }

    @ElVoField(physicalName = "recv_psn_nm")
    public String getRecv_psn_nm(){
        return recv_psn_nm;
    }

    @ElVoField(physicalName = "recv_psn_nm")
    public void setRecv_psn_nm(String recv_psn_nm){
        this.recv_psn_nm = recv_psn_nm;
    }

    @ElVoField(physicalName = "recv_ymd")
    public String getRecv_ymd(){
        return recv_ymd;
    }

    @ElVoField(physicalName = "recv_ymd")
    public void setRecv_ymd(String recv_ymd){
        this.recv_ymd = recv_ymd;
    }

    @ElVoField(physicalName = "issu_chk_no")
    public String getIssu_chk_no(){
        return issu_chk_no;
    }

    @ElVoField(physicalName = "issu_chk_no")
    public void setIssu_chk_no(String issu_chk_no){
        this.issu_chk_no = issu_chk_no;
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

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_state_nm")
    public String getReq_state_nm(){
        return req_state_nm;
    }

    @ElVoField(physicalName = "req_state_nm")
    public void setReq_state_nm(String req_state_nm){
        this.req_state_nm = req_state_nm;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
    }

    @ElVoField(physicalName = "fileList")
    public java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> getFileList(){
        return fileList;
    }

    @ElVoField(physicalName = "fileList")
    public void setFileList(java.util.List<kr.re.kitech.biz.xom.core.vo.AttachVo> fileList){
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsCertfUseVo [");
        sb.append("req_ymd1").append("=").append(req_ymd1).append(",");
        sb.append("req_ymd2").append("=").append(req_ymd2).append(",");
        sb.append("gdnm").append("=").append(gdnm).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("gdnm_nm").append("=").append(gdnm_nm).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("usg").append("=").append(usg).append(",");
        sb.append("submit_loc").append("=").append(submit_loc).append(",");
        sb.append("premnth_way").append("=").append(premnth_way).append(",");
        sb.append("premnth_way_nm").append("=").append(premnth_way_nm).append(",");
        sb.append("addr_clsf").append("=").append(addr_clsf).append(",");
        sb.append("addr_clsf_nm").append("=").append(addr_clsf_nm).append(",");
        sb.append("addr").append("=").append(addr).append(",");
        sb.append("fax_no").append("=").append(fax_no).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_emp_no").append("=").append(req_emp_no).append(",");
        sb.append("recv_psn_syspayno").append("=").append(recv_psn_syspayno).append(",");
        sb.append("recv_psn_nm").append("=").append(recv_psn_nm).append(",");
        sb.append("recv_ymd").append("=").append(recv_ymd).append(",");
        sb.append("issu_chk_no").append("=").append(issu_chk_no).append(",");
        sb.append("regst_psn_syspayno").append("=").append(regst_psn_syspayno).append(",");
        sb.append("regst_daytm").append("=").append(regst_daytm).append(",");
        sb.append("updt_psn_syspayno").append("=").append(updt_psn_syspayno).append(",");
        sb.append("updt_daytm").append("=").append(updt_daytm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_state_nm").append("=").append(req_state_nm).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("fileList").append("=").append(fileList);
        sb.append("]");
        return sb.toString();

    }

    public boolean isFixedLengthVo() {
        return false;
    }

    @Override
    public void _xStreamEnc() {
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamEnc();	 
        }
    }


    @Override
    public void _xStreamDec() {
        for( int i=0 ; fileList != null && i < fileList.size() ; i++ ) {
            kr.re.kitech.biz.xom.core.vo.AttachVo vo = (kr.re.kitech.biz.xom.core.vo.AttachVo)fileList.get(i);
            vo._xStreamDec();	 
        }
    }


}
