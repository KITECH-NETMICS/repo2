package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획 결재정보 Vo")
public class EpuOrdCheckVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdCheckVo(){
    }

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "개수", physicalName = "cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cnt;

    @ElDtoField(logicalName = "통합발주여부", physicalName = "div_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String div_yn;

    @ElDtoField(logicalName = "공고진행방법", physicalName = "bid_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_clsf_cd;

    @ElDtoField(logicalName = "긴급입찰여부", physicalName = "emer_bid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String emer_bid_yn;

    @ElDtoField(logicalName = "계약방법(1)", physicalName = "contrct_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_method;

    @ElDtoField(logicalName = "계약방법(2)", physicalName = "bid_succ_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_method;

    @ElDtoField(logicalName = "입찰방식", physicalName = "bid_succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_succ_type;

    @ElDtoField(logicalName = "재입찰가능여부", physicalName = "rebid_possible_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rebid_possible_yn;

    @ElDtoField(logicalName = "낙찰방법", physicalName = "succ_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String succ_type;

    @ElDtoField(logicalName = "공동수급협정서 접수 및 구성방식", physicalName = "join_possible_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_possible_yn;

    @ElDtoField(logicalName = "공동수급방법", physicalName = "join_method", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_method;

    @ElDtoField(logicalName = "동가입찰 낙찰자 자동추첨프로그램", physicalName = "same_suc_lot_program_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String same_suc_lot_program_yn;

    @ElDtoField(logicalName = "지역제한", physicalName = "limit_loc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String limit_loc;

    @ElDtoField(logicalName = "지역제한(지사/지점)", physicalName = "tender_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String tender_yn;

    @ElDtoField(logicalName = "업종제한", physicalName = "limit_category", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String limit_category;

    @ElDtoField(logicalName = "물품분류제한여부", physicalName = "item_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_limit_yn;

    @ElDtoField(logicalName = "제조업체로 제한", physicalName = "vend_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_limit_yn;

    @ElDtoField(logicalName = "공동수급체 구성원 지역제한적용여부", physicalName = "join_mem_loc_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String join_mem_loc_limit_yn;

    @ElDtoField(logicalName = "예가방식", physicalName = "multi_esti_pr_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String multi_esti_pr_yn;

    @ElDtoField(logicalName = "PQ심사신청서 접수방식", physicalName = "pq_eval_rcp_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_rcp_type;

    @ElDtoField(logicalName = "PQ심사여부", physicalName = "pq_eval_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pq_eval_yn;

    @ElDtoField(logicalName = "입찰설명회여부", physicalName = "bid_expl_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_expl_yn;

    @ElDtoField(logicalName = "내역입찰여부", physicalName = "his_bid_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String his_bid_yn;

    @ElDtoField(logicalName = "적격심사평가기준", physicalName = "fit_eval_judg", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String fit_eval_judg;

    @ElDtoField(logicalName = "입찰참가제한여부", physicalName = "bid_part_limit_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_part_limit_yn;

    @ElDtoField(logicalName = "부가세포함여부", physicalName = "vat_include_yn", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vat_include_yn;

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

    @ElVoField(physicalName = "cnt")
    public int getCnt(){
        return cnt;
    }

    @ElVoField(physicalName = "cnt")
    public void setCnt(int cnt){
        this.cnt = cnt;
    }

    @ElVoField(physicalName = "div_yn")
    public String getDiv_yn(){
        return div_yn;
    }

    @ElVoField(physicalName = "div_yn")
    public void setDiv_yn(String div_yn){
        this.div_yn = div_yn;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public String getBid_clsf_cd(){
        return bid_clsf_cd;
    }

    @ElVoField(physicalName = "bid_clsf_cd")
    public void setBid_clsf_cd(String bid_clsf_cd){
        this.bid_clsf_cd = bid_clsf_cd;
    }

    @ElVoField(physicalName = "emer_bid_yn")
    public String getEmer_bid_yn(){
        return emer_bid_yn;
    }

    @ElVoField(physicalName = "emer_bid_yn")
    public void setEmer_bid_yn(String emer_bid_yn){
        this.emer_bid_yn = emer_bid_yn;
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

    @ElVoField(physicalName = "bid_succ_type")
    public String getBid_succ_type(){
        return bid_succ_type;
    }

    @ElVoField(physicalName = "bid_succ_type")
    public void setBid_succ_type(String bid_succ_type){
        this.bid_succ_type = bid_succ_type;
    }

    @ElVoField(physicalName = "rebid_possible_yn")
    public String getRebid_possible_yn(){
        return rebid_possible_yn;
    }

    @ElVoField(physicalName = "rebid_possible_yn")
    public void setRebid_possible_yn(String rebid_possible_yn){
        this.rebid_possible_yn = rebid_possible_yn;
    }

    @ElVoField(physicalName = "succ_type")
    public String getSucc_type(){
        return succ_type;
    }

    @ElVoField(physicalName = "succ_type")
    public void setSucc_type(String succ_type){
        this.succ_type = succ_type;
    }

    @ElVoField(physicalName = "join_possible_yn")
    public String getJoin_possible_yn(){
        return join_possible_yn;
    }

    @ElVoField(physicalName = "join_possible_yn")
    public void setJoin_possible_yn(String join_possible_yn){
        this.join_possible_yn = join_possible_yn;
    }

    @ElVoField(physicalName = "join_method")
    public String getJoin_method(){
        return join_method;
    }

    @ElVoField(physicalName = "join_method")
    public void setJoin_method(String join_method){
        this.join_method = join_method;
    }

    @ElVoField(physicalName = "same_suc_lot_program_yn")
    public String getSame_suc_lot_program_yn(){
        return same_suc_lot_program_yn;
    }

    @ElVoField(physicalName = "same_suc_lot_program_yn")
    public void setSame_suc_lot_program_yn(String same_suc_lot_program_yn){
        this.same_suc_lot_program_yn = same_suc_lot_program_yn;
    }

    @ElVoField(physicalName = "limit_loc")
    public String getLimit_loc(){
        return limit_loc;
    }

    @ElVoField(physicalName = "limit_loc")
    public void setLimit_loc(String limit_loc){
        this.limit_loc = limit_loc;
    }

    @ElVoField(physicalName = "tender_yn")
    public String getTender_yn(){
        return tender_yn;
    }

    @ElVoField(physicalName = "tender_yn")
    public void setTender_yn(String tender_yn){
        this.tender_yn = tender_yn;
    }

    @ElVoField(physicalName = "limit_category")
    public String getLimit_category(){
        return limit_category;
    }

    @ElVoField(physicalName = "limit_category")
    public void setLimit_category(String limit_category){
        this.limit_category = limit_category;
    }

    @ElVoField(physicalName = "item_limit_yn")
    public String getItem_limit_yn(){
        return item_limit_yn;
    }

    @ElVoField(physicalName = "item_limit_yn")
    public void setItem_limit_yn(String item_limit_yn){
        this.item_limit_yn = item_limit_yn;
    }

    @ElVoField(physicalName = "vend_limit_yn")
    public String getVend_limit_yn(){
        return vend_limit_yn;
    }

    @ElVoField(physicalName = "vend_limit_yn")
    public void setVend_limit_yn(String vend_limit_yn){
        this.vend_limit_yn = vend_limit_yn;
    }

    @ElVoField(physicalName = "join_mem_loc_limit_yn")
    public String getJoin_mem_loc_limit_yn(){
        return join_mem_loc_limit_yn;
    }

    @ElVoField(physicalName = "join_mem_loc_limit_yn")
    public void setJoin_mem_loc_limit_yn(String join_mem_loc_limit_yn){
        this.join_mem_loc_limit_yn = join_mem_loc_limit_yn;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public String getMulti_esti_pr_yn(){
        return multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "multi_esti_pr_yn")
    public void setMulti_esti_pr_yn(String multi_esti_pr_yn){
        this.multi_esti_pr_yn = multi_esti_pr_yn;
    }

    @ElVoField(physicalName = "pq_eval_rcp_type")
    public String getPq_eval_rcp_type(){
        return pq_eval_rcp_type;
    }

    @ElVoField(physicalName = "pq_eval_rcp_type")
    public void setPq_eval_rcp_type(String pq_eval_rcp_type){
        this.pq_eval_rcp_type = pq_eval_rcp_type;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public String getPq_eval_yn(){
        return pq_eval_yn;
    }

    @ElVoField(physicalName = "pq_eval_yn")
    public void setPq_eval_yn(String pq_eval_yn){
        this.pq_eval_yn = pq_eval_yn;
    }

    @ElVoField(physicalName = "bid_expl_yn")
    public String getBid_expl_yn(){
        return bid_expl_yn;
    }

    @ElVoField(physicalName = "bid_expl_yn")
    public void setBid_expl_yn(String bid_expl_yn){
        this.bid_expl_yn = bid_expl_yn;
    }

    @ElVoField(physicalName = "his_bid_yn")
    public String getHis_bid_yn(){
        return his_bid_yn;
    }

    @ElVoField(physicalName = "his_bid_yn")
    public void setHis_bid_yn(String his_bid_yn){
        this.his_bid_yn = his_bid_yn;
    }

    @ElVoField(physicalName = "fit_eval_judg")
    public String getFit_eval_judg(){
        return fit_eval_judg;
    }

    @ElVoField(physicalName = "fit_eval_judg")
    public void setFit_eval_judg(String fit_eval_judg){
        this.fit_eval_judg = fit_eval_judg;
    }

    @ElVoField(physicalName = "bid_part_limit_yn")
    public String getBid_part_limit_yn(){
        return bid_part_limit_yn;
    }

    @ElVoField(physicalName = "bid_part_limit_yn")
    public void setBid_part_limit_yn(String bid_part_limit_yn){
        this.bid_part_limit_yn = bid_part_limit_yn;
    }

    @ElVoField(physicalName = "vat_include_yn")
    public String getVat_include_yn(){
        return vat_include_yn;
    }

    @ElVoField(physicalName = "vat_include_yn")
    public void setVat_include_yn(String vat_include_yn){
        this.vat_include_yn = vat_include_yn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdCheckVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("cnt").append("=").append(cnt).append(",");
        sb.append("div_yn").append("=").append(div_yn).append(",");
        sb.append("bid_clsf_cd").append("=").append(bid_clsf_cd).append(",");
        sb.append("emer_bid_yn").append("=").append(emer_bid_yn).append(",");
        sb.append("contrct_method").append("=").append(contrct_method).append(",");
        sb.append("bid_succ_method").append("=").append(bid_succ_method).append(",");
        sb.append("bid_succ_type").append("=").append(bid_succ_type).append(",");
        sb.append("rebid_possible_yn").append("=").append(rebid_possible_yn).append(",");
        sb.append("succ_type").append("=").append(succ_type).append(",");
        sb.append("join_possible_yn").append("=").append(join_possible_yn).append(",");
        sb.append("join_method").append("=").append(join_method).append(",");
        sb.append("same_suc_lot_program_yn").append("=").append(same_suc_lot_program_yn).append(",");
        sb.append("limit_loc").append("=").append(limit_loc).append(",");
        sb.append("tender_yn").append("=").append(tender_yn).append(",");
        sb.append("limit_category").append("=").append(limit_category).append(",");
        sb.append("item_limit_yn").append("=").append(item_limit_yn).append(",");
        sb.append("vend_limit_yn").append("=").append(vend_limit_yn).append(",");
        sb.append("join_mem_loc_limit_yn").append("=").append(join_mem_loc_limit_yn).append(",");
        sb.append("multi_esti_pr_yn").append("=").append(multi_esti_pr_yn).append(",");
        sb.append("pq_eval_rcp_type").append("=").append(pq_eval_rcp_type).append(",");
        sb.append("pq_eval_yn").append("=").append(pq_eval_yn).append(",");
        sb.append("bid_expl_yn").append("=").append(bid_expl_yn).append(",");
        sb.append("his_bid_yn").append("=").append(his_bid_yn).append(",");
        sb.append("fit_eval_judg").append("=").append(fit_eval_judg).append(",");
        sb.append("bid_part_limit_yn").append("=").append(bid_part_limit_yn).append(",");
        sb.append("vat_include_yn").append("=").append(vat_include_yn);
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
