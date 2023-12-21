package kr.re.kitech.biz.com.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "레포트출력 양식코드 Vo")
public class FormAliasVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public FormAliasVo(){
    }

    @ElDtoField(logicalName = "양식코드", physicalName = "formAlias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String formAlias;

    @ElDtoField(logicalName = "req_no", physicalName = "req_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String req_no;

    @ElDtoField(logicalName = "chg_no", physicalName = "chg_no", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String chg_no;

    @ElVoField(physicalName = "formAlias")
    public String getFormAlias(){
        return formAlias;
    }

    @ElVoField(physicalName = "formAlias")
    public void setFormAlias(String formAlias){
        this.formAlias = formAlias;
    }

    @ElVoField(physicalName = "req_no")
    public String getReq_no(){
        return req_no;
    }

    @ElVoField(physicalName = "req_no")
    public void setReq_no(String req_no){
        this.req_no = req_no;
    }

    @ElVoField(physicalName = "chg_no")
    public String getChg_no(){
        return chg_no;
    }

    @ElVoField(physicalName = "chg_no")
    public void setChg_no(String chg_no){
        this.chg_no = chg_no;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FormAliasVo [");
        sb.append("formAlias").append("=").append(formAlias).append(",");
        sb.append("req_no").append("=").append(req_no).append(",");
        sb.append("chg_no").append("=").append(chg_no);
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
