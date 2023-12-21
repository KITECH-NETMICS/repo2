package kr.re.kitech.biz.pat.exp.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "비용마스터 Vo")
public class PatCostMasterVo extends kr.re.kitech.biz.pat.app.vo.PatComVo {
    private static final long serialVersionUID = 1L;

    public PatCostMasterVo(){
    }

    @ElDtoField(logicalName = "비용 ID", physicalName = "cost_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cost_id;

    @ElDtoField(logicalName = "중간사건 일련번호", physicalName = "oa_sn", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int oa_sn;

    @ElDtoField(logicalName = "신청순번", physicalName = "req_sn", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int req_sn;

    @ElDtoField(logicalName = "비용종류", physicalName = "cost_kind", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cost_kind;

    @ElDtoField(logicalName = "비용분류", physicalName = "cost_clsf", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String cost_clsf;

    @ElDtoField(logicalName = "작성자", physicalName = "wri_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String wri_id;

    @ElDtoField(logicalName = "특허사무소", physicalName = "patofic_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String patofic_cd;

    @ElVoField(physicalName = "cost_id")
    public String getCost_id(){
        return cost_id;
    }

    @ElVoField(physicalName = "cost_id")
    public void setCost_id(String cost_id){
        this.cost_id = cost_id;
    }

    @ElVoField(physicalName = "oa_sn")
    public int getOa_sn(){
        return oa_sn;
    }

    @ElVoField(physicalName = "oa_sn")
    public void setOa_sn(int oa_sn){
        this.oa_sn = oa_sn;
    }

    @ElVoField(physicalName = "req_sn")
    public int getReq_sn(){
        return req_sn;
    }

    @ElVoField(physicalName = "req_sn")
    public void setReq_sn(int req_sn){
        this.req_sn = req_sn;
    }

    @ElVoField(physicalName = "cost_kind")
    public String getCost_kind(){
        return cost_kind;
    }

    @ElVoField(physicalName = "cost_kind")
    public void setCost_kind(String cost_kind){
        this.cost_kind = cost_kind;
    }

    @ElVoField(physicalName = "cost_clsf")
    public String getCost_clsf(){
        return cost_clsf;
    }

    @ElVoField(physicalName = "cost_clsf")
    public void setCost_clsf(String cost_clsf){
        this.cost_clsf = cost_clsf;
    }

    @ElVoField(physicalName = "wri_id")
    public String getWri_id(){
        return wri_id;
    }

    @ElVoField(physicalName = "wri_id")
    public void setWri_id(String wri_id){
        this.wri_id = wri_id;
    }

    @ElVoField(physicalName = "patofic_cd")
    public String getPatofic_cd(){
        return patofic_cd;
    }

    @ElVoField(physicalName = "patofic_cd")
    public void setPatofic_cd(String patofic_cd){
        this.patofic_cd = patofic_cd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PatCostMasterVo [");
        sb.append("cost_id").append("=").append(cost_id).append(",");
        sb.append("oa_sn").append("=").append(oa_sn).append(",");
        sb.append("req_sn").append("=").append(req_sn).append(",");
        sb.append("cost_kind").append("=").append(cost_kind).append(",");
        sb.append("cost_clsf").append("=").append(cost_clsf).append(",");
        sb.append("wri_id").append("=").append(wri_id).append(",");
        sb.append("patofic_cd").append("=").append(patofic_cd);
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
