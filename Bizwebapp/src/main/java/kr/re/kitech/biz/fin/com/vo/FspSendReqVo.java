package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서 송금내역 VO")
public class FspSendReqVo extends kr.re.kitech.biz.fin.com.vo.SlipBaseVo {
    private static final long serialVersionUID = 1L;

    public FspSendReqVo(){
    }

    @ElDtoField(logicalName = "지급구분", physicalName = "pay_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수")
    private String pay_clsf;

    @ElDtoField(logicalName = "송금의뢰금액", physicalName = "send_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수")
    private long send_req_amt;

    @ElDtoField(logicalName = "송금금액", physicalName = "send_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long send_amt;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "지급구분이 거래처일 경우 필수")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "개인지급일 경우 필수")
    private String syspayno;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급이 아닐경우")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "은행", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급이 아닐경우")
    private String bank;

    @ElDtoField(logicalName = "예금주명", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급이 아닐경우")
    private String depstr_nm;

    @ElDtoField(logicalName = "카드번호", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급일경우")
    private String card_no;

    @ElDtoField(logicalName = "사용일자", physicalName = "use_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급일경우")
    private String use_ymd;

    @ElDtoField(logicalName = "승인번호", physicalName = "apprvl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급일경우")
    private String apprvl_no;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급이 아닐경우")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "가맹점명", physicalName = "joinsto_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "카드지급일경우")
    private String joinsto_nm;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "결의회계코드", physicalName = "conf_accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String conf_accnt_cd;

    @ElDtoField(logicalName = "CUD타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "필수(C,U,D)")
    private String cud_type;

    @ElDtoField(logicalName = "개인및거래처명", physicalName = "emp_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emp_vend;

    @ElDtoField(logicalName = "지로/현금구분", physicalName = "giro_cash_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String giro_cash_clsf;

    @ElDtoField(logicalName = "계좌검증여부", physicalName = "is_account", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_account;

    @ElVoField(physicalName = "pay_clsf")
    public String getPay_clsf(){
        return pay_clsf;
    }

    @ElVoField(physicalName = "pay_clsf")
    public void setPay_clsf(String pay_clsf){
        this.pay_clsf = pay_clsf;
    }

    @ElVoField(physicalName = "send_req_amt")
    public long getSend_req_amt(){
        return send_req_amt;
    }

    @ElVoField(physicalName = "send_req_amt")
    public void setSend_req_amt(long send_req_amt){
        this.send_req_amt = send_req_amt;
    }

    @ElVoField(physicalName = "send_amt")
    public long getSend_amt(){
        return send_amt;
    }

    @ElVoField(physicalName = "send_amt")
    public void setSend_amt(long send_amt){
        this.send_amt = send_amt;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "use_ymd")
    public String getUse_ymd(){
        return use_ymd;
    }

    @ElVoField(physicalName = "use_ymd")
    public void setUse_ymd(String use_ymd){
        this.use_ymd = use_ymd;
    }

    @ElVoField(physicalName = "apprvl_no")
    public String getApprvl_no(){
        return apprvl_no;
    }

    @ElVoField(physicalName = "apprvl_no")
    public void setApprvl_no(String apprvl_no){
        this.apprvl_no = apprvl_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "joinsto_nm")
    public String getJoinsto_nm(){
        return joinsto_nm;
    }

    @ElVoField(physicalName = "joinsto_nm")
    public void setJoinsto_nm(String joinsto_nm){
        this.joinsto_nm = joinsto_nm;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public String getConf_accnt_cd(){
        return conf_accnt_cd;
    }

    @ElVoField(physicalName = "conf_accnt_cd")
    public void setConf_accnt_cd(String conf_accnt_cd){
        this.conf_accnt_cd = conf_accnt_cd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "emp_vend")
    public String getEmp_vend(){
        return emp_vend;
    }

    @ElVoField(physicalName = "emp_vend")
    public void setEmp_vend(String emp_vend){
        this.emp_vend = emp_vend;
    }

    @ElVoField(physicalName = "giro_cash_clsf")
    public String getGiro_cash_clsf(){
        return giro_cash_clsf;
    }

    @ElVoField(physicalName = "giro_cash_clsf")
    public void setGiro_cash_clsf(String giro_cash_clsf){
        this.giro_cash_clsf = giro_cash_clsf;
    }

    @ElVoField(physicalName = "is_account")
    public String getIs_account(){
        return is_account;
    }

    @ElVoField(physicalName = "is_account")
    public void setIs_account(String is_account){
        this.is_account = is_account;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSendReqVo [");
        sb.append("pay_clsf").append("=").append(pay_clsf).append(",");
        sb.append("send_req_amt").append("=").append(send_req_amt).append(",");
        sb.append("send_amt").append("=").append(send_amt).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("use_ymd").append("=").append(use_ymd).append(",");
        sb.append("apprvl_no").append("=").append(apprvl_no).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("joinsto_nm").append("=").append(joinsto_nm).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("conf_accnt_cd").append("=").append(conf_accnt_cd).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("emp_vend").append("=").append(emp_vend).append(",");
        sb.append("giro_cash_clsf").append("=").append(giro_cash_clsf).append(",");
        sb.append("is_account").append("=").append(is_account);
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
