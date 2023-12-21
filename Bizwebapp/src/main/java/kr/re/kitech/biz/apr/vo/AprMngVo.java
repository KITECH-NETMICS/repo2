package kr.re.kitech.biz.apr.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "전자결재 관리자 Vo")
public class AprMngVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public AprMngVo(){
    }

    @ElDtoField(logicalName = "신청번호", physicalName = "name", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String name;

    @ElDtoField(logicalName = "bpm양식명", physicalName = "defname", type = "String", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private String defname;

    @ElVoField(physicalName = "name")
    public String getName(){
        return name;
    }

    @ElVoField(physicalName = "name")
    public void setName(String name){
        this.name = name;
    }

    @ElVoField(physicalName = "defname")
    public String getDefname(){
        return defname;
    }

    @ElVoField(physicalName = "defname")
    public void setDefname(String defname){
        this.defname = defname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AprMngVo [");
        sb.append("name").append("=").append(name).append(",");
        sb.append("defname").append("=").append(defname);
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
