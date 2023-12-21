package kr.re.kitech.biz.xom.core.vo;

import com.inswave.elfw.annotation.ElDto;
import com.inswave.elfw.annotation.ElDtoField;
import com.inswave.elfw.annotation.ElVoField;
import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("elExcludeFilter")
@ElDto(FldYn = "", delimeterYn = "", logicalName = "메뉴정보 리스트(LDAP)")
public class CodeMapVo extends kr.re.kitech.biz.xom.base.model.BizCommVO {
    private static final long serialVersionUID = 1L;

    public CodeMapVo(){
    }

    @ElDtoField(logicalName = "그룹코드맵", physicalName = "codeMap", type = "Map", typeKind = "", fldYn = "", delimeterYn = "", cryptoGbn = "", cryptoKind = "", length = 0, dotLen = 0, baseValue = "", desc = "")
    private java.util.Map codeMap;

    @ElVoField(physicalName = "codeMap")
    public java.util.Map getCodeMap(){
        return codeMap;
    }

    @ElVoField(physicalName = "codeMap")
    public void setCodeMap(java.util.Map codeMap){
        this.codeMap = codeMap;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodeListVo [");
        sb.append("codeMap").append("=").append(codeMap);
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
