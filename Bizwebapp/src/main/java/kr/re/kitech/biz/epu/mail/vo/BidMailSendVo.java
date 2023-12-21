package kr.re.kitech.biz.epu.mail.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획 메일발송 Vo")
public class BidMailSendVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public BidMailSendVo(){
    }

    @ElDtoField(logicalName = "입찰공고번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "정정차수", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "부가세금액", physicalName = "addtax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long addtax_amt;

    @ElDtoField(logicalName = "요청금액합계", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "납품장소명", physicalName = "delvr_plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_nm;

    @ElDtoField(logicalName = "견적서 제출 마감일시", physicalName = "noti_last_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_last_ymd;

    @ElDtoField(logicalName = "공고명", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "계정책임자이메일", physicalName = "accnt_rspns_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_email;

    @ElDtoField(logicalName = "요청자이메일", physicalName = "req_psn_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_psn_email;

    @ElDtoField(logicalName = "담당자이메일", physicalName = "charg_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_email;

    @ElDtoField(logicalName = "담당자", physicalName = "charg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String charg_nm;

    @ElDtoField(logicalName = "배정금액", physicalName = "assign_amount", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long assign_amount;

    @ElDtoField(logicalName = "입찰구분", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "계약방법", physicalName = "contrct_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_method;

    @ElDtoField(logicalName = "낙찰자선정방법", physicalName = "bid_succ_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_method;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "사용자(정)이메일", physicalName = "main_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String main_email;

    @ElDtoField(logicalName = "실사용자이메일", physicalName = "sub_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String sub_email;

    @ElDtoField(logicalName = "발주자 이메일", physicalName = "bid_regst_email", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_regst_email;

    @ElDtoField(logicalName = "발주자이름", physicalName = "bid_regst_email_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_regst_email_nm;

    @ElDtoField(logicalName = "입찰공고번호", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "정정차수(발주)", physicalName = "ord_chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ord_chg_no;

    @ElDtoField(logicalName = "공고일자", physicalName = "noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd;

    @ElDtoField(logicalName = "입찰참가신청서 제출기간 종료일", physicalName = "bid_apply_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_apply_end_ymd;

    @ElDtoField(logicalName = "개찰일시", physicalName = "open_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_ymd;

    @ElDtoField(logicalName = "발주자 전화번호", physicalName = "ext_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ext_no;

    @ElDtoField(logicalName = "메일전송유무", physicalName = "apr_mail_send_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_mail_send_yn;

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "addtax_amt")
    public long getAddtax_amt(){
        return addtax_amt;
    }

    @ElVoField(physicalName = "addtax_amt")
    public void setAddtax_amt(long addtax_amt){
        this.addtax_amt = addtax_amt;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public String getDelvr_plc_nm(){
        return delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public void setDelvr_plc_nm(String delvr_plc_nm){
        this.delvr_plc_nm = delvr_plc_nm;
    }

    @ElVoField(physicalName = "noti_last_ymd")
    public String getNoti_last_ymd(){
        return noti_last_ymd;
    }

    @ElVoField(physicalName = "noti_last_ymd")
    public void setNoti_last_ymd(String noti_last_ymd){
        this.noti_last_ymd = noti_last_ymd;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "accnt_rspns_email")
    public String getAccnt_rspns_email(){
        return accnt_rspns_email;
    }

    @ElVoField(physicalName = "accnt_rspns_email")
    public void setAccnt_rspns_email(String accnt_rspns_email){
        this.accnt_rspns_email = accnt_rspns_email;
    }

    @ElVoField(physicalName = "req_psn_email")
    public String getReq_psn_email(){
        return req_psn_email;
    }

    @ElVoField(physicalName = "req_psn_email")
    public void setReq_psn_email(String req_psn_email){
        this.req_psn_email = req_psn_email;
    }

    @ElVoField(physicalName = "charg_email")
    public String getCharg_email(){
        return charg_email;
    }

    @ElVoField(physicalName = "charg_email")
    public void setCharg_email(String charg_email){
        this.charg_email = charg_email;
    }

    @ElVoField(physicalName = "charg_nm")
    public String getCharg_nm(){
        return charg_nm;
    }

    @ElVoField(physicalName = "charg_nm")
    public void setCharg_nm(String charg_nm){
        this.charg_nm = charg_nm;
    }

    @ElVoField(physicalName = "assign_amount")
    public long getAssign_amount(){
        return assign_amount;
    }

    @ElVoField(physicalName = "assign_amount")
    public void setAssign_amount(long assign_amount){
        this.assign_amount = assign_amount;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "contrct_method")
    public String getContrct_method(){
        return contrct_method;
    }

    @ElVoField(physicalName = "contrct_method")
    public void setContrct_method(String contrct_method){
        this.contrct_method = contrct_method;
    }

    @ElVoField(physicalName = "bid_succ_method")
    public String getBid_succ_method(){
        return bid_succ_method;
    }

    @ElVoField(physicalName = "bid_succ_method")
    public void setBid_succ_method(String bid_succ_method){
        this.bid_succ_method = bid_succ_method;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "main_email")
    public String getMain_email(){
        return main_email;
    }

    @ElVoField(physicalName = "main_email")
    public void setMain_email(String main_email){
        this.main_email = main_email;
    }

    @ElVoField(physicalName = "sub_email")
    public String getSub_email(){
        return sub_email;
    }

    @ElVoField(physicalName = "sub_email")
    public void setSub_email(String sub_email){
        this.sub_email = sub_email;
    }

    @ElVoField(physicalName = "bid_regst_email")
    public String getBid_regst_email(){
        return bid_regst_email;
    }

    @ElVoField(physicalName = "bid_regst_email")
    public void setBid_regst_email(String bid_regst_email){
        this.bid_regst_email = bid_regst_email;
    }

    @ElVoField(physicalName = "bid_regst_email_nm")
    public String getBid_regst_email_nm(){
        return bid_regst_email_nm;
    }

    @ElVoField(physicalName = "bid_regst_email_nm")
    public void setBid_regst_email_nm(String bid_regst_email_nm){
        this.bid_regst_email_nm = bid_regst_email_nm;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public String getOrd_chg_no(){
        return ord_chg_no;
    }

    @ElVoField(physicalName = "ord_chg_no")
    public void setOrd_chg_no(String ord_chg_no){
        this.ord_chg_no = ord_chg_no;
    }

    @ElVoField(physicalName = "noti_ymd")
    public String getNoti_ymd(){
        return noti_ymd;
    }

    @ElVoField(physicalName = "noti_ymd")
    public void setNoti_ymd(String noti_ymd){
        this.noti_ymd = noti_ymd;
    }

    @ElVoField(physicalName = "bid_apply_end_ymd")
    public String getBid_apply_end_ymd(){
        return bid_apply_end_ymd;
    }

    @ElVoField(physicalName = "bid_apply_end_ymd")
    public void setBid_apply_end_ymd(String bid_apply_end_ymd){
        this.bid_apply_end_ymd = bid_apply_end_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public String getOpen_ymd(){
        return open_ymd;
    }

    @ElVoField(physicalName = "open_ymd")
    public void setOpen_ymd(String open_ymd){
        this.open_ymd = open_ymd;
    }

    @ElVoField(physicalName = "ext_no")
    public String getExt_no(){
        return ext_no;
    }

    @ElVoField(physicalName = "ext_no")
    public void setExt_no(String ext_no){
        this.ext_no = ext_no;
    }

    @ElVoField(physicalName = "apr_mail_send_yn")
    public String getApr_mail_send_yn(){
        return apr_mail_send_yn;
    }

    @ElVoField(physicalName = "apr_mail_send_yn")
    public void setApr_mail_send_yn(String apr_mail_send_yn){
        this.apr_mail_send_yn = apr_mail_send_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BidMailSendVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("addtax_amt").append("=").append(addtax_amt).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("delvr_plc_nm").append("=").append(delvr_plc_nm).append(",");
        sb.append("noti_last_ymd").append("=").append(noti_last_ymd).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("accnt_rspns_email").append("=").append(accnt_rspns_email).append(",");
        sb.append("req_psn_email").append("=").append(req_psn_email).append(",");
        sb.append("charg_email").append("=").append(charg_email).append(",");
        sb.append("charg_nm").append("=").append(charg_nm).append(",");
        sb.append("assign_amount").append("=").append(assign_amount).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("contrct_method").append("=").append(contrct_method).append(",");
        sb.append("bid_succ_method").append("=").append(bid_succ_method).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("main_email").append("=").append(main_email).append(",");
        sb.append("sub_email").append("=").append(sub_email).append(",");
        sb.append("bid_regst_email").append("=").append(bid_regst_email).append(",");
        sb.append("bid_regst_email_nm").append("=").append(bid_regst_email_nm).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("ord_chg_no").append("=").append(ord_chg_no).append(",");
        sb.append("noti_ymd").append("=").append(noti_ymd).append(",");
        sb.append("bid_apply_end_ymd").append("=").append(bid_apply_end_ymd).append(",");
        sb.append("open_ymd").append("=").append(open_ymd).append(",");
        sb.append("ext_no").append("=").append(ext_no).append(",");
        sb.append("apr_mail_send_yn").append("=").append(apr_mail_send_yn);
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
