package kr.re.kitech.biz.res.exc.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "연구비입금상세 Vo")
public class ResBgRectlVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResBgRectlVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "차수", physicalName = "depst_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int depst_odr;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "실입금금액", physicalName = "ofic_depst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long ofic_depst_amt;

    @ElDtoField(logicalName = "실입금일", physicalName = "ofic_depst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ofic_depst_ymd;

    @ElDtoField(logicalName = "입금구분", physicalName = "depst_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_clsf;

    @ElDtoField(logicalName = "어음번호", physicalName = "prmsnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prmsnt_no;

    @ElDtoField(logicalName = "입금처", physicalName = "depst_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_loc;

    @ElDtoField(logicalName = "입금처명", physicalName = "depst_loc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_loc_nm;

    @ElDtoField(logicalName = "청구계산서번호", physicalName = "demnd_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_bill_no;

    @ElDtoField(logicalName = "영수계산서번호", physicalName = "recv_bill_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String recv_bill_no;

    @ElDtoField(logicalName = "계좌번호", physicalName = "bankaccnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bankaccnt_no;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "입금상태", physicalName = "depst_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_state;

    @ElDtoField(logicalName = "입금의뢰번호", physicalName = "depst_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_req_no;

    @ElDtoField(logicalName = "은행", physicalName = "bank", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank;

    @ElDtoField(logicalName = "은행명", physicalName = "bank_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bank_nm;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청자", physicalName = "req_psn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn;

    @ElDtoField(logicalName = "청구의뢰번호", physicalName = "demnd_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_req_no;

    @ElDtoField(logicalName = "결재신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file;

    @ElDtoField(logicalName = "입금의뢰금액", physicalName = "depst_req_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long depst_req_amt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "청구금액", physicalName = "demnd_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long demnd_liq;

    @ElDtoField(logicalName = "청구계산서발행일자", physicalName = "issu_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_ymd;

    @ElDtoField(logicalName = "청구결의확정일자", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "확정일자", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "입금의뢰결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "계산서영수금액", physicalName = "recv_liq", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long recv_liq;

    @ElDtoField(logicalName = "결의일자", physicalName = "slip_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_ymd;

    @ElDtoField(logicalName = "전자발행여부", physicalName = "state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_nm;

    @ElDtoField(logicalName = "수기입력여부", physicalName = "old_data_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String old_data_yn;

    @ElDtoField(logicalName = "청구결의번호", physicalName = "demnd_unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demnd_unslip_no;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

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

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
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

    @ElVoField(physicalName = "depst_clsf")
    public String getDepst_clsf(){
        return depst_clsf;
    }

    @ElVoField(physicalName = "depst_clsf")
    public void setDepst_clsf(String depst_clsf){
        this.depst_clsf = depst_clsf;
    }

    @ElVoField(physicalName = "prmsnt_no")
    public String getPrmsnt_no(){
        return prmsnt_no;
    }

    @ElVoField(physicalName = "prmsnt_no")
    public void setPrmsnt_no(String prmsnt_no){
        this.prmsnt_no = prmsnt_no;
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

    @ElVoField(physicalName = "bankaccnt_no")
    public String getBankaccnt_no(){
        return bankaccnt_no;
    }

    @ElVoField(physicalName = "bankaccnt_no")
    public void setBankaccnt_no(String bankaccnt_no){
        this.bankaccnt_no = bankaccnt_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "depst_state")
    public String getDepst_state(){
        return depst_state;
    }

    @ElVoField(physicalName = "depst_state")
    public void setDepst_state(String depst_state){
        this.depst_state = depst_state;
    }

    @ElVoField(physicalName = "depst_req_no")
    public String getDepst_req_no(){
        return depst_req_no;
    }

    @ElVoField(physicalName = "depst_req_no")
    public void setDepst_req_no(String depst_req_no){
        this.depst_req_no = depst_req_no;
    }

    @ElVoField(physicalName = "bank")
    public String getBank(){
        return bank;
    }

    @ElVoField(physicalName = "bank")
    public void setBank(String bank){
        this.bank = bank;
    }

    @ElVoField(physicalName = "bank_nm")
    public String getBank_nm(){
        return bank_nm;
    }

    @ElVoField(physicalName = "bank_nm")
    public void setBank_nm(String bank_nm){
        this.bank_nm = bank_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_psn")
    public String getReq_psn(){
        return req_psn;
    }

    @ElVoField(physicalName = "req_psn")
    public void setReq_psn(String req_psn){
        this.req_psn = req_psn;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public String getDemnd_req_no(){
        return demnd_req_no;
    }

    @ElVoField(physicalName = "demnd_req_no")
    public void setDemnd_req_no(String demnd_req_no){
        this.demnd_req_no = demnd_req_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "attach_file")
    public String getAttach_file(){
        return attach_file;
    }

    @ElVoField(physicalName = "attach_file")
    public void setAttach_file(String attach_file){
        this.attach_file = attach_file;
    }

    @ElVoField(physicalName = "depst_req_amt")
    public long getDepst_req_amt(){
        return depst_req_amt;
    }

    @ElVoField(physicalName = "depst_req_amt")
    public void setDepst_req_amt(long depst_req_amt){
        this.depst_req_amt = depst_req_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "demnd_liq")
    public long getDemnd_liq(){
        return demnd_liq;
    }

    @ElVoField(physicalName = "demnd_liq")
    public void setDemnd_liq(long demnd_liq){
        this.demnd_liq = demnd_liq;
    }

    @ElVoField(physicalName = "issu_ymd")
    public String getIssu_ymd(){
        return issu_ymd;
    }

    @ElVoField(physicalName = "issu_ymd")
    public void setIssu_ymd(String issu_ymd){
        this.issu_ymd = issu_ymd;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "slip_odr")
    public int getSlip_odr(){
        return slip_odr;
    }

    @ElVoField(physicalName = "slip_odr")
    public void setSlip_odr(int slip_odr){
        this.slip_odr = slip_odr;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "recv_liq")
    public long getRecv_liq(){
        return recv_liq;
    }

    @ElVoField(physicalName = "recv_liq")
    public void setRecv_liq(long recv_liq){
        this.recv_liq = recv_liq;
    }

    @ElVoField(physicalName = "slip_ymd")
    public String getSlip_ymd(){
        return slip_ymd;
    }

    @ElVoField(physicalName = "slip_ymd")
    public void setSlip_ymd(String slip_ymd){
        this.slip_ymd = slip_ymd;
    }

    @ElVoField(physicalName = "state_nm")
    public String getState_nm(){
        return state_nm;
    }

    @ElVoField(physicalName = "state_nm")
    public void setState_nm(String state_nm){
        this.state_nm = state_nm;
    }

    @ElVoField(physicalName = "old_data_yn")
    public String getOld_data_yn(){
        return old_data_yn;
    }

    @ElVoField(physicalName = "old_data_yn")
    public void setOld_data_yn(String old_data_yn){
        this.old_data_yn = old_data_yn;
    }

    @ElVoField(physicalName = "demnd_unslip_no")
    public String getDemnd_unslip_no(){
        return demnd_unslip_no;
    }

    @ElVoField(physicalName = "demnd_unslip_no")
    public void setDemnd_unslip_no(String demnd_unslip_no){
        this.demnd_unslip_no = demnd_unslip_no;
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
        sb.append("ResBgRectlVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("depst_odr").append("=").append(depst_odr).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("ofic_depst_amt").append("=").append(ofic_depst_amt).append(",");
        sb.append("ofic_depst_ymd").append("=").append(ofic_depst_ymd).append(",");
        sb.append("depst_clsf").append("=").append(depst_clsf).append(",");
        sb.append("prmsnt_no").append("=").append(prmsnt_no).append(",");
        sb.append("depst_loc").append("=").append(depst_loc).append(",");
        sb.append("depst_loc_nm").append("=").append(depst_loc_nm).append(",");
        sb.append("demnd_bill_no").append("=").append(demnd_bill_no).append(",");
        sb.append("recv_bill_no").append("=").append(recv_bill_no).append(",");
        sb.append("bankaccnt_no").append("=").append(bankaccnt_no).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("depst_state").append("=").append(depst_state).append(",");
        sb.append("depst_req_no").append("=").append(depst_req_no).append(",");
        sb.append("bank").append("=").append(bank).append(",");
        sb.append("bank_nm").append("=").append(bank_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_psn").append("=").append(req_psn).append(",");
        sb.append("demnd_req_no").append("=").append(demnd_req_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("attach_file").append("=").append(attach_file).append(",");
        sb.append("depst_req_amt").append("=").append(depst_req_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("demnd_liq").append("=").append(demnd_liq).append(",");
        sb.append("issu_ymd").append("=").append(issu_ymd).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("recv_liq").append("=").append(recv_liq).append(",");
        sb.append("slip_ymd").append("=").append(slip_ymd).append(",");
        sb.append("state_nm").append("=").append(state_nm).append(",");
        sb.append("old_data_yn").append("=").append(old_data_yn).append(",");
        sb.append("demnd_unslip_no").append("=").append(demnd_unslip_no).append(",");
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
