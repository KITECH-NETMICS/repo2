package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업체조회")
public class XodfVendVo extends kr.re.kitech.biz.fin.std.vo.XodfVendComVo {
    private static final long serialVersionUID = 1L;

    public XodfVendVo(){
    }

    @ElDtoField(logicalName = "주계좌여부", physicalName = "main_bankaccnt_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_bankaccnt_yn;

    @ElDtoField(logicalName = "은행명", physicalName = "tran_bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tran_bank_nm;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "예금주명", physicalName = "depstr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr;

    @ElDtoField(logicalName = "우편번호", physicalName = "postmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String postmt_no;

    @ElDtoField(logicalName = "거래처구분", physicalName = "vend_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf_nm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "법인및주민번호", physicalName = "corp_resid_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String corp_resid_no;

    @ElDtoField(logicalName = "은행코드", physicalName = "tran_bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tran_bank;

    @ElDtoField(logicalName = "거래처구분코드", physicalName = "vend_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf;

    @ElDtoField(logicalName = "전화번호", physicalName = "tel_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tel_no;

    @ElDtoField(logicalName = "팩스번호", physicalName = "fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fax;

    @ElDtoField(logicalName = "이메일", physicalName = "email_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String email_addr;

    @ElDtoField(logicalName = "기업가맹점번호", physicalName = "cmpy_joinsto_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cmpy_joinsto_no;

    @ElDtoField(logicalName = "신한가맹점번호", physicalName = "sihn_joinsto_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sihn_joinsto_no;

    @ElDtoField(logicalName = "국민가맹점번호", physicalName = "pepl_joinsto_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pepl_joinsto_no;

    @ElDtoField(logicalName = "영세율", physicalName = "zero_taxrts_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String zero_taxrts_yn;

    @ElDtoField(logicalName = "등록자", physicalName = "regst_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regst_nm;

    @ElDtoField(logicalName = "계좌번호사용여부", physicalName = "use_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_flag;

    @ElDtoField(logicalName = "거래처사용여부", physicalName = "use_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String use_yn;

    @ElDtoField(logicalName = "회원구분(기업지원)", physicalName = "supt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_clsf;

    @ElDtoField(logicalName = "파트너기업 지정번호(기업지원)", physicalName = "appont_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appont_no;

    @ElDtoField(logicalName = "파트너기업 탈퇴 여부", physicalName = "join_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_ex;

    @ElDtoField(logicalName = "계좌검증정보", physicalName = "is_account", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_account;

    @ElDtoField(logicalName = "주소", physicalName = "main_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_addr;

    @ElDtoField(logicalName = "상세주소", physicalName = "detls_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String detls_addr;

    @ElVoField(physicalName = "main_bankaccnt_yn")
    public String getMain_bankaccnt_yn(){
        return main_bankaccnt_yn;
    }

    @ElVoField(physicalName = "main_bankaccnt_yn")
    public void setMain_bankaccnt_yn(String main_bankaccnt_yn){
        this.main_bankaccnt_yn = main_bankaccnt_yn;
    }

    @ElVoField(physicalName = "tran_bank_nm")
    public String getTran_bank_nm(){
        return tran_bank_nm;
    }

    @ElVoField(physicalName = "tran_bank_nm")
    public void setTran_bank_nm(String tran_bank_nm){
        this.tran_bank_nm = tran_bank_nm;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr")
    public String getDepstr(){
        return depstr;
    }

    @ElVoField(physicalName = "depstr")
    public void setDepstr(String depstr){
        this.depstr = depstr;
    }

    @ElVoField(physicalName = "postmt_no")
    public String getPostmt_no(){
        return postmt_no;
    }

    @ElVoField(physicalName = "postmt_no")
    public void setPostmt_no(String postmt_no){
        this.postmt_no = postmt_no;
    }

    @ElVoField(physicalName = "vend_clsf_nm")
    public String getVend_clsf_nm(){
        return vend_clsf_nm;
    }

    @ElVoField(physicalName = "vend_clsf_nm")
    public void setVend_clsf_nm(String vend_clsf_nm){
        this.vend_clsf_nm = vend_clsf_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public String getCorp_resid_no(){
        return corp_resid_no;
    }

    @ElVoField(physicalName = "corp_resid_no")
    public void setCorp_resid_no(String corp_resid_no){
        this.corp_resid_no = corp_resid_no;
    }

    @ElVoField(physicalName = "tran_bank")
    public String getTran_bank(){
        return tran_bank;
    }

    @ElVoField(physicalName = "tran_bank")
    public void setTran_bank(String tran_bank){
        this.tran_bank = tran_bank;
    }

    @ElVoField(physicalName = "vend_clsf")
    public String getVend_clsf(){
        return vend_clsf;
    }

    @ElVoField(physicalName = "vend_clsf")
    public void setVend_clsf(String vend_clsf){
        this.vend_clsf = vend_clsf;
    }

    @ElVoField(physicalName = "tel_no")
    public String getTel_no(){
        return tel_no;
    }

    @ElVoField(physicalName = "tel_no")
    public void setTel_no(String tel_no){
        this.tel_no = tel_no;
    }

    @ElVoField(physicalName = "fax")
    public String getFax(){
        return fax;
    }

    @ElVoField(physicalName = "fax")
    public void setFax(String fax){
        this.fax = fax;
    }

    @ElVoField(physicalName = "email_addr")
    public String getEmail_addr(){
        return email_addr;
    }

    @ElVoField(physicalName = "email_addr")
    public void setEmail_addr(String email_addr){
        this.email_addr = email_addr;
    }

    @ElVoField(physicalName = "cmpy_joinsto_no")
    public String getCmpy_joinsto_no(){
        return cmpy_joinsto_no;
    }

    @ElVoField(physicalName = "cmpy_joinsto_no")
    public void setCmpy_joinsto_no(String cmpy_joinsto_no){
        this.cmpy_joinsto_no = cmpy_joinsto_no;
    }

    @ElVoField(physicalName = "sihn_joinsto_no")
    public String getSihn_joinsto_no(){
        return sihn_joinsto_no;
    }

    @ElVoField(physicalName = "sihn_joinsto_no")
    public void setSihn_joinsto_no(String sihn_joinsto_no){
        this.sihn_joinsto_no = sihn_joinsto_no;
    }

    @ElVoField(physicalName = "pepl_joinsto_no")
    public String getPepl_joinsto_no(){
        return pepl_joinsto_no;
    }

    @ElVoField(physicalName = "pepl_joinsto_no")
    public void setPepl_joinsto_no(String pepl_joinsto_no){
        this.pepl_joinsto_no = pepl_joinsto_no;
    }

    @ElVoField(physicalName = "zero_taxrts_yn")
    public String getZero_taxrts_yn(){
        return zero_taxrts_yn;
    }

    @ElVoField(physicalName = "zero_taxrts_yn")
    public void setZero_taxrts_yn(String zero_taxrts_yn){
        this.zero_taxrts_yn = zero_taxrts_yn;
    }

    @ElVoField(physicalName = "regst_nm")
    public String getRegst_nm(){
        return regst_nm;
    }

    @ElVoField(physicalName = "regst_nm")
    public void setRegst_nm(String regst_nm){
        this.regst_nm = regst_nm;
    }

    @ElVoField(physicalName = "use_flag")
    public String getUse_flag(){
        return use_flag;
    }

    @ElVoField(physicalName = "use_flag")
    public void setUse_flag(String use_flag){
        this.use_flag = use_flag;
    }

    @ElVoField(physicalName = "use_yn")
    public String getUse_yn(){
        return use_yn;
    }

    @ElVoField(physicalName = "use_yn")
    public void setUse_yn(String use_yn){
        this.use_yn = use_yn;
    }

    @ElVoField(physicalName = "supt_clsf")
    public String getSupt_clsf(){
        return supt_clsf;
    }

    @ElVoField(physicalName = "supt_clsf")
    public void setSupt_clsf(String supt_clsf){
        this.supt_clsf = supt_clsf;
    }

    @ElVoField(physicalName = "appont_no")
    public String getAppont_no(){
        return appont_no;
    }

    @ElVoField(physicalName = "appont_no")
    public void setAppont_no(String appont_no){
        this.appont_no = appont_no;
    }

    @ElVoField(physicalName = "join_ex")
    public String getJoin_ex(){
        return join_ex;
    }

    @ElVoField(physicalName = "join_ex")
    public void setJoin_ex(String join_ex){
        this.join_ex = join_ex;
    }

    @ElVoField(physicalName = "is_account")
    public String getIs_account(){
        return is_account;
    }

    @ElVoField(physicalName = "is_account")
    public void setIs_account(String is_account){
        this.is_account = is_account;
    }

    @ElVoField(physicalName = "main_addr")
    public String getMain_addr(){
        return main_addr;
    }

    @ElVoField(physicalName = "main_addr")
    public void setMain_addr(String main_addr){
        this.main_addr = main_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public String getDetls_addr(){
        return detls_addr;
    }

    @ElVoField(physicalName = "detls_addr")
    public void setDetls_addr(String detls_addr){
        this.detls_addr = detls_addr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XodfVendVo [");
        sb.append("main_bankaccnt_yn").append("=").append(main_bankaccnt_yn).append(",");
        sb.append("tran_bank_nm").append("=").append(tran_bank_nm).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr").append("=").append(depstr).append(",");
        sb.append("postmt_no").append("=").append(postmt_no).append(",");
        sb.append("vend_clsf_nm").append("=").append(vend_clsf_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("corp_resid_no").append("=").append(corp_resid_no).append(",");
        sb.append("tran_bank").append("=").append(tran_bank).append(",");
        sb.append("vend_clsf").append("=").append(vend_clsf).append(",");
        sb.append("tel_no").append("=").append(tel_no).append(",");
        sb.append("fax").append("=").append(fax).append(",");
        sb.append("email_addr").append("=").append(email_addr).append(",");
        sb.append("cmpy_joinsto_no").append("=").append(cmpy_joinsto_no).append(",");
        sb.append("sihn_joinsto_no").append("=").append(sihn_joinsto_no).append(",");
        sb.append("pepl_joinsto_no").append("=").append(pepl_joinsto_no).append(",");
        sb.append("zero_taxrts_yn").append("=").append(zero_taxrts_yn).append(",");
        sb.append("regst_nm").append("=").append(regst_nm).append(",");
        sb.append("use_flag").append("=").append(use_flag).append(",");
        sb.append("use_yn").append("=").append(use_yn).append(",");
        sb.append("supt_clsf").append("=").append(supt_clsf).append(",");
        sb.append("appont_no").append("=").append(appont_no).append(",");
        sb.append("join_ex").append("=").append(join_ex).append(",");
        sb.append("is_account").append("=").append(is_account).append(",");
        sb.append("main_addr").append("=").append(main_addr).append(",");
        sb.append("detls_addr").append("=").append(detls_addr);
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
