package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "계좌검증 Vo")
public class AccountVerfVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AccountVerfVo(){
    }

    @ElDtoField(logicalName = "은행코드", physicalName = "bank_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_cd;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "생년월일 혹은 사업자번호", physicalName = "acnm_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acnm_no;

    @ElDtoField(logicalName = "이체금액", physicalName = "iche_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long iche_amt;

    @ElDtoField(logicalName = "거래 일련번호", physicalName = "trsc_seq_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trsc_seq_no;

    @ElDtoField(logicalName = "예금주", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "예금주이름(리턴)", physicalName = "res_data", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String res_data;

    @ElDtoField(logicalName = "검증결과", physicalName = "result", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String result;

    @ElDtoField(logicalName = "성공여부", physicalName = "success", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String success;

    @ElDtoField(logicalName = "service_id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "tmp2", physicalName = "tmp2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tmp2;

    @ElDtoField(logicalName = "tmp3", physicalName = "tmp3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tmp3;

    @ElDtoField(logicalName = "검증결과", physicalName = "is_account", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String is_account;

    @ElVoField(physicalName = "bank_cd")
    public String getBank_cd(){
        return bank_cd;
    }

    @ElVoField(physicalName = "bank_cd")
    public void setBank_cd(String bank_cd){
        this.bank_cd = bank_cd;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "acnm_no")
    public String getAcnm_no(){
        return acnm_no;
    }

    @ElVoField(physicalName = "acnm_no")
    public void setAcnm_no(String acnm_no){
        this.acnm_no = acnm_no;
    }

    @ElVoField(physicalName = "iche_amt")
    public long getIche_amt(){
        return iche_amt;
    }

    @ElVoField(physicalName = "iche_amt")
    public void setIche_amt(long iche_amt){
        this.iche_amt = iche_amt;
    }

    @ElVoField(physicalName = "trsc_seq_no")
    public String getTrsc_seq_no(){
        return trsc_seq_no;
    }

    @ElVoField(physicalName = "trsc_seq_no")
    public void setTrsc_seq_no(String trsc_seq_no){
        this.trsc_seq_no = trsc_seq_no;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "res_data")
    public String getRes_data(){
        return res_data;
    }

    @ElVoField(physicalName = "res_data")
    public void setRes_data(String res_data){
        this.res_data = res_data;
    }

    @ElVoField(physicalName = "result")
    public String getResult(){
        return result;
    }

    @ElVoField(physicalName = "result")
    public void setResult(String result){
        this.result = result;
    }

    @ElVoField(physicalName = "success")
    public String getSuccess(){
        return success;
    }

    @ElVoField(physicalName = "success")
    public void setSuccess(String success){
        this.success = success;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "tmp2")
    public String getTmp2(){
        return tmp2;
    }

    @ElVoField(physicalName = "tmp2")
    public void setTmp2(String tmp2){
        this.tmp2 = tmp2;
    }

    @ElVoField(physicalName = "tmp3")
    public String getTmp3(){
        return tmp3;
    }

    @ElVoField(physicalName = "tmp3")
    public void setTmp3(String tmp3){
        this.tmp3 = tmp3;
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
        sb.append("AccountVerfVo [");
        sb.append("bank_cd").append("=").append(bank_cd).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("acnm_no").append("=").append(acnm_no).append(",");
        sb.append("iche_amt").append("=").append(iche_amt).append(",");
        sb.append("trsc_seq_no").append("=").append(trsc_seq_no).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("res_data").append("=").append(res_data).append(",");
        sb.append("result").append("=").append(result).append(",");
        sb.append("success").append("=").append(success).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("tmp2").append("=").append(tmp2).append(",");
        sb.append("tmp3").append("=").append(tmp3).append(",");
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
