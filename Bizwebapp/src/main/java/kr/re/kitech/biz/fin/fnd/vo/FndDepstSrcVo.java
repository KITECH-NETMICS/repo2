package kr.re.kitech.biz.fin.fnd.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "예금입금의뢰 조회 Vo")
public class FndDepstSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FndDepstSrcVo(){
    }

    @ElDtoField(logicalName = "입금일자(시작)", physicalName = "acct_txday_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday_st;

    @ElDtoField(logicalName = "입금일자(종료)", physicalName = "acct_txday_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday_ed;

    @ElDtoField(logicalName = "계좌번호", physicalName = "acct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_no;

    @ElDtoField(logicalName = "입금액(시작)", physicalName = "tx_amt_from", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tx_amt_from;

    @ElDtoField(logicalName = "입금액(종료)", physicalName = "tx_amt_to", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tx_amt_to;

    @ElDtoField(logicalName = "적요", physicalName = "remark", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String remark;

    @ElDtoField(logicalName = "가상계좌번호", physicalName = "vacct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vacct_no;

    @ElDtoField(logicalName = "예금구분(기업지원)", physicalName = "depst_knd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_knd;

    @ElDtoField(logicalName = "신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "입금일자", physicalName = "acct_txday", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String acct_txday;

    @ElDtoField(logicalName = "입금순번", physicalName = "acct_txday_seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int acct_txday_seq;

    @ElDtoField(logicalName = "업무구분", physicalName = "biz_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String biz_clsf;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "결재신청번호", physicalName = "apr_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_req_no;

    @ElDtoField(logicalName = "입금관리번호(기술지원)", physicalName = "depst_mngmt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_mngmt_no;

    @ElDtoField(logicalName = "입금의뢰여부(예금입금의뢰2)", physicalName = "depst_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String depst_yn;

    @ElVoField(physicalName = "acct_txday_st")
    public String getAcct_txday_st(){
        return acct_txday_st;
    }

    @ElVoField(physicalName = "acct_txday_st")
    public void setAcct_txday_st(String acct_txday_st){
        this.acct_txday_st = acct_txday_st;
    }

    @ElVoField(physicalName = "acct_txday_ed")
    public String getAcct_txday_ed(){
        return acct_txday_ed;
    }

    @ElVoField(physicalName = "acct_txday_ed")
    public void setAcct_txday_ed(String acct_txday_ed){
        this.acct_txday_ed = acct_txday_ed;
    }

    @ElVoField(physicalName = "acct_no")
    public String getAcct_no(){
        return acct_no;
    }

    @ElVoField(physicalName = "acct_no")
    public void setAcct_no(String acct_no){
        this.acct_no = acct_no;
    }

    @ElVoField(physicalName = "tx_amt_from")
    public String getTx_amt_from(){
        return tx_amt_from;
    }

    @ElVoField(physicalName = "tx_amt_from")
    public void setTx_amt_from(String tx_amt_from){
        this.tx_amt_from = tx_amt_from;
    }

    @ElVoField(physicalName = "tx_amt_to")
    public String getTx_amt_to(){
        return tx_amt_to;
    }

    @ElVoField(physicalName = "tx_amt_to")
    public void setTx_amt_to(String tx_amt_to){
        this.tx_amt_to = tx_amt_to;
    }

    @ElVoField(physicalName = "remark")
    public String getRemark(){
        return remark;
    }

    @ElVoField(physicalName = "remark")
    public void setRemark(String remark){
        this.remark = remark;
    }

    @ElVoField(physicalName = "vacct_no")
    public String getVacct_no(){
        return vacct_no;
    }

    @ElVoField(physicalName = "vacct_no")
    public void setVacct_no(String vacct_no){
        this.vacct_no = vacct_no;
    }

    @ElVoField(physicalName = "depst_knd")
    public String getDepst_knd(){
        return depst_knd;
    }

    @ElVoField(physicalName = "depst_knd")
    public void setDepst_knd(String depst_knd){
        this.depst_knd = depst_knd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "acct_txday")
    public String getAcct_txday(){
        return acct_txday;
    }

    @ElVoField(physicalName = "acct_txday")
    public void setAcct_txday(String acct_txday){
        this.acct_txday = acct_txday;
    }

    @ElVoField(physicalName = "acct_txday_seq")
    public int getAcct_txday_seq(){
        return acct_txday_seq;
    }

    @ElVoField(physicalName = "acct_txday_seq")
    public void setAcct_txday_seq(int acct_txday_seq){
        this.acct_txday_seq = acct_txday_seq;
    }

    @ElVoField(physicalName = "biz_clsf")
    public String getBiz_clsf(){
        return biz_clsf;
    }

    @ElVoField(physicalName = "biz_clsf")
    public void setBiz_clsf(String biz_clsf){
        this.biz_clsf = biz_clsf;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "apr_req_no")
    public String getApr_req_no(){
        return apr_req_no;
    }

    @ElVoField(physicalName = "apr_req_no")
    public void setApr_req_no(String apr_req_no){
        this.apr_req_no = apr_req_no;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public String getDepst_mngmt_no(){
        return depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_mngmt_no")
    public void setDepst_mngmt_no(String depst_mngmt_no){
        this.depst_mngmt_no = depst_mngmt_no;
    }

    @ElVoField(physicalName = "depst_yn")
    public String getDepst_yn(){
        return depst_yn;
    }

    @ElVoField(physicalName = "depst_yn")
    public void setDepst_yn(String depst_yn){
        this.depst_yn = depst_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FndDepstSrcVo [");
        sb.append("acct_txday_st").append("=").append(acct_txday_st).append(",");
        sb.append("acct_txday_ed").append("=").append(acct_txday_ed).append(",");
        sb.append("acct_no").append("=").append(acct_no).append(",");
        sb.append("tx_amt_from").append("=").append(tx_amt_from).append(",");
        sb.append("tx_amt_to").append("=").append(tx_amt_to).append(",");
        sb.append("remark").append("=").append(remark).append(",");
        sb.append("vacct_no").append("=").append(vacct_no).append(",");
        sb.append("depst_knd").append("=").append(depst_knd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("acct_txday").append("=").append(acct_txday).append(",");
        sb.append("acct_txday_seq").append("=").append(acct_txday_seq).append(",");
        sb.append("biz_clsf").append("=").append(biz_clsf).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("apr_req_no").append("=").append(apr_req_no).append(",");
        sb.append("depst_mngmt_no").append("=").append(depst_mngmt_no).append(",");
        sb.append("depst_yn").append("=").append(depst_yn);
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
