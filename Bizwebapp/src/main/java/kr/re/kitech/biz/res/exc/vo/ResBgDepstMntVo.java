package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비입금관리 Vo")
public class ResBgDepstMntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBgDepstMntVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "입금예정차수", physicalName = "depst_odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_odr;

    @ElDtoField(logicalName = "연구비구분", physicalName = "reschamt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschamt_clsf;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "과제기간", physicalName = "prd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prd;

    @ElDtoField(logicalName = "과세여부", physicalName = "tax_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_cd;

    @ElDtoField(logicalName = "입금예정액", physicalName = "depst_schdl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_schdl_amt;

    @ElDtoField(logicalName = "입금예정일", physicalName = "depst_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_schdl_ymd;

    @ElDtoField(logicalName = "실입금금액", physicalName = "ofic_depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ofic_depst_amt;

    @ElDtoField(logicalName = "예산통제자", physicalName = "bugt_ctrl_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bugt_ctrl_nm;

    @ElDtoField(logicalName = "청구계산서번호", physicalName = "demnd_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_bill_no;

    @ElDtoField(logicalName = "영수계산서번호", physicalName = "recv_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_bill_no;

    @ElDtoField(logicalName = "청구의뢰번호", physicalName = "demnd_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_req_no;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "depst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_no;

    @ElDtoField(logicalName = "계정상태", physicalName = "accnt_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_state;

    @ElDtoField(logicalName = "거래처명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "신청일자", physicalName = "odr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String odr;

    @ElDtoField(logicalName = "입금결의번호", physicalName = "depst_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_unslip_no;

    @ElDtoField(logicalName = "청구결의번호", physicalName = "demnd_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_unslip_no;

    @ElDtoField(logicalName = "사업신청번호", physicalName = "bsns_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_req_no;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "depst_odr")
    public String getDepst_odr(){
        return depst_odr;
    }

    @ElVoField(physicalName = "depst_odr")
    public void setDepst_odr(String depst_odr){
        this.depst_odr = depst_odr;
    }

    @ElVoField(physicalName = "reschamt_clsf")
    public String getReschamt_clsf(){
        return reschamt_clsf;
    }

    @ElVoField(physicalName = "reschamt_clsf")
    public void setReschamt_clsf(String reschamt_clsf){
        this.reschamt_clsf = reschamt_clsf;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "prd")
    public String getPrd(){
        return prd;
    }

    @ElVoField(physicalName = "prd")
    public void setPrd(String prd){
        this.prd = prd;
    }

    @ElVoField(physicalName = "tax_cd")
    public String getTax_cd(){
        return tax_cd;
    }

    @ElVoField(physicalName = "tax_cd")
    public void setTax_cd(String tax_cd){
        this.tax_cd = tax_cd;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public long getDepst_schdl_amt(){
        return depst_schdl_amt;
    }

    @ElVoField(physicalName = "depst_schdl_amt")
    public void setDepst_schdl_amt(long depst_schdl_amt){
        this.depst_schdl_amt = depst_schdl_amt;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public String getDepst_schdl_ymd(){
        return depst_schdl_ymd;
    }

    @ElVoField(physicalName = "depst_schdl_ymd")
    public void setDepst_schdl_ymd(String depst_schdl_ymd){
        this.depst_schdl_ymd = depst_schdl_ymd;
    }

    @ElVoField(physicalName = "ofic_depst_amt")
    public long getOfic_depst_amt(){
        return ofic_depst_amt;
    }

    @ElVoField(physicalName = "ofic_depst_amt")
    public void setOfic_depst_amt(long ofic_depst_amt){
        this.ofic_depst_amt = ofic_depst_amt;
    }

    @ElVoField(physicalName = "bugt_ctrl_nm")
    public String getBugt_ctrl_nm(){
        return bugt_ctrl_nm;
    }

    @ElVoField(physicalName = "bugt_ctrl_nm")
    public void setBugt_ctrl_nm(String bugt_ctrl_nm){
        this.bugt_ctrl_nm = bugt_ctrl_nm;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public String getDemnd_bill_no(){
        return demnd_bill_no;
    }

    @ElVoField(physicalName = "demnd_bill_no")
    public void setDemnd_bill_no(String demnd_bill_no){
        this.demnd_bill_no = demnd_bill_no;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public String getRecv_bill_no(){
        return recv_bill_no;
    }

    @ElVoField(physicalName = "recv_bill_no")
    public void setRecv_bill_no(String recv_bill_no){
        this.recv_bill_no = recv_bill_no;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public String getDemnd_req_no(){
        return demnd_req_no;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public void setDemnd_req_no(String demnd_req_no){
        this.demnd_req_no = demnd_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public String getDepst_req_no(){
        return depst_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public void setDepst_req_no(String depst_req_no){
        this.depst_req_no = depst_req_no;
    }

    @ElVoField(physicalName = "accnt_state")
    public String getAccnt_state(){
        return accnt_state;
    }

    @ElVoField(physicalName = "accnt_state")
    public void setAccnt_state(String accnt_state){
        this.accnt_state = accnt_state;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "odr")
    public String getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(String odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "depst_unslip_no")
    public String getDepst_unslip_no(){
        return depst_unslip_no;
    }

    @ElVoField(physicalName = "depst_unslip_no")
    public void setDepst_unslip_no(String depst_unslip_no){
        this.depst_unslip_no = depst_unslip_no;
    }

    @ElVoField(physicalName = "demnd_unslip_no")
    public String getDemnd_unslip_no(){
        return demnd_unslip_no;
    }

    @ElVoField(physicalName = "demnd_unslip_no")
    public void setDemnd_unslip_no(String demnd_unslip_no){
        this.demnd_unslip_no = demnd_unslip_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public String getBsns_req_no(){
        return bsns_req_no;
    }

    @ElVoField(physicalName = "bsns_req_no")
    public void setBsns_req_no(String bsns_req_no){
        this.bsns_req_no = bsns_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBgDepstMntVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("depst_odr").append("=").append(depst_odr).append(",");
        sb.append("reschamt_clsf").append("=").append(reschamt_clsf).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("prd").append("=").append(prd).append(",");
        sb.append("tax_cd").append("=").append(tax_cd).append(",");
        sb.append("depst_schdl_amt").append("=").append(depst_schdl_amt).append(",");
        sb.append("depst_schdl_ymd").append("=").append(depst_schdl_ymd).append(",");
        sb.append("ofic_depst_amt").append("=").append(ofic_depst_amt).append(",");
        sb.append("bugt_ctrl_nm").append("=").append(bugt_ctrl_nm).append(",");
        sb.append("demnd_bill_no").append("=").append(demnd_bill_no).append(",");
        sb.append("recv_bill_no").append("=").append(recv_bill_no).append(",");
        sb.append("demnd_req_no").append("=").append(demnd_req_no).append(",");
        sb.append("depst_req_no").append("=").append(depst_req_no).append(",");
        sb.append("accnt_state").append("=").append(accnt_state).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("depst_unslip_no").append("=").append(depst_unslip_no).append(",");
        sb.append("demnd_unslip_no").append("=").append(demnd_unslip_no).append(",");
        sb.append("bsns_req_no").append("=").append(bsns_req_no);
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
