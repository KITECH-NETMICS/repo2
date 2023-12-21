package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비용코드Vo")
public class FbaItmExpnsVo extends kr.re.kitech.biz.fin.com.vo.ResBgAcctmVo {
    private static final long serialVersionUID = 1L;

    public FbaItmExpnsVo(){
    }

    @ElDtoField(logicalName = "비목해소기준명", physicalName = "itm_solve_base_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String itm_solve_base_nm;

    @ElDtoField(logicalName = "비용코드명", physicalName = "expns_cd_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expns_cd_nm;

    @ElDtoField(logicalName = "비용코드", physicalName = "expns_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String expns_cd;

    @ElDtoField(logicalName = "회계코드명", physicalName = "accnt_cd_abbr", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_cd_abbr;

    @ElDtoField(logicalName = "회계코드", physicalName = "accnt_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String accnt_cd;

    @ElDtoField(logicalName = "비용코드설명", physicalName = "desc", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String desc;

    @ElDtoField(logicalName = "비목구분", physicalName = "itm_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String itm_clsf;

    @ElDtoField(logicalName = "예산통제방법", physicalName = "bugt_ctrl_way", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bugt_ctrl_way;

    @ElDtoField(logicalName = "예산통제", physicalName = "bugt_ctrl_ex", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String bugt_ctrl_ex;

    @ElDtoField(logicalName = "연구비흡수구분", physicalName = "resch_accnt_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String resch_accnt_clsf;

    @ElVoField(physicalName = "itm_solve_base_nm")
    public String getItm_solve_base_nm(){
        String ret = this.itm_solve_base_nm;
        return ret;
    }

    @ElVoField(physicalName = "itm_solve_base_nm")
    public void setItm_solve_base_nm(String itm_solve_base_nm){
        this.itm_solve_base_nm = itm_solve_base_nm;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public String getExpns_cd_nm(){
        String ret = this.expns_cd_nm;
        return ret;
    }

    @ElVoField(physicalName = "expns_cd_nm")
    public void setExpns_cd_nm(String expns_cd_nm){
        this.expns_cd_nm = expns_cd_nm;
    }

    @ElVoField(physicalName = "expns_cd")
    public String getExpns_cd(){
        String ret = this.expns_cd;
        return ret;
    }

    @ElVoField(physicalName = "expns_cd")
    public void setExpns_cd(String expns_cd){
        this.expns_cd = expns_cd;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public String getAccnt_cd_abbr(){
        String ret = this.accnt_cd_abbr;
        return ret;
    }

    @ElVoField(physicalName = "accnt_cd_abbr")
    public void setAccnt_cd_abbr(String accnt_cd_abbr){
        this.accnt_cd_abbr = accnt_cd_abbr;
    }

    @ElVoField(physicalName = "accnt_cd")
    public String getAccnt_cd(){
        String ret = this.accnt_cd;
        return ret;
    }

    @ElVoField(physicalName = "accnt_cd")
    public void setAccnt_cd(String accnt_cd){
        this.accnt_cd = accnt_cd;
    }

    @ElVoField(physicalName = "desc")
    public String getDesc(){
        String ret = this.desc;
        return ret;
    }

    @ElVoField(physicalName = "desc")
    public void setDesc(String desc){
        this.desc = desc;
    }

    @ElVoField(physicalName = "itm_clsf")
    public String getItm_clsf(){
        String ret = this.itm_clsf;
        return ret;
    }

    @ElVoField(physicalName = "itm_clsf")
    public void setItm_clsf(String itm_clsf){
        this.itm_clsf = itm_clsf;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public String getBugt_ctrl_way(){
        String ret = this.bugt_ctrl_way;
        return ret;
    }

    @ElVoField(physicalName = "bugt_ctrl_way")
    public void setBugt_ctrl_way(String bugt_ctrl_way){
        this.bugt_ctrl_way = bugt_ctrl_way;
    }

    @ElVoField(physicalName = "bugt_ctrl_ex")
    public String getBugt_ctrl_ex(){
        String ret = this.bugt_ctrl_ex;
        return ret;
    }

    @ElVoField(physicalName = "bugt_ctrl_ex")
    public void setBugt_ctrl_ex(String bugt_ctrl_ex){
        this.bugt_ctrl_ex = bugt_ctrl_ex;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public String getResch_accnt_clsf(){
        String ret = this.resch_accnt_clsf;
        return ret;
    }

    @ElVoField(physicalName = "resch_accnt_clsf")
    public void setResch_accnt_clsf(String resch_accnt_clsf){
        this.resch_accnt_clsf = resch_accnt_clsf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FbaItmExpnsVo [");
        sb.append("itm_solve_base_nm").append("=").append(itm_solve_base_nm).append(",");
        sb.append("expns_cd_nm").append("=").append(expns_cd_nm).append(",");
        sb.append("expns_cd").append("=").append(expns_cd).append(",");
        sb.append("accnt_cd_abbr").append("=").append(accnt_cd_abbr).append(",");
        sb.append("accnt_cd").append("=").append(accnt_cd).append(",");
        sb.append("desc").append("=").append(desc).append(",");
        sb.append("itm_clsf").append("=").append(itm_clsf).append(",");
        sb.append("bugt_ctrl_way").append("=").append(bugt_ctrl_way).append(",");
        sb.append("bugt_ctrl_ex").append("=").append(bugt_ctrl_ex).append(",");
        sb.append("resch_accnt_clsf").append("=").append(resch_accnt_clsf);
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
