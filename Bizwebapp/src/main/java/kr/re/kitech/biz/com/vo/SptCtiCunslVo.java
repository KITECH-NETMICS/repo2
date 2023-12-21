package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업체조회")
public class SptCtiCunslVo extends kr.re.kitech.biz.com.vo.XodfVendVo {
    private static final long serialVersionUID = 1L;

    public SptCtiCunslVo(){
    }

    @ElDtoField(logicalName = "기업유형코드", physicalName = "cmpy_typ", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ;

    @ElDtoField(logicalName = "기업유형명", physicalName = "cmpy_typ_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_typ_nm;

    @ElDtoField(logicalName = "회사우편번호", physicalName = "cmpy_post_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_post_no;

    @ElDtoField(logicalName = "회사주소상세", physicalName = "cmpy_addr_detls", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_detls;

    @ElDtoField(logicalName = "회사주소(디스플레이용)", physicalName = "cmpy_addr_dis", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr_dis;

    @ElDtoField(logicalName = "상담의뢰자성명", physicalName = "cunsl_req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn;

    @ElDtoField(logicalName = "상담의뢰자직책", physicalName = "cunsl_req_psn_posi", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_posi;

    @ElDtoField(logicalName = "상담의뢰자일반전화번호", physicalName = "cunsl_req_psn_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_tel;

    @ElDtoField(logicalName = "상담의뢰자모바일", physicalName = "cunsl_req_psn_mobile_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_mobile_no;

    @ElDtoField(logicalName = "상담의뢰자이메일", physicalName = "cunsl_req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_req_psn_email;

    @ElDtoField(logicalName = "기술지도신청번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "검색조건", physicalName = "type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String type;

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "고객명(한글)", physicalName = "cmpy_nm_krchar", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_nm_krchar;

    @ElDtoField(logicalName = "대표자성명", physicalName = "reprs_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn;

    @ElDtoField(logicalName = "지원구분", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "회사대표번호", physicalName = "cmpy_reprs_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_reprs_tel;

    @ElDtoField(logicalName = "회사주소상세", physicalName = "cmpy_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_addr;

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElVoField(physicalName = "cmpy_typ")
    public String getCmpy_typ(){
        return cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ")
    public void setCmpy_typ(String cmpy_typ){
        this.cmpy_typ = cmpy_typ;
    }

    @ElVoField(physicalName = "cmpy_typ_nm")
    public String getCmpy_typ_nm(){
        return cmpy_typ_nm;
    }

    @ElVoField(physicalName = "cmpy_typ_nm")
    public void setCmpy_typ_nm(String cmpy_typ_nm){
        this.cmpy_typ_nm = cmpy_typ_nm;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public String getCmpy_post_no(){
        return cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_post_no")
    public void setCmpy_post_no(String cmpy_post_no){
        this.cmpy_post_no = cmpy_post_no;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public String getCmpy_addr_detls(){
        return cmpy_addr_detls;
    }

    @ElVoField(physicalName = "cmpy_addr_detls")
    public void setCmpy_addr_detls(String cmpy_addr_detls){
        this.cmpy_addr_detls = cmpy_addr_detls;
    }

    @ElVoField(physicalName = "cmpy_addr_dis")
    public String getCmpy_addr_dis(){
        return cmpy_addr_dis;
    }

    @ElVoField(physicalName = "cmpy_addr_dis")
    public void setCmpy_addr_dis(String cmpy_addr_dis){
        this.cmpy_addr_dis = cmpy_addr_dis;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public String getCunsl_req_psn(){
        return cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn")
    public void setCunsl_req_psn(String cunsl_req_psn){
        this.cunsl_req_psn = cunsl_req_psn;
    }

    @ElVoField(physicalName = "cunsl_req_psn_posi")
    public String getCunsl_req_psn_posi(){
        return cunsl_req_psn_posi;
    }

    @ElVoField(physicalName = "cunsl_req_psn_posi")
    public void setCunsl_req_psn_posi(String cunsl_req_psn_posi){
        this.cunsl_req_psn_posi = cunsl_req_psn_posi;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public String getCunsl_req_psn_tel(){
        return cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_tel")
    public void setCunsl_req_psn_tel(String cunsl_req_psn_tel){
        this.cunsl_req_psn_tel = cunsl_req_psn_tel;
    }

    @ElVoField(physicalName = "cunsl_req_psn_mobile_no")
    public String getCunsl_req_psn_mobile_no(){
        return cunsl_req_psn_mobile_no;
    }

    @ElVoField(physicalName = "cunsl_req_psn_mobile_no")
    public void setCunsl_req_psn_mobile_no(String cunsl_req_psn_mobile_no){
        this.cunsl_req_psn_mobile_no = cunsl_req_psn_mobile_no;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public String getCunsl_req_psn_email(){
        return cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "cunsl_req_psn_email")
    public void setCunsl_req_psn_email(String cunsl_req_psn_email){
        this.cunsl_req_psn_email = cunsl_req_psn_email;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "type")
    public String getType(){
        return type;
    }

    @ElVoField(physicalName = "type")
    public void setType(String type){
        this.type = type;
    }

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public String getCmpy_nm_krchar(){
        return cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "cmpy_nm_krchar")
    public void setCmpy_nm_krchar(String cmpy_nm_krchar){
        this.cmpy_nm_krchar = cmpy_nm_krchar;
    }

    @ElVoField(physicalName = "reprs_psn")
    public String getReprs_psn(){
        return reprs_psn;
    }

    @ElVoField(physicalName = "reprs_psn")
    public void setReprs_psn(String reprs_psn){
        this.reprs_psn = reprs_psn;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public String getCmpy_reprs_tel(){
        return cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_reprs_tel")
    public void setCmpy_reprs_tel(String cmpy_reprs_tel){
        this.cmpy_reprs_tel = cmpy_reprs_tel;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public String getCmpy_addr(){
        return cmpy_addr;
    }

    @ElVoField(physicalName = "cmpy_addr")
    public void setCmpy_addr(String cmpy_addr){
        this.cmpy_addr = cmpy_addr;
    }

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptCtiCunslVo [");
        sb.append("cmpy_typ").append("=").append(cmpy_typ).append(",");
        sb.append("cmpy_typ_nm").append("=").append(cmpy_typ_nm).append(",");
        sb.append("cmpy_post_no").append("=").append(cmpy_post_no).append(",");
        sb.append("cmpy_addr_detls").append("=").append(cmpy_addr_detls).append(",");
        sb.append("cmpy_addr_dis").append("=").append(cmpy_addr_dis).append(",");
        sb.append("cunsl_req_psn").append("=").append(cunsl_req_psn).append(",");
        sb.append("cunsl_req_psn_posi").append("=").append(cunsl_req_psn_posi).append(",");
        sb.append("cunsl_req_psn_tel").append("=").append(cunsl_req_psn_tel).append(",");
        sb.append("cunsl_req_psn_mobile_no").append("=").append(cunsl_req_psn_mobile_no).append(",");
        sb.append("cunsl_req_psn_email").append("=").append(cunsl_req_psn_email).append(",");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("type").append("=").append(type).append(",");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cmpy_nm_krchar").append("=").append(cmpy_nm_krchar).append(",");
        sb.append("reprs_psn").append("=").append(reprs_psn).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("cmpy_reprs_tel").append("=").append(cmpy_reprs_tel).append(",");
        sb.append("cmpy_addr").append("=").append(cmpy_addr).append(",");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd);
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
