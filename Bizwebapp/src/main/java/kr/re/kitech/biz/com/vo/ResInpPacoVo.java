package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "과제 참여업체 Vo")
public class ResInpPacoVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ResInpPacoVo(){
    }

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "계정명", physicalName = "accnt_no_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no_nm;

    @ElDtoField(logicalName = "과제번호", physicalName = "prj_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_no;

    @ElDtoField(logicalName = "업체코드", physicalName = "vend_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_cd;

    @ElDtoField(logicalName = "사업자등록번호", physicalName = "bsns_psn_regst_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bsns_psn_regst_no;

    @ElDtoField(logicalName = "대표자 성명", physicalName = "reprs_psn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String reprs_psn_nm;

    @ElDtoField(logicalName = "업체명", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "참여구분", physicalName = "attnce_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_clsf;

    @ElDtoField(logicalName = "참여구분", physicalName = "attnce_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_nm;

    @ElDtoField(logicalName = "연구금액현금", physicalName = "resch_amt_cash", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_cash;

    @ElDtoField(logicalName = "연구금액현물", physicalName = "resch_amt_goods", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_goods;

    @ElDtoField(logicalName = "연구금액합계", physicalName = "resch_amt_sum", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String resch_amt_sum;

    @ElDtoField(logicalName = "위탁과제명", physicalName = "trust_prj_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_prj_nm;

    @ElDtoField(logicalName = "위탁시작일자", physicalName = "trust_orign_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_orign_ymd;

    @ElDtoField(logicalName = "위탁종료일자", physicalName = "trust_cls_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String trust_cls_ymd;

    @ElDtoField(logicalName = "참여상태", physicalName = "attnce_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_state;

    @ElDtoField(logicalName = "참여상태명", physicalName = "attnce_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attnce_state_nm;

    @ElDtoField(logicalName = "계정책임자성명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "계정책임자부서", physicalName = "dept_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String dept_nm;

    @ElDtoField(logicalName = "계정기간", physicalName = "prj_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prj_ymd;

    @ElDtoField(logicalName = "참여제한", physicalName = "retrc_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String retrc_yn;

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public String getAccnt_no_nm(){
        return accnt_no_nm;
    }

    @ElVoField(physicalName = "accnt_no_nm")
    public void setAccnt_no_nm(String accnt_no_nm){
        this.accnt_no_nm = accnt_no_nm;
    }

    @ElVoField(physicalName = "prj_no")
    public String getPrj_no(){
        return prj_no;
    }

    @ElVoField(physicalName = "prj_no")
    public void setPrj_no(String prj_no){
        this.prj_no = prj_no;
    }

    @ElVoField(physicalName = "vend_cd")
    public String getVend_cd(){
        return vend_cd;
    }

    @ElVoField(physicalName = "vend_cd")
    public void setVend_cd(String vend_cd){
        this.vend_cd = vend_cd;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public String getBsns_psn_regst_no(){
        return bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "bsns_psn_regst_no")
    public void setBsns_psn_regst_no(String bsns_psn_regst_no){
        this.bsns_psn_regst_no = bsns_psn_regst_no;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public String getReprs_psn_nm(){
        return reprs_psn_nm;
    }

    @ElVoField(physicalName = "reprs_psn_nm")
    public void setReprs_psn_nm(String reprs_psn_nm){
        this.reprs_psn_nm = reprs_psn_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public String getAttnce_clsf(){
        return attnce_clsf;
    }

    @ElVoField(physicalName = "attnce_clsf")
    public void setAttnce_clsf(String attnce_clsf){
        this.attnce_clsf = attnce_clsf;
    }

    @ElVoField(physicalName = "attnce_nm")
    public String getAttnce_nm(){
        return attnce_nm;
    }

    @ElVoField(physicalName = "attnce_nm")
    public void setAttnce_nm(String attnce_nm){
        this.attnce_nm = attnce_nm;
    }

    @ElVoField(physicalName = "resch_amt_cash")
    public String getResch_amt_cash(){
        return resch_amt_cash;
    }

    @ElVoField(physicalName = "resch_amt_cash")
    public void setResch_amt_cash(String resch_amt_cash){
        this.resch_amt_cash = resch_amt_cash;
    }

    @ElVoField(physicalName = "resch_amt_goods")
    public String getResch_amt_goods(){
        return resch_amt_goods;
    }

    @ElVoField(physicalName = "resch_amt_goods")
    public void setResch_amt_goods(String resch_amt_goods){
        this.resch_amt_goods = resch_amt_goods;
    }

    @ElVoField(physicalName = "resch_amt_sum")
    public String getResch_amt_sum(){
        return resch_amt_sum;
    }

    @ElVoField(physicalName = "resch_amt_sum")
    public void setResch_amt_sum(String resch_amt_sum){
        this.resch_amt_sum = resch_amt_sum;
    }

    @ElVoField(physicalName = "trust_prj_nm")
    public String getTrust_prj_nm(){
        return trust_prj_nm;
    }

    @ElVoField(physicalName = "trust_prj_nm")
    public void setTrust_prj_nm(String trust_prj_nm){
        this.trust_prj_nm = trust_prj_nm;
    }

    @ElVoField(physicalName = "trust_orign_ymd")
    public String getTrust_orign_ymd(){
        return trust_orign_ymd;
    }

    @ElVoField(physicalName = "trust_orign_ymd")
    public void setTrust_orign_ymd(String trust_orign_ymd){
        this.trust_orign_ymd = trust_orign_ymd;
    }

    @ElVoField(physicalName = "trust_cls_ymd")
    public String getTrust_cls_ymd(){
        return trust_cls_ymd;
    }

    @ElVoField(physicalName = "trust_cls_ymd")
    public void setTrust_cls_ymd(String trust_cls_ymd){
        this.trust_cls_ymd = trust_cls_ymd;
    }

    @ElVoField(physicalName = "attnce_state")
    public String getAttnce_state(){
        return attnce_state;
    }

    @ElVoField(physicalName = "attnce_state")
    public void setAttnce_state(String attnce_state){
        this.attnce_state = attnce_state;
    }

    @ElVoField(physicalName = "attnce_state_nm")
    public String getAttnce_state_nm(){
        return attnce_state_nm;
    }

    @ElVoField(physicalName = "attnce_state_nm")
    public void setAttnce_state_nm(String attnce_state_nm){
        this.attnce_state_nm = attnce_state_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public String getDept_nm(){
        return dept_nm;
    }

    @ElVoField(physicalName = "dept_nm")
    public void setDept_nm(String dept_nm){
        this.dept_nm = dept_nm;
    }

    @ElVoField(physicalName = "prj_ymd")
    public String getPrj_ymd(){
        return prj_ymd;
    }

    @ElVoField(physicalName = "prj_ymd")
    public void setPrj_ymd(String prj_ymd){
        this.prj_ymd = prj_ymd;
    }

    @ElVoField(physicalName = "retrc_yn")
    public String getRetrc_yn(){
        return retrc_yn;
    }

    @ElVoField(physicalName = "retrc_yn")
    public void setRetrc_yn(String retrc_yn){
        this.retrc_yn = retrc_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResInpPacoVo [");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("accnt_no_nm").append("=").append(accnt_no_nm).append(",");
        sb.append("prj_no").append("=").append(prj_no).append(",");
        sb.append("vend_cd").append("=").append(vend_cd).append(",");
        sb.append("bsns_psn_regst_no").append("=").append(bsns_psn_regst_no).append(",");
        sb.append("reprs_psn_nm").append("=").append(reprs_psn_nm).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("attnce_clsf").append("=").append(attnce_clsf).append(",");
        sb.append("attnce_nm").append("=").append(attnce_nm).append(",");
        sb.append("resch_amt_cash").append("=").append(resch_amt_cash).append(",");
        sb.append("resch_amt_goods").append("=").append(resch_amt_goods).append(",");
        sb.append("resch_amt_sum").append("=").append(resch_amt_sum).append(",");
        sb.append("trust_prj_nm").append("=").append(trust_prj_nm).append(",");
        sb.append("trust_orign_ymd").append("=").append(trust_orign_ymd).append(",");
        sb.append("trust_cls_ymd").append("=").append(trust_cls_ymd).append(",");
        sb.append("attnce_state").append("=").append(attnce_state).append(",");
        sb.append("attnce_state_nm").append("=").append(attnce_state_nm).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("dept_nm").append("=").append(dept_nm).append(",");
        sb.append("prj_ymd").append("=").append(prj_ymd).append(",");
        sb.append("retrc_yn").append("=").append(retrc_yn);
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
