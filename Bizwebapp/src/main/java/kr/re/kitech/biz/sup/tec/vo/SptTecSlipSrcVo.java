package kr.re.kitech.biz.sup.tec.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "기술지원 결의생성 조회 Vo")
public class SptTecSlipSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public SptTecSlipSrcVo(){
    }

    @ElDtoField(logicalName = "조회시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "조회종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "기술지원팀", physicalName = "supt_team", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_team;

    @ElDtoField(logicalName = "고객명", physicalName = "vend_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_abbr;

    @ElDtoField(logicalName = "지원사업구분", physicalName = "supt_work_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String supt_work_clsf;

    @ElDtoField(logicalName = "접수번호", physicalName = "kolas_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String kolas_no;

    @ElDtoField(logicalName = "결의여부", physicalName = "slip_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_yn;

    @ElDtoField(logicalName = "조회구분", physicalName = "src_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String src_kind;

    @ElDtoField(logicalName = "청구영수구분", physicalName = "demnd_recv_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_recv_clsf;

    @ElDtoField(logicalName = "처리상태", physicalName = "prcs_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prcs_state;

    @ElDtoField(logicalName = "조회값", physicalName = "inqr_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inqr_val;

    @ElDtoField(logicalName = "청구결의번호", physicalName = "chrg_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chrg_unslip_no;

    @ElDtoField(logicalName = "청구결의순번", physicalName = "chrg_unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int chrg_unslip_odr;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "계산서번호", physicalName = "tax_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tax_bill_no;

    @ElVoField(physicalName = "from_ymd")
    public String getFrom_ymd(){
        return from_ymd;
    }

    @ElVoField(physicalName = "from_ymd")
    public void setFrom_ymd(String from_ymd){
        this.from_ymd = from_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public String getTo_ymd(){
        return to_ymd;
    }

    @ElVoField(physicalName = "to_ymd")
    public void setTo_ymd(String to_ymd){
        this.to_ymd = to_ymd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "supt_team")
    public String getSupt_team(){
        return supt_team;
    }

    @ElVoField(physicalName = "supt_team")
    public void setSupt_team(String supt_team){
        this.supt_team = supt_team;
    }

    @ElVoField(physicalName = "vend_abbr")
    public String getVend_abbr(){
        return vend_abbr;
    }

    @ElVoField(physicalName = "vend_abbr")
    public void setVend_abbr(String vend_abbr){
        this.vend_abbr = vend_abbr;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public String getSupt_work_clsf(){
        return supt_work_clsf;
    }

    @ElVoField(physicalName = "supt_work_clsf")
    public void setSupt_work_clsf(String supt_work_clsf){
        this.supt_work_clsf = supt_work_clsf;
    }

    @ElVoField(physicalName = "kolas_no")
    public String getKolas_no(){
        return kolas_no;
    }

    @ElVoField(physicalName = "kolas_no")
    public void setKolas_no(String kolas_no){
        this.kolas_no = kolas_no;
    }

    @ElVoField(physicalName = "slip_yn")
    public String getSlip_yn(){
        return slip_yn;
    }

    @ElVoField(physicalName = "slip_yn")
    public void setSlip_yn(String slip_yn){
        this.slip_yn = slip_yn;
    }

    @ElVoField(physicalName = "src_kind")
    public String getSrc_kind(){
        return src_kind;
    }

    @ElVoField(physicalName = "src_kind")
    public void setSrc_kind(String src_kind){
        this.src_kind = src_kind;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public String getDemnd_recv_clsf(){
        return demnd_recv_clsf;
    }

    @ElVoField(physicalName = "demnd_recv_clsf")
    public void setDemnd_recv_clsf(String demnd_recv_clsf){
        this.demnd_recv_clsf = demnd_recv_clsf;
    }

    @ElVoField(physicalName = "prcs_state")
    public String getPrcs_state(){
        return prcs_state;
    }

    @ElVoField(physicalName = "prcs_state")
    public void setPrcs_state(String prcs_state){
        this.prcs_state = prcs_state;
    }

    @ElVoField(physicalName = "inqr_val")
    public String getInqr_val(){
        return inqr_val;
    }

    @ElVoField(physicalName = "inqr_val")
    public void setInqr_val(String inqr_val){
        this.inqr_val = inqr_val;
    }

    @ElVoField(physicalName = "chrg_unslip_no")
    public String getChrg_unslip_no(){
        return chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_no")
    public void setChrg_unslip_no(String chrg_unslip_no){
        this.chrg_unslip_no = chrg_unslip_no;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public int getChrg_unslip_odr(){
        return chrg_unslip_odr;
    }

    @ElVoField(physicalName = "chrg_unslip_odr")
    public void setChrg_unslip_odr(int chrg_unslip_odr){
        this.chrg_unslip_odr = chrg_unslip_odr;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public String getTax_bill_no(){
        return tax_bill_no;
    }

    @ElVoField(physicalName = "tax_bill_no")
    public void setTax_bill_no(String tax_bill_no){
        this.tax_bill_no = tax_bill_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SptTecSlipSrcVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("supt_team").append("=").append(supt_team).append(",");
        sb.append("vend_abbr").append("=").append(vend_abbr).append(",");
        sb.append("supt_work_clsf").append("=").append(supt_work_clsf).append(",");
        sb.append("kolas_no").append("=").append(kolas_no).append(",");
        sb.append("slip_yn").append("=").append(slip_yn).append(",");
        sb.append("src_kind").append("=").append(src_kind).append(",");
        sb.append("demnd_recv_clsf").append("=").append(demnd_recv_clsf).append(",");
        sb.append("prcs_state").append("=").append(prcs_state).append(",");
        sb.append("inqr_val").append("=").append(inqr_val).append(",");
        sb.append("chrg_unslip_no").append("=").append(chrg_unslip_no).append(",");
        sb.append("chrg_unslip_odr").append("=").append(chrg_unslip_odr).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("tax_bill_no").append("=").append(tax_bill_no);
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
