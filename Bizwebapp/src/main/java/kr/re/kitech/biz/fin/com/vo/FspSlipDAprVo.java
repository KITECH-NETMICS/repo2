package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "결의서 디테일 결재 Vo")
public class FspSlipDAprVo extends kr.re.kitech.biz.fin.com.vo.FspSlipDComVo {
    private static final long serialVersionUID = 1L;

    public FspSlipDAprVo(){
    }

    @ElDtoField(logicalName = "차대구분", physicalName = "base_debit_cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_debit_cr;

    @ElDtoField(logicalName = "증빙코드", physicalName = "evid_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_cd;

    @ElDtoField(logicalName = "계정책임자", physicalName = "accnt_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String accnt_rspns;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_abbr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String accnt_abbr_nm;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "차변금액", physicalName = "debit_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long debit_amt;

    @ElDtoField(logicalName = "대변금액", physicalName = "cr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long cr_amt;

    @ElDtoField(logicalName = "비고1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String rmk_1;

    @ElDtoField(logicalName = "비고2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "작성자필수")
    private String rmk_2;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_detls_cd1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd1;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_detls_cd2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd2;

    @ElDtoField(logicalName = "관리항목3", physicalName = "mngmt_detls_cd3", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_detls_cd3;

    @ElDtoField(logicalName = "계정종료일자", physicalName = "cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cls_ymd;

    @ElDtoField(logicalName = "증빙여부", physicalName = "evid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String evid_yn;

    @ElDtoField(logicalName = "서비스id", physicalName = "service_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String service_id;

    @ElDtoField(logicalName = "max 차변금액", physicalName = "unslip_amt_max", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt_max;

    @ElDtoField(logicalName = "분개유형", physicalName = "journ_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String journ_cd;

    @ElDtoField(logicalName = "비목해소기준", physicalName = "itm_solve_base", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String itm_solve_base;

    @ElDtoField(logicalName = "회의록번호", physicalName = "meet_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String meet_req_no;

    @ElVoField(physicalName = "base_debit_cr")
    public String getBase_debit_cr(){
        return base_debit_cr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public void setBase_debit_cr(String base_debit_cr){
        this.base_debit_cr = base_debit_cr;
    }

    @ElVoField(physicalName = "evid_cd")
    public String getEvid_cd(){
        return evid_cd;
    }

    @ElVoField(physicalName = "evid_cd")
    public void setEvid_cd(String evid_cd){
        this.evid_cd = evid_cd;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public String getAccnt_rspns(){
        return accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns")
    public void setAccnt_rspns(String accnt_rspns){
        this.accnt_rspns = accnt_rspns;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_abbr_nm")
    public String getAccnt_abbr_nm(){
        return accnt_abbr_nm;
    }

    @ElVoField(physicalName = "accnt_abbr_nm")
    public void setAccnt_abbr_nm(String accnt_abbr_nm){
        this.accnt_abbr_nm = accnt_abbr_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        return expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        return itm_clsf;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "debit_amt")
    public long getDebit_amt(){
        return debit_amt;
    }

    @ElVoField(physicalName = "debit_amt")
    public void setDebit_amt(long debit_amt){
        this.debit_amt = debit_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public long getCr_amt(){
        return cr_amt;
    }

    @ElVoField(physicalName = "cr_amt")
    public void setCr_amt(long cr_amt){
        this.cr_amt = cr_amt;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "rmk_2")
    public String getRmk_2(){
        return rmk_2;
    }

    @ElVoField(physicalName = "rmk_2")
    public void setRmk_2(String rmk_2){
        this.rmk_2 = rmk_2;
    }

    @ElVoField(physicalName = "mngmt_detls_cd1")
    public String getMngmt_detls_cd1(){
        return mngmt_detls_cd1;
    }

    @ElVoField(physicalName = "mngmt_detls_cd1")
    public void setMngmt_detls_cd1(String mngmt_detls_cd1){
        this.mngmt_detls_cd1 = mngmt_detls_cd1;
    }

    @ElVoField(physicalName = "mngmt_detls_cd2")
    public String getMngmt_detls_cd2(){
        return mngmt_detls_cd2;
    }

    @ElVoField(physicalName = "mngmt_detls_cd2")
    public void setMngmt_detls_cd2(String mngmt_detls_cd2){
        this.mngmt_detls_cd2 = mngmt_detls_cd2;
    }

    @ElVoField(physicalName = "mngmt_detls_cd3")
    public String getMngmt_detls_cd3(){
        return mngmt_detls_cd3;
    }

    @ElVoField(physicalName = "mngmt_detls_cd3")
    public void setMngmt_detls_cd3(String mngmt_detls_cd3){
        this.mngmt_detls_cd3 = mngmt_detls_cd3;
    }

    @ElVoField(physicalName = "cls_ymd")
    public String getCls_ymd(){
        return cls_ymd;
    }

    @ElVoField(physicalName = "cls_ymd")
    public void setCls_ymd(String cls_ymd){
        this.cls_ymd = cls_ymd;
    }

    @ElVoField(physicalName = "evid_yn")
    public String getEvid_yn(){
        return evid_yn;
    }

    @ElVoField(physicalName = "evid_yn")
    public void setEvid_yn(String evid_yn){
        this.evid_yn = evid_yn;
    }

    @ElVoField(physicalName = "service_id")
    public String getService_id(){
        return service_id;
    }

    @ElVoField(physicalName = "service_id")
    public void setService_id(String service_id){
        this.service_id = service_id;
    }

    @ElVoField(physicalName = "unslip_amt_max")
    public long getUnslip_amt_max(){
        return unslip_amt_max;
    }

    @ElVoField(physicalName = "unslip_amt_max")
    public void setUnslip_amt_max(long unslip_amt_max){
        this.unslip_amt_max = unslip_amt_max;
    }

    @ElVoField(physicalName = "journ_cd")
    public String getJourn_cd(){
        return journ_cd;
    }

    @ElVoField(physicalName = "journ_cd")
    public void setJourn_cd(String journ_cd){
        this.journ_cd = journ_cd;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public String getItm_solve_base(){
        return itm_solve_base;
    }

    @ElVoField(physicalName = "itm_solve_base")
    public void setItm_solve_base(String itm_solve_base){
        this.itm_solve_base = itm_solve_base;
    }

    @ElVoField(physicalName = "meet_req_no")
    public String getMeet_req_no(){
        return meet_req_no;
    }

    @ElVoField(physicalName = "meet_req_no")
    public void setMeet_req_no(String meet_req_no){
        this.meet_req_no = meet_req_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspSlipDAprVo [");
        sb.append("base_debit_cr").append("=").append(base_debit_cr).append(",");
        sb.append("evid_cd").append("=").append(evid_cd).append(",");
        sb.append("accnt_rspns").append("=").append(accnt_rspns).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("accnt_abbr_nm").append("=").append(accnt_abbr_nm).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("debit_amt").append("=").append(debit_amt).append(",");
        sb.append("cr_amt").append("=").append(cr_amt).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("mngmt_detls_cd1").append("=").append(mngmt_detls_cd1).append(",");
        sb.append("mngmt_detls_cd2").append("=").append(mngmt_detls_cd2).append(",");
        sb.append("mngmt_detls_cd3").append("=").append(mngmt_detls_cd3).append(",");
        sb.append("cls_ymd").append("=").append(cls_ymd).append(",");
        sb.append("evid_yn").append("=").append(evid_yn).append(",");
        sb.append("service_id").append("=").append(service_id).append(",");
        sb.append("unslip_amt_max").append("=").append(unslip_amt_max).append(",");
        sb.append("journ_cd").append("=").append(journ_cd).append(",");
        sb.append("itm_solve_base").append("=").append(itm_solve_base).append(",");
        sb.append("meet_req_no").append("=").append(meet_req_no);
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
