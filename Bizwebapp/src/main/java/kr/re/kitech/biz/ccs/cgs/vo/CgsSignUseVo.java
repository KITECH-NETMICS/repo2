package kr.re.kitech.biz.ccs.cgs.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "직인날인신청")
public class CgsSignUseVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CgsSignUseVo(){
    }

    @ElDtoField(logicalName = "조회시작일자", physicalName = "req_ymd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd1;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "req_ymd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd2;

    @ElDtoField(logicalName = "인장구분", physicalName = "seal_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seal_clsf;

    @ElDtoField(logicalName = "신청상태", physicalName = "req_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_state;

    @ElDtoField(logicalName = "신청부서코드", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "신청자시스템개인번호", physicalName = "req_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno;

    @ElDtoField(logicalName = "구분명", physicalName = "gubun", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gubun;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "날인번호", physicalName = "stamp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_no;

    @ElDtoField(logicalName = "계인명", physicalName = "seal_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String seal_clsf_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자명", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "최종결재자", physicalName = "final_apprvl_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_apprvl_psn;

    @ElDtoField(logicalName = "수신처", physicalName = "recv_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_loc;

    @ElDtoField(logicalName = "문서제목", physicalName = "docu_subj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_subj;

    @ElDtoField(logicalName = "부수", physicalName = "qty", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qty;

    @ElDtoField(logicalName = "문서번호", physicalName = "docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String docu_no;

    @ElDtoField(logicalName = "전달방법코드", physicalName = "premnth_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String premnth_way;

    @ElDtoField(logicalName = "전달방법명", physicalName = "premnth_way_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String premnth_way_nm;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "주관부서코드", physicalName = "supvis_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supvis_dept_cd;

    @ElDtoField(logicalName = "주관부서명", physicalName = "supvis_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supvis_dept_nm;

    @ElDtoField(logicalName = "날인일자", physicalName = "stamp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_ymd;

    @ElDtoField(logicalName = "날인자시스템개인번호", physicalName = "stamp_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_psn_syspayno;

    @ElDtoField(logicalName = "날인자명", physicalName = "stamp_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String stamp_psn_nm;

    @ElDtoField(logicalName = "결재상태명", physicalName = "req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_nm;

    @ElDtoField(logicalName = "", physicalName = "req_psn_syspayno_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_syspayno_nm;

    @ElDtoField(logicalName = "", physicalName = "final_apprvl_psn_emp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_apprvl_psn_emp_no;

    @ElDtoField(logicalName = "", physicalName = "final_apprvl_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_apprvl_psn_nm;

    @ElDtoField(logicalName = "", physicalName = "final_apprvl_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_apprvl_psn_email;

    @ElDtoField(logicalName = "주소구분코드", physicalName = "addr_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr_clsf;

    @ElDtoField(logicalName = "주소", physicalName = "addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addr;

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

    @ElVoField(physicalName = "seal_clsf")
    public String getSeal_clsf(){
        return seal_clsf;
    }

    @ElVoField(physicalName = "seal_clsf")
    public void setSeal_clsf(String seal_clsf){
        this.seal_clsf = seal_clsf;
    }

    @ElVoField(physicalName = "req_state")
    public String getReq_state(){
        return req_state;
    }

    @ElVoField(physicalName = "req_state")
    public void setReq_state(String req_state){
        this.req_state = req_state;
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

    @ElVoField(physicalName = "gubun")
    public String getGubun(){
        return gubun;
    }

    @ElVoField(physicalName = "gubun")
    public void setGubun(String gubun){
        this.gubun = gubun;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "stamp_no")
    public String getStamp_no(){
        return stamp_no;
    }

    @ElVoField(physicalName = "stamp_no")
    public void setStamp_no(String stamp_no){
        this.stamp_no = stamp_no;
    }

    @ElVoField(physicalName = "seal_clsf_nm")
    public String getSeal_clsf_nm(){
        return seal_clsf_nm;
    }

    @ElVoField(physicalName = "seal_clsf_nm")
    public void setSeal_clsf_nm(String seal_clsf_nm){
        this.seal_clsf_nm = seal_clsf_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "final_apprvl_psn")
    public String getFinal_apprvl_psn(){
        return final_apprvl_psn;
    }

    @ElVoField(physicalName = "final_apprvl_psn")
    public void setFinal_apprvl_psn(String final_apprvl_psn){
        this.final_apprvl_psn = final_apprvl_psn;
    }

    @ElVoField(physicalName = "recv_loc")
    public String getRecv_loc(){
        return recv_loc;
    }

    @ElVoField(physicalName = "recv_loc")
    public void setRecv_loc(String recv_loc){
        this.recv_loc = recv_loc;
    }

    @ElVoField(physicalName = "docu_subj")
    public String getDocu_subj(){
        return docu_subj;
    }

    @ElVoField(physicalName = "docu_subj")
    public void setDocu_subj(String docu_subj){
        this.docu_subj = docu_subj;
    }

    @ElVoField(physicalName = "qty")
    public String getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(String qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "docu_no")
    public String getDocu_no(){
        return docu_no;
    }

    @ElVoField(physicalName = "docu_no")
    public void setDocu_no(String docu_no){
        this.docu_no = docu_no;
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

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "supvis_dept_cd")
    public String getSupvis_dept_cd(){
        return supvis_dept_cd;
    }

    @ElVoField(physicalName = "supvis_dept_cd")
    public void setSupvis_dept_cd(String supvis_dept_cd){
        this.supvis_dept_cd = supvis_dept_cd;
    }

    @ElVoField(physicalName = "supvis_dept_nm")
    public String getSupvis_dept_nm(){
        return supvis_dept_nm;
    }

    @ElVoField(physicalName = "supvis_dept_nm")
    public void setSupvis_dept_nm(String supvis_dept_nm){
        this.supvis_dept_nm = supvis_dept_nm;
    }

    @ElVoField(physicalName = "stamp_ymd")
    public String getStamp_ymd(){
        return stamp_ymd;
    }

    @ElVoField(physicalName = "stamp_ymd")
    public void setStamp_ymd(String stamp_ymd){
        this.stamp_ymd = stamp_ymd;
    }

    @ElVoField(physicalName = "stamp_psn_syspayno")
    public String getStamp_psn_syspayno(){
        return stamp_psn_syspayno;
    }

    @ElVoField(physicalName = "stamp_psn_syspayno")
    public void setStamp_psn_syspayno(String stamp_psn_syspayno){
        this.stamp_psn_syspayno = stamp_psn_syspayno;
    }

    @ElVoField(physicalName = "stamp_psn_nm")
    public String getStamp_psn_nm(){
        return stamp_psn_nm;
    }

    @ElVoField(physicalName = "stamp_psn_nm")
    public void setStamp_psn_nm(String stamp_psn_nm){
        this.stamp_psn_nm = stamp_psn_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public String getReq_nm(){
        return req_nm;
    }

    @ElVoField(physicalName = "req_nm")
    public void setReq_nm(String req_nm){
        this.req_nm = req_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public String getReq_psn_syspayno_nm(){
        return req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "req_psn_syspayno_nm")
    public void setReq_psn_syspayno_nm(String req_psn_syspayno_nm){
        this.req_psn_syspayno_nm = req_psn_syspayno_nm;
    }

    @ElVoField(physicalName = "final_apprvl_psn_emp_no")
    public String getFinal_apprvl_psn_emp_no(){
        return final_apprvl_psn_emp_no;
    }

    @ElVoField(physicalName = "final_apprvl_psn_emp_no")
    public void setFinal_apprvl_psn_emp_no(String final_apprvl_psn_emp_no){
        this.final_apprvl_psn_emp_no = final_apprvl_psn_emp_no;
    }

    @ElVoField(physicalName = "final_apprvl_psn_nm")
    public String getFinal_apprvl_psn_nm(){
        return final_apprvl_psn_nm;
    }

    @ElVoField(physicalName = "final_apprvl_psn_nm")
    public void setFinal_apprvl_psn_nm(String final_apprvl_psn_nm){
        this.final_apprvl_psn_nm = final_apprvl_psn_nm;
    }

    @ElVoField(physicalName = "final_apprvl_psn_email")
    public String getFinal_apprvl_psn_email(){
        return final_apprvl_psn_email;
    }

    @ElVoField(physicalName = "final_apprvl_psn_email")
    public void setFinal_apprvl_psn_email(String final_apprvl_psn_email){
        this.final_apprvl_psn_email = final_apprvl_psn_email;
    }

    @ElVoField(physicalName = "addr_clsf")
    public String getAddr_clsf(){
        return addr_clsf;
    }

    @ElVoField(physicalName = "addr_clsf")
    public void setAddr_clsf(String addr_clsf){
        this.addr_clsf = addr_clsf;
    }

    @ElVoField(physicalName = "addr")
    public String getAddr(){
        return addr;
    }

    @ElVoField(physicalName = "addr")
    public void setAddr(String addr){
        this.addr = addr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CgsSignUseVo [");
        sb.append("req_ymd1").append("=").append(req_ymd1).append(",");
        sb.append("req_ymd2").append("=").append(req_ymd2).append(",");
        sb.append("seal_clsf").append("=").append(seal_clsf).append(",");
        sb.append("req_state").append("=").append(req_state).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_psn_syspayno").append("=").append(req_psn_syspayno).append(",");
        sb.append("gubun").append("=").append(gubun).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("stamp_no").append("=").append(stamp_no).append(",");
        sb.append("seal_clsf_nm").append("=").append(seal_clsf_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("final_apprvl_psn").append("=").append(final_apprvl_psn).append(",");
        sb.append("recv_loc").append("=").append(recv_loc).append(",");
        sb.append("docu_subj").append("=").append(docu_subj).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("docu_no").append("=").append(docu_no).append(",");
        sb.append("premnth_way").append("=").append(premnth_way).append(",");
        sb.append("premnth_way_nm").append("=").append(premnth_way_nm).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("supvis_dept_cd").append("=").append(supvis_dept_cd).append(",");
        sb.append("supvis_dept_nm").append("=").append(supvis_dept_nm).append(",");
        sb.append("stamp_ymd").append("=").append(stamp_ymd).append(",");
        sb.append("stamp_psn_syspayno").append("=").append(stamp_psn_syspayno).append(",");
        sb.append("stamp_psn_nm").append("=").append(stamp_psn_nm).append(",");
        sb.append("req_nm").append("=").append(req_nm).append(",");
        sb.append("req_psn_syspayno_nm").append("=").append(req_psn_syspayno_nm).append(",");
        sb.append("final_apprvl_psn_emp_no").append("=").append(final_apprvl_psn_emp_no).append(",");
        sb.append("final_apprvl_psn_nm").append("=").append(final_apprvl_psn_nm).append(",");
        sb.append("final_apprvl_psn_email").append("=").append(final_apprvl_psn_email).append(",");
        sb.append("addr_clsf").append("=").append(addr_clsf).append(",");
        sb.append("addr").append("=").append(addr);
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
