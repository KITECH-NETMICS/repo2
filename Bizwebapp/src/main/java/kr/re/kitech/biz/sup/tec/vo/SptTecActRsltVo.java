package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원실적정보 Vo")
public class SptTecActRsltVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecActRsltVo(){
    }

    @ElDtoField(logicalName = "고객번호", physicalName = "cust_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cust_no;

    @ElDtoField(logicalName = "상담접수번호", physicalName = "cunsl_rcpt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cunsl_rcpt_no;

    @ElDtoField(logicalName = "기술지원접수번호", physicalName = "tech_supt_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tech_supt_req_no;

    @ElDtoField(logicalName = "일련번호", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "작업일자", physicalName = "job_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_ymd;

    @ElDtoField(logicalName = "작업자", physicalName = "job_psn_syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String job_psn_syspayno;

    @ElDtoField(logicalName = "시험요청명", physicalName = "test_req_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test_req_nm;

    @ElDtoField(logicalName = "시험품목", physicalName = "test", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String test;

    @ElDtoField(logicalName = "단가", physicalName = "unit_price", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unit_price;

    @ElDtoField(logicalName = "수량", physicalName = "qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int qty;

    @ElDtoField(logicalName = "지원건수", physicalName = "treat_qty", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int treat_qty;

    @ElDtoField(logicalName = "시험료", physicalName = "req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt;

    @ElDtoField(logicalName = "확정금액", physicalName = "decsn_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_amt;

    @ElDtoField(logicalName = "확정세액", physicalName = "decsn_tax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_tax_amt;

    @ElDtoField(logicalName = "확정공급가", physicalName = "decsn_suply_value", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long decsn_suply_value;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "시험성적서발행구분", physicalName = "rst_book_issu", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_issu;

    @ElDtoField(logicalName = "품목/시료명(성적서발행용)", physicalName = "rst_book_treat_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rst_book_treat_nm;

    @ElDtoField(logicalName = "성적서건수", physicalName = "rst_req_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int rst_req_cnt;

    @ElDtoField(logicalName = "품명", physicalName = "gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm;

    @ElDtoField(logicalName = "소급료", physicalName = "retro_fee", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long retro_fee;

    @ElDtoField(logicalName = " 규격", physicalName = "std", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String std;

    @ElDtoField(logicalName = "기기번호", physicalName = "renwl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String renwl_no;

    @ElDtoField(logicalName = "제작업체", physicalName = "mfg_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mfg_vend;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElVoField(physicalName = "cust_no")
    public String getCust_no(){
        return cust_no;
    }

    @ElVoField(physicalName = "cust_no")
    public void setCust_no(String cust_no){
        this.cust_no = cust_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public String getCunsl_rcpt_no(){
        return cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "cunsl_rcpt_no")
    public void setCunsl_rcpt_no(String cunsl_rcpt_no){
        this.cunsl_rcpt_no = cunsl_rcpt_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public String getTech_supt_req_no(){
        return tech_supt_req_no;
    }

    @ElVoField(physicalName = "tech_supt_req_no")
    public void setTech_supt_req_no(String tech_supt_req_no){
        this.tech_supt_req_no = tech_supt_req_no;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "job_ymd")
    public String getJob_ymd(){
        return job_ymd;
    }

    @ElVoField(physicalName = "job_ymd")
    public void setJob_ymd(String job_ymd){
        this.job_ymd = job_ymd;
    }

    @ElVoField(physicalName = "job_psn_syspayno")
    public String getJob_psn_syspayno(){
        return job_psn_syspayno;
    }

    @ElVoField(physicalName = "job_psn_syspayno")
    public void setJob_psn_syspayno(String job_psn_syspayno){
        this.job_psn_syspayno = job_psn_syspayno;
    }

    @ElVoField(physicalName = "test_req_nm")
    public String getTest_req_nm(){
        return test_req_nm;
    }

    @ElVoField(physicalName = "test_req_nm")
    public void setTest_req_nm(String test_req_nm){
        this.test_req_nm = test_req_nm;
    }

    @ElVoField(physicalName = "test")
    public String getTest(){
        return test;
    }

    @ElVoField(physicalName = "test")
    public void setTest(String test){
        this.test = test;
    }

    @ElVoField(physicalName = "unit_price")
    public long getUnit_price(){
        return unit_price;
    }

    @ElVoField(physicalName = "unit_price")
    public void setUnit_price(long unit_price){
        this.unit_price = unit_price;
    }

    @ElVoField(physicalName = "qty")
    public int getQty(){
        return qty;
    }

    @ElVoField(physicalName = "qty")
    public void setQty(int qty){
        this.qty = qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public int getTreat_qty(){
        return treat_qty;
    }

    @ElVoField(physicalName = "treat_qty")
    public void setTreat_qty(int treat_qty){
        this.treat_qty = treat_qty;
    }

    @ElVoField(physicalName = "req_amt")
    public long getReq_amt(){
        return req_amt;
    }

    @ElVoField(physicalName = "req_amt")
    public void setReq_amt(long req_amt){
        this.req_amt = req_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public long getDecsn_amt(){
        return decsn_amt;
    }

    @ElVoField(physicalName = "decsn_amt")
    public void setDecsn_amt(long decsn_amt){
        this.decsn_amt = decsn_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public long getDecsn_tax_amt(){
        return decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_tax_amt")
    public void setDecsn_tax_amt(long decsn_tax_amt){
        this.decsn_tax_amt = decsn_tax_amt;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public long getDecsn_suply_value(){
        return decsn_suply_value;
    }

    @ElVoField(physicalName = "decsn_suply_value")
    public void setDecsn_suply_value(long decsn_suply_value){
        this.decsn_suply_value = decsn_suply_value;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public String getRst_book_issu(){
        return rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_issu")
    public void setRst_book_issu(String rst_book_issu){
        this.rst_book_issu = rst_book_issu;
    }

    @ElVoField(physicalName = "rst_book_treat_nm")
    public String getRst_book_treat_nm(){
        return rst_book_treat_nm;
    }

    @ElVoField(physicalName = "rst_book_treat_nm")
    public void setRst_book_treat_nm(String rst_book_treat_nm){
        this.rst_book_treat_nm = rst_book_treat_nm;
    }

    @ElVoField(physicalName = "rst_req_cnt")
    public int getRst_req_cnt(){
        return rst_req_cnt;
    }

    @ElVoField(physicalName = "rst_req_cnt")
    public void setRst_req_cnt(int rst_req_cnt){
        this.rst_req_cnt = rst_req_cnt;
    }

    @ElVoField(physicalName = "gdnm")
    public String getGdnm(){
        return gdnm;
    }

    @ElVoField(physicalName = "gdnm")
    public void setGdnm(String gdnm){
        this.gdnm = gdnm;
    }

    @ElVoField(physicalName = "retro_fee")
    public long getRetro_fee(){
        return retro_fee;
    }

    @ElVoField(physicalName = "retro_fee")
    public void setRetro_fee(long retro_fee){
        this.retro_fee = retro_fee;
    }

    @ElVoField(physicalName = "std")
    public String getStd(){
        return std;
    }

    @ElVoField(physicalName = "std")
    public void setStd(String std){
        this.std = std;
    }

    @ElVoField(physicalName = "renwl_no")
    public String getRenwl_no(){
        return renwl_no;
    }

    @ElVoField(physicalName = "renwl_no")
    public void setRenwl_no(String renwl_no){
        this.renwl_no = renwl_no;
    }

    @ElVoField(physicalName = "mfg_vend")
    public String getMfg_vend(){
        return mfg_vend;
    }

    @ElVoField(physicalName = "mfg_vend")
    public void setMfg_vend(String mfg_vend){
        this.mfg_vend = mfg_vend;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecActRsltVo [");
        sb.append("cust_no").append("=").append(cust_no).append(",");
        sb.append("cunsl_rcpt_no").append("=").append(cunsl_rcpt_no).append(",");
        sb.append("tech_supt_req_no").append("=").append(tech_supt_req_no).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("job_ymd").append("=").append(job_ymd).append(",");
        sb.append("job_psn_syspayno").append("=").append(job_psn_syspayno).append(",");
        sb.append("test_req_nm").append("=").append(test_req_nm).append(",");
        sb.append("test").append("=").append(test).append(",");
        sb.append("unit_price").append("=").append(unit_price).append(",");
        sb.append("qty").append("=").append(qty).append(",");
        sb.append("treat_qty").append("=").append(treat_qty).append(",");
        sb.append("req_amt").append("=").append(req_amt).append(",");
        sb.append("decsn_amt").append("=").append(decsn_amt).append(",");
        sb.append("decsn_tax_amt").append("=").append(decsn_tax_amt).append(",");
        sb.append("decsn_suply_value").append("=").append(decsn_suply_value).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("rst_book_issu").append("=").append(rst_book_issu).append(",");
        sb.append("rst_book_treat_nm").append("=").append(rst_book_treat_nm).append(",");
        sb.append("rst_req_cnt").append("=").append(rst_req_cnt).append(",");
        sb.append("gdnm").append("=").append(gdnm).append(",");
        sb.append("retro_fee").append("=").append(retro_fee).append(",");
        sb.append("std").append("=").append(std).append(",");
        sb.append("renwl_no").append("=").append(renwl_no).append(",");
        sb.append("mfg_vend").append("=").append(mfg_vend).append(",");
        sb.append("cud_type").append("=").append(cud_type);
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
