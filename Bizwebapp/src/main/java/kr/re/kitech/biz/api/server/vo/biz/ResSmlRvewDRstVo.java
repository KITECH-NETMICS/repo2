package kr.re.kitech.biz.api.server.vo.biz;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소연심의결과보고 결재완료시 총괄위저장을 위한 조회Vo")
public class ResSmlRvewDRstVo extends kr.re.kitech.biz.res.rte.vo.ResSmlRvewDVo {
    private static final long serialVersionUID = 1L;

    public ResSmlRvewDRstVo(){
    }

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "업무구분명", physicalName = "biz_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf_nm;

    @ElDtoField(logicalName = "항목구분순번", physicalName = "item_clsf_seq", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_clsf_seq;

    @ElDtoField(logicalName = "소연심의결과명", physicalName = "rvew_rst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst_nm;

    @ElDtoField(logicalName = "소연심의결과", physicalName = "rvew_rst", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst;

    @ElDtoField(logicalName = "소연심의결과코드", physicalName = "rvew_rst_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_rst_cd;

    @ElDtoField(logicalName = "소연심의결과보고번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "심의제목", physicalName = "rvew_sbj", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rvew_sbj;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "주요대상자이메일", physicalName = "email_01", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_01;

    @ElDtoField(logicalName = "기술료담당자", physicalName = "email_02", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_02;

    @ElDtoField(logicalName = "주발명자이메일", physicalName = "email_03", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_03;

    @ElDtoField(logicalName = "소연심의신청자이메일", physicalName = "email_04", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_04;

    @ElDtoField(logicalName = "pdf 여부", physicalName = "pdp_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pdp_flag;

    @ElDtoField(logicalName = "지식재산권구분", physicalName = "pat_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pat_clsf;

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "biz_clsf_nm")
    public String getBiz_clsf_nm(){
        return biz_clsf_nm;
    }

    @ElVoField(physicalName = "biz_clsf_nm")
    public void setBiz_clsf_nm(String biz_clsf_nm){
        this.biz_clsf_nm = biz_clsf_nm;
    }

    @ElVoField(physicalName = "item_clsf_seq")
    public String getItem_clsf_seq(){
        return item_clsf_seq;
    }

    @ElVoField(physicalName = "item_clsf_seq")
    public void setItem_clsf_seq(String item_clsf_seq){
        this.item_clsf_seq = item_clsf_seq;
    }

    @ElVoField(physicalName = "rvew_rst_nm")
    public String getRvew_rst_nm(){
        return rvew_rst_nm;
    }

    @ElVoField(physicalName = "rvew_rst_nm")
    public void setRvew_rst_nm(String rvew_rst_nm){
        this.rvew_rst_nm = rvew_rst_nm;
    }

    @ElVoField(physicalName = "rvew_rst")
    public String getRvew_rst(){
        return rvew_rst;
    }

    @ElVoField(physicalName = "rvew_rst")
    public void setRvew_rst(String rvew_rst){
        this.rvew_rst = rvew_rst;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public String getRvew_rst_cd(){
        return rvew_rst_cd;
    }

    @ElVoField(physicalName = "rvew_rst_cd")
    public void setRvew_rst_cd(String rvew_rst_cd){
        this.rvew_rst_cd = rvew_rst_cd;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "rvew_sbj")
    public String getRvew_sbj(){
        return rvew_sbj;
    }

    @ElVoField(physicalName = "rvew_sbj")
    public void setRvew_sbj(String rvew_sbj){
        this.rvew_sbj = rvew_sbj;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "email_01")
    public String getEmail_01(){
        return email_01;
    }

    @ElVoField(physicalName = "email_01")
    public void setEmail_01(String email_01){
        this.email_01 = email_01;
    }

    @ElVoField(physicalName = "email_02")
    public String getEmail_02(){
        return email_02;
    }

    @ElVoField(physicalName = "email_02")
    public void setEmail_02(String email_02){
        this.email_02 = email_02;
    }

    @ElVoField(physicalName = "email_03")
    public String getEmail_03(){
        return email_03;
    }

    @ElVoField(physicalName = "email_03")
    public void setEmail_03(String email_03){
        this.email_03 = email_03;
    }

    @ElVoField(physicalName = "email_04")
    public String getEmail_04(){
        return email_04;
    }

    @ElVoField(physicalName = "email_04")
    public void setEmail_04(String email_04){
        this.email_04 = email_04;
    }

    @ElVoField(physicalName = "pdp_flag")
    public String getPdp_flag(){
        return pdp_flag;
    }

    @ElVoField(physicalName = "pdp_flag")
    public void setPdp_flag(String pdp_flag){
        this.pdp_flag = pdp_flag;
    }

    @ElVoField(physicalName = "pat_clsf")
    public String getPat_clsf(){
        return pat_clsf;
    }

    @ElVoField(physicalName = "pat_clsf")
    public void setPat_clsf(String pat_clsf){
        this.pat_clsf = pat_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResSmlRvewDRstVo [");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("biz_clsf_nm").append("=").append(biz_clsf_nm).append(",");
        sb.append("item_clsf_seq").append("=").append(item_clsf_seq).append(",");
        sb.append("rvew_rst_nm").append("=").append(rvew_rst_nm).append(",");
        sb.append("rvew_rst").append("=").append(rvew_rst).append(",");
        sb.append("rvew_rst_cd").append("=").append(rvew_rst_cd).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("rvew_sbj").append("=").append(rvew_sbj).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("email_01").append("=").append(email_01).append(",");
        sb.append("email_02").append("=").append(email_02).append(",");
        sb.append("email_03").append("=").append(email_03).append(",");
        sb.append("email_04").append("=").append(email_04).append(",");
        sb.append("pdp_flag").append("=").append(pdp_flag).append(",");
        sb.append("pat_clsf").append("=").append(pat_clsf);
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
