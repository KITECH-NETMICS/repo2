package kr.re.kitech.biz.epu.req.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "구매첨부서류 유무 Vo")
public class PurAttachCntVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurAttachCntVo(){
    }

    @ElDtoField(logicalName = "사양서", physicalName = "spec_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int spec_cnt;

    @ElDtoField(logicalName = "용도설명서", physicalName = "usg_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int usg_cnt;

    @ElDtoField(logicalName = "견적서", physicalName = "eval_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int eval_cnt;

    @ElDtoField(logicalName = "특정물품(업체)구매사유서", physicalName = "spcfic_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int spcfic_cnt;

    @ElDtoField(logicalName = "시방서", physicalName = "dely_g_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dely_g_cnt;

    @ElDtoField(logicalName = "긴급구매사유서", physicalName = "dely_h_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dely_h_cnt;

    @ElDtoField(logicalName = "사업계획서", physicalName = "dely_j_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dely_j_cnt;

    @ElDtoField(logicalName = "과업지시서", physicalName = "dely_k_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dely_k_cnt;

    @ElDtoField(logicalName = "원가계산서", physicalName = "cost_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int cost_cnt;

    @ElDtoField(logicalName = "계속연차확인서", physicalName = "conti_cnt", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int conti_cnt;

    @ElVoField(physicalName = "spec_cnt")
    public int getSpec_cnt(){
        return spec_cnt;
    }

    @ElVoField(physicalName = "spec_cnt")
    public void setSpec_cnt(int spec_cnt){
        this.spec_cnt = spec_cnt;
    }

    @ElVoField(physicalName = "usg_cnt")
    public int getUsg_cnt(){
        return usg_cnt;
    }

    @ElVoField(physicalName = "usg_cnt")
    public void setUsg_cnt(int usg_cnt){
        this.usg_cnt = usg_cnt;
    }

    @ElVoField(physicalName = "eval_cnt")
    public int getEval_cnt(){
        return eval_cnt;
    }

    @ElVoField(physicalName = "eval_cnt")
    public void setEval_cnt(int eval_cnt){
        this.eval_cnt = eval_cnt;
    }

    @ElVoField(physicalName = "spcfic_cnt")
    public int getSpcfic_cnt(){
        return spcfic_cnt;
    }

    @ElVoField(physicalName = "spcfic_cnt")
    public void setSpcfic_cnt(int spcfic_cnt){
        this.spcfic_cnt = spcfic_cnt;
    }

    @ElVoField(physicalName = "dely_g_cnt")
    public int getDely_g_cnt(){
        return dely_g_cnt;
    }

    @ElVoField(physicalName = "dely_g_cnt")
    public void setDely_g_cnt(int dely_g_cnt){
        this.dely_g_cnt = dely_g_cnt;
    }

    @ElVoField(physicalName = "dely_h_cnt")
    public int getDely_h_cnt(){
        return dely_h_cnt;
    }

    @ElVoField(physicalName = "dely_h_cnt")
    public void setDely_h_cnt(int dely_h_cnt){
        this.dely_h_cnt = dely_h_cnt;
    }

    @ElVoField(physicalName = "dely_j_cnt")
    public int getDely_j_cnt(){
        return dely_j_cnt;
    }

    @ElVoField(physicalName = "dely_j_cnt")
    public void setDely_j_cnt(int dely_j_cnt){
        this.dely_j_cnt = dely_j_cnt;
    }

    @ElVoField(physicalName = "dely_k_cnt")
    public int getDely_k_cnt(){
        return dely_k_cnt;
    }

    @ElVoField(physicalName = "dely_k_cnt")
    public void setDely_k_cnt(int dely_k_cnt){
        this.dely_k_cnt = dely_k_cnt;
    }

    @ElVoField(physicalName = "cost_cnt")
    public int getCost_cnt(){
        return cost_cnt;
    }

    @ElVoField(physicalName = "cost_cnt")
    public void setCost_cnt(int cost_cnt){
        this.cost_cnt = cost_cnt;
    }

    @ElVoField(physicalName = "conti_cnt")
    public int getConti_cnt(){
        return conti_cnt;
    }

    @ElVoField(physicalName = "conti_cnt")
    public void setConti_cnt(int conti_cnt){
        this.conti_cnt = conti_cnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurAttachCntVo [");
        sb.append("spec_cnt").append("=").append(spec_cnt).append(",");
        sb.append("usg_cnt").append("=").append(usg_cnt).append(",");
        sb.append("eval_cnt").append("=").append(eval_cnt).append(",");
        sb.append("spcfic_cnt").append("=").append(spcfic_cnt).append(",");
        sb.append("dely_g_cnt").append("=").append(dely_g_cnt).append(",");
        sb.append("dely_h_cnt").append("=").append(dely_h_cnt).append(",");
        sb.append("dely_j_cnt").append("=").append(dely_j_cnt).append(",");
        sb.append("dely_k_cnt").append("=").append(dely_k_cnt).append(",");
        sb.append("cost_cnt").append("=").append(cost_cnt).append(",");
        sb.append("conti_cnt").append("=").append(conti_cnt);
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
