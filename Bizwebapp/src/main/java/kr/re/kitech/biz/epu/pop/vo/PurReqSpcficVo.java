package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "특정물품구매사유서 Vo")
public class PurReqSpcficVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqSpcficVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "계정번호", physicalName = "accnt_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_no;

    @ElDtoField(logicalName = "특정업체", physicalName = "spcfic_vend", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spcfic_vend;

    @ElDtoField(logicalName = "물품명", physicalName = "gdnm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gdnm;

    @ElDtoField(logicalName = "추정금액", physicalName = "esti_amt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String esti_amt;

    @ElDtoField(logicalName = "비고", physicalName = "rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String rmk;

    @ElDtoField(logicalName = "물품사항", physicalName = "goods_item", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String goods_item;

    @ElDtoField(logicalName = "특정사유", physicalName = "spcfic_cause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spcfic_cause;

    @ElDtoField(logicalName = "관려조항 (항)", physicalName = "contrct_base_clause", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_base_clause;

    @ElDtoField(logicalName = "관려조항 (호)", physicalName = "contrct_base_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String contrct_base_no;

    @ElDtoField(logicalName = "특정구매신청번호", physicalName = "elecapp_docu_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String elecapp_docu_no;

    @ElDtoField(logicalName = "첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "신청일자", physicalName = "req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_ymd;

    @ElDtoField(logicalName = "신청부서", physicalName = "req_dept_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd;

    @ElDtoField(logicalName = "신청부서명", physicalName = "req_dept_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_dept_cd_nm;

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "총금액", physicalName = "req_amt_sum", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long req_amt_sum;

    @ElDtoField(logicalName = "구매구분", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "주사용자명", physicalName = "user_main_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String user_main_nm;

    @ElDtoField(logicalName = "지역본부", physicalName = "region_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String region_cd;

    @ElDtoField(logicalName = "특정구매 결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "특정구매 결재상태명", physicalName = "apr_state_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_nm;

    @ElDtoField(logicalName = "납품요구일", physicalName = "delvr_demnd_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_demnd_daycnt;

    @ElDtoField(logicalName = "특정구매요구일자", physicalName = "spcfic_req_ymd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String spcfic_req_ymd;

    @ElDtoField(logicalName = "구매요구 결재상태", physicalName = "apr_state_2", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state_2;

    @ElDtoField(logicalName = "계정책임자명", physicalName = "accnt_rspns_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String accnt_rspns_nm;

    @ElDtoField(logicalName = "구매요구부서", physicalName = "demand_dept", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String demand_dept;

    @ElDtoField(logicalName = "cud타입", physicalName = "cud_type", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cud_type;

    @ElDtoField(logicalName = "양식함여부", physicalName = "apr_flag", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_flag;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public String getAccnt_no(){
        return accnt_no;
    }

    @ElVoField(physicalName = "accnt_no")
    public void setAccnt_no(String accnt_no){
        this.accnt_no = accnt_no;
    }

    @ElVoField(physicalName = "spcfic_vend")
    public String getSpcfic_vend(){
        return spcfic_vend;
    }

    @ElVoField(physicalName = "spcfic_vend")
    public void setSpcfic_vend(String spcfic_vend){
        this.spcfic_vend = spcfic_vend;
    }

    @ElVoField(physicalName = "gdnm")
    public String getGdnm(){
        return gdnm;
    }

    @ElVoField(physicalName = "gdnm")
    public void setGdnm(String gdnm){
        this.gdnm = gdnm;
    }

    @ElVoField(physicalName = "esti_amt")
    public String getEsti_amt(){
        return esti_amt;
    }

    @ElVoField(physicalName = "esti_amt")
    public void setEsti_amt(String esti_amt){
        this.esti_amt = esti_amt;
    }

    @ElVoField(physicalName = "rmk")
    public String getRmk(){
        return rmk;
    }

    @ElVoField(physicalName = "rmk")
    public void setRmk(String rmk){
        this.rmk = rmk;
    }

    @ElVoField(physicalName = "goods_item")
    public String getGoods_item(){
        return goods_item;
    }

    @ElVoField(physicalName = "goods_item")
    public void setGoods_item(String goods_item){
        this.goods_item = goods_item;
    }

    @ElVoField(physicalName = "spcfic_cause")
    public String getSpcfic_cause(){
        return spcfic_cause;
    }

    @ElVoField(physicalName = "spcfic_cause")
    public void setSpcfic_cause(String spcfic_cause){
        this.spcfic_cause = spcfic_cause;
    }

    @ElVoField(physicalName = "contrct_base_clause")
    public String getContrct_base_clause(){
        return contrct_base_clause;
    }

    @ElVoField(physicalName = "contrct_base_clause")
    public void setContrct_base_clause(String contrct_base_clause){
        this.contrct_base_clause = contrct_base_clause;
    }

    @ElVoField(physicalName = "contrct_base_no")
    public String getContrct_base_no(){
        return contrct_base_no;
    }

    @ElVoField(physicalName = "contrct_base_no")
    public void setContrct_base_no(String contrct_base_no){
        this.contrct_base_no = contrct_base_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public String getElecapp_docu_no(){
        return elecapp_docu_no;
    }

    @ElVoField(physicalName = "elecapp_docu_no")
    public void setElecapp_docu_no(String elecapp_docu_no){
        this.elecapp_docu_no = elecapp_docu_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "req_ymd")
    public String getReq_ymd(){
        return req_ymd;
    }

    @ElVoField(physicalName = "req_ymd")
    public void setReq_ymd(String req_ymd){
        this.req_ymd = req_ymd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public String getReq_dept_cd(){
        return req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd")
    public void setReq_dept_cd(String req_dept_cd){
        this.req_dept_cd = req_dept_cd;
    }

    @ElVoField(physicalName = "req_dept_cd_nm")
    public String getReq_dept_cd_nm(){
        return req_dept_cd_nm;
    }

    @ElVoField(physicalName = "req_dept_cd_nm")
    public void setReq_dept_cd_nm(String req_dept_cd_nm){
        this.req_dept_cd_nm = req_dept_cd_nm;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public long getReq_amt_sum(){
        return req_amt_sum;
    }

    @ElVoField(physicalName = "req_amt_sum")
    public void setReq_amt_sum(long req_amt_sum){
        this.req_amt_sum = req_amt_sum;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "user_main_nm")
    public String getUser_main_nm(){
        return user_main_nm;
    }

    @ElVoField(physicalName = "user_main_nm")
    public void setUser_main_nm(String user_main_nm){
        this.user_main_nm = user_main_nm;
    }

    @ElVoField(physicalName = "region_cd")
    public String getRegion_cd(){
        return region_cd;
    }

    @ElVoField(physicalName = "region_cd")
    public void setRegion_cd(String region_cd){
        this.region_cd = region_cd;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public String getApr_state_nm(){
        return apr_state_nm;
    }

    @ElVoField(physicalName = "apr_state_nm")
    public void setApr_state_nm(String apr_state_nm){
        this.apr_state_nm = apr_state_nm;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public String getDelvr_demnd_daycnt(){
        return delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public void setDelvr_demnd_daycnt(String delvr_demnd_daycnt){
        this.delvr_demnd_daycnt = delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "spcfic_req_ymd")
    public String getSpcfic_req_ymd(){
        return spcfic_req_ymd;
    }

    @ElVoField(physicalName = "spcfic_req_ymd")
    public void setSpcfic_req_ymd(String spcfic_req_ymd){
        this.spcfic_req_ymd = spcfic_req_ymd;
    }

    @ElVoField(physicalName = "apr_state_2")
    public String getApr_state_2(){
        return apr_state_2;
    }

    @ElVoField(physicalName = "apr_state_2")
    public void setApr_state_2(String apr_state_2){
        this.apr_state_2 = apr_state_2;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public String getAccnt_rspns_nm(){
        return accnt_rspns_nm;
    }

    @ElVoField(physicalName = "accnt_rspns_nm")
    public void setAccnt_rspns_nm(String accnt_rspns_nm){
        this.accnt_rspns_nm = accnt_rspns_nm;
    }

    @ElVoField(physicalName = "demand_dept")
    public String getDemand_dept(){
        return demand_dept;
    }

    @ElVoField(physicalName = "demand_dept")
    public void setDemand_dept(String demand_dept){
        this.demand_dept = demand_dept;
    }

    @ElVoField(physicalName = "cud_type")
    public String getCud_type(){
        return cud_type;
    }

    @ElVoField(physicalName = "cud_type")
    public void setCud_type(String cud_type){
        this.cud_type = cud_type;
    }

    @ElVoField(physicalName = "apr_flag")
    public String getApr_flag(){
        return apr_flag;
    }

    @ElVoField(physicalName = "apr_flag")
    public void setApr_flag(String apr_flag){
        this.apr_flag = apr_flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqSpcficVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("accnt_no").append("=").append(accnt_no).append(",");
        sb.append("spcfic_vend").append("=").append(spcfic_vend).append(",");
        sb.append("gdnm").append("=").append(gdnm).append(",");
        sb.append("esti_amt").append("=").append(esti_amt).append(",");
        sb.append("rmk").append("=").append(rmk).append(",");
        sb.append("goods_item").append("=").append(goods_item).append(",");
        sb.append("spcfic_cause").append("=").append(spcfic_cause).append(",");
        sb.append("contrct_base_clause").append("=").append(contrct_base_clause).append(",");
        sb.append("contrct_base_no").append("=").append(contrct_base_no).append(",");
        sb.append("elecapp_docu_no").append("=").append(elecapp_docu_no).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("req_ymd").append("=").append(req_ymd).append(",");
        sb.append("req_dept_cd").append("=").append(req_dept_cd).append(",");
        sb.append("req_dept_cd_nm").append("=").append(req_dept_cd_nm).append(",");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("req_amt_sum").append("=").append(req_amt_sum).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("user_main_nm").append("=").append(user_main_nm).append(",");
        sb.append("region_cd").append("=").append(region_cd).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("apr_state_nm").append("=").append(apr_state_nm).append(",");
        sb.append("delvr_demnd_daycnt").append("=").append(delvr_demnd_daycnt).append(",");
        sb.append("spcfic_req_ymd").append("=").append(spcfic_req_ymd).append(",");
        sb.append("apr_state_2").append("=").append(apr_state_2).append(",");
        sb.append("accnt_rspns_nm").append("=").append(accnt_rspns_nm).append(",");
        sb.append("demand_dept").append("=").append(demand_dept).append(",");
        sb.append("cud_type").append("=").append(cud_type).append(",");
        sb.append("apr_flag").append("=").append(apr_flag);
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
