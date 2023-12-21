package kr.re.kitech.biz.fin.leg.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "FspRamtCrateExp")
public class FspRamtCrateVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FspRamtCrateVo(){
    }

    @ElDtoField(logicalName = "accntYmdFr", physicalName = "accnt_ymd_fr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_fr;

    @ElDtoField(logicalName = "accntYmdTo", physicalName = "accnt_ymd_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd_to;

    @ElDtoField(logicalName = "accntCd", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "reschrRspns", physicalName = "reschr_rspns", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reschr_rspns;

    @ElDtoField(logicalName = "mngmtItem1T", physicalName = "mngmt_item_1T", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1T;

    @ElDtoField(logicalName = "mngmtItem1F", physicalName = "mngmt_item_1F", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1F;

    @ElDtoField(logicalName = "mngmtItem2T", physicalName = "mngmt_item_2T", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2T;

    @ElDtoField(logicalName = "mngmtItem2F", physicalName = "mngmt_item_2F", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2F;

    @ElDtoField(logicalName = "mngmtItem1", physicalName = "mngmt_item_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_1;

    @ElDtoField(logicalName = "mngmtItemNm1", physicalName = "mngmt_item_nm_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_1;

    @ElDtoField(logicalName = "mngmtItem2", physicalName = "mngmt_item_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_2;

    @ElDtoField(logicalName = "mngmtItemNm2", physicalName = "mngmt_item_nm_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String mngmt_item_nm_2;

    @ElDtoField(logicalName = "accntYmd", physicalName = "accnt_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_ymd;

    @ElDtoField(logicalName = "accntCdAbbr", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "wonOccrAmt", physicalName = "won_occr_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String won_occr_amt;

    @ElDtoField(logicalName = "decsnEx", physicalName = "decsn_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String decsn_ex;

    @ElDtoField(logicalName = "wonAdjstAmt", physicalName = "won_adjst_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String won_adjst_amt;

    @ElDtoField(logicalName = "unslipRepayAmt", physicalName = "unslip_repay_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String unslip_repay_amt;

    @ElDtoField(logicalName = "amt", physicalName = "amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String amt;

    @ElDtoField(logicalName = "finalAdjstYmd", physicalName = "final_adjst_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String final_adjst_ymd;

    @ElDtoField(logicalName = "rmk1", physicalName = "rmk_1", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk_1;

    @ElDtoField(logicalName = "occSlipNo", physicalName = "occ_slip_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String occ_slip_no;

    @ElDtoField(logicalName = "baseAdjstAmt", physicalName = "base_Adjst_Amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String base_Adjst_Amt;

    @ElDtoField(logicalName = "casebyAdjstEx", physicalName = "caseby_adjst_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String caseby_adjst_ex;

    @ElVoField(physicalName = "accnt_ymd_fr")
    public String getAccnt_ymd_fr(){
        return accnt_ymd_fr;
    }

    @ElVoField(physicalName = "accnt_ymd_fr")
    public void setAccnt_ymd_fr(String accnt_ymd_fr){
        this.accnt_ymd_fr = accnt_ymd_fr;
    }

    @ElVoField(physicalName = "accnt_ymd_to")
    public String getAccnt_ymd_to(){
        return accnt_ymd_to;
    }

    @ElVoField(physicalName = "accnt_ymd_to")
    public void setAccnt_ymd_to(String accnt_ymd_to){
        this.accnt_ymd_to = accnt_ymd_to;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        return accnt_cd;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "reschr_rspns")
    public String getReschr_rspns(){
        return reschr_rspns;
    }

    @ElVoField(physicalName = "reschr_rspns")
    public void setReschr_rspns(String reschr_rspns){
        this.reschr_rspns = reschr_rspns;
    }

    @ElVoField(physicalName = "mngmt_item_1T")
    public String getMngmt_item_1T(){
        return mngmt_item_1T;
    }

    @ElVoField(physicalName = "mngmt_item_1T")
    public void setMngmt_item_1T(String mngmt_item_1T){
        this.mngmt_item_1T = mngmt_item_1T;
    }

    @ElVoField(physicalName = "mngmt_item_1F")
    public String getMngmt_item_1F(){
        return mngmt_item_1F;
    }

    @ElVoField(physicalName = "mngmt_item_1F")
    public void setMngmt_item_1F(String mngmt_item_1F){
        this.mngmt_item_1F = mngmt_item_1F;
    }

    @ElVoField(physicalName = "mngmt_item_2T")
    public String getMngmt_item_2T(){
        return mngmt_item_2T;
    }

    @ElVoField(physicalName = "mngmt_item_2T")
    public void setMngmt_item_2T(String mngmt_item_2T){
        this.mngmt_item_2T = mngmt_item_2T;
    }

    @ElVoField(physicalName = "mngmt_item_2F")
    public String getMngmt_item_2F(){
        return mngmt_item_2F;
    }

    @ElVoField(physicalName = "mngmt_item_2F")
    public void setMngmt_item_2F(String mngmt_item_2F){
        this.mngmt_item_2F = mngmt_item_2F;
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

    @ElVoField(physicalName = "accnt_ymd")
    public String getAccnt_ymd(){
        return accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_ymd")
    public void setAccnt_ymd(String accnt_ymd){
        this.accnt_ymd = accnt_ymd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        return accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public String getWon_occr_amt(){
        return won_occr_amt;
    }

    @ElVoField(physicalName = "won_occr_amt")
    public void setWon_occr_amt(String won_occr_amt){
        this.won_occr_amt = won_occr_amt;
    }

    @ElVoField(physicalName = "decsn_ex")
    public String getDecsn_ex(){
        return decsn_ex;
    }

    @ElVoField(physicalName = "decsn_ex")
    public void setDecsn_ex(String decsn_ex){
        this.decsn_ex = decsn_ex;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public String getWon_adjst_amt(){
        return won_adjst_amt;
    }

    @ElVoField(physicalName = "won_adjst_amt")
    public void setWon_adjst_amt(String won_adjst_amt){
        this.won_adjst_amt = won_adjst_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public String getUnslip_repay_amt(){
        return unslip_repay_amt;
    }

    @ElVoField(physicalName = "unslip_repay_amt")
    public void setUnslip_repay_amt(String unslip_repay_amt){
        this.unslip_repay_amt = unslip_repay_amt;
    }

    @ElVoField(physicalName = "amt")
    public String getAmt(){
        return amt;
    }

    @ElVoField(physicalName = "amt")
    public void setAmt(String amt){
        this.amt = amt;
    }

    @ElVoField(physicalName = "final_adjst_ymd")
    public String getFinal_adjst_ymd(){
        return final_adjst_ymd;
    }

    @ElVoField(physicalName = "final_adjst_ymd")
    public void setFinal_adjst_ymd(String final_adjst_ymd){
        this.final_adjst_ymd = final_adjst_ymd;
    }

    @ElVoField(physicalName = "rmk_1")
    public String getRmk_1(){
        return rmk_1;
    }

    @ElVoField(physicalName = "rmk_1")
    public void setRmk_1(String rmk_1){
        this.rmk_1 = rmk_1;
    }

    @ElVoField(physicalName = "occ_slip_no")
    public String getOcc_slip_no(){
        return occ_slip_no;
    }

    @ElVoField(physicalName = "occ_slip_no")
    public void setOcc_slip_no(String occ_slip_no){
        this.occ_slip_no = occ_slip_no;
    }

    @ElVoField(physicalName = "base_Adjst_Amt")
    public String getBase_Adjst_Amt(){
        return base_Adjst_Amt;
    }

    @ElVoField(physicalName = "base_Adjst_Amt")
    public void setBase_Adjst_Amt(String base_Adjst_Amt){
        this.base_Adjst_Amt = base_Adjst_Amt;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public String getCaseby_adjst_ex(){
        return caseby_adjst_ex;
    }

    @ElVoField(physicalName = "caseby_adjst_ex")
    public void setCaseby_adjst_ex(String caseby_adjst_ex){
        this.caseby_adjst_ex = caseby_adjst_ex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FspRamtCrateVo [");
        sb.append("accnt_ymd_fr").append("=").append(accnt_ymd_fr).append(",");
        sb.append("accnt_ymd_to").append("=").append(accnt_ymd_to).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("reschr_rspns").append("=").append(reschr_rspns).append(",");
        sb.append("mngmt_item_1T").append("=").append(mngmt_item_1T).append(",");
        sb.append("mngmt_item_1F").append("=").append(mngmt_item_1F).append(",");
        sb.append("mngmt_item_2T").append("=").append(mngmt_item_2T).append(",");
        sb.append("mngmt_item_2F").append("=").append(mngmt_item_2F).append(",");
        sb.append("mngmt_item_1").append("=").append(mngmt_item_1).append(",");
        sb.append("mngmt_item_nm_1").append("=").append(mngmt_item_nm_1).append(",");
        sb.append("mngmt_item_2").append("=").append(mngmt_item_2).append(",");
        sb.append("mngmt_item_nm_2").append("=").append(mngmt_item_nm_2).append(",");
        sb.append("accnt_ymd").append("=").append(accnt_ymd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("won_occr_amt").append("=").append(won_occr_amt).append(",");
        sb.append("decsn_ex").append("=").append(decsn_ex).append(",");
        sb.append("won_adjst_amt").append("=").append(won_adjst_amt).append(",");
        sb.append("unslip_repay_amt").append("=").append(unslip_repay_amt).append(",");
        sb.append("amt").append("=").append(amt).append(",");
        sb.append("final_adjst_ymd").append("=").append(final_adjst_ymd).append(",");
        sb.append("rmk_1").append("=").append(rmk_1).append(",");
        sb.append("occ_slip_no").append("=").append(occ_slip_no).append(",");
        sb.append("base_Adjst_Amt").append("=").append(base_Adjst_Amt).append(",");
        sb.append("caseby_adjst_ex").append("=").append(caseby_adjst_ex);
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
