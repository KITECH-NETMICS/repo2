package kr.re.kitech.biz.epu.pop.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획 품목내역팝업 구매요구리스트Vo")
public class PurReqItemVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public PurReqItemVo(){
    }

    @ElDtoField(logicalName = "내외자구분", physicalName = "inout_psn_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String inout_psn_clsf_cd;

    @ElDtoField(logicalName = "구매번호", physicalName = "pur_req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_req_no;

    @ElDtoField(logicalName = "품명", physicalName = "item_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String item_nm;

    @ElDtoField(logicalName = "납품장소", physicalName = "delvr_plc_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_plc_nm;

    @ElDtoField(logicalName = "납품기간", physicalName = "delvr_demnd_daycnt", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String delvr_demnd_daycnt;

    @ElDtoField(logicalName = "구매구분2", physicalName = "pur_clsf_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_clsf_cd;

    @ElDtoField(logicalName = "구매구분1", physicalName = "pur_grp_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String pur_grp_cd;

    @ElDtoField(logicalName = "구매요구상태", physicalName = "state_text", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String state_text;

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public String getInout_psn_clsf_cd(){
        return inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "inout_psn_clsf_cd")
    public void setInout_psn_clsf_cd(String inout_psn_clsf_cd){
        this.inout_psn_clsf_cd = inout_psn_clsf_cd;
    }

    @ElVoField(physicalName = "pur_req_no")
    public String getPur_req_no(){
        return pur_req_no;
    }

    @ElVoField(physicalName = "pur_req_no")
    public void setPur_req_no(String pur_req_no){
        this.pur_req_no = pur_req_no;
    }

    @ElVoField(physicalName = "item_nm")
    public String getItem_nm(){
        return item_nm;
    }

    @ElVoField(physicalName = "item_nm")
    public void setItem_nm(String item_nm){
        this.item_nm = item_nm;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public String getDelvr_plc_nm(){
        return delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_plc_nm")
    public void setDelvr_plc_nm(String delvr_plc_nm){
        this.delvr_plc_nm = delvr_plc_nm;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public String getDelvr_demnd_daycnt(){
        return delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "delvr_demnd_daycnt")
    public void setDelvr_demnd_daycnt(String delvr_demnd_daycnt){
        this.delvr_demnd_daycnt = delvr_demnd_daycnt;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public String getPur_clsf_cd(){
        return pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_clsf_cd")
    public void setPur_clsf_cd(String pur_clsf_cd){
        this.pur_clsf_cd = pur_clsf_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public String getPur_grp_cd(){
        return pur_grp_cd;
    }

    @ElVoField(physicalName = "pur_grp_cd")
    public void setPur_grp_cd(String pur_grp_cd){
        this.pur_grp_cd = pur_grp_cd;
    }

    @ElVoField(physicalName = "state_text")
    public String getState_text(){
        return state_text;
    }

    @ElVoField(physicalName = "state_text")
    public void setState_text(String state_text){
        this.state_text = state_text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurReqItemVo [");
        sb.append("inout_psn_clsf_cd").append("=").append(inout_psn_clsf_cd).append(",");
        sb.append("pur_req_no").append("=").append(pur_req_no).append(",");
        sb.append("item_nm").append("=").append(item_nm).append(",");
        sb.append("delvr_plc_nm").append("=").append(delvr_plc_nm).append(",");
        sb.append("delvr_demnd_daycnt").append("=").append(delvr_demnd_daycnt).append(",");
        sb.append("pur_clsf_cd").append("=").append(pur_clsf_cd).append(",");
        sb.append("pur_grp_cd").append("=").append(pur_grp_cd).append(",");
        sb.append("state_text").append("=").append(state_text);
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
