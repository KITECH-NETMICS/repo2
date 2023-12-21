package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "원가계산서 Vo")
public class PurReqCostVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqCostVo(){
    }

    @ElDtoField(logicalName = "구매요구번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "구분코드", physicalName = "clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String clsf_cd;

    @ElDtoField(logicalName = "공사명", physicalName = "build_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String build_nm;

    @ElDtoField(logicalName = "직접재료비", physicalName = "direct_matrl_un", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long direct_matrl_un;

    @ElDtoField(logicalName = "직접재료비고", physicalName = "direct_matrl_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String direct_matrl_rmk;

    @ElDtoField(logicalName = "직접근로비", physicalName = "direct_work_un", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long direct_work_un;

    @ElDtoField(logicalName = "직접근로비고", physicalName = "direct_work_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String direct_work_rmk;

    @ElDtoField(logicalName = "경비", physicalName = "expns", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long expns;

    @ElDtoField(logicalName = "경비비고", physicalName = "expns_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String expns_rmk;

    @ElDtoField(logicalName = "일반관리비율", physicalName = "gen_mngmt_rts", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gen_mngmt_rts;

    @ElDtoField(logicalName = "일반관리비", physicalName = "gen_mngmt_un_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long gen_mngmt_un_amt;

    @ElDtoField(logicalName = "일반관리비고", physicalName = "gen_mngmt_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String gen_mngmt_rmk;

    @ElDtoField(logicalName = "이윤율", physicalName = "proft_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String proft_rt;

    @ElDtoField(logicalName = "이윤금액", physicalName = "proft_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long proft_amt;

    @ElDtoField(logicalName = "이윤비고", physicalName = "proft_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String proft_rmk;

    @ElDtoField(logicalName = "부가세율", physicalName = "addtax_rt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addtax_rt;

    @ElDtoField(logicalName = "부가세", physicalName = "addtax_amt", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long addtax_amt;

    @ElDtoField(logicalName = "부가세비고", physicalName = "addtax_rmk", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String addtax_rmk;

    @ElDtoField(logicalName = " 첨부파일번호", physicalName = "attach_file_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String attach_file_no;

    @ElDtoField(logicalName = "결재상태", physicalName = "apr_state", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String apr_state;

    @ElDtoField(logicalName = "소계1", physicalName = "amt_sum_1", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long amt_sum_1;

    @ElDtoField(logicalName = "소계2", physicalName = "amt_sum_2", type = "long", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private long amt_sum_2;

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "clsf_cd")
    public String getClsf_cd(){
        return clsf_cd;
    }

    @ElVoField(physicalName = "clsf_cd")
    public void setClsf_cd(String clsf_cd){
        this.clsf_cd = clsf_cd;
    }

    @ElVoField(physicalName = "build_nm")
    public String getBuild_nm(){
        return build_nm;
    }

    @ElVoField(physicalName = "build_nm")
    public void setBuild_nm(String build_nm){
        this.build_nm = build_nm;
    }

    @ElVoField(physicalName = "direct_matrl_un")
    public long getDirect_matrl_un(){
        return direct_matrl_un;
    }

    @ElVoField(physicalName = "direct_matrl_un")
    public void setDirect_matrl_un(long direct_matrl_un){
        this.direct_matrl_un = direct_matrl_un;
    }

    @ElVoField(physicalName = "direct_matrl_rmk")
    public String getDirect_matrl_rmk(){
        return direct_matrl_rmk;
    }

    @ElVoField(physicalName = "direct_matrl_rmk")
    public void setDirect_matrl_rmk(String direct_matrl_rmk){
        this.direct_matrl_rmk = direct_matrl_rmk;
    }

    @ElVoField(physicalName = "direct_work_un")
    public long getDirect_work_un(){
        return direct_work_un;
    }

    @ElVoField(physicalName = "direct_work_un")
    public void setDirect_work_un(long direct_work_un){
        this.direct_work_un = direct_work_un;
    }

    @ElVoField(physicalName = "direct_work_rmk")
    public String getDirect_work_rmk(){
        return direct_work_rmk;
    }

    @ElVoField(physicalName = "direct_work_rmk")
    public void setDirect_work_rmk(String direct_work_rmk){
        this.direct_work_rmk = direct_work_rmk;
    }

    @ElVoField(physicalName = "expns")
    public long getExpns(){
        return expns;
    }

    @ElVoField(physicalName = "expns")
    public void setExpns(long expns){
        this.expns = expns;
    }

    @ElVoField(physicalName = "expns_rmk")
    public String getExpns_rmk(){
        return expns_rmk;
    }

    @ElVoField(physicalName = "expns_rmk")
    public void setExpns_rmk(String expns_rmk){
        this.expns_rmk = expns_rmk;
    }

    @ElVoField(physicalName = "gen_mngmt_rts")
    public String getGen_mngmt_rts(){
        return gen_mngmt_rts;
    }

    @ElVoField(physicalName = "gen_mngmt_rts")
    public void setGen_mngmt_rts(String gen_mngmt_rts){
        this.gen_mngmt_rts = gen_mngmt_rts;
    }

    @ElVoField(physicalName = "gen_mngmt_un_amt")
    public long getGen_mngmt_un_amt(){
        return gen_mngmt_un_amt;
    }

    @ElVoField(physicalName = "gen_mngmt_un_amt")
    public void setGen_mngmt_un_amt(long gen_mngmt_un_amt){
        this.gen_mngmt_un_amt = gen_mngmt_un_amt;
    }

    @ElVoField(physicalName = "gen_mngmt_rmk")
    public String getGen_mngmt_rmk(){
        return gen_mngmt_rmk;
    }

    @ElVoField(physicalName = "gen_mngmt_rmk")
    public void setGen_mngmt_rmk(String gen_mngmt_rmk){
        this.gen_mngmt_rmk = gen_mngmt_rmk;
    }

    @ElVoField(physicalName = "proft_rt")
    public String getProft_rt(){
        return proft_rt;
    }

    @ElVoField(physicalName = "proft_rt")
    public void setProft_rt(String proft_rt){
        this.proft_rt = proft_rt;
    }

    @ElVoField(physicalName = "proft_amt")
    public long getProft_amt(){
        return proft_amt;
    }

    @ElVoField(physicalName = "proft_amt")
    public void setProft_amt(long proft_amt){
        this.proft_amt = proft_amt;
    }

    @ElVoField(physicalName = "proft_rmk")
    public String getProft_rmk(){
        return proft_rmk;
    }

    @ElVoField(physicalName = "proft_rmk")
    public void setProft_rmk(String proft_rmk){
        this.proft_rmk = proft_rmk;
    }

    @ElVoField(physicalName = "addtax_rt")
    public String getAddtax_rt(){
        return addtax_rt;
    }

    @ElVoField(physicalName = "addtax_rt")
    public void setAddtax_rt(String addtax_rt){
        this.addtax_rt = addtax_rt;
    }

    @ElVoField(physicalName = "addtax_amt")
    public long getAddtax_amt(){
        return addtax_amt;
    }

    @ElVoField(physicalName = "addtax_amt")
    public void setAddtax_amt(long addtax_amt){
        this.addtax_amt = addtax_amt;
    }

    @ElVoField(physicalName = "addtax_rmk")
    public String getAddtax_rmk(){
        return addtax_rmk;
    }

    @ElVoField(physicalName = "addtax_rmk")
    public void setAddtax_rmk(String addtax_rmk){
        this.addtax_rmk = addtax_rmk;
    }

    @ElVoField(physicalName = "attach_file_no")
    public String getAttach_file_no(){
        return attach_file_no;
    }

    @ElVoField(physicalName = "attach_file_no")
    public void setAttach_file_no(String attach_file_no){
        this.attach_file_no = attach_file_no;
    }

    @ElVoField(physicalName = "apr_state")
    public String getApr_state(){
        return apr_state;
    }

    @ElVoField(physicalName = "apr_state")
    public void setApr_state(String apr_state){
        this.apr_state = apr_state;
    }

    @ElVoField(physicalName = "amt_sum_1")
    public long getAmt_sum_1(){
        return amt_sum_1;
    }

    @ElVoField(physicalName = "amt_sum_1")
    public void setAmt_sum_1(long amt_sum_1){
        this.amt_sum_1 = amt_sum_1;
    }

    @ElVoField(physicalName = "amt_sum_2")
    public long getAmt_sum_2(){
        return amt_sum_2;
    }

    @ElVoField(physicalName = "amt_sum_2")
    public void setAmt_sum_2(long amt_sum_2){
        this.amt_sum_2 = amt_sum_2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqCostVo [");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("clsf_cd").append("=").append(clsf_cd).append(",");
        sb.append("build_nm").append("=").append(build_nm).append(",");
        sb.append("direct_matrl_un").append("=").append(direct_matrl_un).append(",");
        sb.append("direct_matrl_rmk").append("=").append(direct_matrl_rmk).append(",");
        sb.append("direct_work_un").append("=").append(direct_work_un).append(",");
        sb.append("direct_work_rmk").append("=").append(direct_work_rmk).append(",");
        sb.append("expns").append("=").append(expns).append(",");
        sb.append("expns_rmk").append("=").append(expns_rmk).append(",");
        sb.append("gen_mngmt_rts").append("=").append(gen_mngmt_rts).append(",");
        sb.append("gen_mngmt_un_amt").append("=").append(gen_mngmt_un_amt).append(",");
        sb.append("gen_mngmt_rmk").append("=").append(gen_mngmt_rmk).append(",");
        sb.append("proft_rt").append("=").append(proft_rt).append(",");
        sb.append("proft_amt").append("=").append(proft_amt).append(",");
        sb.append("proft_rmk").append("=").append(proft_rmk).append(",");
        sb.append("addtax_rt").append("=").append(addtax_rt).append(",");
        sb.append("addtax_amt").append("=").append(addtax_amt).append(",");
        sb.append("addtax_rmk").append("=").append(addtax_rmk).append(",");
        sb.append("attach_file_no").append("=").append(attach_file_no).append(",");
        sb.append("apr_state").append("=").append(apr_state).append(",");
        sb.append("amt_sum_1").append("=").append(amt_sum_1).append(",");
        sb.append("amt_sum_2").append("=").append(amt_sum_2);
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
