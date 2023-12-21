package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매요구조달진행상태Vo")
public class PurReqProgrsVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqProgrsVo(){
    }

    @ElDtoField(logicalName = "계정책임자", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "구매요구일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "구매요구자", physicalName = "user_sub_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_sub_nm;

    @ElDtoField(logicalName = "내외자", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_grp_cd;

    @ElDtoField(logicalName = "품명", physicalName = "krchar_gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String krchar_gdnm;

    @ElDtoField(logicalName = "PQ심사 여부", physicalName = "pq_eval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_yn;

    @ElDtoField(logicalName = "자산등재여부", physicalName = "asset_reg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String asset_reg;

    @ElDtoField(logicalName = "계약형태", physicalName = "contract_type_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contract_type_nm;

    @ElDtoField(logicalName = "noti_status", physicalName = "noti_status", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_status;

    @ElDtoField(logicalName = "입찰방식", physicalName = "bid_succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_type;

    @ElDtoField(logicalName = "계약방법", physicalName = "contrct_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_method;

    @ElDtoField(logicalName = "낙찰방법", physicalName = "succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_type;

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "공고일자", physicalName = "noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_ymd;

    @ElDtoField(logicalName = "발주담당자", physicalName = "bid_reg_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_reg_nm;

    @ElDtoField(logicalName = "공고진행방법", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "입찰공고번호", physicalName = "bid_noti_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_no;

    @ElDtoField(logicalName = "입찰공고일자", physicalName = "bid_noti_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_noti_ymd;

    @ElDtoField(logicalName = "공고마감일자", physicalName = "bid_end_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_end_ymd;

    @ElDtoField(logicalName = "입찰공고담당자", physicalName = "noti_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String noti_chgr;

    @ElDtoField(logicalName = "PQ심사 평가담당자", physicalName = "pq_chgr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_chgr_nm;

    @ElDtoField(logicalName = "규격심사/제안심사 평가담당자", physicalName = "eval_chgr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_chgr_nm;

    @ElDtoField(logicalName = "예가 종류", physicalName = "multi_esti_pr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String multi_esti_pr_yn;

    @ElDtoField(logicalName = "온라인여부", physicalName = "esti_online_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String esti_online_yn;

    @ElDtoField(logicalName = "예가담당자", physicalName = "esti_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String esti_chgr;

    @ElDtoField(logicalName = "open_yn", physicalName = "open_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String open_yn;

    @ElDtoField(logicalName = "cancel_reason", physicalName = "cancel_reason", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cancel_reason;

    @ElDtoField(logicalName = "적격심사 평가담당자", physicalName = "qual_chgr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String qual_chgr_nm;

    @ElDtoField(logicalName = "기술협상 협상담당자", physicalName = "nego_chgr_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String nego_chgr_nm;

    @ElDtoField(logicalName = "낙찰자선정", physicalName = "succ_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_chgr;

    @ElDtoField(logicalName = "투찰금액", physicalName = "bid_val", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_val;

    @ElDtoField(logicalName = "낙찰업체", physicalName = "vend_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_nm;

    @ElDtoField(logicalName = "contrct_no", physicalName = "contrct_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_no;

    @ElDtoField(logicalName = "계약담당자", physicalName = "con_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String con_chgr;

    @ElDtoField(logicalName = "계약일자", physicalName = "contrct_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_ymd;

    @ElDtoField(logicalName = "검수요청번호", physicalName = "checkup_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String checkup_req_no;

    @ElDtoField(logicalName = "검수자", physicalName = "chk_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk_chgr;

    @ElDtoField(logicalName = "검수일자", physicalName = "chk_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chk_ymd;

    @ElDtoField(logicalName = "준공요청번호", physicalName = "complete_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String complete_req_no;

    @ElDtoField(logicalName = "감독관", physicalName = "comp_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_chgr;

    @ElDtoField(logicalName = "준공일자", physicalName = "comp_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String comp_ymd;

    @ElDtoField(logicalName = "자산등재자", physicalName = "ass_chgr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ass_chgr;

    @ElDtoField(logicalName = "자산등재일자", physicalName = "ass_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String ass_ymd;

    @ElDtoField(logicalName = "지급신청번호", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "비용구분", physicalName = "expns_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_clsf;

    @ElDtoField(logicalName = "지급신청일자", physicalName = "pay_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pay_req_ymd;

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public String getUser_sub_nm(){
        return user_sub_nm;
    }

    @ElVoField(physicalName = "user_sub_nm")
    public void setUser_sub_nm(String user_sub_nm){
        this.user_sub_nm = user_sub_nm;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public String getPur_grp_cd(){
        return pur_grp_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public void setPur_grp_cd(String pur_grp_cd){
        this.pur_grp_cd = pur_grp_cd;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public String getKrchar_gdnm(){
        return krchar_gdnm;
    }

    @ElVoField(physicalName = "krchar_gdnm")
    public void setKrchar_gdnm(String krchar_gdnm){
        this.krchar_gdnm = krchar_gdnm;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public String getPq_eval_yn(){
        return pq_eval_yn;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public void setPq_eval_yn(String pq_eval_yn){
        this.pq_eval_yn = pq_eval_yn;
    }

    @ElVoField(physicalName = "asset_reg")
    public String getAsset_reg(){
        return asset_reg;
    }

    @ElVoField(physicalName = "asset_reg")
    public void setAsset_reg(String asset_reg){
        this.asset_reg = asset_reg;
    }

    @ElVoField(physicalName = "contract_type_nm")
    public String getContract_type_nm(){
        return contract_type_nm;
    }

    @ElVoField(physicalName = "contract_type_nm")
    public void setContract_type_nm(String contract_type_nm){
        this.contract_type_nm = contract_type_nm;
    }

    @ElVoField(physicalName = "noti_status")
    public String getNoti_status(){
        return noti_status;
    }

    @ElVoField(physicalName = "noti_status")
    public void setNoti_status(String noti_status){
        this.noti_status = noti_status;
    }

    @ElVoField(physicalName = "bid_succ_type")
    public String getBid_succ_type(){
        return bid_succ_type;
    }

    @ElVoField(physicalName = "bid_succ_type")
    public void setBid_succ_type(String bid_succ_type){
        this.bid_succ_type = bid_succ_type;
    }

    @ElVoField(physicalName = "contrct_method")
    public String getContrct_method(){
        return contrct_method;
    }

    @ElVoField(physicalName = "contrct_method")
    public void setContrct_method(String contrct_method){
        this.contrct_method = contrct_method;
    }

    @ElVoField(physicalName = "succ_type")
    public String getSucc_type(){
        return succ_type;
    }

    @ElVoField(physicalName = "succ_type")
    public void setSucc_type(String succ_type){
        this.succ_type = succ_type;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public String getBid_ord_no(){
        return bid_ord_no;
    }

    @ElVoField(physicalName = "bid_ord_no")
    public void setBid_ord_no(String bid_ord_no){
        this.bid_ord_no = bid_ord_no;
    }

    @ElVoField(physicalName = "noti_ymd")
    public String getNoti_ymd(){
        return noti_ymd;
    }

    @ElVoField(physicalName = "noti_ymd")
    public void setNoti_ymd(String noti_ymd){
        this.noti_ymd = noti_ymd;
    }

    @ElVoField(physicalName = "bid_reg_nm")
    public String getBid_reg_nm(){
        return bid_reg_nm;
    }

    @ElVoField(physicalName = "bid_reg_nm")
    public void setBid_reg_nm(String bid_reg_nm){
        this.bid_reg_nm = bid_reg_nm;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public String getBid_noti_no(){
        return bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_no")
    public void setBid_noti_no(String bid_noti_no){
        this.bid_noti_no = bid_noti_no;
    }

    @ElVoField(physicalName = "bid_noti_ymd")
    public String getBid_noti_ymd(){
        return bid_noti_ymd;
    }

    @ElVoField(physicalName = "bid_noti_ymd")
    public void setBid_noti_ymd(String bid_noti_ymd){
        this.bid_noti_ymd = bid_noti_ymd;
    }

    @ElVoField(physicalName = "bid_end_ymd")
    public String getBid_end_ymd(){
        return bid_end_ymd;
    }

    @ElVoField(physicalName = "bid_end_ymd")
    public void setBid_end_ymd(String bid_end_ymd){
        this.bid_end_ymd = bid_end_ymd;
    }

    @ElVoField(physicalName = "noti_chgr")
    public String getNoti_chgr(){
        return noti_chgr;
    }

    @ElVoField(physicalName = "noti_chgr")
    public void setNoti_chgr(String noti_chgr){
        this.noti_chgr = noti_chgr;
    }

    @ElVoField(physicalName = "pq_chgr_nm")
    public String getPq_chgr_nm(){
        return pq_chgr_nm;
    }

    @ElVoField(physicalName = "pq_chgr_nm")
    public void setPq_chgr_nm(String pq_chgr_nm){
        this.pq_chgr_nm = pq_chgr_nm;
    }

    @ElVoField(physicalName = "eval_chgr_nm")
    public String getEval_chgr_nm(){
        return eval_chgr_nm;
    }

    @ElVoField(physicalName = "eval_chgr_nm")
    public void setEval_chgr_nm(String eval_chgr_nm){
        this.eval_chgr_nm = eval_chgr_nm;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public String getMulti_esti_pr_yn(){
        return multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public void setMulti_esti_pr_yn(String multi_esti_pr_yn){
        this.multi_esti_pr_yn = multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "esti_online_yn")
    public String getEsti_online_yn(){
        return esti_online_yn;
    }

    @ElVoField(physicalName = "esti_online_yn")
    public void setEsti_online_yn(String esti_online_yn){
        this.esti_online_yn = esti_online_yn;
    }

    @ElVoField(physicalName = "esti_chgr")
    public String getEsti_chgr(){
        return esti_chgr;
    }

    @ElVoField(physicalName = "esti_chgr")
    public void setEsti_chgr(String esti_chgr){
        this.esti_chgr = esti_chgr;
    }

    @ElVoField(physicalName = "open_yn")
    public String getOpen_yn(){
        return open_yn;
    }

    @ElVoField(physicalName = "open_yn")
    public void setOpen_yn(String open_yn){
        this.open_yn = open_yn;
    }

    @ElVoField(physicalName = "cancel_reason")
    public String getCancel_reason(){
        return cancel_reason;
    }

    @ElVoField(physicalName = "cancel_reason")
    public void setCancel_reason(String cancel_reason){
        this.cancel_reason = cancel_reason;
    }

    @ElVoField(physicalName = "qual_chgr_nm")
    public String getQual_chgr_nm(){
        return qual_chgr_nm;
    }

    @ElVoField(physicalName = "qual_chgr_nm")
    public void setQual_chgr_nm(String qual_chgr_nm){
        this.qual_chgr_nm = qual_chgr_nm;
    }

    @ElVoField(physicalName = "nego_chgr_nm")
    public String getNego_chgr_nm(){
        return nego_chgr_nm;
    }

    @ElVoField(physicalName = "nego_chgr_nm")
    public void setNego_chgr_nm(String nego_chgr_nm){
        this.nego_chgr_nm = nego_chgr_nm;
    }

    @ElVoField(physicalName = "succ_chgr")
    public String getSucc_chgr(){
        return succ_chgr;
    }

    @ElVoField(physicalName = "succ_chgr")
    public void setSucc_chgr(String succ_chgr){
        this.succ_chgr = succ_chgr;
    }

    @ElVoField(physicalName = "bid_val")
    public String getBid_val(){
        return bid_val;
    }

    @ElVoField(physicalName = "bid_val")
    public void setBid_val(String bid_val){
        this.bid_val = bid_val;
    }

    @ElVoField(physicalName = "vend_nm")
    public String getVend_nm(){
        return vend_nm;
    }

    @ElVoField(physicalName = "vend_nm")
    public void setVend_nm(String vend_nm){
        this.vend_nm = vend_nm;
    }

    @ElVoField(physicalName = "contrct_no")
    public String getContrct_no(){
        return contrct_no;
    }

    @ElVoField(physicalName = "contrct_no")
    public void setContrct_no(String contrct_no){
        this.contrct_no = contrct_no;
    }

    @ElVoField(physicalName = "con_chgr")
    public String getCon_chgr(){
        return con_chgr;
    }

    @ElVoField(physicalName = "con_chgr")
    public void setCon_chgr(String con_chgr){
        this.con_chgr = con_chgr;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public String getContrct_ymd(){
        return contrct_ymd;
    }

    @ElVoField(physicalName = "contrct_ymd")
    public void setContrct_ymd(String contrct_ymd){
        this.contrct_ymd = contrct_ymd;
    }

    @ElVoField(physicalName = "checkup_req_no")
    public String getCheckup_req_no(){
        return checkup_req_no;
    }

    @ElVoField(physicalName = "checkup_req_no")
    public void setCheckup_req_no(String checkup_req_no){
        this.checkup_req_no = checkup_req_no;
    }

    @ElVoField(physicalName = "chk_chgr")
    public String getChk_chgr(){
        return chk_chgr;
    }

    @ElVoField(physicalName = "chk_chgr")
    public void setChk_chgr(String chk_chgr){
        this.chk_chgr = chk_chgr;
    }

    @ElVoField(physicalName = "chk_ymd")
    public String getChk_ymd(){
        return chk_ymd;
    }

    @ElVoField(physicalName = "chk_ymd")
    public void setChk_ymd(String chk_ymd){
        this.chk_ymd = chk_ymd;
    }

    @ElVoField(physicalName = "complete_req_no")
    public String getComplete_req_no(){
        return complete_req_no;
    }

    @ElVoField(physicalName = "complete_req_no")
    public void setComplete_req_no(String complete_req_no){
        this.complete_req_no = complete_req_no;
    }

    @ElVoField(physicalName = "comp_chgr")
    public String getComp_chgr(){
        return comp_chgr;
    }

    @ElVoField(physicalName = "comp_chgr")
    public void setComp_chgr(String comp_chgr){
        this.comp_chgr = comp_chgr;
    }

    @ElVoField(physicalName = "comp_ymd")
    public String getComp_ymd(){
        return comp_ymd;
    }

    @ElVoField(physicalName = "comp_ymd")
    public void setComp_ymd(String comp_ymd){
        this.comp_ymd = comp_ymd;
    }

    @ElVoField(physicalName = "ass_chgr")
    public String getAss_chgr(){
        return ass_chgr;
    }

    @ElVoField(physicalName = "ass_chgr")
    public void setAss_chgr(String ass_chgr){
        this.ass_chgr = ass_chgr;
    }

    @ElVoField(physicalName = "ass_ymd")
    public String getAss_ymd(){
        return ass_ymd;
    }

    @ElVoField(physicalName = "ass_ymd")
    public void setAss_ymd(String ass_ymd){
        this.ass_ymd = ass_ymd;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "expns_clsf")
    public String getExpns_clsf(){
        return expns_clsf;
    }

    @ElVoField(physicalName = "expns_clsf")
    public void setExpns_clsf(String expns_clsf){
        this.expns_clsf = expns_clsf;
    }

    @ElVoField(physicalName = "pay_req_ymd")
    public String getPay_req_ymd(){
        return pay_req_ymd;
    }

    @ElVoField(physicalName = "pay_req_ymd")
    public void setPay_req_ymd(String pay_req_ymd){
        this.pay_req_ymd = pay_req_ymd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqProgrsVo [");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("user_sub_nm").append("=").append(user_sub_nm).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_grp_cd").append("=").append(pur_grp_cd).append(",");
        sb.append("krchar_gdnm").append("=").append(krchar_gdnm).append(",");
        sb.append("pq_eval_yn").append("=").append(pq_eval_yn).append(",");
        sb.append("asset_reg").append("=").append(asset_reg).append(",");
        sb.append("contract_type_nm").append("=").append(contract_type_nm).append(",");
        sb.append("noti_status").append("=").append(noti_status).append(",");
        sb.append("bid_succ_type").append("=").append(bid_succ_type).append(",");
        sb.append("contrct_method").append("=").append(contrct_method).append(",");
        sb.append("succ_type").append("=").append(succ_type).append(",");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("noti_ymd").append("=").append(noti_ymd).append(",");
        sb.append("bid_reg_nm").append("=").append(bid_reg_nm).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("bid_noti_no").append("=").append(bid_noti_no).append(",");
        sb.append("bid_noti_ymd").append("=").append(bid_noti_ymd).append(",");
        sb.append("bid_end_ymd").append("=").append(bid_end_ymd).append(",");
        sb.append("noti_chgr").append("=").append(noti_chgr).append(",");
        sb.append("pq_chgr_nm").append("=").append(pq_chgr_nm).append(",");
        sb.append("eval_chgr_nm").append("=").append(eval_chgr_nm).append(",");
        sb.append("multi_esti_pr_yn").append("=").append(multi_esti_pr_yn).append(",");
        sb.append("esti_online_yn").append("=").append(esti_online_yn).append(",");
        sb.append("esti_chgr").append("=").append(esti_chgr).append(",");
        sb.append("open_yn").append("=").append(open_yn).append(",");
        sb.append("cancel_reason").append("=").append(cancel_reason).append(",");
        sb.append("qual_chgr_nm").append("=").append(qual_chgr_nm).append(",");
        sb.append("nego_chgr_nm").append("=").append(nego_chgr_nm).append(",");
        sb.append("succ_chgr").append("=").append(succ_chgr).append(",");
        sb.append("bid_val").append("=").append(bid_val).append(",");
        sb.append("vend_nm").append("=").append(vend_nm).append(",");
        sb.append("contrct_no").append("=").append(contrct_no).append(",");
        sb.append("con_chgr").append("=").append(con_chgr).append(",");
        sb.append("contrct_ymd").append("=").append(contrct_ymd).append(",");
        sb.append("checkup_req_no").append("=").append(checkup_req_no).append(",");
        sb.append("chk_chgr").append("=").append(chk_chgr).append(",");
        sb.append("chk_ymd").append("=").append(chk_ymd).append(",");
        sb.append("complete_req_no").append("=").append(complete_req_no).append(",");
        sb.append("comp_chgr").append("=").append(comp_chgr).append(",");
        sb.append("comp_ymd").append("=").append(comp_ymd).append(",");
        sb.append("ass_chgr").append("=").append(ass_chgr).append(",");
        sb.append("ass_ymd").append("=").append(ass_ymd).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("expns_clsf").append("=").append(expns_clsf).append(",");
        sb.append("pay_req_ymd").append("=").append(pay_req_ymd);
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
