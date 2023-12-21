package kr.re.kitech.biz.api.server.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "인사평가Vo")
public class ApiEipHumEvalVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public ApiEipHumEvalVo(){
    }

    @ElDtoField(logicalName = "eval_yr", physicalName = "eval_yr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_yr;

    @ElDtoField(logicalName = "adjst_fact_persn_eval", physicalName = "adjst_fact_persn_eval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fact_persn_eval;

    @ElDtoField(logicalName = "adjst_fact_quttt_eval", physicalName = "adjst_fact_quttt_eval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fact_quttt_eval;

    @ElDtoField(logicalName = "adjst_fact_qulit_eval", physicalName = "adjst_fact_qulit_eval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fact_qulit_eval;

    @ElDtoField(logicalName = "adjst_fact_actrslt_eval", physicalName = "adjst_fact_actrslt_eval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fact_actrslt_eval;

    @ElDtoField(logicalName = "adjst_fact_team_eval", physicalName = "adjst_fact_team_eval", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_fact_team_eval;

    @ElDtoField(logicalName = "adjst_aftr_overl_score", physicalName = "adjst_aftr_overl_score", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String adjst_aftr_overl_score;

    @ElDtoField(logicalName = "overl_score_grd", physicalName = "overl_score_grd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String overl_score_grd;

    @ElDtoField(logicalName = "syspayno", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "eval_objct_grp", physicalName = "eval_objct_grp", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String eval_objct_grp;

    @ElVoField(physicalName = "eval_yr")
    public String getEval_yr(){
        return eval_yr;
    }

    @ElVoField(physicalName = "eval_yr")
    public void setEval_yr(String eval_yr){
        this.eval_yr = eval_yr;
    }

    @ElVoField(physicalName = "adjst_fact_persn_eval")
    public String getAdjst_fact_persn_eval(){
        return adjst_fact_persn_eval;
    }

    @ElVoField(physicalName = "adjst_fact_persn_eval")
    public void setAdjst_fact_persn_eval(String adjst_fact_persn_eval){
        this.adjst_fact_persn_eval = adjst_fact_persn_eval;
    }

    @ElVoField(physicalName = "adjst_fact_quttt_eval")
    public String getAdjst_fact_quttt_eval(){
        return adjst_fact_quttt_eval;
    }

    @ElVoField(physicalName = "adjst_fact_quttt_eval")
    public void setAdjst_fact_quttt_eval(String adjst_fact_quttt_eval){
        this.adjst_fact_quttt_eval = adjst_fact_quttt_eval;
    }

    @ElVoField(physicalName = "adjst_fact_qulit_eval")
    public String getAdjst_fact_qulit_eval(){
        return adjst_fact_qulit_eval;
    }

    @ElVoField(physicalName = "adjst_fact_qulit_eval")
    public void setAdjst_fact_qulit_eval(String adjst_fact_qulit_eval){
        this.adjst_fact_qulit_eval = adjst_fact_qulit_eval;
    }

    @ElVoField(physicalName = "adjst_fact_actrslt_eval")
    public String getAdjst_fact_actrslt_eval(){
        return adjst_fact_actrslt_eval;
    }

    @ElVoField(physicalName = "adjst_fact_actrslt_eval")
    public void setAdjst_fact_actrslt_eval(String adjst_fact_actrslt_eval){
        this.adjst_fact_actrslt_eval = adjst_fact_actrslt_eval;
    }

    @ElVoField(physicalName = "adjst_fact_team_eval")
    public String getAdjst_fact_team_eval(){
        return adjst_fact_team_eval;
    }

    @ElVoField(physicalName = "adjst_fact_team_eval")
    public void setAdjst_fact_team_eval(String adjst_fact_team_eval){
        this.adjst_fact_team_eval = adjst_fact_team_eval;
    }

    @ElVoField(physicalName = "adjst_aftr_overl_score")
    public String getAdjst_aftr_overl_score(){
        return adjst_aftr_overl_score;
    }

    @ElVoField(physicalName = "adjst_aftr_overl_score")
    public void setAdjst_aftr_overl_score(String adjst_aftr_overl_score){
        this.adjst_aftr_overl_score = adjst_aftr_overl_score;
    }

    @ElVoField(physicalName = "overl_score_grd")
    public String getOverl_score_grd(){
        return overl_score_grd;
    }

    @ElVoField(physicalName = "overl_score_grd")
    public void setOverl_score_grd(String overl_score_grd){
        this.overl_score_grd = overl_score_grd;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "eval_objct_grp")
    public String getEval_objct_grp(){
        return eval_objct_grp;
    }

    @ElVoField(physicalName = "eval_objct_grp")
    public void setEval_objct_grp(String eval_objct_grp){
        this.eval_objct_grp = eval_objct_grp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiEipHumEvalVo [");
        sb.append("eval_yr").append("=").append(eval_yr).append(",");
        sb.append("adjst_fact_persn_eval").append("=").append(adjst_fact_persn_eval).append(",");
        sb.append("adjst_fact_quttt_eval").append("=").append(adjst_fact_quttt_eval).append(",");
        sb.append("adjst_fact_qulit_eval").append("=").append(adjst_fact_qulit_eval).append(",");
        sb.append("adjst_fact_actrslt_eval").append("=").append(adjst_fact_actrslt_eval).append(",");
        sb.append("adjst_fact_team_eval").append("=").append(adjst_fact_team_eval).append(",");
        sb.append("adjst_aftr_overl_score").append("=").append(adjst_aftr_overl_score).append(",");
        sb.append("overl_score_grd").append("=").append(overl_score_grd).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("eval_objct_grp").append("=").append(eval_objct_grp);
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
