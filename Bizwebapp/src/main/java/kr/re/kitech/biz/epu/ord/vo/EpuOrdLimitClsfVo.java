package kr.re.kitech.biz.epu.ord.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "발주계획 업종제한 Vo")
public class EpuOrdLimitClsfVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public EpuOrdLimitClsfVo(){
    }

    @ElDtoField(logicalName = "발주번호", physicalName = "bid_ord_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String bid_ord_no;

    @ElDtoField(logicalName = "변경순번", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElDtoField(logicalName = "순번", physicalName = "odr", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int odr;

    @ElDtoField(logicalName = "그룹", physicalName = "group_cd", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String group_cd;

    @ElDtoField(logicalName = "제한업종", physicalName = "vend_clsf_text", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String vend_clsf_text;

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

    @ElVoField(physicalName = "odr")
    public int getOdr(){
        return odr;
    }

    @ElVoField(physicalName = "odr")
    public void setOdr(int odr){
        this.odr = odr;
    }

    @ElVoField(physicalName = "group_cd")
    public String getGroup_cd(){
        return group_cd;
    }

    @ElVoField(physicalName = "group_cd")
    public void setGroup_cd(String group_cd){
        this.group_cd = group_cd;
    }

    @ElVoField(physicalName = "vend_clsf_text")
    public String getVend_clsf_text(){
        return vend_clsf_text;
    }

    @ElVoField(physicalName = "vend_clsf_text")
    public void setVend_clsf_text(String vend_clsf_text){
        this.vend_clsf_text = vend_clsf_text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EpuOrdLimitClsfVo [");
        sb.append("bid_ord_no").append("=").append(bid_ord_no).append(",");
        sb.append("chg_no").append("=").append(chg_no).append(",");
        sb.append("odr").append("=").append(odr).append(",");
        sb.append("group_cd").append("=").append(group_cd).append(",");
        sb.append("vend_clsf_text").append("=").append(vend_clsf_text);
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
