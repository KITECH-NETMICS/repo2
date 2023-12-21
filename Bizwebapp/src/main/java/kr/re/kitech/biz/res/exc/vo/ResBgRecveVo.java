package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비입금예정 Vo")
public class ResBgRecveVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBgRecveVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "입금순번", physicalName = "depst_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_odr;

    @ElDtoField(logicalName = "연구비구분", physicalName = "reschamt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschamt_clsf;

    @ElDtoField(logicalName = "연구비구분명", physicalName = "reschamt_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschamt_clsf_nm;

    @ElDtoField(logicalName = "입금예정금액", physicalName = "depst_schdl_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_schdl_amt;

    @ElDtoField(logicalName = "입금예정일자", physicalName = "depst_schdl_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_schdl_ymd;

    @ElDtoField(logicalName = "실입금금액", physicalName = "ofic_depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ofic_depst_amt;

    @ElDtoField(logicalName = "실입금일자", physicalName = "ofic_depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_depst_ymd;

    @ElDtoField(logicalName = "입금처", physicalName = "depst_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_loc;

    @ElDtoField(logicalName = "입금처명", physicalName = "depst_loc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_loc_nm;

    @ElDtoField(logicalName = "미수총액", physicalName = "uncollected_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String uncollected_amt;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "결재신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "신청일자(결재)", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자(결재)", physicalName = "req_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_nm;

    @ElDtoField(logicalName = "신청부서(결재)", physicalName = "req_dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_nm;

    @ElDtoField(logicalName = "입금액(결재)", physicalName = "ofic_depst_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ofic_depst_amt_sum;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf_nm;

    @ElDtoField(logicalName = "특이사항", physicalName = "unusual_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unusual_item;

    @ElDtoField(logicalName = "마지막입금순번", physicalName = "max_depst_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int max_depst_odr;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "depst_odr")
    public int getDepst_odr(){
        return depst_odr;
    }

    @ElVoField(physicalName = "depst_odr")
    public void setDepst_odr(int depst_odr){
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

    @ElVoField(physicalName = "reschamt_clsf_nm")
    public String getReschamt_clsf_nm(){
        return reschamt_clsf_nm;
    }

    @ElVoField(physicalName = "reschamt_clsf_nm")
    public void setReschamt_clsf_nm(String reschamt_clsf_nm){
        this.reschamt_clsf_nm = reschamt_clsf_nm;
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

    @ElVoField(physicalName = "ofic_depst_ymd")
    public String getOfic_depst_ymd(){
        return ofic_depst_ymd;
    }

    @ElVoField(physicalName = "ofic_depst_ymd")
    public void setOfic_depst_ymd(String ofic_depst_ymd){
        this.ofic_depst_ymd = ofic_depst_ymd;
    }

    @ElVoField(physicalName = "depst_loc")
    public String getDepst_loc(){
        return depst_loc;
    }

    @ElVoField(physicalName = "depst_loc")
    public void setDepst_loc(String depst_loc){
        this.depst_loc = depst_loc;
    }

    @ElVoField(physicalName = "depst_loc_nm")
    public String getDepst_loc_nm(){
        return depst_loc_nm;
    }

    @ElVoField(physicalName = "depst_loc_nm")
    public void setDepst_loc_nm(String depst_loc_nm){
        this.depst_loc_nm = depst_loc_nm;
    }

    @ElVoField(physicalName = "uncollected_amt")
    public String getUncollected_amt(){
        return uncollected_amt;
    }

    @ElVoField(physicalName = "uncollected_amt")
    public void setUncollected_amt(String uncollected_amt){
        this.uncollected_amt = uncollected_amt;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public String getReq_psn_nm(){
        return req_psn_nm;
    }

    @ElVoField(physicalName = "req_psn_nm")
    public void setReq_psn_nm(String req_psn_nm){
        this.req_psn_nm = req_psn_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public String getReq_dept_nm(){
        return req_dept_nm;
    }

    @ElVoField(physicalName = "req_dept_nm")
    public void setReq_dept_nm(String req_dept_nm){
        this.req_dept_nm = req_dept_nm;
    }

    @ElVoField(physicalName = "ofic_depst_amt_sum")
    public long getOfic_depst_amt_sum(){
        return ofic_depst_amt_sum;
    }

    @ElVoField(physicalName = "ofic_depst_amt_sum")
    public void setOfic_depst_amt_sum(long ofic_depst_amt_sum){
        this.ofic_depst_amt_sum = ofic_depst_amt_sum;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public String getDepst_clsf_nm(){
        return depst_clsf_nm;
    }

    @ElVoField(physicalName = "depst_clsf_nm")
    public void setDepst_clsf_nm(String depst_clsf_nm){
        this.depst_clsf_nm = depst_clsf_nm;
    }

    @ElVoField(physicalName = "unusual_item")
    public String getUnusual_item(){
        return unusual_item;
    }

    @ElVoField(physicalName = "unusual_item")
    public void setUnusual_item(String unusual_item){
        this.unusual_item = unusual_item;
    }

    @ElVoField(physicalName = "max_depst_odr")
    public int getMax_depst_odr(){
        return max_depst_odr;
    }

    @ElVoField(physicalName = "max_depst_odr")
    public void setMax_depst_odr(int max_depst_odr){
        this.max_depst_odr = max_depst_odr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResBgRecveVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("depst_odr").append("=").append(depst_odr).append(",");
        sb.append("reschamt_clsf").append("=").append(reschamt_clsf).append(",");
        sb.append("reschamt_clsf_nm").append("=").append(reschamt_clsf_nm).append(",");
        sb.append("depst_schdl_amt").append("=").append(depst_schdl_amt).append(",");
        sb.append("depst_schdl_ymd").append("=").append(depst_schdl_ymd).append(",");
        sb.append("ofic_depst_amt").append("=").append(ofic_depst_amt).append(",");
        sb.append("ofic_depst_ymd").append("=").append(ofic_depst_ymd).append(",");
        sb.append("depst_loc").append("=").append(depst_loc).append(",");
        sb.append("depst_loc_nm").append("=").append(depst_loc_nm).append(",");
        sb.append("uncollected_amt").append("=").append(uncollected_amt).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn_nm").append("=").append(req_psn_nm).append(",");
        sb.append("req_dept_nm").append("=").append(req_dept_nm).append(",");
        sb.append("ofic_depst_amt_sum").append("=").append(ofic_depst_amt_sum).append(",");
        sb.append("depst_clsf_nm").append("=").append(depst_clsf_nm).append(",");
        sb.append("unusual_item").append("=").append(unusual_item).append(",");
        sb.append("max_depst_odr").append("=").append(max_depst_odr);
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
