package kr.re.kitech.biz.fin.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "잔액생성Vo")
public class FspRamtCreatVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspRamtCreatVo(){
    }

    @ElDtoField(logicalName = "확정결의번호", physicalName = "slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String slip_no;

    @ElDtoField(logicalName = "확정결의순번", physicalName = "slip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int slip_odr;

    @ElDtoField(logicalName = "게정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_cd;

    @ElDtoField(logicalName = "관리항목1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "관리항목명1", physicalName = "mngmt_item_nm_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_1;

    @ElDtoField(logicalName = "관리항목2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "관리항목명2", physicalName = "mngmt_item_nm_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_2;

    @ElDtoField(logicalName = "적요1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "적요2", physicalName = "rmk_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_2;

    @ElDtoField(logicalName = "원화발생금액", physicalName = "won_occr_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long won_occr_amt;

    @ElDtoField(logicalName = "원화정산금액", physicalName = "won_adjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long won_adjst_amt;

    @ElDtoField(logicalName = "가결의반제금액", physicalName = "unslip_repay_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_repay_amt;

    @ElDtoField(logicalName = "결의금액", physicalName = "unslip_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long unslip_amt;

    @ElDtoField(logicalName = "이전결의금액", physicalName = "before_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long before_amt;

    @ElDtoField(logicalName = "관련번호", physicalName = "relat_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String relat_no;

    @ElDtoField(logicalName = "정산금액체크", physicalName = "chk_unadjst_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long chk_unadjst_amt;

    @ElDtoField(logicalName = "정산가결의번호", physicalName = "unslip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_no;

    @ElDtoField(logicalName = "정산가결의순번", physicalName = "unslip_odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int unslip_odr;

    @ElDtoField(logicalName = "차대구분", physicalName = "base_debit_cr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_debit_cr;

    @ElDtoField(logicalName = "최종정산일자", physicalName = "final_adjst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_adjst_ymd;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "반제금액 수정여부 체크", physicalName = "unslip_repay_upd_yn", type = "boolean", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "true", desc = "")
    private boolean unslip_repay_upd_yn = true;

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

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        return expns_cd;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public String getMngmt_item_1(){
        return mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_1")
    public void setMngmt_item_1(String mngmt_item_1){
        this.mngmt_item_1 = mngmt_item_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public String getMngmt_item_nm_1(){
        return mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_nm_1")
    public void setMngmt_item_nm_1(String mngmt_item_nm_1){
        this.mngmt_item_nm_1 = mngmt_item_nm_1;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public String getMngmt_item_2(){
        return mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_2")
    public void setMngmt_item_2(String mngmt_item_2){
        this.mngmt_item_2 = mngmt_item_2;
    }

    @ElVoField(physicalName = "mngmt_item_nm_2")
    public String getMngmt_item_nm_2(){
        return mngmt_item_nm_2;
    }

    @ElVoField(physicalName = "mngmt_item_nm_2")
    public void setMngmt_item_nm_2(String mngmt_item_nm_2){
        this.mngmt_item_nm_2 = mngmt_item_nm_2;
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

    @ElVoField(physicalName = "won_occr_amt")
    public long getWon_occr_amt(){
        return won_occr_amt;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public void setWon_occr_amt(long won_occr_amt){
        this.won_occr_amt = won_occr_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public long getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(long won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public long getUnslip_repay_amt(){
        return unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public void setUnslip_repay_amt(long unslip_repay_amt){
        this.unslip_repay_amt = unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public long getUnslip_amt(){
        return unslip_amt;
    }

    @ElVoField(physicalName = "unslip_amt")
    public void setUnslip_amt(long unslip_amt){
        this.unslip_amt = unslip_amt;
    }

    @ElVoField(physicalName = "before_amt")
    public long getBefore_amt(){
        return before_amt;
    }

    @ElVoField(physicalName = "before_amt")
    public void setBefore_amt(long before_amt){
        this.before_amt = before_amt;
    }

    @ElVoField(physicalName = "relat_no")
    public String getRelat_no(){
        return relat_no;
    }

    @ElVoField(physicalName = "relat_no")
    public void setRelat_no(String relat_no){
        this.relat_no = relat_no;
    }

    @ElVoField(physicalName = "chk_unadjst_amt")
    public long getChk_unadjst_amt(){
        return chk_unadjst_amt;
    }

    @ElVoField(physicalName = "chk_unadjst_amt")
    public void setChk_unadjst_amt(long chk_unadjst_amt){
        this.chk_unadjst_amt = chk_unadjst_amt;
    }

    @ElVoField(physicalName = "unslip_no")
    public String getUnslip_no(){
        return unslip_no;
    }

    @ElVoField(physicalName = "unslip_no")
    public void setUnslip_no(String unslip_no){
        this.unslip_no = unslip_no;
    }

    @ElVoField(physicalName = "unslip_odr")
    public int getUnslip_odr(){
        return unslip_odr;
    }

    @ElVoField(physicalName = "unslip_odr")
    public void setUnslip_odr(int unslip_odr){
        this.unslip_odr = unslip_odr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public String getBase_debit_cr(){
        return base_debit_cr;
    }

    @ElVoField(physicalName = "base_debit_cr")
    public void setBase_debit_cr(String base_debit_cr){
        this.base_debit_cr = base_debit_cr;
    }

    @ElVoField(physicalName = "final_adjst_ymd")
    public String getFinal_adjst_ymd(){
        return final_adjst_ymd;
    }

    @ElVoField(physicalName = "final_adjst_ymd")
    public void setFinal_adjst_ymd(String final_adjst_ymd){
        this.final_adjst_ymd = final_adjst_ymd;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "unslip_repay_upd_yn")
    public boolean isUnslip_repay_upd_yn(){
        return unslip_repay_upd_yn;
    }

    @ElVoField(physicalName = "unslip_repay_upd_yn")
    public void setUnslip_repay_upd_yn(boolean unslip_repay_upd_yn){
        this.unslip_repay_upd_yn = unslip_repay_upd_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspRamtCreatVo [");
        sb.append("slip_no").append("=").append(slip_no).append(",");
        sb.append("slip_odr").append("=").append(slip_odr).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_nm_1").append("=").append(mngmt_item_nm_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("mngmt_item_nm_2").append("=").append(mngmt_item_nm_2).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("rmk_2").append("=").append(rmk_2).append(",");
        sb.append("won_occr_amt").append("=").append(won_occr_amt).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("unslip_repay_amt").append("=").append(unslip_repay_amt).append(",");
        sb.append("unslip_amt").append("=").append(unslip_amt).append(",");
        sb.append("before_amt").append("=").append(before_amt).append(",");
        sb.append("relat_no").append("=").append(relat_no).append(",");
        sb.append("chk_unadjst_amt").append("=").append(chk_unadjst_amt).append(",");
        sb.append("unslip_no").append("=").append(unslip_no).append(",");
        sb.append("unslip_odr").append("=").append(unslip_odr).append(",");
        sb.append("base_debit_cr").append("=").append(base_debit_cr).append(",");
        sb.append("final_adjst_ymd").append("=").append(final_adjst_ymd).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("unslip_repay_upd_yn").append("=").append(unslip_repay_upd_yn);
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
