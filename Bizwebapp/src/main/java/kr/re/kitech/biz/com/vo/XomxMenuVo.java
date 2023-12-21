package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "업체조회")
public class XomxMenuVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public XomxMenuVo(){
    }

    @ElDtoField(logicalName = "화면ID", physicalName = "scrn_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scrn_id;

    @ElDtoField(logicalName = "문서ID", physicalName = "docu_id", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String docu_id;

    @ElDtoField(logicalName = "화면명", physicalName = "scrn_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String scrn_nm;

    @ElDtoField(logicalName = "문서명", physicalName = "docu_nm", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "", attr = "")
    private String docu_nm;

    @ElVoField(physicalName = "scrn_id")
    public String getScrn_id(){
        String ret = this.scrn_id;
        return ret;
    }

    @ElVoField(physicalName = "scrn_id")
    public void setScrn_id(String scrn_id){
        this.scrn_id = scrn_id;
    }

    @ElVoField(physicalName = "docu_id")
    public String getDocu_id(){
        String ret = this.docu_id;
        return ret;
    }

    @ElVoField(physicalName = "docu_id")
    public void setDocu_id(String docu_id){
        this.docu_id = docu_id;
    }

    @ElVoField(physicalName = "scrn_nm")
    public String getScrn_nm(){
        String ret = this.scrn_nm;
        return ret;
    }

    @ElVoField(physicalName = "scrn_nm")
    public void setScrn_nm(String scrn_nm){
        this.scrn_nm = scrn_nm;
    }

    @ElVoField(physicalName = "docu_nm")
    public String getDocu_nm(){
        String ret = this.docu_nm;
        return ret;
    }

    @ElVoField(physicalName = "docu_nm")
    public void setDocu_nm(String docu_nm){
        this.docu_nm = docu_nm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("XomxMenuVo [");
        sb.append("scrn_id").append("=").append(scrn_id).append(",");
        sb.append("docu_id").append("=").append(docu_id).append(",");
        sb.append("scrn_nm").append("=").append(scrn_nm).append(",");
        sb.append("docu_nm").append("=").append(docu_nm);
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
