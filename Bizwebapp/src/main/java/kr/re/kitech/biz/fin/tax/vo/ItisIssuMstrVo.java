package kr.re.kitech.biz.fin.tax.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "매출 전자세금계산서 원장 Vo")
public class ItisIssuMstrVo extends kr.re.kitech.biz.fin.tax.vo.FtxBillComVo {
    private static final long serialVersionUID = 1L;

    public ItisIssuMstrVo(){
    }

    @ElDtoField(logicalName = "계산서번호", physicalName = "issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_seqno;

    @ElDtoField(logicalName = "작성일자", physicalName = "regs_date", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String regs_date;

    @ElDtoField(logicalName = "세금계산서종류(계산서:03)", physicalName = "tax_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_type;

    @ElDtoField(logicalName = "영수/청구구문(영수:01)", physicalName = "pops_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pops_code;

    @ElDtoField(logicalName = "수정전 국세청전송일련번호", physicalName = "bfo_issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfo_issu_id;

    @ElDtoField(logicalName = "수정전 계산서번호", physicalName = "bfo_issu_seqno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bfo_issu_seqno;

    @ElDtoField(logicalName = "비고1", physicalName = "note1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note1;

    @ElDtoField(logicalName = "비고2", physicalName = "note2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note2;

    @ElDtoField(logicalName = "비고3", physicalName = "note3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String note3;

    @ElDtoField(logicalName = "공급자사업자번호", physicalName = "selr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_no;

    @ElDtoField(logicalName = "공급자상호", physicalName = "selr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_corp_nm;

    @ElDtoField(logicalName = "공급자대표자명", physicalName = "selr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_ceo;

    @ElDtoField(logicalName = "공급자주소", physicalName = "selr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_addr;

    @ElDtoField(logicalName = "공급자업태", physicalName = "selr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_cons;

    @ElDtoField(logicalName = "공급자종목", physicalName = "selr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_buss_type;

    @ElDtoField(logicalName = "공급자담당부서명", physicalName = "selr_chrg_post", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_post;

    @ElDtoField(logicalName = "공급자담당자명", physicalName = "selr_chrg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_nm;

    @ElDtoField(logicalName = "공급자담당자전화번호", physicalName = "selr_chrg_tel", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_tel;

    @ElDtoField(logicalName = "공급자담당자이메일", physicalName = "selr_chrg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_email;

    @ElDtoField(logicalName = "공급자담당자휴대폰", physicalName = "selr_chrg_mobl", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_mobl;

    @ElDtoField(logicalName = "공급자담당자fax", physicalName = "selr_chrg_fax", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String selr_chrg_fax;

    @ElDtoField(logicalName = "공급받는자구분코드(사업자,개인,외국인)", physicalName = "buyr_gb", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_gb;

    @ElDtoField(logicalName = "공급받는자사업자번호", physicalName = "buyr_corp_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_no;

    @ElDtoField(logicalName = "공급받는자거래처코드", physicalName = "buyr_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_code;

    @ElDtoField(logicalName = "공급받는자상호", physicalName = "buyr_corp_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_corp_nm;

    @ElDtoField(logicalName = "공급받는자대표자명", physicalName = "buyr_ceo", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_ceo;

    @ElDtoField(logicalName = "공급받는자주소", physicalName = "buyr_addr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_addr;

    @ElDtoField(logicalName = "공급받는자업태", physicalName = "buyr_buss_cons", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_cons;

    @ElDtoField(logicalName = "공급받는자종목", physicalName = "buyr_buss_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String buyr_buss_type;

    @ElDtoField(logicalName = "공급가액합계", physicalName = "chrg_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long chrg_amt;

    @ElDtoField(logicalName = "세액", physicalName = "tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long tax_amt;

    @ElDtoField(logicalName = "총금액", physicalName = "totl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long totl_amt;

    @ElDtoField(logicalName = "요청상태코드", physicalName = "req_stat_code", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_stat_code;

    @ElDtoField(logicalName = "역발행구분(정발:1)", physicalName = "recp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recp_cd;

    @ElDtoField(logicalName = "매출/매입구분(매출:1)", physicalName = "bill_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bill_type;

    @ElDtoField(logicalName = "Email발행요청유무", physicalName = "snd_mal_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_mal_yn;

    @ElDtoField(logicalName = "SMS발행요청유무", physicalName = "snd_sms_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_sms_yn;

    @ElDtoField(logicalName = "FAX발행요청유무", physicalName = "snd_fax_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String snd_fax_yn;

    @ElDtoField(logicalName = "결재방법코드1", physicalName = "pymt_type1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type1;

    @ElDtoField(logicalName = "재방법코드 금액1", physicalName = "pamt_amt1", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt1;

    @ElDtoField(logicalName = "결재방법코드2", physicalName = "pymt_type2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type2;

    @ElDtoField(logicalName = "재방법코드 금액2", physicalName = "pamt_amt2", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt2;

    @ElDtoField(logicalName = "결재방법코드3", physicalName = "pymt_type3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type3;

    @ElDtoField(logicalName = "재방법코드 금액3", physicalName = "pamt_amt3", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt3;

    @ElDtoField(logicalName = "결재방법코드4", physicalName = "pymt_type4", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pymt_type4;

    @ElDtoField(logicalName = "재방법코드 금액4", physicalName = "pamt_amt4", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long pamt_amt4;

    @ElVoField(physicalName = "issu_seqno")
    public String getIssu_seqno(){
        return issu_seqno;
    }

    @ElVoField(physicalName = "issu_seqno")
    public void setIssu_seqno(String issu_seqno){
        this.issu_seqno = issu_seqno;
    }

    @ElVoField(physicalName = "regs_date")
    public String getRegs_date(){
        return regs_date;
    }

    @ElVoField(physicalName = "regs_date")
    public void setRegs_date(String regs_date){
        this.regs_date = regs_date;
    }

    @ElVoField(physicalName = "tax_type")
    public String getTax_type(){
        return tax_type;
    }

    @ElVoField(physicalName = "tax_type")
    public void setTax_type(String tax_type){
        this.tax_type = tax_type;
    }

    @ElVoField(physicalName = "pops_code")
    public String getPops_code(){
        return pops_code;
    }

    @ElVoField(physicalName = "pops_code")
    public void setPops_code(String pops_code){
        this.pops_code = pops_code;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public String getBfo_issu_id(){
        return bfo_issu_id;
    }

    @ElVoField(physicalName = "bfo_issu_id")
    public void setBfo_issu_id(String bfo_issu_id){
        this.bfo_issu_id = bfo_issu_id;
    }

    @ElVoField(physicalName = "bfo_issu_seqno")
    public String getBfo_issu_seqno(){
        return bfo_issu_seqno;
    }

    @ElVoField(physicalName = "bfo_issu_seqno")
    public void setBfo_issu_seqno(String bfo_issu_seqno){
        this.bfo_issu_seqno = bfo_issu_seqno;
    }

    @ElVoField(physicalName = "note1")
    public String getNote1(){
        return note1;
    }

    @ElVoField(physicalName = "note1")
    public void setNote1(String note1){
        this.note1 = note1;
    }

    @ElVoField(physicalName = "note2")
    public String getNote2(){
        return note2;
    }

    @ElVoField(physicalName = "note2")
    public void setNote2(String note2){
        this.note2 = note2;
    }

    @ElVoField(physicalName = "note3")
    public String getNote3(){
        return note3;
    }

    @ElVoField(physicalName = "note3")
    public void setNote3(String note3){
        this.note3 = note3;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public String getSelr_corp_no(){
        return selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_no")
    public void setSelr_corp_no(String selr_corp_no){
        this.selr_corp_no = selr_corp_no;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public String getSelr_corp_nm(){
        return selr_corp_nm;
    }

    @ElVoField(physicalName = "selr_corp_nm")
    public void setSelr_corp_nm(String selr_corp_nm){
        this.selr_corp_nm = selr_corp_nm;
    }

    @ElVoField(physicalName = "selr_ceo")
    public String getSelr_ceo(){
        return selr_ceo;
    }

    @ElVoField(physicalName = "selr_ceo")
    public void setSelr_ceo(String selr_ceo){
        this.selr_ceo = selr_ceo;
    }

    @ElVoField(physicalName = "selr_addr")
    public String getSelr_addr(){
        return selr_addr;
    }

    @ElVoField(physicalName = "selr_addr")
    public void setSelr_addr(String selr_addr){
        this.selr_addr = selr_addr;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public String getSelr_buss_cons(){
        return selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_cons")
    public void setSelr_buss_cons(String selr_buss_cons){
        this.selr_buss_cons = selr_buss_cons;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public String getSelr_buss_type(){
        return selr_buss_type;
    }

    @ElVoField(physicalName = "selr_buss_type")
    public void setSelr_buss_type(String selr_buss_type){
        this.selr_buss_type = selr_buss_type;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public String getSelr_chrg_post(){
        return selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_post")
    public void setSelr_chrg_post(String selr_chrg_post){
        this.selr_chrg_post = selr_chrg_post;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public String getSelr_chrg_nm(){
        return selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_nm")
    public void setSelr_chrg_nm(String selr_chrg_nm){
        this.selr_chrg_nm = selr_chrg_nm;
    }

    @ElVoField(physicalName = "selr_chrg_tel")
    public String getSelr_chrg_tel(){
        return selr_chrg_tel;
    }

    @ElVoField(physicalName = "selr_chrg_tel")
    public void setSelr_chrg_tel(String selr_chrg_tel){
        this.selr_chrg_tel = selr_chrg_tel;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public String getSelr_chrg_email(){
        return selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_chrg_email")
    public void setSelr_chrg_email(String selr_chrg_email){
        this.selr_chrg_email = selr_chrg_email;
    }

    @ElVoField(physicalName = "selr_chrg_mobl")
    public String getSelr_chrg_mobl(){
        return selr_chrg_mobl;
    }

    @ElVoField(physicalName = "selr_chrg_mobl")
    public void setSelr_chrg_mobl(String selr_chrg_mobl){
        this.selr_chrg_mobl = selr_chrg_mobl;
    }

    @ElVoField(physicalName = "selr_chrg_fax")
    public String getSelr_chrg_fax(){
        return selr_chrg_fax;
    }

    @ElVoField(physicalName = "selr_chrg_fax")
    public void setSelr_chrg_fax(String selr_chrg_fax){
        this.selr_chrg_fax = selr_chrg_fax;
    }

    @ElVoField(physicalName = "buyr_gb")
    public String getBuyr_gb(){
        return buyr_gb;
    }

    @ElVoField(physicalName = "buyr_gb")
    public void setBuyr_gb(String buyr_gb){
        this.buyr_gb = buyr_gb;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public String getBuyr_corp_no(){
        return buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_corp_no")
    public void setBuyr_corp_no(String buyr_corp_no){
        this.buyr_corp_no = buyr_corp_no;
    }

    @ElVoField(physicalName = "buyr_code")
    public String getBuyr_code(){
        return buyr_code;
    }

    @ElVoField(physicalName = "buyr_code")
    public void setBuyr_code(String buyr_code){
        this.buyr_code = buyr_code;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public String getBuyr_corp_nm(){
        return buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_corp_nm")
    public void setBuyr_corp_nm(String buyr_corp_nm){
        this.buyr_corp_nm = buyr_corp_nm;
    }

    @ElVoField(physicalName = "buyr_ceo")
    public String getBuyr_ceo(){
        return buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_ceo")
    public void setBuyr_ceo(String buyr_ceo){
        this.buyr_ceo = buyr_ceo;
    }

    @ElVoField(physicalName = "buyr_addr")
    public String getBuyr_addr(){
        return buyr_addr;
    }

    @ElVoField(physicalName = "buyr_addr")
    public void setBuyr_addr(String buyr_addr){
        this.buyr_addr = buyr_addr;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public String getBuyr_buss_cons(){
        return buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_cons")
    public void setBuyr_buss_cons(String buyr_buss_cons){
        this.buyr_buss_cons = buyr_buss_cons;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public String getBuyr_buss_type(){
        return buyr_buss_type;
    }

    @ElVoField(physicalName = "buyr_buss_type")
    public void setBuyr_buss_type(String buyr_buss_type){
        this.buyr_buss_type = buyr_buss_type;
    }

    @ElVoField(physicalName = "chrg_amt")
    public long getChrg_amt(){
        return chrg_amt;
    }

    @ElVoField(physicalName = "chrg_amt")
    public void setChrg_amt(long chrg_amt){
        this.chrg_amt = chrg_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public long getTax_amt(){
        return tax_amt;
    }

    @ElVoField(physicalName = "tax_amt")
    public void setTax_amt(long tax_amt){
        this.tax_amt = tax_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public long getTotl_amt(){
        return totl_amt;
    }

    @ElVoField(physicalName = "totl_amt")
    public void setTotl_amt(long totl_amt){
        this.totl_amt = totl_amt;
    }

    @ElVoField(physicalName = "req_stat_code")
    public String getReq_stat_code(){
        return req_stat_code;
    }

    @ElVoField(physicalName = "req_stat_code")
    public void setReq_stat_code(String req_stat_code){
        this.req_stat_code = req_stat_code;
    }

    @ElVoField(physicalName = "recp_cd")
    public String getRecp_cd(){
        return recp_cd;
    }

    @ElVoField(physicalName = "recp_cd")
    public void setRecp_cd(String recp_cd){
        this.recp_cd = recp_cd;
    }

    @ElVoField(physicalName = "bill_type")
    public String getBill_type(){
        return bill_type;
    }

    @ElVoField(physicalName = "bill_type")
    public void setBill_type(String bill_type){
        this.bill_type = bill_type;
    }

    @ElVoField(physicalName = "snd_mal_yn")
    public String getSnd_mal_yn(){
        return snd_mal_yn;
    }

    @ElVoField(physicalName = "snd_mal_yn")
    public void setSnd_mal_yn(String snd_mal_yn){
        this.snd_mal_yn = snd_mal_yn;
    }

    @ElVoField(physicalName = "snd_sms_yn")
    public String getSnd_sms_yn(){
        return snd_sms_yn;
    }

    @ElVoField(physicalName = "snd_sms_yn")
    public void setSnd_sms_yn(String snd_sms_yn){
        this.snd_sms_yn = snd_sms_yn;
    }

    @ElVoField(physicalName = "snd_fax_yn")
    public String getSnd_fax_yn(){
        return snd_fax_yn;
    }

    @ElVoField(physicalName = "snd_fax_yn")
    public void setSnd_fax_yn(String snd_fax_yn){
        this.snd_fax_yn = snd_fax_yn;
    }

    @ElVoField(physicalName = "pymt_type1")
    public String getPymt_type1(){
        return pymt_type1;
    }

    @ElVoField(physicalName = "pymt_type1")
    public void setPymt_type1(String pymt_type1){
        this.pymt_type1 = pymt_type1;
    }

    @ElVoField(physicalName = "pamt_amt1")
    public long getPamt_amt1(){
        return pamt_amt1;
    }

    @ElVoField(physicalName = "pamt_amt1")
    public void setPamt_amt1(long pamt_amt1){
        this.pamt_amt1 = pamt_amt1;
    }

    @ElVoField(physicalName = "pymt_type2")
    public String getPymt_type2(){
        return pymt_type2;
    }

    @ElVoField(physicalName = "pymt_type2")
    public void setPymt_type2(String pymt_type2){
        this.pymt_type2 = pymt_type2;
    }

    @ElVoField(physicalName = "pamt_amt2")
    public long getPamt_amt2(){
        return pamt_amt2;
    }

    @ElVoField(physicalName = "pamt_amt2")
    public void setPamt_amt2(long pamt_amt2){
        this.pamt_amt2 = pamt_amt2;
    }

    @ElVoField(physicalName = "pymt_type3")
    public String getPymt_type3(){
        return pymt_type3;
    }

    @ElVoField(physicalName = "pymt_type3")
    public void setPymt_type3(String pymt_type3){
        this.pymt_type3 = pymt_type3;
    }

    @ElVoField(physicalName = "pamt_amt3")
    public long getPamt_amt3(){
        return pamt_amt3;
    }

    @ElVoField(physicalName = "pamt_amt3")
    public void setPamt_amt3(long pamt_amt3){
        this.pamt_amt3 = pamt_amt3;
    }

    @ElVoField(physicalName = "pymt_type4")
    public String getPymt_type4(){
        return pymt_type4;
    }

    @ElVoField(physicalName = "pymt_type4")
    public void setPymt_type4(String pymt_type4){
        this.pymt_type4 = pymt_type4;
    }

    @ElVoField(physicalName = "pamt_amt4")
    public long getPamt_amt4(){
        return pamt_amt4;
    }

    @ElVoField(physicalName = "pamt_amt4")
    public void setPamt_amt4(long pamt_amt4){
        this.pamt_amt4 = pamt_amt4;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ItisIssuMstrVo [");
        sb.append("issu_seqno").append("=").append(issu_seqno).append(",");
        sb.append("regs_date").append("=").append(regs_date).append(",");
        sb.append("tax_type").append("=").append(tax_type).append(",");
        sb.append("pops_code").append("=").append(pops_code).append(",");
        sb.append("bfo_issu_id").append("=").append(bfo_issu_id).append(",");
        sb.append("bfo_issu_seqno").append("=").append(bfo_issu_seqno).append(",");
        sb.append("note1").append("=").append(note1).append(",");
        sb.append("note2").append("=").append(note2).append(",");
        sb.append("note3").append("=").append(note3).append(",");
        sb.append("selr_corp_no").append("=").append(selr_corp_no).append(",");
        sb.append("selr_corp_nm").append("=").append(selr_corp_nm).append(",");
        sb.append("selr_ceo").append("=").append(selr_ceo).append(",");
        sb.append("selr_addr").append("=").append(selr_addr).append(",");
        sb.append("selr_buss_cons").append("=").append(selr_buss_cons).append(",");
        sb.append("selr_buss_type").append("=").append(selr_buss_type).append(",");
        sb.append("selr_chrg_post").append("=").append(selr_chrg_post).append(",");
        sb.append("selr_chrg_nm").append("=").append(selr_chrg_nm).append(",");
        sb.append("selr_chrg_tel").append("=").append(selr_chrg_tel).append(",");
        sb.append("selr_chrg_email").append("=").append(selr_chrg_email).append(",");
        sb.append("selr_chrg_mobl").append("=").append(selr_chrg_mobl).append(",");
        sb.append("selr_chrg_fax").append("=").append(selr_chrg_fax).append(",");
        sb.append("buyr_gb").append("=").append(buyr_gb).append(",");
        sb.append("buyr_corp_no").append("=").append(buyr_corp_no).append(",");
        sb.append("buyr_code").append("=").append(buyr_code).append(",");
        sb.append("buyr_corp_nm").append("=").append(buyr_corp_nm).append(",");
        sb.append("buyr_ceo").append("=").append(buyr_ceo).append(",");
        sb.append("buyr_addr").append("=").append(buyr_addr).append(",");
        sb.append("buyr_buss_cons").append("=").append(buyr_buss_cons).append(",");
        sb.append("buyr_buss_type").append("=").append(buyr_buss_type).append(",");
        sb.append("chrg_amt").append("=").append(chrg_amt).append(",");
        sb.append("tax_amt").append("=").append(tax_amt).append(",");
        sb.append("totl_amt").append("=").append(totl_amt).append(",");
        sb.append("req_stat_code").append("=").append(req_stat_code).append(",");
        sb.append("recp_cd").append("=").append(recp_cd).append(",");
        sb.append("bill_type").append("=").append(bill_type).append(",");
        sb.append("snd_mal_yn").append("=").append(snd_mal_yn).append(",");
        sb.append("snd_sms_yn").append("=").append(snd_sms_yn).append(",");
        sb.append("snd_fax_yn").append("=").append(snd_fax_yn).append(",");
        sb.append("pymt_type1").append("=").append(pymt_type1).append(",");
        sb.append("pamt_amt1").append("=").append(pamt_amt1).append(",");
        sb.append("pymt_type2").append("=").append(pymt_type2).append(",");
        sb.append("pamt_amt2").append("=").append(pamt_amt2).append(",");
        sb.append("pymt_type3").append("=").append(pymt_type3).append(",");
        sb.append("pamt_amt3").append("=").append(pamt_amt3).append(",");
        sb.append("pymt_type4").append("=").append(pymt_type4).append(",");
        sb.append("pamt_amt4").append("=").append(pamt_amt4);
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
