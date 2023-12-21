package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "대결상세 Vo")
public class AppvDelegatorDetailVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AppvDelegatorDetailVo(){
    }

    @ElDtoField(logicalName = "대결순번", physicalName = "dlgt_sn", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int dlgt_sn;

    @ElDtoField(logicalName = "순번", physicalName = "seq", type = "int", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private int seq;

    @ElDtoField(logicalName = "시스템개인번호", physicalName = "syspayno", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String syspayno;

    @ElDtoField(logicalName = "양식별칭", physicalName = "form_alias", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String form_alias;

    @ElDtoField(logicalName = "양식명", physicalName = "appname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String appname;

    @ElVoField(physicalName = "dlgt_sn")
    public int getDlgt_sn(){
        return dlgt_sn;
    }

    @ElVoField(physicalName = "dlgt_sn")
    public void setDlgt_sn(int dlgt_sn){
        this.dlgt_sn = dlgt_sn;
    }

    @ElVoField(physicalName = "seq")
    public int getSeq(){
        return seq;
    }

    @ElVoField(physicalName = "seq")
    public void setSeq(int seq){
        this.seq = seq;
    }

    @ElVoField(physicalName = "syspayno")
    public String getSyspayno(){
        return syspayno;
    }

    @ElVoField(physicalName = "syspayno")
    public void setSyspayno(String syspayno){
        this.syspayno = syspayno;
    }

    @ElVoField(physicalName = "form_alias")
    public String getForm_alias(){
        return form_alias;
    }

    @ElVoField(physicalName = "form_alias")
    public void setForm_alias(String form_alias){
        this.form_alias = form_alias;
    }

    @ElVoField(physicalName = "appname")
    public String getAppname(){
        return appname;
    }

    @ElVoField(physicalName = "appname")
    public void setAppname(String appname){
        this.appname = appname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppvDelegatorDetailVo [");
        sb.append("dlgt_sn").append("=").append(dlgt_sn).append(",");
        sb.append("seq").append("=").append(seq).append(",");
        sb.append("syspayno").append("=").append(syspayno).append(",");
        sb.append("form_alias").append("=").append(form_alias).append(",");
        sb.append("appname").append("=").append(appname);
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
