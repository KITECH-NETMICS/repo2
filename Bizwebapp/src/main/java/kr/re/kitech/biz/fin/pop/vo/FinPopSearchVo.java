package kr.re.kitech.biz.fin.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "재무 팝업검색조건 Vo")
public class FinPopSearchVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FinPopSearchVo(){
    }

    @ElDtoField(logicalName = "시작일자", physicalName = "from_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String from_ymd;

    @ElDtoField(logicalName = "종료일자", physicalName = "to_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String to_ymd;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "확정번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "카드번호 ", physicalName = "card_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_no;

    @ElDtoField(logicalName = "카드종류", physicalName = "card_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_knd;

    @ElDtoField(logicalName = "카드구분", physicalName = "card_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_clsf;

    @ElDtoField(logicalName = "카드상태", physicalName = "card_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String card_state;

    @ElDtoField(logicalName = "카드보유자", physicalName = "keep_charg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String keep_charg;

    @ElDtoField(logicalName = "조회값", physicalName = "inqr_value", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inqr_value;

    @ElDtoField(logicalName = "통제번호", physicalName = "ctrl_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ctrl_no;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "채권채무구분", physicalName = "bond_debt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bond_debt_clsf;

    @ElDtoField(logicalName = "국세청전송일련번호", physicalName = "issu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String issu_id;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

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

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public String getSlip_no(){
        return slip_no;
    }

    @ElVoField(physicalName = "slip_no")
    public void setSlip_no(String slip_no){
        this.slip_no = slip_no;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "card_no")
    public String getCard_no(){
        return card_no;
    }

    @ElVoField(physicalName = "card_no")
    public void setCard_no(String card_no){
        this.card_no = card_no;
    }

    @ElVoField(physicalName = "card_knd")
    public String getCard_knd(){
        return card_knd;
    }

    @ElVoField(physicalName = "card_knd")
    public void setCard_knd(String card_knd){
        this.card_knd = card_knd;
    }

    @ElVoField(physicalName = "card_clsf")
    public String getCard_clsf(){
        return card_clsf;
    }

    @ElVoField(physicalName = "card_clsf")
    public void setCard_clsf(String card_clsf){
        this.card_clsf = card_clsf;
    }

    @ElVoField(physicalName = "card_state")
    public String getCard_state(){
        return card_state;
    }

    @ElVoField(physicalName = "card_state")
    public void setCard_state(String card_state){
        this.card_state = card_state;
    }

    @ElVoField(physicalName = "keep_charg")
    public String getKeep_charg(){
        return keep_charg;
    }

    @ElVoField(physicalName = "keep_charg")
    public void setKeep_charg(String keep_charg){
        this.keep_charg = keep_charg;
    }

    @ElVoField(physicalName = "inqr_value")
    public String getInqr_value(){
        return inqr_value;
    }

    @ElVoField(physicalName = "inqr_value")
    public void setInqr_value(String inqr_value){
        this.inqr_value = inqr_value;
    }

    @ElVoField(physicalName = "ctrl_no")
    public String getCtrl_no(){
        return ctrl_no;
    }

    @ElVoField(physicalName = "ctrl_no")
    public void setCtrl_no(String ctrl_no){
        this.ctrl_no = ctrl_no;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public String getBond_debt_clsf(){
        return bond_debt_clsf;
    }

    @ElVoField(physicalName = "bond_debt_clsf")
    public void setBond_debt_clsf(String bond_debt_clsf){
        this.bond_debt_clsf = bond_debt_clsf;
    }

    @ElVoField(physicalName = "issu_id")
    public String getIssu_id(){
        return issu_id;
    }

    @ElVoField(physicalName = "issu_id")
    public void setIssu_id(String issu_id){
        this.issu_id = issu_id;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FinPopSearchVo [");
        sb.append("from_ymd").append("=").append(from_ymd).append(",");
        sb.append("to_ymd").append("=").append(to_ymd).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("card_no").append("=").append(card_no).append(",");
        sb.append("card_knd").append("=").append(card_knd).append(",");
        sb.append("card_clsf").append("=").append(card_clsf).append(",");
        sb.append("card_state").append("=").append(card_state).append(",");
        sb.append("keep_charg").append("=").append(keep_charg).append(",");
        sb.append("inqr_value").append("=").append(inqr_value).append(",");
        sb.append("ctrl_no").append("=").append(ctrl_no).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("bond_debt_clsf").append("=").append(bond_debt_clsf).append(",");
        sb.append("issu_id").append("=").append(issu_id).append(",");
        sb.append("syspayno").append("=").append(syspayno);
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
