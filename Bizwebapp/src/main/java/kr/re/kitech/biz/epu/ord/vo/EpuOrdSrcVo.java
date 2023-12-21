package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획 조회 Vo")
public class EpuOrdSrcVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdSrcVo(){
    }

    @ElDtoField(logicalName = "공고일자(시작)", physicalName = "noti_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd_st;

    @ElDtoField(logicalName = "공고일자(종료)", physicalName = "noti_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd_ed;

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "공고명", physicalName = "bid_title", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_title;

    @ElDtoField(logicalName = "신청일자(시작)", physicalName = "req_ymd_st", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_st;

    @ElDtoField(logicalName = "신청일자(종료)", physicalName = "req_ymd_ed", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd_ed;

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "발주계획작성자", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "소액수의(견적요청)여부", physicalName = "prvt_contrct_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String prvt_contrct_yn;

    @ElVoField(physicalName = "noti_ymd_st")
    public String getNoti_ymd_st(){
        return noti_ymd_st;
    }

    @ElVoField(physicalName = "noti_ymd_st")
    public void setNoti_ymd_st(String noti_ymd_st){
        this.noti_ymd_st = noti_ymd_st;
    }

    @ElVoField(physicalName = "noti_ymd_ed")
    public String getNoti_ymd_ed(){
        return noti_ymd_ed;
    }

    @ElVoField(physicalName = "noti_ymd_ed")
    public void setNoti_ymd_ed(String noti_ymd_ed){
        this.noti_ymd_ed = noti_ymd_ed;
    }

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

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "bid_title")
    public String getBid_title(){
        return bid_title;
    }

    @ElVoField(physicalName = "bid_title")
    public void setBid_title(String bid_title){
        this.bid_title = bid_title;
    }

    @ElVoField(physicalName = "req_ymd_st")
    public String getReq_ymd_st(){
        return req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_st")
    public void setReq_ymd_st(String req_ymd_st){
        this.req_ymd_st = req_ymd_st;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public String getReq_ymd_ed(){
        return req_ymd_ed;
    }

    @ElVoField(physicalName = "req_ymd_ed")
    public void setReq_ymd_ed(String req_ymd_ed){
        this.req_ymd_ed = req_ymd_ed;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "prvt_contrct_yn")
    public String getPrvt_contrct_yn(){
        return prvt_contrct_yn;
    }

    @ElVoField(physicalName = "prvt_contrct_yn")
    public void setPrvt_contrct_yn(String prvt_contrct_yn){
        this.prvt_contrct_yn = prvt_contrct_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdSrcVo [");
        sb.append("noti_ymd_st").append("=").append(noti_ymd_st).append(",");
        sb.append("noti_ymd_ed").append("=").append(noti_ymd_ed).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("bid_title").append("=").append(bid_title).append(",");
        sb.append("req_ymd_st").append("=").append(req_ymd_st).append(",");
        sb.append("req_ymd_ed").append("=").append(req_ymd_ed).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("prvt_contrct_yn").append("=").append(prvt_contrct_yn);
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
