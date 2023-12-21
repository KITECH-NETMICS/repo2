package kr.re.kitech.biz.pat.app.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "지재권 관련과제 Vo")
public class PatRelatReschPrjVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PatRelatReschPrjVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "과제명", physicalName = "prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_nm;

    @ElDtoField(logicalName = "연구책임자", physicalName = "resch_respn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_syspayno;

    @ElDtoField(logicalName = "과제기간", physicalName = "prj_term", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_term;

    @ElDtoField(logicalName = "연구책임성명", physicalName = "resch_respn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_respn_nm;

    @ElDtoField(logicalName = "연구책임이메일", physicalName = "email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email;

    @ElDtoField(logicalName = "연구책임모바일", physicalName = "mobile", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mobile;

    @ElDtoField(logicalName = "사업구분명", physicalName = "bsns_cd_inout_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout_nm;

    @ElDtoField(logicalName = "사업구분", physicalName = "bsns_cd_inout", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_cd_inout;

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
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

    @ElVoField(physicalName = "prj_nm")
    public String getPrj_nm(){
        return prj_nm;
    }

    @ElVoField(physicalName = "prj_nm")
    public void setPrj_nm(String prj_nm){
        this.prj_nm = prj_nm;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public String getResch_respn_syspayno(){
        return resch_respn_syspayno;
    }

    @ElVoField(physicalName = "resch_respn_syspayno")
    public void setResch_respn_syspayno(String resch_respn_syspayno){
        this.resch_respn_syspayno = resch_respn_syspayno;
    }

    @ElVoField(physicalName = "prj_term")
    public String getPrj_term(){
        return prj_term;
    }

    @ElVoField(physicalName = "prj_term")
    public void setPrj_term(String prj_term){
        this.prj_term = prj_term;
    }

    @ElVoField(physicalName = "resch_respn_nm")
    public String getResch_respn_nm(){
        return resch_respn_nm;
    }

    @ElVoField(physicalName = "resch_respn_nm")
    public void setResch_respn_nm(String resch_respn_nm){
        this.resch_respn_nm = resch_respn_nm;
    }

    @ElVoField(physicalName = "email")
    public String getEmail(){
        return email;
    }

    @ElVoField(physicalName = "email")
    public void setEmail(String email){
        this.email = email;
    }

    @ElVoField(physicalName = "mobile")
    public String getMobile(){
        return mobile;
    }

    @ElVoField(physicalName = "mobile")
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public String getBsns_cd_inout_nm(){
        return bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout_nm")
    public void setBsns_cd_inout_nm(String bsns_cd_inout_nm){
        this.bsns_cd_inout_nm = bsns_cd_inout_nm;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public String getBsns_cd_inout(){
        return bsns_cd_inout;
    }

    @ElVoField(physicalName = "bsns_cd_inout")
    public void setBsns_cd_inout(String bsns_cd_inout){
        this.bsns_cd_inout = bsns_cd_inout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatRelatReschPrjVo [");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("prj_nm").append("=").append(prj_nm).append(",");
        sb.append("resch_respn_syspayno").append("=").append(resch_respn_syspayno).append(",");
        sb.append("prj_term").append("=").append(prj_term).append(",");
        sb.append("resch_respn_nm").append("=").append(resch_respn_nm).append(",");
        sb.append("email").append("=").append(email).append(",");
        sb.append("mobile").append("=").append(mobile).append(",");
        sb.append("bsns_cd_inout_nm").append("=").append(bsns_cd_inout_nm).append(",");
        sb.append("bsns_cd_inout").append("=").append(bsns_cd_inout);
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
