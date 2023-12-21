package kr.re.kitech.biz.fin.spa.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "소액물품결의생성 Vo")
public class FspSmlItmCheckupSlipVo extends kr.re.kitech.biz.fin.com.vo.FspSlipDVo {
    private static final long serialVersionUID = 1L;

    public FspSmlItmCheckupSlipVo(){
    }

    @ElDtoField(logicalName = "검수번호", physicalName = "check_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String check_no;

    @ElDtoField(logicalName = "입회(검수)부서", physicalName = "entsch_check_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_dept_nm;

    @ElDtoField(logicalName = "납품일자", physicalName = "delvr_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_ymd;

    @ElDtoField(logicalName = "입회(검수)자", physicalName = "entsch_check_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_nm;

    @ElDtoField(logicalName = "검수금액", physicalName = "check_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long check_amt;

    @ElDtoField(logicalName = "입회(검수)일자", physicalName = "entsch_check_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String entsch_check_ymd;

    @ElDtoField(logicalName = "적요", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "카드사용구분", physicalName = "card_use_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_use_ex;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "예금주", physicalName = "depstr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depstr_nm;

    @ElDtoField(logicalName = "은행", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "거래처코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "개인번호", physicalName = "empno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String empno;

    @ElDtoField(logicalName = "성명", physicalName = "nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nm;

    @ElDtoField(logicalName = "첨부파일연계여부", physicalName = "attach_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_yn;

    @ElDtoField(logicalName = "ZEUS장비등록번호", physicalName = "ntis_reg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ntis_reg_no;

    @ElDtoField(logicalName = "전자증빙목록(거래명세서)", physicalName = "evid_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_attach_file_no;

    @ElDtoField(logicalName = "기타(결제)첨부파일", physicalName = "etc_attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_attach_file_no;

    @ElDtoField(logicalName = "기타(결제)정보", physicalName = "etc_pay_info", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String etc_pay_info;

    @ElVoField(physicalName = "check_no")
    public String getCheck_no(){
        return check_no;
    }

    @ElVoField(physicalName = "check_no")
    public void setCheck_no(String check_no){
        this.check_no = check_no;
    }

    @ElVoField(physicalName = "entsch_check_dept_nm")
    public String getEntsch_check_dept_nm(){
        return entsch_check_dept_nm;
    }

    @ElVoField(physicalName = "entsch_check_dept_nm")
    public void setEntsch_check_dept_nm(String entsch_check_dept_nm){
        this.entsch_check_dept_nm = entsch_check_dept_nm;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public String getDelvr_ymd(){
        return delvr_ymd;
    }

    @ElVoField(physicalName = "delvr_ymd")
    public void setDelvr_ymd(String delvr_ymd){
        this.delvr_ymd = delvr_ymd;
    }

    @ElVoField(physicalName = "entsch_check_nm")
    public String getEntsch_check_nm(){
        return entsch_check_nm;
    }

    @ElVoField(physicalName = "entsch_check_nm")
    public void setEntsch_check_nm(String entsch_check_nm){
        this.entsch_check_nm = entsch_check_nm;
    }

    @ElVoField(physicalName = "check_amt")
    public long getCheck_amt(){
        return check_amt;
    }

    @ElVoField(physicalName = "check_amt")
    public void setCheck_amt(long check_amt){
        this.check_amt = check_amt;
    }

    @ElVoField(physicalName = "entsch_check_ymd")
    public String getEntsch_check_ymd(){
        return entsch_check_ymd;
    }

    @ElVoField(physicalName = "entsch_check_ymd")
    public void setEntsch_check_ymd(String entsch_check_ymd){
        this.entsch_check_ymd = entsch_check_ymd;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "card_use_ex")
    public String getCard_use_ex(){
        return card_use_ex;
    }

    @ElVoField(physicalName = "card_use_ex")
    public void setCard_use_ex(String card_use_ex){
        this.card_use_ex = card_use_ex;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "depstr_nm")
    public String getDepstr_nm(){
        return depstr_nm;
    }

    @ElVoField(physicalName = "depstr_nm")
    public void setDepstr_nm(String depstr_nm){
        this.depstr_nm = depstr_nm;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
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

    @ElVoField(physicalName = "attach_yn")
    public String getAttach_yn(){
        return attach_yn;
    }

    @ElVoField(physicalName = "attach_yn")
    public void setAttach_yn(String attach_yn){
        this.attach_yn = attach_yn;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public String getNtis_reg_no(){
        return ntis_reg_no;
    }

    @ElVoField(physicalName = "ntis_reg_no")
    public void setNtis_reg_no(String ntis_reg_no){
        this.ntis_reg_no = ntis_reg_no;
    }

    @ElVoField(physicalName = "evid_attach_file_no")
    public String getEvid_attach_file_no(){
        return evid_attach_file_no;
    }

    @ElVoField(physicalName = "evid_attach_file_no")
    public void setEvid_attach_file_no(String evid_attach_file_no){
        this.evid_attach_file_no = evid_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public String getEtc_attach_file_no(){
        return etc_attach_file_no;
    }

    @ElVoField(physicalName = "etc_attach_file_no")
    public void setEtc_attach_file_no(String etc_attach_file_no){
        this.etc_attach_file_no = etc_attach_file_no;
    }

    @ElVoField(physicalName = "etc_pay_info")
    public String getEtc_pay_info(){
        return etc_pay_info;
    }

    @ElVoField(physicalName = "etc_pay_info")
    public void setEtc_pay_info(String etc_pay_info){
        this.etc_pay_info = etc_pay_info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSmlItmCheckupSlipVo [");
        sb.append("check_no").append("=").append(check_no).append(",");
        sb.append("entsch_check_dept_nm").append("=").append(entsch_check_dept_nm).append(",");
        sb.append("delvr_ymd").append("=").append(delvr_ymd).append(",");
        sb.append("entsch_check_nm").append("=").append(entsch_check_nm).append(",");
        sb.append("check_amt").append("=").append(check_amt).append(",");
        sb.append("entsch_check_ymd").append("=").append(entsch_check_ymd).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("card_use_ex").append("=").append(card_use_ex).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("depstr_nm").append("=").append(depstr_nm).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("empno").append("=").append(empno).append(",");
        sb.append("nm").append("=").append(nm).append(",");
        sb.append("attach_yn").append("=").append(attach_yn).append(",");
        sb.append("ntis_reg_no").append("=").append(ntis_reg_no).append(",");
        sb.append("evid_attach_file_no").append("=").append(evid_attach_file_no).append(",");
        sb.append("etc_attach_file_no").append("=").append(etc_attach_file_no).append(",");
        sb.append("etc_pay_info").append("=").append(etc_pay_info);
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
